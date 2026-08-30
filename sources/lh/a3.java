package lh;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.c31;
import org.telegram.ui.k31;
import org.telegram.ui.oy;
public final class a3 implements Runnable {
    public final int f12095a = 0;
    public final Object f12096b;
    public final TLObject f12097c;
    public final long d;
    public final Object e;
    public final Object f12098f;
    public final Object h;
    public final Object f12099n;
    public final Object f12100r;

    public a3(g5 g5Var, af.f fVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f12098f = g5Var;
        this.h = fVar;
        this.f12096b = d2Var;
        this.f12097c = tLObject;
        this.f12099n = tL_starGiftUnique;
        this.e = tL_error;
        this.d = j10;
        this.f12100r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f12095a) {
            case 0:
                g5.B0((g5) this.f12098f, (af.f) this.h, (org.telegram.ui.ActionBar.d2) this.f12096b, this.f12097c, (TL_stars.TL_starGiftUnique) this.f12099n, (TLRPC.TL_error) this.e, this.d, (CharSequence) this.f12100r);
                return;
            case 1:
                oy.m0((oy) this.f12098f, (org.telegram.ui.ActionBar.d2) this.f12096b, this.f12097c, (TLRPC.User) this.h, (TLRPC.Chat) this.f12099n, this.d, (TLRPC.TL_error) this.e, (TLRPC.TL_messages_checkHistoryImportPeer) this.f12100r);
                return;
            default:
                Context context = (Context) this.f12098f;
                nh.i0 i0Var = (nh.i0) this.h;
                byte[] bArr = (byte[]) this.f12096b;
                qc qcVar = (qc) this.e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f12100r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f12097c;
                k31 k31Var = new k31(context, i0Var, this.d, bArr);
                k31Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                k31Var.f35562s = new c31((org.telegram.messenger.video.a) this.f12099n, qcVar, context, i0Var, dVar);
                k31Var.show();
                return;
        }
    }

    public a3(TLObject tLObject, Context context, nh.i0 i0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, qc qcVar, org.telegram.messenger.video.d dVar) {
        this.f12097c = tLObject;
        this.f12098f = context;
        this.h = i0Var;
        this.d = j10;
        this.f12096b = bArr;
        this.f12099n = aVar;
        this.e = qcVar;
        this.f12100r = dVar;
    }

    public a3(oy oyVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f12098f = oyVar;
        this.f12096b = d2Var;
        this.f12097c = tLObject;
        this.h = user;
        this.f12099n = chat;
        this.d = j10;
        this.e = tL_error;
        this.f12100r = tL_messages_checkHistoryImportPeer;
    }
}
