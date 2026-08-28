package e5;

import d5.f0;
import gh.k5;
import h3.h0;
import ih.w0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
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
import org.telegram.ui.Components.fo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy;
import org.telegram.ui.qn;
import org.telegram.ui.we1;
public final class y implements Runnable {
    public final int f4949a;
    public final long f4950b;
    public final long f4951c;
    public final Object d;
    public final Object f4952e;

    public y(Object obj, long j10, long j11, Object obj2, int i9) {
        this.f4949a = i9;
        this.d = obj;
        this.f4950b = j10;
        this.f4951c = j11;
        this.f4952e = obj2;
    }

    @Override
    public final void run() {
        int i9 = this.f4949a;
        long j10 = this.f4951c;
        long j11 = this.f4950b;
        Object obj = this.f4952e;
        Object obj2 = this.d;
        switch (i9) {
            case 0:
                int i10 = f0.f4349a;
                i3.f fVar = ((h0) ((we.b) obj2).f48794c).f9440a.f9557r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1016, new i3.d(k10, (String) obj, this.f4951c, this.f4950b));
                return;
            case 1:
                k5.d0((k5) obj2, this.f4950b, this.f4951c, (Utilities.Callback) obj);
                return;
            case 2:
                long j12 = this.f4951c;
                ((w0) obj2).n(this.f4950b, (TLRPC.TL_textWithEntities) obj, j12);
                return;
            case 3:
                j3.n nVar = ((j3.m) obj2).f13292b;
                int i11 = f0.f4349a;
                i3.f fVar2 = ((h0) nVar).f9440a.f9557r;
                i3.a k11 = fVar2.k();
                fVar2.l(k11, 1008, new h9.a(k11, (String) obj, this.f4951c, this.f4950b));
                return;
            case 4:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.f4950b, this.f4951c);
                return;
            case 5:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.f4950b, this.f4951c, (ArrayList) obj);
                return;
            case 6:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.f4950b, this.f4951c, (TLRPC.Message) obj);
                return;
            case 7:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.f4950b, this.f4951c, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                return;
            case 8:
                long j13 = this.f4951c;
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.f4950b, (TLRPC.InputPeer) obj, j13);
                return;
            case 9:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.f4950b, this.f4951c, (MessagesStorage.IntCallback) obj);
                return;
            case 10:
                NotificationsSettingsFacade.a((NotificationsSettingsFacade) obj2, this.f4950b, this.f4951c, (TLRPC.PeerNotifySettings) obj);
                return;
            case 11:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.f4950b, this.f4951c, (byte[]) obj);
                return;
            case 12:
                ((fo) obj2).d(this.f4950b, this.f4951c, (HashSet) obj);
                return;
            case 13:
                dy dyVar = (dy) obj2;
                we1 we1Var = (we1) obj;
                if (dyVar.f37752y2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j11, j10));
                    dyVar.f37752y2.v(dyVar, arrayList, null, false, dyVar.F2, dyVar.G2, dyVar.H2, we1Var);
                    if (dyVar.f37652e2) {
                        dyVar.f37752y2 = null;
                        return;
                    }
                    return;
                }
                dyVar.finishFragment();
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                qn qnVar = (qn) obj;
                Pattern pattern = LaunchActivity.f35493x1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.K).getTopicsController().findTopic(j11, j10);
                StringBuilder s10 = aa.d.s(j11, "LaunchActivity openForum after load ", " ");
                s10.append(j10);
                s10.append(" TL_forumTopic ");
                s10.append(findTopic);
                FileLog.d(s10.toString());
                if (launchActivity.m0 != null) {
                    vf.c.a(qnVar, MessagesStorage.TopicKey.of(-j11, j10));
                    ((ActionBarLayout) launchActivity.O()).P(qnVar);
                    return;
                }
                return;
        }
    }

    public y(Object obj, long j10, TLObject tLObject, long j11, int i9) {
        this.f4949a = i9;
        this.d = obj;
        this.f4950b = j10;
        this.f4952e = tLObject;
        this.f4951c = j11;
    }

    public y(Object obj, Object obj2, long j10, long j11, int i9) {
        this.f4949a = i9;
        this.d = obj;
        this.f4952e = obj2;
        this.f4950b = j10;
        this.f4951c = j11;
    }
}
