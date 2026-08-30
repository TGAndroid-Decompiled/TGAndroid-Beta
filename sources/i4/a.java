package i4;

import e4.e;
import j7.c7;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.z6;
import r8.d;
public final class a extends c7 {
    public static final Pattern f7240c = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder f7241a = d.f43389c.newDecoder();
    public final CharsetDecoder f7242b = d.f43388b.newDecoder();

    @Override
    public final e4.c b(e eVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f7242b;
        CharsetDecoder charsetDecoder2 = this.f7241a;
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
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new e4.c(new c(null, null, bArr));
        }
        Matcher matcher = f7240c.matcher(str);
        String str3 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String b10 = z6.b(group);
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
        return new e4.c(new c(str2, str3, bArr));
    }
}
