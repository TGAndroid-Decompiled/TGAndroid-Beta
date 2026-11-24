package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class mu8 extends b4 {
    public static final Parcelable.Creator<mu8> CREATOR = new t4d((byte) 23);
    public final pu8 a;
    public final su8 b;
    public final byte[] c;
    public final ArrayList d;
    public final Double e;
    public final ArrayList f;
    public final d50 h;
    public final Integer n;
    public final zpb r;
    public final dy s;
    public final w40 w;
    public final String x;
    public final ResultReceiver y;

    public mu8(pu8 pu8Var, su8 su8Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, d50 d50Var, Integer num, zpb zpbVar, String str, w40 w40Var, String str2, ResultReceiver resultReceiver) {
        this.y = resultReceiver;
        if (str2 != null) {
            try {
                mu8 b = b(new JSONObject(str2));
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
        fre.h(pu8Var);
        this.a = pu8Var;
        fre.h(su8Var);
        this.b = su8Var;
        fre.h(bArr);
        this.c = bArr;
        fre.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f = arrayList2;
        this.h = d50Var;
        this.n = num;
        this.r = zpbVar;
        if (str != null) {
            try {
                this.s = dy.a(str);
            } catch (cy e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.s = null;
        }
        this.w = w40Var;
        this.x = null;
    }

    public static defpackage.mu8 b(org.json.JSONObject r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu8.b(org.json.JSONObject):mu8");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mu8) {
            mu8 mu8Var = (mu8) obj;
            ArrayList arrayList = mu8Var.f;
            ArrayList arrayList2 = mu8Var.d;
            if (cqe.a(this.a, mu8Var.a) && cqe.a(this.b, mu8Var.b) && Arrays.equals(this.c, mu8Var.c) && cqe.a(this.e, mu8Var.e)) {
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
                    if (cqe.a(this.h, mu8Var.h) && cqe.a(this.n, mu8Var.n) && cqe.a(this.r, mu8Var.r) && cqe.a(this.s, mu8Var.s) && cqe.a(this.w, mu8Var.w) && cqe.a(this.x, mu8Var.x)) {
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
        String b = und.b(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.r);
        String valueOf7 = String.valueOf(this.s);
        String valueOf8 = String.valueOf(this.w);
        StringBuilder l = yjb.l("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        ls6.u(l, b, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        l.append(this.e);
        l.append(", \n excludeList=");
        l.append(valueOf4);
        l.append(", \n authenticatorSelection=");
        l.append(valueOf5);
        l.append(", \n requestId=");
        l.append(this.n);
        l.append(", \n tokenBinding=");
        l.append(valueOf6);
        l.append(", \n attestationConveyancePreference=");
        l.append(valueOf7);
        l.append(", \n authenticationExtensions=");
        l.append(valueOf8);
        l.append("}");
        return l.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        jte.k(parcel, 3, this.b, i);
        jte.c(parcel, 4, this.c);
        jte.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            jte.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        jte.p(parcel, 7, this.f);
        jte.k(parcel, 8, this.h, i);
        jte.i(parcel, 9, this.n);
        jte.k(parcel, 10, this.r, i);
        dy dyVar = this.s;
        if (dyVar == null) {
            str = null;
        } else {
            str = dyVar.a;
        }
        jte.l(parcel, 11, str);
        jte.k(parcel, 12, this.w, i);
        jte.l(parcel, 13, this.x);
        jte.k(parcel, 14, this.y, i);
        jte.s(parcel, r);
    }

    public mu8(String str) {
        try {
            mu8 b = b(new JSONObject(str));
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
