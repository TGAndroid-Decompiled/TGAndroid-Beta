package fh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.oc;
public final class y implements Utilities.Callback2 {
    public final int f6871a = 1;
    public final int f6872b;
    public final long f6873c;
    public final Context d;
    public final Object f6874e;
    public final Object f6875f;

    public y(int i9, long j10, TLRPC.Photo photo, Context context, ih.b bVar) {
        this.f6872b = i9;
        this.f6873c = j10;
        this.f6874e = photo;
        this.d = context;
        this.f6875f = bVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i9;
        int i10;
        long j10;
        c0 c0Var;
        TLObject chat;
        TLObject chat2;
        int i11;
        int i12;
        int i13 = this.f6871a;
        Object obj3 = this.f6875f;
        Object obj4 = this.f6874e;
        switch (i13) {
            case 0:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj4;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (auction != null) {
                    int i14 = this.f6872b;
                    long j11 = UserConfig.getInstance(i14).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    Context context = this.d;
                    long j12 = this.f6873c;
                    if (j12 != peerDialogId && j12 != 0 && peerDialogId != 0) {
                        c0 c0Var2 = new c0(context, i14, auction, j12, runnable);
                        if (i10 >= 0) {
                            chat = MessagesController.getInstance(i14).getUser(Long.valueOf(peerDialogId));
                            j10 = peerDialogId;
                            c0Var = c0Var2;
                        } else {
                            j10 = peerDialogId;
                            c0Var = c0Var2;
                            chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j10));
                        }
                        if (i9 >= 0) {
                            chat2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j12));
                        } else {
                            chat2 = MessagesController.getInstance(i14).getChat(Long.valueOf(-j12));
                        }
                        LinearLayout f10 = ll.f(context, 1);
                        f10.addView(new gh.j5(context, chat, chat2), g7.e6.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i15 = org.telegram.ui.ActionBar.f6.f23108j5;
                        org.telegram.ui.Cells.j2.o(i15, b6Var, textView, 1, 20.0f);
                        if (LocaleController.isRTL) {
                            i11 = 5;
                        } else {
                            i11 = 3;
                        }
                        textView.setGravity(i11);
                        if (LocaleController.isRTL) {
                            i12 = 5;
                        } else {
                            i12 = 3;
                        }
                        f10.addView(textView, g7.e6.d(-2, -2.0f, i12 | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        ll.n(i15, b6Var, textView2, 1, 16.0f);
                        ll.q(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(j10), DialogObject.getShortName(j12)}, textView2);
                        f10.addView(textView2, g7.e6.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
                        alertDialog$Builder.n(f10);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new a1.c(c0Var, 26));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.f22702a.show();
                        return;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        x xVar = new x(context, b6Var, null, auction);
                        xVar.f6849j0 = runnable;
                        xVar.show();
                        return;
                    } else {
                        new k0(context, b6Var, j12, auction.gift, runnable).show();
                        return;
                    }
                }
                return;
            default:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                ih.b bVar = (ih.b) obj3;
                Integer num = (Integer) obj;
                String str = (String) obj2;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                int i16 = this.f6872b;
                reportprofilephoto.peer = MessagesController.getInstance(i16).getInputPeer(this.f6873c);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f22399id = photo.f22404id;
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
                ConnectionsManager.getInstance(i16).sendRequest(reportprofilephoto, null);
                new oc(cb.a(this.d), bVar).E(bVar).j();
                return;
        }
    }

    public y(Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9, long j10, Runnable runnable) {
        this.d = context;
        this.f6874e = b6Var;
        this.f6872b = i9;
        this.f6873c = j10;
        this.f6875f = runnable;
    }
}
