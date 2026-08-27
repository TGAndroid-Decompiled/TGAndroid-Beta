package cg;

import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.fc0;

public final class o extends fc0 {
    @Override
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Minutes", i10, new Object[0]);
    }
}
