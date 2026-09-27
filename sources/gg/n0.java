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
import org.telegram.messenger.qk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bi0;
import org.telegram.ui.ci0;
import org.telegram.ui.vi1;
import org.telegram.ui.zi1;
import w7.y5;
import yh.x3;
public final class n0 extends xl0 {
    public final int f9854c;
    public final Object d;

    public n0(Object obj, int i10) {
        this.f9854c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f9854c) {
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
        int i10 = this.f9854c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((s0) obj).X2.size();
            case 1:
                return 1;
            case 2:
                return ((wn0) obj).f30123r.size();
            case 3:
                return ((ci0) obj).f32728c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f31906i0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((x3) obj).P0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f9854c) {
            case 1:
                return i10;
            case 5:
                return ((rg.h) ((rg.j) this.d).d.get(i10)).f42626a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        xq xqVar;
        float f7;
        switch (this.f9854c) {
            case 0:
                ((r0) c1Var).v.setData((q0) ((s0) this.d).X2.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = c1Var.f43005a;
                wn0 wn0Var = (wn0) this.d;
                ArrayList arrayList = wn0Var.f30123r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    tn0 tn0Var = (tn0) arrayList.get(i10);
                    vn0 vn0Var = (vn0) view;
                    zg.p0 p0Var = vn0Var.d;
                    boolean z11 = true;
                    if (p0Var != null && p0Var.equals(tn0Var.f28639a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = tn0Var.f28639a.g();
                        tL_reactionCount.count = tn0Var.f28640b;
                        wn0 wn0Var2 = vn0Var.f29187s;
                        un0 un0Var = new un0(vn0Var, wn0Var2.f30118a, vn0Var, tL_reactionCount, wn0Var2.f30120c);
                        vn0Var.f29181a = un0Var;
                        un0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        un0 un0Var2 = vn0Var.f29181a;
                        un0Var2.f49430q = true;
                        un0Var2.S = true;
                    } else {
                        vn0Var.f29181a.f49435w = tn0Var.f28640b;
                    }
                    vn0Var.d = tn0Var.f28639a;
                    if (!z10) {
                        un0 un0Var3 = vn0Var.f29181a;
                        un0Var3.f49418f = un0Var3.A;
                    }
                    vn0Var.f29181a.A = AndroidUtilities.dp(44.33f);
                    vn0Var.f29181a.f49434u = !TextUtils.isEmpty(tn0Var.f28641c);
                    un0 un0Var4 = vn0Var.f29181a;
                    boolean z12 = un0Var4.f49434u;
                    o6 o6Var = un0Var4.G;
                    if (z12) {
                        o6Var.q(Emoji.replaceEmoji(tn0Var.f28641c, o6Var.f26982a.getFontMetricsInt(), false), !z10, true);
                    } else if (o6Var != null) {
                        o6Var.q("", !z10, true);
                    }
                    un0 un0Var5 = vn0Var.f29181a;
                    Integer.toString(tn0Var.f28640b);
                    un0Var5.getClass();
                    vn0Var.f29181a.F.c(tn0Var.f28640b, !z10);
                    un0 un0Var6 = vn0Var.f29181a;
                    if (un0Var6.F != null && (un0Var6.f49435w > 0 || un0Var6.f49434u)) {
                        float f10 = un0Var6.A;
                        int ceil = (int) Math.ceil(xqVar.f30460m);
                        if (vn0Var.f29181a.f49434u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        un0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + vn0Var.f29181a.G.d + f10);
                    }
                    if (z10) {
                        un0 un0Var7 = vn0Var.f29181a;
                        un0Var7.f49418f = un0Var7.A;
                    }
                    vn0Var.f29181a.B = AndroidUtilities.dp(28.0f);
                    un0 un0Var8 = vn0Var.f29181a;
                    un0Var8.f49429p = vn0Var.e;
                    if (vn0Var.f29186r) {
                        un0Var8.a();
                    }
                    if (!z10) {
                        vn0Var.requestLayout();
                    }
                    vn0 vn0Var2 = (vn0) view;
                    if (tn0Var.f28639a.h != wn0Var.h) {
                        z11 = false;
                    }
                    vn0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                ci0 ci0Var = (ci0) this.d;
                ((bi0) c1Var.f43005a).a((TLObject) ci0Var.f32728c.get(i10), false, ((Integer) ci0Var.f32727b.get(i10)).intValue());
                return;
            case 4:
                ((vi1) c1Var.f43005a).f38621a = WallpapersListActivity.f31908k0[i10];
                return;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).f42626a == 1) {
                    rg.i iVar = (rg.i) c1Var.f43005a;
                    iVar.f42633c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f42633c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).f42627b));
                    iVar.f42631a.setText(((rg.h) arrayList2.get(i10)).f42628c);
                    iVar.f42632b.setText(((rg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((x3) this.d).P0;
                ta taVar = (ta) c1Var.f43005a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (taVar.f28540a != i11) {
                    taVar.f28540a = i11;
                    taVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f9854c) {
            case 0:
                p0 p0Var = new p0(viewGroup.getContext(), ((s0) this.d).f30709p2);
                ?? c1Var = new s4.c1(p0Var);
                c1Var.v = p0Var;
                p0Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(30.0f)));
                return c1Var;
            case 1:
                return new s4.c1(((ua) this.d).X);
            case 2:
                wn0 wn0Var = (wn0) this.d;
                return new s4.c1(new vn0(wn0Var, wn0Var.getContext()));
            case 3:
                bi0 bi0Var = new bi0(viewGroup.getContext());
                bi0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.c1(bi0Var);
            case 4:
                zi1 zi1Var = (zi1) this.d;
                return new s4.c1(new vi1(zi1Var.E, zi1Var.f40536c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                e6 e6Var = jVar.f42581a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f42633c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, y5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f42631a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    qk.n(i6.G6, e6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, y5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f42632b = textView2;
                    qk.n(i6.f19442y6, e6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, y5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ?? view2 = new View(((x3) this.d).getContext());
                view2.f28540a = 0;
                return new s4.c1(view2);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        boolean z10;
        switch (this.f9854c) {
            case 2:
                wn0 wn0Var = (wn0) this.d;
                ArrayList arrayList = wn0Var.f30123r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    vn0 vn0Var = (vn0) c1Var.f43005a;
                    if (((tn0) arrayList.get(b10)).f28639a.h == wn0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vn0Var.a(z10, false);
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
