package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.n;
import b8.mf;
import b8.pf;
import bi.q;
import cg.p0;
import cg.r0;
import cg.t0;
import gi.l3;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.xq;
import org.telegram.ui.de;
import org.telegram.ui.wm;
public class e extends FrameLayout implements qe.b, z5 {
    public static final int[] I = {2131232354, 2131231503, 2131231505, 2131232182, 2131232182};
    public static final int[] J = {0};
    public static final int[] K = {1, 2, 3, 4};
    public static final RectF L = new RectF();
    public float E;
    public float F;
    public final Paint G;
    public int H;
    public final n[] f19396a;
    public final View.OnClickListener[] f19397b;
    public final de[] f19398c;
    public d d;
    public final FrameLayout f19399e;
    public final HashSet f19400f;
    public final e6 h;
    public final eh.c f19401n;
    public final hh.a f19402r;
    public gh.g f19403s;
    public final qe.a f19404w;
    public final qe.a f19405x;
    public float f19406y;

    public e(Context context, eh.c cVar, hh.a aVar, e6 e6Var) {
        super(context);
        this.f19396a = new n[5];
        this.f19397b = new View.OnClickListener[5];
        this.f19398c = new de[5];
        this.f19400f = new HashSet();
        xq xqVar = xq.h;
        this.f19404w = new qe.a(99, this, xqVar, 320L, false);
        this.f19405x = new qe.a(100, this, xqVar, 320L, false);
        this.G = new Paint(1);
        this.H = 0;
        this.f19401n = cVar;
        this.f19402r = aVar;
        this.h = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19399e = frameLayout;
        frameLayout.setClipToOutline(true);
        p0 p0Var = t0.f4745a;
        frameLayout.setOutlineProvider(new r0(0, g0.L(22.0f)));
        addView(frameLayout, mf.e(-1, 44, 16));
    }

    @Override
    public final void F(float f10, int i3) {
        n nVar;
        l3 l3Var;
        if (i3 == 99 || i3 == 100) {
            invalidate();
        }
        int i10 = i3 >> 16;
        int i11 = i3 & 65535;
        if (i10 >= 0) {
            n[] nVarArr = this.f19396a;
            if (i10 < nVarArr.length && (nVar = nVarArr[i10]) != null && i11 == 1 && ((qe.a) nVar.d).f53841f) {
                de deVar = this.f19398c[i10];
                if (deVar != null) {
                    final lh.a aVar = (lh.a) nVar.f1270c;
                    boolean z10 = nVar.f1269b;
                    int i12 = deVar.f44667a;
                    final wm wmVar = deVar.f44668b;
                    switch (i12) {
                        case 27:
                            if (wmVar.Y0 == null && !z10 && (((l3Var = wmVar.f51238a1) == null || !l3Var.W) && v20.h.c())) {
                                g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i13 = r3;
                                        lh.a aVar2 = aVar;
                                        wm wmVar2 = wmVar;
                                        switch (i13) {
                                            case 0:
                                                if (wmVar2.getParentActivity() != null) {
                                                    float f11 = wmVar2.f51520w.f(2).d / org.telegram.messenger.g0.f22607p;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (wmVar2.m1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.f22607p;
                                                    gi.l3 l3Var2 = new gi.l3(wmVar2.getParentActivity(), 3);
                                                    wmVar2.f51238a1 = l3Var2;
                                                    l3Var2.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                    wmVar2.f51238a1.l(wmVar2.L);
                                                    wmVar2.f51238a1.r(false);
                                                    gi.l3 l3Var3 = wmVar2.f51238a1;
                                                    String M0 = org.telegram.messenger.bd.M0(2131744434, null);
                                                    if (l3Var3.getMeasuredWidth() < 0) {
                                                        l3Var3.H = M0;
                                                    } else {
                                                        l3Var3.I.t(M0, !org.telegram.messenger.bd.f21784a0, true);
                                                    }
                                                    wmVar2.f51238a1.o(1.0f, (-width) + 7.33f);
                                                    wmVar2.m1.addView(wmVar2.f51238a1, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    gi.l3 l3Var4 = wmVar2.f51238a1;
                                                    l3Var4.f13100r0 = new tf(wmVar2, 14);
                                                    l3Var4.w();
                                                    org.telegram.ui.Components.v20.f38962f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (wmVar2.getParentActivity() != null) {
                                                    float f12 = wmVar2.f51520w.f(2).d / org.telegram.messenger.g0.f22607p;
                                                    float width2 = ((aVar2.getWidth() / 2.0f) + (wmVar2.m1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.f22607p;
                                                    gi.l3 l3Var5 = new gi.l3(wmVar2.getParentActivity(), 3);
                                                    wmVar2.Y0 = l3Var5;
                                                    l3Var5.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                    wmVar2.Y0.l(wmVar2.L);
                                                    wmVar2.Y0.r(false);
                                                    wmVar2.Y0.u(org.telegram.messenger.bd.M0(2131750259, null));
                                                    wmVar2.Y0.o(1.0f, (-width2) + 7.33f);
                                                    wmVar2.m1.addView(wmVar2.Y0, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                    gi.l3 l3Var6 = wmVar2.Y0;
                                                    l3Var6.f13100r0 = new xe(wmVar2, 20);
                                                    l3Var6.w();
                                                    org.telegram.ui.Components.v20.h.b();
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
                            if (wmVar.f51238a1 == null && !z10 && v20.f38962f.c()) {
                                g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i13 = r3;
                                        lh.a aVar2 = aVar;
                                        wm wmVar2 = wmVar;
                                        switch (i13) {
                                            case 0:
                                                if (wmVar2.getParentActivity() != null) {
                                                    float f11 = wmVar2.f51520w.f(2).d / org.telegram.messenger.g0.f22607p;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (wmVar2.m1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.f22607p;
                                                    gi.l3 l3Var2 = new gi.l3(wmVar2.getParentActivity(), 3);
                                                    wmVar2.f51238a1 = l3Var2;
                                                    l3Var2.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                    wmVar2.f51238a1.l(wmVar2.L);
                                                    wmVar2.f51238a1.r(false);
                                                    gi.l3 l3Var3 = wmVar2.f51238a1;
                                                    String M0 = org.telegram.messenger.bd.M0(2131744434, null);
                                                    if (l3Var3.getMeasuredWidth() < 0) {
                                                        l3Var3.H = M0;
                                                    } else {
                                                        l3Var3.I.t(M0, !org.telegram.messenger.bd.f21784a0, true);
                                                    }
                                                    wmVar2.f51238a1.o(1.0f, (-width) + 7.33f);
                                                    wmVar2.m1.addView(wmVar2.f51238a1, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    gi.l3 l3Var4 = wmVar2.f51238a1;
                                                    l3Var4.f13100r0 = new tf(wmVar2, 14);
                                                    l3Var4.w();
                                                    org.telegram.ui.Components.v20.f38962f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (wmVar2.getParentActivity() != null) {
                                                    float f12 = wmVar2.f51520w.f(2).d / org.telegram.messenger.g0.f22607p;
                                                    float width2 = ((aVar2.getWidth() / 2.0f) + (wmVar2.m1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.f22607p;
                                                    gi.l3 l3Var5 = new gi.l3(wmVar2.getParentActivity(), 3);
                                                    wmVar2.Y0 = l3Var5;
                                                    l3Var5.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                    wmVar2.Y0.l(wmVar2.L);
                                                    wmVar2.Y0.r(false);
                                                    wmVar2.Y0.u(org.telegram.messenger.bd.M0(2131750259, null));
                                                    wmVar2.Y0.o(1.0f, (-width2) + 7.33f);
                                                    wmVar2.m1.addView(wmVar2.Y0, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                    gi.l3 l3Var6 = wmVar2.Y0;
                                                    l3Var6.f13100r0 = new xe(wmVar2, 20);
                                                    l3Var6.w();
                                                    org.telegram.ui.Components.v20.h.b();
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
                nVar.f1269b = true;
            }
        }
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 99) {
            invalidate();
            return;
        }
        if (i3 == 100) {
            a();
            invalidate();
        }
        int i10 = i3 >> 16;
        int i11 = i3 & 65535;
        if (i10 >= 0) {
            n[] nVarArr = this.f19396a;
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
        int i3;
        float f10 = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        n[] nVarArr = this.f19396a;
        for (n nVar : nVarArr) {
            if (nVar != null) {
                lh.a aVar = (lh.a) nVar.f1270c;
                float f11 = ((qe.a) nVar.d).f53840e * this.f19406y;
                if (f11 > 0.0f) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                aVar.setVisibility(i3);
                aVar.setAlpha(f11);
                aVar.setScaleX(g0.T1(0.4f, 1.0f, f11));
                aVar.setScaleY(g0.T1(0.4f, 1.0f, f11));
            }
        }
        int[] iArr2 = J;
        n nVar2 = nVarArr[iArr2[0]];
        if (nVar2 != null) {
            float L2 = ((qe.a) nVar2.d).f53840e * g0.L(54.0f);
            ((lh.a) nVar2.f1270c).setTranslationX(g0.L(1.0f) + this.E);
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
                lh.a aVar2 = (lh.a) nVar3.f1270c;
                float L3 = ((qe.a) nVar3.d).f53840e * g0.L(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - g0.L(1.0f)) - this.F);
                this.F += L3;
            }
            i10++;
        }
        if (this.f19406y < 1.0f) {
            n nVar4 = nVarArr[iArr2[0]];
            if (nVar4 != null) {
                lh.a aVar3 = (lh.a) nVar4.f1270c;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f19406y) * this.E));
            }
            for (int i11 = 0; i11 < 4; i11++) {
                n nVar5 = nVarArr[iArr[i11]];
                if (nVar5 != null) {
                    lh.a aVar4 = (lh.a) nVar5.f1270c;
                    aVar4.setTranslationX(((1.0f - this.f19406y) * this.F) + aVar4.getTranslationX());
                }
            }
            float f12 = this.E;
            float f13 = this.f19406y;
            this.E = f12 * f13;
            this.F *= f13;
        }
        float f14 = this.f19405x.f53840e;
        if (f14 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i12 = 0; i12 < getContainer().getChildCount(); i12++) {
                if (this.f19400f.contains(getContainer().getChildAt(i12))) {
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
            kh.f fVar = ((de) dVar).f44668b.U;
            fVar.f17290y = f15;
            fVar.E = f16;
            fVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int i3;
        int i10;
        int L2 = g0.L(7.0f);
        int L3 = g0.L(7.0f);
        int i11 = J[0];
        n[] nVarArr = this.f19396a;
        n nVar = nVarArr[i11];
        if (nVar != null) {
            if (((qe.a) nVar.d).f53841f) {
                i10 = g0.L(54.0f);
            } else {
                i10 = 0;
            }
            L2 += i10;
        }
        for (int i12 = 0; i12 < 4; i12++) {
            n nVar2 = nVarArr[K[i12]];
            if (nVar2 != null) {
                if (((qe.a) nVar2.d).f53841f) {
                    i3 = g0.L(54.0f);
                } else {
                    i3 = 0;
                }
                L3 += i3;
            }
        }
        FrameLayout frameLayout = this.f19399e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin != L2 || marginLayoutParams.rightMargin != L3) {
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L3;
            if (z10) {
                frameLayout.requestLayout();
            }
        }
    }

    public final void c(int i3, boolean z10, boolean z11) {
        n nVar;
        if (i3 >= 0) {
            n[] nVarArr = this.f19396a;
            if (i3 < nVarArr.length && ((nVar = nVarArr[i3]) != null || z10)) {
                if (nVar == null) {
                    qe.a aVar = new qe.a((i3 << 16) | 1, this, xq.h, 300L, false);
                    lh.a d = lh.a.d(getContext(), this.f19401n, this.f19402r, this.h, I[i3], 48);
                    if (i3 == 1) {
                        d.setContentDescription(bd.M0(2131746743, null));
                    } else if (i3 == 2) {
                        d.setContentDescription(bd.M0(2131752337, null));
                    } else if (i3 == 0) {
                        d.setContentDescription(bd.M0(2131745846, null));
                    } else if (i3 == 3) {
                        d.setContentDescription(bd.M0(2131752880, null));
                    }
                    pf.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new q(this, i3, 5));
                    addView(d, mf.c(56.0f, 56));
                    nVarArr[i3] = new n(d, aVar);
                    a();
                }
                ((qe.a) nVarArr[i3].d).a(z10, z11);
            }
        }
    }

    public final void d(boolean z10) {
        boolean z11 = false;
        z11 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z12 = false;
            for (int i3 = 0; i3 < getContainer().getChildCount(); i3++) {
                View childAt = getContainer().getChildAt(i3);
                if (this.f19400f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.f19405x.a(z11, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3 = (int) (this.f19406y * 255.0f * this.f19404w.f53840e);
        if (i3 > 0) {
            float measuredWidth = (getMeasuredWidth() - g0.L(10.0f)) - this.F;
            float measuredHeight = getMeasuredHeight() - g0.L(9.0f);
            RectF rectF = L;
            rectF.set(this.E + g0.L(10.0f), g0.L(9.0f), measuredWidth, measuredHeight);
            int i10 = this.H;
            Paint paint = this.G;
            paint.setColor(i10);
            paint.setAlpha(i3);
            canvas.drawRoundRect(rectF, g0.L(19.0f), g0.L(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f19399e && this.f19403s != null) {
            RectF rectF = L;
            rectF.set(this.E + g0.L(1.0f), 0.0f, (getMeasuredWidth() - g0.L(1.0f)) - this.F, getMeasuredHeight());
            Rect rect = g0.Q;
            rectF.round(rect);
            this.f19403s.setBounds(rect);
            this.f19403s.draw(canvas);
        }
        return super.drawChild(canvas, view, j10);
    }

    public FrameLayout getContainer() {
        return this.f19399e;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        a();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        b(false);
        super.onMeasure(i3, i10);
        a();
    }

    public void setAccentColor(int i3) {
        this.H = i3;
    }

    public void setOnButtonsTotalWidthChanged(d dVar) {
        this.d = dVar;
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.f19406y != f10) {
            this.f19406y = f10;
            a();
            invalidate();
        }
    }

    @Override
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        d(false);
    }

    @Override
    public final void updateColors() {
        n[] nVarArr;
        lh.a aVar;
        for (n nVar : this.f19396a) {
            if (nVar != null && (aVar = (lh.a) nVar.f1270c) != null) {
                aVar.updateColors();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
