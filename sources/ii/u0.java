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
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class u0 extends FrameLayout implements org.telegram.ui.ActionBar.z5, n9 {
    public final org.telegram.ui.ActionBar.e6 f12722a;
    public final bb f12723b;
    public final AnimatedArrowDrawable f12724c;
    public final i1 d;
    public final Paint f12725e;
    public a f12726f;
    public e3 h;
    public boolean f12727n;

    public u0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f12725e = new Paint();
        this.f12722a = e6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Dk, e6Var));
        this.f12724c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new i.f(this, 1));
        bb bbVar = new bb(this, context, 6);
        this.f12723b = bbVar;
        bbVar.setOnClickListener(new ai.v0(this, 28));
        addView(bbVar, w7.x5.e(53, -1, 51));
        i1 i1Var = new i1(context, e6Var);
        this.d = i1Var;
        i1Var.setAllowNewlines(false);
        i1Var.setTextSize(1, SharedConfig.fontSize);
        i1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        i1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        i1Var.setListener(new r0(this));
        i1Var.setDelegate(new ei.c5(this, 14));
        addView(i1Var, w7.x5.a(-2.0f, 53.0f, 0.0f, 16.0f, 0.0f, -1, 51));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o9 o9Var;
        e3 e3Var = this.h;
        if (e3Var != null) {
            o9Var = e3Var.f12394a.getTextSelectionHelper();
        } else {
            o9Var = null;
        }
        if (o9Var != null) {
            i1 i1Var = this.d;
            if (i1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(i1Var.getPaddingLeft() + i1Var.getLeft(), i1Var.getPaddingTop() + i1Var.getTop());
                o9Var.Z(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        this.d.t();
        int i10 = org.telegram.ui.ActionBar.i6.Dk;
        org.telegram.ui.ActionBar.e6 e6Var = this.f12722a;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f12724c;
        animatedArrowDrawable.f23836a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.f12725e.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Fk, e6Var));
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
        return this.f12726f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f12726f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12234b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f12725e);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setLocked(boolean z10) {
        this.d.setLocked(z10);
    }
}
