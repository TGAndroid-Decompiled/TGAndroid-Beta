package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class j17 extends FrameLayout implements gk7, tjb {
    public int E;
    public int F;
    public int G;
    public CharSequence H;
    public int I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public Rect O;
    public Rect P;
    public final int a;
    public TLRPC.InputStickerSet b;
    public final Rect c;
    public vl d;
    public boolean e;
    public final r86 f;
    public final TextPaint h;
    public final CharSequence n;
    public StaticLayout r;
    public final String s;
    public SpannableStringBuilder w;
    public StaticLayout x;
    public int y;

    public j17(int i, int i2, wjb wjbVar, Context context, ArrayList arrayList) {
        super(context);
        String M0;
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet n0;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList2;
        String G;
        this.c = new Rect();
        this.e = false;
        this.K = -1;
        this.L = true;
        this.N = 0.0f;
        this.a = i;
        int i3 = bkb.h6;
        ff0 Y = bkb.Y(bkb.v0(i3, wjbVar), 0, 16);
        vkb M = zkb.M(i3);
        setBackground(Y);
        zkb.j(this, Y, null, M, wjbVar);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(gl.L(13.0f));
        textPaint.setColor(bkb.v0(bkb.D8, wjbVar));
        if (arrayList.size() > 1) {
            if (i2 == 0) {
                G = k96.G(arrayList.size(), "MessageContainsEmojiPacks", new Object[0]);
            } else {
                G = k96.G(arrayList.size(), "MessageContainsReactionsPacks", new Object[0]);
            }
            SpannableStringBuilder T2 = gl.T2(G);
            this.n = T2;
            z3c[] z3cVarArr = (z3c[]) T2.getSpans(0, T2.length(), z3c.class);
            for (int i4 = 0; z3cVarArr != null && i4 < z3cVarArr.length; i4++) {
                int spanStart = T2.getSpanStart(z3cVarArr[i4]);
                int spanEnd = T2.getSpanEnd(z3cVarArr[i4]);
                T2.removeSpan(z3cVarArr[i4]);
                T2.setSpan(new i17(this), spanStart, spanEnd, 33);
            }
        } else if (arrayList.size() == 1) {
            if (i2 == 0) {
                M0 = k96.M0(2131748405, null);
            } else if (i2 == 3) {
                M0 = k96.M0(2131748401, null);
            } else {
                M0 = k96.M0(2131748400, null);
            }
            String[] split = M0.split("%s");
            if (split.length <= 1) {
                this.n = M0;
                return;
            }
            TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
            this.b = inputStickerSet;
            if (inputStickerSet != null && (n0 = hq6.d0(i).n0(this.b, false)) != null && (stickerSet = n0.set) != null) {
                str = stickerSet.title;
                int i5 = 0;
                while (true) {
                    ArrayList<TLRPC.Document> arrayList3 = n0.documents;
                    if (arrayList3 == null || i5 >= arrayList3.size()) {
                        break;
                    } else if (n0.documents.get(i5).id == n0.set.thumb_document_id) {
                        document = n0.documents.get(i5);
                        break;
                    } else {
                        i5++;
                    }
                }
                document = null;
                if (document == null && (arrayList2 = n0.documents) != null && arrayList2.size() > 0) {
                    document = n0.documents.get(0);
                }
            } else {
                str = null;
                document = null;
            }
            if (str != null && document != null) {
                SpannableString spannableString = new SpannableString(k27.U(document));
                spannableString.setSpan(new g17(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
                vl l = vl.l(i, 0, document);
                this.d = l;
                zkb.x(this, l, bkb.m6, wjbVar, PorterDuff.Mode.SRC_IN);
                this.d.b(this);
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(new i17(this), 0, spannableString2.length(), 33);
                this.n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
                this.N = 1.0f;
                this.b = null;
                return;
            }
            this.n = split[0];
            this.s = split[1];
            r86 r86Var = new r86(wjbVar);
            this.f = r86Var;
            r86Var.l = bkb.F8;
            r86Var.m = bkb.h6;
            r86Var.j(4.0f);
        } else if (i2 == 4) {
            this.n = gl.O2(k96.M0(2131744628, null), bkb.Wc, 2, null, wjbVar);
        }
    }

    public final int a(int i, boolean z) {
        int i2;
        float f;
        float f2;
        int i3 = 0;
        if (i <= 0) {
            return 0;
        }
        CharSequence charSequence = this.H;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.n;
        if (charSequence2 != charSequence || this.G != i) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.r = staticLayout;
                r86 r86Var = this.f;
                if (r86Var != null && this.P == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.y = gl.L(2.0f) + ((int) this.r.getPrimaryHorizontal(charSequence2.length()));
                    this.E = this.r.getLineTop(lineCount);
                    this.F = r3 - this.E;
                    float min = Math.min(gl.L(100.0f), this.r.getWidth() - this.y);
                    Rect rect = this.O;
                    if (rect == null) {
                        rect = new Rect();
                        this.O = rect;
                    }
                    int i4 = this.y;
                    rect.set(i4, this.E, (int) (i4 + min), r3);
                    r86Var.setBounds(this.O);
                    this.e = true;
                }
            } else {
                this.r = null;
                this.e = false;
            }
            this.H = charSequence2;
            this.G = i;
        }
        SpannableStringBuilder spannableStringBuilder = this.w;
        if (spannableStringBuilder != this.J || this.I != i) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.w;
                i2 = i;
                this.x = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i2 = i;
                this.x = null;
            }
            this.J = this.w;
            this.I = i2;
        }
        StaticLayout staticLayout2 = this.r;
        if (staticLayout2 != null) {
            i3 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.x;
        if (staticLayout3 != null) {
            float height = staticLayout3.getHeight() - this.F;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = this.N;
            }
            f = height * f2;
        } else {
            f = 0.0f;
        }
        return i3 + ((int) f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.D8));
    }

    @Override
    public final void didReceivedNotification(int r8, int r9, java.lang.Object... r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j17.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vl vlVar = this.d;
        if (vlVar != null) {
            vlVar.b(this);
        }
        kk7.f(this.a).b(this, kk7.A0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vl vlVar = this.d;
        if (vlVar != null) {
            vlVar.o(this);
        }
        kk7.f(this.a).n(this, kk7.A0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.r.draw(canvas);
            r86 r86Var = this.f;
            if (r86Var != null && this.e) {
                r86Var.setAlpha((int) ((1.0f - this.N) * 255.0f));
                Rect rect2 = this.O;
                if (rect2 != null && (rect = this.P) != null) {
                    float f = this.N;
                    Rect rect3 = gl.Q;
                    gl.V1(rect2, rect, f, rect3);
                    r86Var.setBounds(rect3);
                }
                r86Var.draw(canvas);
                invalidate();
            }
            if (this.x != null) {
                canvas.save();
                canvas.translate(0.0f, this.E);
                textPaint.setAlpha((int) (this.N * 255.0f));
                this.x.draw(canvas);
                canvas.restore();
            }
            vl vlVar = this.d;
            if (vlVar != null) {
                vlVar.setAlpha((int) (this.N * 255.0f));
                this.d.setBounds(this.c);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        setPadding(gl.L(13.0f), gl.L(8.0f), gl.L(13.0f), gl.L(8.0f));
        int size = View.MeasureSpec.getSize(i);
        if (this.L && (i3 = this.K) > 0) {
            size = Math.min(size, i3);
        }
        this.K = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), 1073741824));
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.h;
        if (textPaint != null) {
            try {
                int alpha = textPaint.getAlpha();
                textPaint.setColor(bkb.w0(null, bkb.D8, false));
                textPaint.setAlpha(alpha);
                invalidate();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
