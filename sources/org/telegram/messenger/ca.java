package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ca implements Utilities.Callback2 {
    public final int f19889a;
    public final MessagesController f19890b;

    public ca(MessagesController messagesController, int i10) {
        this.f19889a = i10;
        this.f19890b = messagesController;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19889a) {
            case 0:
                this.f19890b.lambda$updateWebBrowserSettings$517((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19890b.lambda$removeWebBrowserException$515((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19890b.lambda$addWebBrowserException$513((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                this.f19890b.lambda$loadStakeDiceInfo$507((TLRPC.EmojiGameInfo) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                this.f19890b.lambda$deleteReactionsFromMessage$132((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                this.f19890b.lambda$loadWebBrowserConfig$509((Long) obj, (TL_account.TL_webBrowserSettings) obj2);
                return;
            default:
                this.f19890b.lambda$clearAllWebBrowserExceptions$516((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
