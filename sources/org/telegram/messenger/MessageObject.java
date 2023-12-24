package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotApp;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$ChannelAdminLogEventAction;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatInvite;
import org.telegram.tgnet.TLRPC$ChatReactions;
import org.telegram.tgnet.TLRPC$DecryptedMessageAction;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$ForumTopic;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$KeyboardButton;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$MessageExtendedMedia;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$MessagePeerReaction;
import org.telegram.tgnet.TLRPC$MessageReplies;
import org.telegram.tgnet.TLRPC$MessageReplyHeader;
import org.telegram.tgnet.TLRPC$Page;
import org.telegram.tgnet.TLRPC$PageBlock;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$PollResults;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$ReactionCount;
import org.telegram.tgnet.TLRPC$ReplyMarkup;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_channelAdminLogEvent;
import org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionChangeWallpaper;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;
import org.telegram.tgnet.TLRPC$TL_chatBannedRights;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_chatReactionsAll;
import org.telegram.tgnet.TLRPC$TL_chatReactionsSome;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionScreenshotMessages;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionSetMessageTTL;
import org.telegram.tgnet.TLRPC$TL_document;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAnimated;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_documentAttributeCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_documentAttributeHasStickers;
import org.telegram.tgnet.TLRPC$TL_documentAttributeImageSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeSticker;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_documentEmpty;
import org.telegram.tgnet.TLRPC$TL_documentEncrypted;
import org.telegram.tgnet.TLRPC$TL_fileLocationUnavailable;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_game;
import org.telegram.tgnet.TLRPC$TL_inputPeerChannel;
import org.telegram.tgnet.TLRPC$TL_inputPeerChat;
import org.telegram.tgnet.TLRPC$TL_inputPeerSelf;
import org.telegram.tgnet.TLRPC$TL_inputPeerUser;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetEmpty;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetShortName;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonBuy;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonRow;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageActionChatEditPhoto;
import org.telegram.tgnet.TLRPC$TL_messageActionChatJoinedByRequest;
import org.telegram.tgnet.TLRPC$TL_messageActionContactSignUp;
import org.telegram.tgnet.TLRPC$TL_messageActionEmpty;
import org.telegram.tgnet.TLRPC$TL_messageActionGiftCode;
import org.telegram.tgnet.TLRPC$TL_messageActionGiftPremium;
import org.telegram.tgnet.TLRPC$TL_messageActionHistoryClear;
import org.telegram.tgnet.TLRPC$TL_messageActionLoginUnknownLocation;
import org.telegram.tgnet.TLRPC$TL_messageActionPhoneCall;
import org.telegram.tgnet.TLRPC$TL_messageActionPinMessage;
import org.telegram.tgnet.TLRPC$TL_messageActionSetChatWallPaper;
import org.telegram.tgnet.TLRPC$TL_messageActionSetSameChatWallPaper;
import org.telegram.tgnet.TLRPC$TL_messageActionSuggestProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_messageActionTopicCreate;
import org.telegram.tgnet.TLRPC$TL_messageActionTopicEdit;
import org.telegram.tgnet.TLRPC$TL_messageActionUserUpdatedPhoto;
import org.telegram.tgnet.TLRPC$TL_messageEmpty;
import org.telegram.tgnet.TLRPC$TL_messageEncryptedAction;
import org.telegram.tgnet.TLRPC$TL_messageEntityCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_messageEntityItalic;
import org.telegram.tgnet.TLRPC$TL_messageEntityMentionName;
import org.telegram.tgnet.TLRPC$TL_messageEntitySpoiler;
import org.telegram.tgnet.TLRPC$TL_messageExtendedMedia;
import org.telegram.tgnet.TLRPC$TL_messageExtendedMediaPreview;
import org.telegram.tgnet.TLRPC$TL_messageForwarded_old2;
import org.telegram.tgnet.TLRPC$TL_messageMediaContact;
import org.telegram.tgnet.TLRPC$TL_messageMediaDice;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messageMediaEmpty;
import org.telegram.tgnet.TLRPC$TL_messageMediaGame;
import org.telegram.tgnet.TLRPC$TL_messageMediaGeo;
import org.telegram.tgnet.TLRPC$TL_messageMediaGeoLive;
import org.telegram.tgnet.TLRPC$TL_messageMediaGiveaway;
import org.telegram.tgnet.TLRPC$TL_messageMediaGiveawayResults;
import org.telegram.tgnet.TLRPC$TL_messageMediaInvoice;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messageMediaPoll;
import org.telegram.tgnet.TLRPC$TL_messageMediaStory;
import org.telegram.tgnet.TLRPC$TL_messageMediaUnsupported;
import org.telegram.tgnet.TLRPC$TL_messageMediaVenue;
import org.telegram.tgnet.TLRPC$TL_messageMediaWebPage;
import org.telegram.tgnet.TLRPC$TL_messagePeerReaction;
import org.telegram.tgnet.TLRPC$TL_messageReactions;
import org.telegram.tgnet.TLRPC$TL_messageService;
import org.telegram.tgnet.TLRPC$TL_message_secret;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_pageBlockCollage;
import org.telegram.tgnet.TLRPC$TL_pageBlockPhoto;
import org.telegram.tgnet.TLRPC$TL_pageBlockSlideshow;
import org.telegram.tgnet.TLRPC$TL_pageBlockVideo;
import org.telegram.tgnet.TLRPC$TL_peerChannel;
import org.telegram.tgnet.TLRPC$TL_peerChannel_layer131;
import org.telegram.tgnet.TLRPC$TL_peerChat;
import org.telegram.tgnet.TLRPC$TL_peerChat_layer131;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_peerUser_layer131;
import org.telegram.tgnet.TLRPC$TL_photo;
import org.telegram.tgnet.TLRPC$TL_photoCachedSize;
import org.telegram.tgnet.TLRPC$TL_photoEmpty;
import org.telegram.tgnet.TLRPC$TL_photoSizeEmpty;
import org.telegram.tgnet.TLRPC$TL_photoStrippedSize;
import org.telegram.tgnet.TLRPC$TL_pollAnswer;
import org.telegram.tgnet.TLRPC$TL_pollAnswerVoters;
import org.telegram.tgnet.TLRPC$TL_reactionCount;
import org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.tgnet.TLRPC$TL_replyInlineMarkup;
import org.telegram.tgnet.TLRPC$TL_sponsoredWebPage;
import org.telegram.tgnet.TLRPC$TL_stickerPack;
import org.telegram.tgnet.TLRPC$TL_stickerSetFullCovered;
import org.telegram.tgnet.TLRPC$TL_textWithEntities;
import org.telegram.tgnet.TLRPC$TL_wallPaperNoFile;
import org.telegram.tgnet.TLRPC$TL_webPage;
import org.telegram.tgnet.TLRPC$TL_webPageAttributeStory;
import org.telegram.tgnet.TLRPC$TL_webPageAttributeTheme;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.tgnet.TLRPC$WebDocument;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.tgnet.TLRPC$WebPageAttribute;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.tgnet.tl.TL_stories$TL_storyItemDeleted;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TranscribeButton;
import org.telegram.ui.Components.URLSpanNoUnderlineBold;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
public class MessageObject {
    private static final int LINES_PER_BLOCK = 10;
    private static final int LINES_PER_BLOCK_WITH_EMOJI = 5;
    public static final int MESSAGE_SEND_STATE_EDITING = 3;
    public static final int MESSAGE_SEND_STATE_SENDING = 1;
    public static final int MESSAGE_SEND_STATE_SEND_ERROR = 2;
    public static final int MESSAGE_SEND_STATE_SENT = 0;
    public static final int POSITION_FLAG_BOTTOM = 8;
    public static final int POSITION_FLAG_LEFT = 1;
    public static final int POSITION_FLAG_RIGHT = 2;
    public static final int POSITION_FLAG_TOP = 4;
    public static final int TYPE_ACTION_PHOTO = 11;
    public static final int TYPE_ACTION_WALLPAPER = 22;
    public static final int TYPE_ANIMATED_STICKER = 15;
    public static final int TYPE_CONTACT = 12;
    public static final int TYPE_DATE = 10;
    public static final int TYPE_EMOJIS = 19;
    public static final int TYPE_EXTENDED_MEDIA_PREVIEW = 20;
    public static final int TYPE_FILE = 9;
    public static final int TYPE_GEO = 4;
    public static final int TYPE_GIF = 8;
    public static final int TYPE_GIFT_PREMIUM = 18;
    public static final int TYPE_GIFT_PREMIUM_CHANNEL = 25;
    public static final int TYPE_GIVEAWAY = 26;
    public static final int TYPE_GIVEAWAY_RESULTS = 28;
    public static final int TYPE_JOINED_CHANNEL = 27;
    public static final int TYPE_LOADING = 6;
    public static final int TYPE_MUSIC = 14;
    public static final int TYPE_PHONE_CALL = 16;
    public static final int TYPE_PHOTO = 1;
    public static final int TYPE_POLL = 17;
    public static final int TYPE_ROUND_VIDEO = 5;
    public static final int TYPE_STICKER = 13;
    public static final int TYPE_STORY = 23;
    public static final int TYPE_STORY_MENTION = 24;
    public static final int TYPE_SUGGEST_PHOTO = 21;
    public static final int TYPE_TEXT = 0;
    public static final int TYPE_VIDEO = 3;
    public static final int TYPE_VOICE = 2;
    private static CharSequence channelSpan;
    static final String[] excludeWords = {" vs. ", " vs ", " versus ", " ft. ", " ft ", " featuring ", " feat. ", " feat ", " presents ", " pres. ", " pres ", " and ", " & ", " . "};
    private static CharSequence groupSpan;
    public static Pattern instagramUrlPattern;
    private static Pattern loginCodePattern;
    public static Pattern urlPattern;
    private static CharSequence[] userSpan;
    public static Pattern videoTimeUrlPattern;
    public boolean animateComments;
    public int animatedEmojiCount;
    public boolean attachPathExists;
    public double attributeDuration;
    public int audioPlayerDuration;
    public float audioProgress;
    public int audioProgressMs;
    public int audioProgressSec;
    public StringBuilder botButtonsLayout;
    public String botStartParam;
    public float bufferedProgress;
    public Boolean cachedIsSupergroup;
    public boolean cancelEditing;
    public CharSequence caption;
    private boolean captionTranslated;
    private boolean channelJoined;
    public boolean channelJoinedExpanded;
    public ArrayList<TLRPC$TL_pollAnswer> checkedVotes;
    public int contentType;
    public int currentAccount;
    public TLRPC$TL_channelAdminLogEvent currentEvent;
    public Drawable customAvatarDrawable;
    public String customName;
    public String customReplyName;
    public String dateKey;
    public boolean deleted;
    public boolean deletedByThanos;
    public boolean drawServiceWithDefaultTypeface;
    public CharSequence editingMessage;
    public ArrayList<TLRPC$MessageEntity> editingMessageEntities;
    public boolean editingMessageSearchWebPage;
    public TLRPC$Document emojiAnimatedSticker;
    public String emojiAnimatedStickerColor;
    public Long emojiAnimatedStickerId;
    private boolean emojiAnimatedStickerLoading;
    public TLRPC$VideoSize emojiMarkup;
    public int emojiOnlyCount;
    public long eventId;
    public long extendedMediaLastCheckTime;
    public boolean flickerLoading;
    public boolean forceAvatar;
    public boolean forceExpired;
    public boolean forcePlayEffect;
    public float forceSeekTo;
    public boolean forceUpdate;
    private float generatedWithDensity;
    private int generatedWithMinSize;
    public float gifState;
    public boolean hadAnimationNotReadyLoading;
    public boolean hasCode;
    public boolean hasCodeAtBottom;
    public boolean hasCodeAtTop;
    public boolean hasQuote;
    public boolean hasQuoteAtBottom;
    public boolean hasRtl;
    public boolean hasSingleCode;
    public boolean hasSingleQuote;
    private boolean hasUnwrappedEmoji;
    public boolean hasWideCode;
    public boolean hideSendersName;
    public ArrayList<String> highlightedWords;
    public boolean isDateObject;
    public boolean isDownloadingFile;
    public boolean isMediaSpoilersRevealed;
    public boolean isMediaSpoilersRevealedInSharedMedia;
    public Boolean isOutOwnerCached;
    public boolean isReactionPush;
    public boolean isRepostPreview;
    public boolean isRepostVideoPreview;
    public boolean isRestrictedMessage;
    private int isRoundVideoCached;
    public boolean isSpoilersRevealed;
    public boolean isStoryMentionPush;
    public boolean isStoryPush;
    public boolean isStoryPushHidden;
    public boolean isTopicMainMessage;
    public Object lastGeoWebFileLoaded;
    public Object lastGeoWebFileSet;
    public int lastLineWidth;
    private boolean layoutCreated;
    public CharSequence linkDescription;
    public long loadedFileSize;
    public boolean loadingCancelled;
    public boolean localChannel;
    public boolean localEdit;
    public long localGroupId;
    public String localName;
    public long localSentGroupId;
    public boolean localSupergroup;
    public int localType;
    public String localUserName;
    public boolean mediaExists;
    public ImageLocation mediaSmallThumb;
    public ImageLocation mediaThumb;
    public TLRPC$Message messageOwner;
    public CharSequence messageText;
    public CharSequence messageTextForReply;
    public CharSequence messageTextShort;
    public CharSequence messageTrimmedToHighlight;
    public String monthKey;
    public int overrideLinkColor;
    public long overrideLinkEmoji;
    public int parentWidth;
    public SvgHelper.SvgDrawable pathThumb;
    public ArrayList<TLRPC$PhotoSize> photoThumbs;
    public ArrayList<TLRPC$PhotoSize> photoThumbs2;
    public TLObject photoThumbsObject;
    public TLObject photoThumbsObject2;
    public boolean playedGiftAnimation;
    public long pollLastCheckTime;
    public boolean pollVisibleOnScreen;
    public boolean preview;
    public boolean previewForward;
    public String previousAttachPath;
    public TLRPC$MessageMedia previousMedia;
    public String previousMessage;
    public ArrayList<TLRPC$MessageEntity> previousMessageEntities;
    public boolean putInDownloadsStore;
    private byte[] randomWaveform;
    public boolean reactionsChanged;
    public long reactionsLastCheckTime;
    public MessageObject replyMessageObject;
    public boolean replyTextEllipsized;
    public boolean replyTextRevealed;
    public TLRPC$TL_forumTopic replyToForumTopic;
    public boolean resendAsIs;
    public boolean revealingMediaSpoilers;
    public boolean scheduled;
    private CharSequence secretOnceSpan;
    private CharSequence secretPlaySpan;
    public SendAnimationData sendAnimationData;
    public TLRPC$Peer sendAsPeer;
    public boolean settingAvatar;
    public boolean shouldRemoveVideoEditedInfo;
    private boolean spoiledLoginCode;
    public String sponsoredAdditionalInfo;
    public TLRPC$BotApp sponsoredBotApp;
    public String sponsoredButtonText;
    public int sponsoredChannelPost;
    public TLRPC$ChatInvite sponsoredChatInvite;
    public String sponsoredChatInviteHash;
    public byte[] sponsoredId;
    public String sponsoredInfo;
    public boolean sponsoredRecommended;
    public boolean sponsoredShowPeerPhoto;
    public TLRPC$TL_sponsoredWebPage sponsoredWebPage;
    public int stableId;
    public TL_stories$StoryItem storyItem;
    private TLRPC$WebPage storyMentionWebpage;
    public BitmapDrawable strippedThumb;
    public int textHeight;
    public ArrayList<TextLayoutBlock> textLayoutBlocks;
    public int textWidth;
    public float textXOffset;
    public Drawable[] topicIconDrawable;
    private int totalAnimatedEmojiCount;
    public boolean translated;
    public int type;
    public boolean useCustomPhoto;
    public CharSequence vCardData;
    public VideoEditedInfo videoEditedInfo;
    public boolean viewsReloaded;
    public int wantedBotKeyboardWidth;
    public boolean wasJustSent;
    public boolean wasUnread;
    public ArrayList<TLRPC$MessageEntity> webPageDescriptionEntities;
    public CharSequence youtubeDescription;

    public static class SendAnimationData {
        public float currentScale;
        public float currentX;
        public float currentY;
        public float height;
        public float timeAlpha;
        public float width;
        public float x;
        public float y;
    }

    public void checkForScam() {
    }

    public boolean shouldDrawReactionsInLayout() {
        return true;
    }

    public static boolean hasUnreadReactions(TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message == null) {
            return false;
        }
        return hasUnreadReactions(tLRPC$Message.reactions);
    }

    public static boolean hasUnreadReactions(TLRPC$TL_messageReactions tLRPC$TL_messageReactions) {
        if (tLRPC$TL_messageReactions == null) {
            return false;
        }
        for (int i = 0; i < tLRPC$TL_messageReactions.recent_reactions.size(); i++) {
            if (tLRPC$TL_messageReactions.recent_reactions.get(i).unread) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPremiumSticker(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null && tLRPC$Document.thumbs != null) {
            for (int i = 0; i < tLRPC$Document.video_thumbs.size(); i++) {
                if ("f".equals(tLRPC$Document.video_thumbs.get(i).type)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int getTopicId(TLRPC$Message tLRPC$Message) {
        return getTopicId(tLRPC$Message, false);
    }

    public static int getTopicId(TLRPC$Message tLRPC$Message, boolean z) {
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader;
        if (tLRPC$Message == null || !(tLRPC$Message.action instanceof TLRPC$TL_messageActionTopicCreate)) {
            if (tLRPC$Message == null || (tLRPC$MessageReplyHeader = tLRPC$Message.reply_to) == null || !tLRPC$MessageReplyHeader.forum_topic) {
                return z ? 1 : 0;
            }
            if ((tLRPC$Message instanceof TLRPC$TL_messageService) && !(tLRPC$Message.action instanceof TLRPC$TL_messageActionPinMessage)) {
                int i = tLRPC$MessageReplyHeader.reply_to_msg_id;
                return i == 0 ? tLRPC$MessageReplyHeader.reply_to_top_id : i;
            }
            int i2 = tLRPC$MessageReplyHeader.reply_to_top_id;
            return i2 == 0 ? tLRPC$MessageReplyHeader.reply_to_msg_id : i2;
        }
        return tLRPC$Message.id;
    }

    public static boolean isTopicActionMessage(MessageObject messageObject) {
        TLRPC$Message tLRPC$Message;
        if (messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null) {
            return false;
        }
        TLRPC$MessageAction tLRPC$MessageAction = tLRPC$Message.action;
        return (tLRPC$MessageAction instanceof TLRPC$TL_messageActionTopicCreate) || (tLRPC$MessageAction instanceof TLRPC$TL_messageActionTopicEdit);
    }

    public static boolean canCreateStripedThubms() {
        return SharedConfig.getDevicePerformanceClass() == 2;
    }

    public static void normalizeFlags(TLRPC$Message tLRPC$Message) {
        TLRPC$Peer tLRPC$Peer = tLRPC$Message.from_id;
        if (tLRPC$Peer == null) {
            tLRPC$Message.flags &= -257;
        }
        if (tLRPC$Peer == null) {
            tLRPC$Message.flags &= -5;
        }
        if (tLRPC$Message.reply_to == null) {
            tLRPC$Message.flags &= -9;
        }
        if (tLRPC$Message.media == null) {
            tLRPC$Message.flags &= -513;
        }
        if (tLRPC$Message.reply_markup == null) {
            tLRPC$Message.flags &= -65;
        }
        if (tLRPC$Message.replies == null) {
            tLRPC$Message.flags &= -8388609;
        }
        if (tLRPC$Message.reactions == null) {
            tLRPC$Message.flags &= -1048577;
        }
    }

    public static double getDocumentDuration(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return 0.0d;
        }
        int size = tLRPC$Document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                return tLRPC$DocumentAttribute.duration;
            }
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                return tLRPC$DocumentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public boolean isWallpaperAction() {
        TLRPC$Message tLRPC$Message;
        return this.type == 22 || ((tLRPC$Message = this.messageOwner) != null && (tLRPC$Message.action instanceof TLRPC$TL_messageActionSetSameChatWallPaper));
    }

    public boolean isWallpaperForBoth() {
        TLRPC$Message tLRPC$Message;
        if (isWallpaperAction() && (tLRPC$Message = this.messageOwner) != null) {
            TLRPC$MessageAction tLRPC$MessageAction = tLRPC$Message.action;
            if ((tLRPC$MessageAction instanceof TLRPC$TL_messageActionSetChatWallPaper) && ((TLRPC$TL_messageActionSetChatWallPaper) tLRPC$MessageAction).for_both) {
                return true;
            }
        }
        return false;
    }

    public boolean isCurrentWallpaper() {
        TLRPC$Message tLRPC$Message;
        TLRPC$MessageAction tLRPC$MessageAction;
        TLRPC$UserFull userFull;
        TLRPC$WallPaper tLRPC$WallPaper;
        return (!isWallpaperAction() || (tLRPC$Message = this.messageOwner) == null || (tLRPC$MessageAction = tLRPC$Message.action) == null || tLRPC$MessageAction.wallpaper == null || (userFull = MessagesController.getInstance(this.currentAccount).getUserFull(getDialogId())) == null || (tLRPC$WallPaper = userFull.wallpaper) == null || !userFull.wallpaper_overridden || this.messageOwner.action.wallpaper.id != tLRPC$WallPaper.id) ? false : true;
    }

    public int getEmojiOnlyCount() {
        return this.emojiOnlyCount;
    }

    public boolean hasMediaSpoilers() {
        TLRPC$MessageMedia tLRPC$MessageMedia;
        return !this.isRepostPreview && (((tLRPC$MessageMedia = this.messageOwner.media) != null && tLRPC$MessageMedia.spoiler) || needDrawBluredPreview());
    }

    public boolean shouldDrawReactions() {
        return !this.isRepostPreview;
    }

    public TLRPC$MessagePeerReaction getRandomUnreadReaction() {
        ArrayList<TLRPC$MessagePeerReaction> arrayList;
        TLRPC$TL_messageReactions tLRPC$TL_messageReactions = this.messageOwner.reactions;
        if (tLRPC$TL_messageReactions == null || (arrayList = tLRPC$TL_messageReactions.recent_reactions) == null || arrayList.isEmpty()) {
            return null;
        }
        return this.messageOwner.reactions.recent_reactions.get(0);
    }

    public void markReactionsAsRead() {
        TLRPC$TL_messageReactions tLRPC$TL_messageReactions = this.messageOwner.reactions;
        if (tLRPC$TL_messageReactions == null || tLRPC$TL_messageReactions.recent_reactions == null) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.messageOwner.reactions.recent_reactions.size(); i++) {
            if (this.messageOwner.reactions.recent_reactions.get(i).unread) {
                this.messageOwner.reactions.recent_reactions.get(i).unread = false;
                z = true;
            }
        }
        if (z) {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            TLRPC$Message tLRPC$Message = this.messageOwner;
            messagesStorage.markMessageReactionsAsRead(tLRPC$Message.dialog_id, getTopicId(tLRPC$Message), this.messageOwner.id, true);
        }
    }

    public boolean isPremiumSticker() {
        if (getMedia(this.messageOwner) == null || !getMedia(this.messageOwner).nopremium) {
            return isPremiumSticker(getDocument());
        }
        return false;
    }

    public TLRPC$VideoSize getPremiumStickerAnimation() {
        return getPremiumStickerAnimation(getDocument());
    }

    public static TLRPC$VideoSize getPremiumStickerAnimation(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null && tLRPC$Document.thumbs != null) {
            for (int i = 0; i < tLRPC$Document.video_thumbs.size(); i++) {
                if ("f".equals(tLRPC$Document.video_thumbs.get(i).type)) {
                    return tLRPC$Document.video_thumbs.get(i);
                }
            }
        }
        return null;
    }

    public void copyStableParams(MessageObject messageObject) {
        ArrayList<TextLayoutBlock> arrayList;
        TLRPC$MessageMedia tLRPC$MessageMedia;
        ArrayList<TLRPC$ReactionCount> arrayList2;
        TLRPC$TL_messageReactions tLRPC$TL_messageReactions;
        this.stableId = messageObject.stableId;
        TLRPC$Message tLRPC$Message = this.messageOwner;
        tLRPC$Message.premiumEffectWasPlayed = messageObject.messageOwner.premiumEffectWasPlayed;
        this.forcePlayEffect = messageObject.forcePlayEffect;
        this.wasJustSent = messageObject.wasJustSent;
        TLRPC$TL_messageReactions tLRPC$TL_messageReactions2 = tLRPC$Message.reactions;
        if (tLRPC$TL_messageReactions2 != null && (arrayList2 = tLRPC$TL_messageReactions2.results) != null && !arrayList2.isEmpty() && (tLRPC$TL_messageReactions = messageObject.messageOwner.reactions) != null && tLRPC$TL_messageReactions.results != null) {
            for (int i = 0; i < this.messageOwner.reactions.results.size(); i++) {
                TLRPC$ReactionCount tLRPC$ReactionCount = this.messageOwner.reactions.results.get(i);
                for (int i2 = 0; i2 < messageObject.messageOwner.reactions.results.size(); i2++) {
                    TLRPC$ReactionCount tLRPC$ReactionCount2 = messageObject.messageOwner.reactions.results.get(i2);
                    if (ReactionsLayoutInBubble.equalsTLReaction(tLRPC$ReactionCount.reaction, tLRPC$ReactionCount2.reaction)) {
                        tLRPC$ReactionCount.lastDrawnPosition = tLRPC$ReactionCount2.lastDrawnPosition;
                    }
                }
            }
        }
        boolean z = messageObject.isSpoilersRevealed;
        this.isSpoilersRevealed = z;
        TLRPC$Message tLRPC$Message2 = this.messageOwner;
        TLRPC$Message tLRPC$Message3 = messageObject.messageOwner;
        tLRPC$Message2.replyStory = tLRPC$Message3.replyStory;
        TLRPC$MessageMedia tLRPC$MessageMedia2 = tLRPC$Message2.media;
        if (tLRPC$MessageMedia2 != null && (tLRPC$MessageMedia = tLRPC$Message3.media) != null) {
            tLRPC$MessageMedia2.storyItem = tLRPC$MessageMedia.storyItem;
        }
        if (!z || (arrayList = this.textLayoutBlocks) == null) {
            return;
        }
        Iterator<TextLayoutBlock> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().spoilers.clear();
        }
    }

    public ArrayList<ReactionsLayoutInBubble.VisibleReaction> getChoosenReactions() {
        ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList = new ArrayList<>();
        if (this.messageOwner.reactions == null) {
            return arrayList;
        }
        for (int i = 0; i < this.messageOwner.reactions.results.size(); i++) {
            if (this.messageOwner.reactions.results.get(i).chosen) {
                arrayList.add(ReactionsLayoutInBubble.VisibleReaction.fromTLReaction(this.messageOwner.reactions.results.get(i).reaction));
            }
        }
        return arrayList;
    }

    public boolean isReplyToStory() {
        TLRPC$Message tLRPC$Message;
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader;
        MessageObject messageObject = this.replyMessageObject;
        return ((messageObject != null && (messageObject.messageOwner instanceof TLRPC$TL_messageEmpty)) || (tLRPC$MessageReplyHeader = (tLRPC$Message = this.messageOwner).reply_to) == null || tLRPC$MessageReplyHeader.story_id == 0 || (tLRPC$Message.flags & 8) == 0) ? false : true;
    }

    public boolean isExpiredStory() {
        int i = this.type;
        return (i == 23 || i == 24) && (this.messageOwner.media.storyItem instanceof TL_stories$TL_storyItemDeleted);
    }

    public static class VCardData {
        private String company;
        private ArrayList<String> emails = new ArrayList<>();
        private ArrayList<String> phones = new ArrayList<>();

        public static CharSequence parse(String str) {
            byte[] decodeQuotedPrintable;
            try {
                BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
                boolean z = false;
                VCardData vCardData = null;
                String str2 = null;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (!readLine.startsWith("PHOTO")) {
                            if (readLine.indexOf(58) >= 0) {
                                if (readLine.startsWith("BEGIN:VCARD")) {
                                    vCardData = new VCardData();
                                } else if (readLine.startsWith("END:VCARD") && vCardData != null) {
                                    z = true;
                                }
                            }
                            if (str2 != null) {
                                readLine = str2 + readLine;
                                str2 = null;
                            }
                            if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                                str2 = readLine.substring(0, readLine.length() - 1);
                            } else {
                                int indexOf = readLine.indexOf(":");
                                int i = 2;
                                String[] strArr = indexOf >= 0 ? new String[]{readLine.substring(0, indexOf), readLine.substring(indexOf + 1).trim()} : new String[]{readLine.trim()};
                                if (strArr.length >= 2 && vCardData != null) {
                                    if (strArr[0].startsWith("ORG")) {
                                        String[] split = strArr[0].split(";");
                                        int length = split.length;
                                        int i2 = 0;
                                        String str3 = null;
                                        String str4 = null;
                                        while (i2 < length) {
                                            String[] split2 = split[i2].split("=");
                                            if (split2.length == i) {
                                                if (split2[0].equals("CHARSET")) {
                                                    str4 = split2[1];
                                                } else if (split2[0].equals("ENCODING")) {
                                                    str3 = split2[1];
                                                }
                                            }
                                            i2++;
                                            i = 2;
                                        }
                                        vCardData.company = strArr[1];
                                        if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (decodeQuotedPrintable = AndroidUtilities.decodeQuotedPrintable(AndroidUtilities.getStringBytes(vCardData.company))) != null && decodeQuotedPrintable.length != 0) {
                                            vCardData.company = new String(decodeQuotedPrintable, str4);
                                        }
                                        vCardData.company = vCardData.company.replace(';', ' ');
                                    } else if (strArr[0].startsWith("TEL")) {
                                        if (strArr[1].length() > 0) {
                                            vCardData.phones.add(strArr[1]);
                                        }
                                    } else if (strArr[0].startsWith("EMAIL")) {
                                        String str5 = strArr[1];
                                        if (str5.length() > 0) {
                                            vCardData.emails.add(str5);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        try {
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                }
                bufferedReader.close();
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < vCardData.phones.size(); i3++) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        String str6 = vCardData.phones.get(i3);
                        if (!str6.contains("#") && !str6.contains("*")) {
                            sb.append(PhoneFormat.getInstance().format(str6));
                        }
                        sb.append(str6);
                    }
                    for (int i4 = 0; i4 < vCardData.emails.size(); i4++) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(PhoneFormat.getInstance().format(vCardData.emails.get(i4)));
                    }
                    if (!TextUtils.isEmpty(vCardData.company)) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(vCardData.company);
                    }
                    return sb;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static class TextLayoutBlock {
        public static final int FLAG_NOT_RTL = 2;
        public static final int FLAG_RTL = 1;
        public int charactersEnd;
        public int charactersOffset;
        public boolean code;
        public Drawable copyIcon;
        public int copyIconColor;
        public Drawable copySelector;
        public int copySelectorColor;
        public Paint copySeparator;
        public Text copyText;
        public byte directionFlags;
        public boolean first;
        public boolean hasCodeCopyButton;
        public int height;
        public int heightByOffset;
        public String language;
        public int languageHeight;
        public Text languageLayout;
        public boolean last;
        public float maxRight;
        public int padBottom;
        public int padTop;
        public boolean quote;
        public StaticLayout textLayout;
        public float textYOffset;
        public AtomicReference<Layout> spoilersPatchedTextLayout = new AtomicReference<>();
        public List<SpoilerEffect> spoilers = new ArrayList();

        public void layoutCode(String str, int i, boolean z) {
            boolean z2 = i >= 75 && !z;
            this.hasCodeCopyButton = z2;
            if (z2) {
                this.copyText = new Text(LocaleController.getString(R.string.CopyCode).toUpperCase(), SharedConfig.fontSize - 3, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_copy).mutate();
                this.copyIcon = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(this.copyIconColor, PorterDuff.Mode.SRC_IN));
                this.copySelector = Theme.createRadSelectorDrawable(this.copySelectorColor, 0, 0, Math.min(5, SharedConfig.bubbleRadius), 0);
                this.copySeparator = new Paint(1);
            }
            if (TextUtils.isEmpty(str)) {
                this.language = null;
                this.languageLayout = null;
                return;
            }
            this.language = str;
            Text text = new Text(capitalizeLanguage(str), (SharedConfig.fontSize - 1) - (CodeHighlighting.getTextSizeDecrement(i) / 2), AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.languageLayout = text;
            this.languageHeight = ((int) (text.getTextSize() * 1.714f)) + AndroidUtilities.dp(4.0f);
        }

        public void drawCopyCodeButton(Canvas canvas, RectF rectF, int i, int i2, float f) {
            if (this.hasCodeCopyButton) {
                int multAlpha = Theme.multAlpha(i, 0.1f);
                if (this.copySelectorColor != multAlpha) {
                    Drawable drawable = this.copySelector;
                    this.copySelectorColor = multAlpha;
                    Theme.setSelectorDrawableColor(drawable, multAlpha, true);
                }
                this.copySelector.setBounds(((int) rectF.left) + AndroidUtilities.dp(3.0f), (int) (rectF.bottom - AndroidUtilities.dp(38.0f)), (int) rectF.right, (int) rectF.bottom);
                int i3 = (int) (255.0f * f);
                this.copySelector.setAlpha(i3);
                this.copySelector.draw(canvas);
                this.copySeparator.setColor(ColorUtils.setAlphaComponent(i2, 38));
                canvas.drawRect(AndroidUtilities.dp(10.0f) + rectF.left, (rectF.bottom - AndroidUtilities.dp(38.0f)) - AndroidUtilities.getShadowHeight(), rectF.right - AndroidUtilities.dp(6.66f), rectF.bottom - AndroidUtilities.dp(38.0f), this.copySeparator);
                float min = Math.min(rectF.width() - AndroidUtilities.dp(12.0f), (this.copyIcon.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f) + this.copyText.getCurrentWidth());
                float centerX = rectF.centerX() - (min / 2.0f);
                float dp = rectF.bottom - (AndroidUtilities.dp(38.0f) / 2.0f);
                if (this.copyIconColor != i) {
                    Drawable drawable2 = this.copyIcon;
                    this.copyIconColor = i;
                    drawable2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
                this.copyIcon.setAlpha(i3);
                Drawable drawable3 = this.copyIcon;
                drawable3.setBounds((int) centerX, (int) (dp - ((drawable3.getIntrinsicHeight() * 0.8f) / 2.0f)), (int) ((this.copyIcon.getIntrinsicWidth() * 0.8f) + centerX), (int) (((this.copyIcon.getIntrinsicHeight() * 0.8f) / 2.0f) + dp));
                this.copyIcon.draw(canvas);
                this.copyText.ellipsize(((int) (min - ((this.copyIcon.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f)))) + AndroidUtilities.dp(12.0f)).draw(canvas, centerX + (this.copyIcon.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f), dp, i, f);
            }
        }

        private static String capitalizeLanguage(String str) {
            if (str == null) {
                return null;
            }
            String replaceAll = str.toLowerCase().replaceAll("\\W", "");
            replaceAll.hashCode();
            char c = 65535;
            switch (replaceAll.hashCode()) {
                case -1886433663:
                    if (replaceAll.equals("actionscript")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1408289185:
                    if (replaceAll.equals("aspnet")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1351281305:
                    if (replaceAll.equals("csharp")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1326485984:
                    if (replaceAll.equals("docker")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1317317732:
                    if (replaceAll.equals("dockerfile")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1125574399:
                    if (replaceAll.equals("kotlin")) {
                        c = 5;
                        break;
                    }
                    break;
                case -995396628:
                    if (replaceAll.equals("pascal")) {
                        c = 6;
                        break;
                    }
                    break;
                case -973197092:
                    if (replaceAll.equals("python")) {
                        c = 7;
                        break;
                    }
                    break;
                case -746790872:
                    if (replaceAll.equals("arduino")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -522285947:
                    if (replaceAll.equals("typescript")) {
                        c = '\t';
                        break;
                    }
                    break;
                case R.styleable.AppCompatTheme_spinnerDropDownItemStyle:
                    if (replaceAll.equals("c")) {
                        c = '\n';
                        break;
                    }
                    break;
                case R.styleable.AppCompatTheme_tooltipForegroundColor:
                    if (replaceAll.equals("r")) {
                        c = 11;
                        break;
                    }
                    break;
                case 3184:
                    if (replaceAll.equals("cs")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 3401:
                    if (replaceAll.equals("js")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 3479:
                    if (replaceAll.equals("md")) {
                        c = 14;
                        break;
                    }
                    break;
                case 3593:
                    if (replaceAll.equals("py")) {
                        c = 15;
                        break;
                    }
                    break;
                case 3632:
                    if (replaceAll.equals("rb")) {
                        c = 16;
                        break;
                    }
                    break;
                case 3704:
                    if (replaceAll.equals("tl")) {
                        c = 17;
                        break;
                    }
                    break;
                case 3711:
                    if (replaceAll.equals("ts")) {
                        c = 18;
                        break;
                    }
                    break;
                case 96891:
                    if (replaceAll.equals("asm")) {
                        c = 19;
                        break;
                    }
                    break;
                case 98723:
                    if (replaceAll.equals("cpp")) {
                        c = 20;
                        break;
                    }
                    break;
                case 98819:
                    if (replaceAll.equals("css")) {
                        c = 21;
                        break;
                    }
                    break;
                case 98822:
                    if (replaceAll.equals("csv")) {
                        c = 22;
                        break;
                    }
                    break;
                case 104420:
                    if (replaceAll.equals("ini")) {
                        c = 23;
                        break;
                    }
                    break;
                case 105551:
                    if (replaceAll.equals("jsx")) {
                        c = 24;
                        break;
                    }
                    break;
                case 107512:
                    if (replaceAll.equals("lua")) {
                        c = 25;
                        break;
                    }
                    break;
                case 110968:
                    if (replaceAll.equals("php")) {
                        c = 26;
                        break;
                    }
                    break;
                case 114922:
                    if (replaceAll.equals("tlb")) {
                        c = 27;
                        break;
                    }
                    break;
                case 115161:
                    if (replaceAll.equals("tsx")) {
                        c = 28;
                        break;
                    }
                    break;
                case 118807:
                    if (replaceAll.equals("xml")) {
                        c = 29;
                        break;
                    }
                    break;
                case 119768:
                    if (replaceAll.equals("yml")) {
                        c = 30;
                        break;
                    }
                    break;
                case 3075967:
                    if (replaceAll.equals("dart")) {
                        c = 31;
                        break;
                    }
                    break;
                case 3142865:
                    if (replaceAll.equals("fift")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 3154628:
                    if (replaceAll.equals("func")) {
                        c = '!';
                        break;
                    }
                    break;
                case 3175934:
                    if (replaceAll.equals("glsl")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 3205725:
                    if (replaceAll.equals("hlsl")) {
                        c = '#';
                        break;
                    }
                    break;
                case 3213227:
                    if (replaceAll.equals("html")) {
                        c = '$';
                        break;
                    }
                    break;
                case 3213448:
                    if (replaceAll.equals("http")) {
                        c = '%';
                        break;
                    }
                    break;
                case 3254818:
                    if (replaceAll.equals("java")) {
                        c = '&';
                        break;
                    }
                    break;
                case 3271912:
                    if (replaceAll.equals("json")) {
                        c = '\'';
                        break;
                    }
                    break;
                case 3318169:
                    if (replaceAll.equals("less")) {
                        c = '(';
                        break;
                    }
                    break;
                case 3373901:
                    if (replaceAll.equals("nasm")) {
                        c = ')';
                        break;
                    }
                    break;
                case 3404364:
                    if (replaceAll.equals("objc")) {
                        c = '*';
                        break;
                    }
                    break;
                case 3511770:
                    if (replaceAll.equals("ruby")) {
                        c = '+';
                        break;
                    }
                    break;
                case 3512292:
                    if (replaceAll.equals("rust")) {
                        c = ',';
                        break;
                    }
                    break;
                case 3524784:
                    if (replaceAll.equals("scss")) {
                        c = '-';
                        break;
                    }
                    break;
                case 3561037:
                    if (replaceAll.equals("tl-b")) {
                        c = '.';
                        break;
                    }
                    break;
                case 3642020:
                    if (replaceAll.equals("wasm")) {
                        c = '/';
                        break;
                    }
                    break;
                case 3701415:
                    if (replaceAll.equals("yaml")) {
                        c = '0';
                        break;
                    }
                    break;
                case 94833107:
                    if (replaceAll.equals("cobol")) {
                        c = '1';
                        break;
                    }
                    break;
                case 101429325:
                    if (replaceAll.equals("json5")) {
                        c = '2';
                        break;
                    }
                    break;
                case 109854227:
                    if (replaceAll.equals("swift")) {
                        c = '3';
                        break;
                    }
                    break;
                case 188995949:
                    if (replaceAll.equals("javascript")) {
                        c = '4';
                        break;
                    }
                    break;
                case 213985633:
                    if (replaceAll.equals("autohotkey")) {
                        c = '5';
                        break;
                    }
                    break;
                case 246938863:
                    if (replaceAll.equals("markdown")) {
                        c = '6';
                        break;
                    }
                    break;
                case 1067478602:
                    if (replaceAll.equals("objectivec")) {
                        c = '7';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return "ActionScript";
                case 1:
                    return "ASP.NET";
                case 2:
                case '\f':
                    return "C#";
                case 3:
                case 4:
                case 5:
                case 6:
                case '\b':
                case '\n':
                case 25:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable:
                case ' ':
                case R.styleable.AppCompatTheme_alertDialogTheme:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle:
                case R.styleable.AppCompatTheme_colorBackgroundFloating:
                    return capitalizeFirst(str);
                case 7:
                case 15:
                    return "Python";
                case '\t':
                case 18:
                    return "TypeScript";
                case 11:
                case 17:
                case 19:
                case 21:
                case 22:
                case 23:
                case 24:
                case 26:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme:
                case R.styleable.AppCompatTheme_activityChooserViewStyle:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons:
                case R.styleable.AppCompatTheme_alertDialogStyle:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle:
                case R.styleable.AppCompatTheme_borderlessButtonStyle:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle:
                case R.styleable.AppCompatTheme_buttonBarStyle:
                case R.styleable.AppCompatTheme_buttonStyleSmall:
                case R.styleable.AppCompatTheme_checkboxStyle:
                case R.styleable.AppCompatTheme_checkedTextViewStyle:
                case R.styleable.AppCompatTheme_colorAccent:
                    return str.toUpperCase();
                case '\r':
                case R.styleable.AppCompatTheme_colorButtonNormal:
                    return "JavaScript";
                case 14:
                case R.styleable.AppCompatTheme_colorControlHighlight:
                    return "Markdown";
                case 16:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle:
                    return "Ruby";
                case 20:
                    return "C++";
                case 27:
                case R.styleable.AppCompatTheme_buttonStyle:
                    return "TL-B";
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle:
                    return "FunC";
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle:
                case R.styleable.AppCompatTheme_colorControlNormal:
                    return "Objective-C";
                case R.styleable.AppCompatTheme_colorControlActivated:
                    return "AutoHotKey";
                default:
                    return str;
            }
        }

        private static String capitalizeFirst(String str) {
            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }

        public boolean isRtl() {
            byte b = this.directionFlags;
            return (b & 1) != 0 && (b & 2) == 0;
        }
    }

    public static class GroupedMessagePosition {
        public float aspectRatio;
        public boolean edge;
        public int flags;
        public boolean last;
        public float left;
        public int leftSpanOffset;
        public byte maxX;
        public byte maxY;
        public byte minX;
        public byte minY;
        public float ph;
        public int pw;
        public float[] siblingHeights;
        public int spanSize;
        public float top;

        public void set(int i, int i2, int i3, int i4, int i5, float f, int i6) {
            this.minX = (byte) i;
            this.maxX = (byte) i2;
            this.minY = (byte) i3;
            this.maxY = (byte) i4;
            this.pw = i5;
            this.spanSize = i5;
            this.ph = f;
            this.flags = (byte) i6;
        }
    }

    public static class GroupedMessages {
        public MessageObject captionMessage;
        public long groupId;
        public boolean hasCaption;
        public boolean hasSibling;
        public boolean isDocuments;
        public ArrayList<MessageObject> messages = new ArrayList<>();
        public ArrayList<GroupedMessagePosition> posArray = new ArrayList<>();
        public HashMap<MessageObject, GroupedMessagePosition> positions = new HashMap<>();
        private int maxSizeWidth = 800;
        public final TransitionParams transitionParams = new TransitionParams();

        public static class MessageGroupedLayoutAttempt {
            public float[] heights;
            public int[] lineCounts;

            public MessageGroupedLayoutAttempt(int i, int i2, float f, float f2) {
                this.lineCounts = new int[]{i, i2};
                this.heights = new float[]{f, f2};
            }

            public MessageGroupedLayoutAttempt(int i, int i2, int i3, float f, float f2, float f3) {
                this.lineCounts = new int[]{i, i2, i3};
                this.heights = new float[]{f, f2, f3};
            }

            public MessageGroupedLayoutAttempt(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
                this.lineCounts = new int[]{i, i2, i3, i4};
                this.heights = new float[]{f, f2, f3, f4};
            }
        }

        private float multiHeight(float[] fArr, int i, int i2) {
            float f = 0.0f;
            while (i < i2) {
                f += fArr[i];
                i++;
            }
            return this.maxSizeWidth / f;
        }

        public void calculate() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.GroupedMessages.calculate():void");
        }

        public MessageObject findPrimaryMessageObject() {
            return findMessageWithFlags(5);
        }

        public MessageObject findCaptionMessageObject() {
            if (!this.messages.isEmpty() && this.positions.isEmpty()) {
                calculate();
            }
            MessageObject messageObject = null;
            for (int i = 0; i < this.messages.size(); i++) {
                MessageObject messageObject2 = this.messages.get(i);
                if (!TextUtils.isEmpty(messageObject2.caption)) {
                    if (messageObject != null) {
                        return null;
                    }
                    messageObject = messageObject2;
                }
            }
            return messageObject;
        }

        public MessageObject findMessageWithFlags(int i) {
            if (!this.messages.isEmpty() && this.positions.isEmpty()) {
                calculate();
            }
            for (int i2 = 0; i2 < this.messages.size(); i2++) {
                MessageObject messageObject = this.messages.get(i2);
                GroupedMessagePosition groupedMessagePosition = this.positions.get(messageObject);
                if (groupedMessagePosition != null && (groupedMessagePosition.flags & i) == i) {
                    return messageObject;
                }
            }
            return null;
        }

        public static class TransitionParams {
            public boolean backgroundChangeBounds;
            public int bottom;
            public float captionEnterProgress = 1.0f;
            public ChatMessageCell cell;
            public boolean drawBackgroundForDeletedItems;
            public boolean drawCaptionLayout;
            public boolean isNewGroup;
            public int left;
            public float offsetBottom;
            public float offsetLeft;
            public float offsetRight;
            public float offsetTop;
            public boolean pinnedBotton;
            public boolean pinnedTop;
            public int right;
            public int top;

            public void reset() {
                this.captionEnterProgress = 1.0f;
                this.offsetBottom = 0.0f;
                this.offsetTop = 0.0f;
                this.offsetRight = 0.0f;
                this.offsetLeft = 0.0f;
                this.backgroundChangeBounds = false;
            }
        }

        public boolean contains(int i) {
            if (this.messages == null) {
                return false;
            }
            for (int i2 = 0; i2 < this.messages.size(); i2++) {
                MessageObject messageObject = this.messages.get(i2);
                if (messageObject != null && messageObject.getId() == i) {
                    return true;
                }
            }
            return false;
        }
    }

    public MessageObject(int i, TL_stories$StoryItem tL_stories$StoryItem) {
        this.type = 1000;
        this.forceSeekTo = -1.0f;
        this.overrideLinkColor = -1;
        this.overrideLinkEmoji = -1L;
        this.topicIconDrawable = new Drawable[1];
        this.spoiledLoginCode = false;
        this.translated = false;
        this.currentAccount = i;
        this.storyItem = tL_stories$StoryItem;
        if (tL_stories$StoryItem != null) {
            TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
            this.messageOwner = tLRPC$TL_message;
            tLRPC$TL_message.id = tL_stories$StoryItem.id;
            tLRPC$TL_message.date = tL_stories$StoryItem.date;
            tLRPC$TL_message.dialog_id = tL_stories$StoryItem.dialogId;
            tLRPC$TL_message.message = tL_stories$StoryItem.caption;
            tLRPC$TL_message.entities = tL_stories$StoryItem.entities;
            tLRPC$TL_message.media = tL_stories$StoryItem.media;
            tLRPC$TL_message.attachPath = tL_stories$StoryItem.attachPath;
        }
        this.photoThumbs = new ArrayList<>();
        this.photoThumbs2 = new ArrayList<>();
    }

    public MessageObject(int i, TLRPC$Message tLRPC$Message, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.type = 1000;
        this.forceSeekTo = -1.0f;
        this.overrideLinkColor = -1;
        this.overrideLinkEmoji = -1L;
        this.topicIconDrawable = new Drawable[1];
        this.spoiledLoginCode = false;
        this.translated = false;
        this.localType = z ? 2 : 1;
        this.currentAccount = i;
        this.localName = str2;
        this.localUserName = str3;
        this.messageText = str;
        this.messageOwner = tLRPC$Message;
        this.localChannel = z2;
        this.localSupergroup = z3;
        this.localEdit = z4;
    }

    public MessageObject(int i, TLRPC$Message tLRPC$Message, AbstractMap<Long, TLRPC$User> abstractMap, boolean z, boolean z2) {
        this(i, tLRPC$Message, abstractMap, (AbstractMap<Long, TLRPC$Chat>) null, z, z2);
    }

    public MessageObject(int i, TLRPC$Message tLRPC$Message, LongSparseArray<TLRPC$User> longSparseArray, boolean z, boolean z2) {
        this(i, tLRPC$Message, longSparseArray, (LongSparseArray<TLRPC$Chat>) null, z, z2);
    }

    public MessageObject(int i, TLRPC$Message tLRPC$Message, boolean z, boolean z2) {
        this(i, tLRPC$Message, null, null, null, null, null, z, z2, 0L);
    }

    public MessageObject(int i, TLRPC$Message tLRPC$Message, MessageObject messageObject, boolean z, boolean z2) {
        this(i, tLRPC$Message, messageObject, null, null, null, null, z, z2, 0L);
    }

    public MessageObject(int i, TLRPC$Message tLRPC$Message, AbstractMap<Long, TLRPC$User> abstractMap, AbstractMap<Long, TLRPC$Chat> abstractMap2, boolean z, boolean z2) {
        this(i, tLRPC$Message, abstractMap, abstractMap2, z, z2, 0L);
    }

    public MessageObject(int i, TLRPC$Message tLRPC$Message, LongSparseArray<TLRPC$User> longSparseArray, LongSparseArray<TLRPC$Chat> longSparseArray2, boolean z, boolean z2) {
        this(i, tLRPC$Message, null, null, null, longSparseArray, longSparseArray2, z, z2, 0L);
    }

    public MessageObject(int i, TLRPC$Message tLRPC$Message, AbstractMap<Long, TLRPC$User> abstractMap, AbstractMap<Long, TLRPC$Chat> abstractMap2, boolean z, boolean z2, long j) {
        this(i, tLRPC$Message, null, abstractMap, abstractMap2, null, null, z, z2, j);
    }

    public MessageObject(int i, TLRPC$Message tLRPC$Message, MessageObject messageObject, AbstractMap<Long, TLRPC$User> abstractMap, AbstractMap<Long, TLRPC$Chat> abstractMap2, LongSparseArray<TLRPC$User> longSparseArray, LongSparseArray<TLRPC$Chat> longSparseArray2, boolean z, boolean z2, long j) {
        this(i, tLRPC$Message, messageObject, abstractMap, abstractMap2, longSparseArray, longSparseArray2, z, z2, j, false, false);
    }

    public MessageObject(int i, TLRPC$Message tLRPC$Message, MessageObject messageObject, AbstractMap<Long, TLRPC$User> abstractMap, AbstractMap<Long, TLRPC$Chat> abstractMap2, LongSparseArray<TLRPC$User> longSparseArray, LongSparseArray<TLRPC$Chat> longSparseArray2, boolean z, boolean z2, long j, boolean z3, boolean z4) {
        TextPaint textPaint;
        this.type = 1000;
        this.forceSeekTo = -1.0f;
        this.overrideLinkColor = -1;
        this.overrideLinkEmoji = -1L;
        this.topicIconDrawable = new Drawable[1];
        this.spoiledLoginCode = false;
        this.translated = false;
        Theme.createCommonMessageResources();
        this.isRepostPreview = z3;
        this.isRepostVideoPreview = z4;
        this.currentAccount = i;
        this.messageOwner = tLRPC$Message;
        this.replyMessageObject = messageObject;
        this.eventId = j;
        this.wasUnread = !tLRPC$Message.out && tLRPC$Message.unread;
        TLRPC$Message tLRPC$Message2 = tLRPC$Message.replyMessage;
        if (tLRPC$Message2 != null) {
            this.replyMessageObject = new MessageObject(i, tLRPC$Message2, null, abstractMap, abstractMap2, longSparseArray, longSparseArray2, false, z2, j);
        }
        TLRPC$Peer tLRPC$Peer = tLRPC$Message.from_id;
        if (tLRPC$Peer instanceof TLRPC$TL_peerUser) {
            getUser(abstractMap, longSparseArray, tLRPC$Peer.user_id);
        }
        updateMessageText(abstractMap, abstractMap2, longSparseArray, longSparseArray2);
        setType();
        if (z) {
            updateTranslation(false);
        }
        measureInlineBotButtons();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.messageOwner.date * 1000);
        int i2 = gregorianCalendar.get(6);
        int i3 = gregorianCalendar.get(1);
        int i4 = gregorianCalendar.get(2);
        this.dateKey = String.format("%d_%02d_%02d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2));
        this.monthKey = String.format("%d_%02d", Integer.valueOf(i3), Integer.valueOf(i4));
        createMessageSendInfo();
        generateCaption();
        if (z) {
            if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaGame) {
                textPaint = Theme.chat_msgGameTextPaint;
            } else {
                textPaint = Theme.chat_msgTextPaint;
            }
            int[] iArr = allowsBigEmoji() ? new int[1] : null;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.messageText, textPaint.getFontMetricsInt(), false, iArr);
            this.messageText = replaceEmoji;
            Spannable replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, textPaint.getFontMetricsInt());
            this.messageText = replaceAnimatedEmoji;
            if (iArr != null && iArr[0] > 1) {
                replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr);
            }
            checkEmojiOnly(iArr);
            checkBigAnimatedEmoji();
            setType();
            createPathThumb();
        }
        this.layoutCreated = z;
        generateThumbs(false);
        if (z2) {
            checkMediaExistance();
        }
    }

    private void checkBigAnimatedEmoji() {
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        int i;
        this.emojiAnimatedSticker = null;
        this.emojiAnimatedStickerId = null;
        if (this.emojiOnlyCount == 1 && !(getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) && !(getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaInvoice) && ((getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaEmpty) || getMedia(this.messageOwner) == null)) {
            TLRPC$Message tLRPC$Message = this.messageOwner;
            if (tLRPC$Message.grouped_id == 0) {
                if (tLRPC$Message.entities.isEmpty()) {
                    String str = this.messageText;
                    int indexOf = TextUtils.indexOf(str, "🏻");
                    if (indexOf >= 0) {
                        this.emojiAnimatedStickerColor = "_c1";
                        str = str.subSequence(0, indexOf);
                    } else {
                        indexOf = TextUtils.indexOf(str, "🏼");
                        if (indexOf >= 0) {
                            this.emojiAnimatedStickerColor = "_c2";
                            str = str.subSequence(0, indexOf);
                        } else {
                            indexOf = TextUtils.indexOf(str, "🏽");
                            if (indexOf >= 0) {
                                this.emojiAnimatedStickerColor = "_c3";
                                str = str.subSequence(0, indexOf);
                            } else {
                                indexOf = TextUtils.indexOf(str, "🏾");
                                if (indexOf >= 0) {
                                    this.emojiAnimatedStickerColor = "_c4";
                                    str = str.subSequence(0, indexOf);
                                } else {
                                    indexOf = TextUtils.indexOf(str, "🏿");
                                    if (indexOf >= 0) {
                                        this.emojiAnimatedStickerColor = "_c5";
                                        str = str.subSequence(0, indexOf);
                                    } else {
                                        this.emojiAnimatedStickerColor = "";
                                    }
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(this.emojiAnimatedStickerColor) && (i = indexOf + 2) < this.messageText.length()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str.toString());
                        CharSequence charSequence = this.messageText;
                        sb.append(charSequence.subSequence(i, charSequence.length()).toString());
                        str = sb.toString();
                    }
                    if (TextUtils.isEmpty(this.emojiAnimatedStickerColor) || EmojiData.emojiColoredMap.contains(str.toString())) {
                        this.emojiAnimatedSticker = MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(str);
                    }
                } else if (this.messageOwner.entities.size() == 1 && (this.messageOwner.entities.get(0) instanceof TLRPC$TL_messageEntityCustomEmoji)) {
                    try {
                        Long valueOf = Long.valueOf(((TLRPC$TL_messageEntityCustomEmoji) this.messageOwner.entities.get(0)).document_id);
                        this.emojiAnimatedStickerId = valueOf;
                        TLRPC$Document findDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, valueOf.longValue());
                        this.emojiAnimatedSticker = findDocument;
                        if (findDocument == null) {
                            CharSequence charSequence2 = this.messageText;
                            if ((charSequence2 instanceof Spanned) && (animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) charSequence2).getSpans(0, charSequence2.length(), AnimatedEmojiSpan.class)) != null && animatedEmojiSpanArr.length == 1) {
                                this.emojiAnimatedSticker = animatedEmojiSpanArr[0].document;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (this.emojiAnimatedSticker == null && this.emojiAnimatedStickerId == null) {
            generateLayout(null);
        } else if (isSticker()) {
            this.type = 13;
        } else if (isAnimatedSticker()) {
            this.type = 15;
        } else {
            this.type = 1000;
        }
    }

    private void createPathThumb() {
        TLRPC$Document document = getDocument();
        if (document == null) {
            return;
        }
        this.pathThumb = DocumentObject.getSvgThumb(document, Theme.key_chat_serviceBackground, 1.0f);
    }

    public void createStrippedThumb() {
        if (this.photoThumbs != null) {
            if ((canCreateStripedThubms() || hasExtendedMediaPreview()) && this.strippedThumb == null) {
                try {
                    int size = this.photoThumbs.size();
                    for (int i = 0; i < size; i++) {
                        TLRPC$PhotoSize tLRPC$PhotoSize = this.photoThumbs.get(i);
                        if (tLRPC$PhotoSize instanceof TLRPC$TL_photoStrippedSize) {
                            this.strippedThumb = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), ImageLoader.getStrippedPhotoBitmap(tLRPC$PhotoSize.bytes, "b"));
                            return;
                        }
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
        }
    }

    private void createDateArray(int i, TLRPC$TL_channelAdminLogEvent tLRPC$TL_channelAdminLogEvent, ArrayList<MessageObject> arrayList, HashMap<String, ArrayList<MessageObject>> hashMap, boolean z) {
        if (hashMap.get(this.dateKey) == null) {
            hashMap.put(this.dateKey, new ArrayList<>());
            TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
            tLRPC$TL_message.message = LocaleController.formatDateChat(tLRPC$TL_channelAdminLogEvent.date);
            tLRPC$TL_message.id = 0;
            tLRPC$TL_message.date = tLRPC$TL_channelAdminLogEvent.date;
            MessageObject messageObject = new MessageObject(i, tLRPC$TL_message, false, false);
            messageObject.type = 10;
            messageObject.contentType = 1;
            messageObject.isDateObject = true;
            if (z) {
                arrayList.add(0, messageObject);
            } else {
                arrayList.add(messageObject);
            }
        }
    }

    private void checkEmojiOnly(int[] iArr) {
        checkEmojiOnly(iArr == null ? null : Integer.valueOf(iArr[0]));
    }

    private void checkEmojiOnly(Integer num) {
        TextPaint textPaint;
        if (num != null && num.intValue() >= 1 && this.messageOwner != null && !hasNonEmojiEntities()) {
            CharSequence charSequence = this.messageText;
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), Emoji.EmojiSpan.class);
            CharSequence charSequence2 = this.messageText;
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spannable) charSequence2).getSpans(0, charSequence2.length(), AnimatedEmojiSpan.class);
            this.emojiOnlyCount = Math.max(num.intValue(), (emojiSpanArr == null ? 0 : emojiSpanArr.length) + (animatedEmojiSpanArr == null ? 0 : animatedEmojiSpanArr.length));
            this.totalAnimatedEmojiCount = animatedEmojiSpanArr == null ? 0 : animatedEmojiSpanArr.length;
            this.animatedEmojiCount = 0;
            if (animatedEmojiSpanArr != null) {
                for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                    if (!animatedEmojiSpan.standard) {
                        this.animatedEmojiCount++;
                    }
                }
            }
            int i = this.emojiOnlyCount;
            boolean z = (i - (emojiSpanArr == null ? 0 : emojiSpanArr.length)) - (animatedEmojiSpanArr == null ? 0 : animatedEmojiSpanArr.length) > 0;
            this.hasUnwrappedEmoji = z;
            if (i == 0 || z) {
                if (animatedEmojiSpanArr == null || animatedEmojiSpanArr.length <= 0) {
                    return;
                }
                for (int i2 = 0; i2 < animatedEmojiSpanArr.length; i2++) {
                    animatedEmojiSpanArr[i2].replaceFontMetrics(Theme.chat_msgTextPaint.getFontMetricsInt(), (int) (Theme.chat_msgTextPaint.getTextSize() + AndroidUtilities.dp(4.0f)), -1);
                    animatedEmojiSpanArr[i2].full = false;
                }
                return;
            }
            int i3 = this.animatedEmojiCount;
            boolean z2 = i == i3;
            int i4 = 2;
            switch (Math.max(i, i3)) {
                case 0:
                case 1:
                case 2:
                    TextPaint[] textPaintArr = Theme.chat_msgTextPaintEmoji;
                    textPaint = z2 ? textPaintArr[0] : textPaintArr[2];
                    i4 = 1;
                    break;
                case 3:
                    TextPaint[] textPaintArr2 = Theme.chat_msgTextPaintEmoji;
                    textPaint = z2 ? textPaintArr2[1] : textPaintArr2[3];
                    i4 = 1;
                    break;
                case 4:
                    TextPaint[] textPaintArr3 = Theme.chat_msgTextPaintEmoji;
                    textPaint = z2 ? textPaintArr3[2] : textPaintArr3[4];
                    i4 = 1;
                    break;
                case 5:
                    TextPaint[] textPaintArr4 = Theme.chat_msgTextPaintEmoji;
                    if (z2) {
                        textPaint = textPaintArr4[3];
                        break;
                    } else {
                        textPaint = textPaintArr4[5];
                        break;
                    }
                case 6:
                    TextPaint[] textPaintArr5 = Theme.chat_msgTextPaintEmoji;
                    if (z2) {
                        textPaint = textPaintArr5[4];
                        break;
                    } else {
                        textPaint = textPaintArr5[5];
                        break;
                    }
                default:
                    int i5 = this.emojiOnlyCount > 9 ? 0 : -1;
                    textPaint = Theme.chat_msgTextPaintEmoji[5];
                    i4 = i5;
                    break;
            }
            int textSize = (int) (textPaint.getTextSize() + AndroidUtilities.dp(4.0f));
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                    emojiSpan.replaceFontMetrics(textPaint.getFontMetricsInt(), textSize);
                }
            }
            if (animatedEmojiSpanArr == null || animatedEmojiSpanArr.length <= 0) {
                return;
            }
            for (int i6 = 0; i6 < animatedEmojiSpanArr.length; i6++) {
                animatedEmojiSpanArr[i6].replaceFontMetrics(textPaint.getFontMetricsInt(), textSize, i4);
                animatedEmojiSpanArr[i6].full = true;
            }
            return;
        }
        CharSequence charSequence3 = this.messageText;
        AnimatedEmojiSpan[] animatedEmojiSpanArr2 = (AnimatedEmojiSpan[]) ((Spannable) charSequence3).getSpans(0, charSequence3.length(), AnimatedEmojiSpan.class);
        if (animatedEmojiSpanArr2 != null && animatedEmojiSpanArr2.length > 0) {
            this.totalAnimatedEmojiCount = animatedEmojiSpanArr2.length;
            for (int i7 = 0; i7 < animatedEmojiSpanArr2.length; i7++) {
                animatedEmojiSpanArr2[i7].replaceFontMetrics(Theme.chat_msgTextPaint.getFontMetricsInt(), (int) (Theme.chat_msgTextPaint.getTextSize() + AndroidUtilities.dp(4.0f)), -1);
                animatedEmojiSpanArr2[i7].full = false;
            }
            return;
        }
        this.totalAnimatedEmojiCount = 0;
    }

    public MessageObject(int r30, org.telegram.tgnet.TLRPC$TL_channelAdminLogEvent r31, java.util.ArrayList<org.telegram.messenger.MessageObject> r32, java.util.HashMap<java.lang.String, java.util.ArrayList<org.telegram.messenger.MessageObject>> r33, org.telegram.tgnet.TLRPC$Chat r34, int[] r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.<init>(int, org.telegram.tgnet.TLRPC$TL_channelAdminLogEvent, java.util.ArrayList, java.util.HashMap, org.telegram.tgnet.TLRPC$Chat, int[], boolean):void");
    }

    public void spoilLoginCode() {
        TLRPC$Message tLRPC$Message;
        if (this.spoiledLoginCode || this.messageText == null || (tLRPC$Message = this.messageOwner) == null || tLRPC$Message.entities == null) {
            return;
        }
        TLRPC$Peer tLRPC$Peer = tLRPC$Message.from_id;
        if ((tLRPC$Peer instanceof TLRPC$TL_peerUser) && tLRPC$Peer.user_id == 777000) {
            if (loginCodePattern == null) {
                loginCodePattern = Pattern.compile("[\\d\\-]{5,7}");
            }
            try {
                Matcher matcher = loginCodePattern.matcher(this.messageText);
                if (matcher.find()) {
                    TLRPC$TL_messageEntitySpoiler tLRPC$TL_messageEntitySpoiler = new TLRPC$TL_messageEntitySpoiler();
                    tLRPC$TL_messageEntitySpoiler.offset = matcher.start();
                    tLRPC$TL_messageEntitySpoiler.length = matcher.end() - tLRPC$TL_messageEntitySpoiler.offset;
                    this.messageOwner.entities.add(tLRPC$TL_messageEntitySpoiler);
                }
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            this.spoiledLoginCode = true;
        }
    }

    public boolean didSpoilLoginCode() {
        return this.spoiledLoginCode;
    }

    private CharSequence getStringFrom(TLRPC$ChatReactions tLRPC$ChatReactions) {
        if (tLRPC$ChatReactions instanceof TLRPC$TL_chatReactionsAll) {
            return LocaleController.getString("AllReactions", R.string.AllReactions);
        }
        if (tLRPC$ChatReactions instanceof TLRPC$TL_chatReactionsSome) {
            TLRPC$TL_chatReactionsSome tLRPC$TL_chatReactionsSome = (TLRPC$TL_chatReactionsSome) tLRPC$ChatReactions;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < tLRPC$TL_chatReactionsSome.reactions.size(); i++) {
                if (i != 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append(ReactionsUtils.reactionToCharSequence(tLRPC$TL_chatReactionsSome.reactions.get(i)));
            }
        }
        return LocaleController.getString("NoReactions", R.string.NoReactions);
    }

    private String getUsernamesString(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return LocaleController.getString("UsernameEmpty", R.string.UsernameEmpty).toLowerCase();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append("@");
            sb.append(arrayList.get(i));
            if (i < arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private String getUserName(TLObject tLObject, ArrayList<TLRPC$MessageEntity> arrayList, int i) {
        String str;
        String publicUsername;
        long j;
        String str2;
        long j2;
        String formatName;
        if (tLObject == null) {
            str2 = null;
            j2 = 0;
            str = "";
        } else {
            if (tLObject instanceof TLRPC$User) {
                TLRPC$User tLRPC$User = (TLRPC$User) tLObject;
                if (tLRPC$User.deleted) {
                    formatName = LocaleController.getString("HiddenName", R.string.HiddenName);
                } else {
                    formatName = ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name);
                }
                str = formatName;
                publicUsername = UserObject.getPublicUsername(tLRPC$User);
                j = tLRPC$User.id;
            } else {
                TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLObject;
                str = tLRPC$Chat.title;
                publicUsername = ChatObject.getPublicUsername(tLRPC$Chat);
                j = -tLRPC$Chat.id;
            }
            str2 = publicUsername;
            j2 = j;
        }
        if (i >= 0) {
            TLRPC$TL_messageEntityMentionName tLRPC$TL_messageEntityMentionName = new TLRPC$TL_messageEntityMentionName();
            tLRPC$TL_messageEntityMentionName.user_id = j2;
            tLRPC$TL_messageEntityMentionName.offset = i;
            tLRPC$TL_messageEntityMentionName.length = str.length();
            arrayList.add(tLRPC$TL_messageEntityMentionName);
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if (i >= 0) {
            TLRPC$TL_messageEntityMentionName tLRPC$TL_messageEntityMentionName2 = new TLRPC$TL_messageEntityMentionName();
            tLRPC$TL_messageEntityMentionName2.user_id = j2;
            tLRPC$TL_messageEntityMentionName2.offset = i + str.length() + 2;
            tLRPC$TL_messageEntityMentionName2.length = str2.length() + 1;
            arrayList.add(tLRPC$TL_messageEntityMentionName2);
        }
        return String.format("%1$s (@%2$s)", str, str2);
    }

    public boolean updateTranslation() {
        return updateTranslation(false);
    }

    public boolean updateTranslation(boolean z) {
        TLRPC$Message tLRPC$Message;
        MessageObject messageObject = this.replyMessageObject;
        boolean z2 = messageObject != null && messageObject.updateTranslation(z);
        TranslateController translateController = MessagesController.getInstance(this.currentAccount).getTranslateController();
        if (TranslateController.isTranslatable(this) && translateController.isTranslatingDialog(getDialogId()) && (tLRPC$Message = this.messageOwner) != null && tLRPC$Message.translatedText != null && TextUtils.equals(translateController.getDialogTranslateTo(getDialogId()), this.messageOwner.translatedToLanguage)) {
            if (this.translated) {
                return z2;
            }
            this.translated = true;
            applyNewText(this.messageOwner.translatedText.text);
            generateCaption();
            return true;
        }
        TLRPC$Message tLRPC$Message2 = this.messageOwner;
        if (tLRPC$Message2 == null || !(z || this.translated)) {
            return z2;
        }
        this.translated = false;
        applyNewText(tLRPC$Message2.message);
        generateCaption();
        return true;
    }

    public void applyNewText() {
        this.translated = false;
        applyNewText(this.messageOwner.message);
    }

    public void applyNewText(CharSequence charSequence) {
        TextPaint textPaint;
        TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        TLRPC$User user = isFromUser() ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id)) : null;
        this.messageText = charSequence;
        ArrayList<TLRPC$MessageEntity> arrayList = (!this.translated || (tLRPC$TL_textWithEntities = this.messageOwner.translatedText) == null) ? this.messageOwner.entities : tLRPC$TL_textWithEntities.entities;
        if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaGame) {
            textPaint = Theme.chat_msgGameTextPaint;
        } else {
            textPaint = Theme.chat_msgTextPaint;
        }
        int[] iArr = allowsBigEmoji() ? new int[1] : null;
        CharSequence replaceEmoji = Emoji.replaceEmoji(this.messageText, textPaint.getFontMetricsInt(), false, iArr);
        this.messageText = replaceEmoji;
        Spannable replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, arrayList, textPaint.getFontMetricsInt());
        this.messageText = replaceAnimatedEmoji;
        if (iArr != null && iArr[0] > 1) {
            replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr);
        }
        checkEmojiOnly(iArr);
        generateLayout(user);
        setType();
    }

    private boolean allowsBigEmoji() {
        TLRPC$Peer tLRPC$Peer;
        if (SharedConfig.allowBigEmoji) {
            TLRPC$Message tLRPC$Message = this.messageOwner;
            if (tLRPC$Message == null || (tLRPC$Peer = tLRPC$Message.peer_id) == null || (tLRPC$Peer.channel_id == 0 && tLRPC$Peer.chat_id == 0)) {
                return true;
            }
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            TLRPC$Peer tLRPC$Peer2 = this.messageOwner.peer_id;
            long j = tLRPC$Peer2.channel_id;
            if (j == 0) {
                j = tLRPC$Peer2.chat_id;
            }
            TLRPC$Chat chat = messagesController.getChat(Long.valueOf(j));
            return (chat != null && chat.gigagroup) || !ChatObject.isActionBanned(chat, 8) || ChatObject.hasAdminRights(chat);
        }
        return false;
    }

    public void generateGameMessageText(TLRPC$User tLRPC$User) {
        if (tLRPC$User == null && isFromUser()) {
            tLRPC$User = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
        }
        TLRPC$TL_game tLRPC$TL_game = null;
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null && getMedia(messageObject) != null && getMedia(this.replyMessageObject).game != null) {
            tLRPC$TL_game = getMedia(this.replyMessageObject).game;
        }
        if (tLRPC$TL_game == null) {
            if (tLRPC$User == null || tLRPC$User.id != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.messageText = replaceWithLink(LocaleController.formatString("ActionUserScored", R.string.ActionUserScored, LocaleController.formatPluralString("Points", this.messageOwner.action.score, new Object[0])), "un1", tLRPC$User);
                return;
            } else {
                this.messageText = LocaleController.formatString("ActionYouScored", R.string.ActionYouScored, LocaleController.formatPluralString("Points", this.messageOwner.action.score, new Object[0]));
                return;
            }
        }
        if (tLRPC$User == null || tLRPC$User.id != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            this.messageText = replaceWithLink(LocaleController.formatString("ActionUserScoredInGame", R.string.ActionUserScoredInGame, LocaleController.formatPluralString("Points", this.messageOwner.action.score, new Object[0])), "un1", tLRPC$User);
        } else {
            this.messageText = LocaleController.formatString("ActionYouScoredInGame", R.string.ActionYouScoredInGame, LocaleController.formatPluralString("Points", this.messageOwner.action.score, new Object[0]));
        }
        this.messageText = replaceWithLink(this.messageText, "un2", tLRPC$TL_game);
    }

    public boolean hasValidReplyMessageObject() {
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null) {
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if (!(tLRPC$Message instanceof TLRPC$TL_messageEmpty)) {
                TLRPC$MessageAction tLRPC$MessageAction = tLRPC$Message.action;
                if (!(tLRPC$MessageAction instanceof TLRPC$TL_messageActionHistoryClear) && !(tLRPC$MessageAction instanceof TLRPC$TL_messageActionTopicCreate)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void generatePaymentSentMessageText(TLRPC$User tLRPC$User) {
        String str;
        if (tLRPC$User == null) {
            tLRPC$User = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(getDialogId()));
        }
        String firstName = tLRPC$User != null ? UserObject.getFirstName(tLRPC$User) : "";
        try {
            LocaleController localeController = LocaleController.getInstance();
            TLRPC$MessageAction tLRPC$MessageAction = this.messageOwner.action;
            str = localeController.formatCurrencyString(tLRPC$MessageAction.total_amount, tLRPC$MessageAction.currency);
        } catch (Exception e) {
            FileLog.e(e);
            str = "<error>";
        }
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null && (getMedia(messageObject) instanceof TLRPC$TL_messageMediaInvoice)) {
            if (this.messageOwner.action.recurring_init) {
                this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidRecurrent, str, firstName, getMedia(this.replyMessageObject).title);
            } else {
                this.messageText = LocaleController.formatString("PaymentSuccessfullyPaid", R.string.PaymentSuccessfullyPaid, str, firstName, getMedia(this.replyMessageObject).title);
            }
        } else if (this.messageOwner.action.recurring_init) {
            this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidNoItemRecurrent, str, firstName);
        } else {
            this.messageText = LocaleController.formatString("PaymentSuccessfullyPaidNoItem", R.string.PaymentSuccessfullyPaidNoItem, str, firstName);
        }
    }

    public void generatePinMessageText(TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat) {
        boolean z;
        if (tLRPC$User == null && tLRPC$Chat == 0) {
            if (isFromUser()) {
                tLRPC$User = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
            }
            if (tLRPC$User == null) {
                TLRPC$Peer tLRPC$Peer = this.messageOwner.peer_id;
                if (tLRPC$Peer instanceof TLRPC$TL_peerChannel) {
                    tLRPC$Chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.peer_id.channel_id));
                } else if (tLRPC$Peer instanceof TLRPC$TL_peerChat) {
                    tLRPC$Chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.peer_id.chat_id));
                }
            }
        }
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null) {
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if (!(tLRPC$Message instanceof TLRPC$TL_messageEmpty) && !(tLRPC$Message.action instanceof TLRPC$TL_messageActionHistoryClear)) {
                if (messageObject.isMusic()) {
                    String string = LocaleController.getString("ActionPinnedMusic", R.string.ActionPinnedMusic);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    this.messageText = replaceWithLink(string, "un1", tLRPC$User);
                    return;
                } else if (this.replyMessageObject.isVideo()) {
                    String string2 = LocaleController.getString("ActionPinnedVideo", R.string.ActionPinnedVideo);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    this.messageText = replaceWithLink(string2, "un1", tLRPC$User);
                    return;
                } else if (this.replyMessageObject.isGif()) {
                    String string3 = LocaleController.getString("ActionPinnedGif", R.string.ActionPinnedGif);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    this.messageText = replaceWithLink(string3, "un1", tLRPC$User);
                    return;
                } else if (this.replyMessageObject.isVoice()) {
                    String string4 = LocaleController.getString("ActionPinnedVoice", R.string.ActionPinnedVoice);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    this.messageText = replaceWithLink(string4, "un1", tLRPC$User);
                    return;
                } else if (this.replyMessageObject.isRoundVideo()) {
                    String string5 = LocaleController.getString("ActionPinnedRound", R.string.ActionPinnedRound);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    this.messageText = replaceWithLink(string5, "un1", tLRPC$User);
                    return;
                } else if ((this.replyMessageObject.isSticker() || this.replyMessageObject.isAnimatedSticker()) && !this.replyMessageObject.isAnimatedEmoji()) {
                    String string6 = LocaleController.getString("ActionPinnedSticker", R.string.ActionPinnedSticker);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    this.messageText = replaceWithLink(string6, "un1", tLRPC$User);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC$TL_messageMediaDocument) {
                    String string7 = LocaleController.getString("ActionPinnedFile", R.string.ActionPinnedFile);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    this.messageText = replaceWithLink(string7, "un1", tLRPC$User);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC$TL_messageMediaGeo) {
                    String string8 = LocaleController.getString("ActionPinnedGeo", R.string.ActionPinnedGeo);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    this.messageText = replaceWithLink(string8, "un1", tLRPC$User);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC$TL_messageMediaGeoLive) {
                    String string9 = LocaleController.getString("ActionPinnedGeoLive", R.string.ActionPinnedGeoLive);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    this.messageText = replaceWithLink(string9, "un1", tLRPC$User);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC$TL_messageMediaContact) {
                    String string10 = LocaleController.getString("ActionPinnedContact", R.string.ActionPinnedContact);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    this.messageText = replaceWithLink(string10, "un1", tLRPC$User);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC$TL_messageMediaPoll) {
                    if (((TLRPC$TL_messageMediaPoll) getMedia(this.replyMessageObject)).poll.quiz) {
                        String string11 = LocaleController.getString("ActionPinnedQuiz", R.string.ActionPinnedQuiz);
                        if (tLRPC$User == null) {
                            tLRPC$User = tLRPC$Chat;
                        }
                        this.messageText = replaceWithLink(string11, "un1", tLRPC$User);
                        return;
                    }
                    String string12 = LocaleController.getString("ActionPinnedPoll", R.string.ActionPinnedPoll);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    this.messageText = replaceWithLink(string12, "un1", tLRPC$User);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC$TL_messageMediaPhoto) {
                    String string13 = LocaleController.getString("ActionPinnedPhoto", R.string.ActionPinnedPhoto);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    this.messageText = replaceWithLink(string13, "un1", tLRPC$User);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC$TL_messageMediaGame) {
                    int i = R.string.ActionPinnedGame;
                    String formatString = LocaleController.formatString("ActionPinnedGame", i, "🎮 " + getMedia(this.replyMessageObject).game.title);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    CharSequence replaceWithLink = replaceWithLink(formatString, "un1", tLRPC$User);
                    this.messageText = replaceWithLink;
                    this.messageText = Emoji.replaceEmoji(replaceWithLink, Theme.chat_msgTextPaint.getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
                    return;
                } else {
                    CharSequence charSequence = this.replyMessageObject.messageText;
                    if (charSequence != null && charSequence.length() > 0) {
                        CharSequence cloneSpans = AnimatedEmojiSpan.cloneSpans(this.replyMessageObject.messageText);
                        if (cloneSpans.length() > 20) {
                            cloneSpans = cloneSpans.subSequence(0, 20);
                            z = true;
                        } else {
                            z = false;
                        }
                        SpannableStringBuilder replaceEmoji = Emoji.replaceEmoji(cloneSpans, Theme.chat_msgTextPaint.getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
                        MessageObject messageObject2 = this.replyMessageObject;
                        if (messageObject2 != null && messageObject2.messageOwner != null) {
                            replaceEmoji = messageObject2.replaceAnimatedEmoji(replaceEmoji, Theme.chat_msgTextPaint.getFontMetricsInt());
                        }
                        MediaDataController.addTextStyleRuns(this.replyMessageObject, (Spannable) replaceEmoji);
                        if (z) {
                            if (replaceEmoji instanceof SpannableStringBuilder) {
                                ((SpannableStringBuilder) replaceEmoji).append((CharSequence) "...");
                            } else if (replaceEmoji != null) {
                                replaceEmoji = new SpannableStringBuilder(replaceEmoji).append((CharSequence) "...");
                            }
                        }
                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString("ActionPinnedText", R.string.ActionPinnedText), replaceEmoji);
                        if (tLRPC$User == null) {
                            tLRPC$User = tLRPC$Chat;
                        }
                        this.messageText = replaceWithLink(formatSpannable, "un1", tLRPC$User);
                        return;
                    }
                    String string14 = LocaleController.getString("ActionPinnedNoText", R.string.ActionPinnedNoText);
                    if (tLRPC$User == null) {
                        tLRPC$User = tLRPC$Chat;
                    }
                    this.messageText = replaceWithLink(string14, "un1", tLRPC$User);
                    return;
                }
            }
        }
        String string15 = LocaleController.getString("ActionPinnedNoText", R.string.ActionPinnedNoText);
        if (tLRPC$User == null) {
            tLRPC$User = tLRPC$Chat;
        }
        this.messageText = replaceWithLink(string15, "un1", tLRPC$User);
    }

    public static void updateReactions(TLRPC$Message tLRPC$Message, TLRPC$TL_messageReactions tLRPC$TL_messageReactions) {
        if (tLRPC$Message == null || tLRPC$TL_messageReactions == null) {
            return;
        }
        TLRPC$TL_messageReactions tLRPC$TL_messageReactions2 = tLRPC$Message.reactions;
        if (tLRPC$TL_messageReactions2 != null) {
            int size = tLRPC$TL_messageReactions2.results.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                TLRPC$ReactionCount tLRPC$ReactionCount = tLRPC$Message.reactions.results.get(i);
                int size2 = tLRPC$TL_messageReactions.results.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    TLRPC$ReactionCount tLRPC$ReactionCount2 = tLRPC$TL_messageReactions.results.get(i2);
                    if (ReactionsLayoutInBubble.equalsTLReaction(tLRPC$ReactionCount.reaction, tLRPC$ReactionCount2.reaction)) {
                        if (!z && tLRPC$TL_messageReactions.min && tLRPC$ReactionCount.chosen) {
                            tLRPC$ReactionCount2.chosen = true;
                            z = true;
                        }
                        tLRPC$ReactionCount2.lastDrawnPosition = tLRPC$ReactionCount.lastDrawnPosition;
                    }
                }
                if (tLRPC$ReactionCount.chosen) {
                    z = true;
                }
            }
        }
        tLRPC$Message.reactions = tLRPC$TL_messageReactions;
        tLRPC$Message.flags |= FileLoaderPriorityQueue.PRIORITY_VALUE_MAX;
    }

    public boolean hasReactions() {
        TLRPC$TL_messageReactions tLRPC$TL_messageReactions = this.messageOwner.reactions;
        return (tLRPC$TL_messageReactions == null || tLRPC$TL_messageReactions.results.isEmpty()) ? false : true;
    }

    public static void updatePollResults(TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll, TLRPC$PollResults tLRPC$PollResults) {
        ArrayList arrayList;
        byte[] bArr;
        ArrayList<TLRPC$TL_pollAnswerVoters> arrayList2;
        if (tLRPC$TL_messageMediaPoll == null || tLRPC$PollResults == null) {
            return;
        }
        if ((tLRPC$PollResults.flags & 2) != 0) {
            if (!tLRPC$PollResults.min || (arrayList2 = tLRPC$TL_messageMediaPoll.results.results) == null) {
                arrayList = null;
                bArr = null;
            } else {
                int size = arrayList2.size();
                arrayList = null;
                bArr = null;
                for (int i = 0; i < size; i++) {
                    TLRPC$TL_pollAnswerVoters tLRPC$TL_pollAnswerVoters = tLRPC$TL_messageMediaPoll.results.results.get(i);
                    if (tLRPC$TL_pollAnswerVoters.chosen) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(tLRPC$TL_pollAnswerVoters.option);
                    }
                    if (tLRPC$TL_pollAnswerVoters.correct) {
                        bArr = tLRPC$TL_pollAnswerVoters.option;
                    }
                }
            }
            TLRPC$PollResults tLRPC$PollResults2 = tLRPC$TL_messageMediaPoll.results;
            ArrayList<TLRPC$TL_pollAnswerVoters> arrayList3 = tLRPC$PollResults.results;
            tLRPC$PollResults2.results = arrayList3;
            if (arrayList != null || bArr != null) {
                int size2 = arrayList3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    TLRPC$TL_pollAnswerVoters tLRPC$TL_pollAnswerVoters2 = tLRPC$TL_messageMediaPoll.results.results.get(i2);
                    if (arrayList != null) {
                        int size3 = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                break;
                            } else if (Arrays.equals(tLRPC$TL_pollAnswerVoters2.option, (byte[]) arrayList.get(i3))) {
                                tLRPC$TL_pollAnswerVoters2.chosen = true;
                                arrayList.remove(i3);
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                    }
                    if (bArr != null && Arrays.equals(tLRPC$TL_pollAnswerVoters2.option, bArr)) {
                        tLRPC$TL_pollAnswerVoters2.correct = true;
                        bArr = null;
                    }
                    if (arrayList == null && bArr == null) {
                        break;
                    }
                }
            }
            tLRPC$TL_messageMediaPoll.results.flags |= 2;
        }
        if ((tLRPC$PollResults.flags & 4) != 0) {
            TLRPC$PollResults tLRPC$PollResults3 = tLRPC$TL_messageMediaPoll.results;
            tLRPC$PollResults3.total_voters = tLRPC$PollResults.total_voters;
            tLRPC$PollResults3.flags |= 4;
        }
        if ((tLRPC$PollResults.flags & 8) != 0) {
            TLRPC$PollResults tLRPC$PollResults4 = tLRPC$TL_messageMediaPoll.results;
            tLRPC$PollResults4.recent_voters = tLRPC$PollResults.recent_voters;
            tLRPC$PollResults4.flags |= 8;
        }
        if ((tLRPC$PollResults.flags & 16) != 0) {
            TLRPC$PollResults tLRPC$PollResults5 = tLRPC$TL_messageMediaPoll.results;
            tLRPC$PollResults5.solution = tLRPC$PollResults.solution;
            tLRPC$PollResults5.solution_entities = tLRPC$PollResults.solution_entities;
            tLRPC$PollResults5.flags |= 16;
        }
    }

    public void loadAnimatedEmojiDocument() {
        if (this.emojiAnimatedSticker != null || this.emojiAnimatedStickerId == null || this.emojiAnimatedStickerLoading) {
            return;
        }
        this.emojiAnimatedStickerLoading = true;
        AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).fetchDocument(this.emojiAnimatedStickerId.longValue(), new AnimatedEmojiDrawable.ReceivedDocument() {
            @Override
            public final void run(TLRPC$Document tLRPC$Document) {
                MessageObject.this.lambda$loadAnimatedEmojiDocument$1(tLRPC$Document);
            }
        });
    }

    public void lambda$loadAnimatedEmojiDocument$1(final TLRPC$Document tLRPC$Document) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageObject.this.lambda$loadAnimatedEmojiDocument$0(tLRPC$Document);
            }
        });
    }

    public void lambda$loadAnimatedEmojiDocument$0(TLRPC$Document tLRPC$Document) {
        this.emojiAnimatedSticker = tLRPC$Document;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.animatedEmojiDocumentLoaded, this);
    }

    public boolean isPollClosed() {
        if (this.type != 17) {
            return false;
        }
        return ((TLRPC$TL_messageMediaPoll) getMedia(this.messageOwner)).poll.closed;
    }

    public boolean isQuiz() {
        if (this.type != 17) {
            return false;
        }
        return ((TLRPC$TL_messageMediaPoll) getMedia(this.messageOwner)).poll.quiz;
    }

    public boolean isPublicPoll() {
        if (this.type != 17) {
            return false;
        }
        return ((TLRPC$TL_messageMediaPoll) getMedia(this.messageOwner)).poll.public_voters;
    }

    public boolean isPoll() {
        return this.type == 17;
    }

    public boolean canUnvote() {
        TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll;
        TLRPC$PollResults tLRPC$PollResults;
        if (this.type == 17 && (tLRPC$PollResults = (tLRPC$TL_messageMediaPoll = (TLRPC$TL_messageMediaPoll) getMedia(this.messageOwner)).results) != null && !tLRPC$PollResults.results.isEmpty() && !tLRPC$TL_messageMediaPoll.poll.quiz) {
            int size = tLRPC$TL_messageMediaPoll.results.results.size();
            for (int i = 0; i < size; i++) {
                if (tLRPC$TL_messageMediaPoll.results.results.get(i).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isVoted() {
        TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll;
        TLRPC$PollResults tLRPC$PollResults;
        if (this.type == 17 && (tLRPC$PollResults = (tLRPC$TL_messageMediaPoll = (TLRPC$TL_messageMediaPoll) getMedia(this.messageOwner)).results) != null && !tLRPC$PollResults.results.isEmpty()) {
            int size = tLRPC$TL_messageMediaPoll.results.results.size();
            for (int i = 0; i < size; i++) {
                if (tLRPC$TL_messageMediaPoll.results.results.get(i).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSponsored() {
        return this.sponsoredId != null;
    }

    public long getPollId() {
        if (this.type != 17) {
            return 0L;
        }
        return ((TLRPC$TL_messageMediaPoll) getMedia(this.messageOwner)).poll.id;
    }

    private TLRPC$Photo getPhotoWithId(TLRPC$WebPage tLRPC$WebPage, long j) {
        if (tLRPC$WebPage != null && tLRPC$WebPage.cached_page != null) {
            TLRPC$Photo tLRPC$Photo = tLRPC$WebPage.photo;
            if (tLRPC$Photo != null && tLRPC$Photo.id == j) {
                return tLRPC$Photo;
            }
            for (int i = 0; i < tLRPC$WebPage.cached_page.photos.size(); i++) {
                TLRPC$Photo tLRPC$Photo2 = tLRPC$WebPage.cached_page.photos.get(i);
                if (tLRPC$Photo2.id == j) {
                    return tLRPC$Photo2;
                }
            }
        }
        return null;
    }

    private TLRPC$Document getDocumentWithId(TLRPC$WebPage tLRPC$WebPage, long j) {
        if (tLRPC$WebPage != null && tLRPC$WebPage.cached_page != null) {
            TLRPC$Document tLRPC$Document = tLRPC$WebPage.document;
            if (tLRPC$Document != null && tLRPC$Document.id == j) {
                return tLRPC$Document;
            }
            for (int i = 0; i < tLRPC$WebPage.cached_page.documents.size(); i++) {
                TLRPC$Document tLRPC$Document2 = tLRPC$WebPage.cached_page.documents.get(i);
                if (tLRPC$Document2.id == j) {
                    return tLRPC$Document2;
                }
            }
        }
        return null;
    }

    public boolean isSupergroup() {
        if (this.localSupergroup) {
            return true;
        }
        Boolean bool = this.cachedIsSupergroup;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC$Peer tLRPC$Peer = this.messageOwner.peer_id;
        if (tLRPC$Peer != null) {
            long j = tLRPC$Peer.channel_id;
            if (j != 0) {
                TLRPC$Chat chat = getChat(null, null, j);
                if (chat != null) {
                    Boolean valueOf = Boolean.valueOf(chat.megagroup);
                    this.cachedIsSupergroup = valueOf;
                    return valueOf.booleanValue();
                }
                return false;
            }
        }
        this.cachedIsSupergroup = Boolean.FALSE;
        return false;
    }

    private MessageObject getMessageObjectForBlock(TLRPC$WebPage tLRPC$WebPage, TLRPC$PageBlock tLRPC$PageBlock) {
        TLRPC$TL_message tLRPC$TL_message;
        if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
            TLRPC$Photo photoWithId = getPhotoWithId(tLRPC$WebPage, ((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock).photo_id);
            if (photoWithId == tLRPC$WebPage.photo) {
                return this;
            }
            tLRPC$TL_message = new TLRPC$TL_message();
            TLRPC$TL_messageMediaPhoto tLRPC$TL_messageMediaPhoto = new TLRPC$TL_messageMediaPhoto();
            tLRPC$TL_message.media = tLRPC$TL_messageMediaPhoto;
            tLRPC$TL_messageMediaPhoto.photo = photoWithId;
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) {
            TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo = (TLRPC$TL_pageBlockVideo) tLRPC$PageBlock;
            if (getDocumentWithId(tLRPC$WebPage, tLRPC$TL_pageBlockVideo.video_id) == tLRPC$WebPage.document) {
                return this;
            }
            TLRPC$TL_message tLRPC$TL_message2 = new TLRPC$TL_message();
            TLRPC$TL_messageMediaDocument tLRPC$TL_messageMediaDocument = new TLRPC$TL_messageMediaDocument();
            tLRPC$TL_message2.media = tLRPC$TL_messageMediaDocument;
            tLRPC$TL_messageMediaDocument.document = getDocumentWithId(tLRPC$WebPage, tLRPC$TL_pageBlockVideo.video_id);
            tLRPC$TL_message = tLRPC$TL_message2;
        } else {
            tLRPC$TL_message = null;
        }
        tLRPC$TL_message.message = "";
        tLRPC$TL_message.realId = getId();
        tLRPC$TL_message.id = Utilities.random.nextInt();
        TLRPC$Message tLRPC$Message = this.messageOwner;
        tLRPC$TL_message.date = tLRPC$Message.date;
        tLRPC$TL_message.peer_id = tLRPC$Message.peer_id;
        tLRPC$TL_message.out = tLRPC$Message.out;
        tLRPC$TL_message.from_id = tLRPC$Message.from_id;
        return new MessageObject(this.currentAccount, tLRPC$TL_message, false, true);
    }

    public ArrayList<MessageObject> getWebPagePhotos(ArrayList<MessageObject> arrayList, ArrayList<TLRPC$PageBlock> arrayList2) {
        TLRPC$WebPage tLRPC$WebPage;
        TLRPC$Page tLRPC$Page;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (getMedia(this.messageOwner) == null || getMedia(this.messageOwner).webpage == null || (tLRPC$Page = (tLRPC$WebPage = getMedia(this.messageOwner).webpage).cached_page) == null) {
            return arrayList;
        }
        if (arrayList2 == null) {
            arrayList2 = tLRPC$Page.blocks;
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC$PageBlock tLRPC$PageBlock = arrayList2.get(i);
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSlideshow) {
                TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow = (TLRPC$TL_pageBlockSlideshow) tLRPC$PageBlock;
                for (int i2 = 0; i2 < tLRPC$TL_pageBlockSlideshow.items.size(); i2++) {
                    arrayList.add(getMessageObjectForBlock(tLRPC$WebPage, tLRPC$TL_pageBlockSlideshow.items.get(i2)));
                }
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCollage) {
                TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage = (TLRPC$TL_pageBlockCollage) tLRPC$PageBlock;
                for (int i3 = 0; i3 < tLRPC$TL_pageBlockCollage.items.size(); i3++) {
                    arrayList.add(getMessageObjectForBlock(tLRPC$WebPage, tLRPC$TL_pageBlockCollage.items.get(i3)));
                }
            }
        }
        return arrayList;
    }

    public void createMessageSendInfo() {
        HashMap<String, String> hashMap;
        String str;
        TLRPC$Message tLRPC$Message = this.messageOwner;
        if (tLRPC$Message.message != null) {
            if ((tLRPC$Message.id < 0 || isEditing()) && (hashMap = this.messageOwner.params) != null) {
                String str2 = hashMap.get("ve");
                if (str2 != null && (isVideo() || isNewGif() || isRoundVideo())) {
                    VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                    this.videoEditedInfo = videoEditedInfo;
                    if (!videoEditedInfo.parseString(str2)) {
                        this.videoEditedInfo = null;
                    } else {
                        this.videoEditedInfo.roundVideo = isRoundVideo();
                    }
                }
                TLRPC$Message tLRPC$Message2 = this.messageOwner;
                if (tLRPC$Message2.send_state != 3 || (str = tLRPC$Message2.params.get("prevMedia")) == null) {
                    return;
                }
                SerializedData serializedData = new SerializedData(Base64.decode(str, 0));
                this.previousMedia = TLRPC$MessageMedia.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                this.previousMessage = serializedData.readString(false);
                this.previousAttachPath = serializedData.readString(false);
                int readInt32 = serializedData.readInt32(false);
                this.previousMessageEntities = new ArrayList<>(readInt32);
                for (int i = 0; i < readInt32; i++) {
                    this.previousMessageEntities.add(TLRPC$MessageEntity.TLdeserialize(serializedData, serializedData.readInt32(false), false));
                }
                serializedData.cleanup();
            }
        }
    }

    public boolean hasInlineBotButtons() {
        TLRPC$Message tLRPC$Message;
        if (!this.isRestrictedMessage && !this.isRepostPreview && (tLRPC$Message = this.messageOwner) != null) {
            TLRPC$ReplyMarkup tLRPC$ReplyMarkup = tLRPC$Message.reply_markup;
            if ((tLRPC$ReplyMarkup instanceof TLRPC$TL_replyInlineMarkup) && !tLRPC$ReplyMarkup.rows.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public void measureInlineBotButtons() {
        TLRPC$TL_messageReactions tLRPC$TL_messageReactions;
        CharSequence replaceEmoji;
        if (this.isRestrictedMessage) {
            return;
        }
        this.wantedBotKeyboardWidth = 0;
        if (((this.messageOwner.reply_markup instanceof TLRPC$TL_replyInlineMarkup) && !hasExtendedMedia()) || ((tLRPC$TL_messageReactions = this.messageOwner.reactions) != null && !tLRPC$TL_messageReactions.results.isEmpty())) {
            Theme.createCommonMessageResources();
            StringBuilder sb = this.botButtonsLayout;
            if (sb == null) {
                this.botButtonsLayout = new StringBuilder();
            } else {
                sb.setLength(0);
            }
        }
        if (!(this.messageOwner.reply_markup instanceof TLRPC$TL_replyInlineMarkup) || hasExtendedMedia() || this.messageOwner.reply_markup.rows == null) {
            return;
        }
        for (int i = 0; i < this.messageOwner.reply_markup.rows.size(); i++) {
            TLRPC$TL_keyboardButtonRow tLRPC$TL_keyboardButtonRow = this.messageOwner.reply_markup.rows.get(i);
            int size = tLRPC$TL_keyboardButtonRow.buttons.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC$KeyboardButton tLRPC$KeyboardButton = tLRPC$TL_keyboardButtonRow.buttons.get(i3);
                StringBuilder sb2 = this.botButtonsLayout;
                sb2.append(i);
                sb2.append(i3);
                if ((tLRPC$KeyboardButton instanceof TLRPC$TL_keyboardButtonBuy) && (getMedia(this.messageOwner).flags & 4) != 0) {
                    replaceEmoji = LocaleController.getString("PaymentReceipt", R.string.PaymentReceipt);
                } else {
                    String str = tLRPC$KeyboardButton.text;
                    if (str == null) {
                        str = "";
                    }
                    replaceEmoji = Emoji.replaceEmoji((CharSequence) str, Theme.chat_msgBotButtonPaint.getFontMetricsInt(), AndroidUtilities.dp(15.0f), false);
                }
                StaticLayout staticLayout = new StaticLayout(replaceEmoji, Theme.chat_msgBotButtonPaint, AndroidUtilities.dp(2000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout.getLineCount() > 0) {
                    float lineWidth = staticLayout.getLineWidth(0);
                    float lineLeft = staticLayout.getLineLeft(0);
                    if (lineLeft < lineWidth) {
                        lineWidth -= lineLeft;
                    }
                    i2 = Math.max(i2, ((int) Math.ceil(lineWidth)) + AndroidUtilities.dp(4.0f));
                }
            }
            this.wantedBotKeyboardWidth = Math.max(this.wantedBotKeyboardWidth, ((i2 + AndroidUtilities.dp(12.0f)) * size) + (AndroidUtilities.dp(5.0f) * (size - 1)));
        }
    }

    public boolean isVideoAvatar() {
        TLRPC$Photo tLRPC$Photo;
        TLRPC$MessageAction tLRPC$MessageAction = this.messageOwner.action;
        return (tLRPC$MessageAction == null || (tLRPC$Photo = tLRPC$MessageAction.photo) == null || tLRPC$Photo.video_sizes.isEmpty()) ? false : true;
    }

    public boolean isFcmMessage() {
        return this.localType != 0;
    }

    private TLRPC$User getUser(AbstractMap<Long, TLRPC$User> abstractMap, LongSparseArray<TLRPC$User> longSparseArray, long j) {
        TLRPC$User tLRPC$User;
        if (abstractMap != null) {
            tLRPC$User = abstractMap.get(Long.valueOf(j));
        } else {
            tLRPC$User = longSparseArray != null ? longSparseArray.get(j) : null;
        }
        return tLRPC$User == null ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)) : tLRPC$User;
    }

    private TLRPC$Chat getChat(AbstractMap<Long, TLRPC$Chat> abstractMap, LongSparseArray<TLRPC$Chat> longSparseArray, long j) {
        TLRPC$Chat tLRPC$Chat;
        if (abstractMap != null) {
            tLRPC$Chat = abstractMap.get(Long.valueOf(j));
        } else {
            tLRPC$Chat = longSparseArray != null ? longSparseArray.get(j) : null;
        }
        return tLRPC$Chat == null ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j)) : tLRPC$Chat;
    }

    private void updateMessageText(java.util.AbstractMap<java.lang.Long, org.telegram.tgnet.TLRPC$User> r24, java.util.AbstractMap<java.lang.Long, org.telegram.tgnet.TLRPC$Chat> r25, androidx.collection.LongSparseArray<org.telegram.tgnet.TLRPC$User> r26, androidx.collection.LongSparseArray<org.telegram.tgnet.TLRPC$Chat> r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.updateMessageText(java.util.AbstractMap, java.util.AbstractMap, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray):void");
    }

    public java.lang.CharSequence getMediaTitle(org.telegram.tgnet.TLRPC$MessageMedia r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.getMediaTitle(org.telegram.tgnet.TLRPC$MessageMedia):java.lang.CharSequence");
    }

    public static TLRPC$MessageMedia getMedia(MessageObject messageObject) {
        TLRPC$Message tLRPC$Message;
        if (messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null) {
            return null;
        }
        return getMedia(tLRPC$Message);
    }

    public static TLRPC$MessageMedia getMedia(TLRPC$Message tLRPC$Message) {
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
        if (tLRPC$MessageMedia != null) {
            TLRPC$MessageExtendedMedia tLRPC$MessageExtendedMedia = tLRPC$MessageMedia.extended_media;
            return tLRPC$MessageExtendedMedia instanceof TLRPC$TL_messageExtendedMedia ? ((TLRPC$TL_messageExtendedMedia) tLRPC$MessageExtendedMedia).media : tLRPC$MessageMedia;
        }
        return tLRPC$MessageMedia;
    }

    public boolean hasRevealedExtendedMedia() {
        TLRPC$MessageMedia tLRPC$MessageMedia = this.messageOwner.media;
        return tLRPC$MessageMedia != null && (tLRPC$MessageMedia.extended_media instanceof TLRPC$TL_messageExtendedMedia);
    }

    public boolean hasExtendedMedia() {
        TLRPC$MessageMedia tLRPC$MessageMedia = this.messageOwner.media;
        return (tLRPC$MessageMedia == null || tLRPC$MessageMedia.extended_media == null) ? false : true;
    }

    public boolean hasExtendedMediaPreview() {
        TLRPC$MessageMedia tLRPC$MessageMedia = this.messageOwner.media;
        return tLRPC$MessageMedia != null && (tLRPC$MessageMedia.extended_media instanceof TLRPC$TL_messageExtendedMediaPreview);
    }

    private boolean hasNonEmojiEntities() {
        TLRPC$Message tLRPC$Message = this.messageOwner;
        if (tLRPC$Message != null && tLRPC$Message.entities != null) {
            for (int i = 0; i < this.messageOwner.entities.size(); i++) {
                if (!(this.messageOwner.entities.get(i) instanceof TLRPC$TL_messageEntityCustomEmoji)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setType() {
        int i;
        int i2 = this.type;
        this.type = 1000;
        this.isRoundVideoCached = 0;
        if (this.channelJoined) {
            this.type = 27;
            SharedPreferences mainSettings = MessagesController.getInstance(this.currentAccount).getMainSettings();
            this.channelJoinedExpanded = mainSettings.getBoolean("c" + getDialogId() + "_rec", true);
        } else {
            TLRPC$Message tLRPC$Message = this.messageOwner;
            if ((tLRPC$Message instanceof TLRPC$TL_message) || (tLRPC$Message instanceof TLRPC$TL_messageForwarded_old2)) {
                if (this.isRestrictedMessage) {
                    this.type = 0;
                } else if (this.emojiAnimatedSticker != null || this.emojiAnimatedStickerId != null) {
                    if (isSticker()) {
                        this.type = 13;
                    } else {
                        this.type = 15;
                    }
                } else if (isMediaEmpty(false) && !isDice() && !isSponsored() && this.emojiOnlyCount >= 1 && !this.hasUnwrappedEmoji && this.messageOwner != null && !hasNonEmojiEntities()) {
                    this.type = 19;
                } else if (isMediaEmpty()) {
                    this.type = 0;
                    if (TextUtils.isEmpty(this.messageText) && this.eventId == 0) {
                        this.messageText = LocaleController.getString("EventLogOriginalCaptionEmpty", R.string.EventLogOriginalCaptionEmpty);
                    }
                } else if (hasExtendedMediaPreview()) {
                    this.type = 20;
                } else if (getMedia(this.messageOwner).ttl_seconds != 0 && ((getMedia(this.messageOwner).photo instanceof TLRPC$TL_photoEmpty) || (getDocument() instanceof TLRPC$TL_documentEmpty) || (((getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaDocument) && getDocument() == null) || this.forceExpired))) {
                    this.contentType = 1;
                    this.type = 10;
                } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaGiveaway) {
                    this.type = 26;
                } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaGiveawayResults) {
                    this.type = 28;
                } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaDice) {
                    this.type = 15;
                    if (getMedia(this.messageOwner).document == null) {
                        getMedia(this.messageOwner).document = new TLRPC$TL_document();
                        getMedia(this.messageOwner).document.file_reference = new byte[0];
                        getMedia(this.messageOwner).document.mime_type = "application/x-tgsdice";
                        getMedia(this.messageOwner).document.dc_id = Integer.MIN_VALUE;
                        getMedia(this.messageOwner).document.id = -2147483648L;
                        TLRPC$TL_documentAttributeImageSize tLRPC$TL_documentAttributeImageSize = new TLRPC$TL_documentAttributeImageSize();
                        tLRPC$TL_documentAttributeImageSize.w = LiteMode.FLAG_CALLS_ANIMATIONS;
                        tLRPC$TL_documentAttributeImageSize.h = LiteMode.FLAG_CALLS_ANIMATIONS;
                        getMedia(this.messageOwner).document.attributes.add(tLRPC$TL_documentAttributeImageSize);
                    }
                } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaPhoto) {
                    this.type = 1;
                } else if ((getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaGeo) || (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaVenue) || (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaGeoLive)) {
                    this.type = 4;
                } else if (isRoundVideo()) {
                    this.type = 5;
                } else if (isVideo()) {
                    this.type = 3;
                } else if (isVoice()) {
                    this.type = 2;
                } else if (isMusic()) {
                    this.type = 14;
                } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaContact) {
                    this.type = 12;
                } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaPoll) {
                    this.type = 17;
                    this.checkedVotes = new ArrayList<>();
                } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaUnsupported) {
                    this.type = 0;
                } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaDocument) {
                    TLRPC$Document document = getDocument();
                    if (document != null && document.mime_type != null) {
                        if (isGifDocument(document, hasValidGroupId())) {
                            this.type = 8;
                        } else if (isSticker()) {
                            this.type = 13;
                        } else if (isAnimatedSticker()) {
                            this.type = 15;
                        } else {
                            this.type = 9;
                        }
                    } else {
                        this.type = 9;
                    }
                } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaGame) {
                    this.type = 0;
                } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaInvoice) {
                    this.type = 0;
                } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaStory) {
                    int i3 = getMedia(this.messageOwner).via_mention ? 24 : 23;
                    this.type = i3;
                    if (i3 == 24) {
                        this.contentType = 1;
                    }
                }
            } else {
                TLRPC$TL_channelAdminLogEvent tLRPC$TL_channelAdminLogEvent = this.currentEvent;
                if (tLRPC$TL_channelAdminLogEvent != null) {
                    TLRPC$ChannelAdminLogEventAction tLRPC$ChannelAdminLogEventAction = tLRPC$TL_channelAdminLogEvent.action;
                    if (tLRPC$ChannelAdminLogEventAction instanceof TLRPC$TL_channelAdminLogEventActionChangeWallpaper) {
                        TLRPC$TL_channelAdminLogEventActionChangeWallpaper tLRPC$TL_channelAdminLogEventActionChangeWallpaper = (TLRPC$TL_channelAdminLogEventActionChangeWallpaper) tLRPC$ChannelAdminLogEventAction;
                        this.contentType = 1;
                        TLRPC$WallPaper tLRPC$WallPaper = tLRPC$TL_channelAdminLogEventActionChangeWallpaper.new_value;
                        if ((tLRPC$WallPaper instanceof TLRPC$TL_wallPaperNoFile) && tLRPC$WallPaper.id == 0 && tLRPC$WallPaper.settings == null) {
                            this.type = 10;
                        } else {
                            this.type = 22;
                            ArrayList<TLRPC$PhotoSize> arrayList = new ArrayList<>();
                            this.photoThumbs = arrayList;
                            TLRPC$Document tLRPC$Document = tLRPC$TL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                            if (tLRPC$Document != null) {
                                arrayList.addAll(tLRPC$Document.thumbs);
                                this.photoThumbsObject = tLRPC$TL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                            }
                        }
                    }
                }
                if (tLRPC$Message instanceof TLRPC$TL_messageService) {
                    TLRPC$MessageAction tLRPC$MessageAction = tLRPC$Message.action;
                    if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionSetSameChatWallPaper) {
                        this.contentType = 1;
                        this.type = 10;
                    } else if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionSetChatWallPaper) {
                        this.contentType = 1;
                        this.type = 22;
                        TLRPC$TL_messageActionSetChatWallPaper tLRPC$TL_messageActionSetChatWallPaper = (TLRPC$TL_messageActionSetChatWallPaper) tLRPC$MessageAction;
                        ArrayList<TLRPC$PhotoSize> arrayList2 = new ArrayList<>();
                        this.photoThumbs = arrayList2;
                        TLRPC$Document tLRPC$Document2 = tLRPC$TL_messageActionSetChatWallPaper.wallpaper.document;
                        if (tLRPC$Document2 != null) {
                            arrayList2.addAll(tLRPC$Document2.thumbs);
                            this.photoThumbsObject = tLRPC$TL_messageActionSetChatWallPaper.wallpaper.document;
                        }
                    } else if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionSuggestProfilePhoto) {
                        this.contentType = 1;
                        this.type = 21;
                        ArrayList<TLRPC$PhotoSize> arrayList3 = new ArrayList<>();
                        this.photoThumbs = arrayList3;
                        arrayList3.addAll(this.messageOwner.action.photo.sizes);
                        this.photoThumbsObject = this.messageOwner.action.photo;
                    } else if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionLoginUnknownLocation) {
                        this.type = 0;
                    } else if ((tLRPC$MessageAction instanceof TLRPC$TL_messageActionGiftCode) && ((TLRPC$TL_messageActionGiftCode) tLRPC$MessageAction).boost_peer != null) {
                        this.contentType = 1;
                        this.type = 25;
                    } else if ((tLRPC$MessageAction instanceof TLRPC$TL_messageActionGiftPremium) || (tLRPC$MessageAction instanceof TLRPC$TL_messageActionGiftCode)) {
                        this.contentType = 1;
                        this.type = 18;
                    } else if ((tLRPC$MessageAction instanceof TLRPC$TL_messageActionChatEditPhoto) || (tLRPC$MessageAction instanceof TLRPC$TL_messageActionUserUpdatedPhoto)) {
                        this.contentType = 1;
                        this.type = 11;
                    } else if (tLRPC$MessageAction instanceof TLRPC$TL_messageEncryptedAction) {
                        TLRPC$DecryptedMessageAction tLRPC$DecryptedMessageAction = tLRPC$MessageAction.encryptedAction;
                        if ((tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionScreenshotMessages) || (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionSetMessageTTL)) {
                            this.contentType = 1;
                            this.type = 10;
                        } else {
                            this.contentType = -1;
                            this.type = -1;
                        }
                    } else if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionHistoryClear) {
                        this.contentType = -1;
                        this.type = -1;
                    } else if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionPhoneCall) {
                        this.type = 16;
                    } else {
                        this.contentType = 1;
                        this.type = 10;
                    }
                }
            }
        }
        if (i2 == 1000 || i2 == (i = this.type) || i == 19) {
            return;
        }
        updateMessageText(MessagesController.getInstance(this.currentAccount).getUsers(), MessagesController.getInstance(this.currentAccount).getChats(), null, null);
        generateThumbs(false);
    }

    public boolean checkLayout() {
        CharSequence charSequence;
        TextPaint textPaint;
        int i = this.type;
        if ((i == 0 || i == 19) && this.messageOwner.peer_id != null && (charSequence = this.messageText) != null && charSequence.length() != 0) {
            if (this.layoutCreated) {
                if (Math.abs(this.generatedWithMinSize - (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() : AndroidUtilities.displaySize.x)) > AndroidUtilities.dp(52.0f) || this.generatedWithDensity != AndroidUtilities.density) {
                    this.layoutCreated = false;
                }
            }
            if (!this.layoutCreated) {
                this.layoutCreated = true;
                if (isFromUser()) {
                    MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
                }
                if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaGame) {
                    textPaint = Theme.chat_msgGameTextPaint;
                } else {
                    textPaint = Theme.chat_msgTextPaint;
                }
                int[] iArr = allowsBigEmoji() ? new int[1] : null;
                CharSequence replaceEmoji = Emoji.replaceEmoji(this.messageText, textPaint.getFontMetricsInt(), false, iArr);
                this.messageText = replaceEmoji;
                Spannable replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, textPaint.getFontMetricsInt());
                this.messageText = replaceAnimatedEmoji;
                if (iArr != null && iArr[0] > 1) {
                    replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr);
                }
                checkEmojiOnly(iArr);
                checkBigAnimatedEmoji();
                setType();
                return true;
            }
        }
        return false;
    }

    public void resetLayout() {
        this.layoutCreated = false;
    }

    public String getMimeType() {
        TLRPC$Document document = getDocument();
        if (document != null) {
            return document.mime_type;
        }
        if (!(getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaInvoice)) {
            return getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaPhoto ? "image/jpeg" : (!(getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) || getMedia(this.messageOwner).webpage.photo == null) ? "" : "image/jpeg";
        }
        TLRPC$WebDocument tLRPC$WebDocument = ((TLRPC$TL_messageMediaInvoice) getMedia(this.messageOwner)).webPhoto;
        return tLRPC$WebDocument != null ? tLRPC$WebDocument.mime_type : "";
    }

    public boolean canPreviewDocument() {
        return canPreviewDocument(getDocument());
    }

    public static boolean isAnimatedStickerDocument(TLRPC$Document tLRPC$Document) {
        return tLRPC$Document != null && tLRPC$Document.mime_type.equals("video/webm");
    }

    public static boolean isGifDocument(WebFile webFile) {
        return webFile != null && (webFile.mime_type.equals("image/gif") || isNewGifDocument(webFile));
    }

    public static boolean isGifDocument(TLRPC$Document tLRPC$Document) {
        return isGifDocument(tLRPC$Document, false);
    }

    public static boolean isGifDocument(TLRPC$Document tLRPC$Document, boolean z) {
        String str;
        return (tLRPC$Document == null || (str = tLRPC$Document.mime_type) == null || ((!str.equals("image/gif") || z) && !isNewGifDocument(tLRPC$Document))) ? false : true;
    }

    public static boolean isDocumentHasThumb(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null && !tLRPC$Document.thumbs.isEmpty()) {
            int size = tLRPC$Document.thumbs.size();
            for (int i = 0; i < size; i++) {
                TLRPC$PhotoSize tLRPC$PhotoSize = tLRPC$Document.thumbs.get(i);
                if (tLRPC$PhotoSize != null && !(tLRPC$PhotoSize instanceof TLRPC$TL_photoSizeEmpty) && (!(tLRPC$PhotoSize.location instanceof TLRPC$TL_fileLocationUnavailable) || tLRPC$PhotoSize.bytes != null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean canPreviewDocument(TLRPC$Document tLRPC$Document) {
        String str;
        if (tLRPC$Document != null && (str = tLRPC$Document.mime_type) != null) {
            if ((isDocumentHasThumb(tLRPC$Document) && (str.equalsIgnoreCase("image/png") || str.equalsIgnoreCase("image/jpg") || str.equalsIgnoreCase("image/jpeg"))) || (Build.VERSION.SDK_INT >= 26 && str.equalsIgnoreCase("image/heic"))) {
                for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
                    if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) {
                        TLRPC$TL_documentAttributeImageSize tLRPC$TL_documentAttributeImageSize = (TLRPC$TL_documentAttributeImageSize) tLRPC$DocumentAttribute;
                        return tLRPC$TL_documentAttributeImageSize.w < 6000 && tLRPC$TL_documentAttributeImageSize.h < 6000;
                    }
                }
            } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
                String documentFileName = FileLoader.getDocumentFileName(tLRPC$Document);
                if ((documentFileName.startsWith("tg_secret_sticker") && documentFileName.endsWith("json")) || documentFileName.endsWith(".svg")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isRoundVideoDocument(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null && "video/mp4".equals(tLRPC$Document.mime_type)) {
            boolean z = false;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < tLRPC$Document.attributes.size(); i3++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i3);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                    i = tLRPC$DocumentAttribute.w;
                    i2 = tLRPC$DocumentAttribute.h;
                    z = tLRPC$DocumentAttribute.round_message;
                }
            }
            if (z && i <= 1280 && i2 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNewGifDocument(WebFile webFile) {
        if (webFile != null && "video/mp4".equals(webFile.mime_type)) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < webFile.attributes.size(); i3++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = webFile.attributes.get(i3);
                if (!(tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAnimated) && (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo)) {
                    i = tLRPC$DocumentAttribute.w;
                    i2 = tLRPC$DocumentAttribute.h;
                }
            }
            if (i <= 1280 && i2 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNewGifDocument(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null && "video/mp4".equals(tLRPC$Document.mime_type)) {
            boolean z = false;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < tLRPC$Document.attributes.size(); i3++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i3);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAnimated) {
                    z = true;
                } else if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                    i = tLRPC$DocumentAttribute.w;
                    i2 = tLRPC$DocumentAttribute.h;
                }
            }
            if (z && i <= 1280 && i2 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSystemSignUp(MessageObject messageObject) {
        if (messageObject != null) {
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if ((tLRPC$Message instanceof TLRPC$TL_messageService) && (((TLRPC$TL_messageService) tLRPC$Message).action instanceof TLRPC$TL_messageActionContactSignUp)) {
                return true;
            }
        }
        return false;
    }

    public void generateThumbs(boolean z) {
        ArrayList<TLRPC$PhotoSize> arrayList;
        ArrayList<TLRPC$PhotoSize> arrayList2;
        ArrayList<TLRPC$PhotoSize> arrayList3;
        ArrayList<TLRPC$PhotoSize> arrayList4;
        ArrayList<TLRPC$PhotoSize> arrayList5;
        ArrayList<TLRPC$PhotoSize> arrayList6;
        ArrayList<TLRPC$PhotoSize> arrayList7;
        ArrayList<TLRPC$PhotoSize> arrayList8;
        if (hasExtendedMediaPreview()) {
            TLRPC$TL_messageExtendedMediaPreview tLRPC$TL_messageExtendedMediaPreview = (TLRPC$TL_messageExtendedMediaPreview) this.messageOwner.media.extended_media;
            if (!z) {
                this.photoThumbs = new ArrayList<>(Collections.singletonList(tLRPC$TL_messageExtendedMediaPreview.thumb));
            } else {
                updatePhotoSizeLocations(this.photoThumbs, Collections.singletonList(tLRPC$TL_messageExtendedMediaPreview.thumb));
            }
            this.photoThumbsObject = this.messageOwner;
            if (this.strippedThumb == null) {
                createStrippedThumb();
                return;
            }
            return;
        }
        TLRPC$Message tLRPC$Message = this.messageOwner;
        if (tLRPC$Message instanceof TLRPC$TL_messageService) {
            TLRPC$MessageAction tLRPC$MessageAction = tLRPC$Message.action;
            if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionChatEditPhoto) {
                TLRPC$Photo tLRPC$Photo = tLRPC$MessageAction.photo;
                if (!z) {
                    this.photoThumbs = new ArrayList<>(tLRPC$Photo.sizes);
                } else {
                    ArrayList<TLRPC$PhotoSize> arrayList9 = this.photoThumbs;
                    if (arrayList9 != null && !arrayList9.isEmpty()) {
                        for (int i = 0; i < this.photoThumbs.size(); i++) {
                            TLRPC$PhotoSize tLRPC$PhotoSize = this.photoThumbs.get(i);
                            int i2 = 0;
                            while (true) {
                                if (i2 < tLRPC$Photo.sizes.size()) {
                                    TLRPC$PhotoSize tLRPC$PhotoSize2 = tLRPC$Photo.sizes.get(i2);
                                    if (!(tLRPC$PhotoSize2 instanceof TLRPC$TL_photoSizeEmpty) && tLRPC$PhotoSize2.type.equals(tLRPC$PhotoSize.type)) {
                                        tLRPC$PhotoSize.location = tLRPC$PhotoSize2.location;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                }
                if (tLRPC$Photo.dc_id != 0 && (arrayList8 = this.photoThumbs) != null) {
                    int size = arrayList8.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        TLRPC$FileLocation tLRPC$FileLocation = this.photoThumbs.get(i3).location;
                        if (tLRPC$FileLocation != null) {
                            tLRPC$FileLocation.dc_id = tLRPC$Photo.dc_id;
                            tLRPC$FileLocation.file_reference = tLRPC$Photo.file_reference;
                        }
                    }
                }
                this.photoThumbsObject = this.messageOwner.action.photo;
            }
        } else if (this.emojiAnimatedSticker != null || this.emojiAnimatedStickerId != null) {
            if (TextUtils.isEmpty(this.emojiAnimatedStickerColor) && isDocumentHasThumb(this.emojiAnimatedSticker)) {
                if (!z || (arrayList = this.photoThumbs) == null) {
                    ArrayList<TLRPC$PhotoSize> arrayList10 = new ArrayList<>();
                    this.photoThumbs = arrayList10;
                    arrayList10.addAll(this.emojiAnimatedSticker.thumbs);
                } else if (!arrayList.isEmpty()) {
                    updatePhotoSizeLocations(this.photoThumbs, this.emojiAnimatedSticker.thumbs);
                }
                this.photoThumbsObject = this.emojiAnimatedSticker;
            }
        } else if (getMedia(tLRPC$Message) != null && !(getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaEmpty)) {
            if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaPhoto) {
                TLRPC$Photo tLRPC$Photo2 = getMedia(this.messageOwner).photo;
                if (!z || ((arrayList7 = this.photoThumbs) != null && arrayList7.size() != tLRPC$Photo2.sizes.size())) {
                    this.photoThumbs = new ArrayList<>(tLRPC$Photo2.sizes);
                } else {
                    ArrayList<TLRPC$PhotoSize> arrayList11 = this.photoThumbs;
                    if (arrayList11 != null && !arrayList11.isEmpty()) {
                        for (int i4 = 0; i4 < this.photoThumbs.size(); i4++) {
                            TLRPC$PhotoSize tLRPC$PhotoSize3 = this.photoThumbs.get(i4);
                            if (tLRPC$PhotoSize3 != null) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= tLRPC$Photo2.sizes.size()) {
                                        break;
                                    }
                                    TLRPC$PhotoSize tLRPC$PhotoSize4 = tLRPC$Photo2.sizes.get(i5);
                                    if (tLRPC$PhotoSize4 != null && !(tLRPC$PhotoSize4 instanceof TLRPC$TL_photoSizeEmpty)) {
                                        if (tLRPC$PhotoSize4.type.equals(tLRPC$PhotoSize3.type)) {
                                            tLRPC$PhotoSize3.location = tLRPC$PhotoSize4.location;
                                            break;
                                        } else if ("s".equals(tLRPC$PhotoSize3.type) && (tLRPC$PhotoSize4 instanceof TLRPC$TL_photoStrippedSize)) {
                                            this.photoThumbs.set(i4, tLRPC$PhotoSize4);
                                            break;
                                        }
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                }
                this.photoThumbsObject = getMedia(this.messageOwner).photo;
            } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaDocument) {
                TLRPC$Document document = getDocument();
                if (isDocumentHasThumb(document)) {
                    if (!z || (arrayList6 = this.photoThumbs) == null) {
                        ArrayList<TLRPC$PhotoSize> arrayList12 = new ArrayList<>();
                        this.photoThumbs = arrayList12;
                        arrayList12.addAll(document.thumbs);
                    } else if (!arrayList6.isEmpty()) {
                        updatePhotoSizeLocations(this.photoThumbs, document.thumbs);
                    }
                    this.photoThumbsObject = document;
                }
            } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaGame) {
                TLRPC$Document tLRPC$Document = getMedia(this.messageOwner).game.document;
                if (tLRPC$Document != null && isDocumentHasThumb(tLRPC$Document)) {
                    if (!z) {
                        ArrayList<TLRPC$PhotoSize> arrayList13 = new ArrayList<>();
                        this.photoThumbs = arrayList13;
                        arrayList13.addAll(tLRPC$Document.thumbs);
                    } else {
                        ArrayList<TLRPC$PhotoSize> arrayList14 = this.photoThumbs;
                        if (arrayList14 != null && !arrayList14.isEmpty()) {
                            updatePhotoSizeLocations(this.photoThumbs, tLRPC$Document.thumbs);
                        }
                    }
                    this.photoThumbsObject = tLRPC$Document;
                }
                TLRPC$Photo tLRPC$Photo3 = getMedia(this.messageOwner).game.photo;
                if (tLRPC$Photo3 != null) {
                    if (!z || (arrayList5 = this.photoThumbs2) == null) {
                        this.photoThumbs2 = new ArrayList<>(tLRPC$Photo3.sizes);
                    } else if (!arrayList5.isEmpty()) {
                        updatePhotoSizeLocations(this.photoThumbs2, tLRPC$Photo3.sizes);
                    }
                    this.photoThumbsObject2 = tLRPC$Photo3;
                }
                if (this.photoThumbs != null || (arrayList4 = this.photoThumbs2) == null) {
                    return;
                }
                this.photoThumbs = arrayList4;
                this.photoThumbs2 = null;
                this.photoThumbsObject = this.photoThumbsObject2;
                this.photoThumbsObject2 = null;
            } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) {
                TLRPC$Photo tLRPC$Photo4 = getMedia(this.messageOwner).webpage.photo;
                TLRPC$Document tLRPC$Document2 = getMedia(this.messageOwner).webpage.document;
                if (tLRPC$Photo4 != null) {
                    if (!z || (arrayList3 = this.photoThumbs) == null) {
                        this.photoThumbs = new ArrayList<>(tLRPC$Photo4.sizes);
                    } else if (!arrayList3.isEmpty()) {
                        updatePhotoSizeLocations(this.photoThumbs, tLRPC$Photo4.sizes);
                    }
                    this.photoThumbsObject = tLRPC$Photo4;
                } else if (tLRPC$Document2 != null && isDocumentHasThumb(tLRPC$Document2)) {
                    if (!z) {
                        ArrayList<TLRPC$PhotoSize> arrayList15 = new ArrayList<>();
                        this.photoThumbs = arrayList15;
                        arrayList15.addAll(tLRPC$Document2.thumbs);
                    } else {
                        ArrayList<TLRPC$PhotoSize> arrayList16 = this.photoThumbs;
                        if (arrayList16 != null && !arrayList16.isEmpty()) {
                            updatePhotoSizeLocations(this.photoThumbs, tLRPC$Document2.thumbs);
                        }
                    }
                    this.photoThumbsObject = tLRPC$Document2;
                }
            }
        } else {
            TLRPC$TL_sponsoredWebPage tLRPC$TL_sponsoredWebPage = this.sponsoredWebPage;
            if (tLRPC$TL_sponsoredWebPage == null || tLRPC$TL_sponsoredWebPage.photo == null) {
                return;
            }
            if (!z || (arrayList2 = this.photoThumbs) == null) {
                this.photoThumbs = new ArrayList<>(this.sponsoredWebPage.photo.sizes);
            } else if (!arrayList2.isEmpty()) {
                updatePhotoSizeLocations(this.photoThumbs, this.sponsoredWebPage.photo.sizes);
            }
            this.photoThumbsObject = this.sponsoredWebPage.photo;
            if (this.strippedThumb == null) {
                createStrippedThumb();
            }
        }
    }

    private static void updatePhotoSizeLocations(ArrayList<TLRPC$PhotoSize> arrayList, List<TLRPC$PhotoSize> list) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC$PhotoSize tLRPC$PhotoSize = arrayList.get(i);
            if (tLRPC$PhotoSize != null) {
                int size2 = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        TLRPC$PhotoSize tLRPC$PhotoSize2 = list.get(i2);
                        if (!(tLRPC$PhotoSize2 instanceof TLRPC$TL_photoSizeEmpty) && !(tLRPC$PhotoSize2 instanceof TLRPC$TL_photoCachedSize) && tLRPC$PhotoSize2 != null && tLRPC$PhotoSize2.type.equals(tLRPC$PhotoSize.type)) {
                            tLRPC$PhotoSize.location = tLRPC$PhotoSize2.location;
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public CharSequence replaceWithLink(CharSequence charSequence, String str, ArrayList<Long> arrayList, AbstractMap<Long, TLRPC$User> abstractMap, LongSparseArray<TLRPC$User> longSparseArray) {
        if (TextUtils.indexOf(charSequence, str) >= 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$User tLRPC$User = null;
                if (abstractMap != null) {
                    tLRPC$User = abstractMap.get(arrayList.get(i));
                } else if (longSparseArray != null) {
                    tLRPC$User = longSparseArray.get(arrayList.get(i).longValue());
                }
                if (tLRPC$User == null) {
                    tLRPC$User = MessagesController.getInstance(this.currentAccount).getUser(arrayList.get(i));
                }
                if (tLRPC$User != null) {
                    String userName = UserObject.getUserName(tLRPC$User);
                    int length = spannableStringBuilder.length();
                    if (spannableStringBuilder.length() != 0) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                    spannableStringBuilder.append((CharSequence) userName);
                    spannableStringBuilder.setSpan(new URLSpanNoUnderlineBold("" + tLRPC$User.id), length, userName.length() + length, 33);
                }
            }
            return TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{spannableStringBuilder});
        }
        return charSequence;
    }

    public static CharSequence replaceWithLink(CharSequence charSequence, String str, TLObject tLObject) {
        String str2;
        CharSequence charSequence2;
        String str3;
        TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported;
        TLRPC$Chat tLRPC$Chat;
        TLRPC$User tLRPC$User;
        int indexOf = TextUtils.indexOf(charSequence, str);
        if (indexOf >= 0) {
            TLObject tLObject2 = null;
            if (tLObject instanceof TLRPC$User) {
                charSequence2 = UserObject.getUserName((TLRPC$User) tLObject).replace('\n', ' ');
                str2 = "" + tLRPC$User.id;
            } else if (tLObject instanceof TLRPC$Chat) {
                charSequence2 = ((TLRPC$Chat) tLObject).title.replace('\n', ' ');
                str2 = "" + (-tLRPC$Chat.id);
            } else if (tLObject instanceof TLRPC$TL_game) {
                charSequence2 = ((TLRPC$TL_game) tLObject).title.replace('\n', ' ');
                str2 = "game";
            } else {
                if (tLObject instanceof TLRPC$TL_chatInviteExported) {
                    TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported2 = (TLRPC$TL_chatInviteExported) tLObject;
                    charSequence2 = tLRPC$TL_chatInviteExported2.link.replace('\n', ' ');
                    str3 = "invite";
                    tLRPC$TL_chatInviteExported = tLRPC$TL_chatInviteExported2;
                } else if (tLObject instanceof TLRPC$ForumTopic) {
                    charSequence2 = ForumUtilities.getTopicSpannedName((TLRPC$ForumTopic) tLObject, null, false);
                    str3 = "topic";
                    tLRPC$TL_chatInviteExported = tLObject;
                } else {
                    str2 = "0";
                    charSequence2 = "";
                }
                String str4 = str3;
                tLObject2 = tLRPC$TL_chatInviteExported;
                str2 = str4;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{charSequence2}));
            URLSpanNoUnderlineBold uRLSpanNoUnderlineBold = new URLSpanNoUnderlineBold("" + str2);
            uRLSpanNoUnderlineBold.setObject(tLObject2);
            spannableStringBuilder.setSpan(uRLSpanNoUnderlineBold, indexOf, charSequence2.length() + indexOf, 33);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public String getExtension() {
        String fileName = getFileName();
        int lastIndexOf = fileName.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? fileName.substring(lastIndexOf + 1) : null;
        if (substring == null || substring.length() == 0) {
            substring = getDocument().mime_type;
        }
        if (substring == null) {
            substring = "";
        }
        return substring.toUpperCase();
    }

    public String getFileName() {
        return getFileName(this.messageOwner);
    }

    public static String getFileName(TLRPC$Message tLRPC$Message) {
        TLRPC$PhotoSize closestPhotoSizeWithSize;
        if (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaDocument) {
            return FileLoader.getAttachFileName(getDocument(tLRPC$Message));
        }
        if (!(getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto)) {
            return (!(getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage) || getMedia(tLRPC$Message).webpage == null) ? "" : FileLoader.getAttachFileName(getMedia(tLRPC$Message).webpage.document);
        }
        ArrayList<TLRPC$PhotoSize> arrayList = getMedia(tLRPC$Message).photo.sizes;
        return (arrayList.size() <= 0 || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize())) == null) ? "" : FileLoader.getAttachFileName(closestPhotoSizeWithSize);
    }

    public int getMediaType() {
        if (isVideo()) {
            return 2;
        }
        if (isVoice()) {
            return 1;
        }
        if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaDocument) {
            return 3;
        }
        return getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaPhoto ? 0 : 4;
    }

    public static boolean containsUrls(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() >= 2 && charSequence.length() <= 20480) {
            int length = charSequence.length();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            char c = 0;
            while (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= '0' && charAt <= '9') {
                    i2++;
                    if (i2 >= 6) {
                        return true;
                    }
                    i3 = 0;
                    i4 = 0;
                } else if (charAt == ' ' || i2 <= 0) {
                    i2 = 0;
                }
                if ((charAt != '@' && charAt != '#' && charAt != '/' && charAt != '$') || i != 0) {
                    if (i != 0) {
                        int i5 = i - 1;
                        if (charSequence.charAt(i5) != ' ') {
                            if (charSequence.charAt(i5) == '\n') {
                            }
                        }
                    }
                    if (charAt == ':') {
                        if (i3 == 0) {
                            i3 = 1;
                        }
                        i3 = 0;
                    } else if (charAt != '/') {
                        if (charAt == '.') {
                            if (i4 == 0 && c != ' ') {
                                i4++;
                            }
                        } else if (charAt != ' ' && c == '.' && i4 == 1) {
                            return true;
                        }
                        i4 = 0;
                    } else if (i3 == 2) {
                        return true;
                    } else {
                        if (i3 == 1) {
                            i3++;
                        }
                        i3 = 0;
                    }
                    i++;
                    c = charAt;
                }
                return true;
            }
        }
        return false;
    }

    public void generateLinkDescription() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.generateLinkDescription():void");
    }

    public CharSequence getVoiceTranscription() {
        String str;
        TLRPC$Message tLRPC$Message = this.messageOwner;
        if (tLRPC$Message == null || (str = tLRPC$Message.voiceTranscription) == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            SpannableString spannableString = new SpannableString(LocaleController.getString("NoWordsRecognized", R.string.NoWordsRecognized));
            spannableString.setSpan(new CharacterStyle() {
                @Override
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                    textPaint.setColor(Theme.chat_timePaint.getColor());
                }
            }, 0, spannableString.length(), 33);
            return spannableString;
        }
        String str2 = this.messageOwner.voiceTranscription;
        return !TextUtils.isEmpty(str2) ? Emoji.replaceEmoji((CharSequence) str2, Theme.chat_msgTextPaint.getFontMetricsInt(), AndroidUtilities.dp(20.0f), false) : str2;
    }

    public float measureVoiceTranscriptionHeight() {
        StaticLayout staticLayout;
        CharSequence voiceTranscription = getVoiceTranscription();
        if (voiceTranscription == null) {
            return 0.0f;
        }
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(needDrawAvatar() ? 147.0f : 95.0f);
        if (Build.VERSION.SDK_INT >= 24) {
            staticLayout = StaticLayout.Builder.obtain(voiceTranscription, 0, voiceTranscription.length(), Theme.chat_msgTextPaint, dp).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
        } else {
            staticLayout = new StaticLayout(voiceTranscription, Theme.chat_msgTextPaint, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return staticLayout.getHeight();
    }

    public boolean isVoiceTranscriptionOpen() {
        if (this.messageOwner != null && (isVoice() || (isRoundVideo() && TranscribeButton.isVideoTranscriptionOpen(this)))) {
            TLRPC$Message tLRPC$Message = this.messageOwner;
            if (tLRPC$Message.voiceTranscriptionOpen && tLRPC$Message.voiceTranscription != null && (tLRPC$Message.voiceTranscriptionFinal || TranscribeButton.isTranscribing(this))) {
                return true;
            }
        }
        return false;
    }

    public void generateCaption() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.generateCaption():void");
    }

    public static void addUrlsByPattern(boolean r16, java.lang.CharSequence r17, boolean r18, int r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.addUrlsByPattern(boolean, java.lang.CharSequence, boolean, int, int, boolean):void");
    }

    public static int[] getWebDocumentWidthAndHeight(TLRPC$WebDocument tLRPC$WebDocument) {
        int i;
        if (tLRPC$WebDocument == null) {
            return null;
        }
        int size = tLRPC$WebDocument.attributes.size();
        while (i < size) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$WebDocument.attributes.get(i);
            i = ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo)) ? 0 : i + 1;
            return new int[]{tLRPC$DocumentAttribute.w, tLRPC$DocumentAttribute.h};
        }
        return null;
    }

    public static double getWebDocumentDuration(TLRPC$WebDocument tLRPC$WebDocument) {
        if (tLRPC$WebDocument == null) {
            return 0.0d;
        }
        int size = tLRPC$WebDocument.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$WebDocument.attributes.get(i);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                return tLRPC$DocumentAttribute.duration;
            }
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                return tLRPC$DocumentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static int[] getInlineResultWidthAndHeight(TLRPC$BotInlineResult tLRPC$BotInlineResult) {
        int[] webDocumentWidthAndHeight = getWebDocumentWidthAndHeight(tLRPC$BotInlineResult.content);
        if (webDocumentWidthAndHeight == null) {
            int[] webDocumentWidthAndHeight2 = getWebDocumentWidthAndHeight(tLRPC$BotInlineResult.thumb);
            return webDocumentWidthAndHeight2 == null ? new int[]{0, 0} : webDocumentWidthAndHeight2;
        }
        return webDocumentWidthAndHeight;
    }

    public static int getInlineResultDuration(TLRPC$BotInlineResult tLRPC$BotInlineResult) {
        int webDocumentDuration = (int) getWebDocumentDuration(tLRPC$BotInlineResult.content);
        return webDocumentDuration == 0 ? (int) getWebDocumentDuration(tLRPC$BotInlineResult.thumb) : webDocumentDuration;
    }

    public boolean hasValidGroupId() {
        ArrayList<TLRPC$PhotoSize> arrayList;
        return getGroupId() != 0 && (!((arrayList = this.photoThumbs) == null || arrayList.isEmpty()) || isMusic() || isDocument());
    }

    public long getGroupIdForUse() {
        long j = this.localSentGroupId;
        return j != 0 ? j : this.messageOwner.grouped_id;
    }

    public long getGroupId() {
        long j = this.localGroupId;
        return j != 0 ? j : getGroupIdForUse();
    }

    public static void addLinks(boolean z, CharSequence charSequence) {
        addLinks(z, charSequence, true, false);
    }

    public static void addLinks(boolean z, CharSequence charSequence, boolean z2, boolean z3) {
        addLinks(z, charSequence, z2, z3, false);
    }

    public static void addLinks(boolean z, CharSequence charSequence, boolean z2, boolean z3, boolean z4) {
        if ((charSequence instanceof Spannable) && containsUrls(charSequence)) {
            if (charSequence.length() < 1000) {
                try {
                    AndroidUtilities.addLinks((Spannable) charSequence, 5, z4);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    AndroidUtilities.addLinks((Spannable) charSequence, 1, z4);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            addUrlsByPattern(z, charSequence, z2, 0, 0, z3);
        }
    }

    public void resetPlayingProgress() {
        this.audioProgress = 0.0f;
        this.audioProgressSec = 0;
        this.bufferedProgress = 0.0f;
    }

    private boolean addEntitiesToText(CharSequence charSequence, boolean z) {
        return addEntitiesToText(charSequence, false, z);
    }

    public boolean addEntitiesToText(CharSequence charSequence, boolean z, boolean z2) {
        ArrayList<TLRPC$MessageEntity> arrayList;
        if (charSequence == null) {
            return false;
        }
        if (this.isRestrictedMessage) {
            ArrayList arrayList2 = new ArrayList();
            TLRPC$TL_messageEntityItalic tLRPC$TL_messageEntityItalic = new TLRPC$TL_messageEntityItalic();
            tLRPC$TL_messageEntityItalic.offset = 0;
            tLRPC$TL_messageEntityItalic.length = charSequence.length();
            arrayList2.add(tLRPC$TL_messageEntityItalic);
            return addEntitiesToText(charSequence, arrayList2, isOutOwner(), true, z, z2);
        }
        if (this.translated) {
            TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities = this.messageOwner.translatedText;
            arrayList = tLRPC$TL_textWithEntities == null ? null : tLRPC$TL_textWithEntities.entities;
        } else {
            arrayList = this.messageOwner.entities;
        }
        return addEntitiesToText(charSequence, arrayList, isOutOwner(), true, z, z2);
    }

    public void replaceEmojiToLottieFrame(CharSequence charSequence, int[] iArr) {
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class);
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannable.getSpans(0, spannable.length(), AnimatedEmojiSpan.class);
            if (emojiSpanArr != null) {
                if (((iArr == null ? 0 : iArr[0]) - emojiSpanArr.length) - (animatedEmojiSpanArr == null ? 0 : animatedEmojiSpanArr.length) > 0) {
                    return;
                }
                for (int i = 0; i < emojiSpanArr.length; i++) {
                    TLRPC$Document emojiAnimatedSticker = MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(emojiSpanArr[i].emoji);
                    if (emojiAnimatedSticker != null) {
                        int spanStart = spannable.getSpanStart(emojiSpanArr[i]);
                        int spanEnd = spannable.getSpanEnd(emojiSpanArr[i]);
                        spannable.removeSpan(emojiSpanArr[i]);
                        AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(emojiAnimatedSticker, emojiSpanArr[i].fontMetrics);
                        animatedEmojiSpan.standard = true;
                        spannable.setSpan(animatedEmojiSpan, spanStart, spanEnd, 33);
                    }
                }
            }
        }
    }

    public Spannable replaceAnimatedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities;
        return replaceAnimatedEmoji(charSequence, (!this.translated || (tLRPC$TL_textWithEntities = this.messageOwner.translatedText) == null) ? this.messageOwner.entities : tLRPC$TL_textWithEntities.entities, fontMetricsInt, false);
    }

    public static Spannable replaceAnimatedEmoji(CharSequence charSequence, ArrayList<TLRPC$MessageEntity> arrayList, Paint.FontMetricsInt fontMetricsInt) {
        return replaceAnimatedEmoji(charSequence, arrayList, fontMetricsInt, false);
    }

    public static Spannable replaceAnimatedEmoji(CharSequence charSequence, ArrayList<TLRPC$MessageEntity> arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z) {
        AnimatedEmojiSpan animatedEmojiSpan;
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        if (arrayList == null) {
            return spannableString;
        }
        Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannableString.getSpans(0, spannableString.length(), Emoji.EmojiSpan.class);
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC$MessageEntity tLRPC$MessageEntity = arrayList.get(i);
            if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityCustomEmoji) {
                TLRPC$TL_messageEntityCustomEmoji tLRPC$TL_messageEntityCustomEmoji = (TLRPC$TL_messageEntityCustomEmoji) tLRPC$MessageEntity;
                for (int i2 = 0; i2 < emojiSpanArr.length; i2++) {
                    Emoji.EmojiSpan emojiSpan = emojiSpanArr[i2];
                    if (emojiSpan != null) {
                        int spanStart = spannableString.getSpanStart(emojiSpan);
                        int spanEnd = spannableString.getSpanEnd(emojiSpan);
                        int i3 = tLRPC$TL_messageEntityCustomEmoji.offset;
                        if (AndroidUtilities.intersect1d(i3, tLRPC$TL_messageEntityCustomEmoji.length + i3, spanStart, spanEnd)) {
                            spannableString.removeSpan(emojiSpan);
                            emojiSpanArr[i2] = null;
                        }
                    }
                }
                if (tLRPC$MessageEntity.offset + tLRPC$MessageEntity.length <= spannableString.length()) {
                    int i4 = tLRPC$MessageEntity.offset;
                    AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableString.getSpans(i4, tLRPC$MessageEntity.length + i4, AnimatedEmojiSpan.class);
                    if (animatedEmojiSpanArr != null && animatedEmojiSpanArr.length > 0) {
                        for (AnimatedEmojiSpan animatedEmojiSpan2 : animatedEmojiSpanArr) {
                            spannableString.removeSpan(animatedEmojiSpan2);
                        }
                    }
                    if (tLRPC$TL_messageEntityCustomEmoji.document != null) {
                        animatedEmojiSpan = new AnimatedEmojiSpan(tLRPC$TL_messageEntityCustomEmoji.document, fontMetricsInt);
                    } else {
                        animatedEmojiSpan = new AnimatedEmojiSpan(tLRPC$TL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                    }
                    animatedEmojiSpan.top = z;
                    int i5 = tLRPC$MessageEntity.offset;
                    spannableString.setSpan(animatedEmojiSpan, i5, tLRPC$MessageEntity.length + i5, 33);
                }
            }
        }
        return spannableString;
    }

    public static boolean addEntitiesToText(java.lang.CharSequence r17, java.util.ArrayList<org.telegram.tgnet.TLRPC$MessageEntity> r18, boolean r19, boolean r20, boolean r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.addEntitiesToText(java.lang.CharSequence, java.util.ArrayList, boolean, boolean, boolean, boolean):boolean");
    }

    public static int lambda$addEntitiesToText$2(TLRPC$MessageEntity tLRPC$MessageEntity, TLRPC$MessageEntity tLRPC$MessageEntity2) {
        int i = tLRPC$MessageEntity.offset;
        int i2 = tLRPC$MessageEntity2.offset;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public boolean needDrawShareButton() {
        int i;
        if (this.isRepostPreview || this.type == 27 || isSponsored() || this.hasCode || this.preview || this.scheduled || this.eventId != 0) {
            return false;
        }
        TLRPC$Message tLRPC$Message = this.messageOwner;
        if (tLRPC$Message.noforwards) {
            return false;
        }
        if (tLRPC$Message.fwd_from == null || isOutOwner() || this.messageOwner.fwd_from.saved_from_peer == null || getDialogId() != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            int i2 = this.type;
            if (i2 != 13 && i2 != 15 && i2 != 19) {
                TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.messageOwner.fwd_from;
                if (tLRPC$MessageFwdHeader != null && (tLRPC$MessageFwdHeader.from_id instanceof TLRPC$TL_peerChannel) && !isOutOwner()) {
                    return true;
                }
                if (isFromUser()) {
                    if ((getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaEmpty) || getMedia(this.messageOwner) == null || ((getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) && !(getMedia(this.messageOwner).webpage instanceof TLRPC$TL_webPage))) {
                        return false;
                    }
                    TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
                    if (user != null && user.bot && !hasExtendedMedia()) {
                        return true;
                    }
                    if (!isOut()) {
                        if ((getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaGame) || (((getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaInvoice) && !hasExtendedMedia()) || (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage))) {
                            return true;
                        }
                        TLRPC$Peer tLRPC$Peer = this.messageOwner.peer_id;
                        TLRPC$Chat tLRPC$Chat = null;
                        if (tLRPC$Peer != null) {
                            long j = tLRPC$Peer.channel_id;
                            if (j != 0) {
                                tLRPC$Chat = getChat(null, null, j);
                            }
                        }
                        return ChatObject.isChannel(tLRPC$Chat) && tLRPC$Chat.megagroup && ChatObject.isPublic(tLRPC$Chat) && !(getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaContact) && !(getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaGeo);
                    }
                } else {
                    TLRPC$Message tLRPC$Message2 = this.messageOwner;
                    if ((tLRPC$Message2.from_id instanceof TLRPC$TL_peerChannel) || tLRPC$Message2.post) {
                        if ((getMedia(tLRPC$Message2) instanceof TLRPC$TL_messageMediaWebPage) && !isOutOwner()) {
                            return true;
                        }
                        if (isSupergroup()) {
                            return false;
                        }
                        TLRPC$Message tLRPC$Message3 = this.messageOwner;
                        if (tLRPC$Message3.peer_id.channel_id != 0 && ((tLRPC$Message3.via_bot_id == 0 && tLRPC$Message3.reply_to == null) || ((i = this.type) != 13 && i != 15))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean isYouTubeVideo() {
        return (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && !TextUtils.isEmpty(getMedia(this.messageOwner).webpage.embed_url) && "YouTube".equals(getMedia(this.messageOwner).webpage.site_name);
    }

    public int getMaxMessageTextWidth() {
        if (AndroidUtilities.isTablet() && this.eventId != 0) {
            this.generatedWithMinSize = AndroidUtilities.dp(530.0f);
        } else {
            this.generatedWithMinSize = AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() : getParentWidth();
        }
        this.generatedWithDensity = AndroidUtilities.density;
        int i = 0;
        if (this.hasCode) {
            i = this.generatedWithMinSize - AndroidUtilities.dp(60.0f);
            if (needDrawAvatarInternal() && !isOutOwner() && !this.messageOwner.isThreadMessage) {
                i -= AndroidUtilities.dp(52.0f);
            }
        } else if ((getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && "telegram_background".equals(getMedia(this.messageOwner).webpage.type)) {
            try {
                Uri parse = Uri.parse(getMedia(this.messageOwner).webpage.url);
                String lastPathSegment = parse.getLastPathSegment();
                if (parse.getQueryParameter("bg_color") != null) {
                    i = AndroidUtilities.dp(220.0f);
                } else if (lastPathSegment.length() == 6 || (lastPathSegment.length() == 13 && lastPathSegment.charAt(6) == '-')) {
                    i = AndroidUtilities.dp(200.0f);
                }
            } catch (Exception unused) {
            }
        } else if (isAndroidTheme()) {
            i = AndroidUtilities.dp(200.0f);
        }
        if (i == 0) {
            int dp = this.generatedWithMinSize - AndroidUtilities.dp(80.0f);
            if (needDrawAvatarInternal() && !isOutOwner() && !this.messageOwner.isThreadMessage) {
                dp -= AndroidUtilities.dp(52.0f);
            }
            if (needDrawShareButton() && !isOutOwner()) {
                dp -= AndroidUtilities.dp(10.0f);
            }
            i = getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaGame ? dp - AndroidUtilities.dp(10.0f) : dp;
        }
        int i2 = this.emojiOnlyCount;
        if (i2 >= 1) {
            int i3 = this.totalAnimatedEmojiCount;
            if (i3 <= 100) {
                return i2 - i3 < (SharedConfig.getDevicePerformanceClass() < 2 ? 50 : 100) ? (hasValidReplyMessageObject() || isForwarded()) ? Math.min(i, (int) (this.generatedWithMinSize * 0.65f)) : i : i;
            }
            return i;
        }
        return i;
    }

    public void applyTimestampsHighlightForReplyMsg() {
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject == null) {
            return;
        }
        if (messageObject.isYouTubeVideo()) {
            addUrlsByPattern(isOutOwner(), this.messageText, false, 3, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
        } else if (messageObject.isVideo()) {
            addUrlsByPattern(isOutOwner(), this.messageText, false, 3, (int) messageObject.getDuration(), false);
        } else if (messageObject.isMusic() || messageObject.isVoice()) {
            addUrlsByPattern(isOutOwner(), this.messageText, false, 4, (int) messageObject.getDuration(), false);
        }
    }

    private boolean applyEntities() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.applyEntities():boolean");
    }

    public void generateLayout(org.telegram.tgnet.TLRPC$User r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.generateLayout(org.telegram.tgnet.TLRPC$User):void");
    }

    public static class TextLayoutBlocks {
        public boolean hasCode;
        public boolean hasCodeAtBottom;
        public boolean hasCodeAtTop;
        public boolean hasQuote;
        public boolean hasQuoteAtBottom;
        public boolean hasRtl;
        public boolean hasSingleCode;
        public boolean hasSingleQuote;
        public int lastLineWidth;
        public final CharSequence text;
        public int textHeight;
        public final ArrayList<TextLayoutBlock> textLayoutBlocks = new ArrayList<>();
        public int textWidth;
        public float textXOffset;

        public TextLayoutBlocks(org.telegram.messenger.MessageObject r39, java.lang.CharSequence r40, android.text.TextPaint r41, int r42) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.TextLayoutBlocks.<init>(org.telegram.messenger.MessageObject, java.lang.CharSequence, android.text.TextPaint, int):void");
        }
    }

    public boolean isOut() {
        return this.messageOwner.out;
    }

    public boolean isOutOwner() {
        TLRPC$Peer tLRPC$Peer;
        TLRPC$Peer tLRPC$Peer2;
        boolean z = true;
        if (this.previewForward) {
            return true;
        }
        Boolean bool = this.isOutOwnerCached;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC$Peer tLRPC$Peer3 = this.messageOwner.peer_id;
        TLRPC$Chat tLRPC$Chat = null;
        if (tLRPC$Peer3 != null) {
            long j = tLRPC$Peer3.channel_id;
            if (j != 0) {
                tLRPC$Chat = getChat(null, null, j);
            }
        }
        TLRPC$Message tLRPC$Message = this.messageOwner;
        if (tLRPC$Message.out) {
            TLRPC$Peer tLRPC$Peer4 = tLRPC$Message.from_id;
            if ((tLRPC$Peer4 instanceof TLRPC$TL_peerUser) || ((tLRPC$Peer4 instanceof TLRPC$TL_peerChannel) && (!ChatObject.isChannel(tLRPC$Chat) || tLRPC$Chat.megagroup))) {
                TLRPC$Message tLRPC$Message2 = this.messageOwner;
                if (!tLRPC$Message2.post) {
                    if (tLRPC$Message2.fwd_from == null) {
                        this.isOutOwnerCached = Boolean.TRUE;
                        return true;
                    }
                    long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                    if (getDialogId() == clientUserId) {
                        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.messageOwner.fwd_from;
                        TLRPC$Peer tLRPC$Peer5 = tLRPC$MessageFwdHeader.from_id;
                        if ((!(tLRPC$Peer5 instanceof TLRPC$TL_peerUser) || tLRPC$Peer5.user_id != clientUserId || ((tLRPC$Peer2 = tLRPC$MessageFwdHeader.saved_from_peer) != null && tLRPC$Peer2.user_id != clientUserId)) && ((tLRPC$Peer = tLRPC$MessageFwdHeader.saved_from_peer) == null || tLRPC$Peer.user_id != clientUserId || (tLRPC$Peer5 != null && tLRPC$Peer5.user_id != clientUserId))) {
                            z = false;
                        }
                        Boolean valueOf = Boolean.valueOf(z);
                        this.isOutOwnerCached = valueOf;
                        return valueOf.booleanValue();
                    }
                    TLRPC$Peer tLRPC$Peer6 = this.messageOwner.fwd_from.saved_from_peer;
                    if (tLRPC$Peer6 != null && tLRPC$Peer6.user_id != clientUserId) {
                        z = false;
                    }
                    Boolean valueOf2 = Boolean.valueOf(z);
                    this.isOutOwnerCached = valueOf2;
                    return valueOf2.booleanValue();
                }
            }
        }
        this.isOutOwnerCached = Boolean.FALSE;
        return false;
    }

    public boolean needDrawAvatar() {
        if (this.isRepostPreview || this.forceAvatar || this.customAvatarDrawable != null) {
            return true;
        }
        if (!isSponsored()) {
            if (isFromUser() || isFromGroup() || this.eventId != 0) {
                return true;
            }
            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.messageOwner.fwd_from;
            if (tLRPC$MessageFwdHeader != null && tLRPC$MessageFwdHeader.saved_from_peer != null) {
                return true;
            }
        }
        return false;
    }

    public boolean needDrawAvatarInternal() {
        if (this.isRepostPreview || this.forceAvatar || this.customAvatarDrawable != null) {
            return true;
        }
        if (!isSponsored()) {
            if ((isFromChat() && isFromUser()) || isFromGroup() || this.eventId != 0) {
                return true;
            }
            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.messageOwner.fwd_from;
            if (tLRPC$MessageFwdHeader != null && tLRPC$MessageFwdHeader.saved_from_peer != null) {
                return true;
            }
        }
        return false;
    }

    public boolean isFromChat() {
        TLRPC$Peer tLRPC$Peer;
        if (getDialogId() == UserConfig.getInstance(this.currentAccount).clientUserId) {
            return true;
        }
        TLRPC$Peer tLRPC$Peer2 = this.messageOwner.peer_id;
        TLRPC$Chat tLRPC$Chat = null;
        if (tLRPC$Peer2 != null) {
            long j = tLRPC$Peer2.channel_id;
            if (j != 0) {
                tLRPC$Chat = getChat(null, null, j);
            }
        }
        if (!(ChatObject.isChannel(tLRPC$Chat) && tLRPC$Chat.megagroup) && ((tLRPC$Peer = this.messageOwner.peer_id) == null || tLRPC$Peer.chat_id == 0)) {
            return (tLRPC$Peer == null || tLRPC$Peer.channel_id == 0 || tLRPC$Chat == null || !tLRPC$Chat.megagroup) ? false : true;
        }
        return true;
    }

    public static long getFromChatId(TLRPC$Message tLRPC$Message) {
        return getPeerId(tLRPC$Message.from_id);
    }

    public static long getObjectPeerId(TLObject tLObject) {
        if (tLObject == null) {
            return 0L;
        }
        if (tLObject instanceof TLRPC$Chat) {
            return -((TLRPC$Chat) tLObject).id;
        }
        if (tLObject instanceof TLRPC$User) {
            return ((TLRPC$User) tLObject).id;
        }
        return 0L;
    }

    public static long getPeerId(TLRPC$Peer tLRPC$Peer) {
        long j;
        if (tLRPC$Peer == null) {
            return 0L;
        }
        if (tLRPC$Peer instanceof TLRPC$TL_peerChat) {
            j = tLRPC$Peer.chat_id;
        } else if (tLRPC$Peer instanceof TLRPC$TL_peerChannel) {
            j = tLRPC$Peer.channel_id;
        } else {
            return tLRPC$Peer.user_id;
        }
        return -j;
    }

    public static boolean peersEqual(TLRPC$InputPeer tLRPC$InputPeer, TLRPC$InputPeer tLRPC$InputPeer2) {
        if (tLRPC$InputPeer == null && tLRPC$InputPeer2 == null) {
            return true;
        }
        if (tLRPC$InputPeer != null && tLRPC$InputPeer2 != null) {
            if ((tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChat) && (tLRPC$InputPeer2 instanceof TLRPC$TL_inputPeerChat)) {
                return tLRPC$InputPeer.chat_id == tLRPC$InputPeer2.chat_id;
            } else if ((tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChannel) && (tLRPC$InputPeer2 instanceof TLRPC$TL_inputPeerChannel)) {
                return tLRPC$InputPeer.channel_id == tLRPC$InputPeer2.channel_id;
            } else if ((tLRPC$InputPeer instanceof TLRPC$TL_inputPeerUser) && (tLRPC$InputPeer2 instanceof TLRPC$TL_inputPeerUser)) {
                return tLRPC$InputPeer.user_id == tLRPC$InputPeer2.user_id;
            } else if ((tLRPC$InputPeer instanceof TLRPC$TL_inputPeerSelf) && (tLRPC$InputPeer2 instanceof TLRPC$TL_inputPeerSelf)) {
                return true;
            }
        }
        return false;
    }

    public static boolean peersEqual(TLRPC$InputPeer tLRPC$InputPeer, TLRPC$Peer tLRPC$Peer) {
        if (tLRPC$InputPeer == null && tLRPC$Peer == null) {
            return true;
        }
        if (tLRPC$InputPeer != null && tLRPC$Peer != null) {
            return ((tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChat) && (tLRPC$Peer instanceof TLRPC$TL_peerChat)) ? tLRPC$InputPeer.chat_id == tLRPC$Peer.chat_id : ((tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChannel) && (tLRPC$Peer instanceof TLRPC$TL_peerChannel)) ? tLRPC$InputPeer.channel_id == tLRPC$Peer.channel_id : (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerUser) && (tLRPC$Peer instanceof TLRPC$TL_peerUser) && tLRPC$InputPeer.user_id == tLRPC$Peer.user_id;
        }
        return false;
    }

    public static boolean peersEqual(TLRPC$Peer tLRPC$Peer, TLRPC$Peer tLRPC$Peer2) {
        if (tLRPC$Peer == null && tLRPC$Peer2 == null) {
            return true;
        }
        if (tLRPC$Peer != null && tLRPC$Peer2 != null) {
            return ((tLRPC$Peer instanceof TLRPC$TL_peerChat) && (tLRPC$Peer2 instanceof TLRPC$TL_peerChat)) ? tLRPC$Peer.chat_id == tLRPC$Peer2.chat_id : ((tLRPC$Peer instanceof TLRPC$TL_peerChannel) && (tLRPC$Peer2 instanceof TLRPC$TL_peerChannel)) ? tLRPC$Peer.channel_id == tLRPC$Peer2.channel_id : (tLRPC$Peer instanceof TLRPC$TL_peerUser) && (tLRPC$Peer2 instanceof TLRPC$TL_peerUser) && tLRPC$Peer.user_id == tLRPC$Peer2.user_id;
        }
        return false;
    }

    public static boolean peersEqual(TLRPC$Chat tLRPC$Chat, TLRPC$Peer tLRPC$Peer) {
        if (tLRPC$Chat == null && tLRPC$Peer == null) {
            return true;
        }
        if (tLRPC$Chat != null && tLRPC$Peer != null) {
            return (ChatObject.isChannel(tLRPC$Chat) && (tLRPC$Peer instanceof TLRPC$TL_peerChannel)) ? tLRPC$Chat.id == tLRPC$Peer.channel_id : !ChatObject.isChannel(tLRPC$Chat) && (tLRPC$Peer instanceof TLRPC$TL_peerChat) && tLRPC$Chat.id == tLRPC$Peer.chat_id;
        }
        return false;
    }

    public long getFromChatId() {
        return getFromChatId(this.messageOwner);
    }

    public long getChatId() {
        TLRPC$Peer tLRPC$Peer = this.messageOwner.peer_id;
        if (tLRPC$Peer instanceof TLRPC$TL_peerChat) {
            return tLRPC$Peer.chat_id;
        }
        if (tLRPC$Peer instanceof TLRPC$TL_peerChannel) {
            return tLRPC$Peer.channel_id;
        }
        return 0L;
    }

    public TLObject getFromPeerObject() {
        TLRPC$Message tLRPC$Message = this.messageOwner;
        if (tLRPC$Message != null) {
            TLRPC$Peer tLRPC$Peer = tLRPC$Message.from_id;
            if ((tLRPC$Peer instanceof TLRPC$TL_peerChannel_layer131) || (tLRPC$Peer instanceof TLRPC$TL_peerChannel)) {
                return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.from_id.channel_id));
            }
            if ((tLRPC$Peer instanceof TLRPC$TL_peerUser_layer131) || (tLRPC$Peer instanceof TLRPC$TL_peerUser)) {
                return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
            }
            if ((tLRPC$Peer instanceof TLRPC$TL_peerChat_layer131) || (tLRPC$Peer instanceof TLRPC$TL_peerChat)) {
                return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.from_id.chat_id));
            }
            return null;
        }
        return null;
    }

    public static String getPeerObjectName(TLObject tLObject) {
        if (tLObject instanceof TLRPC$User) {
            return UserObject.getUserName((TLRPC$User) tLObject);
        }
        return tLObject instanceof TLRPC$Chat ? ((TLRPC$Chat) tLObject).title : "DELETED";
    }

    public boolean isFromUser() {
        TLRPC$Message tLRPC$Message = this.messageOwner;
        return (tLRPC$Message.from_id instanceof TLRPC$TL_peerUser) && !tLRPC$Message.post;
    }

    public boolean isFromChannel() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.isFromChannel():boolean");
    }

    public boolean isFromGroup() {
        TLRPC$Peer tLRPC$Peer = this.messageOwner.peer_id;
        TLRPC$Chat tLRPC$Chat = null;
        if (tLRPC$Peer != null) {
            long j = tLRPC$Peer.channel_id;
            if (j != 0) {
                tLRPC$Chat = getChat(null, null, j);
            }
        }
        return (this.messageOwner.from_id instanceof TLRPC$TL_peerChannel) && ChatObject.isChannel(tLRPC$Chat) && tLRPC$Chat.megagroup;
    }

    public boolean isForwardedChannelPost() {
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader;
        TLRPC$Message tLRPC$Message = this.messageOwner;
        TLRPC$Peer tLRPC$Peer = tLRPC$Message.from_id;
        if ((tLRPC$Peer instanceof TLRPC$TL_peerChannel) && (tLRPC$MessageFwdHeader = tLRPC$Message.fwd_from) != null && tLRPC$MessageFwdHeader.channel_post != 0) {
            TLRPC$Peer tLRPC$Peer2 = tLRPC$MessageFwdHeader.saved_from_peer;
            if ((tLRPC$Peer2 instanceof TLRPC$TL_peerChannel) && tLRPC$Peer.channel_id == tLRPC$Peer2.channel_id) {
                return true;
            }
        }
        return false;
    }

    public boolean isUnread() {
        return this.messageOwner.unread;
    }

    public boolean isContentUnread() {
        return this.messageOwner.media_unread;
    }

    public void setIsRead() {
        this.messageOwner.unread = false;
    }

    public int getUnradFlags() {
        return getUnreadFlags(this.messageOwner);
    }

    public static int getUnreadFlags(TLRPC$Message tLRPC$Message) {
        int i = !tLRPC$Message.unread ? 1 : 0;
        return !tLRPC$Message.media_unread ? i | 2 : i;
    }

    public void setContentIsRead() {
        this.messageOwner.media_unread = false;
    }

    public int getId() {
        return this.messageOwner.id;
    }

    public int getRealId() {
        TLRPC$Message tLRPC$Message = this.messageOwner;
        int i = tLRPC$Message.realId;
        return i != 0 ? i : tLRPC$Message.id;
    }

    public static long getMessageSize(TLRPC$Message tLRPC$Message) {
        TLRPC$Document tLRPC$Document;
        if (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage) {
            tLRPC$Document = getMedia(tLRPC$Message).webpage.document;
        } else if (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaGame) {
            tLRPC$Document = getMedia(tLRPC$Message).game.document;
        } else {
            tLRPC$Document = getMedia(tLRPC$Message) != null ? getMedia(tLRPC$Message).document : null;
        }
        if (tLRPC$Document != null) {
            return tLRPC$Document.size;
        }
        return 0L;
    }

    public long getSize() {
        return getMessageSize(this.messageOwner);
    }

    public static void fixMessagePeer(ArrayList<TLRPC$Message> arrayList, long j) {
        if (arrayList == null || arrayList.isEmpty() || j == 0) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC$Message tLRPC$Message = arrayList.get(i);
            if (tLRPC$Message instanceof TLRPC$TL_messageEmpty) {
                TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
                tLRPC$Message.peer_id = tLRPC$TL_peerChannel;
                tLRPC$TL_peerChannel.channel_id = j;
            }
        }
    }

    public long getChannelId() {
        return getChannelId(this.messageOwner);
    }

    public static long getChannelId(TLRPC$Message tLRPC$Message) {
        TLRPC$Peer tLRPC$Peer = tLRPC$Message.peer_id;
        if (tLRPC$Peer != null) {
            return tLRPC$Peer.channel_id;
        }
        return 0L;
    }

    public static long getChatId(TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message == null) {
            return 0L;
        }
        TLRPC$Peer tLRPC$Peer = tLRPC$Message.peer_id;
        if (tLRPC$Peer instanceof TLRPC$TL_peerChat) {
            return tLRPC$Peer.chat_id;
        }
        if (tLRPC$Peer instanceof TLRPC$TL_peerChannel) {
            return tLRPC$Peer.channel_id;
        }
        return 0L;
    }

    public static boolean shouldEncryptPhotoOrVideo(int i, TLRPC$Message tLRPC$Message) {
        int i2;
        if (MessagesController.getInstance(i).isChatNoForwards(getChatId(tLRPC$Message))) {
            return true;
        }
        if (tLRPC$Message == null || !tLRPC$Message.noforwards) {
            return tLRPC$Message instanceof TLRPC$TL_message_secret ? ((getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) || isVideoMessage(tLRPC$Message)) && (i2 = tLRPC$Message.ttl) > 0 && i2 <= 60 : ((getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) || (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaDocument)) && getMedia(tLRPC$Message).ttl_seconds != 0;
        }
        return true;
    }

    public boolean shouldEncryptPhotoOrVideo() {
        return shouldEncryptPhotoOrVideo(this.currentAccount, this.messageOwner);
    }

    public static boolean isSecretPhotoOrVideo(TLRPC$Message tLRPC$Message) {
        int i;
        if (tLRPC$Message instanceof TLRPC$TL_message_secret) {
            return ((getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) || isRoundVideoMessage(tLRPC$Message) || isVideoMessage(tLRPC$Message)) && (i = tLRPC$Message.ttl) > 0 && i <= 60;
        } else if (tLRPC$Message instanceof TLRPC$TL_message) {
            return ((getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) || (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaDocument)) && getMedia(tLRPC$Message).ttl_seconds != 0;
        } else {
            return false;
        }
    }

    public static boolean isSecretMedia(TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message instanceof TLRPC$TL_message_secret) {
            return ((getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) || isRoundVideoMessage(tLRPC$Message) || isVideoMessage(tLRPC$Message)) && getMedia(tLRPC$Message).ttl_seconds != 0;
        } else if (tLRPC$Message instanceof TLRPC$TL_message) {
            return ((getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) || (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaDocument)) && getMedia(tLRPC$Message).ttl_seconds != 0;
        } else {
            return false;
        }
    }

    public boolean needDrawBluredPreview() {
        if (this.isRepostPreview) {
            return false;
        }
        if (hasExtendedMediaPreview()) {
            return true;
        }
        TLRPC$Message tLRPC$Message = this.messageOwner;
        if (tLRPC$Message instanceof TLRPC$TL_message_secret) {
            int max = Math.max(tLRPC$Message.ttl, getMedia(tLRPC$Message).ttl_seconds);
            if (max > 0) {
                return (((getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaPhoto) || isVideo() || isGif()) && max <= 60) || isRoundVideo();
            }
            return false;
        } else if (!(tLRPC$Message instanceof TLRPC$TL_message) || getMedia(tLRPC$Message) == null || getMedia(this.messageOwner).ttl_seconds == 0) {
            return false;
        } else {
            return (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaPhoto) || (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaDocument);
        }
    }

    public boolean isSecretMedia() {
        int i;
        TLRPC$Message tLRPC$Message = this.messageOwner;
        return tLRPC$Message instanceof TLRPC$TL_message_secret ? (((getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) || isGif()) && (i = this.messageOwner.ttl) > 0 && i <= 60) || isVoice() || isRoundVideo() || isVideo() : (tLRPC$Message instanceof TLRPC$TL_message) && getMedia(tLRPC$Message) != null && getMedia(this.messageOwner).ttl_seconds != 0 && ((getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaPhoto) || (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaDocument));
    }

    public static void setUnreadFlags(TLRPC$Message tLRPC$Message, int i) {
        tLRPC$Message.unread = (i & 1) == 0;
        tLRPC$Message.media_unread = (i & 2) == 0;
    }

    public static boolean isUnread(TLRPC$Message tLRPC$Message) {
        return tLRPC$Message.unread;
    }

    public static boolean isContentUnread(TLRPC$Message tLRPC$Message) {
        return tLRPC$Message.media_unread;
    }

    public boolean isSavedFromMegagroup() {
        TLRPC$Peer tLRPC$Peer;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.messageOwner.fwd_from;
        if (tLRPC$MessageFwdHeader == null || (tLRPC$Peer = tLRPC$MessageFwdHeader.saved_from_peer) == null || tLRPC$Peer.channel_id == 0) {
            return false;
        }
        return ChatObject.isMegagroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.fwd_from.saved_from_peer.channel_id)));
    }

    public static boolean isOut(TLRPC$Message tLRPC$Message) {
        return tLRPC$Message.out;
    }

    public long getDialogId() {
        return getDialogId(this.messageOwner);
    }

    public boolean canStreamVideo() {
        TLRPC$Document document = getDocument();
        if (document != null && !(document instanceof TLRPC$TL_documentEncrypted)) {
            if (SharedConfig.streamAllVideo) {
                return true;
            }
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = document.attributes.get(i);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                    return tLRPC$DocumentAttribute.supports_streaming;
                }
            }
            if (SharedConfig.streamMkv && "video/x-matroska".equals(document.mime_type)) {
                return true;
            }
        }
        return false;
    }

    public static long getDialogId(TLRPC$Message tLRPC$Message) {
        TLRPC$Peer tLRPC$Peer;
        if (tLRPC$Message.dialog_id == 0 && (tLRPC$Peer = tLRPC$Message.peer_id) != null) {
            long j = tLRPC$Peer.chat_id;
            if (j != 0) {
                tLRPC$Message.dialog_id = -j;
            } else {
                long j2 = tLRPC$Peer.channel_id;
                if (j2 != 0) {
                    tLRPC$Message.dialog_id = -j2;
                } else if (tLRPC$Message.from_id == null || isOut(tLRPC$Message)) {
                    tLRPC$Message.dialog_id = tLRPC$Message.peer_id.user_id;
                } else {
                    tLRPC$Message.dialog_id = tLRPC$Message.from_id.user_id;
                }
            }
        }
        return tLRPC$Message.dialog_id;
    }

    public boolean isSending() {
        TLRPC$Message tLRPC$Message = this.messageOwner;
        return tLRPC$Message.send_state == 1 && tLRPC$Message.id < 0;
    }

    public boolean isEditing() {
        TLRPC$Message tLRPC$Message = this.messageOwner;
        return tLRPC$Message.send_state == 3 && tLRPC$Message.id > 0;
    }

    public boolean isEditingMedia() {
        return getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaPhoto ? getMedia(this.messageOwner).photo.id == 0 : (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaDocument) && getMedia(this.messageOwner).document.dc_id == 0;
    }

    public boolean isSendError() {
        TLRPC$Message tLRPC$Message = this.messageOwner;
        return (tLRPC$Message.send_state == 2 && tLRPC$Message.id < 0) || (this.scheduled && tLRPC$Message.id > 0 && tLRPC$Message.date < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + (-60));
    }

    public boolean isSent() {
        TLRPC$Message tLRPC$Message = this.messageOwner;
        return tLRPC$Message.send_state == 0 || tLRPC$Message.id > 0;
    }

    public int getSecretTimeLeft() {
        TLRPC$Message tLRPC$Message = this.messageOwner;
        int i = tLRPC$Message.ttl;
        int i2 = tLRPC$Message.destroyTime;
        return i2 != 0 ? Math.max(0, i2 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) : i;
    }

    public CharSequence getSecretTimeString() {
        String str;
        if (isSecretMedia()) {
            if (this.messageOwner.ttl == Integer.MAX_VALUE) {
                if (this.secretOnceSpan == null) {
                    this.secretOnceSpan = new SpannableString("v");
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_viewonce);
                    coloredImageSpan.setTranslateX(-AndroidUtilities.dp(3.0f));
                    coloredImageSpan.setWidth(AndroidUtilities.dp(13.0f));
                    CharSequence charSequence = this.secretOnceSpan;
                    ((Spannable) charSequence).setSpan(coloredImageSpan, 0, charSequence.length(), 33);
                }
                return TextUtils.concat(this.secretOnceSpan, "1");
            }
            int secretTimeLeft = getSecretTimeLeft();
            if (secretTimeLeft < 60) {
                str = secretTimeLeft + "s";
            } else {
                str = (secretTimeLeft / 60) + "m";
            }
            if (this.secretPlaySpan == null) {
                this.secretPlaySpan = new SpannableString("p");
                ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.play_mini_video);
                coloredImageSpan2.setTranslateX(AndroidUtilities.dp(1.0f));
                coloredImageSpan2.setWidth(AndroidUtilities.dp(13.0f));
                CharSequence charSequence2 = this.secretPlaySpan;
                ((Spannable) charSequence2).setSpan(coloredImageSpan2, 0, charSequence2.length(), 33);
            }
            return TextUtils.concat(this.secretPlaySpan, str);
        }
        return null;
    }

    public String getDocumentName() {
        return FileLoader.getDocumentFileName(getDocument());
    }

    public static boolean isWebM(TLRPC$Document tLRPC$Document) {
        return tLRPC$Document != null && "video/webm".equals(tLRPC$Document.mime_type);
    }

    public static boolean isVideoSticker(TLRPC$Document tLRPC$Document) {
        return tLRPC$Document != null && isVideoStickerDocument(tLRPC$Document);
    }

    public boolean isVideoSticker() {
        return getDocument() != null && isVideoStickerDocument(getDocument());
    }

    public static boolean isStickerDocument(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null) {
            for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
                if (tLRPC$Document.attributes.get(i) instanceof TLRPC$TL_documentAttributeSticker) {
                    return "image/webp".equals(tLRPC$Document.mime_type) || "video/webm".equals(tLRPC$Document.mime_type);
                }
            }
        }
        return false;
    }

    public static boolean isVideoStickerDocument(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null) {
            for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
                if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeCustomEmoji)) {
                    return "video/webm".equals(tLRPC$Document.mime_type);
                }
            }
        }
        return false;
    }

    public static boolean isStickerHasSet(TLRPC$Document tLRPC$Document) {
        TLRPC$InputStickerSet tLRPC$InputStickerSet;
        if (tLRPC$Document != null) {
            for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
                if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) && (tLRPC$InputStickerSet = tLRPC$DocumentAttribute.stickerset) != null && !(tLRPC$InputStickerSet instanceof TLRPC$TL_inputStickerSetEmpty)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isAnimatedStickerDocument(TLRPC$Document tLRPC$Document, boolean z) {
        if (tLRPC$Document != null && (("application/x-tgsticker".equals(tLRPC$Document.mime_type) && !tLRPC$Document.thumbs.isEmpty()) || "application/x-tgsdice".equals(tLRPC$Document.mime_type))) {
            if (z) {
                return true;
            }
            int size = tLRPC$Document.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                    return tLRPC$DocumentAttribute.stickerset instanceof TLRPC$TL_inputStickerSetShortName;
                }
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeCustomEmoji) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean canAutoplayAnimatedSticker(TLRPC$Document tLRPC$Document) {
        return (isAnimatedStickerDocument(tLRPC$Document, true) || isVideoStickerDocument(tLRPC$Document)) && LiteMode.isEnabled(1);
    }

    public static boolean isMaskDocument(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null) {
            for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
                if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) && tLRPC$DocumentAttribute.mask) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isVoiceDocument(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null) {
            for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                    return tLRPC$DocumentAttribute.voice;
                }
            }
        }
        return false;
    }

    public static boolean isVoiceWebDocument(WebFile webFile) {
        return webFile != null && webFile.mime_type.equals("audio/ogg");
    }

    public static boolean isImageWebDocument(WebFile webFile) {
        return (webFile == null || isGifDocument(webFile) || !webFile.mime_type.startsWith("image/")) ? false : true;
    }

    public static boolean isVideoWebDocument(WebFile webFile) {
        return webFile != null && webFile.mime_type.startsWith("video/");
    }

    public static boolean isMusicDocument(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null) {
            for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                    return !tLRPC$DocumentAttribute.voice;
                }
            }
            if (!TextUtils.isEmpty(tLRPC$Document.mime_type)) {
                String lowerCase = tLRPC$Document.mime_type.toLowerCase();
                if (lowerCase.equals("audio/flac") || lowerCase.equals("audio/ogg") || lowerCase.equals("audio/opus") || lowerCase.equals("audio/x-opus+ogg") || (lowerCase.equals("application/octet-stream") && FileLoader.getDocumentFileName(tLRPC$Document).endsWith(".opus"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC$VideoSize getDocumentVideoThumb(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null || tLRPC$Document.video_thumbs.isEmpty()) {
            return null;
        }
        return tLRPC$Document.video_thumbs.get(0);
    }

    public static boolean isVideoDocument(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return false;
        }
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < tLRPC$Document.attributes.size(); i3++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i3);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                if (tLRPC$DocumentAttribute.round_message) {
                    return false;
                }
                i = tLRPC$DocumentAttribute.w;
                i2 = tLRPC$DocumentAttribute.h;
                z2 = true;
            } else if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAnimated) {
                z = true;
            }
        }
        if (z && (i > 1280 || i2 > 1280)) {
            z = false;
        }
        if (SharedConfig.streamMkv && !z2 && "video/x-matroska".equals(tLRPC$Document.mime_type)) {
            z2 = true;
        }
        return z2 && !z;
    }

    public TLRPC$Document getDocument() {
        TLRPC$Document tLRPC$Document = this.emojiAnimatedSticker;
        return tLRPC$Document != null ? tLRPC$Document : getDocument(this.messageOwner);
    }

    public static TLRPC$Document getDocument(TLRPC$Message tLRPC$Message) {
        if (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage) {
            return getMedia(tLRPC$Message).webpage.document;
        }
        if (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaGame) {
            return getMedia(tLRPC$Message).game.document;
        }
        if (getMedia(tLRPC$Message) != null) {
            return getMedia(tLRPC$Message).document;
        }
        return null;
    }

    public static TLRPC$Photo getPhoto(TLRPC$Message tLRPC$Message) {
        if (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage) {
            return getMedia(tLRPC$Message).webpage.photo;
        }
        if (getMedia(tLRPC$Message) != null) {
            return getMedia(tLRPC$Message).photo;
        }
        return null;
    }

    public static boolean isStickerMessage(TLRPC$Message tLRPC$Message) {
        return getMedia(tLRPC$Message) != null && isStickerDocument(getMedia(tLRPC$Message).document);
    }

    public static boolean isAnimatedStickerMessage(TLRPC$Message tLRPC$Message) {
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(tLRPC$Message.dialog_id);
        if ((!isEncryptedDialog || tLRPC$Message.stickerVerified == 1) && getMedia(tLRPC$Message) != null) {
            return isAnimatedStickerDocument(getMedia(tLRPC$Message).document, !isEncryptedDialog || tLRPC$Message.out);
        }
        return false;
    }

    public static boolean isLocationMessage(TLRPC$Message tLRPC$Message) {
        return (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaGeo) || (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaGeoLive) || (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaVenue);
    }

    public static boolean isMaskMessage(TLRPC$Message tLRPC$Message) {
        return getMedia(tLRPC$Message) != null && isMaskDocument(getMedia(tLRPC$Message).document);
    }

    public static boolean isMusicMessage(TLRPC$Message tLRPC$Message) {
        if (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage) {
            return isMusicDocument(getMedia(tLRPC$Message).webpage.document);
        }
        return getMedia(tLRPC$Message) != null && isMusicDocument(getMedia(tLRPC$Message).document);
    }

    public static boolean isGifMessage(TLRPC$Message tLRPC$Message) {
        if (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage) {
            return isGifDocument(getMedia(tLRPC$Message).webpage.document);
        }
        if (getMedia(tLRPC$Message) != null) {
            if (isGifDocument(getMedia(tLRPC$Message).document, tLRPC$Message.grouped_id != 0)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRoundVideoMessage(TLRPC$Message tLRPC$Message) {
        if (!(getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage) || getMedia(tLRPC$Message).webpage == null) {
            return getMedia(tLRPC$Message) != null && isRoundVideoDocument(getMedia(tLRPC$Message).document);
        }
        return isRoundVideoDocument(getMedia(tLRPC$Message).webpage.document);
    }

    public static boolean isPhoto(TLRPC$Message tLRPC$Message) {
        TLRPC$MessageAction tLRPC$MessageAction;
        TLRPC$Photo tLRPC$Photo;
        if (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage) {
            return (getMedia(tLRPC$Message).webpage.photo instanceof TLRPC$TL_photo) && !(getMedia(tLRPC$Message).webpage.document instanceof TLRPC$TL_document);
        } else if (tLRPC$Message != null && (tLRPC$MessageAction = tLRPC$Message.action) != null && (tLRPC$Photo = tLRPC$MessageAction.photo) != null) {
            return tLRPC$Photo instanceof TLRPC$TL_photo;
        } else {
            return getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto;
        }
    }

    public static boolean isVoiceMessage(TLRPC$Message tLRPC$Message) {
        if (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage) {
            return isVoiceDocument(getMedia(tLRPC$Message).webpage.document);
        }
        return getMedia(tLRPC$Message) != null && isVoiceDocument(getMedia(tLRPC$Message).document);
    }

    public static boolean isNewGifMessage(TLRPC$Message tLRPC$Message) {
        if (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage) {
            return isNewGifDocument(getMedia(tLRPC$Message).webpage.document);
        }
        return getMedia(tLRPC$Message) != null && isNewGifDocument(getMedia(tLRPC$Message).document);
    }

    public static boolean isLiveLocationMessage(TLRPC$Message tLRPC$Message) {
        return getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaGeoLive;
    }

    public static boolean isVideoMessage(TLRPC$Message tLRPC$Message) {
        if (getMedia(tLRPC$Message) == null || !isVideoSticker(getMedia(tLRPC$Message).document)) {
            if (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage) {
                return isVideoDocument(getMedia(tLRPC$Message).webpage.document);
            }
            return getMedia(tLRPC$Message) != null && isVideoDocument(getMedia(tLRPC$Message).document);
        }
        return false;
    }

    public static boolean isGameMessage(TLRPC$Message tLRPC$Message) {
        return getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaGame;
    }

    public static boolean isInvoiceMessage(TLRPC$Message tLRPC$Message) {
        return getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaInvoice;
    }

    public static TLRPC$InputStickerSet getInputStickerSet(TLRPC$Message tLRPC$Message) {
        TLRPC$Document document = getDocument(tLRPC$Message);
        if (document != null) {
            return getInputStickerSet(document);
        }
        return null;
    }

    public static TLRPC$InputStickerSet getInputStickerSet(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return null;
        }
        int size = tLRPC$Document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
            if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeCustomEmoji)) {
                TLRPC$InputStickerSet tLRPC$InputStickerSet = tLRPC$DocumentAttribute.stickerset;
                if (tLRPC$InputStickerSet instanceof TLRPC$TL_inputStickerSetEmpty) {
                    return null;
                }
                return tLRPC$InputStickerSet;
            }
        }
        return null;
    }

    public static String findAnimatedEmojiEmoticon(TLRPC$Document tLRPC$Document) {
        return findAnimatedEmojiEmoticon(tLRPC$Document, "😀");
    }

    public static String findAnimatedEmojiEmoticon(TLRPC$Document tLRPC$Document, String str) {
        return findAnimatedEmojiEmoticon(tLRPC$Document, str, null);
    }

    public static String findAnimatedEmojiEmoticon(TLRPC$Document tLRPC$Document, String str, Integer num) {
        if (tLRPC$Document == null) {
            return str;
        }
        int size = tLRPC$Document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
            if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeCustomEmoji) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker)) {
                if (num != null) {
                    TLRPC$TL_messages_stickerSet stickerSet = MediaDataController.getInstance(num.intValue()).getStickerSet(tLRPC$DocumentAttribute.stickerset, true);
                    StringBuilder sb = new StringBuilder("");
                    if (stickerSet != null && stickerSet.packs != null) {
                        for (int i2 = 0; i2 < stickerSet.packs.size(); i2++) {
                            TLRPC$TL_stickerPack tLRPC$TL_stickerPack = stickerSet.packs.get(i2);
                            if (tLRPC$TL_stickerPack.documents.contains(Long.valueOf(tLRPC$Document.id))) {
                                sb.append(tLRPC$TL_stickerPack.emoticon);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(sb)) {
                        return sb.toString();
                    }
                }
                return tLRPC$DocumentAttribute.alt;
            }
        }
        return str;
    }

    public static boolean isAnimatedEmoji(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return false;
        }
        int size = tLRPC$Document.attributes.size();
        for (int i = 0; i < size; i++) {
            if (tLRPC$Document.attributes.get(i) instanceof TLRPC$TL_documentAttributeCustomEmoji) {
                return true;
            }
        }
        return false;
    }

    public static boolean isFreeEmoji(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return false;
        }
        int size = tLRPC$Document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeCustomEmoji) {
                return ((TLRPC$TL_documentAttributeCustomEmoji) tLRPC$DocumentAttribute).free;
            }
        }
        return false;
    }

    public static boolean isTextColorEmoji(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return false;
        }
        getInputStickerSet(tLRPC$Document);
        int size = tLRPC$Document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeCustomEmoji) {
                TLRPC$InputStickerSet tLRPC$InputStickerSet = tLRPC$DocumentAttribute.stickerset;
                if ((tLRPC$InputStickerSet instanceof TLRPC$TL_inputStickerSetID) && tLRPC$InputStickerSet.id == 1269403972611866647L) {
                    return true;
                }
                return ((TLRPC$TL_documentAttributeCustomEmoji) tLRPC$DocumentAttribute).text_color;
            }
        }
        return false;
    }

    public static boolean isTextColorSet(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        TLRPC$StickerSet tLRPC$StickerSet;
        if (tLRPC$TL_messages_stickerSet != null && (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set) != null) {
            if (tLRPC$StickerSet.text_color) {
                return true;
            }
            ArrayList<TLRPC$Document> arrayList = tLRPC$TL_messages_stickerSet.documents;
            if (arrayList != null && !arrayList.isEmpty()) {
                return isTextColorEmoji(tLRPC$TL_messages_stickerSet.documents.get(0));
            }
        }
        return false;
    }

    public static boolean isPremiumEmojiPack(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        TLRPC$StickerSet tLRPC$StickerSet;
        if ((tLRPC$TL_messages_stickerSet == null || (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set) == null || tLRPC$StickerSet.emojis) && tLRPC$TL_messages_stickerSet != null && tLRPC$TL_messages_stickerSet.documents != null) {
            for (int i = 0; i < tLRPC$TL_messages_stickerSet.documents.size(); i++) {
                if (!isFreeEmoji(tLRPC$TL_messages_stickerSet.documents.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPremiumEmojiPack(TLRPC$StickerSetCovered tLRPC$StickerSetCovered) {
        TLRPC$StickerSet tLRPC$StickerSet;
        if (tLRPC$StickerSetCovered == null || (tLRPC$StickerSet = tLRPC$StickerSetCovered.set) == null || tLRPC$StickerSet.emojis) {
            ArrayList<TLRPC$Document> arrayList = tLRPC$StickerSetCovered instanceof TLRPC$TL_stickerSetFullCovered ? ((TLRPC$TL_stickerSetFullCovered) tLRPC$StickerSetCovered).documents : tLRPC$StickerSetCovered.covers;
            if (tLRPC$StickerSetCovered != null && arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (!isFreeEmoji(arrayList.get(i))) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static long getStickerSetId(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return -1L;
        }
        for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                TLRPC$InputStickerSet tLRPC$InputStickerSet = tLRPC$DocumentAttribute.stickerset;
                if (tLRPC$InputStickerSet instanceof TLRPC$TL_inputStickerSetEmpty) {
                    return -1L;
                }
                return tLRPC$InputStickerSet.id;
            }
        }
        return -1L;
    }

    public static String getStickerSetName(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return null;
        }
        for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                TLRPC$InputStickerSet tLRPC$InputStickerSet = tLRPC$DocumentAttribute.stickerset;
                if (tLRPC$InputStickerSet instanceof TLRPC$TL_inputStickerSetEmpty) {
                    return null;
                }
                return tLRPC$InputStickerSet.short_name;
            }
        }
        return null;
    }

    public String getStickerChar() {
        TLRPC$Document document = getDocument();
        if (document != null) {
            Iterator<TLRPC$DocumentAttribute> it = document.attributes.iterator();
            while (it.hasNext()) {
                TLRPC$DocumentAttribute next = it.next();
                if (next instanceof TLRPC$TL_documentAttributeSticker) {
                    return next.alt;
                }
            }
            return null;
        }
        return null;
    }

    public int getApproximateHeight() {
        int i;
        int i2;
        int min;
        TLRPC$PhotoSize closestPhotoSizeWithSize;
        int min2;
        int i3 = this.type;
        int i4 = 0;
        if (i3 == 0) {
            int i5 = this.textHeight;
            if ((getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC$TL_webPage)) {
                i4 = AndroidUtilities.dp(100.0f);
            }
            int i6 = i5 + i4;
            return isReply() ? i6 + AndroidUtilities.dp(42.0f) : i6;
        } else if (i3 == 20) {
            return AndroidUtilities.getPhotoSize();
        } else {
            if (i3 == 2) {
                return AndroidUtilities.dp(72.0f);
            }
            if (i3 == 12) {
                return AndroidUtilities.dp(71.0f);
            }
            if (i3 == 9) {
                return AndroidUtilities.dp(100.0f);
            }
            if (i3 == 4) {
                return AndroidUtilities.dp(114.0f);
            }
            if (i3 == 14) {
                return AndroidUtilities.dp(82.0f);
            }
            if (i3 == 10) {
                return AndroidUtilities.dp(30.0f);
            }
            if (i3 == 11 || i3 == 18 || i3 == 25 || i3 == 21) {
                return AndroidUtilities.dp(50.0f);
            }
            if (i3 == 5) {
                return AndroidUtilities.roundMessageSize;
            }
            if (i3 == 19) {
                return this.textHeight + AndroidUtilities.dp(30.0f);
            }
            if (i3 == 13 || i3 == 15) {
                float f = AndroidUtilities.displaySize.y * 0.4f;
                if (AndroidUtilities.isTablet()) {
                    i = AndroidUtilities.getMinTabletSide();
                } else {
                    i = AndroidUtilities.displaySize.x;
                }
                float f2 = i * 0.5f;
                TLRPC$Document document = getDocument();
                if (document != null) {
                    int size = document.attributes.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        TLRPC$DocumentAttribute tLRPC$DocumentAttribute = document.attributes.get(i7);
                        if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) {
                            i4 = tLRPC$DocumentAttribute.w;
                            i2 = tLRPC$DocumentAttribute.h;
                            break;
                        }
                    }
                }
                i2 = 0;
                if (i4 == 0) {
                    i2 = (int) f;
                    i4 = AndroidUtilities.dp(100.0f) + i2;
                }
                float f3 = i2;
                if (f3 > f) {
                    i4 = (int) (i4 * (f / f3));
                    i2 = (int) f;
                }
                float f4 = i4;
                if (f4 > f2) {
                    i2 = (int) (i2 * (f2 / f4));
                }
                return i2 + AndroidUtilities.dp(14.0f);
            }
            if (AndroidUtilities.isTablet()) {
                min = AndroidUtilities.getMinTabletSide();
            } else {
                Point point = AndroidUtilities.displaySize;
                min = Math.min(point.x, point.y);
            }
            int i8 = (int) (min * 0.7f);
            int dp = AndroidUtilities.dp(100.0f) + i8;
            if (i8 > AndroidUtilities.getPhotoSize()) {
                i8 = AndroidUtilities.getPhotoSize();
            }
            if (dp > AndroidUtilities.getPhotoSize()) {
                dp = AndroidUtilities.getPhotoSize();
            }
            if (FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, AndroidUtilities.getPhotoSize()) != null) {
                int i9 = (int) (closestPhotoSizeWithSize.h / (closestPhotoSizeWithSize.w / i8));
                if (i9 == 0) {
                    i9 = AndroidUtilities.dp(100.0f);
                }
                if (i9 <= dp) {
                    dp = i9 < AndroidUtilities.dp(120.0f) ? AndroidUtilities.dp(120.0f) : i9;
                }
                if (needDrawBluredPreview()) {
                    if (AndroidUtilities.isTablet()) {
                        min2 = AndroidUtilities.getMinTabletSide();
                    } else {
                        Point point2 = AndroidUtilities.displaySize;
                        min2 = Math.min(point2.x, point2.y);
                    }
                    dp = (int) (min2 * 0.5f);
                }
            }
            return dp + AndroidUtilities.dp(14.0f);
        }
    }

    private int getParentWidth() {
        int i;
        return (!this.preview || (i = this.parentWidth) <= 0) ? AndroidUtilities.displaySize.x : i;
    }

    public String getStickerEmoji() {
        TLRPC$Document document = getDocument();
        if (document == null) {
            return null;
        }
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = document.attributes.get(i);
            if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeCustomEmoji)) {
                String str = tLRPC$DocumentAttribute.alt;
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return tLRPC$DocumentAttribute.alt;
            }
        }
        return null;
    }

    public boolean isVideoCall() {
        TLRPC$MessageAction tLRPC$MessageAction = this.messageOwner.action;
        return (tLRPC$MessageAction instanceof TLRPC$TL_messageActionPhoneCall) && tLRPC$MessageAction.video;
    }

    public boolean isAnimatedEmoji() {
        return (this.emojiAnimatedSticker == null && this.emojiAnimatedStickerId == null) ? false : true;
    }

    public boolean isAnimatedAnimatedEmoji() {
        return isAnimatedEmoji() && isAnimatedEmoji(getDocument());
    }

    public boolean isDice() {
        return getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaDice;
    }

    public String getDiceEmoji() {
        if (isDice()) {
            TLRPC$TL_messageMediaDice tLRPC$TL_messageMediaDice = (TLRPC$TL_messageMediaDice) getMedia(this.messageOwner);
            return TextUtils.isEmpty(tLRPC$TL_messageMediaDice.emoticon) ? "🎲" : tLRPC$TL_messageMediaDice.emoticon.replace("️", "");
        }
        return null;
    }

    public int getDiceValue() {
        if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaDice) {
            return ((TLRPC$TL_messageMediaDice) getMedia(this.messageOwner)).value;
        }
        return -1;
    }

    public boolean isSticker() {
        int i = this.type;
        return i != 1000 ? i == 13 : isStickerDocument(getDocument()) || isVideoSticker(getDocument());
    }

    public boolean isAnimatedSticker() {
        int i = this.type;
        boolean z = false;
        if (i != 1000) {
            return i == 15;
        }
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(getDialogId());
        if (!isEncryptedDialog || this.messageOwner.stickerVerified == 1) {
            if (this.emojiAnimatedStickerId == null || this.emojiAnimatedSticker != null) {
                return isAnimatedStickerDocument(getDocument(), (this.emojiAnimatedSticker == null && isEncryptedDialog && !isOut()) ? true : true);
            }
            return true;
        }
        return false;
    }

    public boolean isAnyKindOfSticker() {
        int i = this.type;
        return i == 13 || i == 15 || i == 19;
    }

    public boolean shouldDrawWithoutBackground() {
        int i;
        return !isSponsored() && ((i = this.type) == 13 || i == 15 || i == 5 || i == 19 || isExpiredStory());
    }

    public boolean isAnimatedEmojiStickers() {
        return this.type == 19;
    }

    public boolean isAnimatedEmojiStickerSingle() {
        return this.emojiAnimatedStickerId != null;
    }

    public boolean isLocation() {
        return isLocationMessage(this.messageOwner);
    }

    public boolean isMask() {
        return isMaskMessage(this.messageOwner);
    }

    public boolean isMusic() {
        return (!isMusicMessage(this.messageOwner) || isVideo() || isRoundVideo()) ? false : true;
    }

    public boolean isDocument() {
        return (getDocument() == null || isVideo() || isMusic() || isVoice() || isAnyKindOfSticker()) ? false : true;
    }

    public boolean isVoice() {
        return isVoiceMessage(this.messageOwner);
    }

    public boolean isVideo() {
        return isVideoMessage(this.messageOwner);
    }

    public boolean isVideoStory() {
        TL_stories$StoryItem tL_stories$StoryItem;
        TLRPC$MessageMedia tLRPC$MessageMedia;
        TLRPC$MessageMedia media = getMedia(this.messageOwner);
        if (media == null || (tL_stories$StoryItem = media.storyItem) == null || (tLRPC$MessageMedia = tL_stories$StoryItem.media) == null) {
            return false;
        }
        return isVideoDocument(tLRPC$MessageMedia.document);
    }

    public boolean isPhoto() {
        return isPhoto(this.messageOwner);
    }

    public boolean isStoryMedia() {
        TLRPC$Message tLRPC$Message = this.messageOwner;
        return tLRPC$Message != null && (tLRPC$Message.media instanceof TLRPC$TL_messageMediaStory);
    }

    public boolean isLiveLocation() {
        return isLiveLocationMessage(this.messageOwner);
    }

    public boolean isExpiredLiveLocation(int i) {
        TLRPC$Message tLRPC$Message = this.messageOwner;
        return tLRPC$Message.date + getMedia(tLRPC$Message).period <= i;
    }

    public boolean isGame() {
        return isGameMessage(this.messageOwner);
    }

    public boolean isInvoice() {
        return isInvoiceMessage(this.messageOwner);
    }

    public boolean isRoundVideo() {
        if (this.isRoundVideoCached == 0) {
            this.isRoundVideoCached = (this.type == 5 || isRoundVideoMessage(this.messageOwner)) ? 1 : 2;
        }
        return this.isRoundVideoCached == 1;
    }

    public boolean shouldAnimateSending() {
        return this.wasJustSent && (this.type == 5 || isVoice() || ((isAnyKindOfSticker() && this.sendAnimationData != null) || !(this.messageText == null || this.sendAnimationData == null)));
    }

    public boolean hasAttachedStickers() {
        if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaPhoto) {
            return getMedia(this.messageOwner).photo != null && getMedia(this.messageOwner).photo.has_stickers;
        } else if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaDocument) {
            return isDocumentHasAttachedStickers(getMedia(this.messageOwner).document);
        } else {
            return false;
        }
    }

    public static boolean isDocumentHasAttachedStickers(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null) {
            for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
                if (tLRPC$Document.attributes.get(i) instanceof TLRPC$TL_documentAttributeHasStickers) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isGif() {
        return isGifMessage(this.messageOwner);
    }

    public boolean isWebpageDocument() {
        return (!(getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) || getMedia(this.messageOwner).webpage.document == null || isGifDocument(getMedia(this.messageOwner).webpage.document)) ? false : true;
    }

    public boolean isWebpage() {
        return getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage;
    }

    public boolean isNewGif() {
        return getMedia(this.messageOwner) != null && isNewGifDocument(getDocument());
    }

    public boolean isAndroidTheme() {
        if (getMedia(this.messageOwner) != null && getMedia(this.messageOwner).webpage != null && !getMedia(this.messageOwner).webpage.attributes.isEmpty()) {
            int size = getMedia(this.messageOwner).webpage.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC$WebPageAttribute tLRPC$WebPageAttribute = getMedia(this.messageOwner).webpage.attributes.get(i);
                if (tLRPC$WebPageAttribute instanceof TLRPC$TL_webPageAttributeTheme) {
                    TLRPC$TL_webPageAttributeTheme tLRPC$TL_webPageAttributeTheme = (TLRPC$TL_webPageAttributeTheme) tLRPC$WebPageAttribute;
                    ArrayList<TLRPC$Document> arrayList = tLRPC$TL_webPageAttributeTheme.documents;
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if ("application/x-tgtheme-android".equals(arrayList.get(i2).mime_type)) {
                            return true;
                        }
                    }
                    if (tLRPC$TL_webPageAttributeTheme.settings != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String getMusicTitle() {
        return getMusicTitle(true);
    }

    public String getMusicTitle(boolean z) {
        TLRPC$Document document = getDocument();
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = document.attributes.get(i);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                    if (tLRPC$DocumentAttribute.voice) {
                        if (z) {
                            return LocaleController.formatDateAudio(this.messageOwner.date, true);
                        }
                        return null;
                    }
                    String str = tLRPC$DocumentAttribute.title;
                    if (str == null || str.length() == 0) {
                        String documentFileName = FileLoader.getDocumentFileName(document);
                        return (TextUtils.isEmpty(documentFileName) && z) ? LocaleController.getString("AudioUnknownTitle", R.string.AudioUnknownTitle) : documentFileName;
                    }
                    return str;
                } else if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) && tLRPC$DocumentAttribute.round_message) {
                    return LocaleController.formatDateAudio(this.messageOwner.date, true);
                }
            }
            String documentFileName2 = FileLoader.getDocumentFileName(document);
            if (!TextUtils.isEmpty(documentFileName2)) {
                return documentFileName2;
            }
        }
        return LocaleController.getString("AudioUnknownTitle", R.string.AudioUnknownTitle);
    }

    public double getDuration() {
        TL_stories$StoryItem tL_stories$StoryItem;
        TLRPC$MessageMedia tLRPC$MessageMedia;
        double d = this.attributeDuration;
        if (d > 0.0d) {
            return d;
        }
        TLRPC$Document document = getDocument();
        if (document == null && this.type == 23 && (tL_stories$StoryItem = getMedia(this.messageOwner).storyItem) != null && (tLRPC$MessageMedia = tL_stories$StoryItem.media) != null) {
            document = tLRPC$MessageMedia.document;
        }
        if (document == null) {
            return 0.0d;
        }
        int i = this.audioPlayerDuration;
        if (i > 0) {
            return i;
        }
        for (int i2 = 0; i2 < document.attributes.size(); i2++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = document.attributes.get(i2);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                double d2 = tLRPC$DocumentAttribute.duration;
                this.attributeDuration = d2;
                return d2;
            } else if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                double d3 = tLRPC$DocumentAttribute.duration;
                this.attributeDuration = d3;
                return d3;
            }
        }
        return this.audioPlayerDuration;
    }

    public String getArtworkUrl(boolean z) {
        TLRPC$Document document = getDocument();
        if (document == null || "audio/ogg".equals(document.mime_type)) {
            return null;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = document.attributes.get(i);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                if (tLRPC$DocumentAttribute.voice) {
                    return null;
                }
                String str = tLRPC$DocumentAttribute.performer;
                String str2 = tLRPC$DocumentAttribute.title;
                if (!TextUtils.isEmpty(str)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = excludeWords;
                        if (i2 >= strArr.length) {
                            break;
                        }
                        str = str.replace(strArr[i2], " ");
                        i2++;
                    }
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    return null;
                }
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("athumb://itunes.apple.com/search?term=");
                    sb.append(URLEncoder.encode(str + " - " + str2, "UTF-8"));
                    sb.append("&entity=song&limit=4");
                    sb.append(z ? "&s=1" : "");
                    return sb.toString();
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public String getMusicAuthor() {
        return getMusicAuthor(true);
    }

    public java.lang.String getMusicAuthor(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.getMusicAuthor(boolean):java.lang.String");
    }

    public TLRPC$InputStickerSet getInputStickerSet() {
        return getInputStickerSet(this.messageOwner);
    }

    public boolean isForwarded() {
        return isForwardedMessage(this.messageOwner);
    }

    public boolean needDrawForwarded() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.needDrawForwarded():boolean");
    }

    public static boolean isForwardedMessage(TLRPC$Message tLRPC$Message) {
        return ((tLRPC$Message.flags & 4) == 0 || tLRPC$Message.fwd_from == null) ? false : true;
    }

    public boolean isReply() {
        TLRPC$Message tLRPC$Message;
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader;
        MessageObject messageObject = this.replyMessageObject;
        return ((messageObject != null && (messageObject.messageOwner instanceof TLRPC$TL_messageEmpty)) || (tLRPC$MessageReplyHeader = (tLRPC$Message = this.messageOwner).reply_to) == null || (tLRPC$MessageReplyHeader.reply_to_msg_id == 0 && tLRPC$MessageReplyHeader.reply_to_random_id == 0) || (tLRPC$Message.flags & 8) == 0) ? false : true;
    }

    public boolean isMediaEmpty() {
        return isMediaEmpty(this.messageOwner);
    }

    public boolean isMediaEmpty(boolean z) {
        return isMediaEmpty(this.messageOwner, z);
    }

    public boolean isMediaEmptyWebpage() {
        return isMediaEmptyWebpage(this.messageOwner);
    }

    public static boolean isMediaEmpty(TLRPC$Message tLRPC$Message) {
        return isMediaEmpty(tLRPC$Message, true);
    }

    public static boolean isMediaEmpty(TLRPC$Message tLRPC$Message, boolean z) {
        return tLRPC$Message == null || getMedia(tLRPC$Message) == null || (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaEmpty) || (z && (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage));
    }

    public static boolean isMediaEmptyWebpage(TLRPC$Message tLRPC$Message) {
        return tLRPC$Message == null || getMedia(tLRPC$Message) == null || (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaEmpty);
    }

    public boolean hasReplies() {
        TLRPC$MessageReplies tLRPC$MessageReplies = this.messageOwner.replies;
        return tLRPC$MessageReplies != null && tLRPC$MessageReplies.replies > 0;
    }

    public boolean canViewThread() {
        MessageObject messageObject;
        if (this.messageOwner.action != null) {
            return false;
        }
        return hasReplies() || !(((messageObject = this.replyMessageObject) == null || messageObject.messageOwner.replies == null) && getReplyTopMsgId() == 0);
    }

    public boolean isComments() {
        TLRPC$MessageReplies tLRPC$MessageReplies = this.messageOwner.replies;
        return tLRPC$MessageReplies != null && tLRPC$MessageReplies.comments;
    }

    public boolean isLinkedToChat(long j) {
        TLRPC$MessageReplies tLRPC$MessageReplies = this.messageOwner.replies;
        return tLRPC$MessageReplies != null && (j == 0 || tLRPC$MessageReplies.channel_id == j);
    }

    public int getRepliesCount() {
        TLRPC$MessageReplies tLRPC$MessageReplies = this.messageOwner.replies;
        if (tLRPC$MessageReplies != null) {
            return tLRPC$MessageReplies.replies;
        }
        return 0;
    }

    public boolean canEditMessage(TLRPC$Chat tLRPC$Chat) {
        return canEditMessage(this.currentAccount, this.messageOwner, tLRPC$Chat, this.scheduled);
    }

    public boolean canEditMessageScheduleTime(TLRPC$Chat tLRPC$Chat) {
        return canEditMessageScheduleTime(this.currentAccount, this.messageOwner, tLRPC$Chat);
    }

    public boolean canForwardMessage() {
        return ((this.messageOwner instanceof TLRPC$TL_message_secret) || needDrawBluredPreview() || isLiveLocation() || this.type == 16 || isSponsored() || this.messageOwner.noforwards) ? false : true;
    }

    public boolean canEditMedia() {
        if (isSecretMedia()) {
            return false;
        }
        if (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaPhoto) {
            return true;
        }
        return (!(getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaDocument) || isVoice() || isSticker() || isAnimatedSticker() || isRoundVideo()) ? false : true;
    }

    public boolean canEditMessageAnytime(TLRPC$Chat tLRPC$Chat) {
        return canEditMessageAnytime(this.currentAccount, this.messageOwner, tLRPC$Chat);
    }

    public static boolean canEditMessageAnytime(int i, TLRPC$Message tLRPC$Message, TLRPC$Chat tLRPC$Chat) {
        TLRPC$MessageAction tLRPC$MessageAction;
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights;
        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights;
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2;
        if (tLRPC$Message != null && tLRPC$Message.peer_id != null && ((getMedia(tLRPC$Message) == null || (!isRoundVideoDocument(getMedia(tLRPC$Message).document) && !isStickerDocument(getMedia(tLRPC$Message).document) && !isAnimatedStickerDocument(getMedia(tLRPC$Message).document, true))) && (((tLRPC$MessageAction = tLRPC$Message.action) == null || (tLRPC$MessageAction instanceof TLRPC$TL_messageActionEmpty)) && !isForwardedMessage(tLRPC$Message) && tLRPC$Message.via_bot_id == 0 && tLRPC$Message.id >= 0))) {
            TLRPC$Peer tLRPC$Peer = tLRPC$Message.from_id;
            if (tLRPC$Peer instanceof TLRPC$TL_peerUser) {
                long j = tLRPC$Peer.user_id;
                if (j == tLRPC$Message.peer_id.user_id && j == UserConfig.getInstance(i).getClientUserId() && !isLiveLocationMessage(tLRPC$Message)) {
                    return true;
                }
            }
            if (tLRPC$Chat == null && tLRPC$Message.peer_id.channel_id != 0 && (tLRPC$Chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(tLRPC$Message.peer_id.channel_id))) == null) {
                return false;
            }
            if (ChatObject.isChannel(tLRPC$Chat) && !tLRPC$Chat.megagroup && (tLRPC$Chat.creator || ((tLRPC$TL_chatAdminRights2 = tLRPC$Chat.admin_rights) != null && tLRPC$TL_chatAdminRights2.edit_messages))) {
                return true;
            }
            if (tLRPC$Message.out && tLRPC$Chat != null && tLRPC$Chat.megagroup && (tLRPC$Chat.creator || (((tLRPC$TL_chatAdminRights = tLRPC$Chat.admin_rights) != null && tLRPC$TL_chatAdminRights.pin_messages) || ((tLRPC$TL_chatBannedRights = tLRPC$Chat.default_banned_rights) != null && !tLRPC$TL_chatBannedRights.pin_messages)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean canEditMessageScheduleTime(int i, TLRPC$Message tLRPC$Message, TLRPC$Chat tLRPC$Chat) {
        if (tLRPC$Chat == null && tLRPC$Message.peer_id.channel_id != 0 && (tLRPC$Chat = MessagesController.getInstance(i).getChat(Long.valueOf(tLRPC$Message.peer_id.channel_id))) == null) {
            return false;
        }
        if (!ChatObject.isChannel(tLRPC$Chat) || tLRPC$Chat.megagroup || tLRPC$Chat.creator) {
            return true;
        }
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = tLRPC$Chat.admin_rights;
        return tLRPC$TL_chatAdminRights != null && (tLRPC$TL_chatAdminRights.edit_messages || tLRPC$Message.out);
    }

    public static boolean canEditMessage(int i, TLRPC$Message tLRPC$Message, TLRPC$Chat tLRPC$Chat, boolean z) {
        TLRPC$MessageAction tLRPC$MessageAction;
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights;
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2;
        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights;
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights3;
        if (!z || tLRPC$Message.date >= ConnectionsManager.getInstance(i).getCurrentTime() - 60) {
            if ((tLRPC$Chat == null || ((!tLRPC$Chat.left && !tLRPC$Chat.kicked) || (tLRPC$Chat.megagroup && tLRPC$Chat.has_link))) && tLRPC$Message != null && tLRPC$Message.peer_id != null && ((getMedia(tLRPC$Message) == null || (!isRoundVideoDocument(getMedia(tLRPC$Message).document) && !isStickerDocument(getMedia(tLRPC$Message).document) && !isAnimatedStickerDocument(getMedia(tLRPC$Message).document, true) && !isLocationMessage(tLRPC$Message))) && (((tLRPC$MessageAction = tLRPC$Message.action) == null || (tLRPC$MessageAction instanceof TLRPC$TL_messageActionEmpty)) && !isForwardedMessage(tLRPC$Message) && tLRPC$Message.via_bot_id == 0 && tLRPC$Message.id >= 0))) {
                TLRPC$Peer tLRPC$Peer = tLRPC$Message.from_id;
                if (tLRPC$Peer instanceof TLRPC$TL_peerUser) {
                    long j = tLRPC$Peer.user_id;
                    if (j == tLRPC$Message.peer_id.user_id && j == UserConfig.getInstance(i).getClientUserId() && !isLiveLocationMessage(tLRPC$Message) && !(getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaContact)) {
                        return true;
                    }
                }
                if (tLRPC$Chat == null && tLRPC$Message.peer_id.channel_id != 0 && (tLRPC$Chat = MessagesController.getInstance(i).getChat(Long.valueOf(tLRPC$Message.peer_id.channel_id))) == null) {
                    return false;
                }
                if (getMedia(tLRPC$Message) != null && !(getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaEmpty) && !(getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) && !(getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaDocument) && !(getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage)) {
                    return false;
                }
                if (ChatObject.isChannel(tLRPC$Chat) && !tLRPC$Chat.megagroup && (tLRPC$Chat.creator || ((tLRPC$TL_chatAdminRights3 = tLRPC$Chat.admin_rights) != null && tLRPC$TL_chatAdminRights3.edit_messages))) {
                    return true;
                }
                if (tLRPC$Message.out && tLRPC$Chat != null && tLRPC$Chat.megagroup && (tLRPC$Chat.creator || (((tLRPC$TL_chatAdminRights2 = tLRPC$Chat.admin_rights) != null && tLRPC$TL_chatAdminRights2.pin_messages) || ((tLRPC$TL_chatBannedRights = tLRPC$Chat.default_banned_rights) != null && !tLRPC$TL_chatBannedRights.pin_messages)))) {
                    return true;
                }
                if (!z && Math.abs(tLRPC$Message.date - ConnectionsManager.getInstance(i).getCurrentTime()) > MessagesController.getInstance(i).maxEditTime) {
                    return false;
                }
                if (tLRPC$Message.peer_id.channel_id == 0) {
                    if (!tLRPC$Message.out) {
                        TLRPC$Peer tLRPC$Peer2 = tLRPC$Message.from_id;
                        if (!(tLRPC$Peer2 instanceof TLRPC$TL_peerUser) || tLRPC$Peer2.user_id != UserConfig.getInstance(i).getClientUserId()) {
                            return false;
                        }
                    }
                    return (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) || !(!(getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaDocument) || isStickerMessage(tLRPC$Message) || isAnimatedStickerMessage(tLRPC$Message)) || (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaEmpty) || (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage) || getMedia(tLRPC$Message) == null;
                } else if (((tLRPC$Chat != null && tLRPC$Chat.megagroup && tLRPC$Message.out) || (tLRPC$Chat != null && !tLRPC$Chat.megagroup && ((tLRPC$Chat.creator || ((tLRPC$TL_chatAdminRights = tLRPC$Chat.admin_rights) != null && (tLRPC$TL_chatAdminRights.edit_messages || (tLRPC$Message.out && tLRPC$TL_chatAdminRights.post_messages)))) && tLRPC$Message.post))) && ((getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) || (((getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaDocument) && !isStickerMessage(tLRPC$Message) && !isAnimatedStickerMessage(tLRPC$Message)) || (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaEmpty) || (getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaWebPage) || getMedia(tLRPC$Message) == null))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean canDeleteMessage(boolean z, TLRPC$Chat tLRPC$Chat) {
        TLRPC$Message tLRPC$Message;
        return (isStory() && (tLRPC$Message = this.messageOwner) != null && tLRPC$Message.dialog_id == UserConfig.getInstance(this.currentAccount).getClientUserId()) || (this.eventId == 0 && this.sponsoredId == null && canDeleteMessage(this.currentAccount, z, this.messageOwner, tLRPC$Chat));
    }

    public static boolean canDeleteMessage(int i, boolean z, TLRPC$Message tLRPC$Message, TLRPC$Chat tLRPC$Chat) {
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights;
        TLRPC$Peer tLRPC$Peer;
        if (tLRPC$Message == null) {
            return false;
        }
        if (ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat) && (tLRPC$Message.action instanceof TLRPC$TL_messageActionChatJoinedByRequest)) {
            return false;
        }
        if (tLRPC$Message.id < 0) {
            return true;
        }
        if (tLRPC$Chat == null && (tLRPC$Peer = tLRPC$Message.peer_id) != null && tLRPC$Peer.channel_id != 0) {
            tLRPC$Chat = MessagesController.getInstance(i).getChat(Long.valueOf(tLRPC$Message.peer_id.channel_id));
        }
        if (!ChatObject.isChannel(tLRPC$Chat)) {
            return z || isOut(tLRPC$Message) || !ChatObject.isChannel(tLRPC$Chat);
        } else if (z && !tLRPC$Chat.megagroup) {
            if (!tLRPC$Chat.creator) {
                TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2 = tLRPC$Chat.admin_rights;
                if (tLRPC$TL_chatAdminRights2 == null) {
                    return false;
                }
                if (!tLRPC$TL_chatAdminRights2.delete_messages && !tLRPC$Message.out) {
                    return false;
                }
            }
            return true;
        } else {
            boolean z2 = tLRPC$Message.out;
            if (z2 && (tLRPC$Message instanceof TLRPC$TL_messageService)) {
                return tLRPC$Message.id != 1 && ChatObject.canUserDoAdminAction(tLRPC$Chat, 13);
            }
            if (!z) {
                if (tLRPC$Message.id == 1) {
                    return false;
                }
                if (!tLRPC$Chat.creator && (((tLRPC$TL_chatAdminRights = tLRPC$Chat.admin_rights) == null || (!tLRPC$TL_chatAdminRights.delete_messages && (!z2 || (!tLRPC$Chat.megagroup && !tLRPC$TL_chatAdminRights.post_messages)))) && (!tLRPC$Chat.megagroup || !z2))) {
                    return false;
                }
            }
            return true;
        }
    }

    public String getForwardedName() {
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.messageOwner.fwd_from;
        if (tLRPC$MessageFwdHeader != null) {
            TLRPC$Peer tLRPC$Peer = tLRPC$MessageFwdHeader.from_id;
            if (tLRPC$Peer instanceof TLRPC$TL_peerChannel) {
                TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.fwd_from.from_id.channel_id));
                if (chat != null) {
                    return chat.title;
                }
                return null;
            } else if (tLRPC$Peer instanceof TLRPC$TL_peerChat) {
                TLRPC$Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.fwd_from.from_id.chat_id));
                if (chat2 != null) {
                    return chat2.title;
                }
                return null;
            } else if (tLRPC$Peer instanceof TLRPC$TL_peerUser) {
                TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.fwd_from.from_id.user_id));
                if (user != null) {
                    return UserObject.getUserName(user);
                }
                return null;
            } else {
                String str = tLRPC$MessageFwdHeader.from_name;
                if (str != null) {
                    return str;
                }
                return null;
            }
        }
        return null;
    }

    public int getReplyMsgId() {
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader = this.messageOwner.reply_to;
        if (tLRPC$MessageReplyHeader != null) {
            return tLRPC$MessageReplyHeader.reply_to_msg_id;
        }
        return 0;
    }

    public int getReplyTopMsgId() {
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader = this.messageOwner.reply_to;
        if (tLRPC$MessageReplyHeader != null) {
            return tLRPC$MessageReplyHeader.reply_to_top_id;
        }
        return 0;
    }

    public int getReplyTopMsgId(boolean z) {
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader = this.messageOwner.reply_to;
        if (tLRPC$MessageReplyHeader != null) {
            if (z && (tLRPC$MessageReplyHeader.flags & 2) > 0 && tLRPC$MessageReplyHeader.reply_to_top_id == 0) {
                return 1;
            }
            return tLRPC$MessageReplyHeader.reply_to_top_id;
        }
        return 0;
    }

    public static long getReplyToDialogId(TLRPC$Message tLRPC$Message) {
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader = tLRPC$Message.reply_to;
        if (tLRPC$MessageReplyHeader == null) {
            return 0L;
        }
        TLRPC$Peer tLRPC$Peer = tLRPC$MessageReplyHeader.reply_to_peer_id;
        if (tLRPC$Peer != null) {
            return getPeerId(tLRPC$Peer);
        }
        return getDialogId(tLRPC$Message);
    }

    public int getReplyAnyMsgId() {
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader = this.messageOwner.reply_to;
        if (tLRPC$MessageReplyHeader != null) {
            int i = tLRPC$MessageReplyHeader.reply_to_top_id;
            return i != 0 ? i : tLRPC$MessageReplyHeader.reply_to_msg_id;
        }
        return 0;
    }

    public boolean isPrivateForward() {
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.messageOwner.fwd_from;
        return (tLRPC$MessageFwdHeader == null || TextUtils.isEmpty(tLRPC$MessageFwdHeader.from_name)) ? false : true;
    }

    public boolean isImportedForward() {
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.messageOwner.fwd_from;
        return tLRPC$MessageFwdHeader != null && tLRPC$MessageFwdHeader.imported;
    }

    public long getSenderId() {
        TLRPC$Peer tLRPC$Peer;
        TLRPC$Message tLRPC$Message = this.messageOwner;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = tLRPC$Message.fwd_from;
        if (tLRPC$MessageFwdHeader != null && (tLRPC$Peer = tLRPC$MessageFwdHeader.saved_from_peer) != null) {
            long j = tLRPC$Peer.user_id;
            if (j != 0) {
                TLRPC$Peer tLRPC$Peer2 = tLRPC$MessageFwdHeader.from_id;
                return tLRPC$Peer2 instanceof TLRPC$TL_peerUser ? tLRPC$Peer2.user_id : j;
            } else if (tLRPC$Peer.channel_id != 0) {
                if (isSavedFromMegagroup()) {
                    TLRPC$Peer tLRPC$Peer3 = this.messageOwner.fwd_from.from_id;
                    if (tLRPC$Peer3 instanceof TLRPC$TL_peerUser) {
                        return tLRPC$Peer3.user_id;
                    }
                }
                TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader2 = this.messageOwner.fwd_from;
                TLRPC$Peer tLRPC$Peer4 = tLRPC$MessageFwdHeader2.from_id;
                if (tLRPC$Peer4 instanceof TLRPC$TL_peerChannel) {
                    return -tLRPC$Peer4.channel_id;
                }
                if (tLRPC$Peer4 instanceof TLRPC$TL_peerChat) {
                    return -tLRPC$Peer4.chat_id;
                }
                return -tLRPC$MessageFwdHeader2.saved_from_peer.channel_id;
            } else {
                long j2 = tLRPC$Peer.chat_id;
                if (j2 != 0) {
                    TLRPC$Peer tLRPC$Peer5 = tLRPC$MessageFwdHeader.from_id;
                    if (tLRPC$Peer5 instanceof TLRPC$TL_peerUser) {
                        return tLRPC$Peer5.user_id;
                    }
                    if (tLRPC$Peer5 instanceof TLRPC$TL_peerChannel) {
                        return -tLRPC$Peer5.channel_id;
                    }
                    return tLRPC$Peer5 instanceof TLRPC$TL_peerChat ? -tLRPC$Peer5.chat_id : -j2;
                }
            }
        } else {
            TLRPC$Peer tLRPC$Peer6 = tLRPC$Message.from_id;
            if (tLRPC$Peer6 instanceof TLRPC$TL_peerUser) {
                return tLRPC$Peer6.user_id;
            }
            if (tLRPC$Peer6 instanceof TLRPC$TL_peerChannel) {
                return -tLRPC$Peer6.channel_id;
            }
            if (tLRPC$Peer6 instanceof TLRPC$TL_peerChat) {
                return -tLRPC$Peer6.chat_id;
            }
            if (tLRPC$Message.post) {
                return tLRPC$Message.peer_id.channel_id;
            }
        }
        return 0L;
    }

    public boolean isWallpaper() {
        return (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && "telegram_background".equals(getMedia(this.messageOwner).webpage.type);
    }

    public boolean isTheme() {
        return (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && "telegram_theme".equals(getMedia(this.messageOwner).webpage.type);
    }

    public int getMediaExistanceFlags() {
        boolean z = this.attachPathExists;
        return this.mediaExists ? (z ? 1 : 0) | 2 : z ? 1 : 0;
    }

    public void applyMediaExistanceFlags(int i) {
        if (i == -1) {
            checkMediaExistance();
            return;
        }
        this.attachPathExists = (i & 1) != 0;
        this.mediaExists = (i & 2) != 0;
    }

    public void checkMediaExistance() {
        checkMediaExistance(true);
    }

    public void checkMediaExistance(boolean z) {
        int i;
        TLRPC$Photo tLRPC$Photo;
        this.attachPathExists = false;
        this.mediaExists = false;
        int i2 = this.type;
        if (i2 == 20) {
            TLRPC$TL_messageExtendedMediaPreview tLRPC$TL_messageExtendedMediaPreview = (TLRPC$TL_messageExtendedMediaPreview) this.messageOwner.media.extended_media;
            if (tLRPC$TL_messageExtendedMediaPreview.thumb != null) {
                File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(tLRPC$TL_messageExtendedMediaPreview.thumb, z);
                if (!this.mediaExists) {
                    this.mediaExists = pathToAttach.exists() || (tLRPC$TL_messageExtendedMediaPreview.thumb instanceof TLRPC$TL_photoStrippedSize);
                }
            }
        } else if (i2 == 1 && FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, AndroidUtilities.getPhotoSize()) != null) {
            File pathToMessage = FileLoader.getInstance(this.currentAccount).getPathToMessage(this.messageOwner, z);
            if (needDrawBluredPreview()) {
                this.mediaExists = new File(pathToMessage.getAbsolutePath() + ".enc").exists();
            }
            if (!this.mediaExists) {
                this.mediaExists = pathToMessage.exists();
            }
        }
        if ((!this.mediaExists && this.type == 8) || (i = this.type) == 3 || i == 9 || i == 2 || i == 14 || i == 5) {
            String str = this.messageOwner.attachPath;
            if (str != null && str.length() > 0) {
                this.attachPathExists = new File(this.messageOwner.attachPath).exists();
            }
            if (!this.attachPathExists) {
                File pathToMessage2 = FileLoader.getInstance(this.currentAccount).getPathToMessage(this.messageOwner, z);
                if (this.type == 3 && needDrawBluredPreview()) {
                    this.mediaExists = new File(pathToMessage2.getAbsolutePath() + ".enc").exists();
                }
                if (!this.mediaExists) {
                    this.mediaExists = pathToMessage2.exists();
                }
            }
        }
        if (this.mediaExists) {
            return;
        }
        TLRPC$Document document = getDocument();
        if (document != null) {
            if (isWallpaper()) {
                this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(document, null, true, z).exists();
                return;
            } else {
                this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(document, null, false, z).exists();
                return;
            }
        }
        int i3 = this.type;
        if (i3 == 0) {
            TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, AndroidUtilities.getPhotoSize());
            if (closestPhotoSizeWithSize == null) {
                return;
            }
            this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, null, true, z).exists();
        } else if (i3 != 11 || (tLRPC$Photo = this.messageOwner.action.photo) == null || tLRPC$Photo.video_sizes.isEmpty()) {
        } else {
            this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(tLRPC$Photo.video_sizes.get(0), null, true, z).exists();
        }
    }

    public void setQuery(String str) {
        String str2;
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            this.highlightedWords = null;
            this.messageTrimmedToHighlight = null;
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        String lowerCase = str.trim().toLowerCase();
        String[] split = lowerCase.split("\\P{L}+");
        ArrayList arrayList2 = new ArrayList();
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader = this.messageOwner.reply_to;
        if (tLRPC$MessageReplyHeader != null && !TextUtils.isEmpty(tLRPC$MessageReplyHeader.quote_text)) {
            String lowerCase2 = this.messageOwner.reply_to.quote_text.trim().toLowerCase();
            if (lowerCase2.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                handleFoundWords(arrayList, split, true);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase2.split("\\P{L}+")));
        }
        if (!TextUtils.isEmpty(this.messageOwner.message)) {
            String lowerCase3 = this.messageOwner.message.trim().toLowerCase();
            if (lowerCase3.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                handleFoundWords(arrayList, split, false);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase3.split("\\P{L}+")));
        }
        if (getDocument() != null) {
            String lowerCase4 = FileLoader.getDocumentFileName(getDocument()).toLowerCase();
            if (lowerCase4.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase4.split("\\P{L}+")));
        }
        if ((getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC$TL_webPage)) {
            TLRPC$WebPage tLRPC$WebPage = getMedia(this.messageOwner).webpage;
            String str3 = tLRPC$WebPage.title;
            if (str3 == null) {
                str3 = tLRPC$WebPage.site_name;
            }
            if (str3 != null) {
                String lowerCase5 = str3.toLowerCase();
                if (lowerCase5.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                    arrayList.add(lowerCase);
                }
                arrayList2.addAll(Arrays.asList(lowerCase5.split("\\P{L}+")));
            }
        }
        String musicAuthor = getMusicAuthor();
        if (musicAuthor != null) {
            String lowerCase6 = musicAuthor.toLowerCase();
            if (lowerCase6.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase6.split("\\P{L}+")));
        }
        for (String str4 : split) {
            if (str4.length() >= 2) {
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (!arrayList.contains(arrayList2.get(i)) && (indexOf = (str2 = (String) arrayList2.get(i)).indexOf(str4.charAt(0))) >= 0) {
                        int max = Math.max(str4.length(), str2.length());
                        if (indexOf != 0) {
                            str2 = str2.substring(indexOf);
                        }
                        int min = Math.min(str4.length(), str2.length());
                        int i2 = 0;
                        for (int i3 = 0; i3 < min && str2.charAt(i3) == str4.charAt(i3); i3++) {
                            i2++;
                        }
                        if (i2 / max >= 0.5d) {
                            arrayList.add((String) arrayList2.get(i));
                        }
                    }
                }
            }
        }
        handleFoundWords(arrayList, split, false);
    }

    private void handleFoundWords(ArrayList<String> arrayList, String[] strArr, boolean z) {
        CharSequence charSequence;
        TLRPC$Message tLRPC$Message;
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader;
        boolean z2;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z3 = false;
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    break;
                } else if (arrayList.get(i).contains(strArr[i2])) {
                    z3 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z3) {
                break;
            }
        }
        if (z3) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int i4 = 0;
                while (true) {
                    if (i4 >= strArr.length) {
                        z2 = false;
                        break;
                    } else if (arrayList.get(i3).contains(strArr[i4])) {
                        z2 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (!z2) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (arrayList.size() > 0) {
                Collections.sort(arrayList, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        int lambda$handleFoundWords$3;
                        lambda$handleFoundWords$3 = MessageObject.lambda$handleFoundWords$3((String) obj, (String) obj2);
                        return lambda$handleFoundWords$3;
                    }
                });
                arrayList.clear();
                arrayList.add(arrayList.get(0));
            }
        }
        this.highlightedWords = arrayList;
        if (this.messageOwner.message != null) {
            applyEntities();
            if (!TextUtils.isEmpty(this.caption)) {
                charSequence = this.caption;
            } else {
                charSequence = this.messageText;
            }
            CharSequence replaceCharSequence = AndroidUtilities.replaceCharSequence("\n", charSequence, " ");
            if (z && (tLRPC$Message = this.messageOwner) != null && (tLRPC$MessageReplyHeader = tLRPC$Message.reply_to) != null && tLRPC$MessageReplyHeader.quote_text != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.messageOwner.reply_to.quote_text);
                addEntitiesToText(spannableStringBuilder, this.messageOwner.reply_to.quote_entities, isOutOwner(), false, false, false);
                SpannableString spannableString = new SpannableString("q ");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_quote);
                coloredImageSpan.setOverrideColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
                spannableString.setSpan(coloredImageSpan, 0, 1, 33);
                replaceCharSequence = new SpannableStringBuilder(spannableString).append((CharSequence) spannableStringBuilder).append('\n').append(replaceCharSequence);
            }
            String charSequence2 = replaceCharSequence.toString();
            int length = charSequence2.length();
            int indexOf = charSequence2.toLowerCase().indexOf(arrayList.get(0));
            if (indexOf < 0) {
                indexOf = 0;
            }
            if (length > 200) {
                int max = Math.max(0, indexOf - 100);
                replaceCharSequence = replaceCharSequence.subSequence(max, Math.min(length, (indexOf - max) + indexOf + 100));
            }
            this.messageTrimmedToHighlight = replaceCharSequence;
        }
    }

    public static int lambda$handleFoundWords$3(String str, String str2) {
        return str2.length() - str.length();
    }

    public void createMediaThumbs() {
        TLRPC$MessageMedia tLRPC$MessageMedia;
        if (isStoryMedia()) {
            TL_stories$StoryItem tL_stories$StoryItem = getMedia(this.messageOwner).storyItem;
            if (tL_stories$StoryItem == null || (tLRPC$MessageMedia = tL_stories$StoryItem.media) == null) {
                return;
            }
            TLRPC$Document tLRPC$Document = tLRPC$MessageMedia.document;
            if (tLRPC$Document != null) {
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 50);
                this.mediaThumb = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 320, false, null, true), tLRPC$Document);
                this.mediaSmallThumb = ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document);
                return;
            }
            TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 50);
            this.mediaThumb = ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 320, false, closestPhotoSizeWithSize2, true), this.photoThumbsObject);
            this.mediaSmallThumb = ImageLocation.getForObject(closestPhotoSizeWithSize2, this.photoThumbsObject);
        } else if (isVideo()) {
            TLRPC$Document document = getDocument();
            TLRPC$PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
            this.mediaThumb = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320), document);
            this.mediaSmallThumb = ImageLocation.getForDocument(closestPhotoSizeWithSize3, document);
        } else if (!(getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaPhoto) || getMedia(this.messageOwner).photo == null || this.photoThumbs.isEmpty()) {
        } else {
            TLRPC$PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 50);
            this.mediaThumb = ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 320, false, closestPhotoSizeWithSize4, false), this.photoThumbsObject);
            this.mediaSmallThumb = ImageLocation.getForObject(closestPhotoSizeWithSize4, this.photoThumbsObject);
        }
    }

    public boolean hasHighlightedWords() {
        ArrayList<String> arrayList = this.highlightedWords;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public boolean equals(MessageObject messageObject) {
        return messageObject != null && getId() == messageObject.getId() && getDialogId() == messageObject.getDialogId();
    }

    public boolean isReactionsAvailable() {
        return (isEditing() || isSponsored() || !isSent() || this.messageOwner.action != null || isExpiredStory()) ? false : true;
    }

    public boolean selectReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
        TLRPC$Message tLRPC$Message = this.messageOwner;
        if (tLRPC$Message.reactions == null) {
            tLRPC$Message.reactions = new TLRPC$TL_messageReactions();
            this.messageOwner.reactions.can_see_list = isFromGroup() || isFromUser();
        }
        ArrayList arrayList = new ArrayList();
        TLRPC$ReactionCount tLRPC$ReactionCount = null;
        int i = 0;
        for (int i2 = 0; i2 < this.messageOwner.reactions.results.size(); i2++) {
            if (this.messageOwner.reactions.results.get(i2).chosen) {
                TLRPC$ReactionCount tLRPC$ReactionCount2 = this.messageOwner.reactions.results.get(i2);
                arrayList.add(tLRPC$ReactionCount2);
                int i3 = tLRPC$ReactionCount2.chosen_order;
                if (i3 > i) {
                    i = i3;
                }
            }
            TLRPC$Reaction tLRPC$Reaction = this.messageOwner.reactions.results.get(i2).reaction;
            if (tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) {
                String str = visibleReaction.emojicon;
                if (str != null) {
                    if (((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon.equals(str)) {
                        tLRPC$ReactionCount = this.messageOwner.reactions.results.get(i2);
                    }
                }
            }
            if (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) {
                long j = visibleReaction.documentId;
                if (j != 0 && ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id == j) {
                    tLRPC$ReactionCount = this.messageOwner.reactions.results.get(i2);
                }
            }
        }
        if (!arrayList.isEmpty() && arrayList.contains(tLRPC$ReactionCount) && z) {
            return true;
        }
        int maxUserReactionsCount = MessagesController.getInstance(this.currentAccount).getMaxUserReactionsCount();
        if (!arrayList.isEmpty() && arrayList.contains(tLRPC$ReactionCount)) {
            if (tLRPC$ReactionCount != null) {
                tLRPC$ReactionCount.chosen = false;
                int i4 = tLRPC$ReactionCount.count - 1;
                tLRPC$ReactionCount.count = i4;
                if (i4 <= 0) {
                    this.messageOwner.reactions.results.remove(tLRPC$ReactionCount);
                }
            }
            if (this.messageOwner.reactions.can_see_list) {
                int i5 = 0;
                while (i5 < this.messageOwner.reactions.recent_reactions.size()) {
                    if (getPeerId(this.messageOwner.reactions.recent_reactions.get(i5).peer_id) == UserConfig.getInstance(this.currentAccount).getClientUserId() && ReactionsUtils.compare(this.messageOwner.reactions.recent_reactions.get(i5).reaction, visibleReaction)) {
                        this.messageOwner.reactions.recent_reactions.remove(i5);
                        i5--;
                    }
                    i5++;
                }
            }
            this.reactionsChanged = true;
            return false;
        }
        while (!arrayList.isEmpty() && arrayList.size() >= maxUserReactionsCount) {
            int i6 = 0;
            for (int i7 = 1; i7 < arrayList.size(); i7++) {
                if (((TLRPC$ReactionCount) arrayList.get(i7)).chosen_order < ((TLRPC$ReactionCount) arrayList.get(i6)).chosen_order) {
                    i6 = i7;
                }
            }
            TLRPC$ReactionCount tLRPC$ReactionCount3 = (TLRPC$ReactionCount) arrayList.get(i6);
            tLRPC$ReactionCount3.chosen = false;
            int i8 = tLRPC$ReactionCount3.count - 1;
            tLRPC$ReactionCount3.count = i8;
            if (i8 <= 0) {
                this.messageOwner.reactions.results.remove(tLRPC$ReactionCount3);
            }
            arrayList.remove(tLRPC$ReactionCount3);
            if (this.messageOwner.reactions.can_see_list) {
                int i9 = 0;
                while (i9 < this.messageOwner.reactions.recent_reactions.size()) {
                    if (getPeerId(this.messageOwner.reactions.recent_reactions.get(i9).peer_id) == UserConfig.getInstance(this.currentAccount).getClientUserId() && ReactionsUtils.compare(this.messageOwner.reactions.recent_reactions.get(i9).reaction, visibleReaction)) {
                        this.messageOwner.reactions.recent_reactions.remove(i9);
                        i9--;
                    }
                    i9++;
                }
            }
        }
        if (tLRPC$ReactionCount == null) {
            tLRPC$ReactionCount = new TLRPC$TL_reactionCount();
            if (visibleReaction.emojicon != null) {
                TLRPC$TL_reactionEmoji tLRPC$TL_reactionEmoji = new TLRPC$TL_reactionEmoji();
                tLRPC$ReactionCount.reaction = tLRPC$TL_reactionEmoji;
                tLRPC$TL_reactionEmoji.emoticon = visibleReaction.emojicon;
                this.messageOwner.reactions.results.add(tLRPC$ReactionCount);
            } else {
                TLRPC$TL_reactionCustomEmoji tLRPC$TL_reactionCustomEmoji = new TLRPC$TL_reactionCustomEmoji();
                tLRPC$ReactionCount.reaction = tLRPC$TL_reactionCustomEmoji;
                tLRPC$TL_reactionCustomEmoji.document_id = visibleReaction.documentId;
                this.messageOwner.reactions.results.add(tLRPC$ReactionCount);
            }
        }
        tLRPC$ReactionCount.chosen = true;
        tLRPC$ReactionCount.count++;
        tLRPC$ReactionCount.chosen_order = i + 1;
        TLRPC$Message tLRPC$Message2 = this.messageOwner;
        if (tLRPC$Message2.reactions.can_see_list || (tLRPC$Message2.dialog_id > 0 && maxUserReactionsCount > 1)) {
            TLRPC$TL_messagePeerReaction tLRPC$TL_messagePeerReaction = new TLRPC$TL_messagePeerReaction();
            TLRPC$Message tLRPC$Message3 = this.messageOwner;
            if (tLRPC$Message3.isThreadMessage && tLRPC$Message3.fwd_from != null) {
                tLRPC$TL_messagePeerReaction.peer_id = MessagesController.getInstance(this.currentAccount).getSendAsSelectedPeer(getFromChatId());
            } else {
                tLRPC$TL_messagePeerReaction.peer_id = MessagesController.getInstance(this.currentAccount).getSendAsSelectedPeer(getDialogId());
            }
            this.messageOwner.reactions.recent_reactions.add(0, tLRPC$TL_messagePeerReaction);
            if (visibleReaction.emojicon != null) {
                TLRPC$TL_reactionEmoji tLRPC$TL_reactionEmoji2 = new TLRPC$TL_reactionEmoji();
                tLRPC$TL_messagePeerReaction.reaction = tLRPC$TL_reactionEmoji2;
                tLRPC$TL_reactionEmoji2.emoticon = visibleReaction.emojicon;
            } else {
                TLRPC$TL_reactionCustomEmoji tLRPC$TL_reactionCustomEmoji2 = new TLRPC$TL_reactionCustomEmoji();
                tLRPC$TL_messagePeerReaction.reaction = tLRPC$TL_reactionCustomEmoji2;
                tLRPC$TL_reactionCustomEmoji2.document_id = visibleReaction.documentId;
            }
        }
        this.reactionsChanged = true;
        return true;
    }

    public boolean probablyRingtone() {
        if (getDocument() != null && RingtoneDataStore.ringtoneSupportedMimeType.contains(getDocument().mime_type) && getDocument().size < MessagesController.getInstance(this.currentAccount).ringtoneSizeMax * 2) {
            for (int i = 0; i < getDocument().attributes.size(); i++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = getDocument().attributes.get(i);
                if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) && tLRPC$DocumentAttribute.duration < 60.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public byte[] getWaveform() {
        if (getDocument() == null) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < getDocument().attributes.size(); i2++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = getDocument().attributes.get(i2);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                byte[] bArr = tLRPC$DocumentAttribute.waveform;
                if (bArr == null || bArr.length == 0) {
                    MediaController.getInstance().generateWaveform(this);
                }
                return tLRPC$DocumentAttribute.waveform;
            }
        }
        if (isRoundVideo()) {
            if (this.randomWaveform == null) {
                this.randomWaveform = new byte[120];
                while (true) {
                    byte[] bArr2 = this.randomWaveform;
                    if (i >= bArr2.length) {
                        break;
                    }
                    bArr2[i] = (byte) (Math.random() * 255.0d);
                    i++;
                }
            }
            return this.randomWaveform;
        }
        return null;
    }

    public boolean isStory() {
        return this.storyItem != null;
    }

    public TLRPC$WebPage getStoryMentionWebpage() {
        if (isStoryMention()) {
            TLRPC$WebPage tLRPC$WebPage = this.storyMentionWebpage;
            if (tLRPC$WebPage != null) {
                return tLRPC$WebPage;
            }
            TLRPC$TL_webPage tLRPC$TL_webPage = new TLRPC$TL_webPage();
            tLRPC$TL_webPage.type = "telegram_story";
            TLRPC$TL_webPageAttributeStory tLRPC$TL_webPageAttributeStory = new TLRPC$TL_webPageAttributeStory();
            tLRPC$TL_webPageAttributeStory.id = this.messageOwner.media.id;
            tLRPC$TL_webPageAttributeStory.peer = MessagesController.getInstance(this.currentAccount).getPeer(this.messageOwner.media.user_id);
            TL_stories$StoryItem tL_stories$StoryItem = this.messageOwner.media.storyItem;
            if (tL_stories$StoryItem != null) {
                tLRPC$TL_webPageAttributeStory.flags |= 1;
                tLRPC$TL_webPageAttributeStory.storyItem = tL_stories$StoryItem;
            }
            tLRPC$TL_webPage.attributes.add(tLRPC$TL_webPageAttributeStory);
            this.storyMentionWebpage = tLRPC$TL_webPage;
            return tLRPC$TL_webPage;
        }
        return null;
    }

    public boolean isStoryMention() {
        return this.type == 24 && !isExpiredStory();
    }

    public boolean isGiveaway() {
        return this.type == 26;
    }

    public boolean isGiveawayOrGiveawayResults() {
        return isGiveaway() || isGiveawayResults();
    }

    public boolean isGiveawayResults() {
        return this.type == 28;
    }

    public boolean isAnyGift() {
        int i = this.type;
        return i == 18 || i == 25;
    }

    public static CharSequence userSpan() {
        return userSpan(0);
    }

    public static CharSequence userSpan(int i) {
        if (userSpan == null) {
            userSpan = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = userSpan;
        if (charSequenceArr[i] == null) {
            charSequenceArr[i] = new SpannableStringBuilder("u");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_reply_user);
            coloredImageSpan.spaceScaleX = 0.9f;
            if (i == 0) {
                coloredImageSpan.translate(0.0f, AndroidUtilities.dp(1.0f));
            }
            ((SpannableStringBuilder) userSpan[i]).setSpan(coloredImageSpan, 0, 1, 33);
        }
        return userSpan[i];
    }

    public static CharSequence groupSpan() {
        if (groupSpan == null) {
            groupSpan = new SpannableStringBuilder(ImageLoader.AUTOPLAY_FILTER);
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_folders_groups);
            coloredImageSpan.setScale(0.7f, 0.7f);
            ((SpannableStringBuilder) groupSpan).setSpan(coloredImageSpan, 0, 1, 33);
        }
        return groupSpan;
    }

    public static CharSequence channelSpan() {
        if (channelSpan == null) {
            channelSpan = new SpannableStringBuilder("c");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_folders_channels);
            coloredImageSpan.setScale(0.7f, 0.7f);
            ((SpannableStringBuilder) channelSpan).setSpan(coloredImageSpan, 0, 1, 33);
        }
        return channelSpan;
    }

    public static CharSequence peerNameWithIcon(int i, TLRPC$Peer tLRPC$Peer) {
        return peerNameWithIcon(i, tLRPC$Peer, !(tLRPC$Peer instanceof TLRPC$TL_peerUser));
    }

    public static CharSequence peerNameWithIcon(int i, TLRPC$Peer tLRPC$Peer, boolean z) {
        TLRPC$Chat chat;
        if (tLRPC$Peer instanceof TLRPC$TL_peerUser) {
            TLRPC$User user = MessagesController.getInstance(i).getUser(Long.valueOf(tLRPC$Peer.user_id));
            if (user != null) {
                if (z) {
                    return new SpannableStringBuilder(userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(user));
                }
                return UserObject.getUserName(user);
            }
            return "";
        } else if (tLRPC$Peer instanceof TLRPC$TL_peerChat) {
            TLRPC$Chat chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(tLRPC$Peer.chat_id));
            if (chat2 != null) {
                if (z) {
                    return new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat2) ? channelSpan() : groupSpan()).append((CharSequence) " ").append((CharSequence) chat2.title);
                }
                return chat2.title;
            }
            return "";
        } else if (!(tLRPC$Peer instanceof TLRPC$TL_peerChannel) || (chat = MessagesController.getInstance(i).getChat(Long.valueOf(tLRPC$Peer.channel_id))) == null) {
            return "";
        } else {
            if (z) {
                return new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? channelSpan() : groupSpan()).append((CharSequence) " ").append((CharSequence) chat.title);
            }
            return chat.title;
        }
    }

    public static CharSequence peerNameWithIcon(int i, long j) {
        return peerNameWithIcon(i, j, false);
    }

    public static CharSequence peerNameWithIcon(int i, long j, boolean z) {
        if (j >= 0) {
            TLRPC$User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            return user != null ? UserObject.getUserName(user) : "";
        }
        TLRPC$Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        if (chat != null) {
            return new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? channelSpan() : groupSpan()).append((CharSequence) " ").append((CharSequence) chat.title);
        }
        return "";
    }

    public CharSequence getReplyQuoteNameWithIcon() {
        CharSequence charSequence;
        CharSequence spannableStringBuilder;
        TLRPC$Message tLRPC$Message = this.messageOwner;
        if (tLRPC$Message == null) {
            return "";
        }
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader = tLRPC$Message.reply_to;
        CharSequence charSequence2 = null;
        if (tLRPC$MessageReplyHeader == null) {
            if (DialogObject.isChatDialog(getDialogId())) {
                charSequence = peerNameWithIcon(this.currentAccount, getDialogId());
            } else {
                spannableStringBuilder = peerNameWithIcon(this.currentAccount, getDialogId());
                charSequence2 = spannableStringBuilder;
                charSequence = null;
            }
        } else {
            if (tLRPC$MessageReplyHeader.reply_from != null) {
                TLRPC$Peer tLRPC$Peer = tLRPC$MessageReplyHeader.reply_to_peer_id;
                boolean z = tLRPC$Peer == null || DialogObject.getPeerDialogId(tLRPC$Peer) != getDialogId();
                TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.messageOwner.reply_to.reply_from;
                TLRPC$Peer tLRPC$Peer2 = tLRPC$MessageFwdHeader.from_id;
                if (tLRPC$Peer2 != null) {
                    if (tLRPC$Peer2 instanceof TLRPC$TL_peerUser) {
                        spannableStringBuilder = peerNameWithIcon(this.currentAccount, tLRPC$Peer2, z);
                        charSequence2 = spannableStringBuilder;
                        charSequence = null;
                    } else {
                        charSequence = peerNameWithIcon(this.currentAccount, tLRPC$Peer2, z);
                    }
                } else {
                    TLRPC$Peer tLRPC$Peer3 = tLRPC$MessageFwdHeader.saved_from_peer;
                    if (tLRPC$Peer3 != null) {
                        if (tLRPC$Peer3 instanceof TLRPC$TL_peerUser) {
                            spannableStringBuilder = peerNameWithIcon(this.currentAccount, tLRPC$Peer3, z);
                        } else {
                            charSequence = peerNameWithIcon(this.currentAccount, tLRPC$Peer3, z);
                        }
                    } else if (!TextUtils.isEmpty(tLRPC$MessageFwdHeader.from_name)) {
                        if (z) {
                            spannableStringBuilder = new SpannableStringBuilder(userSpan()).append((CharSequence) " ").append((CharSequence) this.messageOwner.reply_to.reply_from.from_name);
                        } else {
                            spannableStringBuilder = new SpannableStringBuilder(this.messageOwner.reply_to.reply_from.from_name);
                        }
                    }
                    charSequence2 = spannableStringBuilder;
                    charSequence = null;
                }
            }
            charSequence = null;
        }
        TLRPC$Peer tLRPC$Peer4 = this.messageOwner.reply_to.reply_to_peer_id;
        if (tLRPC$Peer4 != null && DialogObject.getPeerDialogId(tLRPC$Peer4) != getDialogId()) {
            TLRPC$Peer tLRPC$Peer5 = this.messageOwner.reply_to.reply_to_peer_id;
            if (tLRPC$Peer5 instanceof TLRPC$TL_peerUser) {
                charSequence2 = peerNameWithIcon(this.currentAccount, tLRPC$Peer5, true);
            } else {
                charSequence = peerNameWithIcon(this.currentAccount, tLRPC$Peer5);
            }
        }
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null) {
            if (DialogObject.isChatDialog(messageObject.getSenderId())) {
                if (charSequence == null) {
                    charSequence = peerNameWithIcon(this.currentAccount, this.replyMessageObject.getSenderId());
                }
            } else if (charSequence2 == null) {
                charSequence2 = peerNameWithIcon(this.currentAccount, this.replyMessageObject.getSenderId());
            }
        }
        if (charSequence == null || charSequence2 == null) {
            return charSequence != null ? charSequence : charSequence2 != null ? charSequence2 : LocaleController.getString(R.string.Loading);
        }
        return new SpannableStringBuilder(charSequence2).append((CharSequence) " ").append(charSequence);
    }

    public boolean hasLinkMediaToMakeSmall() {
        boolean z = !this.isRestrictedMessage && (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC$TL_webPage);
        TLRPC$WebPage tLRPC$WebPage = z ? getMedia(this.messageOwner).webpage : null;
        String str = tLRPC$WebPage != null ? tLRPC$WebPage.type : null;
        return z && !isGiveawayOrGiveawayResults() && tLRPC$WebPage != null && (tLRPC$WebPage.photo != null || isVideoDocument(tLRPC$WebPage.document)) && !((TextUtils.isEmpty(tLRPC$WebPage.description) && TextUtils.isEmpty(tLRPC$WebPage.title)) || ((isSponsored() && this.sponsoredWebPage == null && this.sponsoredChannelPost == 0) || "telegram_megagroup".equals(str) || "telegram_background".equals(str) || "telegram_voicechat".equals(str) || "telegram_livestream".equals(str) || "telegram_user".equals(str) || "telegram_story".equals(str) || "telegram_channel_boost".equals(str)));
    }

    public boolean isLinkMediaSmall() {
        TLRPC$WebPage tLRPC$WebPage = !this.isRestrictedMessage && (getMedia(this.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC$TL_webPage) ? getMedia(this.messageOwner).webpage : null;
        String str = tLRPC$WebPage != null ? tLRPC$WebPage.type : null;
        return !(tLRPC$WebPage != null && TextUtils.isEmpty(tLRPC$WebPage.description) && TextUtils.isEmpty(tLRPC$WebPage.title)) && ("app".equals(str) || "profile".equals(str) || "article".equals(str) || "telegram_bot".equals(str) || "telegram_user".equals(str) || "telegram_channel".equals(str) || "telegram_megagroup".equals(str) || "telegram_voicechat".equals(str) || "telegram_livestream".equals(str) || "telegram_channel_boost".equals(str));
    }

    public static class TextRange {
        public boolean code;
        public int end;
        public String language;
        public boolean quote;
        public int start;

        public TextRange(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        public TextRange(int i, int i2, boolean z, boolean z2, String str) {
            this.start = i;
            this.end = i2;
            this.quote = z;
            this.code = z2;
            this.language = str;
        }
    }

    public static void cutIntoRanges(CharSequence charSequence, ArrayList<TextRange> arrayList) {
        Iterator it;
        if (charSequence == null) {
            return;
        }
        if (!(charSequence instanceof Spanned)) {
            arrayList.add(new TextRange(0, charSequence.length()));
            return;
        }
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        Spanned spanned = (Spanned) charSequence;
        QuoteSpan.QuoteStyleSpan[] quoteStyleSpanArr = (QuoteSpan.QuoteStyleSpan[]) spanned.getSpans(0, spanned.length(), QuoteSpan.QuoteStyleSpan.class);
        for (int i = 0; i < quoteStyleSpanArr.length; i++) {
            quoteStyleSpanArr[i].span.adaptLineHeight = false;
            int spanStart = spanned.getSpanStart(quoteStyleSpanArr[i]);
            int spanEnd = spanned.getSpanEnd(quoteStyleSpanArr[i]);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0) | 1));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
        }
        CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(0, spanned.length(), CodeHighlighting.Span.class);
        for (int i2 = 0; i2 < spanArr.length; i2++) {
            int spanStart2 = spanned.getSpanStart(spanArr[i2]);
            int spanEnd2 = spanned.getSpanEnd(spanArr[i2]);
            treeSet.add(Integer.valueOf(spanStart2));
            hashMap.put(Integer.valueOf(spanStart2), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanStart2)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart2))).intValue() : 0) | 4));
            treeSet.add(Integer.valueOf(spanEnd2));
            hashMap.put(Integer.valueOf(spanEnd2), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd2)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd2))).intValue() : 0) | 8));
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (Iterator it2 = treeSet.iterator(); it2.hasNext(); it2 = it) {
            int intValue = ((Integer) it2.next()).intValue();
            int intValue2 = ((Integer) hashMap.get(Integer.valueOf(intValue))).intValue();
            if (i6 != intValue) {
                int i7 = intValue - 1;
                if (i7 >= 0 && i7 < charSequence.length() && charSequence.charAt(i7) == '\n') {
                    intValue--;
                }
                int i8 = intValue;
                String str = null;
                if ((intValue2 & 8) != 0 && i5 < spanArr.length) {
                    str = spanArr[i5].lng;
                    i5++;
                }
                String str2 = str;
                it = it2;
                arrayList.add(new TextRange(i6, i8, i3 > 0, i4 > 0, str2));
                i6 = i8 + 1;
                if (i6 >= charSequence.length() || charSequence.charAt(i8) != '\n') {
                    i6 = i8;
                }
            } else {
                it = it2;
            }
            if ((intValue2 & 2) != 0) {
                i3--;
            }
            if ((intValue2 & 1) != 0) {
                i3++;
            }
            if ((intValue2 & 8) != 0) {
                i4--;
            }
            if ((intValue2 & 4) != 0) {
                i4++;
            }
        }
        if (i6 < charSequence.length()) {
            arrayList.add(new TextRange(i6, charSequence.length(), i3 > 0, i4 > 0, null));
        }
    }

    public void toggleChannelRecommendations() {
        expandChannelRecommendations(!this.channelJoinedExpanded);
    }

    public void expandChannelRecommendations(boolean z) {
        this.channelJoinedExpanded = z;
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putBoolean("c" + getDialogId() + "_rec", z).apply();
    }

    public static int findQuoteStart(String str, String str2, int i) {
        if (str == null || str2 == null) {
            return -1;
        }
        if (i == -1) {
            return str.indexOf(str2);
        }
        if (str2.length() + i >= str.length() || !str.startsWith(str2, i)) {
            int indexOf = str.indexOf(str2, i);
            int lastIndexOf = str.lastIndexOf(str2, i);
            return indexOf == -1 ? lastIndexOf : (lastIndexOf != -1 && indexOf - i >= i - lastIndexOf) ? lastIndexOf : indexOf;
        }
        return i;
    }
}
