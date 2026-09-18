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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.dj1;
import org.telegram.ui.fi0;
import org.telegram.ui.gi0;
import org.telegram.ui.hj1;
import w7.y5;
import yh.y3;
public final class n0 extends vl0 {
    public final int f9866c;
    public final Object d;

    public n0(Object obj, int i10) {
        this.f9866c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f9866c) {
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
        int i10 = this.f9866c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((s0) obj).X2.size();
            case 1:
                return 1;
            case 2:
                return ((vn0) obj).f29145r.size();
            case 3:
                return ((gi0) obj).f33879c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f31862i0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((y3) obj).P0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f9866c) {
            case 1:
                return i10;
            case 5:
                return ((rg.h) ((rg.j) this.d).d.get(i10)).f42551a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        vq vqVar;
        float f7;
        switch (this.f9866c) {
            case 0:
                ((r0) c1Var).v.setData((q0) ((s0) this.d).X2.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = c1Var.f42929a;
                vn0 vn0Var = (vn0) this.d;
                ArrayList arrayList = vn0Var.f29145r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    sn0 sn0Var = (sn0) arrayList.get(i10);
                    un0 un0Var = (un0) view;
                    zg.o0 o0Var = un0Var.d;
                    boolean z11 = true;
                    if (o0Var != null && o0Var.equals(sn0Var.f28200a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = sn0Var.f28200a.g();
                        tL_reactionCount.count = sn0Var.f28201b;
                        vn0 vn0Var2 = un0Var.f28783s;
                        tn0 tn0Var = new tn0(un0Var, vn0Var2.f29140a, un0Var, tL_reactionCount, vn0Var2.f29142c);
                        un0Var.f28777a = tn0Var;
                        tn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        tn0 tn0Var2 = un0Var.f28777a;
                        tn0Var2.f49363q = true;
                        tn0Var2.S = true;
                    } else {
                        un0Var.f28777a.f49368w = sn0Var.f28201b;
                    }
                    un0Var.d = sn0Var.f28200a;
                    if (!z10) {
                        tn0 tn0Var3 = un0Var.f28777a;
                        tn0Var3.f49351f = tn0Var3.A;
                    }
                    un0Var.f28777a.A = AndroidUtilities.dp(44.33f);
                    un0Var.f28777a.f49367u = !TextUtils.isEmpty(sn0Var.f28202c);
                    tn0 tn0Var4 = un0Var.f28777a;
                    boolean z12 = tn0Var4.f49367u;
                    o6 o6Var = tn0Var4.G;
                    if (z12) {
                        o6Var.q(Emoji.replaceEmoji(sn0Var.f28202c, o6Var.f26867a.getFontMetricsInt(), false), !z10, true);
                    } else if (o6Var != null) {
                        o6Var.q("", !z10, true);
                    }
                    tn0 tn0Var5 = un0Var.f28777a;
                    Integer.toString(sn0Var.f28201b);
                    tn0Var5.getClass();
                    un0Var.f28777a.F.c(sn0Var.f28201b, !z10);
                    tn0 tn0Var6 = un0Var.f28777a;
                    if (tn0Var6.F != null && (tn0Var6.f49368w > 0 || tn0Var6.f49367u)) {
                        float f10 = tn0Var6.A;
                        int ceil = (int) Math.ceil(vqVar.f29698m);
                        if (un0Var.f28777a.f49367u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        tn0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + un0Var.f28777a.G.d + f10);
                    }
                    if (z10) {
                        tn0 tn0Var7 = un0Var.f28777a;
                        tn0Var7.f49351f = tn0Var7.A;
                    }
                    un0Var.f28777a.B = AndroidUtilities.dp(28.0f);
                    tn0 tn0Var8 = un0Var.f28777a;
                    tn0Var8.f49362p = un0Var.e;
                    if (un0Var.f28782r) {
                        tn0Var8.a();
                    }
                    if (!z10) {
                        un0Var.requestLayout();
                    }
                    un0 un0Var2 = (un0) view;
                    if (sn0Var.f28200a.h != vn0Var.h) {
                        z11 = false;
                    }
                    un0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                gi0 gi0Var = (gi0) this.d;
                ((fi0) c1Var.f42929a).a((TLObject) gi0Var.f33879c.get(i10), false, ((Integer) gi0Var.f33878b.get(i10)).intValue());
                return;
            case 4:
                ((dj1) c1Var.f42929a).f33040a = WallpapersListActivity.f31864k0[i10];
                return;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).f42551a == 1) {
                    rg.i iVar = (rg.i) c1Var.f42929a;
                    iVar.f42558c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f42558c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).f42552b));
                    iVar.f42556a.setText(((rg.h) arrayList2.get(i10)).f42553c);
                    iVar.f42557b.setText(((rg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((y3) this.d).P0;
                ta taVar = (ta) c1Var.f42929a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (taVar.f28360a != i11) {
                    taVar.f28360a = i11;
                    taVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f9866c) {
            case 0:
                p0 p0Var = new p0(viewGroup.getContext(), ((s0) this.d).f30090p2);
                ?? c1Var = new s4.c1(p0Var);
                c1Var.v = p0Var;
                p0Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(30.0f)));
                return c1Var;
            case 1:
                return new s4.c1(((ua) this.d).X);
            case 2:
                vn0 vn0Var = (vn0) this.d;
                return new s4.c1(new un0(vn0Var, vn0Var.getContext()));
            case 3:
                fi0 fi0Var = new fi0(viewGroup.getContext());
                fi0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.c1(fi0Var);
            case 4:
                hj1 hj1Var = (hj1) this.d;
                return new s4.c1(new dj1(hj1Var.E, hj1Var.f34173c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                e6 e6Var = jVar.f42506a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f42558c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, y5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f42556a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    wh.m(j6.G6, e6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, y5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f42557b = textView2;
                    wh.m(j6.f19445y6, e6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, y5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ?? view2 = new View(((y3) this.d).getContext());
                view2.f28360a = 0;
                return new s4.c1(view2);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        boolean z10;
        switch (this.f9866c) {
            case 2:
                vn0 vn0Var = (vn0) this.d;
                ArrayList arrayList = vn0Var.f29145r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    un0 un0Var = (un0) c1Var.f42929a;
                    if (((sn0) arrayList.get(b10)).f28200a.h == vn0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    un0Var.a(z10, false);
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
