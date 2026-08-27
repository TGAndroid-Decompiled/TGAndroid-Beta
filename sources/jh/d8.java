package jh;

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
import hh.y9;
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
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.t80;

public final class d8 extends View {
    public static Object E;
    public static Vector F;
    public int A;
    public CharSequence B;
    public int C;
    public ValueAnimator D;

    public final org.telegram.ui.ActionBar.c6 f13200a;

    public final TextPaint f13201b;

    public final PorterDuffColorFilter f13202c;
    public StaticLayout d;

    public float f13203e;

    public org.telegram.ui.Components.p5 f13204f;
    public final t80 h;

    public final Path f13205n;

    public final ArrayList f13206r;

    public final ArrayList f13207s;
    public boolean v;

    public boolean f13208w;

    public final Object f13209x;

    public float f13210y;

    public d8(Context context, int i10, TLObject tLObject, Object obj, boolean z10, ArrayList arrayList, org.telegram.ui.ActionBar.c6 c6Var) {
        Vector vector;
        super(context);
        this.C = -12;
        this.f13200a = c6Var;
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 0, 8));
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f13201b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        this.f13202c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.SRC_IN);
        t80 t80Var = new t80(c6Var);
        this.h = t80Var;
        t80Var.setCallback(this);
        t80Var.e(org.telegram.ui.ActionBar.g6.l1(0.2f, -1), org.telegram.ui.ActionBar.g6.l1(0.05f, -1));
        Path path = new Path();
        this.f13205n = path;
        t80Var.f32711x = path;
        t80Var.j(4.0f);
        boolean[] zArr = {true};
        this.f13209x = obj;
        if (!z10) {
            this.v = true;
            this.f13208w = false;
            ArrayList arrayList2 = new ArrayList();
            this.f13207s = arrayList2;
            arrayList2.addAll(arrayList);
            if (this.f13207s.size() == 1) {
                MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) this.f13207s.get(0), 0, false, new c8(this, 0));
                return;
            } else {
                set(this.f13207s.size());
                d(false);
                return;
            }
        }
        this.f13206r = new ArrayList();
        this.f13207s = new ArrayList();
        this.v = false;
        this.f13208w = false;
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
        gf.j0 j0Var = new gf.j0(this, obj, arrayList, zArr, i10, 3);
        if (E != obj || (vector = F) == null) {
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getAttachedStickers, new b8(obj, i10, tL_messages_getAttachedStickers, j0Var));
        } else {
            zArr[0] = false;
            j0Var.run(vector, null);
        }
    }

    public static void a(d8 d8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            E = obj;
            F = vector;
            for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i11);
                d8Var.f13206r.add(stickerSetCovered);
                TLRPC.StickerSet stickerSet = stickerSetCovered.set;
                if (stickerSet != null) {
                    d8Var.f13207s.add(MediaDataController.getInputStickerSet(stickerSet));
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    if (stickerSet2.emojis) {
                        d8Var.v = true;
                    } else if (!stickerSet2.masks) {
                        d8Var.f13208w = true;
                    }
                }
            }
            int size = arrayList != null ? arrayList.size() : 0;
            ArrayList arrayList2 = d8Var.f13206r;
            int size2 = size + (arrayList2 == null ? 0 : arrayList2.size());
            if (d8Var.f13207s != null && arrayList != null && !arrayList.isEmpty()) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i12);
                    long j10 = inputStickerSet.f22400id;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= d8Var.f13207s.size()) {
                            d8Var.f13207s.add(inputStickerSet);
                            break;
                        } else if (((TLRPC.InputStickerSet) d8Var.f13207s.get(i13)).f22400id == j10) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                d8Var.v = true;
            }
            if (size2 != 1) {
                d8Var.set(size2);
            } else if (d8Var.f13206r.size() >= 1) {
                d8Var.set((TLRPC.StickerSetCovered) d8Var.f13206r.get(0));
            } else {
                if (arrayList != null && arrayList.size() >= 1) {
                    zArr[0] = false;
                    MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) arrayList.get(0), 0, false, new c8(d8Var, 1));
                    return;
                }
                d8Var.set(0);
            }
            d8Var.d(zArr[0]);
        }
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
        SpannableString spannableStringSubSequence;
        String string;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, this.h.f32691a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new k41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                document = null;
                break;
            } else {
                if (arrayList.get(i10).f22386id == tL_messages_stickerSet.set.thumb_document_id) {
                    document = arrayList.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (document == null && !arrayList.isEmpty()) {
            document = arrayList.get(0);
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.t5(document, this.f13201b.getFontMetricsInt()), 0, 1, 33);
            spannableStringSubSequence = spannableString;
        } else {
            spannableStringSubSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        if (z10 && this.f13208w) {
            string = LocaleController.getString(R.string.StoryContainsStickersEmojiFrom);
        } else {
            string = z10 ? LocaleController.getString(R.string.StoryContainsEmojiFrom) : LocaleController.getString(R.string.StoryContainsStickersFrom);
        }
        setText(AndroidUtilities.replaceCharSequence("%s", string, spannableStringSubSequence));
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            this.f13210y = 1.0f;
            invalidate();
            post(new y9(this, 24));
            return;
        }
        int i10 = 1;
        this.D = ValueAnimator.ofFloat(this.f13210y, 1.0f);
        this.D.addUpdateListener(new ig.y(i10, this, this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > AndroidUtilities.dp(3.0f)));
        this.D.setInterpolator(er.h);
        this.D.setStartDelay(150L);
        this.D.setDuration(400L);
        this.D.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f13210y;
        if (f10 < 1.0f) {
            t80 t80Var = this.h;
            t80Var.setAlpha((int) ((1.0f - f10) * 255.0f));
            Path path = this.f13205n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            float fDp = AndroidUtilities.dp(12.0f) + getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, fDp, direction);
            path.addRect(getPaddingLeft(), AndroidUtilities.dp(16.0f) + getPaddingTop(), (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), AndroidUtilities.dp(28.0f) + getPaddingTop(), direction);
            t80Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            if (this.f13210y > 0.0f) {
                canvas.save();
                canvas.translate(getPaddingLeft() - (LocaleController.isRTL ? 0.0f : this.f13203e), getPaddingTop());
                this.f13201b.setAlpha((int) (this.f13210y * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.d, this.f13204f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.f13210y, this.f13202c);
                canvas.restore();
            }
        }
    }

    public cv getAlert() {
        if (this.f13207s != null) {
            return new cv(null, getContext(), this.f13200a, this.f13207s);
        }
        int i10 = -this.C;
        this.C = i10;
        AndroidUtilities.shakeViewSpring(this, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = View.MeasureSpec.getMode(i10) == 1073741824;
        int paddingTop = getPaddingTop();
        int iDp = AndroidUtilities.dp(29.0f);
        StaticLayout staticLayout = this.d;
        setMeasuredDimension(z10 ? View.MeasureSpec.getSize(i10) : getMinimumWidth(), getPaddingBottom() + AndroidUtilities.lerp(iDp, staticLayout == null ? AndroidUtilities.dp(29.0f) : staticLayout.getHeight(), this.f13210y) + paddingTop);
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        if (z10) {
            CharSequence text = this.B;
            if (text == null && (this.d == null || this.A == size)) {
                return;
            }
            if (text == null) {
                text = this.d.getText();
            }
            setText(text);
            this.B = null;
            this.A = size;
        }
    }

    public void setText(CharSequence charSequence) {
        if (getMeasuredWidth() <= 0) {
            this.B = charSequence;
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth <= 0) {
            this.B = charSequence;
            return;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f13201b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        this.f13203e = staticLayout.getLineCount() > 0 ? this.d.getLineLeft(0) : 0.0f;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f13204f = org.telegram.ui.Components.t5.update(0, this, this.f13204f, this.d);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.h || super.verifyDrawable(drawable);
    }

    private void set(TLRPC.StickerSetCovered stickerSetCovered) {
        SpannableString spannableStringSubSequence;
        String string;
        SpannableString spannableString = new SpannableString("x " + stickerSetCovered.set.title);
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, this.h.f32691a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new k41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10).f22386id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i10);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.t5(document, this.f13201b.getFontMetricsInt()), 0, 1, 33);
            spannableStringSubSequence = spannableString;
        } else {
            spannableStringSubSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        if (z10 && this.f13208w) {
            string = LocaleController.getString(R.string.StoryContainsStickersEmojiFrom);
        } else if (z10) {
            string = LocaleController.getString(R.string.StoryContainsEmojiFrom);
        } else {
            string = LocaleController.getString(R.string.StoryContainsStickersFrom);
        }
        setText(AndroidUtilities.replaceCharSequence("%s", string, spannableStringSubSequence));
    }

    private void set(int i10) {
        boolean z10 = this.v;
        t80 t80Var = this.h;
        if (z10 && this.f13208w) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickersEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, t80Var.f32691a), null));
        } else if (z10) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, t80Var.f32691a), null));
        } else {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickers", i10, new Object[0]), 0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, t80Var.f32691a), null));
        }
    }
}
