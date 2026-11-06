package di;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class k1 extends TLRPC.TL_messageMediaStory {
    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.user_id = inputSerializedData.readInt64(z9);
        this.f26974id = inputSerializedData.readInt32(z9);
        this.storyItem = TL_stories.StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(-946147809);
        outputSerializedData.writeInt64(this.user_id);
        outputSerializedData.writeInt32(this.f26974id);
        this.storyItem.serializeToStream(outputSerializedData);
    }
}
