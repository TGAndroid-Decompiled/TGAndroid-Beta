package ch;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.pc;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.mx;
public final class d {
    public static int f5324m;
    public o5 f5325a;
    public Rect f5326b;
    public ArrayList f5327c;
    public View d;
    public long f5328e;
    public boolean f5329f;
    public boolean f5330g;
    public int h;
    public boolean f5331i;
    public ImageReceiver f5332j;
    public int f5333k;
    public long f5334l;

    public static d a(o5 o5Var, boolean z10, boolean z11) {
        int i7 = i10.f24637t0;
        ?? obj = new Object();
        obj.f5326b = new Rect();
        obj.f5327c = new ArrayList();
        obj.f5330g = true;
        obj.f5333k = -1;
        obj.f5325a = o5Var;
        obj.f5329f = z10;
        obj.h = i7;
        obj.f5331i = z11;
        obj.f5328e = System.currentTimeMillis();
        if (z11 && pc.e(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            obj.f5332j = imageReceiver;
            if (z10) {
                imageReceiver.f22720b = true;
            }
        }
        return obj;
    }

    public final void b(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: ch.d.b(android.graphics.Canvas):void");
    }

    public final boolean c() {
        if (System.currentTimeMillis() - this.f5328e > 2500) {
            return true;
        }
        return false;
    }

    public final void d(View view) {
        this.f5325a.n(view);
        ImageReceiver imageReceiver = this.f5332j;
        if (imageReceiver != null) {
            imageReceiver.S();
            imageReceiver.f();
        }
    }

    public final void e(int i7, int i10, int i11, int i12) {
        Rect rect = this.f5326b;
        rect.set(i7, i10, i11, i12);
        ImageReceiver imageReceiver = this.f5332j;
        if (imageReceiver != null) {
            imageReceiver.A0(rect);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z12 = this.f5329f;
        int i7 = this.h;
        o5 o5Var = this.f5325a;
        o5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.f5332j;
        if (imageReceiver != null && this.f5331i) {
            imageReceiver.Q();
            TLRPC.Document document2 = o5Var.f38023e;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            String V = fj.V(document2, null, null);
            if (V != null && (tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(i7).f26734r.get(V)) != null && (document = tL_availableReaction.around_animation) != null) {
                if (z12) {
                    StringBuilder sb2 = new StringBuilder();
                    int i10 = f5324m;
                    f5324m = i10 + 1;
                    imageReceiver.f22768w1 = a8.p0.n(i10, " ", sb2);
                    int f10 = mx.f();
                    TLRPC.Document document3 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.r0(fc.b(tL_availableReaction.around_animation), f10 + "_" + f10 + "_pcache_compress", null, null, document3, 0);
                } else {
                    fc b10 = fc.b(document);
                    String a10 = l0.a();
                    TLRPC.Document document4 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.r0(b10, a10, null, null, document4, 0);
                }
                z11 = z10;
            } else {
                z10 = true;
                z11 = false;
            }
            if (!z11) {
                String str = i10.i(i7).f24647e0;
                if (str != null && (tL_messages_stickerSet = ri.d0(i7).r0(str)) == null) {
                    tL_messages_stickerSet = ri.d0(i7).p0(str);
                }
                if (tL_messages_stickerSet != null) {
                    if (this.f5333k < 0) {
                        this.f5333k = Math.abs(((int) Utilities.f22876c.nextLong()) % tL_messages_stickerSet.documents.size());
                    }
                    if (z12) {
                        StringBuilder sb3 = new StringBuilder();
                        int i11 = f5324m;
                        f5324m = i11 + 1;
                        imageReceiver.f22768w1 = a8.p0.n(i11, " ", sb3);
                        int f11 = mx.f();
                        imageReceiver.r0(fc.b(tL_messages_stickerSet.documents.get(this.f5333k)), f11 + "_" + f11 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.f5333k), 0);
                    } else {
                        imageReceiver.r0(fc.b(tL_messages_stickerSet.documents.get(this.f5333k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.f5333k), 0);
                    }
                    z11 = z10;
                }
            }
            if (z11) {
                if (imageReceiver.C() != null) {
                    imageReceiver.C().N(0, false, z10);
                }
                imageReceiver.X(0);
                return;
            }
            imageReceiver.x0(new nh0(2131623995, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null));
        }
    }
}
