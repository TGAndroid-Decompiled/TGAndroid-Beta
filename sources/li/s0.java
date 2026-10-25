package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import bi.cc;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.gb1;
public final class s0 extends FrameLayout implements p6, r9 {
    public final u6 f17460a;
    public final cc f17461b;
    public final AnimatedArrowDrawable f17462c;
    public final g1 d;
    public final Paint e;
    public a f17463f;
    public c3 h;
    public boolean f17464n;

    public s0(Context context, u6 u6Var) {
        super(context);
        this.e = new Paint();
        this.f17460a = u6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(y6.w0(y6.Dk, u6Var));
        this.f17462c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new bh.u0(this, 4));
        cc ccVar = new cc(this, context, 7);
        this.f17461b = ccVar;
        ccVar.setOnClickListener(new ig.d0(this, 10));
        addView(ccVar, gb1.i(53, -1, 51));
        g1 g1Var = new g1(context, u6Var);
        this.d = g1Var;
        g1Var.setAllowNewlines(false);
        g1Var.setTextSize(1, SharedConfig.fontSize);
        g1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        g1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        g1Var.setListener(new p0(this));
        g1Var.setDelegate(new jg.e1(this, 7));
        addView(g1Var, gb1.h(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.Dk));
        hashSet.add(Integer.valueOf(y6.Fk));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s9 s9Var;
        c3 c3Var = this.h;
        if (c3Var != null) {
            s9Var = c3Var.f17172a.getTextSelectionHelper();
        } else {
            s9Var = null;
        }
        if (s9Var != null) {
            g1 g1Var = this.d;
            if (g1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(g1Var.getPaddingLeft() + g1Var.getLeft(), g1Var.getPaddingTop() + g1Var.getTop());
                s9Var.Z(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        g1 g1Var = this.d;
        Layout layout = g1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new q0(this, layout, g1Var.getPaddingLeft() + g1Var.getLeft(), g1Var.getPaddingTop() + g1Var.getTop()));
    }

    public g1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f17463f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f17463f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f17054b;
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
        int i10 = y6.Dk;
        u6 u6Var = this.f17460a;
        int w02 = y6.w0(i10, u6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f17462c;
        animatedArrowDrawable.f25825a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(y6.w0(y6.Fk, u6Var));
    }
}
