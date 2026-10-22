package hg;

import ai.sb;
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
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.dh;
import org.telegram.ui.nc0;
import org.telegram.ui.p40;
import org.telegram.ui.qn;
import org.telegram.ui.t40;
public final class b2 implements MediaDataController.KeywordResultCallback, e2.o, org.telegram.ui.ActionBar.a2, m4.o0, e2.j, NativeInstance.PayloadCallback, Utilities.Callback3Return, t5.b {
    public final int f11812a;
    public final int f11813b;
    public final Object f11814c;
    public final Object d;

    public b2(int i10, Object obj, Object obj2, int i11) {
        this.f11812a = i11;
        this.f11813b = i10;
        this.f11814c = obj;
        this.d = obj2;
    }

    @Override
    public void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: hg.b2.accept(java.lang.Object):void");
    }

    @Override
    public void f(m4.v vVar) {
        byte[] bArr;
        m4.p0 p0Var = (m4.p0) this.f11814c;
        n4.h hVar = (n4.h) this.d;
        if (TextUtils.isEmpty(hVar.f17092a)) {
            e2.a.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i10 = m4.n.f16643a;
        String str = hVar.f17092a;
        b2.c0 c0Var = new b2.c0();
        e9.l0 l0Var = e9.n0.f8474b;
        e9.x1 x1Var = e9.x1.e;
        List list = Collections.EMPTY_LIST;
        b2.h0 h0Var = new b2.h0();
        b2.k0 k0Var = b2.k0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        int i11 = 3;
        androidx.biometric.e eVar = new androidx.biometric.e(3);
        eVar.f2815b = hVar.f17097r;
        b2.k0 k0Var2 = new b2.k0(eVar);
        CharSequence charSequence = hVar.f17093b;
        b2.q0 q0Var = new b2.q0();
        q0Var.f3907f = hVar.f17094c;
        q0Var.f3908g = hVar.d;
        q0Var.f3914n = hVar.h;
        Bundle bundle = null;
        q0Var.f3909i = m4.n.c(null);
        Bitmap bitmap = hVar.e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (hVar.f17095f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    hVar.f17095f = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e2.a.m("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = hVar.f17095f;
        }
        if (bArr != null) {
            q0Var.b(bArr, 3);
        }
        Bundle bundle2 = hVar.f17096n;
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
                } else if (j10 != 3) {
                    if (j10 == 4) {
                        i11 = 4;
                    } else if (j10 == 5) {
                        i11 = 5;
                    } else if (j10 == 6) {
                        i11 = 6;
                    }
                }
                q0Var.f3917q = Integer.valueOf(i11);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i11 = 0;
            q0Var.f3917q = Integer.valueOf(i11);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        q0Var.f3918r = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            q0Var.H = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            q0Var.J = e9.n0.u(e9.n0.u(stringArrayList));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            q0Var.f3904a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            q0Var.e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            q0Var.f3904a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            q0Var.I = bundle;
        }
        q0Var.f3919s = Boolean.TRUE;
        j9.y l4 = p0Var.f16661g.l(vVar, e9.n0.y(new b2.o0(str2, new b2.d0(c0Var), null, new b2.i0(h0Var), new b2.r0(q0Var), k0Var2)));
        l4.a(new j9.u(0, l4, new a5.a(p0Var, vVar, this.f11813b)), j9.r.f14356a);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f11812a) {
            case 2:
                ig.s sVar = (ig.s) this.f11814c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(sVar);
                    return;
                }
                ig.y d = ig.y.d(this.f11813b);
                TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                if (c10 != null) {
                    TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                    tL_inputBusinessChatLink.message = c10.message;
                    tL_inputBusinessChatLink.entities = c10.entities;
                    tL_inputBusinessChatLink.title = obj;
                    d.b(c10, tL_inputBusinessChatLink, null);
                }
                b2Var.dismiss();
                return;
            case 3:
            case 4:
            case 5:
            case 10:
            case 15:
            default:
                StickersActivity.a0((StickersActivity) this.f11814c, (ArrayList) this.d, this.f11813b);
                return;
            case 6:
                qn qnVar = (qn) this.f11814c;
                boolean[] zArr = (boolean[]) this.d;
                qnVar.getMessagesController().pinMessage(qnVar.e, qnVar.f40679f, this.f11813b, false, !zArr[1], zArr[0]);
                qc B = xc.B(qnVar, true, null, null, qnVar.f40676ea);
                B.j();
                ub ubVar = B.e;
                ubVar.postDelayed(new dh(0, ubVar), 550L);
                return;
            case 7:
                qn.s0((qn) this.f11814c, this.f11813b, (MessageObject) this.d);
                return;
            case 8:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f11814c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (trim.length() <= this.f11813b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    b2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 9:
                ao0 ao0Var = (ao0) this.f11814c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = ao0Var.getText().toString();
                if (obj2.length() > 12) {
                    AndroidUtilities.shakeView(ao0Var);
                    return;
                }
                MessagesController.getInstance(this.f11813b).renameSavedReactionTag(ah.i1.d(reaction), obj2);
                b2Var.dismiss();
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                t40 t40Var = ((p40) this.f11814c).f40064n;
                ChatObject.Call call = t40Var.f41595b.f40379a1;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i12 = this.f11813b;
                call.toggleRecord(obj3, i12);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                UndoView l1 = t40Var.f41595b.l1();
                if (i12 == 0) {
                    i11 = 39;
                } else {
                    i11 = 100;
                }
                l1.j(i11, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    return;
                }
                return;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) this.f11814c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f33165d0;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((n2) i2.e.h(1, arrayList))) {
                    nc0 nc0Var = new nc0(0);
                    nc0Var.F0 = new i2.s(hashMap, this.f11813b, 12);
                    launchActivity.t0(nc0Var);
                    return;
                }
                return;
            case 13:
                ((nc0) this.f11814c).v0(900, (TLRPC.User) this.d, this.f11813b);
                return;
            case 14:
                PasscodeActivity.U((PasscodeActivity) this.f11814c, (od0) this.d, this.f11813b);
                return;
            case 16:
                SessionsActivity.X((SessionsActivity) this.f11814c, this.f11813b, (boolean[]) this.d);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        b2.d1 d1Var = (b2.d1) obj;
        int i10 = this.f11813b;
        d1Var.onPositionDiscontinuity(i10);
        d1Var.onPositionDiscontinuity((b2.e1) this.f11814c, (b2.e1) this.d, i10);
    }

    @Override
    public Object j() {
        ((g3) ((ea.b) this.f11814c).d).U((l5.i) this.d, this.f11813b + 1, false);
        return null;
    }

    @Override
    public void run(int i10, String str) {
        ((VoIPService) this.f11814c).lambda$createGroupInstance$66(this.f11813b, (boolean[]) this.d, i10, str);
    }

    public b2(Object obj, int i10, Object obj2, int i11) {
        this.f11812a = i11;
        this.f11814c = obj;
        this.f11813b = i10;
        this.d = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        c2 c2Var = (c2) this.f11814c;
        HashMap hashMap = (HashMap) this.d;
        e2 e2Var = c2Var.f11827a;
        int i10 = e2Var.P;
        HashMap hashMap2 = e2Var.I;
        if (this.f11813b != i10) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                c2Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    e2Var.J.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            e2Var.l();
        }
    }

    public b2(Object obj, Object obj2, int i10, int i11) {
        this.f11812a = i11;
        this.f11814c = obj;
        this.d = obj2;
        this.f11813b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f11814c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        int i10 = this.f11813b;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i10));
        String str = TextUtils.isEmpty(findAnimatedEmojiEmoticon) ? "😀" : findAnimatedEmojiEmoticon;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new sb(b2Var, i10, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            b2Var.r(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
