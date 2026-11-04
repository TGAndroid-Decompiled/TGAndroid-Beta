package g6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.e0;
import com.google.android.gms.internal.cast.g0;
import com.google.android.gms.internal.cast.k0;
import f6.c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k2.p1;
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR;
    public static final k0 Z;
    public static final int[] f11994a0;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final o W;
    public final boolean X;
    public final boolean Y;
    public final ArrayList f11995a;
    public final int[] f11996b;
    public final long f11997c;
    public final String d;
    public final int f11998e;
    public final int f11999f;
    public final int h;
    public final int f12000n;
    public final int f12001r;
    public final int f12002s;
    public final int f12003w;
    public final int f12004x;
    public final int f12005y;

    static {
        e0 e0Var = g0.f6920b;
        Object[] objArr = {"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"};
        for (int i3 = 0; i3 < 2; i3++) {
            if (objArr[i3] == null) {
                throw new NullPointerException(p1.i(i3, "at index "));
            }
        }
        Z = g0.m(2, objArr);
        f11994a0 = new int[]{0, 1};
        CREATOR = new c0(3);
    }

    public f(List list, int[] iArr, long j10, String str, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, IBinder iBinder, boolean z10, boolean z11) {
        o aVar;
        this.f11995a = new ArrayList(list);
        this.f11996b = Arrays.copyOf(iArr, iArr.length);
        this.f11997c = j10;
        this.d = str;
        this.f11998e = i3;
        this.f11999f = i10;
        this.h = i11;
        this.f12000n = i12;
        this.f12001r = i13;
        this.f12002s = i14;
        this.f12003w = i15;
        this.f12004x = i16;
        this.f12005y = i17;
        this.E = i18;
        this.F = i19;
        this.G = i20;
        this.H = i21;
        this.I = i22;
        this.J = i23;
        this.K = i24;
        this.L = i25;
        this.M = i26;
        this.N = i27;
        this.O = i28;
        this.P = i29;
        this.Q = i30;
        this.R = i31;
        this.S = i32;
        this.T = i33;
        this.U = i34;
        this.V = i35;
        this.X = z10;
        this.Y = z11;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            if (queryLocalInterface instanceof o) {
                aVar = (o) queryLocalInterface;
            } else {
                aVar = new b8.a(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 2);
            }
        }
        this.W = aVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        IBinder iBinder;
        int s6 = j8.a.s(parcel, 20293);
        j8.a.o(parcel, 2, this.f11995a);
        int[] iArr = this.f11996b;
        j8.a.h(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        j8.a.r(parcel, 4, 8);
        parcel.writeLong(this.f11997c);
        j8.a.m(parcel, 5, this.d);
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(this.f11998e);
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(this.f11999f);
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(this.h);
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(this.f12000n);
        j8.a.r(parcel, 10, 4);
        parcel.writeInt(this.f12001r);
        j8.a.r(parcel, 11, 4);
        parcel.writeInt(this.f12002s);
        j8.a.r(parcel, 12, 4);
        parcel.writeInt(this.f12003w);
        j8.a.r(parcel, 13, 4);
        parcel.writeInt(this.f12004x);
        j8.a.r(parcel, 14, 4);
        parcel.writeInt(this.f12005y);
        j8.a.r(parcel, 15, 4);
        parcel.writeInt(this.E);
        j8.a.r(parcel, 16, 4);
        parcel.writeInt(this.F);
        j8.a.r(parcel, 17, 4);
        parcel.writeInt(this.G);
        j8.a.r(parcel, 18, 4);
        parcel.writeInt(this.H);
        j8.a.r(parcel, 19, 4);
        parcel.writeInt(this.I);
        j8.a.r(parcel, 20, 4);
        parcel.writeInt(this.J);
        j8.a.r(parcel, 21, 4);
        parcel.writeInt(this.K);
        j8.a.r(parcel, 22, 4);
        parcel.writeInt(this.L);
        j8.a.r(parcel, 23, 4);
        parcel.writeInt(this.M);
        j8.a.r(parcel, 24, 4);
        parcel.writeInt(this.N);
        j8.a.r(parcel, 25, 4);
        parcel.writeInt(this.O);
        j8.a.r(parcel, 26, 4);
        parcel.writeInt(this.P);
        j8.a.r(parcel, 27, 4);
        parcel.writeInt(this.Q);
        j8.a.r(parcel, 28, 4);
        parcel.writeInt(this.R);
        j8.a.r(parcel, 29, 4);
        parcel.writeInt(this.S);
        j8.a.r(parcel, 30, 4);
        parcel.writeInt(this.T);
        j8.a.r(parcel, 31, 4);
        parcel.writeInt(this.U);
        j8.a.r(parcel, 32, 4);
        parcel.writeInt(this.V);
        o oVar = this.W;
        if (oVar == null) {
            iBinder = null;
        } else {
            iBinder = oVar.f2456b;
        }
        j8.a.g(parcel, 33, iBinder);
        j8.a.r(parcel, 34, 4);
        parcel.writeInt(this.X ? 1 : 0);
        j8.a.r(parcel, 35, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
