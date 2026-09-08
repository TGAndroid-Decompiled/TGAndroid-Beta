package hg;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import bi.fa;
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
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.co;
import org.telegram.ui.i50;
import org.telegram.ui.id0;
import org.telegram.ui.jh;
import org.telegram.ui.m50;
public final class c2 implements MediaDataController.KeywordResultCallback, e2.m, org.telegram.ui.ActionBar.a2, m4.j0, NativeInstance.PayloadCallback, Utilities.Callback3Return, t5.b {
    public final int f11035a;
    public final int f11036b;
    public final Object f11037c;
    public final Object d;

    public c2(int i10, Object obj, Object obj2, int i11) {
        this.f11035a = i11;
        this.f11036b = i10;
        this.f11037c = obj;
        this.d = obj2;
    }

    @Override
    public void f(m4.r rVar) {
        byte[] bArr;
        byte[] bArr2;
        int i10;
        m4.k0 k0Var = (m4.k0) this.f11037c;
        n4.l lVar = (n4.l) this.d;
        if (TextUtils.isEmpty(lVar.f16486a)) {
            e2.a.n("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i11 = m4.k.f15994a;
        String str = lVar.f16486a;
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f8985b;
        e9.a1 a1Var = e9.a1.f8948e;
        List list = Collections.EMPTY_LIST;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var2 = b2.g0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        aa.a aVar = new aa.a(4);
        aVar.f384c = lVar.f16491n;
        b2.g0 g0Var3 = new b2.g0(aVar);
        CharSequence charSequence = lVar.f16487b;
        b2.m0 m0Var = new b2.m0();
        m0Var.f2178f = lVar.f16488c;
        m0Var.f2179g = lVar.d;
        m0Var.f2184m = lVar.f16490f;
        Bundle bundle = null;
        m0Var.f2180i = m4.k.c(null);
        Bitmap bitmap = lVar.f16489e;
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
            m0Var.f2182k = bArr2;
            m0Var.f2183l = 3;
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
                m0Var.f2187p = Integer.valueOf(i10);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i10 = 0;
            m0Var.f2187p = Integer.valueOf(i10);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        m0Var.f2188q = Boolean.FALSE;
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
            m0Var.f2174a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            m0Var.f2177e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            m0Var.f2174a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            m0Var.H = bundle;
        }
        m0Var.f2189r = Boolean.TRUE;
        i9.w l4 = k0Var.f15997g.l(rVar, e9.i0.z(new b2.k0(str2, new b2.z(yVar), null, new b2.e0(d0Var), new b2.n0(m0Var), g0Var3)));
        l4.a(new i9.s(0, l4, new a5.a(k0Var, rVar, this.f11036b)), i9.q.f11946a);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f11035a) {
            case 2:
                ig.s sVar = (ig.s) this.f11037c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(sVar);
                    return;
                }
                ig.y d = ig.y.d(this.f11036b);
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
            case 9:
            case 14:
            default:
                StickersActivity.a0((StickersActivity) this.f11037c, (ArrayList) this.d, this.f11036b);
                return;
            case 5:
                co coVar = (co) this.f11037c;
                boolean[] zArr = (boolean[]) this.d;
                coVar.getMessagesController().pinMessage(coVar.f35264e, coVar.f35276f, this.f11036b, false, !zArr[1], zArr[0]);
                qc B = yc.B(coVar, true, null, null, coVar.f35274ea);
                B.j();
                ub ubVar = B.f29702e;
                ubVar.postDelayed(new jh(0, ubVar), 550L);
                return;
            case 6:
                co.Q0((co) this.f11037c, this.f11036b, (MessageObject) this.d);
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f11037c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (trim.length() <= this.f11036b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    b2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 8:
                bn0 bn0Var = (bn0) this.f11037c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = bn0Var.getText().toString();
                if (obj2.length() > 12) {
                    AndroidUtilities.shakeView(bn0Var);
                    return;
                }
                MessagesController.getInstance(this.f11036b).renameSavedReactionTag(ah.j1.d(reaction), obj2);
                b2Var.dismiss();
                return;
            case 10:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                m50 m50Var = ((i50) this.f11037c).f37270n;
                ChatObject.Call call = m50Var.f38601b.f37540a1;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i12 = this.f11036b;
                call.toggleRecord(obj3, i12);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                UndoView k12 = m50Var.f38601b.k1();
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
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) this.f11037c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f33456d0;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((n2) i2.g.h(1, arrayList))) {
                    id0 id0Var = new id0(0);
                    id0Var.F0 = new i2.t(hashMap, this.f11036b, 11);
                    launchActivity.p0(id0Var);
                    return;
                }
                return;
            case 12:
                ((id0) this.f11037c).w0(900, (TLRPC.User) this.d, this.f11036b);
                return;
            case 13:
                PasscodeActivity.U((PasscodeActivity) this.f11037c, (vc0) this.d, this.f11036b);
                return;
            case 15:
                SessionsActivity.X((SessionsActivity) this.f11037c, this.f11036b, (boolean[]) this.d);
                return;
        }
    }

    @Override
    public Object i() {
        ((m2.t) ((da.b) this.f11037c).d).O((l5.i) this.d, this.f11036b + 1, false);
        return null;
    }

    @Override
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        int i10 = this.f11036b;
        z0Var.onPositionDiscontinuity(i10);
        z0Var.onPositionDiscontinuity((b2.a1) this.f11037c, (b2.a1) this.d, i10);
    }

    @Override
    public void run(int i10, String str) {
        ((VoIPService) this.f11037c).lambda$createGroupInstance$66(this.f11036b, (boolean[]) this.d, i10, str);
    }

    public c2(Object obj, int i10, Object obj2, int i11) {
        this.f11035a = i11;
        this.f11037c = obj;
        this.f11036b = i10;
        this.d = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        d2 d2Var = (d2) this.f11037c;
        HashMap hashMap = (HashMap) this.d;
        f2 f2Var = d2Var.f11046a;
        int i10 = f2Var.P;
        HashMap hashMap2 = f2Var.I;
        if (this.f11036b != i10) {
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
        this.f11035a = i11;
        this.f11037c = obj;
        this.d = obj2;
        this.f11036b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f11037c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        int i10 = this.f11036b;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i10));
        String str = TextUtils.isEmpty(findAnimatedEmojiEmoticon) ? "😀" : findAnimatedEmojiEmoticon;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new fa(b2Var, i10, document, obj, tL_stickers_addStickerToSet, 6));
        try {
            b2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
