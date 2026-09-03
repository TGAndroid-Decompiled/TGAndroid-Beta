package dg;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d81;
public final class t extends d81 {
    public final u f4670a;

    public t(u uVar) {
        this.f4670a = uVar;
    }

    @Override
    public final View d(int i10) {
        u uVar = this.f4670a;
        if (i10 != 1) {
            if (i10 != 2) {
                return (x) uVar.f4679b;
            }
            return (d0) uVar.d;
        }
        return (w) uVar.f4680c;
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
