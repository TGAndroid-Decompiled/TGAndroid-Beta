package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.h9;
public final class h0 {
    public final e1 f21719a;
    public final e6 f21720b;
    public final g0 f21721c;
    public boolean d;

    public h0(Context context, e6 e6Var, g0 g0Var) {
        this.f21720b = e6Var;
        this.f21721c = g0Var;
        e1 e1Var = new e1(context, e6Var);
        this.f21719a = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(8388659);
        e1Var.setTextSize(1, Math.max(8, gz.W0 - 2));
        e1Var.setHint(hd.M0(2131754454, null));
        e1Var.setListener(new ji.j(this, g0Var, false, 8));
        e1Var.setDelegate(new m2.d(2, this, g0Var));
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
        e1 e1Var = this.f21719a;
        e1Var.updateColors();
        int i7 = j6.G6;
        e6 e6Var = this.f21720b;
        j6.w0(i7, e6Var);
        q6.V(e1Var, q6.K(0.5f, i7), e6Var);
        m6 K = q6.K(0.35f, i7);
        q6.n(e1Var, 1, K.f29392a, -1, 2, K.d, e6Var);
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a P = this.f21721c.P();
        if (P != null && (pageBlock = P.f21544b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = P.f21544b.caption.text;
            String l10 = a6.l(richText);
            e1 e1Var = this.f21719a;
            if (!String.valueOf(e1Var.getText()).equals(l10)) {
                e1Var.setTextSilently(a6.r(richText, null, true));
                e1Var.f();
            }
        }
    }

    public final void c(Canvas canvas) {
        g0 g0Var = this.f21721c;
        h9 E = g0Var.E();
        if (E != null) {
            e1 e1Var = this.f21719a;
            if (e1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop());
                E.Z(canvas, g0Var.N(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        e1 e1Var = this.f21719a;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new f0(this, layout, e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop()));
    }

    public final boolean f(int i7, int i10) {
        int lineForVertical;
        e1 e1Var = this.f21719a;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i7 - (e1Var.getPaddingLeft() + e1Var.getLeft());
        int paddingTop = i10 - (e1Var.getPaddingTop() + e1Var.getTop());
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
        e1 e1Var = this.f21719a;
        e1Var.layout(L, i12, max, e1Var.getMeasuredHeight() + i12);
    }

    public final int h(int i7, int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i11 - i7) - i10) - (org.telegram.messenger.g0.L(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        e1 e1Var = this.f21719a;
        e1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return e1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a P = this.f21721c.P();
        if (P != null && (pageBlock = P.f21544b) != null) {
            d(pageBlock);
            P.f21544b.caption.text = a6.f(this.f21719a.getText());
        }
    }
}
