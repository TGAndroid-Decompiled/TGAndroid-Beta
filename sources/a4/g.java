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
    public static final int f231w;
    public static final int[] f232x;
    public static final int[] f233y;
    public static final int[] f234z;
    public final ArrayList f235a = new ArrayList();
    public final SpannableStringBuilder f236b = new SpannableStringBuilder();
    public boolean f237c;
    public boolean d;
    public int e;
    public boolean f238f;
    public int f239g;
    public int h;
    public int f240i;
    public int f241j;
    public int f242k;
    public int f243l;
    public int f244m;
    public int f245n;
    public int f246o;
    public int f247p;
    public int f248q;
    public int f249r;
    public int f250s;
    public int f251t;
    public int f252u;

    static {
        int c10 = c(0, 0, 0, 0);
        f231w = c10;
        int c11 = c(0, 0, 0, 3);
        f232x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f233y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f234z = new int[]{3, 3, 3, 3, 3, 3, 1};
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
        SpannableStringBuilder spannableStringBuilder = this.f236b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f235a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f246o != -1) {
                this.f246o = 0;
            }
            if (this.f247p != -1) {
                this.f247p = 0;
            }
            if (this.f248q != -1) {
                this.f248q = 0;
            }
            if (this.f250s != -1) {
                this.f250s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f241j && arrayList.size() < 15) {
                    this.f252u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f236b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f246o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f246o, length, 33);
            }
            if (this.f247p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f247p, length, 33);
            }
            if (this.f248q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f249r), this.f248q, length, 33);
            }
            if (this.f250s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f251t), this.f250s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f235a.clear();
        this.f236b.clear();
        this.f246o = -1;
        this.f247p = -1;
        this.f248q = -1;
        this.f250s = -1;
        this.f252u = 0;
        this.f237c = false;
        this.d = false;
        this.e = 4;
        this.f238f = false;
        this.f239g = 0;
        this.h = 0;
        this.f240i = 0;
        this.f241j = 15;
        this.f242k = 0;
        this.f243l = 0;
        this.f244m = 0;
        int i10 = f231w;
        this.f245n = i10;
        this.f249r = v;
        this.f251t = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f246o;
        SpannableStringBuilder spannableStringBuilder = this.f236b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f246o, spannableStringBuilder.length(), 33);
                this.f246o = -1;
            }
        } else if (z10) {
            this.f246o = spannableStringBuilder.length();
        }
        if (this.f247p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f247p, spannableStringBuilder.length(), 33);
                this.f247p = -1;
            }
        } else if (z11) {
            this.f247p = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f248q;
        SpannableStringBuilder spannableStringBuilder = this.f236b;
        if (i12 != -1 && this.f249r != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f249r), this.f248q, spannableStringBuilder.length(), 33);
        }
        if (i10 != v) {
            this.f248q = spannableStringBuilder.length();
            this.f249r = i10;
        }
        if (this.f250s != -1 && this.f251t != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f251t), this.f250s, spannableStringBuilder.length(), 33);
        }
        if (i11 != f231w) {
            this.f250s = spannableStringBuilder.length();
            this.f251t = i11;
        }
    }
}
