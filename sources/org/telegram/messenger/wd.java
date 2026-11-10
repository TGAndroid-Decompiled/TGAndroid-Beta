package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class wd implements Runnable {
    public final int f26292a = 1;
    public final MediaController f26293b;
    public final int f26294c;
    public final int d;
    public final long f26295e;
    public final long f26296f;
    public final nj h;
    public final ij f26297n;
    public final ij f26298r;
    public final TL_stories.StoryItem f26299s;
    public final Object f26300w;

    public wd(MediaController mediaController, int i7, int i10, long j3, long j10, nj njVar, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem, hw hwVar) {
        this.f26293b = mediaController;
        this.f26294c = i7;
        this.d = i10;
        this.f26295e = j3;
        this.f26296f = j10;
        this.h = njVar;
        this.f26297n = ijVar;
        this.f26298r = ijVar2;
        this.f26299s = storyItem;
        this.f26300w = hwVar;
    }

    @Override
    public final void run() {
        long b22;
        String absolutePath;
        int i7 = this.f26292a;
        Object obj = this.f26300w;
        switch (i7) {
            case 0:
                pi piVar = (pi) obj;
                long j3 = this.f26295e;
                long j10 = this.f26296f;
                nj njVar = this.h;
                ij ijVar = this.f26298r;
                TL_stories.StoryItem storyItem = this.f26299s;
                MediaController.j0(true);
                MediaController mediaController = this.f26293b;
                mediaController.B1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f21271f1 = tL_document;
                mediaController.f21273g1 = this.f26294c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f26966id = piVar.f24574e;
                int i10 = this.d;
                tL_document.user_id = p10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.f21271f1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                iz.y();
                mediaController.f21279j1 = new File(piVar.f24571a);
                w7.z(4).mkdirs();
                File file = mediaController.f21279j1;
                Set set = z0.f26794a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.f26794a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.f21265d1 = true;
                    mediaController.f21281k1 = piVar.d;
                    mediaController.l1 = piVar.f24573c;
                    mediaController.f21303v1 = piVar.f24572b;
                    mediaController.f21301u1 = piVar.f24575f;
                    mediaController.f21283m1 = j3;
                    mediaController.f21287o1 = j10;
                    mediaController.f21289p1 = njVar;
                    ij ijVar2 = this.f26297n;
                    if (ijVar2 == null) {
                        b22 = 0;
                    } else {
                        b22 = ij.b2(mediaController.f21275h1, ijVar2.f23266k, false, false);
                    }
                    mediaController.n1 = b22;
                    mediaController.f21275h1 = i10;
                    mediaController.f21291q1 = ijVar;
                    mediaController.f21294r1 = ijVar2;
                    mediaController.f21297s1 = storyItem;
                    mediaController.f21299t1 = mediaController.f21299t1;
                    TLRPC.TL_document tL_document3 = mediaController.f21271f1;
                    File file2 = mediaController.f21279j1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    g0.h3(new mn(mediaController, file2, tL_document3, bArr, piVar, 5));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    mediaController.f21271f1 = null;
                    z0.b(mediaController.f21279j1);
                    mediaController.f21279j1.delete();
                    mediaController.f21279j1 = null;
                    try {
                        mediaController.f21268e1.release();
                        mediaController.f21268e1 = null;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    MediaController.j0(false);
                    g0.h3(new bi.ia(mediaController, i10, j3, 3));
                    return;
                }
            default:
                MediaController.b(this.f26293b, this.f26294c, this.d, this.f26295e, this.f26296f, this.h, this.f26297n, this.f26298r, this.f26299s, (hw) obj);
                return;
        }
    }

    public wd(MediaController mediaController, int i7, pi piVar, int i10, long j3, long j10, nj njVar, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem) {
        this.f26293b = mediaController;
        this.f26294c = i7;
        this.f26300w = piVar;
        this.d = i10;
        this.f26295e = j3;
        this.f26296f = j10;
        this.h = njVar;
        this.f26297n = ijVar;
        this.f26298r = ijVar2;
        this.f26299s = storyItem;
    }
}
