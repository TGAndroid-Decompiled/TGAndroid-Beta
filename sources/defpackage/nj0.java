package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
public final class nj0 extends TLObject {
    public static final int b = 0;
    public ArrayList a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        int readInt32 = inputSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = inputSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.a.add(TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z));
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(290452237);
        outputSerializedData.writeInt32(481674261);
        int size = this.a.size();
        outputSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            ((TL_account.TL_contactBirthday) this.a.get(i)).serializeToStream(outputSerializedData);
        }
    }
}
