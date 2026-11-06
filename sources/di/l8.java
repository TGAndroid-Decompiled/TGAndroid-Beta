package di;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class l8 extends TLObject {
    public final TL_stories.StoryItem f9339a;
    public int f9340b;

    public l8(TL_stories.StoryItem storyItem) {
        int i7;
        int i10;
        this.f9340b = 0;
        this.f9339a = storyItem;
        boolean z9 = storyItem.translated;
        this.f9340b = z9 ? 1 : 0;
        if (storyItem.detectedLng != null) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        int i11 = (z9 ? 1 : 0) + i7;
        this.f9340b = i11;
        if (storyItem.translatedText != null) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        int i12 = i11 + i10;
        this.f9340b = i12;
        this.f9340b = i12 + (storyItem.translatedLng != null ? 8 : 0);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        boolean z10 = true;
        int readInt32 = inputSerializedData.readInt32(true);
        this.f9340b = readInt32;
        if ((readInt32 & 1) == 0) {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = this.f9339a;
        storyItem.translated = z10;
        if ((readInt32 & 2) != 0) {
            storyItem.detectedLng = inputSerializedData.readString(z9);
        }
        if ((this.f9340b & 4) != 0) {
            storyItem.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        if ((this.f9340b & 8) != 0) {
            storyItem.translatedLng = inputSerializedData.readString(z9);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1);
        outputSerializedData.writeInt32(this.f9340b);
        int i7 = this.f9340b & 2;
        TL_stories.StoryItem storyItem = this.f9339a;
        if (i7 != 0) {
            outputSerializedData.writeString(storyItem.detectedLng);
        }
        if ((this.f9340b & 4) != 0) {
            storyItem.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.f9340b & 8) != 0) {
            outputSerializedData.writeString(storyItem.translatedLng);
        }
    }
}
