package lh;

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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.z80;
public final class y7 {
    public z80 f16422a;
    public org.telegram.ui.Components.y5 f16423b;
    public final v80 f16424c;
    public org.telegram.ui.Components.u5 d;
    public StaticLayout f16425e;
    public org.telegram.ui.Components.u5 f16426f;
    public StaticLayout f16427g;
    public w7[] h;
    public final ArrayList f16428i;
    public final Stack f16429j;
    public final gh.p f16430k;
    public int f16431l;
    public int f16432m;
    public CharSequence f16433n;
    public v7 f16434o;
    public v7 f16435p;
    public boolean f16436q;
    public final org.telegram.ui.Components.d6 f16437r;
    public final c90 f16438s;
    public final Path f16439t;
    public final AtomicReference f16440u;
    public final z7 v;

    public y7(z7 z7Var) {
        this.v = z7Var;
        this.f16424c = new v80(z7Var);
        ArrayList arrayList = new ArrayList();
        this.f16428i = arrayList;
        this.f16429j = new Stack();
        this.f16433n = "";
        this.f16437r = new org.telegram.ui.Components.d6(z7Var.F, 0L, 400L, jr.h);
        Path path = new Path();
        this.f16439t = path;
        this.f16440u = new AtomicReference();
        this.f16430k = new gh.p(z7Var, arrayList, new l4.s0(this, 8));
        c90 c90Var = new c90();
        this.f16438s = c90Var;
        c90Var.f27400x = path;
        c90Var.j(4.0f);
        c90Var.f(org.telegram.ui.ActionBar.g6.l1(0.3f, -1), org.telegram.ui.ActionBar.g6.l1(0.1f, -1), org.telegram.ui.ActionBar.g6.l1(0.2f, -1), org.telegram.ui.ActionBar.g6.l1(0.7f, -1));
        c90Var.setCallback(z7Var);
    }

    public final int a(int i10) {
        int i11;
        v7 v7Var = this.f16434o;
        int i12 = 0;
        if (v7Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + v7Var.b();
        } else {
            i11 = 0;
        }
        v7 v7Var2 = this.f16435p;
        if (v7Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + v7Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.f16425e;
        z7 z7Var = this.v;
        if (staticLayout == null) {
            return i10 - ((z7Var.B * 2) + this.f16431l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!z7Var.f16468b) {
            return i10 - ((z7Var.B * 2) + this.f16431l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * z7Var.f16469c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f9) {
        Canvas canvas2;
        z7 z7Var = this.v;
        a8 a8Var = z7Var.F;
        float e10 = this.f16437r.e(this.f16436q);
        if (f9 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f9, 0.7f * f9, e10);
            if (lerp >= 1.0f) {
                c(canvas, e10);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, a8Var.getWidth(), a8Var.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e10);
                canvas2.restore();
            }
            if (e10 <= 0.0f && !this.f16436q) {
                return;
            }
            c90 c90Var = this.f16438s;
            c90Var.setAlpha((int) (e10 * 255.0f * lerp));
            c90Var.draw(canvas2);
            z7Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f9) {
        int i10;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        z7 z7Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = z7Var.f16467a;
        a8 a8Var = z7Var.F;
        if (this.f16434o != null) {
            canvas.save();
            canvas.translate(z7Var.A, z7Var.B);
            v7 v7Var = this.f16434o;
            int width = z7Var.getWidth();
            int i12 = z7Var.A;
            v7Var.a(canvas, (width - i12) - i12);
            int b10 = this.f16434o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(z7Var.A, z7Var.B + i10);
        if (this.f16424c.f(canvas)) {
            z7Var.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f9 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16439t.rewind();
        ArrayList arrayList3 = this.f16428i;
        if (arrayList3.isEmpty() && this.f16427g != null) {
            if (a8Var.S.y()) {
                canvas.save();
                canvas.translate(z7Var.A, z7Var.B + i10);
                a8Var.S.X(canvas);
                canvas.restore();
            }
            if (this.f16427g != null) {
                canvas.save();
                canvas.translate(z7Var.A, z7Var.B + i10);
                d(this.f16427g, canvas, arrayList3);
                org.telegram.ui.Components.u5 update = org.telegram.ui.Components.y5.update(0, z7Var, this.f16426f, this.f16427g);
                this.f16426f = update;
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.f16427g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f16427g, z7Var.A, z7Var.B + i10);
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
                    if (w7Var != null) {
                        canvas.save();
                        float f11 = w7Var.f16371c;
                        float f12 = w7Var.f16372e;
                        if (f11 == f12) {
                            if (z7Var.f16475w != f10) {
                                canvas.translate(z7Var.A + f12, z7Var.B + i10 + w7Var.f16373f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, w7Var.f16370b.getWidth(), w7Var.f16370b.getHeight(), (int) (z7Var.f16475w * 255.0f), 31);
                                d(w7Var.f16370b, canvas, arrayList);
                                if (z10) {
                                    f(w7Var.f16370b, z7Var.A + w7Var.f16372e, z7Var.B + i10 + w7Var.f16373f);
                                }
                                w7Var.f16370b.draw(canvas);
                                org.telegram.ui.Components.u5 update2 = org.telegram.ui.Components.y5.update(0, z7Var, w7Var.f16369a, w7Var.f16370b);
                                w7Var.f16369a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, w7Var.f16370b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, z7Var.f16475w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, z7Var.f16475w);
                            float lerp2 = AndroidUtilities.lerp(w7Var.d, w7Var.f16373f, jr.f29801g.getInterpolation(z7Var.f16475w));
                            canvas.translate(z7Var.A + lerp, z7Var.B + i10 + lerp2);
                            if (z10) {
                                f(w7Var.f16370b, z7Var.A + lerp, z7Var.B + i10 + lerp2);
                            }
                            w7Var.f16370b.draw(canvas);
                            org.telegram.ui.Components.u5 update3 = org.telegram.ui.Components.y5.update(0, z7Var, w7Var.f16369a, w7Var.f16370b);
                            w7Var.f16369a = update3;
                            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, w7Var.f16370b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        }
                        canvas.restore();
                        i13 = i11 + 1;
                        arrayList = arrayList2;
                        f10 = 0.0f;
                    }
                    arrayList2 = arrayList;
                    i11 = i13;
                    i13 = i11 + 1;
                    arrayList = arrayList2;
                    f10 = 0.0f;
                }
            }
        } else if (this.f16425e != null) {
            canvas.save();
            canvas.translate(z7Var.A, z7Var.B + i10);
            if (a8Var.S.y()) {
                a8Var.S.X(canvas);
            }
            d(this.f16425e, canvas, arrayList3);
            org.telegram.ui.Components.u5 update4 = org.telegram.ui.Components.y5.update(0, z7Var, this.d, this.f16425e);
            this.d = update4;
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.f16425e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.f16425e, z7Var.A, z7Var.B + i10);
            }
        }
        if (this.f16435p != null) {
            canvas.save();
            canvas.translate(z7Var.A, (AndroidUtilities.lerp(this.f16432m, this.f16431l, z7Var.f16475w) + z7Var.B) - this.f16435p.b());
            v7 v7Var2 = this.f16435p;
            int width2 = z7Var.getWidth();
            int i14 = z7Var.A;
            v7Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            gh.k.g(this.v, false, -1, 0, this.f16440u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i10) {
        int i11;
        boolean z10;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        int i12;
        int i13;
        z7 z7Var = this.v;
        a8 a8Var = z7Var.F;
        TextPaint textPaint = z7Var.d;
        y7[] y7VarArr = z7Var.f16473r;
        TextPaint textPaint2 = z7Var.f16469c;
        boolean isEmpty = TextUtils.isEmpty(this.f16433n);
        Stack stack = this.f16429j;
        ArrayList arrayList = this.f16428i;
        if (isEmpty) {
            this.f16425e = null;
            this.f16431l = 0;
            v7 v7Var = this.f16434o;
            if (v7Var != null) {
                this.f16431l = AndroidUtilities.dp(4.0f) + v7Var.b();
            }
            v7 v7Var2 = this.f16435p;
            if (v7Var2 != null) {
                this.f16431l = org.telegram.messenger.x3.C(4.0f, v7Var2.b(), this.f16431l);
            }
            this.f16432m = this.f16431l;
            if (this == y7VarArr[0]) {
                z7Var.v = null;
            }
            this.f16427g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = z7.a(z7Var, textPaint2, this.f16433n, i10);
        this.f16425e = a2;
        this.f16431l = a2.getHeight();
        v7 v7Var3 = this.f16434o;
        if (v7Var3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + v7Var3.b();
        } else {
            i11 = 0;
        }
        v7 v7Var4 = this.f16435p;
        if (v7Var4 != null) {
            this.f16431l = org.telegram.messenger.x3.C(8.0f, v7Var4.b(), this.f16431l);
        }
        this.f16431l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.f16425e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        z7Var.f16468b = z10;
        if (z10) {
            if (this.f16425e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f16433n.subSequence(this.f16425e.getLineStart(2), this.f16425e.getLineEnd(2))) == 0) {
                    z7Var.f16468b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
        }
        if (z7Var.f16468b) {
            float topPadding = this.f16425e.getTopPadding() + this.f16425e.getLineTop(2);
            if (this == y7VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                z7Var.v = z7.a(z7Var, textPaint, string, i10);
                z7Var.h = ((z7Var.B + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                z7Var.f16472n = (z7Var.A + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.f16425e.getTopPadding() + this.f16425e.getLineBottom(2);
            v7 v7Var5 = this.f16434o;
            if (v7Var5 != null) {
                i12 = AndroidUtilities.dp(8.0f) + v7Var5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            v7 v7Var6 = this.f16435p;
            if (v7Var6 != null) {
                i13 = AndroidUtilities.dp(8.0f) + v7Var6.b();
            } else {
                i13 = 0;
            }
            this.f16432m = i14 + i13;
            this.f16427g = z7.a(z7Var, textPaint2, this.f16433n.subSequence(0, this.f16425e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            gh.k.c(a8Var, this.f16425e, stack, arrayList);
            float lineRight = this.f16425e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    w7[] w7VarArr = this.h;
                    if (i15 >= w7VarArr.length) {
                        break;
                    }
                    w7 w7Var = w7VarArr[i15];
                    if (w7Var != null) {
                        org.telegram.ui.Components.y5.release(a8Var, w7Var.f16369a);
                    }
                    i15++;
                }
            }
            this.h = new w7[this.f16425e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = 3; i16 < this.f16425e.getLineCount(); i16++) {
                    int lineStart = this.f16425e.getLineStart(i16);
                    int lineEnd = this.f16425e.getLineEnd(i16);
                    CharSequence subSequence = this.f16433n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = z7.a(z7Var, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f16370b = a10;
                        obj.f16372e = this.f16425e.getLineLeft(i16);
                        obj.f16373f = this.f16425e.getTopPadding() + this.f16425e.getLineTop(i16);
                        if (lineRight < z7Var.f16472n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f16371c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f16373f;
                            obj.f16371c = obj.f16372e;
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
            this.f16427g = staticLayout2;
            this.f16432m = this.f16431l;
            stack.addAll(arrayList);
            arrayList.clear();
            gh.k.c(z7Var, this.f16425e, stack, arrayList);
        }
        int i17 = z7Var.A;
        int i18 = z7Var.B;
        gh.p pVar = this.f16430k;
        pVar.f7449c = i17;
        pVar.d = i18;
    }

    public final void f(Layout layout, float f9, float f10) {
        float f11;
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            z7 z7Var = this.v;
            float f13 = lineLeft - (z7Var.A / 3.0f);
            float lineRight = (z7Var.A / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f12 = layout.getLineTop(i10) - (z7Var.B / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            if (i10 >= layout.getLineCount() - 1) {
                f11 = (z7Var.B / 3.0f) + lineBottom;
            } else {
                f11 = lineBottom;
            }
            this.f16439t.addRect(f9 + f13, f10 + f12, f9 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, v7 v7Var, v7 v7Var2) {
        this.f16433n = charSequence;
        this.f16434o = v7Var;
        this.f16435p = v7Var2;
        z7 z7Var = this.v;
        if (v7Var != null) {
            x7 x7Var = new x7(this, 0);
            v7Var.f16338r = z7Var;
            v7Var.f16339s = x7Var;
            new ql0(z7Var);
            v7Var.f16330j.setCallback(z7Var);
            v7Var.h.f27664a = z7Var;
            v7Var.f16329i.f33187a = z7Var;
            v7Var.c();
        }
        v7 v7Var3 = this.f16435p;
        if (v7Var3 != null) {
            x7 x7Var2 = new x7(this, 1);
            v7Var3.f16338r = z7Var;
            v7Var3.f16339s = x7Var2;
            new ql0(z7Var);
            v7Var3.f16330j.setCallback(z7Var);
            v7Var3.h.f27664a = z7Var;
            v7Var3.f16329i.f33187a = z7Var;
            v7Var3.c();
        }
        z7Var.f16474s = 0;
        z7Var.requestLayout();
    }
}
