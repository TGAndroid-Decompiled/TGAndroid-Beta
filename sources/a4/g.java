package a4;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
public final class g {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int v = c(2, 2, 2, 0);
    public static final int f238w;
    public static final int[] f239x;
    public static final int[] f240y;
    public static final int[] f241z;
    public final ArrayList f242a = new ArrayList();
    public final SpannableStringBuilder f243b = new SpannableStringBuilder();
    public boolean f244c;
    public boolean d;
    public int f245e;
    public boolean f246f;
    public int f247g;
    public int h;
    public int f248i;
    public int f249j;
    public int f250k;
    public int f251l;
    public int f252m;
    public int f253n;
    public int f254o;
    public int f255p;
    public int f256q;
    public int f257r;
    public int f258s;
    public int f259t;
    public int f260u;

    static {
        int c10 = c(0, 0, 0, 0);
        f238w = c10;
        int c11 = c(0, 0, 0, 3);
        f239x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f240y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f241z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{c10, c11, c10, c10, c11, c10, c10};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{c10, c10, c10, c10, c10, c11, c11};
    }

    public g() {
        d();
    }

    public static int c(int r4, int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: a4.g.c(int, int, int, int):int");
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f243b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f242a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f254o != -1) {
                this.f254o = 0;
            }
            if (this.f255p != -1) {
                this.f255p = 0;
            }
            if (this.f256q != -1) {
                this.f256q = 0;
            }
            if (this.f258s != -1) {
                this.f258s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f249j && arrayList.size() < 15) {
                    this.f260u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f243b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f254o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f254o, length, 33);
            }
            if (this.f255p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f255p, length, 33);
            }
            if (this.f256q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f257r), this.f256q, length, 33);
            }
            if (this.f258s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f259t), this.f258s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f242a.clear();
        this.f243b.clear();
        this.f254o = -1;
        this.f255p = -1;
        this.f256q = -1;
        this.f258s = -1;
        this.f260u = 0;
        this.f244c = false;
        this.d = false;
        this.f245e = 4;
        this.f246f = false;
        this.f247g = 0;
        this.h = 0;
        this.f248i = 0;
        this.f249j = 15;
        this.f250k = 0;
        this.f251l = 0;
        this.f252m = 0;
        int i10 = f238w;
        this.f253n = i10;
        this.f257r = v;
        this.f259t = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f254o;
        SpannableStringBuilder spannableStringBuilder = this.f243b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f254o, spannableStringBuilder.length(), 33);
                this.f254o = -1;
            }
        } else if (z10) {
            this.f254o = spannableStringBuilder.length();
        }
        if (this.f255p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f255p, spannableStringBuilder.length(), 33);
                this.f255p = -1;
            }
        } else if (z11) {
            this.f255p = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f256q;
        SpannableStringBuilder spannableStringBuilder = this.f243b;
        if (i12 != -1 && this.f257r != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f257r), this.f256q, spannableStringBuilder.length(), 33);
        }
        if (i10 != v) {
            this.f256q = spannableStringBuilder.length();
            this.f257r = i10;
        }
        if (this.f258s != -1 && this.f259t != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f259t), this.f258s, spannableStringBuilder.length(), 33);
        }
        if (i11 != f238w) {
            this.f258s = spannableStringBuilder.length();
            this.f259t = i11;
        }
    }
}
