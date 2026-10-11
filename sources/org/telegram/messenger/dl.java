package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17686a;
    public final MessageObject f17687b;
    public final long f17688c;
    public final int d;

    public dl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f17686a = translateController;
        this.f17687b = messageObject;
        this.f17688c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17686a.lambda$checkLanguage$15(this.f17687b, this.f17688c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f17688c;
        int i10 = this.d;
        this.f17686a.lambda$checkLanguage$13(this.f17687b, j3, i10, str);
    }
}
