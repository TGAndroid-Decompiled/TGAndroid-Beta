package jh;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class e8 extends TLObject {

    public final TL_stories.StoryItem f13313a;

    public int f13314b;

    public e8(TL_stories.StoryItem storyItem) {
        this.f13314b = 0;
        this.f13313a = storyItem;
        boolean z10 = storyItem.translated;
        this.f13314b = z10 ? 1 : 0;
        int i10 = (z10 ? 1 : 0) + (storyItem.detectedLng != null ? 2 : 0);
        this.f13314b = i10;
        int i11 = i10 + (storyItem.translatedText != null ? 4 : 0);
        this.f13314b = i11;
        this.f13314b = i11 + (storyItem.translatedLng != null ? 8 : 0);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int int32 = inputSerializedData.readInt32(true);
        this.f13314b = int32;
        boolean z11 = (int32 & 1) != 0;
        TL_stories.StoryItem storyItem = this.f13313a;
        storyItem.translated = z11;
        if ((int32 & 2) != 0) {
            storyItem.detectedLng = inputSerializedData.readString(z10);
        }
        if ((this.f13314b & 4) != 0) {
            storyItem.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f13314b & 8) != 0) {
            storyItem.translatedLng = inputSerializedData.readString(z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1);
        outputSerializedData.writeInt32(this.f13314b);
        int i10 = this.f13314b & 2;
        TL_stories.StoryItem storyItem = this.f13313a;
        if (i10 != 0) {
            outputSerializedData.writeString(storyItem.detectedLng);
        }
        if ((this.f13314b & 4) != 0) {
            storyItem.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.f13314b & 8) != 0) {
            outputSerializedData.writeString(storyItem.translatedLng);
        }
    }
}
