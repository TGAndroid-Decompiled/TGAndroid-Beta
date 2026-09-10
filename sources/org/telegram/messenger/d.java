package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uj0;
public final class d implements org.telegram.ui.ActionBar.c2, RequestTimeDelegate, MessagesController.ErrorDelegate, uj0, QuickAckDelegate {
    public final int f14951a;
    public final Object f14952b;
    public final Object f14953c;

    public d(int i10, Object obj, Object obj2) {
        this.f14951a = i10;
        this.f14952b = obj;
        this.f14953c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f14952b).lambda$onDrawFaded$0((View) this.f14953c, canvas);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f14951a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f14952b, (org.telegram.ui.ActionBar.p2) this.f14953c, d2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f14952b, (f0) this.f14953c, d2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f14952b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f14953c);
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f14952b, (org.telegram.ui.Components.yc[]) this.f14953c, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f14952b, (TLRPC.User) this.f14953c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
