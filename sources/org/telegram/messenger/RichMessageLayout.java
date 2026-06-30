package org.telegram.messenger;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
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
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.ToIntFunction;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
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
import org.telegram.ui.Components.FormattedDateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ReplyMessageLine;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Components.TableLayout;
import org.telegram.ui.Components.TextPaintImageReceiverSpan;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.URLSpanBotCommand;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.GradientClip;
import org.telegram.ui.MultiLayoutTypingAnimator;
import org.telegram.ui.web.WebInstantView;
import ru.noties.jlatexmath.JLatexMathDrawable;

public class RichMessageLayout {
    public static final int PART_MAX_HEIGHT_DP = 900;
    public static final int TEXT_FLAG_BLOCKS = 15;
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
    private AnimatedFloat translationLoadingFloat;
    public float translationLoadingValue;
    public MultiLayoutTypingAnimator typingAnimator;
    public View view;
    public final ArrayList<RichBlock> blocks = new ArrayList<>();
    public final ArrayList<QuoteBackground> quotes = new ArrayList<>();
    public final HashMap<String, Integer> anchors = new HashMap<>();
    public final HashMap<String, TL_iv.textAnchor> textAnchors = new HashMap<>();
    public final ArrayList<MessageObject> audioMessages = new ArrayList<>();
    public final HashMap<TL_iv.pageBlockAudio, MessageObject> audioBlocks = new HashMap<>();
    public final ArrayList<TextSelectionHelper.TextLayoutBlock> textBlocks = new ArrayList<>();
    public final ArrayList<Integer> textBlockCharOffsets = new ArrayList<>();
    public CharSequence joinedText = "";
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

    private static int setBlockFlags(int i, int i2) {
        return i2 == 0 ? i : (i & (-16)) | i2;
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

    public void setChatMessageCellDelegate(ChatMessageCell chatMessageCell, ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate) {
        this.cell = chatMessageCell;
        this.delegate = chatMessageCellDelegate;
    }

    public int getGap() {
        return AndroidUtilities.dp(3.0f);
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
        this.blocks.clear();
        this.quotes.clear();
        this.anchors.clear();
        this.textAnchors.clear();
        this.audioMessages.clear();
        this.audioBlocks.clear();
        this.textBlocks.clear();
        this.textBlockCharOffsets.clear();
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
            emitBlock(this.richMessage.blocks.get(i2), 0, new Rect(), 0);
        }
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
        StringBuilder sb = new StringBuilder();
        int height = 0;
        boolean z = false;
        for (int i = 0; i < this.blocks.size(); i++) {
            RichBlock richBlock = this.blocks.get(i);
            this.minWidth = Math.max(this.minWidth, richBlock.getMinWidth());
            boolean zIsVisible = richBlock.isVisible();
            if (zIsVisible && z) {
                height += getGap();
            }
            richBlock.currY = height;
            richBlock.currVisible = zIsVisible;
            Rect rect = richBlock.padding;
            richBlock.placeTexts(rect.left, rect.top + height, i);
            if (zIsVisible) {
                TextSelectionHelper.TextLayoutBlock[] text = richBlock.getText();
                if (text != null) {
                    for (TextSelectionHelper.TextLayoutBlock textLayoutBlock : text) {
                        if (textLayoutBlock != null && textLayoutBlock.getLayout() != null) {
                            if (sb.length() > 0) {
                                sb.append('\n');
                            }
                            this.textBlockCharOffsets.add(Integer.valueOf(sb.length()));
                            this.textBlocks.add(textLayoutBlock);
                            CharSequence text2 = textLayoutBlock.getLayout().getText();
                            if (text2 != null) {
                                sb.append(text2);
                            }
                        }
                    }
                }
                height += richBlock.getHeight();
                z = true;
            }
        }
        this.height = height;
        this.joinedText = sb;
    }

    public void snapshotForDetailsAnimation() {
        for (int i = 0; i < this.blocks.size(); i++) {
            this.blocks.get(i).snapshot();
        }
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

    public static class QuoteBackground {
        int endBlockIndex;
        int level;
        int padding;
        int startBlockIndex;

        public QuoteBackground(int i, int i2, int i3, int i4) {
            this.startBlockIndex = i;
            this.endBlockIndex = i2;
            this.padding = i3;
            this.level = i4;
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

    private RichBlock emitBlock(TL_iv.PageBlock pageBlock, int i, Rect rect, int i2) {
        TLRPC.Document document;
        String string;
        int iCeil;
        if (rect.left + rect.right >= this.maxWidth) {
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockThinking) {
            RichThinkingBlock richThinkingBlock = new RichThinkingBlock(this, new Rect(), this.maxWidth, formatText(pageBlock.text));
            this.blocks.add(richThinkingBlock);
            return richThinkingBlock;
        }
        if (ArticleViewer.isHeadingBlock(pageBlock) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockParagraph)) {
            boolean zIsHeadingBlock = ArticleViewer.isHeadingBlock(pageBlock);
            CharSequence text = formatText(pageBlock.text, setBlockFlags(i2, getBlockTextFlag(pageBlock)));
            Rect rect2 = new Rect(rect);
            if (zIsHeadingBlock && !this.blocks.isEmpty()) {
                rect2.top += AndroidUtilities.dp(4.0f);
            }
            RichTextBlock richTextBlock = new RichTextBlock(this, rect2, this.maxWidth, text);
            this.blocks.add(richTextBlock);
            return richTextBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            RichPreformattedBlock richPreformattedBlock = new RichPreformattedBlock(this, rect, this.maxWidth, (TL_iv.pageBlockPreformatted) pageBlock, (RichPreformattedBlock) findPrevBlock(pageBlock, RichPreformattedBlock.class));
            this.blocks.add(richPreformattedBlock);
            return richPreformattedBlock;
        }
        float f = 26.0f;
        float f2 = 8.0f;
        int i3 = 1;
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            int i4 = i + 1;
            this.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
            int iDp = AndroidUtilities.dp(20.0f);
            int i5 = 0;
            while (i5 < pageblocklist.items.size()) {
                if (pageblocklist.items.get(i5).checkbox) {
                    iCeil = AndroidUtilities.dp(f);
                } else {
                    int iDp2 = AndroidUtilities.dp(f2);
                    TextPaint textPaint = this.numTextPaint;
                    iCeil = iDp2 + ((int) Math.ceil(textPaint.measureText("•◦▪".charAt(i % 3) + "")));
                }
                iDp = Math.max(iDp, iCeil);
                i5++;
                f = 26.0f;
                f2 = 8.0f;
            }
            Rect rect3 = new Rect(rect);
            if (isRtl()) {
                rect3.right += iDp;
            } else {
                rect3.left += iDp;
            }
            for (int i6 = 0; i6 < pageblocklist.items.size(); i6++) {
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i6);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                    RichTextBlock richTextBlock2 = new RichTextBlock(this, new Rect(rect3), this.maxWidth, formatText(tL_pageListItemText.text, i2));
                    if (tL_pageListItemText.checkbox) {
                        richTextBlock2.setCheckbox(tL_pageListItemText.checked);
                    } else {
                        richTextBlock2.setNum("•◦▪".charAt(i % 3) + "");
                    }
                    this.blocks.add(richTextBlock2);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                    if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                        boolean z = false;
                        for (int i7 = 0; i7 < tL_pageListItemBlocks.blocks.size(); i7++) {
                            RichBlock richBlockEmitBlock = emitBlock(tL_pageListItemBlocks.blocks.get(i7), i4, new Rect(rect3), i2);
                            if (richBlockEmitBlock != null && !z) {
                                if (tL_pageListItemBlocks.checkbox) {
                                    richBlockEmitBlock.setCheckbox(tL_pageListItemBlocks.checked);
                                } else {
                                    richBlockEmitBlock.setNum("•◦▪".charAt(i % 3) + "");
                                }
                                z = true;
                            }
                        }
                    }
                }
            }
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            int i8 = i + 1;
            this.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
            int iDp3 = AndroidUtilities.dp(20.0f);
            for (int i9 = 0; i9 < pageblockorderedlist.items.size(); i9++) {
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i9);
                if (!TextUtils.isEmpty(pageListOrderedItem.num)) {
                    string = pageListOrderedItem.num;
                    if (string != null && !string.endsWith(".")) {
                        string = string + ".";
                    }
                } else if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
                    string = pageListOrderedItem.value + ".";
                } else if (TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(pageblockorderedlist.start + (pageblockorderedlist.reversed ? -i9 : i9));
                    sb.append(".");
                    string = sb.toString();
                } else {
                    string = (i9 + 1) + ".";
                }
                int iDp4 = AndroidUtilities.dp(8.0f) + ((int) Math.ceil(this.numTextPaint.measureText(string)));
                if (pageListOrderedItem.checkbox) {
                    iDp4 += AndroidUtilities.dp(26.0f);
                }
                iDp3 = Math.max(iDp3, iDp4);
            }
            Rect rect4 = new Rect(rect);
            if (isRtl()) {
                rect4.right += iDp3;
            } else {
                rect4.left += iDp3;
            }
            for (int i10 = 0; i10 < pageblockorderedlist.items.size(); i10++) {
                TL_iv.PageListOrderedItem pageListOrderedItem2 = pageblockorderedlist.items.get(i10);
                if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2;
                    RichTextBlock richTextBlock3 = new RichTextBlock(this, new Rect(rect4), this.maxWidth, formatText(tL_pageListOrderedItemText.text, i2));
                    if (!TextUtils.isEmpty(tL_pageListOrderedItemText.num)) {
                        String str = tL_pageListOrderedItemText.num;
                        if (str != null && !str.endsWith(".")) {
                            str = str + ".";
                        }
                        richTextBlock3.setNum(str);
                    } else if (TLObject.hasFlag(tL_pageListOrderedItemText.flags, 8)) {
                        richTextBlock3.setNum(tL_pageListOrderedItemText.value + ".");
                    } else if (TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(pageblockorderedlist.start + (pageblockorderedlist.reversed ? -i10 : i10));
                        sb2.append(".");
                        richTextBlock3.setNum(sb2.toString());
                    } else {
                        richTextBlock3.setNum((i10 + 1) + ".");
                    }
                    if (tL_pageListOrderedItemText.checkbox) {
                        richTextBlock3.setCheckbox(tL_pageListOrderedItemText.checked);
                    }
                    this.blocks.add(richTextBlock3);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2;
                    if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                        boolean z2 = false;
                        for (int i11 = 0; i11 < tL_pageListOrderedItemBlocks.blocks.size(); i11++) {
                            RichBlock richBlockEmitBlock2 = emitBlock(tL_pageListOrderedItemBlocks.blocks.get(i11), i8, new Rect(rect4), i2);
                            if (richBlockEmitBlock2 != null && !z2) {
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    richBlockEmitBlock2.setCheckbox(tL_pageListOrderedItemBlocks.checked);
                                }
                                if (!TextUtils.isEmpty(tL_pageListOrderedItemBlocks.num)) {
                                    richBlockEmitBlock2.setNum(tL_pageListOrderedItemBlocks.num);
                                } else if (TLObject.hasFlag(tL_pageListOrderedItemBlocks.flags, 8)) {
                                    richBlockEmitBlock2.setNum(tL_pageListOrderedItemBlocks.value + ".");
                                } else if (TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(pageblockorderedlist.start + (pageblockorderedlist.reversed ? -i10 : i10));
                                    sb3.append(".");
                                    richBlockEmitBlock2.setNum(sb3.toString());
                                } else {
                                    richBlockEmitBlock2.setNum((i10 + 1) + ".");
                                }
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    richBlockEmitBlock2.setCheckbox(tL_pageListOrderedItemBlocks.checked);
                                }
                                z2 = true;
                            }
                        }
                    }
                }
            }
            return null;
        }
        float f3 = 12.0f;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            int i12 = rect.left;
            int size = this.blocks.size();
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatText(pageBlock.text, setBlockFlags(i2, getBlockTextFlag(pageBlock))));
            TL_iv.RichText richText = pageblockblockquote.caption;
            if (richText != null && !TextUtils.isEmpty(getString(richText))) {
                spannableStringBuilder.append((CharSequence) "\n");
                spannableStringBuilder.append(formatText(pageblockblockquote.caption, setBlockFlags(i2, 11)));
            }
            RichTextBlock richTextBlock4 = new RichTextBlock(this, new Rect(rect.left + AndroidUtilities.dp(12.0f), rect.top + AndroidUtilities.dp(4.0f), rect.right + AndroidUtilities.dp(12.0f), rect.bottom + AndroidUtilities.dp(4.0f)), this.maxWidth, spannableStringBuilder);
            this.blocks.add(richTextBlock4);
            this.quotes.add(new QuoteBackground(size, this.blocks.size() - 1, i12, i));
            return richTextBlock4;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            int i13 = rect.left;
            int i14 = i + 1;
            int size2 = this.blocks.size();
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            int i15 = 0;
            while (i15 < pageblockblockquoteblocks.blocks.size()) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks2 = pageblockblockquoteblocks;
                emitBlock(pageblockblockquoteblocks.blocks.get(i15), i14, new Rect(rect.left + AndroidUtilities.dp(f3), rect.top + (i15 == 0 ? AndroidUtilities.dp(4.0f) : 0), rect.right + AndroidUtilities.dp(12.0f), rect.bottom + (i15 == pageblockblockquoteblocks.blocks.size() - i3 ? AndroidUtilities.dp(4.0f) : 0)), setBlockFlags(i2, 9));
                i15++;
                pageblockblockquoteblocks = pageblockblockquoteblocks2;
                f3 = 12.0f;
                i3 = 1;
            }
            this.quotes.add(new QuoteBackground(size2, this.blocks.size() - 1, i13, i));
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(formatText(pageBlock.text, setBlockFlags(i2, getBlockTextFlag(pageBlock))));
            TL_iv.RichText richText2 = pageblockpullquote.caption;
            if (richText2 != null && !TextUtils.isEmpty(getString(richText2))) {
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append(formatText(pageblockpullquote.caption, setBlockFlags(i2, 11)));
            }
            RichTextBlock richTextBlock5 = new RichTextBlock(this, new Rect(rect.left + AndroidUtilities.dp(30.0f), rect.top + AndroidUtilities.dp(8.0f), rect.right + AndroidUtilities.dp(30.0f), rect.bottom + AndroidUtilities.dp(8.0f)), this.maxWidth, spannableStringBuilder2, Layout.Alignment.ALIGN_CENTER);
            richTextBlock5.pullquote = true;
            this.blocks.add(richTextBlock5);
            return richTextBlock5;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            RichTableBlock richTableBlock = new RichTableBlock(this, rect, this.maxWidth, (TL_iv.pageBlockTable) pageBlock);
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
            RichPhotoBlock richPhotoBlock = new RichPhotoBlock(this, rect, this.maxWidth, pageblockphoto);
            this.blocks.add(richPhotoBlock);
            emitCaption(pageblockphoto.caption, rect, i2);
            return richPhotoBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            RichVideoBlock richVideoBlock = new RichVideoBlock(this, rect, this.maxWidth, pageblockvideo);
            this.blocks.add(richVideoBlock);
            emitCaption(pageblockvideo.caption, rect, i2);
            return richVideoBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            RichCollageBlock richCollageBlock = new RichCollageBlock(this, rect, this.maxWidth, pageblockcollage);
            this.blocks.add(richCollageBlock);
            emitCaption(pageblockcollage.caption, rect, i2);
            return richCollageBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            RichSlideshowBlock richSlideshowBlock = new RichSlideshowBlock(this, rect, this.maxWidth, pageblockslideshow);
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
                int i16 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                pageblockaudio.mid = i16;
                tL_message.id = i16;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                peer.user_id = clientUserId;
                tL_peerUser.user_id = clientUserId;
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
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return emitBlock(((TL_iv.pageBlockCover) pageBlock).cover, i, rect, i2);
        }
        if (pageBlock instanceof TL_iv.pageBlockAnchor) {
            String str2 = ((TL_iv.pageBlockAnchor) pageBlock).name;
            if (str2 == null) {
                return null;
            }
            this.anchors.put(str2.toLowerCase(), Integer.valueOf(this.blocks.size()));
            return null;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockUnsupported) && (pageBlock instanceof TL_iv.pageBlockDetails)) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            RichDetailsBlock richDetailsBlock = new RichDetailsBlock(this, rect, this.maxWidth, pageblockdetails, formatText(pageblockdetails.title, setBlockFlags(i2, 16)));
            this.blocks.add(richDetailsBlock);
            for (int i17 = 0; i17 < pageblockdetails.blocks.size(); i17++) {
                emitBlock(pageblockdetails.blocks.get(i17), i + 1, rect, i2);
            }
            for (int size3 = this.blocks.size(); size3 < this.blocks.size(); size3++) {
                RichBlock richBlock = this.blocks.get(size3);
                if (richBlock.parentDetails == null) {
                    richBlock.parentDetails = richDetailsBlock;
                }
            }
            return richDetailsBlock;
        }
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            return null;
        }
        RichTextBlock richTextBlock6 = new RichTextBlock(this, rect, this.maxWidth, "unsupported block " + pageBlock);
        this.blocks.add(richTextBlock6);
        return richTextBlock6;
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

    private void drawBackground(Canvas canvas) {
        if (!this.quotes.isEmpty()) {
            Iterator<QuoteBackground> it = this.quotes.iterator();
            while (it.hasNext()) {
                QuoteBackground next = it.next();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(next.padding, getBlockTop(next.startBlockIndex), getMinWidth() - AndroidUtilities.dp(next.level * 12), getBlockBottom(next.endBlockIndex));
                float fFloor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                this.quoteLine.drawBackground(canvas, rectF, fFloor, fFloor, fFloor, 1.0f, false, false);
                this.quoteLine.drawLine(canvas, rectF);
            }
        }
        for (int i = 0; i < this.blocks.size(); i++) {
            RichBlock richBlock = this.blocks.get(i);
            if (richBlock instanceof RichTextBlock) {
                RichTextBlock richTextBlock = (RichTextBlock) richBlock;
                if (richTextBlock.pullquote && richBlock.isVisible()) {
                    drawPullquoteBackground(canvas, richTextBlock, i);
                }
            }
        }
    }

    private void drawPullquoteBackground(Canvas canvas, RichTextBlock richTextBlock, int i) {
        int minWidth = richTextBlock.text.getMinWidth();
        if (minWidth <= 0) {
            return;
        }
        float minWidth2 = ((getMinWidth() + this.padRight) - this.padLeft) / 2.0f;
        float f = minWidth / 2.0f;
        float fDp = (minWidth2 - f) - AndroidUtilities.dp(30.0f);
        float fDp2 = minWidth2 + f + AndroidUtilities.dp(30.0f);
        int blockTop = getBlockTop(i);
        int height = blockTop + richTextBlock.getHeight();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(fDp, blockTop, fDp2, height);
        float fFloor = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
        this.quoteLine.drawBackground(canvas, rectF, fFloor, fFloor, fFloor, 1.0f, false, false);
        if (this.pullquoteIcon == null) {
            this.pullquoteIcon = ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.mini_quote).mutate();
        }
        this.pullquoteIcon.setColorFilter(this.quoteLine.getColor(), PorterDuff.Mode.SRC_IN);
        int intrinsicWidth = this.pullquoteIcon.getIntrinsicWidth();
        int intrinsicHeight = this.pullquoteIcon.getIntrinsicHeight();
        canvas.save();
        int i2 = (int) fDp;
        this.pullquoteIcon.setBounds(AndroidUtilities.dp(8.0f) + i2, AndroidUtilities.dp(7.0f) + blockTop, i2 + AndroidUtilities.dp(8.0f) + intrinsicWidth, blockTop + AndroidUtilities.dp(7.0f) + intrinsicHeight);
        canvas.scale(-1.0f, -1.0f, this.pullquoteIcon.getBounds().centerX(), this.pullquoteIcon.getBounds().centerY());
        this.pullquoteIcon.draw(canvas);
        canvas.restore();
        canvas.save();
        int i3 = (int) fDp2;
        this.pullquoteIcon.setBounds((i3 - AndroidUtilities.dp(8.0f)) - intrinsicWidth, (height - AndroidUtilities.dp(7.0f)) - intrinsicHeight, i3 - AndroidUtilities.dp(8.0f), height - AndroidUtilities.dp(7.0f));
        canvas.scale(1.0f, -1.0f, this.pullquoteIcon.getBounds().centerX(), this.pullquoteIcon.getBounds().centerY());
        this.pullquoteIcon.draw(canvas);
        canvas.restore();
    }

    private int getBlockTop(int i) {
        boolean z = false;
        int height = 0;
        for (int i2 = 0; i2 < this.blocks.size(); i2++) {
            RichBlock richBlock = this.blocks.get(i2);
            boolean zIsVisible = richBlock.isVisible();
            if (zIsVisible && z) {
                height += getGap();
            }
            if (i2 == i) {
                return height;
            }
            if (zIsVisible) {
                height += richBlock.getHeight();
                z = true;
            }
        }
        return this.height;
    }

    private int getBlockBottom(int i) {
        boolean z = false;
        int height = 0;
        for (int i2 = 0; i2 < this.blocks.size(); i2++) {
            RichBlock richBlock = this.blocks.get(i2);
            boolean zIsVisible = richBlock.isVisible();
            if (zIsVisible && z) {
                height += getGap();
            }
            if (zIsVisible) {
                height += richBlock.getHeight();
                if (i2 == i && richBlock.padding.bottom > AndroidUtilities.dp(4.0f)) {
                    height -= richBlock.padding.bottom - AndroidUtilities.dp(4.0f);
                }
            }
            if (i2 == i) {
                return height;
            }
            if (zIsVisible) {
                z = true;
            }
        }
        return this.height;
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

    private void drawInternal(Canvas canvas, ChatMessageCell.TransitionParams transitionParams, boolean z, float f, float f2) {
        drawBackground(canvas);
        updateTranslationLoading();
        float fMax = (transitionParams == null || !this.detailsAnimating) ? 1.0f : Math.max(0.0f, Math.min(1.0f, transitionParams.animateChangeProgress));
        if (fMax >= 1.0f) {
            this.detailsAnimating = false;
        }
        for (int i = 0; i < this.blocks.size(); i++) {
            RichBlock richBlock = this.blocks.get(i);
            if (richBlock.currVisible || richBlock.prevVisible) {
                float fLerp = AndroidUtilities.lerp(richBlock.prevY, richBlock.currY, fMax);
                float fLerp2 = AndroidUtilities.lerp(richBlock.prevVisible ? 1.0f : 0.0f, richBlock.currVisible ? 1.0f : 0.0f, fMax);
                if (fLerp2 > 0.0f) {
                    int height = richBlock.getHeight();
                    if (!z || (height + fLerp > f && fLerp < f2)) {
                        canvas.save();
                        canvas.translate(0.0f, fLerp);
                        if (fLerp2 < 1.0f) {
                            int iSaveLayerAlpha = canvas.saveLayerAlpha(-this.padLeft, 0.0f, getMinWidth() + this.padRight, height, (int) (fLerp2 * 255.0f), 31);
                            richBlock.drawWithTyping(canvas);
                            canvas.restoreToCount(iSaveLayerAlpha);
                        } else {
                            richBlock.drawWithTyping(canvas);
                        }
                        canvas.restore();
                    }
                }
            }
        }
        if (fMax >= 1.0f) {
            snapshotForDetailsAnimation();
        }
    }

    public void draw(Canvas canvas, int i, int i2, ChatMessageCell.TransitionParams transitionParams) {
        this.padLeft = i;
        this.padRight = i2;
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
        this.padLeft = i;
        this.padRight = i2;
        this.textPaint.linkColor = getThemedColor(isOut() ? Theme.key_chat_messageLinkOut : Theme.key_chat_messageLinkIn);
        drawInternal(canvas, transitionParams, f2 > f, f, f2);
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
        AndroidUtilities.dp(20.0f);
        float currentWidth = this.showMoreText.getCurrentWidth();
        getMinWidth();
        AndroidUtilities.dp(24.0f);
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
        recyclerView.smoothScrollBy(0, (((this.cell.getTop() + this.cell.textY) + getBlockTop(i)) - recyclerView.getPaddingTop()) - AndroidUtilities.dp(8.0f));
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
        if (!(richText instanceof TL_iv.textEmpty)) {
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append((CharSequence) ((TL_iv.textPlain) richText).text);
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
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanReplacement(((TL_iv.textUrl) richText).url));
            } else if (richText instanceof TL_iv.textEmail) {
                TL_iv.textEmail textemail = (TL_iv.textEmail) richText;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i, new URLSpanReplacement("mailto:" + textemail.email));
            } else {
                if (richText instanceof TL_iv.textConcat) {
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
                        try {
                            JLatexMathDrawable jLatexMathDrawableBuild = JLatexMathDrawable.builder(textmath.source).textSize(AndroidUtilities.dp(this.fontSize + 4)).build();
                            int intrinsicWidth = jLatexMathDrawableBuild.getIntrinsicWidth();
                            int intrinsicHeight = jLatexMathDrawableBuild.getIntrinsicHeight();
                            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                                jLatexMathDrawableBuild.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                                jLatexMathDrawableBuild.draw(new Canvas(bitmapCreateBitmap));
                                textmath.w = intrinsicWidth;
                                textmath.h = intrinsicHeight;
                                try {
                                    textmath.depth = jLatexMathDrawableBuild.icon().getIconDepth();
                                } catch (Throwable th) {
                                    FileLog.e(th);
                                }
                                textmath.bitmap = bitmapCreateBitmap;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
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
                    spannableStringBuilder.setSpan(new AnimatedEmojiSpan(textcustomemoji.document_id, (Paint.FontMetricsInt) null).setSize(AndroidUtilities.dp(this.fontSize + 4)), length3, spannableStringBuilder.length(), 33);
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
                    int i11 = i | 512;
                    formatTextAndSetSpan(richText.text, spannableStringBuilder, i11, new StyleSpan(this, i11), new FormattedDateSpan(getString(richText), null, tL_messageEntityFormattedDate));
                }
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
                    return AndroidUtilities.dp(i2 + 2);
                case 2:
                    return AndroidUtilities.dp(i2 + 1);
                case 3:
                    return AndroidUtilities.dp(i2);
                case 4:
                    return AndroidUtilities.dp(i2 - 1);
                case 5:
                    return AndroidUtilities.dp(i2 - 2);
                case 6:
                    return AndroidUtilities.dp(i2 - 3);
                case 7:
                    return AndroidUtilities.dp(i2 - 2);
                case 8:
                    return AndroidUtilities.dp(Math.max(8, i2 - 2));
                case 9:
                case 11:
                    return AndroidUtilities.dp(i2 - 2);
                case 10:
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
        private boolean drawAtOrigin;
        public int lastLineRight;
        public final StaticLayout layout;
        public int left;
        public LinkSpanDrawable.LinkCollector linkCollector;
        private boolean longPressFired;
        private Runnable longPressRunnable;
        public LinkPath markPath;
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
            return this.pressedLink != null;
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
            int iDp;
            int iDp2;
            this.spoilers = new ArrayList();
            this.spoilersPool = new Stack<>();
            this.spoilersPatchedTextLayout = new AtomicReference<>();
            this.root = richMessageLayout;
            this.layout = MessageObject.makeStaticLayout(Emoji.replaceEmoji(charSequence, richMessageLayout.textPaint.getFontMetricsInt(), false), richMessageLayout.textPaint, i, 1.0f, 0.0f, false, alignment);
            this.left = i;
            this.right = 0;
            for (int i2 = 0; i2 < this.layout.getLineCount(); i2++) {
                this.left = Math.min(this.left, (int) Math.floor(this.layout.getLineLeft(i2)));
                this.right = Math.max(this.right, (int) Math.ceil(this.layout.getLineRight(i2)));
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
                for (StyleSpan styleSpan : (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class)) {
                    if (TLObject.hasFlag(styleSpan.flags, 8192)) {
                        int spanStart = spanned.getSpanStart(styleSpan);
                        int spanEnd = spanned.getSpanEnd(styleSpan);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            if (linkPath == null) {
                                linkPath = new LinkPath(true);
                                linkPath.setAllowReset(false);
                            }
                            linkPath.setCurrentLayout(this.layout, spanStart, 0.0f);
                            if (TLObject.hasFlag(styleSpan.flags, 4096)) {
                                iDp = -AndroidUtilities.dp(6.0f);
                            } else {
                                iDp = TLObject.hasFlag(styleSpan.flags, 2048) ? AndroidUtilities.dp(2.0f) : 0;
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

        public void setDrawAtOrigin(boolean z) {
            this.drawAtOrigin = z;
        }

        private int drawLeft() {
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
                RichMessageLayout richMessageLayout3 = this.root;
                markPaint.setColor((richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? Theme.key_chat_messageLinkOut : Theme.key_chat_messageLinkIn) & 16777215) | 855638016);
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
            if (this.pressedLink == null) {
                return;
            }
            this.longPressFired = true;
            View view = this.view;
            if (view != null) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
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
            this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this.view, this.root.invalidateAnimatedEmojiInParent, this.animatedEmojiStack, this.layout);
            LinkSpanDrawable.LinkCollector linkCollector = this.linkCollector;
            if (linkCollector != null) {
                linkCollector.setParent(this.view);
            }
        }

        public void onDetachedFromWindow() {
            AnimatedEmojiSpan.release(this.view, this.animatedEmojiStack);
            this.animatedEmojiStack = null;
            LinkSpanDrawable.LinkCollector linkCollector = this.linkCollector;
            if (linkCollector != null) {
                linkCollector.setParent(null);
            }
        }

        public void refreshAnimatedEmoji(int i) {
            View view = this.view;
            if (view == null) {
                return;
            }
            AnimatedEmojiSpan.release(view, this.animatedEmojiStack);
            this.animatedEmojiStack = null;
            this.animatedEmojiStack = AnimatedEmojiSpan.update(i, this.view, this.root.invalidateAnimatedEmojiInParent, (AnimatedEmojiSpan.EmojiGroupedSpans) null, this.layout);
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
        public boolean pullquote;
        public final Text text;
        public final Text[] texts;

        public RichTextBlock(RichMessageLayout richMessageLayout, Rect rect, int i, CharSequence charSequence) {
            this(richMessageLayout, rect, i, charSequence, Layout.Alignment.ALIGN_NORMAL);
        }

        public RichTextBlock(RichMessageLayout richMessageLayout, Rect rect, int i, CharSequence charSequence, Layout.Alignment alignment) {
            super(richMessageLayout, rect, i);
            this.centered = alignment == Layout.Alignment.ALIGN_CENTER;
            Text text = new Text(richMessageLayout, charSequence, this.maxWidth, alignment);
            this.text = text;
            this.texts = new Text[]{text};
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
            int iRtlOffset = rtlOffset();
            if (iRtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + iRtlOffset) - text.left);
                canvas.save();
                canvas.translate(iRtlOffset, 0.0f);
                this.text.draw(canvas);
                canvas.restore();
                return;
            }
            this.text.draw(canvas);
        }

        @Override
        protected void onDrawFaded(Canvas canvas, int i, float f) {
            int iRtlOffset = rtlOffset();
            if (iRtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + iRtlOffset) - text.left);
                canvas.save();
                canvas.translate(iRtlOffset, 0.0f);
                this.text.drawFade(canvas, i, f);
                canvas.restore();
                return;
            }
            this.text.drawFade(canvas, i, f);
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

    public static class RichCaptionBlock extends RichBlock {
        public final Text caption;
        public final Text credit;
        public final boolean rtl;
        private final TextSelectionHelper.TextLayoutBlock[] texts;

        @Override
        public boolean forcesTimeToNewLine() {
            return false;
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
        private static final int ARROW_W = 26;
        private static final int H_GAP = 4;
        private static final int VPAD = 6;
        public final AnimatedArrowDrawable arrow;
        public final TL_iv.pageBlockDetails block;
        private ButtonBounce bounce;
        private boolean pressed;
        public final Text[] texts;
        public final Text title;

        public RichDetailsBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockDetails pageblockdetails, CharSequence charSequence) {
            super(richMessageLayout, rect, i);
            this.block = pageblockdetails;
            Text text = new Text(richMessageLayout, charSequence, Math.max(0, this.maxWidth - AndroidUtilities.dp(30.0f)));
            this.title = text;
            this.texts = new Text[]{text};
            AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_messageTextOut : Theme.key_chat_messageTextIn), true);
            this.arrow = animatedArrowDrawable;
            animatedArrowDrawable.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
        }

        public boolean isOpen() {
            return this.block.open;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            ButtonBounce buttonBounce = this.bounce;
            float scale = buttonBounce != null ? buttonBounce.getScale(0.02f) : 1.0f;
            int iMax = Math.max(AndroidUtilities.dp(26.0f), this.title.getHeight());
            if (scale != 1.0f) {
                canvas.save();
                canvas.scale(scale, scale, AndroidUtilities.dp(26.0f) / 2.0f, AndroidUtilities.dp(6.0f) + (iMax / 2.0f));
            }
            RichMessageLayout richMessageLayout = this.root;
            this.arrow.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_messageTextOut : Theme.key_chat_messageTextIn));
            canvas.save();
            canvas.translate(0.0f, AndroidUtilities.dp(6.0f) + ((iMax - AndroidUtilities.dp(13.0f)) / 2.0f));
            this.arrow.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(6.0f) + ((iMax - r2) / 2.0f));
            this.title.draw(canvas);
            canvas.restore();
            if (scale != 1.0f) {
                canvas.restore();
            }
        }

        @Override
        public int getHeight() {
            return this.padding.top + AndroidUtilities.dp(6.0f) + Math.max(AndroidUtilities.dp(26.0f), this.title.getHeight()) + AndroidUtilities.dp(6.0f) + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            return this.padding.left + AndroidUtilities.dp(30.0f) + this.title.getMinWidth() + this.padding.right;
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
            int iMax = Math.max(AndroidUtilities.dp(26.0f), this.title.getHeight());
            this.title.setX((i + AndroidUtilities.dp(30.0f)) - this.title.left);
            this.title.setY(i2 + AndroidUtilities.dp(6.0f) + ((iMax - this.title.getHeight()) / 2));
            this.title.setRow(i3);
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i, FoundLink foundLink) {
            if (!this.title.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            int iMax = Math.max(AndroidUtilities.dp(26.0f), this.title.getHeight());
            foundLink.x = (this.padding.left + AndroidUtilities.dp(30.0f)) - this.title.left;
            foundLink.y = i + this.padding.top + AndroidUtilities.dp(6.0f) + ((iMax - this.title.getHeight()) / 2.0f);
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
            delegate.forceUpdate(cell, false);
        }
    }

    public static class RichTableBlock extends RichBlock implements TableLayout.TableLayoutDelegate {
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
        private int touchSlop;
        private VelocityTracker velocityTracker;
        private final int viewportWidth;

        @Override
        public void onLayoutChild(TableLayout.CellText cellText, int i, int i2) {
            TableLayout.TableLayoutDelegate.CC.$default$onLayoutChild(this, cellText, i, i2);
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
                this.linePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                Paint paint2 = new Paint();
                this.halfLinePaint = paint2;
                paint2.setStyle(style);
                this.halfLinePaint.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
                this.headerPaint = new Paint();
                this.stripPaint = new Paint();
            }
            int themedColor = this.root.getThemedColor(Theme.key_windowBackgroundWhiteInputField);
            this.linePaint.setColor(themedColor);
            this.halfLinePaint.setColor(themedColor);
            this.headerPaint.setColor(369098752);
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
            this.pageBlock = pageblocktable;
            this.viewportWidth = this.maxWidth;
            TableLayout tableLayout = new TableLayout(ApplicationLoader.applicationContext, this, null);
            this.tableLayout = tableLayout;
            tableLayout.setOrientation(0);
            tableLayout.setRowOrderPreserved(true);
            tableLayout.setDrawLines(pageblocktable.bordered);
            tableLayout.setStriped(pageblocktable.striped);
            tableLayout.setRtl(richMessageLayout.isRtl());
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
            for (int i10 = 0; i10 < this.tableLayout.getChildCount(); i10++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i10);
                TableLayout.CellText cellText = childAt.textLayout;
                if (cellText instanceof Text) {
                    this.cellTexts.add((Text) cellText);
                    this.cellBlocks.add(new CellBlock(childAt));
                }
            }
            this.textsArr = (TextSelectionHelper.TextLayoutBlock[]) this.cellTexts.toArray(new Text[0]);
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
            CharSequence text = this.root.formatText(pagetablecell.text, pagetablecell.header ? 16 : 0);
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
        }

        @Override
        public int getHeight() {
            Rect rect = this.padding;
            return rect.top + this.contentHeight + rect.bottom;
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
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i);
                if (childAt.textLayout instanceof Text) {
                    if (f3 >= childAt.x && f3 < r3 + childAt.getMeasuredWidth()) {
                        if (f2 >= childAt.y && f2 < r3 + childAt.getMeasuredHeight()) {
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
                TableLayout.Child childFindCellChildAt = findCellChildAt(motionEvent.getX(), motionEvent.getY());
                if (childFindCellChildAt != null) {
                    this.pressedCellText = (Text) childFindCellChildAt.textLayout;
                    this.cellDx = childFindCellChildAt.getTextX() - this.scrollX;
                    float textY = childFindCellChildAt.getTextY();
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
            int childCount = this.tableLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                TableLayout.CellText cellText = this.tableLayout.getChildAt(i2).textLayout;
                if (cellText instanceof Text) {
                    if (((Text) cellText).fillFoundLink(characterStyle, foundLink)) {
                        foundLink.x = ((this.padding.left + r3.getTextX()) - this.scrollX) - r4.left;
                        foundLink.y = i + this.padding.top + r3.getTextY();
                        return true;
                    }
                }
            }
            return false;
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
            int childCount = this.tableLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i4);
                TableLayout.CellText cellText = childAt.textLayout;
                if (cellText instanceof Text) {
                    Text text = (Text) cellText;
                    text.setX(((childAt.getTextX() + i) - this.scrollX) - text.left);
                    text.setY(childAt.getTextY() + i2);
                    text.setRow(i3);
                }
            }
        }

        @Override
        public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
            Text text;
            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans;
            canvas.save();
            Rect rect = this.padding;
            canvas.translate(rect.left, rect.top);
            canvas.translate(-this.scrollX, 0.0f);
            int childCount = this.tableLayout.getChildCount();
            boolean z = false;
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
            Iterator<Text> it = this.cellTexts.iterator();
            while (it.hasNext()) {
                it.next().attach(this.view);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
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
            int i = minWidth + richMessageLayout.padLeft + richMessageLayout.padRight;
            Rect rect = this.padding;
            int i2 = ((i - rect.left) - rect.right) / 3;
            this.paint.setColor(Theme.multAlpha(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_outReplyMessageText : Theme.key_chat_inReplyMessageText), 0.2f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((i2 - this.root.padLeft) + this.padding.left, AndroidUtilities.dp(8.0f), ((i2 * 2) - this.root.padLeft) + this.padding.left, AndroidUtilities.dp(10.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), this.paint);
        }

        @Override
        public int getMinWidth() {
            return AndroidUtilities.dp(32.0f);
        }

        @Override
        public int getHeight() {
            return this.padding.top + AndroidUtilities.dp(18.0f) + this.padding.bottom;
        }
    }

    public static class RichPreformattedBlock extends RichBlock {
        private static final int HPAD = 0;
        private static final int VPAD = 8;
        private final Paint bgPaint;
        public SpannableString content;
        private final int contentWidth;
        private int downScrollX;
        private float downX;
        private boolean dragging;
        private final Runnable flingTick;
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
            Text text = new Text(richMessageLayout, this.content, AndroidUtilities.dp(5000.0f));
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
            Paint paint = this.bgPaint;
            RichMessageLayout richMessageLayout = this.root;
            paint.setColor(Theme.capAlpha(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_outCodeBackground : Theme.key_chat_inCodeBackground), 0.1f));
            if (this.padding.left > 0) {
                int minWidth = this.root.getMinWidth();
                Rect rect = this.padding;
                canvas.drawRect(0.0f, 0.0f, (minWidth - rect.left) - rect.right, this.text.getHeight() + AndroidUtilities.dp(16.0f), this.bgPaint);
            } else {
                RichMessageLayout richMessageLayout2 = this.root;
                canvas.drawRect(-richMessageLayout2.padLeft, 0.0f, richMessageLayout2.getMinWidth() + this.root.padRight, this.text.getHeight() + AndroidUtilities.dp(16.0f), this.bgPaint);
            }
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
            drawBackground(canvas);
            drawTextContent(canvas, false, 0, 0.0f);
        }

        @Override
        protected void onDrawFaded(Canvas canvas, int i, float f) {
            StaticLayout staticLayout = this.text.layout;
            if (staticLayout == null || i < 0 || i >= staticLayout.getLineCount()) {
                onDraw(canvas);
            } else {
                drawBackground(canvas);
                drawTextContent(canvas, true, i, f);
            }
        }

        @Override
        public Layout getLayout() {
            return this.text.layout;
        }

        @Override
        public int getHeight() {
            return this.padding.top + this.text.getHeight() + (AndroidUtilities.dp(8.0f) * 2) + this.padding.bottom;
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
            float fDp2 = AndroidUtilities.dp(8.0f);
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
            foundLink.y = i + this.padding.top + AndroidUtilities.dp(8.0f);
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
            this.text.setY(i2 + AndroidUtilities.dp(8.0f));
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
            this.viewportWidth = this.maxWidth;
            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                try {
                    JLatexMathDrawable jLatexMathDrawableBuild = JLatexMathDrawable.builder(pageblockmath.source).textSize(AndroidUtilities.dp(richMessageLayout.fontSize + 4)).build();
                    int intrinsicWidth = jLatexMathDrawableBuild.getIntrinsicWidth();
                    int intrinsicHeight = jLatexMathDrawableBuild.getIntrinsicHeight();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                        this.bitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                        jLatexMathDrawableBuild.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        jLatexMathDrawableBuild.draw(new Canvas(this.bitmap));
                        this.contentW = intrinsicWidth;
                        this.contentH = intrinsicHeight;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            int iDp = this.contentW + (AndroidUtilities.dp(0.0f) * 2);
            this.contentWidth = iDp;
            this.maxScrollX = Math.max(0, iDp - this.viewportWidth);
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
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.maxWidth, 0.0f, new int[]{Theme.multAlpha(themedColor, 0.55f), Theme.multAlpha(themedColor, 0.25f), Theme.multAlpha(themedColor, 0.55f)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
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
        public final ImageReceiver imageReceiver;
        protected int imgHeight;
        protected int imgWidth;
        protected boolean mediaForced;
        private final int observerTag;
        private boolean photoPressed;
        protected RadialProgress2 radialProgress;

        protected boolean allowAutoplay() {
            return true;
        }

        protected abstract void applyImage(boolean z);

        protected abstract boolean fileExists();

        public abstract TL_iv.PageBlock getBlock();

        protected abstract String getFileName();

        protected boolean isAnimatedContent() {
            return false;
        }

        protected boolean isRealVideo() {
            return false;
        }

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public RichMediaBlock(RichMessageLayout richMessageLayout, Rect rect, int i) {
            super(richMessageLayout, rect, i);
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            ImageReceiver imageReceiver2 = new ImageReceiver();
            this.blurImageReceiver = imageReceiver2;
            this.buttonState = -1;
            this.buttonSize = AndroidUtilities.dp(48.0f);
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            imageReceiver2.setAllowLoadingOnAttachedOnly(true);
            imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                @Override
                public void didSetImage(ImageReceiver imageReceiver3, boolean z, boolean z2, boolean z3) {
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
            boolean z = availWidth() > this.imgWidth;
            if (!this.imageReceiver.hasBitmapImage() || this.imageReceiver.getCurrentAlpha() != 1.0f) {
                RichMessageLayout richMessageLayout = this.root;
                canvas.drawRect(-richMessageLayout.padLeft, 0.0f, richMessageLayout.padRight + minWidth, this.imgHeight, mediaBgPaint);
            }
            if (z) {
                prepareBlurImage();
                if (this.blurImageReceiver.getBitmap() != null) {
                    ImageReceiver imageReceiver = this.blurImageReceiver;
                    int i = this.root.padLeft;
                    imageReceiver.setImageCoords(-i, 0.0f, i + minWidth + r4.padRight, this.imgHeight);
                    this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
                    this.blurImageReceiver.draw(canvas);
                }
                this.imageReceiver.setAspectFit(true);
                this.imageReceiver.setImageCoords(0.0f, 0.0f, availWidth(), this.imgHeight);
            } else {
                this.imageReceiver.setAspectFit(false);
                ImageReceiver imageReceiver2 = this.imageReceiver;
                int i2 = this.root.padLeft;
                imageReceiver2.setImageCoords(-i2, 0.0f, i2 + minWidth + r2.padRight, this.imgHeight);
            }
            this.imageReceiver.draw(canvas);
            if (this.radialProgress == null || this.buttonState == -1) {
                return;
            }
            int imageLeft = getImageLeft();
            RadialProgress2 radialProgress2 = this.radialProgress;
            int i3 = imageLeft + this.buttonX;
            int i4 = this.buttonY;
            int i5 = this.buttonSize;
            radialProgress2.setProgressRect(i3, i4, i3 + i5, i5 + i4);
            this.radialProgress.draw(canvas);
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

        public RichPhotoBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockPhoto pageblockphoto) {
            super(richMessageLayout, rect, i);
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
    }

    public static class RichVideoBlock extends RichMediaBlock {
        public final TL_iv.pageBlockVideo block;
        public final TLRPC.Document document;
        public final boolean isVideo;
        public final TLRPC.PhotoSize previewThumb;
        public final boolean realVideo;
        public final TLRPC.PhotoSize strippedThumb;

        public RichVideoBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockVideo pageblockvideo) {
            int i2;
            int i3;
            super(richMessageLayout, rect, i);
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
            RichMessageLayout richMessageLayout = this.root;
            canvas.drawRect(-richMessageLayout.padLeft, 0.0f, this.imgWidth + richMessageLayout.padRight, this.imgHeight, mapBgPaint);
            Drawable drawable = Theme.chat_locationDrawable[this.root.isOut() ? 1 : 0];
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i = (this.imgWidth - intrinsicWidth) / 2;
                int i2 = (this.imgHeight - intrinsicHeight) / 2;
                drawable.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
                drawable.draw(canvas);
            }
            ImageReceiver imageReceiver = this.imageReceiver;
            int i3 = this.root.padLeft;
            imageReceiver.setImageCoords(-i3, 0.0f, this.imgWidth + i3 + r2.padRight, this.imgHeight);
            this.imageReceiver.draw(canvas);
            if (this.currentMapProvider == 2 && this.imageReceiver.hasNotThumb()) {
                if (this.redPinIcon == null && (view = this.view) != null) {
                    this.redPinIcon = ContextCompat.getDrawable(view.getContext(), R.drawable.map_pin).mutate();
                }
                if (this.redPinIcon != null) {
                    int intrinsicWidth2 = (int) (r0.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight2 = (int) (this.redPinIcon.getIntrinsicHeight() * 0.8f);
                    int i4 = (this.imgWidth - intrinsicWidth2) / 2;
                    int i5 = (this.imgHeight / 2) - intrinsicHeight2;
                    this.redPinIcon.setAlpha((int) (this.imageReceiver.getCurrentAlpha() * 255.0f));
                    this.redPinIcon.setBounds(i4, i5, intrinsicWidth2 + i4, intrinsicHeight2 + i5);
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
            int iDp = this.buttonX + AndroidUtilities.dp(50.0f) + this.size;
            this.seekBarX = iDp;
            this.seekBarWidth = Math.max(0, (this.maxWidth - iDp) - AndroidUtilities.dp(18.0f));
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
                this.titleLayout = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, Theme.chat_audioTitlePaint, this.seekBarWidth, TextUtils.TruncateAt.END), this.audioTimePaint, this.seekBarWidth + AndroidUtilities.dp(50.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            canvas.save();
            canvas.translate(-this.root.padLeft, 0.0f);
            this.radialProgress.setColorKeys(this.root.isOut() ? Theme.key_chat_outLoader : Theme.key_chat_inLoader, this.root.isOut() ? Theme.key_chat_outLoaderSelected : Theme.key_chat_inLoaderSelected, this.root.isOut() ? Theme.key_chat_outMediaIcon : Theme.key_chat_inMediaIcon, this.root.isOut() ? Theme.key_chat_outMediaIconSelected : Theme.key_chat_inMediaIconSelected);
            RadialProgress2 radialProgress2 = this.radialProgress;
            RichMessageLayout richMessageLayout = this.root;
            radialProgress2.setProgressColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_outFileProgress : Theme.key_chat_inFileProgress));
            this.radialProgress.draw(canvas);
            SeekBar seekBar = this.seekBar;
            RichMessageLayout richMessageLayout2 = this.root;
            int themedColor = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? Theme.key_chat_outAudioSeekbar : Theme.key_chat_inAudioSeekbar);
            RichMessageLayout richMessageLayout3 = this.root;
            int themedColor2 = richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? Theme.key_chat_outAudioCacheSeekbar : Theme.key_chat_inAudioCacheSeekbar);
            RichMessageLayout richMessageLayout4 = this.root;
            int themedColor3 = richMessageLayout4.getThemedColor(richMessageLayout4.isOut() ? Theme.key_chat_outAudioSeekbarFill : Theme.key_chat_inAudioSeekbarFill);
            RichMessageLayout richMessageLayout5 = this.root;
            int themedColor4 = richMessageLayout5.getThemedColor(richMessageLayout5.isOut() ? Theme.key_chat_outAudioSeekbarFill : Theme.key_chat_inAudioSeekbarFill);
            RichMessageLayout richMessageLayout6 = this.root;
            seekBar.setColors(themedColor, themedColor2, themedColor3, themedColor4, richMessageLayout6.getThemedColor(richMessageLayout6.isOut() ? Theme.key_chat_outAudioSeekbarSelected : Theme.key_chat_inAudioSeekbarSelected));
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
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichAudioBlock.onTouchEvent(android.view.MotionEvent):boolean");
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

    public static class MediaCell implements DownloadController.FileDownloadProgressListener {
        public final float aspectRatio;
        public boolean autoDownload;
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
            this.buttonState = -1;
            this.buttonSize = AndroidUtilities.dp(48.0f);
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
        }

        private MediaCell(RichMessageLayout richMessageLayout, TL_iv.pageBlockVideo pageblockvideo) {
            float f;
            int i;
            this.imageReceiver = new ImageReceiver();
            this.buttonState = -1;
            this.buttonSize = AndroidUtilities.dp(48.0f);
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
            String str;
            String string;
            TLRPC.Photo photo = this.photo;
            if (photo != null && this.sizeFull != null) {
                TLRPC.PhotoSize photoSize = this.strippedSize;
                ImageLocation forPhoto = photoSize != null ? ImageLocation.getForPhoto(photoSize, photo) : null;
                if (z) {
                    this.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(this.sizeFull, this.photo), null, forPhoto, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
                } else {
                    this.imageReceiver.setImage(null, null, null, null, forPhoto, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("[richmedia] MediaCell.applyImage photo=" + this.photo.id + " allowMedia=" + z + " keys: image=" + this.imageReceiver.getImageKey() + " thumb=" + this.imageReceiver.getThumbKey());
                    return;
                }
                return;
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
                } else {
                    this.imageReceiver.setImage(null, null, forDocument2, null, forDocument, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
                }
                if (BuildVars.LOGS_ENABLED) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[richmedia] MediaCell.applyImage doc=");
                    sb.append(this.document.id);
                    sb.append(" allowMedia=");
                    sb.append(z);
                    sb.append(" isVideo=");
                    sb.append(this.isVideo);
                    sb.append(" realVideo=");
                    sb.append(this.realVideo);
                    sb.append(" allowAutoplay=");
                    sb.append(allowAutoplay());
                    sb.append(" forced=");
                    sb.append(this.mediaForced);
                    sb.append(" thumbs.size=");
                    sb.append(this.document.thumbs.size());
                    sb.append(" previewThumb=");
                    if (this.previewThumb == null) {
                        string = "null";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.previewThumb.type);
                        sb2.append(" ");
                        if (this.previewThumb.location == null) {
                            str = "noloc";
                        } else {
                            str = this.previewThumb.location.volume_id + "_" + this.previewThumb.location.local_id;
                        }
                        sb2.append(str);
                        string = sb2.toString();
                    }
                    sb.append(string);
                    sb.append(" strippedThumb=");
                    TLRPC.PhotoSize photoSize4 = this.strippedThumb;
                    sb.append(photoSize4 != null ? photoSize4.type : "null");
                    sb.append(" keys: media=");
                    sb.append(this.imageReceiver.getMediaKey());
                    sb.append(" image=");
                    sb.append(this.imageReceiver.getImageKey());
                    sb.append(" thumb=");
                    sb.append(this.imageReceiver.getThumbKey());
                    FileLog.d(sb.toString());
                }
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
            ensureProgress(view);
            updateButtonState(view, false);
        }

        public void detach() {
            this.imageReceiver.onDetachedFromWindow();
            DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
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
                    if (this.root.delegate != null) {
                        this.root.delegate.openArticlePhoto(this.root.cell, this.pageBlock);
                    }
                    return true;
                }
            }
            return false;
        }

        public void draw(Canvas canvas) {
            this.imageReceiver.draw(canvas);
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 == null || this.buttonState == -1) {
                return;
            }
            radialProgress2.draw(canvas);
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
        public final ArrayList<MediaCell> cells;
        private int contentHeight;
        private MediaCell pressedCell;

        public RichCollageBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockCollage pageblockcollage) {
            super(richMessageLayout, rect, i);
            this.cells = new ArrayList<>();
            this.block = pageblockcollage;
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
                i10++;
                b = 1;
            }
            this.contentHeight = iArr[i4];
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (mediaBgPaint == null) {
                Paint paint = new Paint(1);
                mediaBgPaint = paint;
                paint.setColor(251658240);
            }
            RichMessageLayout richMessageLayout = this.root;
            int i = richMessageLayout.padLeft;
            int i2 = richMessageLayout.padRight;
            int i3 = this.maxWidth;
            float f = (i3 <= 0 || (i <= 0 && i2 <= 0)) ? 1.0f : ((i3 + i) + i2) / i3;
            for (int i4 = 0; i4 < this.cells.size(); i4++) {
                MediaCell mediaCell = this.cells.get(i4);
                int iRound = Math.round(mediaCell.x * f) - i;
                float f2 = iRound;
                mediaCell.imageReceiver.setImageCoords(f2, mediaCell.y, Math.round(mediaCell.w * f), mediaCell.h);
                if (!mediaCell.imageReceiver.hasBitmapImage() || mediaCell.imageReceiver.getCurrentAlpha() != 1.0f) {
                    canvas.drawRect(f2, mediaCell.y, iRound + r6, r7 + mediaCell.h, mediaBgPaint);
                }
                mediaCell.draw(canvas);
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
        private static Drawable slideDotBigDrawable;
        private static Drawable slideDotDrawable;
        public final TL_iv.pageBlockSlideshow block;
        public final ArrayList<MediaCell> cells;
        private int currentPage;
        private int dotsHeight;
        private float downX;
        private float downY;
        private boolean dragging;
        private float pageOffset;
        private ValueAnimator settleAnimator;
        private int slideHeight;
        private int slideWidth;
        private int touchSlop;

        public RichSlideshowBlock(RichMessageLayout richMessageLayout, Rect rect, int i, TL_iv.pageBlockSlideshow pageblockslideshow) {
            super(richMessageLayout, rect, i);
            this.cells = new ArrayList<>();
            this.block = pageblockslideshow;
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
        protected void onDraw(android.graphics.Canvas r19) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichSlideshowBlock.onDraw(android.graphics.Canvas):void");
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
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean zOnTouchEvent;
            View view;
            int actionMasked = motionEvent.getActionMasked();
            Rect rect = this.padding;
            motionEvent.offsetLocation(-rect.left, -rect.top);
            try {
                if (actionMasked == 0) {
                    if (this.touchSlop == 0 && (view = this.view) != null) {
                        this.touchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                    }
                    this.downX = motionEvent.getX();
                    this.downY = motionEvent.getY();
                    this.dragging = false;
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
                    if (actionMasked != 2) {
                        if (actionMasked == 1 || actionMasked == 3) {
                            if (this.dragging) {
                                this.dragging = false;
                                requestDisallowParentIntercept(false);
                                settle();
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
                        Rect rect3 = this.padding;
                        motionEvent.offsetLocation(rect3.left, rect3.top);
                        return false;
                    }
                    float x = motionEvent.getX() - this.downX;
                    float y = motionEvent.getY() - this.downY;
                    if (!this.dragging && Math.abs(x) > this.touchSlop && Math.abs(x) > Math.abs(y)) {
                        this.dragging = true;
                        requestDisallowParentIntercept(true);
                        int i3 = this.currentPage;
                        if (i3 >= 0 && i3 < this.cells.size()) {
                            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                            motionEventObtain.setAction(3);
                            this.cells.get(this.currentPage).onTouchEvent(motionEventObtain, this.view);
                            motionEventObtain.recycle();
                        }
                    }
                    if (this.dragging) {
                        float f = (-x) / this.slideWidth;
                        int i4 = this.currentPage;
                        if (i4 == 0 && f < 0.0f) {
                            f *= 0.3f;
                        }
                        if (i4 == this.cells.size() - 1 && f > 0.0f) {
                            f *= 0.3f;
                        }
                        this.pageOffset = f;
                        View view2 = this.view;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                    } else {
                        int i5 = this.currentPage;
                        if (i5 >= 0 && i5 < this.cells.size()) {
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
                Rect rect4 = this.padding;
                motionEvent.offsetLocation(rect4.left, rect4.top);
                return true;
            } catch (Throwable th) {
                Rect rect5 = this.padding;
                motionEvent.offsetLocation(rect5.left, rect5.top);
                throw th;
            }
        }

        private void settle() {
            int i = (this.pageOffset <= 0.5f || this.currentPage >= this.cells.size() - 1) ? (this.pageOffset >= -0.5f || this.currentPage <= 0) ? 0 : -1 : 1;
            final int i2 = i + this.currentPage;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.pageOffset, i2 - r3);
            this.settleAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(220L);
            this.settleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$settle$0(valueAnimator);
                }
            });
            this.settleAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    RichSlideshowBlock.this.currentPage = i2;
                    RichSlideshowBlock.this.pageOffset = 0.0f;
                    View view = RichSlideshowBlock.this.view;
                    if (view != null) {
                        view.invalidate();
                    }
                }
            });
            this.settleAnimator.start();
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
        private CheckBoxBase checkbox;
        private float checkboxY;
        public float currY;
        protected int layoutRow;
        protected int layoutX;
        protected int layoutY;
        public final int maxWidth;
        private StaticLayout numLayout;
        private int numLayoutLeft;
        private int numLayoutRight;
        private float numLayoutY;
        public final Rect padding;
        public RichDetailsBlock parentDetails;
        public float prevY;
        public final RichMessageLayout root;
        public MultiLayoutTypingAnimator typingAnimator;
        protected View view;
        public boolean currVisible = true;
        public boolean prevVisible = true;

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

        public boolean isHorizontallyDragging() {
            return false;
        }

        protected void onAttachedToWindow() {
        }

        protected void onDetachedFromWindow() {
        }

        protected void onDraw(Canvas canvas) {
        }

        protected boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
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

        public void snapshot() {
            this.prevY = this.currY;
            this.prevVisible = this.currVisible;
        }

        public void setNum(String str) {
            this.root.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
            this.numLayout = new StaticLayout(str, this.root.numTextPaint, AndroidUtilities.dp(r1.fontSize + 4), this.root.isRtl() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
            this.numLayoutLeft = AndroidUtilities.dp(this.root.fontSize + 4);
            this.numLayoutRight = 0;
            for (int i = 0; i < this.numLayout.getLineCount(); i++) {
                this.numLayoutLeft = Math.min(this.numLayoutLeft, (int) this.numLayout.getLineLeft(i));
                this.numLayoutRight = Math.max(this.numLayoutRight, (int) this.numLayout.getLineRight(i));
            }
            if (getLayout() == null || getLayout().getLineCount() <= 0 || this.numLayout.getLineCount() <= 0) {
                int iDp = AndroidUtilities.dp(this.root.fontSize + 14);
                int height = getHeight();
                Rect rect = this.padding;
                this.numLayoutY = (Math.min(iDp, (height - rect.top) - rect.bottom) - this.numLayout.getHeight()) / 2.0f;
                return;
            }
            this.numLayoutY = (this.padding.top + getLayout().getLineBaseline(0)) - this.numLayout.getLineBaseline(0);
        }

        public void setCheckbox(boolean z) {
            if (this.checkbox == null) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(null, 20, this.root.resourcesProvider);
                this.checkbox = checkBoxBase;
                checkBoxBase.setColor(Theme.key_telegram_color, Theme.key_dialogCheckboxSquareDisabled, Theme.key_checkboxCheck);
                this.checkbox.setBackgroundType(10);
                this.checkbox.setDrawUnchecked(true);
                this.checkbox.setCustomRadius(AndroidUtilities.dp(5.0f));
            }
            this.checkbox.setChecked(z, false);
            if (getLayout() == null || getLayout().getLineCount() <= 0) {
                int iDp = AndroidUtilities.dp(this.root.fontSize + 14);
                int height = getHeight();
                Rect rect = this.padding;
                this.checkboxY = (Math.min(iDp, (height - rect.top) - rect.bottom) - AndroidUtilities.dp(20.0f)) / 2.0f;
                return;
            }
            this.checkboxY = (this.padding.top + getLayout().getLineBaseline(0)) - (AndroidUtilities.dp(20.0f) * 0.7f);
        }

        public void draw(Canvas canvas) {
            draw(canvas, Integer.MIN_VALUE, 0.0f);
        }

        public void draw(Canvas canvas, int i, float f) {
            canvas.save();
            Rect rect = this.padding;
            canvas.translate(rect.left, rect.top);
            if (this.numLayout != null) {
                this.root.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                RichMessageLayout richMessageLayout = this.root;
                richMessageLayout.numTextPaint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? Theme.key_chat_messageTextOut : Theme.key_chat_messageTextIn));
                canvas.save();
                if (this.root.isRtl()) {
                    int minWidth = (this.root.getMinWidth() + this.root.padRight) - AndroidUtilities.dp(14.0f);
                    Rect rect2 = this.padding;
                    canvas.translate(((minWidth - rect2.right) - rect2.left) + ((AndroidUtilities.dp(this.root.fontSize + 4) - (this.numLayoutRight - this.numLayoutLeft)) / 2.0f), this.numLayoutY);
                } else {
                    canvas.translate(((((-this.numLayoutLeft) - this.numLayoutRight) - AndroidUtilities.dp(this.root.fontSize + 4)) / 2.0f) - (this.checkbox != null ? AndroidUtilities.dp(26.0f) : 0), this.numLayoutY);
                }
                this.numLayout.draw(canvas);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.checkbox;
            if (checkBoxBase != null) {
                checkBoxBase.setBounds(-AndroidUtilities.dp(26.0f), (int) this.checkboxY, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.checkbox.draw(canvas);
            }
            if (i == Integer.MIN_VALUE) {
                onDraw(canvas);
            } else {
                onDrawFaded(canvas, i, f);
            }
            canvas.restore();
        }

        public boolean touchEvent(MotionEvent motionEvent) {
            Rect rect = this.padding;
            motionEvent.offsetLocation(-rect.left, -rect.top);
            boolean zOnTouchEvent = onTouchEvent(motionEvent);
            Rect rect2 = this.padding;
            motionEvent.offsetLocation(rect2.left, rect2.top);
            return zOnTouchEvent;
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
                    canvas.translate(text.x - text.left, text.y - this.currY);
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
                this.view = null;
            }
            this.view = view;
            onAttachedToWindow();
        }

        public void detach(View view) {
            View view2 = this.view;
            if (view2 != null && view2 == view) {
                onDetachedFromWindow();
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

    public static class PreviewView extends View implements TextSelectionHelper.ArticleSelectableView {
        private boolean allowActions;
        private final int currentAccount;
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
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                for (int i = 0; i < this.layout.textBlocks.size(); i++) {
                    arrayList.add(new PaddedTextLayoutBlock(this.layout.textBlocks.get(i), paddingLeft, paddingTop));
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
                richMessageLayout4.quoteLine.check(this.messageObject, null, null, this.resourcesProvider, 1);
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
            buildLayout((size - getPaddingLeft()) - getPaddingRight());
            RichMessageLayout richMessageLayout = this.layout;
            int height = (richMessageLayout != null ? richMessageLayout.getHeight() : 0) + getPaddingTop() + getPaddingBottom();
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
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            boolean z = this.layout.getHeight() > (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (z) {
                canvas.saveLayerAlpha(0.0f, 0.0f, (getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom(), 255, 31);
            }
            this.layout.draw(canvas, getPaddingLeft(), Math.max(0, (getWidth() - this.layout.getMinWidth()) - getPaddingLeft()), null, 0.0f, height);
            if (this.layout.hasOverlay()) {
                this.layout.drawOverlay(canvas, null);
            }
            if (z) {
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, ((getHeight() - getPaddingBottom()) - getPaddingTop()) - AndroidUtilities.dp(24.0f), (getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingBottom()) - getPaddingTop());
                this.layout.clip.draw(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
            if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            for (int i = 0; i < this.layout.textBlocks.size(); i++) {
                TextSelectionHelper.TextLayoutBlock textLayoutBlock = this.layout.textBlocks.get(i);
                canvas.save();
                canvas.translate(textLayoutBlock.getX() + paddingLeft, textLayoutBlock.getY() + paddingTop);
                this.textSelectionHelper.draw(canvas, this, i);
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
                motionEvent.offsetLocation(-getPaddingLeft(), -getPaddingTop());
                boolean zOnTouchEvent = this.layout.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(getPaddingLeft(), getPaddingTop());
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
