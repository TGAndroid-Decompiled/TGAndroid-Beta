package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public final class sca extends dfa {
    public float v3;
    public float w3;
    public final pca x3;
    public final qca y3;
    public final nfa z3;

    public sca(nfa nfaVar, Context context, wjb wjbVar, pca pcaVar, qca qcaVar) {
        super(context, wjbVar);
        this.z3 = nfaVar;
        this.x3 = pcaVar;
        this.y3 = qcaVar;
    }

    @Override
    public final boolean A1() {
        return this.z3.r1;
    }

    @Override
    public final boolean B1() {
        return nfa.j0(this.z3.s1);
    }

    @Override
    public final boolean C1() {
        if (this == this.x3.h) {
            return true;
        }
        return false;
    }

    public final View D1() {
        try {
            for (ViewParent parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                if (parent != this && (parent instanceof RecyclerView)) {
                    return (View) parent;
                }
            }
            return null;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    @Override
    public final Integer W0(int i) {
        w39 adapter = getAdapter();
        zda zdaVar = this.z3.T;
        if (adapter == zdaVar && zdaVar.e > 0 && i == zdaVar.d.size() - 1) {
            return 0;
        }
        return super.W0(i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        int i;
        int i2;
        View childAt2;
        w39 adapter = getAdapter();
        nfa nfaVar = this.z3;
        d dVar = nfaVar.y1;
        xda xdaVar = nfaVar.f0;
        jca jcaVar = nfaVar.h0;
        pca pcaVar = this.x3;
        if ((adapter == jcaVar || getAdapter() == xdaVar) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (nfaVar.r1) {
                int i3 = nfaVar.s1;
                if (getAdapter() == xdaVar) {
                    i2 = 8;
                } else {
                    i2 = 9;
                }
                if (i3 == i2 && pcaVar.n.getChildCount() > 0 && (childAt2 = pcaVar.n.getChildAt(0)) != null) {
                    pcaVar.n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = gl.U1(nfaVar.q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != xdaVar && getMeasuredWidth() > gl.L(60.0f)) {
                boolean z = true;
                if (this.o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.o3 = textPaint;
                    textPaint.setTextSize(gl.L(14.0f));
                    this.o3.setColor(bkb.v0(bkb.y6, this.o2));
                }
                int measuredWidth = getMeasuredWidth() - gl.L(60.0f);
                StaticLayout staticLayout = this.p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z = (dVar == null || !hc2.V(dVar.getMessagesController().K0(Long.valueOf(-nfaVar.m1)))) ? false : false;
                    if (nfaVar.k0()) {
                        if (z) {
                            i = 2131746440;
                        } else {
                            i = 2131746436;
                        }
                    } else {
                        i = 2131746435;
                    }
                    this.p3 = new StaticLayout(k96.M0(i, null), this.o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.q3 = 0.0f;
                    this.r3 = measuredWidth;
                    for (int i4 = 0; i4 < this.p3.getLineCount(); i4++) {
                        this.q3 = Math.max(this.q3, this.p3.getLineWidth(i4));
                        this.r3 = Math.min(this.r3, this.p3.getLineLeft(i4));
                    }
                }
                canvas.save();
                de9.n(this.p3.getHeight() + gl.L(64.0f), 2.0f, top, ((getWidth() - this.q3) / 2.0f) - this.r3, canvas);
                this.p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (pcaVar.K) {
            float f = pcaVar.L + 0.010666667f;
            pcaVar.L = f;
            if (f >= 1.0f) {
                pcaVar.L = 0.0f;
                pcaVar.K = false;
                pcaVar.J = 0;
            }
            invalidate();
        }
        i7c i7cVar = this.s3;
        if (i7cVar == null) {
            int currentAccount = dVar.getCurrentAccount();
            i7c[] i7cVarArr = i7c.f;
            if (i7cVarArr[currentAccount] == null) {
                i7cVarArr[currentAccount] = new i7c(currentAccount);
            }
            i7cVar = i7cVarArr[currentAccount];
            this.s3 = i7cVar;
        }
        i7cVar.a(this);
        if (!nfaVar.r1) {
            nfaVar.s1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d dVar = this.z3.y1;
        if (dVar != null && dVar.isInPreviewMode()) {
            this.v3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                dVar.finishPreviewFragment();
                return true;
            }
            if (motionEvent.getAction() == 2) {
                float f = this.w3 - this.v3;
                dVar.movePreviewFragment(f);
                if (f < 0.0f) {
                    this.w3 = this.v3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.z3.t1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.z3.q1;
    }

    @Override
    public final int getColumnsCount() {
        nfa nfaVar = this.z3;
        boolean j0 = nfa.j0(nfaVar.s1);
        int[] iArr = nfaVar.p1;
        if (j0) {
            return iArr[1];
        }
        return iArr[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.z3.S1;
    }

    @Override
    public final w29 getMovingAdapter() {
        nfa nfaVar = this.z3;
        if (nfa.j0(nfaVar.s1)) {
            return nfaVar.v1(nfaVar.s1);
        }
        return nfaVar.K;
    }

    @Override
    public final w29 getSupportingAdapter() {
        nfa nfaVar = this.z3;
        if (nfa.j0(nfaVar.s1)) {
            return nfaVar.w1(nfaVar.s1);
        }
        return nfaVar.L;
    }

    @Override
    public final hea getSupportingListView() {
        return this.x3.n;
    }

    @Override
    public final void m0(int i) {
        d dVar;
        boolean z = this.J1;
        nfa nfaVar = this.z3;
        if (z && nfaVar.getSelectedTab() == 11 && (dVar = nfaVar.y1) != null) {
            gl.t1(dVar.getParentActivity().getCurrentFocus());
        }
        nfaVar.C();
        w39 adapter = getAdapter();
        wea weaVar = nfaVar.Q;
        if (adapter == weaVar) {
            ArrayList arrayList = weaVar.h;
            arrayList.clear();
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof gb2) {
                    arrayList.add(((gb2) childAt).getMessageObject());
                }
            }
            na7.q1(weaVar.d).i(arrayList, weaVar.s.m1);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pca pcaVar = this.x3;
        this.z3.z(pcaVar, pcaVar.h, this.y3);
        if (pcaVar.F == 0) {
            PhotoViewer.r0().t();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sca.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override
    public final void z1(qfa qfaVar) {
        float f;
        int messageId = qfaVar.getMessageId();
        pca pcaVar = this.x3;
        if (messageId == pcaVar.J && qfaVar.c.B()) {
            if (!pcaVar.K) {
                pcaVar.L = 0.0f;
                pcaVar.K = true;
            }
            float f2 = pcaVar.L;
            if (f2 < 0.3f) {
                f = f2 / 0.3f;
            } else if (f2 > 0.7f) {
                f = (1.0f - f2) / 0.3f;
            } else {
                f = 1.0f;
            }
            qfaVar.setHighlightProgress(f);
            return;
        }
        qfaVar.setHighlightProgress(0.0f);
    }
}
