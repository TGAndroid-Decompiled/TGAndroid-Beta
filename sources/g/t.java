package g;

import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import h7.r6;
import m.k1;
import m.p3;
import r0.j0;

public abstract class t extends androidx.activity.m {
    public r d;

    public final s f6313e;

    public t(ContextThemeWrapper contextThemeWrapper, int i10) {
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(2130968755, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        super(contextThemeWrapper, i11);
        this.f6313e = new r0.k() {
            @Override
            public final boolean i(KeyEvent keyEvent) {
                return this.f6312a.d(keyEvent);
            }
        };
        h hVarC = c();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(2130968755, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        ((r) hVarC).Y = i10;
        hVarC.a();
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.l();
        ((ViewGroup) rVar.F.findViewById(16908290)).addView(view, layoutParams);
        rVar.h.a(rVar.f6298f.getCallback());
    }

    public final h c() {
        if (this.d == null) {
            int i10 = h.f6262a;
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
        if (rVar.f6295d0) {
            rVar.f6298f.getDecorView().removeCallbacks(rVar.f6299f0);
        }
        rVar.V = true;
        if (rVar.X != -100) {
            t tVar2 = rVar.d;
        }
        r.m0.remove(rVar.d.getClass().getName());
        o oVar = rVar.f6293b0;
        if (oVar != null) {
            oVar.c();
        }
        o oVar2 = rVar.f6294c0;
        if (oVar2 != null) {
            oVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return r6.b(this.f6313e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i10) {
        r rVar = (r) c();
        rVar.l();
        return rVar.f6298f.findViewById(i10);
    }

    @Override
    public final void invalidateOptionsMenu() {
        r rVar = (r) c();
        if (rVar.f6306n != null) {
            rVar.q().getClass();
            rVar.r(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        r rVar = (r) c();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(rVar.f6296e);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(rVar);
        } else if (!(layoutInflaterFrom.getFactory2() instanceof r)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        c().a();
    }

    @Override
    public final void onStop() {
        k.j jVar;
        super.onStop();
        b0 b0VarQ = ((r) c()).q();
        if (b0VarQ == null || (jVar = b0VarQ.f6221s) == null) {
            return;
        }
        jVar.a();
    }

    @Override
    public final void setContentView(int i10) {
        r rVar = (r) c();
        rVar.l();
        ViewGroup viewGroup = (ViewGroup) rVar.F.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(rVar.f6296e).inflate(i10, viewGroup);
        rVar.h.a(rVar.f6298f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        r rVar = (r) c();
        rVar.f6307r = charSequence;
        k1 k1Var = rVar.f6308s;
        if (k1Var != null) {
            k1Var.setWindowTitle(charSequence);
            return;
        }
        b0 b0Var = rVar.f6306n;
        if (b0Var == null) {
            TextView textView = rVar.G;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        p3 p3Var = (p3) b0Var.f6208e;
        if (p3Var.f17417g) {
            return;
        }
        Toolbar toolbar = p3Var.f17412a;
        p3Var.h = charSequence;
        if ((p3Var.f17413b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (p3Var.f17417g) {
                j0.l(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override
    public final void setContentView(View view) {
        r rVar = (r) c();
        rVar.l();
        ViewGroup viewGroup = (ViewGroup) rVar.F.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        rVar.h.a(rVar.f6298f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.l();
        ViewGroup viewGroup = (ViewGroup) rVar.F.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        rVar.h.a(rVar.f6298f.getCallback());
    }

    @Override
    public void setTitle(int i10) {
        super.setTitle(i10);
        h hVarC = c();
        String string = getContext().getString(i10);
        r rVar = (r) hVarC;
        rVar.f6307r = string;
        k1 k1Var = rVar.f6308s;
        if (k1Var != null) {
            k1Var.setWindowTitle(string);
            return;
        }
        b0 b0Var = rVar.f6306n;
        if (b0Var != null) {
            p3 p3Var = (p3) b0Var.f6208e;
            if (p3Var.f17417g) {
                return;
            }
            Toolbar toolbar = p3Var.f17412a;
            p3Var.h = string;
            if ((p3Var.f17413b & 8) != 0) {
                toolbar.setTitle(string);
                if (p3Var.f17417g) {
                    j0.l(toolbar.getRootView(), string);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = rVar.G;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
