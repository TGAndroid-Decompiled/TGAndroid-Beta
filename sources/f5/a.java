package f5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import sg.i0;
public final class a {
    public String f11112a;
    public String f11113b;

    public a(String str, String str2, boolean z9) {
        this.f11112a = str;
        this.f11113b = str2;
    }

    public o a() {
        if (!"first_party".equals(this.f11113b)) {
            if (this.f11112a != null) {
                if (this.f11113b != null) {
                    return new o(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public a(String str, String str2) {
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.f11112a = str;
            this.f11113b = (str2 == null || str2.length() <= 0) ? null : str2;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public a(i0 i0Var) {
        Context context = (Context) i0Var.f55068b;
        int e10 = aa.g.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e10 != 0) {
            this.f11112a = "Unity";
            String string = context.getResources().getString(e10);
            this.f11113b = string;
            String i7 = rf.b.i("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", i7, null);
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
                this.f11112a = "Flutter";
                this.f11113b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f11112a = null;
                this.f11113b = null;
            }
        }
        this.f11112a = null;
        this.f11113b = null;
    }
}
