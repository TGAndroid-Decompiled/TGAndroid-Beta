package org.telegram.messenger;

import java.io.File;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class rd implements Runnable {
    public final int f17715a = 1;
    public final MediaController f17716b;
    public final int f17717c;
    public final int d;
    public final long e;
    public final long f17718f;
    public final oj h;
    public final jj f17719n;
    public final jj f17720r;
    public final TL_stories.StoryItem f17721s;
    public final Object f17722w;

    public rd(MediaController mediaController, int i10, int i11, long j10, long j11, oj ojVar, jj jjVar, jj jjVar2, TL_stories.StoryItem storyItem, sw swVar) {
        this.f17716b = mediaController;
        this.f17717c = i10;
        this.d = i11;
        this.e = j10;
        this.f17718f = j11;
        this.h = ojVar;
        this.f17719n = jjVar;
        this.f17720r = jjVar2;
        this.f17721s = storyItem;
        this.f17722w = swVar;
    }

    @Override
    public final void run() {
        long c22;
        String absolutePath;
        int i10 = this.f17715a;
        Object obj = this.f17722w;
        switch (i10) {
            case 0:
                pi piVar = (pi) obj;
                long j10 = this.e;
                long j11 = this.f17718f;
                oj ojVar = this.h;
                jj jjVar = this.f17720r;
                TL_stories.StoryItem storyItem = this.f17721s;
                MediaController.j0(true);
                MediaController mediaController = this.f17716b;
                mediaController.A1 = 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.f14449e1 = tL_document;
                mediaController.f14452f1 = this.f17717c;
                tL_document.dc_id = Integer.MIN_VALUE;
                tL_document.f19799id = piVar.e;
                int i11 = this.d;
                tL_document.user_id = d20.i(i11).e();
                TLRPC.TL_document tL_document2 = mediaController.f14449e1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                tz.y();
                mediaController.f14458i1 = new File(piVar.f17441a);
                b8.z(4).mkdirs();
                File file = mediaController.f14458i1;
                Set set = c1.f14889a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    c1.f14889a.add(absolutePath);
                }
                byte[] bArr = null;
                try {
                    mediaController.f14445c1 = true;
                    mediaController.f14460j1 = piVar.d;
                    mediaController.f14462k1 = piVar.f17443c;
                    mediaController.f14483u1 = piVar.f17442b;
                    mediaController.f14481t1 = piVar.f17444f;
                    mediaController.l1 = j10;
                    mediaController.f14467n1 = j11;
                    mediaController.f14469o1 = ojVar;
                    jj jjVar2 = this.f17719n;
                    if (jjVar2 == null) {
                        c22 = 0;
                    } else {
                        c22 = jj.c2(mediaController.f14454g1, jjVar2.f16337k, false, false);
                    }
                    mediaController.f14464m1 = c22;
                    mediaController.f14454g1 = i11;
                    mediaController.f14471p1 = jjVar;
                    mediaController.f14473q1 = jjVar2;
                    mediaController.f14476r1 = storyItem;
                    mediaController.f14479s1 = mediaController.f14479s1;
                    TLRPC.TL_document tL_document3 = mediaController.f14449e1;
                    File file2 = mediaController.f14458i1;
                    if (file2.exists()) {
                        bArr = MediaController.getWaveform(file2.getAbsolutePath());
                    }
                    i0.g3(new cn(mediaController, file2, tL_document3, bArr, piVar, 5));
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    mediaController.f14449e1 = null;
                    c1.b(mediaController.f14458i1);
                    mediaController.f14458i1.delete();
                    mediaController.f14458i1 = null;
                    try {
                        mediaController.f14447d1.release();
                        mediaController.f14447d1 = null;
                    } catch (Exception e7) {
                        f8.g(e7, true);
                    }
                    MediaController.j0(false);
                    i0.g3(new dd(mediaController, i11, j10, 1));
                    return;
                }
            default:
                MediaController.b(this.f17716b, this.f17717c, this.d, this.e, this.f17718f, this.h, this.f17719n, this.f17720r, this.f17721s, (sw) obj);
                return;
        }
    }

    public rd(MediaController mediaController, int i10, pi piVar, int i11, long j10, long j11, oj ojVar, jj jjVar, jj jjVar2, TL_stories.StoryItem storyItem) {
        this.f17716b = mediaController;
        this.f17717c = i10;
        this.f17722w = piVar;
        this.d = i11;
        this.e = j10;
        this.f17718f = j11;
        this.h = ojVar;
        this.f17719n = jjVar;
        this.f17720r = jjVar2;
        this.f17721s = storyItem;
    }
}
