package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f18132a = 1;
    public final MediaController f18133b;
    public final int f18134c;
    public final int d;
    public final long f18135e;
    public final long f18136f;
    public final MessageSuggestionParams h;
    public final MessageObject f18137n;
    public final MessageObject f18138r;
    public final TL_stories.StoryItem f18139s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f18133b = mediaController;
        this.f18134c = i10;
        this.d = i11;
        this.f18135e = j3;
        this.f18136f = j10;
        this.h = messageSuggestionParams;
        this.f18137n = messageObject;
        this.f18138r = messageObject2;
        this.f18139s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f18132a) {
            case 0:
                MessageObject messageObject = this.f18138r;
                TL_stories.StoryItem storyItem = this.f18139s;
                this.f18133b.lambda$prepareResumedRecording$25(this.f18134c, (MediaDataController.DraftVoice) this.v, this.d, this.f18135e, this.f18136f, this.h, this.f18137n, messageObject, storyItem);
                return;
            default:
                this.f18133b.lambda$startRecording$37(this.f18134c, this.d, this.f18135e, this.f18136f, this.h, this.f18137n, this.f18138r, this.f18139s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f18133b = mediaController;
        this.f18134c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f18135e = j3;
        this.f18136f = j10;
        this.h = messageSuggestionParams;
        this.f18137n = messageObject;
        this.f18138r = messageObject2;
        this.f18139s = storyItem;
    }
}
