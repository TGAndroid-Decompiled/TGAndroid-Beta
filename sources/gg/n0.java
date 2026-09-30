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
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bj1;
import org.telegram.ui.xi1;
import org.telegram.ui.yh0;
import org.telegram.ui.zh0;
import w7.y5;
import yh.x3;
public final class n0 extends yl0 {
    public final int f9860c;
    public final Object d;

    public n0(Object obj, int i10) {
        this.f9860c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f9860c) {
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
        int i10 = this.f9860c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((s0) obj).f9914e3.size();
            case 1:
                return 1;
            case 2:
                return ((xn0) obj).f30431r.size();
            case 3:
                return ((zh0) obj).f40605c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f31978k0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((x3) obj).P0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f9860c) {
            case 1:
                return i10;
            case 5:
                return ((rg.h) ((rg.j) this.d).d.get(i10)).f42686a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        yq yqVar;
        float f7;
        switch (this.f9860c) {
            case 0:
                ((r0) c1Var).v.setData((q0) ((s0) this.d).f9914e3.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = c1Var.f43068a;
                xn0 xn0Var = (xn0) this.d;
                ArrayList arrayList = xn0Var.f30431r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    un0 un0Var = (un0) arrayList.get(i10);
                    wn0 wn0Var = (wn0) view;
                    zg.o0 o0Var = wn0Var.d;
                    boolean z11 = true;
                    if (o0Var != null && o0Var.equals(un0Var.f28898a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = un0Var.f28898a.g();
                        tL_reactionCount.count = un0Var.f28899b;
                        xn0 xn0Var2 = wn0Var.f30017s;
                        vn0 vn0Var = new vn0(wn0Var, xn0Var2.f30426a, wn0Var, tL_reactionCount, xn0Var2.f30428c);
                        wn0Var.f30011a = vn0Var;
                        vn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        vn0 vn0Var2 = wn0Var.f30011a;
                        vn0Var2.f49490q = true;
                        vn0Var2.S = true;
                    } else {
                        wn0Var.f30011a.f49495w = un0Var.f28899b;
                    }
                    wn0Var.d = un0Var.f28898a;
                    if (!z10) {
                        vn0 vn0Var3 = wn0Var.f30011a;
                        vn0Var3.f49478f = vn0Var3.A;
                    }
                    wn0Var.f30011a.A = AndroidUtilities.dp(44.33f);
                    wn0Var.f30011a.f49494u = !TextUtils.isEmpty(un0Var.f28900c);
                    vn0 vn0Var4 = wn0Var.f30011a;
                    boolean z12 = vn0Var4.f49494u;
                    o6 o6Var = vn0Var4.G;
                    if (z12) {
                        o6Var.q(Emoji.replaceEmoji(un0Var.f28900c, o6Var.f26990a.getFontMetricsInt(), false), !z10, true);
                    } else if (o6Var != null) {
                        o6Var.q("", !z10, true);
                    }
                    vn0 vn0Var5 = wn0Var.f30011a;
                    Integer.toString(un0Var.f28899b);
                    vn0Var5.getClass();
                    wn0Var.f30011a.F.c(un0Var.f28899b, !z10);
                    vn0 vn0Var6 = wn0Var.f30011a;
                    if (vn0Var6.F != null && (vn0Var6.f49495w > 0 || vn0Var6.f49494u)) {
                        float f10 = vn0Var6.A;
                        int ceil = (int) Math.ceil(yqVar.f30784m);
                        if (wn0Var.f30011a.f49494u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        vn0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + wn0Var.f30011a.G.d + f10);
                    }
                    if (z10) {
                        vn0 vn0Var7 = wn0Var.f30011a;
                        vn0Var7.f49478f = vn0Var7.A;
                    }
                    wn0Var.f30011a.B = AndroidUtilities.dp(28.0f);
                    vn0 vn0Var8 = wn0Var.f30011a;
                    vn0Var8.f49489p = wn0Var.e;
                    if (wn0Var.f30016r) {
                        vn0Var8.a();
                    }
                    if (!z10) {
                        wn0Var.requestLayout();
                    }
                    wn0 wn0Var2 = (wn0) view;
                    if (un0Var.f28898a.h != xn0Var.h) {
                        z11 = false;
                    }
                    wn0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                zh0 zh0Var = (zh0) this.d;
                ((yh0) c1Var.f43068a).a((TLObject) zh0Var.f40605c.get(i10), false, ((Integer) zh0Var.f40604b.get(i10)).intValue());
                return;
            case 4:
                ((xi1) c1Var.f43068a).f40033a = WallpapersListActivity.m0[i10];
                return;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).f42686a == 1) {
                    rg.i iVar = (rg.i) c1Var.f43068a;
                    iVar.f42693c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f42693c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).f42687b));
                    iVar.f42691a.setText(((rg.h) arrayList2.get(i10)).f42688c);
                    iVar.f42692b.setText(((rg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((x3) this.d).P0;
                ua uaVar = (ua) c1Var.f43068a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (uaVar.f28824a != i11) {
                    uaVar.f28824a = i11;
                    uaVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f9860c) {
            case 0:
                p0 p0Var = new p0(viewGroup.getContext(), ((s0) this.d).f31015p2);
                ?? c1Var = new s4.c1(p0Var);
                c1Var.v = p0Var;
                p0Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(30.0f)));
                return c1Var;
            case 1:
                return new s4.c1(((va) this.d).X);
            case 2:
                xn0 xn0Var = (xn0) this.d;
                return new s4.c1(new wn0(xn0Var, xn0Var.getContext()));
            case 3:
                yh0 yh0Var = new yh0(viewGroup.getContext());
                yh0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.c1(yh0Var);
            case 4:
                bj1 bj1Var = (bj1) this.d;
                return new s4.c1(new xi1(bj1Var.E, bj1Var.f32512c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                d6 d6Var = jVar.f42641a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f42693c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, y5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f42691a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    ok.n(h6.G6, d6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, y5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f42692b = textView2;
                    ok.n(h6.f19459y6, d6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, y5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ?? view2 = new View(((x3) this.d).getContext());
                view2.f28824a = 0;
                return new s4.c1(view2);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        boolean z10;
        switch (this.f9860c) {
            case 2:
                xn0 xn0Var = (xn0) this.d;
                ArrayList arrayList = xn0Var.f30431r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    wn0 wn0Var = (wn0) c1Var.f43068a;
                    if (((un0) arrayList.get(b10)).f28898a.h == xn0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    wn0Var.a(z10, false);
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
