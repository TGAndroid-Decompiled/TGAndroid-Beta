package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class cl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18178a;
    public final MessageObject f18179b;
    public final long f18180c;
    public final int d;

    public cl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f18178a = translateController;
        this.f18179b = messageObject;
        this.f18180c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f18178a.lambda$checkLanguage$15(this.f18179b, this.f18180c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f18180c;
        int i10 = this.d;
        this.f18178a.lambda$checkLanguage$13(this.f18179b, j10, i10, str);
    }
}
