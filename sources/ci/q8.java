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
public final class q8 {
    public y90 f5851a;
    public org.telegram.ui.Components.a6 f5852b;
    public final u90 f5853c;
    public org.telegram.ui.Components.w5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.w5 f5854f;
    public StaticLayout f5855g;
    public o8[] h;
    public final ArrayList f5856i;
    public final Stack f5857j;
    public final wh.l f5858k;
    public int f5859l;
    public int f5860m;
    public CharSequence f5861n;
    public n8 f5862o;
    public n8 f5863p;
    public boolean f5864q;
    public final org.telegram.ui.Components.f6 f5865r;
    public final ba0 f5866s;
    public final Path f5867t;
    public final AtomicReference f5868u;
    public final r8 v;

    public q8(r8 r8Var) {
        this.v = r8Var;
        this.f5853c = new u90(r8Var);
        ArrayList arrayList = new ArrayList();
        this.f5856i = arrayList;
        this.f5857j = new Stack();
        this.f5861n = "";
        this.f5865r = new org.telegram.ui.Components.f6(r8Var.J, 0L, 400L, bs.h);
        Path path = new Path();
        this.f5867t = path;
        this.f5868u = new AtomicReference();
        this.f5858k = new wh.l(r8Var, arrayList, new a1.c(this, 20));
        ba0 ba0Var = new ba0();
        this.f5866s = ba0Var;
        ba0Var.f24917y = path;
        ba0Var.k(4.0f);
        ba0Var.g(org.telegram.ui.ActionBar.h6.m1(0.3f, -1), org.telegram.ui.ActionBar.h6.m1(0.1f, -1), org.telegram.ui.ActionBar.h6.m1(0.2f, -1), org.telegram.ui.ActionBar.h6.m1(0.7f, -1));
        ba0Var.setCallback(r8Var);
    }

    public final int a(int i10) {
        int i11;
        n8 n8Var = this.f5862o;
        int i12 = 0;
        if (n8Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + n8Var.b();
        } else {
            i11 = 0;
        }
        n8 n8Var2 = this.f5863p;
        if (n8Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + n8Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        r8 r8Var = this.v;
        if (staticLayout == null) {
            return i10 - ((r8Var.F * 2) + this.f5859l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!r8Var.f5932b) {
            return i10 - ((r8Var.F * 2) + this.f5859l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * r8Var.f5933c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        r8 r8Var = this.v;
        s8 s8Var = r8Var.J;
        float e = this.f5865r.e(this.f5864q);
        if (f7 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f7, 0.7f * f7, e);
            if (lerp >= 1.0f) {
                c(canvas, e);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, s8Var.getWidth(), s8Var.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e);
                canvas2.restore();
            }
            if (e <= 0.0f && !this.f5864q) {
                return;
            }
            ba0 ba0Var = this.f5866s;
            ba0Var.setAlpha((int) (e * 255.0f * lerp));
            ba0Var.draw(canvas2);
            r8Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        r8 r8Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = r8Var.f5931a;
        s8 s8Var = r8Var.J;
        if (this.f5862o != null) {
            canvas.save();
            canvas.translate(r8Var.E, r8Var.F);
            n8 n8Var = this.f5862o;
            int width = r8Var.getWidth();
            int i12 = r8Var.E;
            n8Var.a(canvas, (width - i12) - i12);
            int b10 = this.f5862o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(r8Var.E, r8Var.F + i10);
        if (this.f5853c.f(canvas)) {
            r8Var.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5867t.rewind();
        ArrayList arrayList3 = this.f5856i;
        if (arrayList3.isEmpty() && this.f5855g != null) {
            if (s8Var.W.x()) {
                canvas.save();
                canvas.translate(r8Var.E, r8Var.F + i10);
                s8Var.W.W(canvas);
                canvas.restore();
            }
            if (this.f5855g != null) {
                canvas.save();
                canvas.translate(r8Var.E, r8Var.F + i10);
                d(this.f5855g, canvas, arrayList3);
                org.telegram.ui.Components.w5 update = org.telegram.ui.Components.a6.update(0, r8Var, this.f5854f, this.f5855g);
                this.f5854f = update;
                org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, this.f5855g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f5855g, r8Var.E, r8Var.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    o8[] o8VarArr = this.h;
                    if (i13 >= o8VarArr.length) {
                        break;
                    }
                    o8 o8Var = o8VarArr[i13];
                    if (o8Var != null) {
                        canvas.save();
                        float f11 = o8Var.f5705c;
                        float f12 = o8Var.e;
                        if (f11 == f12) {
                            if (r8Var.f5938w != f10) {
                                canvas.translate(r8Var.E + f12, r8Var.F + i10 + o8Var.f5706f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, o8Var.f5704b.getWidth(), o8Var.f5704b.getHeight(), (int) (r8Var.f5938w * 255.0f), 31);
                                d(o8Var.f5704b, canvas, arrayList);
                                if (z10) {
                                    f(o8Var.f5704b, r8Var.E + o8Var.e, r8Var.F + i10 + o8Var.f5706f);
                                }
                                o8Var.f5704b.draw(canvas);
                                org.telegram.ui.Components.w5 update2 = org.telegram.ui.Components.a6.update(0, r8Var, o8Var.f5703a, o8Var.f5704b);
                                o8Var.f5703a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, o8Var.f5704b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, r8Var.f5938w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, r8Var.f5938w);
                            float lerp2 = AndroidUtilities.lerp(o8Var.d, o8Var.f5706f, bs.f25038g.getInterpolation(r8Var.f5938w));
                            canvas.translate(r8Var.E + lerp, r8Var.F + i10 + lerp2);
                            if (z10) {
                                f(o8Var.f5704b, r8Var.E + lerp, r8Var.F + i10 + lerp2);
                            }
                            o8Var.f5704b.draw(canvas);
                            org.telegram.ui.Components.w5 update3 = org.telegram.ui.Components.a6.update(0, r8Var, o8Var.f5703a, o8Var.f5704b);
                            o8Var.f5703a = update3;
                            org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, o8Var.f5704b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
            canvas.translate(r8Var.E, r8Var.F + i10);
            if (s8Var.W.x()) {
                s8Var.W.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.w5 update4 = org.telegram.ui.Components.a6.update(0, r8Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, r8Var.E, r8Var.F + i10);
            }
        }
        if (this.f5863p != null) {
            canvas.save();
            canvas.translate(r8Var.E, (AndroidUtilities.lerp(this.f5860m, this.f5859l, r8Var.f5938w) + r8Var.F) - this.f5863p.b());
            n8 n8Var2 = this.f5863p;
            int width2 = r8Var.getWidth();
            int i14 = r8Var.E;
            n8Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            wh.g.g(this.v, false, -1, 0, this.f5868u, 0, staticLayout, arrayList, canvas, false);
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
        r8 r8Var = this.v;
        s8 s8Var = r8Var.J;
        TextPaint textPaint = r8Var.d;
        q8[] q8VarArr = r8Var.f5936r;
        TextPaint textPaint2 = r8Var.f5933c;
        boolean isEmpty = TextUtils.isEmpty(this.f5861n);
        Stack stack = this.f5857j;
        ArrayList arrayList = this.f5856i;
        if (isEmpty) {
            this.e = null;
            this.f5859l = 0;
            n8 n8Var = this.f5862o;
            if (n8Var != null) {
                this.f5859l = AndroidUtilities.dp(4.0f) + n8Var.b();
            }
            n8 n8Var2 = this.f5863p;
            if (n8Var2 != null) {
                this.f5859l = org.telegram.messenger.g0.C(4.0f, n8Var2.b(), this.f5859l);
            }
            this.f5860m = this.f5859l;
            if (this == q8VarArr[0]) {
                r8Var.v = null;
            }
            this.f5855g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = r8.a(r8Var, textPaint2, this.f5861n, i10);
        this.e = a2;
        this.f5859l = a2.getHeight();
        n8 n8Var3 = this.f5862o;
        if (n8Var3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + n8Var3.b();
        } else {
            i11 = 0;
        }
        n8 n8Var4 = this.f5863p;
        if (n8Var4 != null) {
            this.f5859l = org.telegram.messenger.g0.C(8.0f, n8Var4.b(), this.f5859l);
        }
        this.f5859l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        r8Var.f5932b = z10;
        if (z10) {
            i12 = 3;
            if (this.e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f5861n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    r8Var.f5932b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
            i12 = 3;
        }
        if (r8Var.f5932b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == q8VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                r8Var.v = r8.a(r8Var, textPaint, string, i10);
                r8Var.h = ((r8Var.F + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                r8Var.f5935n = (r8Var.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            n8 n8Var5 = this.f5862o;
            if (n8Var5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + n8Var5.b();
            } else {
                i13 = 0;
            }
            int i15 = topPadding2 + i13;
            n8 n8Var6 = this.f5863p;
            if (n8Var6 != null) {
                i14 = AndroidUtilities.dp(8.0f) + n8Var6.b();
            } else {
                i14 = 0;
            }
            this.f5860m = i15 + i14;
            this.f5855g = r8.a(r8Var, textPaint2, this.f5861n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            wh.g.c(s8Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i16 = 0;
                while (true) {
                    o8[] o8VarArr = this.h;
                    if (i16 >= o8VarArr.length) {
                        break;
                    }
                    o8 o8Var = o8VarArr[i16];
                    if (o8Var != null) {
                        org.telegram.ui.Components.a6.release(s8Var, o8Var.f5703a);
                    }
                    i16++;
                }
            }
            this.h = new o8[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i17 = i12; i17 < this.e.getLineCount(); i17++) {
                    int lineStart = this.e.getLineStart(i17);
                    int lineEnd = this.e.getLineEnd(i17);
                    CharSequence subSequence = this.f5861n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i17 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = r8.a(r8Var, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i17 - 3] = obj;
                        obj.f5704b = a10;
                        obj.e = this.e.getLineLeft(i17);
                        obj.f5706f = this.e.getTopPadding() + this.e.getLineTop(i17);
                        if (lineRight < r8Var.f5935n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f5705c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f5706f;
                            obj.f5705c = obj.e;
                        }
                    }
                }
            }
        } else {
            if (this == q8VarArr[0]) {
                staticLayout2 = staticLayout;
                r8Var.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.f5855g = staticLayout2;
            this.f5860m = this.f5859l;
            stack.addAll(arrayList);
            arrayList.clear();
            wh.g.c(r8Var, this.e, stack, arrayList);
        }
        int i18 = r8Var.E;
        int i19 = r8Var.F;
        wh.l lVar = this.f5858k;
        lVar.f49137c = i18;
        lVar.d = i19;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11;
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            r8 r8Var = this.v;
            float f13 = lineLeft - (r8Var.E / 3.0f);
            float lineRight = (r8Var.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f12 = layout.getLineTop(i10) - (r8Var.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            if (i10 >= layout.getLineCount() - 1) {
                f11 = (r8Var.F / 3.0f) + lineBottom;
            } else {
                f11 = lineBottom;
            }
            this.f5867t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, n8 n8Var, n8 n8Var2) {
        this.f5861n = charSequence;
        this.f5862o = n8Var;
        this.f5863p = n8Var2;
        r8 r8Var = this.v;
        if (n8Var != null) {
            p8 p8Var = new p8(this, 0);
            n8Var.f5675r = r8Var;
            n8Var.f5676s = p8Var;
            new pm0(r8Var);
            n8Var.f5667j.setCallback(r8Var);
            n8Var.h.f26098a = r8Var;
            n8Var.f5666i.f32608a = r8Var;
            n8Var.c();
        }
        n8 n8Var3 = this.f5863p;
        if (n8Var3 != null) {
            p8 p8Var2 = new p8(this, 1);
            n8Var3.f5675r = r8Var;
            n8Var3.f5676s = p8Var2;
            new pm0(r8Var);
            n8Var3.f5667j.setCallback(r8Var);
            n8Var3.h.f26098a = r8Var;
            n8Var3.f5666i.f32608a = r8Var;
            n8Var3.c();
        }
        r8Var.f5937s = 0;
        r8Var.requestLayout();
    }
}
