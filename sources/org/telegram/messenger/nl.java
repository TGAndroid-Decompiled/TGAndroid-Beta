package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17946a;
    public final TL_stories.StoryItem f17947b;
    public final TranslateController.StoryKey f17948c;

    public nl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f17946a = translateController;
        this.f17947b = storyItem;
        this.f17948c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f17946a.lambda$detectStoryLanguage$34(this.f17947b, this.f17948c, exc);
    }

    @Override
    public void run(String str) {
        this.f17946a.lambda$detectStoryLanguage$32(this.f17947b, this.f17948c, str);
    }
}
