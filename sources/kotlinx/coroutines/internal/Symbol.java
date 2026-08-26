package kotlinx.coroutines.internal;

import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.gson.JsonIOException;
import com.google.gson.internal.ObjectConstructor;

public final class Symbol implements ObjectConstructor {
    public final int $r8$classId;
    public String symbol;

    public Symbol() {
        this.$r8$classId = 1;
    }

    public static Symbol parse(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.setPosition(parsableByteArray.position + 2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i = unsignedByte >> 1;
        int unsignedByte2 = ((parsableByteArray.readUnsignedByte() >> 3) & 31) | ((unsignedByte & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(unsignedByte2 >= 10 ? "." : ".0");
        sb.append(unsignedByte2);
        return new Symbol(sb.toString(), 2);
    }

    @Override
    public Object construct() {
        throw new JsonIOException(this.symbol);
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "<" + this.symbol + '>';
            default:
                return super.toString();
        }
    }

    public Symbol(String str, int i) {
        this.$r8$classId = i;
        this.symbol = str;
    }
}
