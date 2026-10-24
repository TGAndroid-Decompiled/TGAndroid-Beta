package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class q6 implements Runnable {
    public final int f19330a = 1;
    public final MediaController f19331b;
    public final int f19332c;
    public final int d;
    public final long e;
    public final long f19333f;
    public final MessageSuggestionParams h;
    public final MessageObject f19334n;
    public final MessageObject f19335r;
    public final TL_stories.StoryItem f19336s;
    public final Object v;

    public q6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f19331b = mediaController;
        this.f19332c = i10;
        this.d = i11;
        this.e = j10;
        this.f19333f = j11;
        this.h = messageSuggestionParams;
        this.f19334n = messageObject;
        this.f19335r = messageObject2;
        this.f19336s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f19330a) {
            case 0:
                MessageObject messageObject = this.f19335r;
                TL_stories.StoryItem storyItem = this.f19336s;
                this.f19331b.lambda$prepareResumedRecording$27(this.f19332c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f19333f, this.h, this.f19334n, messageObject, storyItem);
                return;
            default:
                this.f19331b.lambda$startRecording$40(this.f19332c, this.d, this.e, this.f19333f, this.h, this.f19334n, this.f19335r, this.f19336s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public q6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f19331b = mediaController;
        this.f19332c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f19333f = j11;
        this.h = messageSuggestionParams;
        this.f19334n = messageObject;
        this.f19335r = messageObject2;
        this.f19336s = storyItem;
    }
}
