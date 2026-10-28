package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ga implements Utilities.Callback2 {
    public final int f20156a;
    public final MessagesController f20157b;

    public ga(MessagesController messagesController, int i10) {
        this.f20156a = i10;
        this.f20157b = messagesController;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20156a) {
            case 0:
                this.f20157b.lambda$updateWebBrowserSettings$523((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f20157b.lambda$removeWebBrowserException$521((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f20157b.lambda$addWebBrowserException$519((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                this.f20157b.lambda$loadStakeDiceInfo$513((TLRPC.EmojiGameInfo) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                this.f20157b.lambda$deleteReactionsFromMessage$131((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                this.f20157b.lambda$loadWebBrowserConfig$515((Long) obj, (TL_account.TL_webBrowserSettings) obj2);
                return;
            default:
                this.f20157b.lambda$clearAllWebBrowserExceptions$522((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
