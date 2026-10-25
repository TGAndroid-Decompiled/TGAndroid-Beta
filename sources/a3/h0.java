package a3;

import bi.h7;
import di.x0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.l11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.af1;
import org.telegram.ui.cy;
import org.telegram.ui.un;
import vi.s0;
public final class h0 implements Runnable {
    public final int f119a;
    public final long f120b;
    public final long f121c;
    public final Object d;
    public final Object e;

    public h0(Object obj, long j10, long j11, Object obj2, int i10) {
        this.f119a = i10;
        this.d = obj;
        this.f120b = j10;
        this.f121c = j11;
        this.e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f119a) {
            case 0:
                String str = (String) this.e;
                long j10 = this.f120b;
                long j11 = this.f121c;
                String str2 = e2.n0.f9692a;
                j2.e eVar = ((i2.d0) ((m0) ((n4.s) this.d).f18697c)).f13509a.f13614s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1016, new ig.g(p10, str, j11, j10, 19));
                return;
            case 1:
                h7.a1((h7) this.d, this.f120b, this.f121c, (Utilities.Callback) this.e);
                return;
            case 2:
                ((x0) this.d).n(this.f120b, (TLRPC.TL_textWithEntities) this.e, this.f121c);
                return;
            case 3:
                String str3 = (String) this.e;
                long j12 = this.f120b;
                long j13 = this.f121c;
                String str4 = e2.n0.f9692a;
                j2.e eVar2 = ((i2.d0) ((k2.v) ((rf.b) this.d).f47333c)).f13509a.f13614s;
                j2.a p11 = eVar2.p();
                eVar2.q(p11, 1008, new ig.g(p11, str3, j13, j12, 7));
                return;
            case 4:
                ((FileUploadOperation) this.d).lambda$checkNewDataAvailable$4((Float) this.e, this.f120b, this.f121c);
                return;
            case 5:
                ((MediaDataController) this.d).lambda$loadPinnedMessages$163(this.f120b, this.f121c, (ArrayList) this.e);
                return;
            case 6:
                ((MediaDataController) this.d).lambda$saveDraftReplyMessage$193(this.f120b, this.f121c, (TLRPC.Message) this.e);
                return;
            case 7:
                ((MessagesStorage) this.d).lambda$loadPendingTasks$29(this.f120b, this.f121c, (TLRPC.TL_messages_deleteScheduledMessages) this.e);
                return;
            case 8:
                ((MessagesStorage) this.d).lambda$loadPendingTasks$21(this.f120b, (TLRPC.InputPeer) this.e, this.f121c);
                return;
            case 9:
                ((MessagesStorage) this.d).lambda$getUnreadMention$159(this.f120b, this.f121c, (MessagesStorage.IntCallback) this.e);
                return;
            case 10:
                NotificationsSettingsFacade.a((NotificationsSettingsFacade) this.d, this.f120b, this.f121c, (TLRPC.PeerNotifySettings) this.e);
                return;
            case 11:
                ((SecretChatHelper) this.d).lambda$resendMessages$15(this.f120b, (TLRPC.EncryptedChat) this.e, this.f121c);
                return;
            case 12:
                ((GroupCallMessagesController) this.d).lambda$processUpdate$3(this.f120b, this.f121c, (byte[]) this.e);
                return;
            case 13:
                ((bp) this.d).e(this.f120b, this.f121c, (HashSet) this.e);
                return;
            case 14:
                cy cyVar = (cy) this.d;
                long j14 = this.f120b;
                long j15 = this.f121c;
                af1 af1Var = (af1) this.e;
                if (cyVar.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j14, j15));
                    cyVar.C2.v(cyVar, arrayList, null, false, cyVar.J2, cyVar.K2, cyVar.L2, af1Var);
                    if (cyVar.f38606i2) {
                        cyVar.C2 = null;
                        return;
                    }
                    return;
                }
                cyVar.finishFragment();
                return;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j16 = this.f120b;
                long j17 = this.f121c;
                un unVar = (un) this.e;
                Pattern pattern = LaunchActivity.D1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j16, j17);
                StringBuilder t10 = a1.g.t(j16, "LaunchActivity openForum after load ", " ");
                t10.append(j17);
                t10.append(" TL_forumTopic ");
                t10.append(findTopic);
                FileLog.d(t10.toString());
                if (launchActivity.f35550q0 != null) {
                    pg.d.a(unVar, MessagesStorage.TopicKey.of(-j16, j17));
                    ((ActionBarLayout) launchActivity.O()).R(unVar);
                    return;
                }
                return;
            default:
                s0 s0Var = (s0) this.d;
                vi.o0 o0Var = (vi.o0) this.e;
                long j18 = this.f120b;
                long j19 = this.f121c;
                synchronized (s0Var.f50584g) {
                    if (!o0Var.d && !o0Var.e) {
                        ((l11) s0Var.e).a(o0Var.f50519a, o0Var.f50520b, j18, j19);
                        return;
                    }
                    return;
                }
        }
    }

    public h0(Object obj, long j10, TLObject tLObject, long j11, int i10) {
        this.f119a = i10;
        this.d = obj;
        this.f120b = j10;
        this.e = tLObject;
        this.f121c = j11;
    }

    public h0(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f119a = i10;
        this.d = obj;
        this.e = obj2;
        this.f120b = j10;
        this.f121c = j11;
    }
}
