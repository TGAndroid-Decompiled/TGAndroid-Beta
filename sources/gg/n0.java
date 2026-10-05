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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ci0;
import org.telegram.ui.di0;
import org.telegram.ui.vi1;
import org.telegram.ui.zi1;
import w7.z5;
import yh.y3;
public final class n0 extends yl0 {
    public final int f10722c;
    public final Object d;

    public n0(Object obj, int i10) {
        this.f10722c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f10722c) {
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
        int[] iArr = ((y3) this.d).P0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f10722c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((s0) obj).f10783e3.size();
            case 1:
                return 1;
            case 2:
                return ((ao0) obj).f24687r.size();
            case 3:
                return ((di0) obj).f35826c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f34613i0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((y3) obj).P0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f10722c) {
            case 1:
                return i10;
            case 5:
                return ((rg.h) ((rg.j) this.d).d.get(i10)).f46133a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        yq yqVar;
        float f7;
        switch (this.f10722c) {
            case 0:
                ((r0) c1Var).v.setData((q0) ((s0) this.d).f10783e3.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = c1Var.f46538a;
                ao0 ao0Var = (ao0) this.d;
                ArrayList arrayList = ao0Var.f24687r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    xn0 xn0Var = (xn0) arrayList.get(i10);
                    zn0 zn0Var = (zn0) view;
                    zg.m0 m0Var = zn0Var.d;
                    boolean z11 = true;
                    if (m0Var != null && m0Var.equals(xn0Var.f33046a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = xn0Var.f33046a.g();
                        tL_reactionCount.count = xn0Var.f33047b;
                        ao0 ao0Var2 = zn0Var.f33596s;
                        yn0 yn0Var = new yn0(zn0Var, ao0Var2.f24681a, zn0Var, tL_reactionCount, ao0Var2.f24683c);
                        zn0Var.f33589a = yn0Var;
                        yn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        yn0 yn0Var2 = zn0Var.f33589a;
                        yn0Var2.f53455q = true;
                        yn0Var2.S = true;
                    } else {
                        zn0Var.f33589a.f53460w = xn0Var.f33047b;
                    }
                    zn0Var.d = xn0Var.f33046a;
                    if (!z10) {
                        yn0 yn0Var3 = zn0Var.f33589a;
                        yn0Var3.f53443f = yn0Var3.A;
                    }
                    zn0Var.f33589a.A = AndroidUtilities.dp(44.33f);
                    zn0Var.f33589a.f53459u = !TextUtils.isEmpty(xn0Var.f33048c);
                    yn0 yn0Var4 = zn0Var.f33589a;
                    boolean z12 = yn0Var4.f53459u;
                    o6 o6Var = yn0Var4.G;
                    if (z12) {
                        o6Var.q(Emoji.replaceEmoji(xn0Var.f33048c, o6Var.f29353a.getFontMetricsInt(), false), !z10, true);
                    } else if (o6Var != null) {
                        o6Var.q("", !z10, true);
                    }
                    yn0 yn0Var5 = zn0Var.f33589a;
                    Integer.toString(xn0Var.f33047b);
                    yn0Var5.getClass();
                    zn0Var.f33589a.F.c(xn0Var.f33047b, !z10);
                    yn0 yn0Var6 = zn0Var.f33589a;
                    if (yn0Var6.F != null && (yn0Var6.f53460w > 0 || yn0Var6.f53459u)) {
                        float f10 = yn0Var6.A;
                        int ceil = (int) Math.ceil(yqVar.f33321m);
                        if (zn0Var.f33589a.f53459u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        yn0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + zn0Var.f33589a.G.d + f10);
                    }
                    if (z10) {
                        yn0 yn0Var7 = zn0Var.f33589a;
                        yn0Var7.f53443f = yn0Var7.A;
                    }
                    zn0Var.f33589a.B = AndroidUtilities.dp(28.0f);
                    yn0 yn0Var8 = zn0Var.f33589a;
                    yn0Var8.f53454p = zn0Var.f33592e;
                    if (zn0Var.f33595r) {
                        yn0Var8.a();
                    }
                    if (!z10) {
                        zn0Var.requestLayout();
                    }
                    zn0 zn0Var2 = (zn0) view;
                    if (xn0Var.f33046a.h != ao0Var.h) {
                        z11 = false;
                    }
                    zn0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                di0 di0Var = (di0) this.d;
                ((ci0) c1Var.f46538a).a((TLObject) di0Var.f35826c.get(i10), false, ((Integer) di0Var.f35825b.get(i10)).intValue());
                return;
            case 4:
                ((vi1) c1Var.f46538a).f41762a = WallpapersListActivity.f34615k0[i10];
                return;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).f46133a == 1) {
                    rg.i iVar = (rg.i) c1Var.f46538a;
                    iVar.f46141c.setColorFilter(new PorterDuffColorFilter(jVar.f46144e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f46141c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).f46134b));
                    iVar.f46139a.setText(((rg.h) arrayList2.get(i10)).f46135c);
                    iVar.f46140b.setText(((rg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((y3) this.d).P0;
                ua uaVar = (ua) c1Var.f46538a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (uaVar.f31412a != i11) {
                    uaVar.f31412a = i11;
                    uaVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f10722c) {
            case 0:
                p0 p0Var = new p0(viewGroup.getContext(), ((s0) this.d).f33560p2);
                ?? c1Var = new s4.c1(p0Var);
                c1Var.v = p0Var;
                p0Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(30.0f)));
                return c1Var;
            case 1:
                return new s4.c1(((va) this.d).X);
            case 2:
                ao0 ao0Var = (ao0) this.d;
                return new s4.c1(new zn0(ao0Var, ao0Var.getContext()));
            case 3:
                ci0 ci0Var = new ci0(viewGroup.getContext());
                ci0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.c1(ci0Var);
            case 4:
                zi1 zi1Var = (zi1) this.d;
                return new s4.c1(new vi1(zi1Var.E, zi1Var.f43838c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                d6 d6Var = jVar.f46064a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f46141c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, z5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f46139a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    bi.m(i6.G6, d6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, z5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f46140b = textView2;
                    bi.m(i6.f21214y6, d6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, z5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ?? view2 = new View(((y3) this.d).getContext());
                view2.f31412a = 0;
                return new s4.c1(view2);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        boolean z10;
        switch (this.f10722c) {
            case 2:
                ao0 ao0Var = (ao0) this.d;
                ArrayList arrayList = ao0Var.f24687r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    zn0 zn0Var = (zn0) c1Var.f46538a;
                    if (((xn0) arrayList.get(b10)).f33046a.h == ao0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zn0Var.a(z10, false);
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
