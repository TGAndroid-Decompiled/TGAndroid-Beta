package fi;

import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.v51;
import org.telegram.ui.b20;
public final class c implements Utilities.CallbackReturn {
    public final int f9574a;

    public c(int i10) {
        this.f9574a = i10;
    }

    @Override
    public final Object run(Object obj) {
        boolean z10 = true;
        switch (this.f9574a) {
            case 0:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
            case 1:
                MessageObject messageObject = (MessageObject) obj;
                return Boolean.valueOf((messageObject == null || messageObject.getFactCheck() == null) ? false : false);
            case 2:
                MessageObject messageObject2 = (MessageObject) obj;
                return Boolean.valueOf((messageObject2 == null || messageObject2.getEffect() == null) ? false : false);
            case 3:
                return LocaleController.formatPluralString("Hours", ((Integer) obj).intValue(), new Object[0]);
            case 4:
                return LocaleController.formatPluralString("Minutes", ((Integer) obj).intValue(), new Object[0]);
            case 5:
                View view = (View) obj;
                return Boolean.valueOf(((view instanceof e9) || (view instanceof a7) || (view instanceof b20) || (view instanceof org.telegram.ui.Cells.u3) || (view instanceof org.telegram.ui.Cells.a2) || Objects.equals(view.getTag(), -33024)) ? false : false);
            default:
                return Boolean.valueOf(v51.K(((Integer) obj).intValue()));
        }
    }
}
