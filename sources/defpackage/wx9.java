package defpackage;

import android.app.Activity;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class wx9 extends rf0 {
    public static volatile wx9[] r = new wx9[4];
    public final ArrayList a;
    public final SparseArray b;
    public final SparseArray c;
    public final SparseArray d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public boolean n;

    public wx9(int i) {
        super(i);
        this.a = new ArrayList();
        this.b = new SparseArray();
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = false;
    }

    public static boolean h(org.telegram.tgnet.NativeByteBuffer r23, byte[] r24, byte[] r25, int r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx9.h(org.telegram.tgnet.NativeByteBuffer, byte[], byte[], int, boolean, boolean):boolean");
    }

    public static wx9 i(int i) {
        wx9 wx9Var;
        wx9 wx9Var2 = r[i];
        if (wx9Var2 == null) {
            synchronized (wx9.class) {
                wx9Var = r[i];
                if (wx9Var == null) {
                    wx9[] wx9VarArr = r;
                    wx9 wx9Var3 = new wx9(i);
                    wx9VarArr[i] = wx9Var3;
                    wx9Var = wx9Var3;
                }
            }
            return wx9Var;
        }
        return wx9Var2;
    }

    public final void A(Activity activity, TLRPC.User user) {
        if (user != null && activity != null) {
            if (getMessagesController().x2()) {
                i5.b(this.currentAccount);
                return;
            }
            this.n = true;
            id idVar = new id(3, null, activity);
            TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
            tL_messages_getDhConfig.random_length = 256;
            kf7 messagesStorage = getMessagesStorage();
            messagesStorage.I();
            tL_messages_getDhConfig.version = messagesStorage.x;
            idVar.setOnCancelListener(new gt0(this, getConnectionsManager().sendRequest(tL_messages_getDhConfig, new au0(this, activity, idVar, user, (byte) 17), 2), (byte) 8));
            try {
                idVar.show();
            } catch (Exception unused) {
            }
        }
    }

    public final void a(TLRPC.EncryptedChat encryptedChat, int i) {
        int W0 = hl.W0(encryptedChat.layer);
        if (i <= W0) {
            return;
        }
        if (encryptedChat.key_hash.length == 16) {
            try {
                byte[] bArr = encryptedChat.auth_key;
                byte[] o = Utilities.o(bArr.length, bArr);
                byte[] bArr2 = new byte[36];
                System.arraycopy(encryptedChat.key_hash, 0, bArr2, 0, 16);
                System.arraycopy(o, 0, bArr2, 16, 20);
                encryptedChat.key_hash = bArr2;
                getMessagesStorage().X1(encryptedChat);
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        encryptedChat.layer = (encryptedChat.layer & 65535) | (i << 16);
        kf7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new kd7(messagesStorage, encryptedChat, (byte) 2));
        if (W0 < 151) {
            w(encryptedChat, null);
        }
        hl.c3(new px9(this, encryptedChat, (byte) 2));
    }

    public final void b(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList) {
        vx9 vx9Var;
        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer;
        int i;
        int i2;
        int i3 = encryptedChat.id;
        SparseArray sparseArray = this.b;
        ArrayList arrayList2 = (ArrayList) sparseArray.get(i3);
        if (arrayList2 != null) {
            Collections.sort(arrayList2, new qq7((byte) 21));
            boolean z = false;
            while (arrayList2.size() > 0 && ((i = (tL_decryptedMessageLayer = (vx9Var = (vx9) arrayList2.get(0)).b).out_seq_no) == (i2 = encryptedChat.seq_in) || i2 == i - 2)) {
                this.a(encryptedChat, tL_decryptedMessageLayer.layer);
                TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer2 = vx9Var.b;
                encryptedChat.seq_in = tL_decryptedMessageLayer2.out_seq_no;
                encryptedChat.in_seq_no = tL_decryptedMessageLayer2.in_seq_no;
                arrayList2.remove(0);
                if (vx9Var.e == 2) {
                    encryptedChat.mtproto_seq = Math.min(encryptedChat.mtproto_seq, encryptedChat.seq_in);
                }
                wx9 wx9Var = this;
                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                TLRPC.Message l = wx9Var.l(encryptedChat2, vx9Var.c, vx9Var.a, vx9Var.b.message, vx9Var.d);
                if (l != null) {
                    arrayList.add(l);
                }
                z = true;
                this = wx9Var;
                encryptedChat = encryptedChat2;
            }
            wx9 wx9Var2 = this;
            TLRPC.EncryptedChat encryptedChat3 = encryptedChat;
            if (arrayList2.isEmpty()) {
                sparseArray.remove(encryptedChat3.id);
            }
            if (z) {
                kf7 messagesStorage = wx9Var2.getMessagesStorage();
                messagesStorage.a.c(new yn6((Object) messagesStorage, (Object) encryptedChat3, true, (byte) 4));
            }
        }
    }

    public final TLRPC.TL_messageService c(int i, int i2, int i3, long j, TLRPC.EncryptedChat encryptedChat) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = new TLRPC.TL_decryptedMessageActionDeleteMessages();
        tL_messageService.action.encryptedAction.random_ids.add(Long.valueOf(j));
        tL_messageService.id = i;
        tL_messageService.local_id = i;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = wf3.E(encryptedChat.id);
        tL_messageService.send_state = 1;
        tL_messageService.seq_in = i3;
        tL_messageService.seq_out = i2;
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        int i4 = (encryptedChat.participant_id > getUserConfig().e() ? 1 : (encryptedChat.participant_id == getUserConfig().e() ? 0 : -1));
        TLRPC.Peer peer = tL_messageService.peer_id;
        if (i4 == 0) {
            peer.user_id = encryptedChat.admin_id;
        } else {
            peer.user_id = encryptedChat.participant_id;
        }
        tL_messageService.date = 0;
        tL_messageService.random_id = j;
        return tL_messageService;
    }

    public final TLRPC.TL_messageService d(TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessageAction decryptedMessageAction) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = decryptedMessageAction;
        int i = getUserConfig().i();
        tL_messageService.id = i;
        tL_messageService.local_id = i;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = wf3.E(encryptedChat.id);
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        tL_messageService.send_state = 1;
        int i2 = (encryptedChat.participant_id > getUserConfig().e() ? 1 : (encryptedChat.participant_id == getUserConfig().e() ? 0 : -1));
        TLRPC.Peer peer = tL_messageService.peer_id;
        if (i2 == 0) {
            peer.user_id = encryptedChat.admin_id;
        } else {
            peer.user_id = encryptedChat.participant_id;
        }
        if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) && !(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
            tL_messageService.date = 0;
        } else {
            tL_messageService.date = getConnectionsManager().getCurrentTime();
        }
        getSendMessagesHelper().getClass();
        tL_messageService.random_id = r7a.D();
        getUserConfig().u(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_messageService);
        getMessagesStorage().k1(arrayList, false, true, true, 0, false, 0, 0L);
        return tL_messageService;
    }

    public final void e(int i, long j, boolean z) {
        NativeByteBuffer nativeByteBuffer;
        Exception e;
        if (j == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(12);
            } catch (Exception e2) {
                nativeByteBuffer = null;
                e = e2;
            }
            try {
                nativeByteBuffer.writeInt32(100);
                nativeByteBuffer.writeInt32(i);
                nativeByteBuffer.writeBool(z);
            } catch (Exception e3) {
                e = e3;
                cc4.g(e, true);
                j = getMessagesStorage().A(nativeByteBuffer);
                TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption = new TLRPC.TL_messages_discardEncryption();
                tL_messages_discardEncryption.chat_id = i;
                tL_messages_discardEncryption.delete_history = z;
                getConnectionsManager().sendRequest(tL_messages_discardEncryption, new yu2(this, j, (byte) 4));
            }
            j = getMessagesStorage().A(nativeByteBuffer);
        }
        TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption2 = new TLRPC.TL_messages_discardEncryption();
        tL_messages_discardEncryption2.chat_id = i;
        tL_messages_discardEncryption2.delete_history = z;
        getConnectionsManager().sendRequest(tL_messages_discardEncryption2, new yu2(this, j, (byte) 4));
    }

    public final void f(int i, boolean z) {
        e(i, 0L, z);
    }

    public final java.util.ArrayList g(org.telegram.tgnet.TLRPC.EncryptedMessage r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx9.g(org.telegram.tgnet.TLRPC$EncryptedMessage):java.util.ArrayList");
    }

    public final void j(TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.EncryptedChat encryptedChat, TLRPC.InputEncryptedFile inputEncryptedFile, String str, r47 r47Var) {
        if (decryptedMessage != null && encryptedChat.auth_key != null && !(encryptedChat instanceof TLRPC.TL_encryptedChatRequested) && !(encryptedChat instanceof TLRPC.TL_encryptedChatWaiting)) {
            getSendMessagesHelper().e0(message, false);
            Utilities.d.c(new ra7(this, encryptedChat, decryptedMessage, message, inputEncryptedFile, r47Var, str, (byte) 17));
        }
    }

    public final void k(TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia, d7a d7aVar) {
        for (int i = 0; i < tL_messages_sendEncryptedMultiMedia.files.size(); i++) {
            j(tL_messages_sendEncryptedMultiMedia.messages.get(i), (TLRPC.Message) d7aVar.z.get(i), d7aVar.n, tL_messages_sendEncryptedMultiMedia.files.get(i), (String) d7aVar.B.get(i), (r47) d7aVar.x.get(i));
        }
    }

    public final org.telegram.tgnet.TLRPC.Message l(org.telegram.tgnet.TLRPC.EncryptedChat r18, org.telegram.tgnet.TLRPC.EncryptedFile r19, int r20, org.telegram.tgnet.TLObject r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx9.l(org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$EncryptedFile, int, org.telegram.tgnet.TLObject, boolean):org.telegram.tgnet.TLRPC$Message");
    }

    public final void m() {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            hl.c3(new tx9(this, new ArrayList(arrayList), (byte) 1));
            ArrayList arrayList2 = new ArrayList(arrayList);
            kf7 messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            if (!arrayList2.isEmpty()) {
                messagesStorage.a.c(new q41(messagesStorage, arrayList2, (byte) 3));
            }
            arrayList.clear();
        }
    }

    public final void n(org.telegram.tgnet.tl.TL_update.TL_updateEncryption r20, j$.util.concurrent.ConcurrentHashMap r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx9.n(org.telegram.tgnet.tl.TL_update$TL_updateEncryption, j$.util.concurrent.ConcurrentHashMap):void");
    }

    public final void o(TLRPC.EncryptedChat encryptedChat) {
        byte[] bArr = new byte[256];
        Utilities.b.nextBytes(bArr);
        kf7 messagesStorage = getMessagesStorage();
        messagesStorage.I();
        BigInteger valueOf = BigInteger.valueOf(messagesStorage.E);
        BigInteger bigInteger = new BigInteger(1, bArr);
        kf7 messagesStorage2 = getMessagesStorage();
        messagesStorage2.I();
        byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage2.y)).toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr2 = new byte[256];
            System.arraycopy(byteArray, 1, bArr2, 0, 256);
            byteArray = bArr2;
        }
        getSendMessagesHelper().getClass();
        encryptedChat.exchange_id = r7a.D();
        encryptedChat.a_or_b = bArr;
        encryptedChat.g_a = byteArray;
        getMessagesStorage().X1(encryptedChat);
        x(encryptedChat, null);
    }

    public final void p(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, long j) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionAbortKey tL_decryptedMessageActionAbortKey = new TLRPC.TL_decryptedMessageActionAbortKey();
            tL_decryptedMessageService.action = tL_decryptedMessageActionAbortKey;
            tL_decryptedMessageActionAbortKey.exchange_id = j;
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
            Integer valueOf = Integer.valueOf(encryptedChat.id);
            ArrayList arrayList = this.a;
            if (arrayList.contains(valueOf)) {
                return;
            }
            arrayList.add(Integer.valueOf(encryptedChat.id));
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

    public final void y(TLRPC.EncryptedChat encryptedChat, int i, int i2, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            int i3 = encryptedChat.id;
            SparseArray sparseArray = this.d;
            SparseIntArray sparseIntArray = (SparseIntArray) sparseArray.get(i3);
            if (sparseIntArray != null) {
                if (sparseIntArray.indexOfKey(i) >= 0) {
                    return;
                }
            } else {
                sparseIntArray = new SparseIntArray();
                sparseArray.put(encryptedChat.id, sparseIntArray);
            }
            sparseIntArray.put(i, i2);
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionResend tL_decryptedMessageActionResend = new TLRPC.TL_decryptedMessageActionResend();
                tL_decryptedMessageService.action = tL_decryptedMessageActionResend;
                tL_decryptedMessageActionResend.start_seq_no = i;
                tL_decryptedMessageActionResend.end_seq_no = i2;
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
            r47 r47Var = new r47(this.currentAccount, message, false, false);
            r47Var.k.send_state = 1;
            r47Var.X1 = true;
            getMessagesController().z5(0, message.dialog_id, qd4.t(r47Var));
            getNotificationCenter().k(jn7.r, new Object[0]);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }
}
