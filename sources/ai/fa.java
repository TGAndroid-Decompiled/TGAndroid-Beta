package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
public final class fa {
    public final aa f1296a;
    public final MessageObject f1297b;
    public final sn f1298c;
    public final org.telegram.ui.Components.qc d;
    public final org.telegram.ui.Components.kc e;
    public final org.telegram.ui.Components.jc f1299f;
    public final boolean f1300g;
    public long h;
    public long f1303k;
    public boolean f1304l;
    public boolean f1305m;
    public p7 f1307o;
    public final da f1308p;
    public final ga f1309q;
    public boolean f1301i = false;
    public boolean f1302j = false;
    public Long f1306n = null;

    public fa(ga gaVar, aa aaVar, MessageObject messageObject, sn snVar, boolean z10) {
        this.f1309q = gaVar;
        da daVar = new da(this, 0);
        this.f1308p = daVar;
        this.f1296a = aaVar;
        this.f1297b = messageObject;
        this.f1298c = snVar;
        Context t10 = ga.t(snVar);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, snVar.f41191ea);
        this.e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f27834b.setText(d());
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, snVar.f41191ea, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f28918a = new da(this, 1);
        org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(t10, snVar.f41191ea);
        this.f1299f = jcVar;
        jcVar.f27495b = 5000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, snVar.f41191ea));
        ocVar.addView(jcVar, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(snVar).b(kcVar, -1);
        this.d = b10;
        b10.f29646r = false;
        if (z10) {
            b10.k(true);
            this.f1305m = true;
        }
        b10.v = daVar;
        this.h = 0L;
        System.currentTimeMillis();
        this.f1300g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        ga gaVar = this.f1309q;
        int i10 = gaVar.f1352a;
        AndroidUtilities.cancelRunOnUIThread(this.f1308p);
        this.f1302j = true;
        this.d.b();
        p7 p7Var = this.f1307o;
        if (p7Var != null) {
            p7Var.c();
        }
        boolean z10 = this.f1300g;
        long c10 = c();
        MessageObject messageObject = this.f1297b;
        messageObject.addPaidReactions((int) (-this.h), z10, c10);
        gaVar.f1356g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (gaVar.B == this) {
            gaVar.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f1308p);
        if (this.f1304l) {
            if (!this.f1301i && !this.f1302j) {
                ga y3 = ga.y(this.f1309q.f1352a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f1309q.f1352a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f1309q.f1352a);
                long j10 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j10) {
                    this.f1302j = true;
                    this.f1297b.addPaidReactions((int) (-this.h), this.f1300g, c());
                    ga gaVar = this.f1309q;
                    gaVar.f1356g = 0L;
                    NotificationCenter.getInstance(gaVar.f1352a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f1309q.f1352a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f1297b.getDialogId()), Integer.valueOf(this.f1297b.getId()), this.f1297b.messageOwner.reactions);
                    if (this.f1296a.f973a >= 0) {
                        str = UserObject.getForcedFirstName(this.f1298c.getMessagesController().getUser(Long.valueOf(this.f1296a.f973a)));
                    } else {
                        TLRPC.Chat chat = this.f1298c.getMessagesController().getChat(Long.valueOf(-this.f1296a.f973a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f1298c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.H1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new cd(parentActivity, this.f1298c.getResourceProvider(), j10, 5, str2, new ea(this, j10, 0), 0L).show();
                } else {
                    this.f1301i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f1296a.f973a);
                    tL_messages_sendPaidReaction.msg_id = this.f1296a.f974b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f1309q.f1352a).getClientUserId()) {
                        if (c10 == 2666000) {
                            tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                        } else {
                            TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                            tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                            paidreactionprivacypeer.peer = messagesController.getInputPeer(c10);
                        }
                    } else {
                        tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                    }
                    this.f1309q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new p9(this, messagesController, j10, 1));
                }
            }
        } else {
            this.f1302j = true;
            this.f1297b.addPaidReactions((int) (-this.h), this.f1300g, c());
            ga gaVar2 = this.f1309q;
            gaVar2.f1356g -= this.h;
            NotificationCenter.getInstance(gaVar2.f1352a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        p7 p7Var = this.f1307o;
        if (p7Var != null && (messageObject = this.f1297b) != null && messageObject.getId() == p7Var.f2016c) {
            this.f1307o.c();
        }
        ga gaVar3 = this.f1309q;
        if (gaVar3.B == this) {
            gaVar3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f1306n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f1309q.B(this.f1297b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f1309q.f1352a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
