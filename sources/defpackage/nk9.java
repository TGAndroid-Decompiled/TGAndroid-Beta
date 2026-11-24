package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_iv;
public final class nk9 extends FrameLayout {
    public final ne9 a;
    public TL_iv.pageTableCell b;

    public nk9(Context context, ylb ylbVar) {
        super(context);
        ne9 ne9Var = new ne9(context, ylbVar);
        this.a = ne9Var;
        ne9Var.setTextSize(1, Math.max(8, gda.S0 - 2));
        ne9Var.setAllowNewlines(true);
        setCompact(false);
        addView(ne9Var, qoe.e(-1, -2, 51));
    }

    public final void a() {
        int i;
        int i2;
        int i3;
        ne9 ne9Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ne9Var.getLayoutParams();
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
        ne9Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        if (pagetablecell2.align_right) {
            i3 = 53;
        } else if (pagetablecell2.align_center) {
            i3 = 49;
        } else {
            i3 = 51;
        }
        ne9Var.setGravity(i3);
        ne9Var.setTypeface(null);
    }

    public final void b(org.telegram.tgnet.tl.TL_iv.pageTableCell r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk9.b(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ne9 ne9Var = this.a;
        if (ne9Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z2 = false;
            if (x >= ne9Var.getLeft() && x < ne9Var.getRight()) {
                z = true;
            } else {
                z = false;
            }
            if (y < ne9Var.getTop() || y >= ne9Var.getBottom()) {
                z2 = true;
            }
            if (z && z2 && ne9Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y - ne9Var.getTop(), ne9Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x - ne9Var.getLeft(), max);
                boolean onTouchEvent = ne9Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z) {
        ne9 ne9Var = this.a;
        if (z) {
            ne9Var.setPadding(gm.L(5.0f), gm.L(5.0f), gm.L(5.0f), gm.L(5.0f));
            ne9Var.setMinHeight(gm.L(18.0f));
            return;
        }
        ne9Var.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(12.0f), gm.L(9.0f));
        ne9Var.setMinHeight(gm.L(36.0f));
    }

    public void setLocked(boolean z) {
        this.a.setLocked(z);
    }
}
