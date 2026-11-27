package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class yl5 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = "\\Q/\\E";
    public final sc3 a;
    public final Context b;
    public final String c;
    public final ri4 d;
    public final p63 e;
    public x90 f;

    public yl5(Context context, String str, ri4 ri4Var, p63 p63Var) {
        if (context != null) {
            if (str != null) {
                this.b = context;
                this.c = str;
                this.d = ri4Var;
                this.e = p63Var;
                this.a = new Object();
                return;
            }
            lq5.j("appIdentifier must not be null");
            throw null;
        }
        lq5.j("appContext must not be null");
        throw null;
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final defpackage.ni4 b(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl5.b(boolean):ni4");
    }

    public final synchronized x90 c() {
        String str;
        x90 x90Var = this.f;
        if (x90Var != null && (x90Var.b != null || !this.e.a())) {
            return this.f;
        }
        sae saeVar = sae.b;
        saeVar.k("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        saeVar.k("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            ni4 b = b(false);
            saeVar.k("Fetched Firebase Installation ID: " + b.a);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new ni4(str, null);
            }
            if (Objects.equals(b.a, string)) {
                this.f = new x90(sharedPreferences.getString("crashlytics.installation.id", null), b.a, b.b);
            } else {
                this.f = new x90(a(b.a, sharedPreferences), b.a, b.b);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f = new x90(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        } else {
            this.f = new x90(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null, null);
        }
        saeVar.k("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        sc3 sc3Var = this.a;
        Context context = this.b;
        synchronized (sc3Var) {
            String str2 = sc3Var.a;
            if (str2 == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                str2 = installerPackageName;
                sc3Var.a = str2;
            }
            if ("".equals(str2)) {
                str = null;
            } else {
                str = sc3Var.a;
            }
        }
        return str;
    }
}
