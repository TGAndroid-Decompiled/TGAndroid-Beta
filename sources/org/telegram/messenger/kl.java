package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18383a;
    public final TL_stories.StoryItem f18384b;
    public final TranslateController.StoryKey f18385c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18383a = translateController;
        this.f18384b = storyItem;
        this.f18385c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18383a.lambda$detectStoryLanguage$34(this.f18384b, this.f18385c, exc);
    }

    @Override
    public void run(String str) {
        this.f18383a.lambda$detectStoryLanguage$32(this.f18384b, this.f18385c, str);
    }
}
