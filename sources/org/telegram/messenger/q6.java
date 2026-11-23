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
    public final int f26377a;
    public final Object f26378b;
    public final Object f26379c;
    public final Object d;
    public final Object f26380e;

    public q6(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f26377a = i7;
        this.f26378b = obj;
        this.f26379c = obj2;
        this.d = obj3;
        this.f26380e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ur messagesStorage;
        int i7 = this.f26377a;
        Object obj = this.f26380e;
        Object obj2 = this.d;
        Object obj3 = this.f26379c;
        Object obj4 = this.f26378b;
        switch (i7) {
            case 0:
                g0.g3(new gn((x6) obj4, tLObject, (TLRPC.TL_getFactCheck) obj3, (ArrayList) obj2, (HashMap) obj, 2));
                return;
            case 1:
                rd rdVar = (rd) obj4;
                qd qdVar = (qd) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                        rdVar.f26555b.remove(qdVar);
                        rdVar.f26554a.l(qdVar.f26398a);
                        rdVar.l(qdVar, 1);
                        rdVar.G.delete(iArr[0]);
                        g0.g3(new kd(rdVar, qdVar, 1));
                        return;
                    }
                    return;
                }
                if ((tL_messages_editMessage.flags & 8) != 0) {
                    qdVar.f26403g = tL_messages_editMessage.media.proximity_notification_radius;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                boolean z10 = false;
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update = updates.updates.get(i10);
                    if (update instanceof TL_update.TL_updateEditMessage) {
                        qdVar.h.f24177k = ((TL_update.TL_updateEditMessage) update).message;
                    } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                        qdVar.h.f24177k = ((TL_update.TL_updateEditChannelMessage) update).message;
                    }
                    z10 = true;
                }
                if (z10) {
                    rdVar.l(qdVar, 0);
                }
                rdVar.getMessagesController().V3(updates, false);
                return;
            case 2:
                np npVar = (np) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                npVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i11 = tL_messages_affectedHistory.offset;
                    if (i11 > 0) {
                        npVar.k0(chat, user, chat2, i11);
                    }
                    npVar.S3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.f28398id);
                    return;
                }
                return;
            case 3:
                np npVar2 = (np) obj4;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj3;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) obj2;
                String str = (String) obj;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                File file = new File(t0.h(), d6Var.f28850b);
                if (wallPaper != null) {
                    try {
                        w7 fileLoader = npVar2.getFileLoader();
                        TLRPC.Document document = wallPaper.document;
                        fileLoader.getClass();
                        g0.E(file, w7.J(document, null, true, true));
                    } catch (Exception unused) {
                    }
                }
                g0.g3(new uj(npVar2, wallPaper, tL_wallPaperSettings, d6Var, file, str, 0));
                return;
            case 4:
                yv yvVar = (yv) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr = messages_dhconfig.f28555p;
                        int i12 = messages_dhconfig.f28554g;
                        Pattern pattern = Utilities.f22771a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr, i12)) {
                            g0.g3(new wm(2, context, t1Var));
                            return;
                        }
                        ur messagesStorage2 = yvVar.getMessagesStorage();
                        byte[] bArr2 = messages_dhconfig.f28555p;
                        messagesStorage2.H();
                        messagesStorage2.f27229y = bArr2;
                        ur messagesStorage3 = yvVar.getMessagesStorage();
                        int i13 = messages_dhconfig.f28554g;
                        messagesStorage3.H();
                        messagesStorage3.E = i13;
                        ur messagesStorage4 = yvVar.getMessagesStorage();
                        int i14 = messages_dhconfig.version;
                        messagesStorage4.H();
                        messagesStorage4.f27228x = i14;
                        ur messagesStorage5 = yvVar.getMessagesStorage();
                        ur messagesStorage6 = yvVar.getMessagesStorage();
                        messagesStorage6.H();
                        int i15 = messagesStorage6.f27228x;
                        ur messagesStorage7 = yvVar.getMessagesStorage();
                        messagesStorage7.H();
                        int i16 = messagesStorage7.E;
                        ur messagesStorage8 = yvVar.getMessagesStorage();
                        messagesStorage8.H();
                        messagesStorage5.f27214a.c(new l2.x(messagesStorage5, i15, i16, messagesStorage8.f27229y, 7));
                    }
                    byte[] bArr3 = new byte[256];
                    for (int i17 = 0; i17 < 256; i17++) {
                        bArr3[i17] = (byte) (((byte) (Utilities.f22772b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i17]);
                    }
                    yvVar.getMessagesStorage().H();
                    BigInteger valueOf = BigInteger.valueOf(messagesStorage.E);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    ur messagesStorage9 = yvVar.getMessagesStorage();
                    messagesStorage9.H();
                    byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage9.f27229y)).toByteArray();
                    if (byteArray.length > 256) {
                        byte[] bArr4 = new byte[256];
                        System.arraycopy(byteArray, 1, bArr4, 0, 256);
                        byteArray = bArr4;
                    }
                    TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
                    tL_messages_requestEncryption.g_a = byteArray;
                    tL_messages_requestEncryption.user_id = yvVar.getMessagesController().s1(user2);
                    tL_messages_requestEncryption.random_id = Utilities.f22772b.nextInt();
                    yvVar.getConnectionsManager().sendRequest(tL_messages_requestEncryption, new zn(yvVar, context, t1Var, bArr3, user2, 2), 2);
                    return;
                }
                yvVar.f28187f.clear();
                g0.g3(new vv(yvVar, context, t1Var, 0));
                return;
            default:
                az azVar = (az) obj4;
                gj gjVar = (gj) obj3;
                String str2 = (String) obj2;
                Runnable runnable = (Runnable) obj;
                a0.h hVar = azVar.f22977x;
                if (tL_error == null) {
                    hVar.k(0L, gjVar.D1());
                    azVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    hVar.k(Long.valueOf(SystemClock.elapsedRealtime()), gjVar.D1());
                }
                g0.g3(new lg(azVar, str2, runnable, 26));
                return;
        }
    }
}
