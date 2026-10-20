package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ll implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18912a;
    public final MessageObject f18913b;
    public final TranslateController.MessageKey f18914c;
    public final Utilities.Callback d;

    public ll(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18912a = translateController;
        this.f18913b = messageObject;
        this.f18914c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18912a.lambda$detectPhotoLanguage$42(this.f18913b, this.f18914c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18914c;
        Utilities.Callback callback = this.d;
        this.f18912a.lambda$detectPhotoLanguage$40(this.f18913b, messageKey, callback, str);
    }
}
