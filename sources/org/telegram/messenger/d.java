package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yj0;
public final class d implements org.telegram.ui.ActionBar.z1, RequestTimeDelegate, MessagesController.ErrorDelegate, yj0, QuickAckDelegate {
    public final int f16728a;
    public final Object f16729b;
    public final Object f16730c;

    public d(int i10, Object obj, Object obj2) {
        this.f16728a = i10;
        this.f16729b = obj;
        this.f16730c = obj2;
    }

    @Override
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f16729b).lambda$onDrawFaded$0((View) this.f16730c, canvas);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f16728a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f16729b, (org.telegram.ui.ActionBar.m2) this.f16730c, a2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f16729b, (h0) this.f16730c, a2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f16729b).lambda$performSendMessageRequest$106((TLRPC.Message) this.f16730c);
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f16729b, (org.telegram.ui.Components.bd[]) this.f16730c, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$294;
        lambda$addUsersToChat$294 = MessagesController.lambda$addUsersToChat$294((q0.a) this.f16729b, (TLRPC.User) this.f16730c, tL_error);
        return lambda$addUsersToChat$294;
    }
}
