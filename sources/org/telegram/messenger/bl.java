package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class bl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17996a;
    public final MessageObject f17997b;
    public final long f17998c;
    public final int d;

    public bl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f17996a = translateController;
        this.f17997b = messageObject;
        this.f17998c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17996a.lambda$checkLanguage$15(this.f17997b, this.f17998c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f17998c;
        int i10 = this.d;
        this.f17996a.lambda$checkLanguage$13(this.f17997b, j10, i10, str);
    }
}
