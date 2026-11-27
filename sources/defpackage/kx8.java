package defpackage;

import android.content.ClipboardManager;
import org.telegram.ui.ActionBar.e;
public final class kx8 implements ClipboardManager.OnPrimaryClipChangedListener {
    public final byte a;
    public final e b;

    public kx8(e eVar, byte b) {
        this.a = b;
        this.b = eVar;
    }

    @Override
    public final void onPrimaryClipChanged() {
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                ((ox8) eVar).b0();
                return;
            default:
                ((muc) eVar).j0(true);
                return;
        }
    }
}
