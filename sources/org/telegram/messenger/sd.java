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
public final class sd implements Runnable {
    public final int f17531a;
    public final boolean f17532b;
    public final boolean f17533c;
    public final Object d;
    public final Object e;
    public final Object f17534f;
    public final Object h;

    public sd(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.f17531a = 0;
        this.d = messagesController;
        this.e = tL_error;
        this.f17534f = m2Var;
        this.h = tL_channels_editAdmin;
        this.f17532b = z10;
        this.f17533c = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f17531a;
        Object obj = this.h;
        Object obj2 = this.f17534f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ((MessagesController) obj4).lambda$setUserAdminRole$101((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.m2) obj2, (TLRPC.TL_channels_editAdmin) obj, this.f17532b, this.f17533c);
                return;
            case 1:
                ((NotificationsController) obj4).lambda$processNewMessages$27((ArrayList) obj3, (ArrayList) obj2, this.f17532b, this.f17533c, (CountDownLatch) obj);
                return;
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj;
                if (this.f17532b) {
                    actionBarLayout.h = true;
                    actionBarLayout.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f18604a0 = false;
                    actionBarLayout.f18640s.setScaleX(1.0f);
                    actionBarLayout.f18640s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f18600p1;
                    actionBarLayout.T(m2Var, this.f17533c);
                    actionBarLayout.f18640s.setTranslationX(0.0f);
                }
                if (m2Var != null) {
                    m2Var.onTransitionAnimationEnd(false, false);
                }
                m2Var2.onTransitionAnimationEnd(true, false);
                m2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.a0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f17532b, this.f17533c, (Runnable) obj);
                return;
        }
    }

    public sd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f17531a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f17534f = obj2;
        this.f17532b = z10;
        this.f17533c = z11;
        this.h = obj3;
    }

    public sd(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.m2 m2Var2) {
        this.f17531a = 2;
        this.d = actionBarLayout;
        this.f17532b = z10;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f17533c = z11;
        this.f17534f = m2Var;
        this.h = m2Var2;
    }
}
