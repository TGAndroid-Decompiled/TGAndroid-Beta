package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class fy6 extends b4 {
    public static final Parcelable.Creator<fy6> CREATOR;
    public String E;
    public JSONObject F;
    public int G;
    public boolean I;
    public aa J;
    public bbc K;
    public er6 L;
    public yr6 M;
    public boolean N;
    public MediaInfo a;
    public long b;
    public int c;
    public double d;
    public int e;
    public int f;
    public long h;
    public long n;
    public double r;
    public boolean s;
    public long[] w;
    public int x;
    public int y;
    public final ArrayList H = new ArrayList();
    public final SparseArray O = new SparseArray();

    static {
        fre.g("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new igd((byte) 16);
    }

    public fy6(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, ArrayList arrayList, boolean z2, aa aaVar, bbc bbcVar, er6 er6Var, yr6 yr6Var) {
        this.a = mediaInfo;
        this.b = j;
        this.c = i;
        this.d = d;
        this.e = i2;
        this.f = i3;
        this.h = j2;
        this.n = j3;
        this.r = d2;
        this.s = z;
        this.w = jArr;
        this.x = i4;
        this.y = i5;
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
        this.G = i6;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.I = z2;
        this.J = aaVar;
        this.K = bbcVar;
        this.L = er6Var;
        this.M = yr6Var;
        boolean z3 = false;
        if (yr6Var != null && yr6Var.s) {
            z3 = true;
        }
        this.N = z3;
    }

    public final int b(org.json.JSONObject r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy6.b(org.json.JSONObject, int):int");
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = this.H;
        arrayList2.clear();
        SparseArray sparseArray = this.O;
        sparseArray.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            zr6 zr6Var = (zr6) arrayList.get(i);
            arrayList2.add(zr6Var);
            sparseArray.put(zr6Var.b, Integer.valueOf(i));
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof fy6) {
                fy6 fy6Var = (fy6) obj;
                if (this.F != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (fy6Var.F != null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z != z2 || this.b != fy6Var.b || this.c != fy6Var.c || this.d != fy6Var.d || this.e != fy6Var.e || this.f != fy6Var.f || this.h != fy6Var.h || this.r != fy6Var.r || this.s != fy6Var.s || this.x != fy6Var.x || this.y != fy6Var.y || this.G != fy6Var.G || !Arrays.equals(this.w, fy6Var.w) || !id1.d(Long.valueOf(this.n), Long.valueOf(fy6Var.n)) || !id1.d(this.H, fy6Var.H) || !id1.d(this.a, fy6Var.a) || (((jSONObject = this.F) != null && (jSONObject2 = fy6Var.F) != null && !vu5.a(jSONObject, jSONObject2)) || this.I != fy6Var.I || !id1.d(this.J, fy6Var.J) || !id1.d(this.K, fy6Var.K) || !id1.d(this.L, fy6Var.L) || !cqe.a(this.M, fy6Var.M) || this.N != fy6Var.N)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.h), Long.valueOf(this.n), Double.valueOf(this.r), Boolean.valueOf(this.s), Integer.valueOf(Arrays.hashCode(this.w)), Integer.valueOf(this.x), Integer.valueOf(this.y), String.valueOf(this.F), Integer.valueOf(this.G), this.H, Boolean.valueOf(this.I), this.J, this.K, this.L, this.M});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.F;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.E = jSONObject;
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        long j = this.b;
        jte.q(parcel, 3, 8);
        parcel.writeLong(j);
        int i2 = this.c;
        jte.q(parcel, 4, 4);
        parcel.writeInt(i2);
        double d = this.d;
        jte.q(parcel, 5, 8);
        parcel.writeDouble(d);
        int i3 = this.e;
        jte.q(parcel, 6, 4);
        parcel.writeInt(i3);
        int i4 = this.f;
        jte.q(parcel, 7, 4);
        parcel.writeInt(i4);
        long j2 = this.h;
        jte.q(parcel, 8, 8);
        parcel.writeLong(j2);
        long j3 = this.n;
        jte.q(parcel, 9, 8);
        parcel.writeLong(j3);
        double d2 = this.r;
        jte.q(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z = this.s;
        jte.q(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        jte.j(parcel, 12, this.w);
        int i5 = this.x;
        jte.q(parcel, 13, 4);
        parcel.writeInt(i5);
        int i6 = this.y;
        jte.q(parcel, 14, 4);
        parcel.writeInt(i6);
        jte.l(parcel, 15, this.E);
        int i7 = this.G;
        jte.q(parcel, 16, 4);
        parcel.writeInt(i7);
        jte.p(parcel, 17, this.H);
        boolean z2 = this.I;
        jte.q(parcel, 18, 4);
        parcel.writeInt(z2 ? 1 : 0);
        jte.k(parcel, 19, this.J, i);
        jte.k(parcel, 20, this.K, i);
        jte.k(parcel, 21, this.L, i);
        jte.k(parcel, 22, this.M, i);
        jte.s(parcel, r);
    }
}
