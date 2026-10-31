package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class el implements RequestDelegate {
    public final int f15409a = 1;
    public final vp f15410b;
    public final int f15411c;
    public final int d;
    public final long e;
    public final long f15412f;
    public final int f15413g;
    public final int h;
    public final int f15414i;
    public final int f15415j;
    public final int f15416k;
    public final int f15417l;
    public final int f15418m;
    public final int f15419n;
    public final long f15420o;
    public final int f15421p;
    public final boolean f15422q;
    public final int f15423r;
    public final boolean f15424s;
    public final boolean f15425t;

    public el(vp vpVar, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f15410b = vpVar;
        this.f15411c = i10;
        this.d = i11;
        this.e = j10;
        this.f15412f = j11;
        this.f15413g = i12;
        this.h = i13;
        this.f15414i = i14;
        this.f15415j = i15;
        this.f15416k = i16;
        this.f15417l = i17;
        this.f15418m = i18;
        this.f15419n = i19;
        this.f15420o = j12;
        this.f15421p = i20;
        this.f15422q = z10;
        this.f15423r = i21;
        this.f15424s = z11;
        this.f15425t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        switch (this.f15409a) {
            case 0:
                vp vpVar = this.f15410b;
                vpVar.getClass();
                long j10 = this.e;
                long j11 = this.f15412f;
                int i11 = this.f15411c;
                int i12 = this.d;
                int i13 = this.f15413g;
                int i14 = this.h;
                int i15 = this.f15414i;
                int i16 = this.f15415j;
                int i17 = this.f15416k;
                int i18 = this.f15417l;
                int i19 = this.f15418m;
                int i20 = this.f15419n;
                long j12 = this.f15420o;
                int i21 = this.f15421p;
                boolean z10 = this.f15422q;
                int i22 = this.f15423r;
                boolean z11 = this.f15424s;
                boolean z12 = this.f15425t;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages instanceof TLRPC.TL_messages_messagesNotModified)) {
                        vpVar.H3(messages_messages, messages_messages.messages.size(), j10, j11, i11, i12, i13, false, i14, i15, i16, i17, i18, i19, false, i20, j12, i21, z10, i22, z11, z12, null);
                        return;
                    }
                    return;
                } else if (tL_error != null && "SHORTCUT_INVALID".equals(tL_error.text)) {
                    vpVar.H3(new TLRPC.TL_messages_messages(), 0, j10, j11, i11, i12, i13, false, i14, i15, i16, i17, i18, i19, false, i20, j12, i21, z10, i22, z11, z12, null);
                    return;
                } else {
                    return;
                }
            default:
                vp vpVar2 = this.f15410b;
                vpVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i23 = this.d;
                        if (i23 != 0 && !messages_messages2.messages.isEmpty()) {
                            i10 = ((TLRPC.Message) i0.a.g(1, messages_messages2.messages)).f19814id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i23) {
                                        i10 = message.f19814id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i10 = this.f15411c;
                        }
                        vpVar2.H3(messages_messages2, messages_messages2.messages.size(), this.e, this.f15412f, this.f15413g, i10, i23, false, this.h, this.f15414i, this.f15415j, this.f15416k, this.f15417l, this.f15418m, false, this.f15419n, this.f15420o, this.f15421p, this.f15422q, this.f15423r, this.f15424s, this.f15425t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public el(vp vpVar, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f15410b = vpVar;
        this.e = j10;
        this.f15412f = j11;
        this.f15411c = i10;
        this.d = i11;
        this.f15413g = i12;
        this.h = i13;
        this.f15414i = i14;
        this.f15415j = i15;
        this.f15416k = i16;
        this.f15417l = i17;
        this.f15418m = i18;
        this.f15419n = i19;
        this.f15420o = j12;
        this.f15421p = i20;
        this.f15422q = z10;
        this.f15423r = i21;
        this.f15424s = z11;
        this.f15425t = z12;
    }
}
