package h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.internal.cast.d0;
import com.google.android.gms.internal.cast.f0;
import com.google.android.gms.internal.cast.j0;
import f7.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR;
    public static final j0 Y;
    public static final int[] Z;
    public final int D;
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
    public final p V;
    public final boolean W;
    public final boolean X;
    public final ArrayList f14237a;
    public final int[] f14238b;
    public final long f14239c;
    public final String d;
    public final int f14240e;
    public final int f14241f;
    public final int h;
    public final int f14242n;
    public final int f14243r;
    public final int f14244s;
    public final int f14245w;
    public final int f14246x;
    public final int f14247y;

    static {
        d0 d0Var = f0.f6857b;
        Object[] objArr = {"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"};
        for (int i7 = 0; i7 < 2; i7++) {
            if (objArr[i7] == null) {
                throw new NullPointerException(jg.g.j(i7, "at index "));
            }
        }
        Y = f0.m(2, objArr);
        Z = new int[]{0, 1};
        CREATOR = new t0(18);
    }

    public f(List list, int[] iArr, long j3, String str, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, IBinder iBinder, boolean z9, boolean z10) {
        p aVar;
        this.f14237a = new ArrayList(list);
        this.f14238b = Arrays.copyOf(iArr, iArr.length);
        this.f14239c = j3;
        this.d = str;
        this.f14240e = i7;
        this.f14241f = i10;
        this.h = i11;
        this.f14242n = i12;
        this.f14243r = i13;
        this.f14244s = i14;
        this.f14245w = i15;
        this.f14246x = i16;
        this.f14247y = i17;
        this.D = i18;
        this.E = i19;
        this.F = i20;
        this.G = i21;
        this.H = i22;
        this.I = i23;
        this.J = i24;
        this.K = i25;
        this.L = i26;
        this.M = i27;
        this.N = i28;
        this.O = i29;
        this.P = i30;
        this.Q = i31;
        this.R = i32;
        this.S = i33;
        this.T = i34;
        this.U = i35;
        this.W = z9;
        this.X = z10;
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
        this.V = aVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder iBinder;
        int r10 = xb.r(parcel, 20293);
        xb.n(parcel, 2, this.f14237a);
        int[] iArr = this.f14238b;
        xb.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        xb.q(parcel, 4, 8);
        parcel.writeLong(this.f14239c);
        xb.l(parcel, 5, this.d);
        xb.q(parcel, 6, 4);
        parcel.writeInt(this.f14240e);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.f14241f);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.h);
        xb.q(parcel, 9, 4);
        parcel.writeInt(this.f14242n);
        xb.q(parcel, 10, 4);
        parcel.writeInt(this.f14243r);
        xb.q(parcel, 11, 4);
        parcel.writeInt(this.f14244s);
        xb.q(parcel, 12, 4);
        parcel.writeInt(this.f14245w);
        xb.q(parcel, 13, 4);
        parcel.writeInt(this.f14246x);
        xb.q(parcel, 14, 4);
        parcel.writeInt(this.f14247y);
        xb.q(parcel, 15, 4);
        parcel.writeInt(this.D);
        xb.q(parcel, 16, 4);
        parcel.writeInt(this.E);
        xb.q(parcel, 17, 4);
        parcel.writeInt(this.F);
        xb.q(parcel, 18, 4);
        parcel.writeInt(this.G);
        xb.q(parcel, 19, 4);
        parcel.writeInt(this.H);
        xb.q(parcel, 20, 4);
        parcel.writeInt(this.I);
        xb.q(parcel, 21, 4);
        parcel.writeInt(this.J);
        xb.q(parcel, 22, 4);
        parcel.writeInt(this.K);
        xb.q(parcel, 23, 4);
        parcel.writeInt(this.L);
        xb.q(parcel, 24, 4);
        parcel.writeInt(this.M);
        xb.q(parcel, 25, 4);
        parcel.writeInt(this.N);
        xb.q(parcel, 26, 4);
        parcel.writeInt(this.O);
        xb.q(parcel, 27, 4);
        parcel.writeInt(this.P);
        xb.q(parcel, 28, 4);
        parcel.writeInt(this.Q);
        xb.q(parcel, 29, 4);
        parcel.writeInt(this.R);
        xb.q(parcel, 30, 4);
        parcel.writeInt(this.S);
        xb.q(parcel, 31, 4);
        parcel.writeInt(this.T);
        xb.q(parcel, 32, 4);
        parcel.writeInt(this.U);
        p pVar = this.V;
        if (pVar == null) {
            iBinder = null;
        } else {
            iBinder = pVar.f306b;
        }
        xb.f(parcel, 33, iBinder);
        xb.q(parcel, 34, 4);
        parcel.writeInt(this.W ? 1 : 0);
        xb.q(parcel, 35, 4);
        parcel.writeInt(this.X ? 1 : 0);
        xb.s(parcel, r10);
    }
}
