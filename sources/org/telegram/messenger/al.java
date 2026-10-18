package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class al implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17899a;
    public final MessageObject f17900b;
    public final long f17901c;
    public final int d;

    public al(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f17899a = translateController;
        this.f17900b = messageObject;
        this.f17901c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17899a.lambda$checkLanguage$15(this.f17900b, this.f17901c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f17901c;
        int i10 = this.d;
        this.f17899a.lambda$checkLanguage$13(this.f17900b, j10, i10, str);
    }
}
