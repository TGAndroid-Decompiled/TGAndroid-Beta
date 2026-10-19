package ki;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.n9;
public final class k0 {
    public final h1 f15351a;
    public final org.telegram.ui.ActionBar.d6 f15352b;
    public final j0 f15353c;
    public boolean d;

    public k0(Context context, org.telegram.ui.ActionBar.d6 d6Var, j0 j0Var) {
        this.f15352b = d6Var;
        this.f15353c = j0Var;
        h1 h1Var = new h1(context, d6Var);
        this.f15351a = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        h1Var.setAllowNewlines(false);
        h1Var.setInputType(147457);
        h1Var.setGravity(8388659);
        h1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        h1Var.setHint(LocaleController.getString(R.string.AddCaption));
        h1Var.setListener(new qf.b(this, j0Var, false, 27));
        h1Var.setDelegate(new ah.h0(23, this, j0Var));
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
        h1 h1Var = this.f15351a;
        h1Var.t();
        int w02 = h6.w0(h6.G6, this.f15352b);
        h1Var.setTextColor(h6.m1(0.5f, w02));
        h1Var.setHintTextColor(h6.m1(0.35f, w02));
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a F = this.f15353c.F();
        if (F != null && (pageBlock = F.f15095b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = F.f15095b.caption.text;
            String l4 = e6.l(richText);
            h1 h1Var = this.f15351a;
            if (!String.valueOf(h1Var.getText()).equals(l4)) {
                h1Var.setTextSilently(e6.r(richText, null, true));
                h1Var.invalidateEffects();
            }
        }
    }

    public final void c(Canvas canvas) {
        j0 j0Var = this.f15353c;
        n9 w9 = j0Var.w();
        if (w9 != null) {
            h1 h1Var = this.f15351a;
            if (h1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop());
                w9.Z(canvas, j0Var.D(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        h1 h1Var = this.f15351a;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new i0(this, layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop()));
    }

    public final boolean f(int i10, int i11) {
        int lineForVertical;
        h1 h1Var = this.f15351a;
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
        h1 h1Var = this.f15351a;
        h1Var.layout(dp, i13, max, h1Var.getMeasuredHeight() + i13);
    }

    public final int h(int i10, int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i12 - i10) - i11) - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h1 h1Var = this.f15351a;
        h1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return h1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a F = this.f15353c.F();
        if (F != null && (pageBlock = F.f15095b) != null) {
            d(pageBlock);
            F.f15095b.caption.text = e6.f(this.f15351a.getText());
        }
    }
}
