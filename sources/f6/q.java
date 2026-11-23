package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import c8.bc;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR;
    public String E;
    public JSONObject F;
    public int G;
    public boolean I;
    public c J;
    public u K;
    public j L;
    public n M;
    public boolean N;
    public MediaInfo f11472a;
    public long f11473b;
    public int f11474c;
    public double d;
    public int f11475e;
    public int f11476f;
    public long h;
    public long f11477n;
    public double f11478r;
    public boolean f11479s;
    public long[] f11480w;
    public int f11481x;
    public int f11482y;
    public final ArrayList H = new ArrayList();
    public final SparseArray O = new SparseArray();

    static {
        q6.m.g("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j3, int i7, double d, int i10, int i11, long j10, long j11, double d2, boolean z10, long[] jArr, int i12, int i13, String str, int i14, ArrayList arrayList, boolean z11, c cVar, u uVar, j jVar, n nVar) {
        this.f11472a = mediaInfo;
        this.f11473b = j3;
        this.f11474c = i7;
        this.d = d;
        this.f11475e = i10;
        this.f11476f = i11;
        this.h = j10;
        this.f11477n = j11;
        this.f11478r = d2;
        this.f11479s = z10;
        this.f11480w = jArr;
        this.f11481x = i12;
        this.f11482y = i13;
        this.E = str;
        if (str != null) {
            try {
                this.F = new JSONObject(this.E);
            } catch (JSONException unused) {
                this.F = null;
                this.E = null;
            }
        } else {
            this.F = null;
        }
        this.G = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.I = z11;
        this.J = cVar;
        this.K = uVar;
        this.L = jVar;
        this.M = nVar;
        boolean z12 = false;
        if (nVar != null && nVar.f11463s) {
            z12 = true;
        }
        this.N = z12;
    }

    public final int b(org.json.JSONObject r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: f6.q.b(org.json.JSONObject, int):int");
    }

    public final void c(List list) {
        ArrayList arrayList = this.H;
        arrayList.clear();
        SparseArray sparseArray = this.O;
        sparseArray.clear();
        if (list != null) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                o oVar = (o) list.get(i7);
                arrayList.add(oVar);
                sparseArray.put(oVar.f11465b, Integer.valueOf(i7));
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
                if (this.F != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (qVar.F != null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z10 == z11 && this.f11473b == qVar.f11473b && this.f11474c == qVar.f11474c && this.d == qVar.d && this.f11475e == qVar.f11475e && this.f11476f == qVar.f11476f && this.h == qVar.h && this.f11478r == qVar.f11478r && this.f11479s == qVar.f11479s && this.f11481x == qVar.f11481x && this.f11482y == qVar.f11482y && this.G == qVar.G && Arrays.equals(this.f11480w, qVar.f11480w) && j6.a.d(Long.valueOf(this.f11477n), Long.valueOf(qVar.f11477n)) && j6.a.d(this.H, qVar.H) && j6.a.d(this.f11472a, qVar.f11472a) && (((jSONObject = this.F) == null || (jSONObject2 = qVar.F) == null || x6.c.a(jSONObject, jSONObject2)) && this.I == qVar.I && j6.a.d(this.J, qVar.J) && j6.a.d(this.K, qVar.K) && j6.a.d(this.L, qVar.L) && q6.m.l(this.M, qVar.M) && this.N == qVar.N)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11472a, Long.valueOf(this.f11473b), Integer.valueOf(this.f11474c), Double.valueOf(this.d), Integer.valueOf(this.f11475e), Integer.valueOf(this.f11476f), Long.valueOf(this.h), Long.valueOf(this.f11477n), Double.valueOf(this.f11478r), Boolean.valueOf(this.f11479s), Integer.valueOf(Arrays.hashCode(this.f11480w)), Integer.valueOf(this.f11481x), Integer.valueOf(this.f11482y), String.valueOf(this.F), Integer.valueOf(this.G), this.H, Boolean.valueOf(this.I), this.J, this.K, this.L, this.M});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.F;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.E = jSONObject;
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f11472a, i7);
        long j3 = this.f11473b;
        bc.q(parcel, 3, 8);
        parcel.writeLong(j3);
        int i10 = this.f11474c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        double d = this.d;
        bc.q(parcel, 5, 8);
        parcel.writeDouble(d);
        int i11 = this.f11475e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i11);
        int i12 = this.f11476f;
        bc.q(parcel, 7, 4);
        parcel.writeInt(i12);
        long j10 = this.h;
        bc.q(parcel, 8, 8);
        parcel.writeLong(j10);
        long j11 = this.f11477n;
        bc.q(parcel, 9, 8);
        parcel.writeLong(j11);
        double d2 = this.f11478r;
        bc.q(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z10 = this.f11479s;
        bc.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.j(parcel, 12, this.f11480w);
        int i13 = this.f11481x;
        bc.q(parcel, 13, 4);
        parcel.writeInt(i13);
        int i14 = this.f11482y;
        bc.q(parcel, 14, 4);
        parcel.writeInt(i14);
        bc.l(parcel, 15, this.E);
        int i15 = this.G;
        bc.q(parcel, 16, 4);
        parcel.writeInt(i15);
        bc.p(parcel, 17, this.H);
        boolean z11 = this.I;
        bc.q(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        bc.k(parcel, 19, this.J, i7);
        bc.k(parcel, 20, this.K, i7);
        bc.k(parcel, 21, this.L, i7);
        bc.k(parcel, 22, this.M, i7);
        bc.s(parcel, r10);
    }
}
