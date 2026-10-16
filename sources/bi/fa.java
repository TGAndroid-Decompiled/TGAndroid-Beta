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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.tm0;
public final class fa {
    public ea0 f3029a;
    public org.telegram.ui.Components.b6 f3030b;
    public final aa0 f3031c;
    public org.telegram.ui.Components.x5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.x5 f3032f;
    public StaticLayout f3033g;
    public da[] h;
    public final ArrayList f3034i;
    public final Stack f3035j;
    public final wh.l f3036k;
    public int f3037l;
    public int f3038m;
    public CharSequence f3039n;
    public ca f3040o;
    public ca f3041p;
    public boolean f3042q;
    public final org.telegram.ui.Components.g6 f3043r;
    public final ha0 f3044s;
    public final Path f3045t;
    public final AtomicReference f3046u;
    public final ga v;

    public fa(ga gaVar) {
        this.v = gaVar;
        this.f3031c = new aa0(gaVar);
        ArrayList arrayList = new ArrayList();
        this.f3034i = arrayList;
        this.f3035j = new Stack();
        this.f3039n = "";
        this.f3043r = new org.telegram.ui.Components.g6(gaVar.J, 0L, 400L, es.h);
        Path path = new Path();
        this.f3045t = path;
        this.f3046u = new AtomicReference();
        this.f3036k = new wh.l(gaVar, arrayList, new a1.c(this, 10));
        ha0 ha0Var = new ha0();
        this.f3044s = ha0Var;
        ha0Var.f25267y = path;
        ha0Var.k(4.0f);
        ha0Var.g(org.telegram.ui.ActionBar.g6.m1(0.3f, -1), org.telegram.ui.ActionBar.g6.m1(0.1f, -1), org.telegram.ui.ActionBar.g6.m1(0.2f, -1), org.telegram.ui.ActionBar.g6.m1(0.7f, -1));
        ha0Var.setCallback(gaVar);
    }

    public final int a(int i10) {
        int i11;
        ca caVar = this.f3040o;
        int i12 = 0;
        if (caVar != null) {
            i11 = AndroidUtilities.dp(8.0f) + caVar.b();
        } else {
            i11 = 0;
        }
        ca caVar2 = this.f3041p;
        if (caVar2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + caVar2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        ga gaVar = this.v;
        if (staticLayout == null) {
            return i10 - ((gaVar.F * 2) + this.f3037l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!gaVar.f3093b) {
            return i10 - ((gaVar.F * 2) + this.f3037l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * gaVar.f3094c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        ga gaVar = this.v;
        ha haVar = gaVar.J;
        float e = this.f3043r.e(this.f3042q);
        if (f7 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f7, 0.7f * f7, e);
            if (lerp >= 1.0f) {
                c(canvas, e);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, haVar.getWidth(), haVar.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e);
                canvas2.restore();
            }
            if (e <= 0.0f && !this.f3042q) {
                return;
            }
            ha0 ha0Var = this.f3044s;
            ha0Var.setAlpha((int) (e * 255.0f * lerp));
            ha0Var.draw(canvas2);
            gaVar.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        ga gaVar = this.v;
        PorterDuffColorFilter porterDuffColorFilter = gaVar.f3092a;
        ha haVar = gaVar.J;
        if (this.f3040o != null) {
            canvas.save();
            canvas.translate(gaVar.E, gaVar.F);
            ca caVar = this.f3040o;
            int width = gaVar.getWidth();
            int i12 = gaVar.E;
            caVar.a(canvas, (width - i12) - i12);
            int b10 = this.f3040o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(gaVar.E, gaVar.F + i10);
        if (this.f3031c.f(canvas)) {
            gaVar.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3045t.rewind();
        ArrayList arrayList3 = this.f3034i;
        if (arrayList3.isEmpty() && this.f3033g != null) {
            if (haVar.W.x()) {
                canvas.save();
                canvas.translate(gaVar.E, gaVar.F + i10);
                haVar.W.W(canvas);
                canvas.restore();
            }
            if (this.f3033g != null) {
                canvas.save();
                canvas.translate(gaVar.E, gaVar.F + i10);
                d(this.f3033g, canvas, arrayList3);
                org.telegram.ui.Components.x5 update = org.telegram.ui.Components.b6.update(0, gaVar, this.f3032f, this.f3033g);
                this.f3032f = update;
                org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.f3033g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f3033g, gaVar.E, gaVar.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    da[] daVarArr = this.h;
                    if (i13 >= daVarArr.length) {
                        break;
                    }
                    da daVar = daVarArr[i13];
                    if (daVar != null) {
                        canvas.save();
                        float f11 = daVar.f2964c;
                        float f12 = daVar.e;
                        if (f11 == f12) {
                            if (gaVar.f3099w != f10) {
                                canvas.translate(gaVar.E + f12, gaVar.F + i10 + daVar.f2965f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, daVar.f2963b.getWidth(), daVar.f2963b.getHeight(), (int) (gaVar.f3099w * 255.0f), 31);
                                d(daVar.f2963b, canvas, arrayList);
                                if (z10) {
                                    f(daVar.f2963b, gaVar.E + daVar.e, gaVar.F + i10 + daVar.f2965f);
                                }
                                daVar.f2963b.draw(canvas);
                                org.telegram.ui.Components.x5 update2 = org.telegram.ui.Components.b6.update(0, gaVar, daVar.f2962a, daVar.f2963b);
                                daVar.f2962a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, daVar.f2963b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, gaVar.f3099w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, gaVar.f3099w);
                            float lerp2 = AndroidUtilities.lerp(daVar.d, daVar.f2965f, es.f24466g.getInterpolation(gaVar.f3099w));
                            canvas.translate(gaVar.E + lerp, gaVar.F + i10 + lerp2);
                            if (z10) {
                                f(daVar.f2963b, gaVar.E + lerp, gaVar.F + i10 + lerp2);
                            }
                            daVar.f2963b.draw(canvas);
                            org.telegram.ui.Components.x5 update3 = org.telegram.ui.Components.b6.update(0, gaVar, daVar.f2962a, daVar.f2963b);
                            daVar.f2962a = update3;
                            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, daVar.f2963b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
            canvas.translate(gaVar.E, gaVar.F + i10);
            if (haVar.W.x()) {
                haVar.W.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.x5 update4 = org.telegram.ui.Components.b6.update(0, gaVar, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, gaVar.E, gaVar.F + i10);
            }
        }
        if (this.f3041p != null) {
            canvas.save();
            canvas.translate(gaVar.E, (AndroidUtilities.lerp(this.f3038m, this.f3037l, gaVar.f3099w) + gaVar.F) - this.f3041p.b());
            ca caVar2 = this.f3041p;
            int width2 = gaVar.getWidth();
            int i14 = gaVar.E;
            caVar2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            wh.g.g(this.v, false, -1, 0, this.f3046u, 0, staticLayout, arrayList, canvas, false);
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
        ga gaVar = this.v;
        ha haVar = gaVar.J;
        TextPaint textPaint = gaVar.d;
        fa[] faVarArr = gaVar.f3097r;
        TextPaint textPaint2 = gaVar.f3094c;
        boolean isEmpty = TextUtils.isEmpty(this.f3039n);
        Stack stack = this.f3035j;
        ArrayList arrayList = this.f3034i;
        if (isEmpty) {
            this.e = null;
            this.f3037l = 0;
            ca caVar = this.f3040o;
            if (caVar != null) {
                this.f3037l = AndroidUtilities.dp(4.0f) + caVar.b();
            }
            ca caVar2 = this.f3041p;
            if (caVar2 != null) {
                this.f3037l = org.telegram.messenger.g0.C(4.0f, caVar2.b(), this.f3037l);
            }
            this.f3038m = this.f3037l;
            if (this == faVarArr[0]) {
                gaVar.v = null;
            }
            this.f3033g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = ga.a(gaVar, textPaint2, this.f3039n, i10);
        this.e = a2;
        this.f3037l = a2.getHeight();
        ca caVar3 = this.f3040o;
        if (caVar3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + caVar3.b();
        } else {
            i11 = 0;
        }
        ca caVar4 = this.f3041p;
        if (caVar4 != null) {
            this.f3037l = org.telegram.messenger.g0.C(8.0f, caVar4.b(), this.f3037l);
        }
        this.f3037l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        gaVar.f3093b = z10;
        if (z10) {
            i12 = 3;
            if (this.e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f3039n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    gaVar.f3093b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
            i12 = 3;
        }
        if (gaVar.f3093b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == faVarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                gaVar.v = ga.a(gaVar, textPaint, string, i10);
                gaVar.h = ((gaVar.F + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                gaVar.f3096n = (gaVar.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            ca caVar5 = this.f3040o;
            if (caVar5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + caVar5.b();
            } else {
                i13 = 0;
            }
            int i15 = topPadding2 + i13;
            ca caVar6 = this.f3041p;
            if (caVar6 != null) {
                i14 = AndroidUtilities.dp(8.0f) + caVar6.b();
            } else {
                i14 = 0;
            }
            this.f3038m = i15 + i14;
            this.f3033g = ga.a(gaVar, textPaint2, this.f3039n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            wh.g.c(haVar, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i16 = 0;
                while (true) {
                    da[] daVarArr = this.h;
                    if (i16 >= daVarArr.length) {
                        break;
                    }
                    da daVar = daVarArr[i16];
                    if (daVar != null) {
                        org.telegram.ui.Components.b6.release(haVar, daVar.f2962a);
                    }
                    i16++;
                }
            }
            this.h = new da[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i17 = i12; i17 < this.e.getLineCount(); i17++) {
                    int lineStart = this.e.getLineStart(i17);
                    int lineEnd = this.e.getLineEnd(i17);
                    CharSequence subSequence = this.f3039n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i17 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = ga.a(gaVar, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i17 - 3] = obj;
                        obj.f2963b = a10;
                        obj.e = this.e.getLineLeft(i17);
                        obj.f2965f = this.e.getTopPadding() + this.e.getLineTop(i17);
                        if (lineRight < gaVar.f3096n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f2964c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f2965f;
                            obj.f2964c = obj.e;
                        }
                    }
                }
            }
        } else {
            if (this == faVarArr[0]) {
                staticLayout2 = staticLayout;
                gaVar.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.f3033g = staticLayout2;
            this.f3038m = this.f3037l;
            stack.addAll(arrayList);
            arrayList.clear();
            wh.g.c(gaVar, this.e, stack, arrayList);
        }
        int i18 = gaVar.E;
        int i19 = gaVar.F;
        wh.l lVar = this.f3036k;
        lVar.f47703c = i18;
        lVar.d = i19;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11;
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            ga gaVar = this.v;
            float f13 = lineLeft - (gaVar.E / 3.0f);
            float lineRight = (gaVar.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f12 = layout.getLineTop(i10) - (gaVar.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            if (i10 >= layout.getLineCount() - 1) {
                f11 = (gaVar.F / 3.0f) + lineBottom;
            } else {
                f11 = lineBottom;
            }
            this.f3045t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, ca caVar, ca caVar2) {
        this.f3039n = charSequence;
        this.f3040o = caVar;
        this.f3041p = caVar2;
        ga gaVar = this.v;
        if (caVar != null) {
            ea eaVar = new ea(this, 0);
            caVar.f2933r = gaVar;
            caVar.f2934s = eaVar;
            new tm0(gaVar);
            caVar.f2925j.setCallback(gaVar);
            caVar.h.f24883a = gaVar;
            caVar.f2924i.f23196a = gaVar;
            caVar.c();
        }
        ca caVar3 = this.f3041p;
        if (caVar3 != null) {
            ea eaVar2 = new ea(this, 1);
            caVar3.f2933r = gaVar;
            caVar3.f2934s = eaVar2;
            new tm0(gaVar);
            caVar3.f2925j.setCallback(gaVar);
            caVar3.h.f24883a = gaVar;
            caVar3.f2924i.f23196a = gaVar;
            caVar3.c();
        }
        gaVar.f3098s = 0;
        gaVar.requestLayout();
    }
}
