package g6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.bc;
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
    public final String f13225a;
    public final ArrayList f13226b;
    public final boolean f13227c;
    public final f6.i d;
    public final boolean f13228e;
    public final h6.a f13229f;
    public final boolean h;
    public final double f13230n;
    public final boolean f13231r;
    public final boolean f13232s;
    public final boolean f13233w;
    public final List f13234x;
    public final boolean f13235y;

    static {
        new h6.f(h6.f.Z, h6.f.f13935a0, 10000L, null, c8.a0.a("smallIconDrawableResId"), c8.a0.a("stopLiveStreamDrawableResId"), c8.a0.a("pauseDrawableResId"), c8.a0.a("playDrawableResId"), c8.a0.a("skipNextDrawableResId"), c8.a0.a("skipPrevDrawableResId"), c8.a0.a("forwardDrawableResId"), c8.a0.a("forward10DrawableResId"), c8.a0.a("forward30DrawableResId"), c8.a0.a("rewindDrawableResId"), c8.a0.a("rewind10DrawableResId"), c8.a0.a("rewind30DrawableResId"), c8.a0.a("disconnectDrawableResId"), c8.a0.a("notificationImageSizeDimenResId"), c8.a0.a("castingToDeviceStringResId"), c8.a0.a("stopLiveStreamStringResId"), c8.a0.a("pauseStringResId"), c8.a0.a("playStringResId"), c8.a0.a("skipNextStringResId"), c8.a0.a("skipPrevStringResId"), c8.a0.a("forwardStringResId"), c8.a0.a("forward10StringResId"), c8.a0.a("forward30StringResId"), c8.a0.a("rewindStringResId"), c8.a0.a("rewind10StringResId"), c8.a0.a("rewind30StringResId"), c8.a0.a("disconnectStringResId"), null, false, false);
        J = new h6.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new t0(16);
    }

    public b(String str, ArrayList arrayList, boolean z10, f6.i iVar, boolean z11, h6.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15, ArrayList arrayList2, boolean z16, boolean z17, a0 a0Var, b0 b0Var) {
        this.f13225a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.f13226b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f13227c = z10;
        this.d = iVar == null ? new f6.i() : iVar;
        this.f13228e = z11;
        this.f13229f = aVar;
        this.h = z12;
        this.f13230n = d;
        this.f13231r = z13;
        this.f13232s = z14;
        this.f13233w = z15;
        this.f13234x = arrayList2;
        this.f13235y = z16;
        this.E = z17;
        this.F = a0Var;
        this.G = b0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f13225a);
        bc.n(parcel, 3, DesugarCollections.unmodifiableList(this.f13226b));
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f13227c ? 1 : 0);
        bc.k(parcel, 5, this.d, i7);
        bc.q(parcel, 6, 4);
        parcel.writeInt(this.f13228e ? 1 : 0);
        bc.k(parcel, 7, this.f13229f, i7);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        bc.q(parcel, 9, 8);
        parcel.writeDouble(this.f13230n);
        bc.q(parcel, 10, 4);
        parcel.writeInt(this.f13231r ? 1 : 0);
        bc.q(parcel, 11, 4);
        parcel.writeInt(this.f13232s ? 1 : 0);
        bc.q(parcel, 12, 4);
        parcel.writeInt(this.f13233w ? 1 : 0);
        bc.n(parcel, 13, DesugarCollections.unmodifiableList(this.f13234x));
        bc.q(parcel, 14, 4);
        parcel.writeInt(this.f13235y ? 1 : 0);
        bc.q(parcel, 15, 4);
        parcel.writeInt(0);
        bc.q(parcel, 16, 4);
        parcel.writeInt(this.E ? 1 : 0);
        bc.k(parcel, 17, this.F, i7);
        bc.k(parcel, 18, this.G, i7);
        bc.s(parcel, r10);
    }
}
