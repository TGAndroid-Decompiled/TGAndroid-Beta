package m;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import j$.util.Objects;
public abstract class h0 {
    public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}
