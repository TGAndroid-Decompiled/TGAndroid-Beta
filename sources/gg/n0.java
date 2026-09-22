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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vq;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ei0;
import org.telegram.ui.fi0;
import org.telegram.ui.fj1;
import org.telegram.ui.jj1;
import w7.x5;
import yh.z3;
public final class n0 extends kl0 {
    public final int f9863c;
    public final Object d;

    public n0(Object obj, int i10) {
        this.f9863c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f9863c) {
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
        int[] iArr = ((z3) this.d).P0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f9863c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((s0) obj).X2.size();
            case 1:
                return 1;
            case 2:
                return ((hn0) obj).f24733r.size();
            case 3:
                return ((fi0) obj).f33607c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f31615k0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((z3) obj).P0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f9863c) {
            case 1:
                return i10;
            case 5:
                return ((rg.h) ((rg.j) this.d).d.get(i10)).f42293a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        vq vqVar;
        float f7;
        switch (this.f9863c) {
            case 0:
                ((r0) c1Var).v.setData((q0) ((s0) this.d).X2.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = c1Var.f42671a;
                hn0 hn0Var = (hn0) this.d;
                ArrayList arrayList = hn0Var.f24733r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    en0 en0Var = (en0) arrayList.get(i10);
                    gn0 gn0Var = (gn0) view;
                    zg.p0 p0Var = gn0Var.d;
                    boolean z11 = true;
                    if (p0Var != null && p0Var.equals(en0Var.f23695a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = en0Var.f23695a.g();
                        tL_reactionCount.count = en0Var.f23696b;
                        hn0 hn0Var2 = gn0Var.f24427s;
                        fn0 fn0Var = new fn0(gn0Var, hn0Var2.f24728a, gn0Var, tL_reactionCount, hn0Var2.f24730c);
                        gn0Var.f24421a = fn0Var;
                        fn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        fn0 fn0Var2 = gn0Var.f24421a;
                        fn0Var2.f49105q = true;
                        fn0Var2.S = true;
                    } else {
                        gn0Var.f24421a.f49110w = en0Var.f23696b;
                    }
                    gn0Var.d = en0Var.f23695a;
                    if (!z10) {
                        fn0 fn0Var3 = gn0Var.f24421a;
                        fn0Var3.f49093f = fn0Var3.A;
                    }
                    gn0Var.f24421a.A = AndroidUtilities.dp(44.33f);
                    gn0Var.f24421a.f49109u = !TextUtils.isEmpty(en0Var.f23697c);
                    fn0 fn0Var4 = gn0Var.f24421a;
                    boolean z12 = fn0Var4.f49109u;
                    m6 m6Var = fn0Var4.G;
                    if (z12) {
                        m6Var.q(Emoji.replaceEmoji(en0Var.f23697c, m6Var.f26084a.getFontMetricsInt(), false), !z10, true);
                    } else if (m6Var != null) {
                        m6Var.q("", !z10, true);
                    }
                    fn0 fn0Var5 = gn0Var.f24421a;
                    Integer.toString(en0Var.f23696b);
                    fn0Var5.getClass();
                    gn0Var.f24421a.F.c(en0Var.f23696b, !z10);
                    fn0 fn0Var6 = gn0Var.f24421a;
                    if (fn0Var6.F != null && (fn0Var6.f49110w > 0 || fn0Var6.f49109u)) {
                        float f10 = fn0Var6.A;
                        int ceil = (int) Math.ceil(vqVar.f29399m);
                        if (gn0Var.f24421a.f49109u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        fn0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + gn0Var.f24421a.G.d + f10);
                    }
                    if (z10) {
                        fn0 fn0Var7 = gn0Var.f24421a;
                        fn0Var7.f49093f = fn0Var7.A;
                    }
                    gn0Var.f24421a.B = AndroidUtilities.dp(28.0f);
                    fn0 fn0Var8 = gn0Var.f24421a;
                    fn0Var8.f49104p = gn0Var.e;
                    if (gn0Var.f24426r) {
                        fn0Var8.a();
                    }
                    if (!z10) {
                        gn0Var.requestLayout();
                    }
                    gn0 gn0Var2 = (gn0) view;
                    if (en0Var.f23695a.h != hn0Var.h) {
                        z11 = false;
                    }
                    gn0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                fi0 fi0Var = (fi0) this.d;
                ((ei0) c1Var.f42671a).a((TLObject) fi0Var.f33607c.get(i10), false, ((Integer) fi0Var.f33606b.get(i10)).intValue());
                return;
            case 4:
                ((fj1) c1Var.f42671a).f33616a = WallpapersListActivity.m0[i10];
                return;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).f42293a == 1) {
                    rg.i iVar = (rg.i) c1Var.f42671a;
                    iVar.f42300c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f42300c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).f42294b));
                    iVar.f42298a.setText(((rg.h) arrayList2.get(i10)).f42295c);
                    iVar.f42299b.setText(((rg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((z3) this.d).P0;
                ra raVar = (ra) c1Var.f42671a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (raVar.f27613a != i11) {
                    raVar.f27613a = i11;
                    raVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f9863c) {
            case 0:
                p0 p0Var = new p0(viewGroup.getContext(), ((s0) this.d).f25969p2);
                ?? c1Var = new s4.c1(p0Var);
                c1Var.v = p0Var;
                p0Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(30.0f)));
                return c1Var;
            case 1:
                return new s4.c1(((sa) this.d).X);
            case 2:
                hn0 hn0Var = (hn0) this.d;
                return new s4.c1(new gn0(hn0Var, hn0Var.getContext()));
            case 3:
                ei0 ei0Var = new ei0(viewGroup.getContext());
                ei0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.c1(ei0Var);
            case 4:
                jj1 jj1Var = (jj1) this.d;
                return new s4.c1(new fj1(jj1Var.E, jj1Var.f34937c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                e6 e6Var = jVar.f42248a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f42300c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, x5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f42298a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    vl.o(i6.G6, e6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, x5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f42299b = textView2;
                    vl.o(i6.f19215y6, e6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, x5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ?? view2 = new View(((z3) this.d).getContext());
                view2.f27613a = 0;
                return new s4.c1(view2);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        boolean z10;
        switch (this.f9863c) {
            case 2:
                hn0 hn0Var = (hn0) this.d;
                ArrayList arrayList = hn0Var.f24733r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    gn0 gn0Var = (gn0) c1Var.f42671a;
                    if (((en0) arrayList.get(b10)).f23695a.h == hn0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gn0Var.a(z10, false);
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
