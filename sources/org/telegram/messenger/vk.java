package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vk implements RequestDelegate {
    public final int f27452a = 1;
    public final mp f27453b;
    public final int f27454c;
    public final int d;
    public final long f27455e;
    public final long f27456f;
    public final int f27457g;
    public final int h;
    public final int f27458i;
    public final int f27459j;
    public final int f27460k;
    public final int f27461l;
    public final int f27462m;
    public final int f27463n;
    public final long f27464o;
    public final int f27465p;
    public final boolean f27466q;
    public final int f27467r;
    public final boolean f27468s;
    public final boolean f27469t;

    public vk(mp mpVar, int i7, int i10, long j3, long j10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27453b = mpVar;
        this.f27454c = i7;
        this.d = i10;
        this.f27455e = j3;
        this.f27456f = j10;
        this.f27457g = i11;
        this.h = i12;
        this.f27458i = i13;
        this.f27459j = i14;
        this.f27460k = i15;
        this.f27461l = i16;
        this.f27462m = i17;
        this.f27463n = i18;
        this.f27464o = j11;
        this.f27465p = i19;
        this.f27466q = z10;
        this.f27467r = i20;
        this.f27468s = z11;
        this.f27469t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f27452a) {
            case 0:
                mp mpVar = this.f27453b;
                mpVar.getClass();
                long j3 = this.f27455e;
                long j10 = this.f27456f;
                int i10 = this.f27454c;
                int i11 = this.d;
                int i12 = this.f27457g;
                int i13 = this.h;
                int i14 = this.f27458i;
                int i15 = this.f27459j;
                int i16 = this.f27460k;
                int i17 = this.f27461l;
                int i18 = this.f27462m;
                int i19 = this.f27463n;
                long j11 = this.f27464o;
                int i20 = this.f27465p;
                boolean z10 = this.f27466q;
                int i21 = this.f27467r;
                boolean z11 = this.f27468s;
                boolean z12 = this.f27469t;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages instanceof TLRPC.TL_messages_messagesNotModified)) {
                        mpVar.R3(messages_messages, messages_messages.messages.size(), j3, j10, i10, i11, i12, false, i13, i14, i15, i16, i17, i18, false, i19, j11, i20, z10, i21, z11, z12, null);
                        return;
                    }
                    return;
                } else if (tL_error != null && "SHORTCUT_INVALID".equals(tL_error.text)) {
                    mpVar.R3(new TLRPC.TL_messages_messages(), 0, j3, j10, i10, i11, i12, false, i13, i14, i15, i16, i17, i18, false, i19, j11, i20, z10, i21, z11, z12, null);
                    return;
                } else {
                    return;
                }
            default:
                mp mpVar2 = this.f27453b;
                mpVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i22 = this.d;
                        if (i22 != 0 && !messages_messages2.messages.isEmpty()) {
                            i7 = ((TLRPC.Message) i5.c.h(1, messages_messages2.messages)).f28452id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i22) {
                                        i7 = message.f28452id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i7 = this.f27454c;
                        }
                        mpVar2.R3(messages_messages2, messages_messages2.messages.size(), this.f27455e, this.f27456f, this.f27457g, i7, i22, false, this.h, this.f27458i, this.f27459j, this.f27460k, this.f27461l, this.f27462m, false, this.f27463n, this.f27464o, this.f27465p, this.f27466q, this.f27467r, this.f27468s, this.f27469t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vk(mp mpVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27453b = mpVar;
        this.f27455e = j3;
        this.f27456f = j10;
        this.f27454c = i7;
        this.d = i10;
        this.f27457g = i11;
        this.h = i12;
        this.f27458i = i13;
        this.f27459j = i14;
        this.f27460k = i15;
        this.f27461l = i16;
        this.f27462m = i17;
        this.f27463n = i18;
        this.f27464o = j11;
        this.f27465p = i19;
        this.f27466q = z10;
        this.f27467r = i20;
        this.f27468s = z11;
        this.f27469t = z12;
    }
}
