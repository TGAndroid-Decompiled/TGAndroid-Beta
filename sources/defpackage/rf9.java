package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class rf9 extends FrameLayout implements snb, zlb {
    public final vnb a;
    public final nf9 b;
    public final AnimatedArrowDrawable c;
    public final dg9 d;
    public final Paint e;
    public mk0 f;
    public yh9 h;
    public boolean n;

    public rf9(Context context, vnb vnbVar) {
        super(context);
        this.e = new Paint();
        this.a = vnbVar;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(aob.v0(aob.ul, vnbVar));
        this.c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new jn(this, (byte) 9));
        nf9 nf9Var = new nf9((byte) 0, context, this);
        this.b = nf9Var;
        nf9Var.setOnClickListener(new jn8(this, (byte) 11));
        addView(nf9Var, tre.e(53, -1, 51));
        dg9 dg9Var = new dg9(context, vnbVar);
        this.d = dg9Var;
        dg9Var.setAllowNewlines(false);
        dg9Var.setTextSize(1, xea.S0);
        dg9Var.setHint(ob6.M0(2131754011, null));
        dg9Var.setPadding(0, hl.L(14.0f), 0, hl.L(12.66f));
        dg9Var.setListener(new of9(this));
        dg9Var.setDelegate(new ye9(this, (byte) 1));
        addView(dg9Var, tre.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.ul));
        hashSet.add(Integer.valueOf(aob.wl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        amb ambVar;
        yh9 yh9Var = this.h;
        if (yh9Var != null) {
            ambVar = yh9Var.a.getTextSelectionHelper();
        } else {
            ambVar = null;
        }
        if (ambVar != null) {
            dg9 dg9Var = this.d;
            if (dg9Var.getLayout() != null) {
                canvas.save();
                canvas.translate(dg9Var.getPaddingLeft() + dg9Var.getLeft(), dg9Var.getPaddingTop() + dg9Var.getTop());
                ambVar.Y(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public dg9 getEditText() {
        return this.d;
    }

    public mk0 getRow() {
        return this.f;
    }

    @Override
    public final void k(ArrayList arrayList) {
        dg9 dg9Var = this.d;
        Layout layout = dg9Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new pf9(this, layout, dg9Var.getPaddingLeft() + dg9Var.getLeft(), dg9Var.getPaddingTop() + dg9Var.getTop()));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        mk0 mk0Var = this.f;
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.e);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setLocked(boolean z) {
        this.d.setLocked(z);
    }

    @Override
    public final void updateColors() {
        this.d.updateColors();
        int i = aob.ul;
        vnb vnbVar = this.a;
        int v0 = aob.v0(i, vnbVar);
        AnimatedArrowDrawable animatedArrowDrawable = this.c;
        animatedArrowDrawable.a.setColor(v0);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(aob.v0(aob.wl, vnbVar));
    }
}
