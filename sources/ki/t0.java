package ki;

import ai.hc;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class t0 extends FrameLayout implements org.telegram.ui.ActionBar.y5, m9 {
    public final org.telegram.ui.ActionBar.d6 f15513a;
    public final hc f15514b;
    public final AnimatedArrowDrawable f15515c;
    public final h1 d;
    public final Paint e;
    public a f15516f;
    public d3 h;
    public boolean f15517n;

    public t0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = new Paint();
        this.f15513a = d6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(h6.w0(h6.Dk, d6Var));
        this.f15515c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new ah.f1(this, 3));
        hc hcVar = new hc(this, context, 7);
        this.f15514b = hcVar;
        hcVar.setOnClickListener(new hg.r0(this, 9));
        addView(hcVar, w7.z5.e(53, -1, 51));
        h1 h1Var = new h1(context, d6Var);
        this.d = h1Var;
        h1Var.setAllowNewlines(false);
        h1Var.setTextSize(1, SharedConfig.fontSize);
        h1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        h1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        h1Var.setListener(new q0(this));
        h1Var.setDelegate(new j5.b(this, 3));
        addView(h1Var, w7.z5.a(-2.0f, 53.0f, 0.0f, 16.0f, 0.0f, -1, 51));
        d();
    }

    @Override
    public final void d() {
        this.d.t();
        int i10 = h6.Dk;
        org.telegram.ui.ActionBar.d6 d6Var = this.f15513a;
        int w02 = h6.w0(i10, d6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f15515c;
        animatedArrowDrawable.f23888a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(h6.w0(h6.Fk, d6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n9 n9Var;
        d3 d3Var = this.h;
        if (d3Var != null) {
            n9Var = d3Var.f15225a.getTextSelectionHelper();
        } else {
            n9Var = null;
        }
        if (n9Var != null) {
            h1 h1Var = this.d;
            if (h1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop());
                n9Var.Z(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        h1 h1Var = this.d;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new r0(this, layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop()));
    }

    public int[] getColorKeys() {
        return null;
    }

    public h1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f15516f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f15516f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f15089b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.e);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setLocked(boolean z10) {
        this.d.setLocked(z10);
    }
}
