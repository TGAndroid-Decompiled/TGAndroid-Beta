package i5;

import h5.d0;
import j3.c0;
import j3.q0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import lh.g5;
import nh.v0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ko;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qy;
import org.telegram.ui.sf1;
import org.telegram.ui.zn;
public final class x implements Runnable {
    public final int f7321a;
    public final Object f7322b;
    public final long f7323c;
    public final long d;
    public final Object e;

    public x(Object obj, long j10, long j11, Object obj2, int i10) {
        this.f7321a = i10;
        this.e = obj;
        this.f7323c = j10;
        this.d = j11;
        this.f7322b = obj2;
    }

    @Override
    public final void run() {
        int i10 = this.f7321a;
        long j10 = this.d;
        long j11 = this.f7323c;
        Object obj = this.f7322b;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                int i11 = d0.f6924a;
                k3.f fVar = ((c0) ((f7.b) obj2).f6002c).f8423a.f8543q;
                k3.a p10 = fVar.p();
                fVar.q(p10, 1016, new k3.c(p10, (String) obj, this.d, this.f7323c));
                return;
            case 1:
                int i12 = d0.f6924a;
                k3.f fVar2 = ((c0) ((l3.q) ((f7.b) obj2).f6002c)).f8423a.f8543q;
                k3.a p11 = fVar2.p();
                fVar2.q(p11, 1008, new q0(p11, (String) obj, this.d, this.f7323c));
                return;
            case 2:
                g5.e0((g5) obj2, this.f7323c, this.d, (Utilities.Callback) obj);
                return;
            case 3:
                long j12 = this.d;
                ((v0) obj2).n(this.f7323c, (TLRPC.TL_textWithEntities) obj, j12);
                return;
            case 4:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.f7323c, this.d);
                return;
            case 5:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.f7323c, this.d, (ArrayList) obj);
                return;
            case 6:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.f7323c, this.d, (TLRPC.Message) obj);
                return;
            case 7:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.f7323c, this.d, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                return;
            case 8:
                long j13 = this.d;
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.f7323c, (TLRPC.InputPeer) obj, j13);
                return;
            case 9:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.f7323c, this.d, (MessagesStorage.IntCallback) obj);
                return;
            case 10:
                NotificationsSettingsFacade.a((NotificationsSettingsFacade) obj2, this.f7323c, this.d, (TLRPC.PeerNotifySettings) obj);
                return;
            case 11:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.f7323c, this.d, (byte[]) obj);
                return;
            case 12:
                ((ko) obj2).d(this.f7323c, this.d, (HashSet) obj);
                return;
            case 13:
                qy qyVar = (qy) obj2;
                sf1 sf1Var = (sf1) obj;
                if (qyVar.f37649z2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j11, j10));
                    qyVar.f37649z2.w(qyVar, arrayList, null, false, qyVar.G2, qyVar.H2, qyVar.I2, sf1Var);
                    if (qyVar.f37550f2) {
                        qyVar.f37649z2 = null;
                        return;
                    }
                    return;
                }
                qyVar.finishFragment();
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                zn znVar = (zn) obj;
                Pattern pattern = LaunchActivity.f31586y1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.L).getTopicsController().findTopic(j11, j10);
                StringBuilder s6 = android.support.v4.media.a.s(j11, "LaunchActivity openForum after load ", " ");
                s6.append(j10);
                s6.append(" TL_forumTopic ");
                s6.append(findTopic);
                FileLog.d(s6.toString());
                if (launchActivity.f31612n0 != null) {
                    ag.f.a(znVar, MessagesStorage.TopicKey.of(-j11, j10));
                    ((ActionBarLayout) launchActivity.O()).P(znVar);
                    return;
                }
                return;
        }
    }

    public x(Object obj, long j10, TLObject tLObject, long j11, int i10) {
        this.f7321a = i10;
        this.e = obj;
        this.f7323c = j10;
        this.f7322b = tLObject;
        this.d = j11;
    }

    public x(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f7321a = i10;
        this.e = obj;
        this.f7322b = obj2;
        this.f7323c = j10;
        this.d = j11;
    }
}
