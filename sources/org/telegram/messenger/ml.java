package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ml implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f21006a;
    public final MessageObject f21007b;
    public final TranslateController.MessageKey f21008c;
    public final Utilities.Callback d;

    public ml(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f21006a = translateController;
        this.f21007b = messageObject;
        this.f21008c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f21006a.lambda$detectPhotoLanguage$42(this.f21007b, this.f21008c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f21008c;
        Utilities.Callback callback = this.d;
        this.f21006a.lambda$detectPhotoLanguage$40(this.f21007b, messageKey, callback, str);
    }
}
