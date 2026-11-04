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
import m.k3;
import r0.i0;
public abstract class u extends androidx.activity.m {
    public s d;
    public final t f11765e;

    public u(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.u.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.l();
        ((ViewGroup) sVar.K.findViewById(16908290)).addView(view, layoutParams);
        sVar.h.a(sVar.f11746f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i3 = g.f11706a;
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
        if (sVar.f11750i0) {
            sVar.f11746f.getDecorView().removeCallbacks(sVar.f11752k0);
        }
        sVar.f11740a0 = true;
        if (sVar.f11742c0 != -100) {
            u uVar2 = sVar.d;
        }
        s.f11737r0.remove(sVar.d.getClass().getName());
        o oVar = sVar.f11748g0;
        if (oVar != null) {
            oVar.c();
        }
        o oVar2 = sVar.f11749h0;
        if (oVar2 != null) {
            oVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return x7.k.b(this.f11765e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i3) {
        s sVar = (s) c();
        sVar.l();
        return sVar.f11746f.findViewById(i3);
    }

    @Override
    public final void invalidateOptionsMenu() {
        s sVar = (s) c();
        if (sVar.f11754n != null) {
            sVar.q().getClass();
            sVar.r(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        s sVar = (s) c();
        LayoutInflater from = LayoutInflater.from(sVar.f11744e);
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
        k.j jVar;
        super.onStop();
        b0 q10 = ((s) c()).q();
        if (q10 != null && (jVar = q10.f11676s) != null) {
            jVar.a();
        }
    }

    @Override
    public final void setContentView(int i3) {
        s sVar = (s) c();
        sVar.l();
        ViewGroup viewGroup = (ViewGroup) sVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(sVar.f11744e).inflate(i3, viewGroup);
        sVar.h.a(sVar.f11746f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        s sVar = (s) c();
        sVar.f11759r = charSequence;
        j1 j1Var = sVar.f11760s;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        b0 b0Var = sVar.f11754n;
        if (b0Var != null) {
            k3 k3Var = (k3) b0Var.f11663e;
            if (k3Var.f18627g) {
                return;
            }
            Toolbar toolbar = k3Var.f18622a;
            k3Var.h = charSequence;
            if ((k3Var.f18623b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (k3Var.f18627g) {
                    i0.k(toolbar.getRootView(), charSequence);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = sVar.L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override
    public final void setContentView(View view) {
        s sVar = (s) c();
        sVar.l();
        ViewGroup viewGroup = (ViewGroup) sVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        sVar.h.a(sVar.f11746f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.l();
        ViewGroup viewGroup = (ViewGroup) sVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        sVar.h.a(sVar.f11746f.getCallback());
    }

    @Override
    public void setTitle(int i3) {
        super.setTitle(i3);
        g c2 = c();
        String string = getContext().getString(i3);
        s sVar = (s) c2;
        sVar.f11759r = string;
        j1 j1Var = sVar.f11760s;
        if (j1Var != null) {
            j1Var.setWindowTitle(string);
            return;
        }
        b0 b0Var = sVar.f11754n;
        if (b0Var != null) {
            k3 k3Var = (k3) b0Var.f11663e;
            if (k3Var.f18627g) {
                return;
            }
            Toolbar toolbar = k3Var.f18622a;
            k3Var.h = string;
            if ((k3Var.f18623b & 8) != 0) {
                toolbar.setTitle(string);
                if (k3Var.f18627g) {
                    i0.k(toolbar.getRootView(), string);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = sVar.L;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
