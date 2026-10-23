package ki;

import ai.jc;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class t0 extends FrameLayout implements org.telegram.ui.ActionBar.b6, n9 {
    public final org.telegram.ui.ActionBar.g6 f15579a;
    public final jc f15580b;
    public final AnimatedArrowDrawable f15581c;
    public final h1 d;
    public final Paint e;
    public a f15582f;
    public d3 h;
    public boolean f15583n;

    public t0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = new Paint();
        this.f15579a = g6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(k6.w0(k6.Dk, g6Var));
        this.f15581c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new ah.f1(this, 3));
        jc jcVar = new jc(this, context, 7);
        this.f15580b = jcVar;
        jcVar.setOnClickListener(new hg.r0(this, 9));
        addView(jcVar, w7.z5.e(53, -1, 51));
        h1 h1Var = new h1(context, g6Var);
        this.d = h1Var;
        h1Var.setAllowNewlines(false);
        h1Var.setTextSize(1, SharedConfig.fontSize);
        h1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        h1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        h1Var.setListener(new q0(this));
        h1Var.setDelegate(new j5.b(this, 3));
        addView(h1Var, w7.z5.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Dk));
        hashSet.add(Integer.valueOf(k6.Fk));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o9 o9Var;
        d3 d3Var = this.h;
        if (d3Var != null) {
            o9Var = d3Var.f15289a.getTextSelectionHelper();
        } else {
            o9Var = null;
        }
        if (o9Var != null) {
            h1 h1Var = this.d;
            if (h1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop());
                o9Var.Z(canvas, this, 0);
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

    public h1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f15582f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f15582f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f15141b;
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

    @Override
    public final void updateColors() {
        this.d.updateColors();
        int i10 = k6.Dk;
        org.telegram.ui.ActionBar.g6 g6Var = this.f15579a;
        int w02 = k6.w0(i10, g6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f15581c;
        animatedArrowDrawable.f24034a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(k6.w0(k6.Fk, g6Var));
    }
}
