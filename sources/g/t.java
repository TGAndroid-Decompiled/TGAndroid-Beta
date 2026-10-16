package g;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import m.l1;
import m.p3;
import r0.i0;
import w7.t6;
public abstract class t extends androidx.activity.n {
    public r d;
    public final s e;

    public t(android.view.ContextThemeWrapper r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: g.t.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.k();
        ((ViewGroup) rVar.J.findViewById(16908290)).addView(view, layoutParams);
        rVar.h.a(rVar.f9803f.getCallback());
    }

    public final g c() {
        if (this.d == null) {
            int i10 = g.f9768a;
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
        if (rVar.f9806h0) {
            rVar.f9803f.getDecorView().removeCallbacks(rVar.f9808j0);
        }
        rVar.Z = true;
        if (rVar.f9799b0 != -100) {
            t tVar2 = rVar.d;
        }
        r.f9795q0.remove(rVar.d.getClass().getName());
        n nVar = rVar.f9804f0;
        if (nVar != null) {
            nVar.c();
        }
        n nVar2 = rVar.f9805g0;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return t6.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override
    public final View findViewById(int i10) {
        r rVar = (r) c();
        rVar.k();
        return rVar.f9803f.findViewById(i10);
    }

    @Override
    public final void invalidateOptionsMenu() {
        r rVar = (r) c();
        if (rVar.f9811n != null) {
            rVar.r().getClass();
            rVar.s(0);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        r rVar = (r) c();
        LayoutInflater from = LayoutInflater.from(rVar.e);
        if (from.getFactory() == null) {
            from.setFactory2(rVar);
        } else if (!(from.getFactory2() instanceof r)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        c().a();
    }

    @Override
    public final void onStop() {
        cc.d dVar;
        super.onStop();
        a0 r10 = ((r) c()).r();
        if (r10 != null && (dVar = r10.f9729s) != null) {
            dVar.a();
        }
    }

    @Override
    public final void setContentView(int i10) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(rVar.e).inflate(i10, viewGroup);
        rVar.h.a(rVar.f9803f.getCallback());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        r rVar = (r) c();
        rVar.f9815r = charSequence;
        l1 l1Var = rVar.f9816s;
        if (l1Var != null) {
            l1Var.setWindowTitle(charSequence);
            return;
        }
        a0 a0Var = rVar.f9811n;
        if (a0Var != null) {
            p3 p3Var = (p3) a0Var.e;
            if (p3Var.f14928g) {
                return;
            }
            Toolbar toolbar = p3Var.f14924a;
            p3Var.h = charSequence;
            if ((p3Var.f14925b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (p3Var.f14928g) {
                    i0.k(toolbar.getRootView(), charSequence);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = rVar.K;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override
    public final void setContentView(View view) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        rVar.h.a(rVar.f9803f.getCallback());
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r rVar = (r) c();
        rVar.k();
        ViewGroup viewGroup = (ViewGroup) rVar.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        rVar.h.a(rVar.f9803f.getCallback());
    }

    @Override
    public void setTitle(int i10) {
        super.setTitle(i10);
        g c10 = c();
        String string = getContext().getString(i10);
        r rVar = (r) c10;
        rVar.f9815r = string;
        l1 l1Var = rVar.f9816s;
        if (l1Var != null) {
            l1Var.setWindowTitle(string);
            return;
        }
        a0 a0Var = rVar.f9811n;
        if (a0Var != null) {
            p3 p3Var = (p3) a0Var.e;
            if (p3Var.f14928g) {
                return;
            }
            Toolbar toolbar = p3Var.f14924a;
            p3Var.h = string;
            if ((p3Var.f14925b & 8) != 0) {
                toolbar.setTitle(string);
                if (p3Var.f14928g) {
                    i0.k(toolbar.getRootView(), string);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = rVar.K;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
