package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18414a;
    public final TL_stories.StoryItem f18415b;
    public final TranslateController.StoryKey f18416c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18414a = translateController;
        this.f18415b = storyItem;
        this.f18416c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18414a.lambda$detectStoryLanguage$34(this.f18415b, this.f18416c, exc);
    }

    @Override
    public void run(String str) {
        this.f18414a.lambda$detectStoryLanguage$32(this.f18415b, this.f18416c, str);
    }
}
