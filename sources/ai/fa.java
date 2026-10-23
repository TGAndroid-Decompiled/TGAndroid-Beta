package ai;

import android.content.Context;
import android.view.View;
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
import org.telegram.ui.sn;
public final class fa {
    public final aa f1308a;
    public final MessageObject f1309b;
    public final sn f1310c;
    public final org.telegram.ui.Components.qc d;
    public final org.telegram.ui.Components.kc e;
    public final ga f1311f;
    public final boolean f1312g;
    public long h;
    public long f1315k;
    public boolean f1316l;
    public boolean f1317m;
    public q7 f1319o;
    public final da f1320p;
    public final ha f1321q;
    public boolean f1313i = false;
    public boolean f1314j = false;
    public Long f1318n = null;

    public fa(ha haVar, aa aaVar, MessageObject messageObject, sn snVar, boolean z10) {
        this.f1321q = haVar;
        da daVar = new da(this, 0);
        this.f1320p = daVar;
        this.f1308a = aaVar;
        this.f1309b = messageObject;
        this.f1310c = snVar;
        Context t10 = ha.t(snVar);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, snVar.f41654qa);
        this.e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f28002b.setText(d());
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, snVar.f41654qa, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f29152b = new da(this, 1);
        ?? jcVar = new org.telegram.ui.Components.jc(t10, snVar.f41654qa);
        this.f1311f = jcVar;
        jcVar.f27663b = 5000L;
        int i10 = org.telegram.ui.ActionBar.k6.Gi;
        qn qnVar = snVar.f41654qa;
        aa.a aVar = new aa.a(15);
        aa.a aVar2 = new aa.a(16);
        int R = org.telegram.ui.ActionBar.r6.R(i10, -1, 0, 0.0f, qnVar);
        aVar2.d(R, jcVar);
        org.telegram.ui.ActionBar.l6 y3 = org.telegram.ui.ActionBar.r6.y(101, jcVar);
        y3.c(i10, -1, 0, 0.0f, qnVar);
        y3.f21619n = aVar;
        y3.f21620o = aVar2;
        y3.f21618m = false;
        y3.f21613g = R;
        ocVar.addView((View) jcVar, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.e.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(snVar).b(kcVar, -1);
        this.d = b10;
        b10.f29840r = false;
        if (z10) {
            b10.k(true);
            this.f1317m = true;
        }
        b10.v = daVar;
        this.h = 0L;
        System.currentTimeMillis();
        this.f1312g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        ha haVar = this.f1321q;
        int i10 = haVar.f1413a;
        AndroidUtilities.cancelRunOnUIThread(this.f1320p);
        this.f1314j = true;
        this.d.b();
        q7 q7Var = this.f1319o;
        if (q7Var != null) {
            q7Var.c();
        }
        boolean z10 = this.f1312g;
        long c10 = c();
        MessageObject messageObject = this.f1309b;
        messageObject.addPaidReactions((int) (-this.h), z10, c10);
        haVar.f1417g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (haVar.B == this) {
            haVar.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f1320p);
        if (this.f1316l) {
            if (!this.f1313i && !this.f1314j) {
                ha y3 = ha.y(this.f1321q.f1413a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f1321q.f1413a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f1321q.f1413a);
                long j10 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j10) {
                    this.f1314j = true;
                    this.f1309b.addPaidReactions((int) (-this.h), this.f1312g, c());
                    ha haVar = this.f1321q;
                    haVar.f1417g = 0L;
                    NotificationCenter.getInstance(haVar.f1413a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f1321q.f1413a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f1309b.getDialogId()), Integer.valueOf(this.f1309b.getId()), this.f1309b.messageOwner.reactions);
                    if (this.f1308a.f980a >= 0) {
                        str = UserObject.getForcedFirstName(this.f1310c.getMessagesController().getUser(Long.valueOf(this.f1308a.f980a)));
                    } else {
                        TLRPC.Chat chat = this.f1310c.getMessagesController().getChat(Long.valueOf(-this.f1308a.f980a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f1310c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.J1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new dd(parentActivity, this.f1310c.getResourceProvider(), j10, 5, str2, new ea(this, j10, 0), 0L).show();
                } else {
                    this.f1313i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f1308a.f980a);
                    tL_messages_sendPaidReaction.msg_id = this.f1308a.f981b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f1321q.f1413a).getClientUserId()) {
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
                    this.f1321q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new m3(this, messagesController, j10, 2));
                }
            }
        } else {
            this.f1314j = true;
            this.f1309b.addPaidReactions((int) (-this.h), this.f1312g, c());
            ha haVar2 = this.f1321q;
            haVar2.f1417g -= this.h;
            NotificationCenter.getInstance(haVar2.f1413a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        q7 q7Var = this.f1319o;
        if (q7Var != null && (messageObject = this.f1309b) != null && messageObject.getId() == q7Var.f2066c) {
            this.f1319o.c();
        }
        ha haVar3 = this.f1321q;
        if (haVar3.B == this) {
            haVar3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f1318n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f1321q.B(this.f1309b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f1321q.f1413a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
