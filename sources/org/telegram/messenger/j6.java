package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class j6 implements Runnable {
    public final int f18229a = 1;
    public final MediaController f18230b;
    public final int f18231c;
    public final int d;
    public final long f18232e;
    public final long f18233f;
    public final MessageSuggestionParams h;
    public final MessageObject f18234n;
    public final MessageObject f18235r;
    public final TL_stories.StoryItem f18236s;
    public final Object v;

    public j6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f18230b = mediaController;
        this.f18231c = i10;
        this.d = i11;
        this.f18232e = j3;
        this.f18233f = j10;
        this.h = messageSuggestionParams;
        this.f18234n = messageObject;
        this.f18235r = messageObject2;
        this.f18236s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f18229a) {
            case 0:
                MessageObject messageObject = this.f18235r;
                TL_stories.StoryItem storyItem = this.f18236s;
                this.f18230b.lambda$prepareResumedRecording$25(this.f18231c, (MediaDataController.DraftVoice) this.v, this.d, this.f18232e, this.f18233f, this.h, this.f18234n, messageObject, storyItem);
                return;
            default:
                this.f18230b.lambda$startRecording$37(this.f18231c, this.d, this.f18232e, this.f18233f, this.h, this.f18234n, this.f18235r, this.f18236s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public j6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f18230b = mediaController;
        this.f18231c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f18232e = j3;
        this.f18233f = j10;
        this.h = messageSuggestionParams;
        this.f18234n = messageObject;
        this.f18235r = messageObject2;
        this.f18236s = storyItem;
    }
}
