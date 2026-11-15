package g6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.yb;
import f7.t0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final a0 H = new a0(false);
    public static final b0 I = new b0(0);
    public static final h6.a J;
    public final boolean E;
    public final a0 F;
    public b0 G;
    public final String f12882a;
    public final ArrayList f12883b;
    public final boolean f12884c;
    public final f6.i d;
    public final boolean f12885e;
    public final h6.a f12886f;
    public final boolean h;
    public final double f12887n;
    public final boolean f12888r;
    public final boolean f12889s;
    public final boolean f12890w;
    public final List f12891x;
    public final boolean f12892y;

    static {
        new h6.f(h6.f.Z, h6.f.f13594a0, 10000L, null, b7.h.a("smallIconDrawableResId"), b7.h.a("stopLiveStreamDrawableResId"), b7.h.a("pauseDrawableResId"), b7.h.a("playDrawableResId"), b7.h.a("skipNextDrawableResId"), b7.h.a("skipPrevDrawableResId"), b7.h.a("forwardDrawableResId"), b7.h.a("forward10DrawableResId"), b7.h.a("forward30DrawableResId"), b7.h.a("rewindDrawableResId"), b7.h.a("rewind10DrawableResId"), b7.h.a("rewind30DrawableResId"), b7.h.a("disconnectDrawableResId"), b7.h.a("notificationImageSizeDimenResId"), b7.h.a("castingToDeviceStringResId"), b7.h.a("stopLiveStreamStringResId"), b7.h.a("pauseStringResId"), b7.h.a("playStringResId"), b7.h.a("skipNextStringResId"), b7.h.a("skipPrevStringResId"), b7.h.a("forwardStringResId"), b7.h.a("forward10StringResId"), b7.h.a("forward30StringResId"), b7.h.a("rewindStringResId"), b7.h.a("rewind10StringResId"), b7.h.a("rewind30StringResId"), b7.h.a("disconnectStringResId"), null, false, false);
        J = new h6.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new t0(16);
    }

    public b(String str, ArrayList arrayList, boolean z10, f6.i iVar, boolean z11, h6.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15, ArrayList arrayList2, boolean z16, boolean z17, a0 a0Var, b0 b0Var) {
        this.f12882a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.f12883b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f12884c = z10;
        this.d = iVar == null ? new f6.i() : iVar;
        this.f12885e = z11;
        this.f12886f = aVar;
        this.h = z12;
        this.f12887n = d;
        this.f12888r = z13;
        this.f12889s = z14;
        this.f12890w = z15;
        this.f12891x = arrayList2;
        this.f12892y = z16;
        this.E = z17;
        this.F = a0Var;
        this.G = b0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f12882a);
        yb.n(parcel, 3, DesugarCollections.unmodifiableList(this.f12883b));
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.f12884c ? 1 : 0);
        yb.k(parcel, 5, this.d, i7);
        yb.q(parcel, 6, 4);
        parcel.writeInt(this.f12885e ? 1 : 0);
        yb.k(parcel, 7, this.f12886f, i7);
        yb.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        yb.q(parcel, 9, 8);
        parcel.writeDouble(this.f12887n);
        yb.q(parcel, 10, 4);
        parcel.writeInt(this.f12888r ? 1 : 0);
        yb.q(parcel, 11, 4);
        parcel.writeInt(this.f12889s ? 1 : 0);
        yb.q(parcel, 12, 4);
        parcel.writeInt(this.f12890w ? 1 : 0);
        yb.n(parcel, 13, DesugarCollections.unmodifiableList(this.f12891x));
        yb.q(parcel, 14, 4);
        parcel.writeInt(this.f12892y ? 1 : 0);
        yb.q(parcel, 15, 4);
        parcel.writeInt(0);
        yb.q(parcel, 16, 4);
        parcel.writeInt(this.E ? 1 : 0);
        yb.k(parcel, 17, this.F, i7);
        yb.k(parcel, 18, this.G, i7);
        yb.s(parcel, r10);
    }
}
