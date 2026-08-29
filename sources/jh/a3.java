package jh;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.tc;
import org.telegram.ui.fy;
import org.telegram.ui.q21;
import org.telegram.ui.y21;
public final class a3 implements Runnable {
    public final int f11714a = 0;
    public final Object f11715b;
    public final TLObject f11716c;
    public final long d;
    public final Object f11717e;
    public final Object f11718f;
    public final Object h;
    public final Object f11719n;
    public final Object f11720r;

    public a3(h5 h5Var, ye.c cVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f11718f = h5Var;
        this.h = cVar;
        this.f11715b = c2Var;
        this.f11716c = tLObject;
        this.f11719n = tL_starGiftUnique;
        this.f11717e = tL_error;
        this.d = j10;
        this.f11720r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f11714a) {
            case 0:
                h5.B0((h5) this.f11718f, (ye.c) this.h, (org.telegram.ui.ActionBar.c2) this.f11715b, this.f11716c, (TL_stars.TL_starGiftUnique) this.f11719n, (TLRPC.TL_error) this.f11717e, this.d, (CharSequence) this.f11720r);
                return;
            case 1:
                fy.m0((fy) this.f11718f, (org.telegram.ui.ActionBar.c2) this.f11715b, this.f11716c, (TLRPC.User) this.h, (TLRPC.Chat) this.f11719n, this.d, (TLRPC.TL_error) this.f11717e, (TLRPC.TL_messages_checkHistoryImportPeer) this.f11720r);
                return;
            default:
                Context context = (Context) this.f11718f;
                lh.h0 h0Var = (lh.h0) this.h;
                byte[] bArr = (byte[]) this.f11715b;
                tc tcVar = (tc) this.f11717e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f11720r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f11716c;
                y21 y21Var = new y21(context, h0Var, this.d, bArr);
                y21Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                y21Var.f44716s = new q21((org.telegram.messenger.video.a) this.f11719n, tcVar, context, h0Var, dVar);
                y21Var.show();
                return;
        }
    }

    public a3(TLObject tLObject, Context context, lh.h0 h0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, tc tcVar, org.telegram.messenger.video.d dVar) {
        this.f11716c = tLObject;
        this.f11718f = context;
        this.h = h0Var;
        this.d = j10;
        this.f11715b = bArr;
        this.f11719n = aVar;
        this.f11717e = tcVar;
        this.f11720r = dVar;
    }

    public a3(fy fyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f11718f = fyVar;
        this.f11715b = c2Var;
        this.f11716c = tLObject;
        this.h = user;
        this.f11719n = chat;
        this.d = j10;
        this.f11717e = tL_error;
        this.f11720r = tL_messages_checkHistoryImportPeer;
    }
}
