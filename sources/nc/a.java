package nc;

import com.googlecode.mp4parser.g;
import ic.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.i9;
import ui.f;
public final class a extends com.googlecode.mp4parser.a {
    public static final i9 E;
    public static final i9 f20318b;
    public static final i9 f20319c;
    public static final i9 d;
    public static final i9 f20320e;
    public static final i9 f20321f;
    public static final i9 h;
    public static final i9 f20322n;
    public static final i9 f20323r;
    public static final i9 f20324s;
    public static final i9 f20325w;
    public static final i9 f20326x;
    public static final i9 f20327y;
    public b f20328a;

    static {
        we.a aVar = new we.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f20320e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f20321f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        f20322n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f20323r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f20324s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        f20325w = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        f20326x = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        f20327y = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        E = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        f20318b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        f20319c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i3;
        ?? obj = new Object();
        obj.f20333f = new ArrayList();
        obj.f20334g = new ArrayList();
        obj.h = true;
        obj.f20335i = 1;
        obj.f20336j = 0;
        obj.f20337k = 0;
        obj.f20338l = new ArrayList();
        obj.f20339m = 63;
        obj.f20340n = 7;
        obj.f20341o = 31;
        obj.f20342p = 31;
        obj.f20343q = 31;
        obj.f20329a = g5.b.k(byteBuffer);
        obj.f20330b = g5.b.a(byteBuffer.get());
        obj.f20331c = g5.b.a(byteBuffer.get());
        obj.d = g5.b.a(byteBuffer.get());
        c cVar = new c(0, byteBuffer);
        obj.f20339m = cVar.a(6);
        obj.f20332e = cVar.a(2);
        obj.f20340n = cVar.a(3);
        int a10 = cVar.a(5);
        for (int i10 = 0; i10 < a10; i10++) {
            byte[] bArr = new byte[g5.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            obj.f20333f.add(bArr);
        }
        long a11 = g5.b.a(byteBuffer.get());
        for (int i11 = 0; i11 < a11; i11++) {
            byte[] bArr2 = new byte[g5.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            obj.f20334g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            obj.h = false;
        }
        if (obj.h && ((i3 = obj.f20330b) == 100 || i3 == 110 || i3 == 122 || i3 == 144)) {
            c cVar2 = new c(0, byteBuffer);
            obj.f20341o = cVar2.a(6);
            obj.f20335i = cVar2.a(2);
            obj.f20342p = cVar2.a(5);
            obj.f20336j = cVar2.a(3);
            obj.f20343q = cVar2.a(5);
            obj.f20337k = cVar2.a(3);
            long a12 = g5.b.a(byteBuffer.get());
            for (int i12 = 0; i12 < a12; i12++) {
                byte[] bArr3 = new byte[g5.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                obj.f20338l.add(bArr3);
            }
        } else {
            obj.f20335i = -1;
            obj.f20336j = -1;
            obj.f20337k = -1;
        }
        this.f20328a = obj;
    }

    public final void d(int i3) {
        com.google.android.recaptcha.internal.a.t(we.a.c(f20320e, this, this, new Integer(i3)));
        this.f20328a.d = i3;
    }

    public final void e(int i3) {
        com.google.android.recaptcha.internal.a.t(we.a.c(f20319c, this, this, new Integer(i3)));
        this.f20328a.f20330b = i3;
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        com.google.android.recaptcha.internal.a.t(we.a.c(f20327y, this, this, byteBuffer));
        b bVar = this.f20328a;
        g5.b.r(bVar.f20329a, byteBuffer);
        byteBuffer.put((byte) (bVar.f20330b & 255));
        byteBuffer.put((byte) (bVar.f20331c & 255));
        byteBuffer.put((byte) (bVar.d & 255));
        c cVar = new c(1, byteBuffer);
        cVar.c(bVar.f20339m, 6);
        cVar.c(bVar.f20332e, 2);
        cVar.c(bVar.f20340n, 3);
        cVar.c(bVar.f20334g.size(), 5);
        ArrayList arrayList = bVar.f20333f;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            byte[] bArr = (byte[]) obj;
            g5.b.p(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (bVar.f20334g.size() & 255));
        ArrayList arrayList2 = bVar.f20334g;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            byte[] bArr2 = (byte[]) obj2;
            g5.b.p(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (bVar.h) {
            int i12 = bVar.f20330b;
            if (i12 == 100 || i12 == 110 || i12 == 122 || i12 == 144) {
                c cVar2 = new c(1, byteBuffer);
                cVar2.c(bVar.f20341o, 6);
                cVar2.c(bVar.f20335i, 2);
                cVar2.c(bVar.f20342p, 5);
                cVar2.c(bVar.f20336j, 3);
                cVar2.c(bVar.f20343q, 5);
                cVar2.c(bVar.f20337k, 3);
                ArrayList arrayList3 = bVar.f20338l;
                int size3 = arrayList3.size();
                while (i3 < size3) {
                    Object obj3 = arrayList3.get(i3);
                    i3++;
                    byte[] bArr3 = (byte[]) obj3;
                    g5.b.p(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    @Override
    public final long getContentSize() {
        int i3;
        com.google.android.recaptcha.internal.a.t(we.a.b(f20326x, this, this));
        b bVar = this.f20328a;
        ArrayList arrayList = bVar.f20333f;
        int size = arrayList.size();
        long j10 = 6;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            j10 = j10 + 2 + ((byte[]) obj).length;
        }
        long j11 = j10 + 1;
        ArrayList arrayList2 = bVar.f20334g;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            j11 = j11 + 2 + ((byte[]) obj2).length;
        }
        if (bVar.h && ((i3 = bVar.f20330b) == 100 || i3 == 110 || i3 == 122 || i3 == 144)) {
            long j12 = j11 + 4;
            ArrayList arrayList3 = bVar.f20338l;
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                j12 = j12 + 2 + ((byte[]) obj3).length;
            }
            return j12;
        }
        return j11;
    }

    public final String toString() {
        f b10 = we.a.b(E, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f20328a + '}';
    }
}
