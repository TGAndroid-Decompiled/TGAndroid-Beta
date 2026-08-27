package j8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import h7.r8;
import java.util.HashMap;
import java.util.Map;

public final class m extends z5.a {
    public static final Parcelable.Creator<m> CREATOR = new c(8);

    public final Uri f12804a;

    public final HashMap f12805b;

    public final byte[] f12806c;

    public m(Uri uri, Bundle bundle, byte[] bArr) {
        this.f12804a = uri;
        HashMap map = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        y5.l.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            y5.l.h(parcelable);
            map.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.f12805b = map;
        this.f12806c = bArr;
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb2 = new StringBuilder("DataItemParcelable[@");
        sb2.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f12806c;
        sb2.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        HashMap map = this.f12805b;
        sb2.append(", numAssets=" + map.size());
        sb2.append(", uri=".concat(String.valueOf(this.f12804a)));
        if (!zIsLoggable) {
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append("]\n  assets: ");
        for (String str : map.keySet()) {
            sb2.append("\n    " + str + ": " + String.valueOf(map.get(str)));
        }
        sb2.append("\n  ]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.f12804a, i10);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        y5.l.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.f12805b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((i8.f) entry.getValue()));
        }
        r8.b(parcel, 4, bundle);
        r8.c(parcel, 5, this.f12806c);
        r8.r(parcel, iQ);
    }
}
