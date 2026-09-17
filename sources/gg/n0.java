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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vq;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ej1;
import org.telegram.ui.gi0;
import org.telegram.ui.hi0;
import org.telegram.ui.ij1;
import w7.x5;
import yh.a4;
public final class n0 extends ll0 {
    public final int f9867c;
    public final Object d;

    public n0(Object obj, int i10) {
        this.f9867c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f9867c) {
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
        int i10 = this.f9867c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((s0) obj).X2.size();
            case 1:
                return 1;
            case 2:
                return ((jn0) obj).f25360r.size();
            case 3:
                return ((hi0) obj).f34279c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f31631i0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((a4) obj).P0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f9867c) {
            case 1:
                return i10;
            case 5:
                return ((rg.h) ((rg.j) this.d).d.get(i10)).f42319a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        vq vqVar;
        float f7;
        switch (this.f9867c) {
            case 0:
                ((r0) c1Var).v.setData((q0) ((s0) this.d).X2.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = c1Var.f42697a;
                jn0 jn0Var = (jn0) this.d;
                ArrayList arrayList = jn0Var.f25360r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    gn0 gn0Var = (gn0) arrayList.get(i10);
                    in0 in0Var = (in0) view;
                    zg.p0 p0Var = in0Var.d;
                    boolean z11 = true;
                    if (p0Var != null && p0Var.equals(gn0Var.f24349a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = gn0Var.f24349a.g();
                        tL_reactionCount.count = gn0Var.f24350b;
                        jn0 jn0Var2 = in0Var.f24970s;
                        hn0 hn0Var = new hn0(in0Var, jn0Var2.f25355a, in0Var, tL_reactionCount, jn0Var2.f25357c);
                        in0Var.f24964a = hn0Var;
                        hn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        hn0 hn0Var2 = in0Var.f24964a;
                        hn0Var2.f49135q = true;
                        hn0Var2.S = true;
                    } else {
                        in0Var.f24964a.f49140w = gn0Var.f24350b;
                    }
                    in0Var.d = gn0Var.f24349a;
                    if (!z10) {
                        hn0 hn0Var3 = in0Var.f24964a;
                        hn0Var3.f49123f = hn0Var3.A;
                    }
                    in0Var.f24964a.A = AndroidUtilities.dp(44.33f);
                    in0Var.f24964a.f49139u = !TextUtils.isEmpty(gn0Var.f24351c);
                    hn0 hn0Var4 = in0Var.f24964a;
                    boolean z12 = hn0Var4.f49139u;
                    m6 m6Var = hn0Var4.G;
                    if (z12) {
                        m6Var.q(Emoji.replaceEmoji(gn0Var.f24351c, m6Var.f26066a.getFontMetricsInt(), false), !z10, true);
                    } else if (m6Var != null) {
                        m6Var.q("", !z10, true);
                    }
                    hn0 hn0Var5 = in0Var.f24964a;
                    Integer.toString(gn0Var.f24350b);
                    hn0Var5.getClass();
                    in0Var.f24964a.F.c(gn0Var.f24350b, !z10);
                    hn0 hn0Var6 = in0Var.f24964a;
                    if (hn0Var6.F != null && (hn0Var6.f49140w > 0 || hn0Var6.f49139u)) {
                        float f10 = hn0Var6.A;
                        int ceil = (int) Math.ceil(vqVar.f29377m);
                        if (in0Var.f24964a.f49139u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        hn0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + in0Var.f24964a.G.d + f10);
                    }
                    if (z10) {
                        hn0 hn0Var7 = in0Var.f24964a;
                        hn0Var7.f49123f = hn0Var7.A;
                    }
                    in0Var.f24964a.B = AndroidUtilities.dp(28.0f);
                    hn0 hn0Var8 = in0Var.f24964a;
                    hn0Var8.f49134p = in0Var.e;
                    if (in0Var.f24969r) {
                        hn0Var8.a();
                    }
                    if (!z10) {
                        in0Var.requestLayout();
                    }
                    in0 in0Var2 = (in0) view;
                    if (gn0Var.f24349a.h != jn0Var.h) {
                        z11 = false;
                    }
                    in0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                hi0 hi0Var = (hi0) this.d;
                ((gi0) c1Var.f42697a).a((TLObject) hi0Var.f34279c.get(i10), false, ((Integer) hi0Var.f34278b.get(i10)).intValue());
                return;
            case 4:
                ((ej1) c1Var.f42697a).f33419a = WallpapersListActivity.f31633k0[i10];
                return;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).f42319a == 1) {
                    rg.i iVar = (rg.i) c1Var.f42697a;
                    iVar.f42326c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f42326c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).f42320b));
                    iVar.f42324a.setText(((rg.h) arrayList2.get(i10)).f42321c);
                    iVar.f42325b.setText(((rg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((a4) this.d).P0;
                ra raVar = (ra) c1Var.f42697a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (raVar.f27589a != i11) {
                    raVar.f27589a = i11;
                    raVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f9867c) {
            case 0:
                p0 p0Var = new p0(viewGroup.getContext(), ((s0) this.d).f26191p2);
                ?? c1Var = new s4.c1(p0Var);
                c1Var.v = p0Var;
                p0Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(30.0f)));
                return c1Var;
            case 1:
                return new s4.c1(((sa) this.d).X);
            case 2:
                jn0 jn0Var = (jn0) this.d;
                return new s4.c1(new in0(jn0Var, jn0Var.getContext()));
            case 3:
                gi0 gi0Var = new gi0(viewGroup.getContext());
                gi0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.c1(gi0Var);
            case 4:
                ij1 ij1Var = (ij1) this.d;
                return new s4.c1(new ej1(ij1Var.E, ij1Var.f34606c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                f6 f6Var = jVar.f42274a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new s3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f42326c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, x5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f42324a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    wl.n(j6.G6, f6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, x5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f42325b = textView2;
                    wl.n(j6.f19244y6, f6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, x5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ?? view2 = new View(((a4) this.d).getContext());
                view2.f27589a = 0;
                return new s4.c1(view2);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        boolean z10;
        switch (this.f9867c) {
            case 2:
                jn0 jn0Var = (jn0) this.d;
                ArrayList arrayList = jn0Var.f25360r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    in0 in0Var = (in0) c1Var.f42697a;
                    if (((gn0) arrayList.get(b10)).f24349a.h == jn0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    in0Var.a(z10, false);
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
