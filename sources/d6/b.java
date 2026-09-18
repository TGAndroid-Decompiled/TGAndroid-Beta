package d6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c7.r0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import v7.x6;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final a0 G = new a0(false);
    public static final b0 H = new b0(0);
    public static final e6.a I;
    public final a0 E;
    public b0 F;
    public final String f7520a;
    public final ArrayList f7521b;
    public final boolean f7522c;
    public final c6.i d;
    public final boolean e;
    public final e6.a f7523f;
    public final boolean h;
    public final double f7524n;
    public final boolean f7525r;
    public final boolean f7526s;
    public final boolean v;
    public final List f7527w;
    public final boolean f7528x;
    public final boolean f7529y;

    static {
        new e6.f(e6.f.Y, e6.f.Z, 10000L, null, x6.a("smallIconDrawableResId"), x6.a("stopLiveStreamDrawableResId"), x6.a("pauseDrawableResId"), x6.a("playDrawableResId"), x6.a("skipNextDrawableResId"), x6.a("skipPrevDrawableResId"), x6.a("forwardDrawableResId"), x6.a("forward10DrawableResId"), x6.a("forward30DrawableResId"), x6.a("rewindDrawableResId"), x6.a("rewind10DrawableResId"), x6.a("rewind30DrawableResId"), x6.a("disconnectDrawableResId"), x6.a("notificationImageSizeDimenResId"), x6.a("castingToDeviceStringResId"), x6.a("stopLiveStreamStringResId"), x6.a("pauseStringResId"), x6.a("playStringResId"), x6.a("skipNextStringResId"), x6.a("skipPrevStringResId"), x6.a("forwardStringResId"), x6.a("forward10StringResId"), x6.a("forward30StringResId"), x6.a("rewindStringResId"), x6.a("rewind10StringResId"), x6.a("rewind30StringResId"), x6.a("disconnectStringResId"), null, false, false);
        I = new e6.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new r0(28);
    }

    public b(String str, ArrayList arrayList, boolean z10, c6.i iVar, boolean z11, e6.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15, ArrayList arrayList2, boolean z16, boolean z17, a0 a0Var, b0 b0Var) {
        int size;
        this.f7520a = true == TextUtils.isEmpty(str) ? "" : str;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        ArrayList arrayList3 = new ArrayList(size);
        this.f7521b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f7522c = z10;
        this.d = iVar == null ? new c6.i() : iVar;
        this.e = z11;
        this.f7523f = aVar;
        this.h = z12;
        this.f7524n = d;
        this.f7525r = z13;
        this.f7526s = z14;
        this.v = z15;
        this.f7527w = arrayList2;
        this.f7528x = z16;
        this.f7529y = z17;
        this.E = a0Var;
        this.F = b0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f7520a);
        f0.n(parcel, 3, DesugarCollections.unmodifiableList(this.f7521b));
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f7522c ? 1 : 0);
        f0.k(parcel, 5, this.d, i10);
        f0.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.k(parcel, 7, this.f7523f, i10);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        f0.s(parcel, 9, 8);
        parcel.writeDouble(this.f7524n);
        f0.s(parcel, 10, 4);
        parcel.writeInt(this.f7525r ? 1 : 0);
        f0.s(parcel, 11, 4);
        parcel.writeInt(this.f7526s ? 1 : 0);
        f0.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        f0.n(parcel, 13, DesugarCollections.unmodifiableList(this.f7527w));
        f0.s(parcel, 14, 4);
        parcel.writeInt(this.f7528x ? 1 : 0);
        f0.s(parcel, 15, 4);
        parcel.writeInt(0);
        f0.s(parcel, 16, 4);
        parcel.writeInt(this.f7529y ? 1 : 0);
        f0.k(parcel, 17, this.E, i10);
        f0.k(parcel, 18, this.F, i10);
        f0.r(parcel, q6);
    }
}
