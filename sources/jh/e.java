package jh;

import ai.k2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.n;
import ci.f4;
import ci.o4;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.qr;
import org.telegram.ui.qe;
import org.telegram.ui.zn;
import w7.a6;
import w7.y5;
import yf.h0;
import yf.j0;
public class e extends FrameLayout implements le.d {
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final RectF K;
    public float E;
    public final Paint F;
    public int G;
    public final n[] f13019a;
    public final View.OnClickListener[] f13020b;
    public final qe[] f13021c;
    public d d;
    public final FrameLayout e;
    public final HashSet f13022f;
    public final f6 h;
    public final ah.c f13023n;
    public final dh.a f13024r;
    public ch.d f13025s;
    public final le.b v;
    public final le.b f13026w;
    public float f13027x;
    public float f13028y;

    static {
        int i10 = R.drawable.msg_search;
        int i11 = R.drawable.input_gift_s;
        int i12 = R.drawable.input_message;
        int i13 = R.drawable.msg_help;
        H = new int[]{i10, i11, i12, i13, i13};
        I = new int[]{0};
        J = new int[]{1, 2, 3, 4};
        K = new RectF();
    }

    public e(ah.c cVar, Context context, dh.a aVar, f6 f6Var) {
        super(context);
        this.f13019a = new n[5];
        this.f13020b = new View.OnClickListener[5];
        this.f13021c = new qe[5];
        this.f13022f = new HashSet();
        qr qrVar = qr.h;
        this.v = new le.b(99, this, qrVar, 320L, false);
        this.f13026w = new le.b(100, this, qrVar, 320L, false);
        this.F = new Paint(1);
        this.G = 0;
        this.f13023n = cVar;
        this.f13024r = aVar;
        this.h = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        k2 k2Var = j0.f47161a;
        frameLayout.setOutlineProvider(new h0(0, AndroidUtilities.dp(22.0f)));
        addView(frameLayout, y5.e(-1, 44, 16));
    }

    @Override
    public final void C(float f7, int i10) {
        n nVar;
        f4 f4Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            n[] nVarArr = this.f13019a;
            if (i11 < nVarArr.length && (nVar = nVarArr[i11]) != null && i12 == 1 && ((le.b) nVar.d).f14185f) {
                qe qeVar = this.f13021c[i11];
                if (qeVar != null) {
                    final ih.a aVar = (ih.a) nVar.f1908c;
                    boolean z10 = nVar.f1907b;
                    int i13 = qeVar.f36913a;
                    final zn znVar = qeVar.f36914b;
                    switch (i13) {
                        case 26:
                            if (znVar.J0 == null && !z10 && (((f4Var = znVar.L0) == null || !f4Var.V) && j40.h.c())) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zn znVar2 = znVar;
                                                if (znVar2.getParentActivity() != null) {
                                                    float f10 = znVar2.v.e(2).d / AndroidUtilities.density;
                                                    ih.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (znVar2.X0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    ci.f4 f4Var2 = new ci.f4(znVar2.getParentActivity(), 3);
                                                    znVar2.L0 = f4Var2;
                                                    f4Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    znVar2.L0.p(false);
                                                    ci.f4 f4Var3 = znVar2.L0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (f4Var3.getMeasuredWidth() < 0) {
                                                        f4Var3.G = string;
                                                    } else {
                                                        f4Var3.H.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    znVar2.L0.l(1.0f, (-width) + 7.33f);
                                                    znVar2.X0.addView(znVar2.L0, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                    ci.f4 f4Var4 = znVar2.L0;
                                                    f4Var4.f4637l0 = new rf(znVar2, 16);
                                                    f4Var4.u();
                                                    org.telegram.ui.Components.j40.f25272f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                zn znVar3 = znVar;
                                                if (znVar3.getParentActivity() != null) {
                                                    float f11 = znVar3.v.e(2).d / AndroidUtilities.density;
                                                    ih.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (znVar3.X0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    ci.f4 f4Var5 = new ci.f4(znVar3.getParentActivity(), 3);
                                                    znVar3.J0 = f4Var5;
                                                    f4Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    znVar3.J0.p(false);
                                                    znVar3.J0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    znVar3.J0.l(1.0f, (-width2) + 7.33f);
                                                    znVar3.X0.addView(znVar3.J0, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    ci.f4 f4Var6 = znVar3.J0;
                                                    f4Var6.f4637l0 = new rf(znVar3, 29);
                                                    f4Var6.u();
                                                    org.telegram.ui.Components.j40.h.b();
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
                            if (znVar.L0 == null && !z10 && j40.f25272f.c()) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zn znVar2 = znVar;
                                                if (znVar2.getParentActivity() != null) {
                                                    float f10 = znVar2.v.e(2).d / AndroidUtilities.density;
                                                    ih.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (znVar2.X0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    ci.f4 f4Var2 = new ci.f4(znVar2.getParentActivity(), 3);
                                                    znVar2.L0 = f4Var2;
                                                    f4Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    znVar2.L0.p(false);
                                                    ci.f4 f4Var3 = znVar2.L0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (f4Var3.getMeasuredWidth() < 0) {
                                                        f4Var3.G = string;
                                                    } else {
                                                        f4Var3.H.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    znVar2.L0.l(1.0f, (-width) + 7.33f);
                                                    znVar2.X0.addView(znVar2.L0, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                    ci.f4 f4Var4 = znVar2.L0;
                                                    f4Var4.f4637l0 = new rf(znVar2, 16);
                                                    f4Var4.u();
                                                    org.telegram.ui.Components.j40.f25272f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                zn znVar3 = znVar;
                                                if (znVar3.getParentActivity() != null) {
                                                    float f11 = znVar3.v.e(2).d / AndroidUtilities.density;
                                                    ih.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (znVar3.X0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    ci.f4 f4Var5 = new ci.f4(znVar3.getParentActivity(), 3);
                                                    znVar3.J0 = f4Var5;
                                                    f4Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    znVar3.J0.p(false);
                                                    znVar3.J0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    znVar3.J0.l(1.0f, (-width2) + 7.33f);
                                                    znVar3.X0.addView(znVar3.J0, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    ci.f4 f4Var6 = znVar3.J0;
                                                    f4Var6.f4637l0 = new rf(znVar3, 29);
                                                    f4Var6.u();
                                                    org.telegram.ui.Components.j40.h.b();
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
                nVar.f1907b = true;
            }
        }
    }

    @Override
    public final void H(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 99) {
            invalidate();
            return;
        }
        if (i10 == 100) {
            a();
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            n[] nVarArr = this.f13019a;
            if (i11 < nVarArr.length && nVarArr[i11] != null && i12 == 1) {
                b(true);
                a();
                invalidate();
            }
        }
    }

    public final void a() {
        int[] iArr;
        View childAt;
        int i10;
        float f7 = 0.0f;
        this.f13028y = 0.0f;
        this.E = 0.0f;
        n[] nVarArr = this.f13019a;
        for (n nVar : nVarArr) {
            if (nVar != null) {
                ih.a aVar = (ih.a) nVar.f1908c;
                float f10 = ((le.b) nVar.d).e * this.f13027x;
                if (f10 > 0.0f) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                aVar.setVisibility(i10);
                aVar.setAlpha(f10);
                aVar.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
                aVar.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            }
        }
        int[] iArr2 = I;
        n nVar2 = nVarArr[iArr2[0]];
        if (nVar2 != null) {
            float dp = ((le.b) nVar2.d).e * AndroidUtilities.dp(54.0f);
            ((ih.a) nVar2.f1908c).setTranslationX(AndroidUtilities.dp(1.0f) + this.f13028y);
            this.f13028y += dp;
        }
        int i11 = 0;
        while (true) {
            iArr = J;
            if (i11 >= 4) {
                break;
            }
            n nVar3 = nVarArr[iArr[i11]];
            if (nVar3 != null) {
                ih.a aVar2 = (ih.a) nVar3.f1908c;
                float dp2 = ((le.b) nVar3.d).e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.E);
                this.E += dp2;
            }
            i11++;
        }
        if (this.f13027x < 1.0f) {
            n nVar4 = nVarArr[iArr2[0]];
            if (nVar4 != null) {
                ih.a aVar3 = (ih.a) nVar4.f1908c;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f13027x) * this.f13028y));
            }
            for (int i12 = 0; i12 < 4; i12++) {
                n nVar5 = nVarArr[iArr[i12]];
                if (nVar5 != null) {
                    ih.a aVar4 = (ih.a) nVar5.f1908c;
                    aVar4.setTranslationX(((1.0f - this.f13027x) * this.E) + aVar4.getTranslationX());
                }
            }
            float f11 = this.f13028y;
            float f12 = this.f13027x;
            this.f13028y = f11 * f12;
            this.E *= f12;
        }
        float f13 = this.f13026w.e;
        if (f13 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i13 = 0; i13 < getContainer().getChildCount(); i13++) {
                if (this.f13022f.contains(getContainer().getChildAt(i13))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f7 = Math.max(f7, childAt.getRight());
                }
            }
            if (measuredWidth > f7) {
                f7 = (measuredWidth + f7) / 2.0f;
                measuredWidth = f7;
            }
            this.f13028y = AndroidUtilities.lerp(this.f13028y, measuredWidth - AndroidUtilities.dp(3.33f), f13);
            this.E = AndroidUtilities.lerp(this.E, (getMeasuredWidth() - f7) - AndroidUtilities.dp(17.66f), f13);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f14 = this.f13028y;
            float f15 = this.E;
            hh.g gVar = ((qe) dVar).f36914b.S;
            gVar.f10533x = f14;
            gVar.f10534y = f15;
            gVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i12 = I[0];
        n[] nVarArr = this.f13019a;
        n nVar = nVarArr[i12];
        if (nVar != null) {
            if (((le.b) nVar.d).f14185f) {
                i11 = AndroidUtilities.dp(54.0f);
            } else {
                i11 = 0;
            }
            dp += i11;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            n nVar2 = nVarArr[J[i13]];
            if (nVar2 != null) {
                if (((le.b) nVar2.d).f14185f) {
                    i10 = AndroidUtilities.dp(54.0f);
                } else {
                    i10 = 0;
                }
                dp2 += i10;
            }
        }
        FrameLayout frameLayout = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin != dp || marginLayoutParams.rightMargin != dp2) {
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp2;
            if (z10) {
                frameLayout.requestLayout();
            }
        }
    }

    public final void c(int i10, boolean z10, boolean z11) {
        n nVar;
        if (i10 >= 0) {
            n[] nVarArr = this.f13019a;
            if (i10 < nVarArr.length && ((nVar = nVarArr[i10]) != null || z10)) {
                if (nVar == null) {
                    le.b bVar = new le.b((i10 << 16) | 1, this, qr.h, 300L, false);
                    ih.a d = ih.a.d(getContext(), this.f13023n, this.f13024r, this.h, H[i10], 48);
                    if (i10 == 1) {
                        d.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i10 == 2) {
                        d.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i10 == 0) {
                        d.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i10 == 3) {
                        d.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    a6.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new o4(this, i10, 3));
                    addView(d, y5.c(56.0f, 56));
                    nVarArr[i10] = new n(d, bVar);
                    a();
                }
                ((le.b) nVarArr[i10].d).a(z10, z11);
            }
        }
    }

    public final void d(boolean z10) {
        boolean z11 = false;
        z11 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z12 = false;
            for (int i10 = 0; i10 < getContainer().getChildCount(); i10++) {
                View childAt = getContainer().getChildAt(i10);
                if (this.f13022f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.f13026w.a(z11, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = (int) (this.f13027x * 255.0f * this.v.e);
        if (i10 > 0) {
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.E;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = K;
            rectF.set(this.f13028y + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), measuredWidth, measuredHeight);
            int i11 = this.G;
            Paint paint = this.F;
            paint.setColor(i11);
            paint.setAlpha(i10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.e && this.f13025s != null) {
            RectF rectF = K;
            rectF.set(this.f13028y + AndroidUtilities.dp(1.0f), 0.0f, (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.E, getMeasuredHeight());
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.f13025s.setBounds(rect);
            this.f13025s.draw(canvas);
        }
        return super.drawChild(canvas, view, j3);
    }

    public FrameLayout getContainer() {
        return this.e;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        b(false);
        super.onMeasure(i10, i11);
        a();
    }

    public void setAccentColor(int i10) {
        this.G = i10;
    }

    public void setOnButtonsTotalWidthChanged(d dVar) {
        this.d = dVar;
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.f13027x != f7) {
            this.f13027x = f7;
            a();
            invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d(false);
    }
}
