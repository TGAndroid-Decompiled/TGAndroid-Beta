package defpackage;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class x3b extends View implements tjb {
    public static Object J;
    public static Vector K;
    public float E;
    public int F;
    public CharSequence G;
    public int H;
    public ValueAnimator I;
    public final f53 a;
    public final TextPaint b;
    public final PorterDuffColorFilter c;
    public StaticLayout d;
    public float e;
    public cm f;
    public final r86 h;
    public final Path n;
    public final ArrayList r;
    public final ArrayList s;
    public boolean w;
    public boolean x;
    public final Object y;

    public x3b(Context context, int i, TLObject tLObject, Object obj, boolean z, ArrayList arrayList, f53 f53Var) {
        super(context);
        Vector vector;
        this.H = -12;
        this.a = f53Var;
        setMinimumWidth(gl.L(196.0f));
        setPadding(gl.L(13.0f), gl.L(8.0f), gl.L(13.0f), gl.L(8.0f));
        int i2 = bkb.h6;
        ff0 Y = bkb.Y(bkb.v0(i2, f53Var), 0, 8);
        vkb M = zkb.M(i2);
        setBackground(Y);
        zkb.j(this, Y, null, M, f53Var);
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(gl.L(13.0f));
        int i3 = bkb.D8;
        textPaint.setColor(bkb.v0(i3, f53Var));
        this.c = new PorterDuffColorFilter(bkb.v0(i3, f53Var), PorterDuff.Mode.SRC_IN);
        r86 r86Var = new r86(f53Var);
        this.h = r86Var;
        r86Var.setCallback(this);
        r86Var.f(bkb.p1(0.2f, -1), bkb.p1(0.05f, -1));
        Path path = new Path();
        this.n = path;
        r86Var.y = path;
        r86Var.j(4.0f);
        boolean[] zArr = {true};
        this.y = obj;
        if (z) {
            this.r = new ArrayList();
            this.s = new ArrayList();
            this.w = false;
            this.x = false;
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
                tL_inputPhoto.id = photo.id;
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
                tL_inputStickeredMediaDocument.id = tL_inputDocument;
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocument.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
            }
            vt0 vt0Var = new vt0(this, obj, arrayList, zArr, i);
            if (J == obj && (vector = K) != null) {
                zArr[0] = false;
                vt0Var.run(vector, null);
                return;
            }
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getAttachedStickers, new ae(obj, i, tL_messages_getAttachedStickers, vt0Var, (byte) 10));
            return;
        }
        this.w = true;
        this.x = false;
        ArrayList arrayList2 = new ArrayList();
        this.s = arrayList2;
        arrayList2.addAll(arrayList);
        if (this.s.size() == 1) {
            hq6.d0(i).m0((TLRPC.InputStickerSet) this.s.get(0), 0, false, false, new w3b(this, (byte) 0));
            return;
        }
        set(this.s.size());
        a(false);
    }

    private void set(TLRPC.StickerSetCovered stickerSetCovered) {
        CharSequence charSequence;
        String M0;
        SpannableString spannableString = new SpannableString("x " + stickerSetCovered.set.title);
        spannableString.setSpan(new cm4(bkb.Wc, this.h.a), 0, spannableString.length(), 33);
        spannableString.setSpan(new z3c(gl.o()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new gm(document, this.b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        if (this.w) {
            if (this.x) {
                M0 = k96.M0(2131744455, null);
            } else {
                M0 = k96.M0(2131744460, null);
            }
        } else {
            M0 = k96.M0(2131744452, null);
        }
        setText(gl.G2(M0, charSequence, "%s"));
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            boolean z2 = false;
            this.I = ValueAnimator.ofFloat(this.E, 1.0f);
            if (this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > gl.L(3.0f)) {
                z2 = true;
            }
            this.I.addUpdateListener(new d20((byte) 9, this, z2));
            this.I.setInterpolator(s33.h);
            this.I.setStartDelay(150L);
            this.I.setDuration(400L);
            this.I.start();
            return;
        }
        this.E = 1.0f;
        invalidate();
        post(new kya(this, (byte) 11));
    }

    public final void b(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        set(tL_messages_stickerSet);
        a(false);
    }

    public final void c(TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i2;
        int size;
        if (!(tLObject instanceof Vector)) {
            return;
        }
        Vector vector = (Vector) tLObject;
        J = obj;
        K = vector;
        int i3 = 0;
        while (true) {
            int size2 = vector.objects.size();
            arrayList2 = this.s;
            arrayList3 = this.r;
            if (i3 >= size2) {
                break;
            }
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i3);
            arrayList3.add(stickerSetCovered);
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            if (stickerSet != null) {
                arrayList2.add(hq6.b0(stickerSet));
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                if (stickerSet2.emojis) {
                    this.w = true;
                } else if (!stickerSet2.masks) {
                    this.x = true;
                }
            }
            i3++;
        }
        if (arrayList != null) {
            i2 = arrayList.size();
        } else {
            i2 = 0;
        }
        if (arrayList3 == null) {
            size = 0;
        } else {
            size = arrayList3.size();
        }
        int i4 = i2 + size;
        if (arrayList2 != null && arrayList != null && !arrayList.isEmpty()) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i5);
                long j = inputStickerSet.id;
                int i6 = 0;
                while (true) {
                    if (i6 < arrayList2.size()) {
                        if (((TLRPC.InputStickerSet) arrayList2.get(i6)).id != j) {
                            i6++;
                        }
                    } else {
                        arrayList2.add(inputStickerSet);
                        break;
                    }
                }
            }
            this.w = true;
        }
        if (i4 == 1) {
            if (arrayList3.size() >= 1) {
                set((TLRPC.StickerSetCovered) arrayList3.get(0));
            } else if (arrayList != null && arrayList.size() >= 1) {
                zArr[0] = false;
                hq6.d0(i).m0((TLRPC.InputStickerSet) arrayList.get(0), 0, false, false, new w3b(this, (byte) 1));
                return;
            } else {
                set(0);
            }
        } else {
            set(i4);
        }
        a(zArr[0]);
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        set(tL_messages_stickerSet);
        a(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f = this.E;
        if (f < 1.0f) {
            r86 r86Var = this.h;
            r86Var.setAlpha((int) ((1.0f - f) * 255.0f));
            Path path = this.n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            int paddingTop2 = getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, gl.L(12.0f) + paddingTop2, direction);
            path.addRect(getPaddingLeft(), gl.L(16.0f) + getPaddingTop(), (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), gl.L(28.0f) + getPaddingTop(), direction);
            r86Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            float f2 = 0.0f;
            if (this.E > 0.0f) {
                canvas.save();
                float paddingLeft2 = getPaddingLeft();
                if (!k96.a0) {
                    f2 = this.e;
                }
                canvas.translate(paddingLeft2 - f2, getPaddingTop());
                this.b.setAlpha((int) (this.E * 255.0f));
                this.d.draw(canvas);
                gm.drawAnimatedEmojis(canvas, this.d, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.E, this.c);
                canvas.restore();
            }
        }
    }

    public qx3 getAlert() {
        ArrayList arrayList = this.s;
        if (arrayList == null) {
            int i = -this.H;
            this.H = i;
            gl.A3(i, this, null);
            pw0.APP_ERROR.a();
            return null;
        }
        return new qx3(null, getContext(), this.a, arrayList);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        int height;
        int minimumWidth;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        int paddingTop = getPaddingTop();
        int L = gl.L(29.0f);
        StaticLayout staticLayout = this.d;
        if (staticLayout == null) {
            height = gl.L(29.0f);
        } else {
            height = staticLayout.getHeight();
        }
        int paddingBottom = getPaddingBottom() + gl.U1(this.E, L, height) + paddingTop;
        if (z) {
            minimumWidth = View.MeasureSpec.getSize(i);
        } else {
            minimumWidth = getMinimumWidth();
        }
        setMeasuredDimension(minimumWidth, paddingBottom);
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        if (z) {
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
        float f;
        if (getMeasuredWidth() <= 0) {
            this.G = charSequence;
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth <= 0) {
            this.G = charSequence;
            return;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f = this.d.getLineLeft(0);
        } else {
            f = 0.0f;
        }
        this.e = f;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f = gm.update(0, this, this.f, this.d);
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.b;
            if (textPaint != null) {
                textPaint.setColor(bkb.v0(bkb.D8, this.a));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.h && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    private void set(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        CharSequence charSequence;
        String M0;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new cm4(bkb.Wc, this.h.a), 0, spannableString.length(), 33);
        spannableString.setSpan(new z3c(gl.o()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                document = null;
                break;
            } else if (arrayList.get(i).id == tL_messages_stickerSet.set.thumb_document_id) {
                document = arrayList.get(i);
                break;
            } else {
                i++;
            }
        }
        if (document == null && !arrayList.isEmpty()) {
            document = arrayList.get(0);
        }
        if (document != null) {
            spannableString.setSpan(new gm(document, this.b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        if (!this.w) {
            M0 = k96.M0(2131744452, null);
        } else if (this.x) {
            M0 = k96.M0(2131744455, null);
        } else {
            M0 = k96.M0(2131744460, null);
        }
        setText(gl.G2(M0, charSequence, "%s"));
    }

    private void set(int i) {
        boolean z = this.w;
        r86 r86Var = this.h;
        if (!z) {
            setText(gl.N2(k96.G(i, "StoryContainsStickers", new Object[0]), 0, bkb.v0(bkb.Wc, r86Var.a), null, null));
        } else if (this.x) {
            setText(gl.N2(k96.G(i, "StoryContainsStickersEmoji", new Object[0]), 0, bkb.v0(bkb.Wc, r86Var.a), null, null));
        } else {
            setText(gl.N2(k96.G(i, "StoryContainsEmoji", new Object[0]), 0, bkb.v0(bkb.Wc, r86Var.a), null, null));
        }
    }
}
