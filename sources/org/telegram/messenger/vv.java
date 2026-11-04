package org.telegram.messenger;

import android.app.Activity;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class vv extends c1 {
    public static volatile vv[] f26112r = new vv[4];
    public final ArrayList f26113a;
    public final SparseArray f26114b;
    public final SparseArray f26115c;
    public final SparseArray d;
    public final SparseArray f26116e;
    public final ArrayList f26117f;
    public final ArrayList h;
    public boolean f26118n;

    public vv(int i3) {
        super(i3);
        this.f26113a = new ArrayList();
        this.f26114b = new SparseArray();
        this.f26115c = new SparseArray();
        this.d = new SparseArray();
        this.f26116e = new SparseArray();
        this.f26117f = new ArrayList();
        this.h = new ArrayList();
        this.f26118n = false;
    }

    public static boolean h(org.telegram.tgnet.NativeByteBuffer r23, byte[] r24, byte[] r25, int r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vv.h(org.telegram.tgnet.NativeByteBuffer, byte[], byte[], int, boolean, boolean):boolean");
    }

    public static vv i(int i3) {
        vv vvVar;
        vv vvVar2 = f26112r[i3];
        if (vvVar2 == null) {
            synchronized (vv.class) {
                try {
                    vvVar = f26112r[i3];
                    if (vvVar == null) {
                        vv[] vvVarArr = f26112r;
                        vv vvVar3 = new vv(i3);
                        vvVarArr[i3] = vvVar3;
                        vvVar = vvVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return vvVar;
        }
        return vvVar2;
    }

    public final void A(Activity activity, TLRPC.User user) {
        if (user != null && activity != null) {
            if (getMessagesController().v2()) {
                org.telegram.ui.b.b(this.currentAccount);
                return;
            }
            this.f26118n = true;
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, activity, null);
            TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
            tL_messages_getDhConfig.random_length = 256;
            qr messagesStorage = getMessagesStorage();
            messagesStorage.H();
            tL_messages_getDhConfig.version = messagesStorage.f24948x;
            s1Var.setOnCancelListener(new wl(this, getConnectionsManager().sendRequest(tL_messages_getDhConfig, new q6(this, activity, s1Var, user, 4), 2), 2));
            try {
                s1Var.show();
            } catch (Exception unused) {
            }
        }
    }

    public final void a(TLRPC.EncryptedChat encryptedChat, int i3) {
        int X0 = g0.X0(encryptedChat.layer);
        if (i3 <= X0) {
            return;
        }
        if (encryptedChat.key_hash.length == 16) {
            try {
                byte[] bArr = encryptedChat.auth_key;
                byte[] o10 = Utilities.o(bArr.length, bArr);
                byte[] bArr2 = new byte[36];
                System.arraycopy(encryptedChat.key_hash, 0, bArr2, 0, 16);
                System.arraycopy(o10, 0, bArr2, 16, 20);
                encryptedChat.key_hash = bArr2;
                getMessagesStorage().V1(encryptedChat);
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        encryptedChat.layer = (i3 << 16) | (encryptedChat.layer & 65535);
        qr messagesStorage = getMessagesStorage();
        messagesStorage.f24934a.c(new vp(messagesStorage, encryptedChat, 2));
        if (X0 < 151) {
            w(encryptedChat, null);
        }
        g0.h3(new ov(this, encryptedChat, 0));
    }

    public final void b(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList) {
        uv uvVar;
        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer;
        int i3;
        int i10;
        int i11 = encryptedChat.f27009id;
        SparseArray sparseArray = this.f26114b;
        ArrayList arrayList2 = (ArrayList) sparseArray.get(i11);
        if (arrayList2 != null) {
            Collections.sort(arrayList2, new tq(8));
            boolean z10 = false;
            while (arrayList2.size() > 0 && ((i3 = (tL_decryptedMessageLayer = (uvVar = (uv) arrayList2.get(0)).f25782b).out_seq_no) == (i10 = encryptedChat.seq_in) || i10 == i3 - 2)) {
                a(encryptedChat, tL_decryptedMessageLayer.layer);
                TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer2 = uvVar.f25782b;
                encryptedChat.seq_in = tL_decryptedMessageLayer2.out_seq_no;
                encryptedChat.in_seq_no = tL_decryptedMessageLayer2.in_seq_no;
                arrayList2.remove(0);
                if (uvVar.f25784e == 2) {
                    encryptedChat.mtproto_seq = Math.min(encryptedChat.mtproto_seq, encryptedChat.seq_in);
                }
                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                TLRPC.Message l10 = l(encryptedChat2, uvVar.f25783c, uvVar.f25781a, uvVar.f25782b.message, uvVar.d);
                if (l10 != null) {
                    arrayList.add(l10);
                }
                z10 = true;
                encryptedChat = encryptedChat2;
            }
            TLRPC.EncryptedChat encryptedChat3 = encryptedChat;
            if (arrayList2.isEmpty()) {
                sparseArray.remove(encryptedChat3.f27009id);
            }
            if (z10) {
                qr messagesStorage = getMessagesStorage();
                messagesStorage.f24934a.c(new qf((Object) messagesStorage, (Object) encryptedChat3, true, 10));
            }
        }
    }

    public final TLRPC.TL_messageService c(int i3, int i10, int i11, long j10, TLRPC.EncryptedChat encryptedChat) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = new TLRPC.TL_decryptedMessageActionDeleteMessages();
        tL_messageService.action.encryptedAction.random_ids.add(Long.valueOf(j10));
        tL_messageService.f27022id = i3;
        tL_messageService.local_id = i3;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = m5.F(encryptedChat.f27009id);
        tL_messageService.send_state = 1;
        tL_messageService.seq_in = i11;
        tL_messageService.seq_out = i10;
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        if (encryptedChat.participant_id == getUserConfig().e()) {
            tL_messageService.peer_id.user_id = encryptedChat.admin_id;
        } else {
            tL_messageService.peer_id.user_id = encryptedChat.participant_id;
        }
        tL_messageService.date = 0;
        tL_messageService.random_id = j10;
        return tL_messageService;
    }

    public final TLRPC.TL_messageService d(TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessageAction decryptedMessageAction) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = decryptedMessageAction;
        int j10 = getUserConfig().j();
        tL_messageService.f27022id = j10;
        tL_messageService.local_id = j10;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = m5.F(encryptedChat.f27009id);
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        tL_messageService.send_state = 1;
        if (encryptedChat.participant_id == getUserConfig().e()) {
            tL_messageService.peer_id.user_id = encryptedChat.admin_id;
        } else {
            tL_messageService.peer_id.user_id = encryptedChat.participant_id;
        }
        if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) && !(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
            tL_messageService.date = 0;
        } else {
            tL_messageService.date = getConnectionsManager().getCurrentTime();
        }
        getSendMessagesHelper().getClass();
        tL_messageService.random_id = yy.E();
        getUserConfig().v(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_messageService);
        getMessagesStorage().j1(arrayList, false, true, true, 0, false, 0, 0L);
        return tL_messageService;
    }

    public final void e(int i3, long j10, boolean z10) {
        NativeByteBuffer nativeByteBuffer;
        Exception e10;
        if (j10 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(12);
            } catch (Exception e11) {
                nativeByteBuffer = null;
                e10 = e11;
            }
            try {
                nativeByteBuffer.writeInt32(100);
                nativeByteBuffer.writeInt32(i3);
                nativeByteBuffer.writeBool(z10);
            } catch (Exception e12) {
                e10 = e12;
                a8.g(e10, true);
                j10 = getMessagesStorage().z(nativeByteBuffer);
                TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption = new TLRPC.TL_messages_discardEncryption();
                tL_messages_discardEncryption.chat_id = i3;
                tL_messages_discardEncryption.delete_history = z10;
                getConnectionsManager().sendRequest(tL_messages_discardEncryption, new p4(this, j10, 3));
            }
            j10 = getMessagesStorage().z(nativeByteBuffer);
        }
        TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption2 = new TLRPC.TL_messages_discardEncryption();
        tL_messages_discardEncryption2.chat_id = i3;
        tL_messages_discardEncryption2.delete_history = z10;
        getConnectionsManager().sendRequest(tL_messages_discardEncryption2, new p4(this, j10, 3));
    }

    public final void f(int i3, boolean z10) {
        e(i3, 0L, z10);
    }

    public final java.util.ArrayList g(org.telegram.tgnet.TLRPC.EncryptedMessage r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vv.g(org.telegram.tgnet.TLRPC$EncryptedMessage):java.util.ArrayList");
    }

    public final void j(TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.EncryptedChat encryptedChat, TLRPC.InputEncryptedFile inputEncryptedFile, String str, zi ziVar) {
        if (decryptedMessage == null || encryptedChat.auth_key == null || (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) || (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting)) {
            return;
        }
        getSendMessagesHelper().f0(message, false);
        Utilities.d.c(new wm(this, encryptedChat, decryptedMessage, message, inputEncryptedFile, ziVar, str, 3));
    }

    public final void k(TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia, ky kyVar) {
        for (int i3 = 0; i3 < tL_messages_sendEncryptedMultiMedia.files.size(); i3++) {
            j(tL_messages_sendEncryptedMultiMedia.messages.get(i3), (TLRPC.Message) kyVar.f23913z.get(i3), kyVar.f23902n, tL_messages_sendEncryptedMultiMedia.files.get(i3), (String) kyVar.B.get(i3), (zi) kyVar.f23911x.get(i3));
        }
    }

    public final org.telegram.tgnet.TLRPC.Message l(org.telegram.tgnet.TLRPC.EncryptedChat r18, org.telegram.tgnet.TLRPC.EncryptedFile r19, int r20, org.telegram.tgnet.TLObject r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vv.l(org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$EncryptedFile, int, org.telegram.tgnet.TLObject, boolean):org.telegram.tgnet.TLRPC$Message");
    }

    public final void m() {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            g0.h3(new tv(this, new ArrayList(arrayList), 1));
            ArrayList arrayList2 = new ArrayList(arrayList);
            qr messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            if (!arrayList2.isEmpty()) {
                messagesStorage.f24934a.c(new jp(messagesStorage, arrayList2, 3));
            }
            arrayList.clear();
        }
    }

    public final void n(org.telegram.tgnet.tl.TL_update.TL_updateEncryption r15, j$.util.concurrent.ConcurrentHashMap r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vv.n(org.telegram.tgnet.tl.TL_update$TL_updateEncryption, j$.util.concurrent.ConcurrentHashMap):void");
    }

    public final void o(TLRPC.EncryptedChat encryptedChat) {
        byte[] bArr = new byte[256];
        Utilities.f21385b.nextBytes(bArr);
        qr messagesStorage = getMessagesStorage();
        messagesStorage.H();
        BigInteger valueOf = BigInteger.valueOf(messagesStorage.E);
        BigInteger bigInteger = new BigInteger(1, bArr);
        qr messagesStorage2 = getMessagesStorage();
        messagesStorage2.H();
        byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage2.f24949y)).toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr2 = new byte[256];
            System.arraycopy(byteArray, 1, bArr2, 0, 256);
            byteArray = bArr2;
        }
        getSendMessagesHelper().getClass();
        encryptedChat.exchange_id = yy.E();
        encryptedChat.a_or_b = bArr;
        encryptedChat.g_a = byteArray;
        getMessagesStorage().V1(encryptedChat);
        x(encryptedChat, null);
    }

    public final void p(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, long j10) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionAbortKey tL_decryptedMessageActionAbortKey = new TLRPC.TL_decryptedMessageActionAbortKey();
            tL_decryptedMessageService.action = tL_decryptedMessageActionAbortKey;
            tL_decryptedMessageActionAbortKey.exchange_id = j10;
            message = d(encryptedChat, tL_decryptedMessageActionAbortKey);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public final void q(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionAcceptKey tL_decryptedMessageActionAcceptKey = new TLRPC.TL_decryptedMessageActionAcceptKey();
            tL_decryptedMessageService.action = tL_decryptedMessageActionAcceptKey;
            tL_decryptedMessageActionAcceptKey.exchange_id = encryptedChat.exchange_id;
            tL_decryptedMessageActionAcceptKey.key_fingerprint = encryptedChat.future_key_fingerprint;
            tL_decryptedMessageActionAcceptKey.g_b = encryptedChat.g_a_or_b;
            message = d(encryptedChat, tL_decryptedMessageActionAcceptKey);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public final void r(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionFlushHistory tL_decryptedMessageActionFlushHistory = new TLRPC.TL_decryptedMessageActionFlushHistory();
            tL_decryptedMessageService.action = tL_decryptedMessageActionFlushHistory;
            message = d(encryptedChat, tL_decryptedMessageActionFlushHistory);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public final void s(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionCommitKey tL_decryptedMessageActionCommitKey = new TLRPC.TL_decryptedMessageActionCommitKey();
            tL_decryptedMessageService.action = tL_decryptedMessageActionCommitKey;
            tL_decryptedMessageActionCommitKey.exchange_id = encryptedChat.exchange_id;
            tL_decryptedMessageActionCommitKey.key_fingerprint = encryptedChat.future_key_fingerprint;
            message = d(encryptedChat, tL_decryptedMessageActionCommitKey);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public final void t(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionDeleteMessages tL_decryptedMessageActionDeleteMessages = new TLRPC.TL_decryptedMessageActionDeleteMessages();
            tL_decryptedMessageService.action = tL_decryptedMessageActionDeleteMessages;
            tL_decryptedMessageActionDeleteMessages.random_ids = arrayList;
            message = d(encryptedChat, tL_decryptedMessageActionDeleteMessages);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public final void u(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionReadMessages tL_decryptedMessageActionReadMessages = new TLRPC.TL_decryptedMessageActionReadMessages();
            tL_decryptedMessageService.action = tL_decryptedMessageActionReadMessages;
            tL_decryptedMessageActionReadMessages.random_ids = arrayList;
            message = d(encryptedChat, tL_decryptedMessageActionReadMessages);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public final void v(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionNoop tL_decryptedMessageActionNoop = new TLRPC.TL_decryptedMessageActionNoop();
            tL_decryptedMessageService.action = tL_decryptedMessageActionNoop;
            message = d(encryptedChat, tL_decryptedMessageActionNoop);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public final void w(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            Integer valueOf = Integer.valueOf(encryptedChat.f27009id);
            ArrayList arrayList = this.f26113a;
            if (arrayList.contains(valueOf)) {
                return;
            }
            arrayList.add(Integer.valueOf(encryptedChat.f27009id));
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionNotifyLayer tL_decryptedMessageActionNotifyLayer = new TLRPC.TL_decryptedMessageActionNotifyLayer();
                tL_decryptedMessageService.action = tL_decryptedMessageActionNotifyLayer;
                tL_decryptedMessageActionNotifyLayer.layer = 151;
                message = d(encryptedChat, tL_decryptedMessageActionNotifyLayer);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void x(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionRequestKey tL_decryptedMessageActionRequestKey = new TLRPC.TL_decryptedMessageActionRequestKey();
            tL_decryptedMessageService.action = tL_decryptedMessageActionRequestKey;
            tL_decryptedMessageActionRequestKey.exchange_id = encryptedChat.exchange_id;
            tL_decryptedMessageActionRequestKey.g_a = encryptedChat.g_a;
            message = d(encryptedChat, tL_decryptedMessageActionRequestKey);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public final void y(TLRPC.EncryptedChat encryptedChat, int i3, int i10, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            int i11 = encryptedChat.f27009id;
            SparseArray sparseArray = this.d;
            SparseIntArray sparseIntArray = (SparseIntArray) sparseArray.get(i11);
            if (sparseIntArray != null && sparseIntArray.indexOfKey(i3) >= 0) {
                return;
            }
            if (sparseIntArray == null) {
                sparseIntArray = new SparseIntArray();
                sparseArray.put(encryptedChat.f27009id, sparseIntArray);
            }
            sparseIntArray.put(i3, i10);
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionResend tL_decryptedMessageActionResend = new TLRPC.TL_decryptedMessageActionResend();
                tL_decryptedMessageService.action = tL_decryptedMessageActionResend;
                tL_decryptedMessageActionResend.start_seq_no = i3;
                tL_decryptedMessageActionResend.end_seq_no = i10;
                message = d(encryptedChat, tL_decryptedMessageActionResend);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void z(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionSetMessageTTL tL_decryptedMessageActionSetMessageTTL = new TLRPC.TL_decryptedMessageActionSetMessageTTL();
            tL_decryptedMessageService.action = tL_decryptedMessageActionSetMessageTTL;
            tL_decryptedMessageActionSetMessageTTL.ttl_seconds = encryptedChat.ttl;
            message = d(encryptedChat, tL_decryptedMessageActionSetMessageTTL);
            zi ziVar = new zi(this.currentAccount, message, false, false);
            ziVar.f26868k.send_state = 1;
            ziVar.V1 = true;
            getMessagesController().l5(0, message.dialog_id, k5.k(ziVar));
            getNotificationCenter().k(hs.f23298s, new Object[0]);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }
}
