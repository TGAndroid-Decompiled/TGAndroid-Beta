package d4;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
public final class e {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int v = c(2, 2, 2, 0);
    public static final int f7529w;
    public static final int[] f7530x;
    public static final int[] f7531y;
    public static final int[] f7532z;
    public final ArrayList f7533a = new ArrayList();
    public final SpannableStringBuilder f7534b = new SpannableStringBuilder();
    public boolean f7535c;
    public boolean d;
    public int f7536e;
    public boolean f7537f;
    public int f7538g;
    public int h;
    public int f7539i;
    public int f7540j;
    public int f7541k;
    public int f7542l;
    public int f7543m;
    public int f7544n;
    public int f7545o;
    public int f7546p;
    public int f7547q;
    public int f7548r;
    public int f7549s;
    public int f7550t;
    public int f7551u;

    static {
        int c10 = c(0, 0, 0, 0);
        f7529w = c10;
        int c11 = c(0, 0, 0, 3);
        f7530x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f7531y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f7532z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{c10, c11, c10, c10, c11, c10, c10};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{c10, c10, c10, c10, c10, c11, c11};
    }

    public e() {
        d();
    }

    public static int c(int r4, int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: d4.e.c(int, int, int, int):int");
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f7534b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f7533a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f7545o != -1) {
                this.f7545o = 0;
            }
            if (this.f7546p != -1) {
                this.f7546p = 0;
            }
            if (this.f7547q != -1) {
                this.f7547q = 0;
            }
            if (this.f7549s != -1) {
                this.f7549s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f7540j && arrayList.size() < 15) {
                    this.f7551u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7534b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f7545o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7545o, length, 33);
            }
            if (this.f7546p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7546p, length, 33);
            }
            if (this.f7547q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7548r), this.f7547q, length, 33);
            }
            if (this.f7549s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7550t), this.f7549s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f7533a.clear();
        this.f7534b.clear();
        this.f7545o = -1;
        this.f7546p = -1;
        this.f7547q = -1;
        this.f7549s = -1;
        this.f7551u = 0;
        this.f7535c = false;
        this.d = false;
        this.f7536e = 4;
        this.f7537f = false;
        this.f7538g = 0;
        this.h = 0;
        this.f7539i = 0;
        this.f7540j = 15;
        this.f7541k = 0;
        this.f7542l = 0;
        this.f7543m = 0;
        int i7 = f7529w;
        this.f7544n = i7;
        this.f7548r = v;
        this.f7550t = i7;
    }

    public final void e(boolean z10, boolean z11) {
        int i7 = this.f7545o;
        SpannableStringBuilder spannableStringBuilder = this.f7534b;
        if (i7 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7545o, spannableStringBuilder.length(), 33);
                this.f7545o = -1;
            }
        } else if (z10) {
            this.f7545o = spannableStringBuilder.length();
        }
        if (this.f7546p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7546p, spannableStringBuilder.length(), 33);
                this.f7546p = -1;
            }
        } else if (z11) {
            this.f7546p = spannableStringBuilder.length();
        }
    }

    public final void f(int i7, int i10) {
        int i11 = this.f7547q;
        SpannableStringBuilder spannableStringBuilder = this.f7534b;
        if (i11 != -1 && this.f7548r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7548r), this.f7547q, spannableStringBuilder.length(), 33);
        }
        if (i7 != v) {
            this.f7547q = spannableStringBuilder.length();
            this.f7548r = i7;
        }
        if (this.f7549s != -1 && this.f7550t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7550t), this.f7549s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f7529w) {
            this.f7549s = spannableStringBuilder.length();
            this.f7550t = i10;
        }
    }
}
