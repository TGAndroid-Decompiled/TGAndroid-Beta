package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18728a;
    public final MessageObject f18729b;
    public final TranslateController.MessageKey f18730c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18728a = translateController;
        this.f18729b = messageObject;
        this.f18730c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18728a.lambda$detectPhotoLanguage$42(this.f18729b, this.f18730c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18730c;
        Utilities.Callback callback = this.d;
        this.f18728a.lambda$detectPhotoLanguage$40(this.f18729b, messageKey, callback, str);
    }
}
