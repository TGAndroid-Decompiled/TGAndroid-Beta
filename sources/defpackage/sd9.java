package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class sd9 {
    public final ne9 a;
    public final ylb b;
    public final rd9 c;
    public boolean d;

    public sd9(Context context, ylb ylbVar, rd9 rd9Var) {
        this.b = ylbVar;
        this.c = rd9Var;
        ne9 ne9Var = new ne9(context, ylbVar);
        this.a = ne9Var;
        ne9Var.setPadding(gm.L(2.0f), gm.L(4.0f), gm.L(2.0f), gm.L(2.0f));
        ne9Var.setAllowNewlines(false);
        ne9Var.setInputType(147457);
        ne9Var.setGravity(8388659);
        ne9Var.setTextSize(1, Math.max(8, gda.S0 - 2));
        ne9Var.setHint(jb6.M0(2131754451, null));
        ne9Var.setListener(new wm4(this, rd9Var, false, (byte) 24));
        ne9Var.setDelegate(new xr8(this, rd9Var, (byte) 8));
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
        ne9 ne9Var = this.a;
        ne9Var.updateColors();
        int i = cmb.F6;
        ylb ylbVar = this.b;
        cmb.v0(i, ylbVar);
        anb.Y(ne9Var, anb.K(0.5f, i), ylbVar);
        wmb K = anb.K(0.35f, i);
        anb.n(ne9Var, 1, K.a, -1, 2, K.d, ylbVar);
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        ll0 d1 = this.c.d1();
        if (d1 != null && (pageBlock = d1.b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = d1.b.caption.text;
            String l = zk9.l(richText);
            ne9 ne9Var = this.a;
            if (!String.valueOf(ne9Var.getText()).equals(l)) {
                ne9Var.setTextSilently(zk9.r(richText, null, true));
                ne9Var.f();
            }
        }
    }

    public final void c(Canvas canvas) {
        rd9 rd9Var = this.c;
        gkb H0 = rd9Var.H0();
        if (H0 != null) {
            ne9 ne9Var = this.a;
            if (ne9Var.getLayout() != null) {
                canvas.save();
                canvas.translate(ne9Var.getPaddingLeft() + ne9Var.getLeft(), ne9Var.getPaddingTop() + ne9Var.getTop());
                H0.Y(canvas, rd9Var.Y0(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        ne9 ne9Var = this.a;
        Layout layout = ne9Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new qd9(this, layout, ne9Var.getPaddingLeft() + ne9Var.getLeft(), ne9Var.getPaddingTop() + ne9Var.getTop()));
    }

    public final boolean f(int i, int i2) {
        int lineForVertical;
        ne9 ne9Var = this.a;
        Layout layout = ne9Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i - (ne9Var.getPaddingLeft() + ne9Var.getLeft());
        int paddingTop = i2 - (ne9Var.getPaddingTop() + ne9Var.getTop());
        if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f = paddingLeft;
            if (f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i, int i2, int i3, int i4) {
        int L = gm.L(16.0f) + i;
        int max = Math.max(L, (i3 - i2) - gm.L(16.0f));
        ne9 ne9Var = this.a;
        ne9Var.layout(L, i4, max, ne9Var.getMeasuredHeight() + i4);
    }

    public final int h(int i, int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i3 - i) - i2) - (gm.L(16.0f) << 1)), 1073741824);
        ne9 ne9Var = this.a;
        ne9Var.measure(makeMeasureSpec, 0);
        return ne9Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        ll0 d1 = this.c.d1();
        if (d1 != null && (pageBlock = d1.b) != null) {
            d(pageBlock);
            d1.b.caption.text = zk9.f(this.a.getText());
        }
    }
}
