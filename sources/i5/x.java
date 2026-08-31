package i5;

import h5.d0;
import j3.c0;
import j3.q0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import mh.g5;
import oh.v0;
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
import org.telegram.ui.Components.no;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mf1;
import org.telegram.ui.py;
import org.telegram.ui.xn;
public final class x implements Runnable {
    public final int f7894a;
    public final Object f7895b;
    public final long f7896c;
    public final long d;
    public final Object f7897e;

    public x(Object obj, long j10, long j11, Object obj2, int i10) {
        this.f7894a = i10;
        this.f7897e = obj;
        this.f7896c = j10;
        this.d = j11;
        this.f7895b = obj2;
    }

    @Override
    public final void run() {
        int i10 = this.f7894a;
        long j10 = this.d;
        long j11 = this.f7896c;
        Object obj = this.f7895b;
        Object obj2 = this.f7897e;
        switch (i10) {
            case 0:
                int i11 = d0.f7237a;
                k3.f fVar = ((c0) ((f7.b) obj2).f6121c).f9000a.f9128q;
                k3.a p10 = fVar.p();
                fVar.q(p10, 1016, new k3.c(p10, (String) obj, this.d, this.f7896c));
                return;
            case 1:
                int i12 = d0.f7237a;
                k3.f fVar2 = ((c0) ((l3.q) ((f7.b) obj2).f6121c)).f9000a.f9128q;
                k3.a p11 = fVar2.p();
                fVar2.q(p11, 1008, new q0(p11, (String) obj, this.d, this.f7896c));
                return;
            case 2:
                g5.e0((g5) obj2, this.f7896c, this.d, (Utilities.Callback) obj);
                return;
            case 3:
                long j12 = this.d;
                ((v0) obj2).n(this.f7896c, (TLRPC.TL_textWithEntities) obj, j12);
                return;
            case 4:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.f7896c, this.d);
                return;
            case 5:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.f7896c, this.d, (ArrayList) obj);
                return;
            case 6:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.f7896c, this.d, (TLRPC.Message) obj);
                return;
            case 7:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.f7896c, this.d, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                return;
            case 8:
                long j13 = this.d;
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.f7896c, (TLRPC.InputPeer) obj, j13);
                return;
            case 9:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.f7896c, this.d, (MessagesStorage.IntCallback) obj);
                return;
            case 10:
                NotificationsSettingsFacade.a((NotificationsSettingsFacade) obj2, this.f7896c, this.d, (TLRPC.PeerNotifySettings) obj);
                return;
            case 11:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.f7896c, this.d, (byte[]) obj);
                return;
            case 12:
                ((no) obj2).d(this.f7896c, this.d, (HashSet) obj);
                return;
            case 13:
                py pyVar = (py) obj2;
                mf1 mf1Var = (mf1) obj;
                if (pyVar.f40308z2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j11, j10));
                    pyVar.f40308z2.v(pyVar, arrayList, null, false, pyVar.G2, pyVar.H2, pyVar.I2, mf1Var);
                    if (pyVar.f40209f2) {
                        pyVar.f40308z2 = null;
                        return;
                    }
                    return;
                }
                pyVar.finishFragment();
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                xn xnVar = (xn) obj;
                Pattern pattern = LaunchActivity.f34134y1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.L).getTopicsController().findTopic(j11, j10);
                StringBuilder s6 = android.support.v4.media.a.s(j11, "LaunchActivity openForum after load ", " ");
                s6.append(j10);
                s6.append(" TL_forumTopic ");
                s6.append(findTopic);
                FileLog.d(s6.toString());
                if (launchActivity.f34160n0 != null) {
                    bg.e.a(xnVar, MessagesStorage.TopicKey.of(-j11, j10));
                    ((ActionBarLayout) launchActivity.O()).P(xnVar);
                    return;
                }
                return;
        }
    }

    public x(Object obj, long j10, TLObject tLObject, long j11, int i10) {
        this.f7894a = i10;
        this.f7897e = obj;
        this.f7896c = j10;
        this.f7895b = tLObject;
        this.d = j11;
    }

    public x(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f7894a = i10;
        this.f7897e = obj;
        this.f7895b = obj2;
        this.f7896c = j10;
        this.d = j11;
    }
}
