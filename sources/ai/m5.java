package ai;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.km0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.sh0;
import org.telegram.ui.th0;
import org.telegram.ui.xh1;
public final class m5 extends km0 {
    public final int f1811c;
    public final Object d;

    public m5(Object obj, int i10) {
        this.f1811c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        switch (this.f1811c) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            default:
                return false;
        }
    }

    public void F(int i10, int i11) {
        int[] iArr = ((l7) this.d).S0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f1811c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((l7) obj).S0.length;
            case 1:
                return ((hg.q0) obj).Y2.size();
            case 2:
                return 1;
            case 3:
                return ((io0) obj).f27457r.size();
            case 4:
                return ((th0) obj).f42063c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.f35517k0;
                return 12;
            default:
                return ((sg.j) obj).d.size();
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f1811c) {
            case 2:
                return i10;
            case 6:
                return ((sg.h) ((sg.j) this.d).d.get(i10)).f46691a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        cr crVar;
        float f7;
        switch (this.f1811c) {
            case 0:
                int[] iArr = ((l7) this.d).S0;
                org.telegram.ui.Components.ra raVar = (org.telegram.ui.Components.ra) b1Var.f46342a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (raVar.f30105a != i11) {
                    raVar.f30105a = i11;
                    raVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((hg.p0) b1Var).v.setData((hg.o0) ((hg.q0) this.d).Y2.get(i10));
                return;
            case 2:
                return;
            case 3:
                View view = b1Var.f46342a;
                io0 io0Var = (io0) this.d;
                ArrayList arrayList = io0Var.f27457r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    fo0 fo0Var = (fo0) arrayList.get(i10);
                    ho0 ho0Var = (ho0) view;
                    ah.i1 i1Var = ho0Var.d;
                    boolean z11 = true;
                    if (i1Var != null && i1Var.equals(fo0Var.f26400a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = fo0Var.f26400a.g();
                        tL_reactionCount.count = fo0Var.f26401b;
                        io0 io0Var2 = ho0Var.f27094s;
                        go0 go0Var = new go0(ho0Var, io0Var2.f27452a, ho0Var, tL_reactionCount, io0Var2.f27454c);
                        ho0Var.f27088a = go0Var;
                        go0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        go0 go0Var2 = ho0Var.f27088a;
                        go0Var2.f761q = true;
                        go0Var2.S = true;
                    } else {
                        ho0Var.f27088a.f766w = fo0Var.f26401b;
                    }
                    ho0Var.d = fo0Var.f26400a;
                    if (!z10) {
                        go0 go0Var3 = ho0Var.f27088a;
                        go0Var3.f749f = go0Var3.A;
                    }
                    ho0Var.f27088a.A = AndroidUtilities.dp(44.33f);
                    ho0Var.f27088a.f765u = !TextUtils.isEmpty(fo0Var.f26402c);
                    go0 go0Var4 = ho0Var.f27088a;
                    boolean z12 = go0Var4.f765u;
                    org.telegram.ui.Components.n6 n6Var = go0Var4.G;
                    if (z12) {
                        n6Var.t(Emoji.replaceEmoji(fo0Var.f26402c, n6Var.f28795a.getFontMetricsInt(), false), !z10, true);
                    } else if (n6Var != null) {
                        n6Var.t("", !z10, true);
                    }
                    go0 go0Var5 = ho0Var.f27088a;
                    Integer.toString(fo0Var.f26401b);
                    go0Var5.getClass();
                    ho0Var.f27088a.F.c(fo0Var.f26401b, !z10);
                    go0 go0Var6 = ho0Var.f27088a;
                    if (go0Var6.F != null && (go0Var6.f766w > 0 || go0Var6.f765u)) {
                        float f10 = go0Var6.A;
                        int ceil = (int) Math.ceil(crVar.f25446m);
                        if (ho0Var.f27088a.f765u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        go0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + ho0Var.f27088a.G.d + f10);
                    }
                    if (z10) {
                        go0 go0Var7 = ho0Var.f27088a;
                        go0Var7.f749f = go0Var7.A;
                    }
                    ho0Var.f27088a.B = AndroidUtilities.dp(28.0f);
                    go0 go0Var8 = ho0Var.f27088a;
                    go0Var8.f760p = ho0Var.e;
                    if (ho0Var.f27093r) {
                        go0Var8.a();
                    }
                    if (!z10) {
                        ho0Var.requestLayout();
                    }
                    ho0 ho0Var2 = (ho0) view;
                    if (fo0Var.f26400a.h != io0Var.h) {
                        z11 = false;
                    }
                    ho0Var2.a(z11, false);
                    return;
                }
                return;
            case 4:
                th0 th0Var = (th0) this.d;
                ((sh0) b1Var.f46342a).a((TLObject) th0Var.f42063c.get(i10), false, ((Integer) th0Var.f42062b.get(i10)).intValue());
                return;
            case 5:
                ((xh1) b1Var.f46342a).f43612a = WallpapersListActivity.m0[i10];
                return;
            default:
                sg.j jVar = (sg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((sg.h) arrayList2.get(i10)).f46691a == 1) {
                    sg.i iVar = (sg.i) b1Var.f46342a;
                    iVar.f46697c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f46697c.setImageDrawable(jVar.getContext().getDrawable(((sg.h) arrayList2.get(i10)).f46692b));
                    iVar.f46695a.setText(((sg.h) arrayList2.get(i10)).f46693c);
                    iVar.f46696b.setText(((sg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f1811c) {
            case 0:
                ?? view2 = new View(((l7) this.d).getContext());
                view2.f30105a = 0;
                return new s4.b1(view2);
            case 1:
                hg.n0 n0Var = new hg.n0(viewGroup.getContext(), ((hg.q0) this.d).f28396n2);
                ?? b1Var = new s4.b1(n0Var);
                b1Var.v = n0Var;
                n0Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(30.0f)));
                return b1Var;
            case 2:
                return new s4.b1(((org.telegram.ui.Components.sa) this.d).X);
            case 3:
                io0 io0Var = (io0) this.d;
                return new s4.b1(new ho0(io0Var, io0Var.getContext()));
            case 4:
                sh0 sh0Var = new sh0(viewGroup.getContext());
                sh0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.b1(sh0Var);
            case 5:
                bi1 bi1Var = (bi1) this.d;
                return new s4.b1(new xh1(bi1Var.E, bi1Var.f36079c));
            default:
                sg.j jVar = (sg.j) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = jVar.f46639a;
                if (i10 == 0) {
                    view = new sg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.s3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f46697c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, w7.z5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f46695a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
                    textView.setTextSize(1, 14.0f);
                    frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f46696b = textView2;
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21572y6, g6Var);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
        }
    }

    @Override
    public void y(s4.b1 b1Var) {
        boolean z10;
        switch (this.f1811c) {
            case 3:
                io0 io0Var = (io0) this.d;
                ArrayList arrayList = io0Var.f27457r;
                int b10 = b1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ho0 ho0Var = (ho0) b1Var.f46342a;
                    if (((fo0) arrayList.get(b10)).f26400a.h == io0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ho0Var.a(z10, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(s4.b1 b1Var, int i10) {
    }
}
