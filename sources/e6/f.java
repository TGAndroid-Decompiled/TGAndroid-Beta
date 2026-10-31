package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;
import com.google.android.gms.internal.cast.e0;
import com.google.android.gms.internal.cast.g0;
import com.google.android.gms.internal.cast.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w7.h0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR;
    public static final l0 Y;
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
    public final o V;
    public final boolean W;
    public final boolean X;
    public final ArrayList f6274a;
    public final int[] f6275b;
    public final long f6276c;
    public final String d;
    public final int e;
    public final int f6277f;
    public final int h;
    public final int f6278n;
    public final int f6279r;
    public final int f6280s;
    public final int f6281w;
    public final int f6282x;
    public final int f6283y;

    static {
        e0 e0Var = g0.f4660b;
        Object[] objArr = {"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"};
        for (int i10 = 0; i10 < 2; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(i0.a.i(i10, "at index "));
            }
        }
        Y = g0.q(2, objArr);
        Z = new int[]{0, 1};
        CREATOR = new r0(29);
    }

    public f(List list, int[] iArr, long j10, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, IBinder iBinder, boolean z10, boolean z11) {
        o aVar;
        this.f6274a = new ArrayList(list);
        this.f6275b = Arrays.copyOf(iArr, iArr.length);
        this.f6276c = j10;
        this.d = str;
        this.e = i10;
        this.f6277f = i11;
        this.h = i12;
        this.f6278n = i13;
        this.f6279r = i14;
        this.f6280s = i15;
        this.f6281w = i16;
        this.f6282x = i17;
        this.f6283y = i18;
        this.D = i19;
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
            if (queryLocalInterface instanceof o) {
                aVar = (o) queryLocalInterface;
            } else {
                aVar = new a9.a(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 1);
            }
        }
        this.V = aVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinder;
        int q6 = h0.q(parcel, 20293);
        h0.n(parcel, 2, this.f6274a);
        int[] iArr = this.f6275b;
        h0.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        h0.s(parcel, 4, 8);
        parcel.writeLong(this.f6276c);
        h0.l(parcel, 5, this.d);
        h0.s(parcel, 6, 4);
        parcel.writeInt(this.e);
        h0.s(parcel, 7, 4);
        parcel.writeInt(this.f6277f);
        h0.s(parcel, 8, 4);
        parcel.writeInt(this.h);
        h0.s(parcel, 9, 4);
        parcel.writeInt(this.f6278n);
        h0.s(parcel, 10, 4);
        parcel.writeInt(this.f6279r);
        h0.s(parcel, 11, 4);
        parcel.writeInt(this.f6280s);
        h0.s(parcel, 12, 4);
        parcel.writeInt(this.f6281w);
        h0.s(parcel, 13, 4);
        parcel.writeInt(this.f6282x);
        h0.s(parcel, 14, 4);
        parcel.writeInt(this.f6283y);
        h0.s(parcel, 15, 4);
        parcel.writeInt(this.D);
        h0.s(parcel, 16, 4);
        parcel.writeInt(this.E);
        h0.s(parcel, 17, 4);
        parcel.writeInt(this.F);
        h0.s(parcel, 18, 4);
        parcel.writeInt(this.G);
        h0.s(parcel, 19, 4);
        parcel.writeInt(this.H);
        h0.s(parcel, 20, 4);
        parcel.writeInt(this.I);
        h0.s(parcel, 21, 4);
        parcel.writeInt(this.J);
        h0.s(parcel, 22, 4);
        parcel.writeInt(this.K);
        h0.s(parcel, 23, 4);
        parcel.writeInt(this.L);
        h0.s(parcel, 24, 4);
        parcel.writeInt(this.M);
        h0.s(parcel, 25, 4);
        parcel.writeInt(this.N);
        h0.s(parcel, 26, 4);
        parcel.writeInt(this.O);
        h0.s(parcel, 27, 4);
        parcel.writeInt(this.P);
        h0.s(parcel, 28, 4);
        parcel.writeInt(this.Q);
        h0.s(parcel, 29, 4);
        parcel.writeInt(this.R);
        h0.s(parcel, 30, 4);
        parcel.writeInt(this.S);
        h0.s(parcel, 31, 4);
        parcel.writeInt(this.T);
        h0.s(parcel, 32, 4);
        parcel.writeInt(this.U);
        o oVar = this.V;
        if (oVar == null) {
            iBinder = null;
        } else {
            iBinder = oVar.f317b;
        }
        h0.f(parcel, 33, iBinder);
        h0.s(parcel, 34, 4);
        parcel.writeInt(this.W ? 1 : 0);
        h0.s(parcel, 35, 4);
        parcel.writeInt(this.X ? 1 : 0);
        h0.r(parcel, q6);
    }
}
