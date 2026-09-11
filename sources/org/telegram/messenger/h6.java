package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class h6 implements Runnable {
    public final int f17861a = 1;
    public final MediaController f17862b;
    public final int f17863c;
    public final int d;
    public final long f17864e;
    public final long f17865f;
    public final MessageSuggestionParams h;
    public final MessageObject f17866n;
    public final MessageObject f17867r;
    public final TL_stories.StoryItem f17868s;
    public final Object v;

    public h6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f17862b = mediaController;
        this.f17863c = i10;
        this.d = i11;
        this.f17864e = j3;
        this.f17865f = j10;
        this.h = messageSuggestionParams;
        this.f17866n = messageObject;
        this.f17867r = messageObject2;
        this.f17868s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f17861a) {
            case 0:
                MessageObject messageObject = this.f17867r;
                TL_stories.StoryItem storyItem = this.f17868s;
                this.f17862b.lambda$prepareResumedRecording$25(this.f17863c, (MediaDataController.DraftVoice) this.v, this.d, this.f17864e, this.f17865f, this.h, this.f17866n, messageObject, storyItem);
                return;
            default:
                this.f17862b.lambda$startRecording$37(this.f17863c, this.d, this.f17864e, this.f17865f, this.h, this.f17866n, this.f17867r, this.f17868s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public h6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f17862b = mediaController;
        this.f17863c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f17864e = j3;
        this.f17865f = j10;
        this.h = messageSuggestionParams;
        this.f17866n = messageObject;
        this.f17867r = messageObject2;
        this.f17868s = storyItem;
    }
}
