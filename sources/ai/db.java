package ai;

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
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.uv;
public final class db extends View {
    public static Object I;
    public static Vector J;
    public int E;
    public CharSequence F;
    public int G;
    public ValueAnimator H;
    public final org.telegram.ui.ActionBar.e6 f748a;
    public final TextPaint f749b;
    public final PorterDuffColorFilter f750c;
    public StaticLayout d;
    public float e;
    public org.telegram.ui.Components.v5 f751f;
    public final t90 h;
    public final Path f752n;
    public final ArrayList f753r;
    public final ArrayList f754s;
    public boolean v;
    public boolean f755w;
    public final Object f756x;
    public float f757y;

    public db(Context context, int i10, TLObject tLObject, Object obj, boolean z10, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Vector vector;
        this.G = -12;
        this.f748a = e6Var;
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19147i6, e6Var), 0, 8));
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f749b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        int i11 = org.telegram.ui.ActionBar.i6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        this.f750c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, e6Var), PorterDuff.Mode.SRC_IN);
        t90 t90Var = new t90(e6Var);
        this.h = t90Var;
        t90Var.setCallback(this);
        t90Var.e(org.telegram.ui.ActionBar.i6.l1(0.2f, -1), org.telegram.ui.ActionBar.i6.l1(0.05f, -1));
        Path path = new Path();
        this.f752n = path;
        t90Var.f28537x = path;
        t90Var.j(4.0f);
        boolean[] zArr = {true};
        this.f756x = obj;
        if (z10) {
            this.f753r = new ArrayList();
            this.f754s = new ArrayList();
            this.v = false;
            this.f755w = false;
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.f18399id = tL_inputPhoto;
                tL_inputPhoto.f18348id = photo.f18353id;
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
                tL_inputStickeredMediaDocument.f18398id = tL_inputDocument;
                tL_inputDocument.f18341id = document.f18335id;
                tL_inputDocument.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocument.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
            }
            ya yaVar = new ya(this, obj, arrayList, zArr, i10, 0);
            if (I == obj && (vector = J) != null) {
                zArr[0] = false;
                yaVar.run(vector, null);
                return;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getAttachedStickers, new za(obj, i10, tL_messages_getAttachedStickers, yaVar, 0));
            return;
        }
        this.v = true;
        this.f755w = false;
        ArrayList arrayList2 = new ArrayList();
        this.f754s = arrayList2;
        arrayList2.addAll(arrayList);
        if (this.f754s.size() == 1) {
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) this.f754s.get(0), 0, false, new ab(this, 0));
            return;
        }
        set(this.f754s.size());
        d(false);
    }

    public static void a(db dbVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
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
            dbVar.f753r.add(stickerSetCovered);
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            if (stickerSet != null) {
                dbVar.f754s.add(MediaDataController.getInputStickerSet(stickerSet));
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                if (stickerSet2.emojis) {
                    dbVar.v = true;
                } else if (!stickerSet2.masks) {
                    dbVar.f755w = true;
                }
            }
        }
        if (arrayList != null) {
            i11 = arrayList.size();
        } else {
            i11 = 0;
        }
        ArrayList arrayList2 = dbVar.f753r;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        int i13 = i11 + size;
        if (dbVar.f754s != null && arrayList != null && !arrayList.isEmpty()) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i14);
                long j3 = inputStickerSet.f18349id;
                int i15 = 0;
                while (true) {
                    if (i15 < dbVar.f754s.size()) {
                        if (((TLRPC.InputStickerSet) dbVar.f754s.get(i15)).f18349id == j3) {
                            break;
                        }
                        i15++;
                    } else {
                        dbVar.f754s.add(inputStickerSet);
                        break;
                    }
                }
            }
            dbVar.v = true;
        }
        if (i13 == 1) {
            if (dbVar.f753r.size() >= 1) {
                dbVar.set((TLRPC.StickerSetCovered) dbVar.f753r.get(0));
            } else if (arrayList != null && arrayList.size() >= 1) {
                zArr[0] = false;
                MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) arrayList.get(0), 0, false, new ab(dbVar, 1));
                return;
            } else {
                dbVar.set(0);
            }
        } else {
            dbVar.set(i13);
        }
        dbVar.d(zArr[0]);
    }

    public static void b(db dbVar, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        dbVar.set(tL_messages_stickerSet);
        dbVar.d(false);
    }

    public static void c(db dbVar, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        dbVar.set(tL_messages_stickerSet);
        dbVar.d(true);
    }

    private void set(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        CharSequence charSequence;
        String string;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, this.h.f28518a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new u51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                document = null;
                break;
            } else if (arrayList.get(i10).f18335id == tL_messages_stickerSet.set.thumb_document_id) {
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
            spannableString.setSpan(new org.telegram.ui.Components.z5(document, this.f749b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        if (z10 && this.f755w) {
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
        if (z10) {
            boolean z11 = true;
            this.H = ValueAnimator.ofFloat(this.f757y, 1.0f);
            if (this.d != null && Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) <= AndroidUtilities.dp(3.0f)) {
                z11 = false;
            }
            this.H.addUpdateListener(new bb(0, this, z11));
            this.H.setInterpolator(sr.h);
            this.H.setStartDelay(150L);
            this.H.setDuration(400L);
            this.H.start();
            return;
        }
        this.f757y = 1.0f;
        invalidate();
        post(new a3.d(this, 19));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f757y;
        if (f7 < 1.0f) {
            t90 t90Var = this.h;
            t90Var.setAlpha((int) ((1.0f - f7) * 255.0f));
            Path path = this.f752n;
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
            t90Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            float f10 = 0.0f;
            if (this.f757y > 0.0f) {
                canvas.save();
                float paddingLeft3 = getPaddingLeft();
                if (!LocaleController.isRTL) {
                    f10 = this.e;
                }
                canvas.translate(paddingLeft3 - f10, getPaddingTop());
                this.f749b.setAlpha((int) (this.f757y * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.d, this.f751f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.f757y, this.f750c);
                canvas.restore();
            }
        }
    }

    public uv getAlert() {
        if (this.f754s == null) {
            int i10 = -this.G;
            this.G = i10;
            AndroidUtilities.shakeViewSpring(this, i10);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            return null;
        }
        return new uv(null, getContext(), this.f748a, this.f754s);
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
        int paddingBottom = getPaddingBottom() + AndroidUtilities.lerp(dp, height, this.f757y) + paddingTop;
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
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f749b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
        this.f751f = org.telegram.ui.Components.z5.update(0, this, this.f751f, this.d);
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
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, this.h.f28518a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new u51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10).f18335id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i10);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.z5(document, this.f749b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        if (z10 && this.f755w) {
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
        t90 t90Var = this.h;
        if (z10 && this.f755w) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickersEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, t90Var.f28518a), null));
        } else if (z10) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, t90Var.f28518a), null));
        } else {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickers", i10, new Object[0]), 0, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, t90Var.f28518a), null));
        }
    }
}
