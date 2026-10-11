package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18692a;
    public final MessageObject f18693b;
    public final TranslateController.MessageKey f18694c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18692a = translateController;
        this.f18693b = messageObject;
        this.f18694c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18692a.lambda$detectPhotoLanguage$42(this.f18693b, this.f18694c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18694c;
        Utilities.Callback callback = this.d;
        this.f18692a.lambda$detectPhotoLanguage$40(this.f18693b, messageKey, callback, str);
    }
}
