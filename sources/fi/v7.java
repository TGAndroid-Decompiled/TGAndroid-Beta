package fi;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.ok0;
public final class v7 {
    public k80 f12656a;
    public org.telegram.ui.Components.x5 f12657b;
    public final n2.p0 f12658c;
    public org.telegram.ui.Components.t5 d;
    public StaticLayout f12659e;
    public org.telegram.ui.Components.t5 f12660f;
    public StaticLayout f12661g;
    public t7[] h;
    public final ArrayList f12662i;
    public final Stack f12663j;
    public final gf.c f12664k;
    public int f12665l;
    public int f12666m;
    public CharSequence f12667n;
    public s7 f12668o;
    public s7 f12669p;
    public boolean f12670q;
    public final org.telegram.ui.Components.c6 f12671r;
    public final n80 f12672s;
    public final Path f12673t;
    public final AtomicReference f12674u;
    public final w7 v;

    public v7(w7 w7Var) {
        this.v = w7Var;
        this.f12658c = new n2.p0(w7Var);
        ArrayList arrayList = new ArrayList();
        this.f12662i = arrayList;
        this.f12663j = new Stack();
        this.f12667n = "";
        this.f12671r = new org.telegram.ui.Components.c6(w7Var.K, 0L, 400L, kr.h);
        Path path = new Path();
        this.f12673t = path;
        this.f12674u = new AtomicReference();
        this.f12664k = new gf.c(w7Var, arrayList, new di.v6(this, 11));
        n80 n80Var = new n80();
        this.f12672s = n80Var;
        n80Var.f37730y = path;
        n80Var.k(4.0f);
        n80Var.g(org.telegram.ui.ActionBar.n6.r1(0.3f, -1), org.telegram.ui.ActionBar.n6.r1(0.1f, -1), org.telegram.ui.ActionBar.n6.r1(0.2f, -1), org.telegram.ui.ActionBar.n6.r1(0.7f, -1));
        n80Var.setCallback(w7Var);
    }

    public final int a(int i7) {
        int i10;
        s7 s7Var = this.f12668o;
        int i11 = 0;
        if (s7Var != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + s7Var.b();
        } else {
            i10 = 0;
        }
        s7 s7Var2 = this.f12669p;
        if (s7Var2 != null) {
            i11 = org.telegram.messenger.g0.L(8.0f) + s7Var2.b();
        }
        int i12 = i10 + i11;
        StaticLayout staticLayout = this.f12659e;
        w7 w7Var = this.v;
        if (staticLayout == null) {
            return i7 - ((w7Var.G * 2) + this.f12665l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!w7Var.f12708b) {
            return i7 - ((w7Var.G * 2) + this.f12665l);
        }
        return (i7 - ((Math.min(3, lineCount) + 1) * w7Var.f12709c.getFontMetricsInt(null))) - i12;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        w7 w7Var = this.v;
        x7 x7Var = w7Var.K;
        float d = this.f12671r.d(this.f12670q);
        if (f10 > 0.0f) {
            float T1 = org.telegram.messenger.g0.T1(f10, 0.7f * f10, d);
            if (T1 >= 1.0f) {
                c(canvas, d);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, x7Var.getWidth(), x7Var.getHeight(), (int) (T1 * 255.0f), 31);
                c(canvas2, d);
                canvas2.restore();
            }
            if (d <= 0.0f && !this.f12670q) {
                return;
            }
            n80 n80Var = this.f12672s;
            n80Var.setAlpha((int) (d * 255.0f * T1));
            n80Var.draw(canvas2);
            w7Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        w7 w7Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = w7Var.f12707a;
        x7 x7Var = w7Var.K;
        if (this.f12668o != null) {
            canvas.save();
            canvas.translate(w7Var.F, w7Var.G);
            s7 s7Var = this.f12668o;
            int width = w7Var.getWidth();
            int i11 = w7Var.F;
            s7Var.a(canvas, (width - i11) - i11);
            int b10 = this.f12668o.b();
            canvas.restore();
            i7 = org.telegram.messenger.g0.L(8.0f) + b10;
        } else {
            i7 = 0;
        }
        canvas.save();
        canvas.translate(w7Var.F, w7Var.G + i7);
        if (this.f12658c.h(canvas)) {
            w7Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12673t.rewind();
        ArrayList arrayList3 = this.f12662i;
        if (arrayList3.isEmpty() && this.f12661g != null) {
            if (x7Var.f12740a0.x()) {
                canvas.save();
                canvas.translate(w7Var.F, w7Var.G + i7);
                x7Var.f12740a0.W(canvas);
                canvas.restore();
            }
            if (this.f12661g != null) {
                canvas.save();
                canvas.translate(w7Var.F, w7Var.G + i7);
                d(this.f12661g, canvas, arrayList3);
                org.telegram.ui.Components.t5 update = org.telegram.ui.Components.x5.update(0, w7Var, this.f12660f, this.f12661g);
                this.f12660f = update;
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, this.f12661g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f12661g, w7Var.F, w7Var.G + i7);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    t7[] t7VarArr = this.h;
                    if (i12 >= t7VarArr.length) {
                        break;
                    }
                    t7 t7Var = t7VarArr[i12];
                    if (t7Var != null) {
                        canvas.save();
                        float f12 = t7Var.f12594c;
                        float f13 = t7Var.f12595e;
                        if (f12 == f13) {
                            if (w7Var.f12716x != f11) {
                                canvas.translate(w7Var.F + f13, w7Var.G + i7 + t7Var.f12596f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, t7Var.f12593b.getWidth(), t7Var.f12593b.getHeight(), (int) (w7Var.f12716x * 255.0f), 31);
                                d(t7Var.f12593b, canvas, arrayList);
                                if (z10) {
                                    f(t7Var.f12593b, w7Var.F + t7Var.f12595e, w7Var.G + i7 + t7Var.f12596f);
                                }
                                t7Var.f12593b.draw(canvas);
                                org.telegram.ui.Components.t5 update2 = org.telegram.ui.Components.x5.update(0, w7Var, t7Var.f12592a, t7Var.f12593b);
                                t7Var.f12592a = update2;
                                arrayList2 = arrayList;
                                i10 = i12;
                                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, t7Var.f12593b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, w7Var.f12716x, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i10 = i12;
                            float T1 = org.telegram.messenger.g0.T1(f12, f13, w7Var.f12716x);
                            float T12 = org.telegram.messenger.g0.T1(t7Var.d, t7Var.f12596f, kr.f36859g.getInterpolation(w7Var.f12716x));
                            canvas.translate(w7Var.F + T1, w7Var.G + i7 + T12);
                            if (z10) {
                                f(t7Var.f12593b, w7Var.F + T1, w7Var.G + i7 + T12);
                            }
                            t7Var.f12593b.draw(canvas);
                            org.telegram.ui.Components.t5 update3 = org.telegram.ui.Components.x5.update(0, w7Var, t7Var.f12592a, t7Var.f12593b);
                            t7Var.f12592a = update3;
                            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, t7Var.f12593b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        }
                        canvas.restore();
                        i12 = i10 + 1;
                        arrayList = arrayList2;
                        f11 = 0.0f;
                    }
                    arrayList2 = arrayList;
                    i10 = i12;
                    i12 = i10 + 1;
                    arrayList = arrayList2;
                    f11 = 0.0f;
                }
            }
        } else if (this.f12659e != null) {
            canvas.save();
            canvas.translate(w7Var.F, w7Var.G + i7);
            if (x7Var.f12740a0.x()) {
                x7Var.f12740a0.W(canvas);
            }
            d(this.f12659e, canvas, arrayList3);
            org.telegram.ui.Components.t5 update4 = org.telegram.ui.Components.x5.update(0, w7Var, this.d, this.f12659e);
            this.d = update4;
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, this.f12659e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.f12659e, w7Var.F, w7Var.G + i7);
            }
        }
        if (this.f12669p != null) {
            canvas.save();
            canvas.translate(w7Var.F, (org.telegram.messenger.g0.W1(w7Var.f12716x, this.f12666m, this.f12665l) + w7Var.G) - this.f12669p.b());
            s7 s7Var2 = this.f12669p;
            int width2 = w7Var.getWidth();
            int i13 = w7Var.F;
            s7Var2.a(canvas, (width2 - i13) - i13);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            xh.f.g(this.v, false, -1, 0, this.f12674u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i7) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        w7 w7Var = this.v;
        x7 x7Var = w7Var.K;
        TextPaint textPaint = w7Var.d;
        v7[] v7VarArr = w7Var.f12713r;
        TextPaint textPaint2 = w7Var.f12709c;
        boolean isEmpty = TextUtils.isEmpty(this.f12667n);
        Stack stack = this.f12663j;
        ArrayList arrayList = this.f12662i;
        if (isEmpty) {
            this.f12659e = null;
            this.f12665l = 0;
            s7 s7Var = this.f12668o;
            if (s7Var != null) {
                this.f12665l = org.telegram.messenger.g0.L(4.0f) + s7Var.b();
            }
            s7 s7Var2 = this.f12669p;
            if (s7Var2 != null) {
                this.f12665l = org.telegram.messenger.f3.C(4.0f, s7Var2.b(), this.f12665l);
            }
            this.f12666m = this.f12665l;
            if (this == v7VarArr[0]) {
                w7Var.f12715w = null;
            }
            this.f12661g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a10 = w7.a(w7Var, textPaint2, this.f12667n, i7);
        this.f12659e = a10;
        this.f12665l = a10.getHeight();
        s7 s7Var3 = this.f12668o;
        if (s7Var3 != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + s7Var3.b();
        } else {
            i10 = 0;
        }
        s7 s7Var4 = this.f12669p;
        if (s7Var4 != null) {
            this.f12665l = org.telegram.messenger.f3.C(8.0f, s7Var4.b(), this.f12665l);
        }
        this.f12665l += i10;
        float measureText = textPaint2.measureText(" ");
        if (this.f12659e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7Var.f12708b = z10;
        if (z10) {
            i11 = 3;
            if (this.f12659e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.f12667n.subSequence(this.f12659e.getLineStart(2), this.f12659e.getLineEnd(2))) == 0) {
                    w7Var.f12708b = false;
                }
            }
        } else {
            i11 = 3;
        }
        if (w7Var.f12708b) {
            float topPadding = this.f12659e.getTopPadding() + this.f12659e.getLineTop(2);
            if (this == v7VarArr[0]) {
                String N0 = gd.N0(2131745143, null);
                w7Var.f12715w = w7.a(w7Var, textPaint, N0, i7);
                w7Var.h = ((w7Var.G + i10) + topPadding) - org.telegram.messenger.g0.N(0.3f);
                w7Var.f12712n = (w7Var.F + i7) - textPaint.measureText(N0);
            }
            int topPadding2 = this.f12659e.getTopPadding() + this.f12659e.getLineBottom(2);
            s7 s7Var5 = this.f12668o;
            if (s7Var5 != null) {
                i12 = org.telegram.messenger.g0.L(8.0f) + s7Var5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            s7 s7Var6 = this.f12669p;
            if (s7Var6 != null) {
                i13 = org.telegram.messenger.g0.L(8.0f) + s7Var6.b();
            } else {
                i13 = 0;
            }
            this.f12666m = i14 + i13;
            this.f12661g = w7.a(w7Var, textPaint2, this.f12667n.subSequence(0, this.f12659e.getLineEnd(2)), i7);
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(x7Var, this.f12659e, stack, arrayList);
            float lineRight = this.f12659e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    t7[] t7VarArr = this.h;
                    if (i15 >= t7VarArr.length) {
                        break;
                    }
                    t7 t7Var = t7VarArr[i15];
                    if (t7Var != null) {
                        org.telegram.ui.Components.x5.release(x7Var, t7Var.f12592a);
                    }
                    i15++;
                }
            }
            this.h = new t7[this.f12659e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = i11; i16 < this.f12659e.getLineCount(); i16++) {
                    int lineStart = this.f12659e.getLineStart(i16);
                    int lineEnd = this.f12659e.getLineEnd(i16);
                    CharSequence subSequence = this.f12667n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = null;
                    } else {
                        StaticLayout a11 = w7.a(w7Var, textPaint2, subSequence, i7);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f12593b = a11;
                        obj.f12595e = this.f12659e.getLineLeft(i16);
                        obj.f12596f = this.f12659e.getTopPadding() + this.f12659e.getLineTop(i16);
                        if (lineRight < w7Var.f12712n - org.telegram.messenger.g0.L(16.0f)) {
                            obj.d = topPadding;
                            obj.f12594c = lineRight;
                            lineRight = Math.abs(a11.getLineRight(0) - a11.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f12596f;
                            obj.f12594c = obj.f12595e;
                        }
                    }
                }
            }
        } else {
            if (this == v7VarArr[0]) {
                w7Var.f12715w = null;
            }
            this.f12661g = null;
            this.f12666m = this.f12665l;
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(w7Var, this.f12659e, stack, arrayList);
        }
        int i17 = w7Var.F;
        int i18 = w7Var.G;
        gf.c cVar = this.f12664k;
        cVar.f13522a = i17;
        cVar.f13524c = i18;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12;
        float f13 = 0.0f;
        int i7 = 0;
        while (i7 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i7);
            w7 w7Var = this.v;
            float f14 = lineLeft - (w7Var.F / 3.0f);
            float lineRight = (w7Var.F / 3.0f) + layout.getLineRight(i7);
            if (i7 == 0) {
                f13 = layout.getLineTop(i7) - (w7Var.G / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i7);
            if (i7 >= layout.getLineCount() - 1) {
                f12 = (w7Var.G / 3.0f) + lineBottom;
            } else {
                f12 = lineBottom;
            }
            this.f12673t.addRect(f10 + f14, f11 + f13, f10 + lineRight, f11 + f12, Path.Direction.CW);
            i7++;
            f13 = f12;
        }
    }

    public final void g(CharSequence charSequence, s7 s7Var, s7 s7Var2) {
        this.f12667n = charSequence;
        this.f12668o = s7Var;
        this.f12669p = s7Var2;
        w7 w7Var = this.v;
        if (s7Var != null) {
            u7 u7Var = new u7(this, 0);
            s7Var.f12552r = w7Var;
            s7Var.f12553s = u7Var;
            new ok0(w7Var);
            s7Var.f12544j.setCallback(w7Var);
            s7Var.h.f33929a = w7Var;
            s7Var.f12543i.f37103a = w7Var;
            s7Var.c();
        }
        s7 s7Var3 = this.f12669p;
        if (s7Var3 != null) {
            u7 u7Var2 = new u7(this, 1);
            s7Var3.f12552r = w7Var;
            s7Var3.f12553s = u7Var2;
            new ok0(w7Var);
            s7Var3.f12544j.setCallback(w7Var);
            s7Var3.h.f33929a = w7Var;
            s7Var3.f12543i.f37103a = w7Var;
            s7Var3.c();
        }
        w7Var.f12714s = 0;
        w7Var.requestLayout();
    }
}
