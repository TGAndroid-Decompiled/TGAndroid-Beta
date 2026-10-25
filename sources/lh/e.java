package lh;

import ag.v0;
import ag.x0;
import ag.z0;
import ai.w;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.n;
import fi.v3;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.u40;
import org.telegram.ui.pe;
import org.telegram.ui.un;
public class e extends FrameLayout implements oe.d, p6 {
    public static final int[] I;
    public static final int[] J;
    public static final int[] K;
    public static final RectF L;
    public float E;
    public float F;
    public final Paint G;
    public int H;
    public final n[] f17028a;
    public final View.OnClickListener[] f17029b;
    public final pe[] f17030c;
    public d d;
    public final FrameLayout e;
    public final HashSet f17031f;
    public final u6 h;
    public final ch.b f17032n;
    public final fh.a f17033r;
    public boolean f17034s;
    public eh.d v;
    public final oe.b f17035w;
    public final oe.b f17036x;
    public float f17037y;

    static {
        int i10 = R.drawable.msg_search;
        int i11 = R.drawable.input_gift_s;
        int i12 = R.drawable.input_message;
        int i13 = R.drawable.msg_help;
        I = new int[]{i10, i11, i12, i13, i13};
        J = new int[]{0};
        K = new int[]{1, 2, 3, 4};
        L = new RectF();
    }

    public e(Context context, ch.b bVar, fh.a aVar, u6 u6Var) {
        super(context);
        this.f17028a = new n[5];
        this.f17029b = new View.OnClickListener[5];
        this.f17030c = new pe[5];
        this.f17031f = new HashSet();
        ds dsVar = ds.h;
        this.f17035w = new oe.b(99, this, dsVar, 320L, false);
        this.f17036x = new oe.b(100, this, dsVar, 320L, false);
        this.G = new Paint(1);
        this.H = 0;
        this.f17032n = bVar;
        this.f17033r = aVar;
        this.h = u6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        v0 v0Var = z0.f1400a;
        frameLayout.setOutlineProvider(new x0(0, AndroidUtilities.dp(22.0f)));
        addView(frameLayout, gb1.i(-1, 44, 16));
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
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
            n[] nVarArr = this.f17028a;
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
        this.E = 0.0f;
        this.F = 0.0f;
        n[] nVarArr = this.f17028a;
        for (n nVar : nVarArr) {
            if (nVar != null) {
                kh.a aVar = (kh.a) nVar.f2121b;
                float f10 = ((oe.b) nVar.f2122c).e * this.f17037y;
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
        int[] iArr2 = J;
        n nVar2 = nVarArr[iArr2[0]];
        if (nVar2 != null) {
            float dp = ((oe.b) nVar2.f2122c).e * AndroidUtilities.dp(54.0f);
            ((kh.a) nVar2.f2121b).setTranslationX(AndroidUtilities.dp(1.0f) + this.E);
            this.E += dp;
        }
        int i11 = 0;
        while (true) {
            iArr = K;
            if (i11 >= 4) {
                break;
            }
            n nVar3 = nVarArr[iArr[i11]];
            if (nVar3 != null) {
                kh.a aVar2 = (kh.a) nVar3.f2121b;
                float dp2 = ((oe.b) nVar3.f2122c).e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.F);
                this.F += dp2;
            }
            i11++;
        }
        if (this.f17037y < 1.0f) {
            n nVar4 = nVarArr[iArr2[0]];
            if (nVar4 != null) {
                kh.a aVar3 = (kh.a) nVar4.f2121b;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f17037y) * this.E));
            }
            for (int i12 = 0; i12 < 4; i12++) {
                n nVar5 = nVarArr[iArr[i12]];
                if (nVar5 != null) {
                    kh.a aVar4 = (kh.a) nVar5.f2121b;
                    aVar4.setTranslationX(((1.0f - this.f17037y) * this.F) + aVar4.getTranslationX());
                }
            }
            float f11 = this.E;
            float f12 = this.f17037y;
            this.E = f11 * f12;
            this.F *= f12;
        }
        float f13 = this.f17036x.e;
        if (f13 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i13 = 0; i13 < getContainer().getChildCount(); i13++) {
                if (this.f17031f.contains(getContainer().getChildAt(i13))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f7 = Math.max(f7, childAt.getRight());
                }
            }
            if (measuredWidth > f7) {
                f7 = (measuredWidth + f7) / 2.0f;
                measuredWidth = f7;
            }
            this.E = AndroidUtilities.lerp(this.E, measuredWidth - AndroidUtilities.dp(3.33f), f13);
            this.F = AndroidUtilities.lerp(this.F, (getMeasuredWidth() - f7) - AndroidUtilities.dp(17.66f), f13);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f14 = this.E;
            float f15 = this.F;
            jh.f fVar = ((pe) dVar).f42479b.S;
            fVar.f15951x = f14;
            fVar.f15952y = f15;
            fVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i12 = J[0];
        n[] nVarArr = this.f17028a;
        n nVar = nVarArr[i12];
        if (nVar != null) {
            if (((oe.b) nVar.f2122c).f19327f) {
                i11 = AndroidUtilities.dp(54.0f);
            } else {
                i11 = 0;
            }
            dp += i11;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            n nVar2 = nVarArr[K[i13]];
            if (nVar2 != null) {
                if (((oe.b) nVar2.f2122c).f19327f) {
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
            n[] nVarArr = this.f17028a;
            if (i10 < nVarArr.length && ((objArr = nVarArr[i10]) != 0 || z10)) {
                if (objArr == 0) {
                    oe.b bVar = new oe.b((i10 << 16) | 1, this, ds.h, 300L, false);
                    kh.a d = kh.a.d(getContext(), this.f17032n, this.f17033r, this.h, I[i10], 48);
                    if (i10 == 1) {
                        d.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i10 == 2) {
                        d.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i10 == 0) {
                        d.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i10 == 3) {
                        d.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    gb1.c(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new w(this, i10, 5));
                    addView(d, gb1.g(56.0f, 56));
                    ?? obj = new Object();
                    obj.f2121b = d;
                    obj.f2122c = bVar;
                    nVarArr[i10] = obj;
                    a();
                }
                ((oe.b) nVarArr[i10].f2122c).a(z10, z11);
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
                if (this.f17031f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.f17036x.a(z11, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = (int) (this.f17037y * 255.0f * this.f17035w.e);
        if (i10 > 0 && !this.f17034s) {
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.F;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = L;
            rectF.set(this.E + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), measuredWidth, measuredHeight);
            int i11 = this.H;
            Paint paint = this.G;
            paint.setColor(i11);
            paint.setAlpha(i10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.e && this.v != null && !this.f17034s) {
            RectF rectF = L;
            rectF.set(this.E + AndroidUtilities.dp(1.0f), 0.0f, (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.F, getMeasuredHeight());
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.v.setBounds(rect);
            this.v.draw(canvas);
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
        this.H = i10;
    }

    public void setCenterMenuVisible(boolean z10) {
        float f7;
        this.f17034s = z10;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.e.setAlpha(f7);
        invalidate();
    }

    public void setOnButtonsTotalWidthChanged(d dVar) {
        this.d = dVar;
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.f17037y != f7) {
            this.f17037y = f7;
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
    public final void updateColors() {
        n[] nVarArr;
        kh.a aVar;
        for (n nVar : this.f17028a) {
            if (nVar != null && (aVar = (kh.a) nVar.f2121b) != null) {
                aVar.updateColors();
            }
        }
    }

    @Override
    public final void z(float f7, int i10) {
        n nVar;
        v3 v3Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            n[] nVarArr = this.f17028a;
            if (i11 < nVarArr.length && (nVar = nVarArr[i11]) != null && i12 == 1 && ((oe.b) nVar.f2122c).f19327f) {
                pe peVar = this.f17030c[i11];
                if (peVar != null) {
                    final kh.a aVar = (kh.a) nVar.f2121b;
                    boolean z10 = nVar.f2120a;
                    int i13 = peVar.f42478a;
                    final un unVar = peVar.f42479b;
                    switch (i13) {
                        case 27:
                            if (unVar.V0 == null && !z10 && (((v3Var = unVar.X0) == null || !v3Var.V) && u40.h.c())) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                un unVar2 = unVar;
                                                if (unVar2.getParentActivity() != null) {
                                                    float f10 = unVar2.v.f(2).d / AndroidUtilities.density;
                                                    kh.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (unVar2.f44292j1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    fi.v3 v3Var2 = new fi.v3(unVar2.getParentActivity(), 3);
                                                    unVar2.X0 = v3Var2;
                                                    v3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    unVar2.X0.p(false);
                                                    fi.v3 v3Var3 = unVar2.X0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (v3Var3.getMeasuredWidth() < 0) {
                                                        v3Var3.G = string;
                                                    } else {
                                                        v3Var3.H.t(string, !LocaleController.isRTL, true);
                                                    }
                                                    unVar2.X0.l(1.0f, (-width) + 7.33f);
                                                    unVar2.f44292j1.addView(unVar2.X0, org.telegram.ui.Components.gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                    fi.v3 v3Var4 = unVar2.X0;
                                                    v3Var4.f11798l0 = new jg(unVar2, 16);
                                                    v3Var4.u();
                                                    org.telegram.ui.Components.u40.f33240f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                un unVar3 = unVar;
                                                if (unVar3.getParentActivity() != null) {
                                                    float f11 = unVar3.v.f(2).d / AndroidUtilities.density;
                                                    kh.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (unVar3.f44292j1.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    fi.v3 v3Var5 = new fi.v3(unVar3.getParentActivity(), 3);
                                                    unVar3.V0 = v3Var5;
                                                    v3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    unVar3.V0.p(false);
                                                    unVar3.V0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    unVar3.V0.l(1.0f, (-width2) + 7.33f);
                                                    unVar3.f44292j1.addView(unVar3.V0, org.telegram.ui.Components.gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    fi.v3 v3Var6 = unVar3.V0;
                                                    v3Var6.f11798l0 = new kf(unVar3, 21);
                                                    v3Var6.u();
                                                    org.telegram.ui.Components.u40.h.b();
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
                            if (unVar.X0 == null && !z10 && u40.f33240f.c()) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                un unVar2 = unVar;
                                                if (unVar2.getParentActivity() != null) {
                                                    float f10 = unVar2.v.f(2).d / AndroidUtilities.density;
                                                    kh.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (unVar2.f44292j1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    fi.v3 v3Var2 = new fi.v3(unVar2.getParentActivity(), 3);
                                                    unVar2.X0 = v3Var2;
                                                    v3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    unVar2.X0.p(false);
                                                    fi.v3 v3Var3 = unVar2.X0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (v3Var3.getMeasuredWidth() < 0) {
                                                        v3Var3.G = string;
                                                    } else {
                                                        v3Var3.H.t(string, !LocaleController.isRTL, true);
                                                    }
                                                    unVar2.X0.l(1.0f, (-width) + 7.33f);
                                                    unVar2.f44292j1.addView(unVar2.X0, org.telegram.ui.Components.gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                    fi.v3 v3Var4 = unVar2.X0;
                                                    v3Var4.f11798l0 = new jg(unVar2, 16);
                                                    v3Var4.u();
                                                    org.telegram.ui.Components.u40.f33240f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                un unVar3 = unVar;
                                                if (unVar3.getParentActivity() != null) {
                                                    float f11 = unVar3.v.f(2).d / AndroidUtilities.density;
                                                    kh.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (unVar3.f44292j1.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    fi.v3 v3Var5 = new fi.v3(unVar3.getParentActivity(), 3);
                                                    unVar3.V0 = v3Var5;
                                                    v3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    unVar3.V0.p(false);
                                                    unVar3.V0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    unVar3.V0.l(1.0f, (-width2) + 7.33f);
                                                    unVar3.f44292j1.addView(unVar3.V0, org.telegram.ui.Components.gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    fi.v3 v3Var6 = unVar3.V0;
                                                    v3Var6.f11798l0 = new kf(unVar3, 21);
                                                    v3Var6.u();
                                                    org.telegram.ui.Components.u40.h.b();
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
                nVar.f2120a = true;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
