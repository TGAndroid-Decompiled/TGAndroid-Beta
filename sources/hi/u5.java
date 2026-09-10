package hi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
public final class u5 extends FrameLayout {
    public final k1 f9892a;
    public TL_iv.pageTableCell f9893b;

    public u5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        k1 k1Var = new k1(context, f6Var);
        this.f9892a = k1Var;
        k1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        k1Var.setAllowNewlines(true);
        setCompact(false);
        addView(k1Var, w7.a6.e(-1, -2, 51));
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        k1 k1Var = this.f9892a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.f9893b;
        if (pagetablecell.align_right) {
            i10 = 5;
        } else if (pagetablecell.align_center) {
            i10 = 1;
        } else {
            i10 = 3;
        }
        if (pagetablecell.valign_middle) {
            i11 = i10 | 16;
        } else if (pagetablecell.valign_bottom) {
            i11 = i10 | 80;
        } else {
            i11 = i10 | 48;
        }
        layoutParams.gravity = i11;
        k1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.f9893b;
        if (pagetablecell2.align_right) {
            i12 = 53;
        } else if (pagetablecell2.align_center) {
            i12 = 49;
        } else {
            i12 = 51;
        }
        k1Var.setGravity(i12);
        k1Var.setTypeface(null);
    }

    public final void b(org.telegram.tgnet.tl.TL_iv.pageTableCell r4) {
        throw new UnsupportedOperationException("Method not decompiled: hi.u5.b(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        k1 k1Var = this.f9892a;
        if (k1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            boolean z11 = false;
            if (x10 >= k1Var.getLeft() && x10 < k1Var.getRight()) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = (y3 < ((float) k1Var.getTop()) || y3 >= ((float) k1Var.getBottom())) ? true : true;
            if (z10 && z11 && k1Var.getHeight() > 0) {
                float left = x10 - k1Var.getLeft();
                float max = Math.max(0.0f, Math.min(y3 - k1Var.getTop(), k1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(left, max);
                boolean onTouchEvent = k1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        k1 k1Var = this.f9892a;
        if (z10) {
            k1Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            k1Var.setMinHeight(AndroidUtilities.dp(18.0f));
            return;
        }
        k1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f));
        k1Var.setMinHeight(AndroidUtilities.dp(36.0f));
    }

    public void setLocked(boolean z10) {
        this.f9892a.setLocked(z10);
    }
}
