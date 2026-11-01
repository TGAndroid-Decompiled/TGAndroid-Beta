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
public final class r6 implements RequestDelegate {
    public final int f17906a;
    public final Object f17907b;
    public final Object f17908c;
    public final Object d;
    public final Object e;

    public r6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17906a = i10;
        this.f17907b = obj;
        this.f17908c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        is messagesStorage;
        int i10 = this.f17906a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f17908c;
        Object obj4 = this.f17907b;
        switch (i10) {
            case 0:
                i0.g3(new dn((a7) obj4, tLObject, (TLRPC.TL_getFactCheck) obj3, (ArrayList) obj2, (HashMap) obj, 2));
                return;
            case 1:
                od odVar = (od) obj4;
                nd ndVar = (nd) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                        odVar.f17420b.remove(ndVar);
                        odVar.f17419a.l(ndVar.f17282a);
                        odVar.l(ndVar, 1);
                        odVar.F.delete(iArr[0]);
                        i0.g3(new hd(odVar, ndVar, 1));
                        return;
                    }
                    return;
                }
                if ((tL_messages_editMessage.flags & 8) != 0) {
                    ndVar.f17286g = tL_messages_editMessage.media.proximity_notification_radius;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                boolean z10 = false;
                for (int i11 = 0; i11 < updates.updates.size(); i11++) {
                    TLRPC.Update update = updates.updates.get(i11);
                    if (update instanceof TL_update.TL_updateEditMessage) {
                        ndVar.h.f16690k = ((TL_update.TL_updateEditMessage) update).message;
                    } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                        ndVar.h.f16690k = ((TL_update.TL_updateEditChannelMessage) update).message;
                    }
                    z10 = true;
                }
                if (z10) {
                    odVar.l(ndVar, 0);
                }
                odVar.getMessagesController().L3(updates, false);
                return;
            case 2:
                wp wpVar = (wp) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                wpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i12 = tL_messages_affectedHistory.offset;
                    if (i12 > 0) {
                        wpVar.k0(chat, user, chat2, i12);
                    }
                    wpVar.I3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.f19794id);
                    return;
                }
                return;
            case 3:
                wp wpVar2 = (wp) obj4;
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) obj3;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) obj2;
                String str = (String) obj;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                File file = new File(w0.h(), m6Var.f20590b);
                if (wallPaper != null) {
                    try {
                        b8 fileLoader = wpVar2.getFileLoader();
                        TLRPC.Document document = wallPaper.document;
                        fileLoader.getClass();
                        i0.E(file, b8.K(document, null, true, true));
                    } catch (Exception unused) {
                    }
                }
                i0.g3(new fk(wpVar2, wallPaper, tL_wallPaperSettings, m6Var, file, str, 0));
                return;
            case 4:
                pw pwVar = (pw) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr = messages_dhconfig.f19951p;
                        int i13 = messages_dhconfig.f19950g;
                        Pattern pattern = Utilities.f14519a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr, i13)) {
                            i0.g3(new gn(2, context, x1Var));
                            return;
                        }
                        is messagesStorage2 = pwVar.getMessagesStorage();
                        byte[] bArr2 = messages_dhconfig.f19951p;
                        messagesStorage2.H();
                        messagesStorage2.f16344y = bArr2;
                        is messagesStorage3 = pwVar.getMessagesStorage();
                        int i14 = messages_dhconfig.f19950g;
                        messagesStorage3.H();
                        messagesStorage3.D = i14;
                        is messagesStorage4 = pwVar.getMessagesStorage();
                        int i15 = messages_dhconfig.version;
                        messagesStorage4.H();
                        messagesStorage4.f16343x = i15;
                        is messagesStorage5 = pwVar.getMessagesStorage();
                        is messagesStorage6 = pwVar.getMessagesStorage();
                        messagesStorage6.H();
                        int i16 = messagesStorage6.f16343x;
                        is messagesStorage7 = pwVar.getMessagesStorage();
                        messagesStorage7.H();
                        int i17 = messagesStorage7.D;
                        is messagesStorage8 = pwVar.getMessagesStorage();
                        messagesStorage8.H();
                        messagesStorage5.f16331a.c(new i2.a0(messagesStorage5, i16, i17, messagesStorage8.f16344y, 7));
                    }
                    byte[] bArr3 = new byte[256];
                    for (int i18 = 0; i18 < 256; i18++) {
                        bArr3[i18] = (byte) (((byte) (Utilities.f14520b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i18]);
                    }
                    pwVar.getMessagesStorage().H();
                    BigInteger valueOf = BigInteger.valueOf(messagesStorage.D);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    is messagesStorage9 = pwVar.getMessagesStorage();
                    messagesStorage9.H();
                    byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage9.f16344y)).toByteArray();
                    if (byteArray.length > 256) {
                        byte[] bArr4 = new byte[256];
                        System.arraycopy(byteArray, 1, bArr4, 0, 256);
                        byteArray = bArr4;
                    }
                    TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
                    tL_messages_requestEncryption.g_a = byteArray;
                    tL_messages_requestEncryption.user_id = pwVar.getMessagesController().p1(user2);
                    tL_messages_requestEncryption.random_id = Utilities.f14520b.nextInt();
                    pwVar.getConnectionsManager().sendRequest(tL_messages_requestEncryption, new lo(pwVar, context, x1Var, bArr3, user2, 2), 2);
                    return;
                }
                pwVar.f17683f.clear();
                i0.g3(new mw(pwVar, context, x1Var, 0));
                return;
            default:
                rz rzVar = (rz) obj4;
                kj kjVar = (kj) obj3;
                String str2 = (String) obj2;
                Runnable runnable = (Runnable) obj;
                a0.h hVar = rzVar.f18012x;
                if (tL_error == null) {
                    hVar.k(0L, kjVar.E1());
                    rzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    hVar.k(Long.valueOf(SystemClock.elapsedRealtime()), kjVar.E1());
                }
                i0.g3(new lg(rzVar, str2, runnable, 26));
                return;
        }
    }
}
