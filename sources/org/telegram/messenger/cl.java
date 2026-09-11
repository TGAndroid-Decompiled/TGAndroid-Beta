package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class cl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17430a;
    public final MessageObject f17431b;
    public final long f17432c;
    public final int d;

    public cl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f17430a = translateController;
        this.f17431b = messageObject;
        this.f17432c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17430a.lambda$checkLanguage$15(this.f17431b, this.f17432c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f17432c;
        int i10 = this.d;
        this.f17430a.lambda$checkLanguage$13(this.f17431b, j3, i10, str);
    }
}
