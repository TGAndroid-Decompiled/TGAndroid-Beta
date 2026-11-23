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
    public static final int f7804w;
    public static final int[] f7805x;
    public static final int[] f7806y;
    public static final int[] f7807z;
    public final ArrayList f7808a = new ArrayList();
    public final SpannableStringBuilder f7809b = new SpannableStringBuilder();
    public boolean f7810c;
    public boolean d;
    public int f7811e;
    public boolean f7812f;
    public int f7813g;
    public int h;
    public int f7814i;
    public int f7815j;
    public int f7816k;
    public int f7817l;
    public int f7818m;
    public int f7819n;
    public int f7820o;
    public int f7821p;
    public int f7822q;
    public int f7823r;
    public int f7824s;
    public int f7825t;
    public int f7826u;

    static {
        int c10 = c(0, 0, 0, 0);
        f7804w = c10;
        int c11 = c(0, 0, 0, 3);
        f7805x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f7806y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f7807z = new int[]{3, 3, 3, 3, 3, 3, 1};
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
        SpannableStringBuilder spannableStringBuilder = this.f7809b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f7808a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f7820o != -1) {
                this.f7820o = 0;
            }
            if (this.f7821p != -1) {
                this.f7821p = 0;
            }
            if (this.f7822q != -1) {
                this.f7822q = 0;
            }
            if (this.f7824s != -1) {
                this.f7824s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f7815j && arrayList.size() < 15) {
                    this.f7826u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7809b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f7820o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7820o, length, 33);
            }
            if (this.f7821p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7821p, length, 33);
            }
            if (this.f7822q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7823r), this.f7822q, length, 33);
            }
            if (this.f7824s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7825t), this.f7824s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f7808a.clear();
        this.f7809b.clear();
        this.f7820o = -1;
        this.f7821p = -1;
        this.f7822q = -1;
        this.f7824s = -1;
        this.f7826u = 0;
        this.f7810c = false;
        this.d = false;
        this.f7811e = 4;
        this.f7812f = false;
        this.f7813g = 0;
        this.h = 0;
        this.f7814i = 0;
        this.f7815j = 15;
        this.f7816k = 0;
        this.f7817l = 0;
        this.f7818m = 0;
        int i7 = f7804w;
        this.f7819n = i7;
        this.f7823r = v;
        this.f7825t = i7;
    }

    public final void e(boolean z10, boolean z11) {
        int i7 = this.f7820o;
        SpannableStringBuilder spannableStringBuilder = this.f7809b;
        if (i7 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7820o, spannableStringBuilder.length(), 33);
                this.f7820o = -1;
            }
        } else if (z10) {
            this.f7820o = spannableStringBuilder.length();
        }
        if (this.f7821p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7821p, spannableStringBuilder.length(), 33);
                this.f7821p = -1;
            }
        } else if (z11) {
            this.f7821p = spannableStringBuilder.length();
        }
    }

    public final void f(int i7, int i10) {
        int i11 = this.f7822q;
        SpannableStringBuilder spannableStringBuilder = this.f7809b;
        if (i11 != -1 && this.f7823r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7823r), this.f7822q, spannableStringBuilder.length(), 33);
        }
        if (i7 != v) {
            this.f7822q = spannableStringBuilder.length();
            this.f7823r = i7;
        }
        if (this.f7824s != -1 && this.f7825t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7825t), this.f7824s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f7804w) {
            this.f7824s = spannableStringBuilder.length();
            this.f7825t = i10;
        }
    }
}
