package ii;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
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
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.p10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class r {
    public static final WeakHashMap f15180k = new WeakHashMap();
    public static KeyStore f15181l;
    public final Context f15182a;
    public final int f15183b;
    public final long f15184c;
    public boolean d;
    public boolean f15185e;
    public boolean f15186f;
    public String f15187g;
    public String h;
    public android.support.v4.media.c f15188i;
    public ai.q4 f15189j;

    public r(Context context, int i3, long j10) {
        this.f15182a = context;
        this.f15183b = i3;
        this.f15184c = j10;
        h();
    }

    public static void b() {
        Context context = org.telegram.messenger.t0.f25457b;
        if (context == null) {
            return;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            context.getSharedPreferences("2botbiometry_" + i3, 0).edit().clear().apply();
        }
        f15180k.clear();
    }

    public static r c(Context context, int i3, long j10) {
        Pair pair = new Pair(Integer.valueOf(i3), Long.valueOf(j10));
        WeakHashMap weakHashMap = f15180k;
        r rVar = (r) weakHashMap.get(pair);
        if (rVar == null) {
            r rVar2 = new r(context, i3, j10);
            weakHashMap.put(pair, rVar2);
            return rVar2;
        }
        return rVar;
    }

    public static void d(Activity activity, int i3, u10 u10Var) {
        int i10 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i3, 0);
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
            r c2 = c(activity, i3, l10.longValue());
            if (c2.f15185e && c2.f15186f) {
                hashMap.put(l10, Boolean.valueOf(!c2.d));
            }
        }
        if (arrayList.isEmpty()) {
            u10Var.a(new ArrayList());
        } else {
            qr.a0(i3).f24934a.c(new bi.q0(i3, arrayList, hashMap, u10Var, 4));
        }
    }

    public final boolean a() {
        return this.f15186f;
    }

    public final SecretKey e() {
        if (f15181l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f15181l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f15181l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j10 = this.f15184c;
        sb2.append(j10);
        if (keyStore2.containsAlias(sb2.toString())) {
            KeyStore keyStore3 = f15181l;
            return (SecretKey) keyStore3.getKey("9bot_" + j10, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("9bot_" + j10, 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        }
        if (i3 >= 24) {
            builder.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    public final org.json.JSONObject f() {
        throw new UnsupportedOperationException("Method not decompiled: ii.r.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.f15185e;
    }

    public final void h() {
        boolean z10;
        SharedPreferences sharedPreferences = this.f15182a.getSharedPreferences("2botbiometry_" + this.f15183b, 0);
        long j10 = this.f15184c;
        this.f15187g = sharedPreferences.getString(String.valueOf(j10), null);
        this.h = sharedPreferences.getString(String.valueOf(j10) + "_iv", null);
        boolean z11 = true;
        if (this.f15187g != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15185e = z10;
        if (!z10) {
            if (!sharedPreferences.getBoolean(j10 + "_requested", false)) {
                z11 = false;
            }
        }
        this.f15186f = z11;
        this.d = sharedPreferences.getBoolean(j10 + "_disabled", false);
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

    public final void j(String str, boolean z10, String str2, p10 p10Var) {
        androidx.biometric.v vVar;
        int i3;
        this.f15189j = null;
        try {
            if (this.f15188i == null) {
                this.f15188i = new android.support.v4.media.c(LaunchActivity.K1, f0.d.e(this.f15182a), new p(this, 0));
            }
            androidx.biometric.v i10 = i(z10);
            TLRPC.User a22 = hp.s1(this.f15183b).a2(Long.valueOf(this.f15184c));
            l6.n nVar = new l6.n(1);
            nVar.f18089b = l10.p(a22);
            nVar.d = bd.M0(2131753756, null);
            int i11 = 15;
            nVar.f18088a = 15;
            if (!TextUtils.isEmpty(str)) {
                nVar.f18090c = str;
            }
            l6.n c2 = nVar.c();
            if (i10 != null) {
                Cipher cipher = i10.f1447b;
                if (!z10 && Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f15187g = null;
                        } else {
                            this.f15187g = Utilities.f(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.f(cipher.getIV());
                        }
                        k();
                        p10Var.a(Boolean.TRUE, null, null);
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
            this.f15189j = new ai.q4(8, p10Var, vVar);
            if (i10 != null && (i3 = Build.VERSION.SDK_INT) < 30) {
                android.support.v4.media.c cVar = this.f15188i;
                cVar.getClass();
                int i12 = c2.f18088a;
                if (i12 != 0) {
                    i11 = i12;
                }
                if ((i11 & 255) != 255) {
                    if (i3 < 30 && b8.k0.a(i11)) {
                        throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                    }
                    cVar.Y(c2, i10);
                    return;
                }
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            this.f15188i.Y(c2, null);
        } catch (Exception e11) {
            a8.g(e11, true);
            p10Var.a(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f15182a.getSharedPreferences("2botbiometry_" + this.f15183b, 0).edit();
        boolean z10 = this.f15186f;
        long j10 = this.f15184c;
        if (z10) {
            edit.putBoolean(j10 + "_requested", true);
        } else {
            edit.remove(j10 + "_requested");
        }
        if (this.f15185e) {
            String valueOf = String.valueOf(j10);
            String str = this.f15187g;
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

    public final void l(String str, final String str2, final ai.m mVar) {
        j(str, false, str2, new p10() {
            @Override
            public final void a(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.u uVar = (androidx.biometric.u) obj2;
                androidx.biometric.v vVar = (androidx.biometric.v) obj3;
                r rVar = r.this;
                rVar.getClass();
                if (uVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            rVar.f15187g = null;
                            rVar.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                vVar = rVar.i(false);
                            }
                            if (vVar != null) {
                                Cipher cipher = vVar.f1447b;
                                rVar.f15187g = Utilities.f(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                rVar.h = Utilities.f(cipher.getIV());
                            } else {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                        rVar.k();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        bool = Boolean.FALSE;
                    }
                }
                mVar.a(bool);
            }
        });
    }
}
