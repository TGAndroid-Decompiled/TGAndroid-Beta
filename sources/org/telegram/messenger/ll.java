package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16888a;
    public final TL_stories.StoryItem f16889b;
    public final TranslateController.StoryKey f16890c;

    public ll(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f16888a = translateController;
        this.f16889b = storyItem;
        this.f16890c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f16888a.lambda$detectStoryLanguage$34(this.f16889b, this.f16890c, exc);
    }

    @Override
    public void run(String str) {
        this.f16888a.lambda$detectStoryLanguage$32(this.f16889b, this.f16890c, str);
    }
}
