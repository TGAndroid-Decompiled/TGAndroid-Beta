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
    public final int f24856a;
    public final Object f24857b;
    public final Object f24858c;
    public final Object d;
    public final Object f24859e;

    public q6(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f24856a = i3;
        this.f24857b = obj;
        this.f24858c = obj2;
        this.d = obj3;
        this.f24859e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        qr messagesStorage;
        int i3 = this.f24856a;
        Object obj = this.f24859e;
        Object obj2 = this.d;
        Object obj3 = this.f24858c;
        Object obj4 = this.f24857b;
        switch (i3) {
            case 0:
                g0.h3(new cn((x6) obj4, tLObject, (TLRPC.TL_getFactCheck) obj3, (ArrayList) obj2, (HashMap) obj, 2));
                return;
            case 1:
                ld ldVar = (ld) obj4;
                kd kdVar = (kd) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                        ldVar.f23975b.remove(kdVar);
                        ldVar.f23974a.l(kdVar.f23810a);
                        ldVar.l(kdVar, 1);
                        ldVar.G.delete(iArr[0]);
                        g0.h3(new ed(ldVar, kdVar, 1));
                        return;
                    }
                    return;
                }
                if ((tL_messages_editMessage.flags & 8) != 0) {
                    kdVar.f23815g = tL_messages_editMessage.media.proximity_notification_radius;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                boolean z10 = false;
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update = updates.updates.get(i10);
                    if (update instanceof TL_update.TL_updateEditMessage) {
                        kdVar.h.f26868k = ((TL_update.TL_updateEditMessage) update).message;
                    } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                        kdVar.h.f26868k = ((TL_update.TL_updateEditChannelMessage) update).message;
                    }
                    z10 = true;
                }
                if (z10) {
                    ldVar.l(kdVar, 0);
                }
                ldVar.getMessagesController().O3(updates, false);
                return;
            case 2:
                hp hpVar = (hp) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                hpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i11 = tL_messages_affectedHistory.offset;
                    if (i11 > 0) {
                        hpVar.k0(chat, user, chat2, i11);
                    }
                    hpVar.L3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.f27001id);
                    return;
                }
                return;
            case 3:
                hp hpVar2 = (hp) obj4;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj3;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) obj2;
                String str = (String) obj;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                File file = new File(t0.h(), b6Var.f27423b);
                if (wallPaper != null) {
                    try {
                        w7 fileLoader = hpVar2.getFileLoader();
                        TLRPC.Document document = wallPaper.document;
                        fileLoader.getClass();
                        g0.E(file, w7.K(document, null, true, true));
                    } catch (Exception unused) {
                    }
                }
                g0.h3(new pj(hpVar2, wallPaper, tL_wallPaperSettings, b6Var, file, str, 0));
                return;
            case 4:
                vv vvVar = (vv) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr = messages_dhconfig.f27158p;
                        int i12 = messages_dhconfig.f27157g;
                        Pattern pattern = Utilities.f21384a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr, i12)) {
                            g0.h3(new vm(2, context, s1Var));
                            return;
                        }
                        qr messagesStorage2 = vvVar.getMessagesStorage();
                        byte[] bArr2 = messages_dhconfig.f27158p;
                        messagesStorage2.H();
                        messagesStorage2.f24949y = bArr2;
                        qr messagesStorage3 = vvVar.getMessagesStorage();
                        int i13 = messages_dhconfig.f27157g;
                        messagesStorage3.H();
                        messagesStorage3.E = i13;
                        qr messagesStorage4 = vvVar.getMessagesStorage();
                        int i14 = messages_dhconfig.version;
                        messagesStorage4.H();
                        messagesStorage4.f24948x = i14;
                        qr messagesStorage5 = vvVar.getMessagesStorage();
                        qr messagesStorage6 = vvVar.getMessagesStorage();
                        messagesStorage6.H();
                        int i15 = messagesStorage6.f24948x;
                        qr messagesStorage7 = vvVar.getMessagesStorage();
                        messagesStorage7.H();
                        int i16 = messagesStorage7.E;
                        qr messagesStorage8 = vvVar.getMessagesStorage();
                        messagesStorage8.H();
                        messagesStorage5.f24934a.c(new k2.a0(messagesStorage5, i15, i16, messagesStorage8.f24949y, 7));
                    }
                    byte[] bArr3 = new byte[256];
                    for (int i17 = 0; i17 < 256; i17++) {
                        bArr3[i17] = (byte) (((byte) (Utilities.f21385b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i17]);
                    }
                    vvVar.getMessagesStorage().H();
                    BigInteger valueOf = BigInteger.valueOf(messagesStorage.E);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    qr messagesStorage9 = vvVar.getMessagesStorage();
                    messagesStorage9.H();
                    byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage9.f24949y)).toByteArray();
                    if (byteArray.length > 256) {
                        byte[] bArr4 = new byte[256];
                        System.arraycopy(byteArray, 1, bArr4, 0, 256);
                        byteArray = bArr4;
                    }
                    TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
                    tL_messages_requestEncryption.g_a = byteArray;
                    tL_messages_requestEncryption.user_id = vvVar.getMessagesController().q1(user2);
                    tL_messages_requestEncryption.random_id = Utilities.f21385b.nextInt();
                    vvVar.getConnectionsManager().sendRequest(tL_messages_requestEncryption, new tn(vvVar, context, s1Var, bArr3, user2, 2), 2);
                    return;
                }
                vvVar.f26117f.clear();
                g0.h3(new sv(vvVar, context, s1Var, 0));
                return;
            default:
                yy yyVar = (yy) obj4;
                zi ziVar = (zi) obj3;
                String str2 = (String) obj2;
                Runnable runnable = (Runnable) obj;
                a0.h hVar = yyVar.f26687x;
                if (tL_error == null) {
                    hVar.k(0L, ziVar.E1());
                    yyVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    hVar.k(Long.valueOf(SystemClock.elapsedRealtime()), ziVar.E1());
                }
                g0.h3(new dg(yyVar, str2, runnable, 26));
                return;
        }
    }
}
