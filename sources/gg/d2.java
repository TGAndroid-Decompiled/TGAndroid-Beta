package gg;

import ai.ya;
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
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.gd0;
import org.telegram.ui.gh;
import org.telegram.ui.h50;
import org.telegram.ui.l50;
import org.telegram.ui.yn;
public final class d2 implements MediaDataController.KeywordResultCallback, org.telegram.ui.ActionBar.a2, e2.m, m4.j0, e2.h, NativeInstance.PayloadCallback, Utilities.Callback3Return, t5.b {
    public final int f10556a;
    public final int f10557b;
    public final Object f10558c;
    public final Object d;

    public d2(int i10, Object obj, Object obj2, int i11) {
        this.f10556a = i11;
        this.f10557b = i10;
        this.f10558c = obj;
        this.d = obj2;
    }

    @Override
    public void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: gg.d2.accept(java.lang.Object):void");
    }

    @Override
    public void f(m4.r rVar) {
        byte[] bArr;
        byte[] bArr2;
        int i10;
        m4.k0 k0Var = (m4.k0) this.f10558c;
        n4.l lVar = (n4.l) this.d;
        if (TextUtils.isEmpty(lVar.f16603a)) {
            e2.a.n("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i11 = m4.k.f16206a;
        String str = lVar.f16603a;
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f8757b;
        e9.a1 a1Var = e9.a1.f8720e;
        List list = Collections.EMPTY_LIST;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var2 = b2.g0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        aa.a aVar = new aa.a(4);
        aVar.f387c = lVar.f16608n;
        b2.g0 g0Var3 = new b2.g0(aVar);
        CharSequence charSequence = lVar.f16604b;
        b2.m0 m0Var = new b2.m0();
        m0Var.f3345f = lVar.f16605c;
        m0Var.f3346g = lVar.d;
        m0Var.f3351m = lVar.f16607f;
        Bundle bundle = null;
        m0Var.f3347i = m4.k.c(null);
        Bitmap bitmap = lVar.f16606e;
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
            m0Var.f3349k = bArr2;
            m0Var.f3350l = 3;
        }
        Bundle bundle2 = lVar.h;
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
                m0Var.f3354p = Integer.valueOf(i10);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i10 = 0;
            m0Var.f3354p = Integer.valueOf(i10);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        m0Var.f3355q = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            m0Var.G = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            m0Var.I = e9.i0.v(e9.i0.v(stringArrayList));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            m0Var.f3341a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            m0Var.f3344e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            m0Var.f3341a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            m0Var.H = bundle;
        }
        m0Var.f3356r = Boolean.TRUE;
        i9.w l4 = k0Var.f16209g.l(rVar, e9.i0.z(new b2.k0(str2, new b2.z(yVar), null, new b2.e0(d0Var), new b2.n0(m0Var), g0Var3)));
        l4.a(new i9.s(0, l4, new a5.a(k0Var, rVar, this.f10557b)), i9.q.f12024a);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f10556a) {
            case 1:
                hg.s sVar = (hg.s) this.f10558c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(sVar);
                    return;
                }
                hg.y d = hg.y.d(this.f10557b);
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
            case 2:
            case 3:
            case 4:
            case 5:
            case 10:
            case 15:
            default:
                StickersActivity.Z((StickersActivity) this.f10558c, (ArrayList) this.d, this.f10557b);
                return;
            case 6:
                yn ynVar = (yn) this.f10558c;
                boolean[] zArr = (boolean[]) this.d;
                ynVar.getMessagesController().pinMessage(ynVar.f43315e, ynVar.f43327f, this.f10557b, false, !zArr[1], zArr[0]);
                rc B = yc.B(ynVar, true, null, null, ynVar.f43300ca);
                B.j();
                vb vbVar = B.f30335e;
                vbVar.postDelayed(new gh(0, vbVar), 550L);
                return;
            case 7:
                yn.N0((yn) this.f10558c, this.f10557b, (MessageObject) this.d);
                return;
            case 8:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f10558c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (trim.length() <= this.f10557b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    b2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 9:
                un0 un0Var = (un0) this.f10558c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = un0Var.getText().toString();
                if (obj2.length() > 12) {
                    AndroidUtilities.shakeView(un0Var);
                    return;
                }
                MessagesController.getInstance(this.f10557b).renameSavedReactionTag(zg.o0.d(reaction), obj2);
                b2Var.dismiss();
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                l50 l50Var = ((h50) this.f10558c).f36868n;
                ChatObject.Call call = l50Var.f38164b.f36874a1;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i12 = this.f10557b;
                call.toggleRecord(obj3, i12);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                UndoView k12 = l50Var.f38164b.k1();
                if (i12 == 0) {
                    i11 = 39;
                } else {
                    i11 = 100;
                }
                k12.j(i11, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    return;
                }
                return;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) this.f10558c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f33774d0;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((n2) hg.k0.g(1, arrayList))) {
                    gd0 gd0Var = new gd0(0);
                    gd0Var.F0 = new i2.s(hashMap, this.f10557b, 12);
                    launchActivity.p0(gd0Var);
                    return;
                }
                return;
            case 13:
                ((gd0) this.f10558c).w0(900, (TLRPC.User) this.d, this.f10557b);
                return;
            case 14:
                PasscodeActivity.S((PasscodeActivity) this.f10558c, (org.telegram.ui.Components.gd0) this.d, this.f10557b);
                return;
            case 16:
                SessionsActivity.W((SessionsActivity) this.f10558c, this.f10557b, (boolean[]) this.d);
                return;
        }
    }

    @Override
    public Object h() {
        ((la.h) ((da.b) this.f10558c).d).V((l5.i) this.d, this.f10557b + 1, false);
        return null;
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        int i10 = this.f10557b;
        z0Var.onPositionDiscontinuity(i10);
        z0Var.onPositionDiscontinuity((b2.a1) this.f10558c, (b2.a1) this.d, i10);
    }

    @Override
    public void run(int i10, String str) {
        ((VoIPService) this.f10558c).lambda$createGroupInstance$66(this.f10557b, (boolean[]) this.d, i10, str);
    }

    public d2(Object obj, int i10, Object obj2, int i11) {
        this.f10556a = i11;
        this.f10558c = obj;
        this.f10557b = i10;
        this.d = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        e2 e2Var = (e2) this.f10558c;
        HashMap hashMap = (HashMap) this.d;
        g2 g2Var = e2Var.f10571a;
        int i10 = g2Var.P;
        HashMap hashMap2 = g2Var.I;
        if (this.f10557b != i10) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                e2Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    g2Var.J.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            g2Var.l();
        }
    }

    public d2(Object obj, Object obj2, int i10, int i11) {
        this.f10556a = i11;
        this.f10558c = obj;
        this.d = obj2;
        this.f10557b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f10558c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        int i10 = this.f10557b;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i10));
        String str = TextUtils.isEmpty(findAnimatedEmojiEmoticon) ? "😀" : findAnimatedEmojiEmoticon;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new ya(b2Var, i10, document, obj, tL_stickers_addStickerToSet, 6));
        try {
            b2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
