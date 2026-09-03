package kh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.qc;
public final class t implements Utilities.Callback2 {
    public final int f10928a = 1;
    public final int f10929b;
    public final long f10930c;
    public final Context d;
    public final Object e;
    public final Object f10931f;

    public t(int i10, long j10, TLRPC.Photo photo, Context context, nh.b bVar) {
        this.f10929b = i10;
        this.f10930c = j10;
        this.e = photo;
        this.d = context;
        this.f10931f = bVar;
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
        int i14 = this.f10928a;
        Object obj3 = this.f10931f;
        Object obj4 = this.e;
        switch (i14) {
            case 0:
                f6 f6Var = (f6) obj4;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (auction != null) {
                    int i15 = this.f10929b;
                    long j11 = UserConfig.getInstance(i15).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    Context context = this.d;
                    long j12 = this.f10930c;
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
                        f10.addView(new lh.f5(context, chat, chat2), k7.b6.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i16 = j6.f19987j5;
                        org.telegram.ui.b.w(i16, f6Var, textView, 1, 20.0f);
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
                        f10.addView(textView, k7.b6.d(-2, -2.0f, i13 | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.b.l(i16, f6Var, textView2, 1, 16.0f);
                        org.telegram.ui.b.o(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(j10), DialogObject.getShortName(j12)}, textView2);
                        f10.addView(textView2, k7.b6.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                        alertDialog$Builder.n(f10);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new gg.f(xVar, 21));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.f19478a.show();
                        return;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        s sVar = new s(context, f6Var, null, auction);
                        sVar.f10909k0 = runnable;
                        sVar.show();
                        return;
                    } else {
                        new f0(context, f6Var, j12, auction.gift, runnable).show();
                        return;
                    }
                }
                return;
            default:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                nh.b bVar = (nh.b) obj3;
                Integer num = (Integer) obj;
                String str = (String) obj2;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                int i17 = this.f10929b;
                reportprofilephoto.peer = MessagesController.getInstance(i17).getInputPeer(this.f10930c);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f19178id = photo.f19183id;
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

    public t(Context context, f6 f6Var, int i10, long j10, Runnable runnable) {
        this.d = context;
        this.e = f6Var;
        this.f10929b = i10;
        this.f10930c = j10;
        this.f10931f = runnable;
    }
}
