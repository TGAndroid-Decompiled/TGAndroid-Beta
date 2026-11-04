package dh;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.h10;
import org.telegram.messenger.lc;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.fx;
public final class d {
    public static int f8971m;
    public g5 f8972a;
    public Rect f8973b;
    public ArrayList f8974c;
    public View d;
    public long f8975e;
    public boolean f8976f;
    public boolean f8977g;
    public int h;
    public boolean f8978i;
    public ImageReceiver f8979j;
    public int f8980k;
    public long f8981l;

    public static d a(g5 g5Var, boolean z10, boolean z11) {
        int i3 = h10.f22829t0;
        ?? obj = new Object();
        obj.f8973b = new Rect();
        obj.f8974c = new ArrayList();
        obj.f8977g = true;
        obj.f8980k = -1;
        obj.f8972a = g5Var;
        obj.f8976f = z10;
        obj.h = i3;
        obj.f8978i = z11;
        obj.f8975e = System.currentTimeMillis();
        if (z11 && lc.e(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            obj.f8979j = imageReceiver;
            if (z10) {
                imageReceiver.f21230b = true;
            }
        }
        return obj;
    }

    public final void b(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: dh.d.b(android.graphics.Canvas):void");
    }

    public final boolean c() {
        if (System.currentTimeMillis() - this.f8975e > 2500) {
            return true;
        }
        return false;
    }

    public final void d(View view) {
        this.f8972a.n(view);
        ImageReceiver imageReceiver = this.f8979j;
        if (imageReceiver != null) {
            imageReceiver.R();
            imageReceiver.f();
        }
    }

    public final void e(int i3, int i10, int i11, int i12) {
        Rect rect = this.f8973b;
        rect.set(i3, i10, i11, i12);
        ImageReceiver imageReceiver = this.f8979j;
        if (imageReceiver != null) {
            imageReceiver.z0(rect);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z12 = this.f8976f;
        int i3 = this.h;
        g5 g5Var = this.f8972a;
        g5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.f8979j;
        if (imageReceiver != null && this.f8978i) {
            imageReceiver.P();
            TLRPC.Document document2 = g5Var.f33966e;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            String V = zi.V(document2, null, null);
            if (V != null && (tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(i3).f24045r.get(V)) != null && (document = tL_availableReaction.around_animation) != null) {
                if (z12) {
                    StringBuilder sb2 = new StringBuilder();
                    int i10 = f8971m;
                    f8971m = i10 + 1;
                    imageReceiver.f21278w1 = a1.g.o(i10, " ", sb2);
                    int f10 = fx.f();
                    TLRPC.Document document3 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.q0(ac.b(tL_availableReaction.around_animation), f10 + "_" + f10 + "_pcache_compress", null, null, document3, 0);
                } else {
                    ac b10 = ac.b(document);
                    String a10 = j0.a();
                    TLRPC.Document document4 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.q0(b10, a10, null, null, document4, 0);
                }
                z11 = z10;
            } else {
                z10 = true;
                z11 = false;
            }
            if (!z11) {
                String str = h10.i(i3).f22839e0;
                if (str != null && (tL_messages_stickerSet = li.b0(i3).p0(str)) == null) {
                    tL_messages_stickerSet = li.b0(i3).n0(str);
                }
                if (tL_messages_stickerSet != null) {
                    if (this.f8980k < 0) {
                        this.f8980k = Math.abs(((int) Utilities.f21386c.nextLong()) % tL_messages_stickerSet.documents.size());
                    }
                    if (z12) {
                        StringBuilder sb3 = new StringBuilder();
                        int i11 = f8971m;
                        f8971m = i11 + 1;
                        imageReceiver.f21278w1 = a1.g.o(i11, " ", sb3);
                        int f11 = fx.f();
                        imageReceiver.q0(ac.b(tL_messages_stickerSet.documents.get(this.f8980k)), f11 + "_" + f11 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.f8980k), 0);
                    } else {
                        imageReceiver.q0(ac.b(tL_messages_stickerSet.documents.get(this.f8980k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.f8980k), 0);
                    }
                    z11 = z10;
                }
            }
            if (z11) {
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, z10);
                }
                imageReceiver.W(0);
                return;
            }
            imageReceiver.w0(new ch0(2131623994, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null));
        }
    }
}
