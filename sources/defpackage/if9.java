package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class if9 {
    public final dg9 a;
    public final vnb b;
    public final hf9 c;
    public boolean d;

    public if9(Context context, vnb vnbVar, hf9 hf9Var) {
        this.b = vnbVar;
        this.c = hf9Var;
        dg9 dg9Var = new dg9(context, vnbVar);
        this.a = dg9Var;
        dg9Var.setPadding(hl.L(2.0f), hl.L(4.0f), hl.L(2.0f), hl.L(2.0f));
        dg9Var.setAllowNewlines(false);
        dg9Var.setInputType(147457);
        dg9Var.setGravity(8388659);
        dg9Var.setTextSize(1, Math.max(8, xea.S0 - 2));
        dg9Var.setHint(ob6.M0(2131754447, null));
        dg9Var.setListener(new um4(this, hf9Var, false, (byte) 25));
        dg9Var.setDelegate(new m88(this, hf9Var, (byte) 22));
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
        dg9 dg9Var = this.a;
        dg9Var.updateColors();
        int i = aob.G6;
        vnb vnbVar = this.b;
        aob.v0(i, vnbVar);
        yob.Y(dg9Var, yob.K(0.5f, i), vnbVar);
        uob K = yob.K(0.35f, i);
        yob.n(dg9Var, 1, K.a, -1, 2, K.d, vnbVar);
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        mk0 X0 = this.c.X0();
        if (X0 != null && (pageBlock = X0.b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = X0.b.caption.text;
            String l = mm9.l(richText);
            dg9 dg9Var = this.a;
            if (!String.valueOf(dg9Var.getText()).equals(l)) {
                dg9Var.setTextSilently(mm9.r(richText, null, true));
                dg9Var.f();
            }
        }
    }

    public final void c(Canvas canvas) {
        hf9 hf9Var = this.c;
        amb E0 = hf9Var.E0();
        if (E0 != null) {
            dg9 dg9Var = this.a;
            if (dg9Var.getLayout() != null) {
                canvas.save();
                canvas.translate(dg9Var.getPaddingLeft() + dg9Var.getLeft(), dg9Var.getPaddingTop() + dg9Var.getTop());
                E0.Y(canvas, hf9Var.S0(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        dg9 dg9Var = this.a;
        Layout layout = dg9Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new gf9(this, layout, dg9Var.getPaddingLeft() + dg9Var.getLeft(), dg9Var.getPaddingTop() + dg9Var.getTop()));
    }

    public final boolean f(int i, int i2) {
        int lineForVertical;
        dg9 dg9Var = this.a;
        Layout layout = dg9Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i - (dg9Var.getPaddingLeft() + dg9Var.getLeft());
        int paddingTop = i2 - (dg9Var.getPaddingTop() + dg9Var.getTop());
        if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f = paddingLeft;
            if (f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i, int i2, int i3, int i4) {
        int L = hl.L(16.0f) + i;
        int max = Math.max(L, (i3 - i2) - hl.L(16.0f));
        dg9 dg9Var = this.a;
        dg9Var.layout(L, i4, max, dg9Var.getMeasuredHeight() + i4);
    }

    public final int h(int i, int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i3 - i) - i2) - (hl.L(16.0f) << 1)), 1073741824);
        dg9 dg9Var = this.a;
        dg9Var.measure(makeMeasureSpec, 0);
        return dg9Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        mk0 X0 = this.c.X0();
        if (X0 != null && (pageBlock = X0.b) != null) {
            d(pageBlock);
            X0.b.caption.text = mm9.f(this.a.getText());
        }
    }
}
