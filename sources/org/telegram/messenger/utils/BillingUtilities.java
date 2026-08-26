package org.telegram.messenger.utils;

import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.internal.mlkit_language_id_common.zzij;
import com.google.common.base.Charsets;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public abstract class BillingUtilities {

    public final class TL_savedPurpose extends TLObject {
        public static final int $r8$clinit = 0;
        public int flags;
        public long id;
        public TLRPC.InputStorePaymentPurpose purpose;

        @Override
        public final void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.id = inputSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.purpose = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public final void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(495638674);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.id);
            if ((this.flags & 1) != 0) {
                this.purpose.serializeToStream(outputSerializedData);
            }
        }
    }

    public static void extractCurrencyExp(Map map) {
        if (map.isEmpty()) {
            try {
                InputStream inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open("currencies.json");
                int i = Util.SDK_INT;
                byte[] bArr = new byte[4096];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i2 = inputStreamOpen.read(bArr);
                    if (i2 == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                }
                JSONObject jSONObject = new JSONObject(new String(byteArrayOutputStream.toByteArray(), Charsets.UTF_8));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, Integer.valueOf(jSONObject.optJSONObject(next).optInt("exp")));
                }
                inputStreamOpen.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static TLRPC.InputStorePaymentPurpose getPurpose(String str) {
        TL_savedPurpose tL_savedPurpose;
        FileLog.d("BillingUtilities.getPurpose ".concat(str));
        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
        int int32 = serializedData.readInt32(true);
        if (int32 != 495638674) {
            int i = TL_savedPurpose.$r8$clinit;
            tL_savedPurpose = null;
        } else {
            tL_savedPurpose = new TL_savedPurpose();
        }
        TL_savedPurpose tL_savedPurpose2 = (TL_savedPurpose) TLObject.TLdeserialize(TL_savedPurpose.class, tL_savedPurpose, serializedData, int32, true);
        serializedData.cleanup();
        if (tL_savedPurpose2.purpose != null) {
            FileLog.d("BillingUtilities.getPurpose: got purpose from received obfuscated profile id");
            return tL_savedPurpose2.purpose;
        }
        SerializedData serializedData2 = new SerializedData(8);
        serializedData2.writeInt64(tL_savedPurpose2.id);
        String strBytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        FileLog.d("BillingUtilities.getPurpose: searching purpose under " + strBytesToHex);
        String string = ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).getString(strBytesToHex, null);
        if (string == null) {
            FileLog.d("BillingUtilities.getPurpose: purpose under " + strBytesToHex + " not found");
            throw new RuntimeException(zzij.m("no purpose under ", strBytesToHex, " found :("));
        }
        FileLog.d("BillingUtilities.getPurpose: got {" + string + "} under " + strBytesToHex);
        SerializedData serializedData3 = new SerializedData(Utilities.hexToBytes(string));
        int int33 = serializedData3.readInt32(true);
        TL_savedPurpose tL_savedPurpose3 = (TL_savedPurpose) TLObject.TLdeserialize(TL_savedPurpose.class, int33 == 495638674 ? new TL_savedPurpose() : null, serializedData3, int33, true);
        serializedData3.cleanup();
        return tL_savedPurpose3.purpose;
    }
}
