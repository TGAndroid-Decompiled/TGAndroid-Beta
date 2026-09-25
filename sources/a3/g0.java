package a3;

import ai.o1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import ki.s0;
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
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.qo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qy;
import org.telegram.ui.wf1;
import org.telegram.ui.wn;
import yh.x3;
public final class g0 implements Runnable {
    public final int f116a;
    public final long f117b;
    public final long f118c;
    public final Object d;
    public final Object e;

    public g0(Object obj, long j3, long j10, Object obj2, int i10) {
        this.f116a = i10;
        this.d = obj;
        this.f117b = j3;
        this.f118c = j10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f116a) {
            case 0:
                String str = (String) this.e;
                long j3 = this.f117b;
                long j10 = this.f118c;
                String str2 = e2.d0.f7870a;
                j2.f fVar = ((i2.c0) ((l0) ((of.b) this.d).f15694c)).f10616a.f10675s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1016, new j2.c(p5, str, j10, j3));
                return;
            case 1:
                ((o1) this.d).n(this.f117b, (TLRPC.TL_textWithEntities) this.e, this.f118c);
                return;
            case 2:
                String str3 = (String) this.e;
                long j11 = this.f117b;
                long j12 = this.f118c;
                String str4 = e2.d0.f7870a;
                j2.f fVar2 = ((i2.c0) ((k2.j) ((n4.y) this.d).f15223c)).f10616a.f10675s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1008, new hg.r(p10, str3, j12, j11));
                return;
            case 3:
                s0 s0Var = (s0) this.d;
                ki.o0 o0Var = (ki.o0) this.e;
                long j13 = this.f117b;
                long j14 = this.f118c;
                synchronized (s0Var.f13845f) {
                    if (!o0Var.d && !o0Var.e) {
                        ((o01) s0Var.d).a(o0Var.f13799a, o0Var.f13800b, j13, j14);
                        return;
                    }
                    return;
                }
            case 4:
                ((FileUploadOperation) this.d).lambda$checkNewDataAvailable$4((Float) this.e, this.f117b, this.f118c);
                return;
            case 5:
                ((MediaDataController) this.d).lambda$loadPinnedMessages$163(this.f117b, this.f118c, (ArrayList) this.e);
                return;
            case 6:
                ((MediaDataController) this.d).lambda$saveDraftReplyMessage$192(this.f117b, this.f118c, (TLRPC.Message) this.e);
                return;
            case 7:
                ((MessagesStorage) this.d).lambda$loadPendingTasks$29(this.f117b, this.f118c, (TLRPC.TL_messages_deleteScheduledMessages) this.e);
                return;
            case 8:
                ((MessagesStorage) this.d).lambda$loadPendingTasks$21(this.f117b, (TLRPC.InputPeer) this.e, this.f118c);
                return;
            case 9:
                ((MessagesStorage) this.d).lambda$getUnreadMention$156(this.f117b, this.f118c, (MessagesStorage.IntCallback) this.e);
                return;
            case 10:
                NotificationsSettingsFacade.a((NotificationsSettingsFacade) this.d, this.f117b, this.f118c, (TLRPC.PeerNotifySettings) this.e);
                return;
            case 11:
                ((SecretChatHelper) this.d).lambda$resendMessages$15(this.f117b, (TLRPC.EncryptedChat) this.e, this.f118c);
                return;
            case 12:
                ((GroupCallMessagesController) this.d).lambda$processUpdate$3(this.f117b, this.f118c, (byte[]) this.e);
                return;
            case 13:
                ((qo) this.d).d(this.f117b, this.f118c, (HashSet) this.e);
                return;
            case 14:
                qy qyVar = (qy) this.d;
                long j15 = this.f117b;
                long j16 = this.f118c;
                wf1 wf1Var = (wf1) this.e;
                if (qyVar.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j15, j16));
                    qyVar.C2.u(qyVar, arrayList, null, false, qyVar.J2, qyVar.K2, qyVar.L2, wf1Var);
                    if (qyVar.f37057i2) {
                        qyVar.C2 = null;
                        return;
                    }
                    return;
                }
                qyVar.finishFragment();
                return;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j17 = this.f117b;
                long j18 = this.f118c;
                wn wnVar = (wn) this.e;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j17, j18);
                StringBuilder u10 = a4.a.u(j17, "LaunchActivity openForum after load ", " ");
                u10.append(j18);
                u10.append(" TL_forumTopic ");
                u10.append(findTopic);
                FileLog.d(u10.toString());
                if (launchActivity.f31131q0 != null) {
                    ng.d.a(wnVar, MessagesStorage.TopicKey.of(-j17, j18));
                    ((ActionBarLayout) launchActivity.O()).P(wnVar);
                    return;
                }
                return;
            default:
                x3.e0((x3) this.d, this.f117b, this.f118c, (Utilities.Callback) this.e);
                return;
        }
    }

    public g0(Object obj, long j3, TLObject tLObject, long j10, int i10) {
        this.f116a = i10;
        this.d = obj;
        this.f117b = j3;
        this.e = tLObject;
        this.f118c = j10;
    }

    public g0(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f116a = i10;
        this.d = obj;
        this.e = obj2;
        this.f117b = j3;
        this.f118c = j10;
    }
}
