package cg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import jh.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ra;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ci1;
import org.telegram.ui.nh0;
import org.telegram.ui.oh0;
import org.telegram.ui.th;
import org.telegram.ui.yh1;
public final class g extends il0 {
    public final int f3147c;
    public final Object d;

    public g(Object obj, int i10) {
        this.f3147c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        switch (this.f3147c) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            default:
                return true;
        }
    }

    public void F(int i10, int i11) {
        int[] iArr = ((h5) this.d).L0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f3147c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((m) obj).d.size();
            case 1:
                return ((h5) obj).L0.length;
            case 2:
                return 1;
            case 3:
                return ((en0) obj).f28122r.size();
            case 4:
                return ((oh0) obj).f41129c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.f36361g0;
                return 12;
            default:
                return ((rf.h0) obj).T2.size();
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f3147c) {
            case 0:
                return ((k) ((m) this.d).d.get(i10)).f3177a;
            case 1:
            default:
                return super.j(i10);
            case 2:
                return i10;
        }
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        pq pqVar;
        float f9;
        switch (this.f3147c) {
            case 0:
                m mVar = (m) this.d;
                ArrayList arrayList = mVar.d;
                if (((k) arrayList.get(i10)).f3177a == 1) {
                    l lVar = (l) n1Var.f6432a;
                    lVar.f3195c.setColorFilter(new PorterDuffColorFilter(mVar.f3211e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    lVar.f3195c.setImageDrawable(mVar.getContext().getDrawable(((k) arrayList.get(i10)).f3178b));
                    lVar.f3193a.setText(((k) arrayList.get(i10)).f3179c);
                    lVar.f3194b.setText(((k) arrayList.get(i10)).d);
                    return;
                }
                return;
            case 1:
                int[] iArr = ((h5) this.d).L0;
                qa qaVar = (qa) n1Var.f6432a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (qaVar.f31874a != i11) {
                    qaVar.f31874a = i11;
                    qaVar.requestLayout();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                View view = n1Var.f6432a;
                en0 en0Var = (en0) this.d;
                ArrayList arrayList2 = en0Var.f28122r;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    bn0 bn0Var = (bn0) arrayList2.get(i10);
                    dn0 dn0Var = (dn0) view;
                    kg.q0 q0Var = dn0Var.d;
                    boolean z11 = true;
                    if (q0Var != null && q0Var.equals(bn0Var.f27188a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = bn0Var.f27188a.g();
                        tL_reactionCount.count = bn0Var.f27189b;
                        en0 en0Var2 = dn0Var.f27821s;
                        cn0 cn0Var = new cn0(dn0Var, en0Var2.f28116a, dn0Var, tL_reactionCount, en0Var2.f28118c);
                        dn0Var.f27814a = cn0Var;
                        cn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        cn0 cn0Var2 = dn0Var.f27814a;
                        cn0Var2.f13811q = true;
                        cn0Var2.S = true;
                    } else {
                        dn0Var.f27814a.f13816w = bn0Var.f27189b;
                    }
                    dn0Var.d = bn0Var.f27188a;
                    if (!z10) {
                        cn0 cn0Var3 = dn0Var.f27814a;
                        cn0Var3.f13799f = cn0Var3.A;
                    }
                    dn0Var.f27814a.A = AndroidUtilities.dp(44.33f);
                    dn0Var.f27814a.f13815u = !TextUtils.isEmpty(bn0Var.f27190c);
                    cn0 cn0Var4 = dn0Var.f27814a;
                    boolean z12 = cn0Var4.f13815u;
                    n6 n6Var = cn0Var4.G;
                    if (z12) {
                        n6Var.q(Emoji.replaceEmoji(bn0Var.f27190c, n6Var.f30861a.getFontMetricsInt(), false), !z10, true);
                    } else if (n6Var != null) {
                        n6Var.q("", !z10, true);
                    }
                    cn0 cn0Var5 = dn0Var.f27814a;
                    Integer.toString(bn0Var.f27189b);
                    cn0Var5.getClass();
                    dn0Var.f27814a.F.c(bn0Var.f27189b, !z10);
                    cn0 cn0Var6 = dn0Var.f27814a;
                    if (cn0Var6.F != null && (cn0Var6.f13816w > 0 || cn0Var6.f13815u)) {
                        float f10 = cn0Var6.A;
                        int ceil = (int) Math.ceil(pqVar.f31741m);
                        if (dn0Var.f27814a.f13815u) {
                            f9 = 4.0f;
                        } else {
                            f9 = 0.0f;
                        }
                        cn0Var6.A = (int) (AndroidUtilities.dp(f9) + ceil + dn0Var.f27814a.G.d + f10);
                    }
                    if (z10) {
                        cn0 cn0Var7 = dn0Var.f27814a;
                        cn0Var7.f13799f = cn0Var7.A;
                    }
                    dn0Var.f27814a.B = AndroidUtilities.dp(28.0f);
                    cn0 cn0Var8 = dn0Var.f27814a;
                    cn0Var8.f13810p = dn0Var.f27817e;
                    if (dn0Var.f27820r) {
                        cn0Var8.a();
                    }
                    if (!z10) {
                        dn0Var.requestLayout();
                    }
                    dn0 dn0Var2 = (dn0) view;
                    if (bn0Var.f27188a.h != en0Var.h) {
                        z11 = false;
                    }
                    dn0Var2.a(z11, false);
                    return;
                }
                return;
            case 4:
                oh0 oh0Var = (oh0) this.d;
                ((nh0) n1Var.f6432a).a((TLObject) oh0Var.f41129c.get(i10), false, ((Integer) oh0Var.f41128b.get(i10)).intValue());
                return;
            case 5:
                ((yh1) n1Var.f6432a).f44893a = WallpapersListActivity.f36363i0[i10];
                return;
            default:
                ((rf.g0) n1Var).v.setData((rf.f0) ((rf.h0) this.d).T2.get(i10));
                return;
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f3147c) {
            case 0:
                m mVar = (m) this.d;
                c6 c6Var = mVar.f3069a;
                if (i10 == 0) {
                    view = new j(mVar, mVar.getContext());
                } else if (i10 == 2) {
                    view = new q3(mVar.getContext(), 16);
                } else {
                    Context context = mVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f3195c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, f6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f3193a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    org.telegram.ui.b.m(g6.G6, c6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, f6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f3194b = textView2;
                    org.telegram.ui.b.m(g6.f23433y6, c6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, f6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return th.m(view, view, -1, -2);
            case 1:
                ?? view2 = new View(((h5) this.d).getContext());
                view2.f31874a = 0;
                return new f2.n1(view2);
            case 2:
                return new f2.n1(((ra) this.d).T);
            case 3:
                en0 en0Var = (en0) this.d;
                return new f2.n1(new dn0(en0Var, en0Var.getContext()));
            case 4:
                nh0 nh0Var = new nh0(viewGroup.getContext());
                nh0Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(50.0f)));
                return new f2.n1(nh0Var);
            case 5:
                ci1 ci1Var = (ci1) this.d;
                return new f2.n1(new yh1(ci1Var.A, ci1Var.f37143c));
            default:
                rf.e0 e0Var = new rf.e0(viewGroup.getContext(), ((rf.h0) this.d).f29709l2);
                ?? n1Var = new f2.n1(e0Var);
                n1Var.v = e0Var;
                e0Var.setLayoutParams(new f2.x0(-2, AndroidUtilities.dp(30.0f)));
                return n1Var;
        }
    }

    @Override
    public void y(f2.n1 n1Var) {
        boolean z10;
        switch (this.f3147c) {
            case 3:
                en0 en0Var = (en0) this.d;
                ArrayList arrayList = en0Var.f28122r;
                int b10 = n1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    dn0 dn0Var = (dn0) n1Var.f6432a;
                    if (((bn0) arrayList.get(b10)).f27188a.h == en0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dn0Var.a(z10, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(f2.n1 n1Var, int i10) {
    }
}
