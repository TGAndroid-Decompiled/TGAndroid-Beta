package n5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h7.r8;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final o5.a E;
    public final b0 A;
    public c0 B;

    public final String f18290a;

    public final ArrayList f18291b;

    public final boolean f18292c;
    public final m5.i d;

    public final boolean f18293e;

    public final o5.a f18294f;
    public final boolean h;

    public final double f18295n;

    public final boolean f18296r;

    public final boolean f18297s;
    public final boolean v;

    public final List f18298w;

    public final boolean f18299x;

    public final boolean f18300y;
    public static final b0 C = new b0(false);
    public static final c0 D = new c0(0);

    static {
        new o5.f(o5.f.U, o5.f.V, 10000L, null, h7.c0.a("smallIconDrawableResId"), h7.c0.a("stopLiveStreamDrawableResId"), h7.c0.a("pauseDrawableResId"), h7.c0.a("playDrawableResId"), h7.c0.a("skipNextDrawableResId"), h7.c0.a("skipPrevDrawableResId"), h7.c0.a("forwardDrawableResId"), h7.c0.a("forward10DrawableResId"), h7.c0.a("forward30DrawableResId"), h7.c0.a("rewindDrawableResId"), h7.c0.a("rewind10DrawableResId"), h7.c0.a("rewind30DrawableResId"), h7.c0.a("disconnectDrawableResId"), h7.c0.a("notificationImageSizeDimenResId"), h7.c0.a("castingToDeviceStringResId"), h7.c0.a("stopLiveStreamStringResId"), h7.c0.a("pauseStringResId"), h7.c0.a("playStringResId"), h7.c0.a("skipNextStringResId"), h7.c0.a("skipPrevStringResId"), h7.c0.a("forwardStringResId"), h7.c0.a("forward10StringResId"), h7.c0.a("forward30StringResId"), h7.c0.a("rewindStringResId"), h7.c0.a("rewind10StringResId"), h7.c0.a("rewind30StringResId"), h7.c0.a("disconnectStringResId"), null, false, false);
        E = new o5.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new h5.h(26);
    }

    public b(String str, ArrayList arrayList, boolean z10, m5.i iVar, boolean z11, o5.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15, ArrayList arrayList2, boolean z16, boolean z17, b0 b0Var, c0 c0Var) {
        this.f18290a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.f18291b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f18292c = z10;
        this.d = iVar == null ? new m5.i() : iVar;
        this.f18293e = z11;
        this.f18294f = aVar;
        this.h = z12;
        this.f18295n = d;
        this.f18296r = z13;
        this.f18297s = z14;
        this.v = z15;
        this.f18298w = arrayList2;
        this.f18299x = z16;
        this.f18300y = z17;
        this.A = b0Var;
        this.B = c0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f18290a);
        r8.n(parcel, 3, DesugarCollections.unmodifiableList(this.f18291b));
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f18292c ? 1 : 0);
        r8.k(parcel, 5, this.d, i10);
        r8.s(parcel, 6, 4);
        parcel.writeInt(this.f18293e ? 1 : 0);
        r8.k(parcel, 7, this.f18294f, i10);
        r8.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        r8.s(parcel, 9, 8);
        parcel.writeDouble(this.f18295n);
        r8.s(parcel, 10, 4);
        parcel.writeInt(this.f18296r ? 1 : 0);
        r8.s(parcel, 11, 4);
        parcel.writeInt(this.f18297s ? 1 : 0);
        r8.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        r8.n(parcel, 13, DesugarCollections.unmodifiableList(this.f18298w));
        r8.s(parcel, 14, 4);
        parcel.writeInt(this.f18299x ? 1 : 0);
        r8.s(parcel, 15, 4);
        parcel.writeInt(0);
        r8.s(parcel, 16, 4);
        parcel.writeInt(this.f18300y ? 1 : 0);
        r8.k(parcel, 17, this.A, i10);
        r8.k(parcel, 18, this.B, i10);
        r8.r(parcel, iQ);
    }
}
