package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class gl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18484a;
    public final TL_stories.StoryItem f18485b;
    public final TranslateController.StoryKey f18486c;

    public gl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18484a = translateController;
        this.f18485b = storyItem;
        this.f18486c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18484a.lambda$detectStoryLanguage$34(this.f18485b, this.f18486c, exc);
    }

    @Override
    public void run(String str) {
        this.f18484a.lambda$detectStoryLanguage$32(this.f18485b, this.f18486c, str);
    }
}
