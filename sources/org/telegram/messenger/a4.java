package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_update;
public final class a4 implements Runnable {
    public final int f21452a;
    public final long f21453b;
    public final Object f21454c;
    public final Object d;

    public a4(Object obj, long j10, Object obj2, int i3) {
        this.f21452a = i3;
        this.f21454c = obj;
        this.f21453b = j10;
        this.d = obj2;
    }

    private final void a() {
        li liVar = (li) this.f21454c;
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.d;
        long j10 = this.f21453b;
        liVar.getClass();
        try {
            SQLitePreparedStatement executeFast = liVar.getMessagesStorage().f24936b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfo.getObjectSize());
            botInfo.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, botInfo.user_id);
            executeFast.bindLong(2, j10);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void b() {
        li liVar = (li) this.f21454c;
        TL_update.TL_updateBotCommands tL_updateBotCommands = (TL_update.TL_updateBotCommands) this.d;
        long j10 = this.f21453b;
        liVar.getClass();
        try {
            TL_bots.BotInfo H0 = liVar.H0(tL_updateBotCommands.bot_id, j10);
            if (H0 != null) {
                H0.commands = tL_updateBotCommands.commands;
            }
            SQLitePreparedStatement executeFast = liVar.getMessagesStorage().f24936b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(H0.getObjectSize());
            H0.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, H0.user_id);
            executeFast.bindLong(2, j10);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void c() {
        li liVar = (li) this.f21454c;
        ArrayList arrayList = (ArrayList) this.d;
        long j10 = this.f21453b;
        try {
            liVar.getMessagesStorage().f24936b.beginTransaction();
            SQLitePreparedStatement executeFast = liVar.getMessagesStorage().f24936b.executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i3);
                zi.r5(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                executeFast.requery();
                executeFast.bindLong(1, j10);
                executeFast.bindInteger(2, message.f27022id);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
            executeFast.dispose();
            liVar.getMessagesStorage().f24936b.commitTransaction();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void e() {
        hp hpVar = (hp) this.f21454c;
        TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) this.d;
        if (hpVar.f22962a8 == null) {
            hpVar.f22962a8 = new a0.h();
        }
        boolean z10 = messages_savedreactiontags instanceof TLRPC.TL_messages_savedReactionsTags;
        long j10 = this.f21453b;
        if (z10) {
            hpVar.f22962a8.k((TLRPC.TL_messages_savedReactionsTags) messages_savedreactiontags, j10);
            hpVar.getNotificationCenter().k(hs.f23240h3, Long.valueOf(j10));
        }
        TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = new TLRPC.TL_messages_getSavedReactionTags();
        if (z10) {
            tL_messages_getSavedReactionTags.hash = messages_savedreactiontags.hash;
        }
        if (j10 != 0) {
            tL_messages_getSavedReactionTags.flags |= 1;
            tL_messages_getSavedReactionTags.peer = hpVar.j1(j10);
        }
        hpVar.getConnectionsManager().sendRequest(tL_messages_getSavedReactionTags, new mm(hpVar, j10, messages_savedreactiontags, tL_messages_getSavedReactionTags, 0));
    }

    private final void f() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.InputChannel inputChannel;
        lr lrVar = (lr) this.f21454c;
        TLRPC.Updates updates = (TLRPC.Updates) this.d;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            chat = null;
            if (i10 < updates.chats.size()) {
                chat2 = updates.chats.get(i10);
                if (this.f21453b == chat2.f27001id) {
                    break;
                }
                i10++;
            } else {
                chat2 = null;
                break;
            }
        }
        if (chat2 != null && (inputChannel = chat2.migrated_to) != null) {
            long j10 = inputChannel.channel_id;
            while (true) {
                if (i3 >= updates.chats.size()) {
                    break;
                }
                TLRPC.Chat chat3 = updates.chats.get(i3);
                if (j10 == chat3.f27001id) {
                    chat = chat3;
                    break;
                }
                i3++;
            }
            if (chat != null) {
                lrVar.run(j10);
            }
        }
    }

    private final void g() {
        long j10 = this.f21453b;
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.d;
        SQLiteDatabase sQLiteDatabase = ((hp) this.f21454c).getMessagesStorage().f24936b;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLiteDatabase.executeFast("DELETE FROM saved_reaction_tags WHERE topic_id = " + j10).stepThis().dispose();
                sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO saved_reaction_tags VALUES(?, ?)");
                sQLitePreparedStatement.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_savedReactionsTags.getObjectSize());
                tL_messages_savedReactionsTags.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatement.bindLong(1, j10);
                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                a8.g(e10, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    private final void h() {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        TLRPC.UserFull userFull;
        qr qrVar = (qr) this.f21454c;
        long j10 = this.f21453b;
        TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.d;
        qrVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLiteCursor2 = qrVar.f24936b.queryFinalized("SELECT uid, info, pinned FROM user_settings WHERE uid = " + j10, new Object[0]);
                try {
                    boolean next = sQLiteCursor2.next();
                    if (next) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(1);
                        userFull = TLRPC.UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        if (userFull != null) {
                            userFull.pinned_msg_id = sQLiteCursor2.intValue(2);
                        }
                        byteBufferValue.reuse();
                    } else {
                        userFull = null;
                    }
                    sQLiteCursor2.dispose();
                    if (next && userFull != null && l10.a(userFull, requirementToContact)) {
                        SQLitePreparedStatement executeFast = qrVar.f24936b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
                        try {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(userFull.getObjectSize());
                            userFull.serializeToStream(nativeByteBuffer);
                            executeFast.bindLong(1, j10);
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.bindInteger(3, userFull.pinned_msg_id);
                            executeFast.step();
                            executeFast.dispose();
                            nativeByteBuffer.reuse();
                        } catch (Exception e10) {
                            e = e10;
                            sQLiteCursor2 = null;
                            sQLitePreparedStatement = executeFast;
                            qrVar.o(e, true);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = 0;
                            sQLitePreparedStatement = executeFast;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor != 0) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteCursor = "SELECT uid, info, pinned FROM user_settings WHERE uid = ";
            }
        } catch (Exception e12) {
            e = e12;
            sQLiteCursor2 = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = 0;
        }
    }

    private final void i() {
        long j10 = this.f21453b;
        ((qr) this.f21454c).getMessagesController().e3((TLRPC.Chat) this.d, j10);
    }

    private final void j() {
        ((qr) this.f21454c).getMessagesController().f23102q7.q(this.f21453b, (TLRPC.TL_forumTopic) this.d, false);
    }

    private final void k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.a4.k():void");
    }

    private final void l() {
        qr qrVar = (qr) this.f21454c;
        long j10 = this.f21453b;
        a0.h hVar = (a0.h) this.d;
        qrVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
                sQLiteDatabase.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j10).stepThis().dispose();
                qrVar.f24936b.beginTransaction();
                SQLitePreparedStatement executeFast = qrVar.f24936b.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
                for (int i3 = 0; i3 < hVar.m(); i3++) {
                    try {
                        executeFast.requery();
                        executeFast.bindLong(1, j10);
                        executeFast.bindLong(2, hVar.j(i3));
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) hVar.n(i3);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(channelParticipant.getObjectSize());
                        channelParticipant.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    } catch (Exception e10) {
                        e = e10;
                        sQLitePreparedStatement = executeFast;
                        qrVar.o(e, true);
                        qrVar = qrVar.f24936b;
                        if (qrVar != 0) {
                            qrVar.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase2 = qrVar.f24936b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                executeFast.dispose();
                qrVar.f24936b.commitTransaction();
                SQLiteDatabase sQLiteDatabase3 = qrVar.f24936b;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private final void m() {
        qr qrVar = (qr) this.f21454c;
        long j10 = this.f21453b;
        NativeByteBuffer nativeByteBuffer = (NativeByteBuffer) this.d;
        qrVar.getClass();
        try {
            SQLitePreparedStatement executeFast = qrVar.f24936b.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
            executeFast.bindLong(1, j10);
            executeFast.bindByteBuffer(2, nativeByteBuffer);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            qrVar.o(e10, true);
        } finally {
            nativeByteBuffer.reuse();
        }
    }

    private final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.a4.n():void");
    }

    private final void o() {
        SQLitePreparedStatement executeFast;
        qr qrVar = (qr) this.f21454c;
        TLRPC.Message message = (TLRPC.Message) this.d;
        long j10 = this.f21453b;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                qrVar.f24936b.beginTransaction();
                TLRPC.TL_message e02 = qrVar.e0(message.f27022id, j10);
                oi.a(message, e02);
                for (int i3 = 0; i3 < 2; i3++) {
                    if (i3 == 0) {
                        executeFast = qrVar.f24936b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = qrVar.f24936b.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                    }
                    try {
                        executeFast.requery();
                        NativeByteBuffer c2 = oi.c(e02);
                        if (c2 != null) {
                            executeFast.bindByteBuffer(1, c2);
                        } else {
                            executeFast.bindNull(1);
                        }
                        executeFast.bindInteger(2, message.f27022id);
                        executeFast.bindLong(3, j10);
                        executeFast.step();
                        executeFast.dispose();
                        if (c2 != null) {
                            c2.reuse();
                        }
                    } catch (Exception e10) {
                        e = e10;
                        sQLitePreparedStatement = executeFast;
                        qrVar.o(e, true);
                        SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase2 = qrVar.f24936b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                qrVar.f24936b.commitTransaction();
                SQLiteDatabase sQLiteDatabase3 = qrVar.f24936b;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final void p() {
        qr qrVar = (qr) this.f21454c;
        SparseArray sparseArray = (SparseArray) this.d;
        qrVar.getClass();
        if (sparseArray.size() != 0) {
            int min = Math.min(sparseArray.size(), 100);
            for (int i3 = 0; i3 < min; i3++) {
                qrVar.getNotificationCenter().k(hs.f23275o1, Long.valueOf(this.f21453b), Integer.valueOf(sparseArray.keyAt(i3)), (TLRPC.TL_messageReactions) sparseArray.valueAt(i3));
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.a4.run():void");
    }

    public a4(Object obj, Object obj2, long j10, int i3) {
        this.f21452a = i3;
        this.f21454c = obj;
        this.d = obj2;
        this.f21453b = j10;
    }
}
