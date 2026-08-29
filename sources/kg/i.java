package kg;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import lh.c5;
import lh.d4;
import lh.i5;
import lh.i9;
import lh.l5;
import lh.v7;
import lh.y1;
import nh.b4;
import nh.f4;
import nh.g4;
import nh.g7;
import nh.y9;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.w41;
public final class i implements f5.d {
    public final int f13732a;
    public final Object f13733b;

    public i(Object obj, int i10) {
        this.f13732a = i10;
        this.f13733b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String str;
        boolean z10;
        switch (this.f13732a) {
            case 0:
                s sVar = (s) this.f13733b;
                sVar.M = (TL_stories.TL_premium_boostsStatus) obj;
                if (!sVar.A.keySet().equals(sVar.C.keySet())) {
                    sVar.Y(false);
                    return;
                }
                return;
            case 1:
                d4 d4Var = (d4) this.f13733b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    i9 i9Var = d4Var.F0;
                    if (i9Var != null) {
                        i9Var.f15760g1 = false;
                        i9Var.P();
                        return;
                    }
                    return;
                }
                d4Var.F3 = tL_premium_boostsStatus;
                MessagesController.getInstance(d4Var.f15545y2).getBoostsController().userCanBoostChannel(d4Var.f15540x1, tL_premium_boostsStatus, new y1(0, d4Var, tL_premium_boostsStatus));
                return;
            case 2:
                c5 c5Var = (c5) obj;
                l5 l5Var = ((i5) this.f13733b).f15727e;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = l5Var.C;
                    if (i10 < arrayList.size()) {
                        if (c5Var != arrayList.get(i10)) {
                            ((c5) arrayList.get(i10)).getClass();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                v7 v7Var = (v7) this.f13733b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                v7Var.f16336p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    v7Var.f16333m = true;
                    v7Var.f16332l = str;
                    v7Var.f16327f = TextUtils.isEmpty(str);
                    View view = v7Var.f16338r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = v7Var.f16339s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                g4 g4Var = (g4) this.f13733b;
                View view2 = (View) obj;
                b4 b4Var = g4Var.f17694b;
                if (view2 instanceof f4) {
                    b4Var.getClass();
                    int R = RecyclerView.R(view2);
                    w41 G = b4Var.U2.G(R);
                    if (G != null) {
                        f4 f4Var = (f4) view2;
                        f4Var.setPosition(g4Var.b(R));
                        if (g4Var.f17697f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f4Var.b(z10, true);
                        boolean contains = g4Var.f17696e.contains(Integer.valueOf(G.d));
                        if (f4Var.f17636f != contains) {
                            f4Var.f17636f = contains;
                            f4Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                b4 b4Var2 = (b4) this.f13733b;
                View view3 = (View) obj;
                if (view3 instanceof f4) {
                    y9 y9Var = b4Var2.f17413b3;
                    y9Var.f17694b.getClass();
                    ((f4) view3).setPosition(y9Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            default:
                g7.T((g7) this.f13733b, (Long) obj);
                return;
        }
    }
}
