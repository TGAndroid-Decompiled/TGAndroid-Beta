package g5;

import f5.d0;
import j3.h0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import jh.d3;
import jh.h5;
import lh.u0;
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
import org.telegram.ui.Components.jo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fy;
import org.telegram.ui.tn;
import org.telegram.ui.ze1;
public final class x implements Runnable {
    public final int f7101a;
    public final long f7102b;
    public final long f7103c;
    public final Object d;
    public final Object f7104e;

    public x(Object obj, long j10, long j11, Object obj2, int i10) {
        this.f7101a = i10;
        this.d = obj;
        this.f7102b = j10;
        this.f7103c = j11;
        this.f7104e = obj2;
    }

    @Override
    public final void run() {
        int i10 = this.f7101a;
        long j10 = this.f7103c;
        long j11 = this.f7102b;
        Object obj = this.f7104e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                int i11 = d0.f6579a;
                k3.f fVar = ((h0) ((ze.b) obj2).f50825b).f10477a.f10594r;
                k3.a k9 = fVar.k();
                fVar.l(k9, 1016, new d3(k9, (String) obj, this.f7103c, this.f7102b, 18));
                return;
            case 1:
                h5.e0((h5) obj2, this.f7102b, this.f7103c, (Utilities.Callback) obj);
                return;
            case 2:
                l3.o oVar = ((l3.n) obj2).f14151b;
                int i12 = d0.f6579a;
                k3.f fVar2 = ((h0) oVar).f10477a.f10594r;
                k3.a k10 = fVar2.k();
                fVar2.l(k10, 1008, new d3(k10, (String) obj, this.f7103c, this.f7102b, 1));
                return;
            case 3:
                long j12 = this.f7103c;
                ((u0) obj2).n(this.f7102b, (TLRPC.TL_textWithEntities) obj, j12);
                return;
            case 4:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.f7102b, this.f7103c);
                return;
            case 5:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.f7102b, this.f7103c, (ArrayList) obj);
                return;
            case 6:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.f7102b, this.f7103c, (TLRPC.Message) obj);
                return;
            case 7:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.f7102b, this.f7103c, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                return;
            case 8:
                long j13 = this.f7103c;
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.f7102b, (TLRPC.InputPeer) obj, j13);
                return;
            case 9:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.f7102b, this.f7103c, (MessagesStorage.IntCallback) obj);
                return;
            case 10:
                NotificationsSettingsFacade.a((NotificationsSettingsFacade) obj2, this.f7102b, this.f7103c, (TLRPC.PeerNotifySettings) obj);
                return;
            case 11:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.f7102b, this.f7103c, (byte[]) obj);
                return;
            case 12:
                ((jo) obj2).d(this.f7102b, this.f7103c, (HashSet) obj);
                return;
            case 13:
                fy fyVar = (fy) obj2;
                ze1 ze1Var = (ze1) obj;
                if (fyVar.f38379y2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j11, j10));
                    fyVar.f38379y2.v(fyVar, arrayList, null, false, fyVar.F2, fyVar.G2, fyVar.H2, ze1Var);
                    if (fyVar.f38279e2) {
                        fyVar.f38379y2 = null;
                        return;
                    }
                    return;
                }
                fyVar.finishFragment();
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                tn tnVar = (tn) obj;
                Pattern pattern = LaunchActivity.f35560x1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.K).getTopicsController().findTopic(j11, j10);
                StringBuilder r6 = a4.w.r(j11, "LaunchActivity openForum after load ", " ");
                r6.append(j10);
                r6.append(" TL_forumTopic ");
                r6.append(findTopic);
                FileLog.d(r6.toString());
                if (launchActivity.m0 != null) {
                    yf.d.a(tnVar, MessagesStorage.TopicKey.of(-j11, j10));
                    ((ActionBarLayout) launchActivity.O()).P(tnVar);
                    return;
                }
                return;
        }
    }

    public x(Object obj, long j10, TLObject tLObject, long j11, int i10) {
        this.f7101a = i10;
        this.d = obj;
        this.f7102b = j10;
        this.f7104e = tLObject;
        this.f7103c = j11;
    }

    public x(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f7101a = i10;
        this.d = obj;
        this.f7104e = obj2;
        this.f7102b = j10;
        this.f7103c = j11;
    }
}
