package eg;

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
import k7.b6;
import lh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.tq;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.li1;
import org.telegram.ui.pi1;
import org.telegram.ui.vh0;
import org.telegram.ui.wh0;
import org.telegram.ui.yh;
public final class g extends rl0 {
    public final int f5293c;
    public final Object d;

    public g(Object obj, int i10) {
        this.f5293c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        switch (this.f5293c) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            default:
                return true;
        }
    }

    public void F(int i10, int i11) {
        int[] iArr = ((g5) this.d).M0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f5293c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((m) obj).d.size();
            case 1:
                return ((g5) obj).M0.length;
            case 2:
                return 1;
            case 3:
                return ((on0) obj).f27605r.size();
            case 4:
                return ((wh0) obj).f39743c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.f32397h0;
                return 12;
            default:
                return ((tf.g0) obj).U2.size();
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f5293c) {
            case 0:
                return ((k) ((m) this.d).d.get(i10)).f5329a;
            case 1:
            default:
                return super.j(i10);
            case 2:
                return i10;
        }
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        tq tqVar;
        float f10;
        switch (this.f5293c) {
            case 0:
                m mVar = (m) this.d;
                ArrayList arrayList = mVar.d;
                if (((k) arrayList.get(i10)).f5329a == 1) {
                    l lVar = (l) l1Var.f5785a;
                    lVar.f5348c.setColorFilter(new PorterDuffColorFilter(mVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    lVar.f5348c.setImageDrawable(mVar.getContext().getDrawable(((k) arrayList.get(i10)).f5330b));
                    lVar.f5346a.setText(((k) arrayList.get(i10)).f5331c);
                    lVar.f5347b.setText(((k) arrayList.get(i10)).d);
                    return;
                }
                return;
            case 1:
                int[] iArr = ((g5) this.d).M0;
                la laVar = (la) l1Var.f5785a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (laVar.f26607a != i11) {
                    laVar.f26607a = i11;
                    laVar.requestLayout();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                View view = l1Var.f5785a;
                on0 on0Var = (on0) this.d;
                ArrayList arrayList2 = on0Var.f27605r;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    ln0 ln0Var = (ln0) arrayList2.get(i10);
                    nn0 nn0Var = (nn0) view;
                    mg.q0 q0Var = nn0Var.d;
                    boolean z10 = true;
                    if (q0Var != null && q0Var.equals(ln0Var.f26817a)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = ln0Var.f26817a.g();
                        tL_reactionCount.count = ln0Var.f26818b;
                        on0 on0Var2 = nn0Var.f27330s;
                        mn0 mn0Var = new mn0(nn0Var, on0Var2.f27600a, nn0Var, tL_reactionCount, on0Var2.f27602c);
                        nn0Var.f27324a = mn0Var;
                        mn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        mn0 mn0Var2 = nn0Var.f27324a;
                        mn0Var2.f14093q = true;
                        mn0Var2.S = true;
                    } else {
                        nn0Var.f27324a.f14098w = ln0Var.f26818b;
                    }
                    nn0Var.d = ln0Var.f26817a;
                    if (!z4) {
                        mn0 mn0Var3 = nn0Var.f27324a;
                        mn0Var3.f14081f = mn0Var3.A;
                    }
                    nn0Var.f27324a.A = AndroidUtilities.dp(44.33f);
                    nn0Var.f27324a.f14097u = !TextUtils.isEmpty(ln0Var.f26819c);
                    mn0 mn0Var4 = nn0Var.f27324a;
                    boolean z11 = mn0Var4.f14097u;
                    j6 j6Var = mn0Var4.G;
                    if (z11) {
                        j6Var.q(Emoji.replaceEmoji(ln0Var.f26819c, j6Var.f25883a.getFontMetricsInt(), false), !z4, true);
                    } else if (j6Var != null) {
                        j6Var.q("", !z4, true);
                    }
                    mn0 mn0Var5 = nn0Var.f27324a;
                    Integer.toString(ln0Var.f26818b);
                    mn0Var5.getClass();
                    nn0Var.f27324a.F.c(ln0Var.f26818b, !z4);
                    mn0 mn0Var6 = nn0Var.f27324a;
                    if (mn0Var6.F != null && (mn0Var6.f14098w > 0 || mn0Var6.f14097u)) {
                        float f11 = mn0Var6.A;
                        int ceil = (int) Math.ceil(tqVar.f29012m);
                        if (nn0Var.f27324a.f14097u) {
                            f10 = 4.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        mn0Var6.A = (int) (AndroidUtilities.dp(f10) + ceil + nn0Var.f27324a.G.d + f11);
                    }
                    if (z4) {
                        mn0 mn0Var7 = nn0Var.f27324a;
                        mn0Var7.f14081f = mn0Var7.A;
                    }
                    nn0Var.f27324a.B = AndroidUtilities.dp(28.0f);
                    mn0 mn0Var8 = nn0Var.f27324a;
                    mn0Var8.f14092p = nn0Var.e;
                    if (nn0Var.f27329r) {
                        mn0Var8.a();
                    }
                    if (!z4) {
                        nn0Var.requestLayout();
                    }
                    nn0 nn0Var2 = (nn0) view;
                    if (ln0Var.f26817a.h != on0Var.h) {
                        z10 = false;
                    }
                    nn0Var2.a(z10, false);
                    return;
                }
                return;
            case 4:
                wh0 wh0Var = (wh0) this.d;
                ((vh0) l1Var.f5785a).a((TLObject) wh0Var.f39743c.get(i10), false, ((Integer) wh0Var.f39742b.get(i10)).intValue());
                return;
            case 5:
                ((li1) l1Var.f5785a).f36093a = WallpapersListActivity.f32399j0[i10];
                return;
            default:
                ((tf.f0) l1Var).v.setData((tf.e0) ((tf.g0) this.d).U2.get(i10));
                return;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f5293c) {
            case 0:
                m mVar = (m) this.d;
                f6 f6Var = mVar.f5218a;
                if (i10 == 0) {
                    view = new j(mVar, mVar.getContext());
                } else if (i10 == 2) {
                    view = new s3(mVar.getContext(), 16);
                } else {
                    Context context = mVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f5348c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, b6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f5346a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, b6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f5347b = textView2;
                    org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f20281y6, f6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, b6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return yh.o(view, view, -1, -2);
            case 1:
                ?? view2 = new View(((g5) this.d).getContext());
                view2.f26607a = 0;
                return new f2.l1(view2);
            case 2:
                return new f2.l1(((ma) this.d).U);
            case 3:
                on0 on0Var = (on0) this.d;
                return new f2.l1(new nn0(on0Var, on0Var.getContext()));
            case 4:
                vh0 vh0Var = new vh0(viewGroup.getContext());
                vh0Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(50.0f)));
                return new f2.l1(vh0Var);
            case 5:
                pi1 pi1Var = (pi1) this.d;
                return new f2.l1(new li1(pi1Var.B, pi1Var.f37345c));
            default:
                tf.d0 d0Var = new tf.d0(viewGroup.getContext(), ((tf.g0) this.d).f28750m2);
                ?? l1Var = new f2.l1(d0Var);
                l1Var.v = d0Var;
                d0Var.setLayoutParams(new f2.w0(-2, AndroidUtilities.dp(30.0f)));
                return l1Var;
        }
    }

    @Override
    public void y(f2.l1 l1Var) {
        boolean z4;
        switch (this.f5293c) {
            case 3:
                on0 on0Var = (on0) this.d;
                ArrayList arrayList = on0Var.f27605r;
                int b10 = l1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    nn0 nn0Var = (nn0) l1Var.f5785a;
                    if (((ln0) arrayList.get(b10)).f26817a.h == on0Var.h) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    nn0Var.a(z4, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(f2.l1 l1Var, int i10) {
    }
}
