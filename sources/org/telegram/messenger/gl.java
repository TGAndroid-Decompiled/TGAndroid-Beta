package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class gl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18483a;
    public final TL_stories.StoryItem f18484b;
    public final TranslateController.StoryKey f18485c;

    public gl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18483a = translateController;
        this.f18484b = storyItem;
        this.f18485c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18483a.lambda$detectStoryLanguage$34(this.f18484b, this.f18485c, exc);
    }

    @Override
    public void run(String str) {
        this.f18483a.lambda$detectStoryLanguage$32(this.f18484b, this.f18485c, str);
    }
}
