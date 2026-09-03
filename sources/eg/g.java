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
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ai;
import org.telegram.ui.ti1;
import org.telegram.ui.xh0;
import org.telegram.ui.xi1;
import org.telegram.ui.yh0;
public final class g extends ql0 {
    public final int f5282c;
    public final Object d;

    public g(Object obj, int i10) {
        this.f5282c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        switch (this.f5282c) {
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
        int i10 = this.f5282c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((m) obj).d.size();
            case 1:
                return ((g5) obj).M0.length;
            case 2:
                return 1;
            case 3:
                return ((nn0) obj).f27313r.size();
            case 4:
                return ((yh0) obj).f40278c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.f32371h0;
                return 12;
            default:
                return ((tf.g0) obj).U2.size();
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f5282c) {
            case 0:
                return ((k) ((m) this.d).d.get(i10)).f5318a;
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
        sq sqVar;
        float f10;
        switch (this.f5282c) {
            case 0:
                m mVar = (m) this.d;
                ArrayList arrayList = mVar.d;
                if (((k) arrayList.get(i10)).f5318a == 1) {
                    l lVar = (l) l1Var.f5774a;
                    lVar.f5337c.setColorFilter(new PorterDuffColorFilter(mVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    lVar.f5337c.setImageDrawable(mVar.getContext().getDrawable(((k) arrayList.get(i10)).f5319b));
                    lVar.f5335a.setText(((k) arrayList.get(i10)).f5320c);
                    lVar.f5336b.setText(((k) arrayList.get(i10)).d);
                    return;
                }
                return;
            case 1:
                int[] iArr = ((g5) this.d).M0;
                la laVar = (la) l1Var.f5774a;
                int i11 = iArr[(iArr.length - 1) - i10];
                if (laVar.f26635a != i11) {
                    laVar.f26635a = i11;
                    laVar.requestLayout();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                View view = l1Var.f5774a;
                nn0 nn0Var = (nn0) this.d;
                ArrayList arrayList2 = nn0Var.f27313r;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    kn0 kn0Var = (kn0) arrayList2.get(i10);
                    mn0 mn0Var = (mn0) view;
                    mg.q0 q0Var = mn0Var.d;
                    boolean z10 = true;
                    if (q0Var != null && q0Var.equals(kn0Var.f26357a)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = kn0Var.f26357a.g();
                        tL_reactionCount.count = kn0Var.f26358b;
                        nn0 nn0Var2 = mn0Var.f27104s;
                        ln0 ln0Var = new ln0(mn0Var, nn0Var2.f27308a, mn0Var, tL_reactionCount, nn0Var2.f27310c);
                        mn0Var.f27098a = ln0Var;
                        ln0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        ln0 ln0Var2 = mn0Var.f27098a;
                        ln0Var2.f14081q = true;
                        ln0Var2.S = true;
                    } else {
                        mn0Var.f27098a.f14086w = kn0Var.f26358b;
                    }
                    mn0Var.d = kn0Var.f26357a;
                    if (!z4) {
                        ln0 ln0Var3 = mn0Var.f27098a;
                        ln0Var3.f14069f = ln0Var3.A;
                    }
                    mn0Var.f27098a.A = AndroidUtilities.dp(44.33f);
                    mn0Var.f27098a.f14085u = !TextUtils.isEmpty(kn0Var.f26359c);
                    ln0 ln0Var4 = mn0Var.f27098a;
                    boolean z11 = ln0Var4.f14085u;
                    j6 j6Var = ln0Var4.G;
                    if (z11) {
                        j6Var.q(Emoji.replaceEmoji(kn0Var.f26359c, j6Var.f25846a.getFontMetricsInt(), false), !z4, true);
                    } else if (j6Var != null) {
                        j6Var.q("", !z4, true);
                    }
                    ln0 ln0Var5 = mn0Var.f27098a;
                    Integer.toString(kn0Var.f26358b);
                    ln0Var5.getClass();
                    mn0Var.f27098a.F.c(kn0Var.f26358b, !z4);
                    ln0 ln0Var6 = mn0Var.f27098a;
                    if (ln0Var6.F != null && (ln0Var6.f14086w > 0 || ln0Var6.f14085u)) {
                        float f11 = ln0Var6.A;
                        int ceil = (int) Math.ceil(sqVar.f28784m);
                        if (mn0Var.f27098a.f14085u) {
                            f10 = 4.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        ln0Var6.A = (int) (AndroidUtilities.dp(f10) + ceil + mn0Var.f27098a.G.d + f11);
                    }
                    if (z4) {
                        ln0 ln0Var7 = mn0Var.f27098a;
                        ln0Var7.f14069f = ln0Var7.A;
                    }
                    mn0Var.f27098a.B = AndroidUtilities.dp(28.0f);
                    ln0 ln0Var8 = mn0Var.f27098a;
                    ln0Var8.f14080p = mn0Var.e;
                    if (mn0Var.f27103r) {
                        ln0Var8.a();
                    }
                    if (!z4) {
                        mn0Var.requestLayout();
                    }
                    mn0 mn0Var2 = (mn0) view;
                    if (kn0Var.f26357a.h != nn0Var.h) {
                        z10 = false;
                    }
                    mn0Var2.a(z10, false);
                    return;
                }
                return;
            case 4:
                yh0 yh0Var = (yh0) this.d;
                ((xh0) l1Var.f5774a).a((TLObject) yh0Var.f40278c.get(i10), false, ((Integer) yh0Var.f40277b.get(i10)).intValue());
                return;
            case 5:
                ((ti1) l1Var.f5774a).f38530a = WallpapersListActivity.f32373j0[i10];
                return;
            default:
                ((tf.f0) l1Var).v.setData((tf.e0) ((tf.g0) this.d).U2.get(i10));
                return;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.f5282c) {
            case 0:
                m mVar = (m) this.d;
                f6 f6Var = mVar.f5207a;
                if (i10 == 0) {
                    view = new j(mVar, mVar.getContext());
                } else if (i10 == 2) {
                    view = new r3(mVar.getContext(), 16);
                } else {
                    Context context = mVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f5337c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, b6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f5335a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, b6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f5336b = textView2;
                    org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f20256y6, f6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, b6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return ai.n(view, view, -1, -2);
            case 1:
                ?? view2 = new View(((g5) this.d).getContext());
                view2.f26635a = 0;
                return new f2.l1(view2);
            case 2:
                return new f2.l1(((ma) this.d).U);
            case 3:
                nn0 nn0Var = (nn0) this.d;
                return new f2.l1(new mn0(nn0Var, nn0Var.getContext()));
            case 4:
                xh0 xh0Var = new xh0(viewGroup.getContext());
                xh0Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(50.0f)));
                return new f2.l1(xh0Var);
            case 5:
                xi1 xi1Var = (xi1) this.d;
                return new f2.l1(new ti1(xi1Var.B, xi1Var.f39997c));
            default:
                tf.d0 d0Var = new tf.d0(viewGroup.getContext(), ((tf.g0) this.d).f28511m2);
                ?? l1Var = new f2.l1(d0Var);
                l1Var.v = d0Var;
                d0Var.setLayoutParams(new f2.w0(-2, AndroidUtilities.dp(30.0f)));
                return l1Var;
        }
    }

    @Override
    public void y(f2.l1 l1Var) {
        boolean z4;
        switch (this.f5282c) {
            case 3:
                nn0 nn0Var = (nn0) this.d;
                ArrayList arrayList = nn0Var.f27313r;
                int b10 = l1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    mn0 mn0Var = (mn0) l1Var.f5774a;
                    if (((kn0) arrayList.get(b10)).f26357a.h == nn0Var.h) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    mn0Var.a(z4, false);
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
