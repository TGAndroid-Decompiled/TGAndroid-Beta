package f5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import sg.h0;
public final class a {
    public final int f11272a;
    public String f11273b;
    public String f11274c;

    public a() {
        this.f11272a = 1;
    }

    public p a() {
        if (!"first_party".equals(this.f11274c)) {
            if (this.f11273b != null) {
                if (this.f11274c != null) {
                    return new p(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f11272a) {
            case 3:
                return this.f11273b + ", " + this.f11274c;
            default:
                return super.toString();
        }
    }

    public a(int i7, String str, String str2) {
        this.f11272a = i7;
        this.f11273b = str;
        this.f11274c = str2;
    }

    public a(h0 h0Var) {
        this.f11272a = 5;
        Context context = (Context) h0Var.f57257b;
        int e10 = aa.g.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e10 != 0) {
            this.f11273b = "Unity";
            String string = context.getResources().getString(e10);
            this.f11274c = string;
            String k10 = p5.c.k("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", k10, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.f11273b = "Flutter";
                this.f11274c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f11273b = null;
                this.f11274c = null;
            }
        }
        this.f11273b = null;
        this.f11274c = null;
    }
}
