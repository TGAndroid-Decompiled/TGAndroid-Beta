package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16709a;
    public final TL_stories.StoryItem f16710b;
    public final TranslateController.StoryKey f16711c;

    public ll(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f16709a = translateController;
        this.f16710b = storyItem;
        this.f16711c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f16709a.lambda$detectStoryLanguage$34(this.f16710b, this.f16711c, exc);
    }

    @Override
    public void run(String str) {
        this.f16709a.lambda$detectStoryLanguage$32(this.f16710b, this.f16711c, str);
    }
}
