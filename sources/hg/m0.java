package hg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.wa;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ki0;
import org.telegram.ui.li0;
import org.telegram.ui.oj1;
import org.telegram.ui.sj1;
import w7.a6;
import zh.r3;
public final class m0 extends lm0 {
    public final int f10669c;
    public final Object d;

    public m0(Object obj, int i10) {
        this.f10669c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        switch (this.f10669c) {
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
        int[] iArr = ((r3) this.d).Q0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f10669c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((r0) obj).V2.size();
            case 1:
                return 1;
            case 2:
                return ((ko0) obj).f26769r.size();
            case 3:
                return ((li0) obj).f38021c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.f33971k0;
                return 12;
            case 5:
                return ((sg.j) obj).d.size();
            default:
                return ((r3) obj).Q0.length;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f10669c) {
            case 1:
                return i10;
            case 5:
                return ((sg.h) ((sg.j) this.d).d.get(i10)).f45190a;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        ir irVar;
        float f7;
        switch (this.f10669c) {
            case 0:
                ((q0) b1Var).v.setData((p0) ((r0) this.d).V2.get(i10));
                return;
            case 1:
                return;
            case 2:
                View view = b1Var.f44838a;
                ko0 ko0Var = (ko0) this.d;
                ArrayList arrayList = ko0Var.f26769r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ho0 ho0Var = (ho0) arrayList.get(i10);
                    jo0 jo0Var = (jo0) view;
                    ah.i1 i1Var = jo0Var.d;
                    boolean z11 = true;
                    if (i1Var != null && i1Var.equals(ho0Var.f25716a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = ho0Var.f25716a.g();
                        tL_reactionCount.count = ho0Var.f25717b;
                        ko0 ko0Var2 = jo0Var.f26426s;
                        io0 io0Var = new io0(jo0Var, ko0Var2.f26764a, jo0Var, tL_reactionCount, ko0Var2.f26766c);
                        jo0Var.f26420a = io0Var;
                        io0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        io0 io0Var2 = jo0Var.f26420a;
                        io0Var2.f756q = true;
                        io0Var2.S = true;
                    } else {
                        jo0Var.f26420a.f761w = ho0Var.f25717b;
                    }
                    jo0Var.d = ho0Var.f25716a;
                    if (!z10) {
                        io0 io0Var3 = jo0Var.f26420a;
                        io0Var3.f744f = io0Var3.A;
                    }
                    jo0Var.f26420a.A = AndroidUtilities.dp(44.33f);
                    jo0Var.f26420a.f760u = !TextUtils.isEmpty(ho0Var.f25718c);
                    io0 io0Var4 = jo0Var.f26420a;
                    boolean z12 = io0Var4.f760u;
                    r6 r6Var = io0Var4.G;
                    if (z12) {
                        r6Var.t(Emoji.replaceEmoji(ho0Var.f25718c, r6Var.f28746a.getFontMetricsInt(), false), !z10, true);
                    } else if (r6Var != null) {
                        r6Var.t("", !z10, true);
                    }
                    io0 io0Var5 = jo0Var.f26420a;
                    Integer.toString(ho0Var.f25717b);
                    io0Var5.getClass();
                    jo0Var.f26420a.F.c(ho0Var.f25717b, !z10);
                    io0 io0Var6 = jo0Var.f26420a;
                    if (io0Var6.F != null && (io0Var6.f761w > 0 || io0Var6.f760u)) {
                        float f10 = io0Var6.A;
                        int ceil = (int) Math.ceil(irVar.f26063m);
                        if (jo0Var.f26420a.f760u) {
                            f7 = 4.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        io0Var6.A = (int) (AndroidUtilities.dp(f7) + ceil + jo0Var.f26420a.G.d + f10);
                    }
                    if (z10) {
                        io0 io0Var7 = jo0Var.f26420a;
                        io0Var7.f744f = io0Var7.A;
                    }
                    jo0Var.f26420a.B = AndroidUtilities.dp(28.0f);
                    io0 io0Var8 = jo0Var.f26420a;
                    io0Var8.f755p = jo0Var.e;
                    if (jo0Var.f26425r) {
                        io0Var8.a();
                    }
                    if (!z10) {
                        jo0Var.requestLayout();
                    }
                    jo0 jo0Var2 = (jo0) view;
                    if (ho0Var.f25716a.h != ko0Var.h) {
                        z11 = false;
                    }
                    jo0Var2.a(z11, false);
                    return;
                }
                return;
            case 3:
                li0 li0Var = (li0) this.d;
                ((ki0) b1Var.f44838a).a((TLObject) li0Var.f38021c.get(i10), false, ((Integer) li0Var.f38020b.get(i10)).intValue());
                return;
            case 4:
                ((oj1) b1Var.f44838a).f38988a = WallpapersListActivity.m0[i10];
                return;
            case 5:
                sg.j jVar = (sg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((sg.h) arrayList2.get(i10)).f45190a == 1) {
                    sg.i iVar = (sg.i) b1Var.f44838a;
                    iVar.f45195c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f45195c.setImageDrawable(jVar.getContext().getDrawable(((sg.h) arrayList2.get(i10)).f45191b));
                    iVar.f45193a.setText(((sg.h) arrayList2.get(i10)).f45192c);
                    iVar.f45194b.setText(((sg.h) arrayList2.get(i10)).d);
                    return;
                }
                return;
            default:
                int[] iArr = ((r3) this.d).Q0;
                va vaVar = (va) b1Var.f44838a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (vaVar.f29926a != i11) {
                    vaVar.f29926a = i11;
                    vaVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f10669c) {
            case 0:
                o0 o0Var = new o0(viewGroup.getContext(), ((r0) this.d).f27439n2);
                ?? b1Var = new s4.b1(o0Var);
                b1Var.v = o0Var;
                o0Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(30.0f)));
                return b1Var;
            case 1:
                return new s4.b1(((wa) this.d).X);
            case 2:
                ko0 ko0Var = (ko0) this.d;
                return new s4.b1(new jo0(ko0Var, ko0Var.getContext()));
            case 3:
                ki0 ki0Var = new ki0(viewGroup.getContext());
                ki0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(50.0f)));
                return new s4.b1(ki0Var);
            case 4:
                sj1 sj1Var = (sj1) this.d;
                return new s4.b1(new oj1(sj1Var.E, sj1Var.f40160c));
            case 5:
                sg.j jVar = (sg.j) this.d;
                c6 c6Var = jVar.f45138a;
                if (i10 == 0) {
                    view = new sg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f45195c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, a6.a(28.0f, 25.0f, 12.0f, 16.0f, 0.0f, 28, 0));
                    TextView textView = new TextView(context);
                    frameLayout.f45193a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    yh.n(g6.G6, c6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, a6.a(-2.0f, 68.0f, 8.0f, 16.0f, 0.0f, -1, 0));
                    TextView textView2 = new TextView(context);
                    frameLayout.f45194b = textView2;
                    yh.n(g6.f20288y6, c6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, a6.a(-2.0f, 68.0f, 28.0f, 16.0f, 8.0f, -1, 0));
                    view = frameLayout;
                }
                return k3.l(view, view, -1, -2);
            default:
                ?? view2 = new View(((r3) this.d).getContext());
                view2.f29926a = 0;
                return new s4.b1(view2);
        }
    }

    @Override
    public void y(s4.b1 b1Var) {
        boolean z10;
        switch (this.f10669c) {
            case 2:
                ko0 ko0Var = (ko0) this.d;
                ArrayList arrayList = ko0Var.f26769r;
                int b10 = b1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    jo0 jo0Var = (jo0) b1Var.f44838a;
                    if (((ho0) arrayList.get(b10)).f25716a.h == ko0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jo0Var.a(z10, false);
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
