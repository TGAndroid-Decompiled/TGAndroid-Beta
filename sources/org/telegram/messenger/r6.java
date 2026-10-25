package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class r6 implements Runnable {
    public final int f21102a = 1;
    public final MediaController f21103b;
    public final int f21104c;
    public final int d;
    public final long e;
    public final long f21105f;
    public final MessageSuggestionParams h;
    public final MessageObject f21106n;
    public final MessageObject f21107r;
    public final TL_stories.StoryItem f21108s;
    public final Object v;

    public r6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f21103b = mediaController;
        this.f21104c = i10;
        this.d = i11;
        this.e = j10;
        this.f21105f = j11;
        this.h = messageSuggestionParams;
        this.f21106n = messageObject;
        this.f21107r = messageObject2;
        this.f21108s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f21102a) {
            case 0:
                MessageObject messageObject = this.f21107r;
                TL_stories.StoryItem storyItem = this.f21108s;
                this.f21103b.lambda$prepareResumedRecording$27(this.f21104c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f21105f, this.h, this.f21106n, messageObject, storyItem);
                return;
            default:
                this.f21103b.lambda$startRecording$40(this.f21104c, this.d, this.e, this.f21105f, this.h, this.f21106n, this.f21107r, this.f21108s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public r6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f21103b = mediaController;
        this.f21104c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f21105f = j11;
        this.h = messageSuggestionParams;
        this.f21106n = messageObject;
        this.f21107r = messageObject2;
        this.f21108s = storyItem;
    }
}
