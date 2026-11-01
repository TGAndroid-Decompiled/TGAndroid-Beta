package org.telegram.messenger;

import android.app.Activity;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class pw extends f1 {
    public static volatile pw[] f17679r = new pw[4];
    public final ArrayList f17680a;
    public final SparseArray f17681b;
    public final SparseArray f17682c;
    public final SparseArray d;
    public final SparseArray e;
    public final ArrayList f17683f;
    public final ArrayList h;
    public boolean f17684n;

    public pw(int i10) {
        super(i10);
        this.f17680a = new ArrayList();
        this.f17681b = new SparseArray();
        this.f17682c = new SparseArray();
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.f17683f = new ArrayList();
        this.h = new ArrayList();
        this.f17684n = false;
    }

    public static boolean h(org.telegram.tgnet.NativeByteBuffer r23, byte[] r24, byte[] r25, int r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pw.h(org.telegram.tgnet.NativeByteBuffer, byte[], byte[], int, boolean, boolean):boolean");
    }

    public static pw i(int i10) {
        pw pwVar;
        pw pwVar2 = f17679r[i10];
        if (pwVar2 == null) {
            synchronized (pw.class) {
                try {
                    pwVar = f17679r[i10];
                    if (pwVar == null) {
                        pw[] pwVarArr = f17679r;
                        pw pwVar3 = new pw(i10);
                        pwVarArr[i10] = pwVar3;
                        pwVar = pwVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return pwVar;
        }
        return pwVar2;
    }

    public final void A(Activity activity, TLRPC.User user) {
        if (user != null && activity != null) {
            if (getMessagesController().u2()) {
                org.telegram.ui.b.b(this.currentAccount);
                return;
            }
            this.f17684n = true;
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, activity, null);
            TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
            tL_messages_getDhConfig.random_length = 256;
            is messagesStorage = getMessagesStorage();
            messagesStorage.H();
            tL_messages_getDhConfig.version = messagesStorage.f16343x;
            x1Var.setOnCancelListener(new km(this, getConnectionsManager().sendRequest(tL_messages_getDhConfig, new r6(this, activity, x1Var, user, 4), 2), 2));
            try {
                x1Var.show();
            } catch (Exception unused) {
            }
        }
    }

    public final void a(TLRPC.EncryptedChat encryptedChat, int i10) {
        int X0 = i0.X0(encryptedChat.layer);
        if (i10 <= X0) {
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
                f8.g(th2, true);
            }
        }
        encryptedChat.layer = (i10 << 16) | (encryptedChat.layer & 65535);
        is messagesStorage = getMessagesStorage();
        messagesStorage.f16331a.c(new lq(messagesStorage, encryptedChat, 2));
        if (X0 < 151) {
            w(encryptedChat, null);
        }
        i0.g3(new iw(this, encryptedChat, 0));
    }

    public final void b(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList) {
        ow owVar;
        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer;
        int i10;
        int i11;
        int i12 = encryptedChat.f19802id;
        SparseArray sparseArray = this.f17681b;
        ArrayList arrayList2 = (ArrayList) sparseArray.get(i12);
        if (arrayList2 != null) {
            Collections.sort(arrayList2, new ck(20));
            boolean z10 = false;
            while (arrayList2.size() > 0 && ((i10 = (tL_decryptedMessageLayer = (owVar = (ow) arrayList2.get(0)).f17517b).out_seq_no) == (i11 = encryptedChat.seq_in) || i11 == i10 - 2)) {
                a(encryptedChat, tL_decryptedMessageLayer.layer);
                TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer2 = owVar.f17517b;
                encryptedChat.seq_in = tL_decryptedMessageLayer2.out_seq_no;
                encryptedChat.in_seq_no = tL_decryptedMessageLayer2.in_seq_no;
                arrayList2.remove(0);
                if (owVar.e == 2) {
                    encryptedChat.mtproto_seq = Math.min(encryptedChat.mtproto_seq, encryptedChat.seq_in);
                }
                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                TLRPC.Message l4 = l(encryptedChat2, owVar.f17518c, owVar.f17516a, owVar.f17517b.message, owVar.d);
                if (l4 != null) {
                    arrayList.add(l4);
                }
                z10 = true;
                encryptedChat = encryptedChat2;
            }
            TLRPC.EncryptedChat encryptedChat3 = encryptedChat;
            if (arrayList2.isEmpty()) {
                sparseArray.remove(encryptedChat3.f19802id);
            }
            if (z10) {
                is messagesStorage = getMessagesStorage();
                messagesStorage.f16331a.c(new xf((Object) messagesStorage, (Object) encryptedChat3, true, 10));
            }
        }
    }

    public final TLRPC.TL_messageService c(int i10, int i11, int i12, long j10, TLRPC.EncryptedChat encryptedChat) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = new TLRPC.TL_decryptedMessageActionDeleteMessages();
        tL_messageService.action.encryptedAction.random_ids.add(Long.valueOf(j10));
        tL_messageService.f19815id = i10;
        tL_messageService.local_id = i10;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = o5.F(encryptedChat.f19802id);
        tL_messageService.send_state = 1;
        tL_messageService.seq_in = i12;
        tL_messageService.seq_out = i11;
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
        tL_messageService.f19815id = j10;
        tL_messageService.local_id = j10;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = o5.F(encryptedChat.f19802id);
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
        tL_messageService.random_id = rz.E();
        getUserConfig().v(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_messageService);
        getMessagesStorage().j1(arrayList, false, true, true, 0, false, 0, 0L);
        return tL_messageService;
    }

    public final void e(int i10, long j10, boolean z10) {
        NativeByteBuffer nativeByteBuffer;
        Exception e;
        if (j10 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(12);
            } catch (Exception e7) {
                nativeByteBuffer = null;
                e = e7;
            }
            try {
                nativeByteBuffer.writeInt32(100);
                nativeByteBuffer.writeInt32(i10);
                nativeByteBuffer.writeBool(z10);
            } catch (Exception e10) {
                e = e10;
                f8.g(e, true);
                j10 = getMessagesStorage().z(nativeByteBuffer);
                TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption = new TLRPC.TL_messages_discardEncryption();
                tL_messages_discardEncryption.chat_id = i10;
                tL_messages_discardEncryption.delete_history = z10;
                getConnectionsManager().sendRequest(tL_messages_discardEncryption, new s4(this, j10, 3));
            }
            j10 = getMessagesStorage().z(nativeByteBuffer);
        }
        TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption2 = new TLRPC.TL_messages_discardEncryption();
        tL_messages_discardEncryption2.chat_id = i10;
        tL_messages_discardEncryption2.delete_history = z10;
        getConnectionsManager().sendRequest(tL_messages_discardEncryption2, new s4(this, j10, 3));
    }

    public final void f(int i10, boolean z10) {
        e(i10, 0L, z10);
    }

    public final java.util.ArrayList g(org.telegram.tgnet.TLRPC.EncryptedMessage r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pw.g(org.telegram.tgnet.TLRPC$EncryptedMessage):java.util.ArrayList");
    }

    public final void j(TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.EncryptedChat encryptedChat, TLRPC.InputEncryptedFile inputEncryptedFile, String str, kj kjVar) {
        if (decryptedMessage == null || encryptedChat.auth_key == null || (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) || (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting)) {
            return;
        }
        getSendMessagesHelper().f0(message, false);
        Utilities.d.c(new hn(this, encryptedChat, decryptedMessage, message, inputEncryptedFile, kjVar, str, 3));
    }

    public final void k(TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia, dz dzVar) {
        for (int i10 = 0; i10 < tL_messages_sendEncryptedMultiMedia.files.size(); i10++) {
            j(tL_messages_sendEncryptedMultiMedia.messages.get(i10), (TLRPC.Message) dzVar.f15484z.get(i10), dzVar.f15473n, tL_messages_sendEncryptedMultiMedia.files.get(i10), (String) dzVar.B.get(i10), (kj) dzVar.f15482x.get(i10));
        }
    }

    public final org.telegram.tgnet.TLRPC.Message l(org.telegram.tgnet.TLRPC.EncryptedChat r18, org.telegram.tgnet.TLRPC.EncryptedFile r19, int r20, org.telegram.tgnet.TLObject r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pw.l(org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$EncryptedFile, int, org.telegram.tgnet.TLObject, boolean):org.telegram.tgnet.TLRPC$Message");
    }

    public final void m() {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            i0.g3(new nw(this, new ArrayList(arrayList), 1));
            ArrayList arrayList2 = new ArrayList(arrayList);
            is messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            if (!arrayList2.isEmpty()) {
                messagesStorage.f16331a.c(new yp(messagesStorage, arrayList2, 3));
            }
            arrayList.clear();
        }
    }

    public final void n(org.telegram.tgnet.tl.TL_update.TL_updateEncryption r15, j$.util.concurrent.ConcurrentHashMap r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pw.n(org.telegram.tgnet.tl.TL_update$TL_updateEncryption, j$.util.concurrent.ConcurrentHashMap):void");
    }

    public final void o(TLRPC.EncryptedChat encryptedChat) {
        byte[] bArr = new byte[256];
        Utilities.f14520b.nextBytes(bArr);
        is messagesStorage = getMessagesStorage();
        messagesStorage.H();
        BigInteger valueOf = BigInteger.valueOf(messagesStorage.D);
        BigInteger bigInteger = new BigInteger(1, bArr);
        is messagesStorage2 = getMessagesStorage();
        messagesStorage2.H();
        byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage2.f16344y)).toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr2 = new byte[256];
            System.arraycopy(byteArray, 1, bArr2, 0, 256);
            byteArray = bArr2;
        }
        getSendMessagesHelper().getClass();
        encryptedChat.exchange_id = rz.E();
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
            Integer valueOf = Integer.valueOf(encryptedChat.f19802id);
            ArrayList arrayList = this.f17680a;
            if (arrayList.contains(valueOf)) {
                return;
            }
            arrayList.add(Integer.valueOf(encryptedChat.f19802id));
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

    public final void y(TLRPC.EncryptedChat encryptedChat, int i10, int i11, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            int i12 = encryptedChat.f19802id;
            SparseArray sparseArray = this.d;
            SparseIntArray sparseIntArray = (SparseIntArray) sparseArray.get(i12);
            if (sparseIntArray != null && sparseIntArray.indexOfKey(i10) >= 0) {
                return;
            }
            if (sparseIntArray == null) {
                sparseIntArray = new SparseIntArray();
                sparseArray.put(encryptedChat.f19802id, sparseIntArray);
            }
            sparseIntArray.put(i10, i11);
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionResend tL_decryptedMessageActionResend = new TLRPC.TL_decryptedMessageActionResend();
                tL_decryptedMessageService.action = tL_decryptedMessageActionResend;
                tL_decryptedMessageActionResend.start_seq_no = i10;
                tL_decryptedMessageActionResend.end_seq_no = i11;
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
            kj kjVar = new kj(this.currentAccount, message, false, false);
            kjVar.f16690k.send_state = 1;
            kjVar.V1 = true;
            getMessagesController().i5(0, message.dialog_id, m5.j(kjVar));
            getNotificationCenter().k(at.f14779s, new Object[0]);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }
}
