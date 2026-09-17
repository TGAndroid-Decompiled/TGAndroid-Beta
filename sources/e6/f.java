package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.h0;
import com.google.android.gms.internal.cast.j0;
import com.google.android.gms.internal.cast.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR;
    public static final o0 Y;
    public static final int[] Z;
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
    public final q V;
    public final boolean W;
    public final boolean X;
    public final ArrayList f8892a;
    public final int[] f8893b;
    public final long f8894c;
    public final String d;
    public final int f8895e;
    public final int f8896f;
    public final int h;
    public final int f8897n;
    public final int f8898r;
    public final int f8899s;
    public final int v;
    public final int f8900w;
    public final int f8901x;
    public final int f8902y;

    static {
        h0 h0Var = j0.f5399b;
        Object[] objArr = {"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"};
        for (int i10 = 0; i10 < 2; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(i2.g.i(i10, "at index "));
            }
        }
        Y = j0.r(2, objArr);
        Z = new int[]{0, 1};
        CREATOR = new i(0);
    }

    public f(List list, int[] iArr, long j3, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, IBinder iBinder, boolean z10, boolean z11) {
        q aVar;
        this.f8892a = new ArrayList(list);
        this.f8893b = Arrays.copyOf(iArr, iArr.length);
        this.f8894c = j3;
        this.d = str;
        this.f8895e = i10;
        this.f8896f = i11;
        this.h = i12;
        this.f8897n = i13;
        this.f8898r = i14;
        this.f8899s = i15;
        this.v = i16;
        this.f8900w = i17;
        this.f8901x = i18;
        this.f8902y = i19;
        this.E = i20;
        this.F = i21;
        this.G = i22;
        this.H = i23;
        this.I = i24;
        this.J = i25;
        this.K = i26;
        this.L = i27;
        this.M = i28;
        this.N = i29;
        this.O = i30;
        this.P = i31;
        this.Q = i32;
        this.R = i33;
        this.S = i34;
        this.T = i35;
        this.U = i36;
        this.W = z10;
        this.X = z11;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            if (queryLocalInterface instanceof q) {
                aVar = (q) queryLocalInterface;
            } else {
                aVar = new a9.a(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 1);
            }
        }
        this.V = aVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinder;
        int q6 = e0.q(parcel, 20293);
        e0.n(parcel, 2, this.f8892a);
        int[] iArr = this.f8893b;
        e0.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        e0.s(parcel, 4, 8);
        parcel.writeLong(this.f8894c);
        e0.l(parcel, 5, this.d);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.f8895e);
        e0.s(parcel, 7, 4);
        parcel.writeInt(this.f8896f);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.h);
        e0.s(parcel, 9, 4);
        parcel.writeInt(this.f8897n);
        e0.s(parcel, 10, 4);
        parcel.writeInt(this.f8898r);
        e0.s(parcel, 11, 4);
        parcel.writeInt(this.f8899s);
        e0.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        e0.s(parcel, 13, 4);
        parcel.writeInt(this.f8900w);
        e0.s(parcel, 14, 4);
        parcel.writeInt(this.f8901x);
        e0.s(parcel, 15, 4);
        parcel.writeInt(this.f8902y);
        e0.s(parcel, 16, 4);
        parcel.writeInt(this.E);
        e0.s(parcel, 17, 4);
        parcel.writeInt(this.F);
        e0.s(parcel, 18, 4);
        parcel.writeInt(this.G);
        e0.s(parcel, 19, 4);
        parcel.writeInt(this.H);
        e0.s(parcel, 20, 4);
        parcel.writeInt(this.I);
        e0.s(parcel, 21, 4);
        parcel.writeInt(this.J);
        e0.s(parcel, 22, 4);
        parcel.writeInt(this.K);
        e0.s(parcel, 23, 4);
        parcel.writeInt(this.L);
        e0.s(parcel, 24, 4);
        parcel.writeInt(this.M);
        e0.s(parcel, 25, 4);
        parcel.writeInt(this.N);
        e0.s(parcel, 26, 4);
        parcel.writeInt(this.O);
        e0.s(parcel, 27, 4);
        parcel.writeInt(this.P);
        e0.s(parcel, 28, 4);
        parcel.writeInt(this.Q);
        e0.s(parcel, 29, 4);
        parcel.writeInt(this.R);
        e0.s(parcel, 30, 4);
        parcel.writeInt(this.S);
        e0.s(parcel, 31, 4);
        parcel.writeInt(this.T);
        e0.s(parcel, 32, 4);
        parcel.writeInt(this.U);
        q qVar = this.V;
        if (qVar == null) {
            iBinder = null;
        } else {
            iBinder = qVar.f336b;
        }
        e0.f(parcel, 33, iBinder);
        e0.s(parcel, 34, 4);
        parcel.writeInt(this.W ? 1 : 0);
        e0.s(parcel, 35, 4);
        parcel.writeInt(this.X ? 1 : 0);
        e0.r(parcel, q6);
    }
}
