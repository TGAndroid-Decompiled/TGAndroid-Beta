package ac;

import com.google.firebase.messaging.t;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Cells.pa;
import vb.c;

public final class a extends com.googlecode.mp4parser.a {

    public static final ae.b f215b;

    public static final ae.b f216c;
    public static final ae.b d;

    public static final ae.b f217e;

    public static final ae.b f218f;
    public static final ae.b h;

    public static final ae.b f219n;

    public static final ae.b f220r;

    public static final ae.b f221s;
    public static final ae.b v;

    public static final ae.b f222w;

    public static final ae.b f223x;

    public static final ae.b f224y;

    public b f225a;

    static {
        ae.a aVar = new ae.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f217e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f218f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f219n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f220r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f221s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        v = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f222w = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f223x = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        f224y = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f215b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f216c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i10;
        b bVar = new b();
        bVar.f230f = new ArrayList();
        bVar.f231g = new ArrayList();
        bVar.h = true;
        bVar.f232i = 1;
        bVar.f233j = 0;
        bVar.f234k = 0;
        bVar.f235l = new ArrayList();
        bVar.f236m = 63;
        bVar.f237n = 7;
        bVar.f238o = 31;
        bVar.f239p = 31;
        bVar.f240q = 31;
        bVar.f226a = p2.b.k(byteBuffer);
        bVar.f227b = p2.b.a(byteBuffer.get());
        bVar.f228c = p2.b.a(byteBuffer.get());
        bVar.d = p2.b.a(byteBuffer.get());
        c cVar = new c(0, byteBuffer);
        bVar.f236m = cVar.a(6);
        bVar.f229e = cVar.a(2);
        bVar.f237n = cVar.a(3);
        int iA = cVar.a(5);
        for (int i11 = 0; i11 < iA; i11++) {
            byte[] bArr = new byte[p2.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            bVar.f230f.add(bArr);
        }
        long jA = p2.b.a(byteBuffer.get());
        for (int i12 = 0; i12 < jA; i12++) {
            byte[] bArr2 = new byte[p2.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            bVar.f231g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            bVar.h = false;
        }
        if (bVar.h && ((i10 = bVar.f227b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            c cVar2 = new c(0, byteBuffer);
            bVar.f238o = cVar2.a(6);
            bVar.f232i = cVar2.a(2);
            bVar.f239p = cVar2.a(5);
            bVar.f233j = cVar2.a(3);
            bVar.f240q = cVar2.a(5);
            bVar.f234k = cVar2.a(3);
            long jA2 = p2.b.a(byteBuffer.get());
            for (int i13 = 0; i13 < jA2; i13++) {
                byte[] bArr3 = new byte[p2.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                bVar.f235l.add(bArr3);
            }
        } else {
            bVar.f232i = -1;
            bVar.f233j = -1;
            bVar.f234k = -1;
        }
        this.f225a = bVar;
    }

    public final void d(int i10) {
        pa.u(ae.a.c(f217e, this, this, new Integer(i10)));
        this.f225a.d = i10;
    }

    public final void e(int i10) {
        pa.u(ae.a.c(f216c, this, this, new Integer(i10)));
        this.f225a.f227b = i10;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        pa.u(ae.a.c(f223x, this, this, byteBuffer));
        b bVar = this.f225a;
        p2.b.r(bVar.f226a, byteBuffer);
        byteBuffer.put((byte) (bVar.f227b & 255));
        byteBuffer.put((byte) (bVar.f228c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        c cVar = new c(1, byteBuffer);
        cVar.c(bVar.f236m, 6);
        cVar.c(bVar.f229e, 2);
        cVar.c(bVar.f237n, 3);
        cVar.c(bVar.f231g.size(), 5);
        ArrayList arrayList = bVar.f230f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            byte[] bArr = (byte[]) obj;
            p2.b.p(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (bVar.f231g.size() & 255));
        ArrayList arrayList2 = bVar.f231g;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            byte[] bArr2 = (byte[]) obj2;
            p2.b.p(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (bVar.h) {
            int i13 = bVar.f227b;
            if (i13 == 100 || i13 == 110 || i13 == 122 || i13 == 144) {
                c cVar2 = new c(1, byteBuffer);
                cVar2.c(bVar.f238o, 6);
                cVar2.c(bVar.f232i, 2);
                cVar2.c(bVar.f239p, 5);
                cVar2.c(bVar.f233j, 3);
                cVar2.c(bVar.f240q, 5);
                cVar2.c(bVar.f234k, 3);
                ArrayList arrayList3 = bVar.f235l;
                int size3 = arrayList3.size();
                while (i10 < size3) {
                    Object obj3 = arrayList3.get(i10);
                    i10++;
                    byte[] bArr3 = (byte[]) obj3;
                    p2.b.p(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    @Override
    public final long getContentSize() {
        int i10;
        pa.u(ae.a.b(f222w, this, this));
        b bVar = this.f225a;
        ArrayList arrayList = bVar.f230f;
        int size = arrayList.size();
        long length = 6;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            length = length + 2 + ((long) ((byte[]) obj).length);
        }
        long length2 = length + 1;
        ArrayList arrayList2 = bVar.f231g;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            length2 = length2 + 2 + ((long) ((byte[]) obj2).length);
        }
        if (!bVar.h || ((i10 = bVar.f227b) != 100 && i10 != 110 && i10 != 122 && i10 != 144)) {
            return length2;
        }
        long length3 = length2 + 4;
        ArrayList arrayList3 = bVar.f235l;
        int size3 = arrayList3.size();
        while (i11 < size3) {
            Object obj3 = arrayList3.get(i11);
            i11++;
            length3 = length3 + 2 + ((long) ((byte[]) obj3).length);
        }
        return length3;
    }

    public final String toString() {
        t tVarB = ae.a.b(f224y, this, this);
        g.a().getClass();
        g.b(tVarB);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f225a + '}';
    }
}
