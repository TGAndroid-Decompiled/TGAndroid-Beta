package ag;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q71;
public final class u extends q71 {
    public final v f669a;

    public u(v vVar) {
        this.f669a = vVar;
    }

    @Override
    public final View d(int i10) {
        v vVar = this.f669a;
        if (i10 != 1) {
            if (i10 != 2) {
                return (y) vVar.f680b;
            }
            return (e0) vVar.d;
        }
        return (x) vVar.f681c;
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
