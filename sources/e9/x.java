package e9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class x {
    public static final Pattern f5075g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final e5.c f5076a;
    public final Context f5077b;
    public final String f5078c;
    public final y9.d d;
    public final t f5079e;
    public c f5080f;

    public x(Context context, String str, y9.d dVar, t tVar) {
        if (context != null) {
            if (str != null) {
                this.f5077b = context;
                this.f5078c = str;
                this.d = dVar;
                this.f5079e = tVar;
                this.f5076a = new e5.c();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        if (uuid == null) {
            lowerCase = null;
        } else {
            lowerCase = f5075g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        }
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized c b() {
        String str;
        c cVar = this.f5080f;
        if (cVar != null && (cVar.f4996b != null || !this.f5079e.a())) {
            return this.f5080f;
        }
        b9.d dVar = b9.d.f1664a;
        dVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f5077b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        dVar.c("Cached Firebase Installation ID: " + string);
        if (this.f5079e.a()) {
            try {
                str = (String) z.a(((y9.c) this.d).d());
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e10);
                str = null;
            }
            dVar.c("Fetched Firebase Installation ID: " + str);
            if (str == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
            }
            if (str.equals(string)) {
                this.f5080f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f5080f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f5080f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f5080f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        dVar.c("Install IDs: " + this.f5080f);
        return this.f5080f;
    }

    public final String c() {
        String str;
        e5.c cVar = this.f5076a;
        Context context = this.f5077b;
        synchronized (cVar) {
            try {
                if (cVar.f4877b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    cVar.f4877b = installerPackageName;
                }
                if ("".equals(cVar.f4877b)) {
                    str = null;
                } else {
                    str = cVar.f4877b;
                }
            } finally {
            }
        }
        return str;
    }
}
