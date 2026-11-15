package fi;

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
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.y31;
public final class d8 extends View implements org.telegram.ui.ActionBar.z5 {
    public static Object J;
    public static Vector K;
    public float E;
    public int F;
    public CharSequence G;
    public int H;
    public ValueAnimator I;
    public final org.telegram.ui.ActionBar.e6 f11639a;
    public final TextPaint f11640b;
    public final PorterDuffColorFilter f11641c;
    public StaticLayout d;
    public float f11642e;
    public org.telegram.ui.Components.l5 f11643f;
    public final d80 h;
    public final Path f11644n;
    public final ArrayList f11645r;
    public final ArrayList f11646s;
    public boolean f11647w;
    public boolean f11648x;
    public final Object f11649y;

    public d8(Context context, int i7, TLObject tLObject, Object obj, boolean z10, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Vector vector;
        this.H = -12;
        this.f11639a = e6Var;
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), 0, 8);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(this, a02, null, M, e6Var);
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f11640b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i11 = org.telegram.ui.ActionBar.j6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
        this.f11641c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), PorterDuff.Mode.SRC_IN);
        d80 d80Var = new d80(e6Var);
        this.h = d80Var;
        d80Var.setCallback(this);
        d80Var.f(org.telegram.ui.ActionBar.j6.r1(0.2f, -1), org.telegram.ui.ActionBar.j6.r1(0.05f, -1));
        Path path = new Path();
        this.f11644n = path;
        d80Var.f33885y = path;
        d80Var.k(4.0f);
        boolean[] zArr = {true};
        this.f11649y = obj;
        if (z10) {
            this.f11645r = new ArrayList();
            this.f11646s = new ArrayList();
            this.f11647w = false;
            this.f11648x = false;
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.f28121id = tL_inputPhoto;
                tL_inputPhoto.f28070id = photo.f28075id;
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
                tL_inputStickeredMediaDocument.f28120id = tL_inputDocument;
                tL_inputDocument.f28063id = document.f28057id;
                tL_inputDocument.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocument.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
            }
            bg.k0 k0Var = new bg.k0(this, obj, arrayList, zArr, i7, 3);
            if (J == obj && (vector = K) != null) {
                zArr[0] = false;
                k0Var.run(vector, null);
                return;
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getAttachedStickers, new b8(obj, i7, tL_messages_getAttachedStickers, k0Var, 0));
            return;
        }
        this.f11647w = true;
        this.f11648x = false;
        ArrayList arrayList2 = new ArrayList();
        this.f11646s = arrayList2;
        arrayList2.addAll(arrayList);
        if (this.f11646s.size() == 1) {
            si.b0(i7).l0((TLRPC.InputStickerSet) this.f11646s.get(0), 0, false, false, new c8(this, 0));
            return;
        }
        set(this.f11646s.size());
        d(false);
    }

    public static void a(d8 d8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i7) {
        int i10;
        int size;
        if (!(tLObject instanceof Vector)) {
            return;
        }
        Vector vector = (Vector) tLObject;
        J = obj;
        K = vector;
        for (int i11 = 0; i11 < vector.objects.size(); i11++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i11);
            d8Var.f11645r.add(stickerSetCovered);
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            if (stickerSet != null) {
                d8Var.f11646s.add(si.Z(stickerSet));
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                if (stickerSet2.emojis) {
                    d8Var.f11647w = true;
                } else if (!stickerSet2.masks) {
                    d8Var.f11648x = true;
                }
            }
        }
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        ArrayList arrayList2 = d8Var.f11645r;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        int i12 = i10 + size;
        if (d8Var.f11646s != null && arrayList != null && !arrayList.isEmpty()) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i13);
                long j3 = inputStickerSet.f28071id;
                int i14 = 0;
                while (true) {
                    if (i14 < d8Var.f11646s.size()) {
                        if (((TLRPC.InputStickerSet) d8Var.f11646s.get(i14)).f28071id == j3) {
                            break;
                        }
                        i14++;
                    } else {
                        d8Var.f11646s.add(inputStickerSet);
                        break;
                    }
                }
            }
            d8Var.f11647w = true;
        }
        if (i12 == 1) {
            if (d8Var.f11645r.size() >= 1) {
                d8Var.set((TLRPC.StickerSetCovered) d8Var.f11645r.get(0));
            } else if (arrayList != null && arrayList.size() >= 1) {
                zArr[0] = false;
                si.b0(i7).l0((TLRPC.InputStickerSet) arrayList.get(0), 0, false, false, new c8(d8Var, 1));
                return;
            } else {
                d8Var.set(0);
            }
        } else {
            d8Var.set(i12);
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
        String M0;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new b00(org.telegram.ui.ActionBar.j6.Xc, this.h.f33864a), 0, spannableString.length(), 33);
        spannableString.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                document = null;
                break;
            } else if (arrayList.get(i7).f28057id == tL_messages_stickerSet.set.thumb_document_id) {
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
            spannableString.setSpan(new org.telegram.ui.Components.p5(document, this.f11640b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.f11647w;
        if (z10 && this.f11648x) {
            M0 = hd.M0(2131744695, null);
        } else if (z10) {
            M0 = hd.M0(2131744700, null);
        } else {
            M0 = hd.M0(2131744692, null);
        }
        setText(org.telegram.messenger.g0.K2(M0, charSequence, "%s"));
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            boolean z11 = false;
            this.I = ValueAnimator.ofFloat(this.E, 1.0f);
            if (this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > org.telegram.messenger.g0.L(3.0f)) {
                z11 = true;
            }
            this.I.addUpdateListener(new ch.u(1, this, z11));
            this.I.setInterpolator(er.h);
            this.I.setStartDelay(150L);
            this.I.setDuration(400L);
            this.I.start();
            return;
        }
        this.E = 1.0f;
        invalidate();
        post(new c1(this, 15));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.E;
        if (f10 < 1.0f) {
            d80 d80Var = this.h;
            d80Var.setAlpha((int) ((1.0f - f10) * 255.0f));
            Path path = this.f11644n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            int paddingTop2 = getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, org.telegram.messenger.g0.L(12.0f) + paddingTop2, direction);
            path.addRect(getPaddingLeft(), org.telegram.messenger.g0.L(16.0f) + getPaddingTop(), (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), org.telegram.messenger.g0.L(28.0f) + getPaddingTop(), direction);
            d80Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            float f11 = 0.0f;
            if (this.E > 0.0f) {
                canvas.save();
                float paddingLeft2 = getPaddingLeft();
                if (!hd.f24101a0) {
                    f11 = this.f11642e;
                }
                canvas.translate(paddingLeft2 - f11, getPaddingTop());
                this.f11640b.setAlpha((int) (this.E * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.d, this.f11643f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.E, this.f11641c);
                canvas.restore();
            }
        }
    }

    public wu getAlert() {
        if (this.f11646s == null) {
            int i7 = -this.H;
            this.H = i7;
            org.telegram.messenger.g0.F3(i7, this, null);
            org.telegram.messenger.p2.APP_ERROR.a();
            return null;
        }
        return new wu(null, getContext(), this.f11639a, this.f11646s);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        int height;
        int minimumWidth;
        if (View.MeasureSpec.getMode(i7) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        int paddingTop = getPaddingTop();
        int L = org.telegram.messenger.g0.L(29.0f);
        StaticLayout staticLayout = this.d;
        if (staticLayout == null) {
            height = org.telegram.messenger.g0.L(29.0f);
        } else {
            height = staticLayout.getHeight();
        }
        int paddingBottom = getPaddingBottom() + org.telegram.messenger.g0.W1(this.E, L, height) + paddingTop;
        if (z10) {
            minimumWidth = View.MeasureSpec.getSize(i7);
        } else {
            minimumWidth = getMinimumWidth();
        }
        setMeasuredDimension(minimumWidth, paddingBottom);
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        if (z10) {
            CharSequence charSequence = this.G;
            if (charSequence != null || (this.d != null && this.F != size)) {
                if (charSequence == null) {
                    charSequence = this.d.getText();
                }
                setText(charSequence);
                this.G = null;
                this.F = size;
            }
        }
    }

    public void setText(CharSequence charSequence) {
        float f10;
        if (getMeasuredWidth() <= 0) {
            this.G = charSequence;
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth <= 0) {
            this.G = charSequence;
            return;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f11640b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = this.d.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f11642e = f10;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f11643f = org.telegram.ui.Components.p5.update(0, this, this.f11643f, this.d);
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.f11640b;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, this.f11639a));
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
        spannableString.setSpan(new b00(org.telegram.ui.ActionBar.j6.Xc, this.h.f33864a), 0, spannableString.length(), 33);
        spannableString.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7).f28057id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i7);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.p5(document, this.f11640b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.f11647w;
        if (z10 && this.f11648x) {
            M0 = hd.M0(2131744695, null);
        } else if (z10) {
            M0 = hd.M0(2131744700, null);
        } else {
            M0 = hd.M0(2131744692, null);
        }
        setText(org.telegram.messenger.g0.K2(M0, charSequence, "%s"));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    private void set(int i7) {
        boolean z10 = this.f11647w;
        d80 d80Var = this.h;
        if (z10 && this.f11648x) {
            setText(org.telegram.messenger.g0.S2(hd.G(i7, "StoryContainsStickersEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Xc, d80Var.f33864a), null, null));
        } else if (z10) {
            setText(org.telegram.messenger.g0.S2(hd.G(i7, "StoryContainsEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Xc, d80Var.f33864a), null, null));
        } else {
            setText(org.telegram.messenger.g0.S2(hd.G(i7, "StoryContainsStickers", new Object[0]), 0, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Xc, d80Var.f33864a), null, null));
        }
    }
}
