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
public final class vd implements Runnable {
    public final int f21817a;
    public final boolean f21818b;
    public final boolean f21819c;
    public final Object d;
    public final Object f21820e;
    public final Object f21821f;
    public final Object h;

    public vd(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.f21817a = 0;
        this.d = messagesController;
        this.f21820e = tL_error;
        this.f21821f = o2Var;
        this.h = tL_channels_editAdmin;
        this.f21818b = z10;
        this.f21819c = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f21817a;
        Object obj = this.h;
        Object obj2 = this.f21821f;
        Object obj3 = this.f21820e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ((MessagesController) obj4).lambda$setUserAdminRole$101((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.o2) obj2, (TLRPC.TL_channels_editAdmin) obj, this.f21818b, this.f21819c);
                return;
            case 1:
                ((NotificationsController) obj4).lambda$processNewMessages$27((ArrayList) obj3, (ArrayList) obj2, this.f21818b, this.f21819c, (CountDownLatch) obj);
                return;
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj;
                if (this.f21818b) {
                    actionBarLayout.h = true;
                    actionBarLayout.F = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.T = false;
                    actionBarLayout.f22691s.setScaleX(1.0f);
                    actionBarLayout.f22691s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.l1;
                    actionBarLayout.T(o2Var, this.f21819c);
                    actionBarLayout.f22691s.setTranslationX(0.0f);
                }
                if (o2Var != null) {
                    o2Var.onTransitionAnimationEnd(false, false);
                }
                o2Var2.onTransitionAnimationEnd(true, false);
                o2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.a0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f21818b, this.f21819c, (Runnable) obj);
                return;
        }
    }

    public vd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f21817a = i10;
        this.d = notificationCenterDelegate;
        this.f21820e = obj;
        this.f21821f = obj2;
        this.f21818b = z10;
        this.f21819c = z11;
        this.h = obj3;
    }

    public vd(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.o2 o2Var2) {
        this.f21817a = 2;
        this.d = actionBarLayout;
        this.f21818b = z10;
        this.f21820e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f21819c = z11;
        this.f21821f = o2Var;
        this.h = o2Var2;
    }
}
