package bi;

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
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
public final class ca {
    public e90 f2824a;
    public org.telegram.ui.Components.z5 f2825b;
    public final a90 f2826c;
    public org.telegram.ui.Components.v5 d;
    public StaticLayout f2827e;
    public org.telegram.ui.Components.v5 f2828f;
    public StaticLayout f2829g;
    public aa[] h;
    public final ArrayList f2830i;
    public final Stack f2831j;
    public final wh.m f2832k;
    public int f2833l;
    public int f2834m;
    public CharSequence f2835n;
    public z9 f2836o;
    public z9 f2837p;
    public boolean f2838q;
    public final org.telegram.ui.Components.e6 f2839r;
    public final h90 f2840s;
    public final Path f2841t;
    public final AtomicReference f2842u;
    public final da v;

    public ca(da daVar) {
        this.v = daVar;
        this.f2826c = new a90(daVar);
        ArrayList arrayList = new ArrayList();
        this.f2830i = arrayList;
        this.f2831j = new Stack();
        this.f2835n = "";
        this.f2839r = new org.telegram.ui.Components.e6(daVar.J, 0L, 400L, pr.h);
        Path path = new Path();
        this.f2841t = path;
        this.f2842u = new AtomicReference();
        this.f2832k = new wh.m(daVar, arrayList, new a1.c(this, 9));
        h90 h90Var = new h90();
        this.f2840s = h90Var;
        h90Var.f26691x = path;
        h90Var.j(4.0f);
        h90Var.f(org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
        h90Var.setCallback(daVar);
    }

    public final int a(int i10) {
        int i11;
        z9 z9Var = this.f2836o;
        int i12 = 0;
        if (z9Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + z9Var.b();
        } else {
            i11 = 0;
        }
        z9 z9Var2 = this.f2837p;
        if (z9Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + z9Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.f2827e;
        da daVar = this.v;
        if (staticLayout == null) {
            return i10 - ((daVar.F * 2) + this.f2833l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!daVar.f2877b) {
            return i10 - ((daVar.F * 2) + this.f2833l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * daVar.f2878c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        da daVar = this.v;
        ea eaVar = daVar.J;
        float e7 = this.f2839r.e(this.f2838q);
        if (f7 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f7, 0.7f * f7, e7);
            if (lerp >= 1.0f) {
                c(canvas, e7);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, eaVar.getWidth(), eaVar.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e7);
                canvas2.restore();
            }
            if (e7 <= 0.0f && !this.f2838q) {
                return;
            }
            h90 h90Var = this.f2840s;
            h90Var.setAlpha((int) (e7 * 255.0f * lerp));
            h90Var.draw(canvas2);
            daVar.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        da daVar = this.v;
        PorterDuffColorFilter porterDuffColorFilter = daVar.f2876a;
        ea eaVar = daVar.J;
        if (this.f2836o != null) {
            canvas.save();
            canvas.translate(daVar.E, daVar.F);
            z9 z9Var = this.f2836o;
            int width = daVar.getWidth();
            int i12 = daVar.E;
            z9Var.a(canvas, (width - i12) - i12);
            int b10 = this.f2836o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(daVar.E, daVar.F + i10);
        if (this.f2826c.f(canvas)) {
            daVar.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2841t.rewind();
        ArrayList arrayList3 = this.f2830i;
        if (arrayList3.isEmpty() && this.f2829g != null) {
            if (eaVar.W.y()) {
                canvas.save();
                canvas.translate(daVar.E, daVar.F + i10);
                eaVar.W.X(canvas);
                canvas.restore();
            }
            if (this.f2829g != null) {
                canvas.save();
                canvas.translate(daVar.E, daVar.F + i10);
                d(this.f2829g, canvas, arrayList3);
                org.telegram.ui.Components.v5 update = org.telegram.ui.Components.z5.update(0, daVar, this.f2828f, this.f2829g);
                this.f2828f = update;
                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.f2829g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f2829g, daVar.E, daVar.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    aa[] aaVarArr = this.h;
                    if (i13 >= aaVarArr.length) {
                        break;
                    }
                    aa aaVar = aaVarArr[i13];
                    if (aaVar != null) {
                        canvas.save();
                        float f11 = aaVar.f2775c;
                        float f12 = aaVar.f2776e;
                        if (f11 == f12) {
                            if (daVar.f2884w != f10) {
                                canvas.translate(daVar.E + f12, daVar.F + i10 + aaVar.f2777f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, aaVar.f2774b.getWidth(), aaVar.f2774b.getHeight(), (int) (daVar.f2884w * 255.0f), 31);
                                d(aaVar.f2774b, canvas, arrayList);
                                if (z10) {
                                    f(aaVar.f2774b, daVar.E + aaVar.f2776e, daVar.F + i10 + aaVar.f2777f);
                                }
                                aaVar.f2774b.draw(canvas);
                                org.telegram.ui.Components.v5 update2 = org.telegram.ui.Components.z5.update(0, daVar, aaVar.f2773a, aaVar.f2774b);
                                aaVar.f2773a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, aaVar.f2774b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, daVar.f2884w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, daVar.f2884w);
                            float lerp2 = AndroidUtilities.lerp(aaVar.d, aaVar.f2777f, pr.f29467g.getInterpolation(daVar.f2884w));
                            canvas.translate(daVar.E + lerp, daVar.F + i10 + lerp2);
                            if (z10) {
                                f(aaVar.f2774b, daVar.E + lerp, daVar.F + i10 + lerp2);
                            }
                            aaVar.f2774b.draw(canvas);
                            org.telegram.ui.Components.v5 update3 = org.telegram.ui.Components.z5.update(0, daVar, aaVar.f2773a, aaVar.f2774b);
                            aaVar.f2773a = update3;
                            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, aaVar.f2774b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        } else if (this.f2827e != null) {
            canvas.save();
            canvas.translate(daVar.E, daVar.F + i10);
            if (eaVar.W.y()) {
                eaVar.W.X(canvas);
            }
            d(this.f2827e, canvas, arrayList3);
            org.telegram.ui.Components.v5 update4 = org.telegram.ui.Components.z5.update(0, daVar, this.d, this.f2827e);
            this.d = update4;
            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.f2827e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.f2827e, daVar.E, daVar.F + i10);
            }
        }
        if (this.f2837p != null) {
            canvas.save();
            canvas.translate(daVar.E, (AndroidUtilities.lerp(this.f2834m, this.f2833l, daVar.f2884w) + daVar.F) - this.f2837p.b());
            z9 z9Var2 = this.f2837p;
            int width2 = daVar.getWidth();
            int i14 = daVar.E;
            z9Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            wh.h.g(this.v, false, -1, 0, this.f2842u, 0, staticLayout, arrayList, canvas, false);
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
        da daVar = this.v;
        ea eaVar = daVar.J;
        TextPaint textPaint = daVar.d;
        ca[] caVarArr = daVar.f2882r;
        TextPaint textPaint2 = daVar.f2878c;
        boolean isEmpty = TextUtils.isEmpty(this.f2835n);
        Stack stack = this.f2831j;
        ArrayList arrayList = this.f2830i;
        if (isEmpty) {
            this.f2827e = null;
            this.f2833l = 0;
            z9 z9Var = this.f2836o;
            if (z9Var != null) {
                this.f2833l = AndroidUtilities.dp(4.0f) + z9Var.b();
            }
            z9 z9Var2 = this.f2837p;
            if (z9Var2 != null) {
                this.f2833l = org.telegram.messenger.w1.C(4.0f, z9Var2.b(), this.f2833l);
            }
            this.f2834m = this.f2833l;
            if (this == caVarArr[0]) {
                daVar.v = null;
            }
            this.f2829g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = da.a(daVar, textPaint2, this.f2835n, i10);
        this.f2827e = a2;
        this.f2833l = a2.getHeight();
        z9 z9Var3 = this.f2836o;
        if (z9Var3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + z9Var3.b();
        } else {
            i11 = 0;
        }
        z9 z9Var4 = this.f2837p;
        if (z9Var4 != null) {
            this.f2833l = org.telegram.messenger.w1.C(8.0f, z9Var4.b(), this.f2833l);
        }
        this.f2833l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.f2827e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        daVar.f2877b = z10;
        if (z10) {
            if (this.f2827e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f2835n.subSequence(this.f2827e.getLineStart(2), this.f2827e.getLineEnd(2))) == 0) {
                    daVar.f2877b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
        }
        if (daVar.f2877b) {
            float topPadding = this.f2827e.getTopPadding() + this.f2827e.getLineTop(2);
            if (this == caVarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                daVar.v = da.a(daVar, textPaint, string, i10);
                daVar.h = ((daVar.F + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                daVar.f2881n = (daVar.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.f2827e.getTopPadding() + this.f2827e.getLineBottom(2);
            z9 z9Var5 = this.f2836o;
            if (z9Var5 != null) {
                i12 = AndroidUtilities.dp(8.0f) + z9Var5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            z9 z9Var6 = this.f2837p;
            if (z9Var6 != null) {
                i13 = AndroidUtilities.dp(8.0f) + z9Var6.b();
            } else {
                i13 = 0;
            }
            this.f2834m = i14 + i13;
            this.f2829g = da.a(daVar, textPaint2, this.f2835n.subSequence(0, this.f2827e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            wh.h.c(eaVar, this.f2827e, stack, arrayList);
            float lineRight = this.f2827e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    aa[] aaVarArr = this.h;
                    if (i15 >= aaVarArr.length) {
                        break;
                    }
                    aa aaVar = aaVarArr[i15];
                    if (aaVar != null) {
                        org.telegram.ui.Components.z5.release(eaVar, aaVar.f2773a);
                    }
                    i15++;
                }
            }
            this.h = new aa[this.f2827e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = 3; i16 < this.f2827e.getLineCount(); i16++) {
                    int lineStart = this.f2827e.getLineStart(i16);
                    int lineEnd = this.f2827e.getLineEnd(i16);
                    CharSequence subSequence = this.f2835n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = da.a(daVar, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f2774b = a10;
                        obj.f2776e = this.f2827e.getLineLeft(i16);
                        obj.f2777f = this.f2827e.getTopPadding() + this.f2827e.getLineTop(i16);
                        if (lineRight < daVar.f2881n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f2775c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f2777f;
                            obj.f2775c = obj.f2776e;
                        }
                    }
                }
            }
        } else {
            if (this == caVarArr[0]) {
                staticLayout2 = staticLayout;
                daVar.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.f2829g = staticLayout2;
            this.f2834m = this.f2833l;
            stack.addAll(arrayList);
            arrayList.clear();
            wh.h.c(daVar, this.f2827e, stack, arrayList);
        }
        int i17 = daVar.E;
        int i18 = daVar.F;
        wh.m mVar = this.f2832k;
        mVar.f48659c = i17;
        mVar.d = i18;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11;
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            da daVar = this.v;
            float f13 = lineLeft - (daVar.E / 3.0f);
            float lineRight = (daVar.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f12 = layout.getLineTop(i10) - (daVar.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            if (i10 >= layout.getLineCount() - 1) {
                f11 = (daVar.F / 3.0f) + lineBottom;
            } else {
                f11 = lineBottom;
            }
            this.f2841t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, z9 z9Var, z9 z9Var2) {
        this.f2835n = charSequence;
        this.f2836o = z9Var;
        this.f2837p = z9Var2;
        da daVar = this.v;
        if (z9Var != null) {
            ba baVar = new ba(this, 0);
            z9Var.f4089r = daVar;
            z9Var.f4090s = baVar;
            new sl0(daVar);
            z9Var.f4081j.setCallback(daVar);
            z9Var.h.f25563a = daVar;
            z9Var.f4080i.f33118a = daVar;
            z9Var.c();
        }
        z9 z9Var3 = this.f2837p;
        if (z9Var3 != null) {
            ba baVar2 = new ba(this, 1);
            z9Var3.f4089r = daVar;
            z9Var3.f4090s = baVar2;
            new sl0(daVar);
            z9Var3.f4081j.setCallback(daVar);
            z9Var3.h.f25563a = daVar;
            z9Var3.f4080i.f33118a = daVar;
            z9Var3.c();
        }
        daVar.f2883s = 0;
        daVar.requestLayout();
    }
}
