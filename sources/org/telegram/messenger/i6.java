package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f18133a = 1;
    public final MediaController f18134b;
    public final int f18135c;
    public final int d;
    public final long f18136e;
    public final long f18137f;
    public final MessageSuggestionParams h;
    public final MessageObject f18138n;
    public final MessageObject f18139r;
    public final TL_stories.StoryItem f18140s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f18134b = mediaController;
        this.f18135c = i10;
        this.d = i11;
        this.f18136e = j3;
        this.f18137f = j10;
        this.h = messageSuggestionParams;
        this.f18138n = messageObject;
        this.f18139r = messageObject2;
        this.f18140s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f18133a) {
            case 0:
                MessageObject messageObject = this.f18139r;
                TL_stories.StoryItem storyItem = this.f18140s;
                this.f18134b.lambda$prepareResumedRecording$25(this.f18135c, (MediaDataController.DraftVoice) this.v, this.d, this.f18136e, this.f18137f, this.h, this.f18138n, messageObject, storyItem);
                return;
            default:
                this.f18134b.lambda$startRecording$37(this.f18135c, this.d, this.f18136e, this.f18137f, this.h, this.f18138n, this.f18139r, this.f18140s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f18134b = mediaController;
        this.f18135c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f18136e = j3;
        this.f18137f = j10;
        this.h = messageSuggestionParams;
        this.f18138n = messageObject;
        this.f18139r = messageObject2;
        this.f18140s = storyItem;
    }
}
