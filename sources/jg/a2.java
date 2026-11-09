package jg;

import a8.wa;
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
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qi;
import org.telegram.messenger.qp;
import org.telegram.messenger.r3;
import org.telegram.messenger.ri;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.wr;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.u4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.cn;
import org.telegram.ui.e30;
import org.telegram.ui.j30;
import org.telegram.ui.ky0;
import org.telegram.ui.ra0;
import org.telegram.ui.wg;
public final class a2 implements ri, org.telegram.ui.ActionBar.r1, h2.o, NativeInstance.PayloadCallback, y10, p4.l0, h2.j, w5.b {
    public final int f16667a;
    public final int f16668b;
    public final Object f16669c;
    public final Object d;

    public a2(int i7, Object obj, Object obj2, int i10) {
        this.f16667a = i10;
        this.f16668b = i7;
        this.f16669c = obj;
        this.d = obj2;
    }

    @Override
    public void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: jg.a2.accept(java.lang.Object):void");
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        ArrayList arrayList2;
        b2 b2Var = (b2) this.f16669c;
        HashMap hashMap = (HashMap) this.d;
        d2 d2Var = b2Var.f16672a;
        int i7 = d2Var.P;
        HashMap hashMap2 = d2Var.I;
        if (this.f16668b == i7) {
            int size = arrayList.size();
            boolean z9 = false;
            for (int i10 = 0; i10 < size; i10++) {
                String str2 = ((qi) arrayList.get(i10)).f24701a;
                if (hashMap != null) {
                    arrayList2 = (ArrayList) hashMap.get(str2);
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    b2Var.a();
                    if (!hashMap2.containsKey(arrayList2)) {
                        hashMap2.put(arrayList2, str2);
                        d2Var.J.add(arrayList2);
                        z9 = true;
                    }
                }
            }
            if (z9) {
                d2Var.f();
            }
        }
    }

    @Override
    public void f(p4.v vVar) {
        byte[] bArr;
        p4.m0 m0Var = (p4.m0) this.f16669c;
        q4.h hVar = (q4.h) this.d;
        if (TextUtils.isEmpty(hVar.f53785a)) {
            h2.a.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i7 = p4.n.f53399a;
        String str = hVar.f53785a;
        e2.z zVar = new e2.z();
        h9.g0 g0Var = h9.i0.f14329b;
        h9.t1 t1Var = h9.t1.f14397e;
        List list = Collections.EMPTY_LIST;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(20, false);
        a0Var.f1763b = hVar.f53791r;
        e2.h0 h0Var2 = new e2.h0(a0Var);
        CharSequence charSequence = hVar.f53786b;
        e2.n0 n0Var = new e2.n0();
        n0Var.f10381f = hVar.f53787c;
        n0Var.f10382g = hVar.d;
        n0Var.f10388n = hVar.h;
        Bundle bundle = null;
        n0Var.f10383i = p4.n.c(null);
        Bitmap bitmap = hVar.f53788e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (hVar.f53789f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    hVar.f53789f = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (IOException e10) {
                    h2.a.m("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e10);
                }
            }
            bArr = hVar.f53789f;
        }
        int i10 = 3;
        if (bArr != null) {
            n0Var.b(bArr, 3);
        }
        Bundle bundle2 = hVar.f53790n;
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
                n0Var.f10391q = Integer.valueOf(i10);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i10 = 0;
            n0Var.f10391q = Integer.valueOf(i10);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        n0Var.f10392r = Boolean.FALSE;
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
            n0Var.f10377a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            n0Var.f10380e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            n0Var.f10377a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            n0Var.I = bundle;
        }
        n0Var.f10393s = Boolean.TRUE;
        m9.y l10 = m0Var.h.l(vVar, h9.i0.u(new e2.l0(str2, new e2.a0(zVar), null, new e2.f0(e0Var), new e2.o0(n0Var), h0Var2)));
        l10.b(new m9.u(0, l10, new wa(m0Var, vVar, this.f16668b)), m9.r.f19994a);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        switch (this.f16667a) {
            case 1:
                kg.s sVar = (kg.s) this.f16669c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    org.telegram.messenger.g0.F3(sVar);
                    return;
                }
                kg.y d = kg.y.d(this.f16668b);
                TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                if (c10 != null) {
                    TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                    tL_inputBusinessChatLink.message = c10.message;
                    tL_inputBusinessChatLink.entities = c10.entities;
                    tL_inputBusinessChatLink.title = obj;
                    d.b(c10, tL_inputBusinessChatLink, null);
                }
                u1Var.dismiss();
                return;
            case 2:
            case 3:
            case 8:
            case 13:
            default:
                StickersActivity.f0((StickersActivity) this.f16669c, (ArrayList) this.d, this.f16668b);
                return;
            case 4:
                cn cnVar = (cn) this.f16669c;
                boolean[] zArr = (boolean[]) this.d;
                cnVar.getMessagesController().C3(cnVar.f44432e, cnVar.f44446f, this.f16668b, false, !zArr[1], zArr[0]);
                cc B = hc.B(cnVar, true, null, null, cnVar.f44709za);
                B.j();
                gb gbVar = B.f32623e;
                gbVar.postDelayed(new wg(0, gbVar), 550L);
                return;
            case 5:
                cn.M0((cn) this.f16669c, this.f16668b, (ij) this.d);
                return;
            case 6:
                u4 u4Var = (u4) this.f16669c;
                wr wrVar = (wr) this.d;
                String trim = u4Var.getText().toString().trim();
                if (trim.length() <= this.f16668b && !trim.isEmpty()) {
                    wrVar.a(trim);
                    u1Var.dismiss();
                    return;
                }
                org.telegram.messenger.g0.F3(u4Var);
                return;
            case 7:
                ll0 ll0Var = (ll0) this.f16669c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = ll0Var.getText().toString();
                if (obj2.length() > 12) {
                    org.telegram.messenger.g0.F3(ll0Var);
                    return;
                }
                qp.s1(this.f16668b).l4(ch.o0.d(reaction), obj2);
                u1Var.dismiss();
                return;
            case 9:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                j30 j30Var = ((e30) this.f16669c).f45171o1;
                r3 r3Var = j30Var.f46823b.R2;
                String obj3 = editTextBoldCursor.getText().toString();
                int i11 = this.f16668b;
                r3Var.A(i11, obj3);
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                UndoView n1 = j30Var.f46823b.n1();
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
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.f16669c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f41267d0;
                if (!arrayList.isEmpty() && org.telegram.messenger.g0.J1((f2) g.i(1, arrayList))) {
                    ra0 ra0Var = new ra0(0);
                    ra0Var.G0 = new l2.q(hashMap, this.f16668b, 11);
                    launchActivity.t0(ra0Var);
                    return;
                }
                return;
            case 11:
                ((ra0) this.f16669c).I0(900, this.f16668b, (TLRPC.User) this.d);
                return;
            case 12:
                PasscodeActivity.Z((PasscodeActivity) this.f16669c, (ib0) this.d, this.f16668b);
                return;
            case 14:
                SessionsActivity.c0((SessionsActivity) this.f16669c, this.f16668b, (boolean[]) this.d);
                return;
        }
    }

    @Override
    public Object h() {
        ((ky0) ((ia.c) this.f16669c).d).J((o5.i) this.d, this.f16668b + 1, false);
        return null;
    }

    @Override
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        int i7 = this.f16668b;
        a1Var.i(i7);
        a1Var.s((e2.b1) this.f16669c, (e2.b1) this.d, i7);
    }

    @Override
    public void k(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.f16669c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i7 = this.f16668b;
        String str = "😀";
        String V = ij.V(document, "😀", Integer.valueOf(i7));
        if (!TextUtils.isEmpty(V)) {
            str = V;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = ui.Z(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = ui.a0(document, str);
        ConnectionsManager.getInstance(p10.f24470s0).sendRequest(tL_stickers_addStickerToSet, new bg.k0(u1Var, i7, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            u1Var.r(350L);
        } catch (Exception unused) {
        }
    }

    @Override
    public void run(int i7, String str) {
        ((VoIPService) this.f16669c).lambda$createGroupInstance$66(this.f16668b, (boolean[]) this.d, i7, str);
    }

    public a2(Object obj, int i7, Object obj2, int i10) {
        this.f16667a = i10;
        this.f16669c = obj;
        this.f16668b = i7;
        this.d = obj2;
    }

    public a2(Object obj, Object obj2, int i7, int i10) {
        this.f16667a = i10;
        this.f16669c = obj;
        this.d = obj2;
        this.f16668b = i7;
    }
}
