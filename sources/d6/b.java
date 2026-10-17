package d6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c7.r0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import v7.z6;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final a0 G = new a0(false);
    public static final b0 H = new b0(0);
    public static final e6.a I;
    public final a0 E;
    public b0 F;
    public final String f7840a;
    public final ArrayList f7841b;
    public final boolean f7842c;
    public final c6.i d;
    public final boolean e;
    public final e6.a f7843f;
    public final boolean h;
    public final double f7844n;
    public final boolean f7845r;
    public final boolean f7846s;
    public final boolean v;
    public final List f7847w;
    public final boolean f7848x;
    public final boolean f7849y;

    static {
        new e6.f(e6.f.Y, e6.f.Z, 10000L, null, z6.a("smallIconDrawableResId"), z6.a("stopLiveStreamDrawableResId"), z6.a("pauseDrawableResId"), z6.a("playDrawableResId"), z6.a("skipNextDrawableResId"), z6.a("skipPrevDrawableResId"), z6.a("forwardDrawableResId"), z6.a("forward10DrawableResId"), z6.a("forward30DrawableResId"), z6.a("rewindDrawableResId"), z6.a("rewind10DrawableResId"), z6.a("rewind30DrawableResId"), z6.a("disconnectDrawableResId"), z6.a("notificationImageSizeDimenResId"), z6.a("castingToDeviceStringResId"), z6.a("stopLiveStreamStringResId"), z6.a("pauseStringResId"), z6.a("playStringResId"), z6.a("skipNextStringResId"), z6.a("skipPrevStringResId"), z6.a("forwardStringResId"), z6.a("forward10StringResId"), z6.a("forward30StringResId"), z6.a("rewindStringResId"), z6.a("rewind10StringResId"), z6.a("rewind30StringResId"), z6.a("disconnectStringResId"), null, false, false);
        I = new e6.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new r0(28);
    }

    public b(String str, ArrayList arrayList, boolean z10, c6.i iVar, boolean z11, e6.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15, ArrayList arrayList2, boolean z16, boolean z17, a0 a0Var, b0 b0Var) {
        int size;
        this.f7840a = true == TextUtils.isEmpty(str) ? "" : str;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        ArrayList arrayList3 = new ArrayList(size);
        this.f7841b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f7842c = z10;
        this.d = iVar == null ? new c6.i() : iVar;
        this.e = z11;
        this.f7843f = aVar;
        this.h = z12;
        this.f7844n = d;
        this.f7845r = z13;
        this.f7846s = z14;
        this.v = z15;
        this.f7847w = arrayList2;
        this.f7848x = z16;
        this.f7849y = z17;
        this.E = a0Var;
        this.F = b0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f7840a);
        f0.n(parcel, 3, DesugarCollections.unmodifiableList(this.f7841b));
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f7842c ? 1 : 0);
        f0.k(parcel, 5, this.d, i10);
        f0.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.k(parcel, 7, this.f7843f, i10);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        f0.s(parcel, 9, 8);
        parcel.writeDouble(this.f7844n);
        f0.s(parcel, 10, 4);
        parcel.writeInt(this.f7845r ? 1 : 0);
        f0.s(parcel, 11, 4);
        parcel.writeInt(this.f7846s ? 1 : 0);
        f0.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        f0.n(parcel, 13, DesugarCollections.unmodifiableList(this.f7847w));
        f0.s(parcel, 14, 4);
        parcel.writeInt(this.f7848x ? 1 : 0);
        f0.s(parcel, 15, 4);
        parcel.writeInt(0);
        f0.s(parcel, 16, 4);
        parcel.writeInt(this.f7849y ? 1 : 0);
        f0.k(parcel, 17, this.E, i10);
        f0.k(parcel, 18, this.F, i10);
        f0.r(parcel, q6);
    }
}
