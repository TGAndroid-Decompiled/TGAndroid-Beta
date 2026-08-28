package ih;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class i8 extends TLObject {
    public final TL_stories.StoryItem f11621a;
    public int f11622b;

    public i8(TL_stories.StoryItem storyItem) {
        int i9;
        int i10;
        this.f11622b = 0;
        this.f11621a = storyItem;
        boolean z10 = storyItem.translated;
        this.f11622b = z10 ? 1 : 0;
        if (storyItem.detectedLng != null) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        int i11 = (z10 ? 1 : 0) + i9;
        this.f11622b = i11;
        if (storyItem.translatedText != null) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        int i12 = i11 + i10;
        this.f11622b = i12;
        this.f11622b = i12 + (storyItem.translatedLng != null ? 8 : 0);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11 = true;
        int readInt32 = inputSerializedData.readInt32(true);
        this.f11622b = readInt32;
        if ((readInt32 & 1) == 0) {
            z11 = false;
        }
        TL_stories.StoryItem storyItem = this.f11621a;
        storyItem.translated = z11;
        if ((readInt32 & 2) != 0) {
            storyItem.detectedLng = inputSerializedData.readString(z10);
        }
        if ((this.f11622b & 4) != 0) {
            storyItem.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f11622b & 8) != 0) {
            storyItem.translatedLng = inputSerializedData.readString(z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1);
        outputSerializedData.writeInt32(this.f11622b);
        int i9 = this.f11622b & 2;
        TL_stories.StoryItem storyItem = this.f11621a;
        if (i9 != 0) {
            outputSerializedData.writeString(storyItem.detectedLng);
        }
        if ((this.f11622b & 4) != 0) {
            storyItem.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.f11622b & 8) != 0) {
            outputSerializedData.writeString(storyItem.translatedLng);
        }
    }
}
