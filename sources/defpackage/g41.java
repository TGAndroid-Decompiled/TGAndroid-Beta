package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;
public final class g41 implements Parcelable {
    public static final Parcelable.Creator<g41> CREATOR = new f41((byte) 0);
    public final Bundle a;

    public g41(Object obj) {
        ArrayMap arrayMap = u41.a;
        String i = u41.i(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(i));
        }
        this.a = u41.o(obj, i, new s41(null, "", new ArrayDeque()));
    }

    public final Object a() {
        ArrayMap arrayMap = u41.a;
        boolean isLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.a;
        if (isLoggable) {
            String str = (String) u41.b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
            if (str == null) {
                str = "unknown";
            }
            Log.d("CarApp.Bun", "Unbundling ".concat(str));
        }
        return u41.f(bundle, new s41(null, "", new ArrayDeque()));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public g41(Bundle bundle) {
        this.a = bundle;
    }
}
