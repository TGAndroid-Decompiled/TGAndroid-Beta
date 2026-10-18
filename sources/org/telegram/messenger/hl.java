package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class hl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18558a;
    public final TL_stories.StoryItem f18559b;
    public final TranslateController.StoryKey f18560c;

    public hl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18558a = translateController;
        this.f18559b = storyItem;
        this.f18560c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18558a.lambda$detectStoryLanguage$34(this.f18559b, this.f18560c, exc);
    }

    @Override
    public void run(String str) {
        this.f18558a.lambda$detectStoryLanguage$32(this.f18559b, this.f18560c, str);
    }
}
