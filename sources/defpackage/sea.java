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
public final class sea extends dha {
    public float v3;
    public float w3;
    public final pea x3;
    public final qea y3;
    public final nha z3;

    public sea(nha nhaVar, Context context, ylb ylbVar, pea peaVar, qea qeaVar) {
        super(context, ylbVar);
        this.z3 = nhaVar;
        this.x3 = peaVar;
        this.y3 = qeaVar;
    }

    @Override
    public final boolean A1() {
        return this.z3.r1;
    }

    @Override
    public final boolean B1() {
        return nha.j0(this.z3.s1);
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
            fc4.g(e, true);
            return null;
        }
    }

    @Override
    public final Integer W0(int i) {
        y59 adapter = getAdapter();
        zfa zfaVar = this.z3.T;
        if (adapter == zfaVar && zfaVar.e > 0 && i == zfaVar.d.size() - 1) {
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
        y59 adapter = getAdapter();
        nha nhaVar = this.z3;
        d dVar = nhaVar.y1;
        xfa xfaVar = nhaVar.f0;
        jea jeaVar = nhaVar.h0;
        pea peaVar = this.x3;
        if ((adapter == jeaVar || getAdapter() == xfaVar) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (nhaVar.r1) {
                int i3 = nhaVar.s1;
                if (getAdapter() == xfaVar) {
                    i2 = 8;
                } else {
                    i2 = 9;
                }
                if (i3 == i2 && peaVar.n.getChildCount() > 0 && (childAt2 = peaVar.n.getChildAt(0)) != null) {
                    peaVar.n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = gm.U1(nhaVar.q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != xfaVar && getMeasuredWidth() > gm.L(60.0f)) {
                boolean z = true;
                if (this.o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.o3 = textPaint;
                    textPaint.setTextSize(gm.L(14.0f));
                    this.o3.setColor(cmb.v0(cmb.y6, this.o2));
                }
                int measuredWidth = getMeasuredWidth() - gm.L(60.0f);
                StaticLayout staticLayout = this.p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z = (dVar == null || !sd2.V(dVar.getMessagesController().L0(Long.valueOf(-nhaVar.m1)))) ? false : false;
                    if (nhaVar.k0()) {
                        if (z) {
                            i = 2131746366;
                        } else {
                            i = 2131746362;
                        }
                    } else {
                        i = 2131746361;
                    }
                    this.p3 = new StaticLayout(jb6.M0(i, null), this.o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.q3 = 0.0f;
                    this.r3 = measuredWidth;
                    for (int i4 = 0; i4 < this.p3.getLineCount(); i4++) {
                        this.q3 = Math.max(this.q3, this.p3.getLineWidth(i4));
                        this.r3 = Math.min(this.r3, this.p3.getLineLeft(i4));
                    }
                }
                canvas.save();
                hg9.m(this.p3.getHeight() + gm.L(64.0f), 2.0f, top, ((getWidth() - this.q3) / 2.0f) - this.r3, canvas);
                this.p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (peaVar.K) {
            float f = peaVar.L + 0.010666667f;
            peaVar.L = f;
            if (f >= 1.0f) {
                peaVar.L = 0.0f;
                peaVar.K = false;
                peaVar.J = 0;
            }
            invalidate();
        }
        j9c j9cVar = this.s3;
        if (j9cVar == null) {
            int currentAccount = dVar.getCurrentAccount();
            j9c[] j9cVarArr = j9c.f;
            if (j9cVarArr[currentAccount] == null) {
                j9cVarArr[currentAccount] = new j9c(currentAccount);
            }
            j9cVar = j9cVarArr[currentAccount];
            this.s3 = j9cVar;
        }
        j9cVar.a(this);
        if (!nhaVar.r1) {
            nhaVar.s1 = -1;
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
        nha nhaVar = this.z3;
        boolean j0 = nha.j0(nhaVar.s1);
        int[] iArr = nhaVar.p1;
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
    public final z49 getMovingAdapter() {
        nha nhaVar = this.z3;
        if (nha.j0(nhaVar.s1)) {
            return nhaVar.v1(nhaVar.s1);
        }
        return nhaVar.K;
    }

    @Override
    public final z49 getSupportingAdapter() {
        nha nhaVar = this.z3;
        if (nha.j0(nhaVar.s1)) {
            return nhaVar.w1(nhaVar.s1);
        }
        return nhaVar.L;
    }

    @Override
    public final hga getSupportingListView() {
        return this.x3.n;
    }

    @Override
    public final void m0(int i) {
        d dVar;
        boolean z = this.J1;
        nha nhaVar = this.z3;
        if (z && nhaVar.getSelectedTab() == 11 && (dVar = nhaVar.y1) != null) {
            gm.t1(dVar.getParentActivity().getCurrentFocus());
        }
        nhaVar.C();
        y59 adapter = getAdapter();
        wga wgaVar = nhaVar.Q;
        if (adapter == wgaVar) {
            ArrayList arrayList = wgaVar.h;
            arrayList.clear();
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof rc2) {
                    arrayList.add(((rc2) childAt).getMessageObject());
                }
            }
            oc7.r1(wgaVar.d).i(arrayList, wgaVar.s.m1);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pea peaVar = this.x3;
        this.z3.z(peaVar, peaVar.h, this.y3);
        if (peaVar.F == 0) {
            PhotoViewer.r0().r();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sea.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override
    public final void z1(sha shaVar) {
        float f;
        int messageId = shaVar.getMessageId();
        pea peaVar = this.x3;
        if (messageId == peaVar.J && shaVar.c.B()) {
            if (!peaVar.K) {
                peaVar.L = 0.0f;
                peaVar.K = true;
            }
            float f2 = peaVar.L;
            if (f2 < 0.3f) {
                f = f2 / 0.3f;
            } else if (f2 > 0.7f) {
                f = (1.0f - f2) / 0.3f;
            } else {
                f = 1.0f;
            }
            shaVar.setHighlightProgress(f);
            return;
        }
        shaVar.setHighlightProgress(0.0f);
    }
}
