package n5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import g7.i0;
import g7.p8;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import m6.r0;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final o5.a E;
    public final b0 A;
    public c0 B;
    public final String f18463a;
    public final ArrayList f18464b;
    public final boolean f18465c;
    public final m5.i d;
    public final boolean f18466e;
    public final o5.a f18467f;
    public final boolean h;
    public final double f18468n;
    public final boolean f18469r;
    public final boolean f18470s;
    public final boolean v;
    public final List f18471w;
    public final boolean f18472x;
    public final boolean f18473y;
    public static final b0 C = new b0(false);
    public static final c0 D = new c0(0);

    static {
        new o5.f(o5.f.U, o5.f.V, 10000L, null, i0.a("smallIconDrawableResId"), i0.a("stopLiveStreamDrawableResId"), i0.a("pauseDrawableResId"), i0.a("playDrawableResId"), i0.a("skipNextDrawableResId"), i0.a("skipPrevDrawableResId"), i0.a("forwardDrawableResId"), i0.a("forward10DrawableResId"), i0.a("forward30DrawableResId"), i0.a("rewindDrawableResId"), i0.a("rewind10DrawableResId"), i0.a("rewind30DrawableResId"), i0.a("disconnectDrawableResId"), i0.a("notificationImageSizeDimenResId"), i0.a("castingToDeviceStringResId"), i0.a("stopLiveStreamStringResId"), i0.a("pauseStringResId"), i0.a("playStringResId"), i0.a("skipNextStringResId"), i0.a("skipPrevStringResId"), i0.a("forwardStringResId"), i0.a("forward10StringResId"), i0.a("forward30StringResId"), i0.a("rewindStringResId"), i0.a("rewind10StringResId"), i0.a("rewind30StringResId"), i0.a("disconnectStringResId"), null, false, false);
        E = new o5.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new r0(27);
    }

    public b(String str, ArrayList arrayList, boolean z10, m5.i iVar, boolean z11, o5.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15, ArrayList arrayList2, boolean z16, boolean z17, b0 b0Var, c0 c0Var) {
        int size;
        this.f18463a = true == TextUtils.isEmpty(str) ? "" : str;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        ArrayList arrayList3 = new ArrayList(size);
        this.f18464b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f18465c = z10;
        this.d = iVar == null ? new m5.i() : iVar;
        this.f18466e = z11;
        this.f18467f = aVar;
        this.h = z12;
        this.f18468n = d;
        this.f18469r = z13;
        this.f18470s = z14;
        this.v = z15;
        this.f18471w = arrayList2;
        this.f18472x = z16;
        this.f18473y = z17;
        this.A = b0Var;
        this.B = c0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f18463a);
        p8.n(parcel, 3, DesugarCollections.unmodifiableList(this.f18464b));
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f18465c ? 1 : 0);
        p8.k(parcel, 5, this.d, i9);
        p8.s(parcel, 6, 4);
        parcel.writeInt(this.f18466e ? 1 : 0);
        p8.k(parcel, 7, this.f18467f, i9);
        p8.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        p8.s(parcel, 9, 8);
        parcel.writeDouble(this.f18468n);
        p8.s(parcel, 10, 4);
        parcel.writeInt(this.f18469r ? 1 : 0);
        p8.s(parcel, 11, 4);
        parcel.writeInt(this.f18470s ? 1 : 0);
        p8.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        p8.n(parcel, 13, DesugarCollections.unmodifiableList(this.f18471w));
        p8.s(parcel, 14, 4);
        parcel.writeInt(this.f18472x ? 1 : 0);
        p8.s(parcel, 15, 4);
        parcel.writeInt(0);
        p8.s(parcel, 16, 4);
        parcel.writeInt(this.f18473y ? 1 : 0);
        p8.k(parcel, 17, this.A, i9);
        p8.k(parcel, 18, this.B, i9);
        p8.r(parcel, q10);
    }
}
