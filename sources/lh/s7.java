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
import org.telegram.ui.xn;
public final class s7 {
    public final n7 f13079a;
    public final MessageObject f13080b;
    public final xn f13081c;
    public final ic d;
    public final cc e;
    public final bc f13082f;
    public final boolean f13083g;
    public long h;
    public long f13086k;
    public boolean f13087l;
    public boolean f13088m;
    public l5 f13090o;
    public final q7 f13091p;
    public final t7 f13092q;
    public boolean f13084i = false;
    public boolean f13085j = false;
    public Long f13089n = null;

    public s7(t7 t7Var, n7 n7Var, MessageObject messageObject, xn xnVar, boolean z4) {
        this.f13092q = t7Var;
        q7 q7Var = new q7(this, 0);
        this.f13091p = q7Var;
        this.f13079a = n7Var;
        this.f13080b = messageObject;
        this.f13081c = xnVar;
        Context t6 = t7.t(xnVar);
        cc ccVar = new cc(t6, xnVar.f39968ba);
        this.e = ccVar;
        ccVar.c(R.raw.stars_topup, new String[0]);
        ccVar.f23960b.setText(d());
        gc gcVar = new gc(t6, xnVar.f39968ba, true, false);
        gcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        gcVar.f25097a = new q7(this, 1);
        bc bcVar = new bc(t6, xnVar.f39968ba);
        this.f13082f = bcVar;
        bcVar.f23628b = 5000L;
        bcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, xnVar.f39968ba));
        gcVar.addView(bcVar, k7.b6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        gcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        ccVar.setButton(gcVar);
        ic b10 = qc.a0(xnVar).b(ccVar, -1);
        this.d = b10;
        b10.f25680r = false;
        if (z4) {
            b10.k(true);
            this.f13088m = true;
        }
        b10.v = q7Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f13083g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        t7 t7Var = this.f13092q;
        int i10 = t7Var.f13149a;
        AndroidUtilities.cancelRunOnUIThread(this.f13091p);
        this.f13085j = true;
        this.d.b();
        l5 l5Var = this.f13090o;
        if (l5Var != null) {
            l5Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z4 = this.f13083g;
        long c3 = c();
        MessageObject messageObject = this.f13080b;
        messageObject.addPaidReactions(i11, z4, c3);
        t7Var.f13153g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (t7Var.B == this) {
            t7Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f13091p);
        if (this.f13087l) {
            if (!this.f13084i && !this.f13085j) {
                t7 y10 = t7.y(this.f13092q.f13149a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f13092q.f13149a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f13092q.f13149a);
                long j10 = this.h;
                if (y10.e && y10.q(false, false, null).amount < j10) {
                    this.f13085j = true;
                    this.f13080b.addPaidReactions((int) (-this.h), this.f13083g, c());
                    t7 t7Var = this.f13092q;
                    t7Var.f13153g = 0L;
                    NotificationCenter.getInstance(t7Var.f13149a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f13092q.f13149a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f13080b.getDialogId()), Integer.valueOf(this.f13080b.getId()), this.f13080b.messageOwner.reactions);
                    if (this.f13079a.f12852a >= 0) {
                        str = UserObject.getForcedFirstName(this.f13081c.getMessagesController().getUser(Long.valueOf(this.f13079a.f12852a)));
                    } else {
                        TLRPC.Chat chat = this.f13081c.getMessagesController().getChat(Long.valueOf(-this.f13079a.f12852a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f13081c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.D1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new z9(parentActivity, this.f13081c.getResourceProvider(), j10, 5, str2, new r7(this, j10, 0), 0L).show();
                } else {
                    this.f13084i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f13079a.f12852a);
                    tL_messages_sendPaidReaction.msg_id = this.f13079a.f12853b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.random.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c3 = c();
                    if (c3 != 0 && c3 != UserConfig.getInstance(this.f13092q.f13149a).getClientUserId()) {
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
                    this.f13092q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new gg.c0(this, messagesController, j10));
                }
            }
        } else {
            this.f13085j = true;
            this.f13080b.addPaidReactions((int) (-this.h), this.f13083g, c());
            t7 t7Var2 = this.f13092q;
            t7Var2.f13153g -= this.h;
            NotificationCenter.getInstance(t7Var2.f13149a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        l5 l5Var = this.f13090o;
        if (l5Var != null && (messageObject = this.f13080b) != null && messageObject.getId() == l5Var.f12753c) {
            this.f13090o.c();
        }
        t7 t7Var3 = this.f13092q;
        if (t7Var3.B == this) {
            t7Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f13089n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f13092q.B(this.f13080b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f13092q.f13149a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
