package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18217a;
    public final MessageObject f18218b;
    public final long f18219c;
    public final int d;

    public dl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f18217a = translateController;
        this.f18218b = messageObject;
        this.f18219c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f18217a.lambda$checkLanguage$15(this.f18218b, this.f18219c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f18219c;
        int i10 = this.d;
        this.f18217a.lambda$checkLanguage$13(this.f18218b, j10, i10, str);
    }
}
