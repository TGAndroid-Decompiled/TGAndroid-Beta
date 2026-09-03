package nh;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class e8 extends TLObject {
    public final TL_stories.StoryItem f15295a;
    public int f15296b;

    public e8(TL_stories.StoryItem storyItem) {
        int i10;
        int i11;
        this.f15296b = 0;
        this.f15295a = storyItem;
        boolean z4 = storyItem.translated;
        this.f15296b = z4 ? 1 : 0;
        if (storyItem.detectedLng != null) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i12 = (z4 ? 1 : 0) + i10;
        this.f15296b = i12;
        if (storyItem.translatedText != null) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        int i13 = i12 + i11;
        this.f15296b = i13;
        this.f15296b = i13 + (storyItem.translatedLng != null ? 8 : 0);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        boolean z10 = true;
        int readInt32 = inputSerializedData.readInt32(true);
        this.f15296b = readInt32;
        if ((readInt32 & 1) == 0) {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = this.f15295a;
        storyItem.translated = z10;
        if ((readInt32 & 2) != 0) {
            storyItem.detectedLng = inputSerializedData.readString(z4);
        }
        if ((this.f15296b & 4) != 0) {
            storyItem.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }
        if ((this.f15296b & 8) != 0) {
            storyItem.translatedLng = inputSerializedData.readString(z4);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1);
        outputSerializedData.writeInt32(this.f15296b);
        int i10 = this.f15296b & 2;
        TL_stories.StoryItem storyItem = this.f15295a;
        if (i10 != 0) {
            outputSerializedData.writeString(storyItem.detectedLng);
        }
        if ((this.f15296b & 4) != 0) {
            storyItem.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.f15296b & 8) != 0) {
            outputSerializedData.writeString(storyItem.translatedLng);
        }
    }
}
