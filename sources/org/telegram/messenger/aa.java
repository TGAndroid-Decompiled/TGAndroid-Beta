package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class aa implements Utilities.Callback2 {

    public final int f19690a;

    public final MessagesController f19691b;

    public aa(MessagesController messagesController, int i10) {
        this.f19690a = i10;
        this.f19691b = messagesController;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19690a) {
            case 0:
                this.f19691b.lambda$updateWebBrowserSettings$517((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                this.f19691b.lambda$removeWebBrowserException$515((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                this.f19691b.lambda$addWebBrowserException$513((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                this.f19691b.lambda$loadStakeDiceInfo$507((TLRPC.EmojiGameInfo) obj, (TLRPC.TL_error) obj2);
                break;
            case 4:
                this.f19691b.lambda$deleteReactionsFromMessage$132((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                this.f19691b.lambda$loadWebBrowserConfig$509((Long) obj, (TL_account.TL_webBrowserSettings) obj2);
                break;
            default:
                this.f19691b.lambda$clearAllWebBrowserExceptions$516((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
