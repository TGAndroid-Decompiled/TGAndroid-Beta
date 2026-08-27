package a7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;

public final class h extends z5.a {

    public final String f114a;

    public final l f115b;

    public final int f116c;
    public final byte[] d;

    public static final int f113e = Integer.parseInt("-1");
    public static final Parcelable.Creator<h> CREATOR = new w.a(4);

    static {
        ArrayList arrayList = new ArrayList();
    }

    public h(String str, l lVar, int i10, byte[] bArr) {
        String str2;
        String str3;
        String string = null;
        boolean z10 = true;
        int i11 = f113e;
        if (i10 != i11) {
            if (i10 >= 0) {
                String[] strArr = k.f122a;
                if (i10 < 10) {
                    str3 = strArr[i10];
                }
                if (str3 == null) {
                    z10 = false;
                }
            } else {
                String[] strArr2 = k.f122a;
            }
            str3 = null;
            if (str3 == null) {
                z10 = false;
            }
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid section type ");
        sb2.append(i10);
        y5.l.a(sb2.toString(), z10);
        this.f114a = str;
        this.f115b = lVar;
        this.f116c = i10;
        this.d = bArr;
        if (i10 != i11) {
            if (i10 >= 0) {
                String[] strArr3 = k.f122a;
                if (i10 < 10) {
                    str2 = strArr3[i10];
                }
                if (str2 == null) {
                    StringBuilder sb3 = new StringBuilder(32);
                    sb3.append("Invalid section type ");
                    sb3.append(i10);
                    string = sb3.toString();
                } else if (str != null) {
                    string = "Both content and blobContent set";
                }
            } else {
                String[] strArr4 = k.f122a;
            }
            str2 = null;
            if (str2 == null) {
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append("Invalid section type ");
                sb4.append(i10);
                string = sb4.toString();
            } else if (str != null) {
                string = "Both content and blobContent set";
            }
        } else if (str != null && bArr != null) {
            string = "Both content and blobContent set";
        }
        if (string != null) {
            throw new IllegalArgumentException(string);
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f114a);
        r8.k(parcel, 3, this.f115b, i10);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f116c);
        r8.c(parcel, 5, this.d);
        r8.r(parcel, iQ);
    }
}
