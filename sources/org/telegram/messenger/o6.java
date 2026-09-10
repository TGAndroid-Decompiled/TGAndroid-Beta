package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class o6 implements Runnable {
    public final int f15933a = 1;
    public final MediaController f15934b;
    public final int f15935c;
    public final int d;
    public final long e;
    public final long f15936f;
    public final MessageSuggestionParams h;
    public final MessageObject f15937n;
    public final MessageObject f15938r;
    public final TL_stories.StoryItem f15939s;
    public final Object v;

    public o6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f15934b = mediaController;
        this.f15935c = i10;
        this.d = i11;
        this.e = j3;
        this.f15936f = j10;
        this.h = messageSuggestionParams;
        this.f15937n = messageObject;
        this.f15938r = messageObject2;
        this.f15939s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f15933a) {
            case 0:
                MessageObject messageObject = this.f15938r;
                TL_stories.StoryItem storyItem = this.f15939s;
                this.f15934b.lambda$prepareResumedRecording$25(this.f15935c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f15936f, this.h, this.f15937n, messageObject, storyItem);
                return;
            default:
                this.f15934b.lambda$startRecording$37(this.f15935c, this.d, this.e, this.f15936f, this.h, this.f15937n, this.f15938r, this.f15939s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public o6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f15934b = mediaController;
        this.f15935c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j3;
        this.f15936f = j10;
        this.h = messageSuggestionParams;
        this.f15937n = messageObject;
        this.f15938r = messageObject2;
        this.f15939s = storyItem;
    }
}
