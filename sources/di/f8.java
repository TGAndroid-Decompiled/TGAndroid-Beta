package di;

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
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zj0;
public final class f8 {
    public x70 f9003a;
    public org.telegram.ui.Components.r5 f9004b;
    public final n2.n0 f9005c;
    public org.telegram.ui.Components.n5 d;
    public StaticLayout f9006e;
    public org.telegram.ui.Components.n5 f9007f;
    public StaticLayout f9008g;
    public d8[] h;
    public final ArrayList f9009i;
    public final Stack f9010j;
    public final gf.c f9011k;
    public int f9012l;
    public int f9013m;
    public CharSequence f9014n;
    public c8 f9015o;
    public c8 f9016p;
    public boolean f9017q;
    public final org.telegram.ui.Components.w5 f9018r;
    public final a80 f9019s;
    public final Path f9020t;
    public final AtomicReference f9021u;
    public final g8 v;

    public f8(g8 g8Var) {
        this.v = g8Var;
        this.f9005c = new n2.n0(g8Var);
        ArrayList arrayList = new ArrayList();
        this.f9009i = arrayList;
        this.f9010j = new Stack();
        this.f9014n = "";
        this.f9018r = new org.telegram.ui.Components.w5(g8Var.J, 0L, 400L, xq.h);
        Path path = new Path();
        this.f9020t = path;
        this.f9021u = new AtomicReference();
        this.f9011k = new gf.c(g8Var, arrayList, new q4(this, 3));
        a80 a80Var = new a80();
        this.f9019s = a80Var;
        a80Var.f31747y = path;
        a80Var.k(4.0f);
        a80Var.g(org.telegram.ui.ActionBar.k6.r1(0.3f, -1), org.telegram.ui.ActionBar.k6.r1(0.1f, -1), org.telegram.ui.ActionBar.k6.r1(0.2f, -1), org.telegram.ui.ActionBar.k6.r1(0.7f, -1));
        a80Var.setCallback(g8Var);
    }

    public final int a(int i7) {
        int i10;
        c8 c8Var = this.f9015o;
        int i11 = 0;
        if (c8Var != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + c8Var.b();
        } else {
            i10 = 0;
        }
        c8 c8Var2 = this.f9016p;
        if (c8Var2 != null) {
            i11 = org.telegram.messenger.g0.L(8.0f) + c8Var2.b();
        }
        int i12 = i10 + i11;
        StaticLayout staticLayout = this.f9006e;
        g8 g8Var = this.v;
        if (staticLayout == null) {
            return i7 - ((g8Var.F * 2) + this.f9012l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!g8Var.f9052b) {
            return i7 - ((g8Var.F * 2) + this.f9012l);
        }
        return (i7 - ((Math.min(3, lineCount) + 1) * g8Var.f9053c.getFontMetricsInt(null))) - i12;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        g8 g8Var = this.v;
        h8 h8Var = g8Var.J;
        float d = this.f9018r.d(this.f9017q);
        if (f10 > 0.0f) {
            float T1 = org.telegram.messenger.g0.T1(f10, 0.7f * f10, d);
            if (T1 >= 1.0f) {
                c(canvas, d);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, h8Var.getWidth(), h8Var.getHeight(), (int) (T1 * 255.0f), 31);
                c(canvas2, d);
                canvas2.restore();
            }
            if (d <= 0.0f && !this.f9017q) {
                return;
            }
            a80 a80Var = this.f9019s;
            a80Var.setAlpha((int) (d * 255.0f * T1));
            a80Var.draw(canvas2);
            g8Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        boolean z9;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        g8 g8Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = g8Var.f9051a;
        h8 h8Var = g8Var.J;
        if (this.f9015o != null) {
            canvas.save();
            canvas.translate(g8Var.E, g8Var.F);
            c8 c8Var = this.f9015o;
            int width = g8Var.getWidth();
            int i11 = g8Var.E;
            c8Var.a(canvas, (width - i11) - i11);
            int b10 = this.f9015o.b();
            canvas.restore();
            i7 = org.telegram.messenger.g0.L(8.0f) + b10;
        } else {
            i7 = 0;
        }
        canvas.save();
        canvas.translate(g8Var.E, g8Var.F + i7);
        if (this.f9005c.h(canvas)) {
            g8Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f9020t.rewind();
        ArrayList arrayList3 = this.f9009i;
        if (arrayList3.isEmpty() && this.f9008g != null) {
            if (h8Var.W.x()) {
                canvas.save();
                canvas.translate(g8Var.E, g8Var.F + i7);
                h8Var.W.W(canvas);
                canvas.restore();
            }
            if (this.f9008g != null) {
                canvas.save();
                canvas.translate(g8Var.E, g8Var.F + i7);
                d(this.f9008g, canvas, arrayList3);
                org.telegram.ui.Components.n5 update = org.telegram.ui.Components.r5.update(0, g8Var, this.f9007f, this.f9008g);
                this.f9007f = update;
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.f9008g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z9) {
                    f(this.f9008g, g8Var.E, g8Var.F + i7);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    d8[] d8VarArr = this.h;
                    if (i12 >= d8VarArr.length) {
                        break;
                    }
                    d8 d8Var = d8VarArr[i12];
                    if (d8Var != null) {
                        canvas.save();
                        float f12 = d8Var.f8936c;
                        float f13 = d8Var.f8937e;
                        if (f12 == f13) {
                            if (g8Var.f9060x != f11) {
                                canvas.translate(g8Var.E + f13, g8Var.F + i7 + d8Var.f8938f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, d8Var.f8935b.getWidth(), d8Var.f8935b.getHeight(), (int) (g8Var.f9060x * 255.0f), 31);
                                d(d8Var.f8935b, canvas, arrayList);
                                if (z9) {
                                    f(d8Var.f8935b, g8Var.E + d8Var.f8937e, g8Var.F + i7 + d8Var.f8938f);
                                }
                                d8Var.f8935b.draw(canvas);
                                org.telegram.ui.Components.n5 update2 = org.telegram.ui.Components.r5.update(0, g8Var, d8Var.f8934a, d8Var.f8935b);
                                d8Var.f8934a = update2;
                                arrayList2 = arrayList;
                                i10 = i12;
                                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, d8Var.f8935b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, g8Var.f9060x, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i10 = i12;
                            float T1 = org.telegram.messenger.g0.T1(f12, f13, g8Var.f9060x);
                            float T12 = org.telegram.messenger.g0.T1(d8Var.d, d8Var.f8938f, xq.f40330g.getInterpolation(g8Var.f9060x));
                            canvas.translate(g8Var.E + T1, g8Var.F + i7 + T12);
                            if (z9) {
                                f(d8Var.f8935b, g8Var.E + T1, g8Var.F + i7 + T12);
                            }
                            d8Var.f8935b.draw(canvas);
                            org.telegram.ui.Components.n5 update3 = org.telegram.ui.Components.r5.update(0, g8Var, d8Var.f8934a, d8Var.f8935b);
                            d8Var.f8934a = update3;
                            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, d8Var.f8935b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        } else if (this.f9006e != null) {
            canvas.save();
            canvas.translate(g8Var.E, g8Var.F + i7);
            if (h8Var.W.x()) {
                h8Var.W.W(canvas);
            }
            d(this.f9006e, canvas, arrayList3);
            org.telegram.ui.Components.n5 update4 = org.telegram.ui.Components.r5.update(0, g8Var, this.d, this.f9006e);
            this.d = update4;
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.f9006e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z9) {
                f(this.f9006e, g8Var.E, g8Var.F + i7);
            }
        }
        if (this.f9016p != null) {
            canvas.save();
            canvas.translate(g8Var.E, (org.telegram.messenger.g0.W1(g8Var.f9060x, this.f9013m, this.f9012l) + g8Var.F) - this.f9016p.b());
            c8 c8Var2 = this.f9016p;
            int width2 = g8Var.getWidth();
            int i13 = g8Var.E;
            c8Var2.a(canvas, (width2 - i13) - i13);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            xh.f.g(this.v, false, -1, 0, this.f9021u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i7) {
        int i10;
        boolean z9;
        int i11;
        int i12;
        int i13;
        g8 g8Var = this.v;
        h8 h8Var = g8Var.J;
        TextPaint textPaint = g8Var.d;
        f8[] f8VarArr = g8Var.f9057r;
        TextPaint textPaint2 = g8Var.f9053c;
        boolean isEmpty = TextUtils.isEmpty(this.f9014n);
        Stack stack = this.f9010j;
        ArrayList arrayList = this.f9009i;
        if (isEmpty) {
            this.f9006e = null;
            this.f9012l = 0;
            c8 c8Var = this.f9015o;
            if (c8Var != null) {
                this.f9012l = org.telegram.messenger.g0.L(4.0f) + c8Var.b();
            }
            c8 c8Var2 = this.f9016p;
            if (c8Var2 != null) {
                this.f9012l = org.telegram.messenger.k5.C(4.0f, c8Var2.b(), this.f9012l);
            }
            this.f9013m = this.f9012l;
            if (this == f8VarArr[0]) {
                g8Var.f9059w = null;
            }
            this.f9008g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a10 = g8.a(g8Var, textPaint2, this.f9014n, i7);
        this.f9006e = a10;
        this.f9012l = a10.getHeight();
        c8 c8Var3 = this.f9015o;
        if (c8Var3 != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + c8Var3.b();
        } else {
            i10 = 0;
        }
        c8 c8Var4 = this.f9016p;
        if (c8Var4 != null) {
            this.f9012l = org.telegram.messenger.k5.C(8.0f, c8Var4.b(), this.f9012l);
        }
        this.f9012l += i10;
        float measureText = textPaint2.measureText(" ");
        if (this.f9006e.getLineCount() > 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        g8Var.f9052b = z9;
        if (z9) {
            i11 = 3;
            if (this.f9006e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.f9014n.subSequence(this.f9006e.getLineStart(2), this.f9006e.getLineEnd(2))) == 0) {
                    g8Var.f9052b = false;
                }
            }
        } else {
            i11 = 3;
        }
        if (g8Var.f9052b) {
            float topPadding = this.f9006e.getTopPadding() + this.f9006e.getLineTop(2);
            if (this == f8VarArr[0]) {
                String M0 = hd.M0(2131745340, null);
                g8Var.f9059w = g8.a(g8Var, textPaint, M0, i7);
                g8Var.h = ((g8Var.F + i10) + topPadding) - org.telegram.messenger.g0.N(0.3f);
                g8Var.f9056n = (g8Var.E + i7) - textPaint.measureText(M0);
            }
            int topPadding2 = this.f9006e.getTopPadding() + this.f9006e.getLineBottom(2);
            c8 c8Var5 = this.f9015o;
            if (c8Var5 != null) {
                i12 = org.telegram.messenger.g0.L(8.0f) + c8Var5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            c8 c8Var6 = this.f9016p;
            if (c8Var6 != null) {
                i13 = org.telegram.messenger.g0.L(8.0f) + c8Var6.b();
            } else {
                i13 = 0;
            }
            this.f9013m = i14 + i13;
            this.f9008g = g8.a(g8Var, textPaint2, this.f9014n.subSequence(0, this.f9006e.getLineEnd(2)), i7);
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(h8Var, this.f9006e, stack, arrayList);
            float lineRight = this.f9006e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    d8[] d8VarArr = this.h;
                    if (i15 >= d8VarArr.length) {
                        break;
                    }
                    d8 d8Var = d8VarArr[i15];
                    if (d8Var != null) {
                        org.telegram.ui.Components.r5.release(h8Var, d8Var.f8934a);
                    }
                    i15++;
                }
            }
            this.h = new d8[this.f9006e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = i11; i16 < this.f9006e.getLineCount(); i16++) {
                    int lineStart = this.f9006e.getLineStart(i16);
                    int lineEnd = this.f9006e.getLineEnd(i16);
                    CharSequence subSequence = this.f9014n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = null;
                    } else {
                        StaticLayout a11 = g8.a(g8Var, textPaint2, subSequence, i7);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f8935b = a11;
                        obj.f8937e = this.f9006e.getLineLeft(i16);
                        obj.f8938f = this.f9006e.getTopPadding() + this.f9006e.getLineTop(i16);
                        if (lineRight < g8Var.f9056n - org.telegram.messenger.g0.L(16.0f)) {
                            obj.d = topPadding;
                            obj.f8936c = lineRight;
                            lineRight = Math.abs(a11.getLineRight(0) - a11.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f8938f;
                            obj.f8936c = obj.f8937e;
                        }
                    }
                }
            }
        } else {
            if (this == f8VarArr[0]) {
                g8Var.f9059w = null;
            }
            this.f9008g = null;
            this.f9013m = this.f9012l;
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(g8Var, this.f9006e, stack, arrayList);
        }
        int i17 = g8Var.E;
        int i18 = g8Var.F;
        gf.c cVar = this.f9011k;
        cVar.f13871a = i17;
        cVar.f13873c = i18;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12;
        float f13 = 0.0f;
        int i7 = 0;
        while (i7 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i7);
            g8 g8Var = this.v;
            float f14 = lineLeft - (g8Var.E / 3.0f);
            float lineRight = (g8Var.E / 3.0f) + layout.getLineRight(i7);
            if (i7 == 0) {
                f13 = layout.getLineTop(i7) - (g8Var.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i7);
            if (i7 >= layout.getLineCount() - 1) {
                f12 = (g8Var.F / 3.0f) + lineBottom;
            } else {
                f12 = lineBottom;
            }
            this.f9020t.addRect(f10 + f14, f11 + f13, f10 + lineRight, f11 + f12, Path.Direction.CW);
            i7++;
            f13 = f12;
        }
    }

    public final void g(CharSequence charSequence, c8 c8Var, c8 c8Var2) {
        this.f9014n = charSequence;
        this.f9015o = c8Var;
        this.f9016p = c8Var2;
        g8 g8Var = this.v;
        if (c8Var != null) {
            e8 e8Var = new e8(this, 0);
            c8Var.f8894r = g8Var;
            c8Var.f8895s = e8Var;
            new zj0(g8Var);
            c8Var.f8886j.setCallback(g8Var);
            c8Var.h.f39855a = g8Var;
            c8Var.f8885i.f34549a = g8Var;
            c8Var.c();
        }
        c8 c8Var3 = this.f9016p;
        if (c8Var3 != null) {
            e8 e8Var2 = new e8(this, 1);
            c8Var3.f8894r = g8Var;
            c8Var3.f8895s = e8Var2;
            new zj0(g8Var);
            c8Var3.f8886j.setCallback(g8Var);
            c8Var3.h.f39855a = g8Var;
            c8Var3.f8885i.f34549a = g8Var;
            c8Var3.c();
        }
        g8Var.f9058s = 0;
        g8Var.requestLayout();
    }
}
