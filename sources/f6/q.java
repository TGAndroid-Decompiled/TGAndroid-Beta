package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import c8.wb;
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
    public MediaInfo f11309a;
    public long f11310b;
    public int f11311c;
    public double d;
    public int f11312e;
    public int f11313f;
    public long h;
    public long f11314n;
    public double f11315r;
    public boolean f11316s;
    public long[] f11317w;
    public int f11318x;
    public int f11319y;
    public final ArrayList G = new ArrayList();
    public final SparseArray N = new SparseArray();

    static {
        q6.m.f("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j3, int i7, double d, int i10, int i11, long j10, long j11, double d2, boolean z9, long[] jArr, int i12, int i13, String str, int i14, ArrayList arrayList, boolean z10, c cVar, u uVar, j jVar, n nVar) {
        this.f11309a = mediaInfo;
        this.f11310b = j3;
        this.f11311c = i7;
        this.d = d;
        this.f11312e = i10;
        this.f11313f = i11;
        this.h = j10;
        this.f11314n = j11;
        this.f11315r = d2;
        this.f11316s = z9;
        this.f11317w = jArr;
        this.f11318x = i12;
        this.f11319y = i13;
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
        if (nVar != null && nVar.f11300s) {
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
                sparseArray.put(oVar.f11302b, Integer.valueOf(i7));
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
                if (z9 == z10 && this.f11310b == qVar.f11310b && this.f11311c == qVar.f11311c && this.d == qVar.d && this.f11312e == qVar.f11312e && this.f11313f == qVar.f11313f && this.h == qVar.h && this.f11315r == qVar.f11315r && this.f11316s == qVar.f11316s && this.f11318x == qVar.f11318x && this.f11319y == qVar.f11319y && this.F == qVar.F && Arrays.equals(this.f11317w, qVar.f11317w) && j6.a.d(Long.valueOf(this.f11314n), Long.valueOf(qVar.f11314n)) && j6.a.d(this.G, qVar.G) && j6.a.d(this.f11309a, qVar.f11309a) && (((jSONObject = this.E) == null || (jSONObject2 = qVar.E) == null || x6.c.a(jSONObject, jSONObject2)) && this.H == qVar.H && j6.a.d(this.I, qVar.I) && j6.a.d(this.J, qVar.J) && j6.a.d(this.K, qVar.K) && q6.m.k(this.L, qVar.L) && this.M == qVar.M)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11309a, Long.valueOf(this.f11310b), Integer.valueOf(this.f11311c), Double.valueOf(this.d), Integer.valueOf(this.f11312e), Integer.valueOf(this.f11313f), Long.valueOf(this.h), Long.valueOf(this.f11314n), Double.valueOf(this.f11315r), Boolean.valueOf(this.f11316s), Integer.valueOf(Arrays.hashCode(this.f11317w)), Integer.valueOf(this.f11318x), Integer.valueOf(this.f11319y), String.valueOf(this.E), Integer.valueOf(this.F), this.G, Boolean.valueOf(this.H), this.I, this.J, this.K, this.L});
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
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 2, this.f11309a, i7);
        long j3 = this.f11310b;
        wb.q(parcel, 3, 8);
        parcel.writeLong(j3);
        int i10 = this.f11311c;
        wb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        double d = this.d;
        wb.q(parcel, 5, 8);
        parcel.writeDouble(d);
        int i11 = this.f11312e;
        wb.q(parcel, 6, 4);
        parcel.writeInt(i11);
        int i12 = this.f11313f;
        wb.q(parcel, 7, 4);
        parcel.writeInt(i12);
        long j10 = this.h;
        wb.q(parcel, 8, 8);
        parcel.writeLong(j10);
        long j11 = this.f11314n;
        wb.q(parcel, 9, 8);
        parcel.writeLong(j11);
        double d2 = this.f11315r;
        wb.q(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z9 = this.f11316s;
        wb.q(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.j(parcel, 12, this.f11317w);
        int i13 = this.f11318x;
        wb.q(parcel, 13, 4);
        parcel.writeInt(i13);
        int i14 = this.f11319y;
        wb.q(parcel, 14, 4);
        parcel.writeInt(i14);
        wb.l(parcel, 15, this.D);
        int i15 = this.F;
        wb.q(parcel, 16, 4);
        parcel.writeInt(i15);
        wb.p(parcel, 17, this.G);
        boolean z10 = this.H;
        wb.q(parcel, 18, 4);
        parcel.writeInt(z10 ? 1 : 0);
        wb.k(parcel, 19, this.I, i7);
        wb.k(parcel, 20, this.J, i7);
        wb.k(parcel, 21, this.K, i7);
        wb.k(parcel, 22, this.L, i7);
        wb.s(parcel, r10);
    }
}
