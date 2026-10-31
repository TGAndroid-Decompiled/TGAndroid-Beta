package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class kg implements Runnable {
    public final int f16571a;
    public final Object f16572b;
    public final Object f16573c;
    public final Object d;

    public kg(Object obj, Object obj2, Object obj3, int i10) {
        this.f16571a = i10;
        this.f16572b = obj;
        this.f16573c = obj2;
        this.d = obj3;
    }

    private final void a() {
        hs hsVar = (hs) this.f16572b;
        String str = (String) this.f16573c;
        String str2 = (String) this.d;
        hsVar.getClass();
        try {
            if (str.length() != 0) {
                SQLiteDatabase sQLiteDatabase = hsVar.f15940b;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str + ")").stepThis().dispose();
            }
            if (str2.length() != 0) {
                SQLiteDatabase sQLiteDatabase2 = hsVar.f15940b;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str2 + ")").stepThis().dispose();
            }
        } catch (Exception e) {
            hsVar.o(e, true);
        }
    }

    private final void b() {
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        hs hsVar = (hs) this.f16572b;
        ArrayList arrayList = (ArrayList) this.f16573c;
        org.telegram.ui.nh nhVar = (org.telegram.ui.nh) this.d;
        long e = hsVar.getUserConfig().e();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            jj jjVar = (jj) arrayList.get(i10);
            if (!jjVar.f16357p1 && !jj.b4(jjVar.f16337k)) {
                try {
                    sQLiteCursor = hsVar.f15940b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(jj.B0(jjVar.f16337k)), Integer.valueOf(jjVar.f1()));
                    try {
                        try {
                            if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, e);
                                byteBufferValue.reuse();
                                jjVar.f16337k.attachPath = TLdeserialize.attachPath;
                                jjVar.K(true);
                            }
                        } catch (Exception e7) {
                            e = e7;
                            f8.g(e, true);
                            if (sQLiteCursor == null) {
                                i10 = i11;
                            }
                            sQLiteCursor.dispose();
                            i10 = i11;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                sQLiteCursor.dispose();
            }
            i10 = i11;
        }
        i0.g3(nhVar);
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kg.c():void");
    }

    private final void d() {
        int i10;
        hs hsVar = (hs) this.f16572b;
        ArrayList arrayList = (ArrayList) this.f16573c;
        kk kkVar = (kk) this.d;
        hsVar.getClass();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
            if (ephemeralMessage.top_msg_id == 0) {
                TL_ephemeral.EphemeralMessage W = hsVar.W(ephemeralMessage.f20007id, o5.o(ephemeralMessage.peer_id));
                if (W != null && (i10 = W.top_msg_id) != 0) {
                    ephemeralMessage.top_msg_id = i10;
                    TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
                    if (messageReplyHeader != null) {
                        messageReplyHeader.forum_topic = true;
                    }
                    ephemeralMessage.flags |= 2;
                }
            }
        }
        hsVar.g1(arrayList, true);
        kkVar.run();
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kg.f():void");
    }

    private final void g() {
        ow owVar = (ow) this.f16572b;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f16573c;
        TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) this.d;
        if (encryptedChat != null) {
            owVar.getMessagesController().R3(encryptedChat2, false);
        }
        owVar.getMessagesStorage().V1(encryptedChat2);
        owVar.getNotificationCenter().k(zs.Y, encryptedChat2);
    }

    private final void h() {
        Runnable runnable = (Runnable) this.d;
        ((qz) this.f16572b).f17665w.remove((String) this.f16573c);
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void i() {
        qz qzVar = (qz) this.f16572b;
        TLObject tLObject = (TLObject) this.f16573c;
        cz czVar = (cz) this.d;
        qzVar.getClass();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
            tL_inputMediaUploadedPhoto.live_photo = true;
            tL_inputMediaUploadedPhoto.file = czVar.f15113j;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputMediaUploadedPhoto.video = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.f19805id = document.f19799id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            TLObject tLObject2 = czVar.f15109c;
            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                ((TLRPC.TL_messages_sendMedia) tLObject2).media = tL_inputMediaUploadedPhoto;
            } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                ((TL_ephemeral.TL_sendMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
            } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media = tL_inputMediaUploadedPhoto;
            } else {
                ((TLRPC.TL_messages_editMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
            }
            qzVar.N(tLObject2, czVar.f15116m, czVar.f15110f, czVar, czVar.K, null, czVar.H);
            return;
        }
        czVar.c();
    }

    private final void j() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f16573c;
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = (TLRPC.TL_messages_startHistoryImport) this.d;
        hz hzVar = ((gz) this.f16572b).f15792b;
        qz qzVar = hzVar.f15995q;
        qzVar.D.l(hzVar.f15988j);
        int i10 = zs.f19705v1;
        if (tL_error == null) {
            qzVar.getNotificationCenter().k(i10, Long.valueOf(hzVar.f15988j));
        } else {
            qzVar.getNotificationCenter().k(i10, Long.valueOf(hzVar.f15988j), tL_messages_startHistoryImport, tL_error);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kg.run():void");
    }

    public kg(f1 f1Var, TLObject tLObject, String str, int i10) {
        this.f16571a = i10;
        this.f16572b = f1Var;
        this.d = tLObject;
        this.f16573c = str;
    }
}
