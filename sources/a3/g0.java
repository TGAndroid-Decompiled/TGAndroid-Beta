package a3;

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
import org.telegram.ui.Components.uo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.ig1;
import org.telegram.ui.wy;
import xh.x3;
public final class g0 implements Runnable {
    public final int f114a;
    public final Object f115b;
    public final long f116c;
    public final long d;
    public final Object e;

    public g0(Object obj, long j3, long j10, Object obj2, int i10) {
        this.f114a = i10;
        this.e = obj;
        this.f116c = j3;
        this.d = j10;
        this.f115b = obj2;
    }

    @Override
    public final void run() {
        int i10 = this.f114a;
        long j3 = this.d;
        long j10 = this.f116c;
        Object obj = this.f115b;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                String str = e2.d0.f7188a;
                j2.e eVar = ((i2.b0) ((l0) ((of.b) obj2).f14295c)).f10108a.f10157s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1016, new i0.b(p5, (String) obj, this.d, this.f116c, 24));
                return;
            case 1:
                String str2 = e2.d0.f7188a;
                j2.e eVar2 = ((i2.b0) ((k2.j) ((of.b) obj2).f14295c)).f10108a.f10157s;
                j2.a p10 = eVar2.p();
                eVar2.q(p10, 1008, new i0.b(p10, (String) obj, this.d, this.f116c, 12));
                return;
            case 2:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.f116c, this.d);
                return;
            case 3:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.f116c, this.d, (ArrayList) obj);
                return;
            case 4:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.f116c, this.d, (TLRPC.Message) obj);
                return;
            case 5:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.f116c, this.d, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                return;
            case 6:
                long j11 = this.d;
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.f116c, (TLRPC.InputPeer) obj, j11);
                return;
            case 7:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.f116c, this.d, (MessagesStorage.IntCallback) obj);
                return;
            case 8:
                NotificationsSettingsFacade.a((NotificationsSettingsFacade) obj2, this.f116c, this.d, (TLRPC.PeerNotifySettings) obj);
                return;
            case 9:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.f116c, this.d, (byte[]) obj);
                return;
            case 10:
                ((uo) obj2).d(this.f116c, this.d, (HashSet) obj);
                return;
            case 11:
                wy wyVar = (wy) obj2;
                ig1 ig1Var = (ig1) obj;
                if (wyVar.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j3));
                    wyVar.C2.v(wyVar, arrayList, null, false, wyVar.J2, wyVar.K2, wyVar.L2, ig1Var);
                    if (wyVar.f38454i2) {
                        wyVar.C2 = null;
                        return;
                    }
                    return;
                }
                wyVar.finishFragment();
                return;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                eo eoVar = (eo) obj;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j10, j3);
                StringBuilder t10 = a4.a.t(j10, "LaunchActivity openForum after load ", " ");
                t10.append(j3);
                t10.append(" TL_forumTopic ");
                t10.append(findTopic);
                FileLog.d(t10.toString());
                if (launchActivity.f29957q0 != null) {
                    mg.d.a(eoVar, MessagesStorage.TopicKey.of(-j10, j3));
                    ((ActionBarLayout) launchActivity.O()).P(eoVar);
                    return;
                }
                return;
            case 13:
                x3.f0((x3) obj2, this.f116c, this.d, (Utilities.Callback) obj);
                return;
            default:
                long j12 = this.d;
                ((zh.m0) obj2).n(this.f116c, (TLRPC.TL_textWithEntities) obj, j12);
                return;
        }
    }

    public g0(Object obj, long j3, TLObject tLObject, long j10, int i10) {
        this.f114a = i10;
        this.e = obj;
        this.f116c = j3;
        this.f115b = tLObject;
        this.d = j10;
    }

    public g0(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f114a = i10;
        this.e = obj;
        this.f115b = obj2;
        this.f116c = j3;
        this.d = j10;
    }
}
