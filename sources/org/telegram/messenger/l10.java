package org.telegram.messenger;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public abstract class l10 {
    public static boolean A(long j10) {
        if (j10 != 333000 && j10 != 777000 && j10 != 42777) {
            return false;
        }
        return true;
    }

    public static boolean B(TLRPC.User user) {
        if (user != null) {
            if ((user instanceof TLRPC.TL_userSelf_old3) || user.self) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean a(TLRPC.UserFull userFull, TL_account.RequirementToContact requirementToContact) {
        if (requirementToContact instanceof TL_account.requirementToContactEmpty) {
            if (userFull.contact_require_premium || userFull.send_paid_messages_stars != 0) {
                userFull.contact_require_premium = false;
                userFull.flags2 &= -16385;
                userFull.send_paid_messages_stars = 0L;
                return true;
            }
        } else if (requirementToContact instanceof TL_account.requirementToContactPremium) {
            if (!userFull.contact_require_premium || userFull.send_paid_messages_stars != 0) {
                userFull.contact_require_premium = true;
                userFull.flags2 &= -16385;
                userFull.send_paid_messages_stars = 0L;
                return true;
            }
        } else if (requirementToContact instanceof TL_account.requirementToContactPaidMessages) {
            long j10 = ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount;
            if (userFull.contact_require_premium || userFull.send_paid_messages_stars != j10) {
                userFull.contact_require_premium = false;
                userFull.flags2 |= 16384;
                userFull.send_paid_messages_stars = j10;
                return true;
            }
        }
        return false;
    }

    public static boolean b(TLRPC.UserFull userFull) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if ((userFull != null && userFull.f27151id == h10.i(h10.f22829t0).e()) || userFull == null || (disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_premium_gifts) {
            return false;
        }
        return true;
    }

    public static boolean c(TL_account.RequirementToContact requirementToContact, TL_account.RequirementToContact requirementToContact2) {
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

    public static String d(TLRPC.User user) {
        String n4 = n(user);
        if (n4 != null) {
            String lowerCase = n4.toLowerCase(Locale.ROOT);
            if (lowerCase.endsWith("agent")) {
                return bd.M0(2131752944, null);
            }
            if (lowerCase.endsWith("game")) {
                return bd.M0(2131752942, null);
            }
            if (lowerCase.endsWith("app")) {
                return bd.M0(2131752943, null);
            }
            if (lowerCase.endsWith("ai")) {
                return bd.M0(2131752945, null);
            }
            if (lowerCase.endsWith("gay")) {
                return bd.M0(2131752941, null);
            }
        }
        return bd.M0(2131753156, null);
    }

    public static int e(TLRPC.User user) {
        if (user == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = user.color;
        if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0) {
            return peerColor.color;
        }
        return (int) (user.f27150id % 7);
    }

    public static long f(TLRPC.User user) {
        if (user != null) {
            TLRPC.PeerColor peerColor = user.color;
            if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 2) != 0) {
                return peerColor.background_emoji_id;
            }
            return 0L;
        }
        return 0L;
    }

    public static Long g(TLRPC.EmojiStatus emojiStatus) {
        if (emojiStatus == null) {
            return null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                return null;
            }
            return Long.valueOf(tL_emojiStatus.document_id);
        } else if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return null;
        } else {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                return null;
            }
            return Long.valueOf(tL_emojiStatusCollectible.document_id);
        }
    }

    public static Long h(TLRPC.User user) {
        if (user == null) {
            return null;
        }
        return g(user.emoji_status);
    }

    public static String i(TLRPC.User user) {
        return j(user, true);
    }

    public static String j(TLRPC.User user, boolean z10) {
        if (user != null && !x(user)) {
            String str = user.first_name;
            if (TextUtils.isEmpty(str)) {
                str = user.last_name;
            } else if (!z10 && str.length() <= 2) {
                return g5.m(0, user.first_name, user.last_name);
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return bd.M0(2131749336, null);
        }
        return "DELETED";
    }

    public static String k(TLRPC.User user) {
        if (user != null && !x(user)) {
            String str = user.first_name;
            if (TextUtils.isEmpty(str)) {
                str = user.last_name;
            }
            if (str == null) {
                return bd.M0(2131749336, null);
            }
            int indexOf = str.indexOf(" ", 2);
            if (indexOf >= 0) {
                return str.substring(0, indexOf);
            }
            return str;
        }
        return bd.M0(2131749336, null);
    }

    public static int l(TLRPC.User user) {
        if (user == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = user.profile_color;
        if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0) {
            return peerColor.color;
        }
        return -1;
    }

    public static long m(TLRPC.User user) {
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

    public static String n(TLRPC.User user) {
        if (user != null) {
            if (!TextUtils.isEmpty(user.username)) {
                return user.username;
            }
            if (user.usernames != null) {
                for (int i3 = 0; i3 < user.usernames.size(); i3++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i3);
                    if (tL_username != null && ((tL_username.active || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                        return tL_username.username;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static TL_account.RequirementToContact o(TLRPC.UserFull userFull) {
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

    public static String p(TLRPC.User user) {
        if (user != null && !x(user)) {
            String F2 = g0.F2(g0.D2(g5.m(0, user.first_name, user.last_name)));
            if (F2.length() == 0 && !TextUtils.isEmpty(user.phone)) {
                return k5.i(new StringBuilder("+"), user.phone, mf.b.c());
            }
            return F2;
        }
        return bd.M0(2131749336, null);
    }

    public static boolean q(TLRPC.UserFull userFull) {
        TLRPC.Photo photo;
        if (userFull != null && (photo = userFull.fallback_photo) != null && !(photo instanceof TLRPC.TL_photoEmpty)) {
            return true;
        }
        return false;
    }

    public static boolean r(String str, TLRPC.User user) {
        if (user != null && str != null) {
            if (str.equalsIgnoreCase(user.username)) {
                return true;
            }
            if (user.usernames != null) {
                for (int i3 = 0; i3 < user.usernames.size(); i3++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i3);
                    if (tL_username != null && tL_username.active && str.equalsIgnoreCase(tL_username.username)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean s(TLRPC.User user) {
        if (user != null && user.f27150id == 2666000) {
            return true;
        }
        return false;
    }

    public static boolean t(TLRPC.User user) {
        if (user != null && user.bot) {
            return true;
        }
        return false;
    }

    public static boolean u(TLRPC.User user) {
        if (user != null && user.bot_forum_view) {
            return true;
        }
        return false;
    }

    public static boolean v(TLRPC.User user) {
        if (user != null && user.bot_forum_view && user.bot_forum_can_manage_topics) {
            return true;
        }
        return false;
    }

    public static boolean w(TLRPC.User user) {
        if (!(user instanceof TLRPC.TL_userContact_old2) && !user.contact && !user.mutual_contact) {
            return false;
        }
        return true;
    }

    public static boolean x(TLRPC.User user) {
        if (user != null && !(user instanceof TLRPC.TL_userDeleted_old2) && !(user instanceof TLRPC.TL_userEmpty) && !user.deleted) {
            return false;
        }
        return true;
    }

    public static boolean y(long j10) {
        if (j10 != 708513 && j10 != 1271266957) {
            return false;
        }
        return true;
    }

    public static boolean z(TLRPC.User user) {
        if (user != null) {
            long j10 = user.f27150id;
            if (j10 == 708513 || j10 == 1271266957) {
                return true;
            }
            return false;
        }
        return false;
    }
}
