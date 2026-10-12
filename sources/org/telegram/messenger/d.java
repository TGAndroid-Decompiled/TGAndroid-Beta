package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zj0;
public final class d implements org.telegram.ui.ActionBar.z1, RequestTimeDelegate, MessagesController.ErrorDelegate, zj0, QuickAckDelegate {
    public final int f17030a;
    public final Object f17031b;
    public final Object f17032c;

    public d(int i10, Object obj, Object obj2) {
        this.f17030a = i10;
        this.f17031b = obj;
        this.f17032c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f17031b).lambda$onDrawFaded$0((View) this.f17032c, canvas);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f17030a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f17031b, (org.telegram.ui.ActionBar.m2) this.f17032c, a2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f17031b, (h0) this.f17032c, a2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f17031b).lambda$performSendMessageRequest$106((TLRPC.Message) this.f17032c);
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f17031b, (org.telegram.ui.Components.bd[]) this.f17032c, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$294;
        lambda$addUsersToChat$294 = MessagesController.lambda$addUsersToChat$294((q0.a) this.f17031b, (TLRPC.User) this.f17032c, tL_error);
        return lambda$addUsersToChat$294;
    }
}
