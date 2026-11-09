package lh;

import ai.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.n;
import bg.q0;
import bg.s0;
import bg.u0;
import c8.ha;
import c8.ka;
import fi.m3;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.xq;
import org.telegram.ui.cn;
import org.telegram.ui.fe;
import org.telegram.ui.fh;
public class e extends FrameLayout implements te.b, b6 {
    public static final int[] H = {2131232354, 2131231503, 2131231505, 2131232182, 2131232182};
    public static final int[] I = {0};
    public static final int[] J = {1, 2, 3, 4};
    public static final RectF K = new RectF();
    public float D;
    public float E;
    public final Paint F;
    public int G;
    public final n[] f18357a;
    public final View.OnClickListener[] f18358b;
    public final fe[] f18359c;
    public d d;
    public final FrameLayout f18360e;
    public final HashSet f18361f;
    public final g6 h;
    public final dh.c f18362n;
    public final gh.a f18363r;
    public fh.g f18364s;
    public final te.a f18365w;
    public final te.a f18366x;
    public float f18367y;

    public e(Context context, dh.c cVar, gh.a aVar, g6 g6Var) {
        super(context);
        this.f18357a = new n[5];
        this.f18358b = new View.OnClickListener[5];
        this.f18359c = new fe[5];
        this.f18361f = new HashSet();
        xq xqVar = xq.h;
        this.f18365w = new te.a(99, this, xqVar, 320L, false);
        this.f18366x = new te.a(100, this, xqVar, 320L, false);
        this.F = new Paint(1);
        this.G = 0;
        this.f18362n = cVar;
        this.f18363r = aVar;
        this.h = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18360e = frameLayout;
        frameLayout.setClipToOutline(true);
        q0 q0Var = u0.f3380a;
        frameLayout.setOutlineProvider(new s0(0, g0.L(22.0f)));
        addView(frameLayout, ha.e(-1, 44, 16));
    }

    @Override
    public final void F(float f10, int i7) {
        n nVar;
        m3 m3Var;
        if (i7 == 99 || i7 == 100) {
            invalidate();
        }
        int i10 = i7 >> 16;
        int i11 = i7 & 65535;
        if (i10 >= 0) {
            n[] nVarArr = this.f18357a;
            if (i10 < nVarArr.length && (nVar = nVarArr[i10]) != null && i11 == 1 && ((te.a) nVar.d).f55500f) {
                fe feVar = this.f18359c[i10];
                if (feVar != null) {
                    final kh.a aVar = (kh.a) nVar.f1847c;
                    boolean z9 = nVar.f1846b;
                    int i12 = feVar.f45691a;
                    final cn cnVar = feVar.f45692b;
                    switch (i12) {
                        case 28:
                            if (cnVar.X0 == null && !z9 && (((m3Var = cnVar.Z0) == null || !m3Var.V) && a30.h.c())) {
                                g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i13 = r3;
                                        kh.a aVar2 = aVar;
                                        cn cnVar2 = cnVar;
                                        switch (i13) {
                                            case 0:
                                                if (cnVar2.getParentActivity() != null) {
                                                    float f11 = cnVar2.f44661w.f(2).d / org.telegram.messenger.g0.f22562p;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (cnVar2.l1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.f22562p;
                                                    fi.m3 m3Var2 = new fi.m3(cnVar2.getParentActivity(), 3);
                                                    cnVar2.Z0 = m3Var2;
                                                    m3Var2.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                    cnVar2.Z0.l(cnVar2.K);
                                                    cnVar2.Z0.r(false);
                                                    fi.m3 m3Var3 = cnVar2.Z0;
                                                    String M0 = org.telegram.messenger.id.M0(2131744424, null);
                                                    if (m3Var3.getMeasuredWidth() < 0) {
                                                        m3Var3.G = M0;
                                                    } else {
                                                        m3Var3.H.t(M0, !org.telegram.messenger.id.f23157a0, true);
                                                    }
                                                    cnVar2.Z0.o(1.0f, (-width) + 7.33f);
                                                    cnVar2.l1.addView(cnVar2.Z0, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    fi.m3 m3Var4 = cnVar2.Z0;
                                                    m3Var4.f12437q0 = new xf(cnVar2, 14);
                                                    m3Var4.w();
                                                    org.telegram.ui.Components.a30.f31691f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (cnVar2.getParentActivity() != null) {
                                                    float f12 = cnVar2.f44661w.f(2).d / org.telegram.messenger.g0.f22562p;
                                                    float width2 = ((aVar2.getWidth() / 2.0f) + (cnVar2.l1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.f22562p;
                                                    fi.m3 m3Var5 = new fi.m3(cnVar2.getParentActivity(), 3);
                                                    cnVar2.X0 = m3Var5;
                                                    m3Var5.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                    cnVar2.X0.l(cnVar2.K);
                                                    cnVar2.X0.r(false);
                                                    cnVar2.X0.u(org.telegram.messenger.id.M0(2131750251, null));
                                                    cnVar2.X0.o(1.0f, (-width2) + 7.33f);
                                                    cnVar2.l1.addView(cnVar2.X0, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                    fi.m3 m3Var6 = cnVar2.X0;
                                                    m3Var6.f12437q0 = new af(cnVar2, 19);
                                                    m3Var6.w();
                                                    org.telegram.ui.Components.a30.h.b();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, 400L);
                                break;
                            }
                            break;
                        default:
                            if (cnVar.Z0 == null && !z9 && a30.f31691f.c()) {
                                g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i13 = r3;
                                        kh.a aVar2 = aVar;
                                        cn cnVar2 = cnVar;
                                        switch (i13) {
                                            case 0:
                                                if (cnVar2.getParentActivity() != null) {
                                                    float f11 = cnVar2.f44661w.f(2).d / org.telegram.messenger.g0.f22562p;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (cnVar2.l1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.f22562p;
                                                    fi.m3 m3Var2 = new fi.m3(cnVar2.getParentActivity(), 3);
                                                    cnVar2.Z0 = m3Var2;
                                                    m3Var2.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                    cnVar2.Z0.l(cnVar2.K);
                                                    cnVar2.Z0.r(false);
                                                    fi.m3 m3Var3 = cnVar2.Z0;
                                                    String M0 = org.telegram.messenger.id.M0(2131744424, null);
                                                    if (m3Var3.getMeasuredWidth() < 0) {
                                                        m3Var3.G = M0;
                                                    } else {
                                                        m3Var3.H.t(M0, !org.telegram.messenger.id.f23157a0, true);
                                                    }
                                                    cnVar2.Z0.o(1.0f, (-width) + 7.33f);
                                                    cnVar2.l1.addView(cnVar2.Z0, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    fi.m3 m3Var4 = cnVar2.Z0;
                                                    m3Var4.f12437q0 = new xf(cnVar2, 14);
                                                    m3Var4.w();
                                                    org.telegram.ui.Components.a30.f31691f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (cnVar2.getParentActivity() != null) {
                                                    float f12 = cnVar2.f44661w.f(2).d / org.telegram.messenger.g0.f22562p;
                                                    float width2 = ((aVar2.getWidth() / 2.0f) + (cnVar2.l1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.f22562p;
                                                    fi.m3 m3Var5 = new fi.m3(cnVar2.getParentActivity(), 3);
                                                    cnVar2.X0 = m3Var5;
                                                    m3Var5.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                    cnVar2.X0.l(cnVar2.K);
                                                    cnVar2.X0.r(false);
                                                    cnVar2.X0.u(org.telegram.messenger.id.M0(2131750251, null));
                                                    cnVar2.X0.o(1.0f, (-width2) + 7.33f);
                                                    cnVar2.l1.addView(cnVar2.X0, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                    fi.m3 m3Var6 = cnVar2.X0;
                                                    m3Var6.f12437q0 = new af(cnVar2, 19);
                                                    m3Var6.w();
                                                    org.telegram.ui.Components.a30.h.b();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, 400L);
                                break;
                            }
                            break;
                    }
                }
                nVar.f1846b = true;
            }
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 99) {
            invalidate();
            return;
        }
        if (i7 == 100) {
            a();
            invalidate();
        }
        int i10 = i7 >> 16;
        int i11 = i7 & 65535;
        if (i10 >= 0) {
            n[] nVarArr = this.f18357a;
            if (i10 < nVarArr.length && nVarArr[i10] != null && i11 == 1) {
                b(true);
                a();
                invalidate();
            }
        }
    }

    public final void a() {
        int[] iArr;
        View childAt;
        int i7;
        float f10 = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        n[] nVarArr = this.f18357a;
        for (n nVar : nVarArr) {
            if (nVar != null) {
                kh.a aVar = (kh.a) nVar.f1847c;
                float f11 = ((te.a) nVar.d).f55499e * this.f18367y;
                if (f11 > 0.0f) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                aVar.setVisibility(i7);
                aVar.setAlpha(f11);
                aVar.setScaleX(g0.T1(0.4f, 1.0f, f11));
                aVar.setScaleY(g0.T1(0.4f, 1.0f, f11));
            }
        }
        int[] iArr2 = I;
        n nVar2 = nVarArr[iArr2[0]];
        if (nVar2 != null) {
            float L = ((te.a) nVar2.d).f55499e * g0.L(54.0f);
            ((kh.a) nVar2.f1847c).setTranslationX(g0.L(1.0f) + this.D);
            this.D += L;
        }
        int i10 = 0;
        while (true) {
            iArr = J;
            if (i10 >= 4) {
                break;
            }
            n nVar3 = nVarArr[iArr[i10]];
            if (nVar3 != null) {
                kh.a aVar2 = (kh.a) nVar3.f1847c;
                float L2 = ((te.a) nVar3.d).f55499e * g0.L(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - g0.L(1.0f)) - this.E);
                this.E += L2;
            }
            i10++;
        }
        if (this.f18367y < 1.0f) {
            n nVar4 = nVarArr[iArr2[0]];
            if (nVar4 != null) {
                kh.a aVar3 = (kh.a) nVar4.f1847c;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f18367y) * this.D));
            }
            for (int i11 = 0; i11 < 4; i11++) {
                n nVar5 = nVarArr[iArr[i11]];
                if (nVar5 != null) {
                    kh.a aVar4 = (kh.a) nVar5.f1847c;
                    aVar4.setTranslationX(((1.0f - this.f18367y) * this.E) + aVar4.getTranslationX());
                }
            }
            float f12 = this.D;
            float f13 = this.f18367y;
            this.D = f12 * f13;
            this.E *= f13;
        }
        float f14 = this.f18366x.f55499e;
        if (f14 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i12 = 0; i12 < getContainer().getChildCount(); i12++) {
                if (this.f18361f.contains(getContainer().getChildAt(i12))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f10 = Math.max(f10, childAt.getRight());
                }
            }
            if (measuredWidth > f10) {
                f10 = (measuredWidth + f10) / 2.0f;
                measuredWidth = f10;
            }
            this.D = g0.T1(this.D, measuredWidth - g0.L(3.33f), f14);
            this.E = g0.T1(this.E, (getMeasuredWidth() - f10) - g0.L(17.66f), f14);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f15 = this.D;
            float f16 = this.E;
            jh.f fVar = ((fh) dVar).f45717a.T;
            fVar.f17048y = f15;
            fVar.D = f16;
            fVar.invalidate();
        }
    }

    public final void b(boolean z9) {
        int i7;
        int i10;
        int L = g0.L(7.0f);
        int L2 = g0.L(7.0f);
        int i11 = I[0];
        n[] nVarArr = this.f18357a;
        n nVar = nVarArr[i11];
        if (nVar != null) {
            if (((te.a) nVar.d).f55500f) {
                i10 = g0.L(54.0f);
            } else {
                i10 = 0;
            }
            L += i10;
        }
        for (int i12 = 0; i12 < 4; i12++) {
            n nVar2 = nVarArr[J[i12]];
            if (nVar2 != null) {
                if (((te.a) nVar2.d).f55500f) {
                    i7 = g0.L(54.0f);
                } else {
                    i7 = 0;
                }
                L2 += i7;
            }
        }
        FrameLayout frameLayout = this.f18360e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin != L || marginLayoutParams.rightMargin != L2) {
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L2;
            if (z9) {
                frameLayout.requestLayout();
            }
        }
    }

    public final void c(int i7, boolean z9, boolean z10) {
        n nVar;
        if (i7 >= 0) {
            n[] nVarArr = this.f18357a;
            if (i7 < nVarArr.length && ((nVar = nVarArr[i7]) != null || z9)) {
                if (nVar == null) {
                    te.a aVar = new te.a((i7 << 16) | 1, this, xq.h, 300L, false);
                    kh.a d = kh.a.d(getContext(), this.f18362n, this.f18363r, this.h, H[i7], 48);
                    if (i7 == 1) {
                        d.setContentDescription(id.M0(2131746735, null));
                    } else if (i7 == 2) {
                        d.setContentDescription(id.M0(2131752337, null));
                    } else if (i7 == 0) {
                        d.setContentDescription(id.M0(2131745836, null));
                    } else if (i7 == 3) {
                        d.setContentDescription(id.M0(2131752880, null));
                    }
                    ka.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new v(this, i7, 5));
                    addView(d, ha.c(56.0f, 56));
                    nVarArr[i7] = new n(d, aVar);
                    a();
                }
                ((te.a) nVarArr[i7].d).a(z9, z10);
            }
        }
    }

    public final void d(boolean z9) {
        boolean z10 = false;
        z10 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z11 = false;
            for (int i7 = 0; i7 < getContainer().getChildCount(); i7++) {
                View childAt = getContainer().getChildAt(i7);
                if (this.f18361f.contains(childAt) && childAt.getVisibility() == 0) {
                    z11 = true;
                }
            }
            z10 = z11;
        }
        this.f18366x.a(z10, z9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7 = (int) (this.f18367y * 255.0f * this.f18365w.f55499e);
        if (i7 > 0) {
            float measuredWidth = (getMeasuredWidth() - g0.L(10.0f)) - this.E;
            float measuredHeight = getMeasuredHeight() - g0.L(9.0f);
            RectF rectF = K;
            rectF.set(this.D + g0.L(10.0f), g0.L(9.0f), measuredWidth, measuredHeight);
            int i10 = this.G;
            Paint paint = this.F;
            paint.setColor(i10);
            paint.setAlpha(i7);
            canvas.drawRoundRect(rectF, g0.L(19.0f), g0.L(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f18360e && this.f18364s != null) {
            RectF rectF = K;
            rectF.set(this.D + g0.L(1.0f), 0.0f, (getMeasuredWidth() - g0.L(1.0f)) - this.E, getMeasuredHeight());
            Rect rect = g0.Q;
            rectF.round(rect);
            this.f18364s.setBounds(rect);
            this.f18364s.draw(canvas);
        }
        return super.drawChild(canvas, view, j3);
    }

    public FrameLayout getContainer() {
        return this.f18360e;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        a();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        b(false);
        super.onMeasure(i7, i10);
        a();
    }

    public void setAccentColor(int i7) {
        this.G = i7;
    }

    public void setOnButtonsTotalWidthChanged(d dVar) {
        this.d = dVar;
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.f18367y != f10) {
            this.f18367y = f10;
            a();
            invalidate();
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        d(false);
    }

    @Override
    public final void updateColors() {
        n[] nVarArr;
        kh.a aVar;
        for (n nVar : this.f18357a) {
            if (nVar != null && (aVar = (kh.a) nVar.f1847c) != null) {
                aVar.updateColors();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
