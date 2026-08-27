package f9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

public final class x {

    public static final Pattern f6007g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");

    public final y f6008a;

    public final Context f6009b;

    public final String f6010c;
    public final z9.d d;

    public final t f6011e;

    public c f6012f;

    public x(Context context, String str, z9.d dVar, t tVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f6009b = context;
        this.f6010c = str;
        this.d = dVar;
        this.f6011e = tVar;
        this.f6008a = new y();
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : f6007g.matcher(string).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized c b() {
        String str;
        c cVar = this.f6012f;
        if (cVar != null && (cVar.f5928b != null || !this.f6011e.a())) {
            return this.f6012f;
        }
        c9.c cVar2 = c9.c.f2568a;
        cVar2.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f6009b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cVar2.c("Cached Firebase Installation ID: " + string);
        if (this.f6011e.a()) {
            try {
                str = (String) b0.a(((z9.c) this.d).d());
            } catch (Exception e9) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e9);
                str = null;
            }
            cVar2.c("Fetched Firebase Installation ID: " + str);
            if (str == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
            }
            if (str.equals(string)) {
                this.f6012f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f6012f = new c(a(str, sharedPreferences), str);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f6012f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        } else {
            this.f6012f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        }
        cVar2.c("Install IDs: " + this.f6012f);
        return this.f6012f;
    }

    public final String c() {
        String str;
        y yVar = this.f6008a;
        Context context = this.f6009b;
        synchronized (yVar) {
            try {
                if (yVar.f6013a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    yVar.f6013a = installerPackageName;
                }
                str = "".equals(yVar.f6013a) ? null : yVar.f6013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
