package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;
public final class y21 implements Parcelable {
    public static final Parcelable.Creator<y21> CREATOR = new x21((byte) 0);
    public final Bundle a;

    public y21(Object obj) {
        ArrayMap arrayMap = m31.a;
        String i = m31.i(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(i));
        }
        this.a = m31.o(obj, i, new k31(null, "", new ArrayDeque()));
    }

    public final Object a() {
        ArrayMap arrayMap = m31.a;
        boolean isLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.a;
        if (isLoggable) {
            String str = (String) m31.b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
            if (str == null) {
                str = "unknown";
            }
            Log.d("CarApp.Bun", "Unbundling ".concat(str));
        }
        return m31.f(bundle, new k31(null, "", new ArrayDeque()));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public y21(Bundle bundle) {
        this.a = bundle;
    }
}
