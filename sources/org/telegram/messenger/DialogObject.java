package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.BackupImageView;

public class DialogObject {
    public static boolean emojiStatusesEqual(TLRPC.EmojiStatus emojiStatus, TLRPC.EmojiStatus emojiStatus2) {
        return getEmojiStatusDocumentId(emojiStatus) == getEmojiStatusDocumentId(emojiStatus2) && getEmojiStatusUntil(emojiStatus) == getEmojiStatusUntil(emojiStatus2);
    }

    public static TLRPC.TL_username findUsername(String str, ArrayList<TLRPC.TL_username> arrayList) {
        if (arrayList == null) {
            return null;
        }
        Iterator<TLRPC.TL_username> it = arrayList.iterator();
        while (it.hasNext()) {
            TLRPC.TL_username next = it.next();
            if (next != null && TextUtils.equals(next.username, str)) {
                return next;
            }
        }
        return null;
    }

    public static TLRPC.TL_username findUsername(String str, TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        return findUsername(str, chat.usernames);
    }

    public static TLRPC.TL_username findUsername(String str, TLRPC.User user) {
        if (user == null) {
            return null;
        }
        return findUsername(str, user.usernames);
    }

    public static String getDialogTitle(TLObject tLObject) {
        return setDialogPhotoTitle(null, null, tLObject);
    }

    public static long getEmojiStatusDocumentId(TLRPC.EmojiStatus emojiStatus) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            return 0L;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            return ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatusUntil) {
            TLRPC.TL_emojiStatusUntil tL_emojiStatusUntil = (TLRPC.TL_emojiStatusUntil) emojiStatus;
            if (tL_emojiStatusUntil.until > ((int) (System.currentTimeMillis() / 1000))) {
                return tL_emojiStatusUntil.document_id;
            }
        }
        return 0L;
    }

    public static int getEmojiStatusUntil(TLRPC.EmojiStatus emojiStatus) {
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusUntil)) {
            return 0;
        }
        TLRPC.TL_emojiStatusUntil tL_emojiStatusUntil = (TLRPC.TL_emojiStatusUntil) emojiStatus;
        if (tL_emojiStatusUntil.until > ((int) (System.currentTimeMillis() / 1000))) {
            return tL_emojiStatusUntil.until;
        }
        return 0;
    }

    public static int getEncryptedChatId(long j) {
        return (int) (j & 4294967295L);
    }

    public static int getFolderId(long j) {
        return (int) j;
    }

    public static long getLastMessageOrDraftDate(TLRPC.Dialog dialog, TLRPC.DraftMessage draftMessage) {
        int i;
        return (draftMessage == null || (i = draftMessage.date) < dialog.last_message_date) ? dialog.last_message_date : i;
    }

    public static long getPeerDialogId(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            return 0L;
        }
        long j = inputPeer.user_id;
        if (j != 0) {
            return j;
        }
        long j2 = inputPeer.chat_id;
        return j2 != 0 ? -j2 : -inputPeer.channel_id;
    }

    public static long getPeerDialogId(TLRPC.Peer peer) {
        if (peer == null) {
            return 0L;
        }
        long j = peer.user_id;
        if (j != 0) {
            return j;
        }
        long j2 = peer.chat_id;
        return j2 != 0 ? -j2 : -peer.channel_id;
    }

    public static String getPublicUsername(TLObject tLObject) {
        if (tLObject instanceof TLRPC.Chat) {
            return ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
        }
        if (tLObject instanceof TLRPC.User) {
            return UserObject.getPublicUsername((TLRPC.User) tLObject);
        }
        return null;
    }

    public static void initDialog(TLRPC.Dialog dialog) {
        long makeFolderDialogId;
        if (dialog == null || dialog.id != 0) {
            return;
        }
        if (dialog instanceof TLRPC.TL_dialog) {
            TLRPC.Peer peer = dialog.peer;
            if (peer == null) {
                return;
            }
            long j = peer.user_id;
            if (j != 0) {
                dialog.id = j;
                return;
            } else {
                long j2 = peer.chat_id;
                makeFolderDialogId = j2 != 0 ? -j2 : -peer.channel_id;
            }
        } else if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
            return;
        } else {
            makeFolderDialogId = makeFolderDialogId(((TLRPC.TL_dialogFolder) dialog).folder.id);
        }
        dialog.id = makeFolderDialogId;
    }

    public static boolean isChannel(TLRPC.Dialog dialog) {
        return (dialog == null || (dialog.flags & 1) == 0) ? false : true;
    }

    public static boolean isChatDialog(long j) {
        return (isEncryptedDialog(j) || isFolderDialogId(j) || j >= 0) ? false : true;
    }

    public static boolean isEncryptedDialog(long j) {
        return (4611686018427387904L & j) != 0 && (j & Long.MIN_VALUE) == 0;
    }

    public static boolean isFolderDialogId(long j) {
        return (2305843009213693952L & j) != 0 && (j & Long.MIN_VALUE) == 0;
    }

    public static boolean isUserDialog(long j) {
        return (isEncryptedDialog(j) || isFolderDialogId(j) || j <= 0) ? false : true;
    }

    public static long makeEncryptedDialogId(long j) {
        return (j & 4294967295L) | 4611686018427387904L;
    }

    public static long makeFolderDialogId(int i) {
        return i | 2305843009213693952L;
    }

    public static java.lang.String setDialogPhotoTitle(org.telegram.messenger.ImageReceiver r2, org.telegram.ui.Components.AvatarDrawable r3, org.telegram.tgnet.TLObject r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.DialogObject.setDialogPhotoTitle(org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.AvatarDrawable, org.telegram.tgnet.TLObject):java.lang.String");
    }

    public static String setDialogPhotoTitle(BackupImageView backupImageView, TLObject tLObject) {
        return backupImageView != null ? setDialogPhotoTitle(backupImageView.getImageReceiver(), backupImageView.getAvatarDrawable(), tLObject) : setDialogPhotoTitle(null, null, tLObject);
    }
}
