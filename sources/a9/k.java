package a9;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;
public final class k extends q6.a {
    public static final Parcelable.Creator<k> CREATOR = new c(8);
    public final Uri f211a;
    public final HashMap f212b;
    public final byte[] f213c;

    public k(Uri uri, Bundle bundle, byte[] bArr) {
        this.f211a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        p6.m.g(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            p6.m.g(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.f212b = hashMap;
        this.f213c = bArr;
    }

    public final String toString() {
        Object valueOf;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb2 = new StringBuilder("DataItemParcelable[@");
        sb2.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f213c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        sb2.append(",dataSz=".concat(valueOf.toString()));
        HashMap hashMap = this.f212b;
        int size = hashMap.size();
        sb2.append(", numAssets=" + size);
        sb2.append(", uri=".concat(String.valueOf(this.f211a)));
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.f211a, i3);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        p6.m.g(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.f212b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((DataItemAssetParcelable) entry.getValue()));
        }
        j8.a.c(parcel, 4, bundle);
        j8.a.d(parcel, 5, this.f213c);
        j8.a.t(parcel, s6);
    }
}
