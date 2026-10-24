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
public final class d implements org.telegram.ui.ActionBar.z1, RequestTimeDelegate, MessagesController.ErrorDelegate, gj0, QuickAckDelegate {
    public final int f18181a;
    public final Object f18182b;
    public final Object f18183c;

    public d(int i10, Object obj, Object obj2) {
        this.f18181a = i10;
        this.f18182b = obj;
        this.f18183c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.f18182b).lambda$onDrawFaded$0((View) this.f18183c, canvas);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f18181a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.f18182b, (org.telegram.ui.ActionBar.o2) this.f18183c, c2Var, i10);
                return;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.f18182b, (g0) this.f18183c, c2Var, i10);
                return;
        }
    }

    @Override
    public void run() {
        ((SendMessagesHelper) this.f18182b).lambda$performSendMessageRequest$106((TLRPC.Message) this.f18183c);
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.f18182b, (org.telegram.ui.Components.xc[]) this.f18183c, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$294;
        lambda$addUsersToChat$294 = MessagesController.lambda$addUsersToChat$294((q0.a) this.f18182b, (TLRPC.User) this.f18183c, tL_error);
        return lambda$addUsersToChat$294;
    }
}
