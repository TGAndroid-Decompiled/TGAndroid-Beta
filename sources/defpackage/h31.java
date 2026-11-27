package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;
public final class h31 implements Parcelable {
    public static final Parcelable.Creator<h31> CREATOR = new g31((byte) 0);
    public final Bundle a;

    public h31(Object obj) {
        ArrayMap arrayMap = v31.a;
        String i = v31.i(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(i));
        }
        this.a = v31.o(obj, i, new t31(null, "", new ArrayDeque()));
    }

    public final Object a() {
        ArrayMap arrayMap = v31.a;
        boolean isLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.a;
        if (isLoggable) {
            String str = (String) v31.b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
            if (str == null) {
                str = "unknown";
            }
            Log.d("CarApp.Bun", "Unbundling ".concat(str));
        }
        return v31.f(bundle, new t31(null, "", new ArrayDeque()));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public h31(Bundle bundle) {
        this.a = bundle;
    }
}
