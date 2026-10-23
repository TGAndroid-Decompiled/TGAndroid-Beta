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
import org.telegram.messenger.nk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ph0;
import org.telegram.ui.qh0;
import org.telegram.ui.rh1;
import org.telegram.ui.vh1;
public final class m5 extends im0 {
    public final int f1816c;
    public final Object d;

    public m5(Object obj, int i10) {
        this.f1816c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        switch (this.f1816c) {
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
        int[] iArr = ((l7) this.d).S0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f1816c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((l7) obj).S0.length;
            case 1:
                return ((hg.q0) obj).V2.size();
            case 2:
                return 1;
            case 3:
                return ((go0) obj).f26623r.size();
            case 4:
                return ((qh0) obj).f40583c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.f35211k0;
                return 12;
            default:
                return ((sg.j) obj).d.size();
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f1816c) {
            case 2:
                return i10;
            case 6:
                return ((sg.h) ((sg.j) this.d).d.get(i10)).f46268a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        fr frVar;
        float f7;
        switch (this.f1816c) {
            case 0:
                int[] iArr = ((l7) this.d).S0;
                org.telegram.ui.Components.ta taVar = (org.telegram.ui.Components.ta) b1Var.f45921a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (taVar.f30487a != i11) {
                    taVar.f30487a = i11;
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
                View view = b1Var.f45921a;
                go0 go0Var = (go0) this.d;
                ArrayList arrayList = go0Var.f26623r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    do0 do0Var = (do0) arrayList.get(i10);
                    fo0 fo0Var = (fo0) view;
                    ah.i1 i1Var = fo0Var.d;
                    boolean z11 = true;
                    if (i1Var != null && i1Var.equals(do0Var.f25579a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = do0Var.f25579a.g();
                        tL_reactionCount.count = do0Var.f25580b;
                        go0 go0Var2 = fo0Var.f26335s;
                        eo0 eo0Var = new eo0(fo0Var, go0Var2.f26618a, fo0Var, tL_reactionCount, go0Var2.f26620c);
                        fo0Var.f26329a = eo0Var;
                        eo0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        eo0 eo0Var2 = fo0Var.f26329a;
                        eo0Var2.f760q = true;
                        eo0Var2.S = true;
                    } else {
                        fo0Var.f26329a.f765w = do0Var.f25580b;
                    }
                    fo0Var.d = do0Var.f25579a;
                    if (!z10) {
                        eo0 eo0Var3 = fo0Var.f26329a;
                        eo0Var3.f748f = eo0Var3.A;
                    }
                    fo0Var.f26329a.A = AndroidUtilities.dp(44.33f);
                    fo0Var.f26329a.f764u = !TextUtils.isEmpty(do0Var.f25581c);
                    eo0 eo0Var4 = fo0Var.f26329a;
                    boolean z12 = eo0Var4.f764u;
                    org.telegram.ui.Components.p6 p6Var = eo0Var4.G;
                    if (z12) {
                        p6Var.t(Emoji.replaceEmoji(do0Var.f25581c, p6Var.f29228a.getFontMetricsInt(), false), !z10, true);
                    } else if (p6Var != null) {
                        p6Var.t("", !z10, true);
                    }
                    eo0 eo0Var5 = fo0Var.f26329a;
                    Integer.toString(do0Var.f25580b);
                    eo0Var5.getClass();
                    fo0Var.f26329a.F.c(do0Var.f25580b, !z10);
                    eo0 eo0Var6 = fo0Var.f26329a;
                    if (eo0Var6.F != null && (eo0Var6.f765w > 0 || eo0Var6.f764u)) {
                        float f10 = eo0Var6.A;
                        int ceil = (int) Math.ceil(frVar.f26353m);
                        if (fo0Var.f26329a.f764u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        eo0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + fo0Var.f26329a.G.d + f10);
                    }
                    if (z10) {
                        eo0 eo0Var7 = fo0Var.f26329a;
                        eo0Var7.f748f = eo0Var7.A;
                    }
                    fo0Var.f26329a.B = AndroidUtilities.dp(28.0f);
                    eo0 eo0Var8 = fo0Var.f26329a;
                    eo0Var8.f759p = fo0Var.e;
                    if (fo0Var.f26334r) {
                        eo0Var8.a();
                    }
                    if (!z10) {
                        fo0Var.requestLayout();
                    }
                    fo0 fo0Var2 = (fo0) view;
                    if (do0Var.f25579a.h != go0Var.h) {
                        z11 = false;
                    }
                    fo0Var2.a(z11, false);
                    return;
                }
                return;
            case 4:
                qh0 qh0Var = (qh0) this.d;
                ((ph0) b1Var.f45921a).a((TLObject) qh0Var.f40583c.get(i10), false, ((Integer) qh0Var.f40582b.get(i10)).intValue());
                return;
            case 5:
                ((rh1) b1Var.f45921a).f41228a = WallpapersListActivity.m0[i10];
                return;
            default:
                sg.j jVar = (sg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((sg.h) arrayList2.get(i10)).f46268a == 1) {
                    sg.i iVar = (sg.i) b1Var.f45921a;
                    iVar.f46275c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f46275c.setImageDrawable(jVar.getContext().getDrawable(((sg.h) arrayList2.get(i10)).f46269b));
                    iVar.f46273a.setText(((sg.h) arrayList2.get(i10)).f46270c);
                    iVar.f46274b.setText(((sg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f1816c) {
            case 0:
                ?? view2 = new View(((l7) this.d).getContext());
                view2.f30487a = 0;
                return new s4.b1(view2);
            case 1:
                hg.n0 n0Var = new hg.n0(viewGroup.getContext(), ((hg.q0) this.d).f27583n2);
                ?? b1Var = new s4.b1(n0Var);
                b1Var.v = n0Var;
                n0Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(30.0f)));
                return b1Var;
            case 2:
                return new s4.b1(((org.telegram.ui.Components.ua) this.d).X);
            case 3:
                go0 go0Var = (go0) this.d;
                return new s4.b1(new fo0(go0Var, go0Var.getContext()));
            case 4:
                ph0 ph0Var = new ph0(viewGroup.getContext());
                ph0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.b1(ph0Var);
            case 5:
                vh1 vh1Var = (vh1) this.d;
                return new s4.b1(new rh1(vh1Var.E, vh1Var.f42264c));
            default:
                sg.j jVar = (sg.j) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = jVar.f46216a;
                if (i10 == 0) {
                    view = new sg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.s3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f46275c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, w7.z5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f46273a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    nk.o(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f46274b = textView2;
                    nk.o(org.telegram.ui.ActionBar.h6.f21382y6, d6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
        }
    }

    @Override
    public void y(s4.b1 b1Var) {
        boolean z10;
        switch (this.f1816c) {
            case 3:
                go0 go0Var = (go0) this.d;
                ArrayList arrayList = go0Var.f26623r;
                int b10 = b1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    fo0 fo0Var = (fo0) b1Var.f45921a;
                    if (((do0) arrayList.get(b10)).f25579a.h == go0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fo0Var.a(z10, false);
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
