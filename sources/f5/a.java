package f5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import sg.h0;
public final class a {
    public final int f10924a;
    public String f10925b;
    public String f10926c;

    public a() {
        this.f10924a = 1;
    }

    public p a() {
        if (!"first_party".equals(this.f10926c)) {
            if (this.f10925b != null) {
                if (this.f10926c != null) {
                    return new p(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f10924a) {
            case 3:
                return this.f10925b + ", " + this.f10926c;
            default:
                return super.toString();
        }
    }

    public a(int i7, String str, String str2) {
        this.f10924a = i7;
        this.f10925b = str;
        this.f10926c = str2;
    }

    public a(h0 h0Var) {
        this.f10924a = 5;
        Context context = (Context) h0Var.f56642b;
        int e10 = aa.g.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e10 != 0) {
            this.f10925b = "Unity";
            String string = context.getResources().getString(e10);
            this.f10926c = string;
            String k10 = r.b.k("Unity Editor version is: ", string);
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
                this.f10925b = "Flutter";
                this.f10926c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f10925b = null;
                this.f10926c = null;
            }
        }
        this.f10925b = null;
        this.f10926c = null;
    }
}
