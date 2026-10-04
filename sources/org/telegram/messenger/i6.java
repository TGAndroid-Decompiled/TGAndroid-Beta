package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f18124a = 1;
    public final MediaController f18125b;
    public final int f18126c;
    public final int d;
    public final long f18127e;
    public final long f18128f;
    public final MessageSuggestionParams h;
    public final MessageObject f18129n;
    public final MessageObject f18130r;
    public final TL_stories.StoryItem f18131s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f18125b = mediaController;
        this.f18126c = i10;
        this.d = i11;
        this.f18127e = j3;
        this.f18128f = j10;
        this.h = messageSuggestionParams;
        this.f18129n = messageObject;
        this.f18130r = messageObject2;
        this.f18131s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f18124a) {
            case 0:
                MessageObject messageObject = this.f18130r;
                TL_stories.StoryItem storyItem = this.f18131s;
                this.f18125b.lambda$prepareResumedRecording$25(this.f18126c, (MediaDataController.DraftVoice) this.v, this.d, this.f18127e, this.f18128f, this.h, this.f18129n, messageObject, storyItem);
                return;
            default:
                this.f18125b.lambda$startRecording$37(this.f18126c, this.d, this.f18127e, this.f18128f, this.h, this.f18129n, this.f18130r, this.f18131s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f18125b = mediaController;
        this.f18126c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f18127e = j3;
        this.f18128f = j10;
        this.h = messageSuggestionParams;
        this.f18129n = messageObject;
        this.f18130r = messageObject2;
        this.f18131s = storyItem;
    }
}
