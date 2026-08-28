package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import g7.p8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class q extends y5.a {
    public static final Parcelable.Creator<q> CREATOR;
    public JSONObject A;
    public int B;
    public boolean D;
    public c E;
    public u F;
    public j G;
    public n H;
    public boolean I;
    public MediaInfo f17453a;
    public long f17454b;
    public int f17455c;
    public double d;
    public int f17456e;
    public int f17457f;
    public long h;
    public long f17458n;
    public double f17459r;
    public boolean f17460s;
    public long[] v;
    public int f17461w;
    public int f17462x;
    public String f17463y;
    public final ArrayList C = new ArrayList();
    public final SparseArray J = new SparseArray();

    static {
        x5.l.g("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j10, int i9, double d, int i10, int i11, long j11, long j12, double d9, boolean z10, long[] jArr, int i12, int i13, String str, int i14, ArrayList arrayList, boolean z11, c cVar, u uVar, j jVar, n nVar) {
        this.f17453a = mediaInfo;
        this.f17454b = j10;
        this.f17455c = i9;
        this.d = d;
        this.f17456e = i10;
        this.f17457f = i11;
        this.h = j11;
        this.f17458n = j12;
        this.f17459r = d9;
        this.f17460s = z10;
        this.v = jArr;
        this.f17461w = i12;
        this.f17462x = i13;
        this.f17463y = str;
        if (str != null) {
            try {
                this.A = new JSONObject(this.f17463y);
            } catch (JSONException unused) {
                this.A = null;
                this.f17463y = null;
            }
        } else {
            this.A = null;
        }
        this.B = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.D = z11;
        this.E = cVar;
        this.F = uVar;
        this.G = jVar;
        this.H = nVar;
        boolean z12 = false;
        if (nVar != null && nVar.f17444s) {
            z12 = true;
        }
        this.I = z12;
    }

    public final int b(int r35, org.json.JSONObject r36) {
        throw new UnsupportedOperationException("Method not decompiled: m5.q.b(int, org.json.JSONObject):int");
    }

    public final void c(List list) {
        ArrayList arrayList = this.C;
        arrayList.clear();
        SparseArray sparseArray = this.J;
        sparseArray.clear();
        if (list != null) {
            for (int i9 = 0; i9 < list.size(); i9++) {
                o oVar = (o) list.get(i9);
                arrayList.add(oVar);
                sparseArray.put(oVar.f17446b, Integer.valueOf(i9));
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (this.A != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (qVar.A != null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z10 == z11 && this.f17454b == qVar.f17454b && this.f17455c == qVar.f17455c && this.d == qVar.d && this.f17456e == qVar.f17456e && this.f17457f == qVar.f17457f && this.h == qVar.h && this.f17459r == qVar.f17459r && this.f17460s == qVar.f17460s && this.f17461w == qVar.f17461w && this.f17462x == qVar.f17462x && this.B == qVar.B && Arrays.equals(this.v, qVar.v) && q5.a.d(Long.valueOf(this.f17458n), Long.valueOf(qVar.f17458n)) && q5.a.d(this.C, qVar.C) && q5.a.d(this.f17453a, qVar.f17453a) && (((jSONObject = this.A) == null || (jSONObject2 = qVar.A) == null || e6.c.a(jSONObject, jSONObject2)) && this.D == qVar.D && q5.a.d(this.E, qVar.E) && q5.a.d(this.F, qVar.F) && q5.a.d(this.G, qVar.G) && x5.l.l(this.H, qVar.H) && this.I == qVar.I)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17453a, Long.valueOf(this.f17454b), Integer.valueOf(this.f17455c), Double.valueOf(this.d), Integer.valueOf(this.f17456e), Integer.valueOf(this.f17457f), Long.valueOf(this.h), Long.valueOf(this.f17458n), Double.valueOf(this.f17459r), Boolean.valueOf(this.f17460s), Integer.valueOf(Arrays.hashCode(this.v)), Integer.valueOf(this.f17461w), Integer.valueOf(this.f17462x), String.valueOf(this.A), Integer.valueOf(this.B), this.C, Boolean.valueOf(this.D), this.E, this.F, this.G, this.H});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        String jSONObject;
        JSONObject jSONObject2 = this.A;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f17463y = jSONObject;
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.f17453a, i9);
        long j10 = this.f17454b;
        p8.s(parcel, 3, 8);
        parcel.writeLong(j10);
        int i10 = this.f17455c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        double d = this.d;
        p8.s(parcel, 5, 8);
        parcel.writeDouble(d);
        int i11 = this.f17456e;
        p8.s(parcel, 6, 4);
        parcel.writeInt(i11);
        int i12 = this.f17457f;
        p8.s(parcel, 7, 4);
        parcel.writeInt(i12);
        long j11 = this.h;
        p8.s(parcel, 8, 8);
        parcel.writeLong(j11);
        long j12 = this.f17458n;
        p8.s(parcel, 9, 8);
        parcel.writeLong(j12);
        double d9 = this.f17459r;
        p8.s(parcel, 10, 8);
        parcel.writeDouble(d9);
        boolean z10 = this.f17460s;
        p8.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.j(parcel, 12, this.v);
        int i13 = this.f17461w;
        p8.s(parcel, 13, 4);
        parcel.writeInt(i13);
        int i14 = this.f17462x;
        p8.s(parcel, 14, 4);
        parcel.writeInt(i14);
        p8.l(parcel, 15, this.f17463y);
        int i15 = this.B;
        p8.s(parcel, 16, 4);
        parcel.writeInt(i15);
        p8.p(parcel, 17, this.C);
        boolean z11 = this.D;
        p8.s(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        p8.k(parcel, 19, this.E, i9);
        p8.k(parcel, 20, this.F, i9);
        p8.k(parcel, 21, this.G, i9);
        p8.k(parcel, 22, this.H, i9);
        p8.r(parcel, q10);
    }
}
