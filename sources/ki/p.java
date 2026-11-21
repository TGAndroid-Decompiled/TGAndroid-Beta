package ki;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import bi.p6;
import bi.x4;
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
public final class p {
    public static final WeakHashMap f18841k = new WeakHashMap();
    public static KeyStore f18842l;
    public final Context f18843a;
    public final int f18844b;
    public final long f18845c;
    public boolean d;
    public boolean f18846e;
    public boolean f18847f;
    public String f18848g;
    public String h;
    public d6.i f18849i;
    public p6 f18850j;

    public p(Context context, int i7, long j3) {
        this.f18843a = context;
        this.f18844b = i7;
        this.f18845c = j3;
        h();
    }

    public static void b() {
        Context context = org.telegram.messenger.t0.f26941b;
        if (context == null) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            context.getSharedPreferences("2botbiometry_" + i7, 0).edit().clear().apply();
        }
        f18841k.clear();
    }

    public static p c(Context context, int i7, long j3) {
        Pair pair = new Pair(Integer.valueOf(i7), Long.valueOf(j3));
        WeakHashMap weakHashMap = f18841k;
        p pVar = (p) weakHashMap.get(pair);
        if (pVar == null) {
            p pVar2 = new p(context, i7, j3);
            weakHashMap.put(pair, pVar2);
            return pVar2;
        }
        return pVar;
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
            p c10 = c(activity, i7, l10.longValue());
            if (c10.f18846e && c10.f18847f) {
                hashMap.put(l10, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            x10Var.a(new ArrayList());
        } else {
            tr.a0(i7).f27080a.c(new x4(i7, arrayList, hashMap, x10Var, 9));
        }
    }

    public final boolean a() {
        return this.f18847f;
    }

    public final SecretKey e() {
        if (f18842l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f18842l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f18842l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j3 = this.f18845c;
        sb2.append(j3);
        if (keyStore2.containsAlias(sb2.toString())) {
            KeyStore keyStore3 = f18842l;
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
        throw new UnsupportedOperationException("Method not decompiled: ki.p.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.f18846e;
    }

    public final void h() {
        boolean z10;
        SharedPreferences e10 = org.telegram.messenger.f3.e(new StringBuilder("2botbiometry_"), this.f18844b, this.f18843a, 0);
        long j3 = this.f18845c;
        this.f18848g = e10.getString(String.valueOf(j3), null);
        this.h = e10.getString(String.valueOf(j3) + "_iv", null);
        boolean z11 = true;
        if (this.f18848g != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18846e = z10;
        if (!z10) {
            if (!e10.getBoolean(j3 + "_requested", false)) {
                z11 = false;
            }
        }
        this.f18847f = z11;
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
        this.f18850j = null;
        try {
            if (this.f18849i == null) {
                this.f18849i = new d6.i(LaunchActivity.H1, f0.d.e(this.f18843a), new n(this, 0));
            }
            androidx.biometric.v i10 = i(z10);
            TLRPC.User c22 = mp.u1(this.f18844b).c2(Long.valueOf(this.f18845c));
            m6.n nVar = new m6.n(1);
            nVar.f20907b = o10.q(c22);
            nVar.d = gd.N0(2131753753, null);
            int i11 = 15;
            nVar.f20906a = 15;
            if (!TextUtils.isEmpty(str)) {
                nVar.f20908c = str;
            }
            m6.n b10 = nVar.b();
            if (i10 != null) {
                Cipher cipher = i10.f1979b;
                if (!z10 && Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f18848g = null;
                        } else {
                            this.f18848g = Utilities.f(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
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
            this.f18850j = new p6(11, s10Var, vVar);
            if (i10 != null && (i7 = Build.VERSION.SDK_INT) < 30) {
                d6.i iVar = this.f18849i;
                iVar.getClass();
                int i12 = b10.f20906a;
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
            this.f18849i.g(b10, null);
        } catch (Exception e11) {
            a8.g(e11, true);
            s10Var.a(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f18843a.getSharedPreferences("2botbiometry_" + this.f18844b, 0).edit();
        boolean z10 = this.f18847f;
        long j3 = this.f18845c;
        if (z10) {
            edit.putBoolean(j3 + "_requested", true);
        } else {
            edit.remove(j3 + "_requested");
        }
        if (this.f18846e) {
            String valueOf = String.valueOf(j3);
            String str = this.f18848g;
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
                p pVar = p.this;
                pVar.getClass();
                if (uVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            pVar.f18848g = null;
                            pVar.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                vVar = pVar.i(false);
                            }
                            if (vVar != null) {
                                Cipher cipher = vVar.f1979b;
                                pVar.f18848g = Utilities.f(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                pVar.h = Utilities.f(cipher.getIV());
                            } else {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                        pVar.k();
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
