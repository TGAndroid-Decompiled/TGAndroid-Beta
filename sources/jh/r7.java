package jh;

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
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tn;
public final class r7 {
    public final m7 f12716a;
    public final MessageObject f12717b;
    public final tn f12718c;
    public final mc d;
    public final gc f12719e;
    public final fc f12720f;
    public final boolean f12721g;
    public long h;
    public long f12724k;
    public boolean f12725l;
    public boolean f12726m;
    public m5 f12728o;
    public final p7 f12729p;
    public final s7 f12730q;
    public boolean f12722i = false;
    public boolean f12723j = false;
    public Long f12727n = null;

    public r7(s7 s7Var, m7 m7Var, MessageObject messageObject, tn tnVar, boolean z10) {
        this.f12730q = s7Var;
        p7 p7Var = new p7(this, 0);
        this.f12729p = p7Var;
        this.f12716a = m7Var;
        this.f12717b = messageObject;
        this.f12718c = tnVar;
        Context t10 = s7.t(tnVar);
        gc gcVar = new gc(t10, tnVar.f42746aa);
        this.f12719e = gcVar;
        gcVar.c(R.raw.stars_topup, new String[0]);
        gcVar.f28865b.setText(d());
        kc kcVar = new kc(t10, tnVar.f42746aa, true, false);
        kcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        kcVar.f30007a = new p7(this, 1);
        fc fcVar = new fc(t10, tnVar.f42746aa);
        this.f12720f = fcVar;
        fcVar.f28371b = 5000L;
        fcVar.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, tnVar.f42746aa));
        kcVar.addView(fcVar, i7.f6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        kcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        gcVar.setButton(kcVar);
        mc b10 = tc.a0(tnVar).b(gcVar, -1);
        this.d = b10;
        b10.f30660r = false;
        if (z10) {
            b10.k(true);
            this.f12726m = true;
        }
        b10.v = p7Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f12721g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        s7 s7Var = this.f12730q;
        int i10 = s7Var.f12787a;
        AndroidUtilities.cancelRunOnUIThread(this.f12729p);
        this.f12723j = true;
        this.d.b();
        m5 m5Var = this.f12728o;
        if (m5Var != null) {
            m5Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f12721g;
        long c3 = c();
        MessageObject messageObject = this.f12717b;
        messageObject.addPaidReactions(i11, z10, c3);
        s7Var.f12792g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (s7Var.B == this) {
            s7Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f12729p);
        if (this.f12725l) {
            if (!this.f12722i && !this.f12723j) {
                s7 y8 = s7.y(this.f12730q.f12787a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f12730q.f12787a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f12730q.f12787a);
                long j10 = this.h;
                if (y8.f12790e && y8.q(false, false, null).amount < j10) {
                    this.f12723j = true;
                    this.f12717b.addPaidReactions((int) (-this.h), this.f12721g, c());
                    s7 s7Var = this.f12730q;
                    s7Var.f12792g = 0L;
                    NotificationCenter.getInstance(s7Var.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f12730q.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f12717b.getDialogId()), Integer.valueOf(this.f12717b.getId()), this.f12717b.messageOwner.reactions);
                    if (this.f12716a.f12468a >= 0) {
                        str = UserObject.getForcedFirstName(this.f12718c.getMessagesController().getUser(Long.valueOf(this.f12716a.f12468a)));
                    } else {
                        TLRPC.Chat chat = this.f12718c.getMessagesController().getChat(Long.valueOf(-this.f12716a.f12468a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f12718c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.C1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new y9(parentActivity, this.f12718c.getResourceProvider(), j10, 5, str2, new q7(this, j10, 0), 0L).show();
                } else {
                    this.f12722i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f12716a.f12468a);
                    tL_messages_sendPaidReaction.msg_id = this.f12716a.f12469b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.random.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c3 = c();
                    if (c3 != 0 && c3 != UserConfig.getInstance(this.f12730q.f12787a).getClientUserId()) {
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
                    this.f12730q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new eg.d0(this, messagesController, j10));
                }
            }
        } else {
            this.f12723j = true;
            this.f12717b.addPaidReactions((int) (-this.h), this.f12721g, c());
            s7 s7Var2 = this.f12730q;
            s7Var2.f12792g -= this.h;
            NotificationCenter.getInstance(s7Var2.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        m5 m5Var = this.f12728o;
        if (m5Var != null && (messageObject = this.f12717b) != null && messageObject.getId() == m5Var.f12456c) {
            this.f12728o.c();
        }
        s7 s7Var3 = this.f12730q;
        if (s7Var3.B == this) {
            s7Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f12727n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f12730q.B(this.f12717b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f12730q.f12787a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
