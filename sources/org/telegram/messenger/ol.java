package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ol implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18656a;
    public final MessageObject f18657b;
    public final TranslateController.MessageKey f18658c;
    public final Utilities.Callback d;

    public ol(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18656a = translateController;
        this.f18657b = messageObject;
        this.f18658c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18656a.lambda$detectPhotoLanguage$42(this.f18657b, this.f18658c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18658c;
        Utilities.Callback callback = this.d;
        this.f18656a.lambda$detectPhotoLanguage$40(this.f18657b, messageKey, callback, str);
    }
}
