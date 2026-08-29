package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ji implements Runnable {
    public final int f20697a;
    public final SendMessagesHelper f20698b;
    public final TLObject f20699c;
    public final MessageObject d;
    public final String f20700e;
    public final SendMessagesHelper.DelayedMessage f20701f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f20702n;
    public final Object f20703r;
    public final HashMap f20704s;
    public final boolean v;

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f20697a = i10;
        this.f20698b = sendMessagesHelper;
        this.f20699c = tLObject;
        this.d = messageObject;
        this.f20700e = str;
        this.f20701f = delayedMessage;
        this.h = z10;
        this.f20702n = delayedMessage2;
        this.f20703r = obj;
        this.f20704s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f20697a) {
            case 0:
                HashMap hashMap = this.f20704s;
                boolean z10 = this.v;
                Object obj = this.f20703r;
                String str = this.f20700e;
                this.f20698b.lambda$performSendMessageRequest$77(this.f20699c, this.d, str, this.f20701f, this.h, this.f20702n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f20704s;
                boolean z11 = this.v;
                Object obj2 = this.f20703r;
                String str2 = this.f20700e;
                this.f20698b.lambda$performSendMessageRequest$78(this.f20699c, this.d, str2, this.f20701f, this.h, this.f20702n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f20704s;
                boolean z12 = this.v;
                Object obj3 = this.f20703r;
                String str3 = this.f20700e;
                this.f20698b.lambda$performSendMessageRequest$82(this.f20699c, this.d, str3, this.f20701f, this.h, this.f20702n, obj3, hashMap3, z12);
                return;
        }
    }
}
