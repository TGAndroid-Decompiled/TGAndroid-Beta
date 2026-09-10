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
public final class be implements Runnable {
    public final int f14791a;
    public final boolean f14792b;
    public final boolean f14793c;
    public final Object d;
    public final Object e;
    public final Object f14794f;
    public final Object h;

    public be(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.f14791a = 0;
        this.d = messagesController;
        this.e = tL_error;
        this.f14794f = p2Var;
        this.h = tL_channels_editAdmin;
        this.f14792b = z10;
        this.f14793c = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f14791a;
        Object obj = this.h;
        Object obj2 = this.f14794f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ((MessagesController) obj4).lambda$setUserAdminRole$101((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.p2) obj2, (TLRPC.TL_channels_editAdmin) obj, this.f14792b, this.f14793c);
                return;
            case 1:
                ((NotificationsController) obj4).lambda$processNewMessages$27((ArrayList) obj3, (ArrayList) obj2, this.f14792b, this.f14793c, (CountDownLatch) obj);
                return;
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj;
                if (this.f14792b) {
                    actionBarLayout.h = true;
                    actionBarLayout.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f17470a0 = false;
                    actionBarLayout.f17506s.setScaleX(1.0f);
                    actionBarLayout.f17506s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f17466p1;
                    actionBarLayout.T(p2Var, this.f14793c);
                    actionBarLayout.f17506s.setTranslationX(0.0f);
                }
                if (p2Var != null) {
                    p2Var.onTransitionAnimationEnd(false, false);
                }
                p2Var2.onTransitionAnimationEnd(true, false);
                p2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.a0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f14792b, this.f14793c, (Runnable) obj);
                return;
        }
    }

    public be(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f14791a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f14794f = obj2;
        this.f14792b = z10;
        this.f14793c = z11;
        this.h = obj3;
    }

    public be(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.p2 p2Var2) {
        this.f14791a = 2;
        this.d = actionBarLayout;
        this.f14792b = z10;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f14793c = z11;
        this.f14794f = p2Var;
        this.h = p2Var2;
    }
}
