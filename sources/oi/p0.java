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
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class p0 extends FrameLayout implements org.telegram.ui.ActionBar.b6, i9 {
    public final h6 f22259a;
    public final bi.o3 f22260b;
    public final AnimatedArrowDrawable f22261c;
    public final e1 d;
    public final Paint f22262e;
    public a f22263f;
    public b3 h;
    public boolean f22264n;

    public p0(Context context, h6 h6Var) {
        super(context);
        this.f22262e = new Paint();
        this.f22259a = h6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(m6.w0(m6.ul, h6Var));
        this.f22261c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new a5.b(this, 5));
        bi.o3 o3Var = new bi.o3(9, context, this);
        this.f22260b = o3Var;
        o3Var.setOnClickListener(new hi.p4(this, 18));
        addView(o3Var, na.e(53, -1, 51));
        e1 e1Var = new e1(context, h6Var);
        this.d = e1Var;
        e1Var.setAllowNewlines(false);
        e1Var.setTextSize(1, cz.W0);
        e1Var.setHint(hd.N0(2131754015, null));
        e1Var.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(12.66f));
        e1Var.setListener(new m0(this));
        e1Var.setDelegate(new kg.y1(this, 20));
        addView(e1Var, na.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
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
        b3 b3Var = this.h;
        if (b3Var != null) {
            j9Var = b3Var.f21978a.getTextSelectionHelper();
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
        return this.f22263f;
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
        a aVar = this.f22263f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21901b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.f22262e);
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
        h6 h6Var = this.f22259a;
        int w02 = m6.w0(i7, h6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.f22261c;
        animatedArrowDrawable.f32524a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.f22262e.setColor(m6.w0(m6.wl, h6Var));
    }
}
