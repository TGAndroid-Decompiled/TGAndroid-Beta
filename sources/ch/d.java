package ch;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.sc;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.i5;
import org.telegram.ui.kx;
public final class d {
    public static int f6214m;
    public i5 f6215a;
    public Rect f6216b;
    public ArrayList f6217c;
    public View d;
    public long f6218e;
    public boolean f6219f;
    public boolean f6220g;
    public int h;
    public boolean f6221i;
    public ImageReceiver f6222j;
    public int f6223k;
    public long f6224l;

    public static d a(i5 i5Var, boolean z9, boolean z10) {
        int i7 = p10.f24470s0;
        ?? obj = new Object();
        obj.f6216b = new Rect();
        obj.f6217c = new ArrayList();
        obj.f6220g = true;
        obj.f6223k = -1;
        obj.f6215a = i5Var;
        obj.f6219f = z9;
        obj.h = i7;
        obj.f6221i = z10;
        obj.f6218e = System.currentTimeMillis();
        if (z10 && sc.e(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            obj.f6222j = imageReceiver;
            if (z9) {
                imageReceiver.f21180b = true;
            }
        }
        return obj;
    }

    public final void b(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: ch.d.b(android.graphics.Canvas):void");
    }

    public final boolean c() {
        if (System.currentTimeMillis() - this.f6218e > 2500) {
            return true;
        }
        return false;
    }

    public final void d(View view) {
        this.f6215a.n(view);
        ImageReceiver imageReceiver = this.f6222j;
        if (imageReceiver != null) {
            imageReceiver.R();
            imageReceiver.f();
        }
    }

    public final void e(int i7, int i10, int i11, int i12) {
        Rect rect = this.f6216b;
        rect.set(i7, i10, i11, i12);
        ImageReceiver imageReceiver = this.f6222j;
        if (imageReceiver != null) {
            imageReceiver.z0(rect);
        }
    }

    public final void f(View view) {
        boolean z9;
        boolean z10;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z11 = this.f6219f;
        int i7 = this.h;
        i5 i5Var = this.f6215a;
        i5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.f6222j;
        if (imageReceiver != null && this.f6221i) {
            imageReceiver.P();
            TLRPC.Document document2 = i5Var.f34563e;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            String V = ij.V(document2, null, null);
            if (V != null && (tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i7).f25836r.get(V)) != null && (document = tL_availableReaction.around_animation) != null) {
                if (z11) {
                    StringBuilder sb2 = new StringBuilder();
                    int i10 = f6214m;
                    f6214m = i10 + 1;
                    imageReceiver.f21225v1 = a8.p0.n(i10, " ", sb2);
                    int f10 = kx.f();
                    TLRPC.Document document3 = tL_availableReaction.around_animation;
                    z9 = true;
                    imageReceiver.q0(hc.b(tL_availableReaction.around_animation), f10 + "_" + f10 + "_pcache_compress", null, null, document3, 0);
                } else {
                    hc b10 = hc.b(document);
                    String a10 = k0.a();
                    TLRPC.Document document4 = tL_availableReaction.around_animation;
                    z9 = true;
                    imageReceiver.q0(b10, a10, null, null, document4, 0);
                }
                z10 = z9;
            } else {
                z9 = true;
                z10 = false;
            }
            if (!z10) {
                String str = p10.i(i7).f24478d0;
                if (str != null && (tL_messages_stickerSet = ui.b0(i7).p0(str)) == null) {
                    tL_messages_stickerSet = ui.b0(i7).n0(str);
                }
                if (tL_messages_stickerSet != null) {
                    if (this.f6223k < 0) {
                        this.f6223k = Math.abs(((int) Utilities.f21335c.nextLong()) % tL_messages_stickerSet.documents.size());
                    }
                    if (z11) {
                        StringBuilder sb3 = new StringBuilder();
                        int i11 = f6214m;
                        f6214m = i11 + 1;
                        imageReceiver.f21225v1 = a8.p0.n(i11, " ", sb3);
                        int f11 = kx.f();
                        imageReceiver.q0(hc.b(tL_messages_stickerSet.documents.get(this.f6223k)), f11 + "_" + f11 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.f6223k), 0);
                    } else {
                        imageReceiver.q0(hc.b(tL_messages_stickerSet.documents.get(this.f6223k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.f6223k), 0);
                    }
                    z10 = z9;
                }
            }
            if (z10) {
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, z9);
                }
                imageReceiver.W(0);
                return;
            }
            imageReceiver.w0(new ah0(2131623994, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null));
        }
    }
}
