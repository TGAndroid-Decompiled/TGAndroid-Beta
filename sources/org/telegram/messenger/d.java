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
public final class d implements org.telegram.ui.ActionBar.a2, RequestTimeDelegate, MessagesController.ErrorDelegate, uj0, QuickAckDelegate {
    public final int f17608a;
    public final Object f17609b;
    public final Object f17610c;

    public d(int i10, Object obj, Object obj2) {
        this.f17608a = i10;
        this.f17609b = obj;
        this.f17610c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f17609b).lambda$onDrawFaded$0((View) this.f17610c, canvas);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f17608a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f17609b, (org.telegram.ui.ActionBar.n2) this.f17610c, b2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f17609b, (g0) this.f17610c, b2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f17609b).lambda$performSendMessageRequest$106((TLRPC.Message) this.f17610c);
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f17609b, (org.telegram.ui.Components.cd[]) this.f17610c, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$294;
        lambda$addUsersToChat$294 = MessagesController.lambda$addUsersToChat$294((q0.a) this.f17609b, (TLRPC.User) this.f17610c, tL_error);
        return lambda$addUsersToChat$294;
    }
}
