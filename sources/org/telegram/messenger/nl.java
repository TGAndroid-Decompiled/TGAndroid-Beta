package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18729a;
    public final MessageObject f18730b;
    public final TranslateController.MessageKey f18731c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18729a = translateController;
        this.f18730b = messageObject;
        this.f18731c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18729a.lambda$detectPhotoLanguage$42(this.f18730b, this.f18731c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18731c;
        Utilities.Callback callback = this.d;
        this.f18729a.lambda$detectPhotoLanguage$40(this.f18730b, messageKey, callback, str);
    }
}
