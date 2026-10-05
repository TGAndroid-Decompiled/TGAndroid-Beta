package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18734a;
    public final MessageObject f18735b;
    public final TranslateController.MessageKey f18736c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18734a = translateController;
        this.f18735b = messageObject;
        this.f18736c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18734a.lambda$detectPhotoLanguage$42(this.f18735b, this.f18736c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18736c;
        Utilities.Callback callback = this.d;
        this.f18734a.lambda$detectPhotoLanguage$40(this.f18735b, messageKey, callback, str);
    }
}
