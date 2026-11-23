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
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class q0 extends FrameLayout implements org.telegram.ui.ActionBar.b6, i9 {
    public final h6 f22322a;
    public final bi.m3 f22323b;
    public final AnimatedArrowDrawable f22324c;
    public final f1 d;
    public final Paint f22325e;
    public a f22326f;
    public c3 h;
    public boolean f22327n;

    public q0(Context context, h6 h6Var) {
        super(context);
        this.f22325e = new Paint();
        this.f22322a = h6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(m6.w0(m6.ul, h6Var));
        this.f22324c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new a5.b(this, 5));
        bi.m3 m3Var = new bi.m3(9, context, this);
        this.f22323b = m3Var;
        m3Var.setOnClickListener(new hi.o4(this, 18));
        addView(m3Var, ma.e(53, -1, 51));
        f1 f1Var = new f1(context, h6Var);
        this.d = f1Var;
        f1Var.setAllowNewlines(false);
        f1Var.setTextSize(1, cz.W0);
        f1Var.setHint(hd.N0(2131754015, null));
        f1Var.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(12.66f));
        f1Var.setListener(new n0(this));
        f1Var.setDelegate(new kg.x1(this, 20));
        addView(f1Var, ma.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.ul));
        hashSet.add(Integer.valueOf(m6.wl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j9 j9Var;
        c3 c3Var = this.h;
        if (c3Var != null) {
            j9Var = c3Var.f22045a.getTextSelectionHelper();
        } else {
            j9Var = null;
        }
        if (j9Var != null) {
            f1 f1Var = this.d;
            if (f1Var.getLayout() != null) {
                canvas.save();
                canvas.translate(f1Var.getPaddingLeft() + f1Var.getLeft(), f1Var.getPaddingTop() + f1Var.getTop());
                j9Var.Z(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public f1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f22326f;
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
        a aVar = this.f22326f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21935b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f22325e);
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
        int i7 = m6.ul;
        h6 h6Var = this.f22322a;
        int w02 = m6.w0(i7, h6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f22324c;
        animatedArrowDrawable.f32558a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.f22325e.setColor(m6.w0(m6.wl, h6Var));
    }
}
