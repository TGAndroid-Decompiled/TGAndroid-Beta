package mh;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.j31;
import org.telegram.ui.py;
import org.telegram.ui.q31;
public final class z2 implements Runnable {
    public final int f15136a = 0;
    public final Object f15137b;
    public final TLObject f15138c;
    public final long d;
    public final Object f15139e;
    public final Object f15140f;
    public final Object h;
    public final Object f15141n;
    public final Object f15142r;

    public z2(g5 g5Var, af.f fVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f15140f = g5Var;
        this.h = fVar;
        this.f15137b = d2Var;
        this.f15138c = tLObject;
        this.f15141n = tL_starGiftUnique;
        this.f15139e = tL_error;
        this.d = j10;
        this.f15142r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f15136a) {
            case 0:
                g5.B0((g5) this.f15140f, (af.f) this.h, (org.telegram.ui.ActionBar.d2) this.f15137b, this.f15138c, (TL_stars.TL_starGiftUnique) this.f15141n, (TLRPC.TL_error) this.f15139e, this.d, (CharSequence) this.f15142r);
                return;
            case 1:
                py.m0((py) this.f15140f, (org.telegram.ui.ActionBar.d2) this.f15137b, this.f15138c, (TLRPC.User) this.h, (TLRPC.Chat) this.f15141n, this.d, (TLRPC.TL_error) this.f15139e, (TLRPC.TL_messages_checkHistoryImportPeer) this.f15142r);
                return;
            default:
                Context context = (Context) this.f15140f;
                oh.h0 h0Var = (oh.h0) this.h;
                byte[] bArr = (byte[]) this.f15137b;
                qc qcVar = (qc) this.f15139e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f15142r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f15138c;
                q31 q31Var = new q31(context, h0Var, this.d, bArr);
                q31Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                q31Var.f40316s = new j31((org.telegram.messenger.video.a) this.f15141n, qcVar, context, h0Var, dVar);
                q31Var.show();
                return;
        }
    }

    public z2(TLObject tLObject, Context context, oh.h0 h0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, qc qcVar, org.telegram.messenger.video.d dVar) {
        this.f15138c = tLObject;
        this.f15140f = context;
        this.h = h0Var;
        this.d = j10;
        this.f15137b = bArr;
        this.f15141n = aVar;
        this.f15139e = qcVar;
        this.f15142r = dVar;
    }

    public z2(py pyVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f15140f = pyVar;
        this.f15137b = d2Var;
        this.f15138c = tLObject;
        this.h = user;
        this.f15141n = chat;
        this.d = j10;
        this.f15139e = tL_error;
        this.f15142r = tL_messages_checkHistoryImportPeer;
    }
}
