package d4;

import h7.d0;
import h7.p8;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o8.d;
import z3.e;

public final class a extends p8 {

    public static final Pattern f4752c = Pattern.compile("(.+?)='(.*?)';", 32);

    public final CharsetDecoder f4753a = d.f19363c.newDecoder();

    public final CharsetDecoder f4754b = d.f19362b.newDecoder();

    @Override
    public final z3.c b(e eVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f4754b;
        CharsetDecoder charsetDecoder2 = this.f4753a;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new z3.c(new c(null, null, bArr));
        }
        Matcher matcher = f4752c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strB = d0.b(strGroup);
                strB.getClass();
                if (strB.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strB.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new z3.c(new c(str, str2, bArr));
    }
}
