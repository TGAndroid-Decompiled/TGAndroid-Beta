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
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class r0 extends FrameLayout implements org.telegram.ui.ActionBar.a6, h9 {
    public final f6 f18799a;
    public final ec f18800b;
    public final AnimatedArrowDrawable f18801c;
    public final g1 d;
    public final Paint f18802e;
    public a f18803f;
    public b3 h;
    public boolean f18804n;

    public r0(Context context, f6 f6Var) {
        super(context);
        this.f18802e = new Paint();
        this.f18799a = f6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(k6.w0(k6.rl, f6Var));
        this.f18801c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new a5.b(this, 5));
        ec ecVar = new ec(8, context, this);
        this.f18800b = ecVar;
        ecVar.setOnClickListener(new ii.g(this, 11));
        addView(ecVar, ha.e(53, -1, 51));
        g1 g1Var = new g1(context, f6Var);
        this.d = g1Var;
        g1Var.setAllowNewlines(false);
        g1Var.setTextSize(1, iz.W0);
        g1Var.setHint(hd.M0(2131754018, null));
        g1Var.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(12.66f));
        g1Var.setListener(new o0(this));
        g1Var.setDelegate(new l2.y(this, 5));
        addView(g1Var, ha.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.rl));
        hashSet.add(Integer.valueOf(k6.tl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i9 i9Var;
        b3 b3Var = this.h;
        if (b3Var != null) {
            i9Var = b3Var.f18474a.getTextSelectionHelper();
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
        return this.f18803f;
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
        a aVar = this.f18803f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f18389b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f18802e);
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
        int i7 = k6.rl;
        f6 f6Var = this.f18799a;
        int w02 = k6.w0(i7, f6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f18801c;
        animatedArrowDrawable.f30999a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.f18802e.setColor(k6.w0(k6.tl, f6Var));
    }
}
