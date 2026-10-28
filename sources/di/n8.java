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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xm0;
public final class n8 {
    public ba0 f8836a;
    public org.telegram.ui.Components.c6 f8837b;
    public final x90 f8838c;
    public org.telegram.ui.Components.y5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.y5 f8839f;
    public StaticLayout f8840g;
    public l8[] h;
    public final ArrayList f8841i;
    public final Stack f8842j;
    public final xh.l f8843k;
    public int f8844l;
    public int f8845m;
    public CharSequence f8846n;
    public k8 f8847o;
    public k8 f8848p;
    public boolean f8849q;
    public final org.telegram.ui.Components.h6 f8850r;
    public final ea0 f8851s;
    public final Path f8852t;
    public final AtomicReference f8853u;
    public final o8 v;

    public n8(o8 o8Var) {
        this.v = o8Var;
        this.f8838c = new x90(o8Var);
        ArrayList arrayList = new ArrayList();
        this.f8841i = arrayList;
        this.f8842j = new Stack();
        this.f8846n = "";
        this.f8850r = new org.telegram.ui.Components.h6(o8Var.J, 0L, 400L, ds.h);
        Path path = new Path();
        this.f8852t = path;
        this.f8853u = new AtomicReference();
        this.f8843k = new xh.l(o8Var, arrayList, new a1.c(this, 28));
        ea0 ea0Var = new ea0();
        this.f8851s = ea0Var;
        ea0Var.f27806y = path;
        ea0Var.k(4.0f);
        ea0Var.g(org.telegram.ui.ActionBar.y6.o1(0.3f, -1), org.telegram.ui.ActionBar.y6.o1(0.1f, -1), org.telegram.ui.ActionBar.y6.o1(0.2f, -1), org.telegram.ui.ActionBar.y6.o1(0.7f, -1));
        ea0Var.setCallback(o8Var);
    }

    public final int a(int i10) {
        int i11;
        k8 k8Var = this.f8847o;
        int i12 = 0;
        if (k8Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + k8Var.b();
        } else {
            i11 = 0;
        }
        k8 k8Var2 = this.f8848p;
        if (k8Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + k8Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        o8 o8Var = this.v;
        if (staticLayout == null) {
            return i10 - ((o8Var.F * 2) + this.f8844l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!o8Var.f8883b) {
            return i10 - ((o8Var.F * 2) + this.f8844l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * o8Var.f8884c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        o8 o8Var = this.v;
        p8 p8Var = o8Var.J;
        float e = this.f8850r.e(this.f8849q);
        if (f7 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f7, 0.7f * f7, e);
            if (lerp >= 1.0f) {
                c(canvas, e);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, p8Var.getWidth(), p8Var.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e);
                canvas2.restore();
            }
            if (e <= 0.0f && !this.f8849q) {
                return;
            }
            ea0 ea0Var = this.f8851s;
            ea0Var.setAlpha((int) (e * 255.0f * lerp));
            ea0Var.draw(canvas2);
            o8Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        o8 o8Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = o8Var.f8882a;
        p8 p8Var = o8Var.J;
        if (this.f8847o != null) {
            canvas.save();
            canvas.translate(o8Var.E, o8Var.F);
            k8 k8Var = this.f8847o;
            int width = o8Var.getWidth();
            int i12 = o8Var.E;
            k8Var.a(canvas, (width - i12) - i12);
            int b10 = this.f8847o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(o8Var.E, o8Var.F + i10);
        if (this.f8838c.f(canvas)) {
            o8Var.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8852t.rewind();
        ArrayList arrayList3 = this.f8841i;
        if (arrayList3.isEmpty() && this.f8840g != null) {
            if (p8Var.W.x()) {
                canvas.save();
                canvas.translate(o8Var.E, o8Var.F + i10);
                p8Var.W.W(canvas);
                canvas.restore();
            }
            if (this.f8840g != null) {
                canvas.save();
                canvas.translate(o8Var.E, o8Var.F + i10);
                d(this.f8840g, canvas, arrayList3);
                org.telegram.ui.Components.y5 update = org.telegram.ui.Components.c6.update(0, o8Var, this.f8839f, this.f8840g);
                this.f8839f = update;
                org.telegram.ui.Components.c6.drawAnimatedEmojis(canvas, this.f8840g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f8840g, o8Var.E, o8Var.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    l8[] l8VarArr = this.h;
                    if (i13 >= l8VarArr.length) {
                        break;
                    }
                    l8 l8Var = l8VarArr[i13];
                    if (l8Var != null) {
                        canvas.save();
                        float f11 = l8Var.f8766c;
                        float f12 = l8Var.e;
                        if (f11 == f12) {
                            if (o8Var.f8889w != f10) {
                                canvas.translate(o8Var.E + f12, o8Var.F + i10 + l8Var.f8767f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, l8Var.f8765b.getWidth(), l8Var.f8765b.getHeight(), (int) (o8Var.f8889w * 255.0f), 31);
                                d(l8Var.f8765b, canvas, arrayList);
                                if (z10) {
                                    f(l8Var.f8765b, o8Var.E + l8Var.e, o8Var.F + i10 + l8Var.f8767f);
                                }
                                l8Var.f8765b.draw(canvas);
                                org.telegram.ui.Components.y5 update2 = org.telegram.ui.Components.c6.update(0, o8Var, l8Var.f8764a, l8Var.f8765b);
                                l8Var.f8764a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.c6.drawAnimatedEmojis(canvas, l8Var.f8765b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, o8Var.f8889w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, o8Var.f8889w);
                            float lerp2 = AndroidUtilities.lerp(l8Var.d, l8Var.f8767f, ds.f27531g.getInterpolation(o8Var.f8889w));
                            canvas.translate(o8Var.E + lerp, o8Var.F + i10 + lerp2);
                            if (z10) {
                                f(l8Var.f8765b, o8Var.E + lerp, o8Var.F + i10 + lerp2);
                            }
                            l8Var.f8765b.draw(canvas);
                            org.telegram.ui.Components.y5 update3 = org.telegram.ui.Components.c6.update(0, o8Var, l8Var.f8764a, l8Var.f8765b);
                            l8Var.f8764a = update3;
                            org.telegram.ui.Components.c6.drawAnimatedEmojis(canvas, l8Var.f8765b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
            canvas.translate(o8Var.E, o8Var.F + i10);
            if (p8Var.W.x()) {
                p8Var.W.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.y5 update4 = org.telegram.ui.Components.c6.update(0, o8Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.c6.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, o8Var.E, o8Var.F + i10);
            }
        }
        if (this.f8848p != null) {
            canvas.save();
            canvas.translate(o8Var.E, (AndroidUtilities.lerp(this.f8845m, this.f8844l, o8Var.f8889w) + o8Var.F) - this.f8848p.b());
            k8 k8Var2 = this.f8848p;
            int width2 = o8Var.getWidth();
            int i14 = o8Var.E;
            k8Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            xh.g.g(this.v, false, -1, 0, this.f8853u, 0, staticLayout, arrayList, canvas, false);
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
        o8 o8Var = this.v;
        p8 p8Var = o8Var.J;
        TextPaint textPaint = o8Var.d;
        n8[] n8VarArr = o8Var.f8887r;
        TextPaint textPaint2 = o8Var.f8884c;
        boolean isEmpty = TextUtils.isEmpty(this.f8846n);
        Stack stack = this.f8842j;
        ArrayList arrayList = this.f8841i;
        if (isEmpty) {
            this.e = null;
            this.f8844l = 0;
            k8 k8Var = this.f8847o;
            if (k8Var != null) {
                this.f8844l = AndroidUtilities.dp(4.0f) + k8Var.b();
            }
            k8 k8Var2 = this.f8848p;
            if (k8Var2 != null) {
                this.f8844l = org.telegram.messenger.t.D(4.0f, k8Var2.b(), this.f8844l);
            }
            this.f8845m = this.f8844l;
            if (this == n8VarArr[0]) {
                o8Var.v = null;
            }
            this.f8840g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = o8.a(o8Var, textPaint2, this.f8846n, i10);
        this.e = a2;
        this.f8844l = a2.getHeight();
        k8 k8Var3 = this.f8847o;
        if (k8Var3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + k8Var3.b();
        } else {
            i11 = 0;
        }
        k8 k8Var4 = this.f8848p;
        if (k8Var4 != null) {
            this.f8844l = org.telegram.messenger.t.D(8.0f, k8Var4.b(), this.f8844l);
        }
        this.f8844l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        o8Var.f8883b = z10;
        if (z10) {
            i12 = 3;
            if (this.e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f8846n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    o8Var.f8883b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
            i12 = 3;
        }
        if (o8Var.f8883b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == n8VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                o8Var.v = o8.a(o8Var, textPaint, string, i10);
                o8Var.h = ((o8Var.F + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                o8Var.f8886n = (o8Var.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            k8 k8Var5 = this.f8847o;
            if (k8Var5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + k8Var5.b();
            } else {
                i13 = 0;
            }
            int i15 = topPadding2 + i13;
            k8 k8Var6 = this.f8848p;
            if (k8Var6 != null) {
                i14 = AndroidUtilities.dp(8.0f) + k8Var6.b();
            } else {
                i14 = 0;
            }
            this.f8845m = i15 + i14;
            this.f8840g = o8.a(o8Var, textPaint2, this.f8846n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            xh.g.c(p8Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i16 = 0;
                while (true) {
                    l8[] l8VarArr = this.h;
                    if (i16 >= l8VarArr.length) {
                        break;
                    }
                    l8 l8Var = l8VarArr[i16];
                    if (l8Var != null) {
                        org.telegram.ui.Components.c6.release(p8Var, l8Var.f8764a);
                    }
                    i16++;
                }
            }
            this.h = new l8[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i17 = i12; i17 < this.e.getLineCount(); i17++) {
                    int lineStart = this.e.getLineStart(i17);
                    int lineEnd = this.e.getLineEnd(i17);
                    CharSequence subSequence = this.f8846n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i17 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = o8.a(o8Var, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i17 - 3] = obj;
                        obj.f8765b = a10;
                        obj.e = this.e.getLineLeft(i17);
                        obj.f8767f = this.e.getTopPadding() + this.e.getLineTop(i17);
                        if (lineRight < o8Var.f8886n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f8766c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f8767f;
                            obj.f8766c = obj.e;
                        }
                    }
                }
            }
        } else {
            if (this == n8VarArr[0]) {
                staticLayout2 = staticLayout;
                o8Var.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.f8840g = staticLayout2;
            this.f8845m = this.f8844l;
            stack.addAll(arrayList);
            arrayList.clear();
            xh.g.c(o8Var, this.e, stack, arrayList);
        }
        int i18 = o8Var.E;
        int i19 = o8Var.F;
        xh.l lVar = this.f8843k;
        lVar.f51962c = i18;
        lVar.d = i19;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11;
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            o8 o8Var = this.v;
            float f13 = lineLeft - (o8Var.E / 3.0f);
            float lineRight = (o8Var.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f12 = layout.getLineTop(i10) - (o8Var.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            if (i10 >= layout.getLineCount() - 1) {
                f11 = (o8Var.F / 3.0f) + lineBottom;
            } else {
                f11 = lineBottom;
            }
            this.f8852t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, k8 k8Var, k8 k8Var2) {
        this.f8846n = charSequence;
        this.f8847o = k8Var;
        this.f8848p = k8Var2;
        o8 o8Var = this.v;
        if (k8Var != null) {
            m8 m8Var = new m8(this, 0);
            k8Var.f8741r = o8Var;
            k8Var.f8742s = m8Var;
            new xm0(o8Var);
            k8Var.f8733j.setCallback(o8Var);
            k8Var.h.f28862a = o8Var;
            k8Var.f8732i.f34720a = o8Var;
            k8Var.c();
        }
        k8 k8Var3 = this.f8848p;
        if (k8Var3 != null) {
            m8 m8Var2 = new m8(this, 1);
            k8Var3.f8741r = o8Var;
            k8Var3.f8742s = m8Var2;
            new xm0(o8Var);
            k8Var3.f8733j.setCallback(o8Var);
            k8Var3.h.f28862a = o8Var;
            k8Var3.f8732i.f34720a = o8Var;
            k8Var3.c();
        }
        o8Var.f8888s = 0;
        o8Var.requestLayout();
    }
}
