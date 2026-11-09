package aa;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class b0 {
    public static final Pattern f778g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final c0 f779a;
    public final Context f780b;
    public final String f781c;
    public final va.d d;
    public final x f782e;
    public c f783f;

    public b0(Context context, String str, va.d dVar, x xVar) {
        if (context != null) {
            if (str != null) {
                this.f780b = context;
                this.f781c = str;
                this.d = dVar;
                this.f782e = xVar;
                this.f779a = new Object();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        lowerCase = f778g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final aa.a0 b(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: aa.b0.b(boolean):aa.a0");
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f783f;
        if (cVar != null && (cVar.f785b != null || !this.f782e.a())) {
            return this.f783f;
        }
        x9.b bVar = x9.b.f58675a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f780b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.f782e.a()) {
            a0 b10 = b(false);
            bVar.c("Fetched Firebase Installation ID: " + b10.f773a);
            if (b10.f773a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b10 = new a0(str, null);
            }
            if (Objects.equals(b10.f773a, string)) {
                this.f783f = new c(sharedPreferences.getString("crashlytics.installation.id", null), b10.f773a, b10.f774b);
            } else {
                this.f783f = new c(a(b10.f773a, sharedPreferences), b10.f773a, b10.f774b);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f783f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        } else {
            this.f783f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null, null);
        }
        bVar.c("Install IDs: " + this.f783f);
        return this.f783f;
    }

    public final String d() {
        String str;
        c0 c0Var = this.f779a;
        Context context = this.f780b;
        synchronized (c0Var) {
            try {
                if (c0Var.f787a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    c0Var.f787a = installerPackageName;
                }
                if ("".equals(c0Var.f787a)) {
                    str = null;
                } else {
                    str = c0Var.f787a;
                }
            } finally {
            }
        }
        return str;
    }
}
