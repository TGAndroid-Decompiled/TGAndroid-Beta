package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ea implements Utilities.Callback2 {
    public final int f16853a;
    public final MessagesController f16854b;

    public ea(MessagesController messagesController, int i10) {
        this.f16853a = i10;
        this.f16854b = messagesController;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16853a) {
            case 0:
                this.f16854b.lambda$updateWebBrowserSettings$520((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f16854b.lambda$removeWebBrowserException$518((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f16854b.lambda$addWebBrowserException$516((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                this.f16854b.lambda$loadStakeDiceInfo$510((TLRPC.EmojiGameInfo) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                this.f16854b.lambda$deleteReactionsFromMessage$131((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                this.f16854b.lambda$loadWebBrowserConfig$512((Long) obj, (TL_account.TL_webBrowserSettings) obj2);
                return;
            default:
                this.f16854b.lambda$clearAllWebBrowserExceptions$519((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
