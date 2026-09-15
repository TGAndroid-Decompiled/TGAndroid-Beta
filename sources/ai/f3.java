package ai;

import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i51;
public final class f3 implements e2.h {
    public final int f785a;
    public final Object f786b;

    public f3(Object obj, int i10) {
        this.f785a = i10;
        this.f786b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String str;
        boolean z10;
        switch (this.f785a) {
            case 0:
                f6 f6Var = (f6) this.f786b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    jc jcVar = f6Var.J0;
                    if (jcVar != null) {
                        jcVar.f1087k1 = false;
                        jcVar.P();
                        return;
                    }
                    return;
                }
                f6Var.J3 = tL_premium_boostsStatus;
                MessagesController.getInstance(f6Var.C2).getBoostsController().userCanBoostChannel(f6Var.B1, tL_premium_boostsStatus, new g3(0, f6Var, tL_premium_boostsStatus));
                return;
            case 1:
                j7 j7Var = (j7) obj;
                r7 r7Var = ((o7) this.f786b).e;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = r7Var.G;
                    if (i10 < arrayList.size()) {
                        if (j7Var != arrayList.get(i10)) {
                            ((j7) arrayList.get(i10)).getClass();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                sa saVar = (sa) this.f786b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                saVar.f1520p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    saVar.f1517m = true;
                    saVar.f1516l = str;
                    saVar.f1511f = TextUtils.isEmpty(str);
                    View view = saVar.f1522r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = saVar.f1523s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ci.u4 u4Var = (ci.u4) this.f786b;
                View view2 = (View) obj;
                ci.p4 p4Var = u4Var.f5606b;
                if (view2 instanceof ci.t4) {
                    p4Var.getClass();
                    int R = RecyclerView.R(view2);
                    i51 G = p4Var.Y2.G(R);
                    if (G != null) {
                        ci.t4 t4Var = (ci.t4) view2;
                        t4Var.setPosition(u4Var.b(R));
                        if (u4Var.f5608f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        t4Var.b(z10, true);
                        boolean contains = u4Var.e.contains(Integer.valueOf(G.d));
                        if (t4Var.f5556f != contains) {
                            t4Var.f5556f = contains;
                            t4Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ci.p4 p4Var2 = (ci.p4) this.f786b;
                View view3 = (View) obj;
                if (view3 instanceof ci.t4) {
                    ci.fb fbVar = p4Var2.f5300f3;
                    fbVar.f5606b.getClass();
                    ((ci.t4) view3).setPosition(fbVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 5:
                ci.g8.P((ci.g8) this.f786b, (Long) obj);
                return;
            case 6:
                ((m4.k1) obj).f((b2.v0) this.f786b);
                return;
            case 7:
                ((m4.k1) obj).n((Surface) this.f786b);
                return;
            case 8:
                ((m4.k1) obj).C((b2.n0) this.f786b);
                return;
            case 9:
                z3.h hVar = (z3.h) this.f786b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.f48081b, ob.a.C2(aVar.f48080a, aVar.f48082c));
                hVar.f48091c.add(gVar);
                long j3 = hVar.f48095j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    hVar.b(gVar);
                    return;
                }
                return;
            case 10:
                ((e9.f0) this.f786b).b((z3.a) obj);
                return;
            default:
                zg.q qVar = (zg.q) this.f786b;
                qVar.Q = (TL_stories.TL_premium_boostsStatus) obj;
                if (!qVar.E.keySet().equals(qVar.G.keySet())) {
                    qVar.Y(false);
                    return;
                }
                return;
        }
    }
}
