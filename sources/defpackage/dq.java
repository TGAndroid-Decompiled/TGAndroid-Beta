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
public abstract class dq extends jr2 {
    public bq d;
    public final cq e;

    public dq(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        bq bqVar = (bq) c();
        bqVar.k();
        ((ViewGroup) bqVar.K.findViewById(16908290)).addView(view, layoutParams);
        bqVar.h.a(bqVar.f.getCallback());
    }

    public final pp c() {
        bq bqVar = this.d;
        if (bqVar == null) {
            int i = pp.a;
            bq bqVar2 = new bq(this, this);
            this.d = bqVar2;
            return bqVar2;
        }
        return bqVar;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        bq bqVar = (bq) c();
        dq dqVar = bqVar.d;
        if (bqVar.i0) {
            bqVar.f.getDecorView().removeCallbacks(bqVar.k0);
        }
        bqVar.a0 = true;
        if (bqVar.c0 != -100) {
            dq dqVar2 = bqVar.d;
        }
        bq.r0.remove(bqVar.d.getClass().getName());
        xp xpVar = bqVar.g0;
        if (xpVar != null) {
            xpVar.c();
        }
        xp xpVar2 = bqVar.h0;
        if (xpVar2 != null) {
            xpVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return xne.a(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i) {
        bq bqVar = (bq) c();
        bqVar.k();
        return bqVar.f.findViewById(i);
    }

    @Override
    public final void invalidateOptionsMenu() {
        bq bqVar = (bq) c();
        if (bqVar.n != null) {
            bqVar.p().getClass();
            bqVar.q(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        bq bqVar = (bq) c();
        LayoutInflater from = LayoutInflater.from(bqVar.e);
        if (from.getFactory() == null) {
            from.setFactory2(bqVar);
        } else if (!(from.getFactory2() instanceof bq)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        c().a();
    }

    @Override
    public final void onStop() {
        chc chcVar;
        super.onStop();
        azc p = ((bq) c()).p();
        if (p != null && (chcVar = p.s) != null) {
            chcVar.a();
        }
    }

    @Override
    public final void setContentView(int i) {
        bq bqVar = (bq) c();
        bqVar.k();
        ViewGroup viewGroup = (ViewGroup) bqVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(bqVar.e).inflate(i, viewGroup);
        bqVar.h.a(bqVar.f.getCallback());
    }

    @Override
    public void setTitle(int i) {
        super.setTitle(i);
        pp c = c();
        String string = getContext().getString(i);
        bq bqVar = (bq) c;
        bqVar.r = string;
        ActionBarOverlayLayout actionBarOverlayLayout = bqVar.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(string);
            return;
        }
        azc azcVar = bqVar.n;
        if (azcVar != null) {
            jvb jvbVar = (jvb) azcVar.e;
            if (!jvbVar.g) {
                Toolbar toolbar = jvbVar.a;
                jvbVar.h = string;
                if ((jvbVar.b & 8) != 0) {
                    toolbar.setTitle(string);
                    if (jvbVar.g) {
                        kfc.l(toolbar.getRootView(), string);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = bqVar.L;
        if (textView != null) {
            textView.setText(string);
        }
    }

    @Override
    public final void setContentView(View view) {
        bq bqVar = (bq) c();
        bqVar.k();
        ViewGroup viewGroup = (ViewGroup) bqVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        bqVar.h.a(bqVar.f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        bq bqVar = (bq) c();
        bqVar.k();
        ViewGroup viewGroup = (ViewGroup) bqVar.K.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        bqVar.h.a(bqVar.f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        bq bqVar = (bq) c();
        bqVar.r = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = bqVar.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        azc azcVar = bqVar.n;
        if (azcVar != null) {
            jvb jvbVar = (jvb) azcVar.e;
            if (jvbVar.g) {
                return;
            }
            Toolbar toolbar = jvbVar.a;
            jvbVar.h = charSequence;
            if ((jvbVar.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (jvbVar.g) {
                    kfc.l(toolbar.getRootView(), charSequence);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = bqVar.L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
