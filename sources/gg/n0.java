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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vq;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ei0;
import org.telegram.ui.ej1;
import org.telegram.ui.fi0;
import org.telegram.ui.ij1;
import w7.x5;
import yh.a4;
public final class n0 extends kl0 {
    public final int f9862c;
    public final Object d;

    public n0(Object obj, int i10) {
        this.f9862c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f9862c) {
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
        int[] iArr = ((a4) this.d).P0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f9862c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((s0) obj).X2.size();
            case 1:
                return 1;
            case 2:
                return ((in0) obj).f25088r.size();
            case 3:
                return ((fi0) obj).f33584c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f31618j0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((a4) obj).P0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f9862c) {
            case 1:
                return i10;
            case 5:
                return ((rg.h) ((rg.j) this.d).d.get(i10)).f42297a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        vq vqVar;
        float f7;
        switch (this.f9862c) {
            case 0:
                ((r0) c1Var).v.setData((q0) ((s0) this.d).X2.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = c1Var.f42675a;
                in0 in0Var = (in0) this.d;
                ArrayList arrayList = in0Var.f25088r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    fn0 fn0Var = (fn0) arrayList.get(i10);
                    hn0 hn0Var = (hn0) view;
                    zg.p0 p0Var = hn0Var.d;
                    boolean z11 = true;
                    if (p0Var != null && p0Var.equals(fn0Var.f24022a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = fn0Var.f24022a.g();
                        tL_reactionCount.count = fn0Var.f24023b;
                        in0 in0Var2 = hn0Var.f24731s;
                        gn0 gn0Var = new gn0(hn0Var, in0Var2.f25083a, hn0Var, tL_reactionCount, in0Var2.f25085c);
                        hn0Var.f24725a = gn0Var;
                        gn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        gn0 gn0Var2 = hn0Var.f24725a;
                        gn0Var2.f49112q = true;
                        gn0Var2.S = true;
                    } else {
                        hn0Var.f24725a.f49117w = fn0Var.f24023b;
                    }
                    hn0Var.d = fn0Var.f24022a;
                    if (!z10) {
                        gn0 gn0Var3 = hn0Var.f24725a;
                        gn0Var3.f49100f = gn0Var3.A;
                    }
                    hn0Var.f24725a.A = AndroidUtilities.dp(44.33f);
                    hn0Var.f24725a.f49116u = !TextUtils.isEmpty(fn0Var.f24024c);
                    gn0 gn0Var4 = hn0Var.f24725a;
                    boolean z12 = gn0Var4.f49116u;
                    m6 m6Var = gn0Var4.G;
                    if (z12) {
                        m6Var.q(Emoji.replaceEmoji(fn0Var.f24024c, m6Var.f26085a.getFontMetricsInt(), false), !z10, true);
                    } else if (m6Var != null) {
                        m6Var.q("", !z10, true);
                    }
                    gn0 gn0Var5 = hn0Var.f24725a;
                    Integer.toString(fn0Var.f24023b);
                    gn0Var5.getClass();
                    hn0Var.f24725a.F.c(fn0Var.f24023b, !z10);
                    gn0 gn0Var6 = hn0Var.f24725a;
                    if (gn0Var6.F != null && (gn0Var6.f49117w > 0 || gn0Var6.f49116u)) {
                        float f10 = gn0Var6.A;
                        int ceil = (int) Math.ceil(vqVar.f29402m);
                        if (hn0Var.f24725a.f49116u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        gn0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + hn0Var.f24725a.G.d + f10);
                    }
                    if (z10) {
                        gn0 gn0Var7 = hn0Var.f24725a;
                        gn0Var7.f49100f = gn0Var7.A;
                    }
                    hn0Var.f24725a.B = AndroidUtilities.dp(28.0f);
                    gn0 gn0Var8 = hn0Var.f24725a;
                    gn0Var8.f49111p = hn0Var.e;
                    if (hn0Var.f24730r) {
                        gn0Var8.a();
                    }
                    if (!z10) {
                        hn0Var.requestLayout();
                    }
                    hn0 hn0Var2 = (hn0) view;
                    if (fn0Var.f24022a.h != in0Var.h) {
                        z11 = false;
                    }
                    hn0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                fi0 fi0Var = (fi0) this.d;
                ((ei0) c1Var.f42675a).a((TLObject) fi0Var.f33584c.get(i10), false, ((Integer) fi0Var.f33583b.get(i10)).intValue());
                return;
            case 4:
                ((ej1) c1Var.f42675a).f33360a = WallpapersListActivity.f31620l0[i10];
                return;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).f42297a == 1) {
                    rg.i iVar = (rg.i) c1Var.f42675a;
                    iVar.f42304c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f42304c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).f42298b));
                    iVar.f42302a.setText(((rg.h) arrayList2.get(i10)).f42299c);
                    iVar.f42303b.setText(((rg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((a4) this.d).P0;
                ra raVar = (ra) c1Var.f42675a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (raVar.f27616a != i11) {
                    raVar.f27616a = i11;
                    raVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f9862c) {
            case 0:
                p0 p0Var = new p0(viewGroup.getContext(), ((s0) this.d).f25966p2);
                ?? c1Var = new s4.c1(p0Var);
                c1Var.v = p0Var;
                p0Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(30.0f)));
                return c1Var;
            case 1:
                return new s4.c1(((sa) this.d).X);
            case 2:
                in0 in0Var = (in0) this.d;
                return new s4.c1(new hn0(in0Var, in0Var.getContext()));
            case 3:
                ei0 ei0Var = new ei0(viewGroup.getContext());
                ei0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.c1(ei0Var);
            case 4:
                ij1 ij1Var = (ij1) this.d;
                return new s4.c1(new ej1(ij1Var.E, ij1Var.f34692c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                e6 e6Var = jVar.f42252a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new s3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f42304c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, x5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f42302a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    wl.n(i6.G6, e6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, x5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f42303b = textView2;
                    wl.n(i6.f19218y6, e6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, x5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ?? view2 = new View(((a4) this.d).getContext());
                view2.f27616a = 0;
                return new s4.c1(view2);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        boolean z10;
        switch (this.f9862c) {
            case 2:
                in0 in0Var = (in0) this.d;
                ArrayList arrayList = in0Var.f25088r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    hn0 hn0Var = (hn0) c1Var.f42675a;
                    if (((fn0) arrayList.get(b10)).f24022a.h == in0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hn0Var.a(z10, false);
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
