package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ud implements Runnable {
    public final int f27250a = 1;
    public final MediaController f27251b;
    public final int f27252c;
    public final int d;
    public final long f27253e;
    public final long f27254f;
    public final kj h;
    public final fj f27255n;
    public final fj f27256r;
    public final TL_stories.StoryItem f27257s;
    public final Object f27258w;

    public ud(MediaController mediaController, int i7, int i10, long j3, long j10, kj kjVar, fj fjVar, fj fjVar2, TL_stories.StoryItem storyItem, bw bwVar) {
        this.f27251b = mediaController;
        this.f27252c = i7;
        this.d = i10;
        this.f27253e = j3;
        this.f27254f = j10;
        this.h = kjVar;
        this.f27255n = fjVar;
        this.f27256r = fjVar2;
        this.f27257s = storyItem;
        this.f27258w = bwVar;
    }

    @Override
    public final void run() {
        long b22;
        String absolutePath;
        int i7 = this.f27250a;
        Object obj = this.f27258w;
        switch (i7) {
            case 0:
                mi miVar = (mi) obj;
                long j3 = this.f27253e;
                long j10 = this.f27254f;
                kj kjVar = this.h;
                fj fjVar = this.f27256r;
                TL_stories.StoryItem storyItem = this.f27257s;
                MediaController.j0(true);
                MediaController mediaController = this.f27251b;
                mediaController.C1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f22809g1 = tL_document;
                mediaController.f22811h1 = this.f27252c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f28498id = miVar.f25666e;
                int i10 = this.d;
                tL_document.user_id = i10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.f22809g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                bz.y();
                mediaController.f22817k1 = new File(miVar.f25663a);
                w7.z(4).mkdirs();
                File file = mediaController.f22817k1;
                Set set = z0.f28337a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.f28337a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.f22804e1 = true;
                    mediaController.l1 = miVar.d;
                    mediaController.f22819m1 = miVar.f25665c;
                    mediaController.f22842w1 = miVar.f25664b;
                    mediaController.f22839v1 = miVar.f25667f;
                    mediaController.n1 = j3;
                    mediaController.f22825p1 = j10;
                    mediaController.f22827q1 = kjVar;
                    fj fjVar2 = this.f27255n;
                    if (fjVar2 == null) {
                        b22 = 0;
                    } else {
                        b22 = fj.b2(mediaController.f22813i1, fjVar2.f24073k, false, false);
                    }
                    mediaController.f22823o1 = b22;
                    mediaController.f22813i1 = i10;
                    mediaController.f22830r1 = fjVar;
                    mediaController.f22833s1 = fjVar2;
                    mediaController.f22835t1 = storyItem;
                    mediaController.f22837u1 = mediaController.f22837u1;
                    TLRPC.TL_document tL_document3 = mediaController.f22809g1;
                    File file2 = mediaController.f22817k1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    g0.g3(new fn(mediaController, file2, tL_document3, bArr, miVar, 5));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    mediaController.f22809g1 = null;
                    z0.b(mediaController.f22817k1);
                    mediaController.f22817k1.delete();
                    mediaController.f22817k1 = null;
                    try {
                        mediaController.f22807f1.release();
                        mediaController.f22807f1 = null;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    MediaController.j0(false);
                    g0.g3(new di.c9(mediaController, i10, j3, 3));
                    return;
                }
            default:
                MediaController.b(this.f27251b, this.f27252c, this.d, this.f27253e, this.f27254f, this.h, this.f27255n, this.f27256r, this.f27257s, (bw) obj);
                return;
        }
    }

    public ud(MediaController mediaController, int i7, mi miVar, int i10, long j3, long j10, kj kjVar, fj fjVar, fj fjVar2, TL_stories.StoryItem storyItem) {
        this.f27251b = mediaController;
        this.f27252c = i7;
        this.f27258w = miVar;
        this.d = i10;
        this.f27253e = j3;
        this.f27254f = j10;
        this.h = kjVar;
        this.f27255n = fjVar;
        this.f27256r = fjVar2;
        this.f27257s = storyItem;
    }
}
