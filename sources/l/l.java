package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {
    public d0 f19229a;
    public g.f f19230b;
    public g f19231c;

    @Override
    public final boolean C(k kVar) {
        return false;
    }

    @Override
    public final void d(k kVar, boolean z10) {
        g.f fVar;
        if ((z10 || kVar == this.f19229a) && (fVar = this.f19230b) != null) {
            fVar.dismiss();
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        d0 d0Var = this.f19229a;
        g gVar = this.f19231c;
        if (gVar.f19201f == null) {
            gVar.f19201f = new f(gVar);
        }
        d0Var.q(gVar.f19201f.getItem(i7), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f19231c.d(this.f19229a, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        d0 d0Var = this.f19229a;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f19230b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f19230b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d0Var.performShortcut(i7, keyEvent, 0);
    }
}
