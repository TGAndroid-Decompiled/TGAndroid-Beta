package ag;

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
import org.telegram.messenger.e20;
import org.telegram.messenger.gs;
import org.telegram.messenger.kj;
import org.telegram.messenger.n20;
import org.telegram.messenger.ri;
import org.telegram.messenger.si;
import org.telegram.messenger.u3;
import org.telegram.messenger.vi;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.a40;
import org.telegram.ui.e40;
import org.telegram.ui.eh;
import org.telegram.ui.q8;
import org.telegram.ui.un;
import org.telegram.ui.xb0;
public final class b0 implements org.telegram.ui.ActionBar.u1, e2.o, m4.o0, e2.j, NativeInstance.PayloadCallback, n20, t5.b, si {
    public final int f465a;
    public final int f466b;
    public final Object f467c;
    public final Object d;

    public b0(int i10, Object obj, Object obj2, int i11) {
        this.f465a = i11;
        this.f466b = i10;
        this.f467c = obj;
        this.d = obj2;
    }

    @Override
    public void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: ag.b0.accept(java.lang.Object):void");
    }

    @Override
    public void b(m4.w wVar) {
        byte[] bArr;
        m4.p0 p0Var = (m4.p0) this.f467c;
        n4.h hVar = (n4.h) this.d;
        if (TextUtils.isEmpty(hVar.f13499a)) {
            e2.a.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i10 = m4.o.f12869a;
        String str = hVar.f13499a;
        b2.d0 d0Var = new b2.d0();
        e9.l0 l0Var = e9.n0.f6390b;
        e9.x1 x1Var = e9.x1.e;
        List list = Collections.EMPTY_LIST;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var2 = b2.l0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        int i11 = 4;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(4);
        a0Var.f875b = hVar.f13504r;
        b2.l0 l0Var3 = new b2.l0(a0Var);
        CharSequence charSequence = hVar.f13500b;
        b2.r0 r0Var = new b2.r0();
        r0Var.f2202f = hVar.f13501c;
        r0Var.f2203g = hVar.d;
        r0Var.f2209n = hVar.h;
        Bundle bundle = null;
        r0Var.f2204i = m4.o.c(null);
        Bitmap bitmap = hVar.e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (hVar.f13502f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    hVar.f13502f = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e2.a.m("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = hVar.f13502f;
        }
        if (bArr != null) {
            r0Var.b(bArr, 3);
        }
        Bundle bundle2 = hVar.f13503n;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        }
        if (bundle != null && bundle.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            long j10 = bundle.getLong("android.media.extra.BT_FOLDER_TYPE");
            if (j10 != 0) {
                if (j10 == 1) {
                    i11 = 1;
                } else if (j10 == 2) {
                    i11 = 2;
                } else if (j10 == 3) {
                    i11 = 3;
                } else if (j10 != 4) {
                    if (j10 == 5) {
                        i11 = 5;
                    } else if (j10 == 6) {
                        i11 = 6;
                    }
                }
                r0Var.f2212q = Integer.valueOf(i11);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i11 = 0;
            r0Var.f2212q = Integer.valueOf(i11);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        r0Var.f2213r = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            r0Var.H = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            r0Var.J = e9.n0.u(e9.n0.u(stringArrayList));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            r0Var.f2199a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            r0Var.e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            r0Var.f2199a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            r0Var.I = bundle;
        }
        r0Var.f2214s = Boolean.TRUE;
        j9.y l4 = p0Var.h.l(wVar, e9.n0.y(new b2.p0(str2, new b2.e0(d0Var), null, new b2.j0(i0Var), new b2.s0(r0Var), l0Var3)));
        l4.a(new j9.u(0, l4, new a5.a(p0Var, wVar, this.f466b)), j9.r.f9764a);
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        ArrayList arrayList2;
        zf.n1 n1Var = (zf.n1) this.f467c;
        HashMap hashMap = (HashMap) this.d;
        zf.o1 o1Var = n1Var.f55613a;
        int i10 = o1Var.P;
        HashMap hashMap2 = o1Var.I;
        if (this.f466b == i10) {
            int size = arrayList.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                String str2 = ((ri) arrayList.get(i11)).f17936a;
                if (hashMap != null) {
                    arrayList2 = (ArrayList) hashMap.get(str2);
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    n1Var.a();
                    if (!hashMap2.containsKey(arrayList2)) {
                        hashMap2.put(arrayList2, str2);
                        o1Var.J.add(arrayList2);
                        z10 = true;
                    }
                }
            }
            if (z10) {
                o1Var.f();
            }
        }
    }

    @Override
    public Object g() {
        ((q5.d) ((ea.d) this.f467c).d).x((l5.i) this.d, this.f466b + 1, false);
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        switch (this.f465a) {
            case 0:
                f0 f0Var = (f0) this.f467c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = f0Var.getText().toString();
                if (obj.length() > 32) {
                    org.telegram.messenger.i0.E3(f0Var);
                    return;
                }
                s0 d = s0.d(this.f466b);
                TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                if (c10 != null) {
                    TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                    tL_inputBusinessChatLink.message = c10.message;
                    tL_inputBusinessChatLink.entities = c10.entities;
                    tL_inputBusinessChatLink.title = obj;
                    d.b(c10, tL_inputBusinessChatLink, null);
                }
                x1Var.dismiss();
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 9:
            case 14:
            default:
                StickersActivity.f0((StickersActivity) this.f467c, (ArrayList) this.d, this.f466b);
                return;
            case 5:
                un unVar = (un) this.f467c;
                boolean[] zArr = (boolean[]) this.d;
                unVar.getMessagesController().z3(unVar.e, unVar.f42054f, this.f466b, false, !zArr[1], zArr[0]);
                wb B = cc.B(unVar, true, null, null, unVar.f42288xa);
                B.j();
                bb bbVar = B.e;
                bbVar.postDelayed(new eh(0, bbVar), 550L);
                return;
            case 6:
                un.J0((un) this.f467c, this.f466b, (kj) this.d);
                return;
            case 7:
                r4 r4Var = (r4) this.f467c;
                gs gsVar = (gs) this.d;
                String trim = r4Var.getText().toString().trim();
                if (trim.length() <= this.f466b && !trim.isEmpty()) {
                    gsVar.a(trim);
                    x1Var.dismiss();
                    return;
                }
                org.telegram.messenger.i0.E3(r4Var);
                return;
            case 8:
                mm0 mm0Var = (mm0) this.f467c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = mm0Var.getText().toString();
                if (obj2.length() > 12) {
                    org.telegram.messenger.i0.E3(mm0Var);
                    return;
                }
                wp.r1(this.f466b).i4(obj2, sg.o0.d(reaction));
                x1Var.dismiss();
                return;
            case 10:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                e40 e40Var = ((a40) this.f467c).f35559o1;
                u3 u3Var = e40Var.f36726b.R2;
                String obj3 = editTextBoldCursor.getText().toString();
                int i12 = this.f466b;
                u3Var.A(i12, obj3);
                org.telegram.messenger.i0.v1(editTextBoldCursor);
                UndoView m12 = e40Var.f36726b.m1();
                if (i12 == 0) {
                    i11 = 39;
                } else {
                    i11 = 100;
                }
                m12.j(i11, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    return;
                }
                return;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) this.f467c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f33360d0;
                if (!arrayList.isEmpty() && org.telegram.messenger.i0.J1((org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList))) {
                    xb0 xb0Var = new xb0(0);
                    xb0Var.N0 = new i2.q(hashMap, this.f466b, 13);
                    launchActivity.t0(xb0Var);
                    return;
                }
                return;
            case 12:
                ((xb0) this.f467c).L0(900, this.f466b, (TLRPC.User) this.d);
                return;
            case 13:
                PasscodeActivity.Z((PasscodeActivity) this.f467c, (ac0) this.d, this.f466b);
                return;
            case 15:
                SessionsActivity.c0((SessionsActivity) this.f467c, this.f466b, (boolean[]) this.d);
                return;
        }
    }

    @Override
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.f467c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i10 = this.f466b;
        String str = "😀";
        String V = kj.V(document, "😀", Integer.valueOf(i10));
        if (!TextUtils.isEmpty(V)) {
            str = V;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = vi.Z(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = vi.a0(document, str);
        ConnectionsManager.getInstance(e20.f15506s0).sendRequest(tL_stickers_addStickerToSet, new q8(x1Var, i10, document, obj, tL_stickers_addStickerToSet, 3));
        try {
            x1Var.r(350L);
        } catch (Exception unused) {
        }
    }

    @Override
    public void invoke(Object obj) {
        b2.d1 d1Var = (b2.d1) obj;
        int i10 = this.f466b;
        d1Var.h(i10);
        d1Var.s((b2.e1) this.f467c, (b2.e1) this.d, i10);
    }

    @Override
    public void run(int i10, String str) {
        ((VoIPService) this.f467c).lambda$createGroupInstance$66(this.f466b, (boolean[]) this.d, i10, str);
    }

    public b0(Object obj, int i10, Object obj2, int i11) {
        this.f465a = i11;
        this.f467c = obj;
        this.f466b = i10;
        this.d = obj2;
    }

    public b0(Object obj, Object obj2, int i10, int i11) {
        this.f465a = i11;
        this.f467c = obj;
        this.d = obj2;
        this.f466b = i10;
    }
}
