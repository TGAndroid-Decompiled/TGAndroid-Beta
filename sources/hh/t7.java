package hh;

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
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

public final class t7 {

    public final o7 f10086a;

    public final MessageObject f10087b;

    public final rn f10088c;
    public final ec d;

    public final yb f10089e;

    public final xb f10090f;

    public final boolean f10091g;
    public long h;

    public long f10094k;

    public boolean f10095l;

    public boolean f10096m;

    public o5 f10098o;

    public final r7 f10099p;

    public final u7 f10100q;

    public boolean f10092i = false;

    public boolean f10093j = false;

    public Long f10097n = null;

    public t7(u7 u7Var, o7 o7Var, MessageObject messageObject, rn rnVar, boolean z10) {
        this.f10100q = u7Var;
        r7 r7Var = new r7(this, 0);
        this.f10099p = r7Var;
        this.f10086a = o7Var;
        this.f10087b = messageObject;
        this.f10088c = rnVar;
        Context contextT = u7.t(rnVar);
        yb ybVar = new yb(contextT, rnVar.f41983aa);
        this.f10089e = ybVar;
        ybVar.c(R.raw.stars_topup, new String[0]);
        ybVar.f34876b.setText(d());
        cc ccVar = new cc(contextT, rnVar.f41983aa, true, false);
        ccVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ccVar.f27402a = new r7(this, 1);
        xb xbVar = new xb(contextT, rnVar.f41983aa);
        this.f10090f = xbVar;
        xbVar.f34571b = 5000L;
        xbVar.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, rnVar.f41983aa));
        ccVar.addView(xbVar, h7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ccVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        ybVar.setButton(ccVar);
        ec ecVarB = mc.a0(rnVar).b(ybVar, -1);
        this.d = ecVarB;
        ecVarB.f28028r = false;
        if (z10) {
            ecVarB.k(true);
            this.f10096m = true;
        }
        ecVarB.v = r7Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.f10091g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        u7 u7Var = this.f10100q;
        int i10 = u7Var.f10151a;
        AndroidUtilities.cancelRunOnUIThread(this.f10099p);
        this.f10093j = true;
        this.d.b();
        o5 o5Var = this.f10098o;
        if (o5Var != null) {
            o5Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.f10091g;
        long jC = c();
        MessageObject messageObject = this.f10087b;
        messageObject.addPaidReactions(i11, z10, jC);
        u7Var.f10156g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (u7Var.B == this) {
            u7Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String forcedFirstName;
        AndroidUtilities.cancelRunOnUIThread(this.f10099p);
        int i10 = 0;
        if (!this.f10095l) {
            this.f10093j = true;
            this.f10087b.addPaidReactions((int) (-this.h), this.f10091g, c());
            u7 u7Var = this.f10100q;
            u7Var.f10156g -= this.h;
            NotificationCenter.getInstance(u7Var.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (!this.f10092i && !this.f10093j) {
            u7 u7VarY = u7.y(this.f10100q.f10151a, false);
            MessagesController messagesController = MessagesController.getInstance(this.f10100q.f10151a);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f10100q.f10151a);
            long j10 = this.h;
            if (!u7VarY.f10154e || u7VarY.q(false, false, null).amount >= j10) {
                this.f10092i = true;
                TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f10086a.f9840a);
                tL_messages_sendPaidReaction.msg_id = this.f10086a.f9841b;
                tL_messages_sendPaidReaction.random_id = (Utilities.random.nextLong() & 4294967295L) | (((long) connectionsManager.getCurrentTime()) << 32);
                tL_messages_sendPaidReaction.count = (int) this.h;
                tL_messages_sendPaidReaction.flags |= 1;
                long jC = c();
                if (jC == 0 || jC == UserConfig.getInstance(this.f10100q.f10151a).getClientUserId()) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (jC == 2666000) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = messagesController.getInputPeer(jC);
                }
                this.f10100q.P();
                connectionsManager.sendRequest(tL_messages_sendPaidReaction, new cg.c0(this, messagesController, j10));
            } else {
                this.f10093j = true;
                this.f10087b.addPaidReactions((int) (-this.h), this.f10091g, c());
                u7 u7Var2 = this.f10100q;
                u7Var2.f10156g = 0L;
                NotificationCenter.getInstance(u7Var2.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                NotificationCenter.getInstance(this.f10100q.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f10087b.getDialogId()), Integer.valueOf(this.f10087b.getId()), this.f10087b.messageOwner.reactions);
                if (this.f10086a.f9840a >= 0) {
                    forcedFirstName = UserObject.getForcedFirstName(this.f10088c.getMessagesController().getUser(Long.valueOf(this.f10086a.f9840a)));
                } else {
                    TLRPC.Chat chat = this.f10088c.getMessagesController().getChat(Long.valueOf(-this.f10086a.f9840a));
                    forcedFirstName = chat == null ? "" : chat.title;
                }
                String str = forcedFirstName;
                Context parentActivity = this.f10088c.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.C1;
                }
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                new ea(parentActivity, this.f10088c.getResourceProvider(), j10, 5, str, new s7(this, j10, i10), 0L).show();
            }
        }
        this.d.b();
        o5 o5Var = this.f10098o;
        if (o5Var != null && (messageObject = this.f10087b) != null && messageObject.getId() == o5Var.f9828c) {
            this.f10098o.c();
        }
        u7 u7Var3 = this.f10100q;
        if (u7Var3.B == this) {
            u7Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f10097n;
        return l10 != null ? l10.longValue() : this.f10100q.B(this.f10087b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        return (c() == 0 || c() == UserConfig.getInstance(this.f10100q.f10151a).getClientUserId()) ? LocaleController.getString(R.string.StarsSentTitle) : LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
    }
}
