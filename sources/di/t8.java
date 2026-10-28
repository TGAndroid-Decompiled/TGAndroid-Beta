package di;

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
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.r61;
public final class t8 extends View implements org.telegram.ui.ActionBar.p6 {
    public static Object I;
    public static Vector J;
    public int E;
    public CharSequence F;
    public int G;
    public ValueAnimator H;
    public final org.telegram.ui.ActionBar.u6 f9206a;
    public final TextPaint f9207b;
    public final PorterDuffColorFilter f9208c;
    public StaticLayout d;
    public float e;
    public org.telegram.ui.Components.y5 f9209f;
    public final ea0 h;
    public final Path f9210n;
    public final ArrayList f9211r;
    public final ArrayList f9212s;
    public boolean v;
    public boolean f9213w;
    public final Object f9214x;
    public float f9215y;

    public t8(Context context, int i10, TLObject tLObject, Object obj, boolean z10, ArrayList arrayList, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        Vector vector;
        this.G = -12;
        this.f9206a = u6Var;
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        int i11 = org.telegram.ui.ActionBar.y6.f23449i6;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), 0, 8);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(this, Z, null, N, u6Var);
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f9207b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        int i12 = org.telegram.ui.ActionBar.y6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        this.f9208c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), PorterDuff.Mode.SRC_IN);
        ea0 ea0Var = new ea0(u6Var);
        this.h = ea0Var;
        ea0Var.setCallback(this);
        ea0Var.f(org.telegram.ui.ActionBar.y6.o1(0.2f, -1), org.telegram.ui.ActionBar.y6.o1(0.05f, -1));
        Path path = new Path();
        this.f9210n = path;
        ea0Var.f27806y = path;
        ea0Var.k(4.0f);
        boolean[] zArr = {true};
        this.f9214x = obj;
        if (z10) {
            this.f9211r = new ArrayList();
            this.f9212s = new ArrayList();
            this.v = false;
            this.f9213w = false;
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.f22098id = tL_inputPhoto;
                tL_inputPhoto.f22047id = photo.f22052id;
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
                tL_inputStickeredMediaDocument.f22097id = tL_inputDocument;
                tL_inputDocument.f22040id = document.f22034id;
                tL_inputDocument.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocument.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
            }
            ag.p0 p0Var = new ag.p0(this, obj, arrayList, zArr, i10, 3);
            if (I == obj && (vector = J) != null) {
                zArr[0] = false;
                p0Var.run(vector, null);
                return;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getAttachedStickers, new q8(obj, i10, tL_messages_getAttachedStickers, p0Var, 0));
            return;
        }
        this.v = true;
        this.f9213w = false;
        ArrayList arrayList2 = new ArrayList();
        this.f9212s = arrayList2;
        arrayList2.addAll(arrayList);
        if (this.f9212s.size() == 1) {
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) this.f9212s.get(0), 0, false, new r8(this, 0));
            return;
        }
        set(this.f9212s.size());
        d(false);
    }

    public static void a(t8 t8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        int i11;
        int size;
        if (!(tLObject instanceof Vector)) {
            return;
        }
        Vector vector = (Vector) tLObject;
        I = obj;
        J = vector;
        for (int i12 = 0; i12 < vector.objects.size(); i12++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i12);
            t8Var.f9211r.add(stickerSetCovered);
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            if (stickerSet != null) {
                t8Var.f9212s.add(MediaDataController.getInputStickerSet(stickerSet));
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                if (stickerSet2.emojis) {
                    t8Var.v = true;
                } else if (!stickerSet2.masks) {
                    t8Var.f9213w = true;
                }
            }
        }
        if (arrayList != null) {
            i11 = arrayList.size();
        } else {
            i11 = 0;
        }
        ArrayList arrayList2 = t8Var.f9211r;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        int i13 = i11 + size;
        if (t8Var.f9212s != null && arrayList != null && !arrayList.isEmpty()) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i14);
                long j10 = inputStickerSet.f22048id;
                int i15 = 0;
                while (true) {
                    if (i15 < t8Var.f9212s.size()) {
                        if (((TLRPC.InputStickerSet) t8Var.f9212s.get(i15)).f22048id == j10) {
                            break;
                        }
                        i15++;
                    } else {
                        t8Var.f9212s.add(inputStickerSet);
                        break;
                    }
                }
            }
            t8Var.v = true;
        }
        if (i13 == 1) {
            if (t8Var.f9211r.size() >= 1) {
                t8Var.set((TLRPC.StickerSetCovered) t8Var.f9211r.get(0));
            } else if (arrayList != null && arrayList.size() >= 1) {
                zArr[0] = false;
                MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) arrayList.get(0), 0, false, new r8(t8Var, 1));
                return;
            } else {
                t8Var.set(0);
            }
        } else {
            t8Var.set(i13);
        }
        t8Var.d(zArr[0]);
    }

    public static void b(t8 t8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        t8Var.set(tL_messages_stickerSet);
        t8Var.d(false);
    }

    public static void c(t8 t8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        t8Var.set(tL_messages_stickerSet);
        t8Var.d(true);
    }

    private void set(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        CharSequence charSequence;
        String string;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new p10(org.telegram.ui.ActionBar.y6.gc, this.h.f27786a), 0, spannableString.length(), 33);
        spannableString.setSpan(new r61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                document = null;
                break;
            } else if (arrayList.get(i10).f22034id == tL_messages_stickerSet.set.thumb_document_id) {
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
            spannableString.setSpan(new org.telegram.ui.Components.c6(document, this.f9207b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        if (z10 && this.f9213w) {
            string = LocaleController.getString(R.string.StoryContainsStickersEmojiFrom);
        } else if (z10) {
            string = LocaleController.getString(R.string.StoryContainsEmojiFrom);
        } else {
            string = LocaleController.getString(R.string.StoryContainsStickersFrom);
        }
        setText(AndroidUtilities.replaceCharSequence("%s", string, charSequence));
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z11 = false;
        if (z10) {
            this.H = ValueAnimator.ofFloat(this.f9215y, 1.0f);
            if (this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > AndroidUtilities.dp(3.0f)) {
                z11 = true;
            }
            this.H.addUpdateListener(new bh.a0(1, this, z11));
            this.H.setInterpolator(ds.h);
            this.H.setStartDelay(150L);
            this.H.setDuration(400L);
            this.H.start();
            return;
        }
        this.f9215y = 1.0f;
        invalidate();
        post(new s8(this, 0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f9215y;
        if (f7 < 1.0f) {
            ea0 ea0Var = this.h;
            ea0Var.setAlpha((int) ((1.0f - f7) * 255.0f));
            Path path = this.f9210n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            int paddingTop2 = getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, AndroidUtilities.dp(12.0f) + paddingTop2, direction);
            path.addRect(getPaddingLeft(), AndroidUtilities.dp(16.0f) + getPaddingTop(), (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), AndroidUtilities.dp(28.0f) + getPaddingTop(), direction);
            ea0Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            float f10 = 0.0f;
            if (this.f9215y > 0.0f) {
                canvas.save();
                float paddingLeft2 = getPaddingLeft();
                if (!LocaleController.isRTL) {
                    f10 = this.e;
                }
                canvas.translate(paddingLeft2 - f10, getPaddingTop());
                this.f9207b.setAlpha((int) (this.f9215y * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.c6.drawAnimatedEmojis(canvas, this.d, this.f9209f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.f9215y, this.f9208c);
                canvas.restore();
            }
        }
    }

    public aw getAlert() {
        if (this.f9212s == null) {
            int i10 = -this.G;
            this.G = i10;
            AndroidUtilities.shakeViewSpring(this, i10);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            return null;
        }
        return new aw(null, getContext(), this.f9206a, this.f9212s);
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
        int paddingBottom = getPaddingBottom() + AndroidUtilities.lerp(dp, height, this.f9215y) + paddingTop;
        if (z10) {
            minimumWidth = View.MeasureSpec.getSize(i10);
        } else {
            minimumWidth = getMinimumWidth();
        }
        setMeasuredDimension(minimumWidth, paddingBottom);
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        if (z10) {
            CharSequence charSequence = this.F;
            if (charSequence != null || (this.d != null && this.E != size)) {
                if (charSequence == null) {
                    charSequence = this.d.getText();
                }
                setText(charSequence);
                this.F = null;
                this.E = size;
            }
        }
    }

    public void setText(CharSequence charSequence) {
        float f7;
        if (getMeasuredWidth() <= 0) {
            this.F = charSequence;
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth <= 0) {
            this.F = charSequence;
            return;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f9207b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = this.d.getLineLeft(0);
        } else {
            f7 = 0.0f;
        }
        this.e = f7;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f9209f = org.telegram.ui.Components.c6.update(0, this, this.f9209f, this.d);
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.f9207b;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, this.f9206a));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
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
        spannableString.setSpan(new p10(org.telegram.ui.ActionBar.y6.gc, this.h.f27786a), 0, spannableString.length(), 33);
        spannableString.setSpan(new r61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10).f22034id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i10);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.c6(document, this.f9207b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        if (z10 && this.f9213w) {
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
        ea0 ea0Var = this.h;
        if (z10 && this.f9213w) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickersEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.gc, ea0Var.f27786a), null));
        } else if (z10) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.gc, ea0Var.f27786a), null));
        } else {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickers", i10, new Object[0]), 0, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.gc, ea0Var.f27786a), null));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
