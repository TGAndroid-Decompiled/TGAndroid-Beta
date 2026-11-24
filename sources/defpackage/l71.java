package defpackage;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l71 extends b71 {
    public final o71 n;

    public l71(o71 o71Var) {
        super(o71Var, 3);
        this.n = o71Var;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        boolean z2;
        float f;
        f71 f71Var = (f71) s49Var.a;
        eba ebaVar = (eba) f71Var.b.getChildAt(0);
        u61 u61Var = ((h71) this.e.get(i)).d;
        if (u61Var == f71Var.getTag()) {
            z = true;
        } else {
            z = false;
        }
        if (i != this.e.size() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        f71Var.setTag(u61Var);
        o71 o71Var = this.n;
        k27 k27Var = u61Var.f;
        if (k27Var == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long e = y6c.h(o71Var.e.getCurrentAccount()).e();
            tL_peerUser.user_id = e;
            peer.user_id = e;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = u61Var.a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = u61Var.b;
            String D = ba4.D(u61Var.a);
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
            document2.size = u61Var.c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (u61Var.e == null) {
                gn5 gn5Var = new gn5();
                u61Var.e = gn5Var;
                gn5Var.b = true;
                Utilities.e.c(new fv0(o71Var, u61Var, tL_documentAttributeAudio, (byte) 10));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = u61Var.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            k27 k27Var2 = new k27(o71Var.e.getCurrentAccount(), tL_message, false, false);
            u61Var.f = k27Var2;
            k27Var2.z0 = true;
            k27Var = k27Var2;
        }
        ebaVar.f(k27Var, z2);
        boolean z3 = u61Var.e.b;
        boolean z4 = !z3;
        if (!z) {
            if (!z3) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ebaVar.h0 = f;
        }
        if (ebaVar.g0 != z4) {
            ebaVar.g0 = z4;
            ebaVar.invalidate();
        }
        f71Var.d = z2;
        f71Var.c.setText(gl.i0(u61Var.c, false, false));
        f71Var.a.a(this.n.h.j.contains(u61Var), z);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        f71 f71Var = new f71(this, viewGroup.getContext(), (byte) 1);
        f71Var.e = (byte) 3;
        k71 k71Var = new k71(this, viewGroup.getContext(), f71Var);
        k71Var.setCheckForButtonPress(true);
        f71Var.b.addView(k71Var);
        return new s49(f71Var);
    }
}
