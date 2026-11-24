package defpackage;

import android.os.Build;
import android.text.TextUtils;
import j$.util.stream.IntStream;
import java.util.Arrays;
public final class go implements CharSequence {
    public final CharSequence[] a;
    public final int b;

    public go(CharSequence charSequence) {
        int i;
        if (charSequence == null) {
            this.a = new CharSequence[0];
            this.b = 0;
            return;
        }
        this.b = charSequence.length();
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (charSequence.charAt(i3) == ' ') {
                i2++;
            }
        }
        this.a = new CharSequence[i2 + 1];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = this.b;
            if (i4 <= i7) {
                if (i4 == i7 || charSequence.charAt(i4) == ' ') {
                    CharSequence[] charSequenceArr = this.a;
                    int i8 = i5 + 1;
                    if (i4 < this.b) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    charSequenceArr[i5] = charSequence.subSequence(i6, i + i4);
                    i6 = i4 + 1;
                    i5 = i8;
                }
                i4++;
            } else {
                return;
            }
        }
    }

    @Override
    public final char charAt(int i) {
        int i2 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.a;
            if (i2 >= charSequenceArr.length) {
                return (char) 0;
            }
            if (i < charSequenceArr[i2].length()) {
                return charSequenceArr[i2].charAt(i);
            }
            i -= charSequenceArr[i2].length();
            i2++;
        }
    }

    @Override
    public final IntStream chars() {
        IntStream convert;
        if (Build.VERSION.SDK_INT >= 24) {
            convert = IntStream.VivifiedWrapper.convert(TextUtils.concat(this.a).chars());
            return convert;
        }
        return null;
    }

    @Override
    public final IntStream codePoints() {
        IntStream convert;
        if (Build.VERSION.SDK_INT >= 24) {
            convert = IntStream.VivifiedWrapper.convert(TextUtils.concat(this.a).codePoints());
            return convert;
        }
        return null;
    }

    @Override
    public final int length() {
        return this.a.length;
    }

    @Override
    public final CharSequence subSequence(int i, int i2) {
        return TextUtils.concat((CharSequence[]) Arrays.copyOfRange(this.a, i, i2));
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.a;
            if (i < charSequenceArr.length) {
                sb.append(charSequenceArr[i]);
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override
    public final java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override
    public final java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }
}
