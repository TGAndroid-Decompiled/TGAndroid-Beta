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
import m.n3;
import r0.i0;
import w7.v6;
public abstract class u extends androidx.activity.n {
    public s d;
    public final t e;

    public u(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.u.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.k();
        ((ViewGroup) sVar.J.findViewById(16908290)).addView(view, layoutParams);
        sVar.h.a(sVar.f8426f.getCallback());
    }

    public final h c() {
        if (this.d == null) {
            int i10 = h.f8391a;
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
        if (sVar.f8429h0) {
            sVar.f8426f.getDecorView().removeCallbacks(sVar.f8431j0);
        }
        sVar.Z = true;
        if (sVar.f8422b0 != -100) {
            u uVar2 = sVar.d;
        }
        s.f8418q0.remove(sVar.d.getClass().getName());
        o oVar = sVar.f8427f0;
        if (oVar != null) {
            oVar.c();
        }
        o oVar2 = sVar.f8428g0;
        if (oVar2 != null) {
            oVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return v6.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i10) {
        s sVar = (s) c();
        sVar.k();
        return sVar.f8426f.findViewById(i10);
    }

    @Override
    public final void invalidateOptionsMenu() {
        s sVar = (s) c();
        if (sVar.f8434n != null) {
            sVar.q().getClass();
            sVar.r(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        s sVar = (s) c();
        LayoutInflater from = LayoutInflater.from(sVar.e);
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
        c0 q6 = ((s) c()).q();
        if (q6 != null && (dVar = q6.f8362s) != null) {
            dVar.a();
        }
    }

    @Override
    public final void setContentView(int i10) {
        s sVar = (s) c();
        sVar.k();
        ViewGroup viewGroup = (ViewGroup) sVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(sVar.e).inflate(i10, viewGroup);
        sVar.h.a(sVar.f8426f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        s sVar = (s) c();
        sVar.f8438r = charSequence;
        j1 j1Var = sVar.f8439s;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        c0 c0Var = sVar.f8434n;
        if (c0Var != null) {
            n3 n3Var = (n3) c0Var.e;
            if (n3Var.f13082g) {
                return;
            }
            Toolbar toolbar = n3Var.f13078a;
            n3Var.h = charSequence;
            if ((n3Var.f13079b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (n3Var.f13082g) {
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
        sVar.h.a(sVar.f8426f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.k();
        ViewGroup viewGroup = (ViewGroup) sVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        sVar.h.a(sVar.f8426f.getCallback());
    }

    @Override
    public void setTitle(int i10) {
        super.setTitle(i10);
        h c10 = c();
        String string = getContext().getString(i10);
        s sVar = (s) c10;
        sVar.f8438r = string;
        j1 j1Var = sVar.f8439s;
        if (j1Var != null) {
            j1Var.setWindowTitle(string);
            return;
        }
        c0 c0Var = sVar.f8434n;
        if (c0Var != null) {
            n3 n3Var = (n3) c0Var.e;
            if (n3Var.f13082g) {
                return;
            }
            Toolbar toolbar = n3Var.f13078a;
            n3Var.h = string;
            if ((n3Var.f13079b & 8) != 0) {
                toolbar.setTitle(string);
                if (n3Var.f13082g) {
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
