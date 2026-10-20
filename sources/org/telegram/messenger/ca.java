package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ca implements Utilities.Callback2 {
    public final int f18037a;
    public final MessagesController f18038b;

    public ca(MessagesController messagesController, int i10) {
        this.f18037a = i10;
        this.f18038b = messagesController;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18037a) {
            case 0:
                this.f18038b.lambda$updateWebBrowserSettings$520((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f18038b.lambda$removeWebBrowserException$518((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f18038b.lambda$addWebBrowserException$516((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                this.f18038b.lambda$loadStakeDiceInfo$510((TLRPC.EmojiGameInfo) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                this.f18038b.lambda$deleteReactionsFromMessage$131((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                this.f18038b.lambda$loadWebBrowserConfig$512((Long) obj, (TL_account.TL_webBrowserSettings) obj2);
                return;
            default:
                this.f18038b.lambda$clearAllWebBrowserExceptions$519((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
