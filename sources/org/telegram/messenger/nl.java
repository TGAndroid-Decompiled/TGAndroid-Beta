package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18732a;
    public final MessageObject f18733b;
    public final TranslateController.MessageKey f18734c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18732a = translateController;
        this.f18733b = messageObject;
        this.f18734c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18732a.lambda$detectPhotoLanguage$42(this.f18733b, this.f18734c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18734c;
        Utilities.Callback callback = this.d;
        this.f18732a.lambda$detectPhotoLanguage$40(this.f18733b, messageKey, callback, str);
    }
}
