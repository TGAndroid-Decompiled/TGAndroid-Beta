package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
public final class j extends c6.a {
    public static final Parcelable.Creator<j> CREATOR = new f8.o(24);
    public boolean f9276a;
    public boolean f9277b;
    public c f9278c;
    public boolean d;
    public m e;
    public ArrayList f9279f;
    public l h;
    public n f9280n;
    public boolean f9281r;
    public String f9282s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        boolean z4 = this.f9276a;
        f5.s(parcel, 1, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f9277b;
        f5.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f5.k(parcel, 3, this.f9278c, i10);
        boolean z11 = this.d;
        f5.s(parcel, 4, 4);
        parcel.writeInt(z11 ? 1 : 0);
        f5.k(parcel, 5, this.e, i10);
        f5.h(parcel, 6, this.f9279f);
        f5.k(parcel, 7, this.h, i10);
        f5.k(parcel, 8, this.f9280n, i10);
        boolean z12 = this.f9281r;
        f5.s(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        f5.l(parcel, 10, this.f9282s);
        f5.b(parcel, 11, this.v);
        f5.r(parcel, q10);
    }
}
