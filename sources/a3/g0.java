package a3;

import ai.o1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLoader;
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
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.q01;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dg1;
import org.telegram.ui.uy;
import org.telegram.ui.zn;
import yh.y3;
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
                String str2 = e2.d0.f7887a;
                j2.f fVar = ((i2.b0) ((l0) ((of.b) this.d).f15651c)).f10624a.f10674s;
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
                String str4 = e2.d0.f7887a;
                j2.f fVar2 = ((i2.b0) ((k2.j) ((n4.y) this.d).f15180c)).f10624a.f10674s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1008, new ga.a(p10, str3, j12, j11));
                return;
            case 3:
                ki.e0 e0Var = (ki.e0) this.e;
                long j13 = this.f117b;
                long j14 = this.f118c;
                ki.f0 f0Var = ((ki.h0) this.d).d;
                long j15 = e0Var.f13670a;
                File file = e0Var.f13671b;
                q01 q01Var = (q01) f0Var;
                synchronized (q01Var) {
                    o01 o01Var = (o01) q01Var.f27401c.get(Long.valueOf(j15));
                    if (!q01Var.d && o01Var != null && !o01Var.e) {
                        q01Var.c(o01Var);
                        o01Var.f26806b = Math.max(o01Var.f26806b, j13 + j14);
                        FileLoader.getInstance(q01Var.f27399a).checkUploadNewDataAvailable(file.getAbsolutePath(), q01Var.f27400b, o01Var.f26806b, 0L);
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
                ((po) this.d).d(this.f117b, this.f118c, (HashSet) this.e);
                return;
            case 14:
                uy uyVar = (uy) this.d;
                long j16 = this.f117b;
                long j17 = this.f118c;
                dg1 dg1Var = (dg1) this.e;
                if (uyVar.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j16, j17));
                    uyVar.C2.u(uyVar, arrayList, null, false, uyVar.J2, uyVar.K2, uyVar.L2, dg1Var);
                    if (uyVar.f38172i2) {
                        uyVar.C2 = null;
                        return;
                    }
                    return;
                }
                uyVar.finishFragment();
                return;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j18 = this.f117b;
                long j19 = this.f118c;
                zn znVar = (zn) this.e;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j18, j19);
                StringBuilder t10 = a4.a.t(j18, "LaunchActivity openForum after load ", " ");
                t10.append(j19);
                t10.append(" TL_forumTopic ");
                t10.append(findTopic);
                FileLog.d(t10.toString());
                if (launchActivity.f31088q0 != null) {
                    ng.d.a(znVar, MessagesStorage.TopicKey.of(-j18, j19));
                    ((ActionBarLayout) launchActivity.O()).P(znVar);
                    return;
                }
                return;
            default:
                y3.f0((y3) this.d, this.f117b, this.f118c, (Utilities.Callback) this.e);
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
