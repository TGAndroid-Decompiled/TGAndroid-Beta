package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class n6 implements Runnable {
    public final int f17924a = 1;
    public final MediaController f17925b;
    public final int f17926c;
    public final int d;
    public final long e;
    public final long f17927f;
    public final MessageSuggestionParams h;
    public final MessageObject f17928n;
    public final MessageObject f17929r;
    public final TL_stories.StoryItem f17930s;
    public final Object v;

    public n6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f17925b = mediaController;
        this.f17926c = i10;
        this.d = i11;
        this.e = j10;
        this.f17927f = j11;
        this.h = messageSuggestionParams;
        this.f17928n = messageObject;
        this.f17929r = messageObject2;
        this.f17930s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f17924a) {
            case 0:
                MessageObject messageObject = this.f17929r;
                TL_stories.StoryItem storyItem = this.f17930s;
                this.f17925b.lambda$prepareResumedRecording$26(this.f17926c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f17927f, this.h, this.f17928n, messageObject, storyItem);
                return;
            default:
                this.f17925b.lambda$startRecording$38(this.f17926c, this.d, this.e, this.f17927f, this.h, this.f17928n, this.f17929r, this.f17930s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public n6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f17925b = mediaController;
        this.f17926c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f17927f = j11;
        this.h = messageSuggestionParams;
        this.f17928n = messageObject;
        this.f17929r = messageObject2;
        this.f17930s = storyItem;
    }
}
