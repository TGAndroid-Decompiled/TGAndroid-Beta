package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.TranslateController;
public final class nk implements Comparator {
    public final int f19089a;
    public final Object f19090b;

    public nk(Object obj, int i10) {
        this.f19089a = i10;
        this.f19090b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getMusicDialogsSortedByVisibleOrder$1;
        int lambda$getLocales$3;
        int lambda$getLanguages$1;
        switch (this.f19089a) {
            case 0:
                lambda$getMusicDialogsSortedByVisibleOrder$1 = TelegramMediaSession.lambda$getMusicDialogsSortedByVisibleOrder$1((HashMap) this.f19090b, (Long) obj, (Long) obj2);
                return lambda$getMusicDialogsSortedByVisibleOrder$1;
            case 1:
                lambda$getLocales$3 = TranslateController.lambda$getLocales$3((LocaleController.LocaleInfo) this.f19090b, (LocaleController.LocaleInfo) obj, (LocaleController.LocaleInfo) obj2);
                return lambda$getLocales$3;
            default:
                lambda$getLanguages$1 = TranslateController.lambda$getLanguages$1((Collator) this.f19090b, (TranslateController.Language) obj, (TranslateController.Language) obj2);
                return lambda$getLanguages$1;
        }
    }
}
