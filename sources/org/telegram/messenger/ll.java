package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16705a;
    public final TL_stories.StoryItem f16706b;
    public final TranslateController.StoryKey f16707c;

    public ll(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f16705a = translateController;
        this.f16706b = storyItem;
        this.f16707c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f16705a.lambda$detectStoryLanguage$34(this.f16706b, this.f16707c, exc);
    }

    @Override
    public void run(String str) {
        this.f16705a.lambda$detectStoryLanguage$32(this.f16706b, this.f16707c, str);
    }
}
