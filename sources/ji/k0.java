package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class k0 {
    public final h1 f14033a;
    public final org.telegram.ui.ActionBar.f6 f14034b;
    public final j0 f14035c;
    public boolean d;

    public k0(Context context, org.telegram.ui.ActionBar.f6 f6Var, j0 j0Var) {
        this.f14034b = f6Var;
        this.f14035c = j0Var;
        h1 h1Var = new h1(context, f6Var);
        this.f14033a = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        h1Var.setAllowNewlines(false);
        h1Var.setInputType(147457);
        h1Var.setGravity(8388659);
        h1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        h1Var.setHint(LocaleController.getString(R.string.AddCaption));
        h1Var.setListener(new pf.b(25, this, j0Var));
        h1Var.setDelegate(new ah.i0(21, this, j0Var));
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
        h1 h1Var = this.f14033a;
        h1Var.t();
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f14034b);
        h1Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.5f, v02));
        h1Var.setHintTextColor(org.telegram.ui.ActionBar.j6.l1(0.35f, v02));
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a F = this.f14035c.F();
        if (F != null && (pageBlock = F.f13758b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = F.f13758b.caption.text;
            String l4 = i6.l(richText);
            h1 h1Var = this.f14033a;
            if (!String.valueOf(h1Var.getText()).equals(l4)) {
                h1Var.setTextSilently(i6.r(richText, null, true));
                h1Var.invalidateEffects();
            }
        }
    }

    public final void c(Canvas canvas) {
        j0 j0Var = this.f14035c;
        q9 u10 = j0Var.u();
        if (u10 != null) {
            h1 h1Var = this.f14033a;
            if (h1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop());
                u10.a0(canvas, j0Var.D(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        h1 h1Var = this.f14033a;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new i0(this, layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop()));
    }

    public final boolean f(int i10, int i11) {
        int lineForVertical;
        h1 h1Var = this.f14033a;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i10 - (h1Var.getPaddingLeft() + h1Var.getLeft());
        int paddingTop = i11 - (h1Var.getPaddingTop() + h1Var.getTop());
        if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f7 = paddingLeft;
            if (f7 >= layout.getLineLeft(lineForVertical) && f7 <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(16.0f) + i10;
        int max = Math.max(dp, (i12 - i11) - AndroidUtilities.dp(16.0f));
        h1 h1Var = this.f14033a;
        h1Var.layout(dp, i13, max, h1Var.getMeasuredHeight() + i13);
    }

    public final int h(int i10, int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i12 - i10) - i11) - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h1 h1Var = this.f14033a;
        h1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return h1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a F = this.f14035c.F();
        if (F != null && (pageBlock = F.f13758b) != null) {
            d(pageBlock);
            F.f13758b.caption.text = i6.f(this.f14033a.getText());
        }
    }
}
