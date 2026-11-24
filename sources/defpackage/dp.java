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
public abstract class dp extends yp2 {
    public bp d;
    public final cp e;

    public dp(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dp.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        bp bpVar = (bp) c();
        bpVar.k();
        ((ViewGroup) bpVar.K.findViewById(16908290)).addView(view, layoutParams);
        bpVar.h.a(bpVar.f.getCallback());
    }

    public final po c() {
        bp bpVar = this.d;
        if (bpVar == null) {
            int i = po.a;
            bp bpVar2 = new bp(this, this);
            this.d = bpVar2;
            return bpVar2;
        }
        return bpVar;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        bp bpVar = (bp) c();
        dp dpVar = bpVar.d;
        if (bpVar.i0) {
            bpVar.f.getDecorView().removeCallbacks(bpVar.k0);
        }
        bpVar.a0 = true;
        if (bpVar.c0 != -100) {
            dp dpVar2 = bpVar.d;
        }
        bp.r0.remove(bpVar.d.getClass().getName());
        xo xoVar = bpVar.g0;
        if (xoVar != null) {
            xoVar.c();
        }
        xo xoVar2 = bpVar.h0;
        if (xoVar2 != null) {
            xoVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return vle.a(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i) {
        bp bpVar = (bp) c();
        bpVar.k();
        return bpVar.f.findViewById(i);
    }

    @Override
    public final void invalidateOptionsMenu() {
        bp bpVar = (bp) c();
        if (bpVar.n != null) {
            bpVar.p().getClass();
            bpVar.q(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        bp bpVar = (bp) c();
        LayoutInflater from = LayoutInflater.from(bpVar.e);
        if (from.getFactory() == null) {
            from.setFactory2(bpVar);
        } else if (!(from.getFactory2() instanceof bp)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        c().a();
    }

    @Override
    public final void onStop() {
        cfc cfcVar;
        super.onStop();
        zwc p = ((bp) c()).p();
        if (p != null && (cfcVar = p.s) != null) {
            cfcVar.a();
        }
    }

    @Override
    public final void setContentView(int i) {
        bp bpVar = (bp) c();
        bpVar.k();
        ViewGroup viewGroup = (ViewGroup) bpVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(bpVar.e).inflate(i, viewGroup);
        bpVar.h.a(bpVar.f.getCallback());
    }

    @Override
    public void setTitle(int i) {
        super.setTitle(i);
        po c = c();
        String string = getContext().getString(i);
        bp bpVar = (bp) c;
        bpVar.r = string;
        ActionBarOverlayLayout actionBarOverlayLayout = bpVar.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(string);
            return;
        }
        zwc zwcVar = bpVar.n;
        if (zwcVar != null) {
            itb itbVar = (itb) zwcVar.e;
            if (!itbVar.g) {
                Toolbar toolbar = itbVar.a;
                itbVar.h = string;
                if ((itbVar.b & 8) != 0) {
                    toolbar.setTitle(string);
                    if (itbVar.g) {
                        jdc.l(toolbar.getRootView(), string);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = bpVar.L;
        if (textView != null) {
            textView.setText(string);
        }
    }

    @Override
    public final void setContentView(View view) {
        bp bpVar = (bp) c();
        bpVar.k();
        ViewGroup viewGroup = (ViewGroup) bpVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        bpVar.h.a(bpVar.f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        bp bpVar = (bp) c();
        bpVar.k();
        ViewGroup viewGroup = (ViewGroup) bpVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        bpVar.h.a(bpVar.f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        bp bpVar = (bp) c();
        bpVar.r = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = bpVar.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        zwc zwcVar = bpVar.n;
        if (zwcVar != null) {
            itb itbVar = (itb) zwcVar.e;
            if (itbVar.g) {
                return;
            }
            Toolbar toolbar = itbVar.a;
            itbVar.h = charSequence;
            if ((itbVar.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (itbVar.g) {
                    jdc.l(toolbar.getRootView(), charSequence);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = bpVar.L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
