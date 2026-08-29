package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class jl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f20716a;
    public final TL_stories.StoryItem f20717b;
    public final TranslateController.StoryKey f20718c;

    public jl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f20716a = translateController;
        this.f20717b = storyItem;
        this.f20718c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f20716a.lambda$detectStoryLanguage$34(this.f20717b, this.f20718c, exc);
    }

    @Override
    public void run(String str) {
        this.f20716a.lambda$detectStoryLanguage$32(this.f20717b, this.f20718c, str);
    }
}
