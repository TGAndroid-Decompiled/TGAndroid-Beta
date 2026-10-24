package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ml implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f19062a;
    public final MessageObject f19063b;
    public final TranslateController.MessageKey f19064c;
    public final Utilities.Callback d;

    public ml(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f19062a = translateController;
        this.f19063b = messageObject;
        this.f19064c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f19062a.lambda$detectPhotoLanguage$42(this.f19063b, this.f19064c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f19064c;
        Utilities.Callback callback = this.d;
        this.f19062a.lambda$detectPhotoLanguage$40(this.f19063b, messageKey, callback, str);
    }
}
