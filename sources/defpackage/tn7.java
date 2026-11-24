package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class tn7 extends b4 {
    public static final Parcelable.Creator<tn7> CREATOR;
    public static final l7e Z;
    public static final int[] a0;
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
    public final hvd W;
    public final boolean X;
    public final boolean Y;
    public final ArrayList a;
    public final int[] b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final int h;
    public final int n;
    public final int r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    static {
        l5e l5eVar = x5e.n;
        Object[] objArr = {"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                gxc.d(hg9.j(i, "at index "));
                return;
            }
        }
        Z = x5e.z(2, objArr);
        a0 = new int[]{0, 1};
        CREATOR = new v6d((byte) 5);
    }

    public tn7(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder, boolean z, boolean z2) {
        hvd f1dVar;
        this.a = new ArrayList(list);
        this.b = Arrays.copyOf(iArr, iArr.length);
        this.c = j;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.h = i3;
        this.n = i4;
        this.r = i5;
        this.s = i6;
        this.w = i7;
        this.x = i8;
        this.y = i9;
        this.E = i10;
        this.F = i11;
        this.G = i12;
        this.H = i13;
        this.I = i14;
        this.J = i15;
        this.K = i16;
        this.L = i17;
        this.M = i18;
        this.N = i19;
        this.O = i20;
        this.P = i21;
        this.Q = i22;
        this.R = i23;
        this.S = i24;
        this.T = i25;
        this.U = i26;
        this.V = i27;
        this.X = z;
        this.Y = z2;
        if (iBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            if (queryLocalInterface instanceof hvd) {
                f1dVar = (hvd) queryLocalInterface;
            } else {
                f1dVar = new f1d(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", (byte) 3);
            }
        }
        this.W = f1dVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int r = mve.r(parcel, 20293);
        mve.n(parcel, 2, this.a);
        int[] iArr = this.b;
        mve.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        mve.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        mve.l(parcel, 5, this.d);
        mve.q(parcel, 6, 4);
        parcel.writeInt(this.e);
        mve.q(parcel, 7, 4);
        parcel.writeInt(this.f);
        mve.q(parcel, 8, 4);
        parcel.writeInt(this.h);
        mve.q(parcel, 9, 4);
        parcel.writeInt(this.n);
        mve.q(parcel, 10, 4);
        parcel.writeInt(this.r);
        mve.q(parcel, 11, 4);
        parcel.writeInt(this.s);
        mve.q(parcel, 12, 4);
        parcel.writeInt(this.w);
        mve.q(parcel, 13, 4);
        parcel.writeInt(this.x);
        mve.q(parcel, 14, 4);
        parcel.writeInt(this.y);
        mve.q(parcel, 15, 4);
        parcel.writeInt(this.E);
        mve.q(parcel, 16, 4);
        parcel.writeInt(this.F);
        mve.q(parcel, 17, 4);
        parcel.writeInt(this.G);
        mve.q(parcel, 18, 4);
        parcel.writeInt(this.H);
        mve.q(parcel, 19, 4);
        parcel.writeInt(this.I);
        mve.q(parcel, 20, 4);
        parcel.writeInt(this.J);
        mve.q(parcel, 21, 4);
        parcel.writeInt(this.K);
        mve.q(parcel, 22, 4);
        parcel.writeInt(this.L);
        mve.q(parcel, 23, 4);
        parcel.writeInt(this.M);
        mve.q(parcel, 24, 4);
        parcel.writeInt(this.N);
        mve.q(parcel, 25, 4);
        parcel.writeInt(this.O);
        mve.q(parcel, 26, 4);
        parcel.writeInt(this.P);
        mve.q(parcel, 27, 4);
        parcel.writeInt(this.Q);
        mve.q(parcel, 28, 4);
        parcel.writeInt(this.R);
        mve.q(parcel, 29, 4);
        parcel.writeInt(this.S);
        mve.q(parcel, 30, 4);
        parcel.writeInt(this.T);
        mve.q(parcel, 31, 4);
        parcel.writeInt(this.U);
        mve.q(parcel, 32, 4);
        parcel.writeInt(this.V);
        hvd hvdVar = this.W;
        if (hvdVar == null) {
            iBinder = null;
        } else {
            iBinder = hvdVar.b;
        }
        mve.f(parcel, 33, iBinder);
        mve.q(parcel, 34, 4);
        parcel.writeInt(this.X ? 1 : 0);
        mve.q(parcel, 35, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        mve.s(parcel, r);
    }
}
