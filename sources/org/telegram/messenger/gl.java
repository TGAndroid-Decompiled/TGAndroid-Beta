package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class gl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18480a;
    public final TL_stories.StoryItem f18481b;
    public final TranslateController.StoryKey f18482c;

    public gl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18480a = translateController;
        this.f18481b = storyItem;
        this.f18482c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18480a.lambda$detectStoryLanguage$34(this.f18481b, this.f18482c, exc);
    }

    @Override
    public void run(String str) {
        this.f18480a.lambda$detectStoryLanguage$32(this.f18481b, this.f18482c, str);
    }
}
