package de;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ii.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.o71;
public final class m implements b, hp0, me.d, ne.a {
    public final Object f8337a;

    public m(Object obj) {
        this.f8337a = obj;
    }

    @Override
    public void A(float f7, int i10) {
        ((me.j) this.f8337a).i(f7);
    }

    @Override
    public java.lang.Object G(de.c r7, ld.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: de.m.G(de.c, ld.c):java.lang.Object");
    }

    @Override
    public void b(float f7) {
        z zVar = (z) this.f8337a;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override
    public void d(float f7) {
        MessageObject messageObject = ((z) this.f8337a).P;
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
        ((me.j) this.f8337a).i(f7);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        o71 o71Var = (o71) this.f8337a;
        float f11 = -dp;
        o71Var.f29285g.inset(f11, f11);
        boolean contains = o71Var.f29285g.contains(f7, f10);
        float f12 = dp;
        o71Var.f29285g.inset(f12, f12);
        return contains;
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((o71) this.f8337a).f29287j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        ((o71) this.f8337a).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        ((o71) this.f8337a).h.c(false);
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
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
