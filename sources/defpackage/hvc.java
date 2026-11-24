package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class hvc extends TLObject {
    public final ArrayList a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        int readInt32 = inputSerializedData.readInt32(z);
        for (int i = 0; i < readInt32; i++) {
            ivc ivcVar = new ivc();
            ivcVar.readParams(inputSerializedData, z);
            if (!TextUtils.isEmpty(ivcVar.b)) {
                this.a.add(ivcVar);
            } else {
                return;
            }
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            ((ivc) arrayList.get(i)).serializeToStream(outputSerializedData);
        }
    }
}
