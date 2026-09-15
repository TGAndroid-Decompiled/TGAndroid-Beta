package c5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import n7.a1;
import org.telegram.ui.Cells.p6;
public final class a {
    public String f3836a;
    public String f3837b;

    public a(String str, String str2) {
        this.f3836a = str;
        this.f3837b = str2;
    }

    public r a() {
        if (!"first_party".equals(this.f3837b)) {
            if (this.f3836a != null) {
                if (this.f3837b != null) {
                    return new r(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public a(a1 a1Var) {
        Context context = (Context) a1Var.f15108b;
        int e = w9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f3836a = "Unity";
            String string = context.getResources().getString(e);
            this.f3837b = string;
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
                this.f3836a = "Flutter";
                this.f3837b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f3836a = null;
                this.f3837b = null;
            }
        }
        this.f3836a = null;
        this.f3837b = null;
    }
}
