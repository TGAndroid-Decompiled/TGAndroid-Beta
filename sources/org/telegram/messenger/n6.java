package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class n6 implements Runnable {
    public final int f17621a = 1;
    public final MediaController f17622b;
    public final int f17623c;
    public final int d;
    public final long e;
    public final long f17624f;
    public final MessageSuggestionParams h;
    public final MessageObject f17625n;
    public final MessageObject f17626r;
    public final TL_stories.StoryItem f17627s;
    public final Object v;

    public n6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f17622b = mediaController;
        this.f17623c = i10;
        this.d = i11;
        this.e = j10;
        this.f17624f = j11;
        this.h = messageSuggestionParams;
        this.f17625n = messageObject;
        this.f17626r = messageObject2;
        this.f17627s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f17621a) {
            case 0:
                MessageObject messageObject = this.f17626r;
                TL_stories.StoryItem storyItem = this.f17627s;
                this.f17622b.lambda$prepareResumedRecording$26(this.f17623c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f17624f, this.h, this.f17625n, messageObject, storyItem);
                return;
            default:
                this.f17622b.lambda$startRecording$38(this.f17623c, this.d, this.e, this.f17624f, this.h, this.f17625n, this.f17626r, this.f17627s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public n6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f17622b = mediaController;
        this.f17623c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f17624f = j11;
        this.h = messageSuggestionParams;
        this.f17625n = messageObject;
        this.f17626r = messageObject2;
        this.f17627s = storyItem;
    }
}
