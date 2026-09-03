package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class l6 implements Runnable {
    public final int f19238a = 1;
    public final MediaController f19239b;
    public final int f19240c;
    public final int d;
    public final long f19241e;
    public final long f19242f;
    public final MessageSuggestionParams h;
    public final MessageObject f19243n;
    public final MessageObject f19244r;
    public final TL_stories.StoryItem f19245s;
    public final Object v;

    public l6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f19239b = mediaController;
        this.f19240c = i10;
        this.d = i11;
        this.f19241e = j10;
        this.f19242f = j11;
        this.h = messageSuggestionParams;
        this.f19243n = messageObject;
        this.f19244r = messageObject2;
        this.f19245s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f19238a) {
            case 0:
                MessageObject messageObject = this.f19244r;
                TL_stories.StoryItem storyItem = this.f19245s;
                this.f19239b.lambda$prepareResumedRecording$25(this.f19240c, (MediaDataController.DraftVoice) this.v, this.d, this.f19241e, this.f19242f, this.h, this.f19243n, messageObject, storyItem);
                return;
            default:
                this.f19239b.lambda$startRecording$37(this.f19240c, this.d, this.f19241e, this.f19242f, this.h, this.f19243n, this.f19244r, this.f19245s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public l6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f19239b = mediaController;
        this.f19240c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f19241e = j10;
        this.f19242f = j11;
        this.h = messageSuggestionParams;
        this.f19243n = messageObject;
        this.f19244r = messageObject2;
        this.f19245s = storyItem;
    }
}
