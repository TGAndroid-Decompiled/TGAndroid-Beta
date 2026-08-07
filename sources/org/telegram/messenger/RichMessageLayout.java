package org.telegram.messenger;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.ToIntFunction;
import me.vkryl.android.util.ClickHelper;
import me.vkryl.core.BitwiseUtils;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.messenger.utils.tlutils.TLKeyboardHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.FormattedDateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ReplyMessageLine;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Components.SquigglyLinesSpan;
import org.telegram.ui.Components.TableLayout;
import org.telegram.ui.Components.TextPaintImageReceiverSpan;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TornEdge;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.URLSpanBotCommand;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.UnsupportedBlockDrawable;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LinkManager;
import org.telegram.ui.MultiLayoutTypingAnimator;
import org.telegram.ui.iv.Latex;
import org.telegram.ui.iv.RichHtml;
import org.telegram.ui.iv.RichTextStyle;
import org.telegram.ui.web.WebInstantView;

public class RichMessageLayout {
    private static final int ORDERED_LIST_MARKER_START_DP = 6;
    private static final int ORDERED_LIST_MARKER_WIDTH_DP = 28;
    public static final int PART_MAX_HEIGHT_DP = 900;
    public static final int QUOTE_NEST_VPAD = 3;
    public static final int TEXT_FLAG_BLOCKS = 15;
    public static final int TEXT_FLAG_BLOCK_BUTTON = 13;
    public static final int TEXT_FLAG_BLOCK_CAPTION = 10;
    public static final int TEXT_FLAG_BLOCK_CODE = 8;
    public static final int TEXT_FLAG_BLOCK_FOOTER = 7;
    public static final int TEXT_FLAG_BLOCK_HEADING1 = 1;
    public static final int TEXT_FLAG_BLOCK_HEADING2 = 2;
    public static final int TEXT_FLAG_BLOCK_HEADING3 = 3;
    public static final int TEXT_FLAG_BLOCK_HEADING4 = 4;
    public static final int TEXT_FLAG_BLOCK_HEADING5 = 5;
    public static final int TEXT_FLAG_BLOCK_HEADING6 = 6;
    public static final int TEXT_FLAG_BLOCK_PULLQUOTE = 12;
    public static final int TEXT_FLAG_BLOCK_QUOTE = 9;
    public static final int TEXT_FLAG_BLOCK_QUOTE_CAPTION = 11;
    public static final int TEXT_FLAG_BLOCK_TABLE = 14;
    public static final int TEXT_FLAG_BLOCK_TABLE_TITLE = 15;
    public static final int TEXT_FLAG_BOLD = 16;
    public static final int TEXT_FLAG_ITALIC = 32;
    public static final int TEXT_FLAG_MARKED = 8192;
    public static final int TEXT_FLAG_MONO = 256;
    public static final int TEXT_FLAG_STRIKETHROUGH = 128;
    public static final int TEXT_FLAG_SUBSCRIPT = 2048;
    public static final int TEXT_FLAG_SUPERSCRIPT = 4096;
    public static final int TEXT_FLAG_UNDERLINE = 64;
    public static final int TEXT_FLAG_URL = 512;
    public static final int TEXT_FLAG_WEBPAGE_URL = 1024;
    public boolean blockquoteAnimating;
    private ChatMessageCell cell;
    public final int currentAccount;
    private ChatMessageCell.ChatMessageCellDelegate delegate;
    private float density;
    public boolean detailsAnimating;
    private int fontSize;
    public boolean forceTranslationLoading;
    protected int height;
    public boolean invalidateAnimatedEmojiInParent;
    public boolean isPart;
    protected int maxWidth;
    public final MessageObject messageObject;
    protected int minWidth;
    public int padLeft;
    public int padRight;
    private RichBlock pressedBlock;
    private int pressedBlockY;
    private RichMessageLayout prev;
    private Drawable pullquoteIcon;
    protected Theme.ResourcesProvider resourcesProvider;
    public TL_iv.RichMessage richMessage;
    private ButtonBounce showMoreBounce;
    private LoadingDrawable showMoreLoading;
    private Paint showMorePaint;
    private boolean showMorePressed;
    private org.telegram.ui.Components.Text showMoreText;
    private SpoilerEffect2 spoilerEffect2;
    private AnimatedFloat translationLoadingFloat;
    public float translationLoadingValue;
    public MultiLayoutTypingAnimator typingAnimator;
    public View view;
    public final ArrayList<RichUnsupportedBlock> unsupportedBlocks = new ArrayList<>();
    public final ArrayList<RichBlock> blocks = new ArrayList<>();
    public final ArrayList<QuoteBackground> quotes = new ArrayList<>();
    public final HashMap<String, Integer> anchors = new HashMap<>();
    public final HashMap<String, TL_iv.textAnchor> textAnchors = new HashMap<>();
    public final ArrayList<MessageObject> audioMessages = new ArrayList<>();
    public final HashMap<TL_iv.pageBlockAudio, MessageObject> audioBlocks = new HashMap<>();
    public final ArrayList<TextSelectionHelper.TextLayoutBlock> textBlocks = new ArrayList<>();
    public final ArrayList<Integer> textBlockCharOffsets = new ArrayList<>();
    public final ArrayList<Integer> textBlockBlockIndex = new ArrayList<>();
    public CharSequence joinedText = "";
    private float detailsAnimationProgress = 1.0f;
    public final TextPaint textPaint = new TextPaint(1);
    public final TextPaint numTextPaint = new TextPaint(1);
    public final ReplyMessageLine quoteLine = new ReplyMessageLine(null);
    public final GradientClip clip = new GradientClip();
    private final RectF showMoreRect = new RectF();

    public static class FoundLink {
        public int end;
        public StaticLayout layout;
        public int originalWidth;
        public int start;
        public float x;
        public float y;
    }

    public static int setBlockFlags(int i, int i2) {
        return i2 == 0 ? i : (i & (-16)) | i2;
    }

    private static int toTextStyleFlags(int i) {
        int i2 = (i & 16) != 0 ? 1 : 0;
        if ((i & 32) != 0) {
            i2 |= 2;
        }
        if ((i & 64) != 0) {
            i2 |= 16;
        }
        if ((i & 128) != 0) {
            i2 |= 8;
        }
        if ((i & 256) != 0) {
            i2 |= 4;
        }
        if ((i & 2048) != 0) {
            i2 |= 16384;
        }
        if ((i & 4096) != 0) {
            i2 |= 32768;
        }
        return (i & 8192) != 0 ? i2 | 65536 : i2;
    }

    public int getGap() {
        return 0;
    }

    public boolean isRtl() {
        TL_iv.RichMessage richMessage = this.richMessage;
        return richMessage != null && richMessage.rtl;
    }

    public boolean isOut() {
        MessageObject messageObject = this.messageObject;
        return messageObject != null && messageObject.isOutOwner();
    }

    public boolean isTranslating() {
        return this.forceTranslationLoading || (this.messageObject != null && MessagesController.getInstance(this.currentAccount).getTranslateController().isTranslating(this.messageObject));
    }

    public boolean isPinnedTop() {
        ChatMessageCell chatMessageCell = this.cell;
        return chatMessageCell != null && chatMessageCell.isPinnedTop();
    }

    public boolean hasNameOffset() {
        ChatMessageCell chatMessageCell = this.cell;
        return chatMessageCell != null && chatMessageCell.namesOffset > 0;
    }

    public RichMessageLayout(MessageObject messageObject, int i, RichMessageLayout richMessageLayout) {
        this.messageObject = messageObject;
        this.maxWidth = i;
        this.currentAccount = messageObject.currentAccount;
        layout(richMessageLayout);
    }

    public boolean needsUpdate(TL_iv.RichMessage richMessage, int i) {
        return (this.richMessage == richMessage && this.fontSize == SharedConfig.fontSize && Math.abs(this.density - AndroidUtilities.density) <= 0.1f && i == this.maxWidth) ? false : true;
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    public void checkQuoteLine(TLRPC.User user, TLRPC.Chat chat) {
        this.quoteLine.check(this.messageObject, user, chat, this.resourcesProvider, 1);
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || messageObject.isOutOwner() || this.messageObject.shouldDrawWithoutBackground() || hasCustomIncomingQuoteColor(user, chat)) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.quoteLine.setSimpleColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark());
    }

    private boolean hasCustomIncomingQuoteColor(TLRPC.User user, TLRPC.Chat chat) {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.PeerColor peerColor;
        MessageObject messageObject = this.messageObject;
        if (messageObject.overrideLinkColor >= 0 || messageObject.overrideLinkPeerColor != null) {
            return true;
        }
        if (messageObject.isSponsored() && (peerColor = this.messageObject.sponsoredColor) != null && peerColor.color != -1) {
            return true;
        }
        MessageObject messageObject2 = this.messageObject;
        TLRPC.Message message = messageObject2.messageOwner;
        if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
            long peerDialogId = DialogObject.getPeerDialogId(peer);
            if (peerDialogId < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                return chat2 != null && hasCustomPeerColor(chat2.color);
            }
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            return user2 != null && hasCustomPeerColor(user2.color);
        }
        if (DialogObject.isEncryptedDialog(messageObject2.getDialogId()) || this.messageObject.isFromUser()) {
            return user != null && hasCustomPeerColor(user.color);
        }
        if (!this.messageObject.isFromChannel() || chat == null) {
            return false;
        }
        if (chat.signature_profiles) {
            long fromChatId = this.messageObject.getFromChatId();
            if (fromChatId >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(fromChatId));
                return user3 != null && hasCustomPeerColor(user3.color);
            }
            TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-fromChatId));
            return chat3 != null && hasCustomPeerColor(chat3.color);
        }
        return hasCustomPeerColor(chat.color);
    }

    private static boolean hasCustomPeerColor(TLRPC.PeerColor peerColor) {
        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
            return true;
        }
        return (peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0;
    }

    public void setChatMessageCellDelegate(ChatMessageCell chatMessageCell, ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate) {
        this.cell = chatMessageCell;
        this.delegate = chatMessageCellDelegate;
    }

    public boolean startsWithMedia() {
        if (this.blocks.isEmpty()) {
            return false;
        }
        RichBlock richBlock = this.blocks.get(0);
        return (richBlock instanceof RichPhotoBlock) || (richBlock instanceof RichVideoBlock) || (richBlock instanceof RichCollageBlock) || (richBlock instanceof RichSlideshowBlock);
    }

    public void layout(RichMessageLayout richMessageLayout) {
        this.height = 0;
        this.minWidth = 0;
        View view = this.view;
        if (view != null) {
            for (int i = 0; i < this.blocks.size(); i++) {
                this.blocks.get(i).detach(view);
            }
        }
        this.unsupportedBlocks.clear();
        this.blocks.clear();
        this.quotes.clear();
        this.anchors.clear();
        this.textAnchors.clear();
        this.audioMessages.clear();
        this.audioBlocks.clear();
        this.textBlocks.clear();
        this.textBlockCharOffsets.clear();
        this.textBlockBlockIndex.clear();
        this.joinedText = "";
        this.fontSize = SharedConfig.fontSize;
        this.density = AndroidUtilities.density;
        this.textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
        this.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
        this.isPart = false;
        this.richMessage = null;
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || messageObject.messageOwner == null || messageObject.getDisplayRichMessage() == null) {
            return;
        }
        TL_iv.RichMessage displayRichMessage = this.messageObject.getDisplayRichMessage();
        this.richMessage = displayRichMessage;
        this.isPart = displayRichMessage.part;
        this.prev = richMessageLayout;
        for (int i2 = 0; i2 < this.richMessage.blocks.size(); i2++) {
            emitBlock(this.richMessage.blocks.get(i2), 0, new Rect(), 0, previousBlockIsParagraph(this.richMessage.blocks, i2));
        }
        applyListPaddingFromBlocks();
        this.prev = null;
        if (this.typingAnimator != null) {
            for (int i3 = 0; i3 < this.blocks.size(); i3++) {
                this.blocks.get(i3).typingAnimator = this.typingAnimator;
            }
            this.typingAnimator.setBlocks(getAnimatorBlocks());
        }
        if (view != null) {
            for (int i4 = 0; i4 < this.blocks.size(); i4++) {
                this.blocks.get(i4).attach(view);
            }
        }
        reposition();
        snapshotForDetailsAnimation();
    }

    private boolean prefixEquals(String str, String str2) {
        if (str == null || str2 == null || str.length() > str2.length() || str2.length() <= 0) {
            return false;
        }
        return str2.startsWith(str);
    }

    private <T extends RichBlock> T findPrevBlock(TL_iv.PageBlock pageBlock, Class<T> cls) {
        RichMessageLayout richMessageLayout = this.prev;
        if (richMessageLayout == null) {
            return null;
        }
        Iterator<RichBlock> it = richMessageLayout.blocks.iterator();
        while (it.hasNext()) {
            RichBlock next = it.next();
            if (cls.isInstance(next) && (next instanceof RichPreformattedBlock) && prefixEquals(((RichPreformattedBlock) next).plain, getString(pageBlock.text))) {
                return cls.cast(next);
            }
        }
        return null;
    }

    public void reposition() {
        this.height = 0;
        this.minWidth = 0;
        this.textBlocks.clear();
        this.textBlockCharOffsets.clear();
        this.textBlockBlockIndex.clear();
        StringBuilder sb = new StringBuilder();
        int gap = 0;
        boolean z = false;
        for (int i = 0; i < this.blocks.size(); i++) {
            RichBlock richBlock = this.blocks.get(i);
            this.minWidth = Math.max(this.minWidth, richBlock.getMinWidth());
            boolean zIsVisible = richBlock.isVisible();
            if (zIsVisible && z) {
                gap += getGap();
            }
            richBlock.currY = gap;
            richBlock.currH = 0;
            richBlock.currVisible = zIsVisible;
            Rect rect = richBlock.padding;
            richBlock.placeTexts(rect.left, rect.top + gap, i);
            if (zIsVisible) {
                TextSelectionHelper.TextLayoutBlock[] text = richBlock.getText();
                if (text != null) {
                    for (TextSelectionHelper.TextLayoutBlock textLayoutBlock : text) {
                        if (textLayoutBlock != null && textLayoutBlock.getLayout() != null) {
                            if (sb.length() > 0) {
                                sb.append('\n');
                            }
                            this.textBlockCharOffsets.add(Integer.valueOf(sb.length()));
                            this.textBlockBlockIndex.add(Integer.valueOf(i));
                            this.textBlocks.add(textLayoutBlock);
                            CharSequence text2 = textLayoutBlock.getLayout().getText();
                            if (text2 != null) {
                                sb.append(text2);
                            }
                        }
                    }
                }
                int height = richBlock.getHeight();
                richBlock.currH = height;
                gap += height;
                z = true;
            }
        }
        this.height = gap;
        this.joinedText = sb;
    }

    public java.lang.String getSelectionHtml(int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.getSelectionHtml(int, int):java.lang.String");
    }

    private void appendSelectionPiece(StringBuilder sb, CharSequence charSequence, int i, int i2, boolean z) {
        if (i2 <= i) {
            return;
        }
        String strInlineToHtml = RichHtml.inlineToHtml(toRichHtmlSpannable(charSequence.subSequence(i, i2)));
        if (strInlineToHtml.isEmpty()) {
            return;
        }
        sb.append(z ? "<cite>" : "<p>");
        sb.append(strInlineToHtml);
        sb.append(z ? "</cite>" : "</p>");
    }

    private ArrayList<QuoteBackground> quotesFor(int i) {
        ArrayList<QuoteBackground> arrayList = new ArrayList<>();
        if (i >= 0) {
            Iterator<QuoteBackground> it = this.quotes.iterator();
            while (it.hasNext()) {
                QuoteBackground next = it.next();
                if (i >= next.startBlockIndex && i <= next.endBlockIndex) {
                    arrayList.add(next);
                }
            }
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return RichMessageLayout.lambda$quotesFor$0((RichMessageLayout.QuoteBackground) obj, (RichMessageLayout.QuoteBackground) obj2);
                }
            });
        }
        return arrayList;
    }

    public static int lambda$quotesFor$0(QuoteBackground quoteBackground, QuoteBackground quoteBackground2) {
        return quoteBackground.level - quoteBackground2.level;
    }

    private static boolean sameQuotes(ArrayList<QuoteBackground> arrayList, ArrayList<QuoteBackground> arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != arrayList2.get(i)) {
                return false;
            }
        }
        return true;
    }

    private void syncQuotes(StringBuilder sb, ArrayList<QuoteBackground> arrayList, ArrayList<QuoteBackground> arrayList2) {
        int i = 0;
        while (i < arrayList.size() && i < arrayList2.size() && arrayList.get(i) == arrayList2.get(i)) {
            i++;
        }
        while (arrayList.size() > i) {
            sb.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        while (arrayList.size() < arrayList2.size()) {
            sb.append("<blockquote>");
            arrayList.add(arrayList2.get(arrayList.size()));
        }
    }

    private void syncLists(StringBuilder sb, ArrayList<Boolean> arrayList, int i, boolean z) {
        String str;
        String str2;
        while (true) {
            str = "</ul>";
            if (arrayList.size() <= i) {
                break;
            }
            if (arrayList.remove(arrayList.size() - 1).booleanValue()) {
                str = "</ol>";
            }
            sb.append(str);
        }
        while (true) {
            str2 = "<ul>";
            if (arrayList.size() >= i) {
                break;
            }
            if (z) {
                str2 = "<ol>";
            }
            sb.append(str2);
            arrayList.add(Boolean.valueOf(z));
        }
        if (arrayList.isEmpty() || arrayList.get(arrayList.size() - 1).booleanValue() == z) {
            return;
        }
        sb.append(arrayList.remove(arrayList.size() + (-1)).booleanValue() ? "</ol>" : "</ul>");
        sb.append(z ? "<ol>" : "<ul>");
        arrayList.add(Boolean.valueOf(z));
    }

    private void closeLists(StringBuilder sb, ArrayList<Boolean> arrayList) {
        while (!arrayList.isEmpty()) {
            sb.append(arrayList.remove(arrayList.size() + (-1)).booleanValue() ? "</ol>" : "</ul>");
        }
    }

    private SpannableStringBuilder toRichHtmlSpannable(CharSequence charSequence) {
        int textStyleFlags;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (StyleSpan styleSpan : (StyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(styleSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(styleSpan);
            if (spanEnd > spanStart && (textStyleFlags = toTextStyleFlags(styleSpan.flags)) != 0) {
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags = textStyleFlags;
                spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun), spanStart, spanEnd, 33);
            }
        }
        return spannableStringBuilder;
    }

    public void snapshotForDetailsAnimation() {
        for (int i = 0; i < this.blocks.size(); i++) {
            this.blocks.get(i).snapshot();
        }
    }

    public void snapshotForBlockquoteAnimation() {
        snapshotForDetailsAnimation();
    }

    public void attach(View view) {
        View view2 = this.view;
        if (view == view2) {
            return;
        }
        if (view2 != null) {
            detach(view2);
        }
        this.view = view;
        for (int i = 0; i < this.blocks.size(); i++) {
            this.blocks.get(i).attach(view);
        }
    }

    public void detach(View view) {
        View view2 = this.view;
        if (view2 == view && view2 != null) {
            SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
            if (spoilerEffect2 != null) {
                spoilerEffect2.detach(view);
                this.spoilerEffect2 = null;
            }
            this.view = null;
            for (int i = 0; i < this.blocks.size(); i++) {
                this.blocks.get(i).detach(view);
            }
            if (view == this.cell) {
                this.cell = null;
                this.delegate = null;
            }
        }
    }

    public boolean isAttached() {
        return this.view != null;
    }

    public SpoilerEffect2 getMediaSpoilerEffect() {
        if (this.view == null || !SpoilerEffect2.supports()) {
            return null;
        }
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
        if (spoilerEffect2 != null && spoilerEffect2.destroyed) {
            this.spoilerEffect2 = null;
        }
        if (this.spoilerEffect2 == null) {
            this.spoilerEffect2 = SpoilerEffect2.getInstance(this.view);
        }
        return this.spoilerEffect2;
    }

    public static class QuoteBackground {
        int endBlockIndex;
        int level;
        int outerBottomVpad;
        int outerTopVpad;
        int padding;
        int startBlockIndex;

        public QuoteBackground(int i, int i2, int i3, int i4) {
            this(i, i2, i3, i4, 0, 0);
        }

        public QuoteBackground(int i, int i2, int i3, int i4, int i5) {
            this(i, i2, i3, i4, i5, i5);
        }

        public QuoteBackground(int i, int i2, int i3, int i4, int i5, int i6) {
            this.startBlockIndex = i;
            this.endBlockIndex = i2;
            this.padding = i3;
            this.level = i4;
            this.outerTopVpad = i5;
            this.outerBottomVpad = i6;
        }
    }

    public TLRPC.Photo getPhoto(long j) {
        TL_iv.RichMessage richMessage = this.richMessage;
        if (richMessage == null) {
            return null;
        }
        Iterator<TLRPC.Photo> it = richMessage.photos.iterator();
        while (it.hasNext()) {
            TLRPC.Photo next = it.next();
            if (next.id == j) {
                return next;
            }
        }
        return null;
    }

    public TLRPC.Document getDocument(long j) {
        TL_iv.RichMessage richMessage = this.richMessage;
        if (richMessage == null) {
            return null;
        }
        Iterator<TLRPC.Document> it = richMessage.documents.iterator();
        while (it.hasNext()) {
            TLRPC.Document next = it.next();
            if (next.id == j) {
                return next;
            }
        }
        return null;
    }

    public void collectMediaBlocks(List<TL_iv.PageBlock> list) {
        for (int i = 0; i < this.blocks.size(); i++) {
            RichBlock richBlock = this.blocks.get(i);
            if (richBlock instanceof RichPhotoBlock) {
                list.add(((RichPhotoBlock) richBlock).block);
            } else if (richBlock instanceof RichVideoBlock) {
                list.add(((RichVideoBlock) richBlock).block);
            } else if (richBlock instanceof RichCollageBlock) {
                Iterator<MediaCell> it = ((RichCollageBlock) richBlock).cells.iterator();
                while (it.hasNext()) {
                    list.add(it.next().pageBlock);
                }
            } else if (richBlock instanceof RichSlideshowBlock) {
                Iterator<MediaCell> it2 = ((RichSlideshowBlock) richBlock).cells.iterator();
                while (it2.hasNext()) {
                    list.add(it2.next().pageBlock);
                }
            }
        }
    }

    public boolean setSlideshowPage(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return false;
        }
        for (int i = 0; i < this.blocks.size(); i++) {
            RichBlock richBlock = this.blocks.get(i);
            if (richBlock instanceof RichSlideshowBlock) {
                RichSlideshowBlock richSlideshowBlock = (RichSlideshowBlock) richBlock;
                for (int i2 = 0; i2 < richSlideshowBlock.cells.size(); i2++) {
                    if (richSlideshowBlock.cells.get(i2).pageBlock == pageBlock) {
                        richSlideshowBlock.setCurrentPage(i2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public ImageReceiver findMediaImageReceiver(TL_iv.PageBlock pageBlock, int[] iArr) {
        ImageReceiver imageReceiver;
        TL_iv.PageBlock pageBlock2;
        ImageReceiver imageReceiver2;
        int i = 0;
        while (true) {
            TL_iv.PageBlock pageBlock3 = null;
            if (i >= this.blocks.size()) {
                return null;
            }
            RichBlock richBlock = this.blocks.get(i);
            if (richBlock instanceof RichPhotoBlock) {
                RichPhotoBlock richPhotoBlock = (RichPhotoBlock) richBlock;
                pageBlock2 = richPhotoBlock.block;
                imageReceiver2 = richPhotoBlock.imageReceiver;
            } else if (richBlock instanceof RichVideoBlock) {
                RichVideoBlock richVideoBlock = (RichVideoBlock) richBlock;
                pageBlock2 = richVideoBlock.block;
                imageReceiver2 = richVideoBlock.imageReceiver;
            } else {
                if (richBlock instanceof RichCollageBlock) {
                    Iterator<MediaCell> it = ((RichCollageBlock) richBlock).cells.iterator();
                    while (it.hasNext()) {
                        MediaCell next = it.next();
                        if (next.pageBlock == pageBlock) {
                            if (iArr != null && iArr.length >= 2) {
                                Rect rect = richBlock.padding;
                                iArr[0] = rect.left;
                                iArr[1] = richBlock.layoutY + rect.top;
                            }
                            return next.imageReceiver;
                        }
                    }
                } else if (richBlock instanceof RichSlideshowBlock) {
                    RichSlideshowBlock richSlideshowBlock = (RichSlideshowBlock) richBlock;
                    int currentPage = richSlideshowBlock.getCurrentPage();
                    if (currentPage >= 0 && currentPage < richSlideshowBlock.cells.size() && richSlideshowBlock.cells.get(currentPage).pageBlock == pageBlock) {
                        if (iArr != null && iArr.length >= 2) {
                            Rect rect2 = richBlock.padding;
                            iArr[0] = rect2.left;
                            iArr[1] = richBlock.layoutY + rect2.top;
                        }
                        return richSlideshowBlock.cells.get(currentPage).imageReceiver;
                    }
                } else {
                    imageReceiver = null;
                    if (pageBlock3 == pageBlock && imageReceiver != null) {
                        if (iArr != null && iArr.length >= 2) {
                            Rect rect3 = richBlock.padding;
                            iArr[0] = rect3.left;
                            iArr[1] = richBlock.layoutY + rect3.top;
                        }
                        return imageReceiver;
                    }
                }
                i++;
            }
            TL_iv.PageBlock pageBlock4 = pageBlock2;
            imageReceiver = imageReceiver2;
            pageBlock3 = pageBlock4;
            if (pageBlock3 == pageBlock) {
                continue;
            }
            i++;
        }
    }

    private static void markListItem(RichBlock richBlock, int i, boolean z, boolean z2, boolean z3) {
        if (richBlock == null) {
            return;
        }
        richBlock.listLevel = i;
        richBlock.listOrdered = z;
        richBlock.listCheckbox = z2;
        richBlock.listChecked = z3;
    }

    private void emitCaption(TL_iv.PageCaption pageCaption, Rect rect, int i) {
        if (pageCaption == null) {
            return;
        }
        TL_iv.RichText richText = pageCaption.text;
        boolean z = false;
        boolean z2 = (richText == null || (richText instanceof TL_iv.textEmpty)) ? false : true;
        TL_iv.RichText richText2 = pageCaption.credit;
        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty)) {
            z = true;
        }
        if (z2 || z) {
            int blockFlags = setBlockFlags(i, 10);
            this.blocks.add(new RichCaptionBlock(this, rect, this.maxWidth, z2 ? formatText(pageCaption.text, blockFlags) : null, z ? formatText(pageCaption.credit, blockFlags) : null));
        }
    }

    private static boolean previousBlockIsParagraph(List<TL_iv.PageBlock> list, int i) {
        return i > 0 && (list.get(i - 1) instanceof TL_iv.pageBlockParagraph);
    }

    private RichBlock emitBlock(TL_iv.PageBlock pageBlock, int i, Rect rect, int i2, boolean z) {
        TLRPC.Document document;
        TL_iv.pageBlockBlockquote pageblockblockquote;
        RichQuoteBlock richQuoteBlock;
        int i3;
        TL_iv.pageBlockList pageblocklist;
        Rect rect2;
        int i4;
        int iDp;
        int i5 = i2;
        RichBlock richBlock = null;
        if (rect.left + rect.right >= this.maxWidth) {
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockThinking) {
            RichThinkingBlock richThinkingBlock = new RichThinkingBlock(this, new Rect(), this.maxWidth, formatText(pageBlock.text));
            this.blocks.add(richThinkingBlock);
            return richThinkingBlock;
        }
        float f = 4.0f;
        boolean z2 = false;
        if (ArticleViewer.isHeadingBlock(pageBlock) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockParagraph)) {
            boolean zIsHeadingBlock = ArticleViewer.isHeadingBlock(pageBlock);
            RichTextBlock richTextBlock = new RichTextBlock(this, rect, this.maxWidth, formatText(pageBlock.text, setBlockFlags(i5, getBlockTextFlag(pageBlock))));
            if (zIsHeadingBlock) {
                richTextBlock.setContentPadding(AndroidUtilities.dp(this.blocks.isEmpty() ? 4.0f : 11.0f), AndroidUtilities.dp(7.0f));
            } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                richTextBlock.setContentPadding(z ? 0 : AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.66f));
            }
            richTextBlock.accessibilityLabelResId = getBlockAccessibilityLabel(pageBlock);
            this.blocks.add(richTextBlock);
            return richTextBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            RichPreformattedBlock richPreformattedBlock = new RichPreformattedBlock(this, rect, this.maxWidth, (TL_iv.pageBlockPreformatted) pageBlock, (RichPreformattedBlock) findPrevBlock(pageBlock, RichPreformattedBlock.class));
            richPreformattedBlock.accessibilityLabelResId = R.string.ArticleCode;
            this.blocks.add(richPreformattedBlock);
            return richPreformattedBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) pageBlock;
            int i6 = i + 1;
            this.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
            int iDp2 = AndroidUtilities.dp(18.0f);
            for (int i7 = 0; i7 < pageblocklist2.items.size(); i7++) {
                if (pageblocklist2.items.get(i7).checkbox) {
                    iDp = AndroidUtilities.dp(26.0f);
                } else {
                    iDp = AndroidUtilities.dp(18.0f);
                }
                iDp2 = Math.max(iDp2, iDp);
            }
            Rect rect3 = new Rect(rect);
            if (isRtl()) {
                rect3.right += iDp2;
            } else {
                rect3.left += iDp2;
            }
            int i8 = 0;
            while (i8 < pageblocklist2.items.size()) {
                TL_iv.PageListItem pageListItem = pageblocklist2.items.get(i8);
                String str = "•◦▪";
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                    RichTextBlock richTextBlock2 = new RichTextBlock(this, new Rect(rect3), this.maxWidth, formatText(tL_pageListItemText.text, i5));
                    richTextBlock2.setListMarkerWidth(iDp2);
                    if (tL_pageListItemText.checkbox) {
                        richTextBlock2.setCheckbox(tL_pageListItemText.checked, tL_pageListItemText);
                    } else {
                        richTextBlock2.setNum("•◦▪".charAt(i % 3) + "");
                    }
                    markListItem(richTextBlock2, i6, z2, tL_pageListItemText.checkbox, tL_pageListItemText.checked);
                    this.blocks.add(richTextBlock2);
                } else {
                    if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                        TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                        if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                            int size = this.blocks.size();
                            int i9 = 0;
                            boolean z3 = false;
                            while (i9 < tL_pageListItemBlocks.blocks.size()) {
                                int i10 = i9;
                                TL_iv.pageBlockList pageblocklist3 = pageblocklist2;
                                String str2 = str;
                                Rect rect4 = rect3;
                                int i11 = iDp2;
                                RichBlock richBlockEmitBlock = emitBlock(tL_pageListItemBlocks.blocks.get(i9), i6, new Rect(rect3), i2, previousBlockIsParagraph(tL_pageListItemBlocks.blocks, i9));
                                if (richBlockEmitBlock != null && !z3) {
                                    richBlockEmitBlock.setListMarkerWidth(i11);
                                    if (tL_pageListItemBlocks.checkbox) {
                                        richBlockEmitBlock.setCheckbox(tL_pageListItemBlocks.checked, tL_pageListItemBlocks);
                                    } else {
                                        richBlockEmitBlock.setNum(str2.charAt(i % 3) + "");
                                    }
                                    markListItem(richBlockEmitBlock, i6, false, tL_pageListItemBlocks.checkbox, tL_pageListItemBlocks.checked);
                                    z3 = true;
                                }
                                i9 = i10 + 1;
                                str = str2;
                                iDp2 = i11;
                                rect3 = rect4;
                                pageblocklist2 = pageblocklist3;
                            }
                            pageblocklist = pageblocklist2;
                            rect2 = rect3;
                            i4 = iDp2;
                            markListMembership(size, this.blocks.size(), i6, false);
                        }
                    }
                    i8++;
                    pageblocklist2 = pageblocklist;
                    iDp2 = i4;
                    rect3 = rect2;
                    richBlock = null;
                    z2 = false;
                    i5 = i2;
                }
                pageblocklist = pageblocklist2;
                rect2 = rect3;
                i4 = iDp2;
                i8++;
                pageblocklist2 = pageblocklist;
                iDp2 = i4;
                rect3 = rect2;
                richBlock = null;
                z2 = false;
                i5 = i2;
            }
            return richBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            int i12 = i + 1;
            this.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
            new TextPaint(this.numTextPaint).setTypeface(AndroidUtilities.bold());
            int iDp3 = AndroidUtilities.dp(28.0f);
            for (int i13 = 0; i13 < pageblockorderedlist.items.size(); i13++) {
                iDp3 = Math.max(iDp3, ((int) Math.ceil(r1.measureText(orderedListMarker(pageblockorderedlist, r4, i13)))) + AndroidUtilities.dp(10.0f) + (pageblockorderedlist.items.get(i13).checkbox ? AndroidUtilities.dp(26.0f) : 0));
            }
            Rect rect5 = new Rect(rect);
            if (isRtl()) {
                rect5.right += iDp3;
            } else {
                rect5.left += iDp3;
            }
            for (int i14 = 0; i14 < pageblockorderedlist.items.size(); i14++) {
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i14);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                    RichTextBlock richTextBlock3 = new RichTextBlock(this, new Rect(rect5), this.maxWidth, formatText(tL_pageListOrderedItemText.text, i2));
                    richTextBlock3.setListMarkerWidth(iDp3);
                    richTextBlock3.setNum(orderedListMarker(pageblockorderedlist, tL_pageListOrderedItemText, i14));
                    if (tL_pageListOrderedItemText.checkbox) {
                        richTextBlock3.setCheckbox(tL_pageListOrderedItemText.checked, tL_pageListOrderedItemText);
                    }
                    markListItem(richTextBlock3, i12, true, tL_pageListOrderedItemText.checkbox, tL_pageListOrderedItemText.checked);
                    this.blocks.add(richTextBlock3);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                    if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                        int size2 = this.blocks.size();
                        int i15 = 0;
                        boolean z4 = false;
                        while (i15 < tL_pageListOrderedItemBlocks.blocks.size()) {
                            int i16 = i15;
                            RichBlock richBlockEmitBlock2 = emitBlock(tL_pageListOrderedItemBlocks.blocks.get(i15), i12, new Rect(rect5), i2, previousBlockIsParagraph(tL_pageListOrderedItemBlocks.blocks, i15));
                            if (richBlockEmitBlock2 != null && !z4) {
                                richBlockEmitBlock2.setListMarkerWidth(iDp3);
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    richBlockEmitBlock2.setCheckbox(tL_pageListOrderedItemBlocks.checked, tL_pageListOrderedItemBlocks);
                                }
                                richBlockEmitBlock2.setNum(orderedListMarker(pageblockorderedlist, tL_pageListOrderedItemBlocks, i14));
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    richBlockEmitBlock2.setCheckbox(tL_pageListOrderedItemBlocks.checked, tL_pageListOrderedItemBlocks);
                                }
                                markListItem(richBlockEmitBlock2, i12, true, tL_pageListOrderedItemBlocks.checkbox, tL_pageListOrderedItemBlocks.checked);
                                z4 = true;
                            }
                            i15 = i16 + 1;
                        }
                        markListMembership(size2, this.blocks.size(), i12, true);
                    }
                }
            }
            return null;
        }
        float f2 = 12.0f;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            int i17 = rect.left;
            int size3 = this.blocks.size();
            TL_iv.pageBlockBlockquote pageblockblockquote2 = (TL_iv.pageBlockBlockquote) pageBlock;
            CharSequence text = formatText(pageBlock.text, setBlockFlags(i2, getBlockTextFlag(pageBlock)));
            TL_iv.RichText richText = pageblockblockquote2.caption;
            CharSequence text2 = (richText == null || TextUtils.isEmpty(getString(richText))) ? null : formatText(pageblockblockquote2.caption, setBlockFlags(i2, 11));
            if (pageblockblockquote2.collapsed) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                if (text2 != null) {
                    spannableStringBuilder.append('\n');
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(text2);
                    i3 = length;
                } else {
                    i3 = -1;
                }
                pageblockblockquote = pageblockblockquote2;
                ?? richTextBlockQuote = new RichTextBlockQuote(this, new Rect(rect.left + AndroidUtilities.dp(12.0f), rect.top + AndroidUtilities.dp(4.0f), rect.right + AndroidUtilities.dp(20.0f), rect.bottom + AndroidUtilities.dp(4.0f)), this.maxWidth, pageblockblockquote2, spannableStringBuilder);
                richTextBlockQuote.quoteAuthorStart = i3;
                richTextBlockQuote.setContentPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                richQuoteBlock = richTextBlockQuote;
            } else {
                pageblockblockquote = pageblockblockquote2;
                richQuoteBlock = new RichQuoteBlock(this, new Rect(rect.left + AndroidUtilities.dp(12.0f), rect.top + AndroidUtilities.dp(12.0f), rect.right + AndroidUtilities.dp(12.0f), rect.bottom + AndroidUtilities.dp(14.0f)), this.maxWidth, text, text2);
            }
            richQuoteBlock.accessibilityLabelResId = R.string.ArticleQuote;
            this.blocks.add(richQuoteBlock);
            this.quotes.add(new QuoteBackground(size3, this.blocks.size() - 1, i17, i, AndroidUtilities.dp(8.0f), pageblockblockquote.collapsed ? AndroidUtilities.dp(8.0f) : 0));
            return richQuoteBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            int i18 = rect.left;
            int i19 = i + 1;
            int size4 = this.blocks.size();
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            TL_iv.RichText richText2 = pageblockblockquoteblocks.caption;
            boolean z5 = (richText2 == null || TextUtils.isEmpty(getString(richText2))) ? false : true;
            int i20 = 0;
            while (i20 < pageblockblockquoteblocks.blocks.size()) {
                emitBlock(pageblockblockquoteblocks.blocks.get(i20), i19, new Rect(rect.left + AndroidUtilities.dp(f2), rect.top + (i20 == 0 ? AndroidUtilities.dp(f) : 0), rect.right + AndroidUtilities.dp(12.0f), rect.bottom + ((!(i20 == pageblockblockquoteblocks.blocks.size() - 1) || z5) ? 0 : AndroidUtilities.dp(4.0f))), setBlockFlags(i2, 9), previousBlockIsParagraph(pageblockblockquoteblocks.blocks, i20));
                i20++;
                size4 = size4;
                f2 = 12.0f;
                f = 4.0f;
            }
            int i21 = size4;
            if (this.blocks.size() > i21) {
                this.blocks.get(i21).accessibilityParentLabelResId = R.string.ArticleQuote;
            }
            if (z5) {
                RichTextBlock richTextBlock4 = new RichTextBlock(this, new Rect(rect.left + AndroidUtilities.dp(12.0f), rect.top, rect.right + AndroidUtilities.dp(12.0f), rect.bottom + AndroidUtilities.dp(6.0f)), this.maxWidth, new SpannableStringBuilder(formatText(pageblockblockquoteblocks.caption, setBlockFlags(i2, 11))));
                richTextBlock4.quoteAuthorStart = 0;
                richTextBlock4.setContentPadding(AndroidUtilities.dp(2.0f), 0);
                this.blocks.add(richTextBlock4);
            }
            this.quotes.add(new QuoteBackground(i21, this.blocks.size() - 1, i18, i));
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            CharSequence text3 = formatText(pageBlock.text, setBlockFlags(i2, getBlockTextFlag(pageBlock)));
            TL_iv.RichText richText3 = pageblockpullquote.caption;
            RichPullquoteBlock richPullquoteBlock = new RichPullquoteBlock(this, new Rect(rect.left + AndroidUtilities.dp(30.0f), rect.top + AndroidUtilities.dp(16.0f), rect.right + AndroidUtilities.dp(30.0f), rect.bottom + AndroidUtilities.dp(16.0f)), this.maxWidth, text3, (richText3 == null || TextUtils.isEmpty(getString(richText3))) ? null : formatText(pageblockpullquote.caption, setBlockFlags(i2, 11)));
            richPullquoteBlock.accessibilityLabelResId = R.string.ArticlePullquote;
            this.blocks.add(richPullquoteBlock);
            return richPullquoteBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            RichButtonRowBlock richButtonRowBlock = new RichButtonRowBlock(this, rect, this.maxWidth, (TL_iv.pageBlockButtonRow) pageBlock);
            richButtonRowBlock.accessibilityLabelResId = R.string.AccDescrIVButtons;
            this.blocks.add(richButtonRowBlock);
            return richButtonRowBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            RichTableBlock richTableBlock = new RichTableBlock(this, rect, this.maxWidth, (TL_iv.pageBlockTable) pageBlock);
            richTableBlock.accessibilityLabelResId = R.string.AccDescrIVTable;
            this.blocks.add(richTableBlock);
            return richTableBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            RichMathBlock richMathBlock = new RichMathBlock(this, rect, this.maxWidth, (TL_iv.pageBlockMath) pageBlock);
            this.blocks.add(richMathBlock);
            return richMathBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            RichDividerBlock richDividerBlock = new RichDividerBlock(this, rect, this.maxWidth);
            this.blocks.add(richDividerBlock);
            return richDividerBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            RichPhotoBlock richPhotoBlock = new RichPhotoBlock(this, rect, this.maxWidth, pageblockphoto, this.blocks.isEmpty());
            this.blocks.add(richPhotoBlock);
            emitCaption(pageblockphoto.caption, rect, i2);
            return richPhotoBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            RichVideoBlock richVideoBlock = new RichVideoBlock(this, rect, this.maxWidth, pageblockvideo, this.blocks.isEmpty());
            this.blocks.add(richVideoBlock);
            emitCaption(pageblockvideo.caption, rect, i2);
            return richVideoBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            RichCollageBlock richCollageBlock = new RichCollageBlock(this, rect, this.maxWidth, pageblockcollage, this.blocks.isEmpty());
            this.blocks.add(richCollageBlock);
            emitCaption(pageblockcollage.caption, rect, i2);
            return richCollageBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            RichSlideshowBlock richSlideshowBlock = new RichSlideshowBlock(this, rect, this.maxWidth, pageblockslideshow, this.blocks.isEmpty());
            this.blocks.add(richSlideshowBlock);
            emitCaption(pageblockslideshow.caption, rect, i2);
            return richSlideshowBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            RichMapBlock richMapBlock = new RichMapBlock(this, rect, this.maxWidth, pageblockmap);
            this.blocks.add(richMapBlock);
            emitCaption(pageblockmap.caption, rect, i2);
            return richMapBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
            if (this.audioBlocks.get(pageblockaudio) == null && (document = getDocument(pageblockaudio.audio_id)) != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                int i22 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                pageblockaudio.mid = i22;
                tL_message.id = i22;
                tL_message.realId = this.messageObject.getRealId();
                tL_message.dialog_id = this.messageObject.getDialogId();
                TLRPC.Peer peer = this.messageObject.messageOwner.peer_id;
                tL_message.peer_id = peer;
                if (peer == null) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.peer_id = tL_peerUser;
                    tL_peerUser.user_id = UserConfig.getInstance(this.currentAccount).getClientUserId();
                }
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser2;
                tL_peerUser2.user_id = UserConfig.getInstance(this.currentAccount).getClientUserId();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = document;
                tL_message.flags |= 768;
                MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, true);
                this.audioMessages.add(messageObject);
                this.audioBlocks.put(pageblockaudio, messageObject);
            }
            RichAudioBlock richAudioBlock = new RichAudioBlock(this, rect, this.maxWidth, pageblockaudio);
            this.blocks.add(richAudioBlock);
            emitCaption(pageblockaudio.caption, rect, i2);
            return richAudioBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TL_iv.pageBlockDocument pageblockdocument = (TL_iv.pageBlockDocument) pageBlock;
            RichDocumentBlock richDocumentBlock = new RichDocumentBlock(this, rect, this.maxWidth, pageblockdocument);
            this.blocks.add(richDocumentBlock);
            emitCaption(pageblockdocument.caption, rect, i2);
            return richDocumentBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return emitBlock(((TL_iv.pageBlockCover) pageBlock).cover, i, rect, i2, false);
        }
        if (pageBlock instanceof TL_iv.pageBlockAnchor) {
            String str3 = ((TL_iv.pageBlockAnchor) pageBlock).name;
            if (str3 == null) {
                return null;
            }
            this.anchors.put(str3.toLowerCase(), Integer.valueOf(this.blocks.size()));
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
            RichUnsupportedBlock richUnsupportedBlock = new RichUnsupportedBlock(this, new Rect(-AndroidUtilities.dp(7.0f), Math.max(AndroidUtilities.dp(14.0f), rect.top), -AndroidUtilities.dp(7.0f), Math.max(AndroidUtilities.dp(14.0f), rect.bottom)), this.maxWidth, this.blocks.size());
            this.unsupportedBlocks.add(richUnsupportedBlock);
            this.blocks.add(richUnsupportedBlock);
            return richUnsupportedBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            RichDetailsBlock richDetailsBlock = new RichDetailsBlock(this, rect, this.maxWidth, pageblockdetails, formatText(pageblockdetails.title, i2 & (-17)));
            this.blocks.add(richDetailsBlock);
            for (int i23 = 0; i23 < pageblockdetails.blocks.size(); i23++) {
                emitBlock(pageblockdetails.blocks.get(i23), i + 1, rect, i2, previousBlockIsParagraph(pageblockdetails.blocks, i23));
            }
            this.blocks.add(new RichDetailsEndBlock(this, new Rect(rect.left, 0, rect.right, 0), this.maxWidth));
            for (int size5 = this.blocks.size(); size5 < this.blocks.size(); size5++) {
                RichBlock richBlock2 = this.blocks.get(size5);
                if (richBlock2.parentDetails == null) {
                    richBlock2.parentDetails = richDetailsBlock;
                }
            }
            return richDetailsBlock;
        }
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            return null;
        }
        RichTextBlock richTextBlock5 = new RichTextBlock(this, rect, this.maxWidth, "unsupported block " + pageBlock);
        this.blocks.add(richTextBlock5);
        return richTextBlock5;
    }

    private static String orderedListMarker(TL_iv.pageBlockOrderedList pageblockorderedlist, TL_iv.PageListOrderedItem pageListOrderedItem, int i) {
        if (!TextUtils.isEmpty(pageListOrderedItem.num)) {
            if (pageListOrderedItem.num.endsWith(".")) {
                return pageListOrderedItem.num;
            }
            return pageListOrderedItem.num + ".";
        }
        if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return pageListOrderedItem.value + ".";
        }
        if (TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
            StringBuilder sb = new StringBuilder();
            int i2 = pageblockorderedlist.start;
            if (pageblockorderedlist.reversed) {
                i = -i;
            }
            sb.append(i2 + i);
            sb.append(".");
            return sb.toString();
        }
        return (i + 1) + ".";
    }

    private void markListMembership(int i, int i2, int i3, boolean z) {
        while (i < i2) {
            RichBlock richBlock = this.blocks.get(i);
            if (richBlock.listLevel == 0) {
                richBlock.listLevel = i3;
                richBlock.listOrdered = z;
            }
            i++;
        }
    }

    private void applyListPaddingFromBlocks() {
        int i = 0;
        while (i < this.blocks.size()) {
            RichBlock richBlock = this.blocks.get(i);
            if ((richBlock instanceof RichTextBlock) && richBlock.listLevel > 0) {
                int i2 = i + 1;
                ((RichTextBlock) richBlock).setContentPadding(AndroidUtilities.dp(i > 0 && this.blocks.get(i + (-1)).listLevel > 0 ? 2.0f : 8.0f), AndroidUtilities.dp(i2 < this.blocks.size() && this.blocks.get(i2).listLevel > 0 ? 5.0f : 11.0f));
            }
            i++;
        }
    }

    public boolean hasUnsupportedBlocks() {
        return !this.unsupportedBlocks.isEmpty();
    }

    public ArrayList<RichUnsupportedBlock> getUnsupportedHoles() {
        return this.unsupportedBlocks;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    public int getHeight() {
        if (!this.isPart || this.height <= AndroidUtilities.dp(900.0f)) {
            return this.height + (this.isPart ? AndroidUtilities.dp(50.0f) : 0);
        }
        return AndroidUtilities.dp(950.0f);
    }

    public int getLastLineWidth() {
        if (this.blocks.isEmpty() || this.isPart || isRtl()) {
            return getMinWidth();
        }
        if (!this.quotes.isEmpty()) {
            Iterator<QuoteBackground> it = this.quotes.iterator();
            while (it.hasNext()) {
                if (it.next().endBlockIndex >= this.blocks.size() - 1) {
                    return getMinWidth();
                }
            }
        }
        RichBlock richBlock = this.blocks.get(r0.size() - 1);
        return richBlock.forcesTimeToNewLine() ? getMinWidth() : richBlock.getLastLineWidth();
    }

    public boolean forceNewLineForTime() {
        if (this.blocks.isEmpty() || this.isPart || isRtl()) {
            return true;
        }
        if (!this.quotes.isEmpty()) {
            Iterator<QuoteBackground> it = this.quotes.iterator();
            while (it.hasNext()) {
                if (it.next().endBlockIndex >= this.blocks.size() - 1) {
                    return true;
                }
            }
        }
        ArrayList<RichBlock> arrayList = this.blocks;
        return arrayList.get(arrayList.size() - 1).forcesTimeToNewLine();
    }

    public void setTypingAnimator(MultiLayoutTypingAnimator multiLayoutTypingAnimator) {
        this.typingAnimator = multiLayoutTypingAnimator;
        for (int i = 0; i < this.blocks.size(); i++) {
            this.blocks.get(i).typingAnimator = multiLayoutTypingAnimator;
            boolean z = this.blocks.get(i) instanceof RichPreformattedBlock;
            this.blocks.get(i).getClass();
        }
    }

    public List<MultiLayoutTypingAnimator.Block> getAnimatorBlocks() {
        ArrayList arrayList = new ArrayList(this.blocks.size());
        for (int i = 0; i < this.blocks.size(); i++) {
            this.blocks.get(i).collectAnimatorBlocks(arrayList);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((MultiLayoutTypingAnimator.Block) arrayList.get(i2)).getClass();
        }
        return arrayList;
    }

    private void drawBackground(Canvas canvas, ChatMessageCell.TransitionParams transitionParams) {
        if (!this.quotes.isEmpty()) {
            Iterator<QuoteBackground> it = this.quotes.iterator();
            while (it.hasNext()) {
                QuoteBackground next = it.next();
                int blockTop = getBlockTop(next.startBlockIndex, transitionParams);
                int blockBottom = getBlockBottom(next.endBlockIndex, transitionParams);
                float blockBackgroundScale = getBlockBackgroundScale(next.startBlockIndex, next.endBlockIndex);
                int iDp = next.level * AndroidUtilities.dp(3.0f);
                int i = next.outerTopVpad + iDp;
                int i2 = iDp + next.outerBottomVpad;
                if (blockBottom - blockTop > i + i2) {
                    blockTop += i;
                    blockBottom -= i2;
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(next.padding, blockTop, getMinWidth() - AndroidUtilities.dp(next.level * 12), blockBottom);
                canvas.save();
                canvas.scale(blockBackgroundScale, blockBackgroundScale, rectF.centerX(), rectF.centerY());
                float fFloor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                this.quoteLine.drawBackground(canvas, rectF, fFloor, fFloor, fFloor, 1.0f, false, false);
                this.quoteLine.drawLine(canvas, rectF);
                canvas.restore();
            }
        }
        for (int i3 = 0; i3 < this.blocks.size(); i3++) {
            RichBlock richBlock = this.blocks.get(i3);
            if ((richBlock instanceof RichPullquoteBlock) && (richBlock.currVisible || richBlock.prevVisible)) {
                drawPullquoteBackground(canvas, (RichPullquoteBlock) richBlock, transitionParams);
            }
        }
    }

    private void drawPullquoteBackground(Canvas canvas, RichPullquoteBlock richPullquoteBlock, ChatMessageCell.TransitionParams transitionParams) {
        float fLerp;
        int textWidth = richPullquoteBlock.getTextWidth();
        if (textWidth <= 0) {
            return;
        }
        boolean z = transitionParams != null && (this.detailsAnimating || this.blockquoteAnimating);
        float fMax = z ? Math.max(0.0f, Math.min(1.0f, transitionParams.animateChangeProgress)) : 1.0f;
        if (z) {
            fLerp = AndroidUtilities.lerp(richPullquoteBlock.prevVisible ? 1.0f : 0.0f, richPullquoteBlock.currVisible ? 1.0f : 0.0f, fMax);
        } else {
            fLerp = richPullquoteBlock.currVisible ? 1.0f : 0.0f;
        }
        if (fLerp <= 0.0f) {
            return;
        }
        float minWidth = ((getMinWidth() + this.padRight) - this.padLeft) / 2.0f;
        float f = textWidth / 2.0f;
        float fDp = (minWidth - f) - AndroidUtilities.dp(30.0f);
        float fDp2 = minWidth + f + AndroidUtilities.dp(30.0f);
        float fLerp2 = z ? AndroidUtilities.lerp(richPullquoteBlock.prevY, richPullquoteBlock.currY, fMax) : richPullquoteBlock.currY;
        float fDp3 = fLerp2 + AndroidUtilities.dp(8.0f);
        float fLerp3 = (fLerp2 + (z ? AndroidUtilities.lerp(richPullquoteBlock.prevH, richPullquoteBlock.currH, fMax) : richPullquoteBlock.getHeight())) - AndroidUtilities.dp(8.0f);
        if (fLerp3 <= fDp3) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(fDp, fDp3, fDp2, fLerp3);
        float fFloor = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
        this.quoteLine.drawBackground(canvas, rectF, fFloor, fFloor, fFloor, fLerp, false, false);
        if (this.pullquoteIcon == null) {
            this.pullquoteIcon = ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.mini_quote).mutate();
        }
        this.pullquoteIcon.setColorFilter(this.quoteLine.getColor(), PorterDuff.Mode.SRC_IN);
        this.pullquoteIcon.setAlpha((int) (fLerp * 255.0f));
        int intrinsicWidth = this.pullquoteIcon.getIntrinsicWidth();
        int intrinsicHeight = this.pullquoteIcon.getIntrinsicHeight();
        canvas.save();
        canvas.clipRect(fDp, fDp3, fDp2, fLerp3);
        int i = (int) fDp;
        int i2 = (int) fDp3;
        this.pullquoteIcon.setBounds(AndroidUtilities.dp(8.0f) + i, AndroidUtilities.dp(7.0f) + i2, i + AndroidUtilities.dp(8.0f) + intrinsicWidth, i2 + AndroidUtilities.dp(7.0f) + intrinsicHeight);
        canvas.scale(-1.0f, -1.0f, this.pullquoteIcon.getBounds().centerX(), this.pullquoteIcon.getBounds().centerY());
        this.pullquoteIcon.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(fDp, fDp3, fDp2, fLerp3);
        Drawable drawable = this.pullquoteIcon;
        int i3 = (int) fDp2;
        int iDp = (i3 - AndroidUtilities.dp(8.0f)) - intrinsicWidth;
        int i4 = (int) fLerp3;
        drawable.setBounds(iDp, (i4 - AndroidUtilities.dp(7.0f)) - intrinsicHeight, i3 - AndroidUtilities.dp(8.0f), i4 - AndroidUtilities.dp(7.0f));
        canvas.scale(1.0f, -1.0f, this.pullquoteIcon.getBounds().centerX(), this.pullquoteIcon.getBounds().centerY());
        this.pullquoteIcon.draw(canvas);
        canvas.restore();
        this.pullquoteIcon.setAlpha(255);
    }

    private int getBlockTop(int i, ChatMessageCell.TransitionParams transitionParams) {
        int height;
        if (i >= 0 && i < this.blocks.size() && transitionParams != null && (this.detailsAnimating || this.blockquoteAnimating)) {
            float fMax = Math.max(0.0f, Math.min(1.0f, transitionParams.animateChangeProgress));
            RichBlock richBlock = this.blocks.get(i);
            return Math.round(AndroidUtilities.lerp(richBlock.prevY, richBlock.currY, fMax));
        }
        boolean z = false;
        int gap = 0;
        for (int i2 = 0; i2 < this.blocks.size(); i2++) {
            RichBlock richBlock2 = this.blocks.get(i2);
            boolean zIsVisible = richBlock2.isVisible();
            if (zIsVisible && z) {
                gap += getGap();
            }
            if (i2 == i) {
                return gap;
            }
            if (zIsVisible) {
                if (transitionParams != null && (this.detailsAnimating || this.blockquoteAnimating)) {
                    height = AndroidUtilities.lerp(richBlock2.prevH, richBlock2.currH, Math.max(0.0f, Math.min(1.0f, transitionParams.animateChangeProgress)));
                } else {
                    height = richBlock2.getHeight();
                }
                gap += height;
                z = true;
            }
        }
        return this.height;
    }

    private int getBlockBottom(int i, ChatMessageCell.TransitionParams transitionParams) {
        int height;
        if (i >= 0 && i < this.blocks.size() && transitionParams != null && (this.detailsAnimating || this.blockquoteAnimating)) {
            float fMax = Math.max(0.0f, Math.min(1.0f, transitionParams.animateChangeProgress));
            RichBlock richBlock = this.blocks.get(i);
            int iMax = Math.max(0, richBlock.padding.bottom - AndroidUtilities.dp(4.0f));
            return Math.round(AndroidUtilities.lerp((richBlock.prevY + richBlock.prevH) - (richBlock.prevVisible ? iMax : 0), (richBlock.currY + richBlock.currH) - (richBlock.currVisible ? iMax : 0), fMax));
        }
        boolean z = false;
        int iDp = 0;
        while (i < this.blocks.size()) {
            RichBlock richBlock2 = this.blocks.get(i);
            boolean zIsVisible = richBlock2.isVisible();
            if (zIsVisible && z) {
                iDp += getGap();
            }
            if (zIsVisible) {
                if (transitionParams != null && (this.detailsAnimating || this.blockquoteAnimating)) {
                    height = AndroidUtilities.lerp(richBlock2.prevH, richBlock2.currH, Math.max(0.0f, Math.min(1.0f, transitionParams.animateChangeProgress)));
                } else {
                    height = richBlock2.getHeight();
                }
                iDp += height;
                if (i == i && richBlock2.padding.bottom > AndroidUtilities.dp(4.0f)) {
                    iDp -= richBlock2.padding.bottom - AndroidUtilities.dp(4.0f);
                }
            }
            if (i == i) {
                return iDp;
            }
            if (zIsVisible) {
                z = true;
            }
            i++;
        }
        return this.height;
    }

    private float getBlockBackgroundScale(int i, int i2) {
        float backgroundScale = 1.0f;
        while (i < Math.min(i2 + 1, this.blocks.size())) {
            RichBlock richBlock = this.blocks.get(i);
            if (richBlock.isVisible()) {
                backgroundScale *= richBlock.getBackgroundScale();
            }
            i++;
        }
        return backgroundScale;
    }

    private void drawInternal(Canvas canvas, ChatMessageCell.TransitionParams transitionParams) {
        float f;
        float f2;
        ChatMessageCell chatMessageCell = this.cell;
        boolean z = chatMessageCell != null && chatMessageCell.visibleHeight > 0;
        if (z) {
            float f3 = chatMessageCell.childPosition - chatMessageCell.textY;
            f2 = chatMessageCell.visibleHeight + f3;
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        drawInternal(canvas, transitionParams, z, f, f2);
    }

    private void updateTranslationLoading() {
        View view;
        boolean zIsTranslating = isTranslating();
        if (!zIsTranslating && this.translationLoadingFloat == null) {
            this.translationLoadingValue = 0.0f;
            return;
        }
        if (this.translationLoadingFloat == null) {
            this.translationLoadingFloat = new AnimatedFloat(0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }
        float f = this.translationLoadingFloat.set(zIsTranslating ? 1.0f : 0.0f);
        this.translationLoadingValue = f;
        if (f <= 0.0f || (view = this.view) == null) {
            return;
        }
        view.invalidate();
    }

    private void drawInternal(android.graphics.Canvas r19, org.telegram.ui.Cells.ChatMessageCell.TransitionParams r20, boolean r21, float r22, float r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.drawInternal(android.graphics.Canvas, org.telegram.ui.Cells.ChatMessageCell$TransitionParams, boolean, float, float):void");
    }

    private void computeDetailsClips(float f) {
        float fLerp;
        for (int i = 0; i < this.blocks.size(); i++) {
            RichBlock richBlock = this.blocks.get(i);
            if (richBlock instanceof RichDetailsBlock) {
                RichDetailsBlock richDetailsBlock = (RichDetailsBlock) richBlock;
                richDetailsBlock.animClipTop = AndroidUtilities.lerp(richDetailsBlock.prevY, richDetailsBlock.currY, f) + richDetailsBlock.getHeight();
                int i2 = i + 1;
                while (true) {
                    if (i2 >= this.blocks.size()) {
                        fLerp = Float.MAX_VALUE;
                        break;
                    } else {
                        if (!isDescendantOf(this.blocks.get(i2), richDetailsBlock)) {
                            fLerp = AndroidUtilities.lerp(this.blocks.get(i2).prevY, this.blocks.get(i2).currY, f);
                            break;
                        }
                        i2++;
                    }
                }
                richDetailsBlock.animClipBottom = fLerp;
            }
        }
    }

    private void computeBlockquoteClips(float f) {
        for (int i = 0; i < this.blocks.size(); i++) {
            RichBlock richBlock = this.blocks.get(i);
            if (richBlock instanceof RichTextBlockQuote) {
                RichTextBlockQuote richTextBlockQuote = (RichTextBlockQuote) richBlock;
                richTextBlockQuote.collapsedProgress = AndroidUtilities.lerp(richTextBlockQuote.prevCollapsed ? 1.0f : 0.0f, richTextBlockQuote.currentCollapsed ? 1.0f : 0.0f, f);
                richTextBlockQuote.collapsedHeightToDraw = AndroidUtilities.lerp(richTextBlockQuote.prevH, richTextBlockQuote.currH, f);
            }
        }
    }

    private static boolean isDescendantOf(RichBlock richBlock, RichDetailsBlock richDetailsBlock) {
        do {
            richBlock = richBlock.parentDetails;
            if (richBlock == null) {
                return false;
            }
        } while (richBlock != richDetailsBlock);
        return true;
    }

    public void draw(Canvas canvas, int i, int i2, ChatMessageCell.TransitionParams transitionParams) {
        setBubblePaddings(i, i2);
        this.textPaint.linkColor = getThemedColor(isOut() ? Theme.key_chat_messageLinkOut : Theme.key_chat_messageLinkIn);
        boolean z = this.isPart;
        int iMin = Math.min(this.height, AndroidUtilities.dp(900.0f));
        if (z) {
            canvas.saveLayerAlpha(-i, 0.0f, getMinWidth() + i2, iMin, 255, 31);
        }
        drawInternal(canvas, transitionParams);
        if (z) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(-i, iMin - AndroidUtilities.dp(32.0f), getMinWidth() + i2, iMin);
            this.clip.draw(canvas, rectF, 3, 1.0f);
            canvas.restore();
            drawShowMoreButton(canvas, iMin);
        }
    }

    public void draw(Canvas canvas, int i, int i2, ChatMessageCell.TransitionParams transitionParams, float f, float f2) {
        setBubblePaddings(i, i2);
        this.textPaint.linkColor = getThemedColor(isOut() ? Theme.key_chat_messageLinkOut : Theme.key_chat_messageLinkIn);
        drawInternal(canvas, transitionParams, f2 > f, f, f2);
    }

    private void setBubblePaddings(int i, int i2) {
        if (this.padLeft == i && this.padRight == i2) {
            return;
        }
        this.padLeft = i;
        this.padRight = i2;
        for (int i3 = 0; i3 < this.blocks.size(); i3++) {
            RichBlock richBlock = this.blocks.get(i3);
            if (richBlock instanceof RichDetailsBlock) {
                ((RichDetailsBlock) richBlock).updateBubbleInsets();
            }
        }
    }

    private void drawShowMoreButton(Canvas canvas, int i) {
        ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate;
        int themedColor = getThemedColor(isOut() ? Theme.key_chat_outPreviewInstantText : Theme.key_chat_inPreviewInstantText);
        if (this.showMoreText == null) {
            this.showMoreText = new org.telegram.ui.Components.Text(LocaleController.getString(R.string.ShowMore), 16.0f, AndroidUtilities.bold());
        }
        ButtonBounce buttonBounce = this.showMoreBounce;
        if (buttonBounce == null) {
            this.showMoreBounce = new ButtonBounce(this.view, 1.5f, 2.0f);
        } else {
            View view = buttonBounce.getView();
            View view2 = this.view;
            if (view != view2) {
                this.showMoreBounce.setView(view2);
            }
        }
        if (this.showMorePaint == null) {
            this.showMorePaint = new Paint(1);
        }
        this.showMorePaint.setColor(Theme.multAlpha(themedColor, 0.1f));
        float fDp = AndroidUtilities.dp(42.0f);
        float currentWidth = this.showMoreText.getCurrentWidth();
        float minWidth = ((getMinWidth() + this.padLeft) + this.padRight) - AndroidUtilities.dp(24.0f);
        int minWidth2 = getMinWidth();
        float f = (((minWidth2 + r8) + this.padRight) / 2.0f) - this.padLeft;
        float fDp2 = i + AndroidUtilities.dp(4.0f);
        float f2 = minWidth / 2.0f;
        this.showMoreRect.set(f - f2, fDp2, f + f2, fDp + fDp2);
        ChatMessageCell chatMessageCell = this.cell;
        boolean z = (chatMessageCell == null || (chatMessageCellDelegate = this.delegate) == null || !chatMessageCellDelegate.isProgressLoading(chatMessageCell, 7)) ? false : true;
        LoadingDrawable loadingDrawable = this.showMoreLoading;
        if (loadingDrawable != null && !z && !loadingDrawable.isDisappeared() && !this.showMoreLoading.isDisappearing()) {
            this.showMoreLoading.disappear();
        }
        LoadingDrawable loadingDrawable2 = this.showMoreLoading;
        if (loadingDrawable2 == null && z) {
            LoadingDrawable loadingDrawable3 = new LoadingDrawable();
            this.showMoreLoading = loadingDrawable3;
            loadingDrawable3.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.25f));
            this.showMoreLoading.setAppearByGradient(true);
        } else if (loadingDrawable2 != null && z && (loadingDrawable2.isDisappeared() || this.showMoreLoading.isDisappearing())) {
            this.showMoreLoading.reset();
            this.showMoreLoading.resetDisappear();
        }
        LoadingDrawable loadingDrawable4 = this.showMoreLoading;
        if (loadingDrawable4 != null) {
            loadingDrawable4.setColors(Theme.multAlpha(themedColor, 0.1f), Theme.multAlpha(themedColor, 0.3f), Theme.multAlpha(themedColor, 0.3f), Theme.multAlpha(themedColor, 1.2f));
        }
        float scale = this.showMoreBounce.getScale(0.075f);
        boolean z2 = scale != 1.0f;
        if (z2) {
            canvas.save();
            canvas.scale(scale, scale, this.showMoreRect.centerX(), this.showMoreRect.centerY());
        }
        canvas.drawRoundRect(this.showMoreRect, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.showMorePaint);
        LoadingDrawable loadingDrawable5 = this.showMoreLoading;
        if (loadingDrawable5 != null && !loadingDrawable5.isDisappeared()) {
            this.showMoreLoading.setBounds(this.showMoreRect);
            this.showMoreLoading.setRadiiDp(8.0f);
            this.showMoreLoading.draw(canvas);
            View view3 = this.view;
            if (view3 != null) {
                view3.invalidate();
            }
        }
        this.showMoreText.draw(canvas, this.showMoreRect.centerX() - (currentWidth / 2.0f), this.showMoreRect.centerY(), themedColor, 1.0f);
        if (z2) {
            canvas.restore();
        }
    }

    public boolean isOverlayActive() {
        MultiLayoutTypingAnimator multiLayoutTypingAnimator = this.typingAnimator;
        return multiLayoutTypingAnimator == null || !multiLayoutTypingAnimator.isRunning();
    }

    public boolean hasOverlay() {
        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans;
        if (!isOverlayActive()) {
            return false;
        }
        for (int i = 0; i < this.textBlocks.size(); i++) {
            TextSelectionHelper.TextLayoutBlock textLayoutBlock = this.textBlocks.get(i);
            if ((textLayoutBlock instanceof Text) && (emojiGroupedSpans = ((Text) textLayoutBlock).animatedEmojiStack) != null && !emojiGroupedSpans.holders.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public boolean drawOverlay(Canvas canvas) {
        return drawOverlay(canvas, null);
    }

    public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
        if (!isOverlayActive()) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.blocks.size(); i++) {
            RichBlock richBlock = this.blocks.get(i);
            if (richBlock.currVisible) {
                canvas.save();
                canvas.translate(0.0f, richBlock.currY);
                if (richBlock.drawOverlay(canvas, colorFilter)) {
                    z = true;
                }
                canvas.restore();
            }
        }
        return z;
    }

    public void updateAnimatedEmojis(int i) {
        for (int i2 = 0; i2 < this.textBlocks.size(); i2++) {
            TextSelectionHelper.TextLayoutBlock textLayoutBlock = this.textBlocks.get(i2);
            if (textLayoutBlock instanceof Text) {
                ((Text) textLayoutBlock).refreshAnimatedEmoji(i);
            }
        }
    }

    public boolean isHorizontallyDragging() {
        RichBlock richBlock = this.pressedBlock;
        return richBlock != null && richBlock.isHorizontallyDragging();
    }

    public boolean isPressingLink() {
        RichBlock richBlock = this.pressedBlock;
        return richBlock != null && richBlock.isPressingLink();
    }

    public ChatMessageCell getCell() {
        return this.cell;
    }

    public ChatMessageCell.ChatMessageCellDelegate getDelegate() {
        return this.delegate;
    }

    public boolean handleAnchorClick(String str) throws UnsupportedEncodingException {
        String strSubstring;
        if (str == null || !str.startsWith("#")) {
            return false;
        }
        try {
            strSubstring = URLDecoder.decode(str.substring(1), "UTF-8");
        } catch (Exception unused) {
            strSubstring = str.substring(1);
        }
        if (TextUtils.isEmpty(strSubstring)) {
            return false;
        }
        String lowerCase = strSubstring.toLowerCase();
        TL_iv.textAnchor textanchor = this.textAnchors.get(lowerCase);
        if (textanchor != null) {
            return showFootnoteSheet(textanchor);
        }
        Integer num = this.anchors.get(lowerCase);
        if (num != null) {
            return scrollToPageBlockAnchor(num.intValue());
        }
        return true;
    }

    private boolean scrollToPageBlockAnchor(int i) {
        RecyclerView recyclerView;
        if (this.cell == null || i < 0 || i >= this.blocks.size()) {
            return false;
        }
        ViewParent parent = this.cell.getParent();
        while (true) {
            if (parent == null) {
                recyclerView = null;
                break;
            }
            if (parent instanceof RecyclerView) {
                recyclerView = (RecyclerView) parent;
                break;
            }
            parent = parent.getParent();
        }
        if (recyclerView == null) {
            return false;
        }
        recyclerView.smoothScrollBy(0, (((this.cell.getTop() + this.cell.textY) + getBlockTop(i, null)) - recyclerView.getPaddingTop()) - AndroidUtilities.dp(8.0f));
        return true;
    }

    private boolean showFootnoteSheet(TL_iv.textAnchor textanchor) {
        Context context;
        TL_iv.RichText richText;
        View view = this.view;
        if (view == null || (context = view.getContext()) == null || (richText = textanchor.text) == null || (richText instanceof TL_iv.textEmpty)) {
            return false;
        }
        String str = textanchor.name;
        CharSequence text = formatText(WebInstantView.filterRecursiveAnchorLinks(textanchor.text, "", str == null ? "" : str.toLowerCase()));
        BottomSheet.Builder builder = new BottomSheet.Builder(context, true, this.resourcesProvider);
        builder.setApplyTopPadding(false);
        builder.setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.InstantViewReference));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        int i = Theme.key_dialogTextBlack;
        textView.setTextColor(getThemedColor(i));
        textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f)));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, this.resourcesProvider);
        linksTextView.setTextSize(1, SharedConfig.fontSize);
        linksTextView.setTextColor(getThemedColor(i));
        linksTextView.setLinkTextColor(getThemedColor(Theme.key_dialogTextLink));
        linksTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linksTextView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(16.0f));
        linksTextView.setText(text);
        linearLayout.addView(linksTextView, new LinearLayout.LayoutParams(-1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f));
        builder.setCustomView(frameLayout);
        builder.show();
        return true;
    }

    public FoundLink findLink(CharacterStyle characterStyle) {
        if (characterStyle == null) {
            return null;
        }
        FoundLink foundLink = new FoundLink();
        boolean z = false;
        int height = 0;
        for (int i = 0; i < this.blocks.size(); i++) {
            RichBlock richBlock = this.blocks.get(i);
            if (richBlock.isVisible()) {
                if (z) {
                    height += getGap();
                }
                if (richBlock.findLink(characterStyle, height, foundLink)) {
                    return foundLink;
                }
                height += richBlock.getHeight();
                z = true;
            }
        }
        return null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (motionEvent.getX() < this.padLeft || motionEvent.getX() > getMinWidth() + this.padRight)) {
            return false;
        }
        if (this.isPart) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (actionMasked == 0) {
                if (this.showMoreRect.contains(x, y)) {
                    this.showMorePressed = true;
                    ButtonBounce buttonBounce = this.showMoreBounce;
                    if (buttonBounce != null) {
                        buttonBounce.setPressed(true);
                    }
                    return true;
                }
            } else if (this.showMorePressed) {
                if (actionMasked == 2) {
                    if (!this.showMoreRect.contains(x, y)) {
                        ButtonBounce buttonBounce2 = this.showMoreBounce;
                        if (buttonBounce2 != null) {
                            buttonBounce2.setPressed(false);
                        }
                        this.showMorePressed = false;
                    }
                    return true;
                }
                if (actionMasked == 1 || actionMasked == 3) {
                    ButtonBounce buttonBounce3 = this.showMoreBounce;
                    if (buttonBounce3 != null) {
                        buttonBounce3.setPressed(false);
                    }
                    boolean z = actionMasked == 1 && this.showMoreRect.contains(x, y);
                    this.showMorePressed = false;
                    if (z && this.delegate != null && this.cell != null) {
                        View view = this.view;
                        if (view != null) {
                            view.performHapticFeedback(3, 2);
                        }
                        this.delegate.didPressShowMore(this.cell);
                    }
                    return true;
                }
            }
        }
        if (actionMasked == 0) {
            this.pressedBlock = null;
            float y2 = motionEvent.getY();
            int i = 0;
            boolean z2 = false;
            int gap = 0;
            while (true) {
                if (i >= this.blocks.size()) {
                    break;
                }
                RichBlock richBlock = this.blocks.get(i);
                if (richBlock.isVisible()) {
                    if (z2) {
                        gap += getGap();
                    }
                    int height = richBlock.getHeight();
                    float f = gap;
                    if (y2 < f || y2 >= gap + height) {
                        gap += height;
                        z2 = true;
                    } else {
                        motionEvent.offsetLocation(0.0f, -gap);
                        boolean z3 = richBlock.touchEvent(motionEvent);
                        motionEvent.offsetLocation(0.0f, f);
                        if (z3) {
                            this.pressedBlock = richBlock;
                            this.pressedBlockY = gap;
                            return true;
                        }
                    }
                }
                i++;
            }
            return false;
        }
        if (this.pressedBlock == null) {
            return false;
        }
        motionEvent.offsetLocation(0.0f, -this.pressedBlockY);
        boolean z4 = this.pressedBlock.touchEvent(motionEvent);
        motionEvent.offsetLocation(0.0f, this.pressedBlockY);
        if (actionMasked == 1 || actionMasked == 3) {
            this.pressedBlock = null;
        }
        return z4;
    }

    private static int getBlockTextFlag(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return 1;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return 2;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return 3;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return 4;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return 5;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return 6;
        }
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks)) {
            return 9;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return 12;
        }
        return pageBlock instanceof TL_iv.pageBlockFooter ? 7 : 0;
    }

    private static int getBlockAccessibilityLabel(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return R.string.ArticleHeading1;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return R.string.ArticleHeading2;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return R.string.ArticleHeading3;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return R.string.ArticleHeading4;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return R.string.ArticleHeading5;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return R.string.ArticleHeading6;
        }
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return R.string.ArticleFooter;
        }
        return 0;
    }

    public CharSequence formatText(TL_iv.RichText richText) {
        return formatText(richText, new SpannableStringBuilder(), 0);
    }

    public CharSequence formatText(TL_iv.RichText richText, int i) {
        if (i == 0) {
            return formatText(richText, new SpannableStringBuilder(), 0);
        }
        return formatTextAndSetSpan(richText, new SpannableStringBuilder(), i, new StyleSpan(this, i));
    }

    private void setSpansWithoutClash(Object obj, final SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (obj instanceof StyleSpan) {
            StyleSpan styleSpan = (StyleSpan) obj;
            StyleSpan[] styleSpanArr = (StyleSpan[]) spannableStringBuilder.getSpans(i, i2, StyleSpan.class);
            if (styleSpanArr != null && styleSpanArr.length > 0) {
                Arrays.sort(styleSpanArr, Comparator$CC.comparingInt(new ToIntFunction() {
                    @Override
                    public final int applyAsInt(Object obj2) {
                        return spannableStringBuilder.getSpanStart((RichMessageLayout.StyleSpan) obj2);
                    }
                }));
                for (int i3 = 0; i3 < styleSpanArr.length; i3++) {
                    int spanStart = spannableStringBuilder.getSpanStart(styleSpanArr[i3]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(styleSpanArr[i3]);
                    if (spanStart > i) {
                        setStyleRange(spannableStringBuilder, i, spanStart, styleSpan.flags);
                    }
                    i = Math.max(i, spanEnd);
                }
                if (i < i2) {
                    setStyleRange(spannableStringBuilder, i, i2, styleSpan.flags);
                    return;
                }
                return;
            }
            setStyleRange(spannableStringBuilder, i, i2, styleSpan.flags);
            return;
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    private void setStyleRange(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        while (i < i2) {
            int iNextSpanTransition = spannableStringBuilder.nextSpanTransition(i, i2, URLSpan.class);
            spannableStringBuilder.setSpan(new StyleSpan(this, i3, ((URLSpan[]) spannableStringBuilder.getSpans(i, iNextSpanTransition, URLSpan.class)).length > 0), i, iNextSpanTransition, 33);
            i = iNextSpanTransition;
        }
    }

    private CharSequence formatTextAndSetSpan(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i, Object obj) {
        int length = spannableStringBuilder.length();
        formatText(richText, spannableStringBuilder, i);
        if (spannableStringBuilder.length() > length) {
            setSpansWithoutClash(obj, spannableStringBuilder, length, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    private CharSequence formatTextAndSetSpan(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i, Object obj, Object obj2) {
        int length = spannableStringBuilder.length();
        formatText(richText, spannableStringBuilder, i);
        if (spannableStringBuilder.length() > length) {
            setSpansWithoutClash(obj, spannableStringBuilder, length, spannableStringBuilder.length());
            setSpansWithoutClash(obj2, spannableStringBuilder, length, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    private static TextStyleSpan.TextStyleRun getTextStyleRun(int i) {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags = i;
        return textStyleRun;
    }

    public CharSequence formatText(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i) {
        AnimatedEmojiSpan size;
        if (!(richText instanceof TL_iv.textEmpty)) {
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append((CharSequence) ((TL_iv.textPlain) richText).text);
            } else if (richText instanceof TL_iv.textDiff) {
                TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                boolean zIsEmpty = RichTextStyle.isEmpty(textdiff.text);
                boolean zIsEmpty2 = RichTextStyle.isEmpty(textdiff.old_text);
                if (zIsEmpty && !zIsEmpty2) {
                    formatTextAndSetSpan(textdiff.old_text, spannableStringBuilder, i, new TextStyleSpan(getTextStyleRun(8192)));
                } else if (!zIsEmpty && zIsEmpty2) {
                    formatTextAndSetSpan(textdiff.text, spannableStringBuilder, i, new TextStyleSpan(getTextStyleRun(4096)));
                } else if (!zIsEmpty) {
                    formatTextAndSetSpan(textdiff.text, spannableStringBuilder, i, new SquigglyLinesSpan());
                }
            } else if (richText instanceof TL_iv.textBold) {
                int i2 = i | 16;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i2, new StyleSpan(this, i2));
            } else if (richText instanceof TL_iv.textItalic) {
                int i3 = i | 32;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i3, new StyleSpan(this, i3));
            } else if (richText instanceof TL_iv.textUnderline) {
                int i4 = i | 64;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i4, new StyleSpan(this, i4));
            } else if (richText instanceof TL_iv.textStrike) {
                int i5 = i | 128;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i5, new StyleSpan(this, i5));
            } else if (richText instanceof TL_iv.textFixed) {
                int i6 = i | 256;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i6, new StyleSpan(this, i6));
            } else if (richText instanceof TL_iv.textUrl) {
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanReplacement(((TL_iv.textUrl) richText).url, getTextStyleRun(1024)));
            } else if (richText instanceof TL_iv.textEmail) {
                TL_iv.textEmail textemail = (TL_iv.textEmail) richText;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanReplacement("mailto:" + textemail.email, getTextStyleRun(1024)));
            } else if (richText instanceof TL_iv.textConcat) {
                for (int i7 = 0; i7 < richText.texts.size(); i7++) {
                    formatText(richText.texts.get(i7), spannableStringBuilder, i);
                }
            } else if (richText instanceof TL_iv.textSubscript) {
                int i8 = i | 2048;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i8, new StyleSpan(this, i8));
            } else if (richText instanceof TL_iv.textSuperscript) {
                int i9 = i | 4096;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i9, new StyleSpan(this, i9));
            } else if (richText instanceof TL_iv.textMarked) {
                int i10 = i | 8192;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new StyleSpan(this, i10));
            } else if (richText instanceof TL_iv.textPhone) {
                TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(textphone.phone);
                if (textphone.phone.startsWith("+")) {
                    strStripExceptNumbers = "+" + strStripExceptNumbers;
                }
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanReplacement("tel:" + strStripExceptNumbers, getTextStyleRun(1024)));
            } else if (richText instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText;
                String str = textanchor.name;
                if (str != null) {
                    String lowerCase = str.toLowerCase();
                    if (!(textanchor.text instanceof TL_iv.textEmpty)) {
                        this.textAnchors.put(lowerCase, textanchor);
                    } else if (!this.anchors.containsKey(lowerCase)) {
                        this.anchors.put(lowerCase, Integer.valueOf(this.blocks.size()));
                    }
                }
                TL_iv.RichText richText2 = richText.text;
                String str2 = textanchor.name;
                formatTextAndSetSpan(richText2, spannableStringBuilder, i, new AnchorSpan(str2 != null ? str2.toLowerCase() : ""));
            } else if (richText instanceof TL_iv.textMath) {
                TL_iv.textMath textmath = (TL_iv.textMath) richText;
                if (textmath.bitmap == null && !textmath.tried) {
                    textmath.tried = true;
                    Latex latexRender = Latex.render(textmath.source, AndroidUtilities.dp(this.fontSize + 4), true);
                    if (latexRender != null) {
                        textmath.w = latexRender.width;
                        textmath.h = latexRender.height;
                        textmath.depth = latexRender.depth;
                        textmath.bitmap = latexRender.bitmap;
                    }
                }
                if (textmath.bitmap == null) {
                    String str3 = textmath.source;
                    return str3 == null ? "" : str3;
                }
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(" ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.setSpan(new TextPaintImageReceiverSpan(null, textmath.bitmap, textmath.w, textmath.h, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), textmath.depth), length, length2, 33);
                String str4 = textmath.source;
                if (str4 != null && !str4.isEmpty()) {
                    spannableStringBuilder.setSpan(new TextSelectionHelper.ReplaceCopyTextSpannable(textmath.source), length, length2, 33);
                }
            } else if (richText instanceof TL_iv.textCustomEmoji) {
                TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
                String str5 = TextUtils.isEmpty(textcustomemoji.alt) ? "😀" : textcustomemoji.alt;
                int length3 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) str5);
                int length4 = spannableStringBuilder.length();
                boolean zHasFlag = BitwiseUtils.hasFlag(i, 13);
                int i11 = i & 15;
                if (i11 >= 1 && i11 <= 6) {
                    TextPaint textPaint = new TextPaint(this.textPaint);
                    new StyleSpan(this, i, true).applyStyle(textPaint);
                    size = new AnimatedEmojiSpan(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                } else {
                    size = new AnimatedEmojiSpan(textcustomemoji.document_id, zHasFlag ? 1.0f : 1.2f, (Paint.FontMetricsInt) null).setSize(AndroidUtilities.dp(this.fontSize + 4 + (zHasFlag ? -2 : 4)));
                }
                spannableStringBuilder.setSpan(size, length3, length4, 33);
            } else if (richText instanceof TL_iv.textSpoiler) {
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new TextStyleSpan(getTextStyleRun(256)));
            } else if (richText instanceof TL_iv.textMention) {
                TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.urlEntity = tL_messageEntityMention;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanNoUnderline(getString(richText), textStyleRun));
            } else if (richText instanceof TL_iv.textHashtag) {
                TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                TextStyleSpan.TextStyleRun textStyleRun2 = new TextStyleSpan.TextStyleRun();
                textStyleRun2.urlEntity = tL_messageEntityHashtag;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanNoUnderline(getString(richText), textStyleRun2));
            } else if (richText instanceof TL_iv.textBotCommand) {
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanBotCommand(getString(richText), isOut() ? 1 : 0));
            } else if (richText instanceof TL_iv.textCashtag) {
                TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                TextStyleSpan.TextStyleRun textStyleRun3 = new TextStyleSpan.TextStyleRun();
                textStyleRun3.urlEntity = tL_messageEntityCashtag;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanNoUnderline(getString(richText), textStyleRun3));
            } else if (richText instanceof TL_iv.textAutoUrl) {
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanReplacement(getString(richText), getTextStyleRun(1024)));
            } else if (richText instanceof TL_iv.textAutoEmail) {
                String string = getString(richText);
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanReplacement("mailto:" + string, getTextStyleRun(1024)));
            } else if (richText instanceof TL_iv.textAutoPhone) {
                String string2 = getString(richText);
                String strStripExceptNumbers2 = PhoneFormat.stripExceptNumbers(string2);
                if (string2.startsWith("+")) {
                    strStripExceptNumbers2 = "+" + strStripExceptNumbers2;
                }
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanReplacement("tel:" + strStripExceptNumbers2, getTextStyleRun(1024)));
            } else if (richText instanceof TL_iv.textBankCard) {
                String string3 = getString(richText);
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanNoUnderline("card:" + string3));
            } else if (richText instanceof TL_iv.textMentionName) {
                TL_iv.textMentionName textmentionname = (TL_iv.textMentionName) richText;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanUserMention("" + textmentionname.user_id, isOut() ? 1 : 0));
            } else if (richText instanceof TL_iv.textDate) {
                TL_iv.textDate textdate = (TL_iv.textDate) richText;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.relative = textdate.relative;
                tL_messageEntityFormattedDate.short_time = textdate.short_time;
                tL_messageEntityFormattedDate.long_time = textdate.long_time;
                tL_messageEntityFormattedDate.short_date = textdate.short_date;
                tL_messageEntityFormattedDate.long_date = textdate.long_date;
                tL_messageEntityFormattedDate.day_of_week = textdate.day_of_week;
                tL_messageEntityFormattedDate.date = textdate.date;
                int i12 = i | 512;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i12, new StyleSpan(this, i12), new FormattedDateSpan(getString(richText), null, tL_messageEntityFormattedDate));
            } else if (richText instanceof TL_iv.textButton) {
                int length5 = spannableStringBuilder.length();
                spannableStringBuilder.append("*");
                spannableStringBuilder.setSpan(new RichButtonSpan(this, this.maxWidth, (TL_iv.textButton) richText), length5, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static String getString(TL_iv.RichText richText) {
        StringBuilder sb = new StringBuilder();
        getString(richText, sb);
        return sb.toString();
    }

    public static void getString(TL_iv.RichText richText, StringBuilder sb) {
        if (richText instanceof TL_iv.textPlain) {
            sb.append(((TL_iv.textPlain) richText).text);
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            if (!RichTextStyle.isEmpty(textdiff.text)) {
                getString(textdiff.text, sb);
                return;
            } else {
                if (RichTextStyle.isEmpty(textdiff.old_text)) {
                    return;
                }
                getString(textdiff.old_text, sb);
                return;
            }
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i = 0; i < richText.texts.size(); i++) {
                getString(richText.texts.get(i), sb);
            }
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            getString(richText2, sb);
        }
    }

    public static class AnchorSpan extends CharacterStyle {
        public final String name;

        @Override
        public void updateDrawState(TextPaint textPaint) {
        }

        public AnchorSpan(String str) {
            this.name = str;
        }
    }

    public static class StyleSpan extends MetricAffectingSpan {
        public final int flags;
        public final boolean metricsOnly;
        public final RichMessageLayout root;

        public StyleSpan(RichMessageLayout richMessageLayout, int i) {
            this(richMessageLayout, i, false);
        }

        public StyleSpan(RichMessageLayout richMessageLayout, int i, boolean z) {
            this.root = richMessageLayout;
            this.flags = i;
            this.metricsOnly = z;
        }

        public void applyStyle(TextPaint textPaint) {
            Typeface typeface = getTypeface();
            if (typeface != null) {
                textPaint.setTypeface(typeface);
            }
            int textSize = getTextSize();
            if (TLObject.hasFlag(this.flags, 6144)) {
                textSize -= AndroidUtilities.dp(4.0f);
            }
            textPaint.setTextSize(textSize);
            if (!this.metricsOnly) {
                textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(this.flags, 64)), 16, TLObject.hasFlag(this.flags, 128)));
                if ((this.flags & 15) != 8) {
                    textPaint.setColor(getTextColor());
                }
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                textPaint.baselineShift -= AndroidUtilities.dp(6.0f);
            } else if (TLObject.hasFlag(this.flags, 2048)) {
                textPaint.baselineShift += AndroidUtilities.dp(2.0f);
            }
        }

        public int getTextSize() {
            int i = this.flags & 15;
            int i2 = SharedConfig.fontSize;
            switch (i) {
                case 1:
                    return AndroidUtilities.dp(i2 + 3);
                case 2:
                    return AndroidUtilities.dp(i2 + 2);
                case 3:
                    return AndroidUtilities.dp(i2 + 1);
                case 4:
                    return AndroidUtilities.dp(i2);
                case 5:
                    return AndroidUtilities.dp(i2 - 1);
                case 6:
                    return AndroidUtilities.dp(i2 - 2);
                case 7:
                case 13:
                    return AndroidUtilities.dp(i2 - 2);
                case 8:
                    return AndroidUtilities.dp(i2 - 1);
                case 9:
                case 11:
                case 12:
                    return AndroidUtilities.dp(i2 - 2);
                case 10:
                    return AndroidUtilities.dp(i2 - 2);
                case 14:
                    return AndroidUtilities.dp(14.0f);
                case 15:
                    return AndroidUtilities.dp(i2 - 2);
                default:
                    return AndroidUtilities.dp(i2);
            }
        }

        public int getTextColor() {
            int i = this.flags & 15;
            if (i == 11) {
                RichMessageLayout richMessageLayout = this.root;
                return richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_outReplyNameText : Theme.key_chat_inReplyNameText);
            }
            if (i == 10) {
                RichMessageLayout richMessageLayout2 = this.root;
                return Theme.multAlpha(richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? Theme.key_chat_messageTextOut : Theme.key_chat_messageTextIn), 0.5f);
            }
            RichMessageLayout richMessageLayout3 = this.root;
            return richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? Theme.key_chat_messageTextOut : Theme.key_chat_messageTextIn);
        }

        public Typeface getTypeface() {
            int i = this.flags;
            int i2 = i & 15;
            if (i2 == 8) {
                return Typeface.MONOSPACE;
            }
            if (i2 == 11) {
                return AndroidUtilities.bold();
            }
            boolean z = true;
            if (i2 >= 1 && i2 <= 6) {
                if (TLObject.hasFlag(i, 32)) {
                    return AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
                }
                return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
            if (TLObject.hasFlag(i, 256)) {
                return Typeface.MONOSPACE;
            }
            boolean zHasFlag = TLObject.hasFlag(this.flags, 16);
            if (!TLObject.hasFlag(this.flags, 32) && i2 != 12) {
                z = false;
            }
            if (zHasFlag && z) {
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            }
            if (zHasFlag) {
                return AndroidUtilities.bold();
            }
            if (z) {
                return AndroidUtilities.getTypeface("fonts/ritalic.ttf");
            }
            return null;
        }

        @Override
        public void updateMeasureState(TextPaint textPaint) {
            applyStyle(textPaint);
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            applyStyle(textPaint);
        }
    }

    public static class Text implements TextSelectionHelper.TextLayoutBlock, TableLayout.CellText {
        private static Paint markPaint;
        public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
        public int blockX;
        public int blockY;
        public boolean doNotInvalidateEmojiInParent;
        private boolean drawAtOrigin;
        public int lastLineRight;
        public final StaticLayout layout;
        public int left;
        public LinkSpanDrawable.LinkCollector linkCollector;
        private boolean longPressFired;
        private Runnable longPressRunnable;
        public LinkPath markPath;
        private RichButtonSpan pressedButtonSpan;
        private AnimatedEmojiSpan pressedEmoji;
        private CharacterStyle pressedLink;
        private LinkSpanDrawable pressedLinkDrawable;
        private int pressedLinkEnd;
        private int pressedLinkStart;
        private SpoilerEffect pressedSpoiler;
        public int right;
        public final RichMessageLayout root;
        public int row;
        public final List<SpoilerEffect> spoilers;
        public final AtomicReference<Layout> spoilersPatchedTextLayout;
        public final Stack<SpoilerEffect> spoilersPool;
        private LoadingDrawable translationLoadingDrawable;
        private LinkPath translationLoadingPath;
        public View view;
        public int x;
        public int y;

        @Override
        public CharSequence getPrefix() {
            return TextSelectionHelper.TextLayoutBlock.CC.$default$getPrefix(this);
        }

        @Override
        public Rect getSelectionBounds() {
            return TextSelectionHelper.TextLayoutBlock.CC.$default$getSelectionBounds(this);
        }

        @Override
        public CharSequence getText() {
            return TableLayout.CellText.CC.$default$getText(this);
        }

        public boolean isPressingLink() {
            return (this.pressedLink == null && this.pressedButtonSpan == null) ? false : true;
        }

        public boolean fillFoundLink(CharacterStyle characterStyle, FoundLink foundLink) {
            if (!(this.layout.getText() instanceof Spanned)) {
                return false;
            }
            Spanned spanned = (Spanned) this.layout.getText();
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            if (spanStart < 0 || spanEnd <= spanStart) {
                return false;
            }
            StaticLayout staticLayout = this.layout;
            foundLink.layout = staticLayout;
            foundLink.start = spanStart;
            foundLink.end = spanEnd;
            foundLink.originalWidth = staticLayout.getWidth();
            return true;
        }

        public Text(RichMessageLayout richMessageLayout, CharSequence charSequence, int i) {
            this(richMessageLayout, charSequence, i, Layout.Alignment.ALIGN_NORMAL);
        }

        public Text(RichMessageLayout richMessageLayout, CharSequence charSequence, int i, Layout.Alignment alignment) {
            this(richMessageLayout, charSequence, i, alignment, 1.0f);
        }

        public Text(RichMessageLayout richMessageLayout, CharSequence charSequence, int i, Layout.Alignment alignment, float f) {
            boolean z;
            int iDp;
            int iDp2;
            this.spoilers = new ArrayList();
            this.spoilersPool = new Stack<>();
            this.spoilersPatchedTextLayout = new AtomicReference<>();
            this.root = richMessageLayout;
            Paint.FontMetricsInt fontMetricsInt = richMessageLayout.textPaint.getFontMetricsInt();
            if (charSequence instanceof Spanned) {
                for (StyleSpan styleSpan : (StyleSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), StyleSpan.class)) {
                    int i2 = styleSpan.flags & 15;
                    if (i2 >= 1 && i2 <= 6) {
                        TextPaint textPaint = new TextPaint(richMessageLayout.textPaint);
                        styleSpan.applyStyle(textPaint);
                        fontMetricsInt = textPaint.getFontMetricsInt();
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, fontMetricsInt, false, z ? 0.85f : 1.0f);
            if (charSequenceReplaceEmoji instanceof Spanned) {
                StyleSpan[] styleSpanArr = (StyleSpan[]) ((Spanned) charSequenceReplaceEmoji).getSpans(0, charSequenceReplaceEmoji.length(), StyleSpan.class);
                int length = styleSpanArr.length;
                for (int i3 = 0; i3 < length && (styleSpanArr[i3].flags & 15) == 0; i3++) {
                }
            }
            this.layout = MessageObject.makeStaticLayout(charSequenceReplaceEmoji, richMessageLayout.textPaint, i, f, 0.0f, false, alignment);
            this.left = i;
            this.right = 0;
            for (int i4 = 0; i4 < this.layout.getLineCount(); i4++) {
                this.left = Math.min(this.left, (int) Math.floor(this.layout.getLineLeft(i4)));
                this.right = Math.max(this.right, (int) Math.ceil(this.layout.getLineRight(i4)));
            }
            this.lastLineRight = 0;
            if (this.layout.getLineCount() > 0) {
                StaticLayout staticLayout = this.layout;
                this.lastLineRight = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
            }
            LinkPath linkPath = null;
            SpoilerEffect.addSpoilers((View) null, this.layout, this.spoilersPool, this.spoilers);
            if (this.layout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) this.layout.getText();
                for (StyleSpan styleSpan2 : (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class)) {
                    if (TLObject.hasFlag(styleSpan2.flags, 8192)) {
                        int spanStart = spanned.getSpanStart(styleSpan2);
                        int spanEnd = spanned.getSpanEnd(styleSpan2);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            if (linkPath == null) {
                                linkPath = new LinkPath(true);
                                linkPath.setAllowReset(false);
                            }
                            linkPath.setCurrentLayout(this.layout, spanStart, 0.0f);
                            if (TLObject.hasFlag(styleSpan2.flags, 4096)) {
                                iDp = -AndroidUtilities.dp(6.0f);
                            } else {
                                iDp = TLObject.hasFlag(styleSpan2.flags, 2048) ? AndroidUtilities.dp(2.0f) : 0;
                            }
                            if (iDp != 0) {
                                iDp2 = iDp + AndroidUtilities.dp(iDp > 0 ? 5.0f : -2.0f);
                            } else {
                                iDp2 = 0;
                            }
                            linkPath.setBaselineShift(iDp2);
                            this.layout.getSelectionPath(spanStart, spanEnd, linkPath);
                        }
                    }
                }
                if (linkPath != null) {
                    linkPath.setAllowReset(true);
                    this.markPath = linkPath;
                }
            }
        }

        private RichButtonSpan[] getButtonSpans() {
            if (!(this.layout.getText() instanceof Spanned)) {
                return null;
            }
            Spanned spanned = (Spanned) this.layout.getText();
            return (RichButtonSpan[]) spanned.getSpans(0, spanned.length(), RichButtonSpan.class);
        }

        public void setDrawAtOrigin(boolean z) {
            this.drawAtOrigin = z;
        }

        public int drawLeft() {
            if (this.drawAtOrigin) {
                return 0;
            }
            return this.left;
        }

        public void draw(Canvas canvas) {
            draw(canvas, this.view);
        }

        @Override
        public void draw(Canvas canvas, View view) {
            canvas.save();
            canvas.translate(-drawLeft(), 0.0f);
            RichMessageLayout richMessageLayout = this.root;
            int themedColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_messageTextOut : Theme.key_chat_messageTextIn);
            this.root.textPaint.setColor(themedColor);
            RichMessageLayout richMessageLayout2 = this.root;
            richMessageLayout2.textPaint.linkColor = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? Theme.key_chat_messageLinkOut : Theme.key_chat_messageLinkIn);
            if (this.markPath != null) {
                if (markPaint == null) {
                    Paint paint = new Paint(1);
                    markPaint = paint;
                    paint.setPathEffect(LinkPath.getRoundedEffect());
                }
                markPaint.setColor((this.root.quoteLine.getColor() & 16777215) | 855638016);
                canvas.drawPath(this.markPath, markPaint);
            }
            if (view == null) {
                view = this.view;
            }
            View view2 = view;
            LinkSpanDrawable.LinkCollector linkCollector = this.linkCollector;
            if (linkCollector != null && linkCollector.draw(canvas) && view2 != null) {
                view2.invalidate();
            }
            SpoilerEffect.renderWithRipple(view2, false, themedColor, 0, this.spoilersPatchedTextLayout, 0, this.layout, this.spoilers, canvas, false);
            SquigglyLinesSpan.drawOnText(canvas, this.layout);
            if (!this.root.isOverlayActive()) {
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.layout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
            }
            drawTranslationLoading(canvas);
            canvas.restore();
        }

        private void drawTranslationLoading(Canvas canvas) {
            RichMessageLayout richMessageLayout = this.root;
            float f = richMessageLayout.translationLoadingValue;
            if (f <= 0.0f) {
                return;
            }
            boolean zIsTranslating = richMessageLayout.isTranslating();
            if (this.translationLoadingDrawable == null) {
                LoadingDrawable loadingDrawable = new LoadingDrawable();
                this.translationLoadingDrawable = loadingDrawable;
                loadingDrawable.setAppearByGradient(true);
                LinkPath linkPath = new LinkPath(true);
                this.translationLoadingPath = linkPath;
                linkPath.setUseCornerPathImplementation(true);
                this.translationLoadingDrawable.usePath(this.translationLoadingPath);
                this.translationLoadingDrawable.setRadiiDp(5.0f);
                this.translationLoadingDrawable.reset();
                this.translationLoadingPath.reset();
                this.translationLoadingPath.setCurrentLayout(this.layout, 0, 0.0f);
                this.translationLoadingPath.setAllowReset(false);
                StaticLayout staticLayout = this.layout;
                staticLayout.getSelectionPath(0, staticLayout.getText().length(), this.translationLoadingPath);
                this.translationLoadingPath.setAllowReset(true);
                this.translationLoadingPath.closeRects();
                this.translationLoadingDrawable.updateBounds();
            }
            if (zIsTranslating && (this.translationLoadingDrawable.isDisappearing() || this.translationLoadingDrawable.isDisappeared())) {
                this.translationLoadingDrawable.reset();
                this.translationLoadingDrawable.resetDisappear();
            } else if (!zIsTranslating && !this.translationLoadingDrawable.isDisappearing() && !this.translationLoadingDrawable.isDisappeared()) {
                this.translationLoadingDrawable.disappear();
            }
            RichMessageLayout richMessageLayout2 = this.root;
            int themedColor = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? Theme.key_chat_messageLinkOut : Theme.key_chat_messageLinkIn);
            this.translationLoadingDrawable.setColors(Theme.multAlpha(themedColor, 0.05f), Theme.multAlpha(themedColor, 0.15f), Theme.multAlpha(themedColor, 0.1f), Theme.multAlpha(themedColor, 0.3f));
            this.translationLoadingDrawable.setAlpha((int) (f * 255.0f));
            this.translationLoadingDrawable.draw(canvas);
        }

        public void drawFade(Canvas canvas, int i, float f) {
            canvas.save();
            canvas.translate(-drawLeft(), 0.0f);
            RichMessageLayout richMessageLayout = this.root;
            final int themedColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_messageTextOut : Theme.key_chat_messageTextIn);
            this.root.textPaint.setColor(themedColor);
            RichMessageLayout richMessageLayout2 = this.root;
            richMessageLayout2.textPaint.linkColor = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? Theme.key_chat_messageLinkOut : Theme.key_chat_messageLinkIn);
            final View view = this.view;
            MultiLayoutTypingAnimator.drawLayoutWithLastLineFade(canvas, this.layout, i, f, new MultiLayoutTypingAnimator.Renderer() {
                @Override
                public final void draw(Canvas canvas2) {
                    this.f$0.lambda$drawFade$0(view, themedColor, canvas2);
                }
            });
            canvas.restore();
        }

        public void lambda$drawFade$0(View view, int i, Canvas canvas) {
            SpoilerEffect.renderWithRipple(view, false, i, 0, this.spoilersPatchedTextLayout, 0, this.layout, this.spoilers, canvas, false);
            SquigglyLinesSpan.drawOnText(canvas, this.layout);
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.layout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
        }

        public boolean onTouchEvent(android.view.MotionEvent r17) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.Text.onTouchEvent(android.view.MotionEvent):boolean");
        }

        private void scheduleLongPress() {
            cancelLongPress();
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$scheduleLongPress$1();
                }
            };
            this.longPressRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, ViewConfiguration.getLongPressTimeout());
        }

        public void lambda$scheduleLongPress$1() {
            this.longPressRunnable = null;
            if (this.pressedButtonSpan != null) {
                this.longPressFired = true;
                View view = this.view;
                if (view != null) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                this.pressedButtonSpan.didPress(this.root.getCell(), this.root.getDelegate(), true);
                return;
            }
            if (this.pressedLink == null) {
                return;
            }
            this.longPressFired = true;
            View view2 = this.view;
            if (view2 != null) {
                try {
                    view2.performHapticFeedback(0);
                } catch (Exception unused2) {
                }
            }
            dispatchLinkClick(this.pressedLink, true);
            LinkSpanDrawable.LinkCollector linkCollector = this.linkCollector;
            if (linkCollector != null) {
                linkCollector.clear();
            }
            this.pressedLinkDrawable = null;
        }

        private void cancelLongPress() {
            Runnable runnable = this.longPressRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.longPressRunnable = null;
            }
        }

        private void dispatchLinkClick(CharacterStyle characterStyle, boolean z) {
            CharacterStyle uRLSpanMono;
            View view;
            String url;
            if (characterStyle == null) {
                return;
            }
            if (!z && (characterStyle instanceof URLSpan) && (url = ((URLSpan) characterStyle).getURL()) != null && url.startsWith("#") && this.root.handleAnchorClick(url)) {
                View view2 = this.view;
                if (view2 != null) {
                    view2.playSoundEffect(0);
                    return;
                }
                return;
            }
            if ((characterStyle instanceof StyleSpan) && TLObject.hasFlag(((StyleSpan) characterStyle).flags, 256)) {
                uRLSpanMono = new URLSpanMono(this.layout.getText(), this.pressedLinkStart, this.pressedLinkEnd, this.root.isOut() ? (byte) 1 : (byte) 0);
            } else {
                uRLSpanMono = characterStyle;
            }
            ChatMessageCell.ChatMessageCellDelegate delegate = this.root.getDelegate();
            ChatMessageCell cell = this.root.getCell();
            if (delegate != null && cell != null) {
                View view3 = this.view;
                if (view3 != null && !z) {
                    view3.playSoundEffect(0);
                }
                delegate.didPressUrl(cell, uRLSpanMono, z);
                return;
            }
            if (z || (view = this.view) == null || !(characterStyle instanceof ClickableSpan)) {
                return;
            }
            view.playSoundEffect(0);
            ((ClickableSpan) characterStyle).onClick(this.view);
        }

        private void revealSpoilers(int i, int i2) {
            if (this.pressedSpoiler == null) {
                return;
            }
            float width = this.layout.getWidth();
            float height = this.layout.getHeight();
            float fSqrt = (float) Math.sqrt((width * width) + (height * height));
            final View view = this.view;
            final RichMessageLayout richMessageLayout = this.root;
            this.pressedSpoiler.setOnRippleEndCallback(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$revealSpoilers$3(view, richMessageLayout);
                }
            });
            Iterator<SpoilerEffect> it = this.spoilers.iterator();
            while (it.hasNext()) {
                it.next().startRipple(i, i2, fSqrt);
            }
            if (view != null) {
                view.playSoundEffect(0);
            }
        }

        public void lambda$revealSpoilers$3(final View view, final RichMessageLayout richMessageLayout) {
            if (view == null) {
                return;
            }
            view.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$revealSpoilers$2(richMessageLayout, view);
                }
            });
        }

        public void lambda$revealSpoilers$2(RichMessageLayout richMessageLayout, View view) {
            if (richMessageLayout != null) {
                MessageObject messageObject = richMessageLayout.messageObject;
                if (messageObject != null) {
                    messageObject.isSpoilersRevealed = true;
                }
                Iterator<TextSelectionHelper.TextLayoutBlock> it = richMessageLayout.textBlocks.iterator();
                while (it.hasNext()) {
                    TextSelectionHelper.TextLayoutBlock next = it.next();
                    if (next instanceof Text) {
                        ((Text) next).spoilers.clear();
                    }
                }
            } else {
                this.spoilers.clear();
            }
            view.invalidate();
        }

        public int getHeight() {
            return this.layout.getHeight();
        }

        public int getMinWidth() {
            return Math.max(0, this.right - this.left);
        }

        public int getLastLineWidth() {
            return Math.max(0, this.lastLineRight - this.left);
        }

        public void onAttachedToWindow() {
            this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this.view, this.root.invalidateAnimatedEmojiInParent && !this.doNotInvalidateEmojiInParent, this.animatedEmojiStack, this.layout);
            LinkSpanDrawable.LinkCollector linkCollector = this.linkCollector;
            if (linkCollector != null) {
                linkCollector.setParent(this.view);
            }
            RichButtonSpan[] buttonSpans = getButtonSpans();
            if (buttonSpans != null) {
                for (RichButtonSpan richButtonSpan : buttonSpans) {
                    richButtonSpan.attach(this.view);
                }
            }
        }

        public void onDetachedFromWindow() {
            AnimatedEmojiSpan.release(this.view, this.animatedEmojiStack);
            this.animatedEmojiStack = null;
            LinkSpanDrawable.LinkCollector linkCollector = this.linkCollector;
            if (linkCollector != null) {
                linkCollector.setParent(null);
            }
            RichButtonSpan[] buttonSpans = getButtonSpans();
            if (buttonSpans != null) {
                for (RichButtonSpan richButtonSpan : buttonSpans) {
                    richButtonSpan.detach(this.view);
                }
            }
        }

        public void refreshAnimatedEmoji(int i) {
            View view = this.view;
            if (view == null) {
                return;
            }
            AnimatedEmojiSpan.release(view, this.animatedEmojiStack);
            this.animatedEmojiStack = null;
            this.animatedEmojiStack = AnimatedEmojiSpan.update(i, this.view, this.root.invalidateAnimatedEmojiInParent && !this.doNotInvalidateEmojiInParent, (AnimatedEmojiSpan.EmojiGroupedSpans) null, this.layout);
        }

        public void setBlockX(int i) {
            this.blockX = i;
        }

        public void setBlockY(int i) {
            this.blockY = i;
        }

        @Override
        public void setX(int i) {
            this.x = i;
        }

        @Override
        public void setY(int i) {
            this.y = i;
        }

        @Override
        public void setRow(int i) {
            this.row = i;
        }

        public Text offset(int i, int i2) {
            this.x += i;
            this.y += i2;
            return this;
        }

        @Override
        public Layout getLayout() {
            return this.layout;
        }

        @Override
        public int getX() {
            return this.blockX + this.x;
        }

        @Override
        public int getY() {
            return this.blockY + this.y;
        }

        @Override
        public int getRow() {
            return this.row;
        }

        @Override
        public void attach(View view) {
            View view2 = this.view;
            if (view == view2) {
                return;
            }
            if (view2 != null) {
                detach(view2);
            }
            this.view = view;
            onAttachedToWindow();
        }

        @Override
        public void detach(View view) {
            View view2 = this.view;
            if (view2 == view && view2 != null) {
                this.view = null;
                onDetachedFromWindow();
            }
        }

        public boolean isAttached() {
            return this.view != null;
        }
    }

    public static class RichTextBlock extends RichBlock {
        private final boolean centered;
        private int contentPaddingBottom;
        private int contentPaddingTop;
        public int quoteAuthorStart;
        public final Text text;
        public final Text[] texts;

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.text, this.texts);
        }

        public RichTextBlock(RichMessageLayout richMessageLayout, Rect rect, int i, CharSequence charSequence) {
            this(richMessageLayout, rect, i, charSequence, Layout.Alignment.ALIGN_NORMAL);
        }

        public RichTextBlock(RichMessageLayout richMessageLayout, Rect rect, int i, CharSequence charSequence, Layout.Alignment alignment) {
            super(richMessageLayout, rect, i);
            this.quoteAuthorStart = -1;
            this.centered = alignment == Layout.Alignment.ALIGN_CENTER;
            Text text = new Text(richMessageLayout, charSequence, this.maxWidth, alignment);
            this.text = text;
            this.texts = new Text[]{text};
        }

        public void setContentPadding(int i, int i2) {
            this.contentPaddingTop = i;
            this.contentPaddingBottom = i2;
            updateListMarkerY();
        }

        @Override
        protected int getContentPaddingTop() {
            return this.contentPaddingTop;
        }

        @Override
        public boolean forcesTimeToNewLine() {
            return this.centered;
        }

        private int rtlOffset() {
            int minWidth;
            int minWidth2;
            if (this.centered) {
                int minWidth3 = this.root.getMinWidth();
                RichMessageLayout richMessageLayout = this.root;
                minWidth = (((minWidth3 + richMessageLayout.padRight) - richMessageLayout.padLeft) - this.text.getMinWidth()) / 2;
                minWidth2 = this.padding.left;
            } else {
                if (!this.root.isRtl()) {
                    return 0;
                }
                int minWidth4 = (this.root.getMinWidth() + this.root.padRight) - AndroidUtilities.dp(14.0f);
                Rect rect = this.padding;
                minWidth = (minWidth4 - rect.right) - rect.left;
                minWidth2 = this.text.getMinWidth();
            }
            return minWidth - minWidth2;
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(0.0f, this.contentPaddingTop);
            int iRtlOffset = rtlOffset();
            if (iRtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + iRtlOffset) - text.left);
                canvas.save();
                canvas.translate(iRtlOffset, 0.0f);
                this.text.draw(canvas);
                canvas.restore();
            } else {
                this.text.draw(canvas);
            }
            canvas.restore();
        }

        @Override
        protected void onDrawFaded(Canvas canvas, int i, float f) {
            canvas.save();
            canvas.translate(0.0f, this.contentPaddingTop);
            int iRtlOffset = rtlOffset();
            if (iRtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + iRtlOffset) - text.left);
                canvas.save();
                canvas.translate(iRtlOffset, 0.0f);
                this.text.drawFade(canvas, i, f);
                canvas.restore();
            } else {
                this.text.drawFade(canvas, i, f);
            }
            canvas.restore();
        }

        @Override
        public Layout getLayout() {
            return this.text.layout;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int iRtlOffset = rtlOffset();
            motionEvent.offsetLocation(-iRtlOffset, -this.contentPaddingTop);
            boolean zOnTouchEvent = this.text.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(iRtlOffset, this.contentPaddingTop);
            return zOnTouchEvent;
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i, FoundLink foundLink) {
            if (!this.text.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.x = (this.padding.left + rtlOffset()) - this.text.left;
            foundLink.y = i + this.padding.top + this.contentPaddingTop;
            return true;
        }

        @Override
        public int getHeight() {
            return this.padding.top + this.contentPaddingTop + this.text.getHeight() + this.contentPaddingBottom + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            return this.padding.left + this.text.getMinWidth() + this.padding.right;
        }

        @Override
        public int getLastLineWidth() {
            return this.padding.left + this.text.getLastLineWidth() + this.padding.right;
        }

        @Override
        protected TextSelectionHelper.TextLayoutBlock[] getText() {
            return this.texts;
        }

        @Override
        protected void placeTexts(int i, int i2, int i3) {
            super.placeTexts(i, i2 + this.contentPaddingTop, i3);
            int iRtlOffset = rtlOffset();
            if (iRtlOffset != 0) {
                Text text = this.text;
                text.setX((i + iRtlOffset) - text.left);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            this.text.attach(this.view);
        }

        @Override
        protected void onDetachedFromWindow() {
            this.text.detach(this.view);
        }
    }

    public static class RichTextWithAuthorBlock extends RichBlock {
        public final Text author;
        private final boolean centered;
        public final Text text;
        private final Text[] texts;

        public RichTextWithAuthorBlock(RichMessageLayout richMessageLayout, Rect rect, int i, CharSequence charSequence, CharSequence charSequence2, Layout.Alignment alignment) {
            super(richMessageLayout, rect, i);
            this.centered = alignment == Layout.Alignment.ALIGN_CENTER;
            Text text = new Text(richMessageLayout, charSequence, this.maxWidth, alignment);
            this.text = text;
            Text text2 = !TextUtils.isEmpty(charSequence2) ? new Text(richMessageLayout, charSequence2, this.maxWidth, alignment) : null;
            this.author = text2;
            this.texts = text2 == null ? new Text[]{text} : new Text[]{text, text2};
        }

        private int gap() {
            if (this.author != null) {
                return AndroidUtilities.dp(2.0f);
            }
            return 0;
        }

        private int offset(Text text) {
            int minWidth;
            int minWidth2;
            if (this.centered) {
                int minWidth3 = this.root.getMinWidth();
                RichMessageLayout richMessageLayout = this.root;
                minWidth = (((minWidth3 + richMessageLayout.padRight) - richMessageLayout.padLeft) - text.getMinWidth()) / 2;
                minWidth2 = this.padding.left;
            } else {
                if (!this.root.isRtl()) {
                    return 0;
                }
                int minWidth4 = (this.root.getMinWidth() + this.root.padRight) - AndroidUtilities.dp(14.0f);
                Rect rect = this.padding;
                minWidth = (minWidth4 - rect.right) - rect.left;
                minWidth2 = text.getMinWidth();
            }
            return minWidth - minWidth2;
        }

        public int getTextWidth() {
            int minWidth = this.text.getMinWidth();
            Text text = this.author;
            return Math.max(minWidth, text != null ? text.getMinWidth() : 0);
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, null, this.texts);
        }

        @Override
        public int getHeight() {
            int height = this.padding.top + this.text.getHeight() + gap();
            Text text = this.author;
            return height + (text != null ? text.getHeight() : 0) + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            return this.padding.left + getTextWidth() + this.padding.right;
        }

        @Override
        public int getLastLineWidth() {
            Text text = this.author;
            if (text == null) {
                text = this.text;
            }
            return this.padding.left + text.getLastLineWidth() + this.padding.right;
        }

        @Override
        public boolean forcesTimeToNewLine() {
            return this.centered;
        }

        @Override
        public Layout getLayout() {
            return this.text.layout;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(offset(this.text), 0.0f);
            this.text.draw(canvas);
            canvas.restore();
            if (this.author != null) {
                canvas.save();
                canvas.translate(offset(this.author), this.text.getHeight() + gap());
                this.author.draw(canvas);
                canvas.restore();
            }
        }

        @Override
        protected boolean onTouchEvent(MotionEvent motionEvent) {
            Text text;
            int iOffset;
            int height = this.text.getHeight();
            float y = motionEvent.getY();
            int iGap = 0;
            if (y >= 0.0f && y < height) {
                text = this.text;
                iOffset = offset(text);
            } else {
                if (this.author == null || y < gap() + height) {
                    return false;
                }
                Text text2 = this.author;
                int iOffset2 = offset(text2);
                iGap = gap() + height;
                text = text2;
                iOffset = iOffset2;
            }
            motionEvent.offsetLocation(-iOffset, -iGap);
            boolean zOnTouchEvent = text.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(iOffset, iGap);
            return zOnTouchEvent;
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i, FoundLink foundLink) {
            if (this.text.fillFoundLink(characterStyle, foundLink)) {
                foundLink.x = (this.padding.left + offset(this.text)) - this.text.left;
                foundLink.y = i + this.padding.top;
                return true;
            }
            Text text = this.author;
            if (text == null || !text.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.x = (this.padding.left + offset(this.author)) - this.author.left;
            foundLink.y = i + this.padding.top + this.text.getHeight() + gap();
            return true;
        }

        @Override
        protected TextSelectionHelper.TextLayoutBlock[] getText() {
            return this.texts;
        }

        @Override
        protected void placeTexts(int i, int i2, int i3) {
            Text text = this.text;
            text.setX((offset(text) + i) - this.text.left);
            this.text.setY(i2);
            this.text.setRow(i3);
            Text text2 = this.author;
            if (text2 != null) {
                text2.setX((i + offset(text2)) - this.author.left);
                this.author.setY(i2 + this.text.getHeight() + gap());
                this.author.setRow(i3);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            this.text.attach(this.view);
            Text text = this.author;
            if (text != null) {
                text.attach(this.view);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            this.text.detach(this.view);
            Text text = this.author;
            if (text != null) {
                text.detach(this.view);
            }
        }
    }

    public static class RichPullquoteBlock extends RichTextWithAuthorBlock {
        public RichPullquoteBlock(RichMessageLayout richMessageLayout, Rect rect, int i, CharSequence charSequence, CharSequence charSequence2) {
            super(richMessageLayout, rect, i, charSequence, charSequence2, Layout.Alignment.ALIGN_CENTER);
        }
    }

    public static class RichQuoteBlock extends RichTextWithAuthorBlock {
        public RichQuoteBlock(RichMessageLayout richMessageLayout, Rect rect, int i, CharSequence charSequence, CharSequence charSequence2) {
            super(richMessageLayout, rect, i, charSequence, charSequence2, Layout.Alignment.ALIGN_NORMAL);
        }
    }

    public static class RichTextBlockQuote extends RichTextBlock {
        public final TL_iv.pageBlockBlockquote block;
        private ButtonBounce bounce;
        private boolean capturedByParent;
        private GradientClip clip;
        public int collapsedHeightToDraw;
        public float collapsedProgress;
        private boolean currentCollapsed;
        private boolean pressed;
        private boolean prevCollapsed;
        public final Drawable quoteArrow;
        private int quoteArrowColor;

        public RichTextBlockQuote(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockBlockquote pageblockblockquote, CharSequence charSequence) {
            super(richMessageLayout, rect, i, charSequence);
            this.block = pageblockblockquote;
            this.quoteArrow = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.arrow_more).mutate();
            boolean z = pageblockblockquote.collapsed;
            this.currentCollapsed = z;
            this.prevCollapsed = z;
        }

        @Override
        public int getHeight() {
            return this.currentCollapsed ? getCollapsedHeight() : super.getHeight();
        }

        public int getCollapsedHeight() {
            return (int) Math.min(this.text.layout.getPaint().getTextSize() * 1.4f * 3.0f, super.getHeight());
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.capturedByParent) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.capturedByParent = false;
                }
                return super.onTouchEvent(motionEvent);
            }
            if (actionMasked == 0) {
                boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                this.capturedByParent = zOnTouchEvent;
                if (zOnTouchEvent) {
                    return true;
                }
                this.pressed = true;
                ensureBounce();
                ButtonBounce buttonBounce = this.bounce;
                if (buttonBounce != null) {
                    buttonBounce.setPressed(true);
                }
                return true;
            }
            if (actionMasked == 1) {
                if (!this.pressed) {
                    return false;
                }
                this.pressed = false;
                ButtonBounce buttonBounce2 = this.bounce;
                if (buttonBounce2 != null) {
                    buttonBounce2.setPressed(false);
                }
                View view = this.root.view;
                if (view != null) {
                    view.playSoundEffect(0);
                }
                toggle();
                return true;
            }
            if (actionMasked == 3) {
                this.pressed = false;
                ButtonBounce buttonBounce3 = this.bounce;
                if (buttonBounce3 != null) {
                    buttonBounce3.setPressed(false);
                }
            }
            return this.pressed;
        }

        private void ensureBounce() {
            View view;
            if (this.bounce != null || (view = this.root.view) == null) {
                return;
            }
            this.bounce = new ButtonBounce(view);
        }

        @Override
        public void onDraw(Canvas canvas) {
            ButtonBounce buttonBounce = this.bounce;
            float scale = buttonBounce != null ? buttonBounce.getScale(0.01f) : 1.0f;
            if (scale != 1.0f) {
                canvas.save();
                canvas.scale(scale, scale, this.maxWidth / 2.0f, getHeight() / 2.0f);
            }
            boolean z = this.collapsedProgress > 0.0f;
            int i = this.collapsedHeightToDraw - this.padding.bottom;
            canvas.save();
            canvas.clipRect(0, 0, this.maxWidth, i);
            if (z) {
                canvas.saveLayer(0.0f, 0.0f, this.maxWidth, i, null);
            }
            super.onDraw(canvas);
            if (z) {
                if (this.clip == null) {
                    this.clip = new GradientClip();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, i - AndroidUtilities.dp(24.0f), this.maxWidth, i + 1);
                this.clip.draw(canvas, rectF, 3, this.collapsedProgress);
                canvas.restore();
            }
            canvas.restore();
            if (this.root.quoteLine.getColor() != this.quoteArrowColor) {
                Drawable drawable = this.quoteArrow;
                int color = this.root.quoteLine.getColor();
                this.quoteArrowColor = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            DrawableUtils.setBounds(this.quoteArrow, this.root.getMinWidth() - AndroidUtilities.dp(24.0f), ((i - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 17);
            canvas.save();
            canvas.rotate(AndroidUtilities.lerp(180, 0, this.collapsedProgress), this.quoteArrow.getBounds().exactCenterX(), this.quoteArrow.getBounds().exactCenterY());
            this.quoteArrow.draw(canvas);
            canvas.restore();
            if (scale != 1.0f) {
                canvas.restore();
            }
        }

        private void toggle() {
            this.root.snapshotForBlockquoteAnimation();
            this.currentCollapsed = !this.currentCollapsed;
            RichMessageLayout richMessageLayout = this.root;
            richMessageLayout.blockquoteAnimating = true;
            richMessageLayout.reposition();
            View view = this.root.view;
            if (view != null) {
                view.invalidate();
            }
            ChatMessageCell cell = this.root.getCell();
            ChatMessageCell.ChatMessageCellDelegate delegate = this.root.getDelegate();
            if (cell == null || delegate == null) {
                return;
            }
            delegate.forceUpdate(cell, true, true);
        }

        @Override
        public void snapshot() {
            super.snapshot();
            this.prevCollapsed = this.currentCollapsed;
        }

        @Override
        public float getBackgroundScale() {
            ButtonBounce buttonBounce = this.bounce;
            if (buttonBounce != null) {
                return buttonBounce.getScale(0.01f);
            }
            return 1.0f;
        }
    }

    public static class RichCaptionBlock extends RichBlock {
        public final Text caption;
        public final Text credit;
        public final boolean rtl;
        private final TextSelectionHelper.TextLayoutBlock[] texts;

        @Override
        public boolean forcesTimeToNewLine() {
            return false;
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            StaticLayout staticLayout;
            RichBlock.appendText(spannableStringBuilder, this.caption, null);
            Text text = this.credit;
            if (text == null || (staticLayout = text.layout) == null || TextUtils.isEmpty(staticLayout.getText())) {
                return;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(this.credit.layout.getText());
        }

        public RichCaptionBlock(RichMessageLayout richMessageLayout, Rect rect, int i, CharSequence charSequence, CharSequence charSequence2) {
            super(richMessageLayout, rect, i);
            Text text = !TextUtils.isEmpty(charSequence) ? new Text(richMessageLayout, charSequence, this.maxWidth) : null;
            this.caption = text;
            Text text2 = TextUtils.isEmpty(charSequence2) ? null : new Text(richMessageLayout, charSequence2, this.maxWidth);
            this.credit = text2;
            this.rtl = richMessageLayout.isRtl();
            ArrayList arrayList = new ArrayList(2);
            if (text != null) {
                arrayList.add(text);
            }
            if (text2 != null) {
                arrayList.add(text2);
            }
            this.texts = (TextSelectionHelper.TextLayoutBlock[]) arrayList.toArray(new TextSelectionHelper.TextLayoutBlock[0]);
        }

        private int captionHeight() {
            Text text = this.caption;
            if (text != null) {
                return text.getHeight();
            }
            return 0;
        }

        private int creditHeight() {
            Text text = this.credit;
            if (text != null) {
                return text.getHeight();
            }
            return 0;
        }

        private int gap() {
            if (this.caption == null || this.credit == null) {
                return 0;
            }
            return AndroidUtilities.dp(4.0f);
        }

        private int creditDrawX() {
            if (this.credit == null || !this.rtl) {
                return 0;
            }
            int minWidth = this.root.getMinWidth();
            Rect rect = this.padding;
            return Math.max(0, ((minWidth - rect.left) - rect.right) - this.credit.getMinWidth());
        }

        @Override
        public int getHeight() {
            return this.padding.top + captionHeight() + gap() + creditHeight() + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            Text text = this.caption;
            int iMax = text != null ? Math.max(0, text.getMinWidth()) : 0;
            Text text2 = this.credit;
            if (text2 != null) {
                iMax = Math.max(iMax, text2.getMinWidth());
            }
            Rect rect = this.padding;
            return rect.left + iMax + rect.right;
        }

        @Override
        public int getLastLineWidth() {
            int lastLineWidth;
            int i;
            Text text = this.credit;
            if (text != null) {
                lastLineWidth = this.padding.left + text.getLastLineWidth();
                i = this.padding.right;
            } else {
                Text text2 = this.caption;
                if (text2 != null) {
                    lastLineWidth = this.padding.left + text2.getLastLineWidth();
                    i = this.padding.right;
                } else {
                    Rect rect = this.padding;
                    lastLineWidth = rect.left;
                    i = rect.right;
                }
            }
            return lastLineWidth + i;
        }

        @Override
        public void onDraw(Canvas canvas) {
            Text text = this.caption;
            if (text != null) {
                text.draw(canvas);
            }
            if (this.credit != null) {
                canvas.save();
                canvas.translate(creditDrawX(), captionHeight() + gap());
                this.credit.draw(canvas);
                canvas.restore();
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int iCaptionHeight = captionHeight();
            int iGap = gap();
            float y = motionEvent.getY();
            int i = this.padding.top;
            float f = y - i;
            if (this.caption != null && f >= 0.0f && f < iCaptionHeight) {
                motionEvent.offsetLocation(0.0f, -i);
                boolean zOnTouchEvent = this.caption.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(0.0f, this.padding.top);
                return zOnTouchEvent;
            }
            if (this.credit == null || f < iCaptionHeight + iGap) {
                return false;
            }
            int i2 = i + iCaptionHeight + iGap;
            int iCreditDrawX = creditDrawX();
            motionEvent.offsetLocation(-iCreditDrawX, -i2);
            boolean zOnTouchEvent2 = this.credit.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(iCreditDrawX, i2);
            return zOnTouchEvent2;
        }

        @Override
        protected TextSelectionHelper.TextLayoutBlock[] getText() {
            return this.texts;
        }

        @Override
        protected void placeTexts(int i, int i2, int i3) {
            this.layoutX = i;
            this.layoutY = i2;
            this.layoutRow = i3;
            Text text = this.caption;
            if (text != null) {
                text.setX(i - text.left);
                this.caption.setY(i2);
                this.caption.setRow(i3);
            }
            Text text2 = this.credit;
            if (text2 != null) {
                text2.setX((i + creditDrawX()) - this.credit.left);
                this.credit.setY(i2 + captionHeight() + gap());
                this.credit.setRow(i3);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            Text text = this.caption;
            if (text != null) {
                text.attach(this.view);
            }
            Text text2 = this.credit;
            if (text2 != null) {
                text2.attach(this.view);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            Text text = this.caption;
            if (text != null) {
                text.detach(this.view);
            }
            Text text2 = this.credit;
            if (text2 != null) {
                text2.detach(this.view);
            }
        }
    }

    public static class RichDetailsBlock extends RichBlock {
        private static final float ARROW_HEIGHT_DP = 6.16f;
        private static final float ARROW_LEFT_DP = 22.6f;
        private static final float ARROW_STROKE_DP = 1.66f;
        private static final float ARROW_TOP_DP = 21.66f;
        private static final float ARROW_WIDTH_DP = 12.66f;
        private static final float TEXT_BOTTOM_DP = 12.66f;
        private static final float TEXT_LEFT_DP = 53.0f;
        private static final float TEXT_RIGHT_DP = 16.0f;
        private static final float TEXT_TOP_DP = 14.0f;
        public float animClipBottom;
        public float animClipTop;
        public final AnimatedArrowDrawable arrow;
        public final TL_iv.pageBlockDetails block;
        private ButtonBounce bounce;
        private final Paint linePaint;
        private boolean pressed;
        public final Text[] texts;
        public final Text title;

        @Override
        protected int getBlockAccessibilityElementCount() {
            return 1;
        }

        @Override
        protected boolean isBlockAccessibilityElementText(int i) {
            return true;
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.title, this.texts);
        }

        @Override
        protected CharSequence getBlockAccessibilityElementText(int i) {
            StaticLayout staticLayout;
            Text text = this.title;
            CharSequence charSequenceWithReplacements = (text == null || (staticLayout = text.layout) == null) ? null : RichBlock.withReplacements(staticLayout.getText());
            return TextUtils.concat(LocaleController.getString(R.string.ArticleToggleBlock), ", ", LocaleController.getString(isOpen() ? R.string.AccDescrExpanded : R.string.AccDescrCollapsed), TextUtils.isEmpty(charSequenceWithReplacements) ? "" : TextUtils.concat(", ", charSequenceWithReplacements));
        }

        @Override
        protected CharSequence getBlockAccessibilityElementStateDescription(int i) {
            return LocaleController.getString(isOpen() ? R.string.AccDescrExpanded : R.string.AccDescrCollapsed);
        }

        @Override
        protected void getBlockAccessibilityElementBounds(int i, Rect rect) {
            int i2 = (int) this.currY;
            Rect rect2 = this.padding;
            int i3 = i2 + rect2.top;
            int i4 = rect2.left;
            RichMessageLayout richMessageLayout = this.root;
            rect.set(i4 - richMessageLayout.padLeft, i3, (richMessageLayout.getMinWidth() + this.root.padRight) - this.padding.right, getContentHeight() + i3);
        }

        @Override
        protected boolean onBlockAccessibilityElementClick(int i, View view) {
            toggle();
            return true;
        }

        public RichDetailsBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockDetails pageblockdetails, CharSequence charSequence) {
            int i2;
            super(richMessageLayout, rect, i);
            this.linePaint = new Paint(1);
            this.block = pageblockdetails;
            Text text = new Text(richMessageLayout, charSequence, Math.max(0, (this.maxWidth - AndroidUtilities.dp(53.0f)) - AndroidUtilities.dp(16.0f)));
            this.title = text;
            this.texts = new Text[]{text};
            if (richMessageLayout.isOut()) {
                i2 = Theme.key_chat_outArticleDetailsArrow;
            } else {
                i2 = Theme.key_chat_inArticleDetailsArrow;
            }
            AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(richMessageLayout.getThemedColor(i2), 12.66f, 6.16f, 1.66f);
            this.arrow = animatedArrowDrawable;
            animatedArrowDrawable.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
        }

        public boolean isOpen() {
            return this.block.open;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            int i2;
            ButtonBounce buttonBounce = this.bounce;
            float scale = buttonBounce != null ? buttonBounce.getScale(0.02f) : 1.0f;
            RichMessageLayout richMessageLayout = this.root;
            float f = -richMessageLayout.padLeft;
            int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            float f2 = (minWidth - rect.left) - rect.right;
            if (scale != 1.0f) {
                canvas.save();
                canvas.scale(scale, scale, (f + f2) / 2.0f, getContentHeight() / 2.0f);
            }
            RichMessageLayout richMessageLayout2 = this.root;
            if (richMessageLayout2.isOut()) {
                i = Theme.key_chat_outArticleDetailsArrow;
            } else {
                i = Theme.key_chat_inArticleDetailsArrow;
            }
            this.arrow.setColor(richMessageLayout2.getThemedColor(i));
            canvas.save();
            canvas.translate(AndroidUtilities.dpf2(22.6f) + f, AndroidUtilities.dpf2(21.66f));
            this.arrow.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.dp(53.0f) + f, AndroidUtilities.dp(14.0f));
            this.title.draw(canvas);
            canvas.restore();
            if (scale != 1.0f) {
                canvas.restore();
            }
            if (isOpen()) {
                return;
            }
            RichMessageLayout richMessageLayout3 = this.root;
            if (richMessageLayout3.detailsAnimating) {
                return;
            }
            Paint paint = this.linePaint;
            if (richMessageLayout3.isOut()) {
                i2 = Theme.key_chat_outArticleDetailsLine;
            } else {
                i2 = Theme.key_chat_inArticleDetailsLine;
            }
            paint.setColor(richMessageLayout3.getThemedColor(i2));
            canvas.drawRect(f, getContentHeight() - 1.0f, f2, getContentHeight(), this.linePaint);
        }

        private int getContentHeight() {
            return Math.max(AndroidUtilities.dp(27.82f), AndroidUtilities.dp(14.0f) + this.title.getHeight() + AndroidUtilities.dp(12.66f));
        }

        @Override
        public int getHeight() {
            return this.padding.top + getContentHeight() + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            return this.padding.left + AndroidUtilities.dp(53.0f) + this.title.getMinWidth() + AndroidUtilities.dp(16.0f) + this.padding.right;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        protected TextSelectionHelper.TextLayoutBlock[] getText() {
            return this.texts;
        }

        @Override
        protected void placeTexts(int i, int i2, int i3) {
            this.layoutX = i;
            this.layoutY = i2;
            this.layoutRow = i3;
            this.title.setX(((i - this.root.padLeft) + AndroidUtilities.dp(53.0f)) - this.title.left);
            this.title.setY(i2 + AndroidUtilities.dp(14.0f));
            this.title.setRow(i3);
        }

        public void updateBubbleInsets() {
            this.title.setX(((this.layoutX - this.root.padLeft) + AndroidUtilities.dp(53.0f)) - this.title.left);
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i, FoundLink foundLink) {
            if (!this.title.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.x = ((this.padding.left - this.root.padLeft) + AndroidUtilities.dp(53.0f)) - this.title.left;
            foundLink.y = i + this.padding.top + AndroidUtilities.dp(14.0f);
            return true;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.pressed = true;
                ensureBounce();
                ButtonBounce buttonBounce = this.bounce;
                if (buttonBounce != null) {
                    buttonBounce.setPressed(true);
                }
                return true;
            }
            if (actionMasked == 1) {
                if (!this.pressed) {
                    return false;
                }
                this.pressed = false;
                ButtonBounce buttonBounce2 = this.bounce;
                if (buttonBounce2 != null) {
                    buttonBounce2.setPressed(false);
                }
                View view = this.root.view;
                if (view != null) {
                    view.playSoundEffect(0);
                }
                toggle();
                return true;
            }
            if (actionMasked == 3) {
                this.pressed = false;
                ButtonBounce buttonBounce3 = this.bounce;
                if (buttonBounce3 != null) {
                    buttonBounce3.setPressed(false);
                }
            }
            return this.pressed;
        }

        private void ensureBounce() {
            View view;
            if (this.bounce != null || (view = this.root.view) == null) {
                return;
            }
            this.bounce = new ButtonBounce(view);
        }

        @Override
        protected void onAttachedToWindow() {
            this.title.attach(this.view);
        }

        @Override
        protected void onDetachedFromWindow() {
            this.title.detach(this.view);
        }

        private void toggle() {
            this.root.snapshotForDetailsAnimation();
            TL_iv.pageBlockDetails pageblockdetails = this.block;
            boolean z = pageblockdetails.open;
            pageblockdetails.open = !z;
            this.arrow.setAnimationProgressAnimated(!z ? 0.0f : 1.0f);
            RichMessageLayout richMessageLayout = this.root;
            richMessageLayout.detailsAnimating = true;
            richMessageLayout.reposition();
            View view = this.root.view;
            if (view != null) {
                view.invalidate();
            }
            ChatMessageCell cell = this.root.getCell();
            ChatMessageCell.ChatMessageCellDelegate delegate = this.root.getDelegate();
            if (cell == null || delegate == null) {
                return;
            }
            delegate.forceUpdate(cell, true, true);
        }
    }

    public static class RichDetailsEndBlock extends RichBlock {
        private final Paint paint;

        public RichDetailsEndBlock(RichMessageLayout richMessageLayout, Rect rect, int i) {
            super(richMessageLayout, rect, i);
            this.paint = new Paint(1);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            Paint paint = this.paint;
            RichMessageLayout richMessageLayout = this.root;
            if (richMessageLayout.isOut()) {
                i = Theme.key_chat_outArticleDetailsLine;
            } else {
                i = Theme.key_chat_inArticleDetailsLine;
            }
            paint.setColor(richMessageLayout.getThemedColor(i));
            RichMessageLayout richMessageLayout2 = this.root;
            float f = -richMessageLayout2.padLeft;
            int minWidth = richMessageLayout2.getMinWidth();
            RichMessageLayout richMessageLayout3 = this.root;
            int i2 = minWidth + richMessageLayout3.padRight;
            Rect rect = this.padding;
            float f2 = (i2 - rect.left) - rect.right;
            if (richMessageLayout3.detailsAnimating) {
                fLerp = AndroidUtilities.lerp(this.prevVisible ? 1.0f : 0.0f, this.currVisible ? 1.0f : 0.0f, richMessageLayout3.detailsAnimationProgress);
            } else if (this.currVisible) {
                fLerp = 1.0f;
            }
            float fLerp = AndroidUtilities.lerp((-1.0f) - (this.parentDetails != null ? r0.padding.bottom : 0), AndroidUtilities.dp(6.0f), fLerp);
            canvas.drawRect(f, fLerp, f2, fLerp + 1.0f, this.paint);
        }

        @Override
        public int getMinWidth() {
            return this.padding.left + AndroidUtilities.dp(32.0f) + this.padding.right;
        }

        @Override
        public int getHeight() {
            return this.padding.top + AndroidUtilities.dp(6.0f) + 1 + this.padding.bottom;
        }
    }

    public static class RichTableBlock extends RichBlock implements TableLayout.TableLayoutDelegate {
        private static final int VERTICAL_PADDING_DP = 10;
        private final ArrayList<CellBlock> cellBlocks;
        private float cellDx;
        private float cellDy;
        private final ArrayList<Text> cellTexts;
        private final int contentHeight;
        private final int contentMeasuredWidth;
        private int downScrollX;
        private float downX;
        private float downY;
        private boolean dragging;
        private final Runnable flingTick;
        private Paint halfLinePaint;
        private Paint headerPaint;
        private Paint linePaint;
        private int maxFlingVelocity;
        private final int maxScrollX;
        private int minFlingVelocity;
        public final TL_iv.pageBlockTable pageBlock;
        private Text pressedCellText;
        private int scrollX;
        private OverScroller scroller;
        private Paint stripPaint;
        public final TableLayout tableLayout;
        private boolean textHandlingTouch;
        private final TextSelectionHelper.TextLayoutBlock[] textsArr;
        private final Text title;
        private final int titleHeight;
        private int touchSlop;
        private VelocityTracker velocityTracker;
        private final int viewportWidth;

        @Override
        public void onLayoutChild(TableLayout.CellText cellText, int i, int i2) {
            TableLayout.TableLayoutDelegate.CC.$default$onLayoutChild(this, cellText, i, i2);
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            StaticLayout staticLayout;
            RichBlock.appendText(spannableStringBuilder, this.title, null);
            for (int i = 0; i < this.cellTexts.size(); i++) {
                Text text = this.cellTexts.get(i);
                if (text != null && (staticLayout = text.layout) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append(", ");
                    }
                    spannableStringBuilder.append(text.layout.getText());
                }
            }
        }

        private static final class CellBlock implements MultiLayoutTypingAnimator.Block {
            final TableLayout.Child child;

            @Override
            public View getParentView() {
                return null;
            }

            CellBlock(TableLayout.Child child) {
                this.child = child;
            }

            @Override
            public Layout getLayout() {
                TableLayout.CellText cellText = this.child.textLayout;
                if (cellText == null) {
                    return null;
                }
                return cellText.getLayout();
            }
        }

        private void ensurePaints() {
            if (this.linePaint == null) {
                Paint paint = new Paint(1);
                this.linePaint = paint;
                Paint.Style style = Paint.Style.STROKE;
                paint.setStyle(style);
                this.linePaint.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
                Paint paint2 = new Paint();
                this.halfLinePaint = paint2;
                paint2.setStyle(style);
                this.halfLinePaint.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
                this.headerPaint = new Paint();
                this.stripPaint = new Paint();
            }
            RichMessageLayout richMessageLayout = this.root;
            int themedColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_outTableBorder : Theme.key_chat_inTableBorder);
            this.linePaint.setColor(themedColor);
            this.halfLinePaint.setColor(themedColor);
            Paint paint3 = this.headerPaint;
            RichMessageLayout richMessageLayout2 = this.root;
            paint3.setColor(richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? Theme.key_chat_outTableBackground : Theme.key_chat_inTableBackground));
            this.stripPaint.setColor(167772160);
        }

        public RichTableBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockTable pageblocktable) {
            int i2;
            super(richMessageLayout, rect, i);
            this.cellTexts = new ArrayList<>();
            this.cellBlocks = new ArrayList<>();
            this.flingTick = new Runnable() {
                @Override
                public void run() {
                    if (RichTableBlock.this.scroller != null) {
                        RichTableBlock richTableBlock = RichTableBlock.this;
                        if (richTableBlock.view != null && richTableBlock.scroller.computeScrollOffset()) {
                            int currX = RichTableBlock.this.scroller.getCurrX();
                            if (currX < 0) {
                                currX = 0;
                            }
                            if (currX > RichTableBlock.this.maxScrollX) {
                                currX = RichTableBlock.this.maxScrollX;
                            }
                            if (currX != RichTableBlock.this.scrollX) {
                                RichTableBlock.this.scrollX = currX;
                                RichTableBlock richTableBlock2 = RichTableBlock.this;
                                richTableBlock2.placeTexts(richTableBlock2.layoutX, richTableBlock2.layoutY, richTableBlock2.layoutRow);
                                RichTableBlock.this.view.invalidate();
                            }
                            if (RichTableBlock.this.scroller.isFinished()) {
                                return;
                            }
                            RichTableBlock.this.view.postOnAnimation(this);
                        }
                    }
                }
            };
            this.padding.top += AndroidUtilities.dp(10.0f);
            this.pageBlock = pageblocktable;
            this.viewportWidth = this.maxWidth;
            TableLayout tableLayout = new TableLayout(ApplicationLoader.applicationContext, this, null);
            this.tableLayout = tableLayout;
            tableLayout.setOrientation(0);
            tableLayout.setRowOrderPreserved(true);
            tableLayout.setDrawLines(pageblocktable.bordered);
            tableLayout.setStriped(pageblocktable.striped);
            tableLayout.setRtl(richMessageLayout.isRtl());
            tableLayout.setMinimumCellHeight(AndroidUtilities.dp(36.0f));
            if (pageblocktable.rows.isEmpty()) {
                i2 = 0;
            } else {
                TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(0);
                i2 = 0;
                for (int i3 = 0; i3 < pagetablerow.cells.size(); i3++) {
                    int i4 = pagetablerow.cells.get(i3).colspan;
                    if (i4 == 0) {
                        i4 = 1;
                    }
                    i2 += i4;
                }
            }
            for (int i5 = 0; i5 < pageblocktable.rows.size(); i5++) {
                TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i5);
                int i6 = 0;
                for (int i7 = 0; i7 < pagetablerow2.cells.size(); i7++) {
                    TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i7);
                    int i8 = pagetablecell.colspan;
                    i8 = i8 == 0 ? 1 : i8;
                    int i9 = pagetablecell.rowspan;
                    i9 = i9 == 0 ? 1 : i9;
                    if (pagetablecell.text != null) {
                        this.tableLayout.addChild(pagetablecell, i6, i5, i8);
                    } else {
                        this.tableLayout.addChild(i6, i5, i8, i9);
                    }
                    i6 += i8;
                }
            }
            this.tableLayout.setColumnCount(i2);
            this.tableLayout.measure(View.MeasureSpec.makeMeasureSpec(this.maxWidth, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = this.tableLayout.getMeasuredWidth();
            this.contentMeasuredWidth = measuredWidth;
            this.contentHeight = this.tableLayout.getMeasuredHeight();
            this.maxScrollX = Math.max(0, measuredWidth - this.viewportWidth);
            TL_iv.RichText richText = pageblocktable.title;
            if (richText != null && !(richText instanceof TL_iv.textEmpty) && !TextUtils.isEmpty(RichMessageLayout.getString(richText))) {
                Text text = new Text(richMessageLayout, richMessageLayout.formatText(pageblocktable.title, RichMessageLayout.setBlockFlags(0, 15)), Math.max(0, Math.min(this.viewportWidth, measuredWidth)));
                this.title = text;
                text.setDrawAtOrigin(true);
                this.titleHeight = text.getHeight() + AndroidUtilities.dp(9.0f);
            } else {
                this.title = null;
                this.titleHeight = 0;
            }
            for (int i10 = 0; i10 < this.tableLayout.getChildCount(); i10++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i10);
                TableLayout.CellText cellText = childAt.textLayout;
                if (cellText instanceof Text) {
                    this.cellTexts.add((Text) cellText);
                    this.cellBlocks.add(new CellBlock(childAt));
                }
            }
            ArrayList arrayList = new ArrayList();
            Text text2 = this.title;
            if (text2 != null) {
                arrayList.add(text2);
            }
            arrayList.addAll(this.cellTexts);
            this.textsArr = (TextSelectionHelper.TextLayoutBlock[]) arrayList.toArray(new TextSelectionHelper.TextLayoutBlock[0]);
        }

        @Override
        public void collectAnimatorBlocks(List<MultiLayoutTypingAnimator.Block> list) {
            if (this.cellBlocks.isEmpty()) {
                super.collectAnimatorBlocks(list);
            } else {
                list.addAll(this.cellBlocks);
            }
        }

        @Override
        public void drawWithTyping(Canvas canvas) {
            MultiLayoutTypingAnimator multiLayoutTypingAnimator = this.typingAnimator;
            if (multiLayoutTypingAnimator == null || !multiLayoutTypingAnimator.isRunning() || this.cellBlocks.isEmpty() || multiLayoutTypingAnimator.indexOf(this.cellBlocks.get(0)) < 0) {
                draw(canvas);
                return;
            }
            float blockAlpha = multiLayoutTypingAnimator.getBlockAlpha(this.cellBlocks.get(0));
            if (blockAlpha <= 0.0f) {
                return;
            }
            canvas.save();
            Rect rect = this.padding;
            canvas.translate(rect.left, rect.top);
            drawTitle(canvas);
            canvas.translate(0.0f, this.titleHeight);
            drawCellsWithTyping(canvas, multiLayoutTypingAnimator, blockAlpha);
            canvas.restore();
        }

        private void drawCellsWithTyping(Canvas canvas, MultiLayoutTypingAnimator multiLayoutTypingAnimator, float f) {
            CellBlock cellBlock;
            float f2 = 255.0f;
            int iSaveLayerAlpha = canvas.saveLayerAlpha(-this.root.padLeft, 0.0f, Math.min(this.viewportWidth, this.contentMeasuredWidth) + this.root.padRight, this.contentHeight, (int) (f * 255.0f), 31);
            canvas.save();
            canvas.translate(-this.scrollX, 0.0f);
            int childCount = this.tableLayout.getChildCount();
            int i = 0;
            int i2 = 0;
            while (i2 < childCount) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i2);
                if (i >= this.cellBlocks.size() || this.cellBlocks.get(i).child != childAt) {
                    cellBlock = null;
                } else {
                    cellBlock = this.cellBlocks.get(i);
                    i++;
                }
                int i3 = i;
                if (cellBlock == null) {
                    childAt.draw(canvas, this.view);
                } else if (!multiLayoutTypingAnimator.needDraw(cellBlock)) {
                    childAt.draw(canvas, this.view, false);
                } else if (multiLayoutTypingAnimator.isFadeBlock(cellBlock)) {
                    childAt.draw(canvas, this.view, false);
                    if (childAt.textLayout instanceof Text) {
                        canvas.save();
                        canvas.translate(childAt.getTextX(), childAt.getTextY());
                        ((Text) childAt.textLayout).drawFade(canvas, multiLayoutTypingAnimator.getFadeLineIndex(cellBlock), multiLayoutTypingAnimator.getFadeXPosition(cellBlock));
                        canvas.restore();
                    }
                } else {
                    float blockAlpha = multiLayoutTypingAnimator.getBlockAlpha(cellBlock);
                    if (blockAlpha >= 1.0f) {
                        childAt.draw(canvas, this.view);
                    } else if (blockAlpha > 0.0f && childAt.textLayout != null) {
                        childAt.draw(canvas, this.view, false);
                        canvas.save();
                        canvas.translate(childAt.getTextX(), childAt.getTextY());
                        int iSaveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) (blockAlpha * f2), 31);
                        childAt.textLayout.draw(canvas, this.view);
                        canvas.restoreToCount(iSaveLayerAlpha2);
                        canvas.restore();
                    } else {
                        childAt.draw(canvas, this.view, false);
                    }
                }
                i2++;
                i = i3;
                f2 = 255.0f;
            }
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(-this.root.padLeft, 0.0f, r3 + AndroidUtilities.dp(12.0f), this.contentHeight);
            this.root.clip.draw(canvas, rectF, 0, 1.0f);
            int minWidth = this.root.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            rectF.set(r3 - AndroidUtilities.dp(12.0f), 0.0f, (minWidth - rect.left) - rect.right, this.contentHeight);
            this.root.clip.draw(canvas, rectF, 2, 1.0f);
            canvas.restoreToCount(iSaveLayerAlpha);
        }

        @Override
        public Text createTextLayout(TL_iv.pageTableCell pagetablecell, int i) {
            Layout.Alignment alignment;
            if (pagetablecell == null) {
                return null;
            }
            CharSequence text = this.root.formatText(pagetablecell.text, RichMessageLayout.setBlockFlags(0, 14));
            if (pagetablecell.align_right) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (pagetablecell.align_center) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Text text2 = new Text(this.root, text, i, alignment);
            text2.setDrawAtOrigin(true);
            return text2;
        }

        @Override
        public Paint getLinePaint() {
            ensurePaints();
            return this.linePaint;
        }

        public Paint getHalfLinePaint() {
            ensurePaints();
            return this.halfLinePaint;
        }

        @Override
        public Paint getHeaderPaint() {
            ensurePaints();
            return this.headerPaint;
        }

        @Override
        public Paint getStripPaint() {
            ensurePaints();
            return this.stripPaint;
        }

        @Override
        public void onDraw(Canvas canvas) {
            drawTitle(canvas);
            canvas.save();
            canvas.translate(0.0f, this.titleHeight);
            canvas.saveLayerAlpha(-this.root.padLeft, 0.0f, Math.min(this.viewportWidth, this.contentMeasuredWidth) + this.root.padRight, this.contentHeight, 255, 31);
            canvas.save();
            canvas.translate(-this.scrollX, 0.0f);
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.tableLayout.getChildAt(i).draw(canvas, this.view);
            }
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(-this.root.padLeft, 0.0f, r3 + AndroidUtilities.dp(12.0f), this.contentHeight);
            this.root.clip.draw(canvas, rectF, 0, 1.0f);
            int minWidth = this.root.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            rectF.set(r2 - AndroidUtilities.dp(12.0f), 0.0f, (minWidth - rect.left) - rect.right, this.contentHeight);
            this.root.clip.draw(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
        }

        private void drawTitle(Canvas canvas) {
            if (this.title == null) {
                return;
            }
            canvas.save();
            canvas.translate(titleDrawX(), 0.0f);
            this.title.draw(canvas);
            canvas.restore();
        }

        @Override
        public int getHeight() {
            return this.padding.top + this.titleHeight + this.contentHeight + AndroidUtilities.dp(10.0f) + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            return this.padding.left + Math.min(this.viewportWidth, this.contentMeasuredWidth) + this.padding.right;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        private void ensureTouchConfig() {
            View view;
            if (this.touchSlop == 0 && (view = this.view) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.touchSlop = viewConfiguration.getScaledTouchSlop();
                this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.scroller != null || this.view == null) {
                return;
            }
            this.scroller = new OverScroller(this.view.getContext());
        }

        private TableLayout.Child findCellChildAt(float f, float f2) {
            float f3 = f + this.scrollX;
            float f4 = f2 - this.titleHeight;
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i);
                if (childAt.textLayout instanceof Text) {
                    if (f3 >= childAt.x && f3 < r3 + childAt.getMeasuredWidth()) {
                        if (f4 >= childAt.y && f4 < r3 + childAt.getMeasuredHeight()) {
                            return childAt;
                        }
                    }
                }
            }
            return null;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            VelocityTracker velocityTracker;
            TableLayout.Child childFindCellChildAt;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ensureTouchConfig();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.forceFinished(true);
                }
                this.downX = motionEvent.getX();
                this.downY = motionEvent.getY();
                this.downScrollX = this.scrollX;
                this.dragging = false;
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.velocityTracker.addMovement(motionEvent);
                this.pressedCellText = null;
                this.textHandlingTouch = false;
                if (this.title != null && motionEvent.getY() < this.titleHeight) {
                    float fTitleDrawX = titleDrawX();
                    motionEvent.offsetLocation(-fTitleDrawX, 0.0f);
                    boolean zOnTouchEvent = this.title.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(fTitleDrawX, 0.0f);
                    if (zOnTouchEvent) {
                        this.pressedCellText = this.title;
                        this.cellDx = fTitleDrawX;
                        this.cellDy = 0.0f;
                        this.textHandlingTouch = true;
                    }
                }
                if (!this.textHandlingTouch && (childFindCellChildAt = findCellChildAt(motionEvent.getX(), motionEvent.getY())) != null) {
                    this.pressedCellText = (Text) childFindCellChildAt.textLayout;
                    this.cellDx = childFindCellChildAt.getTextX() - this.scrollX;
                    float textY = this.titleHeight + childFindCellChildAt.getTextY();
                    this.cellDy = textY;
                    motionEvent.offsetLocation(-this.cellDx, -textY);
                    this.textHandlingTouch = this.pressedCellText.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(this.cellDx, this.cellDy);
                }
                return this.textHandlingTouch || this.maxScrollX > 0;
            }
            if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x = motionEvent.getX() - this.downX;
                if (!this.dragging && this.maxScrollX > 0 && Math.abs(x) > this.touchSlop) {
                    this.dragging = true;
                    requestDisallowParentIntercept(true);
                    if (this.textHandlingTouch && this.pressedCellText != null) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                        motionEventObtain.offsetLocation(-this.cellDx, -this.cellDy);
                        this.pressedCellText.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                        this.textHandlingTouch = false;
                    }
                }
                if (this.dragging) {
                    int i = (int) (this.downScrollX - x);
                    int i2 = i >= 0 ? i : 0;
                    int i3 = this.maxScrollX;
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    if (i2 != this.scrollX) {
                        this.scrollX = i2;
                        placeTexts(this.layoutX, this.layoutY, this.layoutRow);
                        View view = this.view;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                    return true;
                }
                return this.textHandlingTouch;
            }
            if (actionMasked != 1 && actionMasked != 3) {
                return false;
            }
            boolean z = this.dragging;
            this.dragging = false;
            if (z) {
                requestDisallowParentIntercept(false);
                if (actionMasked == 1 && (velocityTracker = this.velocityTracker) != null && this.scroller != null && this.view != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.velocityTracker.computeCurrentVelocity(1000, this.maxFlingVelocity);
                    float f = -this.velocityTracker.getXVelocity();
                    if (Math.abs(f) > this.minFlingVelocity) {
                        this.scroller.fling(this.scrollX, 0, (int) f, 0, 0, this.maxScrollX, 0, 0);
                        this.view.postOnAnimation(this.flingTick);
                    }
                }
            }
            if (!z && this.textHandlingTouch && this.pressedCellText != null) {
                motionEvent.offsetLocation(-this.cellDx, -this.cellDy);
                this.pressedCellText.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(this.cellDx, this.cellDy);
            }
            boolean z2 = this.textHandlingTouch;
            this.textHandlingTouch = false;
            this.pressedCellText = null;
            VelocityTracker velocityTracker4 = this.velocityTracker;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.velocityTracker = null;
            }
            return z || z2;
        }

        @Override
        public boolean isHorizontallyDragging() {
            OverScroller overScroller;
            return this.dragging || !((overScroller = this.scroller) == null || overScroller.isFinished());
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i, FoundLink foundLink) {
            Text text = this.title;
            if (text != null && text.fillFoundLink(characterStyle, foundLink)) {
                foundLink.x = (this.padding.left + titleDrawX()) - this.title.drawLeft();
                foundLink.y = i + this.padding.top;
                return true;
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                TableLayout.CellText cellText = this.tableLayout.getChildAt(i2).textLayout;
                if (cellText instanceof Text) {
                    if (((Text) cellText).fillFoundLink(characterStyle, foundLink)) {
                        foundLink.x = ((this.padding.left + r4.getTextX()) - this.scrollX) - r5.drawLeft();
                        foundLink.y = i + this.padding.top + this.titleHeight + r4.getTextY();
                        return true;
                    }
                }
            }
            return false;
        }

        private int titleDrawX() {
            if (this.title == null) {
                return 0;
            }
            int iMax = Math.max(0, Math.min(this.viewportWidth, this.contentMeasuredWidth));
            Text text = this.title;
            int i = text.right;
            return Math.round(((iMax - (i - r1)) / 2.0f) - text.left);
        }

        @Override
        protected TextSelectionHelper.TextLayoutBlock[] getText() {
            return this.textsArr;
        }

        @Override
        protected void placeTexts(int i, int i2, int i3) {
            this.layoutX = i;
            this.layoutY = i2;
            this.layoutRow = i3;
            Text text = this.title;
            if (text != null) {
                text.setX((titleDrawX() + i) - this.title.drawLeft());
                this.title.setY(i2);
                this.title.setRow(i3);
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i4);
                TableLayout.CellText cellText = childAt.textLayout;
                if (cellText instanceof Text) {
                    Text text2 = (Text) cellText;
                    text2.setX(((childAt.getTextX() + i) - this.scrollX) - text2.drawLeft());
                    text2.setY(this.titleHeight + i2 + childAt.getTextY());
                    text2.setRow(i3);
                }
            }
        }

        @Override
        public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
            boolean z;
            Text text;
            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans;
            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2;
            canvas.save();
            Rect rect = this.padding;
            canvas.translate(rect.left, rect.top);
            Text text2 = this.title;
            if (text2 == null || (emojiGroupedSpans2 = text2.animatedEmojiStack) == null || emojiGroupedSpans2.holders.isEmpty()) {
                z = false;
            } else {
                canvas.save();
                canvas.translate(titleDrawX(), 0.0f);
                Text text3 = this.title;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, text3.layout, text3.animatedEmojiStack, 0.0f, text3.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z = true;
            }
            canvas.translate(0.0f, this.titleHeight);
            canvas.translate(-this.scrollX, 0.0f);
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TableLayout.CellText cellText = this.tableLayout.getChildAt(i).textLayout;
                if ((cellText instanceof Text) && (emojiGroupedSpans = (text = (Text) cellText).animatedEmojiStack) != null && !emojiGroupedSpans.holders.isEmpty()) {
                    canvas.save();
                    canvas.translate(r2.getTextX(), r2.getTextY());
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, text.layout, text.animatedEmojiStack, 0.0f, text.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                    canvas.restore();
                    z = true;
                }
            }
            canvas.restore();
            return z;
        }

        @Override
        protected void onAttachedToWindow() {
            Text text = this.title;
            if (text != null) {
                text.attach(this.view);
            }
            Iterator<Text> it = this.cellTexts.iterator();
            while (it.hasNext()) {
                it.next().attach(this.view);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            Text text = this.title;
            if (text != null) {
                text.detach(this.view);
            }
            Iterator<Text> it = this.cellTexts.iterator();
            while (it.hasNext()) {
                it.next().detach(this.view);
            }
        }
    }

    public static class RichDividerBlock extends RichBlock {
        public final Paint paint;

        public RichDividerBlock(RichMessageLayout richMessageLayout, Rect rect, int i) {
            super(richMessageLayout, rect, i);
            this.paint = new Paint(1);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int minWidth = this.root.getMinWidth();
            RichMessageLayout richMessageLayout = this.root;
            int i = richMessageLayout.padLeft;
            int i2 = minWidth + i + richMessageLayout.padRight;
            Rect rect = this.padding;
            int i3 = rect.left;
            int i4 = ((i2 - i3) - rect.right) / 2;
            float f = (((r0 - i4) / 2.0f) - i) + i3;
            float fDp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
            Paint paint = this.paint;
            RichMessageLayout richMessageLayout2 = this.root;
            paint.setColor(richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? Theme.key_chat_outDivider : Theme.key_chat_inDivider));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f, fDp, i4 + f, AndroidUtilities.dp(1.0f) + fDp);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.paint);
        }

        @Override
        public int getMinWidth() {
            return AndroidUtilities.dp(32.0f);
        }

        @Override
        public int getHeight() {
            return this.padding.top + AndroidUtilities.dp(12.0f) + this.padding.bottom;
        }
    }

    public static class RichUnsupportedBlock extends RichBlock implements Drawable.Callback {
        public final int index;
        public Bitmap tornBitmap;
        public TornEdge.Params tornParams;
        public final UnsupportedBlockDrawable unsupportedBlockDrawable;
        public final int unsupportedBlockHeight;
        public final int unsupportedBlockWidth;

        @Override
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        @Override
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        public RichUnsupportedBlock(final RichMessageLayout richMessageLayout, Rect rect, int i, int i2) {
            super(richMessageLayout, rect, i);
            this.index = i2;
            UnsupportedBlockDrawable unsupportedBlockDrawable = new UnsupportedBlockDrawable(richMessageLayout.resourcesProvider);
            this.unsupportedBlockDrawable = unsupportedBlockDrawable;
            unsupportedBlockDrawable.setCallback(this);
            unsupportedBlockDrawable.setTitle(LocaleController.getString(R.string.UnsupportedBlockTitle));
            unsupportedBlockDrawable.setSubtitle(LocaleController.getString(R.string.UnsupportedBlockMessage));
            unsupportedBlockDrawable.setButtonText(LocaleController.getString(R.string.UnsupportedUpdate));
            unsupportedBlockDrawable.setOnClickListener(new Runnable() {
                @Override
                public final void run() {
                    RichMessageLayout.RichUnsupportedBlock.lambda$new$0(richMessageLayout);
                }
            });
            int i3 = this.maxWidth;
            this.unsupportedBlockWidth = i3;
            this.unsupportedBlockHeight = unsupportedBlockDrawable.measure(i3);
        }

        public static void lambda$new$0(RichMessageLayout richMessageLayout) {
            if (richMessageLayout.delegate != null) {
                richMessageLayout.delegate.didPressAppUpdateButton();
            }
        }

        public float getY(ChatMessageCell.TransitionParams transitionParams) {
            if (transitionParams != null) {
                RichMessageLayout richMessageLayout = this.root;
                if (richMessageLayout.detailsAnimating || richMessageLayout.blockquoteAnimating) {
                    return AndroidUtilities.lerp(this.prevY, this.currY, Math.max(0.0f, Math.min(1.0f, transitionParams.animateChangeProgress)));
                }
            }
            return this.currY;
        }

        public float getHeight(org.telegram.ui.Cells.ChatMessageCell.TransitionParams r3) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichUnsupportedBlock.getHeight(org.telegram.ui.Cells.ChatMessageCell$TransitionParams):float");
        }

        @Override
        public int getHeight() {
            Rect rect = this.padding;
            return rect.top + this.unsupportedBlockHeight + rect.bottom;
        }

        @Override
        public void draw(Canvas canvas) {
            UnsupportedBlockDrawable unsupportedBlockDrawable = this.unsupportedBlockDrawable;
            Rect rect = this.padding;
            int i = rect.left;
            int i2 = rect.top;
            unsupportedBlockDrawable.setBounds(i, i2, this.unsupportedBlockWidth + i, this.unsupportedBlockHeight + i2);
            this.unsupportedBlockDrawable.draw(canvas);
        }

        @Override
        public void invalidateDrawable(Drawable drawable) {
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override
        protected boolean onTouchEvent(MotionEvent motionEvent) {
            View view = this.view;
            if (view != null) {
                return this.unsupportedBlockDrawable.onTouchEvent(view, motionEvent);
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public static class RichButtonRowBlock extends RichBlock {
        private static final int GAP = 7;
        private final Align align;
        private final RichButton[] buttons;
        private final ClickHelper clickHelper;
        private RichButton pressedButton;
        private RichButton touchButton;

        private enum Align {
            LEFT,
            RIGHT,
            CENTER,
            FILL
        }

        public RichButtonRowBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
            super(richMessageLayout, rect, i);
            this.clickHelper = new ClickHelper(new ClickHelper.Delegate() {
                @Override
                public boolean forceEnableVibration() {
                    return ClickHelper.Delegate.CC.$default$forceEnableVibration(this);
                }

                @Override
                public long getLongPressDuration() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichButtonRowBlock.AnonymousClass1.getLongPressDuration():long");
                }

                @Override
                public boolean ignoreHapticFeedbackSettings(float f, float f2) {
                    return ClickHelper.Delegate.CC.$default$ignoreHapticFeedbackSettings(this, f, f2);
                }

                @Override
                public boolean needCancelTouchBySlopMove() {
                    return ClickHelper.Delegate.CC.$default$needCancelTouchBySlopMove(this);
                }

                @Override
                public boolean needLongPress(float f, float f2) {
                    return true;
                }

                @Override
                public void onLongPressCancelled(View view, float f, float f2) {
                    ClickHelper.Delegate.CC.$default$onLongPressCancelled(this, view, f, f2);
                }

                @Override
                public void onLongPressFinish(View view, float f, float f2) {
                    ClickHelper.Delegate.CC.$default$onLongPressFinish(this, view, f, f2);
                }

                @Override
                public void onLongPressMove(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
                    ClickHelper.Delegate.CC.$default$onLongPressMove(this, view, motionEvent, f, f2, f3, f4);
                }

                @Override
                public boolean needClickAt(View view, float f, float f2) {
                    RichButton buttonAt = RichButtonRowBlock.this.getButtonAt(f, f2);
                    RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                    if (buttonAt == null || buttonAt.isDisabled) {
                        buttonAt = null;
                    }
                    richButtonRowBlock.touchButton = buttonAt;
                    return RichButtonRowBlock.this.touchButton != null;
                }

                @Override
                public void onClickTouchDown(View view, float f, float f2) {
                    RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                    richButtonRowBlock.setPressedButton(richButtonRowBlock.touchButton);
                }

                @Override
                public void onClickTouchMove(View view, float f, float f2) {
                    RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                    richButtonRowBlock.setPressedButton(richButtonRowBlock.getButtonAt(f, f2) == RichButtonRowBlock.this.touchButton ? RichButtonRowBlock.this.touchButton : null);
                }

                @Override
                public void onClickTouchUp(View view, float f, float f2) {
                    RichButtonRowBlock.this.setPressedButton(null);
                    RichButtonRowBlock.this.touchButton = null;
                }

                @Override
                public void onClickAt(View view, float f, float f2) {
                    if (RichButtonRowBlock.this.touchButton != null) {
                        RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                        richButtonRowBlock.onButtonClick(richButtonRowBlock.touchButton);
                    }
                }

                @Override
                public boolean onLongPressRequestedAt(View view, float f, float f2) {
                    if (RichButtonRowBlock.this.touchButton == null || RichButtonRowBlock.this.getButtonAt(f, f2) != RichButtonRowBlock.this.touchButton) {
                        return false;
                    }
                    RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                    richButtonRowBlock.onButtonLongClick(richButtonRowBlock.touchButton);
                    return true;
                }
            });
            this.buttons = new RichButton[pageblockbuttonrow.buttons.size()];
            int size = pageblockbuttonrow.buttons.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.buttons[i2] = new RichButton(richMessageLayout, i, pageblockbuttonrow.buttons.get(i2), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.invalidate();
                    }
                });
            }
            if (pageblockbuttonrow.align_left) {
                this.align = Align.LEFT;
            } else if (pageblockbuttonrow.align_center) {
                this.align = Align.CENTER;
            } else if (pageblockbuttonrow.align_right) {
                this.align = Align.RIGHT;
            } else {
                this.align = Align.FILL;
            }
            layout(i);
        }

        @Override
        public void draw(Canvas canvas) {
            for (RichButton richButton : this.buttons) {
                canvas.save();
                canvas.translate(richButton.x, Math.round((getHeight() - AndroidUtilities.dp(34.0f)) / 2.0f));
                richButton.draw(canvas);
                canvas.restore();
            }
        }

        private void layout(int i) {
            int i2;
            int length = this.buttons.length;
            if (length == 0) {
                return;
            }
            int iDp = AndroidUtilities.dp(7.0f);
            int i3 = (length - 1) * iDp;
            int iMax = Math.max(0, i - i3);
            int i4 = 0;
            for (RichButton richButton : this.buttons) {
                int preferredWidth = richButton.getPreferredWidth();
                richButton.width = preferredWidth;
                i4 += preferredWidth;
            }
            if (i4 > iMax) {
                squeeze(iMax, i4);
            } else if (this.align == Align.FILL) {
                stretch(iMax);
            }
            for (RichButton richButton2 : this.buttons) {
                i3 += richButton2.width;
            }
            int iOrdinal = this.align.ordinal();
            if (iOrdinal != 1) {
                i2 = iOrdinal != 2 ? 0 : (i - i3) / 2;
            } else {
                i2 = i - i3;
            }
            for (RichButton richButton3 : this.buttons) {
                richButton3.x = i2;
                i2 += richButton3.width + iDp;
            }
        }

        private void stretch(int i) {
            int i2;
            RichButton[] richButtonArr = this.buttons;
            boolean[] zArr = new boolean[richButtonArr.length];
            int length = richButtonArr.length;
            boolean z = true;
            while (true) {
                boolean z2 = false;
                if (!z || length <= 0) {
                    break;
                }
                int i3 = i / length;
                int i4 = 0;
                while (true) {
                    RichButton[] richButtonArr2 = this.buttons;
                    if (i4 < richButtonArr2.length) {
                        if (!zArr[i4] && (i2 = richButtonArr2[i4].width) > i3) {
                            zArr[i4] = true;
                            i -= i2;
                            length--;
                            z2 = true;
                        }
                        i4++;
                    }
                }
                z = z2;
            }
            if (length <= 0) {
                return;
            }
            int i5 = i / length;
            int i6 = i - (length * i5);
            int i7 = 0;
            while (true) {
                RichButton[] richButtonArr3 = this.buttons;
                if (i7 >= richButtonArr3.length) {
                    return;
                }
                if (!zArr[i7]) {
                    int i8 = i6 - 1;
                    richButtonArr3[i7].width = (i6 > 0 ? 1 : 0) + i5;
                    i6 = i8;
                }
                i7++;
            }
        }

        private void squeeze(int i, int i2) {
            int i3 = 0;
            int minWidth = 0;
            for (RichButton richButton : this.buttons) {
                minWidth += richButton.width - richButton.getMinWidth();
            }
            if (minWidth <= 0) {
                RichButton[] richButtonArr = this.buttons;
                int length = richButtonArr.length;
                while (i3 < length) {
                    RichButton richButton2 = richButtonArr[i3];
                    richButton2.width = richButton2.getMinWidth();
                    i3++;
                }
                return;
            }
            int iMin = Math.min(i2 - i, minWidth);
            int i4 = 0;
            while (true) {
                RichButton[] richButtonArr2 = this.buttons;
                if (i3 >= richButtonArr2.length) {
                    return;
                }
                RichButton richButton3 = richButtonArr2[i3];
                int minWidth2 = richButton3.width - richButton3.getMinWidth();
                int iMin2 = Math.min(i3 == this.buttons.length + (-1) ? iMin - i4 : (int) ((iMin * minWidth2) / minWidth), minWidth2);
                richButton3.width -= iMin2;
                i4 += iMin2;
                i3++;
            }
        }

        @Override
        public int getHeight() {
            return this.padding.top + AndroidUtilities.dp(38.333f) + this.padding.bottom;
        }

        public RichButton getButtonAt(float f, float f2) {
            float height = (getHeight() - AndroidUtilities.dp(34.0f)) / 2.0f;
            if (f2 >= height && f2 <= height + AndroidUtilities.dp(34.0f)) {
                for (RichButton richButton : this.buttons) {
                    if (richButton.contains(f)) {
                        return richButton;
                    }
                }
            }
            return null;
        }

        public void invalidate() {
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        public void setPressedButton(RichButton richButton) {
            RichButton richButton2 = this.pressedButton;
            if (richButton2 == richButton) {
                return;
            }
            if (richButton2 != null) {
                richButton2.setPressed(false);
            }
            this.pressedButton = richButton;
            if (richButton != null) {
                richButton.setPressed(true);
            }
        }

        public void onButtonClick(RichButton richButton) {
            if (this.root.delegate != null) {
                this.root.delegate.didPressBotButton(this.root.cell, richButton.pageButton);
            }
        }

        public void onButtonLongClick(RichButton richButton) {
            if (this.root.delegate != null) {
                this.root.delegate.didLongPressBotButton(this.root.cell, richButton.pageButton);
            }
        }

        @Override
        protected boolean onTouchEvent(MotionEvent motionEvent) {
            View view = this.view;
            if (view == null) {
                return false;
            }
            return this.clickHelper.onTouchEvent(view, motionEvent);
        }

        @Override
        public boolean isHorizontallyDragging() {
            return this.touchButton != null;
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            for (RichButton richButton : this.buttons) {
                richButton.attach(this.view);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            for (RichButton richButton : this.buttons) {
                richButton.detach(this.view);
            }
        }
    }

    public static class RichButton {
        public static final int HEIGHT = 34;
        private static final float ICON_OFFSET_X = 12.33f;
        private static final float ICON_OFFSET_Y = 11.66f;
        public static final int INLINE_PADDING_HORIZONTAL = 7;
        private static final int MIN_PADDING = 8;
        private static final int PADDING = 20;
        private static final int PADDING_WITH_ICON = 26;
        private static final float PRESS_SCALE = 0.04f;
        private static final float PRESS_SCALE_INLINE = 0.12f;
        private static final Xfermode SRC_OUT;
        private static final Paint SRC_OUT_PAINT;
        public int backgroundColor;
        public final Paint backgroundPaint;
        public int backgroundPressedColor;
        private final ForegroundColorSpanThemable colorSpan;
        private Drawable iconDrawable;
        private final boolean inline;
        public final Runnable invalidateRunnable;
        public final boolean isDisabled;
        private final RichMessageLayout layout;
        private boolean loading;
        public LoadingDrawable loadingDrawable;
        private final RectF loadingRect;
        private boolean needSaveLayer;
        private final boolean onlyEmoji;
        public final TL_keyboard.PageButton pageButton;
        public ValueAnimator pressAnimator;
        public float pressT;
        public boolean pressed;
        public final TL_keyboard.RichButtonStyle style;
        public final Text text;
        public int textColor;
        private ColorFilter textColorFilter;
        public int textColorKey;
        public final TL_keyboard.InlineButtonType type;
        public int width;
        public int x;

        static {
            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
            SRC_OUT = porterDuffXfermode;
            Paint paint = new Paint();
            SRC_OUT_PAINT = paint;
            paint.setXfermode(porterDuffXfermode);
        }

        public RichButton(RichMessageLayout richMessageLayout, int i, TL_keyboard.PageButton pageButton, Runnable runnable) {
            this(richMessageLayout, i, richMessageLayout.formatText(pageButton.text, RichMessageLayout.setBlockFlags(16, 13)), pageButton, pageButton.type, pageButton.style, TLKeyboardHelper.isType(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), true, false, false, runnable);
        }

        public RichButton(RichMessageLayout richMessageLayout, int i, CharSequence charSequence, TL_keyboard.PageButton pageButton, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle, boolean z, boolean z2, boolean z3, boolean z4, Runnable runnable) {
            this.backgroundPaint = new Paint(1);
            this.loadingRect = new RectF();
            this.layout = richMessageLayout;
            this.invalidateRunnable = runnable;
            this.pageButton = pageButton;
            this.type = inlineButtonType;
            this.style = richButtonStyle;
            this.isDisabled = z;
            this.onlyEmoji = z3;
            this.inline = z4;
            ForegroundColorSpanThemable foregroundColorSpanThemable = new ForegroundColorSpanThemable(Theme.IvButtonColors.of(richButtonStyle).getTextKey(richMessageLayout.isOut()));
            this.colorSpan = foregroundColorSpanThemable;
            foregroundColorSpanThemable.setAlpha(z ? 0.5f : 1.0f);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(foregroundColorSpanThemable, 0, spannableStringBuilder.length(), 33);
            Text text = new Text(richMessageLayout, spannableStringBuilder, i, Layout.Alignment.ALIGN_CENTER);
            this.text = text;
            text.setDrawAtOrigin(true);
            text.doNotInvalidateEmojiInParent = true;
            int buttonIcon = z2 ? getButtonIcon(inlineButtonType) : 0;
            if (buttonIcon != 0) {
                this.iconDrawable = ApplicationLoader.applicationContext.getResources().getDrawable(buttonIcon).mutate();
            }
            this.width = getPreferredWidth();
            updateColors();
        }

        public void updateColors() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichButton.updateColors():void");
        }

        public void setTextColorKey(int i) {
            this.textColorKey = i;
            int themedColor = this.layout.getThemedColor(i);
            if (this.isDisabled) {
                themedColor = Theme.multAlpha(themedColor, 0.5f);
            }
            if (themedColor != this.textColor || this.textColorFilter == null) {
                this.textColor = themedColor;
                this.textColorFilter = new PorterDuffColorFilter(this.textColor, PorterDuff.Mode.SRC_IN);
            }
            this.colorSpan.setColorKey(i);
            this.invalidateRunnable.run();
            Drawable drawable = this.iconDrawable;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.textColor, PorterDuff.Mode.MULTIPLY));
            }
        }

        public int getTextWidth() {
            Text text = this.text;
            return text.right - text.left;
        }

        public int getHeight() {
            return AndroidUtilities.dp(this.inline ? this.layout.fontSize * 1.166666f : 34.0f);
        }

        public int getPadding() {
            if (this.onlyEmoji) {
                return AndroidUtilities.dp(1.0f);
            }
            if (this.inline) {
                return AndroidUtilities.dp(7.0f);
            }
            return AndroidUtilities.dp(this.iconDrawable != null ? 26.0f : 20.0f);
        }

        public int getIconReserve() {
            if (this.iconDrawable != null) {
                return AndroidUtilities.dp(12.33f) + (AndroidUtilities.dp(11.66f) / 2);
            }
            return 0;
        }

        public float getTextX() {
            if (this.iconDrawable == null) {
                return (this.width - getTextWidth()) / 2.0f;
            }
            return Math.max(Math.min((this.width - getTextWidth()) / 2.0f, (this.width - getIconReserve()) - getTextWidth()), AndroidUtilities.dp(8.0f));
        }

        public int getPreferredWidth() {
            return getTextWidth() + (getPadding() * 2);
        }

        public int getMinWidth() {
            return Math.min(getPreferredWidth(), getHeight() + getIconReserve());
        }

        public void draw(Canvas canvas) {
            float pressScale = getPressScale();
            canvas.save();
            if (this.inline) {
                canvas.translate(0.0f, AndroidUtilities.dpf2(0.5f));
            }
            if (pressScale != 1.0f) {
                canvas.scale(pressScale, pressScale, this.width / 2.0f, getHeight() / 2.0f);
            }
            boolean z = this.needSaveLayer && !this.onlyEmoji;
            if (z) {
                canvas.saveLayer(0.0f, 0.0f, this.width, getHeight(), null);
            } else {
                this.backgroundPaint.setColor(this.pressed ? this.backgroundPressedColor : this.backgroundColor);
                if (!this.onlyEmoji) {
                    canvas.drawRoundRect(0.0f, 0.0f, this.width, getHeight(), getHeight() / 2.0f, getHeight() / 2.0f, this.backgroundPaint);
                }
                drawLoading(canvas);
            }
            canvas.save();
            canvas.clipRect(0, -AndroidUtilities.dp(10.0f), this.width - getIconReserve(), getHeight() + AndroidUtilities.dp(10.0f));
            canvas.translate(getTextX() - this.text.left, ((getHeight() - this.text.getHeight()) / 2.0f) - (this.inline ? AndroidUtilities.dpf2(0.5f) : AndroidUtilities.dp(1.0f)));
            this.text.draw(canvas);
            if (this.layout.isOverlayActive()) {
                Text text = this.text;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, text.layout, text.animatedEmojiStack, 0.0f, text.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, this.textColorFilter);
            }
            canvas.restore();
            Drawable drawable = this.iconDrawable;
            if (drawable != null) {
                DrawableUtils.setBounds(drawable, this.width - AndroidUtilities.dp(12.33f), AndroidUtilities.dp(11.66f), 17);
                this.iconDrawable.draw(canvas);
            }
            if (z) {
                Paint paint = SRC_OUT_PAINT;
                paint.setColor(this.pressed ? this.backgroundPressedColor : this.backgroundColor);
                canvas.drawRoundRect(0.0f, 0.0f, this.width, getHeight(), getHeight() / 2.0f, getHeight() / 2.0f, paint);
                canvas.restore();
                drawLoading(canvas);
            }
            canvas.restore();
        }

        private void drawLoading(Canvas canvas) {
            boolean z = (this.pageButton == null || this.layout.cell == null || !this.layout.cell.drawButtonProgress(this.pageButton)) ? false : true;
            setLoading(z);
            LoadingDrawable loadingDrawable = this.loadingDrawable;
            if (loadingDrawable != null) {
                if (z || loadingDrawable.isDisappearing()) {
                    float strokeWidth = this.loadingDrawable.strokePaint.getStrokeWidth();
                    this.loadingRect.set(0.0f, 0.0f, this.width, getHeight());
                    float f = strokeWidth / 2.0f;
                    this.loadingRect.inset(f, f);
                    this.loadingDrawable.setRadii((getHeight() / 2.0f) - f);
                    this.loadingDrawable.setBounds(this.loadingRect);
                    this.loadingDrawable.setColors(Theme.multAlpha(this.textColor, 0.07f), Theme.multAlpha(this.textColor, 0.175f), Theme.multAlpha(this.textColor, 0.175f), Theme.multAlpha(this.textColor, 0.42f));
                    this.loadingDrawable.setAlpha(255);
                    this.loadingDrawable.draw(canvas);
                    this.invalidateRunnable.run();
                }
            }
        }

        public void setLoading(boolean z) {
            if (this.loading == z) {
                return;
            }
            this.loading = z;
            if (z) {
                LoadingDrawable loadingDrawable = this.loadingDrawable;
                if (loadingDrawable == null) {
                    LoadingDrawable loadingDrawable2 = new LoadingDrawable();
                    this.loadingDrawable = loadingDrawable2;
                    loadingDrawable2.setAppearByGradient(true);
                    this.loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                } else {
                    loadingDrawable.reset();
                    this.loadingDrawable.resetDisappear();
                }
            } else {
                LoadingDrawable loadingDrawable3 = this.loadingDrawable;
                if (loadingDrawable3 != null) {
                    loadingDrawable3.disappear();
                }
            }
            this.invalidateRunnable.run();
        }

        public boolean isLoading() {
            return this.loading;
        }

        public void setPressed(boolean z) {
            if (this.pressed == z) {
                return;
            }
            this.pressed = z;
            this.invalidateRunnable.run();
            if (z) {
                ValueAnimator valueAnimator = this.pressAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.pressAnimator.cancel();
                    this.pressAnimator = null;
                    return;
                }
                return;
            }
            float f = this.pressT;
            if (f != 0.0f) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.pressAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.lambda$setPressed$0(valueAnimator2);
                    }
                });
                this.pressAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        RichButton.this.pressAnimator = null;
                    }
                });
                this.pressAnimator.setInterpolator(new OvershootInterpolator(this.inline ? 3.5f : 2.0f));
                this.pressAnimator.setDuration(this.inline ? 420L : 350L);
                this.pressAnimator.start();
            }
        }

        public void lambda$setPressed$0(ValueAnimator valueAnimator) {
            this.pressT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.invalidateRunnable.run();
        }

        public float getPressScale() {
            if (this.pressed) {
                float f = this.pressT;
                if (f != 1.0f) {
                    float fMin = f + (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f);
                    this.pressT = fMin;
                    this.pressT = Utilities.clamp(fMin, 1.0f, 0.0f);
                    this.invalidateRunnable.run();
                }
            }
            float f2 = this.inline ? 0.12f : 0.04f;
            return (1.0f - f2) + (f2 * (1.0f - this.pressT));
        }

        public boolean contains(float f) {
            int i = this.x;
            return f >= ((float) i) && f <= ((float) (i + this.width));
        }

        public void attach(View view) {
            this.text.attach(view);
        }

        public void detach(View view) {
            this.text.detach(view);
        }

        private static int getButtonIcon(TL_keyboard.InlineButtonType inlineButtonType) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                return R.drawable.mini_inline_copy_16;
            }
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                if (LinkManager.isWebAppLink(((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url)) {
                    return R.drawable.bot_webview;
                }
                return R.drawable.mini_inline_arrow_16;
            }
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeWebView) {
                return R.drawable.bot_webview;
            }
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeSwitchInline) {
                return R.drawable.mini_inline_switch_16;
            }
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeBuy) {
                return R.drawable.bot_card;
            }
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                return R.drawable.mini_inline_profile_16;
            }
            return 0;
        }
    }

    public static class RichButtonSpan extends ReplacementSpan {
        private static final int MARGIN_HORIZONTAL = 1;
        private final RectF bounds = new RectF();
        private final RichButton button;
        private final boolean onlyEmoji;
        private final TL_iv.textButton textButton;
        private View v;

        public RichButtonSpan(org.telegram.messenger.RichMessageLayout r19, int r20, org.telegram.tgnet.tl.TL_iv.textButton r21) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichButtonSpan.<init>(org.telegram.messenger.RichMessageLayout, int, org.telegram.tgnet.tl.TL_iv$textButton):void");
        }

        public void invalidate() {
            View view = this.v;
            if (view != null) {
                view.invalidate();
            }
        }

        public RichButton getButton() {
            return this.button;
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return this.button.width + (this.onlyEmoji ? 0 : AndroidUtilities.dp(1.0f) * 2);
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            float f2 = i4 + ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f);
            canvas.save();
            float fDp = f + (this.onlyEmoji ? 0 : AndroidUtilities.dp(1.0f));
            float height = f2 - (this.button.getHeight() / 2.0f);
            RectF rectF = this.bounds;
            RichButton richButton = this.button;
            rectF.set(fDp, height, richButton.width + fDp, richButton.getHeight() + height);
            canvas.translate(fDp, height);
            this.button.draw(canvas);
            canvas.restore();
        }

        public boolean isDisabled() {
            return this.button.isDisabled;
        }

        public boolean contains(float f, float f2) {
            return this.bounds.contains(f, f2);
        }

        public void setPressed(boolean z) {
            this.button.setPressed(z);
        }

        public void didPress(ChatMessageCell chatMessageCell, ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate, boolean z) {
            if (chatMessageCell == null || chatMessageCellDelegate == null) {
                return;
            }
            if (z) {
                chatMessageCellDelegate.didLongPressBotButton(chatMessageCell, this.textButton);
            } else {
                chatMessageCellDelegate.didPressBotButton(chatMessageCell, this.textButton);
            }
        }

        public void attach(View view) {
            this.v = view;
            this.button.attach(view);
        }

        public void detach(View view) {
            this.v = null;
            this.button.detach(view);
        }
    }

    public static class RichPreformattedBlock extends RichBlock {
        private static final int BACKGROUND_OUTER_VPAD = 7;
        private static final int HPAD = 0;
        private static final int SCROLLBAR_HEIGHT = 5;
        private static final int SCROLLBAR_HPAD = 6;
        private static final int SCROLLBAR_VPAD = 7;
        private static final int VPAD = 8;
        private final Paint bgPaint;
        public SpannableString content;
        private final int contentWidth;
        private int downScrollX;
        private float downX;
        private boolean dragging;
        private final Runnable flingTick;
        public final String language;
        private int maxFlingVelocity;
        private final int maxScrollX;
        private int minFlingVelocity;
        public String plain;
        private int scrollX;
        private OverScroller scroller;
        public final Text text;
        private boolean textHandlingTouch;
        public final Text[] texts;
        private int touchSlop;
        private VelocityTracker velocityTracker;
        private final int viewportWidth;

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.text, this.texts);
        }

        @Override
        public CharSequence getAccessibilityLabel() {
            CharSequence accessibilityLabel = super.getAccessibilityLabel();
            if (TextUtils.isEmpty(this.language)) {
                return accessibilityLabel;
            }
            String strCapitalizeLanguage = MessageObject.TextLayoutBlock.capitalizeLanguage(this.language);
            return TextUtils.isEmpty(strCapitalizeLanguage) ? accessibilityLabel : TextUtils.concat(accessibilityLabel, " (", strCapitalizeLanguage, ")");
        }

        public RichPreformattedBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockPreformatted pageblockpreformatted, RichPreformattedBlock richPreformattedBlock) {
            super(richMessageLayout, rect, i);
            this.bgPaint = new Paint(1);
            this.flingTick = new Runnable() {
                @Override
                public void run() {
                    if (RichPreformattedBlock.this.scroller != null) {
                        RichPreformattedBlock richPreformattedBlock2 = RichPreformattedBlock.this;
                        if (richPreformattedBlock2.view != null && richPreformattedBlock2.scroller.computeScrollOffset()) {
                            int currX = RichPreformattedBlock.this.scroller.getCurrX();
                            if (currX < 0) {
                                currX = 0;
                            }
                            if (currX > RichPreformattedBlock.this.maxScrollX) {
                                currX = RichPreformattedBlock.this.maxScrollX;
                            }
                            if (currX != RichPreformattedBlock.this.scrollX) {
                                RichPreformattedBlock.this.scrollX = currX;
                                RichPreformattedBlock richPreformattedBlock3 = RichPreformattedBlock.this;
                                richPreformattedBlock3.placeTexts(richPreformattedBlock3.layoutX, richPreformattedBlock3.layoutY, richPreformattedBlock3.layoutRow);
                                RichPreformattedBlock.this.view.invalidate();
                            }
                            if (RichPreformattedBlock.this.scroller.isFinished()) {
                                return;
                            }
                            RichPreformattedBlock.this.view.postOnAnimation(this);
                        }
                    }
                }
            };
            this.viewportWidth = this.maxWidth;
            this.language = pageblockpreformatted.language;
            String string = RichMessageLayout.getString(pageblockpreformatted.text);
            this.plain = string;
            if (string == null) {
                this.plain = "";
            }
            SpannableString spannableString = new SpannableString(this.plain);
            this.content = spannableString;
            if (spannableString.length() > 0) {
                this.content.setSpan(new StyleSpan(richMessageLayout, 8), 0, this.content.length(), 33);
                if (richPreformattedBlock != null) {
                    CharSequence charSequence = richPreformattedBlock.content;
                    if (charSequence instanceof CodeHighlighting.LockedWithFallbackSpannableString) {
                        CodeHighlighting.LockedWithFallbackSpannableString lockedWithFallbackSpannableString = (CodeHighlighting.LockedWithFallbackSpannableString) charSequence;
                        if (!lockedWithFallbackSpannableString.ready) {
                            charSequence = lockedWithFallbackSpannableString.fallback;
                        }
                    }
                    if (charSequence != null && charSequence.length() > 0 && this.plain.length() >= charSequence.length()) {
                        if (charSequence instanceof CodeHighlighting.LockedWithFallbackSpannableString) {
                            ((CodeHighlighting.LockedWithFallbackSpannableString) charSequence).fallback = null;
                        }
                        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(charSequence).append((CharSequence) this.plain.substring(charSequence.length()));
                        for (StyleSpan styleSpan : (StyleSpan[]) spannableStringBuilderAppend.getSpans(0, spannableStringBuilderAppend.length(), StyleSpan.class)) {
                            spannableStringBuilderAppend.removeSpan(styleSpan);
                        }
                        spannableStringBuilderAppend.setSpan(new StyleSpan(richMessageLayout, 8), 0, spannableStringBuilderAppend.length(), 33);
                        CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spannableStringBuilderAppend.getSpans(0, spannableStringBuilderAppend.length(), CodeHighlighting.Span.class);
                        for (int i2 = 0; i2 < spanArr.length; i2++) {
                            int spanStart = spannableStringBuilderAppend.getSpanStart(spanArr[i2]);
                            int spanStart2 = spannableStringBuilderAppend.getSpanStart(spanArr[i2]);
                            spannableStringBuilderAppend.removeSpan(spanArr[i2]);
                            spannableStringBuilderAppend.setSpan(spanArr[i2], spanStart, spanStart2, 33);
                        }
                        this.content = new CodeHighlighting.LockedWithFallbackSpannableString(this.content, spannableStringBuilderAppend);
                    }
                }
                if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                    SpannableString spannableString2 = this.content;
                    CodeHighlighting.highlight(spannableString2, 0, spannableString2.length(), pageblockpreformatted.language, 0, null, false);
                }
            }
            Text text = new Text(richMessageLayout, this.content, AndroidUtilities.dp(5000.0f), Layout.Alignment.ALIGN_NORMAL, 1.3f);
            this.text = text;
            this.texts = new Text[]{text};
            int iMax = Math.max(0, text.right - text.left) + (AndroidUtilities.dp(0.0f) * 2);
            this.contentWidth = iMax;
            int iMax2 = Math.max(0, iMax - this.viewportWidth);
            this.maxScrollX = iMax2;
            if (richPreformattedBlock != null) {
                this.scrollX = Utilities.clamp(richPreformattedBlock.scrollX, iMax2, 0);
            }
        }

        private void drawBackground(Canvas canvas) {
            int i;
            Paint paint = this.bgPaint;
            RichMessageLayout richMessageLayout = this.root;
            if (richMessageLayout.isOut()) {
                i = Theme.key_chat_outArticleCodeBackground;
            } else {
                i = Theme.key_chat_inArticleCodeBackground;
            }
            paint.setColor(richMessageLayout.getThemedColor(i));
            if (this.padding.left > 0) {
                int minWidth = this.root.getMinWidth();
                Rect rect = this.padding;
                canvas.drawRect(0.0f, 0.0f, (minWidth - rect.left) - rect.right, getBackgroundHeight(), this.bgPaint);
            } else {
                RichMessageLayout richMessageLayout2 = this.root;
                canvas.drawRect(-richMessageLayout2.padLeft, 0.0f, richMessageLayout2.getMinWidth() + this.root.padRight, getBackgroundHeight(), this.bgPaint);
            }
        }

        private int getBackgroundHeight() {
            return this.text.getHeight() + AndroidUtilities.dp(16.0f) + (this.maxScrollX > 0 ? AndroidUtilities.dp(19.0f) : 0);
        }

        private void drawScrollbar(Canvas canvas) {
            float f;
            float minWidth;
            int i;
            int i2;
            if (this.maxScrollX <= 0) {
                return;
            }
            if (this.padding.left > 0) {
                int minWidth2 = this.root.getMinWidth();
                Rect rect = this.padding;
                minWidth = (minWidth2 - rect.left) - rect.right;
                f = 0.0f;
            } else {
                RichMessageLayout richMessageLayout = this.root;
                f = -richMessageLayout.padLeft;
                minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            }
            float fDp = f + AndroidUtilities.dp(6.0f);
            float fDp2 = minWidth - AndroidUtilities.dp(6.0f);
            if (fDp2 <= fDp) {
                return;
            }
            float height = this.text.getHeight() + AndroidUtilities.dp(23.0f);
            float fDp3 = height + AndroidUtilities.dp(5.0f);
            float fDp4 = AndroidUtilities.dp(2.5f);
            Paint paint = this.bgPaint;
            RichMessageLayout richMessageLayout2 = this.root;
            if (richMessageLayout2.isOut()) {
                i = Theme.key_chat_outArticleCodeScrollbarBackground;
            } else {
                i = Theme.key_chat_inArticleCodeScrollbarBackground;
            }
            paint.setColor(richMessageLayout2.getThemedColor(i));
            canvas.drawRoundRect(fDp, height, fDp2, fDp3, fDp4, fDp4, this.bgPaint);
            float f2 = fDp2 - fDp;
            float fMin = Math.min(f2, Math.max(AndroidUtilities.dp(5.0f), (this.viewportWidth * f2) / this.contentWidth));
            float f3 = fDp + (((f2 - fMin) * this.scrollX) / this.maxScrollX);
            Paint paint2 = this.bgPaint;
            RichMessageLayout richMessageLayout3 = this.root;
            if (richMessageLayout3.isOut()) {
                i2 = Theme.key_chat_outArticleCodeScrollbar;
            } else {
                i2 = Theme.key_chat_inArticleCodeScrollbar;
            }
            paint2.setColor(richMessageLayout3.getThemedColor(i2));
            canvas.drawRoundRect(f3, height, f3 + fMin, fDp3, fDp4, fDp4, this.bgPaint);
        }

        private void drawTextContent(Canvas canvas, boolean z, int i, float f) {
            int iMin = Math.min(this.viewportWidth, this.contentWidth);
            int height = this.text.getHeight() + (AndroidUtilities.dp(8.0f) * 2);
            if (this.padding.left > 0) {
                canvas.save();
                canvas.clipRect(0, 0, iMin, height);
                canvas.translate(AndroidUtilities.dp(0.0f) - this.scrollX, AndroidUtilities.dp(8.0f));
                if (z) {
                    this.text.drawFade(canvas, i, f);
                } else {
                    this.text.draw(canvas);
                }
                canvas.restore();
                return;
            }
            RichMessageLayout richMessageLayout = this.root;
            float f2 = height;
            canvas.saveLayerAlpha(-richMessageLayout.padLeft, 0.0f, iMin + richMessageLayout.padRight, f2, 255, 31);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(0.0f) - this.scrollX, AndroidUtilities.dp(8.0f));
            if (z) {
                this.text.drawFade(canvas, i, f);
            } else {
                this.text.draw(canvas);
            }
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(-this.root.padLeft, 0.0f, r2 + AndroidUtilities.dp(12.0f), f2);
            this.root.clip.draw(canvas, rectF, 0, 1.0f);
            int minWidth = this.root.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            rectF.set(r2 - AndroidUtilities.dp(12.0f), 0.0f, (minWidth - rect.left) - rect.right, f2);
            this.root.clip.draw(canvas, rectF, 2, 1.0f);
            canvas.restore();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(0.0f, AndroidUtilities.dp(7.0f));
            drawBackground(canvas);
            drawTextContent(canvas, false, 0, 0.0f);
            drawScrollbar(canvas);
            canvas.restore();
        }

        @Override
        protected void onDrawFaded(Canvas canvas, int i, float f) {
            StaticLayout staticLayout = this.text.layout;
            if (staticLayout == null || i < 0 || i >= staticLayout.getLineCount()) {
                onDraw(canvas);
                return;
            }
            canvas.save();
            canvas.translate(0.0f, AndroidUtilities.dp(7.0f));
            drawBackground(canvas);
            drawTextContent(canvas, true, i, f);
            drawScrollbar(canvas);
            canvas.restore();
        }

        @Override
        public Layout getLayout() {
            return this.text.layout;
        }

        @Override
        public int getHeight() {
            return this.padding.top + (AndroidUtilities.dp(7.0f) * 2) + getBackgroundHeight() + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            return this.padding.left + Math.min(this.viewportWidth, this.contentWidth) + this.padding.right;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        private void ensureTouchConfig() {
            View view;
            if (this.touchSlop == 0 && (view = this.view) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.touchSlop = viewConfiguration.getScaledTouchSlop();
                this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.scroller != null || this.view == null) {
                return;
            }
            this.scroller = new OverScroller(this.view.getContext());
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            VelocityTracker velocityTracker;
            int actionMasked = motionEvent.getActionMasked();
            float fDp = AndroidUtilities.dp(0.0f) - this.scrollX;
            float fDp2 = AndroidUtilities.dp(15.0f);
            if (actionMasked == 0) {
                ensureTouchConfig();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.forceFinished(true);
                }
                this.downX = motionEvent.getX();
                this.downScrollX = this.scrollX;
                this.dragging = false;
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.velocityTracker.addMovement(motionEvent);
                motionEvent.offsetLocation(-fDp, -fDp2);
                this.textHandlingTouch = this.text.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(fDp, fDp2);
                return true;
            }
            if (actionMasked != 2) {
                if (actionMasked != 1 && actionMasked != 3) {
                    return false;
                }
                boolean z = this.dragging;
                this.dragging = false;
                if (z) {
                    requestDisallowParentIntercept(false);
                    if (actionMasked == 1 && (velocityTracker = this.velocityTracker) != null && this.scroller != null && this.view != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.velocityTracker.computeCurrentVelocity(1000, this.maxFlingVelocity);
                        float f = -this.velocityTracker.getXVelocity();
                        if (Math.abs(f) > this.minFlingVelocity) {
                            this.scroller.fling(this.scrollX, 0, (int) f, 0, 0, this.maxScrollX, 0, 0);
                            this.view.postOnAnimation(this.flingTick);
                        }
                    }
                }
                if (!z && this.textHandlingTouch) {
                    motionEvent.offsetLocation(-fDp, -fDp2);
                    this.text.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(fDp, fDp2);
                }
                this.textHandlingTouch = false;
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.velocityTracker = null;
                }
                return z || actionMasked == 1;
            }
            VelocityTracker velocityTracker4 = this.velocityTracker;
            if (velocityTracker4 != null) {
                velocityTracker4.addMovement(motionEvent);
            }
            float x = motionEvent.getX() - this.downX;
            if (!this.dragging && this.maxScrollX > 0 && Math.abs(x) > this.touchSlop) {
                this.dragging = true;
                requestDisallowParentIntercept(true);
                if (this.textHandlingTouch) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    motionEventObtain.offsetLocation(-fDp, -fDp2);
                    this.text.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    this.textHandlingTouch = false;
                }
            }
            if (this.dragging) {
                int i = (int) (this.downScrollX - x);
                int i2 = i >= 0 ? i : 0;
                int i3 = this.maxScrollX;
                if (i2 > i3) {
                    i2 = i3;
                }
                if (i2 != this.scrollX) {
                    this.scrollX = i2;
                    placeTexts(this.layoutX, this.layoutY, this.layoutRow);
                    View view = this.view;
                    if (view != null) {
                        view.invalidate();
                    }
                }
                return true;
            }
            return this.textHandlingTouch;
        }

        @Override
        public boolean isHorizontallyDragging() {
            OverScroller overScroller;
            return this.dragging || !((overScroller = this.scroller) == null || overScroller.isFinished());
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i, FoundLink foundLink) {
            if (!this.text.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.x = ((this.padding.left + AndroidUtilities.dp(0.0f)) - this.scrollX) - this.text.left;
            foundLink.y = i + this.padding.top + AndroidUtilities.dp(15.0f);
            return true;
        }

        @Override
        protected TextSelectionHelper.TextLayoutBlock[] getText() {
            return this.texts;
        }

        @Override
        protected void placeTexts(int i, int i2, int i3) {
            this.layoutX = i;
            this.layoutY = i2;
            this.layoutRow = i3;
            this.text.setX(((i + AndroidUtilities.dp(0.0f)) - this.scrollX) - this.text.left);
            this.text.setY(i2 + AndroidUtilities.dp(15.0f));
            this.text.setRow(i3);
        }

        @Override
        protected void onAttachedToWindow() {
            this.text.attach(this.view);
        }

        @Override
        protected void onDetachedFromWindow() {
            this.text.detach(this.view);
        }
    }

    public static class RichMathBlock extends RichBlock {
        private static final int HPAD = 0;
        private static final int VPAD = 8;
        private Bitmap bitmap;
        private final TL_iv.pageBlockMath block;
        private int contentH;
        private int contentW;
        private final int contentWidth;
        private int downScrollX;
        private float downX;
        private boolean dragging;
        private final Runnable flingTick;
        private int maxFlingVelocity;
        private final int maxScrollX;
        private int minFlingVelocity;
        private final Paint paint;
        private int scrollX;
        private OverScroller scroller;
        private int touchSlop;
        private VelocityTracker velocityTracker;
        private final int viewportWidth;

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            TL_iv.pageBlockMath pageblockmath = this.block;
            if (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) {
                return;
            }
            spannableStringBuilder.append((CharSequence) this.block.source);
        }

        public RichMathBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockMath pageblockmath) {
            super(richMessageLayout, rect, i);
            this.paint = new Paint(3);
            this.flingTick = new Runnable() {
                @Override
                public void run() {
                    if (RichMathBlock.this.scroller != null) {
                        RichMathBlock richMathBlock = RichMathBlock.this;
                        if (richMathBlock.view != null && richMathBlock.scroller.computeScrollOffset()) {
                            int currX = RichMathBlock.this.scroller.getCurrX();
                            if (currX < 0) {
                                currX = 0;
                            }
                            if (currX > RichMathBlock.this.maxScrollX) {
                                currX = RichMathBlock.this.maxScrollX;
                            }
                            if (currX != RichMathBlock.this.scrollX) {
                                RichMathBlock.this.scrollX = currX;
                                RichMathBlock.this.view.invalidate();
                            }
                            if (RichMathBlock.this.scroller.isFinished()) {
                                return;
                            }
                            RichMathBlock.this.view.postOnAnimation(this);
                        }
                    }
                }
            };
            this.block = pageblockmath;
            int i2 = this.maxWidth;
            this.viewportWidth = i2;
            Latex latexRender = (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? null : Latex.render(pageblockmath.source, AndroidUtilities.dp(richMessageLayout.fontSize + 4), false);
            if (latexRender != null) {
                this.bitmap = latexRender.bitmap;
                this.contentW = latexRender.width;
                this.contentH = latexRender.height;
            }
            int iDp = this.contentW + (AndroidUtilities.dp(0.0f) * 2);
            this.contentWidth = iDp;
            this.maxScrollX = Math.max(0, iDp - i2);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.bitmap == null) {
                return;
            }
            Paint paint = this.paint;
            RichMessageLayout richMessageLayout = this.root;
            paint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_messageTextOut : Theme.key_chat_messageTextIn));
            int iDp = this.contentH + (AndroidUtilities.dp(8.0f) * 2);
            if (this.maxScrollX > 0) {
                RichMessageLayout richMessageLayout2 = this.root;
                float f = -richMessageLayout2.padLeft;
                int minWidth = richMessageLayout2.getMinWidth() + this.root.padRight;
                Rect rect = this.padding;
                canvas.saveLayerAlpha(f, 0.0f, (minWidth - rect.left) - rect.right, iDp, 255, 31);
                canvas.save();
                canvas.translate(AndroidUtilities.dp(0.0f) - this.scrollX, AndroidUtilities.dp(8.0f));
            } else {
                canvas.save();
                canvas.translate(((this.root.getMinWidth() / 2.0f) - this.padding.left) - (this.contentW / 2.0f), AndroidUtilities.dp(8.0f));
            }
            canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, this.paint);
            if (this.maxScrollX > 0) {
                canvas.restore();
                RectF rectF = AndroidUtilities.rectTmp;
                float f2 = iDp;
                rectF.set(-this.root.padLeft, 0.0f, r2 + AndroidUtilities.dp(12.0f), f2);
                this.root.clip.draw(canvas, rectF, 0, 1.0f);
                int minWidth2 = this.root.getMinWidth() + this.root.padRight;
                Rect rect2 = this.padding;
                rectF.set(r2 - AndroidUtilities.dp(12.0f), 0.0f, (minWidth2 - rect2.left) - rect2.right, f2);
                this.root.clip.draw(canvas, rectF, 2, 1.0f);
            }
            canvas.restore();
        }

        @Override
        public int getHeight() {
            return this.padding.top + this.contentH + (AndroidUtilities.dp(8.0f) * 2) + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            return this.padding.left + Math.min(this.viewportWidth, this.contentWidth) + this.padding.right;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        private void ensureTouchConfig() {
            View view;
            if (this.touchSlop == 0 && (view = this.view) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.touchSlop = viewConfiguration.getScaledTouchSlop();
                this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.scroller != null || this.view == null) {
                return;
            }
            this.scroller = new OverScroller(this.view.getContext());
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            VelocityTracker velocityTracker;
            if (this.maxScrollX <= 0) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ensureTouchConfig();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.forceFinished(true);
                }
                this.downX = motionEvent.getX();
                this.downScrollX = this.scrollX;
                this.dragging = false;
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.velocityTracker.addMovement(motionEvent);
                return true;
            }
            if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x = motionEvent.getX() - this.downX;
                if (!this.dragging && Math.abs(x) > this.touchSlop) {
                    this.dragging = true;
                    requestDisallowParentIntercept(true);
                }
                if (!this.dragging) {
                    return false;
                }
                int i = (int) (this.downScrollX - x);
                int i2 = i >= 0 ? i : 0;
                int i3 = this.maxScrollX;
                if (i2 > i3) {
                    i2 = i3;
                }
                if (i2 != this.scrollX) {
                    this.scrollX = i2;
                    View view = this.view;
                    if (view != null) {
                        view.invalidate();
                    }
                }
                return true;
            }
            if (actionMasked != 1 && actionMasked != 3) {
                return false;
            }
            boolean z = this.dragging;
            this.dragging = false;
            if (z) {
                requestDisallowParentIntercept(false);
                if (actionMasked == 1 && (velocityTracker = this.velocityTracker) != null && this.scroller != null && this.view != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.velocityTracker.computeCurrentVelocity(1000, this.maxFlingVelocity);
                    float f = -this.velocityTracker.getXVelocity();
                    if (Math.abs(f) > this.minFlingVelocity) {
                        this.scroller.fling(this.scrollX, 0, (int) f, 0, 0, this.maxScrollX, 0, 0);
                        this.view.postOnAnimation(this.flingTick);
                    }
                }
            }
            VelocityTracker velocityTracker4 = this.velocityTracker;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.velocityTracker = null;
            }
            return z || actionMasked == 1;
        }

        @Override
        public boolean isHorizontallyDragging() {
            OverScroller overScroller;
            return this.dragging || !((overScroller = this.scroller) == null || overScroller.isFinished());
        }
    }

    public static class RichThinkingBlock extends RichBlock {
        public LinearGradient gradient;
        public int gradientColor;
        public final Matrix matrix;
        public final Paint paint;
        public final Text text;
        public final Text[] texts;

        @Override
        public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
            return false;
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.text, this.texts);
        }

        public RichThinkingBlock(RichMessageLayout richMessageLayout, Rect rect, int i, CharSequence charSequence) {
            super(richMessageLayout, rect, i);
            this.matrix = new Matrix();
            this.paint = new Paint(1);
            Text text = new Text(richMessageLayout, charSequence, this.maxWidth);
            this.text = text;
            this.texts = new Text[]{text};
        }

        private int rtlOffset() {
            if (!this.root.isRtl()) {
                return 0;
            }
            int minWidth = (this.root.getMinWidth() + this.root.padRight) - AndroidUtilities.dp(14.0f);
            Rect rect = this.padding;
            return ((minWidth - rect.right) - rect.left) - this.text.getMinWidth();
        }

        private void updateGradient() {
            RichMessageLayout richMessageLayout = this.root;
            int themedColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_messageTextOut : Theme.key_chat_messageTextIn);
            if (this.gradient == null || this.gradientColor != themedColor) {
                this.gradientColor = themedColor;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.maxWidth, 0.0f, new int[]{Theme.multAlpha(themedColor, 0.7f), Theme.multAlpha(themedColor, 0.25f), Theme.multAlpha(themedColor, 0.7f)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
                this.gradient = linearGradient;
                this.paint.setShader(linearGradient);
                this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.root.getMinWidth(), getHeight(), 255, 31);
            int iRtlOffset = rtlOffset();
            if (iRtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + iRtlOffset) - text.left);
                canvas.save();
                canvas.translate(iRtlOffset, 0.0f);
            }
            this.text.draw(canvas);
            if (this.root.isOverlayActive()) {
                canvas.save();
                canvas.translate(-this.text.left, 0.0f);
                Text text2 = this.text;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, text2.layout, text2.animatedEmojiStack, 0.0f, text2.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
                canvas.restore();
            }
            if (iRtlOffset != 0) {
                canvas.restore();
            }
            updateGradient();
            this.matrix.reset();
            this.matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.maxWidth, 0.0f);
            this.gradient.setLocalMatrix(this.matrix);
            canvas.drawRect(0.0f, 0.0f, this.root.getMinWidth(), getHeight(), this.paint);
            canvas.restore();
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override
        protected void onDrawFaded(Canvas canvas, int i, float f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.root.getMinWidth(), getHeight(), 255, 31);
            int iRtlOffset = rtlOffset();
            if (iRtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + iRtlOffset) - text.left);
            }
            canvas.save();
            canvas.translate(iRtlOffset - this.text.left, 0.0f);
            int color = this.root.textPaint.getColor();
            this.root.textPaint.setColor(-1);
            RichMessageLayout richMessageLayout = this.root;
            richMessageLayout.textPaint.linkColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_messageLinkOut : Theme.key_chat_messageLinkIn);
            final View view = this.view;
            MultiLayoutTypingAnimator.drawLayoutWithLastLineFade(canvas, this.text.layout, i, f, new MultiLayoutTypingAnimator.Renderer() {
                @Override
                public final void draw(Canvas canvas2) {
                    this.f$0.lambda$onDrawFaded$0(view, canvas2);
                }
            });
            canvas.restore();
            this.root.textPaint.setColor(color);
            updateGradient();
            this.matrix.reset();
            this.matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.maxWidth, 0.0f);
            this.gradient.setLocalMatrix(this.matrix);
            canvas.drawRect(0.0f, 0.0f, this.root.getMinWidth(), getHeight(), this.paint);
            canvas.restore();
            View view2 = this.view;
            if (view2 != null) {
                view2.invalidate();
            }
        }

        public void lambda$onDrawFaded$0(View view, Canvas canvas) {
            Text text = this.text;
            SpoilerEffect.renderWithRipple(view, false, -1, 0, text.spoilersPatchedTextLayout, 0, text.layout, text.spoilers, canvas, false);
            Text text2 = this.text;
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, text2.layout, text2.animatedEmojiStack, 0.0f, text2.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
        }

        @Override
        public Layout getLayout() {
            return this.text.layout;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int iRtlOffset = rtlOffset();
            if (iRtlOffset == 0) {
                return this.text.onTouchEvent(motionEvent);
            }
            motionEvent.offsetLocation(-iRtlOffset, 0.0f);
            boolean zOnTouchEvent = this.text.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(iRtlOffset, 0.0f);
            return zOnTouchEvent;
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i, FoundLink foundLink) {
            if (!this.text.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.x = (this.padding.left + rtlOffset()) - this.text.left;
            foundLink.y = i + this.padding.top;
            return true;
        }

        @Override
        public int getHeight() {
            return this.padding.top + this.text.getHeight() + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            return this.padding.left + this.text.getMinWidth() + this.padding.right;
        }

        @Override
        public int getLastLineWidth() {
            return this.padding.left + this.text.getLastLineWidth() + this.padding.right;
        }

        @Override
        protected TextSelectionHelper.TextLayoutBlock[] getText() {
            return this.texts;
        }

        @Override
        protected void placeTexts(int i, int i2, int i3) {
            super.placeTexts(i, i2, i3);
            int iRtlOffset = rtlOffset();
            if (iRtlOffset != 0) {
                Text text = this.text;
                text.setX((i + iRtlOffset) - text.left);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            this.text.attach(this.view);
        }

        @Override
        protected void onDetachedFromWindow() {
            this.text.detach(this.view);
        }
    }

    static final class SpoilerReveal {
        private ValueAnimator animator;
        private float cx;
        private float cy;
        private float maxR;
        private final Path path = new Path();
        float progress;
        boolean revealed;

        SpoilerReveal() {
        }

        boolean fullyRevealed() {
            return this.revealed && this.progress >= 1.0f;
        }

        boolean isRevealing() {
            return this.revealed || this.animator != null;
        }

        void start(final View view, float f, float f2, float f3, float f4) {
            if (this.revealed || this.animator != null) {
                return;
            }
            this.cx = f;
            this.cy = f2;
            this.maxR = (float) Math.sqrt((f3 * f3) + (f4 * f4));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration((long) Utilities.clamp(this.maxR * 0.3f, 550.0f, 250.0f));
            this.animator.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$start$0(view, valueAnimator);
                }
            });
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SpoilerReveal spoilerReveal = SpoilerReveal.this;
                    spoilerReveal.revealed = true;
                    spoilerReveal.animator = null;
                    View view2 = view;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                }
            });
            this.animator.start();
        }

        public void lambda$start$0(View view, ValueAnimator valueAnimator) {
            this.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (view != null) {
                view.invalidate();
            }
        }

        void clipOut(Canvas canvas) {
            if (this.progress > 0.0f) {
                this.path.rewind();
                this.path.addCircle(this.cx, this.cy, this.maxR * this.progress, Path.Direction.CW);
                canvas.clipPath(this.path, Region.Op.DIFFERENCE);
            }
        }
    }

    public static abstract class RichMediaBlock extends RichBlock implements DownloadController.FileDownloadProgressListener {
        private static ColorMatrixColorFilter fancyBlurFilter;
        private static Paint mediaBgPaint;
        protected boolean autoDownload;
        public final ImageReceiver blurImageReceiver;
        private Bitmap blurSource;
        private boolean buttonPressed;
        private final int buttonSize;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private final Path clipPath;
        public final boolean first;
        public final ImageReceiver imageReceiver;
        protected int imgHeight;
        protected int imgWidth;
        protected boolean mediaForced;
        private final int observerTag;
        private boolean photoPressed;
        protected RadialProgress2 radialProgress;
        private final SpoilerReveal spoilerReveal;

        protected boolean allowAutoplay() {
            return true;
        }

        protected abstract void applyImage(boolean z);

        protected abstract boolean fileExists();

        public abstract TL_iv.PageBlock getBlock();

        @Override
        protected int getBlockAccessibilityElementCount() {
            return 1;
        }

        protected abstract String getFileName();

        protected boolean isAnimatedContent() {
            return false;
        }

        protected boolean isRealVideo() {
            return false;
        }

        protected boolean isSpoiler() {
            return false;
        }

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public RichMediaBlock(RichMessageLayout richMessageLayout, Rect rect, int i, boolean z) {
            super(richMessageLayout, rect, i);
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            ImageReceiver imageReceiver2 = new ImageReceiver();
            this.blurImageReceiver = imageReceiver2;
            this.buttonState = -1;
            this.buttonSize = AndroidUtilities.dp(48.0f);
            this.clipPath = new Path();
            this.spoilerReveal = new SpoilerReveal();
            this.first = z;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            imageReceiver2.setAllowLoadingOnAttachedOnly(true);
            imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                @Override
                public void didSetImage(ImageReceiver imageReceiver3, boolean z2, boolean z3, boolean z4) {
                }

                @Override
                public void didSetImageBitmap(int i2, String str, Drawable drawable) {
                    ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i2, str, drawable);
                }

                @Override
                public void onAnimationReady(ImageReceiver imageReceiver3) {
                    RichMediaBlock.this.updateButtonState(true);
                }
            });
        }

        protected void finishLayout() {
            this.imageReceiver.setImageCoords(0.0f, 0.0f, this.imgWidth, this.imgHeight);
            int i = this.imgWidth;
            int i2 = this.buttonSize;
            this.buttonX = (i - i2) / 2;
            this.buttonY = (this.imgHeight - i2) / 2;
            boolean zComputeAutoDownload = computeAutoDownload();
            this.autoDownload = zComputeAutoDownload;
            applyImage(zComputeAutoDownload || fileExists());
        }

        protected boolean computeAutoDownload() {
            return (DownloadController.getInstance(this.root.currentAccount).getCurrentDownloadMask() & 1) != 0;
        }

        private int availWidth() {
            int minWidth = this.root.getMinWidth();
            Rect rect = this.padding;
            return (minWidth - rect.left) - rect.right;
        }

        protected int getImageLeft() {
            int iAvailWidth = availWidth();
            int i = this.imgWidth;
            if (iAvailWidth > i) {
                return (iAvailWidth - i) / 2;
            }
            return 0;
        }

        private void prepareBlurImage() {
            Bitmap bitmap;
            if ((this.blurImageReceiver.getBitmap() != null && this.imageReceiver.getAnimation() != null) || (bitmap = this.imageReceiver.getBitmap()) == null || bitmap.isRecycled()) {
                return;
            }
            if (bitmap != this.blurSource || this.blurImageReceiver.getBitmap() == null) {
                this.blurSource = bitmap;
                this.blurImageReceiver.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (fancyBlurFilter == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    fancyBlurFilter = new ColorMatrixColorFilter(colorMatrix);
                }
                this.blurImageReceiver.setColorFilter(fancyBlurFilter);
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (mediaBgPaint == null) {
                Paint paint = new Paint(1);
                mediaBgPaint = paint;
                paint.setColor(251658240);
            }
            int minWidth = this.root.getMinWidth();
            Rect rect = this.padding;
            int i = (minWidth - rect.left) - rect.right;
            boolean zIsInQuote = isInQuote();
            int iDp = AndroidUtilities.dp(2.0f);
            int i2 = zIsInQuote ? 0 : this.root.padLeft - iDp;
            int i3 = zIsInQuote ? 0 : this.root.padRight - iDp;
            boolean z = availWidth() > this.imgWidth;
            if (zIsInQuote) {
                canvas.save();
                this.clipPath.rewind();
                this.clipPath.addRoundRect(0.0f, 0.0f, i, this.imgHeight, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.clipPath(this.clipPath);
            }
            if (!this.imageReceiver.hasBitmapImage() || this.imageReceiver.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(-i2, 0.0f, i + i3, this.imgHeight, mediaBgPaint);
            }
            if (z) {
                prepareBlurImage();
                updateRoundRadius(this.blurImageReceiver, false);
                updateRoundRadius(this.imageReceiver, true);
                if (this.blurImageReceiver.getBitmap() != null) {
                    this.blurImageReceiver.setImageCoords(-i2, 0.0f, i2 + i + i3, this.imgHeight);
                    this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
                    this.blurImageReceiver.draw(canvas);
                }
                this.imageReceiver.setAspectFit(true);
                this.imageReceiver.setImageCoords(0.0f, 0.0f, availWidth(), this.imgHeight);
            } else {
                updateRoundRadius(this.imageReceiver, false);
                this.imageReceiver.setAspectFit(false);
                this.imageReceiver.setImageCoords(-i2, 0.0f, i2 + i + i3, this.imgHeight);
            }
            this.imageReceiver.draw(canvas);
            if (isSpoiler() && !this.spoilerReveal.fullyRevealed()) {
                drawMediaSpoiler(canvas);
            } else if (this.radialProgress != null && this.buttonState != -1) {
                int imageLeft = getImageLeft();
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i4 = imageLeft + this.buttonX;
                int i5 = this.buttonY;
                int i6 = this.buttonSize;
                radialProgress2.setProgressRect(i4, i5, i4 + i6, i6 + i5);
                this.radialProgress.draw(canvas);
            }
            if (zIsInQuote) {
                canvas.restore();
            }
        }

        private void updateRoundRadius(ImageReceiver imageReceiver, boolean z) {
            int iDp;
            if (z) {
                imageReceiver.setRoundRadius(0);
                return;
            }
            int i = SharedConfig.bubbleRadius;
            if (i > 2) {
                iDp = AndroidUtilities.dp(i - 2);
            } else {
                iDp = AndroidUtilities.dp(i);
            }
            int iMin = Math.min(AndroidUtilities.dp(3.0f), iDp);
            int i2 = (!this.first || this.root.hasNameOffset() || (!this.root.isOut() && this.root.isPinnedTop())) ? iMin : iDp;
            if (!this.first || (this.root.isOut() && this.root.isPinnedTop())) {
                iDp = iMin;
            }
            imageReceiver.setRoundRadius(i2, iDp, iMin, iMin);
        }

        private void startSpoilerReveal() {
            float imageWidth = this.imageReceiver.getImageWidth();
            float imageHeight = this.imageReceiver.getImageHeight();
            this.spoilerReveal.start(this.view, this.imageReceiver.getImageX() + (imageWidth / 2.0f), this.imageReceiver.getImageY() + (imageHeight / 2.0f), imageWidth, imageHeight);
        }

        private void drawMediaSpoiler(Canvas canvas) {
            if (this.spoilerReveal.fullyRevealed()) {
                return;
            }
            prepareBlurImage();
            float imageX = this.imageReceiver.getImageX();
            float imageY = this.imageReceiver.getImageY();
            float imageWidth = this.imageReceiver.getImageWidth();
            float imageHeight = this.imageReceiver.getImageHeight();
            if (imageWidth <= 0.0f || imageHeight <= 0.0f) {
                return;
            }
            canvas.save();
            canvas.clipRect(imageX, imageY, imageX + imageWidth, imageY + imageHeight);
            this.spoilerReveal.clipOut(canvas);
            if (this.blurImageReceiver.getBitmap() != null) {
                updateRoundRadius(this.blurImageReceiver, false);
                this.blurImageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
                this.blurImageReceiver.draw(canvas);
            }
            SpoilerEffect2 mediaSpoilerEffect = this.root.getMediaSpoilerEffect();
            if (mediaSpoilerEffect != null) {
                canvas.translate(imageX, imageY);
                mediaSpoilerEffect.draw(canvas, this.view, Math.round(imageWidth), Math.round(imageHeight), this.imageReceiver.getCurrentAlpha());
            }
            canvas.restore();
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override
        public int getHeight() {
            Rect rect = this.padding;
            return rect.top + this.imgHeight + rect.bottom;
        }

        @Override
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.imgWidth + rect.right;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichMediaBlock.onTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        protected CharSequence getBlockAccessibilityElementText(int i) {
            String string = LocaleController.getString(isRealVideo() ? R.string.AttachVideo : R.string.AttachPhoto);
            return (!isSpoiler() || this.spoilerReveal.fullyRevealed()) ? string : TextUtils.concat(string, ", ", LocaleController.getString(R.string.Spoiler));
        }

        @Override
        protected void getBlockAccessibilityElementBounds(int i, Rect rect) {
            int imageLeft = this.padding.left + getImageLeft();
            int i2 = ((int) this.currY) + this.padding.top;
            rect.set(imageLeft, i2, this.imgWidth + imageLeft, this.imgHeight + i2);
        }

        @Override
        protected boolean onBlockAccessibilityElementClick(int i, View view) {
            if (!isSpoiler() || this.spoilerReveal.isRevealing()) {
                if (this.root.delegate == null) {
                    return false;
                }
                this.root.delegate.openArticlePhoto(this.root.cell, getBlock());
                return true;
            }
            startSpoilerReveal();
            return true;
        }

        private void didPressButton(boolean z) {
            int i = this.buttonState;
            if (i == 0) {
                this.mediaForced = true;
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 != null) {
                    radialProgress2.setProgress(0.0f, z);
                }
                applyImage(true);
                this.buttonState = 1;
                RadialProgress2 radialProgress22 = this.radialProgress;
                if (radialProgress22 != null) {
                    radialProgress22.setIcon(3, true, z);
                }
                View view = this.view;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            if (i == 1) {
                this.mediaForced = false;
                this.imageReceiver.cancelLoadImage();
                this.buttonState = 0;
                RadialProgress2 radialProgress23 = this.radialProgress;
                if (radialProgress23 != null) {
                    radialProgress23.setIcon(2, false, z);
                }
                View view2 = this.view;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i != 3 || this.root.delegate == null) {
                    return;
                }
                this.root.delegate.openArticlePhoto(this.root.cell, getBlock());
                return;
            }
            this.mediaForced = true;
            this.imageReceiver.setAllowStartAnimation(true);
            applyImage(true);
            this.imageReceiver.startAnimation();
            this.buttonState = -1;
            RadialProgress2 radialProgress24 = this.radialProgress;
            if (radialProgress24 != null) {
                radialProgress24.setIcon(4, false, z);
            }
            View view3 = this.view;
            if (view3 != null) {
                view3.invalidate();
            }
        }

        public void updateButtonState(boolean z) {
            ensureProgress();
            String fileName = getFileName();
            if (TextUtils.isEmpty(fileName)) {
                this.buttonState = -1;
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 != null) {
                    radialProgress2.setIcon(4, false, false);
                    return;
                }
                return;
            }
            AnimatedFileDrawable animation = this.imageReceiver.getAnimation();
            boolean z2 = animation != null && (animation.hasBitmap() || this.imageReceiver.isAnimationRunning());
            if (fileExists() || (isAnimatedContent() && z2)) {
                DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
                if (isRealVideo() && !z2) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress22 = this.radialProgress;
                    if (radialProgress22 != null) {
                        radialProgress22.setIcon(0, false, z);
                    }
                } else if (isAnimatedContent() && !z2 && !allowAutoplay() && !this.mediaForced) {
                    this.buttonState = 2;
                    RadialProgress2 radialProgress23 = this.radialProgress;
                    if (radialProgress23 != null) {
                        radialProgress23.setIcon(8, false, z);
                    }
                } else {
                    this.buttonState = -1;
                    RadialProgress2 radialProgress24 = this.radialProgress;
                    if (radialProgress24 != null) {
                        radialProgress24.setIcon(4, false, z);
                    }
                }
            } else {
                DownloadController.getInstance(this.root.currentAccount).addLoadingFileObserver(fileName, null, this);
                if (this.autoDownload || this.mediaForced || FileLoader.getInstance(this.root.currentAccount).isLoadingFile(fileName)) {
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                    fFloatValue = fileProgress != null ? fileProgress.floatValue() : 0.0f;
                    RadialProgress2 radialProgress25 = this.radialProgress;
                    if (radialProgress25 != null) {
                        radialProgress25.setIcon(3, true, z);
                    }
                } else if (isRealVideo()) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress26 = this.radialProgress;
                    if (radialProgress26 != null) {
                        radialProgress26.setIcon(0, true, z);
                    }
                } else {
                    this.buttonState = 0;
                    RadialProgress2 radialProgress27 = this.radialProgress;
                    if (radialProgress27 != null) {
                        radialProgress27.setIcon(2, true, z);
                    }
                }
                RadialProgress2 radialProgress28 = this.radialProgress;
                if (radialProgress28 != null) {
                    radialProgress28.setProgress(fFloatValue, false);
                }
            }
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        private void ensureProgress() {
            View view;
            View view2;
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null || (view2 = this.view) == null) {
                if (radialProgress2 == null || (view = this.view) == null) {
                    return;
                }
                radialProgress2.setParent(view);
                RadialProgress2 radialProgress22 = this.radialProgress;
                int i = this.buttonX;
                int i2 = this.buttonY;
                int i3 = this.buttonSize;
                radialProgress22.setProgressRect(i, i2, i + i3, i3 + i2);
                return;
            }
            RadialProgress2 radialProgress23 = new RadialProgress2(view2);
            this.radialProgress = radialProgress23;
            radialProgress23.setProgressColor(-1);
            this.radialProgress.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress24 = this.radialProgress;
            int i4 = this.buttonX;
            int i5 = this.buttonY;
            int i6 = this.buttonSize;
            radialProgress24.setProgressRect(i4, i5, i4 + i6, i6 + i5);
        }

        @Override
        protected void onAttachedToWindow() {
            this.imageReceiver.setParentView(this.view);
            this.imageReceiver.onAttachedToWindow();
            this.blurImageReceiver.setParentView(this.view);
            this.blurImageReceiver.onAttachedToWindow();
            updateButtonState(false);
        }

        @Override
        protected void onDetachedFromWindow() {
            this.imageReceiver.onDetachedFromWindow();
            this.blurImageReceiver.onDetachedFromWindow();
            this.blurSource = null;
            DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
        }

        @Override
        public int getObserverTag() {
            return this.observerTag;
        }

        @Override
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(false);
        }

        @Override
        public void onSuccessDownload(String str) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.setProgress(1.0f, true);
            }
            if (isAnimatedContent() && (allowAutoplay() || this.mediaForced)) {
                applyImage(true);
            }
            updateButtonState(true);
        }

        @Override
        public void onProgressDownload(String str, long j, long j2) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.setProgress(Math.min(1.0f, j2 <= 0 ? 0.0f : j / j2), true);
            }
            if (this.buttonState != 1) {
                updateButtonState(true);
            }
        }
    }

    public static class RichPhotoBlock extends RichMediaBlock {
        public final TL_iv.pageBlockPhoto block;
        public final TLRPC.Photo photo;
        public final TLRPC.PhotoSize sizeFull;
        public final TLRPC.PhotoSize strippedSize;

        public RichPhotoBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockPhoto pageblockphoto, boolean z) {
            super(richMessageLayout, rect, i, z);
            this.block = pageblockphoto;
            TLRPC.Photo photo = richMessageLayout.getPhoto(pageblockphoto.photo_id);
            this.photo = photo;
            if (photo != null) {
                this.sizeFull = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                this.strippedSize = FileLoader.getStrippedPhotoSize(photo.sizes);
            } else {
                this.sizeFull = null;
                this.strippedSize = null;
            }
            TLRPC.PhotoSize photoSize = this.sizeFull;
            int i2 = photoSize != null ? photoSize.w : 100;
            int i3 = photoSize != null ? photoSize.h : 100;
            int iMax = this.maxWidth;
            int iMax2 = (int) ((iMax / Math.max(1, i2)) * i3);
            Point point = AndroidUtilities.displaySize;
            int iMax3 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (iMax2 > iMax3) {
                iMax = (int) ((iMax3 / Math.max(1, i3)) * i2);
                iMax2 = iMax3;
            }
            this.imgWidth = iMax;
            this.imgHeight = iMax2;
            finishLayout();
        }

        @Override
        protected void applyImage(boolean z) {
            TLRPC.Photo photo = this.photo;
            if (photo == null || this.sizeFull == null) {
                return;
            }
            TLRPC.PhotoSize photoSize = this.strippedSize;
            ImageLocation forPhoto = photoSize != null ? ImageLocation.getForPhoto(photoSize, photo) : null;
            if (z) {
                this.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(this.sizeFull, this.photo), null, forPhoto, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
            } else {
                this.imageReceiver.setImage(null, null, null, null, forPhoto, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
            }
        }

        @Override
        protected String getFileName() {
            return FileLoader.getAttachFileName(this.sizeFull);
        }

        @Override
        protected boolean fileExists() {
            if (this.sizeFull == null) {
                return true;
            }
            File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, true);
            File pathToAttach2 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, false);
            if (pathToAttach.exists()) {
                return true;
            }
            return pathToAttach2 != null && pathToAttach2.exists();
        }

        @Override
        public TL_iv.PageBlock getBlock() {
            return this.block;
        }

        @Override
        protected boolean isSpoiler() {
            TL_iv.pageBlockPhoto pageblockphoto = this.block;
            return pageblockphoto != null && pageblockphoto.spoiler;
        }
    }

    public static class RichVideoBlock extends RichMediaBlock {
        public final TL_iv.pageBlockVideo block;
        public final TLRPC.Document document;
        public final boolean isVideo;
        public final TLRPC.PhotoSize previewThumb;
        public final boolean realVideo;
        public final TLRPC.PhotoSize strippedThumb;

        public RichVideoBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockVideo pageblockvideo, boolean z) {
            int i2;
            int i3;
            super(richMessageLayout, rect, i, z);
            this.block = pageblockvideo;
            TLRPC.Document document = richMessageLayout.getDocument(pageblockvideo.video_id);
            this.document = document;
            boolean zIsVideoDocument = MessageObject.isVideoDocument(document);
            this.realVideo = zIsVideoDocument;
            int i4 = 0;
            this.isVideo = zIsVideoDocument || MessageObject.isGifDocument(document);
            if (document != null) {
                this.previewThumb = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
                this.strippedThumb = FileLoader.getStrippedPhotoSize(document.thumbs);
            } else {
                this.previewThumb = null;
                this.strippedThumb = null;
            }
            if (document != null) {
                while (true) {
                    if (i4 >= this.document.attributes.size()) {
                        i2 = 100;
                        i3 = 100;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.document.attributes.get(i4);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        i3 = documentAttribute.w;
                        i2 = documentAttribute.h;
                        break;
                    }
                    i4++;
                }
                if (i3 <= 0 || i2 <= 0) {
                    TLRPC.PhotoSize photoSize = this.previewThumb;
                    i3 = photoSize != null ? photoSize.w : 100;
                    i2 = photoSize != null ? photoSize.h : 100;
                }
                i = i3;
            } else {
                i2 = 100;
            }
            int iMax = this.maxWidth;
            int iMax2 = (int) ((iMax / Math.max(1, i)) * i2);
            Point point = AndroidUtilities.displaySize;
            int iMax3 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (iMax2 > iMax3) {
                iMax = (int) ((iMax3 / Math.max(1, i2)) * i);
                iMax2 = iMax3;
            }
            this.imgWidth = iMax;
            this.imgHeight = iMax2;
            finishLayout();
        }

        @Override
        protected boolean isRealVideo() {
            return this.realVideo;
        }

        @Override
        protected boolean isAnimatedContent() {
            return this.isVideo;
        }

        @Override
        protected boolean allowAutoplay() {
            return this.realVideo ? SharedConfig.isAutoplayVideo() : SharedConfig.isAutoplayGifs();
        }

        @Override
        protected boolean computeAutoDownload() {
            if (this.document == null) {
                return false;
            }
            return !this.isVideo || (allowAutoplay() && DownloadController.getInstance(this.root.currentAccount).canDownloadMedia(4, this.document.size));
        }

        @Override
        protected void applyImage(boolean z) {
            TLRPC.Document document = this.document;
            if (document == null) {
                return;
            }
            TLRPC.PhotoSize photoSize = this.strippedThumb;
            ImageLocation forDocument = photoSize != null ? ImageLocation.getForDocument(photoSize, document) : null;
            TLRPC.PhotoSize photoSize2 = this.previewThumb;
            ImageLocation forDocument2 = photoSize2 != null ? ImageLocation.getForDocument(photoSize2, this.document) : null;
            if (z && this.isVideo && (allowAutoplay() || this.mediaForced)) {
                this.imageReceiver.setAllowStartAnimation(true);
                this.imageReceiver.setAutoRepeat(1);
                this.imageReceiver.setImage(ImageLocation.getForDocument(this.document), "g", forDocument2, null, forDocument, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
                return;
            }
            this.imageReceiver.setImage(null, null, forDocument2, null, forDocument, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
        }

        @Override
        protected String getFileName() {
            return FileLoader.getAttachFileName(this.document);
        }

        @Override
        protected boolean fileExists() {
            if (this.document == null) {
                return true;
            }
            File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document);
            File pathToAttach2 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, true);
            if (pathToAttach == null || !pathToAttach.exists()) {
                return pathToAttach2 != null && pathToAttach2.exists();
            }
            return true;
        }

        @Override
        public TL_iv.PageBlock getBlock() {
            return this.block;
        }

        @Override
        protected boolean isSpoiler() {
            TL_iv.pageBlockVideo pageblockvideo = this.block;
            return pageblockvideo != null && pageblockvideo.spoiler;
        }
    }

    public static class RichMapBlock extends RichBlock {
        private static Paint mapBgPaint;
        public final TL_iv.pageBlockMap block;
        private int currentMapProvider;
        public final ImageReceiver imageReceiver;
        private final int imgHeight;
        private final int imgWidth;
        private boolean photoPressed;
        private Drawable redPinIcon;

        public RichMapBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockMap pageblockmap) {
            super(richMessageLayout, rect, i);
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            this.block = pageblockmap;
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            int i2 = pageblockmap.w;
            i2 = i2 <= 0 ? 100 : i2;
            int i3 = pageblockmap.h;
            int i4 = i3 > 0 ? i3 : 100;
            int iMax = this.maxWidth;
            int iMax2 = (int) ((iMax / Math.max(1, i2)) * i4);
            Point point = AndroidUtilities.displaySize;
            int iMax3 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (iMax2 > iMax3) {
                iMax = (int) ((iMax3 / Math.max(1, i4)) * i2);
                iMax2 = iMax3;
            }
            this.imgWidth = iMax;
            this.imgHeight = iMax2;
            imageReceiver.setImageCoords(0.0f, 0.0f, iMax, iMax2);
            applyImage();
        }

        private void applyImage() {
            if (this.block.geo == null) {
                return;
            }
            int i = this.root.currentAccount;
            int i2 = MessagesController.getInstance(i).mapProvider;
            this.currentMapProvider = i2;
            float f = this.imgWidth;
            float f2 = AndroidUtilities.density;
            int i3 = (int) (f / f2);
            int i4 = (int) (this.imgHeight / f2);
            TL_iv.pageBlockMap pageblockmap = this.block;
            int i5 = pageblockmap.zoom;
            int i6 = i5 > 0 ? i5 : 15;
            if (i2 == 2) {
                WebFile webFileCreateWithGeoPoint = WebFile.createWithGeoPoint(pageblockmap.geo, i3, i4, i6, Math.min(2, (int) Math.ceil(f2)));
                if (webFileCreateWithGeoPoint != null) {
                    this.imageReceiver.setImage(ImageLocation.getForWebFile(webFileCreateWithGeoPoint), null, null, null, this.root.messageObject, 0);
                    return;
                }
                return;
            }
            TLRPC.GeoPoint geoPoint = pageblockmap.geo;
            String strFormapMapUrl = AndroidUtilities.formapMapUrl(i, geoPoint.lat, geoPoint._long, i3, i4, true, i6, -1);
            if (strFormapMapUrl != null) {
                this.imageReceiver.setImage(strFormapMapUrl, null, null, null, 0L);
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            View view;
            if (mapBgPaint == null) {
                mapBgPaint = new Paint(1);
            }
            mapBgPaint.setColor(this.root.getThemedColor(Theme.key_chat_inLocationBackground));
            boolean zIsInQuote = isInQuote();
            int i = zIsInQuote ? 0 : this.root.padLeft;
            int i2 = zIsInQuote ? 0 : this.root.padRight;
            float f = -i;
            canvas.drawRect(f, 0.0f, this.imgWidth + i2, this.imgHeight, mapBgPaint);
            Drawable drawable = Theme.chat_locationDrawable[this.root.isOut() ? 1 : 0];
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i3 = (this.imgWidth - intrinsicWidth) / 2;
                int i4 = (this.imgHeight - intrinsicHeight) / 2;
                drawable.setBounds(i3, i4, intrinsicWidth + i3, intrinsicHeight + i4);
                drawable.draw(canvas);
            }
            this.imageReceiver.setImageCoords(f, 0.0f, this.imgWidth + i + i2, this.imgHeight);
            this.imageReceiver.draw(canvas);
            if (this.currentMapProvider == 2 && this.imageReceiver.hasNotThumb()) {
                if (this.redPinIcon == null && (view = this.view) != null) {
                    this.redPinIcon = ContextCompat.getDrawable(view.getContext(), R.drawable.map_pin).mutate();
                }
                if (this.redPinIcon != null) {
                    int intrinsicWidth2 = (int) (r0.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight2 = (int) (this.redPinIcon.getIntrinsicHeight() * 0.8f);
                    int i5 = (this.imgWidth - intrinsicWidth2) / 2;
                    int i6 = (this.imgHeight / 2) - intrinsicHeight2;
                    this.redPinIcon.setAlpha((int) (this.imageReceiver.getCurrentAlpha() * 255.0f));
                    this.redPinIcon.setBounds(i5, i6, intrinsicWidth2 + i5, intrinsicHeight2 + i6);
                    this.redPinIcon.draw(canvas);
                }
            }
        }

        @Override
        public int getHeight() {
            Rect rect = this.padding;
            return rect.top + this.imgHeight + rect.bottom;
        }

        @Override
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.imgWidth + rect.right;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            View view;
            int actionMasked = motionEvent.getActionMasked();
            float x = motionEvent.getX() - this.padding.left;
            float y = motionEvent.getY() - this.padding.top;
            boolean z = x >= 0.0f && x <= ((float) this.imgWidth) && y >= 0.0f && y <= ((float) this.imgHeight);
            if (actionMasked == 0) {
                if (!z) {
                    return false;
                }
                this.photoPressed = true;
                return true;
            }
            if (actionMasked == 1) {
                if (this.photoPressed) {
                    this.photoPressed = false;
                    if (z && this.block.geo != null && (view = this.view) != null) {
                        view.playSoundEffect(0);
                        try {
                            TLRPC.GeoPoint geoPoint = this.block.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            this.view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        return true;
                    }
                }
                return false;
            }
            if (actionMasked == 3) {
                this.photoPressed = false;
            }
            return this.photoPressed;
        }

        @Override
        protected void onAttachedToWindow() {
            this.imageReceiver.setParentView(this.view);
            this.imageReceiver.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            this.imageReceiver.onDetachedFromWindow();
        }
    }

    public static class RichAudioBlock extends RichBlock implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
        private final TextPaint audioTimePaint;
        public final TL_iv.pageBlockAudio block;
        private boolean buttonPressed;
        private int buttonState;
        private final int buttonX;
        private final int buttonY;
        private final TLRPC.Document currentDocument;
        private final MessageObject currentMessageObject;
        private StaticLayout durationLayout;
        private String lastTimeString;
        private int layoutWidth;
        private final int observerTag;
        private final RadialProgress2 radialProgress;
        private final SeekBar seekBar;
        private int seekBarWidth;
        private int seekBarX;
        private int seekBarY;
        private final int size;
        private StaticLayout titleLayout;

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public RichAudioBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockAudio pageblockaudio) {
            super(richMessageLayout, rect, i);
            this.audioTimePaint = new TextPaint(1);
            int iDp = AndroidUtilities.dp(16.0f);
            this.buttonX = iDp;
            int iDp2 = AndroidUtilities.dp(9.0f);
            this.buttonY = iDp2;
            int iDp3 = AndroidUtilities.dp(44.0f);
            this.size = iDp3;
            this.layoutWidth = -1;
            this.block = pageblockaudio;
            MessageObject messageObject = richMessageLayout.audioBlocks.get(pageblockaudio);
            this.currentMessageObject = messageObject;
            this.currentDocument = messageObject != null ? messageObject.getDocument() : null;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            RadialProgress2 radialProgress2 = new RadialProgress2(null);
            this.radialProgress = radialProgress2;
            radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
            radialProgress2.setProgressRect(iDp, iDp2, iDp + iDp3, iDp3 + iDp2);
            SeekBar seekBar = new SeekBar(null);
            this.seekBar = seekBar;
            seekBar.setDelegate(new SeekBar.SeekBarDelegate() {
                @Override
                public boolean isSeekBarDragAllowed() {
                    return SeekBar.SeekBarDelegate.CC.$default$isSeekBarDragAllowed(this);
                }

                @Override
                public void onSeekBarContinuousDrag(float f) {
                    SeekBar.SeekBarDelegate.CC.$default$onSeekBarContinuousDrag(this, f);
                }

                @Override
                public final void onSeekBarDrag(float f) {
                    this.f$0.lambda$new$0(f);
                }

                @Override
                public void onSeekBarPressed() {
                    SeekBar.SeekBarDelegate.CC.$default$onSeekBarPressed(this);
                }

                @Override
                public void onSeekBarReleased() {
                    SeekBar.SeekBarDelegate.CC.$default$onSeekBarReleased(this);
                }

                @Override
                public boolean reverseWaveform() {
                    return SeekBar.SeekBarDelegate.CC.$default$reverseWaveform(this);
                }
            });
            layoutInner();
            updateButtonState(false);
        }

        public void lambda$new$0(float f) {
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject == null) {
                return;
            }
            messageObject.audioProgress = f;
            MediaController.getInstance().seekToProgress(this.currentMessageObject, f);
        }

        private void layoutInner() {
            SpannableStringBuilder spannableStringBuilder;
            int i = this.maxWidth;
            RichMessageLayout richMessageLayout = this.root;
            this.layoutWidth = i + richMessageLayout.padLeft + richMessageLayout.padRight;
            int iDp = this.buttonX + AndroidUtilities.dp(50.0f) + this.size;
            this.seekBarX = iDp;
            this.seekBarWidth = Math.max(0, (this.layoutWidth - iDp) - AndroidUtilities.dp(18.0f));
            MessageObject messageObject = this.currentMessageObject;
            String musicAuthor = messageObject != null ? messageObject.getMusicAuthor(false) : null;
            MessageObject messageObject2 = this.currentMessageObject;
            String musicTitle = messageObject2 != null ? messageObject2.getMusicTitle(false) : null;
            if (!TextUtils.isEmpty(musicTitle) || !TextUtils.isEmpty(musicAuthor)) {
                if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder = new SpannableStringBuilder(String.format("%s - %s", musicAuthor, musicTitle));
                } else if (!TextUtils.isEmpty(musicTitle)) {
                    spannableStringBuilder = new SpannableStringBuilder(musicTitle);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(musicAuthor);
                }
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                this.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
                int iDp2 = this.seekBarWidth + AndroidUtilities.dp(50.0f);
                this.titleLayout = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, Theme.chat_audioTitlePaint, iDp2, TextUtils.TruncateAt.END), this.audioTimePaint, iDp2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.seekBarY = this.buttonY + ((this.size - AndroidUtilities.dp(30.0f)) / 2) + AndroidUtilities.dp(11.0f);
            } else {
                this.titleLayout = null;
                this.seekBarY = this.buttonY + ((this.size - AndroidUtilities.dp(30.0f)) / 2);
            }
            this.seekBar.setSize(this.seekBarWidth, AndroidUtilities.dp(30.0f));
        }

        @Override
        public int getHeight() {
            return this.padding.top + AndroidUtilities.dp(62.0f) + this.padding.bottom;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public boolean isHorizontallyDragging() {
            return this.seekBar.isDragging();
        }

        private int getIconForCurrentState() {
            int i = this.buttonState;
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            return i == 3 ? 3 : 0;
        }

        private boolean canStream() {
            MessageObject messageObject;
            return (!SharedConfig.streamMedia || (messageObject = this.currentMessageObject) == null || !messageObject.isMusic() || this.currentMessageObject.shouldEncryptPhotoOrVideo() || DialogObject.isEncryptedDialog(this.currentMessageObject.getDialogId())) ? false : true;
        }

        public void updatePlayingMessageProgress() {
            int i;
            if (this.currentDocument == null || this.currentMessageObject == null) {
                return;
            }
            if (!this.seekBar.isDragging()) {
                this.seekBar.setProgress(this.currentMessageObject.audioProgress);
            }
            if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.currentDocument.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.currentDocument.attributes.get(i2);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i = (int) documentAttribute.duration;
                        break;
                    }
                    i2++;
                }
            } else {
                i = this.currentMessageObject.audioProgressSec;
            }
            String shortDuration = AndroidUtilities.formatShortDuration(i);
            String str = this.lastTimeString;
            if (str == null || !str.equals(shortDuration)) {
                this.lastTimeString = shortDuration;
                this.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.durationLayout = new StaticLayout(shortDuration, this.audioTimePaint, (int) Math.ceil(this.audioTimePaint.measureText(shortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            TextPaint textPaint = this.audioTimePaint;
            RichMessageLayout richMessageLayout = this.root;
            textPaint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_messageTextOut : Theme.key_chat_messageTextIn));
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        public void updateButtonState(boolean z) {
            int i = this.root.currentAccount;
            String attachFileName = FileLoader.getAttachFileName(this.currentDocument);
            File pathToAttach = this.currentDocument == null ? null : FileLoader.getInstance(i).getPathToAttach(this.currentDocument, true);
            boolean z2 = pathToAttach != null && pathToAttach.exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (z2) {
                DownloadController.getInstance(i).removeLoadingFileObserver(this);
                if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || MediaController.getInstance().isMessagePaused()) {
                    this.buttonState = 0;
                } else {
                    this.buttonState = 1;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(i).addLoadingFileObserver(attachFileName, null, this);
                if (canStream()) {
                    this.buttonState = (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || MediaController.getInstance().isMessagePaused()) ? 0 : 1;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                } else {
                    if (!FileLoader.getInstance(i).isLoadingFile(attachFileName)) {
                        this.buttonState = 2;
                        this.radialProgress.setProgress(0.0f, z);
                        this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    } else {
                        this.buttonState = 3;
                        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                        this.radialProgress.setProgress(fileProgress != null ? fileProgress.floatValue() : 0.0f, z);
                        this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                    }
                }
            }
            updatePlayingMessageProgress();
        }

        private void didPressedButton(boolean z) {
            int i = this.root.currentAccount;
            int i2 = this.buttonState;
            if (i2 == 0) {
                if (MediaController.getInstance().setPlaylist(this.root.audioMessages, this.currentMessageObject, 0L, false, null)) {
                    this.buttonState = 1;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    View view = this.view;
                    if (view != null) {
                        view.invalidate();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i2 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                    this.buttonState = 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    View view2 = this.view;
                    if (view2 != null) {
                        view2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i2 == 2) {
                this.radialProgress.setProgress(0.0f, false);
                FileLoader.getInstance(i).loadFile(this.currentDocument, this.root.messageObject, 1, 1);
                this.buttonState = 3;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                View view3 = this.view;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (i2 == 3) {
                FileLoader.getInstance(i).cancelLoadFile(this.currentDocument);
                this.buttonState = 2;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                View view4 = this.view;
                if (view4 != null) {
                    view4.invalidate();
                }
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentMessageObject == null || this.currentDocument == null) {
                return;
            }
            int i = this.layoutWidth;
            int i2 = this.maxWidth;
            RichMessageLayout richMessageLayout = this.root;
            if (i != i2 + richMessageLayout.padLeft + richMessageLayout.padRight) {
                layoutInner();
            }
            canvas.save();
            canvas.translate(-this.root.padLeft, 0.0f);
            this.radialProgress.setColorKeys(this.root.isOut() ? Theme.key_chat_outLoader : Theme.key_chat_inLoader, this.root.isOut() ? Theme.key_chat_outLoaderSelected : Theme.key_chat_inLoaderSelected, this.root.isOut() ? Theme.key_chat_outMediaIcon : Theme.key_chat_inMediaIcon, this.root.isOut() ? Theme.key_chat_outMediaIconSelected : Theme.key_chat_inMediaIconSelected);
            RadialProgress2 radialProgress2 = this.radialProgress;
            RichMessageLayout richMessageLayout2 = this.root;
            radialProgress2.setProgressColor(richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? Theme.key_chat_outFileProgress : Theme.key_chat_inFileProgress));
            this.radialProgress.draw(canvas);
            SeekBar seekBar = this.seekBar;
            RichMessageLayout richMessageLayout3 = this.root;
            int themedColor = richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? Theme.key_chat_outAudioSeekbar : Theme.key_chat_inAudioSeekbar);
            RichMessageLayout richMessageLayout4 = this.root;
            int themedColor2 = richMessageLayout4.getThemedColor(richMessageLayout4.isOut() ? Theme.key_chat_outAudioCacheSeekbar : Theme.key_chat_inAudioCacheSeekbar);
            RichMessageLayout richMessageLayout5 = this.root;
            int themedColor3 = richMessageLayout5.getThemedColor(richMessageLayout5.isOut() ? Theme.key_chat_outAudioSeekbarFill : Theme.key_chat_inAudioSeekbarFill);
            RichMessageLayout richMessageLayout6 = this.root;
            int themedColor4 = richMessageLayout6.getThemedColor(richMessageLayout6.isOut() ? Theme.key_chat_outAudioSeekbarFill : Theme.key_chat_inAudioSeekbarFill);
            RichMessageLayout richMessageLayout7 = this.root;
            seekBar.setColors(themedColor, themedColor2, themedColor3, themedColor4, richMessageLayout7.getThemedColor(richMessageLayout7.isOut() ? Theme.key_chat_outAudioSeekbarSelected : Theme.key_chat_inAudioSeekbarSelected));
            canvas.save();
            canvas.translate(this.seekBarX, this.seekBarY);
            this.seekBar.draw(canvas);
            canvas.restore();
            if (this.durationLayout != null) {
                canvas.save();
                canvas.translate(this.buttonX + AndroidUtilities.dp(54.0f), this.seekBarY + AndroidUtilities.dp(6.0f));
                this.durationLayout.draw(canvas);
                canvas.restore();
            }
            if (this.titleLayout != null) {
                canvas.save();
                canvas.translate(this.buttonX + AndroidUtilities.dp(54.0f), this.seekBarY - AndroidUtilities.dp(16.0f));
                this.titleLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            float x = motionEvent.getX() + this.root.padLeft;
            float y = motionEvent.getY();
            if (this.seekBar.onTouch(actionMasked, x - this.seekBarX, y - this.seekBarY)) {
                if (actionMasked == 0) {
                    requestDisallowParentIntercept(true);
                }
                if (actionMasked == 1 || actionMasked == 3) {
                    requestDisallowParentIntercept(false);
                }
                View view = this.view;
                if (view != null) {
                    view.invalidate();
                }
                return true;
            }
            if (actionMasked == 0) {
                if (this.buttonState != -1) {
                    if (x >= this.buttonX && x <= r0 + AndroidUtilities.dp(48.0f)) {
                        if (y >= this.buttonY && y <= r0 + AndroidUtilities.dp(48.0f)) {
                            this.buttonPressed = true;
                            View view2 = this.view;
                            if (view2 != null) {
                                view2.invalidate();
                            }
                            return true;
                        }
                    }
                }
            } else if (actionMasked == 1) {
                if (this.buttonPressed) {
                    this.buttonPressed = false;
                    View view3 = this.view;
                    if (view3 != null) {
                        view3.playSoundEffect(0);
                    }
                    didPressedButton(true);
                    View view4 = this.view;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                this.buttonPressed = false;
            }
            return this.buttonPressed;
        }

        @Override
        protected void onAttachedToWindow() {
            View view = this.view;
            if (view != null) {
                this.radialProgress.setParent(view);
                this.seekBar.setParent(this.view);
            }
            updateButtonState(false);
            NotificationCenter.getInstance(this.root.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
            NotificationCenter.getInstance(this.root.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(this.root.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(this.root.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        }

        @Override
        protected void onDetachedFromWindow() {
            DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
            NotificationCenter.getInstance(this.root.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
            NotificationCenter.getInstance(this.root.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(this.root.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(this.root.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            MessageObject playingMessageObject;
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject == null) {
                return;
            }
            if (i == NotificationCenter.messagePlayingDidStart) {
                updateButtonState(true);
                return;
            }
            if (i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.messagePlayingPlayStateChanged) {
                updateButtonState(true);
                return;
            }
            if (i == NotificationCenter.messagePlayingProgressDidChanged) {
                if (messageObject.getId() != ((Integer) objArr[0]).intValue() || (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null) {
                    return;
                }
                MessageObject messageObject2 = this.currentMessageObject;
                messageObject2.audioProgress = playingMessageObject.audioProgress;
                messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                updatePlayingMessageProgress();
            }
        }

        @Override
        public int getObserverTag() {
            return this.observerTag;
        }

        @Override
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(true);
        }

        @Override
        public void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            updateButtonState(true);
        }

        @Override
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, j2 <= 0 ? 0.0f : j / j2), true);
            if (this.buttonState != 3) {
                updateButtonState(true);
            }
        }
    }

    public static class RichDocumentBlock extends RichBlock implements DownloadController.FileDownloadProgressListener {
        private static final int MIN_WIDTH_DP = 220;
        public final TL_iv.pageBlockDocument block;
        private final int buttonSize;
        private int buttonState;
        private final int buttonX;
        private final int buttonY;
        private final TLRPC.Document document;
        private final boolean hasPreview;
        private int layoutWidth;
        private final int observerTag;
        private final RectF optionsHit;
        private boolean optionsPressed;
        private boolean pressed;
        private final Paint previewBackgroundPaint;
        private final ImageReceiver previewImage;
        private final int previewX;
        private final RadialProgress2 radialProgress;
        private StaticLayout sizeLayout;
        private final TextPaint sizePaint;
        private StaticLayout titleLayout;
        private final TextPaint titlePaint;

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public RichDocumentBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockDocument pageblockdocument) {
            super(richMessageLayout, rect, i);
            ImageReceiver imageReceiver = new ImageReceiver();
            this.previewImage = imageReceiver;
            this.previewBackgroundPaint = new Paint(1);
            this.titlePaint = new TextPaint(1);
            this.sizePaint = new TextPaint(1);
            int iDp = AndroidUtilities.dp(16.0f);
            this.buttonX = iDp;
            int iDp2 = AndroidUtilities.dp(9.0f);
            this.buttonY = iDp2;
            int iDp3 = AndroidUtilities.dp(44.0f);
            this.buttonSize = iDp3;
            this.optionsHit = new RectF();
            this.layoutWidth = -1;
            this.block = pageblockdocument;
            TLRPC.Document document = richMessageLayout.getDocument(pageblockdocument.document_id);
            this.document = document;
            int iDp4 = richMessageLayout.padLeft + AndroidUtilities.dp(10.0f);
            this.previewX = iDp4;
            boolean zIsDocumentHasThumb = MessageObject.isDocumentHasThumb(document);
            this.hasPreview = zIsDocumentHasThumb;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            RadialProgress2 radialProgress2 = new RadialProgress2(null);
            this.radialProgress = radialProgress2;
            radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
            iDp = zIsDocumentHasThumb ? AndroidUtilities.dp(21.0f) + iDp4 : iDp;
            iDp2 = zIsDocumentHasThumb ? AndroidUtilities.dp(31.0f) : iDp2;
            radialProgress2.setProgressRect(iDp, iDp2, iDp + iDp3, iDp3 + iDp2);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            if (zIsDocumentHasThumb) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
                imageReceiver.setImageCoords(iDp4, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
                imageReceiver.setImage(closestPhotoSizeWithSize == null ? null : ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "86_86", ImageLoader.createStripedBitmap(document.thumbs), null, richMessageLayout.messageObject, 1);
            }
            rebuildLayouts();
            updateButtonState(false);
        }

        private void rebuildLayouts() {
            int i;
            float f;
            this.layoutWidth = getLayoutWidth();
            if (this.hasPreview) {
                i = this.previewX;
                f = 97.0f;
            } else {
                i = this.buttonX;
                f = 54.0f;
            }
            int iMax = Math.max(AndroidUtilities.dp(40.0f), (this.layoutWidth - (i + AndroidUtilities.dp(f))) - AndroidUtilities.dp(48.0f));
            this.titlePaint.setTextSize(AndroidUtilities.dp(this.root.fontSize - 1));
            this.titlePaint.setTypeface(AndroidUtilities.bold());
            this.sizePaint.setTextSize(AndroidUtilities.dp(this.root.fontSize - 3));
            TLRPC.Document document = this.document;
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(document == null ? "" : FileLoader.getDocumentFileName(document), this.titlePaint, iMax, TextUtils.TruncateAt.END);
            TextPaint textPaint = this.titlePaint;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.titleLayout = new StaticLayout(charSequenceEllipsize, textPaint, iMax, alignment, 1.0f, 0.0f, false);
            TLRPC.Document document2 = this.document;
            this.sizeLayout = new StaticLayout(document2 != null ? AndroidUtilities.formatFileSize(document2.size) : "", this.sizePaint, iMax, alignment, 1.0f, 0.0f, false);
        }

        @Override
        public int getHeight() {
            return this.padding.top + AndroidUtilities.dp(this.hasPreview ? 106.0f : 62.0f) + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            TLRPC.Document document = this.document;
            String documentFileName = document == null ? "" : FileLoader.getDocumentFileName(document);
            int iMin = Math.min(this.maxWidth, Math.max(AndroidUtilities.dp(220.0f), AndroidUtilities.dp(this.hasPreview ? 107.0f : 70.0f) + ((int) Math.ceil(Math.max(this.titlePaint.measureText(documentFileName), this.sizePaint.measureText(this.document != null ? AndroidUtilities.formatFileSize(r2.size) : "")))) + AndroidUtilities.dp(48.0f)));
            Rect rect = this.padding;
            return rect.left + iMin + rect.right;
        }

        @Override
        public int getLastLineWidth() {
            int iCeil;
            int iDp;
            if (this.hasPreview) {
                iDp = (this.previewX - this.root.padLeft) + AndroidUtilities.dp(86.0f);
            } else {
                StaticLayout staticLayout = this.sizeLayout;
                if (staticLayout == null || staticLayout.getLineCount() <= 0) {
                    iCeil = 0;
                } else {
                    StaticLayout staticLayout2 = this.sizeLayout;
                    iCeil = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
                }
                iDp = iCeil + (this.buttonX - this.root.padLeft) + AndroidUtilities.dp(54.0f);
            }
            Rect rect = this.padding;
            return rect.left + iDp + rect.right;
        }

        private int getLayoutWidth() {
            int iMin;
            int minWidth = this.root.getMinWidth();
            if (minWidth > 0) {
                int i = this.maxWidth;
                Rect rect = this.padding;
                iMin = Math.min(i, Math.max(0, (minWidth - rect.left) - rect.right));
            } else {
                iMin = this.maxWidth;
            }
            RichMessageLayout richMessageLayout = this.root;
            return iMin + richMessageLayout.padLeft + richMessageLayout.padRight;
        }

        private File path() {
            if (this.document == null) {
                return null;
            }
            File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, false);
            return (pathToAttach == null || !pathToAttach.exists()) ? FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, true) : pathToAttach;
        }

        public void updateButtonState(boolean z) {
            if (this.hasPreview) {
                this.radialProgress.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
                this.radialProgress.setProgressColor(this.root.getThemedColor(Theme.key_chat_mediaProgress));
            } else {
                this.radialProgress.setColorKeys(this.root.isOut() ? Theme.key_chat_outLoader : Theme.key_chat_inLoader, this.root.isOut() ? Theme.key_chat_outLoaderSelected : Theme.key_chat_inLoaderSelected, this.root.isOut() ? Theme.key_chat_outMediaIcon : Theme.key_chat_inMediaIcon, this.root.isOut() ? Theme.key_chat_outMediaIconSelected : Theme.key_chat_inMediaIconSelected);
                RadialProgress2 radialProgress2 = this.radialProgress;
                RichMessageLayout richMessageLayout = this.root;
                radialProgress2.setProgressColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_outFileProgress : Theme.key_chat_inFileProgress));
            }
            String attachFileName = FileLoader.getAttachFileName(this.document);
            File filePath = path();
            if (filePath != null && filePath.exists()) {
                DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
                this.buttonState = 0;
                this.radialProgress.setIcon(this.hasPreview ? 4 : 5, false, z);
            } else if (!TextUtils.isEmpty(attachFileName)) {
                DownloadController.getInstance(this.root.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                if (FileLoader.getInstance(this.root.currentAccount).isLoadingFile(attachFileName)) {
                    this.buttonState = 2;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    this.radialProgress.setProgress(fileProgress != null ? fileProgress.floatValue() : 0.0f, z);
                    this.radialProgress.setIcon(3, true, z);
                } else {
                    this.buttonState = 1;
                    this.radialProgress.setProgress(0.0f, z);
                    this.radialProgress.setIcon(2, false, z);
                }
            } else {
                this.radialProgress.setIcon(4, false, z);
            }
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        private void press() {
            int i = this.buttonState;
            if (i == 0) {
                View view = this.view;
                Activity activityFindActivity = findActivity(view == null ? null : view.getContext());
                File filePath = path();
                if (activityFindActivity != null && filePath != null) {
                    AndroidUtilities.openForView(filePath, FileLoader.getDocumentFileName(this.document), this.document.mime_type, activityFindActivity, this.root.resourcesProvider, false);
                }
            } else if (i == 1 && this.document != null) {
                FileLoader.getInstance(this.root.currentAccount).loadFile(this.document, this.root.messageObject, 1, 1);
                this.buttonState = 2;
                this.radialProgress.setIcon(3, true, true);
            } else if (i == 2 && this.document != null) {
                FileLoader.getInstance(this.root.currentAccount).cancelLoadFile(this.document);
                this.buttonState = 1;
                this.radialProgress.setIcon(2, false, true);
            }
            View view2 = this.view;
            if (view2 != null) {
                view2.invalidate();
            }
        }

        private static Activity findActivity(Context context) {
            while (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            return null;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            int iDp;
            Drawable themedDrawable;
            if (this.document == null) {
                return;
            }
            if (this.layoutWidth != getLayoutWidth()) {
                rebuildLayouts();
            }
            canvas.save();
            canvas.translate(-this.root.padLeft, 0.0f);
            if (this.hasPreview && !this.previewImage.draw(canvas)) {
                Paint paint = this.previewBackgroundPaint;
                RichMessageLayout richMessageLayout = this.root;
                paint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_outFileBackground : Theme.key_chat_inFileBackground));
                canvas.drawRoundRect(this.previewX, AndroidUtilities.dp(10.0f), this.previewX + AndroidUtilities.dp(86.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.previewBackgroundPaint);
            }
            this.radialProgress.draw(canvas);
            TextPaint textPaint = this.titlePaint;
            RichMessageLayout richMessageLayout2 = this.root;
            textPaint.setColor(richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? Theme.key_chat_outFileNameText : Theme.key_chat_inFileNameText));
            TextPaint textPaint2 = this.sizePaint;
            RichMessageLayout richMessageLayout3 = this.root;
            textPaint2.setColor(richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? Theme.key_chat_outTimeText : Theme.key_chat_inTimeText));
            if (this.hasPreview) {
                i = this.previewX;
                iDp = AndroidUtilities.dp(97.0f);
            } else {
                i = this.buttonX;
                iDp = AndroidUtilities.dp(54.0f);
            }
            int i2 = i + iDp;
            int iDp2 = AndroidUtilities.dp(11.0f);
            int height = this.titleLayout.getHeight() + iDp2 + AndroidUtilities.dp(2.0f);
            canvas.save();
            float f = i2;
            canvas.translate(f, iDp2);
            this.titleLayout.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f, height);
            this.sizeLayout.draw(canvas);
            canvas.restore();
            if (canShowOptions()) {
                if (this.root.isOut()) {
                    themedDrawable = this.root.getThemedDrawable("drawableMsgOutMenu");
                } else {
                    themedDrawable = Theme.chat_msgInMenuDrawable;
                }
                int menuX = getMenuX();
                int iDp3 = AndroidUtilities.dp(7.0f);
                themedDrawable.setBounds(menuX, iDp3, themedDrawable.getIntrinsicWidth() + menuX, themedDrawable.getIntrinsicHeight() + iDp3);
                themedDrawable.draw(canvas);
                this.optionsHit.set(menuX - AndroidUtilities.dp(8.0f), 0.0f, menuX + themedDrawable.getIntrinsicWidth() + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(54.0f));
            } else {
                this.optionsHit.setEmpty();
            }
            canvas.restore();
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichDocumentBlock.onTouchEvent(android.view.MotionEvent):boolean");
        }

        private boolean canShowOptions() {
            return (this.document == null || this.root.cell == null || this.root.delegate == null || !this.root.delegate.canSaveRichDocument(this.root.cell)) ? false : true;
        }

        private int getMenuX() {
            return (this.layoutWidth + this.padding.right) - AndroidUtilities.dp(32.0f);
        }

        @Override
        protected void onAttachedToWindow() {
            View view = this.view;
            if (view != null) {
                this.radialProgress.setParent(view);
                this.previewImage.setParentView(this.view);
            }
            this.previewImage.onAttachedToWindow();
            updateButtonState(false);
        }

        @Override
        protected void onDetachedFromWindow() {
            this.previewImage.onDetachedFromWindow();
            DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
        }

        @Override
        public int getObserverTag() {
            return this.observerTag;
        }

        @Override
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(true);
        }

        @Override
        public void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            updateButtonState(true);
        }

        @Override
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(j2 <= 0 ? 0.0f : Math.min(1.0f, j / j2), true);
            if (this.buttonState != 2) {
                updateButtonState(true);
            }
        }
    }

    public static class MediaCell implements DownloadController.FileDownloadProgressListener {
        private static ColorMatrixColorFilter fancyBlurFilter;
        public final float aspectRatio;
        public boolean autoDownload;
        public final ImageReceiver blurImageReceiver;
        private Bitmap blurSource;
        private boolean buttonPressed;
        private final int buttonSize;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        public final TLRPC.Document document;
        public int h;
        public final ImageReceiver imageReceiver;
        public final boolean isVideo;
        private boolean mediaForced;
        private final int observerTag;
        public final TL_iv.PageBlock pageBlock;
        private View parentView;
        public final TLRPC.Photo photo;
        private boolean photoPressed;
        public final TLRPC.PhotoSize previewThumb;
        public RadialProgress2 radialProgress;
        public final boolean realVideo;
        public final RichMessageLayout root;
        public final TLRPC.PhotoSize sizeFull;
        private final SpoilerReveal spoilerReveal;
        public final TLRPC.PhotoSize strippedSize;
        public final TLRPC.PhotoSize strippedThumb;
        public int w;
        public int x;
        public int y;

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public static MediaCell forPageBlock(RichMessageLayout richMessageLayout, TL_iv.PageBlock pageBlock) {
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                return new MediaCell(richMessageLayout, (TL_iv.pageBlockPhoto) pageBlock);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return new MediaCell(richMessageLayout, (TL_iv.pageBlockVideo) pageBlock);
            }
            return null;
        }

        private MediaCell(RichMessageLayout richMessageLayout, TL_iv.pageBlockPhoto pageblockphoto) {
            int i;
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            ImageReceiver imageReceiver2 = new ImageReceiver();
            this.blurImageReceiver = imageReceiver2;
            this.buttonState = -1;
            this.buttonSize = AndroidUtilities.dp(48.0f);
            this.spoilerReveal = new SpoilerReveal();
            this.root = richMessageLayout;
            this.pageBlock = pageblockphoto;
            TLRPC.Photo photo = richMessageLayout.getPhoto(pageblockphoto.photo_id);
            this.photo = photo;
            if (photo != null) {
                this.sizeFull = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                this.strippedSize = FileLoader.getStrippedPhotoSize(photo.sizes);
            } else {
                this.sizeFull = null;
                this.strippedSize = null;
            }
            this.document = null;
            this.previewThumb = null;
            this.strippedThumb = null;
            this.isVideo = false;
            this.realVideo = false;
            TLRPC.PhotoSize photoSize = this.sizeFull;
            this.aspectRatio = (photoSize == null || (i = photoSize.h) <= 0) ? 1.0f : photoSize.w / i;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        }

        private MediaCell(RichMessageLayout richMessageLayout, TL_iv.pageBlockVideo pageblockvideo) {
            float f;
            int i;
            this.imageReceiver = new ImageReceiver();
            this.blurImageReceiver = new ImageReceiver();
            this.buttonState = -1;
            this.buttonSize = AndroidUtilities.dp(48.0f);
            this.spoilerReveal = new SpoilerReveal();
            this.root = richMessageLayout;
            this.pageBlock = pageblockvideo;
            this.photo = null;
            this.sizeFull = null;
            this.strippedSize = null;
            TLRPC.Document document = richMessageLayout.getDocument(pageblockvideo.video_id);
            this.document = document;
            boolean zIsVideoDocument = MessageObject.isVideoDocument(document);
            this.realVideo = zIsVideoDocument;
            this.isVideo = zIsVideoDocument || MessageObject.isGifDocument(document);
            if (document != null) {
                this.previewThumb = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
                this.strippedThumb = FileLoader.getStrippedPhotoSize(document.thumbs);
            } else {
                this.previewThumb = null;
                this.strippedThumb = null;
            }
            if (document != null) {
                for (int i2 = 0; i2 < this.document.attributes.size(); i2++) {
                    TLRPC.DocumentAttribute documentAttribute = this.document.attributes.get(i2);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i = documentAttribute.h) > 0) {
                        f = documentAttribute.w / i;
                        break;
                    }
                }
                f = 1.0f;
            } else {
                f = 1.0f;
            }
            this.aspectRatio = f;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            this.imageReceiver.setAllowLoadingOnAttachedOnly(true);
            this.blurImageReceiver.setAllowLoadingOnAttachedOnly(true);
            this.imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                @Override
                public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                }

                @Override
                public void didSetImageBitmap(int i3, String str, Drawable drawable) {
                    ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i3, str, drawable);
                }

                @Override
                public void onAnimationReady(ImageReceiver imageReceiver) {
                    MediaCell mediaCell = MediaCell.this;
                    mediaCell.updateButtonState(mediaCell.parentView, true);
                }
            });
        }

        public void setRect(int i, int i2, int i3, int i4) {
            this.x = i;
            this.y = i2;
            this.w = i3;
            this.h = i4;
            this.imageReceiver.setImageCoords(i, i2, i3, i4);
            int i5 = this.buttonSize;
            int i6 = i + ((i3 - i5) / 2);
            this.buttonX = i6;
            int i7 = i2 + ((i4 - i5) / 2);
            this.buttonY = i7;
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.setProgressRect(i6, i7, i6 + i5, i5 + i7);
            }
            boolean zComputeAutoDownload = computeAutoDownload();
            this.autoDownload = zComputeAutoDownload;
            applyImage(zComputeAutoDownload || fileExists());
        }

        private boolean allowAutoplay() {
            return this.realVideo ? SharedConfig.isAutoplayVideo() : SharedConfig.isAutoplayGifs();
        }

        private boolean computeAutoDownload() {
            return this.document != null ? !this.isVideo || (allowAutoplay() && DownloadController.getInstance(this.root.currentAccount).canDownloadMedia(4, this.document.size)) : (DownloadController.getInstance(this.root.currentAccount).getCurrentDownloadMask() & 1) != 0;
        }

        public boolean fileExists() {
            if (this.sizeFull != null) {
                File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, true);
                File pathToAttach2 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, false);
                return pathToAttach.exists() || (pathToAttach2 != null && pathToAttach2.exists());
            }
            if (this.document == null) {
                return true;
            }
            File pathToAttach3 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document);
            File pathToAttach4 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, true);
            return (pathToAttach3 != null && pathToAttach3.exists()) || (pathToAttach4 != null && pathToAttach4.exists());
        }

        public String getFileName() {
            TLRPC.PhotoSize photoSize = this.sizeFull;
            if (photoSize != null) {
                return FileLoader.getAttachFileName(photoSize);
            }
            TLRPC.Document document = this.document;
            if (document != null) {
                return FileLoader.getAttachFileName(document);
            }
            return null;
        }

        private void applyImage(boolean z) {
            TLRPC.Photo photo = this.photo;
            if (photo != null && this.sizeFull != null) {
                TLRPC.PhotoSize photoSize = this.strippedSize;
                ImageLocation forPhoto = photoSize != null ? ImageLocation.getForPhoto(photoSize, photo) : null;
                if (z) {
                    this.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(this.sizeFull, this.photo), null, forPhoto, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
                    return;
                } else {
                    this.imageReceiver.setImage(null, null, null, null, forPhoto, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
                    return;
                }
            }
            TLRPC.Document document = this.document;
            if (document != null) {
                TLRPC.PhotoSize photoSize2 = this.strippedThumb;
                ImageLocation forDocument = photoSize2 != null ? ImageLocation.getForDocument(photoSize2, document) : null;
                TLRPC.PhotoSize photoSize3 = this.previewThumb;
                ImageLocation forDocument2 = photoSize3 != null ? ImageLocation.getForDocument(photoSize3, this.document) : null;
                if (z && this.isVideo && (allowAutoplay() || this.mediaForced)) {
                    this.imageReceiver.setAllowStartAnimation(true);
                    this.imageReceiver.setAutoRepeat(1);
                    this.imageReceiver.setImage(ImageLocation.getForDocument(this.document), "g", forDocument2, null, forDocument, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
                    return;
                }
                this.imageReceiver.setImage(null, null, forDocument2, null, forDocument, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
            }
        }

        public void ensureProgress(View view) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null || view == null) {
                if (radialProgress2 == null || view == null) {
                    return;
                }
                radialProgress2.setParent(view);
                RadialProgress2 radialProgress22 = this.radialProgress;
                int i = this.buttonX;
                int i2 = this.buttonY;
                int i3 = this.buttonSize;
                radialProgress22.setProgressRect(i, i2, i + i3, i3 + i2);
                return;
            }
            RadialProgress2 radialProgress23 = new RadialProgress2(view);
            this.radialProgress = radialProgress23;
            radialProgress23.setProgressColor(-1);
            this.radialProgress.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress24 = this.radialProgress;
            int i4 = this.buttonX;
            int i5 = this.buttonY;
            int i6 = this.buttonSize;
            radialProgress24.setProgressRect(i4, i5, i4 + i6, i6 + i5);
        }

        public void attach(View view) {
            this.parentView = view;
            this.imageReceiver.setParentView(view);
            this.imageReceiver.onAttachedToWindow();
            this.blurImageReceiver.setParentView(view);
            this.blurImageReceiver.onAttachedToWindow();
            ensureProgress(view);
            updateButtonState(view, false);
        }

        public void detach() {
            this.imageReceiver.onDetachedFromWindow();
            this.blurImageReceiver.onDetachedFromWindow();
            this.blurSource = null;
            DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
        }

        private boolean isSpoiler() {
            TL_iv.PageBlock pageBlock = this.pageBlock;
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                return ((TL_iv.pageBlockPhoto) pageBlock).spoiler;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return ((TL_iv.pageBlockVideo) pageBlock).spoiler;
            }
            return false;
        }

        private void prepareBlurImage() {
            Bitmap bitmap;
            if ((this.blurImageReceiver.getBitmap() != null && this.imageReceiver.getAnimation() != null) || (bitmap = this.imageReceiver.getBitmap()) == null || bitmap.isRecycled()) {
                return;
            }
            if (bitmap != this.blurSource || this.blurImageReceiver.getBitmap() == null) {
                this.blurSource = bitmap;
                this.blurImageReceiver.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (fancyBlurFilter == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    fancyBlurFilter = new ColorMatrixColorFilter(colorMatrix);
                }
                this.blurImageReceiver.setColorFilter(fancyBlurFilter);
            }
        }

        public void updateButtonState(View view, boolean z) {
            if (view == null) {
                view = this.parentView;
            }
            ensureProgress(view);
            String fileName = getFileName();
            if (TextUtils.isEmpty(fileName)) {
                this.buttonState = -1;
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 != null) {
                    radialProgress2.setIcon(4, false, false);
                    return;
                }
                return;
            }
            AnimatedFileDrawable animation = this.imageReceiver.getAnimation();
            boolean z2 = animation != null && (animation.hasBitmap() || this.imageReceiver.isAnimationRunning());
            if (fileExists() || (this.isVideo && z2)) {
                DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
                if (this.realVideo && !z2) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress22 = this.radialProgress;
                    if (radialProgress22 != null) {
                        radialProgress22.setIcon(0, false, z);
                    }
                } else if (this.isVideo && !z2 && !allowAutoplay() && !this.mediaForced) {
                    this.buttonState = 2;
                    RadialProgress2 radialProgress23 = this.radialProgress;
                    if (radialProgress23 != null) {
                        radialProgress23.setIcon(8, false, z);
                    }
                } else {
                    this.buttonState = -1;
                    RadialProgress2 radialProgress24 = this.radialProgress;
                    if (radialProgress24 != null) {
                        radialProgress24.setIcon(4, false, z);
                    }
                }
            } else {
                DownloadController.getInstance(this.root.currentAccount).addLoadingFileObserver(fileName, null, this);
                if (this.autoDownload || this.mediaForced || FileLoader.getInstance(this.root.currentAccount).isLoadingFile(fileName)) {
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                    fFloatValue = fileProgress != null ? fileProgress.floatValue() : 0.0f;
                    RadialProgress2 radialProgress25 = this.radialProgress;
                    if (radialProgress25 != null) {
                        radialProgress25.setIcon(3, true, z);
                    }
                } else if (this.realVideo) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress26 = this.radialProgress;
                    if (radialProgress26 != null) {
                        radialProgress26.setIcon(0, true, z);
                    }
                } else {
                    this.buttonState = 0;
                    RadialProgress2 radialProgress27 = this.radialProgress;
                    if (radialProgress27 != null) {
                        radialProgress27.setIcon(2, true, z);
                    }
                }
                RadialProgress2 radialProgress28 = this.radialProgress;
                if (radialProgress28 != null) {
                    radialProgress28.setProgress(fFloatValue, false);
                }
            }
            if (view != null) {
                view.invalidate();
            }
        }

        private void didPressButton(View view, boolean z) {
            int i = this.buttonState;
            if (i == 0) {
                this.mediaForced = true;
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 != null) {
                    radialProgress2.setProgress(0.0f, z);
                }
                applyImage(true);
                this.buttonState = 1;
                RadialProgress2 radialProgress22 = this.radialProgress;
                if (radialProgress22 != null) {
                    radialProgress22.setIcon(3, true, z);
                }
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            if (i == 1) {
                this.mediaForced = false;
                this.imageReceiver.cancelLoadImage();
                this.buttonState = 0;
                RadialProgress2 radialProgress23 = this.radialProgress;
                if (radialProgress23 != null) {
                    radialProgress23.setIcon(2, false, z);
                }
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i != 3 || this.root.delegate == null) {
                    return;
                }
                this.root.delegate.openArticlePhoto(this.root.cell, this.pageBlock);
                return;
            }
            this.mediaForced = true;
            this.imageReceiver.setAllowStartAnimation(true);
            applyImage(true);
            this.imageReceiver.startAnimation();
            this.buttonState = -1;
            RadialProgress2 radialProgress24 = this.radialProgress;
            if (radialProgress24 != null) {
                radialProgress24.setIcon(4, false, z);
            }
            if (view != null) {
                view.invalidate();
            }
        }

        public boolean isInside(float f, float f2) {
            if (f >= this.x && f <= r0 + this.w) {
                if (f2 >= this.y && f2 <= r3 + this.h) {
                    return true;
                }
            }
            return false;
        }

        private boolean isOnButton(float f, float f2) {
            if (this.buttonState != -1) {
                if (f >= this.buttonX) {
                    int i = this.buttonSize;
                    if (f <= r0 + i) {
                        if (f2 >= this.buttonY && f2 <= r3 + i) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public boolean onTouchEvent(MotionEvent motionEvent, View view) {
            int i;
            int actionMasked = motionEvent.getActionMasked();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean zIsInside = isInside(x, y);
            boolean zIsOnButton = isOnButton(x, y);
            if (actionMasked == 0) {
                if (zIsInside && (zIsOnButton || (i = this.buttonState) == 0 || i == 2)) {
                    this.buttonPressed = true;
                    if (view != null) {
                        view.invalidate();
                    }
                    return true;
                }
                if (!zIsInside) {
                    return false;
                }
                this.photoPressed = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked != 3) {
                    return this.photoPressed || this.buttonPressed;
                }
                this.photoPressed = false;
                this.buttonPressed = false;
                return false;
            }
            if (this.buttonPressed) {
                this.buttonPressed = false;
                if (view != null) {
                    view.playSoundEffect(0);
                    view.invalidate();
                }
                didPressButton(view, true);
                return true;
            }
            if (this.photoPressed) {
                this.photoPressed = false;
                if (zIsInside) {
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    if (!isSpoiler() || this.spoilerReveal.isRevealing()) {
                        if (this.root.delegate != null) {
                            this.root.delegate.openArticlePhoto(this.root.cell, this.pageBlock);
                        }
                    } else {
                        float imageWidth = this.imageReceiver.getImageWidth();
                        float imageHeight = this.imageReceiver.getImageHeight();
                        this.spoilerReveal.start(view, this.imageReceiver.getImageX() + (imageWidth / 2.0f), this.imageReceiver.getImageY() + (imageHeight / 2.0f), imageWidth, imageHeight);
                    }
                    return true;
                }
            }
            return false;
        }

        public CharSequence getAccessibilityText() {
            String string = LocaleController.getString(this.isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
            return (!isSpoiler() || this.spoilerReveal.fullyRevealed()) ? string : TextUtils.concat(string, ", ", LocaleController.getString(R.string.Spoiler));
        }

        public boolean onAccessibilityClick(View view) {
            if (!isSpoiler() || this.spoilerReveal.isRevealing()) {
                if (this.root.delegate == null) {
                    return false;
                }
                this.root.delegate.openArticlePhoto(this.root.cell, this.pageBlock);
                return true;
            }
            float imageWidth = this.imageReceiver.getImageWidth();
            float imageHeight = this.imageReceiver.getImageHeight();
            this.spoilerReveal.start(view, (imageWidth / 2.0f) + this.imageReceiver.getImageX(), this.imageReceiver.getImageY() + (imageHeight / 2.0f), imageWidth, imageHeight);
            return true;
        }

        public void draw(Canvas canvas) {
            this.imageReceiver.draw(canvas);
            if (isSpoiler() && !this.spoilerReveal.fullyRevealed()) {
                drawSpoiler(canvas);
                return;
            }
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 == null || this.buttonState == -1) {
                return;
            }
            radialProgress2.draw(canvas);
        }

        private void drawSpoiler(Canvas canvas) {
            prepareBlurImage();
            float imageX = this.imageReceiver.getImageX();
            float imageY = this.imageReceiver.getImageY();
            float imageWidth = this.imageReceiver.getImageWidth();
            float imageHeight = this.imageReceiver.getImageHeight();
            if (imageWidth <= 0.0f || imageHeight <= 0.0f) {
                return;
            }
            canvas.save();
            canvas.clipRect(imageX, imageY, imageX + imageWidth, imageY + imageHeight);
            this.spoilerReveal.clipOut(canvas);
            if (this.blurImageReceiver.getBitmap() != null) {
                this.blurImageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
                this.blurImageReceiver.draw(canvas);
            }
            SpoilerEffect2 mediaSpoilerEffect = this.root.getMediaSpoilerEffect();
            if (mediaSpoilerEffect != null) {
                canvas.translate(imageX, imageY);
                mediaSpoilerEffect.draw(canvas, this.parentView, Math.round(imageWidth), Math.round(imageHeight), this.imageReceiver.getCurrentAlpha());
            }
            canvas.restore();
            View view = this.parentView;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override
        public int getObserverTag() {
            return this.observerTag;
        }

        @Override
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(this.parentView, false);
        }

        @Override
        public void onSuccessDownload(String str) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.setProgress(1.0f, true);
            }
            if (this.isVideo && (allowAutoplay() || this.mediaForced)) {
                applyImage(true);
            }
            updateButtonState(this.parentView, true);
        }

        @Override
        public void onProgressDownload(String str, long j, long j2) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.setProgress(Math.min(1.0f, j2 <= 0 ? 0.0f : j / j2), true);
            }
            if (this.buttonState != 1) {
                updateButtonState(this.parentView, true);
            }
        }
    }

    public static class RichCollageBlock extends RichBlock {
        private static Paint mediaBgPaint;
        public final TL_iv.pageBlockCollage block;
        private int[] cellFlags;
        public final ArrayList<MediaCell> cells;
        private int contentHeight;
        public final boolean first;
        private MediaCell pressedCell;

        public RichCollageBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockCollage pageblockcollage, boolean z) {
            super(richMessageLayout, rect, i);
            this.cells = new ArrayList<>();
            this.block = pageblockcollage;
            this.first = z;
            for (int i2 = 0; i2 < pageblockcollage.items.size(); i2++) {
                MediaCell mediaCellForPageBlock = MediaCell.forPageBlock(richMessageLayout, pageblockcollage.items.get(i2));
                if (mediaCellForPageBlock != null) {
                    this.cells.add(mediaCellForPageBlock);
                }
            }
            layoutCells();
        }

        private void layoutCells() {
            int iRound;
            int iRound2;
            this.cellFlags = new int[this.cells.size()];
            if (this.cells.isEmpty()) {
                this.contentHeight = 0;
                return;
            }
            float f = 0.0f;
            byte b = 1;
            if (this.cells.size() == 1) {
                MediaCell mediaCell = this.cells.get(0);
                float f2 = mediaCell.aspectRatio;
                if (f2 <= 0.0f) {
                    f2 = 1.0f;
                }
                int i = this.maxWidth;
                int i2 = (int) (i / f2);
                Point point = AndroidUtilities.displaySize;
                int iMax = (int) (Math.max(point.x, point.y) * 0.55f);
                if (i2 > iMax) {
                    i = (int) (iMax * f2);
                    i2 = iMax;
                }
                mediaCell.setRect(0, 0, i, i2);
                this.cellFlags[0] = 15;
                this.contentHeight = i2;
                return;
            }
            float[] fArr = new float[this.cells.size()];
            for (int i3 = 0; i3 < this.cells.size(); i3++) {
                fArr[i3] = this.cells.get(i3).aspectRatio;
            }
            MessageObject.GroupedMessagePosition[] groupedMessagePositionArrComputeGrouped = RichMessageLayout.computeGrouped(fArr);
            int iMax2 = 0;
            for (MessageObject.GroupedMessagePosition groupedMessagePosition : groupedMessagePositionArrComputeGrouped) {
                iMax2 = Math.max(iMax2, (int) groupedMessagePosition.maxY);
            }
            int i4 = iMax2 + 1;
            float[] fArr2 = new float[i4];
            for (MessageObject.GroupedMessagePosition groupedMessagePosition2 : groupedMessagePositionArrComputeGrouped) {
                byte b2 = groupedMessagePosition2.minY;
                if (b2 == groupedMessagePosition2.maxY) {
                    fArr2[b2] = Math.max(fArr2[b2], groupedMessagePosition2.ph);
                }
            }
            for (MessageObject.GroupedMessagePosition groupedMessagePosition3 : groupedMessagePositionArrComputeGrouped) {
                int i5 = groupedMessagePosition3.minY;
                byte b3 = groupedMessagePosition3.maxY;
                if (i5 != b3) {
                    int i6 = (b3 - i5) + 1;
                    float[] fArr3 = groupedMessagePosition3.siblingHeights;
                    if (fArr3 == null || fArr3.length != i6) {
                        float f3 = groupedMessagePosition3.ph / i6;
                        while (i5 <= groupedMessagePosition3.maxY) {
                            fArr2[i5] = Math.max(fArr2[i5], f3);
                            i5++;
                        }
                    } else {
                        for (int i7 = 0; i7 < i6; i7++) {
                            int i8 = groupedMessagePosition3.minY + i7;
                            fArr2[i8] = Math.max(fArr2[i8], groupedMessagePosition3.siblingHeights[i7]);
                        }
                    }
                }
            }
            Point point2 = AndroidUtilities.displaySize;
            float fMax = Math.max(point2.x, point2.y) * 0.5f;
            int[] iArr = new int[iMax2 + 2];
            for (int i9 = 0; i9 <= iMax2; i9++) {
                iArr[i9] = Math.round(f * fMax);
                f += fArr2[i9];
            }
            iArr[i4] = Math.round(f * fMax);
            int iDp = AndroidUtilities.dp(2.0f);
            int i10 = 0;
            while (i10 < groupedMessagePositionArrComputeGrouped.length) {
                MessageObject.GroupedMessagePosition groupedMessagePosition4 = groupedMessagePositionArrComputeGrouped[i10];
                int i11 = iArr[groupedMessagePosition4.minY];
                int i12 = iArr[groupedMessagePosition4.maxY + b] - i11;
                if (groupedMessagePosition4.leftSpanOffset > 0) {
                    iRound = Math.round((r11 * this.maxWidth) / 1000.0f);
                } else {
                    int i13 = 0;
                    for (int i14 = 0; i14 < groupedMessagePositionArrComputeGrouped.length; i14++) {
                        if (i14 != i10) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition5 = groupedMessagePositionArrComputeGrouped[i14];
                            byte b4 = groupedMessagePosition5.minY;
                            byte b5 = groupedMessagePosition4.minY;
                            if (b4 <= b5 && groupedMessagePosition5.maxY >= b5 && groupedMessagePosition5.minX < groupedMessagePosition4.minX) {
                                i13 += groupedMessagePosition5.pw;
                            }
                        }
                    }
                    iRound = Math.round((i13 * this.maxWidth) / 1000.0f);
                }
                if ((groupedMessagePosition4.flags & 2) != 0) {
                    iRound2 = this.maxWidth - iRound;
                } else {
                    iRound2 = Math.round((groupedMessagePosition4.pw * this.maxWidth) / 1000.0f) - iDp;
                }
                if ((groupedMessagePosition4.flags & 8) == 0) {
                    i12 -= iDp;
                }
                this.cells.get(i10).setRect(iRound, i11, Math.max(0, iRound2), Math.max(0, i12));
                this.cellFlags[i10] = groupedMessagePosition4.flags;
                i10++;
                b = 1;
            }
            this.contentHeight = iArr[i4];
        }

        private void updateRoundRadius(ImageReceiver imageReceiver, int i, boolean z) {
            int iDp;
            int i2;
            int i3 = 0;
            boolean z2 = (i & 4) != 0;
            boolean z3 = (i & 8) != 0;
            boolean z4 = (i & 1) != 0;
            boolean z5 = (i & 2) != 0;
            if (z) {
                int iDp2 = AndroidUtilities.dp(8.0f);
                int i4 = (z2 && z4) ? iDp2 : 0;
                int i5 = (z2 && z5) ? iDp2 : 0;
                int i6 = (z3 && z5) ? iDp2 : 0;
                if (z3 && z4) {
                    i3 = iDp2;
                }
                imageReceiver.setRoundRadius(i4, i5, i6, i3);
                return;
            }
            int i7 = SharedConfig.bubbleRadius;
            if (i7 > 2) {
                iDp = AndroidUtilities.dp(i7 - 2);
            } else {
                iDp = AndroidUtilities.dp(i7);
            }
            int iMin = Math.min(AndroidUtilities.dp(3.0f), iDp);
            if (z2 && z4) {
                i2 = (!this.first || this.root.hasNameOffset() || (!this.root.isOut() && this.root.isPinnedTop())) ? iMin : iDp;
            } else {
                i2 = 0;
            }
            if (!z2 || !z5) {
                iDp = 0;
            } else if (!this.first || this.root.hasNameOffset() || (this.root.isOut() && this.root.isPinnedTop())) {
                iDp = iMin;
            }
            int i8 = (z3 && z5) ? iMin : 0;
            if (z3 && z4) {
                i3 = iMin;
            }
            imageReceiver.setRoundRadius(i2, iDp, i8, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (mediaBgPaint == null) {
                Paint paint = new Paint(1);
                mediaBgPaint = paint;
                paint.setColor(251658240);
            }
            boolean zIsInQuote = isInQuote();
            int iDp = AndroidUtilities.dp(2.0f);
            int i = zIsInQuote ? 0 : this.root.padLeft - iDp;
            int i2 = zIsInQuote ? 0 : this.root.padRight - iDp;
            int i3 = this.maxWidth;
            float f = (i3 <= 0 || (i <= 0 && i2 <= 0)) ? 1.0f : ((i3 + i) + i2) / i3;
            int i4 = 0;
            while (i4 < this.cells.size()) {
                MediaCell mediaCell = this.cells.get(i4);
                int iRound = Math.round(mediaCell.x * f) - i;
                int iRound2 = Math.round(mediaCell.w * f);
                ImageReceiver imageReceiver = mediaCell.imageReceiver;
                int[] iArr = this.cellFlags;
                updateRoundRadius(imageReceiver, (iArr == null || i4 >= iArr.length) ? 0 : iArr[i4], zIsInQuote);
                float f2 = iRound;
                mediaCell.imageReceiver.setImageCoords(f2, mediaCell.y, iRound2, mediaCell.h);
                if (!mediaCell.imageReceiver.hasBitmapImage() || mediaCell.imageReceiver.getCurrentAlpha() != 1.0f) {
                    canvas.drawRect(f2, mediaCell.y, iRound + iRound2, r10 + mediaCell.h, mediaBgPaint);
                }
                mediaCell.draw(canvas);
                i4++;
            }
        }

        @Override
        public int getHeight() {
            return this.contentHeight;
        }

        @Override
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.maxWidth + rect.right;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            Rect rect = this.padding;
            motionEvent.offsetLocation(-rect.left, -rect.top);
            boolean zOnTouchEvent = false;
            try {
                if (actionMasked == 0) {
                    this.pressedCell = null;
                    for (int i = 0; i < this.cells.size(); i++) {
                        MediaCell mediaCell = this.cells.get(i);
                        if (mediaCell.isInside(motionEvent.getX(), motionEvent.getY()) && mediaCell.onTouchEvent(motionEvent, this.view)) {
                            this.pressedCell = mediaCell;
                            return true;
                        }
                    }
                } else {
                    MediaCell mediaCell2 = this.pressedCell;
                    if (mediaCell2 != null) {
                        zOnTouchEvent = mediaCell2.onTouchEvent(motionEvent, this.view);
                        if (actionMasked == 1 || actionMasked == 3) {
                            this.pressedCell = null;
                        }
                    }
                }
                return zOnTouchEvent;
            } finally {
                Rect rect2 = this.padding;
                motionEvent.offsetLocation(rect2.left, rect2.top);
            }
        }

        @Override
        protected int getBlockAccessibilityElementCount() {
            return this.cells.size();
        }

        @Override
        protected CharSequence getBlockAccessibilityElementText(int i) {
            if (i < 0 || i >= this.cells.size()) {
                return null;
            }
            return this.cells.get(i).getAccessibilityText();
        }

        @Override
        protected void getBlockAccessibilityElementBounds(int i, Rect rect) {
            if (i < 0 || i >= this.cells.size()) {
                return;
            }
            MediaCell mediaCell = this.cells.get(i);
            Rect rect2 = this.padding;
            int i2 = rect2.left + mediaCell.x;
            int i3 = ((int) this.currY) + rect2.top + mediaCell.y;
            rect.set(i2, i3, mediaCell.w + i2, mediaCell.h + i3);
        }

        @Override
        protected boolean onBlockAccessibilityElementClick(int i, View view) {
            if (i < 0 || i >= this.cells.size()) {
                return false;
            }
            return this.cells.get(i).onAccessibilityClick(view);
        }

        @Override
        protected void onAttachedToWindow() {
            Iterator<MediaCell> it = this.cells.iterator();
            while (it.hasNext()) {
                it.next().attach(this.view);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            Iterator<MediaCell> it = this.cells.iterator();
            while (it.hasNext()) {
                it.next().detach();
            }
        }
    }

    public static class RichSlideshowBlock extends RichBlock {
        private static Paint mediaBgPaint;
        private static Paint slideDotPaint;
        public final TL_iv.pageBlockSlideshow block;
        public final ArrayList<MediaCell> cells;
        private final Path clipPath;
        private int currentPage;
        private int dotsHeight;
        private float downX;
        private float downY;
        private boolean dragging;
        public final boolean first;
        private int maxFlingVelocity;
        private int minFlingVelocity;
        private float pageOffset;
        private ValueAnimator settleAnimator;
        private int slideHeight;
        private int slideWidth;
        private int touchSlop;
        private VelocityTracker velocityTracker;
        private boolean verticalDragging;

        public RichSlideshowBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockSlideshow pageblockslideshow, boolean z) {
            super(richMessageLayout, rect, i);
            this.cells = new ArrayList<>();
            this.clipPath = new Path();
            this.block = pageblockslideshow;
            this.first = z;
            for (int i2 = 0; i2 < pageblockslideshow.items.size(); i2++) {
                MediaCell mediaCellForPageBlock = MediaCell.forPageBlock(richMessageLayout, pageblockslideshow.items.get(i2));
                if (mediaCellForPageBlock != null) {
                    this.cells.add(mediaCellForPageBlock);
                }
            }
            layoutCells();
        }

        private void layoutCells() {
            if (this.cells.isEmpty()) {
                this.slideHeight = 0;
                this.slideWidth = 0;
                return;
            }
            this.slideWidth = this.maxWidth;
            Iterator<MediaCell> it = this.cells.iterator();
            float f = 0.0f;
            while (it.hasNext()) {
                float f2 = it.next().aspectRatio;
                if (f2 <= 0.0f) {
                    f2 = 1.0f;
                }
                f += f2;
            }
            int iMax = (int) (this.slideWidth / Math.max(0.5f, f / this.cells.size()));
            Point point = AndroidUtilities.displaySize;
            int iMax2 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (iMax > iMax2) {
                iMax = iMax2;
            }
            this.slideHeight = iMax;
            this.dotsHeight = 0;
            Iterator<MediaCell> it2 = this.cells.iterator();
            while (it2.hasNext()) {
                it2.next().setRect(0, 0, this.slideWidth, this.slideHeight);
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            int i2;
            int i3;
            int i4;
            int iDp;
            float fClamp;
            int i5;
            float f;
            MediaCell mediaCell;
            int i6 = 0;
            if (this.cells.isEmpty()) {
                return;
            }
            if (mediaBgPaint == null) {
                Paint paint = new Paint(1);
                mediaBgPaint = paint;
                paint.setColor(251658240);
            }
            boolean zIsInQuote = isInQuote();
            int iDp2 = AndroidUtilities.dp(2.0f);
            int i7 = zIsInQuote ? 0 : this.root.padLeft - iDp2;
            int i8 = zIsInQuote ? 0 : this.root.padRight - iDp2;
            int i9 = this.slideWidth + i7 + i8;
            canvas.save();
            if (zIsInQuote) {
                int iDp3 = AndroidUtilities.dp(8.0f);
                this.clipPath.rewind();
                float f2 = iDp3;
                this.clipPath.addRoundRect(0.0f, 0.0f, this.slideWidth, this.slideHeight, f2, f2, Path.Direction.CW);
                canvas.clipPath(this.clipPath);
                i = iDp3;
                i2 = i;
                i3 = i2;
                i4 = i3;
            } else if (this.first) {
                int i10 = SharedConfig.bubbleRadius;
                if (i10 > 2) {
                    iDp = AndroidUtilities.dp(i10 - 2);
                } else {
                    iDp = AndroidUtilities.dp(i10);
                }
                int iMin = Math.min(AndroidUtilities.dp(3.0f), iDp);
                int i11 = ((this.root.isOut() || !this.root.isPinnedTop()) && !this.root.hasNameOffset()) ? iDp : iMin;
                if ((this.root.isOut() && this.root.isPinnedTop()) || this.root.hasNameOffset()) {
                    iDp = iMin;
                }
                float f3 = i11;
                float f4 = iDp;
                float f5 = iMin;
                this.clipPath.rewind();
                this.clipPath.addRoundRect(-i7, 0.0f, this.slideWidth + i8, this.slideHeight, new float[]{f3, f3, f4, f4, f5, f5, f5, f5}, Path.Direction.CW);
                canvas.clipPath(this.clipPath);
                i2 = iDp;
                i3 = iMin;
                i4 = i3;
                i = i11;
            } else {
                canvas.clipRect(-i7, 0, this.root.getMinWidth() + i8, this.slideHeight);
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            int i12 = this.currentPage;
            float f6 = 0.0f;
            if ((i12 == 0 && this.pageOffset < 0.0f) || (i12 == this.cells.size() - 1 && this.pageOffset > 0.0f)) {
                RichMessageLayout richMessageLayout = this.root;
                canvas.drawColor(Theme.multAlpha(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_outReplyNameText : Theme.key_chat_inReplyNameText), 0.2f));
            }
            float f7 = i9;
            float f8 = (-this.pageOffset) * f7;
            int i13 = this.currentPage - 1;
            while (i13 <= this.currentPage + 1) {
                if (i13 < 0 || i13 >= this.cells.size()) {
                    i5 = i13;
                    f = f7;
                } else {
                    MediaCell mediaCell2 = this.cells.get(i13);
                    canvas.save();
                    canvas.translate(((i13 - this.currentPage) * i9) + f8, f6);
                    ImageReceiver imageReceiver = mediaCell2.imageReceiver;
                    if (i13 == 0) {
                        i6 = i;
                    }
                    imageReceiver.setRoundRadius(i6, i13 == this.cells.size() - 1 ? i2 : 0, i13 == this.cells.size() - 1 ? i3 : 0, i13 == 0 ? i4 : 0);
                    mediaCell2.blurImageReceiver.setRoundRadius(i13 == 0 ? i : 0, i13 == this.cells.size() - 1 ? i2 : 0, i13 == this.cells.size() - 1 ? i3 : 0, i13 == 0 ? i4 : 0);
                    float f9 = -i7;
                    mediaCell2.imageReceiver.setImageCoords(f9, 0.0f, f7, this.slideHeight);
                    if (mediaCell2.imageReceiver.hasBitmapImage() && mediaCell2.imageReceiver.getCurrentAlpha() == 1.0f) {
                        mediaCell = mediaCell2;
                        i5 = i13;
                        f = f7;
                    } else {
                        mediaCell = mediaCell2;
                        i5 = i13;
                        f = f7;
                        canvas.drawRect(f9, 0.0f, i9 + i8, this.slideHeight, mediaBgPaint);
                    }
                    mediaCell.draw(canvas);
                    canvas.restore();
                }
                i13 = i5 + 1;
                f7 = f;
                f6 = 0.0f;
                i6 = 0;
            }
            canvas.restore();
            int size = this.cells.size();
            if (size > 1) {
                if (slideDotPaint == null) {
                    Paint paint2 = new Paint(1);
                    slideDotPaint = paint2;
                    paint2.setColor(-1);
                    slideDotPaint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dpf2(1.0f), Integer.MIN_VALUE);
                }
                float fDp = (this.slideHeight - AndroidUtilities.dp(23.0f)) + AndroidUtilities.dp(5.0f);
                int iDp4 = (AndroidUtilities.dp(7.0f) * size) + ((size - 1) * AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(4.0f);
                float f10 = this.currentPage + this.pageOffset;
                if (iDp4 < i9) {
                    fClamp = (i9 - iDp4) / 2.0f;
                } else {
                    float fDp2 = AndroidUtilities.dp(4.0f);
                    int iDp5 = AndroidUtilities.dp(13.0f);
                    fClamp = fDp2 - (Utilities.clamp(f10 - (((i9 - AndroidUtilities.dp(8.0f)) / 2) / iDp5), Math.max(0, (size - (r11 * 2)) - 1), 0.0f) * iDp5);
                }
                canvas.save();
                canvas.clipRect(0, this.slideHeight - AndroidUtilities.dp(23.0f), i9, this.slideHeight);
                for (int i14 = 0; i14 < size; i14++) {
                    float fMax = Math.max(0.0f, 1.0f - Math.abs(i14 - f10));
                    slideDotPaint.setAlpha((int) ((fMax * 95.0f) + 160.0f));
                    canvas.drawCircle(AndroidUtilities.dp(4.0f) + fClamp + (AndroidUtilities.dp(13.0f) * i14), fDp, AndroidUtilities.dp(2.0f) + (AndroidUtilities.dp(1.0f) * fMax), slideDotPaint);
                }
                canvas.restore();
            }
        }

        @Override
        public int getHeight() {
            return this.slideHeight + this.dotsHeight;
        }

        @Override
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.maxWidth + rect.right;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        protected int getBlockAccessibilityElementCount() {
            return !this.cells.isEmpty() ? 1 : 0;
        }

        @Override
        protected CharSequence getBlockAccessibilityElementText(int i) {
            if (this.cells.isEmpty()) {
                return null;
            }
            int iMax = Math.max(0, Math.min(this.currentPage, this.cells.size() - 1));
            return TextUtils.concat(this.cells.get(iMax).getAccessibilityText(), ", ", LocaleController.formatString(R.string.Of, Integer.valueOf(iMax + 1), Integer.valueOf(this.cells.size())));
        }

        @Override
        protected void getBlockAccessibilityElementBounds(int i, Rect rect) {
            Rect rect2 = this.padding;
            int i2 = rect2.left;
            int i3 = ((int) this.currY) + rect2.top;
            rect.set(i2, i3, this.slideWidth + i2, this.slideHeight + i3);
        }

        @Override
        protected boolean onBlockAccessibilityElementClick(int i, View view) {
            if (this.cells.isEmpty()) {
                return false;
            }
            return this.cells.get(Math.max(0, Math.min(this.currentPage, this.cells.size() - 1))).onAccessibilityClick(view);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean zOnTouchEvent;
            VelocityTracker velocityTracker;
            View view;
            int actionMasked = motionEvent.getActionMasked();
            Rect rect = this.padding;
            motionEvent.offsetLocation(-rect.left, -rect.top);
            try {
                if (actionMasked == 0) {
                    if (this.touchSlop == 0 && (view = this.view) != null) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                        this.touchSlop = viewConfiguration.getScaledTouchSlop();
                        this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.downX = motionEvent.getX();
                    this.downY = motionEvent.getY();
                    this.dragging = false;
                    this.verticalDragging = false;
                    VelocityTracker velocityTracker2 = this.velocityTracker;
                    if (velocityTracker2 == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.velocityTracker.addMovement(motionEvent);
                    requestDisallowParentIntercept(true);
                    ValueAnimator valueAnimator = this.settleAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.settleAnimator = null;
                    }
                    int i = this.currentPage;
                    if (i >= 0 && i < this.cells.size()) {
                        this.cells.get(this.currentPage).onTouchEvent(motionEvent, this.view);
                    }
                } else {
                    float f = 0.0f;
                    if (actionMasked != 2) {
                        if (actionMasked == 1 || actionMasked == 3) {
                            boolean z = this.verticalDragging;
                            this.verticalDragging = false;
                            if (!z && actionMasked == 1 && (velocityTracker = this.velocityTracker) != null) {
                                velocityTracker.addMovement(motionEvent);
                                this.velocityTracker.computeCurrentVelocity(1000, this.maxFlingVelocity);
                                float xVelocity = this.velocityTracker.getXVelocity();
                                float yVelocity = this.velocityTracker.getYVelocity();
                                if (Math.abs(xVelocity) >= this.minFlingVelocity && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                    f = xVelocity;
                                }
                            }
                            VelocityTracker velocityTracker3 = this.velocityTracker;
                            if (velocityTracker3 != null) {
                                velocityTracker3.recycle();
                                this.velocityTracker = null;
                            }
                            requestDisallowParentIntercept(false);
                            if (!z) {
                                if (this.dragging) {
                                    this.dragging = false;
                                    settle(f);
                                } else {
                                    int i2 = this.currentPage;
                                    if (i2 >= 0 && i2 < this.cells.size()) {
                                        zOnTouchEvent = this.cells.get(this.currentPage).onTouchEvent(motionEvent, this.view);
                                        Rect rect2 = this.padding;
                                        motionEvent.offsetLocation(rect2.left, rect2.top);
                                        return zOnTouchEvent;
                                    }
                                }
                            }
                        }
                        Rect rect3 = this.padding;
                        motionEvent.offsetLocation(rect3.left, rect3.top);
                        return false;
                    }
                    if (!this.verticalDragging) {
                        VelocityTracker velocityTracker4 = this.velocityTracker;
                        if (velocityTracker4 != null) {
                            velocityTracker4.addMovement(motionEvent);
                        }
                        float x = motionEvent.getX() - this.downX;
                        float y = motionEvent.getY() - this.downY;
                        if (!this.dragging && Math.abs(y) > this.touchSlop && Math.abs(y) > Math.abs(x)) {
                            this.verticalDragging = true;
                            int i3 = this.currentPage;
                            if (i3 >= 0 && i3 < this.cells.size()) {
                                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                                motionEventObtain.setAction(3);
                                this.cells.get(this.currentPage).onTouchEvent(motionEventObtain, this.view);
                                motionEventObtain.recycle();
                            }
                            requestDisallowParentIntercept(false);
                        } else {
                            if (!this.dragging && Math.abs(x) > this.touchSlop && Math.abs(x) > Math.abs(y)) {
                                this.dragging = true;
                                int i4 = this.currentPage;
                                if (i4 >= 0 && i4 < this.cells.size()) {
                                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                                    motionEventObtain2.setAction(3);
                                    this.cells.get(this.currentPage).onTouchEvent(motionEventObtain2, this.view);
                                    motionEventObtain2.recycle();
                                }
                            }
                            if (this.dragging) {
                                float f2 = (-x) / this.slideWidth;
                                int i5 = this.currentPage;
                                if (i5 == 0 && f2 < 0.0f) {
                                    f2 *= 0.3f;
                                }
                                if (i5 == this.cells.size() - 1 && f2 > 0.0f) {
                                    f2 *= 0.3f;
                                }
                                this.pageOffset = f2;
                                View view2 = this.view;
                                if (view2 != null) {
                                    view2.invalidate();
                                }
                            } else {
                                int i6 = this.currentPage;
                                if (i6 >= 0 && i6 < this.cells.size()) {
                                    zOnTouchEvent = this.cells.get(this.currentPage).onTouchEvent(motionEvent, this.view);
                                    Rect rect22 = this.padding;
                                    motionEvent.offsetLocation(rect22.left, rect22.top);
                                    return zOnTouchEvent;
                                }
                                Rect rect32 = this.padding;
                                motionEvent.offsetLocation(rect32.left, rect32.top);
                                return false;
                            }
                        }
                    }
                }
                return true;
            } finally {
                Rect rect4 = this.padding;
                motionEvent.offsetLocation(rect4.left, rect4.top);
            }
        }

        private void settle(float r6) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichSlideshowBlock.settle(float):void");
        }

        public void lambda$settle$0(ValueAnimator valueAnimator) {
            this.pageOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        public int getCurrentPage() {
            return this.currentPage;
        }

        public void setCurrentPage(int i) {
            int iMax = Math.max(0, Math.min(i, this.cells.size() - 1));
            ValueAnimator valueAnimator = this.settleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.settleAnimator = null;
            }
            if (this.currentPage == iMax && this.pageOffset == 0.0f) {
                return;
            }
            this.currentPage = iMax;
            this.pageOffset = 0.0f;
            this.dragging = false;
            this.verticalDragging = false;
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override
        public boolean isHorizontallyDragging() {
            ValueAnimator valueAnimator;
            return this.dragging || ((valueAnimator = this.settleAnimator) != null && valueAnimator.isRunning());
        }

        @Override
        protected void onAttachedToWindow() {
            Iterator<MediaCell> it = this.cells.iterator();
            while (it.hasNext()) {
                it.next().attach(this.view);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            requestDisallowParentIntercept(false);
            this.dragging = false;
            this.verticalDragging = false;
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
            Iterator<MediaCell> it = this.cells.iterator();
            while (it.hasNext()) {
                it.next().detach();
            }
        }
    }

    public static org.telegram.messenger.MessageObject.GroupedMessagePosition[] computeGrouped(float[] r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.computeGrouped(float[]):org.telegram.messenger.MessageObject$GroupedMessagePosition[]");
    }

    private static float multiHeight(float[] fArr, int i, int i2, int i3) {
        float f = 0.0f;
        while (i < i2) {
            f += fArr[i];
            i++;
        }
        return i3 / Math.max(1.0E-4f, f);
    }

    public static abstract class RichBlock implements MultiLayoutTypingAnimator.Block {
        public int accessibilityLabelResId;
        public int accessibilityParentLabelResId;
        private CheckBoxBase checkbox;
        private ButtonBounce checkboxBounce;
        private TLObject checkboxItem;
        private boolean checkboxPressed;
        private float checkboxY;
        public int currH;
        public float currY;
        protected int layoutRow;
        protected int layoutX;
        protected int layoutY;
        public boolean listCheckbox;
        public boolean listChecked;
        public int listLevel;
        private int listMarkerWidth;
        public boolean listOrdered;
        public final int maxWidth;
        private StaticLayout numLayout;
        private int numLayoutLeft;
        private int numLayoutRight;
        private float numLayoutY;
        public final Rect padding;
        public RichDetailsBlock parentDetails;
        public int prevH;
        public float prevY;
        public final RichMessageLayout root;
        public MultiLayoutTypingAnimator typingAnimator;
        protected View view;
        private final RectF checkboxHit = new RectF();
        public boolean currVisible = true;
        public boolean prevVisible = true;

        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
        }

        public float getBackgroundScale() {
            return 1.0f;
        }

        protected int getBlockAccessibilityElementCount() {
            return 0;
        }

        protected CharSequence getBlockAccessibilityElementStateDescription(int i) {
            return null;
        }

        protected CharSequence getBlockAccessibilityElementText(int i) {
            return null;
        }

        protected int getContentPaddingTop() {
            return 0;
        }

        public int getHeight() {
            return 0;
        }

        @Override
        public Layout getLayout() {
            return null;
        }

        @Override
        public View getParentView() {
            return null;
        }

        protected TextSelectionHelper.TextLayoutBlock[] getText() {
            return null;
        }

        protected boolean isBlockAccessibilityElementText(int i) {
            return false;
        }

        public boolean isHorizontallyDragging() {
            return false;
        }

        protected void onAttachedToWindow() {
        }

        protected boolean onBlockAccessibilityElementClick(int i, View view) {
            return false;
        }

        protected void onDetachedFromWindow() {
        }

        protected void onDraw(Canvas canvas) {
        }

        protected boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public CharSequence getAccessibilityLabel() {
            int i = this.accessibilityParentLabelResId;
            String string = i == 0 ? null : LocaleController.getString(i);
            int i2 = this.accessibilityLabelResId;
            String string2 = i2 != 0 ? LocaleController.getString(i2) : null;
            return TextUtils.isEmpty(string) ? string2 : TextUtils.isEmpty(string2) ? string : TextUtils.concat(string, ", ", string2);
        }

        public CharSequence getAccessibilityListMarker() {
            StaticLayout staticLayout;
            if (!this.listOrdered || (staticLayout = this.numLayout) == null) {
                return null;
            }
            return staticLayout.getText();
        }

        public RichBlock(RichMessageLayout richMessageLayout, Rect rect, int i) {
            this.root = richMessageLayout;
            this.padding = new Rect(rect);
            this.maxWidth = (i - rect.left) - rect.right;
        }

        public boolean isVisible() {
            RichDetailsBlock richDetailsBlock = this.parentDetails;
            if (richDetailsBlock == null) {
                return true;
            }
            if (richDetailsBlock.isOpen()) {
                return this.parentDetails.isVisible();
            }
            return false;
        }

        public boolean isInQuote() {
            int iIndexOf;
            if (this.root.quotes.isEmpty() || (iIndexOf = this.root.blocks.indexOf(this)) < 0) {
                return false;
            }
            for (int i = 0; i < this.root.quotes.size(); i++) {
                QuoteBackground quoteBackground = this.root.quotes.get(i);
                if (iIndexOf >= quoteBackground.startBlockIndex && iIndexOf <= quoteBackground.endBlockIndex) {
                    return true;
                }
            }
            return false;
        }

        protected static void appendText(SpannableStringBuilder spannableStringBuilder, Text text, Text[] textArr) {
            StaticLayout staticLayout;
            StaticLayout staticLayout2;
            if (text != null && (staticLayout2 = text.layout) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
                spannableStringBuilder.append(withReplacements(text.layout.getText()));
                return;
            }
            if (textArr != null) {
                for (Text text2 : textArr) {
                    if (text2 != null && (staticLayout = text2.layout) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append(withReplacements(text2.layout.getText()));
                    }
                }
            }
        }

        protected static CharSequence withReplacements(CharSequence charSequence) {
            if (!(charSequence instanceof Spanned)) {
                return charSequence;
            }
            final Spanned spanned = (Spanned) charSequence;
            TextSelectionHelper.ReplaceCopyTextSpannable[] replaceCopyTextSpannableArr = (TextSelectionHelper.ReplaceCopyTextSpannable[]) spanned.getSpans(0, spanned.length(), TextSelectionHelper.ReplaceCopyTextSpannable.class);
            if (replaceCopyTextSpannableArr == null || replaceCopyTextSpannableArr.length == 0) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Arrays.sort(replaceCopyTextSpannableArr, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return RichMessageLayout.RichBlock.lambda$withReplacements$0(spanned, (TextSelectionHelper.ReplaceCopyTextSpannable) obj, (TextSelectionHelper.ReplaceCopyTextSpannable) obj2);
                }
            });
            for (TextSelectionHelper.ReplaceCopyTextSpannable replaceCopyTextSpannable : replaceCopyTextSpannableArr) {
                int spanStart = spanned.getSpanStart(replaceCopyTextSpannable);
                int spanEnd = spanned.getSpanEnd(replaceCopyTextSpannable);
                if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                    CharSequence charSequence2 = replaceCopyTextSpannable.replacement;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                    spannableStringBuilder.replace(spanStart, spanEnd, charSequence2);
                }
            }
            return spannableStringBuilder;
        }

        public static int lambda$withReplacements$0(Spanned spanned, TextSelectionHelper.ReplaceCopyTextSpannable replaceCopyTextSpannable, TextSelectionHelper.ReplaceCopyTextSpannable replaceCopyTextSpannable2) {
            return spanned.getSpanStart(replaceCopyTextSpannable2) - spanned.getSpanStart(replaceCopyTextSpannable);
        }

        public final int getAccessibilityElementCount() {
            return getCheckboxAccessibilityElementCount() + getBlockAccessibilityElementCount();
        }

        public final CharSequence getAccessibilityElementText(int i) {
            if (this.checkbox != null && i == 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                CharSequence accessibilityListMarker = getAccessibilityListMarker();
                CharSequence accessibilityLabel = getAccessibilityLabel();
                if (!TextUtils.isEmpty(accessibilityListMarker)) {
                    spannableStringBuilder.append(accessibilityListMarker).append(' ');
                }
                if (!TextUtils.isEmpty(accessibilityLabel)) {
                    spannableStringBuilder.append(accessibilityLabel).append(", ");
                }
                appendAccessibilityText(spannableStringBuilder);
                return spannableStringBuilder.length() > 0 ? spannableStringBuilder : LocaleController.getString(R.string.AccDescrCheckbox);
            }
            return getBlockAccessibilityElementText(i - getCheckboxAccessibilityElementCount());
        }

        public final boolean isAccessibilityElementCheckbox(int i) {
            return this.checkbox != null && i == 0;
        }

        public final boolean isAccessibilityElementChecked(int i) {
            return isAccessibilityElementCheckbox(i) && getCheckboxChecked();
        }

        public final boolean isAccessibilityElementClickable(int i) {
            return !isAccessibilityElementCheckbox(i) || canToggleCheckbox();
        }

        public final boolean isAccessibilityElementText(int i) {
            return !isAccessibilityElementCheckbox(i) && isBlockAccessibilityElementText(i - getCheckboxAccessibilityElementCount());
        }

        public final CharSequence getAccessibilityElementStateDescription(int i) {
            if (isAccessibilityElementCheckbox(i)) {
                return LocaleController.getString(getCheckboxChecked() ? R.string.AccDescrChecked : R.string.AccDescrNotChecked);
            }
            return getBlockAccessibilityElementStateDescription(i - getCheckboxAccessibilityElementCount());
        }

        public final void getAccessibilityElementBounds(int i, Rect rect) {
            if (this.checkbox != null && i == 0) {
                int i2 = this.padding.left;
                float f = this.currY;
                rect.set(i2, (int) f, this.maxWidth + i2, (int) (f + getHeight()));
            } else {
                getBlockAccessibilityElementBounds(i - getCheckboxAccessibilityElementCount(), rect);
            }
            RichMessageLayout richMessageLayout = this.root;
            int i3 = -richMessageLayout.padLeft;
            int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            int iMin = Math.min(minWidth, Math.max(rect.left, i3));
            rect.left = iMin;
            rect.right = Math.max(iMin, Math.min(rect.right, minWidth));
        }

        protected void getBlockAccessibilityElementBounds(int i, Rect rect) {
            int i2 = this.padding.left;
            float f = this.currY;
            rect.set(i2, (int) f, this.maxWidth + i2, (int) (f + getHeight()));
        }

        public final boolean onAccessibilityElementClick(int i, View view) {
            if (this.checkbox != null && i == 0) {
                if (!canToggleCheckbox()) {
                    return false;
                }
                toggleCheckbox();
                return true;
            }
            return onBlockAccessibilityElementClick(i - getCheckboxAccessibilityElementCount(), view);
        }

        private int getCheckboxAccessibilityElementCount() {
            return this.checkbox == null ? 0 : 1;
        }

        public void snapshot() {
            this.prevY = this.currY;
            this.prevH = this.currH;
            this.prevVisible = this.currVisible;
        }

        public void setNum(String str) {
            String str2;
            this.root.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
            Layout layout = getLayout();
            CharSequence text = layout == null ? null : layout.getText();
            if (TextUtils.isEmpty(str) || !(text instanceof Spanned) || text.length() <= 0) {
                str2 = str;
            } else {
                for (StyleSpan styleSpan : (StyleSpan[]) ((Spanned) text).getSpans(0, 1, StyleSpan.class)) {
                    if (TLObject.hasFlag(styleSpan.flags, 16)) {
                        SpannableString spannableString = new SpannableString(str);
                        spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 33);
                        str2 = spannableString;
                        break;
                    }
                }
                str2 = str;
            }
            int iMax = this.listMarkerWidth;
            if (iMax <= 0) {
                iMax = Math.max(this.root.isRtl() ? this.padding.right : this.padding.left, AndroidUtilities.dp(this.root.fontSize + 4));
            }
            int i = iMax;
            RichMessageLayout richMessageLayout = this.root;
            this.numLayout = new StaticLayout(str2, richMessageLayout.numTextPaint, i, richMessageLayout.isRtl() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
            this.numLayoutLeft = AndroidUtilities.dp(this.root.fontSize + 4);
            this.numLayoutRight = 0;
            for (int i2 = 0; i2 < this.numLayout.getLineCount(); i2++) {
                this.numLayoutLeft = Math.min(this.numLayoutLeft, (int) this.numLayout.getLineLeft(i2));
                this.numLayoutRight = Math.max(this.numLayoutRight, (int) this.numLayout.getLineRight(i2));
            }
            updateListMarkerY();
        }

        public void setListMarkerWidth(int i) {
            this.listMarkerWidth = i;
        }

        protected final void updateListMarkerY() {
            if (this.numLayout != null) {
                if (getLayout() == null || getLayout().getLineCount() <= 0 || this.numLayout.getLineCount() <= 0) {
                    int iDp = AndroidUtilities.dp(this.root.fontSize + 14);
                    int height = getHeight();
                    Rect rect = this.padding;
                    this.numLayoutY = (Math.min(iDp, (height - rect.top) - rect.bottom) - this.numLayout.getHeight()) / 2.0f;
                } else {
                    this.numLayoutY = (getContentPaddingTop() + getLayout().getLineBaseline(0)) - this.numLayout.getLineBaseline(0);
                }
            }
            if (this.checkbox != null) {
                if (getLayout() == null || getLayout().getLineCount() <= 0) {
                    int iDp2 = AndroidUtilities.dp(this.root.fontSize + 14);
                    int height2 = getHeight();
                    Rect rect2 = this.padding;
                    this.checkboxY = (Math.min(iDp2, (height2 - rect2.top) - rect2.bottom) - AndroidUtilities.dp(20.0f)) / 2.0f;
                    return;
                }
                this.checkboxY = (getContentPaddingTop() + getLayout().getLineBaseline(0)) - (AndroidUtilities.dp(20.0f) * 0.7f);
            }
        }

        public void setCheckbox(boolean z) {
            setCheckbox(z, null);
        }

        public void setCheckbox(boolean z, TLObject tLObject) {
            this.checkboxItem = tLObject;
            if (this.checkbox == null) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(null, 20, this.root.resourcesProvider);
                this.checkbox = checkBoxBase;
                checkBoxBase.setColor(Theme.key_telegram_color, Theme.key_dialogCheckboxSquareDisabled, Theme.key_checkboxCheck);
                this.checkbox.setBackgroundType(10);
                this.checkbox.setDrawUnchecked(true);
                this.checkbox.setCustomRadius(AndroidUtilities.dp(5.0f));
            }
            this.checkbox.setChecked(z, false);
            updateListMarkerY();
        }

        public void draw(Canvas canvas) {
            draw(canvas, Integer.MIN_VALUE, 0.0f);
        }

        public void draw(Canvas canvas, int i, float f) {
            float fDpf2;
            canvas.save();
            Rect rect = this.padding;
            canvas.translate(rect.left, rect.top);
            boolean zIsRtl = this.root.isRtl();
            int minWidth = (this.root.getMinWidth() + this.root.padRight) - AndroidUtilities.dp(14.0f);
            Rect rect2 = this.padding;
            float f2 = (minWidth - rect2.right) - rect2.left;
            if (this.numLayout != null) {
                this.root.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                RichMessageLayout richMessageLayout = this.root;
                richMessageLayout.numTextPaint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_messageTextOut : Theme.key_chat_messageTextIn));
                canvas.save();
                if (!this.listOrdered && !this.listCheckbox) {
                    float fDpf22 = AndroidUtilities.dpf2(4.3f);
                    if (zIsRtl) {
                        fDpf2 = ((AndroidUtilities.dp(18.0f) + f2) - AndroidUtilities.dpf2(5.66f)) - (fDpf22 / 2.0f);
                    } else {
                        fDpf2 = (AndroidUtilities.dpf2(5.66f) + (fDpf22 / 2.0f)) - AndroidUtilities.dp(18.0f);
                    }
                    canvas.drawCircle(fDpf2, (this.numLayoutY + this.numLayout.getLineBaseline(0)) - (AndroidUtilities.dp(SharedConfig.fontSize) * 0.35f), fDpf22 / 2.0f, this.root.numTextPaint);
                } else if (zIsRtl) {
                    canvas.translate(((AndroidUtilities.dp(6.0f) + f2) - this.numLayoutLeft) + (this.checkbox != null ? AndroidUtilities.dp(26.0f) : 0), this.numLayoutY);
                    this.numLayout.draw(canvas);
                } else {
                    canvas.translate((AndroidUtilities.dp(6.0f) - this.listMarkerWidth) - this.numLayoutLeft, this.numLayoutY);
                    this.numLayout.draw(canvas);
                }
                canvas.restore();
            }
            if (this.checkbox != null) {
                int iDp = zIsRtl ? (int) (f2 + AndroidUtilities.dp(6.0f)) : -AndroidUtilities.dp(26.0f);
                this.checkboxHit.set(iDp - AndroidUtilities.dp(6.0f), this.checkboxY - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(20.0f) + iDp + AndroidUtilities.dp(6.0f), this.checkboxY + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(6.0f));
                if (this.root.view != null && this.checkbox.getParentView() == null) {
                    this.checkbox.setParentView(this.root.view);
                }
                ButtonBounce buttonBounce = this.checkboxBounce;
                float scale = buttonBounce != null ? buttonBounce.getScale(0.1f) : 1.0f;
                canvas.save();
                canvas.scale(scale, scale, AndroidUtilities.dp(10.0f) + iDp, this.checkboxY + AndroidUtilities.dp(10.0f));
                this.checkbox.setBounds(iDp, (int) this.checkboxY, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.checkbox.draw(canvas);
                canvas.restore();
            }
            if (i == Integer.MIN_VALUE) {
                onDraw(canvas);
            } else {
                onDrawFaded(canvas, i, f);
            }
            canvas.restore();
        }

        public boolean touchEvent(MotionEvent motionEvent) {
            View view;
            Rect rect = this.padding;
            motionEvent.offsetLocation(-rect.left, -rect.top);
            try {
                if (this.checkbox != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    boolean zContains = this.checkboxHit.contains(motionEvent.getX(), motionEvent.getY());
                    if (actionMasked == 0) {
                        if (zContains && canToggleCheckbox()) {
                            this.checkboxPressed = true;
                            if (this.checkboxBounce == null && (view = this.root.view) != null) {
                                this.checkboxBounce = new ButtonBounce(view);
                            }
                            ButtonBounce buttonBounce = this.checkboxBounce;
                            if (buttonBounce != null) {
                                buttonBounce.setPressed(true);
                            }
                            invalidateCell();
                            Rect rect2 = this.padding;
                            motionEvent.offsetLocation(rect2.left, rect2.top);
                            return true;
                        }
                    } else if (this.checkboxPressed) {
                        if (actionMasked == 2) {
                            if (!zContains) {
                                this.checkboxPressed = false;
                                ButtonBounce buttonBounce2 = this.checkboxBounce;
                                if (buttonBounce2 != null) {
                                    buttonBounce2.setPressed(false);
                                }
                            }
                        } else if (actionMasked == 1 || actionMasked == 3) {
                            boolean z = actionMasked == 1 && zContains;
                            this.checkboxPressed = false;
                            ButtonBounce buttonBounce3 = this.checkboxBounce;
                            if (buttonBounce3 != null) {
                                buttonBounce3.setPressed(false);
                            }
                            if (z) {
                                toggleCheckbox();
                            }
                            invalidateCell();
                        }
                        Rect rect22 = this.padding;
                        motionEvent.offsetLocation(rect22.left, rect22.top);
                        return true;
                    }
                }
                boolean zOnTouchEvent = onTouchEvent(motionEvent);
                Rect rect3 = this.padding;
                motionEvent.offsetLocation(rect3.left, rect3.top);
                return zOnTouchEvent;
            } catch (Throwable th) {
                Rect rect4 = this.padding;
                motionEvent.offsetLocation(rect4.left, rect4.top);
                throw th;
            }
        }

        private void invalidateCell() {
            View view = this.root.view;
            if (view != null) {
                view.invalidate();
            }
        }

        private boolean getCheckboxChecked() {
            TLObject tLObject = this.checkboxItem;
            if (tLObject instanceof TL_iv.PageListItem) {
                return ((TL_iv.PageListItem) tLObject).checked;
            }
            if (tLObject instanceof TL_iv.PageListOrderedItem) {
                return ((TL_iv.PageListOrderedItem) tLObject).checked;
            }
            CheckBoxBase checkBoxBase = this.checkbox;
            return checkBoxBase != null && checkBoxBase.isChecked();
        }

        private void setCheckboxChecked(boolean z) {
            TLObject tLObject = this.checkboxItem;
            if (tLObject instanceof TL_iv.PageListItem) {
                ((TL_iv.PageListItem) tLObject).checked = z;
            } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                ((TL_iv.PageListOrderedItem) tLObject).checked = z;
            }
        }

        private boolean canToggleCheckbox() {
            return (this.checkbox == null || this.checkboxItem == null || this.root.getCell() == null || this.root.getDelegate() == null || !this.root.getDelegate().canToggleRichMessageCheckbox(this.root.getCell())) ? false : true;
        }

        private void toggleCheckbox() {
            if (canToggleCheckbox()) {
                if (!MessagesController.getInstance(this.root.currentAccount).richEditorAllowed()) {
                    new PremiumFeatureBottomSheet(this.root.cell.getContext(), 43, true, this.root.resourcesProvider).show();
                    return;
                }
                final boolean z = !getCheckboxChecked();
                setCheckboxChecked(z);
                View view = this.root.view;
                if (view != null) {
                    this.checkbox.setParentView(view);
                }
                this.checkbox.setChecked(z, true);
                invalidateCell();
                View view2 = this.root.view;
                if (view2 != null) {
                    view2.performHapticFeedback(3, 2);
                }
                this.root.getDelegate().didToggleRichMessageCheckbox(this.root.getCell(), z, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$toggleCheckbox$1(z);
                    }
                });
            }
        }

        public void lambda$toggleCheckbox$1(boolean z) {
            boolean z2 = !z;
            setCheckboxChecked(z2);
            View view = this.root.view;
            if (view != null) {
                this.checkbox.setParentView(view);
            }
            this.checkbox.setChecked(z2, true);
            invalidateCell();
        }

        public boolean isPressingLink() {
            TextSelectionHelper.TextLayoutBlock[] text = getText();
            if (text == null) {
                return false;
            }
            for (TextSelectionHelper.TextLayoutBlock textLayoutBlock : text) {
                if ((textLayoutBlock instanceof Text) && ((Text) textLayoutBlock).isPressingLink()) {
                    return true;
                }
            }
            return false;
        }

        public boolean findLink(CharacterStyle characterStyle, int i, FoundLink foundLink) {
            TextSelectionHelper.TextLayoutBlock[] text = getText();
            if (text == null) {
                return false;
            }
            for (TextSelectionHelper.TextLayoutBlock textLayoutBlock : text) {
                if (textLayoutBlock instanceof Text) {
                    if (((Text) textLayoutBlock).fillFoundLink(characterStyle, foundLink)) {
                        Rect rect = this.padding;
                        foundLink.x = rect.left - r4.left;
                        foundLink.y = i + rect.top;
                        return true;
                    }
                }
            }
            return false;
        }

        protected void requestDisallowParentIntercept(boolean z) {
            View view = this.view;
            if (view == null) {
                return;
            }
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(z);
            }
        }

        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.maxWidth + rect.right;
        }

        public int getLastLineWidth() {
            return getMinWidth();
        }

        public boolean forcesTimeToNewLine() {
            return getLastLineWidth() >= getMinWidth();
        }

        protected void onDrawFaded(Canvas canvas, int i, float f) {
            onDraw(canvas);
        }

        public boolean drawOverlay(Canvas canvas) {
            return drawOverlay(canvas, null);
        }

        public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
            Text text;
            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans;
            TextSelectionHelper.TextLayoutBlock[] text2 = getText();
            if (text2 == null) {
                return false;
            }
            boolean z = false;
            for (TextSelectionHelper.TextLayoutBlock textLayoutBlock : text2) {
                if ((textLayoutBlock instanceof Text) && (emojiGroupedSpans = (text = (Text) textLayoutBlock).animatedEmojiStack) != null && !emojiGroupedSpans.holders.isEmpty()) {
                    canvas.save();
                    canvas.translate(text.x, text.y - this.currY);
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, text.layout, text.animatedEmojiStack, 0.0f, text.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                    canvas.restore();
                    z = true;
                }
            }
            return z;
        }

        protected void placeTexts(int i, int i2, int i3) {
            this.layoutX = i;
            this.layoutY = i2;
            this.layoutRow = i3;
            TextSelectionHelper.TextLayoutBlock[] text = getText();
            if (text == null) {
                return;
            }
            for (TextSelectionHelper.TextLayoutBlock textLayoutBlock : text) {
                if (textLayoutBlock instanceof Text) {
                    Text text2 = (Text) textLayoutBlock;
                    text2.setX(i - text2.left);
                    text2.setY(i2);
                    text2.setRow(i3);
                }
            }
        }

        public void collectAnimatorBlocks(List<MultiLayoutTypingAnimator.Block> list) {
            list.add(this);
        }

        public void drawWithTyping(Canvas canvas) {
            MultiLayoutTypingAnimator multiLayoutTypingAnimator = this.typingAnimator;
            if (multiLayoutTypingAnimator != null && multiLayoutTypingAnimator.isRunning() && multiLayoutTypingAnimator.indexOf(this) >= 0) {
                if (!multiLayoutTypingAnimator.needDraw(this)) {
                    return;
                }
                if (multiLayoutTypingAnimator.isFadeBlock(this)) {
                    draw(canvas, multiLayoutTypingAnimator.getFadeLineIndex(this), multiLayoutTypingAnimator.getFadeXPosition(this));
                    return;
                }
                float blockAlpha = multiLayoutTypingAnimator.getBlockAlpha(this);
                if (blockAlpha <= 0.0f) {
                    return;
                }
                if (blockAlpha < 1.0f) {
                    Rect rect = this.padding;
                    int iSaveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.maxWidth + rect.right, getHeight(), (int) (blockAlpha * 255.0f));
                    draw(canvas);
                    canvas.restoreToCount(iSaveLayerAlpha);
                    return;
                }
            }
            draw(canvas);
        }

        public void attach(View view) {
            View view2 = this.view;
            if (view2 == view) {
                return;
            }
            if (view2 != null) {
                onDetachedFromWindow();
                CheckBoxBase checkBoxBase = this.checkbox;
                if (checkBoxBase != null) {
                    checkBoxBase.onDetachedFromWindow();
                }
                this.view = null;
            }
            this.view = view;
            CheckBoxBase checkBoxBase2 = this.checkbox;
            if (checkBoxBase2 != null) {
                checkBoxBase2.setParentView(view);
                this.checkbox.onAttachedToWindow();
            }
            onAttachedToWindow();
        }

        public void detach(View view) {
            View view2 = this.view;
            if (view2 != null && view2 == view) {
                onDetachedFromWindow();
                CheckBoxBase checkBoxBase = this.checkbox;
                if (checkBoxBase != null) {
                    checkBoxBase.onDetachedFromWindow();
                }
                this.view = null;
            }
        }

        public boolean isAttachedToWindow() {
            return this.view != null;
        }
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public Drawable getThemedDrawable(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Drawable drawable = resourcesProvider != null ? resourcesProvider.getDrawable(str) : null;
        return drawable != null ? drawable : Theme.getThemeDrawable(str);
    }

    public static class PreviewView extends View implements TextSelectionHelper.ArticleSelectableView {
        private boolean allowActions;
        private final int currentAccount;
        private int insetBottom;
        private int insetLeft;
        private int insetRight;
        private int insetTop;
        private RichMessageLayout layout;
        private int maxHeight;
        private MessageObject messageObject;
        private int minHeight;
        private Theme.ResourcesProvider resourcesProvider;
        private TL_iv.RichMessage richMessage;
        private TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
        private Runnable textSelectionLongPressRunnable;
        private boolean translationLoading;

        public PreviewView(Context context) {
            this(context, UserConfig.selectedAccount, null);
        }

        public PreviewView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.minHeight = -1;
            this.maxHeight = -1;
            this.allowActions = true;
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            NotificationCenter.listenEmojiLoading(this);
        }

        public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
            this.resourcesProvider = resourcesProvider;
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.setResourcesProvider(resourcesProvider);
            }
        }

        @Override
        public void setPadding(int i, int i2, int i3, int i4) {
            if (this.insetLeft == i && this.insetTop == i2 && this.insetRight == i3 && this.insetBottom == i4) {
                return;
            }
            this.insetLeft = i;
            this.insetTop = i2;
            this.insetRight = i3;
            this.insetBottom = i4;
            requestLayout();
            invalidate();
        }

        public void setTranslationLoading(boolean z) {
            this.translationLoading = z;
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.forceTranslationLoading = z;
            }
            invalidate();
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            if (this.layout != null) {
                int i = this.insetLeft;
                int i2 = this.insetTop;
                for (int i3 = 0; i3 < this.layout.textBlocks.size(); i3++) {
                    arrayList.add(new PaddedTextLayoutBlock(this.layout.textBlocks.get(i3), i, i2));
                }
            }
        }

        public void setTextSelectionHelper(TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper) {
            this.textSelectionHelper = articleTextSelectionHelper;
        }

        public void set(TL_iv.RichMessage richMessage) {
            if (this.richMessage == richMessage) {
                return;
            }
            this.richMessage = richMessage;
            if (this.messageObject == null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                this.messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
            }
            this.messageObject.messageOwner.rich_message = richMessage;
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.detach(this);
            }
            this.layout = null;
            requestLayout();
            invalidate();
        }

        private void buildLayout(int i) {
            TL_iv.RichMessage richMessage;
            if (i <= 0 || (richMessage = this.richMessage) == null) {
                this.layout = null;
                return;
            }
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout == null || richMessageLayout.needsUpdate(richMessage, i)) {
                RichMessageLayout richMessageLayout2 = this.layout;
                if (richMessageLayout2 != null) {
                    richMessageLayout2.detach(this);
                }
                RichMessageLayout richMessageLayout3 = new RichMessageLayout(this.messageObject, i, null);
                this.layout = richMessageLayout3;
                richMessageLayout3.forceTranslationLoading = this.translationLoading;
                richMessageLayout3.setResourcesProvider(this.resourcesProvider);
                RichMessageLayout richMessageLayout4 = this.layout;
                richMessageLayout4.invalidateAnimatedEmojiInParent = true;
                richMessageLayout4.checkQuoteLine(null, null);
                if (isAttachedToWindow()) {
                    this.layout.attach(this);
                    this.layout.updateAnimatedEmojis(0);
                }
            }
        }

        public void setMinHeight(int i) {
            this.minHeight = i;
        }

        public void setMaxHeight(int i) {
            this.maxHeight = i;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            buildLayout((size - this.insetLeft) - this.insetRight);
            RichMessageLayout richMessageLayout = this.layout;
            int height = (richMessageLayout != null ? richMessageLayout.getHeight() : 0) + this.insetTop + this.insetBottom;
            int i3 = this.maxHeight;
            if (i3 > 0 && height > i3) {
                height = i3;
            }
            int i4 = this.minHeight;
            if (i4 > 0 && height < i4) {
                height = i4;
            }
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE) {
                height = Math.min(height, View.MeasureSpec.getSize(i2));
            } else if (mode == 1073741824) {
                height = View.MeasureSpec.getSize(i2);
            }
            setMeasuredDimension(size, height);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.layout == null) {
                return;
            }
            float height = (getHeight() - this.insetTop) - this.insetBottom;
            boolean z = this.layout.getHeight() > (getHeight() - this.insetTop) - this.insetBottom;
            canvas.save();
            if (z) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            canvas.translate(this.insetLeft, this.insetTop);
            this.layout.draw(canvas, this.insetLeft, Math.max(0, (getWidth() - this.layout.getMinWidth()) - this.insetLeft), null, 0.0f, height);
            if (this.layout.hasOverlay()) {
                this.layout.drawOverlay(canvas, null);
            }
            if (z) {
                canvas.translate(-this.insetLeft, -this.insetTop);
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, getHeight() - AndroidUtilities.dp(24.0f), getWidth(), getHeight());
                this.layout.clip.draw(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
            if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
                return;
            }
            int i = this.insetLeft;
            int i2 = this.insetTop;
            for (int i3 = 0; i3 < this.layout.textBlocks.size(); i3++) {
                TextSelectionHelper.TextLayoutBlock textLayoutBlock = this.layout.textBlocks.get(i3);
                canvas.save();
                canvas.translate(textLayoutBlock.getX() + i, textLayoutBlock.getY() + i2);
                this.textSelectionHelper.draw(canvas, this, i3);
                canvas.restore();
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.attach(this);
                this.layout.updateAnimatedEmojis(0);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.detach(this);
            }
        }

        public void setAllowActions(boolean z) {
            this.allowActions = z;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            Runnable runnable;
            if (!this.allowActions) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.textSelectionHelper != null) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.textSelectionHelper.setMaybeView((int) motionEvent.getX(), (int) motionEvent.getY(), this);
                    if (this.textSelectionLongPressRunnable == null) {
                        this.textSelectionLongPressRunnable = new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onTouchEvent$0();
                            }
                        };
                    }
                    removeCallbacks(this.textSelectionLongPressRunnable);
                    postDelayed(this.textSelectionLongPressRunnable, ViewConfiguration.getLongPressTimeout());
                } else if ((action == 1 || action == 2 || action == 3) && (runnable = this.textSelectionLongPressRunnable) != null) {
                    removeCallbacks(runnable);
                }
            }
            if (this.layout != null) {
                motionEvent.offsetLocation(-this.insetLeft, -this.insetTop);
                boolean zOnTouchEvent = this.layout.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(this.insetLeft, this.insetTop);
                if (zOnTouchEvent) {
                    return true;
                }
            }
            return super.onTouchEvent(motionEvent);
        }

        public void lambda$onTouchEvent$0() {
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout == null || !richMessageLayout.isPressingLink()) {
                this.textSelectionHelper.trySelect(this);
            }
        }

        public static final class Factory extends UItem.UItemFactory {
            @Override
            public boolean isClickable() {
                return false;
            }

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public PreviewView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                PreviewView previewView = new PreviewView(context, i, resourcesProvider);
                previewView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
                return previewView;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                PreviewView previewView = (PreviewView) view;
                previewView.set((TL_iv.RichMessage) uItem.object);
                previewView.setTranslationLoading(uItem.checked);
            }

            @Override
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id;
            }

            @Override
            public boolean contentsEquals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id && uItem.object == uItem2.object && uItem.checked == uItem2.checked;
            }

            public static UItem of(TL_iv.RichMessage richMessage) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = richMessage;
                return uItemOfFactory;
            }
        }

        private static class PaddedTextLayoutBlock implements TextSelectionHelper.TextLayoutBlock {
            private final TextSelectionHelper.TextLayoutBlock inner;
            private final int px;
            private final int py;

            @Override
            public Rect getSelectionBounds() {
                return TextSelectionHelper.TextLayoutBlock.CC.$default$getSelectionBounds(this);
            }

            PaddedTextLayoutBlock(TextSelectionHelper.TextLayoutBlock textLayoutBlock, int i, int i2) {
                this.inner = textLayoutBlock;
                this.px = i;
                this.py = i2;
            }

            @Override
            public Layout getLayout() {
                return this.inner.getLayout();
            }

            @Override
            public int getX() {
                return this.inner.getX() + this.px;
            }

            @Override
            public int getY() {
                return this.inner.getY() + this.py;
            }

            @Override
            public int getRow() {
                return this.inner.getRow();
            }

            @Override
            public CharSequence getPrefix() {
                return this.inner.getPrefix();
            }

            @Override
            public CharSequence getText() {
                return this.inner.getText();
            }
        }
    }
}
