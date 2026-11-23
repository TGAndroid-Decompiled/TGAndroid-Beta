package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {
    public d0 f19294a;
    public g.f f19295b;
    public g f19296c;

    @Override
    public final void f(k kVar, boolean z10) {
        g.f fVar;
        if ((z10 || kVar == this.f19294a) && (fVar = this.f19295b) != null) {
            fVar.dismiss();
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        d0 d0Var = this.f19294a;
        g gVar = this.f19296c;
        if (gVar.f19266f == null) {
            gVar.f19266f = new f(gVar);
        }
        d0Var.q(gVar.f19266f.getItem(i7), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f19296c.f(this.f19294a, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        d0 d0Var = this.f19294a;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f19295b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f19295b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d0Var.performShortcut(i7, keyEvent, 0);
    }

    @Override
    public final boolean u(k kVar) {
        return false;
    }
}
