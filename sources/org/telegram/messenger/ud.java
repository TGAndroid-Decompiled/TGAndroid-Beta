package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ud implements Runnable {
    public final int f27148a = 1;
    public final MediaController f27149b;
    public final int f27150c;
    public final int d;
    public final long f27151e;
    public final long f27152f;
    public final kj h;
    public final fj f27153n;
    public final fj f27154r;
    public final TL_stories.StoryItem f27155s;
    public final Object f27156w;

    public ud(MediaController mediaController, int i7, int i10, long j3, long j10, kj kjVar, fj fjVar, fj fjVar2, TL_stories.StoryItem storyItem, bw bwVar) {
        this.f27149b = mediaController;
        this.f27150c = i7;
        this.d = i10;
        this.f27151e = j3;
        this.f27152f = j10;
        this.h = kjVar;
        this.f27153n = fjVar;
        this.f27154r = fjVar2;
        this.f27155s = storyItem;
        this.f27156w = bwVar;
    }

    @Override
    public final void run() {
        long b22;
        String absolutePath;
        int i7 = this.f27148a;
        Object obj = this.f27156w;
        switch (i7) {
            case 0:
                mi miVar = (mi) obj;
                long j3 = this.f27151e;
                long j10 = this.f27152f;
                kj kjVar = this.h;
                fj fjVar = this.f27154r;
                TL_stories.StoryItem storyItem = this.f27155s;
                MediaController.j0(true);
                MediaController mediaController = this.f27149b;
                mediaController.C1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f22714g1 = tL_document;
                mediaController.f22716h1 = this.f27150c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f28411id = miVar.f25573e;
                int i10 = this.d;
                tL_document.user_id = j10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.f22714g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                bz.y();
                mediaController.f22722k1 = new File(miVar.f25570a);
                w7.z(4).mkdirs();
                File file = mediaController.f22722k1;
                Set set = z0.f28238a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.f28238a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.f22709e1 = true;
                    mediaController.l1 = miVar.d;
                    mediaController.f22724m1 = miVar.f25572c;
                    mediaController.f22747w1 = miVar.f25571b;
                    mediaController.f22744v1 = miVar.f25574f;
                    mediaController.n1 = j3;
                    mediaController.f22730p1 = j10;
                    mediaController.f22732q1 = kjVar;
                    fj fjVar2 = this.f27153n;
                    if (fjVar2 == null) {
                        b22 = 0;
                    } else {
                        b22 = fj.b2(mediaController.f22718i1, fjVar2.f23968k, false, false);
                    }
                    mediaController.f22728o1 = b22;
                    mediaController.f22718i1 = i10;
                    mediaController.f22735r1 = fjVar;
                    mediaController.f22738s1 = fjVar2;
                    mediaController.f22740t1 = storyItem;
                    mediaController.f22742u1 = mediaController.f22742u1;
                    TLRPC.TL_document tL_document3 = mediaController.f22714g1;
                    File file2 = mediaController.f22722k1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    g0.g3(new fn(mediaController, file2, tL_document3, bArr, miVar, 5));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    mediaController.f22714g1 = null;
                    z0.b(mediaController.f22722k1);
                    mediaController.f22722k1.delete();
                    mediaController.f22722k1 = null;
                    try {
                        mediaController.f22712f1.release();
                        mediaController.f22712f1 = null;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    MediaController.j0(false);
                    g0.g3(new di.b9(mediaController, i10, j3, 3));
                    return;
                }
            default:
                MediaController.b(this.f27149b, this.f27150c, this.d, this.f27151e, this.f27152f, this.h, this.f27153n, this.f27154r, this.f27155s, (bw) obj);
                return;
        }
    }

    public ud(MediaController mediaController, int i7, mi miVar, int i10, long j3, long j10, kj kjVar, fj fjVar, fj fjVar2, TL_stories.StoryItem storyItem) {
        this.f27149b = mediaController;
        this.f27150c = i7;
        this.f27156w = miVar;
        this.d = i10;
        this.f27151e = j3;
        this.f27152f = j10;
        this.h = kjVar;
        this.f27153n = fjVar;
        this.f27154r = fjVar2;
        this.f27155s = storyItem;
    }
}
