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
public final class lba extends FrameLayout implements tjb {
    public boolean E;
    public final ArrayList F;
    public int G;
    public final ArrayList H;
    public final SparseArray I;
    public final ArrayList J;
    public final ArrayList K;
    public final Stack L;
    public final Path M;
    public qla N;
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
    public ef0 b;
    public StaticLayout b0;
    public int c;
    public k27 c0;
    public bg7 d;
    public final TextPaint d0;
    public final i46 e;
    public final TextPaint e0;
    public boolean f;
    public final TextPaint f0;
    public final TextPaint g0;
    public int h;
    public int h0;
    public StaticLayout i0;
    public int j0;
    public StaticLayout k0;
    public cm l0;
    public final wjb m0;
    public m46 n;
    public final boolean n0;
    public final ImageReceiver r;
    public boolean s;
    public final o06 w;
    public final wf2 x;
    public kba y;

    public lba(int i, wjb wjbVar, Context context) {
        super(context);
        int i2;
        float f;
        float f2;
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = new i46(this);
        this.F = new ArrayList();
        this.H = new ArrayList();
        this.I = new SparseArray();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new Stack();
        this.M = new Path();
        this.O = -1;
        this.P = gl.L(10.0f);
        this.R = gl.L(30.0f);
        this.T = new AtomicReference();
        this.U = gl.L(30.0f);
        this.W = new AtomicReference();
        this.a0 = gl.L(30.0f);
        this.j0 = gl.L(30.0f);
        this.m0 = wjbVar;
        this.n0 = i;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.d0 = textPaint;
        textPaint.setTypeface(gl.o());
        textPaint.setColor(bkb.v0(bkb.F6, wjbVar));
        TextPaint textPaint2 = new TextPaint(1);
        this.e0 = textPaint2;
        textPaint.setTextSize(gl.L(14.0f));
        textPaint2.setTextSize(gl.L(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.q0(gl.L(8.0f));
        this.w = new o06(0, wjbVar);
        wf2 wf2Var = new wf2(21, wjbVar, context);
        this.x = wf2Var;
        wf2Var.setVisibility(4);
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(2);
        boolean z = k96.a0;
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
        addView(wf2Var, nme.d(24, 24.0f, i3, f, 44.0f, f2, 0.0f));
        if (i == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f0 = textPaint3;
            textPaint3.setTextSize(gl.L(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.g0 = textPaint4;
        textPaint4.setTextSize(gl.L(13.0f));
    }

    public final void a(String str) {
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            if (!trim.startsWith("#")) {
                if (gl.t(trim, "://") == -1 && trim.toString().toLowerCase().indexOf("http") != 0 && trim.toString().toLowerCase().indexOf("mailto") != 0) {
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
            a(rh9.w(richText));
        } else if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
        } else if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:".concat(rh9.w(richText)));
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
        ef0 ef0Var = this.b;
        if (ef0Var != null) {
            removeCallbacks(ef0Var);
        }
        bg7 bg7Var = this.d;
        if (bg7Var != null) {
            removeCallbacks(bg7Var);
        }
        invalidate();
    }

    public final void f(boolean z, boolean z2) {
        wf2 wf2Var = this.x;
        if (wf2Var.getVisibility() != 0) {
            wf2Var.setVisibility(0);
        }
        wf2Var.a(z, z2);
    }

    public final void g(int i, int i2, int i3) {
        float f;
        qla qlaVar;
        qla qlaVar2;
        if (k96.a0) {
            f = 8.0f;
        } else {
            f = gl.C;
        }
        int L = gl.L(f);
        e();
        this.N.q = new jba(this, (byte) 0);
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
                        ((qla) obj).j(i4, i2 - this.U, sqrt, false);
                    }
                }
            } else {
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    ((qla) obj2).j(i4, i2 - this.R, sqrt, false);
                }
            }
        } else {
            float f2 = 0.0f;
            for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                Layout layout = (Layout) arrayList3.get(i8);
                f2 += layout.getLineBottom(layout.getLineCount() - 1);
                for (qla qlaVar3 : (List) sparseArray.get(i8)) {
                    qlaVar3.j(i4, ((i2 - this.G) - i3) + f2, sqrt, false);
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
                                ((qla) obj3).j(qlaVar2.getBounds().centerX(), qlaVar2.getBounds().centerY(), sqrt, false);
                            }
                        }
                    } else {
                        int size4 = arrayList.size();
                        int i11 = 0;
                        while (i11 < size4) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            ((qla) obj4).j(qlaVar.getBounds().centerX(), qlaVar.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        Layout layout2 = (Layout) arrayList3.get(i12);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        for (qla qlaVar4 : (List) sparseArray.get(i12)) {
                            qlaVar4.j(qlaVar4.getBounds().centerX(), qlaVar4.getBounds().centerY(), sqrt, false);
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

    public k27 getMessage() {
        return this.c0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s) {
            this.r.I();
        }
        this.l0 = gm.update(0, this, this.l0, this.k0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.s) {
            this.r.K();
        }
        gm.release(this, this.l0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        lba lbaVar;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float L;
        float f6;
        int i;
        Canvas canvas2 = canvas;
        wjb wjbVar = this.m0;
        if (this.n0) {
            this.f0.setColor(bkb.v0(bkb.z6, wjbVar));
        }
        StaticLayout staticLayout = this.i0;
        int i2 = this.P;
        float f7 = 8.0f;
        if (staticLayout != null) {
            canvas2.save();
            if (k96.a0) {
                f6 = 8.0f;
            } else {
                f6 = gl.C;
            }
            int L2 = gl.L(f6);
            if (k96.a0) {
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
            if (k96.a0) {
                f5 = 8.0f;
            } else {
                f5 = gl.C;
            }
            float L3 = gl.L(f5);
            if (k96.a0) {
                StaticLayout staticLayout2 = this.i0;
                if (staticLayout2 == null) {
                    L = 0.0f;
                } else {
                    L = gl.L(4.0f) + staticLayout2.getWidth();
                }
                L3 += L;
            }
            canvas2.translate(L3, i2);
            this.Q.draw(canvas2);
            canvas2.restore();
        }
        if (this.b0 != null) {
            this.g0.setColor(bkb.v0(bkb.F6, wjbVar));
            canvas2.save();
            if (k96.a0) {
                f4 = 8.0f;
            } else {
                f4 = gl.C;
            }
            canvas2.translate(gl.L(f4), this.a0);
            this.b0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.S;
        TextPaint textPaint = this.e0;
        if (staticLayout3 != null) {
            textPaint.setColor(bkb.v0(bkb.F6, wjbVar));
            canvas2.save();
            if (k96.a0) {
                f3 = 8.0f;
            } else {
                f3 = gl.C;
            }
            canvas2.translate(gl.L(f3), this.R);
            qla.g(this, false, textPaint.getColor(), -gl.L(2.0f), this.T, 0, this.S, this.J, canvas2, false);
            canvas2.restore();
        }
        if (this.V != null) {
            textPaint.setColor(bkb.v0(bkb.F6, wjbVar));
            canvas2.save();
            if (k96.a0) {
                f2 = 8.0f;
            } else {
                f2 = gl.C;
            }
            canvas2.translate(gl.L(f2), this.U);
            qla.g(this, false, textPaint.getColor(), -gl.L(2.0f), this.W, 0, this.V, this.K, canvas2, false);
            lbaVar = this;
            canvas2.restore();
        } else {
            lbaVar = this;
        }
        ArrayList arrayList = lbaVar.H;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(bkb.v0(bkb.I6, wjbVar));
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i4);
                List<qla> list = (List) lbaVar.I.get(i4);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    if (k96.a0) {
                        f = 8.0f;
                    } else {
                        f = gl.C;
                    }
                    canvas2.translate(gl.L(f), lbaVar.G + i3);
                    Path path = lbaVar.M;
                    path.rewind();
                    if (list != null) {
                        for (qla qlaVar : list) {
                            Rect bounds = qlaVar.getBounds();
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
                        ((qla) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        for (qla qlaVar2 : list) {
                            qlaVar2.draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i3 += staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1);
                }
            }
            if (lbaVar.e.g(canvas2)) {
                lbaVar.invalidate();
            }
        }
        if (lbaVar.k0 != null) {
            canvas2.save();
            if (!k96.a0) {
                f7 = gl.C;
            }
            canvas2.translate(gl.L(f7), lbaVar.j0);
            lbaVar.k0.draw(canvas2);
            gm.drawAnimatedEmojis(canvas, lbaVar.k0, lbaVar.l0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        lbaVar.w.draw(canvas2);
        if (lbaVar.s) {
            lbaVar.r.h(canvas2, null);
        }
        if (lbaVar.E) {
            if (k96.a0) {
                canvas2.drawLine(0.0f, lbaVar.getMeasuredHeight() - 1, lbaVar.getMeasuredWidth() - gl.L(gl.C), lbaVar.getMeasuredHeight() - 1, bkb.j0);
                return;
            }
            canvas.drawLine(gl.L(gl.C), lbaVar.getMeasuredHeight() - 1, lbaVar.getMeasuredWidth(), lbaVar.getMeasuredHeight() - 1, bkb.j0);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lba.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lba.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(kba kbaVar) {
        this.y = kbaVar;
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.d0;
            if (textPaint != null) {
                textPaint.setColor(bkb.v0(bkb.F6, this.m0));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
