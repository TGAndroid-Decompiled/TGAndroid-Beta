package org.telegram.messenger;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Debug;
import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public class FileLog {
    private static volatile FileLog Instance = null;
    private static final int MAX_PENDING_PROTOCOL_DUMPS = 8;
    public static boolean databaseIsMalformed = false;
    private static long dumpedHeap = 0;
    private static fb.a exclusionStrategy = null;
    private static fb.g gson = null;
    private static volatile boolean gsonDisabled = false;
    private static final String mtproto_tag = "MTProto";
    private static final AtomicInteger pendingProtocolDumps = new AtomicInteger();
    private static HashSet<String> privateFields = null;
    private static final String tag = "tmessages";
    private boolean initied;
    private boolean initiing;
    private OutputStreamWriter streamWriter = null;
    private FastDateFormat dateFormat = null;
    private FastDateFormat fileDateFormat = null;
    private DispatchQueue2 logQueue = null;
    private File currentFile = null;
    private File networkFile = null;
    private File tonlibFile = null;
    private OutputStreamWriter tlStreamWriter = null;
    private File tlRequestsFile = null;

    public static class ByteArrayHexAdapter extends fb.u {
        @Override
        public byte[] read(nb.a aVar) {
            String v = aVar.v();
            int length = v.length();
            byte[] bArr = new byte[length / 2];
            for (int i10 = 0; i10 < length; i10 += 2) {
                bArr[i10 / 2] = (byte) (Character.digit(v.charAt(i10 + 1), 16) + (Character.digit(v.charAt(i10), 16) << 4));
            }
            return bArr;
        }

        @Override
        public void write(nb.b bVar, byte[] bArr) {
            if (bArr == null) {
                bVar.i();
                return;
            }
            StringBuilder sb2 = new StringBuilder((bArr.length * 2) + 2);
            sb2.append("0x");
            int length = bArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                sb2.append(String.format("%02x", Integer.valueOf(bArr[i10] & 255)));
            }
            bVar.r(sb2.toString());
        }
    }

    public static class IgnoreSentException extends Exception {
        public IgnoreSentException(String str) {
            super(str);
        }
    }

    public static class TLObjectDeserializer implements fb.o {
        private TLObjectDeserializer() {
        }

        @Override
        public fb.i serialize(TLObject tLObject, Type type, fb.n nVar) {
            Field[] fields;
            fb.l lVar = new fb.l();
            String name = tLObject.getClass().getName();
            if (name.startsWith("org.telegram.tgnet.")) {
                name = name.substring(19);
            }
            lVar.n("_", name == null ? fb.k.f10396a : new fb.m(name));
            try {
                for (Field field : tLObject.getClass().getFields()) {
                    if (FileLog.privateFields == null || !FileLog.privateFields.contains(field.getName())) {
                        field.setAccessible(true);
                        try {
                            Object obj = field.get(tLObject);
                            if (!(obj instanceof NativeByteBuffer)) {
                                if (obj != null) {
                                    Class<?> cls = obj.getClass();
                                    if (!cls.isInstance(DispatchQueue.class)) {
                                        if (!cls.isInstance(org.telegram.ui.Components.g6.class)) {
                                            if (!cls.isInstance(ColorStateList.class)) {
                                                if (cls.isInstance(Context.class)) {
                                                }
                                            }
                                        }
                                    }
                                }
                                lVar.n(field.getName(), ((rb.c) nVar).q(obj));
                            }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return lVar;
        }
    }

    private FileLog() {
    }

    private static void checkGson() {
        boolean z10;
        if (gson == null) {
            HashSet<String> hashSet = new HashSet<>();
            privateFields = hashSet;
            hashSet.add("message");
            privateFields.add("phone");
            privateFields.add("about");
            privateFields.add("status_text");
            privateFields.add("bytes");
            privateFields.add("secret");
            privateFields.add("stripped_thumb");
            privateFields.add("strippedBitmap");
            privateFields.add("networkType");
            privateFields.add("disableFree");
            privateFields.add("mContext");
            privateFields.add("priority");
            privateFields.add("constructor");
            privateFields.add("constructorName");
            privateFields.add("parentRichText");
            privateFields.add("parentBlock");
            for (int i10 = 0; i10 < 32; i10++) {
                HashSet<String> hashSet2 = privateFields;
                hashSet2.add("FLAG_" + i10);
            }
            exclusionStrategy = new fb.a() {
                @Override
                public boolean shouldSkipClass(Class<?> cls) {
                    if (!NativeByteBuffer.class.isAssignableFrom(cls) && !cls.isInstance(DispatchQueue.class) && !cls.isInstance(org.telegram.ui.Components.g6.class) && !cls.isInstance(ColorStateList.class) && !cls.isInstance(Context.class)) {
                        return false;
                    }
                    return true;
                }

                @Override
                public boolean shouldSkipField(fb.b bVar) {
                    HashSet hashSet3 = FileLog.privateFields;
                    Field field = bVar.f10380a;
                    Field field2 = bVar.f10380a;
                    if (!hashSet3.contains(field.getName())) {
                        if (!"message".equalsIgnoreCase(field2.getName()) || !String.class.equals(field2.getGenericType())) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
            };
            hb.g gVar = hb.g.f12736c;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            fb.c cVar = fb.g.h;
            fb.p pVar = fb.g.f10388i;
            fb.q qVar = fb.g.f10389j;
            ArrayDeque arrayDeque = new ArrayDeque();
            fb.a aVar = exclusionStrategy;
            Objects.requireNonNull(aVar);
            hb.g clone = gVar.clone();
            ArrayList arrayList3 = new ArrayList(gVar.f12737a);
            clone.f12737a = arrayList3;
            arrayList3.add(aVar);
            ByteArrayHexAdapter byteArrayHexAdapter = new ByteArrayHexAdapter();
            boolean z11 = byteArrayHexAdapter instanceof fb.o;
            if (!fb.i.class.isAssignableFrom(byte[].class)) {
                if (z11) {
                    mb.a aVar2 = new mb.a(byte[].class);
                    if (aVar2.f18408b == aVar2.f18407a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new ib.z(byteArrayHexAdapter, aVar2, z10, null));
                }
                mb.a aVar3 = new mb.a(byte[].class);
                ib.x0 x0Var = ib.h1.f13923a;
                arrayList.add(new ib.x0(aVar3, byteArrayHexAdapter, 2));
                RuntimeClassNameTypeAdapterFactory of2 = RuntimeClassNameTypeAdapterFactory.of(TLObject.class, "type_", exclusionStrategy);
                Objects.requireNonNull(of2);
                arrayList.add(of2);
                TLObjectDeserializer tLObjectDeserializer = new TLObjectDeserializer();
                if (!fb.i.class.isAssignableFrom(TLObject.class)) {
                    arrayList2.add(new ib.z(tLObjectDeserializer, null, false, TLObject.class));
                    ArrayList arrayList4 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
                    arrayList4.addAll(arrayList);
                    Collections.reverse(arrayList4);
                    ArrayList arrayList5 = new ArrayList(arrayList2);
                    Collections.reverse(arrayList5);
                    arrayList4.addAll(arrayList5);
                    boolean z12 = lb.f.f16964a;
                    gson = new fb.g(clone, new HashMap(hashMap), cVar, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList4, pVar, qVar, new ArrayList(arrayDeque));
                    return;
                }
                throw new IllegalArgumentException("Cannot override built-in adapter for " + TLObject.class);
            }
            throw new IllegalArgumentException("Cannot override built-in adapter for " + byte[].class);
        }
    }

    public static void cleanupLogs() {
        File[] listFiles;
        ensureInitied();
        File logsDir = AndroidUtilities.getLogsDir();
        if (logsDir != null && (listFiles = logsDir.listFiles()) != null) {
            for (File file : listFiles) {
                if ((getInstance().currentFile == null || !file.getAbsolutePath().equals(getInstance().currentFile.getAbsolutePath())) && ((getInstance().networkFile == null || !file.getAbsolutePath().equals(getInstance().networkFile.getAbsolutePath())) && (getInstance().tonlibFile == null || !file.getAbsolutePath().equals(getInstance().tonlibFile.getAbsolutePath())))) {
                    file.delete();
                }
            }
        }
    }

    public static void disableGson(boolean z10) {
        gsonDisabled = z10;
    }

    public static void dumpANR() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                StackTraceElement[] value = next.getValue();
                sb2.append("Thread: ");
                sb2.append(next.getKey().getName());
                sb2.append("\n");
                for (StackTraceElement stackTraceElement : value) {
                    sb2.append("\tat ");
                    sb2.append(stackTraceElement);
                    sb2.append("\n");
                }
                sb2.append("\n\n");
            } else {
                e("ANR thread dump\n" + sb2.toString());
                getInstance().dumpMemory(false);
                return;
            }
        }
    }

    public static void dumpResponseAndRequest(final int i10, final TLObject tLObject, final TLObject tLObject2, final TLRPC.TL_error tL_error, final long j10, long j11, final int i11) {
        boolean z10;
        if (BuildVars.DEBUG_PRIVATE_VERSION && BuildVars.LOGS_ENABLED && tLObject != null) {
            final String simpleName = tLObject.getClass().getSimpleName();
            if (tL_error != null || (!"TL_upload_getFile".equals(simpleName) && !"TL_upload_getWebFile".equals(simpleName))) {
                final long currentTimeMillis = System.currentTimeMillis();
                final long j12 = currentTimeMillis - j11;
                if (tL_error != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                final boolean z11 = z10;
                postProtocolDump(new Runnable() {
                    @Override
                    public final void run() {
                        FileLog.lambda$dumpResponseAndRequest$1(simpleName, tLObject, tLObject2, tL_error, j10, j12, i11, i10, currentTimeMillis, z11);
                    }
                });
            }
        }
    }

    public static void dumpUnparsedMessage(TLObject tLObject, long j10, int i10) {
        if (BuildVars.DEBUG_PRIVATE_VERSION && BuildVars.LOGS_ENABLED && tLObject != null) {
            postProtocolDump(new c5(tLObject, gsonDisabled, System.currentTimeMillis(), j10, i10));
        }
    }

    public static void ensureInitied() {
        getInstance().init();
    }

    public static void fatal(Throwable th2) {
        fatal(th2, true);
    }

    public static FileLog getInstance() {
        FileLog fileLog;
        FileLog fileLog2 = Instance;
        if (fileLog2 == null) {
            synchronized (FileLog.class) {
                try {
                    fileLog = Instance;
                    if (fileLog == null) {
                        fileLog = new FileLog();
                        Instance = fileLog;
                        if (BuildVars.LOGS_ENABLED) {
                            fileLog.init();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileLog;
        }
        return fileLog2;
    }

    public static String getNetworkLogPath() {
        if (!BuildVars.LOGS_ENABLED) {
            return "";
        }
        try {
            File logsDir = AndroidUtilities.getLogsDir();
            if (logsDir == null) {
                return "";
            }
            FileLog fileLog = getInstance();
            fileLog.networkFile = new File(logsDir, getInstance().fileDateFormat.format(System.currentTimeMillis()) + "_net.txt");
            return getInstance().networkFile.getAbsolutePath();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    public static String getTonlibLogPath() {
        if (!BuildVars.LOGS_ENABLED) {
            return "";
        }
        try {
            File logsDir = AndroidUtilities.getLogsDir();
            if (logsDir == null) {
                return "";
            }
            FileLog fileLog = getInstance();
            fileLog.tonlibFile = new File(logsDir, getInstance().dateFormat.format(System.currentTimeMillis()) + "_tonlib.txt");
            return getInstance().tonlibFile.getAbsolutePath();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    private void init() {
        File logsDir;
        if (!this.initied) {
            this.initiing = true;
            Locale locale = Locale.US;
            this.dateFormat = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss.SSS", locale);
            FastDateFormat fastDateFormat = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss", locale);
            this.fileDateFormat = fastDateFormat;
            String format = fastDateFormat.format(System.currentTimeMillis());
            try {
                logsDir = AndroidUtilities.getLogsDir();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (logsDir == null) {
                return;
            }
            this.currentFile = new File(logsDir, format + ".txt");
            this.tlRequestsFile = new File(logsDir, format + "_mtproto.txt");
            try {
                this.logQueue = new DispatchQueue2("logQueue");
                this.currentFile.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.currentFile));
                this.streamWriter = outputStreamWriter;
                outputStreamWriter.write("-----start log " + format + "-----\n");
                this.streamWriter.flush();
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(this.tlRequestsFile));
                this.tlStreamWriter = outputStreamWriter2;
                outputStreamWriter2.write("-----start log " + format + "-----\n");
                this.tlStreamWriter.flush();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.initied = true;
        }
    }

    public static void lambda$d$7(String str) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " D/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            if (AndroidUtilities.isENOSPC(e)) {
                LaunchActivity.E(1);
            }
        }
    }

    public static void lambda$dumpResponseAndRequest$1(String str, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error, long j10, long j11, int i10, int i11, long j12, boolean z10) {
        String str2;
        int i12;
        checkGson();
        StringBuilder v = a1.g.v("req -> ", str, " : ");
        v.append(gson.e(tLObject));
        String sb2 = v.toString();
        if (tLObject2 != null) {
            str2 = "res -> " + tLObject2.getClass().getSimpleName() + " : " + gson.e(tLObject2);
        } else if (tL_error != null) {
            str2 = "err -> " + tL_error.getClass().getSimpleName() + " : " + gson.e(tL_error);
        } else {
            str2 = "null";
        }
        try {
            String str3 = "requestMsgId=" + j10 + " requestingTime=" + j11 + " request_token=" + i10 + " account=" + i11;
            FileLog fileLog = getInstance();
            fileLog.tlStreamWriter.write(fileLog.dateFormat.format(j12) + " " + str3);
            fileLog.tlStreamWriter.write("\n");
            fileLog.tlStreamWriter.write(sb2);
            fileLog.tlStreamWriter.write("\n");
            fileLog.tlStreamWriter.write(str2);
            fileLog.tlStreamWriter.write("\n\n");
            fileLog.tlStreamWriter.flush();
            if (z10) {
                i12 = 6;
            } else {
                i12 = 3;
            }
            Log.println(i12, "MTProto", str3);
            Log.println(i12, "MTProto", sb2);
            Log.println(i12, "MTProto", str2);
            Log.println(i12, "MTProto", " ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lambda$dumpUnparsedMessage$2(TLObject tLObject, boolean z10, long j10, long j11, int i10) {
        checkGson();
        StringBuilder sb2 = new StringBuilder("receive message -> ");
        sb2.append(tLObject.getClass().getSimpleName());
        sb2.append(" : ");
        String str = tLObject;
        if (!z10) {
            str = gson.e(tLObject);
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        try {
            FileLog fileLog = getInstance();
            fileLog.tlStreamWriter.write(fileLog.dateFormat.format(j10) + " msgId=" + j11 + " account=" + i10);
            fileLog.tlStreamWriter.write("\n");
            fileLog.tlStreamWriter.write(sb3);
            fileLog.tlStreamWriter.write("\n\n");
            fileLog.tlStreamWriter.flush();
            Log.d("MTProto", "msgId=" + j11 + " account=" + i10);
            Log.d("MTProto", sb3);
            Log.d("MTProto", " ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lambda$e$3(String str, Throwable th2) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + str + "\n");
            getInstance().streamWriter.write(th2.toString());
            StackTraceElement[] stackTrace = th2.getStackTrace();
            for (int i10 = 0; i10 < stackTrace.length; i10++) {
                OutputStreamWriter outputStreamWriter2 = getInstance().streamWriter;
                outputStreamWriter2.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i10] + "\n");
            }
            getInstance().streamWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lambda$e$4(String str) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lambda$e$5(Throwable th2) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + th2 + "\n");
            StackTraceElement[] stackTrace = th2.getStackTrace();
            for (int i10 = 0; i10 < stackTrace.length; i10++) {
                OutputStreamWriter outputStreamWriter2 = getInstance().streamWriter;
                outputStreamWriter2.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i10] + "\n");
            }
            Throwable cause = th2.getCause();
            if (cause != null) {
                OutputStreamWriter outputStreamWriter3 = getInstance().streamWriter;
                outputStreamWriter3.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                StackTraceElement[] stackTrace2 = cause.getStackTrace();
                for (int i11 = 0; i11 < stackTrace2.length; i11++) {
                    OutputStreamWriter outputStreamWriter4 = getInstance().streamWriter;
                    outputStreamWriter4.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace2[i11] + "\n");
                }
            }
            getInstance().streamWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lambda$fatal$6(Throwable th2) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " FATAL/tmessages: " + th2 + "\n");
            StackTraceElement[] stackTrace = th2.getStackTrace();
            for (int i10 = 0; i10 < stackTrace.length; i10++) {
                OutputStreamWriter outputStreamWriter2 = getInstance().streamWriter;
                outputStreamWriter2.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " FATAL/tmessages: \tat " + stackTrace[i10] + "\n");
            }
            Throwable cause = th2.getCause();
            if (cause != null) {
                OutputStreamWriter outputStreamWriter3 = getInstance().streamWriter;
                outputStreamWriter3.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                StackTraceElement[] stackTrace2 = cause.getStackTrace();
                for (int i11 = 0; i11 < stackTrace2.length; i11++) {
                    OutputStreamWriter outputStreamWriter4 = getInstance().streamWriter;
                    outputStreamWriter4.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace2[i11] + "\n");
                }
            }
            getInstance().streamWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            System.exit(2);
        }
    }

    public static void lambda$postProtocolDump$0(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public static void lambda$w$8(String str) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " W/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean needSent(Throwable th2) {
        if (!(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof IgnoreSentException)) {
            return true;
        }
        return false;
    }

    private static void postProtocolDump(Runnable runnable) {
        AtomicInteger atomicInteger = pendingProtocolDumps;
        if (atomicInteger.incrementAndGet() > 8) {
            atomicInteger.decrementAndGet();
            return;
        }
        try {
            DispatchQueue2 dispatchQueue2 = getInstance().logQueue;
            if (dispatchQueue2 == null) {
                atomicInteger.decrementAndGet();
            } else {
                dispatchQueue2.postRunnable(new k3(0, runnable));
            }
        } catch (Throwable th2) {
            pendingProtocolDumps.decrementAndGet();
            Log.e("tmessages", "Unable to queue protocol dump", th2);
        }
    }

    public static void w(String str) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.w("tmessages", str);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new y1(str, 1));
            }
        }
    }

    public void dumpMemory(boolean z10) {
        if (!z10 && System.currentTimeMillis() - dumpedHeap < 30000) {
            return;
        }
        dumpedHeap = System.currentTimeMillis();
        try {
            File logsDir = AndroidUtilities.getLogsDir();
            Debug.dumpHprofData(new File(logsDir, getInstance().dateFormat.format(System.currentTimeMillis()) + "_heap.hprof").getAbsolutePath());
        } catch (Exception e) {
            e(e);
        }
    }

    public static void d(String str) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.d("tmessages", str);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new y1(str, 3));
            }
        }
    }

    public static void e(String str, Throwable th2) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.e("tmessages", str, th2);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new k2(6, str, th2));
            }
        }
    }

    public static void fatal(Throwable th2, boolean z10) {
        if (BuildVars.LOGS_ENABLED) {
            if (th2 instanceof OutOfMemoryError) {
                getInstance().dumpMemory(false);
            }
            if (z10 && BuildVars.DEBUG_VERSION && needSent(th2)) {
                AndroidUtilities.appCenterLog(th2);
            }
            ensureInitied();
            th2.printStackTrace();
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new l3(1, th2));
                return;
            }
            th2.printStackTrace();
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                System.exit(2);
            }
        }
    }

    public static void e(String str) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.e("tmessages", str);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new y1(str, 2));
            }
        }
    }

    public static void e(Throwable th2) {
        e(th2, true);
    }

    public static void e(Throwable th2, boolean z10) {
        if (BuildVars.LOGS_ENABLED) {
            if (BuildVars.DEBUG_VERSION && needSent(th2) && z10) {
                AndroidUtilities.appCenterLog(th2);
            }
            if (BuildVars.DEBUG_VERSION && th2.getMessage() != null && th2.getMessage().contains("disk image is malformed") && !databaseIsMalformed) {
                d("copy malformed files");
                databaseIsMalformed = true;
                File file = new File(ApplicationLoader.getFilesDirFixed(), "malformed_database/");
                file.mkdirs();
                ArrayList<File> databaseFiles = MessagesStorage.getInstance(UserConfig.selectedAccount).getDatabaseFiles();
                for (int i10 = 0; i10 < databaseFiles.size(); i10++) {
                    try {
                        AndroidUtilities.copyFile(databaseFiles.get(i10), new File(file, databaseFiles.get(i10).getName()));
                    } catch (IOException e) {
                        e(e);
                    }
                }
            }
            ensureInitied();
            th2.printStackTrace();
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new l3(0, th2));
            } else {
                th2.printStackTrace();
            }
        }
    }
}
