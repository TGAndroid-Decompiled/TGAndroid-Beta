package o5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.f0;
import com.google.android.gms.internal.cast.h0;
import com.google.android.gms.internal.cast.m0;
import g7.p8;
import j3.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR;
    public static final m0 U;
    public static final int[] V;
    public final int A;
    public final int B;
    public final int C;
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
    public final o R;
    public final boolean S;
    public final boolean T;
    public final ArrayList f18972a;
    public final int[] f18973b;
    public final long f18974c;
    public final String d;
    public final int f18975e;
    public final int f18976f;
    public final int h;
    public final int f18977n;
    public final int f18978r;
    public final int f18979s;
    public final int v;
    public final int f18980w;
    public final int f18981x;
    public final int f18982y;

    static {
        f0 f0Var = h0.f3120b;
        Object[] objArr = {"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"};
        for (int i9 = 0; i9 < 2; i9++) {
            if (objArr[i9] == null) {
                throw new NullPointerException(r0.l(i9, "at index "));
            }
        }
        U = h0.r(2, objArr);
        V = new int[]{0, 1};
        CREATOR = new m6.r0(29);
    }

    public f(List list, int[] iArr, long j10, String str, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, IBinder iBinder, boolean z10, boolean z11) {
        o aVar;
        this.f18972a = new ArrayList(list);
        this.f18973b = Arrays.copyOf(iArr, iArr.length);
        this.f18974c = j10;
        this.d = str;
        this.f18975e = i9;
        this.f18976f = i10;
        this.h = i11;
        this.f18977n = i12;
        this.f18978r = i13;
        this.f18979s = i14;
        this.v = i15;
        this.f18980w = i16;
        this.f18981x = i17;
        this.f18982y = i18;
        this.A = i19;
        this.B = i20;
        this.C = i21;
        this.D = i22;
        this.E = i23;
        this.F = i24;
        this.G = i25;
        this.H = i26;
        this.I = i27;
        this.J = i28;
        this.K = i29;
        this.L = i30;
        this.M = i31;
        this.N = i32;
        this.O = i33;
        this.P = i34;
        this.Q = i35;
        this.S = z10;
        this.T = z11;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            if (queryLocalInterface instanceof o) {
                aVar = (o) queryLocalInterface;
            } else {
                aVar = new b7.a(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 2);
            }
        }
        this.R = aVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        IBinder iBinder;
        int q10 = p8.q(parcel, 20293);
        p8.n(parcel, 2, this.f18972a);
        int[] iArr = this.f18973b;
        p8.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        p8.s(parcel, 4, 8);
        parcel.writeLong(this.f18974c);
        p8.l(parcel, 5, this.d);
        p8.s(parcel, 6, 4);
        parcel.writeInt(this.f18975e);
        p8.s(parcel, 7, 4);
        parcel.writeInt(this.f18976f);
        p8.s(parcel, 8, 4);
        parcel.writeInt(this.h);
        p8.s(parcel, 9, 4);
        parcel.writeInt(this.f18977n);
        p8.s(parcel, 10, 4);
        parcel.writeInt(this.f18978r);
        p8.s(parcel, 11, 4);
        parcel.writeInt(this.f18979s);
        p8.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        p8.s(parcel, 13, 4);
        parcel.writeInt(this.f18980w);
        p8.s(parcel, 14, 4);
        parcel.writeInt(this.f18981x);
        p8.s(parcel, 15, 4);
        parcel.writeInt(this.f18982y);
        p8.s(parcel, 16, 4);
        parcel.writeInt(this.A);
        p8.s(parcel, 17, 4);
        parcel.writeInt(this.B);
        p8.s(parcel, 18, 4);
        parcel.writeInt(this.C);
        p8.s(parcel, 19, 4);
        parcel.writeInt(this.D);
        p8.s(parcel, 20, 4);
        parcel.writeInt(this.E);
        p8.s(parcel, 21, 4);
        parcel.writeInt(this.F);
        p8.s(parcel, 22, 4);
        parcel.writeInt(this.G);
        p8.s(parcel, 23, 4);
        parcel.writeInt(this.H);
        p8.s(parcel, 24, 4);
        parcel.writeInt(this.I);
        p8.s(parcel, 25, 4);
        parcel.writeInt(this.J);
        p8.s(parcel, 26, 4);
        parcel.writeInt(this.K);
        p8.s(parcel, 27, 4);
        parcel.writeInt(this.L);
        p8.s(parcel, 28, 4);
        parcel.writeInt(this.M);
        p8.s(parcel, 29, 4);
        parcel.writeInt(this.N);
        p8.s(parcel, 30, 4);
        parcel.writeInt(this.O);
        p8.s(parcel, 31, 4);
        parcel.writeInt(this.P);
        p8.s(parcel, 32, 4);
        parcel.writeInt(this.Q);
        o oVar = this.R;
        if (oVar == null) {
            iBinder = null;
        } else {
            iBinder = oVar.f1549b;
        }
        p8.f(parcel, 33, iBinder);
        p8.s(parcel, 34, 4);
        parcel.writeInt(this.S ? 1 : 0);
        p8.s(parcel, 35, 4);
        parcel.writeInt(this.T ? 1 : 0);
        p8.r(parcel, q10);
    }
}
