package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.o;
import bi.z1;
import di.f4;
import di.o4;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.pr;
import org.telegram.ui.co;
import org.telegram.ui.ve;
import w7.x5;
import w7.z5;
import yf.i0;
import yf.j0;
public class e extends FrameLayout implements le.d {
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final RectF K;
    public float E;
    public final Paint F;
    public int G;
    public final o[] f14970a;
    public final View.OnClickListener[] f14971b;
    public final ve[] f14972c;
    public d d;
    public final FrameLayout f14973e;
    public final HashSet f14974f;
    public final f6 h;
    public final bh.b f14975n;
    public final eh.a f14976r;
    public dh.d f14977s;
    public final le.b v;
    public final le.b f14978w;
    public float f14979x;
    public float f14980y;

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

    public e(Context context, bh.b bVar, eh.a aVar, f6 f6Var) {
        super(context);
        this.f14970a = new o[5];
        this.f14971b = new View.OnClickListener[5];
        this.f14972c = new ve[5];
        this.f14974f = new HashSet();
        pr prVar = pr.h;
        this.v = new le.b(99, this, prVar, 320L, false);
        this.f14978w = new le.b(100, this, prVar, 320L, false);
        this.F = new Paint(1);
        this.G = 0;
        this.f14975n = bVar;
        this.f14976r = aVar;
        this.h = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14973e = frameLayout;
        frameLayout.setClipToOutline(true);
        z1 z1Var = j0.f50141a;
        frameLayout.setOutlineProvider(new i0(0, AndroidUtilities.dp(22.0f)));
        addView(frameLayout, x5.e(-1, 44, 16));
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
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
            o[] oVarArr = this.f14970a;
            if (i11 < oVarArr.length && oVarArr[i11] != null && i12 == 1) {
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
        this.f14980y = 0.0f;
        this.E = 0.0f;
        o[] oVarArr = this.f14970a;
        for (o oVar : oVarArr) {
            if (oVar != null) {
                jh.a aVar = (jh.a) oVar.f896c;
                float f10 = ((le.b) oVar.d).f15395e * this.f14979x;
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
            float dp = ((le.b) oVar2.d).f15395e * AndroidUtilities.dp(54.0f);
            ((jh.a) oVar2.f896c).setTranslationX(AndroidUtilities.dp(1.0f) + this.f14980y);
            this.f14980y += dp;
        }
        int i11 = 0;
        while (true) {
            iArr = J;
            if (i11 >= 4) {
                break;
            }
            o oVar3 = oVarArr[iArr[i11]];
            if (oVar3 != null) {
                jh.a aVar2 = (jh.a) oVar3.f896c;
                float dp2 = ((le.b) oVar3.d).f15395e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.E);
                this.E += dp2;
            }
            i11++;
        }
        if (this.f14979x < 1.0f) {
            o oVar4 = oVarArr[iArr2[0]];
            if (oVar4 != null) {
                jh.a aVar3 = (jh.a) oVar4.f896c;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f14979x) * this.f14980y));
            }
            for (int i12 = 0; i12 < 4; i12++) {
                o oVar5 = oVarArr[iArr[i12]];
                if (oVar5 != null) {
                    jh.a aVar4 = (jh.a) oVar5.f896c;
                    aVar4.setTranslationX(((1.0f - this.f14979x) * this.E) + aVar4.getTranslationX());
                }
            }
            float f11 = this.f14980y;
            float f12 = this.f14979x;
            this.f14980y = f11 * f12;
            this.E *= f12;
        }
        float f13 = this.f14978w.f15395e;
        if (f13 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i13 = 0; i13 < getContainer().getChildCount(); i13++) {
                if (this.f14974f.contains(getContainer().getChildAt(i13))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f7 = Math.max(f7, childAt.getRight());
                }
            }
            if (measuredWidth > f7) {
                f7 = (measuredWidth + f7) / 2.0f;
                measuredWidth = f7;
            }
            this.f14980y = AndroidUtilities.lerp(this.f14980y, measuredWidth - AndroidUtilities.dp(3.33f), f13);
            this.E = AndroidUtilities.lerp(this.E, (getMeasuredWidth() - f7) - AndroidUtilities.dp(17.66f), f13);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f14 = this.f14980y;
            float f15 = this.E;
            ih.g gVar = ((ve) dVar).f41550b.S;
            gVar.f12364x = f14;
            gVar.f12365y = f15;
            gVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i12 = I[0];
        o[] oVarArr = this.f14970a;
        o oVar = oVarArr[i12];
        if (oVar != null) {
            if (((le.b) oVar.d).f15396f) {
                i11 = AndroidUtilities.dp(54.0f);
            } else {
                i11 = 0;
            }
            dp += i11;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            o oVar2 = oVarArr[J[i13]];
            if (oVar2 != null) {
                if (((le.b) oVar2.d).f15396f) {
                    i10 = AndroidUtilities.dp(54.0f);
                } else {
                    i10 = 0;
                }
                dp2 += i10;
            }
        }
        FrameLayout frameLayout = this.f14973e;
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
        o oVar;
        if (i10 >= 0) {
            o[] oVarArr = this.f14970a;
            if (i10 < oVarArr.length && ((oVar = oVarArr[i10]) != null || z10)) {
                if (oVar == null) {
                    le.b bVar = new le.b((i10 << 16) | 1, this, pr.h, 300L, false);
                    jh.a d = jh.a.d(getContext(), this.f14975n, this.f14976r, this.h, H[i10], 48);
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
                    d.setOnClickListener(new o4(this, i10, 3));
                    addView(d, x5.c(56.0f, 56));
                    oVarArr[i10] = new o(d, bVar);
                    a();
                }
                ((le.b) oVarArr[i10].d).a(z10, z11);
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
                if (this.f14974f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.f14978w.a(z11, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = (int) (this.f14979x * 255.0f * this.v.f15395e);
        if (i10 > 0) {
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.E;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = K;
            rectF.set(this.f14980y + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), measuredWidth, measuredHeight);
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
        if (view == this.f14973e && this.f14977s != null) {
            RectF rectF = K;
            rectF.set(this.f14980y + AndroidUtilities.dp(1.0f), 0.0f, (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.E, getMeasuredHeight());
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.f14977s.setBounds(rect);
            this.f14977s.draw(canvas);
        }
        return super.drawChild(canvas, view, j3);
    }

    public FrameLayout getContainer() {
        return this.f14973e;
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
        if (this.f14979x != f7) {
            this.f14979x = f7;
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
    public final void z(float f7, int i10) {
        o oVar;
        f4 f4Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            o[] oVarArr = this.f14970a;
            if (i11 < oVarArr.length && (oVar = oVarArr[i11]) != null && i12 == 1 && ((le.b) oVar.d).f15396f) {
                ve veVar = this.f14972c[i11];
                if (veVar != null) {
                    final jh.a aVar = (jh.a) oVar.f896c;
                    boolean z10 = oVar.f895b;
                    int i13 = veVar.f41549a;
                    final co coVar = veVar.f41550b;
                    switch (i13) {
                        case 24:
                            if (coVar.J0 == null && !z10 && (((f4Var = coVar.L0) == null || !f4Var.V) && j40.h.c())) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                co coVar2 = coVar;
                                                if (coVar2.getParentActivity() != null) {
                                                    float f10 = coVar2.v.e(2).d / AndroidUtilities.density;
                                                    jh.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (coVar2.X0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    di.f4 f4Var2 = new di.f4(coVar2.getParentActivity(), 3);
                                                    coVar2.L0 = f4Var2;
                                                    f4Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    coVar2.L0.p(false);
                                                    di.f4 f4Var3 = coVar2.L0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (f4Var3.getMeasuredWidth() < 0) {
                                                        f4Var3.G = string;
                                                    } else {
                                                        f4Var3.H.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    coVar2.L0.l(1.0f, (-width) + 7.33f);
                                                    coVar2.X0.addView(coVar2.L0, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                    di.f4 f4Var4 = coVar2.L0;
                                                    f4Var4.f7238l0 = new qf(coVar2, 21);
                                                    f4Var4.u();
                                                    org.telegram.ui.Components.j40.f27362f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                co coVar3 = coVar;
                                                if (coVar3.getParentActivity() != null) {
                                                    float f11 = coVar3.v.e(2).d / AndroidUtilities.density;
                                                    jh.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (coVar3.X0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    di.f4 f4Var5 = new di.f4(coVar3.getParentActivity(), 3);
                                                    coVar3.J0 = f4Var5;
                                                    f4Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    coVar3.J0.p(false);
                                                    coVar3.J0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    coVar3.J0.l(1.0f, (-width2) + 7.33f);
                                                    coVar3.X0.addView(coVar3.J0, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    di.f4 f4Var6 = coVar3.J0;
                                                    f4Var6.f7238l0 = new ug(coVar3, 0);
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
                            if (coVar.L0 == null && !z10 && j40.f27362f.c()) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                co coVar2 = coVar;
                                                if (coVar2.getParentActivity() != null) {
                                                    float f10 = coVar2.v.e(2).d / AndroidUtilities.density;
                                                    jh.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (coVar2.X0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    di.f4 f4Var2 = new di.f4(coVar2.getParentActivity(), 3);
                                                    coVar2.L0 = f4Var2;
                                                    f4Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    coVar2.L0.p(false);
                                                    di.f4 f4Var3 = coVar2.L0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (f4Var3.getMeasuredWidth() < 0) {
                                                        f4Var3.G = string;
                                                    } else {
                                                        f4Var3.H.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    coVar2.L0.l(1.0f, (-width) + 7.33f);
                                                    coVar2.X0.addView(coVar2.L0, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                    di.f4 f4Var4 = coVar2.L0;
                                                    f4Var4.f7238l0 = new qf(coVar2, 21);
                                                    f4Var4.u();
                                                    org.telegram.ui.Components.j40.f27362f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                co coVar3 = coVar;
                                                if (coVar3.getParentActivity() != null) {
                                                    float f11 = coVar3.v.e(2).d / AndroidUtilities.density;
                                                    jh.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (coVar3.X0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    di.f4 f4Var5 = new di.f4(coVar3.getParentActivity(), 3);
                                                    coVar3.J0 = f4Var5;
                                                    f4Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    coVar3.J0.p(false);
                                                    coVar3.J0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    coVar3.J0.l(1.0f, (-width2) + 7.33f);
                                                    coVar3.X0.addView(coVar3.J0, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    di.f4 f4Var6 = coVar3.J0;
                                                    f4Var6.f7238l0 = new ug(coVar3, 0);
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
                oVar.f895b = true;
            }
        }
    }
}
