package cg;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c81;
public final class t extends c81 {
    public final u f2525a;

    public t(u uVar) {
        this.f2525a = uVar;
    }

    @Override
    public final View d(int i10) {
        u uVar = this.f2525a;
        if (i10 != 1) {
            if (i10 != 2) {
                return (x) uVar.f2535b;
            }
            return (d0) uVar.d;
        }
        return (w) uVar.f2536c;
    }

    @Override
    public final int e() {
        return 3;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase();
            }
            return LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase();
        }
        return LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
