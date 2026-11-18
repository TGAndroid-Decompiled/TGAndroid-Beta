package lh;

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
import c8.ma;
import c8.ra;
import ci.q;
import hi.m3;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.lr;
import org.telegram.ui.bn;
import org.telegram.ui.dh;
import org.telegram.ui.ee;
public class e extends FrameLayout implements te.b, c6 {
    public static final int[] I = {2131232356, 2131231504, 2131231506, 2131232184, 2131232184};
    public static final int[] J = {0};
    public static final int[] K = {1, 2, 3, 4};
    public static final RectF L = new RectF();
    public float E;
    public float F;
    public final Paint G;
    public int H;
    public final n[] f19857a;
    public final View.OnClickListener[] f19858b;
    public final ee[] f19859c;
    public d d;
    public final FrameLayout f19860e;
    public final HashSet f19861f;
    public final i6 h;
    public final dh.c f19862n;
    public final gh.a f19863r;
    public fh.g f19864s;
    public final te.a f19865w;
    public final te.a f19866x;
    public float f19867y;

    public e(Context context, dh.c cVar, gh.a aVar, i6 i6Var) {
        super(context);
        this.f19857a = new n[5];
        this.f19858b = new View.OnClickListener[5];
        this.f19859c = new ee[5];
        this.f19861f = new HashSet();
        lr lrVar = lr.h;
        this.f19865w = new te.a(99, this, lrVar, 320L, false);
        this.f19866x = new te.a(100, this, lrVar, 320L, false);
        this.G = new Paint(1);
        this.H = 0;
        this.f19862n = cVar;
        this.f19863r = aVar;
        this.h = i6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19860e = frameLayout;
        frameLayout.setClipToOutline(true);
        q0 q0Var = u0.f3342a;
        frameLayout.setOutlineProvider(new s0(0, g0.L(22.0f)));
        addView(frameLayout, ma.e(-1, 44, 16));
    }

    @Override
    public final void D(float f10, int i7) {
        n nVar;
        m3 m3Var;
        if (i7 == 99 || i7 == 100) {
            invalidate();
        }
        int i10 = i7 >> 16;
        int i11 = i7 & 65535;
        if (i10 >= 0) {
            n[] nVarArr = this.f19857a;
            if (i10 < nVarArr.length && (nVar = nVarArr[i10]) != null && i11 == 1 && ((te.a) nVar.d).f57658f) {
                ee eeVar = this.f19859c[i10];
                if (eeVar != null) {
                    final kh.a aVar = (kh.a) nVar.f1788c;
                    boolean z10 = nVar.f1787b;
                    int i12 = eeVar.f47209a;
                    final bn bnVar = eeVar.f47210b;
                    switch (i12) {
                        case 28:
                            if (bnVar.Y0 == null && !z10 && (((m3Var = bnVar.f45933a1) == null || !m3Var.W) && k30.h.c())) {
                                g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i13 = r3;
                                        kh.a aVar2 = aVar;
                                        bn bnVar2 = bnVar;
                                        switch (i13) {
                                            case 0:
                                                if (bnVar2.getParentActivity() != null) {
                                                    float f11 = bnVar2.f46218w.f(2).d / org.telegram.messenger.g0.f24120p;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (bnVar2.f46093m1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.f24120p;
                                                    hi.m3 m3Var2 = new hi.m3(bnVar2.getParentActivity(), 3);
                                                    bnVar2.f45933a1 = m3Var2;
                                                    m3Var2.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                    bnVar2.f45933a1.l(bnVar2.L);
                                                    bnVar2.f45933a1.r(false);
                                                    hi.m3 m3Var3 = bnVar2.f45933a1;
                                                    String M0 = org.telegram.messenger.gd.M0(2131744189, null);
                                                    if (m3Var3.getMeasuredWidth() < 0) {
                                                        m3Var3.H = M0;
                                                    } else {
                                                        m3Var3.I.t(M0, !org.telegram.messenger.gd.f24216a0, true);
                                                    }
                                                    bnVar2.f45933a1.o(1.0f, (-width) + 7.33f);
                                                    bnVar2.f46093m1.addView(bnVar2.f45933a1, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    hi.m3 m3Var4 = bnVar2.f45933a1;
                                                    m3Var4.f15014r0 = new vf(bnVar2, 14);
                                                    m3Var4.x();
                                                    org.telegram.ui.Components.k30.f36655f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (bnVar2.getParentActivity() != null) {
                                                    float f12 = bnVar2.f46218w.f(2).d / org.telegram.messenger.g0.f24120p;
                                                    float width2 = ((aVar2.getWidth() / 2.0f) + (bnVar2.f46093m1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.f24120p;
                                                    hi.m3 m3Var5 = new hi.m3(bnVar2.getParentActivity(), 3);
                                                    bnVar2.Y0 = m3Var5;
                                                    m3Var5.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                    bnVar2.Y0.l(bnVar2.L);
                                                    bnVar2.Y0.r(false);
                                                    bnVar2.Y0.v(org.telegram.messenger.gd.M0(2131750235, null));
                                                    bnVar2.Y0.o(1.0f, (-width2) + 7.33f);
                                                    bnVar2.f46093m1.addView(bnVar2.Y0, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                    hi.m3 m3Var6 = bnVar2.Y0;
                                                    m3Var6.f15014r0 = new af(bnVar2, 17);
                                                    m3Var6.x();
                                                    org.telegram.ui.Components.k30.h.b();
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
                            if (bnVar.f45933a1 == null && !z10 && k30.f36655f.c()) {
                                g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i13 = r3;
                                        kh.a aVar2 = aVar;
                                        bn bnVar2 = bnVar;
                                        switch (i13) {
                                            case 0:
                                                if (bnVar2.getParentActivity() != null) {
                                                    float f11 = bnVar2.f46218w.f(2).d / org.telegram.messenger.g0.f24120p;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (bnVar2.f46093m1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.f24120p;
                                                    hi.m3 m3Var2 = new hi.m3(bnVar2.getParentActivity(), 3);
                                                    bnVar2.f45933a1 = m3Var2;
                                                    m3Var2.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                    bnVar2.f45933a1.l(bnVar2.L);
                                                    bnVar2.f45933a1.r(false);
                                                    hi.m3 m3Var3 = bnVar2.f45933a1;
                                                    String M0 = org.telegram.messenger.gd.M0(2131744189, null);
                                                    if (m3Var3.getMeasuredWidth() < 0) {
                                                        m3Var3.H = M0;
                                                    } else {
                                                        m3Var3.I.t(M0, !org.telegram.messenger.gd.f24216a0, true);
                                                    }
                                                    bnVar2.f45933a1.o(1.0f, (-width) + 7.33f);
                                                    bnVar2.f46093m1.addView(bnVar2.f45933a1, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    hi.m3 m3Var4 = bnVar2.f45933a1;
                                                    m3Var4.f15014r0 = new vf(bnVar2, 14);
                                                    m3Var4.x();
                                                    org.telegram.ui.Components.k30.f36655f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (bnVar2.getParentActivity() != null) {
                                                    float f12 = bnVar2.f46218w.f(2).d / org.telegram.messenger.g0.f24120p;
                                                    float width2 = ((aVar2.getWidth() / 2.0f) + (bnVar2.f46093m1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.f24120p;
                                                    hi.m3 m3Var5 = new hi.m3(bnVar2.getParentActivity(), 3);
                                                    bnVar2.Y0 = m3Var5;
                                                    m3Var5.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                    bnVar2.Y0.l(bnVar2.L);
                                                    bnVar2.Y0.r(false);
                                                    bnVar2.Y0.v(org.telegram.messenger.gd.M0(2131750235, null));
                                                    bnVar2.Y0.o(1.0f, (-width2) + 7.33f);
                                                    bnVar2.f46093m1.addView(bnVar2.Y0, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                    hi.m3 m3Var6 = bnVar2.Y0;
                                                    m3Var6.f15014r0 = new af(bnVar2, 17);
                                                    m3Var6.x();
                                                    org.telegram.ui.Components.k30.h.b();
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
                nVar.f1787b = true;
            }
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
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
            n[] nVarArr = this.f19857a;
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
        this.E = 0.0f;
        this.F = 0.0f;
        n[] nVarArr = this.f19857a;
        for (n nVar : nVarArr) {
            if (nVar != null) {
                kh.a aVar = (kh.a) nVar.f1788c;
                float f11 = ((te.a) nVar.d).f57657e * this.f19867y;
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
        int[] iArr2 = J;
        n nVar2 = nVarArr[iArr2[0]];
        if (nVar2 != null) {
            float L2 = ((te.a) nVar2.d).f57657e * g0.L(54.0f);
            ((kh.a) nVar2.f1788c).setTranslationX(g0.L(1.0f) + this.E);
            this.E += L2;
        }
        int i10 = 0;
        while (true) {
            iArr = K;
            if (i10 >= 4) {
                break;
            }
            n nVar3 = nVarArr[iArr[i10]];
            if (nVar3 != null) {
                kh.a aVar2 = (kh.a) nVar3.f1788c;
                float L3 = ((te.a) nVar3.d).f57657e * g0.L(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - g0.L(1.0f)) - this.F);
                this.F += L3;
            }
            i10++;
        }
        if (this.f19867y < 1.0f) {
            n nVar4 = nVarArr[iArr2[0]];
            if (nVar4 != null) {
                kh.a aVar3 = (kh.a) nVar4.f1788c;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f19867y) * this.E));
            }
            for (int i11 = 0; i11 < 4; i11++) {
                n nVar5 = nVarArr[iArr[i11]];
                if (nVar5 != null) {
                    kh.a aVar4 = (kh.a) nVar5.f1788c;
                    aVar4.setTranslationX(((1.0f - this.f19867y) * this.F) + aVar4.getTranslationX());
                }
            }
            float f12 = this.E;
            float f13 = this.f19867y;
            this.E = f12 * f13;
            this.F *= f13;
        }
        float f14 = this.f19866x.f57657e;
        if (f14 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i12 = 0; i12 < getContainer().getChildCount(); i12++) {
                if (this.f19861f.contains(getContainer().getChildAt(i12))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f10 = Math.max(f10, childAt.getRight());
                }
            }
            if (measuredWidth > f10) {
                f10 = (measuredWidth + f10) / 2.0f;
                measuredWidth = f10;
            }
            this.E = g0.T1(this.E, measuredWidth - g0.L(3.33f), f14);
            this.F = g0.T1(this.F, (getMeasuredWidth() - f10) - g0.L(17.66f), f14);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f15 = this.E;
            float f16 = this.F;
            jh.f fVar = ((dh) dVar).f46977a.U;
            fVar.F = f15;
            fVar.G = f16;
            fVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int i7;
        int i10;
        int L2 = g0.L(7.0f);
        int L3 = g0.L(7.0f);
        int i11 = J[0];
        n[] nVarArr = this.f19857a;
        n nVar = nVarArr[i11];
        if (nVar != null) {
            if (((te.a) nVar.d).f57658f) {
                i10 = g0.L(54.0f);
            } else {
                i10 = 0;
            }
            L2 += i10;
        }
        for (int i12 = 0; i12 < 4; i12++) {
            n nVar2 = nVarArr[K[i12]];
            if (nVar2 != null) {
                if (((te.a) nVar2.d).f57658f) {
                    i7 = g0.L(54.0f);
                } else {
                    i7 = 0;
                }
                L3 += i7;
            }
        }
        FrameLayout frameLayout = this.f19860e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin != L2 || marginLayoutParams.rightMargin != L3) {
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L3;
            if (z10) {
                frameLayout.requestLayout();
            }
        }
    }

    public final void c(int i7, boolean z10, boolean z11) {
        n nVar;
        if (i7 >= 0) {
            n[] nVarArr = this.f19857a;
            if (i7 < nVarArr.length && ((nVar = nVarArr[i7]) != null || z10)) {
                if (nVar == null) {
                    te.a aVar = new te.a((i7 << 16) | 1, this, lr.h, 300L, false);
                    kh.a d = kh.a.d(getContext(), this.f19862n, this.f19863r, this.h, I[i7], 48);
                    if (i7 == 1) {
                        d.setContentDescription(gd.M0(2131746542, null));
                    } else if (i7 == 2) {
                        d.setContentDescription(gd.M0(2131752326, null));
                    } else if (i7 == 0) {
                        d.setContentDescription(gd.M0(2131745641, null));
                    } else if (i7 == 3) {
                        d.setContentDescription(gd.M0(2131752869, null));
                    }
                    ra.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new q(this, i7, 5));
                    addView(d, ma.c(56.0f, 56));
                    nVarArr[i7] = new n(d, aVar);
                    a();
                }
                ((te.a) nVarArr[i7].d).a(z10, z11);
            }
        }
    }

    public final void d(boolean z10) {
        boolean z11 = false;
        z11 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z12 = false;
            for (int i7 = 0; i7 < getContainer().getChildCount(); i7++) {
                View childAt = getContainer().getChildAt(i7);
                if (this.f19861f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.f19866x.a(z11, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7 = (int) (this.f19867y * 255.0f * this.f19865w.f57657e);
        if (i7 > 0) {
            float measuredWidth = (getMeasuredWidth() - g0.L(10.0f)) - this.F;
            float measuredHeight = getMeasuredHeight() - g0.L(9.0f);
            RectF rectF = L;
            rectF.set(this.E + g0.L(10.0f), g0.L(9.0f), measuredWidth, measuredHeight);
            int i10 = this.H;
            Paint paint = this.G;
            paint.setColor(i10);
            paint.setAlpha(i7);
            canvas.drawRoundRect(rectF, g0.L(19.0f), g0.L(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f19860e && this.f19864s != null) {
            RectF rectF = L;
            rectF.set(this.E + g0.L(1.0f), 0.0f, (getMeasuredWidth() - g0.L(1.0f)) - this.F, getMeasuredHeight());
            Rect rect = g0.Q;
            rectF.round(rect);
            this.f19864s.setBounds(rect);
            this.f19864s.draw(canvas);
        }
        return super.drawChild(canvas, view, j3);
    }

    public FrameLayout getContainer() {
        return this.f19860e;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        a();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        b(false);
        super.onMeasure(i7, i10);
        a();
    }

    public void setAccentColor(int i7) {
        this.H = i7;
    }

    public void setOnButtonsTotalWidthChanged(d dVar) {
        this.d = dVar;
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.f19867y != f10) {
            this.f19867y = f10;
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
        for (n nVar : this.f19857a) {
            if (nVar != null && (aVar = (kh.a) nVar.f1788c) != null) {
                aVar.updateColors();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
