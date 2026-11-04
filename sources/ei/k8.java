package ei;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.li;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
public final class k8 extends View implements org.telegram.ui.ActionBar.z5 {
    public static Object J;
    public static Vector K;
    public float E;
    public int F;
    public CharSequence G;
    public int H;
    public ValueAnimator I;
    public final org.telegram.ui.ActionBar.e6 f10585a;
    public final TextPaint f10586b;
    public final PorterDuffColorFilter f10587c;
    public StaticLayout d;
    public float f10588e;
    public org.telegram.ui.Components.l5 f10589f;
    public final w70 h;
    public final Path f10590n;
    public final ArrayList f10591r;
    public final ArrayList f10592s;
    public boolean f10593w;
    public boolean f10594x;
    public final Object f10595y;

    public k8(Context context, int i3, TLObject tLObject, Object obj, boolean z10, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Vector vector;
        this.H = -12;
        this.f10585a = e6Var;
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 0, 8);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, e6Var);
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f10586b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        this.f10587c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), PorterDuff.Mode.SRC_IN);
        w70 w70Var = new w70(e6Var);
        this.h = w70Var;
        w70Var.setCallback(this);
        w70Var.f(org.telegram.ui.ActionBar.k6.r1(0.2f, -1), org.telegram.ui.ActionBar.k6.r1(0.05f, -1));
        Path path = new Path();
        this.f10590n = path;
        w70Var.f39945y = path;
        w70Var.k(4.0f);
        boolean[] zArr = {true};
        this.f10595y = obj;
        if (z10) {
            this.f10591r = new ArrayList();
            this.f10592s = new ArrayList();
            this.f10593w = false;
            this.f10594x = false;
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.f27071id = tL_inputPhoto;
                tL_inputPhoto.f27020id = photo.f27025id;
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
                tL_inputStickeredMediaDocument.f27070id = tL_inputDocument;
                tL_inputDocument.f27013id = document.f27007id;
                tL_inputDocument.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocument.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
            }
            cg.j0 j0Var = new cg.j0(this, obj, arrayList, zArr, i3, 3);
            if (J == obj && (vector = K) != null) {
                zArr[0] = false;
                j0Var.run(vector, null);
                return;
            }
            ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getAttachedStickers, new i8(obj, i3, tL_messages_getAttachedStickers, j0Var, 0));
            return;
        }
        this.f10593w = true;
        this.f10594x = false;
        ArrayList arrayList2 = new ArrayList();
        this.f10592s = arrayList2;
        arrayList2.addAll(arrayList);
        if (this.f10592s.size() == 1) {
            li.b0(i3).l0((TLRPC.InputStickerSet) this.f10592s.get(0), 0, false, false, new j8(this, 0));
            return;
        }
        set(this.f10592s.size());
        d(false);
    }

    public static void a(k8 k8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i3) {
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
            k8Var.f10591r.add(stickerSetCovered);
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            if (stickerSet != null) {
                k8Var.f10592s.add(li.Z(stickerSet));
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                if (stickerSet2.emojis) {
                    k8Var.f10593w = true;
                } else if (!stickerSet2.masks) {
                    k8Var.f10594x = true;
                }
            }
        }
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        ArrayList arrayList2 = k8Var.f10591r;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        int i12 = i10 + size;
        if (k8Var.f10592s != null && arrayList != null && !arrayList.isEmpty()) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i13);
                long j10 = inputStickerSet.f27021id;
                int i14 = 0;
                while (true) {
                    if (i14 < k8Var.f10592s.size()) {
                        if (((TLRPC.InputStickerSet) k8Var.f10592s.get(i14)).f27021id == j10) {
                            break;
                        }
                        i14++;
                    } else {
                        k8Var.f10592s.add(inputStickerSet);
                        break;
                    }
                }
            }
            k8Var.f10593w = true;
        }
        if (i12 == 1) {
            if (k8Var.f10591r.size() >= 1) {
                k8Var.set((TLRPC.StickerSetCovered) k8Var.f10591r.get(0));
            } else if (arrayList != null && arrayList.size() >= 1) {
                zArr[0] = false;
                li.b0(i3).l0((TLRPC.InputStickerSet) arrayList.get(0), 0, false, false, new j8(k8Var, 1));
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
        spannableString.setSpan(new tz(org.telegram.ui.ActionBar.k6.Uc, this.h.f39924a), 0, spannableString.length(), 33);
        spannableString.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                document = null;
                break;
            } else if (arrayList.get(i3).f27007id == tL_messages_stickerSet.set.thumb_document_id) {
                document = arrayList.get(i3);
                break;
            } else {
                i3++;
            }
        }
        if (document == null && !arrayList.isEmpty()) {
            document = arrayList.get(0);
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.p5(document, this.f10586b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.f10593w;
        if (z10 && this.f10594x) {
            M0 = bd.M0(2131744705, null);
        } else if (z10) {
            M0 = bd.M0(2131744710, null);
        } else {
            M0 = bd.M0(2131744702, null);
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
            this.I.addUpdateListener(new dh.u(1, this, z11));
            this.I.setInterpolator(xq.h);
            this.I.setStartDelay(150L);
            this.I.setDuration(400L);
            this.I.start();
            return;
        }
        this.E = 1.0f;
        invalidate();
        post(new z5(this, 7));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.E;
        if (f10 < 1.0f) {
            w70 w70Var = this.h;
            w70Var.setAlpha((int) ((1.0f - f10) * 255.0f));
            Path path = this.f10590n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            int paddingTop2 = getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, org.telegram.messenger.g0.L(12.0f) + paddingTop2, direction);
            path.addRect(getPaddingLeft(), org.telegram.messenger.g0.L(16.0f) + getPaddingTop(), (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), org.telegram.messenger.g0.L(28.0f) + getPaddingTop(), direction);
            w70Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            float f11 = 0.0f;
            if (this.E > 0.0f) {
                canvas.save();
                float paddingLeft2 = getPaddingLeft();
                if (!bd.f21784a0) {
                    f11 = this.f10588e;
                }
                canvas.translate(paddingLeft2 - f11, getPaddingTop());
                this.f10586b.setAlpha((int) (this.E * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.d, this.f10589f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.E, this.f10587c);
                canvas.restore();
            }
        }
    }

    public pu getAlert() {
        if (this.f10592s == null) {
            int i3 = -this.H;
            this.H = i3;
            org.telegram.messenger.g0.G3(i3, this, null);
            org.telegram.messenger.p2.APP_ERROR.a();
            return null;
        }
        return new pu(null, getContext(), this.f10585a, this.f10592s);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        int height;
        int minimumWidth;
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
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
            minimumWidth = View.MeasureSpec.getSize(i3);
        } else {
            minimumWidth = getMinimumWidth();
        }
        setMeasuredDimension(minimumWidth, paddingBottom);
        int size = (View.MeasureSpec.getSize(i3) - getPaddingLeft()) - getPaddingRight();
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
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f10586b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = this.d.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f10588e = f10;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f10589f = org.telegram.ui.Components.p5.update(0, this, this.f10589f, this.d);
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.f10586b;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.f10585a));
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
        spannableString.setSpan(new tz(org.telegram.ui.ActionBar.k6.Uc, this.h.f39924a), 0, spannableString.length(), 33);
        spannableString.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (arrayList.get(i3).f27007id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i3);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.p5(document, this.f10586b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.f10593w;
        if (z10 && this.f10594x) {
            M0 = bd.M0(2131744705, null);
        } else if (z10) {
            M0 = bd.M0(2131744710, null);
        } else {
            M0 = bd.M0(2131744702, null);
        }
        setText(org.telegram.messenger.g0.K2(M0, charSequence, "%s"));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    private void set(int i3) {
        boolean z10 = this.f10593w;
        w70 w70Var = this.h;
        if (z10 && this.f10594x) {
            setText(org.telegram.messenger.g0.S2(bd.G(i3, "StoryContainsStickersEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, w70Var.f39924a), null, null));
        } else if (z10) {
            setText(org.telegram.messenger.g0.S2(bd.G(i3, "StoryContainsEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, w70Var.f39924a), null, null));
        } else {
            setText(org.telegram.messenger.g0.S2(bd.G(i3, "StoryContainsStickers", new Object[0]), 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, w70Var.f39924a), null, null));
        }
    }
}
