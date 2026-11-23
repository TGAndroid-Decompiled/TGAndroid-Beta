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
    public static final int f7803w;
    public static final int[] f7804x;
    public static final int[] f7805y;
    public static final int[] f7806z;
    public final ArrayList f7807a = new ArrayList();
    public final SpannableStringBuilder f7808b = new SpannableStringBuilder();
    public boolean f7809c;
    public boolean d;
    public int f7810e;
    public boolean f7811f;
    public int f7812g;
    public int h;
    public int f7813i;
    public int f7814j;
    public int f7815k;
    public int f7816l;
    public int f7817m;
    public int f7818n;
    public int f7819o;
    public int f7820p;
    public int f7821q;
    public int f7822r;
    public int f7823s;
    public int f7824t;
    public int f7825u;

    static {
        int c10 = c(0, 0, 0, 0);
        f7803w = c10;
        int c11 = c(0, 0, 0, 3);
        f7804x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f7805y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f7806z = new int[]{3, 3, 3, 3, 3, 3, 1};
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
        SpannableStringBuilder spannableStringBuilder = this.f7808b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f7807a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f7819o != -1) {
                this.f7819o = 0;
            }
            if (this.f7820p != -1) {
                this.f7820p = 0;
            }
            if (this.f7821q != -1) {
                this.f7821q = 0;
            }
            if (this.f7823s != -1) {
                this.f7823s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f7814j && arrayList.size() < 15) {
                    this.f7825u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7808b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f7819o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7819o, length, 33);
            }
            if (this.f7820p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7820p, length, 33);
            }
            if (this.f7821q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7822r), this.f7821q, length, 33);
            }
            if (this.f7823s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7824t), this.f7823s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f7807a.clear();
        this.f7808b.clear();
        this.f7819o = -1;
        this.f7820p = -1;
        this.f7821q = -1;
        this.f7823s = -1;
        this.f7825u = 0;
        this.f7809c = false;
        this.d = false;
        this.f7810e = 4;
        this.f7811f = false;
        this.f7812g = 0;
        this.h = 0;
        this.f7813i = 0;
        this.f7814j = 15;
        this.f7815k = 0;
        this.f7816l = 0;
        this.f7817m = 0;
        int i7 = f7803w;
        this.f7818n = i7;
        this.f7822r = v;
        this.f7824t = i7;
    }

    public final void e(boolean z10, boolean z11) {
        int i7 = this.f7819o;
        SpannableStringBuilder spannableStringBuilder = this.f7808b;
        if (i7 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7819o, spannableStringBuilder.length(), 33);
                this.f7819o = -1;
            }
        } else if (z10) {
            this.f7819o = spannableStringBuilder.length();
        }
        if (this.f7820p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7820p, spannableStringBuilder.length(), 33);
                this.f7820p = -1;
            }
        } else if (z11) {
            this.f7820p = spannableStringBuilder.length();
        }
    }

    public final void f(int i7, int i10) {
        int i11 = this.f7821q;
        SpannableStringBuilder spannableStringBuilder = this.f7808b;
        if (i11 != -1 && this.f7822r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7822r), this.f7821q, spannableStringBuilder.length(), 33);
        }
        if (i7 != v) {
            this.f7821q = spannableStringBuilder.length();
            this.f7822r = i7;
        }
        if (this.f7823s != -1 && this.f7824t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7824t), this.f7823s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f7803w) {
            this.f7823s = spannableStringBuilder.length();
            this.f7824t = i10;
        }
    }
}
