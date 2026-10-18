package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class m6 implements Runnable {
    public final int f18941a = 1;
    public final MediaController f18942b;
    public final int f18943c;
    public final int d;
    public final long e;
    public final long f18944f;
    public final MessageSuggestionParams h;
    public final MessageObject f18945n;
    public final MessageObject f18946r;
    public final TL_stories.StoryItem f18947s;
    public final Object v;

    public m6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f18942b = mediaController;
        this.f18943c = i10;
        this.d = i11;
        this.e = j10;
        this.f18944f = j11;
        this.h = messageSuggestionParams;
        this.f18945n = messageObject;
        this.f18946r = messageObject2;
        this.f18947s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f18941a) {
            case 0:
                MessageObject messageObject = this.f18946r;
                TL_stories.StoryItem storyItem = this.f18947s;
                this.f18942b.lambda$prepareResumedRecording$26(this.f18943c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f18944f, this.h, this.f18945n, messageObject, storyItem);
                return;
            default:
                this.f18942b.lambda$startRecording$38(this.f18943c, this.d, this.e, this.f18944f, this.h, this.f18945n, this.f18946r, this.f18947s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public m6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f18942b = mediaController;
        this.f18943c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f18944f = j11;
        this.h = messageSuggestionParams;
        this.f18945n = messageObject;
        this.f18946r = messageObject2;
        this.f18947s = storyItem;
    }
}
