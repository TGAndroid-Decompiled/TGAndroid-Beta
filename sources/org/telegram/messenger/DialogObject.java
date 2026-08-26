package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;

public class DialogObject {
    public static int editDistance(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        int[] iArr = new int[lowerCase2.length() + 1];
        for (int i = 0; i <= lowerCase.length(); i++) {
            int i2 = i;
            for (int i3 = 0; i3 <= lowerCase2.length(); i3++) {
                if (i == 0) {
                    iArr[i3] = i3;
                } else if (i3 > 0) {
                    int i4 = i3 - 1;
                    int iMin = iArr[i4];
                    if (lowerCase.charAt(i - 1) != lowerCase2.charAt(i4)) {
                        iMin = Math.min(Math.min(iMin, i2), iArr[i3]) + 1;
                    }
                    iArr[i4] = i2;
                    i2 = iMin;
                }
            }
            if (i > 0) {
                iArr[lowerCase2.length()] = i2;
            }
        }
        return iArr[lowerCase2.length()];
    }

    public static boolean emojiStatusesEqual(TLRPC.EmojiStatus emojiStatus, TLRPC.EmojiStatus emojiStatus2) {
        return getEmojiStatusDocumentId(emojiStatus) == getEmojiStatusDocumentId(emojiStatus2) && getEmojiStatusCollectibleId(emojiStatus) == getEmojiStatusCollectibleId(emojiStatus2) && getEmojiStatusUntil(emojiStatus) == getEmojiStatusUntil(emojiStatus2);
    }

    public static TLRPC.EmojiStatus filterEmojiStatus(TLRPC.EmojiStatus emojiStatus) {
        int emojiStatusUntil = getEmojiStatusUntil(emojiStatus);
        if (emojiStatusUntil == 0 || emojiStatusUntil > ((int) (System.currentTimeMillis() / 1000))) {
            return emojiStatus;
        }
        return null;
    }

    public static TLRPC.TL_username findUsername(String str, TLRPC.User user) {
        if (user == null) {
            return null;
        }
        return findUsername(str, user.usernames);
    }

    public static TL_bots.botVerification getBotVerification(TLObject tLObject) {
        if (tLObject instanceof TLRPC.UserFull) {
            return ((TLRPC.UserFull) tLObject).bot_verification;
        }
        if (tLObject instanceof TLRPC.ChatFull) {
            return ((TLRPC.ChatFull) tLObject).bot_verification;
        }
        return null;
    }

    public static long getBotVerificationIcon(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).bot_verification_icon;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).bot_verification_icon;
        }
        return 0L;
    }

    public static long getDialogId(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return -((TLRPC.Chat) tLObject).id;
        }
        return 0L;
    }

    public static String getDialogTitle(TLObject tLObject) {
        return setDialogPhotoTitle(null, null, tLObject);
    }

    public static long getEmojiStatusCollectibleId(TLRPC.EmojiStatus emojiStatus) {
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return 0L;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
            return tL_emojiStatusCollectible.collectible_id;
        }
        return 0L;
    }

    public static long getEmojiStatusDocumentId(long j) {
        if (j >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
            if (user == null) {
                return 0L;
            }
            return getEmojiStatusDocumentId(user.emoji_status);
        }
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j));
        if (chat == null) {
            return 0L;
        }
        return getEmojiStatusDocumentId(chat.emoji_status);
    }

    public static int getEmojiStatusUntil(TLRPC.EmojiStatus emojiStatus) {
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0) {
                return tL_emojiStatus.until;
            }
            return 0;
        }
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return 0;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        if ((tL_emojiStatusCollectible.flags & 1) != 0) {
            return tL_emojiStatusCollectible.until;
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

    public static long getMessagesStarsPrice(TL_account.RequirementToContact requirementToContact) {
        if (requirementToContact instanceof TL_account.requirementToContactPaidMessages) {
            return ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount;
        }
        return 0L;
    }

    public static String getName(long j) {
        return getName(UserConfig.selectedAccount, j);
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
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            return getPublicUsername(chat.username, chat.usernames, false);
        }
        if (!(tLObject instanceof TLRPC.User)) {
            return null;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        return getPublicUsername(user.username, user.usernames, false);
    }

    public static String getShortName(int i, long j) {
        return getShortName(MessagesController.getInstance(i).getUserOrChat(j));
    }

    public static String getShortTitle(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return UserObject.getForcedFirstName((TLRPC.User) tLObject);
        }
        return tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
    }

    public static String getSimilarPublicUsername(String str, ArrayList<TLRPC.TL_username> arrayList, String str2) {
        double d = -1.0d;
        String str3 = null;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.TL_username tL_username = arrayList.get(i);
                if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username)) {
                    double dSimilarity = d < 0.0d ? 0.0d : similarity(tL_username.username, str2);
                    if (dSimilarity > d) {
                        str3 = tL_username.username;
                        d = dSimilarity;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if ((d >= 0.0d ? similarity(str, str2) : 0.0d) > d) {
                return str;
            }
        }
        return str3;
    }

    public static String getStatus(long j) {
        return getStatus(UserConfig.selectedAccount, j);
    }

    public static boolean hasPhoto(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).photo != null;
        }
        return (tLObject instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).photo != null;
    }

    public static void initDialog(TLRPC.Dialog dialog) {
        if (dialog == null || dialog.id != 0) {
            return;
        }
        if (!(dialog instanceof TLRPC.TL_dialog)) {
            if (dialog instanceof TLRPC.TL_dialogFolder) {
                dialog.id = makeFolderDialogId(((TLRPC.TL_dialogFolder) dialog).folder.id);
                return;
            } else {
                if (dialog instanceof TLRPC.TL_dialogCommunity) {
                    dialog.id = -dialog.community_id;
                    return;
                }
                return;
            }
        }
        TLRPC.Peer peer = dialog.peer;
        if (peer == null) {
            return;
        }
        long j = peer.user_id;
        if (j != 0) {
            dialog.id = j;
            return;
        }
        long j2 = peer.chat_id;
        if (j2 != 0) {
            dialog.id = -j2;
        } else {
            dialog.id = -peer.channel_id;
        }
    }

    public static boolean isChannel(TLRPC.Dialog dialog) {
        return (dialog == null || (dialog.flags & 1) == 0) ? false : true;
    }

    public static boolean isChatDialog(long j) {
        return (isEncryptedDialog(j) || isFolderDialogId(j) || j >= 0) ? false : true;
    }

    public static boolean isEmojiStatusCollectible(long j) {
        if (j >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
            if (user == null) {
                return false;
            }
            return isEmojiStatusCollectible(user.emoji_status);
        }
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j));
        if (chat == null) {
            return false;
        }
        return isEmojiStatusCollectible(chat.emoji_status);
    }

    public static boolean isEmpty(TL_account.RequirementToContact requirementToContact) {
        return requirementToContact == null || (requirementToContact instanceof TL_account.requirementToContactEmpty);
    }

    public static boolean isEncryptedDialog(long j) {
        return (4611686018427387904L & j) != 0 && (j & Long.MIN_VALUE) == 0;
    }

    public static boolean isFolderDialogId(long j) {
        return (2305843009213693952L & j) != 0 && (j & Long.MIN_VALUE) == 0;
    }

    public static boolean isPremiumBlocked(TL_account.RequirementToContact requirementToContact) {
        return requirementToContact instanceof TL_account.requirementToContactPremium;
    }

    public static boolean isUserDialog(long j) {
        return (isEncryptedDialog(j) || isFolderDialogId(j) || j <= 0) ? false : true;
    }

    public static long makeEncryptedDialogId(long j) {
        return (j & 4294967295L) | 4611686018427387904L;
    }

    public static long makeFolderDialogId(int i) {
        return ((long) i) | 2305843009213693952L;
    }

    public static String setDialogPhotoTitle(ImageReceiver imageReceiver, AvatarDrawable avatarDrawable, TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.User)) {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return "";
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str = chat.title;
            if (avatarDrawable != null) {
                avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
            }
            if (imageReceiver != null) {
                imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            }
            return str;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (UserObject.isReplyUser(user)) {
            String string = LocaleController.getString(R.string.RepliesTitle);
            if (avatarDrawable != null) {
                avatarDrawable.setAvatarType(12);
            }
            if (imageReceiver != null) {
                imageReceiver.setForUserOrChat(null, avatarDrawable);
            }
            return string;
        }
        if (UserObject.isUserSelf(user)) {
            String string2 = LocaleController.getString(R.string.SavedMessages);
            if (avatarDrawable != null) {
                avatarDrawable.setAvatarType(1);
            }
            if (imageReceiver != null) {
                imageReceiver.setForUserOrChat(null, avatarDrawable);
            }
            return string2;
        }
        String userName = UserObject.getUserName(user);
        if (avatarDrawable != null) {
            avatarDrawable.setInfo(UserConfig.selectedAccount, user);
        }
        if (imageReceiver != null) {
            imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
        }
        return userName;
    }

    public static double similarity(String str, String str2) {
        if (str.length() < str2.length()) {
            str2 = str;
            str = str2;
        }
        int length = str.length();
        if (length == 0) {
            return 1.0d;
        }
        return ((double) (length - editDistance(str, str2))) / ((double) length);
    }

    public static TLRPC.TL_username findUsername(String str, TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        return findUsername(str, chat.usernames);
    }

    public static String getName(int i, long j) {
        return getName(MessagesController.getInstance(i).getUserOrChat(j));
    }

    public static String getShortName(long j) {
        return getShortName(MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j));
    }

    public static String getStatus(int i, long j) {
        return getStatus(i, MessagesController.getInstance(i).getUserOrChat(j));
    }

    public static TLRPC.TL_username findUsername(String str, ArrayList<TLRPC.TL_username> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_username tL_username = arrayList.get(i);
            i++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2 != null && TextUtils.equals(tL_username2.username, str)) {
                return tL_username2;
            }
        }
        return null;
    }

    public static String getName(TLObject tLObject) {
        TLRPC.Chat chat;
        if (tLObject instanceof TLRPC.User) {
            return AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName((TLRPC.User) tLObject)));
        }
        return (!(tLObject instanceof TLRPC.Chat) || (chat = (TLRPC.Chat) tLObject) == null) ? "" : chat.title;
    }

    public static String getShortName(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getForcedFirstName((TLRPC.User) tLObject)));
        }
        if (!(tLObject instanceof TLRPC.Chat)) {
            return "";
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        return AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat != null ? chat.title : ""));
    }

    public static String getStatus(int i, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return LocaleController.formatUserStatus(i, (TLRPC.User) tLObject, null, null);
        }
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            if (chat.participants_count > 1) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return LocaleController.formatPluralStringComma("Subscribers", chat.participants_count);
                }
                return LocaleController.formatPluralStringComma("Members", chat.participants_count);
            }
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                return LocaleController.getString(R.string.DiscussChannel);
            }
            return LocaleController.getString(R.string.AccDescrGroup);
        }
        return "";
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

    public static long getEmojiStatusDocumentId(TLRPC.EmojiStatus emojiStatus) {
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                return tL_emojiStatus.document_id;
            }
            return 0L;
        }
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return 0L;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
            return tL_emojiStatusCollectible.document_id;
        }
        return 0L;
    }

    public static boolean isEmojiStatusCollectible(TLRPC.EmojiStatus emojiStatus) {
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return false;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        return (tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000));
    }

    public static String getPublicUsername(TLObject tLObject, String str) {
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            return str == null ? getPublicUsername(chat.username, chat.usernames, false) : getSimilarPublicUsername(chat.username, chat.usernames, str);
        }
        if (!(tLObject instanceof TLRPC.User)) {
            return null;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        return str == null ? getPublicUsername(user.username, user.usernames, false) : getSimilarPublicUsername(user.username, user.usernames, str);
    }

    public static String getPublicUsername(String str, ArrayList<TLRPC.TL_username> arrayList, boolean z) {
        if (TextUtils.isEmpty(str) || z) {
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.TL_username tL_username = arrayList.get(i);
                    if (tL_username != null && (((tL_username.active && !z) || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                        return tL_username.username;
                    }
                }
            }
            if (TextUtils.isEmpty(str) || !z) {
                return null;
            }
            if (arrayList != null && arrayList.size() > 0) {
                return null;
            }
        }
        return str;
    }

    public static String setDialogPhotoTitle(BackupImageView backupImageView, TLObject tLObject) {
        if (backupImageView != null) {
            return setDialogPhotoTitle(backupImageView.getImageReceiver(), backupImageView.getAvatarDrawable(), tLObject);
        }
        return setDialogPhotoTitle(null, null, tLObject);
    }
}
