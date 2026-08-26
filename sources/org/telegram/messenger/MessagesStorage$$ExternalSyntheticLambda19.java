package org.telegram.messenger;

import android.text.TextUtils;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ProfileChannelCell;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda16;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;

public final class MessagesStorage$$ExternalSyntheticLambda19 implements Runnable {
    public final int $r8$classId = 0;
    public final MessagesStorage f$0;
    public final long f$1;
    public final int f$2;
    public final Object f$3;
    public final int f$4;
    public final long f$5;

    public MessagesStorage$$ExternalSyntheticLambda19(int i, int i2, long j, long j2, MessagesStorage messagesStorage, TLRPC.InputChannel inputChannel) {
        this.f$0 = messagesStorage;
        this.f$1 = j;
        this.f$2 = i;
        this.f$3 = inputChannel;
        this.f$4 = i2;
        this.f$5 = j2;
    }

    @Override
    public final void run() throws Throwable {
        ArrayList arrayList;
        SQLiteCursor sQLiteCursorQueryFinalized;
        ArrayList arrayList2;
        ArrayList<Long> arrayList3;
        ArrayList arrayList4;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        Object obj = this.f$3;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadPendingTasks$22(this.f$1, this.f$2, (TLRPC.InputChannel) obj, this.f$4, this.f$5);
                return;
            default:
                long j = this.f$5;
                final ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher = (ProfileChannelCell.ChannelMessageFetcher) obj;
                channelMessageFetcher.getClass();
                ArrayList arrayList5 = new ArrayList();
                ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                final MessagesStorage messagesStorage = this.f$0;
                final int i = this.f$2;
                final long j2 = this.f$1;
                if (i > 0) {
                    arrayList = arrayList5;
                    try {
                        sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND mid <= ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j2), Integer.valueOf(i));
                        arrayList3 = new ArrayList<>();
                        arrayList4 = new ArrayList();
                        while (sQLiteCursorQueryFinalized.next()) {
                            nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(z ? 1 : 0);
                            if (nativeByteBufferByteBufferValue != null) {
                                TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(z), z);
                                messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, j);
                                nativeByteBufferByteBufferValue.reuse();
                                messageTLdeserialize.id = sQLiteCursorQueryFinalized.intValue(1);
                                long j3 = j;
                                messageTLdeserialize.dialog_id = -j2;
                                MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList3, arrayList4, null);
                                arrayList2 = arrayList;
                                arrayList2.add(messageTLdeserialize);
                                arrayList = arrayList2;
                                j = j3;
                                z = false;
                            }
                        }
                        arrayList2 = arrayList;
                        sQLiteCursorQueryFinalized.dispose();
                        if (!arrayList2.isEmpty()) {
                            if (!arrayList3.isEmpty()) {
                                messagesStorage.getUsersInternal(arrayList3, arrayList6);
                            }
                            if (!arrayList4.isEmpty()) {
                                messagesStorage.getChatsInternal(TextUtils.join(",", arrayList4), arrayList7);
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        arrayList2 = arrayList;
                        sQLiteCursorQueryFinalized = null;
                        FileLog.e(e);
                        if (sQLiteCursorQueryFinalized != null) {
                            sQLiteCursorQueryFinalized.dispose();
                        }
                        final int i2 = this.f$4;
                        final ArrayList arrayList8 = arrayList2;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher2 = channelMessageFetcher;
                                int i3 = channelMessageFetcher2.searchId;
                                int i4 = i2;
                                if (i4 != i3) {
                                    return;
                                }
                                ArrayList arrayList9 = arrayList8;
                                boolean zIsEmpty = arrayList9.isEmpty();
                                int i5 = channelMessageFetcher2.currentAccount;
                                if (!zIsEmpty) {
                                    ArrayList arrayList10 = channelMessageFetcher2.messageObjects;
                                    arrayList10.clear();
                                    Collections.sort(arrayList9, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(4)));
                                    TLRPC.Message message = (TLRPC.Message) arrayList9.get(arrayList9.size() - 1);
                                    long j4 = message.grouped_id;
                                    if (j4 != 0) {
                                        int size = arrayList9.size();
                                        int i6 = 0;
                                        while (i6 < size) {
                                            Object obj2 = arrayList9.get(i6);
                                            i6++;
                                            TLRPC.Message message2 = (TLRPC.Message) obj2;
                                            if (message2.grouped_id == j4) {
                                                arrayList10.add(new MessageObject(i5, message2, false, true));
                                            }
                                        }
                                    } else {
                                        arrayList10.add(new MessageObject(i5, message, false, true));
                                    }
                                    if (!arrayList10.isEmpty()) {
                                        channelMessageFetcher2.done();
                                        return;
                                    }
                                }
                                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                MessagesController messagesController = MessagesController.getInstance(i5);
                                long j5 = j2;
                                tL_channels_getMessages.channel = messagesController.getInputChannel(j5);
                                for (int i7 = 10; i7 >= 0; i7--) {
                                    int i8 = i - i7;
                                    if (i8 >= 0) {
                                        tL_channels_getMessages.id.add(Integer.valueOf(i8));
                                    }
                                }
                                ConnectionsManager.getInstance(i5).sendRequest(tL_channels_getMessages, new AlertsCreator$$ExternalSyntheticLambda16(channelMessageFetcher2, messagesStorage, j5, i4, arrayList9));
                            }
                        });
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursorQueryFinalized = null;
                        if (sQLiteCursorQueryFinalized != null) {
                            sQLiteCursorQueryFinalized.dispose();
                        }
                        throw th;
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    break;
                } else {
                    try {
                        try {
                            arrayList = arrayList5;
                            try {
                                sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? ORDER BY mid DESC LIMIT 10", Long.valueOf(-j2));
                                try {
                                    try {
                                        arrayList3 = new ArrayList<>();
                                        arrayList4 = new ArrayList();
                                        while (sQLiteCursorQueryFinalized.next()) {
                                            nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(z ? 1 : 0);
                                            if (nativeByteBufferByteBufferValue != null) {
                                                TLRPC.Message messageTLdeserialize2 = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(z), z);
                                                messageTLdeserialize2.readAttachPath(nativeByteBufferByteBufferValue, j);
                                                nativeByteBufferByteBufferValue.reuse();
                                                messageTLdeserialize2.id = sQLiteCursorQueryFinalized.intValue(1);
                                                long j4 = j;
                                                messageTLdeserialize2.dialog_id = -j2;
                                                MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize2, arrayList3, arrayList4, null);
                                                arrayList2 = arrayList;
                                                try {
                                                    arrayList2.add(messageTLdeserialize2);
                                                    arrayList = arrayList2;
                                                    j = j4;
                                                    z = false;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    FileLog.e(e);
                                                    if (sQLiteCursorQueryFinalized != null) {
                                                        sQLiteCursorQueryFinalized.dispose();
                                                    }
                                                    final int i3 = this.f$4;
                                                    final ArrayList arrayList9 = arrayList2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher2 = channelMessageFetcher;
                                                            int i4 = channelMessageFetcher2.searchId;
                                                            int i5 = i3;
                                                            if (i5 != i4) {
                                                                return;
                                                            }
                                                            ArrayList arrayList10 = arrayList9;
                                                            boolean zIsEmpty = arrayList10.isEmpty();
                                                            int i6 = channelMessageFetcher2.currentAccount;
                                                            if (!zIsEmpty) {
                                                                ArrayList arrayList11 = channelMessageFetcher2.messageObjects;
                                                                arrayList11.clear();
                                                                Collections.sort(arrayList10, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(4)));
                                                                TLRPC.Message message = (TLRPC.Message) arrayList10.get(arrayList10.size() - 1);
                                                                long j5 = message.grouped_id;
                                                                if (j5 != 0) {
                                                                    int size = arrayList10.size();
                                                                    int i7 = 0;
                                                                    while (i7 < size) {
                                                                        Object obj2 = arrayList10.get(i7);
                                                                        i7++;
                                                                        TLRPC.Message message2 = (TLRPC.Message) obj2;
                                                                        if (message2.grouped_id == j5) {
                                                                            arrayList11.add(new MessageObject(i6, message2, false, true));
                                                                        }
                                                                    }
                                                                } else {
                                                                    arrayList11.add(new MessageObject(i6, message, false, true));
                                                                }
                                                                if (!arrayList11.isEmpty()) {
                                                                    channelMessageFetcher2.done();
                                                                    return;
                                                                }
                                                            }
                                                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                                            MessagesController messagesController = MessagesController.getInstance(i6);
                                                            long j6 = j2;
                                                            tL_channels_getMessages.channel = messagesController.getInputChannel(j6);
                                                            for (int i8 = 10; i8 >= 0; i8--) {
                                                                int i9 = i - i8;
                                                                if (i9 >= 0) {
                                                                    tL_channels_getMessages.id.add(Integer.valueOf(i9));
                                                                }
                                                            }
                                                            ConnectionsManager.getInstance(i6).sendRequest(tL_channels_getMessages, new AlertsCreator$$ExternalSyntheticLambda16(channelMessageFetcher2, messagesStorage, j6, i5, arrayList10));
                                                        }
                                                    });
                                                    return;
                                                }
                                            }
                                        }
                                        arrayList2 = arrayList;
                                        sQLiteCursorQueryFinalized.dispose();
                                        if (!arrayList2.isEmpty()) {
                                            if (!arrayList3.isEmpty()) {
                                                messagesStorage.getUsersInternal(arrayList3, arrayList6);
                                            }
                                            if (!arrayList4.isEmpty()) {
                                                messagesStorage.getChatsInternal(TextUtils.join(",", arrayList4), arrayList7);
                                            }
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        arrayList2 = arrayList;
                                    }
                                    sQLiteCursorQueryFinalized.dispose();
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (sQLiteCursorQueryFinalized != null) {
                                        sQLiteCursorQueryFinalized.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                arrayList2 = arrayList;
                                sQLiteCursorQueryFinalized = null;
                                FileLog.e(e);
                                if (sQLiteCursorQueryFinalized != null) {
                                    sQLiteCursorQueryFinalized.dispose();
                                }
                                final int i4 = this.f$4;
                                final ArrayList arrayList10 = arrayList2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher2 = channelMessageFetcher;
                                        int i5 = channelMessageFetcher2.searchId;
                                        int i6 = i4;
                                        if (i6 != i5) {
                                            return;
                                        }
                                        ArrayList arrayList11 = arrayList10;
                                        boolean zIsEmpty = arrayList11.isEmpty();
                                        int i7 = channelMessageFetcher2.currentAccount;
                                        if (!zIsEmpty) {
                                            ArrayList arrayList12 = channelMessageFetcher2.messageObjects;
                                            arrayList12.clear();
                                            Collections.sort(arrayList11, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(4)));
                                            TLRPC.Message message = (TLRPC.Message) arrayList11.get(arrayList11.size() - 1);
                                            long j5 = message.grouped_id;
                                            if (j5 != 0) {
                                                int size = arrayList11.size();
                                                int i8 = 0;
                                                while (i8 < size) {
                                                    Object obj2 = arrayList11.get(i8);
                                                    i8++;
                                                    TLRPC.Message message2 = (TLRPC.Message) obj2;
                                                    if (message2.grouped_id == j5) {
                                                        arrayList12.add(new MessageObject(i7, message2, false, true));
                                                    }
                                                }
                                            } else {
                                                arrayList12.add(new MessageObject(i7, message, false, true));
                                            }
                                            if (!arrayList12.isEmpty()) {
                                                channelMessageFetcher2.done();
                                                return;
                                            }
                                        }
                                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                        MessagesController messagesController = MessagesController.getInstance(i7);
                                        long j6 = j2;
                                        tL_channels_getMessages.channel = messagesController.getInputChannel(j6);
                                        for (int i9 = 10; i9 >= 0; i9--) {
                                            int i10 = i - i9;
                                            if (i10 >= 0) {
                                                tL_channels_getMessages.id.add(Integer.valueOf(i10));
                                            }
                                        }
                                        ConnectionsManager.getInstance(i7).sendRequest(tL_channels_getMessages, new AlertsCreator$$ExternalSyntheticLambda16(channelMessageFetcher2, messagesStorage, j6, i6, arrayList11));
                                    }
                                });
                                return;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursorQueryFinalized = null;
                            if (sQLiteCursorQueryFinalized != null) {
                                sQLiteCursorQueryFinalized.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        arrayList = arrayList5;
                    }
                    break;
                }
                final int i5 = this.f$4;
                final ArrayList arrayList11 = arrayList2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher2 = channelMessageFetcher;
                        int i6 = channelMessageFetcher2.searchId;
                        int i7 = i5;
                        if (i7 != i6) {
                            return;
                        }
                        ArrayList arrayList12 = arrayList11;
                        boolean zIsEmpty = arrayList12.isEmpty();
                        int i8 = channelMessageFetcher2.currentAccount;
                        if (!zIsEmpty) {
                            ArrayList arrayList13 = channelMessageFetcher2.messageObjects;
                            arrayList13.clear();
                            Collections.sort(arrayList12, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(4)));
                            TLRPC.Message message = (TLRPC.Message) arrayList12.get(arrayList12.size() - 1);
                            long j5 = message.grouped_id;
                            if (j5 != 0) {
                                int size = arrayList12.size();
                                int i9 = 0;
                                while (i9 < size) {
                                    Object obj2 = arrayList12.get(i9);
                                    i9++;
                                    TLRPC.Message message2 = (TLRPC.Message) obj2;
                                    if (message2.grouped_id == j5) {
                                        arrayList13.add(new MessageObject(i8, message2, false, true));
                                    }
                                }
                            } else {
                                arrayList13.add(new MessageObject(i8, message, false, true));
                            }
                            if (!arrayList13.isEmpty()) {
                                channelMessageFetcher2.done();
                                return;
                            }
                        }
                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                        MessagesController messagesController = MessagesController.getInstance(i8);
                        long j6 = j2;
                        tL_channels_getMessages.channel = messagesController.getInputChannel(j6);
                        for (int i10 = 10; i10 >= 0; i10--) {
                            int i11 = i - i10;
                            if (i11 >= 0) {
                                tL_channels_getMessages.id.add(Integer.valueOf(i11));
                            }
                        }
                        ConnectionsManager.getInstance(i8).sendRequest(tL_channels_getMessages, new AlertsCreator$$ExternalSyntheticLambda16(channelMessageFetcher2, messagesStorage, j6, i7, arrayList12));
                    }
                });
                return;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda19(ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher, int i, MessagesStorage messagesStorage, long j, long j2, int i2) {
        this.f$3 = channelMessageFetcher;
        this.f$2 = i;
        this.f$0 = messagesStorage;
        this.f$1 = j;
        this.f$5 = j2;
        this.f$4 = i2;
    }
}
