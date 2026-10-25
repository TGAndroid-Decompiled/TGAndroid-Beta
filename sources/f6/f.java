package f6;

import a8.df;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.d0;
import com.google.android.gms.internal.cast.f0;
import com.google.android.gms.internal.cast.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR;
    public static final j0 Y;
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
    public final p V;
    public final boolean W;
    public final boolean X;
    public final ArrayList f10203a;
    public final int[] f10204b;
    public final long f10205c;
    public final String d;
    public final int e;
    public final int f10206f;
    public final int h;
    public final int f10207n;
    public final int f10208r;
    public final int f10209s;
    public final int v;
    public final int f10210w;
    public final int f10211x;
    public final int f10212y;

    static {
        d0 d0Var = f0.f6777b;
        Object[] objArr = {"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"};
        for (int i10 = 0; i10 < 2; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(ic.a.i(i10, "at index "));
            }
        }
        Y = f0.q(2, objArr);
        Z = new int[]{0, 1};
        CREATOR = new i(0);
    }

    public f(List list, int[] iArr, long j10, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, IBinder iBinder, boolean z10, boolean z11) {
        p aVar;
        this.f10203a = new ArrayList(list);
        this.f10204b = Arrays.copyOf(iArr, iArr.length);
        this.f10205c = j10;
        this.d = str;
        this.e = i10;
        this.f10206f = i11;
        this.h = i12;
        this.f10207n = i13;
        this.f10208r = i14;
        this.f10209s = i15;
        this.v = i16;
        this.f10210w = i17;
        this.f10211x = i18;
        this.f10212y = i19;
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
            if (queryLocalInterface instanceof p) {
                aVar = (p) queryLocalInterface;
            } else {
                aVar = new a8.a(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 2);
            }
        }
        this.V = aVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinder;
        int q5 = df.q(parcel, 20293);
        df.n(parcel, 2, this.f10203a);
        int[] iArr = this.f10204b;
        df.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        df.s(parcel, 4, 8);
        parcel.writeLong(this.f10205c);
        df.l(parcel, 5, this.d);
        df.s(parcel, 6, 4);
        parcel.writeInt(this.e);
        df.s(parcel, 7, 4);
        parcel.writeInt(this.f10206f);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.h);
        df.s(parcel, 9, 4);
        parcel.writeInt(this.f10207n);
        df.s(parcel, 10, 4);
        parcel.writeInt(this.f10208r);
        df.s(parcel, 11, 4);
        parcel.writeInt(this.f10209s);
        df.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        df.s(parcel, 13, 4);
        parcel.writeInt(this.f10210w);
        df.s(parcel, 14, 4);
        parcel.writeInt(this.f10211x);
        df.s(parcel, 15, 4);
        parcel.writeInt(this.f10212y);
        df.s(parcel, 16, 4);
        parcel.writeInt(this.E);
        df.s(parcel, 17, 4);
        parcel.writeInt(this.F);
        df.s(parcel, 18, 4);
        parcel.writeInt(this.G);
        df.s(parcel, 19, 4);
        parcel.writeInt(this.H);
        df.s(parcel, 20, 4);
        parcel.writeInt(this.I);
        df.s(parcel, 21, 4);
        parcel.writeInt(this.J);
        df.s(parcel, 22, 4);
        parcel.writeInt(this.K);
        df.s(parcel, 23, 4);
        parcel.writeInt(this.L);
        df.s(parcel, 24, 4);
        parcel.writeInt(this.M);
        df.s(parcel, 25, 4);
        parcel.writeInt(this.N);
        df.s(parcel, 26, 4);
        parcel.writeInt(this.O);
        df.s(parcel, 27, 4);
        parcel.writeInt(this.P);
        df.s(parcel, 28, 4);
        parcel.writeInt(this.Q);
        df.s(parcel, 29, 4);
        parcel.writeInt(this.R);
        df.s(parcel, 30, 4);
        parcel.writeInt(this.S);
        df.s(parcel, 31, 4);
        parcel.writeInt(this.T);
        df.s(parcel, 32, 4);
        parcel.writeInt(this.U);
        p pVar = this.V;
        if (pVar == null) {
            iBinder = null;
        } else {
            iBinder = pVar.f343b;
        }
        df.f(parcel, 33, iBinder);
        df.s(parcel, 34, 4);
        parcel.writeInt(this.W ? 1 : 0);
        df.s(parcel, 35, 4);
        parcel.writeInt(this.X ? 1 : 0);
        df.r(parcel, q5);
    }
}
