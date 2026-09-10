package bi;

import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.v51;
public final class i5 implements e2.h {
    public final int f2852a;
    public final Object f2853b;

    public i5(Object obj, int i10) {
        this.f2852a = i10;
        this.f2853b = obj;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String str;
        switch (this.f2852a) {
            case 0:
                p5 p5Var = (p5) this.f2853b;
                View view = (View) obj;
                k5 k5Var = p5Var.f3388b;
                if (view instanceof o5) {
                    k5Var.getClass();
                    int R = RecyclerView.R(view);
                    v51 G = k5Var.Y2.G(R);
                    if (G != null) {
                        o5 o5Var = (o5) view;
                        o5Var.setPosition(p5Var.b(R));
                        if (p5Var.f3390f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        o5Var.b(z10, true);
                        boolean contains = p5Var.e.contains(Integer.valueOf(G.d));
                        if (o5Var.f3313f != contains) {
                            o5Var.f3313f = contains;
                            o5Var.invalidate();
                        }
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                k5 k5Var2 = (k5) this.f2853b;
                View view2 = (View) obj;
                if (view2 instanceof o5) {
                    oc ocVar = k5Var2.f2987f3;
                    ocVar.f3388b.getClass();
                    ((o5) view2).setPosition(ocVar.b(RecyclerView.R(view2)));
                    view2.setPressed(false);
                    return;
                }
                return;
            case 2:
                i9.P((i9) this.f2853b, (Long) obj);
                return;
            case 3:
                ((m4.l1) obj).f((b2.v0) this.f2853b);
                return;
            case 4:
                ((m4.l1) obj).n((Surface) this.f2853b);
                return;
            case 5:
                ((m4.l1) obj).C((b2.n0) this.f2853b);
                return;
            case 6:
                yg.s sVar = (yg.s) this.f2853b;
                sVar.Q = (TL_stories.TL_premium_boostsStatus) obj;
                if (!sVar.E.keySet().equals(sVar.G.keySet())) {
                    sVar.Y(false);
                    return;
                }
                return;
            case 7:
                z3.h hVar = (z3.h) this.f2853b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.f47197b, qb.b.D3(aVar.f47196a, aVar.f47198c));
                hVar.f47207c.add(gVar);
                long j3 = hVar.f47211j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    hVar.a(gVar);
                    return;
                }
                return;
            case 8:
                ((e9.f0) this.f2853b).b((z3.a) obj);
                return;
            case 9:
                zh.a3 a3Var = (zh.a3) this.f2853b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    zh.u7 u7Var = a3Var.J0;
                    if (u7Var != null) {
                        u7Var.f48943k1 = false;
                        u7Var.P();
                        return;
                    }
                    return;
                }
                a3Var.J3 = tL_premium_boostsStatus;
                MessagesController.getInstance(a3Var.C2).getBoostsController().userCanBoostChannel(a3Var.B1, tL_premium_boostsStatus, new m4.q0(11, a3Var, tL_premium_boostsStatus));
                return;
            case 10:
                zh.z3 z3Var = (zh.z3) obj;
                zh.g4 g4Var = ((zh.d4) this.f2853b).e;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = g4Var.G;
                    if (i10 < arrayList.size()) {
                        if (z3Var != arrayList.get(i10)) {
                            ((zh.z3) arrayList.get(i10)).getClass();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                zh.j6 j6Var = (zh.j6) this.f2853b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                j6Var.f48555p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    j6Var.f48552m = true;
                    j6Var.f48551l = str;
                    j6Var.f48546f = TextUtils.isEmpty(str);
                    View view3 = j6Var.f48557r;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    Runnable runnable = j6Var.f48558s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
