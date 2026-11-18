package b9;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c8.bc;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new c(8);
    public final Uri f3019a;
    public final HashMap f3020b;
    public final byte[] f3021c;

    public k(Uri uri, Bundle bundle, byte[] bArr) {
        this.f3019a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        q6.m.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            q6.m.h(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.f3020b = hashMap;
        this.f3021c = bArr;
    }

    public final String toString() {
        Object valueOf;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb2 = new StringBuilder("DataItemParcelable[@");
        sb2.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f3021c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        sb2.append(",dataSz=".concat(valueOf.toString()));
        HashMap hashMap = this.f3020b;
        int size = hashMap.size();
        sb2.append(", numAssets=" + size);
        sb2.append(", uri=".concat(String.valueOf(this.f3019a)));
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f3019a, i7);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        q6.m.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.f3020b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((DataItemAssetParcelable) entry.getValue()));
        }
        bc.b(parcel, 4, bundle);
        bc.c(parcel, 5, this.f3021c);
        bc.s(parcel, r10);
    }
}
