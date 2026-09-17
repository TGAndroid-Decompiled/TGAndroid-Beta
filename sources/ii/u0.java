package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import ci.eb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class u0 extends FrameLayout implements org.telegram.ui.ActionBar.a6, p9 {
    public final org.telegram.ui.ActionBar.f6 f11649a;
    public final eb f11650b;
    public final AnimatedArrowDrawable f11651c;
    public final i1 d;
    public final Paint e;
    public a f11652f;
    public d3 h;
    public boolean f11653n;

    public u0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = new Paint();
        this.f11649a = f6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(j6.v0(j6.Dk, f6Var));
        this.f11651c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new ah.d(this, 2));
        eb ebVar = new eb(this, context, 6);
        this.f11650b = ebVar;
        ebVar.setOnClickListener(new ai.v0(this, 28));
        addView(ebVar, w7.x5.e(53, -1, 51));
        i1 i1Var = new i1(context, f6Var);
        this.d = i1Var;
        i1Var.setAllowNewlines(false);
        i1Var.setTextSize(1, SharedConfig.fontSize);
        i1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        i1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        i1Var.setListener(new r0(this));
        i1Var.setDelegate(new ei.d5(this, 15));
        addView(i1Var, w7.x5.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q9 q9Var;
        d3 d3Var = this.h;
        if (d3Var != null) {
            q9Var = d3Var.f11333a.getTextSelectionHelper();
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
        int i10 = j6.Dk;
        org.telegram.ui.ActionBar.f6 f6Var = this.f11649a;
        int v02 = j6.v0(i10, f6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f11651c;
        animatedArrowDrawable.f21725a.setColor(v02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(j6.v0(j6.Fk, f6Var));
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
        return this.f11652f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f11652f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11204b;
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
