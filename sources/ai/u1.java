package ai;

import a8.xa;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.oi;
import org.telegram.messenger.pi;
import org.telegram.messenger.si;
import org.telegram.messenger.sr;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Wallet.n6;
import org.telegram.ui.bn;
import org.telegram.ui.g30;
import org.telegram.ui.k30;
import org.telegram.ui.md0;
import org.telegram.ui.qa0;
import org.telegram.ui.sg;
public final class u1 implements org.telegram.ui.ActionBar.q1, pi, h2.o, NativeInstance.PayloadCallback, u10, p4.m0, h2.j, w5.b {
    public final int f1557a;
    public final int f1558b;
    public final Object f1559c;
    public final Object d;

    public u1(int i7, Object obj, Object obj2, int i10) {
        this.f1557a = i10;
        this.f1558b = i7;
        this.f1559c = obj;
        this.d = obj2;
    }

    @Override
    public void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: ai.u1.accept(java.lang.Object):void");
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        ArrayList arrayList2;
        jg.a2 a2Var = (jg.a2) this.f1559c;
        HashMap hashMap = (HashMap) this.d;
        jg.c2 c2Var = a2Var.f17430a;
        int i7 = c2Var.Q;
        HashMap hashMap2 = c2Var.J;
        if (this.f1558b == i7) {
            int size = arrayList.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                String str2 = ((oi) arrayList.get(i10)).f26126a;
                if (hashMap != null) {
                    arrayList2 = (ArrayList) hashMap.get(str2);
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    a2Var.a();
                    if (!hashMap2.containsKey(arrayList2)) {
                        hashMap2.put(arrayList2, str2);
                        c2Var.K.add(arrayList2);
                        z10 = true;
                    }
                }
            }
            if (z10) {
                c2Var.f();
            }
        }
    }

    @Override
    public void f(p4.v vVar) {
        byte[] bArr;
        p4.n0 n0Var = (p4.n0) this.f1559c;
        q4.h hVar = (q4.h) this.d;
        if (TextUtils.isEmpty(hVar.f55840a)) {
            h2.a.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i7 = p4.n.f55378a;
        String str = hVar.f55840a;
        e2.z zVar = new e2.z();
        h9.g0 g0Var = h9.i0.f14035b;
        h9.t1 t1Var = h9.t1.f14103e;
        List list = Collections.EMPTY_LIST;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(21, false);
        a0Var.f1724b = hVar.f55846r;
        e2.h0 h0Var2 = new e2.h0(a0Var);
        CharSequence charSequence = hVar.f55841b;
        e2.n0 n0Var2 = new e2.n0();
        n0Var2.f10564f = hVar.f55842c;
        n0Var2.f10565g = hVar.d;
        n0Var2.f10571n = hVar.h;
        Bundle bundle = null;
        n0Var2.f10566i = p4.n.c(null);
        Bitmap bitmap = hVar.f55843e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (hVar.f55844f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    hVar.f55844f = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (IOException e10) {
                    h2.a.m("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e10);
                }
            }
            bArr = hVar.f55844f;
        }
        int i10 = 3;
        if (bArr != null) {
            n0Var2.b(bArr, 3);
        }
        Bundle bundle2 = hVar.f55845n;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        }
        if (bundle != null && bundle.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            long j3 = bundle.getLong("android.media.extra.BT_FOLDER_TYPE");
            if (j3 != 0) {
                if (j3 == 1) {
                    i10 = 1;
                } else if (j3 == 2) {
                    i10 = 2;
                } else if (j3 != 3) {
                    if (j3 == 4) {
                        i10 = 4;
                    } else if (j3 == 5) {
                        i10 = 5;
                    } else if (j3 == 6) {
                        i10 = 6;
                    }
                }
                n0Var2.f10574q = Integer.valueOf(i10);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i10 = 0;
            n0Var2.f10574q = Integer.valueOf(i10);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        n0Var2.f10575r = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            n0Var2.H = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            n0Var2.J = h9.i0.q(h9.i0.q(stringArrayList));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            n0Var2.f10560a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            n0Var2.f10563e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            n0Var2.f10560a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            n0Var2.I = bundle;
        }
        n0Var2.f10576s = Boolean.TRUE;
        m9.y l10 = n0Var.h.l(vVar, h9.i0.u(new e2.l0(str2, new e2.a0(zVar), null, new e2.f0(e0Var), new e2.o0(n0Var2), h0Var2)));
        l10.b(new m9.u(0, l10, new xa(n0Var, vVar, this.f1558b)), m9.r.f20983a);
    }

    @Override
    public Object g() {
        ((md0) ((ia.c) this.f1559c).d).H((o5.i) this.d, this.f1558b + 1, false);
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        switch (this.f1557a) {
            case 1:
                n6.N0(this.f1558b, (Context) this.f1559c, (h6) this.d);
                return;
            case 2:
            case 4:
            case 5:
            case 10:
            case 15:
            default:
                StickersActivity.f0((StickersActivity) this.f1559c, (ArrayList) this.d, this.f1558b);
                return;
            case 3:
                kg.s sVar = (kg.s) this.f1559c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    org.telegram.messenger.g0.D3(sVar);
                    return;
                }
                kg.z d = kg.z.d(this.f1558b);
                TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                if (c10 != null) {
                    TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                    tL_inputBusinessChatLink.message = c10.message;
                    tL_inputBusinessChatLink.entities = c10.entities;
                    tL_inputBusinessChatLink.title = obj;
                    d.b(c10, tL_inputBusinessChatLink, null);
                }
                t1Var.dismiss();
                return;
            case 6:
                bn bnVar = (bn) this.f1559c;
                boolean[] zArr = (boolean[]) this.d;
                bnVar.getMessagesController().J3(bnVar.f46005e, bnVar.f46019f, this.f1558b, false, !zArr[1], zArr[0]);
                gc B = lc.B(bnVar, true, null, null, bnVar.Ba);
                B.j();
                lb lbVar = B.f35523e;
                lbVar.postDelayed(new sg(0, lbVar), 550L);
                return;
            case 7:
                bn.M0((bn) this.f1559c, this.f1558b, (gj) this.d);
                return;
            case 8:
                b5 b5Var = (b5) this.f1559c;
                sr srVar = (sr) this.d;
                String trim = b5Var.getText().toString().trim();
                if (trim.length() <= this.f1558b && !trim.isEmpty()) {
                    srVar.a(trim);
                    t1Var.dismiss();
                    return;
                }
                org.telegram.messenger.g0.D3(b5Var);
                return;
            case 9:
                yl0 yl0Var = (yl0) this.f1559c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = yl0Var.getText().toString();
                if (obj2.length() > 12) {
                    org.telegram.messenger.g0.D3(yl0Var);
                    return;
                }
                np.u1(this.f1558b).t4(ch.p0.d(reaction), obj2);
                t1Var.dismiss();
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                k30 k30Var = ((g30) this.f1559c).f47928s1;
                t3 t3Var = k30Var.f49193b.V2;
                String obj3 = editTextBoldCursor.getText().toString();
                int i11 = this.f1558b;
                t3Var.A(i11, obj3);
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                UndoView o12 = k30Var.f49193b.o1();
                if (i11 == 0) {
                    i10 = 39;
                } else {
                    i10 = 100;
                }
                o12.j(i10, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    return;
                }
                return;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) this.f1559c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f43120e0;
                if (!arrayList.isEmpty() && org.telegram.messenger.g0.J1((org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList))) {
                    qa0 qa0Var = new qa0(0);
                    qa0Var.M0 = new v1(hashMap, this.f1558b, 14);
                    launchActivity.t0(qa0Var);
                    return;
                }
                return;
            case 13:
                ((qa0) this.f1559c).I0(900, this.f1558b, (TLRPC.User) this.d);
                return;
            case 14:
                PasscodeActivity.Z((PasscodeActivity) this.f1559c, (tb0) this.d, this.f1558b);
                return;
            case 16:
                SessionsActivity.c0((SessionsActivity) this.f1559c, this.f1558b, (boolean[]) this.d);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        int i7 = this.f1558b;
        a1Var.i(i7);
        a1Var.s((e2.b1) this.f1559c, (e2.b1) this.d, i7);
    }

    @Override
    public void m(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.f1559c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i7 = this.f1558b;
        String str = "😀";
        String V = gj.V(document, "😀", Integer.valueOf(i7));
        if (!TextUtils.isEmpty(V)) {
            str = V;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = si.b0(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = si.c0(document, str);
        ConnectionsManager.getInstance(k10.f24968t0).sendRequest(tL_stickers_addStickerToSet, new bg.l0(t1Var, i7, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            t1Var.r(350L);
        } catch (Exception unused) {
        }
    }

    @Override
    public void run(int i7, String str) {
        ((VoIPService) this.f1559c).lambda$createGroupInstance$66(this.f1558b, (boolean[]) this.d, i7, str);
    }

    public u1(Object obj, int i7, Object obj2, int i10) {
        this.f1557a = i10;
        this.f1559c = obj;
        this.f1558b = i7;
        this.d = obj2;
    }

    public u1(Object obj, Object obj2, int i7, int i10) {
        this.f1557a = i10;
        this.f1559c = obj;
        this.d = obj2;
        this.f1558b = i7;
    }
}
