package o6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.th;
public final class v extends a6.a {
    public static final Parcelable.Creator<v> CREATOR = new n0(6);
    public final y f19442a;
    public final b0 f19443b;
    public final byte[] f19444c;
    public final List d;
    public final Double f19445e;
    public final List f19446f;
    public final m h;
    public final Integer f19447n;
    public final h0 f19448r;
    public final e f19449s;
    public final f v;
    public final String f19450w;
    public final ResultReceiver f19451x;

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f19442a = b10.f19442a;
            this.f19443b = b10.f19443b;
            this.f19444c = b10.f19444c;
            this.d = b10.d;
            this.f19445e = b10.f19445e;
            this.f19446f = b10.f19446f;
            this.h = b10.h;
            this.f19447n = b10.f19447n;
            this.f19448r = b10.f19448r;
            this.f19449s = b10.f19449s;
            this.v = b10.v;
            this.f19450w = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static o6.v b(org.json.JSONObject r32) {
        throw new UnsupportedOperationException("Method not decompiled: o6.v.b(org.json.JSONObject):o6.v");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list2 = vVar.d;
        List list3 = vVar.f19446f;
        if (z5.l.l(this.f19442a, vVar.f19442a) && z5.l.l(this.f19443b, vVar.f19443b) && Arrays.equals(this.f19444c, vVar.f19444c) && z5.l.l(this.f19445e, vVar.f19445e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f19446f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && z5.l.l(this.h, vVar.h) && z5.l.l(this.f19447n, vVar.f19447n) && z5.l.l(this.f19448r, vVar.f19448r) && z5.l.l(this.f19449s, vVar.f19449s) && z5.l.l(this.v, vVar.v) && z5.l.l(this.f19450w, vVar.f19450w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19442a, this.f19443b, Integer.valueOf(Arrays.hashCode(this.f19444c)), this.d, this.f19445e, this.f19446f, this.h, this.f19447n, this.f19448r, this.f19449s, this.v, this.f19450w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19442a);
        String valueOf2 = String.valueOf(this.f19443b);
        String c3 = g6.b.c(this.f19444c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f19446f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f19448r);
        String valueOf7 = String.valueOf(this.f19449s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder k9 = th.k("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        th.w(k9, c3, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        k9.append(this.f19445e);
        k9.append(", \n excludeList=");
        k9.append(valueOf4);
        k9.append(", \n authenticatorSelection=");
        k9.append(valueOf5);
        k9.append(", \n requestId=");
        k9.append(this.f19447n);
        k9.append(", \n tokenBinding=");
        k9.append(valueOf6);
        k9.append(", \n attestationConveyancePreference=");
        k9.append(valueOf7);
        k9.append(", \n authenticationExtensions=");
        k9.append(valueOf8);
        k9.append("}");
        return k9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f19442a, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f19443b, i10);
        com.google.android.gms.internal.cast.o.c(parcel, 4, this.f19444c);
        com.google.android.gms.internal.cast.o.p(parcel, 5, this.d);
        Double d = this.f19445e;
        if (d != null) {
            com.google.android.gms.internal.cast.o.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        com.google.android.gms.internal.cast.o.p(parcel, 7, this.f19446f);
        com.google.android.gms.internal.cast.o.k(parcel, 8, this.h, i10);
        com.google.android.gms.internal.cast.o.i(parcel, 9, this.f19447n);
        com.google.android.gms.internal.cast.o.k(parcel, 10, this.f19448r, i10);
        e eVar = this.f19449s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f19366a;
        }
        com.google.android.gms.internal.cast.o.l(parcel, 11, str);
        com.google.android.gms.internal.cast.o.k(parcel, 12, this.v, i10);
        com.google.android.gms.internal.cast.o.l(parcel, 13, this.f19450w);
        com.google.android.gms.internal.cast.o.k(parcel, 14, this.f19451x, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f19451x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f19442a = b10.f19442a;
                this.f19443b = b10.f19443b;
                this.f19444c = b10.f19444c;
                this.d = b10.d;
                this.f19445e = b10.f19445e;
                this.f19446f = b10.f19446f;
                this.h = b10.h;
                this.f19447n = b10.f19447n;
                this.f19448r = b10.f19448r;
                this.f19449s = b10.f19449s;
                this.v = b10.v;
                this.f19450w = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        z5.l.h(yVar);
        this.f19442a = yVar;
        z5.l.h(b0Var);
        this.f19443b = b0Var;
        z5.l.h(bArr);
        this.f19444c = bArr;
        z5.l.h(arrayList);
        this.d = arrayList;
        this.f19445e = d;
        this.f19446f = arrayList2;
        this.h = mVar;
        this.f19447n = num;
        this.f19448r = h0Var;
        if (str != null) {
            try {
                this.f19449s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f19449s = null;
        }
        this.v = fVar;
        this.f19450w = null;
    }
}
