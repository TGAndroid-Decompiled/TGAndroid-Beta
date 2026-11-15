package ai;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.y5;
import org.telegram.messenger.z5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class i1 {
    public static ArrayList f1250a;
    public static long f1251b;
    public static CountDownLatch f1252c;
    public static long d;

    public static synchronized ArrayList a() {
        synchronized (i1.class) {
            try {
                if (f1250a == null) {
                    String string = np.e1().getString("speech_models", null);
                    if (string == null) {
                        return null;
                    }
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                    int readInt32 = serializedData.readInt32(true);
                    ArrayList arrayList = new ArrayList(readInt32);
                    for (int i7 = 0; i7 < readInt32; i7++) {
                        arrayList.add(TLRPC.TL_transcriptionModel.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                    }
                    serializedData.cleanup();
                    f1250a = arrayList;
                }
                return f1250a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean b() {
        y5 n10;
        z5 q10 = z5.q(m10.f24934t0);
        int e10 = org.telegram.messenger.t0.e();
        if (e10 == 1) {
            n10 = q10.p();
        } else if (e10 == 2) {
            n10 = q10.o();
        } else {
            n10 = q10.n();
        }
        if (n10 != null && n10.f27663g) {
            return true;
        }
        return false;
    }

    public static int c(org.telegram.tgnet.TLRPC.TL_transcriptionModel r23, java.io.File r24, ai.h1 r25) {
        throw new UnsupportedOperationException("Method not decompiled: ai.i1.c(org.telegram.tgnet.TLRPC$TL_transcriptionModel, java.io.File, ai.h1):int");
    }

    public static boolean d() {
        long j3;
        ArrayList a10 = a();
        long currentTimeMillis = System.currentTimeMillis() - np.e1().getLong("speech_models_checked", 0L);
        if (a10 != null) {
            if (a10.isEmpty()) {
                j3 = 3600000;
            } else {
                j3 = 86400000;
            }
            if (currentTimeMillis <= j3) {
                if ((!a10.isEmpty() || f1251b != 0) && a8.p0.s(new StringBuilder(), org.telegram.messenger.r2.f26200c, "/1").equals(np.e1().getString("speech_models_build", null))) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static synchronized CountDownLatch e() {
        synchronized (i1.class) {
            CountDownLatch countDownLatch = f1252c;
            if (countDownLatch != null) {
                return countDownLatch;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = f1251b;
            if (j3 != 0 && elapsedRealtime - j3 < 60000) {
                return null;
            }
            int i7 = m10.f24934t0;
            if (!m10.r(i7)) {
                return null;
            }
            f1251b = elapsedRealtime;
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            f1252c = countDownLatch2;
            TLRPC.TL_messages_getTranscriptionModels tL_messages_getTranscriptionModels = new TLRPC.TL_messages_getTranscriptionModels();
            tL_messages_getTranscriptionModels.version = 1;
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getTranscriptionModels, new d1(countDownLatch2, 0));
            return countDownLatch2;
        }
    }

    public static TLRPC.TL_transcriptionModel f(ArrayList arrayList, String... strArr) {
        if (arrayList == null) {
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj;
            String[] strArr3 = (String[]) tL_transcriptionModel.languages.toArray(new String[0]);
            Arrays.sort(strArr3);
            if (Arrays.equals(strArr2, strArr3)) {
                return tL_transcriptionModel;
            }
        }
        return null;
    }

    public static void g(File file) {
        SharedPreferences.Editor edit = np.e1().edit();
        edit.remove("speech_doc_" + file.getName()).apply();
    }

    public static void h(ArrayList arrayList) {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((TLRPC.TL_transcriptionModel) obj).serializeToStream(serializedData);
        }
        SharedPreferences.Editor putLong = np.e1().edit().putString("speech_models", Base64.encodeToString(serializedData.toByteArray(), 2)).putLong("speech_models_checked", System.currentTimeMillis());
        putLong.putString("speech_models_build", org.telegram.messenger.r2.f26200c + "/1").apply();
        serializedData.cleanup();
    }
}
