package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class il implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18649a;
    public final TL_stories.StoryItem f18650b;
    public final TranslateController.StoryKey f18651c;

    public il(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18649a = translateController;
        this.f18650b = storyItem;
        this.f18651c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18649a.lambda$detectStoryLanguage$34(this.f18650b, this.f18651c, exc);
    }

    @Override
    public void run(String str) {
        this.f18649a.lambda$detectStoryLanguage$32(this.f18650b, this.f18651c, str);
    }
}
