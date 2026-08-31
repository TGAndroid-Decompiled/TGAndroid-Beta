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
import k7.c6;
import mh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.oi1;
import org.telegram.ui.si1;
import org.telegram.ui.wh0;
import org.telegram.ui.xh0;
import org.telegram.ui.yh;
public final class g extends sl0 {
    public final int f6317c;
    public final Object d;

    public g(Object obj, int i10) {
        this.f6317c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        switch (this.f6317c) {
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
        int[] iArr = ((g5) this.d).M0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f6317c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((m) obj).d.size();
            case 1:
                return ((g5) obj).M0.length;
            case 2:
                return 1;
            case 3:
                return ((pn0) obj).f30134r.size();
            case 4:
                return ((xh0) obj).f43069c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.f34941h0;
                return 12;
            default:
                return ((uf.g0) obj).U2.size();
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f6317c) {
            case 0:
                return ((k) ((m) this.d).d.get(i10)).f6366a;
            case 1:
            default:
                return super.j(i10);
            case 2:
                return i10;
        }
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        vq vqVar;
        float f10;
        switch (this.f6317c) {
            case 0:
                m mVar = (m) this.d;
                ArrayList arrayList = mVar.d;
                if (((k) arrayList.get(i10)).f6366a == 1) {
                    l lVar = (l) m1Var.f5875a;
                    lVar.f6376c.setColorFilter(new PorterDuffColorFilter(mVar.f6387e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    lVar.f6376c.setImageDrawable(mVar.getContext().getDrawable(((k) arrayList.get(i10)).f6367b));
                    lVar.f6374a.setText(((k) arrayList.get(i10)).f6368c);
                    lVar.f6375b.setText(((k) arrayList.get(i10)).d);
                    return;
                }
                return;
            case 1:
                int[] iArr = ((g5) this.d).M0;
                la laVar = (la) m1Var.f5875a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (laVar.f28680a != i11) {
                    laVar.f28680a = i11;
                    laVar.requestLayout();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                View view = m1Var.f5875a;
                pn0 pn0Var = (pn0) this.d;
                ArrayList arrayList2 = pn0Var.f30134r;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    mn0 mn0Var = (mn0) arrayList2.get(i10);
                    on0 on0Var = (on0) view;
                    ng.q0 q0Var = on0Var.d;
                    boolean z10 = true;
                    if (q0Var != null && q0Var.equals(mn0Var.f29156a)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = mn0Var.f29156a.g();
                        tL_reactionCount.count = mn0Var.f29157b;
                        pn0 pn0Var2 = on0Var.f29828s;
                        nn0 nn0Var = new nn0(on0Var, pn0Var2.f30128a, on0Var, tL_reactionCount, pn0Var2.f30130c);
                        on0Var.f29821a = nn0Var;
                        nn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        nn0 nn0Var2 = on0Var.f29821a;
                        nn0Var2.f16163q = true;
                        nn0Var2.S = true;
                    } else {
                        on0Var.f29821a.f16168w = mn0Var.f29157b;
                    }
                    on0Var.d = mn0Var.f29156a;
                    if (!z4) {
                        nn0 nn0Var3 = on0Var.f29821a;
                        nn0Var3.f16151f = nn0Var3.A;
                    }
                    on0Var.f29821a.A = AndroidUtilities.dp(44.33f);
                    on0Var.f29821a.f16167u = !TextUtils.isEmpty(mn0Var.f29158c);
                    nn0 nn0Var4 = on0Var.f29821a;
                    boolean z11 = nn0Var4.f16167u;
                    j6 j6Var = nn0Var4.G;
                    if (z11) {
                        j6Var.q(Emoji.replaceEmoji(mn0Var.f29158c, j6Var.f28028a.getFontMetricsInt(), false), !z4, true);
                    } else if (j6Var != null) {
                        j6Var.q("", !z4, true);
                    }
                    nn0 nn0Var5 = on0Var.f29821a;
                    Integer.toString(mn0Var.f29157b);
                    nn0Var5.getClass();
                    on0Var.f29821a.F.c(mn0Var.f29157b, !z4);
                    nn0 nn0Var6 = on0Var.f29821a;
                    if (nn0Var6.F != null && (nn0Var6.f16168w > 0 || nn0Var6.f16167u)) {
                        float f11 = nn0Var6.A;
                        int ceil = (int) Math.ceil(vqVar.f32514m);
                        if (on0Var.f29821a.f16167u) {
                            f10 = 4.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        nn0Var6.A = (int) (AndroidUtilities.dp(f10) + ceil + on0Var.f29821a.G.d + f11);
                    }
                    if (z4) {
                        nn0 nn0Var7 = on0Var.f29821a;
                        nn0Var7.f16151f = nn0Var7.A;
                    }
                    on0Var.f29821a.B = AndroidUtilities.dp(28.0f);
                    nn0 nn0Var8 = on0Var.f29821a;
                    nn0Var8.f16162p = on0Var.f29824e;
                    if (on0Var.f29827r) {
                        nn0Var8.a();
                    }
                    if (!z4) {
                        on0Var.requestLayout();
                    }
                    on0 on0Var2 = (on0) view;
                    if (mn0Var.f29156a.h != pn0Var.h) {
                        z10 = false;
                    }
                    on0Var2.a(z10, false);
                    return;
                }
                return;
            case 4:
                xh0 xh0Var = (xh0) this.d;
                ((wh0) m1Var.f5875a).a((TLObject) xh0Var.f43069c.get(i10), false, ((Integer) xh0Var.f43068b.get(i10)).intValue());
                return;
            case 5:
                ((oi1) m1Var.f5875a).f39789a = WallpapersListActivity.f34943j0[i10];
                return;
            default:
                ((uf.f0) m1Var).v.setData((uf.e0) ((uf.g0) this.d).U2.get(i10));
                return;
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f6317c) {
            case 0:
                m mVar = (m) this.d;
                g6 g6Var = mVar.f6239a;
                if (i10 == 0) {
                    view = new j(mVar, mVar.getContext());
                } else if (i10 == 2) {
                    view = new s3(mVar.getContext(), 16);
                } else {
                    Context context = mVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f6376c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, c6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f6374a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    org.telegram.ui.b.l(k6.G6, g6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, c6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f6375b = textView2;
                    org.telegram.ui.b.l(k6.f22036y6, g6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, c6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return yh.o(view, view, -1, -2);
            case 1:
                ?? view2 = new View(((g5) this.d).getContext());
                view2.f28680a = 0;
                return new f2.m1(view2);
            case 2:
                return new f2.m1(((ma) this.d).U);
            case 3:
                pn0 pn0Var = (pn0) this.d;
                return new f2.m1(new on0(pn0Var, pn0Var.getContext()));
            case 4:
                wh0 wh0Var = new wh0(viewGroup.getContext());
                wh0Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(50.0f)));
                return new f2.m1(wh0Var);
            case 5:
                si1 si1Var = (si1) this.d;
                return new f2.m1(new oi1(si1Var.B, si1Var.f41301c));
            default:
                uf.d0 d0Var = new uf.d0(viewGroup.getContext(), ((uf.g0) this.d).f31383m2);
                ?? m1Var = new f2.m1(d0Var);
                m1Var.v = d0Var;
                d0Var.setLayoutParams(new f2.x0(-2, AndroidUtilities.dp(30.0f)));
                return m1Var;
        }
    }

    @Override
    public void y(f2.m1 m1Var) {
        boolean z4;
        switch (this.f6317c) {
            case 3:
                pn0 pn0Var = (pn0) this.d;
                ArrayList arrayList = pn0Var.f30134r;
                int b10 = m1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    on0 on0Var = (on0) m1Var.f5875a;
                    if (((mn0) arrayList.get(b10)).f29156a.h == pn0Var.h) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    on0Var.a(z4, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(f2.m1 m1Var, int i10) {
    }
}
