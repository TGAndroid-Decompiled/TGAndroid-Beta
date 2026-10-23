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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ci1;
import org.telegram.ui.th0;
import org.telegram.ui.uh0;
import org.telegram.ui.yh1;
public final class m5 extends lm0 {
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
                return ((jo0) obj).f27727r.size();
            case 4:
                return ((uh0) obj).f42444c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.f35515k0;
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
                return ((sg.h) ((sg.j) this.d).d.get(i10)).f46692a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        er erVar;
        float f7;
        switch (this.f1811c) {
            case 0:
                int[] iArr = ((l7) this.d).S0;
                org.telegram.ui.Components.ta taVar = (org.telegram.ui.Components.ta) b1Var.f46343a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (taVar.f30673a != i11) {
                    taVar.f30673a = i11;
                    taVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((hg.p0) b1Var).v.setData((hg.o0) ((hg.q0) this.d).Y2.get(i10));
                return;
            case 2:
                return;
            case 3:
                View view = b1Var.f46343a;
                jo0 jo0Var = (jo0) this.d;
                ArrayList arrayList = jo0Var.f27727r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    go0 go0Var = (go0) arrayList.get(i10);
                    io0 io0Var = (io0) view;
                    ah.i1 i1Var = io0Var.d;
                    boolean z11 = true;
                    if (i1Var != null && i1Var.equals(go0Var.f26687a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = go0Var.f26687a.g();
                        tL_reactionCount.count = go0Var.f26688b;
                        jo0 jo0Var2 = io0Var.f27382s;
                        ho0 ho0Var = new ho0(io0Var, jo0Var2.f27722a, io0Var, tL_reactionCount, jo0Var2.f27724c);
                        io0Var.f27376a = ho0Var;
                        ho0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        ho0 ho0Var2 = io0Var.f27376a;
                        ho0Var2.f761q = true;
                        ho0Var2.S = true;
                    } else {
                        io0Var.f27376a.f766w = go0Var.f26688b;
                    }
                    io0Var.d = go0Var.f26687a;
                    if (!z10) {
                        ho0 ho0Var3 = io0Var.f27376a;
                        ho0Var3.f749f = ho0Var3.A;
                    }
                    io0Var.f27376a.A = AndroidUtilities.dp(44.33f);
                    io0Var.f27376a.f765u = !TextUtils.isEmpty(go0Var.f26689c);
                    ho0 ho0Var4 = io0Var.f27376a;
                    boolean z12 = ho0Var4.f765u;
                    org.telegram.ui.Components.p6 p6Var = ho0Var4.G;
                    if (z12) {
                        p6Var.t(Emoji.replaceEmoji(go0Var.f26689c, p6Var.f29435a.getFontMetricsInt(), false), !z10, true);
                    } else if (p6Var != null) {
                        p6Var.t("", !z10, true);
                    }
                    ho0 ho0Var5 = io0Var.f27376a;
                    Integer.toString(go0Var.f26688b);
                    ho0Var5.getClass();
                    io0Var.f27376a.F.c(go0Var.f26688b, !z10);
                    ho0 ho0Var6 = io0Var.f27376a;
                    if (ho0Var6.F != null && (ho0Var6.f766w > 0 || ho0Var6.f765u)) {
                        float f10 = ho0Var6.A;
                        int ceil = (int) Math.ceil(erVar.f26040m);
                        if (io0Var.f27376a.f765u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        ho0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + io0Var.f27376a.G.d + f10);
                    }
                    if (z10) {
                        ho0 ho0Var7 = io0Var.f27376a;
                        ho0Var7.f749f = ho0Var7.A;
                    }
                    io0Var.f27376a.B = AndroidUtilities.dp(28.0f);
                    ho0 ho0Var8 = io0Var.f27376a;
                    ho0Var8.f760p = io0Var.e;
                    if (io0Var.f27381r) {
                        ho0Var8.a();
                    }
                    if (!z10) {
                        io0Var.requestLayout();
                    }
                    io0 io0Var2 = (io0) view;
                    if (go0Var.f26687a.h != jo0Var.h) {
                        z11 = false;
                    }
                    io0Var2.a(z11, false);
                    return;
                }
                return;
            case 4:
                uh0 uh0Var = (uh0) this.d;
                ((th0) b1Var.f46343a).a((TLObject) uh0Var.f42444c.get(i10), false, ((Integer) uh0Var.f42443b.get(i10)).intValue());
                return;
            case 5:
                ((yh1) b1Var.f46343a).f43870a = WallpapersListActivity.m0[i10];
                return;
            default:
                sg.j jVar = (sg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((sg.h) arrayList2.get(i10)).f46692a == 1) {
                    sg.i iVar = (sg.i) b1Var.f46343a;
                    iVar.f46698c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f46698c.setImageDrawable(jVar.getContext().getDrawable(((sg.h) arrayList2.get(i10)).f46693b));
                    iVar.f46696a.setText(((sg.h) arrayList2.get(i10)).f46694c);
                    iVar.f46697b.setText(((sg.h) arrayList2.get(i10)).d);
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
                view2.f30673a = 0;
                return new s4.b1(view2);
            case 1:
                hg.n0 n0Var = new hg.n0(viewGroup.getContext(), ((hg.q0) this.d).f28705n2);
                ?? b1Var = new s4.b1(n0Var);
                b1Var.v = n0Var;
                n0Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(30.0f)));
                return b1Var;
            case 2:
                return new s4.b1(((org.telegram.ui.Components.ua) this.d).X);
            case 3:
                jo0 jo0Var = (jo0) this.d;
                return new s4.b1(new io0(jo0Var, jo0Var.getContext()));
            case 4:
                th0 th0Var = new th0(viewGroup.getContext());
                th0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.b1(th0Var);
            case 5:
                ci1 ci1Var = (ci1) this.d;
                return new s4.b1(new yh1(ci1Var.E, ci1Var.f36372c));
            default:
                sg.j jVar = (sg.j) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = jVar.f46640a;
                if (i10 == 0) {
                    view = new sg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.s3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f46698c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, w7.z5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f46696a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
                    textView.setTextSize(1, 14.0f);
                    frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f46697b = textView2;
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21571y6, g6Var);
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
                jo0 jo0Var = (jo0) this.d;
                ArrayList arrayList = jo0Var.f27727r;
                int b10 = b1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    io0 io0Var = (io0) b1Var.f46343a;
                    if (((go0) arrayList.get(b10)).f26687a.h == jo0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    io0Var.a(z10, false);
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
