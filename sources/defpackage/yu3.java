package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.ffmpeg.FfmpegAudioDecoder;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.WriteToSocketDelegate;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.FiltersSetupActivity;
public final class yu3 implements ee, v49, m7, oac, x76, zx7, ma3, WriteToSocketDelegate, k8, c59, OnTokenCanceledListener, lj0, i99, h59, OnSuccessListener, qq7, g94, py4 {
    public final byte a;
    public final Object b;

    public yu3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        ((fw4) this.b).q1.j(wzcVar);
        return wzc.b;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        ((gw4) this.b).invalidateSelf();
    }

    @Override
    public final void a(by7 by7Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
        ArrayList arrayList = ExternalActionActivity.y;
        gda.B = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s ? 1 : 0);
            externalActionActivity.h = null;
        }
        externalActionActivity.c.e0();
        if (gm.O1()) {
            externalActionActivity.d.e0();
        }
        nm7.e().k(nm7.o0, by7Var);
    }

    @Override
    public final void b(na3 na3Var) {
        ((FfmpegAudioDecoder) this.b).o((SimpleDecoderOutputBuffer) na3Var);
    }

    @Override
    public final long c(long j) {
        gk4 gk4Var = (gk4) this.b;
        return hac.j((j * gk4Var.e) / 1000000, 0L, gk4Var.j - 1);
    }

    @Override
    public final void e() {
        ((uw3) this.b).invalidate();
    }

    @Override
    public final boolean g(int i, View view) {
        tt4 tt4Var = (tt4) this.b;
        ArrayList arrayList = tt4Var.c0;
        ArrayList arrayList2 = tt4Var.i0;
        if (i >= 2 && tt4Var.a0 != null && (view instanceof pt4)) {
            int i2 = i - 2;
            if (tt4Var.d0) {
                if (i2 != 0) {
                    i2 = i - 3;
                } else {
                    return false;
                }
            } else if (tt4Var.e0) {
                if (i2 < 0 || i2 >= arrayList.size()) {
                    i2 -= arrayList.size();
                } else {
                    return false;
                }
            }
            if (i2 >= 0 && i2 < tt4Var.g0.size()) {
                jo6 jo6Var = (jo6) tt4Var.g0.get(i2);
                if (arrayList2.isEmpty() && !tt4Var.R) {
                    if (arrayList2.contains(jo6Var)) {
                        arrayList2.remove(jo6Var);
                    } else if (arrayList2.size() + 1 > tt4Var.S) {
                        int i3 = -tt4Var.O;
                        tt4Var.O = i3;
                        gm.A3(i3, view, null);
                        xx0.APP_ERROR.a();
                        return true;
                    } else {
                        arrayList2.add(jo6Var);
                    }
                    gm.V3(tt4Var.d);
                    tt4Var.j();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void h(int i) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        az3 az3Var = (az3) this.b;
        Pattern pattern = az3.P1;
        d dVar = az3Var.m1;
        my3 my3Var = az3Var.o1;
        if (my3Var != null && (arrayList = my3Var.b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) my3Var.b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + oc7.r1(az3Var.a).N2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + oc7.r1(az3Var.a).N2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i == 1) {
                if (dVar != null) {
                    context = dVar.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = az3Var.getContext();
                }
                py3 py3Var = new py3(az3Var, context, str2, str2, az3Var.J0);
                if (dVar != null) {
                    dVar.showDialog(py3Var);
                } else {
                    py3Var.show();
                }
            } else if (i == 2) {
                try {
                    gm.g(str2);
                    new c41((FrameLayout) az3Var.b, az3Var.J0).k(false).j();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
    }

    @Override
    public final int i() {
        return cmb.v0(cmb.Z6, ((yw4) this.b).J0);
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                ((pe8) obj).B((jt6) obj2);
                return;
            case 9:
                ((pe8) obj).l((o00) obj2);
                return;
            case 10:
                ((pe8) obj).m((d0c) obj2);
                return;
            case 11:
                ((pe8) obj).x((g53) obj2);
                return;
            case 12:
                ((pe8) obj).B(((c74) obj2).a.Q);
                return;
            case 13:
                ((pe8) obj).L((nf7) obj2);
                return;
            default:
                ((pe8) obj).G((y79) obj2);
                return;
        }
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        TLRPC.StickerSet stickerSet;
        TLRPC.Document document;
        boolean z;
        boolean z2;
        float f;
        TLRPC.StickerSet stickerSet2;
        TLRPC.Document document2;
        boolean z3;
        boolean z4;
        byte b = this.a;
        boolean z5 = false;
        Object obj3 = this.b;
        switch (b) {
            case 4:
                e24 e24Var = (e24) obj3;
                c6c c6cVar = (c6c) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f2 = (Float) serializable;
                Float f3 = (Float) serializable2;
                z14 z14Var = e24Var.c;
                e34 e34Var = e24Var.G;
                fn0 fn0Var = e34Var.b;
                Object obj4 = c6cVar.H;
                if (obj4 instanceof TLRPC.StickerSetCovered) {
                    x14 x14Var = (x14) c6cVar.I;
                    long j = e24Var.d;
                    TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj4).set;
                    long j2 = stickerSet3.id;
                    if (j == j2) {
                        e24Var.d = 0L;
                        stickerSet3 = null;
                    } else {
                        e24Var.d = j2;
                        e24Var.f = x14Var.d;
                        e24Var.e = stickerSet3;
                    }
                    stickerSet = stickerSet3;
                } else {
                    if (obj4 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj4;
                        long j3 = e24Var.d;
                        TLRPC.StickerSet stickerSet4 = tL_messages_stickerSet.set;
                        long j4 = stickerSet4.id;
                        if (j3 == j4) {
                            e24Var.d = 0L;
                        } else {
                            e24Var.d = j4;
                            e24Var.f = tL_messages_stickerSet.documents;
                            e24Var.e = stickerSet4;
                            stickerSet = stickerSet4;
                        }
                    }
                    stickerSet = null;
                }
                int childCount = z14Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    wo4 wo4Var = (wo4) z14Var.getChildAt(i);
                    if (wo4Var != view) {
                        wo4Var.a(false, true);
                    }
                }
                if (e24Var.d != 0 && e24Var.f.size() < e24Var.e.count) {
                    hs6 d0 = hs6.d0(e34Var.d1);
                    TLRPC.StickerSet stickerSet5 = e24Var.e;
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    tL_inputStickerSetID.id = stickerSet5.id;
                    tL_inputStickerSetID.access_hash = stickerSet5.access_hash;
                    TLRPC.TL_messages_stickerSet n0 = d0.n0(tL_inputStickerSetID, false);
                    if (n0 != null) {
                        e24Var.f = n0.documents;
                    }
                }
                TLObject tLObject = (TLObject) c6cVar.H;
                vo4 vo4Var = e34Var.M;
                ArrayList arrayList = e24Var.f;
                if (arrayList != null && !arrayList.isEmpty()) {
                    document = (TLRPC.Document) e24Var.f.get(0);
                } else {
                    document = null;
                }
                if (fn0Var.e > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                e34Var.I(vo4Var, tLObject, stickerSet, document, true, z);
                wo4 wo4Var2 = (wo4) view;
                if (e24Var.d != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                wo4Var2.a(z2, true);
                if (e24Var.d != 0) {
                    z5 = true;
                }
                fn0Var.a(z5, true);
                e24Var.f();
                e34Var.W.a();
                if (e24Var.d != 0) {
                    z14Var.L1(view);
                    return;
                }
                return;
            case 5:
            default:
                x34 x34Var = (x34) obj3;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f4 = (Float) serializable;
                Float f5 = (Float) serializable2;
                if (((c6c) obj).d == 1 && x34Var.b != null) {
                    boolean z6 = !x34Var.c;
                    x34Var.c = z6;
                    qp0 qp0Var = x34Var.h;
                    if (qp0Var != null) {
                        qp0Var.a(Boolean.valueOf(z6), Boolean.valueOf(x34Var.d), Boolean.valueOf(x34Var.e));
                    }
                    ((bjb) view2).setChecked(x34Var.c);
                    x34Var.f.g3.O(true);
                    return;
                }
                return;
            case 6:
                z24 z24Var = (z24) obj3;
                c6c c6cVar2 = (c6c) obj;
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f6 = (Float) serializable;
                Float f7 = (Float) serializable2;
                z14 z14Var2 = z24Var.c;
                e34 e34Var2 = z24Var.R;
                fn0 fn0Var2 = e34Var2.a;
                Object obj5 = c6cVar2.H;
                if (obj5 instanceof TLRPC.StickerSetCovered) {
                    x14 x14Var2 = (x14) c6cVar2.I;
                    long j5 = z24Var.d;
                    TLRPC.StickerSet stickerSet6 = ((TLRPC.StickerSetCovered) obj5).set;
                    f = 0.0f;
                    long j6 = stickerSet6.id;
                    if (j5 == j6) {
                        z24Var.d = 0L;
                        stickerSet6 = null;
                    } else {
                        z24Var.d = j6;
                        z24Var.f = x14Var2.d;
                        z24Var.e = stickerSet6;
                    }
                    stickerSet2 = stickerSet6;
                } else {
                    f = 0.0f;
                    if (obj5 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj5;
                        long j7 = z24Var.d;
                        stickerSet2 = tL_messages_stickerSet2.set;
                        long j8 = stickerSet2.id;
                        if (j7 == j8) {
                            z24Var.d = 0L;
                        } else {
                            z24Var.d = j8;
                            z24Var.f = tL_messages_stickerSet2.documents;
                            z24Var.e = stickerSet2;
                        }
                    }
                    stickerSet2 = null;
                }
                int childCount2 = z14Var2.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    wo4 wo4Var3 = (wo4) z14Var2.getChildAt(i2);
                    if (wo4Var3 != view3) {
                        wo4Var3.a(false, true);
                    }
                }
                if (z24Var.d != 0 && z24Var.f.size() < z24Var.e.count) {
                    hs6 d02 = hs6.d0(e34Var2.d1);
                    TLRPC.StickerSet stickerSet7 = z24Var.e;
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                    tL_inputStickerSetID2.id = stickerSet7.id;
                    tL_inputStickerSetID2.access_hash = stickerSet7.access_hash;
                    TLRPC.TL_messages_stickerSet n02 = d02.n0(tL_inputStickerSetID2, false);
                    if (n02 != null) {
                        z24Var.f = n02.documents;
                    }
                }
                TLObject tLObject2 = (TLObject) c6cVar2.H;
                vo4 vo4Var2 = e34Var2.O;
                ArrayList arrayList2 = z24Var.f;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    document2 = (TLRPC.Document) z24Var.f.get(0);
                } else {
                    document2 = null;
                }
                if (fn0Var2.e > f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                e34Var2.I(vo4Var2, tLObject2, stickerSet2, document2, false, z3);
                wo4 wo4Var4 = (wo4) view3;
                if (z24Var.d != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                wo4Var4.a(z4, true);
                if (z24Var.d != 0) {
                    z5 = true;
                }
                fn0Var2.a(z5, true);
                z24Var.f();
                e34Var2.H0.a();
                if (z24Var.d != 0) {
                    z14Var2.L1(view3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onCanceled() {
        Runnable runnable = ((Runnable[]) this.b)[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        ((f23) this.b).invoke(obj);
    }

    @Override
    public final void q(KeyEvent keyEvent) {
        ke4 ke4Var = (ke4) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && ke4Var.y.isShowing()) {
            ke4Var.y.d(true);
        }
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((av3) obj).a.d.p();
                return;
            case 5:
                hs6 d0 = hs6.d0(((w24) obj).w.d1);
                d0.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new xq6(d0, (byte) 1));
                return;
            default:
                ((wc7) obj).run();
                return;
        }
    }

    @Override
    public final void run() {
        Utilities.d.c(new md4((qd4) this.b, (byte) 3));
    }

    @Override
    public final void t(long j, yw7 yw7Var) {
        vsd.a(j, yw7Var, ((er4) this.b).K);
    }

    @Override
    public final int run() {
        return ((FiltersSetupActivity) this.b).x;
    }

    @Override
    public final void V(float f, int i) {
    }
}
