package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.j9;
public final class i0 {
    public final f1 f22168a;
    public final h6 f22169b;
    public final h0 f22170c;
    public boolean d;

    public i0(Context context, h6 h6Var, h0 h0Var) {
        this.f22169b = h6Var;
        this.f22170c = h0Var;
        f1 f1Var = new f1(context, h6Var);
        this.f22168a = f1Var;
        f1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        f1Var.setAllowNewlines(false);
        f1Var.setInputType(147457);
        f1Var.setGravity(8388659);
        f1Var.setTextSize(1, Math.max(8, cz.W0 - 2));
        f1Var.setHint(hd.N0(2131754451, null));
        f1Var.setListener(new ji.l(this, h0Var, false, 8));
        f1Var.setDelegate(new f0(0, this, h0Var));
        a();
    }

    public static void d(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            if (pageBlock.caption == null) {
                pageBlock.caption = new TL_iv.PageCaption();
            }
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption.text == null) {
                pageCaption.text = new TL_iv.textEmpty();
            }
            TL_iv.PageCaption pageCaption2 = pageBlock.caption;
            if (pageCaption2.credit == null) {
                pageCaption2.credit = new TL_iv.textEmpty();
            }
        }
    }

    public final void a() {
        f1 f1Var = this.f22168a;
        f1Var.updateColors();
        int i7 = m6.G6;
        h6 h6Var = this.f22169b;
        m6.w0(i7, h6Var);
        t6.V(f1Var, t6.K(0.5f, i7), h6Var);
        p6 K = t6.K(0.35f, i7);
        t6.n(f1Var, 1, K.f29895a, -1, 2, K.d, h6Var);
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a c12 = this.f22170c.c1();
        if (c12 != null && (pageBlock = c12.f21935b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = c12.f21935b.caption.text;
            String l10 = c6.l(richText);
            f1 f1Var = this.f22168a;
            if (!String.valueOf(f1Var.getText()).equals(l10)) {
                f1Var.setTextSilently(c6.r(richText, null, true));
                f1Var.f();
            }
        }
    }

    public final void c(Canvas canvas) {
        h0 h0Var = this.f22170c;
        j9 P0 = h0Var.P0();
        if (P0 != null) {
            f1 f1Var = this.f22168a;
            if (f1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(f1Var.getPaddingLeft() + f1Var.getLeft(), f1Var.getPaddingTop() + f1Var.getTop());
                P0.Z(canvas, h0Var.a1(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        f1 f1Var = this.f22168a;
        Layout layout = f1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new g0(this, layout, f1Var.getPaddingLeft() + f1Var.getLeft(), f1Var.getPaddingTop() + f1Var.getTop()));
    }

    public final boolean f(int i7, int i10) {
        int lineForVertical;
        f1 f1Var = this.f22168a;
        Layout layout = f1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i7 - (f1Var.getPaddingLeft() + f1Var.getLeft());
        int paddingTop = i10 - (f1Var.getPaddingTop() + f1Var.getTop());
        if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f10 = paddingLeft;
            if (f10 >= layout.getLineLeft(lineForVertical) && f10 <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        int L = org.telegram.messenger.g0.L(16.0f) + i7;
        int max = Math.max(L, (i11 - i10) - org.telegram.messenger.g0.L(16.0f));
        f1 f1Var = this.f22168a;
        f1Var.layout(L, i12, max, f1Var.getMeasuredHeight() + i12);
    }

    public final int h(int i7, int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i11 - i7) - i10) - (org.telegram.messenger.g0.L(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        f1 f1Var = this.f22168a;
        f1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return f1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a c12 = this.f22170c.c1();
        if (c12 != null && (pageBlock = c12.f21935b) != null) {
            d(pageBlock);
            c12.f21935b.caption.text = c6.f(this.f22168a.getText());
        }
    }
}
