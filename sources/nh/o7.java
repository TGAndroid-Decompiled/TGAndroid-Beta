package nh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.x50;
public final class o7 extends m2.a {
    public final ArrayList f15710c = new ArrayList();
    public final Context d;
    public final i9 e;
    public final org.telegram.ui.ActionBar.f6 f15711f;
    public final y8 f15712g;

    public o7(y8 y8Var, Context context, i9 i9Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f15712g = y8Var;
        this.d = context;
        this.e = i9Var;
        this.f15711f = f6Var;
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        hVar.removeView(frameLayout);
        d4 d4Var = (d4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(d4Var);
        this.f15710c.add(d4Var);
    }

    @Override
    public final int b() {
        y8 y8Var = this.f15712g;
        ArrayList arrayList = y8Var.f15846u0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return y8Var.f15849x0.size();
    }

    @Override
    public final Object e(m2.h hVar, int i10) {
        d4 n7Var;
        long dialogId;
        Context context = this.d;
        y8 y8Var = this.f15712g;
        q7 q7Var = new q7(y8Var, context);
        ArrayList arrayList = this.f15710c;
        boolean isEmpty = arrayList.isEmpty();
        i9 i9Var = this.e;
        if (!isEmpty) {
            n7Var = (d4) arrayList.remove(0);
            n7Var.l1.f16112a.getImageReceiver().setVisible(true, true);
            if (n7Var.f15186b2 != null) {
                n7Var.Y1.P0();
                n7Var.Y1.setAlpha(1.0f - n7Var.f15184a4);
            }
            pk0 pk0Var = n7Var.f15189c2;
            if (pk0Var != null) {
                pk0Var.n();
            }
            pk0 pk0Var2 = n7Var.f15224o3;
            if (pk0Var2 != null) {
                pk0Var2.n();
            }
            x50 x50Var = n7Var.G2;
            if (x50Var != null) {
                AndroidUtilities.removeFromParent(x50Var);
                n7Var.G2.h(true);
                n7Var.G2 = null;
            }
            n7Var.setActive(false);
            n7Var.setIsVisible(false);
            n7Var.I2 = false;
            n7Var.L2.d(0.0f, false);
            n7Var.f15205i1 = null;
            n7Var.f15198f3 = false;
            n7Var.p0();
        } else {
            n7Var = new n7(this, this.d, i9Var, y8Var.E0, this.f15711f);
        }
        q7Var.f15807a = n7Var;
        n7Var.setAccount(y8Var.f15847v0);
        n7Var.setDelegate(y8Var.f15850y0);
        n7Var.setLongpressed(i9Var.X0);
        q7Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = y8Var.f15846u0;
        if (arrayList2 != null) {
            if (i9Var.O0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            q7Var.f15809c = arrayList3;
            l6 l6Var = i9Var.L0;
            if (!(l6Var instanceof f6) && !(l6Var instanceof o6)) {
                q7Var.f15808b = y8Var.f15845t0;
            } else {
                MessageObject f10 = l6Var.f(((Integer) arrayList3.get(0)).intValue());
                if (f10 == null) {
                    dialogId = y8Var.f15845t0;
                } else {
                    dialogId = f10.getDialogId();
                }
                q7Var.f15808b = dialogId;
            }
        } else {
            q7Var.f15809c = null;
            q7Var.f15808b = ((Long) y8Var.f15849x0.get(i10)).longValue();
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
