package e6;

import a8.dc;
import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import d7.r0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final a0 G = new a0(false);
    public static final b0 H = new b0(0);
    public static final f6.a I;
    public final a0 E;
    public b0 F;
    public final String f9792a;
    public final ArrayList f9793b;
    public final boolean f9794c;
    public final d6.i d;
    public final boolean e;
    public final f6.a f9795f;
    public final boolean h;
    public final double f9796n;
    public final boolean f9797r;
    public final boolean f9798s;
    public final boolean v;
    public final List f9799w;
    public final boolean f9800x;
    public final boolean f9801y;

    static {
        new f6.f(f6.f.Y, f6.f.Z, 10000L, null, dc.a("smallIconDrawableResId"), dc.a("stopLiveStreamDrawableResId"), dc.a("pauseDrawableResId"), dc.a("playDrawableResId"), dc.a("skipNextDrawableResId"), dc.a("skipPrevDrawableResId"), dc.a("forwardDrawableResId"), dc.a("forward10DrawableResId"), dc.a("forward30DrawableResId"), dc.a("rewindDrawableResId"), dc.a("rewind10DrawableResId"), dc.a("rewind30DrawableResId"), dc.a("disconnectDrawableResId"), dc.a("notificationImageSizeDimenResId"), dc.a("castingToDeviceStringResId"), dc.a("stopLiveStreamStringResId"), dc.a("pauseStringResId"), dc.a("playStringResId"), dc.a("skipNextStringResId"), dc.a("skipPrevStringResId"), dc.a("forwardStringResId"), dc.a("forward10StringResId"), dc.a("forward30StringResId"), dc.a("rewindStringResId"), dc.a("rewind10StringResId"), dc.a("rewind30StringResId"), dc.a("disconnectStringResId"), null, false, false);
        I = new f6.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new r0(28);
    }

    public b(String str, ArrayList arrayList, boolean z10, d6.i iVar, boolean z11, f6.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15, ArrayList arrayList2, boolean z16, boolean z17, a0 a0Var, b0 b0Var) {
        int size;
        this.f9792a = true == TextUtils.isEmpty(str) ? "" : str;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        ArrayList arrayList3 = new ArrayList(size);
        this.f9793b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f9794c = z10;
        this.d = iVar == null ? new d6.i() : iVar;
        this.e = z11;
        this.f9795f = aVar;
        this.h = z12;
        this.f9796n = d;
        this.f9797r = z13;
        this.f9798s = z14;
        this.v = z15;
        this.f9799w = arrayList2;
        this.f9800x = z16;
        this.f9801y = z17;
        this.E = a0Var;
        this.F = b0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f9792a);
        df.n(parcel, 3, DesugarCollections.unmodifiableList(this.f9793b));
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f9794c ? 1 : 0);
        df.k(parcel, 5, this.d, i10);
        df.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        df.k(parcel, 7, this.f9795f, i10);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        df.s(parcel, 9, 8);
        parcel.writeDouble(this.f9796n);
        df.s(parcel, 10, 4);
        parcel.writeInt(this.f9797r ? 1 : 0);
        df.s(parcel, 11, 4);
        parcel.writeInt(this.f9798s ? 1 : 0);
        df.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        df.n(parcel, 13, DesugarCollections.unmodifiableList(this.f9799w));
        df.s(parcel, 14, 4);
        parcel.writeInt(this.f9800x ? 1 : 0);
        df.s(parcel, 15, 4);
        parcel.writeInt(0);
        df.s(parcel, 16, 4);
        parcel.writeInt(this.f9801y ? 1 : 0);
        df.k(parcel, 17, this.E, i10);
        df.k(parcel, 18, this.F, i10);
        df.r(parcel, q5);
    }
}
