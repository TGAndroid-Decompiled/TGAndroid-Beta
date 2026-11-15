package ch;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.qc;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.jx;
public final class d {
    public static int f5043m;
    public g5 f5044a;
    public Rect f5045b;
    public ArrayList f5046c;
    public View d;
    public long f5047e;
    public boolean f5048f;
    public boolean f5049g;
    public int h;
    public boolean f5050i;
    public ImageReceiver f5051j;
    public int f5052k;
    public long f5053l;

    public static d a(g5 g5Var, boolean z10, boolean z11) {
        int i7 = m10.f24934t0;
        ?? obj = new Object();
        obj.f5045b = new Rect();
        obj.f5046c = new ArrayList();
        obj.f5049g = true;
        obj.f5052k = -1;
        obj.f5044a = g5Var;
        obj.f5048f = z10;
        obj.h = i7;
        obj.f5050i = z11;
        obj.f5047e = System.currentTimeMillis();
        if (z11 && qc.e(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            obj.f5051j = imageReceiver;
            if (z10) {
                imageReceiver.f22259b = true;
            }
        }
        return obj;
    }

    public final void b(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: ch.d.b(android.graphics.Canvas):void");
    }

    public final boolean c() {
        if (System.currentTimeMillis() - this.f5047e > 2500) {
            return true;
        }
        return false;
    }

    public final void d(View view) {
        this.f5044a.n(view);
        ImageReceiver imageReceiver = this.f5051j;
        if (imageReceiver != null) {
            imageReceiver.R();
            imageReceiver.f();
        }
    }

    public final void e(int i7, int i10, int i11, int i12) {
        Rect rect = this.f5045b;
        rect.set(i7, i10, i11, i12);
        ImageReceiver imageReceiver = this.f5051j;
        if (imageReceiver != null) {
            imageReceiver.z0(rect);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z12 = this.f5048f;
        int i7 = this.h;
        g5 g5Var = this.f5044a;
        g5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.f5051j;
        if (imageReceiver != null && this.f5050i) {
            imageReceiver.P();
            TLRPC.Document document2 = g5Var.f34804e;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            String V = gj.V(document2, null, null);
            if (V != null && (tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(i7).f26495r.get(V)) != null && (document = tL_availableReaction.around_animation) != null) {
                if (z12) {
                    StringBuilder sb2 = new StringBuilder();
                    int i10 = f5043m;
                    f5043m = i10 + 1;
                    imageReceiver.f22307w1 = a8.p0.n(i10, " ", sb2);
                    int f10 = jx.f();
                    TLRPC.Document document3 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.q0(gc.b(tL_availableReaction.around_animation), f10 + "_" + f10 + "_pcache_compress", null, null, document3, 0);
                } else {
                    gc b10 = gc.b(document);
                    String a10 = l0.a();
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
                String str = m10.i(i7).f24944e0;
                if (str != null && (tL_messages_stickerSet = si.b0(i7).p0(str)) == null) {
                    tL_messages_stickerSet = si.b0(i7).n0(str);
                }
                if (tL_messages_stickerSet != null) {
                    if (this.f5052k < 0) {
                        this.f5052k = Math.abs(((int) Utilities.f22415c.nextLong()) % tL_messages_stickerSet.documents.size());
                    }
                    if (z12) {
                        StringBuilder sb3 = new StringBuilder();
                        int i11 = f5043m;
                        f5043m = i11 + 1;
                        imageReceiver.f22307w1 = a8.p0.n(i11, " ", sb3);
                        int f11 = jx.f();
                        imageReceiver.q0(gc.b(tL_messages_stickerSet.documents.get(this.f5052k)), f11 + "_" + f11 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.f5052k), 0);
                    } else {
                        imageReceiver.q0(gc.b(tL_messages_stickerSet.documents.get(this.f5052k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.f5052k), 0);
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
            imageReceiver.w0(new ch0(2131623995, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null));
        }
    }
}
