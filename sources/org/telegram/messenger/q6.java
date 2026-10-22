package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class q6 implements Runnable {
    public final int f19263a = 1;
    public final MediaController f19264b;
    public final int f19265c;
    public final int d;
    public final long e;
    public final long f19266f;
    public final MessageSuggestionParams h;
    public final MessageObject f19267n;
    public final MessageObject f19268r;
    public final TL_stories.StoryItem f19269s;
    public final Object v;

    public q6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f19264b = mediaController;
        this.f19265c = i10;
        this.d = i11;
        this.e = j10;
        this.f19266f = j11;
        this.h = messageSuggestionParams;
        this.f19267n = messageObject;
        this.f19268r = messageObject2;
        this.f19269s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f19263a) {
            case 0:
                MessageObject messageObject = this.f19268r;
                TL_stories.StoryItem storyItem = this.f19269s;
                this.f19264b.lambda$prepareResumedRecording$27(this.f19265c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f19266f, this.h, this.f19267n, messageObject, storyItem);
                return;
            default:
                this.f19264b.lambda$startRecording$40(this.f19265c, this.d, this.e, this.f19266f, this.h, this.f19267n, this.f19268r, this.f19269s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public q6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f19264b = mediaController;
        this.f19265c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f19266f = j11;
        this.h = messageSuggestionParams;
        this.f19267n = messageObject;
        this.f19268r = messageObject2;
        this.f19269s = storyItem;
    }
}
