package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18378a;
    public final TL_stories.StoryItem f18379b;
    public final TranslateController.StoryKey f18380c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18378a = translateController;
        this.f18379b = storyItem;
        this.f18380c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18378a.lambda$detectStoryLanguage$34(this.f18379b, this.f18380c, exc);
    }

    @Override
    public void run(String str) {
        this.f18378a.lambda$detectStoryLanguage$32(this.f18379b, this.f18380c, str);
    }
}
