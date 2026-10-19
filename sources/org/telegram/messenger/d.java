package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cj0;
public final class d implements org.telegram.ui.ActionBar.a2, RequestTimeDelegate, MessagesController.ErrorDelegate, cj0, QuickAckDelegate {
    public final int f18134a;
    public final Object f18135b;
    public final Object f18136c;

    public d(int i10, Object obj, Object obj2) {
        this.f18134a = i10;
        this.f18135b = obj;
        this.f18136c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f18135b).lambda$onDrawFaded$0((View) this.f18136c, canvas);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f18134a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f18135b, (org.telegram.ui.ActionBar.n2) this.f18136c, b2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f18135b, (h0) this.f18136c, b2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f18135b).lambda$performSendMessageRequest$106((TLRPC.Message) this.f18136c);
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f18135b, (org.telegram.ui.Components.zc[]) this.f18136c, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$294;
        lambda$addUsersToChat$294 = MessagesController.lambda$addUsersToChat$294((q0.a) this.f18135b, (TLRPC.User) this.f18136c, tL_error);
        return lambda$addUsersToChat$294;
    }
}
