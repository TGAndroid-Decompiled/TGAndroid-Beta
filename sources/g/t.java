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
    public final s f10190e;

    public t(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.t.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.k();
        ((ViewGroup) rVar.J.findViewById(16908290)).addView(view, layoutParams);
        rVar.h.a(rVar.f10172f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i10 = g.f10133a;
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
        if (rVar.f10175h0) {
            rVar.f10172f.getDecorView().removeCallbacks(rVar.f10177j0);
        }
        rVar.Z = true;
        if (rVar.f10167b0 != -100) {
            t tVar2 = rVar.d;
        }
        r.f10163q0.remove(rVar.d.getClass().getName());
        n nVar = rVar.f10173f0;
        if (nVar != null) {
            nVar.c();
        }
        n nVar2 = rVar.f10174g0;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return x6.b(this.f10190e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i10) {
        r rVar = (r) c();
        rVar.k();
        return rVar.f10172f.findViewById(i10);
    }

    @Override
    public final void invalidateOptionsMenu() {
        r rVar = (r) c();
        if (rVar.f10180n != null) {
            rVar.q().getClass();
            rVar.r(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        r rVar = (r) c();
        LayoutInflater from = LayoutInflater.from(rVar.f10170e);
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
        if (q6 != null && (dVar = q6.f10092s) != null) {
            dVar.a();
        }
    }

    @Override
    public final void setContentView(int i10) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(rVar.f10170e).inflate(i10, viewGroup);
        rVar.h.a(rVar.f10172f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        r rVar = (r) c();
        rVar.f10184r = charSequence;
        j1 j1Var = rVar.f10185s;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        a0 a0Var = rVar.f10180n;
        if (a0Var != null) {
            m3 m3Var = (m3) a0Var.f10079e;
            if (m3Var.f15801g) {
                return;
            }
            Toolbar toolbar = m3Var.f15796a;
            m3Var.h = charSequence;
            if ((m3Var.f15797b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (m3Var.f15801g) {
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
        rVar.h.a(rVar.f10172f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        rVar.h.a(rVar.f10172f.getCallback());
    }

    @Override
    public void setTitle(int i10) {
        super.setTitle(i10);
        g c10 = c();
        String string = getContext().getString(i10);
        r rVar = (r) c10;
        rVar.f10184r = string;
        j1 j1Var = rVar.f10185s;
        if (j1Var != null) {
            j1Var.setWindowTitle(string);
            return;
        }
        a0 a0Var = rVar.f10180n;
        if (a0Var != null) {
            m3 m3Var = (m3) a0Var.f10079e;
            if (m3Var.f15801g) {
                return;
            }
            Toolbar toolbar = m3Var.f15796a;
            m3Var.h = string;
            if ((m3Var.f15797b & 8) != 0) {
                toolbar.setTitle(string);
                if (m3Var.f15801g) {
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
