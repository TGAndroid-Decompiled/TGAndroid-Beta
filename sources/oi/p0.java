package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class p0 extends FrameLayout implements org.telegram.ui.ActionBar.z5, g9 {
    public final e6 f21865a;
    public final bi.o2 f21866b;
    public final AnimatedArrowDrawable f21867c;
    public final e1 d;
    public final Paint f21868e;
    public a f21869f;
    public z2 h;
    public boolean f21870n;

    public p0(Context context, e6 e6Var) {
        super(context);
        this.f21868e = new Paint();
        this.f21865a = e6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(j6.w0(j6.ul, e6Var));
        this.f21867c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new a5.b(this, 5));
        bi.o2 o2Var = new bi.o2(9, context, this);
        this.f21866b = o2Var;
        o2Var.setOnClickListener(new hi.p5(this, 17));
        addView(o2Var, ja.e(53, -1, 51));
        e1 e1Var = new e1(context, e6Var);
        this.d = e1Var;
        e1Var.setAllowNewlines(false);
        e1Var.setTextSize(1, gz.W0);
        e1Var.setHint(hd.M0(2131754018, null));
        e1Var.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(12.66f));
        e1Var.setListener(new m0(this));
        e1Var.setDelegate(new ki.e(this, 18));
        addView(e1Var, ja.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.ul));
        hashSet.add(Integer.valueOf(j6.wl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h9 h9Var;
        z2 z2Var = this.h;
        if (z2Var != null) {
            h9Var = z2Var.f22192a.getTextSelectionHelper();
        } else {
            h9Var = null;
        }
        if (h9Var != null) {
            e1 e1Var = this.d;
            if (e1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop());
                h9Var.Z(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public e1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f21869f;
    }

    @Override
    public final void k(ArrayList arrayList) {
        e1 e1Var = this.d;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new n0(this, layout, e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop()));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f21869f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21544b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f21868e);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setLocked(boolean z10) {
        this.d.setLocked(z10);
    }

    @Override
    public final void updateColors() {
        this.d.updateColors();
        int i7 = j6.ul;
        e6 e6Var = this.f21865a;
        int w02 = j6.w0(i7, e6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f21867c;
        animatedArrowDrawable.f32142a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.f21868e.setColor(j6.w0(j6.wl, e6Var));
    }
}
