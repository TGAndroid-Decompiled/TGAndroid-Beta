package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import c8.xb;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR;
    public String D;
    public JSONObject E;
    public int F;
    public boolean H;
    public c I;
    public u J;
    public j K;
    public n L;
    public boolean M;
    public MediaInfo f11314a;
    public long f11315b;
    public int f11316c;
    public double d;
    public int f11317e;
    public int f11318f;
    public long h;
    public long f11319n;
    public double f11320r;
    public boolean f11321s;
    public long[] f11322w;
    public int f11323x;
    public int f11324y;
    public final ArrayList G = new ArrayList();
    public final SparseArray N = new SparseArray();

    static {
        q6.m.f("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j3, int i7, double d, int i10, int i11, long j10, long j11, double d2, boolean z9, long[] jArr, int i12, int i13, String str, int i14, ArrayList arrayList, boolean z10, c cVar, u uVar, j jVar, n nVar) {
        this.f11314a = mediaInfo;
        this.f11315b = j3;
        this.f11316c = i7;
        this.d = d;
        this.f11317e = i10;
        this.f11318f = i11;
        this.h = j10;
        this.f11319n = j11;
        this.f11320r = d2;
        this.f11321s = z9;
        this.f11322w = jArr;
        this.f11323x = i12;
        this.f11324y = i13;
        this.D = str;
        if (str != null) {
            try {
                this.E = new JSONObject(this.D);
            } catch (JSONException unused) {
                this.E = null;
                this.D = null;
            }
        } else {
            this.E = null;
        }
        this.F = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.H = z10;
        this.I = cVar;
        this.J = uVar;
        this.K = jVar;
        this.L = nVar;
        boolean z11 = false;
        if (nVar != null && nVar.f11305s) {
            z11 = true;
        }
        this.M = z11;
    }

    public final int b(org.json.JSONObject r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: f6.q.b(org.json.JSONObject, int):int");
    }

    public final void c(List list) {
        ArrayList arrayList = this.G;
        arrayList.clear();
        SparseArray sparseArray = this.N;
        sparseArray.clear();
        if (list != null) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                o oVar = (o) list.get(i7);
                arrayList.add(oVar);
                sparseArray.put(oVar.f11307b, Integer.valueOf(i7));
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (this.E != null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (qVar.E != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z9 == z10 && this.f11315b == qVar.f11315b && this.f11316c == qVar.f11316c && this.d == qVar.d && this.f11317e == qVar.f11317e && this.f11318f == qVar.f11318f && this.h == qVar.h && this.f11320r == qVar.f11320r && this.f11321s == qVar.f11321s && this.f11323x == qVar.f11323x && this.f11324y == qVar.f11324y && this.F == qVar.F && Arrays.equals(this.f11322w, qVar.f11322w) && j6.a.d(Long.valueOf(this.f11319n), Long.valueOf(qVar.f11319n)) && j6.a.d(this.G, qVar.G) && j6.a.d(this.f11314a, qVar.f11314a) && (((jSONObject = this.E) == null || (jSONObject2 = qVar.E) == null || x6.c.a(jSONObject, jSONObject2)) && this.H == qVar.H && j6.a.d(this.I, qVar.I) && j6.a.d(this.J, qVar.J) && j6.a.d(this.K, qVar.K) && q6.m.k(this.L, qVar.L) && this.M == qVar.M)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11314a, Long.valueOf(this.f11315b), Integer.valueOf(this.f11316c), Double.valueOf(this.d), Integer.valueOf(this.f11317e), Integer.valueOf(this.f11318f), Long.valueOf(this.h), Long.valueOf(this.f11319n), Double.valueOf(this.f11320r), Boolean.valueOf(this.f11321s), Integer.valueOf(Arrays.hashCode(this.f11322w)), Integer.valueOf(this.f11323x), Integer.valueOf(this.f11324y), String.valueOf(this.E), Integer.valueOf(this.F), this.G, Boolean.valueOf(this.H), this.I, this.J, this.K, this.L});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.E;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.D = jSONObject;
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f11314a, i7);
        long j3 = this.f11315b;
        xb.q(parcel, 3, 8);
        parcel.writeLong(j3);
        int i10 = this.f11316c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        double d = this.d;
        xb.q(parcel, 5, 8);
        parcel.writeDouble(d);
        int i11 = this.f11317e;
        xb.q(parcel, 6, 4);
        parcel.writeInt(i11);
        int i12 = this.f11318f;
        xb.q(parcel, 7, 4);
        parcel.writeInt(i12);
        long j10 = this.h;
        xb.q(parcel, 8, 8);
        parcel.writeLong(j10);
        long j11 = this.f11319n;
        xb.q(parcel, 9, 8);
        parcel.writeLong(j11);
        double d2 = this.f11320r;
        xb.q(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z9 = this.f11321s;
        xb.q(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.j(parcel, 12, this.f11322w);
        int i13 = this.f11323x;
        xb.q(parcel, 13, 4);
        parcel.writeInt(i13);
        int i14 = this.f11324y;
        xb.q(parcel, 14, 4);
        parcel.writeInt(i14);
        xb.l(parcel, 15, this.D);
        int i15 = this.F;
        xb.q(parcel, 16, 4);
        parcel.writeInt(i15);
        xb.p(parcel, 17, this.G);
        boolean z10 = this.H;
        xb.q(parcel, 18, 4);
        parcel.writeInt(z10 ? 1 : 0);
        xb.k(parcel, 19, this.I, i7);
        xb.k(parcel, 20, this.J, i7);
        xb.k(parcel, 21, this.K, i7);
        xb.k(parcel, 22, this.L, i7);
        xb.s(parcel, r10);
    }
}
