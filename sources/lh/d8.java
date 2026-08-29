package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.t41;
public final class d8 extends View {
    public static Object E;
    public static Vector F;
    public int A;
    public CharSequence B;
    public int C;
    public ValueAnimator D;
    public final org.telegram.ui.ActionBar.c6 f15559a;
    public final TextPaint f15560b;
    public final PorterDuffColorFilter f15561c;
    public StaticLayout d;
    public float f15562e;
    public org.telegram.ui.Components.u5 f15563f;
    public final c90 h;
    public final Path f15564n;
    public final ArrayList f15565r;
    public final ArrayList f15566s;
    public boolean v;
    public boolean f15567w;
    public final Object f15568x;
    public float f15569y;

    public d8(Context context, int i10, TLObject tLObject, Object obj, boolean z10, ArrayList arrayList, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        Vector vector;
        this.C = -12;
        this.f15559a = c6Var;
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 0, 8));
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f15560b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        this.f15561c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.SRC_IN);
        c90 c90Var = new c90(c6Var);
        this.h = c90Var;
        c90Var.setCallback(this);
        c90Var.e(org.telegram.ui.ActionBar.g6.l1(0.2f, -1), org.telegram.ui.ActionBar.g6.l1(0.05f, -1));
        Path path = new Path();
        this.f15564n = path;
        c90Var.f27400x = path;
        c90Var.j(4.0f);
        boolean[] zArr = {true};
        this.f15568x = obj;
        if (z10) {
            this.f15565r = new ArrayList();
            this.f15566s = new ArrayList();
            this.v = false;
            this.f15567w = false;
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.f22462id = tL_inputPhoto;
                tL_inputPhoto.f22411id = photo.f22416id;
                tL_inputPhoto.access_hash = photo.access_hash;
                byte[] bArr = photo.file_reference;
                tL_inputPhoto.file_reference = bArr;
                if (bArr == null) {
                    tL_inputPhoto.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
            } else if (tLObject instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) tLObject;
                TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputStickeredMediaDocument.f22461id = tL_inputDocument;
                tL_inputDocument.f22404id = document.f22398id;
                tL_inputDocument.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocument.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
            }
            jf.i0 i0Var = new jf.i0(this, obj, arrayList, zArr, i10, 3);
            if (E == obj && (vector = F) != null) {
                zArr[0] = false;
                i0Var.run(vector, null);
                return;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getAttachedStickers, new b8(obj, i10, tL_messages_getAttachedStickers, i0Var));
            return;
        }
        this.v = true;
        this.f15567w = false;
        ArrayList arrayList2 = new ArrayList();
        this.f15566s = arrayList2;
        arrayList2.addAll(arrayList);
        if (this.f15566s.size() == 1) {
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) this.f15566s.get(0), 0, false, new c8(this, 0));
            return;
        }
        set(this.f15566s.size());
        d(false);
    }

    public static void a(d8 d8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        int i11;
        int size;
        if (!(tLObject instanceof Vector)) {
            return;
        }
        Vector vector = (Vector) tLObject;
        E = obj;
        F = vector;
        for (int i12 = 0; i12 < vector.objects.size(); i12++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i12);
            d8Var.f15565r.add(stickerSetCovered);
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            if (stickerSet != null) {
                d8Var.f15566s.add(MediaDataController.getInputStickerSet(stickerSet));
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                if (stickerSet2.emojis) {
                    d8Var.v = true;
                } else if (!stickerSet2.masks) {
                    d8Var.f15567w = true;
                }
            }
        }
        if (arrayList != null) {
            i11 = arrayList.size();
        } else {
            i11 = 0;
        }
        ArrayList arrayList2 = d8Var.f15565r;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        int i13 = i11 + size;
        if (d8Var.f15566s != null && arrayList != null && !arrayList.isEmpty()) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i14);
                long j10 = inputStickerSet.f22412id;
                int i15 = 0;
                while (true) {
                    if (i15 < d8Var.f15566s.size()) {
                        if (((TLRPC.InputStickerSet) d8Var.f15566s.get(i15)).f22412id == j10) {
                            break;
                        }
                        i15++;
                    } else {
                        d8Var.f15566s.add(inputStickerSet);
                        break;
                    }
                }
            }
            d8Var.v = true;
        }
        if (i13 == 1) {
            if (d8Var.f15565r.size() >= 1) {
                d8Var.set((TLRPC.StickerSetCovered) d8Var.f15565r.get(0));
            } else if (arrayList != null && arrayList.size() >= 1) {
                zArr[0] = false;
                MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) arrayList.get(0), 0, false, new c8(d8Var, 1));
                return;
            } else {
                d8Var.set(0);
            }
        } else {
            d8Var.set(i13);
        }
        d8Var.d(zArr[0]);
    }

    public static void b(d8 d8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        d8Var.set(tL_messages_stickerSet);
        d8Var.d(false);
    }

    public static void c(d8 d8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        d8Var.set(tL_messages_stickerSet);
        d8Var.d(true);
    }

    private void set(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        CharSequence charSequence;
        String string;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, this.h.f27380a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new t41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                document = null;
                break;
            } else if (arrayList.get(i10).f22398id == tL_messages_stickerSet.set.thumb_document_id) {
                document = arrayList.get(i10);
                break;
            } else {
                i10++;
            }
        }
        if (document == null && !arrayList.isEmpty()) {
            document = arrayList.get(0);
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.y5(document, this.f15560b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        if (z10 && this.f15567w) {
            string = LocaleController.getString(R.string.StoryContainsStickersEmojiFrom);
        } else if (z10) {
            string = LocaleController.getString(R.string.StoryContainsEmojiFrom);
        } else {
            string = LocaleController.getString(R.string.StoryContainsStickersFrom);
        }
        setText(AndroidUtilities.replaceCharSequence("%s", string, charSequence));
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            boolean z11 = false;
            this.D = ValueAnimator.ofFloat(this.f15569y, 1.0f);
            this.D.addUpdateListener(new bg.c1(2, this, (this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > AndroidUtilities.dp(3.0f)) ? true : true));
            this.D.setInterpolator(jr.h);
            this.D.setStartDelay(150L);
            this.D.setDuration(400L);
            this.D.start();
            return;
        }
        this.f15569y = 1.0f;
        invalidate();
        post(new m5(this, 8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f9 = this.f15569y;
        if (f9 < 1.0f) {
            c90 c90Var = this.h;
            c90Var.setAlpha((int) ((1.0f - f9) * 255.0f));
            Path path = this.f15564n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            int paddingTop2 = getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, AndroidUtilities.dp(12.0f) + paddingTop2, direction);
            float paddingLeft2 = getPaddingLeft();
            int paddingTop3 = getPaddingTop();
            path.addRect(paddingLeft2, AndroidUtilities.dp(16.0f) + paddingTop3, (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), AndroidUtilities.dp(28.0f) + getPaddingTop(), direction);
            c90Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            float f10 = 0.0f;
            if (this.f15569y > 0.0f) {
                canvas.save();
                float paddingLeft3 = getPaddingLeft();
                if (!LocaleController.isRTL) {
                    f10 = this.f15562e;
                }
                canvas.translate(paddingLeft3 - f10, getPaddingTop());
                this.f15560b.setAlpha((int) (this.f15569y * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.d, this.f15563f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.f15569y, this.f15561c);
                canvas.restore();
            }
        }
    }

    public jv getAlert() {
        if (this.f15566s == null) {
            int i10 = -this.C;
            this.C = i10;
            AndroidUtilities.shakeViewSpring(this, i10);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            return null;
        }
        return new jv(null, getContext(), this.f15559a, this.f15566s);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int height;
        int minimumWidth;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        int paddingTop = getPaddingTop();
        int dp = AndroidUtilities.dp(29.0f);
        StaticLayout staticLayout = this.d;
        if (staticLayout == null) {
            height = AndroidUtilities.dp(29.0f);
        } else {
            height = staticLayout.getHeight();
        }
        int paddingBottom = getPaddingBottom() + AndroidUtilities.lerp(dp, height, this.f15569y) + paddingTop;
        if (z10) {
            minimumWidth = View.MeasureSpec.getSize(i10);
        } else {
            minimumWidth = getMinimumWidth();
        }
        setMeasuredDimension(minimumWidth, paddingBottom);
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        if (z10) {
            CharSequence charSequence = this.B;
            if (charSequence != null || (this.d != null && this.A != size)) {
                if (charSequence == null) {
                    charSequence = this.d.getText();
                }
                setText(charSequence);
                this.B = null;
                this.A = size;
            }
        }
    }

    public void setText(CharSequence charSequence) {
        float f9;
        if (getMeasuredWidth() <= 0) {
            this.B = charSequence;
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth <= 0) {
            this.B = charSequence;
            return;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f15560b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f9 = this.d.getLineLeft(0);
        } else {
            f9 = 0.0f;
        }
        this.f15562e = f9;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f15563f = org.telegram.ui.Components.y5.update(0, this, this.f15563f, this.d);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.h && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    private void set(TLRPC.StickerSetCovered stickerSetCovered) {
        CharSequence charSequence;
        String string;
        SpannableString spannableString = new SpannableString("x " + stickerSetCovered.set.title);
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, this.h.f27380a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new t41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10).f22398id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i10);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.y5(document, this.f15560b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        if (z10 && this.f15567w) {
            string = LocaleController.getString(R.string.StoryContainsStickersEmojiFrom);
        } else if (z10) {
            string = LocaleController.getString(R.string.StoryContainsEmojiFrom);
        } else {
            string = LocaleController.getString(R.string.StoryContainsStickersFrom);
        }
        setText(AndroidUtilities.replaceCharSequence("%s", string, charSequence));
    }

    private void set(int i10) {
        boolean z10 = this.v;
        c90 c90Var = this.h;
        if (z10 && this.f15567w) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickersEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c90Var.f27380a), null));
        } else if (z10) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c90Var.f27380a), null));
        } else {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickers", i10, new Object[0]), 0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c90Var.f27380a), null));
        }
    }
}
