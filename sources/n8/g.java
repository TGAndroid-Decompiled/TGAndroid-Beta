package n8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BinderWrapper;
import o8.h;
import p4.i;
import p4.o;
import p4.p;
import p4.v;
import p4.w;
import p4.x;
import p6.h0;
import p6.k;
import p6.r;
public final class g implements Parcelable.Creator {
    public final int f20282a;

    public g(int i3) {
        this.f20282a = i3;
    }

    public static void a(p6.g gVar, Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = gVar.f53249a;
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = gVar.f53250b;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = gVar.f53251c;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(i12);
        j8.a.m(parcel, 4, gVar.d);
        j8.a.g(parcel, 5, gVar.f53252e);
        j8.a.p(parcel, 6, gVar.f53253f, i3);
        j8.a.c(parcel, 7, gVar.h);
        j8.a.l(parcel, 8, gVar.f53254n, i3);
        j8.a.p(parcel, 10, gVar.f53255r, i3);
        j8.a.p(parcel, 11, gVar.f53256s, i3);
        boolean z10 = gVar.f53257w;
        j8.a.r(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = gVar.f53258x;
        j8.a.r(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z11 = gVar.f53259y;
        j8.a.r(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        j8.a.m(parcel, 15, gVar.E);
        j8.a.t(parcel, s6);
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r24) {
        throw new UnsupportedOperationException("Method not decompiled: n8.g.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f20282a) {
            case 0:
                return new c[i3];
            case 1:
                return new d[i3];
            case 2:
                return new o6.a[i3];
            case 3:
                return new o8.e[i3];
            case 4:
                return new o8.a[i3];
            case 5:
                return new o8.f[i3];
            case 6:
                return new o8.g[i3];
            case 7:
                return new h[i3];
            case 8:
                return new o8.b[i3];
            case 9:
                return new p4.h[i3];
            case 10:
                return new i[i3];
            case 11:
                return new o[i3];
            case 12:
                return new p[i3];
            case 13:
                return new w[i3];
            case 14:
                return new v[i3];
            case 15:
                return new x[i3];
            case 16:
                return new p6.e[i3];
            case 17:
                return new p6.p[i3];
            case 18:
                return new r[i3];
            case 19:
                return new k[i3];
            case 20:
                return new p6.w[i3];
            case 21:
                return new p6.x[i3];
            case 22:
                return new p6.o[i3];
            case 23:
                return new BinderWrapper[i3];
            case 24:
                return new h0[i3];
            case 25:
                return new p6.f[i3];
            case 26:
                return new p6.g[i3];
            case 27:
                return new q8.b[i3];
            case 28:
                return new q8.f[i3];
            default:
                return new q8.g[i3];
        }
    }
}
