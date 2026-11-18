package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vk implements RequestDelegate {
    public final int f27426a = 1;
    public final mp f27427b;
    public final int f27428c;
    public final int d;
    public final long f27429e;
    public final long f27430f;
    public final int f27431g;
    public final int h;
    public final int f27432i;
    public final int f27433j;
    public final int f27434k;
    public final int f27435l;
    public final int f27436m;
    public final int f27437n;
    public final long f27438o;
    public final int f27439p;
    public final boolean f27440q;
    public final int f27441r;
    public final boolean f27442s;
    public final boolean f27443t;

    public vk(mp mpVar, int i7, int i10, long j3, long j10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27427b = mpVar;
        this.f27428c = i7;
        this.d = i10;
        this.f27429e = j3;
        this.f27430f = j10;
        this.f27431g = i11;
        this.h = i12;
        this.f27432i = i13;
        this.f27433j = i14;
        this.f27434k = i15;
        this.f27435l = i16;
        this.f27436m = i17;
        this.f27437n = i18;
        this.f27438o = j11;
        this.f27439p = i19;
        this.f27440q = z10;
        this.f27441r = i20;
        this.f27442s = z11;
        this.f27443t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f27426a) {
            case 0:
                mp mpVar = this.f27427b;
                mpVar.getClass();
                long j3 = this.f27429e;
                long j10 = this.f27430f;
                int i10 = this.f27428c;
                int i11 = this.d;
                int i12 = this.f27431g;
                int i13 = this.h;
                int i14 = this.f27432i;
                int i15 = this.f27433j;
                int i16 = this.f27434k;
                int i17 = this.f27435l;
                int i18 = this.f27436m;
                int i19 = this.f27437n;
                long j11 = this.f27438o;
                int i20 = this.f27439p;
                boolean z10 = this.f27440q;
                int i21 = this.f27441r;
                boolean z11 = this.f27442s;
                boolean z12 = this.f27443t;
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
                mp mpVar2 = this.f27427b;
                mpVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i22 = this.d;
                        if (i22 != 0 && !messages_messages2.messages.isEmpty()) {
                            i7 = ((TLRPC.Message) i5.c.h(1, messages_messages2.messages)).f28426id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i22) {
                                        i7 = message.f28426id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i7 = this.f27428c;
                        }
                        mpVar2.R3(messages_messages2, messages_messages2.messages.size(), this.f27429e, this.f27430f, this.f27431g, i7, i22, false, this.h, this.f27432i, this.f27433j, this.f27434k, this.f27435l, this.f27436m, false, this.f27437n, this.f27438o, this.f27439p, this.f27440q, this.f27441r, this.f27442s, this.f27443t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vk(mp mpVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27427b = mpVar;
        this.f27429e = j3;
        this.f27430f = j10;
        this.f27428c = i7;
        this.d = i10;
        this.f27431g = i11;
        this.h = i12;
        this.f27432i = i13;
        this.f27433j = i14;
        this.f27434k = i15;
        this.f27435l = i16;
        this.f27436m = i17;
        this.f27437n = i18;
        this.f27438o = j11;
        this.f27439p = i19;
        this.f27440q = z10;
        this.f27441r = i20;
        this.f27442s = z11;
        this.f27443t = z12;
    }
}
