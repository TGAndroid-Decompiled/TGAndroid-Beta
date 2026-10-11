package d6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c7.r0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import v7.x6;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final a0 G = new a0(false);
    public static final b0 H = new b0(0);
    public static final e6.a I;
    public final a0 E;
    public b0 F;
    public final String f8165a;
    public final ArrayList f8166b;
    public final boolean f8167c;
    public final c6.i d;
    public final boolean f8168e;
    public final e6.a f8169f;
    public final boolean h;
    public final double f8170n;
    public final boolean f8171r;
    public final boolean f8172s;
    public final boolean v;
    public final List f8173w;
    public final boolean f8174x;
    public final boolean f8175y;

    static {
        new e6.f(e6.f.Y, e6.f.Z, 10000L, null, x6.a("smallIconDrawableResId"), x6.a("stopLiveStreamDrawableResId"), x6.a("pauseDrawableResId"), x6.a("playDrawableResId"), x6.a("skipNextDrawableResId"), x6.a("skipPrevDrawableResId"), x6.a("forwardDrawableResId"), x6.a("forward10DrawableResId"), x6.a("forward30DrawableResId"), x6.a("rewindDrawableResId"), x6.a("rewind10DrawableResId"), x6.a("rewind30DrawableResId"), x6.a("disconnectDrawableResId"), x6.a("notificationImageSizeDimenResId"), x6.a("castingToDeviceStringResId"), x6.a("stopLiveStreamStringResId"), x6.a("pauseStringResId"), x6.a("playStringResId"), x6.a("skipNextStringResId"), x6.a("skipPrevStringResId"), x6.a("forwardStringResId"), x6.a("forward10StringResId"), x6.a("forward30StringResId"), x6.a("rewindStringResId"), x6.a("rewind10StringResId"), x6.a("rewind30StringResId"), x6.a("disconnectStringResId"), null, false, false);
        I = new e6.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new r0(28);
    }

    public b(String str, ArrayList arrayList, boolean z10, c6.i iVar, boolean z11, e6.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15, ArrayList arrayList2, boolean z16, boolean z17, a0 a0Var, b0 b0Var) {
        int size;
        this.f8165a = true == TextUtils.isEmpty(str) ? "" : str;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        ArrayList arrayList3 = new ArrayList(size);
        this.f8166b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f8167c = z10;
        this.d = iVar == null ? new c6.i() : iVar;
        this.f8168e = z11;
        this.f8169f = aVar;
        this.h = z12;
        this.f8170n = d;
        this.f8171r = z13;
        this.f8172s = z14;
        this.v = z15;
        this.f8173w = arrayList2;
        this.f8174x = z16;
        this.f8175y = z17;
        this.E = a0Var;
        this.F = b0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 2, this.f8165a);
        w7.d0.n(parcel, 3, DesugarCollections.unmodifiableList(this.f8166b));
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.f8167c ? 1 : 0);
        w7.d0.k(parcel, 5, this.d, i10);
        w7.d0.s(parcel, 6, 4);
        parcel.writeInt(this.f8168e ? 1 : 0);
        w7.d0.k(parcel, 7, this.f8169f, i10);
        w7.d0.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        w7.d0.s(parcel, 9, 8);
        parcel.writeDouble(this.f8170n);
        w7.d0.s(parcel, 10, 4);
        parcel.writeInt(this.f8171r ? 1 : 0);
        w7.d0.s(parcel, 11, 4);
        parcel.writeInt(this.f8172s ? 1 : 0);
        w7.d0.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        w7.d0.n(parcel, 13, DesugarCollections.unmodifiableList(this.f8173w));
        w7.d0.s(parcel, 14, 4);
        parcel.writeInt(this.f8174x ? 1 : 0);
        w7.d0.s(parcel, 15, 4);
        parcel.writeInt(0);
        w7.d0.s(parcel, 16, 4);
        parcel.writeInt(this.f8175y ? 1 : 0);
        w7.d0.k(parcel, 17, this.E, i10);
        w7.d0.k(parcel, 18, this.F, i10);
        w7.d0.r(parcel, q6);
    }
}
