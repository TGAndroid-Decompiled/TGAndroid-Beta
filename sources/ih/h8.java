package ih;

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
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.p80;
public final class h8 extends View {
    public static Object E;
    public static Vector F;
    public int A;
    public CharSequence B;
    public int C;
    public ValueAnimator D;
    public final org.telegram.ui.ActionBar.b6 f11513a;
    public final TextPaint f11514b;
    public final PorterDuffColorFilter f11515c;
    public StaticLayout d;
    public float f11516e;
    public org.telegram.ui.Components.p5 f11517f;
    public final p80 h;
    public final Path f11518n;
    public final ArrayList f11519r;
    public final ArrayList f11520s;
    public boolean v;
    public boolean f11521w;
    public final Object f11522x;
    public float f11523y;

    public h8(Context context, int i9, TLObject tLObject, Object obj, boolean z10, ArrayList arrayList, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        Vector vector;
        this.C = -12;
        this.f11513a = b6Var;
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 0, 8));
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f11514b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.f6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        this.f11515c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.SRC_IN);
        p80 p80Var = new p80(b6Var);
        this.h = p80Var;
        p80Var.setCallback(this);
        p80Var.e(org.telegram.ui.ActionBar.f6.l1(0.2f, -1), org.telegram.ui.ActionBar.f6.l1(0.05f, -1));
        Path path = new Path();
        this.f11518n = path;
        p80Var.f31591x = path;
        p80Var.j(4.0f);
        boolean[] zArr = {true};
        this.f11522x = obj;
        if (z10) {
            this.f11519r = new ArrayList();
            this.f11520s = new ArrayList();
            this.v = false;
            this.f11521w = false;
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.f22450id = tL_inputPhoto;
                tL_inputPhoto.f22399id = photo.f22404id;
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
                tL_inputStickeredMediaDocument.f22449id = tL_inputDocument;
                tL_inputDocument.f22392id = document.f22386id;
                tL_inputDocument.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocument.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
            }
            ff.j0 j0Var = new ff.j0(this, obj, arrayList, zArr, i9, 3);
            if (E == obj && (vector = F) != null) {
                zArr[0] = false;
                j0Var.run(vector, null);
                return;
            }
            ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getAttachedStickers, new f8(obj, i9, tL_messages_getAttachedStickers, j0Var));
            return;
        }
        this.v = true;
        this.f11521w = false;
        ArrayList arrayList2 = new ArrayList();
        this.f11520s = arrayList2;
        arrayList2.addAll(arrayList);
        if (this.f11520s.size() == 1) {
            MediaDataController.getInstance(i9).getStickerSet((TLRPC.InputStickerSet) this.f11520s.get(0), 0, false, new g8(this, 0));
            return;
        }
        set(this.f11520s.size());
        d(false);
    }

    public static void a(h8 h8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i9) {
        int i10;
        int size;
        if (!(tLObject instanceof Vector)) {
            return;
        }
        Vector vector = (Vector) tLObject;
        E = obj;
        F = vector;
        for (int i11 = 0; i11 < vector.objects.size(); i11++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i11);
            h8Var.f11519r.add(stickerSetCovered);
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            if (stickerSet != null) {
                h8Var.f11520s.add(MediaDataController.getInputStickerSet(stickerSet));
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                if (stickerSet2.emojis) {
                    h8Var.v = true;
                } else if (!stickerSet2.masks) {
                    h8Var.f11521w = true;
                }
            }
        }
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        ArrayList arrayList2 = h8Var.f11519r;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        int i12 = i10 + size;
        if (h8Var.f11520s != null && arrayList != null && !arrayList.isEmpty()) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i13);
                long j10 = inputStickerSet.f22400id;
                int i14 = 0;
                while (true) {
                    if (i14 < h8Var.f11520s.size()) {
                        if (((TLRPC.InputStickerSet) h8Var.f11520s.get(i14)).f22400id == j10) {
                            break;
                        }
                        i14++;
                    } else {
                        h8Var.f11520s.add(inputStickerSet);
                        break;
                    }
                }
            }
            h8Var.v = true;
        }
        if (i12 == 1) {
            if (h8Var.f11519r.size() >= 1) {
                h8Var.set((TLRPC.StickerSetCovered) h8Var.f11519r.get(0));
            } else if (arrayList != null && arrayList.size() >= 1) {
                zArr[0] = false;
                MediaDataController.getInstance(i9).getStickerSet((TLRPC.InputStickerSet) arrayList.get(0), 0, false, new g8(h8Var, 1));
                return;
            } else {
                h8Var.set(0);
            }
        } else {
            h8Var.set(i12);
        }
        h8Var.d(zArr[0]);
    }

    public static void b(h8 h8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        h8Var.set(tL_messages_stickerSet);
        h8Var.d(false);
    }

    public static void c(h8 h8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        h8Var.set(tL_messages_stickerSet);
        h8Var.d(true);
    }

    private void set(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        CharSequence charSequence;
        String string;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, this.h.f31571a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new i41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i9 = 0;
        while (true) {
            if (i9 >= arrayList.size()) {
                document = null;
                break;
            } else if (arrayList.get(i9).f22386id == tL_messages_stickerSet.set.thumb_document_id) {
                document = arrayList.get(i9);
                break;
            } else {
                i9++;
            }
        }
        if (document == null && !arrayList.isEmpty()) {
            document = arrayList.get(0);
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.t5(document, this.f11514b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        if (z10 && this.f11521w) {
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
            this.D = ValueAnimator.ofFloat(this.f11523y, 1.0f);
            this.D.addUpdateListener(new hg.y(1, this, (this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > AndroidUtilities.dp(3.0f)) ? true : true));
            this.D.setInterpolator(gr.h);
            this.D.setStartDelay(150L);
            this.D.setDuration(400L);
            this.D.start();
            return;
        }
        this.f11523y = 1.0f;
        invalidate();
        post(new g(this, 17));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f11523y;
        if (f10 < 1.0f) {
            p80 p80Var = this.h;
            p80Var.setAlpha((int) ((1.0f - f10) * 255.0f));
            Path path = this.f11518n;
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
            p80Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            float f11 = 0.0f;
            if (this.f11523y > 0.0f) {
                canvas.save();
                float paddingLeft3 = getPaddingLeft();
                if (!LocaleController.isRTL) {
                    f11 = this.f11516e;
                }
                canvas.translate(paddingLeft3 - f11, getPaddingTop());
                this.f11514b.setAlpha((int) (this.f11523y * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.d, this.f11517f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.f11523y, this.f11515c);
                canvas.restore();
            }
        }
    }

    public dv getAlert() {
        if (this.f11520s == null) {
            int i9 = -this.C;
            this.C = i9;
            AndroidUtilities.shakeViewSpring(this, i9);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            return null;
        }
        return new dv(null, getContext(), this.f11513a, this.f11520s);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        int height;
        int minimumWidth;
        if (View.MeasureSpec.getMode(i9) == 1073741824) {
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
        int paddingBottom = getPaddingBottom() + AndroidUtilities.lerp(dp, height, this.f11523y) + paddingTop;
        if (z10) {
            minimumWidth = View.MeasureSpec.getSize(i9);
        } else {
            minimumWidth = getMinimumWidth();
        }
        setMeasuredDimension(minimumWidth, paddingBottom);
        int size = (View.MeasureSpec.getSize(i9) - getPaddingLeft()) - getPaddingRight();
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
        float f10;
        if (getMeasuredWidth() <= 0) {
            this.B = charSequence;
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth <= 0) {
            this.B = charSequence;
            return;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f11514b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = this.d.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f11516e = f10;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f11517f = org.telegram.ui.Components.t5.update(0, this, this.f11517f, this.d);
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
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, this.h.f31571a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new i41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (arrayList.get(i9).f22386id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i9);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.t5(document, this.f11514b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        if (z10 && this.f11521w) {
            string = LocaleController.getString(R.string.StoryContainsStickersEmojiFrom);
        } else if (z10) {
            string = LocaleController.getString(R.string.StoryContainsEmojiFrom);
        } else {
            string = LocaleController.getString(R.string.StoryContainsStickersFrom);
        }
        setText(AndroidUtilities.replaceCharSequence("%s", string, charSequence));
    }

    private void set(int i9) {
        boolean z10 = this.v;
        p80 p80Var = this.h;
        if (z10 && this.f11521w) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickersEmoji", i9, new Object[0]), 0, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, p80Var.f31571a), null));
        } else if (z10) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsEmoji", i9, new Object[0]), 0, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, p80Var.f31571a), null));
        } else {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickers", i9, new Object[0]), 0, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, p80Var.f31571a), null));
        }
    }
}
