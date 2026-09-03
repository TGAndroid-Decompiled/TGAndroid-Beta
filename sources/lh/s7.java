package lh;

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
import org.telegram.ui.zn;
public final class s7 {
    public final n7 f13063a;
    public final MessageObject f13064b;
    public final zn f13065c;
    public final ic d;
    public final cc e;
    public final bc f13066f;
    public final boolean f13067g;
    public long h;
    public long f13070k;
    public boolean f13071l;
    public boolean f13072m;
    public l5 f13074o;
    public final q7 f13075p;
    public final t7 f13076q;
    public boolean f13068i = false;
    public boolean f13069j = false;
    public Long f13073n = null;

    public s7(t7 t7Var, n7 n7Var, MessageObject messageObject, zn znVar, boolean z4) {
        this.f13076q = t7Var;
        q7 q7Var = new q7(this, 0);
        this.f13075p = q7Var;
        this.f13063a = n7Var;
        this.f13064b = messageObject;
        this.f13065c = znVar;
        Context t6 = t7.t(znVar);
        cc ccVar = new cc(t6, znVar.f40534ba);
        this.e = ccVar;
        ccVar.c(R.raw.stars_topup, new String[0]);
        ccVar.f23921b.setText(d());
        gc gcVar = new gc(t6, znVar.f40534ba, true, false);
        gcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        gcVar.f25112a = new q7(this, 1);
        bc bcVar = new bc(t6, znVar.f40534ba);
        this.f13066f = bcVar;
        bcVar.f23614b = 5000L;
        bcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, znVar.f40534ba));
        gcVar.addView(bcVar, k7.b6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        gcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        ccVar.setButton(gcVar);
        ic b10 = qc.a0(znVar).b(ccVar, -1);
        this.d = b10;
        b10.f25679r = false;
        if (z4) {
            b10.k(true);
            this.f13072m = true;
        }
        b10.v = q7Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f13067g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        t7 t7Var = this.f13076q;
        int i10 = t7Var.f13133a;
        AndroidUtilities.cancelRunOnUIThread(this.f13075p);
        this.f13069j = true;
        this.d.b();
        l5 l5Var = this.f13074o;
        if (l5Var != null) {
            l5Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z4 = this.f13067g;
        long c3 = c();
        MessageObject messageObject = this.f13064b;
        messageObject.addPaidReactions(i11, z4, c3);
        t7Var.f13137g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (t7Var.B == this) {
            t7Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f13075p);
        if (this.f13071l) {
            if (!this.f13068i && !this.f13069j) {
                t7 y10 = t7.y(this.f13076q.f13133a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f13076q.f13133a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f13076q.f13133a);
                long j10 = this.h;
                if (y10.e && y10.q(false, false, null).amount < j10) {
                    this.f13069j = true;
                    this.f13064b.addPaidReactions((int) (-this.h), this.f13067g, c());
                    t7 t7Var = this.f13076q;
                    t7Var.f13137g = 0L;
                    NotificationCenter.getInstance(t7Var.f13133a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f13076q.f13133a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f13064b.getDialogId()), Integer.valueOf(this.f13064b.getId()), this.f13064b.messageOwner.reactions);
                    if (this.f13063a.f12836a >= 0) {
                        str = UserObject.getForcedFirstName(this.f13065c.getMessagesController().getUser(Long.valueOf(this.f13063a.f12836a)));
                    } else {
                        TLRPC.Chat chat = this.f13065c.getMessagesController().getChat(Long.valueOf(-this.f13063a.f12836a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f13065c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.D1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new z9(parentActivity, this.f13065c.getResourceProvider(), j10, 5, str2, new r7(this, j10, 0), 0L).show();
                } else {
                    this.f13068i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f13063a.f12836a);
                    tL_messages_sendPaidReaction.msg_id = this.f13063a.f12837b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.random.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c3 = c();
                    if (c3 != 0 && c3 != UserConfig.getInstance(this.f13076q.f13133a).getClientUserId()) {
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
                    this.f13076q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new gg.c0(this, messagesController, j10));
                }
            }
        } else {
            this.f13069j = true;
            this.f13064b.addPaidReactions((int) (-this.h), this.f13067g, c());
            t7 t7Var2 = this.f13076q;
            t7Var2.f13137g -= this.h;
            NotificationCenter.getInstance(t7Var2.f13133a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        l5 l5Var = this.f13074o;
        if (l5Var != null && (messageObject = this.f13064b) != null && messageObject.getId() == l5Var.f12737c) {
            this.f13074o.c();
        }
        t7 t7Var3 = this.f13076q;
        if (t7Var3.B == this) {
            t7Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f13073n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f13076q.B(this.f13064b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f13076q.f13133a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
