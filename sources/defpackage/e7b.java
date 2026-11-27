package defpackage;

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
public final class e7b {
    public q66 a;
    public hm b;
    public final m66 c;
    public dm d;
    public StaticLayout e;
    public dm f;
    public StaticLayout g;
    public c7b[] h;
    public final ArrayList i;
    public final Stack j;
    public final nk0 k;
    public int l;
    public int m;
    public CharSequence n;
    public b7b o;
    public b7b p;
    public boolean q;
    public final mm r;
    public final va6 s;
    public final Path t;
    public final AtomicReference u;
    public final f7b v;

    public e7b(f7b f7bVar) {
        this.v = f7bVar;
        this.c = new m66(f7bVar);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new mm(f7bVar.K, 0L, 400L, k43.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new nk0(f7bVar, arrayList, new hja(this, (byte) 19));
        va6 va6Var = new va6();
        this.s = va6Var;
        va6Var.y = path;
        va6Var.j(4.0f);
        va6Var.g(aob.p1(0.3f, -1), aob.p1(0.1f, -1), aob.p1(0.2f, -1), aob.p1(0.7f, -1));
        va6Var.setCallback(f7bVar);
    }

    public final int a(int i) {
        int i2;
        b7b b7bVar = this.o;
        int i3 = 0;
        if (b7bVar != null) {
            i2 = hl.L(8.0f) + b7bVar.b();
        } else {
            i2 = 0;
        }
        b7b b7bVar2 = this.p;
        if (b7bVar2 != null) {
            i3 = hl.L(8.0f) + b7bVar2.b();
        }
        int i4 = i2 + i3;
        StaticLayout staticLayout = this.e;
        f7b f7bVar = this.v;
        if (staticLayout == null) {
            return i - ((f7bVar.G << 1) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!f7bVar.b) {
            return i - ((f7bVar.G << 1) + this.l);
        }
        return (i - ((Math.min(3, lineCount) + 1) * f7bVar.c.getFontMetricsInt(null))) - i4;
    }

    public final void b(Canvas canvas, float f) {
        Canvas canvas2;
        f7b f7bVar = this.v;
        g7b g7bVar = f7bVar.K;
        float d = this.r.d(this.q);
        if (f > 0.0f) {
            float R1 = hl.R1(f, 0.7f * f, d);
            if (R1 >= 1.0f) {
                c(canvas, d);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, g7bVar.getWidth(), g7bVar.getHeight(), (int) (R1 * 255.0f), 31);
                c(canvas2, d);
                canvas2.restore();
            }
            if (d <= 0.0f && !this.q) {
                return;
            }
            va6 va6Var = this.s;
            va6Var.setAlpha((int) (d * 255.0f * R1));
            va6Var.draw(canvas2);
            f7bVar.invalidate();
        }
    }

    public final void c(Canvas canvas, float f) {
        int i;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i2;
        f7b f7bVar = this.v;
        PorterDuffColorFilter porterDuffColorFilter = f7bVar.a;
        g7b g7bVar = f7bVar.K;
        if (this.o != null) {
            canvas.save();
            canvas.translate(f7bVar.F, f7bVar.G);
            b7b b7bVar = this.o;
            int width = f7bVar.getWidth();
            int i3 = f7bVar.F;
            b7bVar.a(canvas, (width - i3) - i3);
            int b = this.o.b();
            canvas.restore();
            i = hl.L(8.0f) + b;
        } else {
            i = 0;
        }
        canvas.save();
        canvas.translate(f7bVar.F, f7bVar.G + i);
        if (this.c.g(canvas)) {
            f7bVar.invalidate();
        }
        canvas.restore();
        float f2 = 0.0f;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (g7bVar.W.w()) {
                canvas.save();
                canvas.translate(f7bVar.F, f7bVar.G + i);
                g7bVar.W.V(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(f7bVar.F, f7bVar.G + i);
                d(this.g, canvas, arrayList3);
                dm update = hm.update(0, f7bVar, this.f, this.g);
                this.f = update;
                hm.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z) {
                    f(this.g, f7bVar.F, f7bVar.G + i);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i4 = 0;
                while (true) {
                    c7b[] c7bVarArr = this.h;
                    if (i4 >= c7bVarArr.length) {
                        break;
                    }
                    c7b c7bVar = c7bVarArr[i4];
                    if (c7bVar != null) {
                        canvas.save();
                        float f3 = c7bVar.c;
                        float f4 = c7bVar.e;
                        int i5 = (f3 > f4 ? 1 : (f3 == f4 ? 0 : -1));
                        float f5 = f7bVar.x;
                        if (i5 == 0) {
                            if (f5 != f2) {
                                canvas.translate(f7bVar.F + f4, f7bVar.G + i + c7bVar.f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, c7bVar.b.getWidth(), c7bVar.b.getHeight(), (int) (f7bVar.x * 255.0f), 31);
                                d(c7bVar.b, canvas, arrayList);
                                if (z) {
                                    f(c7bVar.b, f7bVar.F + c7bVar.e, f7bVar.G + i + c7bVar.f);
                                }
                                c7bVar.b.draw(canvas);
                                dm update2 = hm.update(0, f7bVar, c7bVar.a, c7bVar.b);
                                c7bVar.a = update2;
                                arrayList2 = arrayList;
                                i2 = i4;
                                hm.drawAnimatedEmojis(canvas, c7bVar.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, f7bVar.x, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i2 = i4;
                            float R1 = hl.R1(f3, f4, f5);
                            float R12 = hl.R1(c7bVar.d, c7bVar.f, k43.g.getInterpolation(f7bVar.x));
                            canvas.translate(f7bVar.F + R1, f7bVar.G + i + R12);
                            if (z) {
                                f(c7bVar.b, f7bVar.F + R1, f7bVar.G + i + R12);
                            }
                            c7bVar.b.draw(canvas);
                            dm update3 = hm.update(0, f7bVar, c7bVar.a, c7bVar.b);
                            c7bVar.a = update3;
                            hm.drawAnimatedEmojis(canvas, c7bVar.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        }
                        canvas.restore();
                        i4 = i2 + 1;
                        arrayList = arrayList2;
                        f2 = 0.0f;
                    }
                    arrayList2 = arrayList;
                    i2 = i4;
                    i4 = i2 + 1;
                    arrayList = arrayList2;
                    f2 = 0.0f;
                }
            }
        } else if (this.e != null) {
            canvas.save();
            canvas.translate(f7bVar.F, f7bVar.G + i);
            if (g7bVar.W.w()) {
                g7bVar.W.V(canvas);
            }
            d(this.e, canvas, arrayList3);
            dm update4 = hm.update(0, f7bVar, this.d, this.e);
            this.d = update4;
            hm.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z) {
                f(this.e, f7bVar.F, f7bVar.G + i);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(f7bVar.F, (hl.U1(f7bVar.x, this.m, this.l) + f7bVar.G) - this.p.b());
            b7b b7bVar2 = this.p;
            int width2 = f7bVar.getWidth();
            int i6 = f7bVar.F;
            b7bVar2.a(canvas, (width2 - i6) - i6);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            npa.g(this.v, false, -1, 0, this.u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        f7b f7bVar = this.v;
        g7b g7bVar = f7bVar.K;
        TextPaint textPaint = f7bVar.d;
        e7b[] e7bVarArr = f7bVar.r;
        TextPaint textPaint2 = f7bVar.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            b7b b7bVar = this.o;
            if (b7bVar != null) {
                i6 = hl.L(4.0f) + b7bVar.b();
                this.l = i6;
            } else {
                i6 = 0;
            }
            b7b b7bVar2 = this.p;
            if (b7bVar2 != null) {
                i6 = uh9.w(4.0f, b7bVar2.b(), i6);
                this.l = i6;
            }
            this.m = i6;
            if (this == e7bVarArr[0]) {
                f7bVar.w = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a = f7b.a(i, textPaint2, this.n);
        this.e = a;
        this.l = a.getHeight();
        b7b b7bVar3 = this.o;
        if (b7bVar3 != null) {
            i2 = hl.L(8.0f) + b7bVar3.b();
        } else {
            i2 = 0;
        }
        b7b b7bVar4 = this.p;
        if (b7bVar4 != null) {
            this.l = uh9.w(8.0f, b7bVar4.b(), this.l);
        }
        this.l += i2;
        float measureText = textPaint2.measureText(" ");
        if (this.e.getLineCount() > 3) {
            z = true;
        } else {
            z = false;
        }
        f7bVar.b = z;
        if (z) {
            i3 = 3;
            if (this.e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    f7bVar.b = false;
                }
            }
        } else {
            i3 = 3;
        }
        if (f7bVar.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == e7bVarArr[0]) {
                String M0 = ob6.M0(2131745067, null);
                f7bVar.w = f7b.a(i, textPaint, M0);
                f7bVar.h = ((f7bVar.G + i2) + topPadding) - hl.N(0.3f);
                f7bVar.n = (f7bVar.F + i) - textPaint.measureText(M0);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            b7b b7bVar5 = this.o;
            if (b7bVar5 != null) {
                i4 = hl.L(8.0f) + b7bVar5.b();
            } else {
                i4 = 0;
            }
            int i7 = topPadding2 + i4;
            b7b b7bVar6 = this.p;
            if (b7bVar6 != null) {
                i5 = hl.L(8.0f) + b7bVar6.b();
            } else {
                i5 = 0;
            }
            this.m = i7 + i5;
            this.g = f7b.a(i, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)));
            stack.addAll(arrayList);
            arrayList.clear();
            npa.c(g7bVar, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i8 = 0;
                while (true) {
                    c7b[] c7bVarArr = this.h;
                    if (i8 >= c7bVarArr.length) {
                        break;
                    }
                    c7b c7bVar = c7bVarArr[i8];
                    if (c7bVar != null) {
                        hm.release(g7bVar, c7bVar.a);
                    }
                    i8++;
                }
            }
            this.h = new c7b[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i9 = i3; i9 < this.e.getLineCount(); i9++) {
                    int lineStart = this.e.getLineStart(i9);
                    int lineEnd = this.e.getLineEnd(i9);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i9 - 3] = null;
                    } else {
                        StaticLayout a2 = f7b.a(i, textPaint2, subSequence);
                        ?? obj = new Object();
                        this.h[i9 - 3] = obj;
                        obj.b = a2;
                        obj.e = this.e.getLineLeft(i9);
                        obj.f = this.e.getTopPadding() + this.e.getLineTop(i9);
                        if (lineRight < f7bVar.n - hl.L(16.0f)) {
                            obj.d = topPadding;
                            obj.c = lineRight;
                            lineRight = Math.abs(a2.getLineRight(0) - a2.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f;
                            obj.c = obj.e;
                        }
                    }
                }
            }
        } else {
            if (this == e7bVarArr[0]) {
                f7bVar.w = null;
            }
            this.g = null;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            npa.c(f7bVar, this.e, stack, arrayList);
        }
        int i10 = f7bVar.F;
        int i11 = f7bVar.G;
        nk0 nk0Var = this.k;
        nk0Var.b = i10;
        nk0Var.c = i11;
    }

    public final void f(Layout layout, float f, float f2) {
        float f3;
        float f4 = 0.0f;
        int i = 0;
        while (i < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i);
            f7b f7bVar = this.v;
            float f5 = lineLeft - (f7bVar.F / 3.0f);
            float lineRight = (f7bVar.F / 3.0f) + layout.getLineRight(i);
            if (i == 0) {
                f4 = layout.getLineTop(i) - (f7bVar.G / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i);
            if (i >= layout.getLineCount() - 1) {
                f3 = (f7bVar.G / 3.0f) + lineBottom;
            } else {
                f3 = lineBottom;
            }
            this.t.addRect(f + f5, f2 + f4, f + lineRight, f2 + f3, Path.Direction.CW);
            i++;
            f4 = f3;
        }
    }

    public final void g(CharSequence charSequence, b7b b7bVar, b7b b7bVar2) {
        this.n = charSequence;
        this.o = b7bVar;
        this.p = b7bVar2;
        f7b f7bVar = this.v;
        if (b7bVar != null) {
            d7b d7bVar = new d7b(this, (byte) 0);
            b7bVar.r = f7bVar;
            b7bVar.s = d7bVar;
            new ab9(f7bVar);
            b7bVar.j.setCallback(f7bVar);
            b7bVar.h.a = f7bVar;
            b7bVar.i.a = f7bVar;
            b7bVar.c();
        }
        b7b b7bVar3 = this.p;
        if (b7bVar3 != null) {
            d7b d7bVar2 = new d7b(this, (byte) 1);
            b7bVar3.r = f7bVar;
            b7bVar3.s = d7bVar2;
            new ab9(f7bVar);
            b7bVar3.j.setCallback(f7bVar);
            b7bVar3.h.a = f7bVar;
            b7bVar3.i.a = f7bVar;
            b7bVar3.c();
        }
        f7bVar.s = 0;
        f7bVar.requestLayout();
    }
}
