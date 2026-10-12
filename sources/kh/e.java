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
import bi.a2;
import di.d4;
import di.m4;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.w40;
import org.telegram.ui.fo;
import org.telegram.ui.xe;
import w7.a6;
import zf.i0;
import zf.j0;
public class e extends FrameLayout implements ne.d {
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final RectF K;
    public float E;
    public final Paint F;
    public int G;
    public final o[] f14266a;
    public final View.OnClickListener[] f14267b;
    public final xe[] f14268c;
    public d d;
    public final FrameLayout e;
    public final HashSet f14269f;
    public final c6 h;
    public final bh.b f14270n;
    public final eh.a f14271r;
    public dh.d f14272s;
    public final ne.b v;
    public final ne.b f14273w;
    public float f14274x;
    public float f14275y;

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

    public e(Context context, bh.b bVar, eh.a aVar, c6 c6Var) {
        super(context);
        this.f14266a = new o[5];
        this.f14267b = new View.OnClickListener[5];
        this.f14268c = new xe[5];
        this.f14269f = new HashSet();
        es esVar = es.h;
        this.v = new ne.b(99, this, esVar, 320L, false);
        this.f14273w = new ne.b(100, this, esVar, 320L, false);
        this.F = new Paint(1);
        this.G = 0;
        this.f14270n = bVar;
        this.f14271r = aVar;
        this.h = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        a2 a2Var = j0.f50191a;
        frameLayout.setOutlineProvider(new i0(0, AndroidUtilities.dp(22.0f)));
        addView(frameLayout, a6.e(-1, 44, 16));
    }

    @Override
    public final void C(float f7, int i10) {
        o oVar;
        d4 d4Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            o[] oVarArr = this.f14266a;
            if (i11 < oVarArr.length && (oVar = oVarArr[i11]) != null && i12 == 1 && ((ne.b) oVar.f1050c).f16293f) {
                xe xeVar = this.f14268c[i11];
                if (xeVar != null) {
                    final jh.a aVar = (jh.a) oVar.f1049b;
                    boolean z10 = oVar.f1048a;
                    int i13 = xeVar.f41838a;
                    final fo foVar = xeVar.f41839b;
                    switch (i13) {
                        case 26:
                            if (foVar.J0 == null && !z10 && (((d4Var = foVar.L0) == null || !d4Var.V) && w40.h.c())) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                fo foVar2 = foVar;
                                                if (foVar2.getParentActivity() != null) {
                                                    float f10 = foVar2.v.f(2).d / AndroidUtilities.density;
                                                    jh.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (foVar2.X0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    di.d4 d4Var2 = new di.d4(foVar2.getParentActivity(), 3);
                                                    foVar2.J0 = d4Var2;
                                                    d4Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    foVar2.J0.p(false);
                                                    foVar2.J0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    foVar2.J0.l(1.0f, (-width) + 7.33f);
                                                    foVar2.X0.addView(foVar2.J0, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, f10 + 50.0f, -1, 87));
                                                    di.d4 d4Var3 = foVar2.J0;
                                                    d4Var3.f6801l0 = new xg(foVar2, 3);
                                                    d4Var3.u();
                                                    org.telegram.ui.Components.w40.h.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                fo foVar3 = foVar;
                                                if (foVar3.getParentActivity() != null) {
                                                    float f11 = foVar3.v.f(2).d / AndroidUtilities.density;
                                                    jh.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (foVar3.X0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    di.d4 d4Var4 = new di.d4(foVar3.getParentActivity(), 3);
                                                    foVar3.L0 = d4Var4;
                                                    d4Var4.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    foVar3.L0.p(false);
                                                    di.d4 d4Var5 = foVar3.L0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (d4Var5.getMeasuredWidth() < 0) {
                                                        d4Var5.G = string;
                                                    } else {
                                                        d4Var5.H.t(string, !LocaleController.isRTL, true);
                                                    }
                                                    foVar3.L0.l(1.0f, (-width2) + 7.33f);
                                                    foVar3.X0.addView(foVar3.L0, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, f11 + 50.0f, -1, 87));
                                                    di.d4 d4Var6 = foVar3.L0;
                                                    d4Var6.f6801l0 = new xg(foVar3, 12);
                                                    d4Var6.u();
                                                    org.telegram.ui.Components.w40.f30788f.b();
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
                            if (foVar.L0 == null && !z10 && w40.f30788f.c()) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                fo foVar2 = foVar;
                                                if (foVar2.getParentActivity() != null) {
                                                    float f10 = foVar2.v.f(2).d / AndroidUtilities.density;
                                                    jh.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (foVar2.X0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    di.d4 d4Var2 = new di.d4(foVar2.getParentActivity(), 3);
                                                    foVar2.J0 = d4Var2;
                                                    d4Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    foVar2.J0.p(false);
                                                    foVar2.J0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    foVar2.J0.l(1.0f, (-width) + 7.33f);
                                                    foVar2.X0.addView(foVar2.J0, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, f10 + 50.0f, -1, 87));
                                                    di.d4 d4Var3 = foVar2.J0;
                                                    d4Var3.f6801l0 = new xg(foVar2, 3);
                                                    d4Var3.u();
                                                    org.telegram.ui.Components.w40.h.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                fo foVar3 = foVar;
                                                if (foVar3.getParentActivity() != null) {
                                                    float f11 = foVar3.v.f(2).d / AndroidUtilities.density;
                                                    jh.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (foVar3.X0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    di.d4 d4Var4 = new di.d4(foVar3.getParentActivity(), 3);
                                                    foVar3.L0 = d4Var4;
                                                    d4Var4.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    foVar3.L0.p(false);
                                                    di.d4 d4Var5 = foVar3.L0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (d4Var5.getMeasuredWidth() < 0) {
                                                        d4Var5.G = string;
                                                    } else {
                                                        d4Var5.H.t(string, !LocaleController.isRTL, true);
                                                    }
                                                    foVar3.L0.l(1.0f, (-width2) + 7.33f);
                                                    foVar3.X0.addView(foVar3.L0, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, f11 + 50.0f, -1, 87));
                                                    di.d4 d4Var6 = foVar3.L0;
                                                    d4Var6.f6801l0 = new xg(foVar3, 12);
                                                    d4Var6.u();
                                                    org.telegram.ui.Components.w40.f30788f.b();
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
                oVar.f1048a = true;
            }
        }
    }

    public final void a() {
        int[] iArr;
        View childAt;
        int i10;
        float f7 = 0.0f;
        this.f14275y = 0.0f;
        this.E = 0.0f;
        o[] oVarArr = this.f14266a;
        for (o oVar : oVarArr) {
            if (oVar != null) {
                jh.a aVar = (jh.a) oVar.f1049b;
                float f10 = ((ne.b) oVar.f1050c).e * this.f14274x;
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
            float dp = ((ne.b) oVar2.f1050c).e * AndroidUtilities.dp(54.0f);
            ((jh.a) oVar2.f1049b).setTranslationX(AndroidUtilities.dp(1.0f) + this.f14275y);
            this.f14275y += dp;
        }
        int i11 = 0;
        while (true) {
            iArr = J;
            if (i11 >= 4) {
                break;
            }
            o oVar3 = oVarArr[iArr[i11]];
            if (oVar3 != null) {
                jh.a aVar2 = (jh.a) oVar3.f1049b;
                float dp2 = ((ne.b) oVar3.f1050c).e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.E);
                this.E += dp2;
            }
            i11++;
        }
        if (this.f14274x < 1.0f) {
            o oVar4 = oVarArr[iArr2[0]];
            if (oVar4 != null) {
                jh.a aVar3 = (jh.a) oVar4.f1049b;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f14274x) * this.f14275y));
            }
            for (int i12 = 0; i12 < 4; i12++) {
                o oVar5 = oVarArr[iArr[i12]];
                if (oVar5 != null) {
                    jh.a aVar4 = (jh.a) oVar5.f1049b;
                    aVar4.setTranslationX(((1.0f - this.f14274x) * this.E) + aVar4.getTranslationX());
                }
            }
            float f11 = this.f14275y;
            float f12 = this.f14274x;
            this.f14275y = f11 * f12;
            this.E *= f12;
        }
        float f13 = this.f14273w.e;
        if (f13 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i13 = 0; i13 < getContainer().getChildCount(); i13++) {
                if (this.f14269f.contains(getContainer().getChildAt(i13))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f7 = Math.max(f7, childAt.getRight());
                }
            }
            if (measuredWidth > f7) {
                f7 = (measuredWidth + f7) / 2.0f;
                measuredWidth = f7;
            }
            this.f14275y = AndroidUtilities.lerp(this.f14275y, measuredWidth - AndroidUtilities.dp(3.33f), f13);
            this.E = AndroidUtilities.lerp(this.E, (getMeasuredWidth() - f7) - AndroidUtilities.dp(17.66f), f13);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f14 = this.f14275y;
            float f15 = this.E;
            ih.f fVar = ((xe) dVar).f41839b.S;
            fVar.f11746x = f14;
            fVar.f11747y = f15;
            fVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i12 = I[0];
        o[] oVarArr = this.f14266a;
        o oVar = oVarArr[i12];
        if (oVar != null) {
            if (((ne.b) oVar.f1050c).f16293f) {
                i11 = AndroidUtilities.dp(54.0f);
            } else {
                i11 = 0;
            }
            dp += i11;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            o oVar2 = oVarArr[J[i13]];
            if (oVar2 != null) {
                if (((ne.b) oVar2.f1050c).f16293f) {
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
            o[] oVarArr = this.f14266a;
            if (i10 < oVarArr.length && ((objArr = oVarArr[i10]) != 0 || z10)) {
                if (objArr == 0) {
                    ne.b bVar = new ne.b((i10 << 16) | 1, this, es.h, 300L, false);
                    jh.a d = jh.a.d(getContext(), this.f14270n, this.f14271r, this.h, H[i10], 48);
                    if (i10 == 1) {
                        d.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i10 == 2) {
                        d.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i10 == 0) {
                        d.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i10 == 3) {
                        d.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    w7.c6.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new m4(this, i10, 3));
                    addView(d, a6.d(56.0f, 56));
                    ?? obj = new Object();
                    obj.f1049b = d;
                    obj.f1050c = bVar;
                    oVarArr[i10] = obj;
                    a();
                }
                ((ne.b) oVarArr[i10].f1050c).a(z10, z11);
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
                if (this.f14269f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.f14273w.a(z11, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = (int) (this.f14274x * 255.0f * this.v.e);
        if (i10 > 0) {
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.E;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = K;
            rectF.set(this.f14275y + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), measuredWidth, measuredHeight);
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
        if (view == this.e && this.f14272s != null) {
            RectF rectF = K;
            rectF.set(this.f14275y + AndroidUtilities.dp(1.0f), 0.0f, (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.E, getMeasuredHeight());
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.f14272s.setBounds(rect);
            this.f14272s.draw(canvas);
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

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
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
            o[] oVarArr = this.f14266a;
            if (i11 < oVarArr.length && oVarArr[i11] != null && i12 == 1) {
                b(true);
                a();
                invalidate();
            }
        }
    }

    public void setAccentColor(int i10) {
        this.G = i10;
    }

    public void setOnButtonsTotalWidthChanged(d dVar) {
        this.d = dVar;
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.f14274x != f7) {
            this.f14274x = f7;
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
