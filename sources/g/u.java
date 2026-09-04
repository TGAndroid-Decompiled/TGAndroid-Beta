package g;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import m.j1;
import m.l3;
import r0.i0;
import w7.v6;
public abstract class u extends androidx.activity.n {
    public s d;
    public final t f10257e;

    public u(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.u.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.k();
        ((ViewGroup) sVar.J.findViewById(16908290)).addView(view, layoutParams);
        sVar.h.a(sVar.f10239f.getCallback());
    }

    public final h c() {
        if (this.d == null) {
            int i10 = h.f10200a;
            this.d = new s(this, this);
        }
        return this.d;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        s sVar = (s) c();
        u uVar = sVar.d;
        if (sVar.f10242h0) {
            sVar.f10239f.getDecorView().removeCallbacks(sVar.f10244j0);
        }
        sVar.Z = true;
        if (sVar.f10234b0 != -100) {
            u uVar2 = sVar.d;
        }
        s.f10230q0.remove(sVar.d.getClass().getName());
        o oVar = sVar.f10240f0;
        if (oVar != null) {
            oVar.c();
        }
        o oVar2 = sVar.f10241g0;
        if (oVar2 != null) {
            oVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return v6.b(this.f10257e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i10) {
        s sVar = (s) c();
        sVar.k();
        return sVar.f10239f.findViewById(i10);
    }

    @Override
    public final void invalidateOptionsMenu() {
        s sVar = (s) c();
        if (sVar.f10247n != null) {
            sVar.q().getClass();
            sVar.r(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        s sVar = (s) c();
        LayoutInflater from = LayoutInflater.from(sVar.f10237e);
        if (from.getFactory() == null) {
            from.setFactory2(sVar);
        } else if (!(from.getFactory2() instanceof s)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        c().a();
    }

    @Override
    public final void onStop() {
        bc.d dVar;
        super.onStop();
        b0 q6 = ((s) c()).q();
        if (q6 != null && (dVar = q6.f10159s) != null) {
            dVar.a();
        }
    }

    @Override
    public final void setContentView(int i10) {
        s sVar = (s) c();
        sVar.k();
        ViewGroup viewGroup = (ViewGroup) sVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(sVar.f10237e).inflate(i10, viewGroup);
        sVar.h.a(sVar.f10239f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        s sVar = (s) c();
        sVar.f10251r = charSequence;
        j1 j1Var = sVar.f10252s;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        b0 b0Var = sVar.f10247n;
        if (b0Var != null) {
            l3 l3Var = (l3) b0Var.f10146e;
            if (l3Var.f15574g) {
                return;
            }
            Toolbar toolbar = l3Var.f15569a;
            l3Var.h = charSequence;
            if ((l3Var.f15570b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (l3Var.f15574g) {
                    i0.l(toolbar.getRootView(), charSequence);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = sVar.K;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override
    public final void setContentView(View view) {
        s sVar = (s) c();
        sVar.k();
        ViewGroup viewGroup = (ViewGroup) sVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        sVar.h.a(sVar.f10239f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.k();
        ViewGroup viewGroup = (ViewGroup) sVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        sVar.h.a(sVar.f10239f.getCallback());
    }

    @Override
    public void setTitle(int i10) {
        super.setTitle(i10);
        h c10 = c();
        String string = getContext().getString(i10);
        s sVar = (s) c10;
        sVar.f10251r = string;
        j1 j1Var = sVar.f10252s;
        if (j1Var != null) {
            j1Var.setWindowTitle(string);
            return;
        }
        b0 b0Var = sVar.f10247n;
        if (b0Var != null) {
            l3 l3Var = (l3) b0Var.f10146e;
            if (l3Var.f15574g) {
                return;
            }
            Toolbar toolbar = l3Var.f15569a;
            l3Var.h = string;
            if ((l3Var.f15570b & 8) != 0) {
                toolbar.setTitle(string);
                if (l3Var.f15574g) {
                    i0.l(toolbar.getRootView(), string);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = sVar.K;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
