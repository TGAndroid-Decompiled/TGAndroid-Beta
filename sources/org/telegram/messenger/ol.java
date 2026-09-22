package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ol implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17226a;
    public final MessageObject f17227b;
    public final TranslateController.MessageKey f17228c;
    public final Utilities.Callback d;

    public ol(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f17226a = translateController;
        this.f17227b = messageObject;
        this.f17228c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f17226a.lambda$detectPhotoLanguage$42(this.f17227b, this.f17228c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f17228c;
        Utilities.Callback callback = this.d;
        this.f17226a.lambda$detectPhotoLanguage$40(this.f17227b, messageKey, callback, str);
    }
}
