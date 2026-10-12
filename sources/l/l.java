package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {
    public d0 f14433a;
    public g.f f14434b;
    public g f14435c;

    @Override
    public final void d(k kVar, boolean z10) {
        g.f fVar;
        if ((z10 || kVar == this.f14433a) && (fVar = this.f14434b) != null) {
            fVar.dismiss();
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        d0 d0Var = this.f14433a;
        g gVar = this.f14435c;
        if (gVar.f14407f == null) {
            gVar.f14407f = new f(gVar);
        }
        d0Var.q(gVar.f14407f.getItem(i10), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f14435c.d(this.f14433a, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        d0 d0Var = this.f14433a;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f14434b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f14434b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d0Var.performShortcut(i10, keyEvent, 0);
    }

    @Override
    public final boolean q(k kVar) {
        return false;
    }
}
