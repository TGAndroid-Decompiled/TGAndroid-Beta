package dc;

import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.ai;
import rf.f;
import yb.c;
public final class a extends com.googlecode.mp4parser.a {
    public static final bb.b f4298b;
    public static final bb.b f4299c;
    public static final bb.b d;
    public static final bb.b e;
    public static final bb.b f4300f;
    public static final bb.b h;
    public static final bb.b f4301n;
    public static final bb.b f4302r;
    public static final bb.b f4303s;
    public static final bb.b v;
    public static final bb.b f4304w;
    public static final bb.b f4305x;
    public static final bb.b f4306y;
    public b f4307a;

    static {
        de.a aVar = new de.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f4300f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f4301n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f4302r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f4303s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        v = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f4304w = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f4305x = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        f4306y = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f4298b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f4299c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i10;
        ?? obj = new Object();
        obj.f4311f = new ArrayList();
        obj.f4312g = new ArrayList();
        obj.h = true;
        obj.f4313i = 1;
        obj.f4314j = 0;
        obj.f4315k = 0;
        obj.f4316l = new ArrayList();
        obj.f4317m = 63;
        obj.f4318n = 7;
        obj.f4319o = 31;
        obj.f4320p = 31;
        obj.f4321q = 31;
        obj.f4308a = r2.b.k(byteBuffer);
        obj.f4309b = r2.b.a(byteBuffer.get());
        obj.f4310c = r2.b.a(byteBuffer.get());
        obj.d = r2.b.a(byteBuffer.get());
        c cVar = new c(0, byteBuffer);
        obj.f4317m = cVar.a(6);
        obj.e = cVar.a(2);
        obj.f4318n = cVar.a(3);
        int a2 = cVar.a(5);
        for (int i11 = 0; i11 < a2; i11++) {
            byte[] bArr = new byte[r2.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f4311f.add(bArr);
        }
        long a10 = r2.b.a(byteBuffer.get());
        for (int i12 = 0; i12 < a10; i12++) {
            byte[] bArr2 = new byte[r2.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f4312g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i10 = obj.f4309b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            c cVar2 = new c(0, byteBuffer);
            obj.f4319o = cVar2.a(6);
            obj.f4313i = cVar2.a(2);
            obj.f4320p = cVar2.a(5);
            obj.f4314j = cVar2.a(3);
            obj.f4321q = cVar2.a(5);
            obj.f4315k = cVar2.a(3);
            long a11 = r2.b.a(byteBuffer.get());
            for (int i13 = 0; i13 < a11; i13++) {
                byte[] bArr3 = new byte[r2.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f4316l.add(bArr3);
            }
        } else {
            obj.f4313i = -1;
            obj.f4314j = -1;
            obj.f4315k = -1;
        }
        this.f4307a = obj;
    }

    public final void d(int i10) {
        ai.x(de.a.c(e, this, this, new Integer(i10)));
        this.f4307a.d = i10;
    }

    public final void e(int i10) {
        ai.x(de.a.c(f4299c, this, this, new Integer(i10)));
        this.f4307a.f4309b = i10;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        ai.x(de.a.c(f4305x, this, this, byteBuffer));
        b bVar = this.f4307a;
        r2.b.r(bVar.f4308a, byteBuffer);
        byteBuffer.put((byte) (bVar.f4309b & 255));
        byteBuffer.put((byte) (bVar.f4310c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        c cVar = new c(1, byteBuffer);
        cVar.c(bVar.f4317m, 6);
        cVar.c(bVar.e, 2);
        cVar.c(bVar.f4318n, 3);
        cVar.c(bVar.f4312g.size(), 5);
        ArrayList arrayList = bVar.f4311f;
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
        byteBuffer.put((byte) (bVar.f4312g.size() & 255));
        ArrayList arrayList2 = bVar.f4312g;
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
            int i13 = bVar.f4309b;
            if (i13 == 100 || i13 == 110 || i13 == 122 || i13 == 144) {
                c cVar2 = new c(1, byteBuffer);
                cVar2.c(bVar.f4319o, 6);
                cVar2.c(bVar.f4313i, 2);
                cVar2.c(bVar.f4320p, 5);
                cVar2.c(bVar.f4314j, 3);
                cVar2.c(bVar.f4321q, 5);
                cVar2.c(bVar.f4315k, 3);
                ArrayList arrayList3 = bVar.f4316l;
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
        ai.x(de.a.b(f4304w, this, this));
        b bVar = this.f4307a;
        ArrayList arrayList = bVar.f4311f;
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
        ArrayList arrayList2 = bVar.f4312g;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            j11 = j11 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i10 = bVar.f4309b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            long j12 = j11 + 4;
            ArrayList arrayList3 = bVar.f4316l;
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
        f b10 = de.a.b(f4306y, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f4307a + '}';
    }
}
