package defpackage;

import android.content.SharedPreferences;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
public final class qd4 {
    public byte[] A;
    public final boolean B;
    public int C;
    public boolean D;
    public boolean E;
    public String F;
    public long G;
    public int H;
    public RandomAccessFile I;
    public boolean J;
    public int K;
    public SharedPreferences L;
    public final int M;
    public int N;
    public long O;
    public boolean P;
    public long S;
    public volatile boolean T;
    public final int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public boolean i;
    public ArrayList j;
    public int k;
    public final String l;
    public byte m;
    public byte[] n;
    public yb4 o;
    public int r;
    public long s;
    public long t;
    public int u;
    public long v;
    public long w;
    public int x;
    public byte[] y;
    public byte[] z;
    public byte f = 4;
    public final int[] g = new int[8];
    public int h = 65536;
    public final SparseIntArray p = new SparseIntArray();
    public final ArrayList q = new ArrayList();
    public final SparseArray Q = new SparseArray();
    public final boolean[] R = {false, false};

    public qd4(int i, int i2, long j, String str, boolean z) {
        boolean z2;
        this.a = i;
        this.l = str;
        this.B = z;
        this.G = j;
        this.M = i2;
        if (j != 0 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.P = z2;
    }

    public final void a() {
        if (this.P) {
            boolean z = this.D;
            long j = this.t;
            int i = this.h;
            if (z) {
                long j2 = i;
                this.u = ((int) ((((j - j2) + j2) - 1) / j2)) + 1;
                return;
            }
            long j3 = i;
            this.u = ((int) ((((j - 1024) + j3) - 1) / j3)) + 1;
            return;
        }
        long j4 = this.t;
        long j5 = this.h;
        this.u = (int) (((j4 + j5) - 1) / j5);
    }

    public final void b() {
        SharedPreferences sharedPreferences = this.L;
        if (sharedPreferences == null) {
            sharedPreferences = a.b.getSharedPreferences("uploadinfo", 0);
            this.L = sharedPreferences;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        SharedPreferences.Editor remove = edit.remove(this.F + "_time");
        SharedPreferences.Editor remove2 = remove.remove(this.F + "_size");
        SharedPreferences.Editor remove3 = remove2.remove(this.F + "_uploaded");
        SharedPreferences.Editor remove4 = remove3.remove(this.F + "_id");
        SharedPreferences.Editor remove5 = remove4.remove(this.F + "_iv");
        SharedPreferences.Editor remove6 = remove5.remove(this.F + "_key");
        remove6.remove(this.F + "_ivc").commit();
        try {
            RandomAccessFile randomAccessFile = this.I;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.I = null;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        String str = this.l;
        if (str == null) {
            Set set = s70.a;
        } else {
            s70.a.remove(str);
        }
    }

    public final void c() {
        if (this.m != 0) {
            return;
        }
        this.m = (byte) 1;
        String str = this.l;
        if (str == null) {
            Set set = s70.a;
        } else {
            s70.a.add(str);
        }
        Utilities.d.c(new md4(this, (byte) 0));
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd4.d():void");
    }

    public final void e() {
        int i;
        while (this.m == 1 && (i = this.K) < this.e) {
            d();
            if (this.K == i) {
                return;
            }
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = this.L.edit();
        edit.putInt(b10.j(new StringBuilder(), this.F, "_time"), this.H);
        edit.putLong(b10.j(new StringBuilder(), this.F, "_size"), this.t);
        edit.putLong(b10.j(new StringBuilder(), this.F, "_id"), this.s);
        edit.remove(this.F + "_uploaded");
        if (this.B) {
            edit.putString(b10.j(new StringBuilder(), this.F, "_iv"), Utilities.f(this.z));
            edit.putString(b10.j(new StringBuilder(), this.F, "_ivc"), Utilities.f(this.A));
            edit.putString(b10.j(new StringBuilder(), this.F, "_key"), Utilities.f(this.y));
        }
        edit.commit();
    }
}
