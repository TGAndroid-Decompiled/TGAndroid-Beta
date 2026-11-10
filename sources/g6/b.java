package g6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.xb;
import f7.t0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final a0 G = new a0(false);
    public static final b0 H = new b0(0);
    public static final h6.a I;
    public final boolean D;
    public final a0 E;
    public b0 F;
    public final String f13533a;
    public final ArrayList f13534b;
    public final boolean f13535c;
    public final f6.i d;
    public final boolean f13536e;
    public final h6.a f13537f;
    public final boolean h;
    public final double f13538n;
    public final boolean f13539r;
    public final boolean f13540s;
    public final boolean f13541w;
    public final List f13542x;
    public final boolean f13543y;

    static {
        new h6.f(h6.f.Y, h6.f.Z, 10000L, null, b7.h.a("smallIconDrawableResId"), b7.h.a("stopLiveStreamDrawableResId"), b7.h.a("pauseDrawableResId"), b7.h.a("playDrawableResId"), b7.h.a("skipNextDrawableResId"), b7.h.a("skipPrevDrawableResId"), b7.h.a("forwardDrawableResId"), b7.h.a("forward10DrawableResId"), b7.h.a("forward30DrawableResId"), b7.h.a("rewindDrawableResId"), b7.h.a("rewind10DrawableResId"), b7.h.a("rewind30DrawableResId"), b7.h.a("disconnectDrawableResId"), b7.h.a("notificationImageSizeDimenResId"), b7.h.a("castingToDeviceStringResId"), b7.h.a("stopLiveStreamStringResId"), b7.h.a("pauseStringResId"), b7.h.a("playStringResId"), b7.h.a("skipNextStringResId"), b7.h.a("skipPrevStringResId"), b7.h.a("forwardStringResId"), b7.h.a("forward10StringResId"), b7.h.a("forward30StringResId"), b7.h.a("rewindStringResId"), b7.h.a("rewind10StringResId"), b7.h.a("rewind30StringResId"), b7.h.a("disconnectStringResId"), null, false, false);
        I = new h6.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new t0(16);
    }

    public b(String str, ArrayList arrayList, boolean z9, f6.i iVar, boolean z10, h6.a aVar, boolean z11, double d, boolean z12, boolean z13, boolean z14, ArrayList arrayList2, boolean z15, boolean z16, a0 a0Var, b0 b0Var) {
        this.f13533a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.f13534b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f13535c = z9;
        this.d = iVar == null ? new f6.i() : iVar;
        this.f13536e = z10;
        this.f13537f = aVar;
        this.h = z11;
        this.f13538n = d;
        this.f13539r = z12;
        this.f13540s = z13;
        this.f13541w = z14;
        this.f13542x = arrayList2;
        this.f13543y = z15;
        this.D = z16;
        this.E = a0Var;
        this.F = b0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f13533a);
        xb.n(parcel, 3, DesugarCollections.unmodifiableList(this.f13534b));
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f13535c ? 1 : 0);
        xb.k(parcel, 5, this.d, i7);
        xb.q(parcel, 6, 4);
        parcel.writeInt(this.f13536e ? 1 : 0);
        xb.k(parcel, 7, this.f13537f, i7);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        xb.q(parcel, 9, 8);
        parcel.writeDouble(this.f13538n);
        xb.q(parcel, 10, 4);
        parcel.writeInt(this.f13539r ? 1 : 0);
        xb.q(parcel, 11, 4);
        parcel.writeInt(this.f13540s ? 1 : 0);
        xb.q(parcel, 12, 4);
        parcel.writeInt(this.f13541w ? 1 : 0);
        xb.n(parcel, 13, DesugarCollections.unmodifiableList(this.f13542x));
        xb.q(parcel, 14, 4);
        parcel.writeInt(this.f13543y ? 1 : 0);
        xb.q(parcel, 15, 4);
        parcel.writeInt(0);
        xb.q(parcel, 16, 4);
        parcel.writeInt(this.D ? 1 : 0);
        xb.k(parcel, 17, this.E, i7);
        xb.k(parcel, 18, this.F, i7);
        xb.s(parcel, r10);
    }
}
