package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wj0;
public final class d implements org.telegram.ui.ActionBar.a2, RequestTimeDelegate, MessagesController.ErrorDelegate, wj0, QuickAckDelegate {
    public final int f16149a;
    public final Object f16150b;
    public final Object f16151c;

    public d(int i10, Object obj, Object obj2) {
        this.f16149a = i10;
        this.f16150b = obj;
        this.f16151c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f16150b).lambda$onDrawFaded$0((View) this.f16151c, canvas);
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f16149a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f16150b, (org.telegram.ui.ActionBar.n2) this.f16151c, b2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f16150b, (f0) this.f16151c, b2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f16150b).lambda$performSendMessageRequest$103((TLRPC.Message) this.f16151c);
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f16150b, (org.telegram.ui.Components.zc[]) this.f16151c, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.f16150b, (TLRPC.User) this.f16151c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
