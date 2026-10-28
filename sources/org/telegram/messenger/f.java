package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gj0;
public final class f implements org.telegram.ui.ActionBar.b2, RequestTimeDelegate, MessagesController.ErrorDelegate, gj0, QuickAckDelegate {
    public final int f20030a;
    public final Object f20031b;
    public final Object f20032c;

    public f(int i10, Object obj, Object obj2) {
        this.f20030a = i10;
        this.f20031b = obj;
        this.f20032c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f20031b).lambda$onDrawFaded$0((View) this.f20032c, canvas);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f20030a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f20031b, (org.telegram.ui.ActionBar.r2) this.f20032c, e2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f20031b, (j0) this.f20032c, e2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f20031b).lambda$performSendMessageRequest$106((TLRPC.Message) this.f20032c);
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f20031b, (org.telegram.ui.Components.yc[]) this.f20032c, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$294;
        lambda$addUsersToChat$294 = MessagesController.lambda$addUsersToChat$294((q0.a) this.f20031b, (TLRPC.User) this.f20032c, tL_error);
        return lambda$addUsersToChat$294;
    }
}
