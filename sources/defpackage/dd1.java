package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
public final class dd1 extends b4 {
    public static final Parcelable.Creator<dd1> CREATOR;
    public static final bne H = new bne(false);
    public static final owe I = new owe(0);
    public static final bd1 J;
    public final boolean E;
    public final bne F;
    public owe G;
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final b06 d;
    public final boolean e;
    public final bd1 f;
    public final boolean h;
    public final double n;
    public final boolean r;
    public final boolean s;
    public final boolean w;
    public final ArrayList x;
    public final boolean y;

    static {
        new ql7(ql7.Z, ql7.a0, 10000L, null, spe.a("smallIconDrawableResId"), spe.a("stopLiveStreamDrawableResId"), spe.a("pauseDrawableResId"), spe.a("playDrawableResId"), spe.a("skipNextDrawableResId"), spe.a("skipPrevDrawableResId"), spe.a("forwardDrawableResId"), spe.a("forward10DrawableResId"), spe.a("forward30DrawableResId"), spe.a("rewindDrawableResId"), spe.a("rewind10DrawableResId"), spe.a("rewind30DrawableResId"), spe.a("disconnectDrawableResId"), spe.a("notificationImageSizeDimenResId"), spe.a("castingToDeviceStringResId"), spe.a("stopLiveStreamStringResId"), spe.a("pauseStringResId"), spe.a("playStringResId"), spe.a("skipNextStringResId"), spe.a("skipPrevStringResId"), spe.a("forwardStringResId"), spe.a("forward10StringResId"), spe.a("forward30StringResId"), spe.a("rewindStringResId"), spe.a("rewind10StringResId"), spe.a("rewind30StringResId"), spe.a("disconnectStringResId"), null, false, false);
        J = new bd1("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new c0f((byte) 7);
    }

    public dd1(String str, ArrayList arrayList, boolean z, b06 b06Var, boolean z2, bd1 bd1Var, boolean z3, double d, boolean z4, boolean z5, boolean z6, ArrayList arrayList2, boolean z7, boolean z8, bne bneVar, owe oweVar) {
        this.a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.c = z;
        this.d = b06Var == null ? new b06() : b06Var;
        this.e = z2;
        this.f = bd1Var;
        this.h = z3;
        this.n = d;
        this.r = z4;
        this.s = z5;
        this.w = z6;
        this.x = arrayList2;
        this.y = z7;
        this.E = z8;
        this.F = bneVar;
        this.G = oweVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.n(parcel, 3, DesugarCollections.unmodifiableList(this.b));
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        jte.k(parcel, 5, this.d, i);
        jte.q(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        jte.k(parcel, 7, this.f, i);
        jte.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        jte.q(parcel, 9, 8);
        parcel.writeDouble(this.n);
        jte.q(parcel, 10, 4);
        parcel.writeInt(this.r ? 1 : 0);
        jte.q(parcel, 11, 4);
        parcel.writeInt(this.s ? 1 : 0);
        jte.q(parcel, 12, 4);
        parcel.writeInt(this.w ? 1 : 0);
        jte.n(parcel, 13, DesugarCollections.unmodifiableList(this.x));
        jte.q(parcel, 14, 4);
        parcel.writeInt(this.y ? 1 : 0);
        jte.q(parcel, 15, 4);
        parcel.writeInt(0);
        jte.q(parcel, 16, 4);
        parcel.writeInt(this.E ? 1 : 0);
        jte.k(parcel, 17, this.F, i);
        jte.k(parcel, 18, this.G, i);
        jte.s(parcel, r);
    }
}
