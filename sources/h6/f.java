package h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
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
    public static final int[] f13901a0;
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
    public final ArrayList f13902a;
    public final int[] f13903b;
    public final long f13904c;
    public final String d;
    public final int f13905e;
    public final int f13906f;
    public final int h;
    public final int f13907n;
    public final int f13908r;
    public final int f13909s;
    public final int f13910w;
    public final int f13911x;
    public final int f13912y;

    static {
        d0 d0Var = f0.f6521b;
        Object[] objArr = {"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"};
        for (int i7 = 0; i7 < 2; i7++) {
            if (objArr[i7] == null) {
                throw new NullPointerException(i5.c.i(i7, "at index "));
            }
        }
        Z = f0.m(2, objArr);
        f13901a0 = new int[]{0, 1};
        CREATOR = new t0(18);
    }

    public f(List list, int[] iArr, long j3, String str, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, IBinder iBinder, boolean z10, boolean z11) {
        p aVar;
        this.f13902a = new ArrayList(list);
        this.f13903b = Arrays.copyOf(iArr, iArr.length);
        this.f13904c = j3;
        this.d = str;
        this.f13905e = i7;
        this.f13906f = i10;
        this.h = i11;
        this.f13907n = i12;
        this.f13908r = i13;
        this.f13909s = i14;
        this.f13910w = i15;
        this.f13911x = i16;
        this.f13912y = i17;
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
        int r10 = cc.r(parcel, 20293);
        cc.n(parcel, 2, this.f13902a);
        int[] iArr = this.f13903b;
        cc.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        cc.q(parcel, 4, 8);
        parcel.writeLong(this.f13904c);
        cc.l(parcel, 5, this.d);
        cc.q(parcel, 6, 4);
        parcel.writeInt(this.f13905e);
        cc.q(parcel, 7, 4);
        parcel.writeInt(this.f13906f);
        cc.q(parcel, 8, 4);
        parcel.writeInt(this.h);
        cc.q(parcel, 9, 4);
        parcel.writeInt(this.f13907n);
        cc.q(parcel, 10, 4);
        parcel.writeInt(this.f13908r);
        cc.q(parcel, 11, 4);
        parcel.writeInt(this.f13909s);
        cc.q(parcel, 12, 4);
        parcel.writeInt(this.f13910w);
        cc.q(parcel, 13, 4);
        parcel.writeInt(this.f13911x);
        cc.q(parcel, 14, 4);
        parcel.writeInt(this.f13912y);
        cc.q(parcel, 15, 4);
        parcel.writeInt(this.E);
        cc.q(parcel, 16, 4);
        parcel.writeInt(this.F);
        cc.q(parcel, 17, 4);
        parcel.writeInt(this.G);
        cc.q(parcel, 18, 4);
        parcel.writeInt(this.H);
        cc.q(parcel, 19, 4);
        parcel.writeInt(this.I);
        cc.q(parcel, 20, 4);
        parcel.writeInt(this.J);
        cc.q(parcel, 21, 4);
        parcel.writeInt(this.K);
        cc.q(parcel, 22, 4);
        parcel.writeInt(this.L);
        cc.q(parcel, 23, 4);
        parcel.writeInt(this.M);
        cc.q(parcel, 24, 4);
        parcel.writeInt(this.N);
        cc.q(parcel, 25, 4);
        parcel.writeInt(this.O);
        cc.q(parcel, 26, 4);
        parcel.writeInt(this.P);
        cc.q(parcel, 27, 4);
        parcel.writeInt(this.Q);
        cc.q(parcel, 28, 4);
        parcel.writeInt(this.R);
        cc.q(parcel, 29, 4);
        parcel.writeInt(this.S);
        cc.q(parcel, 30, 4);
        parcel.writeInt(this.T);
        cc.q(parcel, 31, 4);
        parcel.writeInt(this.U);
        cc.q(parcel, 32, 4);
        parcel.writeInt(this.V);
        p pVar = this.W;
        if (pVar == null) {
            iBinder = null;
        } else {
            iBinder = pVar.f306b;
        }
        cc.f(parcel, 33, iBinder);
        cc.q(parcel, 34, 4);
        parcel.writeInt(this.X ? 1 : 0);
        cc.q(parcel, 35, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        cc.s(parcel, r10);
    }
}
