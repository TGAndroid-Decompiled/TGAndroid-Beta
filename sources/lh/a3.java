package lh;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.j31;
import org.telegram.ui.q31;
import org.telegram.ui.qy;
public final class a3 implements Runnable {
    public final int f12079a = 0;
    public final Object f12080b;
    public final TLObject f12081c;
    public final long d;
    public final Object e;
    public final Object f12082f;
    public final Object h;
    public final Object f12083n;
    public final Object f12084r;

    public a3(g5 g5Var, ze.c cVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f12082f = g5Var;
        this.h = cVar;
        this.f12080b = d2Var;
        this.f12081c = tLObject;
        this.f12083n = tL_starGiftUnique;
        this.e = tL_error;
        this.d = j10;
        this.f12084r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f12079a) {
            case 0:
                g5.B0((g5) this.f12082f, (ze.c) this.h, (org.telegram.ui.ActionBar.d2) this.f12080b, this.f12081c, (TL_stars.TL_starGiftUnique) this.f12083n, (TLRPC.TL_error) this.e, this.d, (CharSequence) this.f12084r);
                return;
            case 1:
                qy.m0((qy) this.f12082f, (org.telegram.ui.ActionBar.d2) this.f12080b, this.f12081c, (TLRPC.User) this.h, (TLRPC.Chat) this.f12083n, this.d, (TLRPC.TL_error) this.e, (TLRPC.TL_messages_checkHistoryImportPeer) this.f12084r);
                return;
            default:
                Context context = (Context) this.f12082f;
                nh.i0 i0Var = (nh.i0) this.h;
                byte[] bArr = (byte[]) this.f12080b;
                qc qcVar = (qc) this.e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f12084r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f12081c;
                q31 q31Var = new q31(context, i0Var, this.d, bArr);
                q31Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                q31Var.f37293s = new j31((org.telegram.messenger.video.a) this.f12083n, qcVar, context, i0Var, dVar);
                q31Var.show();
                return;
        }
    }

    public a3(TLObject tLObject, Context context, nh.i0 i0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, qc qcVar, org.telegram.messenger.video.d dVar) {
        this.f12081c = tLObject;
        this.f12082f = context;
        this.h = i0Var;
        this.d = j10;
        this.f12080b = bArr;
        this.f12083n = aVar;
        this.e = qcVar;
        this.f12084r = dVar;
    }

    public a3(qy qyVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f12082f = qyVar;
        this.f12080b = d2Var;
        this.f12081c = tLObject;
        this.h = user;
        this.f12083n = chat;
        this.d = j10;
        this.e = tL_error;
        this.f12084r = tL_messages_checkHistoryImportPeer;
    }
}
