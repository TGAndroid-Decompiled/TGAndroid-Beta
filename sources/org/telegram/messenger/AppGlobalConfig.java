package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
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
    public final ConfigInt contactNoteLengthLimit;
    public final ConfigBoolean disableBlurInDarkTheme;
    public final ConfigBoolean disableBlurInLightTheme;
    public final ConfigInt groupCallMessageLengthLimit;
    public final ConfigTime groupCallMessageTtl;
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
    public final ConfigBoolean settingsDisplayPasskeys;
    public final ConfigInt stargiftsCollectionGiftsLimit;
    public final ConfigInt stargiftsCollectionsLimit;
    public final ConfigString starsRatingLearnMoreUrl;
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

    private interface ConfigInternal {
        boolean apply(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue);

        void load(SharedPreferences sharedPreferences);
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
    }

    public boolean apply(SharedPreferences.Editor editor, TLRPC.TL_jsonObject tL_jsonObject) {
        int size = tL_jsonObject.value.size();
        boolean zApply = false;
        for (int i = 0; i < size; i++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i);
            ConfigInternal configInternal = this.map.get(tL_jsonObjectValue.key);
            if (configInternal != null) {
                zApply |= configInternal.apply(editor, tL_jsonObjectValue.value);
            }
        }
        return zApply;
    }

    public void load(SharedPreferences sharedPreferences) {
        Iterator<ConfigInternal> it = this.map.values().iterator();
        while (it.hasNext()) {
            try {
                it.next().load(sharedPreferences);
            } catch (ClassCastException e) {
                FileLog.e(e);
            }
        }
    }

    public static class ConfigInt {
        private final Internal handler;

        private ConfigInt(String str, int i) {
            this.handler = new Internal(str, i);
        }

        public int get() {
            return this.handler.value;
        }

        private static class Internal implements ConfigInternal {
            private final int defaultValue;
            private final String name;
            private int value;

            private Internal(String str, int i) {
                this.name = str;
                this.defaultValue = i;
            }

            @Override
            public boolean apply(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
                if (!(jSONValue instanceof TLRPC.TL_jsonNumber)) {
                    return false;
                }
                double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
                if (d == this.value) {
                    return false;
                }
                int i = (int) d;
                this.value = i;
                editor.putInt(this.name, i);
                return true;
            }

            @Override
            public void load(SharedPreferences sharedPreferences) {
                this.value = sharedPreferences.getInt(this.name, this.defaultValue);
            }
        }
    }

    public static class ConfigLong {
        private final Internal handler;

        private ConfigLong(String str, long j) {
            this.handler = new Internal(str, j);
        }

        public long get() {
            return this.handler.value;
        }

        private static class Internal implements ConfigInternal {
            private final long defaultValue;
            private final String name;
            private long value;

            private Internal(String str, long j) {
                this.name = str;
                this.defaultValue = j;
            }

            @Override
            public boolean apply(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
                if (!(jSONValue instanceof TLRPC.TL_jsonNumber)) {
                    return false;
                }
                double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
                if (d == this.value) {
                    return false;
                }
                long j = (long) d;
                this.value = j;
                editor.putLong(this.name, j);
                return true;
            }

            @Override
            public void load(SharedPreferences sharedPreferences) {
                this.value = sharedPreferences.getLong(this.name, this.defaultValue);
            }
        }
    }

    public static class ConfigDouble {
        private final Internal handler;

        private ConfigDouble(String str, double d) {
            this.handler = new Internal(str, d);
        }

        public double get() {
            return this.handler.value;
        }

        private static class Internal implements ConfigInternal {
            private final double defaultValue;
            private final String name;
            private double value;

            private Internal(String str, double d) {
                this.name = str;
                this.defaultValue = d;
            }

            @Override
            public boolean apply(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
                if (!(jSONValue instanceof TLRPC.TL_jsonNumber)) {
                    return false;
                }
                double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
                if (d == this.value) {
                    return false;
                }
                this.value = d;
                editor.putFloat(this.name, (float) d);
                return true;
            }

            @Override
            public void load(SharedPreferences sharedPreferences) {
                this.value = sharedPreferences.getFloat(this.name, (float) this.defaultValue);
            }
        }
    }

    public static class ConfigString {
        private final Internal handler;

        private ConfigString(String str, String str2) {
            this.handler = new Internal(str, str2);
        }

        public String get() {
            return this.handler.value;
        }

        public boolean is(String str) {
            return TextUtils.equals(get(), str);
        }

        private static class Internal implements ConfigInternal {
            private final String defaultValue;
            private final String name;
            private String value;

            private Internal(String str, String str2) {
                this.name = str;
                this.defaultValue = str2;
            }

            @Override
            public boolean apply(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
                if (!(jSONValue instanceof TLRPC.TL_jsonString)) {
                    return false;
                }
                TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
                if (TextUtils.equals(tL_jsonString.value, this.value)) {
                    return false;
                }
                String str = tL_jsonString.value;
                this.value = str;
                editor.putString(this.name, str);
                return true;
            }

            @Override
            public void load(SharedPreferences sharedPreferences) {
                this.value = sharedPreferences.getString(this.name, this.defaultValue);
            }
        }
    }

    public static class ConfigBoolean {
        private final Internal handler;

        private ConfigBoolean(String str, boolean z) {
            this.handler = new Internal(str, z);
        }

        public boolean get() {
            return this.handler.value;
        }

        private static class Internal implements ConfigInternal {
            private final boolean defaultValue;
            private final String name;
            private boolean value;

            private Internal(String str, boolean z) {
                this.name = str;
                this.defaultValue = z;
            }

            @Override
            public boolean apply(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
                boolean z;
                if (!(jSONValue instanceof TLRPC.TL_jsonBool) || (z = ((TLRPC.TL_jsonBool) jSONValue).value) == this.value) {
                    return false;
                }
                this.value = z;
                editor.putBoolean(this.name, z);
                return true;
            }

            @Override
            public void load(SharedPreferences sharedPreferences) {
                this.value = sharedPreferences.getBoolean(this.name, this.defaultValue);
            }
        }
    }

    public static class ConfigTime {
        private final ConfigLong.Internal handler;
        private final TimeUnit timeUnit;

        private ConfigTime(String str, TimeUnit timeUnit, long j) {
            this.handler = new ConfigLong.Internal(str, j);
            this.timeUnit = timeUnit;
        }

        public long get(TimeUnit timeUnit) {
            return timeUnit.convert(this.handler.value, this.timeUnit);
        }
    }

    private ConfigInt ofInt(String str, int i) {
        ConfigInt configInt = new ConfigInt(str, i);
        this.map.put(str, configInt.handler);
        return configInt;
    }

    private ConfigLong ofLong(String str, long j) {
        ConfigLong configLong = new ConfigLong(str, j);
        this.map.put(str, configLong.handler);
        return configLong;
    }

    private ConfigDouble ofDouble(String str, double d) {
        ConfigDouble configDouble = new ConfigDouble(str, d);
        this.map.put(str, configDouble.handler);
        return configDouble;
    }

    private ConfigBoolean ofBoolean(String str, boolean z) {
        ConfigBoolean configBoolean = new ConfigBoolean(str, z);
        this.map.put(str, configBoolean.handler);
        return configBoolean;
    }

    private ConfigString ofString(String str, String str2) {
        ConfigString configString = new ConfigString(str, str2);
        this.map.put(str, configString.handler);
        return configString;
    }

    private ConfigTime ofTime(String str, long j, TimeUnit timeUnit) {
        ConfigTime configTime = new ConfigTime(str, timeUnit, j);
        this.map.put(str, configTime.handler);
        return configTime;
    }

    public static AppGlobalConfig getInstance(int i) {
        return MessagesController.getInstance(i).config;
    }
}
