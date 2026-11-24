package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class f07 extends b4 {
    public static final Parcelable.Creator<f07> CREATOR;
    public String E;
    public JSONObject F;
    public int G;
    public boolean I;
    public aa J;
    public edc K;
    public et6 L;
    public zt6 M;
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
        ite.g("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new jid((byte) 16);
    }

    public f07(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, ArrayList arrayList, boolean z2, aa aaVar, edc edcVar, et6 et6Var, zt6 zt6Var) {
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
        this.K = edcVar;
        this.L = et6Var;
        this.M = zt6Var;
        boolean z3 = false;
        if (zt6Var != null && zt6Var.s) {
            z3 = true;
        }
        this.N = z3;
    }

    public final int b(org.json.JSONObject r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f07.b(org.json.JSONObject, int):int");
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = this.H;
        arrayList2.clear();
        SparseArray sparseArray = this.O;
        sparseArray.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            au6 au6Var = (au6) arrayList.get(i);
            arrayList2.add(au6Var);
            sparseArray.put(au6Var.b, Integer.valueOf(i));
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof f07) {
                f07 f07Var = (f07) obj;
                if (this.F != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (f07Var.F != null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z != z2 || this.b != f07Var.b || this.c != f07Var.c || this.d != f07Var.d || this.e != f07Var.e || this.f != f07Var.f || this.h != f07Var.h || this.r != f07Var.r || this.s != f07Var.s || this.x != f07Var.x || this.y != f07Var.y || this.G != f07Var.G || !Arrays.equals(this.w, f07Var.w) || !qe1.d(Long.valueOf(this.n), Long.valueOf(f07Var.n)) || !qe1.d(this.H, f07Var.H) || !qe1.d(this.a, f07Var.a) || (((jSONObject = this.F) != null && (jSONObject2 = f07Var.F) != null && !vw5.a(jSONObject, jSONObject2)) || this.I != f07Var.I || !qe1.d(this.J, f07Var.J) || !qe1.d(this.K, f07Var.K) || !qe1.d(this.L, f07Var.L) || !fse.a(this.M, f07Var.M) || this.N != f07Var.N)) {
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
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        long j = this.b;
        mve.q(parcel, 3, 8);
        parcel.writeLong(j);
        int i2 = this.c;
        mve.q(parcel, 4, 4);
        parcel.writeInt(i2);
        double d = this.d;
        mve.q(parcel, 5, 8);
        parcel.writeDouble(d);
        int i3 = this.e;
        mve.q(parcel, 6, 4);
        parcel.writeInt(i3);
        int i4 = this.f;
        mve.q(parcel, 7, 4);
        parcel.writeInt(i4);
        long j2 = this.h;
        mve.q(parcel, 8, 8);
        parcel.writeLong(j2);
        long j3 = this.n;
        mve.q(parcel, 9, 8);
        parcel.writeLong(j3);
        double d2 = this.r;
        mve.q(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z = this.s;
        mve.q(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        mve.j(parcel, 12, this.w);
        int i5 = this.x;
        mve.q(parcel, 13, 4);
        parcel.writeInt(i5);
        int i6 = this.y;
        mve.q(parcel, 14, 4);
        parcel.writeInt(i6);
        mve.l(parcel, 15, this.E);
        int i7 = this.G;
        mve.q(parcel, 16, 4);
        parcel.writeInt(i7);
        mve.p(parcel, 17, this.H);
        boolean z2 = this.I;
        mve.q(parcel, 18, 4);
        parcel.writeInt(z2 ? 1 : 0);
        mve.k(parcel, 19, this.J, i);
        mve.k(parcel, 20, this.K, i);
        mve.k(parcel, 21, this.L, i);
        mve.k(parcel, 22, this.M, i);
        mve.s(parcel, r);
    }
}
