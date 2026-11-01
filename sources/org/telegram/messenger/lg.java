package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class lg implements Runnable {
    public final int f16936a;
    public final Object f16937b;
    public final Object f16938c;
    public final Object d;

    public lg(Object obj, Object obj2, Object obj3, int i10) {
        this.f16936a = i10;
        this.f16937b = obj;
        this.f16938c = obj2;
        this.d = obj3;
    }

    private final void a() {
        is isVar = (is) this.f16937b;
        String str = (String) this.f16938c;
        String str2 = (String) this.d;
        isVar.getClass();
        try {
            if (str.length() != 0) {
                SQLiteDatabase sQLiteDatabase = isVar.f16333b;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str + ")").stepThis().dispose();
            }
            if (str2.length() != 0) {
                SQLiteDatabase sQLiteDatabase2 = isVar.f16333b;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str2 + ")").stepThis().dispose();
            }
        } catch (Exception e) {
            isVar.o(e, true);
        }
    }

    private final void b() {
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        is isVar = (is) this.f16937b;
        ArrayList arrayList = (ArrayList) this.f16938c;
        org.telegram.ui.mh mhVar = (org.telegram.ui.mh) this.d;
        long e = isVar.getUserConfig().e();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            kj kjVar = (kj) arrayList.get(i10);
            if (!kjVar.f16710p1 && !kj.b4(kjVar.f16690k)) {
                try {
                    sQLiteCursor = isVar.f16333b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(kj.B0(kjVar.f16690k)), Integer.valueOf(kjVar.f1()));
                    try {
                        try {
                            if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, e);
                                byteBufferValue.reuse();
                                kjVar.f16690k.attachPath = TLdeserialize.attachPath;
                                kjVar.K(true);
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
        i0.g3(mhVar);
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lg.c():void");
    }

    private final void d() {
        int i10;
        is isVar = (is) this.f16937b;
        ArrayList arrayList = (ArrayList) this.f16938c;
        lk lkVar = (lk) this.d;
        isVar.getClass();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
            if (ephemeralMessage.top_msg_id == 0) {
                TL_ephemeral.EphemeralMessage W = isVar.W(ephemeralMessage.f20008id, o5.o(ephemeralMessage.peer_id));
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
        isVar.g1(arrayList, true);
        lkVar.run();
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lg.f():void");
    }

    private final void g() {
        pw pwVar = (pw) this.f16937b;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f16938c;
        TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) this.d;
        if (encryptedChat != null) {
            pwVar.getMessagesController().R3(encryptedChat2, false);
        }
        pwVar.getMessagesStorage().V1(encryptedChat2);
        pwVar.getNotificationCenter().k(at.Y, encryptedChat2);
    }

    private final void h() {
        Runnable runnable = (Runnable) this.d;
        ((rz) this.f16937b).f18011w.remove((String) this.f16938c);
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void i() {
        rz rzVar = (rz) this.f16937b;
        TLObject tLObject = (TLObject) this.f16938c;
        dz dzVar = (dz) this.d;
        rzVar.getClass();
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
            tL_inputMediaUploadedPhoto.live_photo = true;
            tL_inputMediaUploadedPhoto.file = dzVar.f15469j;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputMediaUploadedPhoto.video = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.f19806id = document.f19800id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            TLObject tLObject2 = dzVar.f15465c;
            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                ((TLRPC.TL_messages_sendMedia) tLObject2).media = tL_inputMediaUploadedPhoto;
            } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                ((TL_ephemeral.TL_sendMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
            } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media = tL_inputMediaUploadedPhoto;
            } else {
                ((TLRPC.TL_messages_editMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
            }
            rzVar.N(tLObject2, dzVar.f15472m, dzVar.f15466f, dzVar, dzVar.K, null, dzVar.H);
            return;
        }
        dzVar.c();
    }

    private final void j() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f16938c;
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = (TLRPC.TL_messages_startHistoryImport) this.d;
        iz izVar = ((hz) this.f16937b).f16141b;
        rz rzVar = izVar.f16387q;
        rzVar.D.l(izVar.f16380j);
        int i10 = at.f14801v1;
        if (tL_error == null) {
            rzVar.getNotificationCenter().k(i10, Long.valueOf(izVar.f16380j));
        } else {
            rzVar.getNotificationCenter().k(i10, Long.valueOf(izVar.f16380j), tL_messages_startHistoryImport, tL_error);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lg.run():void");
    }

    public lg(f1 f1Var, TLObject tLObject, String str, int i10) {
        this.f16936a = i10;
        this.f16937b = f1Var;
        this.d = tLObject;
        this.f16938c = str;
    }
}
