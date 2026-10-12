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
import org.telegram.messenger.am;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.wa;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.hi0;
import org.telegram.ui.ii0;
import org.telegram.ui.ij1;
import org.telegram.ui.mj1;
import w7.w5;
import yh.s3;
public final class m0 extends vm0 {
    public final int f10725c;
    public final Object d;

    public m0(Object obj, int i10) {
        this.f10725c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        switch (this.f10725c) {
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
        int i10 = this.f10725c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((r0) obj).V2.size();
            case 1:
                return 1;
            case 2:
                return ((to0) obj).f30911r.size();
            case 3:
                return ((ii0) obj).f38915c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f35608k0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((s3) obj).Q0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f10725c) {
            case 1:
                return i10;
            case 5:
                return ((rg.h) ((rg.j) this.d).d.get(i10)).f47473a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        nr nrVar;
        float f7;
        switch (this.f10725c) {
            case 0:
                ((q0) d1Var).v.setData((p0) ((r0) this.d).V2.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = d1Var.f47889a;
                to0 to0Var = (to0) this.d;
                ArrayList arrayList = to0Var.f30911r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    qo0 qo0Var = (qo0) arrayList.get(i10);
                    so0 so0Var = (so0) view;
                    zg.n0 n0Var = so0Var.d;
                    boolean z11 = true;
                    if (n0Var != null && n0Var.equals(qo0Var.f29873a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = qo0Var.f29873a.g();
                        tL_reactionCount.count = qo0Var.f29874b;
                        to0 to0Var2 = so0Var.f30605s;
                        ro0 ro0Var = new ro0(so0Var, to0Var2.f30905a, so0Var, tL_reactionCount, to0Var2.f30907c);
                        so0Var.f30598a = ro0Var;
                        ro0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        ro0 ro0Var2 = so0Var.f30598a;
                        ro0Var2.f54825q = true;
                        ro0Var2.S = true;
                    } else {
                        so0Var.f30598a.f54830w = qo0Var.f29874b;
                    }
                    so0Var.d = qo0Var.f29873a;
                    if (!z10) {
                        ro0 ro0Var3 = so0Var.f30598a;
                        ro0Var3.f54813f = ro0Var3.A;
                    }
                    so0Var.f30598a.A = AndroidUtilities.dp(44.33f);
                    so0Var.f30598a.f54829u = !TextUtils.isEmpty(qo0Var.f29875c);
                    ro0 ro0Var4 = so0Var.f30598a;
                    boolean z12 = ro0Var4.f54829u;
                    q6 q6Var = ro0Var4.G;
                    if (z12) {
                        q6Var.t(Emoji.replaceEmoji(qo0Var.f29875c, q6Var.f29710a.getFontMetricsInt(), false), !z10, true);
                    } else if (q6Var != null) {
                        q6Var.t("", !z10, true);
                    }
                    ro0 ro0Var5 = so0Var.f30598a;
                    Integer.toString(qo0Var.f29874b);
                    ro0Var5.getClass();
                    so0Var.f30598a.F.c(qo0Var.f29874b, !z10);
                    ro0 ro0Var6 = so0Var.f30598a;
                    if (ro0Var6.F != null && (ro0Var6.f54830w > 0 || ro0Var6.f54829u)) {
                        float f10 = ro0Var6.A;
                        int ceil = (int) Math.ceil(nrVar.f28935m);
                        if (so0Var.f30598a.f54829u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        ro0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + so0Var.f30598a.G.d + f10);
                    }
                    if (z10) {
                        ro0 ro0Var7 = so0Var.f30598a;
                        ro0Var7.f54813f = ro0Var7.A;
                    }
                    so0Var.f30598a.B = AndroidUtilities.dp(28.0f);
                    ro0 ro0Var8 = so0Var.f30598a;
                    ro0Var8.f54824p = so0Var.f30601e;
                    if (so0Var.f30604r) {
                        ro0Var8.a();
                    }
                    if (!z10) {
                        so0Var.requestLayout();
                    }
                    so0 so0Var2 = (so0) view;
                    if (qo0Var.f29873a.h != to0Var.h) {
                        z11 = false;
                    }
                    so0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                ii0 ii0Var = (ii0) this.d;
                ((hi0) d1Var.f47889a).a((TLObject) ii0Var.f38915c.get(i10), false, ((Integer) ii0Var.f38914b.get(i10)).intValue());
                return;
            case 4:
                ((ij1) d1Var.f47889a).f38928a = WallpapersListActivity.m0[i10];
                return;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).f47473a == 1) {
                    rg.i iVar = (rg.i) d1Var.f47889a;
                    iVar.f47479c.setColorFilter(new PorterDuffColorFilter(jVar.f47486e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f47479c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).f47474b));
                    iVar.f47477a.setText(((rg.h) arrayList2.get(i10)).f47475c);
                    iVar.f47478b.setText(((rg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((s3) this.d).Q0;
                va vaVar = (va) d1Var.f47889a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (vaVar.f31476a != i11) {
                    vaVar.f31476a = i11;
                    vaVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f10725c) {
            case 0:
                o0 o0Var = new o0(viewGroup.getContext(), ((r0) this.d).f32467n2);
                ?? d1Var = new s4.d1(o0Var);
                d1Var.v = o0Var;
                o0Var.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(30.0f)));
                return d1Var;
            case 1:
                return new s4.d1(((wa) this.d).X);
            case 2:
                to0 to0Var = (to0) this.d;
                return new s4.d1(new so0(to0Var, to0Var.getContext()));
            case 3:
                hi0 hi0Var = new hi0(viewGroup.getContext());
                hi0Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.d1(hi0Var);
            case 4:
                mj1 mj1Var = (mj1) this.d;
                return new s4.d1(new ij1(mj1Var.E, mj1Var.f40074c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                c6 c6Var = jVar.f47415a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f47479c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, w5.a(28.0f, 25.0f, 12.0f, 16.0f, 0.0f, 28, 0));
                    TextView textView = new TextView(context);
                    frameLayout.f47477a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    am.o(h6.G6, c6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, w5.a(-2.0f, 68.0f, 8.0f, 16.0f, 0.0f, -1, 0));
                    TextView textView2 = new TextView(context);
                    frameLayout.f47478b = textView2;
                    am.o(h6.f20945y6, c6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, w5.a(-2.0f, 68.0f, 28.0f, 16.0f, 8.0f, -1, 0));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ?? view2 = new View(((s3) this.d).getContext());
                view2.f31476a = 0;
                return new s4.d1(view2);
        }
    }

    @Override
    public void y(s4.d1 d1Var) {
        boolean z10;
        switch (this.f10725c) {
            case 2:
                to0 to0Var = (to0) this.d;
                ArrayList arrayList = to0Var.f30911r;
                int b10 = d1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    so0 so0Var = (so0) d1Var.f47889a;
                    if (((qo0) arrayList.get(b10)).f29873a.h == to0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    so0Var.a(z10, false);
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
