package h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.cast.d0;
import com.google.android.gms.internal.cast.f0;
import com.google.android.gms.internal.cast.j0;
import f7.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR;
    public static final j0 Z;
    public static final int[] f13594a0;
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
    public final p W;
    public final boolean X;
    public final boolean Y;
    public final ArrayList f13595a;
    public final int[] f13596b;
    public final long f13597c;
    public final String d;
    public final int f13598e;
    public final int f13599f;
    public final int h;
    public final int f13600n;
    public final int f13601r;
    public final int f13602s;
    public final int f13603w;
    public final int f13604x;
    public final int f13605y;

    static {
        d0 d0Var = f0.f6246b;
        Object[] objArr = {"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"};
        for (int i7 = 0; i7 < 2; i7++) {
            if (objArr[i7] == null) {
                throw new NullPointerException(i5.c.i(i7, "at index "));
            }
        }
        Z = f0.m(2, objArr);
        f13594a0 = new int[]{0, 1};
        CREATOR = new t0(18);
    }

    public f(List list, int[] iArr, long j3, String str, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, IBinder iBinder, boolean z10, boolean z11) {
        p aVar;
        this.f13595a = new ArrayList(list);
        this.f13596b = Arrays.copyOf(iArr, iArr.length);
        this.f13597c = j3;
        this.d = str;
        this.f13598e = i7;
        this.f13599f = i10;
        this.h = i11;
        this.f13600n = i12;
        this.f13601r = i13;
        this.f13602s = i14;
        this.f13603w = i15;
        this.f13604x = i16;
        this.f13605y = i17;
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
            if (queryLocalInterface instanceof p) {
                aVar = (p) queryLocalInterface;
            } else {
                aVar = new a8.a(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 2);
            }
        }
        this.W = aVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder iBinder;
        int r10 = yb.r(parcel, 20293);
        yb.n(parcel, 2, this.f13595a);
        int[] iArr = this.f13596b;
        yb.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        yb.q(parcel, 4, 8);
        parcel.writeLong(this.f13597c);
        yb.l(parcel, 5, this.d);
        yb.q(parcel, 6, 4);
        parcel.writeInt(this.f13598e);
        yb.q(parcel, 7, 4);
        parcel.writeInt(this.f13599f);
        yb.q(parcel, 8, 4);
        parcel.writeInt(this.h);
        yb.q(parcel, 9, 4);
        parcel.writeInt(this.f13600n);
        yb.q(parcel, 10, 4);
        parcel.writeInt(this.f13601r);
        yb.q(parcel, 11, 4);
        parcel.writeInt(this.f13602s);
        yb.q(parcel, 12, 4);
        parcel.writeInt(this.f13603w);
        yb.q(parcel, 13, 4);
        parcel.writeInt(this.f13604x);
        yb.q(parcel, 14, 4);
        parcel.writeInt(this.f13605y);
        yb.q(parcel, 15, 4);
        parcel.writeInt(this.E);
        yb.q(parcel, 16, 4);
        parcel.writeInt(this.F);
        yb.q(parcel, 17, 4);
        parcel.writeInt(this.G);
        yb.q(parcel, 18, 4);
        parcel.writeInt(this.H);
        yb.q(parcel, 19, 4);
        parcel.writeInt(this.I);
        yb.q(parcel, 20, 4);
        parcel.writeInt(this.J);
        yb.q(parcel, 21, 4);
        parcel.writeInt(this.K);
        yb.q(parcel, 22, 4);
        parcel.writeInt(this.L);
        yb.q(parcel, 23, 4);
        parcel.writeInt(this.M);
        yb.q(parcel, 24, 4);
        parcel.writeInt(this.N);
        yb.q(parcel, 25, 4);
        parcel.writeInt(this.O);
        yb.q(parcel, 26, 4);
        parcel.writeInt(this.P);
        yb.q(parcel, 27, 4);
        parcel.writeInt(this.Q);
        yb.q(parcel, 28, 4);
        parcel.writeInt(this.R);
        yb.q(parcel, 29, 4);
        parcel.writeInt(this.S);
        yb.q(parcel, 30, 4);
        parcel.writeInt(this.T);
        yb.q(parcel, 31, 4);
        parcel.writeInt(this.U);
        yb.q(parcel, 32, 4);
        parcel.writeInt(this.V);
        p pVar = this.W;
        if (pVar == null) {
            iBinder = null;
        } else {
            iBinder = pVar.f306b;
        }
        yb.f(parcel, 33, iBinder);
        yb.q(parcel, 34, 4);
        parcel.writeInt(this.X ? 1 : 0);
        yb.q(parcel, 35, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        yb.s(parcel, r10);
    }
}
