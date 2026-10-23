package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class il implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18725a;
    public final TL_stories.StoryItem f18726b;
    public final TranslateController.StoryKey f18727c;

    public il(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18725a = translateController;
        this.f18726b = storyItem;
        this.f18727c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18725a.lambda$detectStoryLanguage$34(this.f18726b, this.f18727c, exc);
    }

    @Override
    public void run(String str) {
        this.f18725a.lambda$detectStoryLanguage$32(this.f18726b, this.f18727c, str);
    }
}
