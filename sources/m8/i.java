package m8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BinderWrapper;
import n4.o;
import n4.p;
import n4.v;
import n4.w;
import n4.x;
import n6.f0;
import n6.j;
import n6.n;
import n6.u;
import p7.k;
import p7.l;
import w7.h0;
public final class i implements Parcelable.Creator {
    public final int f13032a;

    public i(int i10) {
        this.f13032a = i10;
    }

    public static void a(n6.f fVar, Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = fVar.f13568a;
        h0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.f13569b;
        h0.s(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.f13570c;
        h0.s(parcel, 3, 4);
        parcel.writeInt(i13);
        h0.l(parcel, 4, fVar.d);
        h0.f(parcel, 5, fVar.e);
        h0.o(parcel, 6, fVar.f13571f, i10);
        h0.b(parcel, 7, fVar.h);
        h0.k(parcel, 8, fVar.f13572n, i10);
        h0.o(parcel, 10, fVar.f13573r, i10);
        h0.o(parcel, 11, fVar.f13574s, i10);
        boolean z10 = fVar.f13575w;
        h0.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = fVar.f13576x;
        h0.s(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = fVar.f13577y;
        h0.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        h0.l(parcel, 15, fVar.D);
        h0.r(parcel, q6);
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r24) {
        throw new UnsupportedOperationException("Method not decompiled: m8.i.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f13032a) {
            case 0:
                return new h[i10];
            case 1:
                return new b[i10];
            case 2:
                return new n4.h[i10];
            case 3:
                return new n4.i[i10];
            case 4:
                return new o[i10];
            case 5:
                return new p[i10];
            case 6:
                return new w[i10];
            case 7:
                return new v[i10];
            case 8:
                return new x[i10];
            case 9:
                return new n6.d[i10];
            case 10:
                return new n6.o[i10];
            case 11:
                return new j[i10];
            case 12:
                return new u[i10];
            case 13:
                return new n6.v[i10];
            case 14:
                return new n[i10];
            case 15:
                return new BinderWrapper[i10];
            case 16:
                return new f0[i10];
            case 17:
                return new n6.e[i10];
            case 18:
                return new n6.f[i10];
            case 19:
                return new o8.b[i10];
            case 20:
                return new o8.f[i10];
            case 21:
                return new o8.g[i10];
            case 22:
                return new o8.h[i10];
            case 23:
                return new p7.e[i10];
            case 24:
                return new p7.f[i10];
            case 25:
                return new p7.g[i10];
            case 26:
                return new p7.h[i10];
            case 27:
                return new p7.i[i10];
            case 28:
                return new k[i10];
            default:
                return new l[i10];
        }
    }
}
