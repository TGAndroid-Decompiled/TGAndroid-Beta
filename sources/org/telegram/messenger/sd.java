package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class sd implements Runnable {
    public final int f18079a = 1;
    public final MediaController f18080b;
    public final int f18081c;
    public final int d;
    public final long e;
    public final long f18082f;
    public final pj h;
    public final kj f18083n;
    public final kj f18084r;
    public final TL_stories.StoryItem f18085s;
    public final Object f18086w;

    public sd(MediaController mediaController, int i10, int i11, long j10, long j11, pj pjVar, kj kjVar, kj kjVar2, TL_stories.StoryItem storyItem, tw twVar) {
        this.f18080b = mediaController;
        this.f18081c = i10;
        this.d = i11;
        this.e = j10;
        this.f18082f = j11;
        this.h = pjVar;
        this.f18083n = kjVar;
        this.f18084r = kjVar2;
        this.f18085s = storyItem;
        this.f18086w = twVar;
    }

    @Override
    public final void run() {
        long c22;
        String absolutePath;
        int i10 = this.f18079a;
        Object obj = this.f18086w;
        switch (i10) {
            case 0:
                qi qiVar = (qi) obj;
                long j10 = this.e;
                long j11 = this.f18082f;
                pj pjVar = this.h;
                kj kjVar = this.f18084r;
                TL_stories.StoryItem storyItem = this.f18085s;
                MediaController.j0(true);
                MediaController mediaController = this.f18080b;
                mediaController.A1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f14450e1 = tL_document;
                mediaController.f14453f1 = this.f18081c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f19800id = qiVar.e;
                int i11 = this.d;
                tL_document.user_id = e20.i(i11).e();
                TLRPC.TL_document tL_document2 = mediaController.f14450e1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                uz.y();
                mediaController.f14459i1 = new File(qiVar.f17776a);
                b8.z(4).mkdirs();
                File file = mediaController.f14459i1;
                Set set = c1.f15048a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    c1.f15048a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.f14446c1 = true;
                    mediaController.f14461j1 = qiVar.d;
                    mediaController.f14463k1 = qiVar.f17778c;
                    mediaController.f14484u1 = qiVar.f17777b;
                    mediaController.f14482t1 = qiVar.f17779f;
                    mediaController.l1 = j10;
                    mediaController.f14468n1 = j11;
                    mediaController.f14470o1 = pjVar;
                    kj kjVar2 = this.f18083n;
                    if (kjVar2 == null) {
                        c22 = 0;
                    } else {
                        c22 = kj.c2(mediaController.f14455g1, kjVar2.f16690k, false, false);
                    }
                    mediaController.f14465m1 = c22;
                    mediaController.f14455g1 = i11;
                    mediaController.f14472p1 = kjVar;
                    mediaController.f14474q1 = kjVar2;
                    mediaController.f14477r1 = storyItem;
                    mediaController.f14480s1 = mediaController.f14480s1;
                    TLRPC.TL_document tL_document3 = mediaController.f14450e1;
                    File file2 = mediaController.f14459i1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    i0.g3(new dn(mediaController, file2, tL_document3, bArr, qiVar, 5));
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    mediaController.f14450e1 = null;
                    c1.b(mediaController.f14459i1);
                    mediaController.f14459i1.delete();
                    mediaController.f14459i1 = null;
                    try {
                        mediaController.f14448d1.release();
                        mediaController.f14448d1 = null;
                    } catch (Exception e7) {
                        f8.g(e7, true);
                    }
                    MediaController.j0(false);
                    i0.g3(new ed(mediaController, i11, j10, 1));
                    return;
                }
            default:
                MediaController.b(this.f18080b, this.f18081c, this.d, this.e, this.f18082f, this.h, this.f18083n, this.f18084r, this.f18085s, (tw) obj);
                return;
        }
    }

    public sd(MediaController mediaController, int i10, qi qiVar, int i11, long j10, long j11, pj pjVar, kj kjVar, kj kjVar2, TL_stories.StoryItem storyItem) {
        this.f18080b = mediaController;
        this.f18081c = i10;
        this.f18086w = qiVar;
        this.d = i11;
        this.e = j10;
        this.f18082f = j11;
        this.h = pjVar;
        this.f18083n = kjVar;
        this.f18084r = kjVar2;
        this.f18085s = storyItem;
    }
}
