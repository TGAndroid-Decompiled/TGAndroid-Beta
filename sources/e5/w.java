package e5;

import d5.g0;
import h3.h0;
import h3.q2;
import hh.i5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import jh.u0;
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
import org.telegram.ui.Components.co;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gy;
import org.telegram.ui.rn;
import org.telegram.ui.we1;

public final class w implements Runnable {

    public final int f5303a;

    public final long f5304b;

    public final long f5305c;
    public final Object d;

    public final Object f5306e;

    public w(Object obj, long j10, long j11, Object obj2, int i10) {
        this.f5303a = i10;
        this.d = obj;
        this.f5304b = j10;
        this.f5305c = j11;
        this.f5306e = obj2;
    }

    @Override
    public final void run() {
        int i10 = this.f5303a;
        long j10 = this.f5305c;
        long j11 = this.f5304b;
        Object obj = this.f5306e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                h0 h0Var = (h0) ((xe.b) obj2).f49393c;
                int i11 = g0.f4795a;
                i3.f fVar = h0Var.f7870a.f7987r;
                i3.a aVarK = fVar.k();
                fVar.l(aVarK, 1016, new q2(aVarK, (String) obj, this.f5305c, this.f5304b, 25));
                break;
            case 1:
                i5.e0((i5) obj2, this.f5304b, this.f5305c, (Utilities.Callback) obj);
                break;
            case 2:
                j3.o oVar = ((j3.n) obj2).f12392b;
                int i12 = g0.f4795a;
                i3.f fVar2 = ((h0) oVar).f7870a.f7987r;
                i3.a aVarK2 = fVar2.k();
                fVar2.l(aVarK2, 1008, new q2(aVarK2, (String) obj, this.f5305c, this.f5304b, 8));
                break;
            case 3:
                long j12 = this.f5305c;
                ((u0) obj2).n(this.f5304b, (TLRPC.TL_textWithEntities) obj, j12);
                break;
            case 4:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.f5304b, this.f5305c);
                break;
            case 5:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.f5304b, this.f5305c, (ArrayList) obj);
                break;
            case 6:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.f5304b, this.f5305c, (TLRPC.Message) obj);
                break;
            case 7:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.f5304b, this.f5305c, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                break;
            case 8:
                long j13 = this.f5305c;
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.f5304b, (TLRPC.InputPeer) obj, j13);
                break;
            case 9:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.f5304b, this.f5305c, (MessagesStorage.IntCallback) obj);
                break;
            case 10:
                ((NotificationsSettingsFacade) obj2).lambda$applyDialogNotificationsSettings$1(this.f5304b, this.f5305c, (TLRPC.PeerNotifySettings) obj);
                break;
            case 11:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.f5304b, this.f5305c, (byte[]) obj);
                break;
            case 12:
                ((co) obj2).d(this.f5304b, this.f5305c, (HashSet) obj);
                break;
            case 13:
                gy gyVar = (gy) obj2;
                we1 we1Var = (we1) obj;
                if (gyVar.f38621y2 == null) {
                    gyVar.finishFragment();
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j11, j10));
                    gyVar.f38621y2.w(gyVar, arrayList, null, false, gyVar.F2, gyVar.G2, gyVar.H2, we1Var);
                    if (gyVar.f38521e2) {
                        gyVar.f38621y2 = null;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                rn rnVar = (rn) obj;
                Pattern pattern = LaunchActivity.f35496x1;
                TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(launchActivity.K).getTopicsController().findTopic(j11, j10);
                StringBuilder sbQ = a9.p.q(j11, "LaunchActivity openForum after load ", " ");
                sbQ.append(j10);
                sbQ.append(" TL_forumTopic ");
                sbQ.append(tL_forumTopicFindTopic);
                FileLog.d(sbQ.toString());
                if (launchActivity.m0 != null) {
                    wf.c.a(rnVar, MessagesStorage.TopicKey.of(-j11, j10));
                    ((ActionBarLayout) launchActivity.O()).P(rnVar);
                }
                break;
        }
    }

    public w(Object obj, long j10, TLObject tLObject, long j11, int i10) {
        this.f5303a = i10;
        this.d = obj;
        this.f5304b = j10;
        this.f5306e = tLObject;
        this.f5305c = j11;
    }

    public w(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f5303a = i10;
        this.d = obj;
        this.f5306e = obj2;
        this.f5304b = j10;
        this.f5305c = j11;
    }
}
