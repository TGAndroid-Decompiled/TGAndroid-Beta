package kh;

import ai.n1;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.o;
import ci.o1;
import ei.x3;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.s40;
import org.telegram.ui.re;
import org.telegram.ui.sn;
import w7.b6;
import w7.z5;
import zf.h0;
import zf.i0;
public class e extends FrameLayout implements ne.d {
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final RectF K;
    public float E;
    public final Paint F;
    public int G;
    public final o[] f15063a;
    public final View.OnClickListener[] f15064b;
    public final re[] f15065c;
    public d d;
    public final FrameLayout e;
    public final HashSet f15066f;
    public final d6 h;
    public final bh.b f15067n;
    public final eh.a f15068r;
    public dh.d f15069s;
    public final ne.b v;
    public final ne.b f15070w;
    public float f15071x;
    public float f15072y;

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

    public e(Context context, bh.b bVar, eh.a aVar, d6 d6Var) {
        super(context);
        this.f15063a = new o[5];
        this.f15064b = new View.OnClickListener[5];
        this.f15065c = new re[5];
        this.f15066f = new HashSet();
        bs bsVar = bs.h;
        this.v = new ne.b(99, this, bsVar, 320L, false);
        this.f15070w = new ne.b(100, this, bsVar, 320L, false);
        this.F = new Paint(1);
        this.G = 0;
        this.f15067n = bVar;
        this.f15068r = aVar;
        this.h = d6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        o1 o1Var = i0.f51593a;
        frameLayout.setOutlineProvider(new h0(0, AndroidUtilities.dp(22.0f)));
        addView(frameLayout, z5.e(-1, 44, 16));
    }

    @Override
    public final void E(float f7, int i10) {
        o oVar;
        x3 x3Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            o[] oVarArr = this.f15063a;
            if (i11 < oVarArr.length && (oVar = oVarArr[i11]) != null && i12 == 1 && ((ne.b) oVar.f2672c).f17380f) {
                re reVar = this.f15065c[i11];
                if (reVar != null) {
                    final jh.a aVar = (jh.a) oVar.f2671b;
                    boolean z10 = oVar.f2670a;
                    int i13 = reVar.f40708a;
                    final sn snVar = reVar.f40709b;
                    switch (i13) {
                        case 26:
                            if (snVar.J0 == null && !z10 && (((x3Var = snVar.L0) == null || !x3Var.V) && s40.h.c())) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                sn snVar2 = snVar;
                                                if (snVar2.getParentActivity() != null) {
                                                    float f10 = snVar2.v.f(2).d / AndroidUtilities.density;
                                                    jh.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (snVar2.X0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    ei.x3 x3Var2 = new ei.x3(snVar2.getParentActivity(), 3);
                                                    snVar2.J0 = x3Var2;
                                                    x3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    snVar2.J0.p(false);
                                                    snVar2.J0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    snVar2.J0.l(1.0f, (-width) + 7.33f);
                                                    snVar2.X0.addView(snVar2.J0, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, f10 + 50.0f, -1, 87));
                                                    ei.x3 x3Var3 = snVar2.J0;
                                                    x3Var3.f10081l0 = new mg(snVar2, 3);
                                                    x3Var3.u();
                                                    org.telegram.ui.Components.s40.h.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                sn snVar3 = snVar;
                                                if (snVar3.getParentActivity() != null) {
                                                    float f11 = snVar3.v.f(2).d / AndroidUtilities.density;
                                                    jh.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (snVar3.X0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    ei.x3 x3Var4 = new ei.x3(snVar3.getParentActivity(), 3);
                                                    snVar3.L0 = x3Var4;
                                                    x3Var4.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    snVar3.L0.p(false);
                                                    ei.x3 x3Var5 = snVar3.L0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (x3Var5.getMeasuredWidth() < 0) {
                                                        x3Var5.G = string;
                                                    } else {
                                                        x3Var5.H.t(string, !LocaleController.isRTL, true);
                                                    }
                                                    snVar3.L0.l(1.0f, (-width2) + 7.33f);
                                                    snVar3.X0.addView(snVar3.L0, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, f11 + 50.0f, -1, 87));
                                                    ei.x3 x3Var6 = snVar3.L0;
                                                    x3Var6.f10081l0 = new mg(snVar3, 12);
                                                    x3Var6.u();
                                                    org.telegram.ui.Components.s40.f30183f.b();
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
                            if (snVar.L0 == null && !z10 && s40.f30183f.c()) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                sn snVar2 = snVar;
                                                if (snVar2.getParentActivity() != null) {
                                                    float f10 = snVar2.v.f(2).d / AndroidUtilities.density;
                                                    jh.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (snVar2.X0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    ei.x3 x3Var2 = new ei.x3(snVar2.getParentActivity(), 3);
                                                    snVar2.J0 = x3Var2;
                                                    x3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    snVar2.J0.p(false);
                                                    snVar2.J0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    snVar2.J0.l(1.0f, (-width) + 7.33f);
                                                    snVar2.X0.addView(snVar2.J0, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, f10 + 50.0f, -1, 87));
                                                    ei.x3 x3Var3 = snVar2.J0;
                                                    x3Var3.f10081l0 = new mg(snVar2, 3);
                                                    x3Var3.u();
                                                    org.telegram.ui.Components.s40.h.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                sn snVar3 = snVar;
                                                if (snVar3.getParentActivity() != null) {
                                                    float f11 = snVar3.v.f(2).d / AndroidUtilities.density;
                                                    jh.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (snVar3.X0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    ei.x3 x3Var4 = new ei.x3(snVar3.getParentActivity(), 3);
                                                    snVar3.L0 = x3Var4;
                                                    x3Var4.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    snVar3.L0.p(false);
                                                    ei.x3 x3Var5 = snVar3.L0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (x3Var5.getMeasuredWidth() < 0) {
                                                        x3Var5.G = string;
                                                    } else {
                                                        x3Var5.H.t(string, !LocaleController.isRTL, true);
                                                    }
                                                    snVar3.L0.l(1.0f, (-width2) + 7.33f);
                                                    snVar3.X0.addView(snVar3.L0, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, f11 + 50.0f, -1, 87));
                                                    ei.x3 x3Var6 = snVar3.L0;
                                                    x3Var6.f10081l0 = new mg(snVar3, 12);
                                                    x3Var6.u();
                                                    org.telegram.ui.Components.s40.f30183f.b();
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
                oVar.f2670a = true;
            }
        }
    }

    public final void a() {
        int[] iArr;
        View childAt;
        int i10;
        float f7 = 0.0f;
        this.f15072y = 0.0f;
        this.E = 0.0f;
        o[] oVarArr = this.f15063a;
        for (o oVar : oVarArr) {
            if (oVar != null) {
                jh.a aVar = (jh.a) oVar.f2671b;
                float f10 = ((ne.b) oVar.f2672c).e * this.f15071x;
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
        o oVar2 = oVarArr[iArr2[0]];
        if (oVar2 != null) {
            float dp = ((ne.b) oVar2.f2672c).e * AndroidUtilities.dp(54.0f);
            ((jh.a) oVar2.f2671b).setTranslationX(AndroidUtilities.dp(1.0f) + this.f15072y);
            this.f15072y += dp;
        }
        int i11 = 0;
        while (true) {
            iArr = J;
            if (i11 >= 4) {
                break;
            }
            o oVar3 = oVarArr[iArr[i11]];
            if (oVar3 != null) {
                jh.a aVar2 = (jh.a) oVar3.f2671b;
                float dp2 = ((ne.b) oVar3.f2672c).e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.E);
                this.E += dp2;
            }
            i11++;
        }
        if (this.f15071x < 1.0f) {
            o oVar4 = oVarArr[iArr2[0]];
            if (oVar4 != null) {
                jh.a aVar3 = (jh.a) oVar4.f2671b;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f15071x) * this.f15072y));
            }
            for (int i12 = 0; i12 < 4; i12++) {
                o oVar5 = oVarArr[iArr[i12]];
                if (oVar5 != null) {
                    jh.a aVar4 = (jh.a) oVar5.f2671b;
                    aVar4.setTranslationX(((1.0f - this.f15071x) * this.E) + aVar4.getTranslationX());
                }
            }
            float f11 = this.f15072y;
            float f12 = this.f15071x;
            this.f15072y = f11 * f12;
            this.E *= f12;
        }
        float f13 = this.f15070w.e;
        if (f13 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i13 = 0; i13 < getContainer().getChildCount(); i13++) {
                if (this.f15066f.contains(getContainer().getChildAt(i13))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f7 = Math.max(f7, childAt.getRight());
                }
            }
            if (measuredWidth > f7) {
                f7 = (measuredWidth + f7) / 2.0f;
                measuredWidth = f7;
            }
            this.f15072y = AndroidUtilities.lerp(this.f15072y, measuredWidth - AndroidUtilities.dp(3.33f), f13);
            this.E = AndroidUtilities.lerp(this.E, (getMeasuredWidth() - f7) - AndroidUtilities.dp(17.66f), f13);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f14 = this.f15072y;
            float f15 = this.E;
            ih.f fVar = ((re) dVar).f40709b.S;
            fVar.f13132x = f14;
            fVar.f13133y = f15;
            fVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i12 = I[0];
        o[] oVarArr = this.f15063a;
        o oVar = oVarArr[i12];
        if (oVar != null) {
            if (((ne.b) oVar.f2672c).f17380f) {
                i11 = AndroidUtilities.dp(54.0f);
            } else {
                i11 = 0;
            }
            dp += i11;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            o oVar2 = oVarArr[J[i13]];
            if (oVar2 != null) {
                if (((ne.b) oVar2.f2672c).f17380f) {
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
        Object[] objArr;
        if (i10 >= 0) {
            o[] oVarArr = this.f15063a;
            if (i10 < oVarArr.length && ((objArr = oVarArr[i10]) != 0 || z10)) {
                if (objArr == 0) {
                    ne.b bVar = new ne.b((i10 << 16) | 1, this, bs.h, 300L, false);
                    jh.a d = jh.a.d(getContext(), this.f15067n, this.f15068r, this.h, H[i10], 48);
                    if (i10 == 1) {
                        d.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i10 == 2) {
                        d.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i10 == 0) {
                        d.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i10 == 3) {
                        d.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    b6.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new n1(this, i10, 4));
                    addView(d, z5.d(56.0f, 56));
                    ?? obj = new Object();
                    obj.f2671b = d;
                    obj.f2672c = bVar;
                    oVarArr[i10] = obj;
                    a();
                }
                ((ne.b) oVarArr[i10].f2672c).a(z10, z11);
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
                if (this.f15066f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.f15070w.a(z11, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = (int) (this.f15071x * 255.0f * this.v.e);
        if (i10 > 0) {
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.E;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = K;
            rectF.set(this.f15072y + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), measuredWidth, measuredHeight);
            int i11 = this.G;
            Paint paint = this.F;
            paint.setColor(i11);
            paint.setAlpha(i10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.e && this.f15069s != null) {
            RectF rectF = K;
            rectF.set(this.f15072y + AndroidUtilities.dp(1.0f), 0.0f, (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.E, getMeasuredHeight());
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.f15069s.setBounds(rect);
            this.f15069s.draw(canvas);
        }
        return super.drawChild(canvas, view, j10);
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
        if (this.f15071x != f7) {
            this.f15071x = f7;
            a();
            invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d(false);
    }

    @Override
    public final void u(int i10, float f7, float f10, ne.e eVar) {
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
            o[] oVarArr = this.f15063a;
            if (i11 < oVarArr.length && oVarArr[i11] != null && i12 == 1) {
                b(true);
                a();
                invalidate();
            }
        }
    }
}
