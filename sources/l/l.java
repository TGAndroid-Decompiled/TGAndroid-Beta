package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {
    public d0 f14003a;
    public g.f f14004b;
    public g f14005c;

    @Override
    public final void b(k kVar, boolean z10) {
        g.f fVar;
        if ((z10 || kVar == this.f14003a) && (fVar = this.f14004b) != null) {
            fVar.dismiss();
        }
    }

    @Override
    public final boolean h(k kVar) {
        return false;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        d0 d0Var = this.f14003a;
        g gVar = this.f14005c;
        if (gVar.f13975f == null) {
            gVar.f13975f = new f(gVar);
        }
        d0Var.q(gVar.f13975f.getItem(i10), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f14005c.b(this.f14003a, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        d0 d0Var = this.f14003a;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f14004b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f14004b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d0Var.performShortcut(i10, keyEvent, 0);
    }
}
