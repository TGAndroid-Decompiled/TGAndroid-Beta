package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class jl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18795a;
    public final TL_stories.StoryItem f18796b;
    public final TranslateController.StoryKey f18797c;

    public jl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18795a = translateController;
        this.f18796b = storyItem;
        this.f18797c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18795a.lambda$detectStoryLanguage$34(this.f18796b, this.f18797c, exc);
    }

    @Override
    public void run(String str) {
        this.f18795a.lambda$detectStoryLanguage$32(this.f18796b, this.f18797c, str);
    }
}
