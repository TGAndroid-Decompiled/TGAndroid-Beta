package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rk implements RequestDelegate {
    public final int f25162a = 1;
    public final hp f25163b;
    public final int f25164c;
    public final int d;
    public final long f25165e;
    public final long f25166f;
    public final int f25167g;
    public final int h;
    public final int f25168i;
    public final int f25169j;
    public final int f25170k;
    public final int f25171l;
    public final int f25172m;
    public final int f25173n;
    public final long f25174o;
    public final int f25175p;
    public final boolean f25176q;
    public final int f25177r;
    public final boolean f25178s;
    public final boolean f25179t;

    public rk(hp hpVar, int i3, int i10, long j10, long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f25163b = hpVar;
        this.f25164c = i3;
        this.d = i10;
        this.f25165e = j10;
        this.f25166f = j11;
        this.f25167g = i11;
        this.h = i12;
        this.f25168i = i13;
        this.f25169j = i14;
        this.f25170k = i15;
        this.f25171l = i16;
        this.f25172m = i17;
        this.f25173n = i18;
        this.f25174o = j12;
        this.f25175p = i19;
        this.f25176q = z10;
        this.f25177r = i20;
        this.f25178s = z11;
        this.f25179t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3;
        switch (this.f25162a) {
            case 0:
                hp hpVar = this.f25163b;
                hpVar.getClass();
                long j10 = this.f25165e;
                long j11 = this.f25166f;
                int i10 = this.f25164c;
                int i11 = this.d;
                int i12 = this.f25167g;
                int i13 = this.h;
                int i14 = this.f25168i;
                int i15 = this.f25169j;
                int i16 = this.f25170k;
                int i17 = this.f25171l;
                int i18 = this.f25172m;
                int i19 = this.f25173n;
                long j12 = this.f25174o;
                int i20 = this.f25175p;
                boolean z10 = this.f25176q;
                int i21 = this.f25177r;
                boolean z11 = this.f25178s;
                boolean z12 = this.f25179t;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages instanceof TLRPC.TL_messages_messagesNotModified)) {
                        hpVar.K3(messages_messages, messages_messages.messages.size(), j10, j11, i10, i11, i12, false, i13, i14, i15, i16, i17, i18, false, i19, j12, i20, z10, i21, z11, z12, null);
                        return;
                    }
                    return;
                } else if (tL_error != null && "SHORTCUT_INVALID".equals(tL_error.text)) {
                    hpVar.K3(new TLRPC.TL_messages_messages(), 0, j10, j11, i10, i11, i12, false, i13, i14, i15, i16, i17, i18, false, i19, j12, i20, z10, i21, z11, z12, null);
                    return;
                } else {
                    return;
                }
            default:
                hp hpVar2 = this.f25163b;
                hpVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i22 = this.d;
                        if (i22 != 0 && !messages_messages2.messages.isEmpty()) {
                            i3 = ((TLRPC.Message) k2.p1.h(1, messages_messages2.messages)).f27022id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i22) {
                                        i3 = message.f27022id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i3 = this.f25164c;
                        }
                        hpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.f25165e, this.f25166f, this.f25167g, i3, i22, false, this.h, this.f25168i, this.f25169j, this.f25170k, this.f25171l, this.f25172m, false, this.f25173n, this.f25174o, this.f25175p, this.f25176q, this.f25177r, this.f25178s, this.f25179t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public rk(hp hpVar, long j10, long j11, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f25163b = hpVar;
        this.f25165e = j10;
        this.f25166f = j11;
        this.f25164c = i3;
        this.d = i10;
        this.f25167g = i11;
        this.h = i12;
        this.f25168i = i13;
        this.f25169j = i14;
        this.f25170k = i15;
        this.f25171l = i16;
        this.f25172m = i17;
        this.f25173n = i18;
        this.f25174o = j12;
        this.f25175p = i19;
        this.f25176q = z10;
        this.f25177r = i20;
        this.f25178s = z11;
        this.f25179t = z12;
    }
}
