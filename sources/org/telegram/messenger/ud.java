package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ud implements Runnable {
    public final int f27174a = 1;
    public final MediaController f27175b;
    public final int f27176c;
    public final int d;
    public final long f27177e;
    public final long f27178f;
    public final kj h;
    public final fj f27179n;
    public final fj f27180r;
    public final TL_stories.StoryItem f27181s;
    public final Object f27182w;

    public ud(MediaController mediaController, int i7, int i10, long j3, long j10, kj kjVar, fj fjVar, fj fjVar2, TL_stories.StoryItem storyItem, bw bwVar) {
        this.f27175b = mediaController;
        this.f27176c = i7;
        this.d = i10;
        this.f27177e = j3;
        this.f27178f = j10;
        this.h = kjVar;
        this.f27179n = fjVar;
        this.f27180r = fjVar2;
        this.f27181s = storyItem;
        this.f27182w = bwVar;
    }

    @Override
    public final void run() {
        long b22;
        String absolutePath;
        int i7 = this.f27174a;
        Object obj = this.f27182w;
        switch (i7) {
            case 0:
                mi miVar = (mi) obj;
                long j3 = this.f27177e;
                long j10 = this.f27178f;
                kj kjVar = this.h;
                fj fjVar = this.f27180r;
                TL_stories.StoryItem storyItem = this.f27181s;
                MediaController.j0(true);
                MediaController mediaController = this.f27175b;
                mediaController.C1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f22739g1 = tL_document;
                mediaController.f22741h1 = this.f27176c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f28437id = miVar.f25599e;
                int i10 = this.d;
                tL_document.user_id = j10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.f22739g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                bz.y();
                mediaController.f22747k1 = new File(miVar.f25596a);
                w7.z(4).mkdirs();
                File file = mediaController.f22747k1;
                Set set = z0.f28264a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.f28264a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.f22734e1 = true;
                    mediaController.l1 = miVar.d;
                    mediaController.f22749m1 = miVar.f25598c;
                    mediaController.f22772w1 = miVar.f25597b;
                    mediaController.f22769v1 = miVar.f25600f;
                    mediaController.n1 = j3;
                    mediaController.f22755p1 = j10;
                    mediaController.f22757q1 = kjVar;
                    fj fjVar2 = this.f27179n;
                    if (fjVar2 == null) {
                        b22 = 0;
                    } else {
                        b22 = fj.b2(mediaController.f22743i1, fjVar2.f23993k, false, false);
                    }
                    mediaController.f22753o1 = b22;
                    mediaController.f22743i1 = i10;
                    mediaController.f22760r1 = fjVar;
                    mediaController.f22763s1 = fjVar2;
                    mediaController.f22765t1 = storyItem;
                    mediaController.f22767u1 = mediaController.f22767u1;
                    TLRPC.TL_document tL_document3 = mediaController.f22739g1;
                    File file2 = mediaController.f22747k1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    g0.g3(new fn(mediaController, file2, tL_document3, bArr, miVar, 5));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    mediaController.f22739g1 = null;
                    z0.b(mediaController.f22747k1);
                    mediaController.f22747k1.delete();
                    mediaController.f22747k1 = null;
                    try {
                        mediaController.f22737f1.release();
                        mediaController.f22737f1 = null;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    MediaController.j0(false);
                    g0.g3(new di.c9(mediaController, i10, j3, 3));
                    return;
                }
            default:
                MediaController.b(this.f27175b, this.f27176c, this.d, this.f27177e, this.f27178f, this.h, this.f27179n, this.f27180r, this.f27181s, (bw) obj);
                return;
        }
    }

    public ud(MediaController mediaController, int i7, mi miVar, int i10, long j3, long j10, kj kjVar, fj fjVar, fj fjVar2, TL_stories.StoryItem storyItem) {
        this.f27175b = mediaController;
        this.f27176c = i7;
        this.f27182w = miVar;
        this.d = i10;
        this.f27177e = j3;
        this.f27178f = j10;
        this.h = kjVar;
        this.f27179n = fjVar;
        this.f27180r = fjVar2;
        this.f27181s = storyItem;
    }
}
