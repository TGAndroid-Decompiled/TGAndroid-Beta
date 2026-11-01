package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fl implements RequestDelegate {
    public final int f15750a = 1;
    public final wp f15751b;
    public final int f15752c;
    public final int d;
    public final long e;
    public final long f15753f;
    public final int f15754g;
    public final int h;
    public final int f15755i;
    public final int f15756j;
    public final int f15757k;
    public final int f15758l;
    public final int f15759m;
    public final int f15760n;
    public final long f15761o;
    public final int f15762p;
    public final boolean f15763q;
    public final int f15764r;
    public final boolean f15765s;
    public final boolean f15766t;

    public fl(wp wpVar, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f15751b = wpVar;
        this.f15752c = i10;
        this.d = i11;
        this.e = j10;
        this.f15753f = j11;
        this.f15754g = i12;
        this.h = i13;
        this.f15755i = i14;
        this.f15756j = i15;
        this.f15757k = i16;
        this.f15758l = i17;
        this.f15759m = i18;
        this.f15760n = i19;
        this.f15761o = j12;
        this.f15762p = i20;
        this.f15763q = z10;
        this.f15764r = i21;
        this.f15765s = z11;
        this.f15766t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        switch (this.f15750a) {
            case 0:
                wp wpVar = this.f15751b;
                wpVar.getClass();
                long j10 = this.e;
                long j11 = this.f15753f;
                int i11 = this.f15752c;
                int i12 = this.d;
                int i13 = this.f15754g;
                int i14 = this.h;
                int i15 = this.f15755i;
                int i16 = this.f15756j;
                int i17 = this.f15757k;
                int i18 = this.f15758l;
                int i19 = this.f15759m;
                int i20 = this.f15760n;
                long j12 = this.f15761o;
                int i21 = this.f15762p;
                boolean z10 = this.f15763q;
                int i22 = this.f15764r;
                boolean z11 = this.f15765s;
                boolean z12 = this.f15766t;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages instanceof TLRPC.TL_messages_messagesNotModified)) {
                        wpVar.H3(messages_messages, messages_messages.messages.size(), j10, j11, i11, i12, i13, false, i14, i15, i16, i17, i18, i19, false, i20, j12, i21, z10, i22, z11, z12, null);
                        return;
                    }
                    return;
                } else if (tL_error != null && "SHORTCUT_INVALID".equals(tL_error.text)) {
                    wpVar.H3(new TLRPC.TL_messages_messages(), 0, j10, j11, i11, i12, i13, false, i14, i15, i16, i17, i18, i19, false, i20, j12, i21, z10, i22, z11, z12, null);
                    return;
                } else {
                    return;
                }
            default:
                wp wpVar2 = this.f15751b;
                wpVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i23 = this.d;
                        if (i23 != 0 && !messages_messages2.messages.isEmpty()) {
                            i10 = ((TLRPC.Message) i0.a.g(1, messages_messages2.messages)).f19815id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i23) {
                                        i10 = message.f19815id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i10 = this.f15752c;
                        }
                        wpVar2.H3(messages_messages2, messages_messages2.messages.size(), this.e, this.f15753f, this.f15754g, i10, i23, false, this.h, this.f15755i, this.f15756j, this.f15757k, this.f15758l, this.f15759m, false, this.f15760n, this.f15761o, this.f15762p, this.f15763q, this.f15764r, this.f15765s, this.f15766t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public fl(wp wpVar, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f15751b = wpVar;
        this.e = j10;
        this.f15753f = j11;
        this.f15752c = i10;
        this.d = i11;
        this.f15754g = i12;
        this.h = i13;
        this.f15755i = i14;
        this.f15756j = i15;
        this.f15757k = i16;
        this.f15758l = i17;
        this.f15759m = i18;
        this.f15760n = i19;
        this.f15761o = j12;
        this.f15762p = i20;
        this.f15763q = z10;
        this.f15764r = i21;
        this.f15765s = z11;
        this.f15766t = z12;
    }
}
