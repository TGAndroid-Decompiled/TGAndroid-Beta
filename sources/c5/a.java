package c5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import n7.z0;
import org.telegram.ui.Cells.p6;
public final class a {
    public String f4341a;
    public String f4342b;

    public a(String str, String str2) {
        this.f4341a = str;
        this.f4342b = str2;
    }

    public r a() {
        if (!"first_party".equals(this.f4342b)) {
            if (this.f4341a != null) {
                if (this.f4342b != null) {
                    return new r(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public a(z0 z0Var) {
        Context context = (Context) z0Var.f16703b;
        int e7 = w9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e7 != 0) {
            this.f4341a = "Unity";
            String string = context.getResources().getString(e7);
            this.f4342b = string;
            String i10 = p6.i("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", i10, null);
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
                this.f4341a = "Flutter";
                this.f4342b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f4341a = null;
                this.f4342b = null;
            }
        }
        this.f4341a = null;
        this.f4342b = null;
    }
}
