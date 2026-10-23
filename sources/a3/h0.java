package a3;

import ai.l7;
import ci.x0;
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
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.zo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.sn;
import org.telegram.ui.ye1;
import si.q0;
import si.u0;
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
                String str2 = e2.m0.f8259a;
                j2.e eVar = ((i2.b0) ((m0) ((n4.s) this.d).f17189c)).f12353a.f12442s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1016, new ih.l(p5, str, j11, j10, 21));
                return;
            case 1:
                l7.a1((l7) this.d, this.f120b, this.f121c, (Utilities.Callback) this.e);
                return;
            case 2:
                ((x0) this.d).n(this.f120b, (TLRPC.TL_textWithEntities) this.e, this.f121c);
                return;
            case 3:
                String str3 = (String) this.e;
                long j12 = this.f120b;
                long j13 = this.f121c;
                String str4 = e2.m0.f8259a;
                j2.e eVar2 = ((i2.b0) ((k2.v) ((qf.b) this.d).f44865c)).f12353a.f12442s;
                j2.a p9 = eVar2.p();
                eVar2.q(p9, 1008, new ih.l(p9, str3, j13, j12, 9));
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
                ((MessagesStorage) this.d).lambda$getUnreadMention$156(this.f120b, this.f121c, (MessagesStorage.IntCallback) this.e);
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
                ((zo) this.d).e(this.f120b, this.f121c, (HashSet) this.e);
                return;
            case 14:
                ey eyVar = (ey) this.d;
                long j14 = this.f120b;
                long j15 = this.f121c;
                ye1 ye1Var = (ye1) this.e;
                if (eyVar.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j14, j15));
                    eyVar.C2.w(eyVar, arrayList, null, false, eyVar.J2, eyVar.K2, eyVar.L2, ye1Var);
                    if (eyVar.f37082i2) {
                        eyVar.C2 = null;
                        return;
                    }
                    return;
                }
                eyVar.finishFragment();
                return;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j16 = this.f120b;
                long j17 = this.f121c;
                sn snVar = (sn) this.e;
                Pattern pattern = LaunchActivity.E1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j16, j17);
                StringBuilder t10 = a1.g.t(j16, "LaunchActivity openForum after load ", " ");
                t10.append(j17);
                t10.append(" TL_forumTopic ");
                t10.append(findTopic);
                FileLog.d(t10.toString());
                if (launchActivity.f33487q0 != null) {
                    og.d.a(snVar, MessagesStorage.TopicKey.of(-j16, j17));
                    ((ActionBarLayout) launchActivity.O()).Q(snVar);
                    return;
                }
                return;
            default:
                u0 u0Var = (u0) this.d;
                q0 q0Var = (q0) this.e;
                long j18 = this.f120b;
                long j19 = this.f121c;
                synchronized (u0Var.f47253g) {
                    if (!q0Var.d && !q0Var.e) {
                        ((d11) u0Var.e).a(q0Var.f47189a, q0Var.f47190b, j18, j19);
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
