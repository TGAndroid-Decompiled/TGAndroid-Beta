package b7;

import java.io.IOException;
public final class y0 extends IOException {
    public y0(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: b7.y0.<init>(int, int):void");
    }

    public y0(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public y0(long r3, long r5, int r7, java.lang.IndexOutOfBoundsException r8) {
        throw new UnsupportedOperationException("Method not decompiled: b7.y0.<init>(long, long, int, java.lang.IndexOutOfBoundsException):void");
    }

    public y0(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
