package i9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class w {
    public static final Pattern f7447g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final i5.c f7448a;
    public final Context f7449b;
    public final String f7450c;
    public final ca.d d;
    public final s e;
    public c f7451f;

    public w(Context context, String str, ca.d dVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f7449b = context;
                this.f7450c = str;
                this.d = dVar;
                this.e = sVar;
                this.f7448a = new i5.c(1);
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
            lowerCase = f7447g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f7451f;
        if (cVar != null && (cVar.f7378b != null || !this.e.a())) {
            return this.f7451f;
        }
        f9.b bVar = f9.b.f6106a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f7449b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            try {
                str = (String) y.a(((ca.c) this.d).d());
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e);
                str = null;
            }
            bVar.c("Fetched Firebase Installation ID: " + str);
            if (str == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
            }
            if (str.equals(string)) {
                this.f7451f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f7451f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f7451f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f7451f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f7451f);
        return this.f7451f;
    }

    public final String c() {
        String str;
        i5.c cVar = this.f7448a;
        Context context = this.f7449b;
        synchronized (cVar) {
            try {
                if (cVar.f7264b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    cVar.f7264b = installerPackageName;
                }
                if ("".equals(cVar.f7264b)) {
                    str = null;
                } else {
                    str = cVar.f7264b;
                }
            } finally {
            }
        }
        return str;
    }
}
