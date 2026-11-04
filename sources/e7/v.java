package e7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class v extends q6.a {
    public static final Parcelable.Creator<v> CREATOR = new w.a(28);
    public final y f9883a;
    public final b0 f9884b;
    public final byte[] f9885c;
    public final List d;
    public final Double f9886e;
    public final List f9887f;
    public final m h;
    public final Integer f9888n;
    public final h0 f9889r;
    public final e f9890s;
    public final f f9891w;
    public final String f9892x;
    public final ResultReceiver f9893y;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f9893y = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f9883a = b10.f9883a;
                this.f9884b = b10.f9884b;
                this.f9885c = b10.f9885c;
                this.d = b10.d;
                this.f9886e = b10.f9886e;
                this.f9887f = b10.f9887f;
                this.h = b10.h;
                this.f9888n = b10.f9888n;
                this.f9889r = b10.f9889r;
                this.f9890s = b10.f9890s;
                this.f9891w = b10.f9891w;
                this.f9892x = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        p6.m.g(yVar);
        this.f9883a = yVar;
        p6.m.g(b0Var);
        this.f9884b = b0Var;
        p6.m.g(bArr);
        this.f9885c = bArr;
        p6.m.g(arrayList);
        this.d = arrayList;
        this.f9886e = d;
        this.f9887f = arrayList2;
        this.h = mVar;
        this.f9888n = num;
        this.f9889r = h0Var;
        if (str != null) {
            try {
                this.f9890s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f9890s = null;
        }
        this.f9891w = fVar;
        this.f9892x = null;
    }

    public static e7.v b(org.json.JSONObject r32) {
        throw new UnsupportedOperationException("Method not decompiled: e7.v.b(org.json.JSONObject):e7.v");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list2 = vVar.d;
        List list3 = vVar.f9887f;
        if (p6.m.k(this.f9883a, vVar.f9883a) && p6.m.k(this.f9884b, vVar.f9884b) && Arrays.equals(this.f9885c, vVar.f9885c) && p6.m.k(this.f9886e, vVar.f9886e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f9887f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && p6.m.k(this.h, vVar.h) && p6.m.k(this.f9888n, vVar.f9888n) && p6.m.k(this.f9889r, vVar.f9889r) && p6.m.k(this.f9890s, vVar.f9890s) && p6.m.k(this.f9891w, vVar.f9891w) && p6.m.k(this.f9892x, vVar.f9892x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9883a, this.f9884b, Integer.valueOf(Arrays.hashCode(this.f9885c)), this.d, this.f9886e, this.f9887f, this.h, this.f9888n, this.f9889r, this.f9890s, this.f9891w, this.f9892x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9883a);
        String valueOf2 = String.valueOf(this.f9884b);
        String c2 = w6.b.c(this.f9885c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f9887f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f9889r);
        String valueOf7 = String.valueOf(this.f9890s);
        String valueOf8 = String.valueOf(this.f9891w);
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        com.google.android.recaptcha.internal.a.s(n4, c2, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        n4.append(this.f9886e);
        n4.append(", \n excludeList=");
        n4.append(valueOf4);
        n4.append(", \n authenticatorSelection=");
        n4.append(valueOf5);
        n4.append(", \n requestId=");
        n4.append(this.f9888n);
        n4.append(", \n tokenBinding=");
        n4.append(valueOf6);
        n4.append(", \n attestationConveyancePreference=");
        n4.append(valueOf7);
        n4.append(", \n authenticationExtensions=");
        n4.append(valueOf8);
        n4.append("}");
        return n4.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        String str;
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.f9883a, i3);
        j8.a.l(parcel, 3, this.f9884b, i3);
        j8.a.d(parcel, 4, this.f9885c);
        j8.a.q(parcel, 5, this.d);
        Double d = this.f9886e;
        if (d != null) {
            j8.a.r(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        j8.a.q(parcel, 7, this.f9887f);
        j8.a.l(parcel, 8, this.h, i3);
        j8.a.j(parcel, 9, this.f9888n);
        j8.a.l(parcel, 10, this.f9889r, i3);
        e eVar = this.f9890s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f9806a;
        }
        j8.a.m(parcel, 11, str);
        j8.a.l(parcel, 12, this.f9891w, i3);
        j8.a.m(parcel, 13, this.f9892x);
        j8.a.l(parcel, 14, this.f9893y, i3);
        j8.a.t(parcel, s6);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f9883a = b10.f9883a;
            this.f9884b = b10.f9884b;
            this.f9885c = b10.f9885c;
            this.d = b10.d;
            this.f9886e = b10.f9886e;
            this.f9887f = b10.f9887f;
            this.h = b10.h;
            this.f9888n = b10.f9888n;
            this.f9889r = b10.f9889r;
            this.f9890s = b10.f9890s;
            this.f9891w = b10.f9891w;
            this.f9892x = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
