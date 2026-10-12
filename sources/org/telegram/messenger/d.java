package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vj0;
public final class d implements org.telegram.ui.ActionBar.z1, RequestTimeDelegate, MessagesController.ErrorDelegate, vj0, QuickAckDelegate {
    public final int f17350a;
    public final Object f17351b;
    public final Object f17352c;

    public d(int i10, Object obj, Object obj2) {
        this.f17350a = i10;
        this.f17351b = obj;
        this.f17352c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f17351b).lambda$onDrawFaded$0((View) this.f17352c, canvas);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f17350a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f17351b, (org.telegram.ui.ActionBar.m2) this.f17352c, a2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f17351b, (h0) this.f17352c, a2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f17351b).lambda$performSendMessageRequest$106((TLRPC.Message) this.f17352c);
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f17351b, (org.telegram.ui.Components.bd[]) this.f17352c, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$294;
        lambda$addUsersToChat$294 = MessagesController.lambda$addUsersToChat$294((q0.a) this.f17351b, (TLRPC.User) this.f17352c, tL_error);
        return lambda$addUsersToChat$294;
    }
}
