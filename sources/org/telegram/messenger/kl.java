package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18821a;
    public final MessageObject f18822b;
    public final TranslateController.MessageKey f18823c;
    public final Utilities.Callback d;

    public kl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18821a = translateController;
        this.f18822b = messageObject;
        this.f18823c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18821a.lambda$detectPhotoLanguage$42(this.f18822b, this.f18823c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18823c;
        Utilities.Callback callback = this.d;
        this.f18821a.lambda$detectPhotoLanguage$40(this.f18822b, messageKey, callback, str);
    }
}
