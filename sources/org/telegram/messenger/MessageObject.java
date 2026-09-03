package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
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
import android.view.View;
import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.d31;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.zi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.kj0;
import org.telegram.ui.uu0;
import org.telegram.ui.zn;
public class MessageObject {
    public static final int ENTITIES_ALL = 0;
    public static final int ENTITIES_ONLY_HASHTAGS = 1;
    private static final int LINES_PER_BLOCK = 10;
    private static final int LINES_PER_BLOCK_WITH_EMOJI = 5;
    private static final int MESSAGE_ID_EPHEMERAL_BITS_MASK = 1610612736;
    private static final int MESSAGE_ID_RESERVED_BITS_MASK = 1879048192;
    public static final int MESSAGE_SEND_STATE_EDITING = 3;
    public static final int MESSAGE_SEND_STATE_SENDING = 1;
    public static final int MESSAGE_SEND_STATE_SEND_ERROR = 2;
    public static final int MESSAGE_SEND_STATE_SENT = 0;
    public static final int POSITION_FLAG_BOTTOM = 8;
    public static final int POSITION_FLAG_LEFT = 1;
    public static final int POSITION_FLAG_RIGHT = 2;
    public static final int POSITION_FLAG_TOP = 4;
    public static final int SUGGESTION_FLAG_EDIT_MEDIA = 8;
    public static final int SUGGESTION_FLAG_EDIT_PRCIE = 1;
    public static final int SUGGESTION_FLAG_EDIT_TEXT = 4;
    public static final int SUGGESTION_FLAG_EDIT_TIME = 2;
    public static final int TYPE_ACTION_PHOTO = 11;
    public static final int TYPE_ACTION_WALLPAPER = 22;
    public static final int TYPE_ANIMATED_STICKER = 15;
    public static final int TYPE_ARTICLE = 36;
    public static final int TYPE_COMMUNITY_CHANGED = 37;
    public static final int TYPE_CONTACT = 12;
    public static final int TYPE_DATE = 10;
    public static final int TYPE_EMOJIS = 19;
    public static final int TYPE_EXTENDED_MEDIA_PREVIEW = 20;
    public static final int TYPE_FILE = 9;
    public static final int TYPE_GEO = 4;
    public static final int TYPE_GIF = 8;
    public static final int TYPE_GIFT_OFFER = 33;
    public static final int TYPE_GIFT_OFFER_REJECTED = 34;
    public static final int TYPE_GIFT_PREMIUM = 18;
    public static final int TYPE_GIFT_PREMIUM_CHANNEL = 25;
    public static final int TYPE_GIFT_STARS = 30;
    public static final int TYPE_GIFT_THEME_UPDATE = 31;
    public static final int TYPE_GIVEAWAY = 26;
    public static final int TYPE_GIVEAWAY_RESULTS = 28;
    public static final int TYPE_JOINED_CHANNEL = 27;
    public static final int TYPE_LOADING = 6;
    public static final int TYPE_MUSIC = 14;
    public static final int TYPE_PAID_MEDIA = 29;
    public static final int TYPE_PHONE_CALL = 16;
    public static final int TYPE_PHOTO = 1;
    public static final int TYPE_POLL = 17;
    public static final int TYPE_ROUND_VIDEO = 5;
    public static final int TYPE_SHARING_OFFER = 35;
    public static final int TYPE_STICKER = 13;
    public static final int TYPE_STORY = 23;
    public static final int TYPE_STORY_MENTION = 24;
    public static final int TYPE_SUGGEST_BIRTHDAY = 32;
    public static final int TYPE_SUGGEST_PHOTO = 21;
    public static final int TYPE_TEXT = 0;
    public static final int TYPE_UNSUPPORTED = 38;
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
    public long actionDeleteGroupEventId;
    public boolean animateComments;
    public int animatedEmojiCount;
    public boolean attachPathExists;
    public double attributeDuration;
    public Bitmap audioCover;
    public int audioPlayerDuration;
    public float audioProgress;
    public int audioProgressMs;
    public int audioProgressSec;
    public StringBuilder botButtonsLayout;
    public float bufferedProgress;
    public boolean business;
    private Integer cachedApproximateHeight;
    public Boolean cachedIsSupergroup;
    public g71 cachedQuality;
    public Float cachedSavedTimestamp;
    private Integer cachedStartsTimestamp;
    private Integer cachedTextHeight;
    public boolean cancelEditing;
    public CharSequence caption;
    private boolean captionSummarized;
    private boolean captionTranslated;
    private boolean channelJoined;
    public boolean channelJoinedExpanded;
    public ArrayList<TLRPC.PollAnswer> checkedVotes;
    public int contentType;
    public int currentAccount;
    public TLRPC.TL_channelAdminLogEvent currentEvent;
    public Drawable customAvatarDrawable;
    public String customName;
    public String customReplyName;
    public String dateKey;
    public int dateKeyInt;
    public boolean deleted;
    public boolean deletedByThanos;
    public TLRPC.Document documentToPollAddOption;
    public boolean drawServiceWithDefaultTypeface;
    public CharSequence editingMessage;
    public ArrayList<TLRPC.MessageEntity> editingMessageEntities;
    public boolean editingMessageSearchWebPage;
    public TLRPC.Document emojiAnimatedSticker;
    public String emojiAnimatedStickerColor;
    public Long emojiAnimatedStickerId;
    private boolean emojiAnimatedStickerLoading;
    public TLRPC.VideoSize emojiMarkup;
    public int emojiOnlyCount;
    public long eventId;
    public boolean expandedExplanation;
    public HashSet<Integer> expandedQuotes;
    public long extendedMediaLastCheckTime;
    public boolean factCheckExpanded;
    private CharSequence factCheckText;
    public boolean flickerLoading;
    public boolean forceAvatar;
    public boolean forceExpired;
    public boolean forcePlayEffect;
    public float forceSeekTo;
    public boolean forceShowPollResults;
    public boolean forceUpdate;
    private float generatedWithDensity;
    private float generatedWithFontSize;
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
    public g71 highestQuality;
    public ArrayList<String> highlightedWords;
    private BotInlineKeyboard.Source inlineKeyboardSource;
    public boolean isBotPendingDraft;
    public boolean isDateObject;
    public boolean isDownloadingFile;
    private Boolean isEmbedVideoCached;
    public boolean isLiveStoryPush;
    public boolean isMediaSpoilersRevealed;
    public boolean isMediaSpoilersRevealedInSharedMedia;
    public boolean isOauthPush;
    public Boolean isOutOwnerCached;
    public boolean isPlayingExplanationObject;
    public boolean isPrimaryGroupMessage;
    public boolean isReactionPush;
    public boolean isRepostPreview;
    public boolean isRepostVideoPreview;
    public boolean isRestrictedMessage;
    private int isRoundVideoCached;
    public boolean isSaved;
    public boolean isSavedFiltered;
    public Boolean isSensitiveCached;
    public boolean isSpoilersRevealed;
    public boolean isStoryMentionPush;
    public boolean isStoryPush;
    public boolean isStoryPushHidden;
    public boolean isStoryReactionPush;
    public boolean isTopicMainMessage;
    public boolean isVideoConversionObject;
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
    public TLRPC.Message messageOwner;
    public CharSequence messageText;
    public CharSequence messageTextForReply;
    public CharSequence messageTextShort;
    public CharSequence messageTrimmedToHighlight;
    public boolean messageTrimmedToHighlightCut;
    public String monthKey;
    public boolean notime;
    public boolean openedInViewer;
    public int overrideLinkColor;
    public long overrideLinkEmoji;
    public TLRPC.TL_peerColorCollectible overrideLinkPeerColor;
    public nh.l6 parentStoriesList;
    public int parentWidth;
    public SvgHelper.SvgDrawable pathThumb;
    public ArrayList<TLRPC.PhotoSize> photoThumbs;
    public ArrayList<TLRPC.PhotoSize> photoThumbs2;
    public TLObject photoThumbsObject;
    public TLObject photoThumbsObject2;
    public boolean playedGiftAnimation;
    public long pollLastCheckTime;
    public ArrayList<Integer> pollMediaMapping;
    public boolean pollVisibleOnScreen;
    public boolean preview;
    public boolean previewForward;
    public String previousAttachPath;
    public TLRPC.MessageMedia previousMedia;
    public String previousMessage;
    public ArrayList<TLRPC.MessageEntity> previousMessageEntities;
    public boolean putInDownloadsStore;
    public TLRPC.Document qualityToSave;
    public String quick_reply_shortcut;
    public CharSequence quizExplanation;
    private byte[] randomWaveform;
    public boolean reactionsChanged;
    public long reactionsLastCheckTime;
    public int realDate;
    public MessageObject replyMessageObject;
    public boolean replyTextEllipsized;
    public boolean replyTextRevealed;
    public TLRPC.TL_forumTopic replyToForumTopic;
    public boolean resendAsIs;
    public boolean revealingMediaSpoilers;
    public boolean richCheckboxEcho;
    public RichMessageLayout richLayout;
    public int richMessageMediaType;
    public boolean scheduled;
    public boolean scheduledSent;
    public int searchType;
    private CharSequence secretOnceSpan;
    private CharSequence secretPlaySpan;
    public SendAnimationData sendAnimationData;
    public TLRPC.Peer sendAsPeer;
    public boolean sendPreview;
    public MediaController.PhotoEntry sendPreviewEntry;
    public boolean sentHighQuality;
    public boolean settingAvatar;
    public boolean shouldRemoveVideoEditedInfo;
    public boolean sideMenuEnabled;
    private boolean spoiledLoginCode;
    public String sponsoredAdditionalInfo;
    public String sponsoredButtonText;
    public boolean sponsoredCanReport;
    public TLRPC.PeerColor sponsoredColor;
    public byte[] sponsoredId;
    public String sponsoredInfo;
    public TLRPC.MessageMedia sponsoredMedia;
    public TLRPC.Photo sponsoredPhoto;
    public boolean sponsoredRecommended;
    public String sponsoredTitle;
    public String sponsoredUrl;
    public int stableId;
    public TL_stories.StoryItem storyItem;
    private TLRPC.WebPage storyMentionWebpage;
    public BitmapDrawable strippedThumb;
    public boolean summarized;
    public ArrayList<TextLayoutBlock> textLayoutBlocks;
    public int textWidth;
    public float textXOffset;
    public g71 thumbQuality;
    public Drawable[] topicIconDrawable;
    public int totalAnimatedEmojiCount;
    public boolean translated;
    public int type;
    public nh.s6 uploadingStory;
    public boolean useCustomPhoto;
    public CharSequence vCardData;
    public VideoEditedInfo videoEditedInfo;
    public ArrayList<e71> videoQualities;
    private Boolean videoQualitiesCached;
    public boolean viewsReloaded;
    public int wantedBotKeyboardWidth;
    public boolean wasJustSent;
    public boolean wasUnread;
    public ArrayList<TLRPC.MessageEntity> webPageDescriptionEntities;
    public CharSequence youtubeDescription;

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
        public float f16646ph;
        public int photoHeight;
        public int photoWidth;
        public int pw;
        public float[] siblingHeights;
        public int spanSize;
        public float top;

        public void set(int i10, int i11, int i12, int i13, int i14, float f10, int i15) {
            this.minX = (byte) i10;
            this.maxX = (byte) i11;
            this.minY = (byte) i12;
            this.maxY = (byte) i13;
            this.pw = i14;
            this.spanSize = i14;
            this.f16646ph = f10;
            this.flags = (byte) i15;
        }
    }

    public static class SendAnimationData {
        public float currentScale;
        public float currentX;
        public float currentY;
        public org.telegram.ui.Cells.r1 fromParams;
        public boolean fromPreview;
        public float height;
        public float progress;
        public float timeAlpha;
        public float width;
        public float f16647x;
        public float f16648y;
    }

    public static class TextLayoutBlock implements kj0 {
        public static final int FLAG_NOT_RTL = 2;
        public static final int FLAG_RTL = 1;
        public int charactersEnd;
        public int charactersOffset;
        public boolean code;
        public org.telegram.ui.Components.rc collapsedBounce;
        public int collapsedHeight;
        public Drawable copyIcon;
        public int copyIconColor;
        public Drawable copySelector;
        public int copySelectorColor;
        public Paint copySeparator;
        public k01 copyText;
        public byte directionFlags;
        public boolean first;
        public boolean hasCodeCopyButton;
        public int height;
        public int heightByOffset;
        public int index;
        public String language;
        public int languageHeight;
        public k01 languageLayout;
        public boolean last;
        public float maxRight;
        public MessageObject messageObject;
        public int originalWidth;
        public int padBottom;
        public int padTop;
        public boolean quote;
        public boolean quoteCollapse;
        public int start;
        public StaticLayout textLayout;
        public AtomicReference<Layout> spoilersPatchedTextLayout = new AtomicReference<>();
        public List<ih.k> spoilers = new ArrayList();

        private static String capitalizeFirst(String str) {
            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }

        public static String capitalizeLanguage(String str) {
            if (str == null) {
                return null;
            }
            String replaceAll = str.toLowerCase().replaceAll("\\W|lang$", "");
            replaceAll.getClass();
            char c3 = 65535;
            switch (replaceAll.hashCode()) {
                case -1886433663:
                    if (replaceAll.equals("actionscript")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1408289185:
                    if (replaceAll.equals("aspnet")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -1395746259:
                    if (replaceAll.equals("bbcode")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case -1351281305:
                    if (replaceAll.equals("csharp")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case -1265393852:
                    if (replaceAll.equals("fsharp")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case -1081245651:
                    if (replaceAll.equals("matlab")) {
                        c3 = 5;
                        break;
                    }
                    break;
                case -973197092:
                    if (replaceAll.equals("python")) {
                        c3 = 6;
                        break;
                    }
                    break;
                case -522285947:
                    if (replaceAll.equals("typescript")) {
                        c3 = 7;
                        break;
                    }
                    break;
                case 114:
                    if (replaceAll.equals("r")) {
                        c3 = '\b';
                        break;
                    }
                    break;
                case 3184:
                    if (replaceAll.equals("cs")) {
                        c3 = '\t';
                        break;
                    }
                    break;
                case 3401:
                    if (replaceAll.equals("js")) {
                        c3 = '\n';
                        break;
                    }
                    break;
                case 3479:
                    if (replaceAll.equals("md")) {
                        c3 = 11;
                        break;
                    }
                    break;
                case 3593:
                    if (replaceAll.equals("py")) {
                        c3 = '\f';
                        break;
                    }
                    break;
                case 3632:
                    if (replaceAll.equals("rb")) {
                        c3 = '\r';
                        break;
                    }
                    break;
                case 3704:
                    if (replaceAll.equals("tl")) {
                        c3 = 14;
                        break;
                    }
                    break;
                case 3711:
                    if (replaceAll.equals("ts")) {
                        c3 = 15;
                        break;
                    }
                    break;
                case 96891:
                    if (replaceAll.equals("asm")) {
                        c3 = 16;
                        break;
                    }
                    break;
                case 98723:
                    if (replaceAll.equals("cpp")) {
                        c3 = 17;
                        break;
                    }
                    break;
                case 98819:
                    if (replaceAll.equals("css")) {
                        c3 = 18;
                        break;
                    }
                    break;
                case 98822:
                    if (replaceAll.equals("csv")) {
                        c3 = 19;
                        break;
                    }
                    break;
                case 104420:
                    if (replaceAll.equals("ini")) {
                        c3 = 20;
                        break;
                    }
                    break;
                case 105551:
                    if (replaceAll.equals("jsx")) {
                        c3 = 21;
                        break;
                    }
                    break;
                case 110968:
                    if (replaceAll.equals("php")) {
                        c3 = 22;
                        break;
                    }
                    break;
                case 112080:
                    if (replaceAll.equals("qml")) {
                        c3 = 23;
                        break;
                    }
                    break;
                case 114126:
                    if (replaceAll.equals("sql")) {
                        c3 = 24;
                        break;
                    }
                    break;
                case 114922:
                    if (replaceAll.equals("tlb")) {
                        c3 = 25;
                        break;
                    }
                    break;
                case 115161:
                    if (replaceAll.equals("tsx")) {
                        c3 = 26;
                        break;
                    }
                    break;
                case 118807:
                    if (replaceAll.equals("xml")) {
                        c3 = 27;
                        break;
                    }
                    break;
                case 119768:
                    if (replaceAll.equals("yml")) {
                        c3 = 28;
                        break;
                    }
                    break;
                case 3154628:
                    if (replaceAll.equals("func")) {
                        c3 = 29;
                        break;
                    }
                    break;
                case 3175934:
                    if (replaceAll.equals("glsl")) {
                        c3 = 30;
                        break;
                    }
                    break;
                case 3205725:
                    if (replaceAll.equals("hlsl")) {
                        c3 = 31;
                        break;
                    }
                    break;
                case 3213227:
                    if (replaceAll.equals("html")) {
                        c3 = ' ';
                        break;
                    }
                    break;
                case 3213448:
                    if (replaceAll.equals("http")) {
                        c3 = '!';
                        break;
                    }
                    break;
                case 3271912:
                    if (replaceAll.equals("json")) {
                        c3 = '\"';
                        break;
                    }
                    break;
                case 3318169:
                    if (replaceAll.equals("less")) {
                        c3 = '#';
                        break;
                    }
                    break;
                case 3373901:
                    if (replaceAll.equals("nasm")) {
                        c3 = '$';
                        break;
                    }
                    break;
                case 3404364:
                    if (replaceAll.equals("objc")) {
                        c3 = '%';
                        break;
                    }
                    break;
                case 3511770:
                    if (replaceAll.equals("ruby")) {
                        c3 = '&';
                        break;
                    }
                    break;
                case 3522862:
                    if (replaceAll.equals("sass")) {
                        c3 = '\'';
                        break;
                    }
                    break;
                case 3524784:
                    if (replaceAll.equals("scss")) {
                        c3 = '(';
                        break;
                    }
                    break;
                case 3561037:
                    if (replaceAll.equals("tl-b")) {
                        c3 = ')';
                        break;
                    }
                    break;
                case 3642020:
                    if (replaceAll.equals("wasm")) {
                        c3 = '*';
                        break;
                    }
                    break;
                case 3701415:
                    if (replaceAll.equals("yaml")) {
                        c3 = '+';
                        break;
                    }
                    break;
                case 94833107:
                    if (replaceAll.equals("cobol")) {
                        c3 = ',';
                        break;
                    }
                    break;
                case 101429325:
                    if (replaceAll.equals("json5")) {
                        c3 = '-';
                        break;
                    }
                    break;
                case 101429384:
                    if (replaceAll.equals("jsonp")) {
                        c3 = '.';
                        break;
                    }
                    break;
                case 112003953:
                    if (replaceAll.equals("vbnet")) {
                        c3 = '/';
                        break;
                    }
                    break;
                case 188995949:
                    if (replaceAll.equals("javascript")) {
                        c3 = '0';
                        break;
                    }
                    break;
                case 213985633:
                    if (replaceAll.equals("autohotkey")) {
                        c3 = '1';
                        break;
                    }
                    break;
                case 246938863:
                    if (replaceAll.equals("markdown")) {
                        c3 = '2';
                        break;
                    }
                    break;
                case 499384161:
                    if (replaceAll.equals("visual-basic")) {
                        c3 = '3';
                        break;
                    }
                    break;
                case 1064174568:
                    if (replaceAll.equals("gdscript")) {
                        c3 = '4';
                        break;
                    }
                    break;
                case 1067478602:
                    if (replaceAll.equals("objectivec")) {
                        c3 = '5';
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    return "ActionScript";
                case 1:
                    return "ASP.NET";
                case 2:
                    return "BBCode";
                case 3:
                case '\t':
                    return "C#";
                case 4:
                    return "F#";
                case 5:
                case '\b':
                case 14:
                case 16:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 26:
                case 27:
                case 28:
                case 30:
                case 31:
                case ' ':
                case '!':
                case '\"':
                case '#':
                case '$':
                case '\'':
                case '(':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                    return str.toUpperCase();
                case 6:
                case '\f':
                    return "Python";
                case 7:
                case 15:
                    return "TypeScript";
                case '\n':
                case '0':
                    return "JavaScript";
                case 11:
                case '2':
                    return "Markdown";
                case '\r':
                case '&':
                    return "Ruby";
                case 17:
                    return "C++";
                case 25:
                case ')':
                    return "TL-B";
                case 29:
                    return "FunC";
                case '%':
                case '5':
                    return "Objective-C";
                case '/':
                    return "VB.NET";
                case '1':
                    return "AutoHotKey";
                case '3':
                    return "Visual Basic";
                case '4':
                    return "GDScript";
                default:
                    return capitalizeFirst(str);
            }
        }

        public float collapsed(org.telegram.ui.Cells.r1 r1Var) {
            boolean collapsed;
            if (r1Var.f21767e3) {
                HashSet hashSet = r1Var.f21763d3;
                collapsed = true;
                if (hashSet != null && hashSet.contains(Integer.valueOf(this.index))) {
                    collapsed = false;
                }
            } else {
                collapsed = collapsed();
            }
            return AndroidUtilities.lerp(collapsed ? 1.0f : 0.0f, collapsed() ? 1.0f : 0.0f, r1Var.K1);
        }

        public void drawCopyCodeButton(Canvas canvas, RectF rectF, int i10, int i11, float f10) {
            if (!this.hasCodeCopyButton) {
                return;
            }
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, i10);
            if (this.copySelectorColor != l1) {
                Drawable drawable = this.copySelector;
                this.copySelectorColor = l1;
                org.telegram.ui.ActionBar.j6.B1(drawable, l1, true);
            }
            this.copySelector.setBounds(AndroidUtilities.dp(3.0f) + ((int) rectF.left), (int) (rectF.bottom - AndroidUtilities.dp(38.0f)), (int) rectF.right, (int) rectF.bottom);
            int i12 = (int) (255.0f * f10);
            this.copySelector.setAlpha(i12);
            if (this.copySelector.getCallback() != null) {
                this.copySelector.draw(canvas);
            }
            this.copySeparator.setColor(i0.a.k(i11, 38));
            canvas.drawRect(rectF.left + AndroidUtilities.dp(10.0f), (rectF.bottom - AndroidUtilities.dp(38.0f)) - AndroidUtilities.getShadowHeight(), rectF.right - AndroidUtilities.dp(6.66f), rectF.bottom - AndroidUtilities.dp(38.0f), this.copySeparator);
            float min = Math.min(rectF.width() - AndroidUtilities.dp(12.0f), (this.copyIcon.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f) + this.copyText.f26124c);
            float centerX = rectF.centerX() - (min / 2.0f);
            float dp = rectF.bottom - (AndroidUtilities.dp(38.0f) / 2.0f);
            if (this.copyIconColor != i10) {
                Drawable drawable2 = this.copyIcon;
                this.copyIconColor = i10;
                drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            this.copyIcon.setAlpha(i12);
            Drawable drawable3 = this.copyIcon;
            drawable3.setBounds((int) centerX, (int) (dp - ((drawable3.getIntrinsicHeight() * 0.8f) / 2.0f)), (int) ((this.copyIcon.getIntrinsicWidth() * 0.8f) + centerX), (int) android.support.v4.media.a.d(this.copyIcon.getIntrinsicHeight(), 0.8f, 2.0f, dp));
            this.copyIcon.draw(canvas);
            float intrinsicWidth = (this.copyIcon.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f) + centerX;
            k01 k01Var = this.copyText;
            k01Var.f26134p = AndroidUtilities.dp(12.0f) + ((int) (min - ((this.copyIcon.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f))));
            k01Var.c(intrinsicWidth, dp, f10, i10, canvas);
        }

        @Override
        public Layout getLayout() {
            return this.textLayout;
        }

        @Override
        public View getParentView() {
            return null;
        }

        public int height() {
            return (this.quoteCollapse && collapsed()) ? this.collapsedHeight : this.height;
        }

        public int heightCollapsed() {
            if (this.quoteCollapse) {
                return this.collapsedHeight;
            }
            return this.height;
        }

        public boolean isRtl() {
            byte b10 = this.directionFlags;
            if ((b10 & 1) != 0 && (b10 & 2) == 0) {
                return true;
            }
            return false;
        }

        public void layoutCode(String str, int i10, boolean z4) {
            boolean z10;
            if (i10 >= 75 && !z4) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.hasCodeCopyButton = z10;
            if (z10) {
                this.copyText = new k01(LocaleController.getString(R.string.CopyCode).toUpperCase(), SharedConfig.fontSize - 3, AndroidUtilities.bold());
                Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_copy).mutate();
                this.copyIcon = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(this.copyIconColor, PorterDuff.Mode.SRC_IN));
                this.copySelector = org.telegram.ui.ActionBar.j6.a0(this.copySelectorColor, 0, 0, Math.min(5, SharedConfig.bubbleRadius), 0);
                this.copySeparator = new Paint(1);
            }
            if (TextUtils.isEmpty(str)) {
                this.language = null;
                this.languageLayout = null;
                return;
            }
            this.language = str;
            k01 k01Var = new k01(capitalizeLanguage(str), (SharedConfig.fontSize - 1) - (CodeHighlighting.getTextSizeDecrement(i10) / 2), AndroidUtilities.bold());
            this.languageLayout = k01Var;
            this.languageHeight = AndroidUtilities.dp(4.0f) + ((int) (k01Var.f26122a.getTextSize() * 1.714f));
        }

        public float textYOffset(ArrayList<TextLayoutBlock> arrayList) {
            TextLayoutBlock textLayoutBlock;
            if (arrayList == null) {
                return 0.0f;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size() && (textLayoutBlock = arrayList.get(i11)) != this; i11++) {
                i10 += textLayoutBlock.height() + textLayoutBlock.padTop + textLayoutBlock.padBottom;
            }
            return i10;
        }

        public int height(org.telegram.ui.Cells.r1 r1Var) {
            if (!this.quoteCollapse) {
                return this.height;
            }
            return AndroidUtilities.lerp(this.height, this.collapsedHeight, collapsed(r1Var));
        }

        public boolean collapsed() {
            HashSet<Integer> hashSet;
            MessageObject messageObject = this.messageObject;
            return messageObject == null || (hashSet = messageObject.expandedQuotes) == null || !hashSet.contains(Integer.valueOf(this.index));
        }

        public float textYOffset(ArrayList<TextLayoutBlock> arrayList, org.telegram.ui.Cells.r1 r1Var) {
            TextLayoutBlock textLayoutBlock;
            if (arrayList == null) {
                return 0.0f;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size() && (textLayoutBlock = arrayList.get(i11)) != this; i11++) {
                i10 += textLayoutBlock.height(r1Var) + textLayoutBlock.padTop + textLayoutBlock.padBottom;
            }
            return i10;
        }
    }

    public static class VCardData {
        private String company;
        private ArrayList<String> emails = new ArrayList<>();
        private ArrayList<String> phones = new ArrayList<>();

        public static CharSequence parse(String str) {
            CharSequence charSequence;
            String[] strArr;
            byte[] decodeQuotedPrintable;
            try {
                BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
                int i10 = 0;
                boolean z4 = false;
                VCardData vCardData = null;
                String str2 = null;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!readLine.startsWith("PHOTO")) {
                        if (readLine.indexOf(58) >= 0) {
                            if (readLine.startsWith("BEGIN:VCARD")) {
                                vCardData = new VCardData();
                            } else if (readLine.startsWith("END:VCARD") && vCardData != null) {
                                z4 = true;
                            }
                        }
                        if (str2 != null) {
                            readLine = str2 + readLine;
                            str2 = null;
                        }
                        if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                            str2 = readLine.substring(i10, readLine.length() - 1);
                        } else {
                            int indexOf = readLine.indexOf(":");
                            if (indexOf >= 0) {
                                strArr = new String[]{readLine.substring(i10, indexOf), readLine.substring(indexOf + 1).trim()};
                            } else {
                                strArr = new String[]{readLine.trim()};
                            }
                            if (strArr.length >= 2 && vCardData != null) {
                                if (strArr[i10].startsWith("ORG")) {
                                    String[] split = strArr[i10].split(";");
                                    int length = split.length;
                                    int i11 = 0;
                                    String str3 = null;
                                    String str4 = null;
                                    while (i11 < length) {
                                        String[] split2 = split[i11].split("=");
                                        charSequence = null;
                                        try {
                                            if (split2.length == 2) {
                                                if (split2[i10].equals("CHARSET")) {
                                                    str4 = split2[1];
                                                } else if (split2[0].equals("ENCODING")) {
                                                    str3 = split2[1];
                                                }
                                            }
                                            i11++;
                                            i10 = 0;
                                        } catch (Throwable unused) {
                                            return charSequence;
                                        }
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
                            i10 = 0;
                        }
                    }
                    return charSequence;
                }
                charSequence = null;
                try {
                    bufferedReader.close();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (!z4) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                for (int i12 = 0; i12 < vCardData.phones.size(); i12++) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    String str6 = vCardData.phones.get(i12);
                    if (!str6.contains("#") && !str6.contains("*")) {
                        sb.append(se.b.c().b(str6));
                    }
                    sb.append(str6);
                }
                for (int i13 = 0; i13 < vCardData.emails.size(); i13++) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(se.b.c().b(vCardData.emails.get(i13)));
                }
                if (!TextUtils.isEmpty(vCardData.company)) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(vCardData.company);
                }
                return sb;
            } catch (Throwable unused2) {
                return null;
            }
        }
    }

    public MessageObject(int i10, TL_stories.StoryItem storyItem) {
        this.type = 1000;
        this.forceSeekTo = -1.0f;
        this.actionDeleteGroupEventId = -1L;
        this.overrideLinkColor = -1;
        this.overrideLinkEmoji = -1L;
        this.messageTrimmedToHighlightCut = true;
        this.topicIconDrawable = new Drawable[1];
        this.spoiledLoginCode = false;
        this.translated = false;
        this.summarized = false;
        this.currentAccount = i10;
        this.storyItem = storyItem;
        if (storyItem != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            this.messageOwner = tL_message;
            tL_message.f19180id = storyItem.messageId;
            tL_message.realId = storyItem.f19394id;
            tL_message.date = storyItem.date;
            tL_message.dialog_id = storyItem.dialogId;
            tL_message.message = storyItem.caption;
            tL_message.entities = storyItem.entities;
            tL_message.media = storyItem.media;
            tL_message.attachPath = storyItem.attachPath;
        }
        this.photoThumbs = new ArrayList<>();
        this.photoThumbs2 = new ArrayList<>();
    }

    private boolean addEntitiesToText(CharSequence charSequence, boolean z4) {
        return addEntitiesToText(charSequence, false, z4);
    }

    public static void addLinks(boolean z4, CharSequence charSequence) {
        addLinks(z4, charSequence, true, false);
    }

    public static void addUrlsByPattern(boolean r18, java.lang.CharSequence r19, boolean r20, int r21, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.addUrlsByPattern(boolean, java.lang.CharSequence, boolean, int, int, boolean):void");
    }

    private boolean allowsBigEmoji() {
        TLRPC.Peer peer;
        if (!SharedConfig.allowBigEmoji) {
            return false;
        }
        TLRPC.Message message = this.messageOwner;
        if (message != null && (peer = message.peer_id) != null && (peer.channel_id != 0 || peer.chat_id != 0)) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            TLRPC.Peer peer2 = this.messageOwner.peer_id;
            long j10 = peer2.channel_id;
            if (j10 == 0) {
                j10 = peer2.chat_id;
            }
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if ((chat == null || !chat.gigagroup) && ChatObject.isActionBanned(chat, 8) && !ChatObject.hasAdminRights(chat)) {
                return false;
            }
        }
        return true;
    }

    private boolean applyEntities() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.applyEntities():boolean");
    }

    public static boolean canAutoplayAnimatedSticker(TLRPC.Document document) {
        if ((isAnimatedStickerDocument(document, true) || isVideoStickerDocument(document)) && LiteMode.isEnabled(1)) {
            return true;
        }
        return false;
    }

    public static boolean canCreateStripedThubms() {
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            return true;
        }
        return false;
    }

    public static boolean canShowVotersList(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            if (poll.public_voters) {
                if (!poll.closed && !poll.creator) {
                    if (isVoted(tL_messageMediaPoll) && !tL_messageMediaPoll.poll.hide_results_until_close) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static CharSequence channelSpan() {
        if (channelSpan == null) {
            channelSpan = new SpannableStringBuilder("c");
            lq lqVar = new lq(R.drawable.msg_folders_channels, 0);
            lqVar.setScale(0.7f, 0.7f);
            ((SpannableStringBuilder) channelSpan).setSpan(lqVar, 0, 1, 33);
        }
        return channelSpan;
    }

    private void checkEmojiOnly(int[] iArr) {
        checkEmojiOnly(iArr == null ? null : Integer.valueOf(iArr[0]));
    }

    public static SpannableStringBuilder checkboxSpan(boolean z4) {
        String str;
        int i10;
        if (z4) {
            str = "✅";
        } else {
            str = "☑️";
        }
        if (z4) {
            i10 = R.drawable.iv_checkbox_on;
        } else {
            i10 = R.drawable.iv_checkbox_off;
        }
        return span(str, i10);
    }

    public static boolean containsUrls(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() >= 2 && charSequence.length() <= 20480) {
            int length = charSequence.length();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            char c3 = 0;
            while (i10 < length) {
                char charAt = charSequence.charAt(i10);
                if (charAt >= '0' && charAt <= '9') {
                    i11++;
                    if (i11 >= 6) {
                        return true;
                    }
                    i12 = 0;
                    i13 = 0;
                } else if (charAt == ' ' || i11 <= 0) {
                    i11 = 0;
                }
                if ((charAt != '@' && charAt != '#' && charAt != '/' && charAt != '$') || i10 != 0) {
                    if (i10 != 0) {
                        int i14 = i10 - 1;
                        if (charSequence.charAt(i14) != ' ') {
                            if (charSequence.charAt(i14) == '\n') {
                            }
                        }
                    }
                    if (charAt == ':') {
                        if (i12 == 0) {
                            i12 = 1;
                        }
                        i12 = 0;
                    } else if (charAt == '/') {
                        if (i12 == 2) {
                            return true;
                        }
                        if (i12 == 1) {
                            i12++;
                        }
                        i12 = 0;
                    } else {
                        if (charAt == '.') {
                            if (i13 == 0 && c3 != ' ') {
                                i13++;
                            }
                        } else if (charAt != ' ' && c3 == '.' && i13 == 1) {
                            return true;
                        }
                        i13 = 0;
                    }
                    i10++;
                    c3 = charAt;
                }
                return true;
            }
        }
        return false;
    }

    private void createDateArray(int i10, TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent, ArrayList<MessageObject> arrayList, HashMap<String, ArrayList<MessageObject>> hashMap, boolean z4) {
        if (hashMap.get(this.dateKey) == null) {
            hashMap.put(this.dateKey, new ArrayList<>());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.formatDateChat(tL_channelAdminLogEvent.date);
            tL_message.f19180id = 0;
            tL_message.date = tL_channelAdminLogEvent.date;
            MessageObject messageObject = new MessageObject(i10, tL_message, false, false);
            messageObject.type = 10;
            messageObject.contentType = 1;
            messageObject.isDateObject = true;
            if (z4) {
                arrayList.add(0, messageObject);
            } else {
                arrayList.add(messageObject);
            }
        }
    }

    private void createPathThumb() {
        TLRPC.Document document = getDocument();
        if (document == null) {
            return;
        }
        this.pathThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.f20030lc, 1.0f);
    }

    public static void cutIntoRanges(CharSequence charSequence, ArrayList<TextRange> arrayList) {
        boolean z4;
        boolean z10;
        String str;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (charSequence != null) {
            if (!(charSequence instanceof Spanned)) {
                arrayList.add(new TextRange(0, charSequence.length()));
                return;
            }
            TreeSet treeSet = new TreeSet();
            HashMap hashMap = new HashMap();
            Spanned spanned = (Spanned) charSequence;
            zi0[] zi0VarArr = (zi0[]) spanned.getSpans(0, spanned.length(), zi0.class);
            int i15 = 0;
            while (true) {
                int i16 = 1;
                if (i15 >= zi0VarArr.length) {
                    break;
                }
                zi0 zi0Var = zi0VarArr[i15];
                zi0Var.f31391a.f23384b = false;
                int spanStart = spanned.getSpanStart(zi0Var);
                int spanEnd = spanned.getSpanEnd(zi0VarArr[i15]);
                treeSet.add(Integer.valueOf(spanStart));
                Integer valueOf = Integer.valueOf(spanStart);
                if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                    i13 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
                } else {
                    i13 = 0;
                }
                if (zi0VarArr[i15].f31391a.e) {
                    i16 = 16;
                }
                hashMap.put(valueOf, Integer.valueOf(i13 | i16));
                treeSet.add(Integer.valueOf(spanEnd));
                Integer valueOf2 = Integer.valueOf(spanEnd);
                if (hashMap.containsKey(Integer.valueOf(spanEnd))) {
                    i14 = ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue();
                } else {
                    i14 = 0;
                }
                hashMap.put(valueOf2, Integer.valueOf(i14 | 2));
                i15++;
            }
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (intValue >= 0 && intValue < spanned.length() && hashMap.containsKey(num)) {
                    int intValue2 = ((Integer) hashMap.get(num)).intValue();
                    if ((intValue2 & 17) != 0 && (intValue2 & 2) != 0 && spanned.charAt(intValue) != '\n' && (intValue - 1 <= 0 || spanned.charAt(i12) != '\n')) {
                        it.remove();
                        hashMap.remove(num);
                    }
                }
            }
            CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(0, spanned.length(), CodeHighlighting.Span.class);
            for (int i17 = 0; i17 < spanArr.length; i17++) {
                int spanStart2 = spanned.getSpanStart(spanArr[i17]);
                int spanEnd2 = spanned.getSpanEnd(spanArr[i17]);
                treeSet.add(Integer.valueOf(spanStart2));
                Integer valueOf3 = Integer.valueOf(spanStart2);
                if (hashMap.containsKey(Integer.valueOf(spanStart2))) {
                    i10 = ((Integer) hashMap.get(Integer.valueOf(spanStart2))).intValue();
                } else {
                    i10 = 0;
                }
                hashMap.put(valueOf3, Integer.valueOf(i10 | 4));
                treeSet.add(Integer.valueOf(spanEnd2));
                Integer valueOf4 = Integer.valueOf(spanEnd2);
                if (hashMap.containsKey(Integer.valueOf(spanEnd2))) {
                    i11 = ((Integer) hashMap.get(Integer.valueOf(spanEnd2))).intValue();
                } else {
                    i11 = 0;
                }
                hashMap.put(valueOf4, Integer.valueOf(i11 | 8));
            }
            Iterator it2 = treeSet.iterator();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            boolean z13 = false;
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                int intValue3 = num2.intValue();
                int intValue4 = ((Integer) hashMap.get(num2)).intValue();
                if (i21 != intValue3) {
                    int i22 = intValue3 - 1;
                    if (i22 >= 0 && i22 < charSequence.length() && charSequence.charAt(i22) == '\n') {
                        intValue3--;
                    }
                    int i23 = intValue3;
                    if ((intValue4 & 8) != 0 && i20 < spanArr.length) {
                        str = spanArr[i20].lng;
                        i20++;
                    } else {
                        str = null;
                    }
                    int i24 = i20;
                    String str2 = str;
                    if (i18 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i19 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    arrayList.add(new TextRange(i21, i23, z11, z12, z13, str2));
                    i21 = i23 + 1;
                    if (i21 >= charSequence.length() || charSequence.charAt(i23) != '\n') {
                        i21 = i23;
                    }
                    i20 = i24;
                }
                if ((intValue4 & 2) != 0) {
                    i18--;
                }
                if ((intValue4 & 1) != 0 || (intValue4 & 16) != 0) {
                    i18++;
                    if ((intValue4 & 16) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                if ((intValue4 & 8) != 0) {
                    i19--;
                }
                if ((intValue4 & 4) != 0) {
                    i19++;
                }
            }
            if (i21 < charSequence.length()) {
                int length = charSequence.length();
                if (i18 > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i19 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new TextRange(i21, length, z4, z10, z13, null));
            }
        }
    }

    public static int ephemeralMessageIdPack(int i10) {
        return (i10 & (-1879048193)) | 1610612736;
    }

    public static int ephemeralMessageIdUnpack(int i10) {
        if (isEphemeralMessageId(i10)) {
            return i10 & (-1879048193);
        }
        return i10;
    }

    public static boolean expandedQuotesEquals(HashSet<Integer> hashSet, HashSet<Integer> hashSet2) {
        int size;
        int size2;
        if (hashSet == null && hashSet2 == null) {
            return true;
        }
        if (hashSet == null) {
            size = 0;
        } else {
            size = hashSet.size();
        }
        if (hashSet2 == null) {
            size2 = 0;
        } else {
            size2 = hashSet2.size();
        }
        if (size == size2 && hashSet != null && hashSet.equals(hashSet2)) {
            return true;
        }
        return false;
    }

    public static String findAnimatedEmojiEmoticon(TLRPC.Document document) {
        return findAnimatedEmojiEmoticon(document, "😀");
    }

    public static TLRPC.Document findAudio(TL_iv.RichMessage richMessage) {
        if (richMessage == null) {
            return null;
        }
        return findAudio(richMessage.blocks, richMessage);
    }

    public static TLRPC.Photo findPhoto(TL_iv.RichMessage richMessage) {
        if (richMessage == null) {
            return null;
        }
        return findPhoto(richMessage.blocks, richMessage);
    }

    public static TLRPC.PollAnswer findPollItem(MessageObject messageObject, byte[] bArr) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        TLRPC.MessageMedia media = getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaPoll) && (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media).poll) != null && poll.answers != null) {
            for (int i10 = 0; i10 < tL_messageMediaPoll.poll.answers.size(); i10++) {
                TLRPC.PollAnswer pollAnswer = tL_messageMediaPoll.poll.answers.get(i10);
                if (Arrays.equals(pollAnswer.option, bArr)) {
                    return pollAnswer;
                }
            }
        }
        return null;
    }

    public static int findQuoteStart(String str, String str2, int i10) {
        if (str == null || str2 == null) {
            return -1;
        }
        if (i10 == -1) {
            return str.indexOf(str2);
        }
        if (str2.length() + i10 < str.length() && str.startsWith(str2, i10)) {
            return i10;
        }
        int indexOf = str.indexOf(str2, i10);
        int lastIndexOf = str.lastIndexOf(str2, i10);
        if (indexOf != -1 && (lastIndexOf == -1 || indexOf - i10 < i10 - lastIndexOf)) {
            return indexOf;
        }
        return lastIndexOf;
    }

    public static ArrayList<String> findStickerEmoticons(TLRPC.Document document, Integer num) {
        if (document == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                if (num != null) {
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(num.intValue()).getStickerSet(documentAttribute.stickerset, true);
                    if (stickerSet != null && stickerSet.packs != null) {
                        for (int i11 = 0; i11 < stickerSet.packs.size(); i11++) {
                            TLRPC.TL_stickerPack tL_stickerPack = stickerSet.packs.get(i11);
                            if (tL_stickerPack.documents.contains(Long.valueOf(document.f19165id)) && Emoji.getEmojiDrawable(tL_stickerPack.emoticon) != null) {
                                arrayList.add(tL_stickerPack.emoticon);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                }
                if (!TextUtils.isEmpty(documentAttribute.alt) && Emoji.getEmojiDrawable(documentAttribute.alt) != null) {
                    arrayList.add(documentAttribute.alt);
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static TLRPC.TodoItem findTodoItem(MessageObject messageObject, int i10) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia media = getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaToDo) && (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) media).todo) != null && todoList.list != null) {
            for (int i11 = 0; i11 < tL_messageMediaToDo.todo.list.size(); i11++) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i11);
                if (todoItem.f19304id == i10) {
                    return todoItem;
                }
            }
        }
        return null;
    }

    public static TLRPC.Document findVideo(TL_iv.RichMessage richMessage) {
        if (richMessage == null) {
            return null;
        }
        return findVideo(richMessage.blocks, richMessage);
    }

    public static void fixMessagePeer(ArrayList<TLRPC.Message> arrayList, long j10) {
        if (arrayList != null && !arrayList.isEmpty() && j10 != 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.Message message = arrayList.get(i10);
                if (message instanceof TLRPC.TL_messageEmpty) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    message.peer_id = tL_peerChannel;
                    tL_peerChannel.channel_id = j10;
                }
            }
        }
    }

    public static CharSequence formatRichBlock(TL_iv.PageBlock pageBlock, boolean z4, boolean z10, int i10, SpannableStringBuilder spannableStringBuilder, TL_iv.RichMessage richMessage) {
        TLRPC.Document document;
        int i11;
        if (!(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockKicker)) {
                int i12 = 0;
                if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                    TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                    while (i12 < pageblockblockquoteblocks.blocks.size()) {
                        if (i12 > 0) {
                            spannableStringBuilder.append("  ");
                        }
                        formatRichBlock(pageblockblockquoteblocks.blocks.get(i12), z4, z10, i10, spannableStringBuilder, richMessage);
                        if (spannableStringBuilder.length() >= i10) {
                            spannableStringBuilder.delete(i10, spannableStringBuilder.length());
                            spannableStringBuilder.append("…");
                            return spannableStringBuilder;
                        }
                        i12++;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    formatRichText(((TL_iv.pageBlockDetails) pageBlock).title, z4, z10, i10, spannableStringBuilder, 0);
                    return spannableStringBuilder;
                } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                    formatRichText(((TL_iv.pageBlockAuthorDate) pageBlock).author, z4, z10, i10, spannableStringBuilder, 0);
                    return spannableStringBuilder;
                } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                    spannableStringBuilder.append((CharSequence) span("fx", R.drawable.iv_formula)).append(" ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVFormula));
                    return spannableStringBuilder;
                } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Map));
                    TL_iv.PageCaption pageCaption = pageBlock.caption;
                    if (pageCaption != null && !(pageCaption.text instanceof TL_iv.textEmpty)) {
                        spannableStringBuilder.append("  ");
                        formatRichText(pageBlock.caption.text, z4, z10, i10, spannableStringBuilder, 0);
                        return spannableStringBuilder;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                    formatRichText(pageBlock.text, z4, z10, i10, spannableStringBuilder, 4);
                    return spannableStringBuilder;
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    if (pageBlock instanceof TL_iv.pageBlockList) {
                        TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                        for (int i13 = 0; i13 < pageblocklist.items.size(); i13++) {
                            if (i13 > 0) {
                                spannableStringBuilder2.append("  ");
                            }
                            TL_iv.PageListItem pageListItem = pageblocklist.items.get(i13);
                            if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                if (tL_pageListItemText.checkbox) {
                                    spannableStringBuilder2.append((CharSequence) checkboxSpan(tL_pageListItemText.checked)).append(" ");
                                } else {
                                    spannableStringBuilder2.append("• ");
                                }
                                i11 = i10;
                                formatRichText(tL_pageListItemText.text, z4, z10, i11, spannableStringBuilder2, 0);
                            } else {
                                if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                                    if (tL_pageListItemBlocks.checkbox) {
                                        spannableStringBuilder2.append((CharSequence) checkboxSpan(tL_pageListItemBlocks.checked)).append(" ");
                                    } else {
                                        spannableStringBuilder2.append("• ");
                                    }
                                    for (int i14 = 0; i14 < tL_pageListItemBlocks.blocks.size(); i14++) {
                                        if (i14 > 0) {
                                            spannableStringBuilder2.append("  ");
                                        }
                                        formatRichBlock(tL_pageListItemBlocks.blocks.get(i14), z4, z10, i10, spannableStringBuilder2, richMessage);
                                        if (spannableStringBuilder2.length() >= i10) {
                                            spannableStringBuilder2.delete(i10, spannableStringBuilder2.length());
                                            spannableStringBuilder2.append("…");
                                            return spannableStringBuilder2;
                                        }
                                    }
                                }
                                i11 = i10;
                            }
                            if (spannableStringBuilder2.length() >= i11) {
                                spannableStringBuilder2.delete(i11, spannableStringBuilder2.length());
                                spannableStringBuilder2.append("…");
                                return spannableStringBuilder2;
                            }
                        }
                    } else {
                        int i15 = i10;
                        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                            for (int i16 = 0; i16 < pageblockorderedlist.items.size(); i16++) {
                                if (i16 > 0) {
                                    spannableStringBuilder2.append("  ");
                                }
                                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i16);
                                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                                    spannableStringBuilder2.append((CharSequence) tL_pageListOrderedItemText.num);
                                    spannableStringBuilder2.append(". ");
                                    if (tL_pageListOrderedItemText.checkbox) {
                                        spannableStringBuilder2.append((CharSequence) checkboxSpan(tL_pageListOrderedItemText.checked)).append(" ");
                                    }
                                    formatRichText(tL_pageListOrderedItemText.text, z4, z10, i15, spannableStringBuilder2, 0);
                                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                                    spannableStringBuilder2.append((CharSequence) tL_pageListOrderedItemBlocks.num);
                                    spannableStringBuilder2.append(". ");
                                    if (tL_pageListOrderedItemBlocks.checkbox) {
                                        spannableStringBuilder2.append((CharSequence) checkboxSpan(tL_pageListOrderedItemBlocks.checked)).append(" ");
                                    }
                                    for (int i17 = 0; i17 < tL_pageListOrderedItemBlocks.blocks.size(); i17++) {
                                        if (i17 > 0) {
                                            spannableStringBuilder2.append("  ");
                                        }
                                        formatRichBlock(tL_pageListOrderedItemBlocks.blocks.get(i17), z4, z10, i10, spannableStringBuilder2, richMessage);
                                        if (spannableStringBuilder2.length() >= i10) {
                                            spannableStringBuilder2.delete(i10, spannableStringBuilder2.length());
                                            spannableStringBuilder2.append("…");
                                            return spannableStringBuilder2;
                                        }
                                    }
                                }
                                i15 = i10;
                                if (spannableStringBuilder2.length() >= i15) {
                                    spannableStringBuilder2.delete(i15, spannableStringBuilder2.length());
                                    spannableStringBuilder2.append("…");
                                    return spannableStringBuilder2;
                                }
                            }
                        } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                            spannableStringBuilder2.append((CharSequence) span("⊞", R.drawable.iv_preview_table)).append(" ");
                            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                                formatRichText(richText, z4, z10, i15, spannableStringBuilder2, 0);
                                return spannableStringBuilder2;
                            }
                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.AccDescrIVTable));
                            return spannableStringBuilder2;
                        } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                            TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                            while (true) {
                                if (i12 < richMessage.documents.size()) {
                                    if (richMessage.documents.get(i12).f19165id == pageblockaudio.audio_id) {
                                        document = richMessage.documents.get(i12);
                                        break;
                                    }
                                    i12++;
                                } else {
                                    document = null;
                                    break;
                                }
                            }
                            if (document != null) {
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeFilename.class);
                                if (tL_documentAttributeAudio != null) {
                                    if (!TextUtils.isEmpty(tL_documentAttributeAudio.title) && !TextUtils.isEmpty(tL_documentAttributeAudio.performer)) {
                                        spannableStringBuilder2.append((CharSequence) span("🎵", R.drawable.iv_audio_preview)).append(" ").append((CharSequence) tL_documentAttributeAudio.performer).append(" – ").append((CharSequence) tL_documentAttributeAudio.title);
                                        return spannableStringBuilder2;
                                    } else if (!TextUtils.isEmpty(tL_documentAttributeAudio.title)) {
                                        spannableStringBuilder2.append((CharSequence) span("🎵", R.drawable.iv_audio_preview)).append(" ").append((CharSequence) tL_documentAttributeAudio.title);
                                        return spannableStringBuilder2;
                                    } else if (tL_documentAttributeFilename != null && tL_documentAttributeFilename.file_name != null) {
                                        spannableStringBuilder2.append((CharSequence) span("🎵", R.drawable.iv_audio_preview)).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                                        return spannableStringBuilder2;
                                    }
                                } else if (tL_documentAttributeFilename != null && tL_documentAttributeFilename.file_name != null) {
                                    spannableStringBuilder2.append((CharSequence) span("🎵", R.drawable.iv_audio_preview)).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                                    return spannableStringBuilder2;
                                }
                            }
                        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                            TLRPC.Document findDocument = AndroidUtilities.findDocument(richMessage.documents, ((TL_iv.pageBlockDocument) pageBlock).document_id);
                            if (findDocument != null) {
                                String documentFileName = FileLoader.getDocumentFileName(findDocument);
                                SpannableStringBuilder append = spannableStringBuilder2.append((CharSequence) span("📎", R.drawable.msg_filled_data_files)).append(" ");
                                if (TextUtils.isEmpty(documentFileName)) {
                                    documentFileName = LocaleController.getString(R.string.AttachDocument);
                                }
                                append.append((CharSequence) documentFileName);
                                return spannableStringBuilder2;
                            }
                        } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                            formatRichBlock(((TL_iv.pageBlockCover) pageBlock).cover, z4, z10, i10, spannableStringBuilder2, richMessage);
                            return spannableStringBuilder2;
                        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.AttachPhoto));
                            return spannableStringBuilder2;
                        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.AttachVideo));
                            return spannableStringBuilder2;
                        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.AccDescrCollage));
                            return spannableStringBuilder2;
                        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.AccDescrIVSlideshow));
                            return spannableStringBuilder2;
                        } else if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.UnsupportedAttachment));
                            return spannableStringBuilder2;
                        } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                            TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                            while (i12 < pageblockbuttonrow.buttons.size()) {
                                if (i12 > 0) {
                                    spannableStringBuilder2.append("  ");
                                }
                                formatRichText(pageblockbuttonrow.buttons.get(i12).text, z4, z10, i10, spannableStringBuilder2, 0);
                                i12++;
                                spannableStringBuilder2 = spannableStringBuilder;
                            }
                        }
                    }
                }
                return spannableStringBuilder;
            }
            formatRichText(pageBlock.text, z4, z10, i10, spannableStringBuilder, 0);
            return spannableStringBuilder;
        }
        formatRichText(pageBlock.text, z4, z10, i10, spannableStringBuilder, 1);
        return spannableStringBuilder;
    }

    public static CharSequence formatRichMessage(TL_iv.RichMessage richMessage, boolean z4) {
        return formatRichMessage(richMessage, z4, false, 1024);
    }

    public static java.lang.CharSequence formatRichText(org.telegram.tgnet.tl.TL_iv.RichText r10, boolean r11, boolean r12, int r13, android.text.SpannableStringBuilder r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.formatRichText(org.telegram.tgnet.tl.TL_iv$RichText, boolean, boolean, int, android.text.SpannableStringBuilder, int):java.lang.CharSequence");
    }

    private CharSequence formatTaskTitle(TLRPC.TodoItem todoItem) {
        CharSequence formatTextWithEntities = formatTextWithEntities(todoItem.title, isOutOwner());
        if (!(formatTextWithEntities instanceof Spannable)) {
            formatTextWithEntities = new SpannableStringBuilder(formatTextWithEntities);
        }
        ((Spannable) formatTextWithEntities).setSpan(new m51("task?" + todoItem.f19304id, 0), 0, formatTextWithEntities.length(), 33);
        return formatTextWithEntities;
    }

    public static CharSequence formatTextWithEntities(TLRPC.TL_textWithEntities tL_textWithEntities) {
        return formatTextWithEntities(tL_textWithEntities, false);
    }

    private java.lang.CharSequence getActionSuggestionApprovalText(java.lang.String r18, java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.getActionSuggestionApprovalText(java.lang.String, java.lang.String):java.lang.CharSequence");
    }

    private TLRPC.Chat getChat(AbstractMap<Long, TLRPC.Chat> abstractMap, a0.h hVar, long j10) {
        TLRPC.Chat chat;
        if (abstractMap != null) {
            chat = abstractMap.get(Long.valueOf(j10));
        } else if (hVar != null) {
            chat = (TLRPC.Chat) hVar.f(j10);
        } else {
            chat = null;
        }
        if (chat == null) {
            return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        }
        return chat;
    }

    public static int getCompletionsCount(TLRPC.TL_messageMediaToDo tL_messageMediaToDo) {
        TLRPC.TodoList todoList;
        if (tL_messageMediaToDo == null || (todoList = tL_messageMediaToDo.todo) == null || todoList.list == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < tL_messageMediaToDo.completions.size(); i11++) {
            TLRPC.TodoCompletion todoCompletion = tL_messageMediaToDo.completions.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= tL_messageMediaToDo.todo.list.size()) {
                    break;
                } else if (tL_messageMediaToDo.todo.list.get(i12).f19304id == todoCompletion.f19303id) {
                    i10++;
                    break;
                } else {
                    i12++;
                }
            }
        }
        return i10;
    }

    public static double getDocumentDuration(TLRPC.Document document) {
        if (document == null) {
            return 0.0d;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static TLRPC.VideoSize getDocumentVideoThumb(TLRPC.Document document) {
        if (document != null && !document.video_thumbs.isEmpty()) {
            return document.video_thumbs.get(0);
        }
        return null;
    }

    private TLRPC.Document getDocumentWithId(TLRPC.WebPage webPage, long j10) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Document document = webPage.document;
            if (document != null && document.f19165id == j10) {
                return document;
            }
            for (int i10 = 0; i10 < webPage.cached_page.documents.size(); i10++) {
                TLRPC.Document document2 = webPage.cached_page.documents.get(i10);
                if (document2.f19165id == j10) {
                    return document2;
                }
            }
        }
        return null;
    }

    public static String getEmoji(TLRPC.Document document) {
        if (document == null) {
            return "😀";
        }
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeCustomEmoji.class);
        if (tL_documentAttributeCustomEmoji != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt)) {
            return tL_documentAttributeCustomEmoji.alt;
        }
        TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = (TLRPC.TL_documentAttributeSticker) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeSticker.class);
        if (tL_documentAttributeSticker == null || TextUtils.isEmpty(tL_documentAttributeSticker.alt)) {
            return "😀";
        }
        return tL_documentAttributeSticker.alt;
    }

    private static int getForumFlags(TLRPC.Chat chat, TLRPC.User user) {
        return k7.w8.b(k7.w8.b(k7.w8.b(0, 1, ChatObject.isForum(chat)), 4, ChatObject.isMonoForum(chat)), 8, UserObject.isBotForum(user));
    }

    public static long getFromChatId(TLRPC.Message message) {
        return getPeerId(message.from_id);
    }

    public static int getInlineResultDuration(TLRPC.BotInlineResult botInlineResult) {
        int webDocumentDuration = (int) getWebDocumentDuration(botInlineResult.content);
        if (webDocumentDuration == 0) {
            return (int) getWebDocumentDuration(botInlineResult.thumb);
        }
        return webDocumentDuration;
    }

    public static int[] getInlineResultWidthAndHeight(TLRPC.BotInlineResult botInlineResult) {
        int[] webDocumentWidthAndHeight = getWebDocumentWidthAndHeight(botInlineResult.content);
        if (webDocumentWidthAndHeight == null) {
            int[] webDocumentWidthAndHeight2 = getWebDocumentWidthAndHeight(botInlineResult.thumb);
            return webDocumentWidthAndHeight2 == null ? new int[]{0, 0} : webDocumentWidthAndHeight2;
        }
        return webDocumentWidthAndHeight;
    }

    public static TLRPC.InputStickerSet getInputStickerSet(TLRPC.Message message) {
        TLRPC.Document document = getDocument(message);
        if (document != null) {
            return getInputStickerSet(document);
        }
        return null;
    }

    public static TLRPC.MessageMedia getMedia(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return null;
        }
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        return messageMedia != null ? messageMedia : getMedia(message);
    }

    public static long getMediaSize(TLRPC.MessageMedia messageMedia) {
        TLRPC.Document document;
        TLRPC.WebPage webPage;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null) {
            document = webPage.document;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            document = messageMedia.game.document;
        } else if (messageMedia != null) {
            document = messageMedia.document;
        } else {
            document = null;
        }
        if (document != null) {
            return document.size;
        }
        return 0L;
    }

    private MessageObject getMessageObjectForBlock(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
        TLRPC.TL_message tL_message;
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TLRPC.Photo photoWithId = getPhotoWithId(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            if (photoWithId != webPage.photo) {
                tL_message = new TLRPC.TL_message();
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                tL_message.media = tL_messageMediaPhoto;
                tL_messageMediaPhoto.photo = photoWithId;
                tL_message.message = "";
                tL_message.realId = getId();
                tL_message.f19180id = Utilities.random.nextInt();
                TLRPC.Message message = this.messageOwner;
                tL_message.date = message.date;
                tL_message.peer_id = message.peer_id;
                tL_message.out = message.out;
                tL_message.from_id = message.from_id;
                return new MessageObject(this.currentAccount, tL_message, false, true);
            }
            return this;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            if (getDocumentWithId(webPage, pageblockvideo.video_id) != webPage.document) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message2.media = tL_messageMediaDocument;
                tL_messageMediaDocument.document = getDocumentWithId(webPage, pageblockvideo.video_id);
                tL_message = tL_message2;
            }
            return this;
        }
        tL_message = null;
        tL_message.message = "";
        tL_message.realId = getId();
        tL_message.f19180id = Utilities.random.nextInt();
        TLRPC.Message message2 = this.messageOwner;
        tL_message.date = message2.date;
        tL_message.peer_id = message2.peer_id;
        tL_message.out = message2.out;
        tL_message.from_id = message2.from_id;
        return new MessageObject(this.currentAccount, tL_message, false, true);
    }

    public static long getMessageSize(TLRPC.Message message) {
        return getMediaSize(getMedia(message));
    }

    public static long getObjectPeerId(TLObject tLObject) {
        if (tLObject == null) {
            return 0L;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return -((TLRPC.Chat) tLObject).f19159id;
        }
        if (!(tLObject instanceof TLRPC.User)) {
            return 0L;
        }
        return ((TLRPC.User) tLObject).f19306id;
    }

    private int getParentWidth() {
        int i10;
        if (this.preview && (i10 = this.parentWidth) > 0) {
            return i10;
        }
        if (AndroidUtilities.isTablet()) {
            return AndroidUtilities.getMinTabletSide();
        }
        Point point = AndroidUtilities.displaySize;
        int i11 = point.x;
        if (i11 > point.y) {
            return i11 - AndroidUtilities.dp(50.0f);
        }
        return i11;
    }

    public static long getPeerId(TLRPC.Peer peer) {
        long j10;
        if (peer == null) {
            return 0L;
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            j10 = peer.chat_id;
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            j10 = peer.channel_id;
        } else {
            return peer.user_id;
        }
        return -j10;
    }

    public static String getPeerObjectName(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return UserObject.getUserName((TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).title;
        }
        return "DELETED";
    }

    private TLRPC.Photo getPhotoWithId(TLRPC.WebPage webPage, long j10) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Photo photo = webPage.photo;
            if (photo != null && photo.f19183id == j10) {
                return photo;
            }
            for (int i10 = 0; i10 < webPage.cached_page.photos.size(); i10++) {
                TLRPC.Photo photo2 = webPage.cached_page.photos.get(i10);
                if (photo2.f19183id == j10) {
                    return photo2;
                }
            }
        }
        return null;
    }

    public static TLRPC.PollAnswerVoters getPollResult(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, byte[] bArr) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i10);
                if (Arrays.equals(pollAnswerVoters.option, bArr)) {
                    return pollAnswerVoters;
                }
            }
        }
        return null;
    }

    public static int getQuickReplyId(TLRPC.Message message) {
        if (message == null) {
            return 0;
        }
        if ((message.flags & 1073741824) != 0) {
            return message.quick_reply_shortcut_id;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcutId) {
            return ((TLRPC.TL_inputQuickReplyShortcutId) inputQuickReplyShortcut).shortcut_id;
        }
        return 0;
    }

    public static String getQuickReplyName(TLRPC.Message message) {
        if (message == null) {
            return null;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
            return ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
        }
        return null;
    }

    public static long getReplyToDialogId(TLRPC.Message message) {
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if (messageReplyHeader == null) {
            return 0L;
        }
        TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
        if (peer != null) {
            return getPeerId(peer);
        }
        return getDialogId(message);
    }

    public static TLRPC.Peer getSavedDialogPeer(long j10, TLRPC.Message message) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        TLRPC.Peer peer3 = message.saved_peer_id;
        if (peer3 != null) {
            return peer3;
        }
        TLRPC.Peer peer4 = message.peer_id;
        if (peer4 != null && peer4.user_id == j10 && (peer = message.from_id) != null && peer.user_id == j10) {
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader != null && (peer2 = messageFwdHeader.saved_from_peer) != null) {
                return peer2;
            }
            if (messageFwdHeader != null && messageFwdHeader.from_id != null) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_peerUser.user_id = j10;
                return tL_peerUser;
            } else if (messageFwdHeader != null) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_peerUser2.user_id = 2666000L;
                return tL_peerUser2;
            } else {
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_peerUser3.user_id = j10;
                return tL_peerUser3;
            }
        }
        return null;
    }

    public static long getStakedDiceWinAmount(TLRPC.TL_messageMediaDice tL_messageMediaDice) {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome = tL_messageMediaDice.game_outcome;
        if (tL_messages_emojiGameOutcome != null) {
            long j10 = tL_messages_emojiGameOutcome.ton_amount;
            return j10 > 0 ? j10 : -tL_messages_emojiGameOutcome.stake_ton_amount;
        }
        return 0L;
    }

    public static long getStickerSetId(TLRPC.Document document) {
        if (document == null) {
            return -1L;
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
                    return -1L;
                }
                return inputStickerSet.f19179id;
            }
        }
        return -1L;
    }

    public static String getStickerSetName(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
                    return null;
                }
                return inputStickerSet.short_name;
            }
        }
        return null;
    }

    private CharSequence getStringFrom(TLRPC.ChatReactions chatReactions) {
        String str;
        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
            return LocaleController.getString(R.string.AllReactions);
        }
        if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < tL_chatReactionsSome.reactions.size(); i10++) {
                if (i10 != 0) {
                    spannableStringBuilder.append((CharSequence) " ");
                }
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i10);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u5(((TLRPC.TL_reactionCustomEmoji) reaction).document_id, (Paint.FontMetricsInt) null), 0, 1, 0);
                    str = spannableStringBuilder2;
                } else {
                    str = "";
                }
                spannableStringBuilder.append(Emoji.replaceEmoji(str, null, false));
            }
            return spannableStringBuilder;
        }
        return LocaleController.getString(R.string.NoReactions);
    }

    private static long getTopicId(MessageObject messageObject) {
        if (messageObject == null) {
            return 0L;
        }
        return getTopicId(messageObject.currentAccount, messageObject.messageOwner, false);
    }

    public static int getUnreadFlags(TLRPC.Message message) {
        int i10 = !message.unread ? 1 : 0;
        if (!message.media_unread) {
            return i10 | 2;
        }
        return i10;
    }

    private TLRPC.User getUser(AbstractMap<Long, TLRPC.User> abstractMap, a0.h hVar, long j10) {
        TLRPC.User user;
        if (abstractMap != null) {
            user = abstractMap.get(Long.valueOf(j10));
        } else if (hVar != null) {
            user = (TLRPC.User) hVar.f(j10);
        } else {
            user = null;
        }
        if (user == null) {
            return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        }
        return user;
    }

    private String getUserName(TLObject tLObject, ArrayList<TLRPC.MessageEntity> arrayList, int i10) {
        String str;
        String publicUsername;
        long j10;
        String str2;
        String str3;
        long j11;
        if (tLObject == null) {
            str2 = "";
            str3 = null;
            j11 = 0;
        } else {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (user.deleted) {
                    str = LocaleController.getString(R.string.HiddenName);
                } else {
                    str = ContactsController.formatName(user.first_name, user.last_name);
                }
                publicUsername = UserObject.getPublicUsername(user);
                j10 = user.f19306id;
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = chat.title;
                publicUsername = ChatObject.getPublicUsername(chat);
                j10 = -chat.f19159id;
            }
            str2 = str;
            str3 = publicUsername;
            j11 = j10;
        }
        if (i10 >= 0) {
            TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName = new TLRPC.TL_messageEntityMentionName();
            tL_messageEntityMentionName.user_id = j11;
            tL_messageEntityMentionName.offset = i10;
            tL_messageEntityMentionName.length = str2.length();
            arrayList.add(tL_messageEntityMentionName);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (i10 >= 0) {
                TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName2 = new TLRPC.TL_messageEntityMentionName();
                tL_messageEntityMentionName2.user_id = j11;
                tL_messageEntityMentionName2.offset = str2.length() + i10 + 2;
                tL_messageEntityMentionName2.length = str3.length() + 1;
                arrayList.add(tL_messageEntityMentionName2);
            }
            return String.format("%1$s (@%2$s)", str2, str3);
        }
        return str2;
    }

    private String getUsernamesString(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                sb.append("@");
                sb.append(arrayList.get(i10));
                if (i10 < arrayList.size() - 1) {
                    sb.append(", ");
                }
            }
            return sb.toString();
        }
        return LocaleController.getString(R.string.UsernameEmpty).toLowerCase();
    }

    public static String getVideoCodec(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return ((TLRPC.TL_documentAttributeVideo) documentAttribute).video_codec;
            }
        }
        return null;
    }

    public static int getVideoHeight(TLRPC.Document document) {
        if (document == null) {
            return 0;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.h;
            }
        }
        return 0;
    }

    public static int getVideoWidth(TLRPC.Document document) {
        if (document == null) {
            return 0;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.f19166w;
            }
        }
        return 0;
    }

    public static double getWebDocumentDuration(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return 0.0d;
        }
        int size = webDocument.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static int[] getWebDocumentWidthAndHeight(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return null;
        }
        int size = webDocument.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                return new int[]{documentAttribute.f19166w, documentAttribute.h};
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return new int[]{documentAttribute.f19166w, documentAttribute.h};
            }
        }
        return null;
    }

    public static CharSequence groupSpan() {
        if (groupSpan == null) {
            groupSpan = new SpannableStringBuilder("g");
            lq lqVar = new lq(R.drawable.msg_folders_groups, 0);
            lqVar.setScale(0.7f, 0.7f);
            ((SpannableStringBuilder) groupSpan).setSpan(lqVar, 0, 1, 33);
        }
        return groupSpan;
    }

    private void handleFoundWords(ArrayList<String> arrayList, String[] strArr, boolean z4) {
        handleFoundWords(arrayList, strArr, z4, true);
    }

    private boolean hasNonEmojiEntities() {
        TLRPC.Message message = this.messageOwner;
        if (message != null && message.entities != null) {
            for (int i10 = 0; i10 < this.messageOwner.entities.size(); i10++) {
                if (!(this.messageOwner.entities.get(i10) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasUnreadReactions(TLRPC.Message message) {
        if (message == null) {
            return false;
        }
        return hasUnreadReactions(message.reactions);
    }

    public static boolean isAnimatedEmoji(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnimatedStickerDocument(TLRPC.Document document) {
        return document != null && document.mime_type.equals("video/webm");
    }

    public static boolean isAnimatedStickerMessage(TLRPC.Message message) {
        boolean z4;
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(message.dialog_id);
        if ((!isEncryptedDialog || message.stickerVerified == 1) && getMedia(message) != null) {
            TLRPC.Document document = getMedia(message).document;
            if (isEncryptedDialog && !message.out) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (isAnimatedStickerDocument(document, z4)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnyKindOfStickerOrEmoji(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBlueBlock(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean isCompleted(MessageObject messageObject, int i10) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia media = getMedia(messageObject);
        if (!(media instanceof TLRPC.TL_messageMediaToDo) || (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) media).todo) == null || todoList.list == null) {
            return false;
        }
        return isCompleted(tL_messageMediaToDo, i10);
    }

    public static boolean isDocumentHasAttachedStickers(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeHasStickers) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDocumentHasThumb(TLRPC.Document document) {
        if (document != null && !document.thumbs.isEmpty()) {
            int size = document.thumbs.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.PhotoSize photoSize = document.thumbs.get(i10);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && (!(photoSize.location instanceof TLRPC.TL_fileLocationUnavailable) || photoSize.bytes != null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isEphemeralMessageId(int i10) {
        if ((i10 & 1879048192) == 1610612736) {
            return true;
        }
        return false;
    }

    public static boolean isExtendedVideo(TLRPC.MessageExtendedMedia messageExtendedMedia) {
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && isVideoDocument(messageMedia.document)) {
                return true;
            }
            return false;
        } else if ((messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) && (((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isForwardedMessage(TLRPC.Message message) {
        if ((message.flags & 4) != 0 && message.fwd_from != null) {
            return true;
        }
        return false;
    }

    public static boolean isFreeEmoji(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).free;
            }
        }
        return false;
    }

    public static boolean isGameMessage(TLRPC.Message message) {
        return getMedia(message) instanceof TLRPC.TL_messageMediaGame;
    }

    public static boolean isGifDocument(WebFile webFile) {
        if (webFile != null) {
            return webFile.mime_type.equals("image/gif") || isNewGifDocument(webFile);
        }
        return false;
    }

    public static boolean isGifMessage(TLRPC.Message message) {
        boolean z4;
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return isGifDocument(getMedia(message).webpage.document);
        }
        if (getMedia(message) != null) {
            TLRPC.Document document = getMedia(message).document;
            if (message.grouped_id != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (isGifDocument(document, z4)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isImageWebDocument(WebFile webFile) {
        if (webFile != null && !isGifDocument(webFile) && webFile.mime_type.startsWith("image/")) {
            return true;
        }
        return false;
    }

    public static boolean isInvoiceMessage(TLRPC.Message message) {
        return getMedia(message) instanceof TLRPC.TL_messageMediaInvoice;
    }

    public static boolean isLiveLocationMessage(TLRPC.Message message) {
        return getMedia(message) instanceof TLRPC.TL_messageMediaGeoLive;
    }

    public static boolean isLocationMessage(TLRPC.Message message) {
        if (!(getMedia(message) instanceof TLRPC.TL_messageMediaGeo) && !(getMedia(message) instanceof TLRPC.TL_messageMediaGeoLive) && !(getMedia(message) instanceof TLRPC.TL_messageMediaVenue)) {
            return false;
        }
        return true;
    }

    public static boolean isMaskDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && documentAttribute.mask) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMaskMessage(TLRPC.Message message) {
        if (getMedia(message) != null && isMaskDocument(getMedia(message).document)) {
            return true;
        }
        return false;
    }

    public static boolean isMusicDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    return !documentAttribute.voice;
                }
            }
            if (!TextUtils.isEmpty(document.mime_type)) {
                String lowerCase = document.mime_type.toLowerCase();
                if (lowerCase.equals("audio/flac") || lowerCase.equals("audio/ogg") || lowerCase.equals("audio/opus") || lowerCase.equals("audio/x-opus+ogg") || (lowerCase.equals("application/octet-stream") && FileLoader.getDocumentFileName(document).endsWith(".opus"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMusicMessage(TLRPC.Message message) {
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return isMusicDocument(getMedia(message).webpage.document);
        }
        if (getMedia(message) != null && isMusicDocument(getMedia(message).document)) {
            return true;
        }
        return false;
    }

    public static boolean isNewGifDocument(WebFile webFile) {
        if (webFile != null && "video/mp4".equals(webFile.mime_type)) {
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < webFile.attributes.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = webFile.attributes.get(i12);
                if (!(documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) && (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    i10 = documentAttribute.f19166w;
                    i11 = documentAttribute.h;
                }
            }
            if (i10 <= 1280 && i11 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNewGifMessage(TLRPC.Message message) {
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return isNewGifDocument(getMedia(message).webpage.document);
        }
        if (getMedia(message) != null && isNewGifDocument(getMedia(message).document)) {
            return true;
        }
        return false;
    }

    public static boolean isPaidVideo(TLRPC.MessageMedia messageMedia) {
        if (!(messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.size() != 1 || !isExtendedVideo(messageMedia.extended_media.get(0))) {
            return false;
        }
        return true;
    }

    public static boolean isPhoto(TLRPC.Message message) {
        TLRPC.MessageAction messageAction;
        TLRPC.Photo photo;
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return findPhoto(richMessage) != null;
        } else if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return (getMedia(message).webpage.photo instanceof TLRPC.TL_photo) && !(getMedia(message).webpage.document instanceof TLRPC.TL_document);
        } else if (message != null && (messageAction = message.action) != null && (photo = messageAction.photo) != null) {
            return photo instanceof TLRPC.TL_photo;
        } else {
            return getMedia(message) instanceof TLRPC.TL_messageMediaPhoto;
        }
    }

    public static boolean isPremiumEmojiPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if ((tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) && tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
            for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                if (!isFreeEmoji(tL_messages_stickerSet.documents.get(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPremiumSticker(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i10 = 0; i10 < document.video_thumbs.size(); i10++) {
                if ("f".equals(document.video_thumbs.get(i10).type)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isQuickReply(TLRPC.Message message) {
        if (message != null) {
            return ((message.flags & 1073741824) == 0 && message.quick_reply_shortcut == null) ? false : true;
        }
        return false;
    }

    public static boolean isRoundVideoDocument(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z4 = false;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < document.attributes.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i10 = documentAttribute.f19166w;
                    i11 = documentAttribute.h;
                    z4 = documentAttribute.round_message;
                }
            }
            if (z4 && i10 <= 1280 && i11 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRoundVideoMessage(TLRPC.Message message) {
        if ((getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(message).webpage != null) {
            return isRoundVideoDocument(getMedia(message).webpage.document);
        }
        if (getMedia(message) != null && isRoundVideoDocument(getMedia(message).document)) {
            return true;
        }
        return false;
    }

    public static boolean isSecretMedia(TLRPC.Message message) {
        return message instanceof TLRPC.TL_message_secret ? ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || isRoundVideoMessage(message) || isVideoMessage(message)) && getMedia(message).ttl_seconds != 0 : (message instanceof TLRPC.TL_message) && ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) && getMedia(message).ttl_seconds != 0;
    }

    public static boolean isSecretPhotoOrVideo(TLRPC.Message message) {
        int i10;
        if (message instanceof TLRPC.TL_message_secret) {
            if (((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || isRoundVideoMessage(message) || isVideoMessage(message)) && (i10 = message.ttl) > 0 && i10 <= 60) {
                return true;
            }
            return false;
        } else if ((message instanceof TLRPC.TL_message) && (((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) && getMedia(message).ttl_seconds != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isStaticStickerDocument(TLRPC.Document document) {
        if (document != null && document.mime_type.equals("image/webp")) {
            return true;
        }
        return false;
    }

    public static boolean isStickerDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeSticker) {
                    if (!"image/webp".equals(document.mime_type) && !"video/webm".equals(document.mime_type)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isStickerHasSet(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isStickerMessage(TLRPC.Message message) {
        if (getMedia(message) != null && isStickerDocument(getMedia(message).document)) {
            return true;
        }
        return false;
    }

    public static boolean isSystemSignUp(MessageObject messageObject) {
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if ((message instanceof TLRPC.TL_messageService) && (((TLRPC.TL_messageService) message).action instanceof TLRPC.TL_messageActionContactSignUp)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isTextColorEmoji(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        getInputStickerSet(document);
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetID) && inputStickerSet.f19179id == 1269403972611866647L) {
                    return true;
                }
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).text_color;
            }
        }
        return false;
    }

    public static boolean isTextColorSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
            if (stickerSet.text_color) {
                return true;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList != null && !arrayList.isEmpty()) {
                return isTextColorEmoji(tL_messages_stickerSet.documents.get(0));
            }
        }
        return false;
    }

    public static boolean isTopicActionMessage(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionTopicCreate) && !(messageAction instanceof TLRPC.TL_messageActionTopicEdit)) {
            return false;
        }
        return true;
    }

    public static boolean isV(String str) {
        if (str == null) {
            return true;
        }
        switch (str.toLowerCase().hashCode()) {
            case -1535907675:
            case -1422950858:
            case -1253501876:
            case -907685685:
            case -788047292:
            case -338481545:
            case 3106:
            case 3184:
            case 3215:
            case 3401:
            case 3479:
            case 3494:
            case 3580:
            case 3581:
            case 3593:
            case 3632:
            case 3669:
            case 3756:
            case 3804:
            case 96400:
            case 96586:
            case 96796:
            case 96801:
            case 96894:
            case 97013:
            case 97300:
            case 97301:
            case 97543:
            case 98437:
            case 98472:
            case 98618:
            case 98689:
            case 98719:
            case 98789:
            case 98808:
            case 98819:
            case 99338:
            case 99351:
            case 99548:
            case 99556:
            case 99582:
            case 99640:
            case 99752:
            case 100208:
            case 100511:
            case 100542:
            case 100730:
            case 100882:
            case 100958:
            case 101460:
            case 101671:
            case 101854:
            case 102556:
            case 102572:
            case 103404:
            case 103438:
            case 103637:
            case 103649:
            case 104074:
            case 104269:
            case 104417:
            case 104430:
            case 104435:
            case 104474:
            case 104479:
            case 104582:
            case 104587:
            case 104987:
            case 105532:
            case 105543:
            case 105551:
            case 106202:
            case 106496:
            case 107141:
            case 107305:
            case 107932:
            case 107988:
            case 107989:
            case 108341:
            case 108382:
            case 108413:
            case 108419:
            case 108426:
            case 108430:
            case 108570:
            case 109824:
            case 109860:
            case 110754:
            case 110801:
            case 110834:
            case 110883:
            case 110968:
            case 110989:
            case 111052:
            case 111220:
            case 111265:
            case 111269:
            case 111390:
            case 111420:
            case 111482:
            case 111494:
            case 112185:
            case 112712:
            case 112788:
            case 112862:
            case 113115:
            case 113132:
            case 113291:
            case 113698:
            case 113700:
            case 113837:
            case 113854:
            case 114101:
            case 114130:
            case 114276:
            case 114381:
            case 114809:
            case 114922:
            case 114970:
            case 115161:
            case 115312:
            case 115639:
            case 116079:
            case 116537:
            case 116551:
            case 116609:
            case 117218:
            case 117537:
            case 117840:
            case 117938:
            case 118023:
            case 118026:
            case 118028:
            case 118439:
            case 118783:
            case 118807:
            case 118939:
            case 120703:
            case 3003834:
            case 3016404:
            case 3088960:
            case 3213227:
            case 3271912:
            case 3358271:
            case 3444044:
            case 3446979:
            case 3447940:
            case 3524225:
            case 3524692:
            case 3526257:
            case 3682393:
            case 35379135:
            case 114035747:
                return true;
            default:
                return false;
        }
    }

    public static boolean isVideoDocument(TLRPC.Document document) {
        int lastIndexOf;
        if (document == null) {
            return false;
        }
        String str = null;
        boolean z4 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        for (int i12 = 0; i12 < document.attributes.size(); i12++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                if (documentAttribute.round_message) {
                    return false;
                }
                i10 = documentAttribute.f19166w;
                i11 = documentAttribute.h;
                z10 = true;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                z4 = true;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                str = documentAttribute.file_name;
            }
        }
        if (str != null && (lastIndexOf = str.lastIndexOf(".")) >= 0 && isV(str.substring(lastIndexOf + 1))) {
            return false;
        }
        if (z4 && (i10 > 1280 || i11 > 1280)) {
            z4 = false;
        }
        if (SharedConfig.streamMkv && !z10 && "video/x-matroska".equals(document.mime_type)) {
            z10 = true;
        }
        if (!z10 || z4) {
            return false;
        }
        return true;
    }

    public static boolean isVideoMessage(TLRPC.Message message) {
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return isVideoDocument(findVideo(richMessage));
        }
        if (getMedia(message) != null && isVideoSticker(getMedia(message).document)) {
            return false;
        }
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return isVideoDocument(getMedia(message).webpage.document);
        }
        if (getMedia(message) == null || !isVideoDocument(getMedia(message).document)) {
            return false;
        }
        return true;
    }

    public static boolean isVideoSticker(TLRPC.Document document) {
        return document != null && isVideoStickerDocument(document);
    }

    public static boolean isVideoStickerDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                    return "video/webm".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public static boolean isVideoWebDocument(WebFile webFile) {
        if (webFile != null && webFile.mime_type.startsWith("video/")) {
            return true;
        }
        return false;
    }

    public static boolean isVoiceDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    return documentAttribute.voice;
                }
            }
        }
        return false;
    }

    public static boolean isVoiceMessage(TLRPC.Message message) {
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return isVoiceDocument(getMedia(message).webpage.document);
        }
        if (getMedia(message) != null && isVoiceDocument(getMedia(message).document)) {
            return true;
        }
        return false;
    }

    public static boolean isVoiceWebDocument(WebFile webFile) {
        if (webFile != null && webFile.mime_type.equals("audio/ogg")) {
            return true;
        }
        return false;
    }

    public static boolean isVoteResultsIsNotEmpty(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_messageMediaPoll.results.results.get(i10).voters > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isVoted(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_messageMediaPoll.results.results.get(i10).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isWebM(TLRPC.Document document) {
        if (document != null && "video/webm".equals(document.mime_type)) {
            return true;
        }
        return false;
    }

    public static int lambda$addEntitiesToText$2(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i10 = messageEntity.offset;
        int i11 = messageEntity2.offset;
        if (i10 > i11) {
            return 1;
        }
        if (i10 < i11) {
            return -1;
        }
        return 0;
    }

    public static int lambda$handleFoundWords$3(String str, String str2) {
        return str2.length() - str.length();
    }

    public void lambda$loadAnimatedEmojiDocument$0(TLRPC.Document document) {
        this.emojiAnimatedSticker = document;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.animatedEmojiDocumentLoaded, this);
    }

    public void lambda$loadAnimatedEmojiDocument$1(TLRPC.Document document) {
        AndroidUtilities.runOnUIThread(new d2(22, this, document));
    }

    public static StaticLayout makeStaticLayout(CharSequence charSequence, TextPaint textPaint, int i10, float f10, float f11, boolean z4) {
        return makeStaticLayout(charSequence, textPaint, i10, f10, f11, z4, Layout.Alignment.ALIGN_NORMAL);
    }

    public boolean needDrawAvatarInternal() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.needDrawAvatarInternal():boolean");
    }

    public static void normalizeFlags(TLRPC.Message message) {
        TLRPC.Peer peer = message.from_id;
        if (peer == null) {
            message.flags &= -257;
        }
        if (peer == null) {
            message.flags &= -5;
        }
        if (message.reply_to == null) {
            message.flags &= -9;
        }
        if (message.media == null) {
            message.flags &= -513;
        }
        if (message.reply_markup == null) {
            message.flags &= -65;
        }
        if (message.replies == null) {
            message.flags &= -8388609;
        }
        if (message.reactions == null) {
            message.flags &= -1048577;
        }
    }

    public static CharSequence peerNameWithIcon(int i10, TLRPC.Peer peer) {
        return peerNameWithIcon(i10, peer, !(peer instanceof TLRPC.TL_peerUser));
    }

    public static boolean peersEqual(TLRPC.InputPeer inputPeer, TLRPC.InputPeer inputPeer2) {
        if (inputPeer == null && inputPeer2 == null) {
            return true;
        }
        if (inputPeer != null && inputPeer2 != null) {
            if ((inputPeer instanceof TLRPC.TL_inputPeerChat) && (inputPeer2 instanceof TLRPC.TL_inputPeerChat)) {
                return inputPeer.chat_id == inputPeer2.chat_id;
            } else if ((inputPeer instanceof TLRPC.TL_inputPeerChannel) && (inputPeer2 instanceof TLRPC.TL_inputPeerChannel)) {
                return inputPeer.channel_id == inputPeer2.channel_id;
            } else if ((inputPeer instanceof TLRPC.TL_inputPeerUser) && (inputPeer2 instanceof TLRPC.TL_inputPeerUser)) {
                return inputPeer.user_id == inputPeer2.user_id;
            } else if ((inputPeer instanceof TLRPC.TL_inputPeerSelf) && (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) {
                return true;
            }
        }
        return false;
    }

    public static TLRPC.TL_textWithEntities removeLinks(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
        tL_textWithEntities2.text = tL_textWithEntities.text;
        for (int i10 = 0; i10 < tL_textWithEntities.entities.size(); i10++) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(i10);
            if (!(messageEntity instanceof TLRPC.TL_messageEntityUrl) && !(messageEntity instanceof TLRPC.TL_messageEntityTextUrl)) {
                tL_textWithEntities2.entities.add(messageEntity);
            }
        }
        return tL_textWithEntities2;
    }

    public static void setUnreadFlags(TLRPC.Message message, int i10) {
        boolean z4;
        boolean z10 = false;
        if ((i10 & 1) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        message.unread = z4;
        if ((i10 & 2) == 0) {
            z10 = true;
        }
        message.media_unread = z10;
    }

    public static boolean shouldEncryptPhotoOrVideo(int i10, TLRPC.Message message) {
        int i11;
        if ((message == null || message.media == null || !((isVoiceDocument(getDocument(message)) || isRoundVideoMessage(message)) && message.media.ttl_seconds == Integer.MAX_VALUE)) && !(getMedia(message) instanceof TLRPC.TL_messageMediaPaidMedia)) {
            return message instanceof TLRPC.TL_message_secret ? ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || isVideoMessage(message)) && (i11 = message.ttl) > 0 && i11 <= 60 : ((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) && getMedia(message).ttl_seconds != 0;
        }
        return true;
    }

    public static SpannableStringBuilder span(String str, int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new lq(i10, 0), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static void toggleTodo(int i10, long j10, TLRPC.TL_messageMediaToDo tL_messageMediaToDo, int i11, boolean z4, int i12) {
        int i13 = 0;
        while (i13 < tL_messageMediaToDo.completions.size()) {
            if (tL_messageMediaToDo.completions.get(i13).f19303id == i11) {
                tL_messageMediaToDo.completions.remove(i13);
                if (tL_messageMediaToDo.completions.isEmpty()) {
                    tL_messageMediaToDo.flags &= -2;
                }
                i13--;
            }
            i13++;
        }
        if (z4) {
            TLRPC.TL_todoCompletion tL_todoCompletion = new TLRPC.TL_todoCompletion();
            tL_todoCompletion.f19303id = i11;
            tL_todoCompletion.completed_by = MessagesController.getInstance(i10).getPeer(j10);
            tL_todoCompletion.date = i12;
            tL_messageMediaToDo.flags |= 1;
            tL_messageMediaToDo.completions.add(tL_todoCompletion);
        }
    }

    private static void updatePhotoSizeLocations(ArrayList<TLRPC.PhotoSize> arrayList, List<TLRPC.PhotoSize> list) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.PhotoSize photoSize = arrayList.get(i10);
            if (photoSize != null) {
                int size2 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        TLRPC.PhotoSize photoSize2 = list.get(i11);
                        if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize2 instanceof TLRPC.TL_photoCachedSize) && photoSize2 != null && photoSize2.type.equals(photoSize.type)) {
                            photoSize.location = photoSize2.location;
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
    }

    public static void updatePollResults(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollResults pollResults) {
        TLRPC.Poll poll;
        ArrayList<TLRPC.PollAnswerVoters> arrayList;
        ArrayList arrayList2;
        byte[] bArr;
        ArrayList<TLRPC.PollAnswerVoters> arrayList3;
        if (tL_messageMediaPoll != null && pollResults != null) {
            if ((pollResults.flags & 2) != 0) {
                if (pollResults.min && (arrayList3 = tL_messageMediaPoll.results.results) != null) {
                    int size = arrayList3.size();
                    arrayList2 = null;
                    bArr = null;
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i10);
                        if (pollAnswerVoters.chosen) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(pollAnswerVoters.option);
                        }
                        if (pollAnswerVoters.correct) {
                            bArr = pollAnswerVoters.option;
                        }
                    }
                } else {
                    arrayList2 = null;
                    bArr = null;
                }
                TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                ArrayList<TLRPC.PollAnswerVoters> arrayList4 = pollResults.results;
                pollResults2.results = arrayList4;
                if (arrayList2 != null || bArr != null) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = tL_messageMediaPoll.results.results.get(i11);
                        if (arrayList2 != null) {
                            int size3 = arrayList2.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size3) {
                                    break;
                                } else if (Arrays.equals(pollAnswerVoters2.option, (byte[]) arrayList2.get(i12))) {
                                    pollAnswerVoters2.chosen = true;
                                    arrayList2.remove(i12);
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                arrayList2 = null;
                            }
                        }
                        if (bArr != null && Arrays.equals(pollAnswerVoters2.option, bArr)) {
                            pollAnswerVoters2.correct = true;
                            bArr = null;
                        }
                        if (arrayList2 == null && bArr == null) {
                            break;
                        }
                    }
                }
                TLRPC.PollResults pollResults3 = tL_messageMediaPoll.results;
                pollResults3.flags = 2 | pollResults3.flags;
            } else if (!pollResults.min && (poll = tL_messageMediaPoll.poll) != null && poll.hide_results_until_close && ((arrayList = pollResults.results) == null || arrayList.isEmpty())) {
                tL_messageMediaPoll.results.results = new ArrayList<>();
                TLRPC.PollResults pollResults4 = tL_messageMediaPoll.results;
                pollResults4.flags = k7.w8.b(pollResults4.flags, 2, false);
            }
            if ((pollResults.flags & 4) != 0) {
                TLRPC.PollResults pollResults5 = tL_messageMediaPoll.results;
                pollResults5.total_voters = pollResults.total_voters;
                pollResults5.flags |= 4;
            }
            if ((pollResults.flags & 8) != 0) {
                TLRPC.PollResults pollResults6 = tL_messageMediaPoll.results;
                pollResults6.recent_voters = pollResults.recent_voters;
                pollResults6.flags |= 8;
            }
            if ((pollResults.flags & 16) != 0) {
                TLRPC.PollResults pollResults7 = tL_messageMediaPoll.results;
                pollResults7.solution = pollResults.solution;
                pollResults7.solution_entities = pollResults.solution_entities;
                pollResults7.flags |= 16;
            }
            if (!pollResults.min) {
                TLRPC.PollResults pollResults8 = tL_messageMediaPoll.results;
                pollResults8.has_unread_votes = pollResults.has_unread_votes;
                pollResults8.can_view_stats = pollResults.can_view_stats;
            }
        }
    }

    public static void updateReactions(TLRPC.Message message, TLRPC.TL_messageReactions tL_messageReactions) {
        if (message != null && tL_messageReactions != null) {
            TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
            if (tL_messageReactions2 != null) {
                int size = tL_messageReactions2.results.size();
                boolean z4 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ReactionCount reactionCount = message.reactions.results.get(i10);
                    int size2 = tL_messageReactions.results.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.ReactionCount reactionCount2 = tL_messageReactions.results.get(i11);
                        if (mg.r0.g(reactionCount.reaction, reactionCount2.reaction)) {
                            if (!z4 && tL_messageReactions.min && reactionCount.chosen) {
                                reactionCount2.chosen = true;
                                z4 = true;
                            }
                            reactionCount2.lastDrawnPosition = reactionCount.lastDrawnPosition;
                        }
                    }
                    if (reactionCount.chosen) {
                        z4 = true;
                    }
                }
            }
            message.reactions = tL_messageReactions;
            message.flags |= 1048576;
        }
    }

    public static CharSequence userSpan() {
        return userSpan(0);
    }

    public void addPaidReactions(int i10, boolean z4, long j10) {
        TLRPC.Message message = this.messageOwner;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.messageOwner;
            TLRPC.TL_messageReactions tL_messageReactions = message2.reactions;
            long dialogId = getDialogId(message2);
            boolean z10 = false;
            tL_messageReactions.reactions_as_tags = dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
            this.messageOwner.reactions.can_see_list = (isFromGroup() || isFromUser()) ? true : true;
        }
        addPaidReactions(this.currentAccount, this.messageOwner.reactions, i10, j10, z4);
    }

    public void applyMediaExistanceFlags(int i10) {
        boolean z4;
        if (i10 == -1) {
            checkMediaExistance();
            return;
        }
        boolean z10 = false;
        if ((i10 & 1) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.attachPathExists = z4;
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        this.mediaExists = z10;
    }

    public void applyNewText() {
        this.translated = false;
        this.summarized = false;
        applyNewText(this.messageOwner.message);
    }

    public void applyQuickReply(String str, int i10) {
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return;
        }
        if (i10 != 0) {
            message.flags |= 1073741824;
            message.quick_reply_shortcut_id = i10;
            TLRPC.TL_inputQuickReplyShortcutId tL_inputQuickReplyShortcutId = new TLRPC.TL_inputQuickReplyShortcutId();
            tL_inputQuickReplyShortcutId.shortcut_id = i10;
            this.messageOwner.quick_reply_shortcut = tL_inputQuickReplyShortcutId;
        } else if (str != null) {
            TLRPC.TL_inputQuickReplyShortcut tL_inputQuickReplyShortcut = new TLRPC.TL_inputQuickReplyShortcut();
            tL_inputQuickReplyShortcut.shortcut = str;
            this.messageOwner.quick_reply_shortcut = tL_inputQuickReplyShortcut;
        } else {
            message.flags &= -1073741825;
            message.quick_reply_shortcut_id = 0;
            message.quick_reply_shortcut = null;
        }
    }

    public void applyTimestampsHighlightForReplyMsg() {
        applyTimestampsHighlightForReplyMsg(this.messageText);
    }

    public boolean areTags() {
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message = this.messageOwner;
        if (message == null || (tL_messageReactions = message.reactions) == null) {
            return false;
        }
        return tL_messageReactions.reactions_as_tags;
    }

    public boolean canAppendToTodo() {
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaToDo) || isForwarded()) {
            return false;
        }
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) media;
        if (tL_messageMediaToDo.todo.list.size() >= MessagesController.getInstance(this.currentAccount).todoItemsMax) {
            return false;
        }
        if (!isOutOwner()) {
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            if (!todoList.others_can_complete || !todoList.others_can_append) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean canBeSensitive() {
        if (this.messageOwner != null) {
            int i10 = this.type;
            if ((i10 == 1 || i10 == 3 || i10 == 9 || i10 == 8 || i10 == 5) && !this.sendPreview && !this.isRepostPreview && !isOutOwner() && this.messageOwner.send_state == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean canCompleteTodo() {
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaToDo) || isForwarded()) {
            return false;
        }
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) media;
        if (!isOutOwner() && !tL_messageMediaToDo.todo.others_can_complete) {
            return false;
        }
        return true;
    }

    public boolean canDeleteMessage(boolean z4, TLRPC.Chat chat) {
        TLRPC.Message message;
        if (isStory() && (message = this.messageOwner) != null && message.dialog_id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            return true;
        }
        return (this.eventId == 0 && this.sponsoredId == null && canDeleteMessage(this.currentAccount, z4, this.messageOwner, chat)) || isEphemeral();
    }

    public boolean canEditMedia() {
        if (!isSecretMedia() && !isEphemeralAndNotWelcome()) {
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
                return true;
            }
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) {
                if (isVoice() || isSticker() || isAnimatedSticker() || isRoundVideo()) {
                    return false;
                }
                return true;
            } else if (isMediaEmpty()) {
                return true;
            }
        }
        return false;
    }

    public boolean canEditMessage(TLRPC.Chat chat) {
        return !isEphemeralAndNotWelcome() && canEditMessage(this.currentAccount, this.messageOwner, chat, this.scheduled);
    }

    public boolean canEditMessageAnytime(TLRPC.Chat chat) {
        return canEditMessageAnytime(this.currentAccount, this.messageOwner, chat);
    }

    public boolean canEditMessageScheduleTime(TLRPC.Chat chat) {
        return canEditMessageScheduleTime(this.currentAccount, this.messageOwner, chat);
    }

    public boolean canForwardMessage() {
        int i10;
        if (isQuickReply() || (i10 = this.type) == 30 || i10 == 31 || i10 == 32 || i10 == 33 || i10 == 35 || i10 == 37 || (this.messageOwner instanceof TLRPC.TL_message_secret) || needDrawBluredPreview() || isLiveLocation() || this.type == 16 || isSponsored() || this.messageOwner.noforwards) {
            return false;
        }
        return true;
    }

    public boolean canPreviewDocument() {
        return canPreviewDocument(getDocument());
    }

    public boolean canSetReaction() {
        if (isEphemeral()) {
            return false;
        }
        TLRPC.Message message = this.messageOwner;
        if (message instanceof TLRPC.TL_messageService) {
            return message.reactions_are_possible;
        }
        return true;
    }

    public boolean canStreamVideo() {
        if (hasVideoQualities()) {
            return true;
        }
        TLRPC.Document document = getDocument();
        if (document != null && !(document instanceof TLRPC.TL_documentEncrypted)) {
            if (SharedConfig.streamAllVideo) {
                return true;
            }
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    return documentAttribute.supports_streaming;
                }
            }
            if (SharedConfig.streamMkv && "video/x-matroska".equals(document.mime_type)) {
                return true;
            }
        }
        return false;
    }

    public boolean canUnvote() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            return canUnvote((TLRPC.TL_messageMediaPoll) media);
        }
        return false;
    }

    public boolean canViewThread() {
        if (this.messageOwner.action != null) {
            return false;
        }
        if (!hasReplies()) {
            MessageObject messageObject = this.replyMessageObject;
            if ((messageObject == null || messageObject.messageOwner.replies == null) && getReplyTopMsgId() == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void checkBigAnimatedEmoji() {
        org.telegram.ui.Components.u5[] u5VarArr;
        int i10;
        this.emojiAnimatedSticker = null;
        this.emojiAnimatedStickerId = null;
        if (this.emojiOnlyCount == 1 && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) && ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaEmpty) || getMedia(this.messageOwner) == null)) {
            TLRPC.Message message = this.messageOwner;
            if (message.grouped_id == 0) {
                if (message.entities.isEmpty()) {
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
                    if (!TextUtils.isEmpty(this.emojiAnimatedStickerColor) && (i10 = indexOf + 2) < this.messageText.length()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str.toString());
                        CharSequence charSequence = this.messageText;
                        sb.append(charSequence.subSequence(i10, charSequence.length()).toString());
                        str = sb.toString();
                    }
                    if (TextUtils.isEmpty(this.emojiAnimatedStickerColor) || EmojiData.emojiColoredMap.contains(str.toString())) {
                        this.emojiAnimatedSticker = MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(str);
                    }
                } else if (this.messageOwner.entities.size() == 1 && (this.messageOwner.entities.get(0) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    try {
                        Long valueOf = Long.valueOf(((TLRPC.TL_messageEntityCustomEmoji) this.messageOwner.entities.get(0)).document_id);
                        this.emojiAnimatedStickerId = valueOf;
                        TLRPC.Document f10 = org.telegram.ui.Components.l5.f(this.currentAccount, valueOf.longValue());
                        this.emojiAnimatedSticker = f10;
                        if (f10 == null) {
                            CharSequence charSequence2 = this.messageText;
                            if ((charSequence2 instanceof Spanned) && (u5VarArr = (org.telegram.ui.Components.u5[]) ((Spanned) charSequence2).getSpans(0, charSequence2.length(), org.telegram.ui.Components.u5.class)) != null && u5VarArr.length == 1) {
                                this.emojiAnimatedSticker = u5VarArr[0].document;
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

    public boolean checkLayout() {
        CharSequence charSequence;
        TLRPC.User user;
        TextPaint textPaint;
        int[] iArr;
        int i10;
        float f10;
        int i11 = this.type;
        if ((i11 == 0 || i11 == 19 || i11 == 36) && this.messageOwner.peer_id != null && (charSequence = this.messageText) != null && (charSequence.length() != 0 || this.isBotPendingDraft)) {
            if (this.layoutCreated) {
                if (AndroidUtilities.isTablet()) {
                    i10 = AndroidUtilities.getMinTabletSide();
                } else {
                    i10 = AndroidUtilities.displaySize.x;
                }
                TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.f20074o2;
                if (textPaint2 != null) {
                    f10 = textPaint2.getTextSize();
                } else {
                    f10 = 0.0f;
                }
                if (Math.abs(this.generatedWithMinSize - i10) > AndroidUtilities.dp(52.0f) || this.generatedWithDensity != AndroidUtilities.density || this.generatedWithFontSize != f10) {
                    this.layoutCreated = false;
                }
            }
            if (!this.layoutCreated) {
                this.layoutCreated = true;
                if (isFromUser()) {
                    user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
                } else {
                    user = null;
                }
                if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
                    textPaint = org.telegram.ui.ActionBar.j6.f20234x2;
                } else {
                    textPaint = org.telegram.ui.ActionBar.j6.f20074o2;
                }
                if (allowsBigEmoji()) {
                    iArr = new int[1];
                } else {
                    iArr = null;
                }
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
                generateLayout(user);
                if (this.caption != null) {
                    this.caption = null;
                    generateCaption();
                }
                return true;
            }
        }
        return false;
    }

    public void checkMediaExistance() {
        checkMediaExistance(true);
    }

    public void copyStableParams(MessageObject messageObject) {
        ArrayList<TextLayoutBlock> arrayList;
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.stableId = messageObject.stableId;
        TLRPC.Message message = this.messageOwner;
        message.premiumEffectWasPlayed = messageObject.messageOwner.premiumEffectWasPlayed;
        this.forcePlayEffect = messageObject.forcePlayEffect;
        this.wasJustSent = messageObject.wasJustSent;
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        int i10 = 0;
        if (tL_messageReactions2 != null && (arrayList2 = tL_messageReactions2.results) != null && !arrayList2.isEmpty() && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
            for (int i11 = 0; i11 < this.messageOwner.reactions.results.size(); i11++) {
                TLRPC.ReactionCount reactionCount = this.messageOwner.reactions.results.get(i11);
                for (int i12 = 0; i12 < messageObject.messageOwner.reactions.results.size(); i12++) {
                    TLRPC.ReactionCount reactionCount2 = messageObject.messageOwner.reactions.results.get(i12);
                    if (mg.r0.g(reactionCount.reaction, reactionCount2.reaction)) {
                        reactionCount.lastDrawnPosition = reactionCount2.lastDrawnPosition;
                    }
                }
            }
        }
        boolean z4 = messageObject.isSpoilersRevealed;
        this.isSpoilersRevealed = z4;
        TLRPC.Message message2 = this.messageOwner;
        TLRPC.Message message3 = messageObject.messageOwner;
        message2.replyStory = message3.replyStory;
        TLRPC.MessageMedia messageMedia2 = message2.media;
        if (messageMedia2 != null && (messageMedia = message3.media) != null) {
            messageMedia2.storyItem = messageMedia.storyItem;
        }
        if (z4 && (arrayList = this.textLayoutBlocks) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                TextLayoutBlock textLayoutBlock = arrayList.get(i10);
                i10++;
                textLayoutBlock.spoilers.clear();
            }
        }
    }

    public void createMediaThumbs() {
        TLRPC.MessageMedia messageMedia;
        if (isStoryMedia()) {
            TL_stories.StoryItem storyItem = getMedia(this.messageOwner).storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
                    this.mediaThumb = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true), document);
                    this.mediaSmallThumb = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                    return;
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 50);
                this.mediaThumb = ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 320, false, closestPhotoSizeWithSize2, true), this.photoThumbsObject);
                this.mediaSmallThumb = ImageLocation.getForObject(closestPhotoSizeWithSize2, this.photoThumbsObject);
            }
        } else if (isVideo()) {
            TLRPC.Document document2 = getDocument();
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 50);
            this.mediaThumb = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 320), document2);
            this.mediaSmallThumb = ImageLocation.getForDocument(closestPhotoSizeWithSize3, document2);
        } else if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) && getMedia(this.messageOwner).photo != null && !this.photoThumbs.isEmpty()) {
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 50);
            this.mediaThumb = ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, 320, false, closestPhotoSizeWithSize4, false), this.photoThumbsObject);
            this.mediaSmallThumb = ImageLocation.getForObject(closestPhotoSizeWithSize4, this.photoThumbsObject);
        }
    }

    public void createMessageSendInfo() {
        createMessageSendInfo(false);
    }

    public void createStrippedThumb() {
        if (this.photoThumbs != null) {
            if ((canCreateStripedThubms() || hasExtendedMediaPreview()) && this.strippedThumb == null) {
                try {
                    String str = "b";
                    if (isRoundVideo()) {
                        str = "br";
                    }
                    int size = this.photoThumbs.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.PhotoSize photoSize = this.photoThumbs.get(i10);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            this.strippedThumb = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, str));
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
        }
    }

    public boolean didSpoilLoginCode() {
        return this.spoiledLoginCode;
    }

    public boolean doesPaidReactionExist() {
        boolean z4;
        boolean z10;
        TLRPC.Message message = this.messageOwner;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.messageOwner;
            TLRPC.TL_messageReactions tL_messageReactions = message2.reactions;
            if (getDialogId(message2) == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                z4 = true;
            } else {
                z4 = false;
            }
            tL_messageReactions.reactions_as_tags = z4;
            TLRPC.TL_messageReactions tL_messageReactions2 = this.messageOwner.reactions;
            if (!isFromGroup() && !isFromUser()) {
                z10 = false;
            } else {
                z10 = true;
            }
            tL_messageReactions2.can_see_list = z10;
        }
        for (int i10 = 0; i10 < this.messageOwner.reactions.results.size(); i10++) {
            if (this.messageOwner.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                return true;
            }
        }
        return false;
    }

    public boolean ensurePaidReactionsExist(boolean z4) {
        boolean z10;
        boolean z11;
        TLRPC.Message message = this.messageOwner;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.messageOwner;
            TLRPC.TL_messageReactions tL_messageReactions = message2.reactions;
            if (getDialogId(message2) == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messageReactions.reactions_as_tags = z10;
            TLRPC.TL_messageReactions tL_messageReactions2 = this.messageOwner.reactions;
            if (!isFromGroup() && !isFromUser()) {
                z11 = false;
            } else {
                z11 = true;
            }
            tL_messageReactions2.can_see_list = z11;
        }
        TLRPC.ReactionCount reactionCount = null;
        for (int i10 = 0; i10 < this.messageOwner.reactions.results.size(); i10++) {
            if (this.messageOwner.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                reactionCount = this.messageOwner.reactions.results.get(i10);
            }
        }
        if (reactionCount != null) {
            return false;
        }
        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
        tL_reactionCount.reaction = new TLRPC.TL_reactionPaid();
        tL_reactionCount.count = 1;
        tL_reactionCount.chosen = z4;
        this.messageOwner.reactions.results.add(0, tL_reactionCount);
        return true;
    }

    public boolean equals(MessageObject messageObject) {
        if (messageObject == null || getId() != messageObject.getId() || getDialogId() != messageObject.getDialogId()) {
            return false;
        }
        return true;
    }

    public void expandChannelRecommendations(boolean z4) {
        this.channelJoinedExpanded = z4;
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putBoolean("c" + getDialogId() + "_rec", z4).apply();
    }

    public void generateCaption() {
        boolean z4;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        boolean z12;
        if (!isRoundVideo()) {
            if (this.caption != null) {
                if (this.translated) {
                    TLRPC.Message message = this.messageOwner;
                    if (message.translatedText != null || (this.summarized && message.translatedSummaryText != null)) {
                        z12 = true;
                        if (z12 == this.captionTranslated && this.summarized == this.captionSummarized) {
                            return;
                        }
                    }
                }
                z12 = false;
                if (z12 == this.captionTranslated) {
                    return;
                }
            }
            TLRPC.Message message2 = this.messageOwner;
            String str = message2.message;
            ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
            if (this.type == 23) {
                TLRPC.MessageMedia messageMedia = message2.media;
                if (messageMedia != null && (storyItem = messageMedia.storyItem) != null) {
                    str = storyItem.caption;
                    arrayList = storyItem.entities;
                    z4 = true;
                    TLRPC.Message message3 = this.messageOwner;
                    tL_textWithEntities = message3.translatedSummaryText;
                    if (tL_textWithEntities == null && this.summarized && this.translated) {
                        this.captionSummarized = true;
                        this.captionTranslated = true;
                        str = tL_textWithEntities.text;
                        arrayList = tL_textWithEntities.entities;
                    } else {
                        tL_textWithEntities2 = message3.summaryText;
                        if (tL_textWithEntities2 == null && this.summarized) {
                            this.captionSummarized = true;
                            this.captionTranslated = false;
                            str = tL_textWithEntities2.text;
                            arrayList = tL_textWithEntities2.entities;
                        } else {
                            tL_textWithEntities3 = message3.translatedText;
                            if (tL_textWithEntities3 == null && this.translated) {
                                this.captionSummarized = false;
                                this.captionTranslated = true;
                                str = tL_textWithEntities3.text;
                                arrayList = tL_textWithEntities3.entities;
                            } else {
                                this.captionSummarized = false;
                                this.captionTranslated = false;
                            }
                        }
                    }
                    if (isMediaEmpty() && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) && !TextUtils.isEmpty(str)) {
                        CharSequence replaceEmoji = Emoji.replaceEmoji(str, org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt(), false);
                        this.caption = replaceEmoji;
                        this.caption = replaceAnimatedEmoji(replaceEmoji, arrayList, org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt(), false);
                        if (this.messageOwner.send_state != 0) {
                            z10 = false;
                        } else {
                            z10 = !arrayList.isEmpty();
                        }
                        if (!z4 && (z10 || (this.eventId == 0 && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto_old) && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto_layer68) && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto_layer74) && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument_old) && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument_layer68) && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument_layer74) && ((!isOut() || this.messageOwner.send_state == 0) && this.messageOwner.f19180id >= 0)))) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            if (containsUrls(this.caption)) {
                                try {
                                    AndroidUtilities.addLinksSafe((Spannable) this.caption, 5, false, true);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            addUrlsByPattern(isOutOwner(), this.caption, true, 0, 0, true);
                        }
                        addEntitiesToText(this.caption, z11);
                        this.caption = i10.a(this.caption, true);
                        if (isVideo()) {
                            addUrlsByPattern(isOutOwner(), this.caption, true, 3, (int) getDuration(), false);
                        } else if (isMusic() || isVoice()) {
                            addUrlsByPattern(isOutOwner(), this.caption, true, 4, (int) getDuration(), false);
                        }
                        applyTimestampsHighlightForReplyMsg(this.caption);
                        return;
                    }
                    return;
                }
                arrayList = new ArrayList<>();
                str = "";
            } else if (hasExtendedMedia()) {
                TLRPC.Message message4 = this.messageOwner;
                str = message4.media.description;
                message4.message = str;
            }
            z4 = false;
            TLRPC.Message message32 = this.messageOwner;
            tL_textWithEntities = message32.translatedSummaryText;
            if (tL_textWithEntities == null) {
            }
            tL_textWithEntities2 = message32.summaryText;
            if (tL_textWithEntities2 == null) {
            }
            tL_textWithEntities3 = message32.translatedText;
            if (tL_textWithEntities3 == null) {
            }
            this.captionSummarized = false;
            this.captionTranslated = false;
            if (isMediaEmpty()) {
            }
        }
    }

    public void generateExplanation() {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.PollResults pollResults;
        if (this.type != 17) {
            return;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if ((media instanceof TLRPC.TL_messageMediaPoll) && (pollResults = ((TLRPC.TL_messageMediaPoll) media).results) != null) {
            str = pollResults.solution;
            arrayList = pollResults.solution_entities;
        } else {
            str = null;
            arrayList = null;
        }
        if (str != null) {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, org.telegram.ui.ActionBar.j6.f19842b3.getFontMetricsInt(), false);
            this.quizExplanation = replaceEmoji;
            Spannable replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, arrayList, org.telegram.ui.ActionBar.j6.f19842b3.getFontMetricsInt(), false);
            this.quizExplanation = replaceAnimatedEmoji;
            addEntitiesToText(replaceAnimatedEmoji, arrayList, isOutOwner(), true, false, false);
            return;
        }
        this.quizExplanation = null;
    }

    public void generateGameMessageText(TLRPC.User user) {
        TLRPC.TL_game tL_game;
        if (user == null && isFromUser()) {
            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
        }
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null && getMedia(messageObject) != null && getMedia(this.replyMessageObject).game != null) {
            tL_game = getMedia(this.replyMessageObject).game;
        } else {
            tL_game = null;
        }
        if (tL_game == null) {
            if (user != null && user.f19306id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.messageText = LocaleController.formatString("ActionYouScored", R.string.ActionYouScored, LocaleController.formatPluralString("Points", this.messageOwner.action.score, new Object[0]));
                return;
            } else {
                this.messageText = replaceWithLink(LocaleController.formatString("ActionUserScored", R.string.ActionUserScored, LocaleController.formatPluralString("Points", this.messageOwner.action.score, new Object[0])), "un1", user);
                return;
            }
        }
        if (user != null && user.f19306id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            this.messageText = LocaleController.formatString("ActionYouScoredInGame", R.string.ActionYouScoredInGame, LocaleController.formatPluralString("Points", this.messageOwner.action.score, new Object[0]));
        } else {
            this.messageText = replaceWithLink(LocaleController.formatString("ActionUserScoredInGame", R.string.ActionUserScoredInGame, LocaleController.formatPluralString("Points", this.messageOwner.action.score, new Object[0])), "un1", user);
        }
        this.messageText = replaceWithLink(this.messageText, "un2", tL_game);
    }

    public void generateLayout(org.telegram.tgnet.TLRPC.User r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.generateLayout(org.telegram.tgnet.TLRPC$User):void");
    }

    public void generateLinkDescription() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.generateLinkDescription():void");
    }

    public void generatePaymentSentMessageText(TLRPC.User user, boolean z4) {
        String str;
        String str2;
        if (user == null) {
            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(getDialogId()));
        }
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else {
            str = "";
        }
        try {
            if ("XTR".equals(this.messageOwner.action.currency)) {
                str2 = "XTR " + this.messageOwner.action.total_amount;
            } else {
                LocaleController localeController = LocaleController.getInstance();
                TLRPC.MessageAction messageAction = this.messageOwner.action;
                str2 = localeController.formatCurrencyString(messageAction.total_amount, messageAction.currency);
            }
        } catch (Exception e) {
            FileLog.e(e);
            str2 = "<error>";
        }
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null && (getMedia(messageObject) instanceof TLRPC.TL_messageMediaInvoice)) {
            TLRPC.MessageAction messageAction2 = this.messageOwner.action;
            if (messageAction2.subscription_until_date != 0) {
                if (z4) {
                    this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidMeSubscription, str, str2, getMedia(this.replyMessageObject).title, LocaleController.formatDateTime(this.messageOwner.action.subscription_until_date, false));
                } else {
                    this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidSubscription, str2, str, getMedia(this.replyMessageObject).title, LocaleController.formatDateTime(this.messageOwner.action.subscription_until_date, false));
                }
            } else if (messageAction2.recurring_init && !z4) {
                this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidRecurrent, str2, str, getMedia(this.replyMessageObject).title);
            } else {
                this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaid, str2, str, getMedia(this.replyMessageObject).title);
            }
        } else {
            TLRPC.MessageAction messageAction3 = this.messageOwner.action;
            int i10 = messageAction3.subscription_until_date;
            if (i10 != 0) {
                if (z4) {
                    this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidMeNoItemSubscription, str, str2, LocaleController.formatDateTime(i10, false));
                } else {
                    this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidSubscriptionNoItem, str2, str, LocaleController.formatDateTime(i10, false));
                }
            } else if (messageAction3.recurring_init && !z4) {
                this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidNoItemRecurrent, str2, str);
            } else {
                this.messageText = LocaleController.formatString(R.string.PaymentSuccessfullyPaidNoItem, str2, str);
            }
        }
        this.messageText = lh.ja.Q0(this.messageText);
    }

    public void generatePinMessageText(TLRPC.User user, TLRPC.Chat chat) {
        boolean z4;
        String userName;
        if (user == null && chat == 0) {
            if (isFromUser()) {
                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
            }
            if (user == null) {
                TLRPC.Peer peer = this.messageOwner.peer_id;
                if (peer instanceof TLRPC.TL_peerChannel) {
                    chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.peer_id.channel_id));
                } else if (peer instanceof TLRPC.TL_peerChat) {
                    chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.peer_id.chat_id));
                }
            }
        }
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (!(message instanceof TLRPC.TL_messageEmpty) && !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                if (messageObject.isMusic()) {
                    String string = LocaleController.getString(R.string.ActionPinnedMusic);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string, "un1", user);
                    return;
                } else if (this.replyMessageObject.isVideo()) {
                    String string2 = LocaleController.getString(R.string.ActionPinnedVideo);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string2, "un1", user);
                    return;
                } else if (this.replyMessageObject.isGif()) {
                    String string3 = LocaleController.getString(R.string.ActionPinnedGif);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string3, "un1", user);
                    return;
                } else if (this.replyMessageObject.isVoice()) {
                    String string4 = LocaleController.getString(R.string.ActionPinnedVoice);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string4, "un1", user);
                    return;
                } else if (this.replyMessageObject.isRoundVideo()) {
                    String string5 = LocaleController.getString(R.string.ActionPinnedRound);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string5, "un1", user);
                    return;
                } else if ((this.replyMessageObject.isSticker() || this.replyMessageObject.isAnimatedSticker()) && !this.replyMessageObject.isAnimatedEmoji()) {
                    String string6 = LocaleController.getString(R.string.ActionPinnedSticker);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string6, "un1", user);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaDocument) {
                    String string7 = LocaleController.getString(R.string.ActionPinnedFile);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string7, "un1", user);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaGeo) {
                    String string8 = LocaleController.getString(R.string.ActionPinnedGeo);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string8, "un1", user);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaGeoLive) {
                    String string9 = LocaleController.getString(R.string.ActionPinnedGeoLive);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string9, "un1", user);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaContact) {
                    String string10 = LocaleController.getString(R.string.ActionPinnedContact);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string10, "un1", user);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaPoll) {
                    if (((TLRPC.TL_messageMediaPoll) getMedia(this.replyMessageObject)).poll.quiz) {
                        String string11 = LocaleController.getString(R.string.ActionPinnedQuiz);
                        if (user == null) {
                            user = chat;
                        }
                        this.messageText = replaceWithLink(string11, "un1", user);
                        return;
                    }
                    String string12 = LocaleController.getString(R.string.ActionPinnedPoll);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string12, "un1", user);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaPhoto) {
                    String string13 = LocaleController.getString(R.string.ActionPinnedPhoto);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string13, "un1", user);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaPaidMedia) {
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) getMedia(this.replyMessageObject);
                    if (chat != 0) {
                        userName = chat.title;
                    } else {
                        userName = UserObject.getUserName(user);
                    }
                    this.messageText = LocaleController.formatPluralString("NotificationPinnedPaidMedia", (int) tL_messageMediaPaidMedia.stars_amount, userName);
                    return;
                } else if (getMedia(this.replyMessageObject) instanceof TLRPC.TL_messageMediaGame) {
                    int i10 = R.string.ActionPinnedGame;
                    String formatString = LocaleController.formatString("ActionPinnedGame", i10, "🎮 " + getMedia(this.replyMessageObject).game.title);
                    if (user == null) {
                        user = chat;
                    }
                    CharSequence replaceWithLink = replaceWithLink(formatString, "un1", user);
                    this.messageText = replaceWithLink;
                    this.messageText = Emoji.replaceEmoji(replaceWithLink, org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt(), false);
                    return;
                } else {
                    CharSequence charSequence = this.replyMessageObject.messageText;
                    if (charSequence != null && charSequence.length() > 0) {
                        CharSequence cloneSpans = org.telegram.ui.Components.u5.cloneSpans(this.replyMessageObject.messageText);
                        if (cloneSpans.length() > 20) {
                            cloneSpans = cloneSpans.subSequence(0, 20);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        SpannableStringBuilder replaceEmoji = Emoji.replaceEmoji(cloneSpans, org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt(), true);
                        MessageObject messageObject2 = this.replyMessageObject;
                        if (messageObject2 != null && messageObject2.messageOwner != null) {
                            replaceEmoji = messageObject2.replaceAnimatedEmoji(replaceEmoji, org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt());
                        }
                        MediaDataController.addTextStyleRuns(this.replyMessageObject, (Spannable) replaceEmoji);
                        if (z4) {
                            if (replaceEmoji instanceof SpannableStringBuilder) {
                                ((SpannableStringBuilder) replaceEmoji).append((CharSequence) "...");
                            } else if (replaceEmoji != null) {
                                replaceEmoji = new SpannableStringBuilder(replaceEmoji).append((CharSequence) "...");
                            }
                        }
                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.ActionPinnedText), replaceEmoji);
                        if (user == null) {
                            user = chat;
                        }
                        this.messageText = replaceWithLink(formatSpannable, "un1", user);
                        return;
                    }
                    String string14 = LocaleController.getString(R.string.ActionPinnedNoText);
                    if (user == null) {
                        user = chat;
                    }
                    this.messageText = replaceWithLink(string14, "un1", user);
                    return;
                }
            }
        }
        String string15 = LocaleController.getString(R.string.ActionPinnedNoText);
        if (user == null) {
            user = chat;
        }
        this.messageText = replaceWithLink(string15, "un1", user);
    }

    public void generateThumbs(boolean z4) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        ArrayList<TLRPC.PhotoSize> arrayList3;
        TL_iv.RichMessage richMessage;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        ArrayList<TLRPC.PhotoSize> arrayList5;
        ArrayList<TLRPC.PhotoSize> arrayList6;
        ArrayList<TLRPC.PhotoSize> arrayList7;
        ArrayList<TLRPC.PhotoSize> arrayList8;
        ArrayList<TLRPC.PhotoSize> arrayList9;
        ArrayList<TLRPC.PhotoSize> arrayList10;
        ArrayList<TLRPC.PhotoSize> arrayList11;
        if (hasExtendedMediaPreview()) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.messageOwner.media.extended_media.get(0);
            if (!z4) {
                this.photoThumbs = new ArrayList<>(Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            } else {
                updatePhotoSizeLocations(this.photoThumbs, Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            }
            this.photoThumbsObject = this.messageOwner;
            if (this.strippedThumb == null) {
                createStrippedThumb();
                return;
            }
            return;
        }
        TLRPC.Message message = this.messageOwner;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                TLRPC.Photo photo = messageAction.photo;
                if (!z4) {
                    this.photoThumbs = new ArrayList<>(photo.sizes);
                } else {
                    ArrayList<TLRPC.PhotoSize> arrayList12 = this.photoThumbs;
                    if (arrayList12 != null && !arrayList12.isEmpty()) {
                        for (int i10 = 0; i10 < this.photoThumbs.size(); i10++) {
                            TLRPC.PhotoSize photoSize = this.photoThumbs.get(i10);
                            int i11 = 0;
                            while (true) {
                                if (i11 < photo.sizes.size()) {
                                    TLRPC.PhotoSize photoSize2 = photo.sizes.get(i11);
                                    if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && photoSize2.type.equals(photoSize.type)) {
                                        photoSize.location = photoSize2.location;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                }
                if (photo.dc_id != 0 && (arrayList11 = this.photoThumbs) != null) {
                    int size = arrayList11.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        TLRPC.FileLocation fileLocation = this.photoThumbs.get(i12).location;
                        if (fileLocation != null) {
                            fileLocation.dc_id = photo.dc_id;
                            fileLocation.file_reference = photo.file_reference;
                        }
                    }
                }
                this.photoThumbsObject = this.messageOwner.action.photo;
            }
        } else if (this.emojiAnimatedSticker == null && this.emojiAnimatedStickerId == null) {
            if (getMedia(message) != null && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaEmpty)) {
                if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo2 = getMedia(this.messageOwner).photo;
                    if (z4 && ((arrayList10 = this.photoThumbs) == null || arrayList10.size() == photo2.sizes.size())) {
                        ArrayList<TLRPC.PhotoSize> arrayList13 = this.photoThumbs;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            for (int i13 = 0; i13 < this.photoThumbs.size(); i13++) {
                                TLRPC.PhotoSize photoSize3 = this.photoThumbs.get(i13);
                                if (photoSize3 != null) {
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= photo2.sizes.size()) {
                                            break;
                                        }
                                        TLRPC.PhotoSize photoSize4 = photo2.sizes.get(i14);
                                        if (photoSize4 != null && !(photoSize4 instanceof TLRPC.TL_photoSizeEmpty)) {
                                            if (photoSize4.type.equals(photoSize3.type)) {
                                                photoSize3.location = photoSize4.location;
                                                break;
                                            } else if ("s".equals(photoSize3.type) && (photoSize4 instanceof TLRPC.TL_photoStrippedSize)) {
                                                this.photoThumbs.set(i13, photoSize4);
                                                break;
                                            }
                                        }
                                        i14++;
                                    }
                                }
                            }
                        }
                    } else {
                        this.photoThumbs = new ArrayList<>(photo2.sizes);
                    }
                    this.photoThumbsObject = getMedia(this.messageOwner).photo;
                    return;
                } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.Photo photo3 = ((TLRPC.TL_messageMediaDocument) getMedia(this.messageOwner)).video_cover;
                    if (photo3 != null) {
                        if (z4 && ((arrayList9 = this.photoThumbs) == null || arrayList9.size() == photo3.sizes.size())) {
                            ArrayList<TLRPC.PhotoSize> arrayList14 = this.photoThumbs;
                            if (arrayList14 != null && !arrayList14.isEmpty()) {
                                for (int i15 = 0; i15 < this.photoThumbs.size(); i15++) {
                                    TLRPC.PhotoSize photoSize5 = this.photoThumbs.get(i15);
                                    if (photoSize5 != null) {
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= photo3.sizes.size()) {
                                                break;
                                            }
                                            TLRPC.PhotoSize photoSize6 = photo3.sizes.get(i16);
                                            if (photoSize6 != null && !(photoSize6 instanceof TLRPC.TL_photoSizeEmpty)) {
                                                if (photoSize6.type.equals(photoSize5.type)) {
                                                    photoSize5.location = photoSize6.location;
                                                    break;
                                                } else if ("s".equals(photoSize5.type) && (photoSize6 instanceof TLRPC.TL_photoStrippedSize)) {
                                                    this.photoThumbs.set(i15, photoSize6);
                                                    break;
                                                }
                                            }
                                            i16++;
                                        }
                                    }
                                }
                            }
                        } else {
                            this.photoThumbs = new ArrayList<>(photo3.sizes);
                        }
                        this.photoThumbsObject = photo3;
                        return;
                    }
                    TLRPC.Document document = getDocument();
                    if (isDocumentHasThumb(document)) {
                        if (z4 && (arrayList8 = this.photoThumbs) != null) {
                            if (!arrayList8.isEmpty()) {
                                updatePhotoSizeLocations(this.photoThumbs, document.thumbs);
                            }
                        } else {
                            ArrayList<TLRPC.PhotoSize> arrayList15 = new ArrayList<>();
                            this.photoThumbs = arrayList15;
                            arrayList15.addAll(document.thumbs);
                        }
                        this.photoThumbsObject = document;
                        return;
                    }
                    return;
                } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
                    TLRPC.Document document2 = getMedia(this.messageOwner).game.document;
                    if (document2 != null && isDocumentHasThumb(document2)) {
                        if (!z4) {
                            ArrayList<TLRPC.PhotoSize> arrayList16 = new ArrayList<>();
                            this.photoThumbs = arrayList16;
                            arrayList16.addAll(document2.thumbs);
                        } else {
                            ArrayList<TLRPC.PhotoSize> arrayList17 = this.photoThumbs;
                            if (arrayList17 != null && !arrayList17.isEmpty()) {
                                updatePhotoSizeLocations(this.photoThumbs, document2.thumbs);
                            }
                        }
                        this.photoThumbsObject = document2;
                    }
                    TLRPC.Photo photo4 = getMedia(this.messageOwner).game.photo;
                    if (photo4 != null) {
                        if (z4 && (arrayList7 = this.photoThumbs2) != null) {
                            if (!arrayList7.isEmpty()) {
                                updatePhotoSizeLocations(this.photoThumbs2, photo4.sizes);
                            }
                        } else {
                            this.photoThumbs2 = new ArrayList<>(photo4.sizes);
                        }
                        this.photoThumbsObject2 = photo4;
                    }
                    if (this.photoThumbs == null && (arrayList6 = this.photoThumbs2) != null) {
                        this.photoThumbs = arrayList6;
                        this.photoThumbs2 = null;
                        this.photoThumbsObject = this.photoThumbsObject2;
                        this.photoThumbsObject2 = null;
                        return;
                    }
                    return;
                } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) {
                    TLRPC.Photo photo5 = getMedia(this.messageOwner).webpage.photo;
                    TLRPC.Document document3 = getMedia(this.messageOwner).webpage.document;
                    if (photo5 != null) {
                        if (z4 && (arrayList5 = this.photoThumbs) != null) {
                            if (!arrayList5.isEmpty()) {
                                updatePhotoSizeLocations(this.photoThumbs, photo5.sizes);
                            }
                        } else {
                            this.photoThumbs = new ArrayList<>(photo5.sizes);
                        }
                        this.photoThumbsObject = photo5;
                        return;
                    } else if (document3 != null && isDocumentHasThumb(document3)) {
                        if (!z4) {
                            ArrayList<TLRPC.PhotoSize> arrayList18 = new ArrayList<>();
                            this.photoThumbs = arrayList18;
                            arrayList18.addAll(document3.thumbs);
                        } else {
                            ArrayList<TLRPC.PhotoSize> arrayList19 = this.photoThumbs;
                            if (arrayList19 != null && !arrayList19.isEmpty()) {
                                updatePhotoSizeLocations(this.photoThumbs, document3.thumbs);
                            }
                        }
                        this.photoThumbsObject = document3;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            TLRPC.Message message2 = this.messageOwner;
            if (message2 != null && (richMessage = message2.rich_message) != null) {
                TLRPC.Document findVideo = findVideo(richMessage);
                TLRPC.Photo findPhoto = findPhoto(this.messageOwner.rich_message);
                if (findVideo != null) {
                    if (isDocumentHasThumb(findVideo)) {
                        if (!z4) {
                            ArrayList<TLRPC.PhotoSize> arrayList20 = new ArrayList<>();
                            this.photoThumbs = arrayList20;
                            arrayList20.addAll(findVideo.thumbs);
                        } else {
                            ArrayList<TLRPC.PhotoSize> arrayList21 = this.photoThumbs;
                            if (arrayList21 != null && !arrayList21.isEmpty()) {
                                updatePhotoSizeLocations(this.photoThumbs, findVideo.thumbs);
                            }
                        }
                        this.photoThumbsObject = findVideo;
                        return;
                    }
                    return;
                } else if (findPhoto != null) {
                    if (z4 && (arrayList4 = this.photoThumbs) != null) {
                        if (!arrayList4.isEmpty()) {
                            updatePhotoSizeLocations(this.photoThumbs, findPhoto.sizes);
                        }
                    } else {
                        this.photoThumbs = new ArrayList<>(findPhoto.sizes);
                    }
                    this.photoThumbsObject = findPhoto;
                    if (this.strippedThumb == null) {
                        createStrippedThumb();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            TLRPC.MessageMedia messageMedia = this.sponsoredMedia;
            if (messageMedia != null) {
                TLRPC.Photo photo6 = messageMedia.photo;
                TLRPC.Document document4 = messageMedia.document;
                if (photo6 != null) {
                    if (z4 && (arrayList3 = this.photoThumbs) != null) {
                        if (!arrayList3.isEmpty()) {
                            updatePhotoSizeLocations(this.photoThumbs, photo6.sizes);
                        }
                    } else {
                        this.photoThumbs = new ArrayList<>(photo6.sizes);
                    }
                    this.photoThumbsObject = photo6;
                } else if (document4 != null && isDocumentHasThumb(document4)) {
                    if (!z4) {
                        ArrayList<TLRPC.PhotoSize> arrayList22 = new ArrayList<>();
                        this.photoThumbs = arrayList22;
                        arrayList22.addAll(document4.thumbs);
                    } else {
                        ArrayList<TLRPC.PhotoSize> arrayList23 = this.photoThumbs;
                        if (arrayList23 != null && !arrayList23.isEmpty()) {
                            updatePhotoSizeLocations(this.photoThumbs, document4.thumbs);
                        }
                    }
                    this.photoThumbsObject = document4;
                }
            } else if (this.sponsoredPhoto != null) {
                if (z4 && (arrayList2 = this.photoThumbs) != null) {
                    if (!arrayList2.isEmpty()) {
                        updatePhotoSizeLocations(this.photoThumbs, this.sponsoredPhoto.sizes);
                    }
                } else {
                    this.photoThumbs = new ArrayList<>(this.sponsoredPhoto.sizes);
                }
                this.photoThumbsObject = this.sponsoredPhoto;
                if (this.strippedThumb == null) {
                    createStrippedThumb();
                }
            }
        } else if (TextUtils.isEmpty(this.emojiAnimatedStickerColor) && isDocumentHasThumb(this.emojiAnimatedSticker)) {
            if (z4 && (arrayList = this.photoThumbs) != null) {
                if (!arrayList.isEmpty()) {
                    updatePhotoSizeLocations(this.photoThumbs, this.emojiAnimatedSticker.thumbs);
                }
            } else {
                ArrayList<TLRPC.PhotoSize> arrayList24 = new ArrayList<>();
                this.photoThumbs = arrayList24;
                arrayList24.addAll(this.emojiAnimatedSticker.thumbs);
            }
            this.photoThumbsObject = this.emojiAnimatedSticker;
        }
    }

    public int getApproximateHeight() {
        return getApproximateHeight(false);
    }

    public int getApproximateHeightCached() {
        Integer num = this.cachedApproximateHeight;
        if (num != null) {
            return num.intValue();
        }
        int approximateHeight = getApproximateHeight(true);
        this.cachedApproximateHeight = Integer.valueOf(approximateHeight);
        return approximateHeight;
    }

    public String getArtworkUrl(boolean z4) {
        return getArtworkUrl(getDocument(), z4);
    }

    public long getChannelId() {
        return getChannelId(this.messageOwner);
    }

    public long getChatId() {
        TLRPC.Peer peer = this.messageOwner.peer_id;
        if (peer instanceof TLRPC.TL_peerChat) {
            return peer.chat_id;
        }
        if (peer instanceof TLRPC.TL_peerChannel) {
            return peer.channel_id;
        }
        return 0L;
    }

    public int getChatMode() {
        if (this.scheduled) {
            return 1;
        }
        if (isWelcomeMessage()) {
            return 9;
        }
        if (isQuickReply()) {
            return 5;
        }
        return 0;
    }

    public ArrayList<mg.q0> getChoosenReactions() {
        ArrayList<mg.q0> arrayList = new ArrayList<>();
        if (this.messageOwner.reactions != null) {
            for (int i10 = 0; i10 < this.messageOwner.reactions.results.size(); i10++) {
                if (this.messageOwner.reactions.results.get(i10).chosen) {
                    arrayList.add(mg.q0.d(this.messageOwner.reactions.results.get(i10).reaction));
                }
            }
        }
        return arrayList;
    }

    public long getDialogId() {
        return getDialogId(this.messageOwner);
    }

    public String getDiceEmoji() {
        if (isDice()) {
            TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) getMedia(this.messageOwner);
            if (TextUtils.isEmpty(tL_messageMediaDice.emoticon)) {
                return "🎲";
            }
            return tL_messageMediaDice.emoticon.replace("️", "");
        }
        return null;
    }

    public int getDiceValue() {
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDice) {
            return ((TLRPC.TL_messageMediaDice) getMedia(this.messageOwner)).value;
        }
        return -1;
    }

    public TL_iv.RichMessage getDisplayRichMessage() {
        TL_iv.RichMessage richMessage;
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return null;
        }
        if (this.translated && (richMessage = message.translatedRichMessage) != null) {
            return richMessage;
        }
        return message.rich_message;
    }

    public TLRPC.Document getDocument() {
        g71 g71Var;
        TLRPC.Document document = this.emojiAnimatedSticker;
        if (document != null) {
            return document;
        }
        if (hasVideoQualities() && (g71Var = this.highestQuality) != null) {
            return g71Var.f25078g;
        }
        return getDocument(this.messageOwner);
    }

    public TLRPC.Document getDocumentFast() {
        TLRPC.Document document = this.emojiAnimatedSticker;
        if (document != null) {
            return document;
        }
        return getDocument(this.messageOwner);
    }

    public String getDocumentName() {
        return FileLoader.getDocumentFileName(getDocument());
    }

    public double getDuration() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        double d = this.attributeDuration;
        if (d > 0.0d) {
            return d;
        }
        TLRPC.Document document = getDocument();
        if (document == null && this.type == 23 && (storyItem = getMedia(this.messageOwner).storyItem) != null && (messageMedia = storyItem.media) != null) {
            document = messageMedia.document;
        }
        if (document == null) {
            return 0.0d;
        }
        int i10 = this.audioPlayerDuration;
        if (i10 > 0) {
            return i10;
        }
        for (int i11 = 0; i11 < document.attributes.size(); i11++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                double d10 = documentAttribute.duration;
                this.attributeDuration = d10;
                return d10;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                double d11 = documentAttribute.duration;
                this.attributeDuration = d11;
                return d11;
            }
        }
        return this.audioPlayerDuration;
    }

    public int getEditedSuggestionFlags() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.getEditedSuggestionFlags():int");
    }

    public TLRPC.TL_availableEffect getEffect() {
        TLRPC.Message message = this.messageOwner;
        if (message != null && (message.flags2 & 4) != 0) {
            return MessagesController.getInstance(this.currentAccount).getEffect(this.messageOwner.effect);
        }
        return null;
    }

    public long getEffectId() {
        TLRPC.Message message = this.messageOwner;
        if (message != null && (message.flags2 & 4) != 0) {
            return message.effect;
        }
        return 0L;
    }

    public int getEmojiOnlyCount() {
        return this.emojiOnlyCount;
    }

    public ArrayList<TLRPC.MessageEntity> getEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return null;
        }
        if (this.summarized) {
            if (this.translated && (tL_textWithEntities = message.translatedSummaryText) != null) {
                return tL_textWithEntities.entities;
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = message.summaryText;
            if (tL_textWithEntities2 == null) {
                return null;
            }
            return tL_textWithEntities2.entities;
        } else if (this.translated) {
            if (message.voiceTranscriptionOpen) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = message.translatedVoiceTranscription;
                if (tL_textWithEntities3 == null) {
                    return null;
                }
                return tL_textWithEntities3.entities;
            }
            TLRPC.TL_textWithEntities tL_textWithEntities4 = message.translatedText;
            if (tL_textWithEntities4 == null) {
                return null;
            }
            return tL_textWithEntities4.entities;
        } else {
            return message.entities;
        }
    }

    public int getEphemeralId() {
        if (isEphemeral()) {
            return ephemeralMessageIdUnpack(this.messageOwner.f19180id);
        }
        return 0;
    }

    public long getEphemeralReceiverBotId() {
        TLRPC.Message message = this.messageOwner;
        if (message != null) {
            return message.ephemeralReceiverBotId;
        }
        return 0L;
    }

    public String getExtension() {
        String str;
        String fileName = getFileName();
        int lastIndexOf = fileName.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = fileName.substring(lastIndexOf + 1);
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str = getDocument().mime_type;
        }
        if (str == null) {
            str = "";
        }
        return str.toUpperCase();
    }

    public TLRPC.TL_factCheck getFactCheck() {
        return FactCheckController.getInstance(this.currentAccount).getFactCheck(this);
    }

    public CharSequence getFactCheckText() {
        if (!isFactCheckable()) {
            return null;
        }
        TLRPC.TL_factCheck factCheck = getFactCheck();
        if (factCheck != null && factCheck.text != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(factCheck.text.text);
            addEntitiesToText(spannableStringBuilder, factCheck.text.entities, isOutOwner(), false, false, false);
            this.factCheckText = spannableStringBuilder;
            return spannableStringBuilder;
        }
        this.factCheckText = null;
        return null;
    }

    public String getFileName() {
        if (getDocument() != null) {
            return getFileName(getDocument());
        }
        return getFileName(this.messageOwner);
    }

    public String getFileNameFast() {
        if (getDocumentFast() != null) {
            return getFileName(getDocumentFast());
        }
        return getFileName(this.messageOwner);
    }

    public Long getForwardedFromId() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message = this.messageOwner;
        if (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) {
            return null;
        }
        return Long.valueOf(DialogObject.getPeerDialogId(peer));
    }

    public TLObject getForwardedFromPeerObject() {
        Long forwardedFromId = getForwardedFromId();
        if (forwardedFromId == null) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).getUserOrChat(forwardedFromId.longValue());
    }

    public String getForwardedName() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
        if (messageFwdHeader != null) {
            TLRPC.Peer peer = messageFwdHeader.from_id;
            if (peer instanceof TLRPC.TL_peerChannel) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.fwd_from.from_id.channel_id));
                if (chat != null) {
                    return chat.title;
                }
                return null;
            } else if (peer instanceof TLRPC.TL_peerChat) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.fwd_from.from_id.chat_id));
                if (chat2 != null) {
                    return chat2.title;
                }
                return null;
            } else if (peer instanceof TLRPC.TL_peerUser) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.fwd_from.from_id.user_id));
                if (user != null) {
                    return UserObject.getUserName(user);
                }
                return null;
            } else {
                String str = messageFwdHeader.from_name;
                if (str != null) {
                    return str;
                }
                return null;
            }
        }
        return null;
    }

    public TLRPC.Peer getFromPeer() {
        TLRPC.Message message = this.messageOwner;
        if (message != null) {
            return message.from_id;
        }
        return null;
    }

    public TLObject getFromPeerObject() {
        TLRPC.Message message = this.messageOwner;
        if (message != null) {
            TLRPC.Peer peer = message.from_id;
            if (!(peer instanceof TLRPC.TL_peerChannel_layer131) && !(peer instanceof TLRPC.TL_peerChannel)) {
                if (!(peer instanceof TLRPC.TL_peerUser_layer131) && !(peer instanceof TLRPC.TL_peerUser)) {
                    if ((peer instanceof TLRPC.TL_peerChat_layer131) || (peer instanceof TLRPC.TL_peerChat)) {
                        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.from_id.chat_id));
                    }
                    return null;
                }
                return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
            }
            return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.from_id.channel_id));
        }
        return null;
    }

    public long getGroupId() {
        long j10 = this.localGroupId;
        if (j10 != 0) {
            return j10;
        }
        return getGroupIdForUse();
    }

    public long getGroupIdForUse() {
        long j10 = this.localSentGroupId;
        if (j10 != 0) {
            return j10;
        }
        return this.messageOwner.grouped_id;
    }

    public int getId() {
        TLRPC.Message message = this.messageOwner;
        int i10 = message.ephemeralAnchorMsgId;
        if (i10 != 0) {
            return i10;
        }
        return message.f19180id;
    }

    public BotInlineKeyboard.Source getInlineBotButtons() {
        return this.inlineKeyboardSource;
    }

    public int getLastLineWidth() {
        RichMessageLayout richMessageLayout = this.richLayout;
        if (richMessageLayout != null) {
            return richMessageLayout.getLastLineWidth();
        }
        return this.lastLineWidth;
    }

    public int getMaxMessageTextWidth() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.getMaxMessageTextWidth():int");
    }

    public int getMediaExistanceFlags() {
        boolean z4 = this.attachPathExists;
        if (this.mediaExists) {
            return (z4 ? 1 : 0) | 2;
        }
        return z4 ? 1 : 0;
    }

    public java.lang.CharSequence getMediaTitle(org.telegram.tgnet.TLRPC.MessageMedia r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.getMediaTitle(org.telegram.tgnet.TLRPC$MessageMedia):java.lang.CharSequence");
    }

    public int getMediaType() {
        if (isVideo()) {
            return 2;
        }
        if (isVoice()) {
            return 1;
        }
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) {
            return 3;
        }
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
            return 0;
        }
        return 4;
    }

    public CharSequence getMessageTextToTranslate(GroupedMessages groupedMessages, int[] iArr) {
        String str;
        if (this.translated || this.isRestrictedMessage) {
            return null;
        }
        if (this.summarized) {
            return this.messageText;
        }
        int i10 = this.type;
        if (i10 == 19 || i10 == 15 || i10 == 13) {
            return null;
        }
        CharSequence B8 = zn.B8(this, groupedMessages, iArr);
        if (B8 == null && isPoll()) {
            try {
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) this.messageOwner.media).poll;
                StringBuilder sb = new StringBuilder(poll.question.text);
                sb.append("\n");
                ArrayList<TLRPC.PollAnswer> arrayList = poll.answers;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.PollAnswer pollAnswer = arrayList.get(i11);
                    i11++;
                    sb.append("\n🔘 ");
                    TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                    if (tL_textWithEntities == null) {
                        str = "";
                    } else {
                        str = tL_textWithEntities.text;
                    }
                    sb.append(str);
                }
                B8 = sb.toString();
            } catch (Exception unused) {
            }
        }
        if (B8 == null && isMediaEmpty(this.messageOwner)) {
            B8 = zn.D8(this, false, 0L);
        }
        if (B8 != null && Emoji.fullyConsistsOfEmojis(B8)) {
            return null;
        }
        return B8;
    }

    public String getMimeType() {
        TLRPC.Document document = getDocument();
        if (document != null) {
            return document.mime_type;
        }
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) {
            TLRPC.WebDocument webDocument = ((TLRPC.TL_messageMediaInvoice) getMedia(this.messageOwner)).webPhoto;
            if (webDocument != null) {
                return webDocument.mime_type;
            }
            return "";
        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
            return "image/jpeg";
        } else {
            if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage.photo != null) {
                return "image/jpeg";
            }
            return "";
        }
    }

    public long getMonoForumTopicId() {
        return getMonoForumTopicId(this.messageOwner);
    }

    public String getMusicAuthor() {
        return getMusicAuthor(true);
    }

    public String getMusicTitle() {
        return getMusicTitle(true);
    }

    public Long getMyPaidReactionPeer() {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.Message message = this.messageOwner;
        if (message == null || (tL_messageReactions = message.reactions) == null || (arrayList = tL_messageReactions.top_reactors) == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.MessageReactor messageReactor = arrayList.get(i10);
            i10++;
            TLRPC.MessageReactor messageReactor2 = messageReactor;
            if (messageReactor2 != null && messageReactor2.my) {
                if (messageReactor2.anonymous) {
                    return 2666000L;
                }
                TLRPC.Peer peer = messageReactor2.peer_id;
                if (peer != null) {
                    return Long.valueOf(DialogObject.getPeerDialogId(peer));
                }
            }
        }
        return null;
    }

    public TLObject getPeerObject() {
        TLRPC.Message message = this.messageOwner;
        if (message != null) {
            TLRPC.Peer peer = message.peer_id;
            if (!(peer instanceof TLRPC.TL_peerChannel_layer131) && !(peer instanceof TLRPC.TL_peerChannel)) {
                if (!(peer instanceof TLRPC.TL_peerUser_layer131) && !(peer instanceof TLRPC.TL_peerUser)) {
                    if ((peer instanceof TLRPC.TL_peerChat_layer131) || (peer instanceof TLRPC.TL_peerChat)) {
                        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.peer_id.chat_id));
                    }
                    return null;
                }
                return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.peer_id.user_id));
            }
            return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.peer_id.channel_id));
        }
        return null;
    }

    public TLRPC.Photo getPhoto() {
        return getPhoto(this.messageOwner);
    }

    public long getPollHash() {
        TLRPC.Message message = this.messageOwner;
        if (message != null && this.type == 17) {
            TLRPC.MessageMedia media = getMedia(message);
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) media).poll.hash;
            }
        }
        return 0L;
    }

    public long getPollId() {
        if (this.type != 17) {
            return 0L;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaPoll)) {
            return 0L;
        }
        return ((TLRPC.TL_messageMediaPoll) media).poll.f19185id;
    }

    public TLRPC.VideoSize getPremiumStickerAnimation() {
        return getPremiumStickerAnimation(getDocument());
    }

    public float getProgress() {
        return 0.0f;
    }

    public String getQuickReplyDisplayName() {
        String quickReplyName = getQuickReplyName();
        if (quickReplyName != null) {
            return quickReplyName;
        }
        uf.o1 c3 = uf.p1.f(this.currentAccount).c(getQuickReplyId());
        if (c3 != null) {
            return c3.f45472b;
        }
        return "";
    }

    public TLRPC.MessagePeerReaction getRandomUnreadReaction() {
        ArrayList<TLRPC.MessagePeerReaction> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions = this.messageOwner.reactions;
        if (tL_messageReactions != null && (arrayList = tL_messageReactions.recent_reactions) != null && !arrayList.isEmpty()) {
            return this.messageOwner.reactions.recent_reactions.get(0);
        }
        return null;
    }

    public int getRealId() {
        TLRPC.Message message = this.messageOwner;
        int i10 = message.realId;
        if (i10 != 0) {
            return i10;
        }
        return message.f19180id;
    }

    public int getRepliesCount() {
        TLRPC.MessageReplies messageReplies = this.messageOwner.replies;
        if (messageReplies != null) {
            return messageReplies.replies;
        }
        return 0;
    }

    public int getReplyAnyMsgId() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader != null) {
            int i10 = messageReplyHeader.reply_to_top_id;
            if (i10 != 0) {
                return i10;
            }
            return messageReplyHeader.reply_to_msg_id;
        }
        return 0;
    }

    public int getReplyMsgId() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader != null) {
            return messageReplyHeader.reply_to_msg_id;
        }
        return 0;
    }

    public CharSequence getReplyQuoteNameWithIcon() {
        CharSequence charSequence;
        boolean z4;
        CharSequence spannableStringBuilder;
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return "";
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        CharSequence charSequence2 = null;
        if (messageReplyHeader == null) {
            if (DialogObject.isChatDialog(getDialogId())) {
                charSequence = peerNameWithIcon(this.currentAccount, getDialogId());
            } else {
                spannableStringBuilder = peerNameWithIcon(this.currentAccount, getDialogId());
                charSequence2 = spannableStringBuilder;
                charSequence = null;
            }
        } else {
            if (messageReplyHeader.reply_from != null) {
                TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
                if (peer != null && DialogObject.getPeerDialogId(peer) == getDialogId()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.reply_to.reply_from;
                TLRPC.Peer peer2 = messageFwdHeader.from_id;
                if (peer2 != null) {
                    if (peer2 instanceof TLRPC.TL_peerUser) {
                        spannableStringBuilder = peerNameWithIcon(this.currentAccount, peer2, z4);
                        charSequence2 = spannableStringBuilder;
                        charSequence = null;
                    } else {
                        charSequence = peerNameWithIcon(this.currentAccount, peer2, z4);
                    }
                } else {
                    TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                    if (peer3 != null) {
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            spannableStringBuilder = peerNameWithIcon(this.currentAccount, peer3, z4);
                        } else {
                            charSequence = peerNameWithIcon(this.currentAccount, peer3, z4);
                        }
                    } else if (!TextUtils.isEmpty(messageFwdHeader.from_name)) {
                        if (z4) {
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
        TLRPC.Peer peer4 = this.messageOwner.reply_to.reply_to_peer_id;
        if (peer4 != null && DialogObject.getPeerDialogId(peer4) != getDialogId()) {
            TLRPC.Peer peer5 = this.messageOwner.reply_to.reply_to_peer_id;
            if (peer5 instanceof TLRPC.TL_peerUser) {
                charSequence2 = peerNameWithIcon(this.currentAccount, peer5, true);
            } else {
                charSequence = peerNameWithIcon(this.currentAccount, peer5);
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
        if (charSequence != null && charSequence2 != null) {
            return new SpannableStringBuilder(charSequence2).append((CharSequence) " ").append(charSequence);
        }
        if (charSequence != null) {
            return charSequence;
        }
        if (charSequence2 != null) {
            return charSequence2;
        }
        return LocaleController.getString(R.string.Loading);
    }

    public int getReplyTopMsgId() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader != null) {
            return messageReplyHeader.reply_to_top_id;
        }
        return 0;
    }

    public long getSavedDialogId() {
        return getSavedDialogId(UserConfig.getInstance(this.currentAccount).getClientUserId(), this.messageOwner);
    }

    public int getSecretTimeLeft() {
        TLRPC.Message message = this.messageOwner;
        int i10 = message.ttl;
        int i11 = message.destroyTime;
        if (i11 != 0) {
            return Math.max(0, i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
        }
        return i10;
    }

    public CharSequence getSecretTimeString() {
        String str;
        if (!isSecretMedia()) {
            return null;
        }
        if (this.messageOwner.ttl == Integer.MAX_VALUE) {
            if (this.secretOnceSpan == null) {
                this.secretOnceSpan = new SpannableString("v");
                lq lqVar = new lq(R.drawable.mini_viewonce, 0);
                lqVar.setTranslateX(-AndroidUtilities.dp(3.0f));
                lqVar.setWidth(AndroidUtilities.dp(13.0f));
                CharSequence charSequence = this.secretOnceSpan;
                ((Spannable) charSequence).setSpan(lqVar, 0, charSequence.length(), 33);
            }
            return TextUtils.concat(this.secretOnceSpan, "1");
        }
        int secretTimeLeft = getSecretTimeLeft();
        if (secretTimeLeft < 60) {
            str = android.support.v4.media.a.l(secretTimeLeft, "s");
        } else {
            str = (secretTimeLeft / 60) + "m";
        }
        if (this.secretPlaySpan == null) {
            this.secretPlaySpan = new SpannableString("p");
            lq lqVar2 = new lq(R.drawable.play_mini_video, 0);
            lqVar2.setTranslateX(AndroidUtilities.dp(1.0f));
            lqVar2.setWidth(AndroidUtilities.dp(13.0f));
            CharSequence charSequence2 = this.secretPlaySpan;
            ((Spannable) charSequence2).setSpan(lqVar2, 0, charSequence2.length(), 33);
        }
        return TextUtils.concat(this.secretPlaySpan, str);
    }

    public long getSenderId() {
        TLRPC.Peer peer;
        TLRPC.Message message = this.messageOwner;
        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long j10 = peer.user_id;
            if (j10 != 0) {
                TLRPC.Peer peer2 = messageFwdHeader.from_id;
                if (peer2 instanceof TLRPC.TL_peerUser) {
                    return peer2.user_id;
                }
                return j10;
            } else if (peer.channel_id != 0) {
                if (isSavedFromMegagroup()) {
                    TLRPC.Peer peer3 = this.messageOwner.fwd_from.from_id;
                    if (peer3 instanceof TLRPC.TL_peerUser) {
                        return peer3.user_id;
                    }
                }
                TLRPC.MessageFwdHeader messageFwdHeader2 = this.messageOwner.fwd_from;
                TLRPC.Peer peer4 = messageFwdHeader2.from_id;
                if (peer4 instanceof TLRPC.TL_peerChannel) {
                    return -peer4.channel_id;
                }
                if (peer4 instanceof TLRPC.TL_peerChat) {
                    return -peer4.chat_id;
                }
                return -messageFwdHeader2.saved_from_peer.channel_id;
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    TLRPC.Peer peer5 = messageFwdHeader.from_id;
                    if (peer5 instanceof TLRPC.TL_peerUser) {
                        return peer5.user_id;
                    }
                    if (peer5 instanceof TLRPC.TL_peerChannel) {
                        return -peer5.channel_id;
                    }
                    if (peer5 instanceof TLRPC.TL_peerChat) {
                        return -peer5.chat_id;
                    }
                    return -j11;
                }
            }
        } else {
            TLRPC.Peer peer6 = message.from_id;
            if (peer6 instanceof TLRPC.TL_peerUser) {
                return peer6.user_id;
            }
            if (peer6 instanceof TLRPC.TL_peerChannel) {
                return -peer6.channel_id;
            }
            if (peer6 instanceof TLRPC.TL_peerChat) {
                return -peer6.chat_id;
            }
            if (message.post) {
                return message.peer_id.channel_id;
            }
        }
        return 0L;
    }

    public long getSize() {
        g71 g71Var = this.highestQuality;
        if (g71Var != null) {
            return g71Var.f25078g.size;
        }
        g71 g71Var2 = this.thumbQuality;
        if (g71Var2 != null) {
            return g71Var2.f25078g.size;
        }
        g71 g71Var3 = this.cachedQuality;
        if (g71Var3 != null) {
            return g71Var3.f25078g.size;
        }
        return getMessageSize(this.messageOwner);
    }

    public long getStakedDiceAmount() {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome;
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if ((media instanceof TLRPC.TL_messageMediaDice) && (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) media).game_outcome) != null) {
            return tL_messages_emojiGameOutcome.stake_ton_amount;
        }
        return 0L;
    }

    public String getStickerChar() {
        TLRPC.Document document = getDocument();
        if (document != null) {
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
                i10++;
                TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                if (documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) {
                    return documentAttribute2.alt;
                }
            }
            return null;
        }
        return null;
    }

    public String getStickerEmoji() {
        TLRPC.Document document = getDocument();
        if (document == null) {
            return null;
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                String str = documentAttribute.alt;
                if (str != null && str.length() > 0) {
                    return documentAttribute.alt;
                }
                return null;
            }
        }
        return null;
    }

    public TLRPC.WebPage getStoryMentionWebpage() {
        if (!isStoryMention()) {
            return null;
        }
        TLRPC.WebPage webPage = this.storyMentionWebpage;
        if (webPage != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
        tL_webPage.type = "telegram_story";
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = new TLRPC.TL_webPageAttributeStory();
        tL_webPageAttributeStory.f19302id = this.messageOwner.media.f19181id;
        tL_webPageAttributeStory.peer = MessagesController.getInstance(this.currentAccount).getPeer(this.messageOwner.media.user_id);
        TL_stories.StoryItem storyItem = this.messageOwner.media.storyItem;
        if (storyItem != null) {
            tL_webPageAttributeStory.flags |= 1;
            tL_webPageAttributeStory.storyItem = storyItem;
        }
        tL_webPage.attributes.add(tL_webPageAttributeStory);
        this.storyMentionWebpage = tL_webPage;
        return tL_webPage;
    }

    public TextPaint getTextPaint() {
        boolean z4;
        if (this.emojiOnlyCount >= 1 && this.messageOwner != null && !hasNonEmojiEntities()) {
            int i10 = this.emojiOnlyCount;
            int i11 = this.animatedEmojiCount;
            if (i10 == i11) {
                z4 = true;
            } else {
                z4 = false;
            }
            switch (Math.max(i10, i11)) {
                case 0:
                case 1:
                case 2:
                    TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.f20252y2;
                    if (z4) {
                        return textPaintArr[0];
                    }
                    return textPaintArr[2];
                case 3:
                    TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.f20252y2;
                    if (z4) {
                        return textPaintArr2[1];
                    }
                    return textPaintArr2[3];
                case 4:
                    TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.j6.f20252y2;
                    if (z4) {
                        return textPaintArr3[2];
                    }
                    return textPaintArr3[4];
                case 5:
                    TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.j6.f20252y2;
                    if (z4) {
                        return textPaintArr4[3];
                    }
                    return textPaintArr4[5];
                case 6:
                    TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.j6.f20252y2;
                    if (z4) {
                        return textPaintArr5[4];
                    }
                    return textPaintArr5[5];
                default:
                    return org.telegram.ui.ActionBar.j6.f20252y2[5];
            }
        }
        return org.telegram.ui.ActionBar.j6.f20074o2;
    }

    public TLRPC.Photo getVideoCover() {
        TLRPC.WebPage webPage;
        TLRPC.MessageMedia media = getMedia(this);
        if (media instanceof TLRPC.TL_messageMediaDocument) {
            return ((TLRPC.TL_messageMediaDocument) media).video_cover;
        }
        if (media != null && (webPage = media.webpage) != null && webPage.video_cover_photo) {
            return webPage.photo;
        }
        return null;
    }

    public float getVideoSavedProgress() {
        String fileNameFast;
        String fileNameFast2;
        float f10 = 0.0f;
        if (this.cachedSavedTimestamp != null) {
            Drawable[] drawableArr = PhotoViewer.Q8;
            int duration = (int) getDuration();
            if (isEmbedVideo()) {
                fileNameFast2 = this.messageOwner.media.webpage.url;
            } else {
                fileNameFast2 = getFileNameFast();
            }
            if (!TextUtils.isEmpty(fileNameFast2) && duration >= 10) {
                uu0 uu0Var = (uu0) PhotoViewer.S8.get(fileNameFast2);
                if (this.forceSeekTo < 0.0f && uu0Var != null) {
                    float f11 = uu0Var.f38918a;
                    if (f11 > 0.0f && f11 < 0.999f) {
                        return f11;
                    }
                }
            }
            return 0.0f;
        }
        Drawable[] drawableArr2 = PhotoViewer.Q8;
        int duration2 = (int) getDuration();
        if (isEmbedVideo()) {
            fileNameFast = this.messageOwner.media.webpage.url;
        } else {
            fileNameFast = getFileNameFast();
        }
        if (!TextUtils.isEmpty(fileNameFast)) {
            if (duration2 >= 10) {
                uu0 uu0Var2 = (uu0) PhotoViewer.S8.get(fileNameFast);
                if (this.forceSeekTo < 0.0f && uu0Var2 != null) {
                    float f12 = uu0Var2.f38918a;
                    if (f12 > 0.0f && f12 < 0.999f) {
                        f10 = f12;
                    }
                }
            }
            if (duration2 >= 120 && this.forceSeekTo < 0.0f) {
                float f13 = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).getFloat(fileNameFast, -1.0f);
                if (f13 > 0.0f && f13 < 0.999f) {
                    f10 = f13;
                }
            }
        }
        this.cachedSavedTimestamp = Float.valueOf(f10);
        return f10;
    }

    public int getVideoStartsTimestamp() {
        String str;
        Integer num = this.cachedStartsTimestamp;
        if (num != null) {
            return num.intValue();
        }
        if (!isVideo()) {
            this.cachedStartsTimestamp = -1;
            return -1;
        }
        TLRPC.MessageMedia media = getMedia(this);
        int i10 = media.video_timestamp;
        if (i10 != 0) {
            return i10;
        }
        TLRPC.WebPage webPage = media.webpage;
        if (webPage != null && (str = webPage.url) != null) {
            try {
                int W = LaunchActivity.W(Uri.parse(str));
                this.cachedStartsTimestamp = Integer.valueOf(W);
                return W;
            } catch (Exception unused) {
            }
        }
        this.cachedStartsTimestamp = -1;
        return -1;
    }

    public CharSequence getVoiceTranscription() {
        String str;
        String str2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.messageOwner;
        if (message != null && (str = message.voiceTranscription) != null) {
            if (TextUtils.isEmpty(str)) {
                SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.NoWordsRecognized));
                spannableString.setSpan(new CharacterStyle() {
                    @Override
                    public void updateDrawState(TextPaint textPaint) {
                        textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                        textPaint.setColor(org.telegram.ui.ActionBar.j6.T2.getColor());
                    }
                }, 0, spannableString.length(), 33);
                return spannableString;
            }
            if (this.translated && (tL_textWithEntities = this.messageOwner.translatedVoiceTranscription) != null) {
                str2 = tL_textWithEntities.text;
            } else {
                str2 = this.messageOwner.voiceTranscription;
            }
            if (!TextUtils.isEmpty(str2)) {
                return Emoji.replaceEmoji(str2, org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt(), false);
            }
            return str2;
        }
        return null;
    }

    public byte[] getWaveform() {
        if (getDocument() == null) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getDocument().attributes.size(); i11++) {
            TLRPC.DocumentAttribute documentAttribute = getDocument().attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                byte[] bArr = documentAttribute.waveform;
                if (bArr == null || bArr.length == 0) {
                    MediaController.getInstance().generateWaveform(this);
                }
                return documentAttribute.waveform;
            }
        }
        if (!isRoundVideo()) {
            return null;
        }
        if (this.randomWaveform == null) {
            this.randomWaveform = new byte[120];
            while (true) {
                byte[] bArr2 = this.randomWaveform;
                if (i10 >= bArr2.length) {
                    break;
                }
                bArr2[i10] = (byte) (Math.random() * 255.0d);
                i10++;
            }
        }
        return this.randomWaveform;
    }

    public ArrayList<MessageObject> getWebPagePhotos(ArrayList<MessageObject> arrayList, ArrayList<TL_iv.PageBlock> arrayList2) {
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (getMedia(this.messageOwner) != null && getMedia(this.messageOwner).webpage != null && (page = (webPage = getMedia(this.messageOwner).webpage).cached_page) != null) {
            if (arrayList2 == null) {
                arrayList2 = page.blocks;
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_iv.PageBlock pageBlock = arrayList2.get(i10);
                if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                    for (int i11 = 0; i11 < pageblockslideshow.items.size(); i11++) {
                        arrayList.add(getMessageObjectForBlock(webPage, pageblockslideshow.items.get(i11)));
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                    for (int i12 = 0; i12 < pageblockcollage.items.size(); i12++) {
                        arrayList.add(getMessageObjectForBlock(webPage, pageblockcollage.items.get(i12)));
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean hasAttachedStickers() {
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
            if (getMedia(this.messageOwner).photo == null || !getMedia(this.messageOwner).photo.has_stickers) {
                return false;
            }
            return true;
        } else if (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument)) {
            return false;
        } else {
            return isDocumentHasAttachedStickers(getMedia(this.messageOwner).document);
        }
    }

    public boolean hasChosenReaction(mg.q0 q0Var) {
        if (hasReactions() && q0Var != null) {
            for (int i10 = 0; i10 < this.messageOwner.reactions.results.size(); i10++) {
                TLRPC.ReactionCount reactionCount = this.messageOwner.reactions.results.get(i10);
                if (q0Var.f(reactionCount.reaction)) {
                    return reactionCount.chosen;
                }
            }
        }
        return false;
    }

    public boolean hasEntitiesFromServer() {
        TLRPC.Message message = this.messageOwner;
        if (message == null || message.entities == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.messageOwner.entities.size(); i10++) {
            TLRPC.MessageEntity messageEntity = this.messageOwner.entities.get(i10);
            if ((messageEntity instanceof TLRPC.TL_messageEntityPhone) || (messageEntity instanceof TLRPC.TL_messageEntityBankCard)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasExtendedMedia() {
        TLRPC.MessageMedia messageMedia = this.messageOwner.media;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean hasExtendedMediaPreview() {
        TLRPC.MessageMedia messageMedia = this.messageOwner.media;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.messageOwner.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return false;
        }
        return true;
    }

    public boolean hasHighlightedWords() {
        ArrayList<String> arrayList = this.highlightedWords;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean hasInlineBotButtons() {
        TLRPC.Message message;
        if (!this.isRestrictedMessage && !this.isRepostPreview && (message = this.messageOwner) != null) {
            TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
            if (((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) || getInlineBotButtons() != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean hasLinkMediaToMakeSmall() {
        boolean z4;
        TLRPC.WebPage webPage;
        if (!this.isRestrictedMessage && (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage)) {
            z4 = true;
        } else {
            z4 = false;
        }
        String str = null;
        if (z4) {
            webPage = getMedia(this.messageOwner).webpage;
        } else {
            webPage = null;
        }
        if (webPage != null) {
            str = webPage.type;
        }
        if (!z4 || isGiveawayOrGiveawayResults() || webPage == null || ((webPage.photo == null && !isVideoDocument(webPage.document)) || ((TextUtils.isEmpty(webPage.description) && TextUtils.isEmpty(webPage.title)) || isSponsored() || "telegram_megagroup".equals(str) || "telegram_background".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_user".equals(str) || "telegram_story".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str)))) {
            return false;
        }
        return true;
    }

    public boolean hasMediaSpoilers() {
        TLRPC.MessageMedia messageMedia;
        if ((!this.isRepostPreview && (((messageMedia = this.messageOwner.media) != null && messageMedia.spoiler) || needDrawBluredPreview())) || isHiddenSensitive()) {
            return true;
        }
        return false;
    }

    public boolean hasPaidMediaPreview() {
        TLRPC.MessageMedia messageMedia = this.messageOwner.media;
        if (messageMedia == null || !(messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.messageOwner.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return false;
        }
        return true;
    }

    public boolean hasReaction(mg.q0 q0Var) {
        if (hasReactions() && q0Var != null) {
            for (int i10 = 0; i10 < this.messageOwner.reactions.results.size(); i10++) {
                if (q0Var.f(this.messageOwner.reactions.results.get(i10).reaction)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasReactions() {
        TLRPC.TL_messageReactions tL_messageReactions = this.messageOwner.reactions;
        if (tL_messageReactions != null && !tL_messageReactions.results.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean hasReplies() {
        TLRPC.MessageReplies messageReplies = this.messageOwner.replies;
        if (messageReplies != null && messageReplies.replies > 0) {
            return true;
        }
        return false;
    }

    public boolean hasRevealedExtendedMedia() {
        TLRPC.MessageMedia messageMedia = this.messageOwner.media;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.messageOwner.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
            return false;
        }
        return true;
    }

    public boolean hasSuggestionInlineButtons() {
        boolean z4;
        boolean z10;
        TLRPC.SuggestedPost suggestedPost;
        TLRPC.Message message = this.messageOwner;
        boolean z11 = true;
        if (message != null && (suggestedPost = message.suggested_post) != null && !suggestedPost.rejected && !suggestedPost.accepted && !isSendError() && !isSending()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            long peerDialogId = DialogObject.getPeerDialogId(this.messageOwner.saved_peer_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(this.messageOwner.from_id);
            if (clientUserId == peerDialogId) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (peerDialogId != peerDialogId2) {
                z11 = false;
            }
            if ((z10 && z11) || (!z10 && !z11)) {
                return false;
            }
        }
        return z4;
    }

    public boolean hasValidGroupId() {
        int i10;
        if (getGroupId() != 0) {
            ArrayList<TLRPC.PhotoSize> arrayList = this.photoThumbs;
            if ((arrayList != null && !arrayList.isEmpty()) || (i10 = this.type) == 3 || i10 == 1 || isMusic() || isDocument()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean hasValidGroupIdFast() {
        int i10;
        if (getGroupId() != 0) {
            ArrayList<TLRPC.PhotoSize> arrayList = this.photoThumbs;
            if ((arrayList != null && !arrayList.isEmpty()) || (i10 = this.type) == 3 || i10 == 1 || i10 == 14 || i10 == 9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean hasValidReplyMessageObject() {
        MessageObject messageObject;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.Message message = this.messageOwner;
        if ((message == null || (messageReplyHeader = message.reply_to) == null || !messageReplyHeader.forum_topic || messageReplyHeader.reply_to_msg_id != messageReplyHeader.reply_to_top_id) && (messageObject = this.replyMessageObject) != null) {
            TLRPC.Message message2 = messageObject.messageOwner;
            if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                TLRPC.MessageAction messageAction = message2.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear) && !(messageAction instanceof TLRPC.TL_messageActionTopicCreate)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasVideoCover() {
        if (getVideoCover() != null) {
            return true;
        }
        return false;
    }

    public boolean hasVideoQualities() {
        return hasVideoQualities(true);
    }

    public boolean hasVoteResults() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return isVoteResultsIsNotEmpty((TLRPC.TL_messageMediaPoll) media);
    }

    public boolean isAlbumSingle() {
        return getMedia(this) instanceof TLRPC.TL_messageMediaPaidMedia;
    }

    public boolean isAndroidTheme() {
        if (getMedia(this.messageOwner) != null && getMedia(this.messageOwner).webpage != null && !getMedia(this.messageOwner).webpage.attributes.isEmpty()) {
            int size = getMedia(this.messageOwner).webpage.attributes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.WebPageAttribute webPageAttribute = getMedia(this.messageOwner).webpage.attributes.get(i10);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                    TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                    ArrayList<TLRPC.Document> arrayList = tL_webPageAttributeTheme.documents;
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if ("application/x-tgtheme-android".equals(arrayList.get(i11).mime_type)) {
                            return true;
                        }
                    }
                    if (tL_webPageAttributeTheme.settings != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isAnimatedAnimatedEmoji() {
        if (isAnimatedEmoji() && isAnimatedEmoji(getDocument())) {
            return true;
        }
        return false;
    }

    public boolean isAnimatedEmojiStickerSingle() {
        if (this.emojiAnimatedStickerId != null) {
            return true;
        }
        return false;
    }

    public boolean isAnimatedEmojiStickers() {
        if (this.type == 19) {
            return true;
        }
        return false;
    }

    public boolean isAnimatedSticker() {
        int i10 = this.type;
        boolean z4 = false;
        if (i10 != 1000) {
            if (i10 != 15) {
                return false;
            }
            return true;
        }
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(getDialogId());
        if (isEncryptedDialog && this.messageOwner.stickerVerified != 1) {
            return false;
        }
        if (this.emojiAnimatedStickerId != null && this.emojiAnimatedSticker == null) {
            return true;
        }
        return isAnimatedStickerDocument(getDocument(), (this.emojiAnimatedSticker == null && isEncryptedDialog && !isOut()) ? true : true);
    }

    public boolean isAnyGift() {
        int i10 = this.type;
        if (i10 != 30 && i10 != 18 && i10 != 25) {
            return false;
        }
        return true;
    }

    public boolean isAnyKindOfSticker() {
        int i10 = this.type;
        if (i10 != 13 && i10 != 15 && i10 != 19) {
            return false;
        }
        return true;
    }

    public boolean isBotPreview() {
        return this.storyItem instanceof nh.c6;
    }

    public boolean isComments() {
        TLRPC.MessageReplies messageReplies = this.messageOwner.replies;
        if (messageReplies != null && messageReplies.comments) {
            return true;
        }
        return false;
    }

    public boolean isConferenceCall() {
        return this.messageOwner.action instanceof TLRPC.TL_messageActionConferenceCall;
    }

    public boolean isContentUnread() {
        return this.messageOwner.media_unread;
    }

    public boolean isCurrentWallpaper() {
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        TLRPC.UserFull userFull;
        TLRPC.WallPaper wallPaper;
        if (!isWallpaperAction() || (message = this.messageOwner) == null || (messageAction = message.action) == null || messageAction.wallpaper == null || (userFull = MessagesController.getInstance(this.currentAccount).getUserFull(getDialogId())) == null || (wallPaper = userFull.wallpaper) == null || !userFull.wallpaper_overridden || this.messageOwner.action.wallpaper.f19311id != wallPaper.f19311id) {
            return false;
        }
        return true;
    }

    public boolean isDice() {
        return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDice;
    }

    public boolean isDocument() {
        if (getDocument() != null && !isVideo() && !isMusic() && !isVoice() && !isAnyKindOfSticker()) {
            return true;
        }
        return false;
    }

    public boolean isEdited() {
        TLRPC.Message message = this.messageOwner;
        if (message != null && (message.flags & 32768) != 0 && message.edit_date != 0 && !message.edit_hide) {
            return true;
        }
        return false;
    }

    public boolean isEditedSuggestionOffer() {
        TLRPC.Message message;
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null && messageObject.messageOwner != null && (message = this.messageOwner) != null && message.suggested_post != null) {
            return true;
        }
        return false;
    }

    public boolean isEditing() {
        TLRPC.Message message = this.messageOwner;
        if (message.send_state == 3 && message.f19180id > 0) {
            return true;
        }
        return false;
    }

    public boolean isEditingMedia() {
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
            if (getMedia(this.messageOwner).photo.f19183id == 0) {
                return true;
            }
            return false;
        } else if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) && getMedia(this.messageOwner).document.dc_id == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmbedVideo() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.MessageMedia messageMedia2;
        Boolean bool = this.isEmbedVideoCached;
        boolean z4 = false;
        if (bool != null) {
            TLRPC.Message message = this.messageOwner;
            if (message == null || (messageMedia2 = message.media) == null || messageMedia2.webpage == null || !bool.booleanValue()) {
                return false;
            }
            return true;
        }
        TLRPC.Message message2 = this.messageOwner;
        if (message2 != null && (messageMedia = message2.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(e91.e(webPage.url))) {
            z4 = true;
        }
        this.isEmbedVideoCached = Boolean.valueOf(z4);
        return z4;
    }

    public boolean isEphemeral() {
        return isEphemeral(this.messageOwner);
    }

    public boolean isEphemeralAndNotWelcome() {
        return isEphemeralAndNotWelcome(this.messageOwner);
    }

    public boolean isExpiredLiveLocation(int i10) {
        TLRPC.Message message = this.messageOwner;
        if (message.date + getMedia(message).period <= i10) {
            return true;
        }
        return false;
    }

    public boolean isExpiredStory() {
        int i10 = this.type;
        if ((i10 == 23 || i10 == 24) && (this.messageOwner.media.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            return true;
        }
        return false;
    }

    public boolean isFactCheckable() {
        if (getId() >= 0 && !isSponsored()) {
            int i10 = this.type;
            if (i10 == 0 || i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8 || i10 == 9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isFcmMessage() {
        if (this.localType != 0) {
            return true;
        }
        return false;
    }

    public boolean isForwarded() {
        return isForwardedMessage(this.messageOwner);
    }

    public boolean isForwardedChannelPost() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Message message = this.messageOwner;
        TLRPC.Peer peer = message.from_id;
        if ((peer instanceof TLRPC.TL_peerChannel) && (messageFwdHeader = message.fwd_from) != null && messageFwdHeader.channel_post != 0) {
            TLRPC.Peer peer2 = messageFwdHeader.saved_from_peer;
            if ((peer2 instanceof TLRPC.TL_peerChannel) && peer.channel_id == peer2.channel_id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isFromChannel() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.isFromChannel():boolean");
    }

    public boolean isFromChat() {
        TLRPC.Peer peer;
        if (getDialogId() == UserConfig.getInstance(this.currentAccount).clientUserId) {
            return true;
        }
        TLRPC.Peer peer2 = this.messageOwner.peer_id;
        TLRPC.Chat chat = null;
        if (peer2 != null) {
            long j10 = peer2.channel_id;
            if (j10 != 0) {
                chat = getChat(null, null, j10);
            }
        }
        if ((ChatObject.isChannel(chat) && chat.megagroup) || ((peer = this.messageOwner.peer_id) != null && peer.chat_id != 0)) {
            return true;
        }
        if (peer != null && peer.channel_id != 0 && chat != null && chat.megagroup) {
            return true;
        }
        return false;
    }

    public boolean isFromGroup() {
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.Peer peer = message.peer_id;
        TLRPC.Chat chat = null;
        if (peer != null) {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                chat = getChat(null, null, j10);
            }
        }
        if (!(this.messageOwner.from_id instanceof TLRPC.TL_peerChannel) || !ChatObject.isChannel(chat) || !chat.megagroup) {
            return false;
        }
        return true;
    }

    public boolean isFromUser() {
        TLRPC.Message message = this.messageOwner;
        if ((message.from_id instanceof TLRPC.TL_peerUser) && !message.post) {
            return true;
        }
        return false;
    }

    public boolean isGame() {
        return isGameMessage(this.messageOwner);
    }

    public boolean isGif() {
        return isGifMessage(this.messageOwner);
    }

    public boolean isGiveaway() {
        if (this.type == 26) {
            return true;
        }
        return false;
    }

    public boolean isGiveawayOrGiveawayResults() {
        if (!isGiveaway() && !isGiveawayResults()) {
            return false;
        }
        return true;
    }

    public boolean isGiveawayResults() {
        if (this.type == 28) {
            return true;
        }
        return false;
    }

    public boolean isHiddenSensitive() {
        if (isSensitive() && !MessagesController.getInstance(this.currentAccount).showSensitiveContent()) {
            return true;
        }
        return false;
    }

    public boolean isImportedForward() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.imported) {
            return true;
        }
        return false;
    }

    public boolean isInvoice() {
        return isInvoiceMessage(this.messageOwner);
    }

    public boolean isLinkMediaSmall() {
        TLRPC.WebPage webPage;
        String str = null;
        if (!this.isRestrictedMessage && (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage)) {
            webPage = getMedia(this.messageOwner).webpage;
        } else {
            webPage = null;
        }
        if (webPage != null) {
            str = webPage.type;
        }
        if (webPage == null || !TextUtils.isEmpty(webPage.description) || !TextUtils.isEmpty(webPage.title)) {
            if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && !"telegram_bot".equals(str) && !"telegram_user".equals(str) && !"telegram_channel".equals(str) && !"telegram_megagroup".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_chat".equals(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean isLinkedToChat(long j10) {
        TLRPC.MessageReplies messageReplies = this.messageOwner.replies;
        if (messageReplies != null) {
            if (j10 == 0 || messageReplies.channel_id == j10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isLiveLocation() {
        return isLiveLocationMessage(this.messageOwner);
    }

    public boolean isLivePhoto() {
        TLRPC.MessageMedia media = getMedia(this);
        if (media != null && media.live_photo) {
            return true;
        }
        return false;
    }

    public boolean isLocation() {
        return isLocationMessage(this.messageOwner);
    }

    public boolean isMask() {
        return isMaskMessage(this.messageOwner);
    }

    public boolean isMediaEmpty() {
        return isMediaEmpty(this.messageOwner);
    }

    public boolean isMediaEmptyWebpage() {
        return isMediaEmptyWebpage(this.messageOwner);
    }

    public boolean isMusic() {
        if (isMusicMessage(this.messageOwner) && !isVideo() && !isRoundVideo()) {
            return true;
        }
        return false;
    }

    public boolean isNewGif() {
        if (getMedia(this.messageOwner) != null && isNewGifDocument(getDocument())) {
            return true;
        }
        return false;
    }

    public boolean isOut() {
        return this.messageOwner.out;
    }

    public boolean isOutOwner() {
        boolean z4 = true;
        if (this.previewForward) {
            return true;
        }
        Boolean bool = this.isOutOwnerCached;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (isWelcomeMessage() && !isWelcomeAnchored()) {
            this.isOutOwnerCached = Boolean.FALSE;
            return false;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if (!this.isSaved && getDialogId() != clientUserId) {
            TLRPC.Peer peer = this.messageOwner.peer_id;
            TLRPC.Chat chat = null;
            if (peer != null) {
                long j10 = peer.channel_id;
                if (j10 != 0) {
                    chat = getChat(null, null, j10);
                }
            }
            TLRPC.Message message = this.messageOwner;
            if (message.out) {
                TLRPC.Peer peer2 = message.from_id;
                if ((peer2 instanceof TLRPC.TL_peerUser) || ((peer2 instanceof TLRPC.TL_peerChannel) && !ChatObject.isChannelAndNotMegaGroup(chat))) {
                    TLRPC.Message message2 = this.messageOwner;
                    if (!message2.post) {
                        TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                        if (messageFwdHeader == null) {
                            this.isOutOwnerCached = Boolean.TRUE;
                            return true;
                        }
                        TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                        if (peer3 != null && peer3.user_id != clientUserId) {
                            z4 = false;
                        }
                        this.isOutOwnerCached = Boolean.valueOf(z4);
                        return z4;
                    }
                }
            }
            this.isOutOwnerCached = Boolean.FALSE;
            return false;
        }
        TLRPC.MessageFwdHeader messageFwdHeader2 = this.messageOwner.fwd_from;
        if (messageFwdHeader2 != null) {
            TLRPC.Peer peer4 = messageFwdHeader2.from_id;
            if ((peer4 == null || peer4.user_id != clientUserId) && !messageFwdHeader2.saved_out) {
                z4 = false;
            }
            this.isOutOwnerCached = Boolean.valueOf(z4);
            return z4;
        }
        this.isOutOwnerCached = Boolean.TRUE;
        return true;
    }

    public boolean isPaid() {
        TLRPC.Message message = this.messageOwner;
        if (message != null && message.paid_message_stars > 0) {
            return true;
        }
        return false;
    }

    public boolean isPaidReactionChosen() {
        if (this.messageOwner.reactions == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.messageOwner.reactions.results.size(); i10++) {
            if (this.messageOwner.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                return this.messageOwner.reactions.results.get(i10).chosen;
            }
        }
        return false;
    }

    public boolean isPaidSuggestedPost() {
        TLRPC.Message message = this.messageOwner;
        if (message != null) {
            if (message.paid_suggested_post_stars || message.paid_suggested_post_ton) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isPaidSuggestedPostProtected() {
        if (isPaidSuggestedPost()) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            if (currentTime - this.messageOwner.date < MessagesController.getInstance(this.currentAccount).config.starsSuggestedPostAgeMin.get(TimeUnit.SECONDS)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isPoll() {
        if (this.type == 17 && (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPoll)) {
            return true;
        }
        return false;
    }

    public boolean isPollClosed() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return ((TLRPC.TL_messageMediaPoll) media).poll.closed;
    }

    public boolean isPrivateForward() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name)) {
            return true;
        }
        return false;
    }

    public boolean isPublicPoll() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return ((TLRPC.TL_messageMediaPoll) media).poll.public_voters;
    }

    public boolean isQuiz() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaPoll)) {
            return false;
        }
        return ((TLRPC.TL_messageMediaPoll) media).poll.quiz;
    }

    public boolean isReactionsAvailable() {
        if (!isEditing() && !isSponsored() && isSent() && !isEphemeral() && !isExpiredStory() && canSetReaction()) {
            return true;
        }
        return false;
    }

    public boolean isReply() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject = this.replyMessageObject;
        if ((messageObject == null || !(messageObject.messageOwner instanceof TLRPC.TL_messageEmpty)) && (messageReplyHeader = (message = this.messageOwner).reply_to) != null) {
            if ((messageReplyHeader.reply_to_msg_id != 0 || messageReplyHeader.reply_to_random_id != 0) && (message.flags & 8) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isReplyToStory() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject = this.replyMessageObject;
        if ((messageObject == null || !(messageObject.messageOwner instanceof TLRPC.TL_messageEmpty)) && (messageReplyHeader = (message = this.messageOwner).reply_to) != null && messageReplyHeader.story_id != 0 && (message.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean isRoundOnce() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (isRoundVideo() && (message = this.messageOwner) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public boolean isRoundVideo() {
        int i10;
        if (this.isRoundVideoCached == 0) {
            if (this.type != 5 && !isRoundVideoMessage(this.messageOwner)) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            this.isRoundVideoCached = i10;
        }
        if (this.isRoundVideoCached == 1) {
            return true;
        }
        return false;
    }

    public boolean isSavedFromMegagroup() {
        TLRPC.Peer peer;
        TLRPC.MessageFwdHeader messageFwdHeader = this.messageOwner.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null && peer.channel_id != 0) {
            return ChatObject.isMegagroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.messageOwner.fwd_from.saved_from_peer.channel_id)));
        }
        return false;
    }

    public boolean isSecret() {
        return this.messageOwner instanceof TLRPC.TL_message_secret;
    }

    public boolean isSendError() {
        int i10;
        TLRPC.Message message = this.messageOwner;
        if (message.send_state != 2 || message.f19180id >= 0) {
            if (this.scheduled && message.f19180id > 0) {
                int i11 = message.date;
                int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                if (this.messageOwner.video_processing_pending) {
                    i10 = 300;
                } else {
                    i10 = 60;
                }
                if (i11 < currentTime - i10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public boolean isSending() {
        TLRPC.Message message = this.messageOwner;
        if (message.send_state == 1 && message.f19180id < 0) {
            return true;
        }
        return false;
    }

    public boolean isSensitive() {
        TLRPC.Chat chat;
        Boolean bool = this.isSensitiveCached;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.messageOwner == null || !canBeSensitive()) {
            return false;
        }
        if (!this.messageOwner.restriction_reason.isEmpty()) {
            for (int i10 = 0; i10 < this.messageOwner.restriction_reason.size(); i10++) {
                TLRPC.RestrictionReason restrictionReason = this.messageOwner.restriction_reason.get(i10);
                if ("sensitive".equals(restrictionReason.reason) && ("all".equals(restrictionReason.platform) || (("android".equals(restrictionReason.platform) && ((!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp()) || BuildVars.DEBUG_PRIVATE_VERSION)) || "android-all".equals(restrictionReason.platform)))) {
                    this.isSensitiveCached = Boolean.TRUE;
                    return true;
                }
            }
        }
        if (getDialogId() < 0 && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-getDialogId()))) != null && chat.restriction_reason != null) {
            for (int i11 = 0; i11 < chat.restriction_reason.size(); i11++) {
                TLRPC.RestrictionReason restrictionReason2 = chat.restriction_reason.get(i11);
                if ("sensitive".equals(restrictionReason2.reason) && ("all".equals(restrictionReason2.platform) || (("android".equals(restrictionReason2.platform) && ((!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp()) || BuildVars.DEBUG_PRIVATE_VERSION)) || "android-all".equals(restrictionReason2.platform)))) {
                    this.isSensitiveCached = Boolean.TRUE;
                    return true;
                }
            }
        }
        this.isSensitiveCached = Boolean.FALSE;
        return false;
    }

    public boolean isSent() {
        TLRPC.Message message = this.messageOwner;
        if (message.send_state != 0 && message.f19180id <= 0) {
            return false;
        }
        return true;
    }

    public boolean isSponsored() {
        if (this.sponsoredId != null) {
            return true;
        }
        return false;
    }

    public boolean isStakeableDice() {
        TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) getMedia(this.messageOwner, TLRPC.TL_messageMediaDice.class);
        if (tL_messageMediaDice != null && TextUtils.equals("🎲", tL_messageMediaDice.emoticon)) {
            return true;
        }
        return false;
    }

    public boolean isStakedDice() {
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaDice) || ((TLRPC.TL_messageMediaDice) media).game_outcome == null) {
            return false;
        }
        return true;
    }

    public boolean isStarGiftAction() {
        TLRPC.Message message = this.messageOwner;
        if (message != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isSticker() {
        int i10 = this.type;
        if (i10 != 1000) {
            if (i10 != 13) {
                return false;
            }
            return true;
        } else if (!isStickerDocument(getDocument()) && !isVideoSticker(getDocument())) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isStory() {
        if (this.storyItem != null) {
            return true;
        }
        return false;
    }

    public boolean isStoryMedia() {
        TLRPC.Message message = this.messageOwner;
        if (message != null && (message.media instanceof TLRPC.TL_messageMediaStory)) {
            return true;
        }
        return false;
    }

    public boolean isStoryMention() {
        if (this.type == 24 && !isExpiredStory()) {
            return true;
        }
        return false;
    }

    public boolean isSupergroup() {
        if (this.localSupergroup) {
            return true;
        }
        Boolean bool = this.cachedIsSupergroup;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC.Peer peer = this.messageOwner.peer_id;
        if (peer != null) {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                TLRPC.Chat chat = getChat(null, null, j10);
                if (chat == null) {
                    return false;
                }
                boolean z4 = chat.megagroup;
                this.cachedIsSupergroup = Boolean.valueOf(z4);
                return z4;
            }
        }
        this.cachedIsSupergroup = Boolean.FALSE;
        return false;
    }

    public boolean isTheme() {
        if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && "telegram_theme".equals(getMedia(this.messageOwner).webpage.type)) {
            return true;
        }
        return false;
    }

    public boolean isTodo() {
        if (this.type == 17 && (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaToDo)) {
            return true;
        }
        return false;
    }

    public boolean isUnread() {
        TLRPC.Message message = this.messageOwner;
        return message != null && message.unread;
    }

    public boolean isUnsupported() {
        return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaUnsupported;
    }

    public boolean isVideo() {
        return isVideoMessage(this.messageOwner);
    }

    public boolean isVideoAvatar() {
        TLRPC.Photo photo;
        TLRPC.MessageAction messageAction = this.messageOwner.action;
        if (messageAction != null && (photo = messageAction.photo) != null && !photo.video_sizes.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isVideoCall() {
        TLRPC.MessageAction messageAction = this.messageOwner.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionPhoneCall) || !messageAction.video) {
            if ((messageAction instanceof TLRPC.TL_messageActionConferenceCall) && messageAction.video) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean isVideoStory() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (media == null || (storyItem = media.storyItem) == null || (messageMedia = storyItem.media) == null) {
            return false;
        }
        return isVideoDocument(messageMedia.document);
    }

    public boolean isVoice() {
        return isVoiceMessage(this.messageOwner);
    }

    public boolean isVoiceOnce() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (isVoice() && (message = this.messageOwner) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public boolean isVoiceTranscriptionOpen() {
        if (this.messageOwner != null) {
            if (isVoice() || (isRoundVideo() && d31.l(this))) {
                TLRPC.Message message = this.messageOwner;
                if (message.voiceTranscriptionOpen && message.voiceTranscription != null) {
                    if (message.voiceTranscriptionFinal || d31.k(this)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean isVotedButResultsHiddenUntilClose() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            return isVotedButResultsHiddenUntilClose((TLRPC.TL_messageMediaPoll) media);
        }
        return false;
    }

    public boolean isWallpaper() {
        if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && "telegram_background".equals(getMedia(this.messageOwner).webpage.type)) {
            return true;
        }
        return false;
    }

    public boolean isWallpaperAction() {
        if (this.type != 22) {
            TLRPC.Message message = this.messageOwner;
            if (message == null || !(message.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean isWallpaperForBoth() {
        TLRPC.Message message;
        if (isWallpaperAction() && (message = this.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) && ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).for_both) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isWebpage() {
        return getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage;
    }

    public boolean isWebpageDocument() {
        if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage.document != null && !isGifDocument(getMedia(this.messageOwner).webpage.document)) {
            return true;
        }
        return false;
    }

    public boolean isWelcomeAnchored() {
        return isWelcomeAnchored(this.messageOwner);
    }

    public boolean isWelcomeMessage() {
        return isWelcomeMessage(this.messageOwner);
    }

    public boolean isYouTubeVideo() {
        if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(this.messageOwner).webpage != null && !TextUtils.isEmpty(getMedia(this.messageOwner).webpage.embed_url) && "YouTube".equals(getMedia(this.messageOwner).webpage.site_name)) {
            return true;
        }
        return false;
    }

    public void loadAnimatedEmojiDocument() {
        if (this.emojiAnimatedSticker == null && this.emojiAnimatedStickerId != null && !this.emojiAnimatedStickerLoading) {
            this.emojiAnimatedStickerLoading = true;
            org.telegram.ui.Components.l5.h(this.currentAccount).b(this.emojiAnimatedStickerId.longValue(), new org.telegram.ui.Components.i5() {
                @Override
                public final void a(TLRPC.Document document) {
                    MessageObject.this.lambda$loadAnimatedEmojiDocument$1(document);
                }
            });
        }
    }

    public void markPollVotesAsRead() {
        TLRPC.Message message = this.messageOwner;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
            }
        }
    }

    public void markReactionsAsRead() {
        TLRPC.TL_messageReactions tL_messageReactions = this.messageOwner.reactions;
        if (tL_messageReactions != null && tL_messageReactions.recent_reactions != null) {
            boolean z4 = false;
            for (int i10 = 0; i10 < this.messageOwner.reactions.recent_reactions.size(); i10++) {
                if (this.messageOwner.reactions.recent_reactions.get(i10).unread) {
                    this.messageOwner.reactions.recent_reactions.get(i10).unread = false;
                    z4 = true;
                }
            }
            if (z4) {
                MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
                TLRPC.Message message = this.messageOwner;
                messagesStorage.markMessageReactionsAsRead(message.dialog_id, getTopicId(this.currentAccount, message), this.messageOwner.f19180id);
            }
        }
    }

    public void measureInlineBotButtons() {
        TLRPC.TL_messageReactions tL_messageReactions;
        CharSequence replaceEmoji;
        if (!this.isRestrictedMessage) {
            this.wantedBotKeyboardWidth = 0;
            this.inlineKeyboardSource = null;
            BotInlineKeyboard.Builder builder = new BotInlineKeyboard.Builder();
            TLRPC.Message message = this.messageOwner;
            if (message != null) {
                TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
                if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows != null) {
                    builder.addBotKeyboard((TLRPC.TL_replyInlineMarkup) replyMarkup);
                }
            }
            if (hasSuggestionInlineButtons()) {
                builder.addSeparator();
                builder.addSuggestionKeyboard();
            }
            if (builder.isNotEmpty()) {
                this.inlineKeyboardSource = builder.build();
            }
            BotInlineKeyboard.Source source = this.inlineKeyboardSource;
            if ((source != null && !hasExtendedMedia()) || ((tL_messageReactions = this.messageOwner.reactions) != null && !tL_messageReactions.results.isEmpty())) {
                org.telegram.ui.ActionBar.j6.O();
                StringBuilder sb = this.botButtonsLayout;
                if (sb == null) {
                    this.botButtonsLayout = new StringBuilder();
                } else {
                    sb.setLength(0);
                }
            }
            if (source != null && !hasExtendedMedia()) {
                for (int i10 = 0; i10 < source.getRowsCount(); i10++) {
                    int columnsCount = source.getColumnsCount(i10);
                    int i11 = 0;
                    for (int i12 = 0; i12 < columnsCount; i12++) {
                        BotInlineKeyboard.Button button = source.getButton(i10, i12);
                        StringBuilder sb2 = this.botButtonsLayout;
                        sb2.append(i10);
                        sb2.append(i12);
                        if ((button instanceof BotInlineKeyboard.ButtonBot) && lf.c.c(((BotInlineKeyboard.ButtonBot) button).button, TL_keyboard.TL_inlineButtonTypeBuy.class) && (getMedia(this.messageOwner).flags & 4) != 0) {
                            replaceEmoji = LocaleController.getString(R.string.PaymentReceipt);
                        } else {
                            String text = button.getText();
                            if (text == null) {
                                text = "";
                            }
                            replaceEmoji = Emoji.replaceEmoji(text, org.telegram.ui.ActionBar.j6.f20215w2.getFontMetricsInt(), false);
                        }
                        StaticLayout staticLayout = new StaticLayout(replaceEmoji, org.telegram.ui.ActionBar.j6.f20215w2, AndroidUtilities.dp(2000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        if (staticLayout.getLineCount() > 0) {
                            float lineWidth = staticLayout.getLineWidth(0);
                            float lineLeft = staticLayout.getLineLeft(0);
                            if (lineLeft < lineWidth) {
                                lineWidth -= lineLeft;
                            }
                            if (button.getIconRes() != 0) {
                                lineWidth += AndroidUtilities.dp(36.0f);
                            }
                            if (button.getIconEmoji() != 0) {
                                lineWidth += AndroidUtilities.dp(36.0f);
                            }
                            i11 = y3.b(4.0f, (int) Math.ceil(lineWidth), i11);
                        }
                    }
                    this.wantedBotKeyboardWidth = Math.max(this.wantedBotKeyboardWidth, ((columnsCount - 1) * AndroidUtilities.dp(5.0f)) + ((AndroidUtilities.dp(12.0f) + i11) * columnsCount));
                }
            }
        }
    }

    public float measureVoiceTranscriptionHeight() {
        float f10;
        StaticLayout staticLayout;
        CharSequence voiceTranscription = getVoiceTranscription();
        if (voiceTranscription == null) {
            return 0.0f;
        }
        int i10 = AndroidUtilities.displaySize.x;
        if (needDrawAvatar()) {
            f10 = 147.0f;
        } else {
            f10 = 95.0f;
        }
        int dp = i10 - AndroidUtilities.dp(f10);
        if (Build.VERSION.SDK_INT >= 24) {
            staticLayout = StaticLayout.Builder.obtain(voiceTranscription, 0, voiceTranscription.length(), org.telegram.ui.ActionBar.j6.f20074o2, dp).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
        } else {
            staticLayout = new StaticLayout(voiceTranscription, org.telegram.ui.ActionBar.j6.f20074o2, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return staticLayout.getHeight();
    }

    public boolean mediaExists() {
        g71 g71Var;
        if (hasVideoQualities() && (g71Var = this.highestQuality) != null) {
            return g71Var.b();
        }
        return this.mediaExists;
    }

    public boolean needDrawAvatar() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.needDrawAvatar():boolean");
    }

    public boolean needDrawBluredPreview() {
        if (this.isRepostPreview) {
            return false;
        }
        if (hasExtendedMediaPreview()) {
            return true;
        }
        TLRPC.Message message = this.messageOwner;
        if (message instanceof TLRPC.TL_message_secret) {
            int max = Math.max(message.ttl, getMedia(message).ttl_seconds);
            if (max <= 0 || (((!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) && !isVideo() && !isGif()) || max > 60) && !isRoundVideo())) {
                return false;
            }
            return true;
        } else if (!(message instanceof TLRPC.TL_message) || getMedia(message) == null || getMedia(this.messageOwner).ttl_seconds == 0 || (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean needDrawForwarded() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.needDrawForwarded():boolean");
    }

    public boolean needDrawShareButton() {
        int i10;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (this.isRepostPreview || this.sideMenuEnabled || getDialogId() == 489000) {
            return false;
        }
        if (this.isSaved) {
            long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            long savedDialogId = getSavedDialogId(j10, this.messageOwner);
            if (savedDialogId == j10 || savedDialogId == 2666000 || (message = this.messageOwner) == null || (messageFwdHeader = message.fwd_from) == null) {
                return false;
            }
            if (messageFwdHeader.from_id == null && messageFwdHeader.saved_from_id == null) {
                return false;
            }
            return true;
        } else if (this.type == 27 || isSponsored() || this.hasCode || this.preview || this.scheduled || this.eventId != 0) {
            return false;
        } else {
            if (this.searchType == 2) {
                return true;
            }
            TLRPC.Message message2 = this.messageOwner;
            if (message2.noforwards) {
                return false;
            }
            if (message2.fwd_from != null && !isOutOwner() && this.messageOwner.fwd_from.saved_from_peer != null && getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                return true;
            }
            int i11 = this.type;
            if (i11 != 13 && i11 != 15 && i11 != 19) {
                TLRPC.MessageFwdHeader messageFwdHeader2 = this.messageOwner.fwd_from;
                if (messageFwdHeader2 != null && (messageFwdHeader2.from_id instanceof TLRPC.TL_peerChannel) && !isOutOwner()) {
                    return true;
                }
                if (isFromUser()) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id));
                    if (user != null && user.bot && ("reviews_bot".equals(UserObject.getPublicUsername(user)) || "ReviewInsightsBot".equals(UserObject.getPublicUsername(user)))) {
                        return true;
                    }
                    if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaEmpty) || getMedia(this.messageOwner) == null || ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && !(getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage))) {
                        return false;
                    }
                    if (user != null && user.bot && !hasExtendedMedia()) {
                        return true;
                    }
                    if (!isOut()) {
                        if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) || (((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) && !hasExtendedMedia()) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage))) {
                            return true;
                        }
                        TLRPC.Peer peer = this.messageOwner.peer_id;
                        TLRPC.Chat chat = null;
                        if (peer != null) {
                            long j11 = peer.channel_id;
                            if (j11 != 0) {
                                chat = getChat(null, null, j11);
                            }
                        }
                        if (!ChatObject.isChannel(chat) || !chat.megagroup || !ChatObject.isPublic(chat) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaContact) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGeo)) {
                            return false;
                        }
                        return true;
                    }
                } else {
                    TLRPC.Message message3 = this.messageOwner;
                    if ((message3.from_id instanceof TLRPC.TL_peerChannel) || message3.post) {
                        if ((getMedia(message3) instanceof TLRPC.TL_messageMediaWebPage) && !isOutOwner()) {
                            return true;
                        }
                        if (isSupergroup()) {
                            return false;
                        }
                        TLRPC.Message message4 = this.messageOwner;
                        if (message4.peer_id.channel_id != 0 && ((message4.via_bot_id == 0 && message4.reply_to == null) || ((i10 = this.type) != 13 && i10 != 15))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public boolean needResendWhenEdit() {
        if (ChatObject.isMonoForum(this.currentAccount, getDialogId()) && getFromChatId() != UserConfig.getInstance(this.currentAccount).getClientUserId() && !isOutOwner()) {
            return true;
        }
        return false;
    }

    public MessageSuggestionParams obtainSuggestionOffer() {
        TLRPC.Message message = this.messageOwner;
        if (message == null) {
            return null;
        }
        TLRPC.SuggestedPost suggestedPost = message.suggested_post;
        if (suggestedPost != null) {
            return MessageSuggestionParams.of(suggestedPost);
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return null;
        }
        return MessageSuggestionParams.of((TLRPC.TL_messageActionSuggestedPostApproval) messageAction);
    }

    public MessageSuggestionParams obtainSuggestionOfferFromReply() {
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject != null) {
            return messageObject.obtainSuggestionOffer();
        }
        return null;
    }

    public boolean probablyRingtone() {
        if (!isVoiceOnce() && getDocument() != null && ff.e.f6109i.contains(getDocument().mime_type) && getDocument().size < MessagesController.getInstance(this.currentAccount).ringtoneSizeMax * 2) {
            for (int i10 = 0; i10 < getDocument().attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = getDocument().attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration < 5.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public Spannable replaceAnimatedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        return replaceAnimatedEmoji(charSequence, getEntities(), fontMetricsInt, false);
    }

    public void replaceEmojiToLottieFrame(CharSequence charSequence, int[] iArr) {
        int i10;
        int length;
        boolean z4;
        CharSequence charSequence2;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class);
            org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.u5.class);
            if (emojiSpanArr != null) {
                if (iArr == null) {
                    i10 = 0;
                } else {
                    i10 = iArr[0];
                }
                int length2 = i10 - emojiSpanArr.length;
                if (u5VarArr == null) {
                    length = 0;
                } else {
                    length = u5VarArr.length;
                }
                if (length2 - length <= 0) {
                    for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                        String str = emojiSpanArr[i11].emoji;
                        if (Emoji.endsWithRightArrow(str)) {
                            z4 = true;
                            charSequence2 = str.subSequence(0, str.length() - 2);
                        } else {
                            z4 = false;
                            charSequence2 = str;
                        }
                        TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(charSequence2);
                        if (emojiAnimatedSticker != null) {
                            int spanStart = spannable.getSpanStart(emojiSpanArr[i11]);
                            int spanEnd = spannable.getSpanEnd(emojiSpanArr[i11]);
                            spannable.removeSpan(emojiSpanArr[i11]);
                            org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(emojiAnimatedSticker, emojiSpanArr[i11].fontMetrics);
                            u5Var.standard = true;
                            u5Var.invert = z4;
                            spannable.setSpan(u5Var, spanStart, spanEnd, 33);
                        }
                    }
                }
            }
        }
    }

    public CharSequence replaceWithLink(CharSequence charSequence, String str, ArrayList<Long> arrayList, AbstractMap<Long, TLRPC.User> abstractMap, a0.h hVar) {
        TLRPC.User user;
        if (TextUtils.indexOf(charSequence, str) >= 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (abstractMap != null) {
                    user = abstractMap.get(arrayList.get(i10));
                } else {
                    user = hVar != null ? (TLRPC.User) hVar.f(arrayList.get(i10).longValue()) : null;
                }
                if (user == null) {
                    user = MessagesController.getInstance(this.currentAccount).getUser(arrayList.get(i10));
                }
                if (user != null) {
                    String userName = UserObject.getUserName(user);
                    int length = spannableStringBuilder.length();
                    if (spannableStringBuilder.length() != 0) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                    spannableStringBuilder.append((CharSequence) userName);
                    spannableStringBuilder.setSpan(new n51("" + user.f19306id), length, userName.length() + length, 33);
                }
            }
            return TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{spannableStringBuilder});
        }
        return charSequence;
    }

    public void resetLayout() {
        this.layoutCreated = false;
    }

    public void resetPlayingProgress() {
        this.audioProgress = 0.0f;
        this.audioProgressSec = 0;
        this.bufferedProgress = 0.0f;
    }

    public boolean selectReaction(mg.q0 q0Var, boolean z4, boolean z10) {
        int i10;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z11;
        boolean z12;
        TLRPC.Message message = this.messageOwner;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.messageOwner;
            TLRPC.TL_messageReactions tL_messageReactions2 = message2.reactions;
            if (getDialogId(message2) == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            tL_messageReactions2.reactions_as_tags = z11;
            TLRPC.TL_messageReactions tL_messageReactions3 = this.messageOwner.reactions;
            if (!isFromGroup() && !isFromUser()) {
                z12 = false;
            } else {
                z12 = true;
            }
            tL_messageReactions3.can_see_list = z12;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.ReactionCount reactionCount = null;
        int i11 = 0;
        for (int i12 = 0; i12 < this.messageOwner.reactions.results.size(); i12++) {
            TLRPC.ReactionCount reactionCount2 = this.messageOwner.reactions.results.get(i12);
            if (reactionCount2.chosen && !(reactionCount2.reaction instanceof TLRPC.TL_reactionPaid)) {
                arrayList.add(reactionCount2);
                int i13 = reactionCount2.chosen_order;
                if (i13 > i11) {
                    i11 = i13;
                }
            }
            TLRPC.Reaction reaction = this.messageOwner.reactions.results.get(i12).reaction;
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                String str = q0Var.f14095f;
                if (str != null) {
                    if (((TLRPC.TL_reactionEmoji) reaction).emoticon.equals(str)) {
                        reactionCount = this.messageOwner.reactions.results.get(i12);
                    }
                }
            }
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j10 = q0Var.f14096g;
                if (j10 != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j10) {
                    reactionCount = this.messageOwner.reactions.results.get(i12);
                }
            }
        }
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount) && z4) {
            return true;
        }
        int maxUserReactionsCount = MessagesController.getInstance(this.currentAccount).getMaxUserReactionsCount();
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount)) {
            if (reactionCount != null) {
                reactionCount.chosen = false;
                int i14 = reactionCount.count - 1;
                reactionCount.count = i14;
                if (i14 <= 0) {
                    this.messageOwner.reactions.results.remove(reactionCount);
                }
            }
            if (this.messageOwner.reactions.can_see_list) {
                int i15 = 0;
                while (i15 < this.messageOwner.reactions.recent_reactions.size()) {
                    if (getPeerId(this.messageOwner.reactions.recent_reactions.get(i15).peer_id) == UserConfig.getInstance(this.currentAccount).getClientUserId() && mg.s0.c(this.messageOwner.reactions.recent_reactions.get(i15).reaction, q0Var)) {
                        this.messageOwner.reactions.recent_reactions.remove(i15);
                        i15--;
                    }
                    i15++;
                }
            }
            this.reactionsChanged = true;
            return false;
        }
        while (!arrayList.isEmpty() && arrayList.size() >= maxUserReactionsCount) {
            int i16 = 0;
            for (int i17 = 1; i17 < arrayList.size(); i17++) {
                if (!(((TLRPC.ReactionCount) arrayList.get(i17)).reaction instanceof TLRPC.TL_reactionPaid) && ((TLRPC.ReactionCount) arrayList.get(i17)).chosen_order < ((TLRPC.ReactionCount) arrayList.get(i16)).chosen_order) {
                    i16 = i17;
                }
            }
            TLRPC.ReactionCount reactionCount3 = (TLRPC.ReactionCount) arrayList.get(i16);
            reactionCount3.chosen = false;
            int i18 = reactionCount3.count - 1;
            reactionCount3.count = i18;
            if (i18 <= 0) {
                this.messageOwner.reactions.results.remove(reactionCount3);
            }
            arrayList.remove(reactionCount3);
            if (this.messageOwner.reactions.can_see_list) {
                int i19 = 0;
                while (i19 < this.messageOwner.reactions.recent_reactions.size()) {
                    if (getPeerId(this.messageOwner.reactions.recent_reactions.get(i19).peer_id) == UserConfig.getInstance(this.currentAccount).getClientUserId() && mg.s0.c(this.messageOwner.reactions.recent_reactions.get(i19).reaction, q0Var)) {
                        this.messageOwner.reactions.recent_reactions.remove(i19);
                        i19--;
                    }
                    i19++;
                }
            }
        }
        if (reactionCount == null) {
            int chatMaxUniqReactions = MessagesController.getInstance(this.currentAccount).getChatMaxUniqReactions(getDialogId());
            TLRPC.Message message3 = this.messageOwner;
            if (message3 != null && (tL_messageReactions = message3.reactions) != null) {
                ArrayList<TLRPC.ReactionCount> arrayList2 = tL_messageReactions.results;
                int size = arrayList2.size();
                i10 = 0;
                int i20 = 0;
                while (i20 < size) {
                    TLRPC.ReactionCount reactionCount4 = arrayList2.get(i20);
                    i20++;
                    if (!(reactionCount4.reaction instanceof TLRPC.TL_reactionPaid)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (i10 + 1 > chatMaxUniqReactions) {
                return false;
            }
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = q0Var.g();
            this.messageOwner.reactions.results.add(reactionCount);
        }
        reactionCount.chosen = true;
        reactionCount.count++;
        reactionCount.chosen_order = i11 + 1;
        TLRPC.Message message4 = this.messageOwner;
        if (message4.reactions.can_see_list || (message4.dialog_id > 0 && maxUserReactionsCount > 1)) {
            TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
            TLRPC.Message message5 = this.messageOwner;
            if (message5.isThreadMessage && message5.fwd_from != null) {
                tL_messagePeerReaction.peer_id = MessagesController.getInstance(this.currentAccount).getSendAsSelectedPeer(getFromChatId());
            } else {
                tL_messagePeerReaction.peer_id = MessagesController.getInstance(this.currentAccount).getSendAsSelectedPeer(getDialogId());
            }
            this.messageOwner.reactions.recent_reactions.add(0, tL_messagePeerReaction);
            if (q0Var.f14095f != null) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_messagePeerReaction.reaction = tL_reactionEmoji;
                tL_reactionEmoji.emoticon = q0Var.f14095f;
            } else {
                TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                tL_messagePeerReaction.reaction = tL_reactionCustomEmoji;
                tL_reactionCustomEmoji.document_id = q0Var.f14096g;
            }
        }
        this.reactionsChanged = true;
        return true;
    }

    public void setContentIsRead() {
        this.messageOwner.media_unread = false;
    }

    public void setIsRead() {
        this.messageOwner.unread = false;
    }

    public void setMyPaidReactionDialogId(long j10) {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z4;
        TLRPC.Message message = this.messageOwner;
        if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList = tL_messageReactions.top_reactors) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.MessageReactor messageReactor = arrayList.get(i10);
                i10++;
                TLRPC.MessageReactor messageReactor2 = messageReactor;
                if (messageReactor2 != null && messageReactor2.my) {
                    if (j10 == 2666000) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    messageReactor2.anonymous = z4;
                    if (z4) {
                        messageReactor2.flags &= -9;
                        messageReactor2.peer_id = null;
                    } else {
                        messageReactor2.flags |= 8;
                        messageReactor2.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(j10);
                    }
                }
            }
        }
    }

    public void setQuery(String str) {
        setQuery(str, true);
    }

    public void setType() {
        int i10;
        int i11;
        int i12 = this.type;
        this.type = 1000;
        this.isRoundVideoCached = 0;
        if (isSponsored()) {
            this.type = 0;
        } else {
            int i13 = 1;
            if (this.channelJoined) {
                this.contentType = 0;
                this.type = 27;
                SharedPreferences mainSettings = MessagesController.getInstance(this.currentAccount).getMainSettings();
                this.channelJoinedExpanded = mainSettings.getBoolean("c" + getDialogId() + "_rec", true);
            } else {
                TLRPC.Message message = this.messageOwner;
                if (!(message instanceof TLRPC.TL_message) && !(message instanceof TLRPC.TL_messageForwarded_old2)) {
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = this.currentEvent;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            TLRPC.TL_channelAdminLogEventActionChangeWallpaper tL_channelAdminLogEventActionChangeWallpaper = (TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction;
                            this.contentType = 1;
                            TLRPC.WallPaper wallPaper = tL_channelAdminLogEventActionChangeWallpaper.new_value;
                            if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && wallPaper.f19311id == 0 && wallPaper.settings == null) {
                                this.type = 10;
                            } else {
                                this.type = 22;
                                ArrayList<TLRPC.PhotoSize> arrayList = new ArrayList<>();
                                this.photoThumbs = arrayList;
                                TLRPC.Document document = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                if (document != null) {
                                    arrayList.addAll(document.thumbs);
                                    this.photoThumbsObject = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                }
                            }
                        }
                    }
                    if (message instanceof TLRPC.TL_messageService) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (!(messageAction instanceof TLRPC.TL_messageActionChangeCreator) && !(messageAction instanceof TLRPC.TL_messageActionNewCreatorPending) && !(messageAction instanceof TLRPC.TL_messageActionManagedBotCreated)) {
                            if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                                this.contentType = 1;
                                this.type = 10;
                            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                                this.contentType = 1;
                                this.type = 22;
                                TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                                ArrayList<TLRPC.PhotoSize> arrayList2 = new ArrayList<>();
                                this.photoThumbs = arrayList2;
                                TLRPC.Document document2 = tL_messageActionSetChatWallPaper.wallpaper.document;
                                if (document2 != null) {
                                    arrayList2.addAll(document2.thumbs);
                                    this.photoThumbsObject = tL_messageActionSetChatWallPaper.wallpaper.document;
                                }
                            } else if (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto) {
                                this.contentType = 1;
                                this.type = 21;
                                ArrayList<TLRPC.PhotoSize> arrayList3 = new ArrayList<>();
                                this.photoThumbs = arrayList3;
                                arrayList3.addAll(this.messageOwner.action.photo.sizes);
                                this.photoThumbsObject = this.messageOwner.action.photo;
                            } else if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                                this.type = 0;
                            } else if ((messageAction instanceof TLRPC.TL_messageActionGiftCode) && ((TLRPC.TL_messageActionGiftCode) messageAction).boost_peer != null) {
                                this.contentType = 1;
                                this.type = 25;
                            } else if (!(messageAction instanceof TLRPC.TL_messageActionGiftPremium) && !(messageAction instanceof TLRPC.TL_messageActionGiftCode)) {
                                if (!(messageAction instanceof TLRPC.TL_messageActionGiftStars) && !(messageAction instanceof TLRPC.TL_messageActionStarGift) && !(messageAction instanceof TLRPC.TL_messageActionPrizeStars) && ((!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) || !((TLRPC.TL_messageActionStarGiftUnique) messageAction).refunded) && !(messageAction instanceof TLRPC.TL_messageActionGiftTon))) {
                                    if (!(messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) && !(messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                                            TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                                            if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) && !(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                                                this.contentType = -1;
                                                this.type = -1;
                                            } else {
                                                this.contentType = 1;
                                                this.type = 10;
                                            }
                                        } else if (messageAction instanceof TLRPC.TL_messageActionHistoryClear) {
                                            this.contentType = -1;
                                            this.type = -1;
                                        } else if (!(messageAction instanceof TLRPC.TL_messageActionPhoneCall) && !(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
                                            if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && (((TLRPC.TL_messageActionSetChatTheme) messageAction).theme instanceof TLRPC.TL_chatThemeUniqueGift)) {
                                                this.type = 31;
                                                this.contentType = 1;
                                            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                                this.type = 33;
                                                this.contentType = 1;
                                            } else if ((messageAction instanceof TLRPC.TL_messageActionChangeCommunity) && ((TLRPC.TL_messageActionChangeCommunity) messageAction).community_id != 0) {
                                                this.type = 37;
                                                this.contentType = 1;
                                            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) {
                                                this.type = 34;
                                                this.contentType = 1;
                                            } else if (messageAction instanceof TLRPC.TL_messageActionSuggestBirthday) {
                                                this.type = 32;
                                                this.contentType = 1;
                                            } else if (messageAction instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                this.type = 35;
                                                this.contentType = 1;
                                            } else {
                                                this.contentType = 1;
                                                this.type = 10;
                                            }
                                        } else {
                                            this.type = 16;
                                        }
                                    } else {
                                        this.contentType = 1;
                                        this.type = 11;
                                    }
                                } else {
                                    this.contentType = 1;
                                    this.type = 30;
                                }
                            } else {
                                this.contentType = 1;
                                this.type = 18;
                            }
                        } else {
                            this.contentType = 1;
                            this.type = 10;
                        }
                    }
                } else if (getMedia(message) instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.contentType = 10;
                    this.type = 38;
                } else if (this.isRestrictedMessage) {
                    this.type = 0;
                } else {
                    TLRPC.Message message2 = this.messageOwner;
                    if (message2.rich_message != null) {
                        this.type = 36;
                    } else if (this.emojiAnimatedSticker == null && this.emojiAnimatedStickerId == null) {
                        if (message2.media instanceof TLRPC.TL_messageMediaPaidMedia) {
                            this.type = 29;
                        } else if (isMediaEmpty(false) && !isDice() && !isSponsored() && this.emojiOnlyCount >= 1 && !this.hasUnwrappedEmoji && this.messageOwner != null && !hasNonEmojiEntities()) {
                            this.type = 19;
                        } else if (isMediaEmpty()) {
                            this.type = 0;
                            if (TextUtils.isEmpty(this.messageText) && this.eventId == 0) {
                                this.messageText = "";
                            }
                        } else if (hasExtendedMediaPreview()) {
                            this.type = 20;
                        } else if (getMedia(this.messageOwner).ttl_seconds != 0 && ((getMedia(this.messageOwner).photo instanceof TLRPC.TL_photoEmpty) || (getDocument() instanceof TLRPC.TL_documentEmpty) || (((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) && getDocument() == null) || this.forceExpired))) {
                            this.contentType = 1;
                            this.type = 10;
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGiveaway) {
                            this.type = 26;
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGiveawayResults) {
                            this.type = 28;
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDice) {
                            this.type = 15;
                            if (getMedia(this.messageOwner).document == null) {
                                getMedia(this.messageOwner).document = new TLRPC.TL_document();
                                getMedia(this.messageOwner).document.file_reference = new byte[0];
                                getMedia(this.messageOwner).document.mime_type = "application/x-tgsdice";
                                getMedia(this.messageOwner).document.dc_id = Integer.MIN_VALUE;
                                getMedia(this.messageOwner).document.f19165id = -2147483648L;
                                TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                tL_documentAttributeImageSize.f19166w = 512;
                                tL_documentAttributeImageSize.h = 512;
                                getMedia(this.messageOwner).document.attributes.add(tL_documentAttributeImageSize);
                            }
                        } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
                            if (isVideo()) {
                                i13 = 3;
                            }
                            this.type = i13;
                        } else if (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGeo) && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaVenue) && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGeoLive)) {
                            if (isRoundVideo()) {
                                this.type = 5;
                            } else if (isVideo()) {
                                this.type = 3;
                            } else if (isVoice()) {
                                this.type = 2;
                            } else if (isMusic()) {
                                this.type = 14;
                            } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaContact) {
                                this.type = 12;
                            } else if (!(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPoll) && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaToDo)) {
                                if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaUnsupported) {
                                    this.type = 0;
                                } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument) {
                                    TLRPC.Document document3 = getDocument();
                                    if (document3 != null && document3.mime_type != null) {
                                        if (isGifDocument(document3, hasValidGroupId())) {
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
                                } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
                                    this.type = 0;
                                } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) {
                                    this.type = 0;
                                } else if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaStory) {
                                    if (getMedia(this.messageOwner).via_mention) {
                                        i10 = 24;
                                    } else {
                                        i10 = 23;
                                    }
                                    this.type = i10;
                                    if (i10 == 24) {
                                        this.contentType = 1;
                                    }
                                }
                            } else {
                                this.type = 17;
                                this.checkedVotes = new ArrayList<>();
                            }
                        } else {
                            this.type = 4;
                        }
                    } else if (isSticker()) {
                        this.type = 13;
                    } else {
                        this.type = 15;
                    }
                }
            }
        }
        if (i12 != 1000 && i12 != (i11 = this.type) && i11 != 19) {
            updateMessageText(MessagesController.getInstance(this.currentAccount).getUsers(), MessagesController.getInstance(this.currentAccount).getChats(), null, null);
            generateThumbs(false);
        }
    }

    public boolean shouldAnimateSending() {
        if (this.wasJustSent) {
            if (this.type != 5 && !isVoice()) {
                if (!isAnyKindOfSticker() || this.sendAnimationData == null) {
                    if (this.messageText != null && this.sendAnimationData != null) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean shouldDrawReactions() {
        if (this.isRepostPreview) {
            return false;
        }
        return true;
    }

    public boolean shouldDrawReactionsInLayout() {
        return true;
    }

    public boolean shouldDrawWithoutBackground() {
        if (!isSponsored()) {
            int i10 = this.type;
            if (i10 == 13 || i10 == 15 || i10 == 5 || i10 == 19 || isExpiredStory()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void spoilLoginCode() {
        TLRPC.Message message;
        if (!this.spoiledLoginCode && this.messageText != null && (message = this.messageOwner) != null && message.entities != null) {
            TLRPC.Peer peer = message.from_id;
            if (peer instanceof TLRPC.TL_peerUser) {
                long j10 = peer.user_id;
                if (j10 == 777000 || j10 == 489000) {
                    if (loginCodePattern == null) {
                        loginCodePattern = Pattern.compile("[\\d\\-]{5,8}");
                    }
                    try {
                        Matcher matcher = loginCodePattern.matcher(this.messageText);
                        if (matcher.find()) {
                            TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                            tL_messageEntitySpoiler.offset = matcher.start();
                            tL_messageEntitySpoiler.length = matcher.end() - tL_messageEntitySpoiler.offset;
                            this.messageOwner.entities.add(tL_messageEntitySpoiler);
                        }
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
                    }
                    this.spoiledLoginCode = true;
                }
            }
        }
    }

    public int textHeight() {
        RichMessageLayout richMessageLayout = this.richLayout;
        if (richMessageLayout != null) {
            return richMessageLayout.getHeight();
        }
        if (this.textLayoutBlocks == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.textLayoutBlocks.size(); i11++) {
            i10 += this.textLayoutBlocks.get(i11).height() + this.textLayoutBlocks.get(i11).padTop + this.textLayoutBlocks.get(i11).padBottom;
        }
        return i10;
    }

    public int textHeightCached() {
        RichMessageLayout richMessageLayout = this.richLayout;
        if (richMessageLayout != null) {
            return richMessageLayout.getHeight();
        }
        Integer num = this.cachedTextHeight;
        if (num != null) {
            return num.intValue();
        }
        if (this.textLayoutBlocks == null) {
            this.cachedTextHeight = 0;
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.textLayoutBlocks.size(); i11++) {
            i10 += this.textLayoutBlocks.get(i11).heightCollapsed() + this.textLayoutBlocks.get(i11).padTop + this.textLayoutBlocks.get(i11).padBottom;
        }
        this.cachedTextHeight = Integer.valueOf(i10);
        return i10;
    }

    public void toggleChannelRecommendations() {
        expandChannelRecommendations(!this.channelJoinedExpanded);
    }

    public void updateMessageText() {
        updateMessageText(MessagesController.getInstance(this.currentAccount).getUsers(), MessagesController.getInstance(this.currentAccount).getChats(), null, null);
    }

    public void updateQualitiesCached(boolean z4) {
        ArrayList<e71> arrayList = this.videoQualities;
        if (arrayList == null) {
            this.cachedQuality = null;
            hasVideoQualities(z4);
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            e71 e71Var = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = e71Var.d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList2.get(i11);
                i11++;
                ((g71) obj).e(z4);
            }
        }
        this.highestQuality = i71.v(this.videoQualities);
        this.thumbQuality = i71.w(this.videoQualities);
        this.cachedQuality = i71.k(this.videoQualities);
    }

    public boolean updateSideMenuEnabled(boolean z4) {
        if (this.sideMenuEnabled == z4) {
            return false;
        }
        this.sideMenuEnabled = z4;
        generateLayout(null);
        return true;
    }

    public boolean updateTranslation() {
        return updateTranslation(false);
    }

    public static class GroupedMessages {
        public boolean captionAbove;
        public MessageObject captionMessage;
        public long groupId;
        public boolean hasCaption;
        public boolean hasSibling;
        public boolean isDocuments;
        public boolean reversed;
        public ArrayList<MessageObject> messages = new ArrayList<>();
        public ArrayList<GroupedMessagePosition> posArray = new ArrayList<>();
        public HashMap<MessageObject, GroupedMessagePosition> positions = new HashMap<>();
        public a0.h positionsArray = new a0.h();
        public int cachedWidthForCaption = -1;
        private int maxSizeWidth = 800;
        public final TransitionParams transitionParams = new TransitionParams();

        public static class TransitionParams {
            public boolean backgroundChangeBounds;
            public int bottom;
            public float captionEnterProgress = 1.0f;
            public org.telegram.ui.Cells.s1 cell;
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

        private float multiHeight(float[] fArr, int i10, int i11) {
            float f10 = 0.0f;
            while (i10 < i11) {
                f10 += fArr[i10];
                i10++;
            }
            return this.maxSizeWidth / f10;
        }

        public void calculate() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.GroupedMessages.calculate():void");
        }

        public boolean contains(int i10) {
            if (this.messages == null) {
                return false;
            }
            for (int i11 = 0; i11 < this.messages.size(); i11++) {
                MessageObject messageObject = this.messages.get(i11);
                if (messageObject != null && messageObject.getId() == i10) {
                    return true;
                }
            }
            return false;
        }

        public MessageObject findCaptionMessageObject() {
            if (!this.messages.isEmpty() && this.positions.isEmpty()) {
                calculate();
            }
            MessageObject messageObject = null;
            for (int i10 = 0; i10 < this.messages.size(); i10++) {
                MessageObject messageObject2 = this.messages.get(i10);
                if (!TextUtils.isEmpty(messageObject2.caption)) {
                    if (messageObject != null) {
                        return null;
                    }
                    messageObject = messageObject2;
                }
            }
            return messageObject;
        }

        public MessageObject findMessageWithFlags(int i10) {
            if (!this.messages.isEmpty() && this.positions.isEmpty()) {
                calculate();
            }
            for (int i11 = 0; i11 < this.messages.size(); i11++) {
                MessageObject messageObject = this.messages.get(i11);
                GroupedMessagePosition groupedMessagePosition = this.positions.get(messageObject);
                if (groupedMessagePosition != null && (groupedMessagePosition.flags & i10) == i10) {
                    return messageObject;
                }
            }
            return null;
        }

        public MessageObject findPrimaryMessageObject() {
            int i10;
            if (this.reversed) {
                i10 = 10;
            } else {
                i10 = 5;
            }
            return findMessageWithFlags(i10);
        }

        public int getMaxEditDate() {
            TLRPC.Message message;
            int i10 = 0;
            for (int i11 = 0; i11 < this.messages.size(); i11++) {
                MessageObject messageObject = this.messages.get(i11);
                if (messageObject != null && (message = messageObject.messageOwner) != null) {
                    i10 = Math.max(i10, message.edit_date);
                }
            }
            return i10;
        }

        public GroupedMessagePosition getPosition(MessageObject messageObject) {
            if (messageObject == null) {
                return null;
            }
            GroupedMessagePosition groupedMessagePosition = this.positions.get(messageObject);
            if (groupedMessagePosition == null) {
                return (GroupedMessagePosition) this.positionsArray.f(messageObject.getId());
            }
            return groupedMessagePosition;
        }

        public static class MessageGroupedLayoutAttempt {
            public float[] heights;
            public int[] lineCounts;

            public MessageGroupedLayoutAttempt(int i10, int i11, float f10, float f11) {
                this.lineCounts = new int[]{i10, i11};
                this.heights = new float[]{f10, f11};
            }

            public MessageGroupedLayoutAttempt(int i10, int i11, int i12, float f10, float f11, float f12) {
                this.lineCounts = new int[]{i10, i11, i12};
                this.heights = new float[]{f10, f11, f12};
            }

            public MessageGroupedLayoutAttempt(int i10, int i11, int i12, int i13, float f10, float f11, float f12, float f13) {
                this.lineCounts = new int[]{i10, i11, i12, i13};
                this.heights = new float[]{f10, f11, f12, f13};
            }
        }
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
        public final ArrayList<TextLayoutBlock> textLayoutBlocks = new ArrayList<>();
        public int textWidth;
        public float textXOffset;

        public TextLayoutBlocks(org.telegram.messenger.MessageObject r33, java.lang.CharSequence r34, android.text.TextPaint r35, int r36) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.TextLayoutBlocks.<init>(org.telegram.messenger.MessageObject, java.lang.CharSequence, android.text.TextPaint, int):void");
        }

        public void bounceFrom(TextLayoutBlocks textLayoutBlocks) {
            if (textLayoutBlocks != null) {
                for (int i10 = 0; i10 < Math.min(this.textLayoutBlocks.size(), textLayoutBlocks.textLayoutBlocks.size()); i10++) {
                    this.textLayoutBlocks.get(i10).collapsedBounce = textLayoutBlocks.textLayoutBlocks.get(i10).collapsedBounce;
                }
            }
        }

        public int textHeight() {
            int i10 = 0;
            for (int i11 = 0; i11 < this.textLayoutBlocks.size(); i11++) {
                i10 += this.textLayoutBlocks.get(i11).height() + this.textLayoutBlocks.get(i11).padTop + this.textLayoutBlocks.get(i11).padBottom;
            }
            return i10;
        }

        public int textHeight(org.telegram.ui.Cells.r1 r1Var) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.textLayoutBlocks.size(); i11++) {
                i10 += this.textLayoutBlocks.get(i11).height(r1Var) + this.textLayoutBlocks.get(i11).padTop + this.textLayoutBlocks.get(i11).padBottom;
            }
            return i10;
        }
    }

    public static void addLinks(boolean z4, CharSequence charSequence, boolean z10, boolean z11) {
        addLinks(z4, charSequence, z10, z11, false);
    }

    public static boolean canEditMessage(int r10, org.telegram.tgnet.TLRPC.Message r11, org.telegram.tgnet.TLRPC.Chat r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.canEditMessage(int, org.telegram.tgnet.TLRPC$Message, org.telegram.tgnet.TLRPC$Chat, boolean):boolean");
    }

    public static boolean canEditMessageAnytime(int i10, TLRPC.Message message, TLRPC.Chat chat) {
        TLRPC.MessageAction messageAction;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        if (message != null && message.peer_id != null && ((getMedia(message) == null || (!isRoundVideoDocument(getMedia(message).document) && !isStickerDocument(getMedia(message).document) && !isAnimatedStickerDocument(getMedia(message).document, true))) && (((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty)) && !isForwardedMessage(message) && message.via_bot_id == 0 && message.f19180id >= 0))) {
            TLRPC.Peer peer = message.from_id;
            if (peer instanceof TLRPC.TL_peerUser) {
                long j10 = peer.user_id;
                if (j10 == message.peer_id.user_id && j10 == UserConfig.getInstance(i10).getClientUserId() && !isLiveLocationMessage(message)) {
                    return true;
                }
            }
            if (chat == null && message.peer_id.channel_id != 0 && (chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(message.peer_id.channel_id))) == null) {
                return false;
            }
            if (ChatObject.isChannel(chat) && !chat.megagroup && (chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.edit_messages))) {
                return true;
            }
            if (message.out && chat != null && chat.megagroup && (chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.pin_messages) || ((tL_chatBannedRights = chat.default_banned_rights) != null && !tL_chatBannedRights.pin_messages)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean canEditMessageScheduleTime(int i10, TLRPC.Message message, TLRPC.Chat chat) {
        if (message.video_processing_pending) {
            return false;
        }
        if (chat == null && message.peer_id.channel_id != 0 && (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(message.peer_id.channel_id))) == null) {
            return false;
        }
        if (!ChatObject.isChannel(chat) || chat.megagroup || chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        return tL_chatAdminRights != null && (tL_chatAdminRights.edit_messages || message.out);
    }

    public static boolean canPreviewDocument(TLRPC.Document document) {
        String str;
        if (document != null && (str = document.mime_type) != null) {
            if ((isDocumentHasThumb(document) && (str.equalsIgnoreCase("image/png") || str.equalsIgnoreCase("image/jpg") || str.equalsIgnoreCase("image/jpeg"))) || (Build.VERSION.SDK_INT >= 26 && str.equalsIgnoreCase("image/heic"))) {
                for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                        TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = (TLRPC.TL_documentAttributeImageSize) documentAttribute;
                        return tL_documentAttributeImageSize.f19166w < 6000 && tL_documentAttributeImageSize.h < 6000;
                    }
                }
            } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
                String documentFileName = FileLoader.getDocumentFileName(document);
                if ((documentFileName.startsWith("tg_secret_sticker") && documentFileName.endsWith("json")) || documentFileName.endsWith(".svg")) {
                    return true;
                }
            }
        }
        return false;
    }

    private void checkEmojiOnly(Integer num) {
        TextPaint textPaint;
        if (num != null && num.intValue() >= 1 && this.messageOwner != null && !hasNonEmojiEntities()) {
            CharSequence charSequence = this.messageText;
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), Emoji.EmojiSpan.class);
            CharSequence charSequence2 = this.messageText;
            org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) ((Spannable) charSequence2).getSpans(0, charSequence2.length(), org.telegram.ui.Components.u5.class);
            this.emojiOnlyCount = Math.max(num.intValue(), (emojiSpanArr == null ? 0 : emojiSpanArr.length) + (u5VarArr == null ? 0 : u5VarArr.length));
            this.totalAnimatedEmojiCount = u5VarArr == null ? 0 : u5VarArr.length;
            this.animatedEmojiCount = 0;
            if (u5VarArr != null) {
                for (org.telegram.ui.Components.u5 u5Var : u5VarArr) {
                    if (!u5Var.standard) {
                        this.animatedEmojiCount++;
                    }
                }
            }
            int i10 = this.emojiOnlyCount;
            boolean z4 = (i10 - (emojiSpanArr == null ? 0 : emojiSpanArr.length)) - (u5VarArr == null ? 0 : u5VarArr.length) > 0;
            this.hasUnwrappedEmoji = z4;
            if (i10 != 0 && !z4) {
                int i11 = this.animatedEmojiCount;
                boolean z10 = i10 == i11;
                int i12 = 2;
                switch (Math.max(i10, i11)) {
                    case 0:
                    case 1:
                    case 2:
                        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.f20252y2;
                        textPaint = z10 ? textPaintArr[0] : textPaintArr[2];
                        i12 = 1;
                        break;
                    case 3:
                        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.f20252y2;
                        textPaint = z10 ? textPaintArr2[1] : textPaintArr2[3];
                        i12 = 1;
                        break;
                    case 4:
                        TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.j6.f20252y2;
                        textPaint = z10 ? textPaintArr3[2] : textPaintArr3[4];
                        i12 = 1;
                        break;
                    case 5:
                        TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.j6.f20252y2;
                        if (z10) {
                            textPaint = textPaintArr4[3];
                            break;
                        } else {
                            textPaint = textPaintArr4[5];
                            break;
                        }
                    case 6:
                        TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.j6.f20252y2;
                        if (z10) {
                            textPaint = textPaintArr5[4];
                            break;
                        } else {
                            textPaint = textPaintArr5[5];
                            break;
                        }
                    default:
                        int i13 = this.emojiOnlyCount > 9 ? 0 : -1;
                        textPaint = org.telegram.ui.ActionBar.j6.f20252y2[5];
                        i12 = i13;
                        break;
                }
                int textSize = (int) (textPaint.getTextSize() + AndroidUtilities.dp(4.0f));
                if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.replaceFontMetrics(textPaint.getFontMetricsInt(), textSize);
                    }
                }
                if (u5VarArr == null || u5VarArr.length <= 0) {
                    return;
                }
                for (int i14 = 0; i14 < u5VarArr.length; i14++) {
                    u5VarArr[i14].replaceFontMetrics(textPaint.getFontMetricsInt(), textSize, i12);
                    u5VarArr[i14].full = true;
                }
                return;
            } else if (u5VarArr == null || u5VarArr.length <= 0) {
                return;
            } else {
                for (int i15 = 0; i15 < u5VarArr.length; i15++) {
                    u5VarArr[i15].replaceFontMetrics(org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt(), (int) (org.telegram.ui.ActionBar.j6.f20074o2.getTextSize() + AndroidUtilities.dp(4.0f)), -1);
                    u5VarArr[i15].full = false;
                }
                return;
            }
        }
        CharSequence charSequence3 = this.messageText;
        org.telegram.ui.Components.u5[] u5VarArr2 = (org.telegram.ui.Components.u5[]) ((Spannable) charSequence3).getSpans(0, charSequence3.length(), org.telegram.ui.Components.u5.class);
        if (u5VarArr2 != null && u5VarArr2.length > 0) {
            this.totalAnimatedEmojiCount = u5VarArr2.length;
            for (int i16 = 0; i16 < u5VarArr2.length; i16++) {
                u5VarArr2[i16].replaceFontMetrics(org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt(), (int) (org.telegram.ui.ActionBar.j6.f20074o2.getTextSize() + AndroidUtilities.dp(4.0f)), -1);
                u5VarArr2[i16].full = false;
            }
            return;
        }
        this.totalAnimatedEmojiCount = 0;
    }

    public static String findAnimatedEmojiEmoticon(TLRPC.Document document, String str) {
        return findAnimatedEmojiEmoticon(document, str, null);
    }

    public static TLRPC.Document findAudio(ArrayList<TL_iv.PageBlock> arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.PageBlock pageBlock = arrayList.get(i10);
                i10++;
                TL_iv.PageBlock pageBlock2 = pageBlock;
                if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                    return AndroidUtilities.findDocument(richMessage.documents, ((TL_iv.pageBlockAudio) pageBlock2).audio_id);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockCollage) {
                    return findAudio(((TL_iv.pageBlockCollage) pageBlock2).items, richMessage);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockSlideshow) {
                    return findAudio(((TL_iv.pageBlockSlideshow) pageBlock2).items, richMessage);
                }
            }
        }
        return null;
    }

    public static TLRPC.Photo findPhoto(ArrayList<TL_iv.PageBlock> arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.PageBlock pageBlock = arrayList.get(i10);
                i10++;
                TL_iv.PageBlock pageBlock2 = pageBlock;
                if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                    return AndroidUtilities.findPhoto(richMessage.photos, ((TL_iv.pageBlockPhoto) pageBlock2).photo_id);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockCollage) {
                    return findPhoto(((TL_iv.pageBlockCollage) pageBlock2).items, richMessage);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockSlideshow) {
                    return findPhoto(((TL_iv.pageBlockSlideshow) pageBlock2).items, richMessage);
                }
            }
        }
        return null;
    }

    public static TLRPC.Document findVideo(ArrayList<TL_iv.PageBlock> arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.PageBlock pageBlock = arrayList.get(i10);
                i10++;
                TL_iv.PageBlock pageBlock2 = pageBlock;
                if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                    return AndroidUtilities.findDocument(richMessage.documents, ((TL_iv.pageBlockVideo) pageBlock2).video_id);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockCollage) {
                    return findVideo(((TL_iv.pageBlockCollage) pageBlock2).items, richMessage);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockSlideshow) {
                    return findVideo(((TL_iv.pageBlockSlideshow) pageBlock2).items, richMessage);
                }
            }
        }
        return null;
    }

    public static CharSequence formatRichMessage(TL_iv.RichMessage richMessage, boolean z4, boolean z10, int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (richMessage != null) {
            int i11 = 0;
            while (i11 < richMessage.blocks.size()) {
                TL_iv.PageBlock pageBlock = richMessage.blocks.get(i11);
                if (i11 > 0) {
                    spannableStringBuilder.append((CharSequence) "  ");
                }
                TL_iv.RichMessage richMessage2 = richMessage;
                boolean z11 = z4;
                boolean z12 = z10;
                int i12 = i10;
                formatRichBlock(pageBlock, z11, z12, i12, spannableStringBuilder, richMessage2);
                if (spannableStringBuilder.length() >= i12) {
                    spannableStringBuilder.delete(i12, spannableStringBuilder.length());
                    spannableStringBuilder.append((CharSequence) "…");
                    return spannableStringBuilder;
                }
                i11++;
                z4 = z11;
                z10 = z12;
                i10 = i12;
                richMessage = richMessage2;
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence formatTextWithEntities(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z4) {
        org.telegram.ui.ActionBar.j6.N();
        TextPaint textPaint = org.telegram.ui.ActionBar.j6.f20146s2;
        if (textPaint == null) {
            textPaint = new TextPaint(1);
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        }
        return formatTextWithEntities(tL_textWithEntities, z4, textPaint);
    }

    public static String getArtworkUrl(TLRPC.Document document, boolean z4) {
        if (document == null || "audio/ogg".equals(document.mime_type)) {
            return null;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                if (documentAttribute.voice) {
                    return null;
                }
                String str = documentAttribute.performer;
                String str2 = documentAttribute.title;
                if (!TextUtils.isEmpty(str)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr = excludeWords;
                        if (i11 >= strArr.length) {
                            break;
                        }
                        str = str.replace(strArr[i11], " ");
                        i11++;
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
                    sb.append(z4 ? "&s=1" : "");
                    return sb.toString();
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public static long getChannelId(TLRPC.Message message) {
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            return peer.channel_id;
        }
        return 0L;
    }

    public static long getDialogId(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message.dialog_id == 0 && (peer = message.peer_id) != null) {
            long j10 = peer.chat_id;
            if (j10 != 0) {
                message.dialog_id = -j10;
            } else {
                long j11 = peer.channel_id;
                if (j11 != 0) {
                    message.dialog_id = -j11;
                } else if (message.from_id != null && !isOut(message) && message.guestchat_via_from == null) {
                    message.dialog_id = message.from_id.user_id;
                } else {
                    message.dialog_id = message.peer_id.user_id;
                }
            }
        }
        return message.dialog_id;
    }

    public static long getMonoForumTopicId(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message == null || (peer = message.saved_peer_id) == null) {
            return 0L;
        }
        long j10 = peer.chat_id;
        if (j10 != 0) {
            return -j10;
        }
        long j11 = peer.channel_id;
        return j11 != 0 ? -j11 : peer.user_id;
    }

    public static TLRPC.Photo getPhoto(TLRPC.Message message) {
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return findPhoto(richMessage);
        }
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return getMedia(message).webpage.photo;
        }
        if (getMedia(message) != null) {
            return getMedia(message).photo;
        }
        return null;
    }

    public static TLRPC.VideoSize getPremiumStickerAnimation(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i10 = 0; i10 < document.video_thumbs.size(); i10++) {
                if ("f".equals(document.video_thumbs.get(i10).type)) {
                    return document.video_thumbs.get(i10);
                }
            }
        }
        return null;
    }

    public static long getSavedDialogId(long j10, TLRPC.Message message) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2 = message.saved_peer_id;
        if (peer2 != null) {
            long j11 = peer2.chat_id;
            if (j11 != 0) {
                return -j11;
            }
            long j12 = peer2.channel_id;
            return j12 != 0 ? -j12 : peer2.user_id;
        } else if (message.from_id.user_id == j10) {
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                return DialogObject.getPeerDialogId(peer);
            }
            if ((messageFwdHeader == null || messageFwdHeader.from_id == null) && messageFwdHeader != null) {
                return 2666000L;
            }
            return j10;
        } else {
            return 0L;
        }
    }

    private static long getTopicId(int i10, TLRPC.Message message) {
        return getTopicId(i10, message, false);
    }

    private void handleFoundWords(ArrayList<String> arrayList, String[] strArr, boolean z4, boolean z10) {
        CharSequence charSequence;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        boolean z11;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z12 = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= strArr.length) {
                    break;
                } else if (arrayList.get(i10).contains(strArr[i11])) {
                    z12 = true;
                    break;
                } else {
                    i11++;
                }
            }
            if (z12) {
                break;
            }
        }
        if (z12) {
            int i12 = 0;
            while (i12 < arrayList.size()) {
                int i13 = 0;
                while (true) {
                    if (i13 >= strArr.length) {
                        z11 = false;
                        break;
                    } else if (arrayList.get(i12).contains(strArr[i13])) {
                        z11 = true;
                        break;
                    } else {
                        i13++;
                    }
                }
                if (!z11) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (arrayList.size() > 0) {
                Collections.sort(arrayList, new d(13));
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
            CharSequence replaceMultipleCharSequence = AndroidUtilities.replaceMultipleCharSequence("\n", charSequence, " ");
            if (z4 && (message = this.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.quote_text != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.messageOwner.reply_to.quote_text);
                addEntitiesToText(spannableStringBuilder, this.messageOwner.reply_to.quote_entities, isOutOwner(), false, false, false);
                SpannableString spannableString = new SpannableString("q ");
                lq lqVar = new lq(R.drawable.mini_quote, 0);
                lqVar.setOverrideColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20115q6, false));
                spannableString.setSpan(lqVar, 0, 1, 33);
                replaceMultipleCharSequence = new SpannableStringBuilder(spannableString).append((CharSequence) spannableStringBuilder).append('\n').append(replaceMultipleCharSequence);
            }
            String charSequence2 = replaceMultipleCharSequence.toString();
            int length = charSequence2.length();
            int indexOf = charSequence2.toLowerCase().indexOf(arrayList.get(0));
            if (indexOf < 0) {
                indexOf = 0;
            }
            if (length > 120 && z10) {
                float f10 = 120;
                int max = Math.max(0, indexOf - ((int) (0.1f * f10)));
                replaceMultipleCharSequence = replaceMultipleCharSequence.subSequence(max, Math.min(length, (indexOf - max) + indexOf + ((int) (f10 * 0.9f))));
            }
            this.messageTrimmedToHighlight = replaceMultipleCharSequence;
            this.messageTrimmedToHighlightCut = z10;
        }
    }

    public static boolean hasUnreadReactions(TLRPC.TL_messageReactions tL_messageReactions) {
        if (tL_messageReactions == null) {
            return false;
        }
        for (int i10 = 0; i10 < tL_messageReactions.recent_reactions.size(); i10++) {
            if (tL_messageReactions.recent_reactions.get(i10).unread) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnimatedStickerDocument(TLRPC.Document document, boolean z4) {
        if (document != null && (("application/x-tgsticker".equals(document.mime_type) && !document.thumbs.isEmpty()) || "application/x-tgsdice".equals(document.mime_type))) {
            if (z4) {
                return true;
            }
            int size = document.attributes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    return documentAttribute.stickerset instanceof TLRPC.TL_inputStickerSetShortName;
                }
                if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isContentUnread(TLRPC.Message message) {
        return message.media_unread;
    }

    public static boolean isEphemeral(TLRPC.Message message) {
        if (message != null) {
            return isEphemeralMessageId(message.f19180id) || message.ephemeralReceiverBotId != 0;
        }
        return false;
    }

    public static boolean isEphemeralAndNotWelcome(TLRPC.Message message) {
        return isEphemeral(message) && !isWelcomeMessage(message);
    }

    public static boolean isGifDocument(TLRPC.Document document) {
        return isGifDocument(document, false);
    }

    public static boolean isMediaEmptyWebpage(TLRPC.Message message) {
        return message == null || getMedia(message) == null || (getMedia(message) instanceof TLRPC.TL_messageMediaEmpty);
    }

    public static boolean isOut(TLRPC.Message message) {
        return message.out;
    }

    public static boolean isUnread(TLRPC.Message message) {
        return message.unread;
    }

    public static boolean isWelcomeAnchored(TLRPC.Message message) {
        return isEphemeral(message) && message.ephemeralAnchorMsgId != 0;
    }

    public static boolean isWelcomeMessage(TLRPC.Message message) {
        if (isEphemeral(message)) {
            return message.ephemeralReceiverBotId == -1 || message.ephemeralAnchorMsgId != 0;
        }
        return false;
    }

    public static StaticLayout makeStaticLayout(CharSequence charSequence, TextPaint textPaint, int i10, float f10, float f11, boolean z4, Layout.Alignment alignment) {
        int i11 = i10 <= 0 ? 1 : i10;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 24) {
            StaticLayout.Builder alignment2 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setLineSpacing(f11, f10).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment);
            if (z4) {
                alignment2.setIncludePad(false);
            }
            if (i12 >= 28) {
                alignment2.setUseLineSpacingFromFallbacks(false);
            }
            StaticLayout build = alignment2.build();
            for (int i13 = 0; i13 < build.getLineCount(); i13++) {
                if (build.getLineRight(i13) > i11) {
                    StaticLayout.Builder alignment3 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setLineSpacing(f11, f10).setBreakStrategy(0).setHyphenationFrequency(0).setAlignment(alignment);
                    if (z4) {
                        alignment3.setIncludePad(false);
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        alignment3.setUseLineSpacingFromFallbacks(false);
                    }
                    return alignment3.build();
                }
            }
            return build;
        }
        return new StaticLayout(charSequence, textPaint, i11, alignment, f10, f11, false);
    }

    public static CharSequence peerNameWithIcon(int i10, TLRPC.Peer peer, boolean z4) {
        TLRPC.Chat chat;
        if (peer instanceof TLRPC.TL_peerUser) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peer.user_id));
            if (user != null) {
                if (z4) {
                    return new SpannableStringBuilder(userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(user));
                }
                return UserObject.getUserName(user);
            }
            return "";
        } else if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(peer.chat_id));
            if (chat2 != null) {
                if (z4) {
                    return new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat2) ? channelSpan() : groupSpan()).append((CharSequence) " ").append((CharSequence) chat2.title);
                }
                return chat2.title;
            }
            return "";
        } else if (!(peer instanceof TLRPC.TL_peerChannel) || (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(peer.channel_id))) == null) {
            return "";
        } else {
            if (z4) {
                return new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? channelSpan() : groupSpan()).append((CharSequence) " ").append((CharSequence) chat.title);
            }
            return chat.title;
        }
    }

    public static Spannable replaceAnimatedEmoji(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, Paint.FontMetricsInt fontMetricsInt) {
        return replaceAnimatedEmoji(charSequence, arrayList, fontMetricsInt, false);
    }

    private void updateMessageText(java.util.AbstractMap<java.lang.Long, org.telegram.tgnet.TLRPC.User> r33, java.util.AbstractMap<java.lang.Long, org.telegram.tgnet.TLRPC.Chat> r34, a0.h r35, a0.h r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.updateMessageText(java.util.AbstractMap, java.util.AbstractMap, a0.h, a0.h):void");
    }

    public static CharSequence userSpan(int i10) {
        if (userSpan == null) {
            userSpan = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = userSpan;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableStringBuilder("u");
            lq lqVar = new lq(R.drawable.mini_reply_user, 0);
            lqVar.spaceScaleX = 0.9f;
            if (i10 == 0) {
                lqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
            }
            ((SpannableStringBuilder) userSpan[i10]).setSpan(lqVar, 0, 1, 33);
        }
        return userSpan[i10];
    }

    public boolean addEntitiesToText(CharSequence charSequence, boolean z4, boolean z10) {
        if (charSequence == null) {
            return false;
        }
        if (!this.isRestrictedMessage && !(getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaUnsupported)) {
            return addEntitiesToText(charSequence, getEntities(), isOutOwner(), true, z4, z10);
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
        tL_messageEntityItalic.offset = 0;
        tL_messageEntityItalic.length = charSequence.length();
        arrayList.add(tL_messageEntityItalic);
        return addEntitiesToText(charSequence, arrayList, isOutOwner(), true, z4, z10);
    }

    public void applyTimestampsHighlightForReplyMsg(CharSequence charSequence) {
        TLRPC.Message message;
        MessageObject messageObject = this.replyMessageObject;
        if (messageObject == null) {
            return;
        }
        if (messageObject.isYouTubeVideo()) {
            addUrlsByPattern(isOutOwner(), charSequence, false, 3, Integer.MAX_VALUE, false);
        } else if (messageObject.isVideo()) {
            addUrlsByPattern(isOutOwner(), charSequence, false, 3, (int) messageObject.getDuration(), false);
        } else {
            if (messageObject.isMusic() || messageObject.isVoice()) {
                addUrlsByPattern(isOutOwner(), charSequence, false, 4, (int) messageObject.getDuration(), false);
            }
            if (charSequence != this.messageText || (message = this.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionTodoCompletions) || (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks)) {
                updateMessageText();
            }
        }
    }

    public void checkMediaExistance(boolean z4) {
        int i10;
        this.attachPathExists = false;
        this.mediaExists = false;
        int i11 = this.type;
        if (i11 == 20) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.messageOwner.media.extended_media.get(0);
            if (tL_messageExtendedMediaPreview.thumb != null) {
                File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(tL_messageExtendedMediaPreview.thumb, z4);
                if (!this.mediaExists) {
                    this.mediaExists = pathToAttach.exists() || (tL_messageExtendedMediaPreview.thumb instanceof TLRPC.TL_photoStrippedSize);
                }
            }
        } else if (i11 == 1 && FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, AndroidUtilities.getPhotoSize(true)) != null) {
            File pathToMessage = FileLoader.getInstance(this.currentAccount).getPathToMessage(this.messageOwner, z4);
            if (needDrawBluredPreview()) {
                this.mediaExists = new File(pathToMessage.getAbsolutePath() + ".enc").exists();
            }
            if (!this.mediaExists) {
                this.mediaExists = pathToMessage.exists();
            }
        }
        if ((!this.mediaExists && this.type == 8) || (i10 = this.type) == 3 || i10 == 9 || i10 == 2 || i10 == 14 || i10 == 5) {
            String str = this.messageOwner.attachPath;
            if (str != null && str.length() > 0) {
                this.attachPathExists = new File(this.messageOwner.attachPath).exists();
            }
            if (!this.attachPathExists) {
                File pathToMessage2 = FileLoader.getInstance(this.currentAccount).getPathToMessage(this.messageOwner, z4);
                if ((this.type == 3 && needDrawBluredPreview()) || isVoiceOnce() || isRoundOnce()) {
                    this.mediaExists = new File(pathToMessage2.getAbsolutePath() + ".enc").exists();
                }
                if (!this.mediaExists) {
                    this.mediaExists = pathToMessage2.exists();
                }
            }
        }
        if (!this.mediaExists) {
            TLRPC.Document document = getDocument();
            if (document != null) {
                if (isWallpaper()) {
                    this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(document, null, true, z4).exists();
                } else {
                    this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(document, null, false, z4).exists();
                }
            } else {
                int i12 = this.type;
                if (i12 == 0) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, AndroidUtilities.getPhotoSize());
                    if (closestPhotoSizeWithSize == null) {
                        return;
                    }
                    this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, null, true, z4).exists();
                } else if (i12 == 11) {
                    TLRPC.Photo photo = this.messageOwner.action.photo;
                    if (photo == null || photo.video_sizes.isEmpty()) {
                        return;
                    }
                    this.mediaExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(photo.video_sizes.get(0), null, true, z4).exists();
                }
            }
        }
        updateQualitiesCached(z4);
    }

    public void createMessageSendInfo(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.createMessageSendInfo(boolean):void");
    }

    public int getApproximateHeight(boolean z4) {
        int i10;
        int i11;
        int min;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int min2;
        int textHeightCached;
        int dp;
        int i12 = this.type;
        int i13 = 0;
        if (i12 == 0) {
            int textHeightCached2 = z4 ? textHeightCached() : textHeight();
            if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage)) {
                i13 = AndroidUtilities.dp(100.0f);
            }
            textHeightCached = textHeightCached2 + i13;
            if (!isReply()) {
                return textHeightCached;
            }
            dp = AndroidUtilities.dp(42.0f);
        } else if (i12 == 20) {
            return AndroidUtilities.getPhotoSize();
        } else {
            if (i12 == 2) {
                return AndroidUtilities.dp(72.0f);
            }
            if (i12 == 12) {
                return AndroidUtilities.dp(71.0f);
            }
            if (i12 == 9) {
                return AndroidUtilities.dp(100.0f);
            }
            if (i12 == 4) {
                return AndroidUtilities.dp(114.0f);
            }
            if (i12 == 14) {
                return AndroidUtilities.dp(82.0f);
            }
            if (i12 == 10 || i12 == 35 || i12 == 33 || i12 == 34) {
                return AndroidUtilities.dp(30.0f);
            }
            if (i12 == 11 || i12 == 18 || i12 == 31 || i12 == 30 || i12 == 25 || i12 == 21) {
                return AndroidUtilities.dp(50.0f);
            }
            if (i12 == 32) {
                return AndroidUtilities.dp(234.0f);
            }
            if (i12 == 5) {
                return AndroidUtilities.roundMessageSize;
            }
            if (i12 != 19) {
                if (i12 != 13 && i12 != 15) {
                    if (AndroidUtilities.isTablet()) {
                        min = AndroidUtilities.getMinTabletSide();
                    } else {
                        Point point = AndroidUtilities.displaySize;
                        min = Math.min(point.x, point.y);
                    }
                    int i14 = (int) (min * 0.7f);
                    int dp2 = AndroidUtilities.dp(100.0f) + i14;
                    if (i14 > AndroidUtilities.getPhotoSize()) {
                        i14 = AndroidUtilities.getPhotoSize();
                    }
                    if (dp2 > AndroidUtilities.getPhotoSize()) {
                        dp2 = AndroidUtilities.getPhotoSize();
                    }
                    if (z4) {
                        ArrayList<TLRPC.PhotoSize> arrayList = this.photoThumbs;
                        closestPhotoSizeWithSize = (arrayList == null || arrayList.isEmpty()) ? null : this.photoThumbs.get(0);
                    } else {
                        closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.photoThumbs, AndroidUtilities.getPhotoSize());
                    }
                    if (closestPhotoSizeWithSize != null) {
                        int i15 = (int) (closestPhotoSizeWithSize.h / (closestPhotoSizeWithSize.f19184w / i14));
                        if (i15 == 0) {
                            i15 = AndroidUtilities.dp(100.0f);
                        }
                        if (i15 <= dp2) {
                            dp2 = i15 < AndroidUtilities.dp(120.0f) ? AndroidUtilities.dp(120.0f) : i15;
                        }
                        if (!z4 && needDrawBluredPreview()) {
                            if (AndroidUtilities.isTablet()) {
                                min2 = AndroidUtilities.getMinTabletSide();
                            } else {
                                Point point2 = AndroidUtilities.displaySize;
                                min2 = Math.min(point2.x, point2.y);
                            }
                            dp2 = (int) (min2 * 0.5f);
                        }
                    }
                    return AndroidUtilities.dp(14.0f) + dp2;
                }
                float f10 = AndroidUtilities.displaySize.y * 0.4f;
                if (AndroidUtilities.isTablet()) {
                    i10 = AndroidUtilities.getMinTabletSide();
                } else {
                    i10 = AndroidUtilities.displaySize.x;
                }
                float f11 = i10 * 0.5f;
                TLRPC.Document document = getDocument();
                if (document != null) {
                    int size = document.attributes.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i16);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                            i13 = documentAttribute.f19166w;
                            i11 = documentAttribute.h;
                            break;
                        }
                    }
                }
                i11 = 0;
                if (i13 == 0) {
                    i11 = (int) f10;
                    i13 = AndroidUtilities.dp(100.0f) + i11;
                }
                float f12 = i11;
                if (f12 > f10) {
                    i13 = (int) ((f10 / f12) * i13);
                    i11 = (int) f10;
                }
                float f13 = i13;
                if (f13 > f11) {
                    i11 = (int) ((f11 / f13) * i11);
                }
                return AndroidUtilities.dp(14.0f) + i11;
            }
            textHeightCached = z4 ? textHeightCached() : textHeight();
            dp = AndroidUtilities.dp(30.0f);
        }
        return dp + textHeightCached;
    }

    public long getFromChatId() {
        return getFromChatId(this.messageOwner);
    }

    public java.lang.String getMusicAuthor(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.getMusicAuthor(boolean):java.lang.String");
    }

    public String getMusicTitle(boolean z4) {
        TLRPC.Document document = getDocument();
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    if (documentAttribute.voice) {
                        if (z4) {
                            return LocaleController.formatDateAudio(this.messageOwner.date, true);
                        }
                        return null;
                    }
                    String str = documentAttribute.title;
                    if (str == null || str.length() == 0) {
                        String documentFileName = FileLoader.getDocumentFileName(document);
                        return (TextUtils.isEmpty(documentFileName) && z4) ? LocaleController.getString(R.string.AudioUnknownTitle) : documentFileName;
                    }
                    return str;
                } else if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.round_message) {
                    if (isQuickReply()) {
                        int i11 = R.string.BusinessInReplies;
                        return LocaleController.formatString(i11, "/" + getQuickReplyDisplayName());
                    }
                    return LocaleController.formatDateAudio(this.messageOwner.date, true);
                }
            }
            String documentFileName2 = FileLoader.getDocumentFileName(document);
            if (!TextUtils.isEmpty(documentFileName2)) {
                return documentFileName2;
            }
        }
        return LocaleController.getString(R.string.AudioUnknownTitle);
    }

    public int getReplyTopMsgId(boolean z4) {
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader != null) {
            if (z4 && (messageReplyHeader.flags & 2) > 0 && messageReplyHeader.reply_to_top_id == 0) {
                return 1;
            }
            return messageReplyHeader.reply_to_top_id;
        }
        return 0;
    }

    public boolean hasVideoQualities(boolean z4) {
        TLRPC.MessageMedia messageMedia;
        ArrayList<e71> s6;
        if (this.videoQualitiesCached == null) {
            try {
                TLRPC.Message message = this.messageOwner;
                if (message != null && (messageMedia = message.media) != null && messageMedia.document != null && !messageMedia.alt_documents.isEmpty()) {
                    int i10 = this.currentAccount;
                    TLRPC.Message message2 = this.messageOwner;
                    TLRPC.MessageMedia messageMedia2 = message2 != null ? message2.media : null;
                    int i11 = i71.f25617g0;
                    if (!(messageMedia2 instanceof TLRPC.TL_messageMediaDocument)) {
                        s6 = new ArrayList<>();
                    } else {
                        s6 = i71.s(i10, messageMedia2.document, messageMedia2.alt_documents, 0, z4);
                    }
                    this.videoQualities = s6;
                    this.videoQualitiesCached = Boolean.valueOf(s6.size() > 1);
                    this.highestQuality = i71.v(this.videoQualities);
                    this.thumbQuality = i71.w(this.videoQualities);
                    this.cachedQuality = i71.k(this.videoQualities);
                }
                this.videoQualitiesCached = Boolean.FALSE;
                return false;
            } catch (Exception e) {
                FileLog.e(e);
                this.videoQualitiesCached = Boolean.FALSE;
            }
        }
        return this.videoQualitiesCached.booleanValue();
    }

    public boolean isMediaEmpty(boolean z4) {
        return isMediaEmpty(this.messageOwner, z4);
    }

    public boolean isQuickReply() {
        return isQuickReply(this.messageOwner);
    }

    public boolean isVideoSticker() {
        return getDocument() != null && isVideoStickerDocument(getDocument());
    }

    public void setQuery(String str, boolean z4) {
        String str2;
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            this.highlightedWords = null;
            this.messageTrimmedToHighlight = null;
            this.messageTrimmedToHighlightCut = true;
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        String lowerCase = str.trim().toLowerCase();
        String[] split = lowerCase.split("[^\\p{L}#$]+");
        ArrayList arrayList2 = new ArrayList();
        TLRPC.MessageReplyHeader messageReplyHeader = this.messageOwner.reply_to;
        if (messageReplyHeader != null && !TextUtils.isEmpty(messageReplyHeader.quote_text)) {
            String lowerCase2 = this.messageOwner.reply_to.quote_text.trim().toLowerCase();
            if (lowerCase2.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                handleFoundWords(arrayList, split, true, z4);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase2.split("[^\\p{L}#$]+")));
        }
        if (!TextUtils.isEmpty(this.messageOwner.message)) {
            String lowerCase3 = this.messageOwner.message.trim().toLowerCase();
            if (lowerCase3.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                handleFoundWords(arrayList, split, false, z4);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase3.split("[^\\p{L}#$]+")));
        }
        if (getDocument() != null) {
            String lowerCase4 = FileLoader.getDocumentFileName(getDocument()).toLowerCase();
            if (lowerCase4.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase4.split("[^\\p{L}#$]+")));
        }
        if ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && (getMedia(this.messageOwner).webpage instanceof TLRPC.TL_webPage)) {
            TLRPC.WebPage webPage = getMedia(this.messageOwner).webpage;
            String str3 = webPage.title;
            if (str3 == null) {
                str3 = webPage.site_name;
            }
            if (str3 != null) {
                String lowerCase5 = str3.toLowerCase();
                if (lowerCase5.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                    arrayList.add(lowerCase);
                }
                arrayList2.addAll(Arrays.asList(lowerCase5.split("[^\\p{L}#$]+")));
            }
        }
        String musicAuthor = getMusicAuthor();
        if (musicAuthor != null) {
            String lowerCase6 = musicAuthor.toLowerCase();
            if (lowerCase6.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase6.split("[^\\p{L}#$]+")));
        }
        for (String str4 : split) {
            if (str4.length() >= 2) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (!arrayList.contains(arrayList2.get(i10)) && (indexOf = (str2 = (String) arrayList2.get(i10)).indexOf(str4.charAt(0))) >= 0) {
                        int max = Math.max(str4.length(), str2.length());
                        if (indexOf != 0) {
                            str2 = str2.substring(indexOf);
                        }
                        int min = Math.min(str4.length(), str2.length());
                        int i11 = 0;
                        for (int i12 = 0; i12 < min && str2.charAt(i12) == str4.charAt(i12); i12++) {
                            i11++;
                        }
                        if (i11 / max >= 0.5d) {
                            arrayList.add((String) arrayList2.get(i10));
                        }
                    }
                }
            }
        }
        handleFoundWords(arrayList, split, false, z4);
    }

    public boolean updateTranslation(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.updateTranslation(boolean):boolean");
    }

    public static class TextRange {
        public boolean code;
        public boolean collapse;
        public int end;
        public String language;
        public boolean quote;
        public int start;

        public TextRange(int i10, int i11) {
            this.start = i10;
            this.end = i11;
        }

        public TextRange(int i10, int i11, boolean z4, boolean z10, boolean z11, String str) {
            this.start = i10;
            this.end = i11;
            this.quote = z4;
            this.code = z10;
            this.collapse = z4 && z11;
            this.language = str;
        }
    }

    public static void addLinks(boolean z4, CharSequence charSequence, boolean z10, boolean z11, boolean z12) {
        if ((charSequence instanceof Spannable) && containsUrls(charSequence)) {
            try {
                AndroidUtilities.addLinksSafe((Spannable) charSequence, 1, z12, false);
            } catch (Exception e) {
                FileLog.e(e);
            }
            addPhoneLinks(charSequence);
            addUrlsByPattern(z4, charSequence, z10, 0, 0, z11);
        }
    }

    public static boolean canDeleteMessage(int i10, boolean z4, TLRPC.Message message, TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.Peer peer;
        if (message == null) {
            return false;
        }
        if (ChatObject.isChannelAndNotMegaGroup(chat) && (message.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) {
            return false;
        }
        if (message.f19180id < 0) {
            return true;
        }
        if (chat == null && (peer = message.peer_id) != null && peer.channel_id != 0) {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(message.peer_id.channel_id));
        }
        if (!ChatObject.isChannel(chat)) {
            return z4 || isOut(message) || !ChatObject.isChannel(chat);
        } else if (z4 && !chat.megagroup) {
            return chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && (tL_chatAdminRights2.delete_messages || message.out));
        } else {
            boolean z10 = message.out;
            return (z10 && (message instanceof TLRPC.TL_messageService)) ? message.f19180id != 1 && ChatObject.canUserDoAdminAction(chat, 13) : z4 || (message.f19180id != 1 && (chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && (tL_chatAdminRights.delete_messages || (z10 && (chat.megagroup || tL_chatAdminRights.post_messages)))) || (chat.megagroup && z10))));
        }
    }

    public static String findAnimatedEmojiEmoticon(TLRPC.Document document, String str, Integer num) {
        if (document != null) {
            int size = document.attributes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                    if (num != null) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(num.intValue()).getStickerSet(documentAttribute.stickerset, true);
                        StringBuilder sb = new StringBuilder("");
                        if (stickerSet != null && stickerSet.packs != null) {
                            for (int i11 = 0; i11 < stickerSet.packs.size(); i11++) {
                                TLRPC.TL_stickerPack tL_stickerPack = stickerSet.packs.get(i11);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document.f19165id))) {
                                    sb.append(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(sb)) {
                            return sb.toString();
                        }
                    }
                    return documentAttribute.alt;
                }
            }
        }
        return str;
    }

    public static TLRPC.InputStickerSet getInputStickerSet(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        int size = document.attributes.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
                    return null;
                }
                return inputStickerSet;
            }
        }
        return null;
    }

    public static boolean isGifDocument(TLRPC.Document document, boolean z4) {
        String str;
        if (document == null || (str = document.mime_type) == null) {
            return false;
        }
        return (str.equals("image/gif") && !z4) || isNewGifDocument(document);
    }

    public static boolean isMediaEmpty(TLRPC.Message message) {
        return isMediaEmpty(message, true);
    }

    public static Spannable replaceAnimatedEmoji(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z4) {
        return replaceAnimatedEmoji(charSequence, arrayList, fontMetricsInt, z4, 1.2f, 0);
    }

    public String getQuickReplyName() {
        return getQuickReplyName(this.messageOwner);
    }

    public long getTopicId() {
        return getTopicId(this.currentAccount, this.messageOwner, getForumFlags(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-getDialogId())), MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(getDialogId()))));
    }

    public static String getFileName(TLRPC.Message message) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (getMedia(message) instanceof TLRPC.TL_messageMediaDocument) {
            return getFileName(getDocument(message));
        }
        if (getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList = getMedia(message).photo.sizes;
            if (arrayList.size() > 0 && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize())) != null) {
                return FileLoader.getAttachFileName(closestPhotoSizeWithSize);
            }
            return "";
        } else if ((getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) && getMedia(message).webpage != null) {
            return getFileName(getMedia(message).webpage.document);
        } else {
            return "";
        }
    }

    public static TLRPC.MessageMedia getMedia(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
            return ((TLRPC.TL_messageExtendedMedia) message.media.extended_media.get(0)).media;
        }
        return message.media;
    }

    public static boolean isMediaEmpty(TLRPC.Message message, boolean z4) {
        if (message == null || getMedia(message) == null || (getMedia(message) instanceof TLRPC.TL_messageMediaEmpty)) {
            return true;
        }
        return z4 && (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage);
    }

    public static Spannable replaceAnimatedEmoji(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z4, float f10, int i10) {
        Emoji.EmojiSpan emojiSpan;
        org.telegram.ui.Components.u5 u5Var;
        Emoji.EmojiSpan emojiSpan2;
        Emoji.EmojiSpan emojiSpan3 = null;
        if (charSequence == null) {
            return null;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        if (arrayList != null) {
            int i11 = (SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50) - i10;
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannableString.getSpans(0, spannableString.length(), Emoji.EmojiSpan.class);
            int i12 = 0;
            while (i12 < arrayList.size() && i11 > 0) {
                TLRPC.MessageEntity messageEntity = arrayList.get(i12);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    int i13 = 0;
                    while (i13 < emojiSpanArr.length) {
                        Emoji.EmojiSpan emojiSpan4 = emojiSpanArr[i13];
                        if (emojiSpan4 != null) {
                            int spanStart = spannableString.getSpanStart(emojiSpan4);
                            int spanEnd = spannableString.getSpanEnd(emojiSpan4);
                            int i14 = tL_messageEntityCustomEmoji.offset;
                            emojiSpan2 = emojiSpan3;
                            if (AndroidUtilities.intersect1d(i14, tL_messageEntityCustomEmoji.length + i14, spanStart, spanEnd)) {
                                spannableString.removeSpan(emojiSpan4);
                                emojiSpanArr[i13] = emojiSpan2;
                            }
                        } else {
                            emojiSpan2 = emojiSpan3;
                        }
                        i13++;
                        emojiSpan3 = emojiSpan2;
                    }
                    emojiSpan = emojiSpan3;
                    if (messageEntity.offset + messageEntity.length <= spannableString.length()) {
                        int i15 = messageEntity.offset;
                        org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spannableString.getSpans(i15, messageEntity.length + i15, org.telegram.ui.Components.u5.class);
                        if (u5VarArr != null && u5VarArr.length > 0) {
                            for (org.telegram.ui.Components.u5 u5Var2 : u5VarArr) {
                                spannableString.removeSpan(u5Var2);
                            }
                        }
                        if (tL_messageEntityCustomEmoji.document != null) {
                            u5Var = new org.telegram.ui.Components.u5(tL_messageEntityCustomEmoji.document, f10, fontMetricsInt);
                        } else {
                            u5Var = new org.telegram.ui.Components.u5(tL_messageEntityCustomEmoji.document_id, f10, fontMetricsInt);
                        }
                        u5Var.top = z4;
                        int i16 = messageEntity.offset;
                        spannableString.setSpan(u5Var, i16, messageEntity.length + i16, 33);
                        i11--;
                        i12++;
                        emojiSpan3 = emojiSpan;
                    }
                } else {
                    emojiSpan = emojiSpan3;
                }
                i12++;
                emojiSpan3 = emojiSpan;
            }
        }
        return spannableString;
    }

    public void applyNewText(CharSequence charSequence) {
        TextPaint textPaint;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        TLRPC.User user = isFromUser() ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.messageOwner.from_id.user_id)) : null;
        this.messageText = charSequence;
        ArrayList<TLRPC.MessageEntity> entities = getEntities();
        if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
            textPaint = org.telegram.ui.ActionBar.j6.f20234x2;
        } else {
            textPaint = org.telegram.ui.ActionBar.j6.f20074o2;
        }
        int[] iArr = allowsBigEmoji() ? new int[1] : null;
        CharSequence replaceEmoji = Emoji.replaceEmoji(this.messageText, textPaint.getFontMetricsInt(), false, iArr);
        this.messageText = replaceEmoji;
        Spannable replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, entities, textPaint.getFontMetricsInt());
        this.messageText = replaceAnimatedEmoji;
        if (iArr != null && iArr[0] > 1) {
            replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr);
        }
        checkEmojiOnly(iArr);
        generateLayout(user);
        setType();
    }

    public long getStakedDiceWinAmount() {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome;
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (!(media instanceof TLRPC.TL_messageMediaDice) || (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) media).game_outcome) == null) {
            return 0L;
        }
        long j10 = tL_messages_emojiGameOutcome.ton_amount;
        return j10 > 0 ? j10 : -tL_messages_emojiGameOutcome.stake_ton_amount;
    }

    public boolean isAnimatedEmoji() {
        return (this.emojiAnimatedSticker == null && this.emojiAnimatedStickerId == null) ? false : true;
    }

    public boolean isPremiumSticker() {
        if (getMedia(this.messageOwner) == null || !getMedia(this.messageOwner).nopremium) {
            return isPremiumSticker(getDocument());
        }
        return false;
    }

    public static boolean canUnvote(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty() && !tL_messageMediaPoll.poll.revoting_disabled) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_messageMediaPoll.results.results.get(i10).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long getChatId(TLRPC.Message message) {
        if (message == null) {
            return 0L;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer instanceof TLRPC.TL_peerChat) {
            return peer.chat_id;
        }
        if (peer instanceof TLRPC.TL_peerChannel) {
            return peer.channel_id;
        }
        return 0L;
    }

    public static TLRPC.Document getDocument(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return findVideo(richMessage);
        }
        if (getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return getMedia(message).webpage.document;
        }
        if (getMedia(message) instanceof TLRPC.TL_messageMediaGame) {
            return getMedia(message).game.document;
        }
        if (getMedia(message) instanceof TLRPC.TL_messageMediaStory) {
            TL_stories.StoryItem storyItem = ((TLRPC.TL_messageMediaStory) getMedia(message)).storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                return document;
            }
        } else if (getMedia(message) instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) getMedia(message);
            if (tL_messageMediaPaidMedia.extended_media.size() == 1 && (tL_messageMediaPaidMedia.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
                return ((TLRPC.TL_messageExtendedMedia) tL_messageMediaPaidMedia.extended_media.get(0)).media.document;
            }
        }
        if (getMedia(message) != null) {
            return getMedia(message).document;
        }
        return null;
    }

    public static int getQuickReplyId(int i10, TLRPC.Message message) {
        uf.o1 d;
        if (message == null) {
            return 0;
        }
        if ((message.flags & 1073741824) != 0) {
            return message.quick_reply_shortcut_id;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcutId) {
            return ((TLRPC.TL_inputQuickReplyShortcutId) inputQuickReplyShortcut).shortcut_id;
        }
        String quickReplyName = getQuickReplyName(message);
        if (quickReplyName == null || (d = uf.p1.f(i10).d(quickReplyName)) == null) {
            return 0;
        }
        return d.f45471a;
    }

    public static boolean isPremiumEmojiPack(TLRPC.StickerSetCovered stickerSetCovered) {
        TLRPC.StickerSet stickerSet;
        if (stickerSetCovered == null || (stickerSet = stickerSetCovered.set) == null || stickerSet.emojis) {
            ArrayList<TLRPC.Document> arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
            if (stickerSetCovered != null && arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!isFreeEmoji(arrayList.get(i10))) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static boolean isVotedButResultsHiddenUntilClose(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        if (tL_messageMediaPoll != null) {
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            return !poll.closed && poll.hide_results_until_close && isVoted(tL_messageMediaPoll) && !isVoteResultsIsNotEmpty(tL_messageMediaPoll);
        }
        return false;
    }

    public boolean isSecretMedia() {
        int i10;
        TLRPC.Message message = this.messageOwner;
        return message instanceof TLRPC.TL_message_secret ? (((getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || isGif()) && (i10 = this.messageOwner.ttl) > 0 && i10 <= 60) || isVoice() || isRoundVideo() || isVideo() : (message instanceof TLRPC.TL_message) && getMedia(message) != null && getMedia(this.messageOwner).ttl_seconds != 0 && ((getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) || (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaDocument));
    }

    public boolean isVoted() {
        if (this.type != 17) {
            return false;
        }
        TLRPC.MessageMedia media = getMedia(this.messageOwner);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            return isVoted((TLRPC.TL_messageMediaPoll) media);
        }
        return false;
    }

    public int textHeight(org.telegram.ui.Cells.r1 r1Var) {
        if (this.textLayoutBlocks == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.textLayoutBlocks.size(); i11++) {
            i10 += this.textLayoutBlocks.get(i11).height(r1Var) + this.textLayoutBlocks.get(i11).padTop + this.textLayoutBlocks.get(i11).padBottom;
        }
        return i10;
    }

    public static void addPaidReactions(int i10, TLRPC.MessageReactions messageReactions, int i11, long j10, boolean z4) {
        TLRPC.MessageReactor messageReactor = null;
        TLRPC.ReactionCount reactionCount = null;
        for (int i12 = 0; i12 < messageReactions.results.size(); i12++) {
            if (messageReactions.results.get(i12).reaction instanceof TLRPC.TL_reactionPaid) {
                reactionCount = messageReactions.results.get(i12);
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 >= messageReactions.top_reactors.size()) {
                break;
            } else if (messageReactions.top_reactors.get(i13).my) {
                messageReactor = messageReactions.top_reactors.get(i13);
                break;
            } else {
                i13++;
            }
        }
        if (reactionCount == null && i11 > 0) {
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = new TLRPC.TL_reactionPaid();
            messageReactions.results.add(0, reactionCount);
        }
        if (reactionCount != null) {
            reactionCount.chosen = z4;
            int max = Math.max(0, reactionCount.count + i11);
            reactionCount.count = max;
            if (max <= 0) {
                messageReactions.results.remove(reactionCount);
            }
        }
        if (messageReactor == null && i11 > 0) {
            messageReactor = new TLRPC.TL_messageReactor();
            messageReactor.my = true;
            messageReactions.top_reactors.add(messageReactor);
        }
        if (messageReactor != null) {
            messageReactor.count = Math.max(0, messageReactor.count + i11);
            int i14 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
            messageReactor.anonymous = i14 == 0;
            if (j10 != 0 && i14 != 0) {
                messageReactor.peer_id = MessagesController.getInstance(i10).getPeer(j10);
            } else {
                messageReactor.peer_id = MessagesController.getInstance(i10).getPeer(UserConfig.getInstance(i10).getClientUserId());
            }
            if (messageReactor.count <= 0) {
                messageReactions.top_reactors.remove(messageReactor);
            }
        }
    }

    public static long getTopicId(int i10, TLRPC.Message message, int i11) {
        long topicId = getTopicId(i10, message, k7.w8.a(i11, 1), k7.w8.a(i11, 4));
        if (topicId == 0 && k7.w8.a(i11, 8)) {
            return -1L;
        }
        return topicId;
    }

    public static boolean isCompleted(TLRPC.TL_messageMediaToDo tL_messageMediaToDo, int i10) {
        for (int i11 = 0; i11 < tL_messageMediaToDo.completions.size(); i11++) {
            if (tL_messageMediaToDo.completions.get(i11).f19303id == i10) {
                return true;
            }
        }
        return false;
    }

    public String getDiceEmoji(TLRPC.TL_messageMediaDice tL_messageMediaDice) {
        if (tL_messageMediaDice == null) {
            return null;
        }
        if (TextUtils.isEmpty(tL_messageMediaDice.emoticon)) {
            return "🎲";
        }
        return tL_messageMediaDice.emoticon.replace("️", "");
    }

    public boolean shouldEncryptPhotoOrVideo() {
        return shouldEncryptPhotoOrVideo(this.currentAccount, this.messageOwner);
    }

    public TLRPC.InputStickerSet getInputStickerSet() {
        return getInputStickerSet(this.messageOwner);
    }

    public static CharSequence formatTextWithEntities(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z4, TextPaint textPaint) {
        return formatTextWithEntities(tL_textWithEntities, z4, false, textPaint);
    }

    public static boolean isNewGifDocument(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z4 = false;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < document.attributes.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z4 = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i10 = documentAttribute.f19166w;
                    i11 = documentAttribute.h;
                }
            }
            if (z4 && i10 <= 1280 && i11 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean peersEqual(TLRPC.InputPeer inputPeer, TLRPC.Peer peer) {
        if (inputPeer == null && peer == null) {
            return true;
        }
        if (inputPeer != null && peer != null) {
            if ((inputPeer instanceof TLRPC.TL_inputPeerChat) && (peer instanceof TLRPC.TL_peerChat)) {
                return inputPeer.chat_id == peer.chat_id;
            } else if ((inputPeer instanceof TLRPC.TL_inputPeerChannel) && (peer instanceof TLRPC.TL_peerChannel)) {
                return inputPeer.channel_id == peer.channel_id;
            } else if ((inputPeer instanceof TLRPC.TL_inputPeerUser) && (peer instanceof TLRPC.TL_peerUser) && inputPeer.user_id == peer.user_id) {
                return true;
            }
        }
        return false;
    }

    public boolean isPhoto() {
        return isPhoto(this.messageOwner);
    }

    public static CharSequence formatTextWithEntities(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z4, boolean z10, TextPaint textPaint) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
        addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, z4, false, z10, false);
        return replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
    }

    public static <T extends TLRPC.MessageMedia> T getMedia(TLRPC.Message message, Class<T> cls) {
        TLRPC.MessageMedia media = getMedia(message);
        if (cls.isInstance(media)) {
            return cls.cast(media);
        }
        return null;
    }

    public static Long getMyPaidReactionPeer(TLRPC.MessageReactions messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        if (messageReactions == null || (arrayList = messageReactions.top_reactors) == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.MessageReactor messageReactor = arrayList.get(i10);
            i10++;
            TLRPC.MessageReactor messageReactor2 = messageReactor;
            if (messageReactor2 != null && messageReactor2.my) {
                if (messageReactor2.anonymous) {
                    return 2666000L;
                }
                TLRPC.Peer peer = messageReactor2.peer_id;
                if (peer != null) {
                    return Long.valueOf(DialogObject.getPeerDialogId(peer));
                }
            }
        }
        return null;
    }

    public static boolean addEntitiesToText(CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, boolean z4, boolean z10, boolean z11, boolean z12) {
        return addEntitiesToText(charSequence, arrayList, z4, z10, z11, z12, 0);
    }

    @Deprecated
    public static long getTopicId(int i10, TLRPC.Message message, boolean z4) {
        return getTopicId(i10, message, z4, false);
    }

    public static boolean addEntitiesToText(java.lang.CharSequence r21, java.util.ArrayList<org.telegram.tgnet.TLRPC.MessageEntity> r22, boolean r23, boolean r24, boolean r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.addEntitiesToText(java.lang.CharSequence, java.util.ArrayList, boolean, boolean, boolean, boolean, int):boolean");
    }

    @Deprecated
    private static long getTopicId(int i10, TLRPC.Message message, boolean z4, boolean z10) {
        int i11;
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        if (z10) {
            return getMonoForumTopicId(message);
        }
        if ((message.flags & 1073741824) != 0 && DialogObject.getPeerDialogId(message.peer_id) == clientUserId) {
            i11 = message.quick_reply_shortcut_id;
        } else if (!z4 && i10 >= 0 && DialogObject.getPeerDialogId(message.peer_id) == clientUserId) {
            return getSavedDialogId(clientUserId, message);
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
                i11 = message.f19180id;
            } else {
                TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                if (messageReplyHeader == null || !messageReplyHeader.forum_topic) {
                    return z4 ? 1L : 0L;
                } else if ((message instanceof TLRPC.TL_messageService) && !(messageAction instanceof TLRPC.TL_messageActionPinMessage)) {
                    int i12 = messageReplyHeader.reply_to_msg_id;
                    if (i12 == 0) {
                        i12 = messageReplyHeader.reply_to_top_id;
                    }
                    return i12;
                } else {
                    int i13 = messageReplyHeader.reply_to_top_id;
                    if (i13 == 0) {
                        i13 = messageReplyHeader.reply_to_msg_id;
                    }
                    return i13;
                }
            }
        }
        return i11;
    }

    public int getQuickReplyId() {
        return getQuickReplyId(this.messageOwner);
    }

    public static String getFileName(TLRPC.Document document) {
        return FileLoader.getAttachFileName(document);
    }

    public static boolean peersEqual(TLRPC.Peer peer, TLRPC.Peer peer2) {
        if (peer == null && peer2 == null) {
            return true;
        }
        if (peer != null && peer2 != null) {
            if ((peer instanceof TLRPC.TL_peerChat) && (peer2 instanceof TLRPC.TL_peerChat)) {
                return peer.chat_id == peer2.chat_id;
            } else if ((peer instanceof TLRPC.TL_peerChannel) && (peer2 instanceof TLRPC.TL_peerChannel)) {
                return peer.channel_id == peer2.channel_id;
            } else if ((peer instanceof TLRPC.TL_peerUser) && (peer2 instanceof TLRPC.TL_peerUser) && peer.user_id == peer2.user_id) {
                return true;
            }
        }
        return false;
    }

    public static CharSequence replaceWithLink(CharSequence charSequence, String str, CharSequence charSequence2) {
        return TextUtils.indexOf(charSequence, str) >= 0 ? TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{charSequence2}) : charSequence;
    }

    public static String getFileName(TLRPC.MessageMedia messageMedia) {
        TLRPC.WebPage webPage;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            return FileLoader.getAttachFileName(messageMedia.document);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList = messageMedia.photo.sizes;
            if (arrayList.size() > 0 && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize())) != null) {
                return FileLoader.getAttachFileName(closestPhotoSizeWithSize);
            }
            return "";
        } else if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null) {
            return FileLoader.getAttachFileName(webPage.document);
        } else {
            return "";
        }
    }

    public static CharSequence peerNameWithIcon(int i10, long j10) {
        return peerNameWithIcon(i10, j10, false);
    }

    public static CharSequence peerNameWithIcon(int i10, long j10, boolean z4) {
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user != null) {
                return AndroidUtilities.removeDiacritics(UserObject.getUserName(user));
            }
            return "";
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat != null) {
            return new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? channelSpan() : groupSpan()).append((CharSequence) " ").append((CharSequence) AndroidUtilities.removeDiacritics(chat.title));
        }
        return "";
    }

    public static CharSequence replaceWithLink(CharSequence charSequence, String str, TLObject tLObject) {
        String str2;
        CharSequence charSequence2;
        String str3;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLRPC.Chat chat;
        TLRPC.User user;
        int indexOf = TextUtils.indexOf(charSequence, str);
        if (indexOf >= 0) {
            TLObject tLObject2 = null;
            if (tLObject instanceof TLRPC.User) {
                charSequence2 = UserObject.getUserName((TLRPC.User) tLObject).replace('\n', ' ');
                str2 = "" + user.f19306id;
            } else if (tLObject instanceof TLRPC.Chat) {
                charSequence2 = ((TLRPC.Chat) tLObject).title.replace('\n', ' ');
                str2 = "" + (-chat.f19159id);
            } else if (tLObject instanceof TLRPC.TL_game) {
                charSequence2 = ((TLRPC.TL_game) tLObject).title.replace('\n', ' ');
                str2 = "game";
            } else {
                if (tLObject instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                    charSequence2 = tL_chatInviteExported2.link.replace('\n', ' ');
                    str3 = "invite";
                    tL_chatInviteExported = tL_chatInviteExported2;
                } else if (tLObject instanceof TLRPC.ForumTopic) {
                    charSequence2 = ag.f.j((TLRPC.ForumTopic) tLObject, null, null);
                    str3 = "topic";
                    tL_chatInviteExported = tLObject;
                } else {
                    str2 = "0";
                    charSequence2 = "";
                }
                String str4 = str3;
                tLObject2 = tL_chatInviteExported;
                str2 = str4;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{charSequence2}));
            n51 n51Var = new n51(vh.w2.e("", str2));
            n51Var.f26968c = tLObject2;
            spannableStringBuilder.setSpan(n51Var, indexOf, charSequence2.length() + indexOf, 33);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public static boolean peersEqual(TLRPC.Chat chat, TLRPC.Peer peer) {
        if (chat == null && peer == null) {
            return true;
        }
        if (chat != null && peer != null) {
            if (ChatObject.isChannel(chat) && (peer instanceof TLRPC.TL_peerChannel)) {
                return chat.f19159id == peer.channel_id;
            } else if (!ChatObject.isChannel(chat) && (peer instanceof TLRPC.TL_peerChat) && chat.f19159id == peer.chat_id) {
                return true;
            }
        }
        return false;
    }

    public static String getMusicTitle(TLRPC.Document document, boolean z4) {
        if (document == null) {
            return LocaleController.getString(R.string.AudioUnknownTitle);
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                String str = documentAttribute.title;
                if (str == null || str.isEmpty()) {
                    String documentFileName = FileLoader.getDocumentFileName(document);
                    return (TextUtils.isEmpty(documentFileName) && z4) ? LocaleController.getString(R.string.AudioUnknownTitle) : documentFileName;
                }
                return str;
            }
        }
        String documentFileName2 = FileLoader.getDocumentFileName(document);
        return !TextUtils.isEmpty(documentFileName2) ? documentFileName2 : LocaleController.getString(R.string.AudioUnknownTitle);
    }

    public void checkForScam() {
    }

    @Deprecated
    public void generateSuggestionApprovalMessageText() {
    }

    public MessageObject(int i10, TLRPC.Message message, String str, String str2, String str3, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.type = 1000;
        this.forceSeekTo = -1.0f;
        this.actionDeleteGroupEventId = -1L;
        this.overrideLinkColor = -1;
        this.overrideLinkEmoji = -1L;
        this.messageTrimmedToHighlightCut = true;
        this.topicIconDrawable = new Drawable[1];
        this.spoiledLoginCode = false;
        this.translated = false;
        this.summarized = false;
        this.localType = z4 ? 2 : 1;
        this.currentAccount = i10;
        this.localName = str2;
        this.localUserName = str3;
        this.messageText = str;
        this.messageOwner = message;
        this.localChannel = z10;
        this.localSupergroup = z11;
        this.localEdit = z12;
    }

    public static void addPhoneLinks(CharSequence charSequence) {
    }

    public static String getMusicAuthor(TLRPC.Document document, boolean z4) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    String str = documentAttribute.performer;
                    return (TextUtils.isEmpty(str) && z4) ? LocaleController.getString(R.string.AudioUnknownArtist) : str;
                }
            }
        }
        return LocaleController.getString(R.string.AudioUnknownArtist);
    }

    public MessageObject(int i10, TLRPC.Message message, AbstractMap<Long, TLRPC.User> abstractMap, boolean z4, boolean z10) {
        this(i10, message, abstractMap, (AbstractMap<Long, TLRPC.Chat>) null, z4, z10);
    }

    public MessageObject(int i10, TLRPC.Message message, a0.h hVar, boolean z4, boolean z10) {
        this(i10, message, hVar, (a0.h) null, z4, z10);
    }

    public MessageObject(int i10, TLRPC.Message message, boolean z4, boolean z10) {
        this(i10, message, null, null, null, null, null, z4, z10, 0L);
    }

    public MessageObject(int i10, TLRPC.Message message, MessageObject messageObject, boolean z4, boolean z10) {
        this(i10, message, messageObject, null, null, null, null, z4, z10, 0L);
    }

    public MessageObject(int i10, TLRPC.Message message, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, boolean z4, boolean z10) {
        this(i10, message, abstractMap, abstractMap2, z4, z10, 0L);
    }

    public MessageObject(int i10, TLRPC.Message message, a0.h hVar, a0.h hVar2, boolean z4, boolean z10) {
        this(i10, message, null, null, null, hVar, hVar2, z4, z10, 0L, false, false, false);
    }

    public MessageObject(int i10, TLRPC.Message message, a0.h hVar, a0.h hVar2, boolean z4, boolean z10, boolean z11) {
        this(i10, message, null, null, null, hVar, hVar2, z4, z10, 0L, false, false, z11);
    }

    public MessageObject(int i10, TLRPC.Message message, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, boolean z4, boolean z10, long j10) {
        this(i10, message, null, abstractMap, abstractMap2, null, null, z4, z10, j10);
    }

    public MessageObject(int i10, TLRPC.Message message, MessageObject messageObject, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, a0.h hVar, a0.h hVar2, boolean z4, boolean z10, long j10) {
        this(i10, message, messageObject, abstractMap, abstractMap2, hVar, hVar2, z4, z10, j10, false, false, false);
    }

    public MessageObject(int i10, TLRPC.Message message, MessageObject messageObject, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, a0.h hVar, a0.h hVar2, boolean z4, boolean z10, long j10, boolean z11, boolean z12, boolean z13) {
        this(i10, message, messageObject, abstractMap, abstractMap2, hVar, hVar2, z4, z10, j10, z11, z12, z13, 0);
    }

    public MessageObject(int i10, TLRPC.Message message, MessageObject messageObject, AbstractMap<Long, TLRPC.User> abstractMap, AbstractMap<Long, TLRPC.Chat> abstractMap2, a0.h hVar, a0.h hVar2, boolean z4, boolean z10, long j10, boolean z11, boolean z12, boolean z13, int i11) {
        AbstractMap<Long, TLRPC.User> abstractMap3;
        a0.h hVar3;
        ?? r15;
        TextPaint textPaint;
        this.type = 1000;
        this.forceSeekTo = -1.0f;
        this.actionDeleteGroupEventId = -1L;
        this.overrideLinkColor = -1;
        this.overrideLinkEmoji = -1L;
        this.messageTrimmedToHighlightCut = true;
        this.topicIconDrawable = new Drawable[1];
        this.spoiledLoginCode = false;
        this.translated = false;
        this.summarized = false;
        org.telegram.ui.ActionBar.j6.O();
        this.isRepostPreview = z11;
        this.isRepostVideoPreview = z12;
        this.isSaved = z13 || getDialogId(message) == UserConfig.getInstance(i10).getClientUserId();
        this.searchType = i11;
        this.currentAccount = i10;
        this.messageOwner = message;
        this.replyMessageObject = messageObject;
        this.eventId = j10;
        this.wasUnread = !message.out && message.unread;
        TLRPC.Message message2 = message.replyMessage;
        if (message2 != null) {
            abstractMap3 = abstractMap;
            hVar3 = hVar;
            r15 = 0;
            this.replyMessageObject = new MessageObject(i10, message2, null, abstractMap3, abstractMap2, hVar3, hVar2, false, z10, j10);
        } else {
            abstractMap3 = abstractMap;
            hVar3 = hVar;
            r15 = 0;
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            getUser(abstractMap3, hVar3, peer.user_id);
        }
        updateMessageText(abstractMap3, abstractMap2, hVar3, hVar2);
        setType();
        if (z4) {
            updateTranslation(r15);
        }
        measureInlineBotButtons();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.messageOwner.date * 1000);
        int i12 = gregorianCalendar.get(6);
        int i13 = gregorianCalendar.get(1);
        int i14 = gregorianCalendar.get(2);
        Integer valueOf = Integer.valueOf(i13);
        Integer valueOf2 = Integer.valueOf(i14);
        Integer valueOf3 = Integer.valueOf(i12);
        Object[] objArr = new Object[3];
        objArr[r15] = valueOf;
        objArr[1] = valueOf2;
        objArr[2] = valueOf3;
        this.dateKey = String.format("%d_%02d_%02d", objArr);
        this.dateKeyInt = (i12 * 1000000) + (i14 * 10000) + i13;
        Integer valueOf4 = Integer.valueOf(i13);
        Integer valueOf5 = Integer.valueOf(i14);
        Object[] objArr2 = new Object[2];
        objArr2[r15] = valueOf4;
        objArr2[1] = valueOf5;
        this.monthKey = String.format("%d_%02d", objArr2);
        createMessageSendInfo();
        generateCaption();
        if (z4) {
            if (getMedia(this.messageOwner) instanceof TLRPC.TL_messageMediaGame) {
                textPaint = org.telegram.ui.ActionBar.j6.f20234x2;
            } else {
                textPaint = org.telegram.ui.ActionBar.j6.f20074o2;
            }
            int[] iArr = allowsBigEmoji() ? new int[1] : null;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.messageText, textPaint.getFontMetricsInt(), (boolean) r15, iArr);
            this.messageText = replaceEmoji;
            Spannable replaceAnimatedEmoji = replaceAnimatedEmoji(replaceEmoji, textPaint.getFontMetricsInt());
            this.messageText = replaceAnimatedEmoji;
            if (iArr != null && iArr[r15] > 1) {
                replaceEmojiToLottieFrame(replaceAnimatedEmoji, iArr);
            }
            checkEmojiOnly(iArr);
            checkBigAnimatedEmoji();
            setType();
            createPathThumb();
        }
        this.layoutCreated = z4;
        generateThumbs(r15);
        if (z10) {
            checkMediaExistance();
        }
    }

    public MessageObject(int r37, org.telegram.tgnet.TLRPC.TL_channelAdminLogEvent r38, java.util.ArrayList<org.telegram.messenger.MessageObject> r39, java.util.HashMap<java.lang.String, java.util.ArrayList<org.telegram.messenger.MessageObject>> r40, org.telegram.tgnet.TLRPC.Chat r41, int[] r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessageObject.<init>(int, org.telegram.tgnet.TLRPC$TL_channelAdminLogEvent, java.util.ArrayList, java.util.HashMap, org.telegram.tgnet.TLRPC$Chat, int[], boolean):void");
    }
}
