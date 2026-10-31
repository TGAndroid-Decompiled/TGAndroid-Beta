package c6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import w7.h0;
public final class q extends o6.a {
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
    public MediaInfo f3921a;
    public long f3922b;
    public int f3923c;
    public double d;
    public int e;
    public int f3924f;
    public long h;
    public long f3925n;
    public double f3926r;
    public boolean f3927s;
    public long[] f3928w;
    public int f3929x;
    public int f3930y;
    public final ArrayList G = new ArrayList();
    public final SparseArray N = new SparseArray();

    static {
        n6.l.f("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j10, int i10, double d, int i11, int i12, long j11, long j12, double d10, boolean z10, long[] jArr, int i13, int i14, String str, int i15, ArrayList arrayList, boolean z11, c cVar, u uVar, j jVar, n nVar) {
        this.f3921a = mediaInfo;
        this.f3922b = j10;
        this.f3923c = i10;
        this.d = d;
        this.e = i11;
        this.f3924f = i12;
        this.h = j11;
        this.f3925n = j12;
        this.f3926r = d10;
        this.f3927s = z10;
        this.f3928w = jArr;
        this.f3929x = i13;
        this.f3930y = i14;
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
        this.F = i15;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.H = z11;
        this.I = cVar;
        this.J = uVar;
        this.K = jVar;
        this.L = nVar;
        boolean z12 = false;
        if (nVar != null && nVar.f3913s) {
            z12 = true;
        }
        this.M = z12;
    }

    public final int b(org.json.JSONObject r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: c6.q.b(org.json.JSONObject, int):int");
    }

    public final void c(List list) {
        ArrayList arrayList = this.G;
        arrayList.clear();
        SparseArray sparseArray = this.N;
        sparseArray.clear();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                o oVar = (o) list.get(i10);
                arrayList.add(oVar);
                sparseArray.put(oVar.f3915b, Integer.valueOf(i10));
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
                if (this.E != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (qVar.E != null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z10 == z11 && this.f3922b == qVar.f3922b && this.f3923c == qVar.f3923c && this.d == qVar.d && this.e == qVar.e && this.f3924f == qVar.f3924f && this.h == qVar.h && this.f3926r == qVar.f3926r && this.f3927s == qVar.f3927s && this.f3929x == qVar.f3929x && this.f3930y == qVar.f3930y && this.F == qVar.F && Arrays.equals(this.f3928w, qVar.f3928w) && g6.a.d(Long.valueOf(this.f3925n), Long.valueOf(qVar.f3925n)) && g6.a.d(this.G, qVar.G) && g6.a.d(this.f3921a, qVar.f3921a) && (((jSONObject = this.E) == null || (jSONObject2 = qVar.E) == null || u6.c.a(jSONObject, jSONObject2)) && this.H == qVar.H && g6.a.d(this.I, qVar.I) && g6.a.d(this.J, qVar.J) && g6.a.d(this.K, qVar.K) && n6.l.k(this.L, qVar.L) && this.M == qVar.M)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3921a, Long.valueOf(this.f3922b), Integer.valueOf(this.f3923c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f3924f), Long.valueOf(this.h), Long.valueOf(this.f3925n), Double.valueOf(this.f3926r), Boolean.valueOf(this.f3927s), Integer.valueOf(Arrays.hashCode(this.f3928w)), Integer.valueOf(this.f3929x), Integer.valueOf(this.f3930y), String.valueOf(this.E), Integer.valueOf(this.F), this.G, Boolean.valueOf(this.H), this.I, this.J, this.K, this.L});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.E;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.D = jSONObject;
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.f3921a, i10);
        long j10 = this.f3922b;
        h0.s(parcel, 3, 8);
        parcel.writeLong(j10);
        int i11 = this.f3923c;
        h0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        double d = this.d;
        h0.s(parcel, 5, 8);
        parcel.writeDouble(d);
        int i12 = this.e;
        h0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        int i13 = this.f3924f;
        h0.s(parcel, 7, 4);
        parcel.writeInt(i13);
        long j11 = this.h;
        h0.s(parcel, 8, 8);
        parcel.writeLong(j11);
        long j12 = this.f3925n;
        h0.s(parcel, 9, 8);
        parcel.writeLong(j12);
        double d10 = this.f3926r;
        h0.s(parcel, 10, 8);
        parcel.writeDouble(d10);
        boolean z10 = this.f3927s;
        h0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        h0.j(parcel, 12, this.f3928w);
        int i14 = this.f3929x;
        h0.s(parcel, 13, 4);
        parcel.writeInt(i14);
        int i15 = this.f3930y;
        h0.s(parcel, 14, 4);
        parcel.writeInt(i15);
        h0.l(parcel, 15, this.D);
        int i16 = this.F;
        h0.s(parcel, 16, 4);
        parcel.writeInt(i16);
        h0.p(parcel, 17, this.G);
        boolean z11 = this.H;
        h0.s(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        h0.k(parcel, 19, this.I, i10);
        h0.k(parcel, 20, this.J, i10);
        h0.k(parcel, 21, this.K, i10);
        h0.k(parcel, 22, this.L, i10);
        h0.r(parcel, q6);
    }
}
