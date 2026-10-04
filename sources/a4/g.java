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
    public static final int f252w;
    public static final int[] f253x;
    public static final int[] f254y;
    public static final int[] f255z;
    public final ArrayList f256a = new ArrayList();
    public final SpannableStringBuilder f257b = new SpannableStringBuilder();
    public boolean f258c;
    public boolean d;
    public int f259e;
    public boolean f260f;
    public int f261g;
    public int h;
    public int f262i;
    public int f263j;
    public int f264k;
    public int f265l;
    public int f266m;
    public int f267n;
    public int f268o;
    public int f269p;
    public int f270q;
    public int f271r;
    public int f272s;
    public int f273t;
    public int f274u;

    static {
        int c10 = c(0, 0, 0, 0);
        f252w = c10;
        int c11 = c(0, 0, 0, 3);
        f253x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f254y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f255z = new int[]{3, 3, 3, 3, 3, 3, 1};
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
        SpannableStringBuilder spannableStringBuilder = this.f257b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f256a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f268o != -1) {
                this.f268o = 0;
            }
            if (this.f269p != -1) {
                this.f269p = 0;
            }
            if (this.f270q != -1) {
                this.f270q = 0;
            }
            if (this.f272s != -1) {
                this.f272s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f263j && arrayList.size() < 15) {
                    this.f274u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f257b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f268o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f268o, length, 33);
            }
            if (this.f269p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f269p, length, 33);
            }
            if (this.f270q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f271r), this.f270q, length, 33);
            }
            if (this.f272s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f273t), this.f272s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f256a.clear();
        this.f257b.clear();
        this.f268o = -1;
        this.f269p = -1;
        this.f270q = -1;
        this.f272s = -1;
        this.f274u = 0;
        this.f258c = false;
        this.d = false;
        this.f259e = 4;
        this.f260f = false;
        this.f261g = 0;
        this.h = 0;
        this.f262i = 0;
        this.f263j = 15;
        this.f264k = 0;
        this.f265l = 0;
        this.f266m = 0;
        int i10 = f252w;
        this.f267n = i10;
        this.f271r = v;
        this.f273t = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f268o;
        SpannableStringBuilder spannableStringBuilder = this.f257b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f268o, spannableStringBuilder.length(), 33);
                this.f268o = -1;
            }
        } else if (z10) {
            this.f268o = spannableStringBuilder.length();
        }
        if (this.f269p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f269p, spannableStringBuilder.length(), 33);
                this.f269p = -1;
            }
        } else if (z11) {
            this.f269p = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f270q;
        SpannableStringBuilder spannableStringBuilder = this.f257b;
        if (i12 != -1 && this.f271r != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f271r), this.f270q, spannableStringBuilder.length(), 33);
        }
        if (i10 != v) {
            this.f270q = spannableStringBuilder.length();
            this.f271r = i10;
        }
        if (this.f272s != -1 && this.f273t != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f273t), this.f272s, spannableStringBuilder.length(), 33);
        }
        if (i11 != f252w) {
            this.f272s = spannableStringBuilder.length();
            this.f273t = i11;
        }
    }
}
