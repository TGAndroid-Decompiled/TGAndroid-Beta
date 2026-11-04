package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pd implements Runnable {
    public final int f24726a = 1;
    public final MediaController f24727b;
    public final int f24728c;
    public final int d;
    public final long f24729e;
    public final long f24730f;
    public final ej h;
    public final zi f24731n;
    public final zi f24732r;
    public final TL_stories.StoryItem f24733s;
    public final Object f24734w;

    public pd(MediaController mediaController, int i3, int i10, long j10, long j11, ej ejVar, zi ziVar, zi ziVar2, TL_stories.StoryItem storyItem, zv zvVar) {
        this.f24727b = mediaController;
        this.f24728c = i3;
        this.d = i10;
        this.f24729e = j10;
        this.f24730f = j11;
        this.h = ejVar;
        this.f24731n = ziVar;
        this.f24732r = ziVar2;
        this.f24733s = storyItem;
        this.f24734w = zvVar;
    }

    @Override
    public final void run() {
        long c2;
        String absolutePath;
        int i3 = this.f24726a;
        Object obj = this.f24734w;
        switch (i3) {
            case 0:
                gi giVar = (gi) obj;
                long j10 = this.f24729e;
                long j11 = this.f24730f;
                ej ejVar = this.h;
                zi ziVar = this.f24732r;
                TL_stories.StoryItem storyItem = this.f24733s;
                MediaController.j0(true);
                MediaController mediaController = this.f24727b;
                mediaController.C1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f21319g1 = tL_document;
                mediaController.f21321h1 = this.f24728c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f27007id = giVar.f22726e;
                int i10 = this.d;
                tL_document.user_id = h10.i(i10).e();
                TLRPC.TL_document tL_document2 = mediaController.f21319g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                az.y();
                mediaController.k1 = new File(giVar.f22723a);
                w7.z(4).mkdirs();
                File file = mediaController.k1;
                Set set = z0.f26694a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    z0.f26694a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.f21314e1 = true;
                    mediaController.f21328l1 = giVar.d;
                    mediaController.m1 = giVar.f22725c;
                    mediaController.f21352w1 = giVar.f22724b;
                    mediaController.f21349v1 = giVar.f22727f;
                    mediaController.f21331n1 = j10;
                    mediaController.f21335p1 = j11;
                    mediaController.f21337q1 = ejVar;
                    zi ziVar2 = this.f24731n;
                    if (ziVar2 == null) {
                        c2 = 0;
                    } else {
                        c2 = zi.c2(mediaController.f21323i1, ziVar2.f26868k, false, false);
                    }
                    mediaController.f21333o1 = c2;
                    mediaController.f21323i1 = i10;
                    mediaController.f21340r1 = ziVar;
                    mediaController.f21343s1 = ziVar2;
                    mediaController.f21345t1 = storyItem;
                    mediaController.f21347u1 = mediaController.f21347u1;
                    TLRPC.TL_document tL_document3 = mediaController.f21319g1;
                    File file2 = mediaController.k1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    g0.h3(new cn(mediaController, file2, tL_document3, bArr, giVar, 5));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    mediaController.f21319g1 = null;
                    z0.b(mediaController.k1);
                    mediaController.k1.delete();
                    mediaController.k1 = null;
                    try {
                        mediaController.f21317f1.release();
                        mediaController.f21317f1 = null;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    MediaController.j0(false);
                    g0.h3(new ci.i9(mediaController, i10, j10, 3));
                    return;
                }
            default:
                MediaController.b(this.f24727b, this.f24728c, this.d, this.f24729e, this.f24730f, this.h, this.f24731n, this.f24732r, this.f24733s, (zv) obj);
                return;
        }
    }

    public pd(MediaController mediaController, int i3, gi giVar, int i10, long j10, long j11, ej ejVar, zi ziVar, zi ziVar2, TL_stories.StoryItem storyItem) {
        this.f24727b = mediaController;
        this.f24728c = i3;
        this.f24734w = giVar;
        this.d = i10;
        this.f24729e = j10;
        this.f24730f = j11;
        this.h = ejVar;
        this.f24731n = ziVar;
        this.f24732r = ziVar2;
        this.f24733s = storyItem;
    }
}
