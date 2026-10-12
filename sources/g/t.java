package g;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import m.k1;
import m.n3;
import r0.i0;
import w7.x6;
public abstract class t extends androidx.activity.m {
    public r d;
    public final s f10189e;

    public t(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.t.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.k();
        ((ViewGroup) rVar.J.findViewById(16908290)).addView(view, layoutParams);
        rVar.h.a(rVar.f10171f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i10 = g.f10132a;
            this.d = new r(this, this);
        }
        return this.d;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        r rVar = (r) c();
        t tVar = rVar.d;
        if (rVar.f10174h0) {
            rVar.f10171f.getDecorView().removeCallbacks(rVar.f10176j0);
        }
        rVar.Z = true;
        if (rVar.f10166b0 != -100) {
            t tVar2 = rVar.d;
        }
        r.f10162q0.remove(rVar.d.getClass().getName());
        n nVar = rVar.f10172f0;
        if (nVar != null) {
            nVar.c();
        }
        n nVar2 = rVar.f10173g0;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return x6.b(this.f10189e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i10) {
        r rVar = (r) c();
        rVar.k();
        return rVar.f10171f.findViewById(i10);
    }

    @Override
    public final void invalidateOptionsMenu() {
        r rVar = (r) c();
        if (rVar.f10179n != null) {
            rVar.p().getClass();
            rVar.q(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        r rVar = (r) c();
        LayoutInflater from = LayoutInflater.from(rVar.f10169e);
        if (from.getFactory() == null) {
            from.setFactory2(rVar);
        } else if (!(from.getFactory2() instanceof r)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        c().a();
    }

    @Override
    public final void onStop() {
        bc.d dVar;
        super.onStop();
        a0 p5 = ((r) c()).p();
        if (p5 != null && (dVar = p5.f10091s) != null) {
            dVar.a();
        }
    }

    @Override
    public final void setContentView(int i10) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(rVar.f10169e).inflate(i10, viewGroup);
        rVar.h.a(rVar.f10171f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        r rVar = (r) c();
        rVar.f10183r = charSequence;
        k1 k1Var = rVar.f10184s;
        if (k1Var != null) {
            k1Var.setWindowTitle(charSequence);
            return;
        }
        a0 a0Var = rVar.f10179n;
        if (a0Var != null) {
            n3 n3Var = (n3) a0Var.f10078e;
            if (n3Var.f15502g) {
                return;
            }
            Toolbar toolbar = n3Var.f15497a;
            n3Var.h = charSequence;
            if ((n3Var.f15498b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (n3Var.f15502g) {
                    i0.k(toolbar.getRootView(), charSequence);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = rVar.K;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override
    public final void setContentView(View view) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        rVar.h.a(rVar.f10171f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        rVar.h.a(rVar.f10171f.getCallback());
    }

    @Override
    public void setTitle(int i10) {
        super.setTitle(i10);
        g c10 = c();
        String string = getContext().getString(i10);
        r rVar = (r) c10;
        rVar.f10183r = string;
        k1 k1Var = rVar.f10184s;
        if (k1Var != null) {
            k1Var.setWindowTitle(string);
            return;
        }
        a0 a0Var = rVar.f10179n;
        if (a0Var != null) {
            n3 n3Var = (n3) a0Var.f10078e;
            if (n3Var.f15502g) {
                return;
            }
            Toolbar toolbar = n3Var.f15497a;
            n3Var.h = string;
            if ((n3Var.f15498b & 8) != 0) {
                toolbar.setTitle(string);
                if (n3Var.f15502g) {
                    i0.k(toolbar.getRootView(), string);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = rVar.K;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
