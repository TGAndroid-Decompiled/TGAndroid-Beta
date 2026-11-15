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
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.oi;
import org.telegram.messenger.pi;
import org.telegram.messenger.r3;
import org.telegram.messenger.si;
import org.telegram.messenger.tr;
import org.telegram.messenger.v10;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.an;
import org.telegram.ui.d30;
import org.telegram.ui.h30;
import org.telegram.ui.ld0;
import org.telegram.ui.pa0;
import org.telegram.ui.sg;
public final class r1 implements pi, org.telegram.ui.ActionBar.q1, h2.o, NativeInstance.PayloadCallback, v10, p4.l0, h2.j, w5.b {
    public final int f1496a;
    public final int f1497b;
    public final Object f1498c;
    public final Object d;

    public r1(int i7, Object obj, Object obj2, int i10) {
        this.f1496a = i10;
        this.f1497b = i7;
        this.f1498c = obj;
        this.d = obj2;
    }

    @Override
    public void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: ai.r1.accept(java.lang.Object):void");
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        ArrayList arrayList2;
        jg.a2 a2Var = (jg.a2) this.f1498c;
        HashMap hashMap = (HashMap) this.d;
        jg.c2 c2Var = a2Var.f17019a;
        int i7 = c2Var.Q;
        HashMap hashMap2 = c2Var.J;
        if (this.f1497b == i7) {
            int size = arrayList.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                String str2 = ((oi) arrayList.get(i10)).f25765a;
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
        p4.m0 m0Var = (p4.m0) this.f1498c;
        q4.h hVar = (q4.h) this.d;
        if (TextUtils.isEmpty(hVar.f55221a)) {
            h2.a.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i7 = p4.n.f54804a;
        String str = hVar.f55221a;
        e2.z zVar = new e2.z();
        h9.g0 g0Var = h9.i0.f13686b;
        h9.s1 s1Var = h9.s1.f13749e;
        List list = Collections.EMPTY_LIST;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(21, false);
        a0Var.f1713b = hVar.f55227r;
        e2.h0 h0Var2 = new e2.h0(a0Var);
        CharSequence charSequence = hVar.f55222b;
        e2.n0 n0Var = new e2.n0();
        n0Var.f10217f = hVar.f55223c;
        n0Var.f10218g = hVar.d;
        n0Var.f10224n = hVar.h;
        Bundle bundle = null;
        n0Var.f10219i = p4.n.c(null);
        Bitmap bitmap = hVar.f55224e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (hVar.f55225f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    hVar.f55225f = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (IOException e10) {
                    h2.a.m("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e10);
                }
            }
            bArr = hVar.f55225f;
        }
        int i10 = 3;
        if (bArr != null) {
            n0Var.b(bArr, 3);
        }
        Bundle bundle2 = hVar.f55226n;
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
                n0Var.f10227q = Integer.valueOf(i10);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i10 = 0;
            n0Var.f10227q = Integer.valueOf(i10);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        n0Var.f10228r = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            n0Var.H = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            n0Var.J = h9.i0.q(h9.i0.q(stringArrayList));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            n0Var.f10213a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            n0Var.f10216e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            n0Var.f10213a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            n0Var.I = bundle;
        }
        n0Var.f10229s = Boolean.TRUE;
        m9.y l10 = m0Var.h.l(vVar, h9.i0.u(new e2.l0(str2, new e2.a0(zVar), null, new e2.f0(e0Var), new e2.o0(n0Var), h0Var2)));
        l10.b(new m9.u(0, l10, new xa(m0Var, vVar, this.f1497b)), m9.r.f20591a);
    }

    @Override
    public Object g() {
        ((ld0) ((ia.c) this.f1498c).d).H((o5.i) this.d, this.f1497b + 1, false);
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        switch (this.f1496a) {
            case 2:
                kg.s sVar = (kg.s) this.f1498c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    org.telegram.messenger.g0.E3(sVar);
                    return;
                }
                kg.y d = kg.y.d(this.f1497b);
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
            case 3:
            case 4:
            case 9:
            case 14:
            default:
                StickersActivity.f0((StickersActivity) this.f1498c, (ArrayList) this.d, this.f1497b);
                return;
            case 5:
                an anVar = (an) this.f1498c;
                boolean[] zArr = (boolean[]) this.d;
                anVar.getMessagesController().C3(anVar.f45172e, anVar.f45186f, this.f1497b, false, !zArr[1], zArr[0]);
                xb B = cc.B(anVar, true, null, null, anVar.Aa);
                B.j();
                cb cbVar = B.f41631e;
                cbVar.postDelayed(new sg(0, cbVar), 550L);
                return;
            case 6:
                an.M0((an) this.f1498c, this.f1497b, (gj) this.d);
                return;
            case 7:
                s4 s4Var = (s4) this.f1498c;
                tr trVar = (tr) this.d;
                String trim = s4Var.getText().toString().trim();
                if (trim.length() <= this.f1497b && !trim.isEmpty()) {
                    trVar.a(trim);
                    t1Var.dismiss();
                    return;
                }
                org.telegram.messenger.g0.E3(s4Var);
                return;
            case 8:
                ol0 ol0Var = (ol0) this.f1498c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = ol0Var.getText().toString();
                if (obj2.length() > 12) {
                    org.telegram.messenger.g0.E3(ol0Var);
                    return;
                }
                np.s1(this.f1497b).l4(ch.p0.d(reaction), obj2);
                t1Var.dismiss();
                return;
            case 10:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                h30 h30Var = ((d30) this.f1498c).f46270s1;
                r3 r3Var = h30Var.f47588b.V2;
                String obj3 = editTextBoldCursor.getText().toString();
                int i11 = this.f1497b;
                r3Var.A(i11, obj3);
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                UndoView n1 = h30Var.f47588b.n1();
                if (i11 == 0) {
                    i10 = 39;
                } else {
                    i10 = 100;
                }
                n1.j(i10, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    return;
                }
                return;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) this.f1498c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f42630e0;
                if (!arrayList.isEmpty() && org.telegram.messenger.g0.J1((org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList))) {
                    pa0 pa0Var = new pa0(0);
                    pa0Var.H0 = new s1(hashMap, this.f1497b, 14);
                    launchActivity.t0(pa0Var);
                    return;
                }
                return;
            case 12:
                ((pa0) this.f1498c).I0(900, this.f1497b, (TLRPC.User) this.d);
                return;
            case 13:
                PasscodeActivity.Z((PasscodeActivity) this.f1498c, (ib0) this.d, this.f1497b);
                return;
            case 15:
                SessionsActivity.c0((SessionsActivity) this.f1498c, this.f1497b, (boolean[]) this.d);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        int i7 = this.f1497b;
        a1Var.g(i7);
        a1Var.s((e2.b1) this.f1498c, (e2.b1) this.d, i7);
    }

    @Override
    public void l(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.f1498c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i7 = this.f1497b;
        String str = "😀";
        String V = gj.V(document, "😀", Integer.valueOf(i7));
        if (!TextUtils.isEmpty(V)) {
            str = V;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = si.Z(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = si.a0(document, str);
        ConnectionsManager.getInstance(m10.f24940t0).sendRequest(tL_stickers_addStickerToSet, new bg.k0(t1Var, i7, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            t1Var.r(350L);
        } catch (Exception unused) {
        }
    }

    @Override
    public void run(int i7, String str) {
        ((VoIPService) this.f1498c).lambda$createGroupInstance$66(this.f1497b, (boolean[]) this.d, i7, str);
    }

    public r1(Object obj, int i7, Object obj2, int i10) {
        this.f1496a = i10;
        this.f1498c = obj;
        this.f1497b = i7;
        this.d = obj2;
    }

    public r1(Object obj, Object obj2, int i7, int i10) {
        this.f1496a = i10;
        this.f1498c = obj;
        this.d = obj2;
        this.f1497b = i7;
    }
}
