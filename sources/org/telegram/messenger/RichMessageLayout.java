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
import android.text.Spannable;
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
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.ToIntFunction;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.c21;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.cj0;
import org.telegram.ui.dj0;
import org.telegram.ui.ej0;
import org.telegram.ui.kb0;
import org.telegram.ui.s10;
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
    public final HashMap<String, Integer> anchors;
    public final HashMap<TL_iv.pageBlockAudio, MessageObject> audioBlocks;
    public final ArrayList<MessageObject> audioMessages;
    public boolean blockquoteAnimating;
    public final ArrayList<RichBlock> blocks;
    private org.telegram.ui.Cells.t1 cell;
    public final s10 clip;
    public final int currentAccount;
    private org.telegram.ui.Cells.k1 delegate;
    private float density;
    public boolean detailsAnimating;
    private float detailsAnimationProgress;
    private int fontSize;
    public boolean forceTranslationLoading;
    protected int height;
    public boolean invalidateAnimatedEmojiInParent;
    public boolean isPart;
    public CharSequence joinedText;
    protected int maxWidth;
    public final MessageObject messageObject;
    protected int minWidth;
    public final TextPaint numTextPaint;
    public int padLeft;
    public int padRight;
    private RichBlock pressedBlock;
    private int pressedBlockY;
    private RichMessageLayout prev;
    private Drawable pullquoteIcon;
    public final dl0 quoteLine;
    public final ArrayList<QuoteBackground> quotes;
    protected org.telegram.ui.ActionBar.b6 resourcesProvider;
    public TL_iv.RichMessage richMessage;
    private org.telegram.ui.Components.pc showMoreBounce;
    private p80 showMoreLoading;
    private Paint showMorePaint;
    private boolean showMorePressed;
    private final RectF showMoreRect;
    private nz0 showMoreText;
    private dh.k spoilerEffect2;
    public final HashMap<String, TL_iv.textAnchor> textAnchors;
    public final ArrayList<Integer> textBlockBlockIndex;
    public final ArrayList<Integer> textBlockCharOffsets;
    public final ArrayList<org.telegram.ui.Cells.y9> textBlocks;
    public final TextPaint textPaint;
    private org.telegram.ui.Components.y5 translationLoadingFloat;
    public float translationLoadingValue;
    public ej0 typingAnimator;
    public final ArrayList<RichUnsupportedBlock> unsupportedBlocks;
    public final ArrayList<RichUnsupportedBlock> unsupportedBlocksRoot;
    public View view;

    public static class FoundLink {
        public int end;
        public StaticLayout layout;
        public int originalWidth;
        public int start;
        public float f19655x;
        public float f19656y;
    }

    public static class PreviewView extends View implements org.telegram.ui.Cells.m9 {
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
        private org.telegram.ui.ActionBar.b6 resourcesProvider;
        private TL_iv.RichMessage richMessage;
        private org.telegram.ui.Cells.n9 textSelectionHelper;
        private Runnable textSelectionLongPressRunnable;
        private boolean translationLoading;

        public static final class Factory extends k41 {
            static {
                k41.setup(new Factory());
            }

            public static l41 of(TL_iv.RichMessage richMessage) {
                l41 J = l41.J(Factory.class);
                J.G = richMessage;
                return J;
            }

            @Override
            public void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
                PreviewView previewView = (PreviewView) view;
                previewView.set((TL_iv.RichMessage) l41Var.G);
                previewView.setTranslationLoading(l41Var.f30333e);
            }

            @Override
            public boolean contentsEquals(l41 l41Var, l41 l41Var2) {
                if (l41Var.d == l41Var2.d && l41Var.G == l41Var2.G && l41Var.f30333e == l41Var2.f30333e) {
                    return true;
                }
                return false;
            }

            @Override
            public boolean equals(l41 l41Var, l41 l41Var2) {
                if (l41Var.d == l41Var2.d) {
                    return true;
                }
                return false;
            }

            @Override
            public boolean isClickable() {
                return false;
            }

            @Override
            public PreviewView createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
                PreviewView previewView = new PreviewView(context, i9, b6Var);
                previewView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
                return previewView;
            }
        }

        public static class PaddedTextLayoutBlock implements org.telegram.ui.Cells.y9 {
            private final org.telegram.ui.Cells.y9 inner;
            private final int px;
            private final int py;

            public PaddedTextLayoutBlock(org.telegram.ui.Cells.y9 y9Var, int i9, int i10) {
                this.inner = y9Var;
                this.px = i9;
                this.py = i10;
            }

            @Override
            public Layout getLayout() {
                return this.inner.getLayout();
            }

            @Override
            public CharSequence getPrefix() {
                return this.inner.getPrefix();
            }

            @Override
            public int getRow() {
                return this.inner.getRow();
            }

            @Override
            public Rect getSelectionBounds() {
                return null;
            }

            @Override
            public CharSequence getText() {
                return this.inner.getText();
            }

            @Override
            public int getX() {
                return this.inner.getX() + this.px;
            }

            @Override
            public int getY() {
                return this.inner.getY() + this.py;
            }
        }

        public PreviewView(Context context) {
            this(context, UserConfig.selectedAccount, null);
        }

        private void buildLayout(int i9) {
            TL_iv.RichMessage richMessage;
            if (i9 > 0 && (richMessage = this.richMessage) != null) {
                RichMessageLayout richMessageLayout = this.layout;
                if (richMessageLayout == null || richMessageLayout.needsUpdate(richMessage, i9)) {
                    RichMessageLayout richMessageLayout2 = this.layout;
                    if (richMessageLayout2 != null) {
                        richMessageLayout2.detach(this);
                    }
                    RichMessageLayout richMessageLayout3 = new RichMessageLayout(this.messageObject, i9, (RichMessageLayout) null);
                    this.layout = richMessageLayout3;
                    richMessageLayout3.forceTranslationLoading = this.translationLoading;
                    richMessageLayout3.setResourcesProvider(this.resourcesProvider);
                    RichMessageLayout richMessageLayout4 = this.layout;
                    richMessageLayout4.invalidateAnimatedEmojiInParent = true;
                    richMessageLayout4.checkQuoteLine(null, null);
                    if (isAttachedToWindow()) {
                        this.layout.attach(this);
                        this.layout.updateAnimatedEmojis(0);
                        return;
                    }
                    return;
                }
                return;
            }
            this.layout = null;
        }

        public void lambda$onTouchEvent$0() {
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null && richMessageLayout.isPressingLink()) {
                return;
            }
            this.textSelectionHelper.m0();
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<org.telegram.ui.Cells.y9> arrayList) {
            if (this.layout != null) {
                int i9 = this.insetLeft;
                int i10 = this.insetTop;
                for (int i11 = 0; i11 < this.layout.textBlocks.size(); i11++) {
                    arrayList.add(new PaddedTextLayoutBlock(this.layout.textBlocks.get(i11), i9, i10));
                }
            }
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.attach(this);
                this.layout.updateAnimatedEmojis(0);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            boolean z10;
            if (this.layout != null) {
                float height = (getHeight() - this.insetTop) - this.insetBottom;
                if (this.layout.getHeight() > (getHeight() - this.insetTop) - this.insetBottom) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                canvas.save();
                if (z10) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                }
                canvas.translate(this.insetLeft, this.insetTop);
                this.layout.draw(canvas, this.insetLeft, Math.max(0, (getWidth() - this.layout.getMinWidth()) - this.insetLeft), null, 0.0f, height);
                if (this.layout.hasOverlay()) {
                    this.layout.drawOverlay(canvas, null);
                }
                if (z10) {
                    canvas.translate(-this.insetLeft, -this.insetTop);
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, getHeight() - AndroidUtilities.dp(24.0f), getWidth(), getHeight());
                    this.layout.clip.b(canvas, rectF, 3, 1.0f);
                    canvas.restore();
                    canvas.restore();
                }
                canvas.restore();
                org.telegram.ui.Cells.n9 n9Var = this.textSelectionHelper;
                if (n9Var != null && n9Var.y()) {
                    int i9 = this.insetLeft;
                    int i10 = this.insetTop;
                    for (int i11 = 0; i11 < this.layout.textBlocks.size(); i11++) {
                        org.telegram.ui.Cells.y9 y9Var = this.layout.textBlocks.get(i11);
                        canvas.save();
                        canvas.translate(y9Var.getX() + i9, y9Var.getY() + i10);
                        this.textSelectionHelper.a0(canvas, this, i11);
                        canvas.restore();
                    }
                }
            }
        }

        @Override
        public void onMeasure(int i9, int i10) {
            int i11;
            int size = View.MeasureSpec.getSize(i9);
            buildLayout((size - this.insetLeft) - this.insetRight);
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                i11 = richMessageLayout.getHeight();
            } else {
                i11 = 0;
            }
            int i12 = i11 + this.insetTop + this.insetBottom;
            int i13 = this.maxHeight;
            if (i13 > 0 && i12 > i13) {
                i12 = i13;
            }
            int i14 = this.minHeight;
            if (i14 > 0 && i12 < i14) {
                i12 = i14;
            }
            int mode = View.MeasureSpec.getMode(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                    i12 = View.MeasureSpec.getSize(i10);
                }
            } else {
                i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
            }
            setMeasuredDimension(size, i12);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            Runnable runnable;
            if (!this.allowActions) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.textSelectionHelper != null) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if ((action == 1 || action == 2 || action == 3) && (runnable = this.textSelectionLongPressRunnable) != null) {
                        removeCallbacks(runnable);
                    }
                } else {
                    this.textSelectionHelper.l0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                    if (this.textSelectionLongPressRunnable == null) {
                        this.textSelectionLongPressRunnable = new ng(this, 6);
                    }
                    removeCallbacks(this.textSelectionLongPressRunnable);
                    postDelayed(this.textSelectionLongPressRunnable, ViewConfiguration.getLongPressTimeout());
                }
            }
            if (this.layout != null) {
                motionEvent.offsetLocation(-this.insetLeft, -this.insetTop);
                boolean onTouchEvent = this.layout.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(this.insetLeft, this.insetTop);
                if (onTouchEvent) {
                    return true;
                }
            }
            return super.onTouchEvent(motionEvent);
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

        public void setAllowActions(boolean z10) {
            this.allowActions = z10;
        }

        public void setMaxHeight(int i9) {
            this.maxHeight = i9;
        }

        public void setMinHeight(int i9) {
            this.minHeight = i9;
        }

        @Override
        public void setPadding(int i9, int i10, int i11, int i12) {
            if (this.insetLeft == i9 && this.insetTop == i10 && this.insetRight == i11 && this.insetBottom == i12) {
                return;
            }
            this.insetLeft = i9;
            this.insetTop = i10;
            this.insetRight = i11;
            this.insetBottom = i12;
            requestLayout();
            invalidate();
        }

        public void setResourcesProvider(org.telegram.ui.ActionBar.b6 b6Var) {
            this.resourcesProvider = b6Var;
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.setResourcesProvider(b6Var);
            }
        }

        public void setTextSelectionHelper(org.telegram.ui.Cells.n9 n9Var) {
            this.textSelectionHelper = n9Var;
        }

        public void setTranslationLoading(boolean z10) {
            this.translationLoading = z10;
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.forceTranslationLoading = z10;
            }
            invalidate();
        }

        public PreviewView(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
            super(context);
            this.minHeight = -1;
            this.maxHeight = -1;
            this.allowActions = true;
            this.currentAccount = i9;
            this.resourcesProvider = b6Var;
            NotificationCenter.listenEmojiLoading(this);
        }
    }

    public static class QuoteBackground {
        int endBlockIndex;
        int level;
        int outerBottomVpad;
        int outerTopVpad;
        int padding;
        int startBlockIndex;

        public QuoteBackground(int i9, int i10, int i11, int i12) {
            this(i9, i10, i11, i12, 0, 0);
        }

        public QuoteBackground(int i9, int i10, int i11, int i12, int i13) {
            this(i9, i10, i11, i12, i13, i13);
        }

        public QuoteBackground(int i9, int i10, int i11, int i12, int i13, int i14) {
            this.startBlockIndex = i9;
            this.endBlockIndex = i10;
            this.padding = i11;
            this.level = i12;
            this.outerTopVpad = i13;
            this.outerBottomVpad = i14;
        }
    }

    public static abstract class RichBlock implements cj0 {
        public int accessibilityLabelResId;
        public int accessibilityParentLabelResId;
        private CheckBoxBase checkbox;
        private org.telegram.ui.Components.pc checkboxBounce;
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
        public ej0 typingAnimator;
        protected View view;
        private final RectF checkboxHit = new RectF();
        public boolean currVisible = true;
        public boolean prevVisible = true;

        public RichBlock(RichMessageLayout richMessageLayout, Rect rect, int i9) {
            this.root = richMessageLayout;
            this.padding = new Rect(rect);
            this.maxWidth = (i9 - rect.left) - rect.right;
        }

        public static void appendText(SpannableStringBuilder spannableStringBuilder, Text text, Text[] textArr) {
            StaticLayout staticLayout;
            StaticLayout staticLayout2;
            if (text != null && (staticLayout2 = text.layout) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
                spannableStringBuilder.append(withReplacements(text.layout.getText()));
            } else if (textArr != null) {
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

        private boolean canToggleCheckbox() {
            if (this.checkbox != null && this.checkboxItem != null && this.root.getCell() != null && this.root.getDelegate() != null && this.root.getDelegate().X(this.root.getCell())) {
                return true;
            }
            return false;
        }

        private int getCheckboxAccessibilityElementCount() {
            if (this.checkbox == null) {
                return 0;
            }
            return 1;
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
            if (checkBoxBase != null && checkBoxBase.f26313q) {
                return true;
            }
            return false;
        }

        private void invalidateCell() {
            View view = this.root.view;
            if (view != null) {
                view.invalidate();
            }
        }

        public void lambda$toggleCheckbox$1(boolean z10) {
            setCheckboxChecked(!z10);
            View view = this.root.view;
            if (view != null) {
                this.checkbox.f26299a = view;
            }
            this.checkbox.f(-1, !z10, true);
            invalidateCell();
        }

        public static int lambda$withReplacements$0(Spanned spanned, org.telegram.ui.Cells.t9 t9Var, org.telegram.ui.Cells.t9 t9Var2) {
            return spanned.getSpanStart(t9Var2) - spanned.getSpanStart(t9Var);
        }

        private void setCheckboxChecked(boolean z10) {
            TLObject tLObject = this.checkboxItem;
            if (tLObject instanceof TL_iv.PageListItem) {
                ((TL_iv.PageListItem) tLObject).checked = z10;
            } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                ((TL_iv.PageListOrderedItem) tLObject).checked = z10;
            }
        }

        private void toggleCheckbox() {
            if (!canToggleCheckbox()) {
                return;
            }
            if (!MessagesController.getInstance(this.root.currentAccount).richEditorAllowed()) {
                new zf.x0(this.root.cell.getContext(), 43, this.root.resourcesProvider).show();
                return;
            }
            boolean z10 = !getCheckboxChecked();
            setCheckboxChecked(z10);
            View view = this.root.view;
            if (view != null) {
                this.checkbox.f26299a = view;
            }
            this.checkbox.f(-1, z10, true);
            invalidateCell();
            View view2 = this.root.view;
            if (view2 != null) {
                view2.performHapticFeedback(3, 2);
            }
            this.root.getDelegate().w1(this.root.getCell(), new eh.f(16, this, z10));
        }

        public static CharSequence withReplacements(CharSequence charSequence) {
            if (!(charSequence instanceof Spanned)) {
                return charSequence;
            }
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Cells.t9[] t9VarArr = (org.telegram.ui.Cells.t9[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Cells.t9.class);
            if (t9VarArr != null && t9VarArr.length != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                Arrays.sort(t9VarArr, new nh(spanned, 0));
                for (org.telegram.ui.Cells.t9 t9Var : t9VarArr) {
                    int spanStart = spanned.getSpanStart(t9Var);
                    int spanEnd = spanned.getSpanEnd(t9Var);
                    if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                        CharSequence charSequence2 = t9Var.f25719a;
                        if (charSequence2 == null) {
                            charSequence2 = "";
                        }
                        spannableStringBuilder.replace(spanStart, spanEnd, charSequence2);
                    }
                }
                return spannableStringBuilder;
            }
            return charSequence;
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
                    checkBoxBase.f26308l = false;
                }
                this.view = null;
            }
            this.view = view;
            CheckBoxBase checkBoxBase2 = this.checkbox;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f26299a = view;
                checkBoxBase2.f26308l = true;
            }
            onAttachedToWindow();
        }

        public void collectAnimatorBlocks(List<cj0> list) {
            list.add(this);
        }

        public void detach(View view) {
            View view2 = this.view;
            if (view2 == null || view2 != view) {
                return;
            }
            onDetachedFromWindow();
            CheckBoxBase checkBoxBase = this.checkbox;
            if (checkBoxBase != null) {
                checkBoxBase.f26308l = false;
            }
            this.view = null;
        }

        public void draw(Canvas canvas) {
            draw(canvas, Integer.MIN_VALUE, 0.0f);
        }

        public boolean drawOverlay(Canvas canvas) {
            return drawOverlay(canvas, null);
        }

        public void drawWithTyping(Canvas canvas) {
            int i9;
            ej0 ej0Var = this.typingAnimator;
            if (ej0Var != null && ej0Var.h && ej0Var.d(this) >= 0) {
                if (ej0Var.j(this)) {
                    float f10 = 0.0f;
                    if (ej0Var.g(this)) {
                        if (ej0Var.g(this)) {
                            i9 = ej0Var.f37973e;
                        } else {
                            i9 = -1;
                        }
                        if (ej0Var.g(this)) {
                            f10 = ej0Var.f37974f;
                        }
                        draw(canvas, i9, f10);
                        return;
                    }
                    float c10 = ej0Var.c(this);
                    if (c10 <= 0.0f) {
                        return;
                    }
                    if (c10 < 1.0f) {
                        Rect rect = this.padding;
                        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.maxWidth + rect.right, getHeight(), (int) (c10 * 255.0f));
                        draw(canvas);
                        canvas.restoreToCount(saveLayerAlpha);
                        return;
                    }
                } else {
                    return;
                }
            }
            draw(canvas);
        }

        public boolean findLink(CharacterStyle characterStyle, int i9, FoundLink foundLink) {
            Text text;
            org.telegram.ui.Cells.y9[] text2 = getText();
            if (text2 == null) {
                return false;
            }
            for (org.telegram.ui.Cells.y9 y9Var : text2) {
                if (y9Var instanceof Text) {
                    if (((Text) y9Var).fillFoundLink(characterStyle, foundLink)) {
                        Rect rect = this.padding;
                        foundLink.f19655x = rect.left - text.left;
                        foundLink.f19656y = i9 + rect.top;
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean forcesTimeToNewLine() {
            if (getLastLineWidth() >= getMinWidth()) {
                return true;
            }
            return false;
        }

        public final void getAccessibilityElementBounds(int i9, Rect rect) {
            if (this.checkbox != null && i9 == 0) {
                int i10 = this.padding.left;
                float f10 = this.currY;
                rect.set(i10, (int) f10, this.maxWidth + i10, (int) (f10 + getHeight()));
            } else {
                getBlockAccessibilityElementBounds(i9 - getCheckboxAccessibilityElementCount(), rect);
            }
            RichMessageLayout richMessageLayout = this.root;
            int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            int min = Math.min(minWidth, Math.max(rect.left, -richMessageLayout.padLeft));
            rect.left = min;
            rect.right = Math.max(min, Math.min(rect.right, minWidth));
        }

        public final int getAccessibilityElementCount() {
            return getBlockAccessibilityElementCount() + getCheckboxAccessibilityElementCount();
        }

        public final CharSequence getAccessibilityElementStateDescription(int i9) {
            int i10;
            if (isAccessibilityElementCheckbox(i9)) {
                if (getCheckboxChecked()) {
                    i10 = R.string.AccDescrChecked;
                } else {
                    i10 = R.string.AccDescrNotChecked;
                }
                return LocaleController.getString(i10);
            }
            return getBlockAccessibilityElementStateDescription(i9 - getCheckboxAccessibilityElementCount());
        }

        public final CharSequence getAccessibilityElementText(int i9) {
            if (this.checkbox != null && i9 == 0) {
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
                if (spannableStringBuilder.length() > 0) {
                    return spannableStringBuilder;
                }
                return LocaleController.getString(R.string.AccDescrCheckbox);
            }
            return getBlockAccessibilityElementText(i9 - getCheckboxAccessibilityElementCount());
        }

        public CharSequence getAccessibilityLabel() {
            String string;
            int i9 = this.accessibilityParentLabelResId;
            String str = null;
            if (i9 == 0) {
                string = null;
            } else {
                string = LocaleController.getString(i9);
            }
            int i10 = this.accessibilityLabelResId;
            if (i10 != 0) {
                str = LocaleController.getString(i10);
            }
            if (TextUtils.isEmpty(string)) {
                return str;
            }
            if (TextUtils.isEmpty(str)) {
                return string;
            }
            return TextUtils.concat(string, ", ", str);
        }

        public CharSequence getAccessibilityListMarker() {
            StaticLayout staticLayout;
            if (this.listOrdered && (staticLayout = this.numLayout) != null) {
                return staticLayout.getText();
            }
            return null;
        }

        public float getBackgroundScale() {
            return 1.0f;
        }

        public void getBlockAccessibilityElementBounds(int i9, Rect rect) {
            int i10 = this.padding.left;
            float f10 = this.currY;
            rect.set(i10, (int) f10, this.maxWidth + i10, (int) (f10 + getHeight()));
        }

        public int getBlockAccessibilityElementCount() {
            return 0;
        }

        public CharSequence getBlockAccessibilityElementStateDescription(int i9) {
            return null;
        }

        public CharSequence getBlockAccessibilityElementText(int i9) {
            return null;
        }

        public int getContentPaddingTop() {
            return 0;
        }

        public int getHeight() {
            return 0;
        }

        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public Layout getLayout() {
            return null;
        }

        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.maxWidth + rect.right;
        }

        @Override
        public View getParentView() {
            return null;
        }

        public org.telegram.ui.Cells.y9[] getText() {
            return null;
        }

        public final boolean isAccessibilityElementCheckbox(int i9) {
            if (this.checkbox != null && i9 == 0) {
                return true;
            }
            return false;
        }

        public final boolean isAccessibilityElementChecked(int i9) {
            if (isAccessibilityElementCheckbox(i9) && getCheckboxChecked()) {
                return true;
            }
            return false;
        }

        public final boolean isAccessibilityElementClickable(int i9) {
            if (isAccessibilityElementCheckbox(i9) && !canToggleCheckbox()) {
                return false;
            }
            return true;
        }

        public final boolean isAccessibilityElementText(int i9) {
            if (!isAccessibilityElementCheckbox(i9) && isBlockAccessibilityElementText(i9 - getCheckboxAccessibilityElementCount())) {
                return true;
            }
            return false;
        }

        public boolean isAttachedToWindow() {
            if (this.view != null) {
                return true;
            }
            return false;
        }

        public boolean isBlockAccessibilityElementText(int i9) {
            return false;
        }

        public boolean isHorizontallyDragging() {
            return false;
        }

        public boolean isInQuote() {
            int indexOf;
            if (this.root.quotes.isEmpty() || (indexOf = this.root.blocks.indexOf(this)) < 0) {
                return false;
            }
            for (int i9 = 0; i9 < this.root.quotes.size(); i9++) {
                QuoteBackground quoteBackground = this.root.quotes.get(i9);
                if (indexOf >= quoteBackground.startBlockIndex && indexOf <= quoteBackground.endBlockIndex) {
                    return true;
                }
            }
            return false;
        }

        public boolean isPressingLink() {
            org.telegram.ui.Cells.y9[] text = getText();
            if (text == null) {
                return false;
            }
            for (org.telegram.ui.Cells.y9 y9Var : text) {
                if ((y9Var instanceof Text) && ((Text) y9Var).isPressingLink()) {
                    return true;
                }
            }
            return false;
        }

        public boolean isVisible() {
            RichDetailsBlock richDetailsBlock = this.parentDetails;
            if (richDetailsBlock == null) {
                return true;
            }
            if (!richDetailsBlock.isOpen()) {
                return false;
            }
            return this.parentDetails.isVisible();
        }

        public final boolean onAccessibilityElementClick(int i9, View view) {
            if (this.checkbox != null && i9 == 0) {
                if (!canToggleCheckbox()) {
                    return false;
                }
                toggleCheckbox();
                return true;
            }
            return onBlockAccessibilityElementClick(i9 - getCheckboxAccessibilityElementCount(), view);
        }

        public boolean onBlockAccessibilityElementClick(int i9, View view) {
            return false;
        }

        public void onDrawFaded(Canvas canvas, int i9, float f10) {
            onDraw(canvas);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void placeTexts(int i9, int i10, int i11) {
            this.layoutX = i9;
            this.layoutY = i10;
            this.layoutRow = i11;
            org.telegram.ui.Cells.y9[] text = getText();
            if (text != null) {
                for (org.telegram.ui.Cells.y9 y9Var : text) {
                    if (y9Var instanceof Text) {
                        Text text2 = (Text) y9Var;
                        text2.setX(i9 - text2.left);
                        text2.setY(i10);
                        text2.setRow(i11);
                    }
                }
            }
        }

        public void requestDisallowParentIntercept(boolean z10) {
            View view = this.view;
            if (view != null) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    parent.requestDisallowInterceptTouchEvent(z10);
                }
            }
        }

        public void setCheckbox(boolean z10) {
            setCheckbox(z10, null);
        }

        public void setListMarkerWidth(int i9) {
            this.listMarkerWidth = i9;
        }

        public void setNum(String str) {
            CharSequence text;
            String str2;
            int i9;
            Layout.Alignment alignment;
            this.root.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
            Layout layout = getLayout();
            if (layout == null) {
                text = null;
            } else {
                text = layout.getText();
            }
            if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
                for (StyleSpan styleSpan : (StyleSpan[]) ((Spanned) text).getSpans(0, 1, StyleSpan.class)) {
                    if (TLObject.hasFlag(styleSpan.flags, 16)) {
                        SpannableString spannableString = new SpannableString(str);
                        spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 33);
                        str2 = spannableString;
                        break;
                    }
                }
            }
            str2 = str;
            int i10 = this.listMarkerWidth;
            if (i10 <= 0) {
                if (this.root.isRtl()) {
                    i9 = this.padding.right;
                } else {
                    i9 = this.padding.left;
                }
                i10 = Math.max(i9, AndroidUtilities.dp(this.root.fontSize + 4));
            }
            int i11 = i10;
            RichMessageLayout richMessageLayout = this.root;
            TextPaint textPaint = richMessageLayout.numTextPaint;
            if (richMessageLayout.isRtl()) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            this.numLayout = new StaticLayout(str2, textPaint, i11, alignment, 1.0f, 0.0f, false);
            this.numLayoutLeft = AndroidUtilities.dp(this.root.fontSize + 4);
            this.numLayoutRight = 0;
            for (int i12 = 0; i12 < this.numLayout.getLineCount(); i12++) {
                this.numLayoutLeft = Math.min(this.numLayoutLeft, (int) this.numLayout.getLineLeft(i12));
                this.numLayoutRight = Math.max(this.numLayoutRight, (int) this.numLayout.getLineRight(i12));
            }
            updateListMarkerY();
        }

        public void snapshot() {
            this.prevY = this.currY;
            this.prevH = this.currH;
            this.prevVisible = this.currVisible;
        }

        public boolean touchEvent(MotionEvent motionEvent) {
            boolean z10;
            View view;
            Rect rect = this.padding;
            motionEvent.offsetLocation(-rect.left, -rect.top);
            try {
                if (this.checkbox != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    boolean contains = this.checkboxHit.contains(motionEvent.getX(), motionEvent.getY());
                    if (actionMasked == 0) {
                        if (contains && canToggleCheckbox()) {
                            this.checkboxPressed = true;
                            if (this.checkboxBounce == null && (view = this.root.view) != null) {
                                this.checkboxBounce = new org.telegram.ui.Components.pc(view);
                            }
                            org.telegram.ui.Components.pc pcVar = this.checkboxBounce;
                            if (pcVar != null) {
                                pcVar.c(true);
                            }
                            invalidateCell();
                            Rect rect2 = this.padding;
                            motionEvent.offsetLocation(rect2.left, rect2.top);
                            return true;
                        }
                    } else if (this.checkboxPressed) {
                        if (actionMasked == 2) {
                            if (!contains) {
                                this.checkboxPressed = false;
                                org.telegram.ui.Components.pc pcVar2 = this.checkboxBounce;
                                if (pcVar2 != null) {
                                    pcVar2.c(false);
                                }
                            }
                        } else if (actionMasked == 1 || actionMasked == 3) {
                            if (actionMasked == 1 && contains) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.checkboxPressed = false;
                            org.telegram.ui.Components.pc pcVar3 = this.checkboxBounce;
                            if (pcVar3 != null) {
                                pcVar3.c(false);
                            }
                            if (z10) {
                                toggleCheckbox();
                            }
                            invalidateCell();
                        }
                        Rect rect22 = this.padding;
                        motionEvent.offsetLocation(rect22.left, rect22.top);
                        return true;
                    }
                }
                boolean onTouchEvent = onTouchEvent(motionEvent);
                Rect rect3 = this.padding;
                motionEvent.offsetLocation(rect3.left, rect3.top);
                return onTouchEvent;
            } catch (Throwable th) {
                Rect rect4 = this.padding;
                motionEvent.offsetLocation(rect4.left, rect4.top);
                throw th;
            }
        }

        public final void updateListMarkerY() {
            if (this.numLayout != null) {
                if (getLayout() != null && getLayout().getLineCount() > 0 && this.numLayout.getLineCount() > 0) {
                    this.numLayoutY = (getLayout().getLineBaseline(0) + getContentPaddingTop()) - this.numLayout.getLineBaseline(0);
                } else {
                    int dp = AndroidUtilities.dp(this.root.fontSize + 14);
                    int height = getHeight();
                    Rect rect = this.padding;
                    this.numLayoutY = (Math.min(dp, (height - rect.top) - rect.bottom) - this.numLayout.getHeight()) / 2.0f;
                }
            }
            if (this.checkbox != null) {
                if (getLayout() != null && getLayout().getLineCount() > 0) {
                    this.checkboxY = (getLayout().getLineBaseline(0) + getContentPaddingTop()) - (AndroidUtilities.dp(20.0f) * 0.7f);
                    return;
                }
                int dp2 = AndroidUtilities.dp(this.root.fontSize + 14);
                int height2 = getHeight();
                Rect rect2 = this.padding;
                this.checkboxY = (Math.min(dp2, (height2 - rect2.top) - rect2.bottom) - AndroidUtilities.dp(20.0f)) / 2.0f;
            }
        }

        public void draw(Canvas canvas, int i9, float f10) {
            float dpf2;
            canvas.save();
            Rect rect = this.padding;
            canvas.translate(rect.left, rect.top);
            boolean isRtl = this.root.isRtl();
            int minWidth = (this.root.getMinWidth() + this.root.padRight) - AndroidUtilities.dp(14.0f);
            Rect rect2 = this.padding;
            float f11 = (minWidth - rect2.right) - rect2.left;
            if (this.numLayout != null) {
                this.root.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                RichMessageLayout richMessageLayout = this.root;
                richMessageLayout.numTextPaint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.f6.fc : org.telegram.ui.ActionBar.f6.ec));
                canvas.save();
                if (!this.listOrdered && !this.listCheckbox) {
                    float dpf22 = AndroidUtilities.dpf2(4.3f);
                    if (isRtl) {
                        dpf2 = ((AndroidUtilities.dp(18.0f) + f11) - AndroidUtilities.dpf2(5.66f)) - (dpf22 / 2.0f);
                    } else {
                        dpf2 = ((dpf22 / 2.0f) + AndroidUtilities.dpf2(5.66f)) - AndroidUtilities.dp(18.0f);
                    }
                    canvas.drawCircle(dpf2, (this.numLayoutY + this.numLayout.getLineBaseline(0)) - (AndroidUtilities.dp(SharedConfig.fontSize) * 0.35f), dpf22 / 2.0f, this.root.numTextPaint);
                } else if (isRtl) {
                    canvas.translate(((AndroidUtilities.dp(6.0f) + f11) - this.numLayoutLeft) + (this.checkbox != null ? AndroidUtilities.dp(26.0f) : 0), this.numLayoutY);
                    this.numLayout.draw(canvas);
                } else {
                    canvas.translate((AndroidUtilities.dp(6.0f) - this.listMarkerWidth) - this.numLayoutLeft, this.numLayoutY);
                    this.numLayout.draw(canvas);
                }
                canvas.restore();
            }
            if (this.checkbox != null) {
                int dp = isRtl ? (int) (f11 + AndroidUtilities.dp(6.0f)) : -AndroidUtilities.dp(26.0f);
                this.checkboxHit.set(dp - AndroidUtilities.dp(6.0f), this.checkboxY - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + dp, this.checkboxY + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(6.0f));
                View view = this.root.view;
                if (view != null) {
                    CheckBoxBase checkBoxBase = this.checkbox;
                    if (checkBoxBase.f26299a == null) {
                        checkBoxBase.f26299a = view;
                    }
                }
                org.telegram.ui.Components.pc pcVar = this.checkboxBounce;
                float a2 = pcVar != null ? pcVar.a(0.1f) : 1.0f;
                canvas.save();
                canvas.scale(a2, a2, AndroidUtilities.dp(10.0f) + dp, this.checkboxY + AndroidUtilities.dp(10.0f));
                this.checkbox.e(dp, (int) this.checkboxY, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.checkbox.a(canvas);
                canvas.restore();
            }
            if (i9 == Integer.MIN_VALUE) {
                onDraw(canvas);
            } else {
                onDrawFaded(canvas, i9, f10);
            }
            canvas.restore();
        }

        public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
            Text text;
            org.telegram.ui.Components.p5 p5Var;
            org.telegram.ui.Cells.y9[] text2 = getText();
            if (text2 == null) {
                return false;
            }
            boolean z10 = false;
            for (org.telegram.ui.Cells.y9 y9Var : text2) {
                if ((y9Var instanceof Text) && (p5Var = (text = (Text) y9Var).animatedEmojiStack) != null && !p5Var.f31544a.isEmpty()) {
                    canvas.save();
                    canvas.translate(text.f19661x, text.f19662y - this.currY);
                    org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, text.layout, text.animatedEmojiStack, 0.0f, text.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                    canvas.restore();
                    z10 = true;
                }
            }
            return z10;
        }

        public void setCheckbox(boolean z10, TLObject tLObject) {
            this.checkboxItem = tLObject;
            if (this.checkbox == null) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this.root.resourcesProvider);
                this.checkbox = checkBoxBase;
                checkBoxBase.h(org.telegram.ui.ActionBar.f6.hl, org.telegram.ui.ActionBar.f6.f23385z5, org.telegram.ui.ActionBar.f6.f23128k7);
                this.checkbox.d(10);
                this.checkbox.k(true);
                this.checkbox.i(AndroidUtilities.dp(5.0f));
            }
            this.checkbox.f(-1, z10, false);
            updateListMarkerY();
        }

        public void onAttachedToWindow() {
        }

        public void onDetachedFromWindow() {
        }

        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
        }

        public void onDraw(Canvas canvas) {
        }
    }

    public static class RichButton {
        private static final float ICON_OFFSET_X = 12.33f;
        private static final float ICON_OFFSET_Y = 11.66f;
        private static final float ICON_OFFSET_Y_INLINE = 9.33f;
        public static final int INLINE_PADDING_HORIZONTAL = 7;
        private static final int MIN_PADDING = 8;
        private static final int PADDING = 20;
        private static final int PADDING_WITH_ICON = 26;
        private static final float PRESS_SCALE = 0.04f;
        private static final float PRESS_SCALE_INLINE = 0.09f;
        private static final Xfermode SRC_OUT;
        private static final Paint SRC_OUT_PAINT;
        public int backgroundColor;
        public final Paint backgroundPaint;
        public int backgroundPressedColor;
        private final p00 colorSpan;
        private final boolean emojiFirst;
        private final boolean emojiLast;
        private Drawable iconDrawable;
        private final boolean inline;
        public final Runnable invalidateRunnable;
        public final boolean isDisabled;
        private int lastLinkColorFilterColor;
        private final RichMessageLayout layout;
        private final boolean link;
        private ColorFilter linkColorFilter;
        private boolean loading;
        public p80 loadingDrawable;
        private final RectF loadingRect;
        private final int maxWidth;
        private boolean needSaveLayer;
        private final boolean out;
        public final TL_keyboard.PageButton pageButton;
        public ValueAnimator pressAnimator;
        public float pressT;
        public boolean pressed;
        public final TL_keyboard.RichButtonStyle style;
        private final org.telegram.ui.ActionBar.x5 styleKeys;
        public final Text text;
        public int textColor;
        private ColorFilter textColorFilter;
        public int textColorKey;
        private final RectF textFadeRect;
        public final TL_keyboard.InlineButtonType type;
        public int width;
        public int f19660x;

        static {
            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
            SRC_OUT = porterDuffXfermode;
            Paint paint = new Paint();
            SRC_OUT_PAINT = paint;
            paint.setXfermode(porterDuffXfermode);
        }

        public RichButton(RichMessageLayout richMessageLayout, int i9, TL_keyboard.PageButton pageButton, Runnable runnable) {
            this(richMessageLayout, i9, richMessageLayout.formatText(pageButton.text, RichMessageLayout.setBlockFlags(16, 13)), pageButton, pageButton.type, pageButton.style, gf.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), true, false, false, false, false, null, runnable);
        }

        private void drawLoading(Canvas canvas) {
            boolean z10;
            if (this.pageButton != null && this.layout.cell != null && this.layout.cell.H1(this.pageButton)) {
                z10 = true;
            } else {
                z10 = false;
            }
            setLoading(z10);
            p80 p80Var = this.loadingDrawable;
            if (p80Var != null) {
                if (z10 || p80Var.c()) {
                    float strokeWidth = this.loadingDrawable.f31590w.getStrokeWidth();
                    this.loadingRect.set(0.0f, 0.0f, this.width, getHeight());
                    float f10 = strokeWidth / 2.0f;
                    this.loadingRect.inset(f10, f10);
                    this.loadingDrawable.h((getHeight() / 2.0f) - f10);
                    this.loadingDrawable.d(this.loadingRect);
                    this.loadingDrawable.f(org.telegram.ui.ActionBar.f6.l1(0.07f, this.textColor), org.telegram.ui.ActionBar.f6.l1(0.175f, this.textColor), org.telegram.ui.ActionBar.f6.l1(0.175f, this.textColor), org.telegram.ui.ActionBar.f6.l1(0.42f, this.textColor));
                    this.loadingDrawable.setAlpha(255);
                    this.loadingDrawable.draw(canvas);
                    this.invalidateRunnable.run();
                }
            }
        }

        private static int getButtonIcon(TL_keyboard.InlineButtonType inlineButtonType) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                return R.drawable.mini_inline_copy_16;
            }
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrlAuth) {
                return R.drawable.mini_inline_arrow_16;
            }
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                if (kb0.l(((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url)) {
                    return R.drawable.bot_webview;
                }
                return R.drawable.mini_inline_arrow_16;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeWebView) {
                return R.drawable.bot_webview;
            } else {
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

        private int getTextAvailableWidth() {
            return Math.max(1, getTextViewportRight() - getTextViewportLeft());
        }

        private int getTextViewportLeft() {
            if (this.link) {
                return 0;
            }
            if (this.inline) {
                return getPaddingLeft();
            }
            return AndroidUtilities.dp(8.0f);
        }

        private int getTextViewportRight() {
            int i9;
            int max;
            if (this.link) {
                return this.width;
            }
            if (this.inline) {
                i9 = this.width;
                max = getPaddingRight();
            } else {
                i9 = this.width;
                max = Math.max(AndroidUtilities.dp(8.0f), getIconReserve());
            }
            return i9 - max;
        }

        public void lambda$setPressed$0(ValueAnimator valueAnimator) {
            this.pressT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.invalidateRunnable.run();
        }

        public void attach(View view) {
            this.text.attach(view);
        }

        public boolean contains(float f10) {
            int i9 = this.f19660x;
            if (f10 >= i9 && f10 <= i9 + this.width) {
                return true;
            }
            return false;
        }

        public void detach(View view) {
            this.text.detach(view);
        }

        public void draw(Canvas canvas) {
            boolean z10;
            int i9;
            boolean z11;
            Canvas canvas2;
            float f10;
            float f11;
            int i10;
            float f12;
            float f13;
            float pressScale = getPressScale();
            canvas.save();
            if (pressScale != 1.0f) {
                canvas.scale(pressScale, pressScale, this.width / 2.0f, getHeight() / 2.0f);
            }
            boolean z12 = this.link;
            boolean z13 = false;
            if (this.needSaveLayer && !z12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                canvas.saveLayer(0.0f, 0.0f, this.width, getHeight(), null);
            } else {
                Paint paint = this.backgroundPaint;
                if (this.pressed) {
                    i9 = this.backgroundPressedColor;
                } else {
                    i9 = this.backgroundColor;
                }
                paint.setColor(i9);
                if (!z12) {
                    canvas.drawRoundRect(0.0f, 0.0f, this.width, getHeight(), getHeight() / 2.0f, getHeight() / 2.0f, this.backgroundPaint);
                }
                drawLoading(canvas);
            }
            canvas.save();
            int textViewportLeft = getTextViewportLeft();
            int textViewportRight = getTextViewportRight();
            if (getTextWidth() > getTextAvailableWidth()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                canvas2 = canvas;
                canvas2.saveLayer(textViewportLeft, -AndroidUtilities.dp(10.0f), textViewportRight, AndroidUtilities.dp(10.0f) + getHeight(), null);
            } else {
                canvas2 = canvas;
            }
            canvas2.clipRect(textViewportLeft, -AndroidUtilities.dp(10.0f), textViewportRight, AndroidUtilities.dp(10.0f) + getHeight());
            canvas2.save();
            int baseline = this.text.getBaseline();
            if (this.text.getEmojiOnlyCount() > 0) {
                z13 = true;
            }
            if (z13) {
                canvas2.translate(getTextX() - this.text.left, (getHeight() - this.text.getHeight()) / 2.0f);
            } else if (baseline > 0) {
                if (this.inline) {
                    canvas2.translate(getTextX() - this.text.left, (-baseline) + ((getHeight() * 43) / 56));
                } else {
                    canvas2.translate(getTextX() - this.text.left, (-baseline) + ((getHeight() * 65) / 102));
                }
            } else {
                canvas2.translate(getTextX() - this.text.left, ((getHeight() - this.text.getHeight()) / 2.0f) - AndroidUtilities.dp(1.0f));
            }
            this.text.draw(canvas2);
            if (this.layout.isOverlayActive()) {
                if (z13) {
                    f13 = 0.0f;
                } else if (this.link) {
                    f13 = 0.66f;
                } else {
                    f13 = 2.0f;
                }
                canvas2.translate(0.0f, AndroidUtilities.dp(f13));
                if (this.link) {
                    int i11 = this.text.layout.getPaint().linkColor;
                    if (this.lastLinkColorFilterColor != i11 || this.linkColorFilter == null) {
                        this.lastLinkColorFilterColor = i11;
                        this.linkColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
                    }
                    Text text = this.text;
                    f10 = 0.0f;
                    f11 = 2.0f;
                    org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas2, text.layout, text.animatedEmojiStack, 0.0f, text.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, this.linkColorFilter);
                    canvas2 = canvas;
                } else {
                    f10 = 0.0f;
                    f11 = 2.0f;
                    Text text2 = this.text;
                    canvas2 = canvas;
                    org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas2, text2.layout, text2.animatedEmojiStack, 0.0f, text2.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, this.textColorFilter);
                }
            } else {
                f10 = 0.0f;
                f11 = 2.0f;
            }
            canvas2.restore();
            if (z11) {
                this.textFadeRect.set(textViewportRight - AndroidUtilities.dp(8.0f), f10, textViewportRight, getHeight());
                this.layout.clip.b(canvas2, this.textFadeRect, 2, 1.0f);
                canvas2.restore();
            }
            canvas2.restore();
            Drawable drawable = this.iconDrawable;
            if (drawable != null) {
                float dp = this.width - AndroidUtilities.dp(12.33f);
                if (this.inline) {
                    f12 = 9.33f;
                } else {
                    f12 = 11.66f;
                }
                ff.s.d(drawable, dp, AndroidUtilities.dp(f12), 17);
                this.iconDrawable.draw(canvas2);
            }
            if (z10) {
                Paint paint2 = SRC_OUT_PAINT;
                if (this.pressed) {
                    i10 = this.backgroundPressedColor;
                } else {
                    i10 = this.backgroundColor;
                }
                paint2.setColor(i10);
                canvas2.drawRoundRect(0.0f, 0.0f, this.width, getHeight(), getHeight() / f11, getHeight() / f11, paint2);
                canvas.restore();
                drawLoading(canvas);
            }
            canvas.restore();
        }

        public int getHeight() {
            float f10;
            if (this.inline) {
                f10 = this.layout.fontSize * 1.166666f;
            } else {
                f10 = this.layout.fontSize + 18;
            }
            return AndroidUtilities.dp(f10);
        }

        public int getIconReserve() {
            if (this.iconDrawable != null) {
                return (AndroidUtilities.dp(11.66f) / 2) + AndroidUtilities.dp(12.33f);
            }
            return 0;
        }

        public int getMinWidth() {
            return Math.min(getPreferredWidth(), getIconReserve() + getHeight());
        }

        public int getPaddingLeft() {
            float f10;
            if (this.link) {
                return 0;
            }
            if (this.emojiFirst && this.inline) {
                return AndroidUtilities.dp(4.0f);
            }
            if (this.inline) {
                return AndroidUtilities.dp(7.0f);
            }
            if (this.iconDrawable != null) {
                f10 = 26.0f;
            } else {
                f10 = 20.0f;
            }
            return AndroidUtilities.dp(f10);
        }

        public int getPaddingRight() {
            float f10;
            int i9 = 0;
            if (this.link) {
                return 0;
            }
            if (this.emojiLast && this.inline) {
                if (this.iconDrawable != null) {
                    i9 = 14;
                }
                return AndroidUtilities.dp(i9 + 4);
            } else if (this.inline) {
                if (this.iconDrawable != null) {
                    i9 = 14;
                }
                return AndroidUtilities.dp(i9 + 7);
            } else {
                if (this.iconDrawable != null) {
                    f10 = 26.0f;
                } else {
                    f10 = 20.0f;
                }
                return AndroidUtilities.dp(f10);
            }
        }

        public int getPreferredWidth() {
            return Math.min(this.maxWidth, getPaddingRight() + getPaddingLeft() + getTextWidth());
        }

        public float getPressScale() {
            float f10;
            if (this.pressed) {
                float f11 = this.pressT;
                if (f11 != 1.0f) {
                    float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f11;
                    this.pressT = min;
                    this.pressT = Utilities.clamp(min, 1.0f, 0.0f);
                    this.invalidateRunnable.run();
                }
            }
            if (this.inline) {
                f10 = 0.09f;
            } else {
                f10 = 0.04f;
            }
            return e2.c.z(1.0f, this.pressT, f10, 1.0f - f10);
        }

        public int getTextWidth() {
            Text text = this.text;
            return text.right - text.left;
        }

        public float getTextX() {
            if (this.inline) {
                return getPaddingLeft();
            }
            if (getTextWidth() > getTextAvailableWidth()) {
                return getTextViewportLeft();
            }
            if (this.iconDrawable == null) {
                return (this.width - getTextWidth()) / 2.0f;
            }
            return Math.max(Math.min((this.width - getTextWidth()) / 2.0f, (this.width - getIconReserve()) - getTextWidth()), AndroidUtilities.dp(8.0f));
        }

        public boolean isLoading() {
            return this.loading;
        }

        public void setLoading(boolean z10) {
            if (this.loading == z10) {
                return;
            }
            this.loading = z10;
            if (z10) {
                p80 p80Var = this.loadingDrawable;
                if (p80Var == null) {
                    p80 p80Var2 = new p80();
                    this.loadingDrawable = p80Var2;
                    p80Var2.C = true;
                    p80Var2.f31590w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                } else {
                    p80Var.f31572b = -1L;
                    p80Var.f31573c = -1L;
                }
            } else {
                p80 p80Var3 = this.loadingDrawable;
                if (p80Var3 != null) {
                    p80Var3.a();
                }
            }
            this.invalidateRunnable.run();
        }

        public void setPressed(boolean z10) {
            float f10;
            long j10;
            if (this.pressed != z10) {
                this.pressed = z10;
                this.invalidateRunnable.run();
                if (z10) {
                    ValueAnimator valueAnimator = this.pressAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.pressAnimator.cancel();
                        this.pressAnimator = null;
                        return;
                    }
                    return;
                }
                float f11 = this.pressT;
                if (f11 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                    this.pressAnimator = ofFloat;
                    ofFloat.addUpdateListener(new o(this, 1));
                    this.pressAnimator.addListener(new AnimatorListenerAdapter() {
                        {
                            RichButton.this = this;
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            RichButton.this.pressAnimator = null;
                        }
                    });
                    ValueAnimator valueAnimator2 = this.pressAnimator;
                    if (this.inline) {
                        f10 = 3.5f;
                    } else {
                        f10 = 2.0f;
                    }
                    valueAnimator2.setInterpolator(new OvershootInterpolator(f10));
                    ValueAnimator valueAnimator3 = this.pressAnimator;
                    if (this.inline) {
                        j10 = 420;
                    } else {
                        j10 = 350;
                    }
                    valueAnimator3.setDuration(j10);
                    this.pressAnimator.start();
                }
            }
        }

        public void setTextColorKey(int i9) {
            this.textColorKey = i9;
            int themedColor = this.layout.getThemedColor(i9);
            if (this.isDisabled) {
                themedColor = org.telegram.ui.ActionBar.f6.l1(0.5f, themedColor);
            }
            if (themedColor != this.textColor || this.textColorFilter == null) {
                this.textColor = themedColor;
                this.textColorFilter = new PorterDuffColorFilter(this.textColor, PorterDuff.Mode.SRC_IN);
            }
            this.colorSpan.f31487b = i9;
            this.invalidateRunnable.run();
            Drawable drawable = this.iconDrawable;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.textColor, PorterDuff.Mode.MULTIPLY));
            }
        }

        public void updateColors() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichButton.updateColors():void");
        }

        public RichButton(org.telegram.messenger.RichMessageLayout r6, int r7, java.lang.CharSequence r8, org.telegram.tgnet.tl.TL_keyboard.PageButton r9, org.telegram.tgnet.tl.TL_keyboard.InlineButtonType r10, org.telegram.tgnet.tl.TL_keyboard.RichButtonStyle r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, java.lang.Boolean r18, java.lang.Runnable r19) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichButton.<init>(org.telegram.messenger.RichMessageLayout, int, java.lang.CharSequence, org.telegram.tgnet.tl.TL_keyboard$PageButton, org.telegram.tgnet.tl.TL_keyboard$InlineButtonType, org.telegram.tgnet.tl.TL_keyboard$RichButtonStyle, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, java.lang.Runnable):void");
        }
    }

    public static class RichButtonRowBlock extends RichBlock {
        private static final int GAP = 7;
        private final Align align;
        private final RichButton[] buttons;
        private final ud.b clickHelper;
        private int layoutWidth;
        private RichButton pressedButton;
        private RichButton touchButton;

        public enum Align {
            LEFT,
            RIGHT,
            CENTER,
            FILL
        }

        public RichButtonRowBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
            super(richMessageLayout, rect, i9);
            this.layoutWidth = -1;
            this.clickHelper = new ud.b(new ud.a() {
                {
                    RichButtonRowBlock.this = this;
                }

                @Override
                public boolean forceEnableVibration() {
                    return false;
                }

                @Override
                public long getLongPressDuration() {
                    return ViewConfiguration.getLongPressTimeout();
                }

                @Override
                public boolean ignoreHapticFeedbackSettings(float f10, float f11) {
                    return false;
                }

                @Override
                public boolean needCancelTouchBySlopMove() {
                    return true;
                }

                @Override
                public boolean needClickAt(View view, float f10, float f11) {
                    RichButton buttonAt = RichButtonRowBlock.this.getButtonAt(f10, f11);
                    RichButtonRowBlock.this.touchButton = (buttonAt == null || buttonAt.isDisabled) ? null : null;
                    if (RichButtonRowBlock.this.touchButton != null) {
                        return true;
                    }
                    return false;
                }

                @Override
                public boolean needLongPress(float f10, float f11) {
                    return true;
                }

                @Override
                public void onClickAt(View view, float f10, float f11) {
                    if (RichButtonRowBlock.this.touchButton != null) {
                        RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                        richButtonRowBlock.onButtonClick(richButtonRowBlock.touchButton);
                    }
                }

                @Override
                public void onClickTouchDown(View view, float f10, float f11) {
                    RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                    richButtonRowBlock.setPressedButton(richButtonRowBlock.touchButton);
                }

                @Override
                public void onClickTouchMove(View view, float f10, float f11) {
                    RichButton richButton;
                    RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                    if (richButtonRowBlock.getButtonAt(f10, f11) == RichButtonRowBlock.this.touchButton) {
                        richButton = RichButtonRowBlock.this.touchButton;
                    } else {
                        richButton = null;
                    }
                    richButtonRowBlock.setPressedButton(richButton);
                }

                @Override
                public void onClickTouchUp(View view, float f10, float f11) {
                    RichButtonRowBlock.this.setPressedButton(null);
                    RichButtonRowBlock.this.touchButton = null;
                }

                @Override
                public boolean onLongPressRequestedAt(View view, float f10, float f11) {
                    if (RichButtonRowBlock.this.touchButton != null && RichButtonRowBlock.this.getButtonAt(f10, f11) == RichButtonRowBlock.this.touchButton) {
                        RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                        richButtonRowBlock.onButtonLongClick(richButtonRowBlock.touchButton);
                        return true;
                    }
                    return false;
                }

                @Override
                public void onLongPressCancelled(View view, float f10, float f11) {
                }

                @Override
                public void onLongPressFinish(View view, float f10, float f11) {
                }

                @Override
                public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
                }
            });
            this.buttons = new RichButton[pageblockbuttonrow.buttons.size()];
            int size = pageblockbuttonrow.buttons.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.buttons[i10] = new RichButton(richMessageLayout, i9, pageblockbuttonrow.buttons.get(i10), new ng(this, 7));
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
            layout(getIntrinsicWidth());
        }

        public RichButton getButtonAt(float f10, float f11) {
            int height;
            RichButton[] richButtonArr;
            updateLayout();
            RichButton[] richButtonArr2 = this.buttons;
            if (richButtonArr2.length == 0) {
                height = AndroidUtilities.dp(this.root.fontSize + 18);
            } else {
                height = richButtonArr2[0].getHeight();
            }
            float height2 = (getHeight() - height) / 2.0f;
            if (f11 >= height2 && f11 <= height2 + height) {
                for (RichButton richButton : this.buttons) {
                    if (richButton.contains(f10)) {
                        return richButton;
                    }
                }
            }
            return null;
        }

        private int getIntrinsicWidth() {
            int length = this.buttons.length;
            if (length == 0) {
                return 0;
            }
            int dp = (length - 1) * AndroidUtilities.dp(7.0f);
            for (RichButton richButton : this.buttons) {
                dp += richButton.getPreferredWidth();
            }
            return Math.min(this.maxWidth, dp);
        }

        public void invalidate() {
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        private void layout(int i9) {
            RichButton[] richButtonArr;
            int i10;
            RichButton[] richButtonArr2;
            this.layoutWidth = i9;
            int length = this.buttons.length;
            if (length != 0) {
                int dp = AndroidUtilities.dp(7.0f);
                int i11 = (length - 1) * dp;
                int max = Math.max(0, i9 - i11);
                int i12 = 0;
                for (RichButton richButton : this.buttons) {
                    int preferredWidth = richButton.getPreferredWidth();
                    richButton.width = preferredWidth;
                    i12 += preferredWidth;
                }
                if (i12 > max) {
                    squeeze(max, i12);
                } else if (this.align == Align.FILL) {
                    stretch(max);
                }
                for (RichButton richButton2 : this.buttons) {
                    i11 += richButton2.width;
                }
                int ordinal = this.align.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        i10 = 0;
                    } else {
                        i10 = (i9 - i11) / 2;
                    }
                } else {
                    i10 = i9 - i11;
                }
                for (RichButton richButton3 : this.buttons) {
                    richButton3.f19660x = i10;
                    i10 += richButton3.width + dp;
                }
            }
        }

        public void onButtonClick(RichButton richButton) {
            if (this.root.delegate != null) {
                this.root.delegate.e1(this.root.cell, richButton.pageButton);
            }
        }

        public void onButtonLongClick(RichButton richButton) {
            if (this.root.delegate != null) {
                this.root.delegate.y1(this.root.cell, richButton.pageButton);
            }
        }

        public void setPressedButton(RichButton richButton) {
            RichButton richButton2 = this.pressedButton;
            if (richButton2 != richButton) {
                if (richButton2 != null) {
                    richButton2.setPressed(false);
                }
                this.pressedButton = richButton;
                if (richButton != null) {
                    richButton.setPressed(true);
                }
            }
        }

        private void squeeze(int i9, int i10) {
            RichButton[] richButtonArr;
            int i11;
            int i12 = 0;
            int i13 = 0;
            for (RichButton richButton : this.buttons) {
                i13 += richButton.width - richButton.getMinWidth();
            }
            if (i13 <= 0) {
                RichButton[] richButtonArr2 = this.buttons;
                int length = richButtonArr2.length;
                while (i12 < length) {
                    RichButton richButton2 = richButtonArr2[i12];
                    richButton2.width = richButton2.getMinWidth();
                    i12++;
                }
                return;
            }
            int min = Math.min(i10 - i9, i13);
            int i14 = 0;
            while (true) {
                RichButton[] richButtonArr3 = this.buttons;
                if (i12 < richButtonArr3.length) {
                    RichButton richButton3 = richButtonArr3[i12];
                    int minWidth = richButton3.width - richButton3.getMinWidth();
                    if (i12 == this.buttons.length - 1) {
                        i11 = min - i14;
                    } else {
                        i11 = (int) ((min * minWidth) / i13);
                    }
                    int min2 = Math.min(i11, minWidth);
                    richButton3.width -= min2;
                    i14 += min2;
                    i12++;
                } else {
                    return;
                }
            }
        }

        private void stretch(int i9) {
            int i10;
            int i11;
            RichButton[] richButtonArr = this.buttons;
            boolean[] zArr = new boolean[richButtonArr.length];
            int length = richButtonArr.length;
            boolean z10 = true;
            while (true) {
                boolean z11 = false;
                if (!z10 || length <= 0) {
                    break;
                }
                int i12 = i9 / length;
                int i13 = 0;
                while (true) {
                    RichButton[] richButtonArr2 = this.buttons;
                    if (i13 < richButtonArr2.length) {
                        if (!zArr[i13] && (i11 = richButtonArr2[i13].width) > i12) {
                            zArr[i13] = true;
                            i9 -= i11;
                            length--;
                            z11 = true;
                        }
                        i13++;
                    }
                }
                z10 = z11;
            }
            if (length > 0) {
                int i14 = i9 / length;
                int i15 = i9 - (length * i14);
                int i16 = 0;
                while (true) {
                    RichButton[] richButtonArr3 = this.buttons;
                    if (i16 < richButtonArr3.length) {
                        if (!zArr[i16]) {
                            RichButton richButton = richButtonArr3[i16];
                            int i17 = i15 - 1;
                            if (i15 > 0) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            richButton.width = i10 + i14;
                            i15 = i17;
                        }
                        i16++;
                    } else {
                        return;
                    }
                }
            }
        }

        private void updateLayout() {
            int minWidth = this.root.getMinWidth();
            RichMessageLayout richMessageLayout = this.root;
            int i9 = richMessageLayout.padLeft;
            Rect rect = this.padding;
            int max = Math.max(0, ((((minWidth + i9) + richMessageLayout.padRight) - (i9 * 2)) - rect.left) - rect.right);
            if (this.layoutWidth != max) {
                layout(max);
            }
        }

        @Override
        public void draw(Canvas canvas) {
            RichButton[] richButtonArr;
            updateLayout();
            for (RichButton richButton : this.buttons) {
                canvas.save();
                canvas.translate(richButton.f19660x, Math.round((getHeight() - richButton.getHeight()) / 2.0f));
                richButton.draw(canvas);
                canvas.restore();
            }
        }

        @Override
        public int getHeight() {
            int height;
            RichButton[] richButtonArr = this.buttons;
            if (richButtonArr.length == 0) {
                height = AndroidUtilities.dp(this.root.fontSize + 18);
            } else {
                height = richButtonArr[0].getHeight();
            }
            return AndroidUtilities.dp(4.333f) + this.padding.top + height + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            return this.padding.left + getIntrinsicWidth() + this.padding.right;
        }

        @Override
        public boolean isHorizontallyDragging() {
            if (this.touchButton != null) {
                return true;
            }
            return false;
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            for (RichButton richButton : this.buttons) {
                richButton.attach(this.view);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            for (RichButton richButton : this.buttons) {
                richButton.detach(this.view);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            View view = this.view;
            if (view == null) {
                return false;
            }
            return this.clickHelper.a(motionEvent, view);
        }
    }

    public static class RichButtonSpan extends ReplacementSpan {
        private static final int MARGIN_HORIZONTAL = 1;
        private final RectF bounds;
        private final RichButton button;
        private int minimumLineHeight;
        private boolean preserveFontMetrics;
        private float scale;
        private final TL_iv.textButton textButton;
        private View v;

        private static void expandFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i9) {
            int i10 = fontMetricsInt.descent;
            int i11 = fontMetricsInt.ascent;
            int i12 = i10 - i11;
            if (i9 <= i12) {
                return;
            }
            int i13 = i9 - i12;
            int i14 = (i13 + 1) / 2;
            int i15 = i11 - i14;
            fontMetricsInt.ascent = i15;
            fontMetricsInt.descent = i10 + (i13 - i14);
            fontMetricsInt.top = Math.min(fontMetricsInt.top, i15);
            fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
        }

        public void invalidate() {
            View view = this.v;
            if (view != null) {
                view.invalidate();
            }
        }

        public void attach(View view) {
            this.v = view;
            this.button.attach(view);
        }

        public boolean contains(float f10, float f11) {
            return this.bounds.contains(f10, f11);
        }

        public void detach(View view) {
            this.v = null;
            this.button.detach(view);
        }

        public void didPress(org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Cells.k1 k1Var, boolean z10) {
            if (t1Var != null && k1Var != null) {
                if (z10) {
                    k1Var.y1(t1Var, this.textButton);
                } else {
                    k1Var.e1(t1Var, this.textButton);
                }
            }
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
            int i14;
            float f11;
            int i15 = 0;
            if (this.button.text.getEmojiOnlyCount() > 0 && this.minimumLineHeight > 0) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            if (i14 == 0 && this.button.text.getEmojiOnlyCount() > 0 && (charSequence instanceof Spanned)) {
                StyleSpan[] styleSpanArr = (StyleSpan[]) ((Spanned) charSequence).getSpans(i9, i10, StyleSpan.class);
                int length = styleSpanArr.length;
                int i16 = 0;
                while (true) {
                    if (i16 >= length) {
                        break;
                    } else if ((styleSpanArr[i16].flags & 15) == 14) {
                        i14 = 1;
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            if (i14 != 0) {
                f11 = (i11 + i13) / 2.0f;
            } else {
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                f11 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + i12;
            }
            canvas.save();
            if (!this.button.link) {
                i15 = AndroidUtilities.dp(1.0f);
            }
            int round = Math.round(f10 + i15);
            int ceil = (int) Math.ceil((f11 - (this.button.getHeight() / 2.0f)) + (i14 ^ 1));
            RectF rectF = this.bounds;
            float f12 = round;
            float f13 = ceil;
            RichButton richButton = this.button;
            rectF.set(f12, f13, round + richButton.width, richButton.getHeight() + ceil);
            canvas.translate(f12, f13);
            this.button.draw(canvas);
            canvas.restore();
        }

        public RichButton getButton() {
            return this.button;
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
            boolean z10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16 = 0;
            if (this.preserveFontMetrics && fontMetricsInt != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = fontMetricsInt.top;
            } else {
                i11 = 0;
            }
            if (z10) {
                i12 = fontMetricsInt.ascent;
            } else {
                i12 = 0;
            }
            if (z10) {
                i13 = fontMetricsInt.descent;
            } else {
                i13 = 0;
            }
            if (z10) {
                i14 = fontMetricsInt.bottom;
            } else {
                i14 = 0;
            }
            if (z10) {
                i15 = fontMetricsInt.leading;
            } else {
                i15 = 0;
            }
            int dp = AndroidUtilities.dp(8.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            if (fontMetricsInt != null && this.button.link) {
                float f10 = (-dp2) - dp;
                float f11 = this.scale;
                fontMetricsInt.top = (int) (f10 * f11);
                float f12 = dp2 - dp;
                fontMetricsInt.bottom = (int) (f12 * f11);
                fontMetricsInt.ascent = (int) (f10 * f11);
                fontMetricsInt.descent = (int) (f12 * f11);
                fontMetricsInt.leading = 0;
            }
            if (z10) {
                fontMetricsInt.top = i11;
                fontMetricsInt.ascent = i12;
                fontMetricsInt.descent = i13;
                fontMetricsInt.bottom = i14;
                fontMetricsInt.leading = i15;
                expandFontMetrics(fontMetricsInt, this.minimumLineHeight);
            }
            RichButton richButton = this.button;
            int i17 = richButton.width;
            if (!richButton.link) {
                i16 = AndroidUtilities.dp(1.0f) * 2;
            }
            return i17 + i16;
        }

        public boolean isDisabled() {
            return this.button.isDisabled;
        }

        public void setPressed(boolean z10) {
            this.button.setPressed(z10);
        }

        public RichButtonSpan(RichMessageLayout richMessageLayout, int i9, TL_iv.textButton textbutton) {
            this(richMessageLayout, i9, textbutton, null);
        }

        public boolean contains(float f10, float f11, float f12) {
            RectF rectF = this.bounds;
            return f10 >= rectF.left - f12 && f10 < rectF.right + f12 && f11 >= rectF.top - f12 && f11 < rectF.bottom + f12;
        }

        private RichButtonSpan(org.telegram.messenger.RichMessageLayout r22, int r23, org.telegram.tgnet.tl.TL_iv.textButton r24, java.lang.Boolean r25) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichButtonSpan.<init>(org.telegram.messenger.RichMessageLayout, int, org.telegram.tgnet.tl.TL_iv$textButton, java.lang.Boolean):void");
        }
    }

    public static class RichCaptionBlock extends RichBlock {
        public final Text caption;
        public final Text credit;
        public final boolean rtl;
        private final org.telegram.ui.Cells.y9[] texts;

        public RichCaptionBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, CharSequence charSequence, CharSequence charSequence2) {
            super(richMessageLayout, rect, i9);
            Text text;
            if (!TextUtils.isEmpty(charSequence)) {
                text = new Text(richMessageLayout, charSequence, this.maxWidth);
            } else {
                text = null;
            }
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
            this.texts = (org.telegram.ui.Cells.y9[]) arrayList.toArray(new org.telegram.ui.Cells.y9[0]);
        }

        private int captionHeight() {
            Text text = this.caption;
            if (text != null) {
                return text.getHeight();
            }
            return 0;
        }

        private int creditDrawX() {
            if (this.credit == null || !this.rtl) {
                return 0;
            }
            int minWidth = this.root.getMinWidth();
            Rect rect = this.padding;
            return Math.max(0, ((minWidth - rect.left) - rect.right) - this.credit.getMinWidth());
        }

        private int creditHeight() {
            Text text = this.credit;
            if (text != null) {
                return text.getHeight();
            }
            return 0;
        }

        private int gap() {
            if (this.caption != null && this.credit != null) {
                return AndroidUtilities.dp(4.0f);
            }
            return 0;
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            StaticLayout staticLayout;
            RichBlock.appendText(spannableStringBuilder, this.caption, null);
            Text text = this.credit;
            if (text != null && (staticLayout = text.layout) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                    spannableStringBuilder.append('\n');
                }
                spannableStringBuilder.append(this.credit.layout.getText());
            }
        }

        @Override
        public boolean forcesTimeToNewLine() {
            return false;
        }

        @Override
        public int getHeight() {
            return this.padding.top + captionHeight() + gap() + creditHeight() + this.padding.bottom;
        }

        @Override
        public int getLastLineWidth() {
            int lastLineWidth;
            int i9;
            Text text = this.credit;
            if (text != null) {
                lastLineWidth = text.getLastLineWidth() + this.padding.left;
                i9 = this.padding.right;
            } else {
                Text text2 = this.caption;
                if (text2 != null) {
                    lastLineWidth = text2.getLastLineWidth() + this.padding.left;
                    i9 = this.padding.right;
                } else {
                    Rect rect = this.padding;
                    return rect.left + rect.right;
                }
            }
            return lastLineWidth + i9;
        }

        @Override
        public int getMinWidth() {
            Text text = this.caption;
            int i9 = 0;
            if (text != null) {
                i9 = Math.max(0, text.getMinWidth());
            }
            Text text2 = this.credit;
            if (text2 != null) {
                i9 = Math.max(i9, text2.getMinWidth());
            }
            Rect rect = this.padding;
            return rect.left + i9 + rect.right;
        }

        @Override
        public org.telegram.ui.Cells.y9[] getText() {
            return this.texts;
        }

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
            Text text = this.caption;
            if (text != null) {
                text.detach(this.view);
            }
            Text text2 = this.credit;
            if (text2 != null) {
                text2.detach(this.view);
            }
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
            int captionHeight = captionHeight();
            int gap = gap();
            float y10 = motionEvent.getY();
            int i9 = this.padding.top;
            float f10 = y10 - i9;
            if (this.caption != null && f10 >= 0.0f && f10 < captionHeight) {
                motionEvent.offsetLocation(0.0f, -i9);
                boolean onTouchEvent = this.caption.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(0.0f, this.padding.top);
                return onTouchEvent;
            } else if (this.credit != null && f10 >= captionHeight + gap) {
                int i10 = i9 + captionHeight + gap;
                int creditDrawX = creditDrawX();
                motionEvent.offsetLocation(-creditDrawX, -i10);
                boolean onTouchEvent2 = this.credit.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(creditDrawX, i10);
                return onTouchEvent2;
            } else {
                return false;
            }
        }

        @Override
        public void placeTexts(int i9, int i10, int i11) {
            this.layoutX = i9;
            this.layoutY = i10;
            this.layoutRow = i11;
            Text text = this.caption;
            if (text != null) {
                text.setX(i9 - text.left);
                this.caption.setY(i10);
                this.caption.setRow(i11);
            }
            Text text2 = this.credit;
            if (text2 != null) {
                text2.setX((i9 + creditDrawX()) - this.credit.left);
                this.credit.setY(i10 + captionHeight() + gap());
                this.credit.setRow(i11);
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

        public RichCollageBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, TL_iv.pageBlockCollage pageblockcollage, boolean z10) {
            super(richMessageLayout, rect, i9);
            this.cells = new ArrayList<>();
            this.block = pageblockcollage;
            this.first = z10;
            for (int i10 = 0; i10 < pageblockcollage.items.size(); i10++) {
                MediaCell forPageBlock = MediaCell.forPageBlock(richMessageLayout, pageblockcollage.items.get(i10));
                if (forPageBlock != null) {
                    this.cells.add(forPageBlock);
                }
            }
            layoutCells();
        }

        private void layoutCells() {
            int i9;
            int round;
            int round2;
            this.cellFlags = new int[this.cells.size()];
            if (this.cells.isEmpty()) {
                this.contentHeight = 0;
                return;
            }
            float f10 = 0.0f;
            byte b10 = 1;
            if (this.cells.size() == 1) {
                MediaCell mediaCell = this.cells.get(0);
                float f11 = mediaCell.aspectRatio;
                if (f11 <= 0.0f) {
                    f11 = 1.0f;
                }
                int i10 = this.maxWidth;
                int i11 = (int) (i10 / f11);
                Point point = AndroidUtilities.displaySize;
                int max = (int) (Math.max(point.x, point.y) * 0.55f);
                if (i11 > max) {
                    i10 = (int) (max * f11);
                    i11 = max;
                }
                mediaCell.setRect(0, 0, i10, i11);
                this.cellFlags[0] = 15;
                this.contentHeight = i11;
                return;
            }
            float[] fArr = new float[this.cells.size()];
            for (int i12 = 0; i12 < this.cells.size(); i12++) {
                fArr[i12] = this.cells.get(i12).aspectRatio;
            }
            MessageObject.GroupedMessagePosition[] computeGrouped = RichMessageLayout.computeGrouped(fArr);
            int i13 = 0;
            for (MessageObject.GroupedMessagePosition groupedMessagePosition : computeGrouped) {
                i13 = Math.max(i13, (int) groupedMessagePosition.maxY);
            }
            int i14 = i13 + 1;
            float[] fArr2 = new float[i14];
            for (MessageObject.GroupedMessagePosition groupedMessagePosition2 : computeGrouped) {
                byte b11 = groupedMessagePosition2.minY;
                if (b11 == groupedMessagePosition2.maxY) {
                    fArr2[b11] = Math.max(fArr2[b11], groupedMessagePosition2.f19646ph);
                }
            }
            for (MessageObject.GroupedMessagePosition groupedMessagePosition3 : computeGrouped) {
                int i15 = groupedMessagePosition3.minY;
                byte b12 = groupedMessagePosition3.maxY;
                if (i15 != b12) {
                    int i16 = (b12 - i15) + 1;
                    float[] fArr3 = groupedMessagePosition3.siblingHeights;
                    if (fArr3 != null && fArr3.length == i16) {
                        for (int i17 = 0; i17 < i16; i17++) {
                            byte b13 = groupedMessagePosition3.minY;
                            fArr2[b13 + i17] = Math.max(fArr2[b13 + i17], groupedMessagePosition3.siblingHeights[i17]);
                        }
                    } else {
                        float f12 = groupedMessagePosition3.f19646ph / i16;
                        while (i15 <= groupedMessagePosition3.maxY) {
                            fArr2[i15] = Math.max(fArr2[i15], f12);
                            i15++;
                        }
                    }
                }
            }
            Point point2 = AndroidUtilities.displaySize;
            float max2 = Math.max(point2.x, point2.y) * 0.5f;
            int[] iArr = new int[i13 + 2];
            for (int i18 = 0; i18 <= i13; i18++) {
                iArr[i18] = Math.round(f10 * max2);
                f10 += fArr2[i18];
            }
            iArr[i14] = Math.round(f10 * max2);
            int dp = AndroidUtilities.dp(2.0f);
            int i19 = 0;
            while (i19 < computeGrouped.length) {
                MessageObject.GroupedMessagePosition groupedMessagePosition4 = computeGrouped[i19];
                int i20 = iArr[groupedMessagePosition4.minY];
                int i21 = iArr[groupedMessagePosition4.maxY + b10] - i20;
                if (groupedMessagePosition4.leftSpanOffset > 0) {
                    round = Math.round((i9 * this.maxWidth) / 1000.0f);
                } else {
                    int i22 = 0;
                    for (int i23 = 0; i23 < computeGrouped.length; i23++) {
                        if (i23 != i19) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition5 = computeGrouped[i23];
                            byte b14 = groupedMessagePosition5.minY;
                            byte b15 = groupedMessagePosition4.minY;
                            if (b14 <= b15 && groupedMessagePosition5.maxY >= b15 && groupedMessagePosition5.minX < groupedMessagePosition4.minX) {
                                i22 += groupedMessagePosition5.pw;
                            }
                        }
                    }
                    round = Math.round((i22 * this.maxWidth) / 1000.0f);
                }
                if ((groupedMessagePosition4.flags & 2) != 0) {
                    round2 = this.maxWidth - round;
                } else {
                    round2 = Math.round((groupedMessagePosition4.pw * this.maxWidth) / 1000.0f) - dp;
                }
                if ((groupedMessagePosition4.flags & 8) == 0) {
                    i21 -= dp;
                }
                this.cells.get(i19).setRect(round, i20, Math.max(0, round2), Math.max(0, i21));
                this.cellFlags[i19] = groupedMessagePosition4.flags;
                i19++;
                b10 = 1;
            }
            this.contentHeight = iArr[i14];
        }

        private void updateRoundRadius(ImageReceiver imageReceiver, int i9, boolean z10) {
            boolean z11;
            boolean z12;
            boolean z13;
            int dp;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            boolean z14 = true;
            int i15 = 0;
            if ((i9 & 4) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i9 & 8) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((i9 & 1) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i9 & 2) == 0) {
                z14 = false;
            }
            if (z10) {
                int dp2 = AndroidUtilities.dp(8.0f);
                if (z11 && z13) {
                    i12 = dp2;
                } else {
                    i12 = 0;
                }
                if (z11 && z14) {
                    i13 = dp2;
                } else {
                    i13 = 0;
                }
                if (z12 && z14) {
                    i14 = dp2;
                } else {
                    i14 = 0;
                }
                if (z12 && z13) {
                    i15 = dp2;
                }
                imageReceiver.setRoundRadius(i12, i13, i14, i15);
                return;
            }
            int i16 = SharedConfig.bubbleRadius;
            if (i16 > 2) {
                dp = AndroidUtilities.dp(i16 - 2);
            } else {
                dp = AndroidUtilities.dp(i16);
            }
            int min = Math.min(AndroidUtilities.dp(3.0f), dp);
            if (z11 && z13) {
                if (this.first && !this.root.hasNameOffset() && (this.root.isOut() || !this.root.isPinnedTop())) {
                    i10 = dp;
                } else {
                    i10 = min;
                }
            } else {
                i10 = 0;
            }
            if (z11 && z14) {
                if (!this.first || this.root.hasNameOffset() || (this.root.isOut() && this.root.isPinnedTop())) {
                    dp = min;
                }
            } else {
                dp = 0;
            }
            if (z12 && z14) {
                i11 = min;
            } else {
                i11 = 0;
            }
            if (z12 && z13) {
                i15 = min;
            }
            imageReceiver.setRoundRadius(i10, dp, i11, i15);
        }

        @Override
        public void getBlockAccessibilityElementBounds(int i9, Rect rect) {
            if (i9 >= 0 && i9 < this.cells.size()) {
                MediaCell mediaCell = this.cells.get(i9);
                Rect rect2 = this.padding;
                int i10 = rect2.left + mediaCell.f19658x;
                int i11 = ((int) this.currY) + rect2.top + mediaCell.f19659y;
                rect.set(i10, i11, mediaCell.f19657w + i10, mediaCell.h + i11);
            }
        }

        @Override
        public int getBlockAccessibilityElementCount() {
            return this.cells.size();
        }

        @Override
        public CharSequence getBlockAccessibilityElementText(int i9) {
            if (i9 >= 0 && i9 < this.cells.size()) {
                return this.cells.get(i9).getAccessibilityText();
            }
            return null;
        }

        @Override
        public int getHeight() {
            return this.contentHeight;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.maxWidth + rect.right;
        }

        @Override
        public void onAttachedToWindow() {
            ArrayList<MediaCell> arrayList = this.cells;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                MediaCell mediaCell = arrayList.get(i9);
                i9++;
                mediaCell.attach(this.view);
            }
        }

        @Override
        public boolean onBlockAccessibilityElementClick(int i9, View view) {
            if (i9 >= 0 && i9 < this.cells.size()) {
                return this.cells.get(i9).onAccessibilityClick(view);
            }
            return false;
        }

        @Override
        public void onDetachedFromWindow() {
            ArrayList<MediaCell> arrayList = this.cells;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                MediaCell mediaCell = arrayList.get(i9);
                i9++;
                mediaCell.detach();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i9;
            int i10;
            float f10;
            int i11;
            int i12;
            Canvas canvas2;
            if (mediaBgPaint == null) {
                Paint paint = new Paint(1);
                mediaBgPaint = paint;
                paint.setColor(251658240);
            }
            boolean isInQuote = isInQuote();
            int dp = AndroidUtilities.dp(2.0f);
            if (isInQuote) {
                i9 = 0;
            } else {
                i9 = this.root.padLeft - dp;
            }
            if (isInQuote) {
                i10 = 0;
            } else {
                i10 = this.root.padRight - dp;
            }
            int i13 = this.maxWidth;
            if (i13 > 0 && (i9 > 0 || i10 > 0)) {
                f10 = ((i13 + i9) + i10) / i13;
            } else {
                f10 = 1.0f;
            }
            for (int i14 = 0; i14 < this.cells.size(); i14++) {
                MediaCell mediaCell = this.cells.get(i14);
                int round = Math.round(mediaCell.f19658x * f10) - i9;
                int round2 = Math.round(mediaCell.f19657w * f10);
                ImageReceiver imageReceiver = mediaCell.imageReceiver;
                int[] iArr = this.cellFlags;
                if (iArr != null && i14 < iArr.length) {
                    i11 = iArr[i14];
                } else {
                    i11 = 0;
                }
                updateRoundRadius(imageReceiver, i11, isInQuote);
                float f11 = round;
                mediaCell.imageReceiver.setImageCoords(f11, mediaCell.f19659y, round2, mediaCell.h);
                if (mediaCell.imageReceiver.hasBitmapImage() && mediaCell.imageReceiver.getCurrentAlpha() == 1.0f) {
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(f11, mediaCell.f19659y, round + round2, i12 + mediaCell.h, mediaBgPaint);
                }
                mediaCell.draw(canvas2);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            Rect rect = this.padding;
            motionEvent.offsetLocation(-rect.left, -rect.top);
            boolean z10 = false;
            try {
                if (actionMasked == 0) {
                    this.pressedCell = null;
                    for (int i9 = 0; i9 < this.cells.size(); i9++) {
                        MediaCell mediaCell = this.cells.get(i9);
                        if (mediaCell.isInside(motionEvent.getX(), motionEvent.getY()) && mediaCell.onTouchEvent(motionEvent, this.view)) {
                            this.pressedCell = mediaCell;
                            return true;
                        }
                    }
                } else {
                    MediaCell mediaCell2 = this.pressedCell;
                    if (mediaCell2 != null) {
                        z10 = mediaCell2.onTouchEvent(motionEvent, this.view);
                        if (actionMasked == 1 || actionMasked == 3) {
                            this.pressedCell = null;
                        }
                    }
                }
                return z10;
            } finally {
                Rect rect2 = this.padding;
                motionEvent.offsetLocation(rect2.left, rect2.top);
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
        private org.telegram.ui.Components.pc bounce;
        private final Paint linePaint;
        private boolean pressed;
        public final Text[] texts;
        public final Text title;

        public RichDetailsBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, TL_iv.pageBlockDetails pageblockdetails, CharSequence charSequence) {
            super(richMessageLayout, rect, i9);
            int i10;
            float f10;
            this.linePaint = new Paint(1);
            this.block = pageblockdetails;
            Text text = new Text(richMessageLayout, charSequence, l0.b(16.0f, this.maxWidth - AndroidUtilities.dp(53.0f), 0));
            this.title = text;
            this.texts = new Text[]{text};
            if (richMessageLayout.isOut()) {
                i10 = org.telegram.ui.ActionBar.f6.Ek;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.Dk;
            }
            AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(richMessageLayout.getThemedColor(i10));
            this.arrow = animatedArrowDrawable;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.setAnimationProgress(f10);
        }

        private void ensureBounce() {
            View view;
            if (this.bounce == null && (view = this.root.view) != null) {
                this.bounce = new org.telegram.ui.Components.pc(view);
            }
        }

        private int getContentHeight() {
            return l0.z(12.66f, this.title.getHeight() + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.82f));
        }

        private void toggle() {
            float f10;
            this.root.snapshotForDetailsAnimation();
            TL_iv.pageBlockDetails pageblockdetails = this.block;
            boolean z10 = pageblockdetails.open;
            pageblockdetails.open = !z10;
            AnimatedArrowDrawable animatedArrowDrawable = this.arrow;
            if (!z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            RichMessageLayout richMessageLayout = this.root;
            richMessageLayout.detailsAnimating = true;
            richMessageLayout.reposition();
            View view = this.root.view;
            if (view != null) {
                view.invalidate();
            }
            org.telegram.ui.Cells.t1 cell = this.root.getCell();
            org.telegram.ui.Cells.k1 delegate = this.root.getDelegate();
            if (cell != null && delegate != null) {
                delegate.F0(cell);
            }
        }

        public void updateBubbleInsets() {
            this.title.setX((AndroidUtilities.dp(53.0f) + (this.layoutX - this.root.padLeft)) - this.title.left);
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.title, this.texts);
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i9, FoundLink foundLink) {
            if (this.title.fillFoundLink(characterStyle, foundLink)) {
                foundLink.f19655x = (AndroidUtilities.dp(53.0f) + (this.padding.left - this.root.padLeft)) - this.title.left;
                foundLink.f19656y = AndroidUtilities.dp(14.0f) + i9 + this.padding.top;
                return true;
            }
            return false;
        }

        @Override
        public void getBlockAccessibilityElementBounds(int i9, Rect rect) {
            Rect rect2 = this.padding;
            int i10 = ((int) this.currY) + rect2.top;
            int i11 = rect2.left;
            RichMessageLayout richMessageLayout = this.root;
            rect.set(i11 - richMessageLayout.padLeft, i10, (richMessageLayout.getMinWidth() + this.root.padRight) - this.padding.right, getContentHeight() + i10);
        }

        @Override
        public int getBlockAccessibilityElementCount() {
            return 1;
        }

        @Override
        public CharSequence getBlockAccessibilityElementStateDescription(int i9) {
            int i10;
            if (isOpen()) {
                i10 = R.string.AccDescrExpanded;
            } else {
                i10 = R.string.AccDescrCollapsed;
            }
            return LocaleController.getString(i10);
        }

        @Override
        public CharSequence getBlockAccessibilityElementText(int i9) {
            CharSequence charSequence;
            int i10;
            CharSequence concat;
            StaticLayout staticLayout;
            Text text = this.title;
            if (text != null && (staticLayout = text.layout) != null) {
                charSequence = RichBlock.withReplacements(staticLayout.getText());
            } else {
                charSequence = null;
            }
            String string = LocaleController.getString(R.string.ArticleToggleBlock);
            if (isOpen()) {
                i10 = R.string.AccDescrExpanded;
            } else {
                i10 = R.string.AccDescrCollapsed;
            }
            String string2 = LocaleController.getString(i10);
            if (TextUtils.isEmpty(charSequence)) {
                concat = "";
            } else {
                concat = TextUtils.concat(", ", charSequence);
            }
            return TextUtils.concat(string, ", ", string2, concat);
        }

        @Override
        public int getHeight() {
            return this.padding.top + getContentHeight() + this.padding.bottom;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public int getMinWidth() {
            return AndroidUtilities.dp(16.0f) + this.title.getMinWidth() + AndroidUtilities.dp(53.0f) + this.padding.left + this.padding.right;
        }

        @Override
        public org.telegram.ui.Cells.y9[] getText() {
            return this.texts;
        }

        @Override
        public boolean isBlockAccessibilityElementText(int i9) {
            return true;
        }

        public boolean isOpen() {
            return this.block.open;
        }

        @Override
        public void onAttachedToWindow() {
            this.title.attach(this.view);
        }

        @Override
        public boolean onBlockAccessibilityElementClick(int i9, View view) {
            toggle();
            return true;
        }

        @Override
        public void onDetachedFromWindow() {
            this.title.detach(this.view);
        }

        @Override
        public void onDraw(Canvas canvas) {
            float f10;
            int i9;
            int i10;
            org.telegram.ui.Components.pc pcVar = this.bounce;
            if (pcVar != null) {
                f10 = pcVar.a(0.02f);
            } else {
                f10 = 1.0f;
            }
            RichMessageLayout richMessageLayout = this.root;
            float f11 = -richMessageLayout.padLeft;
            int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            float f12 = (minWidth - rect.left) - rect.right;
            int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i11 != 0) {
                canvas.save();
                canvas.scale(f10, f10, (f11 + f12) / 2.0f, getContentHeight() / 2.0f);
            }
            RichMessageLayout richMessageLayout2 = this.root;
            if (richMessageLayout2.isOut()) {
                i9 = org.telegram.ui.ActionBar.f6.Ek;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.Dk;
            }
            int themedColor = richMessageLayout2.getThemedColor(i9);
            AnimatedArrowDrawable animatedArrowDrawable = this.arrow;
            animatedArrowDrawable.f26056a.setColor(themedColor);
            animatedArrowDrawable.invalidateSelf();
            canvas.save();
            canvas.translate(AndroidUtilities.dpf2(22.6f) + f11, AndroidUtilities.dpf2(21.66f));
            this.arrow.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.dp(53.0f) + f11, AndroidUtilities.dp(14.0f));
            this.title.draw(canvas);
            canvas.restore();
            if (i11 != 0) {
                canvas.restore();
            }
            if (!isOpen()) {
                RichMessageLayout richMessageLayout3 = this.root;
                if (!richMessageLayout3.detailsAnimating) {
                    Paint paint = this.linePaint;
                    if (richMessageLayout3.isOut()) {
                        i10 = org.telegram.ui.ActionBar.f6.Gk;
                    } else {
                        i10 = org.telegram.ui.ActionBar.f6.Fk;
                    }
                    paint.setColor(richMessageLayout3.getThemedColor(i10));
                    canvas.drawRect(f11, getContentHeight() - 1.0f, f12, getContentHeight(), this.linePaint);
                }
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.pressed = true;
                ensureBounce();
                org.telegram.ui.Components.pc pcVar = this.bounce;
                if (pcVar != null) {
                    pcVar.c(true);
                }
                return true;
            } else if (actionMasked == 1) {
                if (!this.pressed) {
                    return false;
                }
                this.pressed = false;
                org.telegram.ui.Components.pc pcVar2 = this.bounce;
                if (pcVar2 != null) {
                    pcVar2.c(false);
                }
                View view = this.root.view;
                if (view != null) {
                    view.playSoundEffect(0);
                }
                toggle();
                return true;
            } else {
                if (actionMasked == 3) {
                    this.pressed = false;
                    org.telegram.ui.Components.pc pcVar3 = this.bounce;
                    if (pcVar3 != null) {
                        pcVar3.c(false);
                    }
                }
                return this.pressed;
            }
        }

        @Override
        public void placeTexts(int i9, int i10, int i11) {
            this.layoutX = i9;
            this.layoutY = i10;
            this.layoutRow = i11;
            this.title.setX((AndroidUtilities.dp(53.0f) + (i9 - this.root.padLeft)) - this.title.left);
            this.title.setY(AndroidUtilities.dp(14.0f) + i10);
            this.title.setRow(i11);
        }
    }

    public static class RichDetailsEndBlock extends RichBlock {
        private final Paint paint;

        public RichDetailsEndBlock(RichMessageLayout richMessageLayout, Rect rect, int i9) {
            super(richMessageLayout, rect, i9);
            this.paint = new Paint(1);
        }

        @Override
        public int getHeight() {
            return l0.C(6.0f, this.padding.top, 1) + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            return AndroidUtilities.dp(32.0f) + this.padding.left + this.padding.right;
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i9;
            int i10;
            float f10;
            Paint paint = this.paint;
            RichMessageLayout richMessageLayout = this.root;
            if (richMessageLayout.isOut()) {
                i9 = org.telegram.ui.ActionBar.f6.Gk;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.Fk;
            }
            paint.setColor(richMessageLayout.getThemedColor(i9));
            RichMessageLayout richMessageLayout2 = this.root;
            float f11 = -richMessageLayout2.padLeft;
            int minWidth = richMessageLayout2.getMinWidth();
            RichMessageLayout richMessageLayout3 = this.root;
            int i11 = minWidth + richMessageLayout3.padRight;
            Rect rect = this.padding;
            float f12 = (i11 - rect.left) - rect.right;
            float f13 = 0.0f;
            if (richMessageLayout3.detailsAnimating) {
                if (this.prevVisible) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                if (this.currVisible) {
                    f13 = 1.0f;
                }
                f13 = AndroidUtilities.lerp(f10, f13, richMessageLayout3.detailsAnimationProgress);
            } else if (this.currVisible) {
                f13 = 1.0f;
            }
            RichDetailsBlock richDetailsBlock = this.parentDetails;
            if (richDetailsBlock != null) {
                i10 = richDetailsBlock.padding.bottom;
            } else {
                i10 = 0;
            }
            float lerp = AndroidUtilities.lerp((-1.0f) - i10, AndroidUtilities.dp(6.0f), f13);
            canvas.drawRect(f11, lerp, f12, lerp + 1.0f, this.paint);
        }
    }

    public static class RichDividerBlock extends RichBlock {
        public final Paint paint;

        public RichDividerBlock(RichMessageLayout richMessageLayout, Rect rect, int i9) {
            super(richMessageLayout, rect, i9);
            this.paint = new Paint(1);
        }

        @Override
        public int getHeight() {
            return AndroidUtilities.dp(12.0f) + this.padding.top + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            return AndroidUtilities.dp(32.0f);
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i9;
            int minWidth = this.root.getMinWidth();
            RichMessageLayout richMessageLayout = this.root;
            int i10 = richMessageLayout.padLeft;
            int i11 = minWidth + i10 + richMessageLayout.padRight;
            Rect rect = this.padding;
            int i12 = rect.left;
            int i13 = (i11 - i12) - rect.right;
            int i14 = i13 / 2;
            float f10 = (((i13 - i14) / 2.0f) - i10) + i12;
            float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
            Paint paint = this.paint;
            RichMessageLayout richMessageLayout2 = this.root;
            if (richMessageLayout2.isOut()) {
                i9 = org.telegram.ui.ActionBar.f6.wk;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.vk;
            }
            paint.setColor(richMessageLayout2.getThemedColor(i9));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f10, dp, i14 + f10, AndroidUtilities.dp(1.0f) + dp);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.paint);
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

        public RichMapBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, TL_iv.pageBlockMap pageblockmap) {
            super(richMessageLayout, rect, i9);
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            this.block = pageblockmap;
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            int i10 = pageblockmap.f22603w;
            i10 = i10 <= 0 ? 100 : i10;
            int i11 = pageblockmap.h;
            int i12 = i11 > 0 ? i11 : 100;
            int i13 = this.maxWidth;
            int max = (int) ((i13 / Math.max(1, i10)) * i12);
            Point point = AndroidUtilities.displaySize;
            int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (max > max2) {
                i13 = (int) ((max2 / Math.max(1, i12)) * i10);
                max = max2;
            }
            this.imgWidth = i13;
            this.imgHeight = max;
            imageReceiver.setImageCoords(0.0f, 0.0f, i13, max);
            applyImage();
        }

        private void applyImage() {
            int i9;
            if (this.block.geo != null) {
                int i10 = this.root.currentAccount;
                int i11 = MessagesController.getInstance(i10).mapProvider;
                this.currentMapProvider = i11;
                float f10 = AndroidUtilities.density;
                int i12 = (int) (this.imgWidth / f10);
                int i13 = (int) (this.imgHeight / f10);
                TL_iv.pageBlockMap pageblockmap = this.block;
                int i14 = pageblockmap.zoom;
                if (i14 > 0) {
                    i9 = i14;
                } else {
                    i9 = 15;
                }
                if (i11 == 2) {
                    WebFile createWithGeoPoint = WebFile.createWithGeoPoint(pageblockmap.geo, i12, i13, i9, Math.min(2, (int) Math.ceil(f10)));
                    if (createWithGeoPoint != null) {
                        this.imageReceiver.setImage(ImageLocation.getForWebFile(createWithGeoPoint), null, null, null, this.root.messageObject, 0);
                        return;
                    }
                    return;
                }
                TLRPC.GeoPoint geoPoint = pageblockmap.geo;
                String formapMapUrl = AndroidUtilities.formapMapUrl(i10, geoPoint.lat, geoPoint._long, i12, i13, true, i9, -1);
                if (formapMapUrl != null) {
                    this.imageReceiver.setImage(formapMapUrl, null, null, null, 0L);
                }
            }
        }

        @Override
        public int getHeight() {
            Rect rect = this.padding;
            return rect.top + this.imgHeight + rect.bottom;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.imgWidth + rect.right;
        }

        @Override
        public void onAttachedToWindow() {
            this.imageReceiver.setParentView(this.view);
            this.imageReceiver.onAttachedToWindow();
        }

        @Override
        public void onDetachedFromWindow() {
            this.imageReceiver.onDetachedFromWindow();
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i9;
            Drawable drawable;
            View view;
            if (mapBgPaint == null) {
                mapBgPaint = new Paint(1);
            }
            mapBgPaint.setColor(this.root.getThemedColor(org.telegram.ui.ActionBar.f6.f23218pe));
            boolean isInQuote = isInQuote();
            int i10 = 0;
            if (isInQuote) {
                i9 = 0;
            } else {
                i9 = this.root.padLeft;
            }
            if (!isInQuote) {
                i10 = this.root.padRight;
            }
            float f10 = -i9;
            canvas.drawRect(f10, 0.0f, this.imgWidth + i10, this.imgHeight, mapBgPaint);
            Drawable drawable2 = org.telegram.ui.ActionBar.f6.S4[this.root.isOut() ? 1 : 0];
            if (drawable2 != null) {
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = drawable2.getIntrinsicHeight();
                int i11 = (this.imgWidth - intrinsicWidth) / 2;
                int i12 = (this.imgHeight - intrinsicHeight) / 2;
                drawable2.setBounds(i11, i12, intrinsicWidth + i11, intrinsicHeight + i12);
                drawable2.draw(canvas);
            }
            this.imageReceiver.setImageCoords(f10, 0.0f, this.imgWidth + i9 + i10, this.imgHeight);
            this.imageReceiver.draw(canvas);
            if (this.currentMapProvider == 2 && this.imageReceiver.hasNotThumb()) {
                if (this.redPinIcon == null && (view = this.view) != null) {
                    this.redPinIcon = view.getContext().getDrawable(R.drawable.map_pin).mutate();
                }
                if (this.redPinIcon != null) {
                    int intrinsicWidth2 = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight2 = (int) (this.redPinIcon.getIntrinsicHeight() * 0.8f);
                    int i13 = (this.imgWidth - intrinsicWidth2) / 2;
                    int i14 = (this.imgHeight / 2) - intrinsicHeight2;
                    this.redPinIcon.setAlpha((int) (this.imageReceiver.getCurrentAlpha() * 255.0f));
                    this.redPinIcon.setBounds(i13, i14, intrinsicWidth2 + i13, intrinsicHeight2 + i14);
                    this.redPinIcon.draw(canvas);
                }
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            View view;
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX() - this.padding.left;
            float y10 = motionEvent.getY() - this.padding.top;
            if (x10 >= 0.0f && x10 <= this.imgWidth && y10 >= 0.0f && y10 <= this.imgHeight) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (actionMasked == 0) {
                if (!z10) {
                    return false;
                }
                this.photoPressed = true;
                return true;
            } else if (actionMasked == 1) {
                if (this.photoPressed) {
                    this.photoPressed = false;
                    if (z10 && this.block.geo != null && (view = this.view) != null) {
                        view.playSoundEffect(0);
                        try {
                            TLRPC.GeoPoint geoPoint = this.block.geo;
                            double d = geoPoint.lat;
                            double d9 = geoPoint._long;
                            Context context = this.view.getContext();
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d9 + "?q=" + d + "," + d9)));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        return true;
                    }
                }
                return false;
            } else {
                if (actionMasked == 3) {
                    this.photoPressed = false;
                }
                return this.photoPressed;
            }
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

        public RichMathBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, TL_iv.pageBlockMath pageblockmath) {
            super(richMessageLayout, rect, i9);
            qh.q qVar;
            this.paint = new Paint(3);
            this.flingTick = new Runnable() {
                {
                    RichMathBlock.this = this;
                }

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
                            if (!RichMathBlock.this.scroller.isFinished()) {
                                RichMathBlock.this.view.postOnAnimation(this);
                            }
                        }
                    }
                }
            };
            this.block = pageblockmath;
            int i10 = this.maxWidth;
            this.viewportWidth = i10;
            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                qVar = qh.q.a(pageblockmath.source, AndroidUtilities.dp(richMessageLayout.fontSize + 4), false);
            } else {
                qVar = null;
            }
            if (qVar != null) {
                this.bitmap = qVar.f46618a;
                this.contentW = qVar.f46619b;
                this.contentH = qVar.f46620c;
            }
            int D = l0.D(0.0f, 2, this.contentW);
            this.contentWidth = D;
            this.maxScrollX = Math.max(0, D - i10);
        }

        private void ensureTouchConfig() {
            View view;
            if (this.touchSlop == 0 && (view = this.view) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.touchSlop = viewConfiguration.getScaledTouchSlop();
                this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.scroller == null && this.view != null) {
                this.scroller = new OverScroller(this.view.getContext());
            }
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            TL_iv.pageBlockMath pageblockmath = this.block;
            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                spannableStringBuilder.append((CharSequence) this.block.source);
            }
        }

        @Override
        public int getHeight() {
            return l0.D(8.0f, 2, this.padding.top + this.contentH) + this.padding.bottom;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public int getMinWidth() {
            return Math.min(this.viewportWidth, this.contentWidth) + this.padding.left + this.padding.right;
        }

        @Override
        public boolean isHorizontallyDragging() {
            if (!this.dragging) {
                OverScroller overScroller = this.scroller;
                if (overScroller == null || overScroller.isFinished()) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i9;
            Canvas canvas2;
            int i10;
            if (this.bitmap == null) {
                return;
            }
            Paint paint = this.paint;
            RichMessageLayout richMessageLayout = this.root;
            if (richMessageLayout.isOut()) {
                i9 = org.telegram.ui.ActionBar.f6.fc;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.ec;
            }
            paint.setColor(richMessageLayout.getThemedColor(i9));
            int D = l0.D(8.0f, 2, this.contentH);
            if (this.maxScrollX > 0) {
                RichMessageLayout richMessageLayout2 = this.root;
                float f10 = -richMessageLayout2.padLeft;
                int minWidth = richMessageLayout2.getMinWidth() + this.root.padRight;
                Rect rect = this.padding;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(f10, 0.0f, (minWidth - rect.left) - rect.right, D, 255, 31);
                canvas2.save();
                canvas2.translate(AndroidUtilities.dp(0.0f) - this.scrollX, AndroidUtilities.dp(8.0f));
            } else {
                canvas2 = canvas;
                canvas2.save();
                canvas2.translate(((this.root.getMinWidth() / 2.0f) - this.padding.left) - (this.contentW / 2.0f), AndroidUtilities.dp(8.0f));
            }
            canvas2.drawBitmap(this.bitmap, 0.0f, 0.0f, this.paint);
            if (this.maxScrollX > 0) {
                canvas2.restore();
                RectF rectF = AndroidUtilities.rectTmp;
                int i11 = this.root.padLeft;
                float f11 = D;
                rectF.set(-i11, 0.0f, AndroidUtilities.dp(12.0f) + (-i11), f11);
                this.root.clip.b(canvas2, rectF, 0, 1.0f);
                int minWidth2 = this.root.getMinWidth() + this.root.padRight;
                Rect rect2 = this.padding;
                rectF.set(i10 - AndroidUtilities.dp(12.0f), 0.0f, (minWidth2 - rect2.left) - rect2.right, f11);
                this.root.clip.b(canvas2, rectF, 2, 1.0f);
            }
            canvas2.restore();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            VelocityTracker velocityTracker;
            int i9 = 0;
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
            } else if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.downX;
                if (!this.dragging && Math.abs(x10) > this.touchSlop) {
                    this.dragging = true;
                    requestDisallowParentIntercept(true);
                }
                if (!this.dragging) {
                    return false;
                }
                int i10 = (int) (this.downScrollX - x10);
                if (i10 >= 0) {
                    i9 = i10;
                }
                int i11 = this.maxScrollX;
                if (i9 > i11) {
                    i9 = i11;
                }
                if (i9 != this.scrollX) {
                    this.scrollX = i9;
                    View view = this.view;
                    if (view != null) {
                        view.invalidate();
                    }
                }
                return true;
            } else if (actionMasked != 1 && actionMasked != 3) {
                return false;
            } else {
                boolean z10 = this.dragging;
                this.dragging = false;
                if (z10) {
                    requestDisallowParentIntercept(false);
                    if (actionMasked == 1 && (velocityTracker = this.velocityTracker) != null && this.scroller != null && this.view != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.velocityTracker.computeCurrentVelocity(1000, this.maxFlingVelocity);
                        float f10 = -this.velocityTracker.getXVelocity();
                        if (Math.abs(f10) > this.minFlingVelocity) {
                            this.scroller.fling(this.scrollX, 0, (int) f10, 0, 0, this.maxScrollX, 0, 0);
                            this.view.postOnAnimation(this.flingTick);
                        }
                    }
                }
                VelocityTracker velocityTracker4 = this.velocityTracker;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.velocityTracker = null;
                }
                if (!z10 && actionMasked != 1) {
                    return false;
                }
                return true;
            }
        }
    }

    public static class RichPhotoBlock extends RichMediaBlock {
        public final TL_iv.pageBlockPhoto block;
        public final TLRPC.Photo photo;
        public final TLRPC.PhotoSize sizeFull;
        public final TLRPC.PhotoSize strippedSize;

        public RichPhotoBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, TL_iv.pageBlockPhoto pageblockphoto, boolean z10) {
            super(richMessageLayout, rect, i9, z10);
            int i10;
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
            if (photoSize != null) {
                i10 = photoSize.f22405w;
            } else {
                i10 = 100;
            }
            int i11 = photoSize != null ? photoSize.h : 100;
            int i12 = this.maxWidth;
            int max = (int) ((i12 / Math.max(1, i10)) * i11);
            Point point = AndroidUtilities.displaySize;
            int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (max > max2) {
                i12 = (int) ((max2 / Math.max(1, i11)) * i10);
                max = max2;
            }
            this.imgWidth = i12;
            this.imgHeight = max;
            finishLayout();
        }

        @Override
        public void applyImage(boolean z10) {
            ImageLocation imageLocation;
            TLRPC.Photo photo = this.photo;
            if (photo != null && this.sizeFull != null) {
                TLRPC.PhotoSize photoSize = this.strippedSize;
                if (photoSize != null) {
                    imageLocation = ImageLocation.getForPhoto(photoSize, photo);
                } else {
                    imageLocation = null;
                }
                ImageLocation imageLocation2 = imageLocation;
                if (z10) {
                    this.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(this.sizeFull, this.photo), null, imageLocation2, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
                } else {
                    this.imageReceiver.setImage(null, null, null, null, imageLocation2, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
                }
            }
        }

        @Override
        public boolean fileExists() {
            if (this.sizeFull == null) {
                return true;
            }
            File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, true);
            File pathToAttach2 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, false);
            if (pathToAttach.exists() || (pathToAttach2 != null && pathToAttach2.exists())) {
                return true;
            }
            return false;
        }

        @Override
        public TL_iv.PageBlock getBlock() {
            return this.block;
        }

        @Override
        public String getFileName() {
            return FileLoader.getAttachFileName(this.sizeFull);
        }

        @Override
        public boolean isSpoiler() {
            TL_iv.pageBlockPhoto pageblockphoto = this.block;
            if (pageblockphoto != null && pageblockphoto.spoiler) {
                return true;
            }
            return false;
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

        public RichPreformattedBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, TL_iv.pageBlockPreformatted pageblockpreformatted, RichPreformattedBlock richPreformattedBlock) {
            super(richMessageLayout, rect, i9);
            this.bgPaint = new Paint(1);
            this.flingTick = new Runnable() {
                {
                    RichPreformattedBlock.this = this;
                }

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
                            if (!RichPreformattedBlock.this.scroller.isFinished()) {
                                RichPreformattedBlock.this.view.postOnAnimation(this);
                            }
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
                    if ((charSequence instanceof CodeHighlighting.LockedWithFallbackSpannableString) && !((CodeHighlighting.LockedWithFallbackSpannableString) charSequence).ready) {
                        charSequence = ((CodeHighlighting.LockedWithFallbackSpannableString) charSequence).fallback;
                    }
                    if (charSequence != null && charSequence.length() > 0 && this.plain.length() >= charSequence.length()) {
                        if (charSequence instanceof CodeHighlighting.LockedWithFallbackSpannableString) {
                            ((CodeHighlighting.LockedWithFallbackSpannableString) charSequence).fallback = null;
                        }
                        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) this.plain.substring(charSequence.length()));
                        for (StyleSpan styleSpan : (StyleSpan[]) append.getSpans(0, append.length(), StyleSpan.class)) {
                            append.removeSpan(styleSpan);
                        }
                        append.setSpan(new StyleSpan(richMessageLayout, 8), 0, append.length(), 33);
                        CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) append.getSpans(0, append.length(), CodeHighlighting.Span.class);
                        for (int i10 = 0; i10 < spanArr.length; i10++) {
                            int spanStart = append.getSpanStart(spanArr[i10]);
                            int spanStart2 = append.getSpanStart(spanArr[i10]);
                            append.removeSpan(spanArr[i10]);
                            append.setSpan(spanArr[i10], spanStart, spanStart2, 33);
                        }
                        this.content = new CodeHighlighting.LockedWithFallbackSpannableString(this.content, append);
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
            int D = l0.D(0.0f, 2, Math.max(0, text.right - text.left));
            this.contentWidth = D;
            int max = Math.max(0, D - this.viewportWidth);
            this.maxScrollX = max;
            if (richPreformattedBlock != null) {
                this.scrollX = Utilities.clamp(richPreformattedBlock.scrollX, max, 0);
            }
        }

        private void drawBackground(Canvas canvas) {
            int i9;
            Paint paint = this.bgPaint;
            RichMessageLayout richMessageLayout = this.root;
            if (richMessageLayout.isOut()) {
                i9 = org.telegram.ui.ActionBar.f6.yk;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.xk;
            }
            paint.setColor(richMessageLayout.getThemedColor(i9));
            if (this.padding.left > 0) {
                int minWidth = this.root.getMinWidth();
                Rect rect = this.padding;
                canvas.drawRect(0.0f, 0.0f, (minWidth - rect.left) - rect.right, getBackgroundHeight(), this.bgPaint);
                return;
            }
            RichMessageLayout richMessageLayout2 = this.root;
            canvas.drawRect(-richMessageLayout2.padLeft, 0.0f, richMessageLayout2.getMinWidth() + this.root.padRight, getBackgroundHeight(), this.bgPaint);
        }

        private void drawScrollbar(Canvas canvas) {
            float f10;
            float minWidth;
            int i9;
            int i10;
            if (this.maxScrollX > 0) {
                if (this.padding.left > 0) {
                    int minWidth2 = this.root.getMinWidth();
                    Rect rect = this.padding;
                    minWidth = (minWidth2 - rect.left) - rect.right;
                    f10 = 0.0f;
                } else {
                    RichMessageLayout richMessageLayout = this.root;
                    f10 = -richMessageLayout.padLeft;
                    minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
                }
                float dp = f10 + AndroidUtilities.dp(6.0f);
                float dp2 = minWidth - AndroidUtilities.dp(6.0f);
                if (dp2 <= dp) {
                    return;
                }
                float dp3 = AndroidUtilities.dp(23.0f) + this.text.getHeight();
                float dp4 = dp3 + AndroidUtilities.dp(5.0f);
                float dp5 = AndroidUtilities.dp(2.5f);
                Paint paint = this.bgPaint;
                RichMessageLayout richMessageLayout2 = this.root;
                if (richMessageLayout2.isOut()) {
                    i9 = org.telegram.ui.ActionBar.f6.Bk;
                } else {
                    i9 = org.telegram.ui.ActionBar.f6.zk;
                }
                paint.setColor(richMessageLayout2.getThemedColor(i9));
                canvas.drawRoundRect(dp, dp3, dp2, dp4, dp5, dp5, this.bgPaint);
                float f11 = dp2 - dp;
                float min = Math.min(f11, Math.max(AndroidUtilities.dp(5.0f), (this.viewportWidth * f11) / this.contentWidth));
                float f12 = (((f11 - min) * this.scrollX) / this.maxScrollX) + dp;
                Paint paint2 = this.bgPaint;
                RichMessageLayout richMessageLayout3 = this.root;
                if (richMessageLayout3.isOut()) {
                    i10 = org.telegram.ui.ActionBar.f6.Ck;
                } else {
                    i10 = org.telegram.ui.ActionBar.f6.Ak;
                }
                paint2.setColor(richMessageLayout3.getThemedColor(i10));
                canvas.drawRoundRect(f12, dp3, f12 + min, dp4, dp5, dp5, this.bgPaint);
            }
        }

        private void drawTextContent(Canvas canvas, boolean z10, int i9, float f10) {
            RichMessageLayout richMessageLayout;
            int i10;
            int min = Math.min(this.viewportWidth, this.contentWidth);
            int D = l0.D(8.0f, 2, this.text.getHeight());
            if (this.padding.left > 0) {
                canvas.save();
                canvas.clipRect(0, 0, min, D);
                canvas.translate(AndroidUtilities.dp(0.0f) - this.scrollX, AndroidUtilities.dp(8.0f));
                if (z10) {
                    this.text.drawFade(canvas, i9, f10);
                } else {
                    this.text.draw(canvas);
                }
                canvas.restore();
                return;
            }
            float f11 = min + this.root.padRight;
            float f12 = D;
            canvas.saveLayerAlpha(-richMessageLayout.padLeft, 0.0f, f11, f12, 255, 31);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(0.0f) - this.scrollX, AndroidUtilities.dp(8.0f));
            if (z10) {
                this.text.drawFade(canvas, i9, f10);
            } else {
                this.text.draw(canvas);
            }
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            int i11 = this.root.padLeft;
            rectF.set(-i11, 0.0f, AndroidUtilities.dp(12.0f) + (-i11), f12);
            this.root.clip.b(canvas, rectF, 0, 1.0f);
            int minWidth = this.root.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            rectF.set(i10 - AndroidUtilities.dp(12.0f), 0.0f, (minWidth - rect.left) - rect.right, f12);
            this.root.clip.b(canvas, rectF, 2, 1.0f);
            canvas.restore();
        }

        private void ensureTouchConfig() {
            View view;
            if (this.touchSlop == 0 && (view = this.view) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.touchSlop = viewConfiguration.getScaledTouchSlop();
                this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.scroller == null && this.view != null) {
                this.scroller = new OverScroller(this.view.getContext());
            }
        }

        private int getBackgroundHeight() {
            int i9;
            int dp = AndroidUtilities.dp(16.0f) + this.text.getHeight();
            if (this.maxScrollX > 0) {
                i9 = AndroidUtilities.dp(19.0f);
            } else {
                i9 = 0;
            }
            return dp + i9;
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.text, this.texts);
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i9, FoundLink foundLink) {
            if (this.text.fillFoundLink(characterStyle, foundLink)) {
                foundLink.f19655x = ((AndroidUtilities.dp(0.0f) + this.padding.left) - this.scrollX) - this.text.left;
                foundLink.f19656y = AndroidUtilities.dp(15.0f) + i9 + this.padding.top;
                return true;
            }
            return false;
        }

        @Override
        public CharSequence getAccessibilityLabel() {
            CharSequence accessibilityLabel = super.getAccessibilityLabel();
            if (!TextUtils.isEmpty(this.language)) {
                String capitalizeLanguage = MessageObject.TextLayoutBlock.capitalizeLanguage(this.language);
                if (!TextUtils.isEmpty(capitalizeLanguage)) {
                    return TextUtils.concat(accessibilityLabel, " (", capitalizeLanguage, ")");
                }
            }
            return accessibilityLabel;
        }

        @Override
        public int getHeight() {
            return l0.D(7.0f, 2, this.padding.top) + getBackgroundHeight() + this.padding.bottom;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public Layout getLayout() {
            return this.text.layout;
        }

        @Override
        public int getMinWidth() {
            return Math.min(this.viewportWidth, this.contentWidth) + this.padding.left + this.padding.right;
        }

        @Override
        public org.telegram.ui.Cells.y9[] getText() {
            return this.texts;
        }

        @Override
        public boolean isHorizontallyDragging() {
            if (!this.dragging) {
                OverScroller overScroller = this.scroller;
                if (overScroller == null || overScroller.isFinished()) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override
        public void onAttachedToWindow() {
            this.text.attach(this.view);
        }

        @Override
        public void onDetachedFromWindow() {
            this.text.detach(this.view);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(0.0f, AndroidUtilities.dp(7.0f));
            drawBackground(canvas);
            drawTextContent(canvas, false, 0, 0.0f);
            drawScrollbar(canvas);
            canvas.restore();
        }

        @Override
        public void onDrawFaded(Canvas canvas, int i9, float f10) {
            StaticLayout staticLayout = this.text.layout;
            if (staticLayout != null && i9 >= 0 && i9 < staticLayout.getLineCount()) {
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(7.0f));
                drawBackground(canvas);
                drawTextContent(canvas, true, i9, f10);
                drawScrollbar(canvas);
                canvas.restore();
                return;
            }
            onDraw(canvas);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            VelocityTracker velocityTracker;
            int actionMasked = motionEvent.getActionMasked();
            float dp = AndroidUtilities.dp(0.0f) - this.scrollX;
            float dp2 = AndroidUtilities.dp(15.0f);
            int i9 = 0;
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
                motionEvent.offsetLocation(-dp, -dp2);
                this.textHandlingTouch = this.text.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(dp, dp2);
                return true;
            } else if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.downX;
                if (!this.dragging && this.maxScrollX > 0 && Math.abs(x10) > this.touchSlop) {
                    this.dragging = true;
                    requestDisallowParentIntercept(true);
                    if (this.textHandlingTouch) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.setAction(3);
                        obtain.offsetLocation(-dp, -dp2);
                        this.text.onTouchEvent(obtain);
                        obtain.recycle();
                        this.textHandlingTouch = false;
                    }
                }
                if (this.dragging) {
                    int i10 = (int) (this.downScrollX - x10);
                    if (i10 >= 0) {
                        i9 = i10;
                    }
                    int i11 = this.maxScrollX;
                    if (i9 > i11) {
                        i9 = i11;
                    }
                    if (i9 != this.scrollX) {
                        this.scrollX = i9;
                        placeTexts(this.layoutX, this.layoutY, this.layoutRow);
                        View view = this.view;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                    return true;
                }
                return this.textHandlingTouch;
            } else if (actionMasked != 1 && actionMasked != 3) {
                return false;
            } else {
                boolean z10 = this.dragging;
                this.dragging = false;
                if (z10) {
                    requestDisallowParentIntercept(false);
                    if (actionMasked == 1 && (velocityTracker = this.velocityTracker) != null && this.scroller != null && this.view != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.velocityTracker.computeCurrentVelocity(1000, this.maxFlingVelocity);
                        float f10 = -this.velocityTracker.getXVelocity();
                        if (Math.abs(f10) > this.minFlingVelocity) {
                            this.scroller.fling(this.scrollX, 0, (int) f10, 0, 0, this.maxScrollX, 0, 0);
                            this.view.postOnAnimation(this.flingTick);
                        }
                    }
                }
                if (!z10 && this.textHandlingTouch) {
                    motionEvent.offsetLocation(-dp, -dp2);
                    this.text.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(dp, dp2);
                }
                this.textHandlingTouch = false;
                VelocityTracker velocityTracker4 = this.velocityTracker;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.velocityTracker = null;
                }
                if (!z10 && actionMasked != 1) {
                    return false;
                }
                return true;
            }
        }

        @Override
        public void placeTexts(int i9, int i10, int i11) {
            this.layoutX = i9;
            this.layoutY = i10;
            this.layoutRow = i11;
            this.text.setX(((AndroidUtilities.dp(0.0f) + i9) - this.scrollX) - this.text.left);
            this.text.setY(AndroidUtilities.dp(15.0f) + i10);
            this.text.setRow(i11);
        }
    }

    public static class RichPullquoteBlock extends RichTextWithAuthorBlock {
        public RichPullquoteBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, CharSequence charSequence, CharSequence charSequence2) {
            super(richMessageLayout, rect, i9, charSequence, charSequence2, Layout.Alignment.ALIGN_CENTER);
        }
    }

    public static class RichQuoteBlock extends RichTextWithAuthorBlock {
        public RichQuoteBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, CharSequence charSequence, CharSequence charSequence2) {
            super(richMessageLayout, rect, i9, charSequence, charSequence2, Layout.Alignment.ALIGN_NORMAL);
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

        public RichSlideshowBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, TL_iv.pageBlockSlideshow pageblockslideshow, boolean z10) {
            super(richMessageLayout, rect, i9);
            this.cells = new ArrayList<>();
            this.clipPath = new Path();
            this.block = pageblockslideshow;
            this.first = z10;
            for (int i10 = 0; i10 < pageblockslideshow.items.size(); i10++) {
                MediaCell forPageBlock = MediaCell.forPageBlock(richMessageLayout, pageblockslideshow.items.get(i10));
                if (forPageBlock != null) {
                    this.cells.add(forPageBlock);
                }
            }
            layoutCells();
        }

        public void lambda$settle$0(ValueAnimator valueAnimator) {
            this.pageOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        private void layoutCells() {
            if (this.cells.isEmpty()) {
                this.slideHeight = 0;
                this.slideWidth = 0;
                return;
            }
            this.slideWidth = this.maxWidth;
            ArrayList<MediaCell> arrayList = this.cells;
            int size = arrayList.size();
            float f10 = 0.0f;
            int i9 = 0;
            while (i9 < size) {
                MediaCell mediaCell = arrayList.get(i9);
                i9++;
                float f11 = mediaCell.aspectRatio;
                if (f11 <= 0.0f) {
                    f11 = 1.0f;
                }
                f10 += f11;
            }
            int max = (int) (this.slideWidth / Math.max(0.5f, f10 / this.cells.size()));
            Point point = AndroidUtilities.displaySize;
            int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (max > max2) {
                max = max2;
            }
            this.slideHeight = max;
            this.dotsHeight = 0;
            ArrayList<MediaCell> arrayList2 = this.cells;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                MediaCell mediaCell2 = arrayList2.get(i10);
                i10++;
                mediaCell2.setRect(0, 0, this.slideWidth, this.slideHeight);
            }
        }

        private void settle(float f10) {
            int i9;
            if (f10 >= 0.0f || this.currentPage >= this.cells.size() - 1) {
                i9 = -1;
                if (f10 <= 0.0f || this.currentPage <= 0) {
                    if (this.pageOffset <= 0.5f || this.currentPage >= this.cells.size() - 1) {
                        if (this.pageOffset >= -0.5f || this.currentPage <= 0) {
                            i9 = 0;
                        }
                    }
                }
                int i10 = this.currentPage;
                final int i11 = i9 + i10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.pageOffset, i11 - i10);
                this.settleAnimator = ofFloat;
                ofFloat.setDuration(420L);
                this.settleAnimator.setInterpolator(gr.h);
                this.settleAnimator.addUpdateListener(new o(this, 2));
                this.settleAnimator.addListener(new AnimatorListenerAdapter() {
                    {
                        RichSlideshowBlock.this = this;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        RichSlideshowBlock.this.currentPage = i11;
                        RichSlideshowBlock.this.pageOffset = 0.0f;
                        View view = RichSlideshowBlock.this.view;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                });
                this.settleAnimator.start();
            }
            i9 = 1;
            int i102 = this.currentPage;
            final int i112 = i9 + i102;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.pageOffset, i112 - i102);
            this.settleAnimator = ofFloat2;
            ofFloat2.setDuration(420L);
            this.settleAnimator.setInterpolator(gr.h);
            this.settleAnimator.addUpdateListener(new o(this, 2));
            this.settleAnimator.addListener(new AnimatorListenerAdapter() {
                {
                    RichSlideshowBlock.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    RichSlideshowBlock.this.currentPage = i112;
                    RichSlideshowBlock.this.pageOffset = 0.0f;
                    View view = RichSlideshowBlock.this.view;
                    if (view != null) {
                        view.invalidate();
                    }
                }
            });
            this.settleAnimator.start();
        }

        @Override
        public void getBlockAccessibilityElementBounds(int i9, Rect rect) {
            Rect rect2 = this.padding;
            int i10 = rect2.left;
            int i11 = ((int) this.currY) + rect2.top;
            rect.set(i10, i11, this.slideWidth + i10, this.slideHeight + i11);
        }

        @Override
        public int getBlockAccessibilityElementCount() {
            return !this.cells.isEmpty() ? 1 : 0;
        }

        @Override
        public CharSequence getBlockAccessibilityElementText(int i9) {
            if (this.cells.isEmpty()) {
                return null;
            }
            int max = Math.max(0, Math.min(this.currentPage, this.cells.size() - 1));
            return TextUtils.concat(this.cells.get(max).getAccessibilityText(), ", ", LocaleController.formatString(R.string.Of, Integer.valueOf(max + 1), Integer.valueOf(this.cells.size())));
        }

        public int getCurrentPage() {
            return this.currentPage;
        }

        @Override
        public int getHeight() {
            return this.slideHeight + this.dotsHeight;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.maxWidth + rect.right;
        }

        @Override
        public boolean isHorizontallyDragging() {
            if (!this.dragging) {
                ValueAnimator valueAnimator = this.settleAnimator;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override
        public void onAttachedToWindow() {
            ArrayList<MediaCell> arrayList = this.cells;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                MediaCell mediaCell = arrayList.get(i9);
                i9++;
                mediaCell.attach(this.view);
            }
        }

        @Override
        public boolean onBlockAccessibilityElementClick(int i9, View view) {
            if (this.cells.isEmpty()) {
                return false;
            }
            return this.cells.get(Math.max(0, Math.min(this.currentPage, this.cells.size() - 1))).onAccessibilityClick(view);
        }

        @Override
        public void onDetachedFromWindow() {
            int i9 = 0;
            requestDisallowParentIntercept(false);
            this.dragging = false;
            this.verticalDragging = false;
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
            ArrayList<MediaCell> arrayList = this.cells;
            int size = arrayList.size();
            while (i9 < size) {
                MediaCell mediaCell = arrayList.get(i9);
                i9++;
                mediaCell.detach();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i9;
            int i10;
            float f10;
            float f11;
            float f12;
            int i11;
            int i12;
            int i13;
            int i14;
            int dp;
            int i15;
            int dp2;
            float dp3;
            int i16;
            float f13;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            MediaCell mediaCell;
            int i25;
            if (!this.cells.isEmpty()) {
                if (mediaBgPaint == null) {
                    Paint paint = new Paint(1);
                    mediaBgPaint = paint;
                    paint.setColor(251658240);
                }
                boolean isInQuote = isInQuote();
                int dp4 = AndroidUtilities.dp(2.0f);
                if (isInQuote) {
                    i9 = 0;
                } else {
                    i9 = this.root.padLeft - dp4;
                }
                if (isInQuote) {
                    i10 = 0;
                } else {
                    i10 = this.root.padRight - dp4;
                }
                int i26 = this.slideWidth + i9 + i10;
                canvas.save();
                if (isInQuote) {
                    int dp5 = AndroidUtilities.dp(8.0f);
                    this.clipPath.rewind();
                    float f14 = dp5;
                    this.clipPath.addRoundRect(0.0f, 0.0f, this.slideWidth, this.slideHeight, f14, f14, Path.Direction.CW);
                    canvas.clipPath(this.clipPath);
                    i11 = dp5;
                    i12 = i11;
                    i13 = i12;
                    i14 = i13;
                    f10 = 2.0f;
                    f11 = 3.0f;
                    f12 = 8.0f;
                } else if (this.first) {
                    int i27 = SharedConfig.bubbleRadius;
                    if (i27 > 2) {
                        dp = AndroidUtilities.dp(i27 - 2);
                    } else {
                        dp = AndroidUtilities.dp(i27);
                    }
                    int min = Math.min(AndroidUtilities.dp(3.0f), dp);
                    if ((this.root.isOut() || !this.root.isPinnedTop()) && !this.root.hasNameOffset()) {
                        i15 = dp;
                    } else {
                        i15 = min;
                    }
                    if ((this.root.isOut() && this.root.isPinnedTop()) || this.root.hasNameOffset()) {
                        dp = min;
                    }
                    float f15 = i15;
                    float f16 = dp;
                    f10 = 2.0f;
                    float f17 = min;
                    f11 = 3.0f;
                    this.clipPath.rewind();
                    f12 = 8.0f;
                    this.clipPath.addRoundRect(-i9, 0.0f, this.slideWidth + i10, this.slideHeight, new float[]{f15, f15, f16, f16, f17, f17, f17, f17}, Path.Direction.CW);
                    canvas.clipPath(this.clipPath);
                    i12 = dp;
                    i13 = min;
                    i14 = i13;
                    i11 = i15;
                } else {
                    f10 = 2.0f;
                    f11 = 3.0f;
                    f12 = 8.0f;
                    canvas.clipRect(-i9, 0, this.root.getMinWidth() + i10, this.slideHeight);
                    i11 = 0;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                }
                int i28 = this.currentPage;
                float f18 = 0.0f;
                if ((i28 == 0 && this.pageOffset < 0.0f) || (i28 == this.cells.size() - 1 && this.pageOffset > 0.0f)) {
                    RichMessageLayout richMessageLayout = this.root;
                    if (richMessageLayout.isOut()) {
                        i25 = org.telegram.ui.ActionBar.f6.f22988cb;
                    } else {
                        i25 = org.telegram.ui.ActionBar.f6.Wc;
                    }
                    canvas.drawColor(org.telegram.ui.ActionBar.f6.l1(0.2f, richMessageLayout.getThemedColor(i25)));
                }
                float f19 = i26;
                float f20 = (-this.pageOffset) * f19;
                int i29 = this.currentPage - 1;
                for (int i30 = 1; i29 <= this.currentPage + i30; i30 = 1) {
                    if (i29 < 0 || i29 >= this.cells.size()) {
                        i16 = i29;
                        f13 = f19;
                    } else {
                        MediaCell mediaCell2 = this.cells.get(i29);
                        canvas.save();
                        canvas.translate(((i29 - this.currentPage) * i26) + f20, f18);
                        ImageReceiver imageReceiver = mediaCell2.imageReceiver;
                        if (i29 == 0) {
                            i17 = i11;
                        } else {
                            i17 = 0;
                        }
                        if (i29 == this.cells.size() - i30) {
                            i18 = i12;
                        } else {
                            i18 = 0;
                        }
                        if (i29 == this.cells.size() - 1) {
                            i19 = i13;
                        } else {
                            i19 = 0;
                        }
                        if (i29 == 0) {
                            i20 = i14;
                        } else {
                            i20 = 0;
                        }
                        imageReceiver.setRoundRadius(i17, i18, i19, i20);
                        ImageReceiver imageReceiver2 = mediaCell2.blurImageReceiver;
                        if (i29 == 0) {
                            i21 = i11;
                        } else {
                            i21 = 0;
                        }
                        if (i29 == this.cells.size() - 1) {
                            i22 = i12;
                        } else {
                            i22 = 0;
                        }
                        if (i29 == this.cells.size() - 1) {
                            i23 = i13;
                        } else {
                            i23 = 0;
                        }
                        if (i29 == 0) {
                            i24 = i14;
                        } else {
                            i24 = 0;
                        }
                        imageReceiver2.setRoundRadius(i21, i22, i23, i24);
                        float f21 = -i9;
                        mediaCell2.imageReceiver.setImageCoords(f21, 0.0f, f19, this.slideHeight);
                        if (mediaCell2.imageReceiver.hasBitmapImage() && mediaCell2.imageReceiver.getCurrentAlpha() == 1.0f) {
                            i16 = i29;
                            f13 = f19;
                            mediaCell = mediaCell2;
                        } else {
                            i16 = i29;
                            mediaCell = mediaCell2;
                            f13 = f19;
                            canvas.drawRect(f21, 0.0f, i26 + i10, this.slideHeight, mediaBgPaint);
                        }
                        mediaCell.draw(canvas);
                        canvas.restore();
                    }
                    i29 = i16 + 1;
                    f19 = f13;
                    f18 = 0.0f;
                }
                canvas.restore();
                int size = this.cells.size();
                if (size > 1) {
                    if (slideDotPaint == null) {
                        Paint paint2 = new Paint(1);
                        slideDotPaint = paint2;
                        paint2.setColor(-1);
                        slideDotPaint.setShadowLayer(AndroidUtilities.dpf2(f11), 0.0f, AndroidUtilities.dpf2(1.0f), Integer.MIN_VALUE);
                    }
                    float dp6 = AndroidUtilities.dp(5.0f) + (this.slideHeight - AndroidUtilities.dp(23.0f));
                    int dp7 = AndroidUtilities.dp(4.0f) + l0.D(6.0f, size - 1, AndroidUtilities.dp(7.0f) * size);
                    float f22 = this.currentPage + this.pageOffset;
                    if (dp7 < i26) {
                        dp3 = (i26 - dp7) / f10;
                    } else {
                        int dp8 = AndroidUtilities.dp(13.0f);
                        dp3 = AndroidUtilities.dp(4.0f) - (Utilities.clamp(f22 - (((i26 - AndroidUtilities.dp(f12)) / 2) / dp8), Math.max(0, (size - (dp2 * 2)) - 1), 0.0f) * dp8);
                    }
                    canvas.save();
                    canvas.clipRect(0, this.slideHeight - AndroidUtilities.dp(23.0f), i26, this.slideHeight);
                    for (int i31 = 0; i31 < size; i31++) {
                        float max = Math.max(0.0f, 1.0f - Math.abs(i31 - f22));
                        slideDotPaint.setAlpha((int) ((max * 95.0f) + 160.0f));
                        canvas.drawCircle(AndroidUtilities.dp(4.0f) + dp3 + (AndroidUtilities.dp(13.0f) * i31), dp6, (AndroidUtilities.dp(1.0f) * max) + AndroidUtilities.dp(f10), slideDotPaint);
                    }
                    canvas.restore();
                }
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean onTouchEvent;
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
                    int i9 = this.currentPage;
                    if (i9 >= 0 && i9 < this.cells.size()) {
                        this.cells.get(this.currentPage).onTouchEvent(motionEvent, this.view);
                    }
                } else {
                    float f10 = 0.0f;
                    if (actionMasked == 2) {
                        if (!this.verticalDragging) {
                            VelocityTracker velocityTracker3 = this.velocityTracker;
                            if (velocityTracker3 != null) {
                                velocityTracker3.addMovement(motionEvent);
                            }
                            float x10 = motionEvent.getX() - this.downX;
                            float y10 = motionEvent.getY() - this.downY;
                            if (!this.dragging && Math.abs(y10) > this.touchSlop && Math.abs(y10) > Math.abs(x10)) {
                                this.verticalDragging = true;
                                int i10 = this.currentPage;
                                if (i10 >= 0 && i10 < this.cells.size()) {
                                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                    obtain.setAction(3);
                                    this.cells.get(this.currentPage).onTouchEvent(obtain, this.view);
                                    obtain.recycle();
                                }
                                requestDisallowParentIntercept(false);
                            } else {
                                if (!this.dragging && Math.abs(x10) > this.touchSlop && Math.abs(x10) > Math.abs(y10)) {
                                    this.dragging = true;
                                    int i11 = this.currentPage;
                                    if (i11 >= 0 && i11 < this.cells.size()) {
                                        MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                                        obtain2.setAction(3);
                                        this.cells.get(this.currentPage).onTouchEvent(obtain2, this.view);
                                        obtain2.recycle();
                                    }
                                }
                                if (this.dragging) {
                                    float f11 = (-x10) / this.slideWidth;
                                    int i12 = this.currentPage;
                                    if (i12 == 0 && f11 < 0.0f) {
                                        f11 *= 0.3f;
                                    }
                                    if (i12 == this.cells.size() - 1 && f11 > 0.0f) {
                                        f11 *= 0.3f;
                                    }
                                    this.pageOffset = f11;
                                    View view2 = this.view;
                                    if (view2 != null) {
                                        view2.invalidate();
                                    }
                                } else {
                                    int i13 = this.currentPage;
                                    if (i13 >= 0 && i13 < this.cells.size()) {
                                        onTouchEvent = this.cells.get(this.currentPage).onTouchEvent(motionEvent, this.view);
                                        Rect rect2 = this.padding;
                                        motionEvent.offsetLocation(rect2.left, rect2.top);
                                        return onTouchEvent;
                                    }
                                    Rect rect3 = this.padding;
                                    motionEvent.offsetLocation(rect3.left, rect3.top);
                                    return false;
                                }
                            }
                        }
                    } else {
                        if (actionMasked == 1 || actionMasked == 3) {
                            boolean z10 = this.verticalDragging;
                            this.verticalDragging = false;
                            if (!z10 && actionMasked == 1 && (velocityTracker = this.velocityTracker) != null) {
                                velocityTracker.addMovement(motionEvent);
                                this.velocityTracker.computeCurrentVelocity(1000, this.maxFlingVelocity);
                                float xVelocity = this.velocityTracker.getXVelocity();
                                float yVelocity = this.velocityTracker.getYVelocity();
                                if (Math.abs(xVelocity) >= this.minFlingVelocity && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                    f10 = xVelocity;
                                }
                            }
                            VelocityTracker velocityTracker4 = this.velocityTracker;
                            if (velocityTracker4 != null) {
                                velocityTracker4.recycle();
                                this.velocityTracker = null;
                            }
                            requestDisallowParentIntercept(false);
                            if (!z10) {
                                if (this.dragging) {
                                    this.dragging = false;
                                    settle(f10);
                                } else {
                                    int i14 = this.currentPage;
                                    if (i14 >= 0 && i14 < this.cells.size()) {
                                        onTouchEvent = this.cells.get(this.currentPage).onTouchEvent(motionEvent, this.view);
                                        Rect rect22 = this.padding;
                                        motionEvent.offsetLocation(rect22.left, rect22.top);
                                        return onTouchEvent;
                                    }
                                }
                            }
                        }
                        Rect rect32 = this.padding;
                        motionEvent.offsetLocation(rect32.left, rect32.top);
                        return false;
                    }
                }
                return true;
            } finally {
                Rect rect4 = this.padding;
                motionEvent.offsetLocation(rect4.left, rect4.top);
            }
        }

        public void setCurrentPage(int i9) {
            int max = Math.max(0, Math.min(i9, this.cells.size() - 1));
            ValueAnimator valueAnimator = this.settleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.settleAnimator = null;
            }
            if (this.currentPage != max || this.pageOffset != 0.0f) {
                this.currentPage = max;
                this.pageOffset = 0.0f;
                this.dragging = false;
                this.verticalDragging = false;
                View view = this.view;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
    }

    public static class RichTableBlock extends RichBlock implements qy0 {
        private static final int VERTICAL_PADDING_DP = 10;
        private final ArrayList<CellBlock> cellBlocks;
        private float cellDx;
        private float cellDy;
        private final ArrayList<Text> cellTexts;
        private int contentHeight;
        private final int contentMeasuredWidth;
        private int downScrollX;
        private float downX;
        private float downY;
        private boolean dragging;
        private final Runnable flingTick;
        private Paint halfLinePaint;
        private Paint headerPaint;
        private final int intrinsicContentWidth;
        private final int intrinsicTableWidth;
        private Paint linePaint;
        private int maxFlingVelocity;
        private final int maxScrollX;
        private int minFlingVelocity;
        public final TL_iv.pageBlockTable pageBlock;
        private Text pressedCellText;
        private int resolvedTableWidth;
        private int scrollX;
        private OverScroller scroller;
        private Paint stripPaint;
        public final ry0 tableLayout;
        private boolean textHandlingTouch;
        private final org.telegram.ui.Cells.y9[] textsArr;
        private final Text title;
        private final int titleHeight;
        private int touchSlop;
        private VelocityTracker velocityTracker;
        private final int viewportWidth;

        public static final class CellBlock implements cj0 {
            final ky0 child;

            public CellBlock(ky0 ky0Var) {
                this.child = ky0Var;
            }

            @Override
            public Layout getLayout() {
                jy0 jy0Var = this.child.f30265b;
                if (jy0Var == null) {
                    return null;
                }
                return jy0Var.getLayout();
            }

            @Override
            public View getParentView() {
                return null;
            }
        }

        public RichTableBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, TL_iv.pageBlockTable pageblocktable) {
            super(richMessageLayout, rect, i9);
            float f10;
            int i10;
            int i11;
            this.cellTexts = new ArrayList<>();
            this.cellBlocks = new ArrayList<>();
            this.flingTick = new Runnable() {
                {
                    RichTableBlock.this = this;
                }

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
                            if (!RichTableBlock.this.scroller.isFinished()) {
                                RichTableBlock.this.view.postOnAnimation(this);
                            }
                        }
                    }
                }
            };
            Rect rect2 = this.padding;
            rect2.top = AndroidUtilities.dp(10.0f) + rect2.top;
            this.pageBlock = pageblocktable;
            this.viewportWidth = this.maxWidth;
            ry0 ry0Var = new ry0(ApplicationLoader.applicationContext, this, null);
            this.tableLayout = ry0Var;
            ry0Var.setOrientation(0);
            ry0Var.setRowOrderPreserved(true);
            ry0Var.setDrawLines(pageblocktable.bordered);
            ry0Var.setStriped(pageblocktable.striped);
            ry0Var.setRtl(richMessageLayout.isRtl());
            ry0Var.setFillWidth(false);
            if (pageblocktable.compact) {
                int dp = AndroidUtilities.dp(5.0f);
                int dp2 = AndroidUtilities.dp(5.0f);
                int dp3 = AndroidUtilities.dp(5.0f);
                if (ry0Var.v != dp || ry0Var.f32316r != dp2 || ry0Var.f32317s != dp3) {
                    ry0Var.v = dp;
                    ry0Var.f32316r = dp2;
                    ry0Var.f32317s = dp3;
                    ry0Var.requestLayout();
                }
            }
            if (pageblocktable.compact) {
                f10 = 18.0f;
            } else {
                f10 = 36.0f;
            }
            ry0Var.setMinimumCellHeight(AndroidUtilities.dp(f10));
            if (!pageblocktable.rows.isEmpty()) {
                TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(0);
                i10 = 0;
                for (int i12 = 0; i12 < pagetablerow.cells.size(); i12++) {
                    int i13 = pagetablerow.cells.get(i12).colspan;
                    if (i13 == 0) {
                        i13 = 1;
                    }
                    i10 += i13;
                }
            } else {
                i10 = 0;
            }
            for (int i14 = 0; i14 < pageblocktable.rows.size(); i14++) {
                TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i14);
                int i15 = 0;
                for (int i16 = 0; i16 < pagetablerow2.cells.size(); i16++) {
                    TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i16);
                    int i17 = pagetablecell.colspan;
                    i17 = i17 == 0 ? 1 : i17;
                    int i18 = pagetablecell.rowspan;
                    i18 = i18 == 0 ? 1 : i18;
                    if (pagetablecell.text != null) {
                        this.tableLayout.b(pagetablecell, i15, i14, i17);
                    } else {
                        this.tableLayout.a(i15, i14, i17, i18);
                    }
                    i15 += i17;
                }
            }
            this.tableLayout.setColumnCount(i10);
            this.tableLayout.measure(View.MeasureSpec.makeMeasureSpec(this.maxWidth, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = this.tableLayout.getMeasuredWidth();
            this.contentMeasuredWidth = measuredWidth;
            this.intrinsicContentWidth = measuredWidth;
            this.contentHeight = this.tableLayout.getMeasuredHeight();
            this.maxScrollX = Math.max(0, measuredWidth - this.viewportWidth);
            TL_iv.RichText richText = pageblocktable.title;
            if (richText != null && !(richText instanceof TL_iv.textEmpty) && !TextUtils.isEmpty(RichMessageLayout.getString(richText))) {
                Text text = new Text(richMessageLayout, richMessageLayout.formatText(pageblocktable.title, RichMessageLayout.setBlockFlags(0, 15)), this.viewportWidth);
                this.title = text;
                text.setDrawAtOrigin(true);
                this.titleHeight = AndroidUtilities.dp(9.0f) + text.getHeight();
            } else {
                this.title = null;
                this.titleHeight = 0;
            }
            Text text2 = this.title;
            if (text2 != null) {
                i11 = text2.getMinWidth();
            } else {
                i11 = 0;
            }
            int max = Math.max(0, Math.min(this.viewportWidth, Math.max(measuredWidth, i11)));
            this.intrinsicTableWidth = max;
            this.resolvedTableWidth = max;
            for (int i19 = 0; i19 < this.tableLayout.getChildCount(); i19++) {
                ky0 d = this.tableLayout.d(i19);
                jy0 jy0Var = d.f30265b;
                if (jy0Var instanceof Text) {
                    this.cellTexts.add((Text) jy0Var);
                    this.cellBlocks.add(new CellBlock(d));
                }
            }
            ArrayList arrayList = new ArrayList();
            Text text3 = this.title;
            if (text3 != null) {
                arrayList.add(text3);
            }
            arrayList.addAll(this.cellTexts);
            this.textsArr = (org.telegram.ui.Cells.y9[]) arrayList.toArray(new org.telegram.ui.Cells.y9[0]);
        }

        private void drawCellsWithTyping(Canvas canvas, ej0 ej0Var, float f10) {
            CellBlock cellBlock;
            int i9;
            float f11;
            RichMessageLayout richMessageLayout = this.root;
            int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            int saveLayerAlpha = canvas.saveLayerAlpha(-richMessageLayout.padLeft, 0.0f, (minWidth - rect.left) - rect.right, this.contentHeight, (int) (f10 * 255.0f), 31);
            canvas.save();
            canvas.translate(-this.scrollX, 0.0f);
            int childCount = this.tableLayout.getChildCount();
            int i10 = 0;
            int i11 = 0;
            while (i11 < childCount) {
                ky0 d = this.tableLayout.d(i11);
                if (i10 < this.cellBlocks.size() && this.cellBlocks.get(i10).child == d) {
                    cellBlock = this.cellBlocks.get(i10);
                    i10++;
                } else {
                    cellBlock = null;
                }
                int i12 = i10;
                if (cellBlock == null) {
                    d.a(canvas, this.view, true);
                } else if (!ej0Var.j(cellBlock)) {
                    d.a(canvas, this.view, false);
                } else if (ej0Var.g(cellBlock)) {
                    d.a(canvas, this.view, false);
                    if (d.f30265b instanceof Text) {
                        canvas.save();
                        canvas.translate(d.b(), d.c());
                        Text text = (Text) d.f30265b;
                        if (ej0Var.g(cellBlock)) {
                            i9 = ej0Var.f37973e;
                        } else {
                            i9 = -1;
                        }
                        if (ej0Var.g(cellBlock)) {
                            f11 = ej0Var.f37974f;
                        } else {
                            f11 = 0.0f;
                        }
                        text.drawFade(canvas, i9, f11);
                        canvas.restore();
                    }
                } else {
                    float c10 = ej0Var.c(cellBlock);
                    if (c10 >= 1.0f) {
                        d.a(canvas, this.view, true);
                    } else if (c10 > 0.0f && d.f30265b != null) {
                        d.a(canvas, this.view, false);
                        canvas.save();
                        canvas.translate(d.b(), d.c());
                        int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.f30272k, d.f30273l, (int) (c10 * 255.0f), 31);
                        d.f30265b.draw(canvas, this.view);
                        canvas.restoreToCount(saveLayerAlpha2);
                        canvas.restore();
                    } else {
                        d.a(canvas, this.view, false);
                    }
                }
                i11++;
                i10 = i12;
            }
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            int i13 = -this.root.padLeft;
            rectF.set(i13, 0.0f, AndroidUtilities.dp(12.0f) + i13, this.contentHeight);
            this.root.clip.b(canvas, rectF, 0, 1.0f);
            int minWidth2 = this.root.getMinWidth() + this.root.padRight;
            Rect rect2 = this.padding;
            int i14 = (minWidth2 - rect2.left) - rect2.right;
            rectF.set(i14 - AndroidUtilities.dp(12.0f), 0.0f, i14, this.contentHeight);
            this.root.clip.b(canvas, rectF, 2, 1.0f);
            canvas.restoreToCount(saveLayerAlpha);
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

        private void ensurePaints() {
            int i9;
            int i10;
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
            if (richMessageLayout.isOut()) {
                i9 = org.telegram.ui.ActionBar.f6.uk;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.tk;
            }
            int themedColor = richMessageLayout.getThemedColor(i9);
            this.linePaint.setColor(themedColor);
            this.halfLinePaint.setColor(themedColor);
            Paint paint3 = this.headerPaint;
            RichMessageLayout richMessageLayout2 = this.root;
            if (richMessageLayout2.isOut()) {
                i10 = org.telegram.ui.ActionBar.f6.sk;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.rk;
            }
            paint3.setColor(richMessageLayout2.getThemedColor(i10));
            this.stripPaint.setColor(167772160);
        }

        private void ensureTouchConfig() {
            View view;
            if (this.touchSlop == 0 && (view = this.view) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.touchSlop = viewConfiguration.getScaledTouchSlop();
                this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.scroller == null && this.view != null) {
                this.scroller = new OverScroller(this.view.getContext());
            }
        }

        private ky0 findCellChildAt(float f10, float f11) {
            float f12 = f10 + this.scrollX;
            float f13 = f11 - this.titleHeight;
            int childCount = this.tableLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                ky0 d = this.tableLayout.d(i9);
                if (d.f30265b instanceof Text) {
                    int i10 = d.f30277p;
                    if (f12 >= i10 && f12 < i10 + d.f30272k) {
                        int i11 = d.f30278q;
                        if (f13 >= i11 && f13 < i11 + d.f30273l) {
                            return d;
                        }
                    }
                }
            }
            return null;
        }

        public void resolveWidth(int i9) {
            int i10 = this.intrinsicTableWidth;
            int i11 = this.viewportWidth;
            Rect rect = this.padding;
            int max = Math.max(i10, Math.min(i11, Math.max(0, (i9 - rect.left) - rect.right)));
            this.resolvedTableWidth = max;
            this.tableLayout.setRenderWidth(max);
            this.contentHeight = this.tableLayout.getRenderHeight();
        }

        private int titleDrawX() {
            Text text = this.title;
            if (text == null) {
                return 0;
            }
            int i9 = this.resolvedTableWidth;
            int i10 = text.right;
            int i11 = text.left;
            return Math.round(((i9 - (i10 - i11)) / 2.0f) - i11);
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            StaticLayout staticLayout;
            RichBlock.appendText(spannableStringBuilder, this.title, null);
            for (int i9 = 0; i9 < this.cellTexts.size(); i9++) {
                Text text = this.cellTexts.get(i9);
                if (text != null && (staticLayout = text.layout) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append(", ");
                    }
                    spannableStringBuilder.append(text.layout.getText());
                }
            }
        }

        @Override
        public void collectAnimatorBlocks(List<cj0> list) {
            if (this.cellBlocks.isEmpty()) {
                super.collectAnimatorBlocks(list);
            } else {
                list.addAll(this.cellBlocks);
            }
        }

        @Override
        public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
            boolean z10;
            Text text;
            org.telegram.ui.Components.p5 p5Var;
            int i9;
            org.telegram.ui.Components.p5 p5Var2;
            canvas.save();
            Rect rect = this.padding;
            canvas.translate(rect.left, rect.top);
            Text text2 = this.title;
            boolean z11 = true;
            if (text2 != null && (p5Var2 = text2.animatedEmojiStack) != null && !p5Var2.f31544a.isEmpty()) {
                canvas.save();
                canvas.translate(titleDrawX(), 0.0f);
                Text text3 = this.title;
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, text3.layout, text3.animatedEmojiStack, 0.0f, text3.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.translate(0.0f, this.titleHeight);
            int size = this.cellTexts.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    org.telegram.ui.Components.p5 p5Var3 = this.cellTexts.get(i10).animatedEmojiStack;
                    if (p5Var3 != null && !p5Var3.f31544a.isEmpty()) {
                        RichMessageLayout richMessageLayout = this.root;
                        int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
                        Rect rect2 = this.padding;
                        int saveLayerAlpha = canvas.saveLayerAlpha(-richMessageLayout.padLeft, 0.0f, (minWidth - rect2.left) - rect2.right, this.contentHeight, 255, 31);
                        canvas.save();
                        canvas.translate(-this.scrollX, 0.0f);
                        int childCount = this.tableLayout.getChildCount();
                        int i11 = 0;
                        while (i11 < childCount) {
                            ky0 d = this.tableLayout.d(i11);
                            jy0 jy0Var = d.f30265b;
                            if (!(jy0Var instanceof Text) || (p5Var = (text = (Text) jy0Var).animatedEmojiStack) == null || p5Var.f31544a.isEmpty()) {
                                i9 = i11;
                            } else {
                                canvas.save();
                                canvas.translate(d.b(), d.c());
                                i9 = i11;
                                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, text.layout, text.animatedEmojiStack, 0.0f, text.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                                canvas.restore();
                            }
                            i11 = i9 + 1;
                        }
                        canvas.restore();
                        RectF rectF = AndroidUtilities.rectTmp;
                        int i12 = this.root.padLeft;
                        rectF.set(-i12, 0.0f, AndroidUtilities.dp(12.0f) + (-i12), this.contentHeight);
                        this.root.clip.b(canvas, rectF, 0, 1.0f);
                        int minWidth2 = this.root.getMinWidth() + this.root.padRight;
                        Rect rect3 = this.padding;
                        int i13 = (minWidth2 - rect3.left) - rect3.right;
                        rectF.set(i13 - AndroidUtilities.dp(12.0f), 0.0f, i13, this.contentHeight);
                        this.root.clip.b(canvas, rectF, 2, 1.0f);
                        canvas.restoreToCount(saveLayerAlpha);
                    } else {
                        i10++;
                    }
                } else {
                    z11 = z10;
                    break;
                }
            }
            canvas.restore();
            return z11;
        }

        @Override
        public void drawWithTyping(Canvas canvas) {
            ej0 ej0Var = this.typingAnimator;
            if (ej0Var != null && ej0Var.h && !this.cellBlocks.isEmpty() && ej0Var.d(this.cellBlocks.get(0)) >= 0) {
                float c10 = ej0Var.c(this.cellBlocks.get(0));
                if (c10 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.padding;
                canvas.translate(rect.left, rect.top);
                drawTitle(canvas);
                canvas.translate(0.0f, this.titleHeight);
                drawCellsWithTyping(canvas, ej0Var, c10);
                canvas.restore();
                return;
            }
            draw(canvas);
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i9, FoundLink foundLink) {
            Text text = this.title;
            if (text != null && text.fillFoundLink(characterStyle, foundLink)) {
                foundLink.f19655x = (this.padding.left + titleDrawX()) - this.title.drawLeft();
                foundLink.f19656y = i9 + this.padding.top;
                return true;
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                ky0 d = this.tableLayout.d(i10);
                jy0 jy0Var = d.f30265b;
                if (jy0Var instanceof Text) {
                    Text text2 = (Text) jy0Var;
                    if (text2.fillFoundLink(characterStyle, foundLink)) {
                        foundLink.f19655x = ((d.b() + this.padding.left) - this.scrollX) - text2.drawLeft();
                        foundLink.f19656y = d.c() + i9 + this.padding.top + this.titleHeight;
                        return true;
                    }
                }
            }
            return false;
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
        public int getHeight() {
            return AndroidUtilities.dp(10.0f) + this.padding.top + this.titleHeight + this.contentHeight + this.padding.bottom;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public Paint getLinePaint() {
            ensurePaints();
            return this.linePaint;
        }

        @Override
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.intrinsicTableWidth + rect.right;
        }

        @Override
        public Paint getStripPaint() {
            ensurePaints();
            return this.stripPaint;
        }

        @Override
        public org.telegram.ui.Cells.y9[] getText() {
            return this.textsArr;
        }

        @Override
        public boolean isHorizontallyDragging() {
            if (!this.dragging) {
                OverScroller overScroller = this.scroller;
                if (overScroller == null || overScroller.isFinished()) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override
        public void onAttachedToWindow() {
            Text text = this.title;
            if (text != null) {
                text.attach(this.view);
            }
            ArrayList<Text> arrayList = this.cellTexts;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Text text2 = arrayList.get(i9);
                i9++;
                text2.attach(this.view);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            Text text = this.title;
            if (text != null) {
                text.detach(this.view);
            }
            ArrayList<Text> arrayList = this.cellTexts;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Text text2 = arrayList.get(i9);
                i9++;
                text2.detach(this.view);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i9;
            drawTitle(canvas);
            canvas.save();
            canvas.translate(0.0f, this.titleHeight);
            RichMessageLayout richMessageLayout = this.root;
            float f10 = -richMessageLayout.padLeft;
            int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            canvas.saveLayerAlpha(f10, 0.0f, (minWidth - rect.left) - rect.right, this.contentHeight, 255, 31);
            canvas.save();
            canvas.translate(-this.scrollX, 0.0f);
            int childCount = this.tableLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.tableLayout.d(i10).a(canvas, this.view, true);
            }
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            int i11 = this.root.padLeft;
            rectF.set(-i11, 0.0f, AndroidUtilities.dp(12.0f) + (-i11), this.contentHeight);
            this.root.clip.b(canvas, rectF, 0, 1.0f);
            int minWidth2 = this.root.getMinWidth() + this.root.padRight;
            Rect rect2 = this.padding;
            rectF.set(i9 - AndroidUtilities.dp(12.0f), 0.0f, (minWidth2 - rect2.left) - rect2.right, this.contentHeight);
            this.root.clip.b(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            VelocityTracker velocityTracker;
            ky0 findCellChildAt;
            int actionMasked = motionEvent.getActionMasked();
            int i9 = 0;
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
                    float titleDrawX = titleDrawX();
                    motionEvent.offsetLocation(-titleDrawX, 0.0f);
                    boolean onTouchEvent = this.title.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(titleDrawX, 0.0f);
                    if (onTouchEvent) {
                        this.pressedCellText = this.title;
                        this.cellDx = titleDrawX;
                        this.cellDy = 0.0f;
                        this.textHandlingTouch = true;
                    }
                }
                if (!this.textHandlingTouch && (findCellChildAt = findCellChildAt(motionEvent.getX(), motionEvent.getY())) != null) {
                    this.pressedCellText = (Text) findCellChildAt.f30265b;
                    this.cellDx = findCellChildAt.b() - this.scrollX;
                    this.cellDy = findCellChildAt.c() + this.titleHeight;
                    this.pressedCellText.setSoleButtonHitBounds(findCellChildAt.f30277p - findCellChildAt.b(), findCellChildAt.f30278q - findCellChildAt.c(), (findCellChildAt.f30277p + findCellChildAt.f30272k) - findCellChildAt.b(), (findCellChildAt.f30278q + findCellChildAt.f30273l) - findCellChildAt.c());
                    motionEvent.offsetLocation(-this.cellDx, -this.cellDy);
                    this.textHandlingTouch = this.pressedCellText.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(this.cellDx, this.cellDy);
                }
                if (this.textHandlingTouch || this.maxScrollX > 0) {
                    return true;
                }
                return false;
            } else if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.downX;
                if (!this.dragging && this.maxScrollX > 0 && Math.abs(x10) > this.touchSlop) {
                    this.dragging = true;
                    requestDisallowParentIntercept(true);
                    if (this.textHandlingTouch && this.pressedCellText != null) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.setAction(3);
                        obtain.offsetLocation(-this.cellDx, -this.cellDy);
                        this.pressedCellText.onTouchEvent(obtain);
                        obtain.recycle();
                        this.textHandlingTouch = false;
                    }
                }
                if (this.dragging) {
                    int i10 = (int) (this.downScrollX - x10);
                    if (i10 >= 0) {
                        i9 = i10;
                    }
                    int i11 = this.maxScrollX;
                    if (i9 > i11) {
                        i9 = i11;
                    }
                    if (i9 != this.scrollX) {
                        this.scrollX = i9;
                        placeTexts(this.layoutX, this.layoutY, this.layoutRow);
                        View view = this.view;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                    return true;
                }
                return this.textHandlingTouch;
            } else if (actionMasked != 1 && actionMasked != 3) {
                return false;
            } else {
                boolean z10 = this.dragging;
                this.dragging = false;
                if (z10) {
                    requestDisallowParentIntercept(false);
                    if (actionMasked == 1 && (velocityTracker = this.velocityTracker) != null && this.scroller != null && this.view != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.velocityTracker.computeCurrentVelocity(1000, this.maxFlingVelocity);
                        float f10 = -this.velocityTracker.getXVelocity();
                        if (Math.abs(f10) > this.minFlingVelocity) {
                            this.scroller.fling(this.scrollX, 0, (int) f10, 0, 0, this.maxScrollX, 0, 0);
                            this.view.postOnAnimation(this.flingTick);
                        }
                    }
                }
                if (!z10 && this.textHandlingTouch && this.pressedCellText != null) {
                    motionEvent.offsetLocation(-this.cellDx, -this.cellDy);
                    this.pressedCellText.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(this.cellDx, this.cellDy);
                }
                boolean z11 = this.textHandlingTouch;
                this.textHandlingTouch = false;
                this.pressedCellText = null;
                VelocityTracker velocityTracker4 = this.velocityTracker;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.velocityTracker = null;
                }
                if (z10 || z11) {
                    return true;
                }
                return false;
            }
        }

        @Override
        public void placeTexts(int i9, int i10, int i11) {
            this.layoutX = i9;
            this.layoutY = i10;
            this.layoutRow = i11;
            Text text = this.title;
            if (text != null) {
                text.setX((titleDrawX() + i9) - this.title.drawLeft());
                this.title.setY(i10);
                this.title.setRow(i11);
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                ky0 d = this.tableLayout.d(i12);
                jy0 jy0Var = d.f30265b;
                if (jy0Var instanceof Text) {
                    Text text2 = (Text) jy0Var;
                    text2.setX(((d.b() + i9) - this.scrollX) - text2.drawLeft());
                    text2.setY(d.c() + this.titleHeight + i10);
                    text2.setRow(i11);
                }
            }
        }

        @Override
        public Text createTextLayout(TL_iv.pageTableCell pagetablecell, int i9) {
            Layout.Alignment alignment;
            if (pagetablecell == null) {
                return null;
            }
            CharSequence formatText = this.root.formatText(pagetablecell.text, RichMessageLayout.setBlockFlags(0, 14));
            if (pagetablecell.align_right) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (pagetablecell.align_center) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Text text = new Text(this.root, formatText, i9, alignment);
            text.setDrawAtOrigin(true);
            return text;
        }

        @Override
        public void onLayoutChild(jy0 jy0Var, int i9, int i10) {
        }
    }

    public static class RichTextBlock extends RichBlock {
        private final boolean centered;
        protected int contentPaddingBottom;
        protected int contentPaddingTop;
        public int quoteAuthorStart;
        public final Text text;
        public final Text[] texts;

        public RichTextBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, CharSequence charSequence) {
            this(richMessageLayout, rect, i9, charSequence, Layout.Alignment.ALIGN_NORMAL);
        }

        private int rtlOffset() {
            int i9;
            int minWidth;
            if (this.centered) {
                int minWidth2 = this.root.getMinWidth();
                RichMessageLayout richMessageLayout = this.root;
                i9 = (((minWidth2 + richMessageLayout.padRight) - richMessageLayout.padLeft) - this.text.getMinWidth()) / 2;
                minWidth = this.padding.left;
            } else if (!this.root.isRtl()) {
                return 0;
            } else {
                int minWidth3 = (this.root.getMinWidth() + this.root.padRight) - AndroidUtilities.dp(14.0f);
                Rect rect = this.padding;
                i9 = (minWidth3 - rect.right) - rect.left;
                minWidth = this.text.getMinWidth();
            }
            return i9 - minWidth;
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.text, this.texts);
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i9, FoundLink foundLink) {
            if (this.text.fillFoundLink(characterStyle, foundLink)) {
                foundLink.f19655x = (this.padding.left + rtlOffset()) - this.text.left;
                foundLink.f19656y = i9 + this.padding.top + this.contentPaddingTop;
                return true;
            }
            return false;
        }

        @Override
        public boolean forcesTimeToNewLine() {
            return this.centered;
        }

        @Override
        public int getContentPaddingTop() {
            return this.contentPaddingTop;
        }

        @Override
        public int getHeight() {
            return this.text.getHeight() + this.padding.top + this.contentPaddingTop + this.contentPaddingBottom + this.padding.bottom;
        }

        @Override
        public int getLastLineWidth() {
            return this.text.getLastLineWidth() + this.padding.left + this.padding.right;
        }

        @Override
        public Layout getLayout() {
            return this.text.layout;
        }

        @Override
        public int getMinWidth() {
            return this.text.getMinWidth() + this.padding.left + this.padding.right;
        }

        @Override
        public org.telegram.ui.Cells.y9[] getText() {
            return this.texts;
        }

        @Override
        public void onAttachedToWindow() {
            this.text.attach(this.view);
        }

        @Override
        public void onDetachedFromWindow() {
            this.text.detach(this.view);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(0.0f, this.contentPaddingTop);
            int rtlOffset = rtlOffset();
            if (rtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + rtlOffset) - text.left);
                canvas.save();
                canvas.translate(rtlOffset, 0.0f);
                this.text.draw(canvas);
                canvas.restore();
            } else {
                this.text.draw(canvas);
            }
            canvas.restore();
        }

        @Override
        public void onDrawFaded(Canvas canvas, int i9, float f10) {
            canvas.save();
            canvas.translate(0.0f, this.contentPaddingTop);
            int rtlOffset = rtlOffset();
            if (rtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + rtlOffset) - text.left);
                canvas.save();
                canvas.translate(rtlOffset, 0.0f);
                this.text.drawFade(canvas, i9, f10);
                canvas.restore();
            } else {
                this.text.drawFade(canvas, i9, f10);
            }
            canvas.restore();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int rtlOffset = rtlOffset();
            motionEvent.offsetLocation(-rtlOffset, -this.contentPaddingTop);
            boolean onTouchEvent = this.text.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(rtlOffset, this.contentPaddingTop);
            return onTouchEvent;
        }

        @Override
        public void placeTexts(int i9, int i10, int i11) {
            super.placeTexts(i9, i10 + this.contentPaddingTop, i11);
            int rtlOffset = rtlOffset();
            if (rtlOffset != 0) {
                Text text = this.text;
                text.setX((i9 + rtlOffset) - text.left);
            }
        }

        public void setContentPadding(int i9, int i10) {
            this.contentPaddingTop = i9;
            this.contentPaddingBottom = i10;
            updateListMarkerY();
        }

        public RichTextBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, CharSequence charSequence, Layout.Alignment alignment) {
            super(richMessageLayout, rect, i9);
            this.quoteAuthorStart = -1;
            this.centered = alignment == Layout.Alignment.ALIGN_CENTER;
            Text text = new Text(richMessageLayout, charSequence, this.maxWidth, alignment);
            this.text = text;
            this.texts = r3;
            Text[] textArr = {text};
        }
    }

    public static class RichTextBlockQuote extends RichTextBlock {
        public final TL_iv.pageBlockBlockquote block;
        private org.telegram.ui.Components.pc bounce;
        private boolean capturedByParent;
        private s10 clip;
        public int collapsedHeightToDraw;
        public float collapsedProgress;
        private boolean currentCollapsed;
        private boolean pressed;
        private boolean prevCollapsed;
        public final Drawable quoteArrow;
        private int quoteArrowColor;

        public RichTextBlockQuote(RichMessageLayout richMessageLayout, Rect rect, int i9, TL_iv.pageBlockBlockquote pageblockblockquote, CharSequence charSequence) {
            super(richMessageLayout, rect, i9, charSequence);
            this.block = pageblockblockquote;
            this.quoteArrow = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.arrow_more).mutate();
            boolean z10 = pageblockblockquote.collapsed;
            this.currentCollapsed = z10;
            this.prevCollapsed = z10;
        }

        private void ensureBounce() {
            View view;
            if (this.bounce == null && (view = this.root.view) != null) {
                this.bounce = new org.telegram.ui.Components.pc(view);
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
            org.telegram.ui.Cells.t1 cell = this.root.getCell();
            org.telegram.ui.Cells.k1 delegate = this.root.getDelegate();
            if (cell != null && delegate != null) {
                delegate.F0(cell);
            }
        }

        @Override
        public float getBackgroundScale() {
            org.telegram.ui.Components.pc pcVar = this.bounce;
            if (pcVar != null) {
                return pcVar.a(0.01f);
            }
            return 1.0f;
        }

        public int getCollapsedHeight() {
            return (int) Math.min((this.text.layout.getPaint().getTextSize() * 1.4f * 3.0f) + this.padding.top + this.contentPaddingTop + this.padding.bottom, super.getHeight());
        }

        @Override
        public int getHeight() {
            if (this.currentCollapsed) {
                return getCollapsedHeight();
            }
            return super.getHeight();
        }

        @Override
        public void onDraw(Canvas canvas) {
            float f10;
            boolean z10;
            Canvas canvas2;
            org.telegram.ui.Components.pc pcVar = this.bounce;
            if (pcVar != null) {
                f10 = pcVar.a(0.01f);
            } else {
                f10 = 1.0f;
            }
            int i9 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i9 != 0) {
                canvas.save();
                canvas.scale(f10, f10, this.maxWidth / 2.0f, getHeight() / 2.0f);
            }
            if (this.collapsedProgress > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = (this.collapsedHeightToDraw - this.padding.bottom) - this.contentPaddingBottom;
            canvas.save();
            canvas.clipRect(0, 0, this.maxWidth, i10);
            if (z10) {
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.maxWidth, i10, null);
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas2);
            if (z10) {
                if (this.clip == null) {
                    this.clip = new s10();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, i10 - AndroidUtilities.dp(24.0f), this.maxWidth, i10 + 1);
                this.clip.b(canvas2, rectF, 3, this.collapsedProgress);
                canvas2.restore();
            }
            canvas2.restore();
            if (this.root.quoteLine.h() != this.quoteArrowColor) {
                Drawable drawable = this.quoteArrow;
                int h = this.root.quoteLine.h();
                this.quoteArrowColor = h;
                drawable.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN));
            }
            ff.s.e(this.quoteArrow, this.root.getMinWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f) + ((i10 - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(2.0f)), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 17);
            canvas2.save();
            canvas2.rotate(AndroidUtilities.lerp(180, 0, this.collapsedProgress), this.quoteArrow.getBounds().exactCenterX(), this.quoteArrow.getBounds().exactCenterY());
            this.quoteArrow.draw(canvas2);
            canvas2.restore();
            if (i9 != 0) {
                canvas2.restore();
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.capturedByParent) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.capturedByParent = false;
                }
                return super.onTouchEvent(motionEvent);
            } else if (actionMasked == 0) {
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                this.capturedByParent = onTouchEvent;
                if (onTouchEvent) {
                    return true;
                }
                this.pressed = true;
                ensureBounce();
                org.telegram.ui.Components.pc pcVar = this.bounce;
                if (pcVar != null) {
                    pcVar.c(true);
                }
                return true;
            } else if (actionMasked == 1) {
                if (!this.pressed) {
                    return false;
                }
                this.pressed = false;
                org.telegram.ui.Components.pc pcVar2 = this.bounce;
                if (pcVar2 != null) {
                    pcVar2.c(false);
                }
                View view = this.root.view;
                if (view != null) {
                    view.playSoundEffect(0);
                }
                toggle();
                return true;
            } else {
                if (actionMasked == 3) {
                    this.pressed = false;
                    org.telegram.ui.Components.pc pcVar3 = this.bounce;
                    if (pcVar3 != null) {
                        pcVar3.c(false);
                    }
                }
                return this.pressed;
            }
        }

        @Override
        public void snapshot() {
            super.snapshot();
            this.prevCollapsed = this.currentCollapsed;
        }
    }

    public static class RichTextWithAuthorBlock extends RichBlock {
        public final Text author;
        private final boolean centered;
        public final Text text;
        private final Text[] texts;

        public RichTextWithAuthorBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, CharSequence charSequence, CharSequence charSequence2, Layout.Alignment alignment) {
            super(richMessageLayout, rect, i9);
            boolean z10;
            Text text;
            if (alignment == Layout.Alignment.ALIGN_CENTER) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.centered = z10;
            Text text2 = new Text(richMessageLayout, charSequence, this.maxWidth, alignment);
            this.text = text2;
            if (!TextUtils.isEmpty(charSequence2)) {
                text = new Text(richMessageLayout, charSequence2, this.maxWidth, alignment);
            } else {
                text = null;
            }
            this.author = text;
            this.texts = text == null ? new Text[]{text2} : new Text[]{text2, text};
        }

        private int gap() {
            if (this.author != null) {
                return AndroidUtilities.dp(2.0f);
            }
            return 0;
        }

        private int offset(Text text) {
            int i9;
            int minWidth;
            if (this.centered) {
                int minWidth2 = this.root.getMinWidth();
                RichMessageLayout richMessageLayout = this.root;
                i9 = (((minWidth2 + richMessageLayout.padRight) - richMessageLayout.padLeft) - text.getMinWidth()) / 2;
                minWidth = this.padding.left;
            } else if (!this.root.isRtl()) {
                return 0;
            } else {
                int minWidth3 = (this.root.getMinWidth() + this.root.padRight) - AndroidUtilities.dp(14.0f);
                Rect rect = this.padding;
                i9 = (minWidth3 - rect.right) - rect.left;
                minWidth = text.getMinWidth();
            }
            return i9 - minWidth;
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, null, this.texts);
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i9, FoundLink foundLink) {
            if (this.text.fillFoundLink(characterStyle, foundLink)) {
                foundLink.f19655x = (this.padding.left + offset(this.text)) - this.text.left;
                foundLink.f19656y = i9 + this.padding.top;
                return true;
            }
            Text text = this.author;
            if (text != null && text.fillFoundLink(characterStyle, foundLink)) {
                foundLink.f19655x = (this.padding.left + offset(this.author)) - this.author.left;
                foundLink.f19656y = this.text.getHeight() + i9 + this.padding.top + gap();
                return true;
            }
            return false;
        }

        @Override
        public boolean forcesTimeToNewLine() {
            return this.centered;
        }

        @Override
        public int getHeight() {
            int i9;
            int height = this.text.getHeight() + this.padding.top + gap();
            Text text = this.author;
            if (text != null) {
                i9 = text.getHeight();
            } else {
                i9 = 0;
            }
            return height + i9 + this.padding.bottom;
        }

        @Override
        public int getLastLineWidth() {
            Text text = this.author;
            if (text == null) {
                text = this.text;
            }
            return text.getLastLineWidth() + this.padding.left + this.padding.right;
        }

        @Override
        public Layout getLayout() {
            return this.text.layout;
        }

        @Override
        public int getMinWidth() {
            return getTextWidth() + this.padding.left + this.padding.right;
        }

        @Override
        public org.telegram.ui.Cells.y9[] getText() {
            return this.texts;
        }

        public int getTextWidth() {
            int i9;
            int minWidth = this.text.getMinWidth();
            Text text = this.author;
            if (text != null) {
                i9 = text.getMinWidth();
            } else {
                i9 = 0;
            }
            return Math.max(minWidth, i9);
        }

        @Override
        public void onAttachedToWindow() {
            this.text.attach(this.view);
            Text text = this.author;
            if (text != null) {
                text.attach(this.view);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            this.text.detach(this.view);
            Text text = this.author;
            if (text != null) {
                text.detach(this.view);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
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
        public boolean onTouchEvent(MotionEvent motionEvent) {
            Text text;
            int i9;
            int height = this.text.getHeight();
            float y10 = motionEvent.getY();
            int i10 = 0;
            if (y10 >= 0.0f && y10 < height) {
                text = this.text;
                i9 = offset(text);
            } else if (this.author == null || y10 < gap() + height) {
                return false;
            } else {
                Text text2 = this.author;
                int offset = offset(text2);
                i10 = gap() + height;
                text = text2;
                i9 = offset;
            }
            motionEvent.offsetLocation(-i9, -i10);
            boolean onTouchEvent = text.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(i9, i10);
            return onTouchEvent;
        }

        @Override
        public void placeTexts(int i9, int i10, int i11) {
            Text text = this.text;
            text.setX((offset(text) + i9) - this.text.left);
            this.text.setY(i10);
            this.text.setRow(i11);
            Text text2 = this.author;
            if (text2 != null) {
                text2.setX((i9 + offset(text2)) - this.author.left);
                this.author.setY(this.text.getHeight() + i10 + gap());
                this.author.setRow(i11);
            }
        }
    }

    public static class RichThinkingBlock extends RichBlock {
        public LinearGradient gradient;
        public int gradientColor;
        public final Matrix matrix;
        public final Paint paint;
        public final Text text;
        public final Text[] texts;

        public RichThinkingBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, CharSequence charSequence) {
            super(richMessageLayout, rect, i9);
            this.matrix = new Matrix();
            this.paint = new Paint(1);
            Text text = new Text(richMessageLayout, charSequence, this.maxWidth);
            this.text = text;
            this.texts = r2;
            Text[] textArr = {text};
        }

        public void lambda$onDrawFaded$0(View view, Canvas canvas) {
            Text text = this.text;
            dh.l.g(view, false, -1, 0, text.spoilersPatchedTextLayout, 0, text.layout, text.spoilers, canvas, false);
            Text text2 = this.text;
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, text2.layout, text2.animatedEmojiStack, 0.0f, text2.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
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
            int i9;
            RichMessageLayout richMessageLayout = this.root;
            if (richMessageLayout.isOut()) {
                i9 = org.telegram.ui.ActionBar.f6.fc;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.ec;
            }
            int themedColor = richMessageLayout.getThemedColor(i9);
            if (this.gradient != null && this.gradientColor == themedColor) {
                return;
            }
            this.gradientColor = themedColor;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.maxWidth, 0.0f, new int[]{org.telegram.ui.ActionBar.f6.l1(0.7f, themedColor), org.telegram.ui.ActionBar.f6.l1(0.25f, themedColor), org.telegram.ui.ActionBar.f6.l1(0.7f, themedColor)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
            this.gradient = linearGradient;
            this.paint.setShader(linearGradient);
            this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.text, this.texts);
        }

        @Override
        public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
            return false;
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i9, FoundLink foundLink) {
            if (this.text.fillFoundLink(characterStyle, foundLink)) {
                foundLink.f19655x = (this.padding.left + rtlOffset()) - this.text.left;
                foundLink.f19656y = i9 + this.padding.top;
                return true;
            }
            return false;
        }

        @Override
        public int getHeight() {
            return this.text.getHeight() + this.padding.top + this.padding.bottom;
        }

        @Override
        public int getLastLineWidth() {
            return this.text.getLastLineWidth() + this.padding.left + this.padding.right;
        }

        @Override
        public Layout getLayout() {
            return this.text.layout;
        }

        @Override
        public int getMinWidth() {
            return this.text.getMinWidth() + this.padding.left + this.padding.right;
        }

        @Override
        public org.telegram.ui.Cells.y9[] getText() {
            return this.texts;
        }

        @Override
        public void onAttachedToWindow() {
            this.text.attach(this.view);
        }

        @Override
        public void onDetachedFromWindow() {
            this.text.detach(this.view);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.root.getMinWidth(), getHeight(), 255, 31);
            int rtlOffset = rtlOffset();
            if (rtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + rtlOffset) - text.left);
                canvas.save();
                canvas.translate(rtlOffset, 0.0f);
            }
            this.text.draw(canvas);
            if (this.root.isOverlayActive()) {
                canvas.save();
                canvas.translate(-this.text.left, 0.0f);
                Text text2 = this.text;
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, text2.layout, text2.animatedEmojiStack, 0.0f, text2.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
                canvas.restore();
            }
            if (rtlOffset != 0) {
                canvas.restore();
            }
            updateGradient();
            this.matrix.reset();
            this.matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.maxWidth, 0.0f);
            this.gradient.setLocalMatrix(this.matrix);
            canvas.drawRect(0.0f, 0.0f, this.root.getMinWidth(), getHeight(), this.paint);
            canvas.restore();
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override
        public void onDrawFaded(Canvas canvas, int i9, float f10) {
            int i10;
            canvas.saveLayerAlpha(0.0f, 0.0f, this.root.getMinWidth(), getHeight(), 255, 31);
            int rtlOffset = rtlOffset();
            if (rtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + rtlOffset) - text.left);
            }
            canvas.save();
            canvas.translate(rtlOffset - this.text.left, 0.0f);
            int color = this.root.textPaint.getColor();
            this.root.textPaint.setColor(-1);
            RichMessageLayout richMessageLayout = this.root;
            TextPaint textPaint = richMessageLayout.textPaint;
            if (richMessageLayout.isOut()) {
                i10 = org.telegram.ui.ActionBar.f6.f23079hc;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.f23061gc;
            }
            textPaint.linkColor = richMessageLayout.getThemedColor(i10);
            ej0.b(canvas, this.text.layout, i9, f10, new c(4, this, this.view));
            canvas.restore();
            this.root.textPaint.setColor(color);
            updateGradient();
            this.matrix.reset();
            this.matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.maxWidth, 0.0f);
            this.gradient.setLocalMatrix(this.matrix);
            canvas.drawRect(0.0f, 0.0f, this.root.getMinWidth(), getHeight(), this.paint);
            canvas.restore();
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int rtlOffset = rtlOffset();
            if (rtlOffset == 0) {
                return this.text.onTouchEvent(motionEvent);
            }
            motionEvent.offsetLocation(-rtlOffset, 0.0f);
            boolean onTouchEvent = this.text.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(rtlOffset, 0.0f);
            return onTouchEvent;
        }

        @Override
        public void placeTexts(int i9, int i10, int i11) {
            super.placeTexts(i9, i10, i11);
            int rtlOffset = rtlOffset();
            if (rtlOffset != 0) {
                Text text = this.text;
                text.setX((i9 + rtlOffset) - text.left);
            }
        }
    }

    public static class RichVideoBlock extends RichMediaBlock {
        public final TL_iv.pageBlockVideo block;
        public final TLRPC.Document document;
        public final boolean isVideo;
        public final TLRPC.PhotoSize previewThumb;
        public final boolean realVideo;
        public final TLRPC.PhotoSize strippedThumb;

        public RichVideoBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, TL_iv.pageBlockVideo pageblockvideo, boolean z10) {
            super(richMessageLayout, rect, i9, z10);
            boolean z11;
            int i10;
            int i11;
            this.block = pageblockvideo;
            TLRPC.Document document = richMessageLayout.getDocument(pageblockvideo.video_id);
            this.document = document;
            boolean isVideoDocument = MessageObject.isVideoDocument(document);
            this.realVideo = isVideoDocument;
            int i12 = 0;
            if (!isVideoDocument && !MessageObject.isGifDocument(document)) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.isVideo = z11;
            if (document != null) {
                this.previewThumb = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
                this.strippedThumb = FileLoader.getStrippedPhotoSize(document.thumbs);
            } else {
                this.previewThumb = null;
                this.strippedThumb = null;
            }
            if (document != null) {
                while (true) {
                    if (i12 < this.document.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = this.document.attributes.get(i12);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                            i11 = documentAttribute.f22387w;
                            i10 = documentAttribute.h;
                            break;
                        }
                        i12++;
                    } else {
                        i10 = 100;
                        i11 = 100;
                        break;
                    }
                }
                if (i11 <= 0 || i10 <= 0) {
                    TLRPC.PhotoSize photoSize = this.previewThumb;
                    if (photoSize != null) {
                        i11 = photoSize.f22405w;
                    } else {
                        i11 = 100;
                    }
                    i10 = photoSize != null ? photoSize.h : 100;
                }
                r4 = i11;
            } else {
                i10 = 100;
            }
            int i13 = this.maxWidth;
            int max = (int) ((i13 / Math.max(1, r4)) * i10);
            Point point = AndroidUtilities.displaySize;
            int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (max > max2) {
                i13 = (int) ((max2 / Math.max(1, i10)) * r4);
                max = max2;
            }
            this.imgWidth = i13;
            this.imgHeight = max;
            finishLayout();
        }

        @Override
        public boolean allowAutoplay() {
            if (this.realVideo) {
                return SharedConfig.isAutoplayVideo();
            }
            return SharedConfig.isAutoplayGifs();
        }

        @Override
        public void applyImage(boolean z10) {
            ImageLocation imageLocation;
            TLRPC.Document document = this.document;
            if (document == null) {
                return;
            }
            TLRPC.PhotoSize photoSize = this.strippedThumb;
            ImageLocation imageLocation2 = null;
            if (photoSize != null) {
                imageLocation = ImageLocation.getForDocument(photoSize, document);
            } else {
                imageLocation = null;
            }
            TLRPC.PhotoSize photoSize2 = this.previewThumb;
            if (photoSize2 != null) {
                imageLocation2 = ImageLocation.getForDocument(photoSize2, this.document);
            }
            ImageLocation imageLocation3 = imageLocation2;
            if (z10 && this.isVideo && (allowAutoplay() || this.mediaForced)) {
                this.imageReceiver.setAllowStartAnimation(true);
                this.imageReceiver.setAutoRepeat(1);
                this.imageReceiver.setImage(ImageLocation.getForDocument(this.document), "g", imageLocation3, null, imageLocation, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
                return;
            }
            this.imageReceiver.setImage(null, null, imageLocation3, null, imageLocation, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
        }

        @Override
        public boolean computeAutoDownload() {
            if (this.document == null) {
                return false;
            }
            if (!this.isVideo) {
                return true;
            }
            if (!allowAutoplay() || !DownloadController.getInstance(this.root.currentAccount).canDownloadMedia(4, this.document.size)) {
                return false;
            }
            return true;
        }

        @Override
        public boolean fileExists() {
            if (this.document == null) {
                return true;
            }
            File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document);
            File pathToAttach2 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, true);
            if ((pathToAttach != null && pathToAttach.exists()) || (pathToAttach2 != null && pathToAttach2.exists())) {
                return true;
            }
            return false;
        }

        @Override
        public TL_iv.PageBlock getBlock() {
            return this.block;
        }

        @Override
        public String getFileName() {
            return FileLoader.getAttachFileName(this.document);
        }

        @Override
        public boolean isAnimatedContent() {
            return this.isVideo;
        }

        @Override
        public boolean isRealVideo() {
            return this.realVideo;
        }

        @Override
        public boolean isSpoiler() {
            TL_iv.pageBlockVideo pageblockvideo = this.block;
            if (pageblockvideo != null && pageblockvideo.spoiler) {
                return true;
            }
            return false;
        }
    }

    public static final class SpoilerReveal {
        private ValueAnimator animator;
        private float cx;
        private float cy;
        private float maxR;
        private final Path path = new Path();
        float progress;
        boolean revealed;

        public void lambda$start$0(View view, ValueAnimator valueAnimator) {
            this.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (view != null) {
                view.invalidate();
            }
        }

        public void clipOut(Canvas canvas) {
            if (this.progress > 0.0f) {
                this.path.rewind();
                this.path.addCircle(this.cx, this.cy, this.maxR * this.progress, Path.Direction.CW);
                canvas.clipPath(this.path, Region.Op.DIFFERENCE);
            }
        }

        public boolean fullyRevealed() {
            if (this.revealed && this.progress >= 1.0f) {
                return true;
            }
            return false;
        }

        public boolean isRevealing() {
            if (!this.revealed && this.animator == null) {
                return false;
            }
            return true;
        }

        public void start(final View view, float f10, float f11, float f12, float f13) {
            if (!this.revealed && this.animator == null) {
                this.cx = f10;
                this.cy = f11;
                this.maxR = (float) Math.sqrt((f13 * f13) + (f12 * f12));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.animator = ofFloat;
                ofFloat.setDuration(Utilities.clamp(this.maxR * 0.3f, 550.0f, 250.0f));
                this.animator.setInterpolator(gr.f28847j);
                this.animator.addUpdateListener(new oh(0, this, view));
                this.animator.addListener(new AnimatorListenerAdapter() {
                    {
                        SpoilerReveal.this = this;
                    }

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
        }
    }

    public static class StyleSpan extends MetricAffectingSpan {
        public final int flags;
        private boolean fullSizeTableEmoji;
        public final boolean metricsOnly;
        public final RichMessageLayout root;

        public StyleSpan(RichMessageLayout richMessageLayout, int i9) {
            this(richMessageLayout, i9, false);
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
                textPaint.baselineShift = AndroidUtilities.dp(2.0f) + textPaint.baselineShift;
            }
        }

        public int getTextColor() {
            int i9;
            int i10;
            int i11;
            int i12 = this.flags & 15;
            if (i12 == 11) {
                RichMessageLayout richMessageLayout = this.root;
                if (richMessageLayout.isOut()) {
                    i11 = org.telegram.ui.ActionBar.f6.f22988cb;
                } else {
                    i11 = org.telegram.ui.ActionBar.f6.Wc;
                }
                return richMessageLayout.getThemedColor(i11);
            } else if (i12 == 10) {
                RichMessageLayout richMessageLayout2 = this.root;
                if (richMessageLayout2.isOut()) {
                    i10 = org.telegram.ui.ActionBar.f6.fc;
                } else {
                    i10 = org.telegram.ui.ActionBar.f6.ec;
                }
                return org.telegram.ui.ActionBar.f6.l1(0.5f, richMessageLayout2.getThemedColor(i10));
            } else {
                RichMessageLayout richMessageLayout3 = this.root;
                if (richMessageLayout3.isOut()) {
                    i9 = org.telegram.ui.ActionBar.f6.fc;
                } else {
                    i9 = org.telegram.ui.ActionBar.f6.ec;
                }
                return richMessageLayout3.getThemedColor(i9);
            }
        }

        public int getTextSize() {
            int i9 = this.flags & 15;
            int i10 = SharedConfig.fontSize;
            if (i9 == 14 && this.fullSizeTableEmoji) {
                return AndroidUtilities.dp(i10);
            }
            switch (i9) {
                case 1:
                    return AndroidUtilities.dp(i10 + 3);
                case 2:
                    return AndroidUtilities.dp(i10 + 2);
                case 3:
                    return AndroidUtilities.dp(i10 + 1);
                case 4:
                    return AndroidUtilities.dp(i10);
                case 5:
                    return AndroidUtilities.dp(i10 - 1);
                case 6:
                    return AndroidUtilities.dp(i10 - 2);
                case 7:
                case 13:
                    return AndroidUtilities.dp(i10 - 2);
                case 8:
                    return AndroidUtilities.dp(i10 - 1);
                case 9:
                case 11:
                case 12:
                    return AndroidUtilities.dp(i10 - 2);
                case 10:
                    return AndroidUtilities.dp(i10 - 2);
                case 14:
                    return AndroidUtilities.dp(Math.max(8, i10 - 2));
                case 15:
                    return AndroidUtilities.dp(i10 - 2);
                default:
                    return AndroidUtilities.dp(i10);
            }
        }

        public Typeface getTypeface() {
            int i9 = this.flags;
            int i10 = i9 & 15;
            if (i10 == 8) {
                return Typeface.MONOSPACE;
            }
            if (i10 == 11) {
                return AndroidUtilities.bold();
            }
            boolean z10 = true;
            if (i10 >= 1 && i10 <= 6) {
                if (TLObject.hasFlag(i9, 32)) {
                    return AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
                }
                return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            } else if (TLObject.hasFlag(i9, 256)) {
                return Typeface.MONOSPACE;
            } else {
                boolean hasFlag = TLObject.hasFlag(this.flags, 16);
                if (!TLObject.hasFlag(this.flags, 32) && i10 != 12) {
                    z10 = false;
                }
                if (hasFlag && z10) {
                    return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
                }
                if (hasFlag) {
                    return AndroidUtilities.bold();
                }
                if (z10) {
                    return AndroidUtilities.getTypeface("fonts/ritalic.ttf");
                }
                return null;
            }
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            applyStyle(textPaint);
        }

        @Override
        public void updateMeasureState(TextPaint textPaint) {
            applyStyle(textPaint);
        }

        public StyleSpan(RichMessageLayout richMessageLayout, int i9, boolean z10) {
            this.root = richMessageLayout;
            this.flags = i9;
            this.metricsOnly = z10;
        }
    }

    public static class Text implements org.telegram.ui.Cells.y9, jy0 {
        private static final int EMOJI_LINE_HEIGHT_MIN_PERCENT = 70;
        private static Paint markPaint;
        public org.telegram.ui.Components.p5 animatedEmojiStack;
        public int blockX;
        public int blockY;
        public boolean doNotInvalidateEmojiInParent;
        private boolean drawAtOrigin;
        private int emojiOnlyCount;
        public int lastLineRight;
        public final StaticLayout layout;
        public int left;
        public i80 linkCollector;
        private boolean longPressFired;
        private Runnable longPressRunnable;
        public f80 markPath;
        private RichButtonSpan pressedButtonSpan;
        private org.telegram.ui.Components.t5 pressedEmoji;
        private CharacterStyle pressedLink;
        private m80 pressedLinkDrawable;
        private int pressedLinkEnd;
        private int pressedLinkStart;
        private dh.l pressedSpoiler;
        public int right;
        public final RichMessageLayout root;
        public int row;
        private final RectF soleButtonHitBounds;
        public final List<dh.l> spoilers;
        public final AtomicReference<Layout> spoilersPatchedTextLayout;
        public final Stack<dh.l> spoilersPool;
        private p80 translationLoadingDrawable;
        private f80 translationLoadingPath;
        public View view;
        public int f19661x;
        public int f19662y;

        public static class EmojiLineMetrics {
            private int contentCount;
            private int emojiCount;
            private int emojiSide;

            private EmojiLineMetrics() {
            }

            public static int access$1408(EmojiLineMetrics emojiLineMetrics) {
                int i9 = emojiLineMetrics.emojiCount;
                emojiLineMetrics.emojiCount = i9 + 1;
                return i9;
            }

            public static int access$1412(EmojiLineMetrics emojiLineMetrics, int i9) {
                int i10 = emojiLineMetrics.emojiCount + i9;
                emojiLineMetrics.emojiCount = i10;
                return i10;
            }

            public static int access$1508(EmojiLineMetrics emojiLineMetrics) {
                int i9 = emojiLineMetrics.contentCount;
                emojiLineMetrics.contentCount = i9 + 1;
                return i9;
            }

            public static int access$1512(EmojiLineMetrics emojiLineMetrics, int i9) {
                int i10 = emojiLineMetrics.contentCount + i9;
                emojiLineMetrics.contentCount = i10;
                return i10;
            }

            public boolean allowsEmojiLineHeight() {
                int i9 = this.contentCount;
                if (i9 > 0 && this.emojiCount * 100 >= i9 * 70) {
                    return true;
                }
                return false;
            }
        }

        public Text(RichMessageLayout richMessageLayout, CharSequence charSequence, int i9) {
            this(richMessageLayout, charSequence, i9, Layout.Alignment.ALIGN_NORMAL);
        }

        private static void allowEmojiLineHeight(Spanned spanned, int i9, int i10, int i11) {
            org.telegram.ui.Components.t5[] t5VarArr;
            Emoji.EmojiSpan[] emojiSpanArr;
            RichButtonSpan[] richButtonSpanArr;
            for (org.telegram.ui.Components.t5 t5Var : (org.telegram.ui.Components.t5[]) spanned.getSpans(i9, i10, org.telegram.ui.Components.t5.class)) {
                int spanStart = spanned.getSpanStart(t5Var);
                if (spanStart >= i9 && spanStart < i10) {
                    t5Var.setMinimumLineHeight(i11);
                }
            }
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spanned.getSpans(i9, i10, Emoji.EmojiSpan.class)) {
                int spanStart2 = spanned.getSpanStart(emojiSpan);
                if (spanStart2 >= i9 && spanStart2 < i10) {
                    emojiSpan.setMinimumLineHeight(i11);
                }
            }
            for (RichButtonSpan richButtonSpan : (RichButtonSpan[]) spanned.getSpans(i9, i10, RichButtonSpan.class)) {
                int spanStart3 = spanned.getSpanStart(richButtonSpan);
                if (richButtonSpan.button.text.getEmojiOnlyCount() > 0 && spanStart3 >= i9 && spanStart3 < i10) {
                    richButtonSpan.minimumLineHeight = i11;
                }
            }
        }

        private boolean buttonContains(RichButtonSpan richButtonSpan, float f10, float f11) {
            if (!richButtonSpan.contains(f10, f11, AndroidUtilities.dp(8.0f))) {
                if (richButtonSpan != getSoleButtonSpan() || !this.soleButtonHitBounds.contains(f10, f11)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        private void cancelLongPress() {
            Runnable runnable = this.longPressRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.longPressRunnable = null;
            }
        }

        private static CharSequence configureEmojiLineHeights(CharSequence charSequence, TextPaint textPaint) {
            RichButtonSpan[] richButtonSpanArr;
            boolean z10;
            if (!(charSequence instanceof Spanned)) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            for (org.telegram.ui.Components.t5 t5Var : (org.telegram.ui.Components.t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.t5.class)) {
                t5Var.setPreserveFontMetrics(true);
            }
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.setPreserveFontMetrics(true);
            }
            for (RichButtonSpan richButtonSpan : (RichButtonSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), RichButtonSpan.class)) {
                if (richButtonSpan.getButton().text.getEmojiOnlyCount() > 0) {
                    richButtonSpan.preserveFontMetrics = true;
                }
            }
            int i9 = 0;
            while (i9 < spannableStringBuilder.length()) {
                int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '\n', i9);
                if (indexOf >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    indexOf = spannableStringBuilder.length();
                }
                EmojiLineMetrics measureEmojiLine = measureEmojiLine(spannableStringBuilder, i9, indexOf, textPaint);
                if (measureEmojiLine.allowsEmojiLineHeight() && measureEmojiLine.emojiSide > 0) {
                    allowEmojiLineHeight(spannableStringBuilder, i9, indexOf, measureEmojiLine.emojiSide);
                }
                if (!z10) {
                    break;
                }
                i9 = indexOf + 1;
            }
            return spannableStringBuilder;
        }

        private void dispatchLinkClick(CharacterStyle characterStyle, boolean z10) {
            CharacterStyle characterStyle2;
            View view;
            String url;
            if (characterStyle != null) {
                if (!z10 && (characterStyle instanceof URLSpan) && (url = ((URLSpan) characterStyle).getURL()) != null && url.startsWith("#") && this.root.handleAnchorClick(url)) {
                    View view2 = this.view;
                    if (view2 != null) {
                        view2.playSoundEffect(0);
                        return;
                    }
                    return;
                }
                if ((characterStyle instanceof StyleSpan) && TLObject.hasFlag(((StyleSpan) characterStyle).flags, 256)) {
                    characterStyle2 = new o41(this.layout.getText(), this.pressedLinkStart, this.pressedLinkEnd, this.root.isOut() ? (byte) 1 : (byte) 0, null);
                } else {
                    characterStyle2 = characterStyle;
                }
                org.telegram.ui.Cells.k1 delegate = this.root.getDelegate();
                org.telegram.ui.Cells.t1 cell = this.root.getCell();
                if (delegate != null && cell != null) {
                    View view3 = this.view;
                    if (view3 != null && !z10) {
                        view3.playSoundEffect(0);
                    }
                    delegate.R0(cell, characterStyle2, z10);
                } else if (!z10 && (view = this.view) != null && (characterStyle instanceof ClickableSpan)) {
                    view.playSoundEffect(0);
                    ((ClickableSpan) characterStyle).onClick(this.view);
                }
            }
        }

        private void drawTranslationLoading(Canvas canvas) {
            int i9;
            RichMessageLayout richMessageLayout = this.root;
            float f10 = richMessageLayout.translationLoadingValue;
            if (f10 <= 0.0f) {
                return;
            }
            boolean isTranslating = richMessageLayout.isTranslating();
            if (this.translationLoadingDrawable == null) {
                p80 p80Var = new p80();
                this.translationLoadingDrawable = p80Var;
                p80Var.C = true;
                f80 f80Var = new f80(0);
                this.translationLoadingPath = f80Var;
                f80Var.f30219c = true;
                p80 p80Var2 = this.translationLoadingDrawable;
                p80Var2.f31591x = f80Var;
                p80Var2.j(5.0f);
                this.translationLoadingDrawable.f31572b = -1L;
                this.translationLoadingPath.reset();
                this.translationLoadingPath.d(this.layout, 0, 0.0f);
                this.translationLoadingPath.f28333n = false;
                StaticLayout staticLayout = this.layout;
                staticLayout.getSelectionPath(0, staticLayout.getText().length(), this.translationLoadingPath);
                f80 f80Var2 = this.translationLoadingPath;
                f80Var2.f28333n = true;
                f80Var2.a();
                this.translationLoadingDrawable.k();
            }
            if (isTranslating && (this.translationLoadingDrawable.c() || this.translationLoadingDrawable.b())) {
                p80 p80Var3 = this.translationLoadingDrawable;
                p80Var3.f31572b = -1L;
                p80Var3.f31573c = -1L;
            } else if (!isTranslating && !this.translationLoadingDrawable.c() && !this.translationLoadingDrawable.b()) {
                this.translationLoadingDrawable.a();
            }
            RichMessageLayout richMessageLayout2 = this.root;
            if (richMessageLayout2.isOut()) {
                i9 = org.telegram.ui.ActionBar.f6.f23079hc;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.f23061gc;
            }
            int themedColor = richMessageLayout2.getThemedColor(i9);
            this.translationLoadingDrawable.f(org.telegram.ui.ActionBar.f6.l1(0.05f, themedColor), org.telegram.ui.ActionBar.f6.l1(0.15f, themedColor), org.telegram.ui.ActionBar.f6.l1(0.1f, themedColor), org.telegram.ui.ActionBar.f6.l1(0.3f, themedColor));
            this.translationLoadingDrawable.setAlpha((int) (f10 * 255.0f));
            this.translationLoadingDrawable.draw(canvas);
        }

        private RichButtonSpan[] getButtonSpans() {
            if (!(this.layout.getText() instanceof Spanned)) {
                return null;
            }
            Spanned spanned = (Spanned) this.layout.getText();
            return (RichButtonSpan[]) spanned.getSpans(0, spanned.length(), RichButtonSpan.class);
        }

        private RichButtonSpan getSoleButtonSpan() {
            if (!(this.layout.getText() instanceof Spanned)) {
                return null;
            }
            Spanned spanned = (Spanned) this.layout.getText();
            RichButtonSpan[] richButtonSpanArr = (RichButtonSpan[]) spanned.getSpans(0, spanned.length(), RichButtonSpan.class);
            if (richButtonSpanArr.length != 1) {
                return null;
            }
            int spanStart = spanned.getSpanStart(richButtonSpanArr[0]);
            int spanEnd = spanned.getSpanEnd(richButtonSpanArr[0]);
            for (int i9 = 0; i9 < spanned.length(); i9++) {
                if ((i9 < spanStart || i9 >= spanEnd) && !Character.isWhitespace(spanned.charAt(i9))) {
                    return null;
                }
            }
            return richButtonSpanArr[0];
        }

        public void lambda$drawFade$1(View view, int i9, Canvas canvas) {
            dh.l.g(view, false, i9, 0, this.spoilersPatchedTextLayout, 0, this.layout, this.spoilers, canvas, false);
            jv0.a(canvas, this.layout);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.layout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
        }

        public static int lambda$new$0(Spanned spanned, RichButtonSpan richButtonSpan, RichButtonSpan richButtonSpan2) {
            return spanned.getSpanStart(richButtonSpan2) - spanned.getSpanStart(richButtonSpan);
        }

        public void lambda$revealSpoilers$3(RichMessageLayout richMessageLayout, View view) {
            if (richMessageLayout != null) {
                MessageObject messageObject = richMessageLayout.messageObject;
                if (messageObject != null) {
                    messageObject.isSpoilersRevealed = true;
                }
                ArrayList<org.telegram.ui.Cells.y9> arrayList = richMessageLayout.textBlocks;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    org.telegram.ui.Cells.y9 y9Var = arrayList.get(i9);
                    i9++;
                    org.telegram.ui.Cells.y9 y9Var2 = y9Var;
                    if (y9Var2 instanceof Text) {
                        ((Text) y9Var2).spoilers.clear();
                    }
                }
            } else {
                this.spoilers.clear();
            }
            view.invalidate();
        }

        public void lambda$revealSpoilers$4(View view, RichMessageLayout richMessageLayout) {
            if (view == null) {
                return;
            }
            view.post(new qh(this, richMessageLayout, view));
        }

        public void lambda$scheduleLongPress$2() {
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
            } else if (this.pressedLink == null) {
            } else {
                this.longPressFired = true;
                View view2 = this.view;
                if (view2 != null) {
                    try {
                        view2.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                }
                dispatchLinkClick(this.pressedLink, true);
                i80 i80Var = this.linkCollector;
                if (i80Var != null) {
                    i80Var.d(true);
                }
                this.pressedLinkDrawable = null;
            }
        }

        private static EmojiLineMetrics measureEmojiLine(Spanned spanned, int i9, int i10, TextPaint textPaint) {
            int[] iArr;
            RichButtonSpan[] richButtonSpanArr;
            RichButtonSpan richButtonSpan;
            int i11;
            int i12;
            EmojiLineMetrics emojiLineMetrics = new EmojiLineMetrics();
            int i13 = i10 - i9;
            if (i13 > 0) {
                org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(i9, i10, org.telegram.ui.Components.t5.class);
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(i9, i10, Emoji.EmojiSpan.class);
                if (t5VarArr.length == 0 && emojiSpanArr.length == 0) {
                    iArr = null;
                } else {
                    iArr = new int[i13];
                }
                int length = t5VarArr.length;
                int i14 = 0;
                while (i14 < length) {
                    int i15 = i14;
                    org.telegram.ui.Components.t5 t5Var = t5VarArr[i15];
                    int spanStart = spanned.getSpanStart(t5Var);
                    int min = Math.min(i10, spanned.getSpanEnd(t5Var));
                    if (spanStart >= i9 && spanStart < i10 && min > spanStart) {
                        int i16 = spanStart - i9;
                        iArr[i16] = Math.max(iArr[i16], min);
                        i12 = i15;
                        emojiLineMetrics.emojiSide = Math.max(emojiLineMetrics.emojiSide, t5Var.getSize(textPaint, spanned, spanStart, min, null) + 1);
                    } else {
                        i12 = i15;
                    }
                    i14 = i12 + 1;
                }
                for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart2 = spanned.getSpanStart(emojiSpan);
                    int min2 = Math.min(i10, spanned.getSpanEnd(emojiSpan));
                    if (spanStart2 >= i9 && spanStart2 < i10 && min2 > spanStart2) {
                        int i17 = spanStart2 - i9;
                        iArr[i17] = Math.max(iArr[i17], min2);
                        emojiLineMetrics.emojiSide = Math.max(emojiLineMetrics.emojiSide, emojiSpan.getSize(textPaint, spanned, spanStart2, min2, null));
                    }
                }
                RichButtonSpan[] richButtonSpanArr2 = (RichButtonSpan[]) spanned.getSpans(i9, i10, RichButtonSpan.class);
                if (richButtonSpanArr2.length > 0) {
                    richButtonSpanArr = null;
                    for (RichButtonSpan richButtonSpan2 : richButtonSpanArr2) {
                        int spanStart3 = spanned.getSpanStart(richButtonSpan2);
                        if (richButtonSpan2.button.text.getEmojiOnlyCount() > 0 && spanStart3 >= i9 && spanStart3 < i10) {
                            if (richButtonSpanArr == null) {
                                richButtonSpanArr = new RichButtonSpan[i13];
                            }
                            richButtonSpanArr[spanStart3 - i9] = richButtonSpan2;
                        }
                    }
                } else {
                    richButtonSpanArr = null;
                }
                if (iArr != null || richButtonSpanArr != null) {
                    int i18 = i9;
                    while (i18 < i10) {
                        int i19 = i18 - i9;
                        if (richButtonSpanArr == null) {
                            richButtonSpan = null;
                        } else {
                            richButtonSpan = richButtonSpanArr[i19];
                        }
                        if (richButtonSpan != null && (richButtonSpan.button.text.layout.getText() instanceof Spanned)) {
                            Spanned spanned2 = (Spanned) richButtonSpan.button.text.layout.getText();
                            EmojiLineMetrics measureEmojiLine = measureEmojiLine(spanned2, 0, spanned2.length(), richButtonSpan.button.text.layout.getPaint());
                            EmojiLineMetrics.access$1412(emojiLineMetrics, measureEmojiLine.emojiCount);
                            EmojiLineMetrics.access$1512(emojiLineMetrics, Math.max(1, measureEmojiLine.contentCount));
                            emojiLineMetrics.emojiSide = Math.max(emojiLineMetrics.emojiSide, measureEmojiLine.emojiSide);
                            i18 = Math.min(i10, spanned.getSpanEnd(richButtonSpan));
                        } else {
                            if (iArr == null) {
                                i11 = 0;
                            } else {
                                i11 = iArr[i19];
                            }
                            if (i11 > i18) {
                                EmojiLineMetrics.access$1408(emojiLineMetrics);
                                EmojiLineMetrics.access$1508(emojiLineMetrics);
                                i18 = i11;
                            } else {
                                int codePointAt = Character.codePointAt(spanned, i18);
                                if (!Character.isWhitespace(codePointAt)) {
                                    EmojiLineMetrics.access$1508(emojiLineMetrics);
                                }
                                i18 += Character.charCount(codePointAt);
                            }
                        }
                    }
                }
            }
            return emojiLineMetrics;
        }

        private void revealSpoilers(int i9, int i10) {
            if (this.pressedSpoiler != null) {
                float width = this.layout.getWidth();
                float height = this.layout.getHeight();
                float sqrt = (float) Math.sqrt((height * height) + (width * width));
                View view = this.view;
                this.pressedSpoiler.f4627q = new qh(this, view, this.root);
                for (dh.l lVar : this.spoilers) {
                    lVar.j(i9, i10, sqrt, false);
                }
                if (view != null) {
                    view.playSoundEffect(0);
                }
            }
        }

        private void scheduleLongPress() {
            cancelLongPress();
            ng ngVar = new ng(this, 10);
            this.longPressRunnable = ngVar;
            AndroidUtilities.runOnUIThread(ngVar, ViewConfiguration.getLongPressTimeout());
        }

        public void setSoleButtonHitBounds(float f10, float f11, float f12, float f13) {
            this.soleButtonHitBounds.set(f10, f11, f12, f13);
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
            if (view2 != view || view2 == null) {
                return;
            }
            this.view = null;
            onDetachedFromWindow();
        }

        public void draw(Canvas canvas) {
            draw(canvas, this.view);
        }

        public void drawFade(Canvas canvas, int i9, float f10) {
            int i10;
            int i11;
            canvas.save();
            canvas.translate(-drawLeft(), 0.0f);
            RichMessageLayout richMessageLayout = this.root;
            if (richMessageLayout.isOut()) {
                i10 = org.telegram.ui.ActionBar.f6.fc;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.ec;
            }
            final int themedColor = richMessageLayout.getThemedColor(i10);
            this.root.textPaint.setColor(themedColor);
            RichMessageLayout richMessageLayout2 = this.root;
            TextPaint textPaint = richMessageLayout2.textPaint;
            if (richMessageLayout2.isOut()) {
                i11 = org.telegram.ui.ActionBar.f6.f23079hc;
            } else {
                i11 = org.telegram.ui.ActionBar.f6.f23061gc;
            }
            textPaint.linkColor = richMessageLayout2.getThemedColor(i11);
            final View view = this.view;
            ej0.b(canvas, this.layout, i9, f10, new dj0() {
                @Override
                public final void b(Canvas canvas2) {
                    RichMessageLayout.Text.this.lambda$drawFade$1(view, themedColor, canvas2);
                }
            });
            canvas.restore();
        }

        public int drawLeft() {
            if (this.drawAtOrigin) {
                return 0;
            }
            return this.left;
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

        public int getBaseline() {
            StaticLayout staticLayout = this.layout;
            if (staticLayout != null && staticLayout.getLineCount() > 0) {
                return this.layout.getLineBaseline(0);
            }
            return -1;
        }

        @Override
        public int getEmojiOnlyCount() {
            return this.emojiOnlyCount;
        }

        public int getHeight() {
            return this.layout.getHeight();
        }

        public int getLastLineWidth() {
            return Math.max(0, this.lastLineRight - this.left);
        }

        @Override
        public Layout getLayout() {
            return this.layout;
        }

        public int getMinWidth() {
            return Math.max(0, this.right - this.left);
        }

        @Override
        public CharSequence getPrefix() {
            return null;
        }

        @Override
        public int getRow() {
            return this.row;
        }

        @Override
        public Rect getSelectionBounds() {
            return null;
        }

        @Override
        public CharSequence getText() {
            if (getLayout() == null) {
                return null;
            }
            return getLayout().getText();
        }

        @Override
        public int getX() {
            return this.blockX + this.f19661x;
        }

        @Override
        public int getY() {
            return this.blockY + this.f19662y;
        }

        public boolean isAttached() {
            if (this.view != null) {
                return true;
            }
            return false;
        }

        public boolean isPressingLink() {
            if (this.pressedLink == null && this.pressedButtonSpan == null) {
                return false;
            }
            return true;
        }

        public Text offset(int i9, int i10) {
            this.f19661x += i9;
            this.f19662y += i10;
            return this;
        }

        public void onAttachedToWindow() {
            boolean z10;
            View view = this.view;
            if (this.root.invalidateAnimatedEmojiInParent && !this.doNotInvalidateEmojiInParent) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.animatedEmojiStack = org.telegram.ui.Components.t5.update(0, view, z10, this.animatedEmojiStack, this.layout);
            i80 i80Var = this.linkCollector;
            if (i80Var != null) {
                i80Var.f29375a = this.view;
            }
            RichButtonSpan[] buttonSpans = getButtonSpans();
            if (buttonSpans != null) {
                for (RichButtonSpan richButtonSpan : buttonSpans) {
                    richButtonSpan.attach(this.view);
                }
            }
        }

        public void onDetachedFromWindow() {
            org.telegram.ui.Components.t5.release(this.view, this.animatedEmojiStack);
            this.animatedEmojiStack = null;
            i80 i80Var = this.linkCollector;
            if (i80Var != null) {
                i80Var.f29375a = null;
            }
            RichButtonSpan[] buttonSpans = getButtonSpans();
            if (buttonSpans != null) {
                for (RichButtonSpan richButtonSpan : buttonSpans) {
                    richButtonSpan.detach(this.view);
                }
            }
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            StyleSpan styleSpan;
            boolean z10;
            int i9;
            StyleSpan styleSpan2;
            StyleSpan styleSpan3;
            int spanStart;
            int actionMasked = motionEvent.getActionMasked();
            int drawLeft = drawLeft() + ((int) motionEvent.getX());
            int y10 = (int) motionEvent.getY();
            if (actionMasked == 0) {
                this.pressedSpoiler = null;
                this.pressedLink = null;
                this.pressedEmoji = null;
                this.pressedButtonSpan = null;
                for (dh.l lVar : this.spoilers) {
                    if (lVar.getBounds().contains(drawLeft, y10)) {
                        this.pressedSpoiler = lVar;
                        return true;
                    }
                }
                RichButtonSpan[] buttonSpans = getButtonSpans();
                if (buttonSpans != null) {
                    for (RichButtonSpan richButtonSpan : buttonSpans) {
                        if (buttonContains(richButtonSpan, drawLeft, y10)) {
                            if (!richButtonSpan.isDisabled()) {
                                this.pressedButtonSpan = richButtonSpan;
                                this.longPressFired = false;
                                richButtonSpan.setPressed(true);
                                View view = this.view;
                                if (view != null) {
                                    view.invalidate();
                                }
                                scheduleLongPress();
                                return true;
                            }
                            return true;
                        }
                    }
                }
                if ((this.layout.getText() instanceof Spannable) && y10 >= 0 && y10 < this.layout.getHeight()) {
                    int lineForVertical = this.layout.getLineForVertical(y10);
                    float lineLeft = this.layout.getLineLeft(lineForVertical);
                    float lineWidth = this.layout.getLineWidth(lineForVertical) + lineLeft;
                    float f10 = drawLeft;
                    if (f10 >= lineLeft && f10 <= lineWidth) {
                        int offsetForHorizontal = this.layout.getOffsetForHorizontal(lineForVertical, f10);
                        Spannable spannable = (Spannable) this.layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                            ClickableSpan clickableSpan = clickableSpanArr[0];
                            this.pressedLink = clickableSpan;
                            this.pressedLinkStart = spannable.getSpanStart(clickableSpan);
                            this.pressedLinkEnd = spannable.getSpanEnd(this.pressedLink);
                            this.longPressFired = false;
                            m80 m80Var = new m80(this.pressedLink, this.root.resourcesProvider, f10, y10, 0);
                            f80 b10 = m80Var.b();
                            b10.d(this.layout, this.pressedLinkStart, 0.0f);
                            this.layout.getSelectionPath(this.pressedLinkStart, this.pressedLinkEnd, b10);
                            this.pressedLinkDrawable = m80Var;
                            if (this.linkCollector == null) {
                                this.linkCollector = new i80(this.view);
                            }
                            this.linkCollector.a(m80Var, null);
                            View view2 = this.view;
                            if (view2 != null) {
                                view2.invalidate();
                            }
                            scheduleLongPress();
                            return true;
                        }
                        StyleSpan[] styleSpanArr = (StyleSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, StyleSpan.class);
                        if (styleSpanArr != null) {
                            int length = styleSpanArr.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                styleSpan = styleSpanArr[i10];
                                if (TLObject.hasFlag(styleSpan.flags, 256)) {
                                    break;
                                }
                            }
                        }
                        styleSpan = null;
                        if (styleSpan != null) {
                            int spanStart2 = spannable.getSpanStart(styleSpan);
                            int spanEnd = spannable.getSpanEnd(styleSpan);
                            while (true) {
                                if (spanStart2 > 0) {
                                    int i11 = spanStart2 - 1;
                                    StyleSpan[] styleSpanArr2 = (StyleSpan[]) spannable.getSpans(i11, i11, StyleSpan.class);
                                    int length2 = styleSpanArr2.length;
                                    int i12 = 0;
                                    while (true) {
                                        z10 = true;
                                        if (i12 < length2) {
                                            styleSpan3 = styleSpanArr2[i12];
                                            if (TLObject.hasFlag(styleSpan3.flags, 256)) {
                                                break;
                                            }
                                            i12++;
                                        } else {
                                            styleSpan3 = null;
                                            break;
                                        }
                                    }
                                    if (styleSpan3 == null || (spanStart = spannable.getSpanStart(styleSpan3)) >= spanStart2) {
                                        break;
                                    }
                                    spanStart2 = spanStart;
                                } else {
                                    z10 = true;
                                    break;
                                }
                            }
                            do {
                                i9 = spanEnd;
                                if (i9 >= spannable.length()) {
                                    break;
                                }
                                StyleSpan[] styleSpanArr3 = (StyleSpan[]) spannable.getSpans(i9, i9, StyleSpan.class);
                                int length3 = styleSpanArr3.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < length3) {
                                        styleSpan2 = styleSpanArr3[i13];
                                        if (TLObject.hasFlag(styleSpan2.flags, 256)) {
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        styleSpan2 = null;
                                        break;
                                    }
                                }
                                if (styleSpan2 == null) {
                                    break;
                                }
                                spanEnd = spannable.getSpanEnd(styleSpan2);
                            } while (spanEnd > i9);
                            this.pressedLink = styleSpan;
                            this.pressedLinkStart = spanStart2;
                            this.pressedLinkEnd = i9;
                            this.longPressFired = false;
                            m80 m80Var2 = new m80(styleSpan, this.root.resourcesProvider, f10, y10, 0);
                            f80 b11 = m80Var2.b();
                            b11.d(this.layout, spanStart2, 0.0f);
                            this.layout.getSelectionPath(spanStart2, i9, b11);
                            this.pressedLinkDrawable = m80Var2;
                            if (this.linkCollector == null) {
                                this.linkCollector = new i80(this.view);
                            }
                            this.linkCollector.a(m80Var2, null);
                            View view3 = this.view;
                            if (view3 != null) {
                                view3.invalidate();
                            }
                            scheduleLongPress();
                            return z10;
                        }
                        org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.t5.class);
                        if (t5VarArr != null && t5VarArr.length > 0) {
                            this.pressedEmoji = t5VarArr[0];
                            return true;
                        }
                    }
                }
                return false;
            } else if (actionMasked == 2) {
                RichButtonSpan richButtonSpan2 = this.pressedButtonSpan;
                if (richButtonSpan2 != null) {
                    if (!buttonContains(richButtonSpan2, drawLeft, y10)) {
                        cancelLongPress();
                        this.pressedButtonSpan.setPressed(false);
                        this.pressedButtonSpan = null;
                        this.longPressFired = false;
                        return true;
                    }
                    return true;
                }
                return false;
            } else {
                if (actionMasked == 1) {
                    if (this.pressedButtonSpan != null) {
                        cancelLongPress();
                        RichButtonSpan richButtonSpan3 = this.pressedButtonSpan;
                        this.pressedButtonSpan = null;
                        richButtonSpan3.setPressed(false);
                        if (!this.longPressFired) {
                            View view4 = this.view;
                            if (view4 != null) {
                                view4.playSoundEffect(0);
                            }
                            richButtonSpan3.didPress(this.root.getCell(), this.root.getDelegate(), false);
                        }
                        this.longPressFired = false;
                        return true;
                    } else if (this.pressedSpoiler != null) {
                        revealSpoilers(drawLeft, y10);
                        this.pressedSpoiler = null;
                        return true;
                    } else if (this.pressedLink != null) {
                        cancelLongPress();
                        if (!this.longPressFired) {
                            dispatchLinkClick(this.pressedLink, false);
                        }
                        i80 i80Var = this.linkCollector;
                        if (i80Var != null) {
                            i80Var.d(true);
                        }
                        this.pressedLink = null;
                        this.pressedLinkDrawable = null;
                        this.longPressFired = false;
                        return true;
                    } else {
                        org.telegram.ui.Components.t5 t5Var = this.pressedEmoji;
                        if (t5Var != null) {
                            this.pressedEmoji = null;
                            org.telegram.ui.Cells.t1 cell = this.root.getCell();
                            org.telegram.ui.Cells.k1 delegate = this.root.getDelegate();
                            if (cell != null && delegate != null) {
                                View view5 = this.view;
                                if (view5 != null) {
                                    view5.playSoundEffect(0);
                                }
                                delegate.r0(t5Var);
                                return true;
                            }
                            return true;
                        }
                    }
                } else if (actionMasked == 3) {
                    this.pressedSpoiler = null;
                    this.pressedEmoji = null;
                    if (this.pressedButtonSpan != null) {
                        cancelLongPress();
                        this.pressedButtonSpan.setPressed(false);
                        this.pressedButtonSpan = null;
                        this.longPressFired = false;
                    }
                    if (this.pressedLink != null) {
                        cancelLongPress();
                        i80 i80Var2 = this.linkCollector;
                        if (i80Var2 != null) {
                            i80Var2.d(true);
                        }
                        this.pressedLink = null;
                        this.pressedLinkDrawable = null;
                        this.longPressFired = false;
                    }
                }
                return false;
            }
        }

        public void refreshAnimatedEmoji(int i9) {
            boolean z10;
            View view = this.view;
            if (view == null) {
                return;
            }
            org.telegram.ui.Components.t5.release(view, this.animatedEmojiStack);
            this.animatedEmojiStack = null;
            View view2 = this.view;
            if (this.root.invalidateAnimatedEmojiInParent && !this.doNotInvalidateEmojiInParent) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.animatedEmojiStack = org.telegram.ui.Components.t5.update(i9, view2, z10, (org.telegram.ui.Components.p5) null, this.layout);
        }

        public void setBlockX(int i9) {
            this.blockX = i9;
        }

        public void setBlockY(int i9) {
            this.blockY = i9;
        }

        public void setDrawAtOrigin(boolean z10) {
            this.drawAtOrigin = z10;
        }

        @Override
        public void setRow(int i9) {
            this.row = i9;
        }

        @Override
        public void setX(int i9) {
            this.f19661x = i9;
        }

        @Override
        public void setY(int i9) {
            this.f19662y = i9;
        }

        public Text(RichMessageLayout richMessageLayout, CharSequence charSequence, int i9, Layout.Alignment alignment) {
            this(richMessageLayout, charSequence, i9, alignment, 1.0f);
        }

        @Override
        public void draw(Canvas canvas, View view) {
            canvas.save();
            canvas.translate(-drawLeft(), 0.0f);
            RichMessageLayout richMessageLayout = this.root;
            int themedColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.f6.fc : org.telegram.ui.ActionBar.f6.ec);
            this.root.textPaint.setColor(themedColor);
            RichMessageLayout richMessageLayout2 = this.root;
            richMessageLayout2.textPaint.linkColor = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.f6.f23079hc : org.telegram.ui.ActionBar.f6.f23061gc);
            if (this.markPath != null) {
                if (markPaint == null) {
                    Paint paint = new Paint(1);
                    markPaint = paint;
                    paint.setPathEffect(f80.c());
                }
                markPaint.setColor((this.root.quoteLine.h() & 16777215) | 855638016);
                canvas.drawPath(this.markPath, markPaint);
            }
            View view2 = view != null ? view : this.view;
            i80 i80Var = this.linkCollector;
            if (i80Var != null && i80Var.f(canvas) && view2 != null) {
                view2.invalidate();
            }
            dh.l.g(view2, false, themedColor, 0, this.spoilersPatchedTextLayout, 0, this.layout, this.spoilers, canvas, false);
            jv0.a(canvas, this.layout);
            if (!this.root.isOverlayActive()) {
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.layout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
            }
            drawTranslationLoading(canvas);
            canvas.restore();
        }

        public Text(RichMessageLayout richMessageLayout, CharSequence charSequence, int i9, Layout.Alignment alignment, float f10) {
            boolean z10;
            StyleSpan[] styleSpanArr;
            int dp;
            int i10;
            StyleSpan[] styleSpanArr2;
            StyleSpan[] styleSpanArr3;
            this.spoilers = new ArrayList();
            this.spoilersPool = new Stack<>();
            this.spoilersPatchedTextLayout = new AtomicReference<>();
            this.soleButtonHitBounds = new RectF();
            this.root = richMessageLayout;
            Paint.FontMetricsInt fontMetricsInt = richMessageLayout.textPaint.getFontMetricsInt();
            if (charSequence instanceof Spanned) {
                for (StyleSpan styleSpan : (StyleSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), StyleSpan.class)) {
                    int i11 = styleSpan.flags & 15;
                    if (i11 >= 1 && i11 <= 6) {
                        TextPaint textPaint = new TextPaint(richMessageLayout.textPaint);
                        styleSpan.applyStyle(textPaint);
                        fontMetricsInt = textPaint.getFontMetricsInt();
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            CharSequence configureEmojiLineHeights = configureEmojiLineHeights(Emoji.replaceEmoji(charSequence, fontMetricsInt, false, z10 ? 0.85f : 1.0f), richMessageLayout.textPaint);
            int d = qh.u5.d(configureEmojiLineHeights);
            this.emojiOnlyCount = d;
            if (d == 0 && (configureEmojiLineHeights instanceof Spanned)) {
                Spanned spanned = (Spanned) configureEmojiLineHeights;
                RichButtonSpan[] richButtonSpanArr = (RichButtonSpan[]) spanned.getSpans(0, configureEmojiLineHeights.length(), RichButtonSpan.class);
                if (richButtonSpanArr.length > 0) {
                    Arrays.sort(richButtonSpanArr, new nh(spanned, 1));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(configureEmojiLineHeights);
                    int length = richButtonSpanArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            RichButtonSpan richButtonSpan = richButtonSpanArr[i12];
                            int spanStart = spanned.getSpanStart(richButtonSpan);
                            int spanEnd = spanned.getSpanEnd(richButtonSpan);
                            if (spanStart < 0 || spanEnd <= spanStart || richButtonSpan.getButton().text.getEmojiOnlyCount() == 0) {
                                break;
                            }
                            spannableStringBuilder.replace(spanStart, spanEnd, richButtonSpan.getButton().text.layout.getText());
                            i12++;
                        } else {
                            this.emojiOnlyCount = qh.u5.d(spannableStringBuilder);
                            break;
                        }
                    }
                }
            }
            if (this.emojiOnlyCount > 0 && (configureEmojiLineHeights instanceof Spanned)) {
                for (StyleSpan styleSpan2 : (StyleSpan[]) ((Spanned) configureEmojiLineHeights).getSpans(0, configureEmojiLineHeights.length(), StyleSpan.class)) {
                    if ((styleSpan2.flags & 15) == 14) {
                        styleSpan2.fullSizeTableEmoji = true;
                    }
                }
            }
            if (configureEmojiLineHeights instanceof Spanned) {
                StyleSpan[] styleSpanArr4 = (StyleSpan[]) ((Spanned) configureEmojiLineHeights).getSpans(0, configureEmojiLineHeights.length(), StyleSpan.class);
                int length2 = styleSpanArr4.length;
                for (int i13 = 0; i13 < length2 && (styleSpanArr4[i13].flags & 15) == 0; i13++) {
                }
            }
            this.layout = MessageObject.makeStaticLayout(configureEmojiLineHeights, richMessageLayout.textPaint, i9, f10, 0.0f, false, alignment);
            this.left = i9;
            this.right = 0;
            for (int i14 = 0; i14 < this.layout.getLineCount(); i14++) {
                this.left = Math.min(this.left, (int) Math.floor(this.layout.getLineLeft(i14)));
                this.right = Math.max(this.right, (int) Math.ceil(this.layout.getLineRight(i14)));
            }
            this.lastLineRight = 0;
            if (this.layout.getLineCount() > 0) {
                StaticLayout staticLayout = this.layout;
                this.lastLineRight = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
            }
            f80 f80Var = null;
            dh.l.c(null, this.layout, this.spoilersPool, this.spoilers);
            if (this.layout.getText() instanceof Spanned) {
                Spanned spanned2 = (Spanned) this.layout.getText();
                for (StyleSpan styleSpan3 : (StyleSpan[]) spanned2.getSpans(0, spanned2.length(), StyleSpan.class)) {
                    if (TLObject.hasFlag(styleSpan3.flags, 8192)) {
                        int spanStart2 = spanned2.getSpanStart(styleSpan3);
                        int spanEnd2 = spanned2.getSpanEnd(styleSpan3);
                        if (spanStart2 >= 0 && spanEnd2 > spanStart2) {
                            if (f80Var == null) {
                                f80Var = new f80(0);
                                f80Var.f28333n = false;
                            }
                            f80Var.d(this.layout, spanStart2, 0.0f);
                            if (TLObject.hasFlag(styleSpan3.flags, 4096)) {
                                dp = -AndroidUtilities.dp(6.0f);
                            } else {
                                dp = TLObject.hasFlag(styleSpan3.flags, 2048) ? AndroidUtilities.dp(2.0f) : 0;
                            }
                            if (dp != 0) {
                                i10 = AndroidUtilities.dp(dp > 0 ? 5.0f : -2.0f) + dp;
                            } else {
                                i10 = 0;
                            }
                            f80Var.f28334o = i10;
                            this.layout.getSelectionPath(spanStart2, spanEnd2, f80Var);
                        }
                    }
                }
                if (f80Var != null) {
                    f80Var.f28333n = true;
                    this.markPath = f80Var;
                }
            }
        }
    }

    public RichMessageLayout(MessageObject messageObject, int i9, RichMessageLayout richMessageLayout) {
        this.unsupportedBlocks = new ArrayList<>();
        this.unsupportedBlocksRoot = new ArrayList<>();
        this.blocks = new ArrayList<>();
        this.quotes = new ArrayList<>();
        this.anchors = new HashMap<>();
        this.textAnchors = new HashMap<>();
        this.audioMessages = new ArrayList<>();
        this.audioBlocks = new HashMap<>();
        this.textBlocks = new ArrayList<>();
        this.textBlockCharOffsets = new ArrayList<>();
        this.textBlockBlockIndex = new ArrayList<>();
        this.joinedText = "";
        this.detailsAnimationProgress = 1.0f;
        this.textPaint = new TextPaint(1);
        this.numTextPaint = new TextPaint(1);
        this.quoteLine = new dl0(null);
        this.clip = new s10();
        this.showMoreRect = new RectF();
        this.messageObject = messageObject;
        this.maxWidth = i9;
        this.currentAccount = messageObject.currentAccount;
        layout(richMessageLayout);
    }

    private void appendSelectionPiece(StringBuilder sb2, CharSequence charSequence, int i9, int i10, boolean z10) {
        String str;
        String str2;
        if (i10 > i9) {
            SpannableStringBuilder richHtmlSpannable = toRichHtmlSpannable(charSequence.subSequence(i9, i10));
            StringBuilder sb3 = new StringBuilder();
            qh.u3.g(sb3, richHtmlSpannable);
            String sb4 = sb3.toString();
            if (sb4.isEmpty()) {
                return;
            }
            if (z10) {
                str = "<cite>";
            } else {
                str = "<p>";
            }
            sb2.append(str);
            sb2.append(sb4);
            if (z10) {
                str2 = "</cite>";
            } else {
                str2 = "</p>";
            }
            sb2.append(str2);
        }
    }

    private void applyListPaddingFromBlocks() {
        boolean z10;
        float f10;
        float f11;
        for (int i9 = 0; i9 < this.blocks.size(); i9++) {
            RichBlock richBlock = this.blocks.get(i9);
            if ((richBlock instanceof RichTextBlock) && richBlock.listLevel > 0) {
                boolean z11 = true;
                if (i9 > 0 && this.blocks.get(i9 - 1).listLevel > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i10 = i9 + 1;
                z11 = (i10 >= this.blocks.size() || this.blocks.get(i10).listLevel <= 0) ? false : false;
                RichTextBlock richTextBlock = (RichTextBlock) richBlock;
                if (z10) {
                    f10 = 2.0f;
                } else {
                    f10 = 6.0f;
                }
                int dp = AndroidUtilities.dp(f10);
                if (z11) {
                    f11 = 5.0f;
                } else {
                    f11 = 9.0f;
                }
                richTextBlock.setContentPadding(dp, AndroidUtilities.dp(f11));
            }
        }
    }

    private void closeLists(StringBuilder sb2, ArrayList<Boolean> arrayList) {
        String str;
        while (!arrayList.isEmpty()) {
            if (((Boolean) e2.c.k(1, arrayList)).booleanValue()) {
                str = "</ol>";
            } else {
                str = "</ul>";
            }
            sb2.append(str);
        }
    }

    private void computeBlockquoteClips(float f10) {
        float f11;
        for (int i9 = 0; i9 < this.blocks.size(); i9++) {
            RichBlock richBlock = this.blocks.get(i9);
            if (richBlock instanceof RichTextBlockQuote) {
                RichTextBlockQuote richTextBlockQuote = (RichTextBlockQuote) richBlock;
                float f12 = 0.0f;
                if (richTextBlockQuote.prevCollapsed) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                if (richTextBlockQuote.currentCollapsed) {
                    f12 = 1.0f;
                }
                richTextBlockQuote.collapsedProgress = AndroidUtilities.lerp(f11, f12, f10);
                richTextBlockQuote.collapsedHeightToDraw = AndroidUtilities.lerp(richTextBlockQuote.prevH, richTextBlockQuote.currH, f10);
            }
        }
    }

    private void computeDetailsClips(float f10) {
        float f11;
        for (int i9 = 0; i9 < this.blocks.size(); i9++) {
            RichBlock richBlock = this.blocks.get(i9);
            if (richBlock instanceof RichDetailsBlock) {
                RichDetailsBlock richDetailsBlock = (RichDetailsBlock) richBlock;
                richDetailsBlock.animClipTop = AndroidUtilities.lerp(richDetailsBlock.prevY, richDetailsBlock.currY, f10) + richDetailsBlock.getHeight();
                int i10 = i9 + 1;
                while (true) {
                    if (i10 < this.blocks.size()) {
                        if (isDescendantOf(this.blocks.get(i10), richDetailsBlock)) {
                            i10++;
                        } else {
                            f11 = AndroidUtilities.lerp(this.blocks.get(i10).prevY, this.blocks.get(i10).currY, f10);
                            break;
                        }
                    } else {
                        f11 = Float.MAX_VALUE;
                        break;
                    }
                }
                richDetailsBlock.animClipBottom = f11;
            }
        }
    }

    public static org.telegram.messenger.MessageObject.GroupedMessagePosition[] computeGrouped(float[] r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.computeGrouped(float[]):org.telegram.messenger.MessageObject$GroupedMessagePosition[]");
    }

    public static RichButtonSpan createEditorButtonSpan(int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var, TL_iv.textButton textbutton) {
        return new RichButtonSpan(i10, textbutton, Boolean.FALSE);
    }

    public static RichButton createEditorPageButton(int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var, TL_keyboard.PageButton pageButton, Runnable runnable) {
        RichMessageLayout richMessageLayout = new RichMessageLayout(i9, i10, b6Var);
        CharSequence formatText = richMessageLayout.formatText(pageButton.text, setBlockFlags(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        return new RichButton(richMessageLayout, i10, formatText, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, true, false, false, false, false, Boolean.FALSE, runnable);
    }

    private void drawBackground(Canvas canvas, org.telegram.ui.Cells.s1 s1Var) {
        if (!this.quotes.isEmpty()) {
            ArrayList<QuoteBackground> arrayList = this.quotes;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                int i10 = i9 + 1;
                QuoteBackground quoteBackground = arrayList.get(i9);
                int blockTop = getBlockTop(quoteBackground.startBlockIndex, s1Var);
                int blockBottom = getBlockBottom(quoteBackground.endBlockIndex, s1Var);
                float blockBackgroundScale = getBlockBackgroundScale(quoteBackground.startBlockIndex, quoteBackground.endBlockIndex);
                int dp = AndroidUtilities.dp(3.0f) * quoteBackground.level;
                int i11 = quoteBackground.outerTopVpad + dp;
                int i12 = dp + quoteBackground.outerBottomVpad;
                if (blockBottom - blockTop > i11 + i12) {
                    blockTop += i11;
                    blockBottom -= i12;
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(quoteBackground.padding, blockTop, getMinWidth() - AndroidUtilities.dp(quoteBackground.level * 12), blockBottom);
                canvas.save();
                canvas.scale(blockBackgroundScale, blockBackgroundScale, rectF.centerX(), rectF.centerY());
                float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                this.quoteLine.c(canvas, rectF, floor, floor, floor, 1.0f, false, false);
                this.quoteLine.e(canvas, rectF, 1.0f);
                canvas.restore();
                i9 = i10;
            }
        }
        for (int i13 = 0; i13 < this.blocks.size(); i13++) {
            RichBlock richBlock = this.blocks.get(i13);
            if ((richBlock instanceof RichPullquoteBlock) && (richBlock.currVisible || richBlock.prevVisible)) {
                drawPullquoteBackground(canvas, (RichPullquoteBlock) richBlock, s1Var);
            }
        }
    }

    private void drawInternal(Canvas canvas, org.telegram.ui.Cells.s1 s1Var) {
        float f10;
        float f11;
        org.telegram.ui.Cells.t1 t1Var = this.cell;
        boolean z10 = t1Var != null && t1Var.Wd > 0;
        if (z10) {
            float f12 = t1Var.Ud - t1Var.f25486n0;
            f11 = t1Var.Wd + f12;
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        drawInternal(canvas, s1Var, z10, f10, f11);
    }

    private void drawPullquoteBackground(Canvas canvas, RichPullquoteBlock richPullquoteBlock, org.telegram.ui.Cells.s1 s1Var) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        int height;
        float f13;
        float f14;
        int textWidth = richPullquoteBlock.getTextWidth();
        if (textWidth > 0) {
            if (s1Var != null && (this.detailsAnimating || this.blockquoteAnimating)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f10 = Math.max(0.0f, Math.min(1.0f, s1Var.K1));
            } else {
                f10 = 1.0f;
            }
            if (z10) {
                if (richPullquoteBlock.prevVisible) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                if (richPullquoteBlock.currVisible) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                f11 = AndroidUtilities.lerp(f13, f14, f10);
            } else if (richPullquoteBlock.currVisible) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (f11 > 0.0f) {
                float minWidth = ((getMinWidth() + this.padRight) - this.padLeft) / 2.0f;
                float f15 = textWidth / 2.0f;
                float dp = (minWidth - f15) - AndroidUtilities.dp(30.0f);
                float dp2 = minWidth + f15 + AndroidUtilities.dp(30.0f);
                if (z10) {
                    f12 = AndroidUtilities.lerp(richPullquoteBlock.prevY, richPullquoteBlock.currY, f10);
                } else {
                    f12 = richPullquoteBlock.currY;
                }
                if (z10) {
                    height = AndroidUtilities.lerp(richPullquoteBlock.prevH, richPullquoteBlock.currH, f10);
                } else {
                    height = richPullquoteBlock.getHeight();
                }
                float dp3 = f12 + AndroidUtilities.dp(8.0f);
                float dp4 = (f12 + height) - AndroidUtilities.dp(8.0f);
                if (dp4 <= dp3) {
                    return;
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(dp, dp3, dp2, dp4);
                float floor = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
                this.quoteLine.c(canvas, rectF, floor, floor, floor, f11, false, false);
                if (this.pullquoteIcon == null) {
                    this.pullquoteIcon = ApplicationLoader.applicationContext.getDrawable(R.drawable.mini_quote).mutate();
                }
                this.pullquoteIcon.setColorFilter(this.quoteLine.h(), PorterDuff.Mode.SRC_IN);
                this.pullquoteIcon.setAlpha((int) (f11 * 255.0f));
                int intrinsicWidth = this.pullquoteIcon.getIntrinsicWidth();
                int intrinsicHeight = this.pullquoteIcon.getIntrinsicHeight();
                canvas.save();
                canvas.clipRect(dp, dp3, dp2, dp4);
                int i9 = (int) dp;
                int i10 = (int) dp3;
                this.pullquoteIcon.setBounds(AndroidUtilities.dp(8.0f) + i9, AndroidUtilities.dp(7.0f) + i10, l0.C(8.0f, i9, intrinsicWidth), l0.C(7.0f, i10, intrinsicHeight));
                canvas.scale(-1.0f, -1.0f, this.pullquoteIcon.getBounds().centerX(), this.pullquoteIcon.getBounds().centerY());
                this.pullquoteIcon.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.clipRect(dp, dp3, dp2, dp4);
                int i11 = (int) dp2;
                int i12 = (int) dp4;
                this.pullquoteIcon.setBounds(l0.B(8.0f, i11, intrinsicWidth), l0.B(7.0f, i12, intrinsicHeight), i11 - AndroidUtilities.dp(8.0f), i12 - AndroidUtilities.dp(7.0f));
                canvas.scale(1.0f, -1.0f, this.pullquoteIcon.getBounds().centerX(), this.pullquoteIcon.getBounds().centerY());
                this.pullquoteIcon.draw(canvas);
                canvas.restore();
                this.pullquoteIcon.setAlpha(255);
            }
        }
    }

    private void drawShowMoreButton(Canvas canvas, int i9) {
        int i10;
        int i11;
        boolean z10;
        org.telegram.ui.Cells.k1 k1Var;
        if (isOut()) {
            i10 = org.telegram.ui.ActionBar.f6.Xa;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.Kc;
        }
        int themedColor = getThemedColor(i10);
        if (this.showMoreText == null) {
            this.showMoreText = new nz0(LocaleController.getString(R.string.ShowMore), 16.0f, AndroidUtilities.bold());
        }
        org.telegram.ui.Components.pc pcVar = this.showMoreBounce;
        if (pcVar == null) {
            this.showMoreBounce = new org.telegram.ui.Components.pc(this.view, 1.5f, 2.0f);
        } else {
            View view = pcVar.f31606a;
            View view2 = this.view;
            if (view != view2) {
                pcVar.f31606a = view2;
            }
        }
        if (this.showMorePaint == null) {
            this.showMorePaint = new Paint(1);
        }
        this.showMorePaint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, themedColor));
        float f10 = this.showMoreText.f31223c;
        int minWidth = getMinWidth();
        float f11 = (((minWidth + i11) + this.padRight) / 2.0f) - this.padLeft;
        float dp = AndroidUtilities.dp(4.0f) + i9;
        float minWidth2 = (((getMinWidth() + this.padLeft) + this.padRight) - AndroidUtilities.dp(24.0f)) / 2.0f;
        this.showMoreRect.set(f11 - minWidth2, dp, f11 + minWidth2, AndroidUtilities.dp(42.0f) + dp);
        org.telegram.ui.Cells.t1 t1Var = this.cell;
        boolean z11 = false;
        if (t1Var != null && (k1Var = this.delegate) != null && k1Var.Y0(7, t1Var)) {
            z10 = true;
        } else {
            z10 = false;
        }
        p80 p80Var = this.showMoreLoading;
        if (p80Var != null && !z10 && !p80Var.b() && !this.showMoreLoading.c()) {
            this.showMoreLoading.a();
        }
        p80 p80Var2 = this.showMoreLoading;
        if (p80Var2 == null && z10) {
            p80 p80Var3 = new p80();
            this.showMoreLoading = p80Var3;
            p80Var3.f31590w.setStrokeWidth(AndroidUtilities.dp(1.25f));
            this.showMoreLoading.C = true;
        } else if (p80Var2 != null && z10 && (p80Var2.b() || this.showMoreLoading.c())) {
            p80 p80Var4 = this.showMoreLoading;
            p80Var4.f31572b = -1L;
            p80Var4.f31573c = -1L;
        }
        p80 p80Var5 = this.showMoreLoading;
        if (p80Var5 != null) {
            p80Var5.f(org.telegram.ui.ActionBar.f6.l1(0.1f, themedColor), org.telegram.ui.ActionBar.f6.l1(0.3f, themedColor), org.telegram.ui.ActionBar.f6.l1(0.3f, themedColor), org.telegram.ui.ActionBar.f6.l1(1.2f, themedColor));
        }
        float a2 = this.showMoreBounce.a(0.075f);
        if (a2 != 1.0f) {
            z11 = true;
        }
        if (z11) {
            canvas.save();
            canvas.scale(a2, a2, this.showMoreRect.centerX(), this.showMoreRect.centerY());
        }
        canvas.drawRoundRect(this.showMoreRect, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.showMorePaint);
        p80 p80Var6 = this.showMoreLoading;
        if (p80Var6 != null && !p80Var6.b()) {
            this.showMoreLoading.d(this.showMoreRect);
            this.showMoreLoading.j(8.0f);
            this.showMoreLoading.draw(canvas);
            View view3 = this.view;
            if (view3 != null) {
                view3.invalidate();
            }
        }
        this.showMoreText.c(this.showMoreRect.centerX() - (f10 / 2.0f), this.showMoreRect.centerY(), 1.0f, themedColor, canvas);
        if (z11) {
            canvas.restore();
        }
    }

    private RichBlock emitBlock(TL_iv.PageBlock pageBlock, int i9, Rect rect, int i10, boolean z10) {
        int dp;
        int i11;
        TLRPC.Document document;
        CharSequence charSequence;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        CharSequence charSequence2;
        TL_iv.pageBlockBlockquote pageblockblockquote;
        RichMessageLayout richMessageLayout;
        RichQuoteBlock richQuoteBlock;
        int i14;
        int i15;
        int i16;
        TextPaint textPaint;
        int i17;
        int i18;
        RichBlock richBlock;
        int dp2;
        int i19 = i10;
        RichBlock richBlock2 = null;
        if (rect.left + rect.right >= this.maxWidth) {
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockThinking) {
            RichThinkingBlock richThinkingBlock = new RichThinkingBlock(this, new Rect(), this.maxWidth, formatText(pageBlock.text));
            this.blocks.add(richThinkingBlock);
            return richThinkingBlock;
        } else if (!org.telegram.ui.l4.K(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                RichPreformattedBlock richPreformattedBlock = new RichPreformattedBlock(this, rect, this.maxWidth, (TL_iv.pageBlockPreformatted) pageBlock, (RichPreformattedBlock) findPrevBlock(pageBlock, RichPreformattedBlock.class));
                richPreformattedBlock.accessibilityLabelResId = R.string.ArticleCode;
                this.blocks.add(richPreformattedBlock);
                return richPreformattedBlock;
            } else if (pageBlock instanceof TL_iv.pageBlockList) {
                TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                int i20 = i9 + 1;
                this.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                int dp3 = AndroidUtilities.dp(18.0f);
                for (int i21 = 0; i21 < pageblocklist.items.size(); i21++) {
                    if (pageblocklist.items.get(i21).checkbox) {
                        dp2 = AndroidUtilities.dp(26.0f);
                    } else {
                        dp2 = AndroidUtilities.dp(18.0f);
                    }
                    dp3 = Math.max(dp3, dp2);
                }
                Rect rect2 = new Rect(rect);
                if (isRtl()) {
                    rect2.right += dp3;
                } else {
                    rect2.left += dp3;
                }
                int i22 = 0;
                while (i22 < pageblocklist.items.size()) {
                    TL_iv.PageListItem pageListItem = pageblocklist.items.get(i22);
                    if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                        TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                        richBlock = richBlock2;
                        RichTextBlock richTextBlock = new RichTextBlock(this, new Rect(rect2), this.maxWidth, formatText(tL_pageListItemText.text, i19));
                        richTextBlock.setListMarkerWidth(dp3);
                        if (tL_pageListItemText.checkbox) {
                            richTextBlock.setCheckbox(tL_pageListItemText.checked, tL_pageListItemText);
                        } else {
                            richTextBlock.setNum("•◦▪".charAt(i9 % 3) + "");
                        }
                        markListItem(richTextBlock, i20, false, tL_pageListItemText.checkbox, tL_pageListItemText.checked);
                        this.blocks.add(richTextBlock);
                    } else {
                        richBlock = richBlock2;
                        if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                            if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                                int size = this.blocks.size();
                                int i23 = 0;
                                boolean z14 = false;
                                while (i23 < tL_pageListItemBlocks.blocks.size()) {
                                    int i24 = i23;
                                    RichBlock emitBlock = emitBlock(tL_pageListItemBlocks.blocks.get(i23), i20, new Rect(rect2), i19, previousBlockIsParagraph(tL_pageListItemBlocks.blocks, i23));
                                    if (emitBlock != null && !z14) {
                                        emitBlock.setListMarkerWidth(dp3);
                                        if (tL_pageListItemBlocks.checkbox) {
                                            emitBlock.setCheckbox(tL_pageListItemBlocks.checked, tL_pageListItemBlocks);
                                        } else {
                                            emitBlock.setNum("•◦▪".charAt(i9 % 3) + "");
                                        }
                                        markListItem(emitBlock, i20, false, tL_pageListItemBlocks.checkbox, tL_pageListItemBlocks.checked);
                                        z14 = true;
                                    }
                                    i23 = i24 + 1;
                                }
                                markListMembership(size, this.blocks.size(), i20, false);
                                i22++;
                                richBlock2 = richBlock;
                            }
                        }
                    }
                    i22++;
                    richBlock2 = richBlock;
                }
                return richBlock2;
            } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                int i25 = i9 + 1;
                this.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                new TextPaint(this.numTextPaint).setTypeface(AndroidUtilities.bold());
                int dp4 = AndroidUtilities.dp(28.0f);
                for (int i26 = 0; i26 < pageblockorderedlist.items.size(); i26++) {
                    TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i26);
                    String orderedListMarker = orderedListMarker(pageblockorderedlist, pageListOrderedItem, i26);
                    if (pageListOrderedItem.checkbox) {
                        i18 = AndroidUtilities.dp(26.0f);
                    } else {
                        i18 = 0;
                    }
                    dp4 = Math.max(dp4, AndroidUtilities.dp(10.0f) + ((int) Math.ceil(textPaint.measureText(orderedListMarker))) + i18);
                }
                Rect rect3 = new Rect(rect);
                if (isRtl()) {
                    rect3.right += dp4;
                } else {
                    rect3.left += dp4;
                }
                int i27 = 0;
                while (i27 < pageblockorderedlist.items.size()) {
                    TL_iv.PageListOrderedItem pageListOrderedItem2 = pageblockorderedlist.items.get(i27);
                    if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                        TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2;
                        RichTextBlock richTextBlock2 = new RichTextBlock(this, new Rect(rect3), this.maxWidth, formatText(tL_pageListOrderedItemText.text, i19));
                        richTextBlock2.setListMarkerWidth(dp4);
                        richTextBlock2.setNum(orderedListMarker(pageblockorderedlist, tL_pageListOrderedItemText, i27));
                        if (tL_pageListOrderedItemText.checkbox) {
                            richTextBlock2.setCheckbox(tL_pageListOrderedItemText.checked, tL_pageListOrderedItemText);
                        }
                        markListItem(richTextBlock2, i25, true, tL_pageListOrderedItemText.checkbox, tL_pageListOrderedItemText.checked);
                        this.blocks.add(richTextBlock2);
                    } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                        TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2;
                        if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                            int size2 = this.blocks.size();
                            boolean z15 = false;
                            int i28 = 0;
                            while (i28 < tL_pageListOrderedItemBlocks.blocks.size()) {
                                RichBlock emitBlock2 = emitBlock(tL_pageListOrderedItemBlocks.blocks.get(i28), i25, new Rect(rect3), i19, previousBlockIsParagraph(tL_pageListOrderedItemBlocks.blocks, i28));
                                int i29 = i19;
                                if (emitBlock2 != null && !z15) {
                                    emitBlock2.setListMarkerWidth(dp4);
                                    if (tL_pageListOrderedItemBlocks.checkbox) {
                                        emitBlock2.setCheckbox(tL_pageListOrderedItemBlocks.checked, tL_pageListOrderedItemBlocks);
                                    }
                                    emitBlock2.setNum(orderedListMarker(pageblockorderedlist, tL_pageListOrderedItemBlocks, i27));
                                    if (tL_pageListOrderedItemBlocks.checkbox) {
                                        emitBlock2.setCheckbox(tL_pageListOrderedItemBlocks.checked, tL_pageListOrderedItemBlocks);
                                    }
                                    markListItem(emitBlock2, i25, true, tL_pageListOrderedItemBlocks.checkbox, tL_pageListOrderedItemBlocks.checked);
                                    z15 = true;
                                }
                                i28++;
                                i19 = i29;
                            }
                            i17 = i19;
                            markListMembership(size2, this.blocks.size(), i25, true);
                            i27++;
                            i19 = i17;
                        }
                    }
                    i17 = i19;
                    i27++;
                    i19 = i17;
                }
                return null;
            } else {
                int i30 = i19;
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    int i31 = rect.left;
                    int size3 = this.blocks.size();
                    TL_iv.pageBlockBlockquote pageblockblockquote2 = (TL_iv.pageBlockBlockquote) pageBlock;
                    CharSequence formatText = formatText(pageBlock.text, setBlockFlags(i30, getBlockTextFlag(pageBlock)));
                    TL_iv.RichText richText = pageblockblockquote2.caption;
                    if (richText != null && !TextUtils.isEmpty(getString(richText))) {
                        charSequence2 = formatText(pageblockblockquote2.caption, setBlockFlags(i30, 11));
                    } else {
                        charSequence2 = null;
                    }
                    if (pageblockblockquote2.collapsed) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatText);
                        if (charSequence2 != null) {
                            spannableStringBuilder.append('\n');
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append(charSequence2);
                            i16 = length;
                        } else {
                            i16 = -1;
                        }
                        ?? richTextBlockQuote = new RichTextBlockQuote(this, new Rect(AndroidUtilities.dp(12.0f) + rect.left, AndroidUtilities.dp(4.0f) + rect.top, AndroidUtilities.dp(20.0f) + rect.right, AndroidUtilities.dp(4.0f) + rect.bottom), this.maxWidth, pageblockblockquote2, spannableStringBuilder);
                        pageblockblockquote = pageblockblockquote2;
                        richTextBlockQuote.quoteAuthorStart = i16;
                        richTextBlockQuote.setContentPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                        richQuoteBlock = richTextBlockQuote;
                        richMessageLayout = this;
                    } else {
                        pageblockblockquote = pageblockblockquote2;
                        richMessageLayout = this;
                        richQuoteBlock = new RichQuoteBlock(this, new Rect(AndroidUtilities.dp(12.0f) + rect.left, AndroidUtilities.dp(12.0f) + rect.top, AndroidUtilities.dp(12.0f) + rect.right, AndroidUtilities.dp(14.0f) + rect.bottom), this.maxWidth, formatText, charSequence2);
                    }
                    richQuoteBlock.accessibilityLabelResId = R.string.ArticleQuote;
                    richMessageLayout.blocks.add(richQuoteBlock);
                    ArrayList<QuoteBackground> arrayList = richMessageLayout.quotes;
                    int size4 = richMessageLayout.blocks.size() - 1;
                    int dp5 = AndroidUtilities.dp(8.0f);
                    if (pageblockblockquote.collapsed) {
                        i14 = i31;
                        i15 = AndroidUtilities.dp(8.0f);
                    } else {
                        i14 = i31;
                        i15 = 0;
                    }
                    arrayList.add(new QuoteBackground(size3, size4, i14, i9, dp5, i15));
                    return richQuoteBlock;
                }
                int i32 = 9;
                if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                    int i33 = rect.left;
                    int i34 = i9 + 1;
                    int size5 = this.blocks.size();
                    TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                    TL_iv.RichText richText2 = pageblockblockquoteblocks.caption;
                    if (richText2 != null && !TextUtils.isEmpty(getString(richText2))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i35 = 0;
                    while (i35 < pageblockblockquoteblocks.blocks.size()) {
                        if (i35 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i35 == pageblockblockquoteblocks.blocks.size() - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        TL_iv.PageBlock pageBlock2 = pageblockblockquoteblocks.blocks.get(i35);
                        int dp6 = AndroidUtilities.dp(12.0f) + rect.left;
                        int i36 = rect.top;
                        if (z12) {
                            i12 = AndroidUtilities.dp(4.0f);
                        } else {
                            i12 = 0;
                        }
                        int i37 = i36 + i12;
                        int dp7 = AndroidUtilities.dp(12.0f) + rect.right;
                        int i38 = rect.bottom;
                        if (z13 && !z11) {
                            i13 = AndroidUtilities.dp(4.0f);
                        } else {
                            i13 = 0;
                        }
                        emitBlock(pageBlock2, i34, new Rect(dp6, i37, dp7, i38 + i13), setBlockFlags(i30, i32), previousBlockIsParagraph(pageblockblockquoteblocks.blocks, i35));
                        i35++;
                        size5 = size5;
                        i32 = 9;
                    }
                    int i39 = size5;
                    if (this.blocks.size() > i39) {
                        this.blocks.get(i39).accessibilityParentLabelResId = R.string.ArticleQuote;
                    }
                    if (z11) {
                        RichTextBlock richTextBlock3 = new RichTextBlock(this, new Rect(AndroidUtilities.dp(12.0f) + rect.left, rect.top, AndroidUtilities.dp(12.0f) + rect.right, AndroidUtilities.dp(6.0f) + rect.bottom), this.maxWidth, new SpannableStringBuilder(formatText(pageblockblockquoteblocks.caption, setBlockFlags(i30, 11))));
                        richTextBlock3.quoteAuthorStart = 0;
                        richTextBlock3.setContentPadding(AndroidUtilities.dp(2.0f), 0);
                        this.blocks.add(richTextBlock3);
                    }
                    this.quotes.add(new QuoteBackground(i39, this.blocks.size() - 1, i33, i9));
                    return null;
                } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                    CharSequence formatText2 = formatText(pageBlock.text, setBlockFlags(i30, getBlockTextFlag(pageBlock)));
                    TL_iv.RichText richText3 = pageblockpullquote.caption;
                    if (richText3 != null && !TextUtils.isEmpty(getString(richText3))) {
                        charSequence = formatText(pageblockpullquote.caption, setBlockFlags(i30, 11));
                    } else {
                        charSequence = null;
                    }
                    RichPullquoteBlock richPullquoteBlock = new RichPullquoteBlock(this, new Rect(AndroidUtilities.dp(30.0f) + rect.left, AndroidUtilities.dp(16.0f) + rect.top, AndroidUtilities.dp(30.0f) + rect.right, AndroidUtilities.dp(16.0f) + rect.bottom), this.maxWidth, formatText2, charSequence);
                    richPullquoteBlock.accessibilityLabelResId = R.string.ArticlePullquote;
                    this.blocks.add(richPullquoteBlock);
                    return richPullquoteBlock;
                } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    RichButtonRowBlock richButtonRowBlock = new RichButtonRowBlock(this, rect, this.maxWidth, (TL_iv.pageBlockButtonRow) pageBlock);
                    richButtonRowBlock.accessibilityLabelResId = R.string.AccDescrIVButtons;
                    this.blocks.add(richButtonRowBlock);
                    return richButtonRowBlock;
                } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                    RichTableBlock richTableBlock = new RichTableBlock(this, rect, this.maxWidth, (TL_iv.pageBlockTable) pageBlock);
                    richTableBlock.accessibilityLabelResId = R.string.AccDescrIVTable;
                    this.blocks.add(richTableBlock);
                    return richTableBlock;
                } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                    RichMathBlock richMathBlock = new RichMathBlock(this, rect, this.maxWidth, (TL_iv.pageBlockMath) pageBlock);
                    this.blocks.add(richMathBlock);
                    return richMathBlock;
                } else if (pageBlock instanceof TL_iv.pageBlockDivider) {
                    RichDividerBlock richDividerBlock = new RichDividerBlock(this, rect, this.maxWidth);
                    this.blocks.add(richDividerBlock);
                    return richDividerBlock;
                } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                    TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                    RichPhotoBlock richPhotoBlock = new RichPhotoBlock(this, rect, this.maxWidth, pageblockphoto, this.blocks.isEmpty());
                    this.blocks.add(richPhotoBlock);
                    emitCaption(pageblockphoto.caption, rect, i30);
                    return richPhotoBlock;
                } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                    RichVideoBlock richVideoBlock = new RichVideoBlock(this, rect, this.maxWidth, pageblockvideo, this.blocks.isEmpty());
                    this.blocks.add(richVideoBlock);
                    emitCaption(pageblockvideo.caption, rect, i30);
                    return richVideoBlock;
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                    RichCollageBlock richCollageBlock = new RichCollageBlock(this, rect, this.maxWidth, pageblockcollage, this.blocks.isEmpty());
                    this.blocks.add(richCollageBlock);
                    emitCaption(pageblockcollage.caption, rect, i30);
                    return richCollageBlock;
                } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                    RichSlideshowBlock richSlideshowBlock = new RichSlideshowBlock(this, rect, this.maxWidth, pageblockslideshow, this.blocks.isEmpty());
                    this.blocks.add(richSlideshowBlock);
                    emitCaption(pageblockslideshow.caption, rect, i30);
                    return richSlideshowBlock;
                } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                    RichMapBlock richMapBlock = new RichMapBlock(this, rect, this.maxWidth, pageblockmap);
                    this.blocks.add(richMapBlock);
                    emitCaption(pageblockmap.caption, rect, i30);
                    return richMapBlock;
                } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                    if (this.audioBlocks.get(pageblockaudio) == null && (document = getDocument(pageblockaudio.audio_id)) != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.out = true;
                        int i40 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                        pageblockaudio.mid = i40;
                        tL_message.f22401id = i40;
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
                    emitCaption(pageblockaudio.caption, rect, i30);
                    return richAudioBlock;
                } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                    TL_iv.pageBlockDocument pageblockdocument = (TL_iv.pageBlockDocument) pageBlock;
                    RichDocumentBlock richDocumentBlock = new RichDocumentBlock(this, rect, this.maxWidth, pageblockdocument);
                    this.blocks.add(richDocumentBlock);
                    emitCaption(pageblockdocument.caption, rect, i30);
                    return richDocumentBlock;
                } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                    return emitBlock(((TL_iv.pageBlockCover) pageBlock).cover, i9, rect, i30, false);
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockAnchor) {
                        String str = ((TL_iv.pageBlockAnchor) pageBlock).name;
                        if (str != null) {
                            this.anchors.put(str.toLowerCase(), Integer.valueOf(this.blocks.size()));
                        }
                        return null;
                    } else if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
                        if (g7.z7.a(i30, 9)) {
                            i11 = AndroidUtilities.dp(6.0f);
                        } else if (i9 > 0) {
                            i11 = AndroidUtilities.dp(4.0f);
                        } else {
                            i11 = 0;
                        }
                        RichUnsupportedBlock richUnsupportedBlock = new RichUnsupportedBlock(this, new Rect((rect.left + i11) - AndroidUtilities.dp(7.0f), Math.max(AndroidUtilities.dp(14.0f), rect.top), (rect.right + i11) - AndroidUtilities.dp(7.0f), Math.max(AndroidUtilities.dp(14.0f), rect.bottom)), this.maxWidth, this.blocks.size(), i9);
                        this.unsupportedBlocks.add(richUnsupportedBlock);
                        if (i9 == 0) {
                            this.unsupportedBlocksRoot.add(richUnsupportedBlock);
                        }
                        this.blocks.add(richUnsupportedBlock);
                        return richUnsupportedBlock;
                    } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                        RichDetailsBlock richDetailsBlock = new RichDetailsBlock(this, rect, this.maxWidth, pageblockdetails, formatText(pageblockdetails.title, i30 & (-17)));
                        this.blocks.add(richDetailsBlock);
                        int i41 = 0;
                        while (i41 < pageblockdetails.blocks.size()) {
                            int i42 = i30;
                            emitBlock(pageblockdetails.blocks.get(i41), i9 + 1, rect, i42, previousBlockIsParagraph(pageblockdetails.blocks, i41));
                            i41++;
                            i30 = i42;
                        }
                        this.blocks.add(new RichDetailsEndBlock(this, new Rect(rect.left, 0, rect.right, 0), this.maxWidth));
                        for (int size6 = this.blocks.size(); size6 < this.blocks.size(); size6++) {
                            RichBlock richBlock3 = this.blocks.get(size6);
                            if (richBlock3.parentDetails == null) {
                                richBlock3.parentDetails = richDetailsBlock;
                            }
                        }
                        return richDetailsBlock;
                    } else if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                        return null;
                    } else {
                        RichTextBlock richTextBlock4 = new RichTextBlock(this, rect, this.maxWidth, "unsupported block " + pageBlock);
                        this.blocks.add(richTextBlock4);
                        return richTextBlock4;
                    }
                }
            }
        } else {
            boolean K = org.telegram.ui.l4.K(pageBlock);
            RichTextBlock richTextBlock5 = new RichTextBlock(this, rect, this.maxWidth, formatText(pageBlock.text, setBlockFlags(i19, getBlockTextFlag(pageBlock))));
            if (K) {
                richTextBlock5.setContentPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(6.0f));
            } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                if (z10) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(5.0f);
                }
                richTextBlock5.setContentPadding(dp, AndroidUtilities.dp(4.66f));
            }
            richTextBlock5.accessibilityLabelResId = getBlockAccessibilityLabel(pageBlock);
            this.blocks.add(richTextBlock5);
            return richTextBlock5;
        }
    }

    private void emitCaption(TL_iv.PageCaption pageCaption, Rect rect, int i9) {
        boolean z10;
        CharSequence charSequence;
        if (pageCaption != null) {
            TL_iv.RichText richText = pageCaption.text;
            boolean z11 = false;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                z10 = true;
            } else {
                z10 = false;
            }
            TL_iv.RichText richText2 = pageCaption.credit;
            if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty)) {
                z11 = true;
            }
            if (!z10 && !z11) {
                return;
            }
            int blockFlags = setBlockFlags(i9, 10);
            CharSequence charSequence2 = null;
            if (z10) {
                charSequence = formatText(pageCaption.text, blockFlags);
            } else {
                charSequence = null;
            }
            if (z11) {
                charSequence2 = formatText(pageCaption.credit, blockFlags);
            }
            this.blocks.add(new RichCaptionBlock(this, rect, this.maxWidth, charSequence, charSequence2));
        }
    }

    private <T extends RichBlock> T findPrevBlock(TL_iv.PageBlock pageBlock, Class<T> cls) {
        RichMessageLayout richMessageLayout = this.prev;
        if (richMessageLayout == null) {
            return null;
        }
        ArrayList<RichBlock> arrayList = richMessageLayout.blocks;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            RichBlock richBlock = arrayList.get(i9);
            i9++;
            RichBlock richBlock2 = richBlock;
            if (cls.isInstance(richBlock2) && (richBlock2 instanceof RichPreformattedBlock) && prefixEquals(((RichPreformattedBlock) richBlock2).plain, getString(pageBlock.text))) {
                return cls.cast(richBlock2);
            }
        }
        return null;
    }

    private CharSequence formatTextAndSetSpan(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i9, Object obj) {
        int length = spannableStringBuilder.length();
        formatText(richText, spannableStringBuilder, i9);
        if (spannableStringBuilder.length() > length) {
            setSpansWithoutClash(obj, spannableStringBuilder, length, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
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

    private float getBlockBackgroundScale(int i9, int i10) {
        float f10 = 1.0f;
        while (i9 < Math.min(i10 + 1, this.blocks.size())) {
            RichBlock richBlock = this.blocks.get(i9);
            if (richBlock.isVisible()) {
                f10 = richBlock.getBackgroundScale() * f10;
            }
            i9++;
        }
        return f10;
    }

    private int getBlockBottom(int i9, org.telegram.ui.Cells.s1 s1Var) {
        int height;
        int i10;
        int i11 = 0;
        if (i9 >= 0 && i9 < this.blocks.size() && s1Var != null && (this.detailsAnimating || this.blockquoteAnimating)) {
            float max = Math.max(0.0f, Math.min(1.0f, s1Var.K1));
            RichBlock richBlock = this.blocks.get(i9);
            int b10 = l0.b(4.0f, richBlock.padding.bottom, 0);
            float f10 = richBlock.prevY + richBlock.prevH;
            if (richBlock.prevVisible) {
                i10 = b10;
            } else {
                i10 = 0;
            }
            float f11 = f10 - i10;
            float f12 = richBlock.currY + richBlock.currH;
            if (richBlock.currVisible) {
                i11 = b10;
            }
            return Math.round(AndroidUtilities.lerp(f11, f12 - i11, max));
        }
        boolean z10 = false;
        int i12 = 0;
        while (i11 < this.blocks.size()) {
            RichBlock richBlock2 = this.blocks.get(i11);
            boolean isVisible = richBlock2.isVisible();
            if (isVisible && z10) {
                i12 += getGap();
            }
            if (isVisible) {
                if (s1Var != null && (this.detailsAnimating || this.blockquoteAnimating)) {
                    height = AndroidUtilities.lerp(richBlock2.prevH, richBlock2.currH, Math.max(0.0f, Math.min(1.0f, s1Var.K1)));
                } else {
                    height = richBlock2.getHeight();
                }
                int i13 = height + i12;
                if (i11 == i9 && richBlock2.padding.bottom > AndroidUtilities.dp(4.0f)) {
                    i12 = l0.A(4.0f, richBlock2.padding.bottom, i13);
                } else {
                    i12 = i13;
                }
            }
            if (i11 == i9) {
                return i12;
            }
            if (isVisible) {
                z10 = true;
            }
            i11++;
        }
        return this.height;
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
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return 7;
        }
        return 0;
    }

    private int getBlockTop(int i9, org.telegram.ui.Cells.s1 s1Var) {
        int height;
        if (i9 >= 0 && i9 < this.blocks.size() && s1Var != null && (this.detailsAnimating || this.blockquoteAnimating)) {
            float max = Math.max(0.0f, Math.min(1.0f, s1Var.K1));
            RichBlock richBlock = this.blocks.get(i9);
            return Math.round(AndroidUtilities.lerp(richBlock.prevY, richBlock.currY, max));
        }
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < this.blocks.size(); i11++) {
            RichBlock richBlock2 = this.blocks.get(i11);
            boolean isVisible = richBlock2.isVisible();
            if (isVisible && z10) {
                i10 += getGap();
            }
            if (i11 == i9) {
                return i10;
            }
            if (isVisible) {
                if (s1Var != null && (this.detailsAnimating || this.blockquoteAnimating)) {
                    height = AndroidUtilities.lerp(richBlock2.prevH, richBlock2.currH, Math.max(0.0f, Math.min(1.0f, s1Var.K1)));
                } else {
                    height = richBlock2.getHeight();
                }
                i10 = height + i10;
                z10 = true;
            }
        }
        return this.height;
    }

    public static String getString(TL_iv.RichText richText) {
        StringBuilder sb2 = new StringBuilder();
        getString(richText, sb2);
        return sb2.toString();
    }

    private static vz0 getTextStyleRun(int i9) {
        ?? obj = new Object();
        obj.f34062a = i9;
        return obj;
    }

    public int getThemedColor(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.resourcesProvider);
    }

    public Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.b6 b6Var = this.resourcesProvider;
        if (b6Var != null) {
            drawable = b6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.f6.O0(str);
    }

    public boolean handleAnchorClick(String str) {
        String substring;
        if (str == null || !str.startsWith("#")) {
            return false;
        }
        try {
            substring = URLDecoder.decode(str.substring(1), "UTF-8");
        } catch (Exception unused) {
            substring = str.substring(1);
        }
        if (TextUtils.isEmpty(substring)) {
            return false;
        }
        String lowerCase = substring.toLowerCase();
        TL_iv.textAnchor textanchor = this.textAnchors.get(lowerCase);
        if (textanchor != null) {
            return showFootnoteSheet(textanchor);
        }
        Integer num = this.anchors.get(lowerCase);
        if (num == null) {
            return true;
        }
        return scrollToPageBlockAnchor(num.intValue());
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
                if (chat2 != null && hasCustomPeerColor(chat2.color)) {
                    return true;
                }
                return false;
            }
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (user2 != null && hasCustomPeerColor(user2.color)) {
                return true;
            }
            return false;
        } else if (!DialogObject.isEncryptedDialog(messageObject2.getDialogId()) && !this.messageObject.isFromUser()) {
            if (!this.messageObject.isFromChannel() || chat == null) {
                return false;
            }
            if (chat.signature_profiles) {
                long fromChatId = this.messageObject.getFromChatId();
                if (fromChatId >= 0) {
                    TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(fromChatId));
                    if (user3 != null && hasCustomPeerColor(user3.color)) {
                        return true;
                    }
                    return false;
                }
                TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-fromChatId));
                if (chat3 != null && hasCustomPeerColor(chat3.color)) {
                    return true;
                }
                return false;
            }
            return hasCustomPeerColor(chat.color);
        } else if (user != null && hasCustomPeerColor(user.color)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean hasCustomPeerColor(TLRPC.PeerColor peerColor) {
        if ((peerColor instanceof TLRPC.TL_peerColorCollectible) || ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0)) {
            return true;
        }
        return false;
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

    public static int lambda$quotesFor$0(QuoteBackground quoteBackground, QuoteBackground quoteBackground2) {
        return quoteBackground.level - quoteBackground2.level;
    }

    private static void markListItem(RichBlock richBlock, int i9, boolean z10, boolean z11, boolean z12) {
        if (richBlock == null) {
            return;
        }
        richBlock.listLevel = i9;
        richBlock.listOrdered = z10;
        richBlock.listCheckbox = z11;
        richBlock.listChecked = z12;
    }

    private void markListMembership(int i9, int i10, int i11, boolean z10) {
        while (i9 < i10) {
            RichBlock richBlock = this.blocks.get(i9);
            if (richBlock.listLevel == 0) {
                richBlock.listLevel = i11;
                richBlock.listOrdered = z10;
            }
            i9++;
        }
    }

    private static float multiHeight(float[] fArr, int i9, int i10, int i11) {
        float f10 = 0.0f;
        while (i9 < i10) {
            f10 += fArr[i9];
            i9++;
        }
        return i11 / Math.max(1.0E-4f, f10);
    }

    private static String orderedListMarker(TL_iv.pageBlockOrderedList pageblockorderedlist, TL_iv.PageListOrderedItem pageListOrderedItem, int i9) {
        if (!TextUtils.isEmpty(pageListOrderedItem.num)) {
            if (pageListOrderedItem.num.endsWith(".")) {
                return pageListOrderedItem.num;
            }
            return aa.d.r(new StringBuilder(), pageListOrderedItem.num, ".");
        } else if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return aa.d.l(pageListOrderedItem.value, ".", new StringBuilder());
        } else if (TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
            StringBuilder sb2 = new StringBuilder();
            int i10 = pageblockorderedlist.start;
            if (pageblockorderedlist.reversed) {
                i9 = -i9;
            }
            sb2.append(i10 + i9);
            sb2.append(".");
            return sb2.toString();
        } else {
            return (i9 + 1) + ".";
        }
    }

    private boolean prefixEquals(String str, String str2) {
        if (str == null || str2 == null || str.length() > str2.length() || str2.length() <= 0) {
            return false;
        }
        return str2.startsWith(str);
    }

    private static boolean previousBlockIsParagraph(List<TL_iv.PageBlock> list, int i9) {
        if (i9 > 0 && (list.get(i9 - 1) instanceof TL_iv.pageBlockParagraph)) {
            return true;
        }
        return false;
    }

    private ArrayList<QuoteBackground> quotesFor(int i9) {
        ArrayList<QuoteBackground> arrayList = new ArrayList<>();
        if (i9 >= 0) {
            ArrayList<QuoteBackground> arrayList2 = this.quotes;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                QuoteBackground quoteBackground = arrayList2.get(i10);
                i10++;
                QuoteBackground quoteBackground2 = quoteBackground;
                if (i9 >= quoteBackground2.startBlockIndex && i9 <= quoteBackground2.endBlockIndex) {
                    arrayList.add(quoteBackground2);
                }
            }
            Collections.sort(arrayList, new q(27));
        }
        return arrayList;
    }

    private static boolean sameQuotes(ArrayList<QuoteBackground> arrayList, ArrayList<QuoteBackground> arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (arrayList.get(i9) != arrayList2.get(i9)) {
                return false;
            }
        }
        return true;
    }

    private boolean scrollToPageBlockAnchor(int i9) {
        RecyclerView recyclerView;
        if (this.cell == null || i9 < 0 || i9 >= this.blocks.size()) {
            return false;
        }
        ViewParent parent = this.cell.getParent();
        while (true) {
            if (parent != null) {
                if (parent instanceof RecyclerView) {
                    recyclerView = (RecyclerView) parent;
                    break;
                }
                parent = parent.getParent();
            } else {
                recyclerView = null;
                break;
            }
        }
        if (recyclerView == null) {
            return false;
        }
        recyclerView.v0(0, (((this.cell.getTop() + this.cell.f25486n0) + getBlockTop(i9, null)) - recyclerView.getPaddingTop()) - AndroidUtilities.dp(8.0f), null);
        return true;
    }

    public static int setBlockFlags(int i9, int i10) {
        if (i10 == 0) {
            return i9;
        }
        return (i9 & (-16)) | i10;
    }

    private void setBubblePaddings(int i9, int i10) {
        if (this.padLeft != i9 || this.padRight != i10) {
            this.padLeft = i9;
            this.padRight = i10;
            for (int i11 = 0; i11 < this.blocks.size(); i11++) {
                RichBlock richBlock = this.blocks.get(i11);
                if (richBlock instanceof RichDetailsBlock) {
                    ((RichDetailsBlock) richBlock).updateBubbleInsets();
                }
            }
        }
    }

    private void setSpansWithoutClash(Object obj, final SpannableStringBuilder spannableStringBuilder, int i9, int i10) {
        if (obj instanceof StyleSpan) {
            StyleSpan styleSpan = (StyleSpan) obj;
            StyleSpan[] styleSpanArr = (StyleSpan[]) spannableStringBuilder.getSpans(i9, i10, StyleSpan.class);
            if (styleSpanArr != null && styleSpanArr.length > 0) {
                Arrays.sort(styleSpanArr, Comparator$CC.comparingInt(new ToIntFunction() {
                    @Override
                    public final int applyAsInt(Object obj2) {
                        return spannableStringBuilder.getSpanStart((RichMessageLayout.StyleSpan) obj2);
                    }
                }));
                for (int i11 = 0; i11 < styleSpanArr.length; i11++) {
                    int spanStart = spannableStringBuilder.getSpanStart(styleSpanArr[i11]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(styleSpanArr[i11]);
                    if (spanStart > i9) {
                        setStyleRange(spannableStringBuilder, i9, spanStart, styleSpan.flags);
                    }
                    i9 = Math.max(i9, spanEnd);
                }
                if (i9 < i10) {
                    setStyleRange(spannableStringBuilder, i9, i10, styleSpan.flags);
                    return;
                }
                return;
            }
            setStyleRange(spannableStringBuilder, i9, i10, styleSpan.flags);
            return;
        }
        spannableStringBuilder.setSpan(obj, i9, i10, 33);
    }

    private void setStyleRange(SpannableStringBuilder spannableStringBuilder, int i9, int i10, int i11) {
        boolean z10;
        while (i9 < i10) {
            int nextSpanTransition = spannableStringBuilder.nextSpanTransition(i9, i10, URLSpan.class);
            if (((URLSpan[]) spannableStringBuilder.getSpans(i9, nextSpanTransition, URLSpan.class)).length > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            spannableStringBuilder.setSpan(new StyleSpan(this, i11, z10), i9, nextSpanTransition, 33);
            i9 = nextSpanTransition;
        }
    }

    private boolean showFootnoteSheet(TL_iv.textAnchor textanchor) {
        Context context;
        TL_iv.RichText richText;
        String lowerCase;
        int i9;
        View view = this.view;
        if (view == null || (context = view.getContext()) == null || (richText = textanchor.text) == null || (richText instanceof TL_iv.textEmpty)) {
            return false;
        }
        String str = textanchor.name;
        if (str == null) {
            lowerCase = "";
        } else {
            lowerCase = str.toLowerCase();
        }
        CharSequence formatText = formatText(org.telegram.ui.web.d2.d(textanchor.text, "", lowerCase));
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, this.resourcesProvider, true, false);
        f3Var.fixNavigationBar();
        f3Var.applyTopPadding = false;
        f3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView g10 = l0.g(context, 1, 16.0f);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setText(LocaleController.getString(R.string.InstantViewReference));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        g10.setGravity(i9 | 16);
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        g10.setTextColor(getThemedColor(i10));
        g10.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        linearLayout.addView(g10, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f)));
        l80 l80Var = new l80(context, this.resourcesProvider);
        l80Var.setTextSize(1, SharedConfig.fontSize);
        l80Var.setTextColor(getThemedColor(i10));
        l80Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23126k5));
        l80Var.setMovementMethod(LinkMovementMethod.getInstance());
        l80Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(16.0f));
        l80Var.setText(formatText);
        linearLayout.addView(l80Var, new LinearLayout.LayoutParams(-1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout, g7.e6.c(-2.0f, -1));
        f3Var.customView = frameLayout;
        f3Var.show();
        return true;
    }

    private void syncLists(StringBuilder sb2, ArrayList<Boolean> arrayList, int i9, boolean z10) {
        String str;
        String str2;
        while (true) {
            str = "</ul>";
            if (arrayList.size() <= i9) {
                break;
            }
            if (((Boolean) e2.c.k(1, arrayList)).booleanValue()) {
                str = "</ol>";
            }
            sb2.append(str);
        }
        while (true) {
            str2 = "<ul>";
            if (arrayList.size() >= i9) {
                break;
            }
            if (z10) {
                str2 = "<ol>";
            }
            sb2.append(str2);
            arrayList.add(Boolean.valueOf(z10));
        }
        if (!arrayList.isEmpty() && ((Boolean) j3.r0.j(1, arrayList)).booleanValue() != z10) {
            if (((Boolean) e2.c.k(1, arrayList)).booleanValue()) {
                str = "</ol>";
            }
            sb2.append(str);
            if (z10) {
                str2 = "<ol>";
            }
            sb2.append(str2);
            arrayList.add(Boolean.valueOf(z10));
        }
    }

    private void syncQuotes(StringBuilder sb2, ArrayList<QuoteBackground> arrayList, ArrayList<QuoteBackground> arrayList2) {
        int i9 = 0;
        while (i9 < arrayList.size() && i9 < arrayList2.size() && arrayList.get(i9) == arrayList2.get(i9)) {
            i9++;
        }
        while (arrayList.size() > i9) {
            sb2.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        while (arrayList.size() < arrayList2.size()) {
            sb2.append("<blockquote>");
            arrayList.add(arrayList2.get(arrayList.size()));
        }
    }

    private SpannableStringBuilder toRichHtmlSpannable(CharSequence charSequence) {
        StyleSpan[] styleSpanArr;
        int textStyleFlags;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (StyleSpan styleSpan : (StyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(styleSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(styleSpan);
            if (spanEnd > spanStart && (textStyleFlags = toTextStyleFlags(styleSpan.flags)) != 0) {
                ?? obj = new Object();
                obj.f34062a = textStyleFlags;
                spannableStringBuilder.setSpan(new wz0(obj, 0), spanStart, spanEnd, 33);
            }
        }
        return spannableStringBuilder;
    }

    private static int toTextStyleFlags(int i9) {
        int i10;
        if ((i9 & 16) != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if ((i9 & 32) != 0) {
            i10 |= 2;
        }
        if ((i9 & 64) != 0) {
            i10 |= 16;
        }
        if ((i9 & 128) != 0) {
            i10 |= 8;
        }
        if ((i9 & 256) != 0) {
            i10 |= 4;
        }
        if ((i9 & 2048) != 0) {
            i10 |= 16384;
        }
        if ((i9 & 4096) != 0) {
            i10 |= 32768;
        }
        if ((i9 & 8192) != 0) {
            return 65536 | i10;
        }
        return i10;
    }

    private void updateTranslationLoading() {
        float f10;
        View view;
        boolean isTranslating = isTranslating();
        if (!isTranslating && this.translationLoadingFloat == null) {
            this.translationLoadingValue = 0.0f;
            return;
        }
        if (this.translationLoadingFloat == null) {
            this.translationLoadingFloat = new org.telegram.ui.Components.y5(0L, 350L, gr.h);
        }
        org.telegram.ui.Components.y5 y5Var = this.translationLoadingFloat;
        if (isTranslating) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = y5Var.d(f10, false);
        this.translationLoadingValue = d;
        if (d > 0.0f && (view = this.view) != null) {
            view.invalidate();
        }
    }

    public void attach(View view) {
        View view2 = this.view;
        if (view != view2) {
            if (view2 != null) {
                detach(view2);
            }
            this.view = view;
            for (int i9 = 0; i9 < this.blocks.size(); i9++) {
                this.blocks.get(i9).attach(view);
            }
        }
    }

    public void checkQuoteLine(TLRPC.User user, TLRPC.Chat chat) {
        boolean q10;
        this.quoteLine.a(this.messageObject, user, chat, this.resourcesProvider, 1);
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && !messageObject.isOutOwner() && !this.messageObject.shouldDrawWithoutBackground() && !hasCustomIncomingQuoteColor(user, chat)) {
            org.telegram.ui.ActionBar.b6 b6Var = this.resourcesProvider;
            if (b6Var != null) {
                q10 = b6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.f6.I.q();
            }
            this.quoteLine.q(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.resourcesProvider), q10);
        }
    }

    public void collectMediaBlocks(List<TL_iv.PageBlock> list) {
        for (int i9 = 0; i9 < this.blocks.size(); i9++) {
            RichBlock richBlock = this.blocks.get(i9);
            if (richBlock instanceof RichPhotoBlock) {
                list.add(((RichPhotoBlock) richBlock).block);
            } else if (richBlock instanceof RichVideoBlock) {
                list.add(((RichVideoBlock) richBlock).block);
            } else if (richBlock instanceof RichCollageBlock) {
                ArrayList<MediaCell> arrayList = ((RichCollageBlock) richBlock).cells;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    MediaCell mediaCell = arrayList.get(i10);
                    i10++;
                    list.add(mediaCell.pageBlock);
                }
            } else if (richBlock instanceof RichSlideshowBlock) {
                ArrayList<MediaCell> arrayList2 = ((RichSlideshowBlock) richBlock).cells;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    MediaCell mediaCell2 = arrayList2.get(i11);
                    i11++;
                    list.add(mediaCell2.pageBlock);
                }
            }
        }
    }

    public void detach(View view) {
        View view2 = this.view;
        if (view2 == view && view2 != null) {
            dh.k kVar = this.spoilerEffect2;
            if (kVar != null) {
                kVar.b(view);
                this.spoilerEffect2 = null;
            }
            this.view = null;
            for (int i9 = 0; i9 < this.blocks.size(); i9++) {
                this.blocks.get(i9).detach(view);
            }
            if (view == this.cell) {
                this.cell = null;
                this.delegate = null;
            }
        }
    }

    public void draw(Canvas canvas, int i9, int i10, org.telegram.ui.Cells.s1 s1Var) {
        Canvas canvas2;
        setBubblePaddings(i9, i10);
        this.textPaint.linkColor = getThemedColor(isOut() ? org.telegram.ui.ActionBar.f6.f23079hc : org.telegram.ui.ActionBar.f6.f23061gc);
        boolean z10 = this.isPart;
        int min = Math.min(this.height, AndroidUtilities.dp(900.0f));
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(-i9, 0.0f, getMinWidth() + i10, min, 255, 31);
        } else {
            canvas2 = canvas;
        }
        drawInternal(canvas2, s1Var);
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(-i9, min - AndroidUtilities.dp(32.0f), getMinWidth() + i10, min);
            this.clip.b(canvas2, rectF, 3, 1.0f);
            canvas2.restore();
            drawShowMoreButton(canvas2, min);
        }
    }

    public boolean drawOverlay(Canvas canvas) {
        return drawOverlay(canvas, null);
    }

    public FoundLink findLink(CharacterStyle characterStyle) {
        if (characterStyle == null) {
            return null;
        }
        FoundLink foundLink = new FoundLink();
        boolean z10 = false;
        int i9 = 0;
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock.isVisible()) {
                if (z10) {
                    i9 += getGap();
                }
                if (richBlock.findLink(characterStyle, i9, foundLink)) {
                    return foundLink;
                }
                i9 = richBlock.getHeight() + i9;
                z10 = true;
            }
        }
        return null;
    }

    public ImageReceiver findMediaImageReceiver(TL_iv.PageBlock pageBlock, int[] iArr) {
        ImageReceiver imageReceiver;
        TL_iv.PageBlock pageBlock2;
        ImageReceiver imageReceiver2;
        int i9 = 0;
        while (true) {
            TL_iv.PageBlock pageBlock3 = null;
            if (i9 >= this.blocks.size()) {
                return null;
            }
            RichBlock richBlock = this.blocks.get(i9);
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
                    ArrayList<MediaCell> arrayList = ((RichCollageBlock) richBlock).cells;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        MediaCell mediaCell = arrayList.get(i10);
                        i10++;
                        MediaCell mediaCell2 = mediaCell;
                        if (mediaCell2.pageBlock == pageBlock) {
                            if (iArr != null && iArr.length >= 2) {
                                Rect rect = richBlock.padding;
                                iArr[0] = rect.left;
                                iArr[1] = richBlock.layoutY + rect.top;
                            }
                            return mediaCell2.imageReceiver;
                        }
                    }
                    continue;
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
                i9++;
            }
            TL_iv.PageBlock pageBlock4 = pageBlock2;
            imageReceiver = imageReceiver2;
            pageBlock3 = pageBlock4;
            if (pageBlock3 == pageBlock) {
                if (iArr != null) {
                    Rect rect32 = richBlock.padding;
                    iArr[0] = rect32.left;
                    iArr[1] = richBlock.layoutY + rect32.top;
                }
                return imageReceiver;
            }
            continue;
            i9++;
        }
    }

    public boolean forceNewLineForTime() {
        if (this.blocks.isEmpty() || this.isPart || isRtl()) {
            return true;
        }
        if (!this.quotes.isEmpty()) {
            ArrayList<QuoteBackground> arrayList = this.quotes;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                QuoteBackground quoteBackground = arrayList.get(i9);
                i9++;
                if (quoteBackground.endBlockIndex >= this.blocks.size() - 1) {
                    return true;
                }
            }
        }
        return ((RichBlock) j3.r0.j(1, this.blocks)).forcesTimeToNewLine();
    }

    public CharSequence formatText(TL_iv.RichText richText) {
        return formatText(richText, new SpannableStringBuilder(), 0);
    }

    public List<cj0> getAnimatorBlocks() {
        ArrayList arrayList = new ArrayList(this.blocks.size());
        for (int i9 = 0; i9 < this.blocks.size(); i9++) {
            this.blocks.get(i9).collectAnimatorBlocks(arrayList);
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((cj0) arrayList.get(i10)).getClass();
        }
        return arrayList;
    }

    public org.telegram.ui.Cells.t1 getCell() {
        return this.cell;
    }

    public org.telegram.ui.Cells.k1 getDelegate() {
        return this.delegate;
    }

    public TLRPC.Document getDocument(long j10) {
        TL_iv.RichMessage richMessage = this.richMessage;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Document> arrayList = richMessage.documents;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.Document document = arrayList.get(i9);
            i9++;
            TLRPC.Document document2 = document;
            if (document2.f22386id == j10) {
                return document2;
            }
        }
        return null;
    }

    public int getGap() {
        return 0;
    }

    public int getHeight() {
        int i9;
        if (this.isPart && this.height > AndroidUtilities.dp(900.0f)) {
            return AndroidUtilities.dp(950.0f);
        }
        int i10 = this.height;
        if (this.isPart) {
            i9 = AndroidUtilities.dp(50.0f);
        } else {
            i9 = 0;
        }
        return i10 + i9;
    }

    public int getLastLineWidth() {
        if (!this.blocks.isEmpty() && !this.isPart && !isRtl()) {
            if (!this.quotes.isEmpty()) {
                ArrayList<QuoteBackground> arrayList = this.quotes;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    QuoteBackground quoteBackground = arrayList.get(i9);
                    i9++;
                    if (quoteBackground.endBlockIndex >= this.blocks.size() - 1) {
                        return getMinWidth();
                    }
                }
            }
            RichBlock richBlock = (RichBlock) j3.r0.j(1, this.blocks);
            if (richBlock.forcesTimeToNewLine()) {
                return getMinWidth();
            }
            return richBlock.getLastLineWidth();
        }
        return getMinWidth();
    }

    public dh.k getMediaSpoilerEffect() {
        View view = this.view;
        if (view == null) {
            return null;
        }
        dh.k kVar = this.spoilerEffect2;
        if (kVar != null && kVar.f4608i) {
            this.spoilerEffect2 = null;
        }
        if (this.spoilerEffect2 == null) {
            this.spoilerEffect2 = dh.k.e(view);
        }
        return this.spoilerEffect2;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    public TLRPC.Photo getPhoto(long j10) {
        TL_iv.RichMessage richMessage = this.richMessage;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.Photo photo = arrayList.get(i9);
            i9++;
            TLRPC.Photo photo2 = photo;
            if (photo2.f22404id == j10) {
                return photo2;
            }
        }
        return null;
    }

    public String getSelectionHtml(int i9, int i10) {
        int min;
        int max;
        int i11;
        int i12;
        RichBlock richBlock;
        int i13;
        boolean z10;
        int i14;
        RichMessageLayout richMessageLayout = this;
        if (richMessageLayout.textBlocks.isEmpty() || (max = Math.max(i9, i10)) <= (min = Math.min(i9, i10))) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList<QuoteBackground> arrayList = new ArrayList<>();
        ArrayList<Boolean> arrayList2 = new ArrayList<>();
        int i15 = -1;
        for (int i16 = 0; i16 < richMessageLayout.textBlocks.size(); i16++) {
            Layout layout = richMessageLayout.textBlocks.get(i16).getLayout();
            if (layout != null && layout.getText() != null) {
                CharSequence text = layout.getText();
                if (i16 < richMessageLayout.textBlockCharOffsets.size()) {
                    i11 = richMessageLayout.textBlockCharOffsets.get(i16).intValue();
                } else {
                    i11 = 0;
                }
                int max2 = Math.max(min, i11);
                int min2 = Math.min(max, text.length() + i11);
                if (min2 > max2) {
                    if (i16 < richMessageLayout.textBlockBlockIndex.size()) {
                        i12 = richMessageLayout.textBlockBlockIndex.get(i16).intValue();
                    } else {
                        i12 = -1;
                    }
                    if (i12 >= 0 && i12 < richMessageLayout.blocks.size()) {
                        richBlock = richMessageLayout.blocks.get(i12);
                    } else {
                        richBlock = null;
                    }
                    String str = "";
                    if (richBlock instanceof RichTableBlock) {
                        if (i12 != i15) {
                            richMessageLayout.closeLists(sb2, arrayList2);
                            richMessageLayout.syncQuotes(sb2, arrayList, richMessageLayout.quotesFor(i12));
                            TL_iv.pageBlockTable pageblocktable = ((RichTableBlock) richBlock).pageBlock;
                            if (pageblocktable != null) {
                                StringBuilder sb3 = new StringBuilder();
                                qh.u3.H(sb3, pageblocktable);
                                str = sb3.toString();
                            }
                            sb2.append(str);
                            i15 = i12;
                        }
                    } else {
                        ArrayList<QuoteBackground> quotesFor = richMessageLayout.quotesFor(i12);
                        if (!sameQuotes(arrayList, quotesFor)) {
                            richMessageLayout.closeLists(sb2, arrayList2);
                            richMessageLayout.syncQuotes(sb2, arrayList, quotesFor);
                        }
                        int i17 = max2 - i11;
                        int i18 = min2 - i11;
                        if (richBlock instanceof RichTextBlock) {
                            i13 = ((RichTextBlock) richBlock).quoteAuthorStart;
                        } else {
                            i13 = -1;
                        }
                        if ((richBlock instanceof RichTextWithAuthorBlock) && ((RichTextWithAuthorBlock) richBlock).author == richMessageLayout.textBlocks.get(i16)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (richBlock != null) {
                            i14 = richBlock.listLevel;
                        } else {
                            i14 = 0;
                        }
                        if (i14 > 0 && i13 < 0) {
                            richMessageLayout.syncLists(sb2, arrayList2, i14, richBlock.listOrdered);
                            sb2.append("<li");
                            if (richBlock.listCheckbox) {
                                sb2.append(" data-checkbox=\"1\"");
                                if (richBlock.listChecked) {
                                    sb2.append(" data-checked=\"1\"");
                                }
                            }
                            sb2.append('>');
                            SpannableStringBuilder richHtmlSpannable = richMessageLayout.toRichHtmlSpannable(text.subSequence(i17, i18));
                            StringBuilder sb4 = new StringBuilder();
                            qh.u3.g(sb4, richHtmlSpannable);
                            sb2.append(sb4.toString());
                            sb2.append("</li>");
                        } else {
                            richMessageLayout.closeLists(sb2, arrayList2);
                            if (richBlock instanceof RichPreformattedBlock) {
                                SpannableStringBuilder richHtmlSpannable2 = richMessageLayout.toRichHtmlSpannable(text.subSequence(i17, i18));
                                String str2 = ((RichPreformattedBlock) richBlock).language;
                                StringBuilder sb5 = new StringBuilder();
                                qh.u3.g(sb5, richHtmlSpannable2);
                                String sb6 = sb5.toString();
                                if (!sb6.isEmpty()) {
                                    StringBuilder sb7 = new StringBuilder();
                                    if (!TextUtils.isEmpty(str2)) {
                                        sb7.append("<pre language=\"");
                                        sb7.append(qh.u3.s(str2));
                                        sb7.append("\">");
                                    } else {
                                        sb7.append("<pre>");
                                    }
                                    str = aa.d.r(sb7, sb6, "</pre>");
                                }
                                sb2.append(str);
                            } else if (z10) {
                                richMessageLayout.appendSelectionPiece(sb2, text, i17, i18, true);
                                richMessageLayout = this;
                            } else if (i13 < 0) {
                                richMessageLayout = this;
                                richMessageLayout.appendSelectionPiece(sb2, text, i17, i18, false);
                            } else {
                                int min3 = Math.min(i18, i13 > 0 ? i13 - 1 : 0);
                                richMessageLayout = this;
                                richMessageLayout.appendSelectionPiece(sb2, text, i17, min3, false);
                                richMessageLayout.appendSelectionPiece(sb2, text, Math.max(i17, i13), i18, true);
                            }
                        }
                    }
                }
            }
        }
        richMessageLayout.closeLists(sb2, arrayList2);
        while (!arrayList.isEmpty()) {
            sb2.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    public ArrayList<RichUnsupportedBlock> getUnsupportedHoles() {
        return this.unsupportedBlocks;
    }

    public ArrayList<RichUnsupportedBlock> getUnsupportedHolesRoot() {
        return this.unsupportedBlocksRoot;
    }

    public boolean hasNameOffset() {
        org.telegram.ui.Cells.t1 t1Var = this.cell;
        if (t1Var != null && t1Var.Hc > 0) {
            return true;
        }
        return false;
    }

    public boolean hasOverlay() {
        org.telegram.ui.Components.p5 p5Var;
        if (!isOverlayActive()) {
            return false;
        }
        for (int i9 = 0; i9 < this.textBlocks.size(); i9++) {
            org.telegram.ui.Cells.y9 y9Var = this.textBlocks.get(i9);
            if ((y9Var instanceof Text) && (p5Var = ((Text) y9Var).animatedEmojiStack) != null && !p5Var.f31544a.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasRootUnsupportedBlocks() {
        return !this.unsupportedBlocksRoot.isEmpty();
    }

    public boolean hasUnsupportedBlocks() {
        return !this.unsupportedBlocks.isEmpty();
    }

    public boolean isAttached() {
        if (this.view != null) {
            return true;
        }
        return false;
    }

    public boolean isHorizontallyDragging() {
        RichBlock richBlock = this.pressedBlock;
        if (richBlock != null && richBlock.isHorizontallyDragging()) {
            return true;
        }
        return false;
    }

    public boolean isOut() {
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && messageObject.isOutOwner()) {
            return true;
        }
        return false;
    }

    public boolean isOverlayActive() {
        ej0 ej0Var = this.typingAnimator;
        if (ej0Var != null && ej0Var.h) {
            return false;
        }
        return true;
    }

    public boolean isPinnedTop() {
        org.telegram.ui.Cells.t1 t1Var = this.cell;
        if (t1Var != null && t1Var.n3()) {
            return true;
        }
        return false;
    }

    public boolean isPressingLink() {
        RichBlock richBlock = this.pressedBlock;
        if (richBlock != null && richBlock.isPressingLink()) {
            return true;
        }
        return false;
    }

    public boolean isRtl() {
        TL_iv.RichMessage richMessage = this.richMessage;
        if (richMessage != null && richMessage.rtl) {
            return true;
        }
        return false;
    }

    public boolean isTranslating() {
        if (!this.forceTranslationLoading) {
            if (this.messageObject == null || !MessagesController.getInstance(this.currentAccount).getTranslateController().isTranslating(this.messageObject)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void layout(RichMessageLayout richMessageLayout) {
        boolean z10;
        int i9;
        int i10;
        this.height = 0;
        this.minWidth = 0;
        View view = this.view;
        if (view != null) {
            for (int i11 = 0; i11 < this.blocks.size(); i11++) {
                this.blocks.get(i11).detach(view);
            }
        }
        this.unsupportedBlocks.clear();
        this.unsupportedBlocksRoot.clear();
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
        if (messageObject != null && messageObject.messageOwner != null && messageObject.getDisplayRichMessage() != null) {
            TL_iv.RichMessage displayRichMessage = this.messageObject.getDisplayRichMessage();
            this.richMessage = displayRichMessage;
            this.isPart = displayRichMessage.part;
            this.prev = richMessageLayout;
            for (int i12 = 0; i12 < this.richMessage.blocks.size(); i12++) {
                TL_iv.PageBlock pageBlock = this.richMessage.blocks.get(i12);
                RichBlock emitBlock = emitBlock(pageBlock, 0, new Rect(), 0, previousBlockIsParagraph(this.richMessage.blocks, i12));
                if ((emitBlock instanceof RichTextBlock) && (((z10 = pageBlock instanceof TL_iv.pageBlockParagraph)) || org.telegram.ui.l4.K(pageBlock))) {
                    RichTextBlock richTextBlock = (RichTextBlock) emitBlock;
                    if (i12 == 0 && z10) {
                        i9 = 0;
                    } else {
                        i9 = richTextBlock.contentPaddingTop;
                    }
                    if (i12 == this.richMessage.blocks.size() - 1) {
                        i10 = 0;
                    } else {
                        i10 = richTextBlock.contentPaddingBottom;
                    }
                    richTextBlock.setContentPadding(i9, i10);
                }
            }
            applyListPaddingFromBlocks();
            this.prev = null;
            if (this.typingAnimator != null) {
                for (int i13 = 0; i13 < this.blocks.size(); i13++) {
                    this.blocks.get(i13).typingAnimator = this.typingAnimator;
                }
                this.typingAnimator.l(getAnimatorBlocks());
            }
            if (view != null) {
                for (int i14 = 0; i14 < this.blocks.size(); i14++) {
                    this.blocks.get(i14).attach(view);
                }
            }
            reposition();
            snapshotForDetailsAnimation();
        }
    }

    public boolean needsUpdate(TL_iv.RichMessage richMessage, int i9) {
        if (this.richMessage == richMessage && this.fontSize == SharedConfig.fontSize && Math.abs(this.density - AndroidUtilities.density) <= 0.1f && i9 == this.maxWidth) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 || (motionEvent.getX() >= this.padLeft && motionEvent.getX() <= getMinWidth() + this.padRight)) {
            if (this.isPart) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (actionMasked == 0) {
                    if (this.showMoreRect.contains(x10, y10)) {
                        this.showMorePressed = true;
                        org.telegram.ui.Components.pc pcVar = this.showMoreBounce;
                        if (pcVar != null) {
                            pcVar.c(true);
                            return true;
                        }
                        return true;
                    }
                } else if (this.showMorePressed) {
                    if (actionMasked == 2) {
                        if (!this.showMoreRect.contains(x10, y10)) {
                            org.telegram.ui.Components.pc pcVar2 = this.showMoreBounce;
                            if (pcVar2 != null) {
                                pcVar2.c(false);
                            }
                            this.showMorePressed = false;
                            return true;
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        org.telegram.ui.Components.pc pcVar3 = this.showMoreBounce;
                        if (pcVar3 != null) {
                            pcVar3.c(false);
                        }
                        if (actionMasked == 1 && this.showMoreRect.contains(x10, y10)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.showMorePressed = false;
                        if (z10 && this.delegate != null && this.cell != null) {
                            View view = this.view;
                            if (view != null) {
                                view.performHapticFeedback(3, 2);
                            }
                            this.delegate.G0(this.cell);
                        }
                    }
                    return true;
                }
            }
            if (actionMasked == 0) {
                this.pressedBlock = null;
                float y11 = motionEvent.getY();
                int i9 = 0;
                boolean z11 = false;
                int i10 = 0;
                while (true) {
                    if (i9 >= this.blocks.size()) {
                        break;
                    }
                    RichBlock richBlock = this.blocks.get(i9);
                    if (richBlock.isVisible()) {
                        if (z11) {
                            i10 += getGap();
                        }
                        int height = richBlock.getHeight();
                        float f10 = i10;
                        if (y11 >= f10 && y11 < i10 + height) {
                            motionEvent.offsetLocation(0.0f, -i10);
                            boolean z12 = richBlock.touchEvent(motionEvent);
                            motionEvent.offsetLocation(0.0f, f10);
                            if (z12) {
                                this.pressedBlock = richBlock;
                                this.pressedBlockY = i10;
                                return true;
                            }
                        } else {
                            i10 += height;
                            z11 = true;
                        }
                    }
                    i9++;
                }
            } else if (this.pressedBlock != null) {
                motionEvent.offsetLocation(0.0f, -this.pressedBlockY);
                boolean z13 = this.pressedBlock.touchEvent(motionEvent);
                motionEvent.offsetLocation(0.0f, this.pressedBlockY);
                if (actionMasked != 1 && actionMasked != 3) {
                    return z13;
                }
                this.pressedBlock = null;
                return z13;
            }
        }
        return false;
    }

    public void reposition() {
        this.height = 0;
        this.minWidth = 0;
        this.textBlocks.clear();
        this.textBlockCharOffsets.clear();
        this.textBlockBlockIndex.clear();
        for (int i9 = 0; i9 < this.blocks.size(); i9++) {
            this.minWidth = Math.max(this.minWidth, this.blocks.get(i9).getMinWidth());
        }
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock instanceof RichTableBlock) {
                ((RichTableBlock) richBlock).resolveWidth(this.minWidth);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        boolean z10 = false;
        for (int i12 = 0; i12 < this.blocks.size(); i12++) {
            RichBlock richBlock2 = this.blocks.get(i12);
            boolean isVisible = richBlock2.isVisible();
            if (isVisible && z10) {
                i11 += getGap();
            }
            richBlock2.currY = i11;
            richBlock2.currH = 0;
            richBlock2.currVisible = isVisible;
            Rect rect = richBlock2.padding;
            richBlock2.placeTexts(rect.left, rect.top + i11, i12);
            if (isVisible) {
                org.telegram.ui.Cells.y9[] text = richBlock2.getText();
                if (text != null) {
                    for (org.telegram.ui.Cells.y9 y9Var : text) {
                        if (y9Var != null && y9Var.getLayout() != null) {
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            this.textBlockCharOffsets.add(Integer.valueOf(sb2.length()));
                            this.textBlockBlockIndex.add(Integer.valueOf(i12));
                            this.textBlocks.add(y9Var);
                            CharSequence text2 = y9Var.getLayout().getText();
                            if (text2 != null) {
                                sb2.append(text2);
                            }
                        }
                    }
                }
                int height = richBlock2.getHeight();
                richBlock2.currH = height;
                i11 += height;
                z10 = true;
            }
        }
        this.height = i11;
        this.joinedText = sb2;
    }

    public void setChatMessageCellDelegate(org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Cells.k1 k1Var) {
        this.cell = t1Var;
        this.delegate = k1Var;
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.b6 b6Var) {
        this.resourcesProvider = b6Var;
    }

    public boolean setSlideshowPage(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return false;
        }
        for (int i9 = 0; i9 < this.blocks.size(); i9++) {
            RichBlock richBlock = this.blocks.get(i9);
            if (richBlock instanceof RichSlideshowBlock) {
                RichSlideshowBlock richSlideshowBlock = (RichSlideshowBlock) richBlock;
                for (int i10 = 0; i10 < richSlideshowBlock.cells.size(); i10++) {
                    if (richSlideshowBlock.cells.get(i10).pageBlock == pageBlock) {
                        richSlideshowBlock.setCurrentPage(i10);
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public void setTypingAnimator(ej0 ej0Var) {
        this.typingAnimator = ej0Var;
        for (int i9 = 0; i9 < this.blocks.size(); i9++) {
            this.blocks.get(i9).typingAnimator = ej0Var;
            this.blocks.get(i9);
            this.blocks.get(i9).getClass();
        }
    }

    public void snapshotForBlockquoteAnimation() {
        snapshotForDetailsAnimation();
    }

    public void snapshotForDetailsAnimation() {
        for (int i9 = 0; i9 < this.blocks.size(); i9++) {
            this.blocks.get(i9).snapshot();
        }
    }

    public boolean startsWithMedia() {
        if (this.blocks.isEmpty()) {
            return false;
        }
        RichBlock richBlock = this.blocks.get(0);
        if (!(richBlock instanceof RichPhotoBlock) && !(richBlock instanceof RichVideoBlock) && !(richBlock instanceof RichCollageBlock) && !(richBlock instanceof RichSlideshowBlock)) {
            return false;
        }
        return true;
    }

    public void updateAnimatedEmojis(int i9) {
        for (int i10 = 0; i10 < this.textBlocks.size(); i10++) {
            org.telegram.ui.Cells.y9 y9Var = this.textBlocks.get(i10);
            if (y9Var instanceof Text) {
                ((Text) y9Var).refreshAnimatedEmoji(i9);
            }
        }
    }

    public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
        if (isOverlayActive()) {
            boolean z10 = false;
            for (int i9 = 0; i9 < this.blocks.size(); i9++) {
                RichBlock richBlock = this.blocks.get(i9);
                if (richBlock.currVisible) {
                    canvas.save();
                    canvas.translate(0.0f, richBlock.currY);
                    if (richBlock.drawOverlay(canvas, colorFilter)) {
                        z10 = true;
                    }
                    canvas.restore();
                }
            }
            return z10;
        }
        return false;
    }

    public CharSequence formatText(TL_iv.RichText richText, int i9) {
        if (i9 == 0) {
            return formatText(richText, new SpannableStringBuilder(), 0);
        }
        return formatTextAndSetSpan(richText, new SpannableStringBuilder(), i9, new StyleSpan(this, i9));
    }

    public static class RichUnsupportedBlock extends RichBlock implements Drawable.Callback {
        public final int index;
        public final int level;
        public Bitmap tornBitmap;
        public c21 tornParams;
        public final l51 unsupportedBlockDrawable;
        public final int unsupportedBlockHeight;
        public final int unsupportedBlockWidth;

        public RichUnsupportedBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, int i10, int i11) {
            super(richMessageLayout, rect, i9);
            this.index = i10;
            this.level = i11;
            org.telegram.ui.ActionBar.b6 b6Var = richMessageLayout.resourcesProvider;
            l51 l51Var = new l51();
            this.unsupportedBlockDrawable = l51Var;
            l51Var.setCallback(this);
            l51Var.f30372n = LocaleController.getString(R.string.UnsupportedBlockTitle);
            l51Var.f30373o = LocaleController.getString(R.string.UnsupportedBlockMessage);
            l51Var.f30374p = LocaleController.getString(R.string.UnsupportedUpdate);
            l51Var.f30368j = new ng(richMessageLayout, 9);
            int i12 = this.maxWidth;
            this.unsupportedBlockWidth = i12;
            this.unsupportedBlockHeight = l51Var.a(i12);
        }

        public static void lambda$new$0(RichMessageLayout richMessageLayout) {
            if (richMessageLayout.delegate != null) {
                richMessageLayout.delegate.m();
            }
        }

        @Override
        public void draw(Canvas canvas) {
            l51 l51Var = this.unsupportedBlockDrawable;
            Rect rect = this.padding;
            int i9 = rect.left;
            int i10 = rect.top;
            l51Var.setBounds(i9, i10, this.unsupportedBlockWidth + i9, this.unsupportedBlockHeight + i10);
            this.unsupportedBlockDrawable.draw(canvas);
        }

        public float getHeight(org.telegram.ui.Cells.s1 s1Var) {
            int i9;
            if (s1Var != null) {
                RichMessageLayout richMessageLayout = this.root;
                if (richMessageLayout.detailsAnimating || richMessageLayout.blockquoteAnimating) {
                    i9 = AndroidUtilities.lerp(this.prevH, this.currH, Math.max(0.0f, Math.min(1.0f, s1Var.K1)));
                    return i9;
                }
            }
            i9 = this.currH;
            return i9;
        }

        public float getY(org.telegram.ui.Cells.s1 s1Var) {
            if (s1Var != null) {
                RichMessageLayout richMessageLayout = this.root;
                if (richMessageLayout.detailsAnimating || richMessageLayout.blockquoteAnimating) {
                    return AndroidUtilities.lerp(this.prevY, this.currY, Math.max(0.0f, Math.min(1.0f, s1Var.K1)));
                }
            }
            return this.currY;
        }

        @Override
        public void invalidateDrawable(Drawable drawable) {
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            View view = this.view;
            if (view != null) {
                return this.unsupportedBlockDrawable.f30367i.a(motionEvent, view);
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public int getHeight() {
            Rect rect = this.padding;
            return rect.top + this.unsupportedBlockHeight + rect.bottom;
        }

        @Override
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        @Override
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        }
    }

    public static void getString(TL_iv.RichText richText, StringBuilder sb2) {
        if (richText instanceof TL_iv.textPlain) {
            sb2.append(((TL_iv.textPlain) richText).text);
        } else if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            if (!qh.u5.j(textdiff.text)) {
                getString(textdiff.text, sb2);
            } else if (!qh.u5.j(textdiff.old_text)) {
                getString(textdiff.old_text, sb2);
            }
        } else if (richText instanceof TL_iv.textConcat) {
            for (int i9 = 0; i9 < richText.texts.size(); i9++) {
                getString(richText.texts.get(i9), sb2);
            }
        } else {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                getString(richText2, sb2);
            }
        }
    }

    public CharSequence formatText(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i9) {
        Object size;
        if (richText instanceof TL_iv.textEmpty) {
            return spannableStringBuilder;
        }
        if (richText instanceof TL_iv.textPlain) {
            spannableStringBuilder.append(((TL_iv.textPlain) richText).text);
            return spannableStringBuilder;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            boolean j10 = qh.u5.j(textdiff.text);
            boolean j11 = qh.u5.j(textdiff.old_text);
            if (j10 && !j11) {
                formatTextAndSetSpan(textdiff.old_text, spannableStringBuilder, i9, new wz0(getTextStyleRun(8192), 0));
                return spannableStringBuilder;
            } else if (!j10 && j11) {
                formatTextAndSetSpan(textdiff.text, spannableStringBuilder, i9, new wz0(getTextStyleRun(4096), 0));
                return spannableStringBuilder;
            } else if (!j10) {
                formatTextAndSetSpan(textdiff.text, spannableStringBuilder, i9, new jv0());
                return spannableStringBuilder;
            }
        } else if (richText instanceof TL_iv.textBold) {
            int i10 = i9 | 16;
            formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new StyleSpan(this, i10));
            return spannableStringBuilder;
        } else if (richText instanceof TL_iv.textItalic) {
            int i11 = i9 | 32;
            formatTextAndSetSpan(richText.text, spannableStringBuilder, i11, new StyleSpan(this, i11));
            return spannableStringBuilder;
        } else if (richText instanceof TL_iv.textUnderline) {
            int i12 = i9 | 64;
            formatTextAndSetSpan(richText.text, spannableStringBuilder, i12, new StyleSpan(this, i12));
            return spannableStringBuilder;
        } else if (richText instanceof TL_iv.textStrike) {
            int i13 = i9 | 128;
            formatTextAndSetSpan(richText.text, spannableStringBuilder, i13, new StyleSpan(this, i13));
            return spannableStringBuilder;
        } else if (richText instanceof TL_iv.textFixed) {
            int i14 = i9 | 256;
            formatTextAndSetSpan(richText.text, spannableStringBuilder, i14, new StyleSpan(this, i14));
            return spannableStringBuilder;
        } else if (richText instanceof TL_iv.textUrl) {
            formatTextAndSetSpan(richText.text, spannableStringBuilder, i9, new r41(((TL_iv.textUrl) richText).url, getTextStyleRun(1024)));
            return spannableStringBuilder;
        } else if (richText instanceof TL_iv.textEmail) {
            TL_iv.RichText richText2 = richText.text;
            formatTextAndSetSpan(richText2, spannableStringBuilder, i9, new r41("mailto:" + ((TL_iv.textEmail) richText).email, getTextStyleRun(1024)));
            return spannableStringBuilder;
        } else if (richText instanceof TL_iv.textConcat) {
            for (int i15 = 0; i15 < richText.texts.size(); i15++) {
                formatText(richText.texts.get(i15), spannableStringBuilder, i9);
            }
        } else if (richText instanceof TL_iv.textSubscript) {
            int i16 = i9 | 2048;
            formatTextAndSetSpan(richText.text, spannableStringBuilder, i16, new StyleSpan(this, i16));
            return spannableStringBuilder;
        } else if (richText instanceof TL_iv.textSuperscript) {
            int i17 = i9 | 4096;
            formatTextAndSetSpan(richText.text, spannableStringBuilder, i17, new StyleSpan(this, i17));
            return spannableStringBuilder;
        } else if (richText instanceof TL_iv.textMarked) {
            int i18 = i9 | 8192;
            formatTextAndSetSpan(richText.text, spannableStringBuilder, i18, new StyleSpan(this, i18));
            return spannableStringBuilder;
        } else if (richText instanceof TL_iv.textPhone) {
            TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
            String d = ne.b.d(textphone.phone, false);
            if (textphone.phone.startsWith("+")) {
                d = ta.b.d("+", d);
            }
            formatTextAndSetSpan(richText.text, spannableStringBuilder, i9, new r41(ta.b.d("tel:", d), getTextStyleRun(1024)));
            return spannableStringBuilder;
        } else {
            if (richText instanceof TL_iv.textAnchor) {
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
                TL_iv.RichText richText3 = richText.text;
                String str2 = textanchor.name;
                formatTextAndSetSpan(richText3, spannableStringBuilder, i9, new AnchorSpan(str2 != null ? str2.toLowerCase() : ""));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textMath) {
                TL_iv.textMath textmath = (TL_iv.textMath) richText;
                if (textmath.bitmap == null && !textmath.tried) {
                    textmath.tried = true;
                    qh.q a2 = qh.q.a(textmath.source, AndroidUtilities.dp(this.fontSize + 4), true);
                    if (a2 != null) {
                        textmath.f22605w = a2.f46619b;
                        textmath.h = a2.f46620c;
                        textmath.depth = a2.d;
                        textmath.bitmap = a2.f46618a;
                    }
                }
                if (textmath.bitmap == null) {
                    String str3 = textmath.source;
                    return str3 == null ? "" : str3;
                }
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(" ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.setSpan(new oz0(null, textmath.bitmap, textmath.f22605w, textmath.h, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.resourcesProvider), textmath.depth), length, length2, 33);
                String str4 = textmath.source;
                if (str4 != null && !str4.isEmpty()) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Cells.t9(textmath.source), length, length2, 33);
                    return spannableStringBuilder;
                }
            } else if (richText instanceof TL_iv.textCustomEmoji) {
                TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
                String str5 = TextUtils.isEmpty(textcustomemoji.alt) ? "😀" : textcustomemoji.alt;
                int length3 = spannableStringBuilder.length();
                spannableStringBuilder.append(str5);
                int length4 = spannableStringBuilder.length();
                boolean a3 = g7.z7.a(i9, 13);
                int i19 = i9 & 15;
                if (i19 >= 1 && i19 <= 6) {
                    TextPaint textPaint = new TextPaint(this.textPaint);
                    new StyleSpan(this, i9, true).applyStyle(textPaint);
                    size = new org.telegram.ui.Components.t5(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                } else {
                    size = new org.telegram.ui.Components.t5(textcustomemoji.document_id, a3 ? 1.0f : 1.2f, (Paint.FontMetricsInt) null).setSize(AndroidUtilities.dp(this.fontSize + 4 + (a3 ? -2 : 4)));
                }
                spannableStringBuilder.setSpan(size, length3, length4, 33);
                return spannableStringBuilder;
            } else if (richText instanceof TL_iv.textSpoiler) {
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i9, new wz0(getTextStyleRun(256), 0));
                return spannableStringBuilder;
            } else if (richText instanceof TL_iv.textMention) {
                TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                ?? obj = new Object();
                obj.d = tL_messageEntityMention;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i9, new p41(getString(richText), (vz0) obj));
                return spannableStringBuilder;
            } else if (richText instanceof TL_iv.textHashtag) {
                TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                ?? obj2 = new Object();
                obj2.d = tL_messageEntityHashtag;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i9, new p41(getString(richText), (vz0) obj2));
                return spannableStringBuilder;
            } else if (richText instanceof TL_iv.textBotCommand) {
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i9, new m41(getString(richText), isOut() ? 1 : 0, null));
                return spannableStringBuilder;
            } else if (richText instanceof TL_iv.textCashtag) {
                TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                ?? obj3 = new Object();
                obj3.d = tL_messageEntityCashtag;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i9, new p41(getString(richText), (vz0) obj3));
                return spannableStringBuilder;
            } else if (richText instanceof TL_iv.textAutoUrl) {
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i9, new r41(getString(richText), getTextStyleRun(1024)));
                return spannableStringBuilder;
            } else if (richText instanceof TL_iv.textAutoEmail) {
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i9, new r41(ta.b.d("mailto:", getString(richText)), getTextStyleRun(1024)));
                return spannableStringBuilder;
            } else if (richText instanceof TL_iv.textAutoPhone) {
                String string = getString(richText);
                String d9 = ne.b.d(string, false);
                if (string.startsWith("+")) {
                    d9 = ta.b.d("+", d9);
                }
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i9, new r41(ta.b.d("tel:", d9), getTextStyleRun(1024)));
                return spannableStringBuilder;
            } else if (richText instanceof TL_iv.textBankCard) {
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i9, new p41(ta.b.d("card:", getString(richText)), (vz0) null));
                return spannableStringBuilder;
            } else if (richText instanceof TL_iv.textMentionName) {
                TL_iv.RichText richText4 = richText.text;
                formatTextAndSetSpan(richText4, spannableStringBuilder, i9, new s41("" + ((TL_iv.textMentionName) richText).user_id, isOut() ? 1 : 0, null));
                return spannableStringBuilder;
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
                int i20 = i9 | 512;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i20, new StyleSpan(this, i20), new s00(getString(richText), null, tL_messageEntityFormattedDate));
                return spannableStringBuilder;
            } else if (richText instanceof TL_iv.textButton) {
                int length5 = spannableStringBuilder.length();
                spannableStringBuilder.append("*");
                RichButtonSpan richButtonSpan = new RichButtonSpan(this, this.maxWidth, (TL_iv.textButton) richText);
                richButtonSpan.scale = 1.2f;
                spannableStringBuilder.setSpan(richButtonSpan, length5, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    private void drawInternal(Canvas canvas, org.telegram.ui.Cells.s1 s1Var, boolean z10, float f10, float f11) {
        float lerp;
        float f12;
        RichDetailsBlock richDetailsBlock;
        drawBackground(canvas, s1Var);
        updateTranslationLoading();
        float f13 = 0.0f;
        float max = (s1Var == null || !(this.detailsAnimating || this.blockquoteAnimating)) ? 1.0f : Math.max(0.0f, Math.min(1.0f, s1Var.K1));
        this.detailsAnimationProgress = max;
        int i9 = (max > 1.0f ? 1 : (max == 1.0f ? 0 : -1));
        if (i9 >= 0) {
            this.detailsAnimating = false;
            this.blockquoteAnimating = false;
        }
        boolean z11 = this.detailsAnimating;
        boolean z12 = (z11 || this.blockquoteAnimating) ? false : z10;
        boolean z13 = z11 && max < 1.0f;
        if (z13) {
            computeDetailsClips(max);
        }
        computeBlockquoteClips(max);
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock.currVisible || richBlock.prevVisible) {
                float lerp2 = AndroidUtilities.lerp(richBlock.prevY, richBlock.currY, max);
                boolean z14 = richBlock instanceof RichDetailsEndBlock;
                if (z14) {
                    lerp = 1.0f;
                } else {
                    lerp = AndroidUtilities.lerp(richBlock.prevVisible ? 1.0f : 0.0f, richBlock.currVisible ? 1.0f : 0.0f, max);
                }
                if (lerp > f13) {
                    int height = richBlock.getHeight();
                    if (!z12 || (height + lerp2 > f10 && lerp2 < f11)) {
                        canvas.save();
                        if (!z13 || (richDetailsBlock = richBlock.parentDetails) == null || z14) {
                            f12 = 1.0f;
                        } else {
                            float f14 = -3.4028235E38f;
                            float f15 = Float.MAX_VALUE;
                            for (richDetailsBlock = richBlock.parentDetails; richDetailsBlock != null; richDetailsBlock = richDetailsBlock.parentDetails) {
                                f14 = Math.max(f14, richDetailsBlock.animClipTop);
                                f15 = Math.min(f15, richDetailsBlock.animClipBottom);
                            }
                            f12 = 1.0f;
                            if (f15 <= f14) {
                                canvas.restore();
                            } else {
                                canvas.clipRect(-this.padLeft, f14, getMinWidth() + this.padRight, f15);
                                f13 = 0.0f;
                            }
                        }
                        canvas.translate(f13, lerp2);
                        if (lerp < f12) {
                            int saveLayerAlpha = canvas.saveLayerAlpha(-this.padLeft, 0.0f, getMinWidth() + this.padRight, height, (int) (lerp * 255.0f), 31);
                            richBlock.drawWithTyping(canvas);
                            canvas.restoreToCount(saveLayerAlpha);
                        } else {
                            richBlock.drawWithTyping(canvas);
                        }
                        canvas.restore();
                    }
                }
            }
        }
        if (i9 >= 0) {
            snapshotForDetailsAnimation();
        }
    }

    private CharSequence formatTextAndSetSpan(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i9, Object obj, Object obj2) {
        int length = spannableStringBuilder.length();
        formatText(richText, spannableStringBuilder, i9);
        if (spannableStringBuilder.length() > length) {
            setSpansWithoutClash(obj, spannableStringBuilder, length, spannableStringBuilder.length());
            setSpansWithoutClash(obj2, spannableStringBuilder, length, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    public void draw(Canvas canvas, int i9, int i10, org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        setBubblePaddings(i9, i10);
        this.textPaint.linkColor = getThemedColor(isOut() ? org.telegram.ui.ActionBar.f6.f23079hc : org.telegram.ui.ActionBar.f6.f23061gc);
        drawInternal(canvas, s1Var, f11 > f10, f10, f11);
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
        public int f19657w;
        public int f19658x;
        public int f19659y;

        private MediaCell(RichMessageLayout richMessageLayout, TL_iv.pageBlockPhoto pageblockphoto) {
            int i9;
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
            this.aspectRatio = (photoSize == null || (i9 = photoSize.h) <= 0) ? 1.0f : photoSize.f22405w / i9;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        }

        private boolean allowAutoplay() {
            if (this.realVideo) {
                return SharedConfig.isAutoplayVideo();
            }
            return SharedConfig.isAutoplayGifs();
        }

        private void applyImage(boolean z10) {
            ImageLocation imageLocation;
            TLRPC.Photo photo = this.photo;
            ImageLocation imageLocation2 = null;
            if (photo != null && this.sizeFull != null) {
                TLRPC.PhotoSize photoSize = this.strippedSize;
                if (photoSize != null) {
                    imageLocation2 = ImageLocation.getForPhoto(photoSize, photo);
                }
                ImageLocation imageLocation3 = imageLocation2;
                if (z10) {
                    this.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(this.sizeFull, this.photo), null, imageLocation3, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
                    return;
                } else {
                    this.imageReceiver.setImage(null, null, null, null, imageLocation3, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
                    return;
                }
            }
            TLRPC.Document document = this.document;
            if (document != null) {
                TLRPC.PhotoSize photoSize2 = this.strippedThumb;
                if (photoSize2 != null) {
                    imageLocation = ImageLocation.getForDocument(photoSize2, document);
                } else {
                    imageLocation = null;
                }
                TLRPC.PhotoSize photoSize3 = this.previewThumb;
                if (photoSize3 != null) {
                    imageLocation2 = ImageLocation.getForDocument(photoSize3, this.document);
                }
                ImageLocation imageLocation4 = imageLocation2;
                if (z10 && this.isVideo && (allowAutoplay() || this.mediaForced)) {
                    this.imageReceiver.setAllowStartAnimation(true);
                    this.imageReceiver.setAutoRepeat(1);
                    this.imageReceiver.setImage(ImageLocation.getForDocument(this.document), "g", imageLocation4, null, imageLocation, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
                    return;
                }
                this.imageReceiver.setImage(null, null, imageLocation4, null, imageLocation, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
            }
        }

        private boolean computeAutoDownload() {
            if (this.document != null) {
                if (!this.isVideo) {
                    return true;
                }
                if (!allowAutoplay() || !DownloadController.getInstance(this.root.currentAccount).canDownloadMedia(4, this.document.size)) {
                    return false;
                }
                return true;
            } else if ((DownloadController.getInstance(this.root.currentAccount).getCurrentDownloadMask() & 1) == 0) {
                return false;
            } else {
                return true;
            }
        }

        private void didPressButton(View view, boolean z10) {
            int i9 = this.buttonState;
            if (i9 == 0) {
                this.mediaForced = true;
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 != null) {
                    radialProgress2.o(0.0f, z10);
                }
                applyImage(true);
                this.buttonState = 1;
                RadialProgress2 radialProgress22 = this.radialProgress;
                if (radialProgress22 != null) {
                    radialProgress22.setIcon(3, true, z10);
                }
                if (view != null) {
                    view.invalidate();
                }
            } else if (i9 == 1) {
                this.mediaForced = false;
                this.imageReceiver.cancelLoadImage();
                this.buttonState = 0;
                RadialProgress2 radialProgress23 = this.radialProgress;
                if (radialProgress23 != null) {
                    radialProgress23.setIcon(2, false, z10);
                }
                if (view != null) {
                    view.invalidate();
                }
            } else if (i9 == 2) {
                this.mediaForced = true;
                this.imageReceiver.setAllowStartAnimation(true);
                applyImage(true);
                this.imageReceiver.startAnimation();
                this.buttonState = -1;
                RadialProgress2 radialProgress24 = this.radialProgress;
                if (radialProgress24 != null) {
                    radialProgress24.setIcon(4, false, z10);
                }
                if (view != null) {
                    view.invalidate();
                }
            } else if (i9 == 3 && this.root.delegate != null) {
                this.root.delegate.f2(this.root.cell, this.pageBlock);
            }
        }

        private void drawSpoiler(Canvas canvas) {
            Canvas canvas2;
            prepareBlurImage();
            float imageX = this.imageReceiver.getImageX();
            float imageY = this.imageReceiver.getImageY();
            float imageWidth = this.imageReceiver.getImageWidth();
            float imageHeight = this.imageReceiver.getImageHeight();
            if (imageWidth > 0.0f && imageHeight > 0.0f) {
                canvas.save();
                canvas.clipRect(imageX, imageY, imageX + imageWidth, imageY + imageHeight);
                this.spoilerReveal.clipOut(canvas);
                if (this.blurImageReceiver.getBitmap() != null) {
                    this.blurImageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                    this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
                    this.blurImageReceiver.draw(canvas);
                }
                dh.k mediaSpoilerEffect = this.root.getMediaSpoilerEffect();
                if (mediaSpoilerEffect != null) {
                    canvas.translate(imageX, imageY);
                    canvas2 = canvas;
                    mediaSpoilerEffect.c(canvas2, this.parentView, Math.round(imageWidth), Math.round(imageHeight), this.imageReceiver.getCurrentAlpha(), false);
                } else {
                    canvas2 = canvas;
                }
                canvas2.restore();
                View view = this.parentView;
                if (view != null) {
                    view.invalidate();
                }
            }
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

        private boolean isOnButton(float f10, float f11) {
            if (this.buttonState != -1) {
                int i9 = this.buttonX;
                if (f10 >= i9) {
                    int i10 = this.buttonSize;
                    if (f10 <= i9 + i10) {
                        int i11 = this.buttonY;
                        if (f11 >= i11 && f11 <= i11 + i10) {
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
            if ((this.blurImageReceiver.getBitmap() == null || this.imageReceiver.getAnimation() == null) && (bitmap = this.imageReceiver.getBitmap()) != null && !bitmap.isRecycled()) {
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

        public void draw(Canvas canvas) {
            this.imageReceiver.draw(canvas);
            if (isSpoiler() && !this.spoilerReveal.fullyRevealed()) {
                drawSpoiler(canvas);
                return;
            }
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null && this.buttonState != -1) {
                radialProgress2.draw(canvas);
            }
        }

        public void ensureProgress(View view) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 == null && view != null) {
                RadialProgress2 radialProgress22 = new RadialProgress2(view, null);
                this.radialProgress = radialProgress22;
                radialProgress22.d = -1;
                radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
                RadialProgress2 radialProgress23 = this.radialProgress;
                int i9 = this.buttonX;
                int i10 = this.buttonY;
                int i11 = this.buttonSize;
                radialProgress23.q(i9, i10, i9 + i11, i11 + i10);
            } else if (radialProgress2 != null && view != null) {
                radialProgress2.m(view);
                RadialProgress2 radialProgress24 = this.radialProgress;
                int i12 = this.buttonX;
                int i13 = this.buttonY;
                int i14 = this.buttonSize;
                radialProgress24.q(i12, i13, i12 + i14, i14 + i13);
            }
        }

        public boolean fileExists() {
            if (this.sizeFull != null) {
                File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, true);
                File pathToAttach2 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, false);
                if (!pathToAttach.exists() && (pathToAttach2 == null || !pathToAttach2.exists())) {
                    return false;
                }
                return true;
            } else if (this.document == null) {
                return true;
            } else {
                File pathToAttach3 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document);
                File pathToAttach4 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, true);
                if ((pathToAttach3 == null || !pathToAttach3.exists()) && (pathToAttach4 == null || !pathToAttach4.exists())) {
                    return false;
                }
                return true;
            }
        }

        public CharSequence getAccessibilityText() {
            int i9;
            if (this.isVideo) {
                i9 = R.string.AttachVideo;
            } else {
                i9 = R.string.AttachPhoto;
            }
            String string = LocaleController.getString(i9);
            if (isSpoiler() && !this.spoilerReveal.fullyRevealed()) {
                return TextUtils.concat(string, ", ", LocaleController.getString(R.string.Spoiler));
            }
            return string;
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

        @Override
        public int getObserverTag() {
            return this.observerTag;
        }

        public boolean isInside(float f10, float f11) {
            int i9 = this.f19658x;
            if (f10 >= i9 && f10 <= i9 + this.f19657w) {
                int i10 = this.f19659y;
                if (f11 >= i10 && f11 <= i10 + this.h) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public boolean onAccessibilityClick(View view) {
            if (isSpoiler() && !this.spoilerReveal.isRevealing()) {
                float imageWidth = this.imageReceiver.getImageWidth();
                float imageHeight = this.imageReceiver.getImageHeight();
                this.spoilerReveal.start(view, (imageWidth / 2.0f) + this.imageReceiver.getImageX(), (imageHeight / 2.0f) + this.imageReceiver.getImageY(), imageWidth, imageHeight);
                return true;
            } else if (this.root.delegate != null) {
                this.root.delegate.f2(this.root.cell, this.pageBlock);
                return true;
            } else {
                return false;
            }
        }

        @Override
        public void onFailedDownload(String str, boolean z10) {
            updateButtonState(this.parentView, false);
        }

        @Override
        public void onProgressDownload(String str, long j10, long j11) {
            float f10;
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                if (j11 <= 0) {
                    f10 = 0.0f;
                } else {
                    f10 = ((float) j10) / ((float) j11);
                }
                radialProgress2.o(Math.min(1.0f, f10), true);
            }
            if (this.buttonState != 1) {
                updateButtonState(this.parentView, true);
            }
        }

        @Override
        public void onSuccessDownload(String str) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.o(1.0f, true);
            }
            if (this.isVideo && (allowAutoplay() || this.mediaForced)) {
                applyImage(true);
            }
            updateButtonState(this.parentView, true);
        }

        public boolean onTouchEvent(MotionEvent motionEvent, View view) {
            int i9;
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean isInside = isInside(x10, y10);
            boolean isOnButton = isOnButton(x10, y10);
            if (actionMasked == 0) {
                if (isInside && (isOnButton || (i9 = this.buttonState) == 0 || i9 == 2)) {
                    this.buttonPressed = true;
                    if (view != null) {
                        view.invalidate();
                    }
                    return true;
                } else if (!isInside) {
                    return false;
                } else {
                    this.photoPressed = true;
                    return true;
                }
            } else if (actionMasked == 1) {
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
                    if (isInside) {
                        if (view != null) {
                            view.playSoundEffect(0);
                        }
                        if (isSpoiler() && !this.spoilerReveal.isRevealing()) {
                            float imageWidth = this.imageReceiver.getImageWidth();
                            float imageHeight = this.imageReceiver.getImageHeight();
                            this.spoilerReveal.start(view, (imageWidth / 2.0f) + this.imageReceiver.getImageX(), (imageHeight / 2.0f) + this.imageReceiver.getImageY(), imageWidth, imageHeight);
                        } else if (this.root.delegate != null) {
                            this.root.delegate.f2(this.root.cell, this.pageBlock);
                        }
                        return true;
                    }
                }
                return false;
            } else if (actionMasked == 3) {
                this.photoPressed = false;
                this.buttonPressed = false;
                return false;
            } else if (this.photoPressed || this.buttonPressed) {
                return true;
            } else {
                return false;
            }
        }

        public void setRect(int i9, int i10, int i11, int i12) {
            boolean z10;
            this.f19658x = i9;
            this.f19659y = i10;
            this.f19657w = i11;
            this.h = i12;
            this.imageReceiver.setImageCoords(i9, i10, i11, i12);
            int i13 = this.buttonSize;
            int d = j3.r0.d(i11, i13, 2, i9);
            this.buttonX = d;
            int d9 = j3.r0.d(i12, i13, 2, i10);
            this.buttonY = d9;
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.q(d, d9, d + i13, i13 + d9);
            }
            boolean computeAutoDownload = computeAutoDownload();
            this.autoDownload = computeAutoDownload;
            if (!computeAutoDownload && !fileExists()) {
                z10 = false;
            } else {
                z10 = true;
            }
            applyImage(z10);
        }

        public void updateButtonState(View view, boolean z10) {
            boolean z11;
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
            org.telegram.ui.Components.x5 animation = this.imageReceiver.getAnimation();
            if (animation != null && (animation.s() || this.imageReceiver.isAnimationRunning())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!fileExists() && (!this.isVideo || !z11)) {
                DownloadController.getInstance(this.root.currentAccount).addLoadingFileObserver(fileName, null, this);
                float f10 = 0.0f;
                if (!this.autoDownload && !this.mediaForced && !FileLoader.getInstance(this.root.currentAccount).isLoadingFile(fileName)) {
                    if (this.realVideo) {
                        this.buttonState = 3;
                        RadialProgress2 radialProgress22 = this.radialProgress;
                        if (radialProgress22 != null) {
                            radialProgress22.setIcon(0, true, z10);
                        }
                    } else {
                        this.buttonState = 0;
                        RadialProgress2 radialProgress23 = this.radialProgress;
                        if (radialProgress23 != null) {
                            radialProgress23.setIcon(2, true, z10);
                        }
                    }
                } else {
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                    if (fileProgress != null) {
                        f10 = fileProgress.floatValue();
                    }
                    RadialProgress2 radialProgress24 = this.radialProgress;
                    if (radialProgress24 != null) {
                        radialProgress24.setIcon(3, true, z10);
                    }
                }
                RadialProgress2 radialProgress25 = this.radialProgress;
                if (radialProgress25 != null) {
                    radialProgress25.o(f10, false);
                }
            } else {
                DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
                if (this.realVideo && !z11) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress26 = this.radialProgress;
                    if (radialProgress26 != null) {
                        radialProgress26.setIcon(0, false, z10);
                    }
                } else if (this.isVideo && !z11 && !allowAutoplay() && !this.mediaForced) {
                    this.buttonState = 2;
                    RadialProgress2 radialProgress27 = this.radialProgress;
                    if (radialProgress27 != null) {
                        radialProgress27.setIcon(8, false, z10);
                    }
                } else {
                    this.buttonState = -1;
                    RadialProgress2 radialProgress28 = this.radialProgress;
                    if (radialProgress28 != null) {
                        radialProgress28.setIcon(4, false, z10);
                    }
                }
            }
            if (view != null) {
                view.invalidate();
            }
        }

        private MediaCell(RichMessageLayout richMessageLayout, TL_iv.pageBlockVideo pageblockvideo) {
            float f10;
            int i9;
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
            boolean isVideoDocument = MessageObject.isVideoDocument(document);
            this.realVideo = isVideoDocument;
            this.isVideo = isVideoDocument || MessageObject.isGifDocument(document);
            if (document != null) {
                this.previewThumb = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
                this.strippedThumb = FileLoader.getStrippedPhotoSize(document.thumbs);
            } else {
                this.previewThumb = null;
                this.strippedThumb = null;
            }
            if (document != null) {
                for (int i10 = 0; i10 < this.document.attributes.size(); i10++) {
                    TLRPC.DocumentAttribute documentAttribute = this.document.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i9 = documentAttribute.h) > 0) {
                        f10 = documentAttribute.f22387w / i9;
                        break;
                    }
                }
            }
            f10 = 1.0f;
            this.aspectRatio = f10;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            this.imageReceiver.setAllowLoadingOnAttachedOnly(true);
            this.blurImageReceiver.setAllowLoadingOnAttachedOnly(true);
            this.imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                {
                    MediaCell.this = this;
                }

                @Override
                public final void didSetImageBitmap(int i11, String str, Drawable drawable) {
                    g5.a(this, i11, str, drawable);
                }

                @Override
                public void onAnimationReady(ImageReceiver imageReceiver) {
                    MediaCell mediaCell = MediaCell.this;
                    mediaCell.updateButtonState(mediaCell.parentView, true);
                }

                @Override
                public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
                }
            });
        }

        @Override
        public void onProgressUpload(String str, long j10, long j11, boolean z10) {
        }
    }

    private RichMessageLayout(int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        this.unsupportedBlocks = new ArrayList<>();
        this.unsupportedBlocksRoot = new ArrayList<>();
        this.blocks = new ArrayList<>();
        this.quotes = new ArrayList<>();
        this.anchors = new HashMap<>();
        this.textAnchors = new HashMap<>();
        this.audioMessages = new ArrayList<>();
        this.audioBlocks = new HashMap<>();
        this.textBlocks = new ArrayList<>();
        this.textBlockCharOffsets = new ArrayList<>();
        this.textBlockBlockIndex = new ArrayList<>();
        this.joinedText = "";
        this.detailsAnimationProgress = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.numTextPaint = textPaint2;
        this.quoteLine = new dl0(null);
        this.clip = new s10();
        this.showMoreRect = new RectF();
        this.messageObject = null;
        this.currentAccount = i9;
        this.maxWidth = i10;
        this.resourcesProvider = b6Var;
        int i11 = SharedConfig.fontSize;
        this.fontSize = i11;
        this.density = AndroidUtilities.density;
        textPaint.setTextSize(AndroidUtilities.dp(i11));
        textPaint2.setTextSize(AndroidUtilities.dp(this.fontSize));
    }

    public static class AnchorSpan extends CharacterStyle {
        public final String name;

        public AnchorSpan(String str) {
            this.name = str;
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
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
        private final ln0 seekBar;
        private int seekBarWidth;
        private int seekBarX;
        private int seekBarY;
        private final int size;
        private StaticLayout titleLayout;

        public RichAudioBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, TL_iv.pageBlockAudio pageblockaudio) {
            super(richMessageLayout, rect, i9);
            TLRPC.Document document;
            this.audioTimePaint = new TextPaint(1);
            int dp = AndroidUtilities.dp(16.0f);
            this.buttonX = dp;
            int dp2 = AndroidUtilities.dp(9.0f);
            this.buttonY = dp2;
            int dp3 = AndroidUtilities.dp(44.0f);
            this.size = dp3;
            this.layoutWidth = -1;
            this.block = pageblockaudio;
            MessageObject messageObject = richMessageLayout.audioBlocks.get(pageblockaudio);
            this.currentMessageObject = messageObject;
            if (messageObject != null) {
                document = messageObject.getDocument();
            } else {
                document = null;
            }
            this.currentDocument = document;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
            this.radialProgress = radialProgress2;
            radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
            radialProgress2.q(dp, dp2, dp + dp3, dp3 + dp2);
            ln0 ln0Var = new ln0(null);
            this.seekBar = ln0Var;
            ln0Var.h = new d(this, 13);
            layoutInner();
            updateButtonState(false);
        }

        private boolean canStream() {
            MessageObject messageObject;
            if (SharedConfig.streamMedia && (messageObject = this.currentMessageObject) != null && messageObject.isMusic() && !this.currentMessageObject.shouldEncryptPhotoOrVideo() && !DialogObject.isEncryptedDialog(this.currentMessageObject.getDialogId())) {
                return true;
            }
            return false;
        }

        private void didPressedButton(boolean z10) {
            int i9 = this.root.currentAccount;
            int i10 = this.buttonState;
            if (i10 == 0) {
                if (MediaController.getInstance().setPlaylist(this.root.audioMessages, this.currentMessageObject, 0L, false, null)) {
                    this.buttonState = 1;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z10);
                    View view = this.view;
                    if (view != null) {
                        view.invalidate();
                    }
                }
            } else if (i10 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                    this.buttonState = 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z10);
                    View view2 = this.view;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                }
            } else if (i10 == 2) {
                this.radialProgress.o(0.0f, false);
                FileLoader.getInstance(i9).loadFile(this.currentDocument, this.root.messageObject, 1, 1);
                this.buttonState = 3;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z10);
                View view3 = this.view;
                if (view3 != null) {
                    view3.invalidate();
                }
            } else if (i10 == 3) {
                FileLoader.getInstance(i9).cancelLoadFile(this.currentDocument);
                this.buttonState = 2;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z10);
                View view4 = this.view;
                if (view4 != null) {
                    view4.invalidate();
                }
            }
        }

        private int getIconForCurrentState() {
            int i9 = this.buttonState;
            if (i9 == 1) {
                return 1;
            }
            if (i9 == 2) {
                return 2;
            }
            if (i9 == 3) {
                return 3;
            }
            return 0;
        }

        public void lambda$new$0(float f10) {
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject == null) {
                return;
            }
            messageObject.audioProgress = f10;
            MediaController.getInstance().seekToProgress(this.currentMessageObject, f10);
        }

        private void layoutInner() {
            String str;
            String str2;
            SpannableStringBuilder spannableStringBuilder;
            int i9 = this.maxWidth;
            RichMessageLayout richMessageLayout = this.root;
            this.layoutWidth = i9 + richMessageLayout.padLeft + richMessageLayout.padRight;
            int dp = AndroidUtilities.dp(50.0f) + this.buttonX + this.size;
            this.seekBarX = dp;
            this.seekBarWidth = l0.b(18.0f, this.layoutWidth - dp, 0);
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject != null) {
                str = messageObject.getMusicAuthor(false);
            } else {
                str = null;
            }
            MessageObject messageObject2 = this.currentMessageObject;
            if (messageObject2 != null) {
                str2 = messageObject2.getMusicTitle(false);
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                this.titleLayout = null;
                this.seekBarY = ((this.size - AndroidUtilities.dp(30.0f)) / 2) + this.buttonY;
            } else {
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                    spannableStringBuilder = new SpannableStringBuilder(aa.d.z(str, " - ", str2));
                } else if (!TextUtils.isEmpty(str2)) {
                    spannableStringBuilder = new SpannableStringBuilder(str2);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                }
                if (!TextUtils.isEmpty(str)) {
                    spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, str.length(), 18);
                }
                this.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
                int dp2 = AndroidUtilities.dp(50.0f) + this.seekBarWidth;
                this.titleLayout = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.f6.O2, dp2, TextUtils.TruncateAt.END), this.audioTimePaint, dp2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.seekBarY = AndroidUtilities.dp(11.0f) + ((this.size - AndroidUtilities.dp(30.0f)) / 2) + this.buttonY;
            }
            this.seekBar.j(this.seekBarWidth, AndroidUtilities.dp(30.0f));
        }

        @Override
        public void didReceivedNotification(int i9, int i10, Object... objArr) {
            MessageObject playingMessageObject;
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject != null) {
                if (i9 == NotificationCenter.messagePlayingDidStart) {
                    updateButtonState(true);
                } else if (i9 != NotificationCenter.messagePlayingDidReset && i9 != NotificationCenter.messagePlayingPlayStateChanged) {
                    if (i9 == NotificationCenter.messagePlayingProgressDidChanged && messageObject.getId() == ((Integer) objArr[0]).intValue() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                        MessageObject messageObject2 = this.currentMessageObject;
                        messageObject2.audioProgress = playingMessageObject.audioProgress;
                        messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                        messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                        updatePlayingMessageProgress();
                    }
                } else {
                    updateButtonState(true);
                }
            }
        }

        @Override
        public int getHeight() {
            return AndroidUtilities.dp(62.0f) + this.padding.top + this.padding.bottom;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public int getObserverTag() {
            return this.observerTag;
        }

        @Override
        public boolean isHorizontallyDragging() {
            return this.seekBar.f30490e;
        }

        @Override
        public void onAttachedToWindow() {
            View view = this.view;
            if (view != null) {
                this.radialProgress.m(view);
                this.seekBar.f30503s = this.view;
            }
            updateButtonState(false);
            NotificationCenter.getInstance(this.root.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
            NotificationCenter.getInstance(this.root.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(this.root.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(this.root.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        }

        @Override
        public void onDetachedFromWindow() {
            DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
            NotificationCenter.getInstance(this.root.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
            NotificationCenter.getInstance(this.root.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(this.root.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(this.root.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            if (this.currentMessageObject != null && this.currentDocument != null) {
                int i19 = this.layoutWidth;
                int i20 = this.maxWidth;
                RichMessageLayout richMessageLayout = this.root;
                if (i19 != i20 + richMessageLayout.padLeft + richMessageLayout.padRight) {
                    layoutInner();
                }
                canvas.save();
                canvas.translate(-this.root.padLeft, 0.0f);
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (this.root.isOut()) {
                    i9 = org.telegram.ui.ActionBar.f6.Nb;
                } else {
                    i9 = org.telegram.ui.ActionBar.f6.f23099ie;
                }
                if (this.root.isOut()) {
                    i10 = org.telegram.ui.ActionBar.f6.Ob;
                } else {
                    i10 = org.telegram.ui.ActionBar.f6.f23116je;
                }
                if (this.root.isOut()) {
                    i11 = org.telegram.ui.ActionBar.f6.Pa;
                } else {
                    i11 = org.telegram.ui.ActionBar.f6.f23309uc;
                }
                if (this.root.isOut()) {
                    i12 = org.telegram.ui.ActionBar.f6.Qa;
                } else {
                    i12 = org.telegram.ui.ActionBar.f6.f23323vc;
                }
                radialProgress2.g(i9, i10, i11, i12);
                RadialProgress2 radialProgress22 = this.radialProgress;
                RichMessageLayout richMessageLayout2 = this.root;
                if (richMessageLayout2.isOut()) {
                    i13 = org.telegram.ui.ActionBar.f6.Db;
                } else {
                    i13 = org.telegram.ui.ActionBar.f6.Bd;
                }
                radialProgress22.d = richMessageLayout2.getThemedColor(i13);
                this.radialProgress.draw(canvas);
                ln0 ln0Var = this.seekBar;
                RichMessageLayout richMessageLayout3 = this.root;
                if (richMessageLayout3.isOut()) {
                    i14 = org.telegram.ui.ActionBar.f6.f23338wb;
                } else {
                    i14 = org.telegram.ui.ActionBar.f6.f23310ud;
                }
                int themedColor = richMessageLayout3.getThemedColor(i14);
                RichMessageLayout richMessageLayout4 = this.root;
                if (richMessageLayout4.isOut()) {
                    i15 = org.telegram.ui.ActionBar.f6.f23356xb;
                } else {
                    i15 = org.telegram.ui.ActionBar.f6.vd;
                }
                int themedColor2 = richMessageLayout4.getThemedColor(i15);
                RichMessageLayout richMessageLayout5 = this.root;
                if (richMessageLayout5.isOut()) {
                    i16 = org.telegram.ui.ActionBar.f6.f23391zb;
                } else {
                    i16 = org.telegram.ui.ActionBar.f6.f23358xd;
                }
                int themedColor3 = richMessageLayout5.getThemedColor(i16);
                RichMessageLayout richMessageLayout6 = this.root;
                if (richMessageLayout6.isOut()) {
                    i17 = org.telegram.ui.ActionBar.f6.f23391zb;
                } else {
                    i17 = org.telegram.ui.ActionBar.f6.f23358xd;
                }
                int themedColor4 = richMessageLayout6.getThemedColor(i17);
                RichMessageLayout richMessageLayout7 = this.root;
                if (richMessageLayout7.isOut()) {
                    i18 = org.telegram.ui.ActionBar.f6.f23374yb;
                } else {
                    i18 = org.telegram.ui.ActionBar.f6.f23340wd;
                }
                ln0Var.h(themedColor, themedColor2, themedColor3, themedColor4, richMessageLayout7.getThemedColor(i18));
                canvas.save();
                canvas.translate(this.seekBarX, this.seekBarY);
                this.seekBar.b(canvas);
                canvas.restore();
                if (this.durationLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(54.0f) + this.buttonX, AndroidUtilities.dp(6.0f) + this.seekBarY);
                    this.durationLayout.draw(canvas);
                    canvas.restore();
                }
                if (this.titleLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(54.0f) + this.buttonX, this.seekBarY - AndroidUtilities.dp(16.0f));
                    this.titleLayout.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }

        @Override
        public void onFailedDownload(String str, boolean z10) {
            updateButtonState(true);
        }

        @Override
        public void onProgressDownload(String str, long j10, long j11) {
            float f10;
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (j11 <= 0) {
                f10 = 0.0f;
            } else {
                f10 = ((float) j10) / ((float) j11);
            }
            radialProgress2.o(Math.min(1.0f, f10), true);
            if (this.buttonState != 3) {
                updateButtonState(true);
            }
        }

        @Override
        public void onSuccessDownload(String str) {
            this.radialProgress.o(1.0f, true);
            updateButtonState(true);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX() + this.root.padLeft;
            float y10 = motionEvent.getY();
            if (this.seekBar.f(x10 - this.seekBarX, y10 - this.seekBarY, actionMasked)) {
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
                    int i9 = this.buttonX;
                    if (x10 >= i9 && x10 <= AndroidUtilities.dp(48.0f) + i9) {
                        int i10 = this.buttonY;
                        if (y10 >= i10 && y10 <= AndroidUtilities.dp(48.0f) + i10) {
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

        public void updateButtonState(boolean z10) {
            File pathToAttach;
            boolean z11;
            int i9 = this.root.currentAccount;
            String attachFileName = FileLoader.getAttachFileName(this.currentDocument);
            int i10 = 1;
            if (this.currentDocument == null) {
                pathToAttach = null;
            } else {
                pathToAttach = FileLoader.getInstance(i9).getPathToAttach(this.currentDocument, true);
            }
            if (pathToAttach != null && pathToAttach.exists()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (z11) {
                DownloadController.getInstance(i9).removeLoadingFileObserver(this);
                if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject) && !MediaController.getInstance().isMessagePaused()) {
                    this.buttonState = 1;
                } else {
                    this.buttonState = 0;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z10);
            } else {
                DownloadController.getInstance(i9).addLoadingFileObserver(attachFileName, null, this);
                if (canStream()) {
                    this.buttonState = (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || MediaController.getInstance().isMessagePaused()) ? 0 : 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z10);
                } else {
                    float f10 = 0.0f;
                    if (!FileLoader.getInstance(i9).isLoadingFile(attachFileName)) {
                        this.buttonState = 2;
                        this.radialProgress.o(0.0f, z10);
                        this.radialProgress.setIcon(getIconForCurrentState(), false, z10);
                    } else {
                        this.buttonState = 3;
                        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                        RadialProgress2 radialProgress2 = this.radialProgress;
                        if (fileProgress != null) {
                            f10 = fileProgress.floatValue();
                        }
                        radialProgress2.o(f10, z10);
                        this.radialProgress.setIcon(getIconForCurrentState(), true, z10);
                    }
                }
            }
            updatePlayingMessageProgress();
        }

        public void updatePlayingMessageProgress() {
            MessageObject messageObject;
            int i9;
            int i10;
            if (this.currentDocument != null && (messageObject = this.currentMessageObject) != null) {
                ln0 ln0Var = this.seekBar;
                if (!ln0Var.f30490e) {
                    ln0Var.i(messageObject.audioProgress);
                }
                if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                    i9 = this.currentMessageObject.audioProgressSec;
                } else {
                    i9 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= this.currentDocument.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = this.currentDocument.attributes.get(i11);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            i9 = (int) documentAttribute.duration;
                            break;
                        }
                        i11++;
                    }
                }
                String formatShortDuration = AndroidUtilities.formatShortDuration(i9);
                String str = this.lastTimeString;
                if (str == null || !str.equals(formatShortDuration)) {
                    this.lastTimeString = formatShortDuration;
                    this.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
                    this.durationLayout = new StaticLayout(formatShortDuration, this.audioTimePaint, (int) Math.ceil(this.audioTimePaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                TextPaint textPaint = this.audioTimePaint;
                RichMessageLayout richMessageLayout = this.root;
                if (richMessageLayout.isOut()) {
                    i10 = org.telegram.ui.ActionBar.f6.fc;
                } else {
                    i10 = org.telegram.ui.ActionBar.f6.ec;
                }
                textPaint.setColor(richMessageLayout.getThemedColor(i10));
                View view = this.view;
                if (view != null) {
                    view.invalidate();
                }
            }
        }

        @Override
        public void onProgressUpload(String str, long j10, long j11, boolean z10) {
        }
    }

    public static class RichDocumentBlock extends RichBlock implements DownloadController.FileDownloadProgressListener {
        private static final int MIN_WIDTH_DP = 220;
        public final TL_iv.pageBlockDocument block;
        private final int buttonSize;
        private int buttonState;
        private final int buttonTextSpacing;
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

        public RichDocumentBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, TL_iv.pageBlockDocument pageblockdocument) {
            super(richMessageLayout, rect, i9);
            ImageReceiver imageReceiver = new ImageReceiver();
            this.previewImage = imageReceiver;
            this.previewBackgroundPaint = new Paint(1);
            this.titlePaint = new TextPaint(1);
            this.sizePaint = new TextPaint(1);
            int dp = AndroidUtilities.dp(16.0f);
            this.buttonX = dp;
            int dp2 = AndroidUtilities.dp(9.0f);
            this.buttonY = dp2;
            int dp3 = AndroidUtilities.dp(42.0f);
            this.buttonSize = dp3;
            this.buttonTextSpacing = AndroidUtilities.dp(14.0f);
            this.optionsHit = new RectF();
            this.layoutWidth = -1;
            this.block = pageblockdocument;
            TLRPC.Document document = richMessageLayout.getDocument(pageblockdocument.document_id);
            this.document = document;
            int dp4 = AndroidUtilities.dp(10.0f) + richMessageLayout.padLeft;
            this.previewX = dp4;
            boolean isDocumentHasThumb = MessageObject.isDocumentHasThumb(document);
            this.hasPreview = isDocumentHasThumb;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
            this.radialProgress = radialProgress2;
            radialProgress2.setCircleRadius(dp3 / 2);
            dp = isDocumentHasThumb ? ((AndroidUtilities.dp(86.0f) - dp3) / 2) + dp4 : dp;
            dp2 = isDocumentHasThumb ? AndroidUtilities.dp(10.0f) + ((AndroidUtilities.dp(86.0f) - dp3) / 2) : dp2;
            radialProgress2.q(dp, dp2, dp + dp3, dp3 + dp2);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            if (isDocumentHasThumb) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
                imageReceiver.setImageCoords(dp4, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
                imageReceiver.setImage(closestPhotoSizeWithSize != null ? ImageLocation.getForDocument(closestPhotoSizeWithSize, document) : null, "86_86", ImageLoader.createStripedBitmap(document.thumbs), null, richMessageLayout.messageObject, 1);
            }
            rebuildLayouts();
            updateButtonState(false);
        }

        private boolean canShowOptions() {
            if (this.document != null && this.root.cell != null && this.root.delegate != null && this.root.delegate.e0(this.root.cell)) {
                return true;
            }
            return false;
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

        private int getLayoutWidth() {
            int i9;
            int minWidth = this.root.getMinWidth();
            if (minWidth > 0) {
                int i10 = this.maxWidth;
                Rect rect = this.padding;
                i9 = Math.min(i10, Math.max(0, (minWidth - rect.left) - rect.right));
            } else {
                i9 = this.maxWidth;
            }
            RichMessageLayout richMessageLayout = this.root;
            return i9 + richMessageLayout.padLeft + richMessageLayout.padRight;
        }

        private int getMenuX() {
            return (this.layoutWidth + this.padding.right) - AndroidUtilities.dp(32.0f);
        }

        private File path() {
            if (this.document == null) {
                return null;
            }
            File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, false);
            if (pathToAttach != null && pathToAttach.exists()) {
                return pathToAttach;
            }
            return FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, true);
        }

        private void press() {
            Context context;
            int i9 = this.buttonState;
            if (i9 == 0) {
                View view = this.view;
                if (view == null) {
                    context = null;
                } else {
                    context = view.getContext();
                }
                Activity findActivity = findActivity(context);
                File path = path();
                if (findActivity != null && path != null) {
                    AndroidUtilities.openForView(path, FileLoader.getDocumentFileName(this.document), this.document.mime_type, findActivity, this.root.resourcesProvider, false);
                }
            } else if (i9 == 1 && this.document != null) {
                FileLoader.getInstance(this.root.currentAccount).loadFile(this.document, this.root.messageObject, 1, 1);
                this.buttonState = 2;
                this.radialProgress.setIcon(3, true, true);
            } else if (i9 == 2 && this.document != null) {
                FileLoader.getInstance(this.root.currentAccount).cancelLoadFile(this.document);
                this.buttonState = 1;
                this.radialProgress.setIcon(2, false, true);
            }
            View view2 = this.view;
            if (view2 != null) {
                view2.invalidate();
            }
        }

        private void rebuildLayouts() {
            int i9;
            String documentFileName;
            this.layoutWidth = getLayoutWidth();
            if (this.hasPreview) {
                i9 = AndroidUtilities.dp(97.0f) + this.previewX;
            } else {
                i9 = this.buttonTextSpacing + this.buttonX + this.buttonSize;
            }
            int b10 = l0.b(48.0f, this.layoutWidth - i9, AndroidUtilities.dp(40.0f));
            this.titlePaint.setTextSize(AndroidUtilities.dp(this.root.fontSize - 1));
            this.titlePaint.setTypeface(AndroidUtilities.bold());
            this.sizePaint.setTextSize(AndroidUtilities.dp(this.root.fontSize - 3));
            TLRPC.Document document = this.document;
            String str = "";
            if (document == null) {
                documentFileName = "";
            } else {
                documentFileName = FileLoader.getDocumentFileName(document);
            }
            CharSequence ellipsize = TextUtils.ellipsize(documentFileName, this.titlePaint, b10, TextUtils.TruncateAt.END);
            TextPaint textPaint = this.titlePaint;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.titleLayout = new StaticLayout(ellipsize, textPaint, b10, alignment, 1.0f, 0.0f, false);
            TLRPC.Document document2 = this.document;
            if (document2 != null) {
                str = AndroidUtilities.formatFileSize(document2.size);
            }
            this.sizeLayout = new StaticLayout(str, this.sizePaint, b10, alignment, 1.0f, 0.0f, false);
        }

        @Override
        public int getHeight() {
            float f10;
            int i9 = this.padding.top;
            if (this.hasPreview) {
                f10 = 106.0f;
            } else {
                f10 = 60.0f;
            }
            return AndroidUtilities.dp(f10) + i9 + this.padding.bottom;
        }

        @Override
        public int getLastLineWidth() {
            int i9;
            int i10;
            if (this.hasPreview) {
                i9 = this.previewX - this.root.padLeft;
                i10 = AndroidUtilities.dp(86.0f);
            } else {
                StaticLayout staticLayout = this.sizeLayout;
                if (staticLayout != null && staticLayout.getLineCount() > 0) {
                    StaticLayout staticLayout2 = this.sizeLayout;
                    i9 = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
                } else {
                    i9 = 0;
                }
                i10 = (this.buttonX - this.root.padLeft) + this.buttonSize + this.buttonTextSpacing;
            }
            int i11 = i10 + i9;
            Rect rect = this.padding;
            return rect.left + i11 + rect.right;
        }

        @Override
        public int getMinWidth() {
            String documentFileName;
            int i9;
            TLRPC.Document document = this.document;
            String str = "";
            if (document == null) {
                documentFileName = "";
            } else {
                documentFileName = FileLoader.getDocumentFileName(document);
            }
            TLRPC.Document document2 = this.document;
            if (document2 != null) {
                str = AndroidUtilities.formatFileSize(document2.size);
            }
            int ceil = (int) Math.ceil(Math.max(this.titlePaint.measureText(documentFileName), this.sizePaint.measureText(str)));
            if (this.hasPreview) {
                i9 = AndroidUtilities.dp(107.0f);
            } else {
                i9 = this.buttonX + this.buttonSize + this.buttonTextSpacing;
            }
            int min = Math.min(this.maxWidth, Math.max(AndroidUtilities.dp(220.0f), AndroidUtilities.dp(48.0f) + i9 + ceil));
            Rect rect = this.padding;
            return rect.left + min + rect.right;
        }

        @Override
        public int getObserverTag() {
            return this.observerTag;
        }

        @Override
        public void onAttachedToWindow() {
            View view = this.view;
            if (view != null) {
                this.radialProgress.m(view);
                this.previewImage.setParentView(this.view);
            }
            this.previewImage.onAttachedToWindow();
            updateButtonState(false);
        }

        @Override
        public void onDetachedFromWindow() {
            this.previewImage.onDetachedFromWindow();
            DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
        }

        @Override
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
            int i9;
            int i10;
            int i11;
            Drawable drawable;
            int i12;
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
                if (richMessageLayout.isOut()) {
                    i12 = org.telegram.ui.ActionBar.f6.Ib;
                } else {
                    i12 = org.telegram.ui.ActionBar.f6.Gd;
                }
                paint.setColor(richMessageLayout.getThemedColor(i12));
                canvas2 = canvas;
                canvas2.drawRoundRect(this.previewX, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f) + this.previewX, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.previewBackgroundPaint);
            } else {
                canvas2 = canvas;
            }
            this.radialProgress.draw(canvas2);
            TextPaint textPaint = this.titlePaint;
            RichMessageLayout richMessageLayout2 = this.root;
            if (richMessageLayout2.isOut()) {
                i9 = org.telegram.ui.ActionBar.f6.Fb;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.Dd;
            }
            textPaint.setColor(richMessageLayout2.getThemedColor(i9));
            TextPaint textPaint2 = this.sizePaint;
            RichMessageLayout richMessageLayout3 = this.root;
            if (richMessageLayout3.isOut()) {
                i10 = org.telegram.ui.ActionBar.f6.f23272sb;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.nd;
            }
            textPaint2.setColor(richMessageLayout3.getThemedColor(i10));
            if (this.hasPreview) {
                i11 = AndroidUtilities.dp(97.0f) + this.previewX;
            } else {
                i11 = this.buttonTextSpacing + this.buttonX + this.buttonSize;
            }
            int dp = AndroidUtilities.dp(11.0f);
            int dp2 = AndroidUtilities.dp(2.0f);
            canvas2.save();
            float f10 = i11;
            canvas2.translate(f10, dp);
            this.titleLayout.draw(canvas2);
            canvas2.restore();
            canvas2.save();
            canvas2.translate(f10, dp2 + this.titleLayout.getHeight() + dp);
            this.sizeLayout.draw(canvas2);
            canvas2.restore();
            if (canShowOptions()) {
                if (this.root.isOut()) {
                    drawable = this.root.getThemedDrawable("drawableMsgOutMenu");
                } else {
                    drawable = org.telegram.ui.ActionBar.f6.f22981c4;
                }
                int menuX = getMenuX();
                int dp3 = AndroidUtilities.dp(7.0f);
                drawable.setBounds(menuX, dp3, drawable.getIntrinsicWidth() + menuX, drawable.getIntrinsicHeight() + dp3);
                drawable.draw(canvas2);
                this.optionsHit.set(menuX - AndroidUtilities.dp(8.0f), 0.0f, AndroidUtilities.dp(8.0f) + drawable.getIntrinsicWidth() + menuX, AndroidUtilities.dp(54.0f));
            } else {
                this.optionsHit.setEmpty();
            }
            canvas2.restore();
        }

        @Override
        public void onFailedDownload(String str, boolean z10) {
            updateButtonState(true);
        }

        @Override
        public void onProgressDownload(String str, long j10, long j11) {
            float min;
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (j11 <= 0) {
                min = 0.0f;
            } else {
                min = Math.min(1.0f, ((float) j10) / ((float) j11));
            }
            radialProgress2.o(min, true);
            if (this.buttonState != 2) {
                updateButtonState(true);
            }
        }

        @Override
        public void onSuccessDownload(String str) {
            this.radialProgress.o(1.0f, true);
            updateButtonState(true);
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichDocumentBlock.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public void updateButtonState(boolean z10) {
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            if (this.hasPreview) {
                this.radialProgress.g(org.telegram.ui.ActionBar.f6.f23152le, org.telegram.ui.ActionBar.f6.f23169me, org.telegram.ui.ActionBar.f6.f23186ne, org.telegram.ui.ActionBar.f6.oe);
                this.radialProgress.d = this.root.getThemedColor(org.telegram.ui.ActionBar.f6.f23080hd);
            } else {
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (this.root.isOut()) {
                    i9 = org.telegram.ui.ActionBar.f6.Nb;
                } else {
                    i9 = org.telegram.ui.ActionBar.f6.f23099ie;
                }
                if (this.root.isOut()) {
                    i10 = org.telegram.ui.ActionBar.f6.Ob;
                } else {
                    i10 = org.telegram.ui.ActionBar.f6.f23116je;
                }
                if (this.root.isOut()) {
                    i11 = org.telegram.ui.ActionBar.f6.Pa;
                } else {
                    i11 = org.telegram.ui.ActionBar.f6.f23309uc;
                }
                if (this.root.isOut()) {
                    i12 = org.telegram.ui.ActionBar.f6.Qa;
                } else {
                    i12 = org.telegram.ui.ActionBar.f6.f23323vc;
                }
                radialProgress2.g(i9, i10, i11, i12);
                RadialProgress2 radialProgress22 = this.radialProgress;
                RichMessageLayout richMessageLayout = this.root;
                if (richMessageLayout.isOut()) {
                    i13 = org.telegram.ui.ActionBar.f6.Db;
                } else {
                    i13 = org.telegram.ui.ActionBar.f6.Bd;
                }
                radialProgress22.d = richMessageLayout.getThemedColor(i13);
            }
            String attachFileName = FileLoader.getAttachFileName(this.document);
            File path = path();
            int i14 = 4;
            if (path != null && path.exists()) {
                DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
                this.buttonState = 0;
                RadialProgress2 radialProgress23 = this.radialProgress;
                if (!this.hasPreview) {
                    i14 = 5;
                }
                radialProgress23.setIcon(i14, false, z10);
            } else if (!TextUtils.isEmpty(attachFileName)) {
                DownloadController.getInstance(this.root.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                float f10 = 0.0f;
                if (FileLoader.getInstance(this.root.currentAccount).isLoadingFile(attachFileName)) {
                    this.buttonState = 2;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    RadialProgress2 radialProgress24 = this.radialProgress;
                    if (fileProgress != null) {
                        f10 = fileProgress.floatValue();
                    }
                    radialProgress24.o(f10, z10);
                    this.radialProgress.setIcon(3, true, z10);
                } else {
                    this.buttonState = 1;
                    this.radialProgress.o(0.0f, z10);
                    this.radialProgress.setIcon(2, false, z10);
                }
            } else {
                this.radialProgress.setIcon(4, false, z10);
            }
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override
        public void onProgressUpload(String str, long j10, long j11, boolean z10) {
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

        public RichMediaBlock(RichMessageLayout richMessageLayout, Rect rect, int i9, boolean z10) {
            super(richMessageLayout, rect, i9);
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            ImageReceiver imageReceiver2 = new ImageReceiver();
            this.blurImageReceiver = imageReceiver2;
            this.buttonState = -1;
            this.buttonSize = AndroidUtilities.dp(48.0f);
            this.clipPath = new Path();
            this.spoilerReveal = new SpoilerReveal();
            this.first = z10;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            imageReceiver2.setAllowLoadingOnAttachedOnly(true);
            imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                {
                    RichMediaBlock.this = this;
                }

                @Override
                public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
                    g5.a(this, i10, str, drawable);
                }

                @Override
                public void onAnimationReady(ImageReceiver imageReceiver3) {
                    RichMediaBlock.this.updateButtonState(true);
                }

                @Override
                public void didSetImage(ImageReceiver imageReceiver3, boolean z11, boolean z12, boolean z13) {
                }
            });
        }

        private int availWidth() {
            int minWidth = this.root.getMinWidth();
            Rect rect = this.padding;
            return (minWidth - rect.left) - rect.right;
        }

        private void didPressButton(boolean z10) {
            int i9 = this.buttonState;
            if (i9 == 0) {
                this.mediaForced = true;
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 != null) {
                    radialProgress2.o(0.0f, z10);
                }
                applyImage(true);
                this.buttonState = 1;
                RadialProgress2 radialProgress22 = this.radialProgress;
                if (radialProgress22 != null) {
                    radialProgress22.setIcon(3, true, z10);
                }
                View view = this.view;
                if (view != null) {
                    view.invalidate();
                }
            } else if (i9 == 1) {
                this.mediaForced = false;
                this.imageReceiver.cancelLoadImage();
                this.buttonState = 0;
                RadialProgress2 radialProgress23 = this.radialProgress;
                if (radialProgress23 != null) {
                    radialProgress23.setIcon(2, false, z10);
                }
                View view2 = this.view;
                if (view2 != null) {
                    view2.invalidate();
                }
            } else if (i9 == 2) {
                this.mediaForced = true;
                this.imageReceiver.setAllowStartAnimation(true);
                applyImage(true);
                this.imageReceiver.startAnimation();
                this.buttonState = -1;
                RadialProgress2 radialProgress24 = this.radialProgress;
                if (radialProgress24 != null) {
                    radialProgress24.setIcon(4, false, z10);
                }
                View view3 = this.view;
                if (view3 != null) {
                    view3.invalidate();
                }
            } else if (i9 == 3 && this.root.delegate != null) {
                this.root.delegate.f2(this.root.cell, getBlock());
            }
        }

        private void drawMediaSpoiler(Canvas canvas) {
            Canvas canvas2;
            if (!this.spoilerReveal.fullyRevealed()) {
                prepareBlurImage();
                float imageX = this.imageReceiver.getImageX();
                float imageY = this.imageReceiver.getImageY();
                float imageWidth = this.imageReceiver.getImageWidth();
                float imageHeight = this.imageReceiver.getImageHeight();
                if (imageWidth > 0.0f && imageHeight > 0.0f) {
                    canvas.save();
                    canvas.clipRect(imageX, imageY, imageX + imageWidth, imageY + imageHeight);
                    this.spoilerReveal.clipOut(canvas);
                    if (this.blurImageReceiver.getBitmap() != null) {
                        updateRoundRadius(this.blurImageReceiver, false);
                        this.blurImageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                        this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
                        this.blurImageReceiver.draw(canvas);
                    }
                    dh.k mediaSpoilerEffect = this.root.getMediaSpoilerEffect();
                    if (mediaSpoilerEffect != null) {
                        canvas.translate(imageX, imageY);
                        canvas2 = canvas;
                        mediaSpoilerEffect.c(canvas2, this.view, Math.round(imageWidth), Math.round(imageHeight), this.imageReceiver.getCurrentAlpha(), false);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.restore();
                    View view = this.view;
                    if (view != null) {
                        view.invalidate();
                    }
                }
            }
        }

        private void ensureProgress() {
            View view;
            View view2;
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 == null && (view2 = this.view) != null) {
                RadialProgress2 radialProgress22 = new RadialProgress2(view2, null);
                this.radialProgress = radialProgress22;
                radialProgress22.d = -1;
                radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
                RadialProgress2 radialProgress23 = this.radialProgress;
                int i9 = this.buttonX;
                int i10 = this.buttonY;
                int i11 = this.buttonSize;
                radialProgress23.q(i9, i10, i9 + i11, i11 + i10);
            } else if (radialProgress2 != null && (view = this.view) != null) {
                radialProgress2.m(view);
                RadialProgress2 radialProgress24 = this.radialProgress;
                int i12 = this.buttonX;
                int i13 = this.buttonY;
                int i14 = this.buttonSize;
                radialProgress24.q(i12, i13, i12 + i14, i14 + i13);
            }
        }

        private void prepareBlurImage() {
            Bitmap bitmap;
            if ((this.blurImageReceiver.getBitmap() == null || this.imageReceiver.getAnimation() == null) && (bitmap = this.imageReceiver.getBitmap()) != null && !bitmap.isRecycled()) {
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
        }

        private void startSpoilerReveal() {
            float imageWidth = this.imageReceiver.getImageWidth();
            float imageHeight = this.imageReceiver.getImageHeight();
            this.spoilerReveal.start(this.view, (imageWidth / 2.0f) + this.imageReceiver.getImageX(), (imageHeight / 2.0f) + this.imageReceiver.getImageY(), imageWidth, imageHeight);
        }

        private void updateRoundRadius(ImageReceiver imageReceiver, boolean z10) {
            int dp;
            int i9;
            if (z10) {
                imageReceiver.setRoundRadius(0);
                return;
            }
            int i10 = SharedConfig.bubbleRadius;
            if (i10 > 2) {
                dp = AndroidUtilities.dp(i10 - 2);
            } else {
                dp = AndroidUtilities.dp(i10);
            }
            int min = Math.min(AndroidUtilities.dp(3.0f), dp);
            if (this.first && !this.root.hasNameOffset() && (this.root.isOut() || !this.root.isPinnedTop())) {
                i9 = dp;
            } else {
                i9 = min;
            }
            if (!this.first || (this.root.isOut() && this.root.isPinnedTop())) {
                dp = min;
            }
            imageReceiver.setRoundRadius(i9, dp, min, min);
        }

        public boolean allowAutoplay() {
            return true;
        }

        public abstract void applyImage(boolean z10);

        public boolean computeAutoDownload() {
            if ((DownloadController.getInstance(this.root.currentAccount).getCurrentDownloadMask() & 1) != 0) {
                return true;
            }
            return false;
        }

        public abstract boolean fileExists();

        public void finishLayout() {
            boolean z10;
            this.imageReceiver.setImageCoords(0.0f, 0.0f, this.imgWidth, this.imgHeight);
            int i9 = this.imgWidth;
            int i10 = this.buttonSize;
            this.buttonX = (i9 - i10) / 2;
            this.buttonY = (this.imgHeight - i10) / 2;
            boolean computeAutoDownload = computeAutoDownload();
            this.autoDownload = computeAutoDownload;
            if (!computeAutoDownload && !fileExists()) {
                z10 = false;
            } else {
                z10 = true;
            }
            applyImage(z10);
        }

        public abstract TL_iv.PageBlock getBlock();

        @Override
        public void getBlockAccessibilityElementBounds(int i9, Rect rect) {
            int imageLeft = getImageLeft() + this.padding.left;
            int i10 = ((int) this.currY) + this.padding.top;
            rect.set(imageLeft, i10, this.imgWidth + imageLeft, this.imgHeight + i10);
        }

        @Override
        public int getBlockAccessibilityElementCount() {
            return 1;
        }

        @Override
        public CharSequence getBlockAccessibilityElementText(int i9) {
            int i10;
            if (isRealVideo()) {
                i10 = R.string.AttachVideo;
            } else {
                i10 = R.string.AttachPhoto;
            }
            String string = LocaleController.getString(i10);
            if (isSpoiler() && !this.spoilerReveal.fullyRevealed()) {
                return TextUtils.concat(string, ", ", LocaleController.getString(R.string.Spoiler));
            }
            return string;
        }

        public abstract String getFileName();

        @Override
        public int getHeight() {
            Rect rect = this.padding;
            return rect.top + this.imgHeight + rect.bottom;
        }

        public int getImageLeft() {
            int availWidth = availWidth();
            int i9 = this.imgWidth;
            if (availWidth > i9) {
                return (availWidth - i9) / 2;
            }
            return 0;
        }

        @Override
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.imgWidth + rect.right;
        }

        @Override
        public int getObserverTag() {
            return this.observerTag;
        }

        public boolean isAnimatedContent() {
            return false;
        }

        public boolean isRealVideo() {
            return false;
        }

        public boolean isSpoiler() {
            return false;
        }

        @Override
        public void onAttachedToWindow() {
            this.imageReceiver.setParentView(this.view);
            this.imageReceiver.onAttachedToWindow();
            this.blurImageReceiver.setParentView(this.view);
            this.blurImageReceiver.onAttachedToWindow();
            updateButtonState(false);
        }

        @Override
        public boolean onBlockAccessibilityElementClick(int i9, View view) {
            if (isSpoiler() && !this.spoilerReveal.isRevealing()) {
                startSpoilerReveal();
                return true;
            } else if (this.root.delegate != null) {
                this.root.delegate.f2(this.root.cell, getBlock());
                return true;
            } else {
                return false;
            }
        }

        @Override
        public void onDetachedFromWindow() {
            this.imageReceiver.onDetachedFromWindow();
            this.blurImageReceiver.onDetachedFromWindow();
            this.blurSource = null;
            DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i9;
            int i10;
            boolean z10;
            if (mediaBgPaint == null) {
                Paint paint = new Paint(1);
                mediaBgPaint = paint;
                paint.setColor(251658240);
            }
            int minWidth = this.root.getMinWidth();
            Rect rect = this.padding;
            int i11 = (minWidth - rect.left) - rect.right;
            boolean isInQuote = isInQuote();
            int dp = AndroidUtilities.dp(2.0f);
            if (isInQuote) {
                i9 = 0;
            } else {
                i9 = this.root.padLeft - dp;
            }
            if (isInQuote) {
                i10 = 0;
            } else {
                i10 = this.root.padRight - dp;
            }
            if (availWidth() > this.imgWidth) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isInQuote) {
                canvas.save();
                this.clipPath.rewind();
                this.clipPath.addRoundRect(0.0f, 0.0f, i11, this.imgHeight, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.clipPath(this.clipPath);
            }
            if (!this.imageReceiver.hasBitmapImage() || this.imageReceiver.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(-i9, 0.0f, i11 + i10, this.imgHeight, mediaBgPaint);
            }
            if (z10) {
                prepareBlurImage();
                updateRoundRadius(this.blurImageReceiver, false);
                updateRoundRadius(this.imageReceiver, true);
                if (this.blurImageReceiver.getBitmap() != null) {
                    this.blurImageReceiver.setImageCoords(-i9, 0.0f, i9 + i11 + i10, this.imgHeight);
                    this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
                    this.blurImageReceiver.draw(canvas);
                }
                this.imageReceiver.setAspectFit(true);
                this.imageReceiver.setImageCoords(0.0f, 0.0f, availWidth(), this.imgHeight);
            } else {
                updateRoundRadius(this.imageReceiver, false);
                this.imageReceiver.setAspectFit(false);
                this.imageReceiver.setImageCoords(-i9, 0.0f, i9 + i11 + i10, this.imgHeight);
            }
            this.imageReceiver.draw(canvas);
            if (isSpoiler() && !this.spoilerReveal.fullyRevealed()) {
                drawMediaSpoiler(canvas);
            } else if (this.radialProgress != null && this.buttonState != -1) {
                int imageLeft = getImageLeft();
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i12 = this.buttonX;
                int i13 = imageLeft + i12;
                int i14 = this.buttonY;
                int i15 = imageLeft + i12;
                int i16 = this.buttonSize;
                radialProgress2.q(i13, i14, i15 + i16, i16 + i14);
                this.radialProgress.draw(canvas);
            }
            if (isInQuote) {
                canvas.restore();
            }
        }

        @Override
        public void onFailedDownload(String str, boolean z10) {
            updateButtonState(false);
        }

        @Override
        public void onProgressDownload(String str, long j10, long j11) {
            float f10;
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                if (j11 <= 0) {
                    f10 = 0.0f;
                } else {
                    f10 = ((float) j10) / ((float) j11);
                }
                radialProgress2.o(Math.min(1.0f, f10), true);
            }
            if (this.buttonState != 1) {
                updateButtonState(true);
            }
        }

        @Override
        public void onSuccessDownload(String str) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.o(1.0f, true);
            }
            if (isAnimatedContent() && (allowAutoplay() || this.mediaForced)) {
                applyImage(true);
            }
            updateButtonState(true);
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichMessageLayout.RichMediaBlock.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public void updateButtonState(boolean z10) {
            boolean z11;
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
            org.telegram.ui.Components.x5 animation = this.imageReceiver.getAnimation();
            if (animation != null && (animation.s() || this.imageReceiver.isAnimationRunning())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!fileExists() && (!isAnimatedContent() || !z11)) {
                DownloadController.getInstance(this.root.currentAccount).addLoadingFileObserver(fileName, null, this);
                float f10 = 0.0f;
                if (!this.autoDownload && !this.mediaForced && !FileLoader.getInstance(this.root.currentAccount).isLoadingFile(fileName)) {
                    if (isRealVideo()) {
                        this.buttonState = 3;
                        RadialProgress2 radialProgress22 = this.radialProgress;
                        if (radialProgress22 != null) {
                            radialProgress22.setIcon(0, true, z10);
                        }
                    } else {
                        this.buttonState = 0;
                        RadialProgress2 radialProgress23 = this.radialProgress;
                        if (radialProgress23 != null) {
                            radialProgress23.setIcon(2, true, z10);
                        }
                    }
                } else {
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                    if (fileProgress != null) {
                        f10 = fileProgress.floatValue();
                    }
                    RadialProgress2 radialProgress24 = this.radialProgress;
                    if (radialProgress24 != null) {
                        radialProgress24.setIcon(3, true, z10);
                    }
                }
                RadialProgress2 radialProgress25 = this.radialProgress;
                if (radialProgress25 != null) {
                    radialProgress25.o(f10, false);
                }
            } else {
                DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
                if (isRealVideo() && !z11) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress26 = this.radialProgress;
                    if (radialProgress26 != null) {
                        radialProgress26.setIcon(0, false, z10);
                    }
                } else if (isAnimatedContent() && !z11 && !allowAutoplay() && !this.mediaForced) {
                    this.buttonState = 2;
                    RadialProgress2 radialProgress27 = this.radialProgress;
                    if (radialProgress27 != null) {
                        radialProgress27.setIcon(8, false, z10);
                    }
                } else {
                    this.buttonState = -1;
                    RadialProgress2 radialProgress28 = this.radialProgress;
                    if (radialProgress28 != null) {
                        radialProgress28.setIcon(4, false, z10);
                    }
                }
            }
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override
        public void onProgressUpload(String str, long j10, long j11, boolean z10) {
        }
    }
}
