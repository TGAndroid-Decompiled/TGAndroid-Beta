package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class wj5 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = "\\Q/\\E";
    public final lo5 a;
    public final Context b;
    public final String c;
    public final rg4 d;
    public final w53 e;
    public v90 f;

    public wj5(Context context, String str, rg4 rg4Var, w53 w53Var) {
        if (context != null) {
            if (str != null) {
                this.b = context;
                this.c = str;
                this.d = rg4Var;
                this.e = w53Var;
                this.a = new lo5((byte) 0);
                return;
            }
            w26.j("appIdentifier must not be null");
            throw null;
        }
        w26.j("appContext must not be null");
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

    public final defpackage.ng4 b(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj5.b(boolean):ng4");
    }

    public final synchronized v90 c() {
        String str;
        v90 v90Var = this.f;
        if (v90Var != null && (v90Var.b != null || !this.e.a())) {
            return this.f;
        }
        c6e c6eVar = c6e.b;
        c6eVar.k("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        c6eVar.k("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            ng4 b = b(false);
            c6eVar.k("Fetched Firebase Installation ID: " + b.a);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new ng4(str, null);
            }
            if (Objects.equals(b.a, string)) {
                this.f = new v90(sharedPreferences.getString("crashlytics.installation.id", null), b.a, b.b);
            } else {
                this.f = new v90(a(b.a, sharedPreferences), b.a, b.b);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f = new v90(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        } else {
            this.f = new v90(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null, null);
        }
        c6eVar.k("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        lo5 lo5Var = this.a;
        Context context = this.b;
        synchronized (lo5Var) {
            String str2 = lo5Var.b;
            if (str2 == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                str2 = installerPackageName;
                lo5Var.b = str2;
            }
            if ("".equals(str2)) {
                str = null;
            } else {
                str = lo5Var.b;
            }
        }
        return str;
    }
}
