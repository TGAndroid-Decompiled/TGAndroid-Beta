package de;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ii.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.m71;
public final class m implements b, fp0, me.d, ne.a {
    public final Object f8338a;

    public m(Object obj) {
        this.f8338a = obj;
    }

    @Override
    public void A(float f7, int i10) {
        ((me.j) this.f8338a).i(f7);
    }

    @Override
    public void b(float f7) {
        z zVar = (z) this.f8338a;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override
    public void d(float f7) {
        MessageObject messageObject = ((z) this.f8338a).P;
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
    public void n(int i10, float f7, float f10, me.e eVar) {
        ((me.j) this.f8338a).i(f7);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        m71 m71Var = (m71) this.f8338a;
        float f11 = -dp;
        m71Var.f28720g.inset(f11, f11);
        boolean contains = m71Var.f28720g.contains(f7, f10);
        float f12 = dp;
        m71Var.f28720g.inset(f12, f12);
        return contains;
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((m71) this.f8338a).f28722j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        ((m71) this.f8338a).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        ((m71) this.f8338a).h.c(false);
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override
    public java.lang.Object z(de.c r7, ld.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: de.m.z(de.c, ld.c):java.lang.Object");
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
