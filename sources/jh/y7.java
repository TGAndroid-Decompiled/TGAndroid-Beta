package jh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t80;

public final class y7 {

    public q80 f14156a;

    public org.telegram.ui.Components.t5 f14157b;

    public final m80 f14158c;
    public org.telegram.ui.Components.p5 d;

    public StaticLayout f14159e;

    public org.telegram.ui.Components.p5 f14160f;

    public StaticLayout f14161g;
    public w7[] h;

    public final ArrayList f14162i;

    public final Stack f14163j;

    public final eh.p f14164k;

    public int f14165l;

    public int f14166m;

    public CharSequence f14167n;

    public v7 f14168o;

    public v7 f14169p;

    public boolean f14170q;

    public final org.telegram.ui.Components.y5 f14171r;

    public final t80 f14172s;

    public final Path f14173t;

    public final AtomicReference f14174u;
    public final z7 v;

    public y7(z7 z7Var) {
        this.v = z7Var;
        this.f14158c = new m80(z7Var);
        ArrayList arrayList = new ArrayList();
        this.f14162i = arrayList;
        this.f14163j = new Stack();
        this.f14167n = "";
        this.f14171r = new org.telegram.ui.Components.y5(z7Var.F, 0L, 400L, er.h);
        Path path = new Path();
        this.f14173t = path;
        this.f14174u = new AtomicReference();
        this.f14164k = new eh.p(z7Var, arrayList, new h3.x(this, 26));
        t80 t80Var = new t80();
        this.f14172s = t80Var;
        t80Var.f32711x = path;
        t80Var.j(4.0f);
        t80Var.f(org.telegram.ui.ActionBar.g6.l1(0.3f, -1), org.telegram.ui.ActionBar.g6.l1(0.1f, -1), org.telegram.ui.ActionBar.g6.l1(0.2f, -1), org.telegram.ui.ActionBar.g6.l1(0.7f, -1));
        t80Var.setCallback(z7Var);
    }

    public final int a(int i10) {
        int iDp;
        v7 v7Var = this.f14168o;
        int iDp2 = 0;
        if (v7Var != null) {
            iDp = AndroidUtilities.dp(8.0f) + v7Var.b();
        } else {
            iDp = 0;
        }
        v7 v7Var2 = this.f14169p;
        if (v7Var2 != null) {
            iDp2 = AndroidUtilities.dp(8.0f) + v7Var2.b();
        }
        int i11 = iDp + iDp2;
        StaticLayout staticLayout = this.f14159e;
        z7 z7Var = this.v;
        if (staticLayout == null) {
            return i10 - ((z7Var.B * 2) + this.f14165l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!z7Var.f14193b) {
            return i10 - ((z7Var.B * 2) + this.f14165l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * z7Var.f14194c.getFontMetricsInt(null))) - i11;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        z7 z7Var = this.v;
        a8 a8Var = z7Var.F;
        float fE = this.f14171r.e(this.f14170q);
        if (f10 <= 0.0f) {
            return;
        }
        float fLerp = AndroidUtilities.lerp(f10, 0.7f * f10, fE);
        if (fLerp >= 1.0f) {
            c(canvas, fE);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, a8Var.getWidth(), a8Var.getHeight(), (int) (fLerp * 255.0f), 31);
            c(canvas2, fE);
            canvas2.restore();
        }
        if (fE > 0.0f || this.f14170q) {
            int i10 = (int) (fE * 255.0f * fLerp);
            t80 t80Var = this.f14172s;
            t80Var.setAlpha(i10);
            t80Var.draw(canvas2);
            z7Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        z7 z7Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = z7Var.f14192a;
        a8 a8Var = z7Var.F;
        if (this.f14168o != null) {
            canvas.save();
            canvas.translate(z7Var.A, z7Var.B);
            v7 v7Var = this.f14168o;
            int width = z7Var.getWidth();
            int i12 = z7Var.A;
            v7Var.a(canvas, (width - i12) - i12);
            int iDp = AndroidUtilities.dp(8.0f) + this.f14168o.b();
            canvas.restore();
            i10 = iDp;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(z7Var.A, z7Var.B + i10);
        if (this.f14158c.f(canvas)) {
            z7Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        boolean z10 = f10 > 0.0f;
        this.f14173t.rewind();
        ArrayList arrayList3 = this.f14162i;
        if (arrayList3.isEmpty() && this.f14161g != null) {
            if (a8Var.S.y()) {
                canvas.save();
                canvas.translate(z7Var.A, z7Var.B + i10);
                a8Var.S.X(canvas);
                canvas.restore();
            }
            if (this.f14161g != null) {
                canvas.save();
                canvas.translate(z7Var.A, z7Var.B + i10);
                d(this.f14161g, canvas, arrayList3);
                org.telegram.ui.Components.p5 p5VarUpdate = org.telegram.ui.Components.t5.update(0, z7Var, this.f14160f, this.f14161g);
                this.f14160f = p5VarUpdate;
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f14161g, p5VarUpdate, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f14161g, z7Var.A, z7Var.B + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    w7[] w7VarArr = this.h;
                    if (i13 >= w7VarArr.length) {
                        break;
                    }
                    w7 w7Var = w7VarArr[i13];
                    if (w7Var == null) {
                        arrayList2 = arrayList;
                        i11 = i13;
                    } else {
                        canvas.save();
                        float f12 = w7Var.f14101c;
                        float f13 = w7Var.f14102e;
                        if (f12 != f13) {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float fLerp = AndroidUtilities.lerp(f12, f13, z7Var.f14200w);
                            float fLerp2 = AndroidUtilities.lerp(w7Var.d, w7Var.f14103f, er.f28123g.getInterpolation(z7Var.f14200w));
                            canvas.translate(z7Var.A + fLerp, z7Var.B + i10 + fLerp2);
                            if (z10) {
                                f(w7Var.f14100b, z7Var.A + fLerp, z7Var.B + i10 + fLerp2);
                            }
                            w7Var.f14100b.draw(canvas);
                            org.telegram.ui.Components.p5 p5VarUpdate2 = org.telegram.ui.Components.t5.update(0, z7Var, w7Var.f14099a, w7Var.f14100b);
                            w7Var.f14099a = p5VarUpdate2;
                            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, w7Var.f14100b, p5VarUpdate2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (z7Var.f14200w == f11) {
                            arrayList2 = arrayList;
                            i11 = i13;
                        } else {
                            canvas.translate(z7Var.A + f13, z7Var.B + i10 + w7Var.f14103f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, w7Var.f14100b.getWidth(), w7Var.f14100b.getHeight(), (int) (z7Var.f14200w * 255.0f), 31);
                            d(w7Var.f14100b, canvas, arrayList);
                            if (z10) {
                                f(w7Var.f14100b, z7Var.A + w7Var.f14102e, z7Var.B + i10 + w7Var.f14103f);
                            }
                            w7Var.f14100b.draw(canvas);
                            org.telegram.ui.Components.p5 p5VarUpdate3 = org.telegram.ui.Components.t5.update(0, z7Var, w7Var.f14099a, w7Var.f14100b);
                            w7Var.f14099a = p5VarUpdate3;
                            arrayList2 = arrayList;
                            i11 = i13;
                            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, w7Var.f14100b, p5VarUpdate3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, z7Var.f14200w, porterDuffColorFilter);
                            canvas.restore();
                        }
                        canvas.restore();
                    }
                    i13 = i11 + 1;
                    arrayList = arrayList2;
                    f11 = 0.0f;
                }
            }
        } else if (this.f14159e != null) {
            canvas.save();
            canvas.translate(z7Var.A, z7Var.B + i10);
            if (a8Var.S.y()) {
                a8Var.S.X(canvas);
            }
            d(this.f14159e, canvas, arrayList3);
            org.telegram.ui.Components.p5 p5VarUpdate4 = org.telegram.ui.Components.t5.update(0, z7Var, this.d, this.f14159e);
            this.d = p5VarUpdate4;
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f14159e, p5VarUpdate4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.f14159e, z7Var.A, z7Var.B + i10);
            }
        }
        if (this.f14169p != null) {
            canvas.save();
            canvas.translate(z7Var.A, (AndroidUtilities.lerp(this.f14166m, this.f14165l, z7Var.f14200w) + z7Var.B) - this.f14169p.b());
            v7 v7Var2 = this.f14169p;
            int width2 = z7Var.getWidth();
            int i14 = z7Var.A;
            v7Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            staticLayout.draw(canvas);
        } else {
            eh.k.g(this.v, false, -1, 0, this.f14174u, 0, staticLayout, arrayList, canvas, false);
        }
    }

    public final void e(int i10) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        z7 z7Var = this.v;
        a8 a8Var = z7Var.F;
        TextPaint textPaint = z7Var.d;
        y7[] y7VarArr = z7Var.f14198r;
        TextPaint textPaint2 = z7Var.f14194c;
        boolean zIsEmpty = TextUtils.isEmpty(this.f14167n);
        Stack stack = this.f14163j;
        ArrayList arrayList = this.f14162i;
        if (zIsEmpty) {
            this.f14159e = null;
            this.f14165l = 0;
            v7 v7Var = this.f14168o;
            if (v7Var != null) {
                this.f14165l = AndroidUtilities.dp(4.0f) + v7Var.b();
            }
            v7 v7Var2 = this.f14169p;
            if (v7Var2 != null) {
                this.f14165l = org.telegram.messenger.y1.C(4.0f, v7Var2.b(), this.f14165l);
            }
            this.f14166m = this.f14165l;
            if (this == y7VarArr[0]) {
                z7Var.v = null;
            }
            this.f14161g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout staticLayoutA = z7.a(z7Var, textPaint2, this.f14167n, i10);
        this.f14159e = staticLayoutA;
        this.f14165l = staticLayoutA.getHeight();
        v7 v7Var3 = this.f14168o;
        int iDp = v7Var3 != null ? AndroidUtilities.dp(8.0f) + v7Var3.b() : 0;
        v7 v7Var4 = this.f14169p;
        if (v7Var4 != null) {
            this.f14165l = org.telegram.messenger.y1.C(8.0f, v7Var4.b(), this.f14165l);
        }
        this.f14165l += iDp;
        float fMeasureText = textPaint2.measureText(" ");
        boolean z10 = this.f14159e.getLineCount() > 3;
        z7Var.f14193b = z10;
        if (z10 && this.f14159e.getLineCount() == 4) {
            staticLayout = null;
            if (TextUtils.getTrimmedLength(this.f14167n.subSequence(this.f14159e.getLineStart(2), this.f14159e.getLineEnd(2))) == 0) {
                z7Var.f14193b = false;
            }
        } else {
            staticLayout = null;
        }
        if (z7Var.f14193b) {
            float topPadding = this.f14159e.getTopPadding() + this.f14159e.getLineTop(2);
            if (this == y7VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                z7Var.v = z7.a(z7Var, textPaint, string, i10);
                z7Var.h = ((z7Var.B + iDp) + topPadding) - AndroidUtilities.dpf2(0.3f);
                z7Var.f14197n = (z7Var.A + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.f14159e.getTopPadding() + this.f14159e.getLineBottom(2);
            v7 v7Var5 = this.f14168o;
            int iDp2 = topPadding2 + (v7Var5 != null ? AndroidUtilities.dp(8.0f) + v7Var5.b() : 0);
            v7 v7Var6 = this.f14169p;
            this.f14166m = iDp2 + (v7Var6 != null ? AndroidUtilities.dp(8.0f) + v7Var6.b() : 0);
            this.f14161g = z7.a(z7Var, textPaint2, this.f14167n.subSequence(0, this.f14159e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            eh.k.c(a8Var, this.f14159e, stack, arrayList);
            float lineRight = this.f14159e.getLineRight(2) + fMeasureText;
            if (this.h != null) {
                int i11 = 0;
                while (true) {
                    w7[] w7VarArr = this.h;
                    if (i11 >= w7VarArr.length) {
                        break;
                    }
                    w7 w7Var = w7VarArr[i11];
                    if (w7Var != null) {
                        org.telegram.ui.Components.t5.release(a8Var, w7Var.f14099a);
                    }
                    i11++;
                }
            }
            this.h = new w7[this.f14159e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i12 = 3; i12 < this.f14159e.getLineCount(); i12++) {
                    int lineStart = this.f14159e.getLineStart(i12);
                    int lineEnd = this.f14159e.getLineEnd(i12);
                    CharSequence charSequenceSubSequence = this.f14167n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(charSequenceSubSequence)) {
                        this.h[i12 - 3] = staticLayout;
                    } else {
                        StaticLayout staticLayoutA2 = z7.a(z7Var, textPaint2, charSequenceSubSequence, i10);
                        w7 w7Var2 = new w7();
                        this.h[i12 - 3] = w7Var2;
                        w7Var2.f14100b = staticLayoutA2;
                        w7Var2.f14102e = this.f14159e.getLineLeft(i12);
                        w7Var2.f14103f = this.f14159e.getTopPadding() + this.f14159e.getLineTop(i12);
                        if (lineRight < z7Var.f14197n - AndroidUtilities.dp(16.0f)) {
                            w7Var2.d = topPadding;
                            w7Var2.f14101c = lineRight;
                            lineRight = Math.abs(staticLayoutA2.getLineRight(0) - staticLayoutA2.getLineLeft(0)) + fMeasureText + lineRight;
                        } else {
                            w7Var2.d = w7Var2.f14103f;
                            w7Var2.f14101c = w7Var2.f14102e;
                        }
                    }
                }
            }
        } else {
            if (this == y7VarArr[0]) {
                staticLayout2 = staticLayout;
                z7Var.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.f14161g = staticLayout2;
            this.f14166m = this.f14165l;
            stack.addAll(arrayList);
            arrayList.clear();
            eh.k.c(z7Var, this.f14159e, stack, arrayList);
        }
        int i13 = z7Var.A;
        int i14 = z7Var.B;
        eh.p pVar = this.f14164k;
        pVar.f5557c = i13;
        pVar.d = i14;
    }

    public final void f(Layout layout, float f10, float f11) {
        float lineTop = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            z7 z7Var = this.v;
            float f12 = lineLeft - (z7Var.A / 3.0f);
            float lineRight = (z7Var.A / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                lineTop = layout.getLineTop(i10) - (z7Var.B / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            float f13 = i10 >= layout.getLineCount() + (-1) ? (z7Var.B / 3.0f) + lineBottom : lineBottom;
            this.f14173t.addRect(f10 + f12, f11 + lineTop, f10 + lineRight, f11 + f13, Path.Direction.CW);
            i10++;
            lineTop = f13;
        }
    }

    public final void g(CharSequence charSequence, v7 v7Var, v7 v7Var2) {
        this.f14167n = charSequence;
        this.f14168o = v7Var;
        this.f14169p = v7Var2;
        z7 z7Var = this.v;
        if (v7Var != null) {
            x7 x7Var = new x7(this, 0);
            v7Var.f14073r = z7Var;
            v7Var.f14074s = x7Var;
            new gl0(z7Var);
            v7Var.f14065j.setCallback(z7Var);
            v7Var.h.f34810a = z7Var;
            v7Var.f14064i.f30944a = z7Var;
            v7Var.c();
        }
        v7 v7Var3 = this.f14169p;
        if (v7Var3 != null) {
            x7 x7Var2 = new x7(this, 1);
            v7Var3.f14073r = z7Var;
            v7Var3.f14074s = x7Var2;
            new gl0(z7Var);
            v7Var3.f14065j.setCallback(z7Var);
            v7Var3.h.f34810a = z7Var;
            v7Var3.f14064i.f30944a = z7Var;
            v7Var3.c();
        }
        z7Var.f14199s = 0;
        z7Var.requestLayout();
    }
}
