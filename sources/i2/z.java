package i2;

import a8.ng;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import ig.d2;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.a50;
import org.telegram.ui.hh;
import org.telegram.ui.rc0;
import org.telegram.ui.w40;
import org.telegram.ui.wn;
import org.telegram.ui.xj0;
import org.telegram.ui.zj0;
public final class z implements e2.o, MediaDataController.KeywordResultCallback, b2, m4.o0, e2.j, NativeInstance.PayloadCallback, Utilities.Callback3Return, Utilities.Callback5, u5.b {
    public final int f13802a;
    public final int f13803b;
    public final Object f13804c;
    public final Object d;

    public z(int i10, Object obj, Object obj2, int i11) {
        this.f13802a = i11;
        this.f13803b = i10;
        this.f13804c = obj;
        this.d = obj2;
    }

    @Override
    public void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: i2.z.accept(java.lang.Object):void");
    }

    @Override
    public Object f() {
        ((s4.d) ((aa.b0) this.f13804c).f1032b).t((m5.i) this.d, this.f13803b + 1, false);
        return null;
    }

    @Override
    public void h(e2 e2Var, int i10) {
        int i11;
        switch (this.f13802a) {
            case 2:
                jg.t tVar = (jg.t) this.f13804c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = tVar.getText().toString();
                if (obj.length() > 32) {
                    AndroidUtilities.shakeView(tVar);
                    return;
                }
                jg.z d = jg.z.d(this.f13803b);
                TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                if (c10 != null) {
                    TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                    tL_inputBusinessChatLink.message = c10.message;
                    tL_inputBusinessChatLink.entities = c10.entities;
                    tL_inputBusinessChatLink.title = obj;
                    d.b(c10, tL_inputBusinessChatLink, null);
                }
                e2Var.dismiss();
                return;
            case 3:
            case 4:
            case 5:
            case 10:
            case 14:
            case 16:
            default:
                StickersActivity.b0((StickersActivity) this.f13804c, (ArrayList) this.d, this.f13803b);
                return;
            case 6:
                wn wnVar = (wn) this.f13804c;
                boolean[] zArr = (boolean[]) this.d;
                wnVar.getMessagesController().pinMessage(wnVar.e, wnVar.f45113f, this.f13803b, false, !zArr[1], zArr[0]);
                qc B = wc.B(wnVar, true, null, null, wnVar.f45309ua);
                B.j();
                ub ubVar = B.e;
                ubVar.postDelayed(new hh(0, ubVar), 550L);
                return;
            case 7:
                wn.p0((wn) this.f13804c, this.f13803b, (MessageObject) this.d);
                return;
            case 8:
                f5 f5Var = (f5) this.f13804c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = f5Var.getText().toString().trim();
                if (trim.length() <= this.f13803b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    e2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(f5Var);
                return;
            case 9:
                jo0 jo0Var = (jo0) this.f13804c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = jo0Var.getText().toString();
                if (obj2.length() > 12) {
                    AndroidUtilities.shakeView(jo0Var);
                    return;
                }
                MessagesController.getInstance(this.f13803b).renameSavedReactionTag(bh.x0.d(reaction), obj2);
                e2Var.dismiss();
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                a50 a50Var = ((w40) this.f13804c).f44512n;
                ChatObject.Call call = a50Var.f37695b.f45491a1;
                String obj3 = editTextBoldCursor.getText().toString();
                int i12 = this.f13803b;
                call.toggleRecord(obj3, i12);
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                UndoView k12 = a50Var.f37695b.k1();
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
                LaunchActivity launchActivity = (LaunchActivity) this.f13804c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f35553d0;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((r2) ic.a.g(1, arrayList))) {
                    rc0 rc0Var = new rc0(0);
                    rc0Var.E0 = new r(hashMap, this.f13803b, 12);
                    launchActivity.u0(rc0Var);
                    return;
                }
                return;
            case 13:
                ((rc0) this.f13804c).x0(900, (TLRPC.User) this.d, this.f13803b);
                return;
            case 15:
                PasscodeActivity.V((PasscodeActivity) this.f13804c, (nd0) this.d, this.f13803b);
                return;
            case 17:
                SessionsActivity.Y((SessionsActivity) this.f13804c, this.f13803b, (boolean[]) this.d);
                return;
        }
    }

    @Override
    public void i(m4.w wVar) {
        byte[] bArr;
        m4.p0 p0Var = (m4.p0) this.f13804c;
        n4.h hVar = (n4.h) this.d;
        if (TextUtils.isEmpty(hVar.f18662a)) {
            e2.a.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i10 = m4.o.f18170a;
        String str = hVar.f18662a;
        b2.d0 d0Var = new b2.d0();
        f9.g0 g0Var = f9.i0.f10286b;
        f9.s1 s1Var = f9.s1.e;
        List list = Collections.EMPTY_LIST;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        a8.h0 h0Var = new a8.h0(8, false);
        h0Var.f511b = hVar.f18667r;
        b2.l0 l0Var2 = new b2.l0(h0Var);
        CharSequence charSequence = hVar.f18663b;
        b2.r0 r0Var = new b2.r0();
        r0Var.f3365f = hVar.f18664c;
        r0Var.f3366g = hVar.d;
        r0Var.f3372n = hVar.h;
        Bundle bundle = null;
        r0Var.f3367i = m4.o.c(null);
        Bitmap bitmap = hVar.e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (hVar.f18665f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    hVar.f18665f = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e2.a.m("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = hVar.f18665f;
        }
        int i11 = 3;
        if (bArr != null) {
            r0Var.b(bArr, 3);
        }
        Bundle bundle2 = hVar.f18666n;
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
                r0Var.f3375q = Integer.valueOf(i11);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i11 = 0;
            r0Var.f3375q = Integer.valueOf(i11);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        r0Var.f3376r = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            r0Var.H = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            r0Var.J = f9.i0.u(f9.i0.u(stringArrayList));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            r0Var.f3362a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            r0Var.e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            r0Var.f3362a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            r0Var.I = bundle;
        }
        r0Var.f3377s = Boolean.TRUE;
        k9.y l4 = p0Var.f18180g.l(wVar, f9.i0.y(new b2.p0(str2, new b2.e0(d0Var), null, new b2.j0(i0Var), new b2.s0(r0Var), l0Var2)));
        l4.a(new k9.u(0, l4, new ng(p0Var, wVar, this.f13803b)), k9.r.f16490a);
    }

    @Override
    public void invoke(Object obj) {
        b2.e1 e1Var = (b2.e1) obj;
        int i10 = this.f13803b;
        e1Var.onPositionDiscontinuity(i10);
        e1Var.onPositionDiscontinuity((b2.f1) this.f13804c, (b2.f1) this.d, i10);
    }

    @Override
    public void run(int i10, String str) {
        ((VoIPService) this.f13804c).lambda$createGroupInstance$66(this.f13803b, (boolean[]) this.d, i10, str);
    }

    public z(Object obj, int i10, Object obj2, int i11) {
        this.f13802a = i11;
        this.f13804c = obj;
        this.f13803b = i10;
        this.d = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ig.b2 b2Var = (ig.b2) this.f13804c;
        HashMap hashMap = (HashMap) this.d;
        d2 d2Var = b2Var.f14007a;
        int i10 = d2Var.P;
        HashMap hashMap2 = d2Var.I;
        if (this.f13803b != i10) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                b2Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    d2Var.J.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            d2Var.l();
        }
    }

    public z(Object obj, Object obj2, int i10, int i11) {
        this.f13802a = i11;
        this.f13804c = obj;
        this.d = obj2;
        this.f13803b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f13804c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        int i10 = this.f13803b;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i10));
        String str = TextUtils.isEmpty(findAnimatedEmojiEmoticon) ? "😀" : findAnimatedEmojiEmoticon;
        e2 e2Var = new e2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new ag.p0(e2Var, i10, document, obj, tL_stickers_addStickerToSet, 9));
        try {
            e2Var.r(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        zj0 zj0Var = (zj0) this.f13804c;
        xj0 xj0Var = (xj0) this.d;
        u61 u61Var = (u61) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        Object obj6 = u61Var.G;
        if (obj6 instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj6;
            Bundle bundle = new Bundle();
            long dialogId = messageObject.getDialogId();
            bundle.putLong(dialogId < 0 ? "chat_id" : "user_id", Math.abs(dialogId));
            bundle.putInt("message_id", messageObject.getId());
            bundle.putBoolean("from_news", true);
            bundle.putBoolean("for_news", true);
            if (zj0Var.getMessagesController().checkCanOpenChat(bundle, zj0Var)) {
                wn wnVar = new wn(bundle);
                wnVar.f45208mb = messageObject;
                zj0Var.presentFragment(wnVar);
                return;
            }
            return;
        }
        int i10 = u61Var.d;
        if (i10 == -1) {
            zj0Var.l0(this.f13803b, xj0Var.f45723n);
        } else if (i10 == -2) {
            zj0Var.k0();
        }
    }
}
