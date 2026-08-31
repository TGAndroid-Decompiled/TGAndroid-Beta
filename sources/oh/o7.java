package oh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.z50;
public final class o7 extends m2.a {
    public final ArrayList f17555c = new ArrayList();
    public final Context d;
    public final i9 f17556e;
    public final org.telegram.ui.ActionBar.g6 f17557f;
    public final y8 f17558g;

    public o7(y8 y8Var, Context context, i9 i9Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f17558g = y8Var;
        this.d = context;
        this.f17556e = i9Var;
        this.f17557f = g6Var;
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        hVar.removeView(frameLayout);
        f4 f4Var = (f4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(f4Var);
        this.f17555c.add(f4Var);
    }

    @Override
    public final int b() {
        y8 y8Var = this.f17558g;
        ArrayList arrayList = y8Var.f17694u0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return y8Var.f17697x0.size();
    }

    @Override
    public final Object e(m2.h hVar, int i10) {
        f4 n7Var;
        long dialogId;
        Context context = this.d;
        y8 y8Var = this.f17558g;
        q7 q7Var = new q7(y8Var, context);
        ArrayList arrayList = this.f17555c;
        boolean isEmpty = arrayList.isEmpty();
        i9 i9Var = this.f17556e;
        if (!isEmpty) {
            n7Var = (f4) arrayList.remove(0);
            n7Var.l1.f16886a.getImageReceiver().setVisible(true, true);
            if (n7Var.f17056b2 != null) {
                n7Var.Y1.P0();
                n7Var.Y1.setAlpha(1.0f - n7Var.f17054a4);
            }
            rk0 rk0Var = n7Var.f17059c2;
            if (rk0Var != null) {
                rk0Var.n();
            }
            rk0 rk0Var2 = n7Var.f17094o3;
            if (rk0Var2 != null) {
                rk0Var2.n();
            }
            z50 z50Var = n7Var.G2;
            if (z50Var != null) {
                AndroidUtilities.removeFromParent(z50Var);
                n7Var.G2.h(true);
                n7Var.G2 = null;
            }
            n7Var.setActive(false);
            n7Var.setIsVisible(false);
            n7Var.I2 = false;
            n7Var.L2.d(0.0f, false);
            n7Var.f17075i1 = null;
            n7Var.f17068f3 = false;
            n7Var.p0();
        } else {
            n7Var = new n7(this, this.d, i9Var, y8Var.E0, this.f17557f);
        }
        q7Var.f17662a = n7Var;
        n7Var.setAccount(y8Var.f17695v0);
        n7Var.setDelegate(y8Var.f17698y0);
        n7Var.setLongpressed(i9Var.X0);
        q7Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = y8Var.f17694u0;
        if (arrayList2 != null) {
            if (i9Var.O0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            q7Var.f17664c = arrayList3;
            l6 l6Var = i9Var.L0;
            if (!(l6Var instanceof f6) && !(l6Var instanceof o6)) {
                q7Var.f17663b = y8Var.f17693t0;
            } else {
                MessageObject f10 = l6Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f10 == null) {
                    dialogId = y8Var.f17693t0;
                } else {
                    dialogId = f10.getDialogId();
                }
                q7Var.f17663b = dialogId;
            }
        } else {
            q7Var.f17664c = null;
            q7Var.f17663b = ((Long) y8Var.f17697x0.get(i10)).longValue();
        }
        q7Var.addView(n7Var);
        n7Var.requestLayout();
        hVar.addView(q7Var);
        return q7Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
