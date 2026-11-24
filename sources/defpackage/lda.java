package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_iv;
public final class lda extends FrameLayout implements vlb {
    public boolean E;
    public final ArrayList F;
    public int G;
    public final ArrayList H;
    public final SparseArray I;
    public final ArrayList J;
    public final ArrayList K;
    public final Stack L;
    public final Path M;
    public rna N;
    public int O;
    public final int P;
    public StaticLayout Q;
    public int R;
    public StaticLayout S;
    public final AtomicReference T;
    public int U;
    public StaticLayout V;
    public final AtomicReference W;
    public boolean a;
    public int a0;
    public eg0 b;
    public StaticLayout b0;
    public int c;
    public k47 c0;
    public ei7 d;
    public final TextPaint d0;
    public final i66 e;
    public final TextPaint e0;
    public boolean f;
    public final TextPaint f0;
    public final TextPaint g0;
    public int h;
    public int h0;
    public StaticLayout i0;
    public int j0;
    public StaticLayout k0;
    public cn l0;
    public final ylb m0;
    public m66 n;
    public final boolean n0;
    public final ImageReceiver r;
    public boolean s;
    public final o26 w;
    public final jh2 x;
    public kda y;

    public lda(int i, ylb ylbVar, Context context) {
        super(context);
        int i2;
        float f;
        float f2;
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = new i66(this);
        this.F = new ArrayList();
        this.H = new ArrayList();
        this.I = new SparseArray();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new Stack();
        this.M = new Path();
        this.O = -1;
        this.P = gm.L(10.0f);
        this.R = gm.L(30.0f);
        this.T = new AtomicReference();
        this.U = gm.L(30.0f);
        this.W = new AtomicReference();
        this.a0 = gm.L(30.0f);
        this.j0 = gm.L(30.0f);
        this.m0 = ylbVar;
        this.n0 = i;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.d0 = textPaint;
        textPaint.setTypeface(gm.o());
        textPaint.setColor(cmb.v0(cmb.F6, ylbVar));
        TextPaint textPaint2 = new TextPaint(1);
        this.e0 = textPaint2;
        textPaint.setTextSize(gm.L(14.0f));
        textPaint2.setTextSize(gm.L(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.q0(gm.L(8.0f));
        this.w = new o26(0, ylbVar);
        jh2 jh2Var = new jh2(21, ylbVar, context);
        this.x = jh2Var;
        jh2Var.setVisibility(4);
        jh2Var.b(-1, cmb.c6, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(2);
        boolean z = jb6.a0;
        if (z) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i3 = i2 | 48;
        if (z) {
            f = 0.0f;
        } else {
            f = 44.0f;
        }
        if (z) {
            f2 = 44.0f;
        } else {
            f2 = 0.0f;
        }
        addView(jh2Var, qoe.d(24, 24.0f, i3, f, 44.0f, f2, 0.0f));
        if (i == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f0 = textPaint3;
            textPaint3.setTextSize(gm.L(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.g0 = textPaint4;
        textPaint4.setTextSize(gm.L(13.0f));
    }

    public final void a(String str) {
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            if (!trim.startsWith("#")) {
                if (gm.t(trim, "://") == -1 && trim.toString().toLowerCase().indexOf("http") != 0 && trim.toString().toLowerCase().indexOf("mailto") != 0) {
                    trim = "http://".concat(trim);
                }
                this.F.add(SpannableString.valueOf(trim));
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c((TL_iv.PageBlock) obj);
        }
    }

    public final void c(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                c(((TL_iv.pageBlockCover) pageBlock).cover);
                return;
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                b(((TL_iv.pageBlockBlockquoteBlocks) pageBlock).blocks);
                return;
            } else {
                return;
            }
        }
        d(pageBlock.text);
    }

    public final void d(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textUrl) {
            a(richText.url);
        } else if (richText instanceof TL_iv.textAutoUrl) {
            a(uj9.w(richText));
        } else if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
        } else if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:".concat(uj9.w(richText)));
        } else if (richText instanceof TL_iv.textConcat) {
            for (int i = 0; i < richText.texts.size(); i++) {
                d(richText.texts.get(i));
            }
        } else if ((richText instanceof TL_iv.textBold) || (richText instanceof TL_iv.textItalic) || (richText instanceof TL_iv.textUnderline) || (richText instanceof TL_iv.textStrike) || (richText instanceof TL_iv.textFixed) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textAnchor)) {
            d(richText.text);
        }
    }

    public final void e() {
        this.e.e(true);
        this.h = -1;
        this.n = null;
        this.f = false;
        this.a = false;
        eg0 eg0Var = this.b;
        if (eg0Var != null) {
            removeCallbacks(eg0Var);
        }
        ei7 ei7Var = this.d;
        if (ei7Var != null) {
            removeCallbacks(ei7Var);
        }
        invalidate();
    }

    public final void f(boolean z, boolean z2) {
        jh2 jh2Var = this.x;
        if (jh2Var.getVisibility() != 0) {
            jh2Var.setVisibility(0);
        }
        jh2Var.a(z, z2);
    }

    public final void g(int i, int i2, int i3) {
        float f;
        rna rnaVar;
        rna rnaVar2;
        if (jb6.a0) {
            f = 8.0f;
        } else {
            f = gm.C;
        }
        int L = gm.L(f);
        e();
        this.N.q = new jda(this, (byte) 0);
        int i4 = i - L;
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i5 = this.O;
        SparseArray sparseArray = this.I;
        ArrayList arrayList = this.J;
        ArrayList arrayList2 = this.K;
        ArrayList arrayList3 = this.H;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    int size = arrayList2.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList2.get(i6);
                        i6++;
                        ((rna) obj).j(i4, i2 - this.U, sqrt, false);
                    }
                }
            } else {
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    ((rna) obj2).j(i4, i2 - this.R, sqrt, false);
                }
            }
        } else {
            float f2 = 0.0f;
            for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                Layout layout = (Layout) arrayList3.get(i8);
                f2 += layout.getLineBottom(layout.getLineCount() - 1);
                for (rna rnaVar3 : (List) sparseArray.get(i8)) {
                    rnaVar3.j(i4, ((i2 - this.G) - i3) + f2, sqrt, false);
                }
            }
        }
        for (int i9 = 0; i9 <= 2; i9++) {
            if (i9 != this.O) {
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            int size3 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size3) {
                                Object obj3 = arrayList2.get(i10);
                                i10++;
                                ((rna) obj3).j(rnaVar2.getBounds().centerX(), rnaVar2.getBounds().centerY(), sqrt, false);
                            }
                        }
                    } else {
                        int size4 = arrayList.size();
                        int i11 = 0;
                        while (i11 < size4) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            ((rna) obj4).j(rnaVar.getBounds().centerX(), rnaVar.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        Layout layout2 = (Layout) arrayList3.get(i12);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        for (rna rnaVar4 : (List) sparseArray.get(i12)) {
                            rnaVar4.j(rnaVar4.getBounds().centerX(), rnaVar4.getBounds().centerY(), sqrt, false);
                        }
                    }
                }
            }
        }
        this.O = -1;
        this.N = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.r;
    }

    public k47 getMessage() {
        return this.c0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s) {
            this.r.I();
        }
        this.l0 = gn.update(0, this, this.l0, this.k0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.s) {
            this.r.K();
        }
        gn.release(this, this.l0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        lda ldaVar;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float L;
        float f6;
        int i;
        Canvas canvas2 = canvas;
        ylb ylbVar = this.m0;
        if (this.n0) {
            this.f0.setColor(cmb.v0(cmb.z6, ylbVar));
        }
        StaticLayout staticLayout = this.i0;
        int i2 = this.P;
        float f7 = 8.0f;
        if (staticLayout != null) {
            canvas2.save();
            if (jb6.a0) {
                f6 = 8.0f;
            } else {
                f6 = gm.C;
            }
            int L2 = gm.L(f6);
            if (jb6.a0) {
                i = 0;
            } else {
                i = this.h0;
            }
            canvas2.translate(L2 + i, i2);
            this.i0.draw(canvas2);
            canvas2.restore();
        }
        if (this.Q != null) {
            canvas2.save();
            if (jb6.a0) {
                f5 = 8.0f;
            } else {
                f5 = gm.C;
            }
            float L3 = gm.L(f5);
            if (jb6.a0) {
                StaticLayout staticLayout2 = this.i0;
                if (staticLayout2 == null) {
                    L = 0.0f;
                } else {
                    L = gm.L(4.0f) + staticLayout2.getWidth();
                }
                L3 += L;
            }
            canvas2.translate(L3, i2);
            this.Q.draw(canvas2);
            canvas2.restore();
        }
        if (this.b0 != null) {
            this.g0.setColor(cmb.v0(cmb.F6, ylbVar));
            canvas2.save();
            if (jb6.a0) {
                f4 = 8.0f;
            } else {
                f4 = gm.C;
            }
            canvas2.translate(gm.L(f4), this.a0);
            this.b0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.S;
        TextPaint textPaint = this.e0;
        if (staticLayout3 != null) {
            textPaint.setColor(cmb.v0(cmb.F6, ylbVar));
            canvas2.save();
            if (jb6.a0) {
                f3 = 8.0f;
            } else {
                f3 = gm.C;
            }
            canvas2.translate(gm.L(f3), this.R);
            rna.g(this, false, textPaint.getColor(), -gm.L(2.0f), this.T, 0, this.S, this.J, canvas2, false);
            canvas2.restore();
        }
        if (this.V != null) {
            textPaint.setColor(cmb.v0(cmb.F6, ylbVar));
            canvas2.save();
            if (jb6.a0) {
                f2 = 8.0f;
            } else {
                f2 = gm.C;
            }
            canvas2.translate(gm.L(f2), this.U);
            rna.g(this, false, textPaint.getColor(), -gm.L(2.0f), this.W, 0, this.V, this.K, canvas2, false);
            ldaVar = this;
            canvas2.restore();
        } else {
            ldaVar = this;
        }
        ArrayList arrayList = ldaVar.H;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(cmb.v0(cmb.I6, ylbVar));
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i4);
                List<rna> list = (List) ldaVar.I.get(i4);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    if (jb6.a0) {
                        f = 8.0f;
                    } else {
                        f = gm.C;
                    }
                    canvas2.translate(gm.L(f), ldaVar.G + i3);
                    Path path = ldaVar.M;
                    path.rewind();
                    if (list != null) {
                        for (rna rnaVar : list) {
                            Rect bounds = rnaVar.getBounds();
                            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                        }
                    }
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.clipPath(path);
                    path.rewind();
                    if (list != null && !list.isEmpty()) {
                        ((rna) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        for (rna rnaVar2 : list) {
                            rnaVar2.draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i3 += staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1);
                }
            }
            if (ldaVar.e.g(canvas2)) {
                ldaVar.invalidate();
            }
        }
        if (ldaVar.k0 != null) {
            canvas2.save();
            if (!jb6.a0) {
                f7 = gm.C;
            }
            canvas2.translate(gm.L(f7), ldaVar.j0);
            ldaVar.k0.draw(canvas2);
            gn.drawAnimatedEmojis(canvas, ldaVar.k0, ldaVar.l0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        ldaVar.w.draw(canvas2);
        if (ldaVar.s) {
            ldaVar.r.h(canvas2, null);
        }
        if (ldaVar.E) {
            if (jb6.a0) {
                canvas2.drawLine(0.0f, ldaVar.getMeasuredHeight() - 1, ldaVar.getMeasuredWidth() - gm.L(gm.C), ldaVar.getMeasuredHeight() - 1, cmb.j0);
                return;
            }
            canvas.drawLine(gm.L(gm.C), ldaVar.getMeasuredHeight() - 1, ldaVar.getMeasuredWidth(), ldaVar.getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            sb.append(staticLayout.getText());
        }
        if (this.S != null) {
            sb.append(", ");
            sb.append(this.S.getText());
        }
        if (this.V != null) {
            sb.append(", ");
            sb.append(this.V.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        if (this.x.a.q) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    @Override
    public final void onMeasure(int r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lda.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lda.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(kda kdaVar) {
        this.y = kdaVar;
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.d0;
            if (textPaint != null) {
                textPaint.setColor(cmb.v0(cmb.F6, this.m0));
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
