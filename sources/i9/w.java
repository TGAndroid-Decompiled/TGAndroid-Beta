package i9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
public final class w {
    public static final Pattern f8017g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final i5.c f8018a;
    public final Context f8019b;
    public final String f8020c;
    public final ca.d d;
    public final s f8021e;
    public c f8022f;

    public w(Context context, String str, ca.d dVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f8019b = context;
                this.f8020c = str;
                this.d = dVar;
                this.f8021e = sVar;
                this.f8018a = new Object();
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
            lowerCase = f8017g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
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
        c cVar = this.f8022f;
        if (cVar != null && (cVar.f7941b != null || !this.f8021e.a())) {
            return this.f8022f;
        }
        f9.b bVar = f9.b.f6225a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f8019b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.f8021e.a()) {
            try {
                str = (String) y.a(((ca.c) this.d).d());
            } catch (Exception e6) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e6);
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
                this.f8022f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f8022f = new c(a(str, sharedPreferences), str);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f8022f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        } else {
            this.f8022f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        }
        bVar.c("Install IDs: " + this.f8022f);
        return this.f8022f;
    }

    public final String c() {
        String str;
        i5.c cVar = this.f8018a;
        Context context = this.f8019b;
        synchronized (cVar) {
            try {
                if (cVar.f7812a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    cVar.f7812a = installerPackageName;
                }
                if ("".equals(cVar.f7812a)) {
                    str = null;
                } else {
                    str = cVar.f7812a;
                }
            } finally {
            }
        }
        return str;
    }
}
