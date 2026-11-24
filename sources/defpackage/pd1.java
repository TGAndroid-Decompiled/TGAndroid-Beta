package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
public final class pd1 {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int v = c(2, 2, 2, 0);
    public static final int w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;
    public final ArrayList a = new ArrayList();
    public final SpannableStringBuilder b = new SpannableStringBuilder();
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    static {
        int c = c(0, 0, 0, 0);
        w = c;
        int c2 = c(0, 0, 0, 3);
        x = new int[]{0, 0, 0, 0, 0, 2, 0};
        y = new int[]{0, 0, 0, 0, 0, 0, 2};
        z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{c, c2, c, c, c2, c, c};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{c, c, c, c, c, c2, c2};
    }

    public pd1() {
        d();
    }

    public static int c(int r4, int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd1.c(int, int, int, int):int");
    }

    public final void a(char c) {
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (c == '\n') {
            SpannableString b = b();
            ArrayList arrayList = this.a;
            arrayList.add(b);
            spannableStringBuilder.clear();
            if (this.o != -1) {
                this.o = 0;
            }
            if (this.p != -1) {
                this.p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.s != -1) {
                this.s = 0;
            }
            while (true) {
                if (arrayList.size() < this.j && arrayList.size() < 15) {
                    this.u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.o, length, 33);
            }
            if (this.p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, length, 33);
            }
            if (this.q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, length, 33);
            }
            if (this.s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.a.clear();
        this.b.clear();
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.s = -1;
        this.u = 0;
        this.c = false;
        this.d = false;
        this.e = 4;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 15;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        int i = w;
        this.n = i;
        this.r = v;
        this.t = i;
    }

    public final void e(boolean z2, boolean z3) {
        int i = this.o;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (i != -1) {
            if (!z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.o, spannableStringBuilder.length(), 33);
                this.o = -1;
            }
        } else if (z2) {
            this.o = spannableStringBuilder.length();
        }
        if (this.p != -1) {
            if (!z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, spannableStringBuilder.length(), 33);
                this.p = -1;
            }
        } else if (z3) {
            this.p = spannableStringBuilder.length();
        }
    }

    public final void f(int i, int i2) {
        int i3 = this.q;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (i3 != -1 && this.r != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, spannableStringBuilder.length(), 33);
        }
        if (i != v) {
            this.q = spannableStringBuilder.length();
            this.r = i;
        }
        if (this.s != -1 && this.t != i2) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, spannableStringBuilder.length(), 33);
        }
        if (i2 != w) {
            this.s = spannableStringBuilder.length();
            this.t = i2;
        }
    }
}
