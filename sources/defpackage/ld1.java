package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
public final class ld1 extends c4 {
    public static final Parcelable.Creator<ld1> CREATOR;
    public static final sre H = new sre(false);
    public static final f1f I = new f1f(0);
    public static final jd1 J;
    public final boolean E;
    public final sre F;
    public f1f G;
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final f26 d;
    public final boolean e;
    public final jd1 f;
    public final boolean h;
    public final double n;
    public final boolean r;
    public final boolean s;
    public final boolean w;
    public final ArrayList x;
    public final boolean y;

    static {
        new po7(po7.Z, po7.a0, 10000L, null, nue.a("smallIconDrawableResId"), nue.a("stopLiveStreamDrawableResId"), nue.a("pauseDrawableResId"), nue.a("playDrawableResId"), nue.a("skipNextDrawableResId"), nue.a("skipPrevDrawableResId"), nue.a("forwardDrawableResId"), nue.a("forward10DrawableResId"), nue.a("forward30DrawableResId"), nue.a("rewindDrawableResId"), nue.a("rewind10DrawableResId"), nue.a("rewind30DrawableResId"), nue.a("disconnectDrawableResId"), nue.a("notificationImageSizeDimenResId"), nue.a("castingToDeviceStringResId"), nue.a("stopLiveStreamStringResId"), nue.a("pauseStringResId"), nue.a("playStringResId"), nue.a("skipNextStringResId"), nue.a("skipPrevStringResId"), nue.a("forwardStringResId"), nue.a("forward10StringResId"), nue.a("forward30StringResId"), nue.a("rewindStringResId"), nue.a("rewind10StringResId"), nue.a("rewind30StringResId"), nue.a("disconnectStringResId"), null, false, false);
        J = new jd1("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new t4f((byte) 7);
    }

    public ld1(String str, ArrayList arrayList, boolean z, f26 f26Var, boolean z2, jd1 jd1Var, boolean z3, double d, boolean z4, boolean z5, boolean z6, ArrayList arrayList2, boolean z7, boolean z8, sre sreVar, f1f f1fVar) {
        this.a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.c = z;
        this.d = f26Var == null ? new f26() : f26Var;
        this.e = z2;
        this.f = jd1Var;
        this.h = z3;
        this.n = d;
        this.r = z4;
        this.s = z5;
        this.w = z6;
        this.x = arrayList2;
        this.y = z7;
        this.E = z8;
        this.F = sreVar;
        this.G = f1fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.n(parcel, 3, DesugarCollections.unmodifiableList(this.b));
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bye.k(parcel, 5, this.d, i);
        bye.q(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        bye.k(parcel, 7, this.f, i);
        bye.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        bye.q(parcel, 9, 8);
        parcel.writeDouble(this.n);
        bye.q(parcel, 10, 4);
        parcel.writeInt(this.r ? 1 : 0);
        bye.q(parcel, 11, 4);
        parcel.writeInt(this.s ? 1 : 0);
        bye.q(parcel, 12, 4);
        parcel.writeInt(this.w ? 1 : 0);
        bye.n(parcel, 13, DesugarCollections.unmodifiableList(this.x));
        bye.q(parcel, 14, 4);
        parcel.writeInt(this.y ? 1 : 0);
        bye.q(parcel, 15, 4);
        parcel.writeInt(0);
        bye.q(parcel, 16, 4);
        parcel.writeInt(this.E ? 1 : 0);
        bye.k(parcel, 17, this.F, i);
        bye.k(parcel, 18, this.G, i);
        bye.s(parcel, r);
    }
}
