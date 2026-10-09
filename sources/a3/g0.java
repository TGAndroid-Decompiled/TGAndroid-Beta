package a3;

import ai.o1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import ki.p0;
import ki.t0;
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
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.g11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fg1;
import org.telegram.ui.ty;
import org.telegram.ui.zn;
import yh.s3;
public final class g0 implements Runnable {
    public final int f126a;
    public final long f127b;
    public final long f128c;
    public final Object d;
    public final Object f129e;

    public g0(Object obj, long j3, long j10, Object obj2, int i10) {
        this.f126a = i10;
        this.d = obj;
        this.f127b = j3;
        this.f128c = j10;
        this.f129e = obj2;
    }

    @Override
    public final void run() {
        switch (this.f126a) {
            case 0:
                String str = (String) this.f129e;
                long j3 = this.f127b;
                long j10 = this.f128c;
                String str2 = e2.d0.f8532a;
                j2.f fVar = ((i2.c0) ((l0) ((pf.b) this.d).f45557c)).f11620a.f11683s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1016, new j2.c(p5, str, j10, j3));
                return;
            case 1:
                ((o1) this.d).n(this.f127b, (TLRPC.TL_textWithEntities) this.f129e, this.f128c);
                return;
            case 2:
                String str3 = (String) this.f129e;
                long j11 = this.f127b;
                long j12 = this.f128c;
                String str4 = e2.d0.f8532a;
                j2.f fVar2 = ((i2.c0) ((k2.j) ((n4.x) this.d).f16613c)).f11620a.f11683s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1008, new hg.o1(p10, str3, j12, j11));
                return;
            case 3:
                t0 t0Var = (t0) this.d;
                p0 p0Var = (p0) this.f129e;
                long j13 = this.f127b;
                long j14 = this.f128c;
                synchronized (t0Var.f15118g) {
                    if (!p0Var.d && !p0Var.f15070e) {
                        ((g11) t0Var.f15116e).a(p0Var.f15067a, p0Var.f15068b, j13, j14);
                        return;
                    }
                    return;
                }
            case 4:
                ((FileUploadOperation) this.d).lambda$checkNewDataAvailable$4((Float) this.f129e, this.f127b, this.f128c);
                return;
            case 5:
                ((MediaDataController) this.d).lambda$loadPinnedMessages$163(this.f127b, this.f128c, (ArrayList) this.f129e);
                return;
            case 6:
                ((MediaDataController) this.d).lambda$saveDraftReplyMessage$193(this.f127b, this.f128c, (TLRPC.Message) this.f129e);
                return;
            case 7:
                ((MessagesStorage) this.d).lambda$loadPendingTasks$29(this.f127b, this.f128c, (TLRPC.TL_messages_deleteScheduledMessages) this.f129e);
                return;
            case 8:
                ((MessagesStorage) this.d).lambda$loadPendingTasks$21(this.f127b, (TLRPC.InputPeer) this.f129e, this.f128c);
                return;
            case 9:
                ((MessagesStorage) this.d).lambda$getUnreadMention$156(this.f127b, this.f128c, (MessagesStorage.IntCallback) this.f129e);
                return;
            case 10:
                NotificationsSettingsFacade.a((NotificationsSettingsFacade) this.d, this.f127b, this.f128c, (TLRPC.PeerNotifySettings) this.f129e);
                return;
            case 11:
                ((SecretChatHelper) this.d).lambda$resendMessages$15(this.f127b, (TLRPC.EncryptedChat) this.f129e, this.f128c);
                return;
            case 12:
                ((GroupCallMessagesController) this.d).lambda$processUpdate$3(this.f127b, this.f128c, (byte[]) this.f129e);
                return;
            case 13:
                ((fp) this.d).d(this.f127b, this.f128c, (HashSet) this.f129e);
                return;
            case 14:
                ty tyVar = (ty) this.d;
                long j15 = this.f127b;
                long j16 = this.f128c;
                fg1 fg1Var = (fg1) this.f129e;
                if (tyVar.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j15, j16));
                    tyVar.C2.w(tyVar, arrayList, null, false, tyVar.J2, tyVar.K2, tyVar.L2, fg1Var);
                    if (tyVar.f42195i2) {
                        tyVar.C2 = null;
                        return;
                    }
                    return;
                }
                tyVar.finishFragment();
                return;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j17 = this.f127b;
                long j18 = this.f128c;
                zn znVar = (zn) this.f129e;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j17, j18);
                StringBuilder u10 = a1.g.u(j17, "LaunchActivity openForum after load ", " ");
                u10.append(j18);
                u10.append(" TL_forumTopic ");
                u10.append(findTopic);
                FileLog.d(u10.toString());
                if (launchActivity.f33807q0 != null) {
                    ng.d.a(znVar, MessagesStorage.TopicKey.of(-j17, j18));
                    ((ActionBarLayout) launchActivity.O()).P(znVar);
                    return;
                }
                return;
            default:
                s3.f0((s3) this.d, this.f127b, this.f128c, (Utilities.Callback) this.f129e);
                return;
        }
    }

    public g0(Object obj, long j3, TLObject tLObject, long j10, int i10) {
        this.f126a = i10;
        this.d = obj;
        this.f127b = j3;
        this.f129e = tLObject;
        this.f128c = j10;
    }

    public g0(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f126a = i10;
        this.d = obj;
        this.f129e = obj2;
        this.f127b = j3;
        this.f128c = j10;
    }
}
