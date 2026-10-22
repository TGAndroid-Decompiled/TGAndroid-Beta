package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dj0;
public final class d implements org.telegram.ui.ActionBar.a2, RequestTimeDelegate, MessagesController.ErrorDelegate, dj0, QuickAckDelegate {
    public final int f18118a;
    public final Object f18119b;
    public final Object f18120c;

    public d(int i10, Object obj, Object obj2) {
        this.f18118a = i10;
        this.f18119b = obj;
        this.f18120c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f18119b).lambda$onDrawFaded$0((View) this.f18120c, canvas);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f18118a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f18119b, (org.telegram.ui.ActionBar.n2) this.f18120c, b2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f18119b, (h0) this.f18120c, b2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f18119b).lambda$performSendMessageRequest$106((TLRPC.Message) this.f18120c);
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f18119b, (org.telegram.ui.Components.zc[]) this.f18120c, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$294;
        lambda$addUsersToChat$294 = MessagesController.lambda$addUsersToChat$294((q0.a) this.f18119b, (TLRPC.User) this.f18120c, tL_error);
        return lambda$addUsersToChat$294;
    }
}
