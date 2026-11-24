package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class sb9 {
    public final mc9 a;
    public final wjb b;
    public final rb9 c;
    public boolean d;

    public sb9(Context context, wjb wjbVar, rb9 rb9Var) {
        this.b = wjbVar;
        this.c = rb9Var;
        mc9 mc9Var = new mc9(context, wjbVar);
        this.a = mc9Var;
        mc9Var.setPadding(gl.L(2.0f), gl.L(4.0f), gl.L(2.0f), gl.L(2.0f));
        mc9Var.setAllowNewlines(false);
        mc9Var.setInputType(147457);
        mc9Var.setGravity(8388659);
        mc9Var.setTextSize(1, Math.max(8, gba.S0 - 2));
        mc9Var.setHint(k96.M0(2131754451, null));
        mc9Var.setListener(new wk4(this, rb9Var, false, (byte) 24));
        mc9Var.setDelegate(new kq8(this, rb9Var, (byte) 7));
        a();
    }

    public static void d(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption == null) {
                pageCaption = new TL_iv.PageCaption();
                pageBlock.caption = pageCaption;
            }
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
        mc9 mc9Var = this.a;
        mc9Var.updateColors();
        int i = bkb.F6;
        wjb wjbVar = this.b;
        bkb.v0(i, wjbVar);
        zkb.Y(mc9Var, zkb.K(0.5f, i), wjbVar);
        vkb K = zkb.K(0.35f, i);
        zkb.n(mc9Var, 1, K.a, -1, 2, K.d, wjbVar);
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        lk0 I0 = this.c.I0();
        if (I0 != null && (pageBlock = I0.b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = I0.b.caption.text;
            String l = yi9.l(richText);
            mc9 mc9Var = this.a;
            if (!String.valueOf(mc9Var.getText()).equals(l)) {
                mc9Var.setTextSilently(yi9.r(richText, null, true));
                mc9Var.f();
            }
        }
    }

    public final void c(Canvas canvas) {
        rb9 rb9Var = this.c;
        fib q0 = rb9Var.q0();
        if (q0 != null) {
            mc9 mc9Var = this.a;
            if (mc9Var.getLayout() != null) {
                canvas.save();
                canvas.translate(mc9Var.getPaddingLeft() + mc9Var.getLeft(), mc9Var.getPaddingTop() + mc9Var.getTop());
                q0.Y(canvas, rb9Var.G0(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        mc9 mc9Var = this.a;
        Layout layout = mc9Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new qb9(this, layout, mc9Var.getPaddingLeft() + mc9Var.getLeft(), mc9Var.getPaddingTop() + mc9Var.getTop()));
    }

    public final boolean f(int i, int i2) {
        int lineForVertical;
        mc9 mc9Var = this.a;
        Layout layout = mc9Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i - (mc9Var.getPaddingLeft() + mc9Var.getLeft());
        int paddingTop = i2 - (mc9Var.getPaddingTop() + mc9Var.getTop());
        if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f = paddingLeft;
            if (f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i, int i2, int i3, int i4) {
        int L = gl.L(16.0f) + i;
        int max = Math.max(L, (i3 - i2) - gl.L(16.0f));
        mc9 mc9Var = this.a;
        mc9Var.layout(L, i4, max, mc9Var.getMeasuredHeight() + i4);
    }

    public final int h(int i, int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i3 - i) - i2) - (gl.L(16.0f) << 1)), 1073741824);
        mc9 mc9Var = this.a;
        mc9Var.measure(makeMeasureSpec, 0);
        return mc9Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        lk0 I0 = this.c.I0();
        if (I0 != null && (pageBlock = I0.b) != null) {
            d(pageBlock);
            I0.b.caption.text = yi9.f(this.a.getText());
        }
    }
}
