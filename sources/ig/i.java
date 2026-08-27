package ig;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import jh.c5;
import jh.e4;
import jh.h5;
import jh.i9;
import jh.k5;
import jh.v7;
import jh.y1;
import lh.f4;
import lh.j4;
import lh.k4;
import lh.ka;
import lh.r7;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.n41;

public final class i implements d5.d {

    public final int f11319a;

    public final Object f11320b;

    public i(Object obj, int i10) {
        this.f11319a = i10;
        this.f11320b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String str;
        switch (this.f11319a) {
            case 0:
                s sVar = (s) this.f11320b;
                sVar.M = (TL_stories.TL_premium_boostsStatus) obj;
                if (!sVar.A.keySet().equals(sVar.C.keySet())) {
                    sVar.Y(false);
                }
                break;
            case 1:
                e4 e4Var = (e4) this.f11320b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    e4Var.F3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(e4Var.f13296y2).getBoostsController().userCanBoostChannel(e4Var.f13291x1, tL_premium_boostsStatus, new y1(0, e4Var, tL_premium_boostsStatus));
                } else {
                    i9 i9Var = e4Var.F0;
                    if (i9Var != null) {
                        i9Var.f13482g1 = false;
                        i9Var.P();
                    }
                }
                break;
            case 2:
                c5 c5Var = (c5) obj;
                k5 k5Var = ((h5) this.f11320b).f13387e;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = k5Var.C;
                    if (i10 < arrayList.size()) {
                        if (c5Var != arrayList.get(i10)) {
                            ((c5) arrayList.get(i10)).getClass();
                        }
                        i10++;
                    }
                    break;
                }
                break;
            case 3:
                v7 v7Var = (v7) this.f11320b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                v7Var.f14071p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    v7Var.f14068m = true;
                    v7Var.f14067l = str;
                    v7Var.f14062f = TextUtils.isEmpty(str);
                    View view = v7Var.f14073r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = v7Var.f14074s;
                    if (runnable != null) {
                        runnable.run();
                    }
                    break;
                }
                break;
            case 4:
                k4 k4Var = (k4) this.f11320b;
                View view2 = (View) obj;
                f4 f4Var = k4Var.f16228b;
                if (view2 instanceof j4) {
                    f4Var.getClass();
                    int iR = RecyclerView.R(view2);
                    n41 n41VarG = f4Var.U2.G(iR);
                    if (n41VarG != null) {
                        j4 j4Var = (j4) view2;
                        j4Var.setPosition(k4Var.b(iR));
                        j4Var.b(k4Var.f16231f == n41VarG.d, true);
                        boolean zContains = k4Var.f16230e.contains(Integer.valueOf(n41VarG.d));
                        if (j4Var.f16178f != zContains) {
                            j4Var.f16178f = zContains;
                            j4Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 5:
                f4 f4Var2 = (f4) this.f11320b;
                View view3 = (View) obj;
                if (view3 instanceof j4) {
                    ka kaVar = f4Var2.f15956b3;
                    kaVar.f16228b.getClass();
                    ((j4) view3).setPosition(kaVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                }
                break;
            default:
                r7.T((r7) this.f11320b, (Long) obj);
                break;
        }
    }
}
