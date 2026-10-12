package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class n6 implements Runnable {
    public final int f18350a = 1;
    public final MediaController f18351b;
    public final int f18352c;
    public final int d;
    public final long f18353e;
    public final long f18354f;
    public final MessageSuggestionParams h;
    public final MessageObject f18355n;
    public final MessageObject f18356r;
    public final TL_stories.StoryItem f18357s;
    public final Object v;

    public n6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f18351b = mediaController;
        this.f18352c = i10;
        this.d = i11;
        this.f18353e = j3;
        this.f18354f = j10;
        this.h = messageSuggestionParams;
        this.f18355n = messageObject;
        this.f18356r = messageObject2;
        this.f18357s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f18350a) {
            case 0:
                MessageObject messageObject = this.f18356r;
                TL_stories.StoryItem storyItem = this.f18357s;
                this.f18351b.lambda$prepareResumedRecording$26(this.f18352c, (MediaDataController.DraftVoice) this.v, this.d, this.f18353e, this.f18354f, this.h, this.f18355n, messageObject, storyItem);
                return;
            default:
                this.f18351b.lambda$startRecording$38(this.f18352c, this.d, this.f18353e, this.f18354f, this.h, this.f18355n, this.f18356r, this.f18357s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public n6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f18351b = mediaController;
        this.f18352c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f18353e = j3;
        this.f18354f = j10;
        this.h = messageSuggestionParams;
        this.f18355n = messageObject;
        this.f18356r = messageObject2;
        this.f18357s = storyItem;
    }
}
