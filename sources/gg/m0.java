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
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.wa;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.fi0;
import org.telegram.ui.fj1;
import org.telegram.ui.gi0;
import org.telegram.ui.jj1;
import w7.x5;
import yh.s3;
public final class m0 extends rm0 {
    public final int f10726c;
    public final Object d;

    public m0(Object obj, int i10) {
        this.f10726c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        switch (this.f10726c) {
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
        int i10 = this.f10726c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((r0) obj).V2.size();
            case 1:
                return 1;
            case 2:
                return ((po0) obj).f29786r.size();
            case 3:
                return ((gi0) obj).f38100c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f35798k0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((s3) obj).Q0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f10726c) {
            case 1:
                return i10;
            case 5:
                return ((rg.h) ((rg.j) this.d).d.get(i10)).f47349a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        lr lrVar;
        float f7;
        switch (this.f10726c) {
            case 0:
                ((q0) d1Var).v.setData((p0) ((r0) this.d).V2.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = d1Var.f47748a;
                po0 po0Var = (po0) this.d;
                ArrayList arrayList = po0Var.f29786r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    mo0 mo0Var = (mo0) arrayList.get(i10);
                    oo0 oo0Var = (oo0) view;
                    zg.n0 n0Var = oo0Var.d;
                    boolean z11 = true;
                    if (n0Var != null && n0Var.equals(mo0Var.f28810a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = mo0Var.f28810a.g();
                        tL_reactionCount.count = mo0Var.f28811b;
                        po0 po0Var2 = oo0Var.f29445s;
                        no0 no0Var = new no0(oo0Var, po0Var2.f29780a, oo0Var, tL_reactionCount, po0Var2.f29782c);
                        oo0Var.f29438a = no0Var;
                        no0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        no0 no0Var2 = oo0Var.f29438a;
                        no0Var2.f54688q = true;
                        no0Var2.S = true;
                    } else {
                        oo0Var.f29438a.f54693w = mo0Var.f28811b;
                    }
                    oo0Var.d = mo0Var.f28810a;
                    if (!z10) {
                        no0 no0Var3 = oo0Var.f29438a;
                        no0Var3.f54676f = no0Var3.A;
                    }
                    oo0Var.f29438a.A = AndroidUtilities.dp(44.33f);
                    oo0Var.f29438a.f54692u = !TextUtils.isEmpty(mo0Var.f28812c);
                    no0 no0Var4 = oo0Var.f29438a;
                    boolean z12 = no0Var4.f54692u;
                    q6 q6Var = no0Var4.G;
                    if (z12) {
                        q6Var.t(Emoji.replaceEmoji(mo0Var.f28812c, q6Var.f30017a.getFontMetricsInt(), false), !z10, true);
                    } else if (q6Var != null) {
                        q6Var.t("", !z10, true);
                    }
                    no0 no0Var5 = oo0Var.f29438a;
                    Integer.toString(mo0Var.f28811b);
                    no0Var5.getClass();
                    oo0Var.f29438a.F.c(mo0Var.f28811b, !z10);
                    no0 no0Var6 = oo0Var.f29438a;
                    if (no0Var6.F != null && (no0Var6.f54693w > 0 || no0Var6.f54692u)) {
                        float f10 = no0Var6.A;
                        int ceil = (int) Math.ceil(lrVar.f28430m);
                        if (oo0Var.f29438a.f54692u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        no0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + oo0Var.f29438a.G.d + f10);
                    }
                    if (z10) {
                        no0 no0Var7 = oo0Var.f29438a;
                        no0Var7.f54676f = no0Var7.A;
                    }
                    oo0Var.f29438a.B = AndroidUtilities.dp(28.0f);
                    no0 no0Var8 = oo0Var.f29438a;
                    no0Var8.f54687p = oo0Var.f29441e;
                    if (oo0Var.f29444r) {
                        no0Var8.a();
                    }
                    if (!z10) {
                        oo0Var.requestLayout();
                    }
                    oo0 oo0Var2 = (oo0) view;
                    if (mo0Var.f28810a.h != po0Var.h) {
                        z11 = false;
                    }
                    oo0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                gi0 gi0Var = (gi0) this.d;
                ((fi0) d1Var.f47748a).a((TLObject) gi0Var.f38100c.get(i10), false, ((Integer) gi0Var.f38099b.get(i10)).intValue());
                return;
            case 4:
                ((fj1) d1Var.f47748a).f37697a = WallpapersListActivity.m0[i10];
                return;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).f47349a == 1) {
                    rg.i iVar = (rg.i) d1Var.f47748a;
                    iVar.f47355c.setColorFilter(new PorterDuffColorFilter(jVar.f47362e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f47355c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).f47350b));
                    iVar.f47353a.setText(((rg.h) arrayList2.get(i10)).f47351c);
                    iVar.f47354b.setText(((rg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((s3) this.d).Q0;
                va vaVar = (va) d1Var.f47748a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (vaVar.f31711a != i11) {
                    vaVar.f31711a = i11;
                    vaVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f10726c) {
            case 0:
                o0 o0Var = new o0(viewGroup.getContext(), ((r0) this.d).f30807n2);
                ?? d1Var = new s4.d1(o0Var);
                d1Var.v = o0Var;
                o0Var.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(30.0f)));
                return d1Var;
            case 1:
                return new s4.d1(((wa) this.d).X);
            case 2:
                po0 po0Var = (po0) this.d;
                return new s4.d1(new oo0(po0Var, po0Var.getContext()));
            case 3:
                fi0 fi0Var = new fi0(viewGroup.getContext());
                fi0Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.d1(fi0Var);
            case 4:
                jj1 jj1Var = (jj1) this.d;
                return new s4.d1(new fj1(jj1Var.E, jj1Var.f39070c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                d6 d6Var = jVar.f47291a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f47355c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, x5.a(28.0f, 25.0f, 12.0f, 16.0f, 0.0f, 28, 0));
                    TextView textView = new TextView(context);
                    frameLayout.f47353a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    ai.o(h6.G6, d6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, x5.a(-2.0f, 68.0f, 8.0f, 16.0f, 0.0f, -1, 0));
                    TextView textView2 = new TextView(context);
                    frameLayout.f47354b = textView2;
                    ai.o(h6.f21171y6, d6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, x5.a(-2.0f, 68.0f, 28.0f, 16.0f, 8.0f, -1, 0));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ?? view2 = new View(((s3) this.d).getContext());
                view2.f31711a = 0;
                return new s4.d1(view2);
        }
    }

    @Override
    public void y(s4.d1 d1Var) {
        boolean z10;
        switch (this.f10726c) {
            case 2:
                po0 po0Var = (po0) this.d;
                ArrayList arrayList = po0Var.f29786r;
                int b10 = d1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    oo0 oo0Var = (oo0) d1Var.f47748a;
                    if (((mo0) arrayList.get(b10)).f28810a.h == po0Var.h) {
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

    private final void E(s4.d1 d1Var, int i10) {
    }
}
