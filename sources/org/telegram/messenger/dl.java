package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16180a;
    public final MessageObject f16181b;
    public final long f16182c;
    public final int d;

    public dl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f16180a = translateController;
        this.f16181b = messageObject;
        this.f16182c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f16180a.lambda$checkLanguage$15(this.f16181b, this.f16182c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f16182c;
        int i10 = this.d;
        this.f16180a.lambda$checkLanguage$13(this.f16181b, j3, i10, str);
    }
}
