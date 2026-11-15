package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.bt0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
import org.telegram.ui.hw;
import org.telegram.ui.mp;
import org.telegram.ui.pw;
import org.telegram.ui.qq;
public final class c1 extends uj0 {
    public final int f8290f3;
    public final Object f8291g3;

    public c1(int i7, Context context, Object obj) {
        super(context, null);
        this.f8290f3 = i7;
        this.f8291g3 = obj;
    }

    @Override
    public boolean E0(float f10) {
        int i7;
        int i10;
        switch (this.f8290f3) {
            case 4:
                ki kiVar = ((kg.g0) this.f8291g3).f33609b;
                int L = org.telegram.messenger.g0.L(30.0f) + kiVar.Z3[0];
                if (!kiVar.f36427b2) {
                    i7 = org.telegram.messenger.g0.f23605m;
                } else {
                    i7 = 0;
                }
                if (f10 < L + i7) {
                    return false;
                }
                return true;
            case 15:
                ki kiVar2 = ((mj) this.f8291g3).f33609b;
                int L2 = org.telegram.messenger.g0.L(30.0f) + kiVar2.Z3[0];
                if (!kiVar2.f36427b2) {
                    i10 = org.telegram.messenger.g0.f23605m;
                } else {
                    i10 = 0;
                }
                if (f10 < L2 + i10) {
                    return false;
                }
                return true;
            default:
                return super.E0(f10);
        }
    }

    @Override
    public boolean F0(View view) {
        switch (this.f8290f3) {
            case 7:
                if (view != ((org.telegram.ui.y6) this.f8291g3).X) {
                    return true;
                }
                return false;
            case 19:
                iz izVar = (iz) this.f8291g3;
                if (izVar.isEnabled() && !((pw) izVar.K).f50376b.f53668l2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f10, float f11) {
        switch (this.f8290f3) {
            case 0:
                ((i1) this.f8291g3).getClass();
                return true;
            case 13:
                return ((org.telegram.ui.Components.ja) this.f8291g3).J0(view, f10, f11);
            case 19:
                if (((iz) this.f8291g3).f35785n) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = ((gz) view).f35112f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 29:
                if (((v61) this.f8291g3).f40308n) {
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF2 = ((t61) view).f39558c;
                    float f13 = L2;
                    if (rectF2.left - f13 < f10 && rectF2.right + f13 > f10) {
                        return false;
                    }
                }
                return true;
            default:
                return super.H0(view, f10, f11);
        }
    }

    @Override
    public boolean R0() {
        switch (this.f8290f3) {
            case 28:
                if (getAdapter() != null && ((e51) this.f8291g3).C1 && getAdapter().b() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.R0();
        }
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f8290f3) {
            case 1:
                return 0;
            case 24:
                return 0;
            default:
                return super.V0(i7);
        }
    }

    @Override
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        switch (this.f8290f3) {
            case 29:
                super.addView(view, i7, layoutParams);
                if (((v61) this.f8291g3).W) {
                    view.setScaleX(0.3f);
                    view.setScaleY(0.3f);
                    view.setAlpha(0.0f);
                    return;
                }
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setAlpha(1.0f);
                return;
            default:
                super.addView(view, i7, layoutParams);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        fi.s0 s0Var;
        boolean z10;
        bj bjVar;
        ArrayList arrayList;
        c1 c1Var;
        ea0 ea0Var;
        int i7;
        c1 c1Var2;
        boolean z11;
        bj currentMessagesGroup;
        bj currentMessagesGroup2;
        switch (this.f8290f3) {
            case 1:
                fi.c2 c2Var = (fi.c2) this.f8291g3;
                int i10 = -1;
                if (!c2Var.f12386g0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof fi.n0) && (s0Var = ((fi.n0) childAt).L) != null) {
                                i10 = s0Var.f12297a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > c2Var.G) {
                    c2Var.G = i10;
                    fi.a aVar = c2Var.f11589j0.H1;
                    if (aVar != null) {
                        aVar.setCount(c2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 5:
                ve veVar = (ve) this.f8291g3;
                c1 c1Var3 = veVar.f18609c;
                if (c1Var3.getLayoutManager() != null && c1Var3.getAdapter() != null && c1Var3.getAdapter().b() != 0) {
                    float L = veVar.h - org.telegram.messenger.g0.L(8.0f);
                    veVar.f18610e = L - org.telegram.messenger.g0.L(16.0f);
                    fh.g gVar = veVar.f18613r;
                    if (gVar != null) {
                        gVar.draw(canvas);
                    }
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(12.0f), L - org.telegram.messenger.g0.L(4.0f), (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(12.0f), L);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), veVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.i8) this.f8291g3).G = false;
                return;
            case 21:
                ea0 ea0Var2 = (ea0) this.f8291g3;
                org.telegram.ui.v8 v8Var = ea0Var2.f34256b;
                boolean z12 = false;
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt2).z3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                bj bjVar2 = null;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = getChildAt(i13);
                    if ((childAt3 instanceof org.telegram.ui.Cells.q1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.q1) childAt3).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != bjVar2)) {
                        bjVar2 = currentMessagesGroup2;
                    }
                }
                int i14 = 0;
                while (i14 < 3) {
                    ka0 ka0Var = ea0Var2.f34260d0;
                    ArrayList arrayList2 = ka0Var.F;
                    c1 c1Var4 = ea0Var2.f34262f;
                    ka0Var.F.clear();
                    int i15 = 2;
                    if (i14 != 2 || c1Var4.W1) {
                        int i16 = z12 ? 1 : 0;
                        ?? r12 = z12;
                        while (true) {
                            boolean z13 = true;
                            if (i16 < childCount) {
                                View childAt4 = c1Var4.getChildAt(i16);
                                if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt4;
                                    if (childAt4.getY() <= c1Var4.getHeight() && childAt4.getY() + childAt4.getHeight() >= 0.0f && (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) != null) {
                                        aj ajVar = currentMessagesGroup.f22717m;
                                        if ((i14 != 0 || currentMessagesGroup.d.size() != 1) && ((i14 != 1 || ajVar.f22522i) && ((i14 != 0 || !q1Var.getMessageObject().Z) && ((i14 != 1 || q1Var.getMessageObject().Z) && ((i14 != i15 || q1Var.f31244za) && (i14 == i15 || !q1Var.f31244za)))))) {
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                ajVar.f22516a = r12;
                                                ajVar.f22517b = r12;
                                                ajVar.f22518c = r12;
                                                ajVar.d = r12;
                                                ajVar.f22525l = r12;
                                                ajVar.f22524k = r12;
                                                ajVar.f22526m = q1Var;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            ajVar.f22524k = q1Var.J2();
                                            ajVar.f22525l = q1Var.I2();
                                            int backgroundDrawableLeft = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                                            int backgroundDrawableRight = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                                            int backgroundDrawableTop = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                                            int backgroundDrawableBottom = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                                            if ((q1Var.getCurrentPosition().f27755l & 4) == 0) {
                                                backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                            }
                                            if ((q1Var.getCurrentPosition().f27755l & 8) == 0) {
                                                backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            int i17 = backgroundDrawableBottom;
                                            if (q1Var.f31244za) {
                                                ajVar.f22526m = q1Var;
                                            }
                                            int i18 = ajVar.f22517b;
                                            if (i18 == 0 || backgroundDrawableTop < i18) {
                                                ajVar.f22517b = backgroundDrawableTop;
                                            }
                                            int i19 = ajVar.d;
                                            if (i19 == 0 || i17 > i19) {
                                                ajVar.d = i17;
                                            }
                                            int i20 = ajVar.f22516a;
                                            if (i20 == 0 || backgroundDrawableLeft < i20) {
                                                ajVar.f22516a = backgroundDrawableLeft;
                                            }
                                            int i21 = ajVar.f22518c;
                                            if (i21 == 0 || backgroundDrawableRight > i21) {
                                                ajVar.f22518c = backgroundDrawableRight;
                                            }
                                        }
                                    }
                                }
                                i16++;
                                i15 = 2;
                                r12 = 0;
                            } else {
                                int i22 = 0;
                                while (i22 < arrayList2.size()) {
                                    bj bjVar3 = (bj) arrayList2.get(i22);
                                    if (bjVar3 == null) {
                                        arrayList = arrayList2;
                                        c1Var2 = c1Var4;
                                        z11 = z13;
                                        ea0Var = ea0Var2;
                                        i7 = i22;
                                    } else {
                                        aj ajVar2 = bjVar3.f22717m;
                                        float S1 = ajVar2.f22526m.S1(z13);
                                        float f10 = ajVar2.f22516a + S1 + ajVar2.f22519e;
                                        float f11 = ajVar2.f22517b + ajVar2.f22520f;
                                        float f12 = ajVar2.f22521g + ajVar2.f22518c + S1;
                                        float f13 = ajVar2.d + ajVar2.h;
                                        if (!ajVar2.f22523j) {
                                            f11 += ajVar2.f22526m.getTranslationY();
                                            f13 += ajVar2.f22526m.getTranslationY();
                                        }
                                        if (f11 < (-org.telegram.messenger.g0.L(20.0f))) {
                                            f11 = -org.telegram.messenger.g0.L(20.0f);
                                        }
                                        float f14 = f11;
                                        if (f13 > org.telegram.messenger.g0.L(20.0f) + c1Var4.getMeasuredHeight()) {
                                            f13 = org.telegram.messenger.g0.L(20.0f) + c1Var4.getMeasuredHeight();
                                        }
                                        float f15 = f13;
                                        if (ajVar2.f22526m.getScaleX() == 1.0f && ajVar2.f22526m.getScaleY() == 1.0f) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            canvas.save();
                                            bjVar = bjVar3;
                                            arrayList = arrayList2;
                                            c1Var = c1Var4;
                                            canvas.scale(ajVar2.f22526m.getScaleX(), ajVar2.f22526m.getScaleY(), com.google.android.gms.internal.vision.e2.A(f12, f10, 2.0f, f10), com.google.android.gms.internal.vision.e2.A(f15, f14, 2.0f, f14));
                                        } else {
                                            bjVar = bjVar3;
                                            arrayList = arrayList2;
                                            c1Var = c1Var4;
                                        }
                                        ea0Var = ea0Var2;
                                        bj bjVar4 = bjVar;
                                        i7 = i22;
                                        c1Var2 = c1Var;
                                        z11 = true;
                                        ajVar2.f22526m.K0(canvas, (int) f10, (int) f14, (int) f12, (int) f15, ajVar2.f22524k, ajVar2.f22525l, false, 0);
                                        ajVar2.f22526m = null;
                                        ajVar2.f22528o = bjVar4.f22709c;
                                        if (z10) {
                                            canvas.restore();
                                            for (int i23 = 0; i23 < childCount; i23++) {
                                                View childAt5 = c1Var2.getChildAt(i23);
                                                if (childAt5 instanceof org.telegram.ui.Cells.q1) {
                                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt5;
                                                    if (q1Var2.getCurrentMessagesGroup() == bjVar4) {
                                                        int left = q1Var2.getLeft();
                                                        int top = q1Var2.getTop();
                                                        childAt5.setPivotX(((f12 - f10) / 2.0f) + (f10 - left));
                                                        childAt5.setPivotY(((f15 - f14) / 2.0f) + (f14 - top));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i22 = i7 + 1;
                                    c1Var4 = c1Var2;
                                    ea0Var2 = ea0Var;
                                    arrayList2 = arrayList;
                                    z13 = z11;
                                }
                            }
                        }
                    }
                    i14++;
                    ea0Var2 = ea0Var2;
                    z12 = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 25:
                hw hwVar = (hw) this.f8291g3;
                v4.b0 b0Var = hwVar.f36041f0;
                v4.k kVar = hwVar.f36039d0;
                cm0 cm0Var = hwVar.f36040e0;
                if (cm0Var != null && kVar != null && b0Var != null && cm0Var.f17099n0) {
                    canvas.save();
                    invalidate();
                    int b10 = cm0Var.b() - 1;
                    int i24 = 0;
                    while (true) {
                        if (i24 < getChildCount()) {
                            View childAt6 = getChildAt(i24);
                            if (RecyclerView.R(childAt6) == b10) {
                                canvas.clipRect(0.0f, 0.0f, getWidth(), childAt6.getTranslationY() + childAt6.getBottom());
                            } else {
                                i24++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (cm0Var != null && kVar != null && b0Var != null && cm0Var.f17099n0) {
                    canvas.restore();
                }
                if (cm0Var != null && cm0Var.f17101p0 != null) {
                    canvas.save();
                    canvas.translate(cm0Var.f17101p0.getLeft(), cm0Var.f17101p0.getTranslationY() + cm0Var.f17101p0.getTop());
                    cm0Var.f17101p0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bi.g2 g2Var;
        v4.e1 K;
        int i7 = this.f8290f3;
        Object obj = this.f8291g3;
        switch (i7) {
            case 1:
                if (((fi.c2) obj).f12386g0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 3:
                if (((hi.d3) obj).L) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                if (motionEvent.getActionMasked() == 0) {
                    dl dlVar = (dl) obj;
                    if (motionEvent.getY() < dlVar.f33982t0 && (g2Var = dlVar.K) != null && g2Var.getVisibility() == 0 && (K = K(0)) != null && motionEvent.getY() >= org.telegram.messenger.g0.L(32.0f) + Math.max(0, K.f58535a.getTop())) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 22:
                mi0 mi0Var = (mi0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && mi0Var.getPullingLeftProgress() > 0.95f) {
                        mi0.a(mi0Var);
                    } else if (mi0Var.C0 != 0.0f) {
                        ValueAnimator valueAnimator = mi0Var.f37301z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(mi0Var.C0, 0.0f);
                        mi0Var.f37301z0 = ofFloat;
                        ofFloat.addUpdateListener(new f60(mi0Var, 5));
                        mi0Var.f37301z0.setDuration(150L);
                        mi0Var.f37301z0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 24:
                LinearLayout linearLayout = ((ul0) obj).f40100f;
                if (linearLayout != null && linearLayout.getAlpha() > 0.5f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: di.c1.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void invalidate() {
        switch (this.f8290f3) {
            case 1:
                super.invalidate();
                ((fi.c2) this.f8291g3).invalidate();
                return;
            case 12:
                super.invalidate();
                View view = ((qq) this.f8291g3).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void k0(int i7) {
        switch (this.f8290f3) {
            case 21:
                if (i7 == 0) {
                    ((ea0) this.f8291g3).f34261e.V();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void l0(int i7) {
        boolean z10;
        switch (this.f8290f3) {
            case 4:
                return;
            case 17:
                im imVar = (im) this.f8291g3;
                imVar.invalidate();
                imVar.f33609b.M1(imVar, i7);
                hm hmVar = imVar.f35652w;
                boolean z11 = true;
                int i10 = 0;
                if (hmVar.f35298y == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = hmVar.d();
                    if (d.length == hmVar.f35298y.length) {
                        while (true) {
                            if (i10 < d.length) {
                                if (d[i10] == hmVar.f35298y[i10]) {
                                    i10++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    hmVar.f35298y = hmVar.d();
                }
                if (z10) {
                    hmVar.invalidate();
                    return;
                }
                return;
            case 21:
                ((ea0) this.f8291g3).f34261e.G();
                return;
            default:
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f8290f3) {
            case 10:
                super.onAttachedToWindow();
                jg.l1 l1Var = ((an) this.f8291g3).f45136b4;
                if (l1Var != null) {
                    ns.f(l1Var.f17185r).c(l1Var, 326);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f8290f3) {
            case 10:
                super.onDetachedFromWindow();
                jg.l1 l1Var = ((an) this.f8291g3).f45136b4;
                if (l1Var != null) {
                    org.telegram.messenger.g0.r(l1Var.F);
                    ns.f(l1Var.f17185r).n(l1Var, 326);
                    return;
                }
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        switch (this.f8290f3) {
            case 2:
                org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                hi.t1 t1Var = (hi.t1) this.f8291g3;
                boolean q10 = p10.q(motionEvent, t1Var.f15136b, t1Var.f15139f, this.f40069o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                    return false;
                }
                return true;
            case 3:
                if (((hi.d3) this.f8291g3).L) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (((mp) this.f8291g3).I) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((yi) this.f8291g3).f33609b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 17:
                if (((im) this.f8291g3).K != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 18:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z10);
                    ((ly) this.f8291g3).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 26:
                boolean q11 = org.telegram.ui.ns.p().q(motionEvent, ((bt0) this.f8291g3).f33372m1, null, this.f40069o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q11) {
                    return false;
                }
                return true;
            case 27:
                bw0 bw0Var = (bw0) this.f8291g3;
                if (bw0Var.M1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean q12 = org.telegram.ui.ns.p().q(motionEvent, bw0Var.n1, bw0Var.f33405h2, this.f40069o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q12) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        gj gjVar;
        switch (this.f8290f3) {
            case 0:
                ((i1) this.f8291g3).I0();
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 9:
                org.telegram.ui.lb lbVar = (org.telegram.ui.lb) this.f8291g3;
                if (lbVar.f48954w != null && lbVar.f48958y != null && (i13 = lbVar.O0) >= 0) {
                    if (lbVar.N0 != 0) {
                        int i14 = 0;
                        while (true) {
                            org.telegram.ui.ib ibVar = lbVar.F;
                            if (i14 < ibVar.d) {
                                if (i14 >= ibVar.f48002f && i14 < ibVar.h) {
                                    ArrayList arrayList = ibVar.f48003n.f48945p0;
                                    gjVar = (gj) arrayList.get((arrayList.size() - (i14 - ibVar.f48002f)) - 1);
                                } else {
                                    gjVar = null;
                                }
                                if (gjVar != null && gjVar.T == lbVar.N0) {
                                    i13 = i14;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    lbVar.f48958y.i1(i13, lbVar.P0, true);
                    lbVar.O0 = -1;
                    lbVar.N0 = 0L;
                }
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 13:
                ((org.telegram.ui.Components.ja) this.f8291g3).I0();
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 14:
                super.onLayout(z10, i7, i10, i11, i12);
                PhotoViewer.p1().r0();
                return;
            case 16:
                super.onLayout(z10, i7, i10, i11, i12);
                dl dlVar = (dl) this.f8291g3;
                dl.a0(dlVar);
                dlVar.i0();
                return;
            case 21:
                ea0 ea0Var = (ea0) this.f8291g3;
                int i15 = ea0Var.f34254a;
                if (ea0Var.L) {
                    if (i15 != 0) {
                        v0(0);
                    }
                    ea0Var.L = false;
                }
                super.onLayout(z10, i7, i10, i11, i12);
                ea0Var.j();
                c1 c1Var = ea0Var.f34262f;
                if (ea0Var.V) {
                    if (c1Var.computeVerticalScrollRange() > c1Var.computeVerticalScrollExtent()) {
                        ea0Var.postDelayed(new v90(ea0Var, 0), 0L);
                    }
                    ea0Var.V = false;
                }
                if (ea0Var.O && i15 == 0) {
                    int i16 = ea0Var.M;
                    int i17 = ea0Var.N;
                    ea0Var.O = false;
                    post(new jg.q(this, i16, i17, 14));
                    return;
                }
                return;
            case 23:
                super.onLayout(z10, i7, i10, i11, i12);
                ((il0) this.f8291g3).a();
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f8290f3) {
            case 1:
                int size = View.MeasureSpec.getSize(i7);
                View.MeasureSpec.getSize(i10);
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i10)));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f8290f3) {
            case 11:
                if (((mp) this.f8291g3).I) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 14:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((yi) this.f8291g3).f33609b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 17:
                if (((im) this.f8291g3).K != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f8290f3) {
            case 6:
                if (!((org.telegram.ui.h1) this.f8291g3).f47567r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((jz) this.f8291g3).f36201t1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 26:
                if (!((bt0) this.f8291g3).f33376r1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 27:
                if (!((bw0) this.f8291g3).f33400b2) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f8290f3) {
            case 19:
                super.setAlpha(f10);
                ((iz) this.f8291g3).invalidate();
                return;
            case 29:
                super.setAlpha(f10);
                ((v61) this.f8291g3).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f8290f3) {
            case 28:
                super.setTranslationY(f10);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public c1(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.f8290f3 = i7;
        this.f8291g3 = obj;
    }

    public c1(ly lyVar, Context context, jy jyVar) {
        super(context, null);
        this.f8290f3 = 18;
        this.f8291g3 = lyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.q6.l(this, 20, org.telegram.ui.ActionBar.j6.f28941i6, this.f40069o2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(jyVar);
    }

    private final void z1(int i7) {
    }
}
