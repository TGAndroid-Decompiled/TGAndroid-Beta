package g7;

import android.os.IInterface;
public interface f extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z10, int i7);

    int getIntFlagValue(String str, int i7, int i10);

    long getLongFlagValue(String str, long j3, int i7);

    String getStringFlagValue(String str, String str2, int i7);

    void init(a7.a aVar);
}
