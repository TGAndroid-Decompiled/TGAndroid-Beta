package ng;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import oh.a2;
import oh.e5;
import oh.f4;
import oh.i9;
import oh.k5;
import oh.n5;
import oh.v7;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.h51;
import qh.i6;
import qh.l3;
import qh.p3;
import qh.q3;
import qh.t8;
public final class i implements h5.d {
    public final int f16086a;
    public final Object f16087b;

    public i(Object obj, int i10) {
        this.f16086a = i10;
        this.f16087b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String str;
        boolean z4;
        switch (this.f16086a) {
            case 0:
                s sVar = (s) this.f16087b;
                sVar.N = (TL_stories.TL_premium_boostsStatus) obj;
                if (!sVar.B.keySet().equals(sVar.D.keySet())) {
                    sVar.Y(false);
                    return;
                }
                return;
            case 1:
                f4 f4Var = (f4) this.f16087b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    i9 i9Var = f4Var.G0;
                    if (i9Var != null) {
                        i9Var.f17274h1 = false;
                        i9Var.P();
                        return;
                    }
                    return;
                }
                f4Var.G3 = tL_premium_boostsStatus;
                MessagesController.getInstance(f4Var.f17135z2).getBoostsController().userCanBoostChannel(f4Var.f17130y1, tL_premium_boostsStatus, new a2(0, f4Var, tL_premium_boostsStatus));
                return;
            case 2:
                e5 e5Var = (e5) obj;
                n5 n5Var = ((k5) this.f16087b).f17364e;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = n5Var.D;
                    if (i10 < arrayList.size()) {
                        if (e5Var != arrayList.get(i10)) {
                            ((e5) arrayList.get(i10)).getClass();
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                v7 v7Var = (v7) this.f16087b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                v7Var.f17872p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    v7Var.f17869m = true;
                    v7Var.f17868l = str;
                    v7Var.f17863f = TextUtils.isEmpty(str);
                    View view = v7Var.f17874r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = v7Var.f17875s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                q3 q3Var = (q3) this.f16087b;
                View view2 = (View) obj;
                l3 l3Var = q3Var.f45914b;
                if (view2 instanceof p3) {
                    l3Var.getClass();
                    int R = RecyclerView.R(view2);
                    h51 G = l3Var.V2.G(R);
                    if (G != null) {
                        p3 p3Var = (p3) view2;
                        p3Var.setPosition(q3Var.b(R));
                        if (q3Var.f45917f == G.d) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        p3Var.b(z4, true);
                        boolean contains = q3Var.f45916e.contains(Integer.valueOf(G.d));
                        if (p3Var.f45886f != contains) {
                            p3Var.f45886f = contains;
                            p3Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                l3 l3Var2 = (l3) this.f16087b;
                View view3 = (View) obj;
                if (view3 instanceof p3) {
                    t8 t8Var = l3Var2.c3;
                    t8Var.f45914b.getClass();
                    ((p3) view3).setPosition(t8Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            default:
                i6.T((i6) this.f16087b, (Long) obj);
                return;
        }
    }
}
