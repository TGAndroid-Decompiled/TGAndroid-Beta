package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
public final class le1 extends b4 {
    public static final Parcelable.Creator<le1> CREATOR;
    public static final epe H = new epe(false);
    public static final qye I = new qye(0);
    public static final je1 J;
    public final boolean E;
    public final epe F;
    public qye G;
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final b26 d;
    public final boolean e;
    public final je1 f;
    public final boolean h;
    public final double n;
    public final boolean r;
    public final boolean s;
    public final boolean w;
    public final ArrayList x;
    public final boolean y;

    static {
        new tn7(tn7.Z, tn7.a0, 10000L, null, vre.a("smallIconDrawableResId"), vre.a("stopLiveStreamDrawableResId"), vre.a("pauseDrawableResId"), vre.a("playDrawableResId"), vre.a("skipNextDrawableResId"), vre.a("skipPrevDrawableResId"), vre.a("forwardDrawableResId"), vre.a("forward10DrawableResId"), vre.a("forward30DrawableResId"), vre.a("rewindDrawableResId"), vre.a("rewind10DrawableResId"), vre.a("rewind30DrawableResId"), vre.a("disconnectDrawableResId"), vre.a("notificationImageSizeDimenResId"), vre.a("castingToDeviceStringResId"), vre.a("stopLiveStreamStringResId"), vre.a("pauseStringResId"), vre.a("playStringResId"), vre.a("skipNextStringResId"), vre.a("skipPrevStringResId"), vre.a("forwardStringResId"), vre.a("forward10StringResId"), vre.a("forward30StringResId"), vre.a("rewindStringResId"), vre.a("rewind10StringResId"), vre.a("rewind30StringResId"), vre.a("disconnectStringResId"), null, false, false);
        J = new je1("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new e2f((byte) 7);
    }

    public le1(String str, ArrayList arrayList, boolean z, b26 b26Var, boolean z2, je1 je1Var, boolean z3, double d, boolean z4, boolean z5, boolean z6, ArrayList arrayList2, boolean z7, boolean z8, epe epeVar, qye qyeVar) {
        this.a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.c = z;
        this.d = b26Var == null ? new b26() : b26Var;
        this.e = z2;
        this.f = je1Var;
        this.h = z3;
        this.n = d;
        this.r = z4;
        this.s = z5;
        this.w = z6;
        this.x = arrayList2;
        this.y = z7;
        this.E = z8;
        this.F = epeVar;
        this.G = qyeVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.n(parcel, 3, DesugarCollections.unmodifiableList(this.b));
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.k(parcel, 5, this.d, i);
        mve.q(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        mve.k(parcel, 7, this.f, i);
        mve.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        mve.q(parcel, 9, 8);
        parcel.writeDouble(this.n);
        mve.q(parcel, 10, 4);
        parcel.writeInt(this.r ? 1 : 0);
        mve.q(parcel, 11, 4);
        parcel.writeInt(this.s ? 1 : 0);
        mve.q(parcel, 12, 4);
        parcel.writeInt(this.w ? 1 : 0);
        mve.n(parcel, 13, DesugarCollections.unmodifiableList(this.x));
        mve.q(parcel, 14, 4);
        parcel.writeInt(this.y ? 1 : 0);
        mve.q(parcel, 15, 4);
        parcel.writeInt(0);
        mve.q(parcel, 16, 4);
        parcel.writeInt(this.E ? 1 : 0);
        mve.k(parcel, 17, this.F, i);
        mve.k(parcel, 18, this.G, i);
        mve.s(parcel, r);
    }
}
