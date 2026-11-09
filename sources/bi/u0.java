package bi;

import android.widget.ImageView;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cn;
import org.telegram.ui.io;
import org.telegram.ui.mp;
import org.telegram.ui.nm;
public final class u0 implements Runnable {
    public final int f4777a;
    public final Object f4778b;
    public final Object f4779c;
    public final Object d;
    public final Object f4780e;
    public final Object f4781f;

    public u0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f4777a = i7;
        this.f4779c = obj;
        this.d = obj2;
        this.f4780e = obj3;
        this.f4781f = obj4;
        this.f4778b = obj5;
    }

    private final void a() {
        org.telegram.ui.bd bdVar = (org.telegram.ui.bd) this.f4779c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4778b;
        TLObject tLObject = (TLObject) this.f4780e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f4781f;
        bdVar.X = 0;
        String str2 = bdVar.Y;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                bdVar.V.setText(org.telegram.messenger.id.a0("LinkAvailable", null, 2131748924, str));
                org.telegram.ui.Cells.b2 b2Var = bdVar.V;
                int i7 = org.telegram.ui.ActionBar.l6.f28219w6;
                b2Var.setTag(Integer.valueOf(i7));
                org.telegram.ui.ActionBar.s6.U(bdVar.V, i7, null);
                bdVar.f43980a0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                bdVar.V.setText(org.telegram.messenger.id.M0(2131743654, null));
                org.telegram.ui.ActionBar.s6.U(bdVar.V, org.telegram.ui.ActionBar.l6.f28086p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    bdVar.V.setText(org.telegram.messenger.id.M0(2131743653, null));
                } else {
                    bdVar.V.setText(org.telegram.messenger.id.M0(2131743657, null));
                }
                org.telegram.ui.ActionBar.s6.U(bdVar.V, org.telegram.ui.ActionBar.l6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.ui.ActionBar.s6.U(bdVar.V, org.telegram.ui.ActionBar.l6.f28086p7, null);
                bdVar.f43994k0 = false;
                bdVar.l0();
            } else {
                org.telegram.ui.ActionBar.s6.U(bdVar.V, org.telegram.ui.ActionBar.l6.f28086p7, null);
                bdVar.V.setText(org.telegram.messenger.id.M0(2131748912, null));
            }
            bdVar.f43980a0 = false;
        }
    }

    private final void b() {
        cn cnVar = (cn) this.f4779c;
        boolean[] zArr = (boolean[]) this.d;
        boolean[] zArr2 = (boolean[]) this.f4780e;
        ImageView imageView = (ImageView) this.f4781f;
        ImageView imageView2 = (ImageView) this.f4778b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) jArr, zArr2, (Object) imageView, (Object) imageView2, 6);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = cnVar.f44628t5.e1();
        tL_messages_rateTranscribedAudio.peer = cnVar.getMessagesController().m1(cnVar.f44628t5.f23262k.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = cnVar.f44628t5.f23262k.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        cnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.z9(cnVar, m6Var, jArr, 4));
        org.telegram.messenger.g0.i3(m6Var, 150L);
    }

    private final void c() {
        nm nmVar = (nm) this.f4779c;
        org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.f4780e;
        ij ijVar = (ij) this.f4781f;
        org.telegram.ui.q5 q5Var = (org.telegram.ui.q5) this.f4778b;
        cn cnVar = nmVar.f48207a;
        if (((TLRPC.Message) this.d).suggested_post.schedule_date == 0) {
            u1VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.Q(cnVar.getParentActivity(), 0L, new ni.c(15, nmVar, ijVar), cnVar.getResourceProvider(), 1).f14323b;
            v2Var.show();
            v2Var.setOnDismissListener(q5Var);
            return;
        }
        cnVar.getMessagesController().v(ijVar.f23262k.f26977id, 0, org.telegram.messenger.m5.o(ijVar.f23262k.peer_id), null, false);
    }

    private final void d() {
        io ioVar = (io) this.f4779c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4778b;
        TLObject tLObject = (TLObject) this.f4780e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f4781f;
        ioVar.f46720h0 = 0;
        String str2 = ioVar.f46721i0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                ioVar.h.setText(org.telegram.messenger.id.a0("LinkAvailable", null, 2131748924, str));
                ioVar.h.setTextColorByKey(org.telegram.ui.ActionBar.l6.f28219w6);
                ioVar.f46723k0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                ioVar.h.setText(org.telegram.messenger.id.M0(2131743654, null));
                org.telegram.ui.ActionBar.s6.U(ioVar.h.getTextView(), org.telegram.ui.ActionBar.l6.f28086p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    ioVar.h.setText(org.telegram.messenger.id.M0(2131743653, null));
                } else {
                    ioVar.h.setText(org.telegram.messenger.id.M0(2131743657, null));
                }
                org.telegram.ui.ActionBar.s6.U(ioVar.h.getTextView(), org.telegram.ui.ActionBar.l6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                ioVar.f46713c0 = false;
                ioVar.f0();
            } else {
                ioVar.h.setText(org.telegram.messenger.id.M0(2131748912, null));
                ioVar.h.setTextColorByKey(org.telegram.ui.ActionBar.l6.f28086p7);
            }
            ioVar.f46723k0 = false;
        }
    }

    private final void f() {
        mp.d0((mp) this.f4779c, (TLRPC.TL_error) this.f4778b, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.f4780e, (TLRPC.TL_channels_editCreator) this.f4781f);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.u0.run():void");
    }

    public u0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i7) {
        this.f4777a = i7;
        this.f4779c = obj;
        this.d = obj2;
        this.f4778b = tL_error;
        this.f4780e = tLObject;
        this.f4781f = obj3;
    }

    public u0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i7) {
        this.f4777a = i7;
        this.f4779c = obj;
        this.f4778b = tL_error;
        this.d = obj2;
        this.f4780e = obj3;
        this.f4781f = tLObject;
    }

    public u0(Object obj, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLObject tLObject2, Object obj2, int i7) {
        this.f4777a = i7;
        this.f4779c = obj;
        this.f4780e = u1Var;
        this.d = tLObject;
        this.f4781f = tLObject2;
        this.f4778b = obj2;
    }

    public u0(org.telegram.ui.hb hbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f4777a = 21;
        this.f4779c = hbVar;
        this.d = tL_chatInviteExported;
        this.f4781f = tL_messages_exportedChatInvite;
        this.f4778b = zArr;
        this.f4780e = u1Var;
    }
}
