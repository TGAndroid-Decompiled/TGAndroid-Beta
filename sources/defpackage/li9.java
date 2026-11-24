package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_iv;
public final class li9 extends FrameLayout {
    public final mc9 a;
    public TL_iv.pageTableCell b;

    public li9(Context context, wjb wjbVar) {
        super(context);
        mc9 mc9Var = new mc9(context, wjbVar);
        this.a = mc9Var;
        mc9Var.setTextSize(1, Math.max(8, gba.T0 - 2));
        mc9Var.setAllowNewlines(true);
        setCompact(false);
        addView(mc9Var, nme.e(-1, -2, 51));
    }

    public final void a() {
        int i;
        int i2;
        int i3;
        mc9 mc9Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mc9Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.b;
        if (pagetablecell.align_right) {
            i = 5;
        } else if (pagetablecell.align_center) {
            i = 1;
        } else {
            i = 3;
        }
        if (pagetablecell.valign_middle) {
            i2 = i | 16;
        } else if (pagetablecell.valign_bottom) {
            i2 = i | 80;
        } else {
            i2 = i | 48;
        }
        layoutParams.gravity = i2;
        mc9Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        if (pagetablecell2.align_right) {
            i3 = 53;
        } else if (pagetablecell2.align_center) {
            i3 = 49;
        } else {
            i3 = 51;
        }
        mc9Var.setGravity(i3);
        mc9Var.setTypeface(null);
    }

    public final void b(org.telegram.tgnet.tl.TL_iv.pageTableCell r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li9.b(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        mc9 mc9Var = this.a;
        if (mc9Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z2 = false;
            if (x >= mc9Var.getLeft() && x < mc9Var.getRight()) {
                z = true;
            } else {
                z = false;
            }
            if (y < mc9Var.getTop() || y >= mc9Var.getBottom()) {
                z2 = true;
            }
            if (z && z2 && mc9Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y - mc9Var.getTop(), mc9Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x - mc9Var.getLeft(), max);
                boolean onTouchEvent = mc9Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z) {
        mc9 mc9Var = this.a;
        if (z) {
            mc9Var.setPadding(gl.L(5.0f), gl.L(5.0f), gl.L(5.0f), gl.L(5.0f));
            mc9Var.setMinHeight(gl.L(18.0f));
            return;
        }
        mc9Var.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(12.0f), gl.L(9.0f));
        mc9Var.setMinHeight(gl.L(36.0f));
    }

    public void setLocked(boolean z) {
        this.a.setLocked(z);
    }
}
