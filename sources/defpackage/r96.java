package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.BufferedInputStream;
import java.io.IOException;
import org.telegram.tgnet.SerializedData;
public final class r96 {
    public static SparseIntArray b;
    public static final r96 c = new r96();
    public final SparseArray a;

    public r96(q96 q96Var) {
        SparseArray sparseArray = q96Var.a;
        this.a = sparseArray == null ? new SparseArray() : sparseArray;
    }

    public static SparseArray c(Context context, String str, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open(str));
        try {
            SerializedData serializedData = new SerializedData(bufferedInputStream);
            int readInt32 = serializedData.readInt32(true);
            int i = 0;
            if (sparseArray == null) {
                sparseArray = new SparseArray(readInt32);
                while (i < readInt32) {
                    sparseArray.append(serializedData.readInt32(true), serializedData.readString(true));
                    i++;
                }
            } else {
                while (i < readInt32) {
                    sparseArray.put(serializedData.readInt32(true), serializedData.readString(true));
                    i++;
                }
            }
            bufferedInputStream.close();
            return sparseArray;
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String a(String str) {
        if (str != null) {
            return (String) this.a.get(str.hashCode());
        }
        return null;
    }

    public final String b(int i, Context context, String str) {
        String str2;
        if (str != null) {
            str2 = a(str);
        } else {
            str2 = null;
        }
        if (str2 == null && i != 0) {
            if (context != null && i != 0) {
                SparseIntArray sparseIntArray = b;
                if (sparseIntArray == null) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().getAssets().open("string_resource_ids.bin"));
                        SerializedData serializedData = new SerializedData(bufferedInputStream);
                        int readInt32 = serializedData.readInt32(true);
                        SparseIntArray sparseIntArray2 = new SparseIntArray(readInt32);
                        for (int i2 = 0; i2 < readInt32; i2++) {
                            sparseIntArray2.append(serializedData.readInt32(true), serializedData.readInt32(true));
                        }
                        bufferedInputStream.close();
                        b = sparseIntArray2;
                        sparseIntArray = sparseIntArray2;
                    } catch (IOException e) {
                        sdb.b(e);
                        return null;
                    }
                }
                int i3 = sparseIntArray.get(i);
                if (i3 != 0) {
                    return (String) this.a.get(i3);
                }
            }
            return null;
        }
        return str2;
    }

    public r96() {
        this.a = new SparseArray();
    }
}
