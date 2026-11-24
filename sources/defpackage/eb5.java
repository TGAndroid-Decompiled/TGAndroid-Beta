package defpackage;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class eb5 implements sp3 {
    public boolean E;
    public TLRPC.MessageExtendedMedia F;
    public String G;
    public final RadialProgress2 H;
    public int I;
    public final int J;
    public final int K;
    public int L;
    public tgb M;
    public boolean N;
    public int a;
    public int b;
    public int c;
    public int d;
    public final gb2 e;
    public final ImageReceiver f;
    public boolean h;
    public final int n;
    public final int r;
    public final float[] s = new float[8];
    public String w;
    public final boolean x;
    public final boolean y;

    public eb5(gb2 gb2Var, k27 k27Var, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z, int i, int i2) {
        int i3;
        boolean z2;
        this.I = 4;
        this.K = 0;
        this.L = 0;
        this.e = gb2Var;
        this.x = z;
        this.y = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && k27.J4(messageMedia.document)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.y = z2;
            i3 = (int) Math.max(1L, Math.round(k27.H0(messageMedia.document)));
            this.K = i3;
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            if ((tL_messageExtendedMediaPreview.flags & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.y = z2;
            i3 = tL_messageExtendedMediaPreview.video_duration;
            this.K = i3;
        } else {
            i3 = 0;
            z2 = false;
        }
        if (z2) {
            this.L = i3;
            this.M = new tgb(gl.g0(i3, true, false), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(gb2Var);
        this.f = imageReceiver;
        imageReceiver.p1 = null;
        this.n = i;
        this.r = i2;
        this.J = up3.q(gb2Var.a6).k();
        c(messageExtendedMedia, k27Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(gb2Var, gb2Var.getResourcesProvider());
        this.H = radialProgress2;
        int a = a();
        this.I = a;
        radialProgress2.setIcon(a, false, false);
    }

    public final int a() {
        if (this.y && !this.E) {
            return 0;
        }
        return 4;
    }

    public final void b(int i) {
        if (i != this.I) {
            this.I = i;
            this.H.setIcon(i, true, true);
        }
    }

    public final void c(org.telegram.tgnet.TLRPC.MessageExtendedMedia r14, defpackage.k27 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb5.c(org.telegram.tgnet.TLRPC$MessageExtendedMedia, k27):void");
    }

    @Override
    public final int getObserverTag() {
        return this.J;
    }

    @Override
    public final void i(long j, long j2) {
        float min;
        int a;
        if (j2 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j) / ((float) j2));
        }
        this.F.downloadProgress = min;
        this.H.o(true, min);
        if (min < 1.0f) {
            a = 3;
        } else {
            a = a();
        }
        b(a);
        this.e.invalidate();
    }

    @Override
    public final void l(long j, long j2) {
        float min;
        int a;
        if (j2 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j) / ((float) j2));
        }
        this.F.uploadProgress = min;
        this.H.o(true, min);
        if (min < 1.0f) {
            a = 3;
        } else if (this.x) {
            a = 6;
        } else {
            a = a();
        }
        b(a);
        this.e.invalidate();
    }

    @Override
    public final void B(boolean z) {
    }

    @Override
    public final void N(String str) {
    }
}
