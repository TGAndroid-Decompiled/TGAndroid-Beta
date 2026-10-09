package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class j6 implements Runnable {
    public final int f18225a = 1;
    public final MediaController f18226b;
    public final int f18227c;
    public final int d;
    public final long f18228e;
    public final long f18229f;
    public final MessageSuggestionParams h;
    public final MessageObject f18230n;
    public final MessageObject f18231r;
    public final TL_stories.StoryItem f18232s;
    public final Object v;

    public j6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f18226b = mediaController;
        this.f18227c = i10;
        this.d = i11;
        this.f18228e = j3;
        this.f18229f = j10;
        this.h = messageSuggestionParams;
        this.f18230n = messageObject;
        this.f18231r = messageObject2;
        this.f18232s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f18225a) {
            case 0:
                MessageObject messageObject = this.f18231r;
                TL_stories.StoryItem storyItem = this.f18232s;
                this.f18226b.lambda$prepareResumedRecording$25(this.f18227c, (MediaDataController.DraftVoice) this.v, this.d, this.f18228e, this.f18229f, this.h, this.f18230n, messageObject, storyItem);
                return;
            default:
                this.f18226b.lambda$startRecording$37(this.f18227c, this.d, this.f18228e, this.f18229f, this.h, this.f18230n, this.f18231r, this.f18232s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public j6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f18226b = mediaController;
        this.f18227c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f18228e = j3;
        this.f18229f = j10;
        this.h = messageSuggestionParams;
        this.f18230n = messageObject;
        this.f18231r = messageObject2;
        this.f18232s = storyItem;
    }
}
