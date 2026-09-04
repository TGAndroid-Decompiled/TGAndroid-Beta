package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f17941a = 1;
    public final MediaController f17942b;
    public final int f17943c;
    public final int d;
    public final long f17944e;
    public final long f17945f;
    public final MessageSuggestionParams h;
    public final MessageObject f17946n;
    public final MessageObject f17947r;
    public final TL_stories.StoryItem f17948s;
    public final Object v;

    public i6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.f17942b = mediaController;
        this.f17943c = i10;
        this.d = i11;
        this.f17944e = j3;
        this.f17945f = j10;
        this.h = messageSuggestionParams;
        this.f17946n = messageObject;
        this.f17947r = messageObject2;
        this.f17948s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override
    public final void run() {
        switch (this.f17941a) {
            case 0:
                MessageObject messageObject = this.f17947r;
                TL_stories.StoryItem storyItem = this.f17948s;
                this.f17942b.lambda$prepareResumedRecording$25(this.f17943c, (MediaDataController.DraftVoice) this.v, this.d, this.f17944e, this.f17945f, this.h, this.f17946n, messageObject, storyItem);
                return;
            default:
                this.f17942b.lambda$startRecording$37(this.f17943c, this.d, this.f17944e, this.f17945f, this.h, this.f17946n, this.f17947r, this.f17948s, (SendMessageChatArguments) this.v);
                return;
        }
    }

    public i6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.f17942b = mediaController;
        this.f17943c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.f17944e = j3;
        this.f17945f = j10;
        this.h = messageSuggestionParams;
        this.f17946n = messageObject;
        this.f17947r = messageObject2;
        this.f17948s = storyItem;
    }
}
