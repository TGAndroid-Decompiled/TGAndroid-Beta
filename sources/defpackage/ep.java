package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
public abstract class ep extends rq2 {
    public cp d;
    public final dp e;

    public ep(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        cp cpVar = (cp) c();
        cpVar.k();
        ((ViewGroup) cpVar.K.findViewById(16908290)).addView(view, layoutParams);
        cpVar.h.a(cpVar.f.getCallback());
    }

    public final qo c() {
        cp cpVar = this.d;
        if (cpVar == null) {
            int i = qo.a;
            cp cpVar2 = new cp(this, this);
            this.d = cpVar2;
            return cpVar2;
        }
        return cpVar;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        cp cpVar = (cp) c();
        ep epVar = cpVar.d;
        if (cpVar.i0) {
            cpVar.f.getDecorView().removeCallbacks(cpVar.k0);
        }
        cpVar.a0 = true;
        if (cpVar.c0 != -100) {
            ep epVar2 = cpVar.d;
        }
        cp.r0.remove(cpVar.d.getClass().getName());
        yo yoVar = cpVar.g0;
        if (yoVar != null) {
            yoVar.c();
        }
        yo yoVar2 = cpVar.h0;
        if (yoVar2 != null) {
            yoVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return rqe.a(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i) {
        cp cpVar = (cp) c();
        cpVar.k();
        return cpVar.f.findViewById(i);
    }

    @Override
    public final void invalidateOptionsMenu() {
        cp cpVar = (cp) c();
        if (cpVar.n != null) {
            cpVar.p().getClass();
            cpVar.q(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        cp cpVar = (cp) c();
        LayoutInflater from = LayoutInflater.from(cpVar.e);
        if (from.getFactory() == null) {
            from.setFactory2(cpVar);
        } else if (!(from.getFactory2() instanceof cp)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        c().a();
    }

    @Override
    public final void onStop() {
        bjc bjcVar;
        super.onStop();
        p1d p = ((cp) c()).p();
        if (p != null && (bjcVar = p.s) != null) {
            bjcVar.a();
        }
    }

    @Override
    public final void setContentView(int i) {
        cp cpVar = (cp) c();
        cpVar.k();
        ViewGroup viewGroup = (ViewGroup) cpVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(cpVar.e).inflate(i, viewGroup);
        cpVar.h.a(cpVar.f.getCallback());
    }

    @Override
    public void setTitle(int i) {
        super.setTitle(i);
        qo c = c();
        String string = getContext().getString(i);
        cp cpVar = (cp) c;
        cpVar.r = string;
        ActionBarOverlayLayout actionBarOverlayLayout = cpVar.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(string);
            return;
        }
        p1d p1dVar = cpVar.n;
        if (p1dVar != null) {
            jxb jxbVar = (jxb) p1dVar.e;
            if (!jxbVar.g) {
                Toolbar toolbar = jxbVar.a;
                jxbVar.h = string;
                if ((jxbVar.b & 8) != 0) {
                    toolbar.setTitle(string);
                    if (jxbVar.g) {
                        ihc.m(toolbar.getRootView(), string);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = cpVar.L;
        if (textView != null) {
            textView.setText(string);
        }
    }

    @Override
    public final void setContentView(View view) {
        cp cpVar = (cp) c();
        cpVar.k();
        ViewGroup viewGroup = (ViewGroup) cpVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        cpVar.h.a(cpVar.f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        cp cpVar = (cp) c();
        cpVar.k();
        ViewGroup viewGroup = (ViewGroup) cpVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        cpVar.h.a(cpVar.f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        cp cpVar = (cp) c();
        cpVar.r = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = cpVar.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        p1d p1dVar = cpVar.n;
        if (p1dVar != null) {
            jxb jxbVar = (jxb) p1dVar.e;
            if (jxbVar.g) {
                return;
            }
            Toolbar toolbar = jxbVar.a;
            jxbVar.h = charSequence;
            if ((jxbVar.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (jxbVar.g) {
                    ihc.m(toolbar.getRootView(), charSequence);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = cpVar.L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
