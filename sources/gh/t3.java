package gh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.oh0;
import org.telegram.ui.ph0;
import org.telegram.ui.wh1;
public final class t3 extends vk0 {
    public final int f8912c;
    public final Object d;

    public t3(Object obj, int i9) {
        this.f8912c = i9;
        this.d = obj;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        switch (this.f8912c) {
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

    public void F(int i9, int i10) {
        int[] iArr = ((k5) this.d).L0;
        if (iArr[0] == i9 && iArr[1] == i10) {
            return;
        }
        iArr[0] = i9;
        iArr[1] = i10;
        l();
    }

    @Override
    public final int h() {
        int i9 = this.f8912c;
        Object obj = this.d;
        switch (i9) {
            case 0:
                return ((k5) obj).L0.length;
            case 1:
                return ((of.o0) obj).T2.size();
            case 2:
                return 1;
            case 3:
                return ((sm0) obj).f32524r.size();
            case 4:
                return ((ph0) obj).f41526c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.f36296g0;
                return 12;
            default:
                return ((zf.j) obj).d.size();
        }
    }

    @Override
    public int j(int i9) {
        switch (this.f8912c) {
            case 2:
                return i9;
            case 6:
                return ((zf.h) ((zf.j) this.d).d.get(i9)).f50513a;
            default:
                return super.j(i9);
        }
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        lq lqVar;
        float f10;
        switch (this.f8912c) {
            case 0:
                int[] iArr = ((k5) this.d).L0;
                org.telegram.ui.Components.la laVar = (org.telegram.ui.Components.la) q1Var.f5501a;
                int i10 = iArr[(iArr.length - 1) - i9];
                if (laVar.f30408a != i10) {
                    laVar.f30408a = i10;
                    laVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((of.n0) q1Var).v.setData((of.m0) ((of.o0) this.d).T2.get(i9));
                return;
            case 2:
                return;
            case 3:
                View view = q1Var.f5501a;
                sm0 sm0Var = (sm0) this.d;
                ArrayList arrayList = sm0Var.f32524r;
                if (i9 >= 0 && i9 < arrayList.size()) {
                    pm0 pm0Var = (pm0) arrayList.get(i9);
                    rm0 rm0Var = (rm0) view;
                    hg.r0 r0Var = rm0Var.d;
                    boolean z11 = true;
                    if (r0Var != null && r0Var.equals(pm0Var.f31693a)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = pm0Var.f31693a.g();
                        tL_reactionCount.count = pm0Var.f31694b;
                        sm0 sm0Var2 = rm0Var.f32207s;
                        qm0 qm0Var = new qm0(rm0Var, sm0Var2.f32518a, rm0Var, tL_reactionCount, sm0Var2.f32520c);
                        rm0Var.f32200a = qm0Var;
                        qm0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        qm0 qm0Var2 = rm0Var.f32200a;
                        qm0Var2.f10702q = true;
                        qm0Var2.S = true;
                    } else {
                        rm0Var.f32200a.f10707w = pm0Var.f31694b;
                    }
                    rm0Var.d = pm0Var.f31693a;
                    if (!z10) {
                        qm0 qm0Var3 = rm0Var.f32200a;
                        qm0Var3.f10690f = qm0Var3.A;
                    }
                    rm0Var.f32200a.A = AndroidUtilities.dp(44.33f);
                    rm0Var.f32200a.f10706u = !TextUtils.isEmpty(pm0Var.f31695c);
                    qm0 qm0Var4 = rm0Var.f32200a;
                    boolean z12 = qm0Var4.f10706u;
                    org.telegram.ui.Components.i6 i6Var = qm0Var4.G;
                    if (z12) {
                        i6Var.q(Emoji.replaceEmoji(pm0Var.f31695c, i6Var.f29332a.getFontMetricsInt(), false), !z10, true);
                    } else if (i6Var != null) {
                        i6Var.q("", !z10, true);
                    }
                    qm0 qm0Var5 = rm0Var.f32200a;
                    Integer.toString(pm0Var.f31694b);
                    qm0Var5.getClass();
                    rm0Var.f32200a.F.c(pm0Var.f31694b, !z10);
                    qm0 qm0Var6 = rm0Var.f32200a;
                    if (qm0Var6.F != null && (qm0Var6.f10707w > 0 || qm0Var6.f10706u)) {
                        float f11 = qm0Var6.A;
                        int ceil = (int) Math.ceil(lqVar.f30524m);
                        if (rm0Var.f32200a.f10706u) {
                            f10 = 4.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        qm0Var6.A = (int) (AndroidUtilities.dp(f10) + ceil + rm0Var.f32200a.G.d + f11);
                    }
                    if (z10) {
                        qm0 qm0Var7 = rm0Var.f32200a;
                        qm0Var7.f10690f = qm0Var7.A;
                    }
                    rm0Var.f32200a.B = AndroidUtilities.dp(28.0f);
                    qm0 qm0Var8 = rm0Var.f32200a;
                    qm0Var8.f10701p = rm0Var.f32203e;
                    if (rm0Var.f32206r) {
                        qm0Var8.a();
                    }
                    if (!z10) {
                        rm0Var.requestLayout();
                    }
                    rm0 rm0Var2 = (rm0) view;
                    if (pm0Var.f31693a.h != sm0Var.h) {
                        z11 = false;
                    }
                    rm0Var2.a(z11, false);
                    return;
                }
                return;
            case 4:
                ph0 ph0Var = (ph0) this.d;
                ((oh0) q1Var.f5501a).a((TLObject) ph0Var.f41526c.get(i9), false, ((Integer) ph0Var.f41525b.get(i9)).intValue());
                return;
            case 5:
                ((wh1) q1Var.f5501a).f44142a = WallpapersListActivity.f36298i0[i9];
                return;
            default:
                zf.j jVar = (zf.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((zf.h) arrayList2.get(i9)).f50513a == 1) {
                    zf.i iVar = (zf.i) q1Var.f5501a;
                    iVar.f50523c.setColorFilter(new PorterDuffColorFilter(jVar.f50530e.getPixel(i9, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.f50523c.setImageDrawable(jVar.getContext().getDrawable(((zf.h) arrayList2.get(i9)).f50514b));
                    iVar.f50521a.setText(((zf.h) arrayList2.get(i9)).f50515c);
                    iVar.f50522b.setText(((zf.h) arrayList2.get(i9)).d);
                    return;
                }
                return;
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        switch (this.f8912c) {
            case 0:
                ?? view2 = new View(((k5) this.d).getContext());
                view2.f30408a = 0;
                return new f2.q1(view2);
            case 1:
                of.l0 l0Var = new of.l0(viewGroup.getContext(), ((of.o0) this.d).f34260l2);
                ?? q1Var = new f2.q1(l0Var);
                q1Var.v = l0Var;
                l0Var.setLayoutParams(new f2.a1(-2, AndroidUtilities.dp(30.0f)));
                return q1Var;
            case 2:
                return new f2.q1(((org.telegram.ui.Components.ma) this.d).T);
            case 3:
                sm0 sm0Var = (sm0) this.d;
                return new f2.q1(new rm0(sm0Var, sm0Var.getContext()));
            case 4:
                oh0 oh0Var = new oh0(viewGroup.getContext());
                oh0Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(50.0f)));
                return new f2.q1(oh0Var);
            case 5:
                bi1 bi1Var = (bi1) this.d;
                return new f2.q1(new wh1(bi1Var.A, bi1Var.f36867c));
            default:
                zf.j jVar = (zf.j) this.d;
                org.telegram.ui.ActionBar.b6 b6Var = jVar.f50463a;
                if (i9 == 0) {
                    view = new zf.g(jVar, jVar.getContext());
                } else if (i9 == 2) {
                    view = new org.telegram.ui.Cells.t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    ?? frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout.f50523c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout.addView(imageView, g7.e6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout.f50521a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    ll.n(org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 14.0f);
                    frameLayout.addView(textView, g7.e6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.f50522b = textView2;
                    ll.n(org.telegram.ui.ActionBar.f6.f23369y6, b6Var, textView2, 1, 14.0f);
                    frameLayout.addView(textView2, g7.e6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout;
                }
                return j3.r0.s(view, view, -1, -2);
        }
    }

    @Override
    public void y(f2.q1 q1Var) {
        boolean z10;
        switch (this.f8912c) {
            case 3:
                sm0 sm0Var = (sm0) this.d;
                ArrayList arrayList = sm0Var.f32524r;
                int b10 = q1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    rm0 rm0Var = (rm0) q1Var.f5501a;
                    if (((pm0) arrayList.get(b10)).f31693a.h == sm0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rm0Var.a(z10, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(f2.q1 q1Var, int i9) {
    }
}
