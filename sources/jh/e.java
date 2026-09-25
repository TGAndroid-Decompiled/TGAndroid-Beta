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
import ci.e4;
import ci.n4;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.rr;
import org.telegram.ui.pe;
import org.telegram.ui.wn;
import w7.a6;
import w7.y5;
import yf.h0;
import yf.i0;
public class e extends FrameLayout implements le.e {
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final RectF K;
    public float E;
    public final Paint F;
    public int G;
    public final n[] f13007a;
    public final View.OnClickListener[] f13008b;
    public final pe[] f13009c;
    public d d;
    public final FrameLayout e;
    public final HashSet f13010f;
    public final d6 h;
    public final ah.c f13011n;
    public final dh.a f13012r;
    public ch.d f13013s;
    public final le.c v;
    public final le.c f13014w;
    public float f13015x;
    public float f13016y;

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
        this.f13007a = new n[5];
        this.f13008b = new View.OnClickListener[5];
        this.f13009c = new pe[5];
        this.f13010f = new HashSet();
        rr rrVar = rr.h;
        this.v = new le.c(99, this, rrVar, 320L, false);
        this.f13014w = new le.c(100, this, rrVar, 320L, false);
        this.F = new Paint(1);
        this.G = 0;
        this.f13011n = cVar;
        this.f13012r = aVar;
        this.h = d6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        k2 k2Var = i0.f47112a;
        frameLayout.setOutlineProvider(new h0(0, AndroidUtilities.dp(22.0f)));
        addView(frameLayout, y5.e(-1, 44, 16));
    }

    @Override
    public final void C(float f7, int i10) {
        n nVar;
        e4 e4Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            n[] nVarArr = this.f13007a;
            if (i11 < nVarArr.length && (nVar = nVarArr[i11]) != null && i12 == 1 && ((le.c) nVar.d).f14201f) {
                pe peVar = this.f13009c[i11];
                if (peVar != null) {
                    final ih.a aVar = (ih.a) nVar.f1901c;
                    boolean z10 = nVar.f1900b;
                    int i13 = peVar.f36507a;
                    final wn wnVar = peVar.f36508b;
                    switch (i13) {
                        case 26:
                            if (wnVar.J0 == null && !z10 && (((e4Var = wnVar.L0) == null || !e4Var.V) && k40.h.c())) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                wn wnVar2 = wnVar;
                                                if (wnVar2.getParentActivity() != null) {
                                                    float f10 = wnVar2.v.e(2).d / AndroidUtilities.density;
                                                    ih.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (wnVar2.X0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    ci.e4 e4Var2 = new ci.e4(wnVar2.getParentActivity(), 3);
                                                    wnVar2.L0 = e4Var2;
                                                    e4Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    wnVar2.L0.p(false);
                                                    ci.e4 e4Var3 = wnVar2.L0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (e4Var3.getMeasuredWidth() < 0) {
                                                        e4Var3.G = string;
                                                    } else {
                                                        e4Var3.H.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    wnVar2.L0.l(1.0f, (-width) + 7.33f);
                                                    wnVar2.X0.addView(wnVar2.L0, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                    ci.e4 e4Var4 = wnVar2.L0;
                                                    e4Var4.f4615l0 = new of(wnVar2, 16);
                                                    e4Var4.u();
                                                    org.telegram.ui.Components.k40.f25648f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                wn wnVar3 = wnVar;
                                                if (wnVar3.getParentActivity() != null) {
                                                    float f11 = wnVar3.v.e(2).d / AndroidUtilities.density;
                                                    ih.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (wnVar3.X0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    ci.e4 e4Var5 = new ci.e4(wnVar3.getParentActivity(), 3);
                                                    wnVar3.J0 = e4Var5;
                                                    e4Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    wnVar3.J0.p(false);
                                                    wnVar3.J0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    wnVar3.J0.l(1.0f, (-width2) + 7.33f);
                                                    wnVar3.X0.addView(wnVar3.J0, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    ci.e4 e4Var6 = wnVar3.J0;
                                                    e4Var6.f4615l0 = new of(wnVar3, 29);
                                                    e4Var6.u();
                                                    org.telegram.ui.Components.k40.h.b();
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
                            if (wnVar.L0 == null && !z10 && k40.f25648f.c()) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                wn wnVar2 = wnVar;
                                                if (wnVar2.getParentActivity() != null) {
                                                    float f10 = wnVar2.v.e(2).d / AndroidUtilities.density;
                                                    ih.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (wnVar2.X0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    ci.e4 e4Var2 = new ci.e4(wnVar2.getParentActivity(), 3);
                                                    wnVar2.L0 = e4Var2;
                                                    e4Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    wnVar2.L0.p(false);
                                                    ci.e4 e4Var3 = wnVar2.L0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (e4Var3.getMeasuredWidth() < 0) {
                                                        e4Var3.G = string;
                                                    } else {
                                                        e4Var3.H.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    wnVar2.L0.l(1.0f, (-width) + 7.33f);
                                                    wnVar2.X0.addView(wnVar2.L0, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                    ci.e4 e4Var4 = wnVar2.L0;
                                                    e4Var4.f4615l0 = new of(wnVar2, 16);
                                                    e4Var4.u();
                                                    org.telegram.ui.Components.k40.f25648f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                wn wnVar3 = wnVar;
                                                if (wnVar3.getParentActivity() != null) {
                                                    float f11 = wnVar3.v.e(2).d / AndroidUtilities.density;
                                                    ih.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (wnVar3.X0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    ci.e4 e4Var5 = new ci.e4(wnVar3.getParentActivity(), 3);
                                                    wnVar3.J0 = e4Var5;
                                                    e4Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    wnVar3.J0.p(false);
                                                    wnVar3.J0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    wnVar3.J0.l(1.0f, (-width2) + 7.33f);
                                                    wnVar3.X0.addView(wnVar3.J0, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    ci.e4 e4Var6 = wnVar3.J0;
                                                    e4Var6.f4615l0 = new of(wnVar3, 29);
                                                    e4Var6.u();
                                                    org.telegram.ui.Components.k40.h.b();
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
                nVar.f1900b = true;
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
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
            n[] nVarArr = this.f13007a;
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
        this.f13016y = 0.0f;
        this.E = 0.0f;
        n[] nVarArr = this.f13007a;
        for (n nVar : nVarArr) {
            if (nVar != null) {
                ih.a aVar = (ih.a) nVar.f1901c;
                float f10 = ((le.c) nVar.d).e * this.f13015x;
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
            float dp = ((le.c) nVar2.d).e * AndroidUtilities.dp(54.0f);
            ((ih.a) nVar2.f1901c).setTranslationX(AndroidUtilities.dp(1.0f) + this.f13016y);
            this.f13016y += dp;
        }
        int i11 = 0;
        while (true) {
            iArr = J;
            if (i11 >= 4) {
                break;
            }
            n nVar3 = nVarArr[iArr[i11]];
            if (nVar3 != null) {
                ih.a aVar2 = (ih.a) nVar3.f1901c;
                float dp2 = ((le.c) nVar3.d).e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.E);
                this.E += dp2;
            }
            i11++;
        }
        if (this.f13015x < 1.0f) {
            n nVar4 = nVarArr[iArr2[0]];
            if (nVar4 != null) {
                ih.a aVar3 = (ih.a) nVar4.f1901c;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f13015x) * this.f13016y));
            }
            for (int i12 = 0; i12 < 4; i12++) {
                n nVar5 = nVarArr[iArr[i12]];
                if (nVar5 != null) {
                    ih.a aVar4 = (ih.a) nVar5.f1901c;
                    aVar4.setTranslationX(((1.0f - this.f13015x) * this.E) + aVar4.getTranslationX());
                }
            }
            float f11 = this.f13016y;
            float f12 = this.f13015x;
            this.f13016y = f11 * f12;
            this.E *= f12;
        }
        float f13 = this.f13014w.e;
        if (f13 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i13 = 0; i13 < getContainer().getChildCount(); i13++) {
                if (this.f13010f.contains(getContainer().getChildAt(i13))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f7 = Math.max(f7, childAt.getRight());
                }
            }
            if (measuredWidth > f7) {
                f7 = (measuredWidth + f7) / 2.0f;
                measuredWidth = f7;
            }
            this.f13016y = AndroidUtilities.lerp(this.f13016y, measuredWidth - AndroidUtilities.dp(3.33f), f13);
            this.E = AndroidUtilities.lerp(this.E, (getMeasuredWidth() - f7) - AndroidUtilities.dp(17.66f), f13);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f14 = this.f13016y;
            float f15 = this.E;
            hh.g gVar = ((pe) dVar).f36508b.S;
            gVar.f10515x = f14;
            gVar.f10516y = f15;
            gVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i12 = I[0];
        n[] nVarArr = this.f13007a;
        n nVar = nVarArr[i12];
        if (nVar != null) {
            if (((le.c) nVar.d).f14201f) {
                i11 = AndroidUtilities.dp(54.0f);
            } else {
                i11 = 0;
            }
            dp += i11;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            n nVar2 = nVarArr[J[i13]];
            if (nVar2 != null) {
                if (((le.c) nVar2.d).f14201f) {
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
            n[] nVarArr = this.f13007a;
            if (i10 < nVarArr.length && ((nVar = nVarArr[i10]) != null || z10)) {
                if (nVar == null) {
                    le.c cVar = new le.c((i10 << 16) | 1, this, rr.h, 300L, false);
                    ih.a d = ih.a.d(getContext(), this.f13011n, this.f13012r, this.h, H[i10], 48);
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
                    d.setOnClickListener(new n4(this, i10, 3));
                    addView(d, y5.c(56.0f, 56));
                    nVarArr[i10] = new n(d, cVar);
                    a();
                }
                ((le.c) nVarArr[i10].d).a(z10, z11);
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
                if (this.f13010f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.f13014w.a(z11, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = (int) (this.f13015x * 255.0f * this.v.e);
        if (i10 > 0) {
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.E;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = K;
            rectF.set(this.f13016y + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), measuredWidth, measuredHeight);
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
        if (view == this.e && this.f13013s != null) {
            RectF rectF = K;
            rectF.set(this.f13016y + AndroidUtilities.dp(1.0f), 0.0f, (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.E, getMeasuredHeight());
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.f13013s.setBounds(rect);
            this.f13013s.draw(canvas);
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
        if (this.f13015x != f7) {
            this.f13015x = f7;
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
