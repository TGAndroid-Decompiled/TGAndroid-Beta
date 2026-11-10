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
    public final int f4778a;
    public final Object f4779b;
    public final Object f4780c;
    public final Object d;
    public final Object f4781e;
    public final Object f4782f;

    public u0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f4778a = i7;
        this.f4780c = obj;
        this.d = obj2;
        this.f4781e = obj3;
        this.f4782f = obj4;
        this.f4779b = obj5;
    }

    private final void a() {
        org.telegram.ui.bd bdVar = (org.telegram.ui.bd) this.f4780c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4779b;
        TLObject tLObject = (TLObject) this.f4781e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f4782f;
        bdVar.X = 0;
        String str2 = bdVar.Y;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                bdVar.V.setText(org.telegram.messenger.id.a0("LinkAvailable", null, 2131748924, str));
                org.telegram.ui.Cells.b2 b2Var = bdVar.V;
                int i7 = org.telegram.ui.ActionBar.m6.f28244w6;
                b2Var.setTag(Integer.valueOf(i7));
                org.telegram.ui.ActionBar.t6.U(bdVar.V, i7, null);
                bdVar.f44009a0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                bdVar.V.setText(org.telegram.messenger.id.M0(2131743654, null));
                org.telegram.ui.ActionBar.t6.U(bdVar.V, org.telegram.ui.ActionBar.m6.f28111p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    bdVar.V.setText(org.telegram.messenger.id.M0(2131743653, null));
                } else {
                    bdVar.V.setText(org.telegram.messenger.id.M0(2131743657, null));
                }
                org.telegram.ui.ActionBar.t6.U(bdVar.V, org.telegram.ui.ActionBar.m6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.ui.ActionBar.t6.U(bdVar.V, org.telegram.ui.ActionBar.m6.f28111p7, null);
                bdVar.f44023k0 = false;
                bdVar.l0();
            } else {
                org.telegram.ui.ActionBar.t6.U(bdVar.V, org.telegram.ui.ActionBar.m6.f28111p7, null);
                bdVar.V.setText(org.telegram.messenger.id.M0(2131748912, null));
            }
            bdVar.f44009a0 = false;
        }
    }

    private final void b() {
        cn cnVar = (cn) this.f4780c;
        boolean[] zArr = (boolean[]) this.d;
        boolean[] zArr2 = (boolean[]) this.f4781e;
        ImageView imageView = (ImageView) this.f4782f;
        ImageView imageView2 = (ImageView) this.f4779b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) jArr, zArr2, (Object) imageView, (Object) imageView2, 6);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = cnVar.f44669t5.e1();
        tL_messages_rateTranscribedAudio.peer = cnVar.getMessagesController().m1(cnVar.f44669t5.f23266k.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = cnVar.f44669t5.f23266k.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        cnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.z9(cnVar, m6Var, jArr, 4));
        org.telegram.messenger.g0.i3(m6Var, 150L);
    }

    private final void c() {
        nm nmVar = (nm) this.f4780c;
        org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.f4781e;
        ij ijVar = (ij) this.f4782f;
        org.telegram.ui.q5 q5Var = (org.telegram.ui.q5) this.f4779b;
        cn cnVar = nmVar.f48227a;
        if (((TLRPC.Message) this.d).suggested_post.schedule_date == 0) {
            u1VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.u4.Q(cnVar.getParentActivity(), 0L, new ni.c(15, nmVar, ijVar), cnVar.getResourceProvider(), 1).f14325b;
            w2Var.show();
            w2Var.setOnDismissListener(q5Var);
            return;
        }
        cnVar.getMessagesController().v(ijVar.f23266k.f26981id, 0, org.telegram.messenger.m5.o(ijVar.f23266k.peer_id), null, false);
    }

    private final void d() {
        io ioVar = (io) this.f4780c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4779b;
        TLObject tLObject = (TLObject) this.f4781e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f4782f;
        ioVar.f46693h0 = 0;
        String str2 = ioVar.f46694i0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                ioVar.h.setText(org.telegram.messenger.id.a0("LinkAvailable", null, 2131748924, str));
                ioVar.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f28244w6);
                ioVar.f46696k0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                ioVar.h.setText(org.telegram.messenger.id.M0(2131743654, null));
                org.telegram.ui.ActionBar.t6.U(ioVar.h.getTextView(), org.telegram.ui.ActionBar.m6.f28111p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    ioVar.h.setText(org.telegram.messenger.id.M0(2131743653, null));
                } else {
                    ioVar.h.setText(org.telegram.messenger.id.M0(2131743657, null));
                }
                org.telegram.ui.ActionBar.t6.U(ioVar.h.getTextView(), org.telegram.ui.ActionBar.m6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                ioVar.f46686c0 = false;
                ioVar.f0();
            } else {
                ioVar.h.setText(org.telegram.messenger.id.M0(2131748912, null));
                ioVar.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f28111p7);
            }
            ioVar.f46696k0 = false;
        }
    }

    private final void f() {
        mp.d0((mp) this.f4780c, (TLRPC.TL_error) this.f4779b, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.f4781e, (TLRPC.TL_channels_editCreator) this.f4782f);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.u0.run():void");
    }

    public u0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i7) {
        this.f4778a = i7;
        this.f4780c = obj;
        this.d = obj2;
        this.f4779b = tL_error;
        this.f4781e = tLObject;
        this.f4782f = obj3;
    }

    public u0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i7) {
        this.f4778a = i7;
        this.f4780c = obj;
        this.f4779b = tL_error;
        this.d = obj2;
        this.f4781e = obj3;
        this.f4782f = tLObject;
    }

    public u0(Object obj, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLObject tLObject2, Object obj2, int i7) {
        this.f4778a = i7;
        this.f4780c = obj;
        this.f4781e = u1Var;
        this.d = tLObject;
        this.f4782f = tLObject2;
        this.f4779b = obj2;
    }

    public u0(org.telegram.ui.hb hbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f4778a = 21;
        this.f4780c = hbVar;
        this.d = tL_chatInviteExported;
        this.f4782f = tL_messages_exportedChatInvite;
        this.f4779b = zArr;
        this.f4781e = u1Var;
    }
}
