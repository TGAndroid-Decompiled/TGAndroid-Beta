package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ba implements Utilities.Callback2 {
    public final int f19699a;
    public final MessagesController f19700b;

    public ba(MessagesController messagesController, int i10) {
        this.f19699a = i10;
        this.f19700b = messagesController;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19699a) {
            case 0:
                this.f19700b.lambda$updateWebBrowserSettings$522((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19700b.lambda$removeWebBrowserException$520((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19700b.lambda$addWebBrowserException$518((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                this.f19700b.lambda$loadStakeDiceInfo$512((TLRPC.EmojiGameInfo) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                this.f19700b.lambda$deleteReactionsFromMessage$131((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                this.f19700b.lambda$loadWebBrowserConfig$514((Long) obj, (TL_account.TL_webBrowserSettings) obj2);
                return;
            default:
                this.f19700b.lambda$clearAllWebBrowserExceptions$521((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
