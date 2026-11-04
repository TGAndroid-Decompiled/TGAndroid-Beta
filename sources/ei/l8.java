package ei;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class l8 extends TLObject {
    public final TL_stories.StoryItem f10624a;
    public int f10625b;

    public l8(TL_stories.StoryItem storyItem) {
        int i3;
        int i10;
        this.f10625b = 0;
        this.f10624a = storyItem;
        boolean z10 = storyItem.translated;
        this.f10625b = z10 ? 1 : 0;
        if (storyItem.detectedLng != null) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        int i11 = (z10 ? 1 : 0) + i3;
        this.f10625b = i11;
        if (storyItem.translatedText != null) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        int i12 = i11 + i10;
        this.f10625b = i12;
        this.f10625b = i12 + (storyItem.translatedLng != null ? 8 : 0);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11 = true;
        int readInt32 = inputSerializedData.readInt32(true);
        this.f10625b = readInt32;
        if ((readInt32 & 1) == 0) {
            z11 = false;
        }
        TL_stories.StoryItem storyItem = this.f10624a;
        storyItem.translated = z11;
        if ((readInt32 & 2) != 0) {
            storyItem.detectedLng = inputSerializedData.readString(z10);
        }
        if ((this.f10625b & 4) != 0) {
            storyItem.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f10625b & 8) != 0) {
            storyItem.translatedLng = inputSerializedData.readString(z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1);
        outputSerializedData.writeInt32(this.f10625b);
        int i3 = this.f10625b & 2;
        TL_stories.StoryItem storyItem = this.f10624a;
        if (i3 != 0) {
            outputSerializedData.writeString(storyItem.detectedLng);
        }
        if ((this.f10625b & 4) != 0) {
            storyItem.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.f10625b & 8) != 0) {
            outputSerializedData.writeString(storyItem.translatedLng);
        }
    }
}
