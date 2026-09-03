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
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ui1;
import org.telegram.ui.wh0;
import org.telegram.ui.xh0;
import org.telegram.ui.yh;
import org.telegram.ui.yi1;
public final class g extends rl0 {
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
                return ((on0) obj).f29830r.size();
            case 4:
                return ((xh0) obj).f43050c.size();
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
                if (laVar.f28703a != i11) {
                    laVar.f28703a = i11;
                    laVar.requestLayout();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                View view = m1Var.f5875a;
                on0 on0Var = (on0) this.d;
                ArrayList arrayList2 = on0Var.f29830r;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    ln0 ln0Var = (ln0) arrayList2.get(i10);
                    nn0 nn0Var = (nn0) view;
                    ng.q0 q0Var = nn0Var.d;
                    boolean z10 = true;
                    if (q0Var != null && q0Var.equals(ln0Var.f28810a)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = ln0Var.f28810a.g();
                        tL_reactionCount.count = ln0Var.f28811b;
                        on0 on0Var2 = nn0Var.f29546s;
                        mn0 mn0Var = new mn0(nn0Var, on0Var2.f29824a, nn0Var, tL_reactionCount, on0Var2.f29826c);
                        nn0Var.f29539a = mn0Var;
                        mn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        mn0 mn0Var2 = nn0Var.f29539a;
                        mn0Var2.f16165q = true;
                        mn0Var2.S = true;
                    } else {
                        nn0Var.f29539a.f16170w = ln0Var.f28811b;
                    }
                    nn0Var.d = ln0Var.f28810a;
                    if (!z4) {
                        mn0 mn0Var3 = nn0Var.f29539a;
                        mn0Var3.f16153f = mn0Var3.A;
                    }
                    nn0Var.f29539a.A = AndroidUtilities.dp(44.33f);
                    nn0Var.f29539a.f16169u = !TextUtils.isEmpty(ln0Var.f28812c);
                    mn0 mn0Var4 = nn0Var.f29539a;
                    boolean z11 = mn0Var4.f16169u;
                    j6 j6Var = mn0Var4.G;
                    if (z11) {
                        j6Var.q(Emoji.replaceEmoji(ln0Var.f28812c, j6Var.f27998a.getFontMetricsInt(), false), !z4, true);
                    } else if (j6Var != null) {
                        j6Var.q("", !z4, true);
                    }
                    mn0 mn0Var5 = nn0Var.f29539a;
                    Integer.toString(ln0Var.f28811b);
                    mn0Var5.getClass();
                    nn0Var.f29539a.F.c(ln0Var.f28811b, !z4);
                    mn0 mn0Var6 = nn0Var.f29539a;
                    if (mn0Var6.F != null && (mn0Var6.f16170w > 0 || mn0Var6.f16169u)) {
                        float f11 = mn0Var6.A;
                        int ceil = (int) Math.ceil(vqVar.f32517m);
                        if (nn0Var.f29539a.f16169u) {
                            f10 = 4.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        mn0Var6.A = (int) (AndroidUtilities.dp(f10) + ceil + nn0Var.f29539a.G.d + f11);
                    }
                    if (z4) {
                        mn0 mn0Var7 = nn0Var.f29539a;
                        mn0Var7.f16153f = mn0Var7.A;
                    }
                    nn0Var.f29539a.B = AndroidUtilities.dp(28.0f);
                    mn0 mn0Var8 = nn0Var.f29539a;
                    mn0Var8.f16164p = nn0Var.f29542e;
                    if (nn0Var.f29545r) {
                        mn0Var8.a();
                    }
                    if (!z4) {
                        nn0Var.requestLayout();
                    }
                    nn0 nn0Var2 = (nn0) view;
                    if (ln0Var.f28810a.h != on0Var.h) {
                        z10 = false;
                    }
                    nn0Var2.a(z10, false);
                    return;
                }
                return;
            case 4:
                xh0 xh0Var = (xh0) this.d;
                ((wh0) m1Var.f5875a).a((TLObject) xh0Var.f43050c.get(i10), false, ((Integer) xh0Var.f43049b.get(i10)).intValue());
                return;
            case 5:
                ((ui1) m1Var.f5875a).f41849a = WallpapersListActivity.f34943j0[i10];
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
                    org.telegram.ui.b.l(k6.f22038y6, g6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, c6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return yh.o(view, view, -1, -2);
            case 1:
                ?? view2 = new View(((g5) this.d).getContext());
                view2.f28703a = 0;
                return new f2.m1(view2);
            case 2:
                return new f2.m1(((ma) this.d).U);
            case 3:
                on0 on0Var = (on0) this.d;
                return new f2.m1(new nn0(on0Var, on0Var.getContext()));
            case 4:
                wh0 wh0Var = new wh0(viewGroup.getContext());
                wh0Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(50.0f)));
                return new f2.m1(wh0Var);
            case 5:
                yi1 yi1Var = (yi1) this.d;
                return new f2.m1(new ui1(yi1Var.B, yi1Var.f43633c));
            default:
                uf.d0 d0Var = new uf.d0(viewGroup.getContext(), ((uf.g0) this.d).f31106m2);
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
                on0 on0Var = (on0) this.d;
                ArrayList arrayList = on0Var.f29830r;
                int b10 = m1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    nn0 nn0Var = (nn0) m1Var.f5875a;
                    if (((ln0) arrayList.get(b10)).f28810a.h == on0Var.h) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    nn0Var.a(z4, false);
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
