package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ud implements Runnable {
    public final int f27146a = 1;
    public final MediaController f27147b;
    public final int f27148c;
    public final int d;
    public final long f27149e;
    public final long f27150f;
    public final kj h;
    public final fj f27151n;
    public final fj f27152r;
    public final TL_stories.StoryItem f27153s;
    public final Object f27154w;

    public ud(MediaController mediaController, int i7, int i10, long j3, long j10, kj kjVar, fj fjVar, fj fjVar2, TL_stories.StoryItem storyItem, bw bwVar) {
        this.f27147b = mediaController;
        this.f27148c = i7;
        this.d = i10;
        this.f27149e = j3;
        this.f27150f = j10;
        this.h = kjVar;
        this.f27151n = fjVar;
        this.f27152r = fjVar2;
        this.f27153s = storyItem;
        this.f27154w = bwVar;
    }

    @Override
    public final void run() {
        long b22;
        String absolutePath;
        int i7 = this.f27146a;
        Object obj = this.f27154w;
        switch (i7) {
            case 0:
                mi miVar = (mi) obj;
                long j3 = this.f27149e;
                long j10 = this.f27150f;
                kj kjVar = this.h;
                fj fjVar = this.f27152r;
                TL_stories.StoryItem storyItem = this.f27153s;
                MediaController.j0(true);
                MediaController mediaController = this.f27147b;
                mediaController.C1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f22711g1 = tL_document;
                mediaController.f22713h1 = this.f27148c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f28409id = miVar.f25571e;
                int i10 = this.d;
                tL_document.user_id = j10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.f22711g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                bz.y();
                mediaController.f22719k1 = new File(miVar.f25568a);
                w7.z(4).mkdirs();
                File file = mediaController.f22719k1;
                Set set = z0.f28236a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.f28236a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.f22706e1 = true;
                    mediaController.l1 = miVar.d;
                    mediaController.f22721m1 = miVar.f25570c;
                    mediaController.f22744w1 = miVar.f25569b;
                    mediaController.f22741v1 = miVar.f25572f;
                    mediaController.n1 = j3;
                    mediaController.f22727p1 = j10;
                    mediaController.f22729q1 = kjVar;
                    fj fjVar2 = this.f27151n;
                    if (fjVar2 == null) {
                        b22 = 0;
                    } else {
                        b22 = fj.b2(mediaController.f22715i1, fjVar2.f23965k, false, false);
                    }
                    mediaController.f22725o1 = b22;
                    mediaController.f22715i1 = i10;
                    mediaController.f22732r1 = fjVar;
                    mediaController.f22735s1 = fjVar2;
                    mediaController.f22737t1 = storyItem;
                    mediaController.f22739u1 = mediaController.f22739u1;
                    TLRPC.TL_document tL_document3 = mediaController.f22711g1;
                    File file2 = mediaController.f22719k1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    g0.g3(new fn(mediaController, file2, tL_document3, bArr, miVar, 5));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    mediaController.f22711g1 = null;
                    z0.b(mediaController.f22719k1);
                    mediaController.f22719k1.delete();
                    mediaController.f22719k1 = null;
                    try {
                        mediaController.f22709f1.release();
                        mediaController.f22709f1 = null;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    MediaController.j0(false);
                    g0.g3(new di.b9(mediaController, i10, j3, 3));
                    return;
                }
            default:
                MediaController.b(this.f27147b, this.f27148c, this.d, this.f27149e, this.f27150f, this.h, this.f27151n, this.f27152r, this.f27153s, (bw) obj);
                return;
        }
    }

    public ud(MediaController mediaController, int i7, mi miVar, int i10, long j3, long j10, kj kjVar, fj fjVar, fj fjVar2, TL_stories.StoryItem storyItem) {
        this.f27147b = mediaController;
        this.f27148c = i7;
        this.f27154w = miVar;
        this.d = i10;
        this.f27149e = j3;
        this.f27150f = j10;
        this.h = kjVar;
        this.f27151n = fjVar;
        this.f27152r = fjVar2;
        this.f27153s = storyItem;
    }
}
