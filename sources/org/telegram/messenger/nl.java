package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17979a;
    public final TL_stories.StoryItem f17980b;
    public final TranslateController.StoryKey f17981c;

    public nl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f17979a = translateController;
        this.f17980b = storyItem;
        this.f17981c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f17979a.lambda$detectStoryLanguage$34(this.f17980b, this.f17981c, exc);
    }

    @Override
    public void run(String str) {
        this.f17979a.lambda$detectStoryLanguage$32(this.f17980b, this.f17981c, str);
    }
}
