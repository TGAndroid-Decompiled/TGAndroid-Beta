package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class n6 implements Runnable {
    public final int f18349a = 1;
    public final MediaController f18350b;
    public final int f18351c;
    public final int d;
    public final long f18352e;
    public final long f18353f;
    public final MessageSuggestionParams h;
    public final MessageObject f18354n;
    public final MessageObject f18355r;
    public final TL_stories.StoryItem f18356s;
    public final Object v;

    public n6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f18350b = mediaController;
        this.f18351c = i10;
        this.d = i11;
        this.f18352e = j3;
        this.f18353f = j10;
        this.h = messageSuggestionParams;
        this.f18354n = messageObject;
        this.f18355r = messageObject2;
        this.f18356s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f18349a) {
            case 0:
                MessageObject messageObject = this.f18355r;
                TL_stories.StoryItem storyItem = this.f18356s;
                this.f18350b.lambda$prepareResumedRecording$26(this.f18351c, (MediaDataController.DraftVoice) this.v, this.d, this.f18352e, this.f18353f, this.h, this.f18354n, messageObject, storyItem);
                return;
            default:
                this.f18350b.lambda$startRecording$38(this.f18351c, this.d, this.f18352e, this.f18353f, this.h, this.f18354n, this.f18355r, this.f18356s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public n6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f18350b = mediaController;
        this.f18351c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f18352e = j3;
        this.f18353f = j10;
        this.h = messageSuggestionParams;
        this.f18354n = messageObject;
        this.f18355r = messageObject2;
        this.f18356s = storyItem;
    }
}
