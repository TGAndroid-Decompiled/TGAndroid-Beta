package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18552a;
    public final MessageObject f18553b;
    public final TranslateController.MessageKey f18554c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18552a = translateController;
        this.f18553b = messageObject;
        this.f18554c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18552a.lambda$detectPhotoLanguage$42(this.f18553b, this.f18554c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18554c;
        Utilities.Callback callback = this.d;
        this.f18552a.lambda$detectPhotoLanguage$40(this.f18553b, messageKey, callback, str);
    }
}
