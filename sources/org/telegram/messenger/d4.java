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
public final class d4 implements Runnable {
    public final int f23483a;
    public final long f23484b;
    public final Object f23485c;
    public final Object d;

    public d4(Object obj, long j3, Object obj2, int i7) {
        this.f23483a = i7;
        this.f23485c = obj;
        this.f23484b = j3;
        this.d = obj2;
    }

    private final void a() {
        ri riVar = (ri) this.f23485c;
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.d;
        long j3 = this.f23484b;
        riVar.getClass();
        try {
            SQLitePreparedStatement executeFast = riVar.getMessagesStorage().f27054b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfo.getObjectSize());
            botInfo.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, botInfo.user_id);
            executeFast.bindLong(2, j3);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void b() {
        ri riVar = (ri) this.f23485c;
        TL_update.TL_updateBotCommands tL_updateBotCommands = (TL_update.TL_updateBotCommands) this.d;
        long j3 = this.f23484b;
        riVar.getClass();
        try {
            TL_bots.BotInfo K0 = riVar.K0(tL_updateBotCommands.bot_id, j3);
            if (K0 != null) {
                K0.commands = tL_updateBotCommands.commands;
            }
            SQLitePreparedStatement executeFast = riVar.getMessagesStorage().f27054b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(K0.getObjectSize());
            K0.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, K0.user_id);
            executeFast.bindLong(2, j3);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void c() {
        ri riVar = (ri) this.f23485c;
        ArrayList arrayList = (ArrayList) this.d;
        long j3 = this.f23484b;
        try {
            riVar.getMessagesStorage().f27054b.beginTransaction();
            SQLitePreparedStatement executeFast = riVar.getMessagesStorage().f27054b.executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i7);
                fj.q5(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                executeFast.requery();
                executeFast.bindLong(1, j3);
                executeFast.bindInteger(2, message.f28424id);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
            executeFast.dispose();
            riVar.getMessagesStorage().f27054b.commitTransaction();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void d() {
        mp mpVar = (mp) this.f23485c;
        TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) this.d;
        if (mpVar.f25659g8 == null) {
            mpVar.f25659g8 = new a0.h();
        }
        boolean z10 = messages_savedreactiontags instanceof TLRPC.TL_messages_savedReactionsTags;
        long j3 = this.f23484b;
        if (z10) {
            mpVar.f25659g8.k((TLRPC.TL_messages_savedReactionsTags) messages_savedreactiontags, j3);
            mpVar.getNotificationCenter().k(ks.j3, Long.valueOf(j3));
        }
        TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = new TLRPC.TL_messages_getSavedReactionTags();
        if (z10) {
            tL_messages_getSavedReactionTags.hash = messages_savedreactiontags.hash;
        }
        if (j3 != 0) {
            tL_messages_getSavedReactionTags.flags |= 1;
            tL_messages_getSavedReactionTags.peer = mpVar.l1(j3);
        }
        mpVar.getConnectionsManager().sendRequest(tL_messages_getSavedReactionTags, new pm(mpVar, j3, messages_savedreactiontags, tL_messages_getSavedReactionTags, 0));
    }

    private final void f() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.InputChannel inputChannel;
        or orVar = (or) this.f23485c;
        TLRPC.Updates updates = (TLRPC.Updates) this.d;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            chat = null;
            if (i10 < updates.chats.size()) {
                chat2 = updates.chats.get(i10);
                if (this.f23484b == chat2.f28403id) {
                    break;
                }
                i10++;
            } else {
                chat2 = null;
                break;
            }
        }
        if (chat2 != null && (inputChannel = chat2.migrated_to) != null) {
            long j3 = inputChannel.channel_id;
            while (true) {
                if (i7 >= updates.chats.size()) {
                    break;
                }
                TLRPC.Chat chat3 = updates.chats.get(i7);
                if (j3 == chat3.f28403id) {
                    chat = chat3;
                    break;
                }
                i7++;
            }
            if (chat != null) {
                orVar.run(j3);
            }
        }
    }

    private final void g() {
        long j3 = this.f23484b;
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.d;
        SQLiteDatabase sQLiteDatabase = ((mp) this.f23485c).getMessagesStorage().f27054b;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLiteDatabase.executeFast("DELETE FROM saved_reaction_tags WHERE topic_id = " + j3).stepThis().dispose();
                sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO saved_reaction_tags VALUES(?, ?)");
                sQLitePreparedStatement.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_savedReactionsTags.getObjectSize());
                tL_messages_savedReactionsTags.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatement.bindLong(1, j3);
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
        tr trVar = (tr) this.f23485c;
        long j3 = this.f23484b;
        TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.d;
        trVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLiteCursor2 = trVar.f27054b.queryFinalized("SELECT uid, info, pinned FROM user_settings WHERE uid = " + j3, new Object[0]);
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
                    if (next && userFull != null && o10.a(userFull, requirementToContact)) {
                        SQLitePreparedStatement executeFast = trVar.f27054b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
                        try {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(userFull.getObjectSize());
                            userFull.serializeToStream(nativeByteBuffer);
                            executeFast.bindLong(1, j3);
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.bindInteger(3, userFull.pinned_msg_id);
                            executeFast.step();
                            executeFast.dispose();
                            nativeByteBuffer.reuse();
                        } catch (Exception e10) {
                            e = e10;
                            sQLiteCursor2 = null;
                            sQLitePreparedStatement = executeFast;
                            trVar.o(e, true);
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
        long j3 = this.f23484b;
        ((tr) this.f23485c).getMessagesController().k3((TLRPC.Chat) this.d, j3);
    }

    private final void j() {
        ((tr) this.f23485c).getMessagesController().f25769t7.q(this.f23484b, (TLRPC.TL_forumTopic) this.d, false);
    }

    private final void k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d4.k():void");
    }

    private final void l() {
        tr trVar = (tr) this.f23485c;
        long j3 = this.f23484b;
        a0.h hVar = (a0.h) this.d;
        trVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = trVar.f27054b;
                sQLiteDatabase.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j3).stepThis().dispose();
                trVar.f27054b.beginTransaction();
                SQLitePreparedStatement executeFast = trVar.f27054b.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    try {
                        executeFast.requery();
                        executeFast.bindLong(1, j3);
                        executeFast.bindLong(2, hVar.j(i7));
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) hVar.n(i7);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(channelParticipant.getObjectSize());
                        channelParticipant.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    } catch (Exception e10) {
                        e = e10;
                        sQLitePreparedStatement = executeFast;
                        trVar.o(e, true);
                        trVar = trVar.f27054b;
                        if (trVar != 0) {
                            trVar.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase2 = trVar.f27054b;
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
                trVar.f27054b.commitTransaction();
                SQLiteDatabase sQLiteDatabase3 = trVar.f27054b;
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
        tr trVar = (tr) this.f23485c;
        long j3 = this.f23484b;
        NativeByteBuffer nativeByteBuffer = (NativeByteBuffer) this.d;
        trVar.getClass();
        try {
            SQLitePreparedStatement executeFast = trVar.f27054b.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
            executeFast.bindLong(1, j3);
            executeFast.bindByteBuffer(2, nativeByteBuffer);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            trVar.o(e10, true);
        } finally {
            nativeByteBuffer.reuse();
        }
    }

    private final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d4.n():void");
    }

    private final void o() {
        tr trVar = (tr) this.f23485c;
        SparseArray sparseArray = (SparseArray) this.d;
        trVar.getClass();
        if (sparseArray.size() != 0) {
            int min = Math.min(sparseArray.size(), 100);
            for (int i7 = 0; i7 < min; i7++) {
                trVar.getNotificationCenter().k(ks.f25161o1, Long.valueOf(this.f23484b), Integer.valueOf(sparseArray.keyAt(i7)), (TLRPC.TL_messageReactions) sparseArray.valueAt(i7));
            }
        }
    }

    private final void p() {
        SQLitePreparedStatement executeFast;
        tr trVar = (tr) this.f23485c;
        TLRPC.Message message = (TLRPC.Message) this.d;
        long j3 = this.f23484b;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                trVar.f27054b.beginTransaction();
                TLRPC.TL_message e02 = trVar.e0(message.f28424id, j3);
                ui.a(message, e02);
                for (int i7 = 0; i7 < 2; i7++) {
                    if (i7 == 0) {
                        executeFast = trVar.f27054b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = trVar.f27054b.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                    }
                    try {
                        executeFast.requery();
                        NativeByteBuffer c10 = ui.c(e02);
                        if (c10 != null) {
                            executeFast.bindByteBuffer(1, c10);
                        } else {
                            executeFast.bindNull(1);
                        }
                        executeFast.bindInteger(2, message.f28424id);
                        executeFast.bindLong(3, j3);
                        executeFast.step();
                        executeFast.dispose();
                        if (c10 != null) {
                            c10.reuse();
                        }
                    } catch (Exception e10) {
                        e = e10;
                        sQLitePreparedStatement = executeFast;
                        trVar.o(e, true);
                        SQLiteDatabase sQLiteDatabase = trVar.f27054b;
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
                        SQLiteDatabase sQLiteDatabase2 = trVar.f27054b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                trVar.f27054b.commitTransaction();
                SQLiteDatabase sQLiteDatabase3 = trVar.f27054b;
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

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d4.run():void");
    }

    public d4(Object obj, Object obj2, long j3, int i7) {
        this.f23483a = i7;
        this.f23485c = obj;
        this.d = obj2;
        this.f23484b = j3;
    }
}
