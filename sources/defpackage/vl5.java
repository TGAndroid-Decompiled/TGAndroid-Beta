package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class vl5 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = "\\Q/\\E";
    public final ld3 a;
    public final Context b;
    public final String c;
    public final ti4 d;
    public final i73 e;
    public va0 f;

    public vl5(Context context, String str, ti4 ti4Var, i73 i73Var) {
        if (context != null) {
            if (str != null) {
                this.b = context;
                this.c = str;
                this.d = ti4Var;
                this.e = i73Var;
                this.a = new ld3((byte) 1);
                return;
            }
            u36.j("appIdentifier must not be null");
            throw null;
        }
        u36.j("appContext must not be null");
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

    public final defpackage.pi4 b(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl5.b(boolean):pi4");
    }

    public final synchronized va0 c() {
        String str;
        va0 va0Var = this.f;
        if (va0Var != null && (va0Var.b != null || !this.e.a())) {
            return this.f;
        }
        f8e f8eVar = f8e.b;
        f8eVar.k("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        f8eVar.k("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            pi4 b = b(false);
            f8eVar.k("Fetched Firebase Installation ID: " + b.a);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new pi4(str, null);
            }
            if (Objects.equals(b.a, string)) {
                this.f = new va0(sharedPreferences.getString("crashlytics.installation.id", null), b.a, b.b);
            } else {
                this.f = new va0(a(b.a, sharedPreferences), b.a, b.b);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f = new va0(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        } else {
            this.f = new va0(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null, null);
        }
        f8eVar.k("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        ld3 ld3Var = this.a;
        Context context = this.b;
        synchronized (ld3Var) {
            String str2 = ld3Var.b;
            if (str2 == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                str2 = installerPackageName;
                ld3Var.b = str2;
            }
            if ("".equals(str2)) {
                str = null;
            } else {
                str = ld3Var.b;
            }
        }
        return str;
    }
}
