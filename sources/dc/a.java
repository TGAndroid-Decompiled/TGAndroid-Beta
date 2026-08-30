package dc;

import a3.c;
import com.google.firebase.messaging.r;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.yh;
public final class a extends com.googlecode.mp4parser.a {
    public static final c f4315b;
    public static final c f4316c;
    public static final c d;
    public static final c e;
    public static final c f4317f;
    public static final c h;
    public static final c f4318n;
    public static final c f4319r;
    public static final c f4320s;
    public static final c v;
    public static final c f4321w;
    public static final c f4322x;
    public static final c f4323y;
    public b f4324a;

    static {
        de.a aVar = new de.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f4317f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f4318n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f4319r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f4320s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        v = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f4321w = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f4322x = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        f4323y = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f4315b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f4316c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i10;
        ?? obj = new Object();
        obj.f4328f = new ArrayList();
        obj.f4329g = new ArrayList();
        obj.h = true;
        obj.f4330i = 1;
        obj.f4331j = 0;
        obj.f4332k = 0;
        obj.f4333l = new ArrayList();
        obj.f4334m = 63;
        obj.f4335n = 7;
        obj.f4336o = 31;
        obj.f4337p = 31;
        obj.f4338q = 31;
        obj.f4325a = r2.b.k(byteBuffer);
        obj.f4326b = r2.b.a(byteBuffer.get());
        obj.f4327c = r2.b.a(byteBuffer.get());
        obj.d = r2.b.a(byteBuffer.get());
        yb.c cVar = new yb.c(0, byteBuffer);
        obj.f4334m = cVar.a(6);
        obj.e = cVar.a(2);
        obj.f4335n = cVar.a(3);
        int a2 = cVar.a(5);
        for (int i11 = 0; i11 < a2; i11++) {
            byte[] bArr = new byte[r2.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f4328f.add(bArr);
        }
        long a10 = r2.b.a(byteBuffer.get());
        for (int i12 = 0; i12 < a10; i12++) {
            byte[] bArr2 = new byte[r2.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f4329g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i10 = obj.f4326b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            yb.c cVar2 = new yb.c(0, byteBuffer);
            obj.f4336o = cVar2.a(6);
            obj.f4330i = cVar2.a(2);
            obj.f4337p = cVar2.a(5);
            obj.f4331j = cVar2.a(3);
            obj.f4338q = cVar2.a(5);
            obj.f4332k = cVar2.a(3);
            long a11 = r2.b.a(byteBuffer.get());
            for (int i13 = 0; i13 < a11; i13++) {
                byte[] bArr3 = new byte[r2.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f4333l.add(bArr3);
            }
        } else {
            obj.f4330i = -1;
            obj.f4331j = -1;
            obj.f4332k = -1;
        }
        this.f4324a = obj;
    }

    public final void d(int i10) {
        yh.v(de.a.c(e, this, this, new Integer(i10)));
        this.f4324a.d = i10;
    }

    public final void e(int i10) {
        yh.v(de.a.c(f4316c, this, this, new Integer(i10)));
        this.f4324a.f4326b = i10;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        yh.v(de.a.c(f4322x, this, this, byteBuffer));
        b bVar = this.f4324a;
        r2.b.r(bVar.f4325a, byteBuffer);
        byteBuffer.put((byte) (bVar.f4326b & 255));
        byteBuffer.put((byte) (bVar.f4327c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        yb.c cVar = new yb.c(1, byteBuffer);
        cVar.c(bVar.f4334m, 6);
        cVar.c(bVar.e, 2);
        cVar.c(bVar.f4335n, 3);
        cVar.c(bVar.f4329g.size(), 5);
        ArrayList arrayList = bVar.f4328f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            byte[] bArr = (byte[]) obj;
            r2.b.p(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (bVar.f4329g.size() & 255));
        ArrayList arrayList2 = bVar.f4329g;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            byte[] bArr2 = (byte[]) obj2;
            r2.b.p(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (bVar.h) {
            int i13 = bVar.f4326b;
            if (i13 == 100 || i13 == 110 || i13 == 122 || i13 == 144) {
                yb.c cVar2 = new yb.c(1, byteBuffer);
                cVar2.c(bVar.f4336o, 6);
                cVar2.c(bVar.f4330i, 2);
                cVar2.c(bVar.f4337p, 5);
                cVar2.c(bVar.f4331j, 3);
                cVar2.c(bVar.f4338q, 5);
                cVar2.c(bVar.f4332k, 3);
                ArrayList arrayList3 = bVar.f4333l;
                int size3 = arrayList3.size();
                while (i10 < size3) {
                    Object obj3 = arrayList3.get(i10);
                    i10++;
                    byte[] bArr3 = (byte[]) obj3;
                    r2.b.p(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    @Override
    public final long getContentSize() {
        int i10;
        yh.v(de.a.b(f4321w, this, this));
        b bVar = this.f4324a;
        ArrayList arrayList = bVar.f4328f;
        int size = arrayList.size();
        long j10 = 6;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            j10 = j10 + 2 + ((byte[]) obj).length;
        }
        long j11 = j10 + 1;
        ArrayList arrayList2 = bVar.f4329g;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            j11 = j11 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i10 = bVar.f4326b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            long j12 = j11 + 4;
            ArrayList arrayList3 = bVar.f4333l;
            int size3 = arrayList3.size();
            while (i11 < size3) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                j12 = j12 + 2 + ((byte[]) obj3).length;
            }
            return j12;
        }
        return j11;
    }

    public final String toString() {
        r b10 = de.a.b(f4323y, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f4324a + '}';
    }
}
