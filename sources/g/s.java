package g;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import k7.p6;
import m.k1;
import m.o3;
import r0.j0;
public abstract class s extends androidx.activity.n {
    public q d;
    public final r e;

    public s(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = (q) c();
        qVar.l();
        ((ViewGroup) qVar.G.findViewById(16908290)).addView(view, layoutParams);
        qVar.h.a(qVar.f6300f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i10 = g.f6267a;
            this.d = new q(this, this);
        }
        return this.d;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        q qVar = (q) c();
        s sVar = qVar.d;
        if (qVar.f6299e0) {
            qVar.f6300f.getDecorView().removeCallbacks(qVar.f6302g0);
        }
        qVar.W = true;
        if (qVar.Y != -100) {
            s sVar2 = qVar.d;
        }
        q.f6292n0.remove(qVar.d.getClass().getName());
        n nVar = qVar.f6297c0;
        if (nVar != null) {
            nVar.c();
        }
        n nVar2 = qVar.f6298d0;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return p6.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i10) {
        q qVar = (q) c();
        qVar.l();
        return qVar.f6300f.findViewById(i10);
    }

    @Override
    public final void invalidateOptionsMenu() {
        q qVar = (q) c();
        if (qVar.f6308n != null) {
            qVar.r().getClass();
            qVar.s(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        q qVar = (q) c();
        LayoutInflater from = LayoutInflater.from(qVar.e);
        if (from.getFactory() == null) {
            from.setFactory2(qVar);
        } else if (!(from.getFactory2() instanceof q)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        c().a();
    }

    @Override
    public final void onStop() {
        k.j jVar;
        super.onStop();
        a0 r10 = ((q) c()).r();
        if (r10 != null && (jVar = r10.f6228s) != null) {
            jVar.a();
        }
    }

    @Override
    public final void setContentView(int i10) {
        q qVar = (q) c();
        qVar.l();
        ViewGroup viewGroup = (ViewGroup) qVar.G.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(qVar.e).inflate(i10, viewGroup);
        qVar.h.a(qVar.f6300f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        q qVar = (q) c();
        qVar.f6309r = charSequence;
        k1 k1Var = qVar.f6310s;
        if (k1Var != null) {
            k1Var.setWindowTitle(charSequence);
            return;
        }
        a0 a0Var = qVar.f6308n;
        if (a0Var != null) {
            o3 o3Var = (o3) a0Var.e;
            if (o3Var.f13586g) {
                return;
            }
            Toolbar toolbar = o3Var.f13582a;
            o3Var.h = charSequence;
            if ((o3Var.f13583b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (o3Var.f13586g) {
                    j0.l(toolbar.getRootView(), charSequence);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = qVar.H;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override
    public final void setContentView(View view) {
        q qVar = (q) c();
        qVar.l();
        ViewGroup viewGroup = (ViewGroup) qVar.G.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        qVar.h.a(qVar.f6300f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = (q) c();
        qVar.l();
        ViewGroup viewGroup = (ViewGroup) qVar.G.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        qVar.h.a(qVar.f6300f.getCallback());
    }

    @Override
    public void setTitle(int i10) {
        super.setTitle(i10);
        g c3 = c();
        String string = getContext().getString(i10);
        q qVar = (q) c3;
        qVar.f6309r = string;
        k1 k1Var = qVar.f6310s;
        if (k1Var != null) {
            k1Var.setWindowTitle(string);
            return;
        }
        a0 a0Var = qVar.f6308n;
        if (a0Var != null) {
            o3 o3Var = (o3) a0Var.e;
            if (o3Var.f13586g) {
                return;
            }
            Toolbar toolbar = o3Var.f13582a;
            o3Var.h = string;
            if ((o3Var.f13583b & 8) != 0) {
                toolbar.setTitle(string);
                if (o3Var.f13586g) {
                    j0.l(toolbar.getRootView(), string);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = qVar.H;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
