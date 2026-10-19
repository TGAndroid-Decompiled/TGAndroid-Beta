package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class al implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17902a;
    public final MessageObject f17903b;
    public final long f17904c;
    public final int d;

    public al(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f17902a = translateController;
        this.f17903b = messageObject;
        this.f17904c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17902a.lambda$checkLanguage$15(this.f17903b, this.f17904c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f17904c;
        int i10 = this.d;
        this.f17902a.lambda$checkLanguage$13(this.f17903b, j10, i10, str);
    }
}
