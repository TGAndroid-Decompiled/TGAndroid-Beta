package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
public final class u1 extends TLObject {
    public static final int f27140b = 0;
    public ArrayList f27141a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        if (readInt32 != 481674261) {
            if (z10) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = inputSerializedData.readInt32(z10);
        for (int i7 = 0; i7 < readInt322; i7++) {
            this.f27141a.add(TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10));
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(290452237);
        outputSerializedData.writeInt32(481674261);
        int size = this.f27141a.size();
        outputSerializedData.writeInt32(size);
        for (int i7 = 0; i7 < size; i7++) {
            ((TL_account.TL_contactBirthday) this.f27141a.get(i7)).serializeToStream(outputSerializedData);
        }
    }
}
