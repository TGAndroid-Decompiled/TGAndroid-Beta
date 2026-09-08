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
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public class FileLog {
    private static volatile FileLog Instance = null;
    public static boolean databaseIsMalformed = false;
    private static long dumpedHeap = 0;
    private static HashSet<String> excludeRequests = null;
    private static db.a exclusionStrategy = null;
    private static db.g gson = null;
    private static boolean gsonDisabled = false;
    private static final String mtproto_tag = "MTProto";
    private static HashSet<String> privateFields = null;
    private static final String tag = "tmessages";
    private boolean initied;
    private boolean initiing;
    private OutputStreamWriter streamWriter = null;
    private FastDateFormat dateFormat = null;
    private FastDateFormat fileDateFormat = null;
    private DispatchQueue logQueue = null;
    private File currentFile = null;
    private File networkFile = null;
    private File tonlibFile = null;
    private OutputStreamWriter tlStreamWriter = null;
    private File tlRequestsFile = null;

    public static class ByteArrayHexAdapter extends db.u {
        @Override
        public byte[] read(lb.a aVar) {
            String v = aVar.v();
            int length = v.length();
            byte[] bArr = new byte[length / 2];
            for (int i10 = 0; i10 < length; i10 += 2) {
                bArr[i10 / 2] = (byte) (Character.digit(v.charAt(i10 + 1), 16) + (Character.digit(v.charAt(i10), 16) << 4));
            }
            return bArr;
        }

        @Override
        public void write(lb.b bVar, byte[] bArr) {
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

    public static class TLObjectDeserializer implements db.o {
        private TLObjectDeserializer() {
        }

        @Override
        public db.i serialize(TLObject tLObject, Type type, db.n nVar) {
            Field[] fields;
            db.l lVar = new db.l();
            String name = tLObject.getClass().getName();
            if (name.startsWith("org.telegram.tgnet.")) {
                name = name.substring(19);
            }
            lVar.o("_", name == null ? db.k.f6709a : new db.m(name));
            try {
                for (Field field : tLObject.getClass().getFields()) {
                    if (FileLog.privateFields == null || !FileLog.privateFields.contains(field.getName())) {
                        field.setAccessible(true);
                        try {
                            Object obj = field.get(tLObject);
                            if (obj != null) {
                                Class<?> cls = obj.getClass();
                                if (!cls.isInstance(DispatchQueue.class)) {
                                    if (!cls.isInstance(org.telegram.ui.Components.d6.class)) {
                                        if (!cls.isInstance(ColorStateList.class)) {
                                            if (cls.isInstance(Context.class)) {
                                            }
                                        }
                                    }
                                }
                            }
                            lVar.o(field.getName(), ((a4.m) nVar).k0(obj));
                        } catch (IllegalAccessException e7) {
                            e7.printStackTrace();
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
            HashSet<String> hashSet3 = new HashSet<>();
            excludeRequests = hashSet3;
            hashSet3.add("TL_upload_getFile");
            excludeRequests.add("TL_upload_getWebFile");
            exclusionStrategy = new db.a() {
                @Override
                public boolean shouldSkipClass(Class<?> cls) {
                    if (!cls.isInstance(DispatchQueue.class) && !cls.isInstance(org.telegram.ui.Components.d6.class) && !cls.isInstance(ColorStateList.class) && !cls.isInstance(Context.class)) {
                        return false;
                    }
                    return true;
                }

                @Override
                public boolean shouldSkipField(db.b bVar) {
                    HashSet hashSet4 = FileLog.privateFields;
                    Field field = bVar.f6692a;
                    Field field2 = bVar.f6692a;
                    if (!hashSet4.contains(field.getName())) {
                        if (!"message".equalsIgnoreCase(field2.getName()) || !String.class.equals(field2.getGenericType())) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
            };
            fb.f fVar = fb.f.f9455c;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            db.c cVar = db.g.h;
            db.p pVar = db.g.f6700i;
            db.q qVar = db.g.f6701j;
            ArrayDeque arrayDeque = new ArrayDeque();
            db.a aVar = exclusionStrategy;
            Objects.requireNonNull(aVar);
            fb.f clone = fVar.clone();
            ArrayList arrayList3 = new ArrayList(fVar.f9456a);
            clone.f9456a = arrayList3;
            arrayList3.add(aVar);
            ByteArrayHexAdapter byteArrayHexAdapter = new ByteArrayHexAdapter();
            boolean z11 = byteArrayHexAdapter instanceof db.o;
            if (!db.i.class.isAssignableFrom(byte[].class)) {
                if (z11) {
                    kb.a aVar2 = new kb.a(byte[].class);
                    if (aVar2.f14915b == aVar2.f14914a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new gb.z(byteArrayHexAdapter, aVar2, z10, null));
                }
                kb.a aVar3 = new kb.a(byte[].class);
                gb.x0 x0Var = gb.h1.f10544a;
                arrayList.add(new gb.x0(aVar3, byteArrayHexAdapter, 2));
                RuntimeClassNameTypeAdapterFactory of2 = RuntimeClassNameTypeAdapterFactory.of(TLObject.class, "type_", exclusionStrategy);
                Objects.requireNonNull(of2);
                arrayList.add(of2);
                TLObjectDeserializer tLObjectDeserializer = new TLObjectDeserializer();
                if (!db.i.class.isAssignableFrom(TLObject.class)) {
                    arrayList2.add(new gb.z(tLObjectDeserializer, null, false, TLObject.class));
                    ArrayList arrayList4 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
                    arrayList4.addAll(arrayList);
                    Collections.reverse(arrayList4);
                    ArrayList arrayList5 = new ArrayList(arrayList2);
                    Collections.reverse(arrayList5);
                    arrayList4.addAll(arrayList5);
                    boolean z12 = jb.f.f13618a;
                    gson = new db.g(clone, new HashMap(hashMap), cVar, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList4, pVar, qVar, new ArrayList(arrayDeque));
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

    public static void dumpResponseAndRequest(final int i10, TLObject tLObject, TLObject tLObject2, final TLRPC.TL_error tL_error, final long j3, final long j10, final int i11) {
        if (BuildVars.DEBUG_PRIVATE_VERSION && BuildVars.LOGS_ENABLED && tLObject != null) {
            String simpleName = tLObject.getClass().getSimpleName();
            checkGson();
            if (!excludeRequests.contains(simpleName) || tL_error != null) {
                try {
                    final String str = "req -> " + simpleName + " : " + gson.e(tLObject);
                    String str2 = "null";
                    if (tLObject2 != null) {
                        str2 = "res -> " + tLObject2.getClass().getSimpleName() + " : " + gson.e(tLObject2);
                    } else if (tL_error != null) {
                        str2 = "err -> " + tL_error.getClass().getSimpleName() + " : " + gson.e(tL_error);
                    }
                    final String str3 = str2;
                    final long currentTimeMillis = System.currentTimeMillis();
                    getInstance().logQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            FileLog.lambda$dumpResponseAndRequest$0(j3, j10, i11, i10, currentTimeMillis, str, str3, tL_error);
                        }
                    });
                } catch (Throwable th2) {
                    e(th2, BuildVars.DEBUG_PRIVATE_VERSION);
                }
            }
        }
    }

    public static void dumpUnparsedMessage(TLObject tLObject, long j3, int i10) {
        if (BuildVars.DEBUG_PRIVATE_VERSION && BuildVars.LOGS_ENABLED && tLObject != null) {
            try {
                checkGson();
                getInstance().dateFormat.format(System.currentTimeMillis());
                StringBuilder sb2 = new StringBuilder("receive message -> ");
                sb2.append(tLObject.getClass().getSimpleName());
                sb2.append(" : ");
                sb2.append(gsonDisabled ? tLObject : gson.e(tLObject));
                getInstance().logQueue.postRunnable(new w4(System.currentTimeMillis(), j3, i10, sb2.toString()));
            } catch (Throwable unused) {
            }
        }
    }

    public static void e(String str, Throwable th2) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.e("tmessages", str, th2);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new b2(7, str, th2));
            }
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
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            if (logsDir == null) {
                return;
            }
            this.currentFile = new File(logsDir, format + ".txt");
            this.tlRequestsFile = new File(logsDir, format + "_mtproto.txt");
            try {
                this.logQueue = new DispatchQueue("logQueue");
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

    public static void lambda$d$6(String str) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " D/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e7) {
            e7.printStackTrace();
            if (AndroidUtilities.isENOSPC(e7)) {
                LaunchActivity.E(1);
            }
        }
    }

    public static void lambda$dumpResponseAndRequest$0(long j3, long j10, int i10, int i11, long j11, String str, String str2, TLRPC.TL_error tL_error) {
        try {
            String str3 = "requestMsgId=" + j3 + " requestingTime=" + (System.currentTimeMillis() - j10) + " request_token=" + i10 + " account=" + i11;
            getInstance().tlStreamWriter.write(getInstance().dateFormat.format(j11) + " " + str3);
            getInstance().tlStreamWriter.write("\n");
            getInstance().tlStreamWriter.write(str);
            getInstance().tlStreamWriter.write("\n");
            getInstance().tlStreamWriter.write(str2);
            getInstance().tlStreamWriter.write("\n\n");
            getInstance().tlStreamWriter.flush();
            if (tL_error != null) {
                Log.e("MTProto", str3);
                Log.e("MTProto", str);
                Log.e("MTProto", str2);
                Log.e("MTProto", " ");
                return;
            }
            Log.d("MTProto", str3);
            Log.d("MTProto", str);
            Log.d("MTProto", str2);
            Log.d("MTProto", " ");
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public static void lambda$dumpUnparsedMessage$1(long j3, long j10, int i10, String str) {
        try {
            getInstance().tlStreamWriter.write(getInstance().dateFormat.format(j3) + " msgId=" + j10 + " account=" + i10);
            getInstance().tlStreamWriter.write("\n");
            getInstance().tlStreamWriter.write(str);
            getInstance().tlStreamWriter.write("\n\n");
            getInstance().tlStreamWriter.flush();
            Log.d("MTProto", "msgId=" + j10 + " account=" + i10);
            Log.d("MTProto", str);
            Log.d("MTProto", " ");
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public static void lambda$e$2(String str, Throwable th2) {
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
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public static void lambda$e$3(String str) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public static void lambda$e$4(Throwable th2) {
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
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public static void lambda$fatal$5(Throwable th2) {
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
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            System.exit(2);
        }
    }

    public static void lambda$w$7(String str) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " W/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    private static boolean needSent(Throwable th2) {
        if (!(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof IgnoreSentException)) {
            return true;
        }
        return false;
    }

    public static void w(String str) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.w("tmessages", str);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new s1(str, 1));
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
        } catch (Exception e7) {
            e(e7);
        }
    }

    public static void d(String str) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.d("tmessages", str);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new s1(str, 3));
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
                getInstance().logQueue.postRunnable(new e3(1, th2));
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
                getInstance().logQueue.postRunnable(new s1(str, 2));
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
                    } catch (IOException e7) {
                        e(e7);
                    }
                }
            }
            ensureInitied();
            th2.printStackTrace();
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new e3(0, th2));
            } else {
                th2.printStackTrace();
            }
        }
    }
}
