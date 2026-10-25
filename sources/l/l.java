package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {
    public d0 f16739a;
    public g.f f16740b;
    public g f16741c;

    @Override
    public final void g(k kVar, boolean z10) {
        g.f fVar;
        if ((z10 || kVar == this.f16739a) && (fVar = this.f16740b) != null) {
            fVar.dismiss();
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        d0 d0Var = this.f16739a;
        g gVar = this.f16741c;
        if (gVar.f16713f == null) {
            gVar.f16713f = new f(gVar);
        }
        d0Var.q(gVar.f16713f.getItem(i10), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f16741c.g(this.f16739a, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        d0 d0Var = this.f16739a;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f16740b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f16740b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d0Var.performShortcut(i10, keyEvent, 0);
    }

    @Override
    public final boolean t(k kVar) {
        return false;
    }
}
