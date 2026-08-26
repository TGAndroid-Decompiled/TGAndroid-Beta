package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.HashMap;

public final class TelegramMediaSession$$ExternalSyntheticLambda0 implements Comparator {
    public final int $r8$classId;
    public final Object f$0;

    public TelegramMediaSession$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return TelegramMediaSession.lambda$getMusicDialogsSortedByVisibleOrder$1((HashMap) this.f$0, (Long) obj, (Long) obj2);
            case 1:
                return TranslateController.lambda$getLocales$3((LocaleController.LocaleInfo) this.f$0, (LocaleController.LocaleInfo) obj, (LocaleController.LocaleInfo) obj2);
            default:
                return TranslateController.lambda$getLanguages$1((Collator) this.f$0, (TranslateController.Language) obj, (TranslateController.Language) obj2);
        }
    }
}
