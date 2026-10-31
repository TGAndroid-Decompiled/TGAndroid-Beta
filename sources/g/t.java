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
import r0.h0;
import w7.v6;
public abstract class t extends androidx.activity.n {
    public r d;
    public final s e;

    public t(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.t.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.k();
        ((ViewGroup) rVar.J.findViewById(16908290)).addView(view, layoutParams);
        rVar.h.a(rVar.f7228f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i10 = g.f7193a;
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
        if (rVar.f7231h0) {
            rVar.f7228f.getDecorView().removeCallbacks(rVar.f7233j0);
        }
        rVar.Z = true;
        if (rVar.f7224b0 != -100) {
            t tVar2 = rVar.d;
        }
        r.f7220q0.remove(rVar.d.getClass().getName());
        n nVar = rVar.f7229f0;
        if (nVar != null) {
            nVar.c();
        }
        n nVar2 = rVar.f7230g0;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return v6.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i10) {
        r rVar = (r) c();
        rVar.k();
        return rVar.f7228f.findViewById(i10);
    }

    @Override
    public final void invalidateOptionsMenu() {
        r rVar = (r) c();
        if (rVar.f7236n != null) {
            rVar.q().getClass();
            rVar.r(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        r rVar = (r) c();
        LayoutInflater from = LayoutInflater.from(rVar.e);
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
        k.j jVar;
        super.onStop();
        b0 q6 = ((r) c()).q();
        if (q6 != null && (jVar = q6.f7164s) != null) {
            jVar.a();
        }
    }

    @Override
    public final void setContentView(int i10) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(rVar.e).inflate(i10, viewGroup);
        rVar.h.a(rVar.f7228f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        r rVar = (r) c();
        rVar.f7240r = charSequence;
        j1 j1Var = rVar.f7241s;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        b0 b0Var = rVar.f7236n;
        if (b0Var != null) {
            l3 l3Var = (l3) b0Var.e;
            if (l3Var.f12462g) {
                return;
            }
            Toolbar toolbar = l3Var.f12458a;
            l3Var.h = charSequence;
            if ((l3Var.f12459b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (l3Var.f12462g) {
                    h0.k(toolbar.getRootView(), charSequence);
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
        rVar.h.a(rVar.f7228f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        rVar.h.a(rVar.f7228f.getCallback());
    }

    @Override
    public void setTitle(int i10) {
        super.setTitle(i10);
        g c10 = c();
        String string = getContext().getString(i10);
        r rVar = (r) c10;
        rVar.f7240r = string;
        j1 j1Var = rVar.f7241s;
        if (j1Var != null) {
            j1Var.setWindowTitle(string);
            return;
        }
        b0 b0Var = rVar.f7236n;
        if (b0Var != null) {
            l3 l3Var = (l3) b0Var.e;
            if (l3Var.f12462g) {
                return;
            }
            Toolbar toolbar = l3Var.f12458a;
            l3Var.h = string;
            if ((l3Var.f12459b & 8) != 0) {
                toolbar.setTitle(string);
                if (l3Var.f12462g) {
                    h0.k(toolbar.getRootView(), string);
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
