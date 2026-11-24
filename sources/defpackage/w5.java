package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
public final class w5 extends AnimatorListenerAdapter {
    public final byte a = 1;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final KeyEvent.Callback e;

    public w5(a aVar, ArrayList arrayList, boolean z, boolean z2) {
        this.e = aVar;
        this.d = arrayList;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        sy1 sy1Var;
        rc2 rc2Var;
        ViewGroup viewGroup;
        a67 a67Var;
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        KeyEvent.Callback callback = this.e;
        Object obj = this.d;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                a aVar = (a) callback;
                lka[] lkaVarArr = aVar.n;
                for (int i = 0; i < arrayList.size(); i++) {
                    View view = (View) arrayList.get(i);
                    if (z2) {
                        view.setVisibility(4);
                        view.setAlpha(0.0f);
                    } else {
                        view.setAlpha(1.0f);
                    }
                }
                if (z2 && !z) {
                    lka lkaVar = lkaVarArr[0];
                    if (lkaVar != null) {
                        lkaVar.setVisibility(8);
                    }
                    lka lkaVar2 = lkaVarArr[1];
                    if (lkaVar2 != null) {
                        lkaVar2.setVisibility(8);
                    }
                }
                bf0 bf0Var = aVar.f;
                if (bf0Var != null && !z2) {
                    bf0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                Runnable runnable = (Runnable) obj;
                j67 j67Var = (j67) callback;
                f67 f67Var = j67Var.K;
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                j67Var.E = f;
                j67Var.x = false;
                j67Var.y = false;
                j67Var.H.setAlpha(f);
                if (z2) {
                    j67Var.w = false;
                    j67Var.s = false;
                }
                sy1 sy1Var2 = j67Var.S;
                if (sy1Var2 != null) {
                    sy1Var2.setAlpha(1.0f);
                }
                yh4 yh4Var = j67Var.m0;
                if (yh4Var != null && !z2) {
                    yh4Var.I(false);
                }
                rc2 rc2Var2 = j67Var.v0;
                if (rc2Var2 != null) {
                    rc2Var2.setVisibility(0);
                }
                if (!j67Var.r) {
                    j67Var.o(false, 1.0f);
                }
                if (!z2 && (a67Var = j67Var.X) != null) {
                    a67Var.setAlpha(0.0f);
                }
                if (!z && (viewGroup = j67Var.Z) != null) {
                    viewGroup.setAlpha(j67Var.E);
                }
                f67Var.invalidate();
                f67Var.setAlpha(j67Var.E);
                j67Var.F.invalidate();
                j67Var.G.invalidate();
                if (runnable != null) {
                    if (!z2 && (rc2Var = j67Var.v0) != null && rc2Var.isAttachedToWindow()) {
                        j67Var.v0.post(runnable);
                        return;
                    } else if (!z2 && (sy1Var = j67Var.S) != null && sy1Var.isAttachedToWindow()) {
                        j67Var.S.post(runnable);
                        return;
                    } else {
                        gm.c3(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public w5(j67 j67Var, boolean z, boolean z2, Runnable runnable) {
        this.e = j67Var;
        this.b = z;
        this.c = z2;
        this.d = runnable;
    }
}
