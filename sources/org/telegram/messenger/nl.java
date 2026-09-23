package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16897a;
    public final MessageObject f16898b;
    public final TranslateController.MessageKey f16899c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f16897a = translateController;
        this.f16898b = messageObject;
        this.f16899c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f16897a.lambda$detectPhotoLanguage$42(this.f16898b, this.f16899c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f16899c;
        Utilities.Callback callback = this.d;
        this.f16897a.lambda$detectPhotoLanguage$40(this.f16898b, messageKey, callback, str);
    }
}
