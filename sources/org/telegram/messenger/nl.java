package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18689a;
    public final MessageObject f18690b;
    public final TranslateController.MessageKey f18691c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18689a = translateController;
        this.f18690b = messageObject;
        this.f18691c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18689a.lambda$detectPhotoLanguage$42(this.f18690b, this.f18691c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18691c;
        Utilities.Callback callback = this.d;
        this.f18689a.lambda$detectPhotoLanguage$40(this.f18690b, messageKey, callback, str);
    }
}
