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
    public final int f24677a;
    public final Object f24678b;
    public final Object f24679c;
    public final Object d;
    public final Object f24680e;

    public q6(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f24677a = i7;
        this.f24678b = obj;
        this.f24679c = obj2;
        this.d = obj3;
        this.f24680e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        yr messagesStorage;
        int i7 = this.f24677a;
        Object obj = this.f24680e;
        Object obj2 = this.d;
        Object obj3 = this.f24679c;
        Object obj4 = this.f24678b;
        switch (i7) {
            case 0:
                g0.h3(new mn((x6) obj4, tLObject, (TLRPC.TL_getFactCheck) obj3, (ArrayList) obj2, (HashMap) obj, 2));
                return;
            case 1:
                sd sdVar = (sd) obj4;
                rd rdVar = (rd) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                        sdVar.f25456b.remove(rdVar);
                        sdVar.f25455a.l(rdVar.f25276a);
                        sdVar.l(rdVar, 1);
                        sdVar.F.delete(iArr[0]);
                        g0.h3(new ld(sdVar, rdVar, 1));
                        return;
                    }
                    return;
                }
                if ((tL_messages_editMessage.flags & 8) != 0) {
                    rdVar.f25281g = tL_messages_editMessage.media.proximity_notification_radius;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                boolean z9 = false;
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update = updates.updates.get(i10);
                    if (update instanceof TL_update.TL_updateEditMessage) {
                        rdVar.h.f23262k = ((TL_update.TL_updateEditMessage) update).message;
                    } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                        rdVar.h.f23262k = ((TL_update.TL_updateEditChannelMessage) update).message;
                    }
                    z9 = true;
                }
                if (z9) {
                    sdVar.l(rdVar, 0);
                }
                sdVar.getMessagesController().O3(updates, false);
                return;
            case 2:
                qp qpVar = (qp) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                qpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i11 = tL_messages_affectedHistory.offset;
                    if (i11 > 0) {
                        qpVar.k0(chat, user, chat2, i11);
                    }
                    qpVar.L3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.f26956id);
                    return;
                }
                return;
            case 3:
                qp qpVar2 = (qp) obj4;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj3;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) obj2;
                String str = (String) obj;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                File file = new File(t0.h(), d6Var.f27429b);
                if (wallPaper != null) {
                    try {
                        w7 fileLoader = qpVar2.getFileLoader();
                        TLRPC.Document document = wallPaper.document;
                        fileLoader.getClass();
                        g0.E(file, w7.J(document, null, true, true));
                    } catch (Exception unused) {
                    }
                }
                g0.h3(new yj(qpVar2, wallPaper, tL_wallPaperSettings, d6Var, file, str, 0));
                return;
            case 4:
                dw dwVar = (dw) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr = messages_dhconfig.f27113p;
                        int i12 = messages_dhconfig.f27112g;
                        Pattern pattern = Utilities.f21333a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr, i12)) {
                            g0.h3(new fn(2, context, u1Var));
                            return;
                        }
                        yr messagesStorage2 = dwVar.getMessagesStorage();
                        byte[] bArr2 = messages_dhconfig.f27113p;
                        messagesStorage2.H();
                        messagesStorage2.f26733y = bArr2;
                        yr messagesStorage3 = dwVar.getMessagesStorage();
                        int i13 = messages_dhconfig.f27112g;
                        messagesStorage3.H();
                        messagesStorage3.D = i13;
                        yr messagesStorage4 = dwVar.getMessagesStorage();
                        int i14 = messages_dhconfig.version;
                        messagesStorage4.H();
                        messagesStorage4.f26732x = i14;
                        yr messagesStorage5 = dwVar.getMessagesStorage();
                        yr messagesStorage6 = dwVar.getMessagesStorage();
                        messagesStorage6.H();
                        int i15 = messagesStorage6.f26732x;
                        yr messagesStorage7 = dwVar.getMessagesStorage();
                        messagesStorage7.H();
                        int i16 = messagesStorage7.D;
                        yr messagesStorage8 = dwVar.getMessagesStorage();
                        messagesStorage8.H();
                        messagesStorage5.f26719a.c(new l2.z(messagesStorage5, i15, i16, messagesStorage8.f26733y, 7));
                    }
                    byte[] bArr3 = new byte[256];
                    for (int i17 = 0; i17 < 256; i17++) {
                        bArr3[i17] = (byte) (((byte) (Utilities.f21334b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i17]);
                    }
                    dwVar.getMessagesStorage().H();
                    BigInteger valueOf = BigInteger.valueOf(messagesStorage.D);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    yr messagesStorage9 = dwVar.getMessagesStorage();
                    messagesStorage9.H();
                    byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage9.f26733y)).toByteArray();
                    if (byteArray.length > 256) {
                        byte[] bArr4 = new byte[256];
                        System.arraycopy(byteArray, 1, bArr4, 0, 256);
                        byteArray = bArr4;
                    }
                    TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
                    tL_messages_requestEncryption.g_a = byteArray;
                    tL_messages_requestEncryption.user_id = dwVar.getMessagesController().q1(user2);
                    tL_messages_requestEncryption.random_id = Utilities.f21334b.nextInt();
                    dwVar.getConnectionsManager().sendRequest(tL_messages_requestEncryption, new eo(dwVar, context, u1Var, bArr3, user2, 2), 2);
                    return;
                }
                dwVar.f22127f.clear();
                g0.h3(new aw(dwVar, context, u1Var, 0));
                return;
            default:
                gz gzVar = (gz) obj4;
                ij ijVar = (ij) obj3;
                String str2 = (String) obj2;
                Runnable runnable = (Runnable) obj;
                a0.h hVar = gzVar.f22773x;
                if (tL_error == null) {
                    hVar.k(0L, ijVar.D1());
                    gzVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    hVar.k(Long.valueOf(SystemClock.elapsedRealtime()), ijVar.D1());
                }
                g0.h3(new lg(gzVar, str2, runnable, 26));
                return;
        }
    }
}
