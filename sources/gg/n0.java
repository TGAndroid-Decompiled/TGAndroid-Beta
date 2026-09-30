package gg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bj1;
import org.telegram.ui.xi1;
import org.telegram.ui.yh0;
import org.telegram.ui.zh0;
import w7.y5;
import yh.x3;
public final class n0 extends xl0 {
    public final int f9848c;
    public final Object d;

    public n0(Object obj, int i10) {
        this.f9848c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f9848c) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return false;
            default:
                return false;
        }
    }

    public void F(int i10, int i11) {
        int[] iArr = ((x3) this.d).P0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f9848c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((s0) obj).X2.size();
            case 1:
                return 1;
            case 2:
                return ((wn0) obj).f30095r.size();
            case 3:
                return ((zh0) obj).f40495c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f31906k0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((x3) obj).P0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f9848c) {
            case 1:
                return i10;
            case 5:
                return ((rg.h) ((rg.j) this.d).d.get(i10)).f42583a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        xq xqVar;
        float f7;
        switch (this.f9848c) {
            case 0:
                ((r0) c1Var).v.setData((q0) ((s0) this.d).X2.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = c1Var.f42962a;
                wn0 wn0Var = (wn0) this.d;
                ArrayList arrayList = wn0Var.f30095r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    tn0 tn0Var = (tn0) arrayList.get(i10);
                    vn0 vn0Var = (vn0) view;
                    zg.o0 o0Var = vn0Var.d;
                    boolean z11 = true;
                    if (o0Var != null && o0Var.equals(tn0Var.f28596a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = tn0Var.f28596a.g();
                        tL_reactionCount.count = tn0Var.f28597b;
                        wn0 wn0Var2 = vn0Var.f29156s;
                        un0 un0Var = new un0(vn0Var, wn0Var2.f30090a, vn0Var, tL_reactionCount, wn0Var2.f30092c);
                        vn0Var.f29150a = un0Var;
                        un0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        un0 un0Var2 = vn0Var.f29150a;
                        un0Var2.f49384q = true;
                        un0Var2.S = true;
                    } else {
                        vn0Var.f29150a.f49389w = tn0Var.f28597b;
                    }
                    vn0Var.d = tn0Var.f28596a;
                    if (!z10) {
                        un0 un0Var3 = vn0Var.f29150a;
                        un0Var3.f49372f = un0Var3.A;
                    }
                    vn0Var.f29150a.A = AndroidUtilities.dp(44.33f);
                    vn0Var.f29150a.f49388u = !TextUtils.isEmpty(tn0Var.f28598c);
                    un0 un0Var4 = vn0Var.f29150a;
                    boolean z12 = un0Var4.f49388u;
                    o6 o6Var = un0Var4.G;
                    if (z12) {
                        o6Var.q(Emoji.replaceEmoji(tn0Var.f28598c, o6Var.f26946a.getFontMetricsInt(), false), !z10, true);
                    } else if (o6Var != null) {
                        o6Var.q("", !z10, true);
                    }
                    un0 un0Var5 = vn0Var.f29150a;
                    Integer.toString(tn0Var.f28597b);
                    un0Var5.getClass();
                    vn0Var.f29150a.F.c(tn0Var.f28597b, !z10);
                    un0 un0Var6 = vn0Var.f29150a;
                    if (un0Var6.F != null && (un0Var6.f49389w > 0 || un0Var6.f49388u)) {
                        float f10 = un0Var6.A;
                        int ceil = (int) Math.ceil(xqVar.f30448m);
                        if (vn0Var.f29150a.f49388u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        un0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + vn0Var.f29150a.G.d + f10);
                    }
                    if (z10) {
                        un0 un0Var7 = vn0Var.f29150a;
                        un0Var7.f49372f = un0Var7.A;
                    }
                    vn0Var.f29150a.B = AndroidUtilities.dp(28.0f);
                    un0 un0Var8 = vn0Var.f29150a;
                    un0Var8.f49383p = vn0Var.e;
                    if (vn0Var.f29155r) {
                        un0Var8.a();
                    }
                    if (!z10) {
                        vn0Var.requestLayout();
                    }
                    vn0 vn0Var2 = (vn0) view;
                    if (tn0Var.f28596a.h != wn0Var.h) {
                        z11 = false;
                    }
                    vn0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                zh0 zh0Var = (zh0) this.d;
                ((yh0) c1Var.f42962a).a((TLObject) zh0Var.f40495c.get(i10), false, ((Integer) zh0Var.f40494b.get(i10)).intValue());
                return;
            case 4:
                ((xi1) c1Var.f42962a).f39936a = WallpapersListActivity.m0[i10];
                return;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).f42583a == 1) {
                    rg.i iVar = (rg.i) c1Var.f42962a;
                    iVar.f42590c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f42590c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).f42584b));
                    iVar.f42588a.setText(((rg.h) arrayList2.get(i10)).f42585c);
                    iVar.f42589b.setText(((rg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((x3) this.d).P0;
                ta taVar = (ta) c1Var.f42962a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (taVar.f28522a != i11) {
                    taVar.f28522a = i11;
                    taVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f9848c) {
            case 0:
                p0 p0Var = new p0(viewGroup.getContext(), ((s0) this.d).f30700p2);
                ?? c1Var = new s4.c1(p0Var);
                c1Var.v = p0Var;
                p0Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(30.0f)));
                return c1Var;
            case 1:
                return new s4.c1(((ua) this.d).X);
            case 2:
                wn0 wn0Var = (wn0) this.d;
                return new s4.c1(new vn0(wn0Var, wn0Var.getContext()));
            case 3:
                yh0 yh0Var = new yh0(viewGroup.getContext());
                yh0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.c1(yh0Var);
            case 4:
                bj1 bj1Var = (bj1) this.d;
                return new s4.c1(new xi1(bj1Var.E, bj1Var.f32439c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                d6 d6Var = jVar.f42538a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f42590c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, y5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f42588a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    ok.n(h6.G6, d6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, y5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f42589b = textView2;
                    ok.n(h6.f19444y6, d6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, y5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ?? view2 = new View(((x3) this.d).getContext());
                view2.f28522a = 0;
                return new s4.c1(view2);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        boolean z10;
        switch (this.f9848c) {
            case 2:
                wn0 wn0Var = (wn0) this.d;
                ArrayList arrayList = wn0Var.f30095r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    vn0 vn0Var = (vn0) c1Var.f42962a;
                    if (((tn0) arrayList.get(b10)).f28596a.h == wn0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vn0Var.a(z10, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
