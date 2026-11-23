package aa;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class a0 {
    public static final Pattern f773g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final b0 f774a;
    public final Context f775b;
    public final String f776c;
    public final va.d d;
    public final w f777e;
    public c f778f;

    public a0(Context context, String str, va.d dVar, w wVar) {
        if (context != null) {
            if (str != null) {
                this.f775b = context;
                this.f776c = str;
                this.d = dVar;
                this.f777e = wVar;
                this.f774a = new Object();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        lowerCase = f773g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final aa.z b(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: aa.a0.b(boolean):aa.z");
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f778f;
        if (cVar != null && (cVar.f784b != null || !this.f777e.a())) {
            return this.f778f;
        }
        x9.b bVar = x9.b.f60437a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f775b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.f777e.a()) {
            z b10 = b(false);
            bVar.c("Fetched Firebase Installation ID: " + b10.f885a);
            if (b10.f885a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b10 = new z(str, null);
            }
            if (Objects.equals(b10.f885a, string)) {
                this.f778f = new c(sharedPreferences.getString("crashlytics.installation.id", null), b10.f885a, b10.f886b);
            } else {
                this.f778f = new c(a(b10.f885a, sharedPreferences), b10.f885a, b10.f886b);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f778f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        } else {
            this.f778f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null, null);
        }
        bVar.c("Install IDs: " + this.f778f);
        return this.f778f;
    }

    public final String d() {
        String str;
        b0 b0Var = this.f774a;
        Context context = this.f775b;
        synchronized (b0Var) {
            try {
                if (b0Var.f782a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    b0Var.f782a = installerPackageName;
                }
                if ("".equals(b0Var.f782a)) {
                    str = null;
                } else {
                    str = b0Var.f782a;
                }
            } finally {
            }
        }
        return str;
    }
}
