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
public final class td implements Runnable {
    public final int f17389a;
    public final boolean f17390b;
    public final boolean f17391c;
    public final Object d;
    public final Object e;
    public final Object f17392f;
    public final Object h;

    public td(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.f17389a = 0;
        this.d = messagesController;
        this.e = tL_error;
        this.f17392f = n2Var;
        this.h = tL_channels_editAdmin;
        this.f17390b = z10;
        this.f17391c = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f17389a;
        Object obj = this.h;
        Object obj2 = this.f17392f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ((MessagesController) obj4).lambda$setUserAdminRole$101((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.n2) obj2, (TLRPC.TL_channels_editAdmin) obj, this.f17390b, this.f17391c);
                return;
            case 1:
                ((NotificationsController) obj4).lambda$processNewMessages$27((ArrayList) obj3, (ArrayList) obj2, this.f17390b, this.f17391c, (CountDownLatch) obj);
                return;
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                if (this.f17390b) {
                    actionBarLayout.h = true;
                    actionBarLayout.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f18377a0 = false;
                    actionBarLayout.f18413s.setScaleX(1.0f);
                    actionBarLayout.f18413s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f18373p1;
                    actionBarLayout.T(n2Var, this.f17391c);
                    actionBarLayout.f18413s.setTranslationX(0.0f);
                }
                if (n2Var != null) {
                    n2Var.onTransitionAnimationEnd(false, false);
                }
                n2Var2.onTransitionAnimationEnd(true, false);
                n2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.a0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f17390b, this.f17391c, (Runnable) obj);
                return;
        }
    }

    public td(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f17389a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f17392f = obj2;
        this.f17390b = z10;
        this.f17391c = z11;
        this.h = obj3;
    }

    public td(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.n2 n2Var2) {
        this.f17389a = 2;
        this.d = actionBarLayout;
        this.f17390b = z10;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f17391c = z11;
        this.f17392f = n2Var;
        this.h = n2Var2;
    }
}
