package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.messenger.uz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class y0 extends FrameLayout implements org.telegram.ui.ActionBar.k6, j9 {
    public final org.telegram.ui.ActionBar.p6 f3454a;
    public final t0 f3455b;
    public final AnimatedArrowDrawable f3456c;
    public final n1 d;
    public final Paint e;
    public a f3457f;
    public l3 h;
    public boolean f3458n;

    public y0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.e = new Paint();
        this.f3454a = p6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.rl, p6Var));
        this.f3456c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new s0(this, 0));
        t0 t0Var = new t0(this, context, 0);
        this.f3455b = t0Var;
        t0Var.setOnClickListener(new ag.g(this, 5));
        addView(t0Var, w7.b6.e(53, -1, 51));
        n1 n1Var = new n1(context, p6Var);
        this.d = n1Var;
        n1Var.setAllowNewlines(false);
        n1Var.setTextSize(1, uz.W0);
        n1Var.setHint(dd.L0(2131754018, null));
        n1Var.setPadding(0, org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(12.66f));
        n1Var.setListener(new v0(this));
        n1Var.setDelegate(new a1.c(this, 8));
        addView(n1Var, w7.b6.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.rl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k9 k9Var;
        l3 l3Var = this.h;
        if (l3Var != null) {
            k9Var = l3Var.f3182a.getTextSelectionHelper();
        } else {
            k9Var = null;
        }
        if (k9Var != null) {
            n1 n1Var = this.d;
            if (n1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(n1Var.getPaddingLeft() + n1Var.getLeft(), n1Var.getPaddingTop() + n1Var.getTop());
                k9Var.Z(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public n1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f3457f;
    }

    @Override
    public final void h(ArrayList arrayList) {
        n1 n1Var = this.d;
        Layout layout = n1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new w0(this, layout, n1Var.getPaddingLeft() + n1Var.getLeft(), n1Var.getPaddingTop() + n1Var.getTop()));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f3457f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f2818b;
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
        int i10 = org.telegram.ui.ActionBar.t6.rl;
        org.telegram.ui.ActionBar.p6 p6Var = this.f3454a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f3456c;
        animatedArrowDrawable.f23664a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tl, p6Var));
    }
}
