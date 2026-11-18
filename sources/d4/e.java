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
    public static final int f7812w;
    public static final int[] f7813x;
    public static final int[] f7814y;
    public static final int[] f7815z;
    public final ArrayList f7816a = new ArrayList();
    public final SpannableStringBuilder f7817b = new SpannableStringBuilder();
    public boolean f7818c;
    public boolean d;
    public int f7819e;
    public boolean f7820f;
    public int f7821g;
    public int h;
    public int f7822i;
    public int f7823j;
    public int f7824k;
    public int f7825l;
    public int f7826m;
    public int f7827n;
    public int f7828o;
    public int f7829p;
    public int f7830q;
    public int f7831r;
    public int f7832s;
    public int f7833t;
    public int f7834u;

    static {
        int c10 = c(0, 0, 0, 0);
        f7812w = c10;
        int c11 = c(0, 0, 0, 3);
        f7813x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f7814y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f7815z = new int[]{3, 3, 3, 3, 3, 3, 1};
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
        SpannableStringBuilder spannableStringBuilder = this.f7817b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f7816a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f7828o != -1) {
                this.f7828o = 0;
            }
            if (this.f7829p != -1) {
                this.f7829p = 0;
            }
            if (this.f7830q != -1) {
                this.f7830q = 0;
            }
            if (this.f7832s != -1) {
                this.f7832s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f7823j && arrayList.size() < 15) {
                    this.f7834u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7817b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f7828o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7828o, length, 33);
            }
            if (this.f7829p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7829p, length, 33);
            }
            if (this.f7830q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7831r), this.f7830q, length, 33);
            }
            if (this.f7832s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7833t), this.f7832s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f7816a.clear();
        this.f7817b.clear();
        this.f7828o = -1;
        this.f7829p = -1;
        this.f7830q = -1;
        this.f7832s = -1;
        this.f7834u = 0;
        this.f7818c = false;
        this.d = false;
        this.f7819e = 4;
        this.f7820f = false;
        this.f7821g = 0;
        this.h = 0;
        this.f7822i = 0;
        this.f7823j = 15;
        this.f7824k = 0;
        this.f7825l = 0;
        this.f7826m = 0;
        int i7 = f7812w;
        this.f7827n = i7;
        this.f7831r = v;
        this.f7833t = i7;
    }

    public final void e(boolean z10, boolean z11) {
        int i7 = this.f7828o;
        SpannableStringBuilder spannableStringBuilder = this.f7817b;
        if (i7 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7828o, spannableStringBuilder.length(), 33);
                this.f7828o = -1;
            }
        } else if (z10) {
            this.f7828o = spannableStringBuilder.length();
        }
        if (this.f7829p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7829p, spannableStringBuilder.length(), 33);
                this.f7829p = -1;
            }
        } else if (z11) {
            this.f7829p = spannableStringBuilder.length();
        }
    }

    public final void f(int i7, int i10) {
        int i11 = this.f7830q;
        SpannableStringBuilder spannableStringBuilder = this.f7817b;
        if (i11 != -1 && this.f7831r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7831r), this.f7830q, spannableStringBuilder.length(), 33);
        }
        if (i7 != v) {
            this.f7830q = spannableStringBuilder.length();
            this.f7831r = i7;
        }
        if (this.f7832s != -1 && this.f7833t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7833t), this.f7832s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f7812w) {
            this.f7832s = spannableStringBuilder.length();
            this.f7833t = i10;
        }
    }
}
