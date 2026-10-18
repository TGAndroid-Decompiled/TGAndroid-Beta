package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new w.a(24);
    public final y f5014a;
    public final b0 f5015b;
    public final byte[] f5016c;
    public final List d;
    public final Double e;
    public final List f5017f;
    public final m h;
    public final Integer f5018n;
    public final h0 f5019r;
    public final e f5020s;
    public final f v;
    public final String f5021w;
    public final ResultReceiver f5022x;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f5022x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f5014a = b10.f5014a;
                this.f5015b = b10.f5015b;
                this.f5016c = b10.f5016c;
                this.d = b10.d;
                this.e = b10.e;
                this.f5017f = b10.f5017f;
                this.h = b10.h;
                this.f5018n = b10.f5018n;
                this.f5019r = b10.f5019r;
                this.f5020s = b10.f5020s;
                this.v = b10.v;
                this.f5021w = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        n6.l.h(yVar);
        this.f5014a = yVar;
        n6.l.h(b0Var);
        this.f5015b = b0Var;
        n6.l.h(bArr);
        this.f5016c = bArr;
        n6.l.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f5017f = arrayList2;
        this.h = mVar;
        this.f5018n = num;
        this.f5019r = h0Var;
        if (str != null) {
            try {
                this.f5020s = e.a(str);
            } catch (d e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f5020s = null;
        }
        this.v = fVar;
        this.f5021w = null;
    }

    public static c7.v b(org.json.JSONObject r32) {
        throw new UnsupportedOperationException("Method not decompiled: c7.v.b(org.json.JSONObject):c7.v");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list2 = vVar.d;
        List list3 = vVar.f5017f;
        if (n6.l.l(this.f5014a, vVar.f5014a) && n6.l.l(this.f5015b, vVar.f5015b) && Arrays.equals(this.f5016c, vVar.f5016c) && n6.l.l(this.e, vVar.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f5017f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && n6.l.l(this.h, vVar.h) && n6.l.l(this.f5018n, vVar.f5018n) && n6.l.l(this.f5019r, vVar.f5019r) && n6.l.l(this.f5020s, vVar.f5020s) && n6.l.l(this.v, vVar.v) && n6.l.l(this.f5021w, vVar.f5021w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5014a, this.f5015b, Integer.valueOf(Arrays.hashCode(this.f5016c)), this.d, this.e, this.f5017f, this.h, this.f5018n, this.f5019r, this.f5020s, this.v, this.f5021w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5014a);
        String valueOf2 = String.valueOf(this.f5015b);
        String c10 = u6.b.c(this.f5016c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f5017f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f5019r);
        String valueOf7 = String.valueOf(this.f5020s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder w9 = a1.g.w("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        a1.g.A(w9, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        w9.append(this.e);
        w9.append(", \n excludeList=");
        w9.append(valueOf4);
        w9.append(", \n authenticatorSelection=");
        w9.append(valueOf5);
        w9.append(", \n requestId=");
        w9.append(this.f5018n);
        w9.append(", \n tokenBinding=");
        w9.append(valueOf6);
        w9.append(", \n attestationConveyancePreference=");
        w9.append(valueOf7);
        w9.append(", \n authenticationExtensions=");
        w9.append(valueOf8);
        w9.append("}");
        return w9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f5014a, i10);
        w7.f0.k(parcel, 3, this.f5015b, i10);
        w7.f0.c(parcel, 4, this.f5016c);
        w7.f0.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            w7.f0.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        w7.f0.p(parcel, 7, this.f5017f);
        w7.f0.k(parcel, 8, this.h, i10);
        w7.f0.i(parcel, 9, this.f5018n);
        w7.f0.k(parcel, 10, this.f5019r, i10);
        e eVar = this.f5020s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f4943a;
        }
        w7.f0.l(parcel, 11, str);
        w7.f0.k(parcel, 12, this.v, i10);
        w7.f0.l(parcel, 13, this.f5021w);
        w7.f0.k(parcel, 14, this.f5022x, i10);
        w7.f0.r(parcel, q6);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f5014a = b10.f5014a;
            this.f5015b = b10.f5015b;
            this.f5016c = b10.f5016c;
            this.d = b10.d;
            this.e = b10.e;
            this.f5017f = b10.f5017f;
            this.h = b10.h;
            this.f5018n = b10.f5018n;
            this.f5019r = b10.f5019r;
            this.f5020s = b10.f5020s;
            this.v = b10.v;
            this.f5021w = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
