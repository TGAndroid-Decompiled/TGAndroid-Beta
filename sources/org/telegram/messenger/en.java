package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class en implements RequestDelegate {
    public final int f22371a = 2;
    public final Object f22372b;
    public final long f22373c;
    public final int d;
    public final int f22374e;
    public final long f22375f;
    public final boolean f22376g;
    public final Object h;

    public en(Context context, int i3, long j10, String str, long j11, int i10, boolean z10) {
        this.d = i3;
        this.f22373c = j10;
        this.f22375f = j11;
        this.f22374e = i10;
        this.f22376g = z10;
        this.f22372b = context;
        this.h = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22371a) {
            case 0:
                hp hpVar = (hp) this.f22372b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j10 = this.f22373c;
                if (j10 != 0) {
                    hpVar.getMessagesStorage().q1(j10);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i3 = tL_messages_affectedHistory.offset;
                    long j11 = this.f22375f;
                    if (i3 > 0) {
                        hpVar.Y(j11, 0, this.d, this.f22374e, this.f22376g, inputPeer, 0L);
                    }
                    hpVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    qr messagesStorage = hpVar.getMessagesStorage();
                    messagesStorage.f24934a.c(new op(messagesStorage, j11, 5));
                    return;
                }
                return;
            case 1:
                hp hpVar2 = (hp) this.f22372b;
                org.telegram.ui.tf tfVar = (org.telegram.ui.tf) this.h;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    hpVar2.M3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    hpVar2.getMessagesStorage().f24934a.c(new nn(hpVar2, this.f22373c, this.d, this.f22374e, this.f22375f, tL_messages_affectedHistory2, this.f22376g, tfVar));
                    return;
                }
                g0.h3(new a(tfVar, 25));
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f22373c, this.f22375f, this.f22374e, this.f22376g, (Context) this.f22372b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public en(hp hpVar, long j10, int i3, int i10, long j11, boolean z10, org.telegram.ui.tf tfVar) {
        this.f22372b = hpVar;
        this.f22373c = j10;
        this.d = i3;
        this.f22374e = i10;
        this.f22375f = j11;
        this.f22376g = z10;
        this.h = tfVar;
    }

    public en(hp hpVar, long j10, long j11, int i3, int i10, boolean z10, TLRPC.InputPeer inputPeer) {
        this.f22372b = hpVar;
        this.f22373c = j10;
        this.f22375f = j11;
        this.d = i3;
        this.f22374e = i10;
        this.f22376g = z10;
        this.h = inputPeer;
    }
}
