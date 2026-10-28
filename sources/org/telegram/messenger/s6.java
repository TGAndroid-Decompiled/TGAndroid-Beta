package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class s6 implements Runnable {
    public final int f21179a = 1;
    public final MediaController f21180b;
    public final int f21181c;
    public final int d;
    public final long e;
    public final long f21182f;
    public final MessageSuggestionParams h;
    public final MessageObject f21183n;
    public final MessageObject f21184r;
    public final TL_stories.StoryItem f21185s;
    public final Object v;

    public s6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f21180b = mediaController;
        this.f21181c = i10;
        this.d = i11;
        this.e = j10;
        this.f21182f = j11;
        this.h = messageSuggestionParams;
        this.f21183n = messageObject;
        this.f21184r = messageObject2;
        this.f21185s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f21179a) {
            case 0:
                MessageObject messageObject = this.f21184r;
                TL_stories.StoryItem storyItem = this.f21185s;
                this.f21180b.lambda$prepareResumedRecording$27(this.f21181c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f21182f, this.h, this.f21183n, messageObject, storyItem);
                return;
            default:
                this.f21180b.lambda$startRecording$40(this.f21181c, this.d, this.e, this.f21182f, this.h, this.f21183n, this.f21184r, this.f21185s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public s6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f21180b = mediaController;
        this.f21181c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f21182f = j11;
        this.h = messageSuggestionParams;
        this.f21183n = messageObject;
        this.f21184r = messageObject2;
        this.f21185s = storyItem;
    }
}
