package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ba implements Utilities.Callback2 {
    public final int f17418a;
    public final MessagesController f17419b;

    public ba(MessagesController messagesController, int i10) {
        this.f17418a = i10;
        this.f17419b = messagesController;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17418a) {
            case 0:
                this.f17419b.lambda$updateWebBrowserSettings$520((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17419b.lambda$removeWebBrowserException$518((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f17419b.lambda$addWebBrowserException$516((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                this.f17419b.lambda$loadStakeDiceInfo$510((TLRPC.EmojiGameInfo) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                this.f17419b.lambda$deleteReactionsFromMessage$131((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                this.f17419b.lambda$loadWebBrowserConfig$512((Long) obj, (TL_account.TL_webBrowserSettings) obj2);
                return;
            default:
                this.f17419b.lambda$clearAllWebBrowserExceptions$519((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
