package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18406a;
    public final TL_stories.StoryItem f18407b;
    public final TranslateController.StoryKey f18408c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18406a = translateController;
        this.f18407b = storyItem;
        this.f18408c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18406a.lambda$detectStoryLanguage$34(this.f18407b, this.f18408c, exc);
    }

    @Override
    public void run(String str) {
        this.f18406a.lambda$detectStoryLanguage$32(this.f18407b, this.f18408c, str);
    }
}
