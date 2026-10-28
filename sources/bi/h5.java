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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.po0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ci1;
import org.telegram.ui.gi1;
import org.telegram.ui.sh0;
import org.telegram.ui.th0;
public final class h5 extends mm0 {
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
                return ((ig.r0) obj).f14219f3.size();
            case 2:
                return 1;
            case 3:
                return ((po0) obj).f31688r.size();
            case 4:
                return ((th0) obj).f43648c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.f37606g0;
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
                return ((tg.h) ((tg.j) this.d).d.get(i10)).f48905a;
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
                org.telegram.ui.Components.ta taVar = (org.telegram.ui.Components.ta) e1Var.f47773a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (taVar.f32921a != i11) {
                    taVar.f32921a = i11;
                    taVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((ig.q0) e1Var).v.setData((ig.p0) ((ig.r0) this.d).f14219f3.get(i10));
                return;
            case 2:
                return;
            case 3:
                View view = e1Var.f47773a;
                po0 po0Var = (po0) this.d;
                ArrayList arrayList = po0Var.f31688r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    mo0 mo0Var = (mo0) arrayList.get(i10);
                    oo0 oo0Var = (oo0) view;
                    bh.x0 x0Var = oo0Var.d;
                    boolean z11 = true;
                    if (x0Var != null && x0Var.equals(mo0Var.f30567a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = mo0Var.f30567a.g();
                        tL_reactionCount.count = mo0Var.f30568b;
                        po0 po0Var2 = oo0Var.f31357s;
                        no0 no0Var = new no0(oo0Var, po0Var2.f31683a, oo0Var, tL_reactionCount, po0Var2.f31685c);
                        oo0Var.f31351a = no0Var;
                        no0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        no0 no0Var2 = oo0Var.f31351a;
                        no0Var2.f4183q = true;
                        no0Var2.S = true;
                    } else {
                        oo0Var.f31351a.f4188w = mo0Var.f30568b;
                    }
                    oo0Var.d = mo0Var.f30567a;
                    if (!z10) {
                        no0 no0Var3 = oo0Var.f31351a;
                        no0Var3.f4171f = no0Var3.A;
                    }
                    oo0Var.f31351a.A = AndroidUtilities.dp(44.33f);
                    oo0Var.f31351a.f4187u = !TextUtils.isEmpty(mo0Var.f30569c);
                    no0 no0Var4 = oo0Var.f31351a;
                    boolean z12 = no0Var4.f4187u;
                    org.telegram.ui.Components.r6 r6Var = no0Var4.G;
                    if (z12) {
                        r6Var.t(Emoji.replaceEmoji(mo0Var.f30569c, r6Var.f32140a.getFontMetricsInt(), false), !z10, true);
                    } else if (r6Var != null) {
                        r6Var.t("", !z10, true);
                    }
                    no0 no0Var5 = oo0Var.f31351a;
                    Integer.toString(mo0Var.f30568b);
                    no0Var5.getClass();
                    oo0Var.f31351a.F.c(mo0Var.f30568b, !z10);
                    no0 no0Var6 = oo0Var.f31351a;
                    if (no0Var6.F != null && (no0Var6.f4188w > 0 || no0Var6.f4187u)) {
                        float f10 = no0Var6.A;
                        int ceil = (int) Math.ceil(grVar.f28730m);
                        if (oo0Var.f31351a.f4187u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        no0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + oo0Var.f31351a.G.d + f10);
                    }
                    if (z10) {
                        no0 no0Var7 = oo0Var.f31351a;
                        no0Var7.f4171f = no0Var7.A;
                    }
                    oo0Var.f31351a.B = AndroidUtilities.dp(28.0f);
                    no0 no0Var8 = oo0Var.f31351a;
                    no0Var8.f4182p = oo0Var.e;
                    if (oo0Var.f31356r) {
                        no0Var8.a();
                    }
                    if (!z10) {
                        oo0Var.requestLayout();
                    }
                    oo0 oo0Var2 = (oo0) view;
                    if (mo0Var.f30567a.h != po0Var.h) {
                        z11 = false;
                    }
                    oo0Var2.a(z11, false);
                    return;
                }
                return;
            case 4:
                th0 th0Var = (th0) this.d;
                ((sh0) e1Var.f47773a).a((TLObject) th0Var.f43648c.get(i10), false, ((Integer) th0Var.f43647b.get(i10)).intValue());
                return;
            case 5:
                ((ci1) e1Var.f47773a).f38371a = WallpapersListActivity.f37608i0[i10];
                return;
            default:
                tg.j jVar = (tg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((tg.h) arrayList2.get(i10)).f48905a == 1) {
                    tg.i iVar = (tg.i) e1Var.f47773a;
                    iVar.f48911c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f48911c.setImageDrawable(jVar.getContext().getDrawable(((tg.h) arrayList2.get(i10)).f48906b));
                    iVar.f48909a.setText(((tg.h) arrayList2.get(i10)).f48907c);
                    iVar.f48910b.setText(((tg.h) arrayList2.get(i10)).d);
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
                view2.f32921a = 0;
                return new s4.e1(view2);
            case 1:
                ig.o0 o0Var = new ig.o0(viewGroup.getContext(), ((ig.r0) this.d).f30988n2);
                ?? e1Var = new s4.e1(o0Var);
                e1Var.v = o0Var;
                o0Var.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(30.0f)));
                return e1Var;
            case 2:
                return new s4.e1(((org.telegram.ui.Components.ua) this.d).X);
            case 3:
                po0 po0Var = (po0) this.d;
                return new s4.e1(new oo0(po0Var, po0Var.getContext()));
            case 4:
                sh0 sh0Var = new sh0(viewGroup.getContext());
                sh0Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.e1(sh0Var);
            case 5:
                gi1 gi1Var = (gi1) this.d;
                return new s4.e1(new ci1(gi1Var.E, gi1Var.f39628c));
            default:
                tg.j jVar = (tg.j) this.d;
                org.telegram.ui.ActionBar.u6 u6Var = jVar.f48853a;
                if (i10 == 0) {
                    view = new tg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.x3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f48911c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, kb1.h(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f48909a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
                    textView.setTextSize(1, 14.0f);
                    frameLayout.addView(textView, kb1.h(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f48910b = textView2;
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23749y6, u6Var);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout.addView(textView2, kb1.h(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
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
                po0 po0Var = (po0) this.d;
                ArrayList arrayList = po0Var.f31688r;
                int b10 = e1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    oo0 oo0Var = (oo0) e1Var.f47773a;
                    if (((mo0) arrayList.get(b10)).f30567a.h == po0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    oo0Var.a(z10, false);
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
