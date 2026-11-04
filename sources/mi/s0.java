package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class s0 extends FrameLayout implements org.telegram.ui.ActionBar.z5, g9 {
    public final org.telegram.ui.ActionBar.e6 f19871a;
    public final ai.x2 f19872b;
    public final AnimatedArrowDrawable f19873c;
    public final h1 d;
    public final Paint f19874e;
    public a f19875f;
    public c3 h;
    public boolean f19876n;

    public s0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f19874e = new Paint();
        this.f19871a = e6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(k6.w0(k6.rl, e6Var));
        this.f19873c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new ah.a(this, 6));
        ai.x2 x2Var = new ai.x2(9, context, this);
        this.f19872b = x2Var;
        x2Var.setOnClickListener(new ii.m(this, 14));
        addView(x2Var, mf.e(53, -1, 51));
        h1 h1Var = new h1(context, e6Var);
        this.d = h1Var;
        h1Var.setAllowNewlines(false);
        h1Var.setTextSize(1, az.W0);
        h1Var.setHint(bd.M0(2131754018, null));
        h1Var.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(12.66f));
        h1Var.setListener(new p0(this));
        h1Var.setDelegate(new l5.b(this, 7));
        addView(h1Var, mf.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.rl));
        hashSet.add(Integer.valueOf(k6.tl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h9 h9Var;
        c3 c3Var = this.h;
        if (c3Var != null) {
            h9Var = c3Var.f19543a.getTextSelectionHelper();
        } else {
            h9Var = null;
        }
        if (h9Var != null) {
            h1 h1Var = this.d;
            if (h1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop());
                h9Var.Z(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public h1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f19875f;
    }

    @Override
    public final void k(ArrayList arrayList) {
        h1 h1Var = this.d;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new q0(this, layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop()));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f19875f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f19431b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f19874e);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    public void setLocked(boolean z10) {
        this.d.setLocked(z10);
    }

    @Override
    public final void updateColors() {
        this.d.updateColors();
        int i3 = k6.rl;
        org.telegram.ui.ActionBar.e6 e6Var = this.f19871a;
        int w02 = k6.w0(i3, e6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f19873c;
        animatedArrowDrawable.f31072a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.f19874e.setColor(k6.w0(k6.tl, e6Var));
    }
}
