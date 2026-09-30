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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.c50;
import org.telegram.ui.cd0;
import org.telegram.ui.g50;
import org.telegram.ui.kh;
import org.telegram.ui.wn;
public final class d2 implements MediaDataController.KeywordResultCallback, org.telegram.ui.ActionBar.z1, e2.m, m4.j0, e2.h, NativeInstance.PayloadCallback, Utilities.Callback3Return, t5.b {
    public final int f9707a;
    public final int f9708b;
    public final Object f9709c;
    public final Object d;

    public d2(int i10, Object obj, Object obj2, int i11) {
        this.f9707a = i11;
        this.f9708b = i10;
        this.f9709c = obj;
        this.d = obj2;
    }

    @Override
    public void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: gg.d2.accept(java.lang.Object):void");
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        switch (this.f9707a) {
            case 1:
                hg.u uVar = (hg.u) this.f9709c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = uVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(uVar);
                    return;
                }
                hg.a0 d = hg.a0.d(this.f9708b);
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
                StickersActivity.a0((StickersActivity) this.f9709c, (ArrayList) this.d, this.f9708b);
                return;
            case 6:
                wn wnVar = (wn) this.f9709c;
                boolean[] zArr = (boolean[]) this.d;
                wnVar.getMessagesController().pinMessage(wnVar.e, wnVar.f39564f, this.f9708b, false, !zArr[1], zArr[0]);
                rc B = yc.B(wnVar, true, null, null, wnVar.f39562ea);
                B.j();
                vb vbVar = B.e;
                vbVar.postDelayed(new kh(0, vbVar), 550L);
                return;
            case 7:
                wn.d0((wn) this.f9709c, this.f9708b, (MessageObject) this.d);
                return;
            case 8:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f9709c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (trim.length() <= this.f9708b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    a2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 9:
                rn0 rn0Var = (rn0) this.f9709c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = rn0Var.getText().toString();
                if (obj2.length() > 12) {
                    AndroidUtilities.shakeView(rn0Var);
                    return;
                }
                MessagesController.getInstance(this.f9708b).renameSavedReactionTag(zg.o0.d(reaction), obj2);
                a2Var.dismiss();
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                g50 g50Var = ((c50) this.f9709c).f32656n;
                ChatObject.Call call = g50Var.f33969b.f33013a1;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i12 = this.f9708b;
                call.toggleRecord(obj3, i12);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                UndoView k12 = g50Var.f33969b.k1();
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
                LaunchActivity launchActivity = (LaunchActivity) this.f9709c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f31180d0;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((m2) hg.c.g(1, arrayList))) {
                    cd0 cd0Var = new cd0(0);
                    cd0Var.F0 = new i2.s(hashMap, this.f9708b, 12);
                    launchActivity.p0(cd0Var);
                    return;
                }
                return;
            case 13:
                ((cd0) this.f9709c).w0(900, (TLRPC.User) this.d, this.f9708b);
                return;
            case 14:
                PasscodeActivity.U((PasscodeActivity) this.f9709c, (hd0) this.d, this.f9708b);
                return;
            case 16:
                SessionsActivity.X((SessionsActivity) this.f9709c, this.f9708b, (boolean[]) this.d);
                return;
        }
    }

    @Override
    public void g(m4.r rVar) {
        byte[] bArr;
        byte[] bArr2;
        int i10;
        m4.k0 k0Var = (m4.k0) this.f9709c;
        n4.l lVar = (n4.l) this.d;
        if (TextUtils.isEmpty(lVar.f15204a)) {
            e2.a.n("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i11 = m4.k.f14865a;
        String str = lVar.f15204a;
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f8078b;
        e9.a1 a1Var = e9.a1.e;
        List list = Collections.EMPTY_LIST;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var2 = b2.g0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        aa.a aVar = new aa.a(4);
        aVar.f360c = lVar.f15208n;
        b2.g0 g0Var3 = new b2.g0(aVar);
        CharSequence charSequence = lVar.f15205b;
        b2.m0 m0Var = new b2.m0();
        m0Var.f3097f = lVar.f15206c;
        m0Var.f3098g = lVar.d;
        m0Var.f3103m = lVar.f15207f;
        Bundle bundle = null;
        m0Var.f3099i = m4.k.c(null);
        Bitmap bitmap = lVar.e;
        if (bitmap != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e2.a.o("LegacyConversions", "Failed to convert iconBitmap to artworkData", e);
                bArr = null;
            }
            if (bArr == null) {
                bArr2 = null;
            } else {
                bArr2 = (byte[]) bArr.clone();
            }
            m0Var.f3101k = bArr2;
            m0Var.f3102l = 3;
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
                m0Var.f3106p = Integer.valueOf(i10);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i10 = 0;
            m0Var.f3106p = Integer.valueOf(i10);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        m0Var.f3107q = Boolean.FALSE;
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
            m0Var.f3094a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            m0Var.e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            m0Var.f3094a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            m0Var.H = bundle;
        }
        m0Var.f3108r = Boolean.TRUE;
        i9.w l4 = k0Var.f14868g.l(rVar, e9.i0.z(new b2.k0(str2, new b2.z(yVar), null, new b2.e0(d0Var), new b2.n0(m0Var), g0Var3)));
        l4.a(new i9.s(0, l4, new a5.a(k0Var, rVar, this.f9708b)), i9.q.f11053a);
    }

    @Override
    public Object i() {
        ((la.h) ((da.b) this.f9709c).d).V((l5.i) this.d, this.f9708b + 1, false);
        return null;
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        int i10 = this.f9708b;
        z0Var.onPositionDiscontinuity(i10);
        z0Var.onPositionDiscontinuity((b2.a1) this.f9709c, (b2.a1) this.d, i10);
    }

    @Override
    public void run(int i10, String str) {
        ((VoIPService) this.f9709c).lambda$createGroupInstance$66(this.f9708b, (boolean[]) this.d, i10, str);
    }

    public d2(Object obj, int i10, Object obj2, int i11) {
        this.f9707a = i11;
        this.f9709c = obj;
        this.f9708b = i10;
        this.d = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        e2 e2Var = (e2) this.f9709c;
        HashMap hashMap = (HashMap) this.d;
        g2 g2Var = e2Var.f9721a;
        int i10 = g2Var.P;
        HashMap hashMap2 = g2Var.I;
        if (this.f9708b != i10) {
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
        this.f9707a = i11;
        this.f9709c = obj;
        this.d = obj2;
        this.f9708b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f9709c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        int i10 = this.f9708b;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i10));
        String str = TextUtils.isEmpty(findAnimatedEmojiEmoticon) ? "😀" : findAnimatedEmojiEmoticon;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new ya(a2Var, i10, document, obj, tL_stickers_addStickerToSet, 6));
        try {
            a2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
