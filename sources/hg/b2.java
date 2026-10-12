package hg;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import bi.ia;
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
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.fo;
import org.telegram.ui.m50;
import org.telegram.ui.nd0;
import org.telegram.ui.q50;
import org.telegram.ui.rh;
public final class b2 implements MediaDataController.KeywordResultCallback, e2.o, org.telegram.ui.ActionBar.z1, m4.p0, e2.j, NativeInstance.PayloadCallback, Utilities.Callback3Return, t5.b {
    public final int f10504a;
    public final int f10505b;
    public final Object f10506c;
    public final Object d;

    public b2(int i10, Object obj, Object obj2, int i11) {
        this.f10504a = i11;
        this.f10505b = i10;
        this.f10506c = obj;
        this.d = obj2;
    }

    @Override
    public void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: hg.b2.accept(java.lang.Object):void");
    }

    @Override
    public void f(m4.w wVar) {
        byte[] bArr;
        m4.q0 q0Var = (m4.q0) this.f10506c;
        n4.h hVar = (n4.h) this.d;
        if (TextUtils.isEmpty(hVar.f15998a)) {
            e2.a.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i10 = m4.o.f15555a;
        String str = hVar.f15998a;
        b2.d0 d0Var = new b2.d0();
        e9.l0 l0Var = e9.n0.f8592b;
        e9.x1 x1Var = e9.x1.e;
        List list = Collections.EMPTY_LIST;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var2 = b2.l0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        int i11 = 3;
        androidx.biometric.e eVar = new androidx.biometric.e(3);
        eVar.f1196b = hVar.f16003r;
        b2.l0 l0Var3 = new b2.l0(eVar);
        CharSequence charSequence = hVar.f15999b;
        b2.r0 r0Var = new b2.r0();
        r0Var.f2298f = hVar.f16000c;
        r0Var.f2299g = hVar.d;
        r0Var.f2305n = hVar.h;
        Bundle bundle = null;
        r0Var.f2300i = m4.o.c(null);
        Bitmap bitmap = hVar.e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (hVar.f16001f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    hVar.f16001f = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e2.a.m("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = hVar.f16001f;
        }
        if (bArr != null) {
            r0Var.b(bArr, 3);
        }
        Bundle bundle2 = hVar.f16002n;
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
                r0Var.f2308q = Integer.valueOf(i11);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i11 = 0;
            r0Var.f2308q = Integer.valueOf(i11);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        r0Var.f2309r = Boolean.FALSE;
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
            r0Var.f2295a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            r0Var.e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            r0Var.f2295a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            r0Var.I = bundle;
        }
        r0Var.f2310s = Boolean.TRUE;
        j9.y l4 = q0Var.f15573g.l(wVar, e9.n0.y(new b2.p0(str2, new b2.e0(d0Var), null, new b2.j0(i0Var), new b2.s0(r0Var), l0Var3)));
        l4.a(new j9.u(0, l4, new a5.a(q0Var, wVar, this.f10505b)), j9.r.f12940a);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        switch (this.f10504a) {
            case 2:
                ig.s sVar = (ig.s) this.f10506c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = sVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(sVar);
                    return;
                }
                ig.y d = ig.y.d(this.f10505b);
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
            case 3:
            case 4:
            case 5:
            case 10:
            case 15:
            default:
                StickersActivity.a0((StickersActivity) this.f10506c, (ArrayList) this.d, this.f10505b);
                return;
            case 6:
                fo foVar = (fo) this.f10506c;
                boolean[] zArr = (boolean[]) this.d;
                foVar.getMessagesController().pinMessage(foVar.e, foVar.f35935f, this.f10505b, false, !zArr[1], zArr[0]);
                sc B = zc.B(foVar, true, null, null, foVar.f35932ea);
                B.j();
                wb wbVar = B.e;
                wbVar.postDelayed(new rh(0, wbVar), 550L);
                return;
            case 7:
                fo.s0((fo) this.f10506c, this.f10505b, (MessageObject) this.d);
                return;
            case 8:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f10506c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (trim.length() <= this.f10505b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    a2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 9:
                eo0 eo0Var = (eo0) this.f10506c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = eo0Var.getText().toString();
                if (obj2.length() > 12) {
                    AndroidUtilities.shakeView(eo0Var);
                    return;
                }
                MessagesController.getInstance(this.f10505b).renameSavedReactionTag(ah.i1.d(reaction), obj2);
                a2Var.dismiss();
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                q50 q50Var = ((m50) this.f10506c).f38165n;
                ChatObject.Call call = q50Var.f39344b.f38442a1;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i12 = this.f10505b;
                call.toggleRecord(obj3, i12);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                UndoView l1 = q50Var.f39344b.l1();
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
                LaunchActivity launchActivity = (LaunchActivity) this.f10506c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f32109d0;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((m2) i2.d.g(1, arrayList))) {
                    nd0 nd0Var = new nd0(0);
                    nd0Var.F0 = new i2.r(hashMap, this.f10505b, 12);
                    launchActivity.p0(nd0Var);
                    return;
                }
                return;
            case 13:
                ((nd0) this.f10506c).v0(900, (TLRPC.User) this.d, this.f10505b);
                return;
            case 14:
                PasscodeActivity.U((PasscodeActivity) this.f10506c, (ud0) this.d, this.f10505b);
                return;
            case 16:
                SessionsActivity.X((SessionsActivity) this.f10506c, this.f10505b, (boolean[]) this.d);
                return;
        }
    }

    @Override
    public Object h() {
        ((li.k) ((ea.b) this.f10506c).d).U((l5.i) this.d, this.f10505b + 1, false);
        return null;
    }

    @Override
    public void invoke(Object obj) {
        b2.e1 e1Var = (b2.e1) obj;
        int i10 = this.f10505b;
        e1Var.onPositionDiscontinuity(i10);
        e1Var.onPositionDiscontinuity((b2.f1) this.f10506c, (b2.f1) this.d, i10);
    }

    @Override
    public void run(int i10, String str) {
        ((VoIPService) this.f10506c).lambda$createGroupInstance$66(this.f10505b, (boolean[]) this.d, i10, str);
    }

    public b2(Object obj, int i10, Object obj2, int i11) {
        this.f10504a = i11;
        this.f10506c = obj;
        this.f10505b = i10;
        this.d = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        c2 c2Var = (c2) this.f10506c;
        HashMap hashMap = (HashMap) this.d;
        e2 e2Var = c2Var.f10519a;
        int i10 = e2Var.P;
        HashMap hashMap2 = e2Var.I;
        if (this.f10505b != i10) {
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
        this.f10504a = i11;
        this.f10506c = obj;
        this.d = obj2;
        this.f10505b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f10506c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        int i10 = this.f10505b;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i10));
        String str = TextUtils.isEmpty(findAnimatedEmojiEmoticon) ? "😀" : findAnimatedEmojiEmoticon;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new ia(a2Var, i10, document, obj, tL_stickers_addStickerToSet, 6));
        try {
            a2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
