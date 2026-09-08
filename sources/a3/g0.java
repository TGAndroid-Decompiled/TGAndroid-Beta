package a3;

import bi.g1;
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
import org.telegram.ui.Components.oo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.eg1;
import org.telegram.ui.uy;
import zh.w3;
public final class g0 implements Runnable {
    public final int f124a;
    public final long f125b;
    public final long f126c;
    public final Object d;
    public final Object f127e;

    public g0(Object obj, long j3, long j10, Object obj2, int i10) {
        this.f124a = i10;
        this.d = obj;
        this.f125b = j3;
        this.f126c = j10;
        this.f127e = obj2;
    }

    @Override
    public final void run() {
        int i10 = this.f124a;
        long j3 = this.f126c;
        long j10 = this.f125b;
        Object obj = this.f127e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                String str = e2.d0.f8765a;
                j2.f fVar = ((i2.c0) ((l0) ((pf.b) obj2).f44074c)).f11497a.f11559s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1016, new j2.c(p5, (String) obj, this.f126c, this.f125b));
                return;
            case 1:
                long j11 = this.f126c;
                ((g1) obj2).n(this.f125b, (TLRPC.TL_textWithEntities) obj, j11);
                return;
            case 2:
                String str2 = e2.d0.f8765a;
                j2.f fVar2 = ((i2.c0) ((k2.j) ((n4.y) obj2).f16524c)).f11497a.f11559s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1008, new i0.b(p10, (String) obj, this.f126c, this.f125b));
                return;
            case 3:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.f125b, this.f126c);
                return;
            case 4:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.f125b, this.f126c, (ArrayList) obj);
                return;
            case 5:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.f125b, this.f126c, (TLRPC.Message) obj);
                return;
            case 6:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.f125b, this.f126c, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                return;
            case 7:
                long j12 = this.f126c;
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.f125b, (TLRPC.InputPeer) obj, j12);
                return;
            case 8:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.f125b, this.f126c, (MessagesStorage.IntCallback) obj);
                return;
            case 9:
                NotificationsSettingsFacade.a((NotificationsSettingsFacade) obj2, this.f125b, this.f126c, (TLRPC.PeerNotifySettings) obj);
                return;
            case 10:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.f125b, this.f126c, (byte[]) obj);
                return;
            case 11:
                ((oo) obj2).d(this.f125b, this.f126c, (HashSet) obj);
                return;
            case 12:
                uy uyVar = (uy) obj2;
                eg1 eg1Var = (eg1) obj;
                if (uyVar.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j3));
                    uyVar.C2.u(uyVar, arrayList, null, false, uyVar.J2, uyVar.K2, uyVar.L2, eg1Var);
                    if (uyVar.f41309i2) {
                        uyVar.C2 = null;
                        return;
                    }
                    return;
                }
                uyVar.finishFragment();
                return;
            case 13:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                co coVar = (co) obj;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j10, j3);
                StringBuilder t10 = a4.a.t(j10, "LaunchActivity openForum after load ", " ");
                t10.append(j3);
                t10.append(" TL_forumTopic ");
                t10.append(findTopic);
                FileLog.d(t10.toString());
                if (launchActivity.f33480q0 != null) {
                    og.d.a(coVar, MessagesStorage.TopicKey.of(-j10, j3));
                    ((ActionBarLayout) launchActivity.O()).P(coVar);
                    return;
                }
                return;
            default:
                w3.f0((w3) obj2, this.f125b, this.f126c, (Utilities.Callback) obj);
                return;
        }
    }

    public g0(Object obj, long j3, TLObject tLObject, long j10, int i10) {
        this.f124a = i10;
        this.d = obj;
        this.f125b = j3;
        this.f127e = tLObject;
        this.f126c = j10;
    }

    public g0(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f124a = i10;
        this.d = obj;
        this.f127e = obj2;
        this.f125b = j3;
        this.f126c = j10;
    }
}
