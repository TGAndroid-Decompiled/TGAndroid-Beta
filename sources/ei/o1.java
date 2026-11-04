package ei;

import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class o1 extends TLRPC.TL_messageMediaStory {
    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.user_id = inputSerializedData.readInt64(z10);
        this.f27023id = inputSerializedData.readInt32(z10);
        this.storyItem = TL_stories.StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        this.via_mention = inputSerializedData.readBool(z10);
        this.peer = hp.s1(h10.f22829t0).z1(this.user_id);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(-946147811);
        outputSerializedData.writeInt64(this.user_id);
        outputSerializedData.writeInt32(this.f27023id);
        this.storyItem.serializeToStream(outputSerializedData);
        outputSerializedData.writeBool(this.via_mention);
    }
}
