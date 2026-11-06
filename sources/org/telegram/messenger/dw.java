package org.telegram.messenger;

import android.app.Activity;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class dw extends c1 {
    public static volatile dw[] f22097r = new dw[4];
    public final ArrayList f22098a;
    public final SparseArray f22099b;
    public final SparseArray f22100c;
    public final SparseArray d;
    public final SparseArray f22101e;
    public final ArrayList f22102f;
    public final ArrayList h;
    public boolean f22103n;

    public dw(int i7) {
        super(i7);
        this.f22098a = new ArrayList();
        this.f22099b = new SparseArray();
        this.f22100c = new SparseArray();
        this.d = new SparseArray();
        this.f22101e = new SparseArray();
        this.f22102f = new ArrayList();
        this.h = new ArrayList();
        this.f22103n = false;
    }

    public static boolean h(org.telegram.tgnet.NativeByteBuffer r23, byte[] r24, byte[] r25, int r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dw.h(org.telegram.tgnet.NativeByteBuffer, byte[], byte[], int, boolean, boolean):boolean");
    }

    public static dw i(int i7) {
        dw dwVar;
        dw dwVar2 = f22097r[i7];
        if (dwVar2 == null) {
            synchronized (dw.class) {
                try {
                    dwVar = f22097r[i7];
                    if (dwVar == null) {
                        dw[] dwVarArr = f22097r;
                        dw dwVar3 = new dw(i7);
                        dwVarArr[i7] = dwVar3;
                        dwVar = dwVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return dwVar;
        }
        return dwVar2;
    }

    public final void A(Activity activity, TLRPC.User user) {
        if (user != null && activity != null) {
            if (getMessagesController().v2()) {
                org.telegram.ui.b.b(this.currentAccount);
                return;
            }
            this.f22103n = true;
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, activity, null);
            TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
            tL_messages_getDhConfig.random_length = 256;
            yr messagesStorage = getMessagesStorage();
            messagesStorage.H();
            tL_messages_getDhConfig.version = messagesStorage.f26701x;
            u1Var.setOnCancelListener(new gm(this, getConnectionsManager().sendRequest(tL_messages_getDhConfig, new q6(this, activity, u1Var, user, 4), 2), 2));
            try {
                u1Var.show();
            } catch (Exception unused) {
            }
        }
    }

    public final void a(TLRPC.EncryptedChat encryptedChat, int i7) {
        int X0 = g0.X0(encryptedChat.layer);
        if (i7 <= X0) {
            return;
        }
        if (encryptedChat.key_hash.length == 16) {
            try {
                byte[] bArr = encryptedChat.auth_key;
                byte[] o4 = Utilities.o(bArr.length, bArr);
                byte[] bArr2 = new byte[36];
                System.arraycopy(encryptedChat.key_hash, 0, bArr2, 0, 16);
                System.arraycopy(o4, 0, bArr2, 16, 20);
                encryptedChat.key_hash = bArr2;
                getMessagesStorage().V1(encryptedChat);
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        encryptedChat.layer = (i7 << 16) | (encryptedChat.layer & 65535);
        yr messagesStorage = getMessagesStorage();
        messagesStorage.f26688a.c(new eq(messagesStorage, encryptedChat, 2));
        if (X0 < 151) {
            w(encryptedChat, null);
        }
        g0.h3(new wv(this, encryptedChat, 0));
    }

    public final void b(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList) {
        cw cwVar;
        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer;
        int i7;
        int i10;
        int i11 = encryptedChat.f26960id;
        SparseArray sparseArray = this.f22099b;
        ArrayList arrayList2 = (ArrayList) sparseArray.get(i11);
        if (arrayList2 != null) {
            Collections.sort(arrayList2, new vj(18));
            boolean z9 = false;
            while (arrayList2.size() > 0 && ((i7 = (tL_decryptedMessageLayer = (cwVar = (cw) arrayList2.get(0)).f21905b).out_seq_no) == (i10 = encryptedChat.seq_in) || i10 == i7 - 2)) {
                a(encryptedChat, tL_decryptedMessageLayer.layer);
                TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer2 = cwVar.f21905b;
                encryptedChat.seq_in = tL_decryptedMessageLayer2.out_seq_no;
                encryptedChat.in_seq_no = tL_decryptedMessageLayer2.in_seq_no;
                arrayList2.remove(0);
                if (cwVar.f21907e == 2) {
                    encryptedChat.mtproto_seq = Math.min(encryptedChat.mtproto_seq, encryptedChat.seq_in);
                }
                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                TLRPC.Message l10 = l(encryptedChat2, cwVar.f21906c, cwVar.f21904a, cwVar.f21905b.message, cwVar.d);
                if (l10 != null) {
                    arrayList.add(l10);
                }
                z9 = true;
                encryptedChat = encryptedChat2;
            }
            TLRPC.EncryptedChat encryptedChat3 = encryptedChat;
            if (arrayList2.isEmpty()) {
                sparseArray.remove(encryptedChat3.f26960id);
            }
            if (z9) {
                yr messagesStorage = getMessagesStorage();
                messagesStorage.f26688a.c(new yf((Object) messagesStorage, (Object) encryptedChat3, true, 10));
            }
        }
    }

    public final TLRPC.TL_messageService c(int i7, int i10, int i11, long j3, TLRPC.EncryptedChat encryptedChat) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = new TLRPC.TL_decryptedMessageActionDeleteMessages();
        tL_messageService.action.encryptedAction.random_ids.add(Long.valueOf(j3));
        tL_messageService.f26973id = i7;
        tL_messageService.local_id = i7;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = m5.F(encryptedChat.f26960id);
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
        tL_messageService.random_id = j3;
        return tL_messageService;
    }

    public final TLRPC.TL_messageService d(TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessageAction decryptedMessageAction) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = decryptedMessageAction;
        int j3 = getUserConfig().j();
        tL_messageService.f26973id = j3;
        tL_messageService.local_id = j3;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = m5.F(encryptedChat.f26960id);
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
        tL_messageService.random_id = gz.E();
        getUserConfig().v(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_messageService);
        getMessagesStorage().j1(arrayList, false, true, true, 0, false, 0, 0L);
        return tL_messageService;
    }

    public final void e(int i7, long j3, boolean z9) {
        NativeByteBuffer nativeByteBuffer;
        Exception e10;
        if (j3 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(12);
            } catch (Exception e11) {
                nativeByteBuffer = null;
                e10 = e11;
            }
            try {
                nativeByteBuffer.writeInt32(100);
                nativeByteBuffer.writeInt32(i7);
                nativeByteBuffer.writeBool(z9);
            } catch (Exception e12) {
                e10 = e12;
                a8.g(e10, true);
                j3 = getMessagesStorage().z(nativeByteBuffer);
                TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption = new TLRPC.TL_messages_discardEncryption();
                tL_messages_discardEncryption.chat_id = i7;
                tL_messages_discardEncryption.delete_history = z9;
                getConnectionsManager().sendRequest(tL_messages_discardEncryption, new p4(this, j3, 3));
            }
            j3 = getMessagesStorage().z(nativeByteBuffer);
        }
        TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption2 = new TLRPC.TL_messages_discardEncryption();
        tL_messages_discardEncryption2.chat_id = i7;
        tL_messages_discardEncryption2.delete_history = z9;
        getConnectionsManager().sendRequest(tL_messages_discardEncryption2, new p4(this, j3, 3));
    }

    public final void f(int i7, boolean z9) {
        e(i7, 0L, z9);
    }

    public final java.util.ArrayList g(org.telegram.tgnet.TLRPC.EncryptedMessage r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dw.g(org.telegram.tgnet.TLRPC$EncryptedMessage):java.util.ArrayList");
    }

    public final void j(TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.EncryptedChat encryptedChat, TLRPC.InputEncryptedFile inputEncryptedFile, String str, ij ijVar) {
        if (decryptedMessage == null || encryptedChat.auth_key == null || (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) || (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting)) {
            return;
        }
        getSendMessagesHelper().f0(message, false);
        Utilities.d.c(new gn(this, encryptedChat, decryptedMessage, message, inputEncryptedFile, ijVar, str, 3));
    }

    public final void k(TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia, sy syVar) {
        for (int i7 = 0; i7 < tL_messages_sendEncryptedMultiMedia.files.size(); i7++) {
            j(tL_messages_sendEncryptedMultiMedia.messages.get(i7), (TLRPC.Message) syVar.f25549z.get(i7), syVar.f25538n, tL_messages_sendEncryptedMultiMedia.files.get(i7), (String) syVar.B.get(i7), (ij) syVar.f25547x.get(i7));
        }
    }

    public final org.telegram.tgnet.TLRPC.Message l(org.telegram.tgnet.TLRPC.EncryptedChat r18, org.telegram.tgnet.TLRPC.EncryptedFile r19, int r20, org.telegram.tgnet.TLObject r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dw.l(org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$EncryptedFile, int, org.telegram.tgnet.TLObject, boolean):org.telegram.tgnet.TLRPC$Message");
    }

    public final void m() {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            g0.h3(new bw(this, new ArrayList(arrayList), 1));
            ArrayList arrayList2 = new ArrayList(arrayList);
            yr messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            if (!arrayList2.isEmpty()) {
                messagesStorage.f26688a.c(new sp(messagesStorage, arrayList2, 3));
            }
            arrayList.clear();
        }
    }

    public final void n(org.telegram.tgnet.tl.TL_update.TL_updateEncryption r15, j$.util.concurrent.ConcurrentHashMap r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dw.n(org.telegram.tgnet.tl.TL_update$TL_updateEncryption, j$.util.concurrent.ConcurrentHashMap):void");
    }

    public final void o(TLRPC.EncryptedChat encryptedChat) {
        byte[] bArr = new byte[256];
        Utilities.f21331b.nextBytes(bArr);
        yr messagesStorage = getMessagesStorage();
        messagesStorage.H();
        BigInteger valueOf = BigInteger.valueOf(messagesStorage.D);
        BigInteger bigInteger = new BigInteger(1, bArr);
        yr messagesStorage2 = getMessagesStorage();
        messagesStorage2.H();
        byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage2.f26702y)).toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr2 = new byte[256];
            System.arraycopy(byteArray, 1, bArr2, 0, 256);
            byteArray = bArr2;
        }
        getSendMessagesHelper().getClass();
        encryptedChat.exchange_id = gz.E();
        encryptedChat.a_or_b = bArr;
        encryptedChat.g_a = byteArray;
        getMessagesStorage().V1(encryptedChat);
        x(encryptedChat, null);
    }

    public final void p(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, long j3) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionAbortKey tL_decryptedMessageActionAbortKey = new TLRPC.TL_decryptedMessageActionAbortKey();
            tL_decryptedMessageService.action = tL_decryptedMessageActionAbortKey;
            tL_decryptedMessageActionAbortKey.exchange_id = j3;
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
            Integer valueOf = Integer.valueOf(encryptedChat.f26960id);
            ArrayList arrayList = this.f22098a;
            if (arrayList.contains(valueOf)) {
                return;
            }
            arrayList.add(Integer.valueOf(encryptedChat.f26960id));
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

    public final void y(TLRPC.EncryptedChat encryptedChat, int i7, int i10, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            int i11 = encryptedChat.f26960id;
            SparseArray sparseArray = this.d;
            SparseIntArray sparseIntArray = (SparseIntArray) sparseArray.get(i11);
            if (sparseIntArray != null && sparseIntArray.indexOfKey(i7) >= 0) {
                return;
            }
            if (sparseIntArray == null) {
                sparseIntArray = new SparseIntArray();
                sparseArray.put(encryptedChat.f26960id, sparseIntArray);
            }
            sparseIntArray.put(i7, i10);
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionResend tL_decryptedMessageActionResend = new TLRPC.TL_decryptedMessageActionResend();
                tL_decryptedMessageService.action = tL_decryptedMessageActionResend;
                tL_decryptedMessageActionResend.start_seq_no = i7;
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
            ij ijVar = new ij(this.currentAccount, message, false, false);
            ijVar.f23237k.send_state = 1;
            ijVar.V1 = true;
            getMessagesController().l5(0, message.dialog_id, k5.k(ijVar));
            getNotificationCenter().k(qs.f25053s, new Object[0]);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }
}
