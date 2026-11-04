package e6;

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
public final class q extends q6.a {
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
    public MediaInfo f9752a;
    public long f9753b;
    public int f9754c;
    public double d;
    public int f9755e;
    public int f9756f;
    public long h;
    public long f9757n;
    public double f9758r;
    public boolean f9759s;
    public long[] f9760w;
    public int f9761x;
    public int f9762y;
    public final ArrayList H = new ArrayList();
    public final SparseArray O = new SparseArray();

    static {
        p6.m.f("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j10, int i3, double d, int i10, int i11, long j11, long j12, double d10, boolean z10, long[] jArr, int i12, int i13, String str, int i14, ArrayList arrayList, boolean z11, c cVar, u uVar, j jVar, n nVar) {
        this.f9752a = mediaInfo;
        this.f9753b = j10;
        this.f9754c = i3;
        this.d = d;
        this.f9755e = i10;
        this.f9756f = i11;
        this.h = j11;
        this.f9757n = j12;
        this.f9758r = d10;
        this.f9759s = z10;
        this.f9760w = jArr;
        this.f9761x = i12;
        this.f9762y = i13;
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
        if (nVar != null && nVar.f9743s) {
            z12 = true;
        }
        this.N = z12;
    }

    public final int b(org.json.JSONObject r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: e6.q.b(org.json.JSONObject, int):int");
    }

    public final void c(List list) {
        ArrayList arrayList = this.H;
        arrayList.clear();
        SparseArray sparseArray = this.O;
        sparseArray.clear();
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                o oVar = (o) list.get(i3);
                arrayList.add(oVar);
                sparseArray.put(oVar.f9745b, Integer.valueOf(i3));
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
                if (z10 == z11 && this.f9753b == qVar.f9753b && this.f9754c == qVar.f9754c && this.d == qVar.d && this.f9755e == qVar.f9755e && this.f9756f == qVar.f9756f && this.h == qVar.h && this.f9758r == qVar.f9758r && this.f9759s == qVar.f9759s && this.f9761x == qVar.f9761x && this.f9762y == qVar.f9762y && this.G == qVar.G && Arrays.equals(this.f9760w, qVar.f9760w) && i6.a.d(Long.valueOf(this.f9757n), Long.valueOf(qVar.f9757n)) && i6.a.d(this.H, qVar.H) && i6.a.d(this.f9752a, qVar.f9752a) && (((jSONObject = this.F) == null || (jSONObject2 = qVar.F) == null || w6.c.a(jSONObject, jSONObject2)) && this.I == qVar.I && i6.a.d(this.J, qVar.J) && i6.a.d(this.K, qVar.K) && i6.a.d(this.L, qVar.L) && p6.m.k(this.M, qVar.M) && this.N == qVar.N)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9752a, Long.valueOf(this.f9753b), Integer.valueOf(this.f9754c), Double.valueOf(this.d), Integer.valueOf(this.f9755e), Integer.valueOf(this.f9756f), Long.valueOf(this.h), Long.valueOf(this.f9757n), Double.valueOf(this.f9758r), Boolean.valueOf(this.f9759s), Integer.valueOf(Arrays.hashCode(this.f9760w)), Integer.valueOf(this.f9761x), Integer.valueOf(this.f9762y), String.valueOf(this.F), Integer.valueOf(this.G), this.H, Boolean.valueOf(this.I), this.J, this.K, this.L, this.M});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        String jSONObject;
        JSONObject jSONObject2 = this.F;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.E = jSONObject;
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.f9752a, i3);
        long j10 = this.f9753b;
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(j10);
        int i10 = this.f9754c;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i10);
        double d = this.d;
        j8.a.r(parcel, 5, 8);
        parcel.writeDouble(d);
        int i11 = this.f9755e;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(i11);
        int i12 = this.f9756f;
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(i12);
        long j11 = this.h;
        j8.a.r(parcel, 8, 8);
        parcel.writeLong(j11);
        long j12 = this.f9757n;
        j8.a.r(parcel, 9, 8);
        parcel.writeLong(j12);
        double d10 = this.f9758r;
        j8.a.r(parcel, 10, 8);
        parcel.writeDouble(d10);
        boolean z10 = this.f9759s;
        j8.a.r(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j8.a.k(parcel, 12, this.f9760w);
        int i13 = this.f9761x;
        j8.a.r(parcel, 13, 4);
        parcel.writeInt(i13);
        int i14 = this.f9762y;
        j8.a.r(parcel, 14, 4);
        parcel.writeInt(i14);
        j8.a.m(parcel, 15, this.E);
        int i15 = this.G;
        j8.a.r(parcel, 16, 4);
        parcel.writeInt(i15);
        j8.a.q(parcel, 17, this.H);
        boolean z11 = this.I;
        j8.a.r(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        j8.a.l(parcel, 19, this.J, i3);
        j8.a.l(parcel, 20, this.K, i3);
        j8.a.l(parcel, 21, this.L, i3);
        j8.a.l(parcel, 22, this.M, i3);
        j8.a.t(parcel, s6);
    }
}
