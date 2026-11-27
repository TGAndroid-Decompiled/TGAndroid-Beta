package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class nc0 extends z1 {
    public static final xh4 E;
    public static final xh4 b;
    public static final xh4 c;
    public static final xh4 d;
    public static final xh4 e;
    public static final xh4 f;
    public static final xh4 h;
    public static final xh4 n;
    public static final xh4 r;
    public static final xh4 s;
    public static final xh4 w;
    public static final xh4 x;
    public static final xh4 y;
    public oc0 a;

    static {
        u84 u84Var = new u84(nc0.class, "AvcConfigurationBox.java");
        u84Var.e(u84Var.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        u84Var.e(u84Var.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        e = u84Var.e(u84Var.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f = u84Var.e(u84Var.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = u84Var.e(u84Var.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        n = u84Var.e(u84Var.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        u84Var.e(u84Var.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        r = u84Var.e(u84Var.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        u84Var.e(u84Var.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        s = u84Var.e(u84Var.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        u84Var.e(u84Var.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        w = u84Var.e(u84Var.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        u84Var.e(u84Var.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        u84Var.e(u84Var.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        u84Var.e(u84Var.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        u84Var.e(u84Var.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        u84Var.e(u84Var.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        x = u84Var.e(u84Var.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        y = u84Var.e(u84Var.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        u84Var.e(u84Var.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        u84Var.e(u84Var.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        u84Var.e(u84Var.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        E = u84Var.e(u84Var.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        u84Var.e(u84Var.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        u84Var.e(u84Var.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        u84Var.e(u84Var.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        u84Var.e(u84Var.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        b = u84Var.e(u84Var.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        c = u84Var.e(u84Var.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = u84Var.e(u84Var.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
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
        obj.a = zpe.i(byteBuffer);
        obj.b = zpe.a(byteBuffer.get());
        obj.c = zpe.a(byteBuffer.get());
        obj.d = zpe.a(byteBuffer.get());
        ir7 ir7Var = new ir7(byteBuffer, (byte) 1);
        obj.m = ir7Var.a(6);
        obj.e = ir7Var.a(2);
        obj.n = ir7Var.a(3);
        int a = ir7Var.a(5);
        for (int i2 = 0; i2 < a; i2++) {
            byte[] bArr = new byte[zpe.f(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f.add(bArr);
        }
        long a2 = zpe.a(byteBuffer.get());
        for (int i3 = 0; i3 < a2; i3++) {
            byte[] bArr2 = new byte[zpe.f(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i = obj.b) == 100 || i == 110 || i == 122 || i == 144)) {
            ir7 ir7Var2 = new ir7(byteBuffer, (byte) 1);
            obj.o = ir7Var2.a(6);
            obj.i = ir7Var2.a(2);
            obj.p = ir7Var2.a(5);
            obj.j = ir7Var2.a(3);
            obj.q = ir7Var2.a(5);
            obj.k = ir7Var2.a(3);
            long a3 = zpe.a(byteBuffer.get());
            for (int i4 = 0; i4 < a3; i4++) {
                byte[] bArr3 = new byte[zpe.f(byteBuffer)];
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
        bp1.r(u84.c(e, this, this, new Integer(i)));
        this.a.d = i;
    }

    public final void e(int i) {
        bp1.r(u84.c(c, this, this, new Integer(i)));
        this.a.b = i;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        bp1.r(u84.c(y, this, this, byteBuffer));
        oc0 oc0Var = this.a;
        aqe.f(oc0Var.a, byteBuffer);
        byteBuffer.put((byte) (oc0Var.b & 255));
        byteBuffer.put((byte) (oc0Var.c & 255));
        byteBuffer.put((byte) (oc0Var.d & 255));
        ir7 ir7Var = new ir7(byteBuffer, (byte) 2);
        ir7Var.c(oc0Var.m, 6);
        ir7Var.c(oc0Var.e, 2);
        ir7Var.c(oc0Var.n, 3);
        ir7Var.c(oc0Var.g.size(), 5);
        ArrayList arrayList = oc0Var.f;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            byte[] bArr = (byte[]) obj;
            aqe.d(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (oc0Var.g.size() & 255));
        ArrayList arrayList2 = oc0Var.g;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            byte[] bArr2 = (byte[]) obj2;
            aqe.d(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (oc0Var.h) {
            int i4 = oc0Var.b;
            if (i4 == 100 || i4 == 110 || i4 == 122 || i4 == 144) {
                ir7 ir7Var2 = new ir7(byteBuffer, (byte) 2);
                ir7Var2.c(oc0Var.o, 6);
                ir7Var2.c(oc0Var.i, 2);
                ir7Var2.c(oc0Var.p, 5);
                ir7Var2.c(oc0Var.j, 3);
                ir7Var2.c(oc0Var.q, 5);
                ir7Var2.c(oc0Var.k, 3);
                ArrayList arrayList3 = oc0Var.l;
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    byte[] bArr3 = (byte[]) obj3;
                    aqe.d(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    @Override
    public final long getContentSize() {
        int i;
        bp1.r(u84.b(x, this, this));
        oc0 oc0Var = this.a;
        ArrayList arrayList = oc0Var.f;
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
        ArrayList arrayList2 = oc0Var.g;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            j2 = j2 + 2 + ((byte[]) obj2).length;
        }
        if (oc0Var.h && ((i = oc0Var.b) == 100 || i == 110 || i == 122 || i == 144)) {
            long j3 = j2 + 4;
            ArrayList arrayList3 = oc0Var.l;
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
        lyc b2 = u84.b(E, this, this);
        zb9.a().getClass();
        zb9.b(b2);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.a + '}';
    }
}
