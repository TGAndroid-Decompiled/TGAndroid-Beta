package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class zp8 extends d79 implements j6b {
    public final ProfileActivity f3;
    public VelocityTracker g3;
    public final ProfileActivity h3;

    public zp8(ProfileActivity profileActivity, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.h3 = profileActivity;
        this.f3 = profileActivity;
    }

    @Override
    public final boolean H0(View view) {
        if (view != this.h3.O) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean J0(View view, float f, float f2) {
        return !(view instanceof t1);
    }

    @Override
    public final void b(int[] iArr) {
        a aVar;
        aVar = ((e) this.f3).actionBar;
        iArr[0] = aVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.h3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.h3;
        gr8 gr8Var = profileActivity.O;
        if (gr8Var != null) {
            if (gr8Var.p()) {
                gr8 gr8Var2 = profileActivity.O;
                if (gr8Var2.F1 && gr8Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.p()) {
                gr8 gr8Var3 = profileActivity.O;
                if (gr8Var3.F1 && (gr8Var3.getClosestTab() == 8 || eja.t0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            cga cgaVar = profileActivity.O.b0;
            if (cgaVar == null || !cgaVar.g()) {
                fga fgaVar = profileActivity.O.c0;
                if (fgaVar != null && fgaVar.f) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = ProfileActivity.Z6;
        this.h3.J3();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m;
        a aVar;
        int i;
        int X1;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.h3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.g3;
            if (velocityTracker2 == null) {
                this.g3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.g3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.g3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.g3.computeCurrentVelocity(1000);
                profileActivity.j2 = this.g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.g3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.g3.computeCurrentVelocity(1000);
                profileActivity.j2 = this.g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.g3.recycle();
            this.g3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = a.getCurrentActionBarHeight();
            aVar = ((e) profileActivity).actionBar;
            if (aVar.getOccupyStatusBar()) {
                i = hl.m;
            } else {
                i = 0;
            }
            int i2 = currentActionBarHeight + i;
            if (profileActivity.o2 && !profileActivity.J0) {
                X1 = profileActivity.d2();
            } else {
                i2 = profileActivity.a.getMeasuredWidth();
                X1 = profileActivity.X1();
            }
            if (profileActivity.Q1 >= (X1 + i2) - 1.0f) {
                profileActivity.a3(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m = profileActivity.c.m(0)) != null) {
            if (profileActivity.O1) {
                profileActivity.O1 = false;
                profileActivity.a.P0 = true;
            }
            profileActivity.A3(m, profileActivity.j2);
        }
        return onTouchEvent;
    }

    @Override
    public final void t0(View view, View view2) {
    }
}
