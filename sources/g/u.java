package g;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c8.vb;
import m.j1;
import m.k3;
import r0.i0;
public abstract class u extends androidx.activity.m {
    public s d;
    public final t f12731e;

    public u(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.u.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.l();
        ((ViewGroup) sVar.K.findViewById(16908290)).addView(view, layoutParams);
        sVar.h.a(sVar.f12712f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i7 = g.f12672a;
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
        if (sVar.f12716i0) {
            sVar.f12712f.getDecorView().removeCallbacks(sVar.f12718k0);
        }
        sVar.f12706a0 = true;
        if (sVar.f12708c0 != -100) {
            u uVar2 = sVar.d;
        }
        s.f12703r0.remove(sVar.d.getClass().getName());
        o oVar = sVar.f12714g0;
        if (oVar != null) {
            oVar.c();
        }
        o oVar2 = sVar.f12715h0;
        if (oVar2 != null) {
            oVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return vb.b(this.f12731e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i7) {
        s sVar = (s) c();
        sVar.l();
        return sVar.f12712f.findViewById(i7);
    }

    @Override
    public final void invalidateOptionsMenu() {
        s sVar = (s) c();
        if (sVar.f12720n != null) {
            sVar.r().getClass();
            sVar.s(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        s sVar = (s) c();
        LayoutInflater from = LayoutInflater.from(sVar.f12710e);
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
        b0 r10 = ((s) c()).r();
        if (r10 != null && (dVar = r10.f12642s) != null) {
            dVar.a();
        }
    }

    @Override
    public final void setContentView(int i7) {
        s sVar = (s) c();
        sVar.l();
        ViewGroup viewGroup = (ViewGroup) sVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(sVar.f12710e).inflate(i7, viewGroup);
        sVar.h.a(sVar.f12712f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        s sVar = (s) c();
        sVar.f12725r = charSequence;
        j1 j1Var = sVar.f12726s;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        b0 b0Var = sVar.f12720n;
        if (b0Var != null) {
            k3 k3Var = (k3) b0Var.f12629e;
            if (k3Var.f19739g) {
                return;
            }
            Toolbar toolbar = k3Var.f19734a;
            k3Var.h = charSequence;
            if ((k3Var.f19735b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (k3Var.f19739g) {
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
        sVar.h.a(sVar.f12712f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = (s) c();
        sVar.l();
        ViewGroup viewGroup = (ViewGroup) sVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        sVar.h.a(sVar.f12712f.getCallback());
    }

    @Override
    public void setTitle(int i7) {
        super.setTitle(i7);
        g c10 = c();
        String string = getContext().getString(i7);
        s sVar = (s) c10;
        sVar.f12725r = string;
        j1 j1Var = sVar.f12726s;
        if (j1Var != null) {
            j1Var.setWindowTitle(string);
            return;
        }
        b0 b0Var = sVar.f12720n;
        if (b0Var != null) {
            k3 k3Var = (k3) b0Var.f12629e;
            if (k3Var.f19739g) {
                return;
            }
            Toolbar toolbar = k3Var.f19734a;
            k3Var.h = string;
            if ((k3Var.f19735b & 8) != 0) {
                toolbar.setTitle(string);
                if (k3Var.f19739g) {
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
