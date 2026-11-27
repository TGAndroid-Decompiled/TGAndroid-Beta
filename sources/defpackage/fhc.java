package defpackage;

import android.view.View;
import android.view.WindowInsets;
public abstract class fhc {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static CharSequence b(View view) {
        return view.getStateDescription();
    }
}
