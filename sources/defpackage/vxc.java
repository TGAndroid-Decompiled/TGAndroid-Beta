package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class vxc extends TLObject {
    public final ArrayList a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        int readInt32 = inputSerializedData.readInt32(z);
        for (int i = 0; i < readInt32; i++) {
            wxc wxcVar = new wxc();
            wxcVar.readParams(inputSerializedData, z);
            if (!TextUtils.isEmpty(wxcVar.b)) {
                this.a.add(wxcVar);
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
            ((wxc) arrayList.get(i)).serializeToStream(outputSerializedData);
        }
    }
}
