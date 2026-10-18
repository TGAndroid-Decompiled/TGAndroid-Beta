package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fj0;
public final class d implements org.telegram.ui.ActionBar.a2, RequestTimeDelegate, MessagesController.ErrorDelegate, fj0, QuickAckDelegate {
    public final int f18144a;
    public final Object f18145b;
    public final Object f18146c;

    public d(int i10, Object obj, Object obj2) {
        this.f18144a = i10;
        this.f18145b = obj;
        this.f18146c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f18145b).lambda$onDrawFaded$0((View) this.f18146c, canvas);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f18144a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f18145b, (org.telegram.ui.ActionBar.n2) this.f18146c, b2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f18145b, (h0) this.f18146c, b2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f18145b).lambda$performSendMessageRequest$106((TLRPC.Message) this.f18146c);
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f18145b, (org.telegram.ui.Components.zc[]) this.f18146c, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$294;
        lambda$addUsersToChat$294 = MessagesController.lambda$addUsersToChat$294((q0.a) this.f18145b, (TLRPC.User) this.f18146c, tL_error);
        return lambda$addUsersToChat$294;
    }
}
