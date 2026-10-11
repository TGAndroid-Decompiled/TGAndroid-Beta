package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class j6 implements Runnable {
    public final int f18270a = 1;
    public final MediaController f18271b;
    public final int f18272c;
    public final int d;
    public final long f18273e;
    public final long f18274f;
    public final MessageSuggestionParams h;
    public final MessageObject f18275n;
    public final MessageObject f18276r;
    public final TL_stories.StoryItem f18277s;
    public final Object v;

    public j6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f18271b = mediaController;
        this.f18272c = i10;
        this.d = i11;
        this.f18273e = j3;
        this.f18274f = j10;
        this.h = messageSuggestionParams;
        this.f18275n = messageObject;
        this.f18276r = messageObject2;
        this.f18277s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f18270a) {
            case 0:
                MessageObject messageObject = this.f18276r;
                TL_stories.StoryItem storyItem = this.f18277s;
                this.f18271b.lambda$prepareResumedRecording$25(this.f18272c, (MediaDataController.DraftVoice) this.v, this.d, this.f18273e, this.f18274f, this.h, this.f18275n, messageObject, storyItem);
                return;
            default:
                this.f18271b.lambda$startRecording$37(this.f18272c, this.d, this.f18273e, this.f18274f, this.h, this.f18275n, this.f18276r, this.f18277s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public j6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f18271b = mediaController;
        this.f18272c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f18273e = j3;
        this.f18274f = j10;
        this.h = messageSuggestionParams;
        this.f18275n = messageObject;
        this.f18276r = messageObject2;
        this.f18277s = storyItem;
    }
}
