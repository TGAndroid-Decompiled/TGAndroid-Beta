package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18382a;
    public final TL_stories.StoryItem f18383b;
    public final TranslateController.StoryKey f18384c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18382a = translateController;
        this.f18383b = storyItem;
        this.f18384c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18382a.lambda$detectStoryLanguage$34(this.f18383b, this.f18384c, exc);
    }

    @Override
    public void run(String str) {
        this.f18382a.lambda$detectStoryLanguage$32(this.f18383b, this.f18384c, str);
    }
}
