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
public final class ac9 extends FrameLayout implements tjb, eib {
    public final wjb a;
    public final sb b;
    public final AnimatedArrowDrawable c;
    public final mc9 d;
    public final Paint e;
    public lk0 f;
    public he9 h;
    public boolean n;

    public ac9(Context context, wjb wjbVar) {
        super(context);
        this.e = new Paint();
        this.a = wjbVar;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(bkb.v0(bkb.tl, wjbVar));
        this.c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new in(this, (byte) 9));
        sb sbVar = new sb((byte) 29, context, this);
        this.b = sbVar;
        sbVar.setOnClickListener(new ik8(this, (byte) 9));
        addView(sbVar, nme.e(53, -1, 51));
        mc9 mc9Var = new mc9(context, wjbVar);
        this.d = mc9Var;
        mc9Var.setAllowNewlines(false);
        mc9Var.setTextSize(1, gba.S0);
        mc9Var.setHint(k96.M0(2131754015, null));
        mc9Var.setPadding(0, gl.L(14.0f), 0, gl.L(12.66f));
        mc9Var.setListener(new xb9(this));
        mc9Var.setDelegate(new k88(this, (byte) 24));
        addView(mc9Var, nme.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.tl));
        hashSet.add(Integer.valueOf(bkb.vl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fib fibVar;
        he9 he9Var = this.h;
        if (he9Var != null) {
            fibVar = he9Var.a.getTextSelectionHelper();
        } else {
            fibVar = null;
        }
        if (fibVar != null) {
            mc9 mc9Var = this.d;
            if (mc9Var.getLayout() != null) {
                canvas.save();
                canvas.translate(mc9Var.getPaddingLeft() + mc9Var.getLeft(), mc9Var.getPaddingTop() + mc9Var.getTop());
                fibVar.Y(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public mc9 getEditText() {
        return this.d;
    }

    public lk0 getRow() {
        return this.f;
    }

    @Override
    public final void k(ArrayList arrayList) {
        mc9 mc9Var = this.d;
        Layout layout = mc9Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new yb9(this, layout, mc9Var.getPaddingLeft() + mc9Var.getLeft(), mc9Var.getPaddingTop() + mc9Var.getTop()));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        lk0 lk0Var = this.f;
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
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
        int i = bkb.tl;
        wjb wjbVar = this.a;
        int v0 = bkb.v0(i, wjbVar);
        AnimatedArrowDrawable animatedArrowDrawable = this.c;
        animatedArrowDrawable.a.setColor(v0);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(bkb.v0(bkb.vl, wjbVar));
    }
}
