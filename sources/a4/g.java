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
    public static final int f233w;
    public static final int[] f234x;
    public static final int[] f235y;
    public static final int[] f236z;
    public final ArrayList f237a = new ArrayList();
    public final SpannableStringBuilder f238b = new SpannableStringBuilder();
    public boolean f239c;
    public boolean d;
    public int e;
    public boolean f240f;
    public int f241g;
    public int h;
    public int f242i;
    public int f243j;
    public int f244k;
    public int f245l;
    public int f246m;
    public int f247n;
    public int f248o;
    public int f249p;
    public int f250q;
    public int f251r;
    public int f252s;
    public int f253t;
    public int f254u;

    static {
        int c10 = c(0, 0, 0, 0);
        f233w = c10;
        int c11 = c(0, 0, 0, 3);
        f234x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f235y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f236z = new int[]{3, 3, 3, 3, 3, 3, 1};
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
        SpannableStringBuilder spannableStringBuilder = this.f238b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f237a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f248o != -1) {
                this.f248o = 0;
            }
            if (this.f249p != -1) {
                this.f249p = 0;
            }
            if (this.f250q != -1) {
                this.f250q = 0;
            }
            if (this.f252s != -1) {
                this.f252s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f243j && arrayList.size() < 15) {
                    this.f254u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f238b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f248o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f248o, length, 33);
            }
            if (this.f249p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f249p, length, 33);
            }
            if (this.f250q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f251r), this.f250q, length, 33);
            }
            if (this.f252s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f253t), this.f252s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f237a.clear();
        this.f238b.clear();
        this.f248o = -1;
        this.f249p = -1;
        this.f250q = -1;
        this.f252s = -1;
        this.f254u = 0;
        this.f239c = false;
        this.d = false;
        this.e = 4;
        this.f240f = false;
        this.f241g = 0;
        this.h = 0;
        this.f242i = 0;
        this.f243j = 15;
        this.f244k = 0;
        this.f245l = 0;
        this.f246m = 0;
        int i10 = f233w;
        this.f247n = i10;
        this.f251r = v;
        this.f253t = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f248o;
        SpannableStringBuilder spannableStringBuilder = this.f238b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f248o, spannableStringBuilder.length(), 33);
                this.f248o = -1;
            }
        } else if (z10) {
            this.f248o = spannableStringBuilder.length();
        }
        if (this.f249p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f249p, spannableStringBuilder.length(), 33);
                this.f249p = -1;
            }
        } else if (z11) {
            this.f249p = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f250q;
        SpannableStringBuilder spannableStringBuilder = this.f238b;
        if (i12 != -1 && this.f251r != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f251r), this.f250q, spannableStringBuilder.length(), 33);
        }
        if (i10 != v) {
            this.f250q = spannableStringBuilder.length();
            this.f251r = i10;
        }
        if (this.f252s != -1 && this.f253t != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f253t), this.f252s, spannableStringBuilder.length(), 33);
        }
        if (i11 != f233w) {
            this.f252s = spannableStringBuilder.length();
            this.f253t = i11;
        }
    }
}
