package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class jl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18736a;
    public final MessageObject f18737b;
    public final TranslateController.MessageKey f18738c;
    public final Utilities.Callback d;

    public jl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18736a = translateController;
        this.f18737b = messageObject;
        this.f18738c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18736a.lambda$detectPhotoLanguage$42(this.f18737b, this.f18738c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18738c;
        Utilities.Callback callback = this.d;
        this.f18736a.lambda$detectPhotoLanguage$40(this.f18737b, messageKey, callback, str);
    }
}
