package jh;

import ai.l2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.n;
import ci.d4;
import ci.m4;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.is;
import org.telegram.ui.qe;
import org.telegram.ui.zn;
import w7.x5;
import w7.z5;
import yf.h0;
import yf.i0;
public class e extends FrameLayout implements me.d {
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final RectF K;
    public float E;
    public final Paint F;
    public int G;
    public final n[] f14176a;
    public final View.OnClickListener[] f14177b;
    public final qe[] f14178c;
    public d d;
    public final FrameLayout f14179e;
    public final HashSet f14180f;
    public final d6 h;
    public final ah.c f14181n;
    public final dh.a f14182r;
    public ch.d f14183s;
    public final me.b v;
    public final me.b f14184w;
    public float f14185x;
    public float f14186y;

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

    public e(ah.c cVar, Context context, dh.a aVar, d6 d6Var) {
        super(context);
        this.f14176a = new n[5];
        this.f14177b = new View.OnClickListener[5];
        this.f14178c = new qe[5];
        this.f14180f = new HashSet();
        is isVar = is.h;
        this.v = new me.b(99, this, isVar, 320L, false);
        this.f14184w = new me.b(100, this, isVar, 320L, false);
        this.F = new Paint(1);
        this.G = 0;
        this.f14181n = cVar;
        this.f14182r = aVar;
        this.h = d6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14179e = frameLayout;
        frameLayout.setClipToOutline(true);
        l2 l2Var = i0.f52292a;
        frameLayout.setOutlineProvider(new h0(0, AndroidUtilities.dp(22.0f)));
        addView(frameLayout, x5.e(-1, 44, 16));
    }

    @Override
    public final void A(float f7, int i10) {
        n nVar;
        d4 d4Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            n[] nVarArr = this.f14176a;
            if (i11 < nVarArr.length && (nVar = nVarArr[i11]) != null && i12 == 1 && ((me.b) nVar.d).f16402f) {
                qe qeVar = this.f14178c[i11];
                if (qeVar != null) {
                    final ih.a aVar = (ih.a) nVar.f2148c;
                    boolean z10 = nVar.f2147b;
                    int i13 = qeVar.f41189a;
                    final zn znVar = qeVar.f41190b;
                    switch (i13) {
                        case 26:
                            if (znVar.J0 == null && !z10 && (((d4Var = znVar.L0) == null || !d4Var.V) && b50.h.c())) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zn znVar2 = znVar;
                                                if (znVar2.getParentActivity() != null) {
                                                    float f10 = znVar2.v.f(2).d / AndroidUtilities.density;
                                                    ih.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (znVar2.X0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    ci.d4 d4Var2 = new ci.d4(znVar2.getParentActivity(), 3);
                                                    znVar2.J0 = d4Var2;
                                                    d4Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    znVar2.J0.p(false);
                                                    znVar2.J0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    znVar2.J0.l(1.0f, (-width) + 7.33f);
                                                    znVar2.X0.addView(znVar2.J0, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, f10 + 50.0f, -1, 87));
                                                    ci.d4 d4Var3 = znVar2.J0;
                                                    d4Var3.f4917l0 = new sg(znVar2, 3);
                                                    d4Var3.u();
                                                    org.telegram.ui.Components.b50.h.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                zn znVar3 = znVar;
                                                if (znVar3.getParentActivity() != null) {
                                                    float f11 = znVar3.v.f(2).d / AndroidUtilities.density;
                                                    ih.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (znVar3.X0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    ci.d4 d4Var4 = new ci.d4(znVar3.getParentActivity(), 3);
                                                    znVar3.L0 = d4Var4;
                                                    d4Var4.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    znVar3.L0.p(false);
                                                    ci.d4 d4Var5 = znVar3.L0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (d4Var5.getMeasuredWidth() < 0) {
                                                        d4Var5.G = string;
                                                    } else {
                                                        d4Var5.H.t(string, !LocaleController.isRTL, true);
                                                    }
                                                    znVar3.L0.l(1.0f, (-width2) + 7.33f);
                                                    znVar3.X0.addView(znVar3.L0, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, f11 + 50.0f, -1, 87));
                                                    ci.d4 d4Var6 = znVar3.L0;
                                                    d4Var6.f4917l0 = new sg(znVar3, 12);
                                                    d4Var6.u();
                                                    org.telegram.ui.Components.b50.f24910f.b();
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
                            if (znVar.L0 == null && !z10 && b50.f24910f.c()) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zn znVar2 = znVar;
                                                if (znVar2.getParentActivity() != null) {
                                                    float f10 = znVar2.v.f(2).d / AndroidUtilities.density;
                                                    ih.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (znVar2.X0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    ci.d4 d4Var2 = new ci.d4(znVar2.getParentActivity(), 3);
                                                    znVar2.J0 = d4Var2;
                                                    d4Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    znVar2.J0.p(false);
                                                    znVar2.J0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    znVar2.J0.l(1.0f, (-width) + 7.33f);
                                                    znVar2.X0.addView(znVar2.J0, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, f10 + 50.0f, -1, 87));
                                                    ci.d4 d4Var3 = znVar2.J0;
                                                    d4Var3.f4917l0 = new sg(znVar2, 3);
                                                    d4Var3.u();
                                                    org.telegram.ui.Components.b50.h.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                zn znVar3 = znVar;
                                                if (znVar3.getParentActivity() != null) {
                                                    float f11 = znVar3.v.f(2).d / AndroidUtilities.density;
                                                    ih.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (znVar3.X0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    ci.d4 d4Var4 = new ci.d4(znVar3.getParentActivity(), 3);
                                                    znVar3.L0 = d4Var4;
                                                    d4Var4.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    znVar3.L0.p(false);
                                                    ci.d4 d4Var5 = znVar3.L0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (d4Var5.getMeasuredWidth() < 0) {
                                                        d4Var5.G = string;
                                                    } else {
                                                        d4Var5.H.t(string, !LocaleController.isRTL, true);
                                                    }
                                                    znVar3.L0.l(1.0f, (-width2) + 7.33f);
                                                    znVar3.X0.addView(znVar3.L0, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, f11 + 50.0f, -1, 87));
                                                    ci.d4 d4Var6 = znVar3.L0;
                                                    d4Var6.f4917l0 = new sg(znVar3, 12);
                                                    d4Var6.u();
                                                    org.telegram.ui.Components.b50.f24910f.b();
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
                nVar.f2147b = true;
            }
        }
    }

    public final void a() {
        int[] iArr;
        View childAt;
        int i10;
        float f7 = 0.0f;
        this.f14186y = 0.0f;
        this.E = 0.0f;
        n[] nVarArr = this.f14176a;
        for (n nVar : nVarArr) {
            if (nVar != null) {
                ih.a aVar = (ih.a) nVar.f2148c;
                float f10 = ((me.b) nVar.d).f16401e * this.f14185x;
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
            float dp = ((me.b) nVar2.d).f16401e * AndroidUtilities.dp(54.0f);
            ((ih.a) nVar2.f2148c).setTranslationX(AndroidUtilities.dp(1.0f) + this.f14186y);
            this.f14186y += dp;
        }
        int i11 = 0;
        while (true) {
            iArr = J;
            if (i11 >= 4) {
                break;
            }
            n nVar3 = nVarArr[iArr[i11]];
            if (nVar3 != null) {
                ih.a aVar2 = (ih.a) nVar3.f2148c;
                float dp2 = ((me.b) nVar3.d).f16401e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.E);
                this.E += dp2;
            }
            i11++;
        }
        if (this.f14185x < 1.0f) {
            n nVar4 = nVarArr[iArr2[0]];
            if (nVar4 != null) {
                ih.a aVar3 = (ih.a) nVar4.f2148c;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f14185x) * this.f14186y));
            }
            for (int i12 = 0; i12 < 4; i12++) {
                n nVar5 = nVarArr[iArr[i12]];
                if (nVar5 != null) {
                    ih.a aVar4 = (ih.a) nVar5.f2148c;
                    aVar4.setTranslationX(((1.0f - this.f14185x) * this.E) + aVar4.getTranslationX());
                }
            }
            float f11 = this.f14186y;
            float f12 = this.f14185x;
            this.f14186y = f11 * f12;
            this.E *= f12;
        }
        float f13 = this.f14184w.f16401e;
        if (f13 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i13 = 0; i13 < getContainer().getChildCount(); i13++) {
                if (this.f14180f.contains(getContainer().getChildAt(i13))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f7 = Math.max(f7, childAt.getRight());
                }
            }
            if (measuredWidth > f7) {
                f7 = (measuredWidth + f7) / 2.0f;
                measuredWidth = f7;
            }
            this.f14186y = AndroidUtilities.lerp(this.f14186y, measuredWidth - AndroidUtilities.dp(3.33f), f13);
            this.E = AndroidUtilities.lerp(this.E, (getMeasuredWidth() - f7) - AndroidUtilities.dp(17.66f), f13);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f14 = this.f14186y;
            float f15 = this.E;
            hh.f fVar = ((qe) dVar).f41190b.S;
            fVar.f11508x = f14;
            fVar.f11509y = f15;
            fVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i12 = I[0];
        n[] nVarArr = this.f14176a;
        n nVar = nVarArr[i12];
        if (nVar != null) {
            if (((me.b) nVar.d).f16402f) {
                i11 = AndroidUtilities.dp(54.0f);
            } else {
                i11 = 0;
            }
            dp += i11;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            n nVar2 = nVarArr[J[i13]];
            if (nVar2 != null) {
                if (((me.b) nVar2.d).f16402f) {
                    i10 = AndroidUtilities.dp(54.0f);
                } else {
                    i10 = 0;
                }
                dp2 += i10;
            }
        }
        FrameLayout frameLayout = this.f14179e;
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
            n[] nVarArr = this.f14176a;
            if (i10 < nVarArr.length && ((nVar = nVarArr[i10]) != null || z10)) {
                if (nVar == null) {
                    me.b bVar = new me.b((i10 << 16) | 1, this, is.h, 300L, false);
                    ih.a d = ih.a.d(getContext(), this.f14181n, this.f14182r, this.h, H[i10], 48);
                    if (i10 == 1) {
                        d.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i10 == 2) {
                        d.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i10 == 0) {
                        d.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i10 == 3) {
                        d.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    z5.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new m4(this, i10, 3));
                    addView(d, x5.d(56.0f, 56));
                    nVarArr[i10] = new n(d, bVar);
                    a();
                }
                ((me.b) nVarArr[i10].d).a(z10, z11);
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
                if (this.f14180f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.f14184w.a(z11, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = (int) (this.f14185x * 255.0f * this.v.f16401e);
        if (i10 > 0) {
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.E;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = K;
            rectF.set(this.f14186y + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), measuredWidth, measuredHeight);
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
        if (view == this.f14179e && this.f14183s != null) {
            RectF rectF = K;
            rectF.set(this.f14186y + AndroidUtilities.dp(1.0f), 0.0f, (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.E, getMeasuredHeight());
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.f14183s.setBounds(rect);
            this.f14183s.draw(canvas);
        }
        return super.drawChild(canvas, view, j3);
    }

    public FrameLayout getContainer() {
        return this.f14179e;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
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
            n[] nVarArr = this.f14176a;
            if (i11 < nVarArr.length && nVarArr[i11] != null && i12 == 1) {
                b(true);
                a();
                invalidate();
            }
        }
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
        if (this.f14185x != f7) {
            this.f14185x = f7;
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
