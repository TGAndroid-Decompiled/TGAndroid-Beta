package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vk implements RequestDelegate {
    public final int f27520a = 1;
    public final mp f27521b;
    public final int f27522c;
    public final int d;
    public final long f27523e;
    public final long f27524f;
    public final int f27525g;
    public final int h;
    public final int f27526i;
    public final int f27527j;
    public final int f27528k;
    public final int f27529l;
    public final int f27530m;
    public final int f27531n;
    public final long f27532o;
    public final int f27533p;
    public final boolean f27534q;
    public final int f27535r;
    public final boolean f27536s;
    public final boolean f27537t;

    public vk(mp mpVar, int i7, int i10, long j3, long j10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27521b = mpVar;
        this.f27522c = i7;
        this.d = i10;
        this.f27523e = j3;
        this.f27524f = j10;
        this.f27525g = i11;
        this.h = i12;
        this.f27526i = i13;
        this.f27527j = i14;
        this.f27528k = i15;
        this.f27529l = i16;
        this.f27530m = i17;
        this.f27531n = i18;
        this.f27532o = j11;
        this.f27533p = i19;
        this.f27534q = z10;
        this.f27535r = i20;
        this.f27536s = z11;
        this.f27537t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f27520a) {
            case 0:
                mp mpVar = this.f27521b;
                mpVar.getClass();
                long j3 = this.f27523e;
                long j10 = this.f27524f;
                int i10 = this.f27522c;
                int i11 = this.d;
                int i12 = this.f27525g;
                int i13 = this.h;
                int i14 = this.f27526i;
                int i15 = this.f27527j;
                int i16 = this.f27528k;
                int i17 = this.f27529l;
                int i18 = this.f27530m;
                int i19 = this.f27531n;
                long j11 = this.f27532o;
                int i20 = this.f27533p;
                boolean z10 = this.f27534q;
                int i21 = this.f27535r;
                boolean z11 = this.f27536s;
                boolean z12 = this.f27537t;
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
                mp mpVar2 = this.f27521b;
                mpVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i22 = this.d;
                        if (i22 != 0 && !messages_messages2.messages.isEmpty()) {
                            i7 = ((TLRPC.Message) i5.c.h(1, messages_messages2.messages)).f28513id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i22) {
                                        i7 = message.f28513id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i7 = this.f27522c;
                        }
                        mpVar2.R3(messages_messages2, messages_messages2.messages.size(), this.f27523e, this.f27524f, this.f27525g, i7, i22, false, this.h, this.f27526i, this.f27527j, this.f27528k, this.f27529l, this.f27530m, false, this.f27531n, this.f27532o, this.f27533p, this.f27534q, this.f27535r, this.f27536s, this.f27537t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vk(mp mpVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27521b = mpVar;
        this.f27523e = j3;
        this.f27524f = j10;
        this.f27522c = i7;
        this.d = i10;
        this.f27525g = i11;
        this.h = i12;
        this.f27526i = i13;
        this.f27527j = i14;
        this.f27528k = i15;
        this.f27529l = i16;
        this.f27530m = i17;
        this.f27531n = i18;
        this.f27532o = j11;
        this.f27533p = i19;
        this.f27534q = z10;
        this.f27535r = i20;
        this.f27536s = z11;
        this.f27537t = z12;
    }
}
