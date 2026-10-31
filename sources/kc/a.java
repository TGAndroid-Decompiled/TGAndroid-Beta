package kc;

import c3.i0;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import ji.f;
import za.c;
public final class a extends com.googlecode.mp4parser.a {
    public static final c D;
    public static final c f10963b;
    public static final c f10964c;
    public static final c d;
    public static final c e;
    public static final c f10965f;
    public static final c h;
    public static final c f10966n;
    public static final c f10967r;
    public static final c f10968s;
    public static final c f10969w;
    public static final c f10970x;
    public static final c f10971y;
    public b f10972a;

    static {
        le.a aVar = new le.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f10965f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f10966n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f10967r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f10968s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f10969w = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f10970x = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f10971y = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        D = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f10963b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f10964c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i10;
        ?? obj = new Object();
        obj.f10976f = new ArrayList();
        obj.f10977g = new ArrayList();
        obj.h = true;
        obj.f10978i = 1;
        obj.f10979j = 0;
        obj.f10980k = 0;
        obj.f10981l = new ArrayList();
        obj.f10982m = 63;
        obj.f10983n = 7;
        obj.f10984o = 31;
        obj.f10985p = 31;
        obj.f10986q = 31;
        obj.f10973a = e5.b.k(byteBuffer);
        obj.f10974b = e5.b.a(byteBuffer.get());
        obj.f10975c = e5.b.a(byteBuffer.get());
        obj.d = e5.b.a(byteBuffer.get());
        fc.c cVar = new fc.c(0, byteBuffer);
        obj.f10982m = cVar.a(6);
        obj.e = cVar.a(2);
        obj.f10983n = cVar.a(3);
        int a2 = cVar.a(5);
        for (int i11 = 0; i11 < a2; i11++) {
            byte[] bArr = new byte[e5.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f10976f.add(bArr);
        }
        long a10 = e5.b.a(byteBuffer.get());
        for (int i12 = 0; i12 < a10; i12++) {
            byte[] bArr2 = new byte[e5.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f10977g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i10 = obj.f10974b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            fc.c cVar2 = new fc.c(0, byteBuffer);
            obj.f10984o = cVar2.a(6);
            obj.f10978i = cVar2.a(2);
            obj.f10985p = cVar2.a(5);
            obj.f10979j = cVar2.a(3);
            obj.f10986q = cVar2.a(5);
            obj.f10980k = cVar2.a(3);
            long a11 = e5.b.a(byteBuffer.get());
            for (int i13 = 0; i13 < a11; i13++) {
                byte[] bArr3 = new byte[e5.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f10981l.add(bArr3);
            }
        } else {
            obj.f10978i = -1;
            obj.f10979j = -1;
            obj.f10980k = -1;
        }
        this.f10972a = obj;
    }

    public final void d(int i10) {
        i0.s(le.a.c(e, this, this, new Integer(i10)));
        this.f10972a.d = i10;
    }

    public final void e(int i10) {
        i0.s(le.a.c(f10964c, this, this, new Integer(i10)));
        this.f10972a.f10974b = i10;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i0.s(le.a.c(f10971y, this, this, byteBuffer));
        b bVar = this.f10972a;
        e5.b.r(bVar.f10973a, byteBuffer);
        byteBuffer.put((byte) (bVar.f10974b & 255));
        byteBuffer.put((byte) (bVar.f10975c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        fc.c cVar = new fc.c(1, byteBuffer);
        cVar.c(bVar.f10982m, 6);
        cVar.c(bVar.e, 2);
        cVar.c(bVar.f10983n, 3);
        cVar.c(bVar.f10977g.size(), 5);
        ArrayList arrayList = bVar.f10976f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            byte[] bArr = (byte[]) obj;
            e5.b.p(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (bVar.f10977g.size() & 255));
        ArrayList arrayList2 = bVar.f10977g;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            byte[] bArr2 = (byte[]) obj2;
            e5.b.p(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (bVar.h) {
            int i13 = bVar.f10974b;
            if (i13 == 100 || i13 == 110 || i13 == 122 || i13 == 144) {
                fc.c cVar2 = new fc.c(1, byteBuffer);
                cVar2.c(bVar.f10984o, 6);
                cVar2.c(bVar.f10978i, 2);
                cVar2.c(bVar.f10985p, 5);
                cVar2.c(bVar.f10979j, 3);
                cVar2.c(bVar.f10986q, 5);
                cVar2.c(bVar.f10980k, 3);
                ArrayList arrayList3 = bVar.f10981l;
                int size3 = arrayList3.size();
                while (i10 < size3) {
                    Object obj3 = arrayList3.get(i10);
                    i10++;
                    byte[] bArr3 = (byte[]) obj3;
                    e5.b.p(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    @Override
    public final long getContentSize() {
        int i10;
        i0.s(le.a.b(f10970x, this, this));
        b bVar = this.f10972a;
        ArrayList arrayList = bVar.f10976f;
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
        ArrayList arrayList2 = bVar.f10977g;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            j11 = j11 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i10 = bVar.f10974b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            long j12 = j11 + 4;
            ArrayList arrayList3 = bVar.f10981l;
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
        f b10 = le.a.b(D, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f10972a + '}';
    }
}
