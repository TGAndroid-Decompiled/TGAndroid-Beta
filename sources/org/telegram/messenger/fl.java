package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class fl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17236a;
    public final MessageObject f17237b;
    public final long f17238c;
    public final int d;

    public fl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f17236a = translateController;
        this.f17237b = messageObject;
        this.f17238c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17236a.lambda$checkLanguage$15(this.f17237b, this.f17238c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f17238c;
        int i10 = this.d;
        this.f17236a.lambda$checkLanguage$13(this.f17237b, j10, i10, str);
    }
}
