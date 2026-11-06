package h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
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
    public final ArrayList f14235a;
    public final int[] f14236b;
    public final long f14237c;
    public final String d;
    public final int f14238e;
    public final int f14239f;
    public final int h;
    public final int f14240n;
    public final int f14241r;
    public final int f14242s;
    public final int f14243w;
    public final int f14244x;
    public final int f14245y;

    static {
        d0 d0Var = f0.f6854b;
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
        this.f14235a = new ArrayList(list);
        this.f14236b = Arrays.copyOf(iArr, iArr.length);
        this.f14237c = j3;
        this.d = str;
        this.f14238e = i7;
        this.f14239f = i10;
        this.h = i11;
        this.f14240n = i12;
        this.f14241r = i13;
        this.f14242s = i14;
        this.f14243w = i15;
        this.f14244x = i16;
        this.f14245y = i17;
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
        int r10 = wb.r(parcel, 20293);
        wb.n(parcel, 2, this.f14235a);
        int[] iArr = this.f14236b;
        wb.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        wb.q(parcel, 4, 8);
        parcel.writeLong(this.f14237c);
        wb.l(parcel, 5, this.d);
        wb.q(parcel, 6, 4);
        parcel.writeInt(this.f14238e);
        wb.q(parcel, 7, 4);
        parcel.writeInt(this.f14239f);
        wb.q(parcel, 8, 4);
        parcel.writeInt(this.h);
        wb.q(parcel, 9, 4);
        parcel.writeInt(this.f14240n);
        wb.q(parcel, 10, 4);
        parcel.writeInt(this.f14241r);
        wb.q(parcel, 11, 4);
        parcel.writeInt(this.f14242s);
        wb.q(parcel, 12, 4);
        parcel.writeInt(this.f14243w);
        wb.q(parcel, 13, 4);
        parcel.writeInt(this.f14244x);
        wb.q(parcel, 14, 4);
        parcel.writeInt(this.f14245y);
        wb.q(parcel, 15, 4);
        parcel.writeInt(this.D);
        wb.q(parcel, 16, 4);
        parcel.writeInt(this.E);
        wb.q(parcel, 17, 4);
        parcel.writeInt(this.F);
        wb.q(parcel, 18, 4);
        parcel.writeInt(this.G);
        wb.q(parcel, 19, 4);
        parcel.writeInt(this.H);
        wb.q(parcel, 20, 4);
        parcel.writeInt(this.I);
        wb.q(parcel, 21, 4);
        parcel.writeInt(this.J);
        wb.q(parcel, 22, 4);
        parcel.writeInt(this.K);
        wb.q(parcel, 23, 4);
        parcel.writeInt(this.L);
        wb.q(parcel, 24, 4);
        parcel.writeInt(this.M);
        wb.q(parcel, 25, 4);
        parcel.writeInt(this.N);
        wb.q(parcel, 26, 4);
        parcel.writeInt(this.O);
        wb.q(parcel, 27, 4);
        parcel.writeInt(this.P);
        wb.q(parcel, 28, 4);
        parcel.writeInt(this.Q);
        wb.q(parcel, 29, 4);
        parcel.writeInt(this.R);
        wb.q(parcel, 30, 4);
        parcel.writeInt(this.S);
        wb.q(parcel, 31, 4);
        parcel.writeInt(this.T);
        wb.q(parcel, 32, 4);
        parcel.writeInt(this.U);
        p pVar = this.V;
        if (pVar == null) {
            iBinder = null;
        } else {
            iBinder = pVar.f306b;
        }
        wb.f(parcel, 33, iBinder);
        wb.q(parcel, 34, 4);
        parcel.writeInt(this.W ? 1 : 0);
        wb.q(parcel, 35, 4);
        parcel.writeInt(this.X ? 1 : 0);
        wb.s(parcel, r10);
    }
}
