package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class v extends p6.a {
    public static final Parcelable.Creator<v> CREATOR = new w.a(25);
    public final y f8239a;
    public final b0 f8240b;
    public final byte[] f8241c;
    public final List d;
    public final Double e;
    public final List f8242f;
    public final m h;
    public final Integer f8243n;
    public final h0 f8244r;
    public final e f8245s;
    public final f v;
    public final String f8246w;
    public final ResultReceiver f8247x;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f8247x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f8239a = b10.f8239a;
                this.f8240b = b10.f8240b;
                this.f8241c = b10.f8241c;
                this.d = b10.d;
                this.e = b10.e;
                this.f8242f = b10.f8242f;
                this.h = b10.h;
                this.f8243n = b10.f8243n;
                this.f8244r = b10.f8244r;
                this.f8245s = b10.f8245s;
                this.v = b10.v;
                this.f8246w = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        o6.l.h(yVar);
        this.f8239a = yVar;
        o6.l.h(b0Var);
        this.f8240b = b0Var;
        o6.l.h(bArr);
        this.f8241c = bArr;
        o6.l.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f8242f = arrayList2;
        this.h = mVar;
        this.f8243n = num;
        this.f8244r = h0Var;
        if (str != null) {
            try {
                this.f8245s = e.a(str);
            } catch (d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f8245s = null;
        }
        this.v = fVar;
        this.f8246w = null;
    }

    public static d7.v b(org.json.JSONObject r32) {
        throw new UnsupportedOperationException("Method not decompiled: d7.v.b(org.json.JSONObject):d7.v");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list2 = vVar.d;
        List list3 = vVar.f8242f;
        if (o6.l.l(this.f8239a, vVar.f8239a) && o6.l.l(this.f8240b, vVar.f8240b) && Arrays.equals(this.f8241c, vVar.f8241c) && o6.l.l(this.e, vVar.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f8242f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && o6.l.l(this.h, vVar.h) && o6.l.l(this.f8243n, vVar.f8243n) && o6.l.l(this.f8244r, vVar.f8244r) && o6.l.l(this.f8245s, vVar.f8245s) && o6.l.l(this.v, vVar.v) && o6.l.l(this.f8246w, vVar.f8246w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8239a, this.f8240b, Integer.valueOf(Arrays.hashCode(this.f8241c)), this.d, this.e, this.f8242f, this.h, this.f8243n, this.f8244r, this.f8245s, this.v, this.f8246w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8239a);
        String valueOf2 = String.valueOf(this.f8240b);
        String c10 = v6.b.c(this.f8241c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f8242f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f8244r);
        String valueOf7 = String.valueOf(this.f8245s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder w10 = a1.g.w("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        c3.h0.r(w10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        w10.append(this.e);
        w10.append(", \n excludeList=");
        w10.append(valueOf4);
        w10.append(", \n authenticatorSelection=");
        w10.append(valueOf5);
        w10.append(", \n requestId=");
        w10.append(this.f8243n);
        w10.append(", \n tokenBinding=");
        w10.append(valueOf6);
        w10.append(", \n attestationConveyancePreference=");
        w10.append(valueOf7);
        w10.append(", \n authenticationExtensions=");
        w10.append(valueOf8);
        w10.append("}");
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f8239a, i10);
        df.k(parcel, 3, this.f8240b, i10);
        df.c(parcel, 4, this.f8241c);
        df.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            df.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        df.p(parcel, 7, this.f8242f);
        df.k(parcel, 8, this.h, i10);
        df.i(parcel, 9, this.f8243n);
        df.k(parcel, 10, this.f8244r, i10);
        e eVar = this.f8245s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f8168a;
        }
        df.l(parcel, 11, str);
        df.k(parcel, 12, this.v, i10);
        df.l(parcel, 13, this.f8246w);
        df.k(parcel, 14, this.f8247x, i10);
        df.r(parcel, q5);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f8239a = b10.f8239a;
            this.f8240b = b10.f8240b;
            this.f8241c = b10.f8241c;
            this.d = b10.d;
            this.e = b10.e;
            this.f8242f = b10.f8242f;
            this.h = b10.h;
            this.f8243n = b10.f8243n;
            this.f8244r = b10.f8244r;
            this.f8245s = b10.f8245s;
            this.v = b10.v;
            this.f8246w = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
