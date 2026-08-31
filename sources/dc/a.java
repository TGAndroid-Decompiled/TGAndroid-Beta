package dc;

import androidx.biometric.f0;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.yh;
import sf.e;
import yb.c;
public final class a extends com.googlecode.mp4parser.a {
    public static final f0 f4397b;
    public static final f0 f4398c;
    public static final f0 d;
    public static final f0 f4399e;
    public static final f0 f4400f;
    public static final f0 h;
    public static final f0 f4401n;
    public static final f0 f4402r;
    public static final f0 f4403s;
    public static final f0 v;
    public static final f0 f4404w;
    public static final f0 f4405x;
    public static final f0 f4406y;
    public b f4407a;

    static {
        de.a aVar = new de.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f4399e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f4400f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f4401n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f4402r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f4403s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        v = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f4404w = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f4405x = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        f4406y = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f4397b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f4398c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i10;
        ?? obj = new Object();
        obj.f4412f = new ArrayList();
        obj.f4413g = new ArrayList();
        obj.h = true;
        obj.f4414i = 1;
        obj.f4415j = 0;
        obj.f4416k = 0;
        obj.f4417l = new ArrayList();
        obj.f4418m = 63;
        obj.f4419n = 7;
        obj.f4420o = 31;
        obj.f4421p = 31;
        obj.f4422q = 31;
        obj.f4408a = r2.b.k(byteBuffer);
        obj.f4409b = r2.b.a(byteBuffer.get());
        obj.f4410c = r2.b.a(byteBuffer.get());
        obj.d = r2.b.a(byteBuffer.get());
        c cVar = new c(0, byteBuffer);
        obj.f4418m = cVar.a(6);
        obj.f4411e = cVar.a(2);
        obj.f4419n = cVar.a(3);
        int a2 = cVar.a(5);
        for (int i11 = 0; i11 < a2; i11++) {
            byte[] bArr = new byte[r2.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f4412f.add(bArr);
        }
        long a10 = r2.b.a(byteBuffer.get());
        for (int i12 = 0; i12 < a10; i12++) {
            byte[] bArr2 = new byte[r2.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f4413g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i10 = obj.f4409b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            c cVar2 = new c(0, byteBuffer);
            obj.f4420o = cVar2.a(6);
            obj.f4414i = cVar2.a(2);
            obj.f4421p = cVar2.a(5);
            obj.f4415j = cVar2.a(3);
            obj.f4422q = cVar2.a(5);
            obj.f4416k = cVar2.a(3);
            long a11 = r2.b.a(byteBuffer.get());
            for (int i13 = 0; i13 < a11; i13++) {
                byte[] bArr3 = new byte[r2.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f4417l.add(bArr3);
            }
        } else {
            obj.f4414i = -1;
            obj.f4415j = -1;
            obj.f4416k = -1;
        }
        this.f4407a = obj;
    }

    public final void d(int i10) {
        yh.x(de.a.c(f4399e, this, this, new Integer(i10)));
        this.f4407a.d = i10;
    }

    public final void e(int i10) {
        yh.x(de.a.c(f4398c, this, this, new Integer(i10)));
        this.f4407a.f4409b = i10;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        yh.x(de.a.c(f4405x, this, this, byteBuffer));
        b bVar = this.f4407a;
        r2.b.r(bVar.f4408a, byteBuffer);
        byteBuffer.put((byte) (bVar.f4409b & 255));
        byteBuffer.put((byte) (bVar.f4410c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        c cVar = new c(1, byteBuffer);
        cVar.c(bVar.f4418m, 6);
        cVar.c(bVar.f4411e, 2);
        cVar.c(bVar.f4419n, 3);
        cVar.c(bVar.f4413g.size(), 5);
        ArrayList arrayList = bVar.f4412f;
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
        byteBuffer.put((byte) (bVar.f4413g.size() & 255));
        ArrayList arrayList2 = bVar.f4413g;
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
            int i13 = bVar.f4409b;
            if (i13 == 100 || i13 == 110 || i13 == 122 || i13 == 144) {
                c cVar2 = new c(1, byteBuffer);
                cVar2.c(bVar.f4420o, 6);
                cVar2.c(bVar.f4414i, 2);
                cVar2.c(bVar.f4421p, 5);
                cVar2.c(bVar.f4415j, 3);
                cVar2.c(bVar.f4422q, 5);
                cVar2.c(bVar.f4416k, 3);
                ArrayList arrayList3 = bVar.f4417l;
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
        yh.x(de.a.b(f4404w, this, this));
        b bVar = this.f4407a;
        ArrayList arrayList = bVar.f4412f;
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
        ArrayList arrayList2 = bVar.f4413g;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            j11 = j11 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i10 = bVar.f4409b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            long j12 = j11 + 4;
            ArrayList arrayList3 = bVar.f4417l;
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
        e b10 = de.a.b(f4406y, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f4407a + '}';
    }
}
