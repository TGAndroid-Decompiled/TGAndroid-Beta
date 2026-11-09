package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import bi.ec;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class r0 extends FrameLayout implements org.telegram.ui.ActionBar.b6, h9 {
    public final g6 f18802a;
    public final ec f18803b;
    public final AnimatedArrowDrawable f18804c;
    public final g1 d;
    public final Paint f18805e;
    public a f18806f;
    public b3 h;
    public boolean f18807n;

    public r0(Context context, g6 g6Var) {
        super(context);
        this.f18805e = new Paint();
        this.f18802a = g6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(l6.w0(l6.rl, g6Var));
        this.f18804c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new a5.b(this, 5));
        ec ecVar = new ec(8, context, this);
        this.f18803b = ecVar;
        ecVar.setOnClickListener(new ii.g(this, 11));
        addView(ecVar, ha.e(53, -1, 51));
        g1 g1Var = new g1(context, g6Var);
        this.d = g1Var;
        g1Var.setAllowNewlines(false);
        g1Var.setTextSize(1, iz.W0);
        g1Var.setHint(id.M0(2131754018, null));
        g1Var.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(12.66f));
        g1Var.setListener(new o0(this));
        g1Var.setDelegate(new l2.x(this, 5));
        addView(g1Var, ha.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.rl));
        hashSet.add(Integer.valueOf(l6.tl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i9 i9Var;
        b3 b3Var = this.h;
        if (b3Var != null) {
            i9Var = b3Var.f18477a.getTextSelectionHelper();
        } else {
            i9Var = null;
        }
        if (i9Var != null) {
            g1 g1Var = this.d;
            if (g1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(g1Var.getPaddingLeft() + g1Var.getLeft(), g1Var.getPaddingTop() + g1Var.getTop());
                i9Var.Z(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public g1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f18806f;
    }

    @Override
    public final void k(ArrayList arrayList) {
        g1 g1Var = this.d;
        Layout layout = g1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new p0(this, layout, g1Var.getPaddingLeft() + g1Var.getLeft(), g1Var.getPaddingTop() + g1Var.getTop()));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f18806f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f18392b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f18805e);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setLocked(boolean z9) {
        this.d.setLocked(z9);
    }

    @Override
    public final void updateColors() {
        this.d.updateColors();
        int i7 = l6.rl;
        g6 g6Var = this.f18802a;
        int w02 = l6.w0(i7, g6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f18804c;
        animatedArrowDrawable.f31008a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.f18805e.setColor(l6.w0(l6.tl, g6Var));
    }
}
