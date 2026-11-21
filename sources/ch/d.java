package ch;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.pc;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.nx;
public final class d {
    public static int f5358m;
    public p5 f5359a;
    public Rect f5360b;
    public ArrayList f5361c;
    public View d;
    public long f5362e;
    public boolean f5363f;
    public boolean f5364g;
    public int h;
    public boolean f5365i;
    public ImageReceiver f5366j;
    public int f5367k;
    public long f5368l;

    public static d a(p5 p5Var, boolean z10, boolean z11) {
        int i7 = j10.f24798t0;
        ?? obj = new Object();
        obj.f5360b = new Rect();
        obj.f5361c = new ArrayList();
        obj.f5364g = true;
        obj.f5367k = -1;
        obj.f5359a = p5Var;
        obj.f5363f = z10;
        obj.h = i7;
        obj.f5365i = z11;
        obj.f5362e = System.currentTimeMillis();
        if (z11 && pc.e(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            obj.f5366j = imageReceiver;
            if (z10) {
                imageReceiver.f22650b = true;
            }
        }
        return obj;
    }

    public final void b(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: ch.d.b(android.graphics.Canvas):void");
    }

    public final boolean c() {
        if (System.currentTimeMillis() - this.f5362e > 2500) {
            return true;
        }
        return false;
    }

    public final void d(View view) {
        this.f5359a.n(view);
        ImageReceiver imageReceiver = this.f5366j;
        if (imageReceiver != null) {
            imageReceiver.R();
            imageReceiver.f();
        }
    }

    public final void e(int i7, int i10, int i11, int i12) {
        Rect rect = this.f5360b;
        rect.set(i7, i10, i11, i12);
        ImageReceiver imageReceiver = this.f5366j;
        if (imageReceiver != null) {
            imageReceiver.z0(rect);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z12 = this.f5363f;
        int i7 = this.h;
        p5 p5Var = this.f5359a;
        p5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.f5366j;
        if (imageReceiver != null && this.f5365i) {
            imageReceiver.P();
            TLRPC.Document document2 = p5Var.f38496e;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            String V = fj.V(document2, null, null);
            if (V != null && (tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(i7).f26661r.get(V)) != null && (document = tL_availableReaction.around_animation) != null) {
                if (z12) {
                    StringBuilder sb2 = new StringBuilder();
                    int i10 = f5358m;
                    f5358m = i10 + 1;
                    imageReceiver.f22698w1 = a8.p0.n(i10, " ", sb2);
                    int f10 = nx.f();
                    TLRPC.Document document3 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.q0(fc.b(tL_availableReaction.around_animation), f10 + "_" + f10 + "_pcache_compress", null, null, document3, 0);
                } else {
                    fc b10 = fc.b(document);
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
                String str = j10.i(i7).f24808e0;
                if (str != null && (tL_messages_stickerSet = ri.d0(i7).r0(str)) == null) {
                    tL_messages_stickerSet = ri.d0(i7).p0(str);
                }
                if (tL_messages_stickerSet != null) {
                    if (this.f5367k < 0) {
                        this.f5367k = Math.abs(((int) Utilities.f22806c.nextLong()) % tL_messages_stickerSet.documents.size());
                    }
                    if (z12) {
                        StringBuilder sb3 = new StringBuilder();
                        int i11 = f5358m;
                        f5358m = i11 + 1;
                        imageReceiver.f22698w1 = a8.p0.n(i11, " ", sb3);
                        int f11 = nx.f();
                        imageReceiver.q0(fc.b(tL_messages_stickerSet.documents.get(this.f5367k)), f11 + "_" + f11 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.f5367k), 0);
                    } else {
                        imageReceiver.q0(fc.b(tL_messages_stickerSet.documents.get(this.f5367k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.f5367k), 0);
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
            imageReceiver.w0(new oh0(2131623995, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null));
        }
    }
}
