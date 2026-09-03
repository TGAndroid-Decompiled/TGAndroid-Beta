package mg;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import nh.d4;
import nh.d5;
import nh.i9;
import nh.j5;
import nh.m5;
import nh.v7;
import nh.z1;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i51;
import ph.l6;
import ph.m3;
import ph.q3;
import ph.r3;
import ph.v8;
public final class i implements h5.d {
    public final int f14006a;
    public final Object f14007b;

    public i(Object obj, int i10) {
        this.f14006a = i10;
        this.f14007b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String str;
        boolean z4;
        switch (this.f14006a) {
            case 0:
                s sVar = (s) this.f14007b;
                sVar.N = (TL_stories.TL_premium_boostsStatus) obj;
                if (!sVar.B.keySet().equals(sVar.D.keySet())) {
                    sVar.Y(false);
                    return;
                }
                return;
            case 1:
                d4 d4Var = (d4) this.f14007b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    i9 i9Var = d4Var.G0;
                    if (i9Var != null) {
                        i9Var.f15447h1 = false;
                        i9Var.P();
                        return;
                    }
                    return;
                }
                d4Var.G3 = tL_premium_boostsStatus;
                MessagesController.getInstance(d4Var.f15243z2).getBoostsController().userCanBoostChannel(d4Var.f15238y1, tL_premium_boostsStatus, new z1(0, d4Var, tL_premium_boostsStatus));
                return;
            case 2:
                d5 d5Var = (d5) obj;
                m5 m5Var = ((j5) this.f14007b).e;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = m5Var.D;
                    if (i10 < arrayList.size()) {
                        if (d5Var != arrayList.get(i10)) {
                            ((d5) arrayList.get(i10)).getClass();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                v7 v7Var = (v7) this.f14007b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                v7Var.f15987p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    v7Var.f15984m = true;
                    v7Var.f15983l = str;
                    v7Var.f15978f = TextUtils.isEmpty(str);
                    View view = v7Var.f15989r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = v7Var.f15990s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                r3 r3Var = (r3) this.f14007b;
                View view2 = (View) obj;
                m3 m3Var = r3Var.f42276b;
                if (view2 instanceof q3) {
                    m3Var.getClass();
                    int R = RecyclerView.R(view2);
                    i51 G = m3Var.V2.G(R);
                    if (G != null) {
                        q3 q3Var = (q3) view2;
                        q3Var.setPosition(r3Var.b(R));
                        if (r3Var.f42278f == G.d) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        q3Var.b(z4, true);
                        boolean contains = r3Var.e.contains(Integer.valueOf(G.d));
                        if (q3Var.f42237f != contains) {
                            q3Var.f42237f = contains;
                            q3Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                m3 m3Var2 = (m3) this.f14007b;
                View view3 = (View) obj;
                if (view3 instanceof q3) {
                    v8 v8Var = m3Var2.c3;
                    v8Var.f42276b.getClass();
                    ((q3) view3).setPosition(v8Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            default:
                l6.T((l6) this.f14007b, (Long) obj);
                return;
        }
    }
}
