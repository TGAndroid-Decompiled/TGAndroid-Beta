package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class nw8 extends b4 {
    public static final Parcelable.Creator<nw8> CREATOR = new v6d((byte) 23);
    public final qw8 a;
    public final tw8 b;
    public final byte[] c;
    public final ArrayList d;
    public final Double e;
    public final ArrayList f;
    public final d60 h;
    public final Integer n;
    public final asb r;
    public final dz s;
    public final w50 w;
    public final String x;
    public final ResultReceiver y;

    public nw8(qw8 qw8Var, tw8 tw8Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, d60 d60Var, Integer num, asb asbVar, String str, w50 w50Var, String str2, ResultReceiver resultReceiver) {
        this.y = resultReceiver;
        if (str2 != null) {
            try {
                nw8 b = b(new JSONObject(str2));
                this.a = b.a;
                this.b = b.b;
                this.c = b.c;
                this.d = b.d;
                this.e = b.e;
                this.f = b.f;
                this.h = b.h;
                this.n = b.n;
                this.r = b.r;
                this.s = b.s;
                this.w = b.w;
                this.x = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        ite.h(qw8Var);
        this.a = qw8Var;
        ite.h(tw8Var);
        this.b = tw8Var;
        ite.h(bArr);
        this.c = bArr;
        ite.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f = arrayList2;
        this.h = d60Var;
        this.n = num;
        this.r = asbVar;
        if (str != null) {
            try {
                this.s = dz.a(str);
            } catch (cz e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.s = null;
        }
        this.w = w50Var;
        this.x = null;
    }

    public static defpackage.nw8 b(org.json.JSONObject r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw8.b(org.json.JSONObject):nw8");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nw8) {
            nw8 nw8Var = (nw8) obj;
            ArrayList arrayList = nw8Var.f;
            ArrayList arrayList2 = nw8Var.d;
            if (fse.a(this.a, nw8Var.a) && fse.a(this.b, nw8Var.b) && Arrays.equals(this.c, nw8Var.c) && fse.a(this.e, nw8Var.e)) {
                ArrayList arrayList3 = this.d;
                if (arrayList3.containsAll(arrayList2) && arrayList2.containsAll(arrayList3)) {
                    ArrayList arrayList4 = this.f;
                    if (arrayList4 == null) {
                        if (arrayList != null) {
                            return false;
                        }
                    } else if (arrayList == null || !arrayList4.containsAll(arrayList) || !arrayList.containsAll(arrayList4)) {
                        return false;
                    }
                    if (fse.a(this.h, nw8Var.h) && fse.a(this.n, nw8Var.n) && fse.a(this.r, nw8Var.r) && fse.a(this.s, nw8Var.s) && fse.a(this.w, nw8Var.w) && fse.a(this.x, nw8Var.x)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String b = xpd.b(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.r);
        String valueOf7 = String.valueOf(this.s);
        String valueOf8 = String.valueOf(this.w);
        StringBuilder m = mlb.m("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        kt6.v(m, b, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        m.append(this.e);
        m.append(", \n excludeList=");
        m.append(valueOf4);
        m.append(", \n authenticatorSelection=");
        m.append(valueOf5);
        m.append(", \n requestId=");
        m.append(this.n);
        m.append(", \n tokenBinding=");
        m.append(valueOf6);
        m.append(", \n attestationConveyancePreference=");
        m.append(valueOf7);
        m.append(", \n authenticationExtensions=");
        m.append(valueOf8);
        m.append("}");
        return m.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        mve.k(parcel, 3, this.b, i);
        mve.c(parcel, 4, this.c);
        mve.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            mve.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        mve.p(parcel, 7, this.f);
        mve.k(parcel, 8, this.h, i);
        mve.i(parcel, 9, this.n);
        mve.k(parcel, 10, this.r, i);
        dz dzVar = this.s;
        if (dzVar == null) {
            str = null;
        } else {
            str = dzVar.a;
        }
        mve.l(parcel, 11, str);
        mve.k(parcel, 12, this.w, i);
        mve.l(parcel, 13, this.x);
        mve.k(parcel, 14, this.y, i);
        mve.s(parcel, r);
    }

    public nw8(String str) {
        try {
            nw8 b = b(new JSONObject(str));
            this.a = b.a;
            this.b = b.b;
            this.c = b.c;
            this.d = b.d;
            this.e = b.e;
            this.f = b.f;
            this.h = b.h;
            this.n = b.n;
            this.r = b.r;
            this.s = b.s;
            this.w = b.w;
            this.x = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
