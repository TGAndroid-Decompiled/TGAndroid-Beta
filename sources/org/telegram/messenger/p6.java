package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class p6 implements Runnable {
    public final int f19190a = 1;
    public final MediaController f19191b;
    public final int f19192c;
    public final int d;
    public final long e;
    public final long f19193f;
    public final MessageSuggestionParams h;
    public final MessageObject f19194n;
    public final MessageObject f19195r;
    public final TL_stories.StoryItem f19196s;
    public final Object v;

    public p6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f19191b = mediaController;
        this.f19192c = i10;
        this.d = i11;
        this.e = j10;
        this.f19193f = j11;
        this.h = messageSuggestionParams;
        this.f19194n = messageObject;
        this.f19195r = messageObject2;
        this.f19196s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f19190a) {
            case 0:
                MessageObject messageObject = this.f19195r;
                TL_stories.StoryItem storyItem = this.f19196s;
                this.f19191b.lambda$prepareResumedRecording$27(this.f19192c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f19193f, this.h, this.f19194n, messageObject, storyItem);
                return;
            default:
                this.f19191b.lambda$startRecording$40(this.f19192c, this.d, this.e, this.f19193f, this.h, this.f19194n, this.f19195r, this.f19196s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public p6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f19191b = mediaController;
        this.f19192c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f19193f = j11;
        this.h = messageSuggestionParams;
        this.f19194n = messageObject;
        this.f19195r = messageObject2;
        this.f19196s = storyItem;
    }
}
