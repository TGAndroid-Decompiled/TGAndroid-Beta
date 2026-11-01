package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
public final class x1 extends TLObject {
    public static final int f19372b = 0;
    public ArrayList f19373a = new ArrayList();

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
        for (int i10 = 0; i10 < readInt322; i10++) {
            this.f19373a.add(TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10));
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(290452237);
        outputSerializedData.writeInt32(481674261);
        int size = this.f19373a.size();
        outputSerializedData.writeInt32(size);
        for (int i10 = 0; i10 < size; i10++) {
            ((TL_account.TL_contactBirthday) this.f19373a.get(i10)).serializeToStream(outputSerializedData);
        }
    }
}
