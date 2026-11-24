package defpackage;

import java.io.File;
import java.util.Set;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class an6 implements Runnable {
    public final byte a = 1;
    public final MediaController b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final v67 h;
    public final k47 n;
    public final k47 r;
    public final TL_stories.StoryItem s;
    public final Object w;

    public an6(MediaController mediaController, int i, int i2, long j, long j2, v67 v67Var, k47 k47Var, k47 k47Var2, TL_stories.StoryItem storyItem, l3a l3aVar) {
        this.b = mediaController;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.h = v67Var;
        this.n = k47Var;
        this.r = k47Var2;
        this.s = storyItem;
        this.w = l3aVar;
    }

    @Override
    public final void run() {
        long b2;
        String absolutePath;
        byte b = this.a;
        Object obj = this.w;
        switch (b) {
            case 0:
                cs6 cs6Var = (cs6) obj;
                long j = this.e;
                long j2 = this.f;
                v67 v67Var = this.h;
                k47 k47Var = this.r;
                TL_stories.StoryItem storyItem = this.s;
                MediaController.i0(true);
                MediaController mediaController = this.b;
                mediaController.C1 = (byte) 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.g1 = tL_document;
                mediaController.h1 = this.c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.id = cs6Var.e;
                int i = this.d;
                tL_document.user_id = z8c.h(i).e();
                TLRPC.TL_document tL_document2 = mediaController.g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                gda.x();
                mediaController.k1 = new File(cs6Var.a);
                bc4.z(4).mkdirs();
                File file = mediaController.k1;
                Set set = s70.a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    s70.a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.e1 = true;
                    mediaController.l1 = cs6Var.d;
                    mediaController.m1 = cs6Var.c;
                    mediaController.w1 = cs6Var.b;
                    mediaController.v1 = cs6Var.f;
                    mediaController.n1 = j;
                    mediaController.p1 = j2;
                    mediaController.q1 = v67Var;
                    k47 k47Var2 = this.n;
                    if (k47Var2 == null) {
                        b2 = 0;
                    } else {
                        b2 = k47.b2(mediaController.i1, k47Var2.k, false, false);
                    }
                    mediaController.o1 = b2;
                    mediaController.i1 = i;
                    mediaController.r1 = k47Var;
                    mediaController.s1 = k47Var2;
                    mediaController.t1 = storyItem;
                    mediaController.u1 = mediaController.u1;
                    TLRPC.TL_document tL_document3 = mediaController.g1;
                    File file2 = mediaController.k1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    gm.c3(new v15(mediaController, file2, tL_document3, bArr, cs6Var, (byte) 19));
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    mediaController.g1 = null;
                    s70.b(mediaController.k1);
                    mediaController.k1.delete();
                    mediaController.k1 = null;
                    try {
                        mediaController.f1.release();
                        mediaController.f1 = null;
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                    MediaController.i0(false);
                    gm.c3(new gc2(mediaController, i, j, (byte) 2));
                    return;
                }
            default:
                String[] strArr = MediaController.W1;
                this.b.J(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, (l3a) obj);
                return;
        }
    }

    public an6(MediaController mediaController, int i, cs6 cs6Var, int i2, long j, long j2, v67 v67Var, k47 k47Var, k47 k47Var2, TL_stories.StoryItem storyItem) {
        this.b = mediaController;
        this.c = i;
        this.w = cs6Var;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.h = v67Var;
        this.n = k47Var;
        this.r = k47Var2;
        this.s = storyItem;
    }
}
