package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f15989a;
    public final MessageObject f15990b;
    public final long f15991c;
    public final int d;

    public dl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f15989a = translateController;
        this.f15990b = messageObject;
        this.f15991c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f15989a.lambda$checkLanguage$15(this.f15990b, this.f15991c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f15991c;
        int i10 = this.d;
        this.f15989a.lambda$checkLanguage$13(this.f15990b, j3, i10, str);
    }
}
