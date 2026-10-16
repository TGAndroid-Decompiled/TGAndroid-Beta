package ee;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ji.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.k71;
public final class l implements b, bp0, ne.d, oe.a {
    public final Object f8757a;

    public l(Object obj) {
        this.f8757a = obj;
    }

    @Override
    public void A(float f7, int i10) {
        ((ne.j) this.f8757a).h(f7);
    }

    @Override
    public void b(float f7) {
        z zVar = (z) this.f8757a;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override
    public void c(float f7) {
        MessageObject messageObject = ((z) this.f8757a).P;
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
    public java.lang.Object g(ee.c r7, md.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: ee.l.g(ee.c, md.c):java.lang.Object");
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
        k71 k71Var = (k71) this.f8757a;
        float f11 = -dp;
        k71Var.f26238g.inset(f11, f11);
        boolean contains = k71Var.f26238g.contains(f7, f10);
        float f12 = dp;
        k71Var.f26238g.inset(f12, f12);
        return contains;
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((k71) this.f8757a).f26240j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        ((k71) this.f8757a).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        ((k71) this.f8757a).h.c(false);
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override
    public void p(int i10, float f7, float f10, ne.e eVar) {
        ((ne.j) this.f8757a).h(f7);
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
