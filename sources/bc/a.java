package bc;

import com.google.firebase.messaging.s;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import m5.i;
import org.telegram.ui.th;
import wb.c;
public final class a extends com.googlecode.mp4parser.a {
    public static final i f2044b;
    public static final i f2045c;
    public static final i d;
    public static final i f2046e;
    public static final i f2047f;
    public static final i h;
    public static final i f2048n;
    public static final i f2049r;
    public static final i f2050s;
    public static final i v;
    public static final i f2051w;
    public static final i f2052x;
    public static final i f2053y;
    public b f2054a;

    static {
        be.a aVar = new be.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f2046e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f2047f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f2048n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f2049r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f2050s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        v = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f2051w = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f2052x = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        f2053y = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f2044b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f2045c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i10;
        ?? obj = new Object();
        obj.f2059f = new ArrayList();
        obj.f2060g = new ArrayList();
        obj.h = true;
        obj.f2061i = 1;
        obj.f2062j = 0;
        obj.f2063k = 0;
        obj.f2064l = new ArrayList();
        obj.f2065m = 63;
        obj.f2066n = 7;
        obj.f2067o = 31;
        obj.f2068p = 31;
        obj.f2069q = 31;
        obj.f2055a = r2.b.k(byteBuffer);
        obj.f2056b = r2.b.a(byteBuffer.get());
        obj.f2057c = r2.b.a(byteBuffer.get());
        obj.d = r2.b.a(byteBuffer.get());
        c cVar = new c(0, byteBuffer);
        obj.f2065m = cVar.a(6);
        obj.f2058e = cVar.a(2);
        obj.f2066n = cVar.a(3);
        int a2 = cVar.a(5);
        for (int i11 = 0; i11 < a2; i11++) {
            byte[] bArr = new byte[r2.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f2059f.add(bArr);
        }
        long a10 = r2.b.a(byteBuffer.get());
        for (int i12 = 0; i12 < a10; i12++) {
            byte[] bArr2 = new byte[r2.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f2060g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i10 = obj.f2056b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            c cVar2 = new c(0, byteBuffer);
            obj.f2067o = cVar2.a(6);
            obj.f2061i = cVar2.a(2);
            obj.f2068p = cVar2.a(5);
            obj.f2062j = cVar2.a(3);
            obj.f2069q = cVar2.a(5);
            obj.f2063k = cVar2.a(3);
            long a11 = r2.b.a(byteBuffer.get());
            for (int i13 = 0; i13 < a11; i13++) {
                byte[] bArr3 = new byte[r2.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f2064l.add(bArr3);
            }
        } else {
            obj.f2061i = -1;
            obj.f2062j = -1;
            obj.f2063k = -1;
        }
        this.f2054a = obj;
    }

    public final void d(int i10) {
        th.u(be.a.c(f2046e, this, this, new Integer(i10)));
        this.f2054a.d = i10;
    }

    public final void e(int i10) {
        th.u(be.a.c(f2045c, this, this, new Integer(i10)));
        this.f2054a.f2056b = i10;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        th.u(be.a.c(f2052x, this, this, byteBuffer));
        b bVar = this.f2054a;
        r2.b.r(bVar.f2055a, byteBuffer);
        byteBuffer.put((byte) (bVar.f2056b & 255));
        byteBuffer.put((byte) (bVar.f2057c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        c cVar = new c(1, byteBuffer);
        cVar.c(bVar.f2065m, 6);
        cVar.c(bVar.f2058e, 2);
        cVar.c(bVar.f2066n, 3);
        cVar.c(bVar.f2060g.size(), 5);
        ArrayList arrayList = bVar.f2059f;
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
        byteBuffer.put((byte) (bVar.f2060g.size() & 255));
        ArrayList arrayList2 = bVar.f2060g;
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
            int i13 = bVar.f2056b;
            if (i13 == 100 || i13 == 110 || i13 == 122 || i13 == 144) {
                c cVar2 = new c(1, byteBuffer);
                cVar2.c(bVar.f2067o, 6);
                cVar2.c(bVar.f2061i, 2);
                cVar2.c(bVar.f2068p, 5);
                cVar2.c(bVar.f2062j, 3);
                cVar2.c(bVar.f2069q, 5);
                cVar2.c(bVar.f2063k, 3);
                ArrayList arrayList3 = bVar.f2064l;
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
        th.u(be.a.b(f2051w, this, this));
        b bVar = this.f2054a;
        ArrayList arrayList = bVar.f2059f;
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
        ArrayList arrayList2 = bVar.f2060g;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            j11 = j11 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i10 = bVar.f2056b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            long j12 = j11 + 4;
            ArrayList arrayList3 = bVar.f2064l;
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
        s b10 = be.a.b(f2053y, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f2054a + '}';
    }
}
