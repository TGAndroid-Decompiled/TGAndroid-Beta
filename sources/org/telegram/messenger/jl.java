package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.tl.TL_stories;
public final class jl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18728a;
    public final TL_stories.StoryItem f18729b;
    public final TranslateController.StoryKey f18730c;

    public jl(TranslateController translateController, TL_stories.StoryItem storyItem, TranslateController.StoryKey storyKey) {
        this.f18728a = translateController;
        this.f18729b = storyItem;
        this.f18730c = storyKey;
    }

    @Override
    public void run(Exception exc) {
        this.f18728a.lambda$detectStoryLanguage$34(this.f18729b, this.f18730c, exc);
    }

    @Override
    public void run(String str) {
        this.f18728a.lambda$detectStoryLanguage$32(this.f18729b, this.f18730c, str);
    }
}
