package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {
    public d0 f11060a;
    public g.f f11061b;
    public g f11062c;

    @Override
    public final void c(k kVar, boolean z4) {
        g.f fVar;
        if ((z4 || kVar == this.f11060a) && (fVar = this.f11061b) != null) {
            fVar.dismiss();
        }
    }

    @Override
    public final boolean e0(k kVar) {
        return false;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        d0 d0Var = this.f11060a;
        g gVar = this.f11062c;
        if (gVar.f11034f == null) {
            gVar.f11034f = new f(gVar);
        }
        d0Var.q(gVar.f11034f.getItem(i10), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f11062c.c(this.f11060a, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        d0 d0Var = this.f11060a;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f11061b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f11061b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d0Var.performShortcut(i10, keyEvent, 0);
    }
}
