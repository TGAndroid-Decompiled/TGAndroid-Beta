package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f20814a;
    public final TL_stories.StoryItem f20815b;
    public final TranslateController.StoryKey f20816c;

    public nl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f20814a = translateController;
        this.f20815b = storyItem;
        this.f20816c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f20814a.lambda$detectStoryLanguage$34(this.f20815b, this.f20816c, exc);
    }

    @Override
    public void run(String str) {
        this.f20814a.lambda$detectStoryLanguage$32(this.f20815b, this.f20816c, str);
    }
}
