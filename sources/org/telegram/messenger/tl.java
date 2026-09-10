package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class tl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16440a;
    public final TL_stories.StoryItem f16441b;
    public final TranslateController.StoryKey f16442c;

    public tl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f16440a = translateController;
        this.f16441b = storyItem;
        this.f16442c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f16440a.lambda$detectStoryLanguage$34(this.f16441b, this.f16442c, exc);
    }

    @Override
    public void run(String str) {
        this.f16440a.lambda$detectStoryLanguage$32(this.f16441b, this.f16442c, str);
    }
}
