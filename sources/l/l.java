package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {
    public d0 f17438a;
    public g.f f17439b;
    public g f17440c;

    @Override
    public final boolean E(k kVar) {
        return false;
    }

    @Override
    public final void b(k kVar, boolean z10) {
        g.f fVar;
        if ((z10 || kVar == this.f17438a) && (fVar = this.f17439b) != null) {
            fVar.dismiss();
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i3) {
        d0 d0Var = this.f17438a;
        g gVar = this.f17440c;
        if (gVar.f17410f == null) {
            gVar.f17410f = new f(gVar);
        }
        d0Var.q(gVar.f17410f.getItem(i3), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f17440c.b(this.f17438a, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        d0 d0Var = this.f17438a;
        if (i3 == 82 || i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f17439b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f17439b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d0Var.performShortcut(i3, keyEvent, 0);
    }
}
