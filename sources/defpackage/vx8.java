package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class vx8 extends c4 {
    public static final Parcelable.Creator<vx8> CREATOR = new m9d((byte) 23);
    public final yx8 a;
    public final by8 b;
    public final byte[] c;
    public final ArrayList d;
    public final Double e;
    public final ArrayList f;
    public final f50 h;
    public final Integer n;
    public final aub r;
    public final ey s;
    public final y40 w;
    public final String x;
    public final ResultReceiver y;

    public vx8(yx8 yx8Var, by8 by8Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, f50 f50Var, Integer num, aub aubVar, String str, y40 y40Var, String str2, ResultReceiver resultReceiver) {
        this.y = resultReceiver;
        if (str2 != null) {
            try {
                vx8 b = b(new JSONObject(str2));
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
        xve.h(yx8Var);
        this.a = yx8Var;
        xve.h(by8Var);
        this.b = by8Var;
        xve.h(bArr);
        this.c = bArr;
        xve.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f = arrayList2;
        this.h = f50Var;
        this.n = num;
        this.r = aubVar;
        if (str != null) {
            try {
                this.s = ey.a(str);
            } catch (dy e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.s = null;
        }
        this.w = y40Var;
        this.x = null;
    }

    public static defpackage.vx8 b(org.json.JSONObject r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx8.b(org.json.JSONObject):vx8");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vx8) {
            vx8 vx8Var = (vx8) obj;
            ArrayList arrayList = vx8Var.f;
            ArrayList arrayList2 = vx8Var.d;
            if (vue.a(this.a, vx8Var.a) && vue.a(this.b, vx8Var.b) && Arrays.equals(this.c, vx8Var.c) && vue.a(this.e, vx8Var.e)) {
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
                    if (vue.a(this.h, vx8Var.h) && vue.a(this.n, vx8Var.n) && vue.a(this.r, vx8Var.r) && vue.a(this.s, vx8Var.s) && vue.a(this.w, vx8Var.w) && vue.a(this.x, vx8Var.x)) {
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
        String b = lsd.b(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.r);
        String valueOf7 = String.valueOf(this.s);
        String valueOf8 = String.valueOf(this.w);
        StringBuilder l = xnb.l("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        qu6.u(l, b, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
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
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        bye.k(parcel, 3, this.b, i);
        bye.c(parcel, 4, this.c);
        bye.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            bye.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        bye.p(parcel, 7, this.f);
        bye.k(parcel, 8, this.h, i);
        bye.i(parcel, 9, this.n);
        bye.k(parcel, 10, this.r, i);
        ey eyVar = this.s;
        if (eyVar == null) {
            str = null;
        } else {
            str = eyVar.a;
        }
        bye.l(parcel, 11, str);
        bye.k(parcel, 12, this.w, i);
        bye.l(parcel, 13, this.x);
        bye.k(parcel, 14, this.y, i);
        bye.s(parcel, r);
    }

    public vx8(String str) {
        try {
            vx8 b = b(new JSONObject(str));
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
