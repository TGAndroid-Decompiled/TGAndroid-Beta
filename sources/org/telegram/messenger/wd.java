package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class wd implements Runnable {
    public final int f26285a = 1;
    public final MediaController f26286b;
    public final int f26287c;
    public final int d;
    public final long f26288e;
    public final long f26289f;
    public final nj h;
    public final ij f26290n;
    public final ij f26291r;
    public final TL_stories.StoryItem f26292s;
    public final Object f26293w;

    public wd(MediaController mediaController, int i7, int i10, long j3, long j10, nj njVar, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem, hw hwVar) {
        this.f26286b = mediaController;
        this.f26287c = i7;
        this.d = i10;
        this.f26288e = j3;
        this.f26289f = j10;
        this.h = njVar;
        this.f26290n = ijVar;
        this.f26291r = ijVar2;
        this.f26292s = storyItem;
        this.f26293w = hwVar;
    }

    @Override
    public final void run() {
        long c22;
        String absolutePath;
        int i7 = this.f26285a;
        Object obj = this.f26293w;
        switch (i7) {
            case 0:
                pi piVar = (pi) obj;
                long j3 = this.f26288e;
                long j10 = this.f26289f;
                nj njVar = this.h;
                ij ijVar = this.f26291r;
                TL_stories.StoryItem storyItem = this.f26292s;
                MediaController.j0(true);
                MediaController mediaController = this.f26286b;
                mediaController.B1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f21263f1 = tL_document;
                mediaController.f21265g1 = this.f26287c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f26959id = piVar.f24563e;
                int i10 = this.d;
                tL_document.user_id = p10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.f21263f1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                iz.y();
                mediaController.f21271j1 = new File(piVar.f24560a);
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
                    mediaController.l1 = piVar.f24562c;
                    mediaController.f21295v1 = piVar.f24561b;
                    mediaController.f21293u1 = piVar.f24564f;
                    mediaController.f21275m1 = j3;
                    mediaController.f21279o1 = j10;
                    mediaController.f21281p1 = njVar;
                    ij ijVar2 = this.f26290n;
                    if (ijVar2 == null) {
                        c22 = 0;
                    } else {
                        c22 = ij.c2(mediaController.f21267h1, ijVar2.f23244k, false, false);
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
                MediaController.b(this.f26286b, this.f26287c, this.d, this.f26288e, this.f26289f, this.h, this.f26290n, this.f26291r, this.f26292s, (hw) obj);
                return;
        }
    }

    public wd(MediaController mediaController, int i7, pi piVar, int i10, long j3, long j10, nj njVar, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem) {
        this.f26286b = mediaController;
        this.f26287c = i7;
        this.f26293w = piVar;
        this.d = i10;
        this.f26288e = j3;
        this.f26289f = j10;
        this.h = njVar;
        this.f26290n = ijVar;
        this.f26291r = ijVar2;
        this.f26292s = storyItem;
    }
}
