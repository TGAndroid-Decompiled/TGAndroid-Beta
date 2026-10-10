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
import m.m3;
import r0.i0;
import w7.x6;
public abstract class t extends androidx.activity.m {
    public r d;
    public final s f10191e;

    public t(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.t.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.k();
        ((ViewGroup) rVar.J.findViewById(16908290)).addView(view, layoutParams);
        rVar.h.a(rVar.f10173f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i10 = g.f10134a;
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
        if (rVar.f10176h0) {
            rVar.f10173f.getDecorView().removeCallbacks(rVar.f10178j0);
        }
        rVar.Z = true;
        if (rVar.f10168b0 != -100) {
            t tVar2 = rVar.d;
        }
        r.f10164q0.remove(rVar.d.getClass().getName());
        n nVar = rVar.f10174f0;
        if (nVar != null) {
            nVar.c();
        }
        n nVar2 = rVar.f10175g0;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return x6.b(this.f10191e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i10) {
        r rVar = (r) c();
        rVar.k();
        return rVar.f10173f.findViewById(i10);
    }

    @Override
    public final void invalidateOptionsMenu() {
        r rVar = (r) c();
        if (rVar.f10181n != null) {
            rVar.q().getClass();
            rVar.r(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        r rVar = (r) c();
        LayoutInflater from = LayoutInflater.from(rVar.f10171e);
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
        a0 q6 = ((r) c()).q();
        if (q6 != null && (dVar = q6.f10093s) != null) {
            dVar.a();
        }
    }

    @Override
    public final void setContentView(int i10) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(rVar.f10171e).inflate(i10, viewGroup);
        rVar.h.a(rVar.f10173f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        r rVar = (r) c();
        rVar.f10185r = charSequence;
        j1 j1Var = rVar.f10186s;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        a0 a0Var = rVar.f10181n;
        if (a0Var != null) {
            m3 m3Var = (m3) a0Var.f10080e;
            if (m3Var.f15744g) {
                return;
            }
            Toolbar toolbar = m3Var.f15739a;
            m3Var.h = charSequence;
            if ((m3Var.f15740b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (m3Var.f15744g) {
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
        rVar.h.a(rVar.f10173f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        rVar.h.a(rVar.f10173f.getCallback());
    }

    @Override
    public void setTitle(int i10) {
        super.setTitle(i10);
        g c10 = c();
        String string = getContext().getString(i10);
        r rVar = (r) c10;
        rVar.f10185r = string;
        j1 j1Var = rVar.f10186s;
        if (j1Var != null) {
            j1Var.setWindowTitle(string);
            return;
        }
        a0 a0Var = rVar.f10181n;
        if (a0Var != null) {
            m3 m3Var = (m3) a0Var.f10080e;
            if (m3Var.f15744g) {
                return;
            }
            Toolbar toolbar = m3Var.f15739a;
            m3Var.h = string;
            if ((m3Var.f15740b & 8) != 0) {
                toolbar.setTitle(string);
                if (m3Var.f15744g) {
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
