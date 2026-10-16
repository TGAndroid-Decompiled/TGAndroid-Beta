package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class ol implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17750a;
    public final TL_stories.StoryItem f17751b;
    public final TranslateController.StoryKey f17752c;

    public ol(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f17750a = translateController;
        this.f17751b = storyItem;
        this.f17752c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f17750a.lambda$detectStoryLanguage$34(this.f17751b, this.f17752c, exc);
    }

    @Override
    public void run(String str) {
        this.f17750a.lambda$detectStoryLanguage$32(this.f17751b, this.f17752c, str);
    }
}
