package org.telegram.messenger;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class q6 implements RequestDelegate {
    public final int f26362a;
    public final Object f26363b;
    public final Object f26364c;
    public final Object d;
    public final Object f26365e;

    public q6(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f26362a = i7;
        this.f26363b = obj;
        this.f26364c = obj2;
        this.d = obj3;
        this.f26365e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        tr messagesStorage;
        int i7 = this.f26362a;
        Object obj = this.f26365e;
        Object obj2 = this.d;
        Object obj3 = this.f26364c;
        Object obj4 = this.f26363b;
        switch (i7) {
            case 0:
                g0.g3(new fn((x6) obj4, tLObject, (TLRPC.TL_getFactCheck) obj3, (ArrayList) obj2, (HashMap) obj, 2));
                return;
            case 1:
                qd qdVar = (qd) obj4;
                pd pdVar = (pd) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                        qdVar.f26380b.remove(pdVar);
                        qdVar.f26379a.l(pdVar.f26225a);
                        qdVar.l(pdVar, 1);
                        qdVar.G.delete(iArr[0]);
                        g0.g3(new jd(qdVar, pdVar, 1));
                        return;
                    }
                    return;
                }
                if ((tL_messages_editMessage.flags & 8) != 0) {
                    pdVar.f26230g = tL_messages_editMessage.media.proximity_notification_radius;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                boolean z10 = false;
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update = updates.updates.get(i10);
                    if (update instanceof TL_update.TL_updateEditMessage) {
                        pdVar.h.f23965k = ((TL_update.TL_updateEditMessage) update).message;
                    } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                        pdVar.h.f23965k = ((TL_update.TL_updateEditChannelMessage) update).message;
                    }
                    z10 = true;
                }
                if (z10) {
                    qdVar.l(pdVar, 0);
                }
                qdVar.getMessagesController().V3(updates, false);
                return;
            case 2:
                mp mpVar = (mp) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                mpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i11 = tL_messages_affectedHistory.offset;
                    if (i11 > 0) {
                        mpVar.k0(chat, user, chat2, i11);
                    }
                    mpVar.S3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.f28403id);
                    return;
                }
                return;
            case 3:
                mp mpVar2 = (mp) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) obj2;
                String str = (String) obj;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                File file = new File(t0.h(), e6Var.f28898b);
                if (wallPaper != null) {
                    try {
                        w7 fileLoader = mpVar2.getFileLoader();
                        TLRPC.Document document = wallPaper.document;
                        fileLoader.getClass();
                        g0.E(file, w7.J(document, null, true, true));
                    } catch (Exception unused) {
                    }
                }
                g0.g3(new tj(mpVar2, wallPaper, tL_wallPaperSettings, e6Var, file, str, 0));
                return;
            case 4:
                xv xvVar = (xv) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr = messages_dhconfig.f28560p;
                        int i12 = messages_dhconfig.f28559g;
                        Pattern pattern = Utilities.f22776a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr, i12)) {
                            g0.g3(new vm(2, context, u1Var));
                            return;
                        }
                        tr messagesStorage2 = xvVar.getMessagesStorage();
                        byte[] bArr2 = messages_dhconfig.f28560p;
                        messagesStorage2.H();
                        messagesStorage2.f27067y = bArr2;
                        tr messagesStorage3 = xvVar.getMessagesStorage();
                        int i13 = messages_dhconfig.f28559g;
                        messagesStorage3.H();
                        messagesStorage3.E = i13;
                        tr messagesStorage4 = xvVar.getMessagesStorage();
                        int i14 = messages_dhconfig.version;
                        messagesStorage4.H();
                        messagesStorage4.f27066x = i14;
                        tr messagesStorage5 = xvVar.getMessagesStorage();
                        tr messagesStorage6 = xvVar.getMessagesStorage();
                        messagesStorage6.H();
                        int i15 = messagesStorage6.f27066x;
                        tr messagesStorage7 = xvVar.getMessagesStorage();
                        messagesStorage7.H();
                        int i16 = messagesStorage7.E;
                        tr messagesStorage8 = xvVar.getMessagesStorage();
                        messagesStorage8.H();
                        messagesStorage5.f27052a.c(new l2.x(messagesStorage5, i15, i16, messagesStorage8.f27067y, 7));
                    }
                    byte[] bArr3 = new byte[256];
                    for (int i17 = 0; i17 < 256; i17++) {
                        bArr3[i17] = (byte) (((byte) (Utilities.f22777b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i17]);
                    }
                    xvVar.getMessagesStorage().H();
                    BigInteger valueOf = BigInteger.valueOf(messagesStorage.E);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    tr messagesStorage9 = xvVar.getMessagesStorage();
                    messagesStorage9.H();
                    byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage9.f27067y)).toByteArray();
                    if (byteArray.length > 256) {
                        byte[] bArr4 = new byte[256];
                        System.arraycopy(byteArray, 1, bArr4, 0, 256);
                        byteArray = bArr4;
                    }
                    TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
                    tL_messages_requestEncryption.g_a = byteArray;
                    tL_messages_requestEncryption.user_id = xvVar.getMessagesController().s1(user2);
                    tL_messages_requestEncryption.random_id = Utilities.f22777b.nextInt();
                    xvVar.getConnectionsManager().sendRequest(tL_messages_requestEncryption, new yn(xvVar, context, u1Var, bArr3, user2, 2), 2);
                    return;
                }
                xvVar.f28011f.clear();
                g0.g3(new uv(xvVar, context, u1Var, 0));
                return;
            default:
                zy zyVar = (zy) obj4;
                fj fjVar = (fj) obj3;
                String str2 = (String) obj2;
                Runnable runnable = (Runnable) obj;
                a0.h hVar = zyVar.f28394x;
                if (tL_error == null) {
                    hVar.k(0L, fjVar.D1());
                    zyVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    hVar.k(Long.valueOf(SystemClock.elapsedRealtime()), fjVar.D1());
                }
                g0.g3(new kg(zyVar, str2, runnable, 26));
                return;
        }
    }
}
