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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;
public final class jga extends uia {
    public float v3;
    public float w3;
    public final gga x3;
    public final hga y3;
    public final eja z3;

    public jga(eja ejaVar, Context context, vnb vnbVar, gga ggaVar, hga hgaVar) {
        super(context, vnbVar);
        this.z3 = ejaVar;
        this.x3 = ggaVar;
        this.y3 = hgaVar;
    }

    @Override
    public final void A1(jja jjaVar) {
        float f;
        int messageId = jjaVar.getMessageId();
        gga ggaVar = this.x3;
        if (messageId == ggaVar.J && jjaVar.c.B()) {
            if (!ggaVar.K) {
                ggaVar.L = 0.0f;
                ggaVar.K = true;
            }
            float f2 = ggaVar.L;
            if (f2 < 0.3f) {
                f = f2 / 0.3f;
            } else if (f2 > 0.7f) {
                f = (1.0f - f2) / 0.3f;
            } else {
                f = 1.0f;
            }
            jjaVar.setHighlightProgress(f);
            return;
        }
        jjaVar.setHighlightProgress(0.0f);
    }

    @Override
    public final boolean B1() {
        return this.z3.r1;
    }

    @Override
    public final boolean C1() {
        return eja.j0(this.z3.s1);
    }

    @Override
    public final boolean D1() {
        if (this == this.x3.h) {
            return true;
        }
        return false;
    }

    public final View E1() {
        try {
            for (ViewParent parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                if (parent != this && (parent instanceof RecyclerView)) {
                    return (View) parent;
                }
            }
            return null;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    @Override
    public final Integer X0(int i) {
        j79 adapter = getAdapter();
        qha qhaVar = this.z3.T;
        if (adapter == qhaVar && qhaVar.e > 0 && i == qhaVar.d.size() - 1) {
            return 0;
        }
        return super.X0(i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        int i;
        int i2;
        View childAt2;
        j79 adapter = getAdapter();
        eja ejaVar = this.z3;
        e eVar = ejaVar.y1;
        oha ohaVar = ejaVar.f0;
        aga agaVar = ejaVar.h0;
        gga ggaVar = this.x3;
        if ((adapter == agaVar || getAdapter() == ohaVar) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.S(childAt) == 0) {
            int top = childAt.getTop();
            if (ejaVar.r1) {
                int i3 = ejaVar.s1;
                if (getAdapter() == ohaVar) {
                    i2 = 8;
                } else {
                    i2 = 9;
                }
                if (i3 == i2 && ggaVar.n.getChildCount() > 0 && (childAt2 = ggaVar.n.getChildAt(0)) != null) {
                    ggaVar.n.getClass();
                    if (RecyclerView.S(childAt2) == 0) {
                        top = hl.U1(ejaVar.q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != ohaVar && getMeasuredWidth() > hl.L(60.0f)) {
                boolean z = true;
                if (this.o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.o3 = textPaint;
                    textPaint.setTextSize(hl.L(14.0f));
                    this.o3.setColor(aob.v0(aob.z6, this.o2));
                }
                int measuredWidth = getMeasuredWidth() - hl.L(60.0f);
                StaticLayout staticLayout = this.p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z = (eVar == null || !xc2.V(eVar.getMessagesController().M0(Long.valueOf(-ejaVar.m1)))) ? false : false;
                    if (ejaVar.k0()) {
                        if (z) {
                            i = 2131746360;
                        } else {
                            i = 2131746356;
                        }
                    } else {
                        i = 2131746355;
                    }
                    this.p3 = new StaticLayout(ob6.M0(i, null), this.o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.q3 = 0.0f;
                    this.r3 = measuredWidth;
                    for (int i4 = 0; i4 < this.p3.getLineCount(); i4++) {
                        this.q3 = Math.max(this.q3, this.p3.getLineWidth(i4));
                        this.r3 = Math.min(this.r3, this.p3.getLineLeft(i4));
                    }
                }
                canvas.save();
                uh9.n(this.p3.getHeight() + hl.L(64.0f), 2.0f, top, ((getWidth() - this.q3) / 2.0f) - this.r3, canvas);
                this.p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ggaVar.K) {
            float f = ggaVar.L + 0.010666667f;
            ggaVar.L = f;
            if (f >= 1.0f) {
                ggaVar.L = 0.0f;
                ggaVar.K = false;
                ggaVar.J = 0;
            }
            invalidate();
        }
        ibc ibcVar = this.s3;
        if (ibcVar == null) {
            int currentAccount = eVar.getCurrentAccount();
            ibc[] ibcVarArr = ibc.f;
            if (ibcVarArr[currentAccount] == null) {
                ibcVarArr[currentAccount] = new ibc(currentAccount);
            }
            ibcVar = ibcVarArr[currentAccount];
            this.s3 = ibcVar;
        }
        ibcVar.a(this);
        if (!ejaVar.r1) {
            ejaVar.s1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e eVar = this.z3.y1;
        if (eVar != null && eVar.isInPreviewMode()) {
            this.v3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                eVar.finishPreviewFragment();
                return true;
            }
            if (motionEvent.getAction() == 2) {
                float f = this.w3 - this.v3;
                eVar.movePreviewFragment(f);
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
        eja ejaVar = this.z3;
        boolean j0 = eja.j0(ejaVar.s1);
        int[] iArr = ejaVar.p1;
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
    public final l69 getMovingAdapter() {
        eja ejaVar = this.z3;
        if (eja.j0(ejaVar.s1)) {
            return ejaVar.v1(ejaVar.s1);
        }
        return ejaVar.K;
    }

    @Override
    public final l69 getSupportingAdapter() {
        eja ejaVar = this.z3;
        if (eja.j0(ejaVar.s1)) {
            return ejaVar.w1(ejaVar.s1);
        }
        return ejaVar.L;
    }

    @Override
    public final yha getSupportingListView() {
        return this.x3.n;
    }

    @Override
    public final void n0(int i) {
        e eVar;
        boolean z = this.J1;
        eja ejaVar = this.z3;
        if (z && ejaVar.getSelectedTab() == 11 && (eVar = ejaVar.y1) != null) {
            hl.t1(eVar.getParentActivity().getCurrentFocus());
        }
        ejaVar.C();
        j79 adapter = getAdapter();
        nia niaVar = ejaVar.Q;
        if (adapter == niaVar) {
            ArrayList arrayList = niaVar.h;
            arrayList.clear();
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof wb2) {
                    arrayList.add(((wb2) childAt).getMessageObject());
                }
            }
            uc7.s1(niaVar.d).i(arrayList, niaVar.s.m1);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        gga ggaVar = this.x3;
        this.z3.z(ggaVar, ggaVar.h, this.y3);
        if (ggaVar.F == 0) {
            PhotoViewer.q0().r();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jga.performAccessibilityAction(int, android.os.Bundle):boolean");
    }
}
