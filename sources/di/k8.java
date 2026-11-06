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
import org.telegram.messenger.hd;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.t31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xz;
public final class k8 extends View implements org.telegram.ui.ActionBar.a6 {
    public static Object I;
    public static Vector J;
    public float D;
    public int E;
    public CharSequence F;
    public int G;
    public ValueAnimator H;
    public final org.telegram.ui.ActionBar.f6 f9317a;
    public final TextPaint f9318b;
    public final PorterDuffColorFilter f9319c;
    public StaticLayout d;
    public float f9320e;
    public org.telegram.ui.Components.n5 f9321f;
    public final a80 h;
    public final Path f9322n;
    public final ArrayList f9323r;
    public final ArrayList f9324s;
    public boolean f9325w;
    public boolean f9326x;
    public final Object f9327y;

    public k8(Context context, int i7, TLObject tLObject, Object obj, boolean z9, ArrayList arrayList, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Vector vector;
        this.G = -12;
        this.f9317a = f6Var;
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        int i10 = org.telegram.ui.ActionBar.k6.f27940i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), 0, 8);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, f6Var);
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f9318b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
        this.f9319c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), PorterDuff.Mode.SRC_IN);
        a80 a80Var = new a80(f6Var);
        this.h = a80Var;
        a80Var.setCallback(this);
        a80Var.f(org.telegram.ui.ActionBar.k6.r1(0.2f, -1), org.telegram.ui.ActionBar.k6.r1(0.05f, -1));
        Path path = new Path();
        this.f9322n = path;
        a80Var.f31747y = path;
        a80Var.k(4.0f);
        boolean[] zArr = {true};
        this.f9327y = obj;
        if (z9) {
            this.f9323r = new ArrayList();
            this.f9324s = new ArrayList();
            this.f9325w = false;
            this.f9326x = false;
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.f27022id = tL_inputPhoto;
                tL_inputPhoto.f26971id = photo.f26976id;
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
                tL_inputStickeredMediaDocument.f27021id = tL_inputDocument;
                tL_inputDocument.f26964id = document.f26958id;
                tL_inputDocument.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocument.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
            }
            bg.k0 k0Var = new bg.k0(this, obj, arrayList, zArr, i7, 3);
            if (I == obj && (vector = J) != null) {
                zArr[0] = false;
                k0Var.run(vector, null);
                return;
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getAttachedStickers, new i8(obj, i7, tL_messages_getAttachedStickers, k0Var, 0));
            return;
        }
        this.f9325w = true;
        this.f9326x = false;
        ArrayList arrayList2 = new ArrayList();
        this.f9324s = arrayList2;
        arrayList2.addAll(arrayList);
        if (this.f9324s.size() == 1) {
            ui.b0(i7).l0((TLRPC.InputStickerSet) this.f9324s.get(0), 0, false, false, new j8(this, 0));
            return;
        }
        set(this.f9324s.size());
        d(false);
    }

    public static void a(k8 k8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i7) {
        int i10;
        int size;
        if (!(tLObject instanceof Vector)) {
            return;
        }
        Vector vector = (Vector) tLObject;
        I = obj;
        J = vector;
        for (int i11 = 0; i11 < vector.objects.size(); i11++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i11);
            k8Var.f9323r.add(stickerSetCovered);
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            if (stickerSet != null) {
                k8Var.f9324s.add(ui.Z(stickerSet));
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                if (stickerSet2.emojis) {
                    k8Var.f9325w = true;
                } else if (!stickerSet2.masks) {
                    k8Var.f9326x = true;
                }
            }
        }
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        ArrayList arrayList2 = k8Var.f9323r;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        int i12 = i10 + size;
        if (k8Var.f9324s != null && arrayList != null && !arrayList.isEmpty()) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i13);
                long j3 = inputStickerSet.f26972id;
                int i14 = 0;
                while (true) {
                    if (i14 < k8Var.f9324s.size()) {
                        if (((TLRPC.InputStickerSet) k8Var.f9324s.get(i14)).f26972id == j3) {
                            break;
                        }
                        i14++;
                    } else {
                        k8Var.f9324s.add(inputStickerSet);
                        break;
                    }
                }
            }
            k8Var.f9325w = true;
        }
        if (i12 == 1) {
            if (k8Var.f9323r.size() >= 1) {
                k8Var.set((TLRPC.StickerSetCovered) k8Var.f9323r.get(0));
            } else if (arrayList != null && arrayList.size() >= 1) {
                zArr[0] = false;
                ui.b0(i7).l0((TLRPC.InputStickerSet) arrayList.get(0), 0, false, false, new j8(k8Var, 1));
                return;
            } else {
                k8Var.set(0);
            }
        } else {
            k8Var.set(i12);
        }
        k8Var.d(zArr[0]);
    }

    public static void b(k8 k8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        k8Var.set(tL_messages_stickerSet);
        k8Var.d(false);
    }

    public static void c(k8 k8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        k8Var.set(tL_messages_stickerSet);
        k8Var.d(true);
    }

    private void set(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        CharSequence charSequence;
        String M0;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new xz(org.telegram.ui.ActionBar.k6.Uc, this.h.f31726a), 0, spannableString.length(), 33);
        spannableString.setSpan(new t31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                document = null;
                break;
            } else if (arrayList.get(i7).f26958id == tL_messages_stickerSet.set.thumb_document_id) {
                document = arrayList.get(i7);
                break;
            } else {
                i7++;
            }
        }
        if (document == null && !arrayList.isEmpty()) {
            document = arrayList.get(0);
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.r5(document, this.f9318b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z9 = this.f9325w;
        if (z9 && this.f9326x) {
            M0 = hd.M0(2131744696, null);
        } else if (z9) {
            M0 = hd.M0(2131744701, null);
        } else {
            M0 = hd.M0(2131744693, null);
        }
        setText(org.telegram.messenger.g0.K2(M0, charSequence, "%s"));
    }

    public final void d(boolean z9) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z9) {
            boolean z10 = false;
            this.H = ValueAnimator.ofFloat(this.D, 1.0f);
            if (this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > org.telegram.messenger.g0.L(3.0f)) {
                z10 = true;
            }
            this.H.addUpdateListener(new ch.u(1, this, z10));
            this.H.setInterpolator(xq.h);
            this.H.setStartDelay(150L);
            this.H.setDuration(400L);
            this.H.start();
            return;
        }
        this.D = 1.0f;
        invalidate();
        post(new s7(this, 2));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.D;
        if (f10 < 1.0f) {
            a80 a80Var = this.h;
            a80Var.setAlpha((int) ((1.0f - f10) * 255.0f));
            Path path = this.f9322n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            int paddingTop2 = getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, org.telegram.messenger.g0.L(12.0f) + paddingTop2, direction);
            path.addRect(getPaddingLeft(), org.telegram.messenger.g0.L(16.0f) + getPaddingTop(), (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), org.telegram.messenger.g0.L(28.0f) + getPaddingTop(), direction);
            a80Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            float f11 = 0.0f;
            if (this.D > 0.0f) {
                canvas.save();
                float paddingLeft2 = getPaddingLeft();
                if (!hd.f22871a0) {
                    f11 = this.f9320e;
                }
                canvas.translate(paddingLeft2 - f11, getPaddingTop());
                this.f9318b.setAlpha((int) (this.D * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.d, this.f9321f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.D, this.f9319c);
                canvas.restore();
            }
        }
    }

    public qu getAlert() {
        if (this.f9324s == null) {
            int i7 = -this.G;
            this.G = i7;
            org.telegram.messenger.g0.G3(i7, this, null);
            org.telegram.messenger.p2.APP_ERROR.a();
            return null;
        }
        return new qu(null, getContext(), this.f9317a, this.f9324s);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        int height;
        int minimumWidth;
        if (View.MeasureSpec.getMode(i7) == 1073741824) {
            z9 = true;
        } else {
            z9 = false;
        }
        int paddingTop = getPaddingTop();
        int L = org.telegram.messenger.g0.L(29.0f);
        StaticLayout staticLayout = this.d;
        if (staticLayout == null) {
            height = org.telegram.messenger.g0.L(29.0f);
        } else {
            height = staticLayout.getHeight();
        }
        int paddingBottom = getPaddingBottom() + org.telegram.messenger.g0.W1(this.D, L, height) + paddingTop;
        if (z9) {
            minimumWidth = View.MeasureSpec.getSize(i7);
        } else {
            minimumWidth = getMinimumWidth();
        }
        setMeasuredDimension(minimumWidth, paddingBottom);
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        if (z9) {
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
        float f10;
        if (getMeasuredWidth() <= 0) {
            this.F = charSequence;
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth <= 0) {
            this.F = charSequence;
            return;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f9318b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = this.d.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f9320e = f10;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f9321f = org.telegram.ui.Components.r5.update(0, this, this.f9321f, this.d);
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.f9318b;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.f9317a));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
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
        String M0;
        SpannableString spannableString = new SpannableString("x " + stickerSetCovered.set.title);
        spannableString.setSpan(new xz(org.telegram.ui.ActionBar.k6.Uc, this.h.f31726a), 0, spannableString.length(), 33);
        spannableString.setSpan(new t31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7).f26958id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i7);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.r5(document, this.f9318b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z9 = this.f9325w;
        if (z9 && this.f9326x) {
            M0 = hd.M0(2131744696, null);
        } else if (z9) {
            M0 = hd.M0(2131744701, null);
        } else {
            M0 = hd.M0(2131744693, null);
        }
        setText(org.telegram.messenger.g0.K2(M0, charSequence, "%s"));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    private void set(int i7) {
        boolean z9 = this.f9325w;
        a80 a80Var = this.h;
        if (z9 && this.f9326x) {
            setText(org.telegram.messenger.g0.S2(hd.G(i7, "StoryContainsStickersEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, a80Var.f31726a), null, null));
        } else if (z9) {
            setText(org.telegram.messenger.g0.S2(hd.G(i7, "StoryContainsEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, a80Var.f31726a), null, null));
        } else {
            setText(org.telegram.messenger.g0.S2(hd.G(i7, "StoryContainsStickers", new Object[0]), 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, a80Var.f31726a), null, null));
        }
    }
}
