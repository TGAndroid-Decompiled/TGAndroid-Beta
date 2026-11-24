package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class ld0 extends y1 {
    public static final ai4 E;
    public static final ai4 b;
    public static final ai4 c;
    public static final ai4 d;
    public static final ai4 e;
    public static final ai4 f;
    public static final ai4 h;
    public static final ai4 n;
    public static final ai4 r;
    public static final ai4 s;
    public static final ai4 w;
    public static final ai4 x;
    public static final ai4 y;
    public md0 a;

    static {
        i94 i94Var = new i94(ld0.class, "AvcConfigurationBox.java");
        i94Var.e(i94Var.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        i94Var.e(i94Var.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        e = i94Var.e(i94Var.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f = i94Var.e(i94Var.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = i94Var.e(i94Var.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        n = i94Var.e(i94Var.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        i94Var.e(i94Var.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        r = i94Var.e(i94Var.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        i94Var.e(i94Var.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        s = i94Var.e(i94Var.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        i94Var.e(i94Var.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        w = i94Var.e(i94Var.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        i94Var.e(i94Var.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        i94Var.e(i94Var.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        i94Var.e(i94Var.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        i94Var.e(i94Var.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        i94Var.e(i94Var.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        x = i94Var.e(i94Var.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        y = i94Var.e(i94Var.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        i94Var.e(i94Var.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        i94Var.e(i94Var.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        i94Var.e(i94Var.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        E = i94Var.e(i94Var.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        i94Var.e(i94Var.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        i94Var.e(i94Var.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        i94Var.e(i94Var.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        i94Var.e(i94Var.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        b = i94Var.e(i94Var.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        c = i94Var.e(i94Var.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = i94Var.e(i94Var.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i;
        ?? obj = new Object();
        obj.f = new ArrayList();
        obj.g = new ArrayList();
        obj.h = true;
        obj.i = 1;
        obj.j = 0;
        obj.k = 0;
        obj.l = new ArrayList();
        obj.m = 63;
        obj.n = 7;
        obj.o = 31;
        obj.p = 31;
        obj.q = 31;
        obj.a = jne.i(byteBuffer);
        obj.b = jne.a(byteBuffer.get());
        obj.c = jne.a(byteBuffer.get());
        obj.d = jne.a(byteBuffer.get());
        lq7 lq7Var = new lq7(byteBuffer, (byte) 1);
        obj.m = lq7Var.a(6);
        obj.e = lq7Var.a(2);
        obj.n = lq7Var.a(3);
        int a = lq7Var.a(5);
        for (int i2 = 0; i2 < a; i2++) {
            byte[] bArr = new byte[jne.f(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f.add(bArr);
        }
        long a2 = jne.a(byteBuffer.get());
        for (int i3 = 0; i3 < a2; i3++) {
            byte[] bArr2 = new byte[jne.f(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i = obj.b) == 100 || i == 110 || i == 122 || i == 144)) {
            lq7 lq7Var2 = new lq7(byteBuffer, (byte) 1);
            obj.o = lq7Var2.a(6);
            obj.i = lq7Var2.a(2);
            obj.p = lq7Var2.a(5);
            obj.j = lq7Var2.a(3);
            obj.q = lq7Var2.a(5);
            obj.k = lq7Var2.a(3);
            long a3 = jne.a(byteBuffer.get());
            for (int i4 = 0; i4 < a3; i4++) {
                byte[] bArr3 = new byte[jne.f(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.l.add(bArr3);
            }
        } else {
            obj.i = -1;
            obj.j = -1;
            obj.k = -1;
        }
        this.a = obj;
    }

    public final void d(int i) {
        aq1.r(i94.c(e, this, this, new Integer(i)));
        this.a.d = i;
    }

    public final void e(int i) {
        aq1.r(i94.c(c, this, this, new Integer(i)));
        this.a.b = i;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        aq1.r(i94.c(y, this, this, byteBuffer));
        md0 md0Var = this.a;
        kne.f(md0Var.a, byteBuffer);
        byteBuffer.put((byte) (md0Var.b & 255));
        byteBuffer.put((byte) (md0Var.c & 255));
        byteBuffer.put((byte) (md0Var.d & 255));
        lq7 lq7Var = new lq7(byteBuffer, (byte) 2);
        lq7Var.c(md0Var.m, 6);
        lq7Var.c(md0Var.e, 2);
        lq7Var.c(md0Var.n, 3);
        lq7Var.c(md0Var.g.size(), 5);
        ArrayList arrayList = md0Var.f;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            byte[] bArr = (byte[]) obj;
            kne.d(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (md0Var.g.size() & 255));
        ArrayList arrayList2 = md0Var.g;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            byte[] bArr2 = (byte[]) obj2;
            kne.d(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (md0Var.h) {
            int i4 = md0Var.b;
            if (i4 == 100 || i4 == 110 || i4 == 122 || i4 == 144) {
                lq7 lq7Var2 = new lq7(byteBuffer, (byte) 2);
                lq7Var2.c(md0Var.o, 6);
                lq7Var2.c(md0Var.i, 2);
                lq7Var2.c(md0Var.p, 5);
                lq7Var2.c(md0Var.j, 3);
                lq7Var2.c(md0Var.q, 5);
                lq7Var2.c(md0Var.k, 3);
                ArrayList arrayList3 = md0Var.l;
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    byte[] bArr3 = (byte[]) obj3;
                    kne.d(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    @Override
    public final long getContentSize() {
        int i;
        aq1.r(i94.b(x, this, this));
        md0 md0Var = this.a;
        ArrayList arrayList = md0Var.f;
        int size = arrayList.size();
        long j = 6;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            j = j + 2 + ((byte[]) obj).length;
        }
        long j2 = j + 1;
        ArrayList arrayList2 = md0Var.g;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            j2 = j2 + 2 + ((byte[]) obj2).length;
        }
        if (md0Var.h && ((i = md0Var.b) == 100 || i == 110 || i == 122 || i == 144)) {
            long j3 = j2 + 4;
            ArrayList arrayList3 = md0Var.l;
            int size3 = arrayList3.size();
            while (i2 < size3) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                j3 = j3 + 2 + ((byte[]) obj3).length;
            }
            return j3;
        }
        return j2;
    }

    public final String toString() {
        xvc b2 = i94.b(E, this, this);
        pa9.a().getClass();
        pa9.b(b2);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.a + '}';
    }
}
