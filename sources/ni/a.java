package ni;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.BufferedInputStream;
import java.io.IOException;
import l.d;
import org.telegram.tgnet.SerializedData;
public final class a {
    public static SparseIntArray f15471b;
    public static final a f15472c = new a();
    public final SparseArray f15473a;

    public a() {
        this.f15473a = new SparseArray();
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

    public final String b(String str) {
        if (str != null) {
            return (String) this.f15473a.get(str.hashCode());
        }
        return null;
    }

    public final String c(Context context, String str, int i10) {
        String str2;
        if (str != null) {
            str2 = b(str);
        } else {
            str2 = null;
        }
        if (str2 == null && i10 != 0) {
            if (context != null && i10 != 0) {
                if (f15471b == null) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().getAssets().open("string_resource_ids.bin"));
                        SerializedData serializedData = new SerializedData(bufferedInputStream);
                        int readInt32 = serializedData.readInt32(true);
                        SparseIntArray sparseIntArray = new SparseIntArray(readInt32);
                        for (int i11 = 0; i11 < readInt32; i11++) {
                            sparseIntArray.append(serializedData.readInt32(true), serializedData.readInt32(true));
                        }
                        bufferedInputStream.close();
                        f15471b = sparseIntArray;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                int i12 = f15471b.get(i10);
                if (i12 != 0) {
                    return (String) this.f15473a.get(i12);
                }
            }
            return null;
        }
        return str2;
    }

    public a(d dVar) {
        SparseArray sparseArray = (SparseArray) dVar.f13912b;
        this.f15473a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
