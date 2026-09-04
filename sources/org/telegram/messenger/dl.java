package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17504a;
    public final MessageObject f17505b;
    public final long f17506c;
    public final int d;

    public dl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f17504a = translateController;
        this.f17505b = messageObject;
        this.f17506c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17504a.lambda$checkLanguage$15(this.f17505b, this.f17506c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f17506c;
        int i10 = this.d;
        this.f17504a.lambda$checkLanguage$13(this.f17505b, j3, i10, str);
    }
}
