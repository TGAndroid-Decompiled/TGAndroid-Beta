package hi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import bi.m5;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class y {
    public static final WeakHashMap f13363k = new WeakHashMap();
    public static KeyStore f13364l;
    public final Context f13365a;
    public final int f13366b;
    public final long f13367c;
    public boolean d;
    public boolean e;
    public boolean f13368f;
    public String f13369g;
    public String h;
    public rb.c f13370i;
    public m5 f13371j;

    public y(Context context, int i10, long j10) {
        this.f13365a = context;
        this.f13366b = i10;
        this.f13367c = j10;
        h();
    }

    public static void b() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("2botbiometry_" + i10, 0).edit().clear().apply();
        }
        f13363k.clear();
    }

    public static y c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        WeakHashMap weakHashMap = f13363k;
        y yVar = (y) weakHashMap.get(pair);
        if (yVar == null) {
            y yVar2 = new y(context, i10, j10);
            weakHashMap.put(pair, yVar2);
            return yVar2;
        }
        return yVar;
    }

    public static void d(Activity activity, int i10, Utilities.Callback callback) {
        int i11 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i10, 0);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Long l4 = (Long) obj;
            y c10 = c(activity, i10, l4.longValue());
            if (c10.e && c10.f13368f) {
                hashMap.put(l4, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList());
        } else {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new ai.h1(i10, arrayList, hashMap, callback, 4));
        }
    }

    public final boolean a() {
        return this.f13368f;
    }

    public final SecretKey e() {
        if (f13364l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f13364l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f13364l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j10 = this.f13367c;
        sb2.append(j10);
        if (keyStore2.containsAlias(sb2.toString())) {
            KeyStore keyStore3 = f13364l;
            return (SecretKey) keyStore3.getKey("9bot_" + j10, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("9bot_" + j10, 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        }
        if (i10 >= 24) {
            builder.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    public final org.json.JSONObject f() {
        throw new UnsupportedOperationException("Method not decompiled: hi.y.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.e;
    }

    public final void h() {
        boolean z10;
        SharedPreferences sharedPreferences = this.f13365a.getSharedPreferences("2botbiometry_" + this.f13366b, 0);
        long j10 = this.f13367c;
        this.f13369g = sharedPreferences.getString(String.valueOf(j10), null);
        this.h = sharedPreferences.getString(String.valueOf(j10) + "_iv", null);
        boolean z11 = true;
        if (this.f13369g != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        if (!z10) {
            if (!sharedPreferences.getBoolean(j10 + "_requested", false)) {
                z11 = false;
            }
        }
        this.f13368f = z11;
        this.d = sharedPreferences.getBoolean(j10 + "_disabled", false);
    }

    public final androidx.biometric.t i(boolean z10) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey e = e();
            if (z10) {
                cipher.init(2, e, new IvParameterSpec(Utilities.hexToBytes(this.h)));
            } else {
                cipher.init(1, e);
            }
            return new androidx.biometric.t(cipher);
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, Utilities.Callback3 callback3) {
        androidx.biometric.t tVar;
        int i10;
        this.f13371j = null;
        try {
            if (this.f13370i == null) {
                this.f13370i = new rb.c(LaunchActivity.I1, f0.c.d(this.f13365a), new w(this));
            }
            androidx.biometric.t i11 = i(z10);
            TLRPC.User user = MessagesController.getInstance(this.f13366b).getUser(Long.valueOf(this.f13367c));
            k6.m mVar = new k6.m(1);
            mVar.f16423b = UserObject.getUserName(user);
            mVar.d = LocaleController.getString(R.string.Back);
            int i12 = 15;
            mVar.f16422a = 15;
            if (!TextUtils.isEmpty(str)) {
                mVar.f16424c = str;
            }
            k6.m c10 = mVar.c();
            if (i11 != null) {
                Cipher cipher = i11.f2287b;
                if (!z10 && Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f13369g = null;
                        } else {
                            this.f13369g = Utilities.bytesToHex(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.bytesToHex(cipher.getIV());
                        }
                        k();
                        callback3.run(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        i11 = i(z10);
                    }
                }
            }
            if (i11 != null && Build.VERSION.SDK_INT < 30) {
                tVar = i11;
            } else {
                tVar = null;
            }
            this.f13371j = new m5(7, callback3, tVar);
            if (i11 != null && (i10 = Build.VERSION.SDK_INT) < 30) {
                rb.c cVar = this.f13370i;
                cVar.getClass();
                int i13 = c10.f16422a;
                if (i13 != 0) {
                    i12 = i13;
                }
                if ((i12 & 255) != 255) {
                    if (i10 < 30 && a8.z0.a(i12)) {
                        throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                    }
                    cVar.e(c10, i11);
                    return;
                }
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            this.f13370i.e(c10, null);
        } catch (Exception e10) {
            FileLog.e(e10);
            callback3.run(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f13365a.getSharedPreferences("2botbiometry_" + this.f13366b, 0).edit();
        boolean z10 = this.f13368f;
        long j10 = this.f13367c;
        if (z10) {
            edit.putBoolean(j10 + "_requested", true);
        } else {
            edit.remove(j10 + "_requested");
        }
        if (this.e) {
            String valueOf = String.valueOf(j10);
            String str = this.f13369g;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            edit.putString(valueOf, str);
            String str3 = String.valueOf(j10) + "_iv";
            String str4 = this.h;
            if (str4 != null) {
                str2 = str4;
            }
            edit.putString(str3, str2);
        } else {
            edit.remove(String.valueOf(j10));
            edit.remove(String.valueOf(j10) + "_iv");
        }
        if (this.d) {
            edit.putBoolean(j10 + "_disabled", true);
        } else {
            edit.remove(j10 + "_disabled");
        }
        edit.apply();
    }

    public final void l(String str, final String str2, final bi.v3 v3Var) {
        j(str, false, str2, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.s sVar = (androidx.biometric.s) obj2;
                androidx.biometric.t tVar = (androidx.biometric.t) obj3;
                y yVar = y.this;
                yVar.getClass();
                if (sVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            yVar.f13369g = null;
                            yVar.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                tVar = yVar.i(false);
                            }
                            if (tVar != null) {
                                Cipher cipher = tVar.f2287b;
                                yVar.f13369g = Utilities.bytesToHex(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                yVar.h = Utilities.bytesToHex(cipher.getIV());
                            } else {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                        yVar.k();
                    } catch (Exception e) {
                        FileLog.e(e);
                        bool = Boolean.FALSE;
                    }
                }
                v3Var.run(bool);
            }
        });
    }
}
