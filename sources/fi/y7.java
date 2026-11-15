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
import org.telegram.messenger.hd;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.er;
public final class y7 {
    public a80 f12551a;
    public org.telegram.ui.Components.p5 f12552b;
    public final n2.o0 f12553c;
    public org.telegram.ui.Components.l5 d;
    public StaticLayout f12554e;
    public org.telegram.ui.Components.l5 f12555f;
    public StaticLayout f12556g;
    public w7[] h;
    public final ArrayList f12557i;
    public final Stack f12558j;
    public final gf.c f12559k;
    public int f12560l;
    public int f12561m;
    public CharSequence f12562n;
    public v7 f12563o;
    public v7 f12564p;
    public boolean f12565q;
    public final org.telegram.ui.Components.u5 f12566r;
    public final d80 f12567s;
    public final Path f12568t;
    public final AtomicReference f12569u;
    public final z7 v;

    public y7(z7 z7Var) {
        this.v = z7Var;
        this.f12553c = new n2.o0(z7Var);
        ArrayList arrayList = new ArrayList();
        this.f12557i = arrayList;
        this.f12558j = new Stack();
        this.f12562n = "";
        this.f12566r = new org.telegram.ui.Components.u5(z7Var.K, 0L, 400L, er.h);
        Path path = new Path();
        this.f12568t = path;
        this.f12569u = new AtomicReference();
        this.f12559k = new gf.c(z7Var, arrayList, new di.z6(this, 10));
        d80 d80Var = new d80();
        this.f12567s = d80Var;
        d80Var.f33885y = path;
        d80Var.k(4.0f);
        d80Var.g(org.telegram.ui.ActionBar.j6.r1(0.3f, -1), org.telegram.ui.ActionBar.j6.r1(0.1f, -1), org.telegram.ui.ActionBar.j6.r1(0.2f, -1), org.telegram.ui.ActionBar.j6.r1(0.7f, -1));
        d80Var.setCallback(z7Var);
    }

    public final int a(int i7) {
        int i10;
        v7 v7Var = this.f12563o;
        int i11 = 0;
        if (v7Var != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + v7Var.b();
        } else {
            i10 = 0;
        }
        v7 v7Var2 = this.f12564p;
        if (v7Var2 != null) {
            i11 = org.telegram.messenger.g0.L(8.0f) + v7Var2.b();
        }
        int i12 = i10 + i11;
        StaticLayout staticLayout = this.f12554e;
        z7 z7Var = this.v;
        if (staticLayout == null) {
            return i7 - ((z7Var.G * 2) + this.f12560l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!z7Var.f12595b) {
            return i7 - ((z7Var.G * 2) + this.f12560l);
        }
        return (i7 - ((Math.min(3, lineCount) + 1) * z7Var.f12596c.getFontMetricsInt(null))) - i12;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        z7 z7Var = this.v;
        a8 a8Var = z7Var.K;
        float d = this.f12566r.d(this.f12565q);
        if (f10 > 0.0f) {
            float T1 = org.telegram.messenger.g0.T1(f10, 0.7f * f10, d);
            if (T1 >= 1.0f) {
                c(canvas, d);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, a8Var.getWidth(), a8Var.getHeight(), (int) (T1 * 255.0f), 31);
                c(canvas2, d);
                canvas2.restore();
            }
            if (d <= 0.0f && !this.f12565q) {
                return;
            }
            d80 d80Var = this.f12567s;
            d80Var.setAlpha((int) (d * 255.0f * T1));
            d80Var.draw(canvas2);
            z7Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        z7 z7Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = z7Var.f12594a;
        a8 a8Var = z7Var.K;
        if (this.f12563o != null) {
            canvas.save();
            canvas.translate(z7Var.F, z7Var.G);
            v7 v7Var = this.f12563o;
            int width = z7Var.getWidth();
            int i11 = z7Var.F;
            v7Var.a(canvas, (width - i11) - i11);
            int b10 = this.f12563o.b();
            canvas.restore();
            i7 = org.telegram.messenger.g0.L(8.0f) + b10;
        } else {
            i7 = 0;
        }
        canvas.save();
        canvas.translate(z7Var.F, z7Var.G + i7);
        if (this.f12553c.h(canvas)) {
            z7Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12568t.rewind();
        ArrayList arrayList3 = this.f12557i;
        if (arrayList3.isEmpty() && this.f12556g != null) {
            if (a8Var.f11418a0.x()) {
                canvas.save();
                canvas.translate(z7Var.F, z7Var.G + i7);
                a8Var.f11418a0.W(canvas);
                canvas.restore();
            }
            if (this.f12556g != null) {
                canvas.save();
                canvas.translate(z7Var.F, z7Var.G + i7);
                d(this.f12556g, canvas, arrayList3);
                org.telegram.ui.Components.l5 update = org.telegram.ui.Components.p5.update(0, z7Var, this.f12555f, this.f12556g);
                this.f12555f = update;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.f12556g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f12556g, z7Var.F, z7Var.G + i7);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    w7[] w7VarArr = this.h;
                    if (i12 >= w7VarArr.length) {
                        break;
                    }
                    w7 w7Var = w7VarArr[i12];
                    if (w7Var != null) {
                        canvas.save();
                        float f12 = w7Var.f12472c;
                        float f13 = w7Var.f12473e;
                        if (f12 == f13) {
                            if (z7Var.f12603x != f11) {
                                canvas.translate(z7Var.F + f13, z7Var.G + i7 + w7Var.f12474f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, w7Var.f12471b.getWidth(), w7Var.f12471b.getHeight(), (int) (z7Var.f12603x * 255.0f), 31);
                                d(w7Var.f12471b, canvas, arrayList);
                                if (z10) {
                                    f(w7Var.f12471b, z7Var.F + w7Var.f12473e, z7Var.G + i7 + w7Var.f12474f);
                                }
                                w7Var.f12471b.draw(canvas);
                                org.telegram.ui.Components.l5 update2 = org.telegram.ui.Components.p5.update(0, z7Var, w7Var.f12470a, w7Var.f12471b);
                                w7Var.f12470a = update2;
                                arrayList2 = arrayList;
                                i10 = i12;
                                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, w7Var.f12471b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, z7Var.f12603x, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i10 = i12;
                            float T1 = org.telegram.messenger.g0.T1(f12, f13, z7Var.f12603x);
                            float T12 = org.telegram.messenger.g0.T1(w7Var.d, w7Var.f12474f, er.f34421g.getInterpolation(z7Var.f12603x));
                            canvas.translate(z7Var.F + T1, z7Var.G + i7 + T12);
                            if (z10) {
                                f(w7Var.f12471b, z7Var.F + T1, z7Var.G + i7 + T12);
                            }
                            w7Var.f12471b.draw(canvas);
                            org.telegram.ui.Components.l5 update3 = org.telegram.ui.Components.p5.update(0, z7Var, w7Var.f12470a, w7Var.f12471b);
                            w7Var.f12470a = update3;
                            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, w7Var.f12471b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        } else if (this.f12554e != null) {
            canvas.save();
            canvas.translate(z7Var.F, z7Var.G + i7);
            if (a8Var.f11418a0.x()) {
                a8Var.f11418a0.W(canvas);
            }
            d(this.f12554e, canvas, arrayList3);
            org.telegram.ui.Components.l5 update4 = org.telegram.ui.Components.p5.update(0, z7Var, this.d, this.f12554e);
            this.d = update4;
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.f12554e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.f12554e, z7Var.F, z7Var.G + i7);
            }
        }
        if (this.f12564p != null) {
            canvas.save();
            canvas.translate(z7Var.F, (org.telegram.messenger.g0.W1(z7Var.f12603x, this.f12561m, this.f12560l) + z7Var.G) - this.f12564p.b());
            v7 v7Var2 = this.f12564p;
            int width2 = z7Var.getWidth();
            int i13 = z7Var.F;
            v7Var2.a(canvas, (width2 - i13) - i13);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            xh.f.g(this.v, false, -1, 0, this.f12569u, 0, staticLayout, arrayList, canvas, false);
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
        z7 z7Var = this.v;
        a8 a8Var = z7Var.K;
        TextPaint textPaint = z7Var.d;
        y7[] y7VarArr = z7Var.f12600r;
        TextPaint textPaint2 = z7Var.f12596c;
        boolean isEmpty = TextUtils.isEmpty(this.f12562n);
        Stack stack = this.f12558j;
        ArrayList arrayList = this.f12557i;
        if (isEmpty) {
            this.f12554e = null;
            this.f12560l = 0;
            v7 v7Var = this.f12563o;
            if (v7Var != null) {
                this.f12560l = org.telegram.messenger.g0.L(4.0f) + v7Var.b();
            }
            v7 v7Var2 = this.f12564p;
            if (v7Var2 != null) {
                this.f12560l = org.telegram.messenger.k5.C(4.0f, v7Var2.b(), this.f12560l);
            }
            this.f12561m = this.f12560l;
            if (this == y7VarArr[0]) {
                z7Var.f12602w = null;
            }
            this.f12556g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a10 = z7.a(z7Var, textPaint2, this.f12562n, i7);
        this.f12554e = a10;
        this.f12560l = a10.getHeight();
        v7 v7Var3 = this.f12563o;
        if (v7Var3 != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + v7Var3.b();
        } else {
            i10 = 0;
        }
        v7 v7Var4 = this.f12564p;
        if (v7Var4 != null) {
            this.f12560l = org.telegram.messenger.k5.C(8.0f, v7Var4.b(), this.f12560l);
        }
        this.f12560l += i10;
        float measureText = textPaint2.measureText(" ");
        if (this.f12554e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        z7Var.f12595b = z10;
        if (z10) {
            i11 = 3;
            if (this.f12554e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.f12562n.subSequence(this.f12554e.getLineStart(2), this.f12554e.getLineEnd(2))) == 0) {
                    z7Var.f12595b = false;
                }
            }
        } else {
            i11 = 3;
        }
        if (z7Var.f12595b) {
            float topPadding = this.f12554e.getTopPadding() + this.f12554e.getLineTop(2);
            if (this == y7VarArr[0]) {
                String M0 = hd.M0(2131745339, null);
                z7Var.f12602w = z7.a(z7Var, textPaint, M0, i7);
                z7Var.h = ((z7Var.G + i10) + topPadding) - org.telegram.messenger.g0.N(0.3f);
                z7Var.f12599n = (z7Var.F + i7) - textPaint.measureText(M0);
            }
            int topPadding2 = this.f12554e.getTopPadding() + this.f12554e.getLineBottom(2);
            v7 v7Var5 = this.f12563o;
            if (v7Var5 != null) {
                i12 = org.telegram.messenger.g0.L(8.0f) + v7Var5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            v7 v7Var6 = this.f12564p;
            if (v7Var6 != null) {
                i13 = org.telegram.messenger.g0.L(8.0f) + v7Var6.b();
            } else {
                i13 = 0;
            }
            this.f12561m = i14 + i13;
            this.f12556g = z7.a(z7Var, textPaint2, this.f12562n.subSequence(0, this.f12554e.getLineEnd(2)), i7);
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(a8Var, this.f12554e, stack, arrayList);
            float lineRight = this.f12554e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    w7[] w7VarArr = this.h;
                    if (i15 >= w7VarArr.length) {
                        break;
                    }
                    w7 w7Var = w7VarArr[i15];
                    if (w7Var != null) {
                        org.telegram.ui.Components.p5.release(a8Var, w7Var.f12470a);
                    }
                    i15++;
                }
            }
            this.h = new w7[this.f12554e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = i11; i16 < this.f12554e.getLineCount(); i16++) {
                    int lineStart = this.f12554e.getLineStart(i16);
                    int lineEnd = this.f12554e.getLineEnd(i16);
                    CharSequence subSequence = this.f12562n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = null;
                    } else {
                        StaticLayout a11 = z7.a(z7Var, textPaint2, subSequence, i7);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f12471b = a11;
                        obj.f12473e = this.f12554e.getLineLeft(i16);
                        obj.f12474f = this.f12554e.getTopPadding() + this.f12554e.getLineTop(i16);
                        if (lineRight < z7Var.f12599n - org.telegram.messenger.g0.L(16.0f)) {
                            obj.d = topPadding;
                            obj.f12472c = lineRight;
                            lineRight = Math.abs(a11.getLineRight(0) - a11.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f12474f;
                            obj.f12472c = obj.f12473e;
                        }
                    }
                }
            }
        } else {
            if (this == y7VarArr[0]) {
                z7Var.f12602w = null;
            }
            this.f12556g = null;
            this.f12561m = this.f12560l;
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(z7Var, this.f12554e, stack, arrayList);
        }
        int i17 = z7Var.F;
        int i18 = z7Var.G;
        gf.c cVar = this.f12559k;
        cVar.f13215a = i17;
        cVar.f13217c = i18;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12;
        float f13 = 0.0f;
        int i7 = 0;
        while (i7 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i7);
            z7 z7Var = this.v;
            float f14 = lineLeft - (z7Var.F / 3.0f);
            float lineRight = (z7Var.F / 3.0f) + layout.getLineRight(i7);
            if (i7 == 0) {
                f13 = layout.getLineTop(i7) - (z7Var.G / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i7);
            if (i7 >= layout.getLineCount() - 1) {
                f12 = (z7Var.G / 3.0f) + lineBottom;
            } else {
                f12 = lineBottom;
            }
            this.f12568t.addRect(f10 + f14, f11 + f13, f10 + lineRight, f11 + f12, Path.Direction.CW);
            i7++;
            f13 = f12;
        }
    }

    public final void g(CharSequence charSequence, v7 v7Var, v7 v7Var2) {
        this.f12562n = charSequence;
        this.f12563o = v7Var;
        this.f12564p = v7Var2;
        z7 z7Var = this.v;
        if (v7Var != null) {
            x7 x7Var = new x7(this, 0);
            v7Var.f12443r = z7Var;
            v7Var.f12444s = x7Var;
            new ek0(z7Var);
            v7Var.f12435j.setCallback(z7Var);
            v7Var.h.f39901a = z7Var;
            v7Var.f12434i.f33911a = z7Var;
            v7Var.c();
        }
        v7 v7Var3 = this.f12564p;
        if (v7Var3 != null) {
            x7 x7Var2 = new x7(this, 1);
            v7Var3.f12443r = z7Var;
            v7Var3.f12444s = x7Var2;
            new ek0(z7Var);
            v7Var3.f12435j.setCallback(z7Var);
            v7Var3.h.f39901a = z7Var;
            v7Var3.f12434i.f33911a = z7Var;
            v7Var3.c();
        }
        z7Var.f12601s = 0;
        z7Var.requestLayout();
    }
}
