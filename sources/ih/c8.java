package ih;

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
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.p80;
public final class c8 {
    public m80 f11293a;
    public org.telegram.ui.Components.t5 f11294b;
    public final i80 f11295c;
    public org.telegram.ui.Components.p5 d;
    public StaticLayout f11296e;
    public org.telegram.ui.Components.p5 f11297f;
    public StaticLayout f11298g;
    public a8[] h;
    public final ArrayList f11299i;
    public final Stack f11300j;
    public final dh.r f11301k;
    public int f11302l;
    public int f11303m;
    public CharSequence f11304n;
    public z7 f11305o;
    public z7 f11306p;
    public boolean f11307q;
    public final org.telegram.ui.Components.y5 f11308r;
    public final p80 f11309s;
    public final Path f11310t;
    public final AtomicReference f11311u;
    public final d8 v;

    public c8(d8 d8Var) {
        this.v = d8Var;
        this.f11295c = new i80(d8Var);
        ArrayList arrayList = new ArrayList();
        this.f11299i = arrayList;
        this.f11300j = new Stack();
        this.f11304n = "";
        this.f11308r = new org.telegram.ui.Components.y5(d8Var.F, 0L, 400L, gr.h);
        Path path = new Path();
        this.f11310t = path;
        this.f11311u = new AtomicReference();
        this.f11301k = new dh.r(d8Var, arrayList, new gh.i3(this, 25));
        p80 p80Var = new p80();
        this.f11309s = p80Var;
        p80Var.f31591x = path;
        p80Var.j(4.0f);
        p80Var.f(org.telegram.ui.ActionBar.f6.l1(0.3f, -1), org.telegram.ui.ActionBar.f6.l1(0.1f, -1), org.telegram.ui.ActionBar.f6.l1(0.2f, -1), org.telegram.ui.ActionBar.f6.l1(0.7f, -1));
        p80Var.setCallback(d8Var);
    }

    public final int a(int i9) {
        int i10;
        z7 z7Var = this.f11305o;
        int i11 = 0;
        if (z7Var != null) {
            i10 = AndroidUtilities.dp(8.0f) + z7Var.b();
        } else {
            i10 = 0;
        }
        z7 z7Var2 = this.f11306p;
        if (z7Var2 != null) {
            i11 = AndroidUtilities.dp(8.0f) + z7Var2.b();
        }
        int i12 = i10 + i11;
        StaticLayout staticLayout = this.f11296e;
        d8 d8Var = this.v;
        if (staticLayout == null) {
            return i9 - ((d8Var.B * 2) + this.f11302l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!d8Var.f11331b) {
            return i9 - ((d8Var.B * 2) + this.f11302l);
        }
        return (i9 - ((Math.min(3, lineCount) + 1) * d8Var.f11332c.getFontMetricsInt(null))) - i12;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        d8 d8Var = this.v;
        e8 e8Var = d8Var.F;
        float e10 = this.f11308r.e(this.f11307q);
        if (f10 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f10, 0.7f * f10, e10);
            if (lerp >= 1.0f) {
                c(canvas, e10);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, e8Var.getWidth(), e8Var.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e10);
                canvas2.restore();
            }
            if (e10 <= 0.0f && !this.f11307q) {
                return;
            }
            p80 p80Var = this.f11309s;
            p80Var.setAlpha((int) (e10 * 255.0f * lerp));
            p80Var.draw(canvas2);
            d8Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i9;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        d8 d8Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = d8Var.f11330a;
        e8 e8Var = d8Var.F;
        if (this.f11305o != null) {
            canvas.save();
            canvas.translate(d8Var.A, d8Var.B);
            z7 z7Var = this.f11305o;
            int width = d8Var.getWidth();
            int i11 = d8Var.A;
            z7Var.a(canvas, (width - i11) - i11);
            int b10 = this.f11305o.b();
            canvas.restore();
            i9 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i9 = 0;
        }
        canvas.save();
        canvas.translate(d8Var.A, d8Var.B + i9);
        if (this.f11295c.f(canvas)) {
            d8Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11310t.rewind();
        ArrayList arrayList3 = this.f11299i;
        if (arrayList3.isEmpty() && this.f11298g != null) {
            if (e8Var.S.y()) {
                canvas.save();
                canvas.translate(d8Var.A, d8Var.B + i9);
                e8Var.S.X(canvas);
                canvas.restore();
            }
            if (this.f11298g != null) {
                canvas.save();
                canvas.translate(d8Var.A, d8Var.B + i9);
                d(this.f11298g, canvas, arrayList3);
                org.telegram.ui.Components.p5 update = org.telegram.ui.Components.t5.update(0, d8Var, this.f11297f, this.f11298g);
                this.f11297f = update;
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f11298g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f11298g, d8Var.A, d8Var.B + i9);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    a8[] a8VarArr = this.h;
                    if (i12 >= a8VarArr.length) {
                        break;
                    }
                    a8 a8Var = a8VarArr[i12];
                    if (a8Var != null) {
                        canvas.save();
                        float f12 = a8Var.f11233c;
                        float f13 = a8Var.f11234e;
                        if (f12 == f13) {
                            if (d8Var.f11338w != f11) {
                                canvas.translate(d8Var.A + f13, d8Var.B + i9 + a8Var.f11235f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, a8Var.f11232b.getWidth(), a8Var.f11232b.getHeight(), (int) (d8Var.f11338w * 255.0f), 31);
                                d(a8Var.f11232b, canvas, arrayList);
                                if (z10) {
                                    f(a8Var.f11232b, d8Var.A + a8Var.f11234e, d8Var.B + i9 + a8Var.f11235f);
                                }
                                a8Var.f11232b.draw(canvas);
                                org.telegram.ui.Components.p5 update2 = org.telegram.ui.Components.t5.update(0, d8Var, a8Var.f11231a, a8Var.f11232b);
                                a8Var.f11231a = update2;
                                arrayList2 = arrayList;
                                i10 = i12;
                                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, a8Var.f11232b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, d8Var.f11338w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i10 = i12;
                            float lerp = AndroidUtilities.lerp(f12, f13, d8Var.f11338w);
                            float lerp2 = AndroidUtilities.lerp(a8Var.d, a8Var.f11235f, gr.f28845g.getInterpolation(d8Var.f11338w));
                            canvas.translate(d8Var.A + lerp, d8Var.B + i9 + lerp2);
                            if (z10) {
                                f(a8Var.f11232b, d8Var.A + lerp, d8Var.B + i9 + lerp2);
                            }
                            a8Var.f11232b.draw(canvas);
                            org.telegram.ui.Components.p5 update3 = org.telegram.ui.Components.t5.update(0, d8Var, a8Var.f11231a, a8Var.f11232b);
                            a8Var.f11231a = update3;
                            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, a8Var.f11232b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        } else if (this.f11296e != null) {
            canvas.save();
            canvas.translate(d8Var.A, d8Var.B + i9);
            if (e8Var.S.y()) {
                e8Var.S.X(canvas);
            }
            d(this.f11296e, canvas, arrayList3);
            org.telegram.ui.Components.p5 update4 = org.telegram.ui.Components.t5.update(0, d8Var, this.d, this.f11296e);
            this.d = update4;
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f11296e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.f11296e, d8Var.A, d8Var.B + i9);
            }
        }
        if (this.f11306p != null) {
            canvas.save();
            canvas.translate(d8Var.A, (AndroidUtilities.lerp(this.f11303m, this.f11302l, d8Var.f11338w) + d8Var.B) - this.f11306p.b());
            z7 z7Var2 = this.f11306p;
            int width2 = d8Var.getWidth();
            int i13 = d8Var.A;
            z7Var2.a(canvas, (width2 - i13) - i13);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            dh.l.g(this.v, false, -1, 0, this.f11311u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i9) {
        int i10;
        boolean z10;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        int i11;
        int i12;
        d8 d8Var = this.v;
        e8 e8Var = d8Var.F;
        TextPaint textPaint = d8Var.d;
        c8[] c8VarArr = d8Var.f11336r;
        TextPaint textPaint2 = d8Var.f11332c;
        boolean isEmpty = TextUtils.isEmpty(this.f11304n);
        Stack stack = this.f11300j;
        ArrayList arrayList = this.f11299i;
        if (isEmpty) {
            this.f11296e = null;
            this.f11302l = 0;
            z7 z7Var = this.f11305o;
            if (z7Var != null) {
                this.f11302l = AndroidUtilities.dp(4.0f) + z7Var.b();
            }
            z7 z7Var2 = this.f11306p;
            if (z7Var2 != null) {
                this.f11302l = org.telegram.messenger.l0.C(4.0f, z7Var2.b(), this.f11302l);
            }
            this.f11303m = this.f11302l;
            if (this == c8VarArr[0]) {
                d8Var.v = null;
            }
            this.f11298g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = d8.a(d8Var, textPaint2, this.f11304n, i9);
        this.f11296e = a2;
        this.f11302l = a2.getHeight();
        z7 z7Var3 = this.f11305o;
        if (z7Var3 != null) {
            i10 = AndroidUtilities.dp(8.0f) + z7Var3.b();
        } else {
            i10 = 0;
        }
        z7 z7Var4 = this.f11306p;
        if (z7Var4 != null) {
            this.f11302l = org.telegram.messenger.l0.C(8.0f, z7Var4.b(), this.f11302l);
        }
        this.f11302l += i10;
        float measureText = textPaint2.measureText(" ");
        if (this.f11296e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        d8Var.f11331b = z10;
        if (z10) {
            if (this.f11296e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f11304n.subSequence(this.f11296e.getLineStart(2), this.f11296e.getLineEnd(2))) == 0) {
                    d8Var.f11331b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
        }
        if (d8Var.f11331b) {
            float topPadding = this.f11296e.getTopPadding() + this.f11296e.getLineTop(2);
            if (this == c8VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                d8Var.v = d8.a(d8Var, textPaint, string, i9);
                d8Var.h = ((d8Var.B + i10) + topPadding) - AndroidUtilities.dpf2(0.3f);
                d8Var.f11335n = (d8Var.A + i9) - textPaint.measureText(string);
            }
            int topPadding2 = this.f11296e.getTopPadding() + this.f11296e.getLineBottom(2);
            z7 z7Var5 = this.f11305o;
            if (z7Var5 != null) {
                i11 = AndroidUtilities.dp(8.0f) + z7Var5.b();
            } else {
                i11 = 0;
            }
            int i13 = topPadding2 + i11;
            z7 z7Var6 = this.f11306p;
            if (z7Var6 != null) {
                i12 = AndroidUtilities.dp(8.0f) + z7Var6.b();
            } else {
                i12 = 0;
            }
            this.f11303m = i13 + i12;
            this.f11298g = d8.a(d8Var, textPaint2, this.f11304n.subSequence(0, this.f11296e.getLineEnd(2)), i9);
            stack.addAll(arrayList);
            arrayList.clear();
            dh.l.c(e8Var, this.f11296e, stack, arrayList);
            float lineRight = this.f11296e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i14 = 0;
                while (true) {
                    a8[] a8VarArr = this.h;
                    if (i14 >= a8VarArr.length) {
                        break;
                    }
                    a8 a8Var = a8VarArr[i14];
                    if (a8Var != null) {
                        org.telegram.ui.Components.t5.release(e8Var, a8Var.f11231a);
                    }
                    i14++;
                }
            }
            this.h = new a8[this.f11296e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i15 = 3; i15 < this.f11296e.getLineCount(); i15++) {
                    int lineStart = this.f11296e.getLineStart(i15);
                    int lineEnd = this.f11296e.getLineEnd(i15);
                    CharSequence subSequence = this.f11304n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i15 - 3] = staticLayout;
                    } else {
                        StaticLayout a3 = d8.a(d8Var, textPaint2, subSequence, i9);
                        ?? obj = new Object();
                        this.h[i15 - 3] = obj;
                        obj.f11232b = a3;
                        obj.f11234e = this.f11296e.getLineLeft(i15);
                        obj.f11235f = this.f11296e.getTopPadding() + this.f11296e.getLineTop(i15);
                        if (lineRight < d8Var.f11335n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f11233c = lineRight;
                            lineRight = Math.abs(a3.getLineRight(0) - a3.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f11235f;
                            obj.f11233c = obj.f11234e;
                        }
                    }
                }
            }
        } else {
            if (this == c8VarArr[0]) {
                staticLayout2 = staticLayout;
                d8Var.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.f11298g = staticLayout2;
            this.f11303m = this.f11302l;
            stack.addAll(arrayList);
            arrayList.clear();
            dh.l.c(d8Var, this.f11296e, stack, arrayList);
        }
        int i16 = d8Var.A;
        int i17 = d8Var.B;
        dh.r rVar = this.f11301k;
        rVar.f4661c = i16;
        rVar.d = i17;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12;
        float f13 = 0.0f;
        int i9 = 0;
        while (i9 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i9);
            d8 d8Var = this.v;
            float f14 = lineLeft - (d8Var.A / 3.0f);
            float lineRight = (d8Var.A / 3.0f) + layout.getLineRight(i9);
            if (i9 == 0) {
                f13 = layout.getLineTop(i9) - (d8Var.B / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i9);
            if (i9 >= layout.getLineCount() - 1) {
                f12 = (d8Var.B / 3.0f) + lineBottom;
            } else {
                f12 = lineBottom;
            }
            this.f11310t.addRect(f10 + f14, f11 + f13, f10 + lineRight, f11 + f12, Path.Direction.CW);
            i9++;
            f13 = f12;
        }
    }

    public final void g(CharSequence charSequence, z7 z7Var, z7 z7Var2) {
        this.f11304n = charSequence;
        this.f11305o = z7Var;
        this.f11306p = z7Var2;
        d8 d8Var = this.v;
        if (z7Var != null) {
            b8 b8Var = new b8(this, 0);
            z7Var.f12396r = d8Var;
            z7Var.f12397s = b8Var;
            new dl0(d8Var);
            z7Var.f12388j.setCallback(d8Var);
            z7Var.h.f34852a = d8Var;
            z7Var.f12387i.f31606a = d8Var;
            z7Var.c();
        }
        z7 z7Var3 = this.f11306p;
        if (z7Var3 != null) {
            b8 b8Var2 = new b8(this, 1);
            z7Var3.f12396r = d8Var;
            z7Var3.f12397s = b8Var2;
            new dl0(d8Var);
            z7Var3.f12388j.setCallback(d8Var);
            z7Var3.h.f34852a = d8Var;
            z7Var3.f12387i.f31606a = d8Var;
            z7Var3.c();
        }
        d8Var.f11337s = 0;
        d8Var.requestLayout();
    }
}
