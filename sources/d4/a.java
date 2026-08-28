package d4;

import g7.b0;
import g7.y8;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n8.d;
import z3.e;
public final class a extends y8 {
    public static final Pattern f4310c = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder f4311a = d.f18513c.newDecoder();
    public final CharsetDecoder f4312b = d.f18512b.newDecoder();

    @Override
    public final z3.c b(e eVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f4312b;
        CharsetDecoder charsetDecoder2 = this.f4311a;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new z3.c(new c(null, null, bArr));
        }
        Matcher matcher = f4310c.matcher(str);
        String str3 = null;
        for (int i9 = 0; matcher.find(i9); i9 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String b10 = b0.b(group);
                b10.getClass();
                if (!b10.equals("streamurl")) {
                    if (b10.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new z3.c(new c(str2, str3, bArr));
    }
}
