package bi;

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
import org.telegram.ui.Components.kb1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
import org.telegram.ui.wn;
public final class aa {
    public final v9 f4270a;
    public final MessageObject f4271b;
    public final wn f4272c;
    public final org.telegram.ui.Components.qc d;
    public final org.telegram.ui.Components.kc e;
    public final ba f4273f;
    public final boolean f4274g;
    public long h;
    public long f4277k;
    public boolean f4278l;
    public boolean f4279m;
    public m7 f4281o;
    public final y9 f4282p;
    public final ca f4283q;
    public boolean f4275i = false;
    public boolean f4276j = false;
    public Long f4280n = null;

    public aa(ca caVar, v9 v9Var, MessageObject messageObject, wn wnVar, boolean z10) {
        this.f4283q = caVar;
        y9 y9Var = new y9(this, 0);
        this.f4282p = y9Var;
        this.f4270a = v9Var;
        this.f4271b = messageObject;
        this.f4272c = wnVar;
        Context t10 = ca.t(wnVar);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, wnVar.f45309ua);
        this.e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f29926b.setText(d());
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, wnVar.f45309ua, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f31259b = new y9(this, 1);
        ?? jcVar = new org.telegram.ui.Components.jc(t10, wnVar.f45309ua);
        this.f4273f = jcVar;
        jcVar.f29634b = 5000L;
        int i10 = org.telegram.ui.ActionBar.y6.Gi;
        un unVar = wnVar.f45309ua;
        ag.w wVar = new ag.w(27);
        ag.w wVar2 = new ag.w(28);
        int Q = org.telegram.ui.ActionBar.f7.Q(i10, -1, 0, 0.0f, unVar);
        wVar2.d(Q, jcVar);
        org.telegram.ui.ActionBar.z6 x9 = org.telegram.ui.ActionBar.f7.x(101, jcVar);
        x9.c(i10, -1, 0, 0.0f, unVar);
        x9.f23810n = wVar;
        x9.f23811o = wVar2;
        x9.f23809m = false;
        x9.f23804g = Q;
        ocVar.addView((View) jcVar, kb1.h(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.e.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.wc.b0(wnVar).b(kcVar, -1);
        this.d = b10;
        b10.f31870s = false;
        if (z10) {
            b10.k(true);
            this.f4279m = true;
        }
        b10.f31873w = y9Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f4274g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        ca caVar = this.f4283q;
        int i10 = caVar.f4441a;
        AndroidUtilities.cancelRunOnUIThread(this.f4282p);
        this.f4276j = true;
        this.d.b();
        m7 m7Var = this.f4281o;
        if (m7Var != null) {
            m7Var.c();
        }
        boolean z10 = this.f4274g;
        long c10 = c();
        MessageObject messageObject = this.f4271b;
        messageObject.addPaidReactions((int) (-this.h), z10, c10);
        caVar.f4445g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (caVar.B == this) {
            caVar.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f4282p);
        if (this.f4278l) {
            if (!this.f4275i && !this.f4276j) {
                ca y3 = ca.y(this.f4283q.f4441a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f4283q.f4441a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f4283q.f4441a);
                long j10 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j10) {
                    this.f4276j = true;
                    this.f4271b.addPaidReactions((int) (-this.h), this.f4274g, c());
                    ca caVar = this.f4283q;
                    caVar.f4445g = 0L;
                    NotificationCenter.getInstance(caVar.f4441a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f4283q.f4441a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f4271b.getDialogId()), Integer.valueOf(this.f4271b.getId()), this.f4271b.messageOwner.reactions);
                    if (this.f4270a.f5571a >= 0) {
                        str = UserObject.getForcedFirstName(this.f4272c.getMessagesController().getUser(Long.valueOf(this.f4270a.f5571a)));
                    } else {
                        TLRPC.Chat chat = this.f4272c.getMessagesController().getChat(Long.valueOf(-this.f4270a.f5571a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f4272c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.I1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new tc(parentActivity, this.f4272c.getResourceProvider(), j10, 5, str2, new z9(this, j10, 0), 0L).show();
                } else {
                    this.f4275i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f4270a.f5571a);
                    tL_messages_sendPaidReaction.msg_id = this.f4270a.f5572b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f4283q.f4441a).getClientUserId()) {
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
                    this.f4283q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new i3(this, messagesController, j10, 2));
                }
            }
        } else {
            this.f4276j = true;
            this.f4271b.addPaidReactions((int) (-this.h), this.f4274g, c());
            ca caVar2 = this.f4283q;
            caVar2.f4445g -= this.h;
            NotificationCenter.getInstance(caVar2.f4441a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        m7 m7Var = this.f4281o;
        if (m7Var != null && (messageObject = this.f4271b) != null && messageObject.getId() == m7Var.f5089c) {
            this.f4281o.c();
        }
        ca caVar3 = this.f4283q;
        if (caVar3.B == this) {
            caVar3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f4280n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f4283q.B(this.f4271b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f4283q.f4441a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
