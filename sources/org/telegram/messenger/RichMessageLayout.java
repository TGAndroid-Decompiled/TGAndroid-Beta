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
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ej0;
import org.telegram.ui.fj0;
import org.telegram.ui.gj0;
import org.telegram.ui.ob0;
import org.telegram.ui.v10;

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
    private org.telegram.ui.Cells.s1 cell;
    public final v10 clip;
    public final int currentAccount;
    private org.telegram.ui.Cells.j1 delegate;
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
    public final gl0 quoteLine;
    public final ArrayList<QuoteBackground> quotes;
    protected org.telegram.ui.ActionBar.c6 resourcesProvider;
    public TL_iv.RichMessage richMessage;
    private org.telegram.ui.Components.nc showMoreBounce;
    private t80 showMoreLoading;
    private Paint showMorePaint;
    private boolean showMorePressed;
    private final RectF showMoreRect;
    private pz0 showMoreText;
    private eh.j spoilerEffect2;
    public final HashMap<String, TL_iv.textAnchor> textAnchors;
    public final ArrayList<Integer> textBlockBlockIndex;
    public final ArrayList<Integer> textBlockCharOffsets;
    public final ArrayList<org.telegram.ui.Cells.u9> textBlocks;
    public final TextPaint textPaint;
    private org.telegram.ui.Components.y5 translationLoadingFloat;
    public float translationLoadingValue;
    public gj0 typingAnimator;
    public final ArrayList<RichUnsupportedBlock> unsupportedBlocks;
    public final ArrayList<RichUnsupportedBlock> unsupportedBlocksRoot;
    public View view;

    public static class FoundLink {
        public int end;
        public StaticLayout layout;
        public int originalWidth;
        public int start;

        public float f19628x;

        public float f19629y;
    }

    public static class PreviewView extends View implements org.telegram.ui.Cells.i9 {
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
        private org.telegram.ui.ActionBar.c6 resourcesProvider;
        private TL_iv.RichMessage richMessage;
        private org.telegram.ui.Cells.j9 textSelectionHelper;
        private Runnable textSelectionLongPressRunnable;
        private boolean translationLoading;

        public static final class Factory extends m41 {
            static {
                m41.setup(new Factory());
            }

            public static n41 of(TL_iv.RichMessage richMessage) {
                n41 n41VarJ = n41.J(Factory.class);
                n41VarJ.G = richMessage;
                return n41VarJ;
            }

            @Override
            public void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
                PreviewView previewView = (PreviewView) view;
                previewView.set((TL_iv.RichMessage) n41Var.G);
                previewView.setTranslationLoading(n41Var.f30838e);
            }

            @Override
            public boolean contentsEquals(n41 n41Var, n41 n41Var2) {
                return n41Var.d == n41Var2.d && n41Var.G == n41Var2.G && n41Var.f30838e == n41Var2.f30838e;
            }

            @Override
            public boolean equals(n41 n41Var, n41 n41Var2) {
                return n41Var.d == n41Var2.d;
            }

            @Override
            public boolean isClickable() {
                return false;
            }

            @Override
            public PreviewView createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
                PreviewView previewView = new PreviewView(context, i10, c6Var);
                previewView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
                return previewView;
            }
        }

        public static class PaddedTextLayoutBlock implements org.telegram.ui.Cells.u9 {
            private final org.telegram.ui.Cells.u9 inner;
            private final int px;
            private final int py;

            public PaddedTextLayoutBlock(org.telegram.ui.Cells.u9 u9Var, int i10, int i11) {
                this.inner = u9Var;
                this.px = i10;
                this.py = i11;
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

        private void buildLayout(int i10) {
            TL_iv.RichMessage richMessage;
            if (i10 <= 0 || (richMessage = this.richMessage) == null) {
                this.layout = null;
                return;
            }
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout == null || richMessageLayout.needsUpdate(richMessage, i10)) {
                RichMessageLayout richMessageLayout2 = this.layout;
                if (richMessageLayout2 != null) {
                    richMessageLayout2.detach(this);
                }
                RichMessageLayout richMessageLayout3 = new RichMessageLayout(this.messageObject, i10, (RichMessageLayout) null);
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

        public void lambda$onTouchEvent$0() {
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout == null || !richMessageLayout.isPressingLink()) {
                this.textSelectionHelper.m0();
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<org.telegram.ui.Cells.u9> arrayList) {
            if (this.layout != null) {
                int i10 = this.insetLeft;
                int i11 = this.insetTop;
                for (int i12 = 0; i12 < this.layout.textBlocks.size(); i12++) {
                    arrayList.add(new PaddedTextLayoutBlock(this.layout.textBlocks.get(i12), i10, i11));
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
            if (this.layout == null) {
                return;
            }
            float height = (getHeight() - this.insetTop) - this.insetBottom;
            boolean z10 = this.layout.getHeight() > (getHeight() - this.insetTop) - this.insetBottom;
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
            org.telegram.ui.Cells.j9 j9Var = this.textSelectionHelper;
            if (j9Var == null || !j9Var.y()) {
                return;
            }
            int i10 = this.insetLeft;
            int i11 = this.insetTop;
            for (int i12 = 0; i12 < this.layout.textBlocks.size(); i12++) {
                org.telegram.ui.Cells.u9 u9Var = this.layout.textBlocks.get(i12);
                canvas.save();
                canvas.translate(u9Var.getX() + i10, u9Var.getY() + i11);
                this.textSelectionHelper.a0(canvas, this, i12);
                canvas.restore();
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            int size = View.MeasureSpec.getSize(i10);
            buildLayout((size - this.insetLeft) - this.insetRight);
            RichMessageLayout richMessageLayout = this.layout;
            int height = (richMessageLayout != null ? richMessageLayout.getHeight() : 0) + this.insetTop + this.insetBottom;
            int i12 = this.maxHeight;
            if (i12 > 0 && height > i12) {
                height = i12;
            }
            int i13 = this.minHeight;
            if (i13 > 0 && height < i13) {
                height = i13;
            }
            int mode = View.MeasureSpec.getMode(i11);
            if (mode == Integer.MIN_VALUE) {
                height = Math.min(height, View.MeasureSpec.getSize(i11));
            } else if (mode == 1073741824) {
                height = View.MeasureSpec.getSize(i11);
            }
            setMeasuredDimension(size, height);
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
                    this.textSelectionHelper.l0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                    if (this.textSelectionLongPressRunnable == null) {
                        this.textSelectionLongPressRunnable = new rg(this, 6);
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

        public void setMaxHeight(int i10) {
            this.maxHeight = i10;
        }

        public void setMinHeight(int i10) {
            this.minHeight = i10;
        }

        @Override
        public void setPadding(int i10, int i11, int i12, int i13) {
            if (this.insetLeft == i10 && this.insetTop == i11 && this.insetRight == i12 && this.insetBottom == i13) {
                return;
            }
            this.insetLeft = i10;
            this.insetTop = i11;
            this.insetRight = i12;
            this.insetBottom = i13;
            requestLayout();
            invalidate();
        }

        public void setResourcesProvider(org.telegram.ui.ActionBar.c6 c6Var) {
            this.resourcesProvider = c6Var;
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.setResourcesProvider(c6Var);
            }
        }

        public void setTextSelectionHelper(org.telegram.ui.Cells.j9 j9Var) {
            this.textSelectionHelper = j9Var;
        }

        public void setTranslationLoading(boolean z10) {
            this.translationLoading = z10;
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.forceTranslationLoading = z10;
            }
            invalidate();
        }

        public PreviewView(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
            super(context);
            this.minHeight = -1;
            this.maxHeight = -1;
            this.allowActions = true;
            this.currentAccount = i10;
            this.resourcesProvider = c6Var;
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

        public QuoteBackground(int i10, int i11, int i12, int i13) {
            this(i10, i11, i12, i13, 0, 0);
        }

        public QuoteBackground(int i10, int i11, int i12, int i13, int i14) {
            this(i10, i11, i12, i13, i14, i14);
        }

        public QuoteBackground(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.startBlockIndex = i10;
            this.endBlockIndex = i11;
            this.padding = i12;
            this.level = i13;
            this.outerTopVpad = i14;
            this.outerBottomVpad = i15;
        }
    }

    public static abstract class RichBlock implements ej0 {
        public int accessibilityLabelResId;
        public int accessibilityParentLabelResId;
        private CheckBoxBase checkbox;
        private org.telegram.ui.Components.nc checkboxBounce;
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
        public gj0 typingAnimator;
        protected View view;
        private final RectF checkboxHit = new RectF();
        public boolean currVisible = true;
        public boolean prevVisible = true;

        public RichBlock(RichMessageLayout richMessageLayout, Rect rect, int i10) {
            this.root = richMessageLayout;
            this.padding = new Rect(rect);
            this.maxWidth = (i10 - rect.left) - rect.right;
        }

        public static void appendText(SpannableStringBuilder spannableStringBuilder, Text text, Text[] textArr) {
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

        private boolean canToggleCheckbox() {
            return (this.checkbox == null || this.checkboxItem == null || this.root.getCell() == null || this.root.getDelegate() == null || !this.root.getDelegate().W(this.root.getCell())) ? false : true;
        }

        private int getCheckboxAccessibilityElementCount() {
            return this.checkbox == null ? 0 : 1;
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
            return checkBoxBase != null && checkBoxBase.f26309q;
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
                this.checkbox.f26295a = view;
            }
            this.checkbox.f(-1, !z10, true);
            invalidateCell();
        }

        public static int lambda$withReplacements$0(Spanned spanned, org.telegram.ui.Cells.p9 p9Var, org.telegram.ui.Cells.p9 p9Var2) {
            return spanned.getSpanStart(p9Var2) - spanned.getSpanStart(p9Var);
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
            if (canToggleCheckbox()) {
                if (!MessagesController.getInstance(this.root.currentAccount).richEditorAllowed()) {
                    new ag.g2(this.root.cell.getContext(), 43, this.root.resourcesProvider).show();
                    return;
                }
                boolean z10 = !getCheckboxChecked();
                setCheckboxChecked(z10);
                View view = this.root.view;
                if (view != null) {
                    this.checkbox.f26295a = view;
                }
                this.checkbox.f(-1, z10, true);
                invalidateCell();
                View view2 = this.root.view;
                if (view2 != null) {
                    view2.performHapticFeedback(3, 2);
                }
                this.root.getDelegate().a2(this.root.getCell(), new fh.f(16, this, z10));
            }
        }

        public static CharSequence withReplacements(CharSequence charSequence) {
            if (!(charSequence instanceof Spanned)) {
                return charSequence;
            }
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Cells.p9[] p9VarArr = (org.telegram.ui.Cells.p9[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Cells.p9.class);
            if (p9VarArr == null || p9VarArr.length == 0) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Arrays.sort(p9VarArr, new rh(spanned, 0));
            for (org.telegram.ui.Cells.p9 p9Var : p9VarArr) {
                int spanStart = spanned.getSpanStart(p9Var);
                int spanEnd = spanned.getSpanEnd(p9Var);
                if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                    CharSequence charSequence2 = p9Var.f25011a;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                    spannableStringBuilder.replace(spanStart, spanEnd, charSequence2);
                }
            }
            return spannableStringBuilder;
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
                    checkBoxBase.f26304l = false;
                }
                this.view = null;
            }
            this.view = view;
            CheckBoxBase checkBoxBase2 = this.checkbox;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f26295a = view;
                checkBoxBase2.f26304l = true;
            }
            onAttachedToWindow();
        }

        public void collectAnimatorBlocks(List<ej0> list) {
            list.add(this);
        }

        public void detach(View view) {
            View view2 = this.view;
            if (view2 != null && view2 == view) {
                onDetachedFromWindow();
                CheckBoxBase checkBoxBase = this.checkbox;
                if (checkBoxBase != null) {
                    checkBoxBase.f26304l = false;
                }
                this.view = null;
            }
        }

        public void draw(Canvas canvas) {
            draw(canvas, Integer.MIN_VALUE, 0.0f);
        }

        public boolean drawOverlay(Canvas canvas) {
            return drawOverlay(canvas, null);
        }

        public void drawWithTyping(Canvas canvas) {
            gj0 gj0Var = this.typingAnimator;
            if (gj0Var != null && gj0Var.h && gj0Var.d(this) >= 0) {
                if (!gj0Var.j(this)) {
                    return;
                }
                if (gj0Var.g(this)) {
                    draw(canvas, gj0Var.g(this) ? gj0Var.f38430e : -1, gj0Var.g(this) ? gj0Var.f38431f : 0.0f);
                    return;
                }
                float fC = gj0Var.c(this);
                if (fC <= 0.0f) {
                    return;
                }
                if (fC < 1.0f) {
                    Rect rect = this.padding;
                    int iSaveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.maxWidth + rect.right, getHeight(), (int) (fC * 255.0f));
                    draw(canvas);
                    canvas.restoreToCount(iSaveLayerAlpha);
                    return;
                }
            }
            draw(canvas);
        }

        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            org.telegram.ui.Cells.u9[] text = getText();
            if (text == null) {
                return false;
            }
            for (org.telegram.ui.Cells.u9 u9Var : text) {
                if (u9Var instanceof Text) {
                    Text text2 = (Text) u9Var;
                    if (text2.fillFoundLink(characterStyle, foundLink)) {
                        Rect rect = this.padding;
                        foundLink.f19628x = rect.left - text2.left;
                        foundLink.f19629y = i10 + rect.top;
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean forcesTimeToNewLine() {
            return getLastLineWidth() >= getMinWidth();
        }

        public final void getAccessibilityElementBounds(int i10, Rect rect) {
            if (this.checkbox == null || i10 != 0) {
                getBlockAccessibilityElementBounds(i10 - getCheckboxAccessibilityElementCount(), rect);
            } else {
                int i11 = this.padding.left;
                float f10 = this.currY;
                rect.set(i11, (int) f10, this.maxWidth + i11, (int) (f10 + getHeight()));
            }
            RichMessageLayout richMessageLayout = this.root;
            int i12 = -richMessageLayout.padLeft;
            int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            int iMin = Math.min(minWidth, Math.max(rect.left, i12));
            rect.left = iMin;
            rect.right = Math.max(iMin, Math.min(rect.right, minWidth));
        }

        public final int getAccessibilityElementCount() {
            return getBlockAccessibilityElementCount() + getCheckboxAccessibilityElementCount();
        }

        public final CharSequence getAccessibilityElementStateDescription(int i10) {
            if (isAccessibilityElementCheckbox(i10)) {
                return LocaleController.getString(getCheckboxChecked() ? R.string.AccDescrChecked : R.string.AccDescrNotChecked);
            }
            return getBlockAccessibilityElementStateDescription(i10 - getCheckboxAccessibilityElementCount());
        }

        public final CharSequence getAccessibilityElementText(int i10) {
            if (this.checkbox == null || i10 != 0) {
                return getBlockAccessibilityElementText(i10 - getCheckboxAccessibilityElementCount());
            }
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

        public CharSequence getAccessibilityLabel() {
            int i10 = this.accessibilityParentLabelResId;
            String string = i10 == 0 ? null : LocaleController.getString(i10);
            int i11 = this.accessibilityLabelResId;
            String string2 = i11 != 0 ? LocaleController.getString(i11) : null;
            if (TextUtils.isEmpty(string)) {
                return string2;
            }
            return TextUtils.isEmpty(string2) ? string : TextUtils.concat(string, ", ", string2);
        }

        public CharSequence getAccessibilityListMarker() {
            StaticLayout staticLayout;
            if (!this.listOrdered || (staticLayout = this.numLayout) == null) {
                return null;
            }
            return staticLayout.getText();
        }

        public float getBackgroundScale() {
            return 1.0f;
        }

        public void getBlockAccessibilityElementBounds(int i10, Rect rect) {
            int i11 = this.padding.left;
            float f10 = this.currY;
            rect.set(i11, (int) f10, this.maxWidth + i11, (int) (f10 + getHeight()));
        }

        public int getBlockAccessibilityElementCount() {
            return 0;
        }

        public CharSequence getBlockAccessibilityElementStateDescription(int i10) {
            return null;
        }

        public CharSequence getBlockAccessibilityElementText(int i10) {
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

        public org.telegram.ui.Cells.u9[] getText() {
            return null;
        }

        public final boolean isAccessibilityElementCheckbox(int i10) {
            return this.checkbox != null && i10 == 0;
        }

        public final boolean isAccessibilityElementChecked(int i10) {
            return isAccessibilityElementCheckbox(i10) && getCheckboxChecked();
        }

        public final boolean isAccessibilityElementClickable(int i10) {
            return !isAccessibilityElementCheckbox(i10) || canToggleCheckbox();
        }

        public final boolean isAccessibilityElementText(int i10) {
            return !isAccessibilityElementCheckbox(i10) && isBlockAccessibilityElementText(i10 - getCheckboxAccessibilityElementCount());
        }

        public boolean isAttachedToWindow() {
            return this.view != null;
        }

        public boolean isBlockAccessibilityElementText(int i10) {
            return false;
        }

        public boolean isHorizontallyDragging() {
            return false;
        }

        public boolean isInQuote() {
            int iIndexOf;
            if (this.root.quotes.isEmpty() || (iIndexOf = this.root.blocks.indexOf(this)) < 0) {
                return false;
            }
            for (int i10 = 0; i10 < this.root.quotes.size(); i10++) {
                QuoteBackground quoteBackground = this.root.quotes.get(i10);
                if (iIndexOf >= quoteBackground.startBlockIndex && iIndexOf <= quoteBackground.endBlockIndex) {
                    return true;
                }
            }
            return false;
        }

        public boolean isPressingLink() {
            org.telegram.ui.Cells.u9[] text = getText();
            if (text == null) {
                return false;
            }
            for (org.telegram.ui.Cells.u9 u9Var : text) {
                if ((u9Var instanceof Text) && ((Text) u9Var).isPressingLink()) {
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
            if (richDetailsBlock.isOpen()) {
                return this.parentDetails.isVisible();
            }
            return false;
        }

        public final boolean onAccessibilityElementClick(int i10, View view) {
            if (this.checkbox == null || i10 != 0) {
                return onBlockAccessibilityElementClick(i10 - getCheckboxAccessibilityElementCount(), view);
            }
            if (!canToggleCheckbox()) {
                return false;
            }
            toggleCheckbox();
            return true;
        }

        public boolean onBlockAccessibilityElementClick(int i10, View view) {
            return false;
        }

        public void onDrawFaded(Canvas canvas, int i10, float f10) {
            onDraw(canvas);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void placeTexts(int i10, int i11, int i12) {
            this.layoutX = i10;
            this.layoutY = i11;
            this.layoutRow = i12;
            org.telegram.ui.Cells.u9[] text = getText();
            if (text == null) {
                return;
            }
            for (org.telegram.ui.Cells.u9 u9Var : text) {
                if (u9Var instanceof Text) {
                    Text text2 = (Text) u9Var;
                    text2.setX(i10 - text2.left);
                    text2.setY(i11);
                    text2.setRow(i12);
                }
            }
        }

        public void requestDisallowParentIntercept(boolean z10) {
            View view = this.view;
            if (view == null) {
                return;
            }
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(z10);
            }
        }

        public void setCheckbox(boolean z10) {
            setCheckbox(z10, null);
        }

        public void setListMarkerWidth(int i10) {
            this.listMarkerWidth = i10;
        }

        public void setNum(String str) {
            CharSequence charSequence;
            this.root.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
            Layout layout = getLayout();
            CharSequence text = layout == null ? null : layout.getText();
            if (TextUtils.isEmpty(str) || !(text instanceof Spanned) || text.length() <= 0) {
                charSequence = str;
                break;
            }
            StyleSpan[] styleSpanArr = (StyleSpan[]) ((Spanned) text).getSpans(0, 1, StyleSpan.class);
            int length = styleSpanArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    charSequence = str;
                    break;
                } else {
                    if (TLObject.hasFlag(styleSpanArr[i10].flags, 16)) {
                        SpannableString spannableString = new SpannableString(str);
                        spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 33);
                        charSequence = spannableString;
                        break;
                    }
                    i10++;
                }
            }
            int iMax = this.listMarkerWidth;
            if (iMax <= 0) {
                iMax = Math.max(this.root.isRtl() ? this.padding.right : this.padding.left, AndroidUtilities.dp(this.root.fontSize + 4));
            }
            int i11 = iMax;
            RichMessageLayout richMessageLayout = this.root;
            this.numLayout = new StaticLayout(charSequence, richMessageLayout.numTextPaint, i11, richMessageLayout.isRtl() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
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
                                this.checkboxBounce = new org.telegram.ui.Components.nc(view);
                            }
                            org.telegram.ui.Components.nc ncVar = this.checkboxBounce;
                            if (ncVar != null) {
                                ncVar.c(true);
                            }
                            invalidateCell();
                            return true;
                        }
                    } else if (this.checkboxPressed) {
                        if (actionMasked == 2) {
                            if (!zContains) {
                                this.checkboxPressed = false;
                                org.telegram.ui.Components.nc ncVar2 = this.checkboxBounce;
                                if (ncVar2 != null) {
                                    ncVar2.c(false);
                                }
                            }
                        } else if (actionMasked == 1 || actionMasked == 3) {
                            boolean z10 = actionMasked == 1 && zContains;
                            this.checkboxPressed = false;
                            org.telegram.ui.Components.nc ncVar3 = this.checkboxBounce;
                            if (ncVar3 != null) {
                                ncVar3.c(false);
                            }
                            if (z10) {
                                toggleCheckbox();
                            }
                            invalidateCell();
                        }
                        return true;
                    }
                }
                return onTouchEvent(motionEvent);
            } finally {
                Rect rect2 = this.padding;
                motionEvent.offsetLocation(rect2.left, rect2.top);
            }
        }

        public final void updateListMarkerY() {
            if (this.numLayout != null) {
                if (getLayout() == null || getLayout().getLineCount() <= 0 || this.numLayout.getLineCount() <= 0) {
                    int iDp = AndroidUtilities.dp(this.root.fontSize + 14);
                    int height = getHeight();
                    Rect rect = this.padding;
                    this.numLayoutY = (Math.min(iDp, (height - rect.top) - rect.bottom) - this.numLayout.getHeight()) / 2.0f;
                } else {
                    this.numLayoutY = (getLayout().getLineBaseline(0) + getContentPaddingTop()) - this.numLayout.getLineBaseline(0);
                }
            }
            if (this.checkbox != null) {
                if (getLayout() != null && getLayout().getLineCount() > 0) {
                    this.checkboxY = (getLayout().getLineBaseline(0) + getContentPaddingTop()) - (AndroidUtilities.dp(20.0f) * 0.7f);
                } else {
                    int iDp2 = AndroidUtilities.dp(this.root.fontSize + 14);
                    int height2 = getHeight();
                    Rect rect2 = this.padding;
                    this.checkboxY = (Math.min(iDp2, (height2 - rect2.top) - rect2.bottom) - AndroidUtilities.dp(20.0f)) / 2.0f;
                }
            }
        }

        public void draw(Canvas canvas, int i10, float f10) {
            canvas.save();
            Rect rect = this.padding;
            canvas.translate(rect.left, rect.top);
            boolean zIsRtl = this.root.isRtl();
            int minWidth = (this.root.getMinWidth() + this.root.padRight) - AndroidUtilities.dp(14.0f);
            Rect rect2 = this.padding;
            float f11 = (minWidth - rect2.right) - rect2.left;
            if (this.numLayout != null) {
                this.root.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                RichMessageLayout richMessageLayout = this.root;
                richMessageLayout.numTextPaint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.fc : org.telegram.ui.ActionBar.g6.f23077ec));
                canvas.save();
                if (!this.listOrdered && !this.listCheckbox) {
                    float fDpf2 = AndroidUtilities.dpf2(4.3f);
                    canvas.drawCircle(zIsRtl ? ((AndroidUtilities.dp(18.0f) + f11) - AndroidUtilities.dpf2(5.66f)) - (fDpf2 / 2.0f) : ((fDpf2 / 2.0f) + AndroidUtilities.dpf2(5.66f)) - AndroidUtilities.dp(18.0f), (this.numLayoutY + this.numLayout.getLineBaseline(0)) - (AndroidUtilities.dp(SharedConfig.fontSize) * 0.35f), fDpf2 / 2.0f, this.root.numTextPaint);
                } else if (zIsRtl) {
                    canvas.translate(((AndroidUtilities.dp(6.0f) + f11) - this.numLayoutLeft) + (this.checkbox != null ? AndroidUtilities.dp(26.0f) : 0), this.numLayoutY);
                    this.numLayout.draw(canvas);
                } else {
                    canvas.translate((AndroidUtilities.dp(6.0f) - this.listMarkerWidth) - this.numLayoutLeft, this.numLayoutY);
                    this.numLayout.draw(canvas);
                }
                canvas.restore();
            }
            if (this.checkbox != null) {
                int iDp = zIsRtl ? (int) (f11 + AndroidUtilities.dp(6.0f)) : -AndroidUtilities.dp(26.0f);
                this.checkboxHit.set(iDp - AndroidUtilities.dp(6.0f), this.checkboxY - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + iDp, this.checkboxY + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(6.0f));
                View view = this.root.view;
                if (view != null) {
                    CheckBoxBase checkBoxBase = this.checkbox;
                    if (checkBoxBase.f26295a == null) {
                        checkBoxBase.f26295a = view;
                    }
                }
                org.telegram.ui.Components.nc ncVar = this.checkboxBounce;
                float fA = ncVar != null ? ncVar.a(0.1f) : 1.0f;
                canvas.save();
                canvas.scale(fA, fA, AndroidUtilities.dp(10.0f) + iDp, this.checkboxY + AndroidUtilities.dp(10.0f));
                this.checkbox.e(iDp, (int) this.checkboxY, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.checkbox.a(canvas);
                canvas.restore();
            }
            if (i10 == Integer.MIN_VALUE) {
                onDraw(canvas);
            } else {
                onDrawFaded(canvas, i10, f10);
            }
            canvas.restore();
        }

        public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
            Text text;
            org.telegram.ui.Components.p5 p5Var;
            org.telegram.ui.Cells.u9[] text2 = getText();
            if (text2 == null) {
                return false;
            }
            boolean z10 = false;
            for (org.telegram.ui.Cells.u9 u9Var : text2) {
                if ((u9Var instanceof Text) && (p5Var = (text = (Text) u9Var).animatedEmojiStack) != null && !p5Var.f31503a.isEmpty()) {
                    canvas.save();
                    canvas.translate(text.f19634x, text.f19635y - this.currY);
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
                checkBoxBase.h(org.telegram.ui.ActionBar.g6.hl, org.telegram.ui.ActionBar.g6.f23440z5, org.telegram.ui.ActionBar.g6.f23182k7);
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
        private final s00 colorSpan;
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
        public t80 loadingDrawable;
        private final RectF loadingRect;
        private final int maxWidth;
        private boolean needSaveLayer;
        private final boolean out;
        public final TL_keyboard.PageButton pageButton;
        public ValueAnimator pressAnimator;
        public float pressT;
        public boolean pressed;
        public final TL_keyboard.RichButtonStyle style;
        private final org.telegram.ui.ActionBar.y5 styleKeys;
        public final Text text;
        public int textColor;
        private ColorFilter textColorFilter;
        public int textColorKey;
        private final RectF textFadeRect;
        public final TL_keyboard.InlineButtonType type;
        public int width;

        public int f19633x;

        static {
            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
            SRC_OUT = porterDuffXfermode;
            Paint paint = new Paint();
            SRC_OUT_PAINT = paint;
            paint.setXfermode(porterDuffXfermode);
        }

        public RichButton(RichMessageLayout richMessageLayout, int i10, TL_keyboard.PageButton pageButton, Runnable runnable) {
            this(richMessageLayout, i10, richMessageLayout.formatText(pageButton.text, RichMessageLayout.setBlockFlags(16, 13)), pageButton, pageButton.type, pageButton.style, hf.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), true, false, false, false, false, null, runnable);
        }

        private void drawLoading(Canvas canvas) {
            boolean z10 = (this.pageButton == null || this.layout.cell == null || !this.layout.cell.G1(this.pageButton)) ? false : true;
            setLoading(z10);
            t80 t80Var = this.loadingDrawable;
            if (t80Var != null) {
                if (z10 || t80Var.c()) {
                    float strokeWidth = this.loadingDrawable.f32710w.getStrokeWidth();
                    this.loadingRect.set(0.0f, 0.0f, this.width, getHeight());
                    float f10 = strokeWidth / 2.0f;
                    this.loadingRect.inset(f10, f10);
                    this.loadingDrawable.h((getHeight() / 2.0f) - f10);
                    this.loadingDrawable.d(this.loadingRect);
                    this.loadingDrawable.f(org.telegram.ui.ActionBar.g6.l1(0.07f, this.textColor), org.telegram.ui.ActionBar.g6.l1(0.175f, this.textColor), org.telegram.ui.ActionBar.g6.l1(0.175f, this.textColor), org.telegram.ui.ActionBar.g6.l1(0.42f, this.textColor));
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
                return ob0.l(((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url) ? R.drawable.bot_webview : R.drawable.mini_inline_arrow_16;
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

        private int getTextAvailableWidth() {
            return Math.max(1, getTextViewportRight() - getTextViewportLeft());
        }

        private int getTextViewportLeft() {
            if (this.link) {
                return 0;
            }
            return this.inline ? getPaddingLeft() : AndroidUtilities.dp(8.0f);
        }

        private int getTextViewportRight() {
            int i10;
            int iMax;
            if (this.link) {
                return this.width;
            }
            if (this.inline) {
                i10 = this.width;
                iMax = getPaddingRight();
            } else {
                i10 = this.width;
                iMax = Math.max(AndroidUtilities.dp(8.0f), getIconReserve());
            }
            return i10 - iMax;
        }

        public void lambda$setPressed$0(ValueAnimator valueAnimator) {
            this.pressT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.invalidateRunnable.run();
        }

        public void attach(View view) {
            this.text.attach(view);
        }

        public boolean contains(float f10) {
            int i10 = this.f19633x;
            return f10 >= ((float) i10) && f10 <= ((float) (i10 + this.width));
        }

        public void detach(View view) {
            this.text.detach(view);
        }

        public void draw(Canvas canvas) {
            Canvas canvas2;
            float f10;
            float f11;
            float f12;
            float pressScale = getPressScale();
            canvas.save();
            if (pressScale != 1.0f) {
                canvas.scale(pressScale, pressScale, this.width / 2.0f, getHeight() / 2.0f);
            }
            boolean z10 = this.link;
            boolean z11 = this.needSaveLayer && !z10;
            if (z11) {
                canvas.saveLayer(0.0f, 0.0f, this.width, getHeight(), null);
            } else {
                this.backgroundPaint.setColor(this.pressed ? this.backgroundPressedColor : this.backgroundColor);
                if (!z10) {
                    canvas.drawRoundRect(0.0f, 0.0f, this.width, getHeight(), getHeight() / 2.0f, getHeight() / 2.0f, this.backgroundPaint);
                }
                drawLoading(canvas);
            }
            canvas.save();
            int textViewportLeft = getTextViewportLeft();
            int textViewportRight = getTextViewportRight();
            boolean z12 = getTextWidth() > getTextAvailableWidth();
            if (z12) {
                canvas2 = canvas;
                canvas2.saveLayer(textViewportLeft, -AndroidUtilities.dp(10.0f), textViewportRight, AndroidUtilities.dp(10.0f) + getHeight(), null);
            } else {
                canvas2 = canvas;
            }
            canvas2.clipRect(textViewportLeft, -AndroidUtilities.dp(10.0f), textViewportRight, AndroidUtilities.dp(10.0f) + getHeight());
            canvas2.save();
            int baseline = this.text.getBaseline();
            boolean z13 = this.text.getEmojiOnlyCount() > 0;
            if (z13) {
                canvas2.translate(getTextX() - this.text.left, (getHeight() - this.text.getHeight()) / 2.0f);
            } else if (baseline <= 0) {
                canvas2.translate(getTextX() - this.text.left, ((getHeight() - this.text.getHeight()) / 2.0f) - AndroidUtilities.dp(1.0f));
            } else if (this.inline) {
                canvas2.translate(getTextX() - this.text.left, (-baseline) + ((getHeight() * 43) / 56));
            } else {
                canvas2.translate(getTextX() - this.text.left, (-baseline) + ((getHeight() * 65) / 102));
            }
            this.text.draw(canvas2);
            if (this.layout.isOverlayActive()) {
                if (z13) {
                    f12 = 0.0f;
                } else {
                    f12 = this.link ? 0.66f : 2.0f;
                }
                canvas2.translate(0.0f, AndroidUtilities.dp(f12));
                if (this.link) {
                    int i10 = this.text.layout.getPaint().linkColor;
                    if (this.lastLinkColorFilterColor != i10 || this.linkColorFilter == null) {
                        this.lastLinkColorFilterColor = i10;
                        this.linkColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
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
            if (z12) {
                this.textFadeRect.set(textViewportRight - AndroidUtilities.dp(8.0f), f10, textViewportRight, getHeight());
                this.layout.clip.b(canvas2, this.textFadeRect, 2, 1.0f);
                canvas2.restore();
            }
            canvas2.restore();
            Drawable drawable = this.iconDrawable;
            if (drawable != null) {
                gf.s.d(drawable, this.width - AndroidUtilities.dp(12.33f), AndroidUtilities.dp(this.inline ? 9.33f : 11.66f), 17);
                this.iconDrawable.draw(canvas2);
            }
            if (z11) {
                Paint paint = SRC_OUT_PAINT;
                paint.setColor(this.pressed ? this.backgroundPressedColor : this.backgroundColor);
                canvas2.drawRoundRect(0.0f, 0.0f, this.width, getHeight(), getHeight() / f11, getHeight() / f11, paint);
                canvas.restore();
                drawLoading(canvas);
            }
            canvas.restore();
        }

        public int getHeight() {
            return AndroidUtilities.dp(this.inline ? this.layout.fontSize * 1.166666f : this.layout.fontSize + 18);
        }

        public int getIconReserve() {
            if (this.iconDrawable == null) {
                return 0;
            }
            return (AndroidUtilities.dp(11.66f) / 2) + AndroidUtilities.dp(12.33f);
        }

        public int getMinWidth() {
            return Math.min(getPreferredWidth(), getIconReserve() + getHeight());
        }

        public int getPaddingLeft() {
            if (this.link) {
                return 0;
            }
            if (this.emojiFirst && this.inline) {
                return AndroidUtilities.dp(4.0f);
            }
            if (this.inline) {
                return AndroidUtilities.dp(7.0f);
            }
            return AndroidUtilities.dp(this.iconDrawable != null ? 26.0f : 20.0f);
        }

        public int getPaddingRight() {
            if (this.link) {
                return 0;
            }
            if (this.emojiLast && this.inline) {
                return AndroidUtilities.dp((this.iconDrawable != null ? 14 : 0) + 4);
            }
            if (this.inline) {
                return AndroidUtilities.dp((this.iconDrawable != null ? 14 : 0) + 7);
            }
            return AndroidUtilities.dp(this.iconDrawable != null ? 26.0f : 20.0f);
        }

        public int getPreferredWidth() {
            return Math.min(this.maxWidth, getPaddingRight() + getPaddingLeft() + getTextWidth());
        }

        public float getPressScale() {
            if (this.pressed) {
                float f10 = this.pressT;
                if (f10 != 1.0f) {
                    float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10;
                    this.pressT = fMin;
                    this.pressT = Utilities.clamp(fMin, 1.0f, 0.0f);
                    this.invalidateRunnable.run();
                }
            }
            float f11 = this.inline ? 0.09f : 0.04f;
            return com.google.android.recaptcha.internal.a.z(1.0f, this.pressT, f11, 1.0f - f11);
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
            return this.iconDrawable == null ? (this.width - getTextWidth()) / 2.0f : Math.max(Math.min((this.width - getTextWidth()) / 2.0f, (this.width - getIconReserve()) - getTextWidth()), AndroidUtilities.dp(8.0f));
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
                t80 t80Var = this.loadingDrawable;
                if (t80Var == null) {
                    t80 t80Var2 = new t80();
                    this.loadingDrawable = t80Var2;
                    t80Var2.C = true;
                    t80Var2.f32710w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                } else {
                    t80Var.f32692b = -1L;
                    t80Var.f32693c = -1L;
                }
            } else {
                t80 t80Var3 = this.loadingDrawable;
                if (t80Var3 != null) {
                    t80Var3.a();
                }
            }
            this.invalidateRunnable.run();
        }

        public void setPressed(boolean z10) {
            if (this.pressed == z10) {
                return;
            }
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
            float f10 = this.pressT;
            if (f10 != 0.0f) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.pressAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new o(this, 1));
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

        public void setTextColorKey(int i10) {
            this.textColorKey = i10;
            int themedColor = this.layout.getThemedColor(i10);
            if (this.isDisabled) {
                themedColor = org.telegram.ui.ActionBar.g6.l1(0.5f, themedColor);
            }
            if (themedColor != this.textColor || this.textColorFilter == null) {
                this.textColor = themedColor;
                this.textColorFilter = new PorterDuffColorFilter(this.textColor, PorterDuff.Mode.SRC_IN);
            }
            this.colorSpan.f32287b = i10;
            this.invalidateRunnable.run();
            Drawable drawable = this.iconDrawable;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.textColor, PorterDuff.Mode.MULTIPLY));
            }
        }

        public void updateColors() {
            boolean z10;
            org.telegram.ui.ActionBar.c6 c6Var = this.layout.resourcesProvider;
            boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
            if (this.out && zA) {
                int themedColor = this.layout.getThemedColor(org.telegram.ui.ActionBar.g6.Da);
                int themedColor2 = this.layout.getThemedColor(org.telegram.ui.ActionBar.g6.Ea);
                int themedColor3 = this.layout.getThemedColor(org.telegram.ui.ActionBar.g6.Fa);
                if (themedColor == 0 && themedColor2 == 0 && themedColor3 == 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.y5 y5Var = this.styleKeys;
            if (z10 && y5Var != org.telegram.ui.ActionBar.y5.PRIMARY) {
                y5Var = org.telegram.ui.ActionBar.y5.DEFAULT;
            }
            boolean z11 = this.out;
            int i10 = z11 ? y5Var.d : y5Var.f23978a;
            int i11 = z11 ? y5Var.f23981e : y5Var.f23979b;
            int i12 = z11 ? y5Var.f23982f : y5Var.f23980c;
            int themedColor4 = this.layout.getThemedColor(i12);
            this.needSaveLayer = false;
            if (z10 && y5Var == org.telegram.ui.ActionBar.y5.PRIMARY) {
                int themedColor5 = this.layout.getThemedColor(i12);
                this.backgroundPressedColor = themedColor5;
                this.backgroundColor = themedColor5;
                this.needSaveLayer = true;
            } else {
                if (org.telegram.ui.ActionBar.g6.c1(i10) || y5Var == org.telegram.ui.ActionBar.y5.PRIMARY) {
                    this.backgroundColor = this.layout.getThemedColor(i10);
                    if (org.telegram.ui.ActionBar.g6.c1(i11)) {
                        this.backgroundPressedColor = this.layout.getThemedColor(i11);
                    } else {
                        this.backgroundPressedColor = i0.b.d(0.1f, this.backgroundColor, themedColor4);
                    }
                } else {
                    this.backgroundColor = org.telegram.ui.ActionBar.g6.l1(y5Var == org.telegram.ui.ActionBar.y5.DEFAULT ? 0.08f : 0.1f, this.layout.getThemedColor(i12));
                    this.backgroundPressedColor = org.telegram.ui.ActionBar.g6.l1(0.16f, this.layout.getThemedColor(i12));
                }
            }
            setTextColorKey(i12);
        }

        public RichButton(RichMessageLayout richMessageLayout, int i10, CharSequence charSequence, TL_keyboard.PageButton pageButton, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Boolean bool, Runnable runnable) {
            org.telegram.ui.ActionBar.y5 y5Var;
            this.backgroundPaint = new Paint(1);
            this.loadingRect = new RectF();
            this.textFadeRect = new RectF();
            this.layout = richMessageLayout;
            this.maxWidth = Math.max(1, i10);
            this.invalidateRunnable = runnable;
            this.pageButton = pageButton;
            this.type = inlineButtonType;
            this.style = richButtonStyle;
            this.isDisabled = z10;
            this.emojiFirst = z12;
            this.emojiLast = z13;
            this.inline = z15;
            this.link = z14;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : richMessageLayout.isOut();
            this.out = zBooleanValue;
            if (richButtonStyle != null) {
                org.telegram.ui.ActionBar.y5 y5Var2 = org.telegram.ui.ActionBar.y5.DEFAULT;
                if (richButtonStyle.bg_primary) {
                    y5Var = org.telegram.ui.ActionBar.y5.PRIMARY;
                } else if (richButtonStyle.bg_danger) {
                    y5Var = org.telegram.ui.ActionBar.y5.DANGER;
                } else if (richButtonStyle.bg_success) {
                    y5Var = org.telegram.ui.ActionBar.y5.SUCCESS;
                } else {
                    y5Var = org.telegram.ui.ActionBar.y5.DEFAULT;
                }
            } else {
                y5Var = org.telegram.ui.ActionBar.y5.DEFAULT;
            }
            if (y5Var == org.telegram.ui.ActionBar.y5.DEFAULT && z15) {
                y5Var = org.telegram.ui.ActionBar.y5.DEFAULT_IN_TEXT;
            }
            this.styleKeys = y5Var;
            s00 s00Var = new s00(zBooleanValue ? y5Var.f23982f : y5Var.f23980c, null);
            this.colorSpan = s00Var;
            s00Var.f32288c = z10 ? 0.5f : 1.0f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            if (z14) {
                spannableStringBuilder.setSpan(new r41("", (xz0) null), 0, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.setSpan(s00Var, 0, spannableStringBuilder.length(), 33);
            }
            AndroidUtilities.replaceNewLines(spannableStringBuilder);
            Math.max(1, AndroidUtilities.dp(2.0f) + ((int) Math.ceil(Layout.getDesiredWidth(spannableStringBuilder, richMessageLayout.textPaint))));
            Text text = new Text(richMessageLayout, spannableStringBuilder, 100000, Layout.Alignment.ALIGN_CENTER);
            this.text = text;
            text.setDrawAtOrigin(true);
            text.doNotInvalidateEmojiInParent = true;
            int buttonIcon = z11 ? getButtonIcon(inlineButtonType) : 0;
            if (buttonIcon != 0) {
                this.iconDrawable = ApplicationLoader.applicationContext.getResources().getDrawable(buttonIcon).mutate();
            }
            this.width = getPreferredWidth();
            updateColors();
        }
    }

    public static class RichButtonRowBlock extends RichBlock {
        private static final int GAP = 7;
        private final Align align;
        private final RichButton[] buttons;
        private final vd.b clickHelper;
        private int layoutWidth;
        private RichButton pressedButton;
        private RichButton touchButton;

        public enum Align {
            LEFT,
            RIGHT,
            CENTER,
            FILL
        }

        public RichButtonRowBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
            super(richMessageLayout, rect, i10);
            this.layoutWidth = -1;
            this.clickHelper = new vd.b(new vd.a() {
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
                    RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                    if (buttonAt == null || buttonAt.isDisabled) {
                        buttonAt = null;
                    }
                    richButtonRowBlock.touchButton = buttonAt;
                    return RichButtonRowBlock.this.touchButton != null;
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
                    RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                    richButtonRowBlock.setPressedButton(richButtonRowBlock.getButtonAt(f10, f11) == RichButtonRowBlock.this.touchButton ? RichButtonRowBlock.this.touchButton : null);
                }

                @Override
                public void onClickTouchUp(View view, float f10, float f11) {
                    RichButtonRowBlock.this.setPressedButton(null);
                    RichButtonRowBlock.this.touchButton = null;
                }

                @Override
                public boolean onLongPressRequestedAt(View view, float f10, float f11) {
                    if (RichButtonRowBlock.this.touchButton == null || RichButtonRowBlock.this.getButtonAt(f10, f11) != RichButtonRowBlock.this.touchButton) {
                        return false;
                    }
                    RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                    richButtonRowBlock.onButtonLongClick(richButtonRowBlock.touchButton);
                    return true;
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
            for (int i11 = 0; i11 < size; i11++) {
                this.buttons[i11] = new RichButton(richMessageLayout, i10, pageblockbuttonrow.buttons.get(i11), new rg(this, 7));
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
            updateLayout();
            RichButton[] richButtonArr = this.buttons;
            int iDp = richButtonArr.length == 0 ? AndroidUtilities.dp(this.root.fontSize + 18) : richButtonArr[0].getHeight();
            float height = (getHeight() - iDp) / 2.0f;
            if (f11 >= height && f11 <= height + iDp) {
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
            int iDp = (length - 1) * AndroidUtilities.dp(7.0f);
            for (RichButton richButton : this.buttons) {
                iDp += richButton.getPreferredWidth();
            }
            return Math.min(this.maxWidth, iDp);
        }

        public void invalidate() {
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        private void layout(int i10) {
            this.layoutWidth = i10;
            int length = this.buttons.length;
            if (length == 0) {
                return;
            }
            int iDp = AndroidUtilities.dp(7.0f);
            int i11 = (length - 1) * iDp;
            int iMax = Math.max(0, i10 - i11);
            int i12 = 0;
            for (RichButton richButton : this.buttons) {
                int preferredWidth = richButton.getPreferredWidth();
                richButton.width = preferredWidth;
                i12 += preferredWidth;
            }
            if (i12 > iMax) {
                squeeze(iMax, i12);
            } else if (this.align == Align.FILL) {
                stretch(iMax);
            }
            for (RichButton richButton2 : this.buttons) {
                i11 += richButton2.width;
            }
            int iOrdinal = this.align.ordinal();
            int i13 = iOrdinal != 1 ? iOrdinal != 2 ? 0 : (i10 - i11) / 2 : i10 - i11;
            for (RichButton richButton3 : this.buttons) {
                richButton3.f19633x = i13;
                i13 += richButton3.width + iDp;
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

        private void squeeze(int i10, int i11) {
            int i12 = 0;
            int minWidth = 0;
            for (RichButton richButton : this.buttons) {
                minWidth += richButton.width - richButton.getMinWidth();
            }
            if (minWidth <= 0) {
                RichButton[] richButtonArr = this.buttons;
                int length = richButtonArr.length;
                while (i12 < length) {
                    RichButton richButton2 = richButtonArr[i12];
                    richButton2.width = richButton2.getMinWidth();
                    i12++;
                }
                return;
            }
            int iMin = Math.min(i11 - i10, minWidth);
            int i13 = 0;
            while (true) {
                RichButton[] richButtonArr2 = this.buttons;
                if (i12 >= richButtonArr2.length) {
                    return;
                }
                RichButton richButton3 = richButtonArr2[i12];
                int minWidth2 = richButton3.width - richButton3.getMinWidth();
                int iMin2 = Math.min(i12 == this.buttons.length + (-1) ? iMin - i13 : (int) ((((long) iMin) * ((long) minWidth2)) / ((long) minWidth)), minWidth2);
                richButton3.width -= iMin2;
                i13 += iMin2;
                i12++;
            }
        }

        private void stretch(int i10) {
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
                int i12 = i10 / length;
                int i13 = 0;
                while (true) {
                    RichButton[] richButtonArr2 = this.buttons;
                    if (i13 < richButtonArr2.length) {
                        if (!zArr[i13] && (i11 = richButtonArr2[i13].width) > i12) {
                            zArr[i13] = true;
                            i10 -= i11;
                            length--;
                            z11 = true;
                        }
                        i13++;
                    }
                }
                z10 = z11;
            }
            if (length <= 0) {
                return;
            }
            int i14 = i10 / length;
            int i15 = i10 - (length * i14);
            int i16 = 0;
            while (true) {
                RichButton[] richButtonArr3 = this.buttons;
                if (i16 >= richButtonArr3.length) {
                    return;
                }
                if (!zArr[i16]) {
                    int i17 = i15 - 1;
                    richButtonArr3[i16].width = (i15 > 0 ? 1 : 0) + i14;
                    i15 = i17;
                }
                i16++;
            }
        }

        private void updateLayout() {
            int minWidth = this.root.getMinWidth();
            RichMessageLayout richMessageLayout = this.root;
            int i10 = richMessageLayout.padLeft;
            int i11 = ((minWidth + i10) + richMessageLayout.padRight) - (i10 * 2);
            Rect rect = this.padding;
            int iMax = Math.max(0, (i11 - rect.left) - rect.right);
            if (this.layoutWidth != iMax) {
                layout(iMax);
            }
        }

        @Override
        public void draw(Canvas canvas) {
            updateLayout();
            for (RichButton richButton : this.buttons) {
                canvas.save();
                canvas.translate(richButton.f19633x, Math.round((getHeight() - richButton.getHeight()) / 2.0f));
                richButton.draw(canvas);
                canvas.restore();
            }
        }

        @Override
        public int getHeight() {
            RichButton[] richButtonArr = this.buttons;
            return AndroidUtilities.dp(4.333f) + this.padding.top + (richButtonArr.length == 0 ? AndroidUtilities.dp(this.root.fontSize + 18) : richButtonArr[0].getHeight()) + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            return this.padding.left + getIntrinsicWidth() + this.padding.right;
        }

        @Override
        public boolean isHorizontallyDragging() {
            return this.touchButton != null;
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

        private static void expandFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10) {
            int i11 = fontMetricsInt.descent;
            int i12 = fontMetricsInt.ascent;
            int i13 = i11 - i12;
            if (i10 <= i13) {
                return;
            }
            int i14 = i10 - i13;
            int i15 = (i14 + 1) / 2;
            int i16 = i12 - i15;
            fontMetricsInt.ascent = i16;
            fontMetricsInt.descent = i11 + (i14 - i15);
            fontMetricsInt.top = Math.min(fontMetricsInt.top, i16);
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

        public void didPress(org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Cells.j1 j1Var, boolean z10) {
            if (s1Var == null || j1Var == null) {
                return;
            }
            if (z10) {
                j1Var.y1(s1Var, this.textButton);
            } else {
                j1Var.e1(s1Var, this.textButton);
            }
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
            float f11;
            int i15 = (this.button.text.getEmojiOnlyCount() <= 0 || this.minimumLineHeight <= 0) ? 0 : 1;
            if (i15 == 0 && this.button.text.getEmojiOnlyCount() > 0 && (charSequence instanceof Spanned)) {
                StyleSpan[] styleSpanArr = (StyleSpan[]) ((Spanned) charSequence).getSpans(i10, i11, StyleSpan.class);
                for (StyleSpan styleSpan : styleSpanArr) {
                    if ((styleSpan.flags & 15) == 14) {
                        i15 = 1;
                        break;
                    }
                }
            }
            if (i15 != 0) {
                f11 = (i12 + i14) / 2.0f;
            } else {
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                f11 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + i13;
            }
            canvas.save();
            int iRound = Math.round(f10 + (this.button.link ? 0 : AndroidUtilities.dp(1.0f)));
            int iCeil = (int) Math.ceil((f11 - (this.button.getHeight() / 2.0f)) + (i15 ^ 1));
            RectF rectF = this.bounds;
            float f12 = iRound;
            float f13 = iCeil;
            RichButton richButton = this.button;
            rectF.set(f12, f13, iRound + richButton.width, richButton.getHeight() + iCeil);
            canvas.translate(f12, f13);
            this.button.draw(canvas);
            canvas.restore();
        }

        public RichButton getButton() {
            return this.button;
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
            boolean z10 = this.preserveFontMetrics && fontMetricsInt != null;
            int i12 = z10 ? fontMetricsInt.top : 0;
            int i13 = z10 ? fontMetricsInt.ascent : 0;
            int i14 = z10 ? fontMetricsInt.descent : 0;
            int i15 = z10 ? fontMetricsInt.bottom : 0;
            int i16 = z10 ? fontMetricsInt.leading : 0;
            int iDp = AndroidUtilities.dp(8.0f);
            int iDp2 = AndroidUtilities.dp(10.0f);
            if (fontMetricsInt != null && this.button.link) {
                float f10 = (-iDp2) - iDp;
                float f11 = this.scale;
                fontMetricsInt.top = (int) (f10 * f11);
                float f12 = iDp2 - iDp;
                fontMetricsInt.bottom = (int) (f12 * f11);
                fontMetricsInt.ascent = (int) (f10 * f11);
                fontMetricsInt.descent = (int) (f12 * f11);
                fontMetricsInt.leading = 0;
            }
            if (z10) {
                fontMetricsInt.top = i12;
                fontMetricsInt.ascent = i13;
                fontMetricsInt.descent = i14;
                fontMetricsInt.bottom = i15;
                fontMetricsInt.leading = i16;
                expandFontMetrics(fontMetricsInt, this.minimumLineHeight);
            }
            RichButton richButton = this.button;
            return richButton.width + (richButton.link ? 0 : AndroidUtilities.dp(1.0f) * 2);
        }

        public boolean isDisabled() {
            return this.button.isDisabled;
        }

        public void setPressed(boolean z10) {
            this.button.setPressed(z10);
        }

        public RichButtonSpan(RichMessageLayout richMessageLayout, int i10, TL_iv.textButton textbutton) {
            this(richMessageLayout, i10, textbutton, null);
        }

        public boolean contains(float f10, float f11, float f12) {
            RectF rectF = this.bounds;
            return f10 >= rectF.left - f12 && f10 < rectF.right + f12 && f11 >= rectF.top - f12 && f11 < rectF.bottom + f12;
        }

        private RichButtonSpan(RichMessageLayout richMessageLayout, int i10, TL_iv.textButton textbutton, Boolean bool) {
            boolean z10;
            boolean z11;
            int blockFlags;
            this.bounds = new RectF();
            this.textButton = textbutton;
            TL_iv.RichText richText = textbutton.text;
            if (richText instanceof TL_iv.textConcat) {
                TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
                if (textconcat.texts.isEmpty()) {
                    z10 = false;
                    z11 = false;
                } else {
                    boolean z12 = textconcat.texts.get(0) instanceof TL_iv.textCustomEmoji;
                    z11 = i0.a.i(1, textconcat.texts) instanceof TL_iv.textCustomEmoji;
                    z10 = z12;
                }
            } else {
                z10 = false;
                z11 = false;
            }
            TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
            boolean z13 = richButtonStyle != null && richButtonStyle.link;
            if (z13) {
                blockFlags = RichMessageLayout.setBlockFlags(512, 0);
            } else {
                blockFlags = RichMessageLayout.setBlockFlags(16, 13);
            }
            CharSequence text = richMessageLayout.formatText(textbutton.text, blockFlags);
            TL_keyboard.InlineButtonType inlineButtonType = textbutton.type;
            RichButton richButton = new RichButton(richMessageLayout, i10, text, null, inlineButtonType, textbutton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, true, z10, z11, z13, true, bool, new rg(this, 8));
            this.button = richButton;
            richButton.width = richButton.getPreferredWidth();
        }
    }

    public static class RichCaptionBlock extends RichBlock {
        public final Text caption;
        public final Text credit;
        public final boolean rtl;
        private final org.telegram.ui.Cells.u9[] texts;

        public RichCaptionBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence, CharSequence charSequence2) {
            super(richMessageLayout, rect, i10);
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
            this.texts = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
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
            if (this.caption == null || this.credit == null) {
                return 0;
            }
            return AndroidUtilities.dp(4.0f);
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
            int i10;
            Text text = this.credit;
            if (text != null) {
                lastLineWidth = text.getLastLineWidth() + this.padding.left;
                i10 = this.padding.right;
            } else {
                Text text2 = this.caption;
                if (text2 == null) {
                    Rect rect = this.padding;
                    return rect.left + rect.right;
                }
                lastLineWidth = text2.getLastLineWidth() + this.padding.left;
                i10 = this.padding.right;
            }
            return lastLineWidth + i10;
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
        public org.telegram.ui.Cells.u9[] getText() {
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
            int iCaptionHeight = captionHeight();
            int iGap = gap();
            float y10 = motionEvent.getY();
            int i10 = this.padding.top;
            float f10 = y10 - i10;
            if (this.caption != null && f10 >= 0.0f && f10 < iCaptionHeight) {
                motionEvent.offsetLocation(0.0f, -i10);
                boolean zOnTouchEvent = this.caption.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(0.0f, this.padding.top);
                return zOnTouchEvent;
            }
            if (this.credit == null || f10 < iCaptionHeight + iGap) {
                return false;
            }
            int i11 = i10 + iCaptionHeight + iGap;
            int iCreditDrawX = creditDrawX();
            motionEvent.offsetLocation(-iCreditDrawX, -i11);
            boolean zOnTouchEvent2 = this.credit.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(iCreditDrawX, i11);
            return zOnTouchEvent2;
        }

        @Override
        public void placeTexts(int i10, int i11, int i12) {
            this.layoutX = i10;
            this.layoutY = i11;
            this.layoutRow = i12;
            Text text = this.caption;
            if (text != null) {
                text.setX(i10 - text.left);
                this.caption.setY(i11);
                this.caption.setRow(i12);
            }
            Text text2 = this.credit;
            if (text2 != null) {
                text2.setX((i10 + creditDrawX()) - this.credit.left);
                this.credit.setY(i11 + captionHeight() + gap());
                this.credit.setRow(i12);
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

        public RichCollageBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockCollage pageblockcollage, boolean z10) {
            super(richMessageLayout, rect, i10);
            this.cells = new ArrayList<>();
            this.block = pageblockcollage;
            this.first = z10;
            for (int i11 = 0; i11 < pageblockcollage.items.size(); i11++) {
                MediaCell mediaCellForPageBlock = MediaCell.forPageBlock(richMessageLayout, pageblockcollage.items.get(i11));
                if (mediaCellForPageBlock != null) {
                    this.cells.add(mediaCellForPageBlock);
                }
            }
            layoutCells();
        }

        private void layoutCells() {
            int iRound;
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
                int iMax = (int) (Math.max(point.x, point.y) * 0.55f);
                if (i11 > iMax) {
                    i10 = (int) (iMax * f11);
                    i11 = iMax;
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
            MessageObject.GroupedMessagePosition[] groupedMessagePositionArrComputeGrouped = RichMessageLayout.computeGrouped(fArr);
            int iMax2 = 0;
            for (MessageObject.GroupedMessagePosition groupedMessagePosition : groupedMessagePositionArrComputeGrouped) {
                iMax2 = Math.max(iMax2, (int) groupedMessagePosition.maxY);
            }
            int i13 = iMax2 + 1;
            float[] fArr2 = new float[i13];
            for (MessageObject.GroupedMessagePosition groupedMessagePosition2 : groupedMessagePositionArrComputeGrouped) {
                byte b11 = groupedMessagePosition2.minY;
                if (b11 == groupedMessagePosition2.maxY) {
                    fArr2[b11] = Math.max(fArr2[b11], groupedMessagePosition2.f19619ph);
                }
            }
            for (MessageObject.GroupedMessagePosition groupedMessagePosition3 : groupedMessagePositionArrComputeGrouped) {
                int i14 = groupedMessagePosition3.minY;
                byte b12 = groupedMessagePosition3.maxY;
                if (i14 != b12) {
                    int i15 = (b12 - i14) + 1;
                    float[] fArr3 = groupedMessagePosition3.siblingHeights;
                    if (fArr3 == null || fArr3.length != i15) {
                        float f12 = groupedMessagePosition3.f19619ph / i15;
                        while (i14 <= groupedMessagePosition3.maxY) {
                            fArr2[i14] = Math.max(fArr2[i14], f12);
                            i14++;
                        }
                    } else {
                        for (int i16 = 0; i16 < i15; i16++) {
                            byte b13 = groupedMessagePosition3.minY;
                            fArr2[b13 + i16] = Math.max(fArr2[b13 + i16], groupedMessagePosition3.siblingHeights[i16]);
                        }
                    }
                }
            }
            Point point2 = AndroidUtilities.displaySize;
            float fMax = Math.max(point2.x, point2.y) * 0.5f;
            int[] iArr = new int[iMax2 + 2];
            for (int i17 = 0; i17 <= iMax2; i17++) {
                iArr[i17] = Math.round(f10 * fMax);
                f10 += fArr2[i17];
            }
            iArr[i13] = Math.round(f10 * fMax);
            int iDp = AndroidUtilities.dp(2.0f);
            int i18 = 0;
            while (i18 < groupedMessagePositionArrComputeGrouped.length) {
                MessageObject.GroupedMessagePosition groupedMessagePosition4 = groupedMessagePositionArrComputeGrouped[i18];
                int i19 = iArr[groupedMessagePosition4.minY];
                int i20 = iArr[groupedMessagePosition4.maxY + b10] - i19;
                int i21 = groupedMessagePosition4.leftSpanOffset;
                if (i21 > 0) {
                    iRound = Math.round((i21 * this.maxWidth) / 1000.0f);
                } else {
                    int i22 = 0;
                    for (int i23 = 0; i23 < groupedMessagePositionArrComputeGrouped.length; i23++) {
                        if (i23 != i18) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition5 = groupedMessagePositionArrComputeGrouped[i23];
                            byte b14 = groupedMessagePosition5.minY;
                            byte b15 = groupedMessagePosition4.minY;
                            if (b14 <= b15 && groupedMessagePosition5.maxY >= b15 && groupedMessagePosition5.minX < groupedMessagePosition4.minX) {
                                i22 += groupedMessagePosition5.pw;
                            }
                        }
                    }
                    iRound = Math.round((i22 * this.maxWidth) / 1000.0f);
                }
                int iRound2 = (groupedMessagePosition4.flags & 2) != 0 ? this.maxWidth - iRound : Math.round((groupedMessagePosition4.pw * this.maxWidth) / 1000.0f) - iDp;
                if ((groupedMessagePosition4.flags & 8) == 0) {
                    i20 -= iDp;
                }
                this.cells.get(i18).setRect(iRound, i19, Math.max(0, iRound2), Math.max(0, i20));
                this.cellFlags[i18] = groupedMessagePosition4.flags;
                i18++;
                b10 = 1;
            }
            this.contentHeight = iArr[i13];
        }

        private void updateRoundRadius(ImageReceiver imageReceiver, int i10, boolean z10) {
            int i11;
            int i12 = 0;
            boolean z11 = (i10 & 4) != 0;
            boolean z12 = (i10 & 8) != 0;
            boolean z13 = (i10 & 1) != 0;
            boolean z14 = (i10 & 2) != 0;
            if (z10) {
                int iDp = AndroidUtilities.dp(8.0f);
                int i13 = (z11 && z13) ? iDp : 0;
                int i14 = (z11 && z14) ? iDp : 0;
                int i15 = (z12 && z14) ? iDp : 0;
                if (z12 && z13) {
                    i12 = iDp;
                }
                imageReceiver.setRoundRadius(i13, i14, i15, i12);
                return;
            }
            int i16 = SharedConfig.bubbleRadius;
            int iDp2 = i16 > 2 ? AndroidUtilities.dp(i16 - 2) : AndroidUtilities.dp(i16);
            int iMin = Math.min(AndroidUtilities.dp(3.0f), iDp2);
            if (z11 && z13) {
                i11 = (!this.first || this.root.hasNameOffset() || (!this.root.isOut() && this.root.isPinnedTop())) ? iMin : iDp2;
            } else {
                i11 = 0;
            }
            if (!z11 || !z14) {
                iDp2 = 0;
            } else if (!this.first || this.root.hasNameOffset() || (this.root.isOut() && this.root.isPinnedTop())) {
                iDp2 = iMin;
            }
            int i17 = (z12 && z14) ? iMin : 0;
            if (z12 && z13) {
                i12 = iMin;
            }
            imageReceiver.setRoundRadius(i11, iDp2, i17, i12);
        }

        @Override
        public void getBlockAccessibilityElementBounds(int i10, Rect rect) {
            if (i10 < 0 || i10 >= this.cells.size()) {
                return;
            }
            MediaCell mediaCell = this.cells.get(i10);
            Rect rect2 = this.padding;
            int i11 = rect2.left + mediaCell.f19631x;
            int i12 = ((int) this.currY) + rect2.top + mediaCell.f19632y;
            rect.set(i11, i12, mediaCell.f19630w + i11, mediaCell.h + i12);
        }

        @Override
        public int getBlockAccessibilityElementCount() {
            return this.cells.size();
        }

        @Override
        public CharSequence getBlockAccessibilityElementText(int i10) {
            if (i10 < 0 || i10 >= this.cells.size()) {
                return null;
            }
            return this.cells.get(i10).getAccessibilityText();
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
            int i10 = 0;
            while (i10 < size) {
                MediaCell mediaCell = arrayList.get(i10);
                i10++;
                mediaCell.attach(this.view);
            }
        }

        @Override
        public boolean onBlockAccessibilityElementClick(int i10, View view) {
            if (i10 < 0 || i10 >= this.cells.size()) {
                return false;
            }
            return this.cells.get(i10).onAccessibilityClick(view);
        }

        @Override
        public void onDetachedFromWindow() {
            ArrayList<MediaCell> arrayList = this.cells;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                MediaCell mediaCell = arrayList.get(i10);
                i10++;
                mediaCell.detach();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
            if (mediaBgPaint == null) {
                Paint paint = new Paint(1);
                mediaBgPaint = paint;
                paint.setColor(251658240);
            }
            boolean zIsInQuote = isInQuote();
            int iDp = AndroidUtilities.dp(2.0f);
            int i10 = zIsInQuote ? 0 : this.root.padLeft - iDp;
            int i11 = zIsInQuote ? 0 : this.root.padRight - iDp;
            int i12 = this.maxWidth;
            float f10 = (i12 <= 0 || (i10 <= 0 && i11 <= 0)) ? 1.0f : ((i12 + i10) + i11) / i12;
            int i13 = 0;
            while (i13 < this.cells.size()) {
                MediaCell mediaCell = this.cells.get(i13);
                int iRound = Math.round(mediaCell.f19631x * f10) - i10;
                int iRound2 = Math.round(mediaCell.f19630w * f10);
                ImageReceiver imageReceiver = mediaCell.imageReceiver;
                int[] iArr = this.cellFlags;
                updateRoundRadius(imageReceiver, (iArr == null || i13 >= iArr.length) ? 0 : iArr[i13], zIsInQuote);
                float f11 = iRound;
                mediaCell.imageReceiver.setImageCoords(f11, mediaCell.f19632y, iRound2, mediaCell.h);
                if (mediaCell.imageReceiver.hasBitmapImage() && mediaCell.imageReceiver.getCurrentAlpha() == 1.0f) {
                    canvas2 = canvas;
                } else {
                    int i14 = mediaCell.f19632y;
                    canvas2 = canvas;
                    canvas2.drawRect(f11, i14, iRound + iRound2, i14 + mediaCell.h, mediaBgPaint);
                }
                mediaCell.draw(canvas2);
                i13++;
            }
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
                    for (int i10 = 0; i10 < this.cells.size(); i10++) {
                        MediaCell mediaCell = this.cells.get(i10);
                        if (mediaCell.isInside(motionEvent.getX(), motionEvent.getY()) && mediaCell.onTouchEvent(motionEvent, this.view)) {
                            this.pressedCell = mediaCell;
                            Rect rect2 = this.padding;
                            motionEvent.offsetLocation(rect2.left, rect2.top);
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
                Rect rect3 = this.padding;
                motionEvent.offsetLocation(rect3.left, rect3.top);
                return zOnTouchEvent;
            } catch (Throwable th) {
                Rect rect4 = this.padding;
                motionEvent.offsetLocation(rect4.left, rect4.top);
                throw th;
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
        private org.telegram.ui.Components.nc bounce;
        private final Paint linePaint;
        private boolean pressed;
        public final Text[] texts;
        public final Text title;

        public RichDetailsBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockDetails pageblockdetails, CharSequence charSequence) {
            super(richMessageLayout, rect, i10);
            this.linePaint = new Paint(1);
            this.block = pageblockdetails;
            Text text = new Text(richMessageLayout, charSequence, i0.a.d(16.0f, this.maxWidth - AndroidUtilities.dp(53.0f), 0));
            this.title = text;
            this.texts = new Text[]{text};
            AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.Ek : org.telegram.ui.ActionBar.g6.Dk));
            this.arrow = animatedArrowDrawable;
            animatedArrowDrawable.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
        }

        private void ensureBounce() {
            View view;
            if (this.bounce != null || (view = this.root.view) == null) {
                return;
            }
            this.bounce = new org.telegram.ui.Components.nc(view);
        }

        private int getContentHeight() {
            return y1.b(12.66f, this.title.getHeight() + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.82f));
        }

        private void toggle() {
            this.root.snapshotForDetailsAnimation();
            TL_iv.pageBlockDetails pageblockdetails = this.block;
            boolean z10 = pageblockdetails.open;
            pageblockdetails.open = !z10;
            this.arrow.a(!z10 ? 0.0f : 1.0f);
            RichMessageLayout richMessageLayout = this.root;
            richMessageLayout.detailsAnimating = true;
            richMessageLayout.reposition();
            View view = this.root.view;
            if (view != null) {
                view.invalidate();
            }
            org.telegram.ui.Cells.s1 cell = this.root.getCell();
            org.telegram.ui.Cells.j1 delegate = this.root.getDelegate();
            if (cell == null || delegate == null) {
                return;
            }
            delegate.G0(cell);
        }

        public void updateBubbleInsets() {
            this.title.setX((AndroidUtilities.dp(53.0f) + (this.layoutX - this.root.padLeft)) - this.title.left);
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.title, this.texts);
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            if (!this.title.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.f19628x = (AndroidUtilities.dp(53.0f) + (this.padding.left - this.root.padLeft)) - this.title.left;
            foundLink.f19629y = AndroidUtilities.dp(14.0f) + i10 + this.padding.top;
            return true;
        }

        @Override
        public void getBlockAccessibilityElementBounds(int i10, Rect rect) {
            int i11 = (int) this.currY;
            Rect rect2 = this.padding;
            int i12 = i11 + rect2.top;
            int i13 = rect2.left;
            RichMessageLayout richMessageLayout = this.root;
            rect.set(i13 - richMessageLayout.padLeft, i12, (richMessageLayout.getMinWidth() + this.root.padRight) - this.padding.right, getContentHeight() + i12);
        }

        @Override
        public int getBlockAccessibilityElementCount() {
            return 1;
        }

        @Override
        public CharSequence getBlockAccessibilityElementStateDescription(int i10) {
            return LocaleController.getString(isOpen() ? R.string.AccDescrExpanded : R.string.AccDescrCollapsed);
        }

        @Override
        public CharSequence getBlockAccessibilityElementText(int i10) {
            StaticLayout staticLayout;
            Text text = this.title;
            CharSequence charSequenceWithReplacements = (text == null || (staticLayout = text.layout) == null) ? null : RichBlock.withReplacements(staticLayout.getText());
            return TextUtils.concat(LocaleController.getString(R.string.ArticleToggleBlock), ", ", LocaleController.getString(isOpen() ? R.string.AccDescrExpanded : R.string.AccDescrCollapsed), TextUtils.isEmpty(charSequenceWithReplacements) ? "" : TextUtils.concat(", ", charSequenceWithReplacements));
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
        public org.telegram.ui.Cells.u9[] getText() {
            return this.texts;
        }

        @Override
        public boolean isBlockAccessibilityElementText(int i10) {
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
        public boolean onBlockAccessibilityElementClick(int i10, View view) {
            toggle();
            return true;
        }

        @Override
        public void onDetachedFromWindow() {
            this.title.detach(this.view);
        }

        @Override
        public void onDraw(Canvas canvas) {
            org.telegram.ui.Components.nc ncVar = this.bounce;
            float fA = ncVar != null ? ncVar.a(0.02f) : 1.0f;
            RichMessageLayout richMessageLayout = this.root;
            float f10 = -richMessageLayout.padLeft;
            int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            float f11 = (minWidth - rect.left) - rect.right;
            if (fA != 1.0f) {
                canvas.save();
                canvas.scale(fA, fA, (f10 + f11) / 2.0f, getContentHeight() / 2.0f);
            }
            RichMessageLayout richMessageLayout2 = this.root;
            int themedColor = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.g6.Ek : org.telegram.ui.ActionBar.g6.Dk);
            AnimatedArrowDrawable animatedArrowDrawable = this.arrow;
            animatedArrowDrawable.f26052a.setColor(themedColor);
            animatedArrowDrawable.invalidateSelf();
            canvas.save();
            canvas.translate(AndroidUtilities.dpf2(22.6f) + f10, AndroidUtilities.dpf2(21.66f));
            this.arrow.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.dp(53.0f) + f10, AndroidUtilities.dp(14.0f));
            this.title.draw(canvas);
            canvas.restore();
            if (fA != 1.0f) {
                canvas.restore();
            }
            if (isOpen()) {
                return;
            }
            RichMessageLayout richMessageLayout3 = this.root;
            if (richMessageLayout3.detailsAnimating) {
                return;
            }
            this.linePaint.setColor(richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? org.telegram.ui.ActionBar.g6.Gk : org.telegram.ui.ActionBar.g6.Fk));
            canvas.drawRect(f10, getContentHeight() - 1.0f, f11, getContentHeight(), this.linePaint);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.pressed = true;
                ensureBounce();
                org.telegram.ui.Components.nc ncVar = this.bounce;
                if (ncVar != null) {
                    ncVar.c(true);
                }
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.pressed = false;
                    org.telegram.ui.Components.nc ncVar2 = this.bounce;
                    if (ncVar2 != null) {
                        ncVar2.c(false);
                    }
                }
                return this.pressed;
            }
            if (!this.pressed) {
                return false;
            }
            this.pressed = false;
            org.telegram.ui.Components.nc ncVar3 = this.bounce;
            if (ncVar3 != null) {
                ncVar3.c(false);
            }
            View view = this.root.view;
            if (view != null) {
                view.playSoundEffect(0);
            }
            toggle();
            return true;
        }

        @Override
        public void placeTexts(int i10, int i11, int i12) {
            this.layoutX = i10;
            this.layoutY = i11;
            this.layoutRow = i12;
            this.title.setX((AndroidUtilities.dp(53.0f) + (i10 - this.root.padLeft)) - this.title.left);
            this.title.setY(AndroidUtilities.dp(14.0f) + i11);
            this.title.setRow(i12);
        }
    }

    public static class RichDetailsEndBlock extends RichBlock {
        private final Paint paint;

        public RichDetailsEndBlock(RichMessageLayout richMessageLayout, Rect rect, int i10) {
            super(richMessageLayout, rect, i10);
            this.paint = new Paint(1);
        }

        @Override
        public int getHeight() {
            return y1.C(6.0f, this.padding.top, 1) + this.padding.bottom;
        }

        @Override
        public int getMinWidth() {
            return AndroidUtilities.dp(32.0f) + this.padding.left + this.padding.right;
        }

        @Override
        public void onDraw(Canvas canvas) {
            Paint paint = this.paint;
            RichMessageLayout richMessageLayout = this.root;
            paint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.Gk : org.telegram.ui.ActionBar.g6.Fk));
            RichMessageLayout richMessageLayout2 = this.root;
            float f10 = -richMessageLayout2.padLeft;
            int minWidth = richMessageLayout2.getMinWidth();
            RichMessageLayout richMessageLayout3 = this.root;
            int i10 = minWidth + richMessageLayout3.padRight;
            Rect rect = this.padding;
            float f11 = (i10 - rect.left) - rect.right;
            float fLerp = 0.0f;
            if (richMessageLayout3.detailsAnimating) {
                fLerp = AndroidUtilities.lerp(this.prevVisible ? 1.0f : 0.0f, this.currVisible ? 1.0f : 0.0f, richMessageLayout3.detailsAnimationProgress);
            } else if (this.currVisible) {
                fLerp = 1.0f;
            }
            RichDetailsBlock richDetailsBlock = this.parentDetails;
            float fLerp2 = AndroidUtilities.lerp((-1.0f) - (richDetailsBlock != null ? richDetailsBlock.padding.bottom : 0), AndroidUtilities.dp(6.0f), fLerp);
            canvas.drawRect(f10, fLerp2, f11, fLerp2 + 1.0f, this.paint);
        }
    }

    public static class RichDividerBlock extends RichBlock {
        public final Paint paint;

        public RichDividerBlock(RichMessageLayout richMessageLayout, Rect rect, int i10) {
            super(richMessageLayout, rect, i10);
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
            int minWidth = this.root.getMinWidth();
            RichMessageLayout richMessageLayout = this.root;
            int i10 = richMessageLayout.padLeft;
            int i11 = minWidth + i10 + richMessageLayout.padRight;
            Rect rect = this.padding;
            int i12 = rect.left;
            int i13 = (i11 - i12) - rect.right;
            int i14 = i13 / 2;
            float f10 = (((i13 - i14) / 2.0f) - i10) + i12;
            float fDp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
            Paint paint = this.paint;
            RichMessageLayout richMessageLayout2 = this.root;
            paint.setColor(richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.g6.wk : org.telegram.ui.ActionBar.g6.vk));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f10, fDp, i14 + f10, AndroidUtilities.dp(1.0f) + fDp);
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

        public RichMapBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockMap pageblockmap) {
            super(richMessageLayout, rect, i10);
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            this.block = pageblockmap;
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            int i11 = pageblockmap.f22603w;
            i11 = i11 <= 0 ? 100 : i11;
            int i12 = pageblockmap.h;
            int i13 = i12 > 0 ? i12 : 100;
            int iMax = this.maxWidth;
            int iMax2 = (int) ((iMax / Math.max(1, i11)) * i13);
            Point point = AndroidUtilities.displaySize;
            int iMax3 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (iMax2 > iMax3) {
                iMax = (int) ((iMax3 / Math.max(1, i13)) * i11);
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
            int i10 = this.root.currentAccount;
            int i11 = MessagesController.getInstance(i10).mapProvider;
            this.currentMapProvider = i11;
            float f10 = this.imgWidth;
            float f11 = AndroidUtilities.density;
            int i12 = (int) (f10 / f11);
            int i13 = (int) (this.imgHeight / f11);
            TL_iv.pageBlockMap pageblockmap = this.block;
            int i14 = pageblockmap.zoom;
            int i15 = i14 > 0 ? i14 : 15;
            if (i11 == 2) {
                WebFile webFileCreateWithGeoPoint = WebFile.createWithGeoPoint(pageblockmap.geo, i12, i13, i15, Math.min(2, (int) Math.ceil(f11)));
                if (webFileCreateWithGeoPoint != null) {
                    this.imageReceiver.setImage(ImageLocation.getForWebFile(webFileCreateWithGeoPoint), null, null, null, this.root.messageObject, 0);
                    return;
                }
                return;
            }
            TLRPC.GeoPoint geoPoint = pageblockmap.geo;
            String strFormapMapUrl = AndroidUtilities.formapMapUrl(i10, geoPoint.lat, geoPoint._long, i12, i13, true, i15, -1);
            if (strFormapMapUrl != null) {
                this.imageReceiver.setImage(strFormapMapUrl, null, null, null, 0L);
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
            View view;
            if (mapBgPaint == null) {
                mapBgPaint = new Paint(1);
            }
            mapBgPaint.setColor(this.root.getThemedColor(org.telegram.ui.ActionBar.g6.pe));
            boolean zIsInQuote = isInQuote();
            int i10 = zIsInQuote ? 0 : this.root.padLeft;
            int i11 = zIsInQuote ? 0 : this.root.padRight;
            float f10 = -i10;
            canvas.drawRect(f10, 0.0f, this.imgWidth + i11, this.imgHeight, mapBgPaint);
            Drawable drawable = org.telegram.ui.ActionBar.g6.S4[this.root.isOut() ? 1 : 0];
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i12 = (this.imgWidth - intrinsicWidth) / 2;
                int i13 = (this.imgHeight - intrinsicHeight) / 2;
                drawable.setBounds(i12, i13, intrinsicWidth + i12, intrinsicHeight + i13);
                drawable.draw(canvas);
            }
            this.imageReceiver.setImageCoords(f10, 0.0f, this.imgWidth + i10 + i11, this.imgHeight);
            this.imageReceiver.draw(canvas);
            if (this.currentMapProvider == 2 && this.imageReceiver.hasNotThumb()) {
                if (this.redPinIcon == null && (view = this.view) != null) {
                    this.redPinIcon = view.getContext().getDrawable(R.drawable.map_pin).mutate();
                }
                Drawable drawable2 = this.redPinIcon;
                if (drawable2 != null) {
                    int intrinsicWidth2 = (int) (drawable2.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight2 = (int) (this.redPinIcon.getIntrinsicHeight() * 0.8f);
                    int i14 = (this.imgWidth - intrinsicWidth2) / 2;
                    int i15 = (this.imgHeight / 2) - intrinsicHeight2;
                    this.redPinIcon.setAlpha((int) (this.imageReceiver.getCurrentAlpha() * 255.0f));
                    this.redPinIcon.setBounds(i14, i15, intrinsicWidth2 + i14, intrinsicHeight2 + i15);
                    this.redPinIcon.draw(canvas);
                }
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            View view;
            int actionMasked = motionEvent.getActionMasked();
            float x8 = motionEvent.getX() - this.padding.left;
            float y10 = motionEvent.getY() - this.padding.top;
            boolean z10 = x8 >= 0.0f && x8 <= ((float) this.imgWidth) && y10 >= 0.0f && y10 <= ((float) this.imgHeight);
            if (actionMasked == 0) {
                if (!z10) {
                    return false;
                }
                this.photoPressed = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.photoPressed = false;
                }
                return this.photoPressed;
            }
            if (this.photoPressed) {
                this.photoPressed = false;
                if (z10 && this.block.geo != null && (view = this.view) != null) {
                    view.playSoundEffect(0);
                    try {
                        TLRPC.GeoPoint geoPoint = this.block.geo;
                        double d = geoPoint.lat;
                        double d10 = geoPoint._long;
                        this.view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    return true;
                }
            }
            return false;
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

        public RichMathBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockMath pageblockmath) {
            super(richMessageLayout, rect, i10);
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
            int i11 = this.maxWidth;
            this.viewportWidth = i11;
            rh.q qVarA = (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? null : rh.q.a(pageblockmath.source, AndroidUtilities.dp(richMessageLayout.fontSize + 4), false);
            if (qVarA != null) {
                this.bitmap = qVarA.f47381a;
                this.contentW = qVarA.f47382b;
                this.contentH = qVarA.f47383c;
            }
            int iD = y1.D(0.0f, 2, this.contentW);
            this.contentWidth = iD;
            this.maxScrollX = Math.max(0, iD - i11);
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
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            TL_iv.pageBlockMath pageblockmath = this.block;
            if (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) {
                return;
            }
            spannableStringBuilder.append((CharSequence) this.block.source);
        }

        @Override
        public int getHeight() {
            return y1.D(8.0f, 2, this.padding.top + this.contentH) + this.padding.bottom;
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
            if (this.dragging) {
                return true;
            }
            OverScroller overScroller = this.scroller;
            return (overScroller == null || overScroller.isFinished()) ? false : true;
        }

        @Override
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
            if (this.bitmap == null) {
                return;
            }
            Paint paint = this.paint;
            RichMessageLayout richMessageLayout = this.root;
            paint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.fc : org.telegram.ui.ActionBar.g6.f23077ec));
            int iD = y1.D(8.0f, 2, this.contentH);
            if (this.maxScrollX > 0) {
                RichMessageLayout richMessageLayout2 = this.root;
                float f10 = -richMessageLayout2.padLeft;
                int minWidth = richMessageLayout2.getMinWidth() + this.root.padRight;
                Rect rect = this.padding;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(f10, 0.0f, (minWidth - rect.left) - rect.right, iD, 255, 31);
                canvas2.save();
                canvas2.translate(AndroidUtilities.dp(0.0f) - this.scrollX, AndroidUtilities.dp(8.0f));
            } else {
                canvas2 = canvas;
                float minWidth2 = ((this.root.getMinWidth() / 2.0f) - this.padding.left) - (this.contentW / 2.0f);
                canvas2.save();
                canvas2.translate(minWidth2, AndroidUtilities.dp(8.0f));
            }
            canvas2.drawBitmap(this.bitmap, 0.0f, 0.0f, this.paint);
            if (this.maxScrollX > 0) {
                canvas2.restore();
                RectF rectF = AndroidUtilities.rectTmp;
                int i10 = this.root.padLeft;
                float f11 = iD;
                rectF.set(-i10, 0.0f, AndroidUtilities.dp(12.0f) + (-i10), f11);
                this.root.clip.b(canvas2, rectF, 0, 1.0f);
                int minWidth3 = this.root.getMinWidth() + this.root.padRight;
                Rect rect2 = this.padding;
                int i11 = (minWidth3 - rect2.left) - rect2.right;
                rectF.set(i11 - AndroidUtilities.dp(12.0f), 0.0f, i11, f11);
                this.root.clip.b(canvas2, rectF, 2, 1.0f);
            }
            canvas2.restore();
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
                float x8 = motionEvent.getX() - this.downX;
                if (!this.dragging && Math.abs(x8) > this.touchSlop) {
                    this.dragging = true;
                    requestDisallowParentIntercept(true);
                }
                if (!this.dragging) {
                    return false;
                }
                int i10 = (int) (this.downScrollX - x8);
                int i11 = i10 >= 0 ? i10 : 0;
                int i12 = this.maxScrollX;
                if (i11 > i12) {
                    i11 = i12;
                }
                if (i11 != this.scrollX) {
                    this.scrollX = i11;
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
            return z10 || actionMasked == 1;
        }
    }

    public static class RichPhotoBlock extends RichMediaBlock {
        public final TL_iv.pageBlockPhoto block;
        public final TLRPC.Photo photo;
        public final TLRPC.PhotoSize sizeFull;
        public final TLRPC.PhotoSize strippedSize;

        public RichPhotoBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockPhoto pageblockphoto, boolean z10) {
            super(richMessageLayout, rect, i10, z10);
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
            int i11 = photoSize != null ? photoSize.f22405w : 100;
            int i12 = photoSize != null ? photoSize.h : 100;
            int iMax = this.maxWidth;
            int iMax2 = (int) ((iMax / Math.max(1, i11)) * i12);
            Point point = AndroidUtilities.displaySize;
            int iMax3 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (iMax2 > iMax3) {
                iMax = (int) ((iMax3 / Math.max(1, i12)) * i11);
                iMax2 = iMax3;
            }
            this.imgWidth = iMax;
            this.imgHeight = iMax2;
            finishLayout();
        }

        @Override
        public void applyImage(boolean z10) {
            TLRPC.Photo photo = this.photo;
            if (photo == null || this.sizeFull == null) {
                return;
            }
            TLRPC.PhotoSize photoSize = this.strippedSize;
            ImageLocation forPhoto = photoSize != null ? ImageLocation.getForPhoto(photoSize, photo) : null;
            if (z10) {
                this.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(this.sizeFull, this.photo), null, forPhoto, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
            } else {
                this.imageReceiver.setImage(null, null, null, null, forPhoto, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
            }
        }

        @Override
        public boolean fileExists() {
            if (this.sizeFull == null) {
                return true;
            }
            File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, true);
            File pathToAttach2 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, false);
            return pathToAttach.exists() || (pathToAttach2 != null && pathToAttach2.exists());
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
            return pageblockphoto != null && pageblockphoto.spoiler;
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

        public RichPreformattedBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockPreformatted pageblockpreformatted, RichPreformattedBlock richPreformattedBlock) {
            super(richMessageLayout, rect, i10);
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
                    if ((charSequence instanceof CodeHighlighting.LockedWithFallbackSpannableString) && !((CodeHighlighting.LockedWithFallbackSpannableString) charSequence).ready) {
                        charSequence = ((CodeHighlighting.LockedWithFallbackSpannableString) charSequence).fallback;
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
                        for (int i11 = 0; i11 < spanArr.length; i11++) {
                            int spanStart = spannableStringBuilderAppend.getSpanStart(spanArr[i11]);
                            int spanStart2 = spannableStringBuilderAppend.getSpanStart(spanArr[i11]);
                            spannableStringBuilderAppend.removeSpan(spanArr[i11]);
                            spannableStringBuilderAppend.setSpan(spanArr[i11], spanStart, spanStart2, 33);
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
            int iD = y1.D(0.0f, 2, Math.max(0, text.right - text.left));
            this.contentWidth = iD;
            int iMax = Math.max(0, iD - this.viewportWidth);
            this.maxScrollX = iMax;
            if (richPreformattedBlock != null) {
                this.scrollX = Utilities.clamp(richPreformattedBlock.scrollX, iMax, 0);
            }
        }

        private void drawBackground(Canvas canvas) {
            Paint paint = this.bgPaint;
            RichMessageLayout richMessageLayout = this.root;
            paint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.yk : org.telegram.ui.ActionBar.g6.xk));
            if (this.padding.left <= 0) {
                RichMessageLayout richMessageLayout2 = this.root;
                canvas.drawRect(-richMessageLayout2.padLeft, 0.0f, richMessageLayout2.getMinWidth() + this.root.padRight, getBackgroundHeight(), this.bgPaint);
            } else {
                int minWidth = this.root.getMinWidth();
                Rect rect = this.padding;
                canvas.drawRect(0.0f, 0.0f, (minWidth - rect.left) - rect.right, getBackgroundHeight(), this.bgPaint);
            }
        }

        private void drawScrollbar(Canvas canvas) {
            float f10;
            float minWidth;
            if (this.maxScrollX <= 0) {
                return;
            }
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
            float fDp = f10 + AndroidUtilities.dp(6.0f);
            float fDp2 = minWidth - AndroidUtilities.dp(6.0f);
            if (fDp2 <= fDp) {
                return;
            }
            float fDp3 = AndroidUtilities.dp(23.0f) + this.text.getHeight();
            float fDp4 = fDp3 + AndroidUtilities.dp(5.0f);
            float fDp5 = AndroidUtilities.dp(2.5f);
            Paint paint = this.bgPaint;
            RichMessageLayout richMessageLayout2 = this.root;
            paint.setColor(richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.g6.Bk : org.telegram.ui.ActionBar.g6.zk));
            canvas.drawRoundRect(fDp, fDp3, fDp2, fDp4, fDp5, fDp5, this.bgPaint);
            float f11 = fDp2 - fDp;
            float fMin = Math.min(f11, Math.max(AndroidUtilities.dp(5.0f), (this.viewportWidth * f11) / this.contentWidth));
            float f12 = (((f11 - fMin) * this.scrollX) / this.maxScrollX) + fDp;
            Paint paint2 = this.bgPaint;
            RichMessageLayout richMessageLayout3 = this.root;
            paint2.setColor(richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? org.telegram.ui.ActionBar.g6.Ck : org.telegram.ui.ActionBar.g6.Ak));
            canvas.drawRoundRect(f12, fDp3, f12 + fMin, fDp4, fDp5, fDp5, this.bgPaint);
        }

        private void drawTextContent(Canvas canvas, boolean z10, int i10, float f10) {
            int iMin = Math.min(this.viewportWidth, this.contentWidth);
            int iD = y1.D(8.0f, 2, this.text.getHeight());
            if (this.padding.left > 0) {
                canvas.save();
                canvas.clipRect(0, 0, iMin, iD);
                canvas.translate(AndroidUtilities.dp(0.0f) - this.scrollX, AndroidUtilities.dp(8.0f));
                if (z10) {
                    this.text.drawFade(canvas, i10, f10);
                } else {
                    this.text.draw(canvas);
                }
                canvas.restore();
                return;
            }
            RichMessageLayout richMessageLayout = this.root;
            float f11 = -richMessageLayout.padLeft;
            float f12 = iMin + richMessageLayout.padRight;
            float f13 = iD;
            canvas.saveLayerAlpha(f11, 0.0f, f12, f13, 255, 31);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(0.0f) - this.scrollX, AndroidUtilities.dp(8.0f));
            if (z10) {
                this.text.drawFade(canvas, i10, f10);
            } else {
                this.text.draw(canvas);
            }
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            int i11 = this.root.padLeft;
            rectF.set(-i11, 0.0f, AndroidUtilities.dp(12.0f) + (-i11), f13);
            this.root.clip.b(canvas, rectF, 0, 1.0f);
            int minWidth = this.root.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            int i12 = (minWidth - rect.left) - rect.right;
            rectF.set(i12 - AndroidUtilities.dp(12.0f), 0.0f, i12, f13);
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
            if (this.scroller != null || this.view == null) {
                return;
            }
            this.scroller = new OverScroller(this.view.getContext());
        }

        private int getBackgroundHeight() {
            return AndroidUtilities.dp(16.0f) + this.text.getHeight() + (this.maxScrollX > 0 ? AndroidUtilities.dp(19.0f) : 0);
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.text, this.texts);
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            if (!this.text.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.f19628x = ((AndroidUtilities.dp(0.0f) + this.padding.left) - this.scrollX) - this.text.left;
            foundLink.f19629y = AndroidUtilities.dp(15.0f) + i10 + this.padding.top;
            return true;
        }

        @Override
        public CharSequence getAccessibilityLabel() {
            CharSequence accessibilityLabel = super.getAccessibilityLabel();
            if (!TextUtils.isEmpty(this.language)) {
                String strCapitalizeLanguage = MessageObject.TextLayoutBlock.capitalizeLanguage(this.language);
                if (!TextUtils.isEmpty(strCapitalizeLanguage)) {
                    return TextUtils.concat(accessibilityLabel, " (", strCapitalizeLanguage, ")");
                }
            }
            return accessibilityLabel;
        }

        @Override
        public int getHeight() {
            return y1.D(7.0f, 2, this.padding.top) + getBackgroundHeight() + this.padding.bottom;
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
        public org.telegram.ui.Cells.u9[] getText() {
            return this.texts;
        }

        @Override
        public boolean isHorizontallyDragging() {
            if (this.dragging) {
                return true;
            }
            OverScroller overScroller = this.scroller;
            return (overScroller == null || overScroller.isFinished()) ? false : true;
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
        public void onDrawFaded(Canvas canvas, int i10, float f10) {
            StaticLayout staticLayout = this.text.layout;
            if (staticLayout == null || i10 < 0 || i10 >= staticLayout.getLineCount()) {
                onDraw(canvas);
                return;
            }
            canvas.save();
            canvas.translate(0.0f, AndroidUtilities.dp(7.0f));
            drawBackground(canvas);
            drawTextContent(canvas, true, i10, f10);
            drawScrollbar(canvas);
            canvas.restore();
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
                return z10 || actionMasked == 1;
            }
            VelocityTracker velocityTracker4 = this.velocityTracker;
            if (velocityTracker4 != null) {
                velocityTracker4.addMovement(motionEvent);
            }
            float x8 = motionEvent.getX() - this.downX;
            if (!this.dragging && this.maxScrollX > 0 && Math.abs(x8) > this.touchSlop) {
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
            if (!this.dragging) {
                return this.textHandlingTouch;
            }
            int i10 = (int) (this.downScrollX - x8);
            int i11 = i10 >= 0 ? i10 : 0;
            int i12 = this.maxScrollX;
            if (i11 > i12) {
                i11 = i12;
            }
            if (i11 != this.scrollX) {
                this.scrollX = i11;
                placeTexts(this.layoutX, this.layoutY, this.layoutRow);
                View view = this.view;
                if (view != null) {
                    view.invalidate();
                }
            }
            return true;
        }

        @Override
        public void placeTexts(int i10, int i11, int i12) {
            this.layoutX = i10;
            this.layoutY = i11;
            this.layoutRow = i12;
            this.text.setX(((AndroidUtilities.dp(0.0f) + i10) - this.scrollX) - this.text.left);
            this.text.setY(AndroidUtilities.dp(15.0f) + i11);
            this.text.setRow(i12);
        }
    }

    public static class RichPullquoteBlock extends RichTextWithAuthorBlock {
        public RichPullquoteBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence, CharSequence charSequence2) {
            super(richMessageLayout, rect, i10, charSequence, charSequence2, Layout.Alignment.ALIGN_CENTER);
        }
    }

    public static class RichQuoteBlock extends RichTextWithAuthorBlock {
        public RichQuoteBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence, CharSequence charSequence2) {
            super(richMessageLayout, rect, i10, charSequence, charSequence2, Layout.Alignment.ALIGN_NORMAL);
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

        public RichSlideshowBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockSlideshow pageblockslideshow, boolean z10) {
            super(richMessageLayout, rect, i10);
            this.cells = new ArrayList<>();
            this.clipPath = new Path();
            this.block = pageblockslideshow;
            this.first = z10;
            for (int i11 = 0; i11 < pageblockslideshow.items.size(); i11++) {
                MediaCell mediaCellForPageBlock = MediaCell.forPageBlock(richMessageLayout, pageblockslideshow.items.get(i11));
                if (mediaCellForPageBlock != null) {
                    this.cells.add(mediaCellForPageBlock);
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
            int i10 = 0;
            while (i10 < size) {
                MediaCell mediaCell = arrayList.get(i10);
                i10++;
                float f11 = mediaCell.aspectRatio;
                if (f11 <= 0.0f) {
                    f11 = 1.0f;
                }
                f10 += f11;
            }
            int iMax = (int) (this.slideWidth / Math.max(0.5f, f10 / this.cells.size()));
            Point point = AndroidUtilities.displaySize;
            int iMax2 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (iMax > iMax2) {
                iMax = iMax2;
            }
            this.slideHeight = iMax;
            this.dotsHeight = 0;
            ArrayList<MediaCell> arrayList2 = this.cells;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                MediaCell mediaCell2 = arrayList2.get(i11);
                i11++;
                mediaCell2.setRect(0, 0, this.slideWidth, this.slideHeight);
            }
        }

        private void settle(float f10) {
            int i10;
            if (f10 >= 0.0f || this.currentPage >= this.cells.size() - 1) {
                i10 = -1;
                if (f10 <= 0.0f || this.currentPage <= 0) {
                    if (this.pageOffset > 0.5f && this.currentPage < this.cells.size() - 1) {
                        i10 = 1;
                    } else if (this.pageOffset >= -0.5f || this.currentPage <= 0) {
                        i10 = 0;
                    }
                }
            } else {
                i10 = 1;
            }
            int i11 = this.currentPage;
            final int i12 = i10 + i11;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.pageOffset, i12 - i11);
            this.settleAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(420L);
            this.settleAnimator.setInterpolator(er.h);
            this.settleAnimator.addUpdateListener(new o(this, 2));
            this.settleAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    RichSlideshowBlock.this.currentPage = i12;
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
        public void getBlockAccessibilityElementBounds(int i10, Rect rect) {
            Rect rect2 = this.padding;
            int i11 = rect2.left;
            int i12 = ((int) this.currY) + rect2.top;
            rect.set(i11, i12, this.slideWidth + i11, this.slideHeight + i12);
        }

        @Override
        public int getBlockAccessibilityElementCount() {
            return !this.cells.isEmpty() ? 1 : 0;
        }

        @Override
        public CharSequence getBlockAccessibilityElementText(int i10) {
            if (this.cells.isEmpty()) {
                return null;
            }
            int iMax = Math.max(0, Math.min(this.currentPage, this.cells.size() - 1));
            return TextUtils.concat(this.cells.get(iMax).getAccessibilityText(), ", ", LocaleController.formatString(R.string.Of, Integer.valueOf(iMax + 1), Integer.valueOf(this.cells.size())));
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
            if (this.dragging) {
                return true;
            }
            ValueAnimator valueAnimator = this.settleAnimator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        @Override
        public void onAttachedToWindow() {
            ArrayList<MediaCell> arrayList = this.cells;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                MediaCell mediaCell = arrayList.get(i10);
                i10++;
                mediaCell.attach(this.view);
            }
        }

        @Override
        public boolean onBlockAccessibilityElementClick(int i10, View view) {
            if (this.cells.isEmpty()) {
                return false;
            }
            return this.cells.get(Math.max(0, Math.min(this.currentPage, this.cells.size() - 1))).onAccessibilityClick(view);
        }

        @Override
        public void onDetachedFromWindow() {
            int i10 = 0;
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
            while (i10 < size) {
                MediaCell mediaCell = arrayList.get(i10);
                i10++;
                mediaCell.detach();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            float f10;
            float f11;
            float f12;
            int i10;
            int i11;
            int i12;
            int i13;
            float fClamp;
            float f13;
            if (this.cells.isEmpty()) {
                return;
            }
            if (mediaBgPaint == null) {
                Paint paint = new Paint(1);
                mediaBgPaint = paint;
                paint.setColor(251658240);
            }
            boolean zIsInQuote = isInQuote();
            int iDp = AndroidUtilities.dp(2.0f);
            int i14 = zIsInQuote ? 0 : this.root.padLeft - iDp;
            int i15 = zIsInQuote ? 0 : this.root.padRight - iDp;
            int i16 = this.slideWidth + i14 + i15;
            canvas.save();
            if (zIsInQuote) {
                int iDp2 = AndroidUtilities.dp(8.0f);
                this.clipPath.rewind();
                float f14 = iDp2;
                this.clipPath.addRoundRect(0.0f, 0.0f, this.slideWidth, this.slideHeight, f14, f14, Path.Direction.CW);
                canvas.clipPath(this.clipPath);
                i10 = iDp2;
                i11 = i10;
                i12 = i11;
                i13 = i12;
                f10 = 2.0f;
                f11 = 3.0f;
                f12 = 8.0f;
            } else if (this.first) {
                int i17 = SharedConfig.bubbleRadius;
                int iDp3 = i17 > 2 ? AndroidUtilities.dp(i17 - 2) : AndroidUtilities.dp(i17);
                int iMin = Math.min(AndroidUtilities.dp(3.0f), iDp3);
                int i18 = ((this.root.isOut() || !this.root.isPinnedTop()) && !this.root.hasNameOffset()) ? iDp3 : iMin;
                if ((this.root.isOut() && this.root.isPinnedTop()) || this.root.hasNameOffset()) {
                    iDp3 = iMin;
                }
                float f15 = i18;
                float f16 = iDp3;
                f10 = 2.0f;
                float f17 = iMin;
                f11 = 3.0f;
                this.clipPath.rewind();
                f12 = 8.0f;
                this.clipPath.addRoundRect(-i14, 0.0f, this.slideWidth + i15, this.slideHeight, new float[]{f15, f15, f16, f16, f17, f17, f17, f17}, Path.Direction.CW);
                canvas.clipPath(this.clipPath);
                i11 = iDp3;
                i12 = iMin;
                i13 = i12;
                i10 = i18;
            } else {
                f10 = 2.0f;
                f11 = 3.0f;
                f12 = 8.0f;
                canvas.clipRect(-i14, 0, this.root.getMinWidth() + i15, this.slideHeight);
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
            }
            int i19 = this.currentPage;
            float f18 = 0.0f;
            if ((i19 == 0 && this.pageOffset < 0.0f) || (i19 == this.cells.size() - 1 && this.pageOffset > 0.0f)) {
                RichMessageLayout richMessageLayout = this.root;
                canvas.drawColor(org.telegram.ui.ActionBar.g6.l1(0.2f, richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.f23040cb : org.telegram.ui.ActionBar.g6.Wc)));
            }
            float f19 = i16;
            float f20 = (-this.pageOffset) * f19;
            int i20 = this.currentPage - 1;
            for (int i21 = 1; i20 <= this.currentPage + i21; i21 = 1) {
                if (i20 < 0 || i20 >= this.cells.size()) {
                    i20 = i20;
                    f13 = f19;
                } else {
                    MediaCell mediaCell = this.cells.get(i20);
                    canvas.save();
                    canvas.translate(((i20 - this.currentPage) * i16) + f20, f18);
                    mediaCell.imageReceiver.setRoundRadius(i20 == 0 ? i10 : 0, i20 == this.cells.size() - i21 ? i11 : 0, i20 == this.cells.size() + (-1) ? i12 : 0, i20 == 0 ? i13 : 0);
                    mediaCell.blurImageReceiver.setRoundRadius(i20 == 0 ? i10 : 0, i20 == this.cells.size() + (-1) ? i11 : 0, i20 == this.cells.size() + (-1) ? i12 : 0, i20 == 0 ? i13 : 0);
                    float f21 = -i14;
                    mediaCell.imageReceiver.setImageCoords(f21, 0.0f, f19, this.slideHeight);
                    if (mediaCell.imageReceiver.hasBitmapImage() && mediaCell.imageReceiver.getCurrentAlpha() == 1.0f) {
                        f13 = f19;
                    } else {
                        f13 = f19;
                        canvas.drawRect(f21, 0.0f, i16 + i15, this.slideHeight, mediaBgPaint);
                    }
                    mediaCell.draw(canvas);
                    canvas.restore();
                }
                i20++;
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
                float fDp = AndroidUtilities.dp(5.0f) + (this.slideHeight - AndroidUtilities.dp(23.0f));
                int iDp4 = AndroidUtilities.dp(4.0f) + y1.D(6.0f, size - 1, AndroidUtilities.dp(7.0f) * size);
                float f22 = this.currentPage + this.pageOffset;
                if (iDp4 < i16) {
                    fClamp = (i16 - iDp4) / f10;
                } else {
                    float fDp2 = AndroidUtilities.dp(4.0f);
                    int iDp5 = AndroidUtilities.dp(13.0f);
                    int iDp6 = ((i16 - AndroidUtilities.dp(f12)) / 2) / iDp5;
                    fClamp = fDp2 - (Utilities.clamp(f22 - iDp6, Math.max(0, (size - (iDp6 * 2)) - 1), 0.0f) * iDp5);
                }
                canvas.save();
                canvas.clipRect(0, this.slideHeight - AndroidUtilities.dp(23.0f), i16, this.slideHeight);
                for (int i22 = 0; i22 < size; i22++) {
                    float fMax = Math.max(0.0f, 1.0f - Math.abs(i22 - f22));
                    float fDp3 = (AndroidUtilities.dp(1.0f) * fMax) + AndroidUtilities.dp(f10);
                    slideDotPaint.setAlpha((int) ((fMax * 95.0f) + 160.0f));
                    canvas.drawCircle(AndroidUtilities.dp(4.0f) + fClamp + (AndroidUtilities.dp(13.0f) * i22), fDp, fDp3, slideDotPaint);
                }
                canvas.restore();
            }
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
                    int i10 = this.currentPage;
                    if (i10 >= 0 && i10 < this.cells.size()) {
                        this.cells.get(this.currentPage).onTouchEvent(motionEvent, this.view);
                    }
                } else {
                    float f10 = 0.0f;
                    if (actionMasked != 2) {
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
                            VelocityTracker velocityTracker3 = this.velocityTracker;
                            if (velocityTracker3 != null) {
                                velocityTracker3.recycle();
                                this.velocityTracker = null;
                            }
                            requestDisallowParentIntercept(false);
                            if (!z10) {
                                if (this.dragging) {
                                    this.dragging = false;
                                    settle(f10);
                                } else {
                                    int i11 = this.currentPage;
                                    if (i11 >= 0 && i11 < this.cells.size()) {
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
                        float x8 = motionEvent.getX() - this.downX;
                        float y10 = motionEvent.getY() - this.downY;
                        if (this.dragging || Math.abs(y10) <= this.touchSlop || Math.abs(y10) <= Math.abs(x8)) {
                            if (!this.dragging && Math.abs(x8) > this.touchSlop && Math.abs(x8) > Math.abs(y10)) {
                                this.dragging = true;
                                int i12 = this.currentPage;
                                if (i12 >= 0 && i12 < this.cells.size()) {
                                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                                    motionEventObtain.setAction(3);
                                    this.cells.get(this.currentPage).onTouchEvent(motionEventObtain, this.view);
                                    motionEventObtain.recycle();
                                }
                            }
                            if (!this.dragging) {
                                int i13 = this.currentPage;
                                if (i13 >= 0 && i13 < this.cells.size()) {
                                    zOnTouchEvent = this.cells.get(this.currentPage).onTouchEvent(motionEvent, this.view);
                                    Rect rect4 = this.padding;
                                    motionEvent.offsetLocation(rect4.left, rect4.top);
                                    return zOnTouchEvent;
                                }
                                Rect rect5 = this.padding;
                                motionEvent.offsetLocation(rect5.left, rect5.top);
                                return false;
                            }
                            float f11 = (-x8) / this.slideWidth;
                            int i14 = this.currentPage;
                            if (i14 == 0 && f11 < 0.0f) {
                                f11 *= 0.3f;
                            }
                            if (i14 == this.cells.size() - 1 && f11 > 0.0f) {
                                f11 *= 0.3f;
                            }
                            this.pageOffset = f11;
                            View view2 = this.view;
                            if (view2 != null) {
                                view2.invalidate();
                            }
                        } else {
                            this.verticalDragging = true;
                            int i15 = this.currentPage;
                            if (i15 >= 0 && i15 < this.cells.size()) {
                                MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                                motionEventObtain2.setAction(3);
                                this.cells.get(this.currentPage).onTouchEvent(motionEventObtain2, this.view);
                                motionEventObtain2.recycle();
                            }
                            requestDisallowParentIntercept(false);
                        }
                    }
                }
                Rect rect6 = this.padding;
                motionEvent.offsetLocation(rect6.left, rect6.top);
                return true;
            } catch (Throwable th) {
                Rect rect7 = this.padding;
                motionEvent.offsetLocation(rect7.left, rect7.top);
                throw th;
            }
        }

        public void setCurrentPage(int i10) {
            int iMax = Math.max(0, Math.min(i10, this.cells.size() - 1));
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
    }

    public static class RichTableBlock extends RichBlock implements sy0 {
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
        public final ty0 tableLayout;
        private boolean textHandlingTouch;
        private final org.telegram.ui.Cells.u9[] textsArr;
        private final Text title;
        private final int titleHeight;
        private int touchSlop;
        private VelocityTracker velocityTracker;
        private final int viewportWidth;

        public static final class CellBlock implements ej0 {
            final my0 child;

            public CellBlock(my0 my0Var) {
                this.child = my0Var;
            }

            @Override
            public Layout getLayout() {
                ly0 ly0Var = this.child.f30779b;
                if (ly0Var == null) {
                    return null;
                }
                return ly0Var.getLayout();
            }

            @Override
            public View getParentView() {
                return null;
            }
        }

        public RichTableBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockTable pageblocktable) {
            int i11;
            super(richMessageLayout, rect, i10);
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
            Rect rect2 = this.padding;
            rect2.top = AndroidUtilities.dp(10.0f) + rect2.top;
            this.pageBlock = pageblocktable;
            this.viewportWidth = this.maxWidth;
            ty0 ty0Var = new ty0(ApplicationLoader.applicationContext, this, null);
            this.tableLayout = ty0Var;
            ty0Var.setOrientation(0);
            ty0Var.setRowOrderPreserved(true);
            ty0Var.setDrawLines(pageblocktable.bordered);
            ty0Var.setStriped(pageblocktable.striped);
            ty0Var.setRtl(richMessageLayout.isRtl());
            ty0Var.setFillWidth(false);
            if (pageblocktable.compact) {
                int iDp = AndroidUtilities.dp(5.0f);
                int iDp2 = AndroidUtilities.dp(5.0f);
                int iDp3 = AndroidUtilities.dp(5.0f);
                if (ty0Var.v != iDp || ty0Var.f32921r != iDp2 || ty0Var.f32922s != iDp3) {
                    ty0Var.v = iDp;
                    ty0Var.f32921r = iDp2;
                    ty0Var.f32922s = iDp3;
                    ty0Var.requestLayout();
                }
            }
            ty0Var.setMinimumCellHeight(AndroidUtilities.dp(pageblocktable.compact ? 18.0f : 36.0f));
            if (pageblocktable.rows.isEmpty()) {
                i11 = 0;
            } else {
                TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(0);
                i11 = 0;
                for (int i12 = 0; i12 < pagetablerow.cells.size(); i12++) {
                    int i13 = pagetablerow.cells.get(i12).colspan;
                    if (i13 == 0) {
                        i13 = 1;
                    }
                    i11 += i13;
                }
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
            this.tableLayout.setColumnCount(i11);
            this.tableLayout.measure(View.MeasureSpec.makeMeasureSpec(this.maxWidth, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = this.tableLayout.getMeasuredWidth();
            this.contentMeasuredWidth = measuredWidth;
            this.intrinsicContentWidth = measuredWidth;
            this.contentHeight = this.tableLayout.getMeasuredHeight();
            this.maxScrollX = Math.max(0, measuredWidth - this.viewportWidth);
            TL_iv.RichText richText = pageblocktable.title;
            if (richText == null || (richText instanceof TL_iv.textEmpty) || TextUtils.isEmpty(RichMessageLayout.getString(richText))) {
                this.title = null;
                this.titleHeight = 0;
            } else {
                Text text = new Text(richMessageLayout, richMessageLayout.formatText(pageblocktable.title, RichMessageLayout.setBlockFlags(0, 15)), this.viewportWidth);
                this.title = text;
                text.setDrawAtOrigin(true);
                this.titleHeight = AndroidUtilities.dp(9.0f) + text.getHeight();
            }
            Text text2 = this.title;
            int iMax = Math.max(0, Math.min(this.viewportWidth, Math.max(measuredWidth, text2 != null ? text2.getMinWidth() : 0)));
            this.intrinsicTableWidth = iMax;
            this.resolvedTableWidth = iMax;
            for (int i19 = 0; i19 < this.tableLayout.getChildCount(); i19++) {
                my0 my0VarD = this.tableLayout.d(i19);
                ly0 ly0Var = my0VarD.f30779b;
                if (ly0Var instanceof Text) {
                    this.cellTexts.add((Text) ly0Var);
                    this.cellBlocks.add(new CellBlock(my0VarD));
                }
            }
            ArrayList arrayList = new ArrayList();
            Text text3 = this.title;
            if (text3 != null) {
                arrayList.add(text3);
            }
            arrayList.addAll(this.cellTexts);
            this.textsArr = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
        }

        private void drawCellsWithTyping(Canvas canvas, gj0 gj0Var, float f10) {
            CellBlock cellBlock;
            RichMessageLayout richMessageLayout = this.root;
            float f11 = -richMessageLayout.padLeft;
            int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            int iSaveLayerAlpha = canvas.saveLayerAlpha(f11, 0.0f, (minWidth - rect.left) - rect.right, this.contentHeight, (int) (f10 * 255.0f), 31);
            canvas.save();
            canvas.translate(-this.scrollX, 0.0f);
            int childCount = this.tableLayout.getChildCount();
            int i10 = 0;
            int i11 = 0;
            while (i11 < childCount) {
                my0 my0VarD = this.tableLayout.d(i11);
                if (i10 >= this.cellBlocks.size() || this.cellBlocks.get(i10).child != my0VarD) {
                    cellBlock = null;
                } else {
                    cellBlock = this.cellBlocks.get(i10);
                    i10++;
                }
                int i12 = i10;
                if (cellBlock == null) {
                    my0VarD.a(canvas, this.view, true);
                } else if (!gj0Var.j(cellBlock)) {
                    my0VarD.a(canvas, this.view, false);
                } else if (gj0Var.g(cellBlock)) {
                    my0VarD.a(canvas, this.view, false);
                    if (my0VarD.f30779b instanceof Text) {
                        canvas.save();
                        canvas.translate(my0VarD.b(), my0VarD.c());
                        ((Text) my0VarD.f30779b).drawFade(canvas, gj0Var.g(cellBlock) ? gj0Var.f38430e : -1, gj0Var.g(cellBlock) ? gj0Var.f38431f : 0.0f);
                        canvas.restore();
                    }
                } else {
                    float fC = gj0Var.c(cellBlock);
                    if (fC >= 1.0f) {
                        my0VarD.a(canvas, this.view, true);
                    } else if (fC <= 0.0f || my0VarD.f30779b == null) {
                        my0VarD.a(canvas, this.view, false);
                    } else {
                        my0VarD.a(canvas, this.view, false);
                        canvas.save();
                        canvas.translate(my0VarD.b(), my0VarD.c());
                        int iSaveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, my0VarD.f30786k, my0VarD.f30787l, (int) (fC * 255.0f), 31);
                        my0VarD.f30779b.draw(canvas, this.view);
                        canvas.restoreToCount(iSaveLayerAlpha2);
                        canvas.restore();
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
            canvas.restoreToCount(iSaveLayerAlpha);
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
            int themedColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.uk : org.telegram.ui.ActionBar.g6.tk);
            this.linePaint.setColor(themedColor);
            this.halfLinePaint.setColor(themedColor);
            Paint paint3 = this.headerPaint;
            RichMessageLayout richMessageLayout2 = this.root;
            paint3.setColor(richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.g6.sk : org.telegram.ui.ActionBar.g6.rk));
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
            if (this.scroller != null || this.view == null) {
                return;
            }
            this.scroller = new OverScroller(this.view.getContext());
        }

        private my0 findCellChildAt(float f10, float f11) {
            float f12 = f10 + this.scrollX;
            float f13 = f11 - this.titleHeight;
            int childCount = this.tableLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                my0 my0VarD = this.tableLayout.d(i10);
                if (my0VarD.f30779b instanceof Text) {
                    int i11 = my0VarD.f30791p;
                    if (f12 >= i11 && f12 < i11 + my0VarD.f30786k) {
                        int i12 = my0VarD.f30792q;
                        if (f13 >= i12 && f13 < i12 + my0VarD.f30787l) {
                            return my0VarD;
                        }
                    }
                }
            }
            return null;
        }

        public void resolveWidth(int i10) {
            int i11 = this.intrinsicTableWidth;
            int i12 = this.viewportWidth;
            Rect rect = this.padding;
            int iMax = Math.max(i11, Math.min(i12, Math.max(0, (i10 - rect.left) - rect.right)));
            this.resolvedTableWidth = iMax;
            this.tableLayout.setRenderWidth(iMax);
            this.contentHeight = this.tableLayout.getRenderHeight();
        }

        private int titleDrawX() {
            Text text = this.title;
            if (text == null) {
                return 0;
            }
            int i10 = this.resolvedTableWidth;
            int i11 = text.right;
            int i12 = text.left;
            return Math.round(((i10 - (i11 - i12)) / 2.0f) - i12);
        }

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            StaticLayout staticLayout;
            RichBlock.appendText(spannableStringBuilder, this.title, null);
            for (int i10 = 0; i10 < this.cellTexts.size(); i10++) {
                Text text = this.cellTexts.get(i10);
                if (text != null && (staticLayout = text.layout) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append(", ");
                    }
                    spannableStringBuilder.append(text.layout.getText());
                }
            }
        }

        @Override
        public void collectAnimatorBlocks(List<ej0> list) {
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
            int i10;
            org.telegram.ui.Components.p5 p5Var2;
            canvas.save();
            Rect rect = this.padding;
            canvas.translate(rect.left, rect.top);
            Text text2 = this.title;
            boolean z11 = true;
            if (text2 == null || (p5Var2 = text2.animatedEmojiStack) == null || p5Var2.f31503a.isEmpty()) {
                z10 = false;
            } else {
                canvas.save();
                canvas.translate(titleDrawX(), 0.0f);
                Text text3 = this.title;
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, text3.layout, text3.animatedEmojiStack, 0.0f, text3.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z10 = true;
            }
            canvas.translate(0.0f, this.titleHeight);
            int size = this.cellTexts.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.Components.p5 p5Var3 = this.cellTexts.get(i11).animatedEmojiStack;
                if (p5Var3 != null && !p5Var3.f31503a.isEmpty()) {
                    RichMessageLayout richMessageLayout = this.root;
                    float f10 = -richMessageLayout.padLeft;
                    int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
                    Rect rect2 = this.padding;
                    int iSaveLayerAlpha = canvas.saveLayerAlpha(f10, 0.0f, (minWidth - rect2.left) - rect2.right, this.contentHeight, 255, 31);
                    canvas.save();
                    canvas.translate(-this.scrollX, 0.0f);
                    int childCount = this.tableLayout.getChildCount();
                    int i12 = 0;
                    while (i12 < childCount) {
                        my0 my0VarD = this.tableLayout.d(i12);
                        ly0 ly0Var = my0VarD.f30779b;
                        if (!(ly0Var instanceof Text) || (p5Var = (text = (Text) ly0Var).animatedEmojiStack) == null || p5Var.f31503a.isEmpty()) {
                            i10 = i12;
                        } else {
                            canvas.save();
                            canvas.translate(my0VarD.b(), my0VarD.c());
                            i10 = i12;
                            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, text.layout, text.animatedEmojiStack, 0.0f, text.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                            canvas.restore();
                        }
                        i12 = i10 + 1;
                    }
                    canvas.restore();
                    RectF rectF = AndroidUtilities.rectTmp;
                    int i13 = this.root.padLeft;
                    rectF.set(-i13, 0.0f, AndroidUtilities.dp(12.0f) + (-i13), this.contentHeight);
                    this.root.clip.b(canvas, rectF, 0, 1.0f);
                    int minWidth2 = this.root.getMinWidth() + this.root.padRight;
                    Rect rect3 = this.padding;
                    int i14 = (minWidth2 - rect3.left) - rect3.right;
                    rectF.set(i14 - AndroidUtilities.dp(12.0f), 0.0f, i14, this.contentHeight);
                    this.root.clip.b(canvas, rectF, 2, 1.0f);
                    canvas.restoreToCount(iSaveLayerAlpha);
                    canvas.restore();
                    return z11;
                }
            }
            z11 = z10;
            canvas.restore();
            return z11;
        }

        @Override
        public void drawWithTyping(Canvas canvas) {
            gj0 gj0Var = this.typingAnimator;
            if (gj0Var == null || !gj0Var.h || this.cellBlocks.isEmpty() || gj0Var.d(this.cellBlocks.get(0)) < 0) {
                draw(canvas);
                return;
            }
            float fC = gj0Var.c(this.cellBlocks.get(0));
            if (fC <= 0.0f) {
                return;
            }
            canvas.save();
            Rect rect = this.padding;
            canvas.translate(rect.left, rect.top);
            drawTitle(canvas);
            canvas.translate(0.0f, this.titleHeight);
            drawCellsWithTyping(canvas, gj0Var, fC);
            canvas.restore();
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            Text text = this.title;
            if (text != null && text.fillFoundLink(characterStyle, foundLink)) {
                foundLink.f19628x = (this.padding.left + titleDrawX()) - this.title.drawLeft();
                foundLink.f19629y = i10 + this.padding.top;
                return true;
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                my0 my0VarD = this.tableLayout.d(i11);
                ly0 ly0Var = my0VarD.f30779b;
                if (ly0Var instanceof Text) {
                    Text text2 = (Text) ly0Var;
                    if (text2.fillFoundLink(characterStyle, foundLink)) {
                        foundLink.f19628x = ((my0VarD.b() + this.padding.left) - this.scrollX) - text2.drawLeft();
                        foundLink.f19629y = my0VarD.c() + i10 + this.padding.top + this.titleHeight;
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
        public org.telegram.ui.Cells.u9[] getText() {
            return this.textsArr;
        }

        @Override
        public boolean isHorizontallyDragging() {
            if (this.dragging) {
                return true;
            }
            OverScroller overScroller = this.scroller;
            return (overScroller == null || overScroller.isFinished()) ? false : true;
        }

        @Override
        public void onAttachedToWindow() {
            Text text = this.title;
            if (text != null) {
                text.attach(this.view);
            }
            ArrayList<Text> arrayList = this.cellTexts;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Text text2 = arrayList.get(i10);
                i10++;
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
            int i10 = 0;
            while (i10 < size) {
                Text text2 = arrayList.get(i10);
                i10++;
                text2.detach(this.view);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
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
            int i12 = (minWidth2 - rect2.left) - rect2.right;
            rectF.set(i12 - AndroidUtilities.dp(12.0f), 0.0f, i12, this.contentHeight);
            this.root.clip.b(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            VelocityTracker velocityTracker;
            my0 my0VarFindCellChildAt;
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
                if (!this.textHandlingTouch && (my0VarFindCellChildAt = findCellChildAt(motionEvent.getX(), motionEvent.getY())) != null) {
                    this.pressedCellText = (Text) my0VarFindCellChildAt.f30779b;
                    this.cellDx = my0VarFindCellChildAt.b() - this.scrollX;
                    this.cellDy = my0VarFindCellChildAt.c() + this.titleHeight;
                    this.pressedCellText.setSoleButtonHitBounds(my0VarFindCellChildAt.f30791p - my0VarFindCellChildAt.b(), my0VarFindCellChildAt.f30792q - my0VarFindCellChildAt.c(), (my0VarFindCellChildAt.f30791p + my0VarFindCellChildAt.f30786k) - my0VarFindCellChildAt.b(), (my0VarFindCellChildAt.f30792q + my0VarFindCellChildAt.f30787l) - my0VarFindCellChildAt.c());
                    motionEvent.offsetLocation(-this.cellDx, -this.cellDy);
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
                float x8 = motionEvent.getX() - this.downX;
                if (!this.dragging && this.maxScrollX > 0 && Math.abs(x8) > this.touchSlop) {
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
                if (!this.dragging) {
                    return this.textHandlingTouch;
                }
                int i10 = (int) (this.downScrollX - x8);
                int i11 = i10 >= 0 ? i10 : 0;
                int i12 = this.maxScrollX;
                if (i11 > i12) {
                    i11 = i12;
                }
                if (i11 != this.scrollX) {
                    this.scrollX = i11;
                    placeTexts(this.layoutX, this.layoutY, this.layoutRow);
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
            return z10 || z11;
        }

        @Override
        public void placeTexts(int i10, int i11, int i12) {
            this.layoutX = i10;
            this.layoutY = i11;
            this.layoutRow = i12;
            Text text = this.title;
            if (text != null) {
                text.setX((titleDrawX() + i10) - this.title.drawLeft());
                this.title.setY(i11);
                this.title.setRow(i12);
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                my0 my0VarD = this.tableLayout.d(i13);
                ly0 ly0Var = my0VarD.f30779b;
                if (ly0Var instanceof Text) {
                    Text text2 = (Text) ly0Var;
                    text2.setX(((my0VarD.b() + i10) - this.scrollX) - text2.drawLeft());
                    text2.setY(my0VarD.c() + this.titleHeight + i11);
                    text2.setRow(i12);
                }
            }
        }

        @Override
        public Text createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
            Layout.Alignment alignment;
            if (pagetablecell == null) {
                return null;
            }
            CharSequence text = this.root.formatText(pagetablecell.text, RichMessageLayout.setBlockFlags(0, 14));
            if (pagetablecell.align_right) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL;
            }
            Text text2 = new Text(this.root, text, i10, alignment);
            text2.setDrawAtOrigin(true);
            return text2;
        }

        @Override
        public void onLayoutChild(ly0 ly0Var, int i10, int i11) {
        }
    }

    public static class RichTextBlock extends RichBlock {
        private final boolean centered;
        protected int contentPaddingBottom;
        protected int contentPaddingTop;
        public int quoteAuthorStart;
        public final Text text;
        public final Text[] texts;

        public RichTextBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence) {
            this(richMessageLayout, rect, i10, charSequence, Layout.Alignment.ALIGN_NORMAL);
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
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.text, this.texts);
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            if (!this.text.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.f19628x = (this.padding.left + rtlOffset()) - this.text.left;
            foundLink.f19629y = i10 + this.padding.top + this.contentPaddingTop;
            return true;
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
        public org.telegram.ui.Cells.u9[] getText() {
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
        public void onDrawFaded(Canvas canvas, int i10, float f10) {
            canvas.save();
            canvas.translate(0.0f, this.contentPaddingTop);
            int iRtlOffset = rtlOffset();
            if (iRtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + iRtlOffset) - text.left);
                canvas.save();
                canvas.translate(iRtlOffset, 0.0f);
                this.text.drawFade(canvas, i10, f10);
                canvas.restore();
            } else {
                this.text.drawFade(canvas, i10, f10);
            }
            canvas.restore();
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
        public void placeTexts(int i10, int i11, int i12) {
            super.placeTexts(i10, i11 + this.contentPaddingTop, i12);
            int iRtlOffset = rtlOffset();
            if (iRtlOffset != 0) {
                Text text = this.text;
                text.setX((i10 + iRtlOffset) - text.left);
            }
        }

        public void setContentPadding(int i10, int i11) {
            this.contentPaddingTop = i10;
            this.contentPaddingBottom = i11;
            updateListMarkerY();
        }

        public RichTextBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence, Layout.Alignment alignment) {
            super(richMessageLayout, rect, i10);
            this.quoteAuthorStart = -1;
            this.centered = alignment == Layout.Alignment.ALIGN_CENTER;
            Text text = new Text(richMessageLayout, charSequence, this.maxWidth, alignment);
            this.text = text;
            this.texts = new Text[]{text};
        }
    }

    public static class RichTextBlockQuote extends RichTextBlock {
        public final TL_iv.pageBlockBlockquote block;
        private org.telegram.ui.Components.nc bounce;
        private boolean capturedByParent;
        private v10 clip;
        public int collapsedHeightToDraw;
        public float collapsedProgress;
        private boolean currentCollapsed;
        private boolean pressed;
        private boolean prevCollapsed;
        public final Drawable quoteArrow;
        private int quoteArrowColor;

        public RichTextBlockQuote(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockBlockquote pageblockblockquote, CharSequence charSequence) {
            super(richMessageLayout, rect, i10, charSequence);
            this.block = pageblockblockquote;
            this.quoteArrow = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.arrow_more).mutate();
            boolean z10 = pageblockblockquote.collapsed;
            this.currentCollapsed = z10;
            this.prevCollapsed = z10;
        }

        private void ensureBounce() {
            View view;
            if (this.bounce != null || (view = this.root.view) == null) {
                return;
            }
            this.bounce = new org.telegram.ui.Components.nc(view);
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
            org.telegram.ui.Cells.s1 cell = this.root.getCell();
            org.telegram.ui.Cells.j1 delegate = this.root.getDelegate();
            if (cell == null || delegate == null) {
                return;
            }
            delegate.G0(cell);
        }

        @Override
        public float getBackgroundScale() {
            org.telegram.ui.Components.nc ncVar = this.bounce;
            if (ncVar != null) {
                return ncVar.a(0.01f);
            }
            return 1.0f;
        }

        public int getCollapsedHeight() {
            return (int) Math.min((this.text.layout.getPaint().getTextSize() * 1.4f * 3.0f) + this.padding.top + this.contentPaddingTop + this.padding.bottom, super.getHeight());
        }

        @Override
        public int getHeight() {
            return this.currentCollapsed ? getCollapsedHeight() : super.getHeight();
        }

        @Override
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
            org.telegram.ui.Components.nc ncVar = this.bounce;
            float fA = ncVar != null ? ncVar.a(0.01f) : 1.0f;
            if (fA != 1.0f) {
                canvas.save();
                canvas.scale(fA, fA, this.maxWidth / 2.0f, getHeight() / 2.0f);
            }
            boolean z10 = this.collapsedProgress > 0.0f;
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
                    this.clip = new v10();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, i10 - AndroidUtilities.dp(24.0f), this.maxWidth, i10 + 1);
                this.clip.b(canvas2, rectF, 3, this.collapsedProgress);
                canvas2.restore();
            }
            canvas2.restore();
            if (this.root.quoteLine.h() != this.quoteArrowColor) {
                Drawable drawable = this.quoteArrow;
                int iH = this.root.quoteLine.h();
                this.quoteArrowColor = iH;
                drawable.setColorFilter(new PorterDuffColorFilter(iH, PorterDuff.Mode.SRC_IN));
            }
            gf.s.e(this.quoteArrow, this.root.getMinWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f) + ((i10 - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(2.0f)), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 17);
            canvas2.save();
            canvas2.rotate(AndroidUtilities.lerp(180, 0, this.collapsedProgress), this.quoteArrow.getBounds().exactCenterX(), this.quoteArrow.getBounds().exactCenterY());
            this.quoteArrow.draw(canvas2);
            canvas2.restore();
            if (fA != 1.0f) {
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
            }
            if (actionMasked == 0) {
                boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                this.capturedByParent = zOnTouchEvent;
                if (zOnTouchEvent) {
                    return true;
                }
                this.pressed = true;
                ensureBounce();
                org.telegram.ui.Components.nc ncVar = this.bounce;
                if (ncVar != null) {
                    ncVar.c(true);
                }
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.pressed = false;
                    org.telegram.ui.Components.nc ncVar2 = this.bounce;
                    if (ncVar2 != null) {
                        ncVar2.c(false);
                    }
                }
                return this.pressed;
            }
            if (!this.pressed) {
                return false;
            }
            this.pressed = false;
            org.telegram.ui.Components.nc ncVar3 = this.bounce;
            if (ncVar3 != null) {
                ncVar3.c(false);
            }
            View view = this.root.view;
            if (view != null) {
                view.playSoundEffect(0);
            }
            toggle();
            return true;
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

        public RichTextWithAuthorBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence, CharSequence charSequence2, Layout.Alignment alignment) {
            super(richMessageLayout, rect, i10);
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

        @Override
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, null, this.texts);
        }

        @Override
        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            if (this.text.fillFoundLink(characterStyle, foundLink)) {
                foundLink.f19628x = (this.padding.left + offset(this.text)) - this.text.left;
                foundLink.f19629y = i10 + this.padding.top;
                return true;
            }
            Text text = this.author;
            if (text == null || !text.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.f19628x = (this.padding.left + offset(this.author)) - this.author.left;
            foundLink.f19629y = this.text.getHeight() + i10 + this.padding.top + gap();
            return true;
        }

        @Override
        public boolean forcesTimeToNewLine() {
            return this.centered;
        }

        @Override
        public int getHeight() {
            int height = this.text.getHeight() + this.padding.top + gap();
            Text text = this.author;
            return height + (text != null ? text.getHeight() : 0) + this.padding.bottom;
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
        public org.telegram.ui.Cells.u9[] getText() {
            return this.texts;
        }

        public int getTextWidth() {
            int minWidth = this.text.getMinWidth();
            Text text = this.author;
            return Math.max(minWidth, text != null ? text.getMinWidth() : 0);
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
            int iOffset;
            int height = this.text.getHeight();
            float y10 = motionEvent.getY();
            int iGap = 0;
            if (y10 >= 0.0f && y10 < height) {
                text = this.text;
                iOffset = offset(text);
            } else {
                if (this.author == null || y10 < gap() + height) {
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
        public void placeTexts(int i10, int i11, int i12) {
            Text text = this.text;
            text.setX((offset(text) + i10) - this.text.left);
            this.text.setY(i11);
            this.text.setRow(i12);
            Text text2 = this.author;
            if (text2 != null) {
                text2.setX((i10 + offset(text2)) - this.author.left);
                this.author.setY(this.text.getHeight() + i11 + gap());
                this.author.setRow(i12);
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

        public RichThinkingBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence) {
            super(richMessageLayout, rect, i10);
            this.matrix = new Matrix();
            this.paint = new Paint(1);
            Text text = new Text(richMessageLayout, charSequence, this.maxWidth);
            this.text = text;
            this.texts = new Text[]{text};
        }

        public void lambda$onDrawFaded$0(View view, Canvas canvas) {
            Text text = this.text;
            eh.k.g(view, false, -1, 0, text.spoilersPatchedTextLayout, 0, text.layout, text.spoilers, canvas, false);
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
            RichMessageLayout richMessageLayout = this.root;
            int themedColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.fc : org.telegram.ui.ActionBar.g6.f23077ec);
            if (this.gradient == null || this.gradientColor != themedColor) {
                this.gradientColor = themedColor;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.maxWidth, 0.0f, new int[]{org.telegram.ui.ActionBar.g6.l1(0.7f, themedColor), org.telegram.ui.ActionBar.g6.l1(0.25f, themedColor), org.telegram.ui.ActionBar.g6.l1(0.7f, themedColor)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
                this.gradient = linearGradient;
                this.paint.setShader(linearGradient);
                this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            }
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
        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            if (!this.text.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.f19628x = (this.padding.left + rtlOffset()) - this.text.left;
            foundLink.f19629y = i10 + this.padding.top;
            return true;
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
        public org.telegram.ui.Cells.u9[] getText() {
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
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, text2.layout, text2.animatedEmojiStack, 0.0f, text2.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
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
        public void onDrawFaded(Canvas canvas, int i10, float f10) {
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
            richMessageLayout.textPaint.linkColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.f23131hc : org.telegram.ui.ActionBar.g6.gc);
            gj0.b(canvas, this.text.layout, i10, f10, new c(4, this, this.view));
            canvas.restore();
            this.root.textPaint.setColor(color);
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
        public void placeTexts(int i10, int i11, int i12) {
            super.placeTexts(i10, i11, i12);
            int iRtlOffset = rtlOffset();
            if (iRtlOffset != 0) {
                Text text = this.text;
                text.setX((i10 + iRtlOffset) - text.left);
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

        public RichVideoBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockVideo pageblockvideo, boolean z10) {
            int i11;
            int i12;
            super(richMessageLayout, rect, i10, z10);
            this.block = pageblockvideo;
            TLRPC.Document document = richMessageLayout.getDocument(pageblockvideo.video_id);
            this.document = document;
            boolean zIsVideoDocument = MessageObject.isVideoDocument(document);
            this.realVideo = zIsVideoDocument;
            int i13 = 0;
            this.isVideo = zIsVideoDocument || MessageObject.isGifDocument(document);
            if (document != null) {
                this.previewThumb = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
                this.strippedThumb = FileLoader.getStrippedPhotoSize(document.thumbs);
            } else {
                this.previewThumb = null;
                this.strippedThumb = null;
            }
            int i14 = 100;
            if (document != null) {
                while (true) {
                    if (i13 >= this.document.attributes.size()) {
                        i11 = 100;
                        i12 = 100;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.document.attributes.get(i13);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        i12 = documentAttribute.f22387w;
                        i11 = documentAttribute.h;
                        break;
                    }
                    i13++;
                }
                if (i12 <= 0 || i11 <= 0) {
                    TLRPC.PhotoSize photoSize = this.previewThumb;
                    i12 = photoSize != null ? photoSize.f22405w : 100;
                    i11 = photoSize != null ? photoSize.h : 100;
                }
                i14 = i12;
            } else {
                i11 = 100;
            }
            int iMax = this.maxWidth;
            int iMax2 = (int) ((iMax / Math.max(1, i14)) * i11);
            Point point = AndroidUtilities.displaySize;
            int iMax3 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (iMax2 > iMax3) {
                iMax = (int) ((iMax3 / Math.max(1, i11)) * i14);
                iMax2 = iMax3;
            }
            this.imgWidth = iMax;
            this.imgHeight = iMax2;
            finishLayout();
        }

        @Override
        public boolean allowAutoplay() {
            return this.realVideo ? SharedConfig.isAutoplayVideo() : SharedConfig.isAutoplayGifs();
        }

        @Override
        public void applyImage(boolean z10) {
            TLRPC.Document document = this.document;
            if (document == null) {
                return;
            }
            TLRPC.PhotoSize photoSize = this.strippedThumb;
            ImageLocation forDocument = photoSize != null ? ImageLocation.getForDocument(photoSize, document) : null;
            TLRPC.PhotoSize photoSize2 = this.previewThumb;
            ImageLocation forDocument2 = photoSize2 != null ? ImageLocation.getForDocument(photoSize2, this.document) : null;
            if (!z10 || !this.isVideo || (!allowAutoplay() && !this.mediaForced)) {
                this.imageReceiver.setImage(null, null, forDocument2, null, forDocument, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
                return;
            }
            this.imageReceiver.setAllowStartAnimation(true);
            this.imageReceiver.setAutoRepeat(1);
            this.imageReceiver.setImage(ImageLocation.getForDocument(this.document), "g", forDocument2, null, forDocument, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
        }

        @Override
        public boolean computeAutoDownload() {
            if (this.document == null) {
                return false;
            }
            if (this.isVideo) {
                return allowAutoplay() && DownloadController.getInstance(this.root.currentAccount).canDownloadMedia(4, this.document.size);
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
            return (pathToAttach != null && pathToAttach.exists()) || (pathToAttach2 != null && pathToAttach2.exists());
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
            return pageblockvideo != null && pageblockvideo.spoiler;
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
            return this.revealed && this.progress >= 1.0f;
        }

        public boolean isRevealing() {
            return this.revealed || this.animator != null;
        }

        public void start(final View view, float f10, float f11, float f12, float f13) {
            if (this.revealed || this.animator != null) {
                return;
            }
            this.cx = f10;
            this.cy = f11;
            this.maxR = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration((long) Utilities.clamp(this.maxR * 0.3f, 550.0f, 250.0f));
            this.animator.setInterpolator(er.f28125j);
            this.animator.addUpdateListener(new sh(0, this, view));
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
    }

    public static class StyleSpan extends MetricAffectingSpan {
        public final int flags;
        private boolean fullSizeTableEmoji;
        public final boolean metricsOnly;
        public final RichMessageLayout root;

        public StyleSpan(RichMessageLayout richMessageLayout, int i10) {
            this(richMessageLayout, i10, false);
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
            int i10 = this.flags & 15;
            if (i10 == 11) {
                RichMessageLayout richMessageLayout = this.root;
                return richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.f23040cb : org.telegram.ui.ActionBar.g6.Wc);
            }
            if (i10 == 10) {
                RichMessageLayout richMessageLayout2 = this.root;
                return org.telegram.ui.ActionBar.g6.l1(0.5f, richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.g6.fc : org.telegram.ui.ActionBar.g6.f23077ec));
            }
            RichMessageLayout richMessageLayout3 = this.root;
            return richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? org.telegram.ui.ActionBar.g6.fc : org.telegram.ui.ActionBar.g6.f23077ec);
        }

        public int getTextSize() {
            int i10 = this.flags & 15;
            int i11 = SharedConfig.fontSize;
            if (i10 == 14 && this.fullSizeTableEmoji) {
                return AndroidUtilities.dp(i11);
            }
            switch (i10) {
                case 1:
                    return AndroidUtilities.dp(i11 + 3);
                case 2:
                    return AndroidUtilities.dp(i11 + 2);
                case 3:
                    return AndroidUtilities.dp(i11 + 1);
                case 4:
                    return AndroidUtilities.dp(i11);
                case 5:
                    return AndroidUtilities.dp(i11 - 1);
                case 6:
                    return AndroidUtilities.dp(i11 - 2);
                case 7:
                case 13:
                    return AndroidUtilities.dp(i11 - 2);
                case 8:
                    return AndroidUtilities.dp(i11 - 1);
                case 9:
                case 11:
                case 12:
                    return AndroidUtilities.dp(i11 - 2);
                case 10:
                    return AndroidUtilities.dp(i11 - 2);
                case 14:
                    return AndroidUtilities.dp(Math.max(8, i11 - 2));
                case 15:
                    return AndroidUtilities.dp(i11 - 2);
                default:
                    return AndroidUtilities.dp(i11);
            }
        }

        public Typeface getTypeface() {
            int i10 = this.flags;
            int i11 = i10 & 15;
            if (i11 == 8) {
                return Typeface.MONOSPACE;
            }
            if (i11 == 11) {
                return AndroidUtilities.bold();
            }
            boolean z10 = true;
            if (i11 >= 1 && i11 <= 6) {
                return TLObject.hasFlag(i10, 32) ? AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf") : AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
            if (TLObject.hasFlag(i10, 256)) {
                return Typeface.MONOSPACE;
            }
            boolean zHasFlag = TLObject.hasFlag(this.flags, 16);
            if (!TLObject.hasFlag(this.flags, 32) && i11 != 12) {
                z10 = false;
            }
            if (zHasFlag && z10) {
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            }
            if (zHasFlag) {
                return AndroidUtilities.bold();
            }
            if (z10) {
                return AndroidUtilities.getTypeface("fonts/ritalic.ttf");
            }
            return null;
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            applyStyle(textPaint);
        }

        @Override
        public void updateMeasureState(TextPaint textPaint) {
            applyStyle(textPaint);
        }

        public StyleSpan(RichMessageLayout richMessageLayout, int i10, boolean z10) {
            this.root = richMessageLayout;
            this.flags = i10;
            this.metricsOnly = z10;
        }
    }

    public static class Text implements org.telegram.ui.Cells.u9, ly0 {
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
        public m80 linkCollector;
        private boolean longPressFired;
        private Runnable longPressRunnable;
        public j80 markPath;
        private RichButtonSpan pressedButtonSpan;
        private org.telegram.ui.Components.t5 pressedEmoji;
        private CharacterStyle pressedLink;
        private q80 pressedLinkDrawable;
        private int pressedLinkEnd;
        private int pressedLinkStart;
        private eh.k pressedSpoiler;
        public int right;
        public final RichMessageLayout root;
        public int row;
        private final RectF soleButtonHitBounds;
        public final List<eh.k> spoilers;
        public final AtomicReference<Layout> spoilersPatchedTextLayout;
        public final Stack<eh.k> spoilersPool;
        private t80 translationLoadingDrawable;
        private j80 translationLoadingPath;
        public View view;

        public int f19634x;

        public int f19635y;

        public static class EmojiLineMetrics {
            private int contentCount;
            private int emojiCount;
            private int emojiSide;

            private EmojiLineMetrics() {
            }

            public static int access$1408(EmojiLineMetrics emojiLineMetrics) {
                int i10 = emojiLineMetrics.emojiCount;
                emojiLineMetrics.emojiCount = i10 + 1;
                return i10;
            }

            public static int access$1412(EmojiLineMetrics emojiLineMetrics, int i10) {
                int i11 = emojiLineMetrics.emojiCount + i10;
                emojiLineMetrics.emojiCount = i11;
                return i11;
            }

            public static int access$1508(EmojiLineMetrics emojiLineMetrics) {
                int i10 = emojiLineMetrics.contentCount;
                emojiLineMetrics.contentCount = i10 + 1;
                return i10;
            }

            public static int access$1512(EmojiLineMetrics emojiLineMetrics, int i10) {
                int i11 = emojiLineMetrics.contentCount + i10;
                emojiLineMetrics.contentCount = i11;
                return i11;
            }

            public boolean allowsEmojiLineHeight() {
                int i10 = this.contentCount;
                return i10 > 0 && ((long) this.emojiCount) * 100 >= ((long) i10) * 70;
            }
        }

        public Text(RichMessageLayout richMessageLayout, CharSequence charSequence, int i10) {
            this(richMessageLayout, charSequence, i10, Layout.Alignment.ALIGN_NORMAL);
        }

        private static void allowEmojiLineHeight(Spanned spanned, int i10, int i11, int i12) {
            for (org.telegram.ui.Components.t5 t5Var : (org.telegram.ui.Components.t5[]) spanned.getSpans(i10, i11, org.telegram.ui.Components.t5.class)) {
                int spanStart = spanned.getSpanStart(t5Var);
                if (spanStart >= i10 && spanStart < i11) {
                    t5Var.setMinimumLineHeight(i12);
                }
            }
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spanned.getSpans(i10, i11, Emoji.EmojiSpan.class)) {
                int spanStart2 = spanned.getSpanStart(emojiSpan);
                if (spanStart2 >= i10 && spanStart2 < i11) {
                    emojiSpan.setMinimumLineHeight(i12);
                }
            }
            for (RichButtonSpan richButtonSpan : (RichButtonSpan[]) spanned.getSpans(i10, i11, RichButtonSpan.class)) {
                int spanStart3 = spanned.getSpanStart(richButtonSpan);
                if (richButtonSpan.button.text.getEmojiOnlyCount() > 0 && spanStart3 >= i10 && spanStart3 < i11) {
                    richButtonSpan.minimumLineHeight = i12;
                }
            }
        }

        private boolean buttonContains(RichButtonSpan richButtonSpan, float f10, float f11) {
            if (richButtonSpan.contains(f10, f11, AndroidUtilities.dp(8.0f))) {
                return true;
            }
            return richButtonSpan == getSoleButtonSpan() && this.soleButtonHitBounds.contains(f10, f11);
        }

        private void cancelLongPress() {
            Runnable runnable = this.longPressRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.longPressRunnable = null;
            }
        }

        private static CharSequence configureEmojiLineHeights(CharSequence charSequence, TextPaint textPaint) {
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
            int i10 = 0;
            while (i10 < spannableStringBuilder.length()) {
                int iIndexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '\n', i10);
                boolean z10 = iIndexOf >= 0;
                if (!z10) {
                    iIndexOf = spannableStringBuilder.length();
                }
                EmojiLineMetrics emojiLineMetricsMeasureEmojiLine = measureEmojiLine(spannableStringBuilder, i10, iIndexOf, textPaint);
                if (emojiLineMetricsMeasureEmojiLine.allowsEmojiLineHeight() && emojiLineMetricsMeasureEmojiLine.emojiSide > 0) {
                    allowEmojiLineHeight(spannableStringBuilder, i10, iIndexOf, emojiLineMetricsMeasureEmojiLine.emojiSide);
                }
                if (!z10) {
                    break;
                }
                i10 = iIndexOf + 1;
            }
            return spannableStringBuilder;
        }

        private void dispatchLinkClick(CharacterStyle characterStyle, boolean z10) {
            View view;
            String url;
            if (characterStyle == null) {
                return;
            }
            if (!z10 && (characterStyle instanceof URLSpan) && (url = ((URLSpan) characterStyle).getURL()) != null && url.startsWith("#") && this.root.handleAnchorClick(url)) {
                View view2 = this.view;
                if (view2 != null) {
                    view2.playSoundEffect(0);
                    return;
                }
                return;
            }
            CharacterStyle q41Var = ((characterStyle instanceof StyleSpan) && TLObject.hasFlag(((StyleSpan) characterStyle).flags, 256)) ? new q41(this.layout.getText(), this.pressedLinkStart, this.pressedLinkEnd, this.root.isOut() ? (byte) 1 : (byte) 0, null) : characterStyle;
            org.telegram.ui.Cells.j1 delegate = this.root.getDelegate();
            org.telegram.ui.Cells.s1 cell = this.root.getCell();
            if (delegate != null && cell != null) {
                View view3 = this.view;
                if (view3 != null && !z10) {
                    view3.playSoundEffect(0);
                }
                delegate.R0(cell, q41Var, z10);
                return;
            }
            if (z10 || (view = this.view) == null || !(characterStyle instanceof ClickableSpan)) {
                return;
            }
            view.playSoundEffect(0);
            ((ClickableSpan) characterStyle).onClick(this.view);
        }

        private void drawTranslationLoading(Canvas canvas) {
            RichMessageLayout richMessageLayout = this.root;
            float f10 = richMessageLayout.translationLoadingValue;
            if (f10 <= 0.0f) {
                return;
            }
            boolean zIsTranslating = richMessageLayout.isTranslating();
            if (this.translationLoadingDrawable == null) {
                t80 t80Var = new t80();
                this.translationLoadingDrawable = t80Var;
                t80Var.C = true;
                j80 j80Var = new j80(0);
                this.translationLoadingPath = j80Var;
                j80Var.f29462c = true;
                t80 t80Var2 = this.translationLoadingDrawable;
                t80Var2.f32711x = j80Var;
                t80Var2.j(5.0f);
                this.translationLoadingDrawable.f32692b = -1L;
                this.translationLoadingPath.reset();
                this.translationLoadingPath.d(this.layout, 0, 0.0f);
                this.translationLoadingPath.f29649n = false;
                StaticLayout staticLayout = this.layout;
                staticLayout.getSelectionPath(0, staticLayout.getText().length(), this.translationLoadingPath);
                j80 j80Var2 = this.translationLoadingPath;
                j80Var2.f29649n = true;
                j80Var2.a();
                this.translationLoadingDrawable.k();
            }
            if (zIsTranslating && (this.translationLoadingDrawable.c() || this.translationLoadingDrawable.b())) {
                t80 t80Var3 = this.translationLoadingDrawable;
                t80Var3.f32692b = -1L;
                t80Var3.f32693c = -1L;
            } else if (!zIsTranslating && !this.translationLoadingDrawable.c() && !this.translationLoadingDrawable.b()) {
                this.translationLoadingDrawable.a();
            }
            RichMessageLayout richMessageLayout2 = this.root;
            int themedColor = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.g6.f23131hc : org.telegram.ui.ActionBar.g6.gc);
            this.translationLoadingDrawable.f(org.telegram.ui.ActionBar.g6.l1(0.05f, themedColor), org.telegram.ui.ActionBar.g6.l1(0.15f, themedColor), org.telegram.ui.ActionBar.g6.l1(0.1f, themedColor), org.telegram.ui.ActionBar.g6.l1(0.3f, themedColor));
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
            for (int i10 = 0; i10 < spanned.length(); i10++) {
                if ((i10 < spanStart || i10 >= spanEnd) && !Character.isWhitespace(spanned.charAt(i10))) {
                    return null;
                }
            }
            return richButtonSpanArr[0];
        }

        public void lambda$drawFade$1(View view, int i10, Canvas canvas) {
            eh.k.g(view, false, i10, 0, this.spoilersPatchedTextLayout, 0, this.layout, this.spoilers, canvas, false);
            lv0.a(canvas, this.layout);
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
                ArrayList<org.telegram.ui.Cells.u9> arrayList = richMessageLayout.textBlocks;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    org.telegram.ui.Cells.u9 u9Var = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.Cells.u9 u9Var2 = u9Var;
                    if (u9Var2 instanceof Text) {
                        ((Text) u9Var2).spoilers.clear();
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
            view.post(new uh(this, richMessageLayout, view));
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
            m80 m80Var = this.linkCollector;
            if (m80Var != null) {
                m80Var.d(true);
            }
            this.pressedLinkDrawable = null;
        }

        private static EmojiLineMetrics measureEmojiLine(Spanned spanned, int i10, int i11, TextPaint textPaint) {
            RichButtonSpan[] richButtonSpanArr;
            EmojiLineMetrics emojiLineMetrics = new EmojiLineMetrics();
            int i12 = i11 - i10;
            if (i12 > 0) {
                org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(i10, i11, org.telegram.ui.Components.t5.class);
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(i10, i11, Emoji.EmojiSpan.class);
                int[] iArr = (t5VarArr.length == 0 && emojiSpanArr.length == 0) ? null : new int[i12];
                int length = t5VarArr.length;
                int i13 = 0;
                while (i13 < length) {
                    int i14 = i13;
                    org.telegram.ui.Components.t5 t5Var = t5VarArr[i14];
                    int spanStart = spanned.getSpanStart(t5Var);
                    int iMin = Math.min(i11, spanned.getSpanEnd(t5Var));
                    if (spanStart >= i10 && spanStart < i11 && iMin > spanStart) {
                        int i15 = spanStart - i10;
                        iArr[i15] = Math.max(iArr[i15], iMin);
                        emojiLineMetrics.emojiSide = Math.max(emojiLineMetrics.emojiSide, t5Var.getSize(textPaint, spanned, spanStart, iMin, null) + 1);
                    }
                    i13 = i14 + 1;
                }
                for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart2 = spanned.getSpanStart(emojiSpan);
                    int iMin2 = Math.min(i11, spanned.getSpanEnd(emojiSpan));
                    if (spanStart2 >= i10 && spanStart2 < i11 && iMin2 > spanStart2) {
                        int i16 = spanStart2 - i10;
                        iArr[i16] = Math.max(iArr[i16], iMin2);
                        emojiLineMetrics.emojiSide = Math.max(emojiLineMetrics.emojiSide, emojiSpan.getSize(textPaint, spanned, spanStart2, iMin2, null));
                    }
                }
                RichButtonSpan[] richButtonSpanArr2 = (RichButtonSpan[]) spanned.getSpans(i10, i11, RichButtonSpan.class);
                if (richButtonSpanArr2.length > 0) {
                    richButtonSpanArr = null;
                    for (RichButtonSpan richButtonSpan : richButtonSpanArr2) {
                        int spanStart3 = spanned.getSpanStart(richButtonSpan);
                        if (richButtonSpan.button.text.getEmojiOnlyCount() > 0 && spanStart3 >= i10 && spanStart3 < i11) {
                            if (richButtonSpanArr == null) {
                                richButtonSpanArr = new RichButtonSpan[i12];
                            }
                            richButtonSpanArr[spanStart3 - i10] = richButtonSpan;
                        }
                    }
                } else {
                    richButtonSpanArr = null;
                }
                if (iArr != null || richButtonSpanArr != null) {
                    int iCharCount = i10;
                    while (iCharCount < i11) {
                        int i17 = iCharCount - i10;
                        RichButtonSpan richButtonSpan2 = richButtonSpanArr == null ? null : richButtonSpanArr[i17];
                        if (richButtonSpan2 == null || !(richButtonSpan2.button.text.layout.getText() instanceof Spanned)) {
                            int i18 = iArr == null ? 0 : iArr[i17];
                            if (i18 > iCharCount) {
                                EmojiLineMetrics.access$1408(emojiLineMetrics);
                                EmojiLineMetrics.access$1508(emojiLineMetrics);
                                iCharCount = i18;
                            } else {
                                int iCodePointAt = Character.codePointAt(spanned, iCharCount);
                                if (!Character.isWhitespace(iCodePointAt)) {
                                    EmojiLineMetrics.access$1508(emojiLineMetrics);
                                }
                                iCharCount += Character.charCount(iCodePointAt);
                            }
                        } else {
                            Spanned spanned2 = (Spanned) richButtonSpan2.button.text.layout.getText();
                            EmojiLineMetrics emojiLineMetricsMeasureEmojiLine = measureEmojiLine(spanned2, 0, spanned2.length(), richButtonSpan2.button.text.layout.getPaint());
                            EmojiLineMetrics.access$1412(emojiLineMetrics, emojiLineMetricsMeasureEmojiLine.emojiCount);
                            EmojiLineMetrics.access$1512(emojiLineMetrics, Math.max(1, emojiLineMetricsMeasureEmojiLine.contentCount));
                            emojiLineMetrics.emojiSide = Math.max(emojiLineMetrics.emojiSide, emojiLineMetricsMeasureEmojiLine.emojiSide);
                            iCharCount = Math.min(i11, spanned.getSpanEnd(richButtonSpan2));
                        }
                    }
                }
            }
            return emojiLineMetrics;
        }

        private void revealSpoilers(int i10, int i11) {
            if (this.pressedSpoiler == null) {
                return;
            }
            float width = this.layout.getWidth();
            float height = this.layout.getHeight();
            float fSqrt = (float) Math.sqrt((height * height) + (width * width));
            View view = this.view;
            this.pressedSpoiler.f5525q = new uh(this, view, this.root);
            Iterator<eh.k> it = this.spoilers.iterator();
            while (it.hasNext()) {
                it.next().j(i10, i11, fSqrt, false);
            }
            if (view != null) {
                view.playSoundEffect(0);
            }
        }

        private void scheduleLongPress() {
            cancelLongPress();
            rg rgVar = new rg(this, 10);
            this.longPressRunnable = rgVar;
            AndroidUtilities.runOnUIThread(rgVar, ViewConfiguration.getLongPressTimeout());
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
            if (view2 == view && view2 != null) {
                this.view = null;
                onDetachedFromWindow();
            }
        }

        public void draw(Canvas canvas) {
            draw(canvas, this.view);
        }

        public void drawFade(Canvas canvas, int i10, float f10) {
            canvas.save();
            canvas.translate(-drawLeft(), 0.0f);
            RichMessageLayout richMessageLayout = this.root;
            final int themedColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.fc : org.telegram.ui.ActionBar.g6.f23077ec);
            this.root.textPaint.setColor(themedColor);
            RichMessageLayout richMessageLayout2 = this.root;
            richMessageLayout2.textPaint.linkColor = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.g6.f23131hc : org.telegram.ui.ActionBar.g6.gc);
            final View view = this.view;
            gj0.b(canvas, this.layout, i10, f10, new fj0() {
                @Override
                public final void b(Canvas canvas2) {
                    this.f21644a.lambda$drawFade$1(view, themedColor, canvas2);
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
            if (staticLayout == null || staticLayout.getLineCount() <= 0) {
                return -1;
            }
            return this.layout.getLineBaseline(0);
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
            return this.blockX + this.f19634x;
        }

        @Override
        public int getY() {
            return this.blockY + this.f19635y;
        }

        public boolean isAttached() {
            return this.view != null;
        }

        public boolean isPressingLink() {
            return (this.pressedLink == null && this.pressedButtonSpan == null) ? false : true;
        }

        public Text offset(int i10, int i11) {
            this.f19634x += i10;
            this.f19635y += i11;
            return this;
        }

        public void onAttachedToWindow() {
            this.animatedEmojiStack = org.telegram.ui.Components.t5.update(0, this.view, this.root.invalidateAnimatedEmojiInParent && !this.doNotInvalidateEmojiInParent, this.animatedEmojiStack, this.layout);
            m80 m80Var = this.linkCollector;
            if (m80Var != null) {
                m80Var.f30618a = this.view;
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
            m80 m80Var = this.linkCollector;
            if (m80Var != null) {
                m80Var.f30618a = null;
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
            int i10;
            StyleSpan styleSpan2;
            StyleSpan styleSpan3;
            int spanStart;
            int actionMasked = motionEvent.getActionMasked();
            int iDrawLeft = drawLeft() + ((int) motionEvent.getX());
            int y10 = (int) motionEvent.getY();
            if (actionMasked != 0) {
                if (actionMasked == 2) {
                    RichButtonSpan richButtonSpan = this.pressedButtonSpan;
                    if (richButtonSpan != null) {
                        if (!buttonContains(richButtonSpan, iDrawLeft, y10)) {
                            cancelLongPress();
                            this.pressedButtonSpan.setPressed(false);
                            this.pressedButtonSpan = null;
                            this.longPressFired = false;
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                if (actionMasked == 1) {
                    if (this.pressedButtonSpan != null) {
                        cancelLongPress();
                        RichButtonSpan richButtonSpan2 = this.pressedButtonSpan;
                        this.pressedButtonSpan = null;
                        richButtonSpan2.setPressed(false);
                        if (!this.longPressFired) {
                            View view = this.view;
                            if (view != null) {
                                view.playSoundEffect(0);
                            }
                            richButtonSpan2.didPress(this.root.getCell(), this.root.getDelegate(), false);
                        }
                        this.longPressFired = false;
                        return true;
                    }
                    if (this.pressedSpoiler != null) {
                        revealSpoilers(iDrawLeft, y10);
                        this.pressedSpoiler = null;
                        return true;
                    }
                    if (this.pressedLink != null) {
                        cancelLongPress();
                        if (!this.longPressFired) {
                            dispatchLinkClick(this.pressedLink, false);
                        }
                        m80 m80Var = this.linkCollector;
                        if (m80Var != null) {
                            m80Var.d(true);
                        }
                        this.pressedLink = null;
                        this.pressedLinkDrawable = null;
                        this.longPressFired = false;
                        return true;
                    }
                    org.telegram.ui.Components.t5 t5Var = this.pressedEmoji;
                    if (t5Var != null) {
                        this.pressedEmoji = null;
                        org.telegram.ui.Cells.s1 cell = this.root.getCell();
                        org.telegram.ui.Cells.j1 delegate = this.root.getDelegate();
                        if (cell != null && delegate != null) {
                            View view2 = this.view;
                            if (view2 != null) {
                                view2.playSoundEffect(0);
                            }
                            delegate.s0(t5Var);
                            return true;
                        }
                        return true;
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
                        m80 m80Var2 = this.linkCollector;
                        if (m80Var2 != null) {
                            m80Var2.d(true);
                        }
                        this.pressedLink = null;
                        this.pressedLinkDrawable = null;
                        this.longPressFired = false;
                    }
                }
                return false;
            }
            this.pressedSpoiler = null;
            this.pressedLink = null;
            this.pressedEmoji = null;
            this.pressedButtonSpan = null;
            for (eh.k kVar : this.spoilers) {
                if (kVar.getBounds().contains(iDrawLeft, y10)) {
                    this.pressedSpoiler = kVar;
                    return true;
                }
            }
            RichButtonSpan[] buttonSpans = getButtonSpans();
            if (buttonSpans != null) {
                for (RichButtonSpan richButtonSpan3 : buttonSpans) {
                    if (buttonContains(richButtonSpan3, iDrawLeft, y10)) {
                        if (!richButtonSpan3.isDisabled()) {
                            this.pressedButtonSpan = richButtonSpan3;
                            this.longPressFired = false;
                            richButtonSpan3.setPressed(true);
                            View view3 = this.view;
                            if (view3 != null) {
                                view3.invalidate();
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
                float f10 = iDrawLeft;
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
                        q80 q80Var = new q80(this.pressedLink, this.root.resourcesProvider, f10, y10, 0);
                        j80 j80VarB = q80Var.b();
                        j80VarB.d(this.layout, this.pressedLinkStart, 0.0f);
                        this.layout.getSelectionPath(this.pressedLinkStart, this.pressedLinkEnd, j80VarB);
                        this.pressedLinkDrawable = q80Var;
                        if (this.linkCollector == null) {
                            this.linkCollector = new m80(this.view);
                        }
                        this.linkCollector.a(q80Var, null);
                        View view4 = this.view;
                        if (view4 != null) {
                            view4.invalidate();
                        }
                        scheduleLongPress();
                        return true;
                    }
                    StyleSpan[] styleSpanArr = (StyleSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, StyleSpan.class);
                    if (styleSpanArr == null) {
                        styleSpan = null;
                        break;
                    }
                    int length = styleSpanArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            styleSpan = null;
                            break;
                        }
                        styleSpan = styleSpanArr[i11];
                        if (TLObject.hasFlag(styleSpan.flags, 256)) {
                            break;
                        }
                        i11++;
                    }
                    if (styleSpan != null) {
                        int spanStart2 = spannable.getSpanStart(styleSpan);
                        int spanEnd = spannable.getSpanEnd(styleSpan);
                        while (true) {
                            if (spanStart2 <= 0) {
                                z10 = true;
                                break;
                            }
                            int i12 = spanStart2 - 1;
                            StyleSpan[] styleSpanArr2 = (StyleSpan[]) spannable.getSpans(i12, i12, StyleSpan.class);
                            int length2 = styleSpanArr2.length;
                            int i13 = 0;
                            while (true) {
                                z10 = true;
                                if (i13 >= length2) {
                                    styleSpan3 = null;
                                    break;
                                }
                                styleSpan3 = styleSpanArr2[i13];
                                if (TLObject.hasFlag(styleSpan3.flags, 256)) {
                                    break;
                                }
                                i13++;
                            }
                            if (styleSpan3 == null || (spanStart = spannable.getSpanStart(styleSpan3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                        }
                        do {
                            i10 = spanEnd;
                            if (i10 >= spannable.length()) {
                                break;
                            }
                            StyleSpan[] styleSpanArr3 = (StyleSpan[]) spannable.getSpans(i10, i10, StyleSpan.class);
                            int length3 = styleSpanArr3.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length3) {
                                    styleSpan2 = null;
                                    break;
                                }
                                styleSpan2 = styleSpanArr3[i14];
                                if (TLObject.hasFlag(styleSpan2.flags, 256)) {
                                    break;
                                }
                                i14++;
                            }
                            if (styleSpan2 == null) {
                                break;
                            }
                            spanEnd = spannable.getSpanEnd(styleSpan2);
                        } while (spanEnd > i10);
                        this.pressedLink = styleSpan;
                        this.pressedLinkStart = spanStart2;
                        this.pressedLinkEnd = i10;
                        this.longPressFired = false;
                        q80 q80Var2 = new q80(styleSpan, this.root.resourcesProvider, f10, y10, 0);
                        j80 j80VarB2 = q80Var2.b();
                        j80VarB2.d(this.layout, spanStart2, 0.0f);
                        this.layout.getSelectionPath(spanStart2, i10, j80VarB2);
                        this.pressedLinkDrawable = q80Var2;
                        if (this.linkCollector == null) {
                            this.linkCollector = new m80(this.view);
                        }
                        this.linkCollector.a(q80Var2, null);
                        View view5 = this.view;
                        if (view5 != null) {
                            view5.invalidate();
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
        }

        public void refreshAnimatedEmoji(int i10) {
            View view = this.view;
            if (view == null) {
                return;
            }
            org.telegram.ui.Components.t5.release(view, this.animatedEmojiStack);
            this.animatedEmojiStack = null;
            this.animatedEmojiStack = org.telegram.ui.Components.t5.update(i10, this.view, this.root.invalidateAnimatedEmojiInParent && !this.doNotInvalidateEmojiInParent, (org.telegram.ui.Components.p5) null, this.layout);
        }

        public void setBlockX(int i10) {
            this.blockX = i10;
        }

        public void setBlockY(int i10) {
            this.blockY = i10;
        }

        public void setDrawAtOrigin(boolean z10) {
            this.drawAtOrigin = z10;
        }

        @Override
        public void setRow(int i10) {
            this.row = i10;
        }

        @Override
        public void setX(int i10) {
            this.f19634x = i10;
        }

        @Override
        public void setY(int i10) {
            this.f19635y = i10;
        }

        public Text(RichMessageLayout richMessageLayout, CharSequence charSequence, int i10, Layout.Alignment alignment) {
            this(richMessageLayout, charSequence, i10, alignment, 1.0f);
        }

        @Override
        public void draw(Canvas canvas, View view) {
            canvas.save();
            canvas.translate(-drawLeft(), 0.0f);
            RichMessageLayout richMessageLayout = this.root;
            int themedColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.fc : org.telegram.ui.ActionBar.g6.f23077ec);
            this.root.textPaint.setColor(themedColor);
            RichMessageLayout richMessageLayout2 = this.root;
            richMessageLayout2.textPaint.linkColor = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.g6.f23131hc : org.telegram.ui.ActionBar.g6.gc);
            if (this.markPath != null) {
                if (markPaint == null) {
                    Paint paint = new Paint(1);
                    markPaint = paint;
                    paint.setPathEffect(j80.c());
                }
                markPaint.setColor((this.root.quoteLine.h() & 16777215) | 855638016);
                canvas.drawPath(this.markPath, markPaint);
            }
            View view2 = view != null ? view : this.view;
            m80 m80Var = this.linkCollector;
            if (m80Var != null && m80Var.f(canvas) && view2 != null) {
                view2.invalidate();
            }
            eh.k.g(view2, false, themedColor, 0, this.spoilersPatchedTextLayout, 0, this.layout, this.spoilers, canvas, false);
            lv0.a(canvas, this.layout);
            if (!this.root.isOverlayActive()) {
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.layout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
            }
            drawTranslationLoading(canvas);
            canvas.restore();
        }

        public Text(RichMessageLayout richMessageLayout, CharSequence charSequence, int i10, Layout.Alignment alignment, float f10) {
            boolean z10;
            int iDp;
            int iDp2;
            this.spoilers = new ArrayList();
            this.spoilersPool = new Stack<>();
            this.spoilersPatchedTextLayout = new AtomicReference<>();
            this.soleButtonHitBounds = new RectF();
            this.root = richMessageLayout;
            Paint.FontMetricsInt fontMetricsInt = richMessageLayout.textPaint.getFontMetricsInt();
            if (!(charSequence instanceof Spanned)) {
                z10 = false;
                break;
            }
            StyleSpan[] styleSpanArr = (StyleSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), StyleSpan.class);
            int length = styleSpanArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = false;
                    break;
                }
                StyleSpan styleSpan = styleSpanArr[i11];
                int i12 = styleSpan.flags & 15;
                if (i12 >= 1 && i12 <= 6) {
                    TextPaint textPaint = new TextPaint(richMessageLayout.textPaint);
                    styleSpan.applyStyle(textPaint);
                    fontMetricsInt = textPaint.getFontMetricsInt();
                    z10 = true;
                    break;
                }
                i11++;
            }
            CharSequence charSequenceConfigureEmojiLineHeights = configureEmojiLineHeights(Emoji.replaceEmoji(charSequence, fontMetricsInt, false, z10 ? 0.85f : 1.0f), richMessageLayout.textPaint);
            int iD = rh.v5.d(charSequenceConfigureEmojiLineHeights);
            this.emojiOnlyCount = iD;
            if (iD == 0 && (charSequenceConfigureEmojiLineHeights instanceof Spanned)) {
                Spanned spanned = (Spanned) charSequenceConfigureEmojiLineHeights;
                RichButtonSpan[] richButtonSpanArr = (RichButtonSpan[]) spanned.getSpans(0, charSequenceConfigureEmojiLineHeights.length(), RichButtonSpan.class);
                if (richButtonSpanArr.length > 0) {
                    Arrays.sort(richButtonSpanArr, new rh(spanned, 1));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceConfigureEmojiLineHeights);
                    int length2 = richButtonSpanArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length2) {
                            RichButtonSpan richButtonSpan = richButtonSpanArr[i13];
                            int spanStart = spanned.getSpanStart(richButtonSpan);
                            int spanEnd = spanned.getSpanEnd(richButtonSpan);
                            if (spanStart < 0 || spanEnd <= spanStart || richButtonSpan.getButton().text.getEmojiOnlyCount() == 0) {
                                break;
                            }
                            spannableStringBuilder.replace(spanStart, spanEnd, richButtonSpan.getButton().text.layout.getText());
                            i13++;
                        } else {
                            this.emojiOnlyCount = rh.v5.d(spannableStringBuilder);
                            break;
                        }
                    }
                }
            }
            if (this.emojiOnlyCount > 0 && (charSequenceConfigureEmojiLineHeights instanceof Spanned)) {
                for (StyleSpan styleSpan2 : (StyleSpan[]) ((Spanned) charSequenceConfigureEmojiLineHeights).getSpans(0, charSequenceConfigureEmojiLineHeights.length(), StyleSpan.class)) {
                    if ((styleSpan2.flags & 15) == 14) {
                        styleSpan2.fullSizeTableEmoji = true;
                    }
                }
            }
            if (charSequenceConfigureEmojiLineHeights instanceof Spanned) {
                StyleSpan[] styleSpanArr2 = (StyleSpan[]) ((Spanned) charSequenceConfigureEmojiLineHeights).getSpans(0, charSequenceConfigureEmojiLineHeights.length(), StyleSpan.class);
                int length3 = styleSpanArr2.length;
                for (int i14 = 0; i14 < length3 && (styleSpanArr2[i14].flags & 15) == 0; i14++) {
                }
            }
            this.layout = MessageObject.makeStaticLayout(charSequenceConfigureEmojiLineHeights, richMessageLayout.textPaint, i10, f10, 0.0f, false, alignment);
            this.left = i10;
            this.right = 0;
            for (int i15 = 0; i15 < this.layout.getLineCount(); i15++) {
                this.left = Math.min(this.left, (int) Math.floor(this.layout.getLineLeft(i15)));
                this.right = Math.max(this.right, (int) Math.ceil(this.layout.getLineRight(i15)));
            }
            this.lastLineRight = 0;
            if (this.layout.getLineCount() > 0) {
                StaticLayout staticLayout = this.layout;
                this.lastLineRight = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
            }
            j80 j80Var = null;
            eh.k.c(null, this.layout, this.spoilersPool, this.spoilers);
            if (this.layout.getText() instanceof Spanned) {
                Spanned spanned2 = (Spanned) this.layout.getText();
                for (StyleSpan styleSpan3 : (StyleSpan[]) spanned2.getSpans(0, spanned2.length(), StyleSpan.class)) {
                    if (TLObject.hasFlag(styleSpan3.flags, 8192)) {
                        int spanStart2 = spanned2.getSpanStart(styleSpan3);
                        int spanEnd2 = spanned2.getSpanEnd(styleSpan3);
                        if (spanStart2 >= 0 && spanEnd2 > spanStart2) {
                            if (j80Var == null) {
                                j80Var = new j80(0);
                                j80Var.f29649n = false;
                            }
                            j80Var.d(this.layout, spanStart2, 0.0f);
                            if (TLObject.hasFlag(styleSpan3.flags, 4096)) {
                                iDp = -AndroidUtilities.dp(6.0f);
                            } else {
                                iDp = TLObject.hasFlag(styleSpan3.flags, 2048) ? AndroidUtilities.dp(2.0f) : 0;
                            }
                            if (iDp != 0) {
                                iDp2 = AndroidUtilities.dp(iDp > 0 ? 5.0f : -2.0f) + iDp;
                            } else {
                                iDp2 = 0;
                            }
                            j80Var.f29650o = iDp2;
                            this.layout.getSelectionPath(spanStart2, spanEnd2, j80Var);
                        }
                    }
                }
                if (j80Var != null) {
                    j80Var.f29649n = true;
                    this.markPath = j80Var;
                }
            }
        }
    }

    public RichMessageLayout(MessageObject messageObject, int i10, RichMessageLayout richMessageLayout) {
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
        this.quoteLine = new gl0(null);
        this.clip = new v10();
        this.showMoreRect = new RectF();
        this.messageObject = messageObject;
        this.maxWidth = i10;
        this.currentAccount = messageObject.currentAccount;
        layout(richMessageLayout);
    }

    private void appendSelectionPiece(StringBuilder sb2, CharSequence charSequence, int i10, int i11, boolean z10) {
        if (i11 <= i10) {
            return;
        }
        SpannableStringBuilder richHtmlSpannable = toRichHtmlSpannable(charSequence.subSequence(i10, i11));
        StringBuilder sb3 = new StringBuilder();
        rh.v3.g(sb3, richHtmlSpannable);
        String string = sb3.toString();
        if (string.isEmpty()) {
            return;
        }
        sb2.append(z10 ? "<cite>" : "<p>");
        sb2.append(string);
        sb2.append(z10 ? "</cite>" : "</p>");
    }

    private void applyListPaddingFromBlocks() {
        int i10 = 0;
        while (i10 < this.blocks.size()) {
            RichBlock richBlock = this.blocks.get(i10);
            if ((richBlock instanceof RichTextBlock) && richBlock.listLevel > 0) {
                int i11 = i10 + 1;
                ((RichTextBlock) richBlock).setContentPadding(AndroidUtilities.dp(i10 > 0 && this.blocks.get(i10 + (-1)).listLevel > 0 ? 2.0f : 6.0f), AndroidUtilities.dp(i11 < this.blocks.size() && this.blocks.get(i11).listLevel > 0 ? 5.0f : 9.0f));
            }
            i10++;
        }
    }

    private void closeLists(StringBuilder sb2, ArrayList<Boolean> arrayList) {
        while (!arrayList.isEmpty()) {
            sb2.append(((Boolean) com.google.android.recaptcha.internal.a.k(1, arrayList)).booleanValue() ? "</ol>" : "</ul>");
        }
    }

    private void computeBlockquoteClips(float f10) {
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock instanceof RichTextBlockQuote) {
                RichTextBlockQuote richTextBlockQuote = (RichTextBlockQuote) richBlock;
                richTextBlockQuote.collapsedProgress = AndroidUtilities.lerp(richTextBlockQuote.prevCollapsed ? 1.0f : 0.0f, richTextBlockQuote.currentCollapsed ? 1.0f : 0.0f, f10);
                richTextBlockQuote.collapsedHeightToDraw = AndroidUtilities.lerp(richTextBlockQuote.prevH, richTextBlockQuote.currH, f10);
            }
        }
    }

    private void computeDetailsClips(float f10) {
        float fLerp;
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock instanceof RichDetailsBlock) {
                RichDetailsBlock richDetailsBlock = (RichDetailsBlock) richBlock;
                richDetailsBlock.animClipTop = AndroidUtilities.lerp(richDetailsBlock.prevY, richDetailsBlock.currY, f10) + richDetailsBlock.getHeight();
                int i11 = i10 + 1;
                while (true) {
                    if (i11 >= this.blocks.size()) {
                        fLerp = Float.MAX_VALUE;
                        break;
                    } else {
                        if (!isDescendantOf(this.blocks.get(i11), richDetailsBlock)) {
                            fLerp = AndroidUtilities.lerp(this.blocks.get(i11).prevY, this.blocks.get(i11).currY, f10);
                            break;
                        }
                        i11++;
                    }
                }
                richDetailsBlock.animClipBottom = fLerp;
            }
        }
    }

    public static MessageObject.GroupedMessagePosition[] computeGrouped(float[] fArr) {
        int length = fArr.length;
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr = new MessageObject.GroupedMessagePosition[length];
        if (length == 0) {
            return groupedMessagePositionArr;
        }
        StringBuilder sb2 = new StringBuilder();
        float f10 = 0.0f;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = fArr[i10];
            float f12 = f11 <= 0.0f ? 1.0f : f11;
            MessageObject.GroupedMessagePosition groupedMessagePosition = new MessageObject.GroupedMessagePosition();
            groupedMessagePositionArr[i10] = groupedMessagePosition;
            groupedMessagePosition.aspectRatio = f12;
            if (f12 > 1.2f) {
                sb2.append("w");
            } else if (f12 < 0.8f) {
                sb2.append("n");
            } else {
                sb2.append("q");
            }
            f10 += f12;
            if (f12 > 2.0f) {
                z10 = true;
            }
        }
        float f13 = f10 / length;
        int iDp = AndroidUtilities.dp(120.0f);
        float fDp = AndroidUtilities.dp(120.0f);
        Point point = AndroidUtilities.displaySize;
        float f14 = 1000;
        int iMin = (int) (fDp / (Math.min(point.x, point.y) / f14));
        float fDp2 = AndroidUtilities.dp(40.0f);
        Point point2 = AndroidUtilities.displaySize;
        int iMin2 = (int) (fDp2 / (Math.min(point2.x, point2.y) / f14));
        float f15 = f14 / 814.0f;
        float fDp3 = AndroidUtilities.dp(100.0f) / 814.0f;
        if (length == 1) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = groupedMessagePositionArr[0];
            groupedMessagePosition2.set(0, 0, 0, 0, 1000, Math.round(Math.min(f14 / groupedMessagePosition2.aspectRatio, 407.0f)) / 814.0f, 15);
            return groupedMessagePositionArr;
        }
        int i11 = 3;
        if (!z10 && (length == 2 || length == 3 || length == 4)) {
            if (length == 2) {
                MessageObject.GroupedMessagePosition groupedMessagePosition3 = groupedMessagePositionArr[0];
                MessageObject.GroupedMessagePosition groupedMessagePosition4 = groupedMessagePositionArr[1];
                String string = sb2.toString();
                if (string.equals("ww") && f13 > f15 * 1.4f) {
                    float f16 = groupedMessagePosition3.aspectRatio;
                    float f17 = groupedMessagePosition4.aspectRatio;
                    if (f16 - f17 < 0.2f) {
                        float fRound = Math.round(Math.min(f14 / f16, Math.min(f14 / f17, 407.0f))) / 814.0f;
                        groupedMessagePosition3.set(0, 0, 0, 0, 1000, fRound, 7);
                        groupedMessagePosition4.set(0, 0, 1, 1, 1000, fRound, 11);
                        return groupedMessagePositionArr;
                    }
                }
                if (string.equals("ww") || string.equals("qq")) {
                    float f18 = 500;
                    float fRound2 = Math.round(Math.min(f18 / groupedMessagePosition3.aspectRatio, Math.min(f18 / groupedMessagePosition4.aspectRatio, 814.0f))) / 814.0f;
                    groupedMessagePosition3.set(0, 0, 0, 0, 500, fRound2, 13);
                    groupedMessagePosition4.set(1, 1, 0, 0, 500, fRound2, 14);
                    return groupedMessagePositionArr;
                }
                float f19 = groupedMessagePosition3.aspectRatio;
                int iMax = (int) Math.max(0.4f * f14, Math.round((f14 / f19) / ((1.0f / groupedMessagePosition4.aspectRatio) + (1.0f / f19))));
                int i12 = 1000 - iMax;
                if (i12 < iMin) {
                    iMax -= iMin - i12;
                } else {
                    iMin = i12;
                }
                float fMin = Math.min(814.0f, Math.round(Math.min(iMin / groupedMessagePosition3.aspectRatio, iMax / groupedMessagePosition4.aspectRatio))) / 814.0f;
                groupedMessagePosition3.set(0, 0, 0, 0, iMin, fMin, 13);
                groupedMessagePosition4.set(1, 1, 0, 0, iMax, fMin, 14);
                return groupedMessagePositionArr;
            }
            if (length == 3) {
                MessageObject.GroupedMessagePosition groupedMessagePosition5 = groupedMessagePositionArr[0];
                MessageObject.GroupedMessagePosition groupedMessagePosition6 = groupedMessagePositionArr[1];
                MessageObject.GroupedMessagePosition groupedMessagePosition7 = groupedMessagePositionArr[2];
                if (sb2.charAt(0) == 'n') {
                    float f20 = groupedMessagePosition6.aspectRatio;
                    float fMin2 = Math.min(407.0f, Math.round((f20 * f14) / (groupedMessagePosition7.aspectRatio + f20)));
                    float f21 = 814.0f - fMin2;
                    int iMax2 = (int) Math.max(iMin, Math.min(f14 * 0.5f, Math.round(Math.min(groupedMessagePosition7.aspectRatio * fMin2, groupedMessagePosition6.aspectRatio * f21))));
                    groupedMessagePosition5.set(0, 0, 0, 1, Math.round(Math.min((groupedMessagePosition5.aspectRatio * 814.0f) + iMin2, 1000 - iMax2)), 1.0f, 13);
                    groupedMessagePosition6.set(1, 1, 0, 0, iMax2, f21 / 814.0f, 6);
                    groupedMessagePosition7.set(1, 1, 1, 1, iMax2, fMin2 / 814.0f, 10);
                    return groupedMessagePositionArr;
                }
                float fRound3 = Math.round(Math.min(f14 / groupedMessagePosition5.aspectRatio, 537.24005f)) / 814.0f;
                groupedMessagePosition5.set(0, 1, 0, 0, 1000, fRound3, 7);
                float f22 = 500;
                float fMin3 = Math.min(814.0f - fRound3, Math.round(Math.min(f22 / groupedMessagePosition6.aspectRatio, f22 / groupedMessagePosition7.aspectRatio))) / 814.0f;
                float f23 = fMin3 < fDp3 ? fDp3 : fMin3;
                groupedMessagePosition6.set(0, 0, 1, 1, 500, f23, 9);
                groupedMessagePosition7.set(1, 1, 1, 1, 500, f23, 10);
                return groupedMessagePositionArr;
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition8 = groupedMessagePositionArr[0];
            MessageObject.GroupedMessagePosition groupedMessagePosition9 = groupedMessagePositionArr[1];
            MessageObject.GroupedMessagePosition groupedMessagePosition10 = groupedMessagePositionArr[2];
            MessageObject.GroupedMessagePosition groupedMessagePosition11 = groupedMessagePositionArr[3];
            if (sb2.charAt(0) != 'w') {
                int iMax3 = Math.max(iMin, Math.round(814.0f / ((1.0f / groupedMessagePosition11.aspectRatio) + ((1.0f / groupedMessagePosition10.aspectRatio) + (1.0f / groupedMessagePosition9.aspectRatio)))));
                float f24 = iDp;
                float f25 = iMax3;
                float fMin4 = Math.min(0.33f, Math.max(f24, f25 / groupedMessagePosition9.aspectRatio) / 814.0f);
                float fMin5 = Math.min(0.33f, Math.max(f24, f25 / groupedMessagePosition10.aspectRatio) / 814.0f);
                float f26 = (1.0f - fMin4) - fMin5;
                groupedMessagePosition8.set(0, 0, 0, 2, Math.round(Math.min((groupedMessagePosition8.aspectRatio * 814.0f) + iMin2, 1000 - iMax3)), fMin4 + fMin5 + f26, 13);
                groupedMessagePosition9.set(1, 1, 0, 0, iMax3, fMin4, 6);
                groupedMessagePosition10.set(1, 1, 1, 1, iMax3, fMin5, 2);
                groupedMessagePosition11.set(1, 1, 2, 2, iMax3, f26, 10);
                return groupedMessagePositionArr;
            }
            float fRound4 = Math.round(Math.min(f14 / groupedMessagePosition8.aspectRatio, 537.24005f)) / 814.0f;
            groupedMessagePosition8.set(0, 2, 0, 0, 1000, fRound4, 7);
            float fRound5 = Math.round(f14 / ((groupedMessagePosition9.aspectRatio + groupedMessagePosition10.aspectRatio) + groupedMessagePosition11.aspectRatio));
            float f27 = iMin;
            int iMax4 = (int) Math.max(f27, Math.min(f14 * 0.4f, groupedMessagePosition9.aspectRatio * fRound5));
            int iMax5 = (int) Math.max(Math.max(f27, f14 * 0.33f), groupedMessagePosition11.aspectRatio * fRound5);
            int iDp2 = (1000 - iMax4) - iMax5;
            if (iDp2 < AndroidUtilities.dp(58.0f)) {
                int iDp3 = AndroidUtilities.dp(58.0f) - iDp2;
                iDp2 = AndroidUtilities.dp(58.0f);
                int i13 = iDp3 / 2;
                iMax4 -= i13;
                iMax5 -= iDp3 - i13;
            }
            int i14 = iMax4;
            float fMin6 = Math.min(814.0f - fRound4, fRound5) / 814.0f;
            float f28 = fMin6 < fDp3 ? fDp3 : fMin6;
            groupedMessagePosition9.set(0, 0, 1, 1, i14, f28, 9);
            groupedMessagePosition10.set(1, 1, 1, 1, iDp2, f28, 8);
            groupedMessagePosition11.set(2, 2, 1, 1, iMax5, f28, 10);
            return groupedMessagePositionArr;
        }
        int i15 = 1000;
        float[] fArr2 = new float[length];
        for (int i16 = 0; i16 < length; i16++) {
            float f29 = groupedMessagePositionArr[i16].aspectRatio;
            if (f13 > 1.1f) {
                fArr2[i16] = Math.max(1.0f, f29);
            } else {
                fArr2[i16] = Math.min(1.0f, f29);
            }
            fArr2[i16] = Math.max(0.66667f, Math.min(1.7f, fArr2[i16]));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i17 = 1; i17 < length; i17++) {
            int i18 = length - i17;
            if (i17 <= 3 && i18 <= 3) {
                arrayList.add(new int[]{i17, i18});
                arrayList2.add(new float[]{multiHeight(fArr2, 0, i17, 1000), multiHeight(fArr2, i17, length, 1000)});
            }
        }
        for (int i19 = 1; i19 < length - 1; i19++) {
            int i20 = 1;
            while (true) {
                int i21 = length - i19;
                if (i20 < i21) {
                    int i22 = i21 - i20;
                    if (i19 <= 3) {
                        if (i20 <= (f13 < 0.85f ? 4 : 3) && i22 <= 3) {
                            arrayList.add(new int[]{i19, i20, i22});
                            int i23 = i19 + i20;
                            arrayList2.add(new float[]{multiHeight(fArr2, 0, i19, 1000), multiHeight(fArr2, i19, i23, 1000), multiHeight(fArr2, i23, length, 1000)});
                        }
                    }
                    i20++;
                }
            }
        }
        int i24 = 1;
        while (i24 < length - 2) {
            int i25 = 1;
            while (true) {
                int i26 = length - i24;
                if (i25 < i26) {
                    int i27 = 1;
                    while (true) {
                        int i28 = i26 - i25;
                        if (i27 < i28) {
                            int i29 = i28 - i27;
                            if (i24 <= i11 && i25 <= i11 && i27 <= i11 && i29 <= i11) {
                                arrayList.add(new int[]{i24, i25, i27, i29});
                                int i30 = i24 + i25;
                                int i31 = i30 + i27;
                                arrayList2.add(new float[]{multiHeight(fArr2, 0, i24, i15), multiHeight(fArr2, i24, i30, i15), multiHeight(fArr2, i30, i31, i15), multiHeight(fArr2, i31, length, i15)});
                            }
                            i27++;
                            groupedMessagePositionArr = groupedMessagePositionArr;
                            i15 = 1000;
                            i11 = 3;
                        }
                    }
                    i25++;
                    i15 = 1000;
                    i11 = 3;
                }
            }
            i24++;
            i15 = 1000;
            i11 = 3;
        }
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr2 = groupedMessagePositionArr;
        float f30 = (f14 / 3.0f) * 4.0f;
        int i32 = -1;
        float f31 = 0.0f;
        for (int i33 = 0; i33 < arrayList.size(); i33++) {
            float[] fArr3 = (float[]) arrayList2.get(i33);
            int[] iArr = (int[]) arrayList.get(i33);
            float f32 = Float.MAX_VALUE;
            float f33 = 0.0f;
            for (float f34 : fArr3) {
                f33 += f34;
                if (f34 < f32) {
                    f32 = f34;
                }
            }
            float fAbs = Math.abs(f33 - f30);
            if (iArr.length > 1) {
                int i34 = iArr[0];
                int i35 = iArr[1];
                if (i34 > i35 || ((iArr.length > 2 && i35 > iArr[2]) || (iArr.length > 3 && iArr[2] > iArr[3]))) {
                    fAbs *= 1.2f;
                }
            }
            if (f32 < iMin) {
                fAbs *= 1.5f;
            }
            if (i32 == -1 || fAbs < f31) {
                i32 = i33;
                f31 = fAbs;
            }
        }
        if (i32 == -1) {
            int i36 = 0;
            while (i36 < length) {
                int i37 = i36;
                groupedMessagePositionArr2[i36].set(0, 0, i37, i36, 1000, 0.4f, 3);
                i36 = i37 + 1;
            }
            return groupedMessagePositionArr2;
        }
        int[] iArr2 = (int[]) arrayList.get(i32);
        float[] fArr4 = (float[]) arrayList2.get(i32);
        int i38 = 0;
        int i39 = 0;
        while (i39 < iArr2.length) {
            int i40 = iArr2[i39];
            float f35 = fArr4[i39];
            MessageObject.GroupedMessagePosition groupedMessagePosition12 = null;
            int i41 = 1000;
            for (int i42 = 0; i42 < i40; i42++) {
                int i43 = (int) (fArr2[i38] * f35);
                i41 -= i43;
                MessageObject.GroupedMessagePosition groupedMessagePosition13 = groupedMessagePositionArr2[i38];
                int i44 = i39 == 0 ? 4 : 0;
                if (i39 == iArr2.length - 1) {
                    i44 |= 8;
                }
                if (i42 == 0) {
                    i44 |= 1;
                }
                if (i42 == i40 - 1) {
                    i44 |= 2;
                    groupedMessagePosition12 = groupedMessagePosition13;
                }
                groupedMessagePosition13.set(i42, i42, i39, i39, i43, Math.max(fDp3, f35 / 814.0f), i44);
                i38++;
            }
            if (groupedMessagePosition12 != null) {
                groupedMessagePosition12.pw += i41;
                groupedMessagePosition12.spanSize += i41;
            }
            i39++;
        }
        return groupedMessagePositionArr2;
    }

    public static RichButtonSpan createEditorButtonSpan(int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var, TL_iv.textButton textbutton) {
        return new RichButtonSpan(i11, textbutton, Boolean.FALSE);
    }

    public static RichButton createEditorPageButton(int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var, TL_keyboard.PageButton pageButton, Runnable runnable) {
        RichMessageLayout richMessageLayout = new RichMessageLayout(i10, i11, c6Var);
        CharSequence text = richMessageLayout.formatText(pageButton.text, setBlockFlags(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        return new RichButton(richMessageLayout, i11, text, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, true, false, false, false, false, Boolean.FALSE, runnable);
    }

    private void drawBackground(Canvas canvas, org.telegram.ui.Cells.r1 r1Var) {
        if (!this.quotes.isEmpty()) {
            ArrayList<QuoteBackground> arrayList = this.quotes;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                QuoteBackground quoteBackground = arrayList.get(i10);
                int blockTop = getBlockTop(quoteBackground.startBlockIndex, r1Var);
                int blockBottom = getBlockBottom(quoteBackground.endBlockIndex, r1Var);
                float blockBackgroundScale = getBlockBackgroundScale(quoteBackground.startBlockIndex, quoteBackground.endBlockIndex);
                int iDp = AndroidUtilities.dp(3.0f) * quoteBackground.level;
                int i12 = quoteBackground.outerTopVpad + iDp;
                int i13 = iDp + quoteBackground.outerBottomVpad;
                if (blockBottom - blockTop > i12 + i13) {
                    blockTop += i12;
                    blockBottom -= i13;
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(quoteBackground.padding, blockTop, getMinWidth() - AndroidUtilities.dp(quoteBackground.level * 12), blockBottom);
                canvas.save();
                canvas.scale(blockBackgroundScale, blockBackgroundScale, rectF.centerX(), rectF.centerY());
                float fFloor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                this.quoteLine.c(canvas, rectF, fFloor, fFloor, fFloor, 1.0f, false, false);
                this.quoteLine.e(canvas, rectF, 1.0f);
                canvas.restore();
                i10 = i11;
            }
        }
        for (int i14 = 0; i14 < this.blocks.size(); i14++) {
            RichBlock richBlock = this.blocks.get(i14);
            if ((richBlock instanceof RichPullquoteBlock) && (richBlock.currVisible || richBlock.prevVisible)) {
                drawPullquoteBackground(canvas, (RichPullquoteBlock) richBlock, r1Var);
            }
        }
    }

    private void drawInternal(Canvas canvas, org.telegram.ui.Cells.r1 r1Var) {
        float f10;
        float f11;
        org.telegram.ui.Cells.s1 s1Var = this.cell;
        boolean z10 = s1Var != null && s1Var.Wd > 0;
        if (z10) {
            float f12 = s1Var.Ud - s1Var.f25440n0;
            f11 = s1Var.Wd + f12;
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        drawInternal(canvas, r1Var, z10, f10, f11);
    }

    private void drawPullquoteBackground(Canvas canvas, RichPullquoteBlock richPullquoteBlock, org.telegram.ui.Cells.r1 r1Var) {
        float fLerp;
        int textWidth = richPullquoteBlock.getTextWidth();
        if (textWidth <= 0) {
            return;
        }
        boolean z10 = r1Var != null && (this.detailsAnimating || this.blockquoteAnimating);
        float fMax = z10 ? Math.max(0.0f, Math.min(1.0f, r1Var.K1)) : 1.0f;
        if (z10) {
            fLerp = AndroidUtilities.lerp(richPullquoteBlock.prevVisible ? 1.0f : 0.0f, richPullquoteBlock.currVisible ? 1.0f : 0.0f, fMax);
        } else {
            fLerp = richPullquoteBlock.currVisible ? 1.0f : 0.0f;
        }
        if (fLerp <= 0.0f) {
            return;
        }
        float minWidth = ((getMinWidth() + this.padRight) - this.padLeft) / 2.0f;
        float f10 = textWidth / 2.0f;
        float fDp = (minWidth - f10) - AndroidUtilities.dp(30.0f);
        float fDp2 = minWidth + f10 + AndroidUtilities.dp(30.0f);
        float fLerp2 = z10 ? AndroidUtilities.lerp(richPullquoteBlock.prevY, richPullquoteBlock.currY, fMax) : richPullquoteBlock.currY;
        float fLerp3 = z10 ? AndroidUtilities.lerp(richPullquoteBlock.prevH, richPullquoteBlock.currH, fMax) : richPullquoteBlock.getHeight();
        float fDp3 = fLerp2 + AndroidUtilities.dp(8.0f);
        float fDp4 = (fLerp2 + fLerp3) - AndroidUtilities.dp(8.0f);
        if (fDp4 <= fDp3) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(fDp, fDp3, fDp2, fDp4);
        float fFloor = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
        this.quoteLine.c(canvas, rectF, fFloor, fFloor, fFloor, fLerp, false, false);
        if (this.pullquoteIcon == null) {
            this.pullquoteIcon = ApplicationLoader.applicationContext.getDrawable(R.drawable.mini_quote).mutate();
        }
        this.pullquoteIcon.setColorFilter(this.quoteLine.h(), PorterDuff.Mode.SRC_IN);
        this.pullquoteIcon.setAlpha((int) (fLerp * 255.0f));
        int intrinsicWidth = this.pullquoteIcon.getIntrinsicWidth();
        int intrinsicHeight = this.pullquoteIcon.getIntrinsicHeight();
        canvas.save();
        canvas.clipRect(fDp, fDp3, fDp2, fDp4);
        int i10 = (int) fDp;
        int i11 = (int) fDp3;
        this.pullquoteIcon.setBounds(AndroidUtilities.dp(8.0f) + i10, AndroidUtilities.dp(7.0f) + i11, y1.C(8.0f, i10, intrinsicWidth), y1.C(7.0f, i11, intrinsicHeight));
        canvas.scale(-1.0f, -1.0f, this.pullquoteIcon.getBounds().centerX(), this.pullquoteIcon.getBounds().centerY());
        this.pullquoteIcon.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(fDp, fDp3, fDp2, fDp4);
        int i12 = (int) fDp2;
        int i13 = (int) fDp4;
        this.pullquoteIcon.setBounds(y1.B(8.0f, i12, intrinsicWidth), y1.B(7.0f, i13, intrinsicHeight), i12 - AndroidUtilities.dp(8.0f), i13 - AndroidUtilities.dp(7.0f));
        canvas.scale(1.0f, -1.0f, this.pullquoteIcon.getBounds().centerX(), this.pullquoteIcon.getBounds().centerY());
        this.pullquoteIcon.draw(canvas);
        canvas.restore();
        this.pullquoteIcon.setAlpha(255);
    }

    private void drawShowMoreButton(Canvas canvas, int i10) {
        org.telegram.ui.Cells.j1 j1Var;
        int themedColor = getThemedColor(isOut() ? org.telegram.ui.ActionBar.g6.Xa : org.telegram.ui.ActionBar.g6.Kc);
        if (this.showMoreText == null) {
            this.showMoreText = new pz0(LocaleController.getString(R.string.ShowMore), 16.0f, AndroidUtilities.bold());
        }
        org.telegram.ui.Components.nc ncVar = this.showMoreBounce;
        if (ncVar == null) {
            this.showMoreBounce = new org.telegram.ui.Components.nc(this.view, 1.5f, 2.0f);
        } else {
            View view = ncVar.f30944a;
            View view2 = this.view;
            if (view != view2) {
                ncVar.f30944a = view2;
            }
        }
        if (this.showMorePaint == null) {
            this.showMorePaint = new Paint(1);
        }
        this.showMorePaint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, themedColor));
        float fDp = AndroidUtilities.dp(42.0f);
        float f10 = this.showMoreText.f31697c;
        float minWidth = ((getMinWidth() + this.padLeft) + this.padRight) - AndroidUtilities.dp(24.0f);
        int minWidth2 = getMinWidth();
        int i11 = this.padLeft;
        float f11 = (((minWidth2 + i11) + this.padRight) / 2.0f) - i11;
        float fDp2 = AndroidUtilities.dp(4.0f) + i10;
        float f12 = minWidth / 2.0f;
        this.showMoreRect.set(f11 - f12, fDp2, f11 + f12, fDp + fDp2);
        org.telegram.ui.Cells.s1 s1Var = this.cell;
        boolean z10 = (s1Var == null || (j1Var = this.delegate) == null || !j1Var.Y0(7, s1Var)) ? false : true;
        t80 t80Var = this.showMoreLoading;
        if (t80Var != null && !z10 && !t80Var.b() && !this.showMoreLoading.c()) {
            this.showMoreLoading.a();
        }
        t80 t80Var2 = this.showMoreLoading;
        if (t80Var2 == null && z10) {
            t80 t80Var3 = new t80();
            this.showMoreLoading = t80Var3;
            t80Var3.f32710w.setStrokeWidth(AndroidUtilities.dp(1.25f));
            this.showMoreLoading.C = true;
        } else if (t80Var2 != null && z10 && (t80Var2.b() || this.showMoreLoading.c())) {
            t80 t80Var4 = this.showMoreLoading;
            t80Var4.f32692b = -1L;
            t80Var4.f32693c = -1L;
        }
        t80 t80Var5 = this.showMoreLoading;
        if (t80Var5 != null) {
            t80Var5.f(org.telegram.ui.ActionBar.g6.l1(0.1f, themedColor), org.telegram.ui.ActionBar.g6.l1(0.3f, themedColor), org.telegram.ui.ActionBar.g6.l1(0.3f, themedColor), org.telegram.ui.ActionBar.g6.l1(1.2f, themedColor));
        }
        float fA = this.showMoreBounce.a(0.075f);
        boolean z11 = fA != 1.0f;
        if (z11) {
            canvas.save();
            canvas.scale(fA, fA, this.showMoreRect.centerX(), this.showMoreRect.centerY());
        }
        canvas.drawRoundRect(this.showMoreRect, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.showMorePaint);
        t80 t80Var6 = this.showMoreLoading;
        if (t80Var6 != null && !t80Var6.b()) {
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

    private RichBlock emitBlock(TL_iv.PageBlock pageBlock, int i10, Rect rect, int i11, boolean z10) {
        TLRPC.Document document;
        RichBlock richQuoteBlock;
        int i12;
        int i13;
        RichBlock richBlock;
        int i14 = i11;
        RichBlock richBlock2 = null;
        if (rect.left + rect.right >= this.maxWidth) {
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockThinking) {
            RichThinkingBlock richThinkingBlock = new RichThinkingBlock(this, new Rect(), this.maxWidth, formatText(pageBlock.text));
            this.blocks.add(richThinkingBlock);
            return richThinkingBlock;
        }
        if (org.telegram.ui.m4.K(pageBlock) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockParagraph)) {
            boolean zK = org.telegram.ui.m4.K(pageBlock);
            RichTextBlock richTextBlock = new RichTextBlock(this, rect, this.maxWidth, formatText(pageBlock.text, setBlockFlags(i14, getBlockTextFlag(pageBlock))));
            if (zK) {
                richTextBlock.setContentPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(6.0f));
            } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                richTextBlock.setContentPadding(z10 ? 0 : AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.66f));
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
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            int i15 = i10 + 1;
            this.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
            int iDp = AndroidUtilities.dp(18.0f);
            for (int i16 = 0; i16 < pageblocklist.items.size(); i16++) {
                iDp = Math.max(iDp, pageblocklist.items.get(i16).checkbox ? AndroidUtilities.dp(26.0f) : AndroidUtilities.dp(18.0f));
            }
            Rect rect2 = new Rect(rect);
            if (isRtl()) {
                rect2.right += iDp;
            } else {
                rect2.left += iDp;
            }
            int i17 = 0;
            while (i17 < pageblocklist.items.size()) {
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i17);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                    richBlock = richBlock2;
                    RichTextBlock richTextBlock2 = new RichTextBlock(this, new Rect(rect2), this.maxWidth, formatText(tL_pageListItemText.text, i14));
                    richTextBlock2.setListMarkerWidth(iDp);
                    if (tL_pageListItemText.checkbox) {
                        richTextBlock2.setCheckbox(tL_pageListItemText.checked, tL_pageListItemText);
                    } else {
                        richTextBlock2.setNum("•◦▪".charAt(i10 % 3) + "");
                    }
                    markListItem(richTextBlock2, i15, false, tL_pageListItemText.checkbox, tL_pageListItemText.checked);
                    this.blocks.add(richTextBlock2);
                } else {
                    richBlock = richBlock2;
                    if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                        TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                        if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                            int size = this.blocks.size();
                            int i18 = 0;
                            boolean z11 = false;
                            while (i18 < tL_pageListItemBlocks.blocks.size()) {
                                int i19 = i18;
                                RichBlock richBlockEmitBlock = emitBlock(tL_pageListItemBlocks.blocks.get(i18), i15, new Rect(rect2), i14, previousBlockIsParagraph(tL_pageListItemBlocks.blocks, i18));
                                if (richBlockEmitBlock != null && !z11) {
                                    richBlockEmitBlock.setListMarkerWidth(iDp);
                                    if (tL_pageListItemBlocks.checkbox) {
                                        richBlockEmitBlock.setCheckbox(tL_pageListItemBlocks.checked, tL_pageListItemBlocks);
                                    } else {
                                        richBlockEmitBlock.setNum("•◦▪".charAt(i10 % 3) + "");
                                    }
                                    markListItem(richBlockEmitBlock, i15, false, tL_pageListItemBlocks.checkbox, tL_pageListItemBlocks.checked);
                                    z11 = true;
                                }
                                i18 = i19 + 1;
                            }
                            markListMembership(size, this.blocks.size(), i15, false);
                        }
                    }
                    i17++;
                    richBlock2 = richBlock;
                }
                i17++;
                richBlock2 = richBlock;
            }
            return richBlock2;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            int i20 = i10 + 1;
            this.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
            TextPaint textPaint = new TextPaint(this.numTextPaint);
            textPaint.setTypeface(AndroidUtilities.bold());
            int iDp2 = AndroidUtilities.dp(28.0f);
            for (int i21 = 0; i21 < pageblockorderedlist.items.size(); i21++) {
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i21);
                iDp2 = Math.max(iDp2, AndroidUtilities.dp(10.0f) + ((int) Math.ceil(textPaint.measureText(orderedListMarker(pageblockorderedlist, pageListOrderedItem, i21)))) + (pageListOrderedItem.checkbox ? AndroidUtilities.dp(26.0f) : 0));
            }
            Rect rect3 = new Rect(rect);
            if (isRtl()) {
                rect3.right += iDp2;
            } else {
                rect3.left += iDp2;
            }
            int i22 = 0;
            while (i22 < pageblockorderedlist.items.size()) {
                TL_iv.PageListOrderedItem pageListOrderedItem2 = pageblockorderedlist.items.get(i22);
                if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2;
                    RichTextBlock richTextBlock3 = new RichTextBlock(this, new Rect(rect3), this.maxWidth, formatText(tL_pageListOrderedItemText.text, i14));
                    richTextBlock3.setListMarkerWidth(iDp2);
                    richTextBlock3.setNum(orderedListMarker(pageblockorderedlist, tL_pageListOrderedItemText, i22));
                    if (tL_pageListOrderedItemText.checkbox) {
                        richTextBlock3.setCheckbox(tL_pageListOrderedItemText.checked, tL_pageListOrderedItemText);
                    }
                    markListItem(richTextBlock3, i20, true, tL_pageListOrderedItemText.checkbox, tL_pageListOrderedItemText.checked);
                    this.blocks.add(richTextBlock3);
                } else {
                    if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                        TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2;
                        if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                            int size2 = this.blocks.size();
                            boolean z12 = false;
                            int i23 = 0;
                            while (i23 < tL_pageListOrderedItemBlocks.blocks.size()) {
                                RichBlock richBlockEmitBlock2 = emitBlock(tL_pageListOrderedItemBlocks.blocks.get(i23), i20, new Rect(rect3), i14, previousBlockIsParagraph(tL_pageListOrderedItemBlocks.blocks, i23));
                                int i24 = i14;
                                if (richBlockEmitBlock2 != null && !z12) {
                                    richBlockEmitBlock2.setListMarkerWidth(iDp2);
                                    if (tL_pageListOrderedItemBlocks.checkbox) {
                                        richBlockEmitBlock2.setCheckbox(tL_pageListOrderedItemBlocks.checked, tL_pageListOrderedItemBlocks);
                                    }
                                    richBlockEmitBlock2.setNum(orderedListMarker(pageblockorderedlist, tL_pageListOrderedItemBlocks, i22));
                                    if (tL_pageListOrderedItemBlocks.checkbox) {
                                        richBlockEmitBlock2.setCheckbox(tL_pageListOrderedItemBlocks.checked, tL_pageListOrderedItemBlocks);
                                    }
                                    markListItem(richBlockEmitBlock2, i20, true, tL_pageListOrderedItemBlocks.checkbox, tL_pageListOrderedItemBlocks.checked);
                                    z12 = true;
                                }
                                i23++;
                                i14 = i24;
                            }
                            i13 = i14;
                            markListMembership(size2, this.blocks.size(), i20, true);
                        }
                    }
                    i22++;
                    i14 = i13;
                }
                i13 = i14;
                i22++;
                i14 = i13;
            }
            return null;
        }
        int i25 = i14;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            int i26 = rect.left;
            int size3 = this.blocks.size();
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            CharSequence text = formatText(pageBlock.text, setBlockFlags(i25, getBlockTextFlag(pageBlock)));
            TL_iv.RichText richText = pageblockblockquote.caption;
            CharSequence text2 = (richText == null || TextUtils.isEmpty(getString(richText))) ? null : formatText(pageblockblockquote.caption, setBlockFlags(i25, 11));
            if (pageblockblockquote.collapsed) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                if (text2 != null) {
                    spannableStringBuilder.append('\n');
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(text2);
                    i12 = length;
                } else {
                    i12 = -1;
                }
                RichTextBlockQuote richTextBlockQuote = new RichTextBlockQuote(this, new Rect(AndroidUtilities.dp(12.0f) + rect.left, AndroidUtilities.dp(4.0f) + rect.top, AndroidUtilities.dp(20.0f) + rect.right, AndroidUtilities.dp(4.0f) + rect.bottom), this.maxWidth, pageblockblockquote, spannableStringBuilder);
                richTextBlockQuote.quoteAuthorStart = i12;
                richTextBlockQuote.setContentPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                richQuoteBlock = richTextBlockQuote;
            } else {
                richQuoteBlock = new RichQuoteBlock(this, new Rect(AndroidUtilities.dp(12.0f) + rect.left, AndroidUtilities.dp(12.0f) + rect.top, AndroidUtilities.dp(12.0f) + rect.right, AndroidUtilities.dp(14.0f) + rect.bottom), this.maxWidth, text, text2);
            }
            richQuoteBlock.accessibilityLabelResId = R.string.ArticleQuote;
            this.blocks.add(richQuoteBlock);
            this.quotes.add(new QuoteBackground(size3, this.blocks.size() - 1, i26, i10, AndroidUtilities.dp(8.0f), pageblockblockquote.collapsed ? AndroidUtilities.dp(8.0f) : 0));
            return richQuoteBlock;
        }
        int i27 = 9;
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            int i28 = rect.left;
            int i29 = i10 + 1;
            int size4 = this.blocks.size();
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            TL_iv.RichText richText2 = pageblockblockquoteblocks.caption;
            boolean z13 = (richText2 == null || TextUtils.isEmpty(getString(richText2))) ? false : true;
            int i30 = 0;
            while (i30 < pageblockblockquoteblocks.blocks.size()) {
                emitBlock(pageblockblockquoteblocks.blocks.get(i30), i29, new Rect(AndroidUtilities.dp(12.0f) + rect.left, rect.top + (i30 == 0 ? AndroidUtilities.dp(4.0f) : 0), AndroidUtilities.dp(12.0f) + rect.right, rect.bottom + ((!(i30 == pageblockblockquoteblocks.blocks.size() + (-1)) || z13) ? 0 : AndroidUtilities.dp(4.0f))), setBlockFlags(i25, i27), previousBlockIsParagraph(pageblockblockquoteblocks.blocks, i30));
                i30++;
                size4 = size4;
                i27 = 9;
            }
            int i31 = size4;
            if (this.blocks.size() > i31) {
                this.blocks.get(i31).accessibilityParentLabelResId = R.string.ArticleQuote;
            }
            if (z13) {
                RichTextBlock richTextBlock4 = new RichTextBlock(this, new Rect(AndroidUtilities.dp(12.0f) + rect.left, rect.top, AndroidUtilities.dp(12.0f) + rect.right, AndroidUtilities.dp(6.0f) + rect.bottom), this.maxWidth, new SpannableStringBuilder(formatText(pageblockblockquoteblocks.caption, setBlockFlags(i25, 11))));
                richTextBlock4.quoteAuthorStart = 0;
                richTextBlock4.setContentPadding(AndroidUtilities.dp(2.0f), 0);
                this.blocks.add(richTextBlock4);
            }
            this.quotes.add(new QuoteBackground(i31, this.blocks.size() - 1, i28, i10));
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            CharSequence text3 = formatText(pageBlock.text, setBlockFlags(i25, getBlockTextFlag(pageBlock)));
            TL_iv.RichText richText3 = pageblockpullquote.caption;
            RichPullquoteBlock richPullquoteBlock = new RichPullquoteBlock(this, new Rect(AndroidUtilities.dp(30.0f) + rect.left, AndroidUtilities.dp(16.0f) + rect.top, AndroidUtilities.dp(30.0f) + rect.right, AndroidUtilities.dp(16.0f) + rect.bottom), this.maxWidth, text3, (richText3 == null || TextUtils.isEmpty(getString(richText3))) ? null : formatText(pageblockpullquote.caption, setBlockFlags(i25, 11)));
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
            emitCaption(pageblockphoto.caption, rect, i25);
            return richPhotoBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            RichVideoBlock richVideoBlock = new RichVideoBlock(this, rect, this.maxWidth, pageblockvideo, this.blocks.isEmpty());
            this.blocks.add(richVideoBlock);
            emitCaption(pageblockvideo.caption, rect, i25);
            return richVideoBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            RichCollageBlock richCollageBlock = new RichCollageBlock(this, rect, this.maxWidth, pageblockcollage, this.blocks.isEmpty());
            this.blocks.add(richCollageBlock);
            emitCaption(pageblockcollage.caption, rect, i25);
            return richCollageBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            RichSlideshowBlock richSlideshowBlock = new RichSlideshowBlock(this, rect, this.maxWidth, pageblockslideshow, this.blocks.isEmpty());
            this.blocks.add(richSlideshowBlock);
            emitCaption(pageblockslideshow.caption, rect, i25);
            return richSlideshowBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            RichMapBlock richMapBlock = new RichMapBlock(this, rect, this.maxWidth, pageblockmap);
            this.blocks.add(richMapBlock);
            emitCaption(pageblockmap.caption, rect, i25);
            return richMapBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
            if (this.audioBlocks.get(pageblockaudio) == null && (document = getDocument(pageblockaudio.audio_id)) != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                int i32 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                pageblockaudio.mid = i32;
                tL_message.f22401id = i32;
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
            emitCaption(pageblockaudio.caption, rect, i25);
            return richAudioBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TL_iv.pageBlockDocument pageblockdocument = (TL_iv.pageBlockDocument) pageBlock;
            RichDocumentBlock richDocumentBlock = new RichDocumentBlock(this, rect, this.maxWidth, pageblockdocument);
            this.blocks.add(richDocumentBlock);
            emitCaption(pageblockdocument.caption, rect, i25);
            return richDocumentBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return emitBlock(((TL_iv.pageBlockCover) pageBlock).cover, i10, rect, i25, false);
        }
        if (pageBlock instanceof TL_iv.pageBlockAnchor) {
            String str = ((TL_iv.pageBlockAnchor) pageBlock).name;
            if (str != null) {
                this.anchors.put(str.toLowerCase(), Integer.valueOf(this.blocks.size()));
            }
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
            int iDp3 = h7.a8.a(i25, 9) ? AndroidUtilities.dp(6.0f) : i10 > 0 ? AndroidUtilities.dp(4.0f) : 0;
            RichUnsupportedBlock richUnsupportedBlock = new RichUnsupportedBlock(this, new Rect((rect.left + iDp3) - AndroidUtilities.dp(7.0f), Math.max(AndroidUtilities.dp(14.0f), rect.top), (rect.right + iDp3) - AndroidUtilities.dp(7.0f), Math.max(AndroidUtilities.dp(14.0f), rect.bottom)), this.maxWidth, this.blocks.size(), i10);
            this.unsupportedBlocks.add(richUnsupportedBlock);
            if (i10 == 0) {
                this.unsupportedBlocksRoot.add(richUnsupportedBlock);
            }
            this.blocks.add(richUnsupportedBlock);
            return richUnsupportedBlock;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                return null;
            }
            RichTextBlock richTextBlock5 = new RichTextBlock(this, rect, this.maxWidth, "unsupported block " + pageBlock);
            this.blocks.add(richTextBlock5);
            return richTextBlock5;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
        RichDetailsBlock richDetailsBlock = new RichDetailsBlock(this, rect, this.maxWidth, pageblockdetails, formatText(pageblockdetails.title, i25 & (-17)));
        this.blocks.add(richDetailsBlock);
        int i33 = 0;
        while (i33 < pageblockdetails.blocks.size()) {
            int i34 = i25;
            emitBlock(pageblockdetails.blocks.get(i33), i10 + 1, rect, i34, previousBlockIsParagraph(pageblockdetails.blocks, i33));
            i33++;
            i25 = i34;
        }
        this.blocks.add(new RichDetailsEndBlock(this, new Rect(rect.left, 0, rect.right, 0), this.maxWidth));
        for (int size5 = this.blocks.size(); size5 < this.blocks.size(); size5++) {
            RichBlock richBlock3 = this.blocks.get(size5);
            if (richBlock3.parentDetails == null) {
                richBlock3.parentDetails = richDetailsBlock;
            }
        }
        return richDetailsBlock;
    }

    private void emitCaption(TL_iv.PageCaption pageCaption, Rect rect, int i10) {
        if (pageCaption == null) {
            return;
        }
        TL_iv.RichText richText = pageCaption.text;
        boolean z10 = false;
        boolean z11 = (richText == null || (richText instanceof TL_iv.textEmpty)) ? false : true;
        TL_iv.RichText richText2 = pageCaption.credit;
        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty)) {
            z10 = true;
        }
        if (z11 || z10) {
            int blockFlags = setBlockFlags(i10, 10);
            this.blocks.add(new RichCaptionBlock(this, rect, this.maxWidth, z11 ? formatText(pageCaption.text, blockFlags) : null, z10 ? formatText(pageCaption.credit, blockFlags) : null));
        }
    }

    private <T extends RichBlock> T findPrevBlock(TL_iv.PageBlock pageBlock, Class<T> cls) {
        RichMessageLayout richMessageLayout = this.prev;
        if (richMessageLayout == null) {
            return null;
        }
        ArrayList<RichBlock> arrayList = richMessageLayout.blocks;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            RichBlock richBlock = arrayList.get(i10);
            i10++;
            RichBlock richBlock2 = richBlock;
            if (cls.isInstance(richBlock2) && (richBlock2 instanceof RichPreformattedBlock) && prefixEquals(((RichPreformattedBlock) richBlock2).plain, getString(pageBlock.text))) {
                return cls.cast(richBlock2);
            }
        }
        return null;
    }

    private CharSequence formatTextAndSetSpan(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i10, Object obj) {
        int length = spannableStringBuilder.length();
        formatText(richText, spannableStringBuilder, i10);
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

    private float getBlockBackgroundScale(int i10, int i11) {
        float backgroundScale = 1.0f;
        while (i10 < Math.min(i11 + 1, this.blocks.size())) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock.isVisible()) {
                backgroundScale = richBlock.getBackgroundScale() * backgroundScale;
            }
            i10++;
        }
        return backgroundScale;
    }

    private int getBlockBottom(int i10, org.telegram.ui.Cells.r1 r1Var) {
        int height;
        int i11 = 0;
        if (i10 >= 0 && i10 < this.blocks.size() && r1Var != null && (this.detailsAnimating || this.blockquoteAnimating)) {
            float fMax = Math.max(0.0f, Math.min(1.0f, r1Var.K1));
            RichBlock richBlock = this.blocks.get(i10);
            int iD = i0.a.d(4.0f, richBlock.padding.bottom, 0);
            return Math.round(AndroidUtilities.lerp((richBlock.prevY + richBlock.prevH) - (richBlock.prevVisible ? iD : 0), (richBlock.currY + richBlock.currH) - (richBlock.currVisible ? iD : 0), fMax));
        }
        boolean z10 = false;
        int iA = 0;
        while (i11 < this.blocks.size()) {
            RichBlock richBlock2 = this.blocks.get(i11);
            boolean zIsVisible = richBlock2.isVisible();
            if (zIsVisible && z10) {
                iA += getGap();
            }
            if (zIsVisible) {
                if (r1Var == null || !(this.detailsAnimating || this.blockquoteAnimating)) {
                    height = richBlock2.getHeight();
                } else {
                    height = AndroidUtilities.lerp(richBlock2.prevH, richBlock2.currH, Math.max(0.0f, Math.min(1.0f, r1Var.K1)));
                }
                int i12 = height + iA;
                iA = (i11 != i10 || richBlock2.padding.bottom <= AndroidUtilities.dp(4.0f)) ? i12 : y1.A(4.0f, richBlock2.padding.bottom, i12);
            }
            if (i11 == i10) {
                return iA;
            }
            if (zIsVisible) {
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
        return pageBlock instanceof TL_iv.pageBlockFooter ? 7 : 0;
    }

    private int getBlockTop(int i10, org.telegram.ui.Cells.r1 r1Var) {
        if (i10 >= 0 && i10 < this.blocks.size() && r1Var != null && (this.detailsAnimating || this.blockquoteAnimating)) {
            float fMax = Math.max(0.0f, Math.min(1.0f, r1Var.K1));
            RichBlock richBlock = this.blocks.get(i10);
            return Math.round(AndroidUtilities.lerp(richBlock.prevY, richBlock.currY, fMax));
        }
        boolean z10 = false;
        int height = 0;
        for (int i11 = 0; i11 < this.blocks.size(); i11++) {
            RichBlock richBlock2 = this.blocks.get(i11);
            boolean zIsVisible = richBlock2.isVisible();
            if (zIsVisible && z10) {
                height += getGap();
            }
            if (i11 == i10) {
                return height;
            }
            if (zIsVisible) {
                height = ((r1Var == null || !(this.detailsAnimating || this.blockquoteAnimating)) ? richBlock2.getHeight() : AndroidUtilities.lerp(richBlock2.prevH, richBlock2.currH, Math.max(0.0f, Math.min(1.0f, r1Var.K1)))) + height;
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

    private static xz0 getTextStyleRun(int i10) {
        xz0 xz0Var = new xz0();
        xz0Var.f34734a = i10;
        return xz0Var;
    }

    public int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider);
    }

    public Drawable getThemedDrawable(String str) {
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        Drawable drawable = c6Var != null ? c6Var.getDrawable(str) : null;
        return drawable != null ? drawable : org.telegram.ui.ActionBar.g6.O0(str);
    }

    public boolean handleAnchorClick(String str) {
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
        if (!chat.signature_profiles) {
            return hasCustomPeerColor(chat.color);
        }
        long fromChatId = this.messageObject.getFromChatId();
        if (fromChatId >= 0) {
            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(fromChatId));
            return user3 != null && hasCustomPeerColor(user3.color);
        }
        TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-fromChatId));
        return chat3 != null && hasCustomPeerColor(chat3.color);
    }

    private static boolean hasCustomPeerColor(TLRPC.PeerColor peerColor) {
        return (peerColor instanceof TLRPC.TL_peerColorCollectible) || ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0);
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

    private static void markListItem(RichBlock richBlock, int i10, boolean z10, boolean z11, boolean z12) {
        if (richBlock == null) {
            return;
        }
        richBlock.listLevel = i10;
        richBlock.listOrdered = z10;
        richBlock.listCheckbox = z11;
        richBlock.listChecked = z12;
    }

    private void markListMembership(int i10, int i11, int i12, boolean z10) {
        while (i10 < i11) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock.listLevel == 0) {
                richBlock.listLevel = i12;
                richBlock.listOrdered = z10;
            }
            i10++;
        }
    }

    private static float multiHeight(float[] fArr, int i10, int i11, int i12) {
        float f10 = 0.0f;
        while (i10 < i11) {
            f10 += fArr[i10];
            i10++;
        }
        return i12 / Math.max(1.0E-4f, f10);
    }

    private static String orderedListMarker(TL_iv.pageBlockOrderedList pageblockorderedlist, TL_iv.PageListOrderedItem pageListOrderedItem, int i10) {
        if (!TextUtils.isEmpty(pageListOrderedItem.num)) {
            return pageListOrderedItem.num.endsWith(".") ? pageListOrderedItem.num : a9.p.p(new StringBuilder(), pageListOrderedItem.num, ".");
        }
        if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return a9.p.k(pageListOrderedItem.value, ".", new StringBuilder());
        }
        if (!TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
            return (i10 + 1) + ".";
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = pageblockorderedlist.start;
        if (pageblockorderedlist.reversed) {
            i10 = -i10;
        }
        sb2.append(i11 + i10);
        sb2.append(".");
        return sb2.toString();
    }

    private boolean prefixEquals(String str, String str2) {
        if (str == null || str2 == null || str.length() > str2.length() || str2.length() <= 0) {
            return false;
        }
        return str2.startsWith(str);
    }

    private static boolean previousBlockIsParagraph(List<TL_iv.PageBlock> list, int i10) {
        return i10 > 0 && (list.get(i10 - 1) instanceof TL_iv.pageBlockParagraph);
    }

    private ArrayList<QuoteBackground> quotesFor(int i10) {
        ArrayList<QuoteBackground> arrayList = new ArrayList<>();
        if (i10 >= 0) {
            ArrayList<QuoteBackground> arrayList2 = this.quotes;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                QuoteBackground quoteBackground = arrayList2.get(i11);
                i11++;
                QuoteBackground quoteBackground2 = quoteBackground;
                if (i10 >= quoteBackground2.startBlockIndex && i10 <= quoteBackground2.endBlockIndex) {
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
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != arrayList2.get(i10)) {
                return false;
            }
        }
        return true;
    }

    private boolean scrollToPageBlockAnchor(int i10) {
        RecyclerView recyclerView;
        if (this.cell == null || i10 < 0 || i10 >= this.blocks.size()) {
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
        recyclerView.v0(0, (((this.cell.getTop() + this.cell.f25440n0) + getBlockTop(i10, null)) - recyclerView.getPaddingTop()) - AndroidUtilities.dp(8.0f), null);
        return true;
    }

    public static int setBlockFlags(int i10, int i11) {
        return i11 == 0 ? i10 : (i10 & (-16)) | i11;
    }

    private void setBubblePaddings(int i10, int i11) {
        if (this.padLeft == i10 && this.padRight == i11) {
            return;
        }
        this.padLeft = i10;
        this.padRight = i11;
        for (int i12 = 0; i12 < this.blocks.size(); i12++) {
            RichBlock richBlock = this.blocks.get(i12);
            if (richBlock instanceof RichDetailsBlock) {
                ((RichDetailsBlock) richBlock).updateBubbleInsets();
            }
        }
    }

    private void setSpansWithoutClash(Object obj, final SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        if (!(obj instanceof StyleSpan)) {
            spannableStringBuilder.setSpan(obj, i10, i11, 33);
            return;
        }
        StyleSpan styleSpan = (StyleSpan) obj;
        StyleSpan[] styleSpanArr = (StyleSpan[]) spannableStringBuilder.getSpans(i10, i11, StyleSpan.class);
        if (styleSpanArr == null || styleSpanArr.length <= 0) {
            setStyleRange(spannableStringBuilder, i10, i11, styleSpan.flags);
            return;
        }
        Arrays.sort(styleSpanArr, Comparator$CC.comparingInt(new ToIntFunction() {
            @Override
            public final int applyAsInt(Object obj2) {
                return spannableStringBuilder.getSpanStart((RichMessageLayout.StyleSpan) obj2);
            }
        }));
        for (int i12 = 0; i12 < styleSpanArr.length; i12++) {
            int spanStart = spannableStringBuilder.getSpanStart(styleSpanArr[i12]);
            int spanEnd = spannableStringBuilder.getSpanEnd(styleSpanArr[i12]);
            if (spanStart > i10) {
                setStyleRange(spannableStringBuilder, i10, spanStart, styleSpan.flags);
            }
            i10 = Math.max(i10, spanEnd);
        }
        if (i10 < i11) {
            setStyleRange(spannableStringBuilder, i10, i11, styleSpan.flags);
        }
    }

    private void setStyleRange(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        while (i10 < i11) {
            int iNextSpanTransition = spannableStringBuilder.nextSpanTransition(i10, i11, URLSpan.class);
            spannableStringBuilder.setSpan(new StyleSpan(this, i12, ((URLSpan[]) spannableStringBuilder.getSpans(i10, iNextSpanTransition, URLSpan.class)).length > 0), i10, iNextSpanTransition, 33);
            i10 = iNextSpanTransition;
        }
    }

    private boolean showFootnoteSheet(TL_iv.textAnchor textanchor) {
        Context context;
        TL_iv.RichText richText;
        View view = this.view;
        if (view == null || (context = view.getContext()) == null || (richText = textanchor.text) == null || (richText instanceof TL_iv.textEmpty)) {
            return false;
        }
        String str = textanchor.name;
        CharSequence text = formatText(org.telegram.ui.web.e2.d(textanchor.text, "", str == null ? "" : str.toLowerCase()));
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, this.resourcesProvider, true, false);
        e3Var.fixNavigationBar();
        e3Var.applyTopPadding = false;
        e3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textViewH = y1.h(context, 1, 16.0f);
        textViewH.setTypeface(AndroidUtilities.bold());
        textViewH.setText(LocaleController.getString(R.string.InstantViewReference));
        textViewH.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        textViewH.setTextColor(getThemedColor(i10));
        textViewH.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        linearLayout.addView(textViewH, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f)));
        p80 p80Var = new p80(context, this.resourcesProvider);
        p80Var.setTextSize(1, SharedConfig.fontSize);
        p80Var.setTextColor(getThemedColor(i10));
        p80Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23180k5));
        p80Var.setMovementMethod(LinkMovementMethod.getInstance());
        p80Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(16.0f));
        p80Var.setText(text);
        linearLayout.addView(p80Var, new LinearLayout.LayoutParams(-1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout, h7.z5.c(-2.0f, -1));
        e3Var.customView = frameLayout;
        e3Var.show();
        return true;
    }

    private void syncLists(StringBuilder sb2, ArrayList<Boolean> arrayList, int i10, boolean z10) {
        while (true) {
            String str = "</ul>";
            if (arrayList.size() <= i10) {
                break;
            }
            if (((Boolean) com.google.android.recaptcha.internal.a.k(1, arrayList)).booleanValue()) {
                str = "</ol>";
            }
            sb2.append(str);
        }
        while (true) {
            String str2 = "<ul>";
            if (arrayList.size() >= i10) {
                break;
            }
            if (z10) {
                str2 = "<ol>";
            }
            sb2.append(str2);
            arrayList.add(Boolean.valueOf(z10));
        }
        if (arrayList.isEmpty() || ((Boolean) i0.a.i(1, arrayList)).booleanValue() == z10) {
            return;
        }
        sb2.append(((Boolean) com.google.android.recaptcha.internal.a.k(1, arrayList)).booleanValue() ? "</ol>" : "</ul>");
        sb2.append(z10 ? "<ol>" : "<ul>");
        arrayList.add(Boolean.valueOf(z10));
    }

    private void syncQuotes(StringBuilder sb2, ArrayList<QuoteBackground> arrayList, ArrayList<QuoteBackground> arrayList2) {
        int i10 = 0;
        while (i10 < arrayList.size() && i10 < arrayList2.size() && arrayList.get(i10) == arrayList2.get(i10)) {
            i10++;
        }
        while (arrayList.size() > i10) {
            sb2.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        while (arrayList.size() < arrayList2.size()) {
            sb2.append("<blockquote>");
            arrayList.add(arrayList2.get(arrayList.size()));
        }
    }

    private SpannableStringBuilder toRichHtmlSpannable(CharSequence charSequence) {
        int textStyleFlags;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (StyleSpan styleSpan : (StyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(styleSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(styleSpan);
            if (spanEnd > spanStart && (textStyleFlags = toTextStyleFlags(styleSpan.flags)) != 0) {
                xz0 xz0Var = new xz0();
                xz0Var.f34734a = textStyleFlags;
                spannableStringBuilder.setSpan(new yz0(xz0Var, 0), spanStart, spanEnd, 33);
            }
        }
        return spannableStringBuilder;
    }

    private static int toTextStyleFlags(int i10) {
        int i11 = (i10 & 16) != 0 ? 1 : 0;
        if ((i10 & 32) != 0) {
            i11 |= 2;
        }
        if ((i10 & 64) != 0) {
            i11 |= 16;
        }
        if ((i10 & 128) != 0) {
            i11 |= 8;
        }
        if ((i10 & 256) != 0) {
            i11 |= 4;
        }
        if ((i10 & 2048) != 0) {
            i11 |= 16384;
        }
        if ((i10 & 4096) != 0) {
            i11 |= 32768;
        }
        return (i10 & 8192) != 0 ? 65536 | i11 : i11;
    }

    private void updateTranslationLoading() {
        View view;
        boolean zIsTranslating = isTranslating();
        if (!zIsTranslating && this.translationLoadingFloat == null) {
            this.translationLoadingValue = 0.0f;
            return;
        }
        if (this.translationLoadingFloat == null) {
            this.translationLoadingFloat = new org.telegram.ui.Components.y5(0L, 350L, er.h);
        }
        float fD = this.translationLoadingFloat.d(zIsTranslating ? 1.0f : 0.0f, false);
        this.translationLoadingValue = fD;
        if (fD <= 0.0f || (view = this.view) == null) {
            return;
        }
        view.invalidate();
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
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            this.blocks.get(i10).attach(view);
        }
    }

    public void checkQuoteLine(TLRPC.User user, TLRPC.Chat chat) {
        this.quoteLine.a(this.messageObject, user, chat, this.resourcesProvider, 1);
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || messageObject.isOutOwner() || this.messageObject.shouldDrawWithoutBackground() || hasCustomIncomingQuoteColor(user, chat)) {
            return;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        this.quoteLine.q(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider), c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q());
    }

    public void collectMediaBlocks(List<TL_iv.PageBlock> list) {
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock instanceof RichPhotoBlock) {
                list.add(((RichPhotoBlock) richBlock).block);
            } else if (richBlock instanceof RichVideoBlock) {
                list.add(((RichVideoBlock) richBlock).block);
            } else if (richBlock instanceof RichCollageBlock) {
                ArrayList<MediaCell> arrayList = ((RichCollageBlock) richBlock).cells;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    MediaCell mediaCell = arrayList.get(i11);
                    i11++;
                    list.add(mediaCell.pageBlock);
                }
            } else if (richBlock instanceof RichSlideshowBlock) {
                ArrayList<MediaCell> arrayList2 = ((RichSlideshowBlock) richBlock).cells;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    MediaCell mediaCell2 = arrayList2.get(i12);
                    i12++;
                    list.add(mediaCell2.pageBlock);
                }
            }
        }
    }

    public void detach(View view) {
        View view2 = this.view;
        if (view2 == view && view2 != null) {
            eh.j jVar = this.spoilerEffect2;
            if (jVar != null) {
                jVar.b(view);
                this.spoilerEffect2 = null;
            }
            this.view = null;
            for (int i10 = 0; i10 < this.blocks.size(); i10++) {
                this.blocks.get(i10).detach(view);
            }
            if (view == this.cell) {
                this.cell = null;
                this.delegate = null;
            }
        }
    }

    public void draw(Canvas canvas, int i10, int i11, org.telegram.ui.Cells.r1 r1Var) {
        Canvas canvas2;
        setBubblePaddings(i10, i11);
        this.textPaint.linkColor = getThemedColor(isOut() ? org.telegram.ui.ActionBar.g6.f23131hc : org.telegram.ui.ActionBar.g6.gc);
        boolean z10 = this.isPart;
        int iMin = Math.min(this.height, AndroidUtilities.dp(900.0f));
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(-i10, 0.0f, getMinWidth() + i11, iMin, 255, 31);
        } else {
            canvas2 = canvas;
        }
        drawInternal(canvas2, r1Var);
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(-i10, iMin - AndroidUtilities.dp(32.0f), getMinWidth() + i11, iMin);
            this.clip.b(canvas2, rectF, 3, 1.0f);
            canvas2.restore();
            drawShowMoreButton(canvas2, iMin);
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
        int height = 0;
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock.isVisible()) {
                if (z10) {
                    height += getGap();
                }
                if (richBlock.findLink(characterStyle, height, foundLink)) {
                    return foundLink;
                }
                height = richBlock.getHeight() + height;
                z10 = true;
            }
        }
        return null;
    }

    public ImageReceiver findMediaImageReceiver(TL_iv.PageBlock pageBlock, int[] iArr) {
        ImageReceiver imageReceiver;
        TL_iv.PageBlock pageBlock2;
        ImageReceiver imageReceiver2;
        int i10 = 0;
        while (true) {
            TL_iv.PageBlock pageBlock3 = null;
            if (i10 >= this.blocks.size()) {
                return null;
            }
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock instanceof RichPhotoBlock) {
                RichPhotoBlock richPhotoBlock = (RichPhotoBlock) richBlock;
                pageBlock2 = richPhotoBlock.block;
                imageReceiver2 = richPhotoBlock.imageReceiver;
            } else {
                if (richBlock instanceof RichVideoBlock) {
                    RichVideoBlock richVideoBlock = (RichVideoBlock) richBlock;
                    pageBlock2 = richVideoBlock.block;
                    imageReceiver2 = richVideoBlock.imageReceiver;
                } else if (richBlock instanceof RichCollageBlock) {
                    ArrayList<MediaCell> arrayList = ((RichCollageBlock) richBlock).cells;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        MediaCell mediaCell = arrayList.get(i11);
                        i11++;
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
                i10++;
            }
            TL_iv.PageBlock pageBlock4 = pageBlock2;
            imageReceiver = imageReceiver2;
            pageBlock3 = pageBlock4;
            if (pageBlock3 == pageBlock) {
                continue;
            }
            i10++;
        }
    }

    public boolean forceNewLineForTime() {
        if (this.blocks.isEmpty() || this.isPart || isRtl()) {
            return true;
        }
        if (!this.quotes.isEmpty()) {
            ArrayList<QuoteBackground> arrayList = this.quotes;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                QuoteBackground quoteBackground = arrayList.get(i10);
                i10++;
                if (quoteBackground.endBlockIndex >= this.blocks.size() - 1) {
                    return true;
                }
            }
        }
        return ((RichBlock) i0.a.i(1, this.blocks)).forcesTimeToNewLine();
    }

    public CharSequence formatText(TL_iv.RichText richText) {
        return formatText(richText, new SpannableStringBuilder(), 0);
    }

    public List<ej0> getAnimatorBlocks() {
        ArrayList arrayList = new ArrayList(this.blocks.size());
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            this.blocks.get(i10).collectAnimatorBlocks(arrayList);
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ej0) arrayList.get(i11)).getClass();
        }
        return arrayList;
    }

    public org.telegram.ui.Cells.s1 getCell() {
        return this.cell;
    }

    public org.telegram.ui.Cells.j1 getDelegate() {
        return this.delegate;
    }

    public TLRPC.Document getDocument(long j10) {
        TL_iv.RichMessage richMessage = this.richMessage;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Document> arrayList = richMessage.documents;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Document document = arrayList.get(i10);
            i10++;
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
            ArrayList<QuoteBackground> arrayList = this.quotes;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                QuoteBackground quoteBackground = arrayList.get(i10);
                i10++;
                if (quoteBackground.endBlockIndex >= this.blocks.size() - 1) {
                    return getMinWidth();
                }
            }
        }
        RichBlock richBlock = (RichBlock) i0.a.i(1, this.blocks);
        return richBlock.forcesTimeToNewLine() ? getMinWidth() : richBlock.getLastLineWidth();
    }

    public eh.j getMediaSpoilerEffect() {
        View view = this.view;
        if (view == null) {
            return null;
        }
        eh.j jVar = this.spoilerEffect2;
        if (jVar != null && jVar.f5506i) {
            this.spoilerEffect2 = null;
        }
        if (this.spoilerEffect2 == null) {
            this.spoilerEffect2 = eh.j.e(view);
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
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Photo photo = arrayList.get(i10);
            i10++;
            TLRPC.Photo photo2 = photo;
            if (photo2.f22404id == j10) {
                return photo2;
            }
        }
        return null;
    }

    public String getSelectionHtml(int i10, int i11) {
        int iMin;
        int iMax;
        RichMessageLayout richMessageLayout = this;
        if (richMessageLayout.textBlocks.isEmpty() || (iMax = Math.max(i10, i11)) <= (iMin = Math.min(i10, i11))) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList<QuoteBackground> arrayList = new ArrayList<>();
        ArrayList<Boolean> arrayList2 = new ArrayList<>();
        int i12 = 0;
        int i13 = -1;
        while (i12 < richMessageLayout.textBlocks.size()) {
            Layout layout = richMessageLayout.textBlocks.get(i12).getLayout();
            if (layout != null && layout.getText() != null) {
                CharSequence text = layout.getText();
                int iIntValue = i12 < richMessageLayout.textBlockCharOffsets.size() ? richMessageLayout.textBlockCharOffsets.get(i12).intValue() : 0;
                int length = text.length() + iIntValue;
                int iMax2 = Math.max(iMin, iIntValue);
                int iMin2 = Math.min(iMax, length);
                if (iMin2 > iMax2) {
                    int iIntValue2 = i12 < richMessageLayout.textBlockBlockIndex.size() ? richMessageLayout.textBlockBlockIndex.get(i12).intValue() : -1;
                    RichBlock richBlock = (iIntValue2 < 0 || iIntValue2 >= richMessageLayout.blocks.size()) ? null : richMessageLayout.blocks.get(iIntValue2);
                    String strP = "";
                    if (!(richBlock instanceof RichTableBlock)) {
                        ArrayList<QuoteBackground> arrayListQuotesFor = richMessageLayout.quotesFor(iIntValue2);
                        if (!sameQuotes(arrayList, arrayListQuotesFor)) {
                            richMessageLayout.closeLists(sb2, arrayList2);
                            richMessageLayout.syncQuotes(sb2, arrayList, arrayListQuotesFor);
                        }
                        int i14 = iMax2 - iIntValue;
                        int i15 = iMin2 - iIntValue;
                        int i16 = richBlock instanceof RichTextBlock ? ((RichTextBlock) richBlock).quoteAuthorStart : -1;
                        boolean z10 = (richBlock instanceof RichTextWithAuthorBlock) && ((RichTextWithAuthorBlock) richBlock).author == richMessageLayout.textBlocks.get(i12);
                        int i17 = richBlock != null ? richBlock.listLevel : 0;
                        if (i17 <= 0 || i16 >= 0) {
                            richMessageLayout.closeLists(sb2, arrayList2);
                            if (richBlock instanceof RichPreformattedBlock) {
                                SpannableStringBuilder richHtmlSpannable = richMessageLayout.toRichHtmlSpannable(text.subSequence(i14, i15));
                                String str = ((RichPreformattedBlock) richBlock).language;
                                StringBuilder sb3 = new StringBuilder();
                                rh.v3.g(sb3, richHtmlSpannable);
                                String string = sb3.toString();
                                if (!string.isEmpty()) {
                                    StringBuilder sb4 = new StringBuilder();
                                    if (TextUtils.isEmpty(str)) {
                                        sb4.append("<pre>");
                                    } else {
                                        sb4.append("<pre language=\"");
                                        sb4.append(rh.v3.s(str));
                                        sb4.append("\">");
                                    }
                                    strP = a9.p.p(sb4, string, "</pre>");
                                }
                                sb2.append(strP);
                            } else if (z10) {
                                richMessageLayout.appendSelectionPiece(sb2, text, i14, i15, true);
                                richMessageLayout = this;
                            } else if (i16 < 0) {
                                richMessageLayout = this;
                                richMessageLayout.appendSelectionPiece(sb2, text, i14, i15, false);
                            } else {
                                richMessageLayout = this;
                                richMessageLayout.appendSelectionPiece(sb2, text, i14, Math.min(i15, i16 > 0 ? i16 - 1 : 0), false);
                                richMessageLayout.appendSelectionPiece(sb2, text, Math.max(i14, i16), i15, true);
                            }
                        } else {
                            richMessageLayout.syncLists(sb2, arrayList2, i17, richBlock.listOrdered);
                            sb2.append("<li");
                            if (richBlock.listCheckbox) {
                                sb2.append(" data-checkbox=\"1\"");
                                if (richBlock.listChecked) {
                                    sb2.append(" data-checked=\"1\"");
                                }
                            }
                            sb2.append('>');
                            SpannableStringBuilder richHtmlSpannable2 = richMessageLayout.toRichHtmlSpannable(text.subSequence(i14, i15));
                            StringBuilder sb5 = new StringBuilder();
                            rh.v3.g(sb5, richHtmlSpannable2);
                            sb2.append(sb5.toString());
                            sb2.append("</li>");
                        }
                    } else if (iIntValue2 != i13) {
                        richMessageLayout.closeLists(sb2, arrayList2);
                        richMessageLayout.syncQuotes(sb2, arrayList, richMessageLayout.quotesFor(iIntValue2));
                        TL_iv.pageBlockTable pageblocktable = ((RichTableBlock) richBlock).pageBlock;
                        if (pageblocktable != null) {
                            StringBuilder sb6 = new StringBuilder();
                            rh.v3.H(sb6, pageblocktable);
                            strP = sb6.toString();
                        }
                        sb2.append(strP);
                        i13 = iIntValue2;
                    }
                }
            }
            i12++;
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
        org.telegram.ui.Cells.s1 s1Var = this.cell;
        return s1Var != null && s1Var.Hc > 0;
    }

    public boolean hasOverlay() {
        org.telegram.ui.Components.p5 p5Var;
        if (!isOverlayActive()) {
            return false;
        }
        for (int i10 = 0; i10 < this.textBlocks.size(); i10++) {
            org.telegram.ui.Cells.u9 u9Var = this.textBlocks.get(i10);
            if ((u9Var instanceof Text) && (p5Var = ((Text) u9Var).animatedEmojiStack) != null && !p5Var.f31503a.isEmpty()) {
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
        return this.view != null;
    }

    public boolean isHorizontallyDragging() {
        RichBlock richBlock = this.pressedBlock;
        return richBlock != null && richBlock.isHorizontallyDragging();
    }

    public boolean isOut() {
        MessageObject messageObject = this.messageObject;
        return messageObject != null && messageObject.isOutOwner();
    }

    public boolean isOverlayActive() {
        gj0 gj0Var = this.typingAnimator;
        return gj0Var == null || !gj0Var.h;
    }

    public boolean isPinnedTop() {
        org.telegram.ui.Cells.s1 s1Var = this.cell;
        return s1Var != null && s1Var.m3();
    }

    public boolean isPressingLink() {
        RichBlock richBlock = this.pressedBlock;
        return richBlock != null && richBlock.isPressingLink();
    }

    public boolean isRtl() {
        TL_iv.RichMessage richMessage = this.richMessage;
        return richMessage != null && richMessage.rtl;
    }

    public boolean isTranslating() {
        if (this.forceTranslationLoading) {
            return true;
        }
        return this.messageObject != null && MessagesController.getInstance(this.currentAccount).getTranslateController().isTranslating(this.messageObject);
    }

    public void layout(RichMessageLayout richMessageLayout) {
        boolean z10;
        this.height = 0;
        this.minWidth = 0;
        View view = this.view;
        if (view != null) {
            for (int i10 = 0; i10 < this.blocks.size(); i10++) {
                this.blocks.get(i10).detach(view);
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
        if (messageObject == null || messageObject.messageOwner == null || messageObject.getDisplayRichMessage() == null) {
            return;
        }
        TL_iv.RichMessage displayRichMessage = this.messageObject.getDisplayRichMessage();
        this.richMessage = displayRichMessage;
        this.isPart = displayRichMessage.part;
        this.prev = richMessageLayout;
        int i11 = 0;
        while (i11 < this.richMessage.blocks.size()) {
            TL_iv.PageBlock pageBlock = this.richMessage.blocks.get(i11);
            RichBlock richBlockEmitBlock = emitBlock(pageBlock, 0, new Rect(), 0, previousBlockIsParagraph(this.richMessage.blocks, i11));
            if ((richBlockEmitBlock instanceof RichTextBlock) && (((z10 = pageBlock instanceof TL_iv.pageBlockParagraph)) || org.telegram.ui.m4.K(pageBlock))) {
                RichTextBlock richTextBlock = (RichTextBlock) richBlockEmitBlock;
                richTextBlock.setContentPadding((i11 == 0 && z10) ? 0 : richTextBlock.contentPaddingTop, i11 == this.richMessage.blocks.size() + (-1) ? 0 : richTextBlock.contentPaddingBottom);
            }
            i11++;
        }
        applyListPaddingFromBlocks();
        this.prev = null;
        if (this.typingAnimator != null) {
            for (int i12 = 0; i12 < this.blocks.size(); i12++) {
                this.blocks.get(i12).typingAnimator = this.typingAnimator;
            }
            this.typingAnimator.l(getAnimatorBlocks());
        }
        if (view != null) {
            for (int i13 = 0; i13 < this.blocks.size(); i13++) {
                this.blocks.get(i13).attach(view);
            }
        }
        reposition();
        snapshotForDetailsAnimation();
    }

    public boolean needsUpdate(TL_iv.RichMessage richMessage, int i10) {
        return (this.richMessage == richMessage && this.fontSize == SharedConfig.fontSize && Math.abs(this.density - AndroidUtilities.density) <= 0.1f && i10 == this.maxWidth) ? false : true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 || (motionEvent.getX() >= this.padLeft && motionEvent.getX() <= getMinWidth() + this.padRight)) {
            if (this.isPart) {
                float x8 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (actionMasked == 0) {
                    if (this.showMoreRect.contains(x8, y10)) {
                        this.showMorePressed = true;
                        org.telegram.ui.Components.nc ncVar = this.showMoreBounce;
                        if (ncVar != null) {
                            ncVar.c(true);
                            return true;
                        }
                        return true;
                    }
                } else if (this.showMorePressed) {
                    if (actionMasked == 2) {
                        if (!this.showMoreRect.contains(x8, y10)) {
                            org.telegram.ui.Components.nc ncVar2 = this.showMoreBounce;
                            if (ncVar2 != null) {
                                ncVar2.c(false);
                            }
                            this.showMorePressed = false;
                            return true;
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        org.telegram.ui.Components.nc ncVar3 = this.showMoreBounce;
                        if (ncVar3 != null) {
                            ncVar3.c(false);
                        }
                        boolean z10 = actionMasked == 1 && this.showMoreRect.contains(x8, y10);
                        this.showMorePressed = false;
                        if (z10 && this.delegate != null && this.cell != null) {
                            View view = this.view;
                            if (view != null) {
                                view.performHapticFeedback(3, 2);
                            }
                            this.delegate.H0(this.cell);
                        }
                    }
                    return true;
                }
            }
            if (actionMasked == 0) {
                this.pressedBlock = null;
                float y11 = motionEvent.getY();
                boolean z11 = false;
                int gap = 0;
                for (int i10 = 0; i10 < this.blocks.size(); i10++) {
                    RichBlock richBlock = this.blocks.get(i10);
                    if (richBlock.isVisible()) {
                        if (z11) {
                            gap += getGap();
                        }
                        int height = richBlock.getHeight();
                        float f10 = gap;
                        if (y11 >= f10 && y11 < gap + height) {
                            motionEvent.offsetLocation(0.0f, -gap);
                            boolean z12 = richBlock.touchEvent(motionEvent);
                            motionEvent.offsetLocation(0.0f, f10);
                            if (!z12) {
                                break;
                            }
                            this.pressedBlock = richBlock;
                            this.pressedBlockY = gap;
                            return true;
                        }
                        gap += height;
                        z11 = true;
                    }
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
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            this.minWidth = Math.max(this.minWidth, this.blocks.get(i10).getMinWidth());
        }
        for (int i11 = 0; i11 < this.blocks.size(); i11++) {
            RichBlock richBlock = this.blocks.get(i11);
            if (richBlock instanceof RichTableBlock) {
                ((RichTableBlock) richBlock).resolveWidth(this.minWidth);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int gap = 0;
        boolean z10 = false;
        for (int i12 = 0; i12 < this.blocks.size(); i12++) {
            RichBlock richBlock2 = this.blocks.get(i12);
            boolean zIsVisible = richBlock2.isVisible();
            if (zIsVisible && z10) {
                gap += getGap();
            }
            richBlock2.currY = gap;
            richBlock2.currH = 0;
            richBlock2.currVisible = zIsVisible;
            Rect rect = richBlock2.padding;
            richBlock2.placeTexts(rect.left, rect.top + gap, i12);
            if (zIsVisible) {
                org.telegram.ui.Cells.u9[] text = richBlock2.getText();
                if (text != null) {
                    for (org.telegram.ui.Cells.u9 u9Var : text) {
                        if (u9Var != null && u9Var.getLayout() != null) {
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            this.textBlockCharOffsets.add(Integer.valueOf(sb2.length()));
                            this.textBlockBlockIndex.add(Integer.valueOf(i12));
                            this.textBlocks.add(u9Var);
                            CharSequence text2 = u9Var.getLayout().getText();
                            if (text2 != null) {
                                sb2.append(text2);
                            }
                        }
                    }
                }
                int height = richBlock2.getHeight();
                richBlock2.currH = height;
                gap += height;
                z10 = true;
            }
        }
        this.height = gap;
        this.joinedText = sb2;
    }

    public void setChatMessageCellDelegate(org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Cells.j1 j1Var) {
        this.cell = s1Var;
        this.delegate = j1Var;
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.resourcesProvider = c6Var;
    }

    public boolean setSlideshowPage(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock instanceof RichSlideshowBlock) {
                RichSlideshowBlock richSlideshowBlock = (RichSlideshowBlock) richBlock;
                for (int i11 = 0; i11 < richSlideshowBlock.cells.size(); i11++) {
                    if (richSlideshowBlock.cells.get(i11).pageBlock == pageBlock) {
                        richSlideshowBlock.setCurrentPage(i11);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void setTypingAnimator(gj0 gj0Var) {
        this.typingAnimator = gj0Var;
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            this.blocks.get(i10).typingAnimator = gj0Var;
            this.blocks.get(i10);
            this.blocks.get(i10).getClass();
        }
    }

    public void snapshotForBlockquoteAnimation() {
        snapshotForDetailsAnimation();
    }

    public void snapshotForDetailsAnimation() {
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            this.blocks.get(i10).snapshot();
        }
    }

    public boolean startsWithMedia() {
        if (this.blocks.isEmpty()) {
            return false;
        }
        RichBlock richBlock = this.blocks.get(0);
        return (richBlock instanceof RichPhotoBlock) || (richBlock instanceof RichVideoBlock) || (richBlock instanceof RichCollageBlock) || (richBlock instanceof RichSlideshowBlock);
    }

    public void updateAnimatedEmojis(int i10) {
        for (int i11 = 0; i11 < this.textBlocks.size(); i11++) {
            org.telegram.ui.Cells.u9 u9Var = this.textBlocks.get(i11);
            if (u9Var instanceof Text) {
                ((Text) u9Var).refreshAnimatedEmoji(i10);
            }
        }
    }

    public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
        if (!isOverlayActive()) {
            return false;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
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

    public CharSequence formatText(TL_iv.RichText richText, int i10) {
        return i10 == 0 ? formatText(richText, new SpannableStringBuilder(), 0) : formatTextAndSetSpan(richText, new SpannableStringBuilder(), i10, new StyleSpan(this, i10));
    }

    public static class RichUnsupportedBlock extends RichBlock implements Drawable.Callback {
        public final int index;
        public final int level;
        public Bitmap tornBitmap;
        public e21 tornParams;
        public final n51 unsupportedBlockDrawable;
        public final int unsupportedBlockHeight;
        public final int unsupportedBlockWidth;

        public RichUnsupportedBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, int i11, int i12) {
            super(richMessageLayout, rect, i10);
            this.index = i11;
            this.level = i12;
            org.telegram.ui.ActionBar.c6 c6Var = richMessageLayout.resourcesProvider;
            n51 n51Var = new n51();
            this.unsupportedBlockDrawable = n51Var;
            n51Var.setCallback(this);
            n51Var.f30877n = LocaleController.getString(R.string.UnsupportedBlockTitle);
            n51Var.f30878o = LocaleController.getString(R.string.UnsupportedBlockMessage);
            n51Var.f30879p = LocaleController.getString(R.string.UnsupportedUpdate);
            n51Var.f30873j = new rg(richMessageLayout, 9);
            int i13 = this.maxWidth;
            this.unsupportedBlockWidth = i13;
            this.unsupportedBlockHeight = n51Var.a(i13);
        }

        public static void lambda$new$0(RichMessageLayout richMessageLayout) {
            if (richMessageLayout.delegate != null) {
                richMessageLayout.delegate.k();
            }
        }

        @Override
        public void draw(Canvas canvas) {
            n51 n51Var = this.unsupportedBlockDrawable;
            Rect rect = this.padding;
            int i10 = rect.left;
            int i11 = rect.top;
            n51Var.setBounds(i10, i11, this.unsupportedBlockWidth + i10, this.unsupportedBlockHeight + i11);
            this.unsupportedBlockDrawable.draw(canvas);
        }

        public float getHeight(org.telegram.ui.Cells.r1 r1Var) {
            int iLerp;
            if (r1Var != null) {
                RichMessageLayout richMessageLayout = this.root;
                if (richMessageLayout.detailsAnimating || richMessageLayout.blockquoteAnimating) {
                    iLerp = AndroidUtilities.lerp(this.prevH, this.currH, Math.max(0.0f, Math.min(1.0f, r1Var.K1)));
                } else {
                    iLerp = this.currH;
                }
            } else {
                iLerp = this.currH;
            }
            return iLerp;
        }

        public float getY(org.telegram.ui.Cells.r1 r1Var) {
            if (r1Var != null) {
                RichMessageLayout richMessageLayout = this.root;
                if (richMessageLayout.detailsAnimating || richMessageLayout.blockquoteAnimating) {
                    return AndroidUtilities.lerp(this.prevY, this.currY, Math.max(0.0f, Math.min(1.0f, r1Var.K1)));
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
            return view != null ? this.unsupportedBlockDrawable.f30872i.a(motionEvent, view) : super.onTouchEvent(motionEvent);
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
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            if (!rh.v5.j(textdiff.text)) {
                getString(textdiff.text, sb2);
                return;
            } else {
                if (rh.v5.j(textdiff.old_text)) {
                    return;
                }
                getString(textdiff.old_text, sb2);
                return;
            }
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i10 = 0; i10 < richText.texts.size(); i10++) {
                getString(richText.texts.get(i10), sb2);
            }
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            getString(richText2, sb2);
        }
    }

    public CharSequence formatText(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i10) {
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
            boolean zJ = rh.v5.j(textdiff.text);
            boolean zJ2 = rh.v5.j(textdiff.old_text);
            if (zJ && !zJ2) {
                formatTextAndSetSpan(textdiff.old_text, spannableStringBuilder, i10, new yz0(getTextStyleRun(8192), 0));
                return spannableStringBuilder;
            }
            if (!zJ && zJ2) {
                formatTextAndSetSpan(textdiff.text, spannableStringBuilder, i10, new yz0(getTextStyleRun(4096), 0));
                return spannableStringBuilder;
            }
            if (!zJ) {
                formatTextAndSetSpan(textdiff.text, spannableStringBuilder, i10, new lv0());
                return spannableStringBuilder;
            }
        } else {
            if (richText instanceof TL_iv.textBold) {
                int i11 = i10 | 16;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i11, new StyleSpan(this, i11));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textItalic) {
                int i12 = i10 | 32;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i12, new StyleSpan(this, i12));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textUnderline) {
                int i13 = i10 | 64;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i13, new StyleSpan(this, i13));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textStrike) {
                int i14 = i10 | 128;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i14, new StyleSpan(this, i14));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textFixed) {
                int i15 = i10 | 256;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i15, new StyleSpan(this, i15));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textUrl) {
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new t41(((TL_iv.textUrl) richText).url, getTextStyleRun(1024)));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textEmail) {
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new t41("mailto:" + ((TL_iv.textEmail) richText).email, getTextStyleRun(1024)));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textConcat) {
                for (int i16 = 0; i16 < richText.texts.size(); i16++) {
                    formatText(richText.texts.get(i16), spannableStringBuilder, i10);
                }
            } else {
                if (richText instanceof TL_iv.textSubscript) {
                    int i17 = i10 | 2048;
                    formatTextAndSetSpan(richText.text, spannableStringBuilder, i17, new StyleSpan(this, i17));
                    return spannableStringBuilder;
                }
                if (richText instanceof TL_iv.textSuperscript) {
                    int i18 = i10 | 4096;
                    formatTextAndSetSpan(richText.text, spannableStringBuilder, i18, new StyleSpan(this, i18));
                    return spannableStringBuilder;
                }
                if (richText instanceof TL_iv.textMarked) {
                    int i19 = i10 | 8192;
                    formatTextAndSetSpan(richText.text, spannableStringBuilder, i19, new StyleSpan(this, i19));
                    return spannableStringBuilder;
                }
                if (richText instanceof TL_iv.textPhone) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String strD = oe.b.d(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        strD = s3.c.e("+", strD);
                    }
                    formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new t41(s3.c.e("tel:", strD), getTextStyleRun(1024)));
                    return spannableStringBuilder;
                }
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
                    TL_iv.RichText richText2 = richText.text;
                    String str2 = textanchor.name;
                    formatTextAndSetSpan(richText2, spannableStringBuilder, i10, new AnchorSpan(str2 != null ? str2.toLowerCase() : ""));
                    return spannableStringBuilder;
                }
                if (richText instanceof TL_iv.textMath) {
                    TL_iv.textMath textmath = (TL_iv.textMath) richText;
                    if (textmath.bitmap == null && !textmath.tried) {
                        textmath.tried = true;
                        rh.q qVarA = rh.q.a(textmath.source, AndroidUtilities.dp(this.fontSize + 4), true);
                        if (qVarA != null) {
                            textmath.f22605w = qVarA.f47382b;
                            textmath.h = qVarA.f47383c;
                            textmath.depth = qVarA.d;
                            textmath.bitmap = qVarA.f47381a;
                        }
                    }
                    if (textmath.bitmap == null) {
                        String str3 = textmath.source;
                        return str3 == null ? "" : str3;
                    }
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(" ");
                    int length2 = spannableStringBuilder.length();
                    spannableStringBuilder.setSpan(new qz0(null, textmath.bitmap, textmath.f22605w, textmath.h, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.resourcesProvider), textmath.depth), length, length2, 33);
                    String str4 = textmath.source;
                    if (str4 != null && !str4.isEmpty()) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.p9(textmath.source), length, length2, 33);
                        return spannableStringBuilder;
                    }
                } else {
                    if (richText instanceof TL_iv.textCustomEmoji) {
                        TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
                        CharSequence charSequence = TextUtils.isEmpty(textcustomemoji.alt) ? "😀" : textcustomemoji.alt;
                        int length3 = spannableStringBuilder.length();
                        spannableStringBuilder.append(charSequence);
                        int length4 = spannableStringBuilder.length();
                        boolean zA = h7.a8.a(i10, 13);
                        int i20 = i10 & 15;
                        if (i20 >= 1 && i20 <= 6) {
                            TextPaint textPaint = new TextPaint(this.textPaint);
                            new StyleSpan(this, i10, true).applyStyle(textPaint);
                            size = new org.telegram.ui.Components.t5(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                        } else {
                            size = new org.telegram.ui.Components.t5(textcustomemoji.document_id, zA ? 1.0f : 1.2f, (Paint.FontMetricsInt) null).setSize(AndroidUtilities.dp(this.fontSize + 4 + (zA ? -2 : 4)));
                        }
                        spannableStringBuilder.setSpan(size, length3, length4, 33);
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textSpoiler) {
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new yz0(getTextStyleRun(256), 0));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textMention) {
                        TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                        xz0 xz0Var = new xz0();
                        xz0Var.d = tL_messageEntityMention;
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new r41(getString(richText), xz0Var));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textHashtag) {
                        TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                        xz0 xz0Var2 = new xz0();
                        xz0Var2.d = tL_messageEntityHashtag;
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new r41(getString(richText), xz0Var2));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textBotCommand) {
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new o41(getString(richText), isOut() ? 1 : 0, null));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textCashtag) {
                        TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                        xz0 xz0Var3 = new xz0();
                        xz0Var3.d = tL_messageEntityCashtag;
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new r41(getString(richText), xz0Var3));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textAutoUrl) {
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new t41(getString(richText), getTextStyleRun(1024)));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textAutoEmail) {
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new t41(s3.c.e("mailto:", getString(richText)), getTextStyleRun(1024)));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textAutoPhone) {
                        String string = getString(richText);
                        String strD2 = oe.b.d(string, false);
                        if (string.startsWith("+")) {
                            strD2 = s3.c.e("+", strD2);
                        }
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new t41(s3.c.e("tel:", strD2), getTextStyleRun(1024)));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textBankCard) {
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new r41(s3.c.e("card:", getString(richText)), (xz0) null));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textMentionName) {
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new u41("" + ((TL_iv.textMentionName) richText).user_id, isOut() ? 1 : 0, null));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textDate) {
                        TL_iv.textDate textdate = (TL_iv.textDate) richText;
                        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                        tL_messageEntityFormattedDate.relative = textdate.relative;
                        tL_messageEntityFormattedDate.short_time = textdate.short_time;
                        tL_messageEntityFormattedDate.long_time = textdate.long_time;
                        tL_messageEntityFormattedDate.short_date = textdate.short_date;
                        tL_messageEntityFormattedDate.long_date = textdate.long_date;
                        tL_messageEntityFormattedDate.day_of_week = textdate.day_of_week;
                        tL_messageEntityFormattedDate.date = textdate.date;
                        int i21 = i10 | 512;
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i21, new StyleSpan(this, i21), new v00(getString(richText), null, tL_messageEntityFormattedDate));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textButton) {
                        int length5 = spannableStringBuilder.length();
                        spannableStringBuilder.append("*");
                        RichButtonSpan richButtonSpan = new RichButtonSpan(this, this.maxWidth, (TL_iv.textButton) richText);
                        richButtonSpan.scale = 1.2f;
                        spannableStringBuilder.setSpan(richButtonSpan, length5, spannableStringBuilder.length(), 33);
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    private void drawInternal(Canvas canvas, org.telegram.ui.Cells.r1 r1Var, boolean z10, float f10, float f11) {
        float fLerp;
        float f12;
        RichDetailsBlock richDetailsBlock;
        drawBackground(canvas, r1Var);
        updateTranslationLoading();
        float f13 = 0.0f;
        float fMax = (r1Var == null || !(this.detailsAnimating || this.blockquoteAnimating)) ? 1.0f : Math.max(0.0f, Math.min(1.0f, r1Var.K1));
        this.detailsAnimationProgress = fMax;
        if (fMax >= 1.0f) {
            this.detailsAnimating = false;
            this.blockquoteAnimating = false;
        }
        boolean z11 = this.detailsAnimating;
        boolean z12 = (z11 || this.blockquoteAnimating) ? false : z10;
        boolean z13 = z11 && fMax < 1.0f;
        if (z13) {
            computeDetailsClips(fMax);
        }
        computeBlockquoteClips(fMax);
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock.currVisible || richBlock.prevVisible) {
                float fLerp2 = AndroidUtilities.lerp(richBlock.prevY, richBlock.currY, fMax);
                boolean z14 = richBlock instanceof RichDetailsEndBlock;
                if (z14) {
                    fLerp = 1.0f;
                } else {
                    fLerp = AndroidUtilities.lerp(richBlock.prevVisible ? 1.0f : 0.0f, richBlock.currVisible ? 1.0f : 0.0f, fMax);
                }
                if (fLerp > f13) {
                    int height = richBlock.getHeight();
                    if (!z12 || (height + fLerp2 > f10 && fLerp2 < f11)) {
                        canvas.save();
                        if (!z13 || (richDetailsBlock = richBlock.parentDetails) == null || z14) {
                            f12 = 1.0f;
                        } else {
                            float fMax2 = -3.4028235E38f;
                            float fMin = Float.MAX_VALUE;
                            for (richDetailsBlock = richBlock.parentDetails; richDetailsBlock != null; richDetailsBlock = richDetailsBlock.parentDetails) {
                                fMax2 = Math.max(fMax2, richDetailsBlock.animClipTop);
                                fMin = Math.min(fMin, richDetailsBlock.animClipBottom);
                            }
                            f12 = 1.0f;
                            if (fMin <= fMax2) {
                                canvas.restore();
                            } else {
                                canvas.clipRect(-this.padLeft, fMax2, getMinWidth() + this.padRight, fMin);
                                f13 = 0.0f;
                            }
                        }
                        canvas.translate(f13, fLerp2);
                        if (fLerp < f12) {
                            int iSaveLayerAlpha = canvas.saveLayerAlpha(-this.padLeft, 0.0f, getMinWidth() + this.padRight, height, (int) (fLerp * 255.0f), 31);
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

    private CharSequence formatTextAndSetSpan(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i10, Object obj, Object obj2) {
        int length = spannableStringBuilder.length();
        formatText(richText, spannableStringBuilder, i10);
        if (spannableStringBuilder.length() > length) {
            setSpansWithoutClash(obj, spannableStringBuilder, length, spannableStringBuilder.length());
            setSpansWithoutClash(obj2, spannableStringBuilder, length, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    public void draw(Canvas canvas, int i10, int i11, org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        setBubblePaddings(i10, i11);
        this.textPaint.linkColor = getThemedColor(isOut() ? org.telegram.ui.ActionBar.g6.f23131hc : org.telegram.ui.ActionBar.g6.gc);
        drawInternal(canvas, r1Var, f11 > f10, f10, f11);
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

        public int f19630w;

        public int f19631x;

        public int f19632y;

        private MediaCell(RichMessageLayout richMessageLayout, TL_iv.pageBlockPhoto pageblockphoto) {
            int i10;
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
            this.aspectRatio = (photoSize == null || (i10 = photoSize.h) <= 0) ? 1.0f : photoSize.f22405w / i10;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        }

        private boolean allowAutoplay() {
            return this.realVideo ? SharedConfig.isAutoplayVideo() : SharedConfig.isAutoplayGifs();
        }

        private void applyImage(boolean z10) {
            TLRPC.Photo photo = this.photo;
            if (photo != null && this.sizeFull != null) {
                TLRPC.PhotoSize photoSize = this.strippedSize;
                ImageLocation forPhoto = photoSize != null ? ImageLocation.getForPhoto(photoSize, photo) : null;
                if (z10) {
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
                if (!z10 || !this.isVideo || (!allowAutoplay() && !this.mediaForced)) {
                    this.imageReceiver.setImage(null, null, forDocument2, null, forDocument, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
                    return;
                }
                this.imageReceiver.setAllowStartAnimation(true);
                this.imageReceiver.setAutoRepeat(1);
                this.imageReceiver.setImage(ImageLocation.getForDocument(this.document), "g", forDocument2, null, forDocument, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
            }
        }

        private boolean computeAutoDownload() {
            if (this.document == null) {
                return (DownloadController.getInstance(this.root.currentAccount).getCurrentDownloadMask() & 1) != 0;
            }
            if (this.isVideo) {
                return allowAutoplay() && DownloadController.getInstance(this.root.currentAccount).canDownloadMedia(4, this.document.size);
            }
            return true;
        }

        private void didPressButton(View view, boolean z10) {
            int i10 = this.buttonState;
            if (i10 == 0) {
                this.mediaForced = true;
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 != null) {
                    radialProgress2.o(0.0f, z10);
                }
                applyImage(true);
                this.buttonState = 1;
                RadialProgress2 radialProgress3 = this.radialProgress;
                if (radialProgress3 != null) {
                    radialProgress3.setIcon(3, true, z10);
                }
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                this.mediaForced = false;
                this.imageReceiver.cancelLoadImage();
                this.buttonState = 0;
                RadialProgress2 radialProgress4 = this.radialProgress;
                if (radialProgress4 != null) {
                    radialProgress4.setIcon(2, false, z10);
                }
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            if (i10 != 2) {
                if (i10 != 3 || this.root.delegate == null) {
                    return;
                }
                this.root.delegate.c2(this.root.cell, this.pageBlock);
                return;
            }
            this.mediaForced = true;
            this.imageReceiver.setAllowStartAnimation(true);
            applyImage(true);
            this.imageReceiver.startAnimation();
            this.buttonState = -1;
            RadialProgress2 radialProgress5 = this.radialProgress;
            if (radialProgress5 != null) {
                radialProgress5.setIcon(4, false, z10);
            }
            if (view != null) {
                view.invalidate();
            }
        }

        private void drawSpoiler(Canvas canvas) {
            Canvas canvas2;
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
            eh.j mediaSpoilerEffect = this.root.getMediaSpoilerEffect();
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
            if (this.buttonState == -1) {
                return false;
            }
            int i10 = this.buttonX;
            if (f10 < i10) {
                return false;
            }
            int i11 = this.buttonSize;
            if (f10 > i10 + i11) {
                return false;
            }
            int i12 = this.buttonY;
            return f11 >= ((float) i12) && f11 <= ((float) (i12 + i11));
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
            if (radialProgress2 == null || this.buttonState == -1) {
                return;
            }
            radialProgress2.draw(canvas);
        }

        public void ensureProgress(View view) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null || view == null) {
                if (radialProgress2 == null || view == null) {
                    return;
                }
                radialProgress2.m(view);
                RadialProgress2 radialProgress3 = this.radialProgress;
                int i10 = this.buttonX;
                int i11 = this.buttonY;
                int i12 = this.buttonSize;
                radialProgress3.q(i10, i11, i10 + i12, i12 + i11);
                return;
            }
            RadialProgress2 radialProgress4 = new RadialProgress2(view, null);
            this.radialProgress = radialProgress4;
            radialProgress4.d = -1;
            radialProgress4.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress5 = this.radialProgress;
            int i13 = this.buttonX;
            int i14 = this.buttonY;
            int i15 = this.buttonSize;
            radialProgress5.q(i13, i14, i13 + i15, i15 + i14);
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

        public CharSequence getAccessibilityText() {
            String string = LocaleController.getString(this.isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
            return (!isSpoiler() || this.spoilerReveal.fullyRevealed()) ? string : TextUtils.concat(string, ", ", LocaleController.getString(R.string.Spoiler));
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
            int i10 = this.f19631x;
            if (f10 < i10 || f10 > i10 + this.f19630w) {
                return false;
            }
            int i11 = this.f19632y;
            return f11 >= ((float) i11) && f11 <= ((float) (i11 + this.h));
        }

        public boolean onAccessibilityClick(View view) {
            if (!isSpoiler() || this.spoilerReveal.isRevealing()) {
                if (this.root.delegate == null) {
                    return false;
                }
                this.root.delegate.c2(this.root.cell, this.pageBlock);
                return true;
            }
            float imageWidth = this.imageReceiver.getImageWidth();
            float imageHeight = this.imageReceiver.getImageHeight();
            this.spoilerReveal.start(view, (imageWidth / 2.0f) + this.imageReceiver.getImageX(), (imageHeight / 2.0f) + this.imageReceiver.getImageY(), imageWidth, imageHeight);
            return true;
        }

        @Override
        public void onFailedDownload(String str, boolean z10) {
            updateButtonState(this.parentView, false);
        }

        @Override
        public void onProgressDownload(String str, long j10, long j11) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.o(Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11), true);
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
            int i10;
            int actionMasked = motionEvent.getActionMasked();
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean zIsInside = isInside(x8, y10);
            boolean zIsOnButton = isOnButton(x8, y10);
            if (actionMasked == 0) {
                if (zIsInside && (zIsOnButton || (i10 = this.buttonState) == 0 || i10 == 2)) {
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
                    if (isSpoiler() && !this.spoilerReveal.isRevealing()) {
                        float imageWidth = this.imageReceiver.getImageWidth();
                        float imageHeight = this.imageReceiver.getImageHeight();
                        this.spoilerReveal.start(view, (imageWidth / 2.0f) + this.imageReceiver.getImageX(), (imageHeight / 2.0f) + this.imageReceiver.getImageY(), imageWidth, imageHeight);
                    } else if (this.root.delegate != null) {
                        this.root.delegate.c2(this.root.cell, this.pageBlock);
                    }
                    return true;
                }
            }
            return false;
        }

        public void setRect(int i10, int i11, int i12, int i13) {
            this.f19631x = i10;
            this.f19632y = i11;
            this.f19630w = i12;
            this.h = i13;
            this.imageReceiver.setImageCoords(i10, i11, i12, i13);
            int i14 = this.buttonSize;
            int iB = i0.a.B(i12, i14, 2, i10);
            this.buttonX = iB;
            int iB2 = i0.a.B(i13, i14, 2, i11);
            this.buttonY = iB2;
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.q(iB, iB2, iB + i14, i14 + iB2);
            }
            boolean zComputeAutoDownload = computeAutoDownload();
            this.autoDownload = zComputeAutoDownload;
            applyImage(zComputeAutoDownload || fileExists());
        }

        public void updateButtonState(View view, boolean z10) {
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
            boolean z11 = animation != null && (animation.s() || this.imageReceiver.isAnimationRunning());
            if (fileExists() || (this.isVideo && z11)) {
                DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
                if (this.realVideo && !z11) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress3 = this.radialProgress;
                    if (radialProgress3 != null) {
                        radialProgress3.setIcon(0, false, z10);
                    }
                } else if (!this.isVideo || z11 || allowAutoplay() || this.mediaForced) {
                    this.buttonState = -1;
                    RadialProgress2 radialProgress4 = this.radialProgress;
                    if (radialProgress4 != null) {
                        radialProgress4.setIcon(4, false, z10);
                    }
                } else {
                    this.buttonState = 2;
                    RadialProgress2 radialProgress5 = this.radialProgress;
                    if (radialProgress5 != null) {
                        radialProgress5.setIcon(8, false, z10);
                    }
                }
            } else {
                DownloadController.getInstance(this.root.currentAccount).addLoadingFileObserver(fileName, null, this);
                float fFloatValue = 0.0f;
                if (this.autoDownload || this.mediaForced || FileLoader.getInstance(this.root.currentAccount).isLoadingFile(fileName)) {
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                    fFloatValue = fileProgress != null ? fileProgress.floatValue() : 0.0f;
                    RadialProgress2 radialProgress6 = this.radialProgress;
                    if (radialProgress6 != null) {
                        radialProgress6.setIcon(3, true, z10);
                    }
                } else if (this.realVideo) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress7 = this.radialProgress;
                    if (radialProgress7 != null) {
                        radialProgress7.setIcon(0, true, z10);
                    }
                } else {
                    this.buttonState = 0;
                    RadialProgress2 radialProgress8 = this.radialProgress;
                    if (radialProgress8 != null) {
                        radialProgress8.setIcon(2, true, z10);
                    }
                }
                RadialProgress2 radialProgress9 = this.radialProgress;
                if (radialProgress9 != null) {
                    radialProgress9.o(fFloatValue, false);
                }
            }
            if (view != null) {
                view.invalidate();
            }
        }

        private MediaCell(RichMessageLayout richMessageLayout, TL_iv.pageBlockVideo pageblockvideo) {
            float f10;
            int i10;
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
                for (int i11 = 0; i11 < this.document.attributes.size(); i11++) {
                    TLRPC.DocumentAttribute documentAttribute = this.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i10 = documentAttribute.h) > 0) {
                        f10 = documentAttribute.f22387w / i10;
                    }
                }
                f10 = 1.0f;
            } else {
                f10 = 1.0f;
            }
            this.aspectRatio = f10;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            this.imageReceiver.setAllowLoadingOnAttachedOnly(true);
            this.blurImageReceiver.setAllowLoadingOnAttachedOnly(true);
            this.imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                @Override
                public final void didSetImageBitmap(int i12, String str, Drawable drawable) {
                    i5.a(this, i12, str, drawable);
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

    private RichMessageLayout(int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
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
        this.quoteLine = new gl0(null);
        this.clip = new v10();
        this.showMoreRect = new RectF();
        this.messageObject = null;
        this.currentAccount = i10;
        this.maxWidth = i11;
        this.resourcesProvider = c6Var;
        int i12 = SharedConfig.fontSize;
        this.fontSize = i12;
        this.density = AndroidUtilities.density;
        textPaint.setTextSize(AndroidUtilities.dp(i12));
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
        private final mn0 seekBar;
        private int seekBarWidth;
        private int seekBarX;
        private int seekBarY;
        private final int size;
        private StaticLayout titleLayout;

        public RichAudioBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockAudio pageblockaudio) {
            super(richMessageLayout, rect, i10);
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
            RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
            this.radialProgress = radialProgress2;
            radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
            radialProgress2.q(iDp, iDp2, iDp + iDp3, iDp3 + iDp2);
            mn0 mn0Var = new mn0(null);
            this.seekBar = mn0Var;
            mn0Var.h = new d(this, 13);
            layoutInner();
            updateButtonState(false);
        }

        private boolean canStream() {
            MessageObject messageObject;
            return (!SharedConfig.streamMedia || (messageObject = this.currentMessageObject) == null || !messageObject.isMusic() || this.currentMessageObject.shouldEncryptPhotoOrVideo() || DialogObject.isEncryptedDialog(this.currentMessageObject.getDialogId())) ? false : true;
        }

        private void didPressedButton(boolean z10) {
            int i10 = this.root.currentAccount;
            int i11 = this.buttonState;
            if (i11 == 0) {
                if (MediaController.getInstance().setPlaylist(this.root.audioMessages, this.currentMessageObject, 0L, false, null)) {
                    this.buttonState = 1;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z10);
                    View view = this.view;
                    if (view != null) {
                        view.invalidate();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                    this.buttonState = 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z10);
                    View view2 = this.view;
                    if (view2 != null) {
                        view2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 2) {
                this.radialProgress.o(0.0f, false);
                FileLoader.getInstance(i10).loadFile(this.currentDocument, this.root.messageObject, 1, 1);
                this.buttonState = 3;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z10);
                View view3 = this.view;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (i11 == 3) {
                FileLoader.getInstance(i10).cancelLoadFile(this.currentDocument);
                this.buttonState = 2;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z10);
                View view4 = this.view;
                if (view4 != null) {
                    view4.invalidate();
                }
            }
        }

        private int getIconForCurrentState() {
            int i10 = this.buttonState;
            if (i10 == 1) {
                return 1;
            }
            if (i10 == 2) {
                return 2;
            }
            return i10 == 3 ? 3 : 0;
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
            SpannableStringBuilder spannableStringBuilder;
            int i10 = this.maxWidth;
            RichMessageLayout richMessageLayout = this.root;
            this.layoutWidth = i10 + richMessageLayout.padLeft + richMessageLayout.padRight;
            int iDp = AndroidUtilities.dp(50.0f) + this.buttonX + this.size;
            this.seekBarX = iDp;
            this.seekBarWidth = i0.a.d(18.0f, this.layoutWidth - iDp, 0);
            MessageObject messageObject = this.currentMessageObject;
            String musicAuthor = messageObject != null ? messageObject.getMusicAuthor(false) : null;
            MessageObject messageObject2 = this.currentMessageObject;
            String musicTitle = messageObject2 != null ? messageObject2.getMusicTitle(false) : null;
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.titleLayout = null;
                this.seekBarY = ((this.size - AndroidUtilities.dp(30.0f)) / 2) + this.buttonY;
            } else {
                if (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder = !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(a9.p.w(musicAuthor, " - ", musicTitle));
                }
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                this.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
                int iDp2 = AndroidUtilities.dp(50.0f) + this.seekBarWidth;
                this.titleLayout = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.g6.O2, iDp2, TextUtils.TruncateAt.END), this.audioTimePaint, iDp2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.seekBarY = AndroidUtilities.dp(11.0f) + ((this.size - AndroidUtilities.dp(30.0f)) / 2) + this.buttonY;
            }
            this.seekBar.j(this.seekBarWidth, AndroidUtilities.dp(30.0f));
        }

        @Override
        public void didReceivedNotification(int i10, int i11, Object... objArr) {
            MessageObject playingMessageObject;
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject == null) {
                return;
            }
            if (i10 == NotificationCenter.messagePlayingDidStart) {
                updateButtonState(true);
                return;
            }
            if (i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                updateButtonState(true);
                return;
            }
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
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
            return this.seekBar.f30708e;
        }

        @Override
        public void onAttachedToWindow() {
            View view = this.view;
            if (view != null) {
                this.radialProgress.m(view);
                this.seekBar.f30721s = this.view;
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
            if (this.currentMessageObject == null || this.currentDocument == null) {
                return;
            }
            int i10 = this.layoutWidth;
            int i11 = this.maxWidth;
            RichMessageLayout richMessageLayout = this.root;
            if (i10 != i11 + richMessageLayout.padLeft + richMessageLayout.padRight) {
                layoutInner();
            }
            canvas.save();
            canvas.translate(-this.root.padLeft, 0.0f);
            this.radialProgress.g(this.root.isOut() ? org.telegram.ui.ActionBar.g6.Nb : org.telegram.ui.ActionBar.g6.f23152ie, this.root.isOut() ? org.telegram.ui.ActionBar.g6.Ob : org.telegram.ui.ActionBar.g6.f23170je, this.root.isOut() ? org.telegram.ui.ActionBar.g6.Pa : org.telegram.ui.ActionBar.g6.f23363uc, this.root.isOut() ? org.telegram.ui.ActionBar.g6.Qa : org.telegram.ui.ActionBar.g6.f23379vc);
            RadialProgress2 radialProgress2 = this.radialProgress;
            RichMessageLayout richMessageLayout2 = this.root;
            radialProgress2.d = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.g6.Db : org.telegram.ui.ActionBar.g6.Bd);
            this.radialProgress.draw(canvas);
            mn0 mn0Var = this.seekBar;
            RichMessageLayout richMessageLayout3 = this.root;
            int themedColor = richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? org.telegram.ui.ActionBar.g6.wb : org.telegram.ui.ActionBar.g6.f23364ud);
            RichMessageLayout richMessageLayout4 = this.root;
            int themedColor2 = richMessageLayout4.getThemedColor(richMessageLayout4.isOut() ? org.telegram.ui.ActionBar.g6.f23410xb : org.telegram.ui.ActionBar.g6.f23380vd);
            RichMessageLayout richMessageLayout5 = this.root;
            int themedColor3 = richMessageLayout5.getThemedColor(richMessageLayout5.isOut() ? org.telegram.ui.ActionBar.g6.f23446zb : org.telegram.ui.ActionBar.g6.f23412xd);
            RichMessageLayout richMessageLayout6 = this.root;
            int themedColor4 = richMessageLayout6.getThemedColor(richMessageLayout6.isOut() ? org.telegram.ui.ActionBar.g6.f23446zb : org.telegram.ui.ActionBar.g6.f23412xd);
            RichMessageLayout richMessageLayout7 = this.root;
            mn0Var.h(themedColor, themedColor2, themedColor3, themedColor4, richMessageLayout7.getThemedColor(richMessageLayout7.isOut() ? org.telegram.ui.ActionBar.g6.f23428yb : org.telegram.ui.ActionBar.g6.wd));
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

        @Override
        public void onFailedDownload(String str, boolean z10) {
            updateButtonState(true);
        }

        @Override
        public void onProgressDownload(String str, long j10, long j11) {
            this.radialProgress.o(Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11), true);
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
            float x8 = motionEvent.getX() + this.root.padLeft;
            float y10 = motionEvent.getY();
            if (this.seekBar.f(x8 - this.seekBarX, y10 - this.seekBarY, actionMasked)) {
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
                    int i10 = this.buttonX;
                    if (x8 >= i10 && x8 <= AndroidUtilities.dp(48.0f) + i10) {
                        int i11 = this.buttonY;
                        if (y10 >= i11 && y10 <= AndroidUtilities.dp(48.0f) + i11) {
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
            int i10 = this.root.currentAccount;
            String attachFileName = FileLoader.getAttachFileName(this.currentDocument);
            File pathToAttach = this.currentDocument == null ? null : FileLoader.getInstance(i10).getPathToAttach(this.currentDocument, true);
            boolean z11 = pathToAttach != null && pathToAttach.exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (z11) {
                DownloadController.getInstance(i10).removeLoadingFileObserver(this);
                if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || MediaController.getInstance().isMessagePaused()) {
                    this.buttonState = 0;
                } else {
                    this.buttonState = 1;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z10);
            } else {
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
                if (canStream()) {
                    this.buttonState = (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || MediaController.getInstance().isMessagePaused()) ? 0 : 1;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z10);
                } else {
                    if (FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                        this.buttonState = 3;
                        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                        this.radialProgress.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, z10);
                        this.radialProgress.setIcon(getIconForCurrentState(), true, z10);
                    } else {
                        this.buttonState = 2;
                        this.radialProgress.o(0.0f, z10);
                        this.radialProgress.setIcon(getIconForCurrentState(), false, z10);
                    }
                }
            }
            updatePlayingMessageProgress();
        }

        public void updatePlayingMessageProgress() {
            MessageObject messageObject;
            int i10;
            if (this.currentDocument == null || (messageObject = this.currentMessageObject) == null) {
                return;
            }
            mn0 mn0Var = this.seekBar;
            if (!mn0Var.f30708e) {
                mn0Var.i(messageObject.audioProgress);
            }
            if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                i10 = this.currentMessageObject.audioProgressSec;
            } else {
                i10 = 0;
                for (int i11 = 0; i11 < this.currentDocument.attributes.size(); i11++) {
                    TLRPC.DocumentAttribute documentAttribute = this.currentDocument.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i10 = (int) documentAttribute.duration;
                        break;
                    }
                }
            }
            String shortDuration = AndroidUtilities.formatShortDuration(i10);
            String str = this.lastTimeString;
            if (str == null || !str.equals(shortDuration)) {
                this.lastTimeString = shortDuration;
                this.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.durationLayout = new StaticLayout(shortDuration, this.audioTimePaint, (int) Math.ceil(this.audioTimePaint.measureText(shortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            TextPaint textPaint = this.audioTimePaint;
            RichMessageLayout richMessageLayout = this.root;
            textPaint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.fc : org.telegram.ui.ActionBar.g6.f23077ec));
            View view = this.view;
            if (view != null) {
                view.invalidate();
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

        public RichDocumentBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockDocument pageblockdocument) {
            super(richMessageLayout, rect, i10);
            ImageReceiver imageReceiver = new ImageReceiver();
            this.previewImage = imageReceiver;
            this.previewBackgroundPaint = new Paint(1);
            this.titlePaint = new TextPaint(1);
            this.sizePaint = new TextPaint(1);
            int iDp = AndroidUtilities.dp(16.0f);
            this.buttonX = iDp;
            int iDp2 = AndroidUtilities.dp(9.0f);
            this.buttonY = iDp2;
            int iDp3 = AndroidUtilities.dp(42.0f);
            this.buttonSize = iDp3;
            this.buttonTextSpacing = AndroidUtilities.dp(14.0f);
            this.optionsHit = new RectF();
            this.layoutWidth = -1;
            this.block = pageblockdocument;
            TLRPC.Document document = richMessageLayout.getDocument(pageblockdocument.document_id);
            this.document = document;
            int iDp4 = AndroidUtilities.dp(10.0f) + richMessageLayout.padLeft;
            this.previewX = iDp4;
            boolean zIsDocumentHasThumb = MessageObject.isDocumentHasThumb(document);
            this.hasPreview = zIsDocumentHasThumb;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
            this.radialProgress = radialProgress2;
            radialProgress2.setCircleRadius(iDp3 / 2);
            iDp = zIsDocumentHasThumb ? ((AndroidUtilities.dp(86.0f) - iDp3) / 2) + iDp4 : iDp;
            iDp2 = zIsDocumentHasThumb ? AndroidUtilities.dp(10.0f) + ((AndroidUtilities.dp(86.0f) - iDp3) / 2) : iDp2;
            radialProgress2.q(iDp, iDp2, iDp + iDp3, iDp3 + iDp2);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            if (zIsDocumentHasThumb) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
                imageReceiver.setImageCoords(iDp4, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
                imageReceiver.setImage(closestPhotoSizeWithSize != null ? ImageLocation.getForDocument(closestPhotoSizeWithSize, document) : null, "86_86", ImageLoader.createStripedBitmap(document.thumbs), null, richMessageLayout.messageObject, 1);
            }
            rebuildLayouts();
            updateButtonState(false);
        }

        private boolean canShowOptions() {
            return (this.document == null || this.root.cell == null || this.root.delegate == null || !this.root.delegate.e0(this.root.cell)) ? false : true;
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
            int iMin;
            int minWidth = this.root.getMinWidth();
            if (minWidth > 0) {
                int i10 = this.maxWidth;
                Rect rect = this.padding;
                iMin = Math.min(i10, Math.max(0, (minWidth - rect.left) - rect.right));
            } else {
                iMin = this.maxWidth;
            }
            RichMessageLayout richMessageLayout = this.root;
            return iMin + richMessageLayout.padLeft + richMessageLayout.padRight;
        }

        private int getMenuX() {
            return (this.layoutWidth + this.padding.right) - AndroidUtilities.dp(32.0f);
        }

        private File path() {
            if (this.document == null) {
                return null;
            }
            File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, false);
            return (pathToAttach == null || !pathToAttach.exists()) ? FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, true) : pathToAttach;
        }

        private void press() {
            int i10 = this.buttonState;
            if (i10 == 0) {
                View view = this.view;
                Activity activityFindActivity = findActivity(view == null ? null : view.getContext());
                File filePath = path();
                if (activityFindActivity != null && filePath != null) {
                    AndroidUtilities.openForView(filePath, FileLoader.getDocumentFileName(this.document), this.document.mime_type, activityFindActivity, this.root.resourcesProvider, false);
                }
            } else if (i10 == 1 && this.document != null) {
                FileLoader.getInstance(this.root.currentAccount).loadFile(this.document, this.root.messageObject, 1, 1);
                this.buttonState = 2;
                this.radialProgress.setIcon(3, true, true);
            } else if (i10 == 2 && this.document != null) {
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
            int iDp;
            this.layoutWidth = getLayoutWidth();
            if (this.hasPreview) {
                iDp = AndroidUtilities.dp(97.0f) + this.previewX;
            } else {
                iDp = this.buttonTextSpacing + this.buttonX + this.buttonSize;
            }
            int iD = i0.a.d(48.0f, this.layoutWidth - iDp, AndroidUtilities.dp(40.0f));
            this.titlePaint.setTextSize(AndroidUtilities.dp(this.root.fontSize - 1));
            this.titlePaint.setTypeface(AndroidUtilities.bold());
            this.sizePaint.setTextSize(AndroidUtilities.dp(this.root.fontSize - 3));
            TLRPC.Document document = this.document;
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(document == null ? "" : FileLoader.getDocumentFileName(document), this.titlePaint, iD, TextUtils.TruncateAt.END);
            TextPaint textPaint = this.titlePaint;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.titleLayout = new StaticLayout(charSequenceEllipsize, textPaint, iD, alignment, 1.0f, 0.0f, false);
            TLRPC.Document document2 = this.document;
            this.sizeLayout = new StaticLayout(document2 != null ? AndroidUtilities.formatFileSize(document2.size) : "", this.sizePaint, iD, alignment, 1.0f, 0.0f, false);
        }

        @Override
        public int getHeight() {
            return AndroidUtilities.dp(this.hasPreview ? 106.0f : 60.0f) + this.padding.top + this.padding.bottom;
        }

        @Override
        public int getLastLineWidth() {
            int iCeil;
            int iDp;
            if (this.hasPreview) {
                iCeil = this.previewX - this.root.padLeft;
                iDp = AndroidUtilities.dp(86.0f);
            } else {
                StaticLayout staticLayout = this.sizeLayout;
                if (staticLayout == null || staticLayout.getLineCount() <= 0) {
                    iCeil = 0;
                } else {
                    StaticLayout staticLayout2 = this.sizeLayout;
                    iCeil = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
                }
                iDp = (this.buttonX - this.root.padLeft) + this.buttonSize + this.buttonTextSpacing;
            }
            int i10 = iDp + iCeil;
            Rect rect = this.padding;
            return rect.left + i10 + rect.right;
        }

        @Override
        public int getMinWidth() {
            TLRPC.Document document = this.document;
            String documentFileName = document == null ? "" : FileLoader.getDocumentFileName(document);
            TLRPC.Document document2 = this.document;
            int iMin = Math.min(this.maxWidth, Math.max(AndroidUtilities.dp(220.0f), AndroidUtilities.dp(48.0f) + (this.hasPreview ? AndroidUtilities.dp(107.0f) : this.buttonX + this.buttonSize + this.buttonTextSpacing) + ((int) Math.ceil(Math.max(this.titlePaint.measureText(documentFileName), this.sizePaint.measureText(document2 != null ? AndroidUtilities.formatFileSize(document2.size) : ""))))));
            Rect rect = this.padding;
            return rect.left + iMin + rect.right;
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
            int iDp;
            if (this.document == null) {
                return;
            }
            if (this.layoutWidth != getLayoutWidth()) {
                rebuildLayouts();
            }
            canvas.save();
            canvas.translate(-this.root.padLeft, 0.0f);
            if (!this.hasPreview || this.previewImage.draw(canvas)) {
                canvas2 = canvas;
            } else {
                Paint paint = this.previewBackgroundPaint;
                RichMessageLayout richMessageLayout = this.root;
                paint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.Ib : org.telegram.ui.ActionBar.g6.Gd));
                canvas2 = canvas;
                canvas2.drawRoundRect(this.previewX, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f) + this.previewX, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.previewBackgroundPaint);
            }
            this.radialProgress.draw(canvas2);
            TextPaint textPaint = this.titlePaint;
            RichMessageLayout richMessageLayout2 = this.root;
            textPaint.setColor(richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.g6.Fb : org.telegram.ui.ActionBar.g6.Dd));
            TextPaint textPaint2 = this.sizePaint;
            RichMessageLayout richMessageLayout3 = this.root;
            textPaint2.setColor(richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? org.telegram.ui.ActionBar.g6.f23325sb : org.telegram.ui.ActionBar.g6.f23240nd));
            if (this.hasPreview) {
                iDp = AndroidUtilities.dp(97.0f) + this.previewX;
            } else {
                iDp = this.buttonTextSpacing + this.buttonX + this.buttonSize;
            }
            int iDp2 = AndroidUtilities.dp(11.0f);
            int iDp3 = AndroidUtilities.dp(2.0f) + this.titleLayout.getHeight() + iDp2;
            canvas2.save();
            float f10 = iDp;
            canvas2.translate(f10, iDp2);
            this.titleLayout.draw(canvas2);
            canvas2.restore();
            canvas2.save();
            canvas2.translate(f10, iDp3);
            this.sizeLayout.draw(canvas2);
            canvas2.restore();
            if (canShowOptions()) {
                Drawable themedDrawable = this.root.isOut() ? this.root.getThemedDrawable("drawableMsgOutMenu") : org.telegram.ui.ActionBar.g6.f23034c4;
                int menuX = getMenuX();
                int iDp4 = AndroidUtilities.dp(7.0f);
                themedDrawable.setBounds(menuX, iDp4, themedDrawable.getIntrinsicWidth() + menuX, themedDrawable.getIntrinsicHeight() + iDp4);
                themedDrawable.draw(canvas2);
                this.optionsHit.set(menuX - AndroidUtilities.dp(8.0f), 0.0f, AndroidUtilities.dp(8.0f) + themedDrawable.getIntrinsicWidth() + menuX, AndroidUtilities.dp(54.0f));
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
            this.radialProgress.o(j11 <= 0 ? 0.0f : Math.min(1.0f, j10 / j11), true);
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
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int i10;
            boolean z10;
            float x8 = motionEvent.getX() + this.root.padLeft;
            float y10 = motionEvent.getY();
            boolean zContains = this.optionsHit.contains(x8, y10);
            if (motionEvent.getActionMasked() == 0 && zContains) {
                this.optionsPressed = true;
                return true;
            }
            if (!this.optionsPressed) {
                if (this.hasPreview) {
                    i10 = this.previewX;
                } else {
                    i10 = this.buttonX;
                }
                if (x8 >= i10 || x8 > this.layoutWidth - AndroidUtilities.dp(12.0f) || y10 < AndroidUtilities.dp(10.0f)) {
                    z10 = false;
                } else {
                    if (y10 <= AndroidUtilities.dp(this.hasPreview ? 96.0f : 53.0f)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (motionEvent.getActionMasked() != 0 && z10) {
                    this.pressed = true;
                    return true;
                }
                if (motionEvent.getActionMasked() == 1 || !this.pressed) {
                    if (motionEvent.getActionMasked() == 3) {
                        this.pressed = false;
                    }
                    return this.pressed;
                }
                this.pressed = false;
                if (z10) {
                    View view = this.view;
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    press();
                }
            } else {
                if (motionEvent.getActionMasked() == 2 && !zContains) {
                    this.optionsPressed = false;
                    return true;
                }
                if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
                    if (this.hasPreview) {
                        i10 = this.previewX;
                    } else {
                        i10 = this.buttonX;
                    }
                    if (x8 >= i10) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (motionEvent.getActionMasked() != 0) {
                    }
                    if (motionEvent.getActionMasked() == 1) {
                    }
                    if (motionEvent.getActionMasked() == 3) {
                        this.pressed = false;
                    }
                    return this.pressed;
                }
                boolean z11 = motionEvent.getActionMasked() == 1 && zContains;
                this.optionsPressed = false;
                if (z11 && this.document != null && canShowOptions()) {
                    View view2 = this.view;
                    if (view2 != null) {
                        view2.playSoundEffect(0);
                    }
                    this.root.cell.getTextX();
                    int i11 = this.padding.left;
                    int i12 = this.root.padLeft;
                    getMenuX();
                    this.root.cell.getTextY();
                    int i13 = this.padding.top;
                    AndroidUtilities.dp(7.0f);
                    this.root.delegate.h1(this.root.cell, this.document);
                    return true;
                }
            }
            return true;
        }

        public void updateButtonState(boolean z10) {
            if (this.hasPreview) {
                this.radialProgress.g(org.telegram.ui.ActionBar.g6.f23205le, org.telegram.ui.ActionBar.g6.f23223me, org.telegram.ui.ActionBar.g6.f23241ne, org.telegram.ui.ActionBar.g6.f23258oe);
                this.radialProgress.d = this.root.getThemedColor(org.telegram.ui.ActionBar.g6.f23132hd);
            } else {
                this.radialProgress.g(this.root.isOut() ? org.telegram.ui.ActionBar.g6.Nb : org.telegram.ui.ActionBar.g6.f23152ie, this.root.isOut() ? org.telegram.ui.ActionBar.g6.Ob : org.telegram.ui.ActionBar.g6.f23170je, this.root.isOut() ? org.telegram.ui.ActionBar.g6.Pa : org.telegram.ui.ActionBar.g6.f23363uc, this.root.isOut() ? org.telegram.ui.ActionBar.g6.Qa : org.telegram.ui.ActionBar.g6.f23379vc);
                RadialProgress2 radialProgress2 = this.radialProgress;
                RichMessageLayout richMessageLayout = this.root;
                radialProgress2.d = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.g6.Db : org.telegram.ui.ActionBar.g6.Bd);
            }
            String attachFileName = FileLoader.getAttachFileName(this.document);
            File filePath = path();
            if (filePath != null && filePath.exists()) {
                DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
                this.buttonState = 0;
                this.radialProgress.setIcon(this.hasPreview ? 4 : 5, false, z10);
            } else if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, z10);
            } else {
                DownloadController.getInstance(this.root.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                if (FileLoader.getInstance(this.root.currentAccount).isLoadingFile(attachFileName)) {
                    this.buttonState = 2;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    this.radialProgress.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, z10);
                    this.radialProgress.setIcon(3, true, z10);
                } else {
                    this.buttonState = 1;
                    this.radialProgress.o(0.0f, z10);
                    this.radialProgress.setIcon(2, false, z10);
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

        public RichMediaBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, boolean z10) {
            super(richMessageLayout, rect, i10);
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
                @Override
                public final void didSetImageBitmap(int i11, String str, Drawable drawable) {
                    i5.a(this, i11, str, drawable);
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
            int i10 = this.buttonState;
            if (i10 == 0) {
                this.mediaForced = true;
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 != null) {
                    radialProgress2.o(0.0f, z10);
                }
                applyImage(true);
                this.buttonState = 1;
                RadialProgress2 radialProgress3 = this.radialProgress;
                if (radialProgress3 != null) {
                    radialProgress3.setIcon(3, true, z10);
                }
                View view = this.view;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                this.mediaForced = false;
                this.imageReceiver.cancelLoadImage();
                this.buttonState = 0;
                RadialProgress2 radialProgress4 = this.radialProgress;
                if (radialProgress4 != null) {
                    radialProgress4.setIcon(2, false, z10);
                }
                View view2 = this.view;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            }
            if (i10 != 2) {
                if (i10 != 3 || this.root.delegate == null) {
                    return;
                }
                this.root.delegate.c2(this.root.cell, getBlock());
                return;
            }
            this.mediaForced = true;
            this.imageReceiver.setAllowStartAnimation(true);
            applyImage(true);
            this.imageReceiver.startAnimation();
            this.buttonState = -1;
            RadialProgress2 radialProgress5 = this.radialProgress;
            if (radialProgress5 != null) {
                radialProgress5.setIcon(4, false, z10);
            }
            View view3 = this.view;
            if (view3 != null) {
                view3.invalidate();
            }
        }

        private void drawMediaSpoiler(Canvas canvas) {
            Canvas canvas2;
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
            eh.j mediaSpoilerEffect = this.root.getMediaSpoilerEffect();
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

        private void ensureProgress() {
            View view;
            View view2;
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null || (view2 = this.view) == null) {
                if (radialProgress2 == null || (view = this.view) == null) {
                    return;
                }
                radialProgress2.m(view);
                RadialProgress2 radialProgress3 = this.radialProgress;
                int i10 = this.buttonX;
                int i11 = this.buttonY;
                int i12 = this.buttonSize;
                radialProgress3.q(i10, i11, i10 + i12, i12 + i11);
                return;
            }
            RadialProgress2 radialProgress4 = new RadialProgress2(view2, null);
            this.radialProgress = radialProgress4;
            radialProgress4.d = -1;
            radialProgress4.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress5 = this.radialProgress;
            int i13 = this.buttonX;
            int i14 = this.buttonY;
            int i15 = this.buttonSize;
            radialProgress5.q(i13, i14, i13 + i15, i15 + i14);
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

        private void startSpoilerReveal() {
            float imageWidth = this.imageReceiver.getImageWidth();
            float imageHeight = this.imageReceiver.getImageHeight();
            this.spoilerReveal.start(this.view, (imageWidth / 2.0f) + this.imageReceiver.getImageX(), (imageHeight / 2.0f) + this.imageReceiver.getImageY(), imageWidth, imageHeight);
        }

        private void updateRoundRadius(ImageReceiver imageReceiver, boolean z10) {
            if (z10) {
                imageReceiver.setRoundRadius(0);
                return;
            }
            int i10 = SharedConfig.bubbleRadius;
            int iDp = i10 > 2 ? AndroidUtilities.dp(i10 - 2) : AndroidUtilities.dp(i10);
            int iMin = Math.min(AndroidUtilities.dp(3.0f), iDp);
            int i11 = (!this.first || this.root.hasNameOffset() || (!this.root.isOut() && this.root.isPinnedTop())) ? iMin : iDp;
            if (!this.first || (this.root.isOut() && this.root.isPinnedTop())) {
                iDp = iMin;
            }
            imageReceiver.setRoundRadius(i11, iDp, iMin, iMin);
        }

        public boolean allowAutoplay() {
            return true;
        }

        public abstract void applyImage(boolean z10);

        public boolean computeAutoDownload() {
            return (DownloadController.getInstance(this.root.currentAccount).getCurrentDownloadMask() & 1) != 0;
        }

        public abstract boolean fileExists();

        public void finishLayout() {
            this.imageReceiver.setImageCoords(0.0f, 0.0f, this.imgWidth, this.imgHeight);
            int i10 = this.imgWidth;
            int i11 = this.buttonSize;
            this.buttonX = (i10 - i11) / 2;
            this.buttonY = (this.imgHeight - i11) / 2;
            boolean zComputeAutoDownload = computeAutoDownload();
            this.autoDownload = zComputeAutoDownload;
            applyImage(zComputeAutoDownload || fileExists());
        }

        public abstract TL_iv.PageBlock getBlock();

        @Override
        public void getBlockAccessibilityElementBounds(int i10, Rect rect) {
            int imageLeft = getImageLeft() + this.padding.left;
            int i11 = ((int) this.currY) + this.padding.top;
            rect.set(imageLeft, i11, this.imgWidth + imageLeft, this.imgHeight + i11);
        }

        @Override
        public int getBlockAccessibilityElementCount() {
            return 1;
        }

        @Override
        public CharSequence getBlockAccessibilityElementText(int i10) {
            String string = LocaleController.getString(isRealVideo() ? R.string.AttachVideo : R.string.AttachPhoto);
            return (!isSpoiler() || this.spoilerReveal.fullyRevealed()) ? string : TextUtils.concat(string, ", ", LocaleController.getString(R.string.Spoiler));
        }

        public abstract String getFileName();

        @Override
        public int getHeight() {
            Rect rect = this.padding;
            return rect.top + this.imgHeight + rect.bottom;
        }

        public int getImageLeft() {
            int iAvailWidth = availWidth();
            int i10 = this.imgWidth;
            if (iAvailWidth > i10) {
                return (iAvailWidth - i10) / 2;
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
        public boolean onBlockAccessibilityElementClick(int i10, View view) {
            if (isSpoiler() && !this.spoilerReveal.isRevealing()) {
                startSpoilerReveal();
                return true;
            }
            if (this.root.delegate == null) {
                return false;
            }
            this.root.delegate.c2(this.root.cell, getBlock());
            return true;
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
            if (mediaBgPaint == null) {
                Paint paint = new Paint(1);
                mediaBgPaint = paint;
                paint.setColor(251658240);
            }
            int minWidth = this.root.getMinWidth();
            Rect rect = this.padding;
            int i10 = (minWidth - rect.left) - rect.right;
            boolean zIsInQuote = isInQuote();
            int iDp = AndroidUtilities.dp(2.0f);
            int i11 = zIsInQuote ? 0 : this.root.padLeft - iDp;
            int i12 = zIsInQuote ? 0 : this.root.padRight - iDp;
            boolean z10 = availWidth() > this.imgWidth;
            if (zIsInQuote) {
                canvas.save();
                this.clipPath.rewind();
                this.clipPath.addRoundRect(0.0f, 0.0f, i10, this.imgHeight, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.clipPath(this.clipPath);
            }
            if (!this.imageReceiver.hasBitmapImage() || this.imageReceiver.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(-i11, 0.0f, i10 + i12, this.imgHeight, mediaBgPaint);
            }
            if (z10) {
                prepareBlurImage();
                updateRoundRadius(this.blurImageReceiver, false);
                updateRoundRadius(this.imageReceiver, true);
                if (this.blurImageReceiver.getBitmap() != null) {
                    this.blurImageReceiver.setImageCoords(-i11, 0.0f, i11 + i10 + i12, this.imgHeight);
                    this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
                    this.blurImageReceiver.draw(canvas);
                }
                this.imageReceiver.setAspectFit(true);
                this.imageReceiver.setImageCoords(0.0f, 0.0f, availWidth(), this.imgHeight);
            } else {
                updateRoundRadius(this.imageReceiver, false);
                this.imageReceiver.setAspectFit(false);
                this.imageReceiver.setImageCoords(-i11, 0.0f, i11 + i10 + i12, this.imgHeight);
            }
            this.imageReceiver.draw(canvas);
            if (isSpoiler() && !this.spoilerReveal.fullyRevealed()) {
                drawMediaSpoiler(canvas);
            } else if (this.radialProgress != null && this.buttonState != -1) {
                int imageLeft = getImageLeft();
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i13 = this.buttonX;
                int i14 = imageLeft + i13;
                int i15 = this.buttonY;
                int i16 = imageLeft + i13;
                int i17 = this.buttonSize;
                radialProgress2.q(i14, i15, i16 + i17, i17 + i15);
                this.radialProgress.draw(canvas);
            }
            if (zIsInQuote) {
                canvas.restore();
            }
        }

        @Override
        public void onFailedDownload(String str, boolean z10) {
            updateButtonState(false);
        }

        @Override
        public void onProgressDownload(String str, long j10, long j11) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.o(Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11), true);
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
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            int actionMasked = motionEvent.getActionMasked();
            float x8 = (motionEvent.getX() - this.padding.left) - getImageLeft();
            float y10 = motionEvent.getY() - this.padding.top;
            boolean z11 = x8 >= 0.0f && x8 <= ((float) this.imgWidth) && y10 >= 0.0f && y10 <= ((float) this.imgHeight);
            int i10 = this.buttonState;
            if (i10 != -1) {
                int i11 = this.buttonX;
                if (x8 >= i11) {
                    int i12 = this.buttonSize;
                    if (x8 <= i11 + i12) {
                        int i13 = this.buttonY;
                        if (y10 < i13 || y10 > i13 + i12) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (actionMasked == 0) {
                if (!z11 || (!z10 && i10 != 0 && i10 != 2)) {
                    if (!z11) {
                        return false;
                    }
                    this.photoPressed = true;
                    return true;
                }
                this.buttonPressed = true;
                View view = this.view;
                if (view != null) {
                    view.invalidate();
                }
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
                View view2 = this.view;
                if (view2 != null) {
                    view2.playSoundEffect(0);
                    this.view.invalidate();
                }
                didPressButton(true);
                return true;
            }
            if (this.photoPressed) {
                this.photoPressed = false;
                if (z11) {
                    View view3 = this.view;
                    if (view3 != null) {
                        view3.playSoundEffect(0);
                    }
                    if (isSpoiler() && !this.spoilerReveal.isRevealing()) {
                        startSpoilerReveal();
                    } else if (this.root.delegate != null) {
                        this.root.delegate.c2(this.root.cell, getBlock());
                    }
                    return true;
                }
            }
            return false;
        }

        public void updateButtonState(boolean z10) {
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
            boolean z11 = animation != null && (animation.s() || this.imageReceiver.isAnimationRunning());
            if (fileExists() || (isAnimatedContent() && z11)) {
                DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
                if (isRealVideo() && !z11) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress3 = this.radialProgress;
                    if (radialProgress3 != null) {
                        radialProgress3.setIcon(0, false, z10);
                    }
                } else if (!isAnimatedContent() || z11 || allowAutoplay() || this.mediaForced) {
                    this.buttonState = -1;
                    RadialProgress2 radialProgress4 = this.radialProgress;
                    if (radialProgress4 != null) {
                        radialProgress4.setIcon(4, false, z10);
                    }
                } else {
                    this.buttonState = 2;
                    RadialProgress2 radialProgress5 = this.radialProgress;
                    if (radialProgress5 != null) {
                        radialProgress5.setIcon(8, false, z10);
                    }
                }
            } else {
                DownloadController.getInstance(this.root.currentAccount).addLoadingFileObserver(fileName, null, this);
                float fFloatValue = 0.0f;
                if (this.autoDownload || this.mediaForced || FileLoader.getInstance(this.root.currentAccount).isLoadingFile(fileName)) {
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                    fFloatValue = fileProgress != null ? fileProgress.floatValue() : 0.0f;
                    RadialProgress2 radialProgress6 = this.radialProgress;
                    if (radialProgress6 != null) {
                        radialProgress6.setIcon(3, true, z10);
                    }
                } else if (isRealVideo()) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress7 = this.radialProgress;
                    if (radialProgress7 != null) {
                        radialProgress7.setIcon(0, true, z10);
                    }
                } else {
                    this.buttonState = 0;
                    RadialProgress2 radialProgress8 = this.radialProgress;
                    if (radialProgress8 != null) {
                        radialProgress8.setIcon(2, true, z10);
                    }
                }
                RadialProgress2 radialProgress9 = this.radialProgress;
                if (radialProgress9 != null) {
                    radialProgress9.o(fFloatValue, false);
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
