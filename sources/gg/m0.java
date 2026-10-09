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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.gi0;
import org.telegram.ui.hi0;
import org.telegram.ui.hj1;
import org.telegram.ui.lj1;
import w7.x5;
import yh.s3;
public final class m0 extends pm0 {
    public final int f10727c;
    public final Object d;

    public m0(Object obj, int i10) {
        this.f10727c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        switch (this.f10727c) {
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
        int[] iArr = ((s3) this.d).Q0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f10727c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((r0) obj).V2.size();
            case 1:
                return 1;
            case 2:
                return ((no0) obj).f29225r.size();
            case 3:
                return ((hi0) obj).f38351c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f35759k0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((s3) obj).Q0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f10727c) {
            case 1:
                return i10;
            case 5:
                return ((rg.h) ((rg.j) this.d).d.get(i10)).f47257a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        lr lrVar;
        float f7;
        switch (this.f10727c) {
            case 0:
                ((q0) d1Var).v.setData((p0) ((r0) this.d).V2.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = d1Var.f47656a;
                no0 no0Var = (no0) this.d;
                ArrayList arrayList = no0Var.f29225r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ko0 ko0Var = (ko0) arrayList.get(i10);
                    mo0 mo0Var = (mo0) view;
                    zg.n0 n0Var = mo0Var.d;
                    boolean z11 = true;
                    if (n0Var != null && n0Var.equals(ko0Var.f28115a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = ko0Var.f28115a.g();
                        tL_reactionCount.count = ko0Var.f28116b;
                        no0 no0Var2 = mo0Var.f28878s;
                        lo0 lo0Var = new lo0(mo0Var, no0Var2.f29219a, mo0Var, tL_reactionCount, no0Var2.f29221c);
                        mo0Var.f28871a = lo0Var;
                        lo0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        lo0 lo0Var2 = mo0Var.f28871a;
                        lo0Var2.f54599q = true;
                        lo0Var2.S = true;
                    } else {
                        mo0Var.f28871a.f54604w = ko0Var.f28116b;
                    }
                    mo0Var.d = ko0Var.f28115a;
                    if (!z10) {
                        lo0 lo0Var3 = mo0Var.f28871a;
                        lo0Var3.f54587f = lo0Var3.A;
                    }
                    mo0Var.f28871a.A = AndroidUtilities.dp(44.33f);
                    mo0Var.f28871a.f54603u = !TextUtils.isEmpty(ko0Var.f28117c);
                    lo0 lo0Var4 = mo0Var.f28871a;
                    boolean z12 = lo0Var4.f54603u;
                    q6 q6Var = lo0Var4.G;
                    if (z12) {
                        q6Var.t(Emoji.replaceEmoji(ko0Var.f28117c, q6Var.f30063a.getFontMetricsInt(), false), !z10, true);
                    } else if (q6Var != null) {
                        q6Var.t("", !z10, true);
                    }
                    lo0 lo0Var5 = mo0Var.f28871a;
                    Integer.toString(ko0Var.f28116b);
                    lo0Var5.getClass();
                    mo0Var.f28871a.F.c(ko0Var.f28116b, !z10);
                    lo0 lo0Var6 = mo0Var.f28871a;
                    if (lo0Var6.F != null && (lo0Var6.f54604w > 0 || lo0Var6.f54603u)) {
                        float f10 = lo0Var6.A;
                        int ceil = (int) Math.ceil(lrVar.f28560m);
                        if (mo0Var.f28871a.f54603u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        lo0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + mo0Var.f28871a.G.d + f10);
                    }
                    if (z10) {
                        lo0 lo0Var7 = mo0Var.f28871a;
                        lo0Var7.f54587f = lo0Var7.A;
                    }
                    mo0Var.f28871a.B = AndroidUtilities.dp(28.0f);
                    lo0 lo0Var8 = mo0Var.f28871a;
                    lo0Var8.f54598p = mo0Var.f28874e;
                    if (mo0Var.f28877r) {
                        lo0Var8.a();
                    }
                    if (!z10) {
                        mo0Var.requestLayout();
                    }
                    mo0 mo0Var2 = (mo0) view;
                    if (ko0Var.f28115a.h != no0Var.h) {
                        z11 = false;
                    }
                    mo0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                hi0 hi0Var = (hi0) this.d;
                ((gi0) d1Var.f47656a).a((TLObject) hi0Var.f38351c.get(i10), false, ((Integer) hi0Var.f38350b.get(i10)).intValue());
                return;
            case 4:
                ((hj1) d1Var.f47656a).f38363a = WallpapersListActivity.m0[i10];
                return;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).f47257a == 1) {
                    rg.i iVar = (rg.i) d1Var.f47656a;
                    iVar.f47263c.setColorFilter(new PorterDuffColorFilter(jVar.f47270e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f47263c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).f47258b));
                    iVar.f47261a.setText(((rg.h) arrayList2.get(i10)).f47259c);
                    iVar.f47262b.setText(((rg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((s3) this.d).Q0;
                wa waVar = (wa) d1Var.f47656a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (waVar.f32589a != i11) {
                    waVar.f32589a = i11;
                    waVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f10727c) {
            case 0:
                o0 o0Var = new o0(viewGroup.getContext(), ((r0) this.d).f30216n2);
                ?? d1Var = new s4.d1(o0Var);
                d1Var.v = o0Var;
                o0Var.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(30.0f)));
                return d1Var;
            case 1:
                return new s4.d1(((xa) this.d).X);
            case 2:
                no0 no0Var = (no0) this.d;
                return new s4.d1(new mo0(no0Var, no0Var.getContext()));
            case 3:
                gi0 gi0Var = new gi0(viewGroup.getContext());
                gi0Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.d1(gi0Var);
            case 4:
                lj1 lj1Var = (lj1) this.d;
                return new s4.d1(new hj1(lj1Var.E, lj1Var.f39609c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                e6 e6Var = jVar.f47199a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f47263c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, x5.a(28.0f, 25.0f, 12.0f, 16.0f, 0.0f, 28, 0));
                    TextView textView = new TextView(context);
                    frameLayout.f47261a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    bi.o(i6.G6, e6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, x5.a(-2.0f, 68.0f, 8.0f, 16.0f, 0.0f, -1, 0));
                    TextView textView2 = new TextView(context);
                    frameLayout.f47262b = textView2;
                    bi.o(i6.f21181y6, e6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, x5.a(-2.0f, 68.0f, 28.0f, 16.0f, 8.0f, -1, 0));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ?? view2 = new View(((s3) this.d).getContext());
                view2.f32589a = 0;
                return new s4.d1(view2);
        }
    }

    @Override
    public void y(s4.d1 d1Var) {
        boolean z10;
        switch (this.f10727c) {
            case 2:
                no0 no0Var = (no0) this.d;
                ArrayList arrayList = no0Var.f29225r;
                int b10 = d1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    mo0 mo0Var = (mo0) d1Var.f47656a;
                    if (((ko0) arrayList.get(b10)).f28115a.h == no0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mo0Var.a(z10, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(s4.d1 d1Var, int i10) {
    }
}
