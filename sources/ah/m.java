package ah;

import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.a7;
import bi.o5;
import bi.pb;
import bi.s6;
import bi.t2;
import bi.x6;
import bi.z9;
import di.fb;
import di.g8;
import di.p4;
import di.t4;
import di.u4;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.h51;
public final class m implements e2.h {
    public final int f649a;
    public final Object f650b;

    public m(Object obj, int i10) {
        this.f649a = i10;
        this.f650b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String str;
        boolean z10;
        switch (this.f649a) {
            case 0:
                b0 b0Var = (b0) this.f650b;
                b0Var.Q = (TL_stories.TL_premium_boostsStatus) obj;
                if (!b0Var.E.keySet().equals(b0Var.G.keySet())) {
                    b0Var.Y(false);
                    return;
                }
                return;
            case 1:
                o5 o5Var = (o5) this.f650b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    pb pbVar = o5Var.J0;
                    if (pbVar != null) {
                        pbVar.f3584k1 = false;
                        pbVar.P();
                        return;
                    }
                    return;
                }
                o5Var.J3 = tL_premium_boostsStatus;
                MessagesController.getInstance(o5Var.C2).getBoostsController().userCanBoostChannel(o5Var.B1, tL_premium_boostsStatus, new t2(0, o5Var, tL_premium_boostsStatus));
                return;
            case 2:
                s6 s6Var = (s6) obj;
                a7 a7Var = ((x6) this.f650b).f4012e;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = a7Var.G;
                    if (i10 < arrayList.size()) {
                        if (s6Var != arrayList.get(i10)) {
                            ((s6) arrayList.get(i10)).getClass();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                z9 z9Var = (z9) this.f650b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                z9Var.f4114p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    z9Var.f4111m = true;
                    z9Var.f4110l = str;
                    z9Var.f4105f = TextUtils.isEmpty(str);
                    View view = z9Var.f4116r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = z9Var.f4117s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                u4 u4Var = (u4) this.f650b;
                View view2 = (View) obj;
                p4 p4Var = u4Var.f8262b;
                if (view2 instanceof t4) {
                    p4Var.getClass();
                    int R = RecyclerView.R(view2);
                    h51 G = p4Var.Y2.G(R);
                    if (G != null) {
                        t4 t4Var = (t4) view2;
                        t4Var.setPosition(u4Var.b(R));
                        if (u4Var.f8265f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        t4Var.b(z10, true);
                        boolean contains = u4Var.f8264e.contains(Integer.valueOf(G.d));
                        if (t4Var.f8211f != contains) {
                            t4Var.f8211f = contains;
                            t4Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                p4 p4Var2 = (p4) this.f650b;
                View view3 = (View) obj;
                if (view3 instanceof t4) {
                    fb fbVar = p4Var2.f7852f3;
                    fbVar.f8262b.getClass();
                    ((t4) view3).setPosition(fbVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 6:
                g8.P((g8) this.f650b, (Long) obj);
                return;
            case 7:
                ((m4.j1) obj).f((b2.v0) this.f650b);
                return;
            case 8:
                ((m4.j1) obj).n((Surface) this.f650b);
                return;
            case 9:
                ((m4.j1) obj).C((b2.n0) this.f650b);
                return;
            case 10:
                z3.h hVar = (z3.h) this.f650b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.f50712b, qb.b.t2(aVar.f50711a, aVar.f50713c));
                hVar.f50722c.add(gVar);
                long j3 = hVar.f50727j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    hVar.a(gVar);
                    return;
                }
                return;
            default:
                ((e9.f0) this.f650b).b((z3.a) obj);
                return;
        }
    }
}
