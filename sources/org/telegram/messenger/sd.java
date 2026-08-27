package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.TwoStepVerificationActivity;

public final class sd implements Runnable {

    public final int f21535a;

    public final boolean f21536b;

    public final boolean f21537c;
    public final Object d;

    public final Object f21538e;

    public final Object f21539f;
    public final Object h;

    public sd(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.f21535a = 0;
        this.d = messagesController;
        this.f21538e = tL_error;
        this.f21539f = n2Var;
        this.h = tL_channels_editAdmin;
        this.f21536b = z10;
        this.f21537c = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f21535a;
        Object obj = this.h;
        Object obj2 = this.f21539f;
        Object obj3 = this.f21538e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ((MessagesController) obj4).lambda$setUserAdminRole$101((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.n2) obj2, (TLRPC.TL_channels_editAdmin) obj, this.f21536b, this.f21537c);
                break;
            case 1:
                ((NotificationsController) obj4).lambda$processNewMessages$27((ArrayList) obj3, (ArrayList) obj2, this.f21536b, this.f21537c, (CountDownLatch) obj);
                break;
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                if (this.f21536b) {
                    actionBarLayout.h = true;
                    actionBarLayout.F = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.T = false;
                    actionBarLayout.f22679s.setScaleX(1.0f);
                    actionBarLayout.f22679s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.l1;
                    actionBarLayout.T(n2Var, this.f21537c);
                    actionBarLayout.f22679s.setTranslationX(0.0f);
                }
                if (n2Var != null) {
                    n2Var.onTransitionAnimationEnd(false, false);
                }
                n2Var2.onTransitionAnimationEnd(true, false);
                n2Var2.onBecomeFullyVisible();
                break;
            default:
                TwoStepVerificationActivity.a0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f21536b, this.f21537c, (Runnable) obj);
                break;
        }
    }

    public sd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f21535a = i10;
        this.d = notificationCenterDelegate;
        this.f21538e = obj;
        this.f21539f = obj2;
        this.f21536b = z10;
        this.f21537c = z11;
        this.h = obj3;
    }

    public sd(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.n2 n2Var2) {
        this.f21535a = 2;
        this.d = actionBarLayout;
        this.f21536b = z10;
        this.f21538e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f21537c = z11;
        this.f21539f = n2Var;
        this.h = n2Var2;
    }
}
