package m6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import g7.p8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class v extends y5.a {
    public static final Parcelable.Creator<v> CREATOR = new h5.h(24);
    public final y f17582a;
    public final b0 f17583b;
    public final byte[] f17584c;
    public final List d;
    public final Double f17585e;
    public final List f17586f;
    public final m h;
    public final Integer f17587n;
    public final h0 f17588r;
    public final e f17589s;
    public final f v;
    public final String f17590w;
    public final ResultReceiver f17591x;

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f17582a = b10.f17582a;
            this.f17583b = b10.f17583b;
            this.f17584c = b10.f17584c;
            this.d = b10.d;
            this.f17585e = b10.f17585e;
            this.f17586f = b10.f17586f;
            this.h = b10.h;
            this.f17587n = b10.f17587n;
            this.f17588r = b10.f17588r;
            this.f17589s = b10.f17589s;
            this.v = b10.v;
            this.f17590w = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static m6.v b(org.json.JSONObject r32) {
        throw new UnsupportedOperationException("Method not decompiled: m6.v.b(org.json.JSONObject):m6.v");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list2 = vVar.d;
        List list3 = vVar.f17586f;
        if (x5.l.l(this.f17582a, vVar.f17582a) && x5.l.l(this.f17583b, vVar.f17583b) && Arrays.equals(this.f17584c, vVar.f17584c) && x5.l.l(this.f17585e, vVar.f17585e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f17586f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && x5.l.l(this.h, vVar.h) && x5.l.l(this.f17587n, vVar.f17587n) && x5.l.l(this.f17588r, vVar.f17588r) && x5.l.l(this.f17589s, vVar.f17589s) && x5.l.l(this.v, vVar.v) && x5.l.l(this.f17590w, vVar.f17590w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17582a, this.f17583b, Integer.valueOf(Arrays.hashCode(this.f17584c)), this.d, this.f17585e, this.f17586f, this.h, this.f17587n, this.f17588r, this.f17589s, this.v, this.f17590w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17582a);
        String valueOf2 = String.valueOf(this.f17583b);
        String c10 = e6.b.c(this.f17584c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f17586f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f17588r);
        String valueOf7 = String.valueOf(this.f17589s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder q10 = j3.r0.q("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        j3.r0.A(q10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        q10.append(this.f17585e);
        q10.append(", \n excludeList=");
        q10.append(valueOf4);
        q10.append(", \n authenticatorSelection=");
        q10.append(valueOf5);
        q10.append(", \n requestId=");
        q10.append(this.f17587n);
        q10.append(", \n tokenBinding=");
        q10.append(valueOf6);
        q10.append(", \n attestationConveyancePreference=");
        q10.append(valueOf7);
        q10.append(", \n authenticationExtensions=");
        q10.append(valueOf8);
        q10.append("}");
        return q10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        String str;
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.f17582a, i9);
        p8.k(parcel, 3, this.f17583b, i9);
        p8.c(parcel, 4, this.f17584c);
        p8.p(parcel, 5, this.d);
        Double d = this.f17585e;
        if (d != null) {
            p8.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        p8.p(parcel, 7, this.f17586f);
        p8.k(parcel, 8, this.h, i9);
        p8.i(parcel, 9, this.f17587n);
        p8.k(parcel, 10, this.f17588r, i9);
        e eVar = this.f17589s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f17506a;
        }
        p8.l(parcel, 11, str);
        p8.k(parcel, 12, this.v, i9);
        p8.l(parcel, 13, this.f17590w);
        p8.k(parcel, 14, this.f17591x, i9);
        p8.r(parcel, q10);
    }

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f17591x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f17582a = b10.f17582a;
                this.f17583b = b10.f17583b;
                this.f17584c = b10.f17584c;
                this.d = b10.d;
                this.f17585e = b10.f17585e;
                this.f17586f = b10.f17586f;
                this.h = b10.h;
                this.f17587n = b10.f17587n;
                this.f17588r = b10.f17588r;
                this.f17589s = b10.f17589s;
                this.v = b10.v;
                this.f17590w = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        x5.l.h(yVar);
        this.f17582a = yVar;
        x5.l.h(b0Var);
        this.f17583b = b0Var;
        x5.l.h(bArr);
        this.f17584c = bArr;
        x5.l.h(arrayList);
        this.d = arrayList;
        this.f17585e = d;
        this.f17586f = arrayList2;
        this.h = mVar;
        this.f17587n = num;
        this.f17588r = h0Var;
        if (str != null) {
            try {
                this.f17589s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f17589s = null;
        }
        this.v = fVar;
        this.f17590w = null;
    }
}
