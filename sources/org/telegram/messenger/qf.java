package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

public final class qf implements Runnable {

    public final int f21367a = 0;

    public final int f21368b;

    public final MessagesStorage f21369c;
    public final long d;

    public final long f21370e;

    public final int f21371f;
    public final Object h;

    public qf(int i10, int i11, long j10, long j11, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f21369c = messagesStorage;
        this.d = j10;
        this.f21368b = i10;
        this.h = inputChannel;
        this.f21371f = i11;
        this.f21370e = j11;
    }

    @Override
    public final void run() throws Throwable {
        SQLiteCursor sQLiteCursor;
        int i10;
        SQLiteCursor sQLiteCursorQueryFinalized;
        ArrayList<Long> arrayList;
        ArrayList arrayList2;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        int i11 = this.f21367a;
        Object obj = this.h;
        switch (i11) {
            case 0:
                this.f21369c.lambda$loadPendingTasks$22(this.d, this.f21368b, (TLRPC.InputChannel) obj, this.f21371f, this.f21370e);
                return;
            default:
                final org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) obj;
                long j10 = this.f21370e;
                final ArrayList arrayList3 = new ArrayList();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                int i12 = this.f21368b;
                final MessagesStorage messagesStorage = this.f21369c;
                final long j11 = this.d;
                if (i12 > 0) {
                    i10 = i12;
                    try {
                        sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND mid <= ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j11), Integer.valueOf(i10));
                        arrayList = new ArrayList<>();
                        arrayList2 = new ArrayList();
                        while (sQLiteCursorQueryFinalized.next()) {
                            nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                            if (nativeByteBufferByteBufferValue != null) {
                                TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, j10);
                                nativeByteBufferByteBufferValue.reuse();
                                messageTLdeserialize.f22401id = sQLiteCursorQueryFinalized.intValue(1);
                                messageTLdeserialize.dialog_id = -j11;
                                MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList, arrayList2, null);
                                arrayList3.add(messageTLdeserialize);
                            }
                            j10 = j10;
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        if (!arrayList3.isEmpty()) {
                            if (!arrayList.isEmpty()) {
                                messagesStorage.getUsersInternal(arrayList, arrayList4);
                            }
                            if (!arrayList2.isEmpty()) {
                                messagesStorage.getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                            }
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        break;
                    } catch (Exception e9) {
                        e = e9;
                        sQLiteCursor = null;
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        final int i13 = this.f21371f;
                        final int i14 = i10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                c6.b(c6Var, i13, arrayList3, j11, i14, messagesStorage);
                            }
                        });
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = null;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                    final int i15 = this.f21371f;
                    final int i16 = i10;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            c6.b(c6Var, i15, arrayList3, j11, i16, messagesStorage);
                        }
                    });
                    return;
                }
                try {
                    try {
                        i10 = i12;
                        try {
                            sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j11));
                            try {
                                arrayList = new ArrayList<>();
                                arrayList2 = new ArrayList();
                                while (sQLiteCursorQueryFinalized.next()) {
                                    nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                                    if (nativeByteBufferByteBufferValue != null) {
                                        TLRPC.Message messageTLdeserialize2 = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                        messageTLdeserialize2.readAttachPath(nativeByteBufferByteBufferValue, j10);
                                        nativeByteBufferByteBufferValue.reuse();
                                        messageTLdeserialize2.f22401id = sQLiteCursorQueryFinalized.intValue(1);
                                        messageTLdeserialize2.dialog_id = -j11;
                                        MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize2, arrayList, arrayList2, null);
                                        arrayList3.add(messageTLdeserialize2);
                                    }
                                    j10 = j10;
                                }
                                sQLiteCursorQueryFinalized.dispose();
                                if (!arrayList3.isEmpty()) {
                                    if (!arrayList.isEmpty()) {
                                        messagesStorage.getUsersInternal(arrayList, arrayList4);
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        messagesStorage.getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                                    }
                                }
                                sQLiteCursorQueryFinalized.dispose();
                                break;
                            } catch (Exception e10) {
                                e = e10;
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                                try {
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            sQLiteCursor = null;
                            FileLog.e(e);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            final int i17 = this.f21371f;
                            final int i18 = i10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    c6.b(c6Var, i17, arrayList3, j11, i18, messagesStorage);
                                }
                            });
                            return;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        i10 = i12;
                    }
                    final int i19 = this.f21371f;
                    final int i110 = i10;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            c6.b(c6Var, i19, arrayList3, j11, i110, messagesStorage);
                        }
                    });
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
        }
    }

    public qf(org.telegram.ui.Cells.c6 c6Var, int i10, MessagesStorage messagesStorage, long j10, long j11, int i11) {
        this.h = c6Var;
        this.f21368b = i10;
        this.f21369c = messagesStorage;
        this.d = j10;
        this.f21370e = j11;
        this.f21371f = i11;
    }
}
