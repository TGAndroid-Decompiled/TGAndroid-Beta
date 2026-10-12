package m8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BinderWrapper;
import n4.q;
import n4.r;
import n4.x;
import n4.y;
import n4.z;
import n6.j;
import n6.n;
import n6.p;
import n6.v;
import n6.w;
import p7.k;
import w7.g0;
public final class h implements Parcelable.Creator {
    public final int f15715a;

    public h(int i10) {
        this.f15715a = i10;
    }

    public static void a(n6.f fVar, Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = fVar.f16073a;
        g0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.f16074b;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.f16075c;
        g0.s(parcel, 3, 4);
        parcel.writeInt(i13);
        g0.l(parcel, 4, fVar.d);
        g0.f(parcel, 5, fVar.e);
        g0.o(parcel, 6, fVar.f16076f, i10);
        g0.b(parcel, 7, fVar.h);
        g0.k(parcel, 8, fVar.f16077n, i10);
        g0.o(parcel, 10, fVar.f16078r, i10);
        g0.o(parcel, 11, fVar.f16079s, i10);
        boolean z10 = fVar.v;
        g0.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = fVar.f16080w;
        g0.s(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = fVar.f16081x;
        g0.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        g0.l(parcel, 15, fVar.f16082y);
        g0.r(parcel, q6);
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r24) {
        throw new UnsupportedOperationException("Method not decompiled: m8.h.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f15715a) {
            case 0:
                return new g[i10];
            case 1:
                return new i[i10];
            case 2:
                return new b[i10];
            case 3:
                return new n4.h[i10];
            case 4:
                return new n4.i[i10];
            case 5:
                return new q[i10];
            case 6:
                return new r[i10];
            case 7:
                return new y[i10];
            case 8:
                return new x[i10];
            case 9:
                return new z[i10];
            case 10:
                return new n6.d[i10];
            case 11:
                return new p[i10];
            case 12:
                return new j[i10];
            case 13:
                return new v[i10];
            case 14:
                return new w[i10];
            case 15:
                return new n[i10];
            case 16:
                return new BinderWrapper[i10];
            case 17:
                return new n6.g0[i10];
            case 18:
                return new n6.e[i10];
            case 19:
                return new n6.f[i10];
            case 20:
                return new o8.b[i10];
            case 21:
                return new o8.f[i10];
            case 22:
                return new o8.g[i10];
            case 23:
                return new o8.h[i10];
            case 24:
                return new p7.e[i10];
            case 25:
                return new p7.f[i10];
            case 26:
                return new p7.g[i10];
            case 27:
                return new p7.h[i10];
            case 28:
                return new p7.i[i10];
            default:
                return new k[i10];
        }
    }
}
