package ci;

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
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.y90;
public final class p8 {
    public y90 f5731a;
    public org.telegram.ui.Components.a6 f5732b;
    public final u90 f5733c;
    public org.telegram.ui.Components.w5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.w5 f5734f;
    public StaticLayout f5735g;
    public n8[] h;
    public final ArrayList f5736i;
    public final Stack f5737j;
    public final wh.l f5738k;
    public int f5739l;
    public int f5740m;
    public CharSequence f5741n;
    public m8 f5742o;
    public m8 f5743p;
    public boolean f5744q;
    public final org.telegram.ui.Components.f6 f5745r;
    public final ba0 f5746s;
    public final Path f5747t;
    public final AtomicReference f5748u;
    public final q8 v;

    public p8(q8 q8Var) {
        this.v = q8Var;
        this.f5733c = new u90(q8Var);
        ArrayList arrayList = new ArrayList();
        this.f5736i = arrayList;
        this.f5737j = new Stack();
        this.f5741n = "";
        this.f5745r = new org.telegram.ui.Components.f6(q8Var.J, 0L, 400L, bs.h);
        Path path = new Path();
        this.f5747t = path;
        this.f5748u = new AtomicReference();
        this.f5738k = new wh.l(q8Var, arrayList, new a1.c(this, 20));
        ba0 ba0Var = new ba0();
        this.f5746s = ba0Var;
        ba0Var.f24910y = path;
        ba0Var.k(4.0f);
        ba0Var.g(org.telegram.ui.ActionBar.h6.m1(0.3f, -1), org.telegram.ui.ActionBar.h6.m1(0.1f, -1), org.telegram.ui.ActionBar.h6.m1(0.2f, -1), org.telegram.ui.ActionBar.h6.m1(0.7f, -1));
        ba0Var.setCallback(q8Var);
    }

    public final int a(int i10) {
        int i11;
        m8 m8Var = this.f5742o;
        int i12 = 0;
        if (m8Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + m8Var.b();
        } else {
            i11 = 0;
        }
        m8 m8Var2 = this.f5743p;
        if (m8Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + m8Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        q8 q8Var = this.v;
        if (staticLayout == null) {
            return i10 - ((q8Var.F * 2) + this.f5739l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!q8Var.f5795b) {
            return i10 - ((q8Var.F * 2) + this.f5739l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * q8Var.f5796c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        q8 q8Var = this.v;
        r8 r8Var = q8Var.J;
        float e = this.f5745r.e(this.f5744q);
        if (f7 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f7, 0.7f * f7, e);
            if (lerp >= 1.0f) {
                c(canvas, e);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, r8Var.getWidth(), r8Var.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e);
                canvas2.restore();
            }
            if (e <= 0.0f && !this.f5744q) {
                return;
            }
            ba0 ba0Var = this.f5746s;
            ba0Var.setAlpha((int) (e * 255.0f * lerp));
            ba0Var.draw(canvas2);
            q8Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        q8 q8Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = q8Var.f5794a;
        r8 r8Var = q8Var.J;
        if (this.f5742o != null) {
            canvas.save();
            canvas.translate(q8Var.E, q8Var.F);
            m8 m8Var = this.f5742o;
            int width = q8Var.getWidth();
            int i12 = q8Var.E;
            m8Var.a(canvas, (width - i12) - i12);
            int b10 = this.f5742o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(q8Var.E, q8Var.F + i10);
        if (this.f5733c.f(canvas)) {
            q8Var.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5747t.rewind();
        ArrayList arrayList3 = this.f5736i;
        if (arrayList3.isEmpty() && this.f5735g != null) {
            if (r8Var.W.x()) {
                canvas.save();
                canvas.translate(q8Var.E, q8Var.F + i10);
                r8Var.W.W(canvas);
                canvas.restore();
            }
            if (this.f5735g != null) {
                canvas.save();
                canvas.translate(q8Var.E, q8Var.F + i10);
                d(this.f5735g, canvas, arrayList3);
                org.telegram.ui.Components.w5 update = org.telegram.ui.Components.a6.update(0, q8Var, this.f5734f, this.f5735g);
                this.f5734f = update;
                org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, this.f5735g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f5735g, q8Var.E, q8Var.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    n8[] n8VarArr = this.h;
                    if (i13 >= n8VarArr.length) {
                        break;
                    }
                    n8 n8Var = n8VarArr[i13];
                    if (n8Var != null) {
                        canvas.save();
                        float f11 = n8Var.f5605c;
                        float f12 = n8Var.e;
                        if (f11 == f12) {
                            if (q8Var.f5801w != f10) {
                                canvas.translate(q8Var.E + f12, q8Var.F + i10 + n8Var.f5606f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, n8Var.f5604b.getWidth(), n8Var.f5604b.getHeight(), (int) (q8Var.f5801w * 255.0f), 31);
                                d(n8Var.f5604b, canvas, arrayList);
                                if (z10) {
                                    f(n8Var.f5604b, q8Var.E + n8Var.e, q8Var.F + i10 + n8Var.f5606f);
                                }
                                n8Var.f5604b.draw(canvas);
                                org.telegram.ui.Components.w5 update2 = org.telegram.ui.Components.a6.update(0, q8Var, n8Var.f5603a, n8Var.f5604b);
                                n8Var.f5603a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, n8Var.f5604b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, q8Var.f5801w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, q8Var.f5801w);
                            float lerp2 = AndroidUtilities.lerp(n8Var.d, n8Var.f5606f, bs.f25031g.getInterpolation(q8Var.f5801w));
                            canvas.translate(q8Var.E + lerp, q8Var.F + i10 + lerp2);
                            if (z10) {
                                f(n8Var.f5604b, q8Var.E + lerp, q8Var.F + i10 + lerp2);
                            }
                            n8Var.f5604b.draw(canvas);
                            org.telegram.ui.Components.w5 update3 = org.telegram.ui.Components.a6.update(0, q8Var, n8Var.f5603a, n8Var.f5604b);
                            n8Var.f5603a = update3;
                            org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, n8Var.f5604b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        } else if (this.e != null) {
            canvas.save();
            canvas.translate(q8Var.E, q8Var.F + i10);
            if (r8Var.W.x()) {
                r8Var.W.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.w5 update4 = org.telegram.ui.Components.a6.update(0, q8Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, q8Var.E, q8Var.F + i10);
            }
        }
        if (this.f5743p != null) {
            canvas.save();
            canvas.translate(q8Var.E, (AndroidUtilities.lerp(this.f5740m, this.f5739l, q8Var.f5801w) + q8Var.F) - this.f5743p.b());
            m8 m8Var2 = this.f5743p;
            int width2 = q8Var.getWidth();
            int i14 = q8Var.E;
            m8Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            wh.g.g(this.v, false, -1, 0, this.f5748u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i10) {
        int i11;
        boolean z10;
        StaticLayout staticLayout;
        int i12;
        StaticLayout staticLayout2;
        int i13;
        int i14;
        q8 q8Var = this.v;
        r8 r8Var = q8Var.J;
        TextPaint textPaint = q8Var.d;
        p8[] p8VarArr = q8Var.f5799r;
        TextPaint textPaint2 = q8Var.f5796c;
        boolean isEmpty = TextUtils.isEmpty(this.f5741n);
        Stack stack = this.f5737j;
        ArrayList arrayList = this.f5736i;
        if (isEmpty) {
            this.e = null;
            this.f5739l = 0;
            m8 m8Var = this.f5742o;
            if (m8Var != null) {
                this.f5739l = AndroidUtilities.dp(4.0f) + m8Var.b();
            }
            m8 m8Var2 = this.f5743p;
            if (m8Var2 != null) {
                this.f5739l = org.telegram.messenger.g0.C(4.0f, m8Var2.b(), this.f5739l);
            }
            this.f5740m = this.f5739l;
            if (this == p8VarArr[0]) {
                q8Var.v = null;
            }
            this.f5735g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = q8.a(q8Var, textPaint2, this.f5741n, i10);
        this.e = a2;
        this.f5739l = a2.getHeight();
        m8 m8Var3 = this.f5742o;
        if (m8Var3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + m8Var3.b();
        } else {
            i11 = 0;
        }
        m8 m8Var4 = this.f5743p;
        if (m8Var4 != null) {
            this.f5739l = org.telegram.messenger.g0.C(8.0f, m8Var4.b(), this.f5739l);
        }
        this.f5739l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        q8Var.f5795b = z10;
        if (z10) {
            i12 = 3;
            if (this.e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f5741n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    q8Var.f5795b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
            i12 = 3;
        }
        if (q8Var.f5795b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == p8VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                q8Var.v = q8.a(q8Var, textPaint, string, i10);
                q8Var.h = ((q8Var.F + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                q8Var.f5798n = (q8Var.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            m8 m8Var5 = this.f5742o;
            if (m8Var5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + m8Var5.b();
            } else {
                i13 = 0;
            }
            int i15 = topPadding2 + i13;
            m8 m8Var6 = this.f5743p;
            if (m8Var6 != null) {
                i14 = AndroidUtilities.dp(8.0f) + m8Var6.b();
            } else {
                i14 = 0;
            }
            this.f5740m = i15 + i14;
            this.f5735g = q8.a(q8Var, textPaint2, this.f5741n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            wh.g.c(r8Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i16 = 0;
                while (true) {
                    n8[] n8VarArr = this.h;
                    if (i16 >= n8VarArr.length) {
                        break;
                    }
                    n8 n8Var = n8VarArr[i16];
                    if (n8Var != null) {
                        org.telegram.ui.Components.a6.release(r8Var, n8Var.f5603a);
                    }
                    i16++;
                }
            }
            this.h = new n8[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i17 = i12; i17 < this.e.getLineCount(); i17++) {
                    int lineStart = this.e.getLineStart(i17);
                    int lineEnd = this.e.getLineEnd(i17);
                    CharSequence subSequence = this.f5741n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i17 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = q8.a(q8Var, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i17 - 3] = obj;
                        obj.f5604b = a10;
                        obj.e = this.e.getLineLeft(i17);
                        obj.f5606f = this.e.getTopPadding() + this.e.getLineTop(i17);
                        if (lineRight < q8Var.f5798n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f5605c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f5606f;
                            obj.f5605c = obj.e;
                        }
                    }
                }
            }
        } else {
            if (this == p8VarArr[0]) {
                staticLayout2 = staticLayout;
                q8Var.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.f5735g = staticLayout2;
            this.f5740m = this.f5739l;
            stack.addAll(arrayList);
            arrayList.clear();
            wh.g.c(q8Var, this.e, stack, arrayList);
        }
        int i18 = q8Var.E;
        int i19 = q8Var.F;
        wh.l lVar = this.f5738k;
        lVar.f49090c = i18;
        lVar.d = i19;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11;
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            q8 q8Var = this.v;
            float f13 = lineLeft - (q8Var.E / 3.0f);
            float lineRight = (q8Var.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f12 = layout.getLineTop(i10) - (q8Var.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            if (i10 >= layout.getLineCount() - 1) {
                f11 = (q8Var.F / 3.0f) + lineBottom;
            } else {
                f11 = lineBottom;
            }
            this.f5747t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, m8 m8Var, m8 m8Var2) {
        this.f5741n = charSequence;
        this.f5742o = m8Var;
        this.f5743p = m8Var2;
        q8 q8Var = this.v;
        if (m8Var != null) {
            o8 o8Var = new o8(this, 0);
            m8Var.f5574r = q8Var;
            m8Var.f5575s = o8Var;
            new pm0(q8Var);
            m8Var.f5566j.setCallback(q8Var);
            m8Var.h.f26091a = q8Var;
            m8Var.f5565i.f32601a = q8Var;
            m8Var.c();
        }
        m8 m8Var3 = this.f5743p;
        if (m8Var3 != null) {
            o8 o8Var2 = new o8(this, 1);
            m8Var3.f5574r = q8Var;
            m8Var3.f5575s = o8Var2;
            new pm0(q8Var);
            m8Var3.f5566j.setCallback(q8Var);
            m8Var3.h.f26091a = q8Var;
            m8Var3.f5565i.f32601a = q8Var;
            m8Var3.c();
        }
        q8Var.f5800s = 0;
        q8Var.requestLayout();
    }
}
