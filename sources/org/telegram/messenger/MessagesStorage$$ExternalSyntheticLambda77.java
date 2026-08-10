package org.telegram.messenger;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_ephemeral;

public final class MessagesStorage$$ExternalSyntheticLambda77 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i, z);
    }
}
