package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vk implements RequestDelegate {
    public final int f27424a = 1;
    public final mp f27425b;
    public final int f27426c;
    public final int d;
    public final long f27427e;
    public final long f27428f;
    public final int f27429g;
    public final int h;
    public final int f27430i;
    public final int f27431j;
    public final int f27432k;
    public final int f27433l;
    public final int f27434m;
    public final int f27435n;
    public final long f27436o;
    public final int f27437p;
    public final boolean f27438q;
    public final int f27439r;
    public final boolean f27440s;
    public final boolean f27441t;

    public vk(mp mpVar, int i7, int i10, long j3, long j10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27425b = mpVar;
        this.f27426c = i7;
        this.d = i10;
        this.f27427e = j3;
        this.f27428f = j10;
        this.f27429g = i11;
        this.h = i12;
        this.f27430i = i13;
        this.f27431j = i14;
        this.f27432k = i15;
        this.f27433l = i16;
        this.f27434m = i17;
        this.f27435n = i18;
        this.f27436o = j11;
        this.f27437p = i19;
        this.f27438q = z10;
        this.f27439r = i20;
        this.f27440s = z11;
        this.f27441t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f27424a) {
            case 0:
                mp mpVar = this.f27425b;
                mpVar.getClass();
                long j3 = this.f27427e;
                long j10 = this.f27428f;
                int i10 = this.f27426c;
                int i11 = this.d;
                int i12 = this.f27429g;
                int i13 = this.h;
                int i14 = this.f27430i;
                int i15 = this.f27431j;
                int i16 = this.f27432k;
                int i17 = this.f27433l;
                int i18 = this.f27434m;
                int i19 = this.f27435n;
                long j11 = this.f27436o;
                int i20 = this.f27437p;
                boolean z10 = this.f27438q;
                int i21 = this.f27439r;
                boolean z11 = this.f27440s;
                boolean z12 = this.f27441t;
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
                mp mpVar2 = this.f27425b;
                mpVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i22 = this.d;
                        if (i22 != 0 && !messages_messages2.messages.isEmpty()) {
                            i7 = ((TLRPC.Message) i5.c.h(1, messages_messages2.messages)).f28424id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i22) {
                                        i7 = message.f28424id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i7 = this.f27426c;
                        }
                        mpVar2.R3(messages_messages2, messages_messages2.messages.size(), this.f27427e, this.f27428f, this.f27429g, i7, i22, false, this.h, this.f27430i, this.f27431j, this.f27432k, this.f27433l, this.f27434m, false, this.f27435n, this.f27436o, this.f27437p, this.f27438q, this.f27439r, this.f27440s, this.f27441t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vk(mp mpVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27425b = mpVar;
        this.f27427e = j3;
        this.f27428f = j10;
        this.f27426c = i7;
        this.d = i10;
        this.f27429g = i11;
        this.h = i12;
        this.f27430i = i13;
        this.f27431j = i14;
        this.f27432k = i15;
        this.f27433l = i16;
        this.f27434m = i17;
        this.f27435n = i18;
        this.f27436o = j11;
        this.f27437p = i19;
        this.f27438q = z10;
        this.f27439r = i20;
        this.f27440s = z11;
        this.f27441t = z12;
    }
}
