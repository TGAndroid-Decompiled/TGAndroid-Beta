package gg;

import ai.za;
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
import m.f3;
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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.eo;
import org.telegram.ui.h50;
import org.telegram.ui.id0;
import org.telegram.ui.l50;
import org.telegram.ui.rh;
public final class c2 implements MediaDataController.KeywordResultCallback, org.telegram.ui.ActionBar.z1, e2.m, m4.l0, e2.h, NativeInstance.PayloadCallback, Utilities.Callback3Return, t5.b {
    public final int f10560a;
    public final int f10561b;
    public final Object f10562c;
    public final Object d;

    public c2(int i10, Object obj, Object obj2, int i11) {
        this.f10560a = i11;
        this.f10561b = i10;
        this.f10562c = obj;
        this.d = obj2;
    }

    @Override
    public void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: gg.c2.accept(java.lang.Object):void");
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        switch (this.f10560a) {
            case 1:
                hg.t tVar = (hg.t) this.f10562c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = tVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(tVar);
                    return;
                }
                hg.z d = hg.z.d(this.f10561b);
                TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                if (c10 != null) {
                    TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                    tL_inputBusinessChatLink.message = c10.message;
                    tL_inputBusinessChatLink.entities = c10.entities;
                    tL_inputBusinessChatLink.title = obj;
                    d.b(c10, tL_inputBusinessChatLink, null);
                }
                a2Var.dismiss();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 10:
            case 15:
            default:
                StickersActivity.a0((StickersActivity) this.f10562c, (ArrayList) this.d, this.f10561b);
                return;
            case 6:
                eo eoVar = (eo) this.f10562c;
                boolean[] zArr = (boolean[]) this.d;
                eoVar.getMessagesController().pinMessage(eoVar.f37246e, eoVar.f37258f, this.f10561b, false, !zArr[1], zArr[0]);
                sc B = zc.B(eoVar, true, null, null, eoVar.f37256ea);
                B.j();
                wb wbVar = B.f30532e;
                wbVar.postDelayed(new rh(0, wbVar), 550L);
                return;
            case 7:
                eo.s0((eo) this.f10562c, this.f10561b, (MessageObject) this.d);
                return;
            case 8:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f10562c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (trim.length() <= this.f10561b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    a2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 9:
                no0 no0Var = (no0) this.f10562c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = no0Var.getText().toString();
                if (obj2.length() > 12) {
                    AndroidUtilities.shakeView(no0Var);
                    return;
                }
                MessagesController.getInstance(this.f10561b).renameSavedReactionTag(zg.n0.d(reaction), obj2);
                a2Var.dismiss();
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                l50 l50Var = ((h50) this.f10562c).f38247n;
                ChatObject.Call call = l50Var.f39640b.f38681a1;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i12 = this.f10561b;
                call.toggleRecord(obj3, i12);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                UndoView l1 = l50Var.f39640b.l1();
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
                LaunchActivity launchActivity = (LaunchActivity) this.f10562c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f33622d0;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((m2) hg.c.h(1, arrayList))) {
                    id0 id0Var = new id0(0);
                    id0Var.F0 = new i2.s(hashMap, this.f10561b, 12);
                    launchActivity.p0(id0Var);
                    return;
                }
                return;
            case 13:
                ((id0) this.f10562c).v0(900, (TLRPC.User) this.d, this.f10561b);
                return;
            case 14:
                PasscodeActivity.U((PasscodeActivity) this.f10562c, (yd0) this.d, this.f10561b);
                return;
            case 16:
                SessionsActivity.X((SessionsActivity) this.f10562c, this.f10561b, (boolean[]) this.d);
                return;
        }
    }

    @Override
    public void g(m4.r rVar) {
        byte[] bArr;
        byte[] bArr2;
        int i10;
        m4.m0 m0Var = (m4.m0) this.f10562c;
        n4.m mVar = (n4.m) this.d;
        if (TextUtils.isEmpty(mVar.f16327a)) {
            e2.a.n("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i11 = m4.k.f15869a;
        String str = mVar.f16327a;
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f8749b;
        e9.a1 a1Var = e9.a1.f8712e;
        List list = Collections.EMPTY_LIST;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var2 = b2.g0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        aa.a aVar = new aa.a(4);
        aVar.f387c = mVar.f16332n;
        b2.g0 g0Var3 = new b2.g0(aVar);
        CharSequence charSequence = mVar.f16328b;
        b2.m0 m0Var2 = new b2.m0();
        m0Var2.f3422f = mVar.f16329c;
        m0Var2.f3423g = mVar.d;
        m0Var2.f3428m = mVar.f16331f;
        Bundle bundle = null;
        m0Var2.f3424i = m4.k.c(null);
        Bitmap bitmap = mVar.f16330e;
        if (bitmap != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e7) {
                e2.a.o("LegacyConversions", "Failed to convert iconBitmap to artworkData", e7);
                bArr = null;
            }
            if (bArr == null) {
                bArr2 = null;
            } else {
                bArr2 = (byte[]) bArr.clone();
            }
            m0Var2.f3426k = bArr2;
            m0Var2.f3427l = 3;
        }
        Bundle bundle2 = mVar.h;
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
                } else if (j3 == 3) {
                    i10 = 3;
                } else if (j3 == 4) {
                    i10 = 4;
                } else if (j3 == 5) {
                    i10 = 5;
                } else if (j3 == 6) {
                    i10 = 6;
                }
                m0Var2.f3431p = Integer.valueOf(i10);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i10 = 0;
            m0Var2.f3431p = Integer.valueOf(i10);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        m0Var2.f3432q = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            m0Var2.G = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            m0Var2.I = e9.i0.v(e9.i0.v(stringArrayList));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            m0Var2.f3418a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            m0Var2.f3421e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            m0Var2.f3418a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            m0Var2.H = bundle;
        }
        m0Var2.f3433r = Boolean.TRUE;
        i9.w l4 = m0Var.f15906g.l(rVar, e9.i0.z(new b2.k0(str2, new b2.z(yVar), null, new b2.e0(d0Var), new b2.n0(m0Var2), g0Var3)));
        l4.a(new i9.s(0, l4, new a5.a(m0Var, rVar, this.f10561b)), i9.q.f12073a);
    }

    @Override
    public Object i() {
        ((f3) ((da.c) this.f10562c).d).V((l5.i) this.d, this.f10561b + 1, false);
        return null;
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        int i10 = this.f10561b;
        z0Var.onPositionDiscontinuity(i10);
        z0Var.onPositionDiscontinuity((b2.a1) this.f10562c, (b2.a1) this.d, i10);
    }

    @Override
    public void run(int i10, String str) {
        ((VoIPService) this.f10562c).lambda$createGroupInstance$66(this.f10561b, (boolean[]) this.d, i10, str);
    }

    public c2(Object obj, int i10, Object obj2, int i11) {
        this.f10560a = i11;
        this.f10562c = obj;
        this.f10561b = i10;
        this.d = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        d2 d2Var = (d2) this.f10562c;
        HashMap hashMap = (HashMap) this.d;
        f2 f2Var = d2Var.f10573a;
        int i10 = f2Var.P;
        HashMap hashMap2 = f2Var.I;
        if (this.f10561b != i10) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                d2Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    f2Var.J.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            f2Var.l();
        }
    }

    public c2(Object obj, Object obj2, int i10, int i11) {
        this.f10560a = i11;
        this.f10562c = obj;
        this.d = obj2;
        this.f10561b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f10562c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        int i10 = this.f10561b;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i10));
        String str = TextUtils.isEmpty(findAnimatedEmojiEmoticon) ? "😀" : findAnimatedEmojiEmoticon;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new za(a2Var, i10, document, obj, tL_stickers_addStickerToSet, 6));
        try {
            a2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
