package ce;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import hi.a0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.u61;
public final class m implements b, jo0, le.d, me.a {
    public final Object f4666a;

    public m(Object obj) {
        this.f4666a = obj;
    }

    @Override
    public void B(float f7, int i10) {
        ((le.j) this.f4666a).i(f7);
    }

    @Override
    public void G(int i10, float f7, float f10, le.e eVar) {
        ((le.j) this.f4666a).i(f7);
    }

    @Override
    public void b(float f7) {
        a0 a0Var = (a0) this.f4666a;
        MessageObject messageObject = a0Var.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(a0Var.P, f7);
    }

    @Override
    public void d(float f7) {
        MessageObject messageObject = ((a0) this.f4666a).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override
    public boolean forceEnableVibration() {
        return false;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        u61 u61Var = (u61) this.f4666a;
        float f11 = -dp;
        u61Var.f27578g.inset(f11, f11);
        boolean contains = u61Var.f27578g.contains(f7, f10);
        float f12 = dp;
        u61Var.f27578g.inset(f12, f12);
        return contains;
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((u61) this.f4666a).f27580j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        ((u61) this.f4666a).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        ((u61) this.f4666a).h.c(false);
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override
    public java.lang.Object u(ce.c r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: ce.m.u(ce.c, kd.c):java.lang.Object");
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
