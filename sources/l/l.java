package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {
    public d0 f17689a;
    public g.f f17690b;
    public g f17691c;

    @Override
    public final boolean A(k kVar) {
        return false;
    }

    @Override
    public final void c(k kVar, boolean z9) {
        g.f fVar;
        if ((z9 || kVar == this.f17689a) && (fVar = this.f17690b) != null) {
            fVar.dismiss();
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        d0 d0Var = this.f17689a;
        g gVar = this.f17691c;
        if (gVar.f17661f == null) {
            gVar.f17661f = new f(gVar);
        }
        d0Var.q(gVar.f17661f.getItem(i7), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f17691c.c(this.f17689a, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        d0 d0Var = this.f17689a;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f17690b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f17690b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d0Var.performShortcut(i7, keyEvent, 0);
    }
}
