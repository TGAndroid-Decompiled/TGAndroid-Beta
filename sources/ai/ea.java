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
public final class ea {
    public final z9 f1254a;
    public final MessageObject f1255b;
    public final sn f1256c;
    public final org.telegram.ui.Components.qc d;
    public final org.telegram.ui.Components.kc e;
    public final org.telegram.ui.Components.jc f1257f;
    public final boolean f1258g;
    public long h;
    public long f1261k;
    public boolean f1262l;
    public boolean f1263m;
    public p7 f1265o;
    public final ca f1266p;
    public final fa f1267q;
    public boolean f1259i = false;
    public boolean f1260j = false;
    public Long f1264n = null;

    public ea(fa faVar, z9 z9Var, MessageObject messageObject, sn snVar, boolean z10) {
        this.f1267q = faVar;
        ca caVar = new ca(this, 0);
        this.f1266p = caVar;
        this.f1254a = z9Var;
        this.f1255b = messageObject;
        this.f1256c = snVar;
        Context t10 = fa.t(snVar);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, snVar.f41205ea);
        this.e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.f27834b.setText(d());
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, snVar.f41205ea, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f28918a = new ca(this, 1);
        org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(t10, snVar.f41205ea);
        this.f1257f = jcVar;
        jcVar.f27495b = 5000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, snVar.f41205ea));
        ocVar.addView(jcVar, w7.z5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(snVar).b(kcVar, -1);
        this.d = b10;
        b10.f29647r = false;
        if (z10) {
            b10.k(true);
            this.f1263m = true;
        }
        b10.v = caVar;
        this.h = 0L;
        System.currentTimeMillis();
        this.f1258g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        fa faVar = this.f1267q;
        int i10 = faVar.f1311a;
        AndroidUtilities.cancelRunOnUIThread(this.f1266p);
        this.f1260j = true;
        this.d.b();
        p7 p7Var = this.f1265o;
        if (p7Var != null) {
            p7Var.c();
        }
        boolean z10 = this.f1258g;
        long c10 = c();
        MessageObject messageObject = this.f1255b;
        messageObject.addPaidReactions((int) (-this.h), z10, c10);
        faVar.f1315g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (faVar.B == this) {
            faVar.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.f1266p);
        if (this.f1262l) {
            if (!this.f1259i && !this.f1260j) {
                fa y3 = fa.y(this.f1267q.f1311a, false);
                MessagesController messagesController = MessagesController.getInstance(this.f1267q.f1311a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f1267q.f1311a);
                long j10 = this.h;
                if (y3.e && y3.q(false, false, null).amount < j10) {
                    this.f1260j = true;
                    this.f1255b.addPaidReactions((int) (-this.h), this.f1258g, c());
                    fa faVar = this.f1267q;
                    faVar.f1315g = 0L;
                    NotificationCenter.getInstance(faVar.f1311a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(this.f1267q.f1311a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.f1255b.getDialogId()), Integer.valueOf(this.f1255b.getId()), this.f1255b.messageOwner.reactions);
                    if (this.f1254a.f2544a >= 0) {
                        str = UserObject.getForcedFirstName(this.f1256c.getMessagesController().getUser(Long.valueOf(this.f1254a.f2544a)));
                    } else {
                        TLRPC.Chat chat = this.f1256c.getMessagesController().getChat(Long.valueOf(-this.f1254a.f2544a));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f1256c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.H1;
                    }
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                    new bd(parentActivity, this.f1256c.getResourceProvider(), j10, 5, str2, new da(this, j10, 0), 0L).show();
                } else {
                    this.f1259i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.f1254a.f2544a);
                    tL_messages_sendPaidReaction.msg_id = this.f1254a.f2545b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != UserConfig.getInstance(this.f1267q.f1311a).getClientUserId()) {
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
                    this.f1267q.P();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new p9(this, messagesController, j10, 1));
                }
            }
        } else {
            this.f1260j = true;
            this.f1255b.addPaidReactions((int) (-this.h), this.f1258g, c());
            fa faVar2 = this.f1267q;
            faVar2.f1315g -= this.h;
            NotificationCenter.getInstance(faVar2.f1311a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        this.d.b();
        p7 p7Var = this.f1265o;
        if (p7Var != null && (messageObject = this.f1255b) != null && messageObject.getId() == p7Var.f2017c) {
            this.f1265o.c();
        }
        fa faVar3 = this.f1267q;
        if (faVar3.B == this) {
            faVar3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f1264n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f1267q.B(this.f1255b);
    }

    public final String d() {
        if (c() == 2666000) {
            return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
        }
        if (c() != 0 && c() != UserConfig.getInstance(this.f1267q.f1311a).getClientUserId()) {
            return LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
        }
        return LocaleController.getString(R.string.StarsSentTitle);
    }
}
