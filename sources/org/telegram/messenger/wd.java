package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class wd implements Runnable {
    public final int f26288a = 1;
    public final MediaController f26289b;
    public final int f26290c;
    public final int d;
    public final long f26291e;
    public final long f26292f;
    public final nj h;
    public final ij f26293n;
    public final ij f26294r;
    public final TL_stories.StoryItem f26295s;
    public final Object f26296w;

    public wd(MediaController mediaController, int i7, int i10, long j3, long j10, nj njVar, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem, hw hwVar) {
        this.f26289b = mediaController;
        this.f26290c = i7;
        this.d = i10;
        this.f26291e = j3;
        this.f26292f = j10;
        this.h = njVar;
        this.f26293n = ijVar;
        this.f26294r = ijVar2;
        this.f26295s = storyItem;
        this.f26296w = hwVar;
    }

    @Override
    public final void run() {
        long c22;
        String absolutePath;
        int i7 = this.f26288a;
        Object obj = this.f26296w;
        switch (i7) {
            case 0:
                pi piVar = (pi) obj;
                long j3 = this.f26291e;
                long j10 = this.f26292f;
                nj njVar = this.h;
                ij ijVar = this.f26294r;
                TL_stories.StoryItem storyItem = this.f26295s;
                MediaController.j0(true);
                MediaController mediaController = this.f26289b;
                mediaController.B1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f21266f1 = tL_document;
                mediaController.f21268g1 = this.f26290c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f26962id = piVar.f24570e;
                int i10 = this.d;
                tL_document.user_id = p10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.f21266f1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                iz.y();
                mediaController.f21274j1 = new File(piVar.f24567a);
                w7.z(4).mkdirs();
                File file = mediaController.f21274j1;
                Set set = z0.f26790a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.f26790a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.f21260d1 = true;
                    mediaController.f21276k1 = piVar.d;
                    mediaController.l1 = piVar.f24569c;
                    mediaController.f21298v1 = piVar.f24568b;
                    mediaController.f21296u1 = piVar.f24571f;
                    mediaController.f21278m1 = j3;
                    mediaController.f21282o1 = j10;
                    mediaController.f21284p1 = njVar;
                    ij ijVar2 = this.f26293n;
                    if (ijVar2 == null) {
                        c22 = 0;
                    } else {
                        c22 = ij.c2(mediaController.f21270h1, ijVar2.f23262k, false, false);
                    }
                    mediaController.n1 = c22;
                    mediaController.f21270h1 = i10;
                    mediaController.f21286q1 = ijVar;
                    mediaController.f21289r1 = ijVar2;
                    mediaController.f21292s1 = storyItem;
                    mediaController.f21294t1 = mediaController.f21294t1;
                    TLRPC.TL_document tL_document3 = mediaController.f21266f1;
                    File file2 = mediaController.f21274j1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    g0.h3(new mn(mediaController, file2, tL_document3, bArr, piVar, 5));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    mediaController.f21266f1 = null;
                    z0.b(mediaController.f21274j1);
                    mediaController.f21274j1.delete();
                    mediaController.f21274j1 = null;
                    try {
                        mediaController.f21263e1.release();
                        mediaController.f21263e1 = null;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    MediaController.j0(false);
                    g0.h3(new bi.ia(mediaController, i10, j3, 3));
                    return;
                }
            default:
                MediaController.b(this.f26289b, this.f26290c, this.d, this.f26291e, this.f26292f, this.h, this.f26293n, this.f26294r, this.f26295s, (hw) obj);
                return;
        }
    }

    public wd(MediaController mediaController, int i7, pi piVar, int i10, long j3, long j10, nj njVar, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem) {
        this.f26289b = mediaController;
        this.f26290c = i7;
        this.f26296w = piVar;
        this.d = i10;
        this.f26291e = j3;
        this.f26292f = j10;
        this.h = njVar;
        this.f26293n = ijVar;
        this.f26294r = ijVar2;
        this.f26295s = storyItem;
    }
}
