package g;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import g7.z6;
import m.k1;
import m.p3;
import r0.j0;
public abstract class s extends androidx.activity.n {
    public q d;
    public final r f7032e;

    public s(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.s.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = (q) c();
        qVar.k();
        ((ViewGroup) qVar.F.findViewById(16908290)).addView(view, layoutParams);
        qVar.h.a(qVar.f7017f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i9 = g.f6981a;
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
        if (qVar.f7014d0) {
            qVar.f7017f.getDecorView().removeCallbacks(qVar.f7018f0);
        }
        qVar.V = true;
        if (qVar.X != -100) {
            s sVar2 = qVar.d;
        }
        q.m0.remove(qVar.d.getClass().getName());
        n nVar = qVar.f7012b0;
        if (nVar != null) {
            nVar.c();
        }
        n nVar2 = qVar.f7013c0;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return z6.b(this.f7032e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i9) {
        q qVar = (q) c();
        qVar.k();
        return qVar.f7017f.findViewById(i9);
    }

    @Override
    public final void invalidateOptionsMenu() {
        q qVar = (q) c();
        if (qVar.f7025n != null) {
            qVar.q().getClass();
            qVar.s(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        q qVar = (q) c();
        LayoutInflater from = LayoutInflater.from(qVar.f7015e);
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
        jb.d dVar;
        super.onStop();
        a0 q10 = ((q) c()).q();
        if (q10 != null && (dVar = q10.f6940s) != null) {
            dVar.a();
        }
    }

    @Override
    public final void setContentView(int i9) {
        q qVar = (q) c();
        qVar.k();
        ViewGroup viewGroup = (ViewGroup) qVar.F.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(qVar.f7015e).inflate(i9, viewGroup);
        qVar.h.a(qVar.f7017f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        q qVar = (q) c();
        qVar.f7026r = charSequence;
        k1 k1Var = qVar.f7027s;
        if (k1Var != null) {
            k1Var.setWindowTitle(charSequence);
            return;
        }
        a0 a0Var = qVar.f7025n;
        if (a0Var != null) {
            p3 p3Var = (p3) a0Var.f6927e;
            if (p3Var.f17042g) {
                return;
            }
            Toolbar toolbar = p3Var.f17037a;
            p3Var.h = charSequence;
            if ((p3Var.f17038b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (p3Var.f17042g) {
                    j0.l(toolbar.getRootView(), charSequence);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = qVar.G;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override
    public final void setContentView(View view) {
        q qVar = (q) c();
        qVar.k();
        ViewGroup viewGroup = (ViewGroup) qVar.F.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        qVar.h.a(qVar.f7017f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = (q) c();
        qVar.k();
        ViewGroup viewGroup = (ViewGroup) qVar.F.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        qVar.h.a(qVar.f7017f.getCallback());
    }

    @Override
    public void setTitle(int i9) {
        super.setTitle(i9);
        g c10 = c();
        String string = getContext().getString(i9);
        q qVar = (q) c10;
        qVar.f7026r = string;
        k1 k1Var = qVar.f7027s;
        if (k1Var != null) {
            k1Var.setWindowTitle(string);
            return;
        }
        a0 a0Var = qVar.f7025n;
        if (a0Var != null) {
            p3 p3Var = (p3) a0Var.f6927e;
            if (p3Var.f17042g) {
                return;
            }
            Toolbar toolbar = p3Var.f17037a;
            p3Var.h = string;
            if ((p3Var.f17038b & 8) != 0) {
                toolbar.setTitle(string);
                if (p3Var.f17042g) {
                    j0.l(toolbar.getRootView(), string);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = qVar.G;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
