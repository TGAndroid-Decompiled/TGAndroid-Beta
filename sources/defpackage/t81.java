package defpackage;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t81 extends i81 {
    public final w81 n;

    public t81(w81 w81Var) {
        super(w81Var, 3);
        this.n = w81Var;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        boolean z2;
        float f;
        n81 n81Var = (n81) u69Var.a;
        eda edaVar = (eda) n81Var.b.getChildAt(0);
        b81 b81Var = ((p81) this.e.get(i)).d;
        if (b81Var == n81Var.getTag()) {
            z = true;
        } else {
            z = false;
        }
        if (i != this.e.size() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        n81Var.setTag(b81Var);
        w81 w81Var = this.n;
        k47 k47Var = b81Var.f;
        if (k47Var == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long e = z8c.h(w81Var.e.getCurrentAccount()).e();
            tL_peerUser.user_id = e;
            peer.user_id = e;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = b81Var.a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = b81Var.b;
            String D = bc4.D(b81Var.a);
            TLRPC.Document document = tL_message.media.document;
            document.id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (D.length() <= 0) {
                D = "mp3";
            }
            document.mime_type = "audio/".concat(D);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = b81Var.c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (b81Var.e == null) {
                gp5 gp5Var = new gp5();
                b81Var.e = gp5Var;
                gp5Var.b = true;
                Utilities.e.c(new tv0(w81Var, b81Var, tL_documentAttributeAudio, (byte) 11));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = b81Var.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            k47 k47Var2 = new k47(w81Var.e.getCurrentAccount(), tL_message, false, false);
            b81Var.f = k47Var2;
            k47Var2.z0 = true;
            k47Var = k47Var2;
        }
        edaVar.f(k47Var, z2);
        boolean z3 = b81Var.e.b;
        boolean z4 = !z3;
        if (!z) {
            if (!z3) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            edaVar.h0 = f;
        }
        if (edaVar.g0 != z4) {
            edaVar.g0 = z4;
            edaVar.invalidate();
        }
        n81Var.d = z2;
        n81Var.c.setText(gm.i0(b81Var.c, false, false));
        n81Var.a.a(this.n.h.j.contains(b81Var), z);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        n81 n81Var = new n81(this, viewGroup.getContext(), (byte) 1);
        n81Var.e = (byte) 3;
        s81 s81Var = new s81(this, viewGroup.getContext(), n81Var);
        s81Var.setCheckForButtonPress(true);
        n81Var.b.addView(s81Var);
        return new u69(n81Var);
    }
}
