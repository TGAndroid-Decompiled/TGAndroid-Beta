package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.TwoStepVerificationActivity;
public final class kd implements Runnable {
    public final int f20518a;
    public final boolean f20519b;
    public final boolean f20520c;
    public final Object d;
    public final Object e;
    public final Object f20521f;
    public final Object h;

    public kd(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.f20518a = 0;
        this.d = messagesController;
        this.e = tL_error;
        this.f20521f = r2Var;
        this.h = tL_channels_editAdmin;
        this.f20519b = z10;
        this.f20520c = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f20518a;
        Object obj = this.h;
        Object obj2 = this.f20521f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ((MessagesController) obj4).lambda$setUserAdminRole$100((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.r2) obj2, (TLRPC.TL_channels_editAdmin) obj, this.f20519b, this.f20520c);
                return;
            case 1:
                ((NotificationsController) obj4).lambda$processNewMessages$28((ArrayList) obj3, (ArrayList) obj2, this.f20519b, this.f20520c, (CountDownLatch) obj);
                return;
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj2;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj;
                if (this.f20519b) {
                    actionBarLayout.h = true;
                    actionBarLayout.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f22302a0 = false;
                    actionBarLayout.f22341s.setScaleX(1.0f);
                    actionBarLayout.f22341s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f22298v1;
                    actionBarLayout.V(r2Var, this.f20520c);
                    actionBarLayout.f22341s.setTranslationX(0.0f);
                }
                if (r2Var != null) {
                    r2Var.onTransitionAnimationEnd(false, false);
                }
                r2Var2.onTransitionAnimationEnd(true, false);
                r2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f20519b, this.f20520c, (Runnable) obj);
                return;
        }
    }

    public kd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f20518a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f20521f = obj2;
        this.f20519b = z10;
        this.f20520c = z11;
        this.h = obj3;
    }

    public kd(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.r2 r2Var2) {
        this.f20518a = 2;
        this.d = actionBarLayout;
        this.f20519b = z10;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f20520c = z11;
        this.f20521f = r2Var;
        this.h = r2Var2;
    }
}
