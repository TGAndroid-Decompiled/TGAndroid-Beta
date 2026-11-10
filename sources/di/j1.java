package di;

import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class j1 extends TLRPC.TL_messageMediaStory {
    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.user_id = inputSerializedData.readInt64(z9);
        this.f26982id = inputSerializedData.readInt32(z9);
        this.storyItem = TL_stories.StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        this.via_mention = inputSerializedData.readBool(z9);
        this.peer = qp.s1(p10.f24474s0).z1(this.user_id);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(-946147811);
        outputSerializedData.writeInt64(this.user_id);
        outputSerializedData.writeInt32(this.f26982id);
        this.storyItem.serializeToStream(outputSerializedData);
        outputSerializedData.writeBool(this.via_mention);
    }
}
