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
    public final aa f1295a;
    public final MessageObject f1296b;
    public final sn f1297c;
    public final org.telegram.ui.Components.qc d;
    public final org.telegram.ui.Components.kc e;
    public final org.telegram.ui.Components.jc f1298f;
    public final boolean f1299g;
    public long h;
    public long f1302k;
    public boolean f1303l;
    public boolean f1304m;
    public p7 f1306o;
    public final da f1307p;
    public final ga f1308q;
    public boolean f1300i = false;
    public boolean f1301j = false;
    public Long f1305n = null;

    public fa(ga gaVar, aa aaVar, MessageObject messageObject, sn snVar, boolean z10) {
        this.f1308q = gaVar;
        da daVar = new da(this, 0);
        this.f1307p = daVar;
        this.f1295a = aaVar;
        this.f1296b = messageObject;
        this.f1297c = snVar;
        Context t10 = ga.t(snVar);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, snVar.f41226ea);
        this.e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f27841b.setText(d());
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, snVar.f41226ea, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f28925a = new da(this, 1);
        org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(t10, snVar.f41226ea);
        this.f1298f = jcVar;
        jcVar.f27502b = 5000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, snVar.f41226ea));
        ocVar.addView(jcVar, w7.z5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(snVar).b(kcVar, -1);
        this.d = b10;
        b10.f29653r = false;
        if (z10) {
            b10.k(true);
            this.f1304m = true;
        }
        b10.v = daVar;
        this.h = 0L;
        System.currentTimeMillis();
        this.f1299g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        ga gaVar = this.f1308q;
        int i10 = gaVar.f1354a;
        AndroidUtilities.cancelRunOnUIThread(this.f1307p);
        this.f1301j = true;
        this.d.b();
        p7 p7Var = this.f1306o;
        if (p7Var != null) {
            p7Var.c();
        }
        boolean z10 = this.f1299g;
        long c10 = c();
        MessageObject messageObject = this.f1296b;
        messageObject.addPaidReactions((int) (-this.h), z10, c10);
        gaVar.f1358g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (gaVar.B == this) {
            gaVar.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f1307p);
        if (this.f1303l) {
            if (!this.f1300i && !this.f1301j) {
                ga y3 = ga.y(this.f1308q.f1354a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f1308q.f1354a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f1308q.f1354a);
                long j10 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j10) {
                    this.f1301j = true;
                    this.f1296b.addPaidReactions((int) (-this.h), this.f1299g, c());
                    ga gaVar = this.f1308q;
                    gaVar.f1358g = 0L;
                    NotificationCenter.getInstance(gaVar.f1354a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f1308q.f1354a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f1296b.getDialogId()), Integer.valueOf(this.f1296b.getId()), this.f1296b.messageOwner.reactions);
                    if (this.f1295a.f971a >= 0) {
                        str = UserObject.getForcedFirstName(this.f1297c.getMessagesController().getUser(Long.valueOf(this.f1295a.f971a)));
                    } else {
                        TLRPC.Chat chat = this.f1297c.getMessagesController().getChat(Long.valueOf(-this.f1295a.f971a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f1297c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.H1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new cd(parentActivity, this.f1297c.getResourceProvider(), j10, 5, str2, new ea(this, j10, 0), 0L).show();
                } else {
                    this.f1300i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f1295a.f971a);
                    tL_messages_sendPaidReaction.msg_id = this.f1295a.f972b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f1308q.f1354a).getClientUserId()) {
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
                    this.f1308q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new p9(this, messagesController, j10, 1));
                }
            }
        } else {
            this.f1301j = true;
            this.f1296b.addPaidReactions((int) (-this.h), this.f1299g, c());
            ga gaVar2 = this.f1308q;
            gaVar2.f1358g -= this.h;
            NotificationCenter.getInstance(gaVar2.f1354a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        p7 p7Var = this.f1306o;
        if (p7Var != null && (messageObject = this.f1296b) != null && messageObject.getId() == p7Var.f2016c) {
            this.f1306o.c();
        }
        ga gaVar3 = this.f1308q;
        if (gaVar3.B == this) {
            gaVar3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f1305n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f1308q.B(this.f1296b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f1308q.f1354a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
