package oi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.bz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
public final class o5 extends FrameLayout {
    public final e1 f22226a;
    public TL_iv.pageTableCell f22227b;

    public o5(Context context, i6 i6Var) {
        super(context);
        e1 e1Var = new e1(context, i6Var);
        this.f22226a = e1Var;
        e1Var.setTextSize(1, Math.max(8, bz.W0 - 2));
        e1Var.setAllowNewlines(true);
        setCompact(false);
        addView(e1Var, ma.e(-1, -2, 51));
    }

    public final void a() {
        int i7;
        int i10;
        int i11;
        e1 e1Var = this.f22226a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.f22227b;
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
        e1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.f22227b;
        if (pagetablecell2.align_right) {
            i11 = 53;
        } else if (pagetablecell2.align_center) {
            i11 = 49;
        } else {
            i11 = 51;
        }
        e1Var.setGravity(i11);
        e1Var.setTypeface(null);
    }

    public final void b(org.telegram.tgnet.tl.TL_iv.pageTableCell r5) {
        throw new UnsupportedOperationException("Method not decompiled: oi.o5.b(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        e1 e1Var = this.f22226a;
        if (e1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean z11 = false;
            if (x10 >= e1Var.getLeft() && x10 < e1Var.getRight()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (y10 < e1Var.getTop() || y10 >= e1Var.getBottom()) {
                z11 = true;
            }
            if (z10 && z11 && e1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y10 - e1Var.getTop(), e1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x10 - e1Var.getLeft(), max);
                boolean onTouchEvent = e1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        e1 e1Var = this.f22226a;
        if (z10) {
            e1Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
            e1Var.setMinHeight(org.telegram.messenger.g0.L(18.0f));
            return;
        }
        e1Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(9.0f));
        e1Var.setMinHeight(org.telegram.messenger.g0.L(36.0f));
    }

    public void setLocked(boolean z10) {
        this.f22226a.setLocked(z10);
    }
}
