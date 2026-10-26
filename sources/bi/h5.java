package bi;

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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.ei1;
import org.telegram.ui.qh0;
import org.telegram.ui.rh0;
public final class h5 extends lm0 {
    public final int f4724c;
    public final Object d;

    public h5(Object obj, int i10) {
        this.f4724c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        switch (this.f4724c) {
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
        int[] iArr = ((h7) this.d).S0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f4724c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((h7) obj).S0.length;
            case 1:
                return ((ig.r0) obj).f14220f3.size();
            case 2:
                return 1;
            case 3:
                return ((oo0) obj).f31341r.size();
            case 4:
                return ((rh0) obj).f43163c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.f37582g0;
                return 12;
            default:
                return ((tg.j) obj).d.size();
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f4724c) {
            case 2:
                return i10;
            case 6:
                return ((tg.h) ((tg.j) this.d).d.get(i10)).f48870a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        gr grVar;
        float f7;
        switch (this.f4724c) {
            case 0:
                int[] iArr = ((h7) this.d).S0;
                org.telegram.ui.Components.ta taVar = (org.telegram.ui.Components.ta) e1Var.f47738a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (taVar.f32949a != i11) {
                    taVar.f32949a = i11;
                    taVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((ig.q0) e1Var).v.setData((ig.p0) ((ig.r0) this.d).f14220f3.get(i10));
                return;
            case 2:
                return;
            case 3:
                View view = e1Var.f47738a;
                oo0 oo0Var = (oo0) this.d;
                ArrayList arrayList = oo0Var.f31341r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    lo0 lo0Var = (lo0) arrayList.get(i10);
                    no0 no0Var = (no0) view;
                    bh.x0 x0Var = no0Var.d;
                    boolean z11 = true;
                    if (x0Var != null && x0Var.equals(lo0Var.f30235a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = lo0Var.f30235a.g();
                        tL_reactionCount.count = lo0Var.f30236b;
                        oo0 oo0Var2 = no0Var.f31055s;
                        mo0 mo0Var = new mo0(no0Var, oo0Var2.f31336a, no0Var, tL_reactionCount, oo0Var2.f31338c);
                        no0Var.f31049a = mo0Var;
                        mo0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        mo0 mo0Var2 = no0Var.f31049a;
                        mo0Var2.f4183q = true;
                        mo0Var2.S = true;
                    } else {
                        no0Var.f31049a.f4188w = lo0Var.f30236b;
                    }
                    no0Var.d = lo0Var.f30235a;
                    if (!z10) {
                        mo0 mo0Var3 = no0Var.f31049a;
                        mo0Var3.f4171f = mo0Var3.A;
                    }
                    no0Var.f31049a.A = AndroidUtilities.dp(44.33f);
                    no0Var.f31049a.f4187u = !TextUtils.isEmpty(lo0Var.f30237c);
                    mo0 mo0Var4 = no0Var.f31049a;
                    boolean z12 = mo0Var4.f4187u;
                    org.telegram.ui.Components.r6 r6Var = mo0Var4.G;
                    if (z12) {
                        r6Var.t(Emoji.replaceEmoji(lo0Var.f30237c, r6Var.f32119a.getFontMetricsInt(), false), !z10, true);
                    } else if (r6Var != null) {
                        r6Var.t("", !z10, true);
                    }
                    mo0 mo0Var5 = no0Var.f31049a;
                    Integer.toString(lo0Var.f30236b);
                    mo0Var5.getClass();
                    no0Var.f31049a.F.c(lo0Var.f30236b, !z10);
                    mo0 mo0Var6 = no0Var.f31049a;
                    if (mo0Var6.F != null && (mo0Var6.f4188w > 0 || mo0Var6.f4187u)) {
                        float f10 = mo0Var6.A;
                        int ceil = (int) Math.ceil(grVar.f28692m);
                        if (no0Var.f31049a.f4187u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        mo0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + no0Var.f31049a.G.d + f10);
                    }
                    if (z10) {
                        mo0 mo0Var7 = no0Var.f31049a;
                        mo0Var7.f4171f = mo0Var7.A;
                    }
                    no0Var.f31049a.B = AndroidUtilities.dp(28.0f);
                    mo0 mo0Var8 = no0Var.f31049a;
                    mo0Var8.f4182p = no0Var.e;
                    if (no0Var.f31054r) {
                        mo0Var8.a();
                    }
                    if (!z10) {
                        no0Var.requestLayout();
                    }
                    no0 no0Var2 = (no0) view;
                    if (lo0Var.f30235a.h != oo0Var.h) {
                        z11 = false;
                    }
                    no0Var2.a(z11, false);
                    return;
                }
                return;
            case 4:
                rh0 rh0Var = (rh0) this.d;
                ((qh0) e1Var.f47738a).a((TLObject) rh0Var.f43163c.get(i10), false, ((Integer) rh0Var.f43162b.get(i10)).intValue());
                return;
            case 5:
                ((ai1) e1Var.f47738a).f37814a = WallpapersListActivity.f37584i0[i10];
                return;
            default:
                tg.j jVar = (tg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((tg.h) arrayList2.get(i10)).f48870a == 1) {
                    tg.i iVar = (tg.i) e1Var.f47738a;
                    iVar.f48876c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f48876c.setImageDrawable(jVar.getContext().getDrawable(((tg.h) arrayList2.get(i10)).f48871b));
                    iVar.f48874a.setText(((tg.h) arrayList2.get(i10)).f48872c);
                    iVar.f48875b.setText(((tg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f4724c) {
            case 0:
                ?? view2 = new View(((h7) this.d).getContext());
                view2.f32949a = 0;
                return new s4.e1(view2);
            case 1:
                ig.o0 o0Var = new ig.o0(viewGroup.getContext(), ((ig.r0) this.d).f30646n2);
                ?? e1Var = new s4.e1(o0Var);
                e1Var.v = o0Var;
                o0Var.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(30.0f)));
                return e1Var;
            case 2:
                return new s4.e1(((org.telegram.ui.Components.ua) this.d).X);
            case 3:
                oo0 oo0Var = (oo0) this.d;
                return new s4.e1(new no0(oo0Var, oo0Var.getContext()));
            case 4:
                qh0 qh0Var = new qh0(viewGroup.getContext());
                qh0Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.e1(qh0Var);
            case 5:
                ei1 ei1Var = (ei1) this.d;
                return new s4.e1(new ai1(ei1Var.E, ei1Var.f39117c));
            default:
                tg.j jVar = (tg.j) this.d;
                org.telegram.ui.ActionBar.u6 u6Var = jVar.f48818a;
                if (i10 == 0) {
                    view = new tg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.x3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f48876c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, gb1.h(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f48874a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
                    textView.setTextSize(1, 14.0f);
                    frameLayout.addView(textView, gb1.h(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f48875b = textView2;
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23748y6, u6Var);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout.addView(textView2, gb1.h(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return ic.a.n(view, view, -1, -2);
        }
    }

    @Override
    public void y(s4.e1 e1Var) {
        boolean z10;
        switch (this.f4724c) {
            case 3:
                oo0 oo0Var = (oo0) this.d;
                ArrayList arrayList = oo0Var.f31341r;
                int b10 = e1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    no0 no0Var = (no0) e1Var.f47738a;
                    if (((lo0) arrayList.get(b10)).f30235a.h == oo0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    no0Var.a(z10, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(s4.e1 e1Var, int i10) {
    }
}
