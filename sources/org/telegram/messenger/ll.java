package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16933a;
    public final TL_stories.StoryItem f16934b;
    public final TranslateController.StoryKey f16935c;

    public ll(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f16933a = translateController;
        this.f16934b = storyItem;
        this.f16935c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f16933a.lambda$detectStoryLanguage$34(this.f16934b, this.f16935c, exc);
    }

    @Override
    public void run(String str) {
        this.f16933a.lambda$detectStoryLanguage$32(this.f16934b, this.f16935c, str);
    }
}
