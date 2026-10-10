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
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.gi0;
import org.telegram.ui.hi0;
import org.telegram.ui.hj1;
import org.telegram.ui.lj1;
import w7.x5;
import yh.s3;
public final class m0 extends qm0 {
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
                return ((oo0) obj).f29539r.size();
            case 3:
                return ((hi0) obj).f38397c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f35805k0;
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
                return ((rg.h) ((rg.j) this.d).d.get(i10)).f47303a;
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
                View view = d1Var.f47702a;
                oo0 oo0Var = (oo0) this.d;
                ArrayList arrayList = oo0Var.f29539r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    lo0 lo0Var = (lo0) arrayList.get(i10);
                    no0 no0Var = (no0) view;
                    zg.n0 n0Var = no0Var.d;
                    boolean z11 = true;
                    if (n0Var != null && n0Var.equals(lo0Var.f28476a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = lo0Var.f28476a.g();
                        tL_reactionCount.count = lo0Var.f28477b;
                        oo0 oo0Var2 = no0Var.f29164s;
                        mo0 mo0Var = new mo0(no0Var, oo0Var2.f29533a, no0Var, tL_reactionCount, oo0Var2.f29535c);
                        no0Var.f29157a = mo0Var;
                        mo0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        mo0 mo0Var2 = no0Var.f29157a;
                        mo0Var2.f54645q = true;
                        mo0Var2.S = true;
                    } else {
                        no0Var.f29157a.f54650w = lo0Var.f28477b;
                    }
                    no0Var.d = lo0Var.f28476a;
                    if (!z10) {
                        mo0 mo0Var3 = no0Var.f29157a;
                        mo0Var3.f54633f = mo0Var3.A;
                    }
                    no0Var.f29157a.A = AndroidUtilities.dp(44.33f);
                    no0Var.f29157a.f54649u = !TextUtils.isEmpty(lo0Var.f28478c);
                    mo0 mo0Var4 = no0Var.f29157a;
                    boolean z12 = mo0Var4.f54649u;
                    q6 q6Var = mo0Var4.G;
                    if (z12) {
                        q6Var.t(Emoji.replaceEmoji(lo0Var.f28478c, q6Var.f30029a.getFontMetricsInt(), false), !z10, true);
                    } else if (q6Var != null) {
                        q6Var.t("", !z10, true);
                    }
                    mo0 mo0Var5 = no0Var.f29157a;
                    Integer.toString(lo0Var.f28477b);
                    mo0Var5.getClass();
                    no0Var.f29157a.F.c(lo0Var.f28477b, !z10);
                    mo0 mo0Var6 = no0Var.f29157a;
                    if (mo0Var6.F != null && (mo0Var6.f54650w > 0 || mo0Var6.f54649u)) {
                        float f10 = mo0Var6.A;
                        int ceil = (int) Math.ceil(lrVar.f28516m);
                        if (no0Var.f29157a.f54649u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        mo0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + no0Var.f29157a.G.d + f10);
                    }
                    if (z10) {
                        mo0 mo0Var7 = no0Var.f29157a;
                        mo0Var7.f54633f = mo0Var7.A;
                    }
                    no0Var.f29157a.B = AndroidUtilities.dp(28.0f);
                    mo0 mo0Var8 = no0Var.f29157a;
                    mo0Var8.f54644p = no0Var.f29160e;
                    if (no0Var.f29163r) {
                        mo0Var8.a();
                    }
                    if (!z10) {
                        no0Var.requestLayout();
                    }
                    no0 no0Var2 = (no0) view;
                    if (lo0Var.f28476a.h != oo0Var.h) {
                        z11 = false;
                    }
                    no0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                hi0 hi0Var = (hi0) this.d;
                ((gi0) d1Var.f47702a).a((TLObject) hi0Var.f38397c.get(i10), false, ((Integer) hi0Var.f38396b.get(i10)).intValue());
                return;
            case 4:
                ((hj1) d1Var.f47702a).f38409a = WallpapersListActivity.m0[i10];
                return;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).f47303a == 1) {
                    rg.i iVar = (rg.i) d1Var.f47702a;
                    iVar.f47309c.setColorFilter(new PorterDuffColorFilter(jVar.f47316e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f47309c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).f47304b));
                    iVar.f47307a.setText(((rg.h) arrayList2.get(i10)).f47305c);
                    iVar.f47308b.setText(((rg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((s3) this.d).Q0;
                wa waVar = (wa) d1Var.f47702a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (waVar.f32626a != i11) {
                    waVar.f32626a = i11;
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
                o0 o0Var = new o0(viewGroup.getContext(), ((r0) this.d).f30511n2);
                ?? d1Var = new s4.d1(o0Var);
                d1Var.v = o0Var;
                o0Var.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(30.0f)));
                return d1Var;
            case 1:
                return new s4.d1(((xa) this.d).X);
            case 2:
                oo0 oo0Var = (oo0) this.d;
                return new s4.d1(new no0(oo0Var, oo0Var.getContext()));
            case 3:
                gi0 gi0Var = new gi0(viewGroup.getContext());
                gi0Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.d1(gi0Var);
            case 4:
                lj1 lj1Var = (lj1) this.d;
                return new s4.d1(new hj1(lj1Var.E, lj1Var.f39655c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                e6 e6Var = jVar.f47245a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f47309c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, x5.a(28.0f, 25.0f, 12.0f, 16.0f, 0.0f, 28, 0));
                    TextView textView = new TextView(context);
                    frameLayout.f47307a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    bi.o(i6.G6, e6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, x5.a(-2.0f, 68.0f, 8.0f, 16.0f, 0.0f, -1, 0));
                    TextView textView2 = new TextView(context);
                    frameLayout.f47308b = textView2;
                    bi.o(i6.f21185y6, e6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, x5.a(-2.0f, 68.0f, 28.0f, 16.0f, 8.0f, -1, 0));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ?? view2 = new View(((s3) this.d).getContext());
                view2.f32626a = 0;
                return new s4.d1(view2);
        }
    }

    @Override
    public void y(s4.d1 d1Var) {
        boolean z10;
        switch (this.f10727c) {
            case 2:
                oo0 oo0Var = (oo0) this.d;
                ArrayList arrayList = oo0Var.f29539r;
                int b10 = d1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    no0 no0Var = (no0) d1Var.f47702a;
                    if (((lo0) arrayList.get(b10)).f28476a.h == oo0Var.h) {
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

    private final void E(s4.d1 d1Var, int i10) {
    }
}
