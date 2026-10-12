package a4;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
public final class f {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int v = c(2, 2, 2, 0);
    public static final int f237w;
    public static final int[] f238x;
    public static final int[] f239y;
    public static final int[] f240z;
    public final ArrayList f241a = new ArrayList();
    public final SpannableStringBuilder f242b = new SpannableStringBuilder();
    public boolean f243c;
    public boolean d;
    public int e;
    public boolean f244f;
    public int f245g;
    public int h;
    public int f246i;
    public int f247j;
    public int f248k;
    public int f249l;
    public int f250m;
    public int f251n;
    public int f252o;
    public int f253p;
    public int f254q;
    public int f255r;
    public int f256s;
    public int f257t;
    public int f258u;

    static {
        int c10 = c(0, 0, 0, 0);
        f237w = c10;
        int c11 = c(0, 0, 0, 3);
        f238x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f239y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f240z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{c10, c11, c10, c10, c11, c10, c10};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{c10, c10, c10, c10, c10, c11, c11};
    }

    public f() {
        d();
    }

    public static int c(int r4, int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: a4.f.c(int, int, int, int):int");
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f242b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f241a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f252o != -1) {
                this.f252o = 0;
            }
            if (this.f253p != -1) {
                this.f253p = 0;
            }
            if (this.f254q != -1) {
                this.f254q = 0;
            }
            if (this.f256s != -1) {
                this.f256s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f247j && arrayList.size() < 15) {
                    this.f258u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f242b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f252o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f252o, length, 33);
            }
            if (this.f253p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f253p, length, 33);
            }
            if (this.f254q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f255r), this.f254q, length, 33);
            }
            if (this.f256s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f257t), this.f256s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f241a.clear();
        this.f242b.clear();
        this.f252o = -1;
        this.f253p = -1;
        this.f254q = -1;
        this.f256s = -1;
        this.f258u = 0;
        this.f243c = false;
        this.d = false;
        this.e = 4;
        this.f244f = false;
        this.f245g = 0;
        this.h = 0;
        this.f246i = 0;
        this.f247j = 15;
        this.f248k = 0;
        this.f249l = 0;
        this.f250m = 0;
        int i10 = f237w;
        this.f251n = i10;
        this.f255r = v;
        this.f257t = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f252o;
        SpannableStringBuilder spannableStringBuilder = this.f242b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f252o, spannableStringBuilder.length(), 33);
                this.f252o = -1;
            }
        } else if (z10) {
            this.f252o = spannableStringBuilder.length();
        }
        if (this.f253p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f253p, spannableStringBuilder.length(), 33);
                this.f253p = -1;
            }
        } else if (z11) {
            this.f253p = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f254q;
        SpannableStringBuilder spannableStringBuilder = this.f242b;
        if (i12 != -1 && this.f255r != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f255r), this.f254q, spannableStringBuilder.length(), 33);
        }
        if (i10 != v) {
            this.f254q = spannableStringBuilder.length();
            this.f255r = i10;
        }
        if (this.f256s != -1 && this.f257t != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f257t), this.f256s, spannableStringBuilder.length(), 33);
        }
        if (i11 != f237w) {
            this.f256s = spannableStringBuilder.length();
            this.f257t = i11;
        }
    }
}
