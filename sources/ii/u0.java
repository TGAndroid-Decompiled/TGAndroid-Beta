package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import ci.bb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class u0 extends FrameLayout implements org.telegram.ui.ActionBar.x5, p9 {
    public final org.telegram.ui.ActionBar.d6 f11644a;
    public final bb f11645b;
    public final AnimatedArrowDrawable f11646c;
    public final i1 d;
    public final Paint e;
    public a f11647f;
    public e3 h;
    public boolean f11648n;

    public u0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = new Paint();
        this.f11644a = d6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Dk, d6Var));
        this.f11646c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new i.f(this, 1));
        bb bbVar = new bb(this, context, 6);
        this.f11645b = bbVar;
        bbVar.setOnClickListener(new ai.v0(this, 28));
        addView(bbVar, w7.y5.e(53, -1, 51));
        i1 i1Var = new i1(context, d6Var);
        this.d = i1Var;
        i1Var.setAllowNewlines(false);
        i1Var.setTextSize(1, SharedConfig.fontSize);
        i1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        i1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        i1Var.setListener(new r0(this));
        i1Var.setDelegate(new ei.d5(this, 14));
        addView(i1Var, w7.y5.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q9 q9Var;
        e3 e3Var = this.h;
        if (e3Var != null) {
            q9Var = e3Var.f11342a.getTextSelectionHelper();
        } else {
            q9Var = null;
        }
        if (q9Var != null) {
            i1 i1Var = this.d;
            if (i1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(i1Var.getPaddingLeft() + i1Var.getLeft(), i1Var.getPaddingTop() + i1Var.getTop());
                q9Var.a0(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        this.d.t();
        int i10 = org.telegram.ui.ActionBar.h6.Dk;
        org.telegram.ui.ActionBar.d6 d6Var = this.f11644a;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f11646c;
        animatedArrowDrawable.f21922a.setColor(v02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Fk, d6Var));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        i1 i1Var = this.d;
        Layout layout = i1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new s0(this, layout, i1Var.getPaddingLeft() + i1Var.getLeft(), i1Var.getPaddingTop() + i1Var.getTop()));
    }

    public int[] getColorKeys() {
        return null;
    }

    public i1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f11647f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f11647f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11191b;
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
