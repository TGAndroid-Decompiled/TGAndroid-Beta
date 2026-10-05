package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f18129a = 1;
    public final MediaController f18130b;
    public final int f18131c;
    public final int d;
    public final long f18132e;
    public final long f18133f;
    public final MessageSuggestionParams h;
    public final MessageObject f18134n;
    public final MessageObject f18135r;
    public final TL_stories.StoryItem f18136s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f18130b = mediaController;
        this.f18131c = i10;
        this.d = i11;
        this.f18132e = j3;
        this.f18133f = j10;
        this.h = messageSuggestionParams;
        this.f18134n = messageObject;
        this.f18135r = messageObject2;
        this.f18136s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f18129a) {
            case 0:
                MessageObject messageObject = this.f18135r;
                TL_stories.StoryItem storyItem = this.f18136s;
                this.f18130b.lambda$prepareResumedRecording$25(this.f18131c, (MediaDataController.DraftVoice) this.v, this.d, this.f18132e, this.f18133f, this.h, this.f18134n, messageObject, storyItem);
                return;
            default:
                this.f18130b.lambda$startRecording$37(this.f18131c, this.d, this.f18132e, this.f18133f, this.h, this.f18134n, this.f18135r, this.f18136s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f18130b = mediaController;
        this.f18131c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f18132e = j3;
        this.f18133f = j10;
        this.h = messageSuggestionParams;
        this.f18134n = messageObject;
        this.f18135r = messageObject2;
        this.f18136s = storyItem;
    }
}
