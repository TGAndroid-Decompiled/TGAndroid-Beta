package di;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import bi.k6;
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
import org.telegram.ui.Components.h7;
import org.telegram.ui.LaunchActivity;
public final class u {
    public static final WeakHashMap f6926k = new WeakHashMap();
    public static KeyStore f6927l;
    public final Context f6928a;
    public final int f6929b;
    public final long f6930c;
    public boolean d;
    public boolean e;
    public boolean f6931f;
    public String f6932g;
    public String h;
    public xa.c f6933i;
    public k6 f6934j;

    public u(Context context, int i10, long j3) {
        this.f6928a = context;
        this.f6929b = i10;
        this.f6930c = j3;
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
        f6926k.clear();
    }

    public static u c(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        WeakHashMap weakHashMap = f6926k;
        u uVar = (u) weakHashMap.get(pair);
        if (uVar == null) {
            u uVar2 = new u(context, i10, j3);
            weakHashMap.put(pair, uVar2);
            return uVar2;
        }
        return uVar;
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
            u c10 = c(activity, i10, l4.longValue());
            if (c10.e && c10.f6931f) {
                hashMap.put(l4, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList());
        } else {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new q(i10, arrayList, hashMap, callback));
        }
    }

    public final boolean a() {
        return this.f6931f;
    }

    public final SecretKey e() {
        if (f6927l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f6927l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f6927l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j3 = this.f6930c;
        sb2.append(j3);
        if (keyStore2.containsAlias(sb2.toString())) {
            KeyStore keyStore3 = f6927l;
            return (SecretKey) keyStore3.getKey("9bot_" + j3, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("9bot_" + j3, 3);
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
        throw new UnsupportedOperationException("Method not decompiled: di.u.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.e;
    }

    public final void h() {
        boolean z10;
        SharedPreferences sharedPreferences = this.f6928a.getSharedPreferences("2botbiometry_" + this.f6929b, 0);
        long j3 = this.f6930c;
        this.f6932g = sharedPreferences.getString(String.valueOf(j3), null);
        this.h = sharedPreferences.getString(String.valueOf(j3) + "_iv", null);
        boolean z11 = true;
        if (this.f6932g != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        if (!z10) {
            if (!sharedPreferences.getBoolean(j3 + "_requested", false)) {
                z11 = false;
            }
        }
        this.f6931f = z11;
        this.d = sharedPreferences.getBoolean(j3 + "_disabled", false);
    }

    public final androidx.biometric.u i(boolean z10) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                SecretKey e = e();
                if (z10) {
                    cipher.init(2, e, new IvParameterSpec(Utilities.hexToBytes(this.h)));
                } else {
                    cipher.init(1, e);
                }
                return new androidx.biometric.u(cipher);
            }
            return null;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, Utilities.Callback3 callback3) {
        androidx.biometric.u uVar;
        int i10;
        int i11;
        this.f6934j = null;
        try {
            if (this.f6933i == null) {
                this.f6933i = new xa.c(LaunchActivity.G1, f0.e.e(this.f6928a), new s(this));
            }
            androidx.biometric.u i12 = i(z10);
            TLRPC.User user = MessagesController.getInstance(this.f6929b).getUser(Long.valueOf(this.f6930c));
            j6.l lVar = new j6.l(1);
            lVar.f11802b = UserObject.getUserName(user);
            lVar.d = LocaleController.getString(R.string.Back);
            int i13 = 15;
            lVar.f11801a = 15;
            if (!TextUtils.isEmpty(str)) {
                lVar.f11803c = str;
            }
            j6.l c10 = lVar.c();
            if (i12 != null) {
                Cipher cipher = i12.f758b;
                if (!z10 && (i11 = Build.VERSION.SDK_INT) >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f6932g = null;
                        } else if (i11 < 23) {
                            this.f6932g = str2;
                        } else {
                            this.f6932g = Utilities.bytesToHex(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.bytesToHex(cipher.getIV());
                        }
                        k();
                        callback3.run(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        i12 = i(z10);
                    }
                }
            }
            if (i12 != null && Build.VERSION.SDK_INT < 30) {
                uVar = i12;
            } else {
                uVar = null;
            }
            this.f6934j = new k6(1, callback3, uVar);
            if (i12 != null && (i10 = Build.VERSION.SDK_INT) < 30) {
                xa.c cVar = this.f6933i;
                cVar.getClass();
                int i14 = c10.f11801a;
                if (i14 != 0) {
                    i13 = i14;
                }
                if ((i13 & 255) != 255) {
                    if (i10 < 30 && v7.m.a(i13)) {
                        throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                    }
                    cVar.s0(c10, i12);
                    return;
                }
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            this.f6933i.s0(c10, null);
        } catch (Exception e7) {
            FileLog.e(e7);
            callback3.run(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f6928a.getSharedPreferences("2botbiometry_" + this.f6929b, 0).edit();
        boolean z10 = this.f6931f;
        long j3 = this.f6930c;
        if (z10) {
            edit.putBoolean(j3 + "_requested", true);
        } else {
            edit.remove(j3 + "_requested");
        }
        if (this.e) {
            String valueOf = String.valueOf(j3);
            String str = this.f6932g;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            edit.putString(valueOf, str);
            String str3 = String.valueOf(j3) + "_iv";
            String str4 = this.h;
            if (str4 != null) {
                str2 = str4;
            }
            edit.putString(str3, str2);
        } else {
            edit.remove(String.valueOf(j3));
            edit.remove(String.valueOf(j3) + "_iv");
        }
        if (this.d) {
            edit.putBoolean(j3 + "_disabled", true);
        } else {
            edit.remove(j3 + "_disabled");
        }
        edit.apply();
    }

    public final void l(String str, final String str2, final h7 h7Var) {
        j(str, false, str2, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.t tVar = (androidx.biometric.t) obj2;
                androidx.biometric.u uVar = (androidx.biometric.u) obj3;
                u uVar2 = u.this;
                uVar2.getClass();
                if (tVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            uVar2.f6932g = null;
                            uVar2.h = null;
                        } else {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 < 23) {
                                uVar2.f6932g = str3;
                                uVar2.h = null;
                            } else {
                                if (i10 >= 30) {
                                    uVar = uVar2.i(false);
                                }
                                if (uVar != null) {
                                    Cipher cipher = uVar.f758b;
                                    uVar2.f6932g = Utilities.bytesToHex(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                    uVar2.h = Utilities.bytesToHex(cipher.getIV());
                                } else {
                                    throw new RuntimeException("No cryptoObject found");
                                }
                            }
                        }
                        uVar2.k();
                    } catch (Exception e) {
                        FileLog.e(e);
                        bool = Boolean.FALSE;
                    }
                }
                h7Var.run(bool);
            }
        });
    }
}
