package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class q0 extends FrameLayout implements org.telegram.ui.ActionBar.c6, h9 {
    public final i6 f22387a;
    public final bi.o3 f22388b;
    public final AnimatedArrowDrawable f22389c;
    public final f1 d;
    public final Paint f22390e;
    public a f22391f;
    public c3 h;
    public boolean f22392n;

    public q0(Context context, i6 i6Var) {
        super(context);
        this.f22390e = new Paint();
        this.f22387a = i6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(n6.w0(n6.ul, i6Var));
        this.f22389c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new a5.b(this, 5));
        bi.o3 o3Var = new bi.o3(9, context, this);
        this.f22388b = o3Var;
        o3Var.setOnClickListener(new hi.z4(this, 18));
        addView(o3Var, na.e(53, -1, 51));
        f1 f1Var = new f1(context, i6Var);
        this.d = f1Var;
        f1Var.setAllowNewlines(false);
        f1Var.setTextSize(1, bz.W0);
        f1Var.setHint(gd.N0(2131754015, null));
        f1Var.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(12.66f));
        f1Var.setListener(new n0(this));
        f1Var.setDelegate(new kg.f1(this, 22));
        addView(f1Var, na.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.ul));
        hashSet.add(Integer.valueOf(n6.wl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i9 i9Var;
        c3 c3Var = this.h;
        if (c3Var != null) {
            i9Var = c3Var.f22111a.getTextSelectionHelper();
        } else {
            i9Var = null;
        }
        if (i9Var != null) {
            f1 f1Var = this.d;
            if (f1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(f1Var.getPaddingLeft() + f1Var.getLeft(), f1Var.getPaddingTop() + f1Var.getTop());
                i9Var.Z(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public f1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f22391f;
    }

    @Override
    public final void k(ArrayList arrayList) {
        f1 f1Var = this.d;
        Layout layout = f1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new o0(this, layout, f1Var.getPaddingLeft() + f1Var.getLeft(), f1Var.getPaddingTop() + f1Var.getTop()));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar = this.f22391f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f22001b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f22390e);
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
        i6 i6Var = this.f22387a;
        int w02 = n6.w0(i7, i6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f22389c;
        animatedArrowDrawable.f32622a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.f22390e.setColor(n6.w0(n6.wl, i6Var));
    }
}
