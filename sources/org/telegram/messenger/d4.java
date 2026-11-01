package org.telegram.messenger;

import android.util.LongSparseArray;
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
    public final int f15293a;
    public final long f15294b;
    public final Object f15295c;
    public final Object d;

    public d4(Object obj, long j10, Object obj2, int i10) {
        this.f15293a = i10;
        this.f15295c = obj;
        this.f15294b = j10;
        this.d = obj2;
    }

    private final void a() {
        org.telegram.ui.Components.ec[] ecVarArr = (org.telegram.ui.Components.ec[]) this.d;
        ((boolean[]) this.f15295c)[0] = false;
        long j10 = this.f15294b;
        if (j10 == -1) {
            ecVarArr[0].setText(dd.L0(2131743938, null));
            org.telegram.ui.ActionBar.a7.V(ecVarArr[0], org.telegram.ui.ActionBar.t6.f21154p7, null);
            return;
        }
        ecVarArr[0].setText(dd.a0(null, null, 2131747251, Long.valueOf(j10)));
        org.telegram.ui.ActionBar.a7.V(ecVarArr[0], org.telegram.ui.ActionBar.t6.f21278w6, null);
    }

    private final void b() {
        vi viVar = (vi) this.f15295c;
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.d;
        long j10 = this.f15294b;
        viVar.getClass();
        try {
            SQLitePreparedStatement executeFast = viVar.getMessagesStorage().f16333b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfo.getObjectSize());
            botInfo.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, botInfo.user_id);
            executeFast.bindLong(2, j10);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    private final void c() {
        vi viVar = (vi) this.f15295c;
        TL_update.TL_updateBotCommands tL_updateBotCommands = (TL_update.TL_updateBotCommands) this.d;
        long j10 = this.f15294b;
        viVar.getClass();
        try {
            TL_bots.BotInfo H0 = viVar.H0(tL_updateBotCommands.bot_id, j10);
            if (H0 != null) {
                H0.commands = tL_updateBotCommands.commands;
            }
            SQLitePreparedStatement executeFast = viVar.getMessagesStorage().f16333b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(H0.getObjectSize());
            H0.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, H0.user_id);
            executeFast.bindLong(2, j10);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    private final void d() {
        vi viVar = (vi) this.f15295c;
        ArrayList arrayList = (ArrayList) this.d;
        long j10 = this.f15294b;
        try {
            viVar.getMessagesStorage().f16333b.beginTransaction();
            SQLitePreparedStatement executeFast = viVar.getMessagesStorage().f16333b.executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                kj.q5(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                executeFast.requery();
                executeFast.bindLong(1, j10);
                executeFast.bindInteger(2, message.f19815id);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
            executeFast.dispose();
            viVar.getMessagesStorage().f16333b.commitTransaction();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    private final void f() {
        wp wpVar = (wp) this.f15295c;
        TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) this.d;
        if (wpVar.f19094b8 == null) {
            wpVar.f19094b8 = new a0.h();
        }
        boolean z10 = messages_savedreactiontags instanceof TLRPC.TL_messages_savedReactionsTags;
        long j10 = this.f15294b;
        if (z10) {
            wpVar.f19094b8.k((TLRPC.TL_messages_savedReactionsTags) messages_savedreactiontags, j10);
            wpVar.getNotificationCenter().k(at.f14719h3, Long.valueOf(j10));
        }
        TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = new TLRPC.TL_messages_getSavedReactionTags();
        if (z10) {
            tL_messages_getSavedReactionTags.hash = messages_savedreactiontags.hash;
        }
        if (j10 != 0) {
            tL_messages_getSavedReactionTags.flags |= 1;
            tL_messages_getSavedReactionTags.peer = wpVar.i1(j10);
        }
        wpVar.getConnectionsManager().sendRequest(tL_messages_getSavedReactionTags, new im(wpVar, j10, messages_savedreactiontags, tL_messages_getSavedReactionTags, 0));
    }

    private final void g() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.InputChannel inputChannel;
        ds dsVar = (ds) this.f15295c;
        TLRPC.Updates updates = (TLRPC.Updates) this.d;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            chat = null;
            if (i11 < updates.chats.size()) {
                chat2 = updates.chats.get(i11);
                if (this.f15294b == chat2.f19794id) {
                    break;
                }
                i11++;
            } else {
                chat2 = null;
                break;
            }
        }
        if (chat2 != null && (inputChannel = chat2.migrated_to) != null) {
            long j10 = inputChannel.channel_id;
            while (true) {
                if (i10 >= updates.chats.size()) {
                    break;
                }
                TLRPC.Chat chat3 = updates.chats.get(i10);
                if (j10 == chat3.f19794id) {
                    chat = chat3;
                    break;
                }
                i10++;
            }
            if (chat != null) {
                dsVar.run(j10);
            }
        }
    }

    private final void h() {
        long j10 = this.f15294b;
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.d;
        SQLiteDatabase sQLiteDatabase = ((wp) this.f15295c).getMessagesStorage().f16333b;
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
            } catch (Exception e) {
                f8.g(e, true);
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

    private final void i() {
        ((wp) this.f15295c).getNotificationCenter().k(at.f14711g1, Long.valueOf(this.f15294b), Integer.valueOf(((TLRPC.TL_chatOnlines) this.d).onlines));
    }

    private final void j() {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        TLRPC.UserFull userFull;
        is isVar = (is) this.f15295c;
        long j10 = this.f15294b;
        TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.d;
        isVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLiteCursor2 = isVar.f16333b.queryFinalized("SELECT uid, info, pinned FROM user_settings WHERE uid = " + j10, new Object[0]);
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
                    if (next && userFull != null && i20.a(userFull, requirementToContact)) {
                        SQLitePreparedStatement executeFast = isVar.f16333b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
                        try {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(userFull.getObjectSize());
                            userFull.serializeToStream(nativeByteBuffer);
                            executeFast.bindLong(1, j10);
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.bindInteger(3, userFull.pinned_msg_id);
                            executeFast.step();
                            executeFast.dispose();
                            nativeByteBuffer.reuse();
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor2 = null;
                            sQLitePreparedStatement = executeFast;
                            isVar.o(e, true);
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
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteCursor = "SELECT uid, info, pinned FROM user_settings WHERE uid = ";
            }
        } catch (Exception e10) {
            e = e10;
            sQLiteCursor2 = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = 0;
        }
    }

    private final void k() {
        long j10 = this.f15294b;
        ((is) this.f15295c).getMessagesController().c3((TLRPC.Chat) this.d, j10);
    }

    private final void l() {
        ((is) this.f15295c).getMessagesController().f19234r7.q(this.f15294b, (TLRPC.TL_forumTopic) this.d, false);
    }

    private final void m() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d4.m():void");
    }

    private final void n() {
        is isVar = (is) this.f15295c;
        long j10 = this.f15294b;
        a0.h hVar = (a0.h) this.d;
        isVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = isVar.f16333b;
                sQLiteDatabase.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j10).stepThis().dispose();
                isVar.f16333b.beginTransaction();
                SQLitePreparedStatement executeFast = isVar.f16333b.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    try {
                        executeFast.requery();
                        executeFast.bindLong(1, j10);
                        executeFast.bindLong(2, hVar.j(i10));
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) hVar.n(i10);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(channelParticipant.getObjectSize());
                        channelParticipant.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = executeFast;
                        isVar.o(e, true);
                        isVar = isVar.f16333b;
                        if (isVar != 0) {
                            isVar.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase2 = isVar.f16333b;
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
                isVar.f16333b.commitTransaction();
                SQLiteDatabase sQLiteDatabase3 = isVar.f16333b;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    private final void o() {
        is isVar = (is) this.f15295c;
        long j10 = this.f15294b;
        NativeByteBuffer nativeByteBuffer = (NativeByteBuffer) this.d;
        isVar.getClass();
        try {
            SQLitePreparedStatement executeFast = isVar.f16333b.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
            executeFast.bindLong(1, j10);
            executeFast.bindByteBuffer(2, nativeByteBuffer);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            isVar.o(e, true);
        } finally {
            nativeByteBuffer.reuse();
        }
    }

    private final void p() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d4.p():void");
    }

    private final void q() {
        is isVar = (is) this.f15295c;
        SparseArray sparseArray = (SparseArray) this.d;
        isVar.getClass();
        if (sparseArray.size() != 0) {
            int min = Math.min(sparseArray.size(), 100);
            for (int i10 = 0; i10 < min; i10++) {
                isVar.getNotificationCenter().k(at.f14756o1, Long.valueOf(this.f15294b), Integer.valueOf(sparseArray.keyAt(i10)), (TLRPC.TL_messageReactions) sparseArray.valueAt(i10));
            }
        }
    }

    private final void r() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d4.r():void");
    }

    private final void s() {
        Boolean bool;
        u10 u10Var = (u10) this.f15295c;
        long j10 = this.f15294b;
        String str = (String) this.d;
        synchronized (u10Var) {
            u10Var.d.put(Long.valueOf(j10), str);
            LongSparseArray longSparseArray = u10Var.f18349a;
            bool = Boolean.TRUE;
            longSparseArray.put(j10, bool);
            u10Var.H();
        }
        at.f(u10Var.currentAccount).k(at.P1, Long.valueOf(j10), bool);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d4.run():void");
    }

    public d4(Object obj, Object obj2, long j10, int i10) {
        this.f15293a = i10;
        this.f15295c = obj;
        this.d = obj2;
        this.f15294b = j10;
    }
}
