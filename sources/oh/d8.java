package oh;

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
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.pr;
public final class d8 extends View {
    public static Object F;
    public static Vector G;
    public int B;
    public CharSequence C;
    public int D;
    public ValueAnimator E;
    public final org.telegram.ui.ActionBar.g6 f16992a;
    public final TextPaint f16993b;
    public final PorterDuffColorFilter f16994c;
    public StaticLayout d;
    public float f16995e;
    public org.telegram.ui.Components.q5 f16996f;
    public final k90 h;
    public final Path f16997n;
    public final ArrayList f16998r;
    public final ArrayList f16999s;
    public boolean v;
    public boolean f17000w;
    public final Object f17001x;
    public float f17002y;

    public d8(Context context, int i10, TLObject tLObject, Object obj, boolean z4, ArrayList arrayList, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        Vector vector;
        this.D = -12;
        this.f16992a = g6Var;
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, g6Var), 0, 8));
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f16993b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        this.f16994c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), PorterDuff.Mode.SRC_IN);
        k90 k90Var = new k90(g6Var);
        this.h = k90Var;
        k90Var.setCallback(this);
        k90Var.e(org.telegram.ui.ActionBar.k6.l1(0.2f, -1), org.telegram.ui.ActionBar.k6.l1(0.05f, -1));
        Path path = new Path();
        this.f16997n = path;
        k90Var.f28370x = path;
        k90Var.j(4.0f);
        boolean[] zArr = {true};
        this.f17001x = obj;
        if (z4) {
            this.f16998r = new ArrayList();
            this.f16999s = new ArrayList();
            this.v = false;
            this.f17000w = false;
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.f20915id = tL_inputPhoto;
                tL_inputPhoto.f20864id = photo.f20869id;
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
                tL_inputStickeredMediaDocument.f20914id = tL_inputDocument;
                tL_inputDocument.f20857id = document.f20851id;
                tL_inputDocument.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocument.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
            }
            lf.i0 i0Var = new lf.i0(this, obj, arrayList, zArr, i10, 3);
            if (F == obj && (vector = G) != null) {
                zArr[0] = false;
                i0Var.run(vector, null);
                return;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getAttachedStickers, new b8(obj, i10, tL_messages_getAttachedStickers, i0Var));
            return;
        }
        this.v = true;
        this.f17000w = false;
        ArrayList arrayList2 = new ArrayList();
        this.f16999s = arrayList2;
        arrayList2.addAll(arrayList);
        if (this.f16999s.size() == 1) {
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) this.f16999s.get(0), 0, false, new c8(this, 0));
            return;
        }
        set(this.f16999s.size());
        d(false);
    }

    public static void a(d8 d8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        int i11;
        int size;
        if (!(tLObject instanceof Vector)) {
            return;
        }
        Vector vector = (Vector) tLObject;
        F = obj;
        G = vector;
        for (int i12 = 0; i12 < vector.objects.size(); i12++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i12);
            d8Var.f16998r.add(stickerSetCovered);
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            if (stickerSet != null) {
                d8Var.f16999s.add(MediaDataController.getInputStickerSet(stickerSet));
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                if (stickerSet2.emojis) {
                    d8Var.v = true;
                } else if (!stickerSet2.masks) {
                    d8Var.f17000w = true;
                }
            }
        }
        if (arrayList != null) {
            i11 = arrayList.size();
        } else {
            i11 = 0;
        }
        ArrayList arrayList2 = d8Var.f16998r;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        int i13 = i11 + size;
        if (d8Var.f16999s != null && arrayList != null && !arrayList.isEmpty()) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i14);
                long j10 = inputStickerSet.f20865id;
                int i15 = 0;
                while (true) {
                    if (i15 < d8Var.f16999s.size()) {
                        if (((TLRPC.InputStickerSet) d8Var.f16999s.get(i15)).f20865id == j10) {
                            break;
                        }
                        i15++;
                    } else {
                        d8Var.f16999s.add(inputStickerSet);
                        break;
                    }
                }
            }
            d8Var.v = true;
        }
        if (i13 == 1) {
            if (d8Var.f16998r.size() >= 1) {
                d8Var.set((TLRPC.StickerSetCovered) d8Var.f16998r.get(0));
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
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21722gc, this.h.f28350a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                document = null;
                break;
            } else if (arrayList.get(i10).f20851id == tL_messages_stickerSet.set.thumb_document_id) {
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
            spannableString.setSpan(new org.telegram.ui.Components.u5(document, this.f16993b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z4 = this.v;
        if (z4 && this.f17000w) {
            string = LocaleController.getString(R.string.StoryContainsStickersEmojiFrom);
        } else if (z4) {
            string = LocaleController.getString(R.string.StoryContainsEmojiFrom);
        } else {
            string = LocaleController.getString(R.string.StoryContainsStickersFrom);
        }
        setText(AndroidUtilities.replaceCharSequence("%s", string, charSequence));
    }

    public final void d(boolean z4) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z4) {
            boolean z10 = false;
            this.E = ValueAnimator.ofFloat(this.f17002y, 1.0f);
            this.E.addUpdateListener(new eg.z0(2, this, (this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > AndroidUtilities.dp(3.0f)) ? true : true));
            this.E.setInterpolator(pr.h);
            this.E.setStartDelay(150L);
            this.E.setDuration(400L);
            this.E.start();
            return;
        }
        this.f17002y = 1.0f;
        invalidate();
        post(new t3(this, 11));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f17002y;
        if (f10 < 1.0f) {
            k90 k90Var = this.h;
            k90Var.setAlpha((int) ((1.0f - f10) * 255.0f));
            Path path = this.f16997n;
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
            k90Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            float f11 = 0.0f;
            if (this.f17002y > 0.0f) {
                canvas.save();
                float paddingLeft3 = getPaddingLeft();
                if (!LocaleController.isRTL) {
                    f11 = this.f16995e;
                }
                canvas.translate(paddingLeft3 - f11, getPaddingTop());
                this.f16993b.setAlpha((int) (this.f17002y * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.d, this.f16996f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.f17002y, this.f16994c);
                canvas.restore();
            }
        }
    }

    public ov getAlert() {
        if (this.f16999s == null) {
            int i10 = -this.D;
            this.D = i10;
            AndroidUtilities.shakeViewSpring(this, i10);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            return null;
        }
        return new ov(null, getContext(), this.f16992a, this.f16999s);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int height;
        int minimumWidth;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z4 = true;
        } else {
            z4 = false;
        }
        int paddingTop = getPaddingTop();
        int dp = AndroidUtilities.dp(29.0f);
        StaticLayout staticLayout = this.d;
        if (staticLayout == null) {
            height = AndroidUtilities.dp(29.0f);
        } else {
            height = staticLayout.getHeight();
        }
        int paddingBottom = getPaddingBottom() + AndroidUtilities.lerp(dp, height, this.f17002y) + paddingTop;
        if (z4) {
            minimumWidth = View.MeasureSpec.getSize(i10);
        } else {
            minimumWidth = getMinimumWidth();
        }
        setMeasuredDimension(minimumWidth, paddingBottom);
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        if (z4) {
            CharSequence charSequence = this.C;
            if (charSequence != null || (this.d != null && this.B != size)) {
                if (charSequence == null) {
                    charSequence = this.d.getText();
                }
                setText(charSequence);
                this.C = null;
                this.B = size;
            }
        }
    }

    public void setText(CharSequence charSequence) {
        float f10;
        if (getMeasuredWidth() <= 0) {
            this.C = charSequence;
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth <= 0) {
            this.C = charSequence;
            return;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f16993b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = this.d.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f16995e = f10;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f16996f = org.telegram.ui.Components.u5.update(0, this, this.f16996f, this.d);
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
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21722gc, this.h.f28350a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10).f20851id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i10);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.u5(document, this.f16993b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z4 = this.v;
        if (z4 && this.f17000w) {
            string = LocaleController.getString(R.string.StoryContainsStickersEmojiFrom);
        } else if (z4) {
            string = LocaleController.getString(R.string.StoryContainsEmojiFrom);
        } else {
            string = LocaleController.getString(R.string.StoryContainsStickersFrom);
        }
        setText(AndroidUtilities.replaceCharSequence("%s", string, charSequence));
    }

    private void set(int i10) {
        boolean z4 = this.v;
        k90 k90Var = this.h;
        if (z4 && this.f17000w) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickersEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21722gc, k90Var.f28350a), null));
        } else if (z4) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21722gc, k90Var.f28350a), null));
        } else {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickers", i10, new Object[0]), 0, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21722gc, k90Var.f28350a), null));
        }
    }
}
