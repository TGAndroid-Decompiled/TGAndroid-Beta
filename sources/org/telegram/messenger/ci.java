package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ci implements Runnable {
    public final int f20011a;
    public final SendMessagesHelper f20012b;
    public final TLObject f20013c;
    public final MessageObject d;
    public final String f20014e;
    public final SendMessagesHelper.DelayedMessage f20015f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f20016n;
    public final Object f20017r;
    public final HashMap f20018s;
    public final boolean v;

    public ci(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i9) {
        this.f20011a = i9;
        this.f20012b = sendMessagesHelper;
        this.f20013c = tLObject;
        this.d = messageObject;
        this.f20014e = str;
        this.f20015f = delayedMessage;
        this.h = z10;
        this.f20016n = delayedMessage2;
        this.f20017r = obj;
        this.f20018s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f20011a) {
            case 0:
                HashMap hashMap = this.f20018s;
                boolean z10 = this.v;
                Object obj = this.f20017r;
                String str = this.f20014e;
                this.f20012b.lambda$performSendMessageRequest$77(this.f20013c, this.d, str, this.f20015f, this.h, this.f20016n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f20018s;
                boolean z11 = this.v;
                Object obj2 = this.f20017r;
                String str2 = this.f20014e;
                this.f20012b.lambda$performSendMessageRequest$78(this.f20013c, this.d, str2, this.f20015f, this.h, this.f20016n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f20018s;
                boolean z12 = this.v;
                Object obj3 = this.f20017r;
                String str3 = this.f20014e;
                this.f20012b.lambda$performSendMessageRequest$82(this.f20013c, this.d, str3, this.f20015f, this.h, this.f20016n, obj3, hashMap3, z12);
                return;
        }
    }
}
