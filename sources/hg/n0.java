package hg;

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
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.uq;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.fi0;
import org.telegram.ui.fj1;
import org.telegram.ui.gi0;
import org.telegram.ui.jj1;
import w7.x5;
import zh.w3;
public final class n0 extends kl0 {
    public final int f11208c;
    public final Object d;

    public n0(Object obj, int i10) {
        this.f11208c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f11208c) {
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
        int[] iArr = ((w3) this.d).P0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f11208c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((s0) obj).X2.size();
            case 1:
                return 1;
            case 2:
                return ((hn0) obj).f26795r.size();
            case 3:
                return ((gi0) obj).f36711c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f34275k0;
                return 12;
            case 5:
                return ((sg.j) obj).d.size();
            default:
                return ((w3) obj).P0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f11208c) {
            case 1:
                return i10;
            case 5:
                return ((sg.h) ((sg.j) this.d).d.get(i10)).f46134a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        uq uqVar;
        float f7;
        switch (this.f11208c) {
            case 0:
                ((r0) c1Var).v.setData((q0) ((s0) this.d).X2.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = c1Var.f45766a;
                hn0 hn0Var = (hn0) this.d;
                ArrayList arrayList = hn0Var.f26795r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    en0 en0Var = (en0) arrayList.get(i10);
                    gn0 gn0Var = (gn0) view;
                    ah.j1 j1Var = gn0Var.d;
                    boolean z11 = true;
                    if (j1Var != null && j1Var.equals(en0Var.f25764a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = en0Var.f25764a.g();
                        tL_reactionCount.count = en0Var.f25765b;
                        hn0 hn0Var2 = gn0Var.f26495s;
                        fn0 fn0Var = new fn0(gn0Var, hn0Var2.f26789a, gn0Var, tL_reactionCount, hn0Var2.f26791c);
                        gn0Var.f26488a = fn0Var;
                        fn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        fn0 fn0Var2 = gn0Var.f26488a;
                        fn0Var2.f585q = true;
                        fn0Var2.S = true;
                    } else {
                        gn0Var.f26488a.f590w = en0Var.f25765b;
                    }
                    gn0Var.d = en0Var.f25764a;
                    if (!z10) {
                        fn0 fn0Var3 = gn0Var.f26488a;
                        fn0Var3.f573f = fn0Var3.A;
                    }
                    gn0Var.f26488a.A = AndroidUtilities.dp(44.33f);
                    gn0Var.f26488a.f589u = !TextUtils.isEmpty(en0Var.f25766c);
                    fn0 fn0Var4 = gn0Var.f26488a;
                    boolean z12 = fn0Var4.f589u;
                    p6 p6Var = fn0Var4.G;
                    if (z12) {
                        p6Var.q(Emoji.replaceEmoji(en0Var.f25766c, p6Var.f29311a.getFontMetricsInt(), false), !z10, true);
                    } else if (p6Var != null) {
                        p6Var.q("", !z10, true);
                    }
                    fn0 fn0Var5 = gn0Var.f26488a;
                    Integer.toString(en0Var.f25765b);
                    fn0Var5.getClass();
                    gn0Var.f26488a.F.c(en0Var.f25765b, !z10);
                    fn0 fn0Var6 = gn0Var.f26488a;
                    if (fn0Var6.F != null && (fn0Var6.f590w > 0 || fn0Var6.f589u)) {
                        float f10 = fn0Var6.A;
                        int ceil = (int) Math.ceil(uqVar.f30972m);
                        if (gn0Var.f26488a.f589u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        fn0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + gn0Var.f26488a.G.d + f10);
                    }
                    if (z10) {
                        fn0 fn0Var7 = gn0Var.f26488a;
                        fn0Var7.f573f = fn0Var7.A;
                    }
                    gn0Var.f26488a.B = AndroidUtilities.dp(28.0f);
                    fn0 fn0Var8 = gn0Var.f26488a;
                    fn0Var8.f584p = gn0Var.f26491e;
                    if (gn0Var.f26494r) {
                        fn0Var8.a();
                    }
                    if (!z10) {
                        gn0Var.requestLayout();
                    }
                    gn0 gn0Var2 = (gn0) view;
                    if (en0Var.f25764a.h != hn0Var.h) {
                        z11 = false;
                    }
                    gn0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                gi0 gi0Var = (gi0) this.d;
                ((fi0) c1Var.f45766a).a((TLObject) gi0Var.f36711c.get(i10), false, ((Integer) gi0Var.f36710b.get(i10)).intValue());
                return;
            case 4:
                ((fj1) c1Var.f45766a).f36448a = WallpapersListActivity.m0[i10];
                return;
            case 5:
                sg.j jVar = (sg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((sg.h) arrayList2.get(i10)).f46134a == 1) {
                    sg.i iVar = (sg.i) c1Var.f45766a;
                    iVar.f46143c.setColorFilter(new PorterDuffColorFilter(jVar.f46146e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f46143c.setImageDrawable(jVar.getContext().getDrawable(((sg.h) arrayList2.get(i10)).f46135b));
                    iVar.f46141a.setText(((sg.h) arrayList2.get(i10)).f46136c);
                    iVar.f46142b.setText(((sg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((w3) this.d).P0;
                ta taVar = (ta) c1Var.f45766a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (taVar.f30609a != i11) {
                    taVar.f30609a = i11;
                    taVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f11208c) {
            case 0:
                p0 p0Var = new p0(viewGroup.getContext(), ((s0) this.d).f28251p2);
                ?? c1Var = new s4.c1(p0Var);
                c1Var.v = p0Var;
                p0Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(30.0f)));
                return c1Var;
            case 1:
                return new s4.c1(((ua) this.d).X);
            case 2:
                hn0 hn0Var = (hn0) this.d;
                return new s4.c1(new gn0(hn0Var, hn0Var.getContext()));
            case 3:
                fi0 fi0Var = new fi0(viewGroup.getContext());
                fi0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.c1(fi0Var);
            case 4:
                jj1 jj1Var = (jj1) this.d;
                return new s4.c1(new fj1(jj1Var.E, jj1Var.f37813c));
            case 5:
                sg.j jVar = (sg.j) this.d;
                f6 f6Var = jVar.f46050a;
                if (i10 == 0) {
                    view = new sg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new s3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f46143c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, x5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f46141a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    wl.n(j6.G6, f6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, x5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f46142b = textView2;
                    wl.n(j6.f21069y6, f6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, x5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            default:
                ?? view2 = new View(((w3) this.d).getContext());
                view2.f30609a = 0;
                return new s4.c1(view2);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        boolean z10;
        switch (this.f11208c) {
            case 2:
                hn0 hn0Var = (hn0) this.d;
                ArrayList arrayList = hn0Var.f26795r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    gn0 gn0Var = (gn0) c1Var.f45766a;
                    if (((en0) arrayList.get(b10)).f25764a.h == hn0Var.h) {
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
