package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class wd implements Runnable {
    public final int f26277a = 1;
    public final MediaController f26278b;
    public final int f26279c;
    public final int d;
    public final long f26280e;
    public final long f26281f;
    public final nj h;
    public final ij f26282n;
    public final ij f26283r;
    public final TL_stories.StoryItem f26284s;
    public final Object f26285w;

    public wd(MediaController mediaController, int i7, int i10, long j3, long j10, nj njVar, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem, hw hwVar) {
        this.f26278b = mediaController;
        this.f26279c = i7;
        this.d = i10;
        this.f26280e = j3;
        this.f26281f = j10;
        this.h = njVar;
        this.f26282n = ijVar;
        this.f26283r = ijVar2;
        this.f26284s = storyItem;
        this.f26285w = hwVar;
    }

    @Override
    public final void run() {
        long c22;
        String absolutePath;
        int i7 = this.f26277a;
        Object obj = this.f26285w;
        switch (i7) {
            case 0:
                pi piVar = (pi) obj;
                long j3 = this.f26280e;
                long j10 = this.f26281f;
                nj njVar = this.h;
                ij ijVar = this.f26283r;
                TL_stories.StoryItem storyItem = this.f26284s;
                MediaController.j0(true);
                MediaController mediaController = this.f26278b;
                mediaController.B1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f21263f1 = tL_document;
                mediaController.f21265g1 = this.f26279c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f26958id = piVar.f24555e;
                int i10 = this.d;
                tL_document.user_id = p10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.f21263f1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                iz.y();
                mediaController.f21271j1 = new File(piVar.f24552a);
                w7.z(4).mkdirs();
                File file = mediaController.f21271j1;
                Set set = z0.f26769a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.f26769a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.f21257d1 = true;
                    mediaController.f21273k1 = piVar.d;
                    mediaController.l1 = piVar.f24554c;
                    mediaController.f21295v1 = piVar.f24553b;
                    mediaController.f21293u1 = piVar.f24556f;
                    mediaController.f21275m1 = j3;
                    mediaController.f21279o1 = j10;
                    mediaController.f21281p1 = njVar;
                    ij ijVar2 = this.f26282n;
                    if (ijVar2 == null) {
                        c22 = 0;
                    } else {
                        c22 = ij.c2(mediaController.f21267h1, ijVar2.f23237k, false, false);
                    }
                    mediaController.n1 = c22;
                    mediaController.f21267h1 = i10;
                    mediaController.f21283q1 = ijVar;
                    mediaController.f21286r1 = ijVar2;
                    mediaController.f21289s1 = storyItem;
                    mediaController.f21291t1 = mediaController.f21291t1;
                    TLRPC.TL_document tL_document3 = mediaController.f21263f1;
                    File file2 = mediaController.f21271j1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    g0.h3(new mn(mediaController, file2, tL_document3, bArr, piVar, 5));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    mediaController.f21263f1 = null;
                    z0.b(mediaController.f21271j1);
                    mediaController.f21271j1.delete();
                    mediaController.f21271j1 = null;
                    try {
                        mediaController.f21260e1.release();
                        mediaController.f21260e1 = null;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    MediaController.j0(false);
                    g0.h3(new bi.ia(mediaController, i10, j3, 3));
                    return;
                }
            default:
                MediaController.b(this.f26278b, this.f26279c, this.d, this.f26280e, this.f26281f, this.h, this.f26282n, this.f26283r, this.f26284s, (hw) obj);
                return;
        }
    }

    public wd(MediaController mediaController, int i7, pi piVar, int i10, long j3, long j10, nj njVar, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem) {
        this.f26278b = mediaController;
        this.f26279c = i7;
        this.f26285w = piVar;
        this.d = i10;
        this.f26280e = j3;
        this.f26281f = j10;
        this.h = njVar;
        this.f26282n = ijVar;
        this.f26283r = ijVar2;
        this.f26284s = storyItem;
    }
}
