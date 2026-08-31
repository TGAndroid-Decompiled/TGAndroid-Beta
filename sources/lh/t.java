package lh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.qc;
public final class t implements Utilities.Callback2 {
    public final int f12966a = 1;
    public final int f12967b;
    public final long f12968c;
    public final Context d;
    public final Object f12969e;
    public final Object f12970f;

    public t(int i10, long j10, TLRPC.Photo photo, Context context, oh.b bVar) {
        this.f12967b = i10;
        this.f12968c = j10;
        this.f12969e = photo;
        this.d = context;
        this.f12970f = bVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        long j10;
        x xVar;
        TLObject chat;
        TLObject chat2;
        int i12;
        int i13;
        int i14 = this.f12966a;
        Object obj3 = this.f12970f;
        Object obj4 = this.f12969e;
        switch (i14) {
            case 0:
                g6 g6Var = (g6) obj4;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (auction != null) {
                    int i15 = this.f12967b;
                    long j11 = UserConfig.getInstance(i15).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    Context context = this.d;
                    long j12 = this.f12968c;
                    if (j12 != peerDialogId && j12 != 0 && peerDialogId != 0) {
                        x xVar2 = new x(context, i15, auction, j12, runnable);
                        if (i11 >= 0) {
                            chat = MessagesController.getInstance(i15).getUser(Long.valueOf(peerDialogId));
                            j10 = peerDialogId;
                            xVar = xVar2;
                        } else {
                            j10 = peerDialogId;
                            xVar = xVar2;
                            chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-j10));
                        }
                        if (i10 >= 0) {
                            chat2 = MessagesController.getInstance(i15).getUser(Long.valueOf(j12));
                        } else {
                            chat2 = MessagesController.getInstance(i15).getChat(Long.valueOf(-j12));
                        }
                        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
                        f10.addView(new mh.f5(context, chat, chat2), k7.c6.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i16 = k6.f21766j5;
                        org.telegram.ui.b.w(i16, g6Var, textView, 1, 20.0f);
                        if (LocaleController.isRTL) {
                            i12 = 5;
                        } else {
                            i12 = 3;
                        }
                        textView.setGravity(i12);
                        if (LocaleController.isRTL) {
                            i13 = 5;
                        } else {
                            i13 = 3;
                        }
                        f10.addView(textView, k7.c6.d(-2, -2.0f, i13 | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.b.l(i16, g6Var, textView2, 1, 16.0f);
                        org.telegram.ui.b.o(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(j10), DialogObject.getShortName(j12)}, textView2);
                        f10.addView(textView2, k7.c6.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                        alertDialog$Builder.n(f10);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new hg.f(xVar, 23));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.f21166a.show();
                        return;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        s sVar = new s(context, g6Var, null, auction);
                        sVar.f12947k0 = runnable;
                        sVar.show();
                        return;
                    } else {
                        new f0(context, g6Var, j12, auction.gift, runnable).show();
                        return;
                    }
                }
                return;
            default:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                oh.b bVar = (oh.b) obj3;
                Integer num = (Integer) obj;
                String str = (String) obj2;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                int i17 = this.f12967b;
                reportprofilephoto.peer = MessagesController.getInstance(i17).getInputPeer(this.f12968c);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f20862id = photo.f20867id;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputPhoto.access_hash = photo.access_hash;
                reportprofilephoto.photo_id = tL_inputPhoto;
                reportprofilephoto.message = "";
                if (num.intValue() == 0) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonSpam();
                } else if (num.intValue() == 1) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonViolence();
                } else if (num.intValue() == 2) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonChildAbuse();
                } else if (num.intValue() == 5) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPornography();
                } else if (num.intValue() == 3) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonIllegalDrugs();
                } else if (num.intValue() == 4) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPersonalDetails();
                }
                ConnectionsManager.getInstance(i17).sendRequest(reportprofilephoto, null);
                new qc(cb.a(this.d), bVar).E(bVar).j();
                return;
        }
    }

    public t(Context context, g6 g6Var, int i10, long j10, Runnable runnable) {
        this.d = context;
        this.f12969e = g6Var;
        this.f12967b = i10;
        this.f12968c = j10;
        this.f12970f = runnable;
    }
}
