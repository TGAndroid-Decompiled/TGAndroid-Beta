package g9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class y {
    public static final Pattern f7232g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final g5.c f7233a;
    public final Context f7234b;
    public final String f7235c;
    public final aa.d d;
    public final u f7236e;
    public c f7237f;

    public y(Context context, String str, aa.d dVar, u uVar) {
        if (context != null) {
            if (str != null) {
                this.f7234b = context;
                this.f7235c = str;
                this.d = dVar;
                this.f7236e = uVar;
                this.f7233a = new Object();
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
            lowerCase = f7232g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f7237f;
        if (cVar != null && (cVar.f7150b != null || !this.f7236e.a())) {
            return this.f7237f;
        }
        d9.d dVar = d9.d.f5538a;
        dVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f7234b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        dVar.c("Cached Firebase Installation ID: " + string);
        if (this.f7236e.a()) {
            try {
                str = (String) a0.a(((aa.c) this.d).d());
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
                this.f7237f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f7237f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f7237f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f7237f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        dVar.c("Install IDs: " + this.f7237f);
        return this.f7237f;
    }

    public final String c() {
        String str;
        g5.c cVar = this.f7233a;
        Context context = this.f7234b;
        synchronized (cVar) {
            try {
                if (cVar.f7032a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    cVar.f7032a = installerPackageName;
                }
                if ("".equals(cVar.f7032a)) {
                    str = null;
                } else {
                    str = cVar.f7032a;
                }
            } finally {
            }
        }
        return str;
    }
}
