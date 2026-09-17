package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18232a;
    public final TL_stories.StoryItem f18233b;
    public final TranslateController.StoryKey f18234c;

    public kl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18232a = translateController;
        this.f18233b = storyItem;
        this.f18234c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18232a.lambda$detectStoryLanguage$34(this.f18233b, this.f18234c, exc);
    }

    @Override
    public void run(String str) {
        this.f18232a.lambda$detectStoryLanguage$32(this.f18233b, this.f18234c, str);
    }
}
