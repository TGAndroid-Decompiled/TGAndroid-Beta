package gh;

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
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.zb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
public final class u7 {
    public final p7 f8963a;
    public final MessageObject f8964b;
    public final qn f8965c;
    public final gc d;
    public final ac f8966e;
    public final zb f8967f;
    public final boolean f8968g;
    public long h;
    public long f8971k;
    public boolean f8972l;
    public boolean f8973m;
    public p5 f8975o;
    public final s7 f8976p;
    public final v7 f8977q;
    public boolean f8969i = false;
    public boolean f8970j = false;
    public Long f8974n = null;

    public u7(v7 v7Var, p7 p7Var, MessageObject messageObject, qn qnVar, boolean z10) {
        this.f8977q = v7Var;
        s7 s7Var = new s7(this, 0);
        this.f8976p = s7Var;
        this.f8963a = p7Var;
        this.f8964b = messageObject;
        this.f8965c = qnVar;
        Context t10 = v7.t(qnVar);
        ac acVar = new ac(t10, qnVar.f41848aa);
        this.f8966e = acVar;
        acVar.c(R.raw.stars_topup, new String[0]);
        acVar.f26755b.setText(d());
        ec ecVar = new ec(t10, qnVar.f41848aa, true, false);
        ecVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ecVar.f27999a = new s7(this, 1);
        zb zbVar = new zb(t10, qnVar.f41848aa);
        this.f8967f = zbVar;
        zbVar.f35268b = 5000L;
        zbVar.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, qnVar.f41848aa));
        ecVar.addView(zbVar, g7.e6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        acVar.setButton(ecVar);
        gc b10 = oc.a0(qnVar).b(acVar, -1);
        this.d = b10;
        b10.f28745r = false;
        if (z10) {
            b10.k(true);
            this.f8973m = true;
        }
        b10.v = s7Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f8968g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        v7 v7Var = this.f8977q;
        int i9 = v7Var.f9045a;
        AndroidUtilities.cancelRunOnUIThread(this.f8976p);
        this.f8970j = true;
        this.d.b();
        p5 p5Var = this.f8975o;
        if (p5Var != null) {
            p5Var.c();
        }
        int i10 = (int) (-this.h);
        boolean z10 = this.f8968g;
        long c10 = c();
        MessageObject messageObject = this.f8964b;
        messageObject.addPaidReactions(i10, z10, c10);
        v7Var.f9050g -= this.h;
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (v7Var.B == this) {
            v7Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f8976p);
        if (this.f8972l) {
            if (!this.f8969i && !this.f8970j) {
                v7 y10 = v7.y(this.f8977q.f9045a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f8977q.f9045a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f8977q.f9045a);
                long j10 = this.h;
                if (y10.f9048e && y10.q(false, false, null).amount < j10) {
                    this.f8970j = true;
                    this.f8964b.addPaidReactions((int) (-this.h), this.f8968g, c());
                    v7 v7Var = this.f8977q;
                    v7Var.f9050g = 0L;
                    NotificationCenter.getInstance(v7Var.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f8977q.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f8964b.getDialogId()), Integer.valueOf(this.f8964b.getId()), this.f8964b.messageOwner.reactions);
                    if (this.f8963a.f8727a >= 0) {
                        str = UserObject.getForcedFirstName(this.f8965c.getMessagesController().getUser(Long.valueOf(this.f8963a.f8727a)));
                    } else {
                        TLRPC.Chat chat = this.f8965c.getMessagesController().getChat(Long.valueOf(-this.f8963a.f8727a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f8965c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.C1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new ea(parentActivity, this.f8965c.getResourceProvider(), j10, 5, str2, new t7(this, j10, 0), 0L).show();
                } else {
                    this.f8969i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f8963a.f8727a);
                    tL_messages_sendPaidReaction.msg_id = this.f8963a.f8728b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.random.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f8977q.f9045a).getClientUserId()) {
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
                    this.f8977q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new bg.f0(this, messagesController, j10));
                }
            }
        } else {
            this.f8970j = true;
            this.f8964b.addPaidReactions((int) (-this.h), this.f8968g, c());
            v7 v7Var2 = this.f8977q;
            v7Var2.f9050g -= this.h;
            NotificationCenter.getInstance(v7Var2.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        p5 p5Var = this.f8975o;
        if (p5Var != null && (messageObject = this.f8964b) != null && messageObject.getId() == p5Var.f8715c) {
            this.f8975o.c();
        }
        v7 v7Var3 = this.f8977q;
        if (v7Var3.B == this) {
            v7Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f8974n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f8977q.B(this.f8964b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f8977q.f9045a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
