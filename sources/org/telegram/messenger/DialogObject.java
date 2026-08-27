package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;

public class DialogObject {
    public static int editDistance(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        int[] iArr = new int[lowerCase2.length() + 1];
        for (int i10 = 0; i10 <= lowerCase.length(); i10++) {
            int i11 = i10;
            for (int i12 = 0; i12 <= lowerCase2.length(); i12++) {
                if (i10 == 0) {
                    iArr[i12] = i12;
                } else if (i12 > 0) {
                    int i13 = i12 - 1;
                    int iMin = iArr[i13];
                    if (lowerCase.charAt(i10 - 1) != lowerCase2.charAt(i13)) {
                        iMin = Math.min(Math.min(iMin, i11), iArr[i12]) + 1;
                    }
                    iArr[i13] = i11;
                    i11 = iMin;
                }
            }
            if (i10 > 0) {
                iArr[lowerCase2.length()] = i11;
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
            return ((TLRPC.User) tLObject).f22527id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return -((TLRPC.Chat) tLObject).f22380id;
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

    public static long getEmojiStatusDocumentId(long j10) {
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
            if (user == null) {
                return 0L;
            }
            return getEmojiStatusDocumentId(user.emoji_status);
        }
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
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

    public static int getEncryptedChatId(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int getFolderId(long j10) {
        return (int) j10;
    }

    public static long getLastMessageOrDraftDate(TLRPC.Dialog dialog, TLRPC.DraftMessage draftMessage) {
        int i10;
        return (draftMessage == null || (i10 = draftMessage.date) < dialog.last_message_date) ? dialog.last_message_date : i10;
    }

    public static long getMessagesStarsPrice(TL_account.RequirementToContact requirementToContact) {
        if (requirementToContact instanceof TL_account.requirementToContactPaidMessages) {
            return ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount;
        }
        return 0L;
    }

    public static String getName(long j10) {
        return getName(UserConfig.selectedAccount, j10);
    }

    public static long getPeerDialogId(TLRPC.Peer peer) {
        if (peer == null) {
            return 0L;
        }
        long j10 = peer.user_id;
        if (j10 != 0) {
            return j10;
        }
        long j11 = peer.chat_id;
        return j11 != 0 ? -j11 : -peer.channel_id;
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

    public static String getShortName(int i10, long j10) {
        return getShortName(MessagesController.getInstance(i10).getUserOrChat(j10));
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
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_username tL_username = arrayList.get(i10);
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

    public static String getStatus(long j10) {
        return getStatus(UserConfig.selectedAccount, j10);
    }

    public static boolean hasPhoto(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).photo != null;
        }
        return (tLObject instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).photo != null;
    }

    public static void initDialog(TLRPC.Dialog dialog) {
        if (dialog == null || dialog.f22384id != 0) {
            return;
        }
        if (!(dialog instanceof TLRPC.TL_dialog)) {
            if (dialog instanceof TLRPC.TL_dialogFolder) {
                dialog.f22384id = makeFolderDialogId(((TLRPC.TL_dialogFolder) dialog).folder.f22431id);
                return;
            } else {
                if (dialog instanceof TLRPC.TL_dialogCommunity) {
                    dialog.f22384id = -dialog.community_id;
                    return;
                }
                return;
            }
        }
        TLRPC.Peer peer = dialog.peer;
        if (peer == null) {
            return;
        }
        long j10 = peer.user_id;
        if (j10 != 0) {
            dialog.f22384id = j10;
            return;
        }
        long j11 = peer.chat_id;
        if (j11 != 0) {
            dialog.f22384id = -j11;
        } else {
            dialog.f22384id = -peer.channel_id;
        }
    }

    public static boolean isChannel(TLRPC.Dialog dialog) {
        return (dialog == null || (dialog.flags & 1) == 0) ? false : true;
    }

    public static boolean isChatDialog(long j10) {
        return (isEncryptedDialog(j10) || isFolderDialogId(j10) || j10 >= 0) ? false : true;
    }

    public static boolean isEmojiStatusCollectible(long j10) {
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
            if (user == null) {
                return false;
            }
            return isEmojiStatusCollectible(user.emoji_status);
        }
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
        if (chat == null) {
            return false;
        }
        return isEmojiStatusCollectible(chat.emoji_status);
    }

    public static boolean isEmpty(TL_account.RequirementToContact requirementToContact) {
        return requirementToContact == null || (requirementToContact instanceof TL_account.requirementToContactEmpty);
    }

    public static boolean isEncryptedDialog(long j10) {
        return (4611686018427387904L & j10) != 0 && (j10 & Long.MIN_VALUE) == 0;
    }

    public static boolean isFolderDialogId(long j10) {
        return (2305843009213693952L & j10) != 0 && (j10 & Long.MIN_VALUE) == 0;
    }

    public static boolean isPremiumBlocked(TL_account.RequirementToContact requirementToContact) {
        return requirementToContact instanceof TL_account.requirementToContactPremium;
    }

    public static boolean isUserDialog(long j10) {
        return (isEncryptedDialog(j10) || isFolderDialogId(j10) || j10 <= 0) ? false : true;
    }

    public static long makeEncryptedDialogId(long j10) {
        return (j10 & 4294967295L) | 4611686018427387904L;
    }

    public static long makeFolderDialogId(int i10) {
        return 2305843009213693952L | ((long) i10);
    }

    public static String setDialogPhotoTitle(ImageReceiver imageReceiver, org.telegram.ui.Components.y8 y8Var, TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.User)) {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return "";
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str = chat.title;
            if (y8Var != null) {
                y8Var.q(chat);
            }
            if (imageReceiver != null) {
                imageReceiver.setForUserOrChat(tLObject, y8Var);
            }
            return str;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (UserObject.isReplyUser(user)) {
            String string = LocaleController.getString(R.string.RepliesTitle);
            if (y8Var != null) {
                y8Var.g(12);
            }
            if (imageReceiver != null) {
                imageReceiver.setForUserOrChat(null, y8Var);
            }
            return string;
        }
        if (UserObject.isUserSelf(user)) {
            String string2 = LocaleController.getString(R.string.SavedMessages);
            if (y8Var != null) {
                y8Var.g(1);
            }
            if (imageReceiver != null) {
                imageReceiver.setForUserOrChat(null, y8Var);
            }
            return string2;
        }
        String userName = UserObject.getUserName(user);
        if (y8Var != null) {
            y8Var.r(user);
        }
        if (imageReceiver != null) {
            imageReceiver.setForUserOrChat(tLObject, y8Var);
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

    public static String getName(int i10, long j10) {
        return getName(MessagesController.getInstance(i10).getUserOrChat(j10));
    }

    public static String getShortName(long j10) {
        return getShortName(MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j10));
    }

    public static String getStatus(int i10, long j10) {
        return getStatus(i10, MessagesController.getInstance(i10).getUserOrChat(j10));
    }

    public static TLRPC.TL_username findUsername(String str, ArrayList<TLRPC.TL_username> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i10);
            i10++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2 != null && TextUtils.equals(tL_username2.username, str)) {
                return tL_username2;
            }
        }
        return null;
    }

    public static String getName(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName((TLRPC.User) tLObject)));
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).title;
        }
        return "";
    }

    public static String getShortName(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getForcedFirstName((TLRPC.User) tLObject)));
        }
        if (tLObject instanceof TLRPC.Chat) {
            return AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(((TLRPC.Chat) tLObject).title));
        }
        return "";
    }

    public static String getStatus(int i10, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return LocaleController.formatUserStatus(i10, (TLRPC.User) tLObject, null, null);
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
        long j10 = inputPeer.user_id;
        if (j10 != 0) {
            return j10;
        }
        long j11 = inputPeer.chat_id;
        return j11 != 0 ? -j11 : -inputPeer.channel_id;
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

    public static String getPublicUsername(String str, ArrayList<TLRPC.TL_username> arrayList, boolean z10) {
        if (TextUtils.isEmpty(str) || z10) {
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = arrayList.get(i10);
                    if (tL_username != null && (((tL_username.active && !z10) || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                        return tL_username.username;
                    }
                }
            }
            if (TextUtils.isEmpty(str) || !z10) {
                return null;
            }
            if (arrayList != null && arrayList.size() > 0) {
                return null;
            }
        }
        return str;
    }

    public static String setDialogPhotoTitle(org.telegram.ui.Components.n9 n9Var, TLObject tLObject) {
        if (n9Var != null) {
            return setDialogPhotoTitle(n9Var.getImageReceiver(), n9Var.getAvatarDrawable(), tLObject);
        }
        return setDialogPhotoTitle(null, null, tLObject);
    }
}
