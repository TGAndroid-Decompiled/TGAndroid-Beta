package org.telegram.messenger.camera;

public final class Size {
    public final int mHeight;
    public final int mWidth;

    public Size(int i10, int i11) {
        this.mWidth = i10;
        this.mHeight = i11;
    }

    private static NumberFormatException invalidSize(String str) {
        throw new NumberFormatException(a9.p.m("Invalid Size: \"", str, "\""));
    }

    public static Size parseSize(String str) {
        int iIndexOf = str.indexOf(42);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(120);
        }
        if (iIndexOf < 0) {
            throw invalidSize(str);
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (NumberFormatException unused) {
            throw invalidSize(str);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.mWidth == size.mWidth && this.mHeight == size.mHeight) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int hashCode() {
        int i10 = this.mHeight;
        int i11 = this.mWidth;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.mWidth + "x" + this.mHeight;
    }
}
