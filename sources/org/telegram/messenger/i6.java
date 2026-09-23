package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f16367a = 1;
    public final MediaController f16368b;
    public final int f16369c;
    public final int d;
    public final long e;
    public final long f16370f;
    public final MessageSuggestionParams h;
    public final MessageObject f16371n;
    public final MessageObject f16372r;
    public final TL_stories.StoryItem f16373s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f16368b = mediaController;
        this.f16369c = i10;
        this.d = i11;
        this.e = j3;
        this.f16370f = j10;
        this.h = messageSuggestionParams;
        this.f16371n = messageObject;
        this.f16372r = messageObject2;
        this.f16373s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f16367a) {
            case 0:
                MessageObject messageObject = this.f16372r;
                TL_stories.StoryItem storyItem = this.f16373s;
                this.f16368b.lambda$prepareResumedRecording$25(this.f16369c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f16370f, this.h, this.f16371n, messageObject, storyItem);
                return;
            default:
                this.f16368b.lambda$startRecording$37(this.f16369c, this.d, this.e, this.f16370f, this.h, this.f16371n, this.f16372r, this.f16373s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f16368b = mediaController;
        this.f16369c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j3;
        this.f16370f = j10;
        this.h = messageSuggestionParams;
        this.f16371n = messageObject;
        this.f16372r = messageObject2;
        this.f16373s = storyItem;
    }
}
