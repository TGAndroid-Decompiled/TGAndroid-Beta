package nh;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class l1 extends TLRPC.TL_messageMediaStory {
    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        this.user_id = inputSerializedData.readInt64(z4);
        this.f19206id = inputSerializedData.readInt32(z4);
        this.storyItem = TL_stories.StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(-946147809);
        outputSerializedData.writeInt64(this.user_id);
        outputSerializedData.writeInt32(this.f19206id);
        this.storyItem.serializeToStream(outputSerializedData);
    }
}
