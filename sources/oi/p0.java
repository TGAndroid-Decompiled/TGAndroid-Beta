package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class p0 extends FrameLayout implements org.telegram.ui.ActionBar.c6, i9 {
    public final i6 f22229a;
    public final bi.i3 f22230b;
    public final AnimatedArrowDrawable f22231c;
    public final e1 d;
    public final Paint f22232e;
    public a f22233f;
    public b3 h;
    public boolean f22234n;

    public p0(Context context, i6 i6Var) {
        super(context);
        this.f22232e = new Paint();
        this.f22229a = i6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(n6.w0(n6.ul, i6Var));
        this.f22231c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new a5.b(this, 5));
        bi.i3 i3Var = new bi.i3(9, context, this);
        this.f22230b = i3Var;
        i3Var.setOnClickListener(new hi.o0(this, 19));
        addView(i3Var, ma.e(53, -1, 51));
        e1 e1Var = new e1(context, i6Var);
        this.d = e1Var;
        e1Var.setAllowNewlines(false);
        e1Var.setTextSize(1, bz.W0);
        e1Var.setHint(gd.M0(2131754016, null));
        e1Var.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(12.66f));
        e1Var.setListener(new m0(this));
        e1Var.setDelegate(new ki.e(this, 19));
        addView(e1Var, ma.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.ul));
        hashSet.add(Integer.valueOf(n6.wl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j9 j9Var;
        b3 b3Var = this.h;
        if (b3Var != null) {
            j9Var = b3Var.f21949a.getTextSelectionHelper();
        } else {
            j9Var = null;
        }
        if (j9Var != null) {
            e1 e1Var = this.d;
            if (e1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop());
                j9Var.Z(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public e1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f22233f;
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
        a aVar = this.f22233f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21907b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f22232e);
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
        int i7 = n6.ul;
        i6 i6Var = this.f22229a;
        int w02 = n6.w0(i7, i6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f22231c;
        animatedArrowDrawable.f32527a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.f22232e.setColor(n6.w0(n6.wl, i6Var));
    }
}
