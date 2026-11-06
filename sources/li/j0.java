package li;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.i9;
public final class j0 {
    public final g1 f18648a;
    public final f6 f18649b;
    public final i0 f18650c;
    public boolean d;

    public j0(Context context, f6 f6Var, i0 i0Var) {
        this.f18649b = f6Var;
        this.f18650c = i0Var;
        g1 g1Var = new g1(context, f6Var);
        this.f18648a = g1Var;
        g1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        g1Var.setAllowNewlines(false);
        g1Var.setInputType(147457);
        g1Var.setGravity(8388659);
        g1Var.setTextSize(1, Math.max(8, iz.W0 - 2));
        g1Var.setHint(hd.M0(2131754454, null));
        g1Var.setListener(new j2.n(5, this, i0Var));
        g1Var.setDelegate(new ab.g(23, this, i0Var));
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
        g1 g1Var = this.f18648a;
        g1Var.updateColors();
        int i7 = k6.G6;
        f6 f6Var = this.f18649b;
        k6.w0(i7, f6Var);
        r6.W(g1Var, r6.L(0.5f, i7), f6Var);
        n6 L = r6.L(0.35f, i7);
        r6.o(g1Var, 1, L.f28324a, -1, 2, L.d, f6Var);
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a V0 = this.f18650c.V0();
        if (V0 != null && (pageBlock = V0.f18389b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = V0.f18389b.caption.text;
            String l10 = c6.l(richText);
            g1 g1Var = this.f18648a;
            if (!String.valueOf(g1Var.getText()).equals(l10)) {
                g1Var.setTextSilently(c6.r(richText, null, true));
                g1Var.f();
            }
        }
    }

    public final void c(Canvas canvas) {
        i0 i0Var = this.f18650c;
        i9 w02 = i0Var.w0();
        if (w02 != null) {
            g1 g1Var = this.f18648a;
            if (g1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(g1Var.getPaddingLeft() + g1Var.getLeft(), g1Var.getPaddingTop() + g1Var.getTop());
                w02.Z(canvas, i0Var.S0(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        g1 g1Var = this.f18648a;
        Layout layout = g1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new h0(this, layout, g1Var.getPaddingLeft() + g1Var.getLeft(), g1Var.getPaddingTop() + g1Var.getTop()));
    }

    public final boolean f(int i7, int i10) {
        int lineForVertical;
        g1 g1Var = this.f18648a;
        Layout layout = g1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i7 - (g1Var.getPaddingLeft() + g1Var.getLeft());
        int paddingTop = i10 - (g1Var.getPaddingTop() + g1Var.getTop());
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
        g1 g1Var = this.f18648a;
        g1Var.layout(L, i12, max, g1Var.getMeasuredHeight() + i12);
    }

    public final int h(int i7, int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i11 - i7) - i10) - (org.telegram.messenger.g0.L(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        g1 g1Var = this.f18648a;
        g1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return g1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a V0 = this.f18650c.V0();
        if (V0 != null && (pageBlock = V0.f18389b) != null) {
            d(pageBlock);
            V0.f18389b.caption.text = c6.f(this.f18648a.getText());
        }
    }
}
