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
import org.telegram.ui.eg1;
import org.telegram.ui.uy;
import yh.z3;
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
        int i10 = this.f116a;
        long j3 = this.f118c;
        long j10 = this.f117b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                String str = e2.d0.f7885a;
                j2.f fVar = ((i2.b0) ((l0) ((of.b) obj2).f15510c)).f10623a.f10673s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1016, new j2.c(p5, (String) obj, this.f118c, this.f117b));
                return;
            case 1:
                long j11 = this.f118c;
                ((o1) obj2).n(this.f117b, (TLRPC.TL_textWithEntities) obj, j11);
                return;
            case 2:
                String str2 = e2.d0.f7885a;
                j2.f fVar2 = ((i2.b0) ((k2.j) ((n4.y) obj2).f14993c)).f10623a.f10673s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1008, new hg.r(p10, (String) obj, this.f118c, this.f117b));
                return;
            case 3:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.f117b, this.f118c);
                return;
            case 4:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.f117b, this.f118c, (ArrayList) obj);
                return;
            case 5:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.f117b, this.f118c, (TLRPC.Message) obj);
                return;
            case 6:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.f117b, this.f118c, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                return;
            case 7:
                long j12 = this.f118c;
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.f117b, (TLRPC.InputPeer) obj, j12);
                return;
            case 8:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.f117b, this.f118c, (MessagesStorage.IntCallback) obj);
                return;
            case 9:
                NotificationsSettingsFacade.a((NotificationsSettingsFacade) obj2, this.f117b, this.f118c, (TLRPC.PeerNotifySettings) obj);
                return;
            case 10:
                long j13 = this.f118c;
                ((SecretChatHelper) obj2).lambda$resendMessages$15(this.f117b, (TLRPC.EncryptedChat) obj, j13);
                return;
            case 11:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.f117b, this.f118c, (byte[]) obj);
                return;
            case 12:
                ((po) obj2).d(this.f117b, this.f118c, (HashSet) obj);
                return;
            case 13:
                uy uyVar = (uy) obj2;
                eg1 eg1Var = (eg1) obj;
                if (uyVar.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j3));
                    uyVar.C2.u(uyVar, arrayList, null, false, uyVar.J2, uyVar.K2, uyVar.L2, eg1Var);
                    if (uyVar.f38245i2) {
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
                StringBuilder u10 = a4.a.u(j10, "LaunchActivity openForum after load ", " ");
                u10.append(j3);
                u10.append(" TL_forumTopic ");
                u10.append(findTopic);
                FileLog.d(u10.toString());
                if (launchActivity.f30841q0 != null) {
                    ng.d.a(boVar, MessagesStorage.TopicKey.of(-j10, j3));
                    ((ActionBarLayout) launchActivity.O()).P(boVar);
                    return;
                }
                return;
            default:
                z3.f0((z3) obj2, this.f117b, this.f118c, (Utilities.Callback) obj);
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
