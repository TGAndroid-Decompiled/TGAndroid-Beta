package org.telegram.messenger;
public final class m6 {
    public final String f24168a;
    public final String f24169b;

    public m6(String str, String str2, boolean z10) {
        this.f24168a = str;
        this.f24169b = str2;
    }

    public m6(String str, String str2) {
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.f24168a = str;
            this.f24169b = (str2 == null || str2.length() <= 0) ? null : str2;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }
}
