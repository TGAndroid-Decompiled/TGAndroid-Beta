package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class vd implements Runnable {
    public final int f27345a = 1;
    public final MediaController f27346b;
    public final int f27347c;
    public final int d;
    public final long f27348e;
    public final long f27349f;
    public final lj h;
    public final gj f27350n;
    public final gj f27351r;
    public final TL_stories.StoryItem f27352s;
    public final Object f27353w;

    public vd(MediaController mediaController, int i7, int i10, long j3, long j10, lj ljVar, gj gjVar, gj gjVar2, TL_stories.StoryItem storyItem, cw cwVar) {
        this.f27346b = mediaController;
        this.f27347c = i7;
        this.d = i10;
        this.f27348e = j3;
        this.f27349f = j10;
        this.h = ljVar;
        this.f27350n = gjVar;
        this.f27351r = gjVar2;
        this.f27352s = storyItem;
        this.f27353w = cwVar;
    }

    @Override
    public final void run() {
        long b22;
        String absolutePath;
        int i7 = this.f27345a;
        Object obj = this.f27353w;
        switch (i7) {
            case 0:
                ni niVar = (ni) obj;
                long j3 = this.f27348e;
                long j10 = this.f27349f;
                lj ljVar = this.h;
                gj gjVar = this.f27351r;
                TL_stories.StoryItem storyItem = this.f27352s;
                MediaController.j0(true);
                MediaController mediaController = this.f27346b;
                mediaController.C1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f22742g1 = tL_document;
                mediaController.f22744h1 = this.f27347c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f28440id = niVar.f25770e;
                int i10 = this.d;
                tL_document.user_id = k10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.f22742g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                cz.y();
                mediaController.f22750k1 = new File(niVar.f25767a);
                w7.z(4).mkdirs();
                File file = mediaController.f22750k1;
                Set set = z0.f28275a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.f28275a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.f22737e1 = true;
                    mediaController.l1 = niVar.d;
                    mediaController.f22752m1 = niVar.f25769c;
                    mediaController.f22775w1 = niVar.f25768b;
                    mediaController.f22772v1 = niVar.f25771f;
                    mediaController.n1 = j3;
                    mediaController.f22758p1 = j10;
                    mediaController.f22760q1 = ljVar;
                    gj gjVar2 = this.f27350n;
                    if (gjVar2 == null) {
                        b22 = 0;
                    } else {
                        b22 = gj.b2(mediaController.f22746i1, gjVar2.f24213k, false, false);
                    }
                    mediaController.f22756o1 = b22;
                    mediaController.f22746i1 = i10;
                    mediaController.f22763r1 = gjVar;
                    mediaController.f22766s1 = gjVar2;
                    mediaController.f22768t1 = storyItem;
                    mediaController.f22770u1 = mediaController.f22770u1;
                    TLRPC.TL_document tL_document3 = mediaController.f22742g1;
                    File file2 = mediaController.f22750k1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    g0.g3(new gn(mediaController, file2, tL_document3, bArr, niVar, 5));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    mediaController.f22742g1 = null;
                    z0.b(mediaController.f22750k1);
                    mediaController.f22750k1.delete();
                    mediaController.f22750k1 = null;
                    try {
                        mediaController.f22740f1.release();
                        mediaController.f22740f1 = null;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    MediaController.j0(false);
                    g0.g3(new di.c9(mediaController, i10, j3, 3));
                    return;
                }
            default:
                MediaController.b(this.f27346b, this.f27347c, this.d, this.f27348e, this.f27349f, this.h, this.f27350n, this.f27351r, this.f27352s, (cw) obj);
                return;
        }
    }

    public vd(MediaController mediaController, int i7, ni niVar, int i10, long j3, long j10, lj ljVar, gj gjVar, gj gjVar2, TL_stories.StoryItem storyItem) {
        this.f27346b = mediaController;
        this.f27347c = i7;
        this.f27353w = niVar;
        this.d = i10;
        this.f27348e = j3;
        this.f27349f = j10;
        this.h = ljVar;
        this.f27350n = gjVar;
        this.f27351r = gjVar2;
        this.f27352s = storyItem;
    }
}
