package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
public final class x5 extends AnimatorListenerAdapter {
    public final byte a = 0;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final KeyEvent.Callback e;

    public x5(a aVar, ArrayList arrayList, boolean z, boolean z2) {
        this.e = aVar;
        this.d = arrayList;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        tx1 tx1Var;
        wb2 wb2Var;
        ViewGroup viewGroup;
        h67 h67Var;
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        KeyEvent.Callback callback = this.e;
        Object obj = this.d;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                a aVar = (a) callback;
                ema[] emaVarArr = aVar.n;
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
                    ema emaVar = emaVarArr[0];
                    if (emaVar != null) {
                        emaVar.setVisibility(8);
                    }
                    ema emaVar2 = emaVarArr[1];
                    if (emaVar2 != null) {
                        emaVar2.setVisibility(8);
                    }
                }
                de0 de0Var = aVar.f;
                if (de0Var != null && !z2) {
                    de0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                Runnable runnable = (Runnable) obj;
                q67 q67Var = (q67) callback;
                m67 m67Var = q67Var.K;
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                q67Var.E = f;
                q67Var.x = false;
                q67Var.y = false;
                q67Var.H.setAlpha(f);
                if (z2) {
                    q67Var.w = false;
                    q67Var.s = false;
                }
                tx1 tx1Var2 = q67Var.S;
                if (tx1Var2 != null) {
                    tx1Var2.setAlpha(1.0f);
                }
                vh4 vh4Var = q67Var.m0;
                if (vh4Var != null && !z2) {
                    vh4Var.I(false);
                }
                wb2 wb2Var2 = q67Var.v0;
                if (wb2Var2 != null) {
                    wb2Var2.setVisibility(0);
                }
                if (!q67Var.r) {
                    q67Var.o(false, 1.0f);
                }
                if (!z2 && (h67Var = q67Var.X) != null) {
                    h67Var.setAlpha(0.0f);
                }
                if (!z && (viewGroup = q67Var.Z) != null) {
                    viewGroup.setAlpha(q67Var.E);
                }
                m67Var.invalidate();
                m67Var.setAlpha(q67Var.E);
                q67Var.F.invalidate();
                q67Var.G.invalidate();
                if (runnable != null) {
                    if (!z2 && (wb2Var = q67Var.v0) != null && wb2Var.isAttachedToWindow()) {
                        q67Var.v0.post(runnable);
                        return;
                    } else if (!z2 && (tx1Var = q67Var.S) != null && tx1Var.isAttachedToWindow()) {
                        q67Var.S.post(runnable);
                        return;
                    } else {
                        hl.c3(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public x5(q67 q67Var, boolean z, boolean z2, Runnable runnable) {
        this.e = q67Var;
        this.b = z;
        this.c = z2;
        this.d = runnable;
    }
}
