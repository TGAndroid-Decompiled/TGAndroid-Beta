package fg;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.qn0;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.fi0;
import org.telegram.ui.gi0;
import org.telegram.ui.jj1;
import org.telegram.ui.nj1;
import w7.a6;
import xh.x3;
public final class n0 extends ul0 {
    public final int f8151c;
    public final Object d;

    public n0(Object obj, int i10) {
        this.f8151c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f8151c) {
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
        int i10 = this.f8151c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((s0) obj).X2.size();
            case 1:
                return 1;
            case 2:
                return ((rn0) obj).f26702r.size();
            case 3:
                return ((gi0) obj).f33110c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f30730k0;
                return 12;
            case 5:
                return ((qg.j) obj).d.size();
            default:
                return ((x3) obj).P0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f8151c) {
            case 1:
                return i10;
            case 5:
                return ((qg.h) ((qg.j) this.d).d.get(i10)).f40744a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        br brVar;
        float f7;
        switch (this.f8151c) {
            case 0:
                ((r0) c1Var).v.setData((q0) ((s0) this.d).X2.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = c1Var.f41610a;
                rn0 rn0Var = (rn0) this.d;
                ArrayList arrayList = rn0Var.f26702r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    on0 on0Var = (on0) arrayList.get(i10);
                    qn0 qn0Var = (qn0) view;
                    yg.p0 p0Var = qn0Var.d;
                    boolean z11 = true;
                    if (p0Var != null && p0Var.equals(on0Var.f25845a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = on0Var.f25845a.g();
                        tL_reactionCount.count = on0Var.f25846b;
                        rn0 rn0Var2 = qn0Var.f26456s;
                        pn0 pn0Var = new pn0(qn0Var, rn0Var2.f26697a, qn0Var, tL_reactionCount, rn0Var2.f26699c);
                        qn0Var.f26450a = pn0Var;
                        pn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        pn0 pn0Var2 = qn0Var.f26450a;
                        pn0Var2.f47087q = true;
                        pn0Var2.S = true;
                    } else {
                        qn0Var.f26450a.f47092w = on0Var.f25846b;
                    }
                    qn0Var.d = on0Var.f25845a;
                    if (!z10) {
                        pn0 pn0Var3 = qn0Var.f26450a;
                        pn0Var3.f47075f = pn0Var3.A;
                    }
                    qn0Var.f26450a.A = AndroidUtilities.dp(44.33f);
                    qn0Var.f26450a.f47091u = !TextUtils.isEmpty(on0Var.f25847c);
                    pn0 pn0Var4 = qn0Var.f26450a;
                    boolean z12 = pn0Var4.f47091u;
                    n6 n6Var = pn0Var4.G;
                    if (z12) {
                        n6Var.q(Emoji.replaceEmoji(on0Var.f25847c, n6Var.f25424a.getFontMetricsInt(), false), !z10, true);
                    } else if (n6Var != null) {
                        n6Var.q("", !z10, true);
                    }
                    pn0 pn0Var5 = qn0Var.f26450a;
                    Integer.toString(on0Var.f25846b);
                    pn0Var5.getClass();
                    qn0Var.f26450a.F.c(on0Var.f25846b, !z10);
                    pn0 pn0Var6 = qn0Var.f26450a;
                    if (pn0Var6.F != null && (pn0Var6.f47092w > 0 || pn0Var6.f47091u)) {
                        float f10 = pn0Var6.A;
                        int ceil = (int) Math.ceil(brVar.f21878m);
                        if (qn0Var.f26450a.f47091u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        pn0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + qn0Var.f26450a.G.d + f10);
                    }
                    if (z10) {
                        pn0 pn0Var7 = qn0Var.f26450a;
                        pn0Var7.f47075f = pn0Var7.A;
                    }
                    qn0Var.f26450a.B = AndroidUtilities.dp(28.0f);
                    pn0 pn0Var8 = qn0Var.f26450a;
                    pn0Var8.f47086p = qn0Var.e;
                    if (qn0Var.f26455r) {
                        pn0Var8.a();
                    }
                    if (!z10) {
                        qn0Var.requestLayout();
                    }
                    qn0 qn0Var2 = (qn0) view;
                    if (on0Var.f25845a.h != rn0Var.h) {
                        z11 = false;
                    }
                    qn0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                gi0 gi0Var = (gi0) this.d;
                ((fi0) c1Var.f41610a).a((TLObject) gi0Var.f33110c.get(i10), false, ((Integer) gi0Var.f33109b.get(i10)).intValue());
                return;
            case 4:
                ((jj1) c1Var.f41610a).f34126a = WallpapersListActivity.m0[i10];
                return;
            case 5:
                qg.j jVar = (qg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((qg.h) arrayList2.get(i10)).f40744a == 1) {
                    qg.i iVar = (qg.i) c1Var.f41610a;
                    iVar.f40752c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f40752c.setImageDrawable(jVar.getContext().getDrawable(((qg.h) arrayList2.get(i10)).f40745b));
                    iVar.f40750a.setText(((qg.h) arrayList2.get(i10)).f40746c);
                    iVar.f40751b.setText(((qg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((x3) this.d).P0;
                sa saVar = (sa) c1Var.f41610a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (saVar.f26992a != i11) {
                    saVar.f26992a = i11;
                    saVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f8151c) {
            case 0:
                p0 p0Var = new p0(viewGroup.getContext(), ((s0) this.d).f27987p2);
                ?? c1Var = new s4.c1(p0Var);
                c1Var.v = p0Var;
                p0Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(30.0f)));
                return c1Var;
            case 1:
                return new s4.c1(((ta) this.d).X);
            case 2:
                rn0 rn0Var = (rn0) this.d;
                return new s4.c1(new qn0(rn0Var, rn0Var.getContext()));
            case 3:
                fi0 fi0Var = new fi0(viewGroup.getContext());
                fi0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.c1(fi0Var);
            case 4:
                nj1 nj1Var = (nj1) this.d;
                return new s4.c1(new jj1(nj1Var.E, nj1Var.f35293c));
            case 5:
                qg.j jVar = (qg.j) this.d;
                f6 f6Var = jVar.f40679a;
                if (i10 == 0) {
                    view = new qg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new s3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f40752c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, a6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f40750a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    em.n(j6.G6, f6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, a6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f40751b = textView2;
                    em.n(j6.f18306y6, f6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, a6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
            default:
                ?? view2 = new View(((x3) this.d).getContext());
                view2.f26992a = 0;
                return new s4.c1(view2);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        boolean z10;
        switch (this.f8151c) {
            case 2:
                rn0 rn0Var = (rn0) this.d;
                ArrayList arrayList = rn0Var.f26702r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    qn0 qn0Var = (qn0) c1Var.f41610a;
                    if (((on0) arrayList.get(b10)).f25845a.h == rn0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qn0Var.a(z10, false);
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
