package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.HashMap;

public final class mk implements Comparator {

    public final int f21015a;

    public final Object f21016b;

    public mk(Object obj, int i10) {
        this.f21015a = i10;
        this.f21016b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f21015a) {
            case 0:
                return TelegramMediaSession.lambda$getMusicDialogsSortedByVisibleOrder$1((HashMap) this.f21016b, (Long) obj, (Long) obj2);
            case 1:
                return TranslateController.lambda$getLocales$3((LocaleController.LocaleInfo) this.f21016b, (LocaleController.LocaleInfo) obj, (LocaleController.LocaleInfo) obj2);
            default:
                return TranslateController.lambda$getLanguages$1((Collator) this.f21016b, (TranslateController.Language) obj, (TranslateController.Language) obj2);
        }
    }
}
