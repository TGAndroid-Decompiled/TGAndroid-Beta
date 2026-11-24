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
public final class j37 extends FrameLayout implements jm7, vlb {
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
    public vm d;
    public boolean e;
    public final qa6 f;
    public final TextPaint h;
    public final CharSequence n;
    public StaticLayout r;
    public final String s;
    public SpannableStringBuilder w;
    public StaticLayout x;
    public int y;

    public j37(int i, int i2, ylb ylbVar, Context context, ArrayList arrayList) {
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
        int i3 = cmb.h6;
        fg0 Y = cmb.Y(cmb.v0(i3, ylbVar), 0, 16);
        wmb M = anb.M(i3);
        setBackground(Y);
        anb.j(this, Y, null, M, ylbVar);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(gm.L(13.0f));
        textPaint.setColor(cmb.v0(cmb.D8, ylbVar));
        if (arrayList.size() > 1) {
            if (i2 == 0) {
                G = jb6.G(arrayList.size(), "MessageContainsEmojiPacks", new Object[0]);
            } else {
                G = jb6.G(arrayList.size(), "MessageContainsReactionsPacks", new Object[0]);
            }
            SpannableStringBuilder S2 = gm.S2(G);
            this.n = S2;
            z5c[] z5cVarArr = (z5c[]) S2.getSpans(0, S2.length(), z5c.class);
            for (int i4 = 0; z5cVarArr != null && i4 < z5cVarArr.length; i4++) {
                int spanStart = S2.getSpanStart(z5cVarArr[i4]);
                int spanEnd = S2.getSpanEnd(z5cVarArr[i4]);
                S2.removeSpan(z5cVarArr[i4]);
                S2.setSpan(new i37(this), spanStart, spanEnd, 33);
            }
        } else if (arrayList.size() == 1) {
            if (i2 == 0) {
                M0 = jb6.M0(2131748354, null);
            } else if (i2 == 3) {
                M0 = jb6.M0(2131748350, null);
            } else {
                M0 = jb6.M0(2131748349, null);
            }
            String[] split = M0.split("%s");
            if (split.length <= 1) {
                this.n = M0;
                return;
            }
            TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
            this.b = inputStickerSet;
            if (inputStickerSet != null && (n0 = hs6.d0(i).n0(this.b, false)) != null && (stickerSet = n0.set) != null) {
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
                SpannableString spannableString = new SpannableString(k47.U(document));
                spannableString.setSpan(new g37(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
                vm l = vm.l(i, 0, document);
                this.d = l;
                anb.x(this, l, cmb.m6, ylbVar, PorterDuff.Mode.SRC_IN);
                this.d.b(this);
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(new i37(this), 0, spannableString2.length(), 33);
                this.n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
                this.N = 1.0f;
                this.b = null;
                return;
            }
            this.n = split[0];
            this.s = split[1];
            qa6 qa6Var = new qa6(ylbVar);
            this.f = qa6Var;
            qa6Var.l = cmb.F8;
            qa6Var.m = cmb.h6;
            qa6Var.j(4.0f);
        } else if (i2 == 4) {
            this.n = gm.N2(jb6.M0(2131744554, null), cmb.Wc, 2, null, ylbVar);
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
                qa6 qa6Var = this.f;
                if (qa6Var != null && this.P == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.y = gm.L(2.0f) + ((int) this.r.getPrimaryHorizontal(charSequence2.length()));
                    this.E = this.r.getLineTop(lineCount);
                    this.F = r3 - this.E;
                    float min = Math.min(gm.L(100.0f), this.r.getWidth() - this.y);
                    Rect rect = this.O;
                    if (rect == null) {
                        rect = new Rect();
                        this.O = rect;
                    }
                    int i4 = this.y;
                    rect.set(i4, this.E, (int) (i4 + min), r3);
                    qa6Var.setBounds(this.O);
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
        hashSet.add(Integer.valueOf(cmb.D8));
    }

    @Override
    public final void didReceivedNotification(int r8, int r9, java.lang.Object... r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j37.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vm vmVar = this.d;
        if (vmVar != null) {
            vmVar.b(this);
        }
        nm7.f(this.a).b(this, nm7.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vm vmVar = this.d;
        if (vmVar != null) {
            vmVar.o(this);
        }
        nm7.f(this.a).n(this, nm7.B0);
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
            qa6 qa6Var = this.f;
            if (qa6Var != null && this.e) {
                qa6Var.setAlpha((int) ((1.0f - this.N) * 255.0f));
                Rect rect2 = this.O;
                if (rect2 != null && (rect = this.P) != null) {
                    float f = this.N;
                    Rect rect3 = gm.Q;
                    gm.V1(rect2, rect, f, rect3);
                    qa6Var.setBounds(rect3);
                }
                qa6Var.draw(canvas);
                invalidate();
            }
            if (this.x != null) {
                canvas.save();
                canvas.translate(0.0f, this.E);
                textPaint.setAlpha((int) (this.N * 255.0f));
                this.x.draw(canvas);
                canvas.restore();
            }
            vm vmVar = this.d;
            if (vmVar != null) {
                vmVar.setAlpha((int) (this.N * 255.0f));
                this.d.setBounds(this.c);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        setPadding(gm.L(13.0f), gm.L(8.0f), gm.L(13.0f), gm.L(8.0f));
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
                textPaint.setColor(cmb.w0(null, cmb.D8, false));
                textPaint.setAlpha(alpha);
                invalidate();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
