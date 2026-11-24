package defpackage;

import android.content.ClipboardManager;
import org.telegram.ui.ActionBar.d;
public final class cw8 implements ClipboardManager.OnPrimaryClipChangedListener {
    public final byte a;
    public final d b;

    public cw8(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override
    public final void onPrimaryClipChanged() {
        byte b = this.a;
        d dVar = this.b;
        switch (b) {
            case 0:
                ((gw8) dVar).c0();
                return;
            default:
                ((asc) dVar).k0(true);
                return;
        }
    }
}
