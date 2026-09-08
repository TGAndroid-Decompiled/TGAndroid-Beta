package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17531a;
    public final MessageObject f17532b;
    public final long f17533c;
    public final int d;

    public dl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f17531a = translateController;
        this.f17532b = messageObject;
        this.f17533c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17531a.lambda$checkLanguage$15(this.f17532b, this.f17533c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f17533c;
        int i10 = this.d;
        this.f17531a.lambda$checkLanguage$13(this.f17532b, j3, i10, str);
    }
}
