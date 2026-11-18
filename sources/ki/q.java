package ki;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import bi.l6;
import bi.t4;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.s10;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class q {
    public static final WeakHashMap f18831k = new WeakHashMap();
    public static KeyStore f18832l;
    public final Context f18833a;
    public final int f18834b;
    public final long f18835c;
    public boolean d;
    public boolean f18836e;
    public boolean f18837f;
    public String f18838g;
    public String h;
    public d6.i f18839i;
    public l6 f18840j;

    public q(Context context, int i7, long j3) {
        this.f18833a = context;
        this.f18834b = i7;
        this.f18835c = j3;
        h();
    }

    public static void b() {
        Context context = org.telegram.messenger.t0.f26913b;
        if (context == null) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            context.getSharedPreferences("2botbiometry_" + i7, 0).edit().clear().apply();
        }
        f18831k.clear();
    }

    public static q c(Context context, int i7, long j3) {
        Pair pair = new Pair(Integer.valueOf(i7), Long.valueOf(j3));
        WeakHashMap weakHashMap = f18831k;
        q qVar = (q) weakHashMap.get(pair);
        if (qVar == null) {
            q qVar2 = new q(context, i7, j3);
            weakHashMap.put(pair, qVar2);
            return qVar2;
        }
        return qVar;
    }

    public static void d(Activity activity, int i7, x10 x10Var) {
        int i10 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i7, 0);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l10 = (Long) obj;
            q c10 = c(activity, i7, l10.longValue());
            if (c10.f18836e && c10.f18837f) {
                hashMap.put(l10, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            x10Var.a(new ArrayList());
        } else {
            tr.a0(i7).f27052a.c(new t4(i7, arrayList, hashMap, x10Var, 9));
        }
    }

    public final boolean a() {
        return this.f18837f;
    }

    public final SecretKey e() {
        if (f18832l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f18832l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f18832l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j3 = this.f18835c;
        sb2.append(j3);
        if (keyStore2.containsAlias(sb2.toString())) {
            KeyStore keyStore3 = f18832l;
            return (SecretKey) keyStore3.getKey("9bot_" + j3, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("9bot_" + j3, 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        }
        if (i7 >= 24) {
            builder.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    public final org.json.JSONObject f() {
        throw new UnsupportedOperationException("Method not decompiled: ki.q.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.f18836e;
    }

    public final void h() {
        boolean z10;
        SharedPreferences e10 = org.telegram.messenger.f3.e(new StringBuilder("2botbiometry_"), this.f18834b, this.f18833a, 0);
        long j3 = this.f18835c;
        this.f18838g = e10.getString(String.valueOf(j3), null);
        this.h = e10.getString(String.valueOf(j3) + "_iv", null);
        boolean z11 = true;
        if (this.f18838g != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18836e = z10;
        if (!z10) {
            if (!e10.getBoolean(j3 + "_requested", false)) {
                z11 = false;
            }
        }
        this.f18837f = z11;
        this.d = e10.getBoolean(j3 + "_disabled", false);
    }

    public final androidx.biometric.v i(boolean z10) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey e10 = e();
            if (z10) {
                cipher.init(2, e10, new IvParameterSpec(Utilities.v(this.h)));
            } else {
                cipher.init(1, e10);
            }
            return new androidx.biometric.v(cipher);
        } catch (Exception e11) {
            a8.g(e11, true);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, s10 s10Var) {
        androidx.biometric.v vVar;
        int i7;
        this.f18840j = null;
        try {
            if (this.f18839i == null) {
                this.f18839i = new d6.i(LaunchActivity.H1, f0.d.e(this.f18833a), new o(this, 0));
            }
            androidx.biometric.v i10 = i(z10);
            TLRPC.User c22 = mp.u1(this.f18834b).c2(Long.valueOf(this.f18835c));
            m6.n nVar = new m6.n(1);
            nVar.f20879b = o10.q(c22);
            nVar.d = gd.M0(2131753754, null);
            int i11 = 15;
            nVar.f20878a = 15;
            if (!TextUtils.isEmpty(str)) {
                nVar.f20880c = str;
            }
            m6.n b10 = nVar.b();
            if (i10 != null) {
                Cipher cipher = i10.f1967b;
                if (!z10 && Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f18838g = null;
                        } else {
                            this.f18838g = Utilities.f(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.f(cipher.getIV());
                        }
                        k();
                        s10Var.a(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        i10 = i(z10);
                    }
                }
            }
            if (i10 != null && Build.VERSION.SDK_INT < 30) {
                vVar = i10;
            } else {
                vVar = null;
            }
            this.f18840j = new l6(11, s10Var, vVar);
            if (i10 != null && (i7 = Build.VERSION.SDK_INT) < 30) {
                d6.i iVar = this.f18839i;
                iVar.getClass();
                int i12 = b10.f20878a;
                if (i12 != 0) {
                    i11 = i12;
                }
                if ((i11 & 255) != 255) {
                    if (i7 < 30 && a8.l1.a(i11)) {
                        throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                    }
                    iVar.g(b10, i10);
                    return;
                }
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            this.f18839i.g(b10, null);
        } catch (Exception e11) {
            a8.g(e11, true);
            s10Var.a(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f18833a.getSharedPreferences("2botbiometry_" + this.f18834b, 0).edit();
        boolean z10 = this.f18837f;
        long j3 = this.f18835c;
        if (z10) {
            edit.putBoolean(j3 + "_requested", true);
        } else {
            edit.remove(j3 + "_requested");
        }
        if (this.f18836e) {
            String valueOf = String.valueOf(j3);
            String str = this.f18838g;
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

    public final void l(String str, final String str2, final bi.j jVar) {
        j(str, false, str2, new s10() {
            @Override
            public final void a(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.u uVar = (androidx.biometric.u) obj2;
                androidx.biometric.v vVar = (androidx.biometric.v) obj3;
                q qVar = q.this;
                qVar.getClass();
                if (uVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            qVar.f18838g = null;
                            qVar.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                vVar = qVar.i(false);
                            }
                            if (vVar != null) {
                                Cipher cipher = vVar.f1967b;
                                qVar.f18838g = Utilities.f(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                qVar.h = Utilities.f(cipher.getIV());
                            } else {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                        qVar.k();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        bool = Boolean.FALSE;
                    }
                }
                jVar.a(bool);
            }
        });
    }
}
