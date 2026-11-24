package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.ffmpeg.FfmpegAudioDecoder;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
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
public final class kx3 implements m7, n8c, ed, x56, wv7, a93, WriteToSocketDelegate, k8, z29, OnTokenCanceledListener, li0, g79, e39, OnSuccessListener, no7, x74, nw4, Continuation {
    public final byte a;
    public final Object b;

    public kx3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        ((du4) this.b).q1.j(vxcVar);
        return vxc.b;
    }

    @Override
    public final void a(b93 b93Var) {
        ((FfmpegAudioDecoder) this.b).o((SimpleDecoderOutputBuffer) b93Var);
    }

    @Override
    public final void b(yv7 yv7Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
        ArrayList arrayList = ExternalActionActivity.y;
        gba.B = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s ? 1 : 0);
            externalActionActivity.h = null;
        }
        externalActionActivity.c.e0();
        if (gl.O1()) {
            externalActionActivity.d.e0();
        }
        kk7.e().k(kk7.n0, yv7Var);
    }

    @Override
    public final long c(long j) {
        ci4 ci4Var = (ci4) this.b;
        return g8c.j((j * ci4Var.e) / 1000000, 0L, ci4Var.j - 1);
    }

    @Override
    public final boolean d(int i, View view) {
        sr4 sr4Var = (sr4) this.b;
        ArrayList arrayList = sr4Var.c0;
        ArrayList arrayList2 = sr4Var.i0;
        if (i >= 2 && sr4Var.a0 != null && (view instanceof or4)) {
            int i2 = i - 2;
            if (sr4Var.d0) {
                if (i2 != 0) {
                    i2 = i - 3;
                } else {
                    return false;
                }
            } else if (sr4Var.e0) {
                if (i2 < 0 || i2 >= arrayList.size()) {
                    i2 -= arrayList.size();
                } else {
                    return false;
                }
            }
            if (i2 >= 0 && i2 < sr4Var.g0.size()) {
                jm6 jm6Var = (jm6) sr4Var.g0.get(i2);
                if (arrayList2.isEmpty() && !sr4Var.R) {
                    if (arrayList2.contains(jm6Var)) {
                        arrayList2.remove(jm6Var);
                    } else if (arrayList2.size() + 1 > sr4Var.S) {
                        int i3 = -sr4Var.O;
                        sr4Var.O = i3;
                        gl.B3(i3, view, null);
                        pw0.APP_ERROR.a();
                        return true;
                    } else {
                        arrayList2.add(jm6Var);
                    }
                    gl.W3(sr4Var.d);
                    sr4Var.j();
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
        qx3 qx3Var = (qx3) this.b;
        Pattern pattern = qx3.P1;
        d dVar = qx3Var.m1;
        bx3 bx3Var = qx3Var.o1;
        if (bx3Var != null && (arrayList = bx3Var.b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) bx3Var.b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + na7.q1(qx3Var.a).N2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + na7.q1(qx3Var.a).N2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i == 1) {
                if (dVar != null) {
                    context = dVar.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = qx3Var.getContext();
                }
                ex3 ex3Var = new ex3(qx3Var, context, str2, str2, qx3Var.J0);
                if (dVar != null) {
                    dVar.showDialog(ex3Var);
                } else {
                    ex3Var.show();
                }
            } else if (i == 2) {
                try {
                    gl.g(str2);
                    new u21((FrameLayout) qx3Var.b, qx3Var.J0).k(false).j();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    @Override
    public final int i() {
        return bkb.v0(bkb.Z6, ((xu4) this.b).J0);
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 5:
                ((mc8) obj).B((jr6) obj2);
                return;
            case 6:
                ((mc8) obj).l((nz) obj2);
                return;
            case 7:
                ((mc8) obj).m((byb) obj2);
                return;
            case 8:
                ((mc8) obj).x((v33) obj2);
                return;
            case 9:
                ((mc8) obj).B(((t54) obj2).a.Q);
                return;
            case 10:
                ((mc8) obj).L((ld7) obj2);
                return;
            default:
                ((mc8) obj).G((w59) obj2);
                return;
        }
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
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
            case 1:
                t04 t04Var = (t04) obj3;
                c4c c4cVar = (c4c) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f2 = (Float) serializable;
                Float f3 = (Float) serializable2;
                o04 o04Var = t04Var.c;
                t14 t14Var = t04Var.G;
                fm0 fm0Var = t14Var.b;
                Object obj4 = c4cVar.H;
                if (obj4 instanceof TLRPC.StickerSetCovered) {
                    m04 m04Var = (m04) c4cVar.I;
                    long j = t04Var.d;
                    TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj4).set;
                    long j2 = stickerSet3.id;
                    if (j == j2) {
                        t04Var.d = 0L;
                        stickerSet3 = null;
                    } else {
                        t04Var.d = j2;
                        t04Var.f = m04Var.d;
                        t04Var.e = stickerSet3;
                    }
                    stickerSet = stickerSet3;
                } else {
                    if (obj4 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj4;
                        long j3 = t04Var.d;
                        TLRPC.StickerSet stickerSet4 = tL_messages_stickerSet.set;
                        long j4 = stickerSet4.id;
                        if (j3 == j4) {
                            t04Var.d = 0L;
                        } else {
                            t04Var.d = j4;
                            t04Var.f = tL_messages_stickerSet.documents;
                            t04Var.e = stickerSet4;
                            stickerSet = stickerSet4;
                        }
                    }
                    stickerSet = null;
                }
                int childCount = o04Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    vm4 vm4Var = (vm4) o04Var.getChildAt(i);
                    if (vm4Var != view) {
                        vm4Var.a(false, true);
                    }
                }
                if (t04Var.d != 0 && t04Var.f.size() < t04Var.e.count) {
                    hq6 d0 = hq6.d0(t14Var.d1);
                    TLRPC.StickerSet stickerSet5 = t04Var.e;
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    tL_inputStickerSetID.id = stickerSet5.id;
                    tL_inputStickerSetID.access_hash = stickerSet5.access_hash;
                    TLRPC.TL_messages_stickerSet n0 = d0.n0(tL_inputStickerSetID, false);
                    if (n0 != null) {
                        t04Var.f = n0.documents;
                    }
                }
                TLObject tLObject = (TLObject) c4cVar.H;
                um4 um4Var = t14Var.M;
                ArrayList arrayList = t04Var.f;
                if (arrayList != null && !arrayList.isEmpty()) {
                    document = (TLRPC.Document) t04Var.f.get(0);
                } else {
                    document = null;
                }
                if (fm0Var.e > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                t14Var.J(um4Var, tLObject, stickerSet, document, true, z);
                vm4 vm4Var2 = (vm4) view;
                if (t04Var.d != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                vm4Var2.a(z2, true);
                if (t04Var.d != 0) {
                    z5 = true;
                }
                fm0Var.a(z5, true);
                t04Var.f();
                t14Var.W.a();
                if (t04Var.d != 0) {
                    o04Var.L1(view);
                    return;
                }
                return;
            case 2:
            default:
                m24 m24Var = (m24) obj3;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f4 = (Float) serializable;
                Float f5 = (Float) serializable2;
                if (((c4c) obj).d == 1 && m24Var.b != null) {
                    boolean z6 = !m24Var.c;
                    m24Var.c = z6;
                    qo0 qo0Var = m24Var.h;
                    if (qo0Var != null) {
                        qo0Var.a(Boolean.valueOf(z6), Boolean.valueOf(m24Var.d), Boolean.valueOf(m24Var.e));
                    }
                    ((ahb) view2).setChecked(m24Var.c);
                    m24Var.f.g3.O(true);
                    return;
                }
                return;
            case 3:
                o14 o14Var = (o14) obj3;
                c4c c4cVar2 = (c4c) obj;
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f6 = (Float) serializable;
                Float f7 = (Float) serializable2;
                o04 o04Var2 = o14Var.c;
                t14 t14Var2 = o14Var.R;
                fm0 fm0Var2 = t14Var2.a;
                Object obj5 = c4cVar2.H;
                if (obj5 instanceof TLRPC.StickerSetCovered) {
                    m04 m04Var2 = (m04) c4cVar2.I;
                    long j5 = o14Var.d;
                    TLRPC.StickerSet stickerSet6 = ((TLRPC.StickerSetCovered) obj5).set;
                    f = 0.0f;
                    long j6 = stickerSet6.id;
                    if (j5 == j6) {
                        o14Var.d = 0L;
                        stickerSet6 = null;
                    } else {
                        o14Var.d = j6;
                        o14Var.f = m04Var2.d;
                        o14Var.e = stickerSet6;
                    }
                    stickerSet2 = stickerSet6;
                } else {
                    f = 0.0f;
                    if (obj5 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj5;
                        long j7 = o14Var.d;
                        stickerSet2 = tL_messages_stickerSet2.set;
                        long j8 = stickerSet2.id;
                        if (j7 == j8) {
                            o14Var.d = 0L;
                        } else {
                            o14Var.d = j8;
                            o14Var.f = tL_messages_stickerSet2.documents;
                            o14Var.e = stickerSet2;
                        }
                    }
                    stickerSet2 = null;
                }
                int childCount2 = o04Var2.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    vm4 vm4Var3 = (vm4) o04Var2.getChildAt(i2);
                    if (vm4Var3 != view3) {
                        vm4Var3.a(false, true);
                    }
                }
                if (o14Var.d != 0 && o14Var.f.size() < o14Var.e.count) {
                    hq6 d02 = hq6.d0(t14Var2.d1);
                    TLRPC.StickerSet stickerSet7 = o14Var.e;
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                    tL_inputStickerSetID2.id = stickerSet7.id;
                    tL_inputStickerSetID2.access_hash = stickerSet7.access_hash;
                    TLRPC.TL_messages_stickerSet n02 = d02.n0(tL_inputStickerSetID2, false);
                    if (n02 != null) {
                        o14Var.f = n02.documents;
                    }
                }
                TLObject tLObject2 = (TLObject) c4cVar2.H;
                um4 um4Var2 = t14Var2.O;
                ArrayList arrayList2 = o14Var.f;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    document2 = (TLRPC.Document) o14Var.f.get(0);
                } else {
                    document2 = null;
                }
                if (fm0Var2.e > f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                t14Var2.J(um4Var2, tLObject2, stickerSet2, document2, false, z3);
                vm4 vm4Var4 = (vm4) view3;
                if (o14Var.d != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                vm4Var4.a(z4, true);
                if (o14Var.d != 0) {
                    z5 = true;
                }
                fm0Var2.a(z5, true);
                o14Var.f();
                t14Var2.H0.a();
                if (o14Var.d != 0) {
                    o04Var2.L1(view3);
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
        ((t03) this.b).invoke(obj);
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        ((eu4) this.b).invalidateSelf();
    }

    @Override
    public final void r(KeyEvent keyEvent) {
        kc4 kc4Var = (kc4) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && kc4Var.y.isShowing()) {
            kc4Var.y.d(true);
        }
    }

    @Override
    public final void run() {
        Utilities.d.c(new mb4((qb4) this.b, (byte) 3));
    }

    @Override
    public final void s(long j, xu7 xu7Var) {
        sqd.a(j, xu7Var, ((dp4) this.b).K);
    }

    @Override
    public final Object then(Task task) {
        Exception exception;
        gl2 gl2Var = (gl2) this.b;
        gl2Var.getClass();
        if (!task.isSuccessful() && (exception = task.getException()) != null && !TextUtils.isEmpty(exception.getMessage()) && exception.getMessage().contains("FID_ALREADY_USED:")) {
            Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
            ((qg4) ((rg4) gl2Var.d)).c.v().delete();
            return gl2Var.M();
        }
        return task;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                hq6 d0 = hq6.d0(((l14) obj).w.d1);
                d0.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new xo6(d0, (byte) 1));
                return;
            case 20:
                ((va7) obj).run();
                return;
            default:
                ((wv4) obj).E0();
                return;
        }
    }

    @Override
    public final int run() {
        return ((FiltersSetupActivity) this.b).x;
    }

    @Override
    public final void D(float f, int i) {
    }
}
