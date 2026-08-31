package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class l6 implements Runnable {
    public final int f19236a = 1;
    public final MediaController f19237b;
    public final int f19238c;
    public final int d;
    public final long f19239e;
    public final long f19240f;
    public final MessageSuggestionParams h;
    public final MessageObject f19241n;
    public final MessageObject f19242r;
    public final TL_stories.StoryItem f19243s;
    public final Object v;

    public l6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f19237b = mediaController;
        this.f19238c = i10;
        this.d = i11;
        this.f19239e = j10;
        this.f19240f = j11;
        this.h = messageSuggestionParams;
        this.f19241n = messageObject;
        this.f19242r = messageObject2;
        this.f19243s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f19236a) {
            case 0:
                MessageObject messageObject = this.f19242r;
                TL_stories.StoryItem storyItem = this.f19243s;
                this.f19237b.lambda$prepareResumedRecording$25(this.f19238c, (MediaDataController.DraftVoice) this.v, this.d, this.f19239e, this.f19240f, this.h, this.f19241n, messageObject, storyItem);
                return;
            default:
                this.f19237b.lambda$startRecording$37(this.f19238c, this.d, this.f19239e, this.f19240f, this.h, this.f19241n, this.f19242r, this.f19243s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public l6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f19237b = mediaController;
        this.f19238c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f19239e = j10;
        this.f19240f = j11;
        this.h = messageSuggestionParams;
        this.f19241n = messageObject;
        this.f19242r = messageObject2;
        this.f19243s = storyItem;
    }
}
