package ji;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.BufferedInputStream;
import java.io.IOException;
import org.telegram.tgnet.SerializedData;
public final class b {
    public static SparseIntArray f11946b;
    public static final b f11947c = new b();
    public final SparseArray f11948a;

    public b() {
        this.f11948a = new SparseArray();
    }

    public static SparseArray a(Context context, String str, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open(str));
        try {
            SerializedData serializedData = new SerializedData(bufferedInputStream);
            int readInt32 = serializedData.readInt32(true);
            int i10 = 0;
            if (sparseArray == null) {
                sparseArray = new SparseArray(readInt32);
                while (i10 < readInt32) {
                    sparseArray.append(serializedData.readInt32(true), serializedData.readString(true));
                    i10++;
                }
            } else {
                while (i10 < readInt32) {
                    sparseArray.put(serializedData.readInt32(true), serializedData.readString(true));
                    i10++;
                }
            }
            bufferedInputStream.close();
            return sparseArray;
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final String b(Context context, int i10) {
        if (context != null && i10 != 0) {
            if (f11946b == null) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().getAssets().open("string_resource_ids.bin"));
                    SerializedData serializedData = new SerializedData(bufferedInputStream);
                    int readInt32 = serializedData.readInt32(true);
                    SparseIntArray sparseIntArray = new SparseIntArray(readInt32);
                    for (int i11 = 0; i11 < readInt32; i11++) {
                        sparseIntArray.append(serializedData.readInt32(true), serializedData.readInt32(true));
                    }
                    bufferedInputStream.close();
                    f11946b = sparseIntArray;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            int i12 = f11946b.get(i10);
            if (i12 != 0) {
                return (String) this.f11948a.get(i12);
            }
            return null;
        }
        return null;
    }

    public final String c(Context context, String str, int i10) {
        String str2;
        if (str != null) {
            str2 = (String) this.f11948a.get(str.hashCode());
        } else {
            str2 = null;
        }
        if (str2 == null && i10 != 0) {
            return b(context, i10);
        }
        return str2;
    }

    public b(a aVar) {
        SparseArray sparseArray = aVar.f11945a;
        this.f11948a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
