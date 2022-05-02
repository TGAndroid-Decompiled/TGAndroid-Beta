package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$DraftMessage;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_dialog;
import org.telegram.tgnet.TLRPC$TL_dialogFolder;

public class DialogObject {
    public static int getEncryptedChatId(long j) {
        return (int) (j & 4294967295L);
    }

    public static int getFolderId(long j) {
        return (int) j;
    }

    public static boolean isEncryptedDialog(long j) {
        return (4611686018427387904L & j) != 0 && (j & Long.MIN_VALUE) == 0;
    }

    public static boolean isFolderDialogId(long j) {
        return (2305843009213693952L & j) != 0 && (j & Long.MIN_VALUE) == 0;
    }

    public static long makeEncryptedDialogId(long j) {
        return (j & 4294967295L) | 4611686018427387904L;
    }

    public static long makeFolderDialogId(int i) {
        return i | 2305843009213693952L;
    }

    public static boolean isChannel(TLRPC$Dialog tLRPC$Dialog) {
        return (tLRPC$Dialog == null || (tLRPC$Dialog.flags & 1) == 0) ? false : true;
    }

    public static void initDialog(TLRPC$Dialog tLRPC$Dialog) {
        if (tLRPC$Dialog != null && tLRPC$Dialog.f849id == 0) {
            if (tLRPC$Dialog instanceof TLRPC$TL_dialog) {
                TLRPC$Peer tLRPC$Peer = tLRPC$Dialog.peer;
                if (tLRPC$Peer != null) {
                    long j = tLRPC$Peer.user_id;
                    if (j != 0) {
                        tLRPC$Dialog.f849id = j;
                        return;
                    }
                    long j2 = tLRPC$Peer.chat_id;
                    if (j2 != 0) {
                        tLRPC$Dialog.f849id = -j2;
                    } else {
                        tLRPC$Dialog.f849id = -tLRPC$Peer.channel_id;
                    }
                }
            } else if (tLRPC$Dialog instanceof TLRPC$TL_dialogFolder) {
                tLRPC$Dialog.f849id = makeFolderDialogId(((TLRPC$TL_dialogFolder) tLRPC$Dialog).folder.f894id);
            }
        }
    }

    public static long getPeerDialogId(TLRPC$Peer tLRPC$Peer) {
        if (tLRPC$Peer == null) {
            return 0L;
        }
        long j = tLRPC$Peer.user_id;
        if (j != 0) {
            return j;
        }
        long j2 = tLRPC$Peer.chat_id;
        return j2 != 0 ? -j2 : -tLRPC$Peer.channel_id;
    }

    public static long getPeerDialogId(TLRPC$InputPeer tLRPC$InputPeer) {
        if (tLRPC$InputPeer == null) {
            return 0L;
        }
        long j = tLRPC$InputPeer.user_id;
        if (j != 0) {
            return j;
        }
        long j2 = tLRPC$InputPeer.chat_id;
        return j2 != 0 ? -j2 : -tLRPC$InputPeer.channel_id;
    }

    public static long getLastMessageOrDraftDate(TLRPC$Dialog tLRPC$Dialog, TLRPC$DraftMessage tLRPC$DraftMessage) {
        int i;
        return (tLRPC$DraftMessage == null || (i = tLRPC$DraftMessage.date) < tLRPC$Dialog.last_message_date) ? tLRPC$Dialog.last_message_date : i;
    }

    public static boolean isChatDialog(long j) {
        return !isEncryptedDialog(j) && !isFolderDialogId(j) && j < 0;
    }

    public static boolean isUserDialog(long j) {
        return !isEncryptedDialog(j) && !isFolderDialogId(j) && j > 0;
    }
}
