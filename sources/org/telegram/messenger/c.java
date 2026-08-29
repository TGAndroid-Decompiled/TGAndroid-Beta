package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bj0;
public final class c implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, bj0, QuickAckDelegate {
    public final int f19848a;
    public final Object f19849b;
    public final Object f19850c;

    public c(int i10, Object obj, Object obj2) {
        this.f19848a = i10;
        this.f19849b = obj;
        this.f19850c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f19849b).lambda$onDrawFaded$0((View) this.f19850c, canvas);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f19848a) {
            case 0:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f19849b, (ll) this.f19850c, c2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f19849b, (org.telegram.ui.ActionBar.o2) this.f19850c, c2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f19849b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f19850c);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f19849b, (TLRPC.User) this.f19850c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
