package mh;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.e31;
import org.telegram.ui.m31;
import org.telegram.ui.py;
public final class z2 implements Runnable {
    public final int f15134a = 0;
    public final Object f15135b;
    public final TLObject f15136c;
    public final long d;
    public final Object f15137e;
    public final Object f15138f;
    public final Object h;
    public final Object f15139n;
    public final Object f15140r;

    public z2(g5 g5Var, af.f fVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f15138f = g5Var;
        this.h = fVar;
        this.f15135b = d2Var;
        this.f15136c = tLObject;
        this.f15139n = tL_starGiftUnique;
        this.f15137e = tL_error;
        this.d = j10;
        this.f15140r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f15134a) {
            case 0:
                g5.B0((g5) this.f15138f, (af.f) this.h, (org.telegram.ui.ActionBar.d2) this.f15135b, this.f15136c, (TL_stars.TL_starGiftUnique) this.f15139n, (TLRPC.TL_error) this.f15137e, this.d, (CharSequence) this.f15140r);
                return;
            case 1:
                py.m0((py) this.f15138f, (org.telegram.ui.ActionBar.d2) this.f15135b, this.f15136c, (TLRPC.User) this.h, (TLRPC.Chat) this.f15139n, this.d, (TLRPC.TL_error) this.f15137e, (TLRPC.TL_messages_checkHistoryImportPeer) this.f15140r);
                return;
            default:
                Context context = (Context) this.f15138f;
                oh.h0 h0Var = (oh.h0) this.h;
                byte[] bArr = (byte[]) this.f15135b;
                qc qcVar = (qc) this.f15137e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f15140r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f15136c;
                m31 m31Var = new m31(context, h0Var, this.d, bArr);
                m31Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                m31Var.f38961s = new e31((org.telegram.messenger.video.a) this.f15139n, qcVar, context, h0Var, dVar);
                m31Var.show();
                return;
        }
    }

    public z2(TLObject tLObject, Context context, oh.h0 h0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, qc qcVar, org.telegram.messenger.video.d dVar) {
        this.f15136c = tLObject;
        this.f15138f = context;
        this.h = h0Var;
        this.d = j10;
        this.f15135b = bArr;
        this.f15139n = aVar;
        this.f15137e = qcVar;
        this.f15140r = dVar;
    }

    public z2(py pyVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f15138f = pyVar;
        this.f15135b = d2Var;
        this.f15136c = tLObject;
        this.h = user;
        this.f15139n = chat;
        this.d = j10;
        this.f15137e = tL_error;
        this.f15140r = tL_messages_checkHistoryImportPeer;
    }
}
