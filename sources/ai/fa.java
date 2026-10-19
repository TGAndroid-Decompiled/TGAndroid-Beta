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
import org.telegram.ui.qn;
public final class fa {
    public final aa f1290a;
    public final MessageObject f1291b;
    public final qn f1292c;
    public final org.telegram.ui.Components.qc d;
    public final org.telegram.ui.Components.kc e;
    public final org.telegram.ui.Components.jc f1293f;
    public final boolean f1294g;
    public long h;
    public long f1297k;
    public boolean f1298l;
    public boolean f1299m;
    public p7 f1301o;
    public final da f1302p;
    public final ga f1303q;
    public boolean f1295i = false;
    public boolean f1296j = false;
    public Long f1300n = null;

    public fa(ga gaVar, aa aaVar, MessageObject messageObject, qn qnVar, boolean z10) {
        this.f1303q = gaVar;
        da daVar = new da(this, 0);
        this.f1302p = daVar;
        this.f1290a = aaVar;
        this.f1291b = messageObject;
        this.f1292c = qnVar;
        Context t10 = ga.t(qnVar);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, qnVar.f40675ea);
        this.e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f27814b.setText(d());
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, qnVar.f40675ea, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f28946a = new da(this, 1);
        org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(t10, qnVar.f40675ea);
        this.f1293f = jcVar;
        jcVar.f27498b = 5000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, qnVar.f40675ea));
        ocVar.addView(jcVar, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(qnVar).b(kcVar, -1);
        this.d = b10;
        b10.f29604r = false;
        if (z10) {
            b10.k(true);
            this.f1299m = true;
        }
        b10.v = daVar;
        this.h = 0L;
        System.currentTimeMillis();
        this.f1294g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        ga gaVar = this.f1303q;
        int i10 = gaVar.f1348a;
        AndroidUtilities.cancelRunOnUIThread(this.f1302p);
        this.f1296j = true;
        this.d.b();
        p7 p7Var = this.f1301o;
        if (p7Var != null) {
            p7Var.c();
        }
        boolean z10 = this.f1294g;
        long c10 = c();
        MessageObject messageObject = this.f1291b;
        messageObject.addPaidReactions((int) (-this.h), z10, c10);
        gaVar.f1352g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (gaVar.B == this) {
            gaVar.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f1302p);
        if (this.f1298l) {
            if (!this.f1295i && !this.f1296j) {
                ga y3 = ga.y(this.f1303q.f1348a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f1303q.f1348a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f1303q.f1348a);
                long j10 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j10) {
                    this.f1296j = true;
                    this.f1291b.addPaidReactions((int) (-this.h), this.f1294g, c());
                    ga gaVar = this.f1303q;
                    gaVar.f1352g = 0L;
                    NotificationCenter.getInstance(gaVar.f1348a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f1303q.f1348a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f1291b.getDialogId()), Integer.valueOf(this.f1291b.getId()), this.f1291b.messageOwner.reactions);
                    if (this.f1290a.f970a >= 0) {
                        str = UserObject.getForcedFirstName(this.f1292c.getMessagesController().getUser(Long.valueOf(this.f1290a.f970a)));
                    } else {
                        TLRPC.Chat chat = this.f1292c.getMessagesController().getChat(Long.valueOf(-this.f1290a.f970a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f1292c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.H1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new cd(parentActivity, this.f1292c.getResourceProvider(), j10, 5, str2, new ea(this, j10, 0), 0L).show();
                } else {
                    this.f1295i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f1290a.f970a);
                    tL_messages_sendPaidReaction.msg_id = this.f1290a.f971b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f1303q.f1348a).getClientUserId()) {
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
                    this.f1303q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new p9(this, messagesController, j10, 1));
                }
            }
        } else {
            this.f1296j = true;
            this.f1291b.addPaidReactions((int) (-this.h), this.f1294g, c());
            ga gaVar2 = this.f1303q;
            gaVar2.f1352g -= this.h;
            NotificationCenter.getInstance(gaVar2.f1348a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        p7 p7Var = this.f1301o;
        if (p7Var != null && (messageObject = this.f1291b) != null && messageObject.getId() == p7Var.f2015c) {
            this.f1301o.c();
        }
        ga gaVar3 = this.f1303q;
        if (gaVar3.B == this) {
            gaVar3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f1300n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f1303q.B(this.f1291b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f1303q.f1348a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
