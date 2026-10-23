package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class cl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18138a;
    public final MessageObject f18139b;
    public final long f18140c;
    public final int d;

    public cl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f18138a = translateController;
        this.f18139b = messageObject;
        this.f18140c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f18138a.lambda$checkLanguage$15(this.f18139b, this.f18140c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f18140c;
        int i10 = this.d;
        this.f18138a.lambda$checkLanguage$13(this.f18139b, j10, i10, str);
    }
}
