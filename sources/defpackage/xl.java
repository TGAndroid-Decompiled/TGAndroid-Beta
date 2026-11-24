package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class xl {
    public static int m;
    public vl a;
    public Rect b;
    public ArrayList c;
    public View d;
    public long e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public ImageReceiver j;
    public int k;
    public long l;

    public static xl a(vl vlVar, boolean z, boolean z2) {
        int i = y6c.t0;
        ?? obj = new Object();
        obj.b = new Rect();
        obj.c = new ArrayList();
        obj.g = true;
        obj.k = -1;
        obj.a = vlVar;
        obj.f = z;
        obj.h = i;
        obj.i = z2;
        obj.e = System.currentTimeMillis();
        if (z2 && e66.e(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            obj.j = imageReceiver;
            if (z) {
                imageReceiver.b = true;
            }
        }
        return obj;
    }

    public final void b(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xl.b(android.graphics.Canvas):void");
    }

    public final boolean c() {
        if (System.currentTimeMillis() - this.e > 2500) {
            return true;
        }
        return false;
    }

    public final void d(View view) {
        this.a.o(view);
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver != null) {
            imageReceiver.K();
            imageReceiver.f();
        }
    }

    public final void e(int i, int i2, int i3, int i4) {
        Rect rect = this.b;
        rect.set(i, i2, i3, i4);
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver != null) {
            imageReceiver.j0(rect);
        }
    }

    public final void f(View view) {
        boolean z;
        boolean z2;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z3 = this.f;
        int i = this.h;
        vl vlVar = this.a;
        vlVar.b(view);
        this.d = view;
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver != null && this.i) {
            imageReceiver.I();
            TLRPC.Document document2 = vlVar.e;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            String V = k27.V(document2, null, null);
            if (V != null && (tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(i).r.get(V)) != null && (document = tL_availableReaction.around_animation) != null) {
                if (z3) {
                    StringBuilder sb = new StringBuilder();
                    int i2 = m;
                    m = i2 + 1;
                    imageReceiver.w1 = de9.l(sb, i2, " ");
                    int f = zu3.f();
                    TLRPC.Document document3 = tL_availableReaction.around_animation;
                    z = true;
                    imageReceiver.d0(gl5.b(tL_availableReaction.around_animation), f + "_" + f + "_pcache_compress", null, null, document3, 0);
                } else {
                    gl5 b = gl5.b(document);
                    String a = d19.a();
                    TLRPC.Document document4 = tL_availableReaction.around_animation;
                    z = true;
                    imageReceiver.d0(b, a, null, null, document4, 0);
                }
                z2 = z;
            } else {
                z = true;
                z2 = false;
            }
            if (!z2) {
                String str = y6c.h(i).e0;
                if (str != null && (tL_messages_stickerSet = hq6.d0(i).q0(str)) == null) {
                    tL_messages_stickerSet = hq6.d0(i).o0(str);
                }
                if (tL_messages_stickerSet != null) {
                    int i3 = this.k;
                    if (i3 < 0) {
                        i3 = Math.abs(((int) Utilities.c.nextLong()) % tL_messages_stickerSet.documents.size());
                        this.k = i3;
                    }
                    if (z3) {
                        StringBuilder sb2 = new StringBuilder();
                        int i4 = m;
                        m = i4 + 1;
                        imageReceiver.w1 = de9.l(sb2, i4, " ");
                        int f2 = zu3.f();
                        imageReceiver.d0(gl5.b(tL_messages_stickerSet.documents.get(this.k)), f2 + "_" + f2 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                    } else {
                        imageReceiver.d0(gl5.b(tL_messages_stickerSet.documents.get(i3)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                    }
                    z2 = z;
                }
            }
            if (z2) {
                if (imageReceiver.y() != null) {
                    imageReceiver.y().I(0, false, z);
                }
                imageReceiver.M(0);
                return;
            }
            imageReceiver.g0(new oy8(2131623995, gl.L(60.0f), gl.L(60.0f), false, null));
        }
    }
}
