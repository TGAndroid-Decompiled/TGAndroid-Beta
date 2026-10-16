package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class hl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17145a;
    public final MessageObject f17146b;
    public final long f17147c;
    public final int d;

    public hl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f17145a = translateController;
        this.f17146b = messageObject;
        this.f17147c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17145a.lambda$checkLanguage$15(this.f17146b, this.f17147c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f17147c;
        int i10 = this.d;
        this.f17145a.lambda$checkLanguage$13(this.f17146b, j10, i10, str);
    }
}
