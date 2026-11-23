package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class vd implements Runnable {
    public final int f27309a = 1;
    public final MediaController f27310b;
    public final int f27311c;
    public final int d;
    public final long f27312e;
    public final long f27313f;
    public final lj h;
    public final gj f27314n;
    public final gj f27315r;
    public final TL_stories.StoryItem f27316s;
    public final Object f27317w;

    public vd(MediaController mediaController, int i7, int i10, long j3, long j10, lj ljVar, gj gjVar, gj gjVar2, TL_stories.StoryItem storyItem, cw cwVar) {
        this.f27310b = mediaController;
        this.f27311c = i7;
        this.d = i10;
        this.f27312e = j3;
        this.f27313f = j10;
        this.h = ljVar;
        this.f27314n = gjVar;
        this.f27315r = gjVar2;
        this.f27316s = storyItem;
        this.f27317w = cwVar;
    }

    @Override
    public final void run() {
        long b22;
        String absolutePath;
        int i7 = this.f27309a;
        Object obj = this.f27317w;
        switch (i7) {
            case 0:
                ni niVar = (ni) obj;
                long j3 = this.f27312e;
                long j10 = this.f27313f;
                lj ljVar = this.h;
                gj gjVar = this.f27315r;
                TL_stories.StoryItem storyItem = this.f27316s;
                MediaController.j0(true);
                MediaController mediaController = this.f27310b;
                mediaController.C1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f22706g1 = tL_document;
                mediaController.f22708h1 = this.f27311c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f28404id = niVar.f25734e;
                int i10 = this.d;
                tL_document.user_id = k10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.f22706g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                cz.y();
                mediaController.f22714k1 = new File(niVar.f25731a);
                w7.z(4).mkdirs();
                File file = mediaController.f22714k1;
                Set set = z0.f28239a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.f28239a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.f22701e1 = true;
                    mediaController.l1 = niVar.d;
                    mediaController.f22716m1 = niVar.f25733c;
                    mediaController.f22739w1 = niVar.f25732b;
                    mediaController.f22736v1 = niVar.f25735f;
                    mediaController.n1 = j3;
                    mediaController.f22722p1 = j10;
                    mediaController.f22724q1 = ljVar;
                    gj gjVar2 = this.f27314n;
                    if (gjVar2 == null) {
                        b22 = 0;
                    } else {
                        b22 = gj.b2(mediaController.f22710i1, gjVar2.f24177k, false, false);
                    }
                    mediaController.f22720o1 = b22;
                    mediaController.f22710i1 = i10;
                    mediaController.f22727r1 = gjVar;
                    mediaController.f22730s1 = gjVar2;
                    mediaController.f22732t1 = storyItem;
                    mediaController.f22734u1 = mediaController.f22734u1;
                    TLRPC.TL_document tL_document3 = mediaController.f22706g1;
                    File file2 = mediaController.f22714k1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    g0.g3(new gn(mediaController, file2, tL_document3, bArr, niVar, 5));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    mediaController.f22706g1 = null;
                    z0.b(mediaController.f22714k1);
                    mediaController.f22714k1.delete();
                    mediaController.f22714k1 = null;
                    try {
                        mediaController.f22704f1.release();
                        mediaController.f22704f1 = null;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    MediaController.j0(false);
                    g0.g3(new di.c9(mediaController, i10, j3, 3));
                    return;
                }
            default:
                MediaController.b(this.f27310b, this.f27311c, this.d, this.f27312e, this.f27313f, this.h, this.f27314n, this.f27315r, this.f27316s, (cw) obj);
                return;
        }
    }

    public vd(MediaController mediaController, int i7, ni niVar, int i10, long j3, long j10, lj ljVar, gj gjVar, gj gjVar2, TL_stories.StoryItem storyItem) {
        this.f27310b = mediaController;
        this.f27311c = i7;
        this.f27317w = niVar;
        this.d = i10;
        this.f27312e = j3;
        this.f27313f = j10;
        this.h = ljVar;
        this.f27314n = gjVar;
        this.f27315r = gjVar2;
        this.f27316s = storyItem;
    }
}
