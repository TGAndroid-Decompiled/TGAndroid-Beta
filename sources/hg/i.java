package hg;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ih.a2;
import ih.g5;
import ih.i4;
import ih.l5;
import ih.m9;
import ih.o5;
import ih.z7;
import java.util.ArrayList;
import kh.h4;
import kh.l4;
import kh.m4;
import kh.na;
import kh.s7;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.l41;
public final class i implements d5.d {
    public final int f10614a;
    public final Object f10615b;

    public i(Object obj, int i9) {
        this.f10614a = i9;
        this.f10615b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String str;
        boolean z10;
        switch (this.f10614a) {
            case 0:
                s sVar = (s) this.f10615b;
                sVar.M = (TL_stories.TL_premium_boostsStatus) obj;
                if (!sVar.A.keySet().equals(sVar.C.keySet())) {
                    sVar.X(false);
                    return;
                }
                return;
            case 1:
                i4 i4Var = (i4) this.f10615b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    m9 m9Var = i4Var.F0;
                    if (m9Var != null) {
                        m9Var.f11801g1 = false;
                        m9Var.P();
                        return;
                    }
                    return;
                }
                i4Var.F3 = tL_premium_boostsStatus;
                MessagesController.getInstance(i4Var.f11609y2).getBoostsController().userCanBoostChannel(i4Var.f11604x1, tL_premium_boostsStatus, new a2(0, i4Var, tL_premium_boostsStatus));
                return;
            case 2:
                g5 g5Var = (g5) obj;
                o5 o5Var = ((l5) this.f10615b).f11712e;
                int i9 = 0;
                while (true) {
                    ArrayList arrayList = o5Var.C;
                    if (i9 < arrayList.size()) {
                        if (g5Var != arrayList.get(i9)) {
                            ((g5) arrayList.get(i9)).getClass();
                        }
                        i9++;
                    } else {
                        return;
                    }
                }
            case 3:
                z7 z7Var = (z7) this.f10615b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                z7Var.f12394p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    z7Var.f12391m = true;
                    z7Var.f12390l = str;
                    z7Var.f12385f = TextUtils.isEmpty(str);
                    View view = z7Var.f12396r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = z7Var.f12397s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                m4 m4Var = (m4) this.f10615b;
                View view2 = (View) obj;
                h4 h4Var = m4Var.f15689b;
                if (view2 instanceof l4) {
                    h4Var.getClass();
                    int R = RecyclerView.R(view2);
                    l41 G = h4Var.U2.G(R);
                    if (G != null) {
                        l4 l4Var = (l4) view2;
                        l4Var.setPosition(m4Var.b(R));
                        if (m4Var.f15692f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l4Var.b(z10, true);
                        boolean contains = m4Var.f15691e.contains(Integer.valueOf(G.d));
                        if (l4Var.f15591f != contains) {
                            l4Var.f15591f = contains;
                            l4Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                h4 h4Var2 = (h4) this.f10615b;
                View view3 = (View) obj;
                if (view3 instanceof l4) {
                    na naVar = h4Var2.f15393b3;
                    naVar.f15689b.getClass();
                    ((l4) view3).setPosition(naVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            default:
                s7.S((s7) this.f10615b, (Long) obj);
                return;
        }
    }
}
