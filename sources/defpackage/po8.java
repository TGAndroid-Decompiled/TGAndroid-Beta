package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class po8 extends r59 implements o4b {
    public final ProfileActivity f3;
    public VelocityTracker g3;
    public final ProfileActivity h3;

    public po8(ProfileActivity profileActivity, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.h3 = profileActivity;
        this.f3 = profileActivity;
    }

    @Override
    public final boolean G0(View view) {
        if (view != this.h3.O) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean I0(View view, float f, float f2) {
        return !(view instanceof s1);
    }

    @Override
    public final void b(int[] iArr) {
        a aVar;
        aVar = ((d) this.f3).actionBar;
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
        wp8 wp8Var = profileActivity.O;
        if (wp8Var != null) {
            if (wp8Var.p()) {
                wp8 wp8Var2 = profileActivity.O;
                if (wp8Var2.F1 && wp8Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.p()) {
                wp8 wp8Var3 = profileActivity.O;
                if (wp8Var3.F1 && (wp8Var3.getClosestTab() == 8 || nha.t0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            lea leaVar = profileActivity.O.b0;
            if (leaVar == null || !leaVar.g()) {
                oea oeaVar = profileActivity.O.c0;
                if (oeaVar != null && oeaVar.f) {
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
        RectF rectF = ProfileActivity.e7;
        this.h3.M3();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m;
        a aVar;
        int i;
        int Y1;
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
            aVar = ((d) profileActivity).actionBar;
            if (aVar.getOccupyStatusBar()) {
                i = gm.m;
            } else {
                i = 0;
            }
            int i2 = currentActionBarHeight + i;
            if (profileActivity.o2 && !profileActivity.J0) {
                Y1 = profileActivity.e2();
            } else {
                i2 = profileActivity.a.getMeasuredWidth();
                Y1 = profileActivity.Y1();
            }
            if (profileActivity.Q1 >= (Y1 + i2) - 1.0f) {
                profileActivity.d3(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m = profileActivity.c.m(0)) != null) {
            if (profileActivity.O1) {
                profileActivity.O1 = false;
                profileActivity.a.P0 = true;
            }
            profileActivity.D3(m, profileActivity.j2);
        }
        return onTouchEvent;
    }

    @Override
    public final void s0(View view, View view2) {
    }
}
