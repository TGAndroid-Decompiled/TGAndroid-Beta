package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18824a;
    public final MessageObject f18825b;
    public final TranslateController.MessageKey f18826c;
    public final Utilities.Callback d;

    public kl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18824a = translateController;
        this.f18825b = messageObject;
        this.f18826c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18824a.lambda$detectPhotoLanguage$42(this.f18825b, this.f18826c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18826c;
        Utilities.Callback callback = this.d;
        this.f18824a.lambda$detectPhotoLanguage$40(this.f18825b, messageKey, callback, str);
    }
}
