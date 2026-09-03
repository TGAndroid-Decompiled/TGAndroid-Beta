package mh;

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
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class s7 {
    public final n7 f14750a;
    public final MessageObject f14751b;
    public final xn f14752c;
    public final ic d;
    public final cc f14753e;
    public final bc f14754f;
    public final boolean f14755g;
    public long h;
    public long f14758k;
    public boolean f14759l;
    public boolean f14760m;
    public l5 f14762o;
    public final q7 f14763p;
    public final t7 f14764q;
    public boolean f14756i = false;
    public boolean f14757j = false;
    public Long f14761n = null;

    public s7(t7 t7Var, n7 n7Var, MessageObject messageObject, xn xnVar, boolean z4) {
        this.f14764q = t7Var;
        q7 q7Var = new q7(this, 0);
        this.f14763p = q7Var;
        this.f14750a = n7Var;
        this.f14751b = messageObject;
        this.f14752c = xnVar;
        Context t6 = t7.t(xnVar);
        cc ccVar = new cc(t6, xnVar.f43114ba);
        this.f14753e = ccVar;
        ccVar.c(R.raw.stars_topup, new String[0]);
        ccVar.f25887b.setText(d());
        gc gcVar = new gc(t6, xnVar.f43114ba, true, false);
        gcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        gcVar.f27139a = new q7(this, 1);
        bc bcVar = new bc(t6, xnVar.f43114ba);
        this.f14754f = bcVar;
        bcVar.f25570b = 5000L;
        bcVar.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Gi, xnVar.f43114ba));
        gcVar.addView(bcVar, k7.c6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        gcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        ccVar.setButton(gcVar);
        ic b10 = qc.a0(xnVar).b(ccVar, -1);
        this.d = b10;
        b10.f27786r = false;
        if (z4) {
            b10.k(true);
            this.f14760m = true;
        }
        b10.v = q7Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f14755g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        t7 t7Var = this.f14764q;
        int i10 = t7Var.f14830a;
        AndroidUtilities.cancelRunOnUIThread(this.f14763p);
        this.f14757j = true;
        this.d.b();
        l5 l5Var = this.f14762o;
        if (l5Var != null) {
            l5Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z4 = this.f14755g;
        long c3 = c();
        MessageObject messageObject = this.f14751b;
        messageObject.addPaidReactions(i11, z4, c3);
        t7Var.f14835g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (t7Var.B == this) {
            t7Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f14763p);
        if (this.f14759l) {
            if (!this.f14756i && !this.f14757j) {
                t7 y10 = t7.y(this.f14764q.f14830a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f14764q.f14830a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f14764q.f14830a);
                long j10 = this.h;
                if (y10.f14833e && y10.q(false, false, null).amount < j10) {
                    this.f14757j = true;
                    this.f14751b.addPaidReactions((int) (-this.h), this.f14755g, c());
                    t7 t7Var = this.f14764q;
                    t7Var.f14835g = 0L;
                    NotificationCenter.getInstance(t7Var.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f14764q.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f14751b.getDialogId()), Integer.valueOf(this.f14751b.getId()), this.f14751b.messageOwner.reactions);
                    if (this.f14750a.f14492a >= 0) {
                        str = UserObject.getForcedFirstName(this.f14752c.getMessagesController().getUser(Long.valueOf(this.f14750a.f14492a)));
                    } else {
                        TLRPC.Chat chat = this.f14752c.getMessagesController().getChat(Long.valueOf(-this.f14750a.f14492a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f14752c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.D1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new z9(parentActivity, this.f14752c.getResourceProvider(), j10, 5, str2, new r7(this, j10, 0), 0L).show();
                } else {
                    this.f14756i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f14750a.f14492a);
                    tL_messages_sendPaidReaction.msg_id = this.f14750a.f14493b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.random.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c3 = c();
                    if (c3 != 0 && c3 != UserConfig.getInstance(this.f14764q.f14830a).getClientUserId()) {
                        if (c3 == 2666000) {
                            tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                        } else {
                            TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                            tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                            paidreactionprivacypeer.peer = messagesController.getInputPeer(c3);
                        }
                    } else {
                        tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                    }
                    this.f14764q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new hg.c0(this, messagesController, j10));
                }
            }
        } else {
            this.f14757j = true;
            this.f14751b.addPaidReactions((int) (-this.h), this.f14755g, c());
            t7 t7Var2 = this.f14764q;
            t7Var2.f14835g -= this.h;
            NotificationCenter.getInstance(t7Var2.f14830a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        l5 l5Var = this.f14762o;
        if (l5Var != null && (messageObject = this.f14751b) != null && messageObject.getId() == l5Var.f14386c) {
            this.f14762o.c();
        }
        t7 t7Var3 = this.f14764q;
        if (t7Var3.B == this) {
            t7Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f14761n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f14764q.B(this.f14751b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f14764q.f14830a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
