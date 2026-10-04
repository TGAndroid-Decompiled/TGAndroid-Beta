package a3;

import ai.o1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import ki.s0;
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
import org.telegram.ui.Components.so;
import org.telegram.ui.Components.z01;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uy;
import org.telegram.ui.yf1;
import org.telegram.ui.yn;
import yh.x3;
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
                String str2 = e2.d0.f8538a;
                j2.f fVar = ((i2.c0) ((l0) ((of.b) this.d).f17163c)).f11570a.f11633s;
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
                String str4 = e2.d0.f8538a;
                j2.f fVar2 = ((i2.c0) ((k2.k) ((n4.y) this.d).f16645c)).f11570a.f11633s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1008, new ga.a(p10, str3, j12, j11));
                return;
            case 3:
                s0 s0Var = (s0) this.d;
                ki.o0 o0Var = (ki.o0) this.f129e;
                long j13 = this.f127b;
                long j14 = this.f128c;
                synchronized (s0Var.f15049g) {
                    if (!o0Var.d && !o0Var.f15001e) {
                        ((z01) s0Var.f15047e).a(o0Var.f14998a, o0Var.f14999b, j13, j14);
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
                ((so) this.d).d(this.f127b, this.f128c, (HashSet) this.f129e);
                return;
            case 14:
                uy uyVar = (uy) this.d;
                long j15 = this.f127b;
                long j16 = this.f128c;
                yf1 yf1Var = (yf1) this.f129e;
                if (uyVar.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j15, j16));
                    uyVar.C2.u(uyVar, arrayList, null, false, uyVar.J2, uyVar.K2, uyVar.L2, yf1Var);
                    if (uyVar.f41423i2) {
                        uyVar.C2 = null;
                        return;
                    }
                    return;
                }
                uyVar.finishFragment();
                return;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j17 = this.f127b;
                long j18 = this.f128c;
                yn ynVar = (yn) this.f129e;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(launchActivity.O).getTopicsController().findTopic(j17, j18);
                StringBuilder u10 = a4.a.u(j17, "LaunchActivity openForum after load ", " ");
                u10.append(j18);
                u10.append(" TL_forumTopic ");
                u10.append(findTopic);
                FileLog.d(u10.toString());
                if (launchActivity.f33804q0 != null) {
                    ng.d.a(ynVar, MessagesStorage.TopicKey.of(-j17, j18));
                    ((ActionBarLayout) launchActivity.O()).P(ynVar);
                    return;
                }
                return;
            default:
                x3.e0((x3) this.d, this.f127b, this.f128c, (Utilities.Callback) this.f129e);
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
