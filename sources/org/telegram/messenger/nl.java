package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18733a;
    public final MessageObject f18734b;
    public final TranslateController.MessageKey f18735c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18733a = translateController;
        this.f18734b = messageObject;
        this.f18735c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18733a.lambda$detectPhotoLanguage$42(this.f18734b, this.f18735c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18735c;
        Utilities.Callback callback = this.d;
        this.f18733a.lambda$detectPhotoLanguage$40(this.f18734b, messageKey, callback, str);
    }
}
