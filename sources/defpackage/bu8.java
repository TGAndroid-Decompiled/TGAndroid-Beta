package defpackage;

import android.content.ClipboardManager;
import org.telegram.ui.ActionBar.d;
public final class bu8 implements ClipboardManager.OnPrimaryClipChangedListener {
    public final byte a;
    public final d b;

    public bu8(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override
    public final void onPrimaryClipChanged() {
        byte b = this.a;
        d dVar = this.b;
        switch (b) {
            case 0:
                ((fu8) dVar).b0();
                return;
            default:
                ((ypc) dVar).j0(true);
                return;
        }
    }
}
