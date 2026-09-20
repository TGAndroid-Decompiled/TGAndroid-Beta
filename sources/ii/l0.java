package ii;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r9;
public final class l0 {
    public final i1 f11487a;
    public final org.telegram.ui.ActionBar.f6 f11488b;
    public final k0 f11489c;
    public boolean d;

    public l0(Context context, org.telegram.ui.ActionBar.f6 f6Var, k0 k0Var) {
        this.f11488b = f6Var;
        this.f11489c = k0Var;
        i1 i1Var = new i1(context, f6Var);
        this.f11487a = i1Var;
        i1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        i1Var.setAllowNewlines(false);
        i1Var.setInputType(147457);
        i1Var.setGravity(8388659);
        i1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        i1Var.setHint(LocaleController.getString(R.string.AddCaption));
        i1Var.setListener(new n4.y(this, k0Var, false));
        i1Var.setDelegate(new ah.b(17, this, k0Var));
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
        i1 i1Var = this.f11487a;
        i1Var.t();
        int v02 = j6.v0(j6.G6, this.f11488b);
        i1Var.setTextColor(j6.l1(0.5f, v02));
        i1Var.setHintTextColor(j6.l1(0.35f, v02));
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a M = this.f11489c.M();
        if (M != null && (pageBlock = M.f11205b) != null) {
            d(pageBlock);
            TL_iv.RichText richText = M.f11205b.caption.text;
            String l4 = f6.l(richText);
            i1 i1Var = this.f11487a;
            if (!String.valueOf(i1Var.getText()).equals(l4)) {
                i1Var.setTextSilently(f6.r(richText, null, true));
                i1Var.invalidateEffects();
            }
        }
    }

    public final void c(Canvas canvas) {
        k0 k0Var = this.f11489c;
        r9 B = k0Var.B();
        if (B != null) {
            i1 i1Var = this.f11487a;
            if (i1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(i1Var.getPaddingLeft() + i1Var.getLeft(), i1Var.getPaddingTop() + i1Var.getTop());
                B.a0(canvas, k0Var.I(), 0);
                canvas.restore();
            }
        }
    }

    public final void e(ArrayList arrayList) {
        i1 i1Var = this.f11487a;
        Layout layout = i1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new j0(this, layout, i1Var.getPaddingLeft() + i1Var.getLeft(), i1Var.getPaddingTop() + i1Var.getTop()));
    }

    public final boolean f(int i10, int i11) {
        int lineForVertical;
        i1 i1Var = this.f11487a;
        Layout layout = i1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i10 - (i1Var.getPaddingLeft() + i1Var.getLeft());
        int paddingTop = i11 - (i1Var.getPaddingTop() + i1Var.getTop());
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
        i1 i1Var = this.f11487a;
        i1Var.layout(dp, i13, max, i1Var.getMeasuredHeight() + i13);
    }

    public final int h(int i10, int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i12 - i10) - i11) - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        i1 i1Var = this.f11487a;
        i1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return i1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a M = this.f11489c.M();
        if (M != null && (pageBlock = M.f11205b) != null) {
            d(pageBlock);
            M.f11205b.caption.text = f6.f(this.f11487a.getText());
        }
    }
}
