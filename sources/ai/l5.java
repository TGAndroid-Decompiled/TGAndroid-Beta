package ai;

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
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.rh0;
import org.telegram.ui.sh0;
import org.telegram.ui.th1;
import org.telegram.ui.xh1;
public final class l5 extends hm0 {
    public final int f1770c;
    public final Object d;

    public l5(Object obj, int i10) {
        this.f1770c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        switch (this.f1770c) {
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
        int[] iArr = ((k7) this.d).S0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f1770c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((k7) obj).S0.length;
            case 1:
                return ((hg.q0) obj).V2.size();
            case 2:
                return 1;
            case 3:
                return ((fo0) obj).f26325r.size();
            case 4:
                return ((sh0) obj).f41111c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.f35223k0;
                return 12;
            default:
                return ((sg.j) obj).d.size();
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f1770c) {
            case 2:
                return i10;
            case 6:
                return ((sg.h) ((sg.j) this.d).d.get(i10)).f46263a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        fr frVar;
        float f7;
        switch (this.f1770c) {
            case 0:
                int[] iArr = ((k7) this.d).S0;
                org.telegram.ui.Components.ta taVar = (org.telegram.ui.Components.ta) b1Var.f45938a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (taVar.f30499a != i11) {
                    taVar.f30499a = i11;
                    taVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((hg.p0) b1Var).v.setData((hg.o0) ((hg.q0) this.d).V2.get(i10));
                return;
            case 2:
                return;
            case 3:
                View view = b1Var.f45938a;
                fo0 fo0Var = (fo0) this.d;
                ArrayList arrayList = fo0Var.f26325r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    co0 co0Var = (co0) arrayList.get(i10);
                    eo0 eo0Var = (eo0) view;
                    ah.i1 i1Var = eo0Var.d;
                    boolean z11 = true;
                    if (i1Var != null && i1Var.equals(co0Var.f25313a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = co0Var.f25313a.g();
                        tL_reactionCount.count = co0Var.f25314b;
                        fo0 fo0Var2 = eo0Var.f25969s;
                        do0 do0Var = new do0(eo0Var, fo0Var2.f26320a, eo0Var, tL_reactionCount, fo0Var2.f26322c);
                        eo0Var.f25963a = do0Var;
                        do0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        do0 do0Var2 = eo0Var.f25963a;
                        do0Var2.f762q = true;
                        do0Var2.S = true;
                    } else {
                        eo0Var.f25963a.f767w = co0Var.f25314b;
                    }
                    eo0Var.d = co0Var.f25313a;
                    if (!z10) {
                        do0 do0Var3 = eo0Var.f25963a;
                        do0Var3.f750f = do0Var3.A;
                    }
                    eo0Var.f25963a.A = AndroidUtilities.dp(44.33f);
                    eo0Var.f25963a.f766u = !TextUtils.isEmpty(co0Var.f25315c);
                    do0 do0Var4 = eo0Var.f25963a;
                    boolean z12 = do0Var4.f766u;
                    org.telegram.ui.Components.p6 p6Var = do0Var4.G;
                    if (z12) {
                        p6Var.t(Emoji.replaceEmoji(co0Var.f25315c, p6Var.f29190a.getFontMetricsInt(), false), !z10, true);
                    } else if (p6Var != null) {
                        p6Var.t("", !z10, true);
                    }
                    do0 do0Var5 = eo0Var.f25963a;
                    Integer.toString(co0Var.f25314b);
                    do0Var5.getClass();
                    eo0Var.f25963a.F.c(co0Var.f25314b, !z10);
                    do0 do0Var6 = eo0Var.f25963a;
                    if (do0Var6.F != null && (do0Var6.f767w > 0 || do0Var6.f766u)) {
                        float f10 = do0Var6.A;
                        int ceil = (int) Math.ceil(frVar.f26363m);
                        if (eo0Var.f25963a.f766u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        do0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + eo0Var.f25963a.G.d + f10);
                    }
                    if (z10) {
                        do0 do0Var7 = eo0Var.f25963a;
                        do0Var7.f750f = do0Var7.A;
                    }
                    eo0Var.f25963a.B = AndroidUtilities.dp(28.0f);
                    do0 do0Var8 = eo0Var.f25963a;
                    do0Var8.f761p = eo0Var.e;
                    if (eo0Var.f25968r) {
                        do0Var8.a();
                    }
                    if (!z10) {
                        eo0Var.requestLayout();
                    }
                    eo0 eo0Var2 = (eo0) view;
                    if (co0Var.f25313a.h != fo0Var.h) {
                        z11 = false;
                    }
                    eo0Var2.a(z11, false);
                    return;
                }
                return;
            case 4:
                sh0 sh0Var = (sh0) this.d;
                ((rh0) b1Var.f45938a).a((TLObject) sh0Var.f41111c.get(i10), false, ((Integer) sh0Var.f41110b.get(i10)).intValue());
                return;
            case 5:
                ((th1) b1Var.f45938a).f41755a = WallpapersListActivity.m0[i10];
                return;
            default:
                sg.j jVar = (sg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((sg.h) arrayList2.get(i10)).f46263a == 1) {
                    sg.i iVar = (sg.i) b1Var.f45938a;
                    iVar.f46271c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f46271c.setImageDrawable(jVar.getContext().getDrawable(((sg.h) arrayList2.get(i10)).f46264b));
                    iVar.f46269a.setText(((sg.h) arrayList2.get(i10)).f46265c);
                    iVar.f46270b.setText(((sg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f1770c) {
            case 0:
                ?? view2 = new View(((k7) this.d).getContext());
                view2.f30499a = 0;
                return new s4.b1(view2);
            case 1:
                hg.n0 n0Var = new hg.n0(viewGroup.getContext(), ((hg.q0) this.d).f27284n2);
                ?? b1Var = new s4.b1(n0Var);
                b1Var.v = n0Var;
                n0Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(30.0f)));
                return b1Var;
            case 2:
                return new s4.b1(((org.telegram.ui.Components.ua) this.d).X);
            case 3:
                fo0 fo0Var = (fo0) this.d;
                return new s4.b1(new eo0(fo0Var, fo0Var.getContext()));
            case 4:
                rh0 rh0Var = new rh0(viewGroup.getContext());
                rh0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.b1(rh0Var);
            case 5:
                xh1 xh1Var = (xh1) this.d;
                return new s4.b1(new th1(xh1Var.E, xh1Var.f43142c));
            default:
                sg.j jVar = (sg.j) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = jVar.f46218a;
                if (i10 == 0) {
                    view = new sg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.s3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f46271c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, w7.z5.a(28.0f, 25.0f, 12.0f, 16.0f, 0.0f, 28, 0));
                    TextView textView = new TextView(context);
                    frameLayout.f46269a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    wh.o(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, w7.z5.a(-2.0f, 68.0f, 8.0f, 16.0f, 0.0f, -1, 0));
                    TextView textView2 = new TextView(context);
                    frameLayout.f46270b = textView2;
                    wh.o(org.telegram.ui.ActionBar.h6.f21374y6, d6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, w7.z5.a(-2.0f, 68.0f, 28.0f, 16.0f, 8.0f, -1, 0));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.cast.a6.l(view, view, -1, -2);
        }
    }

    @Override
    public void y(s4.b1 b1Var) {
        boolean z10;
        switch (this.f1770c) {
            case 3:
                fo0 fo0Var = (fo0) this.d;
                ArrayList arrayList = fo0Var.f26325r;
                int b10 = b1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    eo0 eo0Var = (eo0) b1Var.f45938a;
                    if (((co0) arrayList.get(b10)).f25313a.h == fo0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    eo0Var.a(z10, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(s4.b1 b1Var, int i10) {
    }
}
