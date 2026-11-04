package ai;

import android.widget.ImageView;
import ci.e9;
import gi.o8;
import gi.r8;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ad;
import org.telegram.ui.bo;
import org.telegram.ui.hm;
import org.telegram.ui.ip;
import org.telegram.ui.wm;
import org.telegram.ui.y9;
public final class t6 implements Runnable {
    public final int f989a;
    public final Object f990b;
    public final Object f991c;
    public final Object d;
    public final Object f992e;
    public final Object f993f;

    public t6(e9 e9Var, TLRPC.TL_error tL_error, n10 n10Var, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, int i3) {
        this.f989a = i3;
        this.f991c = e9Var;
        this.f990b = tL_error;
        this.f992e = n10Var;
        this.d = tLObject;
        this.f993f = tL_inputInvoiceStars;
    }

    private final void a() {
        ad adVar = (ad) this.f991c;
        String str = (String) this.f992e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f990b;
        TLObject tLObject = (TLObject) this.d;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f993f;
        adVar.Y = 0;
        String str2 = adVar.Z;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                adVar.W.setText(bd.a0("LinkAvailable", null, 2131748932, str));
                org.telegram.ui.Cells.b2 b2Var = adVar.W;
                int i3 = org.telegram.ui.ActionBar.k6.f28234w6;
                b2Var.setTag(Integer.valueOf(i3));
                org.telegram.ui.ActionBar.r6.V(adVar.W, i3, null);
                adVar.f43728b0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                adVar.W.setText(bd.M0(2131743664, null));
                org.telegram.ui.ActionBar.r6.V(adVar.W, org.telegram.ui.ActionBar.k6.f28102p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    adVar.W.setText(bd.M0(2131743663, null));
                } else {
                    adVar.W.setText(bd.M0(2131743667, null));
                }
                org.telegram.ui.ActionBar.r6.V(adVar.W, org.telegram.ui.ActionBar.k6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.ui.ActionBar.r6.V(adVar.W, org.telegram.ui.ActionBar.k6.f28102p7, null);
                adVar.f43741l0 = false;
                adVar.l0();
            } else {
                org.telegram.ui.ActionBar.r6.V(adVar.W, org.telegram.ui.ActionBar.k6.f28102p7, null);
                adVar.W.setText(bd.M0(2131748920, null));
            }
            adVar.f43728b0 = false;
        }
    }

    private final void b() {
        wm wmVar = (wm) this.f991c;
        boolean[] zArr = (boolean[]) this.d;
        boolean[] zArr2 = (boolean[]) this.f992e;
        ImageView imageView = (ImageView) this.f990b;
        ImageView imageView2 = (ImageView) this.f993f;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        o4.b1 b1Var = new o4.b1(jArr, zArr2, imageView, imageView2, 12);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = wmVar.f51500u5.f1();
        tL_messages_rateTranscribedAudio.peer = wmVar.getMessagesController().m1(wmVar.f51500u5.f26868k.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = wmVar.f51500u5.f26868k.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        wmVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new y9(wmVar, b1Var, jArr, 4));
        org.telegram.messenger.g0.i3(b1Var, 150L);
    }

    private final void c() {
        hm hmVar = (hm) this.f991c;
        org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.f992e;
        zi ziVar = (zi) this.f990b;
        org.telegram.ui.s5 s5Var = (org.telegram.ui.s5) this.f993f;
        wm wmVar = hmVar.f45934a;
        if (((TLRPC.Message) this.d).suggested_post.schedule_date == 0) {
            s1VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.S(wmVar.getParentActivity(), 0L, new mi.d4(25, hmVar, ziVar), wmVar.getResourceProvider(), 1).f14429b;
            t2Var.show();
            t2Var.setOnDismissListener(s5Var);
            return;
        }
        wmVar.getMessagesController().v(ziVar.f26868k.f27022id, 0, org.telegram.messenger.m5.o(ziVar.f26868k.peer_id), null, false);
    }

    private final void e() {
        bo boVar = (bo) this.f991c;
        String str = (String) this.f992e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f990b;
        TLObject tLObject = (TLObject) this.d;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f993f;
        boVar.f44101i0 = 0;
        String str2 = boVar.f44102j0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                boVar.h.setText(bd.a0("LinkAvailable", null, 2131748932, str));
                boVar.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28234w6);
                boVar.f44104l0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                boVar.h.setText(bd.M0(2131743664, null));
                org.telegram.ui.ActionBar.r6.V(boVar.h.getTextView(), org.telegram.ui.ActionBar.k6.f28102p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    boVar.h.setText(bd.M0(2131743663, null));
                } else {
                    boVar.h.setText(bd.M0(2131743667, null));
                }
                org.telegram.ui.ActionBar.r6.V(boVar.h.getTextView(), org.telegram.ui.ActionBar.k6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                boVar.f44094d0 = false;
                boVar.f0();
            } else {
                boVar.h.setText(bd.M0(2131748920, null));
                boVar.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28102p7);
            }
            boVar.f44104l0 = false;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.t6.run():void");
    }

    public t6(ei.j4 j4Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, r8 r8Var) {
        this.f989a = 10;
        this.f991c = j4Var;
        this.d = runnable;
        this.f990b = tL_error;
        this.f992e = storyItem;
        this.f993f = r8Var;
    }

    public t6(o8 o8Var, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TLRPC.TL_error tL_error) {
        this.f989a = 13;
        this.f991c = o8Var;
        this.f992e = s1Var;
        this.d = tLObject;
        this.f993f = getgroupcallstreamrtmpurl;
        this.f990b = tL_error;
    }

    public t6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.f989a = i3;
        this.f991c = obj;
        this.d = obj2;
        this.f992e = obj3;
        this.f990b = obj4;
        this.f993f = obj5;
    }

    public t6(Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error, int i3) {
        this.f989a = i3;
        this.f991c = obj;
        this.d = obj2;
        this.f992e = obj3;
        this.f993f = obj4;
        this.f990b = tL_error;
    }

    public t6(Object obj, Object obj2, TLObject tLObject, Object obj3, Object obj4, int i3) {
        this.f989a = i3;
        this.f991c = obj;
        this.f992e = obj2;
        this.d = tLObject;
        this.f990b = obj3;
        this.f993f = obj4;
    }

    public t6(org.telegram.ui.ActionBar.d2 d2Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, int i3) {
        this.f989a = i3;
        this.f991c = d2Var;
        this.f992e = str;
        this.f990b = tL_error;
        this.d = tLObject;
        this.f993f = tLObject2;
    }

    public t6(ip ipVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f989a = 29;
        this.f991c = ipVar;
        this.f990b = tL_error;
        this.d = inputCheckPasswordSRP;
        this.f992e = twoStepVerificationActivity;
        this.f993f = tL_channels_editCreator;
    }
}
