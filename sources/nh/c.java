package nh;

import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.w6;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.b51;
import org.telegram.ui.l10;

public final class c implements Utilities.CallbackReturn {

    public final int f18607a;

    public c(int i10) {
        this.f18607a = i10;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f18607a) {
            case 0:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
            case 1:
                MessageObject messageObject = (MessageObject) obj;
                return Boolean.valueOf((messageObject == null || messageObject.getFactCheck() == null) ? false : true);
            case 2:
                MessageObject messageObject2 = (MessageObject) obj;
                return Boolean.valueOf((messageObject2 == null || messageObject2.getEffect() == null) ? false : true);
            case 3:
                return LocaleController.formatPluralString("Hours", ((Integer) obj).intValue(), new Object[0]);
            case 4:
                return LocaleController.formatPluralString("Minutes", ((Integer) obj).intValue(), new Object[0]);
            case 5:
                View view = (View) obj;
                return Boolean.valueOf(((view instanceof x8) || (view instanceof w6) || (view instanceof l10) || (view instanceof org.telegram.ui.Cells.s3) || (view instanceof org.telegram.ui.Cells.z1) || Objects.equals(view.getTag(), -33024)) ? false : true);
            default:
                return Boolean.valueOf(b51.K(((Integer) obj).intValue()));
        }
    }
}
