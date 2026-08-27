package hh;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mc;
import org.telegram.ui.gy;
import org.telegram.ui.p21;
import org.telegram.ui.x21;

public final class b3 implements Runnable {

    public final int f8993a = 0;

    public final Object f8994b;

    public final TLObject f8995c;
    public final long d;

    public final Object f8996e;

    public final Object f8997f;
    public final Object h;

    public final Object f8998n;

    public final Object f8999r;

    public b3(i5 i5Var, we.d dVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f8997f = i5Var;
        this.h = dVar;
        this.f8994b = b2Var;
        this.f8995c = tLObject;
        this.f8998n = tL_starGiftUnique;
        this.f8996e = tL_error;
        this.d = j10;
        this.f8999r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f8993a) {
            case 0:
                i5.B0((i5) this.f8997f, (we.d) this.h, (org.telegram.ui.ActionBar.b2) this.f8994b, this.f8995c, (TL_stars.TL_starGiftUnique) this.f8998n, (TLRPC.TL_error) this.f8996e, this.d, (CharSequence) this.f8999r);
                break;
            case 1:
                gy.m0((gy) this.f8997f, (org.telegram.ui.ActionBar.b2) this.f8994b, this.f8995c, (TLRPC.User) this.h, (TLRPC.Chat) this.f8998n, this.d, (TLRPC.TL_error) this.f8996e, (TLRPC.TL_messages_checkHistoryImportPeer) this.f8999r);
                break;
            default:
                Context context = (Context) this.f8997f;
                jh.h0 h0Var = (jh.h0) this.h;
                byte[] bArr = (byte[]) this.f8994b;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f8998n;
                mc mcVar = (mc) this.f8996e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f8999r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f8995c;
                x21 x21Var = new x21(context, h0Var, this.d, bArr);
                x21Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                x21Var.f44268s = new p21(aVar, mcVar, context, h0Var, dVar);
                x21Var.show();
                break;
        }
    }

    public b3(TLObject tLObject, Context context, jh.h0 h0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, mc mcVar, org.telegram.messenger.video.d dVar) {
        this.f8995c = tLObject;
        this.f8997f = context;
        this.h = h0Var;
        this.d = j10;
        this.f8994b = bArr;
        this.f8998n = aVar;
        this.f8996e = mcVar;
        this.f8999r = dVar;
    }

    public b3(gy gyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f8997f = gyVar;
        this.f8994b = b2Var;
        this.f8995c = tLObject;
        this.h = user;
        this.f8998n = chat;
        this.d = j10;
        this.f8996e = tL_error;
        this.f8999r = tL_messages_checkHistoryImportPeer;
    }
}
