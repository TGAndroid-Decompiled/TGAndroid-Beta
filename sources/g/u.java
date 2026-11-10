package g;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c8.ub;
import m.k1;
import m.m3;
import r0.i0;
public abstract class u extends androidx.activity.m {
    public s d;
    public final t f13382e;

    public u(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.u.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.k();
        ((ViewGroup) sVar.J.findViewById(16908290)).addView(view, layoutParams);
        sVar.h.a(sVar.f13364f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i7 = g.f13324a;
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
        if (sVar.f13367h0) {
            sVar.f13364f.getDecorView().removeCallbacks(sVar.f13369j0);
        }
        sVar.Z = true;
        if (sVar.f13359b0 != -100) {
            u uVar2 = sVar.d;
        }
        s.f13355q0.remove(sVar.d.getClass().getName());
        o oVar = sVar.f13365f0;
        if (oVar != null) {
            oVar.c();
        }
        o oVar2 = sVar.f13366g0;
        if (oVar2 != null) {
            oVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ub.b(this.f13382e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i7) {
        s sVar = (s) c();
        sVar.k();
        return sVar.f13364f.findViewById(i7);
    }

    @Override
    public final void invalidateOptionsMenu() {
        s sVar = (s) c();
        if (sVar.f13372n != null) {
            sVar.p().getClass();
            sVar.q(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        s sVar = (s) c();
        LayoutInflater from = LayoutInflater.from(sVar.f13362e);
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
        ac.d dVar;
        super.onStop();
        b0 p10 = ((s) c()).p();
        if (p10 != null && (dVar = p10.f13294s) != null) {
            dVar.a();
        }
    }

    @Override
    public final void setContentView(int i7) {
        s sVar = (s) c();
        sVar.k();
        ViewGroup viewGroup = (ViewGroup) sVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(sVar.f13362e).inflate(i7, viewGroup);
        sVar.h.a(sVar.f13364f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        s sVar = (s) c();
        sVar.f13376r = charSequence;
        k1 k1Var = sVar.f13377s;
        if (k1Var != null) {
            k1Var.setWindowTitle(charSequence);
            return;
        }
        b0 b0Var = sVar.f13372n;
        if (b0Var != null) {
            m3 m3Var = (m3) b0Var.f13281e;
            if (m3Var.f19172g) {
                return;
            }
            Toolbar toolbar = m3Var.f19167a;
            m3Var.h = charSequence;
            if ((m3Var.f19168b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (m3Var.f19172g) {
                    i0.k(toolbar.getRootView(), charSequence);
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
        sVar.h.a(sVar.f13364f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.k();
        ViewGroup viewGroup = (ViewGroup) sVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        sVar.h.a(sVar.f13364f.getCallback());
    }

    @Override
    public void setTitle(int i7) {
        super.setTitle(i7);
        g c10 = c();
        String string = getContext().getString(i7);
        s sVar = (s) c10;
        sVar.f13376r = string;
        k1 k1Var = sVar.f13377s;
        if (k1Var != null) {
            k1Var.setWindowTitle(string);
            return;
        }
        b0 b0Var = sVar.f13372n;
        if (b0Var != null) {
            m3 m3Var = (m3) b0Var.f13281e;
            if (m3Var.f19172g) {
                return;
            }
            Toolbar toolbar = m3Var.f19167a;
            m3Var.h = string;
            if ((m3Var.f19168b & 8) != 0) {
                toolbar.setTitle(string);
                if (m3Var.f19172g) {
                    i0.k(toolbar.getRootView(), string);
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
