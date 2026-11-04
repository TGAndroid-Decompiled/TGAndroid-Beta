package f7;

import android.os.IInterface;
public interface f extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z10, int i3);

    int getIntFlagValue(String str, int i3, int i10);

    long getLongFlagValue(String str, long j10, int i3);

    String getStringFlagValue(String str, String str2, int i3);

    void init(z6.a aVar);
}
