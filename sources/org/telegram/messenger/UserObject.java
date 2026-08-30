package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public class UserObject {
    public static final long ANONYMOUS = 2666000;
    public static final long OAUTH = 489001;
    public static final long REPLY_BOT = 1271266957;
    public static final long VERIFY = 489000;

    public static boolean applyRequirementToContact(TLRPC.User user, TL_account.RequirementToContact requirementToContact) {
        if (user == null) {
            return false;
        }
        if (requirementToContact instanceof TL_account.requirementToContactEmpty) {
            if (!user.contact_require_premium && user.send_paid_messages_stars == 0) {
                return false;
            }
            user.contact_require_premium = false;
            user.flags2 &= -16385;
            user.send_paid_messages_stars = 0L;
        } else if (requirementToContact instanceof TL_account.requirementToContactPremium) {
            if (user.contact_require_premium && user.send_paid_messages_stars == 0) {
                return false;
            }
            user.contact_require_premium = true;
            user.flags2 &= -16385;
            user.send_paid_messages_stars = 0L;
        } else if (!(requirementToContact instanceof TL_account.requirementToContactPaidMessages)) {
            return false;
        } else {
            long j10 = ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount;
            if (!user.contact_require_premium && user.send_paid_messages_stars == j10) {
                return false;
            }
            user.contact_require_premium = false;
            user.flags2 |= 16384;
            user.send_paid_messages_stars = j10;
        }
        return true;
    }

    public static boolean areGiftsDisabled(long j10) {
        return areGiftsDisabled(MessagesController.getInstance(UserConfig.selectedAccount).getUserFull(j10));
    }

    public static boolean eq(TL_account.RequirementToContact requirementToContact, TL_account.RequirementToContact requirementToContact2) {
        if (requirementToContact instanceof TL_account.requirementToContactEmpty) {
            requirementToContact = null;
        }
        if (requirementToContact2 instanceof TL_account.requirementToContactEmpty) {
            requirementToContact2 = null;
        }
        if (requirementToContact == null && requirementToContact2 == null) {
            return true;
        }
        if (requirementToContact != null && requirementToContact2 != null) {
            if ((requirementToContact instanceof TL_account.requirementToContactPremium) && (requirementToContact2 instanceof TL_account.requirementToContactPremium)) {
                return true;
            }
            if ((requirementToContact instanceof TL_account.requirementToContactPaidMessages) && (requirementToContact2 instanceof TL_account.requirementToContactPaidMessages) && ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount == ((TL_account.requirementToContactPaidMessages) requirementToContact2).stars_amount) {
                return true;
            }
        }
        return false;
    }

    public static int getColorId(TLRPC.User user) {
        if (user == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = user.color;
        if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0) {
            return peerColor.color;
        }
        return (int) (user.f19331id % 7);
    }

    public static long getEmojiId(TLRPC.User user) {
        if (user != null) {
            TLRPC.PeerColor peerColor = user.color;
            if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 2) != 0) {
                return peerColor.background_emoji_id;
            }
            return 0L;
        }
        return 0L;
    }

    public static Long getEmojiStatusDocumentId(TLRPC.User user) {
        if (user == null) {
            return null;
        }
        return getEmojiStatusDocumentId(user.emoji_status);
    }

    public static String getFirstName(TLRPC.User user) {
        return getFirstName(user, true);
    }

    public static String getForcedFirstName(TLRPC.User user) {
        if (user != null && !isDeleted(user)) {
            String str = user.first_name;
            if (TextUtils.isEmpty(str)) {
                str = user.last_name;
            }
            if (str == null) {
                return LocaleController.getString(R.string.HiddenName);
            }
            int indexOf = str.indexOf(" ", 2);
            if (indexOf >= 0) {
                return str.substring(0, indexOf);
            }
            return str;
        }
        return LocaleController.getString(R.string.HiddenName);
    }

    public static long getOnlyProfileEmojiId(TLRPC.User user) {
        if (user != null) {
            TLRPC.PeerColor peerColor = user.profile_color;
            if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 2) != 0) {
                return peerColor.background_emoji_id;
            }
            return 0L;
        }
        return 0L;
    }

    public static MessagesController.PeerColor getPeerColorForAvatar(int i10, TLRPC.User user) {
        return null;
    }

    public static TLRPC.UserProfilePhoto getPhoto(TLRPC.User user) {
        if (hasPhoto(user)) {
            return user.photo;
        }
        return null;
    }

    public static long getProfileCollectibleId(TLRPC.User user) {
        if (user != null) {
            TLRPC.EmojiStatus emojiStatus = user.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                return ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id;
            }
            return 0L;
        }
        return 0L;
    }

    public static int getProfileColorId(TLRPC.User user) {
        if (user == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = user.profile_color;
        if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0) {
            return peerColor.color;
        }
        return -1;
    }

    public static long getProfileEmojiId(TLRPC.User user) {
        TLRPC.PeerColor peerColor;
        if (user != null) {
            TLRPC.EmojiStatus emojiStatus = user.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                return ((TLRPC.TL_emojiStatusCollectible) emojiStatus).pattern_document_id;
            }
        }
        if (user != null && (peerColor = user.profile_color) != null && (peerColor.flags & 2) != 0) {
            return peerColor.background_emoji_id;
        }
        return 0L;
    }

    public static String getPublicUsername(TLRPC.User user, boolean z4) {
        if (user == null) {
            return null;
        }
        if (!TextUtils.isEmpty(user.username)) {
            return user.username;
        }
        if (user.usernames != null) {
            for (int i10 = 0; i10 < user.usernames.size(); i10++) {
                TLRPC.TL_username tL_username = user.usernames.get(i10);
                if (tL_username != null && (((tL_username.active && !z4) || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                    return tL_username.username;
                }
            }
        }
        return null;
    }

    public static TL_account.RequirementToContact getRequirementToContact(TLRPC.User user) {
        if (user == null) {
            return null;
        }
        if (user.send_paid_messages_stars != 0) {
            TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
            requirementtocontactpaidmessages.stars_amount = user.send_paid_messages_stars;
            return requirementtocontactpaidmessages;
        } else if (user.contact_require_premium) {
            return new TL_account.requirementToContactPremium();
        } else {
            return null;
        }
    }

    public static String getUserName(TLRPC.User user) {
        if (user != null && !isDeleted(user)) {
            String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(ContactsController.formatName(user.first_name, user.last_name)));
            if (removeRTL.length() == 0 && !TextUtils.isEmpty(user.phone)) {
                return y3.j(new StringBuilder("+"), user.phone, se.b.c());
            }
            return removeRTL;
        }
        return LocaleController.getString(R.string.HiddenName);
    }

    public static boolean hasFallbackPhoto(TLRPC.UserFull userFull) {
        TLRPC.Photo photo;
        if (userFull != null && (photo = userFull.fallback_photo) != null && !(photo instanceof TLRPC.TL_photoEmpty)) {
            return true;
        }
        return false;
    }

    public static boolean hasPhoto(TLRPC.User user) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (user != null && (userProfilePhoto = user.photo) != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            return true;
        }
        return false;
    }

    public static boolean hasPublicUsername(TLRPC.User user, String str) {
        if (user != null && str != null) {
            if (str.equalsIgnoreCase(user.username)) {
                return true;
            }
            if (user.usernames != null) {
                for (int i10 = 0; i10 < user.usernames.size(); i10++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.active && str.equalsIgnoreCase(tL_username.username)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isAnonymous(TLRPC.User user) {
        if (user != null && user.f19331id == 2666000) {
            return true;
        }
        return false;
    }

    public static boolean isBot(TLRPC.User user) {
        if (user != null && user.bot) {
            return true;
        }
        return false;
    }

    public static boolean isBotForum(int i10, long j10) {
        return isBotForum(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
    }

    public static boolean isBotForumWithEditableTopics(int i10, long j10) {
        return isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
    }

    public static boolean isContact(TLRPC.User user) {
        if (user != null) {
            if ((user instanceof TLRPC.TL_userContact_old2) || user.contact || user.mutual_contact) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isDeleted(TLRPC.User user) {
        if (user != null && !(user instanceof TLRPC.TL_userDeleted_old2) && !(user instanceof TLRPC.TL_userEmpty) && !user.deleted) {
            return false;
        }
        return true;
    }

    public static boolean isReplyUser(long j10) {
        return j10 == 708513 || j10 == 1271266957;
    }

    public static boolean isService(long j10) {
        if (j10 != 333000 && j10 != 777000 && j10 != 42777) {
            return false;
        }
        return true;
    }

    public static boolean isUserSelf(TLRPC.User user) {
        if (user != null) {
            if ((user instanceof TLRPC.TL_userSelf_old3) || user.self) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean areGiftsDisabled(TLRPC.UserFull userFull) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        return (userFull == null || userFull.f19332id != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) && userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_premium_gifts;
    }

    public static Long getEmojiStatusDocumentId(TLRPC.EmojiStatus emojiStatus) {
        if (emojiStatus == null) {
            return null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                return Long.valueOf(tL_emojiStatus.document_id);
            }
            return null;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                return Long.valueOf(tL_emojiStatusCollectible.document_id);
            }
            return null;
        } else {
            return null;
        }
    }

    public static String getFirstName(TLRPC.User user, boolean z4) {
        if (user != null && !isDeleted(user)) {
            String str = user.first_name;
            if (TextUtils.isEmpty(str)) {
                str = user.last_name;
            } else if (!z4 && str.length() <= 2) {
                return ContactsController.formatName(user.first_name, user.last_name);
            }
            return !TextUtils.isEmpty(str) ? str : LocaleController.getString(R.string.HiddenName);
        }
        return "DELETED";
    }

    public static boolean isReplyUser(TLRPC.User user) {
        if (user != null) {
            long j10 = user.f19331id;
            return j10 == 708513 || j10 == 1271266957;
        }
        return false;
    }

    public static boolean isBotForum(TLRPC.User user) {
        return user != null && user.bot_forum_view;
    }

    public static boolean isBotForumWithEditableTopics(TLRPC.User user) {
        return user != null && user.bot_forum_view && user.bot_forum_can_manage_topics;
    }

    public static TL_account.RequirementToContact getRequirementToContact(TLRPC.UserFull userFull) {
        if (userFull == null) {
            return null;
        }
        if (userFull.send_paid_messages_stars != 0) {
            TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
            requirementtocontactpaidmessages.stars_amount = userFull.send_paid_messages_stars;
            return requirementtocontactpaidmessages;
        } else if (userFull.contact_require_premium) {
            return new TL_account.requirementToContactPremium();
        } else {
            return null;
        }
    }

    public static String getPublicUsername(TLRPC.User user) {
        return getPublicUsername(user, false);
    }

    public static boolean applyRequirementToContact(TLRPC.UserFull userFull, TL_account.RequirementToContact requirementToContact) {
        if (userFull == null) {
            return false;
        }
        if (requirementToContact instanceof TL_account.requirementToContactEmpty) {
            if (!userFull.contact_require_premium && userFull.send_paid_messages_stars == 0) {
                return false;
            }
            userFull.contact_require_premium = false;
            userFull.flags2 &= -16385;
            userFull.send_paid_messages_stars = 0L;
        } else if (requirementToContact instanceof TL_account.requirementToContactPremium) {
            if (userFull.contact_require_premium && userFull.send_paid_messages_stars == 0) {
                return false;
            }
            userFull.contact_require_premium = true;
            userFull.flags2 &= -16385;
            userFull.send_paid_messages_stars = 0L;
        } else if (!(requirementToContact instanceof TL_account.requirementToContactPaidMessages)) {
            return false;
        } else {
            long j10 = ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount;
            if (!userFull.contact_require_premium && userFull.send_paid_messages_stars == j10) {
                return false;
            }
            userFull.contact_require_premium = false;
            userFull.flags2 |= 16384;
            userFull.send_paid_messages_stars = j10;
        }
        return true;
    }
}
