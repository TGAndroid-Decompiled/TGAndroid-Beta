package k2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import b8.kg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kg.w1;
import kg.y1;
import org.telegram.messenger.h10;
import org.telegram.messenger.hi;
import org.telegram.messenger.hp;
import org.telegram.messenger.ii;
import org.telegram.messenger.li;
import org.telegram.messenger.or;
import org.telegram.messenger.q10;
import org.telegram.messenger.r3;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.c30;
import org.telegram.ui.la0;
import org.telegram.ui.pg;
import org.telegram.ui.wm;
import org.telegram.ui.x20;
public final class y implements g2.p, ii, org.telegram.ui.ActionBar.p1, o4.n0, g2.k, NativeInstance.PayloadCallback, q10, v5.b {
    public final int f16774a;
    public final int f16775b;
    public final Object f16776c;
    public final Object d;

    public y(int i3, Object obj, Object obj2, int i10) {
        this.f16774a = i10;
        this.f16775b = i3;
        this.f16776c = obj;
        this.d = obj2;
    }

    @Override
    public void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: k2.y.accept(java.lang.Object):void");
    }

    @Override
    public void c(o4.v vVar) {
        byte[] bArr;
        o4.o0 o0Var = (o4.o0) this.f16776c;
        p4.h hVar = (p4.h) this.d;
        if (TextUtils.isEmpty(hVar.f53151a)) {
            g2.a.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i3 = o4.n.f20759a;
        String str = hVar.f53151a;
        d2.b0 b0Var = new d2.b0();
        g9.g0 g0Var = g9.i0.f12083b;
        g9.s1 s1Var = g9.s1.f12146e;
        List list = Collections.EMPTY_LIST;
        d2.g0 g0Var2 = new d2.g0();
        d2.j0 j0Var = d2.j0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(13, false);
        a0Var.f1186b = hVar.f53157r;
        d2.j0 j0Var2 = new d2.j0(a0Var);
        CharSequence charSequence = hVar.f53152b;
        d2.p0 p0Var = new d2.p0();
        p0Var.f8264f = hVar.f53153c;
        p0Var.f8265g = hVar.d;
        p0Var.f8271n = hVar.h;
        Bundle bundle = null;
        p0Var.f8266i = o4.n.c(null);
        Bitmap bitmap = hVar.f53154e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (hVar.f53155f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    hVar.f53155f = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (IOException e10) {
                    g2.a.m("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e10);
                }
            }
            bArr = hVar.f53155f;
        }
        int i10 = 3;
        if (bArr != null) {
            p0Var.b(bArr, 3);
        }
        Bundle bundle2 = hVar.f53156n;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        }
        if (bundle != null && bundle.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            long j10 = bundle.getLong("android.media.extra.BT_FOLDER_TYPE");
            if (j10 != 0) {
                if (j10 == 1) {
                    i10 = 1;
                } else if (j10 == 2) {
                    i10 = 2;
                } else if (j10 != 3) {
                    if (j10 == 4) {
                        i10 = 4;
                    } else if (j10 == 5) {
                        i10 = 5;
                    } else if (j10 == 6) {
                        i10 = 6;
                    }
                }
                p0Var.f8274q = Integer.valueOf(i10);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i10 = 0;
            p0Var.f8274q = Integer.valueOf(i10);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        p0Var.f8275r = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            p0Var.H = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            p0Var.J = g9.i0.q(g9.i0.q(stringArrayList));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            p0Var.f8260a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            p0Var.f8263e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            p0Var.f8260a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            p0Var.I = bundle;
        }
        p0Var.f8276s = Boolean.TRUE;
        l9.y l10 = o0Var.h.l(vVar, g9.i0.u(new d2.n0(str2, new d2.c0(b0Var), null, new d2.h0(g0Var2), new d2.q0(p0Var), j0Var2)));
        l10.b(new l9.u(0, l10, new kg(o0Var, vVar, this.f16775b)), l9.r.f18162a);
    }

    @Override
    public Object d() {
        ((p7.d) ((ha.c) this.f16776c).d).E((n5.i) this.d, this.f16775b + 1, false);
        return null;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10;
        switch (this.f16774a) {
            case 2:
                lg.s sVar = (lg.s) this.f16776c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    org.telegram.messenger.g0.F3(sVar);
                    return;
                }
                lg.z d = lg.z.d(this.f16775b);
                TL_account.TL_businessChatLink c2 = d.c(tL_businessChatLink.link);
                if (c2 != null) {
                    TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                    tL_inputBusinessChatLink.message = c2.message;
                    tL_inputBusinessChatLink.entities = c2.entities;
                    tL_inputBusinessChatLink.title = obj;
                    d.b(c2, tL_inputBusinessChatLink, null);
                }
                s1Var.dismiss();
                return;
            case 3:
            case 4:
            case 5:
            case 10:
            case 15:
            default:
                StickersActivity.f0((StickersActivity) this.f16776c, (ArrayList) this.d, this.f16775b);
                return;
            case 6:
                wm wmVar = (wm) this.f16776c;
                boolean[] zArr = (boolean[]) this.d;
                wmVar.getMessagesController().C3(wmVar.f51292e, wmVar.f51306f, this.f16775b, false, !zArr[1], zArr[0]);
                ac B = fc.B(wmVar, true, null, null, wmVar.f51557ya);
                B.j();
                fb fbVar = B.f31788e;
                fbVar.postDelayed(new pg(0, fbVar), 550L);
                return;
            case 7:
                wm.J0((wm) this.f16776c, this.f16775b, (zi) this.d);
                return;
            case 8:
                s4 s4Var = (s4) this.f16776c;
                or orVar = (or) this.d;
                String trim = s4Var.getText().toString().trim();
                if (trim.length() <= this.f16775b && !trim.isEmpty()) {
                    orVar.a(trim);
                    s1Var.dismiss();
                    return;
                }
                org.telegram.messenger.g0.F3(s4Var);
                return;
            case 9:
                nl0 nl0Var = (nl0) this.f16776c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = nl0Var.getText().toString();
                if (obj2.length() > 12) {
                    org.telegram.messenger.g0.F3(nl0Var);
                    return;
                }
                hp.s1(this.f16775b).l4(dh.n0.d(reaction), obj2);
                s1Var.dismiss();
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                c30 c30Var = ((x20) this.f16776c).f51696p1;
                r3 r3Var = c30Var.f44213b.S2;
                String obj3 = editTextBoldCursor.getText().toString();
                int i11 = this.f16775b;
                r3Var.A(i11, obj3);
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                UndoView m1 = c30Var.f44213b.m1();
                if (i11 == 0) {
                    i10 = 39;
                } else {
                    i10 = 100;
                }
                m1.j(i10, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    return;
                }
                return;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) this.f16776c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f41291e0;
                if (!arrayList.isEmpty() && org.telegram.messenger.g0.J1((d2) p1.h(1, arrayList))) {
                    la0 la0Var = new la0(0);
                    la0Var.H0 = new q(hashMap, this.f16775b, 12);
                    launchActivity.t0(la0Var);
                    return;
                }
                return;
            case 13:
                ((la0) this.f16776c).I0(900, this.f16775b, (TLRPC.User) this.d);
                return;
            case 14:
                PasscodeActivity.Z((PasscodeActivity) this.f16776c, (cb0) this.d, this.f16775b);
                return;
            case 16:
                SessionsActivity.c0((SessionsActivity) this.f16776c, this.f16775b, (boolean[]) this.d);
                return;
        }
    }

    @Override
    public void h(String str, ArrayList arrayList) {
        ArrayList arrayList2;
        w1 w1Var = (w1) this.f16776c;
        HashMap hashMap = (HashMap) this.d;
        y1 y1Var = w1Var.f17228a;
        int i3 = y1Var.Q;
        HashMap hashMap2 = y1Var.J;
        if (this.f16775b == i3) {
            int size = arrayList.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                String str2 = ((hi) arrayList.get(i10)).f22931a;
                if (hashMap != null) {
                    arrayList2 = (ArrayList) hashMap.get(str2);
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    w1Var.a();
                    if (!hashMap2.containsKey(arrayList2)) {
                        hashMap2.put(arrayList2, str2);
                        y1Var.K.add(arrayList2);
                        z10 = true;
                    }
                }
            }
            if (z10) {
                y1Var.f();
            }
        }
    }

    @Override
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.f16776c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i3 = this.f16775b;
        String str = "😀";
        String V = zi.V(document, "😀", Integer.valueOf(i3));
        if (!TextUtils.isEmpty(V)) {
            str = V;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = li.Z(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = li.a0(document, str);
        ConnectionsManager.getInstance(h10.f22829t0).sendRequest(tL_stickers_addStickerToSet, new cg.j0(s1Var, i3, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            s1Var.r(350L);
        } catch (Exception unused) {
        }
    }

    @Override
    public void invoke(Object obj) {
        d2.c1 c1Var = (d2.c1) obj;
        int i3 = this.f16775b;
        c1Var.i(i3);
        c1Var.q((d2.d1) this.f16776c, (d2.d1) this.d, i3);
    }

    @Override
    public void run(int i3, String str) {
        ((VoIPService) this.f16776c).lambda$createGroupInstance$66(this.f16775b, (boolean[]) this.d, i3, str);
    }

    public y(Object obj, int i3, Object obj2, int i10) {
        this.f16774a = i10;
        this.f16776c = obj;
        this.f16775b = i3;
        this.d = obj2;
    }

    public y(Object obj, Object obj2, int i3, int i10) {
        this.f16774a = i10;
        this.f16776c = obj;
        this.d = obj2;
        this.f16775b = i3;
    }
}
