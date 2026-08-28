package gh;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oc;
import org.telegram.ui.dy;
import org.telegram.ui.q21;
import org.telegram.ui.y21;
public final class b3 implements Runnable {
    public final int f7835a = 0;
    public final Object f7836b;
    public final TLObject f7837c;
    public final long d;
    public final Object f7838e;
    public final Object f7839f;
    public final Object h;
    public final Object f7840n;
    public final Object f7841r;

    public b3(k5 k5Var, ve.d dVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f7839f = k5Var;
        this.h = dVar;
        this.f7836b = c2Var;
        this.f7837c = tLObject;
        this.f7840n = tL_starGiftUnique;
        this.f7838e = tL_error;
        this.d = j10;
        this.f7841r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f7835a) {
            case 0:
                k5.A0((k5) this.f7839f, (ve.d) this.h, (org.telegram.ui.ActionBar.c2) this.f7836b, this.f7837c, (TL_stars.TL_starGiftUnique) this.f7840n, (TLRPC.TL_error) this.f7838e, this.d, (CharSequence) this.f7841r);
                return;
            case 1:
                dy.l0((dy) this.f7839f, (org.telegram.ui.ActionBar.c2) this.f7836b, this.f7837c, (TLRPC.User) this.h, (TLRPC.Chat) this.f7840n, this.d, (TLRPC.TL_error) this.f7838e, (TLRPC.TL_messages_checkHistoryImportPeer) this.f7841r);
                return;
            default:
                Context context = (Context) this.f7839f;
                ih.j0 j0Var = (ih.j0) this.h;
                byte[] bArr = (byte[]) this.f7836b;
                oc ocVar = (oc) this.f7838e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f7841r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f7837c;
                y21 y21Var = new y21(context, j0Var, this.d, bArr);
                y21Var.N(tL_channels_sponsoredMessageReportResultChooseOption);
                y21Var.f44697s = new q21((org.telegram.messenger.video.a) this.f7840n, ocVar, context, j0Var, dVar);
                y21Var.show();
                return;
        }
    }

    public b3(TLObject tLObject, Context context, ih.j0 j0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, oc ocVar, org.telegram.messenger.video.d dVar) {
        this.f7837c = tLObject;
        this.f7839f = context;
        this.h = j0Var;
        this.d = j10;
        this.f7836b = bArr;
        this.f7840n = aVar;
        this.f7838e = ocVar;
        this.f7841r = dVar;
    }

    public b3(dy dyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f7839f = dyVar;
        this.f7836b = c2Var;
        this.f7837c = tLObject;
        this.h = user;
        this.f7840n = chat;
        this.d = j10;
        this.f7838e = tL_error;
        this.f7841r = tL_messages_checkHistoryImportPeer;
    }
}
