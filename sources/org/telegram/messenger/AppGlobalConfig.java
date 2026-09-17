package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLRPC;
public class AppGlobalConfig {
    public final ConfigInt aicomposeToneExamplesNum;
    public final ConfigInt aicomposeTonePromptLengthMax;
    public final ConfigInt aicomposeToneSavedLimitDefault;
    public final ConfigInt aicomposeToneSavedLimitPremium;
    public final ConfigInt aicomposeToneTitleLengthMax;
    public final ConfigInt botsCreateLimitDefault;
    public final ConfigInt botsCreateLimitPremium;
    public final ConfigInt communityBotPeersLimit;
    public final ConfigInt communityPeersLimit;
    public final ConfigInt contactNoteLengthLimit;
    public final ConfigBoolean disableBlurInDarkTheme;
    public final ConfigBoolean disableBlurInLightTheme;
    public final ConfigInt ephemeralWelcomeMessagesMax;
    public final ConfigInt groupCallMessageLengthLimit;
    public final ConfigTime groupCallMessageTtl;
    public final ConfigInt messageLengthLimitDefault;
    public final ConfigInt messageLengthLimitPremium;
    public final ConfigBoolean messagePrimaryEditedDate;
    public final ConfigTime messageTypingDraftTtl;
    public final ConfigString musicSearchUsername;
    public final ConfigBoolean needAgeVideoVerification;
    public final ConfigTime noForwardsRequestExpirePeriod;
    public final ConfigInt passkeysAccountPasskeysMax;
    public final ConfigString phoneCountryIso2;
    public final ConfigTime pollAnswerDeletePeriod;
    public final ConfigInt pollAnswerLengthMax;
    public final ConfigInt pollAnswersMax;
    public final ConfigInt pollCaptionLengthMax;
    public final ConfigTime pollClosePeriodMax;
    public final ConfigInt pollCountriesMax;
    public final ConfigInt pollQuestionLengthMax;
    public final ConfigInt pollSolutionLengthMax;
    public final ConfigInt quickReplyMessagesLimit;
    public final ConfigInt richMessageLengthLimit;
    public final ConfigInt richMessageMaxBlocks;
    public final ConfigInt richMessageMaxDepth;
    public final ConfigInt richMessageMaxMedia;
    public final ConfigInt richMessageMaxTableCols;
    public final ConfigString richMessagePosting;
    public final ConfigBoolean settingsDisplayPasskeys;
    public final ConfigInt stargiftsCollectionGiftsLimit;
    public final ConfigInt stargiftsCollectionsLimit;
    public final ConfigString starsRatingLearnMoreUrl;
    public final ConfigBoolean starsSpendTopUpInvoiceDisabled;
    public final ConfigInt starsStarGiftResaleAmountMax;
    public final ConfigInt starsStarGiftResaleAmountMin;
    public final ConfigInt starsStarGiftResaleCommissionPermille;
    public final ConfigTime starsSuggestedPostAgeMin;
    public final ConfigTime starsSuggestedPostFutureMax;
    public final ConfigTime starsSuggestedPostFutureMin;
    public final ConfigInt storiesAlbumStoriesLimit;
    public final ConfigInt storiesAlbumsLimit;
    public final ConfigLong tonStarGiftResaleAmountMax;
    public final ConfigLong tonStarGiftResaleAmountMin;
    public final ConfigInt tonStarGiftResaleCommissionPermille;
    public final ConfigDouble tonUsdRate;
    private final HashMap<String, ConfigInternal> map = new HashMap<>();
    public final ConfigInt starsPaidMessagesChannelAmountDefault = ofInt("stars_paid_messages_channel_amount_default", 10);
    public final ConfigInt starsSuggestedPostCommissionPermille = ofInt("stars_suggested_post_commission_permille", 850);
    public final ConfigInt starsSuggestedPostAmountMin = ofInt("stars_suggested_post_amount_min", 5);
    public final ConfigInt starsSuggestedPostAmountMax = ofInt("stars_suggested_post_amount_max", 100000);
    public final ConfigInt tonSuggestedPostCommissionPermille = ofInt("ton_suggested_post_commission_permille", 850);
    public final ConfigLong tonSuggestedPostAmountMin = ofLong("ton_suggested_post_amount_min", 10000000);
    public final ConfigLong tonSuggestedPostAmountMax = ofLong("ton_suggested_post_amount_max", 10000000000000L);

    public static class ConfigBoolean {
        private final Internal handler;

        public static class Internal implements ConfigInternal {
            private final boolean defaultValue;
            private final String name;
            private boolean value;

            @Override
            public boolean apply(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
                boolean z10;
                if ((jSONValue instanceof TLRPC.TL_jsonBool) && (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) != this.value) {
                    this.value = z10;
                    editor.putBoolean(this.name, z10);
                    return true;
                }
                return false;
            }

            @Override
            public void load(SharedPreferences sharedPreferences) {
                this.value = sharedPreferences.getBoolean(this.name, this.defaultValue);
            }

            private Internal(String str, boolean z10) {
                this.name = str;
                this.defaultValue = z10;
            }
        }

        public boolean get() {
            return this.handler.value;
        }

        private ConfigBoolean(String str, boolean z10) {
            this.handler = new Internal(str, z10);
        }
    }

    public static class ConfigDouble {
        private final Internal handler;

        public static class Internal implements ConfigInternal {
            private final double defaultValue;
            private final String name;
            private double value;

            @Override
            public boolean apply(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
                if (jSONValue instanceof TLRPC.TL_jsonNumber) {
                    double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
                    if (d != this.value) {
                        this.value = d;
                        editor.putFloat(this.name, (float) d);
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override
            public void load(SharedPreferences sharedPreferences) {
                this.value = sharedPreferences.getFloat(this.name, (float) this.defaultValue);
            }

            private Internal(String str, double d) {
                this.name = str;
                this.defaultValue = d;
            }
        }

        public double get() {
            return this.handler.value;
        }

        private ConfigDouble(String str, double d) {
            this.handler = new Internal(str, d);
        }
    }

    public static class ConfigInt {
        private final Internal handler;

        public static class Internal implements ConfigInternal {
            private final int defaultValue;
            private final String name;
            private int value;

            @Override
            public boolean apply(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
                if (jSONValue instanceof TLRPC.TL_jsonNumber) {
                    double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
                    if (d != this.value) {
                        int i10 = (int) d;
                        this.value = i10;
                        editor.putInt(this.name, i10);
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override
            public void load(SharedPreferences sharedPreferences) {
                this.value = sharedPreferences.getInt(this.name, this.defaultValue);
            }

            private Internal(String str, int i10) {
                this.name = str;
                this.defaultValue = i10;
            }
        }

        public int get() {
            return this.handler.value;
        }

        private ConfigInt(String str, int i10) {
            this.handler = new Internal(str, i10);
        }
    }

    public interface ConfigInternal {
        boolean apply(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue);

        void load(SharedPreferences sharedPreferences);
    }

    public static class ConfigLong {
        private final Internal handler;

        public static class Internal implements ConfigInternal {
            private final long defaultValue;
            private final String name;
            private long value;

            @Override
            public boolean apply(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
                if (jSONValue instanceof TLRPC.TL_jsonNumber) {
                    double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
                    if (d != this.value) {
                        long j3 = (long) d;
                        this.value = j3;
                        editor.putLong(this.name, j3);
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override
            public void load(SharedPreferences sharedPreferences) {
                this.value = sharedPreferences.getLong(this.name, this.defaultValue);
            }

            private Internal(String str, long j3) {
                this.name = str;
                this.defaultValue = j3;
            }
        }

        public long get() {
            return this.handler.value;
        }

        private ConfigLong(String str, long j3) {
            this.handler = new Internal(str, j3);
        }
    }

    public static class ConfigString {
        private final Internal handler;

        public static class Internal implements ConfigInternal {
            private final String defaultValue;
            private final String name;
            private String value;

            @Override
            public boolean apply(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
                if (jSONValue instanceof TLRPC.TL_jsonString) {
                    TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
                    if (!TextUtils.equals(tL_jsonString.value, this.value)) {
                        String str = tL_jsonString.value;
                        this.value = str;
                        editor.putString(this.name, str);
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override
            public void load(SharedPreferences sharedPreferences) {
                this.value = sharedPreferences.getString(this.name, this.defaultValue);
            }

            private Internal(String str, String str2) {
                this.name = str;
                this.defaultValue = str2;
            }
        }

        public String get() {
            return this.handler.value;
        }

        public boolean is(String str) {
            return TextUtils.equals(get(), str);
        }

        private ConfigString(String str, String str2) {
            this.handler = new Internal(str, str2);
        }
    }

    public static class ConfigTime {
        private final ConfigLong.Internal handler;
        private final TimeUnit timeUnit;

        public long get(TimeUnit timeUnit) {
            return timeUnit.convert(this.handler.value, this.timeUnit);
        }

        private ConfigTime(String str, TimeUnit timeUnit, long j3) {
            this.handler = new ConfigLong.Internal(str, j3);
            this.timeUnit = timeUnit;
        }
    }

    public AppGlobalConfig() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.starsSuggestedPostAgeMin = ofTime("stars_suggested_post_age_min", 86400L, timeUnit);
        this.starsSuggestedPostFutureMin = ofTime("stars_suggested_post_future_min", 300L, timeUnit);
        this.starsSuggestedPostFutureMax = ofTime("stars_suggested_post_future_max", 2678400L, timeUnit);
        this.tonUsdRate = ofDouble("ton_usd_rate", 3.0d);
        this.starsRatingLearnMoreUrl = ofString("stars_rating_learnmore_url", "https://telegram.org/blog/telegram-stars");
        this.needAgeVideoVerification = ofBoolean("need_age_video_verification", false);
        this.starsStarGiftResaleCommissionPermille = ofInt("stars_stargift_resale_commission_permille", 800);
        this.tonStarGiftResaleCommissionPermille = ofInt("ton_stargift_resale_commission_permille", 800);
        this.starsStarGiftResaleAmountMin = ofInt("stars_stargift_resale_amount_min", 125);
        this.starsStarGiftResaleAmountMax = ofInt("stars_stargift_resale_amount_max", 35000);
        this.tonStarGiftResaleAmountMin = ofLong("ton_stargift_resale_amount_min", 10000000L);
        this.tonStarGiftResaleAmountMax = ofLong("ton_stargift_resale_amount_max", 10000000000000L);
        this.stargiftsCollectionsLimit = ofInt("stargifts_collections_limit", 100);
        this.stargiftsCollectionGiftsLimit = ofInt("stargifts_collection_gifts_limit", 100);
        this.storiesAlbumsLimit = ofInt("stories_albums_limit", 100);
        this.storiesAlbumStoriesLimit = ofInt("stories_album_stories_limit", 100);
        this.messageTypingDraftTtl = ofTime("message_typing_draft_ttl", 30L, timeUnit);
        this.groupCallMessageTtl = ofTime("group_call_message_ttl", 10L, timeUnit);
        this.groupCallMessageLengthLimit = ofInt("group_call_message_length_limit", 128);
        this.contactNoteLengthLimit = ofInt("contact_note_length_limit", 128);
        this.passkeysAccountPasskeysMax = ofInt("passkeys_account_passkeys_max", 5);
        this.settingsDisplayPasskeys = ofBoolean("settings_display_passkeys", BuildVars.DEBUG_VERSION);
        this.disableBlurInLightTheme = ofBoolean("android_disable_blur_in_light_theme", false);
        this.disableBlurInDarkTheme = ofBoolean("android_disable_blur_in_dark_theme", false);
        this.noForwardsRequestExpirePeriod = ofTime("no_forwards_request_expire_period", 86400L, timeUnit);
        this.pollClosePeriodMax = ofTime("poll_close_period_max", 2592000L, timeUnit);
        this.musicSearchUsername = ofString("music_search_username", null);
        this.pollAnswersMax = ofInt("poll_answers_max", 12);
        this.pollCountriesMax = ofInt("poll_countries_max", 12);
        this.pollAnswerLengthMax = ofInt("poll_answer_length_max", 100);
        this.pollQuestionLengthMax = ofInt("poll_question_length_max", 255);
        this.pollSolutionLengthMax = ofInt("poll_solution_length_max", 200);
        this.pollCaptionLengthMax = ofInt("poll_caption_length_max", 300);
        this.pollAnswerDeletePeriod = ofTime("poll_answer_delete_period", 300L, timeUnit);
        this.botsCreateLimitDefault = ofInt("bots_create_limit_default", 20);
        this.botsCreateLimitPremium = ofInt("bots_create_limit_premium", 40);
        this.phoneCountryIso2 = ofString("phone_country_iso2", "en");
        this.aicomposeToneExamplesNum = ofInt("aicompose_tone_examples_num", 3);
        this.aicomposeToneTitleLengthMax = ofInt("aicompose_tone_title_length_max", 12);
        this.aicomposeTonePromptLengthMax = ofInt("aicompose_tone_prompt_length_max", 1024);
        this.aicomposeToneSavedLimitDefault = ofInt("aicompose_tone_saved_limit_default", 5);
        this.aicomposeToneSavedLimitPremium = ofInt("aicompose_tone_saved_limit_premium", 20);
        this.messagePrimaryEditedDate = ofBoolean("message_primary_edited_date", false);
        this.richMessageLengthLimit = ofInt("rich_message_length_limit", 32768);
        this.richMessageMaxBlocks = ofInt("rich_message_max_blocks", 500);
        this.richMessageMaxDepth = ofInt("rich_message_max_depth", 16);
        this.richMessageMaxMedia = ofInt("rich_message_max_media", 50);
        this.richMessageMaxTableCols = ofInt("rich_message_max_table_cols", 20);
        this.richMessagePosting = ofString("rich_message_posting", "premium");
        this.communityPeersLimit = ofInt("community_peers_limit", 100);
        this.communityBotPeersLimit = ofInt("community_bot_peers_limit", 100);
        this.messageLengthLimitDefault = ofInt("message_length_limit_default", 4096);
        this.messageLengthLimitPremium = ofInt("message_length_limit_premium", 8192);
        this.quickReplyMessagesLimit = ofInt("quick_reply_messages_limit", 20);
        this.ephemeralWelcomeMessagesMax = ofInt("ephemeral_welcome_messages_max", 5);
        this.starsSpendTopUpInvoiceDisabled = ofBoolean("stars_spend_topup_invoice_disabled", false);
    }

    public static AppGlobalConfig getInstance(int i10) {
        return MessagesController.getInstance(i10).config;
    }

    private ConfigBoolean ofBoolean(String str, boolean z10) {
        ConfigBoolean configBoolean = new ConfigBoolean(str, z10);
        this.map.put(str, configBoolean.handler);
        return configBoolean;
    }

    private ConfigDouble ofDouble(String str, double d) {
        ConfigDouble configDouble = new ConfigDouble(str, d);
        this.map.put(str, configDouble.handler);
        return configDouble;
    }

    private ConfigInt ofInt(String str, int i10) {
        ConfigInt configInt = new ConfigInt(str, i10);
        this.map.put(str, configInt.handler);
        return configInt;
    }

    private ConfigLong ofLong(String str, long j3) {
        ConfigLong configLong = new ConfigLong(str, j3);
        this.map.put(str, configLong.handler);
        return configLong;
    }

    private ConfigString ofString(String str, String str2) {
        ConfigString configString = new ConfigString(str, str2);
        this.map.put(str, configString.handler);
        return configString;
    }

    private ConfigTime ofTime(String str, long j3, TimeUnit timeUnit) {
        ConfigTime configTime = new ConfigTime(str, timeUnit, j3);
        this.map.put(str, configTime.handler);
        return configTime;
    }

    public boolean apply(SharedPreferences.Editor editor, TLRPC.TL_jsonObject tL_jsonObject) {
        int size = tL_jsonObject.value.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i10);
            ConfigInternal configInternal = this.map.get(tL_jsonObjectValue.key);
            if (configInternal != null) {
                z10 |= configInternal.apply(editor, tL_jsonObjectValue.value);
            }
        }
        return z10;
    }

    public void load(SharedPreferences sharedPreferences) {
        for (ConfigInternal configInternal : this.map.values()) {
            try {
                configInternal.load(sharedPreferences);
            } catch (ClassCastException e7) {
                FileLog.e(e7);
            }
        }
    }
}
