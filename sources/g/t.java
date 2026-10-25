package g;

import a8.qf;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import m.j1;
import m.n3;
import r0.i0;
public abstract class t extends androidx.activity.m {
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
        rVar.h.a(rVar.f12175f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i10 = g.f12140a;
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
        if (rVar.f12178h0) {
            rVar.f12175f.getDecorView().removeCallbacks(rVar.f12180j0);
        }
        rVar.Z = true;
        if (rVar.f12171b0 != -100) {
            t tVar2 = rVar.d;
        }
        r.f12167q0.remove(rVar.d.getClass().getName());
        n nVar = rVar.f12176f0;
        if (nVar != null) {
            nVar.c();
        }
        n nVar2 = rVar.f12177g0;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return qf.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i10) {
        r rVar = (r) c();
        rVar.k();
        return rVar.f12175f.findViewById(i10);
    }

    @Override
    public final void invalidateOptionsMenu() {
        r rVar = (r) c();
        if (rVar.f12183n != null) {
            rVar.p().getClass();
            rVar.q(0);
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
        dc.d dVar;
        super.onStop();
        a0 p10 = ((r) c()).p();
        if (p10 != null && (dVar = p10.f12101s) != null) {
            dVar.a();
        }
    }

    @Override
    public final void setContentView(int i10) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(rVar.e).inflate(i10, viewGroup);
        rVar.h.a(rVar.f12175f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        r rVar = (r) c();
        rVar.f12187r = charSequence;
        j1 j1Var = rVar.f12188s;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        a0 a0Var = rVar.f12183n;
        if (a0Var != null) {
            n3 n3Var = (n3) a0Var.e;
            if (n3Var.f17789g) {
                return;
            }
            Toolbar toolbar = n3Var.f17785a;
            n3Var.h = charSequence;
            if ((n3Var.f17786b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (n3Var.f17789g) {
                    i0.l(toolbar.getRootView(), charSequence);
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
        rVar.h.a(rVar.f12175f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        rVar.h.a(rVar.f12175f.getCallback());
    }

    @Override
    public void setTitle(int i10) {
        super.setTitle(i10);
        g c10 = c();
        String string = getContext().getString(i10);
        r rVar = (r) c10;
        rVar.f12187r = string;
        j1 j1Var = rVar.f12188s;
        if (j1Var != null) {
            j1Var.setWindowTitle(string);
            return;
        }
        a0 a0Var = rVar.f12183n;
        if (a0Var != null) {
            n3 n3Var = (n3) a0Var.e;
            if (n3Var.f17789g) {
                return;
            }
            Toolbar toolbar = n3Var.f17785a;
            n3Var.h = string;
            if ((n3Var.f17786b & 8) != 0) {
                toolbar.setTitle(string);
                if (n3Var.f17789g) {
                    i0.l(toolbar.getRootView(), string);
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
