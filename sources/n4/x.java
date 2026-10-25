package n4;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BinderWrapper;
import o6.f0;
public final class x implements Parcelable.Creator {
    public final int f18705a;

    public x(int i10) {
        this.f18705a = i10;
    }

    public static void a(o6.f fVar, Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = fVar.f19110a;
        df.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.f19111b;
        df.s(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.f19112c;
        df.s(parcel, 3, 4);
        parcel.writeInt(i13);
        df.l(parcel, 4, fVar.d);
        df.f(parcel, 5, fVar.e);
        df.o(parcel, 6, fVar.f19113f, i10);
        df.b(parcel, 7, fVar.h);
        df.k(parcel, 8, fVar.f19114n, i10);
        df.o(parcel, 10, fVar.f19115r, i10);
        df.o(parcel, 11, fVar.f19116s, i10);
        boolean z10 = fVar.v;
        df.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = fVar.f19117w;
        df.s(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = fVar.f19118x;
        df.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        df.l(parcel, 15, fVar.f19119y);
        df.r(parcel, q5);
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r24) {
        throw new UnsupportedOperationException("Method not decompiled: n4.x.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f18705a) {
            case 0:
                return new z[i10];
            case 1:
                return new y[i10];
            case 2:
                return new a0[i10];
            case 3:
                return new n6.a[i10];
            case 4:
                return new n8.e[i10];
            case 5:
                return new n8.a[i10];
            case 6:
                return new n8.f[i10];
            case 7:
                return new n8.g[i10];
            case 8:
                return new n8.h[i10];
            case 9:
                return new n8.b[i10];
            case 10:
                return new o6.d[i10];
            case 11:
                return new o6.o[i10];
            case 12:
                return new o6.j[i10];
            case 13:
                return new o6.u[i10];
            case 14:
                return new o6.v[i10];
            case 15:
                return new o6.n[i10];
            case 16:
                return new BinderWrapper[i10];
            case 17:
                return new f0[i10];
            case 18:
                return new o6.e[i10];
            case 19:
                return new o6.f[i10];
            case 20:
                return new p8.b[i10];
            case 21:
                return new p8.f[i10];
            case 22:
                return new p8.g[i10];
            case 23:
                return new p8.h[i10];
            case 24:
                return new q7.e[i10];
            case 25:
                return new q7.f[i10];
            case 26:
                return new q7.g[i10];
            case 27:
                return new q7.h[i10];
            case 28:
                return new q7.i[i10];
            default:
                return new q7.k[i10];
        }
    }
}
