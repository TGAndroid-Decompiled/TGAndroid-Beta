package a3;

import ai.o1;
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
import org.telegram.ui.Components.po;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.dg1;
import org.telegram.ui.uy;
import yh.a4;
public final class g0 implements Runnable {
    public final int f114a;
    public final long f115b;
    public final long f116c;
    public final Object d;
    public final Object e;

    public g0(Object obj, long j3, long j10, Object obj2, int i10) {
        this.f114a = i10;
        this.d = obj;
        this.f115b = j3;
        this.f116c = j10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        int i10 = this.f114a;
        long j3 = this.f116c;
        long j10 = this.f115b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                String str = e2.d0.f7883a;
                j2.f fVar = ((i2.b0) ((l0) ((of.b) obj2).f15512c)).f10621a.f10671s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1016, new j2.c(p5, (String) obj, this.f116c, this.f115b));
                return;
            case 1:
                long j11 = this.f116c;
                ((o1) obj2).n(this.f115b, (TLRPC.TL_textWithEntities) obj, j11);
                return;
            case 2:
                String str2 = e2.d0.f7883a;
                j2.f fVar2 = ((i2.b0) ((k2.j) ((n4.y) obj2).f14995c)).f10621a.f10671s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1008, new ga.a(p10, (String) obj, this.f116c, this.f115b));
                return;
            case 3:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.f115b, this.f116c);
                return;
            case 4:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.f115b, this.f116c, (ArrayList) obj);
                return;
            case 5:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.f115b, this.f116c, (TLRPC.Message) obj);
                return;
            case 6:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.f115b, this.f116c, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                return;
            case 7:
                long j12 = this.f116c;
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.f115b, (TLRPC.InputPeer) obj, j12);
                return;
            case 8:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.f115b, this.f116c, (MessagesStorage.IntCallback) obj);
                return;
            case 9:
                NotificationsSettingsFacade.a((NotificationsSettingsFacade) obj2, this.f115b, this.f116c, (TLRPC.PeerNotifySettings) obj);
                return;
            case 10:
                long j13 = this.f116c;
                ((SecretChatHelper) obj2).lambda$resendMessages$15(this.f115b, (TLRPC.EncryptedChat) obj, j13);
                return;
            case 11:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.f115b, this.f116c, (byte[]) obj);
                return;
            case 12:
                ((po) obj2).d(this.f115b, this.f116c, (HashSet) obj);
                return;
            case 13:
                uy uyVar = (uy) obj2;
                dg1 dg1Var = (dg1) obj;
                if (uyVar.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j3));
                    uyVar.C2.u(uyVar, arrayList, null, false, uyVar.J2, uyVar.K2, uyVar.L2, dg1Var);
                    if (uyVar.f38230i2) {
                        uyVar.C2 = null;
                        return;
                    }
                    return;
                }
                uyVar.finishFragment();
                return;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                bo boVar = (bo) obj;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j10, j3);
                StringBuilder t10 = a4.a.t(j10, "LaunchActivity openForum after load ", " ");
                t10.append(j3);
                t10.append(" TL_forumTopic ");
                t10.append(findTopic);
                FileLog.d(t10.toString());
                if (launchActivity.f30844q0 != null) {
                    ng.d.a(boVar, MessagesStorage.TopicKey.of(-j10, j3));
                    ((ActionBarLayout) launchActivity.O()).P(boVar);
                    return;
                }
                return;
            default:
                a4.f0((a4) obj2, this.f115b, this.f116c, (Utilities.Callback) obj);
                return;
        }
    }

    public g0(Object obj, long j3, TLObject tLObject, long j10, int i10) {
        this.f114a = i10;
        this.d = obj;
        this.f115b = j3;
        this.e = tLObject;
        this.f116c = j10;
    }

    public g0(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f114a = i10;
        this.d = obj;
        this.e = obj2;
        this.f115b = j3;
        this.f116c = j10;
    }
}
