package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18804a;
    public final TL_stories.StoryItem f18805b;
    public final TranslateController.StoryKey f18806c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18804a = translateController;
        this.f18805b = storyItem;
        this.f18806c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18804a.lambda$detectStoryLanguage$34(this.f18805b, this.f18806c, exc);
    }

    @Override
    public void run(String str) {
        this.f18804a.lambda$detectStoryLanguage$32(this.f18805b, this.f18806c, str);
    }
}
