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
import org.telegram.ui.Components.j51;
import qh.k6;
import qh.m3;
import qh.q3;
import qh.r3;
import qh.u8;
public final class i implements h5.d {
    public final int f16084a;
    public final Object f16085b;

    public i(Object obj, int i10) {
        this.f16084a = i10;
        this.f16085b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String str;
        boolean z4;
        switch (this.f16084a) {
            case 0:
                s sVar = (s) this.f16085b;
                sVar.N = (TL_stories.TL_premium_boostsStatus) obj;
                if (!sVar.B.keySet().equals(sVar.D.keySet())) {
                    sVar.Y(false);
                    return;
                }
                return;
            case 1:
                f4 f4Var = (f4) this.f16085b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    i9 i9Var = f4Var.G0;
                    if (i9Var != null) {
                        i9Var.f17272h1 = false;
                        i9Var.P();
                        return;
                    }
                    return;
                }
                f4Var.G3 = tL_premium_boostsStatus;
                MessagesController.getInstance(f4Var.f17133z2).getBoostsController().userCanBoostChannel(f4Var.f17128y1, tL_premium_boostsStatus, new a2(0, f4Var, tL_premium_boostsStatus));
                return;
            case 2:
                e5 e5Var = (e5) obj;
                n5 n5Var = ((k5) this.f16085b).f17362e;
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
                v7 v7Var = (v7) this.f16085b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                v7Var.f17870p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    v7Var.f17867m = true;
                    v7Var.f17866l = str;
                    v7Var.f17861f = TextUtils.isEmpty(str);
                    View view = v7Var.f17872r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = v7Var.f17873s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                r3 r3Var = (r3) this.f16085b;
                View view2 = (View) obj;
                m3 m3Var = r3Var.f45935b;
                if (view2 instanceof q3) {
                    m3Var.getClass();
                    int R = RecyclerView.R(view2);
                    j51 G = m3Var.V2.G(R);
                    if (G != null) {
                        q3 q3Var = (q3) view2;
                        q3Var.setPosition(r3Var.b(R));
                        if (r3Var.f45938f == G.d) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        q3Var.b(z4, true);
                        boolean contains = r3Var.f45937e.contains(Integer.valueOf(G.d));
                        if (q3Var.f45904f != contains) {
                            q3Var.f45904f = contains;
                            q3Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                m3 m3Var2 = (m3) this.f16085b;
                View view3 = (View) obj;
                if (view3 instanceof q3) {
                    u8 u8Var = m3Var2.c3;
                    u8Var.f45935b.getClass();
                    ((q3) view3).setPosition(u8Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            default:
                k6.T((k6) this.f16085b, (Long) obj);
                return;
        }
    }
}
