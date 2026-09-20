package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ol implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17211a;
    public final MessageObject f17212b;
    public final TranslateController.MessageKey f17213c;
    public final Utilities.Callback d;

    public ol(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f17211a = translateController;
        this.f17212b = messageObject;
        this.f17213c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f17211a.lambda$detectPhotoLanguage$42(this.f17212b, this.f17213c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f17213c;
        Utilities.Callback callback = this.d;
        this.f17211a.lambda$detectPhotoLanguage$40(this.f17212b, messageKey, callback, str);
    }
}
