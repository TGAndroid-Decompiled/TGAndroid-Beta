package defpackage;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class v7b extends TLObject {
    public final TL_stories.StoryItem a;
    public int b;

    public v7b(TL_stories.StoryItem storyItem) {
        int i;
        int i2;
        this.b = 0;
        this.a = storyItem;
        boolean z = storyItem.translated;
        this.b = z ? 1 : 0;
        if (storyItem.detectedLng != null) {
            i = 2;
        } else {
            i = 0;
        }
        int i3 = (z ? 1 : 0) + i;
        this.b = i3;
        if (storyItem.translatedText != null) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i3 + i2;
        this.b = i4;
        this.b = i4 + (storyItem.translatedLng != null ? 8 : 0);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        boolean z2 = true;
        int readInt32 = inputSerializedData.readInt32(true);
        this.b = readInt32;
        if ((readInt32 & 1) == 0) {
            z2 = false;
        }
        TL_stories.StoryItem storyItem = this.a;
        storyItem.translated = z2;
        if ((readInt32 & 2) != 0) {
            storyItem.detectedLng = inputSerializedData.readString(z);
        }
        if ((this.b & 4) != 0) {
            storyItem.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        if ((this.b & 8) != 0) {
            storyItem.translatedLng = inputSerializedData.readString(z);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1);
        outputSerializedData.writeInt32(this.b);
        int i = this.b & 2;
        TL_stories.StoryItem storyItem = this.a;
        if (i != 0) {
            outputSerializedData.writeString(storyItem.detectedLng);
        }
        if ((this.b & 4) != 0) {
            storyItem.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.b & 8) != 0) {
            outputSerializedData.writeString(storyItem.translatedLng);
        }
    }
}
