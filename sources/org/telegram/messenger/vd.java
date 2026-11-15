package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class vd implements Runnable {
    public final int f26959a = 1;
    public final MediaController f26960b;
    public final int f26961c;
    public final int d;
    public final long f26962e;
    public final long f26963f;
    public final lj h;
    public final gj f26964n;
    public final gj f26965r;
    public final TL_stories.StoryItem f26966s;
    public final Object f26967w;

    public vd(MediaController mediaController, int i7, int i10, long j3, long j10, lj ljVar, gj gjVar, gj gjVar2, TL_stories.StoryItem storyItem, fw fwVar) {
        this.f26960b = mediaController;
        this.f26961c = i7;
        this.d = i10;
        this.f26962e = j3;
        this.f26963f = j10;
        this.h = ljVar;
        this.f26964n = gjVar;
        this.f26965r = gjVar2;
        this.f26966s = storyItem;
        this.f26967w = fwVar;
    }

    @Override
    public final void run() {
        long b22;
        String absolutePath;
        int i7 = this.f26959a;
        Object obj = this.f26967w;
        switch (i7) {
            case 0:
                ni niVar = (ni) obj;
                long j3 = this.f26962e;
                long j10 = this.f26963f;
                lj ljVar = this.h;
                gj gjVar = this.f26965r;
                TL_stories.StoryItem storyItem = this.f26966s;
                MediaController.j0(true);
                MediaController mediaController = this.f26960b;
                mediaController.C1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f22348g1 = tL_document;
                mediaController.f22350h1 = this.f26961c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f28057id = niVar.f25199e;
                int i10 = this.d;
                tL_document.user_id = m10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.f22348g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                gz.y();
                mediaController.f22356k1 = new File(niVar.f25196a);
                w7.z(4).mkdirs();
                File file = mediaController.f22356k1;
                Set set = z0.f27858a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.f27858a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.f22343e1 = true;
                    mediaController.l1 = niVar.d;
                    mediaController.f22358m1 = niVar.f25198c;
                    mediaController.f22381w1 = niVar.f25197b;
                    mediaController.f22378v1 = niVar.f25200f;
                    mediaController.n1 = j3;
                    mediaController.f22364p1 = j10;
                    mediaController.f22366q1 = ljVar;
                    gj gjVar2 = this.f26964n;
                    if (gjVar2 == null) {
                        b22 = 0;
                    } else {
                        b22 = gj.b2(mediaController.f22352i1, gjVar2.f23817k, false, false);
                    }
                    mediaController.f22362o1 = b22;
                    mediaController.f22352i1 = i10;
                    mediaController.f22369r1 = gjVar;
                    mediaController.f22372s1 = gjVar2;
                    mediaController.f22374t1 = storyItem;
                    mediaController.f22376u1 = mediaController.f22376u1;
                    TLRPC.TL_document tL_document3 = mediaController.f22348g1;
                    File file2 = mediaController.f22356k1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    g0.h3(new jn(mediaController, file2, tL_document3, bArr, niVar, 5));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    mediaController.f22348g1 = null;
                    z0.b(mediaController.f22356k1);
                    mediaController.f22356k1.delete();
                    mediaController.f22356k1 = null;
                    try {
                        mediaController.f22346f1.release();
                        mediaController.f22346f1 = null;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    MediaController.j0(false);
                    g0.h3(new di.z8(mediaController, i10, j3, 3));
                    return;
                }
            default:
                MediaController.b(this.f26960b, this.f26961c, this.d, this.f26962e, this.f26963f, this.h, this.f26964n, this.f26965r, this.f26966s, (fw) obj);
                return;
        }
    }

    public vd(MediaController mediaController, int i7, ni niVar, int i10, long j3, long j10, lj ljVar, gj gjVar, gj gjVar2, TL_stories.StoryItem storyItem) {
        this.f26960b = mediaController;
        this.f26961c = i7;
        this.f26967w = niVar;
        this.d = i10;
        this.f26962e = j3;
        this.f26963f = j10;
        this.h = ljVar;
        this.f26964n = gjVar;
        this.f26965r = gjVar2;
        this.f26966s = storyItem;
    }
}
