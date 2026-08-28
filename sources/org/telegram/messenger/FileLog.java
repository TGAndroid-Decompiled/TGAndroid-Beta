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
    private static la.a exclusionStrategy = null;
    private static la.g gson = null;
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

    public static class ByteArrayHexAdapter extends la.u {
        @Override
        public byte[] read(ta.a aVar) {
            String v = aVar.v();
            int length = v.length();
            byte[] bArr = new byte[length / 2];
            for (int i9 = 0; i9 < length; i9 += 2) {
                bArr[i9 / 2] = (byte) (Character.digit(v.charAt(i9 + 1), 16) + (Character.digit(v.charAt(i9), 16) << 4));
            }
            return bArr;
        }

        @Override
        public void write(ta.c cVar, byte[] bArr) {
            if (bArr == null) {
                cVar.i();
                return;
            }
            StringBuilder sb2 = new StringBuilder((bArr.length * 2) + 2);
            sb2.append("0x");
            int length = bArr.length;
            for (int i9 = 0; i9 < length; i9++) {
                sb2.append(String.format("%02x", Integer.valueOf(bArr[i9] & 255)));
            }
            cVar.r(sb2.toString());
        }
    }

    public static class IgnoreSentException extends Exception {
        public IgnoreSentException(String str) {
            super(str);
        }
    }

    public static class TLObjectDeserializer implements la.o {
        private TLObjectDeserializer() {
        }

        @Override
        public la.i serialize(TLObject tLObject, Type type, la.n nVar) {
            Field[] fields;
            la.l lVar = new la.l();
            String name = tLObject.getClass().getName();
            if (name.startsWith("org.telegram.tgnet.")) {
                name = name.substring(19);
            }
            lVar.o("_", name == null ? la.k.f16726a : new la.m(name));
            try {
                for (Field field : tLObject.getClass().getFields()) {
                    if (FileLog.privateFields == null || !FileLog.privateFields.contains(field.getName())) {
                        field.setAccessible(true);
                        try {
                            Object obj = field.get(tLObject);
                            if (obj != null) {
                                Class<?> cls = obj.getClass();
                                if (!cls.isInstance(DispatchQueue.class)) {
                                    if (!cls.isInstance(org.telegram.ui.Components.x5.class)) {
                                        if (!cls.isInstance(ColorStateList.class)) {
                                            if (cls.isInstance(Context.class)) {
                                            }
                                        }
                                    }
                                }
                            }
                            lVar.o(field.getName(), ((n5.a0) nVar).j(obj));
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
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
            for (int i9 = 0; i9 < 32; i9++) {
                HashSet<String> hashSet2 = privateFields;
                hashSet2.add("FLAG_" + i9);
            }
            HashSet<String> hashSet3 = new HashSet<>();
            excludeRequests = hashSet3;
            hashSet3.add("TL_upload_getFile");
            excludeRequests.add("TL_upload_getWebFile");
            exclusionStrategy = new la.a() {
                @Override
                public boolean shouldSkipClass(Class<?> cls) {
                    if (!cls.isInstance(DispatchQueue.class) && !cls.isInstance(org.telegram.ui.Components.x5.class) && !cls.isInstance(ColorStateList.class) && !cls.isInstance(Context.class)) {
                        return false;
                    }
                    return true;
                }

                @Override
                public boolean shouldSkipField(la.b bVar) {
                    HashSet hashSet4 = FileLog.privateFields;
                    Field field = bVar.f16709a;
                    Field field2 = bVar.f16709a;
                    if (!hashSet4.contains(field.getName())) {
                        if (!"message".equalsIgnoreCase(field2.getName()) || !String.class.equals(field2.getGenericType())) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
            };
            na.g gVar = na.g.f18535c;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            la.c cVar = la.g.h;
            la.p pVar = la.g.f16717i;
            la.q qVar = la.g.f16718j;
            ArrayDeque arrayDeque = new ArrayDeque();
            la.a aVar = exclusionStrategy;
            Objects.requireNonNull(aVar);
            na.g clone = gVar.clone();
            ArrayList arrayList3 = new ArrayList(gVar.f18536a);
            clone.f18536a = arrayList3;
            arrayList3.add(aVar);
            ByteArrayHexAdapter byteArrayHexAdapter = new ByteArrayHexAdapter();
            boolean z11 = byteArrayHexAdapter instanceof la.o;
            if (!la.i.class.isAssignableFrom(byte[].class)) {
                if (z11) {
                    sa.a aVar2 = new sa.a(byte[].class);
                    if (aVar2.f47503b == aVar2.f47502a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new oa.z(byteArrayHexAdapter, aVar2, z10, null));
                }
                sa.a aVar3 = new sa.a(byte[].class);
                oa.x0 x0Var = oa.h1.f19125a;
                arrayList.add(new oa.x0(aVar3, byteArrayHexAdapter, 2));
                RuntimeClassNameTypeAdapterFactory of2 = RuntimeClassNameTypeAdapterFactory.of(TLObject.class, "type_", exclusionStrategy);
                Objects.requireNonNull(of2);
                arrayList.add(of2);
                TLObjectDeserializer tLObjectDeserializer = new TLObjectDeserializer();
                if (!la.i.class.isAssignableFrom(TLObject.class)) {
                    arrayList2.add(new oa.z(tLObjectDeserializer, null, false, TLObject.class));
                    ArrayList arrayList4 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
                    arrayList4.addAll(arrayList);
                    Collections.reverse(arrayList4);
                    ArrayList arrayList5 = new ArrayList(arrayList2);
                    Collections.reverse(arrayList5);
                    arrayList4.addAll(arrayList5);
                    boolean z12 = ra.f.f47105a;
                    gson = new la.g(clone, new HashMap(hashMap), cVar, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList4, pVar, qVar, new ArrayList(arrayDeque));
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

    public static void dumpResponseAndRequest(final int i9, TLObject tLObject, TLObject tLObject2, final TLRPC.TL_error tL_error, final long j10, final long j11, final int i10) {
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
                            FileLog.lambda$dumpResponseAndRequest$0(j10, j11, i10, i9, currentTimeMillis, str, str3, tL_error);
                        }
                    });
                } catch (Throwable th) {
                    e(th, BuildVars.DEBUG_PRIVATE_VERSION);
                }
            }
        }
    }

    public static void dumpUnparsedMessage(TLObject tLObject, long j10, int i9) {
        if (BuildVars.DEBUG_PRIVATE_VERSION && BuildVars.LOGS_ENABLED && tLObject != null) {
            try {
                checkGson();
                getInstance().dateFormat.format(System.currentTimeMillis());
                StringBuilder sb2 = new StringBuilder("receive message -> ");
                sb2.append(tLObject.getClass().getSimpleName());
                sb2.append(" : ");
                sb2.append(gsonDisabled ? tLObject : gson.e(tLObject));
                getInstance().logQueue.postRunnable(new v4(System.currentTimeMillis(), j10, i9, sb2.toString()));
            } catch (Throwable unused) {
            }
        }
    }

    public static void e(String str, Throwable th) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.e("tmessages", str, th);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new c2(7, str, th));
            }
        }
    }

    public static void ensureInitied() {
        getInstance().init();
    }

    public static void fatal(Throwable th) {
        fatal(th, true);
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
                } catch (Throwable th) {
                    throw th;
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
        } catch (Throwable th) {
            th.printStackTrace();
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
        } catch (Throwable th) {
            th.printStackTrace();
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
            } catch (Exception e10) {
                e10.printStackTrace();
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
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.initied = true;
        }
    }

    public static void lambda$d$6(String str) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " D/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e10) {
            e10.printStackTrace();
            if (AndroidUtilities.isENOSPC(e10)) {
                LaunchActivity.E(1);
            }
        }
    }

    public static void lambda$dumpResponseAndRequest$0(long j10, long j11, int i9, int i10, long j12, String str, String str2, TLRPC.TL_error tL_error) {
        try {
            String str3 = "requestMsgId=" + j10 + " requestingTime=" + (System.currentTimeMillis() - j11) + " request_token=" + i9 + " account=" + i10;
            getInstance().tlStreamWriter.write(getInstance().dateFormat.format(j12) + " " + str3);
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
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void lambda$dumpUnparsedMessage$1(long j10, long j11, int i9, String str) {
        try {
            getInstance().tlStreamWriter.write(getInstance().dateFormat.format(j10) + " msgId=" + j11 + " account=" + i9);
            getInstance().tlStreamWriter.write("\n");
            getInstance().tlStreamWriter.write(str);
            getInstance().tlStreamWriter.write("\n\n");
            getInstance().tlStreamWriter.flush();
            Log.d("MTProto", "msgId=" + j11 + " account=" + i9);
            Log.d("MTProto", str);
            Log.d("MTProto", " ");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void lambda$e$2(String str, Throwable th) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + str + "\n");
            getInstance().streamWriter.write(th.toString());
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (int i9 = 0; i9 < stackTrace.length; i9++) {
                OutputStreamWriter outputStreamWriter2 = getInstance().streamWriter;
                outputStreamWriter2.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i9] + "\n");
            }
            getInstance().streamWriter.flush();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void lambda$e$3(String str) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void lambda$e$4(Throwable th) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + th + "\n");
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (int i9 = 0; i9 < stackTrace.length; i9++) {
                OutputStreamWriter outputStreamWriter2 = getInstance().streamWriter;
                outputStreamWriter2.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i9] + "\n");
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                OutputStreamWriter outputStreamWriter3 = getInstance().streamWriter;
                outputStreamWriter3.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                StackTraceElement[] stackTrace2 = cause.getStackTrace();
                for (int i10 = 0; i10 < stackTrace2.length; i10++) {
                    OutputStreamWriter outputStreamWriter4 = getInstance().streamWriter;
                    outputStreamWriter4.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace2[i10] + "\n");
                }
            }
            getInstance().streamWriter.flush();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void lambda$fatal$5(Throwable th) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " FATAL/tmessages: " + th + "\n");
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (int i9 = 0; i9 < stackTrace.length; i9++) {
                OutputStreamWriter outputStreamWriter2 = getInstance().streamWriter;
                outputStreamWriter2.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " FATAL/tmessages: \tat " + stackTrace[i9] + "\n");
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                OutputStreamWriter outputStreamWriter3 = getInstance().streamWriter;
                outputStreamWriter3.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                StackTraceElement[] stackTrace2 = cause.getStackTrace();
                for (int i10 = 0; i10 < stackTrace2.length; i10++) {
                    OutputStreamWriter outputStreamWriter4 = getInstance().streamWriter;
                    outputStreamWriter4.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace2[i10] + "\n");
                }
            }
            getInstance().streamWriter.flush();
        } catch (Exception e10) {
            e10.printStackTrace();
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
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static boolean needSent(Throwable th) {
        if (!(th instanceof InterruptedException) && !(th instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th instanceof IgnoreSentException)) {
            return true;
        }
        return false;
    }

    public static void w(String str) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.w("tmessages", str);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new u1(str, 1));
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
        } catch (Exception e10) {
            e(e10);
        }
    }

    public static void d(String str) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.d("tmessages", str);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new u1(str, 3));
            }
        }
    }

    public static void fatal(Throwable th, boolean z10) {
        if (BuildVars.LOGS_ENABLED) {
            if (th instanceof OutOfMemoryError) {
                getInstance().dumpMemory(false);
            }
            if (z10 && BuildVars.DEBUG_VERSION && needSent(th)) {
                AndroidUtilities.appCenterLog(th);
            }
            ensureInitied();
            th.printStackTrace();
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new d3(1, th));
                return;
            }
            th.printStackTrace();
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
                getInstance().logQueue.postRunnable(new u1(str, 2));
            }
        }
    }

    public static void e(Throwable th) {
        e(th, true);
    }

    public static void e(Throwable th, boolean z10) {
        if (BuildVars.LOGS_ENABLED) {
            if (BuildVars.DEBUG_VERSION && needSent(th) && z10) {
                AndroidUtilities.appCenterLog(th);
            }
            if (BuildVars.DEBUG_VERSION && th.getMessage() != null && th.getMessage().contains("disk image is malformed") && !databaseIsMalformed) {
                d("copy malformed files");
                databaseIsMalformed = true;
                File file = new File(ApplicationLoader.getFilesDirFixed(), "malformed_database/");
                file.mkdirs();
                ArrayList<File> databaseFiles = MessagesStorage.getInstance(UserConfig.selectedAccount).getDatabaseFiles();
                for (int i9 = 0; i9 < databaseFiles.size(); i9++) {
                    try {
                        AndroidUtilities.copyFile(databaseFiles.get(i9), new File(file, databaseFiles.get(i9).getName()));
                    } catch (IOException e10) {
                        e(e10);
                    }
                }
            }
            ensureInitied();
            th.printStackTrace();
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new d3(0, th));
            } else {
                th.printStackTrace();
            }
        }
    }
}
