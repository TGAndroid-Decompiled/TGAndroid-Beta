package m8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import j7.g5;
import java.util.HashMap;
import java.util.Map;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new c(8);
    public final Uri f13545a;
    public final HashMap f13546b;
    public final byte[] f13547c;

    public m(Uri uri, Bundle bundle, byte[] bArr) {
        this.f13545a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        b6.m.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            b6.m.h(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.f13546b = hashMap;
        this.f13547c = bArr;
    }

    public final String toString() {
        Object valueOf;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f13547c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        sb.append(",dataSz=".concat(valueOf.toString()));
        HashMap hashMap = this.f13546b;
        int size = hashMap.size();
        sb.append(", numAssets=" + size);
        sb.append(", uri=".concat(String.valueOf(this.f13545a)));
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : hashMap.keySet()) {
            String valueOf2 = String.valueOf(hashMap.get(str));
            sb.append("\n    " + str + ": " + valueOf2);
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f13545a, i10);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        b6.m.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.f13546b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((l8.f) entry.getValue()));
        }
        g5.b(parcel, 4, bundle);
        g5.c(parcel, 5, this.f13547c);
        g5.r(parcel, q10);
    }
}
