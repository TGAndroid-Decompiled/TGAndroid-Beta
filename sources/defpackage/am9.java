package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_iv;
public final class am9 extends FrameLayout {
    public final dg9 a;
    public TL_iv.pageTableCell b;

    public am9(Context context, vnb vnbVar) {
        super(context);
        dg9 dg9Var = new dg9(context, vnbVar);
        this.a = dg9Var;
        dg9Var.setTextSize(1, Math.max(8, xea.S0 - 2));
        dg9Var.setAllowNewlines(true);
        setCompact(false);
        addView(dg9Var, tre.e(-1, -2, 51));
    }

    public final void a() {
        int i;
        int i2;
        int i3;
        dg9 dg9Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dg9Var.getLayoutParams();
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
        dg9Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        if (pagetablecell2.align_right) {
            i3 = 53;
        } else if (pagetablecell2.align_center) {
            i3 = 49;
        } else {
            i3 = 51;
        }
        dg9Var.setGravity(i3);
        dg9Var.setTypeface(null);
    }

    public final void b(org.telegram.tgnet.tl.TL_iv.pageTableCell r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am9.b(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        dg9 dg9Var = this.a;
        if (dg9Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z2 = false;
            if (x >= dg9Var.getLeft() && x < dg9Var.getRight()) {
                z = true;
            } else {
                z = false;
            }
            if (y < dg9Var.getTop() || y >= dg9Var.getBottom()) {
                z2 = true;
            }
            if (z && z2 && dg9Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y - dg9Var.getTop(), dg9Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x - dg9Var.getLeft(), max);
                boolean onTouchEvent = dg9Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z) {
        dg9 dg9Var = this.a;
        if (z) {
            dg9Var.setPadding(hl.L(5.0f), hl.L(5.0f), hl.L(5.0f), hl.L(5.0f));
            dg9Var.setMinHeight(hl.L(18.0f));
            return;
        }
        dg9Var.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(12.0f), hl.L(9.0f));
        dg9Var.setMinHeight(hl.L(36.0f));
    }

    public void setLocked(boolean z) {
        this.a.setLocked(z);
    }
}
