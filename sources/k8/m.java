package k8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;
public final class m extends a6.a {
    public static final Parcelable.Creator<m> CREATOR = new c(8);
    public final Uri f13527a;
    public final HashMap f13528b;
    public final byte[] f13529c;

    public m(Uri uri, Bundle bundle, byte[] bArr) {
        this.f13527a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        z5.l.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            z5.l.h(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.f13528b = hashMap;
        this.f13529c = bArr;
    }

    public final String toString() {
        Object valueOf;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb2 = new StringBuilder("DataItemParcelable[@");
        sb2.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f13529c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        sb2.append(",dataSz=".concat(valueOf.toString()));
        HashMap hashMap = this.f13528b;
        int size = hashMap.size();
        sb2.append(", numAssets=" + size);
        sb2.append(", uri=".concat(String.valueOf(this.f13527a)));
        if (!isLoggable) {
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append("]\n  assets: ");
        for (String str : hashMap.keySet()) {
            String valueOf2 = String.valueOf(hashMap.get(str));
            sb2.append("\n    " + str + ": " + valueOf2);
        }
        sb2.append("\n  ]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f13527a, i10);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        z5.l.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.f13528b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((j8.f) entry.getValue()));
        }
        com.google.android.gms.internal.cast.o.b(parcel, 4, bundle);
        com.google.android.gms.internal.cast.o.c(parcel, 5, this.f13529c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
