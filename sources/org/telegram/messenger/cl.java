package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class cl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17611a;
    public final MessageObject f17612b;
    public final long f17613c;
    public final int d;

    public cl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f17611a = translateController;
        this.f17612b = messageObject;
        this.f17613c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17611a.lambda$checkLanguage$15(this.f17612b, this.f17613c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f17613c;
        int i10 = this.d;
        this.f17611a.lambda$checkLanguage$13(this.f17612b, j3, i10, str);
    }
}
