package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import di.eb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class t0 extends FrameLayout implements org.telegram.ui.ActionBar.z5, p9 {
    public final org.telegram.ui.ActionBar.f6 f14177a;
    public final eb f14178b;
    public final AnimatedArrowDrawable f14179c;
    public final h1 d;
    public final Paint f14180e;
    public a f14181f;
    public c3 h;
    public boolean f14182n;

    public t0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f14180e = new Paint();
        this.f14177a = f6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Dk, f6Var));
        this.f14179c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new ah.g1(this, 2));
        eb ebVar = new eb(this, context, 6);
        this.f14178b = ebVar;
        ebVar.setOnClickListener(new ah.h0(this, 29));
        addView(ebVar, w7.x5.e(53, -1, 51));
        h1 h1Var = new h1(context, f6Var);
        this.d = h1Var;
        h1Var.setAllowNewlines(false);
        h1Var.setTextSize(1, SharedConfig.fontSize);
        h1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        h1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        h1Var.setListener(new q0(this));
        h1Var.setDelegate(new fi.f(this, 23));
        addView(h1Var, w7.x5.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        d();
    }

    @Override
    public final void d() {
        this.d.t();
        int i10 = org.telegram.ui.ActionBar.j6.Dk;
        org.telegram.ui.ActionBar.f6 f6Var = this.f14177a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f14179c;
        animatedArrowDrawable.f23643a.setColor(v02);
        animatedArrowDrawable.invalidateSelf();
        this.f14180e.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fk, f6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q9 q9Var;
        c3 c3Var = this.h;
        if (c3Var != null) {
            q9Var = c3Var.f13842a.getTextSelectionHelper();
        } else {
            q9Var = null;
        }
        if (q9Var != null) {
            h1 h1Var = this.d;
            if (h1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop());
                q9Var.a0(canvas, this, 0);
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
        return this.f14181f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f14181f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13732b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f14180e);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setLocked(boolean z10) {
        this.d.setLocked(z10);
    }
}
