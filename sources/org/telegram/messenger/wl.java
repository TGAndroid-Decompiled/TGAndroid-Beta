package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class wl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16923a;
    public final MessageObject f16924b;
    public final TranslateController.MessageKey f16925c;
    public final Utilities.Callback d;

    public wl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f16923a = translateController;
        this.f16924b = messageObject;
        this.f16925c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f16923a.lambda$detectPhotoLanguage$42(this.f16924b, this.f16925c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f16925c;
        Utilities.Callback callback = this.d;
        this.f16923a.lambda$detectPhotoLanguage$40(this.f16924b, messageKey, callback, str);
    }
}
