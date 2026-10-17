package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class m6 implements Runnable {
    public final int f18935a = 1;
    public final MediaController f18936b;
    public final int f18937c;
    public final int d;
    public final long e;
    public final long f18938f;
    public final MessageSuggestionParams h;
    public final MessageObject f18939n;
    public final MessageObject f18940r;
    public final TL_stories.StoryItem f18941s;
    public final Object v;

    public m6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f18936b = mediaController;
        this.f18937c = i10;
        this.d = i11;
        this.e = j10;
        this.f18938f = j11;
        this.h = messageSuggestionParams;
        this.f18939n = messageObject;
        this.f18940r = messageObject2;
        this.f18941s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f18935a) {
            case 0:
                MessageObject messageObject = this.f18940r;
                TL_stories.StoryItem storyItem = this.f18941s;
                this.f18936b.lambda$prepareResumedRecording$26(this.f18937c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f18938f, this.h, this.f18939n, messageObject, storyItem);
                return;
            default:
                this.f18936b.lambda$startRecording$38(this.f18937c, this.d, this.e, this.f18938f, this.h, this.f18939n, this.f18940r, this.f18941s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public m6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f18936b = mediaController;
        this.f18937c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f18938f = j11;
        this.h = messageSuggestionParams;
        this.f18939n = messageObject;
        this.f18940r = messageObject2;
        this.f18941s = storyItem;
    }
}
