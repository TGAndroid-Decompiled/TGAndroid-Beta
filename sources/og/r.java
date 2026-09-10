package og;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n81;
public final class r extends n81 {
    public final ci.h f14466a;

    public r(ci.h hVar) {
        this.f14466a = hVar;
    }

    @Override
    public final View d(int i10) {
        ci.h hVar = this.f14466a;
        if (i10 != 1) {
            if (i10 != 2) {
                return (u) hVar.d;
            }
            return (z) hVar.f4708c;
        }
        return (t) hVar.f4707b;
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
