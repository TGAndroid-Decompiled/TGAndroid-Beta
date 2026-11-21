package oi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.bz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
public final class p5 extends FrameLayout {
    public final f1 f22312a;
    public TL_iv.pageTableCell f22313b;

    public p5(Context context, h6 h6Var) {
        super(context);
        f1 f1Var = new f1(context, h6Var);
        this.f22312a = f1Var;
        f1Var.setTextSize(1, Math.max(8, bz.W0 - 2));
        f1Var.setAllowNewlines(true);
        setCompact(false);
        addView(f1Var, ma.e(-1, -2, 51));
    }

    public final void a() {
        int i7;
        int i10;
        int i11;
        f1 f1Var = this.f22312a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.f22313b;
        if (pagetablecell.align_right) {
            i7 = 5;
        } else if (pagetablecell.align_center) {
            i7 = 1;
        } else {
            i7 = 3;
        }
        if (pagetablecell.valign_middle) {
            i10 = i7 | 16;
        } else if (pagetablecell.valign_bottom) {
            i10 = i7 | 80;
        } else {
            i10 = i7 | 48;
        }
        layoutParams.gravity = i10;
        f1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.f22313b;
        if (pagetablecell2.align_right) {
            i11 = 53;
        } else if (pagetablecell2.align_center) {
            i11 = 49;
        } else {
            i11 = 51;
        }
        f1Var.setGravity(i11);
        f1Var.setTypeface(null);
    }

    public final void b(org.telegram.tgnet.tl.TL_iv.pageTableCell r5) {
        throw new UnsupportedOperationException("Method not decompiled: oi.p5.b(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        f1 f1Var = this.f22312a;
        if (f1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean z11 = false;
            if (x10 >= f1Var.getLeft() && x10 < f1Var.getRight()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (y10 < f1Var.getTop() || y10 >= f1Var.getBottom()) {
                z11 = true;
            }
            if (z10 && z11 && f1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y10 - f1Var.getTop(), f1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x10 - f1Var.getLeft(), max);
                boolean onTouchEvent = f1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        f1 f1Var = this.f22312a;
        if (z10) {
            f1Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
            f1Var.setMinHeight(org.telegram.messenger.g0.L(18.0f));
            return;
        }
        f1Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(9.0f));
        f1Var.setMinHeight(org.telegram.messenger.g0.L(36.0f));
    }

    public void setLocked(boolean z10) {
        this.f22312a.setLocked(z10);
    }
}
