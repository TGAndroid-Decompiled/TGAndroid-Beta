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
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bj1;
import org.telegram.ui.xi1;
import org.telegram.ui.yh0;
import org.telegram.ui.zh0;
import w7.y5;
import yh.x3;
public final class n0 extends vl0 {
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
                return ((un0) obj).f28833r.size();
            case 3:
                return ((zh0) obj).f40479c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f31890k0;
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
                return ((rg.h) ((rg.j) this.d).d.get(i10)).f42567a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        wq wqVar;
        float f7;
        switch (this.f9848c) {
            case 0:
                ((r0) c1Var).v.setData((q0) ((s0) this.d).X2.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = c1Var.f42946a;
                un0 un0Var = (un0) this.d;
                ArrayList arrayList = un0Var.f28833r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    rn0 rn0Var = (rn0) arrayList.get(i10);
                    tn0 tn0Var = (tn0) view;
                    zg.o0 o0Var = tn0Var.d;
                    boolean z11 = true;
                    if (o0Var != null && o0Var.equals(rn0Var.f28003a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = rn0Var.f28003a.g();
                        tL_reactionCount.count = rn0Var.f28004b;
                        un0 un0Var2 = tn0Var.f28571s;
                        sn0 sn0Var = new sn0(tn0Var, un0Var2.f28828a, tn0Var, tL_reactionCount, un0Var2.f28830c);
                        tn0Var.f28565a = sn0Var;
                        sn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        sn0 sn0Var2 = tn0Var.f28565a;
                        sn0Var2.f49371q = true;
                        sn0Var2.S = true;
                    } else {
                        tn0Var.f28565a.f49376w = rn0Var.f28004b;
                    }
                    tn0Var.d = rn0Var.f28003a;
                    if (!z10) {
                        sn0 sn0Var3 = tn0Var.f28565a;
                        sn0Var3.f49359f = sn0Var3.A;
                    }
                    tn0Var.f28565a.A = AndroidUtilities.dp(44.33f);
                    tn0Var.f28565a.f49375u = !TextUtils.isEmpty(rn0Var.f28005c);
                    sn0 sn0Var4 = tn0Var.f28565a;
                    boolean z12 = sn0Var4.f49375u;
                    o6 o6Var = sn0Var4.G;
                    if (z12) {
                        o6Var.q(Emoji.replaceEmoji(rn0Var.f28005c, o6Var.f26924a.getFontMetricsInt(), false), !z10, true);
                    } else if (o6Var != null) {
                        o6Var.q("", !z10, true);
                    }
                    sn0 sn0Var5 = tn0Var.f28565a;
                    Integer.toString(rn0Var.f28004b);
                    sn0Var5.getClass();
                    tn0Var.f28565a.F.c(rn0Var.f28004b, !z10);
                    sn0 sn0Var6 = tn0Var.f28565a;
                    if (sn0Var6.F != null && (sn0Var6.f49376w > 0 || sn0Var6.f49375u)) {
                        float f10 = sn0Var6.A;
                        int ceil = (int) Math.ceil(wqVar.f30137m);
                        if (tn0Var.f28565a.f49375u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        sn0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + tn0Var.f28565a.G.d + f10);
                    }
                    if (z10) {
                        sn0 sn0Var7 = tn0Var.f28565a;
                        sn0Var7.f49359f = sn0Var7.A;
                    }
                    tn0Var.f28565a.B = AndroidUtilities.dp(28.0f);
                    sn0 sn0Var8 = tn0Var.f28565a;
                    sn0Var8.f49370p = tn0Var.e;
                    if (tn0Var.f28570r) {
                        sn0Var8.a();
                    }
                    if (!z10) {
                        tn0Var.requestLayout();
                    }
                    tn0 tn0Var2 = (tn0) view;
                    if (rn0Var.f28003a.h != un0Var.h) {
                        z11 = false;
                    }
                    tn0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                zh0 zh0Var = (zh0) this.d;
                ((yh0) c1Var.f42946a).a((TLObject) zh0Var.f40479c.get(i10), false, ((Integer) zh0Var.f40478b.get(i10)).intValue());
                return;
            case 4:
                ((xi1) c1Var.f42946a).f39920a = WallpapersListActivity.m0[i10];
                return;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).f42567a == 1) {
                    rg.i iVar = (rg.i) c1Var.f42946a;
                    iVar.f42574c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f42574c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).f42568b));
                    iVar.f42572a.setText(((rg.h) arrayList2.get(i10)).f42569c);
                    iVar.f42573b.setText(((rg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((x3) this.d).P0;
                ta taVar = (ta) c1Var.f42946a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (taVar.f28456a != i11) {
                    taVar.f28456a = i11;
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
                p0 p0Var = new p0(viewGroup.getContext(), ((s0) this.d).f30094p2);
                ?? c1Var = new s4.c1(p0Var);
                c1Var.v = p0Var;
                p0Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(30.0f)));
                return c1Var;
            case 1:
                return new s4.c1(((ua) this.d).X);
            case 2:
                un0 un0Var = (un0) this.d;
                return new s4.c1(new tn0(un0Var, un0Var.getContext()));
            case 3:
                yh0 yh0Var = new yh0(viewGroup.getContext());
                yh0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.c1(yh0Var);
            case 4:
                bj1 bj1Var = (bj1) this.d;
                return new s4.c1(new xi1(bj1Var.E, bj1Var.f32423c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                d6 d6Var = jVar.f42522a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f42574c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, y5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f42572a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    ok.n(h6.G6, d6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, y5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f42573b = textView2;
                    ok.n(h6.f19428y6, d6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, y5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ?? view2 = new View(((x3) this.d).getContext());
                view2.f28456a = 0;
                return new s4.c1(view2);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        boolean z10;
        switch (this.f9848c) {
            case 2:
                un0 un0Var = (un0) this.d;
                ArrayList arrayList = un0Var.f28833r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    tn0 tn0Var = (tn0) c1Var.f42946a;
                    if (((rn0) arrayList.get(b10)).f28003a.h == un0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tn0Var.a(z10, false);
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
